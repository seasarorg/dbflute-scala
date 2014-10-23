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
 * The DB meta of PURCHASE_PAYMENT. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
object PurchasePaymentDbm extends AbstractDBMeta {

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
        setupEpg(_epgMap, new EpgPurchasePaymentId(), "purchasePaymentId");
        setupEpg(_epgMap, new EpgPurchaseId(), "purchaseId");
        setupEpg(_epgMap, new EpgPaymentAmount(), "paymentAmount");
        setupEpg(_epgMap, new EpgPaymentDatetime(), "paymentDatetime");
        setupEpg(_epgMap, new EpgPaymentMethodCode(), "paymentMethodCode");
        setupEpg(_epgMap, new EpgRegisterDatetime(), "registerDatetime");
        setupEpg(_epgMap, new EpgRegisterUser(), "registerUser");
        setupEpg(_epgMap, new EpgUpdateDatetime(), "updateDatetime");
        setupEpg(_epgMap, new EpgUpdateUser(), "updateUser");
    }
    class EpgPurchasePaymentId extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DblePurchasePayment].getPurchasePaymentId(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DblePurchasePayment].setPurchasePaymentId(dgctl(vl)); }
    }
    class EpgPurchaseId extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DblePurchasePayment].getPurchaseId(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DblePurchasePayment].setPurchaseId(dgctl(vl)); }
    }
    class EpgPaymentAmount extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DblePurchasePayment].getPaymentAmount(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DblePurchasePayment].setPaymentAmount(dgctb(vl)); }
    }
    class EpgPaymentDatetime extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DblePurchasePayment].getPaymentDatetime(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DblePurchasePayment].setPaymentDatetime(vl.asInstanceOf[org.joda.time.LocalDateTime]); }
    }
    class EpgPaymentMethodCode extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DblePurchasePayment].getPaymentMethodCode(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DblePurchasePayment].setPaymentMethodCode(vl.asInstanceOf[String]); }
    }
    class EpgRegisterDatetime extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DblePurchasePayment].getRegisterDatetime(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DblePurchasePayment].setRegisterDatetime(vl.asInstanceOf[org.joda.time.LocalDateTime]); }
    }
    class EpgRegisterUser extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DblePurchasePayment].getRegisterUser(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DblePurchasePayment].setRegisterUser(vl.asInstanceOf[String]); }
    }
    class EpgUpdateDatetime extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DblePurchasePayment].getUpdateDatetime(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DblePurchasePayment].setUpdateDatetime(vl.asInstanceOf[org.joda.time.LocalDateTime]); }
    }
    class EpgUpdateUser extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DblePurchasePayment].getUpdateUser(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DblePurchasePayment].setUpdateUser(vl.asInstanceOf[String]); }
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
        setupEfpg(_efpgMap, new EfpgPurchase(), "purchase");
    }
    class EfpgPurchase extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DblePurchasePayment].getPurchase(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DblePurchasePayment].setPurchase(vl.asInstanceOf[Option[DblePurchase]]); }
    }
    override def findForeignPropertyGateway(prop: String): PropertyGateway = { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected val _tableDbName: String = "PURCHASE_PAYMENT";
    protected val _tablePropertyName: String = "purchasePayment";
    protected val _tableSqlName: TableSqlName = new TableSqlName("PURCHASE_PAYMENT", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getTableSqlNameFilter()); }
    def getTableDbName(): String = { return _tableDbName; }
    def getTablePropertyName(): String = { return _tablePropertyName; }
    def getTableSqlName(): TableSqlName = { return _tableSqlName; }
    protected val _tableAlias: String = "購入支払";
    override def getTableAlias(): String = { return _tableAlias; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected val _columnPurchasePaymentId: ColumnInfo = cci("PURCHASE_PAYMENT_ID", "PURCHASE_PAYMENT_ID", null, "購入支払ID", classOf[Long], "purchasePaymentId", null, true, true, true, "BIGINT", 19, 0, "NEXT VALUE FOR PUBLIC.SYSTEM_SEQUENCE_43F45B68_2D8A_4383_BBFA_CC9FDC244B68", false, null, null, null, null, null);
    protected val _columnPurchaseId: ColumnInfo = cci("PURCHASE_ID", "PURCHASE_ID", null, "購入ID", classOf[Long], "purchaseId", null, false, false, true, "BIGINT", 19, 0, null, false, null, null, "purchase", null, null);
    protected val _columnPaymentAmount: ColumnInfo = cci("PAYMENT_AMOUNT", "PAYMENT_AMOUNT", null, "支払金額", classOf[java.math.BigDecimal], "paymentAmount", null, false, false, true, "DECIMAL", 10, 2, null, false, null, null, null, null, null);
    protected val _columnPaymentDatetime: ColumnInfo = cci("PAYMENT_DATETIME", "PAYMENT_DATETIME", null, "支払日時", classOf[org.joda.time.LocalDateTime], "paymentDatetime", null, false, false, true, "TIMESTAMP", 23, 10, null, false, null, null, null, null, null);
    protected val _columnPaymentMethodCode: ColumnInfo = cci("PAYMENT_METHOD_CODE", "PAYMENT_METHOD_CODE", null, "支払方法コード", classOf[String], "paymentMethodCode", null, false, false, true, "CHAR", 3, 0, null, false, null, null, null, null, null);
    protected val _columnRegisterDatetime: ColumnInfo = cci("REGISTER_DATETIME", "REGISTER_DATETIME", null, null, classOf[org.joda.time.LocalDateTime], "registerDatetime", null, false, false, true, "TIMESTAMP", 23, 10, null, true, null, null, null, null, null);
    protected val _columnRegisterUser: ColumnInfo = cci("REGISTER_USER", "REGISTER_USER", null, null, classOf[String], "registerUser", null, false, false, true, "VARCHAR", 200, 0, null, true, null, null, null, null, null);
    protected val _columnUpdateDatetime: ColumnInfo = cci("UPDATE_DATETIME", "UPDATE_DATETIME", null, null, classOf[org.joda.time.LocalDateTime], "updateDatetime", null, false, false, true, "TIMESTAMP", 23, 10, null, true, null, null, null, null, null);
    protected val _columnUpdateUser: ColumnInfo = cci("UPDATE_USER", "UPDATE_USER", null, null, classOf[String], "updateUser", null, false, false, true, "VARCHAR", 200, 0, null, true, null, null, null, null, null);

    def columnPurchasePaymentId(): ColumnInfo = { return _columnPurchasePaymentId; }
    def columnPurchaseId(): ColumnInfo = { return _columnPurchaseId; }
    def columnPaymentAmount(): ColumnInfo = { return _columnPaymentAmount; }
    def columnPaymentDatetime(): ColumnInfo = { return _columnPaymentDatetime; }
    def columnPaymentMethodCode(): ColumnInfo = { return _columnPaymentMethodCode; }
    def columnRegisterDatetime(): ColumnInfo = { return _columnRegisterDatetime; }
    def columnRegisterUser(): ColumnInfo = { return _columnRegisterUser; }
    def columnUpdateDatetime(): ColumnInfo = { return _columnUpdateDatetime; }
    def columnUpdateUser(): ColumnInfo = { return _columnUpdateUser; }

    protected def ccil(): List[ColumnInfo] = {
        val ls: List[ColumnInfo] = newArrayList();
        ls.add(columnPurchasePaymentId());
        ls.add(columnPurchaseId());
        ls.add(columnPaymentAmount());
        ls.add(columnPaymentDatetime());
        ls.add(columnPaymentMethodCode());
        ls.add(columnRegisterDatetime());
        ls.add(columnRegisterUser());
        ls.add(columnUpdateDatetime());
        ls.add(columnUpdateUser());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected def cpui(): UniqueInfo = { return hpcpui(columnPurchasePaymentId()); }
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
    def foreignPurchase(): ForeignInfo = {
        val mp: Map[ColumnInfo, ColumnInfo] = newLinkedHashMap(columnPurchaseId(), PurchaseDbm.columnPurchaseId());
        return cfi("FK_PURCHASE_PAYMENT_PURCHASE", "purchase", this, PurchaseDbm, mp, 0, classOf[Option[_]], false, false, false, false, null, null, false, "purchasePaymentList");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    override def hasIdentity(): scala.Boolean = { return true; }
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
    def getEntityTypeName(): String = { return "com.example.dbflute.scala.dbflute.exentity.DblePurchasePayment"; }
    def getConditionBeanTypeName(): String = { return "com.example.dbflute.scala.dbflute.cbean.PurchasePaymentCB"; }
    def getBehaviorTypeName(): String = { return "com.example.dbflute.scala.dbflute.exbhv.PurchasePaymentBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    def getEntityType(): Class[DblePurchasePayment] = { return classOf[DblePurchasePayment]; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    def newEntity(): DblePurchasePayment = { return new DblePurchasePayment(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    def acceptPrimaryKeyMap(et: Entity, mp: Map[String, _]): Unit =
    { doAcceptPrimaryKeyMap(et.asInstanceOf[DblePurchasePayment], mp); }
    def acceptAllColumnMap(et: Entity, mp: Map[String, _]): Unit =
    { doAcceptAllColumnMap(et.asInstanceOf[DblePurchasePayment], mp); }
    def extractPrimaryKeyMap(et: Entity): Map[String, Object] = { return doExtractPrimaryKeyMap(et); }
    def extractAllColumnMap(et: Entity): Map[String, Object] = { return doExtractAllColumnMap(et); }
}
