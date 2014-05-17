/*
 * Copyright 2004-2014 the Seasar Foundation and the Others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package org.dbflute.scala.migration;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.seasar.dbflute.infra.manage.refresh.DfRefreshResourceRequest;
import org.seasar.dbflute.unit.core.PlainTestCase;
import org.seasar.dbflute.unit.core.filesystem.FileLineHandler;
import org.seasar.dbflute.unit.core.policestory.miscfile.PoliceStoryMiscFileHandler;
import org.seasar.dbflute.util.Srl;
import org.seasar.dbflute.util.Srl.ScopeInfo;

/**
 * @author jflute
 */
public class ToolsMigrationFirstStepTest extends PlainTestCase {

    // ===================================================================================
    //                                                                           Migration
    //                                                                           =========
    public void test_making() throws Exception {
        final Map<String, File> templateMap = collectTemplateMap();
        for (Entry<String, File> entry : templateMap.entrySet()) {
            final String relativePath = entry.getKey();
            final File templateFile = entry.getValue();
            migrateToScala(relativePath, templateFile);
        }
    }

    protected void migrateToScala(final String relativePath, final File templateFile) throws IOException {
        if (relativePath.contains("allcommon")) { // #provisional
            return;
        }
        final StringBuilder sb = new StringBuilder();
        readLine(templateFile, "UTF-8", new FileLineHandler() {
            public void handle(String line) {
                String filtered = filterLine(relativePath, templateFile, line);
                if (filtered != null) {
                    sb.append(filtered);
                    sb.append(ln());
                }
            }
        });
        final String contents = sb.toString();
        log(ln() + contents);

        writeContents(relativePath, contents);
    }

    // ===================================================================================
    //                                                                         Filter Line
    //                                                                         ===========
    protected String filterLine(String relativePath, File templateFile, String line) {
        if (line.startsWith("#")) { // velocity line
            return line;
        }
        if (line.contains("Serial version UID") || line.contains("serialVersionUID")) {
            return null;
        }
        String work = line;
        if (!line.trim().startsWith("* ")) { // not comment
            if (isClassDefLine(line)) {
                work = doFilterClassDefLine(line, work);
            } else if (isFieldLine(line)) {
                work = filterFieldLine(line, work);
            } else if (isMethodLine(line)) {
                final String accessModifier = Srl.substringFirstFront(line.trim(), " ");
                work = filterMethodLine(work, accessModifier);
            } else if (isReturnLine(line)) {
                String indentOfReturn = Srl.substringFirstFront(work, "return ");
                String rearOfReturn = Srl.substringFirstRear(work, "return ");
                if (isReturnDownCastLine(rearOfReturn)) {
                    work = filterReturnDownCastLine(indentOfReturn, rearOfReturn);
                }
            } else if (isLocalVariableLine(line)) {
                work = filterLocalVariableLine(line, work);
            }
        }
        work = filterClassLiteral(line, work);
        work = filterCoin(line, work);
        return work;
    }

    // -----------------------------------------------------
    //                                 Class Definition Line
    //                                 ---------------------
    protected boolean isClassDefLine(String line) {
        return line.trim().startsWith("public") && (line.contains(" class ") || line.contains(" interface "));
    }

    protected String doFilterClassDefLine(String line, String work) {
        work = replace(work, "public ", "");
        if (work.contains(" implements ")) {
            if (work.contains(" extends ")) {
                work = replace(work, " implements ", " with ");
            } else {
                work = replace(work, " implements ", " extends ");
            }
            work = replace(work, ", ", " with ");
        }
        return work;
    }

    // -----------------------------------------------------
    //                                            Field Line
    //                                            ----------
    protected boolean isFieldLine(String line) {
        line = Srl.substringLastFront(line, "//");
        if (line.trim().startsWith("$database")) {
            return false;
        }
        if (!Srl.containsAny(line, "public", "protected", "private")) {
            return false;
        }
        if (Srl.containsAny(line, ") {", " abstract ")) {
            return false;
        }
        if (line.endsWith(";") && !line.contains(" = ") && !Srl.containsAll(line, "(", ")")) {
            return true;
        }
        return line.contains("; //") || Srl.containsAll(line, ";", "=");
    }

    protected String filterFieldLine(String line, String work) {
        boolean existsVolatile = false;
        if (work.contains(" volatile ")) {
            existsVolatile = true;
            work = replace(work, " volatile ", " ");
        }
        work = replace(work, ", ", ",");
        work = replace(work, " extends ", "@@@extends@@@");
        work = replace(work, " super ", "@@@super@@@");
        work = doFilterFieldLine(line, work);
        work = replace(work, ",", ", ");
        work = replace(work, "@@@extends@@@", " <: ");
        work = replace(work, "@@@super@@@", " >: ");
        work = replace(work, "? <:", "_ <:");
        work = replace(work, "? >:", "_ >:");
        work = replace(work, "[?]", "[_]");
        if (existsVolatile) {
            work = "    @volatile\n" + work;
        }
        return work;
    }

    protected String doFilterFieldLine(String line, String work) {
        final String accessModifier = Srl.substringFirstFront(work.trim(), " ");
        final String indentSpace = Srl.substringFirstFront(work, accessModifier);
        final String afterModifier = Srl.substringFirstRear(work.trim(), " ");
        String valOrVar;
        String rear;
        if (afterModifier.contains("final ")) {
            valOrVar = "val";
            rear = Srl.substringFirstRear(afterModifier, "final ");
        } else {
            valOrVar = "var";
            rear = Srl.ltrim(afterModifier, "static ");
        }
        String variableDef = Srl.substringFirstFront(rear, ";", "=");
        List<String> variableElementList = splitListTrimmed(variableDef.trim(), " ");
        if (variableElementList.size() > 2) {
            String msg = "Unknown argument definition: " + variableElementList.size() + ", " + line;
            throw new IllegalStateException(msg);
        }
        String type = null;
        String varDef;
        if (variableElementList.size() > 1) {
            type = filterType(variableElementList.get(0));
            String variable = variableElementList.get(1);
            varDef = variable + ": " + type;
        } else {
            varDef = variableElementList.get(0);
        }
        String suffix;
        if (rear.contains("=")) {
            suffix = " =" + Srl.substringFirstRear(rear, "=");
        } else {
            if (type != null && type.equals("Boolean")) {
                suffix = " = false;";
            } else {
                suffix = " = null;";
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(indentSpace);
        if (!accessModifier.equals("public")) {
            sb.append(accessModifier).append(" ");
        }
        sb.append(valOrVar).append(" ").append(varDef).append(suffix);
        return sb.toString();
    }

    // -----------------------------------------------------
    //                                           Method Line
    //                                           -----------
    protected boolean isMethodLine(String line) {
        if (!Srl.containsAny(line, "public", "protected", "private", "Modifier} ")) {
            return false;
        }
        String afterModifier = Srl.substringFirstRear(line.trim(), " ");
        if (Srl.count(Srl.substringFirstFront(afterModifier, "("), " ") == 0) {
            return false; // may be constructor
        }
        if (line.contains(") {")) {
            return true;
        }
        if (Srl.containsAll(line, "(", ")", "delegate")) {
            return true;
        }
        return false;
    }

    protected String filterMethodLine(String line, final String accessModifier) {
        String work = replace(line, ", ", ",");
        work = replace(work, "final ", "");
        work = replace(work, " extends ", "@@@extends@@@");
        work = doFilterMethodDefAndReturn(line, accessModifier, work);
        work = doFilterMethodArgument(line, accessModifier, work);
        work = replace(work, ",", ", ");
        work = replace(work, "@@@extends@@@", " <: ");
        work = replace(work, "? <:", "_ <:");
        work = replace(work, "? >:", "_ >:");
        work = replace(work, "[?]", "[_]");
        return work;
    }

    protected String doFilterMethodDefAndReturn(String line, String accessModifier, String work) {
        String javaReturnType = extractDefinedReturnType(line, accessModifier, work);
        String genericType = extractDefinedGenericType(line, accessModifier, work);
        String scalaReturnType = filterType(javaReturnType);
        String scalaReturnExp = "): " + scalaReturnType + " = {";
        String scalaDef = (!accessModifier.equals("public") ? (accessModifier + " ") : "") + "def";
        work = replace(work, accessModifier + " " + genericType + javaReturnType, scalaDef);
        work = replace(work, ") {", scalaReturnExp);
        if (!genericType.isEmpty()) {
            String frontOfArg = Srl.substringFirstFront(work, "(");
            String newGeneric = "[" + Srl.extractScopeWide(genericType, "<", ">").getContent() + "]";
            work = replace(work, frontOfArg, frontOfArg + newGeneric);
        }
        return work;
    }

    protected String extractDefinedReturnType(String line, String accessModifier, String work) {
        final String afterModifier;
        if (work.contains(accessModifier + " ")) {
            afterModifier = Srl.substringFirstRear(work, accessModifier + " ");
        } else {
            log(work);
            throw new IllegalStateException("No way: " + work);
        }
        if (afterModifier.startsWith("<")) {
            String afterGeneric = Srl.substringFirstRear(afterModifier, "> ");
            return Srl.substringFirstFront(afterGeneric, " ");
        }
        return Srl.substringFirstFront(afterModifier, " ");
    }

    protected String extractDefinedGenericType(String line, String accessModifier, String work) {
        final String afterModifier;
        if (work.contains(accessModifier + " ")) {
            afterModifier = Srl.substringFirstRear(work, accessModifier + " ");
        } else {
            log(work);
            throw new IllegalStateException("No way: " + work);
        }
        if (afterModifier.startsWith("<")) {
            return "<" + Srl.substringFirstFront(Srl.substringFirstRear(afterModifier, "<"), "> ") + "> ";
        }
        return "";
    }

    protected String doFilterMethodArgument(String line, String accessModifier, String work) {
        String args = Srl.substringFirstFront(Srl.substringFirstRear(work, "("), ")");
        args = replace(args, "final ", "");

        StringBuilder sb = new StringBuilder();
        if (!args.isEmpty()) {
            List<String> argElementList = splitList(args, ",");
            String previous = null;
            for (String argElement : argElementList) {
                String current = (previous != null ? previous + "," : "") + argElement;
                if (current.contains("<") && !current.contains(">")) {
                    previous = current;
                    continue;
                }
                previous = null;
                List<String> argDefList = splitList(current, " ");
                if (sb.length() > 0) {
                    sb.append(",");
                }
                if (argDefList.size() > 1) {
                    String dataType = argDefList.get(0);
                    String variable = argDefList.get(1);
                    if (argDefList.size() > 2) {
                        List<String> rearList = argDefList.subList(2, argDefList.size());
                        sb.append("@@@").append(rearList).append("@@@");
                    }
                    sb.append(variable).append(": ").append(filterType(dataType));
                } else {
                    sb.append(argDefList.get(0));
                }
            }
        }
        String front = Srl.substringFirstFront(work, "(");
        String rear = Srl.substringFirstRear(work, ")");
        return front + "(" + sb.toString() + ")" + rear;
    }

    // -----------------------------------------------------
    //                                   Local Variable Line
    //                                   -------------------
    protected boolean isLocalVariableLine(String line) {
        if (line.trim().startsWith("$database")) {
            return false;
        }
        if (Srl.containsAll(line, "final ", " = ", ";")) {
            return true;
        }
        if (Srl.containsAll(line, " = ", ";")) { // not final
            return Srl.count(Srl.substringFirstFront(line.trim(), " = "), " ") == 1;
        }
        return false;
    }

    protected String filterLocalVariableLine(String line, String work) {
        work = replace(work, ", ", ",");
        work = replace(work, " extends ", "@@@extends@@@");
        work = doFilterLocalVariableLine(line, work);
        work = replace(work, ",", ", ");
        work = replace(work, "@@@extends@@@", " <: ");
        work = replace(work, "? <:", "_ <:");
        work = replace(work, "? >:", "_ >:");
        work = replace(work, "[?]", "[_]");
        return work;
    }

    protected String doFilterLocalVariableLine(String line, String work) {
        work = replace(work, "final ", "");
        work = replace(work, ", ", ",");
        String frontOfEqual = Srl.substringFirstFront(work.trim(), " = ");
        List<String> variableElementList = Srl.splitList(frontOfEqual, " ");
        if (variableElementList.size() > 2) {
            String msg = "Unknown argument definition: " + variableElementList.size() + ", " + line;
            throw new IllegalStateException(msg);
        }
        String indent;
        String varDef;
        if (variableElementList.size() > 1) {
            String type = filterType(variableElementList.get(0));
            String variable = variableElementList.get(1);
            indent = Srl.substringFirstFront(work, type);
            varDef = "val " + variable + ": " + type;
        } else {
            String onlyOneExp = variableElementList.get(0);
            indent = Srl.substringFirstFront(work, onlyOneExp);
            varDef = "val " + onlyOneExp;
        }
        String rear = Srl.substringFirstRear(work, " = ");
        return replace(indent + varDef + " = " + rear, ",", ", ");
    }

    // -----------------------------------------------------
    //                                           Return Line
    //                                           -----------
    protected boolean isReturnLine(String line) {
        return line.trim().startsWith("return ");
    }

    protected boolean isReturnDownCastLine(String rearOfReturn) {
        return rearOfReturn.startsWith("(") && rearOfReturn.contains(")") && rearOfReturn.endsWith(";");
    }

    protected String filterReturnDownCastLine(String indent, String rear) {
        ScopeInfo wide = Srl.extractScopeWide(rear, "(", ")");
        String type = wide.getContent();
        String endMarkRear = rear.substring(wide.getEndIndex());
        String variable = Srl.extractScopeFirst(endMarkRear, ")", ";").getContent();
        return indent + "return " + variable + ".asInstanceOf[" + filterType(type) + "];";
    }

    // -----------------------------------------------------
    //                                        Various Filter
    //                                        --------------
    protected String filterClassLiteral(String line, String work) {
        if (work.contains("}.class")) {
            String front = Srl.substringFirstFront(work, "}.class");
            String suffix = Srl.substringFirstRear(work, "}.class");
            String prefix = Srl.substringLastFront(front, "${");
            String type = "${" + Srl.substringLastRear(front, "${") + "}";
            return prefix + "classOf[" + filterType(type) + "]" + suffix;
        }
        return work;
    }

    protected String filterCoin(String line, String work) {
        work = replace(work, "new int[]{}", "new Array[Integer](0)");
        work = replace(work, "int[] = {", "Array[Integer] = {");
        work = replace(work, "<ENTITY, ${myConditionBeanClassName}>()", "[ENTITY, ${myConditionBeanClassName}]()");
        work = replace(work, "<String, Object>()", "[String, Object]()");
        work = replace(work, ".getInstance()", "");
        work = replace(work, "String[]", "Array[String]");
        work = replace(work, "new ArrayList<ELEMENT>", "new ArrayList[ELEMENT]");
        work = replace(work, "protected static final ", "protected val ");
        if (line.startsWith("import ")) {
            work = replace(work, ".*;", "._;");
        }
        work = replace(work, "synchronized (this) {", "this.synchronized {");
        return work;
    }

    // -----------------------------------------------------
    //                                           Type Filter
    //                                           -----------
    protected String filterType(String type) {
        if (type.equals("void")) {
            return "Unit";
        }
        if (type.equals("boolean")) {
            return "Boolean";
        }
        if (type.equals("int")) {
            return "Integer";
        }
        return replace(replace(type, "<", "["), ">", "]");
    }

    // ===================================================================================
    //                                                                             Collect
    //                                                                             =======
    protected Map<String, File> collectTemplateMap() throws IOException {
        final Map<String, File> templateMap = newLinkedHashMap();
        policeStoryOfMiscFileChase(new PoliceStoryMiscFileHandler() {
            public void handle(File miscFile) {
                final String plainPath = replace(miscFile.getPath(), "\\", "/");
                final String relativePath = Srl.substringLastRear(plainPath, "/om/java/");
                log(relativePath);
                templateMap.put(relativePath, miscFile);
            }
        }, new File(getDBFluteModulePath() + "/templates/om/java"));
        return templateMap;
    }

    // ===================================================================================
    //                                                                               Write
    //                                                                               =====
    protected void writeContents(String relativePath, final String contents) throws IOException,
            UnsupportedEncodingException, FileNotFoundException {
        final String outputPath = getMigratedPath() + "/scala/" + relativePath + "cala";
        final File outputBaseDir = new File(Srl.substringLastFront(outputPath, "/"));
        if (!outputBaseDir.exists()) {
            outputBaseDir.mkdirs();
        }
        final File outputFile = new File(outputPath);
        final FileOutputStream stream = new FileOutputStream(outputFile);
        final BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(stream, "UTF-8"));
        try {
            writer.write(contents);
        } finally {
            writer.close();
        }
    }

    // ===================================================================================
    //                                                                             Refresh
    //                                                                             =======
    protected void refreshMigrationProject() throws IOException {
        final List<String> projectNameList = Arrays.asList(getScalaExampleProjectName());
        new DfRefreshResourceRequest(projectNameList, "http://localhost:8386/").refreshResources();
    }

    // ===================================================================================
    //                                                                       Path Handling
    //                                                                       =============
    protected String getMigratedPath() throws IOException {
        return getMyDBFlutePath() + "/migrated";
    }

    protected String getDBFluteModulePath() throws IOException {
        return getMyDBFlutePath() + "/dbflute-1.x";
    }

    protected String getMyDBFlutePath() throws IOException {
        final File repositryDir = getProjectDir().getParentFile();
        final String projectPath = repositryDir + "/" + getScalaExampleProjectName();
        return projectPath + "/mydbflute";
    }

    protected String getScalaExampleProjectName() {
        return "dbflute-scala-example";
    }
}
