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
    def getMemberStatusCode(): ConditionValue = {
        if (_memberStatusCode == null) { _memberStatusCode = nCV(); }
        return _memberStatusCode;
    }
    protected def getCValueMemberStatusCode(): ConditionValue = { return getMemberStatusCode(); }

    protected var _memberStatusCode_ExistsReferrer_MemberListMap: Map[String, MemberCQ] = null;
    def getMemberStatusCode_ExistsReferrer_MemberList(): Map[String, MemberCQ] = { return _memberStatusCode_ExistsReferrer_MemberListMap; }
    def keepMemberStatusCode_ExistsReferrer_MemberList(sq: MemberCQ): String = {
        if (_memberStatusCode_ExistsReferrer_MemberListMap == null) { _memberStatusCode_ExistsReferrer_MemberListMap = newLinkedHashMapSized(4); }
        val ky: String = "subQueryMapKey" + (_memberStatusCode_ExistsReferrer_MemberListMap.size() + 1);
        _memberStatusCode_ExistsReferrer_MemberListMap.put(ky, sq); return "memberStatusCode_ExistsReferrer_MemberList." + ky;
    }

    protected var _memberStatusCode_NotExistsReferrer_MemberListMap: Map[String, MemberCQ] = null;
    def getMemberStatusCode_NotExistsReferrer_MemberList(): Map[String, MemberCQ] = { return _memberStatusCode_NotExistsReferrer_MemberListMap; }
    def keepMemberStatusCode_NotExistsReferrer_MemberList(sq: MemberCQ): String = {
        if (_memberStatusCode_NotExistsReferrer_MemberListMap == null) { _memberStatusCode_NotExistsReferrer_MemberListMap = newLinkedHashMapSized(4); }
        val ky: String = "subQueryMapKey" + (_memberStatusCode_NotExistsReferrer_MemberListMap.size() + 1);
        _memberStatusCode_NotExistsReferrer_MemberListMap.put(ky, sq); return "memberStatusCode_NotExistsReferrer_MemberList." + ky;
    }

    protected var _memberStatusCode_InScopeRelation_MemberListMap: Map[String, MemberCQ] = null;
    def getMemberStatusCode_InScopeRelation_MemberList(): Map[String, MemberCQ] = { return _memberStatusCode_InScopeRelation_MemberListMap; }
    def keepMemberStatusCode_InScopeRelation_MemberList(sq: MemberCQ): String = {
        if (_memberStatusCode_InScopeRelation_MemberListMap == null) { _memberStatusCode_InScopeRelation_MemberListMap = newLinkedHashMapSized(4); }
        val ky: String = "subQueryMapKey" + (_memberStatusCode_InScopeRelation_MemberListMap.size() + 1);
        _memberStatusCode_InScopeRelation_MemberListMap.put(ky, sq); return "memberStatusCode_InScopeRelation_MemberList." + ky;
    }

    protected var _memberStatusCode_NotInScopeRelation_MemberListMap: Map[String, MemberCQ] = null;
    def getMemberStatusCode_NotInScopeRelation_MemberList(): Map[String, MemberCQ] = { return _memberStatusCode_NotInScopeRelation_MemberListMap; }
    def keepMemberStatusCode_NotInScopeRelation_MemberList(sq: MemberCQ): String = {
        if (_memberStatusCode_NotInScopeRelation_MemberListMap == null) { _memberStatusCode_NotInScopeRelation_MemberListMap = newLinkedHashMapSized(4); }
        val ky: String = "subQueryMapKey" + (_memberStatusCode_NotInScopeRelation_MemberListMap.size() + 1);
        _memberStatusCode_NotInScopeRelation_MemberListMap.put(ky, sq); return "memberStatusCode_NotInScopeRelation_MemberList." + ky;
    }

    protected var _memberStatusCode_SpecifyDerivedReferrer_MemberListMap: Map[String, MemberCQ] = null;
    def getMemberStatusCode_SpecifyDerivedReferrer_MemberList(): Map[String, MemberCQ] = { return _memberStatusCode_SpecifyDerivedReferrer_MemberListMap; }
    def keepMemberStatusCode_SpecifyDerivedReferrer_MemberList(sq: MemberCQ): String = {
        if (_memberStatusCode_SpecifyDerivedReferrer_MemberListMap == null) { _memberStatusCode_SpecifyDerivedReferrer_MemberListMap = newLinkedHashMapSized(4); }
        val ky: String = "subQueryMapKey" + (_memberStatusCode_SpecifyDerivedReferrer_MemberListMap.size() + 1);
        _memberStatusCode_SpecifyDerivedReferrer_MemberListMap.put(ky, sq); return "memberStatusCode_SpecifyDerivedReferrer_MemberList." + ky;
    }

    protected var _memberStatusCode_QueryDerivedReferrer_MemberListMap: Map[String, MemberCQ] = null;
    def getMemberStatusCode_QueryDerivedReferrer_MemberList(): Map[String, MemberCQ] = { return _memberStatusCode_QueryDerivedReferrer_MemberListMap; }
    def keepMemberStatusCode_QueryDerivedReferrer_MemberList(sq: MemberCQ): String = {
        if (_memberStatusCode_QueryDerivedReferrer_MemberListMap == null) { _memberStatusCode_QueryDerivedReferrer_MemberListMap = newLinkedHashMapSized(4); }
        val ky: String = "subQueryMapKey" + (_memberStatusCode_QueryDerivedReferrer_MemberListMap.size() + 1);
        _memberStatusCode_QueryDerivedReferrer_MemberListMap.put(ky, sq); return "memberStatusCode_QueryDerivedReferrer_MemberList." + ky;
    }
    protected var _memberStatusCode_QueryDerivedReferrer_MemberListParameterMap: Map[String, Object] = null;
    def getMemberStatusCode_QueryDerivedReferrer_MemberListParameter(): Map[String, Object] = { return _memberStatusCode_QueryDerivedReferrer_MemberListParameterMap; }
    def keepMemberStatusCode_QueryDerivedReferrer_MemberListParameter(vl: Object): String = {
        if (_memberStatusCode_QueryDerivedReferrer_MemberListParameterMap == null) { _memberStatusCode_QueryDerivedReferrer_MemberListParameterMap = newLinkedHashMapSized(4); }
        val ky: String = "subQueryParameterKey" + (_memberStatusCode_QueryDerivedReferrer_MemberListParameterMap.size() + 1);
        _memberStatusCode_QueryDerivedReferrer_MemberListParameterMap.put(ky, vl); return "memberStatusCode_QueryDerivedReferrer_MemberListParameter." + ky;
    }

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
    def getMemberStatusName(): ConditionValue = {
        if (_memberStatusName == null) { _memberStatusName = nCV(); }
        return _memberStatusName;
    }
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
    def addSpecifiedDerivedOrderBy_Asc(aliasName: String): BsMemberStatusCQ =
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
    def addSpecifiedDerivedOrderBy_Desc(aliasName: String): BsMemberStatusCQ =
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
    protected var _scalarConditionMap: Map[String, MemberStatusCQ] = null;
    def getScalarCondition(): Map[String, MemberStatusCQ] = { return _scalarConditionMap; }
    def keepScalarCondition(sq: MemberStatusCQ): String = {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        val ky: String = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(ky, sq); return "scalarCondition." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected var _specifyMyselfDerivedMap: Map[String, MemberStatusCQ] = null;
    def getSpecifyMyselfDerived(): Map[String, MemberStatusCQ] = { return _specifyMyselfDerivedMap; }
    def keepSpecifyMyselfDerived(sq: MemberStatusCQ): String = {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        val ky: String = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(ky, sq); return "specifyMyselfDerived." + ky;
    }

    protected var _queryMyselfDerivedMap: Map[String, MemberStatusCQ] = null;
    def getQueryMyselfDerived(): Map[String, MemberStatusCQ] = { return _queryMyselfDerivedMap; }
    def keepQueryMyselfDerived(sq: MemberStatusCQ): String = {
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
    protected var _myselfExistsMap: Map[String, MemberStatusCQ] = null;
    def getMyselfExists(): Map[String, MemberStatusCQ] = { return _myselfExistsMap; }
    def keepMyselfExists(sq: MemberStatusCQ): String = {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        val ky: String = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(ky, sq); return "myselfExists." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected var _myselfInScopeMap: Map[String, MemberStatusCQ] = null;
    def getMyselfInScope(): Map[String, MemberStatusCQ] = { return _myselfInScopeMap; }
    def keepMyselfInScope(sq: MemberStatusCQ): String = {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        val ky: String = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(ky, sq); return "myselfInScope." + ky;
    }

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
