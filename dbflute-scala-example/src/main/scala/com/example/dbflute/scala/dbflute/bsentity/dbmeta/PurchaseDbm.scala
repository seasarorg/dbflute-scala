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
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
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
    class EpgPurchaseId extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DblePurchase].getPurchaseId(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DblePurchase].setPurchaseId(dgctl(vl)); }
    }
    class EpgMemberId extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DblePurchase].getMemberId(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DblePurchase].setMemberId(dgcti(vl)); }
    }
    class EpgProductId extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DblePurchase].getProductId(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DblePurchase].setProductId(dgcti(vl)); }
    }
    class EpgPurchaseDatetime extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DblePurchase].getPurchaseDatetime(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DblePurchase].setPurchaseDatetime(vl.asInstanceOf[org.joda.time.LocalDateTime]); }
    }
    class EpgPurchaseCount extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DblePurchase].getPurchaseCount(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DblePurchase].setPurchaseCount(dgcti(vl)); }
    }
    class EpgPurchasePrice extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DblePurchase].getPurchasePrice(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DblePurchase].setPurchasePrice(dgcti(vl)); }
    }
    class EpgPaymentCompleteFlg extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DblePurchase].getPaymentCompleteFlg(); }
        def write(et: Entity, vl: Object): Unit = {
            val col: ColumnInfo = columnPaymentCompleteFlg();
            dgccls(col, vl);
            val cls = dggcls(col, vl).asInstanceOf[CDef.Flg];
            if (cls != null) {
                et.asInstanceOf[DblePurchase].setPaymentCompleteFlgAsFlg(cls);
            } else {
                et.asInstanceOf[DblePurchase].mynativeMappingPaymentCompleteFlg(dgctn(vl, classOf[Integer]));
            }
        }
    }
    class EpgRegisterDatetime extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DblePurchase].getRegisterDatetime(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DblePurchase].setRegisterDatetime(vl.asInstanceOf[org.joda.time.LocalDateTime]); }
    }
    class EpgRegisterUser extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DblePurchase].getRegisterUser(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DblePurchase].setRegisterUser(vl.asInstanceOf[String]); }
    }
    class EpgUpdateDatetime extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DblePurchase].getUpdateDatetime(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DblePurchase].setUpdateDatetime(vl.asInstanceOf[org.joda.time.LocalDateTime]); }
    }
    class EpgUpdateUser extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DblePurchase].getUpdateUser(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DblePurchase].setUpdateUser(vl.asInstanceOf[String]); }
    }
    class EpgVersionNo extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DblePurchase].getVersionNo(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DblePurchase].setVersionNo(dgctl(vl)); }
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
        setupEfpg(_efpgMap, new EfpgMember(), "member");
        setupEfpg(_efpgMap, new EfpgProduct(), "product");
    }
    class EfpgMember extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DblePurchase].getMember(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DblePurchase].setMember(vl.asInstanceOf[Option[DbleMember]]); }
    }
    class EfpgProduct extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DblePurchase].getProduct(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DblePurchase].setProduct(vl.asInstanceOf[Option[DbleProduct]]); }
    }
    override def findForeignPropertyGateway(prop: String): PropertyGateway = { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected val _tableDbName: String = "PURCHASE";
    protected val _tablePropertyName: String = "purchase";
    protected val _tableSqlName: TableSqlName = new TableSqlName("PURCHASE", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getTableSqlNameFilter()); }
    def getTableDbName(): String = { return _tableDbName; }
    def getTablePropertyName(): String = { return _tablePropertyName; }
    def getTableSqlName(): TableSqlName = { return _tableSqlName; }
    protected val _tableAlias: String = "購入";
    override def getTableAlias(): String = { return _tableAlias; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected val _columnPurchaseId: ColumnInfo = cci("PURCHASE_ID", "PURCHASE_ID", null, null, classOf[Long], "purchaseId", null, true, true, true, "BIGINT", 19, 0, "NEXT VALUE FOR PUBLIC.SYSTEM_SEQUENCE_82C7A58D_8135_4954_A2B0_662AE23F6C1F", false, null, null, null, "purchasePaymentList", null);
    protected val _columnMemberId: ColumnInfo = cci("MEMBER_ID", "MEMBER_ID", null, "会員ID", classOf[Integer], "memberId", null, false, false, true, "INTEGER", 10, 0, null, false, null, null, "member", null, null);
    protected val _columnProductId: ColumnInfo = cci("PRODUCT_ID", "PRODUCT_ID", null, "商品ID", classOf[Integer], "productId", null, false, false, true, "INTEGER", 10, 0, null, false, null, null, "product", null, null);
    protected val _columnPurchaseDatetime: ColumnInfo = cci("PURCHASE_DATETIME", "PURCHASE_DATETIME", null, "購入日時", classOf[org.joda.time.LocalDateTime], "purchaseDatetime", null, false, false, true, "TIMESTAMP", 23, 10, null, false, null, null, null, null, null);
    protected val _columnPurchaseCount: ColumnInfo = cci("PURCHASE_COUNT", "PURCHASE_COUNT", null, "購入数量", classOf[Integer], "purchaseCount", null, false, false, true, "INTEGER", 10, 0, null, false, null, null, null, null, null);
    protected val _columnPurchasePrice: ColumnInfo = cci("PURCHASE_PRICE", "PURCHASE_PRICE", null, "購入価格", classOf[Integer], "purchasePrice", null, false, false, true, "INTEGER", 10, 0, null, false, null, null, null, null, null);
    protected val _columnPaymentCompleteFlg: ColumnInfo = cci("PAYMENT_COMPLETE_FLG", "PAYMENT_COMPLETE_FLG", null, "支払完了フラグ", classOf[Integer], "paymentCompleteFlg", null, false, false, true, "INTEGER", 10, 0, null, false, null, null, null, null, CDef.DefMeta.Flg);
    protected val _columnRegisterDatetime: ColumnInfo = cci("REGISTER_DATETIME", "REGISTER_DATETIME", null, null, classOf[org.joda.time.LocalDateTime], "registerDatetime", null, false, false, true, "TIMESTAMP", 23, 10, null, true, null, null, null, null, null);
    protected val _columnRegisterUser: ColumnInfo = cci("REGISTER_USER", "REGISTER_USER", null, null, classOf[String], "registerUser", null, false, false, true, "VARCHAR", 200, 0, null, true, null, null, null, null, null);
    protected val _columnUpdateDatetime: ColumnInfo = cci("UPDATE_DATETIME", "UPDATE_DATETIME", null, null, classOf[org.joda.time.LocalDateTime], "updateDatetime", null, false, false, true, "TIMESTAMP", 23, 10, null, true, null, null, null, null, null);
    protected val _columnUpdateUser: ColumnInfo = cci("UPDATE_USER", "UPDATE_USER", null, null, classOf[String], "updateUser", null, false, false, true, "VARCHAR", 200, 0, null, true, null, null, null, null, null);
    protected val _columnVersionNo: ColumnInfo = cci("VERSION_NO", "VERSION_NO", null, null, classOf[Long], "versionNo", null, false, false, true, "BIGINT", 19, 0, null, false, OptimisticLockType.VERSION_NO, null, null, null, null);

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
    def foreignMember(): ForeignInfo = {
        val mp: Map[ColumnInfo, ColumnInfo] = newLinkedHashMap(columnMemberId(), MemberDbm.columnMemberId());
        return cfi("FK_PURCHASE_MEMBER", "member", this, MemberDbm, mp, 0, classOf[Option[_]], false, false, false, false, null, null, false, "purchaseList");
    }
    def foreignProduct(): ForeignInfo = {
        val mp: Map[ColumnInfo, ColumnInfo] = newLinkedHashMap(columnProductId(), ProductDbm.columnProductId());
        return cfi("FK_PURCHASE_PRODUCT", "product", this, ProductDbm, mp, 1, classOf[Option[_]], false, false, false, false, null, null, false, "purchaseList");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    def referrerPurchasePaymentList(): ReferrerInfo = {
        val mp: Map[ColumnInfo, ColumnInfo] = newLinkedHashMap(columnPurchaseId(), PurchasePaymentDbm.columnPurchaseId());
        return cri("FK_PURCHASE_PAYMENT_PURCHASE", "purchasePaymentList", this, PurchasePaymentDbm, mp, false, "purchase");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    override def hasIdentity(): scala.Boolean = { return true; }
    override def hasVersionNo(): scala.Boolean = { return true; }
    override def getVersionNoColumnInfo(): ColumnInfo = { return _columnVersionNo; }
    override def hasCommonColumn(): scala.Boolean = { return true; }
    override def getCommonColumnInfoList(): List[ColumnInfo] =
    { return newArrayList(columnRegisterDatetime(), columnRegisterUser(), columnUpdateDatetime(), columnUpdateUser()); }
    override def getCommonColumnInfoBeforeInsertList(): List[ColumnInfo] =
    { return newArrayList(columnRegisterDatetime(), columnRegisterUser(), columnUpdateDatetime(), columnUpdateUser()); }
    override def getCommonColumnInfoBeforeUpdateList(): List[ColumnInfo] =
    { return newArrayList(columnUpdateDatetime(), columnUpdateUser()); }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    def getEntityTypeName(): String = { return "com.example.dbflute.scala.dbflute.exentity.DblePurchase"; }
    def getConditionBeanTypeName(): String = { return "com.example.dbflute.scala.dbflute.cbean.PurchaseCB"; }
    def getBehaviorTypeName(): String = { return "com.example.dbflute.scala.dbflute.exbhv.PurchaseBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    def getEntityType(): Class[DblePurchase] = { return classOf[DblePurchase]; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    def newEntity(): DblePurchase = { return new DblePurchase(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    def acceptPrimaryKeyMap(et: Entity, mp: Map[String, _]): Unit =
    { doAcceptPrimaryKeyMap(et.asInstanceOf[DblePurchase], mp); }
    def acceptAllColumnMap(et: Entity, mp: Map[String, _]): Unit =
    { doAcceptAllColumnMap(et.asInstanceOf[DblePurchase], mp); }
    def extractPrimaryKeyMap(et: Entity): Map[String, Object] = { return doExtractPrimaryKeyMap(et); }
    def extractAllColumnMap(et: Entity): Map[String, Object] = { return doExtractAllColumnMap(et); }
}
