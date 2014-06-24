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
 * The base condition-query of WITHDRAWAL_REASON.
 * @author DBFlute(AutoGenerator)
 */
class BsWithdrawalReasonCQ(referrerQuery: ConditionQuery, sqlClause: SqlClause, aliasName: String, nestLevel: Integer) extends AbstractBsWithdrawalReasonCQ(referrerQuery, sqlClause, aliasName, nestLevel) {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected var _inlineQuery: WithdrawalReasonCIQ = null;

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from WITHDRAWAL_REASON) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    def inline(): WithdrawalReasonCIQ = {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected def xcreateCIQ(): WithdrawalReasonCIQ = {
        val ciq: WithdrawalReasonCIQ = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected def xnewCIQ(): WithdrawalReasonCIQ = {
        return new WithdrawalReasonCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join WITHDRAWAL_REASON on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    def on(): WithdrawalReasonCIQ = {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        val inlineQuery: WithdrawalReasonCIQ = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected var _withdrawalReasonCode: ConditionValue = null;
    def getWithdrawalReasonCode(): ConditionValue =
    { if (_withdrawalReasonCode == null) { _withdrawalReasonCode = nCV(); }
      return _withdrawalReasonCode; }
    protected def getCValueWithdrawalReasonCode(): ConditionValue = { return getWithdrawalReasonCode(); }

    def getWithdrawalReasonCode_ExistsReferrer_MemberWithdrawalList(): Map[String, MemberWithdrawalCQ] = { xgetSQueMap("withdrawalReasonCode_ExistsReferrer_MemberWithdrawalList") }
    def keepWithdrawalReasonCode_ExistsReferrer_MemberWithdrawalList(sq: MemberWithdrawalCQ): String = { xkeepSQue("withdrawalReasonCode_ExistsReferrer_MemberWithdrawalList", sq) }

    def getWithdrawalReasonCode_NotExistsReferrer_MemberWithdrawalList(): Map[String, MemberWithdrawalCQ] = { xgetSQueMap("withdrawalReasonCode_NotExistsReferrer_MemberWithdrawalList") }
    def keepWithdrawalReasonCode_NotExistsReferrer_MemberWithdrawalList(sq: MemberWithdrawalCQ): String = { xkeepSQue("withdrawalReasonCode_NotExistsReferrer_MemberWithdrawalList", sq) }

    def getWithdrawalReasonCode_InScopeRelation_MemberWithdrawalList(): Map[String, MemberWithdrawalCQ] = { xgetSQueMap("withdrawalReasonCode_InScopeRelation_MemberWithdrawalList") }
    def keepWithdrawalReasonCode_InScopeRelation_MemberWithdrawalList(sq: MemberWithdrawalCQ): String = { xkeepSQue("withdrawalReasonCode_InScopeRelation_MemberWithdrawalList", sq) }

    def getWithdrawalReasonCode_NotInScopeRelation_MemberWithdrawalList(): Map[String, MemberWithdrawalCQ] = { xgetSQueMap("withdrawalReasonCode_NotInScopeRelation_MemberWithdrawalList") }
    def keepWithdrawalReasonCode_NotInScopeRelation_MemberWithdrawalList(sq: MemberWithdrawalCQ): String = { xkeepSQue("withdrawalReasonCode_NotInScopeRelation_MemberWithdrawalList", sq) }

    def getWithdrawalReasonCode_SpecifyDerivedReferrer_MemberWithdrawalList(): Map[String, MemberWithdrawalCQ] = { xgetSQueMap("withdrawalReasonCode_SpecifyDerivedReferrer_MemberWithdrawalList") }
    def keepWithdrawalReasonCode_SpecifyDerivedReferrer_MemberWithdrawalList(sq: MemberWithdrawalCQ): String = { xkeepSQue("withdrawalReasonCode_SpecifyDerivedReferrer_MemberWithdrawalList", sq) }

    def getWithdrawalReasonCode_QueryDerivedReferrer_MemberWithdrawalList(): Map[String, MemberWithdrawalCQ] = { xgetSQueMap("withdrawalReasonCode_QueryDerivedReferrer_MemberWithdrawalList") }
    def keepWithdrawalReasonCode_QueryDerivedReferrer_MemberWithdrawalList(sq: MemberWithdrawalCQ): String = { xkeepSQue("withdrawalReasonCode_QueryDerivedReferrer_MemberWithdrawalList", sq) }
    def getWithdrawalReasonCode_QueryDerivedReferrer_MemberWithdrawalListParameter(): Map[String, Object] = { xgetSQuePmMap("withdrawalReasonCode_QueryDerivedReferrer_MemberWithdrawalList") }
    def keepWithdrawalReasonCode_QueryDerivedReferrer_MemberWithdrawalListParameter(pm: Object): String = { xkeepSQuePm("withdrawalReasonCode_QueryDerivedReferrer_MemberWithdrawalList", pm) }

    /** 
     * Add order-by as ascend. <br />
     * (退会理由コード)WITHDRAWAL_REASON_CODE: {PK, NotNull, CHAR(3), classification=WithdrawalReason}
     * @return this. (NotNull)
     */
    def addOrderBy_WithdrawalReasonCode_Asc(): BsWithdrawalReasonCQ = { regOBA("WITHDRAWAL_REASON_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * (退会理由コード)WITHDRAWAL_REASON_CODE: {PK, NotNull, CHAR(3), classification=WithdrawalReason}
     * @return this. (NotNull)
     */
    def addOrderBy_WithdrawalReasonCode_Desc(): BsWithdrawalReasonCQ = { regOBD("WITHDRAWAL_REASON_CODE"); return this; }

    protected var _withdrawalReasonText: ConditionValue = null;
    def getWithdrawalReasonText(): ConditionValue =
    { if (_withdrawalReasonText == null) { _withdrawalReasonText = nCV(); }
      return _withdrawalReasonText; }
    protected def getCValueWithdrawalReasonText(): ConditionValue = { return getWithdrawalReasonText(); }

    /**
     * Add order-by as descend. <br />
     * (退会理由テキスト)WITHDRAWAL_REASON_TEXT: {NotNull, CLOB(2147483647)}
     * @return this. (NotNull)
     */
    def addOrderBy_WithdrawalReasonText_Desc(): BsWithdrawalReasonCQ = { regOBD("WITHDRAWAL_REASON_TEXT"); return this; }

    protected var _displayOrder: ConditionValue = null;
    def getDisplayOrder(): ConditionValue =
    { if (_displayOrder == null) { _displayOrder = nCV(); }
      return _displayOrder; }
    protected def getCValueDisplayOrder(): ConditionValue = { return getDisplayOrder(); }

    /** 
     * Add order-by as ascend. <br />
     * DISPLAY_ORDER: {UQ, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    def addOrderBy_DisplayOrder_Asc(): BsWithdrawalReasonCQ = { regOBA("DISPLAY_ORDER"); return this; }

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
    def addSpecifiedDerivedOrderBy_Asc(aliasName: String): BsWithdrawalReasonCQ = { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    def addSpecifiedDerivedOrderBy_Desc(aliasName: String): BsWithdrawalReasonCQ = { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    def getScalarCondition(): Map[String, WithdrawalReasonCQ] = { xgetSQueMap("scalarCondition") }
    def keepScalarCondition(sq: WithdrawalReasonCQ): String = { xkeepSQue("scalarCondition", sq) }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    def getSpecifyMyselfDerived(): Map[String, WithdrawalReasonCQ] = { xgetSQueMap("specifyMyselfDerived") }
    def keepSpecifyMyselfDerived(sq: WithdrawalReasonCQ): String = { xkeepSQue("specifyMyselfDerived", sq) }

    def getQueryMyselfDerived(): Map[String, WithdrawalReasonCQ] = { xgetSQueMap("queryMyselfDerived") }
    def keepQueryMyselfDerived(sq: WithdrawalReasonCQ): String = { xkeepSQue("queryMyselfDerived", sq) }
    def getQueryMyselfDerivedParameter(): Map[String, Object] = { xgetSQuePmMap("qyeryMyselfDerived") }
    def keepQueryMyselfDerivedParameter(pm: Object): String = { xkeepSQuePm("qyeryMyselfDerived", pm) }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    def getMyselfExists(): Map[String, WithdrawalReasonCQ] = { xgetSQueMap("myselfExists") }
    def keepMyselfExists(sq: WithdrawalReasonCQ): String = { xkeepSQue("myselfExists", sq) }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    def getMyselfInScope(): Map[String, WithdrawalReasonCQ] = { xgetSQueMap("myselfInScope") }
    def keepMyselfInScope(sq: WithdrawalReasonCQ): String = { xkeepSQue("myselfInScope", sq) }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected def xCB(): String = { return classOf[WithdrawalReasonCB].getName(); }
    protected def xCQ(): String = { return classOf[WithdrawalReasonCQ].getName(); }
    protected def xCHp(): String = { return classOf[HpCalculator].getName(); }
    protected def xCOp(): String = { return classOf[ConditionOption].getName(); }
    protected def xMap(): String = { return classOf[Map[_, _]].getName(); }
}
