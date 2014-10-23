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
 * The DB meta of SUMMARY_PRODUCT. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
object SummaryProductDbm extends AbstractDBMeta {

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
        setupEpg(_epgMap, new EpgProductId(), "productId");
        setupEpg(_epgMap, new EpgProductName(), "productName");
        setupEpg(_epgMap, new EpgProductHandleCode(), "productHandleCode");
        setupEpg(_epgMap, new EpgProductStatusCode(), "productStatusCode");
        setupEpg(_epgMap, new EpgLatestPurchaseDatetime(), "latestPurchaseDatetime");
    }
    class EpgProductId extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleSummaryProduct].getProductId(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleSummaryProduct].setProductId(dgcti(vl)); }
    }
    class EpgProductName extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleSummaryProduct].getProductName(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleSummaryProduct].setProductName(vl.asInstanceOf[String]); }
    }
    class EpgProductHandleCode extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleSummaryProduct].getProductHandleCode(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleSummaryProduct].setProductHandleCode(vl.asInstanceOf[String]); }
    }
    class EpgProductStatusCode extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleSummaryProduct].getProductStatusCode(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleSummaryProduct].setProductStatusCode(vl.asInstanceOf[String]); }
    }
    class EpgLatestPurchaseDatetime extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleSummaryProduct].getLatestPurchaseDatetime(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleSummaryProduct].setLatestPurchaseDatetime(vl.asInstanceOf[org.joda.time.LocalDateTime]); }
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
    protected val _tableDbName: String = "SUMMARY_PRODUCT";
    protected val _tablePropertyName: String = "summaryProduct";
    protected val _tableSqlName: TableSqlName = new TableSqlName("SUMMARY_PRODUCT", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getTableSqlNameFilter()); }
    def getTableDbName(): String = { return _tableDbName; }
    def getTablePropertyName(): String = { return _tablePropertyName; }
    def getTableSqlName(): TableSqlName = { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected val _columnProductId: ColumnInfo = cci("PRODUCT_ID", "PRODUCT_ID", null, null, classOf[Integer], "productId", null, false, false, false, "INTEGER", 10, 0, null, false, null, null, null, null, null);
    protected val _columnProductName: ColumnInfo = cci("PRODUCT_NAME", "PRODUCT_NAME", null, null, classOf[String], "productName", null, false, false, false, "VARCHAR", 50, 0, null, false, null, null, null, null, null);
    protected val _columnProductHandleCode: ColumnInfo = cci("PRODUCT_HANDLE_CODE", "PRODUCT_HANDLE_CODE", null, null, classOf[String], "productHandleCode", null, false, false, false, "VARCHAR", 100, 0, null, false, null, null, null, null, null);
    protected val _columnProductStatusCode: ColumnInfo = cci("PRODUCT_STATUS_CODE", "PRODUCT_STATUS_CODE", null, null, classOf[String], "productStatusCode", null, false, false, false, "CHAR", 3, 0, null, false, null, null, null, null, null);
    protected val _columnLatestPurchaseDatetime: ColumnInfo = cci("LATEST_PURCHASE_DATETIME", "LATEST_PURCHASE_DATETIME", null, null, classOf[org.joda.time.LocalDateTime], "latestPurchaseDatetime", null, false, false, false, "TIMESTAMP", 23, 10, null, false, null, null, null, null, null);

    def columnProductId(): ColumnInfo = { return _columnProductId; }
    def columnProductName(): ColumnInfo = { return _columnProductName; }
    def columnProductHandleCode(): ColumnInfo = { return _columnProductHandleCode; }
    def columnProductStatusCode(): ColumnInfo = { return _columnProductStatusCode; }
    def columnLatestPurchaseDatetime(): ColumnInfo = { return _columnLatestPurchaseDatetime; }

    protected def ccil(): List[ColumnInfo] = {
        val ls: List[ColumnInfo] = newArrayList();
        ls.add(columnProductId());
        ls.add(columnProductName());
        ls.add(columnProductHandleCode());
        ls.add(columnProductStatusCode());
        ls.add(columnLatestPurchaseDatetime());
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
    def getEntityTypeName(): String = { return "com.example.dbflute.scala.dbflute.exentity.DbleSummaryProduct"; }
    def getConditionBeanTypeName(): String = { return "com.example.dbflute.scala.dbflute.cbean.SummaryProductCB"; }
    def getBehaviorTypeName(): String = { return "com.example.dbflute.scala.dbflute.exbhv.SummaryProductBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    def getEntityType(): Class[DbleSummaryProduct] = { return classOf[DbleSummaryProduct]; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    def newEntity(): DbleSummaryProduct = { return new DbleSummaryProduct(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    def acceptPrimaryKeyMap(et: Entity, mp: Map[String, _]): Unit =
    { doAcceptPrimaryKeyMap(et.asInstanceOf[DbleSummaryProduct], mp); }
    def acceptAllColumnMap(et: Entity, mp: Map[String, _]): Unit =
    { doAcceptAllColumnMap(et.asInstanceOf[DbleSummaryProduct], mp); }
    def extractPrimaryKeyMap(et: Entity): Map[String, Object] = { return doExtractPrimaryKeyMap(et); }
    def extractAllColumnMap(et: Entity): Map[String, Object] = { return doExtractAllColumnMap(et); }
}
