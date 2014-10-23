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
 * The DB meta of SERVICE_RANK. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
object ServiceRankDbm extends AbstractDBMeta {

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
        setupEpg(_epgMap, new EpgServiceRankCode(), "serviceRankCode");
        setupEpg(_epgMap, new EpgServiceRankName(), "serviceRankName");
        setupEpg(_epgMap, new EpgServicePointIncidence(), "servicePointIncidence");
        setupEpg(_epgMap, new EpgNewAcceptableFlg(), "newAcceptableFlg");
        setupEpg(_epgMap, new EpgDescription(), "description");
        setupEpg(_epgMap, new EpgDisplayOrder(), "displayOrder");
    }
    class EpgServiceRankCode extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleServiceRank].getServiceRankCode(); }
        def write(et: Entity, vl: Object): Unit = {
            val col: ColumnInfo = columnServiceRankCode();
            dgccls(col, vl);
            val cls = dggcls(col, vl).asInstanceOf[CDef.ServiceRank];
            if (cls != null) {
                et.asInstanceOf[DbleServiceRank].setServiceRankCodeAsServiceRank(cls);
            } else {
                et.asInstanceOf[DbleServiceRank].mynativeMappingServiceRankCode(vl.asInstanceOf[String]);
            }
        }
    }
    class EpgServiceRankName extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleServiceRank].getServiceRankName(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleServiceRank].setServiceRankName(vl.asInstanceOf[String]); }
    }
    class EpgServicePointIncidence extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleServiceRank].getServicePointIncidence(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleServiceRank].setServicePointIncidence(dgctb(vl)); }
    }
    class EpgNewAcceptableFlg extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleServiceRank].getNewAcceptableFlg(); }
        def write(et: Entity, vl: Object): Unit = {
            val col: ColumnInfo = columnNewAcceptableFlg();
            dgccls(col, vl);
            val cls = dggcls(col, vl).asInstanceOf[CDef.Flg];
            if (cls != null) {
                et.asInstanceOf[DbleServiceRank].setNewAcceptableFlgAsFlg(cls);
            } else {
                et.asInstanceOf[DbleServiceRank].mynativeMappingNewAcceptableFlg(dgctn(vl, classOf[Integer]));
            }
        }
    }
    class EpgDescription extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleServiceRank].getDescription(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleServiceRank].setDescription(vl.asInstanceOf[String]); }
    }
    class EpgDisplayOrder extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleServiceRank].getDisplayOrder(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleServiceRank].setDisplayOrder(dgcti(vl)); }
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
    protected val _tableDbName: String = "SERVICE_RANK";
    protected val _tablePropertyName: String = "serviceRank";
    protected val _tableSqlName: TableSqlName = new TableSqlName("SERVICE_RANK", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getTableSqlNameFilter()); }
    def getTableDbName(): String = { return _tableDbName; }
    def getTablePropertyName(): String = { return _tablePropertyName; }
    def getTableSqlName(): TableSqlName = { return _tableSqlName; }
    protected val _tableAlias: String = "サービスランク";
    override def getTableAlias(): String = { return _tableAlias; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected val _columnServiceRankCode: ColumnInfo = cci("SERVICE_RANK_CODE", "SERVICE_RANK_CODE", null, "サービスランクコード", classOf[String], "serviceRankCode", null, true, false, true, "CHAR", 3, 0, null, false, null, null, null, "memberServiceList", CDef.DefMeta.ServiceRank);
    protected val _columnServiceRankName: ColumnInfo = cci("SERVICE_RANK_NAME", "SERVICE_RANK_NAME", null, "サービスランク名称", classOf[String], "serviceRankName", null, false, false, true, "VARCHAR", 50, 0, null, false, null, null, null, null, null);
    protected val _columnServicePointIncidence: ColumnInfo = cci("SERVICE_POINT_INCIDENCE", "SERVICE_POINT_INCIDENCE", null, "サービスポイント発生率", classOf[java.math.BigDecimal], "servicePointIncidence", null, false, false, true, "DECIMAL", 5, 3, null, false, null, null, null, null, null);
    protected val _columnNewAcceptableFlg: ColumnInfo = cci("NEW_ACCEPTABLE_FLG", "NEW_ACCEPTABLE_FLG", null, "新規受け入れ可能フラグ", classOf[Integer], "newAcceptableFlg", null, false, false, true, "INTEGER", 10, 0, null, false, null, null, null, null, CDef.DefMeta.Flg);
    protected val _columnDescription: ColumnInfo = cci("DESCRIPTION", "DESCRIPTION", null, "説明", classOf[String], "description", null, false, false, true, "VARCHAR", 200, 0, null, false, null, null, null, null, null);
    protected val _columnDisplayOrder: ColumnInfo = cci("DISPLAY_ORDER", "DISPLAY_ORDER", null, "表示順", classOf[Integer], "displayOrder", null, false, false, true, "INTEGER", 10, 0, null, false, null, null, null, null, null);

    def columnServiceRankCode(): ColumnInfo = { return _columnServiceRankCode; }
    def columnServiceRankName(): ColumnInfo = { return _columnServiceRankName; }
    def columnServicePointIncidence(): ColumnInfo = { return _columnServicePointIncidence; }
    def columnNewAcceptableFlg(): ColumnInfo = { return _columnNewAcceptableFlg; }
    def columnDescription(): ColumnInfo = { return _columnDescription; }
    def columnDisplayOrder(): ColumnInfo = { return _columnDisplayOrder; }

    protected def ccil(): List[ColumnInfo] = {
        val ls: List[ColumnInfo] = newArrayList();
        ls.add(columnServiceRankCode());
        ls.add(columnServiceRankName());
        ls.add(columnServicePointIncidence());
        ls.add(columnNewAcceptableFlg());
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
    protected def cpui(): UniqueInfo = { return hpcpui(columnServiceRankCode()); }
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
    def referrerMemberServiceList(): ReferrerInfo = {
        val mp: Map[ColumnInfo, ColumnInfo] = newLinkedHashMap(columnServiceRankCode(), MemberServiceDbm.columnServiceRankCode());
        return cri("FK_MEMBER_SERVICE_SERVICE_RANK_CODE", "memberServiceList", this, MemberServiceDbm, mp, false, "serviceRank");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    def getEntityTypeName(): String = { return "com.example.dbflute.scala.dbflute.exentity.DbleServiceRank"; }
    def getConditionBeanTypeName(): String = { return "com.example.dbflute.scala.dbflute.cbean.ServiceRankCB"; }
    def getBehaviorTypeName(): String = { return "com.example.dbflute.scala.dbflute.exbhv.ServiceRankBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    def getEntityType(): Class[DbleServiceRank] = { return classOf[DbleServiceRank]; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    def newEntity(): DbleServiceRank = { return new DbleServiceRank(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    def acceptPrimaryKeyMap(et: Entity, mp: Map[String, _]): Unit =
    { doAcceptPrimaryKeyMap(et.asInstanceOf[DbleServiceRank], mp); }
    def acceptAllColumnMap(et: Entity, mp: Map[String, _]): Unit =
    { doAcceptAllColumnMap(et.asInstanceOf[DbleServiceRank], mp); }
    def extractPrimaryKeyMap(et: Entity): Map[String, Object] = { return doExtractPrimaryKeyMap(et); }
    def extractAllColumnMap(et: Entity): Map[String, Object] = { return doExtractAllColumnMap(et); }
}
