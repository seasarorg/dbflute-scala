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
 * The base condition-query of MEMBER.
 * @author DBFlute(AutoGenerator)
 */
class BsMemberCQ(referrerQuery: ConditionQuery, sqlClause: SqlClause, aliasName: String, nestLevel: Integer) extends AbstractBsMemberCQ(referrerQuery, sqlClause, aliasName, nestLevel) {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected var _inlineQuery: MemberCIQ = null;

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from MEMBER) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    def inline(): MemberCIQ = {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected def xcreateCIQ(): MemberCIQ = {
        val ciq: MemberCIQ = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected def xnewCIQ(): MemberCIQ = {
        return new MemberCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join MEMBER on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    def on(): MemberCIQ = {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        val inlineQuery: MemberCIQ = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected var _memberId: ConditionValue = null;
    def getMemberId(): ConditionValue = {
        if (_memberId == null) { _memberId = nCV(); }
        return _memberId;
    }
    protected def getCValueMemberId(): ConditionValue = { return getMemberId(); }

    protected var _memberId_ExistsReferrer_PurchaseListMap: Map[String, PurchaseCQ] = null;
    def getMemberId_ExistsReferrer_PurchaseList(): Map[String, PurchaseCQ] = { return _memberId_ExistsReferrer_PurchaseListMap; }
    def keepMemberId_ExistsReferrer_PurchaseList(sq: PurchaseCQ): String = {
        if (_memberId_ExistsReferrer_PurchaseListMap == null) { _memberId_ExistsReferrer_PurchaseListMap = newLinkedHashMapSized(4); }
        val ky: String = "subQueryMapKey" + (_memberId_ExistsReferrer_PurchaseListMap.size() + 1);
        _memberId_ExistsReferrer_PurchaseListMap.put(ky, sq); return "memberId_ExistsReferrer_PurchaseList." + ky;
    }

    protected var _memberId_NotExistsReferrer_PurchaseListMap: Map[String, PurchaseCQ] = null;
    def getMemberId_NotExistsReferrer_PurchaseList(): Map[String, PurchaseCQ] = { return _memberId_NotExistsReferrer_PurchaseListMap; }
    def keepMemberId_NotExistsReferrer_PurchaseList(sq: PurchaseCQ): String = {
        if (_memberId_NotExistsReferrer_PurchaseListMap == null) { _memberId_NotExistsReferrer_PurchaseListMap = newLinkedHashMapSized(4); }
        val ky: String = "subQueryMapKey" + (_memberId_NotExistsReferrer_PurchaseListMap.size() + 1);
        _memberId_NotExistsReferrer_PurchaseListMap.put(ky, sq); return "memberId_NotExistsReferrer_PurchaseList." + ky;
    }

    protected var _memberId_SpecifyDerivedReferrer_PurchaseListMap: Map[String, PurchaseCQ] = null;
    def getMemberId_SpecifyDerivedReferrer_PurchaseList(): Map[String, PurchaseCQ] = { return _memberId_SpecifyDerivedReferrer_PurchaseListMap; }
    def keepMemberId_SpecifyDerivedReferrer_PurchaseList(sq: PurchaseCQ): String = {
        if (_memberId_SpecifyDerivedReferrer_PurchaseListMap == null) { _memberId_SpecifyDerivedReferrer_PurchaseListMap = newLinkedHashMapSized(4); }
        val ky: String = "subQueryMapKey" + (_memberId_SpecifyDerivedReferrer_PurchaseListMap.size() + 1);
        _memberId_SpecifyDerivedReferrer_PurchaseListMap.put(ky, sq); return "memberId_SpecifyDerivedReferrer_PurchaseList." + ky;
    }

    protected var _memberId_InScopeRelation_PurchaseListMap: Map[String, PurchaseCQ] = null;
    def getMemberId_InScopeRelation_PurchaseList(): Map[String, PurchaseCQ] = { return _memberId_InScopeRelation_PurchaseListMap; }
    def keepMemberId_InScopeRelation_PurchaseList(sq: PurchaseCQ): String = {
        if (_memberId_InScopeRelation_PurchaseListMap == null) { _memberId_InScopeRelation_PurchaseListMap = newLinkedHashMapSized(4); }
        val ky: String = "subQueryMapKey" + (_memberId_InScopeRelation_PurchaseListMap.size() + 1);
        _memberId_InScopeRelation_PurchaseListMap.put(ky, sq); return "memberId_InScopeRelation_PurchaseList." + ky;
    }

    protected var _memberId_NotInScopeRelation_PurchaseListMap: Map[String, PurchaseCQ] = null;
    def getMemberId_NotInScopeRelation_PurchaseList(): Map[String, PurchaseCQ] = { return _memberId_NotInScopeRelation_PurchaseListMap; }
    def keepMemberId_NotInScopeRelation_PurchaseList(sq: PurchaseCQ): String = {
        if (_memberId_NotInScopeRelation_PurchaseListMap == null) { _memberId_NotInScopeRelation_PurchaseListMap = newLinkedHashMapSized(4); }
        val ky: String = "subQueryMapKey" + (_memberId_NotInScopeRelation_PurchaseListMap.size() + 1);
        _memberId_NotInScopeRelation_PurchaseListMap.put(ky, sq); return "memberId_NotInScopeRelation_PurchaseList." + ky;
    }

    protected var _memberId_QueryDerivedReferrer_PurchaseListMap: Map[String, PurchaseCQ] = null;
    def getMemberId_QueryDerivedReferrer_PurchaseList(): Map[String, PurchaseCQ] = { return _memberId_QueryDerivedReferrer_PurchaseListMap; }
    def keepMemberId_QueryDerivedReferrer_PurchaseList(sq: PurchaseCQ): String = {
        if (_memberId_QueryDerivedReferrer_PurchaseListMap == null) { _memberId_QueryDerivedReferrer_PurchaseListMap = newLinkedHashMapSized(4); }
        val ky: String = "subQueryMapKey" + (_memberId_QueryDerivedReferrer_PurchaseListMap.size() + 1);
        _memberId_QueryDerivedReferrer_PurchaseListMap.put(ky, sq); return "memberId_QueryDerivedReferrer_PurchaseList." + ky;
    }
    protected var _memberId_QueryDerivedReferrer_PurchaseListParameterMap: Map[String, Object] = null;
    def getMemberId_QueryDerivedReferrer_PurchaseListParameter(): Map[String, Object] = { return _memberId_QueryDerivedReferrer_PurchaseListParameterMap; }
    def keepMemberId_QueryDerivedReferrer_PurchaseListParameter(vl: Object): String = {
        if (_memberId_QueryDerivedReferrer_PurchaseListParameterMap == null) { _memberId_QueryDerivedReferrer_PurchaseListParameterMap = newLinkedHashMapSized(4); }
        val ky: String = "subQueryParameterKey" + (_memberId_QueryDerivedReferrer_PurchaseListParameterMap.size() + 1);
        _memberId_QueryDerivedReferrer_PurchaseListParameterMap.put(ky, vl); return "memberId_QueryDerivedReferrer_PurchaseListParameter." + ky;
    }

    /** 
     * Add order-by as ascend. <br />
     * (会員ID)MEMBER_ID: {PK, ID, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    def addOrderBy_MemberId_Asc(): BsMemberCQ = { regOBA("MEMBER_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * (会員ID)MEMBER_ID: {PK, ID, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    def addOrderBy_MemberId_Desc(): BsMemberCQ = { regOBD("MEMBER_ID"); return this; }

    protected var _memberName: ConditionValue = null;
    def getMemberName(): ConditionValue = {
        if (_memberName == null) { _memberName = nCV(); }
        return _memberName;
    }
    protected def getCValueMemberName(): ConditionValue = { return getMemberName(); }

    /** 
     * Add order-by as ascend. <br />
     * (会員名称)MEMBER_NAME: {IX, NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    def addOrderBy_MemberName_Asc(): BsMemberCQ = { regOBA("MEMBER_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * (会員名称)MEMBER_NAME: {IX, NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    def addOrderBy_MemberName_Desc(): BsMemberCQ = { regOBD("MEMBER_NAME"); return this; }

    protected var _memberAccount: ConditionValue = null;
    def getMemberAccount(): ConditionValue = {
        if (_memberAccount == null) { _memberAccount = nCV(); }
        return _memberAccount;
    }
    protected def getCValueMemberAccount(): ConditionValue = { return getMemberAccount(); }

    /** 
     * Add order-by as ascend. <br />
     * (会員アカウント)MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    def addOrderBy_MemberAccount_Asc(): BsMemberCQ = { regOBA("MEMBER_ACCOUNT"); return this; }

    /**
     * Add order-by as descend. <br />
     * (会員アカウント)MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    def addOrderBy_MemberAccount_Desc(): BsMemberCQ = { regOBD("MEMBER_ACCOUNT"); return this; }

    protected var _memberStatusCode: ConditionValue = null;
    def getMemberStatusCode(): ConditionValue = {
        if (_memberStatusCode == null) { _memberStatusCode = nCV(); }
        return _memberStatusCode;
    }
    protected def getCValueMemberStatusCode(): ConditionValue = { return getMemberStatusCode(); }

    /** 
     * Add order-by as ascend. <br />
     * (会員ステータスコード)MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus}
     * @return this. (NotNull)
     */
    def addOrderBy_MemberStatusCode_Asc(): BsMemberCQ = { regOBA("MEMBER_STATUS_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * (会員ステータスコード)MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus}
     * @return this. (NotNull)
     */
    def addOrderBy_MemberStatusCode_Desc(): BsMemberCQ = { regOBD("MEMBER_STATUS_CODE"); return this; }

    protected var _formalizedDatetime: ConditionValue = null;
    def getFormalizedDatetime(): ConditionValue = {
        if (_formalizedDatetime == null) { _formalizedDatetime = nCV(); }
        return _formalizedDatetime;
    }
    protected def getCValueFormalizedDatetime(): ConditionValue = { return getFormalizedDatetime(); }

    /** 
     * Add order-by as ascend. <br />
     * (正式会員日時)FORMALIZED_DATETIME: {IX, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    def addOrderBy_FormalizedDatetime_Asc(): BsMemberCQ = { regOBA("FORMALIZED_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br />
     * (正式会員日時)FORMALIZED_DATETIME: {IX, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    def addOrderBy_FormalizedDatetime_Desc(): BsMemberCQ = { regOBD("FORMALIZED_DATETIME"); return this; }

    protected var _birthdate: ConditionValue = null;
    def getBirthdate(): ConditionValue = {
        if (_birthdate == null) { _birthdate = nCV(); }
        return _birthdate;
    }
    protected def getCValueBirthdate(): ConditionValue = { return getBirthdate(); }

    /** 
     * Add order-by as ascend. <br />
     * (生年月日)BIRTHDATE: {DATE(8)}
     * @return this. (NotNull)
     */
    def addOrderBy_Birthdate_Asc(): BsMemberCQ = { regOBA("BIRTHDATE"); return this; }

    /**
     * Add order-by as descend. <br />
     * (生年月日)BIRTHDATE: {DATE(8)}
     * @return this. (NotNull)
     */
    def addOrderBy_Birthdate_Desc(): BsMemberCQ = { regOBD("BIRTHDATE"); return this; }

    protected var _registerDatetime: ConditionValue = null;
    def getRegisterDatetime(): ConditionValue = {
        if (_registerDatetime == null) { _registerDatetime = nCV(); }
        return _registerDatetime;
    }
    protected def getCValueRegisterDatetime(): ConditionValue = { return getRegisterDatetime(); }

    /** 
     * Add order-by as ascend. <br />
     * (登録日時)REGISTER_DATETIME: {NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    def addOrderBy_RegisterDatetime_Asc(): BsMemberCQ = { regOBA("REGISTER_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br />
     * (登録日時)REGISTER_DATETIME: {NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    def addOrderBy_RegisterDatetime_Desc(): BsMemberCQ = { regOBD("REGISTER_DATETIME"); return this; }

    protected var _registerUser: ConditionValue = null;
    def getRegisterUser(): ConditionValue = {
        if (_registerUser == null) { _registerUser = nCV(); }
        return _registerUser;
    }
    protected def getCValueRegisterUser(): ConditionValue = { return getRegisterUser(); }

    /** 
     * Add order-by as ascend. <br />
     * (登録ユーザ)REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    def addOrderBy_RegisterUser_Asc(): BsMemberCQ = { regOBA("REGISTER_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * (登録ユーザ)REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    def addOrderBy_RegisterUser_Desc(): BsMemberCQ = { regOBD("REGISTER_USER"); return this; }

    protected var _updateDatetime: ConditionValue = null;
    def getUpdateDatetime(): ConditionValue = {
        if (_updateDatetime == null) { _updateDatetime = nCV(); }
        return _updateDatetime;
    }
    protected def getCValueUpdateDatetime(): ConditionValue = { return getUpdateDatetime(); }

    /** 
     * Add order-by as ascend. <br />
     * (更新日時)UPDATE_DATETIME: {NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    def addOrderBy_UpdateDatetime_Asc(): BsMemberCQ = { regOBA("UPDATE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br />
     * (更新日時)UPDATE_DATETIME: {NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    def addOrderBy_UpdateDatetime_Desc(): BsMemberCQ = { regOBD("UPDATE_DATETIME"); return this; }

    protected var _updateUser: ConditionValue = null;
    def getUpdateUser(): ConditionValue = {
        if (_updateUser == null) { _updateUser = nCV(); }
        return _updateUser;
    }
    protected def getCValueUpdateUser(): ConditionValue = { return getUpdateUser(); }

    /** 
     * Add order-by as ascend. <br />
     * (更新ユーザ)UPDATE_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    def addOrderBy_UpdateUser_Asc(): BsMemberCQ = { regOBA("UPDATE_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * (更新ユーザ)UPDATE_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    def addOrderBy_UpdateUser_Desc(): BsMemberCQ = { regOBD("UPDATE_USER"); return this; }

    protected var _versionNo: ConditionValue = null;
    def getVersionNo(): ConditionValue = {
        if (_versionNo == null) { _versionNo = nCV(); }
        return _versionNo;
    }
    protected def getCValueVersionNo(): ConditionValue = { return getVersionNo(); }

    /** 
     * Add order-by as ascend. <br />
     * (バージョンNO)VERSION_NO: {NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    def addOrderBy_VersionNo_Asc(): BsMemberCQ = { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br />
     * (バージョンNO)VERSION_NO: {NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    def addOrderBy_VersionNo_Desc(): BsMemberCQ = { regOBD("VERSION_NO"); return this; }

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
    def addSpecifiedDerivedOrderBy_Asc(aliasName: String): BsMemberCQ =
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
    def addSpecifiedDerivedOrderBy_Desc(aliasName: String): BsMemberCQ =
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    def reflectRelationOnUnionQuery(bqs: ConditionQuery, uqs: ConditionQuery): Unit = {
        val bq: MemberCQ = bqs.asInstanceOf[MemberCQ];
        val uq: MemberCQ = uqs.asInstanceOf[MemberCQ];
        if (bq.hasConditionQueryMemberStatus()) {
            uq.queryMemberStatus().reflectRelationOnUnionQuery(bq.queryMemberStatus(), uq.queryMemberStatus());
        }
        if (bq.hasConditionQueryMemberSecurityAsOne()) {
            uq.queryMemberSecurityAsOne().reflectRelationOnUnionQuery(bq.queryMemberSecurityAsOne(), uq.queryMemberSecurityAsOne());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * (会員ステータス)MEMBER_STATUS by my MEMBER_STATUS_CODE, named 'memberStatus'.
     * @return The instance of condition-query. (NotNull)
     */
    def queryMemberStatus(): MemberStatusCQ = {
        return getConditionQueryMemberStatus();
    }
    protected var _conditionQueryMemberStatus: MemberStatusCQ = null;
    def getConditionQueryMemberStatus(): MemberStatusCQ = {
        if (_conditionQueryMemberStatus == null) {
            _conditionQueryMemberStatus = xcreateQueryMemberStatus();
            xsetupOuterJoinMemberStatus();
        }
        return _conditionQueryMemberStatus;
    }
    protected def xcreateQueryMemberStatus(): MemberStatusCQ = {
        val nrp: String = resolveNextRelationPath("MEMBER",  "memberStatus");
        val jan: String = resolveJoinAliasName(nrp,  xgetNextNestLevel());
        val cq: MemberStatusCQ = new MemberStatusCQ(this,  xgetSqlClause(),  jan,  xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("memberStatus");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected def xsetupOuterJoinMemberStatus(): Unit = {
        val cq: MemberStatusCQ = getConditionQueryMemberStatus();
        val joinOnMap: Map[String, String] = newLinkedHashMapSized(4);
        joinOnMap.put("MEMBER_STATUS_CODE", "MEMBER_STATUS_CODE");
        registerOuterJoin(cq, joinOnMap, "memberStatus");
    }
    def hasConditionQueryMemberStatus(): Boolean = {
        return _conditionQueryMemberStatus != null;
    }

    /**
     * Get the condition-query for relation table. <br />
     * (会員セキュリティ情報)MEMBER_SECURITY by MEMBER_ID, named 'memberSecurityAsOne'.
     * @return The instance of condition-query. (NotNull)
     */
    def queryMemberSecurityAsOne(): MemberSecurityCQ = {
        return getConditionQueryMemberSecurityAsOne();
    }
    protected var _conditionQueryMemberSecurityAsOne: MemberSecurityCQ = null;
    def getConditionQueryMemberSecurityAsOne(): MemberSecurityCQ = {
        if (_conditionQueryMemberSecurityAsOne == null) {
            _conditionQueryMemberSecurityAsOne = xcreateQueryMemberSecurityAsOne();
            xsetupOuterJoinMemberSecurityAsOne();
        }
        return _conditionQueryMemberSecurityAsOne;
    }
    protected def xcreateQueryMemberSecurityAsOne(): MemberSecurityCQ = {
        val nrp: String = resolveNextRelationPath("MEMBER",  "memberSecurityAsOne");
        val jan: String = resolveJoinAliasName(nrp,  xgetNextNestLevel());
        val cq: MemberSecurityCQ = new MemberSecurityCQ(this,  xgetSqlClause(),  jan,  xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("memberSecurityAsOne");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected def xsetupOuterJoinMemberSecurityAsOne(): Unit = {
        val cq: MemberSecurityCQ = getConditionQueryMemberSecurityAsOne();
        val joinOnMap: Map[String, String] = newLinkedHashMapSized(4);
        joinOnMap.put("MEMBER_ID", "MEMBER_ID");
        registerOuterJoin(cq, joinOnMap, "memberSecurityAsOne");
    }
    def hasConditionQueryMemberSecurityAsOne(): Boolean = {
        return _conditionQueryMemberSecurityAsOne != null;
    }

    protected def xfindFixedConditionDynamicParameterMap(property: String): Map[String, Object] = {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    protected var _scalarConditionMap: Map[String, MemberCQ] = null;
    def getScalarCondition(): Map[String, MemberCQ] = { return _scalarConditionMap; }
    def keepScalarCondition(sq: MemberCQ): String = {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        val ky: String = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(ky, sq); return "scalarCondition." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected var _specifyMyselfDerivedMap: Map[String, MemberCQ] = null;
    def getSpecifyMyselfDerived(): Map[String, MemberCQ] = { return _specifyMyselfDerivedMap; }
    def keepSpecifyMyselfDerived(sq: MemberCQ): String = {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        val ky: String = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(ky, sq); return "specifyMyselfDerived." + ky;
    }

    protected var _queryMyselfDerivedMap: Map[String, MemberCQ] = null;
    def getQueryMyselfDerived(): Map[String, MemberCQ] = { return _queryMyselfDerivedMap; }
    def keepQueryMyselfDerived(sq: MemberCQ): String = {
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
    protected var _myselfExistsMap: Map[String, MemberCQ] = null;
    def getMyselfExists(): Map[String, MemberCQ] = { return _myselfExistsMap; }
    def keepMyselfExists(sq: MemberCQ): String = {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        val ky: String = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(ky, sq); return "myselfExists." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected var _myselfInScopeMap: Map[String, MemberCQ] = null;
    def getMyselfInScope(): Map[String, MemberCQ] = { return _myselfInScopeMap; }
    def keepMyselfInScope(sq: MemberCQ): String = {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        val ky: String = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(ky, sq); return "myselfInScope." + ky;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected def xCB(): String = { return classOf[MemberCB].getName(); }
    protected def xCQ(): String = { return classOf[MemberCQ].getName(); }
    protected def xMap(): String = { return classOf[Map[_, _]].getName(); }
}
