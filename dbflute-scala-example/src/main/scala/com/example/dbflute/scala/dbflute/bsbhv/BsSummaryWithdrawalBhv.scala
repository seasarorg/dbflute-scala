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
 * The behavior of SUMMARY_WITHDRAWAL as VIEW. <br />
 * <pre>
 * [primary key]
 *     
 *
 * [column]
 *     MEMBER_ID, MEMBER_NAME, WITHDRAWAL_REASON_CODE, WITHDRAWAL_REASON_TEXT, WITHDRAWAL_REASON_INPUT_TEXT, WITHDRAWAL_DATETIME, MEMBER_STATUS_CODE, MEMBER_STATUS_NAME, MAX_PURCHASE_PRICE
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
abstract class BsSummaryWithdrawalBhv extends AbstractBehaviorReadable[DbleSummaryWithdrawal, SummaryWithdrawalCB] {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    def getDBMeta(): DBMeta = { return SummaryWithdrawalDbm; }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    def newConditionBean(): SummaryWithdrawalCB = { return new SummaryWithdrawalCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * SummaryWithdrawalCB cb = new SummaryWithdrawalCB();
     * cb.query().setFoo...(value);
     * int count = summaryWithdrawalBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of DbleSummaryWithdrawal. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    def selectCount(cbCall: (SummaryWithdrawalCB) => Unit): Int = {
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
     * SummaryWithdrawalCB cb = new SummaryWithdrawalCB();
     * cb.query().setFoo...(value);
     * OptionalEntity&lt;DbleSummaryWithdrawal&gt; entity = summaryWithdrawalBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     *
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * entity.<span style="color: #DD4747">required</span>(summaryWithdrawal -&gt; {
     *     ...
     * });
     * DbleSummaryWithdrawal summaryWithdrawal = entity.entity.<span style="color: #DD4747">get()</span>;
     *
     * <span style="color: #3F7E5E">// if it might be no data, ifPresent(), isPresent(), ...</span>
     * entity.<span style="color: #DD4747">ifPresent</span>(summaryWithdrawal -&gt; {
     *     ...
     * });
     * if (entity.entity.<span style="color: #DD4747">isPresent()</span>) {
     *     DbleSummaryWithdrawal summaryWithdrawal = entity.entity.<span style="color: #DD4747">get()</span>;
     * } else {
     *     ...
     * }
     * </pre>
     * @param cbCall The callback for condition-bean of SummaryWithdrawal. (NotNull)
     * @param loaderCall The callback for referrer loader of SummaryWithdrawal. (NoArgAllowed: then no loading)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get() of return value is called and the value is null, which means entity has already been deleted (point is not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    def selectEntity(cbCall: (SummaryWithdrawalCB) => Unit)(implicit loaderCall: (LoaderOfSummaryWithdrawal) => Unit = null): Option[SummaryWithdrawal] = {
        return facadeSelectEntity(callbackCB(cbCall))(loaderCall).map(_.toImmutable);
    }

    protected def facadeSelectEntity(cb: SummaryWithdrawalCB)(loaderCall: (LoaderOfSummaryWithdrawal) => Unit = null): Option[DbleSummaryWithdrawal] = {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity())(loaderCall);
    }

    protected def doSelectEntity[ENTITY <: DbleSummaryWithdrawal](cb: SummaryWithdrawalCB, tp: Class[_ <: ENTITY])(loaderCall: (LoaderOfSummaryWithdrawal) => Unit = null): ENTITY = {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        val dble = helpSelectEntityInternally(cb, tp);
        if (dble != null) {
            callbackLoader(DfCollectionUtil.newArrayList(dble.asInstanceOf[DbleSummaryWithdrawal]), loaderCall);
        }
        return dble;
    }

    protected def doSelectOptionalEntity[ENTITY <: DbleSummaryWithdrawal](cb: SummaryWithdrawalCB, tp: Class[_ <: ENTITY])(loaderCall: (LoaderOfSummaryWithdrawal) => Unit = null): Option[ENTITY] = {
        return Option.apply(doSelectEntity(cb, tp)(loaderCall));
    }

    override protected def doReadEntity(cb: ConditionBean): Entity = { facadeSelectEntity(downcast(cb))().orNull }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * SummaryWithdrawalCB cb = new SummaryWithdrawalCB();
     * cb.query().setFoo...(value);
     * DbleSummaryWithdrawal summaryWithdrawal = summaryWithdrawalBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = summaryWithdrawal.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbCall The callback for condition-bean of SummaryWithdrawal. (NotNull)
     * @param loaderCall The callback for referrer loader of SummaryWithdrawal. (NoArgAllowed: then no loading)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (point is not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    def selectEntityWithDeletedCheck(cbCall: (SummaryWithdrawalCB) => Unit)(implicit loaderCall: (LoaderOfSummaryWithdrawal) => Unit = null): SummaryWithdrawal = {
        return facadeSelectEntityWithDeletedCheck(callbackCB(cbCall))(loaderCall).toImmutable;
    }

    protected def facadeSelectEntityWithDeletedCheck(cb: SummaryWithdrawalCB)(loaderCall: (LoaderOfSummaryWithdrawal) => Unit = null): DbleSummaryWithdrawal = {
        return doSelectEntityWithDeletedCheck(cb, typeOfSelectedEntity())(loaderCall);
    }

    protected def doSelectEntityWithDeletedCheck[ENTITY <: DbleSummaryWithdrawal](cb: SummaryWithdrawalCB, tp: Class[ENTITY])(loaderCall: (LoaderOfSummaryWithdrawal) => Unit = null): ENTITY = {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        val dble = helpSelectEntityWithDeletedCheckInternally(cb, tp);
        callbackLoader(DfCollectionUtil.newArrayList(dble.asInstanceOf[DbleSummaryWithdrawal]), loaderCall);
        return dble;
    }

    override protected def doReadEntityWithDeletedCheck(cb: ConditionBean): Entity = { facadeSelectEntityWithDeletedCheck(downcast(cb))() }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * SummaryWithdrawalCB cb = new SummaryWithdrawalCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * List&lt;${SummaryWithdrawal}&gt; summaryWithdrawalList = summaryWithdrawalBhv.<span style="color: #DD4747">selectList</span>(cb);
     * summaryWithdrawalList.foreach(summaryWithdrawal =>
     *     ... = summaryWithdrawal...;
     * }
     * </pre>
     * @param cbCall The callback for condition-bean of SummaryWithdrawal. (NotNull)
     * @param loaderCall The callback for referrer loader of SummaryWithdrawal. (NoArgAllowed: then no loading)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    def selectList(cbCall: (SummaryWithdrawalCB) => Unit)(implicit loaderCall: (LoaderOfSummaryWithdrawal) => Unit = null): immutable.List[SummaryWithdrawal] = {
        return toImmutableEntityList(facadeSelectList(callbackCB(cbCall))(loaderCall));
    }

    protected def facadeSelectList(cb: SummaryWithdrawalCB)(loaderCall: (LoaderOfSummaryWithdrawal) => Unit = null): ListResultBean[DbleSummaryWithdrawal] = {
        return doSelectList(cb, typeOfSelectedEntity())(loaderCall);
    }

    protected def doSelectList[RESULT <: DbleSummaryWithdrawal](cb: SummaryWithdrawalCB, tp: Class[RESULT])(loaderCall: (LoaderOfSummaryWithdrawal) => Unit = null): ListResultBean[RESULT] = {
        val dbleList = helpSelectListInternally(cb, tp);
        callbackLoader(dbleList.asInstanceOf[List[DbleSummaryWithdrawal]], loaderCall);
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
     * SummaryWithdrawalCB cb = new SummaryWithdrawalCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;DbleSummaryWithdrawal&gt; page = summaryWithdrawalBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (DbleSummaryWithdrawal summaryWithdrawal : page) {
     *     ... = summaryWithdrawal.get...();
     * }
     * </pre>
     * @param cbCall The callback for condition-bean of SummaryWithdrawal. (NotNull)
     * @param loaderCall The callback for referrer loader of SummaryWithdrawal. (NoArgAllowed: then no loading)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    def selectPage(cbCall: (SummaryWithdrawalCB) => Unit)(implicit loaderCall: (LoaderOfSummaryWithdrawal) => Unit = null): ScrPagingView[SummaryWithdrawal] = {
        return newPagingView(facadeSelectPage(callbackCB(cbCall))(loaderCall));
    }

    protected def facadeSelectPage(cb: SummaryWithdrawalCB)(loaderCall: (LoaderOfSummaryWithdrawal) => Unit = null): PagingResultBean[DbleSummaryWithdrawal] = {
        return doSelectPage(cb, typeOfSelectedEntity())(loaderCall);
    }

    protected def doSelectPage[RESULT <: DbleSummaryWithdrawal](cb: SummaryWithdrawalCB, tp: Class[RESULT])(loaderCall: (LoaderOfSummaryWithdrawal) => Unit = null): PagingResultBean[RESULT] = {
        val dbleList = helpSelectPageInternally(cb, tp);
        callbackLoader(dbleList.asInstanceOf[List[DbleSummaryWithdrawal]], loaderCall);
        return dbleList;
    }

    override protected def doReadPage(cb: ConditionBean): PagingResultBean[_ <: Entity] = { facadeSelectPage(downcast(cb))() }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * SummaryWithdrawalCB cb = new SummaryWithdrawalCB();
     * cb.query().setFoo...(value);
     * summaryWithdrawalBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;DbleSummaryWithdrawal&gt;() {
     *     public void handle(DbleSummaryWithdrawal entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of DbleSummaryWithdrawal. (NotNull)
     * @param entityRowHandler The handler of entity row of DbleSummaryWithdrawal. (NotNull)
     */
    def selectCursor(cbCall: (SummaryWithdrawalCB) => Unit)(rowCall: (SummaryWithdrawal) => Unit): Unit = {
        facadeSelectCursor(callbackCB(cbCall), new EntityRowHandler[DbleSummaryWithdrawal]() {
            def handle(entity: DbleSummaryWithdrawal): Unit = { rowCall(entity.toImmutable) }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * summaryWithdrawalBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(SummaryWithdrawalCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    def scalarSelect[RESULT](resultType: Class[RESULT]): ScrHpSLSFunction[SummaryWithdrawalCB, RESULT] = {
        return toScalaSLSFunction[RESULT](facadeScalarSelect(resultType));
    }

    protected def toScalaSLSFunction[RESULT](function: HpSLSFunction[SummaryWithdrawalCB, RESULT]): ScrHpSLSFunction[SummaryWithdrawalCB, RESULT] =
    { new ScrHpSLSFunction[SummaryWithdrawalCB, RESULT](function) }

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
    def outsideSql(): ScrOutsideSqlTypedBasicExecutor[SummaryWithdrawalBhv] = {
        val facadeExecutor: OutsideSqlAllFacadeExecutor[SummaryWithdrawalBhv] = doOutsideSql();
        return toImmutableOutsideSqlTypedBasicExecutor(facadeExecutor.xbasicExecutor()); // variable to resolve generic type
    }

    protected def toImmutableOutsideSqlTypedBasicExecutor(executor: OutsideSqlBasicExecutor[SummaryWithdrawalBhv]): ScrOutsideSqlTypedBasicExecutor[SummaryWithdrawalBhv] =
    { new ScrOutsideSqlTypedBasicExecutor(executor) }

    // ===================================================================================
    //                                                                     Callback Helper
    //                                                                     ===============
    protected def callbackCB(cbCall: (SummaryWithdrawalCB) => Unit): SummaryWithdrawalCB = {
        assertObjectNotNull("cbCall", cbCall);
        val cb = newConditionBean(); cbCall(cb); return cb;
    }

    protected def callbackBatch(batchCall: (ScrBatchEntityList[MbleSummaryWithdrawal]) => Unit): List[DbleSummaryWithdrawal] = {
        assertObjectNotNull("batchCall", batchCall);
        val batch = new ScrBatchEntityList[MbleSummaryWithdrawal]();
        val entityList: List[DbleSummaryWithdrawal] = new ArrayList[DbleSummaryWithdrawal]();
        batch.entityCallList.asScala.map { entityCall =>
            val entity = newMbleEntity(); entityCall(entity); entity.toDBable;
        }
        return entityList;
    }

    protected def callbackMbleEntity(entityCall: (MbleSummaryWithdrawal) => Unit): MbleSummaryWithdrawal = {
        assertObjectNotNull("entityCall", entityCall);
        val entity = newMbleEntity(); entityCall(entity); return entity;
    }

    protected def callbackMbleEntityToDBable(entityCall: (MbleSummaryWithdrawal) => Unit): DbleSummaryWithdrawal = {
        return callbackMbleEntity(entityCall).toDBable;
    }

    protected def callbackInsertOption(optionCall: (ScrInsertOption[SummaryWithdrawalCB]) => Unit): InsertOption[SummaryWithdrawalCB] = {
        if (optionCall == null) { return null; }
        val option = new ScrInsertOption[SummaryWithdrawalCB](new InsertOption[SummaryWithdrawalCB]());
        optionCall(option); return option.toNative;
    }

    protected def callbackUpdateOption(optionCall: (ScrUpdateOption[SummaryWithdrawalCB]) => Unit): UpdateOption[SummaryWithdrawalCB] = {
        if (optionCall == null) { return null; }
        val option = new ScrUpdateOption[SummaryWithdrawalCB](new UpdateOption[SummaryWithdrawalCB]()); optionCall(option); return option.toNative;
    }

    protected def callbackDeleteOption(optionCall: (ScrDeleteOption[SummaryWithdrawalCB]) => Unit): DeleteOption[SummaryWithdrawalCB] = {
        if (optionCall == null) { return null; }
        val option = new ScrDeleteOption[SummaryWithdrawalCB](new DeleteOption[SummaryWithdrawalCB]()); optionCall(option); return option.toNative;
    }

    protected def callbackQueryInsertSetupper(setupperCall: (MbleSummaryWithdrawal, SummaryWithdrawalCB) => ConditionBean): QueryInsertSetupper[DbleSummaryWithdrawal, SummaryWithdrawalCB] = {
        assertObjectNotNull("setupperCall", setupperCall);
        return new QueryInsertSetupper[DbleSummaryWithdrawal, SummaryWithdrawalCB]() {
            def setup(entity: DbleSummaryWithdrawal, intoCB: SummaryWithdrawalCB): ConditionBean = {
                val mble = newMbleEntity();
                val resultCB = setupperCall(mble, intoCB);
                entity.acceptImmutable(mble.toImmutable());
                return resultCB;
            }
        };
    }

    protected def callbackLoader(dbleList: List[DbleSummaryWithdrawal], loaderCall: (LoaderOfSummaryWithdrawal) => Unit = null): Unit = {
        if (loaderCall == null) { return; }
        val loader = new LoaderOfSummaryWithdrawal();
        loader.ready(dbleList.asInstanceOf[List[DbleSummaryWithdrawal]], _behaviorSelector);
        loaderCall(loader);
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    override protected def typeOfSelectedEntity(): Class[DbleSummaryWithdrawal] = { classOf[DbleSummaryWithdrawal] }
    override protected def typeOfHandlingEntity(): Class[DbleSummaryWithdrawal] = { classOf[DbleSummaryWithdrawal] }
    override protected def typeOfHandlingConditionBean(): Class[SummaryWithdrawalCB] = { classOf[SummaryWithdrawalCB] }
    protected def newMbleEntity(): MbleSummaryWithdrawal = { new MbleSummaryWithdrawal() }
    protected def newPagingView(rb: PagingResultBean[DbleSummaryWithdrawal]): ScrPagingView[SummaryWithdrawal] =
    { new ScrPagingView(toImmutableEntityList(rb), rb) }

    // ===================================================================================
    //                                                                        Scala Helper
    //                                                                        ============
    protected def toScalaList[ENTITY](javaList: Collection[ENTITY]): immutable.List[ENTITY] = {
        if (javaList == null) { immutable.List() }
        return javaList.toArray.toList.asInstanceOf[immutable.List[ENTITY]];
    }

    def toImmutableEntityList(dbleList: Collection[DbleSummaryWithdrawal]): immutable.List[SummaryWithdrawal] =
    { toScalaList(dbleList).map(new SummaryWithdrawal(_)) }

    def toDBableEntityList(immuList: immutable.List[SummaryWithdrawal]): List[DbleSummaryWithdrawal] =
    { immuList.map(new DbleSummaryWithdrawal().acceptImmutable(_)).asJava }
}
