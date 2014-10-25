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
 * The behavior of (商品カテゴリ)PRODUCT_CATEGORY as TABLE. <br />
 * <pre>
 * [primary key]
 *     PRODUCT_CATEGORY_CODE
 *
 * [column]
 *     PRODUCT_CATEGORY_CODE, PRODUCT_CATEGORY_NAME, PARENT_CATEGORY_CODE
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     PRODUCT_CATEGORY
 *
 * [referrer table]
 *     PRODUCT, PRODUCT_CATEGORY
 *
 * [foreign property]
 *     productCategorySelf
 *
 * [referrer property]
 *     productList, productCategorySelfList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
abstract class BsProductCategoryBhv extends AbstractBehaviorWritable[DbleProductCategory, ProductCategoryCB] {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    def getDBMeta(): DBMeta = { return ProductCategoryDbm; }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    def newConditionBean(): ProductCategoryCB = { return new ProductCategoryCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * ProductCategoryCB cb = new ProductCategoryCB();
     * cb.query().setFoo...(value);
     * int count = productCategoryBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of DbleProductCategory. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    def selectCount(cbCall: (ProductCategoryCB) => Unit): Int = {
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
     * ProductCategoryCB cb = new ProductCategoryCB();
     * cb.query().setFoo...(value);
     * OptionalEntity&lt;DbleProductCategory&gt; entity = productCategoryBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     *
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * entity.<span style="color: #DD4747">required</span>(productCategory -&gt; {
     *     ...
     * });
     * DbleProductCategory productCategory = entity.entity.<span style="color: #DD4747">get()</span>;
     *
     * <span style="color: #3F7E5E">// if it might be no data, ifPresent(), isPresent(), ...</span>
     * entity.<span style="color: #DD4747">ifPresent</span>(productCategory -&gt; {
     *     ...
     * });
     * if (entity.entity.<span style="color: #DD4747">isPresent()</span>) {
     *     DbleProductCategory productCategory = entity.entity.<span style="color: #DD4747">get()</span>;
     * } else {
     *     ...
     * }
     * </pre>
     * @param cbCall The callback for condition-bean of ProductCategory. (NotNull)
     * @param loaderCall The callback for referrer loader of ProductCategory. (NoArgAllowed: then no loading)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get() of return value is called and the value is null, which means entity has already been deleted (point is not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    def selectEntity(cbCall: (ProductCategoryCB) => Unit)(implicit loaderCall: (LoaderOfProductCategory) => Unit = null): Option[ProductCategory] = {
        return facadeSelectEntity(callbackCB(cbCall))(loaderCall).map(_.toImmutable);
    }

    protected def facadeSelectEntity(cb: ProductCategoryCB)(loaderCall: (LoaderOfProductCategory) => Unit = null): Option[DbleProductCategory] = {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity())(loaderCall);
    }

    protected def doSelectEntity[ENTITY <: DbleProductCategory](cb: ProductCategoryCB, tp: Class[_ <: ENTITY])(loaderCall: (LoaderOfProductCategory) => Unit = null): ENTITY = {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        val dble = helpSelectEntityInternally(cb, tp);
        if (dble != null) {
            callbackLoader(DfCollectionUtil.newArrayList(dble.asInstanceOf[DbleProductCategory]), loaderCall);
        }
        return dble;
    }

    protected def doSelectOptionalEntity[ENTITY <: DbleProductCategory](cb: ProductCategoryCB, tp: Class[_ <: ENTITY])(loaderCall: (LoaderOfProductCategory) => Unit = null): Option[ENTITY] = {
        return Option.apply(doSelectEntity(cb, tp)(loaderCall));
    }

    override protected def doReadEntity(cb: ConditionBean): Entity = { facadeSelectEntity(downcast(cb))().orNull }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * ProductCategoryCB cb = new ProductCategoryCB();
     * cb.query().setFoo...(value);
     * DbleProductCategory productCategory = productCategoryBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = productCategory.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbCall The callback for condition-bean of ProductCategory. (NotNull)
     * @param loaderCall The callback for referrer loader of ProductCategory. (NoArgAllowed: then no loading)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (point is not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    def selectEntityWithDeletedCheck(cbCall: (ProductCategoryCB) => Unit)(implicit loaderCall: (LoaderOfProductCategory) => Unit = null): ProductCategory = {
        return facadeSelectEntityWithDeletedCheck(callbackCB(cbCall))(loaderCall).toImmutable;
    }

    protected def facadeSelectEntityWithDeletedCheck(cb: ProductCategoryCB)(loaderCall: (LoaderOfProductCategory) => Unit = null): DbleProductCategory = {
        return doSelectEntityWithDeletedCheck(cb, typeOfSelectedEntity())(loaderCall);
    }

    protected def doSelectEntityWithDeletedCheck[ENTITY <: DbleProductCategory](cb: ProductCategoryCB, tp: Class[ENTITY])(loaderCall: (LoaderOfProductCategory) => Unit = null): ENTITY = {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        val dble = helpSelectEntityWithDeletedCheckInternally(cb, tp);
        callbackLoader(DfCollectionUtil.newArrayList(dble.asInstanceOf[DbleProductCategory]), loaderCall);
        return dble;
    }

    override protected def doReadEntityWithDeletedCheck(cb: ConditionBean): Entity = { facadeSelectEntityWithDeletedCheck(downcast(cb))() }

    /**
     * Select the entity by the primary-key value.
     * @param productCategoryCode (商品カテゴリコード): PK, NotNull, CHAR(3). (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    def selectByPK(productCategoryCode: String): Option[ProductCategory] = {
        return facadeSelectByPK(productCategoryCode).map(_.toImmutable);
    }

    protected def facadeSelectByPK(productCategoryCode: String): Option[DbleProductCategory] = {
        return doSelectByPK(productCategoryCode, typeOfSelectedEntity());
    }

    protected def doSelectByPK[ENTITY <: DbleProductCategory](productCategoryCode: String, tp: Class[_ <: ENTITY]): Option[ENTITY] = {
        return Option.apply(doSelectEntity(xprepareCBAsPK(productCategoryCode), tp)());
    }

    protected def xprepareCBAsPK(productCategoryCode: String): ProductCategoryCB = {
        assertObjectNotNull("productCategoryCode", productCategoryCode);
        return newConditionBean().acceptPK(productCategoryCode);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * ProductCategoryCB cb = new ProductCategoryCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * List&lt;${ProductCategory}&gt; productCategoryList = productCategoryBhv.<span style="color: #DD4747">selectList</span>(cb);
     * productCategoryList.foreach(productCategory =>
     *     ... = productCategory...;
     * }
     * </pre>
     * @param cbCall The callback for condition-bean of ProductCategory. (NotNull)
     * @param loaderCall The callback for referrer loader of ProductCategory. (NoArgAllowed: then no loading)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    def selectList(cbCall: (ProductCategoryCB) => Unit)(implicit loaderCall: (LoaderOfProductCategory) => Unit = null): immutable.List[ProductCategory] = {
        return toImmutableEntityList(facadeSelectList(callbackCB(cbCall))(loaderCall));
    }

    protected def facadeSelectList(cb: ProductCategoryCB)(loaderCall: (LoaderOfProductCategory) => Unit = null): ListResultBean[DbleProductCategory] = {
        return doSelectList(cb, typeOfSelectedEntity())(loaderCall);
    }

    protected def doSelectList[RESULT <: DbleProductCategory](cb: ProductCategoryCB, tp: Class[RESULT])(loaderCall: (LoaderOfProductCategory) => Unit = null): ListResultBean[RESULT] = {
        val dbleList = helpSelectListInternally(cb, tp);
        callbackLoader(dbleList.asInstanceOf[List[DbleProductCategory]], loaderCall);
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
     * ProductCategoryCB cb = new ProductCategoryCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;DbleProductCategory&gt; page = productCategoryBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (DbleProductCategory productCategory : page) {
     *     ... = productCategory.get...();
     * }
     * </pre>
     * @param cbCall The callback for condition-bean of ProductCategory. (NotNull)
     * @param loaderCall The callback for referrer loader of ProductCategory. (NoArgAllowed: then no loading)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    def selectPage(cbCall: (ProductCategoryCB) => Unit)(implicit loaderCall: (LoaderOfProductCategory) => Unit = null): ScrPagingView[ProductCategory] = {
        return newPagingView(facadeSelectPage(callbackCB(cbCall))(loaderCall));
    }

    protected def facadeSelectPage(cb: ProductCategoryCB)(loaderCall: (LoaderOfProductCategory) => Unit = null): PagingResultBean[DbleProductCategory] = {
        return doSelectPage(cb, typeOfSelectedEntity())(loaderCall);
    }

    protected def doSelectPage[RESULT <: DbleProductCategory](cb: ProductCategoryCB, tp: Class[RESULT])(loaderCall: (LoaderOfProductCategory) => Unit = null): PagingResultBean[RESULT] = {
        val dbleList = helpSelectPageInternally(cb, tp);
        callbackLoader(dbleList.asInstanceOf[List[DbleProductCategory]], loaderCall);
        return dbleList;
    }

    override protected def doReadPage(cb: ConditionBean): PagingResultBean[_ <: Entity] = { facadeSelectPage(downcast(cb))() }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * ProductCategoryCB cb = new ProductCategoryCB();
     * cb.query().setFoo...(value);
     * productCategoryBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;DbleProductCategory&gt;() {
     *     public void handle(DbleProductCategory entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of DbleProductCategory. (NotNull)
     * @param entityRowHandler The handler of entity row of DbleProductCategory. (NotNull)
     */
    def selectCursor(cbCall: (ProductCategoryCB) => Unit)(rowCall: (ProductCategory) => Unit): Unit = {
        facadeSelectCursor(callbackCB(cbCall), new EntityRowHandler[DbleProductCategory]() {
            def handle(entity: DbleProductCategory): Unit = { rowCall(entity.toImmutable) }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * productCategoryBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(ProductCategoryCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    def scalarSelect[RESULT](resultType: Class[RESULT]): ScrHpSLSFunction[ProductCategoryCB, RESULT] = {
        return toScalaSLSFunction[RESULT](facadeScalarSelect(resultType));
    }

    protected def toScalaSLSFunction[RESULT](function: HpSLSFunction[ProductCategoryCB, RESULT]): ScrHpSLSFunction[ProductCategoryCB, RESULT] =
    { new ScrHpSLSFunction[ProductCategoryCB, RESULT](function) }

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
     * Load referrer of productList by the set-upper of referrer. <br />
     * (商品)PRODUCT by PRODUCT_CATEGORY_CODE, named 'productList'.
     * <pre>
     * productCategoryBhv.<span style="color: #DD4747">loadProductList</span>(productCategoryList, new ReferrerConditionSetupper&lt;ProductCB&gt;() {
     *     public void setup(ProductCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * for (DbleProductCategory productCategory : productCategoryList) {
     *     ... = productCategory.<span style="color: #DD4747">getProductList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductCategoryCode_InScope(pkList);
     * cb.query().addOrderBy_ProductCategoryCode_Asc();
     * </pre>
     * @param productCategoryList The entity list of productCategory. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    def loadProductList(productCategoryList: List[DbleProductCategory], setupCall: (ProductCB) => Unit): NestedReferrerListGateway[DbleProduct] = {
        assertObjectNotNull("productCategoryList", productCategoryList); assertObjectNotNull("setupCall", setupCall);
        val setupper = new ReferrerConditionSetupper[ProductCB]() { def setup(referrerCB: ProductCB): Unit = { setupCall(referrerCB); } }
        return doLoadProductList(productCategoryList, new LoadReferrerOption[ProductCB, DbleProduct]().xinit(setupper));
    }

    /**
     * Load referrer of productList by the set-upper of referrer. <br />
     * (商品)PRODUCT by PRODUCT_CATEGORY_CODE, named 'productList'.
     * <pre>
     * productCategoryBhv.<span style="color: #DD4747">loadProductList</span>(productCategoryList, new ReferrerConditionSetupper&lt;ProductCB&gt;() {
     *     public void setup(ProductCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = productCategory.<span style="color: #DD4747">getProductList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductCategoryCode_InScope(pkList);
     * cb.query().addOrderBy_ProductCategoryCode_Asc();
     * </pre>
     * @param productCategory The entity of productCategory. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    def loadProductList(productCategory: DbleProductCategory, setupCall: (ProductCB) => Unit): NestedReferrerListGateway[DbleProduct] = {
        assertObjectNotNull("productCategory", productCategory); assertObjectNotNull("setupCall", setupCall);
        val setupper = new ReferrerConditionSetupper[ProductCB]() { def setup(referrerCB: ProductCB): Unit = { setupCall(referrerCB); } }
        return doLoadProductList(xnewLRLs(productCategory), new LoadReferrerOption[ProductCB, DbleProduct]().xinit(setupper));
    }

    protected def doLoadProductList(productCategoryList: List[DbleProductCategory], option: LoadReferrerOption[ProductCB, DbleProduct]): NestedReferrerListGateway[DbleProduct] = {
        return helpLoadReferrerInternally(productCategoryList, option, "productList");
    }

    /**
     * Load referrer of productCategorySelfList by the set-upper of referrer. <br />
     * (商品カテゴリ)PRODUCT_CATEGORY by PARENT_CATEGORY_CODE, named 'productCategorySelfList'.
     * <pre>
     * productCategoryBhv.<span style="color: #DD4747">loadProductCategorySelfList</span>(productCategoryList, new ReferrerConditionSetupper&lt;ProductCategoryCB&gt;() {
     *     public void setup(ProductCategoryCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * for (DbleProductCategory productCategory : productCategoryList) {
     *     ... = productCategory.<span style="color: #DD4747">getProductCategorySelfList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setParentCategoryCode_InScope(pkList);
     * cb.query().addOrderBy_ParentCategoryCode_Asc();
     * </pre>
     * @param productCategoryList The entity list of productCategory. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    def loadProductCategorySelfList(productCategoryList: List[DbleProductCategory], setupCall: (ProductCategoryCB) => Unit): NestedReferrerListGateway[DbleProductCategory] = {
        assertObjectNotNull("productCategoryList", productCategoryList); assertObjectNotNull("setupCall", setupCall);
        val setupper = new ReferrerConditionSetupper[ProductCategoryCB]() { def setup(referrerCB: ProductCategoryCB): Unit = { setupCall(referrerCB); } }
        return doLoadProductCategorySelfList(productCategoryList, new LoadReferrerOption[ProductCategoryCB, DbleProductCategory]().xinit(setupper));
    }

    /**
     * Load referrer of productCategorySelfList by the set-upper of referrer. <br />
     * (商品カテゴリ)PRODUCT_CATEGORY by PARENT_CATEGORY_CODE, named 'productCategorySelfList'.
     * <pre>
     * productCategoryBhv.<span style="color: #DD4747">loadProductCategorySelfList</span>(productCategoryList, new ReferrerConditionSetupper&lt;ProductCategoryCB&gt;() {
     *     public void setup(ProductCategoryCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = productCategory.<span style="color: #DD4747">getProductCategorySelfList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setParentCategoryCode_InScope(pkList);
     * cb.query().addOrderBy_ParentCategoryCode_Asc();
     * </pre>
     * @param productCategory The entity of productCategory. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    def loadProductCategorySelfList(productCategory: DbleProductCategory, setupCall: (ProductCategoryCB) => Unit): NestedReferrerListGateway[DbleProductCategory] = {
        assertObjectNotNull("productCategory", productCategory); assertObjectNotNull("setupCall", setupCall);
        val setupper = new ReferrerConditionSetupper[ProductCategoryCB]() { def setup(referrerCB: ProductCategoryCB): Unit = { setupCall(referrerCB); } }
        return doLoadProductCategorySelfList(xnewLRLs(productCategory), new LoadReferrerOption[ProductCategoryCB, DbleProductCategory]().xinit(setupper));
    }

    protected def doLoadProductCategorySelfList(productCategoryList: List[DbleProductCategory], option: LoadReferrerOption[ProductCategoryCB, DbleProductCategory]): NestedReferrerListGateway[DbleProductCategory] = {
        return helpLoadReferrerInternally(productCategoryList, option, "productCategorySelfList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'DbleProductCategory'.
     * @param productCategoryList The list of productCategory. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    def pulloutProductCategorySelf(productCategoryList: immutable.List[ProductCategory]): immutable.List[ProductCategory] = {
        val dbleList = helpPulloutInternally(toDBableEntityList(productCategoryList), "productCategorySelf");
        return toScalaList(dbleList).map(new ProductCategory(_));
    }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key productCategoryCode.
     * @param productCategoryList The list of productCategory. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    def extractProductCategoryCodeList(productCategoryList: immutable.List[ProductCategory]): immutable.List[String] = {
        val plainList = helpExtractListInternally(toDBableEntityList(productCategoryList), "productCategoryCode");
        return toScalaList(plainList).map(_.asInstanceOf[String]);
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * DbleProductCategory productCategory = new DbleProductCategory();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * productCategory.setFoo...(value);
     * productCategory.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//productCategory.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//productCategory.set...;</span>
     * productCategoryBhv.<span style="color: #DD4747">insert</span>(productCategory);
     * ... = productCategory.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param entityCall The callback for entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param optionCall The callback for option of insert. (NoArgAllowed: then no option)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    def insert(entityCall: (MbleProductCategory) => Unit)(implicit optionCall: (ScrInsertOption[ProductCategoryCB]) => Unit = null): Unit = {
        assertObjectNotNull("entityCall", entityCall);
        doInsert(callbackMbleEntityToDBable(entityCall), callbackInsertOption(optionCall));
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * DbleProductCategory productCategory = new DbleProductCategory();
     * productCategory.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * productCategory.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//productCategory.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//productCategory.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * productCategory.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     productCategoryBhv.<span style="color: #DD4747">update</span>(productCategory);
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
    def update(entityCall: (MbleProductCategory) => Unit)(implicit optionCall: (ScrUpdateOption[ProductCategoryCB]) => Unit = null): Unit = {
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
    def insertOrUpdate(entityCall: (MbleProductCategory) => Unit)(implicit insertOptionCall: (ScrInsertOption[ProductCategoryCB]) => Unit = null, updateOptionCall: (ScrUpdateOption[ProductCategoryCB]) => Unit = null): Unit = {
        doInsertOrUpdate(callbackMbleEntityToDBable(entityCall), callbackInsertOption(insertOptionCall), callbackUpdateOption(updateOptionCall));
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * DbleProductCategory productCategory = new DbleProductCategory();
     * productCategory.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * productCategory.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     productCategoryBhv.<span style="color: #DD4747">delete</span>(productCategory);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param entityCall The callback for entity of delete. (NotNull, PrimaryKeyNotNull)
     * @param optionCall The callback for option of delete. (NoArgAllowed: then no option)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    def delete(entityCall: (MbleProductCategory) => Unit)(implicit optionCall: (ScrDeleteOption[ProductCategoryCB]) => Unit = null): Unit = {
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
     *     DbleProductCategory productCategory = new DbleProductCategory();
     *     productCategory.setFooName("foo");
     *     if (...) {
     *         productCategory.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     productCategoryList.add(productCategory);
     * }
     * productCategoryBhv.<span style="color: #DD4747">batchInsert</span>(productCategoryList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param productCategoryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    def batchInsert(batchCall: (ScrBatchEntityList[MbleProductCategory]) => Unit)(implicit optionCall: (ScrInsertOption[ProductCategoryCB]) => Unit = null): Array[Int] = {
        return doBatchInsert(callbackBatch(batchCall), callbackInsertOption(optionCall));
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     DbleProductCategory productCategory = new DbleProductCategory();
     *     productCategory.setFooName("foo");
     *     if (...) {
     *         productCategory.setFooPrice(123);
     *     } else {
     *         productCategory.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//productCategory.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     productCategoryList.add(productCategory);
     * }
     * productCategoryBhv.<span style="color: #DD4747">batchUpdate</span>(productCategoryList);
     * </pre>
     * @param productCategoryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    def batchUpdate(batchCall: (ScrBatchEntityList[MbleProductCategory]) => Unit)(implicit optionCall: (ScrUpdateOption[ProductCategoryCB]) => Unit = null): Array[Int] = {
        return doBatchUpdate(callbackBatch(batchCall), callbackUpdateOption(optionCall));
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param productCategoryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    def batchDelete(batchCall: (ScrBatchEntityList[MbleProductCategory]) => Unit)(implicit optionCall: (ScrDeleteOption[ProductCategoryCB]) => Unit = null): Array[Int] = {
        return doBatchDelete(callbackBatch(batchCall), callbackDeleteOption(optionCall));
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * productCategoryBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;DbleProductCategory, ProductCategoryCB&gt;() {
     *     public ConditionBean setup(DbleProductCategory entity, ProductCategoryCB intoCB) {
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
    def queryInsert(setupperCall: (MbleProductCategory, ProductCategoryCB) => ConditionBean): Int = {
        return doQueryInsert(callbackQueryInsertSetupper(setupperCall), null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * DbleProductCategory productCategory = new DbleProductCategory();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//productCategory.setPK...(value);</span>
     * productCategory.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//productCategory.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//productCategory.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//productCategory.setVersionNo(value);</span>
     * ProductCategoryCB cb = new ProductCategoryCB();
     * cb.query().setFoo...(value);
     * productCategoryBhv.<span style="color: #DD4747">queryUpdate</span>(productCategory, cb);
     * </pre>
     * @param entityCall The callback for entity that contains update values. (NotNull)
     * @param cbCall The callback for condition-bean of ProductCategory. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    def queryUpdate(entityCall: (MbleProductCategory) => Unit)(cbCall: (ProductCategoryCB) => Unit): Int = {
        assertObjectNotNull("entityCall", entityCall); assertObjectNotNull("cbCall", cbCall);
        return doQueryUpdate(callbackMbleEntityToDBable(entityCall), callbackCB(cbCall), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * ProductCategoryCB cb = new ProductCategoryCB();
     * cb.query().setFoo...(value);
     * productCategoryBhv.<span style="color: #DD4747">queryDelete</span>(productCategory, cb);
     * </pre>
     * @param cbCall The callback for condition-bean of ProductCategory. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    def queryDelete(cbCall: (ProductCategoryCB) => Unit): Int = {
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
    def outsideSql(): ScrOutsideSqlTypedBasicExecutor[ProductCategoryBhv] = {
        val facadeExecutor: OutsideSqlAllFacadeExecutor[ProductCategoryBhv] = doOutsideSql();
        return toImmutableOutsideSqlTypedBasicExecutor(facadeExecutor.xbasicExecutor()); // variable to resolve generic type
    }

    protected def toImmutableOutsideSqlTypedBasicExecutor(executor: OutsideSqlBasicExecutor[ProductCategoryBhv]): ScrOutsideSqlTypedBasicExecutor[ProductCategoryBhv] =
    { new ScrOutsideSqlTypedBasicExecutor(executor) }

    // ===================================================================================
    //                                                                     Callback Helper
    //                                                                     ===============
    protected def callbackCB(cbCall: (ProductCategoryCB) => Unit): ProductCategoryCB = {
        assertObjectNotNull("cbCall", cbCall);
        val cb = newConditionBean(); cbCall(cb); return cb;
    }

    protected def callbackBatch(batchCall: (ScrBatchEntityList[MbleProductCategory]) => Unit): List[DbleProductCategory] = {
        assertObjectNotNull("batchCall", batchCall);
        val batch = new ScrBatchEntityList[MbleProductCategory]();
        val entityList: List[DbleProductCategory] = new ArrayList[DbleProductCategory]();
        batch.entityCallList.asScala.map { entityCall =>
            val entity = newMbleEntity(); entityCall(entity); entity.toDBable;
        }
        return entityList;
    }

    protected def callbackMbleEntity(entityCall: (MbleProductCategory) => Unit): MbleProductCategory = {
        assertObjectNotNull("entityCall", entityCall);
        val entity = newMbleEntity(); entityCall(entity); return entity;
    }

    protected def callbackMbleEntityToDBable(entityCall: (MbleProductCategory) => Unit): DbleProductCategory = {
        return callbackMbleEntity(entityCall).toDBable;
    }

    protected def callbackInsertOption(optionCall: (ScrInsertOption[ProductCategoryCB]) => Unit): InsertOption[ProductCategoryCB] = {
        if (optionCall == null) { return null; }
        val option = new ScrInsertOption[ProductCategoryCB](new InsertOption[ProductCategoryCB]());
        optionCall(option); return option.toNative;
    }

    protected def callbackUpdateOption(optionCall: (ScrUpdateOption[ProductCategoryCB]) => Unit): UpdateOption[ProductCategoryCB] = {
        if (optionCall == null) { return null; }
        val option = new ScrUpdateOption[ProductCategoryCB](new UpdateOption[ProductCategoryCB]()); optionCall(option); return option.toNative;
    }

    protected def callbackDeleteOption(optionCall: (ScrDeleteOption[ProductCategoryCB]) => Unit): DeleteOption[ProductCategoryCB] = {
        if (optionCall == null) { return null; }
        val option = new ScrDeleteOption[ProductCategoryCB](new DeleteOption[ProductCategoryCB]()); optionCall(option); return option.toNative;
    }

    protected def callbackQueryInsertSetupper(setupperCall: (MbleProductCategory, ProductCategoryCB) => ConditionBean): QueryInsertSetupper[DbleProductCategory, ProductCategoryCB] = {
        assertObjectNotNull("setupperCall", setupperCall);
        return new QueryInsertSetupper[DbleProductCategory, ProductCategoryCB]() {
            def setup(entity: DbleProductCategory, intoCB: ProductCategoryCB): ConditionBean = {
                val mble = newMbleEntity();
                val resultCB = setupperCall(mble, intoCB);
                entity.acceptImmutable(mble.toImmutable());
                return resultCB;
            }
        };
    }

    protected def callbackLoader(dbleList: List[DbleProductCategory], loaderCall: (LoaderOfProductCategory) => Unit = null): Unit = {
        if (loaderCall == null) { return; }
        val loader = new LoaderOfProductCategory();
        loader.ready(dbleList.asInstanceOf[List[DbleProductCategory]], _behaviorSelector);
        loaderCall(loader);
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    override protected def typeOfSelectedEntity(): Class[DbleProductCategory] = { classOf[DbleProductCategory] }
    override protected def typeOfHandlingEntity(): Class[DbleProductCategory] = { classOf[DbleProductCategory] }
    override protected def typeOfHandlingConditionBean(): Class[ProductCategoryCB] = { classOf[ProductCategoryCB] }
    protected def newMbleEntity(): MbleProductCategory = { new MbleProductCategory() }
    protected def newPagingView(rb: PagingResultBean[DbleProductCategory]): ScrPagingView[ProductCategory] =
    { new ScrPagingView(toImmutableEntityList(rb), rb) }

    // ===================================================================================
    //                                                                        Scala Helper
    //                                                                        ============
    protected def toScalaList[ENTITY](javaList: Collection[ENTITY]): immutable.List[ENTITY] = {
        if (javaList == null) { immutable.List() }
        return javaList.toArray.toList.asInstanceOf[immutable.List[ENTITY]];
    }

    def toImmutableEntityList(dbleList: Collection[DbleProductCategory]): immutable.List[ProductCategory] =
    { toScalaList(dbleList).map(new ProductCategory(_)) }

    def toDBableEntityList(immuList: immutable.List[ProductCategory]): List[DbleProductCategory] =
    { immuList.map(new DbleProductCategory().acceptImmutable(_)).asJava }
}
