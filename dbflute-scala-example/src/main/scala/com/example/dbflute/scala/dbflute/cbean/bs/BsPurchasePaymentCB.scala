package com.example.dbflute.scala.dbflute.cbean.bs;

import org.seasar.dbflute.cbean.AbstractConditionBean;
import org.seasar.dbflute.cbean.AbstractConditionBean._;
import org.seasar.dbflute.cbean.AndQuery;
import org.seasar.dbflute.cbean.ConditionBean;
import org.seasar.dbflute.cbean.ConditionQuery;
import org.seasar.dbflute.cbean.OrQuery;
import org.seasar.dbflute.cbean.SpecifyQuery;
import org.seasar.dbflute.cbean.SubQuery;
import org.seasar.dbflute.cbean.UnionQuery;
import org.seasar.dbflute.cbean.chelper._
import org.seasar.dbflute.cbean.coption._
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.cbean.sqlclause.SqlClauseCreator;
import org.seasar.dbflute.dbmeta.DBMetaProvider;
import org.seasar.dbflute.twowaysql.factory.SqlAnalyzerFactory;
import com.example.dbflute.scala.dbflute.allcommon.DBFluteConfig;
import com.example.dbflute.scala.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.scala.dbflute.allcommon.ImplementedInvokerAssistant;
import com.example.dbflute.scala.dbflute.allcommon.ImplementedSqlClauseCreator;
import com.example.dbflute.scala.dbflute.allcommon.ScrHpColQyOperand;
import com.example.dbflute.scala.dbflute.allcommon.ScrHpSDRFunction;
import com.example.dbflute.scala.dbflute.cbean._
import com.example.dbflute.scala.dbflute.cbean.cq._
import com.example.dbflute.scala.dbflute.cbean.nss._

/**
 * The base condition-bean of PURCHASE_PAYMENT.
 * @author DBFlute(AutoGenerator)
 */
class BsPurchasePaymentCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected var _conditionQuery: PurchasePaymentCQ = null;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    {
        if (DBFluteConfig.isPagingCountLater()) {
            enablePagingCountLater();
        }
        if (DBFluteConfig.isPagingCountLeastJoin()) {
            enablePagingCountLeastJoin();
        }
        if (DBFluteConfig.isNonSpecifiedColumnAccessAllowed()) {
            enableNonSpecifiedColumnAccess();
        }
        if (DBFluteConfig.isQueryUpdateCountPreCheck()) {
            enableQueryUpdateCountPreCheck();
        }
    }

    // ===================================================================================
    //                                                                           SqlClause
    //                                                                           =========
    @Override
    protected def createSqlClause(): SqlClause = {
        val creator: SqlClauseCreator = DBFluteConfig.getSqlClauseCreator();
        if (creator != null) {
            return creator.createSqlClause(this);
        }
        return new ImplementedSqlClauseCreator().createSqlClause(this); // as default
    }

    // ===================================================================================
    //                                                                     DBMeta Provider
    //                                                                     ===============
    @Override
    protected def getDBMetaProvider(): DBMetaProvider = {
        return DBMetaInstanceHandler.getProvider(); // as default
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    def getTableDbName(): String = {
        return "PURCHASE_PAYMENT";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param purchasePaymentId (購入支払ID): PK, ID, NotNull, BIGINT(19). (NotNull)
     * @return this. (NotNull)
     */
    def acceptPK(purchasePaymentId: Long): PurchasePaymentCB = {
        assertObjectNotNull("purchasePaymentId", purchasePaymentId);
        val cb: BsPurchasePaymentCB = this;
        cb.query().setPurchasePaymentId_Equal(purchasePaymentId);
        return this.asInstanceOf[PurchasePaymentCB];
    }

    def addOrderBy_PK_Asc(): ConditionBean = {
        query().addOrderBy_PurchasePaymentId_Asc();
        return this;
    }

    def addOrderBy_PK_Desc(): ConditionBean = {
        query().addOrderBy_PurchasePaymentId_Desc();
        return this;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Prepare for various queries. <br />
     * Examples of main functions are following:
     * <pre>
     * <span style="color: #3F7E5E">// Basic Queries</span>
     * cb.query().setMemberId_Equal(value);        <span style="color: #3F7E5E">// =</span>
     * cb.query().setMemberId_NotEqual(value);     <span style="color: #3F7E5E">// !=</span>
     * cb.query().setMemberId_GreaterThan(value);  <span style="color: #3F7E5E">// &gt;</span>
     * cb.query().setMemberId_LessThan(value);     <span style="color: #3F7E5E">// &lt;</span>
     * cb.query().setMemberId_GreaterEqual(value); <span style="color: #3F7E5E">// &gt;=</span>
     * cb.query().setMemberId_LessEqual(value);    <span style="color: #3F7E5E">// &lt;=</span>
     * cb.query().setMemberName_InScope(valueList);    <span style="color: #3F7E5E">// in ('a', 'b')</span>
     * cb.query().setMemberName_NotInScope(valueList); <span style="color: #3F7E5E">// not in ('a', 'b')</span>
     * cb.query().setMemberName_PrefixSearch(value);   <span style="color: #3F7E5E">// like 'a%' escape '|'</span>
     * <span style="color: #3F7E5E">// LikeSearch with various options: (versatile)</span>
     * <span style="color: #3F7E5E">// {like ... [options]}</span>
     * cb.query().setMemberName_LikeSearch(value, option);
     * cb.query().setMemberName_NotLikeSearch(value, option); <span style="color: #3F7E5E">// not like ...</span>
     * <span style="color: #3F7E5E">// FromTo with various options: (versatile)</span>
     * <span style="color: #3F7E5E">// {(default) fromDatetime &lt;= BIRTHDATE &lt;= toDatetime}</span>
     * cb.query().setBirthdate_FromTo(fromDatetime, toDatetime, option);
     * <span style="color: #3F7E5E">// DateFromTo: (Date means yyyy/MM/dd)</span>
     * <span style="color: #3F7E5E">// {fromDate &lt;= BIRTHDATE &lt; toDate + 1 day}</span>
     * cb.query().setBirthdate_DateFromTo(fromDate, toDate);
     * cb.query().setBirthdate_IsNull();    <span style="color: #3F7E5E">// is null</span>
     * cb.query().setBirthdate_IsNotNull(); <span style="color: #3F7E5E">// is not null</span>
     * 
     * <span style="color: #3F7E5E">// ExistsReferrer: (correlated sub-query)</span>
     * <span style="color: #3F7E5E">// {where exists (select PURCHASE_ID from PURCHASE where ...)}</span>
     * cb.query().existsPurchaseList(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.query().setXxx... <span style="color: #3F7E5E">// referrer sub-query condition</span>
     *     }
     * });
     * cb.query().notExistsPurchaseList...
     * 
     * <span style="color: #3F7E5E">// InScopeRelation: (sub-query)</span>
     * <span style="color: #3F7E5E">// {where MEMBER_STATUS_CODE in (select MEMBER_STATUS_CODE from MEMBER_STATUS where ...)}</span>
     * cb.query().inScopeMemberStatus(new SubQuery&lt;MemberStatusCB&gt;() {
     *     public void query(MemberStatusCB subCB) {
     *         subCB.query().setXxx... <span style="color: #3F7E5E">// relation sub-query condition</span>
     *     }
     * });
     * cb.query().notInScopeMemberStatus...
     * 
     * <span style="color: #3F7E5E">// (Query)DerivedReferrer: (correlated sub-query)</span>
     * cb.query().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchasePrice(); <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setXxx... <span style="color: #3F7E5E">// referrer sub-query condition</span>
     *     }
     * }).greaterEqual(value);
     * 
     * <span style="color: #3F7E5E">// ScalarCondition: (self-table sub-query)</span>
     * cb.query().scalar_Equal().max(new SubQuery&lt;MemberCB&gt;() {
     *     public void query(MemberCB subCB) {
     *         subCB.specify().columnBirthdate(); <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setXxx... <span style="color: #3F7E5E">// scalar sub-query condition</span>
     *     }
     * });
     * 
     * <span style="color: #3F7E5E">// OrderBy</span>
     * cb.query().addOrderBy_MemberName_Asc();
     * cb.query().addOrderBy_MemberName_Desc().withManualOrder(valueList);
     * cb.query().addOrderBy_MemberName_Desc().withNullsFirst();
     * cb.query().addOrderBy_MemberName_Desc().withNullsLast();
     * cb.query().addSpecifiedDerivedOrderBy_Desc(aliasName);
     * 
     * <span style="color: #3F7E5E">// Query(Relation)</span>
     * cb.query().queryMemberStatus()...;
     * cb.query().queryMemberAddressAsValid(targetDate)...;
     * </pre>
     * @return The instance of condition-query for base-point table to set up query. (NotNull)
     */
    def query(): PurchasePaymentCQ = {
        assertQueryPurpose(); // assert only when user-public query 
        return getConditionQuery();
    }

    def getConditionQuery(): PurchasePaymentCQ = { // public for parameter comment and internal
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected def createLocalCQ(): PurchasePaymentCQ = {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected def xcreateCQ(childQuery: ConditionQuery, sqlClause: SqlClause, aliasName: String, nestLevel: Integer): PurchasePaymentCQ = {
        val cq: PurchasePaymentCQ = xnewCQ(childQuery,  sqlClause,  aliasName,  nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected def xnewCQ(childQuery: ConditionQuery, sqlClause: SqlClause, aliasName: String, nestLevel: Integer): PurchasePaymentCQ = {
        return new PurchasePaymentCQ(childQuery, sqlClause, aliasName, nestLevel);
    }

    def localCQ(): ConditionQuery = {
        return getConditionQuery();
    }

    // ===================================================================================
    //                                                                               Union
    //                                                                               =====
    /**
     * Set up 'union' for base-point table. <br />
     * You don't need to call SetupSelect in union-query,
     * because it inherits calls before. (Don't call SetupSelect after here)
     * <pre>
     * cb.query().<span style="color: #DD4747">union</span>(new UnionQuery&lt;PurchasePaymentCB&gt;() {
     *     public void query(PurchasePaymentCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    def union(unionQuery: UnionQuery[PurchasePaymentCB]): Unit = {
        val cb: PurchasePaymentCB = new PurchasePaymentCB(); cb.xsetupForUnion(this); xsyncUQ(cb); 
        try { lock(); unionQuery.query(cb); } finally { unlock(); }
        xsaveUCB(cb);
        val cq: PurchasePaymentCQ = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all' for base-point table. <br />
     * You don't need to call SetupSelect in union-query,
     * because it inherits calls before. (Don't call SetupSelect after here)
     * <pre>
     * cb.query().<span style="color: #DD4747">unionAll</span>(new UnionQuery&lt;PurchasePaymentCB&gt;() {
     *     public void query(PurchasePaymentCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union all'. (NotNull)
     */
    def unionAll(unionQuery: UnionQuery[PurchasePaymentCB]): Unit = {
        val cb: PurchasePaymentCB = new PurchasePaymentCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionQuery.query(cb); } finally { unlock(); }
        xsaveUCB(cb);
        val cq: PurchasePaymentCQ = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    protected var _nssPurchase: PurchaseNss = null;
    def getNssPurchase(): PurchaseNss = {
        if (_nssPurchase == null) { _nssPurchase = new PurchaseNss(null); }
        return _nssPurchase;
    }
    /**
     * Set up relation columns to select clause. <br />
     * (購入)PURCHASE by my PURCHASE_ID, named 'purchase'.
     * <pre>
     * PurchasePaymentCB cb = new PurchasePaymentCB();
     * cb.<span style="color: #DD4747">setupSelect_Purchase()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * DblePurchasePayment purchasePayment = purchasePaymentBhv.selectEntityWithDeletedCheck(cb);
     * ... = purchasePayment.<span style="color: #DD4747">getPurchase()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    def setupSelect_Purchase(): PurchaseNss = {
        assertSetupSelectPurpose("purchase");
        if (hasSpecifiedColumn()) { // if reverse call
            specify().columnPurchaseId();
        }
        doSetupSelect(new SsCall() { def qf(): ConditionQuery = { return query().queryPurchase(); } });
        if (_nssPurchase == null || !_nssPurchase.hasConditionQuery())
        { _nssPurchase = new PurchaseNss(query().queryPurchase()); }
        return _nssPurchase;
    }

    // [DBFlute-0.7.4]
    // ===================================================================================
    //                                                                             Specify
    //                                                                             =======
    protected var _specification: HpPurchasePaymentCB.HpSpecification = null;

    /**
     * Prepare for SpecifyColumn, (Specify)DerivedReferrer. <br />
     * This method should be called after SetupSelect.
     * <pre>
     * cb.setupSelect_MemberStatus(); <span style="color: #3F7E5E">// should be called before specify()</span>
     * cb.specify().columnMemberName();
     * cb.specify().specifyMemberStatus().columnMemberStatusName();
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *         subCB.query().set...
     *     }
     * }, aliasName);
     * </pre>
     * @return The instance of specification. (NotNull)
     */
    def specify(): HpPurchasePaymentCB.HpSpecification = {
        assertSpecifyPurpose();
        if (_specification == null) { _specification = new HpPurchasePaymentCB.HpSpecification(this
            , new HpSpQyCall[PurchasePaymentCQ]() {
                def has(): Boolean = { return true; }
                def qy(): PurchasePaymentCQ = { return getConditionQuery(); }
            }
            , _purpose, getDBMetaProvider()); }
        return _specification;
    }

    def localSp(): HpColumnSpHandler = {
        return specify();
    }

    def hasSpecifiedColumn(): Boolean = {
        return _specification != null && _specification.isAlreadySpecifiedRequiredColumn();
    }

    // [DBFlute-0.9.5.3]
    // ===================================================================================
    //                                                                        Column Query
    //                                                                        ============
    /**
     * Set up column-query. {column1 = column2}
     * <pre>
     * <span style="color: #3F7E5E">// where FOO &lt; BAR</span>
     * cb.<span style="color: #DD4747">columnQuery</span>(new SpecifyQuery&lt;PurchasePaymentCB&gt;() {
     *     public void query(PurchasePaymentCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFoo()</span>; <span style="color: #3F7E5E">// left column</span>
     *     }
     * }).lessThan(new SpecifyQuery&lt;PurchasePaymentCB&gt;() {
     *     public void query(PurchasePaymentCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnBar()</span>; <span style="color: #3F7E5E">// right column</span>
     *     }
     * }); <span style="color: #3F7E5E">// you can calculate for right column like '}).plus(3);'</span>
     * </pre>
     * @param leftSpecifyQuery The specify-query for left column. (NotNull)
     * @return The object for setting up operand and right column. (NotNull)
     */
    def columnQuery(leftSpecifyQuery: (PurchasePaymentCB) => Unit): ScrHpColQyOperand[PurchasePaymentCB] = {
        return new ScrHpColQyOperand[PurchasePaymentCB](new HpColQyHandler[PurchasePaymentCB]() {
            def handle(rightSp: SpecifyQuery[PurchasePaymentCB], operand: String): HpCalculator = {
                return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), new SpecifyQuery[PurchasePaymentCB]() {
                    def specify(cb: PurchasePaymentCB): Unit = { leftSpecifyQuery(cb); }
                }, rightSp, operand);
            }
        });
    }

    protected def xcreateColumnQueryCB(): PurchasePaymentCB = {
        val cb: PurchasePaymentCB = new PurchasePaymentCB();
        cb.xsetupForColumnQuery(this.asInstanceOf[PurchasePaymentCB]);
        return cb;
    }

    // ===================================================================================
    //                                                                        Dream Cruise
    //                                                                        ============
    /**
     * Welcome to the Dream Cruise for condition-bean deep world. <br />
     * This is very specialty so you can get the frontier spirit. Bon voyage!
     * @return The condition-bean for dream cruise, which is linked to main condition-bean.
     */
    def dreamCruiseCB(): PurchasePaymentCB = {
        val cb: PurchasePaymentCB = new PurchasePaymentCB();
        cb.xsetupForDreamCruise(this.asInstanceOf[PurchasePaymentCB]);
        return cb;
    }

    protected def xdoCreateDreamCruiseCB(): ConditionBean = {
        return dreamCruiseCB();
    }

    // [DBFlute-0.9.6.3]
    // ===================================================================================
    //                                                                       OrScope Query
    //                                                                       =============
    /**
     * Set up the query for or-scope. <br />
     * (Same-column-and-same-condition-key conditions are allowed in or-scope)
     * <pre>
     * <span style="color: #3F7E5E">// where (FOO = '...' or BAR = '...')</span>
     * cb.<span style="color: #DD4747">orScopeQuery</span>(new OrQuery&lt;PurchasePaymentCB&gt;() {
     *     public void query(PurchasePaymentCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.query().setBAR_Equal...
     *     }
     * });
     * </pre>
     * @param orQuery The query for or-condition. (NotNull)
     */
    def orScopeQuery(orQuery: (PurchasePaymentCB) => Unit): Unit = {
        xorSQ(this.asInstanceOf[PurchasePaymentCB], new OrQuery[PurchasePaymentCB]{
            def query(orCB: PurchasePaymentCB): Unit = { orQuery(orCB); }
        });
    }

    /**
     * Set up the and-part of or-scope. <br />
     * (However nested or-scope query and as-or-split of like-search in and-part are unsupported)
     * <pre>
     * <span style="color: #3F7E5E">// where (FOO = '...' or (BAR = '...' and QUX = '...'))</span>
     * cb.<span style="color: #DD4747">orScopeQuery</span>(new OrQuery&lt;PurchasePaymentCB&gt;() {
     *     public void query(PurchasePaymentCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.<span style="color: #DD4747">orScopeQueryAndPart</span>(new AndQuery&lt;PurchasePaymentCB&gt;() {
     *             public void query(PurchasePaymentCB andCB) {
     *                 andCB.query().setBar_...
     *                 andCB.query().setQux_...
     *             }
     *         });
     *     }
     * });
     * </pre>
     * @param andQuery The query for and-condition. (NotNull)
     */
    def orScopeQueryAndPart(andQuery: (PurchasePaymentCB) => Unit): Unit = {
        xorSQAP(this.asInstanceOf[PurchasePaymentCB], new AndQuery[PurchasePaymentCB] {
            def query(cb: PurchasePaymentCB): Unit = { andQuery(cb); }
        });
    }

    // ===================================================================================
    //                                                                          DisplaySQL
    //                                                                          ==========
    @Override
    protected def getSqlAnalyzerFactory(): SqlAnalyzerFactory =
    { return new ImplementedInvokerAssistant().assistSqlAnalyzerFactory(); }
    @Override
    protected def getLogDateFormat(): String = { return DBFluteConfig.getLogDateFormat(); }
    @Override
    protected def getLogTimestampFormat(): String = { return DBFluteConfig.getLogTimestampFormat(); }

    // ===================================================================================
    //                                                                       Meta Handling
    //                                                                       =============
    def hasUnionQueryOrUnionAllQuery(): Boolean = {
        return query().hasUnionQueryOrUnionAllQuery();
    }

    // ===================================================================================
    //                                                                        Purpose Type
    //                                                                        ============
    @Override
    protected def xprepareSyncQyCall(mainCB: ConditionBean): Unit = {
        val cb: PurchasePaymentCB = if (mainCB != null) {
            mainCB.asInstanceOf[PurchasePaymentCB];
        } else {
            new PurchasePaymentCB();
        }
        specify().xsetSyncQyCall(new HpSpQyCall[PurchasePaymentCQ]() {
            def has(): Boolean = { return true; }
            def qy(): PurchasePaymentCQ = { return cb.query(); }
        });
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected def getConditionBeanClassNameInternally(): String = { return classOf[PurchasePaymentCB].getName(); }
    protected def getConditionQueryClassNameInternally(): String = { return classOf[PurchasePaymentCQ].getName(); }
    protected def getSubQueryClassNameInternally(): String = { return classOf[SubQuery[_]].getName(); }
    protected def getConditionOptionClassNameInternally(): String = { return classOf[ConditionOption].getName(); }
}

/**
 * The singleton object to define condition-bean's specification.
 * @author DBFlute(AutoGenerator)
 */
object HpPurchasePaymentCB {

    class HpSpecification(baseCB: ConditionBean, qyCall: HpSpQyCall[PurchasePaymentCQ], purpose: HpCBPurpose, dbmetaProvider: DBMetaProvider)
            extends HpAbstractSpecification[PurchasePaymentCQ](baseCB, qyCall, purpose, dbmetaProvider) {
        protected var _purchase: HpPurchaseCB.HpSpecification = null;
        /**
         * (購入支払ID)PURCHASE_PAYMENT_ID: {PK, ID, NotNull, BIGINT(19)}
         * @return The information object of specified column. (NotNull)
         */
        def columnPurchasePaymentId(): HpSpecifiedColumn = { return doColumn("PURCHASE_PAYMENT_ID"); }
        /**
         * (購入ID)PURCHASE_ID: {IX, NotNull, BIGINT(19), FK to PURCHASE}
         * @return The information object of specified column. (NotNull)
         */
        def columnPurchaseId(): HpSpecifiedColumn = { return doColumn("PURCHASE_ID"); }
        /**
         * (支払金額)PAYMENT_AMOUNT: {NotNull, DECIMAL(10, 2)}
         * @return The information object of specified column. (NotNull)
         */
        def columnPaymentAmount(): HpSpecifiedColumn = { return doColumn("PAYMENT_AMOUNT"); }
        /**
         * (支払日時)PAYMENT_DATETIME: {IX+, NotNull, TIMESTAMP(23, 10)}
         * @return The information object of specified column. (NotNull)
         */
        def columnPaymentDatetime(): HpSpecifiedColumn = { return doColumn("PAYMENT_DATETIME"); }
        /**
         * (支払方法コード)PAYMENT_METHOD_CODE: {NotNull, CHAR(3)}
         * @return The information object of specified column. (NotNull)
         */
        def columnPaymentMethodCode(): HpSpecifiedColumn = { return doColumn("PAYMENT_METHOD_CODE"); }
        /**
         * REGISTER_DATETIME: {NotNull, TIMESTAMP(23, 10)}
         * @return The information object of specified column. (NotNull)
         */
        def columnRegisterDatetime(): HpSpecifiedColumn = { return doColumn("REGISTER_DATETIME"); }
        /**
         * REGISTER_USER: {NotNull, VARCHAR(200)}
         * @return The information object of specified column. (NotNull)
         */
        def columnRegisterUser(): HpSpecifiedColumn = { return doColumn("REGISTER_USER"); }
        /**
         * UPDATE_DATETIME: {NotNull, TIMESTAMP(23, 10)}
         * @return The information object of specified column. (NotNull)
         */
        def columnUpdateDatetime(): HpSpecifiedColumn = { return doColumn("UPDATE_DATETIME"); }
        /**
         * UPDATE_USER: {NotNull, VARCHAR(200)}
         * @return The information object of specified column. (NotNull)
         */
        def columnUpdateUser(): HpSpecifiedColumn = { return doColumn("UPDATE_USER"); }
        def everyColumn(): Unit = { doEveryColumn(); }
        def exceptRecordMetaColumn(): Unit = { doExceptRecordMetaColumn(); }
        @Override
        protected def doSpecifyRequiredColumn(): Unit = {
            columnPurchasePaymentId(); // PK
            if (qyCall().qy().hasConditionQueryPurchase()
                    || qyCall().qy().xgetReferrerQuery().isInstanceOf[PurchaseCQ]) {
                columnPurchaseId(); // FK or one-to-one referrer
            }
        }
        @Override
        protected def getTableDbName(): String = { return "PURCHASE_PAYMENT"; }
        /**
         * Prepare to specify functions about relation table. <br />
         * (購入)PURCHASE by my PURCHASE_ID, named 'purchase'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        def specifyPurchase(): HpPurchaseCB.HpSpecification = {
            assertRelation("purchase");
            if (_purchase == null) {
                _purchase = new HpPurchaseCB.HpSpecification(_baseCB, new HpSpQyCall[PurchaseCQ]() {
                    def has(): Boolean = { return _qyCall.has() && _qyCall.qy().hasConditionQueryPurchase(); }
                    def qy(): PurchaseCQ = { return _qyCall.qy().queryPurchase(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _purchase.xsetSyncQyCall(new HpSpQyCall[PurchaseCQ]() {
                        def has(): Boolean = { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryPurchase(); }
                        def qy(): PurchaseCQ = { return xsyncQyCall().qy().queryPurchase(); }
                    });
                }
            }
            return _purchase;
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        def myselfDerived(): ScrHpSDRFunction[PurchasePaymentCB, PurchasePaymentCQ] = {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return toScalaSDRFunction(new HpSDRFunction[PurchasePaymentCB, PurchasePaymentCQ](_baseCB, _qyCall.qy(), new HpSDRSetupper[PurchasePaymentCB, PurchasePaymentCQ]() {
                def setup(fn: String, sq: SubQuery[PurchasePaymentCB], cq: PurchasePaymentCQ, al: String, op: DerivedReferrerOption): Unit = {
                    cq.xsmyselfDerive(fn, sq, al, op); } }, _dbmetaProvider));
        }
    }

    protected def toScalaSDRFunction[CB <: ConditionBean, CQ <: ConditionQuery](function: HpSDRFunction[CB, CQ]): ScrHpSDRFunction[CB, CQ] =
    { new ScrHpSDRFunction[CB, CQ](function) } 
}
