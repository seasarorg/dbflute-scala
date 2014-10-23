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
 * The DB meta of SUMMARY_WITHDRAWAL. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
object SummaryWithdrawalDbm extends AbstractDBMeta {

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
        setupEpg(_epgMap, new EpgMemberId(), "memberId");
        setupEpg(_epgMap, new EpgMemberName(), "memberName");
        setupEpg(_epgMap, new EpgWithdrawalReasonCode(), "withdrawalReasonCode");
        setupEpg(_epgMap, new EpgWithdrawalReasonText(), "withdrawalReasonText");
        setupEpg(_epgMap, new EpgWithdrawalReasonInputText(), "withdrawalReasonInputText");
        setupEpg(_epgMap, new EpgWithdrawalDatetime(), "withdrawalDatetime");
        setupEpg(_epgMap, new EpgMemberStatusCode(), "memberStatusCode");
        setupEpg(_epgMap, new EpgMemberStatusName(), "memberStatusName");
        setupEpg(_epgMap, new EpgMaxPurchasePrice(), "maxPurchasePrice");
    }
    class EpgMemberId extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleSummaryWithdrawal].getMemberId(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleSummaryWithdrawal].setMemberId(dgcti(vl)); }
    }
    class EpgMemberName extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleSummaryWithdrawal].getMemberName(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleSummaryWithdrawal].setMemberName(vl.asInstanceOf[String]); }
    }
    class EpgWithdrawalReasonCode extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleSummaryWithdrawal].getWithdrawalReasonCode(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleSummaryWithdrawal].setWithdrawalReasonCode(vl.asInstanceOf[String]); }
    }
    class EpgWithdrawalReasonText extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleSummaryWithdrawal].getWithdrawalReasonText(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleSummaryWithdrawal].setWithdrawalReasonText(vl.asInstanceOf[String]); }
    }
    class EpgWithdrawalReasonInputText extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleSummaryWithdrawal].getWithdrawalReasonInputText(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleSummaryWithdrawal].setWithdrawalReasonInputText(vl.asInstanceOf[String]); }
    }
    class EpgWithdrawalDatetime extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleSummaryWithdrawal].getWithdrawalDatetime(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleSummaryWithdrawal].setWithdrawalDatetime(vl.asInstanceOf[org.joda.time.LocalDateTime]); }
    }
    class EpgMemberStatusCode extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleSummaryWithdrawal].getMemberStatusCode(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleSummaryWithdrawal].setMemberStatusCode(vl.asInstanceOf[String]); }
    }
    class EpgMemberStatusName extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleSummaryWithdrawal].getMemberStatusName(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleSummaryWithdrawal].setMemberStatusName(vl.asInstanceOf[String]); }
    }
    class EpgMaxPurchasePrice extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleSummaryWithdrawal].getMaxPurchasePrice(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleSummaryWithdrawal].setMaxPurchasePrice(dgcti(vl)); }
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
    protected val _tableDbName: String = "SUMMARY_WITHDRAWAL";
    protected val _tablePropertyName: String = "summaryWithdrawal";
    protected val _tableSqlName: TableSqlName = new TableSqlName("SUMMARY_WITHDRAWAL", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getTableSqlNameFilter()); }
    def getTableDbName(): String = { return _tableDbName; }
    def getTablePropertyName(): String = { return _tablePropertyName; }
    def getTableSqlName(): TableSqlName = { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected val _columnMemberId: ColumnInfo = cci("MEMBER_ID", "MEMBER_ID", null, null, classOf[Integer], "memberId", null, false, false, false, "INTEGER", 10, 0, null, false, null, null, null, null, null);
    protected val _columnMemberName: ColumnInfo = cci("MEMBER_NAME", "MEMBER_NAME", null, null, classOf[String], "memberName", null, false, false, false, "VARCHAR", 200, 0, null, false, null, null, null, null, null);
    protected val _columnWithdrawalReasonCode: ColumnInfo = cci("WITHDRAWAL_REASON_CODE", "WITHDRAWAL_REASON_CODE", null, null, classOf[String], "withdrawalReasonCode", null, false, false, false, "CHAR", 3, 0, null, false, null, null, null, null, null);
    protected val _columnWithdrawalReasonText: ColumnInfo = cci("WITHDRAWAL_REASON_TEXT", "WITHDRAWAL_REASON_TEXT", null, null, classOf[String], "withdrawalReasonText", null, false, false, false, "CLOB", 2147483647, 0, null, false, null, null, null, null, null);
    protected val _columnWithdrawalReasonInputText: ColumnInfo = cci("WITHDRAWAL_REASON_INPUT_TEXT", "WITHDRAWAL_REASON_INPUT_TEXT", null, null, classOf[String], "withdrawalReasonInputText", null, false, false, false, "CLOB", 2147483647, 0, null, false, null, null, null, null, null);
    protected val _columnWithdrawalDatetime: ColumnInfo = cci("WITHDRAWAL_DATETIME", "WITHDRAWAL_DATETIME", null, null, classOf[org.joda.time.LocalDateTime], "withdrawalDatetime", null, false, false, false, "TIMESTAMP", 23, 10, null, false, null, null, null, null, null);
    protected val _columnMemberStatusCode: ColumnInfo = cci("MEMBER_STATUS_CODE", "MEMBER_STATUS_CODE", null, null, classOf[String], "memberStatusCode", null, false, false, false, "CHAR", 3, 0, null, false, null, null, null, null, null);
    protected val _columnMemberStatusName: ColumnInfo = cci("MEMBER_STATUS_NAME", "MEMBER_STATUS_NAME", null, null, classOf[String], "memberStatusName", null, false, false, false, "VARCHAR", 50, 0, null, false, null, null, null, null, null);
    protected val _columnMaxPurchasePrice: ColumnInfo = cci("MAX_PURCHASE_PRICE", "MAX_PURCHASE_PRICE", null, null, classOf[Integer], "maxPurchasePrice", null, false, false, false, "INTEGER", 10, 0, null, false, null, null, null, null, null);

    def columnMemberId(): ColumnInfo = { return _columnMemberId; }
    def columnMemberName(): ColumnInfo = { return _columnMemberName; }
    def columnWithdrawalReasonCode(): ColumnInfo = { return _columnWithdrawalReasonCode; }
    def columnWithdrawalReasonText(): ColumnInfo = { return _columnWithdrawalReasonText; }
    def columnWithdrawalReasonInputText(): ColumnInfo = { return _columnWithdrawalReasonInputText; }
    def columnWithdrawalDatetime(): ColumnInfo = { return _columnWithdrawalDatetime; }
    def columnMemberStatusCode(): ColumnInfo = { return _columnMemberStatusCode; }
    def columnMemberStatusName(): ColumnInfo = { return _columnMemberStatusName; }
    def columnMaxPurchasePrice(): ColumnInfo = { return _columnMaxPurchasePrice; }

    protected def ccil(): List[ColumnInfo] = {
        val ls: List[ColumnInfo] = newArrayList();
        ls.add(columnMemberId());
        ls.add(columnMemberName());
        ls.add(columnWithdrawalReasonCode());
        ls.add(columnWithdrawalReasonText());
        ls.add(columnWithdrawalReasonInputText());
        ls.add(columnWithdrawalDatetime());
        ls.add(columnMemberStatusCode());
        ls.add(columnMemberStatusName());
        ls.add(columnMaxPurchasePrice());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected def cpui(): UniqueInfo = {
        throw new UnsupportedOperationException("The table does not have primary key: " + getTableDbName());
    }
    def hasPrimaryKey(): scala.Boolean = { return false; }
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
    def getEntityTypeName(): String = { return "com.example.dbflute.scala.dbflute.exentity.DbleSummaryWithdrawal"; }
    def getConditionBeanTypeName(): String = { return "com.example.dbflute.scala.dbflute.cbean.SummaryWithdrawalCB"; }
    def getBehaviorTypeName(): String = { return "com.example.dbflute.scala.dbflute.exbhv.SummaryWithdrawalBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    def getEntityType(): Class[DbleSummaryWithdrawal] = { return classOf[DbleSummaryWithdrawal]; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    def newEntity(): DbleSummaryWithdrawal = { return new DbleSummaryWithdrawal(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    def acceptPrimaryKeyMap(et: Entity, mp: Map[String, _]): Unit =
    { doAcceptPrimaryKeyMap(et.asInstanceOf[DbleSummaryWithdrawal], mp); }
    def acceptAllColumnMap(et: Entity, mp: Map[String, _]): Unit =
    { doAcceptAllColumnMap(et.asInstanceOf[DbleSummaryWithdrawal], mp); }
    def extractPrimaryKeyMap(et: Entity): Map[String, Object] = { return doExtractPrimaryKeyMap(et); }
    def extractAllColumnMap(et: Entity): Map[String, Object] = { return doExtractAllColumnMap(et); }
}
