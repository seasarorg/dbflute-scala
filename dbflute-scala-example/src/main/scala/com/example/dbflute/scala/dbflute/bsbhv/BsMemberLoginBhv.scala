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
 * The behavior of (会員ログイン)MEMBER_LOGIN as TABLE. <br />
 * <pre>
 * [primary key]
 *     MEMBER_LOGIN_ID
 *
 * [column]
 *     MEMBER_LOGIN_ID, MEMBER_ID, LOGIN_DATETIME, MOBILE_LOGIN_FLG, LOGIN_MEMBER_STATUS_CODE
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MEMBER_LOGIN_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     MEMBER_STATUS, MEMBER
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     memberStatus, member
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
abstract class BsMemberLoginBhv extends AbstractBehaviorWritable[DbleMemberLogin, MemberLoginCB] {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    def getDBMeta(): DBMeta = { return MemberLoginDbm; }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    def newConditionBean(): MemberLoginCB = { return new MemberLoginCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * MemberLoginCB cb = new MemberLoginCB();
     * cb.query().setFoo...(value);
     * int count = memberLoginBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of DbleMemberLogin. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    def selectCount(cbCall: (MemberLoginCB) => Unit): Int = {
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
     * MemberLoginCB cb = new MemberLoginCB();
     * cb.query().setFoo...(value);
     * OptionalEntity&lt;DbleMemberLogin&gt; entity = memberLoginBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     *
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * entity.<span style="color: #DD4747">required</span>(memberLogin -&gt; {
     *     ...
     * });
     * DbleMemberLogin memberLogin = entity.entity.<span style="color: #DD4747">get()</span>;
     *
     * <span style="color: #3F7E5E">// if it might be no data, ifPresent(), isPresent(), ...</span>
     * entity.<span style="color: #DD4747">ifPresent</span>(memberLogin -&gt; {
     *     ...
     * });
     * if (entity.entity.<span style="color: #DD4747">isPresent()</span>) {
     *     DbleMemberLogin memberLogin = entity.entity.<span style="color: #DD4747">get()</span>;
     * } else {
     *     ...
     * }
     * </pre>
     * @param cbCall The callback for condition-bean of MemberLogin. (NotNull)
     * @param loaderCall The callback for referrer loader of MemberLogin. (NoArgAllowed: then no loading)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get() of return value is called and the value is null, which means entity has already been deleted (point is not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    def selectEntity(cbCall: (MemberLoginCB) => Unit)(implicit loaderCall: (LoaderOfMemberLogin) => Unit = null): Option[MemberLogin] = {
        return facadeSelectEntity(callbackCB(cbCall))(loaderCall).map(_.toImmutable);
    }

    protected def facadeSelectEntity(cb: MemberLoginCB)(loaderCall: (LoaderOfMemberLogin) => Unit = null): Option[DbleMemberLogin] = {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity())(loaderCall);
    }

    protected def doSelectEntity[ENTITY <: DbleMemberLogin](cb: MemberLoginCB, tp: Class[_ <: ENTITY])(loaderCall: (LoaderOfMemberLogin) => Unit = null): ENTITY = {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        val dble = helpSelectEntityInternally(cb, tp);
        if (dble != null) {
            callbackLoader(DfCollectionUtil.newArrayList(dble.asInstanceOf[DbleMemberLogin]), loaderCall);
        }
        return dble;
    }

    protected def doSelectOptionalEntity[ENTITY <: DbleMemberLogin](cb: MemberLoginCB, tp: Class[_ <: ENTITY])(loaderCall: (LoaderOfMemberLogin) => Unit = null): Option[ENTITY] = {
        return Option.apply(doSelectEntity(cb, tp)(loaderCall));
    }

    override protected def doReadEntity(cb: ConditionBean): Entity = { facadeSelectEntity(downcast(cb))().orNull }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * MemberLoginCB cb = new MemberLoginCB();
     * cb.query().setFoo...(value);
     * DbleMemberLogin memberLogin = memberLoginBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = memberLogin.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbCall The callback for condition-bean of MemberLogin. (NotNull)
     * @param loaderCall The callback for referrer loader of MemberLogin. (NoArgAllowed: then no loading)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (point is not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    def selectEntityWithDeletedCheck(cbCall: (MemberLoginCB) => Unit)(implicit loaderCall: (LoaderOfMemberLogin) => Unit = null): MemberLogin = {
        return facadeSelectEntityWithDeletedCheck(callbackCB(cbCall))(loaderCall).toImmutable;
    }

    protected def facadeSelectEntityWithDeletedCheck(cb: MemberLoginCB)(loaderCall: (LoaderOfMemberLogin) => Unit = null): DbleMemberLogin = {
        return doSelectEntityWithDeletedCheck(cb, typeOfSelectedEntity())(loaderCall);
    }

    protected def doSelectEntityWithDeletedCheck[ENTITY <: DbleMemberLogin](cb: MemberLoginCB, tp: Class[ENTITY])(loaderCall: (LoaderOfMemberLogin) => Unit = null): ENTITY = {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        val dble = helpSelectEntityWithDeletedCheckInternally(cb, tp);
        callbackLoader(DfCollectionUtil.newArrayList(dble.asInstanceOf[DbleMemberLogin]), loaderCall);
        return dble;
    }

    override protected def doReadEntityWithDeletedCheck(cb: ConditionBean): Entity = { facadeSelectEntityWithDeletedCheck(downcast(cb))() }

    /**
     * Select the entity by the primary-key value.
     * @param memberLoginId (会員ログインID): PK, ID, NotNull, BIGINT(19). (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    def selectByPK(memberLoginId: Long): Option[MemberLogin] = {
        return facadeSelectByPK(memberLoginId).map(_.toImmutable);
    }

    protected def facadeSelectByPK(memberLoginId: Long): Option[DbleMemberLogin] = {
        return doSelectByPK(memberLoginId, typeOfSelectedEntity());
    }

    protected def doSelectByPK[ENTITY <: DbleMemberLogin](memberLoginId: Long, tp: Class[_ <: ENTITY]): Option[ENTITY] = {
        return Option.apply(doSelectEntity(xprepareCBAsPK(memberLoginId), tp)());
    }

    protected def xprepareCBAsPK(memberLoginId: Long): MemberLoginCB = {
        assertObjectNotNull("memberLoginId", memberLoginId);
        return newConditionBean().acceptPK(memberLoginId);
    }

    /**
     * Select the entity by the unique-key value.
     * @param memberId (会員ID): UQ+, IX, NotNull, INTEGER(10), FK to MEMBER. (NotNull)
     * @param loginDatetime (ログイン日時): +UQ, IX, NotNull, TIMESTAMP(23, 10). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    def selectByUniqueOf(memberId: Integer, loginDatetime: org.joda.time.LocalDateTime): Option[MemberLogin] = {
        return facadeSelectByUniqueOf(memberId, loginDatetime).map(_.toImmutable);
    }

    protected def facadeSelectByUniqueOf(memberId: Integer, loginDatetime: org.joda.time.LocalDateTime): Option[DbleMemberLogin] = {
        return doSelectByUniqueOf(memberId, loginDatetime, typeOfSelectedEntity());
    }

    protected def doSelectByUniqueOf[ENTITY <: DbleMemberLogin](memberId: Integer, loginDatetime: org.joda.time.LocalDateTime, tp: Class[_ <: ENTITY]): Option[ENTITY] = {
        return Option.apply(doSelectEntity(xprepareCBAsUniqueOf(memberId, loginDatetime), tp)());
    }

    protected def xprepareCBAsUniqueOf(memberId: Integer, loginDatetime: org.joda.time.LocalDateTime): MemberLoginCB = {
        assertObjectNotNull("memberId", memberId);assertObjectNotNull("loginDatetime", loginDatetime);
        return newConditionBean().acceptUniqueOf(memberId, loginDatetime);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * MemberLoginCB cb = new MemberLoginCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * List&lt;${MemberLogin}&gt; memberLoginList = memberLoginBhv.<span style="color: #DD4747">selectList</span>(cb);
     * memberLoginList.foreach(memberLogin =>
     *     ... = memberLogin...;
     * }
     * </pre>
     * @param cbCall The callback for condition-bean of MemberLogin. (NotNull)
     * @param loaderCall The callback for referrer loader of MemberLogin. (NoArgAllowed: then no loading)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    def selectList(cbCall: (MemberLoginCB) => Unit)(implicit loaderCall: (LoaderOfMemberLogin) => Unit = null): immutable.List[MemberLogin] = {
        return toImmutableEntityList(facadeSelectList(callbackCB(cbCall))(loaderCall));
    }

    protected def facadeSelectList(cb: MemberLoginCB)(loaderCall: (LoaderOfMemberLogin) => Unit = null): ListResultBean[DbleMemberLogin] = {
        return doSelectList(cb, typeOfSelectedEntity())(loaderCall);
    }

    protected def doSelectList[RESULT <: DbleMemberLogin](cb: MemberLoginCB, tp: Class[RESULT])(loaderCall: (LoaderOfMemberLogin) => Unit = null): ListResultBean[RESULT] = {
        val dbleList = helpSelectListInternally(cb, tp);
        callbackLoader(dbleList.asInstanceOf[List[DbleMemberLogin]], loaderCall);
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
     * MemberLoginCB cb = new MemberLoginCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;DbleMemberLogin&gt; page = memberLoginBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (DbleMemberLogin memberLogin : page) {
     *     ... = memberLogin.get...();
     * }
     * </pre>
     * @param cbCall The callback for condition-bean of MemberLogin. (NotNull)
     * @param loaderCall The callback for referrer loader of MemberLogin. (NoArgAllowed: then no loading)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    def selectPage(cbCall: (MemberLoginCB) => Unit)(implicit loaderCall: (LoaderOfMemberLogin) => Unit = null): ScrPagingView[MemberLogin] = {
        return newPagingView(facadeSelectPage(callbackCB(cbCall))(loaderCall));
    }

    protected def facadeSelectPage(cb: MemberLoginCB)(loaderCall: (LoaderOfMemberLogin) => Unit = null): PagingResultBean[DbleMemberLogin] = {
        return doSelectPage(cb, typeOfSelectedEntity())(loaderCall);
    }

    protected def doSelectPage[RESULT <: DbleMemberLogin](cb: MemberLoginCB, tp: Class[RESULT])(loaderCall: (LoaderOfMemberLogin) => Unit = null): PagingResultBean[RESULT] = {
        val dbleList = helpSelectPageInternally(cb, tp);
        callbackLoader(dbleList.asInstanceOf[List[DbleMemberLogin]], loaderCall);
        return dbleList;
    }

    override protected def doReadPage(cb: ConditionBean): PagingResultBean[_ <: Entity] = { facadeSelectPage(downcast(cb))() }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * MemberLoginCB cb = new MemberLoginCB();
     * cb.query().setFoo...(value);
     * memberLoginBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;DbleMemberLogin&gt;() {
     *     public void handle(DbleMemberLogin entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of DbleMemberLogin. (NotNull)
     * @param entityRowHandler The handler of entity row of DbleMemberLogin. (NotNull)
     */
    def selectCursor(cbCall: (MemberLoginCB) => Unit)(rowCall: (MemberLogin) => Unit): Unit = {
        facadeSelectCursor(callbackCB(cbCall), new EntityRowHandler[DbleMemberLogin]() {
            def handle(entity: DbleMemberLogin): Unit = { rowCall(entity.toImmutable) }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * memberLoginBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(MemberLoginCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    def scalarSelect[RESULT](resultType: Class[RESULT]): ScrHpSLSFunction[MemberLoginCB, RESULT] = {
        return toScalaSLSFunction[RESULT](facadeScalarSelect(resultType));
    }

    protected def toScalaSLSFunction[RESULT](function: HpSLSFunction[MemberLoginCB, RESULT]): ScrHpSLSFunction[MemberLoginCB, RESULT] =
    { new ScrHpSLSFunction[MemberLoginCB, RESULT](function) }

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
     * Pull out the list of foreign table 'DbleMemberStatus'.
     * @param memberLoginList The list of memberLogin. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    def pulloutMemberStatus(memberLoginList: immutable.List[MemberLogin]): immutable.List[MemberStatus] = {
        val dbleList = helpPulloutInternally(toDBableEntityList(memberLoginList), "memberStatus");
        return toScalaList(dbleList).map(new MemberStatus(_));
    }

    /**
     * Pull out the list of foreign table 'DbleMember'.
     * @param memberLoginList The list of memberLogin. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    def pulloutMember(memberLoginList: immutable.List[MemberLogin]): immutable.List[Member] = {
        val dbleList = helpPulloutInternally(toDBableEntityList(memberLoginList), "member");
        return toScalaList(dbleList).map(new Member(_));
    }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key memberLoginId.
     * @param memberLoginList The list of memberLogin. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    def extractMemberLoginIdList(memberLoginList: immutable.List[MemberLogin]): immutable.List[Long] = {
        val plainList = helpExtractListInternally(toDBableEntityList(memberLoginList), "memberLoginId");
        return toScalaList(plainList).map(_.asInstanceOf[Long]);
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * DbleMemberLogin memberLogin = new DbleMemberLogin();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * memberLogin.setFoo...(value);
     * memberLogin.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//memberLogin.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//memberLogin.set...;</span>
     * memberLoginBhv.<span style="color: #DD4747">insert</span>(memberLogin);
     * ... = memberLogin.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param entityCall The callback for entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param optionCall The callback for option of insert. (NoArgAllowed: then no option)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    def insert(entityCall: (MbleMemberLogin) => Unit)(implicit optionCall: (ScrInsertOption[MemberLoginCB]) => Unit = null): Unit = {
        assertObjectNotNull("entityCall", entityCall);
        doInsert(callbackMbleEntityToDBable(entityCall), callbackInsertOption(optionCall));
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * DbleMemberLogin memberLogin = new DbleMemberLogin();
     * memberLogin.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * memberLogin.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//memberLogin.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//memberLogin.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * memberLogin.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     memberLoginBhv.<span style="color: #DD4747">update</span>(memberLogin);
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
    def update(entityCall: (MbleMemberLogin) => Unit)(implicit optionCall: (ScrUpdateOption[MemberLoginCB]) => Unit = null): Unit = {
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
    def insertOrUpdate(entityCall: (MbleMemberLogin) => Unit)(implicit insertOptionCall: (ScrInsertOption[MemberLoginCB]) => Unit = null, updateOptionCall: (ScrUpdateOption[MemberLoginCB]) => Unit = null): Unit = {
        doInsertOrUpdate(callbackMbleEntityToDBable(entityCall), callbackInsertOption(insertOptionCall), callbackUpdateOption(updateOptionCall));
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * DbleMemberLogin memberLogin = new DbleMemberLogin();
     * memberLogin.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * memberLogin.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     memberLoginBhv.<span style="color: #DD4747">delete</span>(memberLogin);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param entityCall The callback for entity of delete. (NotNull, PrimaryKeyNotNull)
     * @param optionCall The callback for option of delete. (NoArgAllowed: then no option)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    def delete(entityCall: (MbleMemberLogin) => Unit)(implicit optionCall: (ScrDeleteOption[MemberLoginCB]) => Unit = null): Unit = {
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
     *     DbleMemberLogin memberLogin = new DbleMemberLogin();
     *     memberLogin.setFooName("foo");
     *     if (...) {
     *         memberLogin.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     memberLoginList.add(memberLogin);
     * }
     * memberLoginBhv.<span style="color: #DD4747">batchInsert</span>(memberLoginList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param memberLoginList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    def batchInsert(batchCall: (ScrBatchEntityList[MbleMemberLogin]) => Unit)(implicit optionCall: (ScrInsertOption[MemberLoginCB]) => Unit = null): Array[Int] = {
        return doBatchInsert(callbackBatch(batchCall), callbackInsertOption(optionCall));
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     DbleMemberLogin memberLogin = new DbleMemberLogin();
     *     memberLogin.setFooName("foo");
     *     if (...) {
     *         memberLogin.setFooPrice(123);
     *     } else {
     *         memberLogin.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//memberLogin.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     memberLoginList.add(memberLogin);
     * }
     * memberLoginBhv.<span style="color: #DD4747">batchUpdate</span>(memberLoginList);
     * </pre>
     * @param memberLoginList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    def batchUpdate(batchCall: (ScrBatchEntityList[MbleMemberLogin]) => Unit)(implicit optionCall: (ScrUpdateOption[MemberLoginCB]) => Unit = null): Array[Int] = {
        return doBatchUpdate(callbackBatch(batchCall), callbackUpdateOption(optionCall));
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param memberLoginList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    def batchDelete(batchCall: (ScrBatchEntityList[MbleMemberLogin]) => Unit)(implicit optionCall: (ScrDeleteOption[MemberLoginCB]) => Unit = null): Array[Int] = {
        return doBatchDelete(callbackBatch(batchCall), callbackDeleteOption(optionCall));
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * memberLoginBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;DbleMemberLogin, MemberLoginCB&gt;() {
     *     public ConditionBean setup(DbleMemberLogin entity, MemberLoginCB intoCB) {
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
    def queryInsert(setupperCall: (MbleMemberLogin, MemberLoginCB) => ConditionBean): Int = {
        return doQueryInsert(callbackQueryInsertSetupper(setupperCall), null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * DbleMemberLogin memberLogin = new DbleMemberLogin();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//memberLogin.setPK...(value);</span>
     * memberLogin.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//memberLogin.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//memberLogin.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//memberLogin.setVersionNo(value);</span>
     * MemberLoginCB cb = new MemberLoginCB();
     * cb.query().setFoo...(value);
     * memberLoginBhv.<span style="color: #DD4747">queryUpdate</span>(memberLogin, cb);
     * </pre>
     * @param entityCall The callback for entity that contains update values. (NotNull)
     * @param cbCall The callback for condition-bean of MemberLogin. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    def queryUpdate(entityCall: (MbleMemberLogin) => Unit)(cbCall: (MemberLoginCB) => Unit): Int = {
        assertObjectNotNull("entityCall", entityCall); assertObjectNotNull("cbCall", cbCall);
        return doQueryUpdate(callbackMbleEntityToDBable(entityCall), callbackCB(cbCall), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * MemberLoginCB cb = new MemberLoginCB();
     * cb.query().setFoo...(value);
     * memberLoginBhv.<span style="color: #DD4747">queryDelete</span>(memberLogin, cb);
     * </pre>
     * @param cbCall The callback for condition-bean of MemberLogin. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    def queryDelete(cbCall: (MemberLoginCB) => Unit): Int = {
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
    def outsideSql(): ScrOutsideSqlTypedBasicExecutor[MemberLoginBhv] = {
        val facadeExecutor: OutsideSqlAllFacadeExecutor[MemberLoginBhv] = doOutsideSql();
        return toImmutableOutsideSqlTypedBasicExecutor(facadeExecutor.xbasicExecutor()); // variable to resolve generic type
    }

    protected def toImmutableOutsideSqlTypedBasicExecutor(executor: OutsideSqlBasicExecutor[MemberLoginBhv]): ScrOutsideSqlTypedBasicExecutor[MemberLoginBhv] =
    { new ScrOutsideSqlTypedBasicExecutor(executor) }

    // ===================================================================================
    //                                                                     Callback Helper
    //                                                                     ===============
    protected def callbackCB(cbCall: (MemberLoginCB) => Unit): MemberLoginCB = {
        assertObjectNotNull("cbCall", cbCall);
        val cb = newConditionBean(); cbCall(cb); return cb;
    }

    protected def callbackBatch(batchCall: (ScrBatchEntityList[MbleMemberLogin]) => Unit): List[DbleMemberLogin] = {
        assertObjectNotNull("batchCall", batchCall);
        val batch = new ScrBatchEntityList[MbleMemberLogin]();
        val entityList: List[DbleMemberLogin] = new ArrayList[DbleMemberLogin]();
        batch.entityCallList.asScala.map { entityCall =>
            val entity = newMbleEntity(); entityCall(entity); entity.toDBable;
        }
        return entityList;
    }

    protected def callbackMbleEntity(entityCall: (MbleMemberLogin) => Unit): MbleMemberLogin = {
        assertObjectNotNull("entityCall", entityCall);
        val entity = newMbleEntity(); entityCall(entity); return entity;
    }

    protected def callbackMbleEntityToDBable(entityCall: (MbleMemberLogin) => Unit): DbleMemberLogin = {
        return callbackMbleEntity(entityCall).toDBable;
    }

    protected def callbackInsertOption(optionCall: (ScrInsertOption[MemberLoginCB]) => Unit): InsertOption[MemberLoginCB] = {
        if (optionCall == null) { return null; }
        val option = new ScrInsertOption[MemberLoginCB](new InsertOption[MemberLoginCB]());
        optionCall(option); return option.toNative;
    }

    protected def callbackUpdateOption(optionCall: (ScrUpdateOption[MemberLoginCB]) => Unit): UpdateOption[MemberLoginCB] = {
        if (optionCall == null) { return null; }
        val option = new ScrUpdateOption[MemberLoginCB](new UpdateOption[MemberLoginCB]()); optionCall(option); return option.toNative;
    }

    protected def callbackDeleteOption(optionCall: (ScrDeleteOption[MemberLoginCB]) => Unit): DeleteOption[MemberLoginCB] = {
        if (optionCall == null) { return null; }
        val option = new ScrDeleteOption[MemberLoginCB](new DeleteOption[MemberLoginCB]()); optionCall(option); return option.toNative;
    }

    protected def callbackQueryInsertSetupper(setupperCall: (MbleMemberLogin, MemberLoginCB) => ConditionBean): QueryInsertSetupper[DbleMemberLogin, MemberLoginCB] = {
        assertObjectNotNull("setupperCall", setupperCall);
        return new QueryInsertSetupper[DbleMemberLogin, MemberLoginCB]() {
            def setup(entity: DbleMemberLogin, intoCB: MemberLoginCB): ConditionBean = {
                val mble = newMbleEntity();
                val resultCB = setupperCall(mble, intoCB);
                entity.acceptImmutable(mble.toImmutable());
                return resultCB;
            }
        };
    }

    protected def callbackLoader(dbleList: List[DbleMemberLogin], loaderCall: (LoaderOfMemberLogin) => Unit = null): Unit = {
        if (loaderCall == null) { return; }
        val loader = new LoaderOfMemberLogin();
        loader.ready(dbleList.asInstanceOf[List[DbleMemberLogin]], _behaviorSelector);
        loaderCall(loader);
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    override protected def typeOfSelectedEntity(): Class[DbleMemberLogin] = { classOf[DbleMemberLogin] }
    override protected def typeOfHandlingEntity(): Class[DbleMemberLogin] = { classOf[DbleMemberLogin] }
    override protected def typeOfHandlingConditionBean(): Class[MemberLoginCB] = { classOf[MemberLoginCB] }
    protected def newMbleEntity(): MbleMemberLogin = { new MbleMemberLogin() }
    protected def newPagingView(rb: PagingResultBean[DbleMemberLogin]): ScrPagingView[MemberLogin] =
    { new ScrPagingView(toImmutableEntityList(rb), rb) }

    // ===================================================================================
    //                                                                        Scala Helper
    //                                                                        ============
    protected def toScalaList[ENTITY](javaList: Collection[ENTITY]): immutable.List[ENTITY] = {
        if (javaList == null) { immutable.List() }
        return javaList.toArray.toList.asInstanceOf[immutable.List[ENTITY]];
    }

    def toImmutableEntityList(dbleList: Collection[DbleMemberLogin]): immutable.List[MemberLogin] =
    { toScalaList(dbleList).map(new MemberLogin(_)) }

    def toDBableEntityList(immuList: immutable.List[MemberLogin]): List[DbleMemberLogin] =
    { immuList.map(new DbleMemberLogin().acceptImmutable(_)).asJava }
}
