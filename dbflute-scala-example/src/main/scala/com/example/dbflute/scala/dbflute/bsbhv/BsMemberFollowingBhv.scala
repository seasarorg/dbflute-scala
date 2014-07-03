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
 * The behavior of (会員フォローイング)MEMBER_FOLLOWING as TABLE. <br />
 * <pre>
 * [primary key]
 *     MEMBER_FOLLOWING_ID
 *
 * [column]
 *     MEMBER_FOLLOWING_ID, MY_MEMBER_ID, YOUR_MEMBER_ID, FOLLOW_DATETIME
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MEMBER_FOLLOWING_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     MEMBER
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     memberByMyMemberId, memberByYourMemberId
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
abstract class BsMemberFollowingBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    def getTableDbName(): String = { return "MEMBER_FOLLOWING"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    def getDBMeta(): DBMeta = { return MemberFollowingDbm; }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    def newEntity(): DbleMemberFollowing = { return new DbleMemberFollowing(); }

    /** {@inheritDoc} */
    def newConditionBean(): MemberFollowingCB = { return new MemberFollowingCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * MemberFollowingCB cb = new MemberFollowingCB();
     * cb.query().setFoo...(value);
     * int count = memberFollowingBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of DbleMemberFollowing. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    def selectCount(cbCall: (MemberFollowingCB) => Unit): Int = {
        return facadeSelectCount(callbackCB(cbCall));
    }

    protected def facadeSelectCount(cb: MemberFollowingCB): Int = {
        return doSelectCountUniquely(cb);
    }

    protected def doSelectCountUniquely(cb: MemberFollowingCB): Int = { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected def doSelectCountPlainly(cb: MemberFollowingCB): Int = { // called by selectPage(cb)
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
     * MemberFollowingCB cb = new MemberFollowingCB();
     * cb.query().setFoo...(value);
     * OptionalEntity&lt;DbleMemberFollowing&gt; entity = memberFollowingBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     *
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * entity.<span style="color: #DD4747">required</span>(memberFollowing -&gt; {
     *     ...
     * });
     * DbleMemberFollowing memberFollowing = entity.entity.<span style="color: #DD4747">get()</span>;
     *
     * <span style="color: #3F7E5E">// if it might be no data, ifPresent(), isPresent(), ...</span>
     * entity.<span style="color: #DD4747">ifPresent</span>(memberFollowing -&gt; {
     *     ...
     * });
     * if (entity.entity.<span style="color: #DD4747">isPresent()</span>) {
     *     DbleMemberFollowing memberFollowing = entity.entity.<span style="color: #DD4747">get()</span>;
     * } else {
     *     ...
     * }
     * </pre>
     * @param cbCall The callback for condition-bean of MemberFollowing. (NotNull)
     * @param loaderCall The callback for referrer loader of MemberFollowing. (NoArgAllowed: then no loading)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get() of return value is called and the value is null, which means entity has already been deleted (point is not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    def selectEntity(cbCall: (MemberFollowingCB) => Unit)(implicit loaderCall: (LoaderOfMemberFollowing) => Unit = null): Option[MemberFollowing] = {
        return facadeSelectEntity(callbackCB(cbCall))(loaderCall).map(_.toImmutable);
    }

    protected def facadeSelectEntity(cb: MemberFollowingCB)(loaderCall: (LoaderOfMemberFollowing) => Unit = null): Option[DbleMemberFollowing] = {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity())(loaderCall);
    }

    protected def doSelectEntity[ENTITY <: DbleMemberFollowing](cb: MemberFollowingCB, tp: Class[ENTITY])(loaderCall: (LoaderOfMemberFollowing) => Unit = null): ENTITY = {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        val dble = helpSelectEntityInternally(cb, tp);
        if (dble != null) {
            callbackLoader(DfCollectionUtil.newArrayList(dble.asInstanceOf[DbleMemberFollowing]), loaderCall);
        }
        return dble;
    }

    protected def doSelectOptionalEntity[ENTITY <: DbleMemberFollowing](cb: MemberFollowingCB, tp: Class[ENTITY])(loaderCall: (LoaderOfMemberFollowing) => Unit = null): Option[ENTITY] = {
        return Option.apply(doSelectEntity(cb, tp)(loaderCall));
    }

    protected def doReadEntity(cb: ConditionBean): Entity = { facadeSelectEntity(downcast(cb))().orNull }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * MemberFollowingCB cb = new MemberFollowingCB();
     * cb.query().setFoo...(value);
     * DbleMemberFollowing memberFollowing = memberFollowingBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = memberFollowing.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbCall The callback for condition-bean of MemberFollowing. (NotNull)
     * @param loaderCall The callback for referrer loader of MemberFollowing. (NoArgAllowed: then no loading)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (point is not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    def selectEntityWithDeletedCheck(cbCall: (MemberFollowingCB) => Unit)(implicit loaderCall: (LoaderOfMemberFollowing) => Unit = null): MemberFollowing = {
        return facadeSelectEntityWithDeletedCheck(callbackCB(cbCall))(loaderCall).toImmutable;
    }

    protected def facadeSelectEntityWithDeletedCheck(cb: MemberFollowingCB)(loaderCall: (LoaderOfMemberFollowing) => Unit = null): DbleMemberFollowing = {
        return doSelectEntityWithDeletedCheck(cb, typeOfSelectedEntity())(loaderCall);
    }

    protected def doSelectEntityWithDeletedCheck[ENTITY <: DbleMemberFollowing](cb: MemberFollowingCB, tp: Class[ENTITY])(loaderCall: (LoaderOfMemberFollowing) => Unit = null): ENTITY = {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        val dble = helpSelectEntityWithDeletedCheckInternally(cb, tp);
        callbackLoader(DfCollectionUtil.newArrayList(dble.asInstanceOf[DbleMemberFollowing]), loaderCall);
        return dble;
    }

    protected def doReadEntityWithDeletedCheck(cb: ConditionBean): Entity = { facadeSelectEntityWithDeletedCheck(downcast(cb))() }

    /**
     * Select the entity by the primary-key value.
     * @param memberFollowingId (会員フォローイングID): PK, ID, NotNull, BIGINT(19). (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    def selectByPK(memberFollowingId: Long): Option[MemberFollowing] = {
        return facadeSelectByPK(memberFollowingId).map(_.toImmutable);
    }

    protected def facadeSelectByPK(memberFollowingId: Long): Option[DbleMemberFollowing] = {
        return doSelectByPK(memberFollowingId, typeOfSelectedEntity());
    }

    protected def doSelectByPK[ENTITY <: DbleMemberFollowing](memberFollowingId: Long, tp: Class[ENTITY]): Option[ENTITY] = {
        return Option.apply(doSelectEntity(xprepareCBAsPK(memberFollowingId), tp)());
    }

    protected def xprepareCBAsPK(memberFollowingId: Long): MemberFollowingCB = {
        assertObjectNotNull("memberFollowingId", memberFollowingId);
        return newConditionBean().acceptPK(memberFollowingId);
    }

    /**
     * Select the entity by the unique-key value.
     * @param myMemberId (わたし): UQ+, IX+, NotNull, INTEGER(10), FK to MEMBER. (NotNull)
     * @param yourMemberId (あなた): +UQ, IX+, NotNull, INTEGER(10), FK to MEMBER. (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    def selectByUniqueOf(myMemberId: Integer, yourMemberId: Integer): Option[MemberFollowing] = {
        return facadeSelectByUniqueOf(myMemberId, yourMemberId).map(_.toImmutable);
    }

    protected def facadeSelectByUniqueOf(myMemberId: Integer, yourMemberId: Integer): Option[DbleMemberFollowing] = {
        return doSelectByUniqueOf(myMemberId, yourMemberId, typeOfSelectedEntity());
    }

    protected def doSelectByUniqueOf[ENTITY <: DbleMemberFollowing](myMemberId: Integer, yourMemberId: Integer, tp: Class[ENTITY]): Option[ENTITY] = {
        return Option.apply(doSelectEntity(xprepareCBAsUniqueOf(myMemberId, yourMemberId), tp)());
    }

    protected def xprepareCBAsUniqueOf(myMemberId: Integer, yourMemberId: Integer): MemberFollowingCB = {
        assertObjectNotNull("myMemberId", myMemberId);assertObjectNotNull("yourMemberId", yourMemberId);
        return newConditionBean().acceptUniqueOf(myMemberId, yourMemberId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * MemberFollowingCB cb = new MemberFollowingCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * List&lt;${MemberFollowing}&gt; memberFollowingList = memberFollowingBhv.<span style="color: #DD4747">selectList</span>(cb);
     * memberFollowingList.foreach(memberFollowing =>
     *     ... = memberFollowing...;
     * }
     * </pre>
     * @param cbCall The callback for condition-bean of MemberFollowing. (NotNull)
     * @param loaderCall The callback for referrer loader of MemberFollowing. (NoArgAllowed: then no loading)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    def selectList(cbCall: (MemberFollowingCB) => Unit)(implicit loaderCall: (LoaderOfMemberFollowing) => Unit = null): immutable.List[MemberFollowing] = {
        return toImmutableEntityList(facadeSelectList(callbackCB(cbCall))(loaderCall));
    }

    protected def facadeSelectList(cb: MemberFollowingCB)(loaderCall: (LoaderOfMemberFollowing) => Unit = null): ListResultBean[DbleMemberFollowing] = {
        return doSelectList(cb, typeOfSelectedEntity())(loaderCall);
    }

    protected def doSelectList[ENTITY <: DbleMemberFollowing](cb: MemberFollowingCB, tp: Class[ENTITY])(loaderCall: (LoaderOfMemberFollowing) => Unit = null): ListResultBean[ENTITY] = {
        val dbleList = helpSelectListInternally(cb, tp);
        callbackLoader(dbleList.asInstanceOf[List[DbleMemberFollowing]], loaderCall);
        return dbleList;
    }

    protected def doReadList(cb: ConditionBean): ListResultBean[_ <: Entity] = { facadeSelectList(downcast(cb))() }

    override protected def isSuppressSpecifyDerivedReferrerEntityPropertyCheck(): Boolean = { true }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * MemberFollowingCB cb = new MemberFollowingCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;DbleMemberFollowing&gt; page = memberFollowingBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (DbleMemberFollowing memberFollowing : page) {
     *     ... = memberFollowing.get...();
     * }
     * </pre>
     * @param cbCall The callback for condition-bean of MemberFollowing. (NotNull)
     * @param loaderCall The callback for referrer loader of MemberFollowing. (NoArgAllowed: then no loading)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    def selectPage(cbCall: (MemberFollowingCB) => Unit)(implicit loaderCall: (LoaderOfMemberFollowing) => Unit = null): ScrPagingView[MemberFollowing] = {
        return newPagingView(facadeSelectPage(callbackCB(cbCall))(loaderCall));
    }

    protected def facadeSelectPage(cb: MemberFollowingCB)(loaderCall: (LoaderOfMemberFollowing) => Unit = null): PagingResultBean[DbleMemberFollowing] = {
        return doSelectPage(cb, typeOfSelectedEntity())(loaderCall);
    }

    protected def doSelectPage[ENTITY <: DbleMemberFollowing](cb: MemberFollowingCB, tp: Class[ENTITY])(loaderCall: (LoaderOfMemberFollowing) => Unit = null): PagingResultBean[ENTITY] = {
        return helpSelectPageInternally(cb, tp);
    }

    protected def doReadPage(cb: ConditionBean): PagingResultBean[_ <: Entity] = { facadeSelectPage(downcast(cb))() }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * MemberFollowingCB cb = new MemberFollowingCB();
     * cb.query().setFoo...(value);
     * memberFollowingBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;DbleMemberFollowing&gt;() {
     *     public void handle(DbleMemberFollowing entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of DbleMemberFollowing. (NotNull)
     * @param entityRowHandler The handler of entity row of DbleMemberFollowing. (NotNull)
     */
    def selectCursor(cbCall: (MemberFollowingCB) => Unit)(rowCall: (MemberFollowing) => Unit): Unit = {
        facadeSelectCursor(callbackCB(cbCall), new EntityRowHandler[DbleMemberFollowing]() {
            def handle(entity: DbleMemberFollowing): Unit = { rowCall(entity.toImmutable) }
        });
    }

    protected def facadeSelectCursor(cb: MemberFollowingCB, handler: EntityRowHandler[DbleMemberFollowing]): Unit = {
        doSelectCursor(cb, handler, typeOfSelectedEntity());
    }

    protected def doSelectCursor[ENTITY <: DbleMemberFollowing](cb: MemberFollowingCB, handler: EntityRowHandler[ENTITY], tp: Class[ENTITY]): Unit = {
        helpSelectCursorInternally(cb, handler, tp);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * memberFollowingBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(MemberFollowingCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    def scalarSelect[RESULT](resultType: Class[RESULT]): ScrHpSLSFunction[MemberFollowingCB, RESULT] = {
        return toScalaSLSFunction[RESULT](facadeScalarSelect(resultType));
    }

    protected def toScalaSLSFunction[RESULT](function: HpSLSFunction[MemberFollowingCB, RESULT]): ScrHpSLSFunction[MemberFollowingCB, RESULT] =
    { new ScrHpSLSFunction[MemberFollowingCB, RESULT](function) }

    protected def facadeScalarSelect[RESULT](resultType: Class[RESULT]): HpSLSFunction[MemberFollowingCB, RESULT] = {
        return doScalarSelect(resultType, newConditionBean());
    }

    protected def doScalarSelect[RESULT, CB <: MemberFollowingCB](tp: Class[RESULT], cb: CB): HpSLSFunction[CB, RESULT] = {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLSFunction[CB, RESULT](cb, tp, createHpSLSExecutor());
    }

    protected def doReadScalar[RESULT](tp: Class[RESULT]): HpSLSFunction[_ <: ConditionBean, RESULT] = { facadeScalarSelect(tp) }

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
     * @param memberFollowingList The list of memberFollowing. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    def pulloutMemberByMyMemberId(memberFollowingList: immutable.List[MemberFollowing]): immutable.List[Member] = {
        val dbleList = helpPulloutInternally(toDBableEntityList(memberFollowingList), "memberByMyMemberId");
        return toScalaList(dbleList).map(new Member(_));
    }

    /**
     * Pull out the list of foreign table 'DbleMember'.
     * @param memberFollowingList The list of memberFollowing. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    def pulloutMemberByYourMemberId(memberFollowingList: immutable.List[MemberFollowing]): immutable.List[Member] = {
        val dbleList = helpPulloutInternally(toDBableEntityList(memberFollowingList), "memberByYourMemberId");
        return toScalaList(dbleList).map(new Member(_));
    }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key memberFollowingId.
     * @param memberFollowingList The list of memberFollowing. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    def extractMemberFollowingIdList(memberFollowingList: immutable.List[MemberFollowing]): immutable.List[Long] = {
        val plainList = helpExtractListInternally(toDBableEntityList(memberFollowingList), "memberFollowingId");
        return toScalaList(plainList).map(_.asInstanceOf[Long]);
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * DbleMemberFollowing memberFollowing = new DbleMemberFollowing();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * memberFollowing.setFoo...(value);
     * memberFollowing.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//memberFollowing.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//memberFollowing.set...;</span>
     * memberFollowingBhv.<span style="color: #DD4747">insert</span>(memberFollowing);
     * ... = memberFollowing.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param entityCall The callback for entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param optionCall The callback for option of insert. (NoArgAllowed: then no option)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    def insert(entityCall: (MbleMemberFollowing) => Unit)(implicit optionCall: (ScrInsertOption[MemberFollowingCB]) => Unit = null): Unit = {
        assertObjectNotNull("entityCall", entityCall);
        doInsert(callbackMbleEntityToDBable(entityCall), callbackInsertOption(optionCall));
    }

    protected def doInsert(et: DbleMemberFollowing, op: InsertOption[MemberFollowingCB]): Unit = {
        assertObjectNotNull("memberFollowing", et); prepareInsertOption(op); delegateInsert(et, op);
    }

    protected def prepareInsertOption(op: InsertOption[MemberFollowingCB]): Unit = {
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
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * DbleMemberFollowing memberFollowing = new DbleMemberFollowing();
     * memberFollowing.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * memberFollowing.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//memberFollowing.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//memberFollowing.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * memberFollowing.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     memberFollowingBhv.<span style="color: #DD4747">update</span>(memberFollowing);
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
    def update(entityCall: (MbleMemberFollowing) => Unit)(implicit optionCall: (ScrUpdateOption[MemberFollowingCB]) => Unit = null): Unit = {
        assertObjectNotNull("entityCall", entityCall);
        doUpdate(callbackMbleEntityToDBable(entityCall), callbackUpdateOption(optionCall));
    }

    protected def doUpdate(et: DbleMemberFollowing, op: UpdateOption[MemberFollowingCB]): Unit = {
        assertObjectNotNull("memberFollowing", et); prepareUpdateOption(op); helpUpdateInternally(et, op);
    }

    protected def prepareUpdateOption(op: UpdateOption[MemberFollowingCB]): Unit = {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) { op.resolveSelfSpecification(createCBForVaryingUpdate()); }
        if (op.hasSpecifiedUpdateColumn()) { op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate()); }
    }

    protected def createCBForVaryingUpdate(): MemberFollowingCB =
    { val cb: MemberFollowingCB = newConditionBean(); cb.xsetupForVaryingUpdate(); return cb; }

    protected def createCBForSpecifiedUpdate(): MemberFollowingCB =
    { val cb: MemberFollowingCB = newConditionBean(); cb.xsetupForSpecifiedUpdate(); return cb; }

    protected def doModify(et: Entity, op: UpdateOption[_ <: ConditionBean]): Unit = { doUpdate(downcast(et), downcast(op)) }

    protected def doModifyNonstrict(et: Entity, op: UpdateOption[_ <: ConditionBean]): Unit =
    { doModify(et, op) }

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
    def insertOrUpdate(entityCall: (MbleMemberFollowing) => Unit)(implicit insertOptionCall: (ScrInsertOption[MemberFollowingCB]) => Unit = null, updateOptionCall: (ScrUpdateOption[MemberFollowingCB]) => Unit = null): Unit = {
        doInsertOrUpdate(callbackMbleEntityToDBable(entityCall), callbackInsertOption(insertOptionCall), callbackUpdateOption(updateOptionCall));
    }

    protected def doInsertOrUpdate(et: DbleMemberFollowing, iop: InsertOption[MemberFollowingCB], uop: UpdateOption[MemberFollowingCB]): Unit = {
        assertObjectNotNull("memberFollowing", et); helpInsertOrUpdateInternally(et, iop, uop);
    }

    protected def doCreateOrModify(et: Entity, iop: InsertOption[_ <: ConditionBean], uop: UpdateOption[_ <: ConditionBean]): Unit =
    { doInsertOrUpdate(downcast(et), downcast(iop), downcast(uop)) }

    @Override
    protected def doCreateOrModifyNonstrict(et: Entity, iop: InsertOption[_ <: ConditionBean], uop: UpdateOption[_ <: ConditionBean]): Unit = {
        doCreateOrModify(et, iop, uop);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * DbleMemberFollowing memberFollowing = new DbleMemberFollowing();
     * memberFollowing.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * memberFollowing.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     memberFollowingBhv.<span style="color: #DD4747">delete</span>(memberFollowing);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param entityCall The callback for entity of delete. (NotNull, PrimaryKeyNotNull)
     * @param optionCall The callback for option of delete. (NoArgAllowed: then no option)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    def delete(entityCall: (MbleMemberFollowing) => Unit)(implicit optionCall: (ScrDeleteOption[MemberFollowingCB]) => Unit = null): Unit = {
        doDelete(callbackMbleEntityToDBable(entityCall), callbackDeleteOption(optionCall));
    }

    protected def doDelete(et: DbleMemberFollowing, op: DeleteOption[MemberFollowingCB]): Unit = {
        assertObjectNotNull("memberFollowing", et); prepareDeleteOption(op); helpDeleteInternally(et, op);
    }

    protected def prepareDeleteOption(op: DeleteOption[MemberFollowingCB]): Unit = { if (op != null) { assertDeleteOptionStatus(op); } }

    protected def doRemove(et: Entity, op: DeleteOption[_ <: ConditionBean]): Unit = { doDelete(downcast(et), downcast(op)) }

    protected def doRemoveNonstrict(et: Entity, op: DeleteOption[_ <: ConditionBean]): Unit =
    { doRemove(et, op) }

    // ===================================================================================
    //                                                                        Batch Update
    //                                                                        ============
    /**
     * Batch-insert the entity list modified-only of same-set columns. (DefaultConstraintsEnabled) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <p><span style="color: #DD4747; font-size: 120%">The columns of least common multiple are registered like this:</span></p>
     * <pre>
     * for (... : ...) {
     *     DbleMemberFollowing memberFollowing = new DbleMemberFollowing();
     *     memberFollowing.setFooName("foo");
     *     if (...) {
     *         memberFollowing.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     memberFollowingList.add(memberFollowing);
     * }
     * memberFollowingBhv.<span style="color: #DD4747">batchInsert</span>(memberFollowingList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param memberFollowingList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    def batchInsert(batchCall: (ScrBatchEntityList[MbleMemberFollowing]) => Unit)(implicit optionCall: (ScrInsertOption[MemberFollowingCB]) => Unit = null): Array[Int] = {
        return doBatchInsert(callbackBatch(batchCall), callbackInsertOption(optionCall));
    }

    protected def doBatchInsert(ls: List[DbleMemberFollowing], op: InsertOption[MemberFollowingCB]): Array[Int] = {
        assertObjectNotNull("memberFollowingList", ls);
        val rlop: InsertOption[MemberFollowingCB] = if (op != null) { op } else { createPlainInsertOption() }
        prepareBatchInsertOption(ls, op); // required
        return delegateBatchInsert(ls, op);
    }

    protected def prepareBatchInsertOption(ls: List[DbleMemberFollowing], op: InsertOption[MemberFollowingCB]): Unit = {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(ls);
        prepareInsertOption(op);
    }

    protected def doLumpCreate(ls: List[Entity], op: InsertOption[_ <: ConditionBean]): Array[Int] = { doBatchInsert(downcast(ls), downcast(op)) }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     DbleMemberFollowing memberFollowing = new DbleMemberFollowing();
     *     memberFollowing.setFooName("foo");
     *     if (...) {
     *         memberFollowing.setFooPrice(123);
     *     } else {
     *         memberFollowing.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//memberFollowing.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     memberFollowingList.add(memberFollowing);
     * }
     * memberFollowingBhv.<span style="color: #DD4747">batchUpdate</span>(memberFollowingList);
     * </pre>
     * @param memberFollowingList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    def batchUpdate(batchCall: (ScrBatchEntityList[MbleMemberFollowing]) => Unit)(implicit optionCall: (ScrUpdateOption[MemberFollowingCB]) => Unit = null): Array[Int] = {
        return doBatchUpdate(callbackBatch(batchCall), callbackUpdateOption(optionCall));
    }

    protected def doBatchUpdate(ls: List[DbleMemberFollowing], op: UpdateOption[MemberFollowingCB]): Array[Int] = {
        assertObjectNotNull("memberFollowingList", ls);
        val rlop: UpdateOption[MemberFollowingCB] = if (op != null) { op } else { createPlainUpdateOption() }
        prepareBatchUpdateOption(ls, rlop); // required
        return delegateBatchUpdate(ls, rlop);
    }

    protected def prepareBatchUpdateOption(ls: List[DbleMemberFollowing], op: UpdateOption[MemberFollowingCB]): Unit = {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(ls);
        prepareUpdateOption(op);
    }

    protected def doLumpModify(ls: List[Entity], op: UpdateOption[_ <: ConditionBean]): Array[Int] = { doBatchUpdate(downcast(ls), downcast(op)) }

    protected def doLumpModifyNonstrict(ls: List[Entity], op: UpdateOption[_ <: ConditionBean]): Array[Int] =
    { doLumpModify(ls, op) }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param memberFollowingList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    def batchDelete(batchCall: (ScrBatchEntityList[MbleMemberFollowing]) => Unit)(implicit optionCall: (ScrDeleteOption[MemberFollowingCB]) => Unit = null): Array[Int] = {
        return doBatchDelete(callbackBatch(batchCall), callbackDeleteOption(optionCall));
    }

    protected def doBatchDelete(ls: List[DbleMemberFollowing], op: DeleteOption[MemberFollowingCB]): Array[Int] = {
        assertObjectNotNull("memberFollowingList", ls); prepareDeleteOption(op);
        return delegateBatchDelete(ls, op);
    }

    protected def doLumpRemove(ls: List[Entity], op: DeleteOption[_ <: ConditionBean]): Array[Int] = { doBatchDelete(downcast(ls), downcast(op)) }

    protected def doLumpRemoveNonstrict(ls: List[Entity], op: DeleteOption[_ <: ConditionBean]): Array[Int] =
    { return doLumpRemove(ls, op); }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * memberFollowingBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;DbleMemberFollowing, MemberFollowingCB&gt;() {
     *     public ConditionBean setup(memberFollowing entity, MemberFollowingCB intoCB) {
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
    def queryInsert(setupper: QueryInsertSetupper[DbleMemberFollowing, MemberFollowingCB]): Int = {
        return doQueryInsert(setupper, null);
    }

    protected def doQueryInsert(sp: QueryInsertSetupper[DbleMemberFollowing, MemberFollowingCB], op: InsertOption[MemberFollowingCB]): Int = {
        assertObjectNotNull("setupper", sp); prepareInsertOption(op);
        val et: DbleMemberFollowing = newEntity();
        val cb: MemberFollowingCB = createCBForQueryInsert();
        return delegateQueryInsert(et, cb, sp.setup(et, cb), op);
    }

    protected def createCBForQueryInsert(): MemberFollowingCB =
    { val cb: MemberFollowingCB = newConditionBean(); cb.xsetupForQueryInsert(); return cb; }

    protected def doRangeCreate(setupper: QueryInsertSetupper[_ <: Entity, _ <: ConditionBean], option: InsertOption[_ <: ConditionBean]): Int =
    { doQueryInsert(downcast(setupper), downcast(option)) }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * DbleMemberFollowing memberFollowing = new DbleMemberFollowing();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//memberFollowing.setPK...(value);</span>
     * memberFollowing.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//memberFollowing.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//memberFollowing.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//memberFollowing.setVersionNo(value);</span>
     * MemberFollowingCB cb = new MemberFollowingCB();
     * cb.query().setFoo...(value);
     * memberFollowingBhv.<span style="color: #DD4747">queryUpdate</span>(memberFollowing, cb);
     * </pre>
     * @param entityCall The callback for entity that contains update values. (NotNull)
     * @param cbCall The callback for condition-bean of MemberFollowing. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    def queryUpdate(entityCall: (MbleMemberFollowing) => Unit)(cbCall: (MemberFollowingCB) => Unit): Int = {
        assertObjectNotNull("entityCall", entityCall); assertObjectNotNull("cbCall", cbCall);
        return doQueryUpdate(callbackMbleEntityToDBable(entityCall), callbackCB(cbCall), null);
    }

    protected def doQueryUpdate(memberFollowing: DbleMemberFollowing, cb: MemberFollowingCB, op: UpdateOption[MemberFollowingCB]): Int = {
        assertObjectNotNull("memberFollowing", memberFollowing); assertCBStateValid(cb); prepareUpdateOption(op);
        return if (checkCountBeforeQueryUpdateIfNeeds(cb)) { delegateQueryUpdate(memberFollowing, cb, op) } else { 0 };
    }

    protected def doRangeModify(et: Entity, cb: ConditionBean, op: UpdateOption[_ <: ConditionBean]): Int =
    { doQueryUpdate(downcast(et), downcast(cb), downcast(op)) }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * MemberFollowingCB cb = new MemberFollowingCB();
     * cb.query().setFoo...(value);
     * memberFollowingBhv.<span style="color: #DD4747">queryDelete</span>(memberFollowing, cb);
     * </pre>
     * @param cbCall The callback for condition-bean of MemberFollowing. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    def queryDelete(cbCall: (MemberFollowingCB) => Unit): Int = {
        assertObjectNotNull("cbCall", cbCall);
        return doQueryDelete(callbackCB(cbCall), null);
    }

    protected def doQueryDelete(cb: MemberFollowingCB, op: DeleteOption[MemberFollowingCB]): Int = {
        assertCBStateValid(cb); prepareDeleteOption(op);
        return if (checkCountBeforeQueryUpdateIfNeeds(cb)) { delegateQueryDelete(cb, op) } else { 0 };
    }

    protected def doRangeRemove(cb: ConditionBean, op: DeleteOption[_ <: ConditionBean]): Int = { doQueryDelete(downcast(cb), downcast(op)) }

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
    def outsideSql(): ScrOutsideSqlBasicExecutor[MemberFollowingBhv] = {
        return toImmutableOutsideSqlBasicExecutor(doOutsideSql());
    }

    protected def toImmutableOutsideSqlBasicExecutor(executor: OutsideSqlBasicExecutor[MemberFollowingBhv]): ScrOutsideSqlBasicExecutor[MemberFollowingBhv] =
    { new ScrOutsideSqlBasicExecutor(executor) }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    protected def callbackCB(cbCall: (MemberFollowingCB) => Unit): MemberFollowingCB = {
        assertObjectNotNull("cbCall", cbCall);
        val cb = newConditionBean(); cbCall(cb); return cb;
    }

    protected def callbackBatch(batchCall: (ScrBatchEntityList[MbleMemberFollowing]) => Unit): List[DbleMemberFollowing] = {
        assertObjectNotNull("batchCall", batchCall);
        val batch = new ScrBatchEntityList[MbleMemberFollowing]();
        val entityList: List[DbleMemberFollowing] = new ArrayList[DbleMemberFollowing]();
        batch.entityCallList.asScala.map { entityCall =>
            val entity = newMbleEntity(); entityCall(entity); entity.toDBable;
        }
        return entityList;
    }

    protected def callbackMbleEntity(entityCall: (MbleMemberFollowing) => Unit): MbleMemberFollowing = {
        assertObjectNotNull("entityCall", entityCall);
        val entity = newMbleEntity(); entityCall(entity); return entity;
    }

    protected def callbackMbleEntityToDBable(entityCall: (MbleMemberFollowing) => Unit): DbleMemberFollowing = {
        return callbackMbleEntity(entityCall).toDBable;
    }

    protected def callbackInsertOption(optionCall: (ScrInsertOption[MemberFollowingCB]) => Unit): InsertOption[MemberFollowingCB] = {
        if (optionCall == null) { return null; }
        val option = new ScrInsertOption[MemberFollowingCB](new InsertOption[MemberFollowingCB]());
        optionCall(option); return option.toNative;
    }

    protected def callbackUpdateOption(optionCall: (ScrUpdateOption[MemberFollowingCB]) => Unit): UpdateOption[MemberFollowingCB] = {
        if (optionCall == null) { return null; }
        val option = new ScrUpdateOption[MemberFollowingCB](new UpdateOption[MemberFollowingCB]()); optionCall(option); return option.toNative;
    }

    protected def callbackDeleteOption(optionCall: (ScrDeleteOption[MemberFollowingCB]) => Unit): DeleteOption[MemberFollowingCB] = {
        if (optionCall == null) { return null; }
        val option = new ScrDeleteOption[MemberFollowingCB](new DeleteOption[MemberFollowingCB]()); optionCall(option); return option.toNative;
    }

    protected def callbackLoader(dbleList: List[DbleMemberFollowing], loaderCall: (LoaderOfMemberFollowing) => Unit = null): Unit = {
        if (loaderCall == null) { return; }
        val loader = new LoaderOfMemberFollowing();
        loader.ready(dbleList.asInstanceOf[List[DbleMemberFollowing]], _behaviorSelector);
        loaderCall(loader);
    }

    protected def newMbleEntity(): MbleMemberFollowing = { new MbleMemberFollowing() }
    protected def newPagingView(rb: PagingResultBean[DbleMemberFollowing]): ScrPagingView[MemberFollowing] =
    { new ScrPagingView(toImmutableEntityList(rb), rb) }

    protected def typeOfSelectedEntity(): Class[DbleMemberFollowing] = { classOf[DbleMemberFollowing] }
    protected def downcast(et: Entity): DbleMemberFollowing = { helpEntityDowncastInternally(et, classOf[DbleMemberFollowing]) }
    protected def downcast(cb: ConditionBean): MemberFollowingCB = { helpConditionBeanDowncastInternally(cb, classOf[MemberFollowingCB]) }
    protected def downcast(ls: List[_ <: Entity]): List[DbleMemberFollowing] = { ls.asInstanceOf[List[DbleMemberFollowing]] }
    protected def downcast(op: InsertOption[_ <: ConditionBean]): InsertOption[MemberFollowingCB] = { op.asInstanceOf[InsertOption[MemberFollowingCB]] }
    protected def downcast(op: UpdateOption[_ <: ConditionBean]): UpdateOption[MemberFollowingCB] = { op.asInstanceOf[UpdateOption[MemberFollowingCB]] }
    protected def downcast(op: DeleteOption[_ <: ConditionBean]): DeleteOption[MemberFollowingCB] = { op.asInstanceOf[DeleteOption[MemberFollowingCB]] }
    protected def downcast(sp: QueryInsertSetupper[_ <: Entity, _ <: ConditionBean]): QueryInsertSetupper[DbleMemberFollowing, MemberFollowingCB] =
    { sp.asInstanceOf[QueryInsertSetupper[DbleMemberFollowing, MemberFollowingCB]] }

    // ===================================================================================
    //                                                                        Scala Helper
    //                                                                        ============
    protected def toScalaList[ENTITY](javaList: Collection[ENTITY]): immutable.List[ENTITY] = {
        if (javaList == null) { immutable.List() }
        return immutable.List.fromArray(javaList.toArray()).asInstanceOf[immutable.List[ENTITY]];
    }

    def toImmutableEntityList(dbleList: Collection[DbleMemberFollowing]): immutable.List[MemberFollowing] =
    { toScalaList(dbleList).map(new MemberFollowing(_)) }

    def toDBableEntityList(immuList: immutable.List[MemberFollowing]): List[DbleMemberFollowing] =
    { immuList.map(new DbleMemberFollowing().acceptImmutable(_)).asJava }
}
