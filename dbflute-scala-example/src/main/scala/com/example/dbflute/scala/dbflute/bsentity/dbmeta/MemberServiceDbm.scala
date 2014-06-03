package com.example.dbflute.scala.dbflute.bsentity.dbmeta;

// #avoided same name type
import java.lang.Long;
import java.math.BigDecimal;

import java.util.List;
import java.util.Map;
import java.util.HashMap

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
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
 * The DB meta of MEMBER_SERVICE. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
object MemberServiceDbm extends AbstractDBMeta {

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
        setupEpg(_epgMap, new EpgMemberServiceId(), "memberServiceId");
        setupEpg(_epgMap, new EpgMemberId(), "memberId");
        setupEpg(_epgMap, new EpgServicePointCount(), "servicePointCount");
        setupEpg(_epgMap, new EpgServiceRankCode(), "serviceRankCode");
        setupEpg(_epgMap, new EpgRegisterDatetime(), "registerDatetime");
        setupEpg(_epgMap, new EpgRegisterUser(), "registerUser");
        setupEpg(_epgMap, new EpgUpdateDatetime(), "updateDatetime");
        setupEpg(_epgMap, new EpgUpdateUser(), "updateUser");
        setupEpg(_epgMap, new EpgVersionNo(), "versionNo");
    }
    class EpgMemberServiceId extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[MbleMemberService].memberServiceId(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[MbleMemberService].memberServiceId(dgcti(vl)); }
    }
    class EpgMemberId extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[MbleMemberService].memberId(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[MbleMemberService].memberId(dgcti(vl)); }
    }
    class EpgServicePointCount extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[MbleMemberService].servicePointCount(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[MbleMemberService].servicePointCount(dgcti(vl)); }
    }
    class EpgServiceRankCode extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[MbleMemberService].serviceRankCode(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[MbleMemberService].serviceRankCode(vl.asInstanceOf[String]); }
    }
    class EpgRegisterDatetime extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[MbleMemberService].registerDatetime(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[MbleMemberService].registerDatetime(vl.asInstanceOf[java.sql.Timestamp]); }
    }
    class EpgRegisterUser extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[MbleMemberService].registerUser(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[MbleMemberService].registerUser(vl.asInstanceOf[String]); }
    }
    class EpgUpdateDatetime extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[MbleMemberService].updateDatetime(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[MbleMemberService].updateDatetime(vl.asInstanceOf[java.sql.Timestamp]); }
    }
    class EpgUpdateUser extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[MbleMemberService].updateUser(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[MbleMemberService].updateUser(vl.asInstanceOf[String]); }
    }
    class EpgVersionNo extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[MbleMemberService].versionNo(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[MbleMemberService].versionNo(dgctl(vl)); }
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
        setupEfpg(_efpgMap, new EfpgMember(), "member");
        setupEfpg(_efpgMap, new EfpgServiceRank(), "serviceRank");
    }
    class EfpgMember extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[MbleMemberService].member(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[MbleMemberService].member(vl.asInstanceOf[Option[MbleMember]]); }
    }
    class EfpgServiceRank extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[MbleMemberService].serviceRank(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[MbleMemberService].serviceRank(vl.asInstanceOf[Option[MbleServiceRank]]); }
    }
    override def findForeignPropertyGateway(prop: String): PropertyGateway = { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected val _tableDbName: String = "MEMBER_SERVICE";
    protected val _tablePropertyName: String = "memberService";
    protected val _tableSqlName: TableSqlName = new TableSqlName("EXAMPLEDB.PUBLIC.MEMBER_SERVICE", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getTableSqlNameFilter()); }
    def getTableDbName(): String = { return _tableDbName; }
    def getTablePropertyName(): String = { return _tablePropertyName; }
    def getTableSqlName(): TableSqlName = { return _tableSqlName; }
    protected val _tableAlias: String = "会員サービス";
    override def getTableAlias(): String = { return _tableAlias; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected val _columnMemberServiceId: ColumnInfo = cci("MEMBER_SERVICE_ID", "MEMBER_SERVICE_ID", null, "会員サービスID", classOf[Integer], "memberServiceId", null, true, true, true, "INTEGER", 10, 0, "NEXT VALUE FOR PUBLIC.SYSTEM_SEQUENCE_8D17D218_BC51_4839_BABE_A0866DE45DED", false, null, null, null, null, null);
    protected val _columnMemberId: ColumnInfo = cci("MEMBER_ID", "MEMBER_ID", null, "会員ID", classOf[Integer], "memberId", null, false, false, true, "INTEGER", 10, 0, null, false, null, null, "member", null, null);
    protected val _columnServicePointCount: ColumnInfo = cci("SERVICE_POINT_COUNT", "SERVICE_POINT_COUNT", null, "サービスポイント数", classOf[Integer], "servicePointCount", null, false, false, true, "INTEGER", 10, 0, null, false, null, null, null, null, null);
    protected val _columnServiceRankCode: ColumnInfo = cci("SERVICE_RANK_CODE", "SERVICE_RANK_CODE", null, "サービスランクコード", classOf[String], "serviceRankCode", null, false, false, true, "CHAR", 3, 0, null, false, null, null, "serviceRank", null, CDef.DefMeta.ServiceRank);
    protected val _columnRegisterDatetime: ColumnInfo = cci("REGISTER_DATETIME", "REGISTER_DATETIME", null, null, classOf[java.sql.Timestamp], "registerDatetime", null, false, false, true, "TIMESTAMP", 23, 10, null, true, null, null, null, null, null);
    protected val _columnRegisterUser: ColumnInfo = cci("REGISTER_USER", "REGISTER_USER", null, null, classOf[String], "registerUser", null, false, false, true, "VARCHAR", 200, 0, null, true, null, null, null, null, null);
    protected val _columnUpdateDatetime: ColumnInfo = cci("UPDATE_DATETIME", "UPDATE_DATETIME", null, null, classOf[java.sql.Timestamp], "updateDatetime", null, false, false, true, "TIMESTAMP", 23, 10, null, true, null, null, null, null, null);
    protected val _columnUpdateUser: ColumnInfo = cci("UPDATE_USER", "UPDATE_USER", null, null, classOf[String], "updateUser", null, false, false, true, "VARCHAR", 200, 0, null, true, null, null, null, null, null);
    protected val _columnVersionNo: ColumnInfo = cci("VERSION_NO", "VERSION_NO", null, null, classOf[Long], "versionNo", null, false, false, true, "BIGINT", 19, 0, null, false, OptimisticLockType.VERSION_NO, null, null, null, null);

    def columnMemberServiceId(): ColumnInfo = { return _columnMemberServiceId; }
    def columnMemberId(): ColumnInfo = { return _columnMemberId; }
    def columnServicePointCount(): ColumnInfo = { return _columnServicePointCount; }
    def columnServiceRankCode(): ColumnInfo = { return _columnServiceRankCode; }
    def columnRegisterDatetime(): ColumnInfo = { return _columnRegisterDatetime; }
    def columnRegisterUser(): ColumnInfo = { return _columnRegisterUser; }
    def columnUpdateDatetime(): ColumnInfo = { return _columnUpdateDatetime; }
    def columnUpdateUser(): ColumnInfo = { return _columnUpdateUser; }
    def columnVersionNo(): ColumnInfo = { return _columnVersionNo; }

    protected def ccil(): List[ColumnInfo] = {
        val ls: List[ColumnInfo] = newArrayList();
        ls.add(columnMemberServiceId());
        ls.add(columnMemberId());
        ls.add(columnServicePointCount());
        ls.add(columnServiceRankCode());
        ls.add(columnRegisterDatetime());
        ls.add(columnRegisterUser());
        ls.add(columnUpdateDatetime());
        ls.add(columnUpdateUser());
        ls.add(columnVersionNo());
        return ls;
    }

    { initializeInformationResource(); }

    override protected def buildPropertyGetterMethodName(propertyName: String): String = {
        return initUncap(propertyName);
    }

    override protected def buildPropertySetterMethodName(propertyName: String): String = {
        return initUncap(propertyName);
    }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected def cpui(): UniqueInfo = { return hpcpui(columnMemberServiceId()); }
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
    def foreignMember(): ForeignInfo = {
        val mp: Map[ColumnInfo, ColumnInfo] = newLinkedHashMap(columnMemberId(), MemberDbm.columnMemberId());
        return cfi("FK_MEMBER_SERVICE_MEMBER", "member", this, MemberDbm, mp, 0, classOf[Option[_]], true, false, false, false, null, null, false, "memberServiceAsOne");
    }
    def foreignServiceRank(): ForeignInfo = {
        val mp: Map[ColumnInfo, ColumnInfo] = newLinkedHashMap(columnServiceRankCode(), ServiceRankDbm.columnServiceRankCode());
        return cfi("FK_MEMBER_SERVICE_SERVICE_RANK_CODE", "serviceRank", this, ServiceRankDbm, mp, 1, classOf[Option[_]], false, false, false, false, null, null, false, "memberServiceList");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

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
    def getEntityTypeName(): String = { return "com.example.dbflute.scala.dbflute.exentity.MbleMemberService"; }
    def getConditionBeanTypeName(): String = { return "com.example.dbflute.scala.dbflute.cbean.MemberServiceCB"; }
    def getBehaviorTypeName(): String = { return "com.example.dbflute.scala.dbflute.exbhv.MemberServiceBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    def getEntityType(): Class[MbleMemberService] = { return classOf[MbleMemberService]; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    def newEntity(): Entity = { return newMyEntity(); }
    def newMyEntity(): MbleMemberService = { return new MbleMemberService(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    def acceptPrimaryKeyMap(et: Entity, mp: Map[String, _]): Unit =
    { doAcceptPrimaryKeyMap(et.asInstanceOf[MbleMemberService], mp); }
    def acceptAllColumnMap(et: Entity, mp: Map[String, _]): Unit =
    { doAcceptAllColumnMap(et.asInstanceOf[MbleMemberService], mp); }
    def extractPrimaryKeyMap(et: Entity): Map[String, Object] = { return doExtractPrimaryKeyMap(et); }
    def extractAllColumnMap(et: Entity): Map[String, Object] = { return doExtractAllColumnMap(et); }
}
