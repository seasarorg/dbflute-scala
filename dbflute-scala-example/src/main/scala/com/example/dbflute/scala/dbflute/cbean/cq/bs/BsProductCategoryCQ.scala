package com.example.dbflute.scala.dbflute.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean._
import org.seasar.dbflute.cbean.chelper._
import org.seasar.dbflute.cbean.coption._
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;
import com.example.dbflute.scala.dbflute.cbean.cq.ciq._
import com.example.dbflute.scala.dbflute.cbean._
import com.example.dbflute.scala.dbflute.cbean.cq._

/**
 * The base condition-query of PRODUCT_CATEGORY.
 * @author DBFlute(AutoGenerator)
 */
class BsProductCategoryCQ(referrerQuery: ConditionQuery, sqlClause: SqlClause, aliasName: String, nestLevel: Integer) extends AbstractBsProductCategoryCQ(referrerQuery, sqlClause, aliasName, nestLevel) {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected var _inlineQuery: ProductCategoryCIQ = null;

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from PRODUCT_CATEGORY) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    def inline(): ProductCategoryCIQ = {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected def xcreateCIQ(): ProductCategoryCIQ = {
        val ciq: ProductCategoryCIQ = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected def xnewCIQ(): ProductCategoryCIQ = {
        return new ProductCategoryCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join PRODUCT_CATEGORY on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    def on(): ProductCategoryCIQ = {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        val inlineQuery: ProductCategoryCIQ = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected var _productCategoryCode: ConditionValue = null;
    def getProductCategoryCode(): ConditionValue =
    { if (_productCategoryCode == null) { _productCategoryCode = nCV(); }
      return _productCategoryCode; }
    protected def getCValueProductCategoryCode(): ConditionValue = { return getProductCategoryCode(); }

    def getProductCategoryCode_ExistsReferrer_ProductList(): Map[String, ProductCQ] = { xgetSQueMap("productCategoryCode_ExistsReferrer_ProductList") }
    def keepProductCategoryCode_ExistsReferrer_ProductList(sq: ProductCQ): String = { xkeepSQue("productCategoryCode_ExistsReferrer_ProductList", sq) }

    def getProductCategoryCode_ExistsReferrer_ProductCategorySelfList(): Map[String, ProductCategoryCQ] = { xgetSQueMap("productCategoryCode_ExistsReferrer_ProductCategorySelfList") }
    def keepProductCategoryCode_ExistsReferrer_ProductCategorySelfList(sq: ProductCategoryCQ): String = { xkeepSQue("productCategoryCode_ExistsReferrer_ProductCategorySelfList", sq) }

    def getProductCategoryCode_NotExistsReferrer_ProductList(): Map[String, ProductCQ] = { xgetSQueMap("productCategoryCode_NotExistsReferrer_ProductList") }
    def keepProductCategoryCode_NotExistsReferrer_ProductList(sq: ProductCQ): String = { xkeepSQue("productCategoryCode_NotExistsReferrer_ProductList", sq) }

    def getProductCategoryCode_NotExistsReferrer_ProductCategorySelfList(): Map[String, ProductCategoryCQ] = { xgetSQueMap("productCategoryCode_NotExistsReferrer_ProductCategorySelfList") }
    def keepProductCategoryCode_NotExistsReferrer_ProductCategorySelfList(sq: ProductCategoryCQ): String = { xkeepSQue("productCategoryCode_NotExistsReferrer_ProductCategorySelfList", sq) }

    def getProductCategoryCode_InScopeRelation_ProductList(): Map[String, ProductCQ] = { xgetSQueMap("productCategoryCode_InScopeRelation_ProductList") }
    def keepProductCategoryCode_InScopeRelation_ProductList(sq: ProductCQ): String = { xkeepSQue("productCategoryCode_InScopeRelation_ProductList", sq) }

    def getProductCategoryCode_InScopeRelation_ProductCategorySelfList(): Map[String, ProductCategoryCQ] = { xgetSQueMap("productCategoryCode_InScopeRelation_ProductCategorySelfList") }
    def keepProductCategoryCode_InScopeRelation_ProductCategorySelfList(sq: ProductCategoryCQ): String = { xkeepSQue("productCategoryCode_InScopeRelation_ProductCategorySelfList", sq) }

    def getProductCategoryCode_NotInScopeRelation_ProductList(): Map[String, ProductCQ] = { xgetSQueMap("productCategoryCode_NotInScopeRelation_ProductList") }
    def keepProductCategoryCode_NotInScopeRelation_ProductList(sq: ProductCQ): String = { xkeepSQue("productCategoryCode_NotInScopeRelation_ProductList", sq) }

    def getProductCategoryCode_NotInScopeRelation_ProductCategorySelfList(): Map[String, ProductCategoryCQ] = { xgetSQueMap("productCategoryCode_NotInScopeRelation_ProductCategorySelfList") }
    def keepProductCategoryCode_NotInScopeRelation_ProductCategorySelfList(sq: ProductCategoryCQ): String = { xkeepSQue("productCategoryCode_NotInScopeRelation_ProductCategorySelfList", sq) }

    def getProductCategoryCode_SpecifyDerivedReferrer_ProductList(): Map[String, ProductCQ] = { xgetSQueMap("productCategoryCode_SpecifyDerivedReferrer_ProductList") }
    def keepProductCategoryCode_SpecifyDerivedReferrer_ProductList(sq: ProductCQ): String = { xkeepSQue("productCategoryCode_SpecifyDerivedReferrer_ProductList", sq) }

    def getProductCategoryCode_SpecifyDerivedReferrer_ProductCategorySelfList(): Map[String, ProductCategoryCQ] = { xgetSQueMap("productCategoryCode_SpecifyDerivedReferrer_ProductCategorySelfList") }
    def keepProductCategoryCode_SpecifyDerivedReferrer_ProductCategorySelfList(sq: ProductCategoryCQ): String = { xkeepSQue("productCategoryCode_SpecifyDerivedReferrer_ProductCategorySelfList", sq) }

    def getProductCategoryCode_QueryDerivedReferrer_ProductList(): Map[String, ProductCQ] = { xgetSQueMap("productCategoryCode_QueryDerivedReferrer_ProductList") }
    def keepProductCategoryCode_QueryDerivedReferrer_ProductList(sq: ProductCQ): String = { xkeepSQue("productCategoryCode_QueryDerivedReferrer_ProductList", sq) }
    def getProductCategoryCode_QueryDerivedReferrer_ProductListParameter(): Map[String, Object] = { xgetSQuePmMap("productCategoryCode_QueryDerivedReferrer_ProductList") }
    def keepProductCategoryCode_QueryDerivedReferrer_ProductListParameter(pm: Object): String = { xkeepSQuePm("productCategoryCode_QueryDerivedReferrer_ProductList", pm) }

    def getProductCategoryCode_QueryDerivedReferrer_ProductCategorySelfList(): Map[String, ProductCategoryCQ] = { xgetSQueMap("productCategoryCode_QueryDerivedReferrer_ProductCategorySelfList") }
    def keepProductCategoryCode_QueryDerivedReferrer_ProductCategorySelfList(sq: ProductCategoryCQ): String = { xkeepSQue("productCategoryCode_QueryDerivedReferrer_ProductCategorySelfList", sq) }
    def getProductCategoryCode_QueryDerivedReferrer_ProductCategorySelfListParameter(): Map[String, Object] = { xgetSQuePmMap("productCategoryCode_QueryDerivedReferrer_ProductCategorySelfList") }
    def keepProductCategoryCode_QueryDerivedReferrer_ProductCategorySelfListParameter(pm: Object): String = { xkeepSQuePm("productCategoryCode_QueryDerivedReferrer_ProductCategorySelfList", pm) }

    /** 
     * Add order-by as ascend. <br />
     * (商品カテゴリコード)PRODUCT_CATEGORY_CODE: {PK, NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    def addOrderBy_ProductCategoryCode_Asc(): BsProductCategoryCQ = { regOBA("PRODUCT_CATEGORY_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * (商品カテゴリコード)PRODUCT_CATEGORY_CODE: {PK, NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    def addOrderBy_ProductCategoryCode_Desc(): BsProductCategoryCQ = { regOBD("PRODUCT_CATEGORY_CODE"); return this; }

    protected var _productCategoryName: ConditionValue = null;
    def getProductCategoryName(): ConditionValue =
    { if (_productCategoryName == null) { _productCategoryName = nCV(); }
      return _productCategoryName; }
    protected def getCValueProductCategoryName(): ConditionValue = { return getProductCategoryName(); }

    /** 
     * Add order-by as ascend. <br />
     * (商品カテゴリ名称)PRODUCT_CATEGORY_NAME: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    def addOrderBy_ProductCategoryName_Asc(): BsProductCategoryCQ = { regOBA("PRODUCT_CATEGORY_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * (商品カテゴリ名称)PRODUCT_CATEGORY_NAME: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    def addOrderBy_ProductCategoryName_Desc(): BsProductCategoryCQ = { regOBD("PRODUCT_CATEGORY_NAME"); return this; }

    protected var _parentCategoryCode: ConditionValue = null;
    def getParentCategoryCode(): ConditionValue =
    { if (_parentCategoryCode == null) { _parentCategoryCode = nCV(); }
      return _parentCategoryCode; }
    protected def getCValueParentCategoryCode(): ConditionValue = { return getParentCategoryCode(); }

    /** 
     * Add order-by as ascend. <br />
     * (親カテゴリコード)PARENT_CATEGORY_CODE: {IX, CHAR(3), FK to PRODUCT_CATEGORY}
     * @return this. (NotNull)
     */
    def addOrderBy_ParentCategoryCode_Asc(): BsProductCategoryCQ = { regOBA("PARENT_CATEGORY_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * (親カテゴリコード)PARENT_CATEGORY_CODE: {IX, CHAR(3), FK to PRODUCT_CATEGORY}
     * @return this. (NotNull)
     */
    def addOrderBy_ParentCategoryCode_Desc(): BsProductCategoryCQ = { regOBD("PARENT_CATEGORY_CODE"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #DD4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #DD4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #DD4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    def addSpecifiedDerivedOrderBy_Asc(aliasName: String): BsProductCategoryCQ = { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #DD4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #DD4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #DD4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    def addSpecifiedDerivedOrderBy_Desc(aliasName: String): BsProductCategoryCQ = { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    def reflectRelationOnUnionQuery(bqs: ConditionQuery, uqs: ConditionQuery): Unit = {
        val bq: ProductCategoryCQ = bqs.asInstanceOf[ProductCategoryCQ];
        val uq: ProductCategoryCQ = uqs.asInstanceOf[ProductCategoryCQ];
        if (bq.hasConditionQueryProductCategorySelf()) {
            uq.queryProductCategorySelf().reflectRelationOnUnionQuery(bq.queryProductCategorySelf(), uq.queryProductCategorySelf());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * (商品カテゴリ)PRODUCT_CATEGORY by my PARENT_CATEGORY_CODE, named 'productCategorySelf'.
     * @return The instance of condition-query. (NotNull)
     */
    def queryProductCategorySelf(): ProductCategoryCQ = {
        return getConditionQueryProductCategorySelf();
    }
    def getConditionQueryProductCategorySelf(): ProductCategoryCQ = {
        val prop = "productCategorySelf";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryProductCategorySelf()); xsetupOuterJoinProductCategorySelf(); }
        return xgetQueRlMap(prop);
    }
    protected def xcreateQueryProductCategorySelf(): ProductCategoryCQ = {
        val nrp = xresolveNRP("PRODUCT_CATEGORY",  "productCategorySelf"); val jan = xresolveJAN(nrp,  xgetNNLvl());
        return xinitRelCQ(new ProductCategoryCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "productCategorySelf", nrp);
    }
    protected def xsetupOuterJoinProductCategorySelf(): Unit = { xregOutJo("productCategorySelf") }
    def hasConditionQueryProductCategorySelf(): Boolean = { xhasQueRlMap("productCategorySelf") }

    protected def xfindFixedConditionDynamicParameterMap(property: String): Map[String, Object] = {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    def getScalarCondition(): Map[String, ProductCategoryCQ] = { xgetSQueMap("scalarCondition") }
    def keepScalarCondition(sq: ProductCategoryCQ): String = { xkeepSQue("scalarCondition", sq) }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    def getSpecifyMyselfDerived(): Map[String, ProductCategoryCQ] = { xgetSQueMap("specifyMyselfDerived") }
    def keepSpecifyMyselfDerived(sq: ProductCategoryCQ): String = { xkeepSQue("specifyMyselfDerived", sq) }

    def getQueryMyselfDerived(): Map[String, ProductCategoryCQ] = { xgetSQueMap("queryMyselfDerived") }
    def keepQueryMyselfDerived(sq: ProductCategoryCQ): String = { xkeepSQue("queryMyselfDerived", sq) }
    def getQueryMyselfDerivedParameter(): Map[String, Object] = { xgetSQuePmMap("qyeryMyselfDerived") }
    def keepQueryMyselfDerivedParameter(pm: Object): String = { xkeepSQuePm("qyeryMyselfDerived", pm) }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    def getMyselfExists(): Map[String, ProductCategoryCQ] = { xgetSQueMap("myselfExists") }
    def keepMyselfExists(sq: ProductCategoryCQ): String = { xkeepSQue("myselfExists", sq) }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    def getMyselfInScope(): Map[String, ProductCategoryCQ] = { xgetSQueMap("myselfInScope") }
    def keepMyselfInScope(sq: ProductCategoryCQ): String = { xkeepSQue("myselfInScope", sq) }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected def xCB(): String = { return classOf[ProductCategoryCB].getName(); }
    protected def xCQ(): String = { return classOf[ProductCategoryCQ].getName(); }
    protected def xCHp(): String = { return classOf[HpCalculator].getName(); }
    protected def xCOp(): String = { return classOf[ConditionOption].getName(); }
    protected def xMap(): String = { return classOf[Map[_, _]].getName(); }
}
