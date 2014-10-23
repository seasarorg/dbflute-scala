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
 * The DB meta of PRODUCT_CATEGORY. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
object ProductCategoryDbm extends AbstractDBMeta {

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
        setupEpg(_epgMap, new EpgProductCategoryCode(), "productCategoryCode");
        setupEpg(_epgMap, new EpgProductCategoryName(), "productCategoryName");
        setupEpg(_epgMap, new EpgParentCategoryCode(), "parentCategoryCode");
    }
    class EpgProductCategoryCode extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleProductCategory].getProductCategoryCode(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleProductCategory].setProductCategoryCode(vl.asInstanceOf[String]); }
    }
    class EpgProductCategoryName extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleProductCategory].getProductCategoryName(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleProductCategory].setProductCategoryName(vl.asInstanceOf[String]); }
    }
    class EpgParentCategoryCode extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleProductCategory].getParentCategoryCode(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleProductCategory].setParentCategoryCode(vl.asInstanceOf[String]); }
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
        setupEfpg(_efpgMap, new EfpgProductCategorySelf(), "productCategorySelf");
    }
    class EfpgProductCategorySelf extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleProductCategory].getProductCategorySelf(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleProductCategory].setProductCategorySelf(vl.asInstanceOf[Option[DbleProductCategory]]); }
    }
    override def findForeignPropertyGateway(prop: String): PropertyGateway = { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected val _tableDbName: String = "PRODUCT_CATEGORY";
    protected val _tablePropertyName: String = "productCategory";
    protected val _tableSqlName: TableSqlName = new TableSqlName("PRODUCT_CATEGORY", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getTableSqlNameFilter()); }
    def getTableDbName(): String = { return _tableDbName; }
    def getTablePropertyName(): String = { return _tablePropertyName; }
    def getTableSqlName(): TableSqlName = { return _tableSqlName; }
    protected val _tableAlias: String = "商品カテゴリ";
    override def getTableAlias(): String = { return _tableAlias; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected val _columnProductCategoryCode: ColumnInfo = cci("PRODUCT_CATEGORY_CODE", "PRODUCT_CATEGORY_CODE", null, "商品カテゴリコード", classOf[String], "productCategoryCode", null, true, false, true, "CHAR", 3, 0, null, false, null, null, null, "productList,productCategorySelfList", null);
    protected val _columnProductCategoryName: ColumnInfo = cci("PRODUCT_CATEGORY_NAME", "PRODUCT_CATEGORY_NAME", null, "商品カテゴリ名称", classOf[String], "productCategoryName", null, false, false, true, "VARCHAR", 50, 0, null, false, null, null, null, null, null);
    protected val _columnParentCategoryCode: ColumnInfo = cci("PARENT_CATEGORY_CODE", "PARENT_CATEGORY_CODE", null, "親カテゴリコード", classOf[String], "parentCategoryCode", null, false, false, false, "CHAR", 3, 0, null, false, null, null, "productCategorySelf", null, null);

    def columnProductCategoryCode(): ColumnInfo = { return _columnProductCategoryCode; }
    def columnProductCategoryName(): ColumnInfo = { return _columnProductCategoryName; }
    def columnParentCategoryCode(): ColumnInfo = { return _columnParentCategoryCode; }

    protected def ccil(): List[ColumnInfo] = {
        val ls: List[ColumnInfo] = newArrayList();
        ls.add(columnProductCategoryCode());
        ls.add(columnProductCategoryName());
        ls.add(columnParentCategoryCode());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected def cpui(): UniqueInfo = { return hpcpui(columnProductCategoryCode()); }
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
    def foreignProductCategorySelf(): ForeignInfo = {
        val mp: Map[ColumnInfo, ColumnInfo] = newLinkedHashMap(columnParentCategoryCode(), ProductCategoryDbm.columnProductCategoryCode());
        return cfi("FK_PRODUCT_CATEGORY_PARENT", "productCategorySelf", this, ProductCategoryDbm, mp, 0, classOf[Option[_]], false, false, false, false, null, null, false, "productCategorySelfList");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    def referrerProductList(): ReferrerInfo = {
        val mp: Map[ColumnInfo, ColumnInfo] = newLinkedHashMap(columnProductCategoryCode(), ProductDbm.columnProductCategoryCode());
        return cri("FK_PRODUCT_PRODUCT_CATEGORY", "productList", this, ProductDbm, mp, false, "productCategory");
    }
    def referrerProductCategorySelfList(): ReferrerInfo = {
        val mp: Map[ColumnInfo, ColumnInfo] = newLinkedHashMap(columnProductCategoryCode(), ProductCategoryDbm.columnParentCategoryCode());
        return cri("FK_PRODUCT_CATEGORY_PARENT", "productCategorySelfList", this, ProductCategoryDbm, mp, false, "productCategorySelf");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    def getEntityTypeName(): String = { return "com.example.dbflute.scala.dbflute.exentity.DbleProductCategory"; }
    def getConditionBeanTypeName(): String = { return "com.example.dbflute.scala.dbflute.cbean.ProductCategoryCB"; }
    def getBehaviorTypeName(): String = { return "com.example.dbflute.scala.dbflute.exbhv.ProductCategoryBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    def getEntityType(): Class[DbleProductCategory] = { return classOf[DbleProductCategory]; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    def newEntity(): DbleProductCategory = { return new DbleProductCategory(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    def acceptPrimaryKeyMap(et: Entity, mp: Map[String, _]): Unit =
    { doAcceptPrimaryKeyMap(et.asInstanceOf[DbleProductCategory], mp); }
    def acceptAllColumnMap(et: Entity, mp: Map[String, _]): Unit =
    { doAcceptAllColumnMap(et.asInstanceOf[DbleProductCategory], mp); }
    def extractPrimaryKeyMap(et: Entity): Map[String, Object] = { return doExtractPrimaryKeyMap(et); }
    def extractAllColumnMap(et: Entity): Map[String, Object] = { return doExtractAllColumnMap(et); }
}
