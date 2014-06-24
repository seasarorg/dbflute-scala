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
 * The base condition-query of SUMMARY_PRODUCT.
 * @author DBFlute(AutoGenerator)
 */
class BsSummaryProductCQ(referrerQuery: ConditionQuery, sqlClause: SqlClause, aliasName: String, nestLevel: Integer) extends AbstractBsSummaryProductCQ(referrerQuery, sqlClause, aliasName, nestLevel) {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected var _inlineQuery: SummaryProductCIQ = null;

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from SUMMARY_PRODUCT) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    def inline(): SummaryProductCIQ = {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected def xcreateCIQ(): SummaryProductCIQ = {
        val ciq: SummaryProductCIQ = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected def xnewCIQ(): SummaryProductCIQ = {
        return new SummaryProductCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join SUMMARY_PRODUCT on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    def on(): SummaryProductCIQ = {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        val inlineQuery: SummaryProductCIQ = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected var _productId: ConditionValue = null;
    def getProductId(): ConditionValue =
    { if (_productId == null) { _productId = nCV(); }
      return _productId; }
    protected def getCValueProductId(): ConditionValue = { return getProductId(); }

    /** 
     * Add order-by as ascend. <br />
     * PRODUCT_ID: {INTEGER(10)}
     * @return this. (NotNull)
     */
    def addOrderBy_ProductId_Asc(): BsSummaryProductCQ = { regOBA("PRODUCT_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * PRODUCT_ID: {INTEGER(10)}
     * @return this. (NotNull)
     */
    def addOrderBy_ProductId_Desc(): BsSummaryProductCQ = { regOBD("PRODUCT_ID"); return this; }

    protected var _productName: ConditionValue = null;
    def getProductName(): ConditionValue =
    { if (_productName == null) { _productName = nCV(); }
      return _productName; }
    protected def getCValueProductName(): ConditionValue = { return getProductName(); }

    /** 
     * Add order-by as ascend. <br />
     * PRODUCT_NAME: {VARCHAR(50)}
     * @return this. (NotNull)
     */
    def addOrderBy_ProductName_Asc(): BsSummaryProductCQ = { regOBA("PRODUCT_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * PRODUCT_NAME: {VARCHAR(50)}
     * @return this. (NotNull)
     */
    def addOrderBy_ProductName_Desc(): BsSummaryProductCQ = { regOBD("PRODUCT_NAME"); return this; }

    protected var _productHandleCode: ConditionValue = null;
    def getProductHandleCode(): ConditionValue =
    { if (_productHandleCode == null) { _productHandleCode = nCV(); }
      return _productHandleCode; }
    protected def getCValueProductHandleCode(): ConditionValue = { return getProductHandleCode(); }

    /** 
     * Add order-by as ascend. <br />
     * PRODUCT_HANDLE_CODE: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    def addOrderBy_ProductHandleCode_Asc(): BsSummaryProductCQ = { regOBA("PRODUCT_HANDLE_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * PRODUCT_HANDLE_CODE: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    def addOrderBy_ProductHandleCode_Desc(): BsSummaryProductCQ = { regOBD("PRODUCT_HANDLE_CODE"); return this; }

    protected var _productStatusCode: ConditionValue = null;
    def getProductStatusCode(): ConditionValue =
    { if (_productStatusCode == null) { _productStatusCode = nCV(); }
      return _productStatusCode; }
    protected def getCValueProductStatusCode(): ConditionValue = { return getProductStatusCode(); }

    /** 
     * Add order-by as ascend. <br />
     * PRODUCT_STATUS_CODE: {CHAR(3)}
     * @return this. (NotNull)
     */
    def addOrderBy_ProductStatusCode_Asc(): BsSummaryProductCQ = { regOBA("PRODUCT_STATUS_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * PRODUCT_STATUS_CODE: {CHAR(3)}
     * @return this. (NotNull)
     */
    def addOrderBy_ProductStatusCode_Desc(): BsSummaryProductCQ = { regOBD("PRODUCT_STATUS_CODE"); return this; }

    protected var _latestPurchaseDatetime: ConditionValue = null;
    def getLatestPurchaseDatetime(): ConditionValue =
    { if (_latestPurchaseDatetime == null) { _latestPurchaseDatetime = nCV(); }
      return _latestPurchaseDatetime; }
    protected def getCValueLatestPurchaseDatetime(): ConditionValue = { return getLatestPurchaseDatetime(); }

    /** 
     * Add order-by as ascend. <br />
     * LATEST_PURCHASE_DATETIME: {TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    def addOrderBy_LatestPurchaseDatetime_Asc(): BsSummaryProductCQ = { regOBA("LATEST_PURCHASE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br />
     * LATEST_PURCHASE_DATETIME: {TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    def addOrderBy_LatestPurchaseDatetime_Desc(): BsSummaryProductCQ = { regOBD("LATEST_PURCHASE_DATETIME"); return this; }

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
    def addSpecifiedDerivedOrderBy_Asc(aliasName: String): BsSummaryProductCQ = { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    def addSpecifiedDerivedOrderBy_Desc(aliasName: String): BsSummaryProductCQ = { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    def getScalarCondition(): Map[String, SummaryProductCQ] = { xgetSQueMap("scalarCondition") }
    def keepScalarCondition(sq: SummaryProductCQ): String = { xkeepSQue("scalarCondition", sq) }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected def xCB(): String = { return classOf[SummaryProductCB].getName(); }
    protected def xCQ(): String = { return classOf[SummaryProductCQ].getName(); }
    protected def xCHp(): String = { return classOf[HpCalculator].getName(); }
    protected def xCOp(): String = { return classOf[ConditionOption].getName(); }
    protected def xMap(): String = { return classOf[Map[_, _]].getName(); }
}
