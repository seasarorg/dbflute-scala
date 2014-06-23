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
 * The base condition-query of PURCHASE_PAYMENT.
 * @author DBFlute(AutoGenerator)
 */
class BsPurchasePaymentCQ(referrerQuery: ConditionQuery, sqlClause: SqlClause, aliasName: String, nestLevel: Integer) extends AbstractBsPurchasePaymentCQ(referrerQuery, sqlClause, aliasName, nestLevel) {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected var _inlineQuery: PurchasePaymentCIQ = null;

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from PURCHASE_PAYMENT) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    def inline(): PurchasePaymentCIQ = {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected def xcreateCIQ(): PurchasePaymentCIQ = {
        val ciq: PurchasePaymentCIQ = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected def xnewCIQ(): PurchasePaymentCIQ = {
        return new PurchasePaymentCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join PURCHASE_PAYMENT on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    def on(): PurchasePaymentCIQ = {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        val inlineQuery: PurchasePaymentCIQ = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected var _purchasePaymentId: ConditionValue = null;
    def getPurchasePaymentId(): ConditionValue =
    { if (_purchasePaymentId == null) { _purchasePaymentId = nCV(); }
      return _purchasePaymentId; }
    protected def getCValuePurchasePaymentId(): ConditionValue = { return getPurchasePaymentId(); }

    /** 
     * Add order-by as ascend. <br />
     * (購入支払ID)PURCHASE_PAYMENT_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    def addOrderBy_PurchasePaymentId_Asc(): BsPurchasePaymentCQ = { regOBA("PURCHASE_PAYMENT_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * (購入支払ID)PURCHASE_PAYMENT_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    def addOrderBy_PurchasePaymentId_Desc(): BsPurchasePaymentCQ = { regOBD("PURCHASE_PAYMENT_ID"); return this; }

    protected var _purchaseId: ConditionValue = null;
    def getPurchaseId(): ConditionValue =
    { if (_purchaseId == null) { _purchaseId = nCV(); }
      return _purchaseId; }
    protected def getCValuePurchaseId(): ConditionValue = { return getPurchaseId(); }

    /** 
     * Add order-by as ascend. <br />
     * (購入ID)PURCHASE_ID: {IX, NotNull, BIGINT(19), FK to PURCHASE}
     * @return this. (NotNull)
     */
    def addOrderBy_PurchaseId_Asc(): BsPurchasePaymentCQ = { regOBA("PURCHASE_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * (購入ID)PURCHASE_ID: {IX, NotNull, BIGINT(19), FK to PURCHASE}
     * @return this. (NotNull)
     */
    def addOrderBy_PurchaseId_Desc(): BsPurchasePaymentCQ = { regOBD("PURCHASE_ID"); return this; }

    protected var _paymentAmount: ConditionValue = null;
    def getPaymentAmount(): ConditionValue =
    { if (_paymentAmount == null) { _paymentAmount = nCV(); }
      return _paymentAmount; }
    protected def getCValuePaymentAmount(): ConditionValue = { return getPaymentAmount(); }

    /** 
     * Add order-by as ascend. <br />
     * (支払金額)PAYMENT_AMOUNT: {NotNull, DECIMAL(10, 2)}
     * @return this. (NotNull)
     */
    def addOrderBy_PaymentAmount_Asc(): BsPurchasePaymentCQ = { regOBA("PAYMENT_AMOUNT"); return this; }

    /**
     * Add order-by as descend. <br />
     * (支払金額)PAYMENT_AMOUNT: {NotNull, DECIMAL(10, 2)}
     * @return this. (NotNull)
     */
    def addOrderBy_PaymentAmount_Desc(): BsPurchasePaymentCQ = { regOBD("PAYMENT_AMOUNT"); return this; }

    protected var _paymentDatetime: ConditionValue = null;
    def getPaymentDatetime(): ConditionValue =
    { if (_paymentDatetime == null) { _paymentDatetime = nCV(); }
      return _paymentDatetime; }
    protected def getCValuePaymentDatetime(): ConditionValue = { return getPaymentDatetime(); }

    /** 
     * Add order-by as ascend. <br />
     * (支払日時)PAYMENT_DATETIME: {IX+, NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    def addOrderBy_PaymentDatetime_Asc(): BsPurchasePaymentCQ = { regOBA("PAYMENT_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br />
     * (支払日時)PAYMENT_DATETIME: {IX+, NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    def addOrderBy_PaymentDatetime_Desc(): BsPurchasePaymentCQ = { regOBD("PAYMENT_DATETIME"); return this; }

    protected var _paymentMethodCode: ConditionValue = null;
    def getPaymentMethodCode(): ConditionValue =
    { if (_paymentMethodCode == null) { _paymentMethodCode = nCV(); }
      return _paymentMethodCode; }
    protected def getCValuePaymentMethodCode(): ConditionValue = { return getPaymentMethodCode(); }

    /** 
     * Add order-by as ascend. <br />
     * (支払方法コード)PAYMENT_METHOD_CODE: {NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    def addOrderBy_PaymentMethodCode_Asc(): BsPurchasePaymentCQ = { regOBA("PAYMENT_METHOD_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * (支払方法コード)PAYMENT_METHOD_CODE: {NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    def addOrderBy_PaymentMethodCode_Desc(): BsPurchasePaymentCQ = { regOBD("PAYMENT_METHOD_CODE"); return this; }

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
    def addOrderBy_RegisterDatetime_Asc(): BsPurchasePaymentCQ = { regOBA("REGISTER_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br />
     * REGISTER_DATETIME: {NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    def addOrderBy_RegisterDatetime_Desc(): BsPurchasePaymentCQ = { regOBD("REGISTER_DATETIME"); return this; }

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
    def addOrderBy_RegisterUser_Asc(): BsPurchasePaymentCQ = { regOBA("REGISTER_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    def addOrderBy_RegisterUser_Desc(): BsPurchasePaymentCQ = { regOBD("REGISTER_USER"); return this; }

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
    def addOrderBy_UpdateDatetime_Asc(): BsPurchasePaymentCQ = { regOBA("UPDATE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br />
     * UPDATE_DATETIME: {NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    def addOrderBy_UpdateDatetime_Desc(): BsPurchasePaymentCQ = { regOBD("UPDATE_DATETIME"); return this; }

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
    def addOrderBy_UpdateUser_Asc(): BsPurchasePaymentCQ = { regOBA("UPDATE_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * UPDATE_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    def addOrderBy_UpdateUser_Desc(): BsPurchasePaymentCQ = { regOBD("UPDATE_USER"); return this; }

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
    def addSpecifiedDerivedOrderBy_Asc(aliasName: String): BsPurchasePaymentCQ = { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    def addSpecifiedDerivedOrderBy_Desc(aliasName: String): BsPurchasePaymentCQ = { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    def reflectRelationOnUnionQuery(bqs: ConditionQuery, uqs: ConditionQuery): Unit = {
        val bq: PurchasePaymentCQ = bqs.asInstanceOf[PurchasePaymentCQ];
        val uq: PurchasePaymentCQ = uqs.asInstanceOf[PurchasePaymentCQ];
        if (bq.hasConditionQueryPurchase()) {
            uq.queryPurchase().reflectRelationOnUnionQuery(bq.queryPurchase(), uq.queryPurchase());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * (購入)PURCHASE by my PURCHASE_ID, named 'purchase'.
     * @return The instance of condition-query. (NotNull)
     */
    def queryPurchase(): PurchaseCQ = {
        return getConditionQueryPurchase();
    }
    def getConditionQueryPurchase(): PurchaseCQ = {
        val prop = "purchase";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryPurchase()); xsetupOuterJoinPurchase(); }
        return xgetQueRlMap(prop);
    }
    protected def xcreateQueryPurchase(): PurchaseCQ = {
        val nrp = xresolveNRP("PURCHASE_PAYMENT",  "purchase"); val jan = xresolveJAN(nrp,  xgetNNLvl());
        return xinitRelCQ(new PurchaseCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "purchase", nrp);
    }
    protected def xsetupOuterJoinPurchase(): Unit = { xregOutJo("purchase") }
    def hasConditionQueryPurchase(): Boolean = { xhasQueRlMap("purchase") }

    protected def xfindFixedConditionDynamicParameterMap(property: String): Map[String, Object] = {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    def getScalarCondition(): Map[String, PurchasePaymentCQ] = { xgetSQueMap("scalarCondition") }
    def keepScalarCondition(sq: PurchasePaymentCQ): String = { xkeepSQue("scalarCondition", sq) }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    def getSpecifyMyselfDerived(): Map[String, PurchasePaymentCQ] = { xgetSQueMap("specifyMyselfDerived") }
    def keepSpecifyMyselfDerived(sq: PurchasePaymentCQ): String = { xkeepSQue("specifyMyselfDerived", sq) }

    def getQueryMyselfDerived(): Map[String, PurchasePaymentCQ] = { xgetSQueMap("queryMyselfDerived") }
    def keepQueryMyselfDerived(sq: PurchasePaymentCQ): String = { xkeepSQue("queryMyselfDerived", sq) }
    def getQueryMyselfDerivedParameter(): Map[String, Object] = { xgetSQuePmMap("qyeryMyselfDerived") }
    def keepQueryMyselfDerivedParameter(pm: Object): String = { xkeepSQuePm("qyeryMyselfDerived", pm) }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    def getMyselfExists(): Map[String, PurchasePaymentCQ] = { xgetSQueMap("myselfExists") }
    def keepMyselfExists(sq: PurchasePaymentCQ): String = { xkeepSQue("myselfExists", sq) }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    def getMyselfInScope(): Map[String, PurchasePaymentCQ] = { xgetSQueMap("myselfInScope") }
    def keepMyselfInScope(sq: PurchasePaymentCQ): String = { xkeepSQue("myselfInScope", sq) }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected def xCB(): String = { return classOf[PurchasePaymentCB].getName(); }
    protected def xCQ(): String = { return classOf[PurchasePaymentCQ].getName(); }
    protected def xCHp(): String = { return classOf[HpCalculator].getName(); }
    protected def xCOp(): String = { return classOf[ConditionOption].getName(); }
    protected def xMap(): String = { return classOf[Map[_, _]].getName(); }
}
