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
 * The base condition-query of REGION.
 * @author DBFlute(AutoGenerator)
 */
class BsRegionCQ(referrerQuery: ConditionQuery, sqlClause: SqlClause, aliasName: String, nestLevel: Integer) extends AbstractBsRegionCQ(referrerQuery, sqlClause, aliasName, nestLevel) {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected var _inlineQuery: RegionCIQ = null;

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from REGION) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    def inline(): RegionCIQ = {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected def xcreateCIQ(): RegionCIQ = {
        val ciq: RegionCIQ = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected def xnewCIQ(): RegionCIQ = {
        return new RegionCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join REGION on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    def on(): RegionCIQ = {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        val inlineQuery: RegionCIQ = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected var _regionId: ConditionValue = null;
    def getRegionId(): ConditionValue =
    { if (_regionId == null) { _regionId = nCV(); }
      return _regionId; }
    protected def getCValueRegionId(): ConditionValue = { return getRegionId(); }

    def getRegionId_ExistsReferrer_MemberAddressList(): Map[String, MemberAddressCQ] = { xgetSQueMap("regionId_ExistsReferrer_MemberAddressList") }
    def keepRegionId_ExistsReferrer_MemberAddressList(sq: MemberAddressCQ): String = { xkeepSQue("regionId_ExistsReferrer_MemberAddressList", sq) }

    def getRegionId_NotExistsReferrer_MemberAddressList(): Map[String, MemberAddressCQ] = { xgetSQueMap("regionId_NotExistsReferrer_MemberAddressList") }
    def keepRegionId_NotExistsReferrer_MemberAddressList(sq: MemberAddressCQ): String = { xkeepSQue("regionId_NotExistsReferrer_MemberAddressList", sq) }

    def getRegionId_SpecifyDerivedReferrer_MemberAddressList(): Map[String, MemberAddressCQ] = { xgetSQueMap("regionId_SpecifyDerivedReferrer_MemberAddressList") }
    def keepRegionId_SpecifyDerivedReferrer_MemberAddressList(sq: MemberAddressCQ): String = { xkeepSQue("regionId_SpecifyDerivedReferrer_MemberAddressList", sq) }

    def getRegionId_InScopeRelation_MemberAddressList(): Map[String, MemberAddressCQ] = { xgetSQueMap("regionId_InScopeRelation_MemberAddressList") }
    def keepRegionId_InScopeRelation_MemberAddressList(sq: MemberAddressCQ): String = { xkeepSQue("regionId_InScopeRelation_MemberAddressList", sq) }

    def getRegionId_NotInScopeRelation_MemberAddressList(): Map[String, MemberAddressCQ] = { xgetSQueMap("regionId_NotInScopeRelation_MemberAddressList") }
    def keepRegionId_NotInScopeRelation_MemberAddressList(sq: MemberAddressCQ): String = { xkeepSQue("regionId_NotInScopeRelation_MemberAddressList", sq) }

    def getRegionId_QueryDerivedReferrer_MemberAddressList(): Map[String, MemberAddressCQ] = { xgetSQueMap("regionId_QueryDerivedReferrer_MemberAddressList") }
    def keepRegionId_QueryDerivedReferrer_MemberAddressList(sq: MemberAddressCQ): String = { xkeepSQue("regionId_QueryDerivedReferrer_MemberAddressList", sq) }
    def getRegionId_QueryDerivedReferrer_MemberAddressListParameter(): Map[String, Object] = { xgetSQuePmMap("regionId_QueryDerivedReferrer_MemberAddressList") }
    def keepRegionId_QueryDerivedReferrer_MemberAddressListParameter(pm: Object): String = { xkeepSQuePm("regionId_QueryDerivedReferrer_MemberAddressList", pm) }

    /** 
     * Add order-by as ascend. <br />
     * (地域ID)REGION_ID: {PK, NotNull, INTEGER(10), classification=Region}
     * @return this. (NotNull)
     */
    def addOrderBy_RegionId_Asc(): BsRegionCQ = { regOBA("REGION_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * (地域ID)REGION_ID: {PK, NotNull, INTEGER(10), classification=Region}
     * @return this. (NotNull)
     */
    def addOrderBy_RegionId_Desc(): BsRegionCQ = { regOBD("REGION_ID"); return this; }

    protected var _regionName: ConditionValue = null;
    def getRegionName(): ConditionValue =
    { if (_regionName == null) { _regionName = nCV(); }
      return _regionName; }
    protected def getCValueRegionName(): ConditionValue = { return getRegionName(); }

    /** 
     * Add order-by as ascend. <br />
     * (地域名称)REGION_NAME: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    def addOrderBy_RegionName_Asc(): BsRegionCQ = { regOBA("REGION_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * (地域名称)REGION_NAME: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    def addOrderBy_RegionName_Desc(): BsRegionCQ = { regOBD("REGION_NAME"); return this; }

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
    def addSpecifiedDerivedOrderBy_Asc(aliasName: String): BsRegionCQ = { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    def addSpecifiedDerivedOrderBy_Desc(aliasName: String): BsRegionCQ = { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    def getScalarCondition(): Map[String, RegionCQ] = { xgetSQueMap("scalarCondition") }
    def keepScalarCondition(sq: RegionCQ): String = { xkeepSQue("scalarCondition", sq) }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    def getSpecifyMyselfDerived(): Map[String, RegionCQ] = { xgetSQueMap("specifyMyselfDerived") }
    def keepSpecifyMyselfDerived(sq: RegionCQ): String = { xkeepSQue("specifyMyselfDerived", sq) }

    def getQueryMyselfDerived(): Map[String, RegionCQ] = { xgetSQueMap("queryMyselfDerived") }
    def keepQueryMyselfDerived(sq: RegionCQ): String = { xkeepSQue("queryMyselfDerived", sq) }
    def getQueryMyselfDerivedParameter(): Map[String, Object] = { xgetSQuePmMap("qyeryMyselfDerived") }
    def keepQueryMyselfDerivedParameter(pm: Object): String = { xkeepSQuePm("qyeryMyselfDerived", pm) }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    def getMyselfExists(): Map[String, RegionCQ] = { xgetSQueMap("myselfExists") }
    def keepMyselfExists(sq: RegionCQ): String = { xkeepSQue("myselfExists", sq) }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    def getMyselfInScope(): Map[String, RegionCQ] = { xgetSQueMap("myselfInScope") }
    def keepMyselfInScope(sq: RegionCQ): String = { xkeepSQue("myselfInScope", sq) }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected def xCB(): String = { return classOf[RegionCB].getName(); }
    protected def xCQ(): String = { return classOf[RegionCQ].getName(); }
    protected def xCHp(): String = { return classOf[HpCalculator].getName(); }
    protected def xCOp(): String = { return classOf[ConditionOption].getName(); }
    protected def xMap(): String = { return classOf[Map[_, _]].getName(); }
}
