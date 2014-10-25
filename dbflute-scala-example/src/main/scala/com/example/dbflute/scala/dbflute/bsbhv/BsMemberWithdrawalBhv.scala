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
 * The behavior of (会員退会情報)MEMBER_WITHDRAWAL as TABLE. <br />
 * <pre>
 * [primary key]
 *     MEMBER_ID
 *
 * [column]
 *     MEMBER_ID, WITHDRAWAL_REASON_CODE, WITHDRAWAL_REASON_INPUT_TEXT, WITHDRAWAL_DATETIME, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     MEMBER, WITHDRAWAL_REASON
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     member, withdrawalReason
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
abstract class BsMemberWithdrawalBhv extends AbstractBehaviorWritable[DbleMemberWithdrawal, MemberWithdrawalCB] {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    def getDBMeta(): DBMeta = { return MemberWithdrawalDbm; }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    def newConditionBean(): MemberWithdrawalCB = { return new MemberWithdrawalCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * MemberWithdrawalCB cb = new MemberWithdrawalCB();
     * cb.query().setFoo...(value);
     * int count = memberWithdrawalBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of DbleMemberWithdrawal. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    def selectCount(cbCall: (MemberWithdrawalCB) => Unit): Int = {
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
     * MemberWithdrawalCB cb = new MemberWithdrawalCB();
     * cb.query().setFoo...(value);
     * OptionalEntity&lt;DbleMemberWithdrawal&gt; entity = memberWithdrawalBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     *
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * entity.<span style="color: #DD4747">required</span>(memberWithdrawal -&gt; {
     *     ...
     * });
     * DbleMemberWithdrawal memberWithdrawal = entity.entity.<span style="color: #DD4747">get()</span>;
     *
     * <span style="color: #3F7E5E">// if it might be no data, ifPresent(), isPresent(), ...</span>
     * entity.<span style="color: #DD4747">ifPresent</span>(memberWithdrawal -&gt; {
     *     ...
     * });
     * if (entity.entity.<span style="color: #DD4747">isPresent()</span>) {
     *     DbleMemberWithdrawal memberWithdrawal = entity.entity.<span style="color: #DD4747">get()</span>;
     * } else {
     *     ...
     * }
     * </pre>
     * @param cbCall The callback for condition-bean of MemberWithdrawal. (NotNull)
     * @param loaderCall The callback for referrer loader of MemberWithdrawal. (NoArgAllowed: then no loading)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get() of return value is called and the value is null, which means entity has already been deleted (point is not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    def selectEntity(cbCall: (MemberWithdrawalCB) => Unit)(implicit loaderCall: (LoaderOfMemberWithdrawal) => Unit = null): Option[MemberWithdrawal] = {
        return facadeSelectEntity(callbackCB(cbCall))(loaderCall).map(_.toImmutable);
    }

    protected def facadeSelectEntity(cb: MemberWithdrawalCB)(loaderCall: (LoaderOfMemberWithdrawal) => Unit = null): Option[DbleMemberWithdrawal] = {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity())(loaderCall);
    }

    protected def doSelectEntity[ENTITY <: DbleMemberWithdrawal](cb: MemberWithdrawalCB, tp: Class[_ <: ENTITY])(loaderCall: (LoaderOfMemberWithdrawal) => Unit = null): ENTITY = {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        val dble = helpSelectEntityInternally(cb, tp);
        if (dble != null) {
            callbackLoader(DfCollectionUtil.newArrayList(dble.asInstanceOf[DbleMemberWithdrawal]), loaderCall);
        }
        return dble;
    }

    protected def doSelectOptionalEntity[ENTITY <: DbleMemberWithdrawal](cb: MemberWithdrawalCB, tp: Class[_ <: ENTITY])(loaderCall: (LoaderOfMemberWithdrawal) => Unit = null): Option[ENTITY] = {
        return Option.apply(doSelectEntity(cb, tp)(loaderCall));
    }

    override protected def doReadEntity(cb: ConditionBean): Entity = { facadeSelectEntity(downcast(cb))().orNull }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * MemberWithdrawalCB cb = new MemberWithdrawalCB();
     * cb.query().setFoo...(value);
     * DbleMemberWithdrawal memberWithdrawal = memberWithdrawalBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = memberWithdrawal.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbCall The callback for condition-bean of MemberWithdrawal. (NotNull)
     * @param loaderCall The callback for referrer loader of MemberWithdrawal. (NoArgAllowed: then no loading)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (point is not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    def selectEntityWithDeletedCheck(cbCall: (MemberWithdrawalCB) => Unit)(implicit loaderCall: (LoaderOfMemberWithdrawal) => Unit = null): MemberWithdrawal = {
        return facadeSelectEntityWithDeletedCheck(callbackCB(cbCall))(loaderCall).toImmutable;
    }

    protected def facadeSelectEntityWithDeletedCheck(cb: MemberWithdrawalCB)(loaderCall: (LoaderOfMemberWithdrawal) => Unit = null): DbleMemberWithdrawal = {
        return doSelectEntityWithDeletedCheck(cb, typeOfSelectedEntity())(loaderCall);
    }

    protected def doSelectEntityWithDeletedCheck[ENTITY <: DbleMemberWithdrawal](cb: MemberWithdrawalCB, tp: Class[ENTITY])(loaderCall: (LoaderOfMemberWithdrawal) => Unit = null): ENTITY = {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        val dble = helpSelectEntityWithDeletedCheckInternally(cb, tp);
        callbackLoader(DfCollectionUtil.newArrayList(dble.asInstanceOf[DbleMemberWithdrawal]), loaderCall);
        return dble;
    }

    override protected def doReadEntityWithDeletedCheck(cb: ConditionBean): Entity = { facadeSelectEntityWithDeletedCheck(downcast(cb))() }

    /**
     * Select the entity by the primary-key value.
     * @param memberId : PK, NotNull, INTEGER(10), FK to MEMBER. (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    def selectByPK(memberId: Integer): Option[MemberWithdrawal] = {
        return facadeSelectByPK(memberId).map(_.toImmutable);
    }

    protected def facadeSelectByPK(memberId: Integer): Option[DbleMemberWithdrawal] = {
        return doSelectByPK(memberId, typeOfSelectedEntity());
    }

    protected def doSelectByPK[ENTITY <: DbleMemberWithdrawal](memberId: Integer, tp: Class[_ <: ENTITY]): Option[ENTITY] = {
        return Option.apply(doSelectEntity(xprepareCBAsPK(memberId), tp)());
    }

    protected def xprepareCBAsPK(memberId: Integer): MemberWithdrawalCB = {
        assertObjectNotNull("memberId", memberId);
        return newConditionBean().acceptPK(memberId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * MemberWithdrawalCB cb = new MemberWithdrawalCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * List&lt;${MemberWithdrawal}&gt; memberWithdrawalList = memberWithdrawalBhv.<span style="color: #DD4747">selectList</span>(cb);
     * memberWithdrawalList.foreach(memberWithdrawal =>
     *     ... = memberWithdrawal...;
     * }
     * </pre>
     * @param cbCall The callback for condition-bean of MemberWithdrawal. (NotNull)
     * @param loaderCall The callback for referrer loader of MemberWithdrawal. (NoArgAllowed: then no loading)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    def selectList(cbCall: (MemberWithdrawalCB) => Unit)(implicit loaderCall: (LoaderOfMemberWithdrawal) => Unit = null): immutable.List[MemberWithdrawal] = {
        return toImmutableEntityList(facadeSelectList(callbackCB(cbCall))(loaderCall));
    }

    protected def facadeSelectList(cb: MemberWithdrawalCB)(loaderCall: (LoaderOfMemberWithdrawal) => Unit = null): ListResultBean[DbleMemberWithdrawal] = {
        return doSelectList(cb, typeOfSelectedEntity())(loaderCall);
    }

    protected def doSelectList[RESULT <: DbleMemberWithdrawal](cb: MemberWithdrawalCB, tp: Class[RESULT])(loaderCall: (LoaderOfMemberWithdrawal) => Unit = null): ListResultBean[RESULT] = {
        val dbleList = helpSelectListInternally(cb, tp);
        callbackLoader(dbleList.asInstanceOf[List[DbleMemberWithdrawal]], loaderCall);
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
     * MemberWithdrawalCB cb = new MemberWithdrawalCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;DbleMemberWithdrawal&gt; page = memberWithdrawalBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (DbleMemberWithdrawal memberWithdrawal : page) {
     *     ... = memberWithdrawal.get...();
     * }
     * </pre>
     * @param cbCall The callback for condition-bean of MemberWithdrawal. (NotNull)
     * @param loaderCall The callback for referrer loader of MemberWithdrawal. (NoArgAllowed: then no loading)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    def selectPage(cbCall: (MemberWithdrawalCB) => Unit)(implicit loaderCall: (LoaderOfMemberWithdrawal) => Unit = null): ScrPagingView[MemberWithdrawal] = {
        return newPagingView(facadeSelectPage(callbackCB(cbCall))(loaderCall));
    }

    protected def facadeSelectPage(cb: MemberWithdrawalCB)(loaderCall: (LoaderOfMemberWithdrawal) => Unit = null): PagingResultBean[DbleMemberWithdrawal] = {
        return doSelectPage(cb, typeOfSelectedEntity())(loaderCall);
    }

    protected def doSelectPage[RESULT <: DbleMemberWithdrawal](cb: MemberWithdrawalCB, tp: Class[RESULT])(loaderCall: (LoaderOfMemberWithdrawal) => Unit = null): PagingResultBean[RESULT] = {
        val dbleList = helpSelectPageInternally(cb, tp);
        callbackLoader(dbleList.asInstanceOf[List[DbleMemberWithdrawal]], loaderCall);
        return dbleList;
    }

    override protected def doReadPage(cb: ConditionBean): PagingResultBean[_ <: Entity] = { facadeSelectPage(downcast(cb))() }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * MemberWithdrawalCB cb = new MemberWithdrawalCB();
     * cb.query().setFoo...(value);
     * memberWithdrawalBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;DbleMemberWithdrawal&gt;() {
     *     public void handle(DbleMemberWithdrawal entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of DbleMemberWithdrawal. (NotNull)
     * @param entityRowHandler The handler of entity row of DbleMemberWithdrawal. (NotNull)
     */
    def selectCursor(cbCall: (MemberWithdrawalCB) => Unit)(rowCall: (MemberWithdrawal) => Unit): Unit = {
        facadeSelectCursor(callbackCB(cbCall), new EntityRowHandler[DbleMemberWithdrawal]() {
            def handle(entity: DbleMemberWithdrawal): Unit = { rowCall(entity.toImmutable) }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * memberWithdrawalBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(MemberWithdrawalCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    def scalarSelect[RESULT](resultType: Class[RESULT]): ScrHpSLSFunction[MemberWithdrawalCB, RESULT] = {
        return toScalaSLSFunction[RESULT](facadeScalarSelect(resultType));
    }

    protected def toScalaSLSFunction[RESULT](function: HpSLSFunction[MemberWithdrawalCB, RESULT]): ScrHpSLSFunction[MemberWithdrawalCB, RESULT] =
    { new ScrHpSLSFunction[MemberWithdrawalCB, RESULT](function) }

    // ===================================================================================
    //                                                                            Sequence
    //                                                                            ========
    override protected def doReadNextVal(): Number = {
        val msg: String = "This table is NOT related to sequence: " + getTableDbName();
        throw new UnsupportedOperationException(msg);
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'DbleMember'.
     * @param memberWithdrawalList The list of memberWithdrawal. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    def pulloutMember(memberWithdrawalList: immutable.List[MemberWithdrawal]): immutable.List[Member] = {
        val dbleList = helpPulloutInternally(toDBableEntityList(memberWithdrawalList), "member");
        return toScalaList(dbleList).map(new Member(_));
    }

    /**
     * Pull out the list of foreign table 'DbleWithdrawalReason'.
     * @param memberWithdrawalList The list of memberWithdrawal. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    def pulloutWithdrawalReason(memberWithdrawalList: immutable.List[MemberWithdrawal]): immutable.List[WithdrawalReason] = {
        val dbleList = helpPulloutInternally(toDBableEntityList(memberWithdrawalList), "withdrawalReason");
        return toScalaList(dbleList).map(new WithdrawalReason(_));
    }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key memberId.
     * @param memberWithdrawalList The list of memberWithdrawal. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    def extractMemberIdList(memberWithdrawalList: immutable.List[MemberWithdrawal]): immutable.List[Int] = {
        val plainList = helpExtractListInternally(toDBableEntityList(memberWithdrawalList), "memberId");
        return toScalaList(plainList).map(_.asInstanceOf[Int]);
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * DbleMemberWithdrawal memberWithdrawal = new DbleMemberWithdrawal();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * memberWithdrawal.setFoo...(value);
     * memberWithdrawal.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//memberWithdrawal.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//memberWithdrawal.set...;</span>
     * memberWithdrawalBhv.<span style="color: #DD4747">insert</span>(memberWithdrawal);
     * ... = memberWithdrawal.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param entityCall The callback for entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param optionCall The callback for option of insert. (NoArgAllowed: then no option)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    def insert(entityCall: (MbleMemberWithdrawal) => Unit)(implicit optionCall: (ScrInsertOption[MemberWithdrawalCB]) => Unit = null): Unit = {
        assertObjectNotNull("entityCall", entityCall);
        doInsert(callbackMbleEntityToDBable(entityCall), callbackInsertOption(optionCall));
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl)
     * <pre>
     * DbleMemberWithdrawal memberWithdrawal = new DbleMemberWithdrawal();
     * memberWithdrawal.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * memberWithdrawal.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//memberWithdrawal.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//memberWithdrawal.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * memberWithdrawal.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     memberWithdrawalBhv.<span style="color: #DD4747">update</span>(memberWithdrawal);
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
    def update(entityCall: (MbleMemberWithdrawal) => Unit)(implicit optionCall: (ScrUpdateOption[MemberWithdrawalCB]) => Unit = null): Unit = {
        assertObjectNotNull("entityCall", entityCall);
        doUpdate(callbackMbleEntityToDBable(entityCall), callbackUpdateOption(optionCall));
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * DbleMemberWithdrawal memberWithdrawal = new DbleMemberWithdrawal();
     * memberWithdrawal.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * memberWithdrawal.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//memberWithdrawal.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//memberWithdrawal.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//memberWithdrawal.setVersionNo(value);</span>
     * memberWithdrawalBhv.<span style="color: #DD4747">updateNonstrict</span>(memberWithdrawal);
     * </pre>
     * @param entityCall The callback for entity of update. (NotNull, PrimaryKeyNotNull)
     * @param optionCall The callback for option of update. (NoArgAllowed: then no option)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    def updateNonstrict(entityCall: (MbleMemberWithdrawal) => Unit)(implicit optionCall: (ScrUpdateOption[MemberWithdrawalCB]) => Unit = null): Unit = {
        doUpdateNonstrict(callbackMbleEntityToDBable(entityCall), callbackUpdateOption(optionCall));
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
    def insertOrUpdate(entityCall: (MbleMemberWithdrawal) => Unit)(implicit insertOptionCall: (ScrInsertOption[MemberWithdrawalCB]) => Unit = null, updateOptionCall: (ScrUpdateOption[MemberWithdrawalCB]) => Unit = null): Unit = {
        doInsertOrUpdate(callbackMbleEntityToDBable(entityCall), callbackInsertOption(insertOptionCall), callbackUpdateOption(updateOptionCall));
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
    def insertOrUpdateNonstrict(entityCall: (MbleMemberWithdrawal) => Unit)(implicit insertOptionCall: (ScrInsertOption[MemberWithdrawalCB]) => Unit = null, updateOptionCall: (ScrUpdateOption[MemberWithdrawalCB]) => Unit = null): Unit = {
        doInsertOrUpdateNonstrict(callbackMbleEntityToDBable(entityCall), callbackInsertOption(insertOptionCall), callbackUpdateOption(updateOptionCall));
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl)
     * <pre>
     * DbleMemberWithdrawal memberWithdrawal = new DbleMemberWithdrawal();
     * memberWithdrawal.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * memberWithdrawal.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     memberWithdrawalBhv.<span style="color: #DD4747">delete</span>(memberWithdrawal);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param entityCall The callback for entity of delete. (NotNull, PrimaryKeyNotNull)
     * @param optionCall The callback for option of delete. (NoArgAllowed: then no option)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    def delete(entityCall: (MbleMemberWithdrawal) => Unit)(implicit optionCall: (ScrDeleteOption[MemberWithdrawalCB]) => Unit = null): Unit = {
        doDelete(callbackMbleEntityToDBable(entityCall), callbackDeleteOption(optionCall));
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * DbleMemberWithdrawal memberWithdrawal = new DbleMemberWithdrawal();
     * memberWithdrawal.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//memberWithdrawal.setVersionNo(value);</span>
     * memberWithdrawalBhv.<span style="color: #DD4747">deleteNonstrict</span>(memberWithdrawal);
     * </pre>
     * @param entityCall The callback for entity of delete. (NotNull, PrimaryKeyNotNull)
     * @param optionCall The callback for option of delete. (NoArgAllowed: then no option)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    def deleteNonstrict(entityCall: (MbleMemberWithdrawal) => Unit)(implicit optionCall: (ScrDeleteOption[MemberWithdrawalCB]) => Unit = null): Unit = {
        doDeleteNonstrict(callbackMbleEntityToDBable(entityCall), callbackDeleteOption(optionCall));
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
     *     DbleMemberWithdrawal memberWithdrawal = new DbleMemberWithdrawal();
     *     memberWithdrawal.setFooName("foo");
     *     if (...) {
     *         memberWithdrawal.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     memberWithdrawalList.add(memberWithdrawal);
     * }
     * memberWithdrawalBhv.<span style="color: #DD4747">batchInsert</span>(memberWithdrawalList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param memberWithdrawalList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    def batchInsert(batchCall: (ScrBatchEntityList[MbleMemberWithdrawal]) => Unit)(implicit optionCall: (ScrInsertOption[MemberWithdrawalCB]) => Unit = null): Array[Int] = {
        return doBatchInsert(callbackBatch(batchCall), callbackInsertOption(optionCall));
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     DbleMemberWithdrawal memberWithdrawal = new DbleMemberWithdrawal();
     *     memberWithdrawal.setFooName("foo");
     *     if (...) {
     *         memberWithdrawal.setFooPrice(123);
     *     } else {
     *         memberWithdrawal.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//memberWithdrawal.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     memberWithdrawalList.add(memberWithdrawal);
     * }
     * memberWithdrawalBhv.<span style="color: #DD4747">batchUpdate</span>(memberWithdrawalList);
     * </pre>
     * @param memberWithdrawalList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    def batchUpdate(batchCall: (ScrBatchEntityList[MbleMemberWithdrawal]) => Unit)(implicit optionCall: (ScrUpdateOption[MemberWithdrawalCB]) => Unit = null): Array[Int] = {
        return doBatchUpdate(callbackBatch(batchCall), callbackUpdateOption(optionCall));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     DbleMemberWithdrawal memberWithdrawal = new DbleMemberWithdrawal();
     *     memberWithdrawal.setFooName("foo");
     *     if (...) {
     *         memberWithdrawal.setFooPrice(123);
     *     } else {
     *         memberWithdrawal.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//memberWithdrawal.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     memberWithdrawalList.add(memberWithdrawal);
     * }
     * memberWithdrawalBhv.<span style="color: #DD4747">batchUpdate</span>(memberWithdrawalList);
     * </pre>
     * @param memberWithdrawalList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    def batchUpdateNonstrict(batchCall: (ScrBatchEntityList[MbleMemberWithdrawal]) => Unit)(implicit optionCall: (ScrUpdateOption[MemberWithdrawalCB]) => Unit = null): Array[Int] = {
        return doBatchUpdateNonstrict(callbackBatch(batchCall), callbackUpdateOption(optionCall));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param memberWithdrawalList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    def batchDelete(batchCall: (ScrBatchEntityList[MbleMemberWithdrawal]) => Unit)(implicit optionCall: (ScrDeleteOption[MemberWithdrawalCB]) => Unit = null): Array[Int] = {
        return doBatchDelete(callbackBatch(batchCall), callbackDeleteOption(optionCall));
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param memberWithdrawalList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    def batchDeleteNonstrict(batchCall: (ScrBatchEntityList[MbleMemberWithdrawal]) => Unit)(implicit optionCall: (ScrDeleteOption[MemberWithdrawalCB]) => Unit = null): Array[Int] = {
        return doBatchDeleteNonstrict(callbackBatch(batchCall), callbackDeleteOption(optionCall));
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * memberWithdrawalBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;DbleMemberWithdrawal, MemberWithdrawalCB&gt;() {
     *     public ConditionBean setup(DbleMemberWithdrawal entity, MemberWithdrawalCB intoCB) {
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
    def queryInsert(setupperCall: (MbleMemberWithdrawal, MemberWithdrawalCB) => ConditionBean): Int = {
        return doQueryInsert(callbackQueryInsertSetupper(setupperCall), null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * DbleMemberWithdrawal memberWithdrawal = new DbleMemberWithdrawal();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//memberWithdrawal.setPK...(value);</span>
     * memberWithdrawal.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//memberWithdrawal.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//memberWithdrawal.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//memberWithdrawal.setVersionNo(value);</span>
     * MemberWithdrawalCB cb = new MemberWithdrawalCB();
     * cb.query().setFoo...(value);
     * memberWithdrawalBhv.<span style="color: #DD4747">queryUpdate</span>(memberWithdrawal, cb);
     * </pre>
     * @param entityCall The callback for entity that contains update values. (NotNull)
     * @param cbCall The callback for condition-bean of MemberWithdrawal. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    def queryUpdate(entityCall: (MbleMemberWithdrawal) => Unit)(cbCall: (MemberWithdrawalCB) => Unit): Int = {
        assertObjectNotNull("entityCall", entityCall); assertObjectNotNull("cbCall", cbCall);
        return doQueryUpdate(callbackMbleEntityToDBable(entityCall), callbackCB(cbCall), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * MemberWithdrawalCB cb = new MemberWithdrawalCB();
     * cb.query().setFoo...(value);
     * memberWithdrawalBhv.<span style="color: #DD4747">queryDelete</span>(memberWithdrawal, cb);
     * </pre>
     * @param cbCall The callback for condition-bean of MemberWithdrawal. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    def queryDelete(cbCall: (MemberWithdrawalCB) => Unit): Int = {
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
    def outsideSql(): ScrOutsideSqlTypedBasicExecutor[MemberWithdrawalBhv] = {
        val facadeExecutor: OutsideSqlAllFacadeExecutor[MemberWithdrawalBhv] = doOutsideSql();
        return toImmutableOutsideSqlTypedBasicExecutor(facadeExecutor.xbasicExecutor()); // variable to resolve generic type
    }

    protected def toImmutableOutsideSqlTypedBasicExecutor(executor: OutsideSqlBasicExecutor[MemberWithdrawalBhv]): ScrOutsideSqlTypedBasicExecutor[MemberWithdrawalBhv] =
    { new ScrOutsideSqlTypedBasicExecutor(executor) }

    // ===================================================================================
    //                                                                Optimistic Lock Info
    //                                                                ====================
    override protected def hasVersionNoValue(et: Entity): Boolean = {
        return downcast(et).getVersionNo() != null;
    }

    // ===================================================================================
    //                                                                     Callback Helper
    //                                                                     ===============
    protected def callbackCB(cbCall: (MemberWithdrawalCB) => Unit): MemberWithdrawalCB = {
        assertObjectNotNull("cbCall", cbCall);
        val cb = newConditionBean(); cbCall(cb); return cb;
    }

    protected def callbackBatch(batchCall: (ScrBatchEntityList[MbleMemberWithdrawal]) => Unit): List[DbleMemberWithdrawal] = {
        assertObjectNotNull("batchCall", batchCall);
        val batch = new ScrBatchEntityList[MbleMemberWithdrawal]();
        val entityList: List[DbleMemberWithdrawal] = new ArrayList[DbleMemberWithdrawal]();
        batch.entityCallList.asScala.map { entityCall =>
            val entity = newMbleEntity(); entityCall(entity); entity.toDBable;
        }
        return entityList;
    }

    protected def callbackMbleEntity(entityCall: (MbleMemberWithdrawal) => Unit): MbleMemberWithdrawal = {
        assertObjectNotNull("entityCall", entityCall);
        val entity = newMbleEntity(); entityCall(entity); return entity;
    }

    protected def callbackMbleEntityToDBable(entityCall: (MbleMemberWithdrawal) => Unit): DbleMemberWithdrawal = {
        return callbackMbleEntity(entityCall).toDBable;
    }

    protected def callbackInsertOption(optionCall: (ScrInsertOption[MemberWithdrawalCB]) => Unit): InsertOption[MemberWithdrawalCB] = {
        if (optionCall == null) { return null; }
        val option = new ScrInsertOption[MemberWithdrawalCB](new InsertOption[MemberWithdrawalCB]());
        optionCall(option); return option.toNative;
    }

    protected def callbackUpdateOption(optionCall: (ScrUpdateOption[MemberWithdrawalCB]) => Unit): UpdateOption[MemberWithdrawalCB] = {
        if (optionCall == null) { return null; }
        val option = new ScrUpdateOption[MemberWithdrawalCB](new UpdateOption[MemberWithdrawalCB]()); optionCall(option); return option.toNative;
    }

    protected def callbackDeleteOption(optionCall: (ScrDeleteOption[MemberWithdrawalCB]) => Unit): DeleteOption[MemberWithdrawalCB] = {
        if (optionCall == null) { return null; }
        val option = new ScrDeleteOption[MemberWithdrawalCB](new DeleteOption[MemberWithdrawalCB]()); optionCall(option); return option.toNative;
    }

    protected def callbackQueryInsertSetupper(setupperCall: (MbleMemberWithdrawal, MemberWithdrawalCB) => ConditionBean): QueryInsertSetupper[DbleMemberWithdrawal, MemberWithdrawalCB] = {
        assertObjectNotNull("setupperCall", setupperCall);
        return new QueryInsertSetupper[DbleMemberWithdrawal, MemberWithdrawalCB]() {
            def setup(entity: DbleMemberWithdrawal, intoCB: MemberWithdrawalCB): ConditionBean = {
                val mble = newMbleEntity();
                val resultCB = setupperCall(mble, intoCB);
                entity.acceptImmutable(mble.toImmutable());
                return resultCB;
            }
        };
    }

    protected def callbackLoader(dbleList: List[DbleMemberWithdrawal], loaderCall: (LoaderOfMemberWithdrawal) => Unit = null): Unit = {
        if (loaderCall == null) { return; }
        val loader = new LoaderOfMemberWithdrawal();
        loader.ready(dbleList.asInstanceOf[List[DbleMemberWithdrawal]], _behaviorSelector);
        loaderCall(loader);
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    override protected def typeOfSelectedEntity(): Class[DbleMemberWithdrawal] = { classOf[DbleMemberWithdrawal] }
    override protected def typeOfHandlingEntity(): Class[DbleMemberWithdrawal] = { classOf[DbleMemberWithdrawal] }
    override protected def typeOfHandlingConditionBean(): Class[MemberWithdrawalCB] = { classOf[MemberWithdrawalCB] }
    protected def newMbleEntity(): MbleMemberWithdrawal = { new MbleMemberWithdrawal() }
    protected def newPagingView(rb: PagingResultBean[DbleMemberWithdrawal]): ScrPagingView[MemberWithdrawal] =
    { new ScrPagingView(toImmutableEntityList(rb), rb) }

    // ===================================================================================
    //                                                                        Scala Helper
    //                                                                        ============
    protected def toScalaList[ENTITY](javaList: Collection[ENTITY]): immutable.List[ENTITY] = {
        if (javaList == null) { immutable.List() }
        return javaList.toArray.toList.asInstanceOf[immutable.List[ENTITY]];
    }

    def toImmutableEntityList(dbleList: Collection[DbleMemberWithdrawal]): immutable.List[MemberWithdrawal] =
    { toScalaList(dbleList).map(new MemberWithdrawal(_)) }

    def toDBableEntityList(immuList: immutable.List[MemberWithdrawal]): List[DbleMemberWithdrawal] =
    { immuList.map(new DbleMemberWithdrawal().acceptImmutable(_)).asJava }
}
