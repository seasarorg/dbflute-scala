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
 * The DB meta of VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
object VendorTheLongAndWindingTableAndColumnDbm extends AbstractDBMeta {

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
        setupEpg(_epgMap, new EpgTheLongAndWindingTableAndColumnId(), "theLongAndWindingTableAndColumnId");
        setupEpg(_epgMap, new EpgTheLongAndWindingTableAndColumnName(), "theLongAndWindingTableAndColumnName");
        setupEpg(_epgMap, new EpgShortName(), "shortName");
        setupEpg(_epgMap, new EpgShortSize(), "shortSize");
    }
    class EpgTheLongAndWindingTableAndColumnId extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleVendorTheLongAndWindingTableAndColumn].getTheLongAndWindingTableAndColumnId(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleVendorTheLongAndWindingTableAndColumn].setTheLongAndWindingTableAndColumnId(dgctl(vl)); }
    }
    class EpgTheLongAndWindingTableAndColumnName extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleVendorTheLongAndWindingTableAndColumn].getTheLongAndWindingTableAndColumnName(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleVendorTheLongAndWindingTableAndColumn].setTheLongAndWindingTableAndColumnName(vl.asInstanceOf[String]); }
    }
    class EpgShortName extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleVendorTheLongAndWindingTableAndColumn].getShortName(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleVendorTheLongAndWindingTableAndColumn].setShortName(vl.asInstanceOf[String]); }
    }
    class EpgShortSize extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleVendorTheLongAndWindingTableAndColumn].getShortSize(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleVendorTheLongAndWindingTableAndColumn].setShortSize(dgcti(vl)); }
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
    protected val _tableDbName: String = "VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN";
    protected val _tablePropertyName: String = "vendorTheLongAndWindingTableAndColumn";
    protected val _tableSqlName: TableSqlName = new TableSqlName("VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getTableSqlNameFilter()); }
    def getTableDbName(): String = { return _tableDbName; }
    def getTablePropertyName(): String = { return _tablePropertyName; }
    def getTableSqlName(): TableSqlName = { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected val _columnTheLongAndWindingTableAndColumnId: ColumnInfo = cci("THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID", "THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID", null, null, classOf[Long], "theLongAndWindingTableAndColumnId", null, true, false, true, "BIGINT", 19, 0, null, false, null, null, null, "vendorTheLongAndWindingTableAndColumnRefList", null);
    protected val _columnTheLongAndWindingTableAndColumnName: ColumnInfo = cci("THE_LONG_AND_WINDING_TABLE_AND_COLUMN_NAME", "THE_LONG_AND_WINDING_TABLE_AND_COLUMN_NAME", null, null, classOf[String], "theLongAndWindingTableAndColumnName", null, false, false, true, "VARCHAR", 200, 0, null, false, null, null, null, null, null);
    protected val _columnShortName: ColumnInfo = cci("SHORT_NAME", "SHORT_NAME", null, null, classOf[String], "shortName", null, false, false, true, "VARCHAR", 200, 0, null, false, null, null, null, null, null);
    protected val _columnShortSize: ColumnInfo = cci("SHORT_SIZE", "SHORT_SIZE", null, null, classOf[Integer], "shortSize", null, false, false, true, "INTEGER", 10, 0, null, false, null, null, null, null, null);

    def columnTheLongAndWindingTableAndColumnId(): ColumnInfo = { return _columnTheLongAndWindingTableAndColumnId; }
    def columnTheLongAndWindingTableAndColumnName(): ColumnInfo = { return _columnTheLongAndWindingTableAndColumnName; }
    def columnShortName(): ColumnInfo = { return _columnShortName; }
    def columnShortSize(): ColumnInfo = { return _columnShortSize; }

    protected def ccil(): List[ColumnInfo] = {
        val ls: List[ColumnInfo] = newArrayList();
        ls.add(columnTheLongAndWindingTableAndColumnId());
        ls.add(columnTheLongAndWindingTableAndColumnName());
        ls.add(columnShortName());
        ls.add(columnShortSize());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected def cpui(): UniqueInfo = { return hpcpui(columnTheLongAndWindingTableAndColumnId()); }
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
    def referrerVendorTheLongAndWindingTableAndColumnRefList(): ReferrerInfo = {
        val mp: Map[ColumnInfo, ColumnInfo] = newLinkedHashMap(columnTheLongAndWindingTableAndColumnId(), VendorTheLongAndWindingTableAndColumnRefDbm.columnTheLongAndWindingTableAndColumnId());
        return cri("FK_VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF", "vendorTheLongAndWindingTableAndColumnRefList", this, VendorTheLongAndWindingTableAndColumnRefDbm, mp, false, "vendorTheLongAndWindingTableAndColumn");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    def getEntityTypeName(): String = { return "com.example.dbflute.scala.dbflute.exentity.DbleVendorTheLongAndWindingTableAndColumn"; }
    def getConditionBeanTypeName(): String = { return "com.example.dbflute.scala.dbflute.cbean.VendorTheLongAndWindingTableAndColumnCB"; }
    def getBehaviorTypeName(): String = { return "com.example.dbflute.scala.dbflute.exbhv.VendorTheLongAndWindingTableAndColumnBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    def getEntityType(): Class[DbleVendorTheLongAndWindingTableAndColumn] = { return classOf[DbleVendorTheLongAndWindingTableAndColumn]; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    def newEntity(): DbleVendorTheLongAndWindingTableAndColumn = { return new DbleVendorTheLongAndWindingTableAndColumn(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    def acceptPrimaryKeyMap(et: Entity, mp: Map[String, _]): Unit =
    { doAcceptPrimaryKeyMap(et.asInstanceOf[DbleVendorTheLongAndWindingTableAndColumn], mp); }
    def acceptAllColumnMap(et: Entity, mp: Map[String, _]): Unit =
    { doAcceptAllColumnMap(et.asInstanceOf[DbleVendorTheLongAndWindingTableAndColumn], mp); }
    def extractPrimaryKeyMap(et: Entity): Map[String, Object] = { return doExtractPrimaryKeyMap(et); }
    def extractAllColumnMap(et: Entity): Map[String, Object] = { return doExtractAllColumnMap(et); }
}
