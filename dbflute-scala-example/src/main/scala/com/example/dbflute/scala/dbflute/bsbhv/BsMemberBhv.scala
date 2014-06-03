package com.example.dbflute.scala.dbflute.bsbhv;

import scala.collection.JavaConverters._;

import java.util.Collection;
import java.util.List;

import org.seasar.dbflute._;
import org.seasar.dbflute.bhv._;
import org.seasar.dbflute.bhv.AbstractBehaviorReadable._;
import org.seasar.dbflute.bhv.AbstractBehaviorWritable._;
import org.seasar.dbflute.cbean._;
import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.exception._;
import org.seasar.dbflute.outsidesql.executor._;
import com.example.dbflute.scala.dbflute.exbhv._;
import com.example.dbflute.scala.dbflute.exentity._;
import com.example.dbflute.scala.dbflute.bsentity.dbmeta._;
import com.example.dbflute.scala.dbflute.cbean._;

/**
 * The behavior of (会員)MEMBER as TABLE. <br />
 * <pre>
 * [primary key]
 *     MEMBER_ID
 *
 * [column]
 *     MEMBER_ID, MEMBER_NAME, MEMBER_ACCOUNT, MEMBER_STATUS_CODE, FORMALIZED_DATETIME, BIRTHDATE, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MEMBER_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     MEMBER_STATUS, MEMBER_SERVICE(AsOne)
 *
 * [referrer table]
 *     PURCHASE, MEMBER_SERVICE
 *
 * [foreign property]
 *     memberStatus, memberServiceAsOne
 *
 * [referrer property]
 *     purchaseList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
abstract class BsMemberBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    def getTableDbName(): String = { return "MEMBER"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    def getDBMeta(): DBMeta = { return MemberDbm; }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    def newEntity(): Entity = { return newMyEntity(); }

    /** {@inheritDoc} */
    def newConditionBean(): ConditionBean = { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    def newMyEntity(): MbleMember = { return new MbleMember(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    def newMyConditionBean(): MemberCB = { return new MemberCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * MemberCB cb = new MemberCB();
     * cb.query().setFoo...(value);
     * int count = memberBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of MbleMember. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    def selectCount(cb: MemberCB): Integer = {
        return doSelectCountUniquely(cb);
    }

    protected def doSelectCountUniquely(cb: MemberCB): Integer = { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected def doSelectCountPlainly(cb: MemberCB): Integer = { // called by selectPage(cb)
        assertCBStateValid(cb);
        return delegateSelectCountPlainly(cb);
    }

    override protected def doReadCount(cb: ConditionBean): Int = {
        return selectCount(downcast(cb));
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean. <br />
     * It returns not-null optional entity, so you should ... <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, get() without check.</span> <br />
     * <span style="color: #AD4747; font-size: 120%">If it might be no data, get() after check by isPresent() or orElse(), ...</span>
     * <pre>
     * MemberCB cb = new MemberCB();
     * cb.query().setFoo...(value);
     * OptionalEntity&lt;MbleMember&gt; entity = memberBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     *
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * entity.<span style="color: #DD4747">required</span>(member -&gt; {
     *     ...
     * });
     * MbleMember member = entity.entity.<span style="color: #DD4747">get()</span>;
     *
     * <span style="color: #3F7E5E">// if it might be no data, ifPresent(), isPresent(), ...</span>
     * entity.<span style="color: #DD4747">ifPresent</span>(member -&gt; {
     *     ...
     * });
     * if (entity.entity.<span style="color: #DD4747">isPresent()</span>) {
     *     MbleMember member = entity.entity.<span style="color: #DD4747">get()</span>;
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of MbleMember. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get() of return value is called and the value is null, which means entity has already been deleted (point is not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    def selectEntity(cb: MemberCB): Option[MbleMember] = {
        return doSelectOptionalEntity(cb, classOf[MbleMember]);
    }

    protected def doSelectEntity[ENTITY <: MbleMember](cb: MemberCB, tp: Class[ENTITY]): ENTITY = {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback[ENTITY, MemberCB]() {
            def callbackSelectList(lcb: MemberCB, ltp: Class[ENTITY]): List[ENTITY] = { return doSelectList(lcb, ltp); } });
    }

    protected def doSelectOptionalEntity[ENTITY <: MbleMember](cb: MemberCB, tp: Class[ENTITY]): Option[ENTITY] = {
        return Option.apply(doSelectEntity(cb, tp));
    }

    @Override
    protected def doReadEntity(cb: ConditionBean): Entity = {
        return selectEntity(downcast(cb)).getOrElse(null);
    }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * MemberCB cb = new MemberCB();
     * cb.query().setFoo...(value);
     * MbleMember member = memberBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = member.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of MbleMember. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (point is not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    def selectEntityWithDeletedCheck(cb: MemberCB): MbleMember = {
        return doSelectEntityWithDeletedCheck(cb, classOf[MbleMember]);
    }

    protected def doSelectEntityWithDeletedCheck[ENTITY <: MbleMember](cb: MemberCB, tp: Class[ENTITY]): ENTITY = {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback[ENTITY, MemberCB]() {
            def callbackSelectList(lcb: MemberCB, ltp: Class[ENTITY]): List[ENTITY] = { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected def doReadEntityWithDeletedCheck(cb: ConditionBean): Entity = {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param memberId (会員ID): PK, ID, NotNull, INTEGER(10). (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    def selectByPK(memberId: Integer): Option[MbleMember] = {
        return doSelectByPK(memberId, classOf[MbleMember]);
    }

    protected def doSelectByPK[ENTITY <: MbleMember](memberId: Integer, entityType: Class[ENTITY]): Option[ENTITY] = {
        return Option.apply(doSelectEntity(xprepareCBAsPK(memberId), entityType));
    }

    protected def xprepareCBAsPK(memberId: Integer): MemberCB = {
        assertObjectNotNull("memberId", memberId);
        val cb: MemberCB = newMyConditionBean();
        cb.query().setMemberId_Equal(memberId);;
        return cb;
    }

    /**
     * Select the entity by the unique-key value.
     * @param memberAccount (会員アカウント): UQ, NotNull, VARCHAR(50). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    def selectByUniqueOf(memberAccount: String): Option[MbleMember] = {
        return doSelectByUniqueOf(memberAccount, classOf[MbleMember]);
    }

    protected def doSelectByUniqueOf[ENTITY <: MbleMember](memberAccount: String, entityType: Class[ENTITY]): Option[ENTITY] = {
        return Option.apply(doSelectEntity(xprepareCBAsUniqueOf(memberAccount), entityType));
    }

    protected def xprepareCBAsUniqueOf(memberAccount: String): MemberCB = {
        assertObjectNotNull("memberAccount", memberAccount);
        val cb: MemberCB = newMyConditionBean(); cb.acceptUniqueOf(memberAccount);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * MemberCB cb = new MemberCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;MbleMember&gt; memberList = memberBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (MbleMember member : memberList) {
     *     ... = member.get...();
     * }
     * </pre>
     * @param cb The condition-bean of MbleMember. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    def selectList(cb: MemberCB): scala.collection.immutable.List[MbleMember] = {
        val javaList = doSelectList(cb, classOf[MbleMember]);
        return toScalaList(javaList);
    }

    protected def doSelectList[ENTITY <: MbleMember](cb: MemberCB, tp: Class[ENTITY]): ListResultBean[ENTITY] = {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback[ENTITY, MemberCB]() {
            def callbackSelectList(lcb: MemberCB, ltp: Class[ENTITY]): List[ENTITY] = { return delegateSelectList(lcb, ltp); } });
    }

    @Override
    protected def doReadList(cb: ConditionBean): ListResultBean[_ <: Entity] = {
        return doSelectList(downcast(cb), classOf[MbleMember]); // use do method for ListResultBean
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * MemberCB cb = new MemberCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;MbleMember&gt; page = memberBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (MbleMember member : page) {
     *     ... = member.get...();
     * }
     * </pre>
     * @param cb The condition-bean of MbleMember. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    def selectPage(cb: MemberCB): PagingResultBean[MbleMember] = {
        return doSelectPage(cb, classOf[MbleMember]);
    }

    protected def doSelectPage[ENTITY <: MbleMember](cb: MemberCB, tp: Class[ENTITY]): PagingResultBean[ENTITY] = {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback[ENTITY, MemberCB]() {
            def callbackSelectCount(cb: MemberCB): Int = { return doSelectCountPlainly(cb); }
            def callbackSelectList(cb: MemberCB, tp: Class[ENTITY]): List[ENTITY] = { return doSelectList(cb, tp); }
        });
    }

    @Override
    protected def doReadPage(cb: ConditionBean): PagingResultBean[_ <: Entity] = {
        return selectPage(downcast(cb));
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * MemberCB cb = new MemberCB();
     * cb.query().setFoo...(value);
     * memberBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;MbleMember&gt;() {
     *     public void handle(MbleMember entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of MbleMember. (NotNull)
     * @param entityRowHandler The handler of entity row of MbleMember. (NotNull)
     */
    def selectCursor(cb: MemberCB, entityRowHandler: EntityRowHandler[MbleMember]): Unit = {
        doSelectCursor(cb, entityRowHandler, classOf[MbleMember]);
    }

    protected def doSelectCursor[ENTITY <: MbleMember](cb: MemberCB, handler: EntityRowHandler[ENTITY], tp: Class[ENTITY]): Unit = {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback[ENTITY, MemberCB]() {
            def callbackSelectCursor(cb: MemberCB, handler: EntityRowHandler[ENTITY], tp: Class[ENTITY]): Unit = { delegateSelectCursor(cb, handler, tp); }
            def callbackSelectList(cb: MemberCB, tp: Class[ENTITY]): List[ENTITY] = { return doSelectList(cb, tp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * memberBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(MemberCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    def scalarSelect[RESULT](resultType: Class[RESULT]): SLFunction[MemberCB, RESULT] = {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected def doScalarSelect[RESULT, CB <: MemberCB](tp: Class[RESULT], cb: CB): SLFunction[CB, RESULT] = {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction[RESULT, CB](cb, tp);
    }

    protected def createSLFunction[RESULT, CB <: MemberCB](cb: CB, tp: Class[RESULT]): SLFunction[CB, RESULT] = {
        return new SLFunction[CB, RESULT](cb, tp);
    }

    protected def doReadScalar[RESULT](tp: Class[RESULT]): SLFunction[_ <: ConditionBean, RESULT] = {
        return doScalarSelect(tp, newMyConditionBean());
    }

    // ===================================================================================
    //                                                                            Sequence
    //                                                                            ========
    @Override
    protected def doReadNextVal(): Number = {
        val msg: String = "This table is NOT related to sequence: " + getTableDbName();
        throw new UnsupportedOperationException(msg);
    }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    /**
     * Load referrer of purchaseList by the set-upper of referrer. <br />
     * (購入)PURCHASE by MEMBER_ID, named 'purchaseList'.
     * <pre>
     * memberBhv.<span style="color: #DD4747">loadPurchaseList</span>(memberList, new ReferrerConditionSetupper&lt;PurchaseCB&gt;() {
     *     public void setup(PurchaseCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * for (MbleMember member : memberList) {
     *     ... = member.<span style="color: #DD4747">getPurchaseList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMemberId_InScope(pkList);
     * cb.query().addOrderBy_MemberId_Asc();
     * </pre>
     * @param memberList The entity list of member. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    def loadPurchaseList(memberList: scala.collection.immutable.List[MbleMember], setupper: ReferrerConditionSetupper[PurchaseCB]): NestedReferrerLoader[MblePurchase] = {
        xassLRArg(memberList.asJava, setupper); // #pending easy convert for now
        return doLoadPurchaseList(memberList, new LoadReferrerOption[PurchaseCB, MblePurchase]().xinit(setupper));
    }

    /**
     * Load referrer of purchaseList by the set-upper of referrer. <br />
     * (購入)PURCHASE by MEMBER_ID, named 'purchaseList'.
     * <pre>
     * memberBhv.<span style="color: #DD4747">loadPurchaseList</span>(memberList, new ReferrerConditionSetupper&lt;PurchaseCB&gt;() {
     *     public void setup(PurchaseCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = member.<span style="color: #DD4747">getPurchaseList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMemberId_InScope(pkList);
     * cb.query().addOrderBy_MemberId_Asc();
     * </pre>
     * @param member The entity of member. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    def loadPurchaseList(member: MbleMember, setupper: ReferrerConditionSetupper[PurchaseCB]): NestedReferrerLoader[MblePurchase] = {
        xassLRArg(member, setupper);
        return doLoadPurchaseList(scala.collection.immutable.List.apply(member), new LoadReferrerOption[PurchaseCB, MblePurchase]().xinit(setupper));
    }

    protected def doLoadPurchaseList(memberList: scala.collection.immutable.List[MbleMember], option: LoadReferrerOption[PurchaseCB, MblePurchase]): NestedReferrerLoader[MblePurchase] = {
        val referrerBhv: PurchaseBhv = xgetBSFLR().select(classOf[PurchaseBhv]);
        return helpLoadReferrerInternally(memberList.asJava, option, new InternalLoadReferrerCallback[MbleMember, Integer, PurchaseCB, MblePurchase]() {
            def getPKVal(et: MbleMember): Integer =
            { return et.memberId(); }
            def setRfLs(et: MbleMember, ls: List[MblePurchase]): Unit =
            { et.purchaseList(toScalaList(ls)); }
            def newMyCB(): PurchaseCB = { return referrerBhv.newMyConditionBean(); }
            def qyFKIn(cb: PurchaseCB, ls: List[Integer]): Unit =
            { cb.query().setMemberId_InScope(ls); }
            def qyOdFKAsc(cb: PurchaseCB): Unit = { cb.query().addOrderBy_MemberId_Asc(); }
            def spFKCol(cb: PurchaseCB): Unit = { cb.specify().columnMemberId(); }
            def selRfLs(cb: PurchaseCB): List[MblePurchase] = { return referrerBhv.selectList(cb).asJava; }
            def getFKVal(re: MblePurchase): Integer = { return re.memberId(); }
            def setlcEt(re: MblePurchase, le: MbleMember): Unit =
            { re.member(Option.apply(le)); }
            def getRfPrNm(): String = { return "purchaseList"; }
        });
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'MbleMemberStatus'.
     * @param memberList The list of member. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    def pulloutMemberStatus(memberList: scala.collection.immutable.List[MbleMember]): scala.collection.immutable.List[MbleMemberStatus] = {
        return toScalaList(helpPulloutInternally(memberList.asJava, new InternalPulloutCallback[MbleMember, MbleMemberStatus]() {
            def getFr(et: MbleMember): MbleMemberStatus =
            { return et.memberStatus().get; }
            def hasRf(): Boolean = { return true; }
            def setRfLs(et: MbleMemberStatus, ls: List[MbleMember]): Unit =
            { et.memberList(toScalaList(ls)); }
        }));
    }
    /**
     * Pull out the list of referrer-as-one table 'MbleMemberService'.
     * @param memberList The list of member. (NotNull, EmptyAllowed)
     * @return The list of referrer-as-one table. (NotNull, EmptyAllowed, NotNullElement)
     */
    def pulloutMemberServiceAsOne(memberList: List[MbleMember]): List[MbleMemberService] = {
        return helpPulloutInternally(memberList, new InternalPulloutCallback[MbleMember, MbleMemberService]() {
            def getFr(et: MbleMember): MbleMemberService =
            { return et.memberServiceAsOne().get; }
            def hasRf(): Boolean = { return true; }
            def setRfLs(et: MbleMemberService, ls: List[MbleMember]): Unit =
            { if (!ls.isEmpty()) { et.member(Option.apply(ls.get(0))); } }
        });
    }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key memberId.
     * @param memberList The list of member. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    def extractMemberIdList(memberList: List[MbleMember]): List[Integer] = {
        return helpExtractListInternally(memberList, new InternalExtractCallback[MbleMember, Integer]() {
            def getCV(et: MbleMember): Integer = { return et.memberId(); }
        });
    }

    /**
     * Extract the value list of (single) unique key memberAccount.
     * @param memberList The list of member. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    def extractMemberAccountList(memberList: List[MbleMember]): List[String] = {
        return helpExtractListInternally(memberList, new InternalExtractCallback[MbleMember, String]() {
            def getCV(et: MbleMember): String = { return et.memberAccount(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * MbleMember member = new MbleMember();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * member.setFoo...(value);
     * member.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//member.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//member.set...;</span>
     * memberBhv.<span style="color: #DD4747">insert</span>(member);
     * ... = member.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param member The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    def insert(member: MbleMember): Unit = {
        doInsert(member, null);
    }

    protected def doInsert(member: MbleMember, op: InsertOption[MemberCB]): Unit = {
        assertObjectNotNull("member", member);
        prepareInsertOption(op);
        delegateInsert(member, op);
    }

    protected def prepareInsertOption(op: InsertOption[MemberCB]): Unit = {
        if (op == null) { return; }
        assertInsertOptionStatus(op);
        if (op.hasSpecifiedInsertColumn()) {
            op.resolveInsertColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    @Override
    protected def doCreate(et: Entity, op: InsertOption[_ <: ConditionBean]): Unit = {
        if (op == null) { insert(downcast(et)); }
        else { varyingInsert(downcast(et), downcast(op)); }
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl)
     * <pre>
     * MbleMember member = new MbleMember();
     * member.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * member.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//member.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//member.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * member.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     memberBhv.<span style="color: #DD4747">update</span>(member);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param member The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    def update(member: MbleMember): Unit = {
        doUpdate(member, null);
    }

    protected def doUpdate(member: MbleMember, op: UpdateOption[MemberCB]): Unit = {
        assertObjectNotNull("member", member);
        prepareUpdateOption(op);
        helpUpdateInternally(member, new InternalUpdateCallback[MbleMember]() {
            def callbackDelegateUpdate(et: MbleMember): Int = { return delegateUpdate(et, op); } });
    }

    protected def prepareUpdateOption(op: UpdateOption[MemberCB]): Unit = {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected def createCBForVaryingUpdate(): MemberCB = {
        val cb: MemberCB = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected def createCBForSpecifiedUpdate(): MemberCB = {
        val cb: MemberCB = newMyConditionBean();
        cb.xsetupForSpecifiedUpdate();
        return cb;
    }

    @Override
    protected def doModify(et: Entity, op: UpdateOption[_ <: ConditionBean]): Unit = {
        if (op == null) { update(downcast(et)); }
        else { varyingUpdate(downcast(et), downcast(op)); }
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * MbleMember member = new MbleMember();
     * member.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * member.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//member.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//member.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//member.setVersionNo(value);</span>
     * memberBhv.<span style="color: #DD4747">updateNonstrict</span>(member);
     * </pre>
     * @param member The entity of update target. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    def updateNonstrict(member: MbleMember): Unit = {
        doUpdateNonstrict(member, null);
    }

    protected def doUpdateNonstrict(member: MbleMember, op: UpdateOption[MemberCB]): Unit = {
        assertObjectNotNull("member", member);
        prepareUpdateOption(op);
        helpUpdateNonstrictInternally(member, new InternalUpdateNonstrictCallback[MbleMember]() {
            def callbackDelegateUpdateNonstrict(et: MbleMember): Int = { return delegateUpdateNonstrict(et, op); } });
    }

    @Override
    protected def doModifyNonstrict(et: Entity, op: UpdateOption[_ <: ConditionBean]): Unit = {
        if (op == null) { updateNonstrict(downcast(et)); }
        else { varyingUpdateNonstrict(downcast(et), downcast(op)); }
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param member The entity of insert or update target. (NotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    def insertOrUpdate(member: MbleMember): Unit = {
        doInesrtOrUpdate(member, null, null);
    }

    protected def doInesrtOrUpdate(member: MbleMember, iop: InsertOption[MemberCB], uop: UpdateOption[MemberCB]): Unit = {
        helpInsertOrUpdateInternally(member, new InternalInsertOrUpdateCallback[MbleMember, MemberCB]() {
            def callbackInsert(et: MbleMember): Unit = { doInsert(et, iop); }
            def callbackUpdate(et: MbleMember): Unit = { doUpdate(et, uop); }
            def callbackNewMyConditionBean(): MemberCB = { return newMyConditionBean(); }
            def callbackSelectCount(cb: MemberCB): Int = { return selectCount(cb); }
        });
    }

    @Override
    protected def doCreateOrModify(et: Entity, iop: InsertOption[_ <: ConditionBean], uop: UpdateOption[_ <: ConditionBean]): Unit = {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            val niop = if (iop != null) { iop } else { new InsertOption[MemberCB]() };
            val nuop = if (uop != null) { uop } else { new UpdateOption[MemberCB]() };
            varyingInsertOrUpdate(downcast(et), downcast(niop), downcast(nuop));
        }
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param member The entity of insert or update target. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    def insertOrUpdateNonstrict(member: MbleMember): Unit = {
        doInesrtOrUpdateNonstrict(member, null, null);
    }

    protected def doInesrtOrUpdateNonstrict(member: MbleMember, iop: InsertOption[MemberCB], uop: UpdateOption[MemberCB]): Unit = {
        helpInsertOrUpdateInternally(member, new InternalInsertOrUpdateNonstrictCallback[MbleMember]() {
            def callbackInsert(et: MbleMember): Unit = { doInsert(et, iop); }
            def callbackUpdateNonstrict(et: MbleMember): Unit = { doUpdateNonstrict(et, uop); }
        });
    }

    @Override
    protected def doCreateOrModifyNonstrict(et: Entity, iop: InsertOption[_ <: ConditionBean], uop: UpdateOption[_ <: ConditionBean]): Unit = {
        if (iop == null && uop == null) { insertOrUpdateNonstrict(downcast(et)); }
        else {
            val niop = if (iop != null) { iop } else { new InsertOption[MemberCB]() };
            val nuop = if (uop != null) { uop } else { new UpdateOption[MemberCB]() };
            varyingInsertOrUpdateNonstrict(downcast(et), downcast(niop), downcast(nuop));
        }
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl)
     * <pre>
     * MbleMember member = new MbleMember();
     * member.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * member.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     memberBhv.<span style="color: #DD4747">delete</span>(member);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param member The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    def delete(member: MbleMember): Unit = {
        doDelete(member, null);
    }

    protected def doDelete(member: MbleMember, op: DeleteOption[MemberCB]): Unit = {
        assertObjectNotNull("member", member);
        prepareDeleteOption(op);
        helpDeleteInternally(member, new InternalDeleteCallback[MbleMember]() {
            def callbackDelegateDelete(et: MbleMember): Int = { return delegateDelete(et, op); } });
    }

    protected def prepareDeleteOption(op: DeleteOption[MemberCB]): Unit = {
        if (op == null) { return; }
        assertDeleteOptionStatus(op);
    }

    @Override
    protected def doRemove(et: Entity, op: DeleteOption[_ <: ConditionBean]): Unit = {
        if (op == null) { delete(downcast(et)); }
        else { varyingDelete(downcast(et), downcast(op)); }
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * MbleMember member = new MbleMember();
     * member.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//member.setVersionNo(value);</span>
     * memberBhv.<span style="color: #DD4747">deleteNonstrict</span>(member);
     * </pre>
     * @param member The entity of delete target. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    def deleteNonstrict(member: MbleMember): Unit = {
        doDeleteNonstrict(member, null);
    }

    protected def doDeleteNonstrict(member: MbleMember, op: DeleteOption[MemberCB]): Unit = {
        assertObjectNotNull("member", member);
        prepareDeleteOption(op);
        helpDeleteNonstrictInternally(member, new InternalDeleteNonstrictCallback[MbleMember]() {
            def callbackDelegateDeleteNonstrict(et: MbleMember): Int = { return delegateDeleteNonstrict(et, op); } });
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * MbleMember member = new MbleMember();
     * member.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//member.setVersionNo(value);</span>
     * memberBhv.<span style="color: #DD4747">deleteNonstrictIgnoreDeleted</span>(member);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param member The entity of delete target. (NotNull, PrimaryKeyNotNull)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    def deleteNonstrictIgnoreDeleted(member: MbleMember): Unit = {
        doDeleteNonstrictIgnoreDeleted(member, null);
    }

    protected def doDeleteNonstrictIgnoreDeleted(member: MbleMember, op: DeleteOption[MemberCB]): Unit = {
        assertObjectNotNull("member", member);
        prepareDeleteOption(op);
        helpDeleteNonstrictIgnoreDeletedInternally(member, new InternalDeleteNonstrictIgnoreDeletedCallback[MbleMember]() {
            def callbackDelegateDeleteNonstrict(et: MbleMember): Int = { return delegateDeleteNonstrict(et, op); } });
    }

    @Override
    protected def doRemoveNonstrict(et: Entity, op: DeleteOption[_ <: ConditionBean]): Unit = {
        if (op == null) { deleteNonstrict(downcast(et)); }
        else { varyingDeleteNonstrict(downcast(et), downcast(op)); }
    }

    // ===================================================================================
    //                                                                        Batch Update
    //                                                                        ============
    /**
     * Batch-insert the entity list modified-only of same-set columns. (DefaultConstraintsEnabled) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <p><span style="color: #DD4747; font-size: 120%">The columns of least common multiple are registered like this:</span></p>
     * <pre>
     * for (... : ...) {
     *     MbleMember member = new MbleMember();
     *     member.setFooName("foo");
     *     if (...) {
     *         member.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     memberList.add(member);
     * }
     * memberBhv.<span style="color: #DD4747">batchInsert</span>(memberList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param memberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    def batchInsert(memberList: scala.collection.immutable.List[MbleMember]): Array[Int] = {
        val op: InsertOption[MemberCB] = createInsertUpdateOption();
        return doBatchInsert(memberList.asJava, op);
    }

    protected def doBatchInsert(memberList: List[MbleMember], op: InsertOption[MemberCB]): Array[Int] = {
        assertObjectNotNull("memberList", memberList);
        prepareBatchInsertOption(memberList, op);
        return delegateBatchInsert(memberList, op);
    }

    protected def prepareBatchInsertOption(memberList: List[MbleMember], op: InsertOption[MemberCB]): Unit = {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(memberList);
        prepareInsertOption(op);
    }

    @Override
    protected def doLumpCreate(ls: List[Entity], op: InsertOption[_ <: ConditionBean]): Array[Int] = {
        if (op == null) { return batchInsert(toScalaList(downcast(ls))); }
        else { return varyingBatchInsert(toScalaList(downcast(ls)), downcast(op)); }
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     MbleMember member = new MbleMember();
     *     member.setFooName("foo");
     *     if (...) {
     *         member.setFooPrice(123);
     *     } else {
     *         member.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//member.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     memberList.add(member);
     * }
     * memberBhv.<span style="color: #DD4747">batchUpdate</span>(memberList);
     * </pre>
     * @param memberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    def batchUpdate(memberList: scala.collection.immutable.List[MbleMember]): Array[Int] = {
        val op: UpdateOption[MemberCB] = createPlainUpdateOption();
        return doBatchUpdate(memberList.asJava, op);
    }

    protected def doBatchUpdate(memberList: List[MbleMember], op: UpdateOption[MemberCB]): Array[Int] = {
        assertObjectNotNull("memberList", memberList);
        prepareBatchUpdateOption(memberList, op);
        return delegateBatchUpdate(memberList, op);
    }

    protected def prepareBatchUpdateOption(memberList: List[MbleMember], op: UpdateOption[MemberCB]): Unit = {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(memberList);
        prepareUpdateOption(op);
    }

    @Override
    protected def doLumpModify(ls: List[Entity], op: UpdateOption[_ <: ConditionBean]): Array[Int] = {
        if (op == null) { return batchUpdate(toScalaList(downcast(ls))); }
        else { return varyingBatchUpdate(toScalaList(downcast(ls)), downcast(op)); }
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * memberBhv.<span style="color: #DD4747">batchUpdate</span>(memberList, new SpecifyQuery[MemberCB]() {
     *     public void specify(MemberCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * memberBhv.<span style="color: #DD4747">batchUpdate</span>(memberList, new SpecifyQuery[MemberCB]() {
     *     public void specify(MemberCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param memberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    def batchUpdate(memberList: scala.collection.immutable.List[MbleMember], updateColumnSpec: SpecifyQuery[MemberCB]): Array[Int] = {
        return doBatchUpdate(memberList.asJava, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     MbleMember member = new MbleMember();
     *     member.setFooName("foo");
     *     if (...) {
     *         member.setFooPrice(123);
     *     } else {
     *         member.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//member.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     memberList.add(member);
     * }
     * memberBhv.<span style="color: #DD4747">batchUpdate</span>(memberList);
     * </pre>
     * @param memberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    def batchUpdateNonstrict(memberList: scala.collection.immutable.List[MbleMember]): Array[Int] = {
        val option: UpdateOption[MemberCB] = createPlainUpdateOption();
        return doBatchUpdateNonstrict(memberList.asJava, option);
    }

    protected def doBatchUpdateNonstrict(memberList: List[MbleMember], op: UpdateOption[MemberCB]): Array[Int] = {
        assertObjectNotNull("memberList", memberList);
        prepareBatchUpdateOption(memberList, op);
        return delegateBatchUpdateNonstrict(memberList, op);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * memberBhv.<span style="color: #DD4747">batchUpdateNonstrict</span>(memberList, new SpecifyQuery[MemberCB]() {
     *     public void specify(MemberCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * memberBhv.<span style="color: #DD4747">batchUpdateNonstrict</span>(memberList, new SpecifyQuery[MemberCB]() {
     *     public void specify(MemberCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param memberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    def batchUpdateNonstrict(memberList: scala.collection.immutable.List[MbleMember], updateColumnSpec: SpecifyQuery[MemberCB]): Array[Int] = {
        return doBatchUpdateNonstrict(memberList.asJava, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected def doLumpModifyNonstrict(ls: List[Entity], op: UpdateOption[_ <: ConditionBean]): Array[Int] = {
        if (op == null) { return batchUpdateNonstrict(toScalaList(downcast(ls))); }
        else { return varyingBatchUpdateNonstrict(toScalaList(downcast(ls)), downcast(op)); }
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param memberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    def batchDelete(memberList: scala.collection.immutable.List[MbleMember]): Array[Int] = {
        return doBatchDelete(memberList.asJava, null);
    }

    protected def doBatchDelete(memberList: List[MbleMember], op: DeleteOption[MemberCB]): Array[Int] = {
        assertObjectNotNull("memberList", memberList);
        prepareDeleteOption(op);
        return delegateBatchDelete(memberList, op);
    }

    @Override
    protected def doLumpRemove(ls: List[Entity], op: DeleteOption[_ <: ConditionBean]): Array[Int] = {
        if (op == null) { return batchDelete(toScalaList(downcast(ls))); }
        else { return varyingBatchDelete(toScalaList(downcast(ls)), downcast(op)); }
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param memberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    def batchDeleteNonstrict(memberList: scala.collection.immutable.List[MbleMember]): Array[Int] = {
        return doBatchDeleteNonstrict(memberList.asJava, null);
    }

    protected def doBatchDeleteNonstrict(memberList: List[MbleMember], op: DeleteOption[MemberCB]): Array[Int] = {
        assertObjectNotNull("memberList", memberList);
        prepareDeleteOption(op);
        return delegateBatchDeleteNonstrict(memberList, op);
    }

    @Override
    protected def doLumpRemoveNonstrict(ls: List[Entity], op: DeleteOption[_ <: ConditionBean]): Array[Int] = {
        if (op == null) { return batchDeleteNonstrict(toScalaList(downcast(ls))); }
        else { return varyingBatchDeleteNonstrict(toScalaList(downcast(ls)), downcast(op)); }
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * memberBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;MbleMember, MemberCB&gt;() {
     *     public ConditionBean setup(member entity, MemberCB intoCB) {
     *         FooCB cb = FooCB();
     *         cb.setupSelect_Bar();
     *
     *         <span style="color: #3F7E5E">// mapping</span>
     *         intoCB.specify().columnMyName().mappedFrom(cb.specify().columnFooName());
     *         intoCB.specify().columnMyCount().mappedFrom(cb.specify().columnFooCount());
     *         intoCB.specify().columnMyDate().mappedFrom(cb.specify().specifyBar().columnBarDate());
     *         entity.setMyFixedValue("foo"); <span style="color: #3F7E5E">// fixed value</span>
     *         <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     *         <span style="color: #3F7E5E">//entity.setRegisterUser(value);</span>
     *         <span style="color: #3F7E5E">//entity.set...;</span>
     *         <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     *         <span style="color: #3F7E5E">//entity.setVersionNo(value);</span>
     *
     *         return cb;
     *     }
     * });
     * </pre>
     * @param setupper The setup-per of query-insert. (NotNull)
     * @return The inserted count.
     */
    def queryInsert(setupper: QueryInsertSetupper[MbleMember, MemberCB]): Integer = {
        return doQueryInsert(setupper, null);
    }

    protected def doQueryInsert(sp: QueryInsertSetupper[MbleMember, MemberCB], op: InsertOption[MemberCB]): Integer = {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        val e: MbleMember = new MbleMember();
        val cb: MemberCB = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
    }

    protected def createCBForQueryInsert(): MemberCB = {
        val cb: MemberCB = newMyConditionBean();
        cb.xsetupForQueryInsert();
        return cb;
    }

    @Override
    protected def doRangeCreate(setupper: QueryInsertSetupper[_ <: Entity, _ <: ConditionBean], option: InsertOption[_ <: ConditionBean]): Int = {
        if (option == null) { return queryInsert(downcast(setupper)); }
        else { return varyingQueryInsert(downcast(setupper), downcast(option)); }
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * MbleMember member = new MbleMember();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//member.setPK...(value);</span>
     * member.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//member.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//member.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//member.setVersionNo(value);</span>
     * MemberCB cb = new MemberCB();
     * cb.query().setFoo...(value);
     * memberBhv.<span style="color: #DD4747">queryUpdate</span>(member, cb);
     * </pre>
     * @param member The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of MbleMember. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    def queryUpdate(member: MbleMember, cb: MemberCB): Integer = {
        return doQueryUpdate(member, cb, null);
    }

    protected def doQueryUpdate(member: MbleMember, cb: MemberCB, op: UpdateOption[MemberCB]): Integer = {
        assertObjectNotNull("member", member); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return if (checkCountBeforeQueryUpdateIfNeeds(cb)) { delegateQueryUpdate(member, cb, op) } else { 0 };
    }

    @Override
    protected def doRangeModify(et: Entity, cb: ConditionBean, op: UpdateOption[_ <: ConditionBean]): Int = {
        if (op == null) { return queryUpdate(downcast(et), cb.asInstanceOf[MemberCB]); }
        else { return varyingQueryUpdate(downcast(et), cb.asInstanceOf[MemberCB], downcast(op)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * MemberCB cb = new MemberCB();
     * cb.query().setFoo...(value);
     * memberBhv.<span style="color: #DD4747">queryDelete</span>(member, cb);
     * </pre>
     * @param cb The condition-bean of MbleMember. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    def queryDelete(cb: MemberCB): Integer = {
        return doQueryDelete(cb, null);
    }

    protected def doQueryDelete(cb: MemberCB, op: DeleteOption[MemberCB]): Integer = {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return if (checkCountBeforeQueryUpdateIfNeeds(cb)) { delegateQueryDelete(cb, op) } else { 0 };
    }

    @Override
    protected def doRangeRemove(cb: ConditionBean, op: DeleteOption[_ <: ConditionBean]): Int = {
        if (op == null) { return queryDelete(cb.asInstanceOf[MemberCB]); }
        else { return varyingQueryDelete(cb.asInstanceOf[MemberCB], downcast(op)); }
    }

    // ===================================================================================
    //                                                                      Varying Update
    //                                                                      ==============
    // -----------------------------------------------------
    //                                         Entity Update
    //                                         -------------
    /**
     * Insert the entity with varying requests. <br />
     * For example, disableCommonColumnAutoSetup(), disablePrimaryKeyIdentity(). <br />
     * Other specifications are same as insert(entity).
     * <pre>
     * MbleMember member = new MbleMember();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * member.setFoo...(value);
     * member.setBar...(value);
     * InsertOption[MemberCB] option = new InsertOption[MemberCB]();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * memberBhv.<span style="color: #DD4747">varyingInsert</span>(member, option);
     * ... = member.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param member The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    def varyingInsert(member: MbleMember, option: InsertOption[MemberCB]): Unit = {
        assertInsertOptionNotNull(option);
        doInsert(member, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * MbleMember member = new MbleMember();
     * member.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * member.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * member.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;MemberCB&gt; option = new UpdateOption&lt;MemberCB&gt;();
     *     option.self(new SpecifyQuery&lt;MemberCB&gt;() {
     *         public void specify(MemberCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     memberBhv.<span style="color: #DD4747">varyingUpdate</span>(member, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param member The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    def varyingUpdate(member: MbleMember, option: UpdateOption[MemberCB]): Unit = {
        assertUpdateOptionNotNull(option);
        doUpdate(member, option);
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * MbleMember member = new MbleMember();
     * member.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * member.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//member.setVersionNo(value);</span>
     * UpdateOption&lt;MemberCB&gt; option = new UpdateOption&lt;MemberCB&gt;();
     * option.self(new SpecifyQuery&lt;MemberCB&gt;() {
     *     public void specify(MemberCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * memberBhv.<span style="color: #DD4747">varyingUpdateNonstrict</span>(member, option);
     * </pre>
     * @param member The entity of update target. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    def varyingUpdateNonstrict(member: MbleMember, option: UpdateOption[MemberCB]): Unit = {
        assertUpdateOptionNotNull(option);
        doUpdateNonstrict(member, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param member The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    def varyingInsertOrUpdate(member: MbleMember, insertOption: InsertOption[MemberCB], updateOption: UpdateOption[MemberCB]): Unit = {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(member, insertOption, updateOption);
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param member The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    def varyingInsertOrUpdateNonstrict(member: MbleMember, insertOption: InsertOption[MemberCB], updateOption: UpdateOption[MemberCB]): Unit = {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdateNonstrict(member, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param member The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    def varyingDelete(member: MbleMember, option: DeleteOption[MemberCB]): Unit = {
        assertDeleteOptionNotNull(option);
        doDelete(member, option);
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as deleteNonstrict(entity).
     * @param member The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    def varyingDeleteNonstrict(member: MbleMember, option: DeleteOption[MemberCB]): Unit = {
        assertDeleteOptionNotNull(option);
        doDeleteNonstrict(member, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param memberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    def varyingBatchInsert(memberList: scala.collection.immutable.List[MbleMember], option: InsertOption[MemberCB]): Array[Int] = {
        assertInsertOptionNotNull(option);
        return doBatchInsert(memberList.asJava, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param memberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    def varyingBatchUpdate(memberList: scala.collection.immutable.List[MbleMember], option: UpdateOption[MemberCB]): Array[Int] = {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(memberList.asJava, option);
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param memberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    def varyingBatchUpdateNonstrict(memberList: scala.collection.immutable.List[MbleMember], option: UpdateOption[MemberCB]): Array[Int] = {
        assertUpdateOptionNotNull(option);
        return doBatchUpdateNonstrict(memberList.asJava, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param memberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    def varyingBatchDelete(memberList: scala.collection.immutable.List[MbleMember], option: DeleteOption[MemberCB]): Array[Int] = {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(memberList.asJava, option);
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param memberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    def varyingBatchDeleteNonstrict(memberList: scala.collection.immutable.List[MbleMember], option: DeleteOption[MemberCB]): Array[Int] = {
        assertDeleteOptionNotNull(option);
        return doBatchDeleteNonstrict(memberList.asJava, option);
    }

    // -----------------------------------------------------
    //                                          Query Update
    //                                          ------------
    /**
     * Insert the several entities by query with varying requests (modified-only for fixed value). <br />
     * For example, disableCommonColumnAutoSetup(), disablePrimaryKeyIdentity(). <br />
     * Other specifications are same as queryInsert(entity, setupper).
     * @param setupper The setup-per of query-insert. (NotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The inserted count.
     */
    def varyingQueryInsert(setupper: QueryInsertSetupper[MbleMember, MemberCB], option: InsertOption[MemberCB]): Integer = {
        assertInsertOptionNotNull(option);
        return doQueryInsert(setupper, option);
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br />
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * MbleMember member = new MbleMember();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//member.setPK...(value);</span>
     * member.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//member.setVersionNo(value);</span>
     * MemberCB cb = new MemberCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;MemberCB&gt; option = new UpdateOption&lt;MemberCB&gt;();
     * option.self(new SpecifyQuery&lt;MemberCB&gt;() {
     *     public void specify(MemberCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * memberBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(member, cb, option);
     * </pre>
     * @param member The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of MbleMember. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    def varyingQueryUpdate(member: MbleMember, cb: MemberCB, option: UpdateOption[MemberCB]): Integer = {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(member, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of MbleMember. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    def varyingQueryDelete(cb: MemberCB, option: DeleteOption[MemberCB]): Integer = {
        assertDeleteOptionNotNull(option);
        return doQueryDelete(cb, option);
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the basic executor of outside-SQL to execute it. <br />
     * The invoker of behavior command should be not null when you call this method.
     * <pre>
     * You can use the methods for outside-SQL are as follows:
     * {Basic}
     *   o selectList()
     *   o execute()
     *   o call()
     *
     * {Entity}
     *   o entityHandling().selectEntity()
     *   o entityHandling().selectEntityWithDeletedCheck()
     *
     * {Paging}
     *   o autoPaging().selectList()
     *   o autoPaging().selectPage()
     *   o manualPaging().selectList()
     *   o manualPaging().selectPage()
     *
     * {Cursor}
     *   o cursorHandling().selectCursor()
     *
     * {Option}
     *   o dynamicBinding().selectList()
     *   o removeBlockComment().selectList()
     *   o removeLineComment().selectList()
     *   o formatSql().selectList()
     * </pre>
     * @return The basic executor of outside-SQL. (NotNull)
     */
    def outsideSql(): OutsideSqlBasicExecutor[MemberBhv] = {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected def delegateSelectCountUniquely(cb: MemberCB): Integer = { return invoke(createSelectCountCBCommand(cb, true)); }
    protected def delegateSelectCountPlainly(cb: MemberCB): Integer = { return invoke(createSelectCountCBCommand(cb, false)); }
    protected def delegateSelectCursor[ENTITY <: MbleMember](cb: MemberCB, rh: EntityRowHandler[ENTITY], tp: Class[ENTITY])
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected def delegateSelectList[ENTITY <: MbleMember](cb: MemberCB, tp: Class[ENTITY]): List[ENTITY] =
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected def delegateInsert(et: MbleMember, op: InsertOption[MemberCB]): Integer =
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected def delegateUpdate(et: MbleMember, op: UpdateOption[MemberCB]): Integer =
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateEntityCommand(et, op)); }
    protected def delegateUpdateNonstrict(et: MbleMember, op: UpdateOption[MemberCB]): Integer =
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected def delegateDelete(et: MbleMember, op: DeleteOption[MemberCB]): Integer =
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteEntityCommand(et, op)); }
    protected def delegateDeleteNonstrict(et: MbleMember, op: DeleteOption[MemberCB]): Integer =
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected def delegateBatchInsert(ls: List[MbleMember], op: InsertOption[MemberCB]): Array[Int] =
    { if (ls.isEmpty()) { return new Array[Int](0); }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)).asInstanceOf[Array[Int]]; }
    protected def delegateBatchUpdate(ls: List[MbleMember], op: UpdateOption[MemberCB]): Array[Int] =
    { if (ls.isEmpty()) { return new Array[Int](0); }
      return invoke(createBatchUpdateCommand(processBatchInternally(ls, op, false), op)).asInstanceOf[Array[Int]]; }
    protected def delegateBatchUpdateNonstrict(ls: List[MbleMember], op: UpdateOption[MemberCB]): Array[Int] =
    { if (ls.isEmpty()) { return new Array[Int](0); }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)).asInstanceOf[Array[Int]]; }
    protected def delegateBatchDelete(ls: List[MbleMember], op: DeleteOption[MemberCB]): Array[Int] =
    { if (ls.isEmpty()) { return new Array[Int](0); }
      return invoke(createBatchDeleteCommand(processBatchInternally(ls, op, false), op)).asInstanceOf[Array[Int]]; }
    protected def delegateBatchDeleteNonstrict(ls: List[MbleMember], op: DeleteOption[MemberCB]): Array[Int] =
    { if (ls.isEmpty()) { return new Array[Int](0); }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)).asInstanceOf[Array[Int]]; }

    protected def delegateQueryInsert(et: MbleMember, inCB: MemberCB, resCB: ConditionBean, op: InsertOption[MemberCB]): Integer =
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; }
      return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected def delegateQueryUpdate(et: MbleMember, cb: MemberCB, op: UpdateOption[MemberCB]): Integer =
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; }
      return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected def delegateQueryDelete(cb: MemberCB, op: DeleteOption[MemberCB]): Integer =
    { if (!processBeforeQueryDelete(cb, op)) { return 0; }
      return invoke(createQueryDeleteCBCommand(cb, op));  }

    // ===================================================================================
    //                                                                Optimistic Lock Info
    //                                                                ====================
    /**
     * {@inheritDoc}
     */
    @Override
    protected def hasVersionNoValue(et: Entity): Boolean = {
        return !(downcast(et).versionNo() + "").equals("null");// For primitive type
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected def hasUpdateDateValue(et: Entity): Boolean = {
        return false;
    }

    // ===================================================================================
    //                                                                     Downcast Helper
    //                                                                     ===============
    protected def downcast(et: Entity): MbleMember = {
        return helpEntityDowncastInternally(et, classOf[MbleMember]);
    }

    protected def downcast(cb: ConditionBean): MemberCB = {
        return helpConditionBeanDowncastInternally(cb, classOf[MemberCB]);
    }

    protected def downcast(ls: List[_ <: Entity]): List[MbleMember] = {
        return ls.asInstanceOf[List[MbleMember]];
    }

    protected def downcast(op: InsertOption[_ <: ConditionBean]): InsertOption[MemberCB] = {
        return op.asInstanceOf[InsertOption[MemberCB]];
    }

    protected def downcast(op: UpdateOption[_ <: ConditionBean]): UpdateOption[MemberCB] = {
        return op.asInstanceOf[UpdateOption[MemberCB]];
    }

    protected def downcast(op: DeleteOption[_ <: ConditionBean]): DeleteOption[MemberCB] = {
        return op.asInstanceOf[DeleteOption[MemberCB]];
    }

    protected def downcast(sp: QueryInsertSetupper[_ <: Entity, _ <: ConditionBean]): QueryInsertSetupper[MbleMember, MemberCB] = {
        return sp.asInstanceOf[QueryInsertSetupper[MbleMember, MemberCB]];
    }

    // ===================================================================================
    //                                                                        Scala Helper
    //                                                                        ============
    protected def toScalaList[ENTITY](javaList: Collection[ENTITY]): scala.collection.immutable.List[ENTITY] = {
         // #pending easy convert for now
        return scala.collection.immutable.List.fromArray(javaList.toArray()).asInstanceOf[scala.collection.immutable.List[ENTITY]];
    }
}
