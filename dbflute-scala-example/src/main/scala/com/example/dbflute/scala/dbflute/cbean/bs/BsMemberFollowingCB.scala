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
 * The base condition-bean of MEMBER_FOLLOWING.
 * @author DBFlute(AutoGenerator)
 */
class BsMemberFollowingCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected var _conditionQuery: MemberFollowingCQ = null;

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
        return "MEMBER_FOLLOWING";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param memberFollowingId (会員フォローイングID): PK, ID, NotNull, BIGINT(19). (NotNull)
     * @return this. (NotNull)
     */
    def acceptPK(memberFollowingId: Long): MemberFollowingCB = {
        assertObjectNotNull("memberFollowingId", memberFollowingId);
        val cb: BsMemberFollowingCB = this;
        cb.query().setMemberFollowingId_Equal(memberFollowingId);
        return this.asInstanceOf[MemberFollowingCB];
    }

    /**
     * Accept the query condition of unique key as equal.
     * @param myMemberId (わたし): UQ+, IX+, NotNull, INTEGER(10), FK to MEMBER. (NotNull)
     * @param yourMemberId (あなた): +UQ, IX+, NotNull, INTEGER(10), FK to MEMBER. (NotNull)
     * @return this. (NotNull)
     */
    def acceptUniqueOf(myMemberId: Integer, yourMemberId: Integer): MemberFollowingCB = {
        assertObjectNotNull("myMemberId", myMemberId);assertObjectNotNull("yourMemberId", yourMemberId);
        val cb: BsMemberFollowingCB = this;
        cb.query().setMyMemberId_Equal(myMemberId);cb.query().setYourMemberId_Equal(yourMemberId);
        return this.asInstanceOf[MemberFollowingCB];
    }

    def addOrderBy_PK_Asc(): ConditionBean = {
        query().addOrderBy_MemberFollowingId_Asc();
        return this;
    }

    def addOrderBy_PK_Desc(): ConditionBean = {
        query().addOrderBy_MemberFollowingId_Desc();
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
    def query(): MemberFollowingCQ = {
        assertQueryPurpose(); // assert only when user-public query 
        return getConditionQuery();
    }

    def getConditionQuery(): MemberFollowingCQ = { // public for parameter comment and internal
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected def createLocalCQ(): MemberFollowingCQ = {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected def xcreateCQ(childQuery: ConditionQuery, sqlClause: SqlClause, aliasName: String, nestLevel: Integer): MemberFollowingCQ = {
        val cq: MemberFollowingCQ = xnewCQ(childQuery,  sqlClause,  aliasName,  nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected def xnewCQ(childQuery: ConditionQuery, sqlClause: SqlClause, aliasName: String, nestLevel: Integer): MemberFollowingCQ = {
        return new MemberFollowingCQ(childQuery, sqlClause, aliasName, nestLevel);
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
     * cb.query().<span style="color: #DD4747">union</span>(new UnionQuery&lt;MemberFollowingCB&gt;() {
     *     public void query(MemberFollowingCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    def union(unionQuery: UnionQuery[MemberFollowingCB]): Unit = {
        val cb: MemberFollowingCB = new MemberFollowingCB(); cb.xsetupForUnion(this); xsyncUQ(cb); 
        try { lock(); unionQuery.query(cb); } finally { unlock(); }
        xsaveUCB(cb);
        val cq: MemberFollowingCQ = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all' for base-point table. <br />
     * You don't need to call SetupSelect in union-query,
     * because it inherits calls before. (Don't call SetupSelect after here)
     * <pre>
     * cb.query().<span style="color: #DD4747">unionAll</span>(new UnionQuery&lt;MemberFollowingCB&gt;() {
     *     public void query(MemberFollowingCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union all'. (NotNull)
     */
    def unionAll(unionQuery: UnionQuery[MemberFollowingCB]): Unit = {
        val cb: MemberFollowingCB = new MemberFollowingCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionQuery.query(cb); } finally { unlock(); }
        xsaveUCB(cb);
        val cq: MemberFollowingCQ = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    protected var _nssMemberByMyMemberId: MemberNss = null;
    def getNssMemberByMyMemberId(): MemberNss = {
        if (_nssMemberByMyMemberId == null) { _nssMemberByMyMemberId = new MemberNss(null); }
        return _nssMemberByMyMemberId;
    }
    /**
     * Set up relation columns to select clause. <br />
     * (会員)MEMBER by my MY_MEMBER_ID, named 'memberByMyMemberId'.
     * <pre>
     * MemberFollowingCB cb = new MemberFollowingCB();
     * cb.<span style="color: #DD4747">setupSelect_MemberByMyMemberId()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * DbleMemberFollowing memberFollowing = memberFollowingBhv.selectEntityWithDeletedCheck(cb);
     * ... = memberFollowing.<span style="color: #DD4747">getMemberByMyMemberId()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    def setupSelect_MemberByMyMemberId(): MemberNss = {
        assertSetupSelectPurpose("memberByMyMemberId");
        if (hasSpecifiedColumn()) { // if reverse call
            specify().columnMyMemberId();
        }
        doSetupSelect(new SsCall() { def qf(): ConditionQuery = { return query().queryMemberByMyMemberId(); } });
        if (_nssMemberByMyMemberId == null || !_nssMemberByMyMemberId.hasConditionQuery())
        { _nssMemberByMyMemberId = new MemberNss(query().queryMemberByMyMemberId()); }
        return _nssMemberByMyMemberId;
    }

    protected var _nssMemberByYourMemberId: MemberNss = null;
    def getNssMemberByYourMemberId(): MemberNss = {
        if (_nssMemberByYourMemberId == null) { _nssMemberByYourMemberId = new MemberNss(null); }
        return _nssMemberByYourMemberId;
    }
    /**
     * Set up relation columns to select clause. <br />
     * (会員)MEMBER by my YOUR_MEMBER_ID, named 'memberByYourMemberId'.
     * <pre>
     * MemberFollowingCB cb = new MemberFollowingCB();
     * cb.<span style="color: #DD4747">setupSelect_MemberByYourMemberId()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * DbleMemberFollowing memberFollowing = memberFollowingBhv.selectEntityWithDeletedCheck(cb);
     * ... = memberFollowing.<span style="color: #DD4747">getMemberByYourMemberId()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    def setupSelect_MemberByYourMemberId(): MemberNss = {
        assertSetupSelectPurpose("memberByYourMemberId");
        if (hasSpecifiedColumn()) { // if reverse call
            specify().columnYourMemberId();
        }
        doSetupSelect(new SsCall() { def qf(): ConditionQuery = { return query().queryMemberByYourMemberId(); } });
        if (_nssMemberByYourMemberId == null || !_nssMemberByYourMemberId.hasConditionQuery())
        { _nssMemberByYourMemberId = new MemberNss(query().queryMemberByYourMemberId()); }
        return _nssMemberByYourMemberId;
    }

    // [DBFlute-0.7.4]
    // ===================================================================================
    //                                                                             Specify
    //                                                                             =======
    protected var _specification: HpMemberFollowingCB.HpSpecification = null;

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
    def specify(): HpMemberFollowingCB.HpSpecification = {
        assertSpecifyPurpose();
        if (_specification == null) { _specification = new HpMemberFollowingCB.HpSpecification(this
            , new HpSpQyCall[MemberFollowingCQ]() {
                def has(): Boolean = { return true; }
                def qy(): MemberFollowingCQ = { return getConditionQuery(); }
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
     * cb.<span style="color: #DD4747">columnQuery</span>(new SpecifyQuery&lt;MemberFollowingCB&gt;() {
     *     public void query(MemberFollowingCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFoo()</span>; <span style="color: #3F7E5E">// left column</span>
     *     }
     * }).lessThan(new SpecifyQuery&lt;MemberFollowingCB&gt;() {
     *     public void query(MemberFollowingCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnBar()</span>; <span style="color: #3F7E5E">// right column</span>
     *     }
     * }); <span style="color: #3F7E5E">// you can calculate for right column like '}).plus(3);'</span>
     * </pre>
     * @param leftSpecifyQuery The specify-query for left column. (NotNull)
     * @return The object for setting up operand and right column. (NotNull)
     */
    def columnQuery(leftSpecifyQuery: (MemberFollowingCB) => Unit): ScrHpColQyOperand[MemberFollowingCB] = {
        return new ScrHpColQyOperand[MemberFollowingCB](new HpColQyHandler[MemberFollowingCB]() {
            def handle(rightSp: SpecifyQuery[MemberFollowingCB], operand: String): HpCalculator = {
                return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), new SpecifyQuery[MemberFollowingCB]() {
                    def specify(cb: MemberFollowingCB): Unit = { leftSpecifyQuery(cb); }
                }, rightSp, operand);
            }
        });
    }

    protected def xcreateColumnQueryCB(): MemberFollowingCB = {
        val cb: MemberFollowingCB = new MemberFollowingCB();
        cb.xsetupForColumnQuery(this.asInstanceOf[MemberFollowingCB]);
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
    def dreamCruiseCB(): MemberFollowingCB = {
        val cb: MemberFollowingCB = new MemberFollowingCB();
        cb.xsetupForDreamCruise(this.asInstanceOf[MemberFollowingCB]);
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
     * cb.<span style="color: #DD4747">orScopeQuery</span>(new OrQuery&lt;MemberFollowingCB&gt;() {
     *     public void query(MemberFollowingCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.query().setBAR_Equal...
     *     }
     * });
     * </pre>
     * @param orQuery The query for or-condition. (NotNull)
     */
    def orScopeQuery(orQuery: (MemberFollowingCB) => Unit): Unit = {
        xorSQ(this.asInstanceOf[MemberFollowingCB], new OrQuery[MemberFollowingCB]{
            def query(orCB: MemberFollowingCB): Unit = { orQuery(orCB); }
        });
    }

    /**
     * Set up the and-part of or-scope. <br />
     * (However nested or-scope query and as-or-split of like-search in and-part are unsupported)
     * <pre>
     * <span style="color: #3F7E5E">// where (FOO = '...' or (BAR = '...' and QUX = '...'))</span>
     * cb.<span style="color: #DD4747">orScopeQuery</span>(new OrQuery&lt;MemberFollowingCB&gt;() {
     *     public void query(MemberFollowingCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.<span style="color: #DD4747">orScopeQueryAndPart</span>(new AndQuery&lt;MemberFollowingCB&gt;() {
     *             public void query(MemberFollowingCB andCB) {
     *                 andCB.query().setBar_...
     *                 andCB.query().setQux_...
     *             }
     *         });
     *     }
     * });
     * </pre>
     * @param andQuery The query for and-condition. (NotNull)
     */
    def orScopeQueryAndPart(andQuery: (MemberFollowingCB) => Unit): Unit = {
        xorSQAP(this.asInstanceOf[MemberFollowingCB], new AndQuery[MemberFollowingCB] {
            def query(cb: MemberFollowingCB): Unit = { andQuery(cb); }
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
        val cb: MemberFollowingCB = if (mainCB != null) {
            mainCB.asInstanceOf[MemberFollowingCB];
        } else {
            new MemberFollowingCB();
        }
        specify().xsetSyncQyCall(new HpSpQyCall[MemberFollowingCQ]() {
            def has(): Boolean = { return true; }
            def qy(): MemberFollowingCQ = { return cb.query(); }
        });
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected def getConditionBeanClassNameInternally(): String = { return classOf[MemberFollowingCB].getName(); }
    protected def getConditionQueryClassNameInternally(): String = { return classOf[MemberFollowingCQ].getName(); }
    protected def getSubQueryClassNameInternally(): String = { return classOf[SubQuery[_]].getName(); }
    protected def getConditionOptionClassNameInternally(): String = { return classOf[ConditionOption].getName(); }
}

/**
 * The singleton object to define condition-bean's specification.
 * @author DBFlute(AutoGenerator)
 */
object HpMemberFollowingCB {

    class HpSpecification(baseCB: ConditionBean, qyCall: HpSpQyCall[MemberFollowingCQ], purpose: HpCBPurpose, dbmetaProvider: DBMetaProvider)
            extends HpAbstractSpecification[MemberFollowingCQ](baseCB, qyCall, purpose, dbmetaProvider) {
        protected var _memberByMyMemberId: HpMemberCB.HpSpecification = null;
        protected var _memberByYourMemberId: HpMemberCB.HpSpecification = null;
        /**
         * (会員フォローイングID)MEMBER_FOLLOWING_ID: {PK, ID, NotNull, BIGINT(19)}
         * @return The information object of specified column. (NotNull)
         */
        def columnMemberFollowingId(): HpSpecifiedColumn = { return doColumn("MEMBER_FOLLOWING_ID"); }
        /**
         * (わたし)MY_MEMBER_ID: {UQ+, IX+, NotNull, INTEGER(10), FK to MEMBER}
         * @return The information object of specified column. (NotNull)
         */
        def columnMyMemberId(): HpSpecifiedColumn = { return doColumn("MY_MEMBER_ID"); }
        /**
         * (あなた)YOUR_MEMBER_ID: {+UQ, IX+, NotNull, INTEGER(10), FK to MEMBER}
         * @return The information object of specified column. (NotNull)
         */
        def columnYourMemberId(): HpSpecifiedColumn = { return doColumn("YOUR_MEMBER_ID"); }
        /**
         * (その瞬間)FOLLOW_DATETIME: {IX, NotNull, TIMESTAMP(23, 10)}
         * @return The information object of specified column. (NotNull)
         */
        def columnFollowDatetime(): HpSpecifiedColumn = { return doColumn("FOLLOW_DATETIME"); }
        def everyColumn(): Unit = { doEveryColumn(); }
        def exceptRecordMetaColumn(): Unit = { doExceptRecordMetaColumn(); }
        @Override
        protected def doSpecifyRequiredColumn(): Unit = {
            columnMemberFollowingId(); // PK
            if (qyCall().qy().hasConditionQueryMemberByMyMemberId()
                    || qyCall().qy().xgetReferrerQuery().isInstanceOf[MemberCQ]) {
                columnMyMemberId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryMemberByYourMemberId()
                    || qyCall().qy().xgetReferrerQuery().isInstanceOf[MemberCQ]) {
                columnYourMemberId(); // FK or one-to-one referrer
            }
        }
        @Override
        protected def getTableDbName(): String = { return "MEMBER_FOLLOWING"; }
        /**
         * Prepare to specify functions about relation table. <br />
         * (会員)MEMBER by my MY_MEMBER_ID, named 'memberByMyMemberId'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        def specifyMemberByMyMemberId(): HpMemberCB.HpSpecification = {
            assertRelation("memberByMyMemberId");
            if (_memberByMyMemberId == null) {
                _memberByMyMemberId = new HpMemberCB.HpSpecification(_baseCB, new HpSpQyCall[MemberCQ]() {
                    def has(): Boolean = { return _qyCall.has() && _qyCall.qy().hasConditionQueryMemberByMyMemberId(); }
                    def qy(): MemberCQ = { return _qyCall.qy().queryMemberByMyMemberId(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _memberByMyMemberId.xsetSyncQyCall(new HpSpQyCall[MemberCQ]() {
                        def has(): Boolean = { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberByMyMemberId(); }
                        def qy(): MemberCQ = { return xsyncQyCall().qy().queryMemberByMyMemberId(); }
                    });
                }
            }
            return _memberByMyMemberId;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * (会員)MEMBER by my YOUR_MEMBER_ID, named 'memberByYourMemberId'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        def specifyMemberByYourMemberId(): HpMemberCB.HpSpecification = {
            assertRelation("memberByYourMemberId");
            if (_memberByYourMemberId == null) {
                _memberByYourMemberId = new HpMemberCB.HpSpecification(_baseCB, new HpSpQyCall[MemberCQ]() {
                    def has(): Boolean = { return _qyCall.has() && _qyCall.qy().hasConditionQueryMemberByYourMemberId(); }
                    def qy(): MemberCQ = { return _qyCall.qy().queryMemberByYourMemberId(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _memberByYourMemberId.xsetSyncQyCall(new HpSpQyCall[MemberCQ]() {
                        def has(): Boolean = { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMemberByYourMemberId(); }
                        def qy(): MemberCQ = { return xsyncQyCall().qy().queryMemberByYourMemberId(); }
                    });
                }
            }
            return _memberByYourMemberId;
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        def myselfDerived(): ScrHpSDRFunction[MemberFollowingCB, MemberFollowingCQ] = {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return toScalaSDRFunction(new HpSDRFunction[MemberFollowingCB, MemberFollowingCQ](_baseCB, _qyCall.qy(), new HpSDRSetupper[MemberFollowingCB, MemberFollowingCQ]() {
                def setup(fn: String, sq: SubQuery[MemberFollowingCB], cq: MemberFollowingCQ, al: String, op: DerivedReferrerOption): Unit = {
                    cq.xsmyselfDerive(fn, sq, al, op); } }, _dbmetaProvider));
        }
    }

    protected def toScalaSDRFunction[CB <: ConditionBean, CQ <: ConditionQuery](function: HpSDRFunction[CB, CQ]): ScrHpSDRFunction[CB, CQ] =
    { new ScrHpSDRFunction[CB, CQ](function) } 
}
