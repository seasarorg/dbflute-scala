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
import org.seasar.dbflute.util._;
import org.seasar.dbflute.outsidesql.executor._;
import com.example.dbflute.scala.dbflute.allcommon._;
import com.example.dbflute.scala.dbflute.exbhv._;
import com.example.dbflute.scala.dbflute.exentity._;
import com.example.dbflute.scala.dbflute.bsentity.dbmeta._;
import com.example.dbflute.scala.dbflute.cbean._;

/**
 * The behavior of (購入支払)PURCHASE_PAYMENT as TABLE. <br />
 * <pre>
 * [primary key]
 *     PURCHASE_PAYMENT_ID
 *
 * [column]
 *     PURCHASE_PAYMENT_ID, PURCHASE_ID, PAYMENT_AMOUNT, PAYMENT_DATETIME, PAYMENT_METHOD_CODE, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PURCHASE_PAYMENT_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     PURCHASE
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     purchase
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
abstract class BsPurchasePaymentBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    def getTableDbName(): String = { return "PURCHASE_PAYMENT"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    def getDBMeta(): DBMeta = { return PurchasePaymentDbm; }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    def newEntity(): Entity = { return newMyEntity(); }

    /** {@inheritDoc} */
    def newConditionBean(): ConditionBean = { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    def newMyEntity(): DblePurchasePayment = { return new DblePurchasePayment(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    def newMyConditionBean(): PurchasePaymentCB = { return new PurchasePaymentCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * PurchasePaymentCB cb = new PurchasePaymentCB();
     * cb.query().setFoo...(value);
     * int count = purchasePaymentBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of DblePurchasePayment. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    def selectCount(cbCall: (PurchasePaymentCB) => Unit): Int = {
        return facadeSelectCount(callbackCB(cbCall));
    }

    def facadeSelectCount(cb: PurchasePaymentCB): Int = {
        return Integer2int(doSelectCountUniquely(cb));
    }

    protected def doSelectCountUniquely(cb: PurchasePaymentCB): Integer = { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected def doSelectCountPlainly(cb: PurchasePaymentCB): Integer = { // called by selectPage(cb)
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
     * PurchasePaymentCB cb = new PurchasePaymentCB();
     * cb.query().setFoo...(value);
     * OptionalEntity&lt;DblePurchasePayment&gt; entity = purchasePaymentBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     *
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * entity.<span style="color: #DD4747">required</span>(purchasePayment -&gt; {
     *     ...
     * });
     * DblePurchasePayment purchasePayment = entity.entity.<span style="color: #DD4747">get()</span>;
     *
     * <span style="color: #3F7E5E">// if it might be no data, ifPresent(), isPresent(), ...</span>
     * entity.<span style="color: #DD4747">ifPresent</span>(purchasePayment -&gt; {
     *     ...
     * });
     * if (entity.entity.<span style="color: #DD4747">isPresent()</span>) {
     *     DblePurchasePayment purchasePayment = entity.entity.<span style="color: #DD4747">get()</span>;
     * } else {
     *     ...
     * }
     * </pre>
     * @param cbCall The callback for condition-bean of PurchasePayment. (NotNull)
     * @param loaderCall The callback for referrer loader of PurchasePayment. (NoArgAllowed: then no loading)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get() of return value is called and the value is null, which means entity has already been deleted (point is not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    def selectEntity(cbCall: (PurchasePaymentCB) => Unit)(implicit loaderCall: (LoaderOfPurchasePayment) => Unit = null): Option[PurchasePayment] = {
        return facadeSelectEntity(callbackCB(cbCall))(loaderCall);
    }

    protected def facadeSelectEntity(cb: PurchasePaymentCB)(loaderCall: (LoaderOfPurchasePayment) => Unit = null): Option[PurchasePayment] = {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity())(loaderCall).map(f => new PurchasePayment(f));
    }

    protected def doSelectEntity[ENTITY <: DblePurchasePayment](cb: PurchasePaymentCB, tp: Class[ENTITY])(loaderCall: (LoaderOfPurchasePayment) => Unit = null): ENTITY = {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        val dble = helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback[ENTITY, PurchasePaymentCB]() {
            def callbackSelectList(lcb: PurchasePaymentCB, ltp: Class[ENTITY]): List[ENTITY] = { return doSelectList(lcb, ltp)(); } });
        if (dble != null) {
            doCallbackLoader(DfCollectionUtil.newArrayList(dble.asInstanceOf[DblePurchasePayment]), loaderCall);
        }
        return dble;
    }

    protected def doSelectOptionalEntity[ENTITY <: DblePurchasePayment](cb: PurchasePaymentCB, tp: Class[ENTITY])(loaderCall: (LoaderOfPurchasePayment) => Unit = null): Option[ENTITY] = {
        return Option.apply(doSelectEntity(cb, tp)(loaderCall));
    }

    @Override
    protected def doReadEntity(cb: ConditionBean): Entity = {
        return doSelectEntity(downcast(cb), typeOfSelectedEntity())();
    }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * PurchasePaymentCB cb = new PurchasePaymentCB();
     * cb.query().setFoo...(value);
     * DblePurchasePayment purchasePayment = purchasePaymentBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = purchasePayment.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbCall The callback for condition-bean of PurchasePayment. (NotNull)
     * @param loaderCall The callback for referrer loader of PurchasePayment. (NoArgAllowed: then no loading)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (point is not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    def selectEntityWithDeletedCheck(cbCall: (PurchasePaymentCB) => Unit)(implicit loaderCall: (LoaderOfPurchasePayment) => Unit = null): PurchasePayment = {
        return facadeSelectEntityWithDeletedCheck(callbackCB(cbCall))(loaderCall);
    }

    protected def facadeSelectEntityWithDeletedCheck(cb: PurchasePaymentCB)(loaderCall: (LoaderOfPurchasePayment) => Unit = null): PurchasePayment = {
        return new PurchasePayment(doSelectEntityWithDeletedCheck(cb, typeOfSelectedEntity())(loaderCall));
    }

    protected def doSelectEntityWithDeletedCheck[ENTITY <: DblePurchasePayment](cb: PurchasePaymentCB, tp: Class[ENTITY])(loaderCall: (LoaderOfPurchasePayment) => Unit = null): ENTITY = {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        val dble = helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback[ENTITY, PurchasePaymentCB]() {
            def callbackSelectList(lcb: PurchasePaymentCB, ltp: Class[ENTITY]): List[ENTITY] = { return doSelectList(lcb, ltp)(); } });
        doCallbackLoader(DfCollectionUtil.newArrayList(dble.asInstanceOf[DblePurchasePayment]), loaderCall);
        return dble;
    }

    @Override
    protected def doReadEntityWithDeletedCheck(cb: ConditionBean): Entity = {
        return doSelectEntityWithDeletedCheck(downcast(cb), typeOfSelectedEntity())();
    }

    /**
     * Select the entity by the primary-key value.
     * @param purchasePaymentId (購入支払ID): PK, ID, NotNull, BIGINT(19). (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    def selectByPK(purchasePaymentId: Long): Option[PurchasePayment] = {
        return facadeSelectByPK(purchasePaymentId);
    }

    def facadeSelectByPK(purchasePaymentId: Long): Option[PurchasePayment] = {
        return doSelectByPK(purchasePaymentId, typeOfSelectedEntity()).map(f => new PurchasePayment(f));
    }

    protected def doSelectByPK[ENTITY <: DblePurchasePayment](purchasePaymentId: Long, entityType: Class[ENTITY]): Option[ENTITY] = {
        return Option.apply(doSelectEntity(xprepareCBAsPK(purchasePaymentId), entityType)());
    }

    protected def xprepareCBAsPK(purchasePaymentId: Long): PurchasePaymentCB = {
        assertObjectNotNull("purchasePaymentId", purchasePaymentId);
        val cb: PurchasePaymentCB = newMyConditionBean();
        cb.query().setPurchasePaymentId_Equal(purchasePaymentId);;
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * PurchasePaymentCB cb = new PurchasePaymentCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * List&lt;${PurchasePayment}&gt; purchasePaymentList = purchasePaymentBhv.<span style="color: #DD4747">selectList</span>(cb);
     * purchasePaymentList.foreach(purchasePayment =>
     *     ... = purchasePayment...;
     * }
     * </pre>
     * @param cbCall The callback for condition-bean of PurchasePayment. (NotNull)
     * @param loaderCall The callback for referrer loader of PurchasePayment. (NoArgAllowed: then no loading)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    def selectList(cbCall: (PurchasePaymentCB) => Unit)(implicit loaderCall: (LoaderOfPurchasePayment) => Unit = null): scala.collection.immutable.List[PurchasePayment] = {
        return facadeSelectList(callbackCB(cbCall))(loaderCall);
    }

    protected def facadeSelectList(cb: PurchasePaymentCB)(loaderCall: (LoaderOfPurchasePayment) => Unit = null): scala.collection.immutable.List[PurchasePayment] = {
        return toImmutableEntityList(doSelectList(cb, typeOfSelectedEntity())(loaderCall));
    }

    protected def doSelectList[ENTITY <: DblePurchasePayment](cb: PurchasePaymentCB, tp: Class[ENTITY])(loaderCall: (LoaderOfPurchasePayment) => Unit = null): ListResultBean[ENTITY] = {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        val dbleList = helpSelectListInternally(cb, tp, new InternalSelectListCallback[ENTITY, PurchasePaymentCB]() {
            def callbackSelectList(lcb: PurchasePaymentCB, ltp: Class[ENTITY]): List[ENTITY] = { return delegateSelectList(lcb, ltp); } });
        doCallbackLoader(dbleList.asInstanceOf[List[DblePurchasePayment]], loaderCall);
        return dbleList;
    }

    @Override
    protected def doReadList(cb: ConditionBean): ListResultBean[_ <: Entity] = {
        return doSelectList(downcast(cb), typeOfSelectedEntity())();
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * PurchasePaymentCB cb = new PurchasePaymentCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;DblePurchasePayment&gt; page = purchasePaymentBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (DblePurchasePayment purchasePayment : page) {
     *     ... = purchasePayment.get...();
     * }
     * </pre>
     * @param cbCall The callback for condition-bean of PurchasePayment. (NotNull)
     * @param loaderCall The callback for referrer loader of PurchasePayment. (NoArgAllowed: then no loading)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    def selectPage(cbCall: (PurchasePaymentCB) => Unit)(implicit loaderCall: (LoaderOfPurchasePayment) => Unit = null): PagingResultBean[DblePurchasePayment] = {
        return facadeSelectPage(callbackCB(cbCall))(loaderCall);
    }

    def facadeSelectPage(cb: PurchasePaymentCB)(loaderCall: (LoaderOfPurchasePayment) => Unit = null): PagingResultBean[DblePurchasePayment] = {
        return doSelectPage(cb, typeOfSelectedEntity())(loaderCall);
    }

    protected def doSelectPage[ENTITY <: DblePurchasePayment](cb: PurchasePaymentCB, tp: Class[ENTITY])(loaderCall: (LoaderOfPurchasePayment) => Unit = null): PagingResultBean[ENTITY] = {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback[ENTITY, PurchasePaymentCB]() {
            def callbackSelectCount(cb: PurchasePaymentCB): Int = { return doSelectCountPlainly(cb); }
            def callbackSelectList(cb: PurchasePaymentCB, tp: Class[ENTITY]): List[ENTITY] = { return doSelectList(cb, tp)(loaderCall); }
        });
    }

    @Override
    protected def doReadPage(cb: ConditionBean): PagingResultBean[_ <: Entity] = {
        return doSelectPage(downcast(cb), typeOfSelectedEntity())();
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * PurchasePaymentCB cb = new PurchasePaymentCB();
     * cb.query().setFoo...(value);
     * purchasePaymentBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;DblePurchasePayment&gt;() {
     *     public void handle(DblePurchasePayment entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of DblePurchasePayment. (NotNull)
     * @param entityRowHandler The handler of entity row of DblePurchasePayment. (NotNull)
     */
    def selectCursor(cbCall: (PurchasePaymentCB) => Unit)(rowCall: (PurchasePayment) => Unit): Unit = {
        facadeSelectCursor(callbackCB(cbCall))(rowCall);
    }

    protected def facadeSelectCursor(cb: PurchasePaymentCB)(rowCall: (PurchasePayment) => Unit): Unit = {
        doSelectCursor(cb, new EntityRowHandler[DblePurchasePayment]() {
            def handle(entity: DblePurchasePayment): Unit = {
                rowCall(new PurchasePayment(entity))
            }
        }, typeOfSelectedEntity());
    }

    protected def doSelectCursor[ENTITY <: DblePurchasePayment](cb: PurchasePaymentCB, handler: EntityRowHandler[ENTITY], tp: Class[ENTITY]): Unit = {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback[ENTITY, PurchasePaymentCB]() {
            def callbackSelectCursor(cb: PurchasePaymentCB, handler: EntityRowHandler[ENTITY], tp: Class[ENTITY]): Unit = { delegateSelectCursor(cb, handler, tp); }
            def callbackSelectList(cb: PurchasePaymentCB, tp: Class[ENTITY]): List[ENTITY] = { return doSelectList(cb, tp)(); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * purchasePaymentBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(PurchasePaymentCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    def scalarSelect[RESULT](resultType: Class[RESULT]): SLFunction[PurchasePaymentCB, RESULT] = {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected def doScalarSelect[RESULT, CB <: PurchasePaymentCB](tp: Class[RESULT], cb: CB): SLFunction[CB, RESULT] = {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction[RESULT, CB](cb, tp);
    }

    protected def createSLFunction[RESULT, CB <: PurchasePaymentCB](cb: CB, tp: Class[RESULT]): SLFunction[CB, RESULT] = {
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
     * Pull out the list of foreign table 'DblePurchase'.
     * @param purchasePaymentList The list of purchasePayment. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    def pulloutPurchase(purchasePaymentList: scala.collection.immutable.List[DblePurchasePayment]): scala.collection.immutable.List[DblePurchase] = {
        return toScalaList(helpPulloutInternally(purchasePaymentList.asJava, new InternalPulloutCallback[DblePurchasePayment, DblePurchase]() {
            def getFr(et: DblePurchasePayment): DblePurchase =
            { return et.getPurchase().get; }
            def hasRf(): Boolean = { return true; }
            def setRfLs(et: DblePurchase, ls: List[DblePurchasePayment]): Unit =
            { et.setPurchasePaymentList(ls); }
        }));
    }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key purchasePaymentId.
     * @param purchasePaymentList The list of purchasePayment. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    def extractPurchasePaymentIdList(purchasePaymentList: List[DblePurchasePayment]): List[Long] = {
        return helpExtractListInternally(purchasePaymentList, new InternalExtractCallback[DblePurchasePayment, Long]() {
            def getCV(et: DblePurchasePayment): Long = { return et.getPurchasePaymentId(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * DblePurchasePayment purchasePayment = new DblePurchasePayment();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * purchasePayment.setFoo...(value);
     * purchasePayment.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//purchasePayment.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//purchasePayment.set...;</span>
     * purchasePaymentBhv.<span style="color: #DD4747">insert</span>(purchasePayment);
     * ... = purchasePayment.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param purchasePayment The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    def insert(purchasePayment: DblePurchasePayment): Unit = {
        doInsert(purchasePayment, null);
    }

    protected def doInsert(purchasePayment: DblePurchasePayment, op: InsertOption[PurchasePaymentCB]): Unit = {
        assertObjectNotNull("purchasePayment", purchasePayment);
        prepareInsertOption(op);
        delegateInsert(purchasePayment, op);
    }

    protected def prepareInsertOption(op: InsertOption[PurchasePaymentCB]): Unit = {
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
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * DblePurchasePayment purchasePayment = new DblePurchasePayment();
     * purchasePayment.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * purchasePayment.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//purchasePayment.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//purchasePayment.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * purchasePayment.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     purchasePaymentBhv.<span style="color: #DD4747">update</span>(purchasePayment);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param purchasePayment The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    def update(setting: (MblePurchasePayment) => Unit): Unit = {
        val mble = new MblePurchasePayment();
        setting(mble);
        doUpdate(mble.toDBableEntity, null);
    }

    protected def doUpdate(purchasePayment: DblePurchasePayment, op: UpdateOption[PurchasePaymentCB]): Unit = {
        assertObjectNotNull("purchasePayment", purchasePayment);
        prepareUpdateOption(op);
        helpUpdateInternally(purchasePayment, new InternalUpdateCallback[DblePurchasePayment]() {
            def callbackDelegateUpdate(et: DblePurchasePayment): Int = { return delegateUpdate(et, op); } });
    }

    protected def prepareUpdateOption(op: UpdateOption[PurchasePaymentCB]): Unit = {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected def createCBForVaryingUpdate(): PurchasePaymentCB = {
        val cb: PurchasePaymentCB = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected def createCBForSpecifiedUpdate(): PurchasePaymentCB = {
        val cb: PurchasePaymentCB = newMyConditionBean();
        cb.xsetupForSpecifiedUpdate();
        return cb;
    }

    @Override
    protected def doModify(et: Entity, op: UpdateOption[_ <: ConditionBean]): Unit = {
        if (op == null) { doUpdate(downcast(et), null); }
        else { varyingUpdate(downcast(et), downcast(op)); }
    }

    @Override
    protected def doModifyNonstrict(et: Entity, op: UpdateOption[_ <: ConditionBean]): Unit = {
        doModify(et, op);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param purchasePayment The entity of insert or update target. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    def insertOrUpdate(purchasePayment: DblePurchasePayment): Unit = {
        doInesrtOrUpdate(purchasePayment, null, null);
    }

    protected def doInesrtOrUpdate(purchasePayment: DblePurchasePayment, iop: InsertOption[PurchasePaymentCB], uop: UpdateOption[PurchasePaymentCB]): Unit = {
        helpInsertOrUpdateInternally(purchasePayment, new InternalInsertOrUpdateCallback[DblePurchasePayment, PurchasePaymentCB]() {
            def callbackInsert(et: DblePurchasePayment): Unit = { doInsert(et, iop); }
            def callbackUpdate(et: DblePurchasePayment): Unit = { doUpdate(et, uop); }
            def callbackNewMyConditionBean(): PurchasePaymentCB = { return newMyConditionBean(); }
            def callbackSelectCount(cb: PurchasePaymentCB): Int = { return facadeSelectCount(cb); }
        });
    }

    @Override
    protected def doCreateOrModify(et: Entity, iop: InsertOption[_ <: ConditionBean], uop: UpdateOption[_ <: ConditionBean]): Unit = {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            val niop = if (iop != null) { iop } else { new InsertOption[PurchasePaymentCB]() };
            val nuop = if (uop != null) { uop } else { new UpdateOption[PurchasePaymentCB]() };
            varyingInsertOrUpdate(downcast(et), downcast(niop), downcast(nuop));
        }
    }

    @Override
    protected def doCreateOrModifyNonstrict(et: Entity, iop: InsertOption[_ <: ConditionBean], uop: UpdateOption[_ <: ConditionBean]): Unit = {
        doCreateOrModify(et, iop, uop);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * DblePurchasePayment purchasePayment = new DblePurchasePayment();
     * purchasePayment.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * purchasePayment.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     purchasePaymentBhv.<span style="color: #DD4747">delete</span>(purchasePayment);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param purchasePayment The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    def delete(purchasePayment: DblePurchasePayment): Unit = {
        doDelete(purchasePayment, null);
    }

    protected def doDelete(purchasePayment: DblePurchasePayment, op: DeleteOption[PurchasePaymentCB]): Unit = {
        assertObjectNotNull("purchasePayment", purchasePayment);
        prepareDeleteOption(op);
        helpDeleteInternally(purchasePayment, new InternalDeleteCallback[DblePurchasePayment]() {
            def callbackDelegateDelete(et: DblePurchasePayment): Int = { return delegateDelete(et, op); } });
    }

    protected def prepareDeleteOption(op: DeleteOption[PurchasePaymentCB]): Unit = {
        if (op == null) { return; }
        assertDeleteOptionStatus(op);
    }

    @Override
    protected def doRemove(et: Entity, op: DeleteOption[_ <: ConditionBean]): Unit = {
        if (op == null) { delete(downcast(et)); }
        else { varyingDelete(downcast(et), downcast(op)); }
    }

    @Override
    protected def doRemoveNonstrict(et: Entity, op: DeleteOption[_ <: ConditionBean]): Unit = {
        doRemove(et, op);
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
     *     DblePurchasePayment purchasePayment = new DblePurchasePayment();
     *     purchasePayment.setFooName("foo");
     *     if (...) {
     *         purchasePayment.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     purchasePaymentList.add(purchasePayment);
     * }
     * purchasePaymentBhv.<span style="color: #DD4747">batchInsert</span>(purchasePaymentList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param purchasePaymentList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    def batchInsert(purchasePaymentList: scala.collection.immutable.List[DblePurchasePayment]): Array[Int] = {
        val op: InsertOption[PurchasePaymentCB] = createInsertUpdateOption();
        return doBatchInsert(purchasePaymentList.asJava, op);
    }

    protected def doBatchInsert(purchasePaymentList: List[DblePurchasePayment], op: InsertOption[PurchasePaymentCB]): Array[Int] = {
        assertObjectNotNull("purchasePaymentList", purchasePaymentList);
        prepareBatchInsertOption(purchasePaymentList, op);
        return delegateBatchInsert(purchasePaymentList, op);
    }

    protected def prepareBatchInsertOption(purchasePaymentList: List[DblePurchasePayment], op: InsertOption[PurchasePaymentCB]): Unit = {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(purchasePaymentList);
        prepareInsertOption(op);
    }

    @Override
    protected def doLumpCreate(ls: List[Entity], op: InsertOption[_ <: ConditionBean]): Array[Int] = {
        if (op == null) { return batchInsert(toScalaList(downcast(ls))); }
        else { return varyingBatchInsert(toScalaList(downcast(ls)), downcast(op)); }
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     DblePurchasePayment purchasePayment = new DblePurchasePayment();
     *     purchasePayment.setFooName("foo");
     *     if (...) {
     *         purchasePayment.setFooPrice(123);
     *     } else {
     *         purchasePayment.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//purchasePayment.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     purchasePaymentList.add(purchasePayment);
     * }
     * purchasePaymentBhv.<span style="color: #DD4747">batchUpdate</span>(purchasePaymentList);
     * </pre>
     * @param purchasePaymentList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    def batchUpdate(purchasePaymentList: scala.collection.immutable.List[DblePurchasePayment]): Array[Int] = {
        val op: UpdateOption[PurchasePaymentCB] = createPlainUpdateOption();
        return doBatchUpdate(purchasePaymentList.asJava, op);
    }

    protected def doBatchUpdate(purchasePaymentList: List[DblePurchasePayment], op: UpdateOption[PurchasePaymentCB]): Array[Int] = {
        assertObjectNotNull("purchasePaymentList", purchasePaymentList);
        prepareBatchUpdateOption(purchasePaymentList, op);
        return delegateBatchUpdate(purchasePaymentList, op);
    }

    protected def prepareBatchUpdateOption(purchasePaymentList: List[DblePurchasePayment], op: UpdateOption[PurchasePaymentCB]): Unit = {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(purchasePaymentList);
        prepareUpdateOption(op);
    }

    @Override
    protected def doLumpModify(ls: List[Entity], op: UpdateOption[_ <: ConditionBean]): Array[Int] = {
        if (op == null) { return batchUpdate(toScalaList(downcast(ls))); }
        else { return varyingBatchUpdate(toScalaList(downcast(ls)), downcast(op)); }
    }

    /**
     * Batch-update the entity list specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * purchasePaymentBhv.<span style="color: #DD4747">batchUpdate</span>(purchasePaymentList, new SpecifyQuery[PurchasePaymentCB]() {
     *     public void specify(PurchasePaymentCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * purchasePaymentBhv.<span style="color: #DD4747">batchUpdate</span>(purchasePaymentList, new SpecifyQuery[PurchasePaymentCB]() {
     *     public void specify(PurchasePaymentCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param purchasePaymentList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    def batchUpdate(purchasePaymentList: scala.collection.immutable.List[DblePurchasePayment], updateColumnSpec: SpecifyQuery[PurchasePaymentCB]): Array[Int] = {
        return doBatchUpdate(purchasePaymentList.asJava, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected def doLumpModifyNonstrict(ls: List[Entity], op: UpdateOption[_ <: ConditionBean]): Array[Int] = {
        return doLumpModify(ls, op);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param purchasePaymentList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    def batchDelete(purchasePaymentList: scala.collection.immutable.List[DblePurchasePayment]): Array[Int] = {
        return doBatchDelete(purchasePaymentList.asJava, null);
    }

    protected def doBatchDelete(purchasePaymentList: List[DblePurchasePayment], op: DeleteOption[PurchasePaymentCB]): Array[Int] = {
        assertObjectNotNull("purchasePaymentList", purchasePaymentList);
        prepareDeleteOption(op);
        return delegateBatchDelete(purchasePaymentList, op);
    }

    @Override
    protected def doLumpRemove(ls: List[Entity], op: DeleteOption[_ <: ConditionBean]): Array[Int] = {
        if (op == null) { return batchDelete(toScalaList(downcast(ls))); }
        else { return varyingBatchDelete(toScalaList(downcast(ls)), downcast(op)); }
    }

    @Override
    protected def doLumpRemoveNonstrict(ls: List[Entity], op: DeleteOption[_ <: ConditionBean]): Array[Int] = {
        return doLumpRemove(ls, op);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * purchasePaymentBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;DblePurchasePayment, PurchasePaymentCB&gt;() {
     *     public ConditionBean setup(purchasePayment entity, PurchasePaymentCB intoCB) {
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
    def queryInsert(setupper: QueryInsertSetupper[DblePurchasePayment, PurchasePaymentCB]): Int = {
        return Integer2int(doQueryInsert(setupper, null));
    }

    protected def doQueryInsert(sp: QueryInsertSetupper[DblePurchasePayment, PurchasePaymentCB], op: InsertOption[PurchasePaymentCB]): Integer = {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        val e: DblePurchasePayment = new DblePurchasePayment();
        val cb: PurchasePaymentCB = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
    }

    protected def createCBForQueryInsert(): PurchasePaymentCB = {
        val cb: PurchasePaymentCB = newMyConditionBean();
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
     * DblePurchasePayment purchasePayment = new DblePurchasePayment();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//purchasePayment.setPK...(value);</span>
     * purchasePayment.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//purchasePayment.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//purchasePayment.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//purchasePayment.setVersionNo(value);</span>
     * PurchasePaymentCB cb = new PurchasePaymentCB();
     * cb.query().setFoo...(value);
     * purchasePaymentBhv.<span style="color: #DD4747">queryUpdate</span>(purchasePayment, cb);
     * </pre>
     * @param purchasePayment The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of DblePurchasePayment. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    def queryUpdate(purchasePayment: DblePurchasePayment, cb: PurchasePaymentCB): Int = {
        return Integer2int(doQueryUpdate(purchasePayment, cb, null));
    }

    protected def doQueryUpdate(purchasePayment: DblePurchasePayment, cb: PurchasePaymentCB, op: UpdateOption[PurchasePaymentCB]): Integer = {
        assertObjectNotNull("purchasePayment", purchasePayment); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return if (checkCountBeforeQueryUpdateIfNeeds(cb)) { delegateQueryUpdate(purchasePayment, cb, op) } else { 0 };
    }

    @Override
    protected def doRangeModify(et: Entity, cb: ConditionBean, op: UpdateOption[_ <: ConditionBean]): Int = {
        if (op == null) { return queryUpdate(downcast(et), cb.asInstanceOf[PurchasePaymentCB]); }
        else { return varyingQueryUpdate(downcast(et), cb.asInstanceOf[PurchasePaymentCB], downcast(op)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * PurchasePaymentCB cb = new PurchasePaymentCB();
     * cb.query().setFoo...(value);
     * purchasePaymentBhv.<span style="color: #DD4747">queryDelete</span>(purchasePayment, cb);
     * </pre>
     * @param cb The condition-bean of DblePurchasePayment. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    def queryDelete(cb: PurchasePaymentCB): Int = {
        return Integer2int(doQueryDelete(cb, null));
    }

    protected def doQueryDelete(cb: PurchasePaymentCB, op: DeleteOption[PurchasePaymentCB]): Integer = {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return if (checkCountBeforeQueryUpdateIfNeeds(cb)) { delegateQueryDelete(cb, op) } else { 0 };
    }

    @Override
    protected def doRangeRemove(cb: ConditionBean, op: DeleteOption[_ <: ConditionBean]): Int = {
        if (op == null) { return queryDelete(cb.asInstanceOf[PurchasePaymentCB]); }
        else { return varyingQueryDelete(cb.asInstanceOf[PurchasePaymentCB], downcast(op)); }
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
     * DblePurchasePayment purchasePayment = new DblePurchasePayment();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * purchasePayment.setFoo...(value);
     * purchasePayment.setBar...(value);
     * InsertOption[PurchasePaymentCB] option = new InsertOption[PurchasePaymentCB]();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * purchasePaymentBhv.<span style="color: #DD4747">varyingInsert</span>(purchasePayment, option);
     * ... = purchasePayment.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param purchasePayment The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    def varyingInsert(purchasePayment: DblePurchasePayment, option: InsertOption[PurchasePaymentCB]): Unit = {
        assertInsertOptionNotNull(option);
        doInsert(purchasePayment, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * DblePurchasePayment purchasePayment = new DblePurchasePayment();
     * purchasePayment.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * purchasePayment.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * purchasePayment.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;PurchasePaymentCB&gt; option = new UpdateOption&lt;PurchasePaymentCB&gt;();
     *     option.self(new SpecifyQuery&lt;PurchasePaymentCB&gt;() {
     *         public void specify(PurchasePaymentCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     purchasePaymentBhv.<span style="color: #DD4747">varyingUpdate</span>(purchasePayment, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param purchasePayment The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    def varyingUpdate(purchasePayment: DblePurchasePayment, option: UpdateOption[PurchasePaymentCB]): Unit = {
        assertUpdateOptionNotNull(option);
        doUpdate(purchasePayment, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param purchasePayment The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    def varyingInsertOrUpdate(purchasePayment: DblePurchasePayment, insertOption: InsertOption[PurchasePaymentCB], updateOption: UpdateOption[PurchasePaymentCB]): Unit = {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(purchasePayment, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param purchasePayment The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    def varyingDelete(purchasePayment: DblePurchasePayment, option: DeleteOption[PurchasePaymentCB]): Unit = {
        assertDeleteOptionNotNull(option);
        doDelete(purchasePayment, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param purchasePaymentList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    def varyingBatchInsert(purchasePaymentList: scala.collection.immutable.List[DblePurchasePayment], option: InsertOption[PurchasePaymentCB]): Array[Int] = {
        assertInsertOptionNotNull(option);
        return doBatchInsert(purchasePaymentList.asJava, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param purchasePaymentList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    def varyingBatchUpdate(purchasePaymentList: scala.collection.immutable.List[DblePurchasePayment], option: UpdateOption[PurchasePaymentCB]): Array[Int] = {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(purchasePaymentList.asJava, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param purchasePaymentList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    def varyingBatchDelete(purchasePaymentList: scala.collection.immutable.List[DblePurchasePayment], option: DeleteOption[PurchasePaymentCB]): Array[Int] = {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(purchasePaymentList.asJava, option);
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
    def varyingQueryInsert(setupper: QueryInsertSetupper[DblePurchasePayment, PurchasePaymentCB], option: InsertOption[PurchasePaymentCB]): Integer = {
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
     * DblePurchasePayment purchasePayment = new DblePurchasePayment();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//purchasePayment.setPK...(value);</span>
     * purchasePayment.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//purchasePayment.setVersionNo(value);</span>
     * PurchasePaymentCB cb = new PurchasePaymentCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;PurchasePaymentCB&gt; option = new UpdateOption&lt;PurchasePaymentCB&gt;();
     * option.self(new SpecifyQuery&lt;PurchasePaymentCB&gt;() {
     *     public void specify(PurchasePaymentCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * purchasePaymentBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(purchasePayment, cb, option);
     * </pre>
     * @param purchasePayment The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of DblePurchasePayment. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    def varyingQueryUpdate(purchasePayment: DblePurchasePayment, cb: PurchasePaymentCB, option: UpdateOption[PurchasePaymentCB]): Integer = {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(purchasePayment, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of DblePurchasePayment. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    def varyingQueryDelete(cb: PurchasePaymentCB, option: DeleteOption[PurchasePaymentCB]): Integer = {
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
    def outsideSql(): OutsideSqlBasicExecutor[PurchasePaymentBhv] = {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected def delegateSelectCountUniquely(cb: PurchasePaymentCB): Integer = { return invoke(createSelectCountCBCommand(cb, true)); }
    protected def delegateSelectCountPlainly(cb: PurchasePaymentCB): Integer = { return invoke(createSelectCountCBCommand(cb, false)); }
    protected def delegateSelectCursor[ENTITY <: DblePurchasePayment](cb: PurchasePaymentCB, rh: EntityRowHandler[ENTITY], tp: Class[ENTITY])
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected def delegateSelectList[ENTITY <: DblePurchasePayment](cb: PurchasePaymentCB, tp: Class[ENTITY]): List[ENTITY] =
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected def delegateInsert(et: DblePurchasePayment, op: InsertOption[PurchasePaymentCB]): Integer =
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected def delegateUpdate(et: DblePurchasePayment, op: UpdateOption[PurchasePaymentCB]): Integer =
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return delegateUpdateNonstrict(et, op); }
    protected def delegateUpdateNonstrict(et: DblePurchasePayment, op: UpdateOption[PurchasePaymentCB]): Integer =
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected def delegateDelete(et: DblePurchasePayment, op: DeleteOption[PurchasePaymentCB]): Integer =
    { if (!processBeforeDelete(et, op)) { return 0; }
      return delegateDeleteNonstrict(et, op); }
    protected def delegateDeleteNonstrict(et: DblePurchasePayment, op: DeleteOption[PurchasePaymentCB]): Integer =
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected def delegateBatchInsert(ls: List[DblePurchasePayment], op: InsertOption[PurchasePaymentCB]): Array[Int] =
    { if (ls.isEmpty()) { return new Array[Int](0); }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)).asInstanceOf[Array[Int]]; }
    protected def delegateBatchUpdate(ls: List[DblePurchasePayment], op: UpdateOption[PurchasePaymentCB]): Array[Int] =
    { if (ls.isEmpty()) { return new Array[Int](0); }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected def delegateBatchUpdateNonstrict(ls: List[DblePurchasePayment], op: UpdateOption[PurchasePaymentCB]): Array[Int] =
    { if (ls.isEmpty()) { return new Array[Int](0); }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)).asInstanceOf[Array[Int]]; }
    protected def delegateBatchDelete(ls: List[DblePurchasePayment], op: DeleteOption[PurchasePaymentCB]): Array[Int] =
    { if (ls.isEmpty()) { return new Array[Int](0); }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected def delegateBatchDeleteNonstrict(ls: List[DblePurchasePayment], op: DeleteOption[PurchasePaymentCB]): Array[Int] =
    { if (ls.isEmpty()) { return new Array[Int](0); }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)).asInstanceOf[Array[Int]]; }

    protected def delegateQueryInsert(et: DblePurchasePayment, inCB: PurchasePaymentCB, resCB: ConditionBean, op: InsertOption[PurchasePaymentCB]): Integer =
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; }
      return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected def delegateQueryUpdate(et: DblePurchasePayment, cb: PurchasePaymentCB, op: UpdateOption[PurchasePaymentCB]): Integer =
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; }
      return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected def delegateQueryDelete(cb: PurchasePaymentCB, op: DeleteOption[PurchasePaymentCB]): Integer =
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
        return false;
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
    protected def typeOfSelectedEntity(): Class[DblePurchasePayment] = {
        return classOf[DblePurchasePayment];
    }

    protected def callbackCB(cbCall: (PurchasePaymentCB) => Unit): PurchasePaymentCB = {
        assertObjectNotNull("cbCall", cbCall);
        val cb = new PurchasePaymentCB();
        cbCall(cb);
        return cb;
    }

    protected def doCallbackLoader(dbleList: List[DblePurchasePayment], loaderCall: (LoaderOfPurchasePayment) => Unit = null): Unit = {
        if (loaderCall != null) {
            val loader = new LoaderOfPurchasePayment();
            loader.selectedList = dbleList.asInstanceOf[List[DblePurchasePayment]];
            loaderCall(loader);
        }
    }

    protected def downcast(et: Entity): DblePurchasePayment = {
        return helpEntityDowncastInternally(et, classOf[DblePurchasePayment]);
    }

    protected def downcast(cb: ConditionBean): PurchasePaymentCB = {
        return helpConditionBeanDowncastInternally(cb, classOf[PurchasePaymentCB]);
    }

    protected def downcast(ls: List[_ <: Entity]): List[DblePurchasePayment] = {
        return ls.asInstanceOf[List[DblePurchasePayment]];
    }

    protected def downcast(op: InsertOption[_ <: ConditionBean]): InsertOption[PurchasePaymentCB] = {
        return op.asInstanceOf[InsertOption[PurchasePaymentCB]];
    }

    protected def downcast(op: UpdateOption[_ <: ConditionBean]): UpdateOption[PurchasePaymentCB] = {
        return op.asInstanceOf[UpdateOption[PurchasePaymentCB]];
    }

    protected def downcast(op: DeleteOption[_ <: ConditionBean]): DeleteOption[PurchasePaymentCB] = {
        return op.asInstanceOf[DeleteOption[PurchasePaymentCB]];
    }

    protected def downcast(sp: QueryInsertSetupper[_ <: Entity, _ <: ConditionBean]): QueryInsertSetupper[DblePurchasePayment, PurchasePaymentCB] = {
        return sp.asInstanceOf[QueryInsertSetupper[DblePurchasePayment, PurchasePaymentCB]];
    }

    // ===================================================================================
    //                                                                        Scala Helper
    //                                                                        ============
    protected def toScalaList[ENTITY](javaList: Collection[ENTITY]): scala.collection.immutable.List[ENTITY] = {
        if (javaList == null) { scala.collection.immutable.List() }
        return scala.collection.immutable.List.fromArray(javaList.toArray()).asInstanceOf[scala.collection.immutable.List[ENTITY]];
    }

    def toImmutableEntityList(dbleList: Collection[DblePurchasePayment]): scala.collection.immutable.List[PurchasePayment] = {
        return toScalaList(dbleList).map(new PurchasePayment(_))
    }

    def toDBableEntityList(immuList: scala.collection.immutable.List[PurchasePayment]): List[DblePurchasePayment] = {
        return immuList.map(new DblePurchasePayment().acceptImmutableEntity(_)).asJava
    }
}

/* _/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/ */
/* _/_/_/_/_/_/_/_/_/_/_/                                                                      _/_/_/_/_/_/_/_/_/_/_/ */
/* _/_/_/_/_/_/_/_/_/_/_/                  Behavior                                            _/_/_/_/_/_/_/_/_/_/_/ */
/* _/_/_/_/_/_/_/_/_/_/_/                                                                      _/_/_/_/_/_/_/_/_/_/_/ */
/* _/_/_/_/_/_/_/_/_/_/_/                                        Loader                        _/_/_/_/_/_/_/_/_/_/_/ */
/* _/_/_/_/_/_/_/_/_/_/_/                                                                      _/_/_/_/_/_/_/_/_/_/_/ */
/* _/_/_/_/_/_/_/_/_/_/_/                              Border                                  _/_/_/_/_/_/_/_/_/_/_/ */
/* _/_/_/_/_/_/_/_/_/_/_/                                                                      _/_/_/_/_/_/_/_/_/_/_/ */
/* _/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/ */

/**
 * @author jflute
 */
class BsLoaderOfPurchasePayment {

    protected var _selectedList: List[DblePurchasePayment] = null;
    def selectedList: List[DblePurchasePayment] = {
        return _selectedList;
    }
    def selectedList_=(ls: List[DblePurchasePayment]): Unit = {
        _selectedList = ls;
    }
}
