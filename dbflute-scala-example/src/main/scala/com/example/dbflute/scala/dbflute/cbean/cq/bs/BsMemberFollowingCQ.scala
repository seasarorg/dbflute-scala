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
 * The base condition-query of MEMBER_FOLLOWING.
 * @author DBFlute(AutoGenerator)
 */
class BsMemberFollowingCQ(referrerQuery: ConditionQuery, sqlClause: SqlClause, aliasName: String, nestLevel: Integer) extends AbstractBsMemberFollowingCQ(referrerQuery, sqlClause, aliasName, nestLevel) {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected var _inlineQuery: MemberFollowingCIQ = null;

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from MEMBER_FOLLOWING) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    def inline(): MemberFollowingCIQ = {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected def xcreateCIQ(): MemberFollowingCIQ = {
        val ciq: MemberFollowingCIQ = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected def xnewCIQ(): MemberFollowingCIQ = {
        return new MemberFollowingCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join MEMBER_FOLLOWING on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    def on(): MemberFollowingCIQ = {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        val inlineQuery: MemberFollowingCIQ = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected var _memberFollowingId: ConditionValue = null;
    def getMemberFollowingId(): ConditionValue =
    { if (_memberFollowingId == null) { _memberFollowingId = nCV(); }
      return _memberFollowingId; }
    protected def getCValueMemberFollowingId(): ConditionValue = { return getMemberFollowingId(); }

    /** 
     * Add order-by as ascend. <br />
     * (会員フォローイングID)MEMBER_FOLLOWING_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    def addOrderBy_MemberFollowingId_Asc(): BsMemberFollowingCQ = { regOBA("MEMBER_FOLLOWING_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * (会員フォローイングID)MEMBER_FOLLOWING_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    def addOrderBy_MemberFollowingId_Desc(): BsMemberFollowingCQ = { regOBD("MEMBER_FOLLOWING_ID"); return this; }

    protected var _myMemberId: ConditionValue = null;
    def getMyMemberId(): ConditionValue =
    { if (_myMemberId == null) { _myMemberId = nCV(); }
      return _myMemberId; }
    protected def getCValueMyMemberId(): ConditionValue = { return getMyMemberId(); }

    /** 
     * Add order-by as ascend. <br />
     * (わたし)MY_MEMBER_ID: {UQ+, IX+, NotNull, INTEGER(10), FK to MEMBER}
     * @return this. (NotNull)
     */
    def addOrderBy_MyMemberId_Asc(): BsMemberFollowingCQ = { regOBA("MY_MEMBER_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * (わたし)MY_MEMBER_ID: {UQ+, IX+, NotNull, INTEGER(10), FK to MEMBER}
     * @return this. (NotNull)
     */
    def addOrderBy_MyMemberId_Desc(): BsMemberFollowingCQ = { regOBD("MY_MEMBER_ID"); return this; }

    protected var _yourMemberId: ConditionValue = null;
    def getYourMemberId(): ConditionValue =
    { if (_yourMemberId == null) { _yourMemberId = nCV(); }
      return _yourMemberId; }
    protected def getCValueYourMemberId(): ConditionValue = { return getYourMemberId(); }

    /** 
     * Add order-by as ascend. <br />
     * (あなた)YOUR_MEMBER_ID: {+UQ, IX+, NotNull, INTEGER(10), FK to MEMBER}
     * @return this. (NotNull)
     */
    def addOrderBy_YourMemberId_Asc(): BsMemberFollowingCQ = { regOBA("YOUR_MEMBER_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * (あなた)YOUR_MEMBER_ID: {+UQ, IX+, NotNull, INTEGER(10), FK to MEMBER}
     * @return this. (NotNull)
     */
    def addOrderBy_YourMemberId_Desc(): BsMemberFollowingCQ = { regOBD("YOUR_MEMBER_ID"); return this; }

    protected var _followDatetime: ConditionValue = null;
    def getFollowDatetime(): ConditionValue =
    { if (_followDatetime == null) { _followDatetime = nCV(); }
      return _followDatetime; }
    protected def getCValueFollowDatetime(): ConditionValue = { return getFollowDatetime(); }

    /** 
     * Add order-by as ascend. <br />
     * (その瞬間)FOLLOW_DATETIME: {IX, NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    def addOrderBy_FollowDatetime_Asc(): BsMemberFollowingCQ = { regOBA("FOLLOW_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br />
     * (その瞬間)FOLLOW_DATETIME: {IX, NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    def addOrderBy_FollowDatetime_Desc(): BsMemberFollowingCQ = { regOBD("FOLLOW_DATETIME"); return this; }

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
    def addSpecifiedDerivedOrderBy_Asc(aliasName: String): BsMemberFollowingCQ = { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    def addSpecifiedDerivedOrderBy_Desc(aliasName: String): BsMemberFollowingCQ = { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    def reflectRelationOnUnionQuery(bqs: ConditionQuery, uqs: ConditionQuery): Unit = {
        val bq: MemberFollowingCQ = bqs.asInstanceOf[MemberFollowingCQ];
        val uq: MemberFollowingCQ = uqs.asInstanceOf[MemberFollowingCQ];
        if (bq.hasConditionQueryMemberByMyMemberId()) {
            uq.queryMemberByMyMemberId().reflectRelationOnUnionQuery(bq.queryMemberByMyMemberId(), uq.queryMemberByMyMemberId());
        }
        if (bq.hasConditionQueryMemberByYourMemberId()) {
            uq.queryMemberByYourMemberId().reflectRelationOnUnionQuery(bq.queryMemberByYourMemberId(), uq.queryMemberByYourMemberId());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * (会員)MEMBER by my MY_MEMBER_ID, named 'memberByMyMemberId'.
     * @return The instance of condition-query. (NotNull)
     */
    def queryMemberByMyMemberId(): MemberCQ = {
        return getConditionQueryMemberByMyMemberId();
    }
    def getConditionQueryMemberByMyMemberId(): MemberCQ = {
        val prop = "memberByMyMemberId";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMemberByMyMemberId()); xsetupOuterJoinMemberByMyMemberId(); }
        return xgetQueRlMap(prop);
    }
    protected def xcreateQueryMemberByMyMemberId(): MemberCQ = {
        val nrp = xresolveNRP("MEMBER_FOLLOWING",  "memberByMyMemberId"); val jan = xresolveJAN(nrp,  xgetNNLvl());
        return xinitRelCQ(new MemberCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "memberByMyMemberId", nrp);
    }
    protected def xsetupOuterJoinMemberByMyMemberId(): Unit = { xregOutJo("memberByMyMemberId") }
    def hasConditionQueryMemberByMyMemberId(): Boolean = { xhasQueRlMap("memberByMyMemberId") }

    /**
     * Get the condition-query for relation table. <br />
     * (会員)MEMBER by my YOUR_MEMBER_ID, named 'memberByYourMemberId'.
     * @return The instance of condition-query. (NotNull)
     */
    def queryMemberByYourMemberId(): MemberCQ = {
        return getConditionQueryMemberByYourMemberId();
    }
    def getConditionQueryMemberByYourMemberId(): MemberCQ = {
        val prop = "memberByYourMemberId";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMemberByYourMemberId()); xsetupOuterJoinMemberByYourMemberId(); }
        return xgetQueRlMap(prop);
    }
    protected def xcreateQueryMemberByYourMemberId(): MemberCQ = {
        val nrp = xresolveNRP("MEMBER_FOLLOWING",  "memberByYourMemberId"); val jan = xresolveJAN(nrp,  xgetNNLvl());
        return xinitRelCQ(new MemberCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "memberByYourMemberId", nrp);
    }
    protected def xsetupOuterJoinMemberByYourMemberId(): Unit = { xregOutJo("memberByYourMemberId") }
    def hasConditionQueryMemberByYourMemberId(): Boolean = { xhasQueRlMap("memberByYourMemberId") }

    protected def xfindFixedConditionDynamicParameterMap(property: String): Map[String, Object] = {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    def getScalarCondition(): Map[String, MemberFollowingCQ] = { xgetSQueMap("scalarCondition") }
    def keepScalarCondition(sq: MemberFollowingCQ): String = { xkeepSQue("scalarCondition", sq) }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    def getSpecifyMyselfDerived(): Map[String, MemberFollowingCQ] = { xgetSQueMap("specifyMyselfDerived") }
    def keepSpecifyMyselfDerived(sq: MemberFollowingCQ): String = { xkeepSQue("specifyMyselfDerived", sq) }

    def getQueryMyselfDerived(): Map[String, MemberFollowingCQ] = { xgetSQueMap("queryMyselfDerived") }
    def keepQueryMyselfDerived(sq: MemberFollowingCQ): String = { xkeepSQue("queryMyselfDerived", sq) }
    def getQueryMyselfDerivedParameter(): Map[String, Object] = { xgetSQuePmMap("qyeryMyselfDerived") }
    def keepQueryMyselfDerivedParameter(pm: Object): String = { xkeepSQuePm("qyeryMyselfDerived", pm) }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    def getMyselfExists(): Map[String, MemberFollowingCQ] = { xgetSQueMap("myselfExists") }
    def keepMyselfExists(sq: MemberFollowingCQ): String = { xkeepSQue("myselfExists", sq) }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    def getMyselfInScope(): Map[String, MemberFollowingCQ] = { xgetSQueMap("myselfInScope") }
    def keepMyselfInScope(sq: MemberFollowingCQ): String = { xkeepSQue("myselfInScope", sq) }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected def xCB(): String = { return classOf[MemberFollowingCB].getName(); }
    protected def xCQ(): String = { return classOf[MemberFollowingCQ].getName(); }
    protected def xCHp(): String = { return classOf[HpCalculator].getName(); }
    protected def xCOp(): String = { return classOf[ConditionOption].getName(); }
    protected def xMap(): String = { return classOf[Map[_, _]].getName(); }
}
