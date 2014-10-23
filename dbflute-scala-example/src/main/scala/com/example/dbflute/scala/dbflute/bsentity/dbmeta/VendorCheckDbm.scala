package com.example.dbflute.scala.dbflute.bsentity.dbmeta;

// #avoided same name type in Java and Scala
import java.lang.Long;
import java.lang.Boolean;
import java.math.BigDecimal;

import java.util.List;
import java.util.Map;
import java.util.HashMap

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.AbstractDBMeta._;
import org.seasar.dbflute.dbmeta.DBMeta.OptimisticLockType
import org.seasar.dbflute.dbmeta.property.PropertyGateway;
import org.seasar.dbflute.dbmeta.info._;
import org.seasar.dbflute.dbmeta.name._;
import org.seasar.dbflute.jdbc.Classification;
import com.example.dbflute.scala.dbflute.allcommon._;
import com.example.dbflute.scala.dbflute.exentity._;

/**
 * The DB meta of VENDOR_CHECK. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
object VendorCheckDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    def getCurrentDBDef(): DBDef = { return DBCurrent.currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected val _epgMap: Map[String, PropertyGateway] = newHashMap();
    {
        setupEpg(_epgMap, new EpgVendorCheckId(), "vendorCheckId");
        setupEpg(_epgMap, new EpgTypeOfChar(), "typeOfChar");
        setupEpg(_epgMap, new EpgTypeOfVarchar(), "typeOfVarchar");
        setupEpg(_epgMap, new EpgTypeOfClob(), "typeOfClob");
        setupEpg(_epgMap, new EpgTypeOfText(), "typeOfText");
        setupEpg(_epgMap, new EpgTypeOfNumericInteger(), "typeOfNumericInteger");
        setupEpg(_epgMap, new EpgTypeOfNumericBigint(), "typeOfNumericBigint");
        setupEpg(_epgMap, new EpgTypeOfNumericDecimal(), "typeOfNumericDecimal");
        setupEpg(_epgMap, new EpgTypeOfNumericIntegerMin(), "typeOfNumericIntegerMin");
        setupEpg(_epgMap, new EpgTypeOfNumericIntegerMax(), "typeOfNumericIntegerMax");
        setupEpg(_epgMap, new EpgTypeOfNumericBigintMin(), "typeOfNumericBigintMin");
        setupEpg(_epgMap, new EpgTypeOfNumericBigintMax(), "typeOfNumericBigintMax");
        setupEpg(_epgMap, new EpgTypeOfNumericSuperintMin(), "typeOfNumericSuperintMin");
        setupEpg(_epgMap, new EpgTypeOfNumericSuperintMax(), "typeOfNumericSuperintMax");
        setupEpg(_epgMap, new EpgTypeOfNumericMaxdecimal(), "typeOfNumericMaxdecimal");
        setupEpg(_epgMap, new EpgTypeOfInteger(), "typeOfInteger");
        setupEpg(_epgMap, new EpgTypeOfBigint(), "typeOfBigint");
        setupEpg(_epgMap, new EpgTypeOfDate(), "typeOfDate");
        setupEpg(_epgMap, new EpgTypeOfTimestamp(), "typeOfTimestamp");
        setupEpg(_epgMap, new EpgTypeOfTime(), "typeOfTime");
        setupEpg(_epgMap, new EpgTypeOfBoolean(), "typeOfBoolean");
        setupEpg(_epgMap, new EpgTypeOfBinary(), "typeOfBinary");
        setupEpg(_epgMap, new EpgTypeOfBlob(), "typeOfBlob");
        setupEpg(_epgMap, new EpgTypeOfUuid(), "typeOfUuid");
        setupEpg(_epgMap, new EpgTypeOfArray(), "typeOfArray");
        setupEpg(_epgMap, new EpgTypeOfOther(), "typeOfOther");
        setupEpg(_epgMap, new EpgJAVABeansProperty(), "JAVABeansProperty");
        setupEpg(_epgMap, new EpgJPopBeansProperty(), "JPopBeansProperty");
    }
    class EpgVendorCheckId extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleVendorCheck].getVendorCheckId(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleVendorCheck].setVendorCheckId(dgctl(vl)); }
    }
    class EpgTypeOfChar extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleVendorCheck].getTypeOfChar(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleVendorCheck].setTypeOfChar(vl.asInstanceOf[String]); }
    }
    class EpgTypeOfVarchar extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleVendorCheck].getTypeOfVarchar(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleVendorCheck].setTypeOfVarchar(vl.asInstanceOf[String]); }
    }
    class EpgTypeOfClob extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleVendorCheck].getTypeOfClob(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleVendorCheck].setTypeOfClob(vl.asInstanceOf[String]); }
    }
    class EpgTypeOfText extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleVendorCheck].getTypeOfText(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleVendorCheck].setTypeOfText(vl.asInstanceOf[String]); }
    }
    class EpgTypeOfNumericInteger extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleVendorCheck].getTypeOfNumericInteger(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleVendorCheck].setTypeOfNumericInteger(dgcti(vl)); }
    }
    class EpgTypeOfNumericBigint extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleVendorCheck].getTypeOfNumericBigint(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleVendorCheck].setTypeOfNumericBigint(dgctl(vl)); }
    }
    class EpgTypeOfNumericDecimal extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleVendorCheck].getTypeOfNumericDecimal(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleVendorCheck].setTypeOfNumericDecimal(dgctb(vl)); }
    }
    class EpgTypeOfNumericIntegerMin extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleVendorCheck].getTypeOfNumericIntegerMin(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleVendorCheck].setTypeOfNumericIntegerMin(dgcti(vl)); }
    }
    class EpgTypeOfNumericIntegerMax extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleVendorCheck].getTypeOfNumericIntegerMax(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleVendorCheck].setTypeOfNumericIntegerMax(dgcti(vl)); }
    }
    class EpgTypeOfNumericBigintMin extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleVendorCheck].getTypeOfNumericBigintMin(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleVendorCheck].setTypeOfNumericBigintMin(dgctl(vl)); }
    }
    class EpgTypeOfNumericBigintMax extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleVendorCheck].getTypeOfNumericBigintMax(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleVendorCheck].setTypeOfNumericBigintMax(dgctl(vl)); }
    }
    class EpgTypeOfNumericSuperintMin extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleVendorCheck].getTypeOfNumericSuperintMin(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleVendorCheck].setTypeOfNumericSuperintMin(dgctb(vl)); }
    }
    class EpgTypeOfNumericSuperintMax extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleVendorCheck].getTypeOfNumericSuperintMax(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleVendorCheck].setTypeOfNumericSuperintMax(dgctb(vl)); }
    }
    class EpgTypeOfNumericMaxdecimal extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleVendorCheck].getTypeOfNumericMaxdecimal(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleVendorCheck].setTypeOfNumericMaxdecimal(dgctb(vl)); }
    }
    class EpgTypeOfInteger extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleVendorCheck].getTypeOfInteger(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleVendorCheck].setTypeOfInteger(dgcti(vl)); }
    }
    class EpgTypeOfBigint extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleVendorCheck].getTypeOfBigint(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleVendorCheck].setTypeOfBigint(dgctl(vl)); }
    }
    class EpgTypeOfDate extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleVendorCheck].getTypeOfDate(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleVendorCheck].setTypeOfDate(vl.asInstanceOf[org.joda.time.LocalDate]); }
    }
    class EpgTypeOfTimestamp extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleVendorCheck].getTypeOfTimestamp(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleVendorCheck].setTypeOfTimestamp(vl.asInstanceOf[org.joda.time.LocalDateTime]); }
    }
    class EpgTypeOfTime extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleVendorCheck].getTypeOfTime(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleVendorCheck].setTypeOfTime(vl.asInstanceOf[org.joda.time.LocalTime]); }
    }
    class EpgTypeOfBoolean extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleVendorCheck].getTypeOfBoolean(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleVendorCheck].setTypeOfBoolean(vl.asInstanceOf[Boolean]); }
    }
    class EpgTypeOfBinary extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleVendorCheck].getTypeOfBinary(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleVendorCheck].setTypeOfBinary(vl.asInstanceOf[Array[Byte]]); }
    }
    class EpgTypeOfBlob extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleVendorCheck].getTypeOfBlob(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleVendorCheck].setTypeOfBlob(vl.asInstanceOf[Array[Byte]]); }
    }
    class EpgTypeOfUuid extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleVendorCheck].getTypeOfUuid(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleVendorCheck].setTypeOfUuid(vl.asInstanceOf[Array[Byte]]); }
    }
    class EpgTypeOfArray extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleVendorCheck].getTypeOfArray(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleVendorCheck].setTypeOfArray(vl.asInstanceOf[String]); }
    }
    class EpgTypeOfOther extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleVendorCheck].getTypeOfOther(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleVendorCheck].setTypeOfOther(vl.asInstanceOf[String]); }
    }
    class EpgJAVABeansProperty extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleVendorCheck].getJAVABeansProperty(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleVendorCheck].setJAVABeansProperty(vl.asInstanceOf[String]); }
    }
    class EpgJPopBeansProperty extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleVendorCheck].getJPopBeansProperty(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleVendorCheck].setJPopBeansProperty(vl.asInstanceOf[String]); }
    }
    // #avoided delegating to protected static (illegal access error if directly call)
    def dgcti(vl: Object): Integer = { cti(vl); }
    def dgctl(vl: Object): Long = { ctl(vl); }
    def dgctb(vl: Object): BigDecimal = { ctb(vl); }
    def dgctn[NUMBER <: Number](vl: Object, tp: Class[NUMBER]): NUMBER = { ctn(vl, tp); }
    def dggcls(col: ColumnInfo, cd: Object): Classification = { gcls(col, cd); }
    def dgccls(col: ColumnInfo, cd: Object): Unit = { ccls(col, cd); }
    override def findPropertyGateway(prop: String): PropertyGateway = { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected val _tableDbName: String = "VENDOR_CHECK";
    protected val _tablePropertyName: String = "vendorCheck";
    protected val _tableSqlName: TableSqlName = new TableSqlName("VENDOR_CHECK", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getTableSqlNameFilter()); }
    def getTableDbName(): String = { return _tableDbName; }
    def getTablePropertyName(): String = { return _tablePropertyName; }
    def getTableSqlName(): TableSqlName = { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected val _columnVendorCheckId: ColumnInfo = cci("VENDOR_CHECK_ID", "VENDOR_CHECK_ID", null, null, classOf[Long], "vendorCheckId", null, true, false, true, "DECIMAL", 16, 0, null, false, null, null, null, null, null);
    protected val _columnTypeOfChar: ColumnInfo = cci("TYPE_OF_CHAR", "TYPE_OF_CHAR", null, null, classOf[String], "typeOfChar", null, false, false, false, "CHAR", 3, 0, null, false, null, null, null, null, null);
    protected val _columnTypeOfVarchar: ColumnInfo = cci("TYPE_OF_VARCHAR", "TYPE_OF_VARCHAR", null, null, classOf[String], "typeOfVarchar", null, false, false, false, "VARCHAR", 32, 0, null, false, null, null, null, null, null);
    protected val _columnTypeOfClob: ColumnInfo = cci("TYPE_OF_CLOB", "TYPE_OF_CLOB", null, null, classOf[String], "typeOfClob", null, false, false, false, "CLOB", 2147483647, 0, null, false, null, null, null, null, null);
    protected val _columnTypeOfText: ColumnInfo = cci("TYPE_OF_TEXT", "TYPE_OF_TEXT", null, null, classOf[String], "typeOfText", null, false, false, false, "CLOB", 2147483647, 0, null, false, null, null, null, null, null);
    protected val _columnTypeOfNumericInteger: ColumnInfo = cci("TYPE_OF_NUMERIC_INTEGER", "TYPE_OF_NUMERIC_INTEGER", null, null, classOf[Integer], "typeOfNumericInteger", null, false, false, false, "DECIMAL", 5, 0, null, false, null, null, null, null, null);
    protected val _columnTypeOfNumericBigint: ColumnInfo = cci("TYPE_OF_NUMERIC_BIGINT", "TYPE_OF_NUMERIC_BIGINT", null, null, classOf[Long], "typeOfNumericBigint", null, false, false, false, "DECIMAL", 12, 0, null, false, null, null, null, null, null);
    protected val _columnTypeOfNumericDecimal: ColumnInfo = cci("TYPE_OF_NUMERIC_DECIMAL", "TYPE_OF_NUMERIC_DECIMAL", null, null, classOf[java.math.BigDecimal], "typeOfNumericDecimal", null, false, false, false, "DECIMAL", 5, 3, null, false, null, null, null, null, null);
    protected val _columnTypeOfNumericIntegerMin: ColumnInfo = cci("TYPE_OF_NUMERIC_INTEGER_MIN", "TYPE_OF_NUMERIC_INTEGER_MIN", null, null, classOf[Integer], "typeOfNumericIntegerMin", null, false, false, false, "DECIMAL", 1, 0, null, false, null, null, null, null, null);
    protected val _columnTypeOfNumericIntegerMax: ColumnInfo = cci("TYPE_OF_NUMERIC_INTEGER_MAX", "TYPE_OF_NUMERIC_INTEGER_MAX", null, null, classOf[Integer], "typeOfNumericIntegerMax", null, false, false, false, "DECIMAL", 9, 0, null, false, null, null, null, null, null);
    protected val _columnTypeOfNumericBigintMin: ColumnInfo = cci("TYPE_OF_NUMERIC_BIGINT_MIN", "TYPE_OF_NUMERIC_BIGINT_MIN", null, null, classOf[Long], "typeOfNumericBigintMin", null, false, false, false, "DECIMAL", 10, 0, null, false, null, null, null, null, null);
    protected val _columnTypeOfNumericBigintMax: ColumnInfo = cci("TYPE_OF_NUMERIC_BIGINT_MAX", "TYPE_OF_NUMERIC_BIGINT_MAX", null, null, classOf[Long], "typeOfNumericBigintMax", null, false, false, false, "DECIMAL", 18, 0, null, false, null, null, null, null, null);
    protected val _columnTypeOfNumericSuperintMin: ColumnInfo = cci("TYPE_OF_NUMERIC_SUPERINT_MIN", "TYPE_OF_NUMERIC_SUPERINT_MIN", null, null, classOf[java.math.BigDecimal], "typeOfNumericSuperintMin", null, false, false, false, "DECIMAL", 19, 0, null, false, null, null, null, null, null);
    protected val _columnTypeOfNumericSuperintMax: ColumnInfo = cci("TYPE_OF_NUMERIC_SUPERINT_MAX", "TYPE_OF_NUMERIC_SUPERINT_MAX", null, null, classOf[java.math.BigDecimal], "typeOfNumericSuperintMax", null, false, false, false, "DECIMAL", 38, 0, null, false, null, null, null, null, null);
    protected val _columnTypeOfNumericMaxdecimal: ColumnInfo = cci("TYPE_OF_NUMERIC_MAXDECIMAL", "TYPE_OF_NUMERIC_MAXDECIMAL", null, null, classOf[java.math.BigDecimal], "typeOfNumericMaxdecimal", null, false, false, false, "DECIMAL", 38, 38, null, false, null, null, null, null, null);
    protected val _columnTypeOfInteger: ColumnInfo = cci("TYPE_OF_INTEGER", "TYPE_OF_INTEGER", null, null, classOf[Integer], "typeOfInteger", null, false, false, false, "INTEGER", 10, 0, null, false, null, null, null, null, null);
    protected val _columnTypeOfBigint: ColumnInfo = cci("TYPE_OF_BIGINT", "TYPE_OF_BIGINT", null, null, classOf[Long], "typeOfBigint", null, false, false, false, "BIGINT", 19, 0, null, false, null, null, null, null, null);
    protected val _columnTypeOfDate: ColumnInfo = cci("TYPE_OF_DATE", "TYPE_OF_DATE", null, null, classOf[org.joda.time.LocalDate], "typeOfDate", null, false, false, false, "DATE", 8, 0, null, false, null, null, null, null, null);
    protected val _columnTypeOfTimestamp: ColumnInfo = cci("TYPE_OF_TIMESTAMP", "TYPE_OF_TIMESTAMP", null, null, classOf[org.joda.time.LocalDateTime], "typeOfTimestamp", null, false, false, false, "TIMESTAMP", 23, 10, null, false, null, null, null, null, null);
    protected val _columnTypeOfTime: ColumnInfo = cci("TYPE_OF_TIME", "TYPE_OF_TIME", null, null, classOf[org.joda.time.LocalTime], "typeOfTime", null, false, false, false, "TIME", 6, 0, null, false, null, null, null, null, null);
    protected val _columnTypeOfBoolean: ColumnInfo = cci("TYPE_OF_BOOLEAN", "TYPE_OF_BOOLEAN", null, null, classOf[Boolean], "typeOfBoolean", null, false, false, false, "BOOLEAN", 1, 0, null, false, null, null, null, null, null);
    protected val _columnTypeOfBinary: ColumnInfo = cci("TYPE_OF_BINARY", "TYPE_OF_BINARY", null, null, classOf[Array[Byte]], "typeOfBinary", null, false, false, false, "VARBINARY", 2147483647, 0, null, false, null, null, null, null, null);
    protected val _columnTypeOfBlob: ColumnInfo = cci("TYPE_OF_BLOB", "TYPE_OF_BLOB", null, null, classOf[Array[Byte]], "typeOfBlob", null, false, false, false, "BLOB", 2147483647, 0, null, false, null, null, null, null, null);
    protected val _columnTypeOfUuid: ColumnInfo = cci("TYPE_OF_UUID", "TYPE_OF_UUID", null, null, classOf[Array[Byte]], "typeOfUuid", null, false, false, false, "UUID", 2147483647, 0, null, false, null, null, null, null, null);
    protected val _columnTypeOfArray: ColumnInfo = cci("TYPE_OF_ARRAY", "TYPE_OF_ARRAY", null, null, classOf[String], "typeOfArray", null, false, false, false, "ARRAY", null, null, null, false, null, null, null, null, null);
    protected val _columnTypeOfOther: ColumnInfo = cci("TYPE_OF_OTHER", "TYPE_OF_OTHER", null, null, classOf[String], "typeOfOther", null, false, false, false, "OTHER", 2147483647, 0, null, false, null, null, null, null, null);
    protected val _columnJAVABeansProperty: ColumnInfo = cci("J_A_V_A_BEANS_PROPERTY", "J_A_V_A_BEANS_PROPERTY", null, null, classOf[String], "JAVABeansProperty", null, false, false, false, "VARCHAR", 10, 0, null, false, null, null, null, null, null);
    protected val _columnJPopBeansProperty: ColumnInfo = cci("J_POP_BEANS_PROPERTY", "J_POP_BEANS_PROPERTY", null, null, classOf[String], "JPopBeansProperty", null, false, false, false, "VARCHAR", 10, 0, null, false, null, null, null, null, null);

    def columnVendorCheckId(): ColumnInfo = { return _columnVendorCheckId; }
    def columnTypeOfChar(): ColumnInfo = { return _columnTypeOfChar; }
    def columnTypeOfVarchar(): ColumnInfo = { return _columnTypeOfVarchar; }
    def columnTypeOfClob(): ColumnInfo = { return _columnTypeOfClob; }
    def columnTypeOfText(): ColumnInfo = { return _columnTypeOfText; }
    def columnTypeOfNumericInteger(): ColumnInfo = { return _columnTypeOfNumericInteger; }
    def columnTypeOfNumericBigint(): ColumnInfo = { return _columnTypeOfNumericBigint; }
    def columnTypeOfNumericDecimal(): ColumnInfo = { return _columnTypeOfNumericDecimal; }
    def columnTypeOfNumericIntegerMin(): ColumnInfo = { return _columnTypeOfNumericIntegerMin; }
    def columnTypeOfNumericIntegerMax(): ColumnInfo = { return _columnTypeOfNumericIntegerMax; }
    def columnTypeOfNumericBigintMin(): ColumnInfo = { return _columnTypeOfNumericBigintMin; }
    def columnTypeOfNumericBigintMax(): ColumnInfo = { return _columnTypeOfNumericBigintMax; }
    def columnTypeOfNumericSuperintMin(): ColumnInfo = { return _columnTypeOfNumericSuperintMin; }
    def columnTypeOfNumericSuperintMax(): ColumnInfo = { return _columnTypeOfNumericSuperintMax; }
    def columnTypeOfNumericMaxdecimal(): ColumnInfo = { return _columnTypeOfNumericMaxdecimal; }
    def columnTypeOfInteger(): ColumnInfo = { return _columnTypeOfInteger; }
    def columnTypeOfBigint(): ColumnInfo = { return _columnTypeOfBigint; }
    def columnTypeOfDate(): ColumnInfo = { return _columnTypeOfDate; }
    def columnTypeOfTimestamp(): ColumnInfo = { return _columnTypeOfTimestamp; }
    def columnTypeOfTime(): ColumnInfo = { return _columnTypeOfTime; }
    def columnTypeOfBoolean(): ColumnInfo = { return _columnTypeOfBoolean; }
    def columnTypeOfBinary(): ColumnInfo = { return _columnTypeOfBinary; }
    def columnTypeOfBlob(): ColumnInfo = { return _columnTypeOfBlob; }
    def columnTypeOfUuid(): ColumnInfo = { return _columnTypeOfUuid; }
    def columnTypeOfArray(): ColumnInfo = { return _columnTypeOfArray; }
    def columnTypeOfOther(): ColumnInfo = { return _columnTypeOfOther; }
    def columnJAVABeansProperty(): ColumnInfo = { return _columnJAVABeansProperty; }
    def columnJPopBeansProperty(): ColumnInfo = { return _columnJPopBeansProperty; }

    protected def ccil(): List[ColumnInfo] = {
        val ls: List[ColumnInfo] = newArrayList();
        ls.add(columnVendorCheckId());
        ls.add(columnTypeOfChar());
        ls.add(columnTypeOfVarchar());
        ls.add(columnTypeOfClob());
        ls.add(columnTypeOfText());
        ls.add(columnTypeOfNumericInteger());
        ls.add(columnTypeOfNumericBigint());
        ls.add(columnTypeOfNumericDecimal());
        ls.add(columnTypeOfNumericIntegerMin());
        ls.add(columnTypeOfNumericIntegerMax());
        ls.add(columnTypeOfNumericBigintMin());
        ls.add(columnTypeOfNumericBigintMax());
        ls.add(columnTypeOfNumericSuperintMin());
        ls.add(columnTypeOfNumericSuperintMax());
        ls.add(columnTypeOfNumericMaxdecimal());
        ls.add(columnTypeOfInteger());
        ls.add(columnTypeOfBigint());
        ls.add(columnTypeOfDate());
        ls.add(columnTypeOfTimestamp());
        ls.add(columnTypeOfTime());
        ls.add(columnTypeOfBoolean());
        ls.add(columnTypeOfBinary());
        ls.add(columnTypeOfBlob());
        ls.add(columnTypeOfUuid());
        ls.add(columnTypeOfArray());
        ls.add(columnTypeOfOther());
        ls.add(columnJAVABeansProperty());
        ls.add(columnJPopBeansProperty());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected def cpui(): UniqueInfo = { return hpcpui(columnVendorCheckId()); }
    def hasPrimaryKey(): scala.Boolean = { return true; }
    def hasCompoundPrimaryKey(): scala.Boolean = { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    def getEntityTypeName(): String = { return "com.example.dbflute.scala.dbflute.exentity.DbleVendorCheck"; }
    def getConditionBeanTypeName(): String = { return "com.example.dbflute.scala.dbflute.cbean.VendorCheckCB"; }
    def getBehaviorTypeName(): String = { return "com.example.dbflute.scala.dbflute.exbhv.VendorCheckBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    def getEntityType(): Class[DbleVendorCheck] = { return classOf[DbleVendorCheck]; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    def newEntity(): DbleVendorCheck = { return new DbleVendorCheck(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    def acceptPrimaryKeyMap(et: Entity, mp: Map[String, _]): Unit =
    { doAcceptPrimaryKeyMap(et.asInstanceOf[DbleVendorCheck], mp); }
    def acceptAllColumnMap(et: Entity, mp: Map[String, _]): Unit =
    { doAcceptAllColumnMap(et.asInstanceOf[DbleVendorCheck], mp); }
    def extractPrimaryKeyMap(et: Entity): Map[String, Object] = { return doExtractPrimaryKeyMap(et); }
    def extractAllColumnMap(et: Entity): Map[String, Object] = { return doExtractAllColumnMap(et); }
}
