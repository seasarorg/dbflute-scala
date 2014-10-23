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
 * The DB meta of PurchaseMaxPriceMember. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
object PurchaseMaxPriceMemberDbm extends AbstractDBMeta {

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
        setupEpg(_epgMap, new EpgPurchaseMaxPrice(), "purchaseMaxPrice");
        setupEpg(_epgMap, new EpgMemberStatusName(), "memberStatusName");
    }
    class EpgMemberId extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DblePurchaseMaxPriceMember].getMemberId(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DblePurchaseMaxPriceMember].setMemberId(dgcti(vl)); }
    }
    class EpgMemberName extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DblePurchaseMaxPriceMember].getMemberName(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DblePurchaseMaxPriceMember].setMemberName(vl.asInstanceOf[String]); }
    }
    class EpgPurchaseMaxPrice extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DblePurchaseMaxPriceMember].getPurchaseMaxPrice(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DblePurchaseMaxPriceMember].setPurchaseMaxPrice(dgcti(vl)); }
    }
    class EpgMemberStatusName extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DblePurchaseMaxPriceMember].getMemberStatusName(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DblePurchaseMaxPriceMember].setMemberStatusName(vl.asInstanceOf[String]); }
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
    protected val _tableDbName: String = "PurchaseMaxPriceMember";
    protected val _tablePropertyName: String = "purchaseMaxPriceMember";
    protected val _tableSqlName: TableSqlName = new TableSqlName("PurchaseMaxPriceMember", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getTableSqlNameFilter()); }
    def getTableDbName(): String = { return _tableDbName; }
    def getTablePropertyName(): String = { return _tablePropertyName; }
    def getTableSqlName(): TableSqlName = { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected val _columnMemberId: ColumnInfo = cci("MEMBER_ID", "MEMBER_ID", null, "会員ID", classOf[Integer], "memberId", null, false, false, false, "INTEGER", 10, 0, null, false, null, null, null, null, null);
    protected val _columnMemberName: ColumnInfo = cci("MEMBER_NAME", "MEMBER_NAME", null, "会員名称", classOf[String], "memberName", null, false, false, false, "VARCHAR", 200, 0, null, false, null, null, null, null, null);
    protected val _columnPurchaseMaxPrice: ColumnInfo = cci("PURCHASE_MAX_PRICE", "PURCHASE_MAX_PRICE", null, null, classOf[Integer], "purchaseMaxPrice", null, false, false, false, "INTEGER", 10, 0, null, false, null, null, null, null, null);
    protected val _columnMemberStatusName: ColumnInfo = cci("MEMBER_STATUS_NAME", "MEMBER_STATUS_NAME", null, "会員ステータス名称", classOf[String], "memberStatusName", null, false, false, false, "VARCHAR", 50, 0, null, false, null, null, null, null, null);

    def columnMemberId(): ColumnInfo = { return _columnMemberId; }
    def columnMemberName(): ColumnInfo = { return _columnMemberName; }
    def columnPurchaseMaxPrice(): ColumnInfo = { return _columnPurchaseMaxPrice; }
    def columnMemberStatusName(): ColumnInfo = { return _columnMemberStatusName; }

    protected def ccil(): List[ColumnInfo] = {
        val ls: List[ColumnInfo] = newArrayList();
        ls.add(columnMemberId());
        ls.add(columnMemberName());
        ls.add(columnPurchaseMaxPrice());
        ls.add(columnMemberStatusName());
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
    def getEntityTypeName(): String = { return "com.example.dbflute.scala.dbflute.exentity.customize.DblePurchaseMaxPriceMember"; }
    def getConditionBeanTypeName(): String = { return null; }
    def getBehaviorTypeName(): String = { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    def getEntityType(): Class[DblePurchaseMaxPriceMember] = { return classOf[DblePurchaseMaxPriceMember]; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    def newEntity(): DblePurchaseMaxPriceMember = { return new DblePurchaseMaxPriceMember(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    def acceptPrimaryKeyMap(et: Entity, mp: Map[String, _]): Unit =
    { doAcceptPrimaryKeyMap(et.asInstanceOf[DblePurchaseMaxPriceMember], mp); }
    def acceptAllColumnMap(et: Entity, mp: Map[String, _]): Unit =
    { doAcceptAllColumnMap(et.asInstanceOf[DblePurchaseMaxPriceMember], mp); }
    def extractPrimaryKeyMap(et: Entity): Map[String, Object] = { return doExtractPrimaryKeyMap(et); }
    def extractAllColumnMap(et: Entity): Map[String, Object] = { return doExtractAllColumnMap(et); }
}
