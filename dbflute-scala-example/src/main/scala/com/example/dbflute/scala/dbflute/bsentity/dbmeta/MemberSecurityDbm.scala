package com.example.dbflute.scala.dbflute.bsentity.dbmeta;

import java.lang.Long;
import java.util.List;
import java.util.Map;
import java.util.HashMap

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.AbstractDBMeta._;
import org.seasar.dbflute.dbmeta.DBMeta.OptimisticLockType
import org.seasar.dbflute.dbmeta.PropertyGateway;
import org.seasar.dbflute.dbmeta.info._
import org.seasar.dbflute.dbmeta.name._
import org.seasar.dbflute.jdbc.Classification;
import com.example.dbflute.scala.dbflute.allcommon._
import com.example.dbflute.scala.dbflute.exentity._

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
    def findPropertyGateway(propertyName: String): PropertyGateway = { return doFindEpg(_epgMap, propertyName); }
    class EpgMemberId extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[MemberSecurity].getMemberId(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[MemberSecurity].setMemberId(dgcti(vl)); }
    }
    class EpgLoginPassword extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[MemberSecurity].getLoginPassword(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[MemberSecurity].setLoginPassword(vl.asInstanceOf[String]); }
    }
    class EpgReminderQuestion extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[MemberSecurity].getReminderQuestion(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[MemberSecurity].setReminderQuestion(vl.asInstanceOf[String]); }
    }
    class EpgReminderAnswer extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[MemberSecurity].getReminderAnswer(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[MemberSecurity].setReminderAnswer(vl.asInstanceOf[String]); }
    }
    class EpgReminderUseCount extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[MemberSecurity].getReminderUseCount(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[MemberSecurity].setReminderUseCount(dgcti(vl)); }
    }
    class EpgRegisterDatetime extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[MemberSecurity].getRegisterDatetime(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[MemberSecurity].setRegisterDatetime(vl.asInstanceOf[java.sql.Timestamp]); }
    }
    class EpgRegisterUser extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[MemberSecurity].getRegisterUser(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[MemberSecurity].setRegisterUser(vl.asInstanceOf[String]); }
    }
    class EpgUpdateDatetime extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[MemberSecurity].getUpdateDatetime(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[MemberSecurity].setUpdateDatetime(vl.asInstanceOf[java.sql.Timestamp]); }
    }
    class EpgUpdateUser extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[MemberSecurity].getUpdateUser(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[MemberSecurity].setUpdateUser(vl.asInstanceOf[String]); }
    }
    class EpgVersionNo extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[MemberSecurity].getVersionNo(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[MemberSecurity].setVersionNo(dgctl(vl)); }
    }

    // delegating to protected static (illegal access error if directly call)
    def dgcti(vl: Object): Integer = { cti(vl); }
    def dgctl(vl: Object): Long = { ctl(vl); }
    def dgctb(vl: Object): BigDecimal = { ctb(vl); }
    def dgctn[NUMBER <: Number](vl: Object, tp: Class[NUMBER]): Number = { ctn(vl, tp); }
    def dggcls(col: ColumnInfo, cd: Object): Classification = { gcls(col, cd); }
    def dgccls(col: ColumnInfo, cd: Object): Unit = { ccls(col, cd); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected val _tableDbName: String = "MEMBER_SECURITY";
    protected val _tablePropertyName: String = "memberSecurity";
    protected val _tableSqlName: TableSqlName = new TableSqlName("EXAMPLEDB.PUBLIC.MEMBER_SECURITY", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getTableSqlNameFilter()); }
    def getTableDbName(): String = { return _tableDbName; }
    def getTablePropertyName(): String = { return _tablePropertyName; }
    def getTableSqlName(): TableSqlName = { return _tableSqlName; }
    protected val _tableAlias: String = "会員セキュリティ情報";
    override def getTableAlias(): String = { return _tableAlias; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected val _columnMemberId: ColumnInfo = cci("MEMBER_ID", "MEMBER_ID", null, "会員ID", true, "memberId", classOf[Integer], true, false, "INTEGER", 10, 0, null, false, null, null, "member", null, null);
    protected val _columnLoginPassword: ColumnInfo = cci("LOGIN_PASSWORD", "LOGIN_PASSWORD", null, "ログインパスワード", true, "loginPassword", classOf[String], false, false, "VARCHAR", 50, 0, null, false, null, null, null, null, null);
    protected val _columnReminderQuestion: ColumnInfo = cci("REMINDER_QUESTION", "REMINDER_QUESTION", null, "リマインダ質問", true, "reminderQuestion", classOf[String], false, false, "VARCHAR", 50, 0, null, false, null, null, null, null, null);
    protected val _columnReminderAnswer: ColumnInfo = cci("REMINDER_ANSWER", "REMINDER_ANSWER", null, "リマインダ回答", true, "reminderAnswer", classOf[String], false, false, "VARCHAR", 50, 0, null, false, null, null, null, null, null);
    protected val _columnReminderUseCount: ColumnInfo = cci("REMINDER_USE_COUNT", "REMINDER_USE_COUNT", null, "リマインダ利用回数", true, "reminderUseCount", classOf[Integer], false, false, "INTEGER", 10, 0, null, false, null, null, null, null, null);
    protected val _columnRegisterDatetime: ColumnInfo = cci("REGISTER_DATETIME", "REGISTER_DATETIME", null, null, true, "registerDatetime", classOf[java.sql.Timestamp], false, false, "TIMESTAMP", 23, 10, null, true, null, null, null, null, null);
    protected val _columnRegisterUser: ColumnInfo = cci("REGISTER_USER", "REGISTER_USER", null, null, true, "registerUser", classOf[String], false, false, "VARCHAR", 200, 0, null, true, null, null, null, null, null);
    protected val _columnUpdateDatetime: ColumnInfo = cci("UPDATE_DATETIME", "UPDATE_DATETIME", null, null, true, "updateDatetime", classOf[java.sql.Timestamp], false, false, "TIMESTAMP", 23, 10, null, true, null, null, null, null, null);
    protected val _columnUpdateUser: ColumnInfo = cci("UPDATE_USER", "UPDATE_USER", null, null, true, "updateUser", classOf[String], false, false, "VARCHAR", 200, 0, null, true, null, null, null, null, null);
    protected val _columnVersionNo: ColumnInfo = cci("VERSION_NO", "VERSION_NO", null, null, true, "versionNo", classOf[Long], false, false, "BIGINT", 19, 0, null, false, OptimisticLockType.VERSION_NO, null, null, null, null);

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
    def hasPrimaryKey(): Boolean = { return true; }
    def hasCompoundPrimaryKey(): Boolean = { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    def foreignMember(): ForeignInfo = {
        val mp: Map[ColumnInfo, ColumnInfo] = newLinkedHashMap(columnMemberId(), MemberDbm.columnMemberId());
        return cfi("FK_MEMBER_SECURITY_MEMBER", "member", this, MemberDbm, mp, 0, true, false, false, false, null, null, false, "memberSecurityAsOne");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    override def hasVersionNo(): Boolean = { return true; }
    override def getVersionNoColumnInfo(): ColumnInfo = { return _columnVersionNo; }
    override def hasCommonColumn(): Boolean = { return true; }
    override def getCommonColumnInfoList(): List[ColumnInfo] =
    { return newArrayList(columnRegisterDatetime(), columnRegisterUser(), columnUpdateDatetime(), columnUpdateUser()); }
    override def getCommonColumnInfoBeforeInsertList(): List[ColumnInfo] =
    { return newArrayList(columnRegisterDatetime(), columnRegisterUser(), columnUpdateDatetime(), columnUpdateUser()); }
    override def getCommonColumnInfoBeforeUpdateList(): List[ColumnInfo] =
    { return newArrayList(columnUpdateDatetime(), columnUpdateUser()); }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    def getEntityTypeName(): String = { return "com.example.dbflute.scala.dbflute.exentity.MemberSecurity"; }
    def getConditionBeanTypeName(): String = { return "com.example.dbflute.scala.dbflute.cbean.MemberSecurityCB"; }
    def getBehaviorTypeName(): String = { return "com.example.dbflute.scala.dbflute.exbhv.MemberSecurityBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    def getEntityType(): Class[MemberSecurity] = { return classOf[MemberSecurity]; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    def newEntity(): Entity = { return newMyEntity(); }
    def newMyEntity(): MemberSecurity = { return new MemberSecurity(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    def acceptPrimaryKeyMap(et: Entity, mp: Map[String, _]): Unit =
    { doAcceptPrimaryKeyMap(et.asInstanceOf[MemberSecurity], mp); }
    def acceptAllColumnMap(et: Entity, mp: Map[String, _]): Unit =
    { doAcceptAllColumnMap(et.asInstanceOf[MemberSecurity], mp); }
    def extractPrimaryKeyMap(et: Entity): Map[String, Object] = { return doExtractPrimaryKeyMap(et); }
    def extractAllColumnMap(et: Entity): Map[String, Object] = { return doExtractAllColumnMap(et); }
}
