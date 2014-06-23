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
 * The base condition-query of PURCHASE.
 * @author DBFlute(AutoGenerator)
 */
class BsPurchaseCQ(referrerQuery: ConditionQuery, sqlClause: SqlClause, aliasName: String, nestLevel: Integer) extends AbstractBsPurchaseCQ(referrerQuery, sqlClause, aliasName, nestLevel) {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected var _inlineQuery: PurchaseCIQ = null;

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from PURCHASE) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    def inline(): PurchaseCIQ = {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected def xcreateCIQ(): PurchaseCIQ = {
        val ciq: PurchaseCIQ = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected def xnewCIQ(): PurchaseCIQ = {
        return new PurchaseCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join PURCHASE on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    def on(): PurchaseCIQ = {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        val inlineQuery: PurchaseCIQ = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected var _purchaseId: ConditionValue = null;
    def getPurchaseId(): ConditionValue =
    { if (_purchaseId == null) { _purchaseId = nCV(); }
      return _purchaseId; }
    protected def getCValuePurchaseId(): ConditionValue = { return getPurchaseId(); }

    def getPurchaseId_ExistsReferrer_PurchasePaymentList(): Map[String, PurchasePaymentCQ] = { xgetSQueMap("purchaseId_ExistsReferrer_PurchasePaymentList") }
    def keepPurchaseId_ExistsReferrer_PurchasePaymentList(sq: PurchasePaymentCQ): String = { xkeepSQue("purchaseId_ExistsReferrer_PurchasePaymentList", sq) }

    def getPurchaseId_NotExistsReferrer_PurchasePaymentList(): Map[String, PurchasePaymentCQ] = { xgetSQueMap("purchaseId_NotExistsReferrer_PurchasePaymentList") }
    def keepPurchaseId_NotExistsReferrer_PurchasePaymentList(sq: PurchasePaymentCQ): String = { xkeepSQue("purchaseId_NotExistsReferrer_PurchasePaymentList", sq) }

    def getPurchaseId_SpecifyDerivedReferrer_PurchasePaymentList(): Map[String, PurchasePaymentCQ] = { xgetSQueMap("purchaseId_SpecifyDerivedReferrer_PurchasePaymentList") }
    def keepPurchaseId_SpecifyDerivedReferrer_PurchasePaymentList(sq: PurchasePaymentCQ): String = { xkeepSQue("purchaseId_SpecifyDerivedReferrer_PurchasePaymentList", sq) }

    def getPurchaseId_InScopeRelation_PurchasePaymentList(): Map[String, PurchasePaymentCQ] = { xgetSQueMap("purchaseId_InScopeRelation_PurchasePaymentList") }
    def keepPurchaseId_InScopeRelation_PurchasePaymentList(sq: PurchasePaymentCQ): String = { xkeepSQue("purchaseId_InScopeRelation_PurchasePaymentList", sq) }

    def getPurchaseId_NotInScopeRelation_PurchasePaymentList(): Map[String, PurchasePaymentCQ] = { xgetSQueMap("purchaseId_NotInScopeRelation_PurchasePaymentList") }
    def keepPurchaseId_NotInScopeRelation_PurchasePaymentList(sq: PurchasePaymentCQ): String = { xkeepSQue("purchaseId_NotInScopeRelation_PurchasePaymentList", sq) }

    def getPurchaseId_QueryDerivedReferrer_PurchasePaymentList(): Map[String, PurchasePaymentCQ] = { xgetSQueMap("purchaseId_QueryDerivedReferrer_PurchasePaymentList") }
    def keepPurchaseId_QueryDerivedReferrer_PurchasePaymentList(sq: PurchasePaymentCQ): String = { xkeepSQue("purchaseId_QueryDerivedReferrer_PurchasePaymentList", sq) }
    def getPurchaseId_QueryDerivedReferrer_PurchasePaymentListParameter(): Map[String, Object] = { xgetSQuePmMap("purchaseId_QueryDerivedReferrer_PurchasePaymentList") }
    def keepPurchaseId_QueryDerivedReferrer_PurchasePaymentListParameter(pm: Object): String = { xkeepSQuePm("purchaseId_QueryDerivedReferrer_PurchasePaymentList", pm) }

    /** 
     * Add order-by as ascend. <br />
     * PURCHASE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    def addOrderBy_PurchaseId_Asc(): BsPurchaseCQ = { regOBA("PURCHASE_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * PURCHASE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    def addOrderBy_PurchaseId_Desc(): BsPurchaseCQ = { regOBD("PURCHASE_ID"); return this; }

    protected var _memberId: ConditionValue = null;
    def getMemberId(): ConditionValue =
    { if (_memberId == null) { _memberId = nCV(); }
      return _memberId; }
    protected def getCValueMemberId(): ConditionValue = { return getMemberId(); }

    /** 
     * Add order-by as ascend. <br />
     * (会員ID)MEMBER_ID: {UQ+, IX+, NotNull, INTEGER(10), FK to MEMBER}
     * @return this. (NotNull)
     */
    def addOrderBy_MemberId_Asc(): BsPurchaseCQ = { regOBA("MEMBER_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * (会員ID)MEMBER_ID: {UQ+, IX+, NotNull, INTEGER(10), FK to MEMBER}
     * @return this. (NotNull)
     */
    def addOrderBy_MemberId_Desc(): BsPurchaseCQ = { regOBD("MEMBER_ID"); return this; }

    protected var _productId: ConditionValue = null;
    def getProductId(): ConditionValue =
    { if (_productId == null) { _productId = nCV(); }
      return _productId; }
    protected def getCValueProductId(): ConditionValue = { return getProductId(); }

    /** 
     * Add order-by as ascend. <br />
     * (商品ID)PRODUCT_ID: {+UQ, IX+, NotNull, INTEGER(10), FK to PRODUCT}
     * @return this. (NotNull)
     */
    def addOrderBy_ProductId_Asc(): BsPurchaseCQ = { regOBA("PRODUCT_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * (商品ID)PRODUCT_ID: {+UQ, IX+, NotNull, INTEGER(10), FK to PRODUCT}
     * @return this. (NotNull)
     */
    def addOrderBy_ProductId_Desc(): BsPurchaseCQ = { regOBD("PRODUCT_ID"); return this; }

    protected var _purchaseDatetime: ConditionValue = null;
    def getPurchaseDatetime(): ConditionValue =
    { if (_purchaseDatetime == null) { _purchaseDatetime = nCV(); }
      return _purchaseDatetime; }
    protected def getCValuePurchaseDatetime(): ConditionValue = { return getPurchaseDatetime(); }

    /** 
     * Add order-by as ascend. <br />
     * (購入日時)PURCHASE_DATETIME: {+UQ, IX+, NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    def addOrderBy_PurchaseDatetime_Asc(): BsPurchaseCQ = { regOBA("PURCHASE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br />
     * (購入日時)PURCHASE_DATETIME: {+UQ, IX+, NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    def addOrderBy_PurchaseDatetime_Desc(): BsPurchaseCQ = { regOBD("PURCHASE_DATETIME"); return this; }

    protected var _purchaseCount: ConditionValue = null;
    def getPurchaseCount(): ConditionValue =
    { if (_purchaseCount == null) { _purchaseCount = nCV(); }
      return _purchaseCount; }
    protected def getCValuePurchaseCount(): ConditionValue = { return getPurchaseCount(); }

    /** 
     * Add order-by as ascend. <br />
     * (購入数量)PURCHASE_COUNT: {NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    def addOrderBy_PurchaseCount_Asc(): BsPurchaseCQ = { regOBA("PURCHASE_COUNT"); return this; }

    /**
     * Add order-by as descend. <br />
     * (購入数量)PURCHASE_COUNT: {NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    def addOrderBy_PurchaseCount_Desc(): BsPurchaseCQ = { regOBD("PURCHASE_COUNT"); return this; }

    protected var _purchasePrice: ConditionValue = null;
    def getPurchasePrice(): ConditionValue =
    { if (_purchasePrice == null) { _purchasePrice = nCV(); }
      return _purchasePrice; }
    protected def getCValuePurchasePrice(): ConditionValue = { return getPurchasePrice(); }

    /** 
     * Add order-by as ascend. <br />
     * (購入価格)PURCHASE_PRICE: {IX, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    def addOrderBy_PurchasePrice_Asc(): BsPurchaseCQ = { regOBA("PURCHASE_PRICE"); return this; }

    /**
     * Add order-by as descend. <br />
     * (購入価格)PURCHASE_PRICE: {IX, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    def addOrderBy_PurchasePrice_Desc(): BsPurchaseCQ = { regOBD("PURCHASE_PRICE"); return this; }

    protected var _paymentCompleteFlg: ConditionValue = null;
    def getPaymentCompleteFlg(): ConditionValue =
    { if (_paymentCompleteFlg == null) { _paymentCompleteFlg = nCV(); }
      return _paymentCompleteFlg; }
    protected def getCValuePaymentCompleteFlg(): ConditionValue = { return getPaymentCompleteFlg(); }

    /** 
     * Add order-by as ascend. <br />
     * (支払完了フラグ)PAYMENT_COMPLETE_FLG: {NotNull, INTEGER(10), classification=Flg}
     * @return this. (NotNull)
     */
    def addOrderBy_PaymentCompleteFlg_Asc(): BsPurchaseCQ = { regOBA("PAYMENT_COMPLETE_FLG"); return this; }

    /**
     * Add order-by as descend. <br />
     * (支払完了フラグ)PAYMENT_COMPLETE_FLG: {NotNull, INTEGER(10), classification=Flg}
     * @return this. (NotNull)
     */
    def addOrderBy_PaymentCompleteFlg_Desc(): BsPurchaseCQ = { regOBD("PAYMENT_COMPLETE_FLG"); return this; }

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
    def addOrderBy_RegisterDatetime_Asc(): BsPurchaseCQ = { regOBA("REGISTER_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br />
     * REGISTER_DATETIME: {NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    def addOrderBy_RegisterDatetime_Desc(): BsPurchaseCQ = { regOBD("REGISTER_DATETIME"); return this; }

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
    def addOrderBy_RegisterUser_Asc(): BsPurchaseCQ = { regOBA("REGISTER_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    def addOrderBy_RegisterUser_Desc(): BsPurchaseCQ = { regOBD("REGISTER_USER"); return this; }

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
    def addOrderBy_UpdateDatetime_Asc(): BsPurchaseCQ = { regOBA("UPDATE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br />
     * UPDATE_DATETIME: {NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    def addOrderBy_UpdateDatetime_Desc(): BsPurchaseCQ = { regOBD("UPDATE_DATETIME"); return this; }

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
    def addOrderBy_UpdateUser_Asc(): BsPurchaseCQ = { regOBA("UPDATE_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * UPDATE_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    def addOrderBy_UpdateUser_Desc(): BsPurchaseCQ = { regOBD("UPDATE_USER"); return this; }

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
    def addOrderBy_VersionNo_Asc(): BsPurchaseCQ = { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br />
     * VERSION_NO: {NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    def addOrderBy_VersionNo_Desc(): BsPurchaseCQ = { regOBD("VERSION_NO"); return this; }

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
    def addSpecifiedDerivedOrderBy_Asc(aliasName: String): BsPurchaseCQ = { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    def addSpecifiedDerivedOrderBy_Desc(aliasName: String): BsPurchaseCQ = { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    def reflectRelationOnUnionQuery(bqs: ConditionQuery, uqs: ConditionQuery): Unit = {
        val bq: PurchaseCQ = bqs.asInstanceOf[PurchaseCQ];
        val uq: PurchaseCQ = uqs.asInstanceOf[PurchaseCQ];
        if (bq.hasConditionQueryMember()) {
            uq.queryMember().reflectRelationOnUnionQuery(bq.queryMember(), uq.queryMember());
        }
        if (bq.hasConditionQueryProduct()) {
            uq.queryProduct().reflectRelationOnUnionQuery(bq.queryProduct(), uq.queryProduct());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * (会員)MEMBER by my MEMBER_ID, named 'member'.
     * @return The instance of condition-query. (NotNull)
     */
    def queryMember(): MemberCQ = {
        return getConditionQueryMember();
    }
    def getConditionQueryMember(): MemberCQ = {
        val prop = "member";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMember()); xsetupOuterJoinMember(); }
        return xgetQueRlMap(prop);
    }
    protected def xcreateQueryMember(): MemberCQ = {
        val nrp = xresolveNRP("PURCHASE",  "member"); val jan = xresolveJAN(nrp,  xgetNNLvl());
        return xinitRelCQ(new MemberCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "member", nrp);
    }
    protected def xsetupOuterJoinMember(): Unit = { xregOutJo("member") }
    def hasConditionQueryMember(): Boolean = { xhasQueRlMap("member") }

    /**
     * Get the condition-query for relation table. <br />
     * (商品)PRODUCT by my PRODUCT_ID, named 'product'.
     * @return The instance of condition-query. (NotNull)
     */
    def queryProduct(): ProductCQ = {
        return getConditionQueryProduct();
    }
    def getConditionQueryProduct(): ProductCQ = {
        val prop = "product";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryProduct()); xsetupOuterJoinProduct(); }
        return xgetQueRlMap(prop);
    }
    protected def xcreateQueryProduct(): ProductCQ = {
        val nrp = xresolveNRP("PURCHASE",  "product"); val jan = xresolveJAN(nrp,  xgetNNLvl());
        return xinitRelCQ(new ProductCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "product", nrp);
    }
    protected def xsetupOuterJoinProduct(): Unit = { xregOutJo("product") }
    def hasConditionQueryProduct(): Boolean = { xhasQueRlMap("product") }

    protected def xfindFixedConditionDynamicParameterMap(property: String): Map[String, Object] = {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    def getScalarCondition(): Map[String, PurchaseCQ] = { xgetSQueMap("scalarCondition") }
    def keepScalarCondition(sq: PurchaseCQ): String = { xkeepSQue("scalarCondition", sq) }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    def getSpecifyMyselfDerived(): Map[String, PurchaseCQ] = { xgetSQueMap("specifyMyselfDerived") }
    def keepSpecifyMyselfDerived(sq: PurchaseCQ): String = { xkeepSQue("specifyMyselfDerived", sq) }

    def getQueryMyselfDerived(): Map[String, PurchaseCQ] = { xgetSQueMap("queryMyselfDerived") }
    def keepQueryMyselfDerived(sq: PurchaseCQ): String = { xkeepSQue("queryMyselfDerived", sq) }
    def getQueryMyselfDerivedParameter(): Map[String, Object] = { xgetSQuePmMap("qyeryMyselfDerived") }
    def keepQueryMyselfDerivedParameter(pm: Object): String = { xkeepSQuePm("qyeryMyselfDerived", pm) }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    def getMyselfExists(): Map[String, PurchaseCQ] = { xgetSQueMap("myselfExists") }
    def keepMyselfExists(sq: PurchaseCQ): String = { xkeepSQue("myselfExists", sq) }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    def getMyselfInScope(): Map[String, PurchaseCQ] = { xgetSQueMap("myselfInScope") }
    def keepMyselfInScope(sq: PurchaseCQ): String = { xkeepSQue("myselfInScope", sq) }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected def xCB(): String = { return classOf[PurchaseCB].getName(); }
    protected def xCQ(): String = { return classOf[PurchaseCQ].getName(); }
    protected def xCHp(): String = { return classOf[HpCalculator].getName(); }
    protected def xCOp(): String = { return classOf[ConditionOption].getName(); }
    protected def xMap(): String = { return classOf[Map[_, _]].getName(); }
}
