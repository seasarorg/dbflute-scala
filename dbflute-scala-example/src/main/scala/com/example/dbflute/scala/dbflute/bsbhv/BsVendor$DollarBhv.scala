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
 * The behavior of VENDOR_$_DOLLAR as TABLE. <br />
 * <pre>
 * [primary key]
 *     VENDOR_$_DOLLAR_ID
 *
 * [column]
 *     VENDOR_$_DOLLAR_ID, VENDOR_$_DOLLAR_NAME
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
abstract class BsVendor$DollarBhv extends AbstractBehaviorWritable[DbleVendor$Dollar, Vendor$DollarCB] {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    def getDBMeta(): DBMeta = { return Vendor$DollarDbm; }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    def newConditionBean(): Vendor$DollarCB = { return new Vendor$DollarCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * Vendor$DollarCB cb = new Vendor$DollarCB();
     * cb.query().setFoo...(value);
     * int count = vendor$DollarBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of DbleVendor$Dollar. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    def selectCount(cbCall: (Vendor$DollarCB) => Unit): Int = {
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
     * Vendor$DollarCB cb = new Vendor$DollarCB();
     * cb.query().setFoo...(value);
     * OptionalEntity&lt;DbleVendor$Dollar&gt; entity = vendor$DollarBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     *
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * entity.<span style="color: #DD4747">required</span>(vendor$Dollar -&gt; {
     *     ...
     * });
     * DbleVendor$Dollar vendor$Dollar = entity.entity.<span style="color: #DD4747">get()</span>;
     *
     * <span style="color: #3F7E5E">// if it might be no data, ifPresent(), isPresent(), ...</span>
     * entity.<span style="color: #DD4747">ifPresent</span>(vendor$Dollar -&gt; {
     *     ...
     * });
     * if (entity.entity.<span style="color: #DD4747">isPresent()</span>) {
     *     DbleVendor$Dollar vendor$Dollar = entity.entity.<span style="color: #DD4747">get()</span>;
     * } else {
     *     ...
     * }
     * </pre>
     * @param cbCall The callback for condition-bean of Vendor$Dollar. (NotNull)
     * @param loaderCall The callback for referrer loader of Vendor$Dollar. (NoArgAllowed: then no loading)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get() of return value is called and the value is null, which means entity has already been deleted (point is not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    def selectEntity(cbCall: (Vendor$DollarCB) => Unit)(implicit loaderCall: (LoaderOfVendor$Dollar) => Unit = null): Option[Vendor$Dollar] = {
        return facadeSelectEntity(callbackCB(cbCall))(loaderCall).map(_.toImmutable);
    }

    protected def facadeSelectEntity(cb: Vendor$DollarCB)(loaderCall: (LoaderOfVendor$Dollar) => Unit = null): Option[DbleVendor$Dollar] = {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity())(loaderCall);
    }

    protected def doSelectEntity[ENTITY <: DbleVendor$Dollar](cb: Vendor$DollarCB, tp: Class[_ <: ENTITY])(loaderCall: (LoaderOfVendor$Dollar) => Unit = null): ENTITY = {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        val dble = helpSelectEntityInternally(cb, tp);
        if (dble != null) {
            callbackLoader(DfCollectionUtil.newArrayList(dble.asInstanceOf[DbleVendor$Dollar]), loaderCall);
        }
        return dble;
    }

    protected def doSelectOptionalEntity[ENTITY <: DbleVendor$Dollar](cb: Vendor$DollarCB, tp: Class[_ <: ENTITY])(loaderCall: (LoaderOfVendor$Dollar) => Unit = null): Option[ENTITY] = {
        return Option.apply(doSelectEntity(cb, tp)(loaderCall));
    }

    override protected def doReadEntity(cb: ConditionBean): Entity = { facadeSelectEntity(downcast(cb))().orNull }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * Vendor$DollarCB cb = new Vendor$DollarCB();
     * cb.query().setFoo...(value);
     * DbleVendor$Dollar vendor$Dollar = vendor$DollarBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = vendor$Dollar.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbCall The callback for condition-bean of Vendor$Dollar. (NotNull)
     * @param loaderCall The callback for referrer loader of Vendor$Dollar. (NoArgAllowed: then no loading)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (point is not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    def selectEntityWithDeletedCheck(cbCall: (Vendor$DollarCB) => Unit)(implicit loaderCall: (LoaderOfVendor$Dollar) => Unit = null): Vendor$Dollar = {
        return facadeSelectEntityWithDeletedCheck(callbackCB(cbCall))(loaderCall).toImmutable;
    }

    protected def facadeSelectEntityWithDeletedCheck(cb: Vendor$DollarCB)(loaderCall: (LoaderOfVendor$Dollar) => Unit = null): DbleVendor$Dollar = {
        return doSelectEntityWithDeletedCheck(cb, typeOfSelectedEntity())(loaderCall);
    }

    protected def doSelectEntityWithDeletedCheck[ENTITY <: DbleVendor$Dollar](cb: Vendor$DollarCB, tp: Class[ENTITY])(loaderCall: (LoaderOfVendor$Dollar) => Unit = null): ENTITY = {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        val dble = helpSelectEntityWithDeletedCheckInternally(cb, tp);
        callbackLoader(DfCollectionUtil.newArrayList(dble.asInstanceOf[DbleVendor$Dollar]), loaderCall);
        return dble;
    }

    override protected def doReadEntityWithDeletedCheck(cb: ConditionBean): Entity = { facadeSelectEntityWithDeletedCheck(downcast(cb))() }

    /**
     * Select the entity by the primary-key value.
     * @param vendor$DollarId : PK, NotNull, INTEGER(10). (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    def selectByPK(vendor$DollarId: Integer): Option[Vendor$Dollar] = {
        return facadeSelectByPK(vendor$DollarId).map(_.toImmutable);
    }

    protected def facadeSelectByPK(vendor$DollarId: Integer): Option[DbleVendor$Dollar] = {
        return doSelectByPK(vendor$DollarId, typeOfSelectedEntity());
    }

    protected def doSelectByPK[ENTITY <: DbleVendor$Dollar](vendor$DollarId: Integer, tp: Class[_ <: ENTITY]): Option[ENTITY] = {
        return Option.apply(doSelectEntity(xprepareCBAsPK(vendor$DollarId), tp)());
    }

    protected def xprepareCBAsPK(vendor$DollarId: Integer): Vendor$DollarCB = {
        assertObjectNotNull("vendor$DollarId", vendor$DollarId);
        return newConditionBean().acceptPK(vendor$DollarId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * Vendor$DollarCB cb = new Vendor$DollarCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * List&lt;${Vendor$Dollar}&gt; vendor$DollarList = vendor$DollarBhv.<span style="color: #DD4747">selectList</span>(cb);
     * vendor$DollarList.foreach(vendor$Dollar =>
     *     ... = vendor$Dollar...;
     * }
     * </pre>
     * @param cbCall The callback for condition-bean of Vendor$Dollar. (NotNull)
     * @param loaderCall The callback for referrer loader of Vendor$Dollar. (NoArgAllowed: then no loading)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    def selectList(cbCall: (Vendor$DollarCB) => Unit)(implicit loaderCall: (LoaderOfVendor$Dollar) => Unit = null): immutable.List[Vendor$Dollar] = {
        return toImmutableEntityList(facadeSelectList(callbackCB(cbCall))(loaderCall));
    }

    protected def facadeSelectList(cb: Vendor$DollarCB)(loaderCall: (LoaderOfVendor$Dollar) => Unit = null): ListResultBean[DbleVendor$Dollar] = {
        return doSelectList(cb, typeOfSelectedEntity())(loaderCall);
    }

    protected def doSelectList[RESULT <: DbleVendor$Dollar](cb: Vendor$DollarCB, tp: Class[RESULT])(loaderCall: (LoaderOfVendor$Dollar) => Unit = null): ListResultBean[RESULT] = {
        val dbleList = helpSelectListInternally(cb, tp);
        callbackLoader(dbleList.asInstanceOf[List[DbleVendor$Dollar]], loaderCall);
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
     * Vendor$DollarCB cb = new Vendor$DollarCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;DbleVendor$Dollar&gt; page = vendor$DollarBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (DbleVendor$Dollar vendor$Dollar : page) {
     *     ... = vendor$Dollar.get...();
     * }
     * </pre>
     * @param cbCall The callback for condition-bean of Vendor$Dollar. (NotNull)
     * @param loaderCall The callback for referrer loader of Vendor$Dollar. (NoArgAllowed: then no loading)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    def selectPage(cbCall: (Vendor$DollarCB) => Unit)(implicit loaderCall: (LoaderOfVendor$Dollar) => Unit = null): ScrPagingView[Vendor$Dollar] = {
        return newPagingView(facadeSelectPage(callbackCB(cbCall))(loaderCall));
    }

    protected def facadeSelectPage(cb: Vendor$DollarCB)(loaderCall: (LoaderOfVendor$Dollar) => Unit = null): PagingResultBean[DbleVendor$Dollar] = {
        return doSelectPage(cb, typeOfSelectedEntity())(loaderCall);
    }

    protected def doSelectPage[RESULT <: DbleVendor$Dollar](cb: Vendor$DollarCB, tp: Class[RESULT])(loaderCall: (LoaderOfVendor$Dollar) => Unit = null): PagingResultBean[RESULT] = {
        val dbleList = helpSelectPageInternally(cb, tp);
        callbackLoader(dbleList.asInstanceOf[List[DbleVendor$Dollar]], loaderCall);
        return dbleList;
    }

    override protected def doReadPage(cb: ConditionBean): PagingResultBean[_ <: Entity] = { facadeSelectPage(downcast(cb))() }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * Vendor$DollarCB cb = new Vendor$DollarCB();
     * cb.query().setFoo...(value);
     * vendor$DollarBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;DbleVendor$Dollar&gt;() {
     *     public void handle(DbleVendor$Dollar entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of DbleVendor$Dollar. (NotNull)
     * @param entityRowHandler The handler of entity row of DbleVendor$Dollar. (NotNull)
     */
    def selectCursor(cbCall: (Vendor$DollarCB) => Unit)(rowCall: (Vendor$Dollar) => Unit): Unit = {
        facadeSelectCursor(callbackCB(cbCall), new EntityRowHandler[DbleVendor$Dollar]() {
            def handle(entity: DbleVendor$Dollar): Unit = { rowCall(entity.toImmutable) }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * vendor$DollarBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(Vendor$DollarCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    def scalarSelect[RESULT](resultType: Class[RESULT]): ScrHpSLSFunction[Vendor$DollarCB, RESULT] = {
        return toScalaSLSFunction[RESULT](facadeScalarSelect(resultType));
    }

    protected def toScalaSLSFunction[RESULT](function: HpSLSFunction[Vendor$DollarCB, RESULT]): ScrHpSLSFunction[Vendor$DollarCB, RESULT] =
    { new ScrHpSLSFunction[Vendor$DollarCB, RESULT](function) }

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
    /**
     * Extract the value list of (single) primary key vendor$DollarId.
     * @param vendor$DollarList The list of vendor$Dollar. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    def extractVendor$DollarIdList(vendor$DollarList: immutable.List[Vendor$Dollar]): immutable.List[Int] = {
        val plainList = helpExtractListInternally(toDBableEntityList(vendor$DollarList), "vendor$DollarId");
        return toScalaList(plainList).map(_.asInstanceOf[Int]);
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * DbleVendor$Dollar vendor$Dollar = new DbleVendor$Dollar();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * vendor$Dollar.setFoo...(value);
     * vendor$Dollar.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendor$Dollar.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendor$Dollar.set...;</span>
     * vendor$DollarBhv.<span style="color: #DD4747">insert</span>(vendor$Dollar);
     * ... = vendor$Dollar.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param entityCall The callback for entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param optionCall The callback for option of insert. (NoArgAllowed: then no option)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    def insert(entityCall: (MbleVendor$Dollar) => Unit)(implicit optionCall: (ScrInsertOption[Vendor$DollarCB]) => Unit = null): Unit = {
        assertObjectNotNull("entityCall", entityCall);
        doInsert(callbackMbleEntityToDBable(entityCall), callbackInsertOption(optionCall));
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * DbleVendor$Dollar vendor$Dollar = new DbleVendor$Dollar();
     * vendor$Dollar.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * vendor$Dollar.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendor$Dollar.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendor$Dollar.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * vendor$Dollar.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     vendor$DollarBhv.<span style="color: #DD4747">update</span>(vendor$Dollar);
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
    def update(entityCall: (MbleVendor$Dollar) => Unit)(implicit optionCall: (ScrUpdateOption[Vendor$DollarCB]) => Unit = null): Unit = {
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
    def insertOrUpdate(entityCall: (MbleVendor$Dollar) => Unit)(implicit insertOptionCall: (ScrInsertOption[Vendor$DollarCB]) => Unit = null, updateOptionCall: (ScrUpdateOption[Vendor$DollarCB]) => Unit = null): Unit = {
        doInsertOrUpdate(callbackMbleEntityToDBable(entityCall), callbackInsertOption(insertOptionCall), callbackUpdateOption(updateOptionCall));
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * DbleVendor$Dollar vendor$Dollar = new DbleVendor$Dollar();
     * vendor$Dollar.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * vendor$Dollar.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     vendor$DollarBhv.<span style="color: #DD4747">delete</span>(vendor$Dollar);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param entityCall The callback for entity of delete. (NotNull, PrimaryKeyNotNull)
     * @param optionCall The callback for option of delete. (NoArgAllowed: then no option)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    def delete(entityCall: (MbleVendor$Dollar) => Unit)(implicit optionCall: (ScrDeleteOption[Vendor$DollarCB]) => Unit = null): Unit = {
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
     *     DbleVendor$Dollar vendor$Dollar = new DbleVendor$Dollar();
     *     vendor$Dollar.setFooName("foo");
     *     if (...) {
     *         vendor$Dollar.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     vendor$DollarList.add(vendor$Dollar);
     * }
     * vendor$DollarBhv.<span style="color: #DD4747">batchInsert</span>(vendor$DollarList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param vendor$DollarList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    def batchInsert(batchCall: (ScrBatchEntityList[MbleVendor$Dollar]) => Unit)(implicit optionCall: (ScrInsertOption[Vendor$DollarCB]) => Unit = null): Array[Int] = {
        return doBatchInsert(callbackBatch(batchCall), callbackInsertOption(optionCall));
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     DbleVendor$Dollar vendor$Dollar = new DbleVendor$Dollar();
     *     vendor$Dollar.setFooName("foo");
     *     if (...) {
     *         vendor$Dollar.setFooPrice(123);
     *     } else {
     *         vendor$Dollar.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//vendor$Dollar.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     vendor$DollarList.add(vendor$Dollar);
     * }
     * vendor$DollarBhv.<span style="color: #DD4747">batchUpdate</span>(vendor$DollarList);
     * </pre>
     * @param vendor$DollarList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    def batchUpdate(batchCall: (ScrBatchEntityList[MbleVendor$Dollar]) => Unit)(implicit optionCall: (ScrUpdateOption[Vendor$DollarCB]) => Unit = null): Array[Int] = {
        return doBatchUpdate(callbackBatch(batchCall), callbackUpdateOption(optionCall));
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param vendor$DollarList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    def batchDelete(batchCall: (ScrBatchEntityList[MbleVendor$Dollar]) => Unit)(implicit optionCall: (ScrDeleteOption[Vendor$DollarCB]) => Unit = null): Array[Int] = {
        return doBatchDelete(callbackBatch(batchCall), callbackDeleteOption(optionCall));
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * vendor$DollarBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;DbleVendor$Dollar, Vendor$DollarCB&gt;() {
     *     public ConditionBean setup(DbleVendor$Dollar entity, Vendor$DollarCB intoCB) {
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
    def queryInsert(setupperCall: (MbleVendor$Dollar, Vendor$DollarCB) => ConditionBean): Int = {
        return doQueryInsert(callbackQueryInsertSetupper(setupperCall), null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * DbleVendor$Dollar vendor$Dollar = new DbleVendor$Dollar();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendor$Dollar.setPK...(value);</span>
     * vendor$Dollar.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendor$Dollar.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendor$Dollar.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendor$Dollar.setVersionNo(value);</span>
     * Vendor$DollarCB cb = new Vendor$DollarCB();
     * cb.query().setFoo...(value);
     * vendor$DollarBhv.<span style="color: #DD4747">queryUpdate</span>(vendor$Dollar, cb);
     * </pre>
     * @param entityCall The callback for entity that contains update values. (NotNull)
     * @param cbCall The callback for condition-bean of Vendor$Dollar. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    def queryUpdate(entityCall: (MbleVendor$Dollar) => Unit)(cbCall: (Vendor$DollarCB) => Unit): Int = {
        assertObjectNotNull("entityCall", entityCall); assertObjectNotNull("cbCall", cbCall);
        return doQueryUpdate(callbackMbleEntityToDBable(entityCall), callbackCB(cbCall), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * Vendor$DollarCB cb = new Vendor$DollarCB();
     * cb.query().setFoo...(value);
     * vendor$DollarBhv.<span style="color: #DD4747">queryDelete</span>(vendor$Dollar, cb);
     * </pre>
     * @param cbCall The callback for condition-bean of Vendor$Dollar. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    def queryDelete(cbCall: (Vendor$DollarCB) => Unit): Int = {
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
    def outsideSql(): ScrOutsideSqlTypedBasicExecutor[Vendor$DollarBhv] = {
        val facadeExecutor: OutsideSqlAllFacadeExecutor[Vendor$DollarBhv] = doOutsideSql();
        return toImmutableOutsideSqlTypedBasicExecutor(facadeExecutor.xbasicExecutor()); // variable to resolve generic type
    }

    protected def toImmutableOutsideSqlTypedBasicExecutor(executor: OutsideSqlBasicExecutor[Vendor$DollarBhv]): ScrOutsideSqlTypedBasicExecutor[Vendor$DollarBhv] =
    { new ScrOutsideSqlTypedBasicExecutor(executor) }

    // ===================================================================================
    //                                                                     Callback Helper
    //                                                                     ===============
    protected def callbackCB(cbCall: (Vendor$DollarCB) => Unit): Vendor$DollarCB = {
        assertObjectNotNull("cbCall", cbCall);
        val cb = newConditionBean(); cbCall(cb); return cb;
    }

    protected def callbackBatch(batchCall: (ScrBatchEntityList[MbleVendor$Dollar]) => Unit): List[DbleVendor$Dollar] = {
        assertObjectNotNull("batchCall", batchCall);
        val batch = new ScrBatchEntityList[MbleVendor$Dollar]();
        val entityList: List[DbleVendor$Dollar] = new ArrayList[DbleVendor$Dollar]();
        batch.entityCallList.asScala.map { entityCall =>
            val entity = newMbleEntity(); entityCall(entity); entity.toDBable;
        }
        return entityList;
    }

    protected def callbackMbleEntity(entityCall: (MbleVendor$Dollar) => Unit): MbleVendor$Dollar = {
        assertObjectNotNull("entityCall", entityCall);
        val entity = newMbleEntity(); entityCall(entity); return entity;
    }

    protected def callbackMbleEntityToDBable(entityCall: (MbleVendor$Dollar) => Unit): DbleVendor$Dollar = {
        return callbackMbleEntity(entityCall).toDBable;
    }

    protected def callbackInsertOption(optionCall: (ScrInsertOption[Vendor$DollarCB]) => Unit): InsertOption[Vendor$DollarCB] = {
        if (optionCall == null) { return null; }
        val option = new ScrInsertOption[Vendor$DollarCB](new InsertOption[Vendor$DollarCB]());
        optionCall(option); return option.toNative;
    }

    protected def callbackUpdateOption(optionCall: (ScrUpdateOption[Vendor$DollarCB]) => Unit): UpdateOption[Vendor$DollarCB] = {
        if (optionCall == null) { return null; }
        val option = new ScrUpdateOption[Vendor$DollarCB](new UpdateOption[Vendor$DollarCB]()); optionCall(option); return option.toNative;
    }

    protected def callbackDeleteOption(optionCall: (ScrDeleteOption[Vendor$DollarCB]) => Unit): DeleteOption[Vendor$DollarCB] = {
        if (optionCall == null) { return null; }
        val option = new ScrDeleteOption[Vendor$DollarCB](new DeleteOption[Vendor$DollarCB]()); optionCall(option); return option.toNative;
    }

    protected def callbackQueryInsertSetupper(setupperCall: (MbleVendor$Dollar, Vendor$DollarCB) => ConditionBean): QueryInsertSetupper[DbleVendor$Dollar, Vendor$DollarCB] = {
        assertObjectNotNull("setupperCall", setupperCall);
        return new QueryInsertSetupper[DbleVendor$Dollar, Vendor$DollarCB]() {
            def setup(entity: DbleVendor$Dollar, intoCB: Vendor$DollarCB): ConditionBean = {
                val mble = newMbleEntity();
                val resultCB = setupperCall(mble, intoCB);
                entity.acceptImmutable(mble.toImmutable());
                return resultCB;
            }
        };
    }

    protected def callbackLoader(dbleList: List[DbleVendor$Dollar], loaderCall: (LoaderOfVendor$Dollar) => Unit = null): Unit = {
        if (loaderCall == null) { return; }
        val loader = new LoaderOfVendor$Dollar();
        loader.ready(dbleList.asInstanceOf[List[DbleVendor$Dollar]], _behaviorSelector);
        loaderCall(loader);
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    override protected def typeOfSelectedEntity(): Class[DbleVendor$Dollar] = { classOf[DbleVendor$Dollar] }
    override protected def typeOfHandlingEntity(): Class[DbleVendor$Dollar] = { classOf[DbleVendor$Dollar] }
    override protected def typeOfHandlingConditionBean(): Class[Vendor$DollarCB] = { classOf[Vendor$DollarCB] }
    protected def newMbleEntity(): MbleVendor$Dollar = { new MbleVendor$Dollar() }
    protected def newPagingView(rb: PagingResultBean[DbleVendor$Dollar]): ScrPagingView[Vendor$Dollar] =
    { new ScrPagingView(toImmutableEntityList(rb), rb) }

    // ===================================================================================
    //                                                                        Scala Helper
    //                                                                        ============
    protected def toScalaList[ENTITY](javaList: Collection[ENTITY]): immutable.List[ENTITY] = {
        if (javaList == null) { immutable.List() }
        return javaList.toArray.toList.asInstanceOf[immutable.List[ENTITY]];
    }

    def toImmutableEntityList(dbleList: Collection[DbleVendor$Dollar]): immutable.List[Vendor$Dollar] =
    { toScalaList(dbleList).map(new Vendor$Dollar(_)) }

    def toDBableEntityList(immuList: immutable.List[Vendor$Dollar]): List[DbleVendor$Dollar] =
    { immuList.map(new DbleVendor$Dollar().acceptImmutable(_)).asJava }
}
