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
 * The behavior of SUMMARY_PRODUCT as VIEW. <br />
 * <pre>
 * [primary key]
 *     
 *
 * [column]
 *     PRODUCT_ID, PRODUCT_NAME, PRODUCT_HANDLE_CODE, PRODUCT_STATUS_CODE, LATEST_PURCHASE_DATETIME
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
 *     
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
abstract class BsSummaryProductBhv extends AbstractBehaviorReadable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    def getTableDbName(): String = { return "SUMMARY_PRODUCT"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    def getDBMeta(): DBMeta = { return SummaryProductDbm; }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    def newEntity(): DbleSummaryProduct = { return new DbleSummaryProduct(); }

    /** {@inheritDoc} */
    def newConditionBean(): SummaryProductCB = { return new SummaryProductCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * SummaryProductCB cb = new SummaryProductCB();
     * cb.query().setFoo...(value);
     * int count = summaryProductBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of DbleSummaryProduct. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    def selectCount(cbCall: (SummaryProductCB) => Unit): Int = {
        return facadeSelectCount(callbackCB(cbCall));
    }

    protected def facadeSelectCount(cb: SummaryProductCB): Int = {
        return doSelectCountUniquely(cb);
    }

    protected def doSelectCountUniquely(cb: SummaryProductCB): Int = { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected def doSelectCountPlainly(cb: SummaryProductCB): Int = { // called by selectPage(cb)
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
     * SummaryProductCB cb = new SummaryProductCB();
     * cb.query().setFoo...(value);
     * OptionalEntity&lt;DbleSummaryProduct&gt; entity = summaryProductBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     *
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * entity.<span style="color: #DD4747">required</span>(summaryProduct -&gt; {
     *     ...
     * });
     * DbleSummaryProduct summaryProduct = entity.entity.<span style="color: #DD4747">get()</span>;
     *
     * <span style="color: #3F7E5E">// if it might be no data, ifPresent(), isPresent(), ...</span>
     * entity.<span style="color: #DD4747">ifPresent</span>(summaryProduct -&gt; {
     *     ...
     * });
     * if (entity.entity.<span style="color: #DD4747">isPresent()</span>) {
     *     DbleSummaryProduct summaryProduct = entity.entity.<span style="color: #DD4747">get()</span>;
     * } else {
     *     ...
     * }
     * </pre>
     * @param cbCall The callback for condition-bean of SummaryProduct. (NotNull)
     * @param loaderCall The callback for referrer loader of SummaryProduct. (NoArgAllowed: then no loading)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get() of return value is called and the value is null, which means entity has already been deleted (point is not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    def selectEntity(cbCall: (SummaryProductCB) => Unit)(implicit loaderCall: (LoaderOfSummaryProduct) => Unit = null): Option[SummaryProduct] = {
        return facadeSelectEntity(callbackCB(cbCall))(loaderCall).map(_.toImmutable);
    }

    protected def facadeSelectEntity(cb: SummaryProductCB)(loaderCall: (LoaderOfSummaryProduct) => Unit = null): Option[DbleSummaryProduct] = {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity())(loaderCall);
    }

    protected def doSelectEntity[ENTITY <: DbleSummaryProduct](cb: SummaryProductCB, tp: Class[ENTITY])(loaderCall: (LoaderOfSummaryProduct) => Unit = null): ENTITY = {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        val dble = helpSelectEntityInternally(cb, tp);
        if (dble != null) {
            callbackLoader(DfCollectionUtil.newArrayList(dble.asInstanceOf[DbleSummaryProduct]), loaderCall);
        }
        return dble;
    }

    protected def doSelectOptionalEntity[ENTITY <: DbleSummaryProduct](cb: SummaryProductCB, tp: Class[ENTITY])(loaderCall: (LoaderOfSummaryProduct) => Unit = null): Option[ENTITY] = {
        return Option.apply(doSelectEntity(cb, tp)(loaderCall));
    }

    protected def doReadEntity(cb: ConditionBean): Entity = { facadeSelectEntity(downcast(cb))().orNull }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * SummaryProductCB cb = new SummaryProductCB();
     * cb.query().setFoo...(value);
     * DbleSummaryProduct summaryProduct = summaryProductBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = summaryProduct.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbCall The callback for condition-bean of SummaryProduct. (NotNull)
     * @param loaderCall The callback for referrer loader of SummaryProduct. (NoArgAllowed: then no loading)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (point is not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    def selectEntityWithDeletedCheck(cbCall: (SummaryProductCB) => Unit)(implicit loaderCall: (LoaderOfSummaryProduct) => Unit = null): SummaryProduct = {
        return facadeSelectEntityWithDeletedCheck(callbackCB(cbCall))(loaderCall).toImmutable;
    }

    protected def facadeSelectEntityWithDeletedCheck(cb: SummaryProductCB)(loaderCall: (LoaderOfSummaryProduct) => Unit = null): DbleSummaryProduct = {
        return doSelectEntityWithDeletedCheck(cb, typeOfSelectedEntity())(loaderCall);
    }

    protected def doSelectEntityWithDeletedCheck[ENTITY <: DbleSummaryProduct](cb: SummaryProductCB, tp: Class[ENTITY])(loaderCall: (LoaderOfSummaryProduct) => Unit = null): ENTITY = {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        val dble = helpSelectEntityWithDeletedCheckInternally(cb, tp);
        callbackLoader(DfCollectionUtil.newArrayList(dble.asInstanceOf[DbleSummaryProduct]), loaderCall);
        return dble;
    }

    protected def doReadEntityWithDeletedCheck(cb: ConditionBean): Entity = { facadeSelectEntityWithDeletedCheck(downcast(cb))() }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * SummaryProductCB cb = new SummaryProductCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * List&lt;${SummaryProduct}&gt; summaryProductList = summaryProductBhv.<span style="color: #DD4747">selectList</span>(cb);
     * summaryProductList.foreach(summaryProduct =>
     *     ... = summaryProduct...;
     * }
     * </pre>
     * @param cbCall The callback for condition-bean of SummaryProduct. (NotNull)
     * @param loaderCall The callback for referrer loader of SummaryProduct. (NoArgAllowed: then no loading)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    def selectList(cbCall: (SummaryProductCB) => Unit)(implicit loaderCall: (LoaderOfSummaryProduct) => Unit = null): immutable.List[SummaryProduct] = {
        return toImmutableEntityList(facadeSelectList(callbackCB(cbCall))(loaderCall));
    }

    protected def facadeSelectList(cb: SummaryProductCB)(loaderCall: (LoaderOfSummaryProduct) => Unit = null): ListResultBean[DbleSummaryProduct] = {
        return doSelectList(cb, typeOfSelectedEntity())(loaderCall);
    }

    protected def doSelectList[ENTITY <: DbleSummaryProduct](cb: SummaryProductCB, tp: Class[ENTITY])(loaderCall: (LoaderOfSummaryProduct) => Unit = null): ListResultBean[ENTITY] = {
        val dbleList = helpSelectListInternally(cb, tp);
        callbackLoader(dbleList.asInstanceOf[List[DbleSummaryProduct]], loaderCall);
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
     * SummaryProductCB cb = new SummaryProductCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;DbleSummaryProduct&gt; page = summaryProductBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (DbleSummaryProduct summaryProduct : page) {
     *     ... = summaryProduct.get...();
     * }
     * </pre>
     * @param cbCall The callback for condition-bean of SummaryProduct. (NotNull)
     * @param loaderCall The callback for referrer loader of SummaryProduct. (NoArgAllowed: then no loading)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    def selectPage(cbCall: (SummaryProductCB) => Unit)(implicit loaderCall: (LoaderOfSummaryProduct) => Unit = null): ScrPagingView[SummaryProduct] = {
        return newPagingView(facadeSelectPage(callbackCB(cbCall))(loaderCall));
    }

    protected def facadeSelectPage(cb: SummaryProductCB)(loaderCall: (LoaderOfSummaryProduct) => Unit = null): PagingResultBean[DbleSummaryProduct] = {
        return doSelectPage(cb, typeOfSelectedEntity())(loaderCall);
    }

    protected def doSelectPage[ENTITY <: DbleSummaryProduct](cb: SummaryProductCB, tp: Class[ENTITY])(loaderCall: (LoaderOfSummaryProduct) => Unit = null): PagingResultBean[ENTITY] = {
        return helpSelectPageInternally(cb, tp);
    }

    protected def doReadPage(cb: ConditionBean): PagingResultBean[_ <: Entity] = { facadeSelectPage(downcast(cb))() }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * SummaryProductCB cb = new SummaryProductCB();
     * cb.query().setFoo...(value);
     * summaryProductBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;DbleSummaryProduct&gt;() {
     *     public void handle(DbleSummaryProduct entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of DbleSummaryProduct. (NotNull)
     * @param entityRowHandler The handler of entity row of DbleSummaryProduct. (NotNull)
     */
    def selectCursor(cbCall: (SummaryProductCB) => Unit)(rowCall: (SummaryProduct) => Unit): Unit = {
        facadeSelectCursor(callbackCB(cbCall), new EntityRowHandler[DbleSummaryProduct]() {
            def handle(entity: DbleSummaryProduct): Unit = { rowCall(entity.toImmutable) }
        });
    }

    protected def facadeSelectCursor(cb: SummaryProductCB, handler: EntityRowHandler[DbleSummaryProduct]): Unit = {
        doSelectCursor(cb, handler, typeOfSelectedEntity());
    }

    protected def doSelectCursor[ENTITY <: DbleSummaryProduct](cb: SummaryProductCB, handler: EntityRowHandler[ENTITY], tp: Class[ENTITY]): Unit = {
        helpSelectCursorInternally(cb, handler, tp);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * summaryProductBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(SummaryProductCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    def scalarSelect[RESULT](resultType: Class[RESULT]): ScrHpSLSFunction[SummaryProductCB, RESULT] = {
        return toScalaSLSFunction[RESULT](facadeScalarSelect(resultType));
    }

    protected def toScalaSLSFunction[RESULT](function: HpSLSFunction[SummaryProductCB, RESULT]): ScrHpSLSFunction[SummaryProductCB, RESULT] =
    { new ScrHpSLSFunction[SummaryProductCB, RESULT](function) }

    protected def facadeScalarSelect[RESULT](resultType: Class[RESULT]): HpSLSFunction[SummaryProductCB, RESULT] = {
        return doScalarSelect(resultType, newConditionBean());
    }

    protected def doScalarSelect[RESULT, CB <: SummaryProductCB](tp: Class[RESULT], cb: CB): HpSLSFunction[CB, RESULT] = {
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
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============

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
    def outsideSql(): ScrOutsideSqlBasicExecutor[SummaryProductBhv] = {
        return toImmutableOutsideSqlBasicExecutor(doOutsideSql());
    }

    protected def toImmutableOutsideSqlBasicExecutor(executor: OutsideSqlBasicExecutor[SummaryProductBhv]): ScrOutsideSqlBasicExecutor[SummaryProductBhv] =
    { new ScrOutsideSqlBasicExecutor(executor) }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    protected def callbackCB(cbCall: (SummaryProductCB) => Unit): SummaryProductCB = {
        assertObjectNotNull("cbCall", cbCall);
        val cb = newConditionBean(); cbCall(cb); return cb;
    }

    protected def callbackBatch(batchCall: (ScrBatchEntityList[MbleSummaryProduct]) => Unit): List[DbleSummaryProduct] = {
        assertObjectNotNull("batchCall", batchCall);
        val batch = new ScrBatchEntityList[MbleSummaryProduct]();
        val entityList: List[DbleSummaryProduct] = new ArrayList[DbleSummaryProduct]();
        batch.entityCallList.asScala.map { entityCall =>
            val entity = newMbleEntity(); entityCall(entity); entity.toDBable;
        }
        return entityList;
    }

    protected def callbackMbleEntity(entityCall: (MbleSummaryProduct) => Unit): MbleSummaryProduct = {
        assertObjectNotNull("entityCall", entityCall);
        val entity = newMbleEntity(); entityCall(entity); return entity;
    }

    protected def callbackMbleEntityToDBable(entityCall: (MbleSummaryProduct) => Unit): DbleSummaryProduct = {
        return callbackMbleEntity(entityCall).toDBable;
    }

    protected def callbackInsertOption(optionCall: (ScrInsertOption[SummaryProductCB]) => Unit): InsertOption[SummaryProductCB] = {
        if (optionCall == null) { return null; }
        val option = new ScrInsertOption[SummaryProductCB](new InsertOption[SummaryProductCB]());
        optionCall(option); return option.toNative;
    }

    protected def callbackUpdateOption(optionCall: (ScrUpdateOption[SummaryProductCB]) => Unit): UpdateOption[SummaryProductCB] = {
        if (optionCall == null) { return null; }
        val option = new ScrUpdateOption[SummaryProductCB](new UpdateOption[SummaryProductCB]()); optionCall(option); return option.toNative;
    }

    protected def callbackDeleteOption(optionCall: (ScrDeleteOption[SummaryProductCB]) => Unit): DeleteOption[SummaryProductCB] = {
        if (optionCall == null) { return null; }
        val option = new ScrDeleteOption[SummaryProductCB](new DeleteOption[SummaryProductCB]()); optionCall(option); return option.toNative;
    }

    protected def callbackLoader(dbleList: List[DbleSummaryProduct], loaderCall: (LoaderOfSummaryProduct) => Unit = null): Unit = {
        if (loaderCall == null) { return; }
        val loader = new LoaderOfSummaryProduct();
        loader.ready(dbleList.asInstanceOf[List[DbleSummaryProduct]], _behaviorSelector);
        loaderCall(loader);
    }

    protected def newMbleEntity(): MbleSummaryProduct = { new MbleSummaryProduct() }
    protected def newPagingView(rb: PagingResultBean[DbleSummaryProduct]): ScrPagingView[SummaryProduct] =
    { new ScrPagingView(toImmutableEntityList(rb), rb) }

    protected def typeOfSelectedEntity(): Class[DbleSummaryProduct] = { classOf[DbleSummaryProduct] }
    protected def downcast(et: Entity): DbleSummaryProduct = { helpEntityDowncastInternally(et, classOf[DbleSummaryProduct]) }
    protected def downcast(cb: ConditionBean): SummaryProductCB = { helpConditionBeanDowncastInternally(cb, classOf[SummaryProductCB]) }
    protected def downcast(ls: List[_ <: Entity]): List[DbleSummaryProduct] = { ls.asInstanceOf[List[DbleSummaryProduct]] }

    // ===================================================================================
    //                                                                        Scala Helper
    //                                                                        ============
    protected def toScalaList[ENTITY](javaList: Collection[ENTITY]): immutable.List[ENTITY] = {
        if (javaList == null) { immutable.List() }
        return immutable.List.fromArray(javaList.toArray()).asInstanceOf[immutable.List[ENTITY]];
    }

    def toImmutableEntityList(dbleList: Collection[DbleSummaryProduct]): immutable.List[SummaryProduct] =
    { toScalaList(dbleList).map(new SummaryProduct(_)) }

    def toDBableEntityList(immuList: immutable.List[SummaryProduct]): List[DbleSummaryProduct] =
    { immuList.map(new DbleSummaryProduct().acceptImmutable(_)).asJava }
}
