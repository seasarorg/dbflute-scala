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
 * The DB meta of PRODUCT_STATUS. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
object ProductStatusDbm extends AbstractDBMeta {

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
        setupEpg(_epgMap, new EpgProductStatusCode(), "productStatusCode");
        setupEpg(_epgMap, new EpgProductStatusName(), "productStatusName");
        setupEpg(_epgMap, new EpgDisplayOrder(), "displayOrder");
    }
    class EpgProductStatusCode extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleProductStatus].getProductStatusCode(); }
        def write(et: Entity, vl: Object): Unit = {
            val col: ColumnInfo = columnProductStatusCode();
            dgccls(col, vl);
            val cls = dggcls(col, vl).asInstanceOf[CDef.ProductStatus];
            if (cls != null) {
                et.asInstanceOf[DbleProductStatus].setProductStatusCodeAsProductStatus(cls);
            } else {
                et.asInstanceOf[DbleProductStatus].mynativeMappingProductStatusCode(vl.asInstanceOf[String]);
            }
        }
    }
    class EpgProductStatusName extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleProductStatus].getProductStatusName(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleProductStatus].setProductStatusName(vl.asInstanceOf[String]); }
    }
    class EpgDisplayOrder extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleProductStatus].getDisplayOrder(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleProductStatus].setDisplayOrder(dgcti(vl)); }
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
    protected val _tableDbName: String = "PRODUCT_STATUS";
    protected val _tablePropertyName: String = "productStatus";
    protected val _tableSqlName: TableSqlName = new TableSqlName("PRODUCT_STATUS", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getTableSqlNameFilter()); }
    def getTableDbName(): String = { return _tableDbName; }
    def getTablePropertyName(): String = { return _tablePropertyName; }
    def getTableSqlName(): TableSqlName = { return _tableSqlName; }
    protected val _tableAlias: String = "商品ステータス";
    override def getTableAlias(): String = { return _tableAlias; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected val _columnProductStatusCode: ColumnInfo = cci("PRODUCT_STATUS_CODE", "PRODUCT_STATUS_CODE", null, "商品ステータスコード", classOf[String], "productStatusCode", null, true, false, true, "CHAR", 3, 0, null, false, null, null, null, "productList", CDef.DefMeta.ProductStatus);
    protected val _columnProductStatusName: ColumnInfo = cci("PRODUCT_STATUS_NAME", "PRODUCT_STATUS_NAME", null, "商品ステータス名称", classOf[String], "productStatusName", null, false, false, true, "VARCHAR", 50, 0, null, false, null, null, null, null, null);
    protected val _columnDisplayOrder: ColumnInfo = cci("DISPLAY_ORDER", "DISPLAY_ORDER", null, "表示順", classOf[Integer], "displayOrder", null, false, false, true, "INTEGER", 10, 0, null, false, null, null, null, null, null);

    def columnProductStatusCode(): ColumnInfo = { return _columnProductStatusCode; }
    def columnProductStatusName(): ColumnInfo = { return _columnProductStatusName; }
    def columnDisplayOrder(): ColumnInfo = { return _columnDisplayOrder; }

    protected def ccil(): List[ColumnInfo] = {
        val ls: List[ColumnInfo] = newArrayList();
        ls.add(columnProductStatusCode());
        ls.add(columnProductStatusName());
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
    protected def cpui(): UniqueInfo = { return hpcpui(columnProductStatusCode()); }
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
    def referrerProductList(): ReferrerInfo = {
        val mp: Map[ColumnInfo, ColumnInfo] = newLinkedHashMap(columnProductStatusCode(), ProductDbm.columnProductStatusCode());
        return cri("FK_PRODUCT_PRODUCT_STATUS", "productList", this, ProductDbm, mp, false, "productStatus");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    def getEntityTypeName(): String = { return "com.example.dbflute.scala.dbflute.exentity.DbleProductStatus"; }
    def getConditionBeanTypeName(): String = { return "com.example.dbflute.scala.dbflute.cbean.ProductStatusCB"; }
    def getBehaviorTypeName(): String = { return "com.example.dbflute.scala.dbflute.exbhv.ProductStatusBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    def getEntityType(): Class[DbleProductStatus] = { return classOf[DbleProductStatus]; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    def newEntity(): DbleProductStatus = { return new DbleProductStatus(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    def acceptPrimaryKeyMap(et: Entity, mp: Map[String, _]): Unit =
    { doAcceptPrimaryKeyMap(et.asInstanceOf[DbleProductStatus], mp); }
    def acceptAllColumnMap(et: Entity, mp: Map[String, _]): Unit =
    { doAcceptAllColumnMap(et.asInstanceOf[DbleProductStatus], mp); }
    def extractPrimaryKeyMap(et: Entity): Map[String, Object] = { return doExtractPrimaryKeyMap(et); }
    def extractAllColumnMap(et: Entity): Map[String, Object] = { return doExtractAllColumnMap(et); }
}
