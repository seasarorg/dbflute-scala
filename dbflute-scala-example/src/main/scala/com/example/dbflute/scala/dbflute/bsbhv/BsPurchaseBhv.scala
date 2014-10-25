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
 *     PURCHASE_PAYMENT
 *
 * [foreign property]
 *     member, product
 *
 * [referrer property]
 *     purchasePaymentList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
abstract class BsPurchaseBhv extends AbstractBehaviorWritable[DblePurchase, PurchaseCB] {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    def getDBMeta(): DBMeta = { return PurchaseDbm; }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    def newConditionBean(): PurchaseCB = { return new PurchaseCB(); }

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
     * @param cb The condition-bean of DblePurchase. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    def selectCount(cbCall: (PurchaseCB) => Unit): Int = {
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
     * PurchaseCB cb = new PurchaseCB();
     * cb.query().setFoo...(value);
     * OptionalEntity&lt;DblePurchase&gt; entity = purchaseBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     *
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * entity.<span style="color: #DD4747">required</span>(purchase -&gt; {
     *     ...
     * });
     * DblePurchase purchase = entity.entity.<span style="color: #DD4747">get()</span>;
     *
     * <span style="color: #3F7E5E">// if it might be no data, ifPresent(), isPresent(), ...</span>
     * entity.<span style="color: #DD4747">ifPresent</span>(purchase -&gt; {
     *     ...
     * });
     * if (entity.entity.<span style="color: #DD4747">isPresent()</span>) {
     *     DblePurchase purchase = entity.entity.<span style="color: #DD4747">get()</span>;
     * } else {
     *     ...
     * }
     * </pre>
     * @param cbCall The callback for condition-bean of Purchase. (NotNull)
     * @param loaderCall The callback for referrer loader of Purchase. (NoArgAllowed: then no loading)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get() of return value is called and the value is null, which means entity has already been deleted (point is not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    def selectEntity(cbCall: (PurchaseCB) => Unit)(implicit loaderCall: (LoaderOfPurchase) => Unit = null): Option[Purchase] = {
        return facadeSelectEntity(callbackCB(cbCall))(loaderCall).map(_.toImmutable);
    }

    protected def facadeSelectEntity(cb: PurchaseCB)(loaderCall: (LoaderOfPurchase) => Unit = null): Option[DblePurchase] = {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity())(loaderCall);
    }

    protected def doSelectEntity[ENTITY <: DblePurchase](cb: PurchaseCB, tp: Class[_ <: ENTITY])(loaderCall: (LoaderOfPurchase) => Unit = null): ENTITY = {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        val dble = helpSelectEntityInternally(cb, tp);
        if (dble != null) {
            callbackLoader(DfCollectionUtil.newArrayList(dble.asInstanceOf[DblePurchase]), loaderCall);
        }
        return dble;
    }

    protected def doSelectOptionalEntity[ENTITY <: DblePurchase](cb: PurchaseCB, tp: Class[_ <: ENTITY])(loaderCall: (LoaderOfPurchase) => Unit = null): Option[ENTITY] = {
        return Option.apply(doSelectEntity(cb, tp)(loaderCall));
    }

    override protected def doReadEntity(cb: ConditionBean): Entity = { facadeSelectEntity(downcast(cb))().orNull }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * PurchaseCB cb = new PurchaseCB();
     * cb.query().setFoo...(value);
     * DblePurchase purchase = purchaseBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = purchase.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbCall The callback for condition-bean of Purchase. (NotNull)
     * @param loaderCall The callback for referrer loader of Purchase. (NoArgAllowed: then no loading)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (point is not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    def selectEntityWithDeletedCheck(cbCall: (PurchaseCB) => Unit)(implicit loaderCall: (LoaderOfPurchase) => Unit = null): Purchase = {
        return facadeSelectEntityWithDeletedCheck(callbackCB(cbCall))(loaderCall).toImmutable;
    }

    protected def facadeSelectEntityWithDeletedCheck(cb: PurchaseCB)(loaderCall: (LoaderOfPurchase) => Unit = null): DblePurchase = {
        return doSelectEntityWithDeletedCheck(cb, typeOfSelectedEntity())(loaderCall);
    }

    protected def doSelectEntityWithDeletedCheck[ENTITY <: DblePurchase](cb: PurchaseCB, tp: Class[ENTITY])(loaderCall: (LoaderOfPurchase) => Unit = null): ENTITY = {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        val dble = helpSelectEntityWithDeletedCheckInternally(cb, tp);
        callbackLoader(DfCollectionUtil.newArrayList(dble.asInstanceOf[DblePurchase]), loaderCall);
        return dble;
    }

    override protected def doReadEntityWithDeletedCheck(cb: ConditionBean): Entity = { facadeSelectEntityWithDeletedCheck(downcast(cb))() }

    /**
     * Select the entity by the primary-key value.
     * @param purchaseId : PK, ID, NotNull, BIGINT(19). (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    def selectByPK(purchaseId: Long): Option[Purchase] = {
        return facadeSelectByPK(purchaseId).map(_.toImmutable);
    }

    protected def facadeSelectByPK(purchaseId: Long): Option[DblePurchase] = {
        return doSelectByPK(purchaseId, typeOfSelectedEntity());
    }

    protected def doSelectByPK[ENTITY <: DblePurchase](purchaseId: Long, tp: Class[_ <: ENTITY]): Option[ENTITY] = {
        return Option.apply(doSelectEntity(xprepareCBAsPK(purchaseId), tp)());
    }

    protected def xprepareCBAsPK(purchaseId: Long): PurchaseCB = {
        assertObjectNotNull("purchaseId", purchaseId);
        return newConditionBean().acceptPK(purchaseId);
    }

    /**
     * Select the entity by the unique-key value.
     * @param memberId (会員ID): UQ+, IX+, NotNull, INTEGER(10), FK to MEMBER. (NotNull)
     * @param productId (商品ID): +UQ, IX+, NotNull, INTEGER(10), FK to PRODUCT. (NotNull)
     * @param purchaseDatetime (購入日時): +UQ, IX+, NotNull, TIMESTAMP(23, 10). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    def selectByUniqueOf(memberId: Integer, productId: Integer, purchaseDatetime: org.joda.time.LocalDateTime): Option[Purchase] = {
        return facadeSelectByUniqueOf(memberId, productId, purchaseDatetime).map(_.toImmutable);
    }

    protected def facadeSelectByUniqueOf(memberId: Integer, productId: Integer, purchaseDatetime: org.joda.time.LocalDateTime): Option[DblePurchase] = {
        return doSelectByUniqueOf(memberId, productId, purchaseDatetime, typeOfSelectedEntity());
    }

    protected def doSelectByUniqueOf[ENTITY <: DblePurchase](memberId: Integer, productId: Integer, purchaseDatetime: org.joda.time.LocalDateTime, tp: Class[_ <: ENTITY]): Option[ENTITY] = {
        return Option.apply(doSelectEntity(xprepareCBAsUniqueOf(memberId, productId, purchaseDatetime), tp)());
    }

    protected def xprepareCBAsUniqueOf(memberId: Integer, productId: Integer, purchaseDatetime: org.joda.time.LocalDateTime): PurchaseCB = {
        assertObjectNotNull("memberId", memberId);assertObjectNotNull("productId", productId);assertObjectNotNull("purchaseDatetime", purchaseDatetime);
        return newConditionBean().acceptUniqueOf(memberId, productId, purchaseDatetime);
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
     * List&lt;${Purchase}&gt; purchaseList = purchaseBhv.<span style="color: #DD4747">selectList</span>(cb);
     * purchaseList.foreach(purchase =>
     *     ... = purchase...;
     * }
     * </pre>
     * @param cbCall The callback for condition-bean of Purchase. (NotNull)
     * @param loaderCall The callback for referrer loader of Purchase. (NoArgAllowed: then no loading)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    def selectList(cbCall: (PurchaseCB) => Unit)(implicit loaderCall: (LoaderOfPurchase) => Unit = null): immutable.List[Purchase] = {
        return toImmutableEntityList(facadeSelectList(callbackCB(cbCall))(loaderCall));
    }

    protected def facadeSelectList(cb: PurchaseCB)(loaderCall: (LoaderOfPurchase) => Unit = null): ListResultBean[DblePurchase] = {
        return doSelectList(cb, typeOfSelectedEntity())(loaderCall);
    }

    protected def doSelectList[RESULT <: DblePurchase](cb: PurchaseCB, tp: Class[RESULT])(loaderCall: (LoaderOfPurchase) => Unit = null): ListResultBean[RESULT] = {
        val dbleList = helpSelectListInternally(cb, tp);
        callbackLoader(dbleList.asInstanceOf[List[DblePurchase]], loaderCall);
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
     * PurchaseCB cb = new PurchaseCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;DblePurchase&gt; page = purchaseBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (DblePurchase purchase : page) {
     *     ... = purchase.get...();
     * }
     * </pre>
     * @param cbCall The callback for condition-bean of Purchase. (NotNull)
     * @param loaderCall The callback for referrer loader of Purchase. (NoArgAllowed: then no loading)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    def selectPage(cbCall: (PurchaseCB) => Unit)(implicit loaderCall: (LoaderOfPurchase) => Unit = null): ScrPagingView[Purchase] = {
        return newPagingView(facadeSelectPage(callbackCB(cbCall))(loaderCall));
    }

    protected def facadeSelectPage(cb: PurchaseCB)(loaderCall: (LoaderOfPurchase) => Unit = null): PagingResultBean[DblePurchase] = {
        return doSelectPage(cb, typeOfSelectedEntity())(loaderCall);
    }

    protected def doSelectPage[RESULT <: DblePurchase](cb: PurchaseCB, tp: Class[RESULT])(loaderCall: (LoaderOfPurchase) => Unit = null): PagingResultBean[RESULT] = {
        val dbleList = helpSelectPageInternally(cb, tp);
        callbackLoader(dbleList.asInstanceOf[List[DblePurchase]], loaderCall);
        return dbleList;
    }

    override protected def doReadPage(cb: ConditionBean): PagingResultBean[_ <: Entity] = { facadeSelectPage(downcast(cb))() }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * PurchaseCB cb = new PurchaseCB();
     * cb.query().setFoo...(value);
     * purchaseBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;DblePurchase&gt;() {
     *     public void handle(DblePurchase entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of DblePurchase. (NotNull)
     * @param entityRowHandler The handler of entity row of DblePurchase. (NotNull)
     */
    def selectCursor(cbCall: (PurchaseCB) => Unit)(rowCall: (Purchase) => Unit): Unit = {
        facadeSelectCursor(callbackCB(cbCall), new EntityRowHandler[DblePurchase]() {
            def handle(entity: DblePurchase): Unit = { rowCall(entity.toImmutable) }
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
    def scalarSelect[RESULT](resultType: Class[RESULT]): ScrHpSLSFunction[PurchaseCB, RESULT] = {
        return toScalaSLSFunction[RESULT](facadeScalarSelect(resultType));
    }

    protected def toScalaSLSFunction[RESULT](function: HpSLSFunction[PurchaseCB, RESULT]): ScrHpSLSFunction[PurchaseCB, RESULT] =
    { new ScrHpSLSFunction[PurchaseCB, RESULT](function) }

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
     * Load referrer of purchasePaymentList by the set-upper of referrer. <br />
     * (購入支払)PURCHASE_PAYMENT by PURCHASE_ID, named 'purchasePaymentList'.
     * <pre>
     * purchaseBhv.<span style="color: #DD4747">loadPurchasePaymentList</span>(purchaseList, new ReferrerConditionSetupper&lt;PurchasePaymentCB&gt;() {
     *     public void setup(PurchasePaymentCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * for (DblePurchase purchase : purchaseList) {
     *     ... = purchase.<span style="color: #DD4747">getPurchasePaymentList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPurchaseId_InScope(pkList);
     * cb.query().addOrderBy_PurchaseId_Asc();
     * </pre>
     * @param purchaseList The entity list of purchase. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    def loadPurchasePaymentList(purchaseList: List[DblePurchase], setupCall: (PurchasePaymentCB) => Unit): NestedReferrerListGateway[DblePurchasePayment] = {
        assertObjectNotNull("purchaseList", purchaseList); assertObjectNotNull("setupCall", setupCall);
        val setupper = new ReferrerConditionSetupper[PurchasePaymentCB]() { def setup(referrerCB: PurchasePaymentCB): Unit = { setupCall(referrerCB); } }
        return doLoadPurchasePaymentList(purchaseList, new LoadReferrerOption[PurchasePaymentCB, DblePurchasePayment]().xinit(setupper));
    }

    /**
     * Load referrer of purchasePaymentList by the set-upper of referrer. <br />
     * (購入支払)PURCHASE_PAYMENT by PURCHASE_ID, named 'purchasePaymentList'.
     * <pre>
     * purchaseBhv.<span style="color: #DD4747">loadPurchasePaymentList</span>(purchaseList, new ReferrerConditionSetupper&lt;PurchasePaymentCB&gt;() {
     *     public void setup(PurchasePaymentCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = purchase.<span style="color: #DD4747">getPurchasePaymentList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPurchaseId_InScope(pkList);
     * cb.query().addOrderBy_PurchaseId_Asc();
     * </pre>
     * @param purchase The entity of purchase. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    def loadPurchasePaymentList(purchase: DblePurchase, setupCall: (PurchasePaymentCB) => Unit): NestedReferrerListGateway[DblePurchasePayment] = {
        assertObjectNotNull("purchase", purchase); assertObjectNotNull("setupCall", setupCall);
        val setupper = new ReferrerConditionSetupper[PurchasePaymentCB]() { def setup(referrerCB: PurchasePaymentCB): Unit = { setupCall(referrerCB); } }
        return doLoadPurchasePaymentList(xnewLRLs(purchase), new LoadReferrerOption[PurchasePaymentCB, DblePurchasePayment]().xinit(setupper));
    }

    protected def doLoadPurchasePaymentList(purchaseList: List[DblePurchase], option: LoadReferrerOption[PurchasePaymentCB, DblePurchasePayment]): NestedReferrerListGateway[DblePurchasePayment] = {
        return helpLoadReferrerInternally(purchaseList, option, "purchasePaymentList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'DbleMember'.
     * @param purchaseList The list of purchase. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    def pulloutMember(purchaseList: immutable.List[Purchase]): immutable.List[Member] = {
        val dbleList = helpPulloutInternally(toDBableEntityList(purchaseList), "member");
        return toScalaList(dbleList).map(new Member(_));
    }

    /**
     * Pull out the list of foreign table 'DbleProduct'.
     * @param purchaseList The list of purchase. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    def pulloutProduct(purchaseList: immutable.List[Purchase]): immutable.List[Product] = {
        val dbleList = helpPulloutInternally(toDBableEntityList(purchaseList), "product");
        return toScalaList(dbleList).map(new Product(_));
    }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key purchaseId.
     * @param purchaseList The list of purchase. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    def extractPurchaseIdList(purchaseList: immutable.List[Purchase]): immutable.List[Long] = {
        val plainList = helpExtractListInternally(toDBableEntityList(purchaseList), "purchaseId");
        return toScalaList(plainList).map(_.asInstanceOf[Long]);
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * DblePurchase purchase = new DblePurchase();
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
     * @param entityCall The callback for entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param optionCall The callback for option of insert. (NoArgAllowed: then no option)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    def insert(entityCall: (MblePurchase) => Unit)(implicit optionCall: (ScrInsertOption[PurchaseCB]) => Unit = null): Unit = {
        assertObjectNotNull("entityCall", entityCall);
        doInsert(callbackMbleEntityToDBable(entityCall), callbackInsertOption(optionCall));
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl)
     * <pre>
     * DblePurchase purchase = new DblePurchase();
     * purchase.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * purchase.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//purchase.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//purchase.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * purchase.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     purchaseBhv.<span style="color: #DD4747">update</span>(purchase);
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
    def update(entityCall: (MblePurchase) => Unit)(implicit optionCall: (ScrUpdateOption[PurchaseCB]) => Unit = null): Unit = {
        assertObjectNotNull("entityCall", entityCall);
        doUpdate(callbackMbleEntityToDBable(entityCall), callbackUpdateOption(optionCall));
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * DblePurchase purchase = new DblePurchase();
     * purchase.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * purchase.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//purchase.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//purchase.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//purchase.setVersionNo(value);</span>
     * purchaseBhv.<span style="color: #DD4747">updateNonstrict</span>(purchase);
     * </pre>
     * @param entityCall The callback for entity of update. (NotNull, PrimaryKeyNotNull)
     * @param optionCall The callback for option of update. (NoArgAllowed: then no option)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    def updateNonstrict(entityCall: (MblePurchase) => Unit)(implicit optionCall: (ScrUpdateOption[PurchaseCB]) => Unit = null): Unit = {
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
    def insertOrUpdate(entityCall: (MblePurchase) => Unit)(implicit insertOptionCall: (ScrInsertOption[PurchaseCB]) => Unit = null, updateOptionCall: (ScrUpdateOption[PurchaseCB]) => Unit = null): Unit = {
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
    def insertOrUpdateNonstrict(entityCall: (MblePurchase) => Unit)(implicit insertOptionCall: (ScrInsertOption[PurchaseCB]) => Unit = null, updateOptionCall: (ScrUpdateOption[PurchaseCB]) => Unit = null): Unit = {
        doInsertOrUpdateNonstrict(callbackMbleEntityToDBable(entityCall), callbackInsertOption(insertOptionCall), callbackUpdateOption(updateOptionCall));
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl)
     * <pre>
     * DblePurchase purchase = new DblePurchase();
     * purchase.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * purchase.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     purchaseBhv.<span style="color: #DD4747">delete</span>(purchase);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param entityCall The callback for entity of delete. (NotNull, PrimaryKeyNotNull)
     * @param optionCall The callback for option of delete. (NoArgAllowed: then no option)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    def delete(entityCall: (MblePurchase) => Unit)(implicit optionCall: (ScrDeleteOption[PurchaseCB]) => Unit = null): Unit = {
        doDelete(callbackMbleEntityToDBable(entityCall), callbackDeleteOption(optionCall));
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * DblePurchase purchase = new DblePurchase();
     * purchase.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//purchase.setVersionNo(value);</span>
     * purchaseBhv.<span style="color: #DD4747">deleteNonstrict</span>(purchase);
     * </pre>
     * @param entityCall The callback for entity of delete. (NotNull, PrimaryKeyNotNull)
     * @param optionCall The callback for option of delete. (NoArgAllowed: then no option)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    def deleteNonstrict(entityCall: (MblePurchase) => Unit)(implicit optionCall: (ScrDeleteOption[PurchaseCB]) => Unit = null): Unit = {
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
     *     DblePurchase purchase = new DblePurchase();
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
    def batchInsert(batchCall: (ScrBatchEntityList[MblePurchase]) => Unit)(implicit optionCall: (ScrInsertOption[PurchaseCB]) => Unit = null): Array[Int] = {
        return doBatchInsert(callbackBatch(batchCall), callbackInsertOption(optionCall));
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     DblePurchase purchase = new DblePurchase();
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
    def batchUpdate(batchCall: (ScrBatchEntityList[MblePurchase]) => Unit)(implicit optionCall: (ScrUpdateOption[PurchaseCB]) => Unit = null): Array[Int] = {
        return doBatchUpdate(callbackBatch(batchCall), callbackUpdateOption(optionCall));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     DblePurchase purchase = new DblePurchase();
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
    def batchUpdateNonstrict(batchCall: (ScrBatchEntityList[MblePurchase]) => Unit)(implicit optionCall: (ScrUpdateOption[PurchaseCB]) => Unit = null): Array[Int] = {
        return doBatchUpdateNonstrict(callbackBatch(batchCall), callbackUpdateOption(optionCall));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param purchaseList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    def batchDelete(batchCall: (ScrBatchEntityList[MblePurchase]) => Unit)(implicit optionCall: (ScrDeleteOption[PurchaseCB]) => Unit = null): Array[Int] = {
        return doBatchDelete(callbackBatch(batchCall), callbackDeleteOption(optionCall));
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param purchaseList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    def batchDeleteNonstrict(batchCall: (ScrBatchEntityList[MblePurchase]) => Unit)(implicit optionCall: (ScrDeleteOption[PurchaseCB]) => Unit = null): Array[Int] = {
        return doBatchDeleteNonstrict(callbackBatch(batchCall), callbackDeleteOption(optionCall));
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * purchaseBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;DblePurchase, PurchaseCB&gt;() {
     *     public ConditionBean setup(DblePurchase entity, PurchaseCB intoCB) {
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
    def queryInsert(setupperCall: (MblePurchase, PurchaseCB) => ConditionBean): Int = {
        return doQueryInsert(callbackQueryInsertSetupper(setupperCall), null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * DblePurchase purchase = new DblePurchase();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//purchase.setPK...(value);</span>
     * purchase.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//purchase.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//purchase.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//purchase.setVersionNo(value);</span>
     * PurchaseCB cb = new PurchaseCB();
     * cb.query().setFoo...(value);
     * purchaseBhv.<span style="color: #DD4747">queryUpdate</span>(purchase, cb);
     * </pre>
     * @param entityCall The callback for entity that contains update values. (NotNull)
     * @param cbCall The callback for condition-bean of Purchase. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    def queryUpdate(entityCall: (MblePurchase) => Unit)(cbCall: (PurchaseCB) => Unit): Int = {
        assertObjectNotNull("entityCall", entityCall); assertObjectNotNull("cbCall", cbCall);
        return doQueryUpdate(callbackMbleEntityToDBable(entityCall), callbackCB(cbCall), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * PurchaseCB cb = new PurchaseCB();
     * cb.query().setFoo...(value);
     * purchaseBhv.<span style="color: #DD4747">queryDelete</span>(purchase, cb);
     * </pre>
     * @param cbCall The callback for condition-bean of Purchase. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    def queryDelete(cbCall: (PurchaseCB) => Unit): Int = {
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
    def outsideSql(): ScrOutsideSqlTypedBasicExecutor[PurchaseBhv] = {
        val facadeExecutor: OutsideSqlAllFacadeExecutor[PurchaseBhv] = doOutsideSql();
        return toImmutableOutsideSqlTypedBasicExecutor(facadeExecutor.xbasicExecutor()); // variable to resolve generic type
    }

    protected def toImmutableOutsideSqlTypedBasicExecutor(executor: OutsideSqlBasicExecutor[PurchaseBhv]): ScrOutsideSqlTypedBasicExecutor[PurchaseBhv] =
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
    protected def callbackCB(cbCall: (PurchaseCB) => Unit): PurchaseCB = {
        assertObjectNotNull("cbCall", cbCall);
        val cb = newConditionBean(); cbCall(cb); return cb;
    }

    protected def callbackBatch(batchCall: (ScrBatchEntityList[MblePurchase]) => Unit): List[DblePurchase] = {
        assertObjectNotNull("batchCall", batchCall);
        val batch = new ScrBatchEntityList[MblePurchase]();
        val entityList: List[DblePurchase] = new ArrayList[DblePurchase]();
        batch.entityCallList.asScala.map { entityCall =>
            val entity = newMbleEntity(); entityCall(entity); entity.toDBable;
        }
        return entityList;
    }

    protected def callbackMbleEntity(entityCall: (MblePurchase) => Unit): MblePurchase = {
        assertObjectNotNull("entityCall", entityCall);
        val entity = newMbleEntity(); entityCall(entity); return entity;
    }

    protected def callbackMbleEntityToDBable(entityCall: (MblePurchase) => Unit): DblePurchase = {
        return callbackMbleEntity(entityCall).toDBable;
    }

    protected def callbackInsertOption(optionCall: (ScrInsertOption[PurchaseCB]) => Unit): InsertOption[PurchaseCB] = {
        if (optionCall == null) { return null; }
        val option = new ScrInsertOption[PurchaseCB](new InsertOption[PurchaseCB]());
        optionCall(option); return option.toNative;
    }

    protected def callbackUpdateOption(optionCall: (ScrUpdateOption[PurchaseCB]) => Unit): UpdateOption[PurchaseCB] = {
        if (optionCall == null) { return null; }
        val option = new ScrUpdateOption[PurchaseCB](new UpdateOption[PurchaseCB]()); optionCall(option); return option.toNative;
    }

    protected def callbackDeleteOption(optionCall: (ScrDeleteOption[PurchaseCB]) => Unit): DeleteOption[PurchaseCB] = {
        if (optionCall == null) { return null; }
        val option = new ScrDeleteOption[PurchaseCB](new DeleteOption[PurchaseCB]()); optionCall(option); return option.toNative;
    }

    protected def callbackQueryInsertSetupper(setupperCall: (MblePurchase, PurchaseCB) => ConditionBean): QueryInsertSetupper[DblePurchase, PurchaseCB] = {
        assertObjectNotNull("setupperCall", setupperCall);
        return new QueryInsertSetupper[DblePurchase, PurchaseCB]() {
            def setup(entity: DblePurchase, intoCB: PurchaseCB): ConditionBean = {
                val mble = newMbleEntity();
                val resultCB = setupperCall(mble, intoCB);
                entity.acceptImmutable(mble.toImmutable());
                return resultCB;
            }
        };
    }

    protected def callbackLoader(dbleList: List[DblePurchase], loaderCall: (LoaderOfPurchase) => Unit = null): Unit = {
        if (loaderCall == null) { return; }
        val loader = new LoaderOfPurchase();
        loader.ready(dbleList.asInstanceOf[List[DblePurchase]], _behaviorSelector);
        loaderCall(loader);
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    override protected def typeOfSelectedEntity(): Class[DblePurchase] = { classOf[DblePurchase] }
    override protected def typeOfHandlingEntity(): Class[DblePurchase] = { classOf[DblePurchase] }
    override protected def typeOfHandlingConditionBean(): Class[PurchaseCB] = { classOf[PurchaseCB] }
    protected def newMbleEntity(): MblePurchase = { new MblePurchase() }
    protected def newPagingView(rb: PagingResultBean[DblePurchase]): ScrPagingView[Purchase] =
    { new ScrPagingView(toImmutableEntityList(rb), rb) }

    // ===================================================================================
    //                                                                        Scala Helper
    //                                                                        ============
    protected def toScalaList[ENTITY](javaList: Collection[ENTITY]): immutable.List[ENTITY] = {
        if (javaList == null) { immutable.List() }
        return javaList.toArray.toList.asInstanceOf[immutable.List[ENTITY]];
    }

    def toImmutableEntityList(dbleList: Collection[DblePurchase]): immutable.List[Purchase] =
    { toScalaList(dbleList).map(new Purchase(_)) }

    def toDBableEntityList(immuList: immutable.List[Purchase]): List[DblePurchase] =
    { immuList.map(new DblePurchase().acceptImmutable(_)).asJava }
}
