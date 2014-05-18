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
 * The DB meta of PRODUCT. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
object ProductDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    def getCurrentDBDef(): DBDef = { return DBCurrent.currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected val _epgMap: Map[String, PropertyGateway] = newHashMap();
    {
        setupEpg(_epgMap, new EpgProductId(), "productId");
        setupEpg(_epgMap, new EpgProductName(), "productName");
        setupEpg(_epgMap, new EpgProductHandleCode(), "productHandleCode");
        setupEpg(_epgMap, new EpgProductCategoryCode(), "productCategoryCode");
        setupEpg(_epgMap, new EpgProductStatusCode(), "productStatusCode");
        setupEpg(_epgMap, new EpgRegularPrice(), "regularPrice");
        setupEpg(_epgMap, new EpgRegisterDatetime(), "registerDatetime");
        setupEpg(_epgMap, new EpgRegisterUser(), "registerUser");
        setupEpg(_epgMap, new EpgUpdateDatetime(), "updateDatetime");
        setupEpg(_epgMap, new EpgUpdateUser(), "updateUser");
        setupEpg(_epgMap, new EpgVersionNo(), "versionNo");
    }
    def findPropertyGateway(propertyName: String): PropertyGateway = { return doFindEpg(_epgMap, propertyName); }
    class EpgProductId extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[Product].getProductId(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[Product].setProductId(dgcti(vl)); }
    }
    class EpgProductName extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[Product].getProductName(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[Product].setProductName(vl.asInstanceOf[String]); }
    }
    class EpgProductHandleCode extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[Product].getProductHandleCode(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[Product].setProductHandleCode(vl.asInstanceOf[String]); }
    }
    class EpgProductCategoryCode extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[Product].getProductCategoryCode(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[Product].setProductCategoryCode(vl.asInstanceOf[String]); }
    }
    class EpgProductStatusCode extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[Product].getProductStatusCode(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[Product].setProductStatusCode(vl.asInstanceOf[String]); }
    }
    class EpgRegularPrice extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[Product].getRegularPrice(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[Product].setRegularPrice(dgcti(vl)); }
    }
    class EpgRegisterDatetime extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[Product].getRegisterDatetime(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[Product].setRegisterDatetime(vl.asInstanceOf[java.sql.Timestamp]); }
    }
    class EpgRegisterUser extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[Product].getRegisterUser(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[Product].setRegisterUser(vl.asInstanceOf[String]); }
    }
    class EpgUpdateDatetime extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[Product].getUpdateDatetime(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[Product].setUpdateDatetime(vl.asInstanceOf[java.sql.Timestamp]); }
    }
    class EpgUpdateUser extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[Product].getUpdateUser(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[Product].setUpdateUser(vl.asInstanceOf[String]); }
    }
    class EpgVersionNo extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[Product].getVersionNo(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[Product].setVersionNo(dgctl(vl)); }
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
    protected val _tableDbName: String = "PRODUCT";
    protected val _tablePropertyName: String = "product";
    protected val _tableSqlName: TableSqlName = new TableSqlName("EXAMPLEDB.PUBLIC.PRODUCT", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getTableSqlNameFilter()); }
    def getTableDbName(): String = { return _tableDbName; }
    def getTablePropertyName(): String = { return _tablePropertyName; }
    def getTableSqlName(): TableSqlName = { return _tableSqlName; }
    protected val _tableAlias: String = "商品";
    override def getTableAlias(): String = { return _tableAlias; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected val _columnProductId: ColumnInfo = cci("PRODUCT_ID", "PRODUCT_ID", null, null, true, "productId", classOf[Integer], true, true, "INTEGER", 10, 0, "NEXT VALUE FOR PUBLIC.SYSTEM_SEQUENCE_8B72CF33_1578_4B50_A021_B5DF0616765D", false, null, null, null, "purchaseList", null);
    protected val _columnProductName: ColumnInfo = cci("PRODUCT_NAME", "PRODUCT_NAME", null, "商品名称", true, "productName", classOf[String], false, false, "VARCHAR", 50, 0, null, false, null, null, null, null, null);
    protected val _columnProductHandleCode: ColumnInfo = cci("PRODUCT_HANDLE_CODE", "PRODUCT_HANDLE_CODE", null, "商品ハンドルコード", true, "productHandleCode", classOf[String], false, false, "VARCHAR", 100, 0, null, false, null, null, null, null, null);
    protected val _columnProductCategoryCode: ColumnInfo = cci("PRODUCT_CATEGORY_CODE", "PRODUCT_CATEGORY_CODE", null, null, true, "productCategoryCode", classOf[String], false, false, "CHAR", 3, 0, null, false, null, null, null, null, null);
    protected val _columnProductStatusCode: ColumnInfo = cci("PRODUCT_STATUS_CODE", "PRODUCT_STATUS_CODE", null, null, true, "productStatusCode", classOf[String], false, false, "CHAR", 3, 0, null, false, null, null, null, null, null);
    protected val _columnRegularPrice: ColumnInfo = cci("REGULAR_PRICE", "REGULAR_PRICE", null, "定価", true, "regularPrice", classOf[Integer], false, false, "INTEGER", 10, 0, null, false, null, null, null, null, null);
    protected val _columnRegisterDatetime: ColumnInfo = cci("REGISTER_DATETIME", "REGISTER_DATETIME", null, null, true, "registerDatetime", classOf[java.sql.Timestamp], false, false, "TIMESTAMP", 23, 10, null, true, null, null, null, null, null);
    protected val _columnRegisterUser: ColumnInfo = cci("REGISTER_USER", "REGISTER_USER", null, null, true, "registerUser", classOf[String], false, false, "VARCHAR", 200, 0, null, true, null, null, null, null, null);
    protected val _columnUpdateDatetime: ColumnInfo = cci("UPDATE_DATETIME", "UPDATE_DATETIME", null, null, true, "updateDatetime", classOf[java.sql.Timestamp], false, false, "TIMESTAMP", 23, 10, null, true, null, null, null, null, null);
    protected val _columnUpdateUser: ColumnInfo = cci("UPDATE_USER", "UPDATE_USER", null, null, true, "updateUser", classOf[String], false, false, "VARCHAR", 200, 0, null, true, null, null, null, null, null);
    protected val _columnVersionNo: ColumnInfo = cci("VERSION_NO", "VERSION_NO", null, null, true, "versionNo", classOf[Long], false, false, "BIGINT", 19, 0, null, false, OptimisticLockType.VERSION_NO, null, null, null, null);

    def columnProductId(): ColumnInfo = { return _columnProductId; }
    def columnProductName(): ColumnInfo = { return _columnProductName; }
    def columnProductHandleCode(): ColumnInfo = { return _columnProductHandleCode; }
    def columnProductCategoryCode(): ColumnInfo = { return _columnProductCategoryCode; }
    def columnProductStatusCode(): ColumnInfo = { return _columnProductStatusCode; }
    def columnRegularPrice(): ColumnInfo = { return _columnRegularPrice; }
    def columnRegisterDatetime(): ColumnInfo = { return _columnRegisterDatetime; }
    def columnRegisterUser(): ColumnInfo = { return _columnRegisterUser; }
    def columnUpdateDatetime(): ColumnInfo = { return _columnUpdateDatetime; }
    def columnUpdateUser(): ColumnInfo = { return _columnUpdateUser; }
    def columnVersionNo(): ColumnInfo = { return _columnVersionNo; }

    protected def ccil(): List[ColumnInfo] = {
        val ls: List[ColumnInfo] = newArrayList();
        ls.add(columnProductId());
        ls.add(columnProductName());
        ls.add(columnProductHandleCode());
        ls.add(columnProductCategoryCode());
        ls.add(columnProductStatusCode());
        ls.add(columnRegularPrice());
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
    protected def cpui(): UniqueInfo = { return hpcpui(columnProductId()); }
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
    def referrerPurchaseList(): ReferrerInfo = {
        val mp: Map[ColumnInfo, ColumnInfo] = newLinkedHashMap(columnProductId(), PurchaseDbm.columnProductId());
        return cri("FK_PURCHASE_PRODUCT", "purchaseList", this, PurchaseDbm, mp, false, "product");
    }

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
    def getEntityTypeName(): String = { return "com.example.dbflute.scala.dbflute.exentity.Product"; }
    def getConditionBeanTypeName(): String = { return "com.example.dbflute.scala.dbflute.cbean.ProductCB"; }
    def getBehaviorTypeName(): String = { return "com.example.dbflute.scala.dbflute.exbhv.ProductBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    def getEntityType(): Class[Product] = { return classOf[Product]; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    def newEntity(): Entity = { return newMyEntity(); }
    def newMyEntity(): Product = { return new Product(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    def acceptPrimaryKeyMap(et: Entity, mp: Map[String, _]): Unit =
    { doAcceptPrimaryKeyMap(et.asInstanceOf[Product], mp); }
    def acceptAllColumnMap(et: Entity, mp: Map[String, _]): Unit =
    { doAcceptAllColumnMap(et.asInstanceOf[Product], mp); }
    def extractPrimaryKeyMap(et: Entity): Map[String, Object] = { return doExtractPrimaryKeyMap(et); }
    def extractAllColumnMap(et: Entity): Map[String, Object] = { return doExtractAllColumnMap(et); }
}
