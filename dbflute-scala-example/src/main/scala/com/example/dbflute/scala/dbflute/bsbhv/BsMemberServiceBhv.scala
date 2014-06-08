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
    /** @return The instance of DBMeta. (NotNull) */
    def getDBMeta(): DBMeta = { return MemberServiceDbm; }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    def newEntity(): Entity = { return newMyEntity(); }

    /** {@inheritDoc} */
    def newConditionBean(): ConditionBean = { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    def newMyEntity(): DbleMemberService = { return new DbleMemberService(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    def newMyConditionBean(): MemberServiceCB = { return new MemberServiceCB(); }

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
    def selectCount(cb: MemberServiceCB): Int = {
        return Integer2int(doSelectCountUniquely(cb));
    }

    protected def doSelectCountUniquely(cb: MemberServiceCB): Integer = { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected def doSelectCountPlainly(cb: MemberServiceCB): Integer = { // called by selectPage(cb)
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
     * @param cb The condition-bean of DbleMemberService. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get() of return value is called and the value is null, which means entity has already been deleted (point is not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    def selectEntity(cb: MemberServiceCB): Option[MemberService] = {
        return doSelectOptionalEntity(cb, classOf[DbleMemberService]).map(f => new MemberService(f));
    }

    protected def doSelectEntity[ENTITY <: DbleMemberService](cb: MemberServiceCB, tp: Class[ENTITY]): ENTITY = {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback[ENTITY, MemberServiceCB]() {
            def callbackSelectList(lcb: MemberServiceCB, ltp: Class[ENTITY]): List[ENTITY] = { return doSelectList(lcb, ltp); } });
    }

    protected def doSelectOptionalEntity[ENTITY <: DbleMemberService](cb: MemberServiceCB, tp: Class[ENTITY]): Option[ENTITY] = {
        return Option.apply(doSelectEntity(cb, tp));
    }

    @Override
    protected def doReadEntity(cb: ConditionBean): Entity = {
        return doSelectEntity(downcast(cb), classOf[DbleMemberService]);
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
     * @param cb The condition-bean of DbleMemberService. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (point is not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    def selectEntityWithDeletedCheck(cb: MemberServiceCB): MemberService = {
        return new MemberService(doSelectEntityWithDeletedCheck(cb, classOf[DbleMemberService]));
    }

    protected def doSelectEntityWithDeletedCheck[ENTITY <: DbleMemberService](cb: MemberServiceCB, tp: Class[ENTITY]): ENTITY = {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback[ENTITY, MemberServiceCB]() {
            def callbackSelectList(lcb: MemberServiceCB, ltp: Class[ENTITY]): List[ENTITY] = { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected def doReadEntityWithDeletedCheck(cb: ConditionBean): Entity = {
        return doSelectEntityWithDeletedCheck(downcast(cb), classOf[DbleMemberService]);
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
        return doSelectByPK(memberServiceId, classOf[DbleMemberService]).map(f => new MemberService(f));
    }

    protected def doSelectByPK[ENTITY <: DbleMemberService](memberServiceId: Integer, entityType: Class[ENTITY]): Option[ENTITY] = {
        return Option.apply(doSelectEntity(xprepareCBAsPK(memberServiceId), entityType));
    }

    protected def xprepareCBAsPK(memberServiceId: Integer): MemberServiceCB = {
        assertObjectNotNull("memberServiceId", memberServiceId);
        val cb: MemberServiceCB = newMyConditionBean();
        cb.query().setMemberServiceId_Equal(memberServiceId);;
        return cb;
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
        return doSelectByUniqueOf(memberId, classOf[DbleMemberService]).map(f => new MemberService(f));
    }

    protected def doSelectByUniqueOf[ENTITY <: DbleMemberService](memberId: Integer, entityType: Class[ENTITY]): Option[ENTITY] = {
        return Option.apply(doSelectEntity(xprepareCBAsUniqueOf(memberId), entityType));
    }

    protected def xprepareCBAsUniqueOf(memberId: Integer): MemberServiceCB = {
        assertObjectNotNull("memberId", memberId);
        val cb: MemberServiceCB = newMyConditionBean(); cb.acceptUniqueOf(memberId);
        return cb;
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
     * @param cb The condition-bean of DbleMemberService. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    def selectList(cb: MemberServiceCB): scala.collection.immutable.List[MemberService] = {
        val dbleList = doSelectList(cb, classOf[DbleMemberService]);
        return toImmutableEntityList(dbleList);
    }

    protected def doSelectList[ENTITY <: DbleMemberService](cb: MemberServiceCB, tp: Class[ENTITY]): ListResultBean[ENTITY] = {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback[ENTITY, MemberServiceCB]() {
            def callbackSelectList(lcb: MemberServiceCB, ltp: Class[ENTITY]): List[ENTITY] = { return delegateSelectList(lcb, ltp); } });
    }

    @Override
    protected def doReadList(cb: ConditionBean): ListResultBean[_ <: Entity] = {
        return doSelectList(downcast(cb), classOf[DbleMemberService]); // use do method for ListResultBean
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
     * @param cb The condition-bean of DbleMemberService. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    def selectPage(cb: MemberServiceCB): PagingResultBean[DbleMemberService] = {
        return doSelectPage(cb, classOf[DbleMemberService]);
    }

    protected def doSelectPage[ENTITY <: DbleMemberService](cb: MemberServiceCB, tp: Class[ENTITY]): PagingResultBean[ENTITY] = {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback[ENTITY, MemberServiceCB]() {
            def callbackSelectCount(cb: MemberServiceCB): Int = { return doSelectCountPlainly(cb); }
            def callbackSelectList(cb: MemberServiceCB, tp: Class[ENTITY]): List[ENTITY] = { return doSelectList(cb, tp); }
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
    def selectCursor(cb: MemberServiceCB, entityRowHandler: EntityRowHandler[DbleMemberService]): Unit = {
        doSelectCursor(cb, entityRowHandler, classOf[DbleMemberService]);
    }

    protected def doSelectCursor[ENTITY <: DbleMemberService](cb: MemberServiceCB, handler: EntityRowHandler[ENTITY], tp: Class[ENTITY]): Unit = {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback[ENTITY, MemberServiceCB]() {
            def callbackSelectCursor(cb: MemberServiceCB, handler: EntityRowHandler[ENTITY], tp: Class[ENTITY]): Unit = { delegateSelectCursor(cb, handler, tp); }
            def callbackSelectList(cb: MemberServiceCB, tp: Class[ENTITY]): List[ENTITY] = { return doSelectList(cb, tp); }
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
    def scalarSelect[RESULT](resultType: Class[RESULT]): SLFunction[MemberServiceCB, RESULT] = {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected def doScalarSelect[RESULT, CB <: MemberServiceCB](tp: Class[RESULT], cb: CB): SLFunction[CB, RESULT] = {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction[RESULT, CB](cb, tp);
    }

    protected def createSLFunction[RESULT, CB <: MemberServiceCB](cb: CB, tp: Class[RESULT]): SLFunction[CB, RESULT] = {
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
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'DbleMember'.
     * @param memberServiceList The list of memberService. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    def pulloutMember(memberServiceList: scala.collection.immutable.List[DbleMemberService]): scala.collection.immutable.List[DbleMember] = {
        return toScalaList(helpPulloutInternally(memberServiceList.asJava, new InternalPulloutCallback[DbleMemberService, DbleMember]() {
            def getFr(et: DbleMemberService): DbleMember =
            { return et.getMember().get; }
            def hasRf(): Boolean = { return true; }
            def setRfLs(et: DbleMember, ls: List[DbleMemberService]): Unit =
            { if (!ls.isEmpty()) { et.setMemberServiceAsOne(Option.apply(ls.get(0))); } }
        }));
    }
    /**
     * Pull out the list of foreign table 'DbleServiceRank'.
     * @param memberServiceList The list of memberService. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    def pulloutServiceRank(memberServiceList: scala.collection.immutable.List[DbleMemberService]): scala.collection.immutable.List[DbleServiceRank] = {
        return toScalaList(helpPulloutInternally(memberServiceList.asJava, new InternalPulloutCallback[DbleMemberService, DbleServiceRank]() {
            def getFr(et: DbleMemberService): DbleServiceRank =
            { return et.getServiceRank().get; }
            def hasRf(): Boolean = { return true; }
            def setRfLs(et: DbleServiceRank, ls: List[DbleMemberService]): Unit =
            { et.setMemberServiceList(ls); }
        }));
    }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key memberServiceId.
     * @param memberServiceList The list of memberService. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    def extractMemberServiceIdList(memberServiceList: List[DbleMemberService]): List[Integer] = {
        return helpExtractListInternally(memberServiceList, new InternalExtractCallback[DbleMemberService, Integer]() {
            def getCV(et: DbleMemberService): Integer = { return et.getMemberServiceId(); }
        });
    }

    /**
     * Extract the value list of (single) unique key memberId.
     * @param memberServiceList The list of memberService. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    def extractMemberIdList(memberServiceList: List[DbleMemberService]): List[Integer] = {
        return helpExtractListInternally(memberServiceList, new InternalExtractCallback[DbleMemberService, Integer]() {
            def getCV(et: DbleMemberService): Integer = { return et.getMemberId(); }
        });
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
     * @param memberService The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    def insert(memberService: DbleMemberService): Unit = {
        doInsert(memberService, null);
    }

    protected def doInsert(memberService: DbleMemberService, op: InsertOption[MemberServiceCB]): Unit = {
        assertObjectNotNull("memberService", memberService);
        prepareInsertOption(op);
        delegateInsert(memberService, op);
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
        if (op == null) { insert(downcast(et)); }
        else { varyingInsert(downcast(et), downcast(op)); }
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
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * memberService.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     memberServiceBhv.<span style="color: #DD4747">update</span>(memberService);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param memberService The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    def update(setting: (MbleMemberService) => Unit): Unit = {
        val mble = new MbleMemberService();
        setting(mble);
        doUpdate(mble.toDBableEntity, null);
    }

    protected def doUpdate(memberService: DbleMemberService, op: UpdateOption[MemberServiceCB]): Unit = {
        assertObjectNotNull("memberService", memberService);
        prepareUpdateOption(op);
        helpUpdateInternally(memberService, new InternalUpdateCallback[DbleMemberService]() {
            def callbackDelegateUpdate(et: DbleMemberService): Int = { return delegateUpdate(et, op); } });
    }

    protected def prepareUpdateOption(op: UpdateOption[MemberServiceCB]): Unit = {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected def createCBForVaryingUpdate(): MemberServiceCB = {
        val cb: MemberServiceCB = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected def createCBForSpecifiedUpdate(): MemberServiceCB = {
        val cb: MemberServiceCB = newMyConditionBean();
        cb.xsetupForSpecifiedUpdate();
        return cb;
    }

    @Override
    protected def doModify(et: Entity, op: UpdateOption[_ <: ConditionBean]): Unit = {
        if (op == null) { doUpdate(downcast(et), null); }
        else { varyingUpdate(downcast(et), downcast(op)); }
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
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//memberService.setVersionNo(value);</span>
     * memberServiceBhv.<span style="color: #DD4747">updateNonstrict</span>(memberService);
     * </pre>
     * @param memberService The entity of update target. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    def updateNonstrict(memberService: DbleMemberService): Unit = {
        doUpdateNonstrict(memberService, null);
    }

    protected def doUpdateNonstrict(memberService: DbleMemberService, op: UpdateOption[MemberServiceCB]): Unit = {
        assertObjectNotNull("memberService", memberService);
        prepareUpdateOption(op);
        helpUpdateNonstrictInternally(memberService, new InternalUpdateNonstrictCallback[DbleMemberService]() {
            def callbackDelegateUpdateNonstrict(et: DbleMemberService): Int = { return delegateUpdateNonstrict(et, op); } });
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
     * @param memberService The entity of insert or update target. (NotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    def insertOrUpdate(memberService: DbleMemberService): Unit = {
        doInesrtOrUpdate(memberService, null, null);
    }

    protected def doInesrtOrUpdate(memberService: DbleMemberService, iop: InsertOption[MemberServiceCB], uop: UpdateOption[MemberServiceCB]): Unit = {
        helpInsertOrUpdateInternally(memberService, new InternalInsertOrUpdateCallback[DbleMemberService, MemberServiceCB]() {
            def callbackInsert(et: DbleMemberService): Unit = { doInsert(et, iop); }
            def callbackUpdate(et: DbleMemberService): Unit = { doUpdate(et, uop); }
            def callbackNewMyConditionBean(): MemberServiceCB = { return newMyConditionBean(); }
            def callbackSelectCount(cb: MemberServiceCB): Int = { return selectCount(cb); }
        });
    }

    @Override
    protected def doCreateOrModify(et: Entity, iop: InsertOption[_ <: ConditionBean], uop: UpdateOption[_ <: ConditionBean]): Unit = {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            val niop = if (iop != null) { iop } else { new InsertOption[MemberServiceCB]() };
            val nuop = if (uop != null) { uop } else { new UpdateOption[MemberServiceCB]() };
            varyingInsertOrUpdate(downcast(et), downcast(niop), downcast(nuop));
        }
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param memberService The entity of insert or update target. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    def insertOrUpdateNonstrict(memberService: DbleMemberService): Unit = {
        doInesrtOrUpdateNonstrict(memberService, null, null);
    }

    protected def doInesrtOrUpdateNonstrict(memberService: DbleMemberService, iop: InsertOption[MemberServiceCB], uop: UpdateOption[MemberServiceCB]): Unit = {
        helpInsertOrUpdateInternally(memberService, new InternalInsertOrUpdateNonstrictCallback[DbleMemberService]() {
            def callbackInsert(et: DbleMemberService): Unit = { doInsert(et, iop); }
            def callbackUpdateNonstrict(et: DbleMemberService): Unit = { doUpdateNonstrict(et, uop); }
        });
    }

    @Override
    protected def doCreateOrModifyNonstrict(et: Entity, iop: InsertOption[_ <: ConditionBean], uop: UpdateOption[_ <: ConditionBean]): Unit = {
        if (iop == null && uop == null) { insertOrUpdateNonstrict(downcast(et)); }
        else {
            val niop = if (iop != null) { iop } else { new InsertOption[MemberServiceCB]() };
            val nuop = if (uop != null) { uop } else { new UpdateOption[MemberServiceCB]() };
            varyingInsertOrUpdateNonstrict(downcast(et), downcast(niop), downcast(nuop));
        }
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl)
     * <pre>
     * DbleMemberService memberService = new DbleMemberService();
     * memberService.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * memberService.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     memberServiceBhv.<span style="color: #DD4747">delete</span>(memberService);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param memberService The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    def delete(memberService: DbleMemberService): Unit = {
        doDelete(memberService, null);
    }

    protected def doDelete(memberService: DbleMemberService, op: DeleteOption[MemberServiceCB]): Unit = {
        assertObjectNotNull("memberService", memberService);
        prepareDeleteOption(op);
        helpDeleteInternally(memberService, new InternalDeleteCallback[DbleMemberService]() {
            def callbackDelegateDelete(et: DbleMemberService): Int = { return delegateDelete(et, op); } });
    }

    protected def prepareDeleteOption(op: DeleteOption[MemberServiceCB]): Unit = {
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
     * DbleMemberService memberService = new DbleMemberService();
     * memberService.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//memberService.setVersionNo(value);</span>
     * memberServiceBhv.<span style="color: #DD4747">deleteNonstrict</span>(memberService);
     * </pre>
     * @param memberService The entity of delete target. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    def deleteNonstrict(memberService: DbleMemberService): Unit = {
        doDeleteNonstrict(memberService, null);
    }

    protected def doDeleteNonstrict(memberService: DbleMemberService, op: DeleteOption[MemberServiceCB]): Unit = {
        assertObjectNotNull("memberService", memberService);
        prepareDeleteOption(op);
        helpDeleteNonstrictInternally(memberService, new InternalDeleteNonstrictCallback[DbleMemberService]() {
            def callbackDelegateDeleteNonstrict(et: DbleMemberService): Int = { return delegateDeleteNonstrict(et, op); } });
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * DbleMemberService memberService = new DbleMemberService();
     * memberService.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//memberService.setVersionNo(value);</span>
     * memberServiceBhv.<span style="color: #DD4747">deleteNonstrictIgnoreDeleted</span>(memberService);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param memberService The entity of delete target. (NotNull, PrimaryKeyNotNull)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    def deleteNonstrictIgnoreDeleted(memberService: DbleMemberService): Unit = {
        doDeleteNonstrictIgnoreDeleted(memberService, null);
    }

    protected def doDeleteNonstrictIgnoreDeleted(memberService: DbleMemberService, op: DeleteOption[MemberServiceCB]): Unit = {
        assertObjectNotNull("memberService", memberService);
        prepareDeleteOption(op);
        helpDeleteNonstrictIgnoreDeletedInternally(memberService, new InternalDeleteNonstrictIgnoreDeletedCallback[DbleMemberService]() {
            def callbackDelegateDeleteNonstrict(et: DbleMemberService): Int = { return delegateDeleteNonstrict(et, op); } });
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
    def batchInsert(memberServiceList: scala.collection.immutable.List[DbleMemberService]): Array[Int] = {
        val op: InsertOption[MemberServiceCB] = createInsertUpdateOption();
        return doBatchInsert(memberServiceList.asJava, op);
    }

    protected def doBatchInsert(memberServiceList: List[DbleMemberService], op: InsertOption[MemberServiceCB]): Array[Int] = {
        assertObjectNotNull("memberServiceList", memberServiceList);
        prepareBatchInsertOption(memberServiceList, op);
        return delegateBatchInsert(memberServiceList, op);
    }

    protected def prepareBatchInsertOption(memberServiceList: List[DbleMemberService], op: InsertOption[MemberServiceCB]): Unit = {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(memberServiceList);
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
    def batchUpdate(memberServiceList: scala.collection.immutable.List[DbleMemberService]): Array[Int] = {
        val op: UpdateOption[MemberServiceCB] = createPlainUpdateOption();
        return doBatchUpdate(memberServiceList.asJava, op);
    }

    protected def doBatchUpdate(memberServiceList: List[DbleMemberService], op: UpdateOption[MemberServiceCB]): Array[Int] = {
        assertObjectNotNull("memberServiceList", memberServiceList);
        prepareBatchUpdateOption(memberServiceList, op);
        return delegateBatchUpdate(memberServiceList, op);
    }

    protected def prepareBatchUpdateOption(memberServiceList: List[DbleMemberService], op: UpdateOption[MemberServiceCB]): Unit = {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(memberServiceList);
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
     * memberServiceBhv.<span style="color: #DD4747">batchUpdate</span>(memberServiceList, new SpecifyQuery[MemberServiceCB]() {
     *     public void specify(MemberServiceCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * memberServiceBhv.<span style="color: #DD4747">batchUpdate</span>(memberServiceList, new SpecifyQuery[MemberServiceCB]() {
     *     public void specify(MemberServiceCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param memberServiceList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    def batchUpdate(memberServiceList: scala.collection.immutable.List[DbleMemberService], updateColumnSpec: SpecifyQuery[MemberServiceCB]): Array[Int] = {
        return doBatchUpdate(memberServiceList.asJava, createSpecifiedUpdateOption(updateColumnSpec));
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
    def batchUpdateNonstrict(memberServiceList: scala.collection.immutable.List[DbleMemberService]): Array[Int] = {
        val option: UpdateOption[MemberServiceCB] = createPlainUpdateOption();
        return doBatchUpdateNonstrict(memberServiceList.asJava, option);
    }

    protected def doBatchUpdateNonstrict(memberServiceList: List[DbleMemberService], op: UpdateOption[MemberServiceCB]): Array[Int] = {
        assertObjectNotNull("memberServiceList", memberServiceList);
        prepareBatchUpdateOption(memberServiceList, op);
        return delegateBatchUpdateNonstrict(memberServiceList, op);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * memberServiceBhv.<span style="color: #DD4747">batchUpdateNonstrict</span>(memberServiceList, new SpecifyQuery[MemberServiceCB]() {
     *     public void specify(MemberServiceCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * memberServiceBhv.<span style="color: #DD4747">batchUpdateNonstrict</span>(memberServiceList, new SpecifyQuery[MemberServiceCB]() {
     *     public void specify(MemberServiceCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param memberServiceList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    def batchUpdateNonstrict(memberServiceList: scala.collection.immutable.List[DbleMemberService], updateColumnSpec: SpecifyQuery[MemberServiceCB]): Array[Int] = {
        return doBatchUpdateNonstrict(memberServiceList.asJava, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected def doLumpModifyNonstrict(ls: List[Entity], op: UpdateOption[_ <: ConditionBean]): Array[Int] = {
        if (op == null) { return batchUpdateNonstrict(toScalaList(downcast(ls))); }
        else { return varyingBatchUpdateNonstrict(toScalaList(downcast(ls)), downcast(op)); }
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param memberServiceList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    def batchDelete(memberServiceList: scala.collection.immutable.List[DbleMemberService]): Array[Int] = {
        return doBatchDelete(memberServiceList.asJava, null);
    }

    protected def doBatchDelete(memberServiceList: List[DbleMemberService], op: DeleteOption[MemberServiceCB]): Array[Int] = {
        assertObjectNotNull("memberServiceList", memberServiceList);
        prepareDeleteOption(op);
        return delegateBatchDelete(memberServiceList, op);
    }

    @Override
    protected def doLumpRemove(ls: List[Entity], op: DeleteOption[_ <: ConditionBean]): Array[Int] = {
        if (op == null) { return batchDelete(toScalaList(downcast(ls))); }
        else { return varyingBatchDelete(toScalaList(downcast(ls)), downcast(op)); }
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param memberServiceList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    def batchDeleteNonstrict(memberServiceList: scala.collection.immutable.List[DbleMemberService]): Array[Int] = {
        return doBatchDeleteNonstrict(memberServiceList.asJava, null);
    }

    protected def doBatchDeleteNonstrict(memberServiceList: List[DbleMemberService], op: DeleteOption[MemberServiceCB]): Array[Int] = {
        assertObjectNotNull("memberServiceList", memberServiceList);
        prepareDeleteOption(op);
        return delegateBatchDeleteNonstrict(memberServiceList, op);
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
    def queryInsert(setupper: QueryInsertSetupper[DbleMemberService, MemberServiceCB]): Int = {
        return Integer2int(doQueryInsert(setupper, null));
    }

    protected def doQueryInsert(sp: QueryInsertSetupper[DbleMemberService, MemberServiceCB], op: InsertOption[MemberServiceCB]): Integer = {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        val e: DbleMemberService = new DbleMemberService();
        val cb: MemberServiceCB = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
    }

    protected def createCBForQueryInsert(): MemberServiceCB = {
        val cb: MemberServiceCB = newMyConditionBean();
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
     * DbleMemberService memberService = new DbleMemberService();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//memberService.setPK...(value);</span>
     * memberService.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//memberService.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//memberService.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//memberService.setVersionNo(value);</span>
     * MemberServiceCB cb = new MemberServiceCB();
     * cb.query().setFoo...(value);
     * memberServiceBhv.<span style="color: #DD4747">queryUpdate</span>(memberService, cb);
     * </pre>
     * @param memberService The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of DbleMemberService. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    def queryUpdate(memberService: DbleMemberService, cb: MemberServiceCB): Int = {
        return Integer2int(doQueryUpdate(memberService, cb, null));
    }

    protected def doQueryUpdate(memberService: DbleMemberService, cb: MemberServiceCB, op: UpdateOption[MemberServiceCB]): Integer = {
        assertObjectNotNull("memberService", memberService); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return if (checkCountBeforeQueryUpdateIfNeeds(cb)) { delegateQueryUpdate(memberService, cb, op) } else { 0 };
    }

    @Override
    protected def doRangeModify(et: Entity, cb: ConditionBean, op: UpdateOption[_ <: ConditionBean]): Int = {
        if (op == null) { return queryUpdate(downcast(et), cb.asInstanceOf[MemberServiceCB]); }
        else { return varyingQueryUpdate(downcast(et), cb.asInstanceOf[MemberServiceCB], downcast(op)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * MemberServiceCB cb = new MemberServiceCB();
     * cb.query().setFoo...(value);
     * memberServiceBhv.<span style="color: #DD4747">queryDelete</span>(memberService, cb);
     * </pre>
     * @param cb The condition-bean of DbleMemberService. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    def queryDelete(cb: MemberServiceCB): Int = {
        return Integer2int(doQueryDelete(cb, null));
    }

    protected def doQueryDelete(cb: MemberServiceCB, op: DeleteOption[MemberServiceCB]): Integer = {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return if (checkCountBeforeQueryUpdateIfNeeds(cb)) { delegateQueryDelete(cb, op) } else { 0 };
    }

    @Override
    protected def doRangeRemove(cb: ConditionBean, op: DeleteOption[_ <: ConditionBean]): Int = {
        if (op == null) { return queryDelete(cb.asInstanceOf[MemberServiceCB]); }
        else { return varyingQueryDelete(cb.asInstanceOf[MemberServiceCB], downcast(op)); }
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
     * DbleMemberService memberService = new DbleMemberService();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * memberService.setFoo...(value);
     * memberService.setBar...(value);
     * InsertOption[MemberServiceCB] option = new InsertOption[MemberServiceCB]();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * memberServiceBhv.<span style="color: #DD4747">varyingInsert</span>(memberService, option);
     * ... = memberService.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param memberService The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    def varyingInsert(memberService: DbleMemberService, option: InsertOption[MemberServiceCB]): Unit = {
        assertInsertOptionNotNull(option);
        doInsert(memberService, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * DbleMemberService memberService = new DbleMemberService();
     * memberService.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * memberService.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * memberService.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;MemberServiceCB&gt; option = new UpdateOption&lt;MemberServiceCB&gt;();
     *     option.self(new SpecifyQuery&lt;MemberServiceCB&gt;() {
     *         public void specify(MemberServiceCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     memberServiceBhv.<span style="color: #DD4747">varyingUpdate</span>(memberService, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param memberService The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    def varyingUpdate(memberService: DbleMemberService, option: UpdateOption[MemberServiceCB]): Unit = {
        assertUpdateOptionNotNull(option);
        doUpdate(memberService, option);
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * DbleMemberService memberService = new DbleMemberService();
     * memberService.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * memberService.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//memberService.setVersionNo(value);</span>
     * UpdateOption&lt;MemberServiceCB&gt; option = new UpdateOption&lt;MemberServiceCB&gt;();
     * option.self(new SpecifyQuery&lt;MemberServiceCB&gt;() {
     *     public void specify(MemberServiceCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * memberServiceBhv.<span style="color: #DD4747">varyingUpdateNonstrict</span>(memberService, option);
     * </pre>
     * @param memberService The entity of update target. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    def varyingUpdateNonstrict(memberService: DbleMemberService, option: UpdateOption[MemberServiceCB]): Unit = {
        assertUpdateOptionNotNull(option);
        doUpdateNonstrict(memberService, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param memberService The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    def varyingInsertOrUpdate(memberService: DbleMemberService, insertOption: InsertOption[MemberServiceCB], updateOption: UpdateOption[MemberServiceCB]): Unit = {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(memberService, insertOption, updateOption);
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param memberService The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    def varyingInsertOrUpdateNonstrict(memberService: DbleMemberService, insertOption: InsertOption[MemberServiceCB], updateOption: UpdateOption[MemberServiceCB]): Unit = {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdateNonstrict(memberService, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param memberService The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    def varyingDelete(memberService: DbleMemberService, option: DeleteOption[MemberServiceCB]): Unit = {
        assertDeleteOptionNotNull(option);
        doDelete(memberService, option);
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as deleteNonstrict(entity).
     * @param memberService The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    def varyingDeleteNonstrict(memberService: DbleMemberService, option: DeleteOption[MemberServiceCB]): Unit = {
        assertDeleteOptionNotNull(option);
        doDeleteNonstrict(memberService, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param memberServiceList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    def varyingBatchInsert(memberServiceList: scala.collection.immutable.List[DbleMemberService], option: InsertOption[MemberServiceCB]): Array[Int] = {
        assertInsertOptionNotNull(option);
        return doBatchInsert(memberServiceList.asJava, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param memberServiceList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    def varyingBatchUpdate(memberServiceList: scala.collection.immutable.List[DbleMemberService], option: UpdateOption[MemberServiceCB]): Array[Int] = {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(memberServiceList.asJava, option);
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param memberServiceList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    def varyingBatchUpdateNonstrict(memberServiceList: scala.collection.immutable.List[DbleMemberService], option: UpdateOption[MemberServiceCB]): Array[Int] = {
        assertUpdateOptionNotNull(option);
        return doBatchUpdateNonstrict(memberServiceList.asJava, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param memberServiceList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    def varyingBatchDelete(memberServiceList: scala.collection.immutable.List[DbleMemberService], option: DeleteOption[MemberServiceCB]): Array[Int] = {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(memberServiceList.asJava, option);
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param memberServiceList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    def varyingBatchDeleteNonstrict(memberServiceList: scala.collection.immutable.List[DbleMemberService], option: DeleteOption[MemberServiceCB]): Array[Int] = {
        assertDeleteOptionNotNull(option);
        return doBatchDeleteNonstrict(memberServiceList.asJava, option);
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
    def varyingQueryInsert(setupper: QueryInsertSetupper[DbleMemberService, MemberServiceCB], option: InsertOption[MemberServiceCB]): Integer = {
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
     * DbleMemberService memberService = new DbleMemberService();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//memberService.setPK...(value);</span>
     * memberService.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//memberService.setVersionNo(value);</span>
     * MemberServiceCB cb = new MemberServiceCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;MemberServiceCB&gt; option = new UpdateOption&lt;MemberServiceCB&gt;();
     * option.self(new SpecifyQuery&lt;MemberServiceCB&gt;() {
     *     public void specify(MemberServiceCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * memberServiceBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(memberService, cb, option);
     * </pre>
     * @param memberService The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of DbleMemberService. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    def varyingQueryUpdate(memberService: DbleMemberService, cb: MemberServiceCB, option: UpdateOption[MemberServiceCB]): Integer = {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(memberService, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of DbleMemberService. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    def varyingQueryDelete(cb: MemberServiceCB, option: DeleteOption[MemberServiceCB]): Integer = {
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
    def outsideSql(): OutsideSqlBasicExecutor[MemberServiceBhv] = {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected def delegateSelectCountUniquely(cb: MemberServiceCB): Integer = { return invoke(createSelectCountCBCommand(cb, true)); }
    protected def delegateSelectCountPlainly(cb: MemberServiceCB): Integer = { return invoke(createSelectCountCBCommand(cb, false)); }
    protected def delegateSelectCursor[ENTITY <: DbleMemberService](cb: MemberServiceCB, rh: EntityRowHandler[ENTITY], tp: Class[ENTITY])
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected def delegateSelectList[ENTITY <: DbleMemberService](cb: MemberServiceCB, tp: Class[ENTITY]): List[ENTITY] =
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected def delegateInsert(et: DbleMemberService, op: InsertOption[MemberServiceCB]): Integer =
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected def delegateUpdate(et: DbleMemberService, op: UpdateOption[MemberServiceCB]): Integer =
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateEntityCommand(et, op)); }
    protected def delegateUpdateNonstrict(et: DbleMemberService, op: UpdateOption[MemberServiceCB]): Integer =
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected def delegateDelete(et: DbleMemberService, op: DeleteOption[MemberServiceCB]): Integer =
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteEntityCommand(et, op)); }
    protected def delegateDeleteNonstrict(et: DbleMemberService, op: DeleteOption[MemberServiceCB]): Integer =
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

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

    protected def delegateQueryInsert(et: DbleMemberService, inCB: MemberServiceCB, resCB: ConditionBean, op: InsertOption[MemberServiceCB]): Integer =
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; }
      return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected def delegateQueryUpdate(et: DbleMemberService, cb: MemberServiceCB, op: UpdateOption[MemberServiceCB]): Integer =
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; }
      return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected def delegateQueryDelete(cb: MemberServiceCB, op: DeleteOption[MemberServiceCB]): Integer =
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
    //                                                                     Downcast Helper
    //                                                                     ===============
    protected def downcast(et: Entity): DbleMemberService = {
        return helpEntityDowncastInternally(et, classOf[DbleMemberService]);
    }

    protected def downcast(cb: ConditionBean): MemberServiceCB = {
        return helpConditionBeanDowncastInternally(cb, classOf[MemberServiceCB]);
    }

    protected def downcast(ls: List[_ <: Entity]): List[DbleMemberService] = {
        return ls.asInstanceOf[List[DbleMemberService]];
    }

    protected def downcast(op: InsertOption[_ <: ConditionBean]): InsertOption[MemberServiceCB] = {
        return op.asInstanceOf[InsertOption[MemberServiceCB]];
    }

    protected def downcast(op: UpdateOption[_ <: ConditionBean]): UpdateOption[MemberServiceCB] = {
        return op.asInstanceOf[UpdateOption[MemberServiceCB]];
    }

    protected def downcast(op: DeleteOption[_ <: ConditionBean]): DeleteOption[MemberServiceCB] = {
        return op.asInstanceOf[DeleteOption[MemberServiceCB]];
    }

    protected def downcast(sp: QueryInsertSetupper[_ <: Entity, _ <: ConditionBean]): QueryInsertSetupper[DbleMemberService, MemberServiceCB] = {
        return sp.asInstanceOf[QueryInsertSetupper[DbleMemberService, MemberServiceCB]];
    }

    // ===================================================================================
    //                                                                        Scala Helper
    //                                                                        ============
    protected def toScalaList[ENTITY](javaList: Collection[ENTITY]): scala.collection.immutable.List[ENTITY] = {
        if (javaList == null) { scala.collection.immutable.List() }
        return scala.collection.immutable.List.fromArray(javaList.toArray()).asInstanceOf[scala.collection.immutable.List[ENTITY]];
    }

    def toImmutableEntityList(dbleList: Collection[DbleMemberService]): scala.collection.immutable.List[MemberService] = {
        return toScalaList(dbleList).map(new MemberService(_))
    }

    def toDBableEntityList(immuList: scala.collection.immutable.List[MemberService]): List[DbleMemberService] = {
        return immuList.map(new DbleMemberService().acceptImmutableEntity(_)).asJava
    }
}
