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
 * The base condition-query of VENDOR_$_DOLLAR.
 * @author DBFlute(AutoGenerator)
 */
class BsVendor$DollarCQ(referrerQuery: ConditionQuery, sqlClause: SqlClause, aliasName: String, nestLevel: Integer) extends AbstractBsVendor$DollarCQ(referrerQuery, sqlClause, aliasName, nestLevel) {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected var _inlineQuery: Vendor$DollarCIQ = null;

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from VENDOR_$_DOLLAR) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    def inline(): Vendor$DollarCIQ = {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected def xcreateCIQ(): Vendor$DollarCIQ = {
        val ciq: Vendor$DollarCIQ = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected def xnewCIQ(): Vendor$DollarCIQ = {
        return new Vendor$DollarCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join VENDOR_$_DOLLAR on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    def on(): Vendor$DollarCIQ = {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        val inlineQuery: Vendor$DollarCIQ = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected var _vendor$DollarId: ConditionValue = null;
    def getVendor$DollarId(): ConditionValue =
    { if (_vendor$DollarId == null) { _vendor$DollarId = nCV(); }
      return _vendor$DollarId; }
    protected def getCValueVendor$DollarId(): ConditionValue = { return getVendor$DollarId(); }

    /** 
     * Add order-by as ascend. <br />
     * VENDOR_$_DOLLAR_ID: {PK, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    def addOrderBy_Vendor$DollarId_Asc(): BsVendor$DollarCQ = { regOBA("VENDOR_$_DOLLAR_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * VENDOR_$_DOLLAR_ID: {PK, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    def addOrderBy_Vendor$DollarId_Desc(): BsVendor$DollarCQ = { regOBD("VENDOR_$_DOLLAR_ID"); return this; }

    protected var _vendor$DollarName: ConditionValue = null;
    def getVendor$DollarName(): ConditionValue =
    { if (_vendor$DollarName == null) { _vendor$DollarName = nCV(); }
      return _vendor$DollarName; }
    protected def getCValueVendor$DollarName(): ConditionValue = { return getVendor$DollarName(); }

    /** 
     * Add order-by as ascend. <br />
     * VENDOR_$_DOLLAR_NAME: {VARCHAR(32)}
     * @return this. (NotNull)
     */
    def addOrderBy_Vendor$DollarName_Asc(): BsVendor$DollarCQ = { regOBA("VENDOR_$_DOLLAR_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * VENDOR_$_DOLLAR_NAME: {VARCHAR(32)}
     * @return this. (NotNull)
     */
    def addOrderBy_Vendor$DollarName_Desc(): BsVendor$DollarCQ = { regOBD("VENDOR_$_DOLLAR_NAME"); return this; }

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
    def addSpecifiedDerivedOrderBy_Asc(aliasName: String): BsVendor$DollarCQ = { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    def addSpecifiedDerivedOrderBy_Desc(aliasName: String): BsVendor$DollarCQ = { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    def getScalarCondition(): Map[String, Vendor$DollarCQ] = { xgetSQueMap("scalarCondition") }
    def keepScalarCondition(sq: Vendor$DollarCQ): String = { xkeepSQue("scalarCondition", sq) }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    def getSpecifyMyselfDerived(): Map[String, Vendor$DollarCQ] = { xgetSQueMap("specifyMyselfDerived") }
    def keepSpecifyMyselfDerived(sq: Vendor$DollarCQ): String = { xkeepSQue("specifyMyselfDerived", sq) }

    def getQueryMyselfDerived(): Map[String, Vendor$DollarCQ] = { xgetSQueMap("queryMyselfDerived") }
    def keepQueryMyselfDerived(sq: Vendor$DollarCQ): String = { xkeepSQue("queryMyselfDerived", sq) }
    def getQueryMyselfDerivedParameter(): Map[String, Object] = { xgetSQuePmMap("qyeryMyselfDerived") }
    def keepQueryMyselfDerivedParameter(pm: Object): String = { xkeepSQuePm("qyeryMyselfDerived", pm) }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    def getMyselfExists(): Map[String, Vendor$DollarCQ] = { xgetSQueMap("myselfExists") }
    def keepMyselfExists(sq: Vendor$DollarCQ): String = { xkeepSQue("myselfExists", sq) }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    def getMyselfInScope(): Map[String, Vendor$DollarCQ] = { xgetSQueMap("myselfInScope") }
    def keepMyselfInScope(sq: Vendor$DollarCQ): String = { xkeepSQue("myselfInScope", sq) }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected def xCB(): String = { return classOf[Vendor$DollarCB].getName(); }
    protected def xCQ(): String = { return classOf[Vendor$DollarCQ].getName(); }
    protected def xCHp(): String = { return classOf[HpCalculator].getName(); }
    protected def xCOp(): String = { return classOf[ConditionOption].getName(); }
    protected def xMap(): String = { return classOf[Map[_, _]].getName(); }
}
