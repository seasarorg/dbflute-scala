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
 * The DB meta of MEMBER_LOGIN. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
object MemberLoginDbm extends AbstractDBMeta {

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
        setupEpg(_epgMap, new EpgMemberLoginId(), "memberLoginId");
        setupEpg(_epgMap, new EpgMemberId(), "memberId");
        setupEpg(_epgMap, new EpgLoginDatetime(), "loginDatetime");
        setupEpg(_epgMap, new EpgMobileLoginFlg(), "mobileLoginFlg");
        setupEpg(_epgMap, new EpgLoginMemberStatusCode(), "loginMemberStatusCode");
    }
    class EpgMemberLoginId extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleMemberLogin].getMemberLoginId(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleMemberLogin].setMemberLoginId(dgctl(vl)); }
    }
    class EpgMemberId extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleMemberLogin].getMemberId(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleMemberLogin].setMemberId(dgcti(vl)); }
    }
    class EpgLoginDatetime extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleMemberLogin].getLoginDatetime(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleMemberLogin].setLoginDatetime(vl.asInstanceOf[org.joda.time.LocalDateTime]); }
    }
    class EpgMobileLoginFlg extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleMemberLogin].getMobileLoginFlg(); }
        def write(et: Entity, vl: Object): Unit = {
            val col: ColumnInfo = columnMobileLoginFlg();
            dgccls(col, vl);
            val cls = dggcls(col, vl).asInstanceOf[CDef.Flg];
            if (cls != null) {
                et.asInstanceOf[DbleMemberLogin].setMobileLoginFlgAsFlg(cls);
            } else {
                et.asInstanceOf[DbleMemberLogin].mynativeMappingMobileLoginFlg(dgctn(vl, classOf[Integer]));
            }
        }
    }
    class EpgLoginMemberStatusCode extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleMemberLogin].getLoginMemberStatusCode(); }
        def write(et: Entity, vl: Object): Unit = {
            val col: ColumnInfo = columnLoginMemberStatusCode();
            dgccls(col, vl);
            val cls = dggcls(col, vl).asInstanceOf[CDef.MemberStatus];
            if (cls != null) {
                et.asInstanceOf[DbleMemberLogin].setLoginMemberStatusCodeAsMemberStatus(cls);
            } else {
                et.asInstanceOf[DbleMemberLogin].mynativeMappingLoginMemberStatusCode(vl.asInstanceOf[String]);
            }
        }
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
        setupEfpg(_efpgMap, new EfpgMemberStatus(), "memberStatus");
        setupEfpg(_efpgMap, new EfpgMember(), "member");
    }
    class EfpgMemberStatus extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleMemberLogin].getMemberStatus(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleMemberLogin].setMemberStatus(vl.asInstanceOf[Option[DbleMemberStatus]]); }
    }
    class EfpgMember extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleMemberLogin].getMember(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleMemberLogin].setMember(vl.asInstanceOf[Option[DbleMember]]); }
    }
    override def findForeignPropertyGateway(prop: String): PropertyGateway = { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected val _tableDbName: String = "MEMBER_LOGIN";
    protected val _tablePropertyName: String = "memberLogin";
    protected val _tableSqlName: TableSqlName = new TableSqlName("MEMBER_LOGIN", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getTableSqlNameFilter()); }
    def getTableDbName(): String = { return _tableDbName; }
    def getTablePropertyName(): String = { return _tablePropertyName; }
    def getTableSqlName(): TableSqlName = { return _tableSqlName; }
    protected val _tableAlias: String = "会員ログイン";
    override def getTableAlias(): String = { return _tableAlias; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected val _columnMemberLoginId: ColumnInfo = cci("MEMBER_LOGIN_ID", "MEMBER_LOGIN_ID", null, "会員ログインID", classOf[Long], "memberLoginId", null, true, true, true, "BIGINT", 19, 0, "NEXT VALUE FOR PUBLIC.SYSTEM_SEQUENCE_1091AEAA_3BDF_4A4B_A35A_0B1757CE349D", false, null, null, null, null, null);
    protected val _columnMemberId: ColumnInfo = cci("MEMBER_ID", "MEMBER_ID", null, "会員ID", classOf[Integer], "memberId", null, false, false, true, "INTEGER", 10, 0, null, false, null, null, "member", null, null);
    protected val _columnLoginDatetime: ColumnInfo = cci("LOGIN_DATETIME", "LOGIN_DATETIME", null, "ログイン日時", classOf[org.joda.time.LocalDateTime], "loginDatetime", null, false, false, true, "TIMESTAMP", 23, 10, null, false, null, null, null, null, null);
    protected val _columnMobileLoginFlg: ColumnInfo = cci("MOBILE_LOGIN_FLG", "MOBILE_LOGIN_FLG", null, "モバイルログインフラグ", classOf[Integer], "mobileLoginFlg", null, false, false, true, "INTEGER", 10, 0, null, false, null, null, null, null, CDef.DefMeta.Flg);
    protected val _columnLoginMemberStatusCode: ColumnInfo = cci("LOGIN_MEMBER_STATUS_CODE", "LOGIN_MEMBER_STATUS_CODE", null, "ログイン時会員ステータスコード", classOf[String], "loginMemberStatusCode", null, false, false, true, "CHAR", 3, 0, null, false, null, null, "memberStatus", null, CDef.DefMeta.MemberStatus);

    def columnMemberLoginId(): ColumnInfo = { return _columnMemberLoginId; }
    def columnMemberId(): ColumnInfo = { return _columnMemberId; }
    def columnLoginDatetime(): ColumnInfo = { return _columnLoginDatetime; }
    def columnMobileLoginFlg(): ColumnInfo = { return _columnMobileLoginFlg; }
    def columnLoginMemberStatusCode(): ColumnInfo = { return _columnLoginMemberStatusCode; }

    protected def ccil(): List[ColumnInfo] = {
        val ls: List[ColumnInfo] = newArrayList();
        ls.add(columnMemberLoginId());
        ls.add(columnMemberId());
        ls.add(columnLoginDatetime());
        ls.add(columnMobileLoginFlg());
        ls.add(columnLoginMemberStatusCode());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected def cpui(): UniqueInfo = { return hpcpui(columnMemberLoginId()); }
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
    def foreignMemberStatus(): ForeignInfo = {
        val mp: Map[ColumnInfo, ColumnInfo] = newLinkedHashMap(columnLoginMemberStatusCode(), MemberStatusDbm.columnMemberStatusCode());
        return cfi("FK_MEMBER_LOGIN_MEMBER_STATUS", "memberStatus", this, MemberStatusDbm, mp, 0, classOf[Option[_]], false, false, false, false, null, null, false, "memberLoginList");
    }
    def foreignMember(): ForeignInfo = {
        val mp: Map[ColumnInfo, ColumnInfo] = newLinkedHashMap(columnMemberId(), MemberDbm.columnMemberId());
        return cfi("FK_MEMBER_LOGIN_MEMBER", "member", this, MemberDbm, mp, 1, classOf[Option[_]], false, false, false, false, null, null, false, "memberLoginList");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    override def hasIdentity(): scala.Boolean = { return true; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    def getEntityTypeName(): String = { return "com.example.dbflute.scala.dbflute.exentity.DbleMemberLogin"; }
    def getConditionBeanTypeName(): String = { return "com.example.dbflute.scala.dbflute.cbean.MemberLoginCB"; }
    def getBehaviorTypeName(): String = { return "com.example.dbflute.scala.dbflute.exbhv.MemberLoginBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    def getEntityType(): Class[DbleMemberLogin] = { return classOf[DbleMemberLogin]; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    def newEntity(): DbleMemberLogin = { return new DbleMemberLogin(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    def acceptPrimaryKeyMap(et: Entity, mp: Map[String, _]): Unit =
    { doAcceptPrimaryKeyMap(et.asInstanceOf[DbleMemberLogin], mp); }
    def acceptAllColumnMap(et: Entity, mp: Map[String, _]): Unit =
    { doAcceptAllColumnMap(et.asInstanceOf[DbleMemberLogin], mp); }
    def extractPrimaryKeyMap(et: Entity): Map[String, Object] = { return doExtractPrimaryKeyMap(et); }
    def extractAllColumnMap(et: Entity): Map[String, Object] = { return doExtractAllColumnMap(et); }
}
