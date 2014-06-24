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
 * The base condition-query of MEMBER_STATUS.
 * @author DBFlute(AutoGenerator)
 */
class BsMemberStatusCQ(referrerQuery: ConditionQuery, sqlClause: SqlClause, aliasName: String, nestLevel: Integer) extends AbstractBsMemberStatusCQ(referrerQuery, sqlClause, aliasName, nestLevel) {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected var _inlineQuery: MemberStatusCIQ = null;

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from MEMBER_STATUS) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    def inline(): MemberStatusCIQ = {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected def xcreateCIQ(): MemberStatusCIQ = {
        val ciq: MemberStatusCIQ = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected def xnewCIQ(): MemberStatusCIQ = {
        return new MemberStatusCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join MEMBER_STATUS on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    def on(): MemberStatusCIQ = {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        val inlineQuery: MemberStatusCIQ = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected var _memberStatusCode: ConditionValue = null;
    def getMemberStatusCode(): ConditionValue =
    { if (_memberStatusCode == null) { _memberStatusCode = nCV(); }
      return _memberStatusCode; }
    protected def getCValueMemberStatusCode(): ConditionValue = { return getMemberStatusCode(); }

    def getMemberStatusCode_ExistsReferrer_MemberList(): Map[String, MemberCQ] = { xgetSQueMap("memberStatusCode_ExistsReferrer_MemberList") }
    def keepMemberStatusCode_ExistsReferrer_MemberList(sq: MemberCQ): String = { xkeepSQue("memberStatusCode_ExistsReferrer_MemberList", sq) }

    def getMemberStatusCode_ExistsReferrer_MemberLoginList(): Map[String, MemberLoginCQ] = { xgetSQueMap("memberStatusCode_ExistsReferrer_MemberLoginList") }
    def keepMemberStatusCode_ExistsReferrer_MemberLoginList(sq: MemberLoginCQ): String = { xkeepSQue("memberStatusCode_ExistsReferrer_MemberLoginList", sq) }

    def getMemberStatusCode_NotExistsReferrer_MemberList(): Map[String, MemberCQ] = { xgetSQueMap("memberStatusCode_NotExistsReferrer_MemberList") }
    def keepMemberStatusCode_NotExistsReferrer_MemberList(sq: MemberCQ): String = { xkeepSQue("memberStatusCode_NotExistsReferrer_MemberList", sq) }

    def getMemberStatusCode_NotExistsReferrer_MemberLoginList(): Map[String, MemberLoginCQ] = { xgetSQueMap("memberStatusCode_NotExistsReferrer_MemberLoginList") }
    def keepMemberStatusCode_NotExistsReferrer_MemberLoginList(sq: MemberLoginCQ): String = { xkeepSQue("memberStatusCode_NotExistsReferrer_MemberLoginList", sq) }

    def getMemberStatusCode_InScopeRelation_MemberList(): Map[String, MemberCQ] = { xgetSQueMap("memberStatusCode_InScopeRelation_MemberList") }
    def keepMemberStatusCode_InScopeRelation_MemberList(sq: MemberCQ): String = { xkeepSQue("memberStatusCode_InScopeRelation_MemberList", sq) }

    def getMemberStatusCode_InScopeRelation_MemberLoginList(): Map[String, MemberLoginCQ] = { xgetSQueMap("memberStatusCode_InScopeRelation_MemberLoginList") }
    def keepMemberStatusCode_InScopeRelation_MemberLoginList(sq: MemberLoginCQ): String = { xkeepSQue("memberStatusCode_InScopeRelation_MemberLoginList", sq) }

    def getMemberStatusCode_NotInScopeRelation_MemberList(): Map[String, MemberCQ] = { xgetSQueMap("memberStatusCode_NotInScopeRelation_MemberList") }
    def keepMemberStatusCode_NotInScopeRelation_MemberList(sq: MemberCQ): String = { xkeepSQue("memberStatusCode_NotInScopeRelation_MemberList", sq) }

    def getMemberStatusCode_NotInScopeRelation_MemberLoginList(): Map[String, MemberLoginCQ] = { xgetSQueMap("memberStatusCode_NotInScopeRelation_MemberLoginList") }
    def keepMemberStatusCode_NotInScopeRelation_MemberLoginList(sq: MemberLoginCQ): String = { xkeepSQue("memberStatusCode_NotInScopeRelation_MemberLoginList", sq) }

    def getMemberStatusCode_SpecifyDerivedReferrer_MemberList(): Map[String, MemberCQ] = { xgetSQueMap("memberStatusCode_SpecifyDerivedReferrer_MemberList") }
    def keepMemberStatusCode_SpecifyDerivedReferrer_MemberList(sq: MemberCQ): String = { xkeepSQue("memberStatusCode_SpecifyDerivedReferrer_MemberList", sq) }

    def getMemberStatusCode_SpecifyDerivedReferrer_MemberLoginList(): Map[String, MemberLoginCQ] = { xgetSQueMap("memberStatusCode_SpecifyDerivedReferrer_MemberLoginList") }
    def keepMemberStatusCode_SpecifyDerivedReferrer_MemberLoginList(sq: MemberLoginCQ): String = { xkeepSQue("memberStatusCode_SpecifyDerivedReferrer_MemberLoginList", sq) }

    def getMemberStatusCode_QueryDerivedReferrer_MemberList(): Map[String, MemberCQ] = { xgetSQueMap("memberStatusCode_QueryDerivedReferrer_MemberList") }
    def keepMemberStatusCode_QueryDerivedReferrer_MemberList(sq: MemberCQ): String = { xkeepSQue("memberStatusCode_QueryDerivedReferrer_MemberList", sq) }
    def getMemberStatusCode_QueryDerivedReferrer_MemberListParameter(): Map[String, Object] = { xgetSQuePmMap("memberStatusCode_QueryDerivedReferrer_MemberList") }
    def keepMemberStatusCode_QueryDerivedReferrer_MemberListParameter(pm: Object): String = { xkeepSQuePm("memberStatusCode_QueryDerivedReferrer_MemberList", pm) }

    def getMemberStatusCode_QueryDerivedReferrer_MemberLoginList(): Map[String, MemberLoginCQ] = { xgetSQueMap("memberStatusCode_QueryDerivedReferrer_MemberLoginList") }
    def keepMemberStatusCode_QueryDerivedReferrer_MemberLoginList(sq: MemberLoginCQ): String = { xkeepSQue("memberStatusCode_QueryDerivedReferrer_MemberLoginList", sq) }
    def getMemberStatusCode_QueryDerivedReferrer_MemberLoginListParameter(): Map[String, Object] = { xgetSQuePmMap("memberStatusCode_QueryDerivedReferrer_MemberLoginList") }
    def keepMemberStatusCode_QueryDerivedReferrer_MemberLoginListParameter(pm: Object): String = { xkeepSQuePm("memberStatusCode_QueryDerivedReferrer_MemberLoginList", pm) }

    /** 
     * Add order-by as ascend. <br />
     * (会員ステータスコード)MEMBER_STATUS_CODE: {PK, NotNull, CHAR(3), classification=MemberStatus}
     * @return this. (NotNull)
     */
    def addOrderBy_MemberStatusCode_Asc(): BsMemberStatusCQ = { regOBA("MEMBER_STATUS_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * (会員ステータスコード)MEMBER_STATUS_CODE: {PK, NotNull, CHAR(3), classification=MemberStatus}
     * @return this. (NotNull)
     */
    def addOrderBy_MemberStatusCode_Desc(): BsMemberStatusCQ = { regOBD("MEMBER_STATUS_CODE"); return this; }

    protected var _memberStatusName: ConditionValue = null;
    def getMemberStatusName(): ConditionValue =
    { if (_memberStatusName == null) { _memberStatusName = nCV(); }
      return _memberStatusName; }
    protected def getCValueMemberStatusName(): ConditionValue = { return getMemberStatusName(); }

    /** 
     * Add order-by as ascend. <br />
     * (会員ステータス名称)MEMBER_STATUS_NAME: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    def addOrderBy_MemberStatusName_Asc(): BsMemberStatusCQ = { regOBA("MEMBER_STATUS_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * (会員ステータス名称)MEMBER_STATUS_NAME: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    def addOrderBy_MemberStatusName_Desc(): BsMemberStatusCQ = { regOBD("MEMBER_STATUS_NAME"); return this; }

    protected var _description: ConditionValue = null;
    def getDescription(): ConditionValue =
    { if (_description == null) { _description = nCV(); }
      return _description; }
    protected def getCValueDescription(): ConditionValue = { return getDescription(); }

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
    def addOrderBy_DisplayOrder_Asc(): BsMemberStatusCQ = { regOBA("DISPLAY_ORDER"); return this; }

    /**
     * Add order-by as descend. <br />
     * (表示順)DISPLAY_ORDER: {UQ, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    def addOrderBy_DisplayOrder_Desc(): BsMemberStatusCQ = { regOBD("DISPLAY_ORDER"); return this; }

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
    def addSpecifiedDerivedOrderBy_Asc(aliasName: String): BsMemberStatusCQ = { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    def addSpecifiedDerivedOrderBy_Desc(aliasName: String): BsMemberStatusCQ = { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    def getScalarCondition(): Map[String, MemberStatusCQ] = { xgetSQueMap("scalarCondition") }
    def keepScalarCondition(sq: MemberStatusCQ): String = { xkeepSQue("scalarCondition", sq) }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    def getSpecifyMyselfDerived(): Map[String, MemberStatusCQ] = { xgetSQueMap("specifyMyselfDerived") }
    def keepSpecifyMyselfDerived(sq: MemberStatusCQ): String = { xkeepSQue("specifyMyselfDerived", sq) }

    def getQueryMyselfDerived(): Map[String, MemberStatusCQ] = { xgetSQueMap("queryMyselfDerived") }
    def keepQueryMyselfDerived(sq: MemberStatusCQ): String = { xkeepSQue("queryMyselfDerived", sq) }
    def getQueryMyselfDerivedParameter(): Map[String, Object] = { xgetSQuePmMap("qyeryMyselfDerived") }
    def keepQueryMyselfDerivedParameter(pm: Object): String = { xkeepSQuePm("qyeryMyselfDerived", pm) }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    def getMyselfExists(): Map[String, MemberStatusCQ] = { xgetSQueMap("myselfExists") }
    def keepMyselfExists(sq: MemberStatusCQ): String = { xkeepSQue("myselfExists", sq) }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    def getMyselfInScope(): Map[String, MemberStatusCQ] = { xgetSQueMap("myselfInScope") }
    def keepMyselfInScope(sq: MemberStatusCQ): String = { xkeepSQue("myselfInScope", sq) }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected def xCB(): String = { return classOf[MemberStatusCB].getName(); }
    protected def xCQ(): String = { return classOf[MemberStatusCQ].getName(); }
    protected def xCHp(): String = { return classOf[HpCalculator].getName(); }
    protected def xCOp(): String = { return classOf[ConditionOption].getName(); }
    protected def xMap(): String = { return classOf[Map[_, _]].getName(); }
}
