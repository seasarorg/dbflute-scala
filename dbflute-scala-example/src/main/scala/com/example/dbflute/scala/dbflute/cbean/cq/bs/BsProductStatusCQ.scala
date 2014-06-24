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
 * The base condition-query of PRODUCT_STATUS.
 * @author DBFlute(AutoGenerator)
 */
class BsProductStatusCQ(referrerQuery: ConditionQuery, sqlClause: SqlClause, aliasName: String, nestLevel: Integer) extends AbstractBsProductStatusCQ(referrerQuery, sqlClause, aliasName, nestLevel) {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected var _inlineQuery: ProductStatusCIQ = null;

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from PRODUCT_STATUS) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    def inline(): ProductStatusCIQ = {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected def xcreateCIQ(): ProductStatusCIQ = {
        val ciq: ProductStatusCIQ = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected def xnewCIQ(): ProductStatusCIQ = {
        return new ProductStatusCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join PRODUCT_STATUS on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    def on(): ProductStatusCIQ = {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        val inlineQuery: ProductStatusCIQ = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected var _productStatusCode: ConditionValue = null;
    def getProductStatusCode(): ConditionValue =
    { if (_productStatusCode == null) { _productStatusCode = nCV(); }
      return _productStatusCode; }
    protected def getCValueProductStatusCode(): ConditionValue = { return getProductStatusCode(); }

    def getProductStatusCode_ExistsReferrer_ProductList(): Map[String, ProductCQ] = { xgetSQueMap("productStatusCode_ExistsReferrer_ProductList") }
    def keepProductStatusCode_ExistsReferrer_ProductList(sq: ProductCQ): String = { xkeepSQue("productStatusCode_ExistsReferrer_ProductList", sq) }

    def getProductStatusCode_NotExistsReferrer_ProductList(): Map[String, ProductCQ] = { xgetSQueMap("productStatusCode_NotExistsReferrer_ProductList") }
    def keepProductStatusCode_NotExistsReferrer_ProductList(sq: ProductCQ): String = { xkeepSQue("productStatusCode_NotExistsReferrer_ProductList", sq) }

    def getProductStatusCode_InScopeRelation_ProductList(): Map[String, ProductCQ] = { xgetSQueMap("productStatusCode_InScopeRelation_ProductList") }
    def keepProductStatusCode_InScopeRelation_ProductList(sq: ProductCQ): String = { xkeepSQue("productStatusCode_InScopeRelation_ProductList", sq) }

    def getProductStatusCode_NotInScopeRelation_ProductList(): Map[String, ProductCQ] = { xgetSQueMap("productStatusCode_NotInScopeRelation_ProductList") }
    def keepProductStatusCode_NotInScopeRelation_ProductList(sq: ProductCQ): String = { xkeepSQue("productStatusCode_NotInScopeRelation_ProductList", sq) }

    def getProductStatusCode_SpecifyDerivedReferrer_ProductList(): Map[String, ProductCQ] = { xgetSQueMap("productStatusCode_SpecifyDerivedReferrer_ProductList") }
    def keepProductStatusCode_SpecifyDerivedReferrer_ProductList(sq: ProductCQ): String = { xkeepSQue("productStatusCode_SpecifyDerivedReferrer_ProductList", sq) }

    def getProductStatusCode_QueryDerivedReferrer_ProductList(): Map[String, ProductCQ] = { xgetSQueMap("productStatusCode_QueryDerivedReferrer_ProductList") }
    def keepProductStatusCode_QueryDerivedReferrer_ProductList(sq: ProductCQ): String = { xkeepSQue("productStatusCode_QueryDerivedReferrer_ProductList", sq) }
    def getProductStatusCode_QueryDerivedReferrer_ProductListParameter(): Map[String, Object] = { xgetSQuePmMap("productStatusCode_QueryDerivedReferrer_ProductList") }
    def keepProductStatusCode_QueryDerivedReferrer_ProductListParameter(pm: Object): String = { xkeepSQuePm("productStatusCode_QueryDerivedReferrer_ProductList", pm) }

    /** 
     * Add order-by as ascend. <br />
     * (商品ステータスコード)PRODUCT_STATUS_CODE: {PK, NotNull, CHAR(3), classification=ProductStatus}
     * @return this. (NotNull)
     */
    def addOrderBy_ProductStatusCode_Asc(): BsProductStatusCQ = { regOBA("PRODUCT_STATUS_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * (商品ステータスコード)PRODUCT_STATUS_CODE: {PK, NotNull, CHAR(3), classification=ProductStatus}
     * @return this. (NotNull)
     */
    def addOrderBy_ProductStatusCode_Desc(): BsProductStatusCQ = { regOBD("PRODUCT_STATUS_CODE"); return this; }

    protected var _productStatusName: ConditionValue = null;
    def getProductStatusName(): ConditionValue =
    { if (_productStatusName == null) { _productStatusName = nCV(); }
      return _productStatusName; }
    protected def getCValueProductStatusName(): ConditionValue = { return getProductStatusName(); }

    /** 
     * Add order-by as ascend. <br />
     * (商品ステータス名称)PRODUCT_STATUS_NAME: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    def addOrderBy_ProductStatusName_Asc(): BsProductStatusCQ = { regOBA("PRODUCT_STATUS_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * (商品ステータス名称)PRODUCT_STATUS_NAME: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    def addOrderBy_ProductStatusName_Desc(): BsProductStatusCQ = { regOBD("PRODUCT_STATUS_NAME"); return this; }

    protected var _displayOrder: ConditionValue = null;
    def getDisplayOrder(): ConditionValue =
    { if (_displayOrder == null) { _displayOrder = nCV(); }
      return _displayOrder; }
    protected def getCValueDisplayOrder(): ConditionValue = { return getDisplayOrder(); }

    /** 
     * Add order-by as ascend. <br />
     * (表示順)DISPLAY_ORDER: {UQ, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    def addOrderBy_DisplayOrder_Asc(): BsProductStatusCQ = { regOBA("DISPLAY_ORDER"); return this; }

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
    def addSpecifiedDerivedOrderBy_Asc(aliasName: String): BsProductStatusCQ = { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    def addSpecifiedDerivedOrderBy_Desc(aliasName: String): BsProductStatusCQ = { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    def reflectRelationOnUnionQuery(bqs: ConditionQuery, uqs: ConditionQuery): Unit = {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    protected def xfindFixedConditionDynamicParameterMap(property: String): Map[String, Object] = {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    def getScalarCondition(): Map[String, ProductStatusCQ] = { xgetSQueMap("scalarCondition") }
    def keepScalarCondition(sq: ProductStatusCQ): String = { xkeepSQue("scalarCondition", sq) }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    def getSpecifyMyselfDerived(): Map[String, ProductStatusCQ] = { xgetSQueMap("specifyMyselfDerived") }
    def keepSpecifyMyselfDerived(sq: ProductStatusCQ): String = { xkeepSQue("specifyMyselfDerived", sq) }

    def getQueryMyselfDerived(): Map[String, ProductStatusCQ] = { xgetSQueMap("queryMyselfDerived") }
    def keepQueryMyselfDerived(sq: ProductStatusCQ): String = { xkeepSQue("queryMyselfDerived", sq) }
    def getQueryMyselfDerivedParameter(): Map[String, Object] = { xgetSQuePmMap("qyeryMyselfDerived") }
    def keepQueryMyselfDerivedParameter(pm: Object): String = { xkeepSQuePm("qyeryMyselfDerived", pm) }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    def getMyselfExists(): Map[String, ProductStatusCQ] = { xgetSQueMap("myselfExists") }
    def keepMyselfExists(sq: ProductStatusCQ): String = { xkeepSQue("myselfExists", sq) }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    def getMyselfInScope(): Map[String, ProductStatusCQ] = { xgetSQueMap("myselfInScope") }
    def keepMyselfInScope(sq: ProductStatusCQ): String = { xkeepSQue("myselfInScope", sq) }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected def xCB(): String = { return classOf[ProductStatusCB].getName(); }
    protected def xCQ(): String = { return classOf[ProductStatusCQ].getName(); }
    protected def xCHp(): String = { return classOf[HpCalculator].getName(); }
    protected def xCOp(): String = { return classOf[ConditionOption].getName(); }
    protected def xMap(): String = { return classOf[Map[_, _]].getName(); }
}
