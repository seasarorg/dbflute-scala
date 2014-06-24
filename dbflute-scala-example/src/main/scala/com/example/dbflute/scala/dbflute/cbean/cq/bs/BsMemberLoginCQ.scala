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
 * The base condition-query of MEMBER_LOGIN.
 * @author DBFlute(AutoGenerator)
 */
class BsMemberLoginCQ(referrerQuery: ConditionQuery, sqlClause: SqlClause, aliasName: String, nestLevel: Integer) extends AbstractBsMemberLoginCQ(referrerQuery, sqlClause, aliasName, nestLevel) {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected var _inlineQuery: MemberLoginCIQ = null;

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from MEMBER_LOGIN) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    def inline(): MemberLoginCIQ = {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected def xcreateCIQ(): MemberLoginCIQ = {
        val ciq: MemberLoginCIQ = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected def xnewCIQ(): MemberLoginCIQ = {
        return new MemberLoginCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join MEMBER_LOGIN on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    def on(): MemberLoginCIQ = {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        val inlineQuery: MemberLoginCIQ = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected var _memberLoginId: ConditionValue = null;
    def getMemberLoginId(): ConditionValue =
    { if (_memberLoginId == null) { _memberLoginId = nCV(); }
      return _memberLoginId; }
    protected def getCValueMemberLoginId(): ConditionValue = { return getMemberLoginId(); }

    /** 
     * Add order-by as ascend. <br />
     * (会員ログインID)MEMBER_LOGIN_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    def addOrderBy_MemberLoginId_Asc(): BsMemberLoginCQ = { regOBA("MEMBER_LOGIN_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * (会員ログインID)MEMBER_LOGIN_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    def addOrderBy_MemberLoginId_Desc(): BsMemberLoginCQ = { regOBD("MEMBER_LOGIN_ID"); return this; }

    protected var _memberId: ConditionValue = null;
    def getMemberId(): ConditionValue =
    { if (_memberId == null) { _memberId = nCV(); }
      return _memberId; }
    protected def getCValueMemberId(): ConditionValue = { return getMemberId(); }

    /** 
     * Add order-by as ascend. <br />
     * (会員ID)MEMBER_ID: {UQ+, IX, NotNull, INTEGER(10), FK to MEMBER}
     * @return this. (NotNull)
     */
    def addOrderBy_MemberId_Asc(): BsMemberLoginCQ = { regOBA("MEMBER_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * (会員ID)MEMBER_ID: {UQ+, IX, NotNull, INTEGER(10), FK to MEMBER}
     * @return this. (NotNull)
     */
    def addOrderBy_MemberId_Desc(): BsMemberLoginCQ = { regOBD("MEMBER_ID"); return this; }

    protected var _loginDatetime: ConditionValue = null;
    def getLoginDatetime(): ConditionValue =
    { if (_loginDatetime == null) { _loginDatetime = nCV(); }
      return _loginDatetime; }
    protected def getCValueLoginDatetime(): ConditionValue = { return getLoginDatetime(); }

    /** 
     * Add order-by as ascend. <br />
     * (ログイン日時)LOGIN_DATETIME: {+UQ, IX, NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    def addOrderBy_LoginDatetime_Asc(): BsMemberLoginCQ = { regOBA("LOGIN_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br />
     * (ログイン日時)LOGIN_DATETIME: {+UQ, IX, NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    def addOrderBy_LoginDatetime_Desc(): BsMemberLoginCQ = { regOBD("LOGIN_DATETIME"); return this; }

    protected var _mobileLoginFlg: ConditionValue = null;
    def getMobileLoginFlg(): ConditionValue =
    { if (_mobileLoginFlg == null) { _mobileLoginFlg = nCV(); }
      return _mobileLoginFlg; }
    protected def getCValueMobileLoginFlg(): ConditionValue = { return getMobileLoginFlg(); }

    /** 
     * Add order-by as ascend. <br />
     * (モバイルログインフラグ)MOBILE_LOGIN_FLG: {NotNull, INTEGER(10), classification=Flg}
     * @return this. (NotNull)
     */
    def addOrderBy_MobileLoginFlg_Asc(): BsMemberLoginCQ = { regOBA("MOBILE_LOGIN_FLG"); return this; }

    /**
     * Add order-by as descend. <br />
     * (モバイルログインフラグ)MOBILE_LOGIN_FLG: {NotNull, INTEGER(10), classification=Flg}
     * @return this. (NotNull)
     */
    def addOrderBy_MobileLoginFlg_Desc(): BsMemberLoginCQ = { regOBD("MOBILE_LOGIN_FLG"); return this; }

    protected var _loginMemberStatusCode: ConditionValue = null;
    def getLoginMemberStatusCode(): ConditionValue =
    { if (_loginMemberStatusCode == null) { _loginMemberStatusCode = nCV(); }
      return _loginMemberStatusCode; }
    protected def getCValueLoginMemberStatusCode(): ConditionValue = { return getLoginMemberStatusCode(); }

    /** 
     * Add order-by as ascend. <br />
     * (ログイン時会員ステータスコード)LOGIN_MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus}
     * @return this. (NotNull)
     */
    def addOrderBy_LoginMemberStatusCode_Asc(): BsMemberLoginCQ = { regOBA("LOGIN_MEMBER_STATUS_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * (ログイン時会員ステータスコード)LOGIN_MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus}
     * @return this. (NotNull)
     */
    def addOrderBy_LoginMemberStatusCode_Desc(): BsMemberLoginCQ = { regOBD("LOGIN_MEMBER_STATUS_CODE"); return this; }

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
    def addSpecifiedDerivedOrderBy_Asc(aliasName: String): BsMemberLoginCQ = { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    def addSpecifiedDerivedOrderBy_Desc(aliasName: String): BsMemberLoginCQ = { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    def reflectRelationOnUnionQuery(bqs: ConditionQuery, uqs: ConditionQuery): Unit = {
        val bq: MemberLoginCQ = bqs.asInstanceOf[MemberLoginCQ];
        val uq: MemberLoginCQ = uqs.asInstanceOf[MemberLoginCQ];
        if (bq.hasConditionQueryMemberStatus()) {
            uq.queryMemberStatus().reflectRelationOnUnionQuery(bq.queryMemberStatus(), uq.queryMemberStatus());
        }
        if (bq.hasConditionQueryMember()) {
            uq.queryMember().reflectRelationOnUnionQuery(bq.queryMember(), uq.queryMember());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * (会員ステータス)MEMBER_STATUS by my LOGIN_MEMBER_STATUS_CODE, named 'memberStatus'.
     * @return The instance of condition-query. (NotNull)
     */
    def queryMemberStatus(): MemberStatusCQ = {
        return getConditionQueryMemberStatus();
    }
    def getConditionQueryMemberStatus(): MemberStatusCQ = {
        val prop = "memberStatus";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMemberStatus()); xsetupOuterJoinMemberStatus(); }
        return xgetQueRlMap(prop);
    }
    protected def xcreateQueryMemberStatus(): MemberStatusCQ = {
        val nrp = xresolveNRP("MEMBER_LOGIN",  "memberStatus"); val jan = xresolveJAN(nrp,  xgetNNLvl());
        return xinitRelCQ(new MemberStatusCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "memberStatus", nrp);
    }
    protected def xsetupOuterJoinMemberStatus(): Unit = { xregOutJo("memberStatus") }
    def hasConditionQueryMemberStatus(): Boolean = { xhasQueRlMap("memberStatus") }

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
        val nrp = xresolveNRP("MEMBER_LOGIN",  "member"); val jan = xresolveJAN(nrp,  xgetNNLvl());
        return xinitRelCQ(new MemberCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "member", nrp);
    }
    protected def xsetupOuterJoinMember(): Unit = { xregOutJo("member") }
    def hasConditionQueryMember(): Boolean = { xhasQueRlMap("member") }

    protected def xfindFixedConditionDynamicParameterMap(property: String): Map[String, Object] = {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    def getScalarCondition(): Map[String, MemberLoginCQ] = { xgetSQueMap("scalarCondition") }
    def keepScalarCondition(sq: MemberLoginCQ): String = { xkeepSQue("scalarCondition", sq) }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    def getSpecifyMyselfDerived(): Map[String, MemberLoginCQ] = { xgetSQueMap("specifyMyselfDerived") }
    def keepSpecifyMyselfDerived(sq: MemberLoginCQ): String = { xkeepSQue("specifyMyselfDerived", sq) }

    def getQueryMyselfDerived(): Map[String, MemberLoginCQ] = { xgetSQueMap("queryMyselfDerived") }
    def keepQueryMyselfDerived(sq: MemberLoginCQ): String = { xkeepSQue("queryMyselfDerived", sq) }
    def getQueryMyselfDerivedParameter(): Map[String, Object] = { xgetSQuePmMap("qyeryMyselfDerived") }
    def keepQueryMyselfDerivedParameter(pm: Object): String = { xkeepSQuePm("qyeryMyselfDerived", pm) }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    def getMyselfExists(): Map[String, MemberLoginCQ] = { xgetSQueMap("myselfExists") }
    def keepMyselfExists(sq: MemberLoginCQ): String = { xkeepSQue("myselfExists", sq) }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    def getMyselfInScope(): Map[String, MemberLoginCQ] = { xgetSQueMap("myselfInScope") }
    def keepMyselfInScope(sq: MemberLoginCQ): String = { xkeepSQue("myselfInScope", sq) }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected def xCB(): String = { return classOf[MemberLoginCB].getName(); }
    protected def xCQ(): String = { return classOf[MemberLoginCQ].getName(); }
    protected def xCHp(): String = { return classOf[HpCalculator].getName(); }
    protected def xCOp(): String = { return classOf[ConditionOption].getName(); }
    protected def xMap(): String = { return classOf[Map[_, _]].getName(); }
}
