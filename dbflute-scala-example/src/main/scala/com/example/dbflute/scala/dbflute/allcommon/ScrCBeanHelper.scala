package com.example.dbflute.scala.dbflute.allcommon;

import java.util.Date;

import org.seasar.dbflute.cbean.ConditionBean;
import org.seasar.dbflute.cbean.SpecifyQuery;
import org.seasar.dbflute.cbean.ckey.ConditionKey;
import org.seasar.dbflute.cbean._;
import org.seasar.dbflute.cbean.chelper._;
import org.seasar.dbflute.cbean.coption._;

/* _/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/ */
/* _/_/_/_/_/_/_/_/_/_/_/                                                                      _/_/_/_/_/_/_/_/_/_/_/ */
/* _/_/_/_/_/_/_/_/_/_/_/                                                                      _/_/_/_/_/_/_/_/_/_/_/ */
/* _/_/_/_/_/_/_/_/_/_/_/                                                                      _/_/_/_/_/_/_/_/_/_/_/ */
/* _/_/_/_/_/_/_/_/_/_/_/                             ColumnQuery                              _/_/_/_/_/_/_/_/_/_/_/ */
/* _/_/_/_/_/_/_/_/_/_/_/                                                                      _/_/_/_/_/_/_/_/_/_/_/ */
/* _/_/_/_/_/_/_/_/_/_/_/                                                                      _/_/_/_/_/_/_/_/_/_/_/ */
/* _/_/_/_/_/_/_/_/_/_/_/                                                                      _/_/_/_/_/_/_/_/_/_/_/ */
/* _/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/ */

/**
 * @param <CB> The type of condition-bean.
 * @author DBFlute(AutoGenerator)
 */
class ScrHpColQyOperand[CB <: ConditionBean](handler: HpColQyHandler[CB]) {

    // ===================================================================================
    //                                                                          Comparison
    //                                                                          ==========
    /**
     * Equal(=).
     * <pre>
     * <span style="color: #3F7E5E">// where FOO = BAR</span>
     * cb.<span style="color: #DD4747">columnQuery</span>(new SpecifyQuery&lt;MemberCB&gt;() {
     *     def void query(MemberCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFoo()</span>; <span style="color: #3F7E5E">// left column</span>
     *     }
     * }).<span style="color: #DD4747">equal</span>(new SpecifyQuery&lt;MemberCB&gt;() {
     *     def void query(MemberCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnBar()</span>; <span style="color: #3F7E5E">// right column</span>
     *     }
     * }); <span style="color: #3F7E5E">// you can calculate for right column like '}).plus(3);'</span>
     * </pre>
     * @param rightSpecifyQuery The specify-query for right column. (NotNull)
     * @return The calculator for right column. (NotNull)
     */
    def equal(rightSpecifyQuery: (CB) => Unit): ScrHpCalculator = { doHandle(rightSpecifyQuery, ConditionKey.CK_EQUAL) }

    /**
     * NotEqual(&lt;&gt;).
     * <pre>
     * <span style="color: #3F7E5E">// where FOO &lt;&gt; BAR</span>
     * cb.<span style="color: #DD4747">columnQuery</span>(new SpecifyQuery&lt;MemberCB&gt;() {
     *     def void query(MemberCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFoo()</span>; <span style="color: #3F7E5E">// left column</span>
     *     }
     * }).<span style="color: #DD4747">notEqual</span>(new SpecifyQuery&lt;MemberCB&gt;() {
     *     def void query(MemberCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnBar()</span>; <span style="color: #3F7E5E">// right column</span>
     *     }
     * }); <span style="color: #3F7E5E">// you can calculate for right column like '}).plus(3);'</span>
     * </pre>
     * @param rightSpecifyQuery The specify-query for right column. (NotNull)
     * @return The calculator for right column. (NotNull)
     */
    def notEqual(rightSpecifyQuery: (CB) => Unit): ScrHpCalculator = { doHandle(rightSpecifyQuery, ConditionKey.CK_NOT_EQUAL_STANDARD) }

    /**
     * GreaterThan(&gt;).
     * <pre>
     * <span style="color: #3F7E5E">// where FOO &gt; BAR</span>
     * cb.<span style="color: #DD4747">columnQuery</span>(new SpecifyQuery&lt;MemberCB&gt;() {
     *     def void query(MemberCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFoo()</span>; <span style="color: #3F7E5E">// left column</span>
     *     }
     * }).<span style="color: #DD4747">greaterThan</span>(new SpecifyQuery&lt;MemberCB&gt;() {
     *     def void query(MemberCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnBar()</span>; <span style="color: #3F7E5E">// right column</span>
     *     }
     * }); <span style="color: #3F7E5E">// you can calculate for right column like '}).plus(3);'</span>
     * </pre>
     * @param rightSpecifyQuery The specify-query for right column. (NotNull)
     * @return The calculator for right column. (NotNull)
     */
    def greaterThan(rightSpecifyQuery: (CB) => Unit): ScrHpCalculator = { doHandle(rightSpecifyQuery, ConditionKey.CK_GREATER_THAN) }

    /**
     * LessThan(&lt;).
     * <pre>
     * <span style="color: #3F7E5E">// where FOO &lt; BAR</span>
     * cb.<span style="color: #DD4747">columnQuery</span>(new SpecifyQuery&lt;MemberCB&gt;() {
     *     def void query(MemberCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFoo()</span>; <span style="color: #3F7E5E">// left column</span>
     *     }
     * }).<span style="color: #DD4747">lessThan</span>(new SpecifyQuery&lt;MemberCB&gt;() {
     *     def void query(MemberCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnBar()</span>; <span style="color: #3F7E5E">// right column</span>
     *     }
     * }); <span style="color: #3F7E5E">// you can calculate for right column like '}).plus(3);'</span>
     * </pre>
     * @param rightSpecifyQuery The specify-query for right column. (NotNull)
     * @return The calculator for right column. (NotNull)
     */
    def lessThan(rightSpecifyQuery: (CB) => Unit): ScrHpCalculator = { doHandle(rightSpecifyQuery, ConditionKey.CK_LESS_THAN) }

    /**
     * GreaterEqual(&gt;=).
     * <pre>
     * <span style="color: #3F7E5E">// where FOO &gt;= BAR</span>
     * cb.<span style="color: #DD4747">columnQuery</span>(new SpecifyQuery&lt;MemberCB&gt;() {
     *     def void query(MemberCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFoo()</span>; <span style="color: #3F7E5E">// left column</span>
     *     }
     * }).<span style="color: #DD4747">greaterEqual</span>(new SpecifyQuery&lt;MemberCB&gt;() {
     *     def void query(MemberCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnBar()</span>; <span style="color: #3F7E5E">// right column</span>
     *     }
     * }); <span style="color: #3F7E5E">// you can calculate for right column like '}).plus(3);'</span>
     * </pre>
     * @param rightSpecifyQuery The specify-query for right column. (NotNull)
     * @return The calculator for right column. (NotNull)
     */
    def greaterEqual(rightSpecifyQuery: (CB) => Unit): ScrHpCalculator = { doHandle(rightSpecifyQuery, ConditionKey.CK_GREATER_EQUAL) }

    /**
     * LessThan(&lt;=).
     * <pre>
     * <span style="color: #3F7E5E">// where FOO &lt;= BAR</span>
     * cb.<span style="color: #DD4747">columnQuery</span>(new SpecifyQuery&lt;MemberCB&gt;() {
     *     def void query(MemberCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFoo()</span>; <span style="color: #3F7E5E">// left column</span>
     *     }
     * }).<span style="color: #DD4747">lessEqual</span>(new SpecifyQuery&lt;MemberCB&gt;() {
     *     def void query(MemberCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnBar()</span>; <span style="color: #3F7E5E">// right column</span>
     *     }
     * }); <span style="color: #3F7E5E">// you can calculate for right column like '}).plus(3);'</span>
     * </pre>
     * @param rightSpecifyQuery The specify-query for right column. (NotNull)
     * @return The calculator for right column. (NotNull)
     */
    def lessEqual(rightSpecifyQuery: (CB) => Unit): ScrHpCalculator = { doHandle(rightSpecifyQuery, ConditionKey.CK_LESS_EQUAL) }

    protected def doHandle(rightSpecifyQuery: (CB) => Unit, ckey: ConditionKey): ScrHpCalculator =
    { new ScrHpCalculator(handler.handle(toNativeSpecifyQuery(rightSpecifyQuery), ckey.getOperand())) }

    protected def toNativeSpecifyQuery(rightSpecifyQuery: (CB) => Unit): SpecifyQuery[CB] =
    { new SpecifyQuery[CB]() { def specify(cb: CB): Unit = { rightSpecifyQuery(cb) } } }
}

/**
 * @param <CB> The type of condition-bean.
 * @author DBFlute(AutoGenerator)
 */
trait ScrHpColQyHandler[CB <: ConditionBean] {

    /**
     * @param rightSp The specification for right column. (NotNull)
     * @param operand The operand for column comparison. (NotNull)
     * @return The calculator for right column. (NotNull)
     */
    def handle(rightSp: SpecifyQuery[CB], operand: String): HpCalculator;
}

/* _/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/ */
/* _/_/_/_/_/_/_/_/_/_/_/                                                                      _/_/_/_/_/_/_/_/_/_/_/ */
/* _/_/_/_/_/_/_/_/_/_/_/                                                                      _/_/_/_/_/_/_/_/_/_/_/ */
/* _/_/_/_/_/_/_/_/_/_/_/                                                                      _/_/_/_/_/_/_/_/_/_/_/ */
/* _/_/_/_/_/_/_/_/_/_/_/                     (Specify)DerivedReferrer                         _/_/_/_/_/_/_/_/_/_/_/ */
/* _/_/_/_/_/_/_/_/_/_/_/                                                                      _/_/_/_/_/_/_/_/_/_/_/ */
/* _/_/_/_/_/_/_/_/_/_/_/                                                                      _/_/_/_/_/_/_/_/_/_/_/ */
/* _/_/_/_/_/_/_/_/_/_/_/                                                                      _/_/_/_/_/_/_/_/_/_/_/ */
/* _/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/ */

/**
 * The function for (Specify)DerivedReferrer.
 * @param <REFERRER_CB> The type of referrer condition-bean.
 * @param <LOCAL_CQ> The type of local condition-query.
 * @author DBFlute(AutoGenerator)
 */
class ScrHpSDRFunction[REFERRER_CB <: ConditionBean, LOCAL_CQ <: ConditionQuery](function: HpSDRFunction[REFERRER_CB, LOCAL_CQ]) {

    // ===================================================================================
    //                                                                            Function
    //                                                                            ========
    /**
     * Set up the sub query of referrer for the scalar 'count'.
     * <pre>
     * cb.specify().derivePurchaseList().<span style="color: #DD4747">count</span>(new SubQuery&lt;PurchaseCB&gt;() {
     *     protected void query(PurchaseCB subCB) {
     *         subCB.specify().<span style="color: #DD4747">columnPurchaseId</span>(); <span style="color: #3F7E5E">// basically PK to count records</span>
     *         subCB.query().setPaymentCompleteFlg_Equal_True(); <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }, Member.<span style="color: #DD4747">ALIAS_purchaseCount</span>);
     * </pre> 
     * @param subQuery The sub query of referrer. (NotNull)
     * @param aliasName The alias of the name. The property should exists on the entity. (NotNull)
     * @param optionCall The callback for option for DerivedReferrer. e.g. you can use a coalesce function. (NotNull)
     */
    def count(subQuery: (REFERRER_CB) => Unit)(aliasName: String = null)(implicit optionCall: (DerivedReferrerOption) => Unit = null): Unit = {
        if (optionCall == null) { function.count(toNativeSubQuery(subQuery), aliasName) }
        else { function.count(toNativeSubQuery(subQuery), aliasName, callbackDROP(optionCall)) }
    }

    /**
     * Set up the sub query of referrer for the scalar 'count-distinct'.
     * <pre>
     * cb.specify().derivePurchaseList().<span style="color: #DD4747">countDistinct</span>(new SubQuery&lt;PurchaseCB&gt;() {
     *     protected void query(PurchaseCB subCB) {
     *         subCB.specify().<span style="color: #DD4747">columnProductId</span>(); <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setPaymentCompleteFlg_Equal_True(); <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }, Member.<span style="color: #DD4747">ALIAS_productKindCount</span>);
     * </pre> 
     * @param subQuery The sub query of referrer. (NotNull)
     * @param aliasName The alias of the name. The property should exists on the entity. (NotNull)
     * @param optionCall The callback for option for DerivedReferrer. e.g. you can use a coalesce function. (NotNull)
     */
    def countDistinct(subQuery: (REFERRER_CB) => Unit)(aliasName: String = null)(implicit optionCall: (DerivedReferrerOption) => Unit = null): Unit = {
        if (optionCall == null) { function.countDistinct(toNativeSubQuery(subQuery), aliasName) }
        else { function.countDistinct(toNativeSubQuery(subQuery), aliasName, callbackDROP(optionCall)) }
    }

    /**
     * Set up the sub query of referrer for the scalar 'max'.
     * <pre>
     * cb.specify().derivePurchaseList().<span style="color: #DD4747">max</span>(new SubQuery&lt;PurchaseCB&gt;() {
     *     protected void query(PurchaseCB subCB) {
     *         subCB.specify().<span style="color: #DD4747">columnPurchaseDatetime</span>(); <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setPaymentCompleteFlg_Equal_True(); <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }, Member.<span style="color: #DD4747">ALIAS_latestPurchaseDatetime</span>);
     * </pre> 
     * @param subQuery The sub query of referrer. (NotNull)
     * @param aliasName The alias of the name. The property should exists on the entity. (NotNull)
     * @param optionCall The callback for option for DerivedReferrer. e.g. you can use a coalesce function. (NotNull)
     */
    def max(subQuery: (REFERRER_CB) => Unit)(aliasName: String = null)(implicit optionCall: (DerivedReferrerOption) => Unit = null): Unit = {
        if (optionCall == null) { function.max(toNativeSubQuery(subQuery), aliasName) }
        else { function.max(toNativeSubQuery(subQuery), aliasName, callbackDROP(optionCall)) }
    }

    /**
     * Set up the sub query of referrer for the scalar 'min'.
     * <pre>
     * cb.specify().derivePurchaseList().<span style="color: #DD4747">min</span>(new SubQuery&lt;PurchaseCB&gt;() {
     *     protected void query(PurchaseCB subCB) {
     *         subCB.specify().<span style="color: #DD4747">columnPurchaseDatetime</span>(); <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setPaymentCompleteFlg_Equal_True(); <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }, Member.<span style="color: #DD4747">ALIAS_firstPurchaseDatetime</span>);
     * </pre> 
     * @param subQuery The sub query of referrer. (NotNull)
     * @param aliasName The alias of the name. The property should exists on the entity. (NotNull)
     * @param optionCall The callback for option for DerivedReferrer. e.g. you can use a coalesce function. (NotNull)
     */
    def min(subQuery: (REFERRER_CB) => Unit)(aliasName: String = null)(implicit optionCall: (DerivedReferrerOption) => Unit = null): Unit = {
        if (optionCall == null) { function.min(toNativeSubQuery(subQuery), aliasName) }
        else { function.min(toNativeSubQuery(subQuery), aliasName, callbackDROP(optionCall)) }
    }

    /**
     * Set up the sub query of referrer for the scalar 'sum'.
     * <pre>
     * cb.specify().derivePurchaseList().<span style="color: #DD4747">sum</span>(new SubQuery&lt;PurchaseCB&gt;() {
     *     protected void query(PurchaseCB subCB) {
     *         subCB.specify().<span style="color: #DD4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setPaymentCompleteFlg_Equal_True(); <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }, Member.<span style="color: #DD4747">ALIAS_purchasePriceSummary</span>);
     * </pre> 
     * @param subQuery The sub query of referrer. (NotNull)
     * @param aliasName The alias of the name. The property should exists on the entity. (NotNull)
     * @param optionCall The callback for option for DerivedReferrer. e.g. you can use a coalesce function. (NotNull)
     */
    def sum(subQuery: (REFERRER_CB) => Unit)(aliasName: String = null)(implicit optionCall: (DerivedReferrerOption) => Unit = null): Unit = {
        if (optionCall == null) { function.sum(toNativeSubQuery(subQuery), aliasName) }
        else { function.sum(toNativeSubQuery(subQuery), aliasName, callbackDROP(optionCall)) }
    }

    /**
     * Set up the sub query of referrer for the scalar 'avg'.
     * <pre>
     * cb.specify().derivePurchaseList().<span style="color: #DD4747">avg</span>(new SubQuery&lt;PurchaseCB&gt;() {
     *     protected void query(PurchaseCB subCB) {
     *         subCB.specify().<span style="color: #DD4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setPaymentCompleteFlg_Equal_True(); <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }, Member.<span style="color: #DD4747">ALIAS_purchasePriceAverage</span>);
     * </pre> 
     * @param subQuery The sub query of referrer. (NotNull)
     * @param aliasName The alias of the name. The property should exists on the entity. (NotNull)
     * @param optionCall The callback for option for DerivedReferrer. e.g. you can use a coalesce function. (NotNull)
     */
    def avg(subQuery: (REFERRER_CB) => Unit)(aliasName: String = null)(implicit optionCall: (DerivedReferrerOption) => Unit = null): Unit = {
        if (optionCall == null) { function.avg(toNativeSubQuery(subQuery), aliasName) }
        else { function.avg(toNativeSubQuery(subQuery), aliasName, callbackDROP(optionCall)) }
    }

    protected def callbackDROP(optionCall: (DerivedReferrerOption) => Unit): DerivedReferrerOption =
    { val op = createDerivedReferrerOption(); optionCall(op); return op; }
    protected def createDerivedReferrerOption(): DerivedReferrerOption = { new DerivedReferrerOption() }

    protected def toNativeSubQuery[CB <: ConditionBean](subQuery: (CB) => Unit): SubQuery[CB] =
    { new SubQuery[CB]() { def query(cb: CB): Unit = { subQuery(cb) } } }
}

/* _/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/ */
/* _/_/_/_/_/_/_/_/_/_/_/                                                                      _/_/_/_/_/_/_/_/_/_/_/ */
/* _/_/_/_/_/_/_/_/_/_/_/                                                                      _/_/_/_/_/_/_/_/_/_/_/ */
/* _/_/_/_/_/_/_/_/_/_/_/                                                                      _/_/_/_/_/_/_/_/_/_/_/ */
/* _/_/_/_/_/_/_/_/_/_/_/                      (Query)DerivedReferrer                          _/_/_/_/_/_/_/_/_/_/_/ */
/* _/_/_/_/_/_/_/_/_/_/_/                                                                      _/_/_/_/_/_/_/_/_/_/_/ */
/* _/_/_/_/_/_/_/_/_/_/_/                                                                      _/_/_/_/_/_/_/_/_/_/_/ */
/* _/_/_/_/_/_/_/_/_/_/_/                                                                      _/_/_/_/_/_/_/_/_/_/_/ */
/* _/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/ */

/**
 * The function of (Query)DerivedReferrer.
 * @param <CB> The type of condition-bean.
 * @author DBFlute(AutoGenerator)
 */
class ScrHpQDRFunction[CB <: ConditionBean](function: HpQDRFunction[CB]) {

    /**
     * Set up the sub query of referrer for the scalar 'count'.
     * <pre>
     * cb.query().derivedPurchaseList().<span style="color: #DD4747">count</span>(new SubQuery&lt;PurchaseCB&gt;() {
     *     def void query(PurchaseCB subCB) {
     *         subCB.specify().<span style="color: #DD4747">columnPurchaseId</span>(); <span style="color: #3F7E5E">// *Point</span>
     *         subCB.query().setPaymentCompleteFlg_Equal_True();
     *     }
     * }).<span style="color: #DD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// *Don't forget the parameter</span>
     * </pre> 
     * @param subQuery The sub query of referrer. (NotNull)
     * @param optionCall The callback for option for DerivedReferrer. e.g. you can use a coalesce function. (NotNull)
     * @return The parameter for comparing with scalar. (NotNull)
     */
    def count(subQuery: (CB) => Unit)(implicit optionCall: (DerivedReferrerOption) => Unit = null): ScrHpQDRParameter[CB, Integer] = {
        if (optionCall == null) { toScalaQDRParameter(function.count(toNativeSubQuery(subQuery))) }
        else { toScalaQDRParameter(function.count(toNativeSubQuery(subQuery), callbackDROP(optionCall))) }
    }

    /**
     * Set up the sub query of referrer for the scalar 'count(with distinct)'.
     * <pre>
     * cb.query().derivedPurchaseList().<span style="color: #DD4747">countDistinct</span>(new SubQuery&lt;PurchaseCB&gt;() {
     *     def void query(PurchaseCB subCB) {
     *         subCB.specify().<span style="color: #DD4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point</span>
     *         subCB.query().setPaymentCompleteFlg_Equal_True();
     *     }
     * }).<span style="color: #DD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// *Don't forget the parameter</span>
     * </pre> 
     * @param subQuery The sub query of referrer. (NotNull)
     * @param optionCall The callback for option for DerivedReferrer. e.g. you can use a coalesce function. (NotNull)
     * @return The parameter for comparing with scalar. (NotNull)
     */
    def countDistinct(subQuery: (CB) => Unit)(implicit optionCall: (DerivedReferrerOption) => Unit = null): ScrHpQDRParameter[CB, Integer] = {
        if (optionCall == null) { toScalaQDRParameter(function.countDistinct(toNativeSubQuery(subQuery))) }
        else { toScalaQDRParameter(function.countDistinct(toNativeSubQuery(subQuery), callbackDROP(optionCall))) }
    }

    /**
     * Set up the sub query of referrer for the scalar 'max'.
     * <pre>
     * cb.query().derivedPurchaseList().<span style="color: #DD4747">max</span>(new SubQuery&lt;PurchaseCB&gt;() {
     *     def void query(PurchaseCB subCB) {
     *         subCB.specify().<span style="color: #DD4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point</span>
     *         subCB.query().setPaymentCompleteFlg_Equal_True();
     *     }
     * }).<span style="color: #DD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// *Don't forget the parameter</span>
     * </pre> 
     * @param subQuery The sub query of referrer. (NotNull)
     * @param optionCall The callback for option for DerivedReferrer. e.g. you can use a coalesce function. (NotNull)
     * @return The parameter for comparing with scalar. (NotNull)
     */
    def max(subQuery: (CB) => Unit)(implicit optionCall: (DerivedReferrerOption) => Unit = null): ScrHpQDRParameter[CB, Object] = {
        if (optionCall == null) { toScalaQDRParameter(function.max(toNativeSubQuery(subQuery))) }
        else { toScalaQDRParameter(function.max(toNativeSubQuery(subQuery), callbackDROP(optionCall))) }
    }

    /**
     * Set up the sub query of referrer for the scalar 'min'.
     * <pre>
     * cb.query().derivedPurchaseList().<span style="color: #DD4747">min</span>(new SubQuery&lt;PurchaseCB&gt;() {
     *     def void query(PurchaseCB subCB) {
     *         subCB.specify().<span style="color: #DD4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point</span>
     *         subCB.query().setPaymentCompleteFlg_Equal_True();
     *     }
     * }).<span style="color: #DD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// *Don't forget the parameter</span>
     * </pre> 
     * @param subQuery The sub query of referrer. (NotNull)
     * @param optionCall The callback for option for DerivedReferrer. e.g. you can use a coalesce function. (NotNull)
     * @return The parameter for comparing with scalar. (NotNull)
     */
    def min(subQuery: (CB) => Unit)(implicit optionCall: (DerivedReferrerOption) => Unit = null): ScrHpQDRParameter[CB, Object] = {
        if (optionCall == null) { toScalaQDRParameter(function.min(toNativeSubQuery(subQuery))) }
        else { toScalaQDRParameter(function.min(toNativeSubQuery(subQuery), callbackDROP(optionCall))) }
    }

    /**
     * Set up the sub query of referrer for the scalar 'sum'.
     * <pre>
     * cb.query().derivedPurchaseList().<span style="color: #DD4747">sum</span>(new SubQuery&lt;PurchaseCB&gt;() {
     *     def void query(PurchaseCB subCB) {
     *         subCB.specify().<span style="color: #DD4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point</span>
     *         subCB.query().setPaymentCompleteFlg_Equal_True();
     *     }
     * }).<span style="color: #DD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// *Don't forget the parameter</span>
     * </pre> 
     * @param subQuery The sub query of referrer. (NotNull)
     * @param optionCall The callback for option for DerivedReferrer. e.g. you can use a coalesce function. (NotNull)
     * @return The parameter for comparing with scalar. (NotNull)
     */
    def sum(subQuery: (CB) => Unit)(implicit optionCall: (DerivedReferrerOption) => Unit = null): ScrHpQDRParameter[CB, Number] = {
        if (optionCall == null) { toScalaQDRParameter(function.sum(toNativeSubQuery(subQuery))) }
        else { toScalaQDRParameter(function.sum(toNativeSubQuery(subQuery), callbackDROP(optionCall))) }
    }

    /**
     * Set up the sub query of referrer for the scalar 'avg'.
     * <pre>
     * cb.query().derivedPurchaseList().<span style="color: #DD4747">avg</span>(new SubQuery&lt;PurchaseCB&gt;() {
     *     def void query(PurchaseCB subCB) {
     *         subCB.specify().<span style="color: #DD4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point</span>
     *         subCB.query().setPaymentCompleteFlg_Equal_True();
     *     }
     * }).<span style="color: #DD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// *Don't forget the parameter</span>
     * </pre> 
     * @param subQuery The sub query of referrer. (NotNull)
     * @param optionCall The callback for option for DerivedReferrer. e.g. you can use a coalesce function. (NotNull)
     * @return The parameter for comparing with scalar. (NotNull)
     */
    def avg(subQuery: (CB) => Unit)(implicit optionCall: (DerivedReferrerOption) => Unit = null): ScrHpQDRParameter[CB, Number] = {
        if (optionCall == null) { toScalaQDRParameter(function.avg(toNativeSubQuery(subQuery))) }
        else { toScalaQDRParameter(function.avg(toNativeSubQuery(subQuery), callbackDROP(optionCall))) }
    }

    protected def callbackDROP(optionCall: (DerivedReferrerOption) => Unit): DerivedReferrerOption =
    { val op = createDerivedReferrerOption(); optionCall(op); return op; }
    protected def createDerivedReferrerOption(): DerivedReferrerOption = { new DerivedReferrerOption() }

    protected def toScalaQDRParameter[PARAMETER](parameter: HpQDRParameter[CB, PARAMETER]): ScrHpQDRParameter[CB, PARAMETER] =
    { new ScrHpQDRParameter[CB, PARAMETER](parameter) }

    protected def toNativeSubQuery(subQuery: (CB) => Unit): SubQuery[CB] =
    { new SubQuery[CB]() { def query(cb: CB): Unit = { subQuery(cb) } } }
}

/**
 * The parameter of (Query)DerivedReferrer.
 * @param <CB> The type of condition-bean.
 * @param <PARAMETER> The type of parameter.
 * @author DBFlute(AutoGenerator)
 */
class ScrHpQDRParameter[CB <: ConditionBean, PARAMETER](parameter: HpQDRParameter[CB, PARAMETER]) {

    /**
     * Set up the operand 'equal' and the value of parameter. <br />
     * The type of the parameter should be same as the type of target column. <br />
     * If the specified column is date type and has time-parts, you should use java.sql.Timestamp type.
     * <pre>
     * cb.query().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     protected void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchasePrice(); <span style="color: #3F7E5E">// If the type is Integer...</span>
     *         subCB.query().setPaymentCompleteFlg_Equal_True();
     *     }
     * }).equal(123); <span style="color: #3F7E5E">// This parameter should be Integer!</span>
     * </pre>
     * @param value The value of parameter for the specified column. (NotNull) 
     */
    def equal(value: PARAMETER): Unit = { parameter.equal(value) }

    /**
     * Set up the operand 'notEqual' and the value of parameter. <br />
     * The type of the parameter should be same as the type of target column. <br />
     * If the specified column is date type and has time-parts, you should use java.sql.Timestamp type.
     * <pre>
     * cb.query().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     protected void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchasePrice(); <span style="color: #3F7E5E">// If the type is Integer...</span>
     *         subCB.query().setPaymentCompleteFlg_Equal_True();
     *     }
     * }).notEqual(123); <span style="color: #3F7E5E">// This parameter should be Integer!</span>
     * </pre>
     * @param value The value of parameter for the specified column. (NotNull) 
     */
    def notEqual(value: PARAMETER): Unit = { parameter.notEqual(value) }

    /**
     * Set up the operand 'greaterThan' and the value of parameter. <br />
     * The type of the parameter should be same as the type of target column. <br />
     * If the specified column is date type and has time-parts, you should use java.sql.Timestamp type.
     * <pre>
     * cb.query().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     protected void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchasePrice(); <span style="color: #3F7E5E">// If the type is Integer...</span>
     *         subCB.query().setPaymentCompleteFlg_Equal_True();
     *     }
     * }).greaterThan(123); <span style="color: #3F7E5E">// This parameter should be Integer!</span>
     * </pre>
     * @param value The value of parameter for the specified column. (NotNull) 
     */
    def greaterThan(value: PARAMETER): Unit = { parameter.greaterThan(value) }

    /**
     * Set up the operand 'lessThan' and the value of parameter. <br />
     * The type of the parameter should be same as the type of target column. <br />
     * If the specified column is date type and has time-parts, you should use java.sql.Timestamp type.
     * <pre>
     * cb.query().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     protected void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchasePrice(); <span style="color: #3F7E5E">// If the type is Integer...</span>
     *         subCB.query().setPaymentCompleteFlg_Equal_True();
     *     }
     * }).lessThan(123); <span style="color: #3F7E5E">// This parameter should be Integer!</span>
     * </pre>
     * @param value The value of parameter for the specified column. (NotNull) 
     */
    def lessThan(value: PARAMETER): Unit = { parameter.lessThan(value) }

    /**
     * Set up the operand 'greaterEqual' and the value of parameter. <br />
     * The type of the parameter should be same as the type of target column. <br />
     * If the specified column is date type and has time-parts, you should use java.sql.Timestamp type.
     * <pre>
     * cb.query().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     protected void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchasePrice(); <span style="color: #3F7E5E">// If the type is Integer...</span>
     *         subCB.query().setPaymentCompleteFlg_Equal_True();
     *     }
     * }).greaterEqual(123); <span style="color: #3F7E5E">// This parameter should be Integer!</span>
     * </pre>
     * @param value The value of parameter for the specified column. (NotNull) 
     */
    def greaterEqual(value: PARAMETER): Unit = { parameter.greaterEqual(value) }

    /**
     * Set up the operand 'lessEqual' and the value of parameter. <br />
     * The type of the parameter should be same as the type of target column. <br />
     * If the specified column is date type and has time-parts, you should use java.sql.Timestamp type.
     * <pre>
     * cb.query().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     protected void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchasePrice(); <span style="color: #3F7E5E">// If the type is Integer...</span>
     *         subCB.query().setPaymentCompleteFlg_Equal_True();
     *     }
     * }).lessEqual(123); <span style="color: #3F7E5E">// This parameter should be Integer!</span>
     * </pre>
     * @param value The value of parameter for the specified column. (NotNull) 
     */
    def lessEqual(value: PARAMETER): Unit = { parameter.lessEqual(value) }

    /**
     * Set up the operand 'isNull' and the value of parameter. <br />
     * The type of the parameter should be same as the type of target column. 
     * <pre>
     * cb.query().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     protected void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchasePrice();
     *         subCB.query().setPaymentCompleteFlg_Equal_True();
     *     }
     * }).isNull(); <span style="color: #3F7E5E">// no parameter</span>
     * </pre>
     */
    def isNull(): Unit = { parameter.isNull() }

    /**
     * Set up the operand 'isNull' and the value of parameter. <br />
     * The type of the parameter should be same as the type of target column. 
     * <pre>
     * cb.query().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     protected void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchasePrice();
     *         subCB.query().setPaymentCompleteFlg_Equal_True();
     *     }
     * }).isNotNull(); <span style="color: #3F7E5E">// no parameter</span>
     * </pre>
     */
    def isNotNull(): Unit = { parameter.isNotNull() }

    /**
     * Set up the operand 'between' and the values of parameter. <br />
     * The type of the parameter should be same as the type of target column. <br />
     * If the specified column is date type and has time-parts, you should use java.sql.Timestamp type.
     * <pre>
     * cb.query().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     protected void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchasePrice(); <span style="color: #3F7E5E">// If the type is Integer...</span>
     *         subCB.query().setPaymentCompleteFlg_Equal_True();
     *     }
     * }).between(53, 123); <span style="color: #3F7E5E">// This parameter should be Integer!</span>
     * </pre>
     * @param fromValue The 'from' value of parameter for the specified column. (NotNull) 
     * @param toValue The 'to' value of parameter for the specified column. (NotNull) 
     */
    def between(fromValue: PARAMETER, toValue: PARAMETER): Unit = { parameter.between(fromValue, toValue) }

    /**
     * Set up the comparison 'DateFromTo' and the values of parameter. <br />
     * The type of the parameter should be same as the type of target column. <br />
     * If the specified column is date type and has time-parts, you should use java.sql.Timestamp type.
     * <pre>
     * cb.query().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     protected void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *         subCB.query().setPaymentCompleteFlg_Equal_True();
     *     }
     * }).dateFromTo(toTimestamp("2012/03/05"), toTimestamp("2012/03/07"));
     * <span style="color: #3F7E5E">// PURCHASE_DATE between 2012/03/05 00:00:00 and 2012/03/07 23:59:59.999</span>
     * </pre>
     * @param fromDate The 'from' date of parameter for the specified column. (NullAllowed: if null, from-date condition is ignored) 
     * @param toDate The 'to' date of parameter for the specified column. (NullAllowed: if null, to-date condition is ignored) 
     */
    def dateFromTo(fromDate: Date, toDate: Date): Unit = { parameter.dateFromTo(fromDate, toDate) }

    /**
     * Set up the comparison 'FromTo' and the values of parameter. <br />
     * The type of the parameter should be same as the type of target column. <br />
     * If the specified column is date type and has time-parts, you should use java.sql.Timestamp type.
     * <pre>
     * cb.query().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     protected void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *         subCB.query().setPaymentCompleteFlg_Equal_True();
     *     }
     * }).fromTo(toTimestamp("2012/02/05"), toTimestamp("2012/04/07"), new FromToOption().compareAsMonth());
     * <span style="color: #3F7E5E">// PURCHASE_DATE between 2012/02/01 00:00:00 and 2012/04/30 23:59:59.999</span>
     * </pre>
     * @param fromDate The 'from' date of parameter for the specified column. (NullAllowed: if null, from-date condition is ignored) 
     * @param toDate The 'to' date of parameter for the specified column. (NullAllowed: if null, to-date condition is ignored) 
     * @param option The option of from-to. (NotNull)
     */
    def fromTo(fromDate: Date, toDate: Date)(optionCall: (FromToOption) => Unit): Unit = { parameter.fromTo(fromDate, toDate, callbackFTOP(optionCall)) }

    protected def callbackFTOP(optionCall: (FromToOption) => Unit): FromToOption =
    { val op = createFromToOption(); optionCall(op); return op; }
    protected def createFromToOption(): FromToOption = { new FromToOption() }
}

/* _/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/ */
/* _/_/_/_/_/_/_/_/_/_/_/                                                                      _/_/_/_/_/_/_/_/_/_/_/ */
/* _/_/_/_/_/_/_/_/_/_/_/                                                                      _/_/_/_/_/_/_/_/_/_/_/ */
/* _/_/_/_/_/_/_/_/_/_/_/                                                                      _/_/_/_/_/_/_/_/_/_/_/ */
/* _/_/_/_/_/_/_/_/_/_/_/                            ScalarSelect                              _/_/_/_/_/_/_/_/_/_/_/ */
/* _/_/_/_/_/_/_/_/_/_/_/                                                                      _/_/_/_/_/_/_/_/_/_/_/ */
/* _/_/_/_/_/_/_/_/_/_/_/                                                                      _/_/_/_/_/_/_/_/_/_/_/ */
/* _/_/_/_/_/_/_/_/_/_/_/                                                                      _/_/_/_/_/_/_/_/_/_/_/ */
/* _/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/ */

/**
 * The function for scalar select. 
 * @param <CB> The type of condition-bean.
 * @param <RESULT> The type of result for scalar select
 * @author DBFlute(AutoGenerator)
 */
class ScrHpSLSFunction[CB <: ConditionBean, RESULT](function: HpSLSFunction[CB, RESULT]) {

    /**
     * Select the count value. <br />
     * You can also get same result by selectCount(cb) method.
     * <pre>
     * memberBhv.scalarSelect(Integer.class).<span style="color: #DD4747">count</span>(new ScalarQuery(MemberCB cb) {
     *     cb.specify().<span style="color: #DD4747">columnMemberId</span>(); <span style="color: #3F7E5E">// the required specification of (basically) primary key column</span>
     *     cb.query().setMemberStatusCode_Equal_Formalized(); <span style="color: #3F7E5E">// query as you like it</span>
     * });
     * </pre>
     * @param scalarQuery The query for scalar select. (NotNull)
     * @param optionCall The callback for option for scalar select. (NotNull)
     * @return The count value calculated by function. (NotNull)
     */
    def count(scalarQuery: (CB) => Unit)(implicit optionCall: (ScalarSelectOption) => Unit = null): RESULT = {
        if (optionCall == null) { function.count(toJavaScalarQuery(scalarQuery)) }
        else { function.count(toJavaScalarQuery(scalarQuery), callbackSSOP(optionCall)) }
    }

    /**
     * Select the count-distinct value. <br />
     * You can also get same result by selectCount(cb) method.
     * <pre>
     * memberBhv.scalarSelect(Integer.class).<span style="color: #DD4747">countDistinct</span>(new ScalarQuery(MemberCB cb) {
     *     cb.specify().<span style="color: #DD4747">columnMemberId</span>(); <span style="color: #3F7E5E">// the required specification of (basically) primary key column</span>
     *     cb.query().setMemberStatusCode_Equal_Formalized(); <span style="color: #3F7E5E">// query as you like it</span>
     * });
     * </pre>
     * @param scalarQuery The query for scalar select. (NotNull)
     * @param optionCall The callback for option for scalar select. (NotNull)
     * @return The count-distinct value calculated by function. (NotNull)
     */
    def countDistinct(scalarQuery: (CB) => Unit)(implicit optionCall: (ScalarSelectOption) => Unit = null): RESULT = {
        if (optionCall == null) { function.countDistinct(toJavaScalarQuery(scalarQuery)) }
        else { function.countDistinct(toJavaScalarQuery(scalarQuery), callbackSSOP(optionCall)) }
    }

    /**
     * Select the maximum value.
     * <pre>
     * memberBhv.scalarSelect(Date.class).<span style="color: #DD4747">max</span>(new ScalarQuery(MemberCB cb) {
     *     cb.specify().<span style="color: #DD4747">columnBirthdate</span>(); <span style="color: #3F7E5E">// the required specification of target column</span>
     *     cb.query().setMemberStatusCode_Equal_Formalized(); <span style="color: #3F7E5E">// query as you like it</span>
     * });
     * </pre>
     * @param scalarQuery The query for scalar select. (NotNull)
     * @param optionCall The callback for option for scalar select. (NotNull)
     * @return The maximum value calculated by function. (EmptyAllowed: or AlwaysPresent if you use coalesce by option)
     */
    def max(scalarQuery: (CB) => Unit)(implicit optionCall: (ScalarSelectOption) => Unit = null): Option[RESULT] = {
        if (optionCall == null) { Option(function.max(toJavaScalarQuery(scalarQuery))) }
        else { Option(function.max(toJavaScalarQuery(scalarQuery), callbackSSOP(optionCall))) }
    }

    /**
     * Select the minimum value.
     * <pre>
     * memberBhv.scalarSelect(Date.class).<span style="color: #DD4747">min</span>(new ScalarQuery(MemberCB cb) {
     *     cb.specify().<span style="color: #DD4747">columnBirthdate</span>(); <span style="color: #3F7E5E">// the required specification of target column</span>
     *     cb.query().setMemberStatusCode_Equal_Formalized(); <span style="color: #3F7E5E">// query as you like it</span>
     * });
     * </pre>
     * @param scalarQuery The query for scalar select. (NotNull)
     * @param optionCall The callback for option for scalar select. (NotNull)
     * @return The minimum value calculated by function. (EmptyAllowed: or AlwaysPresent if you use coalesce by option)
     */
    def min(scalarQuery: (CB) => Unit)(implicit optionCall: (ScalarSelectOption) => Unit = null): Option[RESULT] = {
        if (optionCall == null) { Option(function.min(toJavaScalarQuery(scalarQuery))) }
        else { Option(function.min(toJavaScalarQuery(scalarQuery), callbackSSOP(optionCall))) }
    }

    /**
     * Select the summary value.
     * <pre>
     * purchaseBhv.scalarSelect(Integer.class).<span style="color: #DD4747">sum</span>(new ScalarQuery(PurchaseCB cb) {
     *     cb.specify().<span style="color: #DD4747">columnPurchaseCount</span>(); <span style="color: #3F7E5E">// the required specification of target column</span>
     *     cb.query().setPurchaseDatetime_GreaterEqual(date); <span style="color: #3F7E5E">// query as you like it</span>
     * });
     * </pre>
     * @param scalarQuery The query for scalar select. (NotNull)
     * @param optionCall The callback for option for scalar select. (NotNull)
     * @return The summary value calculated by function. (EmptyAllowed: or AlwaysPresent if you use coalesce by option)
     */
    def sum(scalarQuery: (CB) => Unit)(implicit optionCall: (ScalarSelectOption) => Unit = null): Option[RESULT] = {
        if (optionCall == null) { Option(function.sum(toJavaScalarQuery(scalarQuery))) }
        else { Option(function.sum(toJavaScalarQuery(scalarQuery), callbackSSOP(optionCall))) }
    }

    /**
     * Select the average value.
     * <pre>
     * purchaseBhv.scalarSelect(Integer.class).<span style="color: #DD4747">avg</span>(new ScalarQuery(PurchaseCB cb) {
     *     cb.specify().<span style="color: #DD4747">columnPurchaseCount</span>(); <span style="color: #3F7E5E">// the required specification of target column</span>
     *     cb.query().setPurchaseDatetime_GreaterEqual(date); <span style="color: #3F7E5E">// query as you like it</span>
     * });
     * </pre>
     * @param scalarQuery The query for scalar select. (NotNull)
     * @param optionCall The callback for option for scalar select. (NotNull)
     * @return The average value calculated by function. (EmptyAllowed: or AlwaysPresent if you use coalesce by option)
     */
    def avg(scalarQuery: (CB) => Unit)(implicit optionCall: (ScalarSelectOption) => Unit = null): Option[RESULT] = {
        if (optionCall == null) { Option(function.avg(toJavaScalarQuery(scalarQuery))) }
        else { Option(function.avg(toJavaScalarQuery(scalarQuery), callbackSSOP(optionCall))) }
    }

    protected def callbackSSOP(optionCall: (ScalarSelectOption) => Unit): ScalarSelectOption =
    { val op = createScalarSelectOption(); optionCall(op); return op; }
    protected def createScalarSelectOption(): ScalarSelectOption = { new ScalarSelectOption() }

    protected def toJavaScalarQuery(scalarQuery: (CB) => Unit): ScalarQuery[CB] =
    { new ScalarQuery[CB]() { def query(cb: CB): Unit = { scalarQuery(cb) } } }
}

/* _/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/ */
/* _/_/_/_/_/_/_/_/_/_/_/                                                                      _/_/_/_/_/_/_/_/_/_/_/ */
/* _/_/_/_/_/_/_/_/_/_/_/                                                                      _/_/_/_/_/_/_/_/_/_/_/ */
/* _/_/_/_/_/_/_/_/_/_/_/                                                                      _/_/_/_/_/_/_/_/_/_/_/ */
/* _/_/_/_/_/_/_/_/_/_/_/                          ScalarCondition                             _/_/_/_/_/_/_/_/_/_/_/ */
/* _/_/_/_/_/_/_/_/_/_/_/                                                                      _/_/_/_/_/_/_/_/_/_/_/ */
/* _/_/_/_/_/_/_/_/_/_/_/                                                                      _/_/_/_/_/_/_/_/_/_/_/ */
/* _/_/_/_/_/_/_/_/_/_/_/                                                                      _/_/_/_/_/_/_/_/_/_/_/ */
/* _/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/ */

/**
 * The function for ScalarCondition (the old name: ScalarSubQuery).
 * @param <CB> The type of condition-bean.
 * @author DBFlute(AutoGenerator)
 */
class ScrHpSSQFunction[CB <: ConditionBean](function: HpSSQFunction[CB]) {

    // ===================================================================================
    //                                                                            Function
    //                                                                            ========
    /**
     * Set up the sub query of myself for the scalar 'max'.
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #DD4747">max</span>(new SubQuery&lt;PurchaseCB&gt;() {
     *     def void query(PurchaseCB subCB) {
     *         subCB.specify().<span style="color: #DD4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *         subCB.query().setPaymentCompleteFlg_Equal_True();
     *     }
     * });
     * </pre> 
     * @param subQuery The sub query of myself. (NotNull)
     * @return The decorator of ScalarCondition. e.g. you can use partition-by. (NotNull)
     */
    def max(subQuery: (CB) => Unit): ScrHpSSQDecorator[CB] = { toScalaDecorator(function.max(toNativeSubQuery(subQuery))) }

    /**
     * Set up the sub query of myself for the scalar 'min'.
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #DD4747">min</span>(new SubQuery&lt;PurchaseCB&gt;() {
     *     def void query(PurchaseCB subCB) {
     *         subCB.specify().<span style="color: #DD4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *         subCB.query().setPaymentCompleteFlg_Equal_True();
     *     }
     * });
     * </pre> 
     * @param subQuery The sub query of myself. (NotNull)
     * @return The decorator of ScalarCondition. e.g. you can use partition-by. (NotNull)
     */
    def min(subQuery: (CB) => Unit): ScrHpSSQDecorator[CB] = { toScalaDecorator(function.min(toNativeSubQuery(subQuery))) }

    /**
     * Set up the sub query of myself for the scalar 'sum'.
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #DD4747">sum</span>(new SubQuery&lt;PurchaseCB&gt;() {
     *     def void query(PurchaseCB subCB) {
     *         subCB.specify().<span style="color: #DD4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *         subCB.query().setPaymentCompleteFlg_Equal_True();
     *     }
     * });
     * </pre> 
     * @param subQuery The sub query of myself. (NotNull)
     * @return The decorator of ScalarCondition. e.g. you can use partition-by. (NotNull)
     */
    def sum(subQuery: (CB) => Unit): ScrHpSSQDecorator[CB] = { toScalaDecorator(function.sum(toNativeSubQuery(subQuery))) }

    /**
     * Set up the sub query of myself for the scalar 'avg'.
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #DD4747">avg</span>(new SubQuery&lt;PurchaseCB&gt;() {
     *     def void query(PurchaseCB subCB) {
     *         subCB.specify().<span style="color: #DD4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *         subCB.query().setPaymentCompleteFlg_Equal_True();
     *     }
     * });
     * </pre> 
     * @param subQuery The sub query of myself. (NotNull)
     * @return The decorator of ScalarCondition. e.g. you can use partition-by. (NotNull)
     */
    def avg(subQuery: (CB) => Unit): ScrHpSSQDecorator[CB] = { toScalaDecorator(function.avg(toNativeSubQuery(subQuery))) }

    protected def toScalaDecorator(decorator: HpSSQDecorator[CB]): ScrHpSSQDecorator[CB] =
    { new ScrHpSSQDecorator[CB](decorator) }

    protected def toNativeSubQuery(subQuery: (CB) => Unit): SubQuery[CB] =
    { new SubQuery[CB]() { def query(cb: CB): Unit = { subQuery(cb) } } }
}

/**
 * The decorator for ScalarCondition (the old name: ScalarSubQuery).
 * @param <CB> The type of condition-bean.
 * @author DBFlute(AutoGenerator)
 */
class ScrHpSSQDecorator[CB <: ConditionBean](decorator: HpSSQDecorator[CB]) {

    // ===================================================================================
    //                                                                          Decoration
    //                                                                          ==========
    /**
     * Partition the scope of condition by the specified query. <br />
     * You can add a correlation condition to the sub-query.
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #DD4747">max</span>(new SubQuery&lt;PurchaseCB&gt;() {
     *     def query(PurchaseCB subCB) {
     *         subCB.specify().<span style="color: #DD4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *         subCB.query().setPaymentCompleteFlg_Equal_True();
     *     }
     * }).<span style="color: #DD4747">partitionBy</span>(new SpecifyQuery&lt;PurchaseCB&gt;() {
     *     def specify(PurchaseCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnMemberId</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     }
     * });
     * </pre>
     * @param specifyQuery The query to specify the partition. (NotNull)
     */
    def partitionBy(specifyQuery: (CB) => Unit): Unit = { decorator.partitionBy(toNativeSpecifyQuery(specifyQuery)) }

    protected def toNativeSpecifyQuery(specifyQuery: (CB) => Unit): SpecifyQuery[CB] =
    { new SpecifyQuery[CB]() { def specify(cb: CB): Unit = { specifyQuery(cb) } } }
}

/* _/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/ */
/* _/_/_/_/_/_/_/_/_/_/_/                                                                      _/_/_/_/_/_/_/_/_/_/_/ */
/* _/_/_/_/_/_/_/_/_/_/_/                                                                      _/_/_/_/_/_/_/_/_/_/_/ */
/* _/_/_/_/_/_/_/_/_/_/_/                                                                      _/_/_/_/_/_/_/_/_/_/_/ */
/* _/_/_/_/_/_/_/_/_/_/_/                         General Calculator                           _/_/_/_/_/_/_/_/_/_/_/ */
/* _/_/_/_/_/_/_/_/_/_/_/                                                                      _/_/_/_/_/_/_/_/_/_/_/ */
/* _/_/_/_/_/_/_/_/_/_/_/                                                                      _/_/_/_/_/_/_/_/_/_/_/ */
/* _/_/_/_/_/_/_/_/_/_/_/                                                                      _/_/_/_/_/_/_/_/_/_/_/ */
/* _/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/ */

/**
 * @author jflute
 */
class ScrHpCalculator(calculator: HpCalculator) {

    // ===================================================================================
    //                                                                         Calculation
    //                                                                         ===========
    /**
     * Plus the specified column with the value. (+)
     * @param plusValue The number value for plus. (NotNull)
     * @return this. (NotNull)
     */
    def plus(plusValue: Number): ScrHpCalculator = { calculator.plus(plusValue); return this; }

    /**
     * Plus the specified column with the plus column. (+) {Dream Cruise}
     * <pre>
     * e.g. ManualOrder: order by PURCHASE_PRICE + PURCHASE_COUNT
     *  PurchaseCB cb = new PurchaseCB();
     *  ManualOrderBean mob = new ManualOrderBean
     *  mob.<span style="color: #DD4747">plus</span>(cb.<span style="color: #DD4747">dreamCruiseCB()</span>.specify().columnPurchaseCount());
     *  cb.query().addOrderBy_PurchasePrice_Asc().withManualOrder(mob);
     * 
     * e.g. ColumnQuery: ... > PURCHASE_PRICE + PURCHASE_COUNT
     *  PurchaseCB cb = new PurchaseCB();
     *  cb.columnQuery(new SpecifyQuery() {
     *      public void specify(Purchase cb) {
     *          cb.column...();
     *      }
     *  }).greaterThan(new SpecifyQuery() {
     *      public void specify(Purchase cb) {
     *          cb.columnPurchasePrice();
     *      }
     *  }).<span style="color: #DD4747">plus</span>(cb.<span style="color: #DD4747">dreamCruiseCB()</span>.specify().columnPurchaseCount());
     * </pre>
     * @param plusColumn The plus column specified by your Dream Cruise. (NotNull)
     * @return this. (NotNull)
     */
    def plus(plusColumn: HpSpecifiedColumn): ScrHpCalculator = { calculator.plus(plusColumn); return this; }

    /**
     * Minus the specified column with the value. (-)
     * @param minusValue The number value for minus. (NotNull)
     * @return this. (NotNull)
     */
    def minus(minusValue: Number): ScrHpCalculator = { calculator.minus(minusValue); return this; }

    /**
     * Minus the specified column with the minus column. (-) {Dream Cruise}
     * <pre>
     * e.g. ManualOrder: order by PURCHASE_PRICE - PURCHASE_COUNT
     *  PurchaseCB cb = new PurchaseCB();
     *  ManualOrderBean mob = new ManualOrderBean
     *  mob.<span style="color: #DD4747">minus</span>(cb.<span style="color: #DD4747">dreamCruiseCB()</span>.specify().columnPurchaseCount());
     *  cb.query().addOrderBy_PurchasePrice_Asc().withManualOrder(mob);
     * 
     * e.g. ColumnQuery: ... > PURCHASE_PRICE - PURCHASE_COUNT
     *  PurchaseCB cb = new PurchaseCB();
     *  cb.columnQuery(new SpecifyQuery() {
     *      public void specify(Purchase cb) {
     *          cb.column...();
     *      }
     *  }).greaterThan(new SpecifyQuery() {
     *      public void specify(Purchase cb) {
     *          cb.columnPurchasePrice();
     *      }
     *  }).<span style="color: #DD4747">minus</span>(cb.<span style="color: #DD4747">dreamCruiseCB()</span>.specify().columnPurchaseCount());
     * </pre>
     * @param minusColumn The minus column specified by your Dream Cruise. (NotNull)
     * @return this. (NotNull)
     */
    def minus(minusColumn: HpSpecifiedColumn): ScrHpCalculator = { calculator.minus(minusColumn); return this; }

    /**
     * Multiply the value to the specified column. (*)
     * @param multiplyValue The number value for multiply. (NotNull)
     * @return this. (NotNull)
     */
    def multiply(multiplyValue: Number): ScrHpCalculator = { calculator.multiply(multiplyValue); return this; }

    /**
     * Multiply the specified column with the multiply column. (*) {Dream Cruise}
     * <pre>
     * e.g. ManualOrder: order by PURCHASE_PRICE * PURCHASE_COUNT
     *  PurchaseCB cb = new PurchaseCB();
     *  ManualOrderBean mob = new ManualOrderBean
     *  mob.<span style="color: #DD4747">multiply</span>(cb.<span style="color: #DD4747">dreamCruiseCB()</span>.specify().columnPurchaseCount());
     *  cb.query().addOrderBy_PurchasePrice_Asc().withManualOrder(mob);
     * 
     * e.g. ColumnQuery: ... > PURCHASE_PRICE * PURCHASE_COUNT
     *  PurchaseCB cb = new PurchaseCB();
     *  cb.columnQuery(new SpecifyQuery() {
     *      public void specify(Purchase cb) {
     *          cb.column...();
     *      }
     *  }).greaterThan(new SpecifyQuery() {
     *      public void specify(Purchase cb) {
     *          cb.columnPurchasePrice();
     *      }
     *  }).<span style="color: #DD4747">multiply</span>(cb.<span style="color: #DD4747">dreamCruiseCB()</span>.specify().columnPurchaseCount());
     * </pre>
     * @param multiplyColumn The multiply column specified by your Dream Cruise. (NotNull)
     * @return this. (NotNull)
     */
    def multiply(multiplyColumn: HpSpecifiedColumn): ScrHpCalculator = { calculator.multiply(multiplyColumn); return this; }

    /**
     * Divide the specified column by the value. (/)
     * @param divideValue The number value for divide. (NotNull)
     * @return this. (NotNull)
     */
    def divide(divideValue: Number): ScrHpCalculator = { calculator.divide(divideValue); return this; }

    /**
     * Divide the specified column with the divide column. (/) {Dream Cruise}
     * <pre>
     * e.g. ManualOrder: order by PURCHASE_PRICE / PURCHASE_COUNT
     *  PurchaseCB cb = new PurchaseCB();
     *  ManualOrderBean mob = new ManualOrderBean
     *  mob.<span style="color: #DD4747">divide</span>(cb.<span style="color: #DD4747">dreamCruiseCB()</span>.specify().columnPurchaseCount());
     *  cb.query().addOrderBy_PurchasePrice_Asc().withManualOrder(mob);
     * 
     * e.g. ColumnQuery: ... > PURCHASE_PRICE / PURCHASE_COUNT
     *  PurchaseCB cb = new PurchaseCB();
     *  cb.columnQuery(new SpecifyQuery() {
     *      public void specify(Purchase cb) {
     *          cb.column...();
     *      }
     *  }).greaterThan(new SpecifyQuery() {
     *      public void specify(Purchase cb) {
     *          cb.columnPurchasePrice();
     *      }
     *  }).<span style="color: #DD4747">divide</span>(cb.<span style="color: #DD4747">dreamCruiseCB()</span>.specify().columnPurchaseCount());
     * </pre>
     * @param divideColumn The divide column specified by your Dream Cruise. (NotNull)
     * @return this. (NotNull)
     */
    def divide(divideColumn: HpSpecifiedColumn): ScrHpCalculator = { calculator.divide(divideColumn); return this; }

    /**
     * Convert the value of right column by function.
     * @param option The conversion option of column. (NotNull)
     * @return this. (NotNull)
     */
    def convert(optionCall: (ScrColumnConversionOption) => Unit): ScrHpCalculator =
    { val option = new ScrColumnConversionOption(); optionCall(option); calculator.convert(option); return this; }

    // ===================================================================================
    //                                                                     Left/Right Mode
    //                                                                     ===============
    /**
     * To be for left column.
     * @return this. (NotNull)
     */
    def left(): ScrHpCalculator = { calculator.left(); return this; }

    /**
     * To be for right column. (default)<br />
     * It also means main process internally.
     * @return this. (NotNull)
     */
    def right(): ScrHpCalculator = { calculator.right(); return this; }
}
