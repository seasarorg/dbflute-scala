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

/**
 * The base condition-bean of VENDOR_CHECK.
 * @author DBFlute(AutoGenerator)
 */
class BsVendorCheckCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected var _conditionQuery: VendorCheckCQ = null;

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
        return "VENDOR_CHECK";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param vendorCheckId : PK, NotNull, DECIMAL(16). (NotNull)
     * @return this. (NotNull)
     */
    def acceptPK(vendorCheckId: Long): VendorCheckCB = {
        assertObjectNotNull("vendorCheckId", vendorCheckId);
        val cb: BsVendorCheckCB = this;
        cb.query().setVendorCheckId_Equal(vendorCheckId);
        return this.asInstanceOf[VendorCheckCB];
    }

    def addOrderBy_PK_Asc(): ConditionBean = {
        query().addOrderBy_VendorCheckId_Asc();
        return this;
    }

    def addOrderBy_PK_Desc(): ConditionBean = {
        query().addOrderBy_VendorCheckId_Desc();
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
    def query(): VendorCheckCQ = {
        assertQueryPurpose(); // assert only when user-public query 
        return getConditionQuery();
    }

    def getConditionQuery(): VendorCheckCQ = { // public for parameter comment and internal
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected def createLocalCQ(): VendorCheckCQ = {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected def xcreateCQ(childQuery: ConditionQuery, sqlClause: SqlClause, aliasName: String, nestLevel: Integer): VendorCheckCQ = {
        val cq: VendorCheckCQ = xnewCQ(childQuery,  sqlClause,  aliasName,  nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected def xnewCQ(childQuery: ConditionQuery, sqlClause: SqlClause, aliasName: String, nestLevel: Integer): VendorCheckCQ = {
        return new VendorCheckCQ(childQuery, sqlClause, aliasName, nestLevel);
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
     * cb.query().<span style="color: #DD4747">union</span>(new UnionQuery&lt;VendorCheckCB&gt;() {
     *     public void query(VendorCheckCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    def union(unionQuery: UnionQuery[VendorCheckCB]): Unit = {
        val cb: VendorCheckCB = new VendorCheckCB(); cb.xsetupForUnion(this); xsyncUQ(cb); 
        try { lock(); unionQuery.query(cb); } finally { unlock(); }
        xsaveUCB(cb);
        val cq: VendorCheckCQ = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all' for base-point table. <br />
     * You don't need to call SetupSelect in union-query,
     * because it inherits calls before. (Don't call SetupSelect after here)
     * <pre>
     * cb.query().<span style="color: #DD4747">unionAll</span>(new UnionQuery&lt;VendorCheckCB&gt;() {
     *     public void query(VendorCheckCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union all'. (NotNull)
     */
    def unionAll(unionQuery: UnionQuery[VendorCheckCB]): Unit = {
        val cb: VendorCheckCB = new VendorCheckCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionQuery.query(cb); } finally { unlock(); }
        xsaveUCB(cb);
        val cq: VendorCheckCQ = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    // [DBFlute-0.7.4]
    // ===================================================================================
    //                                                                             Specify
    //                                                                             =======
    protected var _specification: HpVendorCheckCB.HpSpecification = null;

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
    def specify(): HpVendorCheckCB.HpSpecification = {
        assertSpecifyPurpose();
        if (_specification == null) { _specification = new HpVendorCheckCB.HpSpecification(this
            , new HpSpQyCall[VendorCheckCQ]() {
                def has(): Boolean = { return true; }
                def qy(): VendorCheckCQ = { return getConditionQuery(); }
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
     * cb.<span style="color: #DD4747">columnQuery</span>(new SpecifyQuery&lt;VendorCheckCB&gt;() {
     *     public void query(VendorCheckCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFoo()</span>; <span style="color: #3F7E5E">// left column</span>
     *     }
     * }).lessThan(new SpecifyQuery&lt;VendorCheckCB&gt;() {
     *     public void query(VendorCheckCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnBar()</span>; <span style="color: #3F7E5E">// right column</span>
     *     }
     * }); <span style="color: #3F7E5E">// you can calculate for right column like '}).plus(3);'</span>
     * </pre>
     * @param leftSpecifyQuery The specify-query for left column. (NotNull)
     * @return The object for setting up operand and right column. (NotNull)
     */
    def columnQuery(leftSpecifyQuery: (VendorCheckCB) => Unit): ScrHpColQyOperand[VendorCheckCB] = {
        return new ScrHpColQyOperand[VendorCheckCB](new HpColQyHandler[VendorCheckCB]() {
            def handle(rightSp: SpecifyQuery[VendorCheckCB], operand: String): HpCalculator = {
                return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), new SpecifyQuery[VendorCheckCB]() {
                    def specify(cb: VendorCheckCB): Unit = { leftSpecifyQuery(cb); }
                }, rightSp, operand);
            }
        });
    }

    protected def xcreateColumnQueryCB(): VendorCheckCB = {
        val cb: VendorCheckCB = new VendorCheckCB();
        cb.xsetupForColumnQuery(this.asInstanceOf[VendorCheckCB]);
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
    def dreamCruiseCB(): VendorCheckCB = {
        val cb: VendorCheckCB = new VendorCheckCB();
        cb.xsetupForDreamCruise(this.asInstanceOf[VendorCheckCB]);
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
     * cb.<span style="color: #DD4747">orScopeQuery</span>(new OrQuery&lt;VendorCheckCB&gt;() {
     *     public void query(VendorCheckCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.query().setBAR_Equal...
     *     }
     * });
     * </pre>
     * @param orQuery The query for or-condition. (NotNull)
     */
    def orScopeQuery(orQuery: (VendorCheckCB) => Unit): Unit = {
        xorSQ(this.asInstanceOf[VendorCheckCB], new OrQuery[VendorCheckCB]{
            def query(orCB: VendorCheckCB): Unit = { orQuery(orCB); }
        });
    }

    /**
     * Set up the and-part of or-scope. <br />
     * (However nested or-scope query and as-or-split of like-search in and-part are unsupported)
     * <pre>
     * <span style="color: #3F7E5E">// where (FOO = '...' or (BAR = '...' and QUX = '...'))</span>
     * cb.<span style="color: #DD4747">orScopeQuery</span>(new OrQuery&lt;VendorCheckCB&gt;() {
     *     public void query(VendorCheckCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.<span style="color: #DD4747">orScopeQueryAndPart</span>(new AndQuery&lt;VendorCheckCB&gt;() {
     *             public void query(VendorCheckCB andCB) {
     *                 andCB.query().setBar_...
     *                 andCB.query().setQux_...
     *             }
     *         });
     *     }
     * });
     * </pre>
     * @param andQuery The query for and-condition. (NotNull)
     */
    def orScopeQueryAndPart(andQuery: (VendorCheckCB) => Unit): Unit = {
        xorSQAP(this.asInstanceOf[VendorCheckCB], new AndQuery[VendorCheckCB] {
            def query(cb: VendorCheckCB): Unit = { andQuery(cb); }
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
        val cb: VendorCheckCB = if (mainCB != null) {
            mainCB.asInstanceOf[VendorCheckCB];
        } else {
            new VendorCheckCB();
        }
        specify().xsetSyncQyCall(new HpSpQyCall[VendorCheckCQ]() {
            def has(): Boolean = { return true; }
            def qy(): VendorCheckCQ = { return cb.query(); }
        });
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected def getConditionBeanClassNameInternally(): String = { return classOf[VendorCheckCB].getName(); }
    protected def getConditionQueryClassNameInternally(): String = { return classOf[VendorCheckCQ].getName(); }
    protected def getSubQueryClassNameInternally(): String = { return classOf[SubQuery[_]].getName(); }
    protected def getConditionOptionClassNameInternally(): String = { return classOf[ConditionOption].getName(); }
}

/**
 * The singleton object to define condition-bean's specification.
 * @author DBFlute(AutoGenerator)
 */
object HpVendorCheckCB {

    class HpSpecification(baseCB: ConditionBean, qyCall: HpSpQyCall[VendorCheckCQ], purpose: HpCBPurpose, dbmetaProvider: DBMetaProvider)
            extends HpAbstractSpecification[VendorCheckCQ](baseCB, qyCall, purpose, dbmetaProvider) {
        /**
         * VENDOR_CHECK_ID: {PK, NotNull, DECIMAL(16)}
         * @return The information object of specified column. (NotNull)
         */
        def columnVendorCheckId(): HpSpecifiedColumn = { return doColumn("VENDOR_CHECK_ID"); }
        /**
         * TYPE_OF_CHAR: {CHAR(3)}
         * @return The information object of specified column. (NotNull)
         */
        def columnTypeOfChar(): HpSpecifiedColumn = { return doColumn("TYPE_OF_CHAR"); }
        /**
         * TYPE_OF_VARCHAR: {VARCHAR(32)}
         * @return The information object of specified column. (NotNull)
         */
        def columnTypeOfVarchar(): HpSpecifiedColumn = { return doColumn("TYPE_OF_VARCHAR"); }
        /**
         * TYPE_OF_CLOB: {CLOB(2147483647)}
         * @return The information object of specified column. (NotNull)
         */
        def columnTypeOfClob(): HpSpecifiedColumn = { return doColumn("TYPE_OF_CLOB"); }
        /**
         * TYPE_OF_TEXT: {CLOB(2147483647)}
         * @return The information object of specified column. (NotNull)
         */
        def columnTypeOfText(): HpSpecifiedColumn = { return doColumn("TYPE_OF_TEXT"); }
        /**
         * TYPE_OF_NUMERIC_INTEGER: {DECIMAL(5)}
         * @return The information object of specified column. (NotNull)
         */
        def columnTypeOfNumericInteger(): HpSpecifiedColumn = { return doColumn("TYPE_OF_NUMERIC_INTEGER"); }
        /**
         * TYPE_OF_NUMERIC_BIGINT: {DECIMAL(12)}
         * @return The information object of specified column. (NotNull)
         */
        def columnTypeOfNumericBigint(): HpSpecifiedColumn = { return doColumn("TYPE_OF_NUMERIC_BIGINT"); }
        /**
         * TYPE_OF_NUMERIC_DECIMAL: {DECIMAL(5, 3)}
         * @return The information object of specified column. (NotNull)
         */
        def columnTypeOfNumericDecimal(): HpSpecifiedColumn = { return doColumn("TYPE_OF_NUMERIC_DECIMAL"); }
        /**
         * TYPE_OF_NUMERIC_INTEGER_MIN: {DECIMAL(1)}
         * @return The information object of specified column. (NotNull)
         */
        def columnTypeOfNumericIntegerMin(): HpSpecifiedColumn = { return doColumn("TYPE_OF_NUMERIC_INTEGER_MIN"); }
        /**
         * TYPE_OF_NUMERIC_INTEGER_MAX: {DECIMAL(9)}
         * @return The information object of specified column. (NotNull)
         */
        def columnTypeOfNumericIntegerMax(): HpSpecifiedColumn = { return doColumn("TYPE_OF_NUMERIC_INTEGER_MAX"); }
        /**
         * TYPE_OF_NUMERIC_BIGINT_MIN: {DECIMAL(10)}
         * @return The information object of specified column. (NotNull)
         */
        def columnTypeOfNumericBigintMin(): HpSpecifiedColumn = { return doColumn("TYPE_OF_NUMERIC_BIGINT_MIN"); }
        /**
         * TYPE_OF_NUMERIC_BIGINT_MAX: {DECIMAL(18)}
         * @return The information object of specified column. (NotNull)
         */
        def columnTypeOfNumericBigintMax(): HpSpecifiedColumn = { return doColumn("TYPE_OF_NUMERIC_BIGINT_MAX"); }
        /**
         * TYPE_OF_NUMERIC_SUPERINT_MIN: {DECIMAL(19)}
         * @return The information object of specified column. (NotNull)
         */
        def columnTypeOfNumericSuperintMin(): HpSpecifiedColumn = { return doColumn("TYPE_OF_NUMERIC_SUPERINT_MIN"); }
        /**
         * TYPE_OF_NUMERIC_SUPERINT_MAX: {DECIMAL(38)}
         * @return The information object of specified column. (NotNull)
         */
        def columnTypeOfNumericSuperintMax(): HpSpecifiedColumn = { return doColumn("TYPE_OF_NUMERIC_SUPERINT_MAX"); }
        /**
         * TYPE_OF_NUMERIC_MAXDECIMAL: {DECIMAL(38, 38)}
         * @return The information object of specified column. (NotNull)
         */
        def columnTypeOfNumericMaxdecimal(): HpSpecifiedColumn = { return doColumn("TYPE_OF_NUMERIC_MAXDECIMAL"); }
        /**
         * TYPE_OF_INTEGER: {INTEGER(10)}
         * @return The information object of specified column. (NotNull)
         */
        def columnTypeOfInteger(): HpSpecifiedColumn = { return doColumn("TYPE_OF_INTEGER"); }
        /**
         * TYPE_OF_BIGINT: {BIGINT(19)}
         * @return The information object of specified column. (NotNull)
         */
        def columnTypeOfBigint(): HpSpecifiedColumn = { return doColumn("TYPE_OF_BIGINT"); }
        /**
         * TYPE_OF_DATE: {DATE(8)}
         * @return The information object of specified column. (NotNull)
         */
        def columnTypeOfDate(): HpSpecifiedColumn = { return doColumn("TYPE_OF_DATE"); }
        /**
         * TYPE_OF_TIMESTAMP: {TIMESTAMP(23, 10)}
         * @return The information object of specified column. (NotNull)
         */
        def columnTypeOfTimestamp(): HpSpecifiedColumn = { return doColumn("TYPE_OF_TIMESTAMP"); }
        /**
         * TYPE_OF_TIME: {TIME(6)}
         * @return The information object of specified column. (NotNull)
         */
        def columnTypeOfTime(): HpSpecifiedColumn = { return doColumn("TYPE_OF_TIME"); }
        /**
         * TYPE_OF_BOOLEAN: {BOOLEAN(1)}
         * @return The information object of specified column. (NotNull)
         */
        def columnTypeOfBoolean(): HpSpecifiedColumn = { return doColumn("TYPE_OF_BOOLEAN"); }
        /**
         * TYPE_OF_BINARY: {VARBINARY(2147483647)}
         * @return The information object of specified column. (NotNull)
         */
        def columnTypeOfBinary(): HpSpecifiedColumn = { return doColumn("TYPE_OF_BINARY"); }
        /**
         * TYPE_OF_BLOB: {BLOB(2147483647)}
         * @return The information object of specified column. (NotNull)
         */
        def columnTypeOfBlob(): HpSpecifiedColumn = { return doColumn("TYPE_OF_BLOB"); }
        /**
         * TYPE_OF_UUID: {UUID(2147483647)}
         * @return The information object of specified column. (NotNull)
         */
        def columnTypeOfUuid(): HpSpecifiedColumn = { return doColumn("TYPE_OF_UUID"); }
        /**
         * TYPE_OF_ARRAY: {ARRAY}
         * @return The information object of specified column. (NotNull)
         */
        def columnTypeOfArray(): HpSpecifiedColumn = { return doColumn("TYPE_OF_ARRAY"); }
        /**
         * TYPE_OF_OTHER: {OTHER(2147483647)}
         * @return The information object of specified column. (NotNull)
         */
        def columnTypeOfOther(): HpSpecifiedColumn = { return doColumn("TYPE_OF_OTHER"); }
        /**
         * J_A_V_A_BEANS_PROPERTY: {VARCHAR(10)}
         * @return The information object of specified column. (NotNull)
         */
        def columnJAVABeansProperty(): HpSpecifiedColumn = { return doColumn("J_A_V_A_BEANS_PROPERTY"); }
        /**
         * J_POP_BEANS_PROPERTY: {VARCHAR(10)}
         * @return The information object of specified column. (NotNull)
         */
        def columnJPopBeansProperty(): HpSpecifiedColumn = { return doColumn("J_POP_BEANS_PROPERTY"); }
        def everyColumn(): Unit = { doEveryColumn(); }
        def exceptRecordMetaColumn(): Unit = { doExceptRecordMetaColumn(); }
        @Override
        protected def doSpecifyRequiredColumn(): Unit = {
            columnVendorCheckId(); // PK
        }
        @Override
        protected def getTableDbName(): String = { return "VENDOR_CHECK"; }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        def myselfDerived(): ScrHpSDRFunction[VendorCheckCB, VendorCheckCQ] = {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return toScalaSDRFunction(new HpSDRFunction[VendorCheckCB, VendorCheckCQ](_baseCB, _qyCall.qy(), new HpSDRSetupper[VendorCheckCB, VendorCheckCQ]() {
                def setup(fn: String, sq: SubQuery[VendorCheckCB], cq: VendorCheckCQ, al: String, op: DerivedReferrerOption): Unit = {
                    cq.xsmyselfDerive(fn, sq, al, op); } }, _dbmetaProvider));
        }
    }

    protected def toScalaSDRFunction[CB <: ConditionBean, CQ <: ConditionQuery](function: HpSDRFunction[CB, CQ]): ScrHpSDRFunction[CB, CQ] =
    { new ScrHpSDRFunction[CB, CQ](function) } 
}
