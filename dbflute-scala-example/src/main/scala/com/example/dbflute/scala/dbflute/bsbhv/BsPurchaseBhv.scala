package com.example.dbflute.scala.dbflute.bsbhv;

import scala.collection.JavaConverters._;

import java.util.List;

import org.seasar.dbflute._;
import org.seasar.dbflute.bhv._;
import org.seasar.dbflute.bhv.AbstractBehaviorReadable._;
import org.seasar.dbflute.bhv.AbstractBehaviorWritable._;
import org.seasar.dbflute.cbean._;
import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.exception._;
import org.seasar.dbflute.optional._;
import org.seasar.dbflute.outsidesql.executor._;
import com.example.dbflute.scala.dbflute.exbhv._;
import com.example.dbflute.scala.dbflute.exentity._;
import com.example.dbflute.scala.dbflute.bsentity.dbmeta._;
import com.example.dbflute.scala.dbflute.cbean._;

/**
 * The behavior of (購入)PURCHASE as TABLE. <br />
 * <pre>
 * [primary key]
 *     PURCHASE_ID
 *
 * [column]
 *     PURCHASE_ID, MEMBER_ID, PRODUCT_ID, PURCHASE_DATETIME, PURCHASE_COUNT, PURCHASE_PRICE, PAYMENT_COMPLETE_FLG, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PURCHASE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     MEMBER, PRODUCT
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     member, product
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
abstract class BsPurchaseBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    def getTableDbName(): String = { return "PURCHASE"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    def getDBMeta(): DBMeta = { return PurchaseDbm; }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    def newEntity(): Entity = { return newMyEntity(); }

    /** {@inheritDoc} */
    def newConditionBean(): ConditionBean = { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    def newMyEntity(): Purchase = { return new Purchase(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    def newMyConditionBean(): PurchaseCB = { return new PurchaseCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * PurchaseCB cb = new PurchaseCB();
     * cb.query().setFoo...(value);
     * int count = purchaseBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of Purchase. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    def selectCount(cb: PurchaseCB): Integer = {
        return doSelectCountUniquely(cb);
    }

    protected def doSelectCountUniquely(cb: PurchaseCB): Integer = { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected def doSelectCountPlainly(cb: PurchaseCB): Integer = { // called by selectPage(cb)
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
     * PurchaseCB cb = new PurchaseCB();
     * cb.query().setFoo...(value);
     * OptionalEntity&lt;Purchase&gt; entity = purchaseBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     *
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * entity.<span style="color: #DD4747">required</span>(purchase -&gt; {
     *     ...
     * });
     * Purchase purchase = entity.entity.<span style="color: #DD4747">get()</span>;
     *
     * <span style="color: #3F7E5E">// if it might be no data, ifPresent(), isPresent(), ...</span>
     * entity.<span style="color: #DD4747">ifPresent</span>(purchase -&gt; {
     *     ...
     * });
     * if (entity.entity.<span style="color: #DD4747">isPresent()</span>) {
     *     Purchase purchase = entity.entity.<span style="color: #DD4747">get()</span>;
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of Purchase. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get() of return value is called and the value is null, which means entity has already been deleted (point is not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    def selectEntity(cb: PurchaseCB): OptionalEntity[Purchase] = {
        return doSelectOptionalEntity(cb, classOf[Purchase]);
    }

    protected def doSelectEntity[ENTITY <: Purchase](cb: PurchaseCB, tp: Class[ENTITY]): ENTITY = {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback[ENTITY, PurchaseCB]() {
            def callbackSelectList(lcb: PurchaseCB, ltp: Class[ENTITY]): List[ENTITY] = { return doSelectList(lcb, ltp); } });
    }

    protected def doSelectOptionalEntity[ENTITY <: Purchase](cb: PurchaseCB, tp: Class[ENTITY]): OptionalEntity[ENTITY] = {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    @Override
    protected def doReadEntity(cb: ConditionBean): Entity = {
        return selectEntity(downcast(cb)).orElseNull();
    }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * PurchaseCB cb = new PurchaseCB();
     * cb.query().setFoo...(value);
     * Purchase purchase = purchaseBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = purchase.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of Purchase. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (point is not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    def selectEntityWithDeletedCheck(cb: PurchaseCB): Purchase = {
        return doSelectEntityWithDeletedCheck(cb, classOf[Purchase]);
    }

    protected def doSelectEntityWithDeletedCheck[ENTITY <: Purchase](cb: PurchaseCB, tp: Class[ENTITY]): ENTITY = {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback[ENTITY, PurchaseCB]() {
            def callbackSelectList(lcb: PurchaseCB, ltp: Class[ENTITY]): List[ENTITY] = { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected def doReadEntityWithDeletedCheck(cb: ConditionBean): Entity = {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param purchaseId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    def selectByPKValue(purchaseId: Long): Purchase = {
        return doSelectByPKValue(purchaseId, classOf[Purchase]);
    }

    protected def doSelectByPKValue[ENTITY <: Purchase](purchaseId: Long, entityType: Class[ENTITY]): ENTITY = {
        return doSelectEntity(buildPKCB(purchaseId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param purchaseId The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    def selectByPKValueWithDeletedCheck(purchaseId: Long): Purchase = {
        return doSelectByPKValueWithDeletedCheck(purchaseId, classOf[Purchase]);
    }

    protected def doSelectByPKValueWithDeletedCheck[ENTITY <: Purchase](purchaseId: Long, entityType: Class[ENTITY]): ENTITY = {
        return doSelectEntityWithDeletedCheck(buildPKCB(purchaseId), entityType);
    }

    private def buildPKCB(purchaseId: Long): PurchaseCB = {
        assertObjectNotNull("purchaseId", purchaseId);
        val cb: PurchaseCB = newMyConditionBean();
        cb.query().setPurchaseId_Equal(purchaseId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * PurchaseCB cb = new PurchaseCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;Purchase&gt; purchaseList = purchaseBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (Purchase purchase : purchaseList) {
     *     ... = purchase.get...();
     * }
     * </pre>
     * @param cb The condition-bean of Purchase. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    def selectList(cb: PurchaseCB): scala.collection.immutable.List[Purchase] = {
        val javaList = doSelectList(cb, classOf[Purchase]);
        return toScalaList(javaList);
    }

    protected def doSelectList[ENTITY <: Purchase](cb: PurchaseCB, tp: Class[ENTITY]): ListResultBean[ENTITY] = {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback[ENTITY, PurchaseCB]() {
            def callbackSelectList(lcb: PurchaseCB, ltp: Class[ENTITY]): List[ENTITY] = { return delegateSelectList(lcb, ltp); } });
    }

    @Override
    protected def doReadList(cb: ConditionBean): ListResultBean[_ <: Entity] = {
        return doSelectList(downcast(cb), classOf[Purchase]); // use do method for ListResultBean
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * PurchaseCB cb = new PurchaseCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;Purchase&gt; page = purchaseBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (Purchase purchase : page) {
     *     ... = purchase.get...();
     * }
     * </pre>
     * @param cb The condition-bean of Purchase. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    def selectPage(cb: PurchaseCB): PagingResultBean[Purchase] = {
        return doSelectPage(cb, classOf[Purchase]);
    }

    protected def doSelectPage[ENTITY <: Purchase](cb: PurchaseCB, tp: Class[ENTITY]): PagingResultBean[ENTITY] = {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback[ENTITY, PurchaseCB]() {
            def callbackSelectCount(cb: PurchaseCB): Int = { return doSelectCountPlainly(cb); }
            def callbackSelectList(cb: PurchaseCB, tp: Class[ENTITY]): List[ENTITY] = { return doSelectList(cb, tp); }
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
     * PurchaseCB cb = new PurchaseCB();
     * cb.query().setFoo...(value);
     * purchaseBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;Purchase&gt;() {
     *     public void handle(Purchase entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of Purchase. (NotNull)
     * @param entityRowHandler The handler of entity row of Purchase. (NotNull)
     */
    def selectCursor(cb: PurchaseCB, entityRowHandler: EntityRowHandler[Purchase]): Unit = {
        doSelectCursor(cb, entityRowHandler, classOf[Purchase]);
    }

    protected def doSelectCursor[ENTITY <: Purchase](cb: PurchaseCB, handler: EntityRowHandler[ENTITY], tp: Class[ENTITY]): Unit = {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback[ENTITY, PurchaseCB]() {
            def callbackSelectCursor(cb: PurchaseCB, handler: EntityRowHandler[ENTITY], tp: Class[ENTITY]): Unit = { delegateSelectCursor(cb, handler, tp); }
            def callbackSelectList(cb: PurchaseCB, tp: Class[ENTITY]): List[ENTITY] = { return doSelectList(cb, tp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * purchaseBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(PurchaseCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    def scalarSelect[RESULT](resultType: Class[RESULT]): SLFunction[PurchaseCB, RESULT] = {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected def doScalarSelect[RESULT, CB <: PurchaseCB](tp: Class[RESULT], cb: CB): SLFunction[CB, RESULT] = {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction[RESULT, CB](cb, tp);
    }

    protected def createSLFunction[RESULT, CB <: PurchaseCB](cb: CB, tp: Class[RESULT]): SLFunction[CB, RESULT] = {
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
     * Pull out the list of foreign table 'Member'.
     * @param purchaseList The list of purchase. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    def pulloutMember(purchaseList: scala.collection.immutable.List[Purchase]): scala.collection.immutable.List[Member] = {
        return toScalaList(helpPulloutInternally(purchaseList.asJava, new InternalPulloutCallback[Purchase, Member]() {
            def getFr(et: Purchase): Member = { return et.getMember(); }
            def hasRf(): Boolean = { return true; }
            def setRfLs(et: Member, ls: List[Purchase]): Unit =
            { et.setPurchaseList(toScalaList(ls)); }
        }));
    }
    /**
     * Pull out the list of foreign table 'Product'.
     * @param purchaseList The list of purchase. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    def pulloutProduct(purchaseList: scala.collection.immutable.List[Purchase]): scala.collection.immutable.List[Product] = {
        return toScalaList(helpPulloutInternally(purchaseList.asJava, new InternalPulloutCallback[Purchase, Product]() {
            def getFr(et: Purchase): Product = { return et.getProduct(); }
            def hasRf(): Boolean = { return true; }
            def setRfLs(et: Product, ls: List[Purchase]): Unit =
            { et.setPurchaseList(toScalaList(ls)); }
        }));
    }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key purchaseId.
     * @param purchaseList The list of purchase. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    def extractPurchaseIdList(purchaseList: List[Purchase]): List[Long] = {
        return helpExtractListInternally(purchaseList, new InternalExtractCallback[Purchase, Long]() {
            def getCV(et: Purchase): Long = { return et.getPurchaseId(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * Purchase purchase = new Purchase();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * purchase.setFoo...(value);
     * purchase.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//purchase.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//purchase.set...;</span>
     * purchaseBhv.<span style="color: #DD4747">insert</span>(purchase);
     * ... = purchase.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param purchase The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    def insert(purchase: Purchase): Unit = {
        doInsert(purchase, null);
    }

    protected def doInsert(purchase: Purchase, op: InsertOption[PurchaseCB]): Unit = {
        assertObjectNotNull("purchase", purchase);
        prepareInsertOption(op);
        delegateInsert(purchase, op);
    }

    protected def prepareInsertOption(op: InsertOption[PurchaseCB]): Unit = {
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
     * Purchase purchase = new Purchase();
     * purchase.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * purchase.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//purchase.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//purchase.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * purchase.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     purchaseBhv.<span style="color: #DD4747">update</span>(purchase);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param purchase The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    def update(purchase: Purchase): Unit = {
        doUpdate(purchase, null);
    }

    protected def doUpdate(purchase: Purchase, op: UpdateOption[PurchaseCB]): Unit = {
        assertObjectNotNull("purchase", purchase);
        prepareUpdateOption(op);
        helpUpdateInternally(purchase, new InternalUpdateCallback[Purchase]() {
            def callbackDelegateUpdate(et: Purchase): Int = { return delegateUpdate(et, op); } });
    }

    protected def prepareUpdateOption(op: UpdateOption[PurchaseCB]): Unit = {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected def createCBForVaryingUpdate(): PurchaseCB = {
        val cb: PurchaseCB = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected def createCBForSpecifiedUpdate(): PurchaseCB = {
        val cb: PurchaseCB = newMyConditionBean();
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
     * Purchase purchase = new Purchase();
     * purchase.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * purchase.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//purchase.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//purchase.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//purchase.setVersionNo(value);</span>
     * purchaseBhv.<span style="color: #DD4747">updateNonstrict</span>(purchase);
     * </pre>
     * @param purchase The entity of update target. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    def updateNonstrict(purchase: Purchase): Unit = {
        doUpdateNonstrict(purchase, null);
    }

    protected def doUpdateNonstrict(purchase: Purchase, op: UpdateOption[PurchaseCB]): Unit = {
        assertObjectNotNull("purchase", purchase);
        prepareUpdateOption(op);
        helpUpdateNonstrictInternally(purchase, new InternalUpdateNonstrictCallback[Purchase]() {
            def callbackDelegateUpdateNonstrict(et: Purchase): Int = { return delegateUpdateNonstrict(et, op); } });
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
     * @param purchase The entity of insert or update target. (NotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    def insertOrUpdate(purchase: Purchase): Unit = {
        doInesrtOrUpdate(purchase, null, null);
    }

    protected def doInesrtOrUpdate(purchase: Purchase, iop: InsertOption[PurchaseCB], uop: UpdateOption[PurchaseCB]): Unit = {
        helpInsertOrUpdateInternally(purchase, new InternalInsertOrUpdateCallback[Purchase, PurchaseCB]() {
            def callbackInsert(et: Purchase): Unit = { doInsert(et, iop); }
            def callbackUpdate(et: Purchase): Unit = { doUpdate(et, uop); }
            def callbackNewMyConditionBean(): PurchaseCB = { return newMyConditionBean(); }
            def callbackSelectCount(cb: PurchaseCB): Int = { return selectCount(cb); }
        });
    }

    @Override
    protected def doCreateOrModify(et: Entity, iop: InsertOption[_ <: ConditionBean], uop: UpdateOption[_ <: ConditionBean]): Unit = {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            val niop = if (iop != null) { iop } else { new InsertOption[PurchaseCB]() };
            val nuop = if (uop != null) { uop } else { new UpdateOption[PurchaseCB]() };
            varyingInsertOrUpdate(downcast(et), downcast(niop), downcast(nuop));
        }
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param purchase The entity of insert or update target. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    def insertOrUpdateNonstrict(purchase: Purchase): Unit = {
        doInesrtOrUpdateNonstrict(purchase, null, null);
    }

    protected def doInesrtOrUpdateNonstrict(purchase: Purchase, iop: InsertOption[PurchaseCB], uop: UpdateOption[PurchaseCB]): Unit = {
        helpInsertOrUpdateInternally(purchase, new InternalInsertOrUpdateNonstrictCallback[Purchase]() {
            def callbackInsert(et: Purchase): Unit = { doInsert(et, iop); }
            def callbackUpdateNonstrict(et: Purchase): Unit = { doUpdateNonstrict(et, uop); }
        });
    }

    @Override
    protected def doCreateOrModifyNonstrict(et: Entity, iop: InsertOption[_ <: ConditionBean], uop: UpdateOption[_ <: ConditionBean]): Unit = {
        if (iop == null && uop == null) { insertOrUpdateNonstrict(downcast(et)); }
        else {
            val niop = if (iop != null) { iop } else { new InsertOption[PurchaseCB]() };
            val nuop = if (uop != null) { uop } else { new UpdateOption[PurchaseCB]() };
            varyingInsertOrUpdateNonstrict(downcast(et), downcast(niop), downcast(nuop));
        }
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl)
     * <pre>
     * Purchase purchase = new Purchase();
     * purchase.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * purchase.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     purchaseBhv.<span style="color: #DD4747">delete</span>(purchase);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param purchase The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    def delete(purchase: Purchase): Unit = {
        doDelete(purchase, null);
    }

    protected def doDelete(purchase: Purchase, op: DeleteOption[PurchaseCB]): Unit = {
        assertObjectNotNull("purchase", purchase);
        prepareDeleteOption(op);
        helpDeleteInternally(purchase, new InternalDeleteCallback[Purchase]() {
            def callbackDelegateDelete(et: Purchase): Int = { return delegateDelete(et, op); } });
    }

    protected def prepareDeleteOption(op: DeleteOption[PurchaseCB]): Unit = {
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
     * Purchase purchase = new Purchase();
     * purchase.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//purchase.setVersionNo(value);</span>
     * purchaseBhv.<span style="color: #DD4747">deleteNonstrict</span>(purchase);
     * </pre>
     * @param purchase The entity of delete target. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    def deleteNonstrict(purchase: Purchase): Unit = {
        doDeleteNonstrict(purchase, null);
    }

    protected def doDeleteNonstrict(purchase: Purchase, op: DeleteOption[PurchaseCB]): Unit = {
        assertObjectNotNull("purchase", purchase);
        prepareDeleteOption(op);
        helpDeleteNonstrictInternally(purchase, new InternalDeleteNonstrictCallback[Purchase]() {
            def callbackDelegateDeleteNonstrict(et: Purchase): Int = { return delegateDeleteNonstrict(et, op); } });
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * Purchase purchase = new Purchase();
     * purchase.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//purchase.setVersionNo(value);</span>
     * purchaseBhv.<span style="color: #DD4747">deleteNonstrictIgnoreDeleted</span>(purchase);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param purchase The entity of delete target. (NotNull, PrimaryKeyNotNull)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    def deleteNonstrictIgnoreDeleted(purchase: Purchase): Unit = {
        doDeleteNonstrictIgnoreDeleted(purchase, null);
    }

    protected def doDeleteNonstrictIgnoreDeleted(purchase: Purchase, op: DeleteOption[PurchaseCB]): Unit = {
        assertObjectNotNull("purchase", purchase);
        prepareDeleteOption(op);
        helpDeleteNonstrictIgnoreDeletedInternally(purchase, new InternalDeleteNonstrictIgnoreDeletedCallback[Purchase]() {
            def callbackDelegateDeleteNonstrict(et: Purchase): Int = { return delegateDeleteNonstrict(et, op); } });
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
     *     Purchase purchase = new Purchase();
     *     purchase.setFooName("foo");
     *     if (...) {
     *         purchase.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     purchaseList.add(purchase);
     * }
     * purchaseBhv.<span style="color: #DD4747">batchInsert</span>(purchaseList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param purchaseList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    def batchInsert(purchaseList: scala.collection.immutable.List[Purchase]): Array[Int] = {
        val op: InsertOption[PurchaseCB] = createInsertUpdateOption();
        return doBatchInsert(purchaseList.asJava, op);
    }

    protected def doBatchInsert(purchaseList: List[Purchase], op: InsertOption[PurchaseCB]): Array[Int] = {
        assertObjectNotNull("purchaseList", purchaseList);
        prepareBatchInsertOption(purchaseList, op);
        return delegateBatchInsert(purchaseList, op);
    }

    protected def prepareBatchInsertOption(purchaseList: List[Purchase], op: InsertOption[PurchaseCB]): Unit = {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(purchaseList);
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
     *     Purchase purchase = new Purchase();
     *     purchase.setFooName("foo");
     *     if (...) {
     *         purchase.setFooPrice(123);
     *     } else {
     *         purchase.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//purchase.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     purchaseList.add(purchase);
     * }
     * purchaseBhv.<span style="color: #DD4747">batchUpdate</span>(purchaseList);
     * </pre>
     * @param purchaseList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    def batchUpdate(purchaseList: scala.collection.immutable.List[Purchase]): Array[Int] = {
        val op: UpdateOption[PurchaseCB] = createPlainUpdateOption();
        return doBatchUpdate(purchaseList.asJava, op);
    }

    protected def doBatchUpdate(purchaseList: List[Purchase], op: UpdateOption[PurchaseCB]): Array[Int] = {
        assertObjectNotNull("purchaseList", purchaseList);
        prepareBatchUpdateOption(purchaseList, op);
        return delegateBatchUpdate(purchaseList, op);
    }

    protected def prepareBatchUpdateOption(purchaseList: List[Purchase], op: UpdateOption[PurchaseCB]): Unit = {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(purchaseList);
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
     * purchaseBhv.<span style="color: #DD4747">batchUpdate</span>(purchaseList, new SpecifyQuery[PurchaseCB]() {
     *     public void specify(PurchaseCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * purchaseBhv.<span style="color: #DD4747">batchUpdate</span>(purchaseList, new SpecifyQuery[PurchaseCB]() {
     *     public void specify(PurchaseCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param purchaseList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    def batchUpdate(purchaseList: scala.collection.immutable.List[Purchase], updateColumnSpec: SpecifyQuery[PurchaseCB]): Array[Int] = {
        return doBatchUpdate(purchaseList.asJava, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     Purchase purchase = new Purchase();
     *     purchase.setFooName("foo");
     *     if (...) {
     *         purchase.setFooPrice(123);
     *     } else {
     *         purchase.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//purchase.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     purchaseList.add(purchase);
     * }
     * purchaseBhv.<span style="color: #DD4747">batchUpdate</span>(purchaseList);
     * </pre>
     * @param purchaseList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    def batchUpdateNonstrict(purchaseList: scala.collection.immutable.List[Purchase]): Array[Int] = {
        val option: UpdateOption[PurchaseCB] = createPlainUpdateOption();
        return doBatchUpdateNonstrict(purchaseList.asJava, option);
    }

    protected def doBatchUpdateNonstrict(purchaseList: List[Purchase], op: UpdateOption[PurchaseCB]): Array[Int] = {
        assertObjectNotNull("purchaseList", purchaseList);
        prepareBatchUpdateOption(purchaseList, op);
        return delegateBatchUpdateNonstrict(purchaseList, op);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * purchaseBhv.<span style="color: #DD4747">batchUpdateNonstrict</span>(purchaseList, new SpecifyQuery[PurchaseCB]() {
     *     public void specify(PurchaseCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * purchaseBhv.<span style="color: #DD4747">batchUpdateNonstrict</span>(purchaseList, new SpecifyQuery[PurchaseCB]() {
     *     public void specify(PurchaseCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param purchaseList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    def batchUpdateNonstrict(purchaseList: scala.collection.immutable.List[Purchase], updateColumnSpec: SpecifyQuery[PurchaseCB]): Array[Int] = {
        return doBatchUpdateNonstrict(purchaseList.asJava, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected def doLumpModifyNonstrict(ls: List[Entity], op: UpdateOption[_ <: ConditionBean]): Array[Int] = {
        if (op == null) { return batchUpdateNonstrict(toScalaList(downcast(ls))); }
        else { return varyingBatchUpdateNonstrict(toScalaList(downcast(ls)), downcast(op)); }
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param purchaseList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    def batchDelete(purchaseList: scala.collection.immutable.List[Purchase]): Array[Int] = {
        return doBatchDelete(purchaseList.asJava, null);
    }

    protected def doBatchDelete(purchaseList: List[Purchase], op: DeleteOption[PurchaseCB]): Array[Int] = {
        assertObjectNotNull("purchaseList", purchaseList);
        prepareDeleteOption(op);
        return delegateBatchDelete(purchaseList, op);
    }

    @Override
    protected def doLumpRemove(ls: List[Entity], op: DeleteOption[_ <: ConditionBean]): Array[Int] = {
        if (op == null) { return batchDelete(toScalaList(downcast(ls))); }
        else { return varyingBatchDelete(toScalaList(downcast(ls)), downcast(op)); }
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param purchaseList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    def batchDeleteNonstrict(purchaseList: scala.collection.immutable.List[Purchase]): Array[Int] = {
        return doBatchDeleteNonstrict(purchaseList.asJava, null);
    }

    protected def doBatchDeleteNonstrict(purchaseList: List[Purchase], op: DeleteOption[PurchaseCB]): Array[Int] = {
        assertObjectNotNull("purchaseList", purchaseList);
        prepareDeleteOption(op);
        return delegateBatchDeleteNonstrict(purchaseList, op);
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
     * purchaseBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;Purchase, PurchaseCB&gt;() {
     *     public ConditionBean setup(purchase entity, PurchaseCB intoCB) {
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
    def queryInsert(setupper: QueryInsertSetupper[Purchase, PurchaseCB]): Integer = {
        return doQueryInsert(setupper, null);
    }

    protected def doQueryInsert(sp: QueryInsertSetupper[Purchase, PurchaseCB], op: InsertOption[PurchaseCB]): Integer = {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        val e: Purchase = new Purchase();
        val cb: PurchaseCB = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
    }

    protected def createCBForQueryInsert(): PurchaseCB = {
        val cb: PurchaseCB = newMyConditionBean();
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
     * Purchase purchase = new Purchase();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//purchase.setPK...(value);</span>
     * purchase.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//purchase.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//purchase.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//purchase.setVersionNo(value);</span>
     * PurchaseCB cb = new PurchaseCB();
     * cb.query().setFoo...(value);
     * purchaseBhv.<span style="color: #DD4747">queryUpdate</span>(purchase, cb);
     * </pre>
     * @param purchase The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of Purchase. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    def queryUpdate(purchase: Purchase, cb: PurchaseCB): Integer = {
        return doQueryUpdate(purchase, cb, null);
    }

    protected def doQueryUpdate(purchase: Purchase, cb: PurchaseCB, op: UpdateOption[PurchaseCB]): Integer = {
        assertObjectNotNull("purchase", purchase); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return if (checkCountBeforeQueryUpdateIfNeeds(cb)) { delegateQueryUpdate(purchase, cb, op) } else { 0 };
    }

    @Override
    protected def doRangeModify(et: Entity, cb: ConditionBean, op: UpdateOption[_ <: ConditionBean]): Int = {
        if (op == null) { return queryUpdate(downcast(et), cb.asInstanceOf[PurchaseCB]); }
        else { return varyingQueryUpdate(downcast(et), cb.asInstanceOf[PurchaseCB], downcast(op)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * PurchaseCB cb = new PurchaseCB();
     * cb.query().setFoo...(value);
     * purchaseBhv.<span style="color: #DD4747">queryDelete</span>(purchase, cb);
     * </pre>
     * @param cb The condition-bean of Purchase. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    def queryDelete(cb: PurchaseCB): Integer = {
        return doQueryDelete(cb, null);
    }

    protected def doQueryDelete(cb: PurchaseCB, op: DeleteOption[PurchaseCB]): Integer = {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return if (checkCountBeforeQueryUpdateIfNeeds(cb)) { delegateQueryDelete(cb, op) } else { 0 };
    }

    @Override
    protected def doRangeRemove(cb: ConditionBean, op: DeleteOption[_ <: ConditionBean]): Int = {
        if (op == null) { return queryDelete(cb.asInstanceOf[PurchaseCB]); }
        else { return varyingQueryDelete(cb.asInstanceOf[PurchaseCB], downcast(op)); }
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
     * Purchase purchase = new Purchase();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * purchase.setFoo...(value);
     * purchase.setBar...(value);
     * InsertOption[PurchaseCB] option = new InsertOption[PurchaseCB]();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * purchaseBhv.<span style="color: #DD4747">varyingInsert</span>(purchase, option);
     * ... = purchase.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param purchase The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    def varyingInsert(purchase: Purchase, option: InsertOption[PurchaseCB]): Unit = {
        assertInsertOptionNotNull(option);
        doInsert(purchase, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * Purchase purchase = new Purchase();
     * purchase.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * purchase.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * purchase.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;PurchaseCB&gt; option = new UpdateOption&lt;PurchaseCB&gt;();
     *     option.self(new SpecifyQuery&lt;PurchaseCB&gt;() {
     *         public void specify(PurchaseCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     purchaseBhv.<span style="color: #DD4747">varyingUpdate</span>(purchase, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param purchase The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    def varyingUpdate(purchase: Purchase, option: UpdateOption[PurchaseCB]): Unit = {
        assertUpdateOptionNotNull(option);
        doUpdate(purchase, option);
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * Purchase purchase = new Purchase();
     * purchase.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * purchase.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//purchase.setVersionNo(value);</span>
     * UpdateOption&lt;PurchaseCB&gt; option = new UpdateOption&lt;PurchaseCB&gt;();
     * option.self(new SpecifyQuery&lt;PurchaseCB&gt;() {
     *     public void specify(PurchaseCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * purchaseBhv.<span style="color: #DD4747">varyingUpdateNonstrict</span>(purchase, option);
     * </pre>
     * @param purchase The entity of update target. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    def varyingUpdateNonstrict(purchase: Purchase, option: UpdateOption[PurchaseCB]): Unit = {
        assertUpdateOptionNotNull(option);
        doUpdateNonstrict(purchase, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param purchase The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    def varyingInsertOrUpdate(purchase: Purchase, insertOption: InsertOption[PurchaseCB], updateOption: UpdateOption[PurchaseCB]): Unit = {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(purchase, insertOption, updateOption);
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param purchase The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    def varyingInsertOrUpdateNonstrict(purchase: Purchase, insertOption: InsertOption[PurchaseCB], updateOption: UpdateOption[PurchaseCB]): Unit = {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdateNonstrict(purchase, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param purchase The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    def varyingDelete(purchase: Purchase, option: DeleteOption[PurchaseCB]): Unit = {
        assertDeleteOptionNotNull(option);
        doDelete(purchase, option);
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as deleteNonstrict(entity).
     * @param purchase The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    def varyingDeleteNonstrict(purchase: Purchase, option: DeleteOption[PurchaseCB]): Unit = {
        assertDeleteOptionNotNull(option);
        doDeleteNonstrict(purchase, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param purchaseList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    def varyingBatchInsert(purchaseList: scala.collection.immutable.List[Purchase], option: InsertOption[PurchaseCB]): Array[Int] = {
        assertInsertOptionNotNull(option);
        return doBatchInsert(purchaseList.asJava, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param purchaseList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    def varyingBatchUpdate(purchaseList: scala.collection.immutable.List[Purchase], option: UpdateOption[PurchaseCB]): Array[Int] = {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(purchaseList.asJava, option);
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param purchaseList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    def varyingBatchUpdateNonstrict(purchaseList: scala.collection.immutable.List[Purchase], option: UpdateOption[PurchaseCB]): Array[Int] = {
        assertUpdateOptionNotNull(option);
        return doBatchUpdateNonstrict(purchaseList.asJava, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param purchaseList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    def varyingBatchDelete(purchaseList: scala.collection.immutable.List[Purchase], option: DeleteOption[PurchaseCB]): Array[Int] = {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(purchaseList.asJava, option);
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param purchaseList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    def varyingBatchDeleteNonstrict(purchaseList: scala.collection.immutable.List[Purchase], option: DeleteOption[PurchaseCB]): Array[Int] = {
        assertDeleteOptionNotNull(option);
        return doBatchDeleteNonstrict(purchaseList.asJava, option);
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
    def varyingQueryInsert(setupper: QueryInsertSetupper[Purchase, PurchaseCB], option: InsertOption[PurchaseCB]): Integer = {
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
     * Purchase purchase = new Purchase();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//purchase.setPK...(value);</span>
     * purchase.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//purchase.setVersionNo(value);</span>
     * PurchaseCB cb = new PurchaseCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;PurchaseCB&gt; option = new UpdateOption&lt;PurchaseCB&gt;();
     * option.self(new SpecifyQuery&lt;PurchaseCB&gt;() {
     *     public void specify(PurchaseCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * purchaseBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(purchase, cb, option);
     * </pre>
     * @param purchase The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of Purchase. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    def varyingQueryUpdate(purchase: Purchase, cb: PurchaseCB, option: UpdateOption[PurchaseCB]): Integer = {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(purchase, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of Purchase. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    def varyingQueryDelete(cb: PurchaseCB, option: DeleteOption[PurchaseCB]): Integer = {
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
    def outsideSql(): OutsideSqlBasicExecutor[PurchaseBhv] = {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected def delegateSelectCountUniquely(cb: PurchaseCB): Integer = { return invoke(createSelectCountCBCommand(cb, true)); }
    protected def delegateSelectCountPlainly(cb: PurchaseCB): Integer = { return invoke(createSelectCountCBCommand(cb, false)); }
    protected def delegateSelectCursor[ENTITY <: Purchase](cb: PurchaseCB, rh: EntityRowHandler[ENTITY], tp: Class[ENTITY])
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected def delegateSelectList[ENTITY <: Purchase](cb: PurchaseCB, tp: Class[ENTITY]): List[ENTITY] =
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected def delegateInsert(et: Purchase, op: InsertOption[PurchaseCB]): Integer =
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected def delegateUpdate(et: Purchase, op: UpdateOption[PurchaseCB]): Integer =
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateEntityCommand(et, op)); }
    protected def delegateUpdateNonstrict(et: Purchase, op: UpdateOption[PurchaseCB]): Integer =
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected def delegateDelete(et: Purchase, op: DeleteOption[PurchaseCB]): Integer =
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteEntityCommand(et, op)); }
    protected def delegateDeleteNonstrict(et: Purchase, op: DeleteOption[PurchaseCB]): Integer =
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected def delegateBatchInsert(ls: List[Purchase], op: InsertOption[PurchaseCB]): Array[Int] =
    { if (ls.isEmpty()) { return new Array[Int](0); }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)).asInstanceOf[Array[Int]]; }
    protected def delegateBatchUpdate(ls: List[Purchase], op: UpdateOption[PurchaseCB]): Array[Int] =
    { if (ls.isEmpty()) { return new Array[Int](0); }
      return invoke(createBatchUpdateCommand(processBatchInternally(ls, op, false), op)).asInstanceOf[Array[Int]]; }
    protected def delegateBatchUpdateNonstrict(ls: List[Purchase], op: UpdateOption[PurchaseCB]): Array[Int] =
    { if (ls.isEmpty()) { return new Array[Int](0); }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)).asInstanceOf[Array[Int]]; }
    protected def delegateBatchDelete(ls: List[Purchase], op: DeleteOption[PurchaseCB]): Array[Int] =
    { if (ls.isEmpty()) { return new Array[Int](0); }
      return invoke(createBatchDeleteCommand(processBatchInternally(ls, op, false), op)).asInstanceOf[Array[Int]]; }
    protected def delegateBatchDeleteNonstrict(ls: List[Purchase], op: DeleteOption[PurchaseCB]): Array[Int] =
    { if (ls.isEmpty()) { return new Array[Int](0); }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)).asInstanceOf[Array[Int]]; }

    protected def delegateQueryInsert(et: Purchase, inCB: PurchaseCB, resCB: ConditionBean, op: InsertOption[PurchaseCB]): Integer =
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; }
      return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected def delegateQueryUpdate(et: Purchase, cb: PurchaseCB, op: UpdateOption[PurchaseCB]): Integer =
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; }
      return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected def delegateQueryDelete(cb: PurchaseCB, op: DeleteOption[PurchaseCB]): Integer =
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
        return !(downcast(et).getVersionNo() + "").equals("null");// For primitive type
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
    protected def downcast(et: Entity): Purchase = {
        return helpEntityDowncastInternally(et, classOf[Purchase]);
    }

    protected def downcast(cb: ConditionBean): PurchaseCB = {
        return helpConditionBeanDowncastInternally(cb, classOf[PurchaseCB]);
    }

    protected def downcast(ls: List[_ <: Entity]): List[Purchase] = {
        return ls.asInstanceOf[List[Purchase]];
    }

    protected def downcast(op: InsertOption[_ <: ConditionBean]): InsertOption[PurchaseCB] = {
        return op.asInstanceOf[InsertOption[PurchaseCB]];
    }

    protected def downcast(op: UpdateOption[_ <: ConditionBean]): UpdateOption[PurchaseCB] = {
        return op.asInstanceOf[UpdateOption[PurchaseCB]];
    }

    protected def downcast(op: DeleteOption[_ <: ConditionBean]): DeleteOption[PurchaseCB] = {
        return op.asInstanceOf[DeleteOption[PurchaseCB]];
    }

    protected def downcast(sp: QueryInsertSetupper[_ <: Entity, _ <: ConditionBean]): QueryInsertSetupper[Purchase, PurchaseCB] = {
        return sp.asInstanceOf[QueryInsertSetupper[Purchase, PurchaseCB]];
    }

    // ===================================================================================
    //                                                                        Scala Helper
    //                                                                        ============
    protected def toScalaList[ENTITY](javaList: List[ENTITY]): scala.collection.immutable.List[ENTITY] = {
         // #pending easy convert for now
        return scala.collection.immutable.List.fromArray(javaList.toArray()).asInstanceOf[scala.collection.immutable.List[ENTITY]];
    }
}
