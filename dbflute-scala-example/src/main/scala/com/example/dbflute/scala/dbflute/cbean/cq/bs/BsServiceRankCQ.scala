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
    def getServiceRankCode(): ConditionValue = {
        if (_serviceRankCode == null) { _serviceRankCode = nCV(); }
        return _serviceRankCode;
    }
    protected def getCValueServiceRankCode(): ConditionValue = { return getServiceRankCode(); }

    protected var _serviceRankCode_ExistsReferrer_MemberServiceListMap: Map[String, MemberServiceCQ] = null;
    def getServiceRankCode_ExistsReferrer_MemberServiceList(): Map[String, MemberServiceCQ] = { return _serviceRankCode_ExistsReferrer_MemberServiceListMap; }
    def keepServiceRankCode_ExistsReferrer_MemberServiceList(sq: MemberServiceCQ): String = {
        if (_serviceRankCode_ExistsReferrer_MemberServiceListMap == null) { _serviceRankCode_ExistsReferrer_MemberServiceListMap = newLinkedHashMapSized(4); }
        val ky: String = "subQueryMapKey" + (_serviceRankCode_ExistsReferrer_MemberServiceListMap.size() + 1);
        _serviceRankCode_ExistsReferrer_MemberServiceListMap.put(ky, sq); return "serviceRankCode_ExistsReferrer_MemberServiceList." + ky;
    }

    protected var _serviceRankCode_NotExistsReferrer_MemberServiceListMap: Map[String, MemberServiceCQ] = null;
    def getServiceRankCode_NotExistsReferrer_MemberServiceList(): Map[String, MemberServiceCQ] = { return _serviceRankCode_NotExistsReferrer_MemberServiceListMap; }
    def keepServiceRankCode_NotExistsReferrer_MemberServiceList(sq: MemberServiceCQ): String = {
        if (_serviceRankCode_NotExistsReferrer_MemberServiceListMap == null) { _serviceRankCode_NotExistsReferrer_MemberServiceListMap = newLinkedHashMapSized(4); }
        val ky: String = "subQueryMapKey" + (_serviceRankCode_NotExistsReferrer_MemberServiceListMap.size() + 1);
        _serviceRankCode_NotExistsReferrer_MemberServiceListMap.put(ky, sq); return "serviceRankCode_NotExistsReferrer_MemberServiceList." + ky;
    }

    protected var _serviceRankCode_InScopeRelation_MemberServiceListMap: Map[String, MemberServiceCQ] = null;
    def getServiceRankCode_InScopeRelation_MemberServiceList(): Map[String, MemberServiceCQ] = { return _serviceRankCode_InScopeRelation_MemberServiceListMap; }
    def keepServiceRankCode_InScopeRelation_MemberServiceList(sq: MemberServiceCQ): String = {
        if (_serviceRankCode_InScopeRelation_MemberServiceListMap == null) { _serviceRankCode_InScopeRelation_MemberServiceListMap = newLinkedHashMapSized(4); }
        val ky: String = "subQueryMapKey" + (_serviceRankCode_InScopeRelation_MemberServiceListMap.size() + 1);
        _serviceRankCode_InScopeRelation_MemberServiceListMap.put(ky, sq); return "serviceRankCode_InScopeRelation_MemberServiceList." + ky;
    }

    protected var _serviceRankCode_NotInScopeRelation_MemberServiceListMap: Map[String, MemberServiceCQ] = null;
    def getServiceRankCode_NotInScopeRelation_MemberServiceList(): Map[String, MemberServiceCQ] = { return _serviceRankCode_NotInScopeRelation_MemberServiceListMap; }
    def keepServiceRankCode_NotInScopeRelation_MemberServiceList(sq: MemberServiceCQ): String = {
        if (_serviceRankCode_NotInScopeRelation_MemberServiceListMap == null) { _serviceRankCode_NotInScopeRelation_MemberServiceListMap = newLinkedHashMapSized(4); }
        val ky: String = "subQueryMapKey" + (_serviceRankCode_NotInScopeRelation_MemberServiceListMap.size() + 1);
        _serviceRankCode_NotInScopeRelation_MemberServiceListMap.put(ky, sq); return "serviceRankCode_NotInScopeRelation_MemberServiceList." + ky;
    }

    protected var _serviceRankCode_SpecifyDerivedReferrer_MemberServiceListMap: Map[String, MemberServiceCQ] = null;
    def getServiceRankCode_SpecifyDerivedReferrer_MemberServiceList(): Map[String, MemberServiceCQ] = { return _serviceRankCode_SpecifyDerivedReferrer_MemberServiceListMap; }
    def keepServiceRankCode_SpecifyDerivedReferrer_MemberServiceList(sq: MemberServiceCQ): String = {
        if (_serviceRankCode_SpecifyDerivedReferrer_MemberServiceListMap == null) { _serviceRankCode_SpecifyDerivedReferrer_MemberServiceListMap = newLinkedHashMapSized(4); }
        val ky: String = "subQueryMapKey" + (_serviceRankCode_SpecifyDerivedReferrer_MemberServiceListMap.size() + 1);
        _serviceRankCode_SpecifyDerivedReferrer_MemberServiceListMap.put(ky, sq); return "serviceRankCode_SpecifyDerivedReferrer_MemberServiceList." + ky;
    }

    protected var _serviceRankCode_QueryDerivedReferrer_MemberServiceListMap: Map[String, MemberServiceCQ] = null;
    def getServiceRankCode_QueryDerivedReferrer_MemberServiceList(): Map[String, MemberServiceCQ] = { return _serviceRankCode_QueryDerivedReferrer_MemberServiceListMap; }
    def keepServiceRankCode_QueryDerivedReferrer_MemberServiceList(sq: MemberServiceCQ): String = {
        if (_serviceRankCode_QueryDerivedReferrer_MemberServiceListMap == null) { _serviceRankCode_QueryDerivedReferrer_MemberServiceListMap = newLinkedHashMapSized(4); }
        val ky: String = "subQueryMapKey" + (_serviceRankCode_QueryDerivedReferrer_MemberServiceListMap.size() + 1);
        _serviceRankCode_QueryDerivedReferrer_MemberServiceListMap.put(ky, sq); return "serviceRankCode_QueryDerivedReferrer_MemberServiceList." + ky;
    }
    protected var _serviceRankCode_QueryDerivedReferrer_MemberServiceListParameterMap: Map[String, Object] = null;
    def getServiceRankCode_QueryDerivedReferrer_MemberServiceListParameter(): Map[String, Object] = { return _serviceRankCode_QueryDerivedReferrer_MemberServiceListParameterMap; }
    def keepServiceRankCode_QueryDerivedReferrer_MemberServiceListParameter(vl: Object): String = {
        if (_serviceRankCode_QueryDerivedReferrer_MemberServiceListParameterMap == null) { _serviceRankCode_QueryDerivedReferrer_MemberServiceListParameterMap = newLinkedHashMapSized(4); }
        val ky: String = "subQueryParameterKey" + (_serviceRankCode_QueryDerivedReferrer_MemberServiceListParameterMap.size() + 1);
        _serviceRankCode_QueryDerivedReferrer_MemberServiceListParameterMap.put(ky, vl); return "serviceRankCode_QueryDerivedReferrer_MemberServiceListParameter." + ky;
    }

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
    def getServiceRankName(): ConditionValue = {
        if (_serviceRankName == null) { _serviceRankName = nCV(); }
        return _serviceRankName;
    }
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
    def getServicePointIncidence(): ConditionValue = {
        if (_servicePointIncidence == null) { _servicePointIncidence = nCV(); }
        return _servicePointIncidence;
    }
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
    def getNewAcceptableFlg(): ConditionValue = {
        if (_newAcceptableFlg == null) { _newAcceptableFlg = nCV(); }
        return _newAcceptableFlg;
    }
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
    def getDescription(): ConditionValue = {
        if (_description == null) { _description = nCV(); }
        return _description;
    }
    protected def getCValueDescription(): ConditionValue = { return getDescription(); }

    protected var _displayOrder: ConditionValue = null;
    def getDisplayOrder(): ConditionValue = {
        if (_displayOrder == null) { _displayOrder = nCV(); }
        return _displayOrder;
    }
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
    def addSpecifiedDerivedOrderBy_Asc(aliasName: String): BsServiceRankCQ =
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
    def addSpecifiedDerivedOrderBy_Desc(aliasName: String): BsServiceRankCQ =
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    protected var _scalarConditionMap: Map[String, ServiceRankCQ] = null;
    def getScalarCondition(): Map[String, ServiceRankCQ] = { return _scalarConditionMap; }
    def keepScalarCondition(sq: ServiceRankCQ): String = {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        val ky: String = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(ky, sq); return "scalarCondition." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected var _specifyMyselfDerivedMap: Map[String, ServiceRankCQ] = null;
    def getSpecifyMyselfDerived(): Map[String, ServiceRankCQ] = { return _specifyMyselfDerivedMap; }
    def keepSpecifyMyselfDerived(sq: ServiceRankCQ): String = {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        val ky: String = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(ky, sq); return "specifyMyselfDerived." + ky;
    }

    protected var _queryMyselfDerivedMap: Map[String, ServiceRankCQ] = null;
    def getQueryMyselfDerived(): Map[String, ServiceRankCQ] = { return _queryMyselfDerivedMap; }
    def keepQueryMyselfDerived(sq: ServiceRankCQ): String = {
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
    protected var _myselfExistsMap: Map[String, ServiceRankCQ] = null;
    def getMyselfExists(): Map[String, ServiceRankCQ] = { return _myselfExistsMap; }
    def keepMyselfExists(sq: ServiceRankCQ): String = {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        val ky: String = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(ky, sq); return "myselfExists." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected var _myselfInScopeMap: Map[String, ServiceRankCQ] = null;
    def getMyselfInScope(): Map[String, ServiceRankCQ] = { return _myselfInScopeMap; }
    def keepMyselfInScope(sq: ServiceRankCQ): String = {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        val ky: String = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(ky, sq); return "myselfInScope." + ky;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected def xCB(): String = { return classOf[ServiceRankCB].getName(); }
    protected def xCQ(): String = { return classOf[ServiceRankCQ].getName(); }
    protected def xMap(): String = { return classOf[Map[_, _]].getName(); }
}
