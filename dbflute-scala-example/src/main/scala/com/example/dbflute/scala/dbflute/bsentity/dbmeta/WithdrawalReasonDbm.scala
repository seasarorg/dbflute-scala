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
 * The DB meta of WITHDRAWAL_REASON. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
object WithdrawalReasonDbm extends AbstractDBMeta {

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
        setupEpg(_epgMap, new EpgWithdrawalReasonCode(), "withdrawalReasonCode");
        setupEpg(_epgMap, new EpgWithdrawalReasonText(), "withdrawalReasonText");
        setupEpg(_epgMap, new EpgDisplayOrder(), "displayOrder");
    }
    class EpgWithdrawalReasonCode extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleWithdrawalReason].getWithdrawalReasonCode(); }
        def write(et: Entity, vl: Object): Unit = {
            val col: ColumnInfo = columnWithdrawalReasonCode();
            dgccls(col, vl);
            val cls = dggcls(col, vl).asInstanceOf[CDef.WithdrawalReason];
            if (cls != null) {
                et.asInstanceOf[DbleWithdrawalReason].setWithdrawalReasonCodeAsWithdrawalReason(cls);
            } else {
                et.asInstanceOf[DbleWithdrawalReason].mynativeMappingWithdrawalReasonCode(vl.asInstanceOf[String]);
            }
        }
    }
    class EpgWithdrawalReasonText extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleWithdrawalReason].getWithdrawalReasonText(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleWithdrawalReason].setWithdrawalReasonText(vl.asInstanceOf[String]); }
    }
    class EpgDisplayOrder extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleWithdrawalReason].getDisplayOrder(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleWithdrawalReason].setDisplayOrder(dgcti(vl)); }
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
    protected val _tableDbName: String = "WITHDRAWAL_REASON";
    protected val _tablePropertyName: String = "withdrawalReason";
    protected val _tableSqlName: TableSqlName = new TableSqlName("WITHDRAWAL_REASON", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getTableSqlNameFilter()); }
    def getTableDbName(): String = { return _tableDbName; }
    def getTablePropertyName(): String = { return _tablePropertyName; }
    def getTableSqlName(): TableSqlName = { return _tableSqlName; }
    protected val _tableAlias: String = "退会理由";
    override def getTableAlias(): String = { return _tableAlias; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected val _columnWithdrawalReasonCode: ColumnInfo = cci("WITHDRAWAL_REASON_CODE", "WITHDRAWAL_REASON_CODE", null, "退会理由コード", classOf[String], "withdrawalReasonCode", null, true, false, true, "CHAR", 3, 0, null, false, null, null, null, "memberWithdrawalList", CDef.DefMeta.WithdrawalReason);
    protected val _columnWithdrawalReasonText: ColumnInfo = cci("WITHDRAWAL_REASON_TEXT", "WITHDRAWAL_REASON_TEXT", null, "退会理由テキスト", classOf[String], "withdrawalReasonText", null, false, false, true, "CLOB", 2147483647, 0, null, false, null, null, null, null, null);
    protected val _columnDisplayOrder: ColumnInfo = cci("DISPLAY_ORDER", "DISPLAY_ORDER", null, null, classOf[Integer], "displayOrder", null, false, false, true, "INTEGER", 10, 0, null, false, null, null, null, null, null);

    def columnWithdrawalReasonCode(): ColumnInfo = { return _columnWithdrawalReasonCode; }
    def columnWithdrawalReasonText(): ColumnInfo = { return _columnWithdrawalReasonText; }
    def columnDisplayOrder(): ColumnInfo = { return _columnDisplayOrder; }

    protected def ccil(): List[ColumnInfo] = {
        val ls: List[ColumnInfo] = newArrayList();
        ls.add(columnWithdrawalReasonCode());
        ls.add(columnWithdrawalReasonText());
        ls.add(columnDisplayOrder());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected def cpui(): UniqueInfo = { return hpcpui(columnWithdrawalReasonCode()); }
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
    def referrerMemberWithdrawalList(): ReferrerInfo = {
        val mp: Map[ColumnInfo, ColumnInfo] = newLinkedHashMap(columnWithdrawalReasonCode(), MemberWithdrawalDbm.columnWithdrawalReasonCode());
        return cri("FK_MEMBER_WITHDRAWAL_WITHDRAWAL_REASON", "memberWithdrawalList", this, MemberWithdrawalDbm, mp, false, "withdrawalReason");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    def getEntityTypeName(): String = { return "com.example.dbflute.scala.dbflute.exentity.DbleWithdrawalReason"; }
    def getConditionBeanTypeName(): String = { return "com.example.dbflute.scala.dbflute.cbean.WithdrawalReasonCB"; }
    def getBehaviorTypeName(): String = { return "com.example.dbflute.scala.dbflute.exbhv.WithdrawalReasonBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    def getEntityType(): Class[DbleWithdrawalReason] = { return classOf[DbleWithdrawalReason]; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    def newEntity(): DbleWithdrawalReason = { return new DbleWithdrawalReason(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    def acceptPrimaryKeyMap(et: Entity, mp: Map[String, _]): Unit =
    { doAcceptPrimaryKeyMap(et.asInstanceOf[DbleWithdrawalReason], mp); }
    def acceptAllColumnMap(et: Entity, mp: Map[String, _]): Unit =
    { doAcceptAllColumnMap(et.asInstanceOf[DbleWithdrawalReason], mp); }
    def extractPrimaryKeyMap(et: Entity): Map[String, Object] = { return doExtractPrimaryKeyMap(et); }
    def extractAllColumnMap(et: Entity): Map[String, Object] = { return doExtractAllColumnMap(et); }
}
