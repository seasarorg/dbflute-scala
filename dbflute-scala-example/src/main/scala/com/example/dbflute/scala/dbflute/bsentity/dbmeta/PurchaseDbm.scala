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
 * The DB meta of PURCHASE. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
object PurchaseDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    def getCurrentDBDef(): DBDef = { return DBCurrent.currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected val _epgMap: Map[String, PropertyGateway] = newHashMap();
    {
        setupEpg(_epgMap, new EpgPurchaseId(), "purchaseId");
        setupEpg(_epgMap, new EpgMemberId(), "memberId");
        setupEpg(_epgMap, new EpgProductId(), "productId");
        setupEpg(_epgMap, new EpgPurchaseDatetime(), "purchaseDatetime");
        setupEpg(_epgMap, new EpgPurchaseCount(), "purchaseCount");
        setupEpg(_epgMap, new EpgPurchasePrice(), "purchasePrice");
        setupEpg(_epgMap, new EpgPaymentCompleteFlg(), "paymentCompleteFlg");
        setupEpg(_epgMap, new EpgRegisterDatetime(), "registerDatetime");
        setupEpg(_epgMap, new EpgRegisterUser(), "registerUser");
        setupEpg(_epgMap, new EpgUpdateDatetime(), "updateDatetime");
        setupEpg(_epgMap, new EpgUpdateUser(), "updateUser");
        setupEpg(_epgMap, new EpgVersionNo(), "versionNo");
    }
    def findPropertyGateway(propertyName: String): PropertyGateway = { return doFindEpg(_epgMap, propertyName); }
    class EpgPurchaseId extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[Purchase].getPurchaseId(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[Purchase].setPurchaseId(dgctl(vl)); }
    }
    class EpgMemberId extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[Purchase].getMemberId(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[Purchase].setMemberId(dgcti(vl)); }
    }
    class EpgProductId extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[Purchase].getProductId(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[Purchase].setProductId(dgcti(vl)); }
    }
    class EpgPurchaseDatetime extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[Purchase].getPurchaseDatetime(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[Purchase].setPurchaseDatetime(vl.asInstanceOf[java.sql.Timestamp]); }
    }
    class EpgPurchaseCount extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[Purchase].getPurchaseCount(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[Purchase].setPurchaseCount(dgcti(vl)); }
    }
    class EpgPurchasePrice extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[Purchase].getPurchasePrice(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[Purchase].setPurchasePrice(dgcti(vl)); }
    }
    class EpgPaymentCompleteFlg extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[Purchase].getPaymentCompleteFlg(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[Purchase].setPaymentCompleteFlg(dgcti(vl)); }
    }
    class EpgRegisterDatetime extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[Purchase].getRegisterDatetime(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[Purchase].setRegisterDatetime(vl.asInstanceOf[java.sql.Timestamp]); }
    }
    class EpgRegisterUser extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[Purchase].getRegisterUser(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[Purchase].setRegisterUser(vl.asInstanceOf[String]); }
    }
    class EpgUpdateDatetime extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[Purchase].getUpdateDatetime(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[Purchase].setUpdateDatetime(vl.asInstanceOf[java.sql.Timestamp]); }
    }
    class EpgUpdateUser extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[Purchase].getUpdateUser(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[Purchase].setUpdateUser(vl.asInstanceOf[String]); }
    }
    class EpgVersionNo extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[Purchase].getVersionNo(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[Purchase].setVersionNo(dgctl(vl)); }
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
    protected val _tableDbName: String = "PURCHASE";
    protected val _tablePropertyName: String = "purchase";
    protected val _tableSqlName: TableSqlName = new TableSqlName("EXAMPLEDB.PUBLIC.PURCHASE", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getTableSqlNameFilter()); }
    def getTableDbName(): String = { return _tableDbName; }
    def getTablePropertyName(): String = { return _tablePropertyName; }
    def getTableSqlName(): TableSqlName = { return _tableSqlName; }
    protected val _tableAlias: String = "購入";
    override def getTableAlias(): String = { return _tableAlias; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected val _columnPurchaseId: ColumnInfo = cci("PURCHASE_ID", "PURCHASE_ID", null, null, true, "purchaseId", classOf[Long], true, true, "BIGINT", 19, 0, "NEXT VALUE FOR PUBLIC.SYSTEM_SEQUENCE_875BB32E_35B1_4600_BBB7_27B2C3A4549D", false, null, null, null, null, null);
    protected val _columnMemberId: ColumnInfo = cci("MEMBER_ID", "MEMBER_ID", null, "会員ID", true, "memberId", classOf[Integer], false, false, "INTEGER", 10, 0, null, false, null, null, "member", null, null);
    protected val _columnProductId: ColumnInfo = cci("PRODUCT_ID", "PRODUCT_ID", null, "商品ID", true, "productId", classOf[Integer], false, false, "INTEGER", 10, 0, null, false, null, null, null, null, null);
    protected val _columnPurchaseDatetime: ColumnInfo = cci("PURCHASE_DATETIME", "PURCHASE_DATETIME", null, "購入日時", true, "purchaseDatetime", classOf[java.sql.Timestamp], false, false, "TIMESTAMP", 23, 10, null, false, null, null, null, null, null);
    protected val _columnPurchaseCount: ColumnInfo = cci("PURCHASE_COUNT", "PURCHASE_COUNT", null, "購入数量", true, "purchaseCount", classOf[Integer], false, false, "INTEGER", 10, 0, null, false, null, null, null, null, null);
    protected val _columnPurchasePrice: ColumnInfo = cci("PURCHASE_PRICE", "PURCHASE_PRICE", null, "購入価格", true, "purchasePrice", classOf[Integer], false, false, "INTEGER", 10, 0, null, false, null, null, null, null, null);
    protected val _columnPaymentCompleteFlg: ColumnInfo = cci("PAYMENT_COMPLETE_FLG", "PAYMENT_COMPLETE_FLG", null, "支払完了フラグ", true, "paymentCompleteFlg", classOf[Integer], false, false, "INTEGER", 10, 0, null, false, null, null, null, null, CDef.DefMeta.Flg);
    protected val _columnRegisterDatetime: ColumnInfo = cci("REGISTER_DATETIME", "REGISTER_DATETIME", null, null, true, "registerDatetime", classOf[java.sql.Timestamp], false, false, "TIMESTAMP", 23, 10, null, true, null, null, null, null, null);
    protected val _columnRegisterUser: ColumnInfo = cci("REGISTER_USER", "REGISTER_USER", null, null, true, "registerUser", classOf[String], false, false, "VARCHAR", 200, 0, null, true, null, null, null, null, null);
    protected val _columnUpdateDatetime: ColumnInfo = cci("UPDATE_DATETIME", "UPDATE_DATETIME", null, null, true, "updateDatetime", classOf[java.sql.Timestamp], false, false, "TIMESTAMP", 23, 10, null, true, null, null, null, null, null);
    protected val _columnUpdateUser: ColumnInfo = cci("UPDATE_USER", "UPDATE_USER", null, null, true, "updateUser", classOf[String], false, false, "VARCHAR", 200, 0, null, true, null, null, null, null, null);
    protected val _columnVersionNo: ColumnInfo = cci("VERSION_NO", "VERSION_NO", null, null, true, "versionNo", classOf[Long], false, false, "BIGINT", 19, 0, null, false, OptimisticLockType.VERSION_NO, null, null, null, null);

    def columnPurchaseId(): ColumnInfo = { return _columnPurchaseId; }
    def columnMemberId(): ColumnInfo = { return _columnMemberId; }
    def columnProductId(): ColumnInfo = { return _columnProductId; }
    def columnPurchaseDatetime(): ColumnInfo = { return _columnPurchaseDatetime; }
    def columnPurchaseCount(): ColumnInfo = { return _columnPurchaseCount; }
    def columnPurchasePrice(): ColumnInfo = { return _columnPurchasePrice; }
    def columnPaymentCompleteFlg(): ColumnInfo = { return _columnPaymentCompleteFlg; }
    def columnRegisterDatetime(): ColumnInfo = { return _columnRegisterDatetime; }
    def columnRegisterUser(): ColumnInfo = { return _columnRegisterUser; }
    def columnUpdateDatetime(): ColumnInfo = { return _columnUpdateDatetime; }
    def columnUpdateUser(): ColumnInfo = { return _columnUpdateUser; }
    def columnVersionNo(): ColumnInfo = { return _columnVersionNo; }

    protected def ccil(): List[ColumnInfo] = {
        val ls: List[ColumnInfo] = newArrayList();
        ls.add(columnPurchaseId());
        ls.add(columnMemberId());
        ls.add(columnProductId());
        ls.add(columnPurchaseDatetime());
        ls.add(columnPurchaseCount());
        ls.add(columnPurchasePrice());
        ls.add(columnPaymentCompleteFlg());
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
    protected def cpui(): UniqueInfo = { return hpcpui(columnPurchaseId()); }
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
        return cfi("FK_PURCHASE_MEMBER", "member", this, MemberDbm, mp, 0, false, false, false, false, null, null, false, "purchaseList");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

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
    def getEntityTypeName(): String = { return "com.example.dbflute.scala.dbflute.exentity.Purchase"; }
    def getConditionBeanTypeName(): String = { return "com.example.dbflute.scala.dbflute.cbean.PurchaseCB"; }
    def getBehaviorTypeName(): String = { return "com.example.dbflute.scala.dbflute.exbhv.PurchaseBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    def getEntityType(): Class[Purchase] = { return classOf[Purchase]; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    def newEntity(): Entity = { return newMyEntity(); }
    def newMyEntity(): Purchase = { return new Purchase(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    def acceptPrimaryKeyMap(et: Entity, mp: Map[String, _]): Unit =
    { doAcceptPrimaryKeyMap(et.asInstanceOf[Purchase], mp); }
    def acceptAllColumnMap(et: Entity, mp: Map[String, _]): Unit =
    { doAcceptAllColumnMap(et.asInstanceOf[Purchase], mp); }
    def extractPrimaryKeyMap(et: Entity): Map[String, Object] = { return doExtractPrimaryKeyMap(et); }
    def extractAllColumnMap(et: Entity): Map[String, Object] = { return doExtractAllColumnMap(et); }
}
