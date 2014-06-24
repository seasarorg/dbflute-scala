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
 * The base condition-query of MEMBER_ADDRESS.
 * @author DBFlute(AutoGenerator)
 */
class BsMemberAddressCQ(referrerQuery: ConditionQuery, sqlClause: SqlClause, aliasName: String, nestLevel: Integer) extends AbstractBsMemberAddressCQ(referrerQuery, sqlClause, aliasName, nestLevel) {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected var _inlineQuery: MemberAddressCIQ = null;

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from MEMBER_ADDRESS) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    def inline(): MemberAddressCIQ = {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected def xcreateCIQ(): MemberAddressCIQ = {
        val ciq: MemberAddressCIQ = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected def xnewCIQ(): MemberAddressCIQ = {
        return new MemberAddressCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join MEMBER_ADDRESS on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    def on(): MemberAddressCIQ = {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        val inlineQuery: MemberAddressCIQ = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected var _memberAddressId: ConditionValue = null;
    def getMemberAddressId(): ConditionValue =
    { if (_memberAddressId == null) { _memberAddressId = nCV(); }
      return _memberAddressId; }
    protected def getCValueMemberAddressId(): ConditionValue = { return getMemberAddressId(); }

    /** 
     * Add order-by as ascend. <br />
     * (会員住所ID)MEMBER_ADDRESS_ID: {PK, ID, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    def addOrderBy_MemberAddressId_Asc(): BsMemberAddressCQ = { regOBA("MEMBER_ADDRESS_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * (会員住所ID)MEMBER_ADDRESS_ID: {PK, ID, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    def addOrderBy_MemberAddressId_Desc(): BsMemberAddressCQ = { regOBD("MEMBER_ADDRESS_ID"); return this; }

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
    def addOrderBy_MemberId_Asc(): BsMemberAddressCQ = { regOBA("MEMBER_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * (会員ID)MEMBER_ID: {UQ+, IX, NotNull, INTEGER(10), FK to MEMBER}
     * @return this. (NotNull)
     */
    def addOrderBy_MemberId_Desc(): BsMemberAddressCQ = { regOBD("MEMBER_ID"); return this; }

    protected var _validBeginDate: ConditionValue = null;
    def getValidBeginDate(): ConditionValue =
    { if (_validBeginDate == null) { _validBeginDate = nCV(); }
      return _validBeginDate; }
    protected def getCValueValidBeginDate(): ConditionValue = { return getValidBeginDate(); }

    /** 
     * Add order-by as ascend. <br />
     * (有効開始日)VALID_BEGIN_DATE: {+UQ, NotNull, DATE(8)}
     * @return this. (NotNull)
     */
    def addOrderBy_ValidBeginDate_Asc(): BsMemberAddressCQ = { regOBA("VALID_BEGIN_DATE"); return this; }

    /**
     * Add order-by as descend. <br />
     * (有効開始日)VALID_BEGIN_DATE: {+UQ, NotNull, DATE(8)}
     * @return this. (NotNull)
     */
    def addOrderBy_ValidBeginDate_Desc(): BsMemberAddressCQ = { regOBD("VALID_BEGIN_DATE"); return this; }

    protected var _validEndDate: ConditionValue = null;
    def getValidEndDate(): ConditionValue =
    { if (_validEndDate == null) { _validEndDate = nCV(); }
      return _validEndDate; }
    protected def getCValueValidEndDate(): ConditionValue = { return getValidEndDate(); }

    /** 
     * Add order-by as ascend. <br />
     * (有効終了日)VALID_END_DATE: {NotNull, DATE(8)}
     * @return this. (NotNull)
     */
    def addOrderBy_ValidEndDate_Asc(): BsMemberAddressCQ = { regOBA("VALID_END_DATE"); return this; }

    /**
     * Add order-by as descend. <br />
     * (有効終了日)VALID_END_DATE: {NotNull, DATE(8)}
     * @return this. (NotNull)
     */
    def addOrderBy_ValidEndDate_Desc(): BsMemberAddressCQ = { regOBD("VALID_END_DATE"); return this; }

    protected var _address: ConditionValue = null;
    def getAddress(): ConditionValue =
    { if (_address == null) { _address = nCV(); }
      return _address; }
    protected def getCValueAddress(): ConditionValue = { return getAddress(); }

    /** 
     * Add order-by as ascend. <br />
     * (住所)ADDRESS: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    def addOrderBy_Address_Asc(): BsMemberAddressCQ = { regOBA("ADDRESS"); return this; }

    /**
     * Add order-by as descend. <br />
     * (住所)ADDRESS: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    def addOrderBy_Address_Desc(): BsMemberAddressCQ = { regOBD("ADDRESS"); return this; }

    protected var _regionId: ConditionValue = null;
    def getRegionId(): ConditionValue =
    { if (_regionId == null) { _regionId = nCV(); }
      return _regionId; }
    protected def getCValueRegionId(): ConditionValue = { return getRegionId(); }

    /** 
     * Add order-by as ascend. <br />
     * (地域ID)REGION_ID: {IX, NotNull, INTEGER(10), FK to REGION, classification=Region}
     * @return this. (NotNull)
     */
    def addOrderBy_RegionId_Asc(): BsMemberAddressCQ = { regOBA("REGION_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * (地域ID)REGION_ID: {IX, NotNull, INTEGER(10), FK to REGION, classification=Region}
     * @return this. (NotNull)
     */
    def addOrderBy_RegionId_Desc(): BsMemberAddressCQ = { regOBD("REGION_ID"); return this; }

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
    def addOrderBy_RegisterDatetime_Asc(): BsMemberAddressCQ = { regOBA("REGISTER_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br />
     * REGISTER_DATETIME: {NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    def addOrderBy_RegisterDatetime_Desc(): BsMemberAddressCQ = { regOBD("REGISTER_DATETIME"); return this; }

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
    def addOrderBy_RegisterUser_Asc(): BsMemberAddressCQ = { regOBA("REGISTER_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    def addOrderBy_RegisterUser_Desc(): BsMemberAddressCQ = { regOBD("REGISTER_USER"); return this; }

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
    def addOrderBy_UpdateDatetime_Asc(): BsMemberAddressCQ = { regOBA("UPDATE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br />
     * UPDATE_DATETIME: {NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    def addOrderBy_UpdateDatetime_Desc(): BsMemberAddressCQ = { regOBD("UPDATE_DATETIME"); return this; }

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
    def addOrderBy_UpdateUser_Asc(): BsMemberAddressCQ = { regOBA("UPDATE_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * UPDATE_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    def addOrderBy_UpdateUser_Desc(): BsMemberAddressCQ = { regOBD("UPDATE_USER"); return this; }

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
    def addOrderBy_VersionNo_Asc(): BsMemberAddressCQ = { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br />
     * VERSION_NO: {NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    def addOrderBy_VersionNo_Desc(): BsMemberAddressCQ = { regOBD("VERSION_NO"); return this; }

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
    def addSpecifiedDerivedOrderBy_Asc(aliasName: String): BsMemberAddressCQ = { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    def addSpecifiedDerivedOrderBy_Desc(aliasName: String): BsMemberAddressCQ = { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    def reflectRelationOnUnionQuery(bqs: ConditionQuery, uqs: ConditionQuery): Unit = {
        val bq: MemberAddressCQ = bqs.asInstanceOf[MemberAddressCQ];
        val uq: MemberAddressCQ = uqs.asInstanceOf[MemberAddressCQ];
        if (bq.hasConditionQueryMember()) {
            uq.queryMember().reflectRelationOnUnionQuery(bq.queryMember(), uq.queryMember());
        }
        if (bq.hasConditionQueryRegion()) {
            uq.queryRegion().reflectRelationOnUnionQuery(bq.queryRegion(), uq.queryRegion());
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
        val nrp = xresolveNRP("MEMBER_ADDRESS",  "member"); val jan = xresolveJAN(nrp,  xgetNNLvl());
        return xinitRelCQ(new MemberCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "member", nrp);
    }
    protected def xsetupOuterJoinMember(): Unit = { xregOutJo("member") }
    def hasConditionQueryMember(): Boolean = { xhasQueRlMap("member") }

    /**
     * Get the condition-query for relation table. <br />
     * (地域)REGION by my REGION_ID, named 'region'.
     * @return The instance of condition-query. (NotNull)
     */
    def queryRegion(): RegionCQ = {
        return getConditionQueryRegion();
    }
    def getConditionQueryRegion(): RegionCQ = {
        val prop = "region";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryRegion()); xsetupOuterJoinRegion(); }
        return xgetQueRlMap(prop);
    }
    protected def xcreateQueryRegion(): RegionCQ = {
        val nrp = xresolveNRP("MEMBER_ADDRESS",  "region"); val jan = xresolveJAN(nrp,  xgetNNLvl());
        return xinitRelCQ(new RegionCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "region", nrp);
    }
    protected def xsetupOuterJoinRegion(): Unit = { xregOutJo("region") }
    def hasConditionQueryRegion(): Boolean = { xhasQueRlMap("region") }

    protected def xfindFixedConditionDynamicParameterMap(property: String): Map[String, Object] = {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    def getScalarCondition(): Map[String, MemberAddressCQ] = { xgetSQueMap("scalarCondition") }
    def keepScalarCondition(sq: MemberAddressCQ): String = { xkeepSQue("scalarCondition", sq) }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    def getSpecifyMyselfDerived(): Map[String, MemberAddressCQ] = { xgetSQueMap("specifyMyselfDerived") }
    def keepSpecifyMyselfDerived(sq: MemberAddressCQ): String = { xkeepSQue("specifyMyselfDerived", sq) }

    def getQueryMyselfDerived(): Map[String, MemberAddressCQ] = { xgetSQueMap("queryMyselfDerived") }
    def keepQueryMyselfDerived(sq: MemberAddressCQ): String = { xkeepSQue("queryMyselfDerived", sq) }
    def getQueryMyselfDerivedParameter(): Map[String, Object] = { xgetSQuePmMap("qyeryMyselfDerived") }
    def keepQueryMyselfDerivedParameter(pm: Object): String = { xkeepSQuePm("qyeryMyselfDerived", pm) }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    def getMyselfExists(): Map[String, MemberAddressCQ] = { xgetSQueMap("myselfExists") }
    def keepMyselfExists(sq: MemberAddressCQ): String = { xkeepSQue("myselfExists", sq) }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    def getMyselfInScope(): Map[String, MemberAddressCQ] = { xgetSQueMap("myselfInScope") }
    def keepMyselfInScope(sq: MemberAddressCQ): String = { xkeepSQue("myselfInScope", sq) }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected def xCB(): String = { return classOf[MemberAddressCB].getName(); }
    protected def xCQ(): String = { return classOf[MemberAddressCQ].getName(); }
    protected def xCHp(): String = { return classOf[HpCalculator].getName(); }
    protected def xCOp(): String = { return classOf[ConditionOption].getName(); }
    protected def xMap(): String = { return classOf[Map[_, _]].getName(); }
}
