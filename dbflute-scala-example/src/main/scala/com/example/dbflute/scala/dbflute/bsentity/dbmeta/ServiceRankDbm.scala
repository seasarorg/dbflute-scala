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
import org.seasar.dbflute.dbmeta.info._
import org.seasar.dbflute.dbmeta.name._
import org.seasar.dbflute.jdbc.Classification;
import com.example.dbflute.scala.dbflute.allcommon._
import com.example.dbflute.scala.dbflute.exentity._

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
    protected val _epgMap: Map[String, PropertyGateway] = newHashMap();
    {
        setupEpg(_epgMap, new EpgServiceRankCode(), "serviceRankCode");
        setupEpg(_epgMap, new EpgServiceRankName(), "serviceRankName");
        setupEpg(_epgMap, new EpgServicePointIncidence(), "servicePointIncidence");
        setupEpg(_epgMap, new EpgNewAcceptableFlg(), "newAcceptableFlg");
        setupEpg(_epgMap, new EpgDescription(), "description");
        setupEpg(_epgMap, new EpgDisplayOrder(), "displayOrder");
    }
    def findPropertyGateway(propertyName: String): PropertyGateway = { return doFindEpg(_epgMap, propertyName); }
    class EpgServiceRankCode extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[ServiceRank].getServiceRankCode(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[ServiceRank].setServiceRankCode(vl.asInstanceOf[String]); }
    }
    class EpgServiceRankName extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[ServiceRank].getServiceRankName(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[ServiceRank].setServiceRankName(vl.asInstanceOf[String]); }
    }
    class EpgServicePointIncidence extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[ServiceRank].getServicePointIncidence(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[ServiceRank].setServicePointIncidence(dgctb(vl)); }
    }
    class EpgNewAcceptableFlg extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[ServiceRank].getNewAcceptableFlg(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[ServiceRank].setNewAcceptableFlg(dgcti(vl)); }
    }
    class EpgDescription extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[ServiceRank].getDescription(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[ServiceRank].setDescription(vl.asInstanceOf[String]); }
    }
    class EpgDisplayOrder extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[ServiceRank].getDisplayOrder(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[ServiceRank].setDisplayOrder(dgcti(vl)); }
    }

    // #avoided delegating to protected static (illegal access error if directly call)
    def dgcti(vl: Object): Integer = { cti(vl); }
    def dgctl(vl: Object): Long = { ctl(vl); }
    def dgctb(vl: Object): BigDecimal = { ctb(vl); }
    def dgctn[NUMBER <: Number](vl: Object, tp: Class[NUMBER]): Number = { ctn(vl, tp); }
    def dggcls(col: ColumnInfo, cd: Object): Classification = { gcls(col, cd); }
    def dgccls(col: ColumnInfo, cd: Object): Unit = { ccls(col, cd); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected val _tableDbName: String = "SERVICE_RANK";
    protected val _tablePropertyName: String = "serviceRank";
    protected val _tableSqlName: TableSqlName = new TableSqlName("EXAMPLEDB.PUBLIC.SERVICE_RANK", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getTableSqlNameFilter()); }
    def getTableDbName(): String = { return _tableDbName; }
    def getTablePropertyName(): String = { return _tablePropertyName; }
    def getTableSqlName(): TableSqlName = { return _tableSqlName; }
    protected val _tableAlias: String = "サービスランク";
    override def getTableAlias(): String = { return _tableAlias; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected val _columnServiceRankCode: ColumnInfo = cci("SERVICE_RANK_CODE", "SERVICE_RANK_CODE", null, "サービスランクコード", true, "serviceRankCode", classOf[String], true, false, "CHAR", 3, 0, null, false, null, null, null, "memberServiceList", CDef.DefMeta.ServiceRank);
    protected val _columnServiceRankName: ColumnInfo = cci("SERVICE_RANK_NAME", "SERVICE_RANK_NAME", null, "サービスランク名称", true, "serviceRankName", classOf[String], false, false, "VARCHAR", 50, 0, null, false, null, null, null, null, null);
    protected val _columnServicePointIncidence: ColumnInfo = cci("SERVICE_POINT_INCIDENCE", "SERVICE_POINT_INCIDENCE", null, "サービスポイント発生率", true, "servicePointIncidence", classOf[java.math.BigDecimal], false, false, "DECIMAL", 5, 3, null, false, null, null, null, null, null);
    protected val _columnNewAcceptableFlg: ColumnInfo = cci("NEW_ACCEPTABLE_FLG", "NEW_ACCEPTABLE_FLG", null, "新規受け入れ可能フラグ", true, "newAcceptableFlg", classOf[Integer], false, false, "INTEGER", 10, 0, null, false, null, null, null, null, CDef.DefMeta.Flg);
    protected val _columnDescription: ColumnInfo = cci("DESCRIPTION", "DESCRIPTION", null, "説明", true, "description", classOf[String], false, false, "VARCHAR", 200, 0, null, false, null, null, null, null, null);
    protected val _columnDisplayOrder: ColumnInfo = cci("DISPLAY_ORDER", "DISPLAY_ORDER", null, "表示順", true, "displayOrder", classOf[Integer], false, false, "INTEGER", 10, 0, null, false, null, null, null, null, null);

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
    def hasPrimaryKey(): Boolean = { return true; }
    def hasCompoundPrimaryKey(): Boolean = { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
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

    override def getReferrerPropertyListType(): Class[_] = {
        return classOf[scala.collection.immutable.List[_]];
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    def getEntityTypeName(): String = { return "com.example.dbflute.scala.dbflute.exentity.ServiceRank"; }
    def getConditionBeanTypeName(): String = { return "com.example.dbflute.scala.dbflute.cbean.ServiceRankCB"; }
    def getBehaviorTypeName(): String = { return "com.example.dbflute.scala.dbflute.exbhv.ServiceRankBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    def getEntityType(): Class[ServiceRank] = { return classOf[ServiceRank]; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    def newEntity(): Entity = { return newMyEntity(); }
    def newMyEntity(): ServiceRank = { return new ServiceRank(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    def acceptPrimaryKeyMap(et: Entity, mp: Map[String, _]): Unit =
    { doAcceptPrimaryKeyMap(et.asInstanceOf[ServiceRank], mp); }
    def acceptAllColumnMap(et: Entity, mp: Map[String, _]): Unit =
    { doAcceptAllColumnMap(et.asInstanceOf[ServiceRank], mp); }
    def extractPrimaryKeyMap(et: Entity): Map[String, Object] = { return doExtractPrimaryKeyMap(et); }
    def extractAllColumnMap(et: Entity): Map[String, Object] = { return doExtractAllColumnMap(et); }
}
