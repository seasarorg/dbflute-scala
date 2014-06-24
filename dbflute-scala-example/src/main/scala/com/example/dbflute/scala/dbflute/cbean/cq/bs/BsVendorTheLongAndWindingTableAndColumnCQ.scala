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
 * The base condition-query of VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN.
 * @author DBFlute(AutoGenerator)
 */
class BsVendorTheLongAndWindingTableAndColumnCQ(referrerQuery: ConditionQuery, sqlClause: SqlClause, aliasName: String, nestLevel: Integer) extends AbstractBsVendorTheLongAndWindingTableAndColumnCQ(referrerQuery, sqlClause, aliasName, nestLevel) {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected var _inlineQuery: VendorTheLongAndWindingTableAndColumnCIQ = null;

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    def inline(): VendorTheLongAndWindingTableAndColumnCIQ = {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected def xcreateCIQ(): VendorTheLongAndWindingTableAndColumnCIQ = {
        val ciq: VendorTheLongAndWindingTableAndColumnCIQ = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected def xnewCIQ(): VendorTheLongAndWindingTableAndColumnCIQ = {
        return new VendorTheLongAndWindingTableAndColumnCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    def on(): VendorTheLongAndWindingTableAndColumnCIQ = {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        val inlineQuery: VendorTheLongAndWindingTableAndColumnCIQ = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected var _theLongAndWindingTableAndColumnId: ConditionValue = null;
    def getTheLongAndWindingTableAndColumnId(): ConditionValue =
    { if (_theLongAndWindingTableAndColumnId == null) { _theLongAndWindingTableAndColumnId = nCV(); }
      return _theLongAndWindingTableAndColumnId; }
    protected def getCValueTheLongAndWindingTableAndColumnId(): ConditionValue = { return getTheLongAndWindingTableAndColumnId(); }

    def getTheLongAndWindingTableAndColumnId_ExistsReferrer_VendorTheLongAndWindingTableAndColumnRefList(): Map[String, VendorTheLongAndWindingTableAndColumnRefCQ] = { xgetSQueMap("theLongAndWindingTableAndColumnId_ExistsReferrer_VendorTheLongAndWindingTableAndColumnRefList") }
    def keepTheLongAndWindingTableAndColumnId_ExistsReferrer_VendorTheLongAndWindingTableAndColumnRefList(sq: VendorTheLongAndWindingTableAndColumnRefCQ): String = { xkeepSQue("theLongAndWindingTableAndColumnId_ExistsReferrer_VendorTheLongAndWindingTableAndColumnRefList", sq) }

    def getTheLongAndWindingTableAndColumnId_NotExistsReferrer_VendorTheLongAndWindingTableAndColumnRefList(): Map[String, VendorTheLongAndWindingTableAndColumnRefCQ] = { xgetSQueMap("theLongAndWindingTableAndColumnId_NotExistsReferrer_VendorTheLongAndWindingTableAndColumnRefList") }
    def keepTheLongAndWindingTableAndColumnId_NotExistsReferrer_VendorTheLongAndWindingTableAndColumnRefList(sq: VendorTheLongAndWindingTableAndColumnRefCQ): String = { xkeepSQue("theLongAndWindingTableAndColumnId_NotExistsReferrer_VendorTheLongAndWindingTableAndColumnRefList", sq) }

    def getTheLongAndWindingTableAndColumnId_SpecifyDerivedReferrer_VendorTheLongAndWindingTableAndColumnRefList(): Map[String, VendorTheLongAndWindingTableAndColumnRefCQ] = { xgetSQueMap("theLongAndWindingTableAndColumnId_SpecifyDerivedReferrer_VendorTheLongAndWindingTableAndColumnRefList") }
    def keepTheLongAndWindingTableAndColumnId_SpecifyDerivedReferrer_VendorTheLongAndWindingTableAndColumnRefList(sq: VendorTheLongAndWindingTableAndColumnRefCQ): String = { xkeepSQue("theLongAndWindingTableAndColumnId_SpecifyDerivedReferrer_VendorTheLongAndWindingTableAndColumnRefList", sq) }

    def getTheLongAndWindingTableAndColumnId_InScopeRelation_VendorTheLongAndWindingTableAndColumnRefList(): Map[String, VendorTheLongAndWindingTableAndColumnRefCQ] = { xgetSQueMap("theLongAndWindingTableAndColumnId_InScopeRelation_VendorTheLongAndWindingTableAndColumnRefList") }
    def keepTheLongAndWindingTableAndColumnId_InScopeRelation_VendorTheLongAndWindingTableAndColumnRefList(sq: VendorTheLongAndWindingTableAndColumnRefCQ): String = { xkeepSQue("theLongAndWindingTableAndColumnId_InScopeRelation_VendorTheLongAndWindingTableAndColumnRefList", sq) }

    def getTheLongAndWindingTableAndColumnId_NotInScopeRelation_VendorTheLongAndWindingTableAndColumnRefList(): Map[String, VendorTheLongAndWindingTableAndColumnRefCQ] = { xgetSQueMap("theLongAndWindingTableAndColumnId_NotInScopeRelation_VendorTheLongAndWindingTableAndColumnRefList") }
    def keepTheLongAndWindingTableAndColumnId_NotInScopeRelation_VendorTheLongAndWindingTableAndColumnRefList(sq: VendorTheLongAndWindingTableAndColumnRefCQ): String = { xkeepSQue("theLongAndWindingTableAndColumnId_NotInScopeRelation_VendorTheLongAndWindingTableAndColumnRefList", sq) }

    def getTheLongAndWindingTableAndColumnId_QueryDerivedReferrer_VendorTheLongAndWindingTableAndColumnRefList(): Map[String, VendorTheLongAndWindingTableAndColumnRefCQ] = { xgetSQueMap("theLongAndWindingTableAndColumnId_QueryDerivedReferrer_VendorTheLongAndWindingTableAndColumnRefList") }
    def keepTheLongAndWindingTableAndColumnId_QueryDerivedReferrer_VendorTheLongAndWindingTableAndColumnRefList(sq: VendorTheLongAndWindingTableAndColumnRefCQ): String = { xkeepSQue("theLongAndWindingTableAndColumnId_QueryDerivedReferrer_VendorTheLongAndWindingTableAndColumnRefList", sq) }
    def getTheLongAndWindingTableAndColumnId_QueryDerivedReferrer_VendorTheLongAndWindingTableAndColumnRefListParameter(): Map[String, Object] = { xgetSQuePmMap("theLongAndWindingTableAndColumnId_QueryDerivedReferrer_VendorTheLongAndWindingTableAndColumnRefList") }
    def keepTheLongAndWindingTableAndColumnId_QueryDerivedReferrer_VendorTheLongAndWindingTableAndColumnRefListParameter(pm: Object): String = { xkeepSQuePm("theLongAndWindingTableAndColumnId_QueryDerivedReferrer_VendorTheLongAndWindingTableAndColumnRefList", pm) }

    /** 
     * Add order-by as ascend. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID: {PK, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    def addOrderBy_TheLongAndWindingTableAndColumnId_Asc(): BsVendorTheLongAndWindingTableAndColumnCQ = { regOBA("THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID: {PK, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    def addOrderBy_TheLongAndWindingTableAndColumnId_Desc(): BsVendorTheLongAndWindingTableAndColumnCQ = { regOBD("THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID"); return this; }

    protected var _theLongAndWindingTableAndColumnName: ConditionValue = null;
    def getTheLongAndWindingTableAndColumnName(): ConditionValue =
    { if (_theLongAndWindingTableAndColumnName == null) { _theLongAndWindingTableAndColumnName = nCV(); }
      return _theLongAndWindingTableAndColumnName; }
    protected def getCValueTheLongAndWindingTableAndColumnName(): ConditionValue = { return getTheLongAndWindingTableAndColumnName(); }

    /** 
     * Add order-by as ascend. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_NAME: {UQ, NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    def addOrderBy_TheLongAndWindingTableAndColumnName_Asc(): BsVendorTheLongAndWindingTableAndColumnCQ = { regOBA("THE_LONG_AND_WINDING_TABLE_AND_COLUMN_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_NAME: {UQ, NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    def addOrderBy_TheLongAndWindingTableAndColumnName_Desc(): BsVendorTheLongAndWindingTableAndColumnCQ = { regOBD("THE_LONG_AND_WINDING_TABLE_AND_COLUMN_NAME"); return this; }

    protected var _shortName: ConditionValue = null;
    def getShortName(): ConditionValue =
    { if (_shortName == null) { _shortName = nCV(); }
      return _shortName; }
    protected def getCValueShortName(): ConditionValue = { return getShortName(); }

    /** 
     * Add order-by as ascend. <br />
     * SHORT_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    def addOrderBy_ShortName_Asc(): BsVendorTheLongAndWindingTableAndColumnCQ = { regOBA("SHORT_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * SHORT_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    def addOrderBy_ShortName_Desc(): BsVendorTheLongAndWindingTableAndColumnCQ = { regOBD("SHORT_NAME"); return this; }

    protected var _shortSize: ConditionValue = null;
    def getShortSize(): ConditionValue =
    { if (_shortSize == null) { _shortSize = nCV(); }
      return _shortSize; }
    protected def getCValueShortSize(): ConditionValue = { return getShortSize(); }

    /** 
     * Add order-by as ascend. <br />
     * SHORT_SIZE: {NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    def addOrderBy_ShortSize_Asc(): BsVendorTheLongAndWindingTableAndColumnCQ = { regOBA("SHORT_SIZE"); return this; }

    /**
     * Add order-by as descend. <br />
     * SHORT_SIZE: {NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    def addOrderBy_ShortSize_Desc(): BsVendorTheLongAndWindingTableAndColumnCQ = { regOBD("SHORT_SIZE"); return this; }

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
    def addSpecifiedDerivedOrderBy_Asc(aliasName: String): BsVendorTheLongAndWindingTableAndColumnCQ = { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    def addSpecifiedDerivedOrderBy_Desc(aliasName: String): BsVendorTheLongAndWindingTableAndColumnCQ = { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    def getScalarCondition(): Map[String, VendorTheLongAndWindingTableAndColumnCQ] = { xgetSQueMap("scalarCondition") }
    def keepScalarCondition(sq: VendorTheLongAndWindingTableAndColumnCQ): String = { xkeepSQue("scalarCondition", sq) }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    def getSpecifyMyselfDerived(): Map[String, VendorTheLongAndWindingTableAndColumnCQ] = { xgetSQueMap("specifyMyselfDerived") }
    def keepSpecifyMyselfDerived(sq: VendorTheLongAndWindingTableAndColumnCQ): String = { xkeepSQue("specifyMyselfDerived", sq) }

    def getQueryMyselfDerived(): Map[String, VendorTheLongAndWindingTableAndColumnCQ] = { xgetSQueMap("queryMyselfDerived") }
    def keepQueryMyselfDerived(sq: VendorTheLongAndWindingTableAndColumnCQ): String = { xkeepSQue("queryMyselfDerived", sq) }
    def getQueryMyselfDerivedParameter(): Map[String, Object] = { xgetSQuePmMap("qyeryMyselfDerived") }
    def keepQueryMyselfDerivedParameter(pm: Object): String = { xkeepSQuePm("qyeryMyselfDerived", pm) }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    def getMyselfExists(): Map[String, VendorTheLongAndWindingTableAndColumnCQ] = { xgetSQueMap("myselfExists") }
    def keepMyselfExists(sq: VendorTheLongAndWindingTableAndColumnCQ): String = { xkeepSQue("myselfExists", sq) }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    def getMyselfInScope(): Map[String, VendorTheLongAndWindingTableAndColumnCQ] = { xgetSQueMap("myselfInScope") }
    def keepMyselfInScope(sq: VendorTheLongAndWindingTableAndColumnCQ): String = { xkeepSQue("myselfInScope", sq) }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected def xCB(): String = { return classOf[VendorTheLongAndWindingTableAndColumnCB].getName(); }
    protected def xCQ(): String = { return classOf[VendorTheLongAndWindingTableAndColumnCQ].getName(); }
    protected def xCHp(): String = { return classOf[HpCalculator].getName(); }
    protected def xCOp(): String = { return classOf[ConditionOption].getName(); }
    protected def xMap(): String = { return classOf[Map[_, _]].getName(); }
}
