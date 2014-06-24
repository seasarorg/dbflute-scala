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
 * The base condition-query of VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF.
 * @author DBFlute(AutoGenerator)
 */
class BsVendorTheLongAndWindingTableAndColumnRefCQ(referrerQuery: ConditionQuery, sqlClause: SqlClause, aliasName: String, nestLevel: Integer) extends AbstractBsVendorTheLongAndWindingTableAndColumnRefCQ(referrerQuery, sqlClause, aliasName, nestLevel) {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected var _inlineQuery: VendorTheLongAndWindingTableAndColumnRefCIQ = null;

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    def inline(): VendorTheLongAndWindingTableAndColumnRefCIQ = {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected def xcreateCIQ(): VendorTheLongAndWindingTableAndColumnRefCIQ = {
        val ciq: VendorTheLongAndWindingTableAndColumnRefCIQ = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected def xnewCIQ(): VendorTheLongAndWindingTableAndColumnRefCIQ = {
        return new VendorTheLongAndWindingTableAndColumnRefCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    def on(): VendorTheLongAndWindingTableAndColumnRefCIQ = {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        val inlineQuery: VendorTheLongAndWindingTableAndColumnRefCIQ = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected var _theLongAndWindingTableAndColumnRefId: ConditionValue = null;
    def getTheLongAndWindingTableAndColumnRefId(): ConditionValue =
    { if (_theLongAndWindingTableAndColumnRefId == null) { _theLongAndWindingTableAndColumnRefId = nCV(); }
      return _theLongAndWindingTableAndColumnRefId; }
    protected def getCValueTheLongAndWindingTableAndColumnRefId(): ConditionValue = { return getTheLongAndWindingTableAndColumnRefId(); }

    /** 
     * Add order-by as ascend. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_ID: {PK, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    def addOrderBy_TheLongAndWindingTableAndColumnRefId_Asc(): BsVendorTheLongAndWindingTableAndColumnRefCQ = { regOBA("THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_ID: {PK, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    def addOrderBy_TheLongAndWindingTableAndColumnRefId_Desc(): BsVendorTheLongAndWindingTableAndColumnRefCQ = { regOBD("THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_ID"); return this; }

    protected var _theLongAndWindingTableAndColumnId: ConditionValue = null;
    def getTheLongAndWindingTableAndColumnId(): ConditionValue =
    { if (_theLongAndWindingTableAndColumnId == null) { _theLongAndWindingTableAndColumnId = nCV(); }
      return _theLongAndWindingTableAndColumnId; }
    protected def getCValueTheLongAndWindingTableAndColumnId(): ConditionValue = { return getTheLongAndWindingTableAndColumnId(); }

    /** 
     * Add order-by as ascend. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID: {IX, NotNull, BIGINT(19), FK to VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN}
     * @return this. (NotNull)
     */
    def addOrderBy_TheLongAndWindingTableAndColumnId_Asc(): BsVendorTheLongAndWindingTableAndColumnRefCQ = { regOBA("THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID: {IX, NotNull, BIGINT(19), FK to VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN}
     * @return this. (NotNull)
     */
    def addOrderBy_TheLongAndWindingTableAndColumnId_Desc(): BsVendorTheLongAndWindingTableAndColumnRefCQ = { regOBD("THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID"); return this; }

    protected var _theLongAndWindingTableAndColumnRefDate: ConditionValue = null;
    def getTheLongAndWindingTableAndColumnRefDate(): ConditionValue =
    { if (_theLongAndWindingTableAndColumnRefDate == null) { _theLongAndWindingTableAndColumnRefDate = nCV(); }
      return _theLongAndWindingTableAndColumnRefDate; }
    protected def getCValueTheLongAndWindingTableAndColumnRefDate(): ConditionValue = { return getTheLongAndWindingTableAndColumnRefDate(); }

    /** 
     * Add order-by as ascend. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_DATE: {NotNull, DATE(8)}
     * @return this. (NotNull)
     */
    def addOrderBy_TheLongAndWindingTableAndColumnRefDate_Asc(): BsVendorTheLongAndWindingTableAndColumnRefCQ = { regOBA("THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_DATE"); return this; }

    /**
     * Add order-by as descend. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_DATE: {NotNull, DATE(8)}
     * @return this. (NotNull)
     */
    def addOrderBy_TheLongAndWindingTableAndColumnRefDate_Desc(): BsVendorTheLongAndWindingTableAndColumnRefCQ = { regOBD("THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_DATE"); return this; }

    protected var _shortDate: ConditionValue = null;
    def getShortDate(): ConditionValue =
    { if (_shortDate == null) { _shortDate = nCV(); }
      return _shortDate; }
    protected def getCValueShortDate(): ConditionValue = { return getShortDate(); }

    /** 
     * Add order-by as ascend. <br />
     * SHORT_DATE: {NotNull, DATE(8)}
     * @return this. (NotNull)
     */
    def addOrderBy_ShortDate_Asc(): BsVendorTheLongAndWindingTableAndColumnRefCQ = { regOBA("SHORT_DATE"); return this; }

    /**
     * Add order-by as descend. <br />
     * SHORT_DATE: {NotNull, DATE(8)}
     * @return this. (NotNull)
     */
    def addOrderBy_ShortDate_Desc(): BsVendorTheLongAndWindingTableAndColumnRefCQ = { regOBD("SHORT_DATE"); return this; }

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
    def addSpecifiedDerivedOrderBy_Asc(aliasName: String): BsVendorTheLongAndWindingTableAndColumnRefCQ = { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    def addSpecifiedDerivedOrderBy_Desc(aliasName: String): BsVendorTheLongAndWindingTableAndColumnRefCQ = { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    def reflectRelationOnUnionQuery(bqs: ConditionQuery, uqs: ConditionQuery): Unit = {
        val bq: VendorTheLongAndWindingTableAndColumnRefCQ = bqs.asInstanceOf[VendorTheLongAndWindingTableAndColumnRefCQ];
        val uq: VendorTheLongAndWindingTableAndColumnRefCQ = uqs.asInstanceOf[VendorTheLongAndWindingTableAndColumnRefCQ];
        if (bq.hasConditionQueryVendorTheLongAndWindingTableAndColumn()) {
            uq.queryVendorTheLongAndWindingTableAndColumn().reflectRelationOnUnionQuery(bq.queryVendorTheLongAndWindingTableAndColumn(), uq.queryVendorTheLongAndWindingTableAndColumn());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN by my THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID, named 'vendorTheLongAndWindingTableAndColumn'.
     * @return The instance of condition-query. (NotNull)
     */
    def queryVendorTheLongAndWindingTableAndColumn(): VendorTheLongAndWindingTableAndColumnCQ = {
        return getConditionQueryVendorTheLongAndWindingTableAndColumn();
    }
    def getConditionQueryVendorTheLongAndWindingTableAndColumn(): VendorTheLongAndWindingTableAndColumnCQ = {
        val prop = "vendorTheLongAndWindingTableAndColumn";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryVendorTheLongAndWindingTableAndColumn()); xsetupOuterJoinVendorTheLongAndWindingTableAndColumn(); }
        return xgetQueRlMap(prop);
    }
    protected def xcreateQueryVendorTheLongAndWindingTableAndColumn(): VendorTheLongAndWindingTableAndColumnCQ = {
        val nrp = xresolveNRP("VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF",  "vendorTheLongAndWindingTableAndColumn"); val jan = xresolveJAN(nrp,  xgetNNLvl());
        return xinitRelCQ(new VendorTheLongAndWindingTableAndColumnCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "vendorTheLongAndWindingTableAndColumn", nrp);
    }
    protected def xsetupOuterJoinVendorTheLongAndWindingTableAndColumn(): Unit = { xregOutJo("vendorTheLongAndWindingTableAndColumn") }
    def hasConditionQueryVendorTheLongAndWindingTableAndColumn(): Boolean = { xhasQueRlMap("vendorTheLongAndWindingTableAndColumn") }

    protected def xfindFixedConditionDynamicParameterMap(property: String): Map[String, Object] = {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    def getScalarCondition(): Map[String, VendorTheLongAndWindingTableAndColumnRefCQ] = { xgetSQueMap("scalarCondition") }
    def keepScalarCondition(sq: VendorTheLongAndWindingTableAndColumnRefCQ): String = { xkeepSQue("scalarCondition", sq) }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    def getSpecifyMyselfDerived(): Map[String, VendorTheLongAndWindingTableAndColumnRefCQ] = { xgetSQueMap("specifyMyselfDerived") }
    def keepSpecifyMyselfDerived(sq: VendorTheLongAndWindingTableAndColumnRefCQ): String = { xkeepSQue("specifyMyselfDerived", sq) }

    def getQueryMyselfDerived(): Map[String, VendorTheLongAndWindingTableAndColumnRefCQ] = { xgetSQueMap("queryMyselfDerived") }
    def keepQueryMyselfDerived(sq: VendorTheLongAndWindingTableAndColumnRefCQ): String = { xkeepSQue("queryMyselfDerived", sq) }
    def getQueryMyselfDerivedParameter(): Map[String, Object] = { xgetSQuePmMap("qyeryMyselfDerived") }
    def keepQueryMyselfDerivedParameter(pm: Object): String = { xkeepSQuePm("qyeryMyselfDerived", pm) }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    def getMyselfExists(): Map[String, VendorTheLongAndWindingTableAndColumnRefCQ] = { xgetSQueMap("myselfExists") }
    def keepMyselfExists(sq: VendorTheLongAndWindingTableAndColumnRefCQ): String = { xkeepSQue("myselfExists", sq) }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    def getMyselfInScope(): Map[String, VendorTheLongAndWindingTableAndColumnRefCQ] = { xgetSQueMap("myselfInScope") }
    def keepMyselfInScope(sq: VendorTheLongAndWindingTableAndColumnRefCQ): String = { xkeepSQue("myselfInScope", sq) }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected def xCB(): String = { return classOf[VendorTheLongAndWindingTableAndColumnRefCB].getName(); }
    protected def xCQ(): String = { return classOf[VendorTheLongAndWindingTableAndColumnRefCQ].getName(); }
    protected def xCHp(): String = { return classOf[HpCalculator].getName(); }
    protected def xCOp(): String = { return classOf[ConditionOption].getName(); }
    protected def xMap(): String = { return classOf[Map[_, _]].getName(); }
}
