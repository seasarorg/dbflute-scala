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
 * The base condition-bean of PRODUCT.
 * @author DBFlute(AutoGenerator)
 */
class BsProductCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected var _conditionQuery: ProductCQ = null;

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
        return "PRODUCT";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param productId : PK, ID, NotNull, INTEGER(10). (NotNull)
     * @return this. (NotNull)
     */
    def acceptPK(productId: Integer): ProductCB = {
        assertObjectNotNull("productId", productId);
        val cb: BsProductCB = this;
        cb.query().setProductId_Equal(productId);
        return this.asInstanceOf[ProductCB];
    }

    /**
     * Accept the query condition of unique key as equal.
     * @param productHandleCode (商品ハンドルコード): UQ, NotNull, VARCHAR(100). (NotNull)
     * @return this. (NotNull)
     */
    def acceptUniqueOf(productHandleCode: String): ProductCB = {
        assertObjectNotNull("productHandleCode", productHandleCode);
        val cb: BsProductCB = this;
        cb.query().setProductHandleCode_Equal(productHandleCode);
        return this.asInstanceOf[ProductCB];
    }

    def addOrderBy_PK_Asc(): ConditionBean = {
        query().addOrderBy_ProductId_Asc();
        return this;
    }

    def addOrderBy_PK_Desc(): ConditionBean = {
        query().addOrderBy_ProductId_Desc();
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
    def query(): ProductCQ = {
        assertQueryPurpose(); // assert only when user-public query 
        return getConditionQuery();
    }

    def getConditionQuery(): ProductCQ = { // public for parameter comment and internal
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected def createLocalCQ(): ProductCQ = {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected def xcreateCQ(childQuery: ConditionQuery, sqlClause: SqlClause, aliasName: String, nestLevel: Integer): ProductCQ = {
        val cq: ProductCQ = xnewCQ(childQuery,  sqlClause,  aliasName,  nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected def xnewCQ(childQuery: ConditionQuery, sqlClause: SqlClause, aliasName: String, nestLevel: Integer): ProductCQ = {
        return new ProductCQ(childQuery, sqlClause, aliasName, nestLevel);
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
     * cb.query().<span style="color: #DD4747">union</span>(new UnionQuery&lt;ProductCB&gt;() {
     *     public void query(ProductCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    def union(unionQuery: UnionQuery[ProductCB]): Unit = {
        val cb: ProductCB = new ProductCB(); cb.xsetupForUnion(this); xsyncUQ(cb); 
        try { lock(); unionQuery.query(cb); } finally { unlock(); }
        xsaveUCB(cb);
        val cq: ProductCQ = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all' for base-point table. <br />
     * You don't need to call SetupSelect in union-query,
     * because it inherits calls before. (Don't call SetupSelect after here)
     * <pre>
     * cb.query().<span style="color: #DD4747">unionAll</span>(new UnionQuery&lt;ProductCB&gt;() {
     *     public void query(ProductCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union all'. (NotNull)
     */
    def unionAll(unionQuery: UnionQuery[ProductCB]): Unit = {
        val cb: ProductCB = new ProductCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionQuery.query(cb); } finally { unlock(); }
        xsaveUCB(cb);
        val cq: ProductCQ = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    protected var _nssProductCategory: ProductCategoryNss = null;
    def getNssProductCategory(): ProductCategoryNss = {
        if (_nssProductCategory == null) { _nssProductCategory = new ProductCategoryNss(null); }
        return _nssProductCategory;
    }
    /**
     * Set up relation columns to select clause. <br />
     * (商品カテゴリ)PRODUCT_CATEGORY by my PRODUCT_CATEGORY_CODE, named 'productCategory'.
     * <pre>
     * ProductCB cb = new ProductCB();
     * cb.<span style="color: #DD4747">setupSelect_ProductCategory()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * DbleProduct product = productBhv.selectEntityWithDeletedCheck(cb);
     * ... = product.<span style="color: #DD4747">getProductCategory()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    def setupSelect_ProductCategory(): ProductCategoryNss = {
        assertSetupSelectPurpose("productCategory");
        if (hasSpecifiedColumn()) { // if reverse call
            specify().columnProductCategoryCode();
        }
        doSetupSelect(new SsCall() { def qf(): ConditionQuery = { return query().queryProductCategory(); } });
        if (_nssProductCategory == null || !_nssProductCategory.hasConditionQuery())
        { _nssProductCategory = new ProductCategoryNss(query().queryProductCategory()); }
        return _nssProductCategory;
    }

    /**
     * Set up relation columns to select clause. <br />
     * (商品ステータス)PRODUCT_STATUS by my PRODUCT_STATUS_CODE, named 'productStatus'.
     * <pre>
     * ProductCB cb = new ProductCB();
     * cb.<span style="color: #DD4747">setupSelect_ProductStatus()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * DbleProduct product = productBhv.selectEntityWithDeletedCheck(cb);
     * ... = product.<span style="color: #DD4747">getProductStatus()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     */
    def setupSelect_ProductStatus(): Unit = {
        assertSetupSelectPurpose("productStatus");
        if (hasSpecifiedColumn()) { // if reverse call
            specify().columnProductStatusCode();
        }
        doSetupSelect(new SsCall() { def qf(): ConditionQuery = { return query().queryProductStatus(); } });
    }

    // [DBFlute-0.7.4]
    // ===================================================================================
    //                                                                             Specify
    //                                                                             =======
    protected var _specification: HpProductCB.HpSpecification = null;

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
    def specify(): HpProductCB.HpSpecification = {
        assertSpecifyPurpose();
        if (_specification == null) { _specification = new HpProductCB.HpSpecification(this
            , new HpSpQyCall[ProductCQ]() {
                def has(): Boolean = { return true; }
                def qy(): ProductCQ = { return getConditionQuery(); }
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
     * cb.<span style="color: #DD4747">columnQuery</span>(new SpecifyQuery&lt;ProductCB&gt;() {
     *     public void query(ProductCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFoo()</span>; <span style="color: #3F7E5E">// left column</span>
     *     }
     * }).lessThan(new SpecifyQuery&lt;ProductCB&gt;() {
     *     public void query(ProductCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnBar()</span>; <span style="color: #3F7E5E">// right column</span>
     *     }
     * }); <span style="color: #3F7E5E">// you can calculate for right column like '}).plus(3);'</span>
     * </pre>
     * @param leftSpecifyQuery The specify-query for left column. (NotNull)
     * @return The object for setting up operand and right column. (NotNull)
     */
    def columnQuery(leftSpecifyQuery: (ProductCB) => Unit): ScrHpColQyOperand[ProductCB] = {
        return new ScrHpColQyOperand[ProductCB](new HpColQyHandler[ProductCB]() {
            def handle(rightSp: SpecifyQuery[ProductCB], operand: String): HpCalculator = {
                return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), new SpecifyQuery[ProductCB]() {
                    def specify(cb: ProductCB): Unit = { leftSpecifyQuery(cb); }
                }, rightSp, operand);
            }
        });
    }

    protected def xcreateColumnQueryCB(): ProductCB = {
        val cb: ProductCB = new ProductCB();
        cb.xsetupForColumnQuery(this.asInstanceOf[ProductCB]);
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
    def dreamCruiseCB(): ProductCB = {
        val cb: ProductCB = new ProductCB();
        cb.xsetupForDreamCruise(this.asInstanceOf[ProductCB]);
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
     * cb.<span style="color: #DD4747">orScopeQuery</span>(new OrQuery&lt;ProductCB&gt;() {
     *     public void query(ProductCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.query().setBAR_Equal...
     *     }
     * });
     * </pre>
     * @param orQuery The query for or-condition. (NotNull)
     */
    def orScopeQuery(orQuery: (ProductCB) => Unit): Unit = {
        xorSQ(this.asInstanceOf[ProductCB], new OrQuery[ProductCB]{
            def query(orCB: ProductCB): Unit = { orQuery(orCB); }
        });
    }

    /**
     * Set up the and-part of or-scope. <br />
     * (However nested or-scope query and as-or-split of like-search in and-part are unsupported)
     * <pre>
     * <span style="color: #3F7E5E">// where (FOO = '...' or (BAR = '...' and QUX = '...'))</span>
     * cb.<span style="color: #DD4747">orScopeQuery</span>(new OrQuery&lt;ProductCB&gt;() {
     *     public void query(ProductCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.<span style="color: #DD4747">orScopeQueryAndPart</span>(new AndQuery&lt;ProductCB&gt;() {
     *             public void query(ProductCB andCB) {
     *                 andCB.query().setBar_...
     *                 andCB.query().setQux_...
     *             }
     *         });
     *     }
     * });
     * </pre>
     * @param andQuery The query for and-condition. (NotNull)
     */
    def orScopeQueryAndPart(andQuery: (ProductCB) => Unit): Unit = {
        xorSQAP(this.asInstanceOf[ProductCB], new AndQuery[ProductCB] {
            def query(cb: ProductCB): Unit = { andQuery(cb); }
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
        val cb: ProductCB = if (mainCB != null) {
            mainCB.asInstanceOf[ProductCB];
        } else {
            new ProductCB();
        }
        specify().xsetSyncQyCall(new HpSpQyCall[ProductCQ]() {
            def has(): Boolean = { return true; }
            def qy(): ProductCQ = { return cb.query(); }
        });
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected def getConditionBeanClassNameInternally(): String = { return classOf[ProductCB].getName(); }
    protected def getConditionQueryClassNameInternally(): String = { return classOf[ProductCQ].getName(); }
    protected def getSubQueryClassNameInternally(): String = { return classOf[SubQuery[_]].getName(); }
    protected def getConditionOptionClassNameInternally(): String = { return classOf[ConditionOption].getName(); }
}

/**
 * The singleton object to define condition-bean's specification.
 * @author DBFlute(AutoGenerator)
 */
object HpProductCB {

    class HpSpecification(baseCB: ConditionBean, qyCall: HpSpQyCall[ProductCQ], purpose: HpCBPurpose, dbmetaProvider: DBMetaProvider)
            extends HpAbstractSpecification[ProductCQ](baseCB, qyCall, purpose, dbmetaProvider) {
        protected var _productCategory: HpProductCategoryCB.HpSpecification = null;
        protected var _productStatus: HpProductStatusCB.HpSpecification = null;
        /**
         * PRODUCT_ID: {PK, ID, NotNull, INTEGER(10)}
         * @return The information object of specified column. (NotNull)
         */
        def columnProductId(): HpSpecifiedColumn = { return doColumn("PRODUCT_ID"); }
        /**
         * (商品名称)PRODUCT_NAME: {IX, NotNull, VARCHAR(50)}
         * @return The information object of specified column. (NotNull)
         */
        def columnProductName(): HpSpecifiedColumn = { return doColumn("PRODUCT_NAME"); }
        /**
         * (商品ハンドルコード)PRODUCT_HANDLE_CODE: {UQ, NotNull, VARCHAR(100)}
         * @return The information object of specified column. (NotNull)
         */
        def columnProductHandleCode(): HpSpecifiedColumn = { return doColumn("PRODUCT_HANDLE_CODE"); }
        /**
         * PRODUCT_CATEGORY_CODE: {IX, NotNull, CHAR(3), FK to PRODUCT_CATEGORY}
         * @return The information object of specified column. (NotNull)
         */
        def columnProductCategoryCode(): HpSpecifiedColumn = { return doColumn("PRODUCT_CATEGORY_CODE"); }
        /**
         * PRODUCT_STATUS_CODE: {IX, NotNull, CHAR(3), FK to PRODUCT_STATUS, classification=ProductStatus}
         * @return The information object of specified column. (NotNull)
         */
        def columnProductStatusCode(): HpSpecifiedColumn = { return doColumn("PRODUCT_STATUS_CODE"); }
        /**
         * (定価)REGULAR_PRICE: {NotNull, INTEGER(10)}
         * @return The information object of specified column. (NotNull)
         */
        def columnRegularPrice(): HpSpecifiedColumn = { return doColumn("REGULAR_PRICE"); }
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
        /**
         * VERSION_NO: {NotNull, BIGINT(19)}
         * @return The information object of specified column. (NotNull)
         */
        def columnVersionNo(): HpSpecifiedColumn = { return doColumn("VERSION_NO"); }
        def everyColumn(): Unit = { doEveryColumn(); }
        def exceptRecordMetaColumn(): Unit = { doExceptRecordMetaColumn(); }
        @Override
        protected def doSpecifyRequiredColumn(): Unit = {
            columnProductId(); // PK
            if (qyCall().qy().hasConditionQueryProductCategory()
                    || qyCall().qy().xgetReferrerQuery().isInstanceOf[ProductCategoryCQ]) {
                columnProductCategoryCode(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryProductStatus()
                    || qyCall().qy().xgetReferrerQuery().isInstanceOf[ProductStatusCQ]) {
                columnProductStatusCode(); // FK or one-to-one referrer
            }
        }
        @Override
        protected def getTableDbName(): String = { return "PRODUCT"; }
        /**
         * Prepare to specify functions about relation table. <br />
         * (商品カテゴリ)PRODUCT_CATEGORY by my PRODUCT_CATEGORY_CODE, named 'productCategory'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        def specifyProductCategory(): HpProductCategoryCB.HpSpecification = {
            assertRelation("productCategory");
            if (_productCategory == null) {
                _productCategory = new HpProductCategoryCB.HpSpecification(_baseCB, new HpSpQyCall[ProductCategoryCQ]() {
                    def has(): Boolean = { return _qyCall.has() && _qyCall.qy().hasConditionQueryProductCategory(); }
                    def qy(): ProductCategoryCQ = { return _qyCall.qy().queryProductCategory(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _productCategory.xsetSyncQyCall(new HpSpQyCall[ProductCategoryCQ]() {
                        def has(): Boolean = { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryProductCategory(); }
                        def qy(): ProductCategoryCQ = { return xsyncQyCall().qy().queryProductCategory(); }
                    });
                }
            }
            return _productCategory;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * (商品ステータス)PRODUCT_STATUS by my PRODUCT_STATUS_CODE, named 'productStatus'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        def specifyProductStatus(): HpProductStatusCB.HpSpecification = {
            assertRelation("productStatus");
            if (_productStatus == null) {
                _productStatus = new HpProductStatusCB.HpSpecification(_baseCB, new HpSpQyCall[ProductStatusCQ]() {
                    def has(): Boolean = { return _qyCall.has() && _qyCall.qy().hasConditionQueryProductStatus(); }
                    def qy(): ProductStatusCQ = { return _qyCall.qy().queryProductStatus(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _productStatus.xsetSyncQyCall(new HpSpQyCall[ProductStatusCQ]() {
                        def has(): Boolean = { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryProductStatus(); }
                        def qy(): ProductStatusCQ = { return xsyncQyCall().qy().queryProductStatus(); }
                    });
                }
            }
            return _productStatus;
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br />
         * {select max(FOO) from PURCHASE where ...) as FOO_MAX} <br />
         * (購入)PURCHASE by PRODUCT_ID, named 'purchaseList'.
         * <pre>
         * cb.specify().<span style="color: #DD4747">derivedPurchaseList()</span>.<span style="color: #DD4747">max</span>(new SubQuery&lt;PurchaseCB&gt;() {
         *     public void query(PurchaseCB subCB) {
         *         subCB.specify().<span style="color: #DD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
         *     }
         * }, DblePurchase.<span style="color: #DD4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        def derivedPurchaseList(): ScrHpSDRFunction[PurchaseCB, ProductCQ] = {
            assertDerived("purchaseList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return toScalaSDRFunction(new HpSDRFunction[PurchaseCB, ProductCQ](_baseCB, _qyCall.qy(), new HpSDRSetupper[PurchaseCB, ProductCQ]() {
                def setup(fn: String, sq: SubQuery[PurchaseCB], cq: ProductCQ, al: String, op: DerivedReferrerOption): Unit = {
                    cq.xsderivePurchaseList(fn, sq, al, op); } }, _dbmetaProvider));
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        def myselfDerived(): ScrHpSDRFunction[ProductCB, ProductCQ] = {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return toScalaSDRFunction(new HpSDRFunction[ProductCB, ProductCQ](_baseCB, _qyCall.qy(), new HpSDRSetupper[ProductCB, ProductCQ]() {
                def setup(fn: String, sq: SubQuery[ProductCB], cq: ProductCQ, al: String, op: DerivedReferrerOption): Unit = {
                    cq.xsmyselfDerive(fn, sq, al, op); } }, _dbmetaProvider));
        }
    }

    protected def toScalaSDRFunction[CB <: ConditionBean, CQ <: ConditionQuery](function: HpSDRFunction[CB, CQ]): ScrHpSDRFunction[CB, CQ] =
    { new ScrHpSDRFunction[CB, CQ](function) } 
}
