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
 * The DB meta of MEMBER_WITHDRAWAL. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
object MemberWithdrawalDbm extends AbstractDBMeta {

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
        setupEpg(_epgMap, new EpgWithdrawalReasonCode(), "withdrawalReasonCode");
        setupEpg(_epgMap, new EpgWithdrawalReasonInputText(), "withdrawalReasonInputText");
        setupEpg(_epgMap, new EpgWithdrawalDatetime(), "withdrawalDatetime");
        setupEpg(_epgMap, new EpgRegisterDatetime(), "registerDatetime");
        setupEpg(_epgMap, new EpgRegisterUser(), "registerUser");
        setupEpg(_epgMap, new EpgUpdateDatetime(), "updateDatetime");
        setupEpg(_epgMap, new EpgUpdateUser(), "updateUser");
        setupEpg(_epgMap, new EpgVersionNo(), "versionNo");
    }
    class EpgMemberId extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleMemberWithdrawal].getMemberId(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleMemberWithdrawal].setMemberId(dgcti(vl)); }
    }
    class EpgWithdrawalReasonCode extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleMemberWithdrawal].getWithdrawalReasonCode(); }
        def write(et: Entity, vl: Object): Unit = {
            val col: ColumnInfo = columnWithdrawalReasonCode();
            dgccls(col, vl);
            val cls = dggcls(col, vl).asInstanceOf[CDef.WithdrawalReason];
            if (cls != null) {
                et.asInstanceOf[DbleMemberWithdrawal].setWithdrawalReasonCodeAsWithdrawalReason(cls);
            } else {
                et.asInstanceOf[DbleMemberWithdrawal].mynativeMappingWithdrawalReasonCode(vl.asInstanceOf[String]);
            }
        }
    }
    class EpgWithdrawalReasonInputText extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleMemberWithdrawal].getWithdrawalReasonInputText(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleMemberWithdrawal].setWithdrawalReasonInputText(vl.asInstanceOf[String]); }
    }
    class EpgWithdrawalDatetime extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleMemberWithdrawal].getWithdrawalDatetime(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleMemberWithdrawal].setWithdrawalDatetime(vl.asInstanceOf[org.joda.time.LocalDateTime]); }
    }
    class EpgRegisterDatetime extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleMemberWithdrawal].getRegisterDatetime(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleMemberWithdrawal].setRegisterDatetime(vl.asInstanceOf[org.joda.time.LocalDateTime]); }
    }
    class EpgRegisterUser extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleMemberWithdrawal].getRegisterUser(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleMemberWithdrawal].setRegisterUser(vl.asInstanceOf[String]); }
    }
    class EpgUpdateDatetime extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleMemberWithdrawal].getUpdateDatetime(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleMemberWithdrawal].setUpdateDatetime(vl.asInstanceOf[org.joda.time.LocalDateTime]); }
    }
    class EpgUpdateUser extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleMemberWithdrawal].getUpdateUser(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleMemberWithdrawal].setUpdateUser(vl.asInstanceOf[String]); }
    }
    class EpgVersionNo extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleMemberWithdrawal].getVersionNo(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleMemberWithdrawal].setVersionNo(dgctl(vl)); }
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
        setupEfpg(_efpgMap, new EfpgMember(), "member");
        setupEfpg(_efpgMap, new EfpgWithdrawalReason(), "withdrawalReason");
    }
    class EfpgMember extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleMemberWithdrawal].getMember(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleMemberWithdrawal].setMember(vl.asInstanceOf[Option[DbleMember]]); }
    }
    class EfpgWithdrawalReason extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleMemberWithdrawal].getWithdrawalReason(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleMemberWithdrawal].setWithdrawalReason(vl.asInstanceOf[Option[DbleWithdrawalReason]]); }
    }
    override def findForeignPropertyGateway(prop: String): PropertyGateway = { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected val _tableDbName: String = "MEMBER_WITHDRAWAL";
    protected val _tablePropertyName: String = "memberWithdrawal";
    protected val _tableSqlName: TableSqlName = new TableSqlName("MEMBER_WITHDRAWAL", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getTableSqlNameFilter()); }
    def getTableDbName(): String = { return _tableDbName; }
    def getTablePropertyName(): String = { return _tablePropertyName; }
    def getTableSqlName(): TableSqlName = { return _tableSqlName; }
    protected val _tableAlias: String = "会員退会情報";
    override def getTableAlias(): String = { return _tableAlias; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected val _columnMemberId: ColumnInfo = cci("MEMBER_ID", "MEMBER_ID", null, null, classOf[Integer], "memberId", null, true, false, true, "INTEGER", 10, 0, null, false, null, null, "member", null, null);
    protected val _columnWithdrawalReasonCode: ColumnInfo = cci("WITHDRAWAL_REASON_CODE", "WITHDRAWAL_REASON_CODE", null, "退会理由コード", classOf[String], "withdrawalReasonCode", null, false, false, false, "CHAR", 3, 0, null, false, null, null, "withdrawalReason", null, CDef.DefMeta.WithdrawalReason);
    protected val _columnWithdrawalReasonInputText: ColumnInfo = cci("WITHDRAWAL_REASON_INPUT_TEXT", "WITHDRAWAL_REASON_INPUT_TEXT", null, "退会理由入力テキスト", classOf[String], "withdrawalReasonInputText", null, false, false, false, "CLOB", 2147483647, 0, null, false, null, null, null, null, null);
    protected val _columnWithdrawalDatetime: ColumnInfo = cci("WITHDRAWAL_DATETIME", "WITHDRAWAL_DATETIME", null, "退会日時", classOf[org.joda.time.LocalDateTime], "withdrawalDatetime", null, false, false, true, "TIMESTAMP", 23, 10, null, false, null, null, null, null, null);
    protected val _columnRegisterDatetime: ColumnInfo = cci("REGISTER_DATETIME", "REGISTER_DATETIME", null, null, classOf[org.joda.time.LocalDateTime], "registerDatetime", null, false, false, true, "TIMESTAMP", 23, 10, null, true, null, null, null, null, null);
    protected val _columnRegisterUser: ColumnInfo = cci("REGISTER_USER", "REGISTER_USER", null, null, classOf[String], "registerUser", null, false, false, true, "VARCHAR", 200, 0, null, true, null, null, null, null, null);
    protected val _columnUpdateDatetime: ColumnInfo = cci("UPDATE_DATETIME", "UPDATE_DATETIME", null, null, classOf[org.joda.time.LocalDateTime], "updateDatetime", null, false, false, true, "TIMESTAMP", 23, 10, null, true, null, null, null, null, null);
    protected val _columnUpdateUser: ColumnInfo = cci("UPDATE_USER", "UPDATE_USER", null, null, classOf[String], "updateUser", null, false, false, true, "VARCHAR", 200, 0, null, true, null, null, null, null, null);
    protected val _columnVersionNo: ColumnInfo = cci("VERSION_NO", "VERSION_NO", null, null, classOf[Long], "versionNo", null, false, false, true, "BIGINT", 19, 0, null, false, OptimisticLockType.VERSION_NO, null, null, null, null);

    def columnMemberId(): ColumnInfo = { return _columnMemberId; }
    def columnWithdrawalReasonCode(): ColumnInfo = { return _columnWithdrawalReasonCode; }
    def columnWithdrawalReasonInputText(): ColumnInfo = { return _columnWithdrawalReasonInputText; }
    def columnWithdrawalDatetime(): ColumnInfo = { return _columnWithdrawalDatetime; }
    def columnRegisterDatetime(): ColumnInfo = { return _columnRegisterDatetime; }
    def columnRegisterUser(): ColumnInfo = { return _columnRegisterUser; }
    def columnUpdateDatetime(): ColumnInfo = { return _columnUpdateDatetime; }
    def columnUpdateUser(): ColumnInfo = { return _columnUpdateUser; }
    def columnVersionNo(): ColumnInfo = { return _columnVersionNo; }

    protected def ccil(): List[ColumnInfo] = {
        val ls: List[ColumnInfo] = newArrayList();
        ls.add(columnMemberId());
        ls.add(columnWithdrawalReasonCode());
        ls.add(columnWithdrawalReasonInputText());
        ls.add(columnWithdrawalDatetime());
        ls.add(columnRegisterDatetime());
        ls.add(columnRegisterUser());
        ls.add(columnUpdateDatetime());
        ls.add(columnUpdateUser());
        ls.add(columnVersionNo());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected def cpui(): UniqueInfo = { return hpcpui(columnMemberId()); }
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
    def foreignMember(): ForeignInfo = {
        val mp: Map[ColumnInfo, ColumnInfo] = newLinkedHashMap(columnMemberId(), MemberDbm.columnMemberId());
        return cfi("FK_MEMBER_WITHDRAWAL_MEMBER", "member", this, MemberDbm, mp, 0, classOf[Option[_]], true, false, false, false, null, null, false, "memberWithdrawalAsOne");
    }
    def foreignWithdrawalReason(): ForeignInfo = {
        val mp: Map[ColumnInfo, ColumnInfo] = newLinkedHashMap(columnWithdrawalReasonCode(), WithdrawalReasonDbm.columnWithdrawalReasonCode());
        return cfi("FK_MEMBER_WITHDRAWAL_WITHDRAWAL_REASON", "withdrawalReason", this, WithdrawalReasonDbm, mp, 1, classOf[Option[_]], false, false, false, false, null, null, false, "memberWithdrawalList");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    override def hasVersionNo(): scala.Boolean = { return true; }
    override def getVersionNoColumnInfo(): ColumnInfo = { return _columnVersionNo; }
    override def hasCommonColumn(): scala.Boolean = { return true; }
    override def getCommonColumnInfoList(): List[ColumnInfo] =
    { return newArrayList(columnRegisterDatetime(), columnRegisterUser(), columnUpdateDatetime(), columnUpdateUser()); }
    override def getCommonColumnInfoBeforeInsertList(): List[ColumnInfo] =
    { return newArrayList(columnRegisterDatetime(), columnRegisterUser(), columnUpdateDatetime(), columnUpdateUser()); }
    override def getCommonColumnInfoBeforeUpdateList(): List[ColumnInfo] =
    { return newArrayList(columnUpdateDatetime(), columnUpdateUser()); }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    def getEntityTypeName(): String = { return "com.example.dbflute.scala.dbflute.exentity.DbleMemberWithdrawal"; }
    def getConditionBeanTypeName(): String = { return "com.example.dbflute.scala.dbflute.cbean.MemberWithdrawalCB"; }
    def getBehaviorTypeName(): String = { return "com.example.dbflute.scala.dbflute.exbhv.MemberWithdrawalBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    def getEntityType(): Class[DbleMemberWithdrawal] = { return classOf[DbleMemberWithdrawal]; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    def newEntity(): DbleMemberWithdrawal = { return new DbleMemberWithdrawal(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    def acceptPrimaryKeyMap(et: Entity, mp: Map[String, _]): Unit =
    { doAcceptPrimaryKeyMap(et.asInstanceOf[DbleMemberWithdrawal], mp); }
    def acceptAllColumnMap(et: Entity, mp: Map[String, _]): Unit =
    { doAcceptAllColumnMap(et.asInstanceOf[DbleMemberWithdrawal], mp); }
    def extractPrimaryKeyMap(et: Entity): Map[String, Object] = { return doExtractPrimaryKeyMap(et); }
    def extractAllColumnMap(et: Entity): Map[String, Object] = { return doExtractAllColumnMap(et); }
}
