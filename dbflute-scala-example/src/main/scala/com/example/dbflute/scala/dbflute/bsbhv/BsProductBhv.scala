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
 * The behavior of (商品)PRODUCT as TABLE. <br />
 * <pre>
 * [primary key]
 *     PRODUCT_ID
 *
 * [column]
 *     PRODUCT_ID, PRODUCT_NAME, PRODUCT_HANDLE_CODE, PRODUCT_CATEGORY_CODE, PRODUCT_STATUS_CODE, REGULAR_PRICE, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PRODUCT_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     PURCHASE
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     purchaseList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
abstract class BsProductBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    def getTableDbName(): String = { return "PRODUCT"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    def getDBMeta(): DBMeta = { return ProductDbm; }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    def newEntity(): Entity = { return newMyEntity(); }

    /** {@inheritDoc} */
    def newConditionBean(): ConditionBean = { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    def newMyEntity(): DbleProduct = { return new DbleProduct(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    def newMyConditionBean(): ProductCB = { return new ProductCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * ProductCB cb = new ProductCB();
     * cb.query().setFoo...(value);
     * int count = productBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of DbleProduct. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    def selectCount(cbCall: (ProductCB) => Unit): Int = {
        return facadeSelectCount(callbackCB(cbCall));
    }

    def facadeSelectCount(cb: ProductCB): Int = {
        return Integer2int(doSelectCountUniquely(cb));
    }

    protected def doSelectCountUniquely(cb: ProductCB): Integer = { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected def doSelectCountPlainly(cb: ProductCB): Integer = { // called by selectPage(cb)
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
     * ProductCB cb = new ProductCB();
     * cb.query().setFoo...(value);
     * OptionalEntity&lt;DbleProduct&gt; entity = productBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     *
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * entity.<span style="color: #DD4747">required</span>(product -&gt; {
     *     ...
     * });
     * DbleProduct product = entity.entity.<span style="color: #DD4747">get()</span>;
     *
     * <span style="color: #3F7E5E">// if it might be no data, ifPresent(), isPresent(), ...</span>
     * entity.<span style="color: #DD4747">ifPresent</span>(product -&gt; {
     *     ...
     * });
     * if (entity.entity.<span style="color: #DD4747">isPresent()</span>) {
     *     DbleProduct product = entity.entity.<span style="color: #DD4747">get()</span>;
     * } else {
     *     ...
     * }
     * </pre>
     * @param cbCall The callback for condition-bean of Product. (NotNull)
     * @param loaderCall The callback for referrer loader of Product. (NoArgAllowed: then no loading)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get() of return value is called and the value is null, which means entity has already been deleted (point is not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    def selectEntity(cbCall: (ProductCB) => Unit)(implicit loaderCall: (LoaderOfProduct) => Unit = null): Option[Product] = {
        return facadeSelectEntity(callbackCB(cbCall))(loaderCall);
    }

    protected def facadeSelectEntity(cb: ProductCB)(loaderCall: (LoaderOfProduct) => Unit = null): Option[Product] = {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity())(loaderCall).map(f => new Product(f));
    }

    protected def doSelectEntity[ENTITY <: DbleProduct](cb: ProductCB, tp: Class[ENTITY])(loaderCall: (LoaderOfProduct) => Unit = null): ENTITY = {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        val dble = helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback[ENTITY, ProductCB]() {
            def callbackSelectList(lcb: ProductCB, ltp: Class[ENTITY]): List[ENTITY] = { return doSelectList(lcb, ltp)(); } });
        if (dble != null) {
            doCallbackLoader(DfCollectionUtil.newArrayList(dble.asInstanceOf[DbleProduct]), loaderCall);
        }
        return dble;
    }

    protected def doSelectOptionalEntity[ENTITY <: DbleProduct](cb: ProductCB, tp: Class[ENTITY])(loaderCall: (LoaderOfProduct) => Unit = null): Option[ENTITY] = {
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
     * ProductCB cb = new ProductCB();
     * cb.query().setFoo...(value);
     * DbleProduct product = productBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = product.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbCall The callback for condition-bean of Product. (NotNull)
     * @param loaderCall The callback for referrer loader of Product. (NoArgAllowed: then no loading)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (point is not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    def selectEntityWithDeletedCheck(cbCall: (ProductCB) => Unit)(implicit loaderCall: (LoaderOfProduct) => Unit = null): Product = {
        return facadeSelectEntityWithDeletedCheck(callbackCB(cbCall))(loaderCall);
    }

    protected def facadeSelectEntityWithDeletedCheck(cb: ProductCB)(loaderCall: (LoaderOfProduct) => Unit = null): Product = {
        return new Product(doSelectEntityWithDeletedCheck(cb, typeOfSelectedEntity())(loaderCall));
    }

    protected def doSelectEntityWithDeletedCheck[ENTITY <: DbleProduct](cb: ProductCB, tp: Class[ENTITY])(loaderCall: (LoaderOfProduct) => Unit = null): ENTITY = {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        val dble = helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback[ENTITY, ProductCB]() {
            def callbackSelectList(lcb: ProductCB, ltp: Class[ENTITY]): List[ENTITY] = { return doSelectList(lcb, ltp)(); } });
        doCallbackLoader(DfCollectionUtil.newArrayList(dble.asInstanceOf[DbleProduct]), loaderCall);
        return dble;
    }

    @Override
    protected def doReadEntityWithDeletedCheck(cb: ConditionBean): Entity = {
        return doSelectEntityWithDeletedCheck(downcast(cb), typeOfSelectedEntity())();
    }

    /**
     * Select the entity by the primary-key value.
     * @param productId : PK, ID, NotNull, INTEGER(10). (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    def selectByPK(productId: Integer): Option[Product] = {
        return facadeSelectByPK(productId);
    }

    def facadeSelectByPK(productId: Integer): Option[Product] = {
        return doSelectByPK(productId, typeOfSelectedEntity()).map(f => new Product(f));
    }

    protected def doSelectByPK[ENTITY <: DbleProduct](productId: Integer, entityType: Class[ENTITY]): Option[ENTITY] = {
        return Option.apply(doSelectEntity(xprepareCBAsPK(productId), entityType)());
    }

    protected def xprepareCBAsPK(productId: Integer): ProductCB = {
        assertObjectNotNull("productId", productId);
        val cb: ProductCB = newMyConditionBean();
        cb.query().setProductId_Equal(productId);;
        return cb;
    }

    /**
     * Select the entity by the unique-key value.
     * @param productHandleCode (商品ハンドルコード): UQ, NotNull, VARCHAR(100). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    def selectByUniqueOf(productHandleCode: String): Option[Product] = {
        return facadeSelectByUniqueOf(productHandleCode);
    }

    protected def facadeSelectByUniqueOf(productHandleCode: String): Option[Product] = {
        return doSelectByUniqueOf(productHandleCode, typeOfSelectedEntity()).map(f => new Product(f));
    }

    protected def doSelectByUniqueOf[ENTITY <: DbleProduct](productHandleCode: String, entityType: Class[ENTITY]): Option[ENTITY] = {
        return Option.apply(doSelectEntity(xprepareCBAsUniqueOf(productHandleCode), entityType)());
    }

    protected def xprepareCBAsUniqueOf(productHandleCode: String): ProductCB = {
        assertObjectNotNull("productHandleCode", productHandleCode);
        val cb: ProductCB = newMyConditionBean(); cb.acceptUniqueOf(productHandleCode);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * ProductCB cb = new ProductCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * List&lt;${Product}&gt; productList = productBhv.<span style="color: #DD4747">selectList</span>(cb);
     * productList.foreach(product =>
     *     ... = product...;
     * }
     * </pre>
     * @param cbCall The callback for condition-bean of Product. (NotNull)
     * @param loaderCall The callback for referrer loader of Product. (NoArgAllowed: then no loading)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    def selectList(cbCall: (ProductCB) => Unit)(implicit loaderCall: (LoaderOfProduct) => Unit = null): scala.collection.immutable.List[Product] = {
        return facadeSelectList(callbackCB(cbCall))(loaderCall);
    }

    protected def facadeSelectList(cb: ProductCB)(loaderCall: (LoaderOfProduct) => Unit = null): scala.collection.immutable.List[Product] = {
        return toImmutableEntityList(doSelectList(cb, typeOfSelectedEntity())(loaderCall));
    }

    protected def doSelectList[ENTITY <: DbleProduct](cb: ProductCB, tp: Class[ENTITY])(loaderCall: (LoaderOfProduct) => Unit = null): ListResultBean[ENTITY] = {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        val dbleList = helpSelectListInternally(cb, tp, new InternalSelectListCallback[ENTITY, ProductCB]() {
            def callbackSelectList(lcb: ProductCB, ltp: Class[ENTITY]): List[ENTITY] = { return delegateSelectList(lcb, ltp); } });
        doCallbackLoader(dbleList.asInstanceOf[List[DbleProduct]], loaderCall);
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
     * ProductCB cb = new ProductCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;DbleProduct&gt; page = productBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (DbleProduct product : page) {
     *     ... = product.get...();
     * }
     * </pre>
     * @param cbCall The callback for condition-bean of Product. (NotNull)
     * @param loaderCall The callback for referrer loader of Product. (NoArgAllowed: then no loading)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    def selectPage(cbCall: (ProductCB) => Unit)(implicit loaderCall: (LoaderOfProduct) => Unit = null): PagingResultBean[DbleProduct] = {
        return facadeSelectPage(callbackCB(cbCall))(loaderCall);
    }

    def facadeSelectPage(cb: ProductCB)(loaderCall: (LoaderOfProduct) => Unit = null): PagingResultBean[DbleProduct] = {
        return doSelectPage(cb, typeOfSelectedEntity())(loaderCall);
    }

    protected def doSelectPage[ENTITY <: DbleProduct](cb: ProductCB, tp: Class[ENTITY])(loaderCall: (LoaderOfProduct) => Unit = null): PagingResultBean[ENTITY] = {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback[ENTITY, ProductCB]() {
            def callbackSelectCount(cb: ProductCB): Int = { return doSelectCountPlainly(cb); }
            def callbackSelectList(cb: ProductCB, tp: Class[ENTITY]): List[ENTITY] = { return doSelectList(cb, tp)(loaderCall); }
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
     * ProductCB cb = new ProductCB();
     * cb.query().setFoo...(value);
     * productBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;DbleProduct&gt;() {
     *     public void handle(DbleProduct entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of DbleProduct. (NotNull)
     * @param entityRowHandler The handler of entity row of DbleProduct. (NotNull)
     */
    def selectCursor(cbCall: (ProductCB) => Unit)(rowCall: (Product) => Unit): Unit = {
        facadeSelectCursor(callbackCB(cbCall))(rowCall);
    }

    protected def facadeSelectCursor(cb: ProductCB)(rowCall: (Product) => Unit): Unit = {
        doSelectCursor(cb, new EntityRowHandler[DbleProduct]() {
            def handle(entity: DbleProduct): Unit = {
                rowCall(new Product(entity))
            }
        }, typeOfSelectedEntity());
    }

    protected def doSelectCursor[ENTITY <: DbleProduct](cb: ProductCB, handler: EntityRowHandler[ENTITY], tp: Class[ENTITY]): Unit = {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback[ENTITY, ProductCB]() {
            def callbackSelectCursor(cb: ProductCB, handler: EntityRowHandler[ENTITY], tp: Class[ENTITY]): Unit = { delegateSelectCursor(cb, handler, tp); }
            def callbackSelectList(cb: ProductCB, tp: Class[ENTITY]): List[ENTITY] = { return doSelectList(cb, tp)(); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * productBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(ProductCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    def scalarSelect[RESULT](resultType: Class[RESULT]): SLFunction[ProductCB, RESULT] = {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected def doScalarSelect[RESULT, CB <: ProductCB](tp: Class[RESULT], cb: CB): SLFunction[CB, RESULT] = {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction[RESULT, CB](cb, tp);
    }

    protected def createSLFunction[RESULT, CB <: ProductCB](cb: CB, tp: Class[RESULT]): SLFunction[CB, RESULT] = {
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
    //                                                                       Load Referrer
    //                                                                       =============
    /**
     * Load referrer of purchaseList by the set-upper of referrer. <br />
     * (購入)PURCHASE by PRODUCT_ID, named 'purchaseList'.
     * <pre>
     * productBhv.<span style="color: #DD4747">loadPurchaseList</span>(productList, new ReferrerConditionSetupper&lt;PurchaseCB&gt;() {
     *     public void setup(PurchaseCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * for (DbleProduct product : productList) {
     *     ... = product.<span style="color: #DD4747">getPurchaseList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param productList The entity list of product. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    def loadPurchaseList(productList: List[DbleProduct], setupCall: (PurchaseCB) => Unit): NestedReferrerLoader[DblePurchase] = {
        assertObjectNotNull("productList", productList); assertObjectNotNull("setupCall", setupCall);
        val setupper = new ReferrerConditionSetupper[PurchaseCB]() { def setup(referrerCB: PurchaseCB): Unit = { setupCall(referrerCB); } }
        return doLoadPurchaseList(productList, new LoadReferrerOption[PurchaseCB, DblePurchase]().xinit(setupper));
    }

    /**
     * Load referrer of purchaseList by the set-upper of referrer. <br />
     * (購入)PURCHASE by PRODUCT_ID, named 'purchaseList'.
     * <pre>
     * productBhv.<span style="color: #DD4747">loadPurchaseList</span>(productList, new ReferrerConditionSetupper&lt;PurchaseCB&gt;() {
     *     public void setup(PurchaseCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = product.<span style="color: #DD4747">getPurchaseList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param product The entity of product. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    def loadPurchaseList(product: DbleProduct, setupCall: (PurchaseCB) => Unit): NestedReferrerLoader[DblePurchase] = {
        assertObjectNotNull("product", product); assertObjectNotNull("setupCall", setupCall);
        val setupper = new ReferrerConditionSetupper[PurchaseCB]() { def setup(referrerCB: PurchaseCB): Unit = { setupCall(referrerCB); } }
        return doLoadPurchaseList(xnewLRLs(product), new LoadReferrerOption[PurchaseCB, DblePurchase]().xinit(setupper));
    }

    protected def doLoadPurchaseList(productList: List[DbleProduct], option: LoadReferrerOption[PurchaseCB, DblePurchase]): NestedReferrerLoader[DblePurchase] = {
        val referrerBhv: PurchaseBhv = xgetBSFLR().select(classOf[PurchaseBhv]);
        return helpLoadReferrerInternally(productList, option, new InternalLoadReferrerCallback[DbleProduct, Integer, PurchaseCB, DblePurchase]() {
            def getPKVal(et: DbleProduct): Integer =
            { return et.getProductId(); }
            def setRfLs(et: DbleProduct, ls: List[DblePurchase]): Unit =
            { et.setPurchaseList(ls); }
            def newMyCB(): PurchaseCB = { return referrerBhv.newMyConditionBean(); }
            def qyFKIn(cb: PurchaseCB, ls: List[Integer]): Unit =
            { cb.query().setProductId_InScope(toScalaList(ls).map(_.asInstanceOf[Int])); }
            def qyOdFKAsc(cb: PurchaseCB): Unit = { cb.query().addOrderBy_ProductId_Asc(); }
            def spFKCol(cb: PurchaseCB): Unit = { cb.specify().columnProductId(); }
            def selRfLs(cb: PurchaseCB): List[DblePurchase] = { return referrerBhv.readList(cb).asInstanceOf[List[DblePurchase]]; }
            def getFKVal(re: DblePurchase): Integer = { return re.getProductId(); }
            def setlcEt(re: DblePurchase, le: DbleProduct): Unit =
            { re.setProduct(Option.apply(le)); }
            def getRfPrNm(): String = { return "purchaseList"; }
        });
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key productId.
     * @param productList The list of product. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    def extractProductIdList(productList: List[DbleProduct]): List[Integer] = {
        return helpExtractListInternally(productList, new InternalExtractCallback[DbleProduct, Integer]() {
            def getCV(et: DbleProduct): Integer = { return et.getProductId(); }
        });
    }

    /**
     * Extract the value list of (single) unique key productHandleCode.
     * @param productList The list of product. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    def extractProductHandleCodeList(productList: List[DbleProduct]): List[String] = {
        return helpExtractListInternally(productList, new InternalExtractCallback[DbleProduct, String]() {
            def getCV(et: DbleProduct): String = { return et.getProductHandleCode(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * DbleProduct product = new DbleProduct();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * product.setFoo...(value);
     * product.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//product.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//product.set...;</span>
     * productBhv.<span style="color: #DD4747">insert</span>(product);
     * ... = product.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param product The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    def insert(product: DbleProduct): Unit = {
        doInsert(product, null);
    }

    protected def doInsert(product: DbleProduct, op: InsertOption[ProductCB]): Unit = {
        assertObjectNotNull("product", product);
        prepareInsertOption(op);
        delegateInsert(product, op);
    }

    protected def prepareInsertOption(op: InsertOption[ProductCB]): Unit = {
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
     * DbleProduct product = new DbleProduct();
     * product.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * product.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//product.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//product.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * product.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     productBhv.<span style="color: #DD4747">update</span>(product);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param product The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    def update(setting: (MbleProduct) => Unit): Unit = {
        val mble = new MbleProduct();
        setting(mble);
        doUpdate(mble.toDBableEntity, null);
    }

    protected def doUpdate(product: DbleProduct, op: UpdateOption[ProductCB]): Unit = {
        assertObjectNotNull("product", product);
        prepareUpdateOption(op);
        helpUpdateInternally(product, new InternalUpdateCallback[DbleProduct]() {
            def callbackDelegateUpdate(et: DbleProduct): Int = { return delegateUpdate(et, op); } });
    }

    protected def prepareUpdateOption(op: UpdateOption[ProductCB]): Unit = {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected def createCBForVaryingUpdate(): ProductCB = {
        val cb: ProductCB = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected def createCBForSpecifiedUpdate(): ProductCB = {
        val cb: ProductCB = newMyConditionBean();
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
     * DbleProduct product = new DbleProduct();
     * product.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * product.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//product.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//product.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//product.setVersionNo(value);</span>
     * productBhv.<span style="color: #DD4747">updateNonstrict</span>(product);
     * </pre>
     * @param product The entity of update target. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    def updateNonstrict(product: DbleProduct): Unit = {
        doUpdateNonstrict(product, null);
    }

    protected def doUpdateNonstrict(product: DbleProduct, op: UpdateOption[ProductCB]): Unit = {
        assertObjectNotNull("product", product);
        prepareUpdateOption(op);
        helpUpdateNonstrictInternally(product, new InternalUpdateNonstrictCallback[DbleProduct]() {
            def callbackDelegateUpdateNonstrict(et: DbleProduct): Int = { return delegateUpdateNonstrict(et, op); } });
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
     * @param product The entity of insert or update target. (NotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    def insertOrUpdate(product: DbleProduct): Unit = {
        doInesrtOrUpdate(product, null, null);
    }

    protected def doInesrtOrUpdate(product: DbleProduct, iop: InsertOption[ProductCB], uop: UpdateOption[ProductCB]): Unit = {
        helpInsertOrUpdateInternally(product, new InternalInsertOrUpdateCallback[DbleProduct, ProductCB]() {
            def callbackInsert(et: DbleProduct): Unit = { doInsert(et, iop); }
            def callbackUpdate(et: DbleProduct): Unit = { doUpdate(et, uop); }
            def callbackNewMyConditionBean(): ProductCB = { return newMyConditionBean(); }
            def callbackSelectCount(cb: ProductCB): Int = { return facadeSelectCount(cb); }
        });
    }

    @Override
    protected def doCreateOrModify(et: Entity, iop: InsertOption[_ <: ConditionBean], uop: UpdateOption[_ <: ConditionBean]): Unit = {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            val niop = if (iop != null) { iop } else { new InsertOption[ProductCB]() };
            val nuop = if (uop != null) { uop } else { new UpdateOption[ProductCB]() };
            varyingInsertOrUpdate(downcast(et), downcast(niop), downcast(nuop));
        }
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param product The entity of insert or update target. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    def insertOrUpdateNonstrict(product: DbleProduct): Unit = {
        doInesrtOrUpdateNonstrict(product, null, null);
    }

    protected def doInesrtOrUpdateNonstrict(product: DbleProduct, iop: InsertOption[ProductCB], uop: UpdateOption[ProductCB]): Unit = {
        helpInsertOrUpdateInternally(product, new InternalInsertOrUpdateNonstrictCallback[DbleProduct]() {
            def callbackInsert(et: DbleProduct): Unit = { doInsert(et, iop); }
            def callbackUpdateNonstrict(et: DbleProduct): Unit = { doUpdateNonstrict(et, uop); }
        });
    }

    @Override
    protected def doCreateOrModifyNonstrict(et: Entity, iop: InsertOption[_ <: ConditionBean], uop: UpdateOption[_ <: ConditionBean]): Unit = {
        if (iop == null && uop == null) { insertOrUpdateNonstrict(downcast(et)); }
        else {
            val niop = if (iop != null) { iop } else { new InsertOption[ProductCB]() };
            val nuop = if (uop != null) { uop } else { new UpdateOption[ProductCB]() };
            varyingInsertOrUpdateNonstrict(downcast(et), downcast(niop), downcast(nuop));
        }
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl)
     * <pre>
     * DbleProduct product = new DbleProduct();
     * product.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * product.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     productBhv.<span style="color: #DD4747">delete</span>(product);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param product The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    def delete(product: DbleProduct): Unit = {
        doDelete(product, null);
    }

    protected def doDelete(product: DbleProduct, op: DeleteOption[ProductCB]): Unit = {
        assertObjectNotNull("product", product);
        prepareDeleteOption(op);
        helpDeleteInternally(product, new InternalDeleteCallback[DbleProduct]() {
            def callbackDelegateDelete(et: DbleProduct): Int = { return delegateDelete(et, op); } });
    }

    protected def prepareDeleteOption(op: DeleteOption[ProductCB]): Unit = {
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
     * DbleProduct product = new DbleProduct();
     * product.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//product.setVersionNo(value);</span>
     * productBhv.<span style="color: #DD4747">deleteNonstrict</span>(product);
     * </pre>
     * @param product The entity of delete target. (NotNull, PrimaryKeyNotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    def deleteNonstrict(product: DbleProduct): Unit = {
        doDeleteNonstrict(product, null);
    }

    protected def doDeleteNonstrict(product: DbleProduct, op: DeleteOption[ProductCB]): Unit = {
        assertObjectNotNull("product", product);
        prepareDeleteOption(op);
        helpDeleteNonstrictInternally(product, new InternalDeleteNonstrictCallback[DbleProduct]() {
            def callbackDelegateDeleteNonstrict(et: DbleProduct): Int = { return delegateDeleteNonstrict(et, op); } });
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * DbleProduct product = new DbleProduct();
     * product.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//product.setVersionNo(value);</span>
     * productBhv.<span style="color: #DD4747">deleteNonstrictIgnoreDeleted</span>(product);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param product The entity of delete target. (NotNull, PrimaryKeyNotNull)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    def deleteNonstrictIgnoreDeleted(product: DbleProduct): Unit = {
        doDeleteNonstrictIgnoreDeleted(product, null);
    }

    protected def doDeleteNonstrictIgnoreDeleted(product: DbleProduct, op: DeleteOption[ProductCB]): Unit = {
        assertObjectNotNull("product", product);
        prepareDeleteOption(op);
        helpDeleteNonstrictIgnoreDeletedInternally(product, new InternalDeleteNonstrictIgnoreDeletedCallback[DbleProduct]() {
            def callbackDelegateDeleteNonstrict(et: DbleProduct): Int = { return delegateDeleteNonstrict(et, op); } });
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
     *     DbleProduct product = new DbleProduct();
     *     product.setFooName("foo");
     *     if (...) {
     *         product.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     productList.add(product);
     * }
     * productBhv.<span style="color: #DD4747">batchInsert</span>(productList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param productList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    def batchInsert(productList: scala.collection.immutable.List[DbleProduct]): Array[Int] = {
        val op: InsertOption[ProductCB] = createInsertUpdateOption();
        return doBatchInsert(productList.asJava, op);
    }

    protected def doBatchInsert(productList: List[DbleProduct], op: InsertOption[ProductCB]): Array[Int] = {
        assertObjectNotNull("productList", productList);
        prepareBatchInsertOption(productList, op);
        return delegateBatchInsert(productList, op);
    }

    protected def prepareBatchInsertOption(productList: List[DbleProduct], op: InsertOption[ProductCB]): Unit = {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(productList);
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
     *     DbleProduct product = new DbleProduct();
     *     product.setFooName("foo");
     *     if (...) {
     *         product.setFooPrice(123);
     *     } else {
     *         product.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//product.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     productList.add(product);
     * }
     * productBhv.<span style="color: #DD4747">batchUpdate</span>(productList);
     * </pre>
     * @param productList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    def batchUpdate(productList: scala.collection.immutable.List[DbleProduct]): Array[Int] = {
        val op: UpdateOption[ProductCB] = createPlainUpdateOption();
        return doBatchUpdate(productList.asJava, op);
    }

    protected def doBatchUpdate(productList: List[DbleProduct], op: UpdateOption[ProductCB]): Array[Int] = {
        assertObjectNotNull("productList", productList);
        prepareBatchUpdateOption(productList, op);
        return delegateBatchUpdate(productList, op);
    }

    protected def prepareBatchUpdateOption(productList: List[DbleProduct], op: UpdateOption[ProductCB]): Unit = {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(productList);
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
     * productBhv.<span style="color: #DD4747">batchUpdate</span>(productList, new SpecifyQuery[ProductCB]() {
     *     public void specify(ProductCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * productBhv.<span style="color: #DD4747">batchUpdate</span>(productList, new SpecifyQuery[ProductCB]() {
     *     public void specify(ProductCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param productList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    def batchUpdate(productList: scala.collection.immutable.List[DbleProduct], updateColumnSpec: SpecifyQuery[ProductCB]): Array[Int] = {
        return doBatchUpdate(productList.asJava, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     DbleProduct product = new DbleProduct();
     *     product.setFooName("foo");
     *     if (...) {
     *         product.setFooPrice(123);
     *     } else {
     *         product.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//product.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     productList.add(product);
     * }
     * productBhv.<span style="color: #DD4747">batchUpdate</span>(productList);
     * </pre>
     * @param productList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    def batchUpdateNonstrict(productList: scala.collection.immutable.List[DbleProduct]): Array[Int] = {
        val option: UpdateOption[ProductCB] = createPlainUpdateOption();
        return doBatchUpdateNonstrict(productList.asJava, option);
    }

    protected def doBatchUpdateNonstrict(productList: List[DbleProduct], op: UpdateOption[ProductCB]): Array[Int] = {
        assertObjectNotNull("productList", productList);
        prepareBatchUpdateOption(productList, op);
        return delegateBatchUpdateNonstrict(productList, op);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * productBhv.<span style="color: #DD4747">batchUpdateNonstrict</span>(productList, new SpecifyQuery[ProductCB]() {
     *     public void specify(ProductCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * productBhv.<span style="color: #DD4747">batchUpdateNonstrict</span>(productList, new SpecifyQuery[ProductCB]() {
     *     public void specify(ProductCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param productList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    def batchUpdateNonstrict(productList: scala.collection.immutable.List[DbleProduct], updateColumnSpec: SpecifyQuery[ProductCB]): Array[Int] = {
        return doBatchUpdateNonstrict(productList.asJava, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected def doLumpModifyNonstrict(ls: List[Entity], op: UpdateOption[_ <: ConditionBean]): Array[Int] = {
        if (op == null) { return batchUpdateNonstrict(toScalaList(downcast(ls))); }
        else { return varyingBatchUpdateNonstrict(toScalaList(downcast(ls)), downcast(op)); }
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param productList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    def batchDelete(productList: scala.collection.immutable.List[DbleProduct]): Array[Int] = {
        return doBatchDelete(productList.asJava, null);
    }

    protected def doBatchDelete(productList: List[DbleProduct], op: DeleteOption[ProductCB]): Array[Int] = {
        assertObjectNotNull("productList", productList);
        prepareDeleteOption(op);
        return delegateBatchDelete(productList, op);
    }

    @Override
    protected def doLumpRemove(ls: List[Entity], op: DeleteOption[_ <: ConditionBean]): Array[Int] = {
        if (op == null) { return batchDelete(toScalaList(downcast(ls))); }
        else { return varyingBatchDelete(toScalaList(downcast(ls)), downcast(op)); }
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param productList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    def batchDeleteNonstrict(productList: scala.collection.immutable.List[DbleProduct]): Array[Int] = {
        return doBatchDeleteNonstrict(productList.asJava, null);
    }

    protected def doBatchDeleteNonstrict(productList: List[DbleProduct], op: DeleteOption[ProductCB]): Array[Int] = {
        assertObjectNotNull("productList", productList);
        prepareDeleteOption(op);
        return delegateBatchDeleteNonstrict(productList, op);
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
     * productBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;DbleProduct, ProductCB&gt;() {
     *     public ConditionBean setup(product entity, ProductCB intoCB) {
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
    def queryInsert(setupper: QueryInsertSetupper[DbleProduct, ProductCB]): Int = {
        return Integer2int(doQueryInsert(setupper, null));
    }

    protected def doQueryInsert(sp: QueryInsertSetupper[DbleProduct, ProductCB], op: InsertOption[ProductCB]): Integer = {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        val e: DbleProduct = new DbleProduct();
        val cb: ProductCB = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
    }

    protected def createCBForQueryInsert(): ProductCB = {
        val cb: ProductCB = newMyConditionBean();
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
     * DbleProduct product = new DbleProduct();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//product.setPK...(value);</span>
     * product.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//product.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//product.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//product.setVersionNo(value);</span>
     * ProductCB cb = new ProductCB();
     * cb.query().setFoo...(value);
     * productBhv.<span style="color: #DD4747">queryUpdate</span>(product, cb);
     * </pre>
     * @param product The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of DbleProduct. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    def queryUpdate(product: DbleProduct, cb: ProductCB): Int = {
        return Integer2int(doQueryUpdate(product, cb, null));
    }

    protected def doQueryUpdate(product: DbleProduct, cb: ProductCB, op: UpdateOption[ProductCB]): Integer = {
        assertObjectNotNull("product", product); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return if (checkCountBeforeQueryUpdateIfNeeds(cb)) { delegateQueryUpdate(product, cb, op) } else { 0 };
    }

    @Override
    protected def doRangeModify(et: Entity, cb: ConditionBean, op: UpdateOption[_ <: ConditionBean]): Int = {
        if (op == null) { return queryUpdate(downcast(et), cb.asInstanceOf[ProductCB]); }
        else { return varyingQueryUpdate(downcast(et), cb.asInstanceOf[ProductCB], downcast(op)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * ProductCB cb = new ProductCB();
     * cb.query().setFoo...(value);
     * productBhv.<span style="color: #DD4747">queryDelete</span>(product, cb);
     * </pre>
     * @param cb The condition-bean of DbleProduct. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    def queryDelete(cb: ProductCB): Int = {
        return Integer2int(doQueryDelete(cb, null));
    }

    protected def doQueryDelete(cb: ProductCB, op: DeleteOption[ProductCB]): Integer = {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return if (checkCountBeforeQueryUpdateIfNeeds(cb)) { delegateQueryDelete(cb, op) } else { 0 };
    }

    @Override
    protected def doRangeRemove(cb: ConditionBean, op: DeleteOption[_ <: ConditionBean]): Int = {
        if (op == null) { return queryDelete(cb.asInstanceOf[ProductCB]); }
        else { return varyingQueryDelete(cb.asInstanceOf[ProductCB], downcast(op)); }
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
     * DbleProduct product = new DbleProduct();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * product.setFoo...(value);
     * product.setBar...(value);
     * InsertOption[ProductCB] option = new InsertOption[ProductCB]();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * productBhv.<span style="color: #DD4747">varyingInsert</span>(product, option);
     * ... = product.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param product The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    def varyingInsert(product: DbleProduct, option: InsertOption[ProductCB]): Unit = {
        assertInsertOptionNotNull(option);
        doInsert(product, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * DbleProduct product = new DbleProduct();
     * product.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * product.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * product.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;ProductCB&gt; option = new UpdateOption&lt;ProductCB&gt;();
     *     option.self(new SpecifyQuery&lt;ProductCB&gt;() {
     *         public void specify(ProductCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     productBhv.<span style="color: #DD4747">varyingUpdate</span>(product, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param product The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    def varyingUpdate(product: DbleProduct, option: UpdateOption[ProductCB]): Unit = {
        assertUpdateOptionNotNull(option);
        doUpdate(product, option);
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * DbleProduct product = new DbleProduct();
     * product.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * product.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//product.setVersionNo(value);</span>
     * UpdateOption&lt;ProductCB&gt; option = new UpdateOption&lt;ProductCB&gt;();
     * option.self(new SpecifyQuery&lt;ProductCB&gt;() {
     *     public void specify(ProductCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * productBhv.<span style="color: #DD4747">varyingUpdateNonstrict</span>(product, option);
     * </pre>
     * @param product The entity of update target. (NotNull, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    def varyingUpdateNonstrict(product: DbleProduct, option: UpdateOption[ProductCB]): Unit = {
        assertUpdateOptionNotNull(option);
        doUpdateNonstrict(product, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param product The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    def varyingInsertOrUpdate(product: DbleProduct, insertOption: InsertOption[ProductCB], updateOption: UpdateOption[ProductCB]): Unit = {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(product, insertOption, updateOption);
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param product The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    def varyingInsertOrUpdateNonstrict(product: DbleProduct, insertOption: InsertOption[ProductCB], updateOption: UpdateOption[ProductCB]): Unit = {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdateNonstrict(product, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param product The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    def varyingDelete(product: DbleProduct, option: DeleteOption[ProductCB]): Unit = {
        assertDeleteOptionNotNull(option);
        doDelete(product, option);
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as deleteNonstrict(entity).
     * @param product The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    def varyingDeleteNonstrict(product: DbleProduct, option: DeleteOption[ProductCB]): Unit = {
        assertDeleteOptionNotNull(option);
        doDeleteNonstrict(product, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param productList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    def varyingBatchInsert(productList: scala.collection.immutable.List[DbleProduct], option: InsertOption[ProductCB]): Array[Int] = {
        assertInsertOptionNotNull(option);
        return doBatchInsert(productList.asJava, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param productList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    def varyingBatchUpdate(productList: scala.collection.immutable.List[DbleProduct], option: UpdateOption[ProductCB]): Array[Int] = {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(productList.asJava, option);
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param productList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    def varyingBatchUpdateNonstrict(productList: scala.collection.immutable.List[DbleProduct], option: UpdateOption[ProductCB]): Array[Int] = {
        assertUpdateOptionNotNull(option);
        return doBatchUpdateNonstrict(productList.asJava, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param productList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    def varyingBatchDelete(productList: scala.collection.immutable.List[DbleProduct], option: DeleteOption[ProductCB]): Array[Int] = {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(productList.asJava, option);
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param productList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    def varyingBatchDeleteNonstrict(productList: scala.collection.immutable.List[DbleProduct], option: DeleteOption[ProductCB]): Array[Int] = {
        assertDeleteOptionNotNull(option);
        return doBatchDeleteNonstrict(productList.asJava, option);
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
    def varyingQueryInsert(setupper: QueryInsertSetupper[DbleProduct, ProductCB], option: InsertOption[ProductCB]): Integer = {
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
     * DbleProduct product = new DbleProduct();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//product.setPK...(value);</span>
     * product.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//product.setVersionNo(value);</span>
     * ProductCB cb = new ProductCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;ProductCB&gt; option = new UpdateOption&lt;ProductCB&gt;();
     * option.self(new SpecifyQuery&lt;ProductCB&gt;() {
     *     public void specify(ProductCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * productBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(product, cb, option);
     * </pre>
     * @param product The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of DbleProduct. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    def varyingQueryUpdate(product: DbleProduct, cb: ProductCB, option: UpdateOption[ProductCB]): Integer = {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(product, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of DbleProduct. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    def varyingQueryDelete(cb: ProductCB, option: DeleteOption[ProductCB]): Integer = {
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
    def outsideSql(): OutsideSqlBasicExecutor[ProductBhv] = {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected def delegateSelectCountUniquely(cb: ProductCB): Integer = { return invoke(createSelectCountCBCommand(cb, true)); }
    protected def delegateSelectCountPlainly(cb: ProductCB): Integer = { return invoke(createSelectCountCBCommand(cb, false)); }
    protected def delegateSelectCursor[ENTITY <: DbleProduct](cb: ProductCB, rh: EntityRowHandler[ENTITY], tp: Class[ENTITY])
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected def delegateSelectList[ENTITY <: DbleProduct](cb: ProductCB, tp: Class[ENTITY]): List[ENTITY] =
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected def delegateInsert(et: DbleProduct, op: InsertOption[ProductCB]): Integer =
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected def delegateUpdate(et: DbleProduct, op: UpdateOption[ProductCB]): Integer =
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateEntityCommand(et, op)); }
    protected def delegateUpdateNonstrict(et: DbleProduct, op: UpdateOption[ProductCB]): Integer =
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected def delegateDelete(et: DbleProduct, op: DeleteOption[ProductCB]): Integer =
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteEntityCommand(et, op)); }
    protected def delegateDeleteNonstrict(et: DbleProduct, op: DeleteOption[ProductCB]): Integer =
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected def delegateBatchInsert(ls: List[DbleProduct], op: InsertOption[ProductCB]): Array[Int] =
    { if (ls.isEmpty()) { return new Array[Int](0); }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)).asInstanceOf[Array[Int]]; }
    protected def delegateBatchUpdate(ls: List[DbleProduct], op: UpdateOption[ProductCB]): Array[Int] =
    { if (ls.isEmpty()) { return new Array[Int](0); }
      return invoke(createBatchUpdateCommand(processBatchInternally(ls, op, false), op)).asInstanceOf[Array[Int]]; }
    protected def delegateBatchUpdateNonstrict(ls: List[DbleProduct], op: UpdateOption[ProductCB]): Array[Int] =
    { if (ls.isEmpty()) { return new Array[Int](0); }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)).asInstanceOf[Array[Int]]; }
    protected def delegateBatchDelete(ls: List[DbleProduct], op: DeleteOption[ProductCB]): Array[Int] =
    { if (ls.isEmpty()) { return new Array[Int](0); }
      return invoke(createBatchDeleteCommand(processBatchInternally(ls, op, false), op)).asInstanceOf[Array[Int]]; }
    protected def delegateBatchDeleteNonstrict(ls: List[DbleProduct], op: DeleteOption[ProductCB]): Array[Int] =
    { if (ls.isEmpty()) { return new Array[Int](0); }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)).asInstanceOf[Array[Int]]; }

    protected def delegateQueryInsert(et: DbleProduct, inCB: ProductCB, resCB: ConditionBean, op: InsertOption[ProductCB]): Integer =
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; }
      return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected def delegateQueryUpdate(et: DbleProduct, cb: ProductCB, op: UpdateOption[ProductCB]): Integer =
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; }
      return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected def delegateQueryDelete(cb: ProductCB, op: DeleteOption[ProductCB]): Integer =
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
    //                                                                       Assist Helper
    //                                                                       =============
    protected def typeOfSelectedEntity(): Class[DbleProduct] = {
        return classOf[DbleProduct];
    }

    protected def callbackCB(cbCall: (ProductCB) => Unit): ProductCB = {
        assertObjectNotNull("cbCall", cbCall);
        val cb = new ProductCB();
        cbCall(cb);
        return cb;
    }

    protected def doCallbackLoader(dbleList: List[DbleProduct], loaderCall: (LoaderOfProduct) => Unit = null): Unit = {
        if (loaderCall != null) {
            val loader = new LoaderOfProduct();
            loader.selectedList = dbleList.asInstanceOf[List[DbleProduct]];
            loaderCall(loader);
        }
    }

    protected def downcast(et: Entity): DbleProduct = {
        return helpEntityDowncastInternally(et, classOf[DbleProduct]);
    }

    protected def downcast(cb: ConditionBean): ProductCB = {
        return helpConditionBeanDowncastInternally(cb, classOf[ProductCB]);
    }

    protected def downcast(ls: List[_ <: Entity]): List[DbleProduct] = {
        return ls.asInstanceOf[List[DbleProduct]];
    }

    protected def downcast(op: InsertOption[_ <: ConditionBean]): InsertOption[ProductCB] = {
        return op.asInstanceOf[InsertOption[ProductCB]];
    }

    protected def downcast(op: UpdateOption[_ <: ConditionBean]): UpdateOption[ProductCB] = {
        return op.asInstanceOf[UpdateOption[ProductCB]];
    }

    protected def downcast(op: DeleteOption[_ <: ConditionBean]): DeleteOption[ProductCB] = {
        return op.asInstanceOf[DeleteOption[ProductCB]];
    }

    protected def downcast(sp: QueryInsertSetupper[_ <: Entity, _ <: ConditionBean]): QueryInsertSetupper[DbleProduct, ProductCB] = {
        return sp.asInstanceOf[QueryInsertSetupper[DbleProduct, ProductCB]];
    }

    // ===================================================================================
    //                                                                        Scala Helper
    //                                                                        ============
    protected def toScalaList[ENTITY](javaList: Collection[ENTITY]): scala.collection.immutable.List[ENTITY] = {
        if (javaList == null) { scala.collection.immutable.List() }
        return scala.collection.immutable.List.fromArray(javaList.toArray()).asInstanceOf[scala.collection.immutable.List[ENTITY]];
    }

    def toImmutableEntityList(dbleList: Collection[DbleProduct]): scala.collection.immutable.List[Product] = {
        return toScalaList(dbleList).map(new Product(_))
    }

    def toDBableEntityList(immuList: scala.collection.immutable.List[Product]): List[DbleProduct] = {
        return immuList.map(new DbleProduct().acceptImmutableEntity(_)).asJava
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
class BsLoaderOfProduct {

    protected var _selectedList: List[DbleProduct] = null;
    def selectedList: List[DbleProduct] = {
        return _selectedList;
    }
    def selectedList_=(ls: List[DbleProduct]): Unit = {
        _selectedList = ls;
    }

    var _referrerPurchaseListList: List[DblePurchase] = null;
    def loadPurchaseList(setupCall: (PurchaseCB) => Unit): ScrNestedReferrerLoader[LoaderOfPurchase] = {
        DBFlutist.productBhv.loadPurchaseList(_selectedList, setupCall).withNestedReferrer(new ReferrerListHandler[DblePurchase]() {
            def handle(referrerList: List[DblePurchase]): Unit = { _referrerPurchaseListList = referrerList; }
        });
        return new ScrNestedReferrerLoader[LoaderOfPurchase](() => {
            val nestedLoader = new LoaderOfPurchase();
            nestedLoader.selectedList = _referrerPurchaseListList;
            nestedLoader;
        });
    }
}
