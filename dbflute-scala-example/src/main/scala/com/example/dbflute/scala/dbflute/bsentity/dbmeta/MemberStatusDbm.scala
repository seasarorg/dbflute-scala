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
 * The DB meta of MEMBER_STATUS. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
object MemberStatusDbm extends AbstractDBMeta {

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
        setupEpg(_epgMap, new EpgMemberStatusCode(), "memberStatusCode");
        setupEpg(_epgMap, new EpgMemberStatusName(), "memberStatusName");
        setupEpg(_epgMap, new EpgDescription(), "description");
        setupEpg(_epgMap, new EpgDisplayOrder(), "displayOrder");
    }
    class EpgMemberStatusCode extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleMemberStatus].getMemberStatusCode(); }
        def write(et: Entity, vl: Object): Unit = {
            val col: ColumnInfo = columnMemberStatusCode();
            dgccls(col, vl);
            val cls = dggcls(col, vl).asInstanceOf[CDef.MemberStatus];
            if (cls != null) {
                et.asInstanceOf[DbleMemberStatus].setMemberStatusCodeAsMemberStatus(cls);
            } else {
                et.asInstanceOf[DbleMemberStatus].mynativeMappingMemberStatusCode(vl.asInstanceOf[String]);
            }
        }
    }
    class EpgMemberStatusName extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleMemberStatus].getMemberStatusName(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleMemberStatus].setMemberStatusName(vl.asInstanceOf[String]); }
    }
    class EpgDescription extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleMemberStatus].getDescription(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleMemberStatus].setDescription(vl.asInstanceOf[String]); }
    }
    class EpgDisplayOrder extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleMemberStatus].getDisplayOrder(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleMemberStatus].setDisplayOrder(dgcti(vl)); }
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
    protected val _tableDbName: String = "MEMBER_STATUS";
    protected val _tablePropertyName: String = "memberStatus";
    protected val _tableSqlName: TableSqlName = new TableSqlName("MEMBER_STATUS", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getTableSqlNameFilter()); }
    def getTableDbName(): String = { return _tableDbName; }
    def getTablePropertyName(): String = { return _tablePropertyName; }
    def getTableSqlName(): TableSqlName = { return _tableSqlName; }
    protected val _tableAlias: String = "会員ステータス";
    override def getTableAlias(): String = { return _tableAlias; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected val _columnMemberStatusCode: ColumnInfo = cci("MEMBER_STATUS_CODE", "MEMBER_STATUS_CODE", null, "会員ステータスコード", classOf[String], "memberStatusCode", null, true, false, true, "CHAR", 3, 0, null, false, null, null, null, "memberList,memberLoginList", CDef.DefMeta.MemberStatus);
    protected val _columnMemberStatusName: ColumnInfo = cci("MEMBER_STATUS_NAME", "MEMBER_STATUS_NAME", null, "会員ステータス名称", classOf[String], "memberStatusName", null, false, false, true, "VARCHAR", 50, 0, null, false, null, null, null, null, null);
    protected val _columnDescription: ColumnInfo = cci("DESCRIPTION", "DESCRIPTION", null, "説明", classOf[String], "description", null, false, false, true, "VARCHAR", 200, 0, null, false, null, null, null, null, null);
    protected val _columnDisplayOrder: ColumnInfo = cci("DISPLAY_ORDER", "DISPLAY_ORDER", null, "表示順", classOf[Integer], "displayOrder", null, false, false, true, "INTEGER", 10, 0, null, false, null, null, null, null, null);

    def columnMemberStatusCode(): ColumnInfo = { return _columnMemberStatusCode; }
    def columnMemberStatusName(): ColumnInfo = { return _columnMemberStatusName; }
    def columnDescription(): ColumnInfo = { return _columnDescription; }
    def columnDisplayOrder(): ColumnInfo = { return _columnDisplayOrder; }

    protected def ccil(): List[ColumnInfo] = {
        val ls: List[ColumnInfo] = newArrayList();
        ls.add(columnMemberStatusCode());
        ls.add(columnMemberStatusName());
        ls.add(columnDescription());
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
    protected def cpui(): UniqueInfo = { return hpcpui(columnMemberStatusCode()); }
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
    def referrerMemberList(): ReferrerInfo = {
        val mp: Map[ColumnInfo, ColumnInfo] = newLinkedHashMap(columnMemberStatusCode(), MemberDbm.columnMemberStatusCode());
        return cri("FK_MEMBER_MEMBER_STATUS", "memberList", this, MemberDbm, mp, false, "memberStatus");
    }
    def referrerMemberLoginList(): ReferrerInfo = {
        val mp: Map[ColumnInfo, ColumnInfo] = newLinkedHashMap(columnMemberStatusCode(), MemberLoginDbm.columnLoginMemberStatusCode());
        return cri("FK_MEMBER_LOGIN_MEMBER_STATUS", "memberLoginList", this, MemberLoginDbm, mp, false, "memberStatus");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    def getEntityTypeName(): String = { return "com.example.dbflute.scala.dbflute.exentity.DbleMemberStatus"; }
    def getConditionBeanTypeName(): String = { return "com.example.dbflute.scala.dbflute.cbean.MemberStatusCB"; }
    def getBehaviorTypeName(): String = { return "com.example.dbflute.scala.dbflute.exbhv.MemberStatusBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    def getEntityType(): Class[DbleMemberStatus] = { return classOf[DbleMemberStatus]; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    def newEntity(): DbleMemberStatus = { return new DbleMemberStatus(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    def acceptPrimaryKeyMap(et: Entity, mp: Map[String, _]): Unit =
    { doAcceptPrimaryKeyMap(et.asInstanceOf[DbleMemberStatus], mp); }
    def acceptAllColumnMap(et: Entity, mp: Map[String, _]): Unit =
    { doAcceptAllColumnMap(et.asInstanceOf[DbleMemberStatus], mp); }
    def extractPrimaryKeyMap(et: Entity): Map[String, Object] = { return doExtractPrimaryKeyMap(et); }
    def extractAllColumnMap(et: Entity): Map[String, Object] = { return doExtractAllColumnMap(et); }
}
