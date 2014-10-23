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
 * The base condition-bean of MEMBER.
 * @author DBFlute(AutoGenerator)
 */
class BsMemberCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected var _conditionQuery: MemberCQ = null;

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
        return "MEMBER";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param memberId (会員ID): PK, ID, NotNull, INTEGER(10). (NotNull)
     * @return this. (NotNull)
     */
    def acceptPK(memberId: Integer): MemberCB = {
        assertObjectNotNull("memberId", memberId);
        val cb: BsMemberCB = this;
        cb.query().setMemberId_Equal(memberId);
        return this.asInstanceOf[MemberCB];
    }

    /**
     * Accept the query condition of unique key as equal.
     * @param memberAccount (会員アカウント): UQ, NotNull, VARCHAR(50). (NotNull)
     * @return this. (NotNull)
     */
    def acceptUniqueOf(memberAccount: String): MemberCB = {
        assertObjectNotNull("memberAccount", memberAccount);
        val cb: BsMemberCB = this;
        cb.query().setMemberAccount_Equal(memberAccount);
        return this.asInstanceOf[MemberCB];
    }

    def addOrderBy_PK_Asc(): ConditionBean = {
        query().addOrderBy_MemberId_Asc();
        return this;
    }

    def addOrderBy_PK_Desc(): ConditionBean = {
        query().addOrderBy_MemberId_Desc();
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
    def query(): MemberCQ = {
        assertQueryPurpose(); // assert only when user-public query 
        return getConditionQuery();
    }

    def getConditionQuery(): MemberCQ = { // public for parameter comment and internal
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected def createLocalCQ(): MemberCQ = {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected def xcreateCQ(childQuery: ConditionQuery, sqlClause: SqlClause, aliasName: String, nestLevel: Integer): MemberCQ = {
        val cq: MemberCQ = xnewCQ(childQuery,  sqlClause,  aliasName,  nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected def xnewCQ(childQuery: ConditionQuery, sqlClause: SqlClause, aliasName: String, nestLevel: Integer): MemberCQ = {
        return new MemberCQ(childQuery, sqlClause, aliasName, nestLevel);
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
     * cb.query().<span style="color: #DD4747">union</span>(new UnionQuery&lt;MemberCB&gt;() {
     *     public void query(MemberCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    def union(unionQuery: UnionQuery[MemberCB]): Unit = {
        val cb: MemberCB = new MemberCB(); cb.xsetupForUnion(this); xsyncUQ(cb); 
        try { lock(); unionQuery.query(cb); } finally { unlock(); }
        xsaveUCB(cb);
        val cq: MemberCQ = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all' for base-point table. <br />
     * You don't need to call SetupSelect in union-query,
     * because it inherits calls before. (Don't call SetupSelect after here)
     * <pre>
     * cb.query().<span style="color: #DD4747">unionAll</span>(new UnionQuery&lt;MemberCB&gt;() {
     *     public void query(MemberCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union all'. (NotNull)
     */
    def unionAll(unionQuery: UnionQuery[MemberCB]): Unit = {
        val cb: MemberCB = new MemberCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionQuery.query(cb); } finally { unlock(); }
        xsaveUCB(cb);
        val cq: MemberCQ = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    /**
     * Set up relation columns to select clause. <br />
     * (会員ステータス)MEMBER_STATUS by my MEMBER_STATUS_CODE, named 'memberStatus'.
     * <pre>
     * MemberCB cb = new MemberCB();
     * cb.<span style="color: #DD4747">setupSelect_MemberStatus()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * DbleMember member = memberBhv.selectEntityWithDeletedCheck(cb);
     * ... = member.<span style="color: #DD4747">getMemberStatus()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     */
    def setupSelect_MemberStatus(): Unit = {
        assertSetupSelectPurpose("memberStatus");
        if (hasSpecifiedColumn()) { // if reverse call
            specify().columnMemberStatusCode();
        }
        doSetupSelect(new SsCall() { def qf(): ConditionQuery = { return query().queryMemberStatus(); } });
    }

    protected var _nssMemberSecurityAsOne: MemberSecurityNss = null;
    def getNssMemberSecurityAsOne(): MemberSecurityNss = {
        if (_nssMemberSecurityAsOne == null) { _nssMemberSecurityAsOne = new MemberSecurityNss(null); }
        return _nssMemberSecurityAsOne;
    }
    /**
     * Set up relation columns to select clause. <br />
     * (会員セキュリティ情報)MEMBER_SECURITY by MEMBER_ID, named 'memberSecurityAsOne'.
     * <pre>
     * MemberCB cb = new MemberCB();
     * cb.<span style="color: #DD4747">setupSelect_MemberSecurityAsOne()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * DbleMember member = memberBhv.selectEntityWithDeletedCheck(cb);
     * ... = member.<span style="color: #DD4747">getMemberSecurityAsOne()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    def setupSelect_MemberSecurityAsOne(): MemberSecurityNss = {
        assertSetupSelectPurpose("memberSecurityAsOne");
        doSetupSelect(new SsCall() { def qf(): ConditionQuery = { return query().queryMemberSecurityAsOne(); } });
        if (_nssMemberSecurityAsOne == null || !_nssMemberSecurityAsOne.hasConditionQuery()) { _nssMemberSecurityAsOne = new MemberSecurityNss(query().queryMemberSecurityAsOne()); }
        return _nssMemberSecurityAsOne;
    }

    protected var _nssMemberServiceAsOne: MemberServiceNss = null;
    def getNssMemberServiceAsOne(): MemberServiceNss = {
        if (_nssMemberServiceAsOne == null) { _nssMemberServiceAsOne = new MemberServiceNss(null); }
        return _nssMemberServiceAsOne;
    }
    /**
     * Set up relation columns to select clause. <br />
     * (会員サービス)MEMBER_SERVICE by MEMBER_ID, named 'memberServiceAsOne'.
     * <pre>
     * MemberCB cb = new MemberCB();
     * cb.<span style="color: #DD4747">setupSelect_MemberServiceAsOne()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * DbleMember member = memberBhv.selectEntityWithDeletedCheck(cb);
     * ... = member.<span style="color: #DD4747">getMemberServiceAsOne()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    def setupSelect_MemberServiceAsOne(): MemberServiceNss = {
        assertSetupSelectPurpose("memberServiceAsOne");
        doSetupSelect(new SsCall() { def qf(): ConditionQuery = { return query().queryMemberServiceAsOne(); } });
        if (_nssMemberServiceAsOne == null || !_nssMemberServiceAsOne.hasConditionQuery()) { _nssMemberServiceAsOne = new MemberServiceNss(query().queryMemberServiceAsOne()); }
        return _nssMemberServiceAsOne;
    }

    protected var _nssMemberWithdrawalAsOne: MemberWithdrawalNss = null;
    def getNssMemberWithdrawalAsOne(): MemberWithdrawalNss = {
        if (_nssMemberWithdrawalAsOne == null) { _nssMemberWithdrawalAsOne = new MemberWithdrawalNss(null); }
        return _nssMemberWithdrawalAsOne;
    }
    /**
     * Set up relation columns to select clause. <br />
     * (会員退会情報)MEMBER_WITHDRAWAL by MEMBER_ID, named 'memberWithdrawalAsOne'.
     * <pre>
     * MemberCB cb = new MemberCB();
     * cb.<span style="color: #DD4747">setupSelect_MemberWithdrawalAsOne()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * DbleMember member = memberBhv.selectEntityWithDeletedCheck(cb);
     * ... = member.<span style="color: #DD4747">getMemberWithdrawalAsOne()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    def setupSelect_MemberWithdrawalAsOne(): MemberWithdrawalNss = {
        assertSetupSelectPurpose("memberWithdrawalAsOne");
        doSetupSelect(new SsCall() { def qf(): ConditionQuery = { return query().queryMemberWithdrawalAsOne(); } });
        if (_nssMemberWithdrawalAsOne == null || !_nssMemberWithdrawalAsOne.hasConditionQuery()) { _nssMemberWithdrawalAsOne = new MemberWithdrawalNss(query().queryMemberWithdrawalAsOne()); }
        return _nssMemberWithdrawalAsOne;
    }

    // [DBFlute-0.7.4]
    // ===================================================================================
    //                                                                             Specify
    //                                                                             =======
    protected var _specification: HpMemberCB.HpSpecification = null;

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
    def specify(): HpMemberCB.HpSpecification = {
        assertSpecifyPurpose();
        if (_specification == null) { _specification = new HpMemberCB.HpSpecification(this
            , new HpSpQyCall[MemberCQ]() {
                def has(): Boolean = { return true; }
                def qy(): MemberCQ = { return getConditionQuery(); }
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
     * cb.<span style="color: #DD4747">columnQuery</span>(new SpecifyQuery&lt;MemberCB&gt;() {
     *     public void query(MemberCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFoo()</span>; <span style="color: #3F7E5E">// left column</span>
     *     }
     * }).lessThan(new SpecifyQuery&lt;MemberCB&gt;() {
     *     public void query(MemberCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnBar()</span>; <span style="color: #3F7E5E">// right column</span>
     *     }
     * }); <span style="color: #3F7E5E">// you can calculate for right column like '}).plus(3);'</span>
     * </pre>
     * @param leftSpecifyQuery The specify-query for left column. (NotNull)
     * @return The object for setting up operand and right column. (NotNull)
     */
    def columnQuery(leftSpecifyQuery: (MemberCB) => Unit): ScrHpColQyOperand[MemberCB] = {
        return new ScrHpColQyOperand[MemberCB](new HpColQyHandler[MemberCB]() {
            def handle(rightSp: SpecifyQuery[MemberCB], operand: String): HpCalculator = {
                return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), new SpecifyQuery[MemberCB]() {
                    def specify(cb: MemberCB): Unit = { leftSpecifyQuery(cb); }
                }, rightSp, operand);
            }
        });
    }

    protected def xcreateColumnQueryCB(): MemberCB = {
        val cb: MemberCB = new MemberCB();
        cb.xsetupForColumnQuery(this.asInstanceOf[MemberCB]);
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
    def dreamCruiseCB(): MemberCB = {
        val cb: MemberCB = new MemberCB();
        cb.xsetupForDreamCruise(this.asInstanceOf[MemberCB]);
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
     * cb.<span style="color: #DD4747">orScopeQuery</span>(new OrQuery&lt;MemberCB&gt;() {
     *     public void query(MemberCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.query().setBAR_Equal...
     *     }
     * });
     * </pre>
     * @param orQuery The query for or-condition. (NotNull)
     */
    def orScopeQuery(orQuery: (MemberCB) => Unit): Unit = {
        xorSQ(this.asInstanceOf[MemberCB], new OrQuery[MemberCB]{
            def query(orCB: MemberCB): Unit = { orQuery(orCB); }
        });
    }

    /**
     * Set up the and-part of or-scope. <br />
     * (However nested or-scope query and as-or-split of like-search in and-part are unsupported)
     * <pre>
     * <span style="color: #3F7E5E">// where (FOO = '...' or (BAR = '...' and QUX = '...'))</span>
     * cb.<span style="color: #DD4747">orScopeQuery</span>(new OrQuery&lt;MemberCB&gt;() {
     *     public void query(MemberCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.<span style="color: #DD4747">orScopeQueryAndPart</span>(new AndQuery&lt;MemberCB&gt;() {
     *             public void query(MemberCB andCB) {
     *                 andCB.query().setBar_...
     *                 andCB.query().setQux_...
     *             }
     *         });
     *     }
     * });
     * </pre>
     * @param andQuery The query for and-condition. (NotNull)
     */
    def orScopeQueryAndPart(andQuery: (MemberCB) => Unit): Unit = {
        xorSQAP(this.asInstanceOf[MemberCB], new AndQuery[MemberCB] {
            def query(cb: MemberCB): Unit = { andQuery(cb); }
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
        val cb: MemberCB = if (mainCB != null) {
            mainCB.asInstanceOf[MemberCB];
        } else {
            new MemberCB();
        }
        specify().xsetSyncQyCall(new HpSpQyCall[MemberCQ]() {
            def has(): Boolean = { return true; }
            def qy(): MemberCQ = { return cb.query(); }
        });
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected def getConditionBeanClassNameInternally(): String = { return classOf[MemberCB].getName(); }
    protected def getConditionQueryClassNameInternally(): String = { return classOf[MemberCQ].getName(); }
    protected def getSubQueryClassNameInternally(): String = { return classOf[SubQuery[_]].getName(); }
    protected def getConditionOptionClassNameInternally(): String = { return classOf[ConditionOption].getName(); }
}

/**
 * The singleton object to define condition-bean's specification.
 * @author DBFlute(AutoGenerator)
 */
object HpMemberCB {

    class HpSpecification(baseCB: ConditionBean, qyCall: HpSpQyCall[MemberCQ], purpose: HpCBPurpose, dbmetaProvider: DBMetaProvider)
            extends HpAbstractSpecification[MemberCQ](baseCB, qyCall, purpose, dbmetaProvider) {
        protected var _memberStatus: HpMemberStatusCB.HpSpecification = null;
        protected var _memberSecurityAsOne: HpMemberSecurityCB.HpSpecification = null;
        protected var _memberServiceAsOne: HpMemberServiceCB.HpSpecification = null;
        protected var _memberWithdrawalAsOne: HpMemberWithdrawalCB.HpSpecification = null;
        /**
         * (会員ID)MEMBER_ID: {PK, ID, NotNull, INTEGER(10)}
         * @return The information object of specified column. (NotNull)
         */
        def columnMemberId(): HpSpecifiedColumn = { return doColumn("MEMBER_ID"); }
        /**
         * (会員名称)MEMBER_NAME: {IX, NotNull, VARCHAR(200)}
         * @return The information object of specified column. (NotNull)
         */
        def columnMemberName(): HpSpecifiedColumn = { return doColumn("MEMBER_NAME"); }
        /**
         * (会員アカウント)MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR(50)}
         * @return The information object of specified column. (NotNull)
         */
        def columnMemberAccount(): HpSpecifiedColumn = { return doColumn("MEMBER_ACCOUNT"); }
        /**
         * (会員ステータスコード)MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus}
         * @return The information object of specified column. (NotNull)
         */
        def columnMemberStatusCode(): HpSpecifiedColumn = { return doColumn("MEMBER_STATUS_CODE"); }
        /**
         * (正式会員日時)FORMALIZED_DATETIME: {IX, TIMESTAMP(23, 10)}
         * @return The information object of specified column. (NotNull)
         */
        def columnFormalizedDatetime(): HpSpecifiedColumn = { return doColumn("FORMALIZED_DATETIME"); }
        /**
         * (生年月日)BIRTHDATE: {DATE(8)}
         * @return The information object of specified column. (NotNull)
         */
        def columnBirthdate(): HpSpecifiedColumn = { return doColumn("BIRTHDATE"); }
        /**
         * (登録日時)REGISTER_DATETIME: {NotNull, TIMESTAMP(23, 10)}
         * @return The information object of specified column. (NotNull)
         */
        def columnRegisterDatetime(): HpSpecifiedColumn = { return doColumn("REGISTER_DATETIME"); }
        /**
         * (登録ユーザ)REGISTER_USER: {NotNull, VARCHAR(200)}
         * @return The information object of specified column. (NotNull)
         */
        def columnRegisterUser(): HpSpecifiedColumn = { return doColumn("REGISTER_USER"); }
        /**
         * (更新日時)UPDATE_DATETIME: {NotNull, TIMESTAMP(23, 10)}
         * @return The information object of specified column. (NotNull)
         */
        def columnUpdateDatetime(): HpSpecifiedColumn = { return doColumn("UPDATE_DATETIME"); }
        /**
         * (更新ユーザ)UPDATE_USER: {NotNull, VARCHAR(200)}
         * @return The information object of specified column. (NotNull)
         */
        def columnUpdateUser(): HpSpecifiedColumn = { return doColumn("UPDATE_USER"); }
        /**
         * (バージョンNO)VERSION_NO: {NotNull, BIGINT(19)}
         * @return The information object of specified column. (NotNull)
         */
        def columnVersionNo(): HpSpecifiedColumn = { return doColumn("VERSION_NO"); }
        def everyColumn(): Unit = { doEveryColumn(); }
        def exceptRecordMetaColumn(): Unit = { doExceptRecordMetaColumn(); }
        @Override
        protected def doSpecifyRequiredColumn(): Unit = {
            columnMemberId(); // PK
            if (qyCall().qy().hasConditionQueryMemberStatus()
                    || qyCall().qy().xgetReferrerQuery().isInstanceOf[MemberStatusCQ]) {
                columnMemberStatusCode(); // FK or one-to-one referrer
            }
        }
        @Override
        protected def getTableDbName(): String = { return "MEMBER"; }
        /**
         * Prepare to specify functions about relation table. <br />
         * (会員ステータス)MEMBER_STATUS by my MEMBER_STATUS_CODE, named 'memberStatus'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        def specifyMemberStatus(): HpMemberStatusCB.HpSpecification = {
            assertRelation("memberStatus");
            if (_memberStatus == null) {
                _memberStatus = new HpMemberStatusCB.HpSpecification(_baseCB, new HpSpQyCall[MemberStatusCQ]() {
                    def has(): Boolean = { return _qyCall.has() && _qyCall.qy().hasConditionQueryMemberStatus(); }
                    def qy(): MemberStatusCQ = { return _qyCall.qy().queryMemberStatus(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _memberStatus.xsetSyncQyCall(new HpSpQyCall[MemberStatusCQ]() {
                        def has(): Boolean = { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberStatus(); }
                        def qy(): MemberStatusCQ = { return xsyncQyCall().qy().queryMemberStatus(); }
                    });
                }
            }
            return _memberStatus;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * (会員セキュリティ情報)MEMBER_SECURITY by MEMBER_ID, named 'memberSecurityAsOne'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        def specifyMemberSecurityAsOne(): HpMemberSecurityCB.HpSpecification = {
            assertRelation("memberSecurityAsOne");
            if (_memberSecurityAsOne == null) {
                _memberSecurityAsOne = new HpMemberSecurityCB.HpSpecification(_baseCB, new HpSpQyCall[MemberSecurityCQ]() {
                    def has(): Boolean = { return _qyCall.has() && _qyCall.qy().hasConditionQueryMemberSecurityAsOne(); }
                    def qy(): MemberSecurityCQ = { return _qyCall.qy().queryMemberSecurityAsOne(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _memberSecurityAsOne.xsetSyncQyCall(new HpSpQyCall[MemberSecurityCQ]() {
                        def has(): Boolean = { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberSecurityAsOne(); }
                        def qy(): MemberSecurityCQ = { return xsyncQyCall().qy().queryMemberSecurityAsOne(); }
                    });
                }
            }
            return _memberSecurityAsOne;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * (会員サービス)MEMBER_SERVICE by MEMBER_ID, named 'memberServiceAsOne'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        def specifyMemberServiceAsOne(): HpMemberServiceCB.HpSpecification = {
            assertRelation("memberServiceAsOne");
            if (_memberServiceAsOne == null) {
                _memberServiceAsOne = new HpMemberServiceCB.HpSpecification(_baseCB, new HpSpQyCall[MemberServiceCQ]() {
                    def has(): Boolean = { return _qyCall.has() && _qyCall.qy().hasConditionQueryMemberServiceAsOne(); }
                    def qy(): MemberServiceCQ = { return _qyCall.qy().queryMemberServiceAsOne(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _memberServiceAsOne.xsetSyncQyCall(new HpSpQyCall[MemberServiceCQ]() {
                        def has(): Boolean = { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberServiceAsOne(); }
                        def qy(): MemberServiceCQ = { return xsyncQyCall().qy().queryMemberServiceAsOne(); }
                    });
                }
            }
            return _memberServiceAsOne;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * (会員退会情報)MEMBER_WITHDRAWAL by MEMBER_ID, named 'memberWithdrawalAsOne'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        def specifyMemberWithdrawalAsOne(): HpMemberWithdrawalCB.HpSpecification = {
            assertRelation("memberWithdrawalAsOne");
            if (_memberWithdrawalAsOne == null) {
                _memberWithdrawalAsOne = new HpMemberWithdrawalCB.HpSpecification(_baseCB, new HpSpQyCall[MemberWithdrawalCQ]() {
                    def has(): Boolean = { return _qyCall.has() && _qyCall.qy().hasConditionQueryMemberWithdrawalAsOne(); }
                    def qy(): MemberWithdrawalCQ = { return _qyCall.qy().queryMemberWithdrawalAsOne(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _memberWithdrawalAsOne.xsetSyncQyCall(new HpSpQyCall[MemberWithdrawalCQ]() {
                        def has(): Boolean = { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberWithdrawalAsOne(); }
                        def qy(): MemberWithdrawalCQ = { return xsyncQyCall().qy().queryMemberWithdrawalAsOne(); }
                    });
                }
            }
            return _memberWithdrawalAsOne;
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br />
         * {select max(FOO) from MEMBER_ADDRESS where ...) as FOO_MAX} <br />
         * (会員住所情報)MEMBER_ADDRESS by MEMBER_ID, named 'memberAddressList'.
         * <pre>
         * cb.specify().<span style="color: #DD4747">derivedMemberAddressList()</span>.<span style="color: #DD4747">max</span>(new SubQuery&lt;MemberAddressCB&gt;() {
         *     public void query(MemberAddressCB subCB) {
         *         subCB.specify().<span style="color: #DD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
         *     }
         * }, DbleMemberAddress.<span style="color: #DD4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        def derivedMemberAddressList(): ScrHpSDRFunction[MemberAddressCB, MemberCQ] = {
            assertDerived("memberAddressList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return toScalaSDRFunction(new HpSDRFunction[MemberAddressCB, MemberCQ](_baseCB, _qyCall.qy(), new HpSDRSetupper[MemberAddressCB, MemberCQ]() {
                def setup(fn: String, sq: SubQuery[MemberAddressCB], cq: MemberCQ, al: String, op: DerivedReferrerOption): Unit = {
                    cq.xsderiveMemberAddressList(fn, sq, al, op); } }, _dbmetaProvider));
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br />
         * {select max(FOO) from MEMBER_FOLLOWING where ...) as FOO_MAX} <br />
         * (会員フォローイング)MEMBER_FOLLOWING by MY_MEMBER_ID, named 'memberFollowingByMyMemberIdList'.
         * <pre>
         * cb.specify().<span style="color: #DD4747">derivedMemberFollowingByMyMemberIdList()</span>.<span style="color: #DD4747">max</span>(new SubQuery&lt;MemberFollowingCB&gt;() {
         *     public void query(MemberFollowingCB subCB) {
         *         subCB.specify().<span style="color: #DD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
         *     }
         * }, DbleMemberFollowing.<span style="color: #DD4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        def derivedMemberFollowingByMyMemberIdList(): ScrHpSDRFunction[MemberFollowingCB, MemberCQ] = {
            assertDerived("memberFollowingByMyMemberIdList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return toScalaSDRFunction(new HpSDRFunction[MemberFollowingCB, MemberCQ](_baseCB, _qyCall.qy(), new HpSDRSetupper[MemberFollowingCB, MemberCQ]() {
                def setup(fn: String, sq: SubQuery[MemberFollowingCB], cq: MemberCQ, al: String, op: DerivedReferrerOption): Unit = {
                    cq.xsderiveMemberFollowingByMyMemberIdList(fn, sq, al, op); } }, _dbmetaProvider));
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br />
         * {select max(FOO) from MEMBER_FOLLOWING where ...) as FOO_MAX} <br />
         * (会員フォローイング)MEMBER_FOLLOWING by YOUR_MEMBER_ID, named 'memberFollowingByYourMemberIdList'.
         * <pre>
         * cb.specify().<span style="color: #DD4747">derivedMemberFollowingByYourMemberIdList()</span>.<span style="color: #DD4747">max</span>(new SubQuery&lt;MemberFollowingCB&gt;() {
         *     public void query(MemberFollowingCB subCB) {
         *         subCB.specify().<span style="color: #DD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
         *     }
         * }, DbleMemberFollowing.<span style="color: #DD4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        def derivedMemberFollowingByYourMemberIdList(): ScrHpSDRFunction[MemberFollowingCB, MemberCQ] = {
            assertDerived("memberFollowingByYourMemberIdList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return toScalaSDRFunction(new HpSDRFunction[MemberFollowingCB, MemberCQ](_baseCB, _qyCall.qy(), new HpSDRSetupper[MemberFollowingCB, MemberCQ]() {
                def setup(fn: String, sq: SubQuery[MemberFollowingCB], cq: MemberCQ, al: String, op: DerivedReferrerOption): Unit = {
                    cq.xsderiveMemberFollowingByYourMemberIdList(fn, sq, al, op); } }, _dbmetaProvider));
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br />
         * {select max(FOO) from MEMBER_LOGIN where ...) as FOO_MAX} <br />
         * (会員ログイン)MEMBER_LOGIN by MEMBER_ID, named 'memberLoginList'.
         * <pre>
         * cb.specify().<span style="color: #DD4747">derivedMemberLoginList()</span>.<span style="color: #DD4747">max</span>(new SubQuery&lt;MemberLoginCB&gt;() {
         *     public void query(MemberLoginCB subCB) {
         *         subCB.specify().<span style="color: #DD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
         *     }
         * }, DbleMemberLogin.<span style="color: #DD4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        def derivedMemberLoginList(): ScrHpSDRFunction[MemberLoginCB, MemberCQ] = {
            assertDerived("memberLoginList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return toScalaSDRFunction(new HpSDRFunction[MemberLoginCB, MemberCQ](_baseCB, _qyCall.qy(), new HpSDRSetupper[MemberLoginCB, MemberCQ]() {
                def setup(fn: String, sq: SubQuery[MemberLoginCB], cq: MemberCQ, al: String, op: DerivedReferrerOption): Unit = {
                    cq.xsderiveMemberLoginList(fn, sq, al, op); } }, _dbmetaProvider));
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br />
         * {select max(FOO) from PURCHASE where ...) as FOO_MAX} <br />
         * (購入)PURCHASE by MEMBER_ID, named 'purchaseList'.
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
        def derivedPurchaseList(): ScrHpSDRFunction[PurchaseCB, MemberCQ] = {
            assertDerived("purchaseList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return toScalaSDRFunction(new HpSDRFunction[PurchaseCB, MemberCQ](_baseCB, _qyCall.qy(), new HpSDRSetupper[PurchaseCB, MemberCQ]() {
                def setup(fn: String, sq: SubQuery[PurchaseCB], cq: MemberCQ, al: String, op: DerivedReferrerOption): Unit = {
                    cq.xsderivePurchaseList(fn, sq, al, op); } }, _dbmetaProvider));
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        def myselfDerived(): ScrHpSDRFunction[MemberCB, MemberCQ] = {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return toScalaSDRFunction(new HpSDRFunction[MemberCB, MemberCQ](_baseCB, _qyCall.qy(), new HpSDRSetupper[MemberCB, MemberCQ]() {
                def setup(fn: String, sq: SubQuery[MemberCB], cq: MemberCQ, al: String, op: DerivedReferrerOption): Unit = {
                    cq.xsmyselfDerive(fn, sq, al, op); } }, _dbmetaProvider));
        }
    }

    protected def toScalaSDRFunction[CB <: ConditionBean, CQ <: ConditionQuery](function: HpSDRFunction[CB, CQ]): ScrHpSDRFunction[CB, CQ] =
    { new ScrHpSDRFunction[CB, CQ](function) } 
}
