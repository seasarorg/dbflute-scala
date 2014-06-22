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
 * The base condition-query of MEMBER_SERVICE.
 * @author DBFlute(AutoGenerator)
 */
class BsMemberServiceCQ(referrerQuery: ConditionQuery, sqlClause: SqlClause, aliasName: String, nestLevel: Integer) extends AbstractBsMemberServiceCQ(referrerQuery, sqlClause, aliasName, nestLevel) {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected var _inlineQuery: MemberServiceCIQ = null;

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from MEMBER_SERVICE) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    def inline(): MemberServiceCIQ = {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected def xcreateCIQ(): MemberServiceCIQ = {
        val ciq: MemberServiceCIQ = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected def xnewCIQ(): MemberServiceCIQ = {
        return new MemberServiceCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join MEMBER_SERVICE on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    def on(): MemberServiceCIQ = {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        val inlineQuery: MemberServiceCIQ = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected var _memberServiceId: ConditionValue = null;
    def getMemberServiceId(): ConditionValue = {
        if (_memberServiceId == null) { _memberServiceId = nCV(); }
        return _memberServiceId;
    }
    protected def getCValueMemberServiceId(): ConditionValue = { return getMemberServiceId(); }

    /** 
     * Add order-by as ascend. <br />
     * (会員サービスID)MEMBER_SERVICE_ID: {PK, ID, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    def addOrderBy_MemberServiceId_Asc(): BsMemberServiceCQ = { regOBA("MEMBER_SERVICE_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * (会員サービスID)MEMBER_SERVICE_ID: {PK, ID, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    def addOrderBy_MemberServiceId_Desc(): BsMemberServiceCQ = { regOBD("MEMBER_SERVICE_ID"); return this; }

    protected var _memberId: ConditionValue = null;
    def getMemberId(): ConditionValue = {
        if (_memberId == null) { _memberId = nCV(); }
        return _memberId;
    }
    protected def getCValueMemberId(): ConditionValue = { return getMemberId(); }

    /** 
     * Add order-by as ascend. <br />
     * (会員ID)MEMBER_ID: {UQ, IX, NotNull, INTEGER(10), FK to MEMBER}
     * @return this. (NotNull)
     */
    def addOrderBy_MemberId_Asc(): BsMemberServiceCQ = { regOBA("MEMBER_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * (会員ID)MEMBER_ID: {UQ, IX, NotNull, INTEGER(10), FK to MEMBER}
     * @return this. (NotNull)
     */
    def addOrderBy_MemberId_Desc(): BsMemberServiceCQ = { regOBD("MEMBER_ID"); return this; }

    protected var _servicePointCount: ConditionValue = null;
    def getServicePointCount(): ConditionValue = {
        if (_servicePointCount == null) { _servicePointCount = nCV(); }
        return _servicePointCount;
    }
    protected def getCValueServicePointCount(): ConditionValue = { return getServicePointCount(); }

    /** 
     * Add order-by as ascend. <br />
     * (サービスポイント数)SERVICE_POINT_COUNT: {IX, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    def addOrderBy_ServicePointCount_Asc(): BsMemberServiceCQ = { regOBA("SERVICE_POINT_COUNT"); return this; }

    /**
     * Add order-by as descend. <br />
     * (サービスポイント数)SERVICE_POINT_COUNT: {IX, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    def addOrderBy_ServicePointCount_Desc(): BsMemberServiceCQ = { regOBD("SERVICE_POINT_COUNT"); return this; }

    protected var _serviceRankCode: ConditionValue = null;
    def getServiceRankCode(): ConditionValue = {
        if (_serviceRankCode == null) { _serviceRankCode = nCV(); }
        return _serviceRankCode;
    }
    protected def getCValueServiceRankCode(): ConditionValue = { return getServiceRankCode(); }

    /** 
     * Add order-by as ascend. <br />
     * (サービスランクコード)SERVICE_RANK_CODE: {IX, NotNull, CHAR(3), FK to SERVICE_RANK, classification=ServiceRank}
     * @return this. (NotNull)
     */
    def addOrderBy_ServiceRankCode_Asc(): BsMemberServiceCQ = { regOBA("SERVICE_RANK_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * (サービスランクコード)SERVICE_RANK_CODE: {IX, NotNull, CHAR(3), FK to SERVICE_RANK, classification=ServiceRank}
     * @return this. (NotNull)
     */
    def addOrderBy_ServiceRankCode_Desc(): BsMemberServiceCQ = { regOBD("SERVICE_RANK_CODE"); return this; }

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
    def addOrderBy_RegisterDatetime_Asc(): BsMemberServiceCQ = { regOBA("REGISTER_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br />
     * REGISTER_DATETIME: {NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    def addOrderBy_RegisterDatetime_Desc(): BsMemberServiceCQ = { regOBD("REGISTER_DATETIME"); return this; }

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
    def addOrderBy_RegisterUser_Asc(): BsMemberServiceCQ = { regOBA("REGISTER_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    def addOrderBy_RegisterUser_Desc(): BsMemberServiceCQ = { regOBD("REGISTER_USER"); return this; }

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
    def addOrderBy_UpdateDatetime_Asc(): BsMemberServiceCQ = { regOBA("UPDATE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br />
     * UPDATE_DATETIME: {NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    def addOrderBy_UpdateDatetime_Desc(): BsMemberServiceCQ = { regOBD("UPDATE_DATETIME"); return this; }

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
    def addOrderBy_UpdateUser_Asc(): BsMemberServiceCQ = { regOBA("UPDATE_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * UPDATE_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    def addOrderBy_UpdateUser_Desc(): BsMemberServiceCQ = { regOBD("UPDATE_USER"); return this; }

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
    def addOrderBy_VersionNo_Asc(): BsMemberServiceCQ = { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br />
     * VERSION_NO: {NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    def addOrderBy_VersionNo_Desc(): BsMemberServiceCQ = { regOBD("VERSION_NO"); return this; }

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
    def addSpecifiedDerivedOrderBy_Asc(aliasName: String): BsMemberServiceCQ =
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
    def addSpecifiedDerivedOrderBy_Desc(aliasName: String): BsMemberServiceCQ =
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    def reflectRelationOnUnionQuery(bqs: ConditionQuery, uqs: ConditionQuery): Unit = {
        val bq: MemberServiceCQ = bqs.asInstanceOf[MemberServiceCQ];
        val uq: MemberServiceCQ = uqs.asInstanceOf[MemberServiceCQ];
        if (bq.hasConditionQueryMember()) {
            uq.queryMember().reflectRelationOnUnionQuery(bq.queryMember(), uq.queryMember());
        }
        if (bq.hasConditionQueryServiceRank()) {
            uq.queryServiceRank().reflectRelationOnUnionQuery(bq.queryServiceRank(), uq.queryServiceRank());
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
    protected var _conditionQueryMember: MemberCQ = null;
    def getConditionQueryMember(): MemberCQ = {
        if (_conditionQueryMember == null) {
            _conditionQueryMember = xcreateQueryMember();
            xsetupOuterJoinMember();
        }
        return _conditionQueryMember;
    }
    protected def xcreateQueryMember(): MemberCQ = {
        val nrp: String = resolveNextRelationPath("MEMBER_SERVICE",  "member");
        val jan: String = resolveJoinAliasName(nrp,  xgetNextNestLevel());
        return xinitRelCQ(new MemberCQ(this, xgetSqlClause(), jan, xgetNextNestLevel()), _baseCB, "member", nrp);
    }
    protected def xsetupOuterJoinMember(): Unit = {
        val cq: MemberCQ = getConditionQueryMember();
        val joinOnMap: Map[String, String] = newLinkedHashMapSized(4);
        joinOnMap.put("MEMBER_ID", "MEMBER_ID");
        registerOuterJoin(cq, joinOnMap, "member");
    }
    def hasConditionQueryMember(): Boolean = { _conditionQueryMember != null }

    /**
     * Get the condition-query for relation table. <br />
     * (サービスランク)SERVICE_RANK by my SERVICE_RANK_CODE, named 'serviceRank'.
     * @return The instance of condition-query. (NotNull)
     */
    def queryServiceRank(): ServiceRankCQ = {
        return getConditionQueryServiceRank();
    }
    protected var _conditionQueryServiceRank: ServiceRankCQ = null;
    def getConditionQueryServiceRank(): ServiceRankCQ = {
        if (_conditionQueryServiceRank == null) {
            _conditionQueryServiceRank = xcreateQueryServiceRank();
            xsetupOuterJoinServiceRank();
        }
        return _conditionQueryServiceRank;
    }
    protected def xcreateQueryServiceRank(): ServiceRankCQ = {
        val nrp: String = resolveNextRelationPath("MEMBER_SERVICE",  "serviceRank");
        val jan: String = resolveJoinAliasName(nrp,  xgetNextNestLevel());
        return xinitRelCQ(new ServiceRankCQ(this, xgetSqlClause(), jan, xgetNextNestLevel()), _baseCB, "serviceRank", nrp);
    }
    protected def xsetupOuterJoinServiceRank(): Unit = {
        val cq: ServiceRankCQ = getConditionQueryServiceRank();
        val joinOnMap: Map[String, String] = newLinkedHashMapSized(4);
        joinOnMap.put("SERVICE_RANK_CODE", "SERVICE_RANK_CODE");
        registerOuterJoin(cq, joinOnMap, "serviceRank");
    }
    def hasConditionQueryServiceRank(): Boolean = { _conditionQueryServiceRank != null }

    protected def xfindFixedConditionDynamicParameterMap(property: String): Map[String, Object] = {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    protected var _scalarConditionMap: Map[String, MemberServiceCQ] = null;
    def getScalarCondition(): Map[String, MemberServiceCQ] = { return _scalarConditionMap; }
    def keepScalarCondition(sq: MemberServiceCQ): String = {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        val ky: String = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(ky, sq); return "scalarCondition." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected var _specifyMyselfDerivedMap: Map[String, MemberServiceCQ] = null;
    def getSpecifyMyselfDerived(): Map[String, MemberServiceCQ] = { return _specifyMyselfDerivedMap; }
    def keepSpecifyMyselfDerived(sq: MemberServiceCQ): String = {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        val ky: String = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(ky, sq); return "specifyMyselfDerived." + ky;
    }

    protected var _queryMyselfDerivedMap: Map[String, MemberServiceCQ] = null;
    def getQueryMyselfDerived(): Map[String, MemberServiceCQ] = { return _queryMyselfDerivedMap; }
    def keepQueryMyselfDerived(sq: MemberServiceCQ): String = {
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
    protected var _myselfExistsMap: Map[String, MemberServiceCQ] = null;
    def getMyselfExists(): Map[String, MemberServiceCQ] = { return _myselfExistsMap; }
    def keepMyselfExists(sq: MemberServiceCQ): String = {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        val ky: String = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(ky, sq); return "myselfExists." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected var _myselfInScopeMap: Map[String, MemberServiceCQ] = null;
    def getMyselfInScope(): Map[String, MemberServiceCQ] = { return _myselfInScopeMap; }
    def keepMyselfInScope(sq: MemberServiceCQ): String = {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        val ky: String = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(ky, sq); return "myselfInScope." + ky;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected def xCB(): String = { return classOf[MemberServiceCB].getName(); }
    protected def xCQ(): String = { return classOf[MemberServiceCQ].getName(); }
    protected def xCHp(): String = { return classOf[HpCalculator].getName(); }
    protected def xCOp(): String = { return classOf[ConditionOption].getName(); }
    protected def xMap(): String = { return classOf[Map[_, _]].getName(); }
}
