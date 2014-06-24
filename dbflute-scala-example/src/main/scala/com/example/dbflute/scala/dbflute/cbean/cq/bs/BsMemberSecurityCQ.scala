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
 * The base condition-query of MEMBER_SECURITY.
 * @author DBFlute(AutoGenerator)
 */
class BsMemberSecurityCQ(referrerQuery: ConditionQuery, sqlClause: SqlClause, aliasName: String, nestLevel: Integer) extends AbstractBsMemberSecurityCQ(referrerQuery, sqlClause, aliasName, nestLevel) {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected var _inlineQuery: MemberSecurityCIQ = null;

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from MEMBER_SECURITY) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    def inline(): MemberSecurityCIQ = {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected def xcreateCIQ(): MemberSecurityCIQ = {
        val ciq: MemberSecurityCIQ = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected def xnewCIQ(): MemberSecurityCIQ = {
        return new MemberSecurityCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join MEMBER_SECURITY on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    def on(): MemberSecurityCIQ = {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        val inlineQuery: MemberSecurityCIQ = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
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
     * (会員ID)MEMBER_ID: {PK, NotNull, INTEGER(10), FK to MEMBER}
     * @return this. (NotNull)
     */
    def addOrderBy_MemberId_Asc(): BsMemberSecurityCQ = { regOBA("MEMBER_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * (会員ID)MEMBER_ID: {PK, NotNull, INTEGER(10), FK to MEMBER}
     * @return this. (NotNull)
     */
    def addOrderBy_MemberId_Desc(): BsMemberSecurityCQ = { regOBD("MEMBER_ID"); return this; }

    protected var _loginPassword: ConditionValue = null;
    def getLoginPassword(): ConditionValue =
    { if (_loginPassword == null) { _loginPassword = nCV(); }
      return _loginPassword; }
    protected def getCValueLoginPassword(): ConditionValue = { return getLoginPassword(); }

    /** 
     * Add order-by as ascend. <br />
     * (ログインパスワード)LOGIN_PASSWORD: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    def addOrderBy_LoginPassword_Asc(): BsMemberSecurityCQ = { regOBA("LOGIN_PASSWORD"); return this; }

    /**
     * Add order-by as descend. <br />
     * (ログインパスワード)LOGIN_PASSWORD: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    def addOrderBy_LoginPassword_Desc(): BsMemberSecurityCQ = { regOBD("LOGIN_PASSWORD"); return this; }

    protected var _reminderQuestion: ConditionValue = null;
    def getReminderQuestion(): ConditionValue =
    { if (_reminderQuestion == null) { _reminderQuestion = nCV(); }
      return _reminderQuestion; }
    protected def getCValueReminderQuestion(): ConditionValue = { return getReminderQuestion(); }

    /** 
     * Add order-by as ascend. <br />
     * (リマインダ質問)REMINDER_QUESTION: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    def addOrderBy_ReminderQuestion_Asc(): BsMemberSecurityCQ = { regOBA("REMINDER_QUESTION"); return this; }

    /**
     * Add order-by as descend. <br />
     * (リマインダ質問)REMINDER_QUESTION: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    def addOrderBy_ReminderQuestion_Desc(): BsMemberSecurityCQ = { regOBD("REMINDER_QUESTION"); return this; }

    protected var _reminderAnswer: ConditionValue = null;
    def getReminderAnswer(): ConditionValue =
    { if (_reminderAnswer == null) { _reminderAnswer = nCV(); }
      return _reminderAnswer; }
    protected def getCValueReminderAnswer(): ConditionValue = { return getReminderAnswer(); }

    /** 
     * Add order-by as ascend. <br />
     * (リマインダ回答)REMINDER_ANSWER: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    def addOrderBy_ReminderAnswer_Asc(): BsMemberSecurityCQ = { regOBA("REMINDER_ANSWER"); return this; }

    /**
     * Add order-by as descend. <br />
     * (リマインダ回答)REMINDER_ANSWER: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    def addOrderBy_ReminderAnswer_Desc(): BsMemberSecurityCQ = { regOBD("REMINDER_ANSWER"); return this; }

    protected var _reminderUseCount: ConditionValue = null;
    def getReminderUseCount(): ConditionValue =
    { if (_reminderUseCount == null) { _reminderUseCount = nCV(); }
      return _reminderUseCount; }
    protected def getCValueReminderUseCount(): ConditionValue = { return getReminderUseCount(); }

    /** 
     * Add order-by as ascend. <br />
     * (リマインダ利用回数)REMINDER_USE_COUNT: {NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    def addOrderBy_ReminderUseCount_Asc(): BsMemberSecurityCQ = { regOBA("REMINDER_USE_COUNT"); return this; }

    /**
     * Add order-by as descend. <br />
     * (リマインダ利用回数)REMINDER_USE_COUNT: {NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    def addOrderBy_ReminderUseCount_Desc(): BsMemberSecurityCQ = { regOBD("REMINDER_USE_COUNT"); return this; }

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
    def addOrderBy_RegisterDatetime_Asc(): BsMemberSecurityCQ = { regOBA("REGISTER_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br />
     * REGISTER_DATETIME: {NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    def addOrderBy_RegisterDatetime_Desc(): BsMemberSecurityCQ = { regOBD("REGISTER_DATETIME"); return this; }

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
    def addOrderBy_RegisterUser_Asc(): BsMemberSecurityCQ = { regOBA("REGISTER_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    def addOrderBy_RegisterUser_Desc(): BsMemberSecurityCQ = { regOBD("REGISTER_USER"); return this; }

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
    def addOrderBy_UpdateDatetime_Asc(): BsMemberSecurityCQ = { regOBA("UPDATE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br />
     * UPDATE_DATETIME: {NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    def addOrderBy_UpdateDatetime_Desc(): BsMemberSecurityCQ = { regOBD("UPDATE_DATETIME"); return this; }

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
    def addOrderBy_UpdateUser_Asc(): BsMemberSecurityCQ = { regOBA("UPDATE_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * UPDATE_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    def addOrderBy_UpdateUser_Desc(): BsMemberSecurityCQ = { regOBD("UPDATE_USER"); return this; }

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
    def addOrderBy_VersionNo_Asc(): BsMemberSecurityCQ = { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br />
     * VERSION_NO: {NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    def addOrderBy_VersionNo_Desc(): BsMemberSecurityCQ = { regOBD("VERSION_NO"); return this; }

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
    def addSpecifiedDerivedOrderBy_Asc(aliasName: String): BsMemberSecurityCQ = { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    def addSpecifiedDerivedOrderBy_Desc(aliasName: String): BsMemberSecurityCQ = { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    def reflectRelationOnUnionQuery(bqs: ConditionQuery, uqs: ConditionQuery): Unit = {
        val bq: MemberSecurityCQ = bqs.asInstanceOf[MemberSecurityCQ];
        val uq: MemberSecurityCQ = uqs.asInstanceOf[MemberSecurityCQ];
        if (bq.hasConditionQueryMember()) {
            uq.queryMember().reflectRelationOnUnionQuery(bq.queryMember(), uq.queryMember());
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
        val nrp = xresolveNRP("MEMBER_SECURITY",  "member"); val jan = xresolveJAN(nrp,  xgetNNLvl());
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
    def getScalarCondition(): Map[String, MemberSecurityCQ] = { xgetSQueMap("scalarCondition") }
    def keepScalarCondition(sq: MemberSecurityCQ): String = { xkeepSQue("scalarCondition", sq) }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    def getSpecifyMyselfDerived(): Map[String, MemberSecurityCQ] = { xgetSQueMap("specifyMyselfDerived") }
    def keepSpecifyMyselfDerived(sq: MemberSecurityCQ): String = { xkeepSQue("specifyMyselfDerived", sq) }

    def getQueryMyselfDerived(): Map[String, MemberSecurityCQ] = { xgetSQueMap("queryMyselfDerived") }
    def keepQueryMyselfDerived(sq: MemberSecurityCQ): String = { xkeepSQue("queryMyselfDerived", sq) }
    def getQueryMyselfDerivedParameter(): Map[String, Object] = { xgetSQuePmMap("qyeryMyselfDerived") }
    def keepQueryMyselfDerivedParameter(pm: Object): String = { xkeepSQuePm("qyeryMyselfDerived", pm) }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    def getMyselfExists(): Map[String, MemberSecurityCQ] = { xgetSQueMap("myselfExists") }
    def keepMyselfExists(sq: MemberSecurityCQ): String = { xkeepSQue("myselfExists", sq) }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    def getMyselfInScope(): Map[String, MemberSecurityCQ] = { xgetSQueMap("myselfInScope") }
    def keepMyselfInScope(sq: MemberSecurityCQ): String = { xkeepSQue("myselfInScope", sq) }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected def xCB(): String = { return classOf[MemberSecurityCB].getName(); }
    protected def xCQ(): String = { return classOf[MemberSecurityCQ].getName(); }
    protected def xCHp(): String = { return classOf[HpCalculator].getName(); }
    protected def xCOp(): String = { return classOf[ConditionOption].getName(); }
    protected def xMap(): String = { return classOf[Map[_, _]].getName(); }
}
