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
 * The DB meta of MEMBER_SECURITY. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
object MemberSecurityDbm extends AbstractDBMeta {

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
        setupEpg(_epgMap, new EpgLoginPassword(), "loginPassword");
        setupEpg(_epgMap, new EpgReminderQuestion(), "reminderQuestion");
        setupEpg(_epgMap, new EpgReminderAnswer(), "reminderAnswer");
        setupEpg(_epgMap, new EpgReminderUseCount(), "reminderUseCount");
        setupEpg(_epgMap, new EpgRegisterDatetime(), "registerDatetime");
        setupEpg(_epgMap, new EpgRegisterUser(), "registerUser");
        setupEpg(_epgMap, new EpgUpdateDatetime(), "updateDatetime");
        setupEpg(_epgMap, new EpgUpdateUser(), "updateUser");
        setupEpg(_epgMap, new EpgVersionNo(), "versionNo");
    }
    class EpgMemberId extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleMemberSecurity].getMemberId(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleMemberSecurity].setMemberId(dgcti(vl)); }
    }
    class EpgLoginPassword extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleMemberSecurity].getLoginPassword(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleMemberSecurity].setLoginPassword(vl.asInstanceOf[String]); }
    }
    class EpgReminderQuestion extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleMemberSecurity].getReminderQuestion(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleMemberSecurity].setReminderQuestion(vl.asInstanceOf[String]); }
    }
    class EpgReminderAnswer extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleMemberSecurity].getReminderAnswer(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleMemberSecurity].setReminderAnswer(vl.asInstanceOf[String]); }
    }
    class EpgReminderUseCount extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleMemberSecurity].getReminderUseCount(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleMemberSecurity].setReminderUseCount(dgcti(vl)); }
    }
    class EpgRegisterDatetime extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleMemberSecurity].getRegisterDatetime(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleMemberSecurity].setRegisterDatetime(vl.asInstanceOf[org.joda.time.LocalDateTime]); }
    }
    class EpgRegisterUser extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleMemberSecurity].getRegisterUser(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleMemberSecurity].setRegisterUser(vl.asInstanceOf[String]); }
    }
    class EpgUpdateDatetime extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleMemberSecurity].getUpdateDatetime(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleMemberSecurity].setUpdateDatetime(vl.asInstanceOf[org.joda.time.LocalDateTime]); }
    }
    class EpgUpdateUser extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleMemberSecurity].getUpdateUser(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleMemberSecurity].setUpdateUser(vl.asInstanceOf[String]); }
    }
    class EpgVersionNo extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleMemberSecurity].getVersionNo(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleMemberSecurity].setVersionNo(dgctl(vl)); }
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
    }
    class EfpgMember extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleMemberSecurity].getMember(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleMemberSecurity].setMember(vl.asInstanceOf[Option[DbleMember]]); }
    }
    override def findForeignPropertyGateway(prop: String): PropertyGateway = { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected val _tableDbName: String = "MEMBER_SECURITY";
    protected val _tablePropertyName: String = "memberSecurity";
    protected val _tableSqlName: TableSqlName = new TableSqlName("MEMBER_SECURITY", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getTableSqlNameFilter()); }
    def getTableDbName(): String = { return _tableDbName; }
    def getTablePropertyName(): String = { return _tablePropertyName; }
    def getTableSqlName(): TableSqlName = { return _tableSqlName; }
    protected val _tableAlias: String = "会員セキュリティ情報";
    override def getTableAlias(): String = { return _tableAlias; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected val _columnMemberId: ColumnInfo = cci("MEMBER_ID", "MEMBER_ID", null, "会員ID", classOf[Integer], "memberId", null, true, false, true, "INTEGER", 10, 0, null, false, null, null, "member", null, null);
    protected val _columnLoginPassword: ColumnInfo = cci("LOGIN_PASSWORD", "LOGIN_PASSWORD", null, "ログインパスワード", classOf[String], "loginPassword", null, false, false, true, "VARCHAR", 50, 0, null, false, null, null, null, null, null);
    protected val _columnReminderQuestion: ColumnInfo = cci("REMINDER_QUESTION", "REMINDER_QUESTION", null, "リマインダ質問", classOf[String], "reminderQuestion", null, false, false, true, "VARCHAR", 50, 0, null, false, null, null, null, null, null);
    protected val _columnReminderAnswer: ColumnInfo = cci("REMINDER_ANSWER", "REMINDER_ANSWER", null, "リマインダ回答", classOf[String], "reminderAnswer", null, false, false, true, "VARCHAR", 50, 0, null, false, null, null, null, null, null);
    protected val _columnReminderUseCount: ColumnInfo = cci("REMINDER_USE_COUNT", "REMINDER_USE_COUNT", null, "リマインダ利用回数", classOf[Integer], "reminderUseCount", null, false, false, true, "INTEGER", 10, 0, null, false, null, null, null, null, null);
    protected val _columnRegisterDatetime: ColumnInfo = cci("REGISTER_DATETIME", "REGISTER_DATETIME", null, null, classOf[org.joda.time.LocalDateTime], "registerDatetime", null, false, false, true, "TIMESTAMP", 23, 10, null, true, null, null, null, null, null);
    protected val _columnRegisterUser: ColumnInfo = cci("REGISTER_USER", "REGISTER_USER", null, null, classOf[String], "registerUser", null, false, false, true, "VARCHAR", 200, 0, null, true, null, null, null, null, null);
    protected val _columnUpdateDatetime: ColumnInfo = cci("UPDATE_DATETIME", "UPDATE_DATETIME", null, null, classOf[org.joda.time.LocalDateTime], "updateDatetime", null, false, false, true, "TIMESTAMP", 23, 10, null, true, null, null, null, null, null);
    protected val _columnUpdateUser: ColumnInfo = cci("UPDATE_USER", "UPDATE_USER", null, null, classOf[String], "updateUser", null, false, false, true, "VARCHAR", 200, 0, null, true, null, null, null, null, null);
    protected val _columnVersionNo: ColumnInfo = cci("VERSION_NO", "VERSION_NO", null, null, classOf[Long], "versionNo", null, false, false, true, "BIGINT", 19, 0, null, false, OptimisticLockType.VERSION_NO, null, null, null, null);

    def columnMemberId(): ColumnInfo = { return _columnMemberId; }
    def columnLoginPassword(): ColumnInfo = { return _columnLoginPassword; }
    def columnReminderQuestion(): ColumnInfo = { return _columnReminderQuestion; }
    def columnReminderAnswer(): ColumnInfo = { return _columnReminderAnswer; }
    def columnReminderUseCount(): ColumnInfo = { return _columnReminderUseCount; }
    def columnRegisterDatetime(): ColumnInfo = { return _columnRegisterDatetime; }
    def columnRegisterUser(): ColumnInfo = { return _columnRegisterUser; }
    def columnUpdateDatetime(): ColumnInfo = { return _columnUpdateDatetime; }
    def columnUpdateUser(): ColumnInfo = { return _columnUpdateUser; }
    def columnVersionNo(): ColumnInfo = { return _columnVersionNo; }

    protected def ccil(): List[ColumnInfo] = {
        val ls: List[ColumnInfo] = newArrayList();
        ls.add(columnMemberId());
        ls.add(columnLoginPassword());
        ls.add(columnReminderQuestion());
        ls.add(columnReminderAnswer());
        ls.add(columnReminderUseCount());
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
        return cfi("FK_MEMBER_SECURITY_MEMBER", "member", this, MemberDbm, mp, 0, classOf[Option[_]], true, false, false, false, null, null, false, "memberSecurityAsOne");
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
    def getEntityTypeName(): String = { return "com.example.dbflute.scala.dbflute.exentity.DbleMemberSecurity"; }
    def getConditionBeanTypeName(): String = { return "com.example.dbflute.scala.dbflute.cbean.MemberSecurityCB"; }
    def getBehaviorTypeName(): String = { return "com.example.dbflute.scala.dbflute.exbhv.MemberSecurityBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    def getEntityType(): Class[DbleMemberSecurity] = { return classOf[DbleMemberSecurity]; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    def newEntity(): DbleMemberSecurity = { return new DbleMemberSecurity(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    def acceptPrimaryKeyMap(et: Entity, mp: Map[String, _]): Unit =
    { doAcceptPrimaryKeyMap(et.asInstanceOf[DbleMemberSecurity], mp); }
    def acceptAllColumnMap(et: Entity, mp: Map[String, _]): Unit =
    { doAcceptAllColumnMap(et.asInstanceOf[DbleMemberSecurity], mp); }
    def extractPrimaryKeyMap(et: Entity): Map[String, Object] = { return doExtractPrimaryKeyMap(et); }
    def extractAllColumnMap(et: Entity): Map[String, Object] = { return doExtractAllColumnMap(et); }
}
