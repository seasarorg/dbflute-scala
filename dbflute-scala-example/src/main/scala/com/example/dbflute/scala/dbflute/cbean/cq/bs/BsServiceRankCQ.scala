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
 * The base condition-query of SERVICE_RANK.
 * @author DBFlute(AutoGenerator)
 */
class BsServiceRankCQ(referrerQuery: ConditionQuery, sqlClause: SqlClause, aliasName: String, nestLevel: Integer) extends AbstractBsServiceRankCQ(referrerQuery, sqlClause, aliasName, nestLevel) {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected var _inlineQuery: ServiceRankCIQ = null;

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from SERVICE_RANK) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    def inline(): ServiceRankCIQ = {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected def xcreateCIQ(): ServiceRankCIQ = {
        val ciq: ServiceRankCIQ = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected def xnewCIQ(): ServiceRankCIQ = {
        return new ServiceRankCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join SERVICE_RANK on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    def on(): ServiceRankCIQ = {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        val inlineQuery: ServiceRankCIQ = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected var _serviceRankCode: ConditionValue = null;
    def getServiceRankCode(): ConditionValue =
    { if (_serviceRankCode == null) { _serviceRankCode = nCV(); }
      return _serviceRankCode; }
    protected def getCValueServiceRankCode(): ConditionValue = { return getServiceRankCode(); }

    def getServiceRankCode_ExistsReferrer_MemberServiceList(): Map[String, MemberServiceCQ] = { xgetSQueMap("serviceRankCode_ExistsReferrer_MemberServiceList") }
    def keepServiceRankCode_ExistsReferrer_MemberServiceList(sq: MemberServiceCQ): String = { xkeepSQue("serviceRankCode_ExistsReferrer_MemberServiceList", sq) }

    def getServiceRankCode_NotExistsReferrer_MemberServiceList(): Map[String, MemberServiceCQ] = { xgetSQueMap("serviceRankCode_NotExistsReferrer_MemberServiceList") }
    def keepServiceRankCode_NotExistsReferrer_MemberServiceList(sq: MemberServiceCQ): String = { xkeepSQue("serviceRankCode_NotExistsReferrer_MemberServiceList", sq) }

    def getServiceRankCode_InScopeRelation_MemberServiceList(): Map[String, MemberServiceCQ] = { xgetSQueMap("serviceRankCode_InScopeRelation_MemberServiceList") }
    def keepServiceRankCode_InScopeRelation_MemberServiceList(sq: MemberServiceCQ): String = { xkeepSQue("serviceRankCode_InScopeRelation_MemberServiceList", sq) }

    def getServiceRankCode_NotInScopeRelation_MemberServiceList(): Map[String, MemberServiceCQ] = { xgetSQueMap("serviceRankCode_NotInScopeRelation_MemberServiceList") }
    def keepServiceRankCode_NotInScopeRelation_MemberServiceList(sq: MemberServiceCQ): String = { xkeepSQue("serviceRankCode_NotInScopeRelation_MemberServiceList", sq) }

    def getServiceRankCode_SpecifyDerivedReferrer_MemberServiceList(): Map[String, MemberServiceCQ] = { xgetSQueMap("serviceRankCode_SpecifyDerivedReferrer_MemberServiceList") }
    def keepServiceRankCode_SpecifyDerivedReferrer_MemberServiceList(sq: MemberServiceCQ): String = { xkeepSQue("serviceRankCode_SpecifyDerivedReferrer_MemberServiceList", sq) }

    def getServiceRankCode_QueryDerivedReferrer_MemberServiceList(): Map[String, MemberServiceCQ] = { xgetSQueMap("serviceRankCode_QueryDerivedReferrer_MemberServiceList") }
    def keepServiceRankCode_QueryDerivedReferrer_MemberServiceList(sq: MemberServiceCQ): String = { xkeepSQue("serviceRankCode_QueryDerivedReferrer_MemberServiceList", sq) }
    def getServiceRankCode_QueryDerivedReferrer_MemberServiceListParameter(): Map[String, Object] = { xgetSQuePmMap("serviceRankCode_QueryDerivedReferrer_MemberServiceList") }
    def keepServiceRankCode_QueryDerivedReferrer_MemberServiceListParameter(pm: Object): String = { xkeepSQuePm("serviceRankCode_QueryDerivedReferrer_MemberServiceList", pm) }

    /** 
     * Add order-by as ascend. <br />
     * (サービスランクコード)SERVICE_RANK_CODE: {PK, NotNull, CHAR(3), classification=ServiceRank}
     * @return this. (NotNull)
     */
    def addOrderBy_ServiceRankCode_Asc(): BsServiceRankCQ = { regOBA("SERVICE_RANK_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * (サービスランクコード)SERVICE_RANK_CODE: {PK, NotNull, CHAR(3), classification=ServiceRank}
     * @return this. (NotNull)
     */
    def addOrderBy_ServiceRankCode_Desc(): BsServiceRankCQ = { regOBD("SERVICE_RANK_CODE"); return this; }

    protected var _serviceRankName: ConditionValue = null;
    def getServiceRankName(): ConditionValue =
    { if (_serviceRankName == null) { _serviceRankName = nCV(); }
      return _serviceRankName; }
    protected def getCValueServiceRankName(): ConditionValue = { return getServiceRankName(); }

    /** 
     * Add order-by as ascend. <br />
     * (サービスランク名称)SERVICE_RANK_NAME: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    def addOrderBy_ServiceRankName_Asc(): BsServiceRankCQ = { regOBA("SERVICE_RANK_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * (サービスランク名称)SERVICE_RANK_NAME: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    def addOrderBy_ServiceRankName_Desc(): BsServiceRankCQ = { regOBD("SERVICE_RANK_NAME"); return this; }

    protected var _servicePointIncidence: ConditionValue = null;
    def getServicePointIncidence(): ConditionValue =
    { if (_servicePointIncidence == null) { _servicePointIncidence = nCV(); }
      return _servicePointIncidence; }
    protected def getCValueServicePointIncidence(): ConditionValue = { return getServicePointIncidence(); }

    /** 
     * Add order-by as ascend. <br />
     * (サービスポイント発生率)SERVICE_POINT_INCIDENCE: {NotNull, DECIMAL(5, 3)}
     * @return this. (NotNull)
     */
    def addOrderBy_ServicePointIncidence_Asc(): BsServiceRankCQ = { regOBA("SERVICE_POINT_INCIDENCE"); return this; }

    /**
     * Add order-by as descend. <br />
     * (サービスポイント発生率)SERVICE_POINT_INCIDENCE: {NotNull, DECIMAL(5, 3)}
     * @return this. (NotNull)
     */
    def addOrderBy_ServicePointIncidence_Desc(): BsServiceRankCQ = { regOBD("SERVICE_POINT_INCIDENCE"); return this; }

    protected var _newAcceptableFlg: ConditionValue = null;
    def getNewAcceptableFlg(): ConditionValue =
    { if (_newAcceptableFlg == null) { _newAcceptableFlg = nCV(); }
      return _newAcceptableFlg; }
    protected def getCValueNewAcceptableFlg(): ConditionValue = { return getNewAcceptableFlg(); }

    /** 
     * Add order-by as ascend. <br />
     * (新規受け入れ可能フラグ)NEW_ACCEPTABLE_FLG: {NotNull, INTEGER(10), classification=Flg}
     * @return this. (NotNull)
     */
    def addOrderBy_NewAcceptableFlg_Asc(): BsServiceRankCQ = { regOBA("NEW_ACCEPTABLE_FLG"); return this; }

    /**
     * Add order-by as descend. <br />
     * (新規受け入れ可能フラグ)NEW_ACCEPTABLE_FLG: {NotNull, INTEGER(10), classification=Flg}
     * @return this. (NotNull)
     */
    def addOrderBy_NewAcceptableFlg_Desc(): BsServiceRankCQ = { regOBD("NEW_ACCEPTABLE_FLG"); return this; }

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
    def addOrderBy_DisplayOrder_Asc(): BsServiceRankCQ = { regOBA("DISPLAY_ORDER"); return this; }

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
    def addSpecifiedDerivedOrderBy_Asc(aliasName: String): BsServiceRankCQ = { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    def addSpecifiedDerivedOrderBy_Desc(aliasName: String): BsServiceRankCQ = { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    def getScalarCondition(): Map[String, ServiceRankCQ] = { xgetSQueMap("scalarCondition") }
    def keepScalarCondition(sq: ServiceRankCQ): String = { xkeepSQue("scalarCondition", sq) }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    def getSpecifyMyselfDerived(): Map[String, ServiceRankCQ] = { xgetSQueMap("specifyMyselfDerived") }
    def keepSpecifyMyselfDerived(sq: ServiceRankCQ): String = { xkeepSQue("specifyMyselfDerived", sq) }

    def getQueryMyselfDerived(): Map[String, ServiceRankCQ] = { xgetSQueMap("queryMyselfDerived") }
    def keepQueryMyselfDerived(sq: ServiceRankCQ): String = { xkeepSQue("queryMyselfDerived", sq) }
    def getQueryMyselfDerivedParameter(): Map[String, Object] = { xgetSQuePmMap("qyeryMyselfDerived") }
    def keepQueryMyselfDerivedParameter(pm: Object): String = { xkeepSQuePm("qyeryMyselfDerived", pm) }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    def getMyselfExists(): Map[String, ServiceRankCQ] = { xgetSQueMap("myselfExists") }
    def keepMyselfExists(sq: ServiceRankCQ): String = { xkeepSQue("myselfExists", sq) }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    def getMyselfInScope(): Map[String, ServiceRankCQ] = { xgetSQueMap("myselfInScope") }
    def keepMyselfInScope(sq: ServiceRankCQ): String = { xkeepSQue("myselfInScope", sq) }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected def xCB(): String = { return classOf[ServiceRankCB].getName(); }
    protected def xCQ(): String = { return classOf[ServiceRankCQ].getName(); }
    protected def xCHp(): String = { return classOf[HpCalculator].getName(); }
    protected def xCOp(): String = { return classOf[ConditionOption].getName(); }
    protected def xMap(): String = { return classOf[Map[_, _]].getName(); }
}
