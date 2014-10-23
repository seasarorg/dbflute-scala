package com.example.dbflute.scala.dbflute.bsentity.customize.dbmeta;

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
import com.example.dbflute.scala.dbflute.exentity.customize._;

/**
 * The DB meta of UnpaidSummaryMember. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
object UnpaidSummaryMemberDbm extends AbstractDBMeta {

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
        setupEpg(_epgMap, new EpgUnpaidManId(), "unpaidManId");
        setupEpg(_epgMap, new EpgUnpaidManName(), "unpaidManName");
        setupEpg(_epgMap, new EpgUnpaidPriceSummary(), "unpaidPriceSummary");
        setupEpg(_epgMap, new EpgStatusName(), "statusName");
    }
    class EpgUnpaidManId extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleUnpaidSummaryMember].getUnpaidManId(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleUnpaidSummaryMember].setUnpaidManId(dgcti(vl)); }
    }
    class EpgUnpaidManName extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleUnpaidSummaryMember].getUnpaidManName(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleUnpaidSummaryMember].setUnpaidManName(vl.asInstanceOf[String]); }
    }
    class EpgUnpaidPriceSummary extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleUnpaidSummaryMember].getUnpaidPriceSummary(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleUnpaidSummaryMember].setUnpaidPriceSummary(dgctl(vl)); }
    }
    class EpgStatusName extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleUnpaidSummaryMember].getStatusName(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleUnpaidSummaryMember].setStatusName(vl.asInstanceOf[String]); }
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
    protected val _tableDbName: String = "UnpaidSummaryMember";
    protected val _tablePropertyName: String = "unpaidSummaryMember";
    protected val _tableSqlName: TableSqlName = new TableSqlName("UnpaidSummaryMember", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getTableSqlNameFilter()); }
    def getTableDbName(): String = { return _tableDbName; }
    def getTablePropertyName(): String = { return _tablePropertyName; }
    def getTableSqlName(): TableSqlName = { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected val _columnUnpaidManId: ColumnInfo = cci("UNPAID_MAN_ID", "UNPAID_MAN_ID", null, "会員ID", classOf[Integer], "unpaidManId", null, true, false, false, "INTEGER", 10, 0, null, false, null, null, null, null, null);
    protected val _columnUnpaidManName: ColumnInfo = cci("UNPAID_MAN_NAME", "UNPAID_MAN_NAME", null, "会員名称", classOf[String], "unpaidManName", null, false, false, false, "VARCHAR", 200, 0, null, false, null, null, null, null, null);
    protected val _columnUnpaidPriceSummary: ColumnInfo = cci("UNPAID_PRICE_SUMMARY", "UNPAID_PRICE_SUMMARY", null, null, classOf[Long], "unpaidPriceSummary", null, false, false, false, "BIGINT", 10, 0, null, false, null, null, null, null, null);
    protected val _columnStatusName: ColumnInfo = cci("STATUS_NAME", "STATUS_NAME", null, "会員ステータス名称", classOf[String], "statusName", null, false, false, false, "VARCHAR", 50, 0, null, false, null, null, null, null, null);

    def columnUnpaidManId(): ColumnInfo = { return _columnUnpaidManId; }
    def columnUnpaidManName(): ColumnInfo = { return _columnUnpaidManName; }
    def columnUnpaidPriceSummary(): ColumnInfo = { return _columnUnpaidPriceSummary; }
    def columnStatusName(): ColumnInfo = { return _columnStatusName; }

    protected def ccil(): List[ColumnInfo] = {
        val ls: List[ColumnInfo] = newArrayList();
        ls.add(columnUnpaidManId());
        ls.add(columnUnpaidManName());
        ls.add(columnUnpaidPriceSummary());
        ls.add(columnStatusName());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected def cpui(): UniqueInfo = { return hpcpui(columnUnpaidManId()); }
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
    def getEntityTypeName(): String = { return "com.example.dbflute.scala.dbflute.exentity.customize.DbleUnpaidSummaryMember"; }
    def getConditionBeanTypeName(): String = { return null; }
    def getBehaviorTypeName(): String = { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    def getEntityType(): Class[DbleUnpaidSummaryMember] = { return classOf[DbleUnpaidSummaryMember]; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    def newEntity(): DbleUnpaidSummaryMember = { return new DbleUnpaidSummaryMember(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    def acceptPrimaryKeyMap(et: Entity, mp: Map[String, _]): Unit =
    { doAcceptPrimaryKeyMap(et.asInstanceOf[DbleUnpaidSummaryMember], mp); }
    def acceptAllColumnMap(et: Entity, mp: Map[String, _]): Unit =
    { doAcceptAllColumnMap(et.asInstanceOf[DbleUnpaidSummaryMember], mp); }
    def extractPrimaryKeyMap(et: Entity): Map[String, Object] = { return doExtractPrimaryKeyMap(et); }
    def extractAllColumnMap(et: Entity): Map[String, Object] = { return doExtractAllColumnMap(et); }
}
