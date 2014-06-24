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
 * The base condition-query of SUMMARY_WITHDRAWAL.
 * @author DBFlute(AutoGenerator)
 */
class BsSummaryWithdrawalCQ(referrerQuery: ConditionQuery, sqlClause: SqlClause, aliasName: String, nestLevel: Integer) extends AbstractBsSummaryWithdrawalCQ(referrerQuery, sqlClause, aliasName, nestLevel) {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected var _inlineQuery: SummaryWithdrawalCIQ = null;

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from SUMMARY_WITHDRAWAL) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    def inline(): SummaryWithdrawalCIQ = {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected def xcreateCIQ(): SummaryWithdrawalCIQ = {
        val ciq: SummaryWithdrawalCIQ = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected def xnewCIQ(): SummaryWithdrawalCIQ = {
        return new SummaryWithdrawalCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join SUMMARY_WITHDRAWAL on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    def on(): SummaryWithdrawalCIQ = {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        val inlineQuery: SummaryWithdrawalCIQ = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected var _memberId: ConditionValue = null;
    def getMemberId(): ConditionValue =
    { if (_memberId == null) { _memberId = nCV(); }
      return _memberId; }
    protected def getCValueMemberId(): ConditionValue = { return getMemberId(); }

    /** 
     * Add order-by as ascend. <br />
     * MEMBER_ID: {INTEGER(10)}
     * @return this. (NotNull)
     */
    def addOrderBy_MemberId_Asc(): BsSummaryWithdrawalCQ = { regOBA("MEMBER_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * MEMBER_ID: {INTEGER(10)}
     * @return this. (NotNull)
     */
    def addOrderBy_MemberId_Desc(): BsSummaryWithdrawalCQ = { regOBD("MEMBER_ID"); return this; }

    protected var _memberName: ConditionValue = null;
    def getMemberName(): ConditionValue =
    { if (_memberName == null) { _memberName = nCV(); }
      return _memberName; }
    protected def getCValueMemberName(): ConditionValue = { return getMemberName(); }

    /** 
     * Add order-by as ascend. <br />
     * MEMBER_NAME: {VARCHAR(200)}
     * @return this. (NotNull)
     */
    def addOrderBy_MemberName_Asc(): BsSummaryWithdrawalCQ = { regOBA("MEMBER_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * MEMBER_NAME: {VARCHAR(200)}
     * @return this. (NotNull)
     */
    def addOrderBy_MemberName_Desc(): BsSummaryWithdrawalCQ = { regOBD("MEMBER_NAME"); return this; }

    protected var _withdrawalReasonCode: ConditionValue = null;
    def getWithdrawalReasonCode(): ConditionValue =
    { if (_withdrawalReasonCode == null) { _withdrawalReasonCode = nCV(); }
      return _withdrawalReasonCode; }
    protected def getCValueWithdrawalReasonCode(): ConditionValue = { return getWithdrawalReasonCode(); }

    /** 
     * Add order-by as ascend. <br />
     * WITHDRAWAL_REASON_CODE: {CHAR(3)}
     * @return this. (NotNull)
     */
    def addOrderBy_WithdrawalReasonCode_Asc(): BsSummaryWithdrawalCQ = { regOBA("WITHDRAWAL_REASON_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * WITHDRAWAL_REASON_CODE: {CHAR(3)}
     * @return this. (NotNull)
     */
    def addOrderBy_WithdrawalReasonCode_Desc(): BsSummaryWithdrawalCQ = { regOBD("WITHDRAWAL_REASON_CODE"); return this; }

    protected var _withdrawalReasonText: ConditionValue = null;
    def getWithdrawalReasonText(): ConditionValue =
    { if (_withdrawalReasonText == null) { _withdrawalReasonText = nCV(); }
      return _withdrawalReasonText; }
    protected def getCValueWithdrawalReasonText(): ConditionValue = { return getWithdrawalReasonText(); }

    /**
     * Add order-by as descend. <br />
     * WITHDRAWAL_REASON_TEXT: {CLOB(2147483647)}
     * @return this. (NotNull)
     */
    def addOrderBy_WithdrawalReasonText_Desc(): BsSummaryWithdrawalCQ = { regOBD("WITHDRAWAL_REASON_TEXT"); return this; }

    protected var _withdrawalReasonInputText: ConditionValue = null;
    def getWithdrawalReasonInputText(): ConditionValue =
    { if (_withdrawalReasonInputText == null) { _withdrawalReasonInputText = nCV(); }
      return _withdrawalReasonInputText; }
    protected def getCValueWithdrawalReasonInputText(): ConditionValue = { return getWithdrawalReasonInputText(); }

    /**
     * Add order-by as descend. <br />
     * WITHDRAWAL_REASON_INPUT_TEXT: {CLOB(2147483647)}
     * @return this. (NotNull)
     */
    def addOrderBy_WithdrawalReasonInputText_Desc(): BsSummaryWithdrawalCQ = { regOBD("WITHDRAWAL_REASON_INPUT_TEXT"); return this; }

    protected var _withdrawalDatetime: ConditionValue = null;
    def getWithdrawalDatetime(): ConditionValue =
    { if (_withdrawalDatetime == null) { _withdrawalDatetime = nCV(); }
      return _withdrawalDatetime; }
    protected def getCValueWithdrawalDatetime(): ConditionValue = { return getWithdrawalDatetime(); }

    /** 
     * Add order-by as ascend. <br />
     * WITHDRAWAL_DATETIME: {TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    def addOrderBy_WithdrawalDatetime_Asc(): BsSummaryWithdrawalCQ = { regOBA("WITHDRAWAL_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br />
     * WITHDRAWAL_DATETIME: {TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    def addOrderBy_WithdrawalDatetime_Desc(): BsSummaryWithdrawalCQ = { regOBD("WITHDRAWAL_DATETIME"); return this; }

    protected var _memberStatusCode: ConditionValue = null;
    def getMemberStatusCode(): ConditionValue =
    { if (_memberStatusCode == null) { _memberStatusCode = nCV(); }
      return _memberStatusCode; }
    protected def getCValueMemberStatusCode(): ConditionValue = { return getMemberStatusCode(); }

    /** 
     * Add order-by as ascend. <br />
     * MEMBER_STATUS_CODE: {CHAR(3)}
     * @return this. (NotNull)
     */
    def addOrderBy_MemberStatusCode_Asc(): BsSummaryWithdrawalCQ = { regOBA("MEMBER_STATUS_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * MEMBER_STATUS_CODE: {CHAR(3)}
     * @return this. (NotNull)
     */
    def addOrderBy_MemberStatusCode_Desc(): BsSummaryWithdrawalCQ = { regOBD("MEMBER_STATUS_CODE"); return this; }

    protected var _memberStatusName: ConditionValue = null;
    def getMemberStatusName(): ConditionValue =
    { if (_memberStatusName == null) { _memberStatusName = nCV(); }
      return _memberStatusName; }
    protected def getCValueMemberStatusName(): ConditionValue = { return getMemberStatusName(); }

    /** 
     * Add order-by as ascend. <br />
     * MEMBER_STATUS_NAME: {VARCHAR(50)}
     * @return this. (NotNull)
     */
    def addOrderBy_MemberStatusName_Asc(): BsSummaryWithdrawalCQ = { regOBA("MEMBER_STATUS_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * MEMBER_STATUS_NAME: {VARCHAR(50)}
     * @return this. (NotNull)
     */
    def addOrderBy_MemberStatusName_Desc(): BsSummaryWithdrawalCQ = { regOBD("MEMBER_STATUS_NAME"); return this; }

    protected var _maxPurchasePrice: ConditionValue = null;
    def getMaxPurchasePrice(): ConditionValue =
    { if (_maxPurchasePrice == null) { _maxPurchasePrice = nCV(); }
      return _maxPurchasePrice; }
    protected def getCValueMaxPurchasePrice(): ConditionValue = { return getMaxPurchasePrice(); }

    /** 
     * Add order-by as ascend. <br />
     * MAX_PURCHASE_PRICE: {INTEGER(10)}
     * @return this. (NotNull)
     */
    def addOrderBy_MaxPurchasePrice_Asc(): BsSummaryWithdrawalCQ = { regOBA("MAX_PURCHASE_PRICE"); return this; }

    /**
     * Add order-by as descend. <br />
     * MAX_PURCHASE_PRICE: {INTEGER(10)}
     * @return this. (NotNull)
     */
    def addOrderBy_MaxPurchasePrice_Desc(): BsSummaryWithdrawalCQ = { regOBD("MAX_PURCHASE_PRICE"); return this; }

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
    def addSpecifiedDerivedOrderBy_Asc(aliasName: String): BsSummaryWithdrawalCQ = { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    def addSpecifiedDerivedOrderBy_Desc(aliasName: String): BsSummaryWithdrawalCQ = { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    def getScalarCondition(): Map[String, SummaryWithdrawalCQ] = { xgetSQueMap("scalarCondition") }
    def keepScalarCondition(sq: SummaryWithdrawalCQ): String = { xkeepSQue("scalarCondition", sq) }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected def xCB(): String = { return classOf[SummaryWithdrawalCB].getName(); }
    protected def xCQ(): String = { return classOf[SummaryWithdrawalCQ].getName(); }
    protected def xCHp(): String = { return classOf[HpCalculator].getName(); }
    protected def xCOp(): String = { return classOf[ConditionOption].getName(); }
    protected def xMap(): String = { return classOf[Map[_, _]].getName(); }
}
