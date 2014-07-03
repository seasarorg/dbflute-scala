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
 * The behavior of (会員セキュリティ情報)MEMBER_SECURITY as TABLE. <br />
 * <pre>
 * [primary key]
 *     MEMBER_ID
 *
 * [column]
 *     MEMBER_ID, LOGIN_PASSWORD, REMINDER_QUESTION, REMINDER_ANSWER, REMINDER_USE_COUNT, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
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
 *     MEMBER
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     member
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
abstract class BsMemberSecurityBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    def getTableDbName(): String = { return "MEMBER_SECURITY"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    def getDBMeta(): DBMeta = { return MemberSecurityDbm; }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    def newEntity(): DbleMemberSecurity = { return new DbleMemberSecurity(); }

    /** {@inheritDoc} */
    def newConditionBean(): MemberSecurityCB = { return new MemberSecurityCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * MemberSecurityCB cb = new MemberSecurityCB();
     * cb.query().setFoo...(value);
     * int count = memberSecurityBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of DbleMemberSecurity. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    def selectCount(cbCall: (MemberSecurityCB) => Unit): Int = {
        return facadeSelectCount(callbackCB(cbCall));
    }

    protected def facadeSelectCount(cb: MemberSecurityCB): Int = {
        return doSelectCountUniquely(cb);
    }

    protected def doSelectCountUniquely(cb: MemberSecurityCB): Int = { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected def doSelectCountPlainly(cb: MemberSecurityCB): Int = { // called by selectPage(cb)
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
     * MemberSecurityCB cb = new MemberSecurityCB();
     * cb.query().setFoo...(value);
     * OptionalEntity&lt;DbleMemberSecurity&gt; entity = memberSecurityBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     *
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * entity.<span style="color: #DD4747">required</span>(memberSecurity -&gt; {
     *     ...
     * });
     * DbleMemberSecurity memberSecurity = entity.entity.<span style="color: #DD4747">get()</span>;
     *
     * <span style="color: #3F7E5E">// if it might be no data, ifPresent(), isPresent(), ...</span>
     * entity.<span style="color: #DD4747">ifPresent</span>(memberSecurity -&gt; {
     *     ...
     * });
     * if (entity.entity.<span style="color: #DD4747">isPresent()</span>) {
     *     DbleMemberSecurity memberSecurity = entity.entity.<span style="color: #DD4747">get()</span>;
     * } else {
     *     ...
     * }
     * </pre>
     * @param cbCall The callback for condition-bean of MemberSecurity. (NotNull)
     * @param loaderCall The callback for referrer loader of MemberSecurity. (NoArgAllowed: then no loading)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get() of return value is called and the value is null, which means entity has already been deleted (point is not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    def selectEntity(cbCall: (MemberSecurityCB) => Unit)(implicit loaderCall: (LoaderOfMemberSecurity) => Unit = null): Option[MemberSecurity] = {
        return facadeSelectEntity(callbackCB(cbCall))(loaderCall).map(_.toImmutable);
    }

    protected def facadeSelectEntity(cb: MemberSecurityCB)(loaderCall: (LoaderOfMemberSecurity) => Unit = null): Option[DbleMemberSecurity] = {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity())(loaderCall);
    }

    protected def doSelectEntity[ENTITY <: DbleMemberSecurity](cb: MemberSecurityCB, tp: Class[ENTITY])(loaderCall: (LoaderOfMemberSecurity) => Unit = null): ENTITY = {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        val dble = helpSelectEntityInternally(cb, tp);
        if (dble != null) {
            callbackLoader(DfCollectionUtil.newArrayList(dble.asInstanceOf[DbleMemberSecurity]), loaderCall);
        }
        return dble;
    }

    protected def doSelectOptionalEntity[ENTITY <: DbleMemberSecurity](cb: MemberSecurityCB, tp: Class[ENTITY])(loaderCall: (LoaderOfMemberSecurity) => Unit = null): Option[ENTITY] = {
        return Option.apply(doSelectEntity(cb, tp)(loaderCall));
    }

    protected def doReadEntity(cb: ConditionBean): Entity = { facadeSelectEntity(downcast(cb))().orNull }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * MemberSecurityCB cb = new MemberSecurityCB();
     * cb.query().setFoo...(value);
     * DbleMemberSecurity memberSecurity = memberSecurityBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = memberSecurity.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbCall The callback for condition-bean of MemberSecurity. (NotNull)
     * @param loaderCall The callback for referrer loader of MemberSecurity. (NoArgAllowed: then no loading)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (point is not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    def selectEntityWithDeletedCheck(cbCall: (MemberSecurityCB) => Unit)(implicit loaderCall: (LoaderOfMemberSecurity) => Unit = null): MemberSecurity = {
        return facadeSelectEntityWithDeletedCheck(callbackCB(cbCall))(loaderCall).toImmutable;
    }

    protected def facadeSelectEntityWithDeletedCheck(cb: MemberSecurityCB)(loaderCall: (LoaderOfMemberSecurity) => Unit = null): DbleMemberSecurity = {
        return doSelectEntityWithDeletedCheck(cb, typeOfSelectedEntity())(loaderCall);
    }

    protected def doSelectEntityWithDeletedCheck[ENTITY <: DbleMemberSecurity](cb: MemberSecurityCB, tp: Class[ENTITY])(loaderCall: (LoaderOfMemberSecurity) => Unit = null): ENTITY = {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        val dble = helpSelectEntityWithDeletedCheckInternally(cb, tp);
        callbackLoader(DfCollectionUtil.newArrayList(dble.asInstanceOf[DbleMemberSecurity]), loaderCall);
        return dble;
    }

    protected def doReadEntityWithDeletedCheck(cb: ConditionBean): Entity = { facadeSelectEntityWithDeletedCheck(downcast(cb))() }

    /**
     * Select the entity by the primary-key value.
     * @param memberId (会員ID): PK, NotNull, INTEGER(10), FK to MEMBER. (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    def selectByPK(memberId: Integer): Option[MemberSecurity] = {
        return facadeSelectByPK(memberId).map(_.toImmutable);
    }

    protected def facadeSelectByPK(memberId: Integer): Option[DbleMemberSecurity] = {
        return doSelectByPK(memberId, typeOfSelectedEntity());
    }

    protected def doSelectByPK[ENTITY <: DbleMemberSecurity](memberId: Integer, tp: Class[ENTITY]): Option[ENTITY] = {
        return Option.apply(doSelectEntity(xprepareCBAsPK(memberId), tp)());
    }

    protected def xprepareCBAsPK(memberId: Integer): MemberSecurityCB = {
        assertObjectNotNull("memberId", memberId);
        return newConditionBean().acceptPK(memberId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * MemberSecurityCB cb = new MemberSecurityCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * List&lt;${MemberSecurity}&gt; memberSecurityList = memberSecurityBhv.<span style="color: #DD4747">selectList</span>(cb);
     * memberSecurityList.foreach(memberSecurity =>
     *     ... = memberSecurity...;
     * }
     * </pre>
     * @param cbCall The callback for condition-bean of MemberSecurity. (NotNull)
     * @param loaderCall The callback for referrer loader of MemberSecurity. (NoArgAllowed: then no loading)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    def selectList(cbCall: (MemberSecurityCB) => Unit)(implicit loaderCall: (LoaderOfMemberSecurity) => Unit = null): immutable.List[MemberSecurity] = {
        return toImmutableEntityList(facadeSelectList(callbackCB(cbCall))(loaderCall));
    }

    protected def facadeSelectList(cb: MemberSecurityCB)(loaderCall: (LoaderOfMemberSecurity) => Unit = null): ListResultBean[DbleMemberSecurity] = {
        return doSelectList(cb, typeOfSelectedEntity())(loaderCall);
    }

    protected def doSelectList[ENTITY <: DbleMemberSecurity](cb: MemberSecurityCB, tp: Class[ENTITY])(loaderCall: (LoaderOfMemberSecurity) => Unit = null): ListResultBean[ENTITY] = {
        val dbleList = helpSelectListInternally(cb, tp);
        callbackLoader(dbleList.asInstanceOf[List[DbleMemberSecurity]], loaderCall);
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
     * MemberSecurityCB cb = new MemberSecurityCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;DbleMemberSecurity&gt; page = memberSecurityBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (DbleMemberSecurity memberSecurity : page) {
     *     ... = memberSecurity.get...();
     * }
     * </pre>
     * @param cbCall The callback for condition-bean of MemberSecurity. (NotNull)
     * @param loaderCall The callback for referrer loader of MemberSecurity. (NoArgAllowed: then no loading)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    def selectPage(cbCall: (MemberSecurityCB) => Unit)(implicit loaderCall: (LoaderOfMemberSecurity) => Unit = null): ScrPagingView[MemberSecurity] = {
        return newPagingView(facadeSelectPage(callbackCB(cbCall))(loaderCall));
    }

    protected def facadeSelectPage(cb: MemberSecurityCB)(loaderCall: (LoaderOfMemberSecurity) => Unit = null): PagingResultBean[DbleMemberSecurity] = {
        return doSelectPage(cb, typeOfSelectedEntity())(loaderCall);
    }

    protected def doSelectPage[ENTITY <: DbleMemberSecurity](cb: MemberSecurityCB, tp: Class[ENTITY])(loaderCall: (LoaderOfMemberSecurity) => Unit = null): PagingResultBean[ENTITY] = {
        return helpSelectPageInternally(cb, tp);
    }

    protected def doReadPage(cb: ConditionBean): PagingResultBean[_ <: Entity] = { facadeSelectPage(downcast(cb))() }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * MemberSecurityCB cb = new MemberSecurityCB();
     * cb.query().setFoo...(value);
     * memberSecurityBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;DbleMemberSecurity&gt;() {
     *     public void handle(DbleMemberSecurity entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of DbleMemberSecurity. (NotNull)
     * @param entityRowHandler The handler of entity row of DbleMemberSecurity. (NotNull)
     */
    def selectCursor(cbCall: (MemberSecurityCB) => Unit)(rowCall: (MemberSecurity) => Unit): Unit = {
        facadeSelectCursor(callbackCB(cbCall), new EntityRowHandler[DbleMemberSecurity]() {
            def handle(entity: DbleMemberSecurity): Unit = { rowCall(entity.toImmutable) }
        });
    }

    protected def facadeSelectCursor(cb: MemberSecurityCB, handler: EntityRowHandler[DbleMemberSecurity]): Unit = {
        doSelectCursor(cb, handler, typeOfSelectedEntity());
    }

    protected def doSelectCursor[ENTITY <: DbleMemberSecurity](cb: MemberSecurityCB, handler: EntityRowHandler[ENTITY], tp: Class[ENTITY]): Unit = {
        helpSelectCursorInternally(cb, handler, tp);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * memberSecurityBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(MemberSecurityCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    def scalarSelect[RESULT](resultType: Class[RESULT]): ScrHpSLSFunction[MemberSecurityCB, RESULT] = {
        return toScalaSLSFunction[RESULT](facadeScalarSelect(resultType));
    }

    protected def toScalaSLSFunction[RESULT](function: HpSLSFunction[MemberSecurityCB, RESULT]): ScrHpSLSFunction[MemberSecurityCB, RESULT] =
    { new ScrHpSLSFunction[MemberSecurityCB, RESULT](function) }

    protected def facadeScalarSelect[RESULT](resultType: Class[RESULT]): HpSLSFunction[MemberSecurityCB, RESULT] = {
        return doScalarSelect(resultType, newConditionBean());
    }

    protected def doScalarSelect[RESULT, CB <: MemberSecurityCB](tp: Class[RESULT], cb: CB): HpSLSFunction[CB, RESULT] = {
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
     * @param memberSecurityList The list of memberSecurity. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    def pulloutMember(memberSecurityList: immutable.List[MemberSecurity]): immutable.List[Member] = {
        val dbleList = helpPulloutInternally(toDBableEntityList(memberSecurityList), "member");
        return toScalaList(dbleList).map(new Member(_));
    }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key memberId.
     * @param memberSecurityList The list of memberSecurity. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    def extractMemberIdList(memberSecurityList: immutable.List[MemberSecurity]): immutable.List[Int] = {
        val plainList = helpExtractListInternally(toDBableEntityList(memberSecurityList), "memberId");
        return toScalaList(plainList).map(_.asInstanceOf[Int]);
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * DbleMemberSecurity memberSecurity = new DbleMemberSecurity();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * memberSecurity.setFoo...(value);
     * memberSecurity.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//memberSecurity.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//memberSecurity.set...;</span>
     * memberSecurityBhv.<span style="color: #DD4747">insert</span>(memberSecurity);
     * ... = memberSecurity.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param entityCall The callback for entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param optionCall The callback for option of insert. (NoArgAllowed: then no option)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    def insert(entityCall: (MbleMemberSecurity) => Unit)(implicit optionCall: (ScrInsertOption[MemberSecurityCB]) => Unit = null): Unit = {
        assertObjectNotNull("entityCall", entityCall);
        doInsert(callbackMbleEntityToDBable(entityCall), callbackInsertOption(optionCall));
    }

    protected def doInsert(et: DbleMemberSecurity, op: InsertOption[MemberSecurityCB]): Unit = {
        assertObjectNotNull("memberSecurity", et); prepareInsertOption(op); delegateInsert(et, op);
    }

    protected def prepareInsertOption(op: InsertOption[MemberSecurityCB]): Unit = {
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
     * DbleMemberSecurity memberSecurity = new DbleMemberSecurity();
     * memberSecurity.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * memberSecurity.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//memberSecurity.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//memberSecurity.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * memberSecurity.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     memberSecurityBhv.<span style="color: #DD4747">update</span>(memberSecurity);
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
    def update(entityCall: (MbleMemberSecurity) => Unit)(implicit optionCall: (ScrUpdateOption[MemberSecurityCB]) => Unit = null): Unit = {
        assertObjectNotNull("entityCall", entityCall);
        doUpdate(callbackMbleEntityToDBable(entityCall), callbackUpdateOption(optionCall));
    }

    protected def doUpdate(et: DbleMemberSecurity, op: UpdateOption[MemberSecurityCB]): Unit = {
        assertObjectNotNull("memberSecurity", et); prepareUpdateOption(op); helpUpdateInternally(et, op);
    }

    protected def prepareUpdateOption(op: UpdateOption[MemberSecurityCB]): Unit = {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) { op.resolveSelfSpecification(createCBForVaryingUpdate()); }
        if (op.hasSpecifiedUpdateColumn()) { op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate()); }
    }

    protected def createCBForVaryingUpdate(): MemberSecurityCB =
    { val cb: MemberSecurityCB = newConditionBean(); cb.xsetupForVaryingUpdate(); return cb; }

    protected def createCBForSpecifiedUpdate(): MemberSecurityCB =
    { val cb: MemberSecurityCB = newConditionBean(); cb.xsetupForSpecifiedUpdate(); return cb; }

    protected def doModify(et: Entity, op: UpdateOption[_ <: ConditionBean]): Unit = { doUpdate(downcast(et), downcast(op)) }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * DbleMemberSecurity memberSecurity = new DbleMemberSecurity();
     * memberSecurity.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * memberSecurity.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//memberSecurity.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//memberSecurity.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//memberSecurity.setVersionNo(value);</span>
     * memberSecurityBhv.<span style="color: #DD4747">updateNonstrict</span>(memberSecurity);
     * </pre>
     * @param entityCall The callback for entity of update. (NotNull, PrimaryKeyNotNull)
     * @param optionCall The callback for option of update. (NoArgAllowed: then no option)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    def updateNonstrict(entityCall: (MbleMemberSecurity) => Unit)(implicit optionCall: (ScrUpdateOption[MemberSecurityCB]) => Unit = null): Unit = {
        doUpdateNonstrict(callbackMbleEntityToDBable(entityCall), callbackUpdateOption(optionCall));
    }

    protected def doUpdateNonstrict(et: DbleMemberSecurity, op: UpdateOption[MemberSecurityCB]): Unit = {
        assertObjectNotNull("memberSecurity", et); prepareUpdateOption(op); helpUpdateNonstrictInternally(et, op);
    }

    protected def doModifyNonstrict(et: Entity, op: UpdateOption[_ <: ConditionBean]): Unit =
    { doUpdateNonstrict(downcast(et), downcast(op)) }

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
    def insertOrUpdate(entityCall: (MbleMemberSecurity) => Unit)(implicit insertOptionCall: (ScrInsertOption[MemberSecurityCB]) => Unit = null, updateOptionCall: (ScrUpdateOption[MemberSecurityCB]) => Unit = null): Unit = {
        doInsertOrUpdate(callbackMbleEntityToDBable(entityCall), callbackInsertOption(insertOptionCall), callbackUpdateOption(updateOptionCall));
    }

    protected def doInsertOrUpdate(et: DbleMemberSecurity, iop: InsertOption[MemberSecurityCB], uop: UpdateOption[MemberSecurityCB]): Unit = {
        assertObjectNotNull("memberSecurity", et); helpInsertOrUpdateInternally(et, iop, uop);
    }

    protected def doCreateOrModify(et: Entity, iop: InsertOption[_ <: ConditionBean], uop: UpdateOption[_ <: ConditionBean]): Unit =
    { doInsertOrUpdate(downcast(et), downcast(iop), downcast(uop)) }

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
    def insertOrUpdateNonstrict(entityCall: (MbleMemberSecurity) => Unit)(implicit insertOptionCall: (ScrInsertOption[MemberSecurityCB]) => Unit = null, updateOptionCall: (ScrUpdateOption[MemberSecurityCB]) => Unit = null): Unit = {
        doInsertOrUpdateNonstrict(callbackMbleEntityToDBable(entityCall), callbackInsertOption(insertOptionCall), callbackUpdateOption(updateOptionCall));
    }

    protected def doInsertOrUpdateNonstrict(et: DbleMemberSecurity, iop: InsertOption[MemberSecurityCB], uop: UpdateOption[MemberSecurityCB]): Unit = {
        assertObjectNotNull("memberSecurity", et); helpInsertOrUpdateInternally(et, iop, uop);
    }

    @Override
    protected def doCreateOrModifyNonstrict(et: Entity, iop: InsertOption[_ <: ConditionBean], uop: UpdateOption[_ <: ConditionBean]): Unit = {
        doInsertOrUpdateNonstrict(downcast(et), downcast(iop), downcast(uop));
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl)
     * <pre>
     * DbleMemberSecurity memberSecurity = new DbleMemberSecurity();
     * memberSecurity.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * memberSecurity.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     memberSecurityBhv.<span style="color: #DD4747">delete</span>(memberSecurity);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param entityCall The callback for entity of delete. (NotNull, PrimaryKeyNotNull)
     * @param optionCall The callback for option of delete. (NoArgAllowed: then no option)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    def delete(entityCall: (MbleMemberSecurity) => Unit)(implicit optionCall: (ScrDeleteOption[MemberSecurityCB]) => Unit = null): Unit = {
        doDelete(callbackMbleEntityToDBable(entityCall), callbackDeleteOption(optionCall));
    }

    protected def doDelete(et: DbleMemberSecurity, op: DeleteOption[MemberSecurityCB]): Unit = {
        assertObjectNotNull("memberSecurity", et); prepareDeleteOption(op); helpDeleteInternally(et, op);
    }

    protected def prepareDeleteOption(op: DeleteOption[MemberSecurityCB]): Unit = { if (op != null) { assertDeleteOptionStatus(op); } }

    protected def doRemove(et: Entity, op: DeleteOption[_ <: ConditionBean]): Unit = { doDelete(downcast(et), downcast(op)) }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * DbleMemberSecurity memberSecurity = new DbleMemberSecurity();
     * memberSecurity.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//memberSecurity.setVersionNo(value);</span>
     * memberSecurityBhv.<span style="color: #DD4747">deleteNonstrict</span>(memberSecurity);
     * </pre>
     * @param entityCall The callback for entity of delete. (NotNull, PrimaryKeyNotNull)
     * @param optionCall The callback for option of delete. (NoArgAllowed: then no option)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    def deleteNonstrict(entityCall: (MbleMemberSecurity) => Unit)(implicit optionCall: (ScrDeleteOption[MemberSecurityCB]) => Unit = null): Unit = {
        doDeleteNonstrict(callbackMbleEntityToDBable(entityCall), callbackDeleteOption(optionCall));
    }

    protected def doDeleteNonstrict(et: DbleMemberSecurity, op: DeleteOption[MemberSecurityCB]): Unit = {
        assertObjectNotNull("memberSecurity", et); prepareDeleteOption(op); helpDeleteNonstrictInternally(et, op);
    }

    protected def doRemoveNonstrict(et: Entity, op: DeleteOption[_ <: ConditionBean]): Unit =
    { doDeleteNonstrict(downcast(et), downcast(op)) }

    // ===================================================================================
    //                                                                        Batch Update
    //                                                                        ============
    /**
     * Batch-insert the entity list modified-only of same-set columns. (DefaultConstraintsEnabled) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <p><span style="color: #DD4747; font-size: 120%">The columns of least common multiple are registered like this:</span></p>
     * <pre>
     * for (... : ...) {
     *     DbleMemberSecurity memberSecurity = new DbleMemberSecurity();
     *     memberSecurity.setFooName("foo");
     *     if (...) {
     *         memberSecurity.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     memberSecurityList.add(memberSecurity);
     * }
     * memberSecurityBhv.<span style="color: #DD4747">batchInsert</span>(memberSecurityList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param memberSecurityList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    def batchInsert(batchCall: (ScrBatchEntityList[MbleMemberSecurity]) => Unit)(implicit optionCall: (ScrInsertOption[MemberSecurityCB]) => Unit = null): Array[Int] = {
        return doBatchInsert(callbackBatch(batchCall), callbackInsertOption(optionCall));
    }

    protected def doBatchInsert(ls: List[DbleMemberSecurity], op: InsertOption[MemberSecurityCB]): Array[Int] = {
        assertObjectNotNull("memberSecurityList", ls);
        val rlop: InsertOption[MemberSecurityCB] = if (op != null) { op } else { createPlainInsertOption() }
        prepareBatchInsertOption(ls, op); // required
        return delegateBatchInsert(ls, op);
    }

    protected def prepareBatchInsertOption(ls: List[DbleMemberSecurity], op: InsertOption[MemberSecurityCB]): Unit = {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(ls);
        prepareInsertOption(op);
    }

    protected def doLumpCreate(ls: List[Entity], op: InsertOption[_ <: ConditionBean]): Array[Int] = { doBatchInsert(downcast(ls), downcast(op)) }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     DbleMemberSecurity memberSecurity = new DbleMemberSecurity();
     *     memberSecurity.setFooName("foo");
     *     if (...) {
     *         memberSecurity.setFooPrice(123);
     *     } else {
     *         memberSecurity.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//memberSecurity.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     memberSecurityList.add(memberSecurity);
     * }
     * memberSecurityBhv.<span style="color: #DD4747">batchUpdate</span>(memberSecurityList);
     * </pre>
     * @param memberSecurityList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    def batchUpdate(batchCall: (ScrBatchEntityList[MbleMemberSecurity]) => Unit)(implicit optionCall: (ScrUpdateOption[MemberSecurityCB]) => Unit = null): Array[Int] = {
        return doBatchUpdate(callbackBatch(batchCall), callbackUpdateOption(optionCall));
    }

    protected def doBatchUpdate(ls: List[DbleMemberSecurity], op: UpdateOption[MemberSecurityCB]): Array[Int] = {
        assertObjectNotNull("memberSecurityList", ls);
        val rlop: UpdateOption[MemberSecurityCB] = if (op != null) { op } else { createPlainUpdateOption() }
        prepareBatchUpdateOption(ls, rlop); // required
        return delegateBatchUpdate(ls, rlop);
    }

    protected def prepareBatchUpdateOption(ls: List[DbleMemberSecurity], op: UpdateOption[MemberSecurityCB]): Unit = {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(ls);
        prepareUpdateOption(op);
    }

    protected def doLumpModify(ls: List[Entity], op: UpdateOption[_ <: ConditionBean]): Array[Int] = { doBatchUpdate(downcast(ls), downcast(op)) }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     DbleMemberSecurity memberSecurity = new DbleMemberSecurity();
     *     memberSecurity.setFooName("foo");
     *     if (...) {
     *         memberSecurity.setFooPrice(123);
     *     } else {
     *         memberSecurity.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//memberSecurity.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     memberSecurityList.add(memberSecurity);
     * }
     * memberSecurityBhv.<span style="color: #DD4747">batchUpdate</span>(memberSecurityList);
     * </pre>
     * @param memberSecurityList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    def batchUpdateNonstrict(batchCall: (ScrBatchEntityList[MbleMemberSecurity]) => Unit)(implicit optionCall: (ScrUpdateOption[MemberSecurityCB]) => Unit = null): Array[Int] = {
        return doBatchUpdateNonstrict(callbackBatch(batchCall), callbackUpdateOption(optionCall));
    }

    protected def doBatchUpdateNonstrict(ls: List[DbleMemberSecurity], op: UpdateOption[MemberSecurityCB]): Array[Int] = {
        assertObjectNotNull("memberSecurityList", ls);
        val rlop: UpdateOption[MemberSecurityCB] = if (op != null) { op } else { createPlainUpdateOption() }
        prepareBatchUpdateOption(ls, rlop);
        return delegateBatchUpdateNonstrict(ls, rlop);
    }

    protected def doLumpModifyNonstrict(ls: List[Entity], op: UpdateOption[_ <: ConditionBean]): Array[Int] =
    { doBatchUpdateNonstrict(downcast(ls), downcast(op)) }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param memberSecurityList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    def batchDelete(batchCall: (ScrBatchEntityList[MbleMemberSecurity]) => Unit)(implicit optionCall: (ScrDeleteOption[MemberSecurityCB]) => Unit = null): Array[Int] = {
        return doBatchDelete(callbackBatch(batchCall), callbackDeleteOption(optionCall));
    }

    protected def doBatchDelete(ls: List[DbleMemberSecurity], op: DeleteOption[MemberSecurityCB]): Array[Int] = {
        assertObjectNotNull("memberSecurityList", ls); prepareDeleteOption(op);
        return delegateBatchDelete(ls, op);
    }

    protected def doLumpRemove(ls: List[Entity], op: DeleteOption[_ <: ConditionBean]): Array[Int] = { doBatchDelete(downcast(ls), downcast(op)) }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param memberSecurityList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    def batchDeleteNonstrict(batchCall: (ScrBatchEntityList[MbleMemberSecurity]) => Unit)(implicit optionCall: (ScrDeleteOption[MemberSecurityCB]) => Unit = null): Array[Int] = {
        return doBatchDeleteNonstrict(callbackBatch(batchCall), callbackDeleteOption(optionCall));
    }

    protected def doBatchDeleteNonstrict(ls: List[DbleMemberSecurity], op: DeleteOption[MemberSecurityCB]): Array[Int] = {
        assertObjectNotNull("memberSecurityList", ls);
        prepareDeleteOption(op);
        return delegateBatchDeleteNonstrict(ls, op);
    }

    protected def doLumpRemoveNonstrict(ls: List[Entity], op: DeleteOption[_ <: ConditionBean]): Array[Int] =
    { return doBatchDeleteNonstrict(downcast(ls), downcast(op)); }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * memberSecurityBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;DbleMemberSecurity, MemberSecurityCB&gt;() {
     *     public ConditionBean setup(memberSecurity entity, MemberSecurityCB intoCB) {
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
    def queryInsert(setupper: QueryInsertSetupper[DbleMemberSecurity, MemberSecurityCB]): Int = {
        return doQueryInsert(setupper, null);
    }

    protected def doQueryInsert(sp: QueryInsertSetupper[DbleMemberSecurity, MemberSecurityCB], op: InsertOption[MemberSecurityCB]): Int = {
        assertObjectNotNull("setupper", sp); prepareInsertOption(op);
        val et: DbleMemberSecurity = newEntity();
        val cb: MemberSecurityCB = createCBForQueryInsert();
        return delegateQueryInsert(et, cb, sp.setup(et, cb), op);
    }

    protected def createCBForQueryInsert(): MemberSecurityCB =
    { val cb: MemberSecurityCB = newConditionBean(); cb.xsetupForQueryInsert(); return cb; }

    protected def doRangeCreate(setupper: QueryInsertSetupper[_ <: Entity, _ <: ConditionBean], option: InsertOption[_ <: ConditionBean]): Int =
    { doQueryInsert(downcast(setupper), downcast(option)) }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * DbleMemberSecurity memberSecurity = new DbleMemberSecurity();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//memberSecurity.setPK...(value);</span>
     * memberSecurity.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//memberSecurity.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//memberSecurity.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//memberSecurity.setVersionNo(value);</span>
     * MemberSecurityCB cb = new MemberSecurityCB();
     * cb.query().setFoo...(value);
     * memberSecurityBhv.<span style="color: #DD4747">queryUpdate</span>(memberSecurity, cb);
     * </pre>
     * @param entityCall The callback for entity that contains update values. (NotNull)
     * @param cbCall The callback for condition-bean of MemberSecurity. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    def queryUpdate(entityCall: (MbleMemberSecurity) => Unit)(cbCall: (MemberSecurityCB) => Unit): Int = {
        assertObjectNotNull("entityCall", entityCall); assertObjectNotNull("cbCall", cbCall);
        return doQueryUpdate(callbackMbleEntityToDBable(entityCall), callbackCB(cbCall), null);
    }

    protected def doQueryUpdate(memberSecurity: DbleMemberSecurity, cb: MemberSecurityCB, op: UpdateOption[MemberSecurityCB]): Int = {
        assertObjectNotNull("memberSecurity", memberSecurity); assertCBStateValid(cb); prepareUpdateOption(op);
        return if (checkCountBeforeQueryUpdateIfNeeds(cb)) { delegateQueryUpdate(memberSecurity, cb, op) } else { 0 };
    }

    protected def doRangeModify(et: Entity, cb: ConditionBean, op: UpdateOption[_ <: ConditionBean]): Int =
    { doQueryUpdate(downcast(et), downcast(cb), downcast(op)) }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * MemberSecurityCB cb = new MemberSecurityCB();
     * cb.query().setFoo...(value);
     * memberSecurityBhv.<span style="color: #DD4747">queryDelete</span>(memberSecurity, cb);
     * </pre>
     * @param cbCall The callback for condition-bean of MemberSecurity. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    def queryDelete(cbCall: (MemberSecurityCB) => Unit): Int = {
        assertObjectNotNull("cbCall", cbCall);
        return doQueryDelete(callbackCB(cbCall), null);
    }

    protected def doQueryDelete(cb: MemberSecurityCB, op: DeleteOption[MemberSecurityCB]): Int = {
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
    def outsideSql(): ScrOutsideSqlBasicExecutor[MemberSecurityBhv] = {
        return toImmutableOutsideSqlBasicExecutor(doOutsideSql());
    }

    protected def toImmutableOutsideSqlBasicExecutor(executor: OutsideSqlBasicExecutor[MemberSecurityBhv]): ScrOutsideSqlBasicExecutor[MemberSecurityBhv] =
    { new ScrOutsideSqlBasicExecutor(executor) }

    // ===================================================================================
    //                                                                Optimistic Lock Info
    //                                                                ====================
    override protected def hasVersionNoValue(et: Entity): Boolean = {
        return downcast(et).getVersionNo() != null;
    }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    protected def callbackCB(cbCall: (MemberSecurityCB) => Unit): MemberSecurityCB = {
        assertObjectNotNull("cbCall", cbCall);
        val cb = newConditionBean(); cbCall(cb); return cb;
    }

    protected def callbackBatch(batchCall: (ScrBatchEntityList[MbleMemberSecurity]) => Unit): List[DbleMemberSecurity] = {
        assertObjectNotNull("batchCall", batchCall);
        val batch = new ScrBatchEntityList[MbleMemberSecurity]();
        val entityList: List[DbleMemberSecurity] = new ArrayList[DbleMemberSecurity]();
        batch.entityCallList.asScala.map { entityCall =>
            val entity = newMbleEntity(); entityCall(entity); entity.toDBable;
        }
        return entityList;
    }

    protected def callbackMbleEntity(entityCall: (MbleMemberSecurity) => Unit): MbleMemberSecurity = {
        assertObjectNotNull("entityCall", entityCall);
        val entity = newMbleEntity(); entityCall(entity); return entity;
    }

    protected def callbackMbleEntityToDBable(entityCall: (MbleMemberSecurity) => Unit): DbleMemberSecurity = {
        return callbackMbleEntity(entityCall).toDBable;
    }

    protected def callbackInsertOption(optionCall: (ScrInsertOption[MemberSecurityCB]) => Unit): InsertOption[MemberSecurityCB] = {
        if (optionCall == null) { return null; }
        val option = new ScrInsertOption[MemberSecurityCB](new InsertOption[MemberSecurityCB]());
        optionCall(option); return option.toNative;
    }

    protected def callbackUpdateOption(optionCall: (ScrUpdateOption[MemberSecurityCB]) => Unit): UpdateOption[MemberSecurityCB] = {
        if (optionCall == null) { return null; }
        val option = new ScrUpdateOption[MemberSecurityCB](new UpdateOption[MemberSecurityCB]()); optionCall(option); return option.toNative;
    }

    protected def callbackDeleteOption(optionCall: (ScrDeleteOption[MemberSecurityCB]) => Unit): DeleteOption[MemberSecurityCB] = {
        if (optionCall == null) { return null; }
        val option = new ScrDeleteOption[MemberSecurityCB](new DeleteOption[MemberSecurityCB]()); optionCall(option); return option.toNative;
    }

    protected def callbackLoader(dbleList: List[DbleMemberSecurity], loaderCall: (LoaderOfMemberSecurity) => Unit = null): Unit = {
        if (loaderCall == null) { return; }
        val loader = new LoaderOfMemberSecurity();
        loader.ready(dbleList.asInstanceOf[List[DbleMemberSecurity]], _behaviorSelector);
        loaderCall(loader);
    }

    protected def newMbleEntity(): MbleMemberSecurity = { new MbleMemberSecurity() }
    protected def newPagingView(rb: PagingResultBean[DbleMemberSecurity]): ScrPagingView[MemberSecurity] =
    { new ScrPagingView(toImmutableEntityList(rb), rb) }

    protected def typeOfSelectedEntity(): Class[DbleMemberSecurity] = { classOf[DbleMemberSecurity] }
    protected def downcast(et: Entity): DbleMemberSecurity = { helpEntityDowncastInternally(et, classOf[DbleMemberSecurity]) }
    protected def downcast(cb: ConditionBean): MemberSecurityCB = { helpConditionBeanDowncastInternally(cb, classOf[MemberSecurityCB]) }
    protected def downcast(ls: List[_ <: Entity]): List[DbleMemberSecurity] = { ls.asInstanceOf[List[DbleMemberSecurity]] }
    protected def downcast(op: InsertOption[_ <: ConditionBean]): InsertOption[MemberSecurityCB] = { op.asInstanceOf[InsertOption[MemberSecurityCB]] }
    protected def downcast(op: UpdateOption[_ <: ConditionBean]): UpdateOption[MemberSecurityCB] = { op.asInstanceOf[UpdateOption[MemberSecurityCB]] }
    protected def downcast(op: DeleteOption[_ <: ConditionBean]): DeleteOption[MemberSecurityCB] = { op.asInstanceOf[DeleteOption[MemberSecurityCB]] }
    protected def downcast(sp: QueryInsertSetupper[_ <: Entity, _ <: ConditionBean]): QueryInsertSetupper[DbleMemberSecurity, MemberSecurityCB] =
    { sp.asInstanceOf[QueryInsertSetupper[DbleMemberSecurity, MemberSecurityCB]] }

    // ===================================================================================
    //                                                                        Scala Helper
    //                                                                        ============
    protected def toScalaList[ENTITY](javaList: Collection[ENTITY]): immutable.List[ENTITY] = {
        if (javaList == null) { immutable.List() }
        return immutable.List.fromArray(javaList.toArray()).asInstanceOf[immutable.List[ENTITY]];
    }

    def toImmutableEntityList(dbleList: Collection[DbleMemberSecurity]): immutable.List[MemberSecurity] =
    { toScalaList(dbleList).map(new MemberSecurity(_)) }

    def toDBableEntityList(immuList: immutable.List[MemberSecurity]): List[DbleMemberSecurity] =
    { immuList.map(new DbleMemberSecurity().acceptImmutable(_)).asJava }
}
