package com.example.dbflute.scala.dbflute.bsbhv;

import scala.collection.JavaConverters._;

import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

import org.seasar.dbflute._;
import org.seasar.dbflute.bhv._;
import org.seasar.dbflute.bhv.AbstractBehaviorReadable._;
import org.seasar.dbflute.bhv.AbstractBehaviorWritable._;
import org.seasar.dbflute.cbean._;
import org.seasar.dbflute.cbean.chelper._;
import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.exception._;
import org.seasar.dbflute.util._;
import org.seasar.dbflute.outsidesql.executor._;
import com.example.dbflute.scala.dbflute.allcommon._;
import com.example.dbflute.scala.dbflute.exbhv._;
import com.example.dbflute.scala.dbflute.bsbhv.loader._;
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
    /** Simple Member Select */
    val PATH_selectSimpleMember: String = "selectSimpleMember";
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    def getTableDbName(): String = { return "MEMBER"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    def getDBMeta(): DBMeta = { return MemberDbm; }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    def newEntity(): DbleMember = { return new DbleMember(); }

    /** {@inheritDoc} */
    def newConditionBean(): MemberCB = { return new MemberCB(); }

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
     * @param cb The condition-bean of DbleMember. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    def selectCount(cbCall: (MemberCB) => Unit): Int = {
        return facadeSelectCount(callbackCB(cbCall));
    }

    protected def facadeSelectCount(cb: MemberCB): Int = {
        return doSelectCountUniquely(cb);
    }

    protected def doSelectCountUniquely(cb: MemberCB): Int = { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected def doSelectCountPlainly(cb: MemberCB): Int = { // called by selectPage(cb)
        assertCBStateValid(cb);
        return delegateSelectCountPlainly(cb);
    }

    override protected def doReadCount(cb: ConditionBean): Int = {
        return facadeSelectCount(downcast(cb));
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
     * OptionalEntity&lt;DbleMember&gt; entity = memberBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     *
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * entity.<span style="color: #DD4747">required</span>(member -&gt; {
     *     ...
     * });
     * DbleMember member = entity.entity.<span style="color: #DD4747">get()</span>;
     *
     * <span style="color: #3F7E5E">// if it might be no data, ifPresent(), isPresent(), ...</span>
     * entity.<span style="color: #DD4747">ifPresent</span>(member -&gt; {
     *     ...
     * });
     * if (entity.entity.<span style="color: #DD4747">isPresent()</span>) {
     *     DbleMember member = entity.entity.<span style="color: #DD4747">get()</span>;
     * } else {
     *     ...
     * }
     * </pre>
     * @param cbCall The callback for condition-bean of Member. (NotNull)
     * @param loaderCall The callback for referrer loader of Member. (NoArgAllowed: then no loading)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get() of return value is called and the value is null, which means entity has already been deleted (point is not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    def selectEntity(cbCall: (MemberCB) => Unit)(implicit loaderCall: (LoaderOfMember) => Unit = null): Option[Member] = {
        return facadeSelectEntity(callbackCB(cbCall))(loaderCall).map(_.toImmutable);
    }

    protected def facadeSelectEntity(cb: MemberCB)(loaderCall: (LoaderOfMember) => Unit = null): Option[DbleMember] = {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity())(loaderCall);
    }

    protected def doSelectEntity[ENTITY <: DbleMember](cb: MemberCB, tp: Class[ENTITY])(loaderCall: (LoaderOfMember) => Unit = null): ENTITY = {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        val dble = helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback[ENTITY, MemberCB]() {
            def callbackSelectList(lcb: MemberCB, ltp: Class[ENTITY]): List[ENTITY] = { return doSelectList(lcb, ltp)(); } });
        if (dble != null) {
            callbackLoader(DfCollectionUtil.newArrayList(dble.asInstanceOf[DbleMember]), loaderCall);
        }
        return dble;
    }

    protected def doSelectOptionalEntity[ENTITY <: DbleMember](cb: MemberCB, tp: Class[ENTITY])(loaderCall: (LoaderOfMember) => Unit = null): Option[ENTITY] = {
        return Option.apply(doSelectEntity(cb, tp)(loaderCall));
    }

    @Override
    protected def doReadEntity(cb: ConditionBean): Entity = {
        return facadeSelectEntity(downcast(cb))().orNull;
    }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * MemberCB cb = new MemberCB();
     * cb.query().setFoo...(value);
     * DbleMember member = memberBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = member.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbCall The callback for condition-bean of Member. (NotNull)
     * @param loaderCall The callback for referrer loader of Member. (NoArgAllowed: then no loading)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (point is not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    def selectEntityWithDeletedCheck(cbCall: (MemberCB) => Unit)(implicit loaderCall: (LoaderOfMember) => Unit = null): Member = {
        return facadeSelectEntityWithDeletedCheck(callbackCB(cbCall))(loaderCall).toImmutable;
    }

    protected def facadeSelectEntityWithDeletedCheck(cb: MemberCB)(loaderCall: (LoaderOfMember) => Unit = null): DbleMember = {
        return doSelectEntityWithDeletedCheck(cb, typeOfSelectedEntity())(loaderCall);
    }

    protected def doSelectEntityWithDeletedCheck[ENTITY <: DbleMember](cb: MemberCB, tp: Class[ENTITY])(loaderCall: (LoaderOfMember) => Unit = null): ENTITY = {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        val dble = helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback[ENTITY, MemberCB]() {
            def callbackSelectList(lcb: MemberCB, ltp: Class[ENTITY]): List[ENTITY] = { return doSelectList(lcb, ltp)(); } });
        callbackLoader(DfCollectionUtil.newArrayList(dble.asInstanceOf[DbleMember]), loaderCall);
        return dble;
    }

    @Override
    protected def doReadEntityWithDeletedCheck(cb: ConditionBean): Entity = {
        return facadeSelectEntityWithDeletedCheck(downcast(cb))();
    }

    /**
     * Select the entity by the primary-key value.
     * @param memberId (会員ID): PK, ID, NotNull, INTEGER(10). (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    def selectByPK(memberId: Integer): Option[Member] = {
        return facadeSelectByPK(memberId).map(_.toImmutable);
    }

    protected def facadeSelectByPK(memberId: Integer): Option[DbleMember] = {
        return doSelectByPK(memberId, typeOfSelectedEntity());
    }

    protected def doSelectByPK[ENTITY <: DbleMember](memberId: Integer, tp: Class[ENTITY]): Option[ENTITY] = {
        return Option.apply(doSelectEntity(xprepareCBAsPK(memberId), tp)());
    }

    protected def xprepareCBAsPK(memberId: Integer): MemberCB = {
        assertObjectNotNull("memberId", memberId);
        return newConditionBean().acceptPK(memberId);
    }

    /**
     * Select the entity by the unique-key value.
     * @param memberAccount (会員アカウント): UQ, NotNull, VARCHAR(50). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    def selectByUniqueOf(memberAccount: String): Option[Member] = {
        return facadeSelectByUniqueOf(memberAccount).map(_.toImmutable);
    }

    protected def facadeSelectByUniqueOf(memberAccount: String): Option[DbleMember] = {
        return doSelectByUniqueOf(memberAccount, typeOfSelectedEntity());
    }

    protected def doSelectByUniqueOf[ENTITY <: DbleMember](memberAccount: String, tp: Class[ENTITY]): Option[ENTITY] = {
        return Option.apply(doSelectEntity(xprepareCBAsUniqueOf(memberAccount), tp)());
    }

    protected def xprepareCBAsUniqueOf(memberAccount: String): MemberCB = {
        assertObjectNotNull("memberAccount", memberAccount);
        return newConditionBean().acceptUniqueOf(memberAccount);
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
     * List&lt;${Member}&gt; memberList = memberBhv.<span style="color: #DD4747">selectList</span>(cb);
     * memberList.foreach(member =>
     *     ... = member...;
     * }
     * </pre>
     * @param cbCall The callback for condition-bean of Member. (NotNull)
     * @param loaderCall The callback for referrer loader of Member. (NoArgAllowed: then no loading)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    def selectList(cbCall: (MemberCB) => Unit)(implicit loaderCall: (LoaderOfMember) => Unit = null): scala.collection.immutable.List[Member] = {
        return toImmutableEntityList(facadeSelectList(callbackCB(cbCall))(loaderCall));
    }

    protected def facadeSelectList(cb: MemberCB)(loaderCall: (LoaderOfMember) => Unit = null): ListResultBean[DbleMember] = {
        return doSelectList(cb, typeOfSelectedEntity())(loaderCall);
    }

    protected def doSelectList[ENTITY <: DbleMember](cb: MemberCB, tp: Class[ENTITY])(loaderCall: (LoaderOfMember) => Unit = null): ListResultBean[ENTITY] = {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        val dbleList = helpSelectListInternally(cb, tp, new InternalSelectListCallback[ENTITY, MemberCB]() {
            def callbackSelectList(lcb: MemberCB, ltp: Class[ENTITY]): List[ENTITY] = { return delegateSelectList(lcb, ltp); } });
        callbackLoader(dbleList.asInstanceOf[List[DbleMember]], loaderCall);
        return dbleList;
    }

    @Override
    protected def doReadList(cb: ConditionBean): ListResultBean[_ <: Entity] = {
        return facadeSelectList(downcast(cb))();
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
     * PagingResultBean&lt;DbleMember&gt; page = memberBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (DbleMember member : page) {
     *     ... = member.get...();
     * }
     * </pre>
     * @param cbCall The callback for condition-bean of Member. (NotNull)
     * @param loaderCall The callback for referrer loader of Member. (NoArgAllowed: then no loading)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    def selectPage(cbCall: (MemberCB) => Unit)(implicit loaderCall: (LoaderOfMember) => Unit = null): ScrPagingView[Member] = {
        return newPagingView(facadeSelectPage(callbackCB(cbCall))(loaderCall));
    }

    protected def facadeSelectPage(cb: MemberCB)(loaderCall: (LoaderOfMember) => Unit = null): PagingResultBean[DbleMember] = {
        return doSelectPage(cb, typeOfSelectedEntity())(loaderCall);
    }

    protected def doSelectPage[ENTITY <: DbleMember](cb: MemberCB, tp: Class[ENTITY])(loaderCall: (LoaderOfMember) => Unit = null): PagingResultBean[ENTITY] = {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback[ENTITY, MemberCB]() {
            def callbackSelectCount(cb: MemberCB): Int = { return doSelectCountPlainly(cb); }
            def callbackSelectList(cb: MemberCB, tp: Class[ENTITY]): List[ENTITY] = { return doSelectList(cb, tp)(loaderCall); }
        });
    }

    @Override
    protected def doReadPage(cb: ConditionBean): PagingResultBean[_ <: Entity] = {
        return facadeSelectPage(downcast(cb))();
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * MemberCB cb = new MemberCB();
     * cb.query().setFoo...(value);
     * memberBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;DbleMember&gt;() {
     *     public void handle(DbleMember entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of DbleMember. (NotNull)
     * @param entityRowHandler The handler of entity row of DbleMember. (NotNull)
     */
    def selectCursor(cbCall: (MemberCB) => Unit)(rowCall: (Member) => Unit): Unit = {
        facadeSelectCursor(callbackCB(cbCall), new EntityRowHandler[DbleMember]() {
            def handle(entity: DbleMember): Unit = { rowCall(entity.toImmutable) }
        });
    }

    protected def facadeSelectCursor(cb: MemberCB, handler: EntityRowHandler[DbleMember]): Unit = {
        doSelectCursor(cb, handler, typeOfSelectedEntity());
    }

    protected def doSelectCursor[ENTITY <: DbleMember](cb: MemberCB, handler: EntityRowHandler[ENTITY], tp: Class[ENTITY]): Unit = {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback[ENTITY, MemberCB]() {
            def callbackSelectCursor(lcb: MemberCB, lhandler: EntityRowHandler[ENTITY], ltp: Class[ENTITY]): Unit = { delegateSelectCursor(lcb, lhandler, ltp); }
            def callbackSelectList(lcb: MemberCB, ltp: Class[ENTITY]): List[ENTITY] = { return doSelectList(lcb, ltp)(); }
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
    def scalarSelect[RESULT](resultType: Class[RESULT]): ScrHpSLSFunction[MemberCB, RESULT] = {
        return toScalaSLSFunction[RESULT](facadeScalarSelect(resultType));
    }

    protected def toScalaSLSFunction[RESULT](function: HpSLSFunction[MemberCB, RESULT]): ScrHpSLSFunction[MemberCB, RESULT] =
    { new ScrHpSLSFunction[MemberCB, RESULT](function) }

    protected def facadeScalarSelect[RESULT](resultType: Class[RESULT]): HpSLSFunction[MemberCB, RESULT] = {
        return doScalarSelect(resultType, newConditionBean());
    }

    protected def doScalarSelect[RESULT, CB <: MemberCB](tp: Class[RESULT], cb: CB): HpSLSFunction[CB, RESULT] = {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLSFunction[CB, RESULT](cb, tp, createHpSLSExecutor());
    }

    protected def doReadScalar[RESULT](tp: Class[RESULT]): HpSLSFunction[_ <: ConditionBean, RESULT] = {
        return facadeScalarSelect(tp);
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
     * for (DbleMember member : memberList) {
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
    def loadPurchaseList(memberList: List[DbleMember], setupCall: (PurchaseCB) => Unit): NestedReferrerListGateway[DblePurchase] = {
        assertObjectNotNull("memberList", memberList); assertObjectNotNull("setupCall", setupCall);
        val setupper = new ReferrerConditionSetupper[PurchaseCB]() { def setup(referrerCB: PurchaseCB): Unit = { setupCall(referrerCB); } }
        return doLoadPurchaseList(memberList, new LoadReferrerOption[PurchaseCB, DblePurchase]().xinit(setupper));
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
    def loadPurchaseList(member: DbleMember, setupCall: (PurchaseCB) => Unit): NestedReferrerListGateway[DblePurchase] = {
        assertObjectNotNull("member", member); assertObjectNotNull("setupCall", setupCall);
        val setupper = new ReferrerConditionSetupper[PurchaseCB]() { def setup(referrerCB: PurchaseCB): Unit = { setupCall(referrerCB); } }
        return doLoadPurchaseList(xnewLRLs(member), new LoadReferrerOption[PurchaseCB, DblePurchase]().xinit(setupper));
    }

    protected def doLoadPurchaseList(memberList: List[DbleMember], option: LoadReferrerOption[PurchaseCB, DblePurchase]): NestedReferrerListGateway[DblePurchase] = {
        val referrerBhv: PurchaseBhv = xgetBSFLR().select(classOf[PurchaseBhv]);
        return helpLoadReferrerInternally(memberList, option, new InternalLoadReferrerCallback[DbleMember, Integer, PurchaseCB, DblePurchase]() {
            def getPKVal(et: DbleMember): Integer =
            { return et.getMemberId(); }
            def setRfLs(et: DbleMember, ls: List[DblePurchase]): Unit =
            { et.setPurchaseList(ls); }
            def newMyCB(): PurchaseCB = { return referrerBhv.newConditionBean(); }
            def qyFKIn(cb: PurchaseCB, ls: List[Integer]): Unit =
            { cb.query().setMemberId_InScope(toScalaList(ls).map(_.asInstanceOf[Int])); }
            def qyOdFKAsc(cb: PurchaseCB): Unit = { cb.query().addOrderBy_MemberId_Asc(); }
            def spFKCol(cb: PurchaseCB): Unit = { cb.specify().columnMemberId(); }
            def selRfLs(cb: PurchaseCB): List[DblePurchase] = { return referrerBhv.readList(cb).asInstanceOf[List[DblePurchase]]; }
            def getFKVal(re: DblePurchase): Integer = { return re.getMemberId(); }
            def setlcEt(re: DblePurchase, le: DbleMember): Unit =
            { re.setMember(Option.apply(le)); }
            def getRfPrNm(): String = { return "purchaseList"; }
        });
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'DbleMemberStatus'.
     * @param memberList The list of member. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    def pulloutMemberStatus(memberList: scala.collection.immutable.List[Member]): scala.collection.immutable.List[MemberStatus] = {
        val dbleList = helpPulloutInternally(toDBableEntityList(memberList), new InternalPulloutCallback[DbleMember, DbleMemberStatus]() {
            def getFr(et: DbleMember): DbleMemberStatus =
            { return et.getMemberStatus().orNull; }
            def hasRf(): Boolean = { return true; }
            def setRfLs(et: DbleMemberStatus, ls: List[DbleMember]): Unit =
            { et.setMemberList(ls); }
        });
        return toScalaList(dbleList).map(new MemberStatus(_));
    }

    /**
     * Pull out the list of referrer-as-one table 'DbleMemberService'.
     * @param memberList The list of member. (NotNull, EmptyAllowed)
     * @return The list of referrer-as-one table. (NotNull, EmptyAllowed, NotNullElement)
     */
    def pulloutMemberServiceAsOne(memberList: scala.collection.immutable.List[Member]): scala.collection.immutable.List[MemberService] = {
        val dbleList = helpPulloutInternally(toDBableEntityList(memberList), new InternalPulloutCallback[DbleMember, DbleMemberService]() {
            def getFr(et: DbleMember): DbleMemberService =
            { return et.getMemberServiceAsOne().orNull; }
            def hasRf(): Boolean = { return true; }
            def setRfLs(et: DbleMemberService, ls: List[DbleMember]): Unit =
            { if (!ls.isEmpty()) { et.setMember(Option.apply(ls.get(0))); } }
        });
        return toScalaList(dbleList).map(new MemberService(_));
    }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key memberId.
     * @param memberList The list of member. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    def extractMemberIdList(memberList: scala.collection.immutable.List[Member]): scala.collection.immutable.List[Int] = {
        return toScalaList(helpExtractListInternally(toDBableEntityList(memberList), new InternalExtractCallback[DbleMember, Integer]() {
            def getCV(et: DbleMember): Integer = { return et.getMemberId(); }
        })).map(_.asInstanceOf[Int]);
    }

    /**
     * Extract the value list of (single) unique key memberAccount.
     * @param memberList The list of member. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    def extractMemberAccountList(memberList: scala.collection.immutable.List[Member]): scala.collection.immutable.List[String] = {
        return toScalaList(helpExtractListInternally(toDBableEntityList(memberList), new InternalExtractCallback[DbleMember, String]() {
            def getCV(et: DbleMember): String = { return et.getMemberAccount(); }
        })).map(_.asInstanceOf[String]);
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * DbleMember member = new DbleMember();
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
     * @param entityCall The callback for entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param optionCall The callback for option of insert. (NoArgAllowed: then no option)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    def insert(entityCall: (MbleMember) => Unit)(implicit optionCall: (ScrInsertOption[MemberCB]) => Unit = null): Unit = {
        assertObjectNotNull("entityCall", entityCall);
        doInsert(callbackMbleEntityToDBable(entityCall), callbackInsertOption(optionCall));
    }

    protected def doInsert(et: DbleMember, op: InsertOption[MemberCB]): Unit = {
        assertObjectNotNull("member", et);
        prepareInsertOption(op);
        delegateInsert(et, op);
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
        doInsert(downcast(et), downcast(op));
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl)
     * <pre>
     * DbleMember member = new DbleMember();
     * member.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * member.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//member.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//member.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * member.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     memberBhv.<span style="color: #DD4747">update</span>(member);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param entityCall The callback for entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param optionCall The callback for option of update. (NoArgAllowed: then no option)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    def update(entityCall: (MbleMember) => Unit)(implicit optionCall: (ScrUpdateOption[MemberCB]) => Unit = null): Unit = {
        assertObjectNotNull("entityCall", entityCall);
        doUpdate(callbackMbleEntityToDBable(entityCall), callbackUpdateOption(optionCall));
    }

    protected def doUpdate(et: DbleMember, op: UpdateOption[MemberCB]): Unit = {
        assertObjectNotNull("member", et);
        prepareUpdateOption(op);
        helpUpdateInternally(et, new InternalUpdateCallback[DbleMember]() {
            def callbackDelegateUpdate(let: DbleMember): Int = { return delegateUpdate(let, op); } });
    }

    protected def prepareUpdateOption(op: UpdateOption[MemberCB]): Unit = {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) { op.resolveSelfSpecification(createCBForVaryingUpdate()); }
        if (op.hasSpecifiedUpdateColumn()) { op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate()); }
    }

    protected def createCBForVaryingUpdate(): MemberCB =
    { val cb: MemberCB = newConditionBean(); cb.xsetupForVaryingUpdate(); return cb; }

    protected def createCBForSpecifiedUpdate(): MemberCB =
    { val cb: MemberCB = newConditionBean(); cb.xsetupForSpecifiedUpdate(); return cb; }

    @Override
    protected def doModify(et: Entity, op: UpdateOption[_ <: ConditionBean]): Unit = {
        doUpdate(downcast(et), downcast(op));
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * DbleMember member = new DbleMember();
     * member.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * member.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//member.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//member.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//member.setVersionNo(value);</span>
     * memberBhv.<span style="color: #DD4747">updateNonstrict</span>(member);
     * </pre>
     * @param entityCall The callback for entity of update. (NotNull, PrimaryKeyNotNull)
     * @param optionCall The callback for option of update. (NoArgAllowed: then no option)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    def updateNonstrict(entityCall: (MbleMember) => Unit)(implicit optionCall: (ScrUpdateOption[MemberCB]) => Unit = null): Unit = {
        doUpdateNonstrict(callbackMbleEntityToDBable(entityCall), callbackUpdateOption(optionCall));
    }

    protected def doUpdateNonstrict(et: DbleMember, op: UpdateOption[MemberCB]): Unit = {
        assertObjectNotNull("member", et);
        prepareUpdateOption(op);
        helpUpdateNonstrictInternally(et, new InternalUpdateNonstrictCallback[DbleMember]() {
            def callbackDelegateUpdateNonstrict(let: DbleMember): Int = { return delegateUpdateNonstrict(let, op); } });
    }

    @Override
    protected def doModifyNonstrict(et: Entity, op: UpdateOption[_ <: ConditionBean]): Unit = {
        doUpdateNonstrict(downcast(et), downcast(op));
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param entityCall The callback for entity of insert or update. (NotNull, ...depends on insert or update)
     * @param insertOptionCall The callback for option of insert. (NoArgAllowed: then no option)
     * @param updateOptionCall The callback for option of update. (NoArgAllowed: then no option)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    def insertOrUpdate(entityCall: (MbleMember) => Unit)(implicit insertOptionCall: (ScrInsertOption[MemberCB]) => Unit = null, updateOptionCall: (ScrUpdateOption[MemberCB]) => Unit = null): Unit = {
        doInsertOrUpdate(callbackMbleEntityToDBable(entityCall), callbackInsertOption(insertOptionCall), callbackUpdateOption(updateOptionCall));
    }

    protected def doInsertOrUpdate(et: DbleMember, iop: InsertOption[MemberCB], uop: UpdateOption[MemberCB]): Unit = {
        helpInsertOrUpdateInternally(et, new InternalInsertOrUpdateCallback[DbleMember, MemberCB]() {
            def callbackInsert(let: DbleMember): Unit = { doInsert(let, iop); }
            def callbackUpdate(let: DbleMember): Unit = { doUpdate(let, uop); }
            def callbackNewMyConditionBean(): MemberCB = { return newConditionBean(); }
            def callbackSelectCount(cb: MemberCB): Int = { return facadeSelectCount(cb); }
        });
    }

    @Override
    protected def doCreateOrModify(et: Entity, iop: InsertOption[_ <: ConditionBean], uop: UpdateOption[_ <: ConditionBean]): Unit = {
        doInsertOrUpdate(downcast(et), downcast(iop), downcast(uop));
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param entityCall The callback for entity of insert or update. (NotNull, ...depends on insert or update)
     * @param insertOptionCall The callback for option of insert. (NoArgAllowed: then no option)
     * @param updateOptionCall The callback for option of update. (NoArgAllowed: then no option)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    def insertOrUpdateNonstrict(entityCall: (MbleMember) => Unit)(implicit insertOptionCall: (ScrInsertOption[MemberCB]) => Unit = null, updateOptionCall: (ScrUpdateOption[MemberCB]) => Unit = null): Unit = {
        doInsertOrUpdateNonstrict(callbackMbleEntityToDBable(entityCall), callbackInsertOption(insertOptionCall), callbackUpdateOption(updateOptionCall));
    }

    protected def doInsertOrUpdateNonstrict(et: DbleMember, iop: InsertOption[MemberCB], uop: UpdateOption[MemberCB]): Unit = {
        helpInsertOrUpdateInternally(et, new InternalInsertOrUpdateNonstrictCallback[DbleMember]() {
            def callbackInsert(let: DbleMember): Unit = { doInsert(let, iop); }
            def callbackUpdateNonstrict(let: DbleMember): Unit = { doUpdateNonstrict(let, uop); }
        });
    }

    @Override
    protected def doCreateOrModifyNonstrict(et: Entity, iop: InsertOption[_ <: ConditionBean], uop: UpdateOption[_ <: ConditionBean]): Unit = {
        doInsertOrUpdateNonstrict(downcast(et), downcast(iop), downcast(uop));
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl)
     * <pre>
     * DbleMember member = new DbleMember();
     * member.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * member.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     memberBhv.<span style="color: #DD4747">delete</span>(member);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param entityCall The callback for entity of delete. (NotNull, PrimaryKeyNotNull)
     * @param optionCall The callback for option of delete. (NoArgAllowed: then no option)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    def delete(entityCall: (MbleMember) => Unit)(implicit optionCall: (ScrDeleteOption[MemberCB]) => Unit = null): Unit = {
        doDelete(callbackMbleEntityToDBable(entityCall), callbackDeleteOption(optionCall));
    }

    protected def doDelete(et: DbleMember, op: DeleteOption[MemberCB]): Unit = {
        assertObjectNotNull("member", et);
        prepareDeleteOption(op);
        helpDeleteInternally(et, new InternalDeleteCallback[DbleMember]() {
            def callbackDelegateDelete(let: DbleMember): Int = { return delegateDelete(let, op); } });
    }

    protected def prepareDeleteOption(op: DeleteOption[MemberCB]): Unit =
    { if (op != null) { assertDeleteOptionStatus(op); } }

    @Override
    protected def doRemove(et: Entity, op: DeleteOption[_ <: ConditionBean]): Unit = {
        doDelete(downcast(et), downcast(op));
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * DbleMember member = new DbleMember();
     * member.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//member.setVersionNo(value);</span>
     * memberBhv.<span style="color: #DD4747">deleteNonstrict</span>(member);
     * </pre>
     * @param entityCall The callback for entity of delete. (NotNull, PrimaryKeyNotNull)
     * @param optionCall The callback for option of delete. (NoArgAllowed: then no option)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    def deleteNonstrict(entityCall: (MbleMember) => Unit)(implicit optionCall: (ScrDeleteOption[MemberCB]) => Unit = null): Unit = {
        doDeleteNonstrict(callbackMbleEntityToDBable(entityCall), callbackDeleteOption(optionCall));
    }

    protected def doDeleteNonstrict(et: DbleMember, op: DeleteOption[MemberCB]): Unit = {
        assertObjectNotNull("member", et);
        prepareDeleteOption(op);
        helpDeleteNonstrictInternally(et, new InternalDeleteNonstrictCallback[DbleMember]() {
            def callbackDelegateDeleteNonstrict(let: DbleMember): Int = { return delegateDeleteNonstrict(let, op); } });
    }

    @Override
    protected def doRemoveNonstrict(et: Entity, op: DeleteOption[_ <: ConditionBean]): Unit = {
        doDeleteNonstrict(downcast(et), downcast(op));
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
     *     DbleMember member = new DbleMember();
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
    def batchInsert(batchCall: (ScrBatchEntityList[MbleMember]) => Unit)(implicit optionCall: (ScrInsertOption[MemberCB]) => Unit = null): Array[Int] = {
        return doBatchInsert(callbackBatch(batchCall), callbackInsertOption(optionCall));
    }

    protected def doBatchInsert(ls: List[DbleMember], op: InsertOption[MemberCB]): Array[Int] = {
        assertObjectNotNull("memberList", ls);
        val rlop: InsertOption[MemberCB] = if (op != null) { op } else { createPlainInsertOption() }
        prepareBatchInsertOption(ls, op); // required
        return delegateBatchInsert(ls, op);
    }

    protected def prepareBatchInsertOption(ls: List[DbleMember], op: InsertOption[MemberCB]): Unit = {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(ls);
        prepareInsertOption(op);
    }

    @Override
    protected def doLumpCreate(ls: List[Entity], op: InsertOption[_ <: ConditionBean]): Array[Int] = {
        return doBatchInsert(downcast(ls), downcast(op));
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     DbleMember member = new DbleMember();
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
    def batchUpdate(batchCall: (ScrBatchEntityList[MbleMember]) => Unit)(implicit optionCall: (ScrUpdateOption[MemberCB]) => Unit = null): Array[Int] = {
        return doBatchUpdate(callbackBatch(batchCall), callbackUpdateOption(optionCall));
    }

    protected def doBatchUpdate(ls: List[DbleMember], op: UpdateOption[MemberCB]): Array[Int] = {
        assertObjectNotNull("memberList", ls);
        val rlop: UpdateOption[MemberCB] = if (op != null) { op } else { createPlainUpdateOption() }
        prepareBatchUpdateOption(ls, rlop); // required
        return delegateBatchUpdate(ls, rlop);
    }

    protected def prepareBatchUpdateOption(ls: List[DbleMember], op: UpdateOption[MemberCB]): Unit = {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(ls);
        prepareUpdateOption(op);
    }

    @Override
    protected def doLumpModify(ls: List[Entity], op: UpdateOption[_ <: ConditionBean]): Array[Int] = {
        doBatchUpdate(downcast(ls), downcast(op));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     DbleMember member = new DbleMember();
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
    def batchUpdateNonstrict(batchCall: (ScrBatchEntityList[MbleMember]) => Unit)(implicit optionCall: (ScrUpdateOption[MemberCB]) => Unit = null): Array[Int] = {
        return doBatchUpdateNonstrict(callbackBatch(batchCall), callbackUpdateOption(optionCall));
    }

    protected def doBatchUpdateNonstrict(ls: List[DbleMember], op: UpdateOption[MemberCB]): Array[Int] = {
        assertObjectNotNull("memberList", ls);
        val rlop: UpdateOption[MemberCB] = if (op != null) { op } else { createPlainUpdateOption() }
        prepareBatchUpdateOption(ls, rlop);
        return delegateBatchUpdateNonstrict(ls, rlop);
    }

    @Override
    protected def doLumpModifyNonstrict(ls: List[Entity], op: UpdateOption[_ <: ConditionBean]): Array[Int] = {
        return doBatchUpdateNonstrict(downcast(ls), downcast(op));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param memberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    def batchDelete(batchCall: (ScrBatchEntityList[MbleMember]) => Unit)(implicit optionCall: (ScrDeleteOption[MemberCB]) => Unit = null): Array[Int] = {
        return doBatchDelete(callbackBatch(batchCall), callbackDeleteOption(optionCall));
    }

    protected def doBatchDelete(ls: List[DbleMember], op: DeleteOption[MemberCB]): Array[Int] = {
        assertObjectNotNull("memberList", ls);
        prepareDeleteOption(op);
        return delegateBatchDelete(ls, op);
    }

    @Override
    protected def doLumpRemove(ls: List[Entity], op: DeleteOption[_ <: ConditionBean]): Array[Int] = {
        return doBatchDelete(downcast(ls), downcast(op));
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param memberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    def batchDeleteNonstrict(batchCall: (ScrBatchEntityList[MbleMember]) => Unit)(implicit optionCall: (ScrDeleteOption[MemberCB]) => Unit = null): Array[Int] = {
        return doBatchDeleteNonstrict(callbackBatch(batchCall), callbackDeleteOption(optionCall));
    }

    protected def doBatchDeleteNonstrict(ls: List[DbleMember], op: DeleteOption[MemberCB]): Array[Int] = {
        assertObjectNotNull("memberList", ls);
        prepareDeleteOption(op);
        return delegateBatchDeleteNonstrict(ls, op);
    }

    @Override
    protected def doLumpRemoveNonstrict(ls: List[Entity], op: DeleteOption[_ <: ConditionBean]): Array[Int] = {
        return doBatchDeleteNonstrict(downcast(ls), downcast(op));
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * memberBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;DbleMember, MemberCB&gt;() {
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
     *         <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     *         <span style="color: #3F7E5E">//entity.setVersionNo(value);</span>
     *
     *         return cb;
     *     }
     * });
     * </pre>
     * @param setupper The setup-per of query-insert. (NotNull)
     * @return The inserted count.
     */
    def queryInsert(setupper: QueryInsertSetupper[DbleMember, MemberCB]): Int = {
        return doQueryInsert(setupper, null);
    }

    protected def doQueryInsert(sp: QueryInsertSetupper[DbleMember, MemberCB], op: InsertOption[MemberCB]): Int = {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        val et: DbleMember = newEntity();
        val cb: MemberCB = createCBForQueryInsert();
        return delegateQueryInsert(et, cb, sp.setup(et, cb), op);
    }

    protected def createCBForQueryInsert(): MemberCB =
    { val cb: MemberCB = newConditionBean(); cb.xsetupForQueryInsert(); return cb; }

    @Override
    protected def doRangeCreate(setupper: QueryInsertSetupper[_ <: Entity, _ <: ConditionBean], option: InsertOption[_ <: ConditionBean]): Int = {
        doQueryInsert(downcast(setupper), downcast(option));
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * DbleMember member = new DbleMember();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//member.setPK...(value);</span>
     * member.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//member.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//member.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//member.setVersionNo(value);</span>
     * MemberCB cb = new MemberCB();
     * cb.query().setFoo...(value);
     * memberBhv.<span style="color: #DD4747">queryUpdate</span>(member, cb);
     * </pre>
     * @param entityCall The callback for entity that contains update values. (NotNull)
     * @param cbCall The callback for condition-bean of Member. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    def queryUpdate(entityCall: (MbleMember) => Unit)(cbCall: (MemberCB) => Unit): Int = {
        assertObjectNotNull("entityCall", entityCall); assertObjectNotNull("cbCall", cbCall);
        return doQueryUpdate(callbackMbleEntityToDBable(entityCall), callbackCB(cbCall), null);
    }

    protected def doQueryUpdate(member: DbleMember, cb: MemberCB, op: UpdateOption[MemberCB]): Int = {
        assertObjectNotNull("member", member); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return if (checkCountBeforeQueryUpdateIfNeeds(cb)) { delegateQueryUpdate(member, cb, op) } else { 0 };
    }

    @Override
    protected def doRangeModify(et: Entity, cb: ConditionBean, op: UpdateOption[_ <: ConditionBean]): Int = {
        return doQueryUpdate(downcast(et), downcast(cb), downcast(op));
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * MemberCB cb = new MemberCB();
     * cb.query().setFoo...(value);
     * memberBhv.<span style="color: #DD4747">queryDelete</span>(member, cb);
     * </pre>
     * @param cbCall The callback for condition-bean of Member. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    def queryDelete(cbCall: (MemberCB) => Unit): Int = {
        assertObjectNotNull("cbCall", cbCall);
        return doQueryDelete(callbackCB(cbCall), null);
    }

    protected def doQueryDelete(cb: MemberCB, op: DeleteOption[MemberCB]): Int = {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return if (checkCountBeforeQueryUpdateIfNeeds(cb)) { delegateQueryDelete(cb, op) } else { 0 };
    }

    @Override
    protected def doRangeRemove(cb: ConditionBean, op: DeleteOption[_ <: ConditionBean]): Int = {
        return doQueryDelete(downcast(cb), downcast(op));
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
    def outsideSql(): ScrOutsideSqlBasicExecutor[MemberBhv] = {
        return toImmutableOutsideSqlBasicExecutor(doOutsideSql());
    }

    protected def toImmutableOutsideSqlBasicExecutor(executor: OutsideSqlBasicExecutor[MemberBhv]): ScrOutsideSqlBasicExecutor[MemberBhv] =
    { new ScrOutsideSqlBasicExecutor(executor) }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected def delegateSelectCountUniquely(cb: MemberCB): Int = { return Integer2int(invoke(createSelectCountCBCommand(cb, true))); }
    protected def delegateSelectCountPlainly(cb: MemberCB): Int = { return Integer2int(invoke(createSelectCountCBCommand(cb, false))); }
    protected def delegateSelectCursor[ENTITY <: DbleMember](cb: MemberCB, rh: EntityRowHandler[ENTITY], tp: Class[ENTITY])
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected def delegateSelectList[ENTITY <: DbleMember](cb: MemberCB, tp: Class[ENTITY]): List[ENTITY] =
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected def delegateInsert(et: DbleMember, op: InsertOption[MemberCB]): Int =
    { if (!processBeforeInsert(et, op)) { return 0; }
      return Integer2int(invoke(createInsertEntityCommand(et, op))); }
    protected def delegateUpdate(et: DbleMember, op: UpdateOption[MemberCB]): Int =
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return Integer2int(invoke(createUpdateEntityCommand(et, op))); }
    protected def delegateUpdateNonstrict(et: DbleMember, op: UpdateOption[MemberCB]): Int =
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return Integer2int(invoke(createUpdateNonstrictEntityCommand(et, op))); }
    protected def delegateDelete(et: DbleMember, op: DeleteOption[MemberCB]): Int =
    { if (!processBeforeDelete(et, op)) { return 0; }
      return Integer2int(invoke(createDeleteEntityCommand(et, op))); }
    protected def delegateDeleteNonstrict(et: DbleMember, op: DeleteOption[MemberCB]): Int =
    { if (!processBeforeDelete(et, op)) { return 0; }
      return Integer2int(invoke(createDeleteNonstrictEntityCommand(et, op))); }

    protected def delegateBatchInsert(ls: List[DbleMember], op: InsertOption[MemberCB]): Array[Int] =
    { if (ls.isEmpty()) { return new Array[Int](0); }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)).asInstanceOf[Array[Int]]; }
    protected def delegateBatchUpdate(ls: List[DbleMember], op: UpdateOption[MemberCB]): Array[Int] =
    { if (ls.isEmpty()) { return new Array[Int](0); }
      return invoke(createBatchUpdateCommand(processBatchInternally(ls, op, false), op)).asInstanceOf[Array[Int]]; }
    protected def delegateBatchUpdateNonstrict(ls: List[DbleMember], op: UpdateOption[MemberCB]): Array[Int] =
    { if (ls.isEmpty()) { return new Array[Int](0); }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)).asInstanceOf[Array[Int]]; }
    protected def delegateBatchDelete(ls: List[DbleMember], op: DeleteOption[MemberCB]): Array[Int] =
    { if (ls.isEmpty()) { return new Array[Int](0); }
      return invoke(createBatchDeleteCommand(processBatchInternally(ls, op, false), op)).asInstanceOf[Array[Int]]; }
    protected def delegateBatchDeleteNonstrict(ls: List[DbleMember], op: DeleteOption[MemberCB]): Array[Int] =
    { if (ls.isEmpty()) { return new Array[Int](0); }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)).asInstanceOf[Array[Int]]; }

    protected def delegateQueryInsert(et: DbleMember, inCB: MemberCB, resCB: ConditionBean, op: InsertOption[MemberCB]): Int =
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; }
      return Integer2int(invoke(createQueryInsertCBCommand(et, inCB, resCB, op)));  }
    protected def delegateQueryUpdate(et: DbleMember, cb: MemberCB, op: UpdateOption[MemberCB]): Int =
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; }
      return Integer2int(invoke(createQueryUpdateCBCommand(et, cb, op)));  }
    protected def delegateQueryDelete(cb: MemberCB, op: DeleteOption[MemberCB]): Int =
    { if (!processBeforeQueryDelete(cb, op)) { return 0; }
      return Integer2int(invoke(createQueryDeleteCBCommand(cb, op)));  }

    // ===================================================================================
    //                                                                Optimistic Lock Info
    //                                                                ====================
    /**
     * {@inheritDoc}
     */
    @Override
    protected def hasVersionNoValue(et: Entity): Boolean = {
        return downcast(et).getVersionNo() != null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected def hasUpdateDateValue(et: Entity): Boolean = {
        return false;
    }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    protected def typeOfSelectedEntity(): Class[DbleMember] = { classOf[DbleMember] }
    protected def newMbleEntity(): MbleMember = { new MbleMember() }
    protected def newPagingView(rb: PagingResultBean[DbleMember]): ScrPagingView[Member] =
    { new ScrPagingView(toImmutableEntityList(rb), rb) }

    protected def callbackCB(cbCall: (MemberCB) => Unit): MemberCB = {
        assertObjectNotNull("cbCall", cbCall);
        val cb = newConditionBean(); cbCall(cb); return cb;
    }

    protected def callbackBatch(batchCall: (ScrBatchEntityList[MbleMember]) => Unit): List[DbleMember] = {
        assertObjectNotNull("batchCall", batchCall);
        val batch = new ScrBatchEntityList[MbleMember]();
        val entityList: List[DbleMember] = new ArrayList[DbleMember]();
        batch.entityCallList.asScala.map { entityCall =>
            val entity = newMbleEntity(); entityCall(entity); entity.toDBable;
        }
        return entityList;
    }

    protected def callbackMbleEntity(entityCall: (MbleMember) => Unit): MbleMember = {
        assertObjectNotNull("entityCall", entityCall);
        val entity = newMbleEntity(); entityCall(entity); return entity;
    }

    protected def callbackMbleEntityToDBable(entityCall: (MbleMember) => Unit): DbleMember = {
        return callbackMbleEntity(entityCall).toDBable;
    }

    protected def callbackInsertOption(optionCall: (ScrInsertOption[MemberCB]) => Unit): InsertOption[MemberCB] = {
        if (optionCall == null) { return null; }
        val option = new ScrInsertOption[MemberCB](new InsertOption[MemberCB]());
        optionCall(option); return option.toNative;
    }

    protected def callbackUpdateOption(optionCall: (ScrUpdateOption[MemberCB]) => Unit): UpdateOption[MemberCB] = {
        if (optionCall == null) { return null; }
        val option = new ScrUpdateOption[MemberCB](new UpdateOption[MemberCB]()); optionCall(option); return option.toNative;
    }

    protected def callbackDeleteOption(optionCall: (ScrDeleteOption[MemberCB]) => Unit): DeleteOption[MemberCB] = {
        if (optionCall == null) { return null; }
        val option = new ScrDeleteOption[MemberCB](new DeleteOption[MemberCB]()); optionCall(option); return option.toNative;
    }

    protected def callbackLoader(dbleList: List[DbleMember], loaderCall: (LoaderOfMember) => Unit = null): Unit = {
        if (loaderCall == null) { return; }
        val loader = new LoaderOfMember();
        loader.ready(dbleList.asInstanceOf[List[DbleMember]], _behaviorSelector);
        loaderCall(loader);
    }

    protected def downcast(et: Entity): DbleMember =
    { return helpEntityDowncastInternally(et, classOf[DbleMember]); }

    protected def downcast(cb: ConditionBean): MemberCB =
    { return helpConditionBeanDowncastInternally(cb, classOf[MemberCB]); }

    protected def downcast(ls: List[_ <: Entity]): List[DbleMember] =
    { return ls.asInstanceOf[List[DbleMember]]; }

    protected def downcast(op: InsertOption[_ <: ConditionBean]): InsertOption[MemberCB] =
    { return op.asInstanceOf[InsertOption[MemberCB]]; }

    protected def downcast(op: UpdateOption[_ <: ConditionBean]): UpdateOption[MemberCB] =
    { return op.asInstanceOf[UpdateOption[MemberCB]]; }

    protected def downcast(op: DeleteOption[_ <: ConditionBean]): DeleteOption[MemberCB] =
    { return op.asInstanceOf[DeleteOption[MemberCB]]; }

    protected def downcast(sp: QueryInsertSetupper[_ <: Entity, _ <: ConditionBean]): QueryInsertSetupper[DbleMember, MemberCB] =
    { return sp.asInstanceOf[QueryInsertSetupper[DbleMember, MemberCB]]; }

    // ===================================================================================
    //                                                                        Scala Helper
    //                                                                        ============
    protected def toScalaList[ENTITY](javaList: Collection[ENTITY]): scala.collection.immutable.List[ENTITY] = {
        if (javaList == null) { scala.collection.immutable.List() }
        return scala.collection.immutable.List.fromArray(javaList.toArray()).asInstanceOf[scala.collection.immutable.List[ENTITY]];
    }

    def toImmutableEntityList(dbleList: Collection[DbleMember]): scala.collection.immutable.List[Member] =
    { toScalaList(dbleList).map(new Member(_)) }

    def toDBableEntityList(immuList: scala.collection.immutable.List[Member]): List[DbleMember] =
    { immuList.map(new DbleMember().acceptImmutable(_)).asJava }
}
