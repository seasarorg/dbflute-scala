package com.example.dbflute.scala.dbflute.bsbhv;

import scala.collection.immutable;
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
 * The behavior of (退会理由)WITHDRAWAL_REASON as TABLE. <br />
 * <pre>
 * [primary key]
 *     WITHDRAWAL_REASON_CODE
 *
 * [column]
 *     WITHDRAWAL_REASON_CODE, WITHDRAWAL_REASON_TEXT, DISPLAY_ORDER
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     MEMBER_WITHDRAWAL
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     memberWithdrawalList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
abstract class BsWithdrawalReasonBhv extends AbstractBehaviorWritable[DbleWithdrawalReason, WithdrawalReasonCB] {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    def getDBMeta(): DBMeta = { return WithdrawalReasonDbm; }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    def newConditionBean(): WithdrawalReasonCB = { return new WithdrawalReasonCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WithdrawalReasonCB cb = new WithdrawalReasonCB();
     * cb.query().setFoo...(value);
     * int count = withdrawalReasonBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of DbleWithdrawalReason. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    def selectCount(cbCall: (WithdrawalReasonCB) => Unit): Int = {
        return facadeSelectCount(callbackCB(cbCall));
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
     * WithdrawalReasonCB cb = new WithdrawalReasonCB();
     * cb.query().setFoo...(value);
     * OptionalEntity&lt;DbleWithdrawalReason&gt; entity = withdrawalReasonBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     *
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * entity.<span style="color: #DD4747">required</span>(withdrawalReason -&gt; {
     *     ...
     * });
     * DbleWithdrawalReason withdrawalReason = entity.entity.<span style="color: #DD4747">get()</span>;
     *
     * <span style="color: #3F7E5E">// if it might be no data, ifPresent(), isPresent(), ...</span>
     * entity.<span style="color: #DD4747">ifPresent</span>(withdrawalReason -&gt; {
     *     ...
     * });
     * if (entity.entity.<span style="color: #DD4747">isPresent()</span>) {
     *     DbleWithdrawalReason withdrawalReason = entity.entity.<span style="color: #DD4747">get()</span>;
     * } else {
     *     ...
     * }
     * </pre>
     * @param cbCall The callback for condition-bean of WithdrawalReason. (NotNull)
     * @param loaderCall The callback for referrer loader of WithdrawalReason. (NoArgAllowed: then no loading)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get() of return value is called and the value is null, which means entity has already been deleted (point is not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    def selectEntity(cbCall: (WithdrawalReasonCB) => Unit)(implicit loaderCall: (LoaderOfWithdrawalReason) => Unit = null): Option[WithdrawalReason] = {
        return facadeSelectEntity(callbackCB(cbCall))(loaderCall).map(_.toImmutable);
    }

    protected def facadeSelectEntity(cb: WithdrawalReasonCB)(loaderCall: (LoaderOfWithdrawalReason) => Unit = null): Option[DbleWithdrawalReason] = {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity())(loaderCall);
    }

    protected def doSelectEntity[ENTITY <: DbleWithdrawalReason](cb: WithdrawalReasonCB, tp: Class[_ <: ENTITY])(loaderCall: (LoaderOfWithdrawalReason) => Unit = null): ENTITY = {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        val dble = helpSelectEntityInternally(cb, tp);
        if (dble != null) {
            callbackLoader(DfCollectionUtil.newArrayList(dble.asInstanceOf[DbleWithdrawalReason]), loaderCall);
        }
        return dble;
    }

    protected def doSelectOptionalEntity[ENTITY <: DbleWithdrawalReason](cb: WithdrawalReasonCB, tp: Class[_ <: ENTITY])(loaderCall: (LoaderOfWithdrawalReason) => Unit = null): Option[ENTITY] = {
        return Option.apply(doSelectEntity(cb, tp)(loaderCall));
    }

    override protected def doReadEntity(cb: ConditionBean): Entity = { facadeSelectEntity(downcast(cb))().orNull }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * WithdrawalReasonCB cb = new WithdrawalReasonCB();
     * cb.query().setFoo...(value);
     * DbleWithdrawalReason withdrawalReason = withdrawalReasonBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = withdrawalReason.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbCall The callback for condition-bean of WithdrawalReason. (NotNull)
     * @param loaderCall The callback for referrer loader of WithdrawalReason. (NoArgAllowed: then no loading)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (point is not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    def selectEntityWithDeletedCheck(cbCall: (WithdrawalReasonCB) => Unit)(implicit loaderCall: (LoaderOfWithdrawalReason) => Unit = null): WithdrawalReason = {
        return facadeSelectEntityWithDeletedCheck(callbackCB(cbCall))(loaderCall).toImmutable;
    }

    protected def facadeSelectEntityWithDeletedCheck(cb: WithdrawalReasonCB)(loaderCall: (LoaderOfWithdrawalReason) => Unit = null): DbleWithdrawalReason = {
        return doSelectEntityWithDeletedCheck(cb, typeOfSelectedEntity())(loaderCall);
    }

    protected def doSelectEntityWithDeletedCheck[ENTITY <: DbleWithdrawalReason](cb: WithdrawalReasonCB, tp: Class[ENTITY])(loaderCall: (LoaderOfWithdrawalReason) => Unit = null): ENTITY = {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        val dble = helpSelectEntityWithDeletedCheckInternally(cb, tp);
        callbackLoader(DfCollectionUtil.newArrayList(dble.asInstanceOf[DbleWithdrawalReason]), loaderCall);
        return dble;
    }

    override protected def doReadEntityWithDeletedCheck(cb: ConditionBean): Entity = { facadeSelectEntityWithDeletedCheck(downcast(cb))() }

    /**
     * Select the entity by the primary-key value.
     * @param withdrawalReasonCode (退会理由コード): PK, NotNull, CHAR(3), classification=WithdrawalReason. (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    def selectByPK(withdrawalReasonCode: CDef.WithdrawalReason): Option[WithdrawalReason] = {
        return facadeSelectByPK(withdrawalReasonCode).map(_.toImmutable);
    }

    protected def facadeSelectByPK(withdrawalReasonCode: CDef.WithdrawalReason): Option[DbleWithdrawalReason] = {
        return doSelectByPK(withdrawalReasonCode, typeOfSelectedEntity());
    }

    protected def doSelectByPK[ENTITY <: DbleWithdrawalReason](withdrawalReasonCode: CDef.WithdrawalReason, tp: Class[_ <: ENTITY]): Option[ENTITY] = {
        return Option.apply(doSelectEntity(xprepareCBAsPK(withdrawalReasonCode), tp)());
    }

    protected def xprepareCBAsPK(withdrawalReasonCode: CDef.WithdrawalReason): WithdrawalReasonCB = {
        assertObjectNotNull("withdrawalReasonCode", withdrawalReasonCode);
        return newConditionBean().acceptPK(withdrawalReasonCode);
    }

    /**
     * Select the entity by the unique-key value.
     * @param displayOrder : UQ, NotNull, INTEGER(10). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    def selectByUniqueOf(displayOrder: Integer): Option[WithdrawalReason] = {
        return facadeSelectByUniqueOf(displayOrder).map(_.toImmutable);
    }

    protected def facadeSelectByUniqueOf(displayOrder: Integer): Option[DbleWithdrawalReason] = {
        return doSelectByUniqueOf(displayOrder, typeOfSelectedEntity());
    }

    protected def doSelectByUniqueOf[ENTITY <: DbleWithdrawalReason](displayOrder: Integer, tp: Class[_ <: ENTITY]): Option[ENTITY] = {
        return Option.apply(doSelectEntity(xprepareCBAsUniqueOf(displayOrder), tp)());
    }

    protected def xprepareCBAsUniqueOf(displayOrder: Integer): WithdrawalReasonCB = {
        assertObjectNotNull("displayOrder", displayOrder);
        return newConditionBean().acceptUniqueOf(displayOrder);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WithdrawalReasonCB cb = new WithdrawalReasonCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * List&lt;${WithdrawalReason}&gt; withdrawalReasonList = withdrawalReasonBhv.<span style="color: #DD4747">selectList</span>(cb);
     * withdrawalReasonList.foreach(withdrawalReason =>
     *     ... = withdrawalReason...;
     * }
     * </pre>
     * @param cbCall The callback for condition-bean of WithdrawalReason. (NotNull)
     * @param loaderCall The callback for referrer loader of WithdrawalReason. (NoArgAllowed: then no loading)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    def selectList(cbCall: (WithdrawalReasonCB) => Unit)(implicit loaderCall: (LoaderOfWithdrawalReason) => Unit = null): immutable.List[WithdrawalReason] = {
        return toImmutableEntityList(facadeSelectList(callbackCB(cbCall))(loaderCall));
    }

    protected def facadeSelectList(cb: WithdrawalReasonCB)(loaderCall: (LoaderOfWithdrawalReason) => Unit = null): ListResultBean[DbleWithdrawalReason] = {
        return doSelectList(cb, typeOfSelectedEntity())(loaderCall);
    }

    protected def doSelectList[RESULT <: DbleWithdrawalReason](cb: WithdrawalReasonCB, tp: Class[RESULT])(loaderCall: (LoaderOfWithdrawalReason) => Unit = null): ListResultBean[RESULT] = {
        val dbleList = helpSelectListInternally(cb, tp);
        callbackLoader(dbleList.asInstanceOf[List[DbleWithdrawalReason]], loaderCall);
        return dbleList;
    }

    override protected def doReadList(cb: ConditionBean): ListResultBean[_ <: Entity] = { facadeSelectList(downcast(cb))() }

    override protected def isEntityDerivedMappable(): Boolean = { true }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * WithdrawalReasonCB cb = new WithdrawalReasonCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;DbleWithdrawalReason&gt; page = withdrawalReasonBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (DbleWithdrawalReason withdrawalReason : page) {
     *     ... = withdrawalReason.get...();
     * }
     * </pre>
     * @param cbCall The callback for condition-bean of WithdrawalReason. (NotNull)
     * @param loaderCall The callback for referrer loader of WithdrawalReason. (NoArgAllowed: then no loading)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    def selectPage(cbCall: (WithdrawalReasonCB) => Unit)(implicit loaderCall: (LoaderOfWithdrawalReason) => Unit = null): ScrPagingView[WithdrawalReason] = {
        return newPagingView(facadeSelectPage(callbackCB(cbCall))(loaderCall));
    }

    protected def facadeSelectPage(cb: WithdrawalReasonCB)(loaderCall: (LoaderOfWithdrawalReason) => Unit = null): PagingResultBean[DbleWithdrawalReason] = {
        return doSelectPage(cb, typeOfSelectedEntity())(loaderCall);
    }

    protected def doSelectPage[RESULT <: DbleWithdrawalReason](cb: WithdrawalReasonCB, tp: Class[RESULT])(loaderCall: (LoaderOfWithdrawalReason) => Unit = null): PagingResultBean[RESULT] = {
        val dbleList = helpSelectPageInternally(cb, tp);
        callbackLoader(dbleList.asInstanceOf[List[DbleWithdrawalReason]], loaderCall);
        return dbleList;
    }

    override protected def doReadPage(cb: ConditionBean): PagingResultBean[_ <: Entity] = { facadeSelectPage(downcast(cb))() }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WithdrawalReasonCB cb = new WithdrawalReasonCB();
     * cb.query().setFoo...(value);
     * withdrawalReasonBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;DbleWithdrawalReason&gt;() {
     *     public void handle(DbleWithdrawalReason entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of DbleWithdrawalReason. (NotNull)
     * @param entityRowHandler The handler of entity row of DbleWithdrawalReason. (NotNull)
     */
    def selectCursor(cbCall: (WithdrawalReasonCB) => Unit)(rowCall: (WithdrawalReason) => Unit): Unit = {
        facadeSelectCursor(callbackCB(cbCall), new EntityRowHandler[DbleWithdrawalReason]() {
            def handle(entity: DbleWithdrawalReason): Unit = { rowCall(entity.toImmutable) }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * withdrawalReasonBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(WithdrawalReasonCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    def scalarSelect[RESULT](resultType: Class[RESULT]): ScrHpSLSFunction[WithdrawalReasonCB, RESULT] = {
        return toScalaSLSFunction[RESULT](facadeScalarSelect(resultType));
    }

    protected def toScalaSLSFunction[RESULT](function: HpSLSFunction[WithdrawalReasonCB, RESULT]): ScrHpSLSFunction[WithdrawalReasonCB, RESULT] =
    { new ScrHpSLSFunction[WithdrawalReasonCB, RESULT](function) }

    // ===================================================================================
    //                                                                            Sequence
    //                                                                            ========
    override protected def doReadNextVal(): Number = {
        val msg: String = "This table is NOT related to sequence: " + getTableDbName();
        throw new UnsupportedOperationException(msg);
    }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    /**
     * Load referrer of memberWithdrawalList by the set-upper of referrer. <br />
     * (会員退会情報)MEMBER_WITHDRAWAL by WITHDRAWAL_REASON_CODE, named 'memberWithdrawalList'.
     * <pre>
     * withdrawalReasonBhv.<span style="color: #DD4747">loadMemberWithdrawalList</span>(withdrawalReasonList, new ReferrerConditionSetupper&lt;MemberWithdrawalCB&gt;() {
     *     public void setup(MemberWithdrawalCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * for (DbleWithdrawalReason withdrawalReason : withdrawalReasonList) {
     *     ... = withdrawalReason.<span style="color: #DD4747">getMemberWithdrawalList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setWithdrawalReasonCode_InScope(pkList);
     * cb.query().addOrderBy_WithdrawalReasonCode_Asc();
     * </pre>
     * @param withdrawalReasonList The entity list of withdrawalReason. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    def loadMemberWithdrawalList(withdrawalReasonList: List[DbleWithdrawalReason], setupCall: (MemberWithdrawalCB) => Unit): NestedReferrerListGateway[DbleMemberWithdrawal] = {
        assertObjectNotNull("withdrawalReasonList", withdrawalReasonList); assertObjectNotNull("setupCall", setupCall);
        val setupper = new ReferrerConditionSetupper[MemberWithdrawalCB]() { def setup(referrerCB: MemberWithdrawalCB): Unit = { setupCall(referrerCB); } }
        return doLoadMemberWithdrawalList(withdrawalReasonList, new LoadReferrerOption[MemberWithdrawalCB, DbleMemberWithdrawal]().xinit(setupper));
    }

    /**
     * Load referrer of memberWithdrawalList by the set-upper of referrer. <br />
     * (会員退会情報)MEMBER_WITHDRAWAL by WITHDRAWAL_REASON_CODE, named 'memberWithdrawalList'.
     * <pre>
     * withdrawalReasonBhv.<span style="color: #DD4747">loadMemberWithdrawalList</span>(withdrawalReasonList, new ReferrerConditionSetupper&lt;MemberWithdrawalCB&gt;() {
     *     public void setup(MemberWithdrawalCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = withdrawalReason.<span style="color: #DD4747">getMemberWithdrawalList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setWithdrawalReasonCode_InScope(pkList);
     * cb.query().addOrderBy_WithdrawalReasonCode_Asc();
     * </pre>
     * @param withdrawalReason The entity of withdrawalReason. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    def loadMemberWithdrawalList(withdrawalReason: DbleWithdrawalReason, setupCall: (MemberWithdrawalCB) => Unit): NestedReferrerListGateway[DbleMemberWithdrawal] = {
        assertObjectNotNull("withdrawalReason", withdrawalReason); assertObjectNotNull("setupCall", setupCall);
        val setupper = new ReferrerConditionSetupper[MemberWithdrawalCB]() { def setup(referrerCB: MemberWithdrawalCB): Unit = { setupCall(referrerCB); } }
        return doLoadMemberWithdrawalList(xnewLRLs(withdrawalReason), new LoadReferrerOption[MemberWithdrawalCB, DbleMemberWithdrawal]().xinit(setupper));
    }

    protected def doLoadMemberWithdrawalList(withdrawalReasonList: List[DbleWithdrawalReason], option: LoadReferrerOption[MemberWithdrawalCB, DbleMemberWithdrawal]): NestedReferrerListGateway[DbleMemberWithdrawal] = {
        return helpLoadReferrerInternally(withdrawalReasonList, option, "memberWithdrawalList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key withdrawalReasonCode.
     * @param withdrawalReasonList The list of withdrawalReason. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    def extractWithdrawalReasonCodeList(withdrawalReasonList: immutable.List[WithdrawalReason]): immutable.List[String] = {
        val plainList = helpExtractListInternally(toDBableEntityList(withdrawalReasonList), "withdrawalReasonCode");
        return toScalaList(plainList).map(_.asInstanceOf[String]);
    }

    /**
     * Extract the value list of (single) unique key displayOrder.
     * @param withdrawalReasonList The list of withdrawalReason. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    def extractDisplayOrderList(withdrawalReasonList: immutable.List[WithdrawalReason]): immutable.List[Int] = {
        val plainList = helpExtractListInternally(toDBableEntityList(withdrawalReasonList), "displayOrder");
        return toScalaList(plainList).map(_.asInstanceOf[Int]);
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * DbleWithdrawalReason withdrawalReason = new DbleWithdrawalReason();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * withdrawalReason.setFoo...(value);
     * withdrawalReason.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//withdrawalReason.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//withdrawalReason.set...;</span>
     * withdrawalReasonBhv.<span style="color: #DD4747">insert</span>(withdrawalReason);
     * ... = withdrawalReason.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param entityCall The callback for entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param optionCall The callback for option of insert. (NoArgAllowed: then no option)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    def insert(entityCall: (MbleWithdrawalReason) => Unit)(implicit optionCall: (ScrInsertOption[WithdrawalReasonCB]) => Unit = null): Unit = {
        assertObjectNotNull("entityCall", entityCall);
        doInsert(callbackMbleEntityToDBable(entityCall), callbackInsertOption(optionCall));
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * DbleWithdrawalReason withdrawalReason = new DbleWithdrawalReason();
     * withdrawalReason.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * withdrawalReason.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//withdrawalReason.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//withdrawalReason.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * withdrawalReason.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     withdrawalReasonBhv.<span style="color: #DD4747">update</span>(withdrawalReason);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param entityCall The callback for entity of update. (NotNull, PrimaryKeyNotNull)
     * @param optionCall The callback for option of update. (NoArgAllowed: then no option)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    def update(entityCall: (MbleWithdrawalReason) => Unit)(implicit optionCall: (ScrUpdateOption[WithdrawalReasonCB]) => Unit = null): Unit = {
        assertObjectNotNull("entityCall", entityCall);
        doUpdate(callbackMbleEntityToDBable(entityCall), callbackUpdateOption(optionCall));
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param entityCall The callback for entity of insert or update. (NotNull, ...depends on insert or update)
     * @param insertOptionCall The callback for option of insert. (NoArgAllowed: then no option)
     * @param updateOptionCall The callback for option of update. (NoArgAllowed: then no option)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    def insertOrUpdate(entityCall: (MbleWithdrawalReason) => Unit)(implicit insertOptionCall: (ScrInsertOption[WithdrawalReasonCB]) => Unit = null, updateOptionCall: (ScrUpdateOption[WithdrawalReasonCB]) => Unit = null): Unit = {
        doInsertOrUpdate(callbackMbleEntityToDBable(entityCall), callbackInsertOption(insertOptionCall), callbackUpdateOption(updateOptionCall));
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * DbleWithdrawalReason withdrawalReason = new DbleWithdrawalReason();
     * withdrawalReason.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * withdrawalReason.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     withdrawalReasonBhv.<span style="color: #DD4747">delete</span>(withdrawalReason);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param entityCall The callback for entity of delete. (NotNull, PrimaryKeyNotNull)
     * @param optionCall The callback for option of delete. (NoArgAllowed: then no option)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    def delete(entityCall: (MbleWithdrawalReason) => Unit)(implicit optionCall: (ScrDeleteOption[WithdrawalReasonCB]) => Unit = null): Unit = {
        doDelete(callbackMbleEntityToDBable(entityCall), callbackDeleteOption(optionCall));
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
     *     DbleWithdrawalReason withdrawalReason = new DbleWithdrawalReason();
     *     withdrawalReason.setFooName("foo");
     *     if (...) {
     *         withdrawalReason.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     withdrawalReasonList.add(withdrawalReason);
     * }
     * withdrawalReasonBhv.<span style="color: #DD4747">batchInsert</span>(withdrawalReasonList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param withdrawalReasonList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    def batchInsert(batchCall: (ScrBatchEntityList[MbleWithdrawalReason]) => Unit)(implicit optionCall: (ScrInsertOption[WithdrawalReasonCB]) => Unit = null): Array[Int] = {
        return doBatchInsert(callbackBatch(batchCall), callbackInsertOption(optionCall));
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     DbleWithdrawalReason withdrawalReason = new DbleWithdrawalReason();
     *     withdrawalReason.setFooName("foo");
     *     if (...) {
     *         withdrawalReason.setFooPrice(123);
     *     } else {
     *         withdrawalReason.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//withdrawalReason.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     withdrawalReasonList.add(withdrawalReason);
     * }
     * withdrawalReasonBhv.<span style="color: #DD4747">batchUpdate</span>(withdrawalReasonList);
     * </pre>
     * @param withdrawalReasonList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    def batchUpdate(batchCall: (ScrBatchEntityList[MbleWithdrawalReason]) => Unit)(implicit optionCall: (ScrUpdateOption[WithdrawalReasonCB]) => Unit = null): Array[Int] = {
        return doBatchUpdate(callbackBatch(batchCall), callbackUpdateOption(optionCall));
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param withdrawalReasonList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    def batchDelete(batchCall: (ScrBatchEntityList[MbleWithdrawalReason]) => Unit)(implicit optionCall: (ScrDeleteOption[WithdrawalReasonCB]) => Unit = null): Array[Int] = {
        return doBatchDelete(callbackBatch(batchCall), callbackDeleteOption(optionCall));
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * withdrawalReasonBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;DbleWithdrawalReason, WithdrawalReasonCB&gt;() {
     *     public ConditionBean setup(DbleWithdrawalReason entity, WithdrawalReasonCB intoCB) {
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
     * @param setupperCall The callback for set-upper of query-insert. (NotNull)
     * @return The inserted count.
     */
    def queryInsert(setupperCall: (MbleWithdrawalReason, WithdrawalReasonCB) => ConditionBean): Int = {
        return doQueryInsert(callbackQueryInsertSetupper(setupperCall), null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * DbleWithdrawalReason withdrawalReason = new DbleWithdrawalReason();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//withdrawalReason.setPK...(value);</span>
     * withdrawalReason.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//withdrawalReason.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//withdrawalReason.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//withdrawalReason.setVersionNo(value);</span>
     * WithdrawalReasonCB cb = new WithdrawalReasonCB();
     * cb.query().setFoo...(value);
     * withdrawalReasonBhv.<span style="color: #DD4747">queryUpdate</span>(withdrawalReason, cb);
     * </pre>
     * @param entityCall The callback for entity that contains update values. (NotNull)
     * @param cbCall The callback for condition-bean of WithdrawalReason. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    def queryUpdate(entityCall: (MbleWithdrawalReason) => Unit)(cbCall: (WithdrawalReasonCB) => Unit): Int = {
        assertObjectNotNull("entityCall", entityCall); assertObjectNotNull("cbCall", cbCall);
        return doQueryUpdate(callbackMbleEntityToDBable(entityCall), callbackCB(cbCall), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WithdrawalReasonCB cb = new WithdrawalReasonCB();
     * cb.query().setFoo...(value);
     * withdrawalReasonBhv.<span style="color: #DD4747">queryDelete</span>(withdrawalReason, cb);
     * </pre>
     * @param cbCall The callback for condition-bean of WithdrawalReason. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    def queryDelete(cbCall: (WithdrawalReasonCB) => Unit): Int = {
        assertObjectNotNull("cbCall", cbCall);
        return doQueryDelete(callbackCB(cbCall), null);
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
    def outsideSql(): ScrOutsideSqlTypedBasicExecutor[WithdrawalReasonBhv] = {
        val facadeExecutor: OutsideSqlAllFacadeExecutor[WithdrawalReasonBhv] = doOutsideSql();
        return toImmutableOutsideSqlTypedBasicExecutor(facadeExecutor.xbasicExecutor()); // variable to resolve generic type
    }

    protected def toImmutableOutsideSqlTypedBasicExecutor(executor: OutsideSqlBasicExecutor[WithdrawalReasonBhv]): ScrOutsideSqlTypedBasicExecutor[WithdrawalReasonBhv] =
    { new ScrOutsideSqlTypedBasicExecutor(executor) }

    // ===================================================================================
    //                                                                     Callback Helper
    //                                                                     ===============
    protected def callbackCB(cbCall: (WithdrawalReasonCB) => Unit): WithdrawalReasonCB = {
        assertObjectNotNull("cbCall", cbCall);
        val cb = newConditionBean(); cbCall(cb); return cb;
    }

    protected def callbackBatch(batchCall: (ScrBatchEntityList[MbleWithdrawalReason]) => Unit): List[DbleWithdrawalReason] = {
        assertObjectNotNull("batchCall", batchCall);
        val batch = new ScrBatchEntityList[MbleWithdrawalReason]();
        val entityList: List[DbleWithdrawalReason] = new ArrayList[DbleWithdrawalReason]();
        batch.entityCallList.asScala.map { entityCall =>
            val entity = newMbleEntity(); entityCall(entity); entity.toDBable;
        }
        return entityList;
    }

    protected def callbackMbleEntity(entityCall: (MbleWithdrawalReason) => Unit): MbleWithdrawalReason = {
        assertObjectNotNull("entityCall", entityCall);
        val entity = newMbleEntity(); entityCall(entity); return entity;
    }

    protected def callbackMbleEntityToDBable(entityCall: (MbleWithdrawalReason) => Unit): DbleWithdrawalReason = {
        return callbackMbleEntity(entityCall).toDBable;
    }

    protected def callbackInsertOption(optionCall: (ScrInsertOption[WithdrawalReasonCB]) => Unit): InsertOption[WithdrawalReasonCB] = {
        if (optionCall == null) { return null; }
        val option = new ScrInsertOption[WithdrawalReasonCB](new InsertOption[WithdrawalReasonCB]());
        optionCall(option); return option.toNative;
    }

    protected def callbackUpdateOption(optionCall: (ScrUpdateOption[WithdrawalReasonCB]) => Unit): UpdateOption[WithdrawalReasonCB] = {
        if (optionCall == null) { return null; }
        val option = new ScrUpdateOption[WithdrawalReasonCB](new UpdateOption[WithdrawalReasonCB]()); optionCall(option); return option.toNative;
    }

    protected def callbackDeleteOption(optionCall: (ScrDeleteOption[WithdrawalReasonCB]) => Unit): DeleteOption[WithdrawalReasonCB] = {
        if (optionCall == null) { return null; }
        val option = new ScrDeleteOption[WithdrawalReasonCB](new DeleteOption[WithdrawalReasonCB]()); optionCall(option); return option.toNative;
    }

    protected def callbackQueryInsertSetupper(setupperCall: (MbleWithdrawalReason, WithdrawalReasonCB) => ConditionBean): QueryInsertSetupper[DbleWithdrawalReason, WithdrawalReasonCB] = {
        assertObjectNotNull("setupperCall", setupperCall);
        return new QueryInsertSetupper[DbleWithdrawalReason, WithdrawalReasonCB]() {
            def setup(entity: DbleWithdrawalReason, intoCB: WithdrawalReasonCB): ConditionBean = {
                val mble = newMbleEntity();
                val resultCB = setupperCall(mble, intoCB);
                entity.acceptImmutable(mble.toImmutable());
                return resultCB;
            }
        };
    }

    protected def callbackLoader(dbleList: List[DbleWithdrawalReason], loaderCall: (LoaderOfWithdrawalReason) => Unit = null): Unit = {
        if (loaderCall == null) { return; }
        val loader = new LoaderOfWithdrawalReason();
        loader.ready(dbleList.asInstanceOf[List[DbleWithdrawalReason]], _behaviorSelector);
        loaderCall(loader);
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    override protected def typeOfSelectedEntity(): Class[DbleWithdrawalReason] = { classOf[DbleWithdrawalReason] }
    override protected def typeOfHandlingEntity(): Class[DbleWithdrawalReason] = { classOf[DbleWithdrawalReason] }
    override protected def typeOfHandlingConditionBean(): Class[WithdrawalReasonCB] = { classOf[WithdrawalReasonCB] }
    protected def newMbleEntity(): MbleWithdrawalReason = { new MbleWithdrawalReason() }
    protected def newPagingView(rb: PagingResultBean[DbleWithdrawalReason]): ScrPagingView[WithdrawalReason] =
    { new ScrPagingView(toImmutableEntityList(rb), rb) }

    // ===================================================================================
    //                                                                        Scala Helper
    //                                                                        ============
    protected def toScalaList[ENTITY](javaList: Collection[ENTITY]): immutable.List[ENTITY] = {
        if (javaList == null) { immutable.List() }
        return javaList.toArray.toList.asInstanceOf[immutable.List[ENTITY]];
    }

    def toImmutableEntityList(dbleList: Collection[DbleWithdrawalReason]): immutable.List[WithdrawalReason] =
    { toScalaList(dbleList).map(new WithdrawalReason(_)) }

    def toDBableEntityList(immuList: immutable.List[WithdrawalReason]): List[DbleWithdrawalReason] =
    { immuList.map(new DbleWithdrawalReason().acceptImmutable(_)).asJava }
}
