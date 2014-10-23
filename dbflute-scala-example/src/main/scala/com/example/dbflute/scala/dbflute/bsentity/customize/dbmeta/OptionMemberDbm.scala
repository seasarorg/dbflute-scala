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
 * The DB meta of OptionMember. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
object OptionMemberDbm extends AbstractDBMeta {

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
        setupEpg(_epgMap, new EpgBirthdate(), "birthdate");
        setupEpg(_epgMap, new EpgFormalizedDatetime(), "formalizedDatetime");
        setupEpg(_epgMap, new EpgMemberStatusCode(), "memberStatusCode");
        setupEpg(_epgMap, new EpgStatusDisplayOrder(), "statusDisplayOrder");
        setupEpg(_epgMap, new EpgMemberStatusName(), "memberStatusName");
        setupEpg(_epgMap, new EpgDummyFlg(), "dummyFlg");
        setupEpg(_epgMap, new EpgDummyNoflg(), "dummyNoflg");
    }
    class EpgMemberId extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleOptionMember].getMemberId(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleOptionMember].setMemberId(dgcti(vl)); }
    }
    class EpgMemberName extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleOptionMember].getMemberName(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleOptionMember].setMemberName(vl.asInstanceOf[String]); }
    }
    class EpgBirthdate extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleOptionMember].getBirthdate(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleOptionMember].setBirthdate(vl.asInstanceOf[org.joda.time.LocalDate]); }
    }
    class EpgFormalizedDatetime extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleOptionMember].getFormalizedDatetime(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleOptionMember].setFormalizedDatetime(vl.asInstanceOf[org.joda.time.LocalDateTime]); }
    }
    class EpgMemberStatusCode extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleOptionMember].getMemberStatusCode(); }
        def write(et: Entity, vl: Object): Unit = {
            val col: ColumnInfo = columnMemberStatusCode();
            dgccls(col, vl);
            val cls = dggcls(col, vl).asInstanceOf[CDef.MemberStatus];
            if (cls != null) {
                et.asInstanceOf[DbleOptionMember].setMemberStatusCodeAsMemberStatus(cls);
            } else {
                et.asInstanceOf[DbleOptionMember].mynativeMappingMemberStatusCode(vl.asInstanceOf[String]);
            }
        }
    }
    class EpgStatusDisplayOrder extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleOptionMember].getStatusDisplayOrder(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleOptionMember].setStatusDisplayOrder(dgcti(vl)); }
    }
    class EpgMemberStatusName extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleOptionMember].getMemberStatusName(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleOptionMember].setMemberStatusName(vl.asInstanceOf[String]); }
    }
    class EpgDummyFlg extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleOptionMember].getDummyFlg(); }
        def write(et: Entity, vl: Object): Unit = {
            val col: ColumnInfo = columnDummyFlg();
            dgccls(col, vl);
            val cls = dggcls(col, vl).asInstanceOf[CDef.Flg];
            if (cls != null) {
                et.asInstanceOf[DbleOptionMember].setDummyFlgAsFlg(cls);
            } else {
                et.asInstanceOf[DbleOptionMember].mynativeMappingDummyFlg(dgctn(vl, classOf[Integer]));
            }
        }
    }
    class EpgDummyNoflg extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleOptionMember].getDummyNoflg(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleOptionMember].setDummyNoflg(dgcti(vl)); }
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
    protected val _tableDbName: String = "OptionMember";
    protected val _tablePropertyName: String = "optionMember";
    protected val _tableSqlName: TableSqlName = new TableSqlName("OptionMember", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getTableSqlNameFilter()); }
    def getTableDbName(): String = { return _tableDbName; }
    def getTablePropertyName(): String = { return _tablePropertyName; }
    def getTableSqlName(): TableSqlName = { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected val _columnMemberId: ColumnInfo = cci("MEMBER_ID", "MEMBER_ID", null, "会員ID", classOf[Integer], "memberId", null, false, false, false, "INTEGER", 10, 0, null, false, null, null, null, null, null);
    protected val _columnMemberName: ColumnInfo = cci("MEMBER_NAME", "MEMBER_NAME", null, "会員名称", classOf[String], "memberName", null, false, false, false, "VARCHAR", 200, 0, null, false, null, null, null, null, null);
    protected val _columnBirthdate: ColumnInfo = cci("BIRTHDATE", "BIRTHDATE", null, "生年月日", classOf[org.joda.time.LocalDate], "birthdate", null, false, false, false, "DATE", 8, 0, null, false, null, null, null, null, null);
    protected val _columnFormalizedDatetime: ColumnInfo = cci("FORMALIZED_DATETIME", "FORMALIZED_DATETIME", null, "正式会員日時", classOf[org.joda.time.LocalDateTime], "formalizedDatetime", null, false, false, false, "TIMESTAMP", 23, 10, null, false, null, null, null, null, null);
    protected val _columnMemberStatusCode: ColumnInfo = cci("MEMBER_STATUS_CODE", "MEMBER_STATUS_CODE", null, "会員ステータスコード", classOf[String], "memberStatusCode", null, false, false, false, "CHAR", 3, 0, null, false, null, null, null, null, CDef.DefMeta.MemberStatus);
    protected val _columnStatusDisplayOrder: ColumnInfo = cci("STATUS_DISPLAY_ORDER", "STATUS_DISPLAY_ORDER", null, "表示順", classOf[Integer], "statusDisplayOrder", null, false, false, false, "INTEGER", 10, 0, null, false, null, null, null, null, null);
    protected val _columnMemberStatusName: ColumnInfo = cci("MEMBER_STATUS_NAME", "MEMBER_STATUS_NAME", null, "会員ステータス名称", classOf[String], "memberStatusName", null, false, false, false, "VARCHAR", 50, 0, null, false, null, null, null, null, null);
    protected val _columnDummyFlg: ColumnInfo = cci("DUMMY_FLG", "DUMMY_FLG", null, null, classOf[Integer], "dummyFlg", null, false, false, false, "INTEGER", 10, 0, null, false, null, null, null, null, CDef.DefMeta.Flg);
    protected val _columnDummyNoflg: ColumnInfo = cci("DUMMY_NOFLG", "DUMMY_NOFLG", null, null, classOf[Integer], "dummyNoflg", null, false, false, false, "INTEGER", 10, 0, null, false, null, null, null, null, null);

    def columnMemberId(): ColumnInfo = { return _columnMemberId; }
    def columnMemberName(): ColumnInfo = { return _columnMemberName; }
    def columnBirthdate(): ColumnInfo = { return _columnBirthdate; }
    def columnFormalizedDatetime(): ColumnInfo = { return _columnFormalizedDatetime; }
    def columnMemberStatusCode(): ColumnInfo = { return _columnMemberStatusCode; }
    def columnStatusDisplayOrder(): ColumnInfo = { return _columnStatusDisplayOrder; }
    def columnMemberStatusName(): ColumnInfo = { return _columnMemberStatusName; }
    def columnDummyFlg(): ColumnInfo = { return _columnDummyFlg; }
    def columnDummyNoflg(): ColumnInfo = { return _columnDummyNoflg; }

    protected def ccil(): List[ColumnInfo] = {
        val ls: List[ColumnInfo] = newArrayList();
        ls.add(columnMemberId());
        ls.add(columnMemberName());
        ls.add(columnBirthdate());
        ls.add(columnFormalizedDatetime());
        ls.add(columnMemberStatusCode());
        ls.add(columnStatusDisplayOrder());
        ls.add(columnMemberStatusName());
        ls.add(columnDummyFlg());
        ls.add(columnDummyNoflg());
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
    def getEntityTypeName(): String = { return "com.example.dbflute.scala.dbflute.exentity.customize.DbleOptionMember"; }
    def getConditionBeanTypeName(): String = { return null; }
    def getBehaviorTypeName(): String = { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    def getEntityType(): Class[DbleOptionMember] = { return classOf[DbleOptionMember]; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    def newEntity(): DbleOptionMember = { return new DbleOptionMember(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    def acceptPrimaryKeyMap(et: Entity, mp: Map[String, _]): Unit =
    { doAcceptPrimaryKeyMap(et.asInstanceOf[DbleOptionMember], mp); }
    def acceptAllColumnMap(et: Entity, mp: Map[String, _]): Unit =
    { doAcceptAllColumnMap(et.asInstanceOf[DbleOptionMember], mp); }
    def extractPrimaryKeyMap(et: Entity): Map[String, Object] = { return doExtractPrimaryKeyMap(et); }
    def extractAllColumnMap(et: Entity): Map[String, Object] = { return doExtractAllColumnMap(et); }
}
