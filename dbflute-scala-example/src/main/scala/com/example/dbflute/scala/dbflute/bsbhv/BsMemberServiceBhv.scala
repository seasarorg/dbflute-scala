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
 * The behavior of (会員サービス)MEMBER_SERVICE as TABLE. <br />
 * <pre>
 * [primary key]
 *     MEMBER_SERVICE_ID
 *
 * [column]
 *     MEMBER_SERVICE_ID, MEMBER_ID, SERVICE_POINT_COUNT, SERVICE_RANK_CODE, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MEMBER_SERVICE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     MEMBER, SERVICE_RANK
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     member, serviceRank
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
abstract class BsMemberServiceBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    def getTableDbName(): String = { return "MEMBER_SERVICE"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    def getDBMeta(): DBMeta = { return MemberServiceDbm; }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    def newEntity(): DbleMemberService = { return new DbleMemberService(); }

    /** {@inheritDoc} */
    def newConditionBean(): MemberServiceCB = { return new MemberServiceCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * MemberServiceCB cb = new MemberServiceCB();
     * cb.query().setFoo...(value);
     * int count = memberServiceBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of DbleMemberService. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    def selectCount(cbCall: (MemberServiceCB) => Unit): Int = {
        return facadeSelectCount(callbackCB(cbCall));
    }

    protected def facadeSelectCount(cb: MemberServiceCB): Int = {
        return doSelectCountUniquely(cb);
    }

    protected def doSelectCountUniquely(cb: MemberServiceCB): Int = { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected def doSelectCountPlainly(cb: MemberServiceCB): Int = { // called by selectPage(cb)
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
     * MemberServiceCB cb = new MemberServiceCB();
     * cb.query().setFoo...(value);
     * OptionalEntity&lt;DbleMemberService&gt; entity = memberServiceBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     *
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * entity.<span style="color: #DD4747">required</span>(memberService -&gt; {
     *     ...
     * });
     * DbleMemberService memberService = entity.entity.<span style="color: #DD4747">get()</span>;
     *
     * <span style="color: #3F7E5E">// if it might be no data, ifPresent(), isPresent(), ...</span>
     * entity.<span style="color: #DD4747">ifPresent</span>(memberService -&gt; {
     *     ...
     * });
     * if (entity.entity.<span style="color: #DD4747">isPresent()</span>) {
     *     DbleMemberService memberService = entity.entity.<span style="color: #DD4747">get()</span>;
     * } else {
     *     ...
     * }
     * </pre>
     * @param cbCall The callback for condition-bean of MemberService. (NotNull)
     * @param loaderCall The callback for referrer loader of MemberService. (NoArgAllowed: then no loading)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get() of return value is called and the value is null, which means entity has already been deleted (point is not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    def selectEntity(cbCall: (MemberServiceCB) => Unit)(implicit loaderCall: (LoaderOfMemberService) => Unit = null): Option[MemberService] = {
        return facadeSelectEntity(callbackCB(cbCall))(loaderCall).map(_.toImmutable);
    }

    protected def facadeSelectEntity(cb: MemberServiceCB)(loaderCall: (LoaderOfMemberService) => Unit = null): Option[DbleMemberService] = {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity())(loaderCall);
    }

    protected def doSelectEntity[ENTITY <: DbleMemberService](cb: MemberServiceCB, tp: Class[ENTITY])(loaderCall: (LoaderOfMemberService) => Unit = null): ENTITY = {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        val dble = helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback[ENTITY, MemberServiceCB]() {
            def callbackSelectList(lcb: MemberServiceCB, ltp: Class[ENTITY]): List[ENTITY] = { return doSelectList(lcb, ltp)(); } });
        if (dble != null) {
            callbackLoader(DfCollectionUtil.newArrayList(dble.asInstanceOf[DbleMemberService]), loaderCall);
        }
        return dble;
    }

    protected def doSelectOptionalEntity[ENTITY <: DbleMemberService](cb: MemberServiceCB, tp: Class[ENTITY])(loaderCall: (LoaderOfMemberService) => Unit = null): Option[ENTITY] = {
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
     * MemberServiceCB cb = new MemberServiceCB();
     * cb.query().setFoo...(value);
     * DbleMemberService memberService = memberServiceBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = memberService.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbCall The callback for condition-bean of MemberService. (NotNull)
     * @param loaderCall The callback for referrer loader of MemberService. (NoArgAllowed: then no loading)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (point is not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    def selectEntityWithDeletedCheck(cbCall: (MemberServiceCB) => Unit)(implicit loaderCall: (LoaderOfMemberService) => Unit = null): MemberService = {
        return facadeSelectEntityWithDeletedCheck(callbackCB(cbCall))(loaderCall).toImmutable;
    }

    protected def facadeSelectEntityWithDeletedCheck(cb: MemberServiceCB)(loaderCall: (LoaderOfMemberService) => Unit = null): DbleMemberService = {
        return doSelectEntityWithDeletedCheck(cb, typeOfSelectedEntity())(loaderCall);
    }

    protected def doSelectEntityWithDeletedCheck[ENTITY <: DbleMemberService](cb: MemberServiceCB, tp: Class[ENTITY])(loaderCall: (LoaderOfMemberService) => Unit = null): ENTITY = {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        val dble = helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback[ENTITY, MemberServiceCB]() {
            def callbackSelectList(lcb: MemberServiceCB, ltp: Class[ENTITY]): List[ENTITY] = { return doSelectList(lcb, ltp)(); } });
        callbackLoader(DfCollectionUtil.newArrayList(dble.asInstanceOf[DbleMemberService]), loaderCall);
        return dble;
    }

    @Override
    protected def doReadEntityWithDeletedCheck(cb: ConditionBean): Entity = {
        return facadeSelectEntityWithDeletedCheck(downcast(cb))();
    }

    /**
     * Select the entity by the primary-key value.
     * @param memberServiceId (会員サービスID): PK, ID, NotNull, INTEGER(10). (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    def selectByPK(memberServiceId: Integer): Option[MemberService] = {
        return facadeSelectByPK(memberServiceId).map(_.toImmutable);
    }

    protected def facadeSelectByPK(memberServiceId: Integer): Option[DbleMemberService] = {
        return doSelectByPK(memberServiceId, typeOfSelectedEntity());
    }

    protected def doSelectByPK[ENTITY <: DbleMemberService](memberServiceId: Integer, tp: Class[ENTITY]): Option[ENTITY] = {
        return Option.apply(doSelectEntity(xprepareCBAsPK(memberServiceId), tp)());
    }

    protected def xprepareCBAsPK(memberServiceId: Integer): MemberServiceCB = {
        assertObjectNotNull("memberServiceId", memberServiceId);
        return newConditionBean().acceptPK(memberServiceId);
    }

    /**
     * Select the entity by the unique-key value.
     * @param memberId (会員ID): UQ, IX, NotNull, INTEGER(10), FK to MEMBER. (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    def selectByUniqueOf(memberId: Integer): Option[MemberService] = {
        return facadeSelectByUniqueOf(memberId).map(_.toImmutable);
    }

    protected def facadeSelectByUniqueOf(memberId: Integer): Option[DbleMemberService] = {
        return doSelectByUniqueOf(memberId, typeOfSelectedEntity());
    }

    protected def doSelectByUniqueOf[ENTITY <: DbleMemberService](memberId: Integer, tp: Class[ENTITY]): Option[ENTITY] = {
        return Option.apply(doSelectEntity(xprepareCBAsUniqueOf(memberId), tp)());
    }

    protected def xprepareCBAsUniqueOf(memberId: Integer): MemberServiceCB = {
        assertObjectNotNull("memberId", memberId);
        return newConditionBean().acceptUniqueOf(memberId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * MemberServiceCB cb = new MemberServiceCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * List&lt;${MemberService}&gt; memberServiceList = memberServiceBhv.<span style="color: #DD4747">selectList</span>(cb);
     * memberServiceList.foreach(memberService =>
     *     ... = memberService...;
     * }
     * </pre>
     * @param cbCall The callback for condition-bean of MemberService. (NotNull)
     * @param loaderCall The callback for referrer loader of MemberService. (NoArgAllowed: then no loading)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    def selectList(cbCall: (MemberServiceCB) => Unit)(implicit loaderCall: (LoaderOfMemberService) => Unit = null): scala.collection.immutable.List[MemberService] = {
        return toImmutableEntityList(facadeSelectList(callbackCB(cbCall))(loaderCall));
    }

    protected def facadeSelectList(cb: MemberServiceCB)(loaderCall: (LoaderOfMemberService) => Unit = null): ListResultBean[DbleMemberService] = {
        return doSelectList(cb, typeOfSelectedEntity())(loaderCall);
    }

    protected def doSelectList[ENTITY <: DbleMemberService](cb: MemberServiceCB, tp: Class[ENTITY])(loaderCall: (LoaderOfMemberService) => Unit = null): ListResultBean[ENTITY] = {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        val dbleList = helpSelectListInternally(cb, tp, new InternalSelectListCallback[ENTITY, MemberServiceCB]() {
            def callbackSelectList(lcb: MemberServiceCB, ltp: Class[ENTITY]): List[ENTITY] = { return delegateSelectList(lcb, ltp); } });
        callbackLoader(dbleList.asInstanceOf[List[DbleMemberService]], loaderCall);
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
     * MemberServiceCB cb = new MemberServiceCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;DbleMemberService&gt; page = memberServiceBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (DbleMemberService memberService : page) {
     *     ... = memberService.get...();
     * }
     * </pre>
     * @param cbCall The callback for condition-bean of MemberService. (NotNull)
     * @param loaderCall The callback for referrer loader of MemberService. (NoArgAllowed: then no loading)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    def selectPage(cbCall: (MemberServiceCB) => Unit)(implicit loaderCall: (LoaderOfMemberService) => Unit = null): ScrPagingView[MemberService] = {
        return newPagingView(facadeSelectPage(callbackCB(cbCall))(loaderCall));
    }

    protected def facadeSelectPage(cb: MemberServiceCB)(loaderCall: (LoaderOfMemberService) => Unit = null): PagingResultBean[DbleMemberService] = {
        return doSelectPage(cb, typeOfSelectedEntity())(loaderCall);
    }

    protected def doSelectPage[ENTITY <: DbleMemberService](cb: MemberServiceCB, tp: Class[ENTITY])(loaderCall: (LoaderOfMemberService) => Unit = null): PagingResultBean[ENTITY] = {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback[ENTITY, MemberServiceCB]() {
            def callbackSelectCount(cb: MemberServiceCB): Int = { return doSelectCountPlainly(cb); }
            def callbackSelectList(cb: MemberServiceCB, tp: Class[ENTITY]): List[ENTITY] = { return doSelectList(cb, tp)(loaderCall); }
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
     * MemberServiceCB cb = new MemberServiceCB();
     * cb.query().setFoo...(value);
     * memberServiceBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;DbleMemberService&gt;() {
     *     public void handle(DbleMemberService entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of DbleMemberService. (NotNull)
     * @param entityRowHandler The handler of entity row of DbleMemberService. (NotNull)
     */
    def selectCursor(cbCall: (MemberServiceCB) => Unit)(rowCall: (MemberService) => Unit): Unit = {
        facadeSelectCursor(callbackCB(cbCall), new EntityRowHandler[DbleMemberService]() {
            def handle(entity: DbleMemberService): Unit = { rowCall(entity.toImmutable) }
        });
    }

    protected def facadeSelectCursor(cb: MemberServiceCB, handler: EntityRowHandler[DbleMemberService]): Unit = {
        doSelectCursor(cb, handler, typeOfSelectedEntity());
    }

    protected def doSelectCursor[ENTITY <: DbleMemberService](cb: MemberServiceCB, handler: EntityRowHandler[ENTITY], tp: Class[ENTITY]): Unit = {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback[ENTITY, MemberServiceCB]() {
            def callbackSelectCursor(lcb: MemberServiceCB, lhandler: EntityRowHandler[ENTITY], ltp: Class[ENTITY]): Unit = { delegateSelectCursor(lcb, lhandler, ltp); }
            def callbackSelectList(lcb: MemberServiceCB, ltp: Class[ENTITY]): List[ENTITY] = { return doSelectList(lcb, ltp)(); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * memberServiceBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(MemberServiceCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    def scalarSelect[RESULT](resultType: Class[RESULT]): ScrHpSLSFunction[MemberServiceCB, RESULT] = {
        return toScalaSLSFunction[RESULT](facadeScalarSelect(resultType));
    }

    protected def toScalaSLSFunction[RESULT](function: HpSLSFunction[MemberServiceCB, RESULT]): ScrHpSLSFunction[MemberServiceCB, RESULT] =
    { new ScrHpSLSFunction[MemberServiceCB, RESULT](function) }

    protected def facadeScalarSelect[RESULT](resultType: Class[RESULT]): HpSLSFunction[MemberServiceCB, RESULT] = {
        return doScalarSelect(resultType, newConditionBean());
    }

    protected def doScalarSelect[RESULT, CB <: MemberServiceCB](tp: Class[RESULT], cb: CB): HpSLSFunction[CB, RESULT] = {
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
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'DbleMember'.
     * @param memberServiceList The list of memberService. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    def pulloutMember(memberServiceList: scala.collection.immutable.List[MemberService]): scala.collection.immutable.List[Member] = {
        val dbleList = helpPulloutInternally(toDBableEntityList(memberServiceList), new InternalPulloutCallback[DbleMemberService, DbleMember]() {
            def getFr(et: DbleMemberService): DbleMember =
            { return et.getMember().orNull; }
            def hasRf(): Boolean = { return true; }
            def setRfLs(et: DbleMember, ls: List[DbleMemberService]): Unit =
            { if (!ls.isEmpty()) { et.setMemberServiceAsOne(Option.apply(ls.get(0))); } }
        });
        return toScalaList(dbleList).map(new Member(_));
    }

    /**
     * Pull out the list of foreign table 'DbleServiceRank'.
     * @param memberServiceList The list of memberService. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    def pulloutServiceRank(memberServiceList: scala.collection.immutable.List[MemberService]): scala.collection.immutable.List[ServiceRank] = {
        val dbleList = helpPulloutInternally(toDBableEntityList(memberServiceList), new InternalPulloutCallback[DbleMemberService, DbleServiceRank]() {
            def getFr(et: DbleMemberService): DbleServiceRank =
            { return et.getServiceRank().orNull; }
            def hasRf(): Boolean = { return true; }
            def setRfLs(et: DbleServiceRank, ls: List[DbleMemberService]): Unit =
            { et.setMemberServiceList(ls); }
        });
        return toScalaList(dbleList).map(new ServiceRank(_));
    }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key memberServiceId.
     * @param memberServiceList The list of memberService. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    def extractMemberServiceIdList(memberServiceList: scala.collection.immutable.List[MemberService]): scala.collection.immutable.List[Int] = {
        return toScalaList(helpExtractListInternally(toDBableEntityList(memberServiceList), new InternalExtractCallback[DbleMemberService, Integer]() {
            def getCV(et: DbleMemberService): Integer = { return et.getMemberServiceId(); }
        })).map(_.asInstanceOf[Int]);
    }

    /**
     * Extract the value list of (single) unique key memberId.
     * @param memberServiceList The list of memberService. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    def extractMemberIdList(memberServiceList: scala.collection.immutable.List[MemberService]): scala.collection.immutable.List[Int] = {
        return toScalaList(helpExtractListInternally(toDBableEntityList(memberServiceList), new InternalExtractCallback[DbleMemberService, Integer]() {
            def getCV(et: DbleMemberService): Integer = { return et.getMemberId(); }
        })).map(_.asInstanceOf[Int]);
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * DbleMemberService memberService = new DbleMemberService();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * memberService.setFoo...(value);
     * memberService.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//memberService.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//memberService.set...;</span>
     * memberServiceBhv.<span style="color: #DD4747">insert</span>(memberService);
     * ... = memberService.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param entityCall The callback for entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param optionCall The callback for option of insert. (NoArgAllowed: then no option)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    def insert(entityCall: (MbleMemberService) => Unit)(implicit optionCall: (ScrInsertOption[MemberServiceCB]) => Unit = null): Unit = {
        assertObjectNotNull("entityCall", entityCall);
        doInsert(callbackMbleEntityToDBable(entityCall), callbackInsertOption(optionCall));
    }

    protected def doInsert(et: DbleMemberService, op: InsertOption[MemberServiceCB]): Unit = {
        assertObjectNotNull("memberService", et);
        prepareInsertOption(op);
        delegateInsert(et, op);
    }

    protected def prepareInsertOption(op: InsertOption[MemberServiceCB]): Unit = {
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
     * DbleMemberService memberService = new DbleMemberService();
     * memberService.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * memberService.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//memberService.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//memberService.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * memberService.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     memberServiceBhv.<span style="color: #DD4747">update</span>(memberService);
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
    def update(entityCall: (MbleMemberService) => Unit)(implicit optionCall: (ScrUpdateOption[MemberServiceCB]) => Unit = null): Unit = {
        assertObjectNotNull("entityCall", entityCall);
        doUpdate(callbackMbleEntityToDBable(entityCall), callbackUpdateOption(optionCall));
    }

    protected def doUpdate(et: DbleMemberService, op: UpdateOption[MemberServiceCB]): Unit = {
        assertObjectNotNull("memberService", et);
        prepareUpdateOption(op);
        helpUpdateInternally(et, new InternalUpdateCallback[DbleMemberService]() {
            def callbackDelegateUpdate(let: DbleMemberService): Int = { return delegateUpdate(let, op); } });
    }

    protected def prepareUpdateOption(op: UpdateOption[MemberServiceCB]): Unit = {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) { op.resolveSelfSpecification(createCBForVaryingUpdate()); }
        if (op.hasSpecifiedUpdateColumn()) { op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate()); }
    }

    protected def createCBForVaryingUpdate(): MemberServiceCB =
    { val cb: MemberServiceCB = newConditionBean(); cb.xsetupForVaryingUpdate(); return cb; }

    protected def createCBForSpecifiedUpdate(): MemberServiceCB =
    { val cb: MemberServiceCB = newConditionBean(); cb.xsetupForSpecifiedUpdate(); return cb; }

    @Override
    protected def doModify(et: Entity, op: UpdateOption[_ <: ConditionBean]): Unit = {
        doUpdate(downcast(et), downcast(op));
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * DbleMemberService memberService = new DbleMemberService();
     * memberService.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * memberService.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//memberService.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//memberService.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//memberService.setVersionNo(value);</span>
     * memberServiceBhv.<span style="color: #DD4747">updateNonstrict</span>(memberService);
     * </pre>
     * @param entityCall The callback for entity of update. (NotNull, PrimaryKeyNotNull)
     * @param optionCall The callback for option of update. (NoArgAllowed: then no option)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    def updateNonstrict(entityCall: (MbleMemberService) => Unit)(implicit optionCall: (ScrUpdateOption[MemberServiceCB]) => Unit = null): Unit = {
        doUpdateNonstrict(callbackMbleEntityToDBable(entityCall), callbackUpdateOption(optionCall));
    }

    protected def doUpdateNonstrict(et: DbleMemberService, op: UpdateOption[MemberServiceCB]): Unit = {
        assertObjectNotNull("memberService", et);
        prepareUpdateOption(op);
        helpUpdateNonstrictInternally(et, new InternalUpdateNonstrictCallback[DbleMemberService]() {
            def callbackDelegateUpdateNonstrict(let: DbleMemberService): Int = { return delegateUpdateNonstrict(let, op); } });
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
    def insertOrUpdate(entityCall: (MbleMemberService) => Unit)(implicit insertOptionCall: (ScrInsertOption[MemberServiceCB]) => Unit = null, updateOptionCall: (ScrUpdateOption[MemberServiceCB]) => Unit = null): Unit = {
        doInsertOrUpdate(callbackMbleEntityToDBable(entityCall), callbackInsertOption(insertOptionCall), callbackUpdateOption(updateOptionCall));
    }

    protected def doInsertOrUpdate(et: DbleMemberService, iop: InsertOption[MemberServiceCB], uop: UpdateOption[MemberServiceCB]): Unit = {
        helpInsertOrUpdateInternally(et, new InternalInsertOrUpdateCallback[DbleMemberService, MemberServiceCB]() {
            def callbackInsert(let: DbleMemberService): Unit = { doInsert(let, iop); }
            def callbackUpdate(let: DbleMemberService): Unit = { doUpdate(let, uop); }
            def callbackNewMyConditionBean(): MemberServiceCB = { return newConditionBean(); }
            def callbackSelectCount(cb: MemberServiceCB): Int = { return facadeSelectCount(cb); }
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
    def insertOrUpdateNonstrict(entityCall: (MbleMemberService) => Unit)(implicit insertOptionCall: (ScrInsertOption[MemberServiceCB]) => Unit = null, updateOptionCall: (ScrUpdateOption[MemberServiceCB]) => Unit = null): Unit = {
        doInsertOrUpdateNonstrict(callbackMbleEntityToDBable(entityCall), callbackInsertOption(insertOptionCall), callbackUpdateOption(updateOptionCall));
    }

    protected def doInsertOrUpdateNonstrict(et: DbleMemberService, iop: InsertOption[MemberServiceCB], uop: UpdateOption[MemberServiceCB]): Unit = {
        helpInsertOrUpdateInternally(et, new InternalInsertOrUpdateNonstrictCallback[DbleMemberService]() {
            def callbackInsert(let: DbleMemberService): Unit = { doInsert(let, iop); }
            def callbackUpdateNonstrict(let: DbleMemberService): Unit = { doUpdateNonstrict(let, uop); }
        });
    }

    @Override
    protected def doCreateOrModifyNonstrict(et: Entity, iop: InsertOption[_ <: ConditionBean], uop: UpdateOption[_ <: ConditionBean]): Unit = {
        doInsertOrUpdateNonstrict(downcast(et), downcast(iop), downcast(uop));
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl)
     * <pre>
     * DbleMemberService memberService = new DbleMemberService();
     * memberService.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * memberService.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     memberServiceBhv.<span style="color: #DD4747">delete</span>(memberService);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param entityCall The callback for entity of delete. (NotNull, PrimaryKeyNotNull)
     * @param optionCall The callback for option of delete. (NoArgAllowed: then no option)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    def delete(entityCall: (MbleMemberService) => Unit)(implicit optionCall: (ScrDeleteOption[MemberServiceCB]) => Unit = null): Unit = {
        doDelete(callbackMbleEntityToDBable(entityCall), callbackDeleteOption(optionCall));
    }

    protected def doDelete(et: DbleMemberService, op: DeleteOption[MemberServiceCB]): Unit = {
        assertObjectNotNull("memberService", et);
        prepareDeleteOption(op);
        helpDeleteInternally(et, new InternalDeleteCallback[DbleMemberService]() {
            def callbackDelegateDelete(let: DbleMemberService): Int = { return delegateDelete(let, op); } });
    }

    protected def prepareDeleteOption(op: DeleteOption[MemberServiceCB]): Unit =
    { if (op != null) { assertDeleteOptionStatus(op); } }

    @Override
    protected def doRemove(et: Entity, op: DeleteOption[_ <: ConditionBean]): Unit = {
        doDelete(downcast(et), downcast(op));
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * DbleMemberService memberService = new DbleMemberService();
     * memberService.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//memberService.setVersionNo(value);</span>
     * memberServiceBhv.<span style="color: #DD4747">deleteNonstrict</span>(memberService);
     * </pre>
     * @param entityCall The callback for entity of delete. (NotNull, PrimaryKeyNotNull)
     * @param optionCall The callback for option of delete. (NoArgAllowed: then no option)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    def deleteNonstrict(entityCall: (MbleMemberService) => Unit)(implicit optionCall: (ScrDeleteOption[MemberServiceCB]) => Unit = null): Unit = {
        doDeleteNonstrict(callbackMbleEntityToDBable(entityCall), callbackDeleteOption(optionCall));
    }

    protected def doDeleteNonstrict(et: DbleMemberService, op: DeleteOption[MemberServiceCB]): Unit = {
        assertObjectNotNull("memberService", et);
        prepareDeleteOption(op);
        helpDeleteNonstrictInternally(et, new InternalDeleteNonstrictCallback[DbleMemberService]() {
            def callbackDelegateDeleteNonstrict(let: DbleMemberService): Int = { return delegateDeleteNonstrict(let, op); } });
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
     *     DbleMemberService memberService = new DbleMemberService();
     *     memberService.setFooName("foo");
     *     if (...) {
     *         memberService.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     memberServiceList.add(memberService);
     * }
     * memberServiceBhv.<span style="color: #DD4747">batchInsert</span>(memberServiceList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param memberServiceList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    def batchInsert(batchCall: (ScrBatchEntityList[MbleMemberService]) => Unit)(implicit optionCall: (ScrInsertOption[MemberServiceCB]) => Unit = null): Array[Int] = {
        return doBatchInsert(callbackBatch(batchCall), callbackInsertOption(optionCall));
    }

    protected def doBatchInsert(ls: List[DbleMemberService], op: InsertOption[MemberServiceCB]): Array[Int] = {
        assertObjectNotNull("memberServiceList", ls);
        val rlop: InsertOption[MemberServiceCB] = if (op != null) { op } else { createPlainInsertOption() }
        prepareBatchInsertOption(ls, op); // required
        return delegateBatchInsert(ls, op);
    }

    protected def prepareBatchInsertOption(ls: List[DbleMemberService], op: InsertOption[MemberServiceCB]): Unit = {
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
     *     DbleMemberService memberService = new DbleMemberService();
     *     memberService.setFooName("foo");
     *     if (...) {
     *         memberService.setFooPrice(123);
     *     } else {
     *         memberService.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//memberService.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     memberServiceList.add(memberService);
     * }
     * memberServiceBhv.<span style="color: #DD4747">batchUpdate</span>(memberServiceList);
     * </pre>
     * @param memberServiceList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    def batchUpdate(batchCall: (ScrBatchEntityList[MbleMemberService]) => Unit)(implicit optionCall: (ScrUpdateOption[MemberServiceCB]) => Unit = null): Array[Int] = {
        return doBatchUpdate(callbackBatch(batchCall), callbackUpdateOption(optionCall));
    }

    protected def doBatchUpdate(ls: List[DbleMemberService], op: UpdateOption[MemberServiceCB]): Array[Int] = {
        assertObjectNotNull("memberServiceList", ls);
        val rlop: UpdateOption[MemberServiceCB] = if (op != null) { op } else { createPlainUpdateOption() }
        prepareBatchUpdateOption(ls, rlop); // required
        return delegateBatchUpdate(ls, rlop);
    }

    protected def prepareBatchUpdateOption(ls: List[DbleMemberService], op: UpdateOption[MemberServiceCB]): Unit = {
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
     *     DbleMemberService memberService = new DbleMemberService();
     *     memberService.setFooName("foo");
     *     if (...) {
     *         memberService.setFooPrice(123);
     *     } else {
     *         memberService.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//memberService.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     memberServiceList.add(memberService);
     * }
     * memberServiceBhv.<span style="color: #DD4747">batchUpdate</span>(memberServiceList);
     * </pre>
     * @param memberServiceList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    def batchUpdateNonstrict(batchCall: (ScrBatchEntityList[MbleMemberService]) => Unit)(implicit optionCall: (ScrUpdateOption[MemberServiceCB]) => Unit = null): Array[Int] = {
        return doBatchUpdateNonstrict(callbackBatch(batchCall), callbackUpdateOption(optionCall));
    }

    protected def doBatchUpdateNonstrict(ls: List[DbleMemberService], op: UpdateOption[MemberServiceCB]): Array[Int] = {
        assertObjectNotNull("memberServiceList", ls);
        val rlop: UpdateOption[MemberServiceCB] = if (op != null) { op } else { createPlainUpdateOption() }
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
     * @param memberServiceList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    def batchDelete(batchCall: (ScrBatchEntityList[MbleMemberService]) => Unit)(implicit optionCall: (ScrDeleteOption[MemberServiceCB]) => Unit = null): Array[Int] = {
        return doBatchDelete(callbackBatch(batchCall), callbackDeleteOption(optionCall));
    }

    protected def doBatchDelete(ls: List[DbleMemberService], op: DeleteOption[MemberServiceCB]): Array[Int] = {
        assertObjectNotNull("memberServiceList", ls);
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
     * @param memberServiceList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    def batchDeleteNonstrict(batchCall: (ScrBatchEntityList[MbleMemberService]) => Unit)(implicit optionCall: (ScrDeleteOption[MemberServiceCB]) => Unit = null): Array[Int] = {
        return doBatchDeleteNonstrict(callbackBatch(batchCall), callbackDeleteOption(optionCall));
    }

    protected def doBatchDeleteNonstrict(ls: List[DbleMemberService], op: DeleteOption[MemberServiceCB]): Array[Int] = {
        assertObjectNotNull("memberServiceList", ls);
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
     * memberServiceBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;DbleMemberService, MemberServiceCB&gt;() {
     *     public ConditionBean setup(memberService entity, MemberServiceCB intoCB) {
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
    def queryInsert(setupper: QueryInsertSetupper[DbleMemberService, MemberServiceCB]): Int = {
        return doQueryInsert(setupper, null);
    }

    protected def doQueryInsert(sp: QueryInsertSetupper[DbleMemberService, MemberServiceCB], op: InsertOption[MemberServiceCB]): Int = {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        val et: DbleMemberService = newEntity();
        val cb: MemberServiceCB = createCBForQueryInsert();
        return delegateQueryInsert(et, cb, sp.setup(et, cb), op);
    }

    protected def createCBForQueryInsert(): MemberServiceCB =
    { val cb: MemberServiceCB = newConditionBean(); cb.xsetupForQueryInsert(); return cb; }

    @Override
    protected def doRangeCreate(setupper: QueryInsertSetupper[_ <: Entity, _ <: ConditionBean], option: InsertOption[_ <: ConditionBean]): Int = {
        doQueryInsert(downcast(setupper), downcast(option));
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * DbleMemberService memberService = new DbleMemberService();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//memberService.setPK...(value);</span>
     * memberService.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//memberService.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//memberService.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//memberService.setVersionNo(value);</span>
     * MemberServiceCB cb = new MemberServiceCB();
     * cb.query().setFoo...(value);
     * memberServiceBhv.<span style="color: #DD4747">queryUpdate</span>(memberService, cb);
     * </pre>
     * @param entityCall The callback for entity that contains update values. (NotNull)
     * @param cbCall The callback for condition-bean of MemberService. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    def queryUpdate(entityCall: (MbleMemberService) => Unit)(cbCall: (MemberServiceCB) => Unit): Int = {
        assertObjectNotNull("entityCall", entityCall); assertObjectNotNull("cbCall", cbCall);
        return doQueryUpdate(callbackMbleEntityToDBable(entityCall), callbackCB(cbCall), null);
    }

    protected def doQueryUpdate(memberService: DbleMemberService, cb: MemberServiceCB, op: UpdateOption[MemberServiceCB]): Int = {
        assertObjectNotNull("memberService", memberService); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return if (checkCountBeforeQueryUpdateIfNeeds(cb)) { delegateQueryUpdate(memberService, cb, op) } else { 0 };
    }

    @Override
    protected def doRangeModify(et: Entity, cb: ConditionBean, op: UpdateOption[_ <: ConditionBean]): Int = {
        return doQueryUpdate(downcast(et), downcast(cb), downcast(op));
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * MemberServiceCB cb = new MemberServiceCB();
     * cb.query().setFoo...(value);
     * memberServiceBhv.<span style="color: #DD4747">queryDelete</span>(memberService, cb);
     * </pre>
     * @param cbCall The callback for condition-bean of MemberService. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    def queryDelete(cbCall: (MemberServiceCB) => Unit): Int = {
        assertObjectNotNull("cbCall", cbCall);
        return doQueryDelete(callbackCB(cbCall), null);
    }

    protected def doQueryDelete(cb: MemberServiceCB, op: DeleteOption[MemberServiceCB]): Int = {
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
    def outsideSql(): ScrOutsideSqlBasicExecutor[MemberServiceBhv] = {
        return toImmutableOutsideSqlBasicExecutor(doOutsideSql());
    }

    protected def toImmutableOutsideSqlBasicExecutor(executor: OutsideSqlBasicExecutor[MemberServiceBhv]): ScrOutsideSqlBasicExecutor[MemberServiceBhv] =
    { new ScrOutsideSqlBasicExecutor(executor) }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected def delegateSelectCountUniquely(cb: MemberServiceCB): Int = { return Integer2int(invoke(createSelectCountCBCommand(cb, true))); }
    protected def delegateSelectCountPlainly(cb: MemberServiceCB): Int = { return Integer2int(invoke(createSelectCountCBCommand(cb, false))); }
    protected def delegateSelectCursor[ENTITY <: DbleMemberService](cb: MemberServiceCB, rh: EntityRowHandler[ENTITY], tp: Class[ENTITY])
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected def delegateSelectList[ENTITY <: DbleMemberService](cb: MemberServiceCB, tp: Class[ENTITY]): List[ENTITY] =
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected def delegateInsert(et: DbleMemberService, op: InsertOption[MemberServiceCB]): Int =
    { if (!processBeforeInsert(et, op)) { return 0; }
      return Integer2int(invoke(createInsertEntityCommand(et, op))); }
    protected def delegateUpdate(et: DbleMemberService, op: UpdateOption[MemberServiceCB]): Int =
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return Integer2int(invoke(createUpdateEntityCommand(et, op))); }
    protected def delegateUpdateNonstrict(et: DbleMemberService, op: UpdateOption[MemberServiceCB]): Int =
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return Integer2int(invoke(createUpdateNonstrictEntityCommand(et, op))); }
    protected def delegateDelete(et: DbleMemberService, op: DeleteOption[MemberServiceCB]): Int =
    { if (!processBeforeDelete(et, op)) { return 0; }
      return Integer2int(invoke(createDeleteEntityCommand(et, op))); }
    protected def delegateDeleteNonstrict(et: DbleMemberService, op: DeleteOption[MemberServiceCB]): Int =
    { if (!processBeforeDelete(et, op)) { return 0; }
      return Integer2int(invoke(createDeleteNonstrictEntityCommand(et, op))); }

    protected def delegateBatchInsert(ls: List[DbleMemberService], op: InsertOption[MemberServiceCB]): Array[Int] =
    { if (ls.isEmpty()) { return new Array[Int](0); }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)).asInstanceOf[Array[Int]]; }
    protected def delegateBatchUpdate(ls: List[DbleMemberService], op: UpdateOption[MemberServiceCB]): Array[Int] =
    { if (ls.isEmpty()) { return new Array[Int](0); }
      return invoke(createBatchUpdateCommand(processBatchInternally(ls, op, false), op)).asInstanceOf[Array[Int]]; }
    protected def delegateBatchUpdateNonstrict(ls: List[DbleMemberService], op: UpdateOption[MemberServiceCB]): Array[Int] =
    { if (ls.isEmpty()) { return new Array[Int](0); }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)).asInstanceOf[Array[Int]]; }
    protected def delegateBatchDelete(ls: List[DbleMemberService], op: DeleteOption[MemberServiceCB]): Array[Int] =
    { if (ls.isEmpty()) { return new Array[Int](0); }
      return invoke(createBatchDeleteCommand(processBatchInternally(ls, op, false), op)).asInstanceOf[Array[Int]]; }
    protected def delegateBatchDeleteNonstrict(ls: List[DbleMemberService], op: DeleteOption[MemberServiceCB]): Array[Int] =
    { if (ls.isEmpty()) { return new Array[Int](0); }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)).asInstanceOf[Array[Int]]; }

    protected def delegateQueryInsert(et: DbleMemberService, inCB: MemberServiceCB, resCB: ConditionBean, op: InsertOption[MemberServiceCB]): Int =
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; }
      return Integer2int(invoke(createQueryInsertCBCommand(et, inCB, resCB, op)));  }
    protected def delegateQueryUpdate(et: DbleMemberService, cb: MemberServiceCB, op: UpdateOption[MemberServiceCB]): Int =
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; }
      return Integer2int(invoke(createQueryUpdateCBCommand(et, cb, op)));  }
    protected def delegateQueryDelete(cb: MemberServiceCB, op: DeleteOption[MemberServiceCB]): Int =
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
    protected def typeOfSelectedEntity(): Class[DbleMemberService] = { classOf[DbleMemberService] }
    protected def newMbleEntity(): MbleMemberService = { new MbleMemberService() }
    protected def newPagingView(rb: PagingResultBean[DbleMemberService]): ScrPagingView[MemberService] =
    { new ScrPagingView(toImmutableEntityList(rb), rb) }

    protected def callbackCB(cbCall: (MemberServiceCB) => Unit): MemberServiceCB = {
        assertObjectNotNull("cbCall", cbCall);
        val cb = newConditionBean(); cbCall(cb); return cb;
    }

    protected def callbackBatch(batchCall: (ScrBatchEntityList[MbleMemberService]) => Unit): List[DbleMemberService] = {
        assertObjectNotNull("batchCall", batchCall);
        val batch = new ScrBatchEntityList[MbleMemberService]();
        val entityList: List[DbleMemberService] = new ArrayList[DbleMemberService]();
        batch.entityCallList.asScala.map { entityCall =>
            val entity = newMbleEntity(); entityCall(entity); entity.toDBable;
        }
        return entityList;
    }

    protected def callbackMbleEntity(entityCall: (MbleMemberService) => Unit): MbleMemberService = {
        assertObjectNotNull("entityCall", entityCall);
        val entity = newMbleEntity(); entityCall(entity); return entity;
    }

    protected def callbackMbleEntityToDBable(entityCall: (MbleMemberService) => Unit): DbleMemberService = {
        return callbackMbleEntity(entityCall).toDBable;
    }

    protected def callbackInsertOption(optionCall: (ScrInsertOption[MemberServiceCB]) => Unit): InsertOption[MemberServiceCB] = {
        if (optionCall == null) { return null; }
        val option = new ScrInsertOption[MemberServiceCB](new InsertOption[MemberServiceCB]());
        optionCall(option); return option.toNative;
    }

    protected def callbackUpdateOption(optionCall: (ScrUpdateOption[MemberServiceCB]) => Unit): UpdateOption[MemberServiceCB] = {
        if (optionCall == null) { return null; }
        val option = new ScrUpdateOption[MemberServiceCB](new UpdateOption[MemberServiceCB]()); optionCall(option); return option.toNative;
    }

    protected def callbackDeleteOption(optionCall: (ScrDeleteOption[MemberServiceCB]) => Unit): DeleteOption[MemberServiceCB] = {
        if (optionCall == null) { return null; }
        val option = new ScrDeleteOption[MemberServiceCB](new DeleteOption[MemberServiceCB]()); optionCall(option); return option.toNative;
    }

    protected def callbackLoader(dbleList: List[DbleMemberService], loaderCall: (LoaderOfMemberService) => Unit = null): Unit = {
        if (loaderCall == null) { return; }
        val loader = new LoaderOfMemberService();
        loader.ready(dbleList.asInstanceOf[List[DbleMemberService]], _behaviorSelector);
        loaderCall(loader);
    }

    protected def downcast(et: Entity): DbleMemberService =
    { return helpEntityDowncastInternally(et, classOf[DbleMemberService]); }

    protected def downcast(cb: ConditionBean): MemberServiceCB =
    { return helpConditionBeanDowncastInternally(cb, classOf[MemberServiceCB]); }

    protected def downcast(ls: List[_ <: Entity]): List[DbleMemberService] =
    { return ls.asInstanceOf[List[DbleMemberService]]; }

    protected def downcast(op: InsertOption[_ <: ConditionBean]): InsertOption[MemberServiceCB] =
    { return op.asInstanceOf[InsertOption[MemberServiceCB]]; }

    protected def downcast(op: UpdateOption[_ <: ConditionBean]): UpdateOption[MemberServiceCB] =
    { return op.asInstanceOf[UpdateOption[MemberServiceCB]]; }

    protected def downcast(op: DeleteOption[_ <: ConditionBean]): DeleteOption[MemberServiceCB] =
    { return op.asInstanceOf[DeleteOption[MemberServiceCB]]; }

    protected def downcast(sp: QueryInsertSetupper[_ <: Entity, _ <: ConditionBean]): QueryInsertSetupper[DbleMemberService, MemberServiceCB] =
    { return sp.asInstanceOf[QueryInsertSetupper[DbleMemberService, MemberServiceCB]]; }

    // ===================================================================================
    //                                                                        Scala Helper
    //                                                                        ============
    protected def toScalaList[ENTITY](javaList: Collection[ENTITY]): scala.collection.immutable.List[ENTITY] = {
        if (javaList == null) { scala.collection.immutable.List() }
        return scala.collection.immutable.List.fromArray(javaList.toArray()).asInstanceOf[scala.collection.immutable.List[ENTITY]];
    }

    def toImmutableEntityList(dbleList: Collection[DbleMemberService]): scala.collection.immutable.List[MemberService] =
    { toScalaList(dbleList).map(new MemberService(_)) }

    def toDBableEntityList(immuList: scala.collection.immutable.List[MemberService]): List[DbleMemberService] =
    { immuList.map(new DbleMemberService().acceptImmutable(_)).asJava }
}
