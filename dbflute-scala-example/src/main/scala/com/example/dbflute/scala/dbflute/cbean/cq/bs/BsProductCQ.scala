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
 * The base condition-query of PRODUCT.
 * @author DBFlute(AutoGenerator)
 */
class BsProductCQ(referrerQuery: ConditionQuery, sqlClause: SqlClause, aliasName: String, nestLevel: Integer) extends AbstractBsProductCQ(referrerQuery, sqlClause, aliasName, nestLevel) {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected var _inlineQuery: ProductCIQ = null;

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from PRODUCT) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    def inline(): ProductCIQ = {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected def xcreateCIQ(): ProductCIQ = {
        val ciq: ProductCIQ = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected def xnewCIQ(): ProductCIQ = {
        return new ProductCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join PRODUCT on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    def on(): ProductCIQ = {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        val inlineQuery: ProductCIQ = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected var _productId: ConditionValue = null;
    def getProductId(): ConditionValue =
    { if (_productId == null) { _productId = nCV(); }
      return _productId; }
    protected def getCValueProductId(): ConditionValue = { return getProductId(); }

    def getProductId_ExistsReferrer_PurchaseList(): Map[String, PurchaseCQ] = { xgetSQueMap("productId_ExistsReferrer_PurchaseList") }
    def keepProductId_ExistsReferrer_PurchaseList(sq: PurchaseCQ): String = { xkeepSQue("productId_ExistsReferrer_PurchaseList", sq) }

    def getProductId_NotExistsReferrer_PurchaseList(): Map[String, PurchaseCQ] = { xgetSQueMap("productId_NotExistsReferrer_PurchaseList") }
    def keepProductId_NotExistsReferrer_PurchaseList(sq: PurchaseCQ): String = { xkeepSQue("productId_NotExistsReferrer_PurchaseList", sq) }

    def getProductId_SpecifyDerivedReferrer_PurchaseList(): Map[String, PurchaseCQ] = { xgetSQueMap("productId_SpecifyDerivedReferrer_PurchaseList") }
    def keepProductId_SpecifyDerivedReferrer_PurchaseList(sq: PurchaseCQ): String = { xkeepSQue("productId_SpecifyDerivedReferrer_PurchaseList", sq) }

    def getProductId_InScopeRelation_PurchaseList(): Map[String, PurchaseCQ] = { xgetSQueMap("productId_InScopeRelation_PurchaseList") }
    def keepProductId_InScopeRelation_PurchaseList(sq: PurchaseCQ): String = { xkeepSQue("productId_InScopeRelation_PurchaseList", sq) }

    def getProductId_NotInScopeRelation_PurchaseList(): Map[String, PurchaseCQ] = { xgetSQueMap("productId_NotInScopeRelation_PurchaseList") }
    def keepProductId_NotInScopeRelation_PurchaseList(sq: PurchaseCQ): String = { xkeepSQue("productId_NotInScopeRelation_PurchaseList", sq) }

    def getProductId_QueryDerivedReferrer_PurchaseList(): Map[String, PurchaseCQ] = { xgetSQueMap("productId_QueryDerivedReferrer_PurchaseList") }
    def keepProductId_QueryDerivedReferrer_PurchaseList(sq: PurchaseCQ): String = { xkeepSQue("productId_QueryDerivedReferrer_PurchaseList", sq) }
    def getProductId_QueryDerivedReferrer_PurchaseListParameter(): Map[String, Object] = { xgetSQuePmMap("productId_QueryDerivedReferrer_PurchaseList") }
    def keepProductId_QueryDerivedReferrer_PurchaseListParameter(pm: Object): String = { xkeepSQuePm("productId_QueryDerivedReferrer_PurchaseList", pm) }

    /** 
     * Add order-by as ascend. <br />
     * PRODUCT_ID: {PK, ID, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    def addOrderBy_ProductId_Asc(): BsProductCQ = { regOBA("PRODUCT_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * PRODUCT_ID: {PK, ID, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    def addOrderBy_ProductId_Desc(): BsProductCQ = { regOBD("PRODUCT_ID"); return this; }

    protected var _productName: ConditionValue = null;
    def getProductName(): ConditionValue =
    { if (_productName == null) { _productName = nCV(); }
      return _productName; }
    protected def getCValueProductName(): ConditionValue = { return getProductName(); }

    /** 
     * Add order-by as ascend. <br />
     * (商品名称)PRODUCT_NAME: {IX, NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    def addOrderBy_ProductName_Asc(): BsProductCQ = { regOBA("PRODUCT_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * (商品名称)PRODUCT_NAME: {IX, NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    def addOrderBy_ProductName_Desc(): BsProductCQ = { regOBD("PRODUCT_NAME"); return this; }

    protected var _productHandleCode: ConditionValue = null;
    def getProductHandleCode(): ConditionValue =
    { if (_productHandleCode == null) { _productHandleCode = nCV(); }
      return _productHandleCode; }
    protected def getCValueProductHandleCode(): ConditionValue = { return getProductHandleCode(); }

    /** 
     * Add order-by as ascend. <br />
     * (商品ハンドルコード)PRODUCT_HANDLE_CODE: {UQ, NotNull, VARCHAR(100)}
     * @return this. (NotNull)
     */
    def addOrderBy_ProductHandleCode_Asc(): BsProductCQ = { regOBA("PRODUCT_HANDLE_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * (商品ハンドルコード)PRODUCT_HANDLE_CODE: {UQ, NotNull, VARCHAR(100)}
     * @return this. (NotNull)
     */
    def addOrderBy_ProductHandleCode_Desc(): BsProductCQ = { regOBD("PRODUCT_HANDLE_CODE"); return this; }

    protected var _productCategoryCode: ConditionValue = null;
    def getProductCategoryCode(): ConditionValue =
    { if (_productCategoryCode == null) { _productCategoryCode = nCV(); }
      return _productCategoryCode; }
    protected def getCValueProductCategoryCode(): ConditionValue = { return getProductCategoryCode(); }

    /** 
     * Add order-by as ascend. <br />
     * PRODUCT_CATEGORY_CODE: {IX, NotNull, CHAR(3), FK to PRODUCT_CATEGORY}
     * @return this. (NotNull)
     */
    def addOrderBy_ProductCategoryCode_Asc(): BsProductCQ = { regOBA("PRODUCT_CATEGORY_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * PRODUCT_CATEGORY_CODE: {IX, NotNull, CHAR(3), FK to PRODUCT_CATEGORY}
     * @return this. (NotNull)
     */
    def addOrderBy_ProductCategoryCode_Desc(): BsProductCQ = { regOBD("PRODUCT_CATEGORY_CODE"); return this; }

    protected var _productStatusCode: ConditionValue = null;
    def getProductStatusCode(): ConditionValue =
    { if (_productStatusCode == null) { _productStatusCode = nCV(); }
      return _productStatusCode; }
    protected def getCValueProductStatusCode(): ConditionValue = { return getProductStatusCode(); }

    /** 
     * Add order-by as ascend. <br />
     * PRODUCT_STATUS_CODE: {IX, NotNull, CHAR(3), FK to PRODUCT_STATUS, classification=ProductStatus}
     * @return this. (NotNull)
     */
    def addOrderBy_ProductStatusCode_Asc(): BsProductCQ = { regOBA("PRODUCT_STATUS_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * PRODUCT_STATUS_CODE: {IX, NotNull, CHAR(3), FK to PRODUCT_STATUS, classification=ProductStatus}
     * @return this. (NotNull)
     */
    def addOrderBy_ProductStatusCode_Desc(): BsProductCQ = { regOBD("PRODUCT_STATUS_CODE"); return this; }

    protected var _regularPrice: ConditionValue = null;
    def getRegularPrice(): ConditionValue =
    { if (_regularPrice == null) { _regularPrice = nCV(); }
      return _regularPrice; }
    protected def getCValueRegularPrice(): ConditionValue = { return getRegularPrice(); }

    /** 
     * Add order-by as ascend. <br />
     * (定価)REGULAR_PRICE: {NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    def addOrderBy_RegularPrice_Asc(): BsProductCQ = { regOBA("REGULAR_PRICE"); return this; }

    /**
     * Add order-by as descend. <br />
     * (定価)REGULAR_PRICE: {NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    def addOrderBy_RegularPrice_Desc(): BsProductCQ = { regOBD("REGULAR_PRICE"); return this; }

    protected var _registerDatetime: ConditionValue = null;
    def getRegisterDatetime(): ConditionValue =
    { if (_registerDatetime == null) { _registerDatetime = nCV(); }
      return _registerDatetime; }
    protected def getCValueRegisterDatetime(): ConditionValue = { return getRegisterDatetime(); }

    /** 
     * Add order-by as ascend. <br />
     * REGISTER_DATETIME: {NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    def addOrderBy_RegisterDatetime_Asc(): BsProductCQ = { regOBA("REGISTER_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br />
     * REGISTER_DATETIME: {NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    def addOrderBy_RegisterDatetime_Desc(): BsProductCQ = { regOBD("REGISTER_DATETIME"); return this; }

    protected var _registerUser: ConditionValue = null;
    def getRegisterUser(): ConditionValue =
    { if (_registerUser == null) { _registerUser = nCV(); }
      return _registerUser; }
    protected def getCValueRegisterUser(): ConditionValue = { return getRegisterUser(); }

    /** 
     * Add order-by as ascend. <br />
     * REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    def addOrderBy_RegisterUser_Asc(): BsProductCQ = { regOBA("REGISTER_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    def addOrderBy_RegisterUser_Desc(): BsProductCQ = { regOBD("REGISTER_USER"); return this; }

    protected var _updateDatetime: ConditionValue = null;
    def getUpdateDatetime(): ConditionValue =
    { if (_updateDatetime == null) { _updateDatetime = nCV(); }
      return _updateDatetime; }
    protected def getCValueUpdateDatetime(): ConditionValue = { return getUpdateDatetime(); }

    /** 
     * Add order-by as ascend. <br />
     * UPDATE_DATETIME: {NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    def addOrderBy_UpdateDatetime_Asc(): BsProductCQ = { regOBA("UPDATE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br />
     * UPDATE_DATETIME: {NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    def addOrderBy_UpdateDatetime_Desc(): BsProductCQ = { regOBD("UPDATE_DATETIME"); return this; }

    protected var _updateUser: ConditionValue = null;
    def getUpdateUser(): ConditionValue =
    { if (_updateUser == null) { _updateUser = nCV(); }
      return _updateUser; }
    protected def getCValueUpdateUser(): ConditionValue = { return getUpdateUser(); }

    /** 
     * Add order-by as ascend. <br />
     * UPDATE_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    def addOrderBy_UpdateUser_Asc(): BsProductCQ = { regOBA("UPDATE_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * UPDATE_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    def addOrderBy_UpdateUser_Desc(): BsProductCQ = { regOBD("UPDATE_USER"); return this; }

    protected var _versionNo: ConditionValue = null;
    def getVersionNo(): ConditionValue =
    { if (_versionNo == null) { _versionNo = nCV(); }
      return _versionNo; }
    protected def getCValueVersionNo(): ConditionValue = { return getVersionNo(); }

    /** 
     * Add order-by as ascend. <br />
     * VERSION_NO: {NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    def addOrderBy_VersionNo_Asc(): BsProductCQ = { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br />
     * VERSION_NO: {NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    def addOrderBy_VersionNo_Desc(): BsProductCQ = { regOBD("VERSION_NO"); return this; }

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
    def addSpecifiedDerivedOrderBy_Asc(aliasName: String): BsProductCQ = { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    def addSpecifiedDerivedOrderBy_Desc(aliasName: String): BsProductCQ = { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    def reflectRelationOnUnionQuery(bqs: ConditionQuery, uqs: ConditionQuery): Unit = {
        val bq: ProductCQ = bqs.asInstanceOf[ProductCQ];
        val uq: ProductCQ = uqs.asInstanceOf[ProductCQ];
        if (bq.hasConditionQueryProductCategory()) {
            uq.queryProductCategory().reflectRelationOnUnionQuery(bq.queryProductCategory(), uq.queryProductCategory());
        }
        if (bq.hasConditionQueryProductStatus()) {
            uq.queryProductStatus().reflectRelationOnUnionQuery(bq.queryProductStatus(), uq.queryProductStatus());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * (商品カテゴリ)PRODUCT_CATEGORY by my PRODUCT_CATEGORY_CODE, named 'productCategory'.
     * @return The instance of condition-query. (NotNull)
     */
    def queryProductCategory(): ProductCategoryCQ = {
        return getConditionQueryProductCategory();
    }
    def getConditionQueryProductCategory(): ProductCategoryCQ = {
        val prop = "productCategory";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryProductCategory()); xsetupOuterJoinProductCategory(); }
        return xgetQueRlMap(prop);
    }
    protected def xcreateQueryProductCategory(): ProductCategoryCQ = {
        val nrp = xresolveNRP("PRODUCT",  "productCategory"); val jan = xresolveJAN(nrp,  xgetNNLvl());
        return xinitRelCQ(new ProductCategoryCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "productCategory", nrp);
    }
    protected def xsetupOuterJoinProductCategory(): Unit = { xregOutJo("productCategory") }
    def hasConditionQueryProductCategory(): Boolean = { xhasQueRlMap("productCategory") }

    /**
     * Get the condition-query for relation table. <br />
     * (商品ステータス)PRODUCT_STATUS by my PRODUCT_STATUS_CODE, named 'productStatus'.
     * @return The instance of condition-query. (NotNull)
     */
    def queryProductStatus(): ProductStatusCQ = {
        return getConditionQueryProductStatus();
    }
    def getConditionQueryProductStatus(): ProductStatusCQ = {
        val prop = "productStatus";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryProductStatus()); xsetupOuterJoinProductStatus(); }
        return xgetQueRlMap(prop);
    }
    protected def xcreateQueryProductStatus(): ProductStatusCQ = {
        val nrp = xresolveNRP("PRODUCT",  "productStatus"); val jan = xresolveJAN(nrp,  xgetNNLvl());
        return xinitRelCQ(new ProductStatusCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "productStatus", nrp);
    }
    protected def xsetupOuterJoinProductStatus(): Unit = { xregOutJo("productStatus") }
    def hasConditionQueryProductStatus(): Boolean = { xhasQueRlMap("productStatus") }

    protected def xfindFixedConditionDynamicParameterMap(property: String): Map[String, Object] = {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    def getScalarCondition(): Map[String, ProductCQ] = { xgetSQueMap("scalarCondition") }
    def keepScalarCondition(sq: ProductCQ): String = { xkeepSQue("scalarCondition", sq) }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    def getSpecifyMyselfDerived(): Map[String, ProductCQ] = { xgetSQueMap("specifyMyselfDerived") }
    def keepSpecifyMyselfDerived(sq: ProductCQ): String = { xkeepSQue("specifyMyselfDerived", sq) }

    def getQueryMyselfDerived(): Map[String, ProductCQ] = { xgetSQueMap("queryMyselfDerived") }
    def keepQueryMyselfDerived(sq: ProductCQ): String = { xkeepSQue("queryMyselfDerived", sq) }
    def getQueryMyselfDerivedParameter(): Map[String, Object] = { xgetSQuePmMap("qyeryMyselfDerived") }
    def keepQueryMyselfDerivedParameter(pm: Object): String = { xkeepSQuePm("qyeryMyselfDerived", pm) }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    def getMyselfExists(): Map[String, ProductCQ] = { xgetSQueMap("myselfExists") }
    def keepMyselfExists(sq: ProductCQ): String = { xkeepSQue("myselfExists", sq) }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    def getMyselfInScope(): Map[String, ProductCQ] = { xgetSQueMap("myselfInScope") }
    def keepMyselfInScope(sq: ProductCQ): String = { xkeepSQue("myselfInScope", sq) }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected def xCB(): String = { return classOf[ProductCB].getName(); }
    protected def xCQ(): String = { return classOf[ProductCQ].getName(); }
    protected def xCHp(): String = { return classOf[HpCalculator].getName(); }
    protected def xCOp(): String = { return classOf[ConditionOption].getName(); }
    protected def xMap(): String = { return classOf[Map[_, _]].getName(); }
}
