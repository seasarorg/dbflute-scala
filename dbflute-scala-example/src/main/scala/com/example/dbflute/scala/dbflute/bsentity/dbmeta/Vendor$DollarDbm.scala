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
 * The DB meta of VENDOR_$_DOLLAR. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
object Vendor$DollarDbm extends AbstractDBMeta {

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
        setupEpg(_epgMap, new EpgVendor$DollarId(), "vendor$DollarId");
        setupEpg(_epgMap, new EpgVendor$DollarName(), "vendor$DollarName");
    }
    class EpgVendor$DollarId extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleVendor$Dollar].getVendor$DollarId(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleVendor$Dollar].setVendor$DollarId(dgcti(vl)); }
    }
    class EpgVendor$DollarName extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleVendor$Dollar].getVendor$DollarName(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleVendor$Dollar].setVendor$DollarName(vl.asInstanceOf[String]); }
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
    protected val _tableDbName: String = "VENDOR_$_DOLLAR";
    protected val _tablePropertyName: String = "vendor$Dollar";
    protected val _tableSqlName: TableSqlName = new TableSqlName("VENDOR_$_DOLLAR", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getTableSqlNameFilter()); }
    def getTableDbName(): String = { return _tableDbName; }
    def getTablePropertyName(): String = { return _tablePropertyName; }
    def getTableSqlName(): TableSqlName = { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected val _columnVendor$DollarId: ColumnInfo = cci("VENDOR_$_DOLLAR_ID", "VENDOR_$_DOLLAR_ID", null, null, classOf[Integer], "vendor$DollarId", null, true, false, true, "INTEGER", 10, 0, null, false, null, null, null, null, null);
    protected val _columnVendor$DollarName: ColumnInfo = cci("VENDOR_$_DOLLAR_NAME", "VENDOR_$_DOLLAR_NAME", null, null, classOf[String], "vendor$DollarName", null, false, false, false, "VARCHAR", 32, 0, null, false, null, null, null, null, null);

    def columnVendor$DollarId(): ColumnInfo = { return _columnVendor$DollarId; }
    def columnVendor$DollarName(): ColumnInfo = { return _columnVendor$DollarName; }

    protected def ccil(): List[ColumnInfo] = {
        val ls: List[ColumnInfo] = newArrayList();
        ls.add(columnVendor$DollarId());
        ls.add(columnVendor$DollarName());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected def cpui(): UniqueInfo = { return hpcpui(columnVendor$DollarId()); }
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
    def getEntityTypeName(): String = { return "com.example.dbflute.scala.dbflute.exentity.DbleVendor$Dollar"; }
    def getConditionBeanTypeName(): String = { return "com.example.dbflute.scala.dbflute.cbean.Vendor$DollarCB"; }
    def getBehaviorTypeName(): String = { return "com.example.dbflute.scala.dbflute.exbhv.Vendor$DollarBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    def getEntityType(): Class[DbleVendor$Dollar] = { return classOf[DbleVendor$Dollar]; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    def newEntity(): DbleVendor$Dollar = { return new DbleVendor$Dollar(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    def acceptPrimaryKeyMap(et: Entity, mp: Map[String, _]): Unit =
    { doAcceptPrimaryKeyMap(et.asInstanceOf[DbleVendor$Dollar], mp); }
    def acceptAllColumnMap(et: Entity, mp: Map[String, _]): Unit =
    { doAcceptAllColumnMap(et.asInstanceOf[DbleVendor$Dollar], mp); }
    def extractPrimaryKeyMap(et: Entity): Map[String, Object] = { return doExtractPrimaryKeyMap(et); }
    def extractAllColumnMap(et: Entity): Map[String, Object] = { return doExtractAllColumnMap(et); }
}
