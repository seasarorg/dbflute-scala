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
        if (!templateFile.getName().equals("BaseEntity.vm")) { // #provisional
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
        String trimmedWork = work.trim();
        if (isFieldLine(line)) {
            work = filterFieldLine(line, work, trimmedWork);
        } else if (isMethodLine(work)) {
            final String accessModifier = Srl.substringFirstFront(trimmedWork, " ");
            work = filterMethodLine(work, accessModifier);
        }
        return work;
    }

    // -----------------------------------------------------
    //                                           Method Line
    //                                           -----------
    protected boolean isMethodLine(String line) {
        return Srl.containsAny(line, "public", "protected", "private") && line.contains(") {");
    }

    protected String filterMethodLine(String line, final String accessModifier) {
        String work = replace(line, ", ", ",");
        work = doFilterMethodDefAndReturn(line, accessModifier, work);
        work = doFilterMethodArgument(line, accessModifier, work);
        work = replace(work, ",", ", ");
        return work;
    }

    protected String doFilterMethodDefAndReturn(String line, String accessModifier, String work) {
        final String javaReturnType = extractDefinedClassType(line, accessModifier, work);
        final String scalaReturnType = filterType(javaReturnType);
        final String scalaReturnExp = "): " + scalaReturnType + " = {";
        final String scalaDef = (!accessModifier.equals("public") ? (accessModifier + " ") : "") + "def";
        return replace(replace(work, accessModifier + " " + javaReturnType, scalaDef), ") {", scalaReturnExp);
    }

    protected String extractDefinedClassType(String line, String accessModifier, String work) {
        final String afterModifier;
        if (work.contains(accessModifier + " ")) {
            afterModifier = Srl.substringFirstRear(work, accessModifier + " ");
        } else {
            log(work);
            throw new IllegalStateException("No way: " + work);
        }
        return Srl.substringFirstFront(afterModifier, " ");
    }

    protected String doFilterMethodArgument(String line, String accessModifier, String work) {
        String args = Srl.substringFirstFront(Srl.substringFirstRear(work, "("), ")");
        StringBuilder sb = new StringBuilder();
        if (!args.isEmpty()) {
            List<String> argElementList = splitList(args, ",");
            for (String argElement : argElementList) {
                List<String> argDefList = splitList(argElement, " ");
                if (argDefList.size() != 2) {
                    String msg = "Unknown argument definition: " + argDefList.size() + ", " + line;
                    throw new IllegalStateException(msg);
                }
                if (sb.length() > 0) {
                    sb.append(",");
                }
                String dataType = argDefList.get(0);
                String variable = argDefList.get(1);
                sb.append(variable).append(": ").append(filterType(dataType));
            }
        }
        String front = Srl.substringFirstFront(work, "(");
        String rear = Srl.substringFirstRear(work, ")");
        return front + "(" + sb.toString() + ")" + rear;
    }

    protected String filterType(String typeExp) {
        if (typeExp.equals("void")) {
            return "Unit";
        }
        if (typeExp.equals("boolean")) {
            return "Boolean";
        }
        if (typeExp.equals("int")) {
            return "Integer";
        }
        return replace(replace(typeExp, "<", "["), ">", "]");
    }

    // -----------------------------------------------------
    //                                           Field Line
    //                                           -----------
    protected boolean isFieldLine(String line) {
        if (!Srl.containsAny(line, "public", "protected", "private")) {
            return false;
        }
        return line.endsWith(";") || line.contains("; //") || Srl.containsAll(line, ";", "=");
    }

    protected String filterFieldLine(String line, String work, String trimmedWork) {
        final String accessModifier = Srl.substringFirstFront(trimmedWork, " ");
        final String indentSpace = Srl.substringFirstFront(work, accessModifier);
        final String afterModifier = Srl.substringFirstRear(trimmedWork, " ");
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
        if (variableElementList.size() != 2) {
            String msg = "Unknown argument definition: " + variableElementList.size() + ", " + line;
            throw new IllegalStateException(msg);
        }
        String type = filterType(variableElementList.get(0));
        String variable = variableElementList.get(1);
        String suffix;
        if (rear.contains("=")) {
            suffix = " =" + Srl.substringFirstRear(rear, "=");
        } else {
            if (type.equals("Boolean")) {
                suffix = " = false;";
            } else {
                suffix = " = null;";
            }
        }
        work = indentSpace + accessModifier + " " + valOrVar + " " + variable + ": " + type + suffix;
        return work;
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
        final String outputPath = getMigratedPath() + "/scala/" + relativePath;
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
