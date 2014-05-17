package com.example.dbflute.scala.dbflute.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean._
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
    def getProductId(): ConditionValue = {
        if (_productId == null) { _productId = nCV(); }
        return _productId;
    }
    protected def getCValueProductId(): ConditionValue = { return getProductId(); }

    protected var _productId_ExistsReferrer_PurchaseListMap: Map[String, PurchaseCQ] = null;
    def getProductId_ExistsReferrer_PurchaseList(): Map[String, PurchaseCQ] = { return _productId_ExistsReferrer_PurchaseListMap; }
    def keepProductId_ExistsReferrer_PurchaseList(sq: PurchaseCQ): String = {
        if (_productId_ExistsReferrer_PurchaseListMap == null) { _productId_ExistsReferrer_PurchaseListMap = newLinkedHashMapSized(4); }
        val ky: String = "subQueryMapKey" + (_productId_ExistsReferrer_PurchaseListMap.size() + 1);
        _productId_ExistsReferrer_PurchaseListMap.put(ky, sq); return "productId_ExistsReferrer_PurchaseList." + ky;
    }

    protected var _productId_NotExistsReferrer_PurchaseListMap: Map[String, PurchaseCQ] = null;
    def getProductId_NotExistsReferrer_PurchaseList(): Map[String, PurchaseCQ] = { return _productId_NotExistsReferrer_PurchaseListMap; }
    def keepProductId_NotExistsReferrer_PurchaseList(sq: PurchaseCQ): String = {
        if (_productId_NotExistsReferrer_PurchaseListMap == null) { _productId_NotExistsReferrer_PurchaseListMap = newLinkedHashMapSized(4); }
        val ky: String = "subQueryMapKey" + (_productId_NotExistsReferrer_PurchaseListMap.size() + 1);
        _productId_NotExistsReferrer_PurchaseListMap.put(ky, sq); return "productId_NotExistsReferrer_PurchaseList." + ky;
    }

    protected var _productId_SpecifyDerivedReferrer_PurchaseListMap: Map[String, PurchaseCQ] = null;
    def getProductId_SpecifyDerivedReferrer_PurchaseList(): Map[String, PurchaseCQ] = { return _productId_SpecifyDerivedReferrer_PurchaseListMap; }
    def keepProductId_SpecifyDerivedReferrer_PurchaseList(sq: PurchaseCQ): String = {
        if (_productId_SpecifyDerivedReferrer_PurchaseListMap == null) { _productId_SpecifyDerivedReferrer_PurchaseListMap = newLinkedHashMapSized(4); }
        val ky: String = "subQueryMapKey" + (_productId_SpecifyDerivedReferrer_PurchaseListMap.size() + 1);
        _productId_SpecifyDerivedReferrer_PurchaseListMap.put(ky, sq); return "productId_SpecifyDerivedReferrer_PurchaseList." + ky;
    }

    protected var _productId_InScopeRelation_PurchaseListMap: Map[String, PurchaseCQ] = null;
    def getProductId_InScopeRelation_PurchaseList(): Map[String, PurchaseCQ] = { return _productId_InScopeRelation_PurchaseListMap; }
    def keepProductId_InScopeRelation_PurchaseList(sq: PurchaseCQ): String = {
        if (_productId_InScopeRelation_PurchaseListMap == null) { _productId_InScopeRelation_PurchaseListMap = newLinkedHashMapSized(4); }
        val ky: String = "subQueryMapKey" + (_productId_InScopeRelation_PurchaseListMap.size() + 1);
        _productId_InScopeRelation_PurchaseListMap.put(ky, sq); return "productId_InScopeRelation_PurchaseList." + ky;
    }

    protected var _productId_NotInScopeRelation_PurchaseListMap: Map[String, PurchaseCQ] = null;
    def getProductId_NotInScopeRelation_PurchaseList(): Map[String, PurchaseCQ] = { return _productId_NotInScopeRelation_PurchaseListMap; }
    def keepProductId_NotInScopeRelation_PurchaseList(sq: PurchaseCQ): String = {
        if (_productId_NotInScopeRelation_PurchaseListMap == null) { _productId_NotInScopeRelation_PurchaseListMap = newLinkedHashMapSized(4); }
        val ky: String = "subQueryMapKey" + (_productId_NotInScopeRelation_PurchaseListMap.size() + 1);
        _productId_NotInScopeRelation_PurchaseListMap.put(ky, sq); return "productId_NotInScopeRelation_PurchaseList." + ky;
    }

    protected var _productId_QueryDerivedReferrer_PurchaseListMap: Map[String, PurchaseCQ] = null;
    def getProductId_QueryDerivedReferrer_PurchaseList(): Map[String, PurchaseCQ] = { return _productId_QueryDerivedReferrer_PurchaseListMap; }
    def keepProductId_QueryDerivedReferrer_PurchaseList(sq: PurchaseCQ): String = {
        if (_productId_QueryDerivedReferrer_PurchaseListMap == null) { _productId_QueryDerivedReferrer_PurchaseListMap = newLinkedHashMapSized(4); }
        val ky: String = "subQueryMapKey" + (_productId_QueryDerivedReferrer_PurchaseListMap.size() + 1);
        _productId_QueryDerivedReferrer_PurchaseListMap.put(ky, sq); return "productId_QueryDerivedReferrer_PurchaseList." + ky;
    }
    protected var _productId_QueryDerivedReferrer_PurchaseListParameterMap: Map[String, Object] = null;
    def getProductId_QueryDerivedReferrer_PurchaseListParameter(): Map[String, Object] = { return _productId_QueryDerivedReferrer_PurchaseListParameterMap; }
    def keepProductId_QueryDerivedReferrer_PurchaseListParameter(vl: Object): String = {
        if (_productId_QueryDerivedReferrer_PurchaseListParameterMap == null) { _productId_QueryDerivedReferrer_PurchaseListParameterMap = newLinkedHashMapSized(4); }
        val ky: String = "subQueryParameterKey" + (_productId_QueryDerivedReferrer_PurchaseListParameterMap.size() + 1);
        _productId_QueryDerivedReferrer_PurchaseListParameterMap.put(ky, vl); return "productId_QueryDerivedReferrer_PurchaseListParameter." + ky;
    }

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
    def getProductName(): ConditionValue = {
        if (_productName == null) { _productName = nCV(); }
        return _productName;
    }
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
    def getProductHandleCode(): ConditionValue = {
        if (_productHandleCode == null) { _productHandleCode = nCV(); }
        return _productHandleCode;
    }
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
    def getProductCategoryCode(): ConditionValue = {
        if (_productCategoryCode == null) { _productCategoryCode = nCV(); }
        return _productCategoryCode;
    }
    protected def getCValueProductCategoryCode(): ConditionValue = { return getProductCategoryCode(); }

    /** 
     * Add order-by as ascend. <br />
     * PRODUCT_CATEGORY_CODE: {IX, NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    def addOrderBy_ProductCategoryCode_Asc(): BsProductCQ = { regOBA("PRODUCT_CATEGORY_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * PRODUCT_CATEGORY_CODE: {IX, NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    def addOrderBy_ProductCategoryCode_Desc(): BsProductCQ = { regOBD("PRODUCT_CATEGORY_CODE"); return this; }

    protected var _productStatusCode: ConditionValue = null;
    def getProductStatusCode(): ConditionValue = {
        if (_productStatusCode == null) { _productStatusCode = nCV(); }
        return _productStatusCode;
    }
    protected def getCValueProductStatusCode(): ConditionValue = { return getProductStatusCode(); }

    /** 
     * Add order-by as ascend. <br />
     * PRODUCT_STATUS_CODE: {IX, NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    def addOrderBy_ProductStatusCode_Asc(): BsProductCQ = { regOBA("PRODUCT_STATUS_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * PRODUCT_STATUS_CODE: {IX, NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    def addOrderBy_ProductStatusCode_Desc(): BsProductCQ = { regOBD("PRODUCT_STATUS_CODE"); return this; }

    protected var _regularPrice: ConditionValue = null;
    def getRegularPrice(): ConditionValue = {
        if (_regularPrice == null) { _regularPrice = nCV(); }
        return _regularPrice;
    }
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
    def getRegisterDatetime(): ConditionValue = {
        if (_registerDatetime == null) { _registerDatetime = nCV(); }
        return _registerDatetime;
    }
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
    def getRegisterUser(): ConditionValue = {
        if (_registerUser == null) { _registerUser = nCV(); }
        return _registerUser;
    }
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
    def getUpdateDatetime(): ConditionValue = {
        if (_updateDatetime == null) { _updateDatetime = nCV(); }
        return _updateDatetime;
    }
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
    def getUpdateUser(): ConditionValue = {
        if (_updateUser == null) { _updateUser = nCV(); }
        return _updateUser;
    }
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
    def getVersionNo(): ConditionValue = {
        if (_versionNo == null) { _versionNo = nCV(); }
        return _versionNo;
    }
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
    def addSpecifiedDerivedOrderBy_Asc(aliasName: String): BsProductCQ =
    { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    def addSpecifiedDerivedOrderBy_Desc(aliasName: String): BsProductCQ =
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    protected var _scalarConditionMap: Map[String, ProductCQ] = null;
    def getScalarCondition(): Map[String, ProductCQ] = { return _scalarConditionMap; }
    def keepScalarCondition(sq: ProductCQ): String = {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        val ky: String = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(ky, sq); return "scalarCondition." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected var _specifyMyselfDerivedMap: Map[String, ProductCQ] = null;
    def getSpecifyMyselfDerived(): Map[String, ProductCQ] = { return _specifyMyselfDerivedMap; }
    def keepSpecifyMyselfDerived(sq: ProductCQ): String = {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        val ky: String = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(ky, sq); return "specifyMyselfDerived." + ky;
    }

    protected var _queryMyselfDerivedMap: Map[String, ProductCQ] = null;
    def getQueryMyselfDerived(): Map[String, ProductCQ] = { return _queryMyselfDerivedMap; }
    def keepQueryMyselfDerived(sq: ProductCQ): String = {
        if (_queryMyselfDerivedMap == null) { _queryMyselfDerivedMap = newLinkedHashMapSized(4); }
        val ky: String = "subQueryMapKey" + (_queryMyselfDerivedMap.size() + 1);
        _queryMyselfDerivedMap.put(ky, sq); return "queryMyselfDerived." + ky;
    }
    protected var _qyeryMyselfDerivedParameterMap: Map[String, Object] = null;
    def getQueryMyselfDerivedParameter(): Map[String, Object] = { return _qyeryMyselfDerivedParameterMap; }
    def keepQueryMyselfDerivedParameter(vl: Object): String = {
        if (_qyeryMyselfDerivedParameterMap == null) { _qyeryMyselfDerivedParameterMap = newLinkedHashMapSized(4); }
        val ky: String = "subQueryParameterKey" + (_qyeryMyselfDerivedParameterMap.size() + 1);
        _qyeryMyselfDerivedParameterMap.put(ky, vl); return "queryMyselfDerivedParameter." + ky;
    }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected var _myselfExistsMap: Map[String, ProductCQ] = null;
    def getMyselfExists(): Map[String, ProductCQ] = { return _myselfExistsMap; }
    def keepMyselfExists(sq: ProductCQ): String = {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        val ky: String = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(ky, sq); return "myselfExists." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected var _myselfInScopeMap: Map[String, ProductCQ] = null;
    def getMyselfInScope(): Map[String, ProductCQ] = { return _myselfInScopeMap; }
    def keepMyselfInScope(sq: ProductCQ): String = {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        val ky: String = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(ky, sq); return "myselfInScope." + ky;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected def xCB(): String = { return classOf[ProductCB].getName(); }
    protected def xCQ(): String = { return classOf[ProductCQ].getName(); }
    protected def xMap(): String = { return classOf[Map[_, _]].getName(); }
}
