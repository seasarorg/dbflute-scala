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
 * The DB meta of VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
object VendorTheLongAndWindingTableAndColumnRefDbm extends AbstractDBMeta {

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
        setupEpg(_epgMap, new EpgTheLongAndWindingTableAndColumnRefId(), "theLongAndWindingTableAndColumnRefId");
        setupEpg(_epgMap, new EpgTheLongAndWindingTableAndColumnId(), "theLongAndWindingTableAndColumnId");
        setupEpg(_epgMap, new EpgTheLongAndWindingTableAndColumnRefDate(), "theLongAndWindingTableAndColumnRefDate");
        setupEpg(_epgMap, new EpgShortDate(), "shortDate");
    }
    class EpgTheLongAndWindingTableAndColumnRefId extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleVendorTheLongAndWindingTableAndColumnRef].getTheLongAndWindingTableAndColumnRefId(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleVendorTheLongAndWindingTableAndColumnRef].setTheLongAndWindingTableAndColumnRefId(dgctl(vl)); }
    }
    class EpgTheLongAndWindingTableAndColumnId extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleVendorTheLongAndWindingTableAndColumnRef].getTheLongAndWindingTableAndColumnId(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleVendorTheLongAndWindingTableAndColumnRef].setTheLongAndWindingTableAndColumnId(dgctl(vl)); }
    }
    class EpgTheLongAndWindingTableAndColumnRefDate extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleVendorTheLongAndWindingTableAndColumnRef].getTheLongAndWindingTableAndColumnRefDate(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleVendorTheLongAndWindingTableAndColumnRef].setTheLongAndWindingTableAndColumnRefDate(vl.asInstanceOf[org.joda.time.LocalDate]); }
    }
    class EpgShortDate extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleVendorTheLongAndWindingTableAndColumnRef].getShortDate(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleVendorTheLongAndWindingTableAndColumnRef].setShortDate(vl.asInstanceOf[org.joda.time.LocalDate]); }
    }
    // #avoided delegating to protected static (illegal access error if directly call)
    def dgcti(vl: Object): Integer = { cti(vl); }
    def dgctl(vl: Object): Long = { ctl(vl); }
    def dgctb(vl: Object): BigDecimal = { ctb(vl); }
    def dgctn[NUMBER <: Number](vl: Object, tp: Class[NUMBER]): NUMBER = { ctn(vl, tp); }
    def dggcls(col: ColumnInfo, cd: Object): Classification = { gcls(col, cd); }
    def dgccls(col: ColumnInfo, cd: Object): Unit = { ccls(col, cd); }
    override def findPropertyGateway(prop: String): PropertyGateway = { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected val _efpgMap: Map[String, PropertyGateway] = newHashMap();
    {
        setupEfpg(_efpgMap, new EfpgVendorTheLongAndWindingTableAndColumn(), "vendorTheLongAndWindingTableAndColumn");
    }
    class EfpgVendorTheLongAndWindingTableAndColumn extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleVendorTheLongAndWindingTableAndColumnRef].getVendorTheLongAndWindingTableAndColumn(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleVendorTheLongAndWindingTableAndColumnRef].setVendorTheLongAndWindingTableAndColumn(vl.asInstanceOf[Option[DbleVendorTheLongAndWindingTableAndColumn]]); }
    }
    override def findForeignPropertyGateway(prop: String): PropertyGateway = { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected val _tableDbName: String = "VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF";
    protected val _tablePropertyName: String = "vendorTheLongAndWindingTableAndColumnRef";
    protected val _tableSqlName: TableSqlName = new TableSqlName("VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getTableSqlNameFilter()); }
    def getTableDbName(): String = { return _tableDbName; }
    def getTablePropertyName(): String = { return _tablePropertyName; }
    def getTableSqlName(): TableSqlName = { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected val _columnTheLongAndWindingTableAndColumnRefId: ColumnInfo = cci("THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_ID", "THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_ID", null, null, classOf[Long], "theLongAndWindingTableAndColumnRefId", null, true, false, true, "BIGINT", 19, 0, null, false, null, null, null, null, null);
    protected val _columnTheLongAndWindingTableAndColumnId: ColumnInfo = cci("THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID", "THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID", null, null, classOf[Long], "theLongAndWindingTableAndColumnId", null, false, false, true, "BIGINT", 19, 0, null, false, null, null, "vendorTheLongAndWindingTableAndColumn", null, null);
    protected val _columnTheLongAndWindingTableAndColumnRefDate: ColumnInfo = cci("THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_DATE", "THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_DATE", null, null, classOf[org.joda.time.LocalDate], "theLongAndWindingTableAndColumnRefDate", null, false, false, true, "DATE", 8, 0, null, false, null, null, null, null, null);
    protected val _columnShortDate: ColumnInfo = cci("SHORT_DATE", "SHORT_DATE", null, null, classOf[org.joda.time.LocalDate], "shortDate", null, false, false, true, "DATE", 8, 0, null, false, null, null, null, null, null);

    def columnTheLongAndWindingTableAndColumnRefId(): ColumnInfo = { return _columnTheLongAndWindingTableAndColumnRefId; }
    def columnTheLongAndWindingTableAndColumnId(): ColumnInfo = { return _columnTheLongAndWindingTableAndColumnId; }
    def columnTheLongAndWindingTableAndColumnRefDate(): ColumnInfo = { return _columnTheLongAndWindingTableAndColumnRefDate; }
    def columnShortDate(): ColumnInfo = { return _columnShortDate; }

    protected def ccil(): List[ColumnInfo] = {
        val ls: List[ColumnInfo] = newArrayList();
        ls.add(columnTheLongAndWindingTableAndColumnRefId());
        ls.add(columnTheLongAndWindingTableAndColumnId());
        ls.add(columnTheLongAndWindingTableAndColumnRefDate());
        ls.add(columnShortDate());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected def cpui(): UniqueInfo = { return hpcpui(columnTheLongAndWindingTableAndColumnRefId()); }
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
    def foreignVendorTheLongAndWindingTableAndColumn(): ForeignInfo = {
        val mp: Map[ColumnInfo, ColumnInfo] = newLinkedHashMap(columnTheLongAndWindingTableAndColumnId(), VendorTheLongAndWindingTableAndColumnDbm.columnTheLongAndWindingTableAndColumnId());
        return cfi("FK_VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF", "vendorTheLongAndWindingTableAndColumn", this, VendorTheLongAndWindingTableAndColumnDbm, mp, 0, classOf[Option[_]], false, false, false, false, null, null, false, "vendorTheLongAndWindingTableAndColumnRefList");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    def getEntityTypeName(): String = { return "com.example.dbflute.scala.dbflute.exentity.DbleVendorTheLongAndWindingTableAndColumnRef"; }
    def getConditionBeanTypeName(): String = { return "com.example.dbflute.scala.dbflute.cbean.VendorTheLongAndWindingTableAndColumnRefCB"; }
    def getBehaviorTypeName(): String = { return "com.example.dbflute.scala.dbflute.exbhv.VendorTheLongAndWindingTableAndColumnRefBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    def getEntityType(): Class[DbleVendorTheLongAndWindingTableAndColumnRef] = { return classOf[DbleVendorTheLongAndWindingTableAndColumnRef]; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    def newEntity(): DbleVendorTheLongAndWindingTableAndColumnRef = { return new DbleVendorTheLongAndWindingTableAndColumnRef(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    def acceptPrimaryKeyMap(et: Entity, mp: Map[String, _]): Unit =
    { doAcceptPrimaryKeyMap(et.asInstanceOf[DbleVendorTheLongAndWindingTableAndColumnRef], mp); }
    def acceptAllColumnMap(et: Entity, mp: Map[String, _]): Unit =
    { doAcceptAllColumnMap(et.asInstanceOf[DbleVendorTheLongAndWindingTableAndColumnRef], mp); }
    def extractPrimaryKeyMap(et: Entity): Map[String, Object] = { return doExtractPrimaryKeyMap(et); }
    def extractAllColumnMap(et: Entity): Map[String, Object] = { return doExtractAllColumnMap(et); }
}
