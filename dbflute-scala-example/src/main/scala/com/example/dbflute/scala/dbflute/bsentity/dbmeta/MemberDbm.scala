package com.example.dbflute.scala.dbflute.bsentity.dbmeta;

// #avoided same name type
import java.lang.Long;
import java.math.BigDecimal;

import java.util.List;
import java.util.Map;
import java.util.HashMap

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.optional.OptionalEntity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.AbstractDBMeta._;
import org.seasar.dbflute.dbmeta.DBMeta.OptimisticLockType
import org.seasar.dbflute.dbmeta.PropertyGateway;
import org.seasar.dbflute.dbmeta.info._;
import org.seasar.dbflute.dbmeta.name._;
import org.seasar.dbflute.jdbc.Classification;
import com.example.dbflute.scala.dbflute.allcommon._;
import com.example.dbflute.scala.dbflute.exentity._;

/**
 * The DB meta of MEMBER. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
object MemberDbm extends AbstractDBMeta {

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
        setupEpg(_epgMap, new EpgMemberAccount(), "memberAccount");
        setupEpg(_epgMap, new EpgMemberStatusCode(), "memberStatusCode");
        setupEpg(_epgMap, new EpgFormalizedDatetime(), "formalizedDatetime");
        setupEpg(_epgMap, new EpgBirthdate(), "birthdate");
        setupEpg(_epgMap, new EpgRegisterDatetime(), "registerDatetime");
        setupEpg(_epgMap, new EpgRegisterUser(), "registerUser");
        setupEpg(_epgMap, new EpgUpdateDatetime(), "updateDatetime");
        setupEpg(_epgMap, new EpgUpdateUser(), "updateUser");
        setupEpg(_epgMap, new EpgVersionNo(), "versionNo");
    }
    class EpgMemberId extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[Member].getMemberId(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[Member].setMemberId(dgcti(vl)); }
    }
    class EpgMemberName extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[Member].getMemberName(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[Member].setMemberName(vl.asInstanceOf[String]); }
    }
    class EpgMemberAccount extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[Member].getMemberAccount(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[Member].setMemberAccount(vl.asInstanceOf[String]); }
    }
    class EpgMemberStatusCode extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[Member].getMemberStatusCode(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[Member].setMemberStatusCode(vl.asInstanceOf[String]); }
    }
    class EpgFormalizedDatetime extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[Member].getFormalizedDatetime(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[Member].setFormalizedDatetime(vl.asInstanceOf[java.sql.Timestamp]); }
    }
    class EpgBirthdate extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[Member].getBirthdate(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[Member].setBirthdate(vl.asInstanceOf[java.util.Date]); }
    }
    class EpgRegisterDatetime extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[Member].getRegisterDatetime(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[Member].setRegisterDatetime(vl.asInstanceOf[java.sql.Timestamp]); }
    }
    class EpgRegisterUser extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[Member].getRegisterUser(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[Member].setRegisterUser(vl.asInstanceOf[String]); }
    }
    class EpgUpdateDatetime extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[Member].getUpdateDatetime(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[Member].setUpdateDatetime(vl.asInstanceOf[java.sql.Timestamp]); }
    }
    class EpgUpdateUser extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[Member].getUpdateUser(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[Member].setUpdateUser(vl.asInstanceOf[String]); }
    }
    class EpgVersionNo extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[Member].getVersionNo(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[Member].setVersionNo(dgctl(vl)); }
    }
    // #avoided delegating to protected static (illegal access error if directly call)
    def dgcti(vl: Object): Integer = { cti(vl); }
    def dgctl(vl: Object): Long = { ctl(vl); }
    def dgctb(vl: Object): BigDecimal = { ctb(vl); }
    def dgctn[NUMBER <: Number](vl: Object, tp: Class[NUMBER]): Number = { ctn(vl, tp); }
    def dggcls(col: ColumnInfo, cd: Object): Classification = { gcls(col, cd); }
    def dgccls(col: ColumnInfo, cd: Object): Unit = { ccls(col, cd); }
    override def findPropertyGateway(prop: String): PropertyGateway = { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected val _efpgMap: Map[String, PropertyGateway] = newHashMap();
    {
        setupEfpg(_efpgMap, new EfpgMemberStatus(), "memberStatus");
    }
    class EfpgMemberStatus extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[Member].getMemberStatus(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[Member].setMemberStatus(vl.asInstanceOf[OptionalEntity[MemberStatus]]); }
    }
    {
        setupEfpg(_efpgMap, new EfpgMemberServiceAsOne(), "memberServiceAsOne");
    }
    class EfpgMemberServiceAsOne extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[Member].getMemberServiceAsOne(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[Member].setMemberServiceAsOne(vl.asInstanceOf[OptionalEntity[MemberService]]); }
    }
    override def findForeignPropertyGateway(prop: String): PropertyGateway = { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected val _tableDbName: String = "MEMBER";
    protected val _tablePropertyName: String = "member";
    protected val _tableSqlName: TableSqlName = new TableSqlName("EXAMPLEDB.PUBLIC.MEMBER", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getTableSqlNameFilter()); }
    def getTableDbName(): String = { return _tableDbName; }
    def getTablePropertyName(): String = { return _tablePropertyName; }
    def getTableSqlName(): TableSqlName = { return _tableSqlName; }
    protected val _tableAlias: String = "会員";
    override def getTableAlias(): String = { return _tableAlias; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected val _columnMemberId: ColumnInfo = cci("MEMBER_ID", "MEMBER_ID", null, "会員ID", classOf[Integer], "memberId", null, true, true, true, "INTEGER", 10, 0, "NEXT VALUE FOR PUBLIC.SYSTEM_SEQUENCE_52943728_871A_4F3B_AF10_627A00C2BFD9", false, null, null, null, "purchaseList", null);
    protected val _columnMemberName: ColumnInfo = cci("MEMBER_NAME", "MEMBER_NAME", null, "会員名称", classOf[String], "memberName", null, false, false, true, "VARCHAR", 200, 0, null, false, null, null, null, null, null);
    protected val _columnMemberAccount: ColumnInfo = cci("MEMBER_ACCOUNT", "MEMBER_ACCOUNT", null, "会員アカウント", classOf[String], "memberAccount", null, false, false, true, "VARCHAR", 50, 0, null, false, null, null, null, null, null);
    protected val _columnMemberStatusCode: ColumnInfo = cci("MEMBER_STATUS_CODE", "MEMBER_STATUS_CODE", null, "会員ステータスコード", classOf[String], "memberStatusCode", null, false, false, true, "CHAR", 3, 0, null, false, null, null, "memberStatus", null, CDef.DefMeta.MemberStatus);
    protected val _columnFormalizedDatetime: ColumnInfo = cci("FORMALIZED_DATETIME", "FORMALIZED_DATETIME", null, "正式会員日時", classOf[java.sql.Timestamp], "formalizedDatetime", null, false, false, false, "TIMESTAMP", 23, 10, null, false, null, null, null, null, null);
    protected val _columnBirthdate: ColumnInfo = cci("BIRTHDATE", "BIRTHDATE", null, "生年月日", classOf[java.util.Date], "birthdate", null, false, false, false, "DATE", 8, 0, null, false, null, null, null, null, null);
    protected val _columnRegisterDatetime: ColumnInfo = cci("REGISTER_DATETIME", "REGISTER_DATETIME", null, "登録日時", classOf[java.sql.Timestamp], "registerDatetime", null, false, false, true, "TIMESTAMP", 23, 10, null, true, null, null, null, null, null);
    protected val _columnRegisterUser: ColumnInfo = cci("REGISTER_USER", "REGISTER_USER", null, "登録ユーザ", classOf[String], "registerUser", null, false, false, true, "VARCHAR", 200, 0, null, true, null, null, null, null, null);
    protected val _columnUpdateDatetime: ColumnInfo = cci("UPDATE_DATETIME", "UPDATE_DATETIME", null, "更新日時", classOf[java.sql.Timestamp], "updateDatetime", null, false, false, true, "TIMESTAMP", 23, 10, null, true, null, null, null, null, null);
    protected val _columnUpdateUser: ColumnInfo = cci("UPDATE_USER", "UPDATE_USER", null, "更新ユーザ", classOf[String], "updateUser", null, false, false, true, "VARCHAR", 200, 0, null, true, null, null, null, null, null);
    protected val _columnVersionNo: ColumnInfo = cci("VERSION_NO", "VERSION_NO", null, "バージョンNO", classOf[Long], "versionNo", null, false, false, true, "BIGINT", 19, 0, null, false, OptimisticLockType.VERSION_NO, null, null, null, null);

    def columnMemberId(): ColumnInfo = { return _columnMemberId; }
    def columnMemberName(): ColumnInfo = { return _columnMemberName; }
    def columnMemberAccount(): ColumnInfo = { return _columnMemberAccount; }
    def columnMemberStatusCode(): ColumnInfo = { return _columnMemberStatusCode; }
    def columnFormalizedDatetime(): ColumnInfo = { return _columnFormalizedDatetime; }
    def columnBirthdate(): ColumnInfo = { return _columnBirthdate; }
    def columnRegisterDatetime(): ColumnInfo = { return _columnRegisterDatetime; }
    def columnRegisterUser(): ColumnInfo = { return _columnRegisterUser; }
    def columnUpdateDatetime(): ColumnInfo = { return _columnUpdateDatetime; }
    def columnUpdateUser(): ColumnInfo = { return _columnUpdateUser; }
    def columnVersionNo(): ColumnInfo = { return _columnVersionNo; }

    protected def ccil(): List[ColumnInfo] = {
        val ls: List[ColumnInfo] = newArrayList();
        ls.add(columnMemberId());
        ls.add(columnMemberName());
        ls.add(columnMemberAccount());
        ls.add(columnMemberStatusCode());
        ls.add(columnFormalizedDatetime());
        ls.add(columnBirthdate());
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
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    def foreignMemberStatus(): ForeignInfo = {
        val mp: Map[ColumnInfo, ColumnInfo] = newLinkedHashMap(columnMemberStatusCode(), MemberStatusDbm.columnMemberStatusCode());
        return cfi("FK_MEMBER_MEMBER_STATUS", "memberStatus", this, MemberStatusDbm, mp, 0, classOf[org.seasar.dbflute.optional.OptionalEntity[_]], false, false, false, false, null, null, false, "memberList");
    }
    def foreignMemberServiceAsOne(): ForeignInfo = {
        val mp: Map[ColumnInfo, ColumnInfo] = newLinkedHashMap(columnMemberId(), MemberServiceDbm.columnMemberId());
        return cfi("FK_MEMBER_SERVICE_MEMBER", "memberServiceAsOne", this, MemberServiceDbm, mp, 1, classOf[org.seasar.dbflute.optional.OptionalEntity[_]], true, false, true, false, null, null, false, "member");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    def referrerPurchaseList(): ReferrerInfo = {
        val mp: Map[ColumnInfo, ColumnInfo] = newLinkedHashMap(columnMemberId(), PurchaseDbm.columnMemberId());
        return cri("FK_PURCHASE_MEMBER", "purchaseList", this, PurchaseDbm, mp, false, "member");
    }

    override def getReferrerPropertyListType(): Class[_] = {
        return classOf[scala.collection.immutable.List[_]];
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    override def hasIdentity(): Boolean = { return true; }
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
    def getEntityTypeName(): String = { return "com.example.dbflute.scala.dbflute.exentity.Member"; }
    def getConditionBeanTypeName(): String = { return "com.example.dbflute.scala.dbflute.cbean.MemberCB"; }
    def getBehaviorTypeName(): String = { return "com.example.dbflute.scala.dbflute.exbhv.MemberBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    def getEntityType(): Class[Member] = { return classOf[Member]; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    def newEntity(): Entity = { return newMyEntity(); }
    def newMyEntity(): Member = { return new Member(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    def acceptPrimaryKeyMap(et: Entity, mp: Map[String, _]): Unit =
    { doAcceptPrimaryKeyMap(et.asInstanceOf[Member], mp); }
    def acceptAllColumnMap(et: Entity, mp: Map[String, _]): Unit =
    { doAcceptAllColumnMap(et.asInstanceOf[Member], mp); }
    def extractPrimaryKeyMap(et: Entity): Map[String, Object] = { return doExtractPrimaryKeyMap(et); }
    def extractAllColumnMap(et: Entity): Map[String, Object] = { return doExtractAllColumnMap(et); }
}
