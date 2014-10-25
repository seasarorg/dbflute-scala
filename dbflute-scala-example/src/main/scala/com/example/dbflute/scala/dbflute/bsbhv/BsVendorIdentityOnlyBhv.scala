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
 * The behavior of VENDOR_IDENTITY_ONLY as TABLE. <br />
 * <pre>
 * [primary key]
 *     IDENTITY_ONLY_ID
 *
 * [column]
 *     IDENTITY_ONLY_ID
 *
 * [sequence]
 *     
 *
 * [identity]
 *     IDENTITY_ONLY_ID
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
abstract class BsVendorIdentityOnlyBhv extends AbstractBehaviorWritable[DbleVendorIdentityOnly, VendorIdentityOnlyCB] {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    def getDBMeta(): DBMeta = { return VendorIdentityOnlyDbm; }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    def newConditionBean(): VendorIdentityOnlyCB = { return new VendorIdentityOnlyCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * VendorIdentityOnlyCB cb = new VendorIdentityOnlyCB();
     * cb.query().setFoo...(value);
     * int count = vendorIdentityOnlyBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of DbleVendorIdentityOnly. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    def selectCount(cbCall: (VendorIdentityOnlyCB) => Unit): Int = {
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
     * VendorIdentityOnlyCB cb = new VendorIdentityOnlyCB();
     * cb.query().setFoo...(value);
     * OptionalEntity&lt;DbleVendorIdentityOnly&gt; entity = vendorIdentityOnlyBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     *
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * entity.<span style="color: #DD4747">required</span>(vendorIdentityOnly -&gt; {
     *     ...
     * });
     * DbleVendorIdentityOnly vendorIdentityOnly = entity.entity.<span style="color: #DD4747">get()</span>;
     *
     * <span style="color: #3F7E5E">// if it might be no data, ifPresent(), isPresent(), ...</span>
     * entity.<span style="color: #DD4747">ifPresent</span>(vendorIdentityOnly -&gt; {
     *     ...
     * });
     * if (entity.entity.<span style="color: #DD4747">isPresent()</span>) {
     *     DbleVendorIdentityOnly vendorIdentityOnly = entity.entity.<span style="color: #DD4747">get()</span>;
     * } else {
     *     ...
     * }
     * </pre>
     * @param cbCall The callback for condition-bean of VendorIdentityOnly. (NotNull)
     * @param loaderCall The callback for referrer loader of VendorIdentityOnly. (NoArgAllowed: then no loading)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get() of return value is called and the value is null, which means entity has already been deleted (point is not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    def selectEntity(cbCall: (VendorIdentityOnlyCB) => Unit)(implicit loaderCall: (LoaderOfVendorIdentityOnly) => Unit = null): Option[VendorIdentityOnly] = {
        return facadeSelectEntity(callbackCB(cbCall))(loaderCall).map(_.toImmutable);
    }

    protected def facadeSelectEntity(cb: VendorIdentityOnlyCB)(loaderCall: (LoaderOfVendorIdentityOnly) => Unit = null): Option[DbleVendorIdentityOnly] = {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity())(loaderCall);
    }

    protected def doSelectEntity[ENTITY <: DbleVendorIdentityOnly](cb: VendorIdentityOnlyCB, tp: Class[_ <: ENTITY])(loaderCall: (LoaderOfVendorIdentityOnly) => Unit = null): ENTITY = {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        val dble = helpSelectEntityInternally(cb, tp);
        if (dble != null) {
            callbackLoader(DfCollectionUtil.newArrayList(dble.asInstanceOf[DbleVendorIdentityOnly]), loaderCall);
        }
        return dble;
    }

    protected def doSelectOptionalEntity[ENTITY <: DbleVendorIdentityOnly](cb: VendorIdentityOnlyCB, tp: Class[_ <: ENTITY])(loaderCall: (LoaderOfVendorIdentityOnly) => Unit = null): Option[ENTITY] = {
        return Option.apply(doSelectEntity(cb, tp)(loaderCall));
    }

    override protected def doReadEntity(cb: ConditionBean): Entity = { facadeSelectEntity(downcast(cb))().orNull }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * VendorIdentityOnlyCB cb = new VendorIdentityOnlyCB();
     * cb.query().setFoo...(value);
     * DbleVendorIdentityOnly vendorIdentityOnly = vendorIdentityOnlyBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = vendorIdentityOnly.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbCall The callback for condition-bean of VendorIdentityOnly. (NotNull)
     * @param loaderCall The callback for referrer loader of VendorIdentityOnly. (NoArgAllowed: then no loading)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (point is not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    def selectEntityWithDeletedCheck(cbCall: (VendorIdentityOnlyCB) => Unit)(implicit loaderCall: (LoaderOfVendorIdentityOnly) => Unit = null): VendorIdentityOnly = {
        return facadeSelectEntityWithDeletedCheck(callbackCB(cbCall))(loaderCall).toImmutable;
    }

    protected def facadeSelectEntityWithDeletedCheck(cb: VendorIdentityOnlyCB)(loaderCall: (LoaderOfVendorIdentityOnly) => Unit = null): DbleVendorIdentityOnly = {
        return doSelectEntityWithDeletedCheck(cb, typeOfSelectedEntity())(loaderCall);
    }

    protected def doSelectEntityWithDeletedCheck[ENTITY <: DbleVendorIdentityOnly](cb: VendorIdentityOnlyCB, tp: Class[ENTITY])(loaderCall: (LoaderOfVendorIdentityOnly) => Unit = null): ENTITY = {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        val dble = helpSelectEntityWithDeletedCheckInternally(cb, tp);
        callbackLoader(DfCollectionUtil.newArrayList(dble.asInstanceOf[DbleVendorIdentityOnly]), loaderCall);
        return dble;
    }

    override protected def doReadEntityWithDeletedCheck(cb: ConditionBean): Entity = { facadeSelectEntityWithDeletedCheck(downcast(cb))() }

    /**
     * Select the entity by the primary-key value.
     * @param identityOnlyId : PK, ID, NotNull, BIGINT(19). (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    def selectByPK(identityOnlyId: Long): Option[VendorIdentityOnly] = {
        return facadeSelectByPK(identityOnlyId).map(_.toImmutable);
    }

    protected def facadeSelectByPK(identityOnlyId: Long): Option[DbleVendorIdentityOnly] = {
        return doSelectByPK(identityOnlyId, typeOfSelectedEntity());
    }

    protected def doSelectByPK[ENTITY <: DbleVendorIdentityOnly](identityOnlyId: Long, tp: Class[_ <: ENTITY]): Option[ENTITY] = {
        return Option.apply(doSelectEntity(xprepareCBAsPK(identityOnlyId), tp)());
    }

    protected def xprepareCBAsPK(identityOnlyId: Long): VendorIdentityOnlyCB = {
        assertObjectNotNull("identityOnlyId", identityOnlyId);
        return newConditionBean().acceptPK(identityOnlyId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * VendorIdentityOnlyCB cb = new VendorIdentityOnlyCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * List&lt;${VendorIdentityOnly}&gt; vendorIdentityOnlyList = vendorIdentityOnlyBhv.<span style="color: #DD4747">selectList</span>(cb);
     * vendorIdentityOnlyList.foreach(vendorIdentityOnly =>
     *     ... = vendorIdentityOnly...;
     * }
     * </pre>
     * @param cbCall The callback for condition-bean of VendorIdentityOnly. (NotNull)
     * @param loaderCall The callback for referrer loader of VendorIdentityOnly. (NoArgAllowed: then no loading)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    def selectList(cbCall: (VendorIdentityOnlyCB) => Unit)(implicit loaderCall: (LoaderOfVendorIdentityOnly) => Unit = null): immutable.List[VendorIdentityOnly] = {
        return toImmutableEntityList(facadeSelectList(callbackCB(cbCall))(loaderCall));
    }

    protected def facadeSelectList(cb: VendorIdentityOnlyCB)(loaderCall: (LoaderOfVendorIdentityOnly) => Unit = null): ListResultBean[DbleVendorIdentityOnly] = {
        return doSelectList(cb, typeOfSelectedEntity())(loaderCall);
    }

    protected def doSelectList[RESULT <: DbleVendorIdentityOnly](cb: VendorIdentityOnlyCB, tp: Class[RESULT])(loaderCall: (LoaderOfVendorIdentityOnly) => Unit = null): ListResultBean[RESULT] = {
        val dbleList = helpSelectListInternally(cb, tp);
        callbackLoader(dbleList.asInstanceOf[List[DbleVendorIdentityOnly]], loaderCall);
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
     * VendorIdentityOnlyCB cb = new VendorIdentityOnlyCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;DbleVendorIdentityOnly&gt; page = vendorIdentityOnlyBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (DbleVendorIdentityOnly vendorIdentityOnly : page) {
     *     ... = vendorIdentityOnly.get...();
     * }
     * </pre>
     * @param cbCall The callback for condition-bean of VendorIdentityOnly. (NotNull)
     * @param loaderCall The callback for referrer loader of VendorIdentityOnly. (NoArgAllowed: then no loading)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    def selectPage(cbCall: (VendorIdentityOnlyCB) => Unit)(implicit loaderCall: (LoaderOfVendorIdentityOnly) => Unit = null): ScrPagingView[VendorIdentityOnly] = {
        return newPagingView(facadeSelectPage(callbackCB(cbCall))(loaderCall));
    }

    protected def facadeSelectPage(cb: VendorIdentityOnlyCB)(loaderCall: (LoaderOfVendorIdentityOnly) => Unit = null): PagingResultBean[DbleVendorIdentityOnly] = {
        return doSelectPage(cb, typeOfSelectedEntity())(loaderCall);
    }

    protected def doSelectPage[RESULT <: DbleVendorIdentityOnly](cb: VendorIdentityOnlyCB, tp: Class[RESULT])(loaderCall: (LoaderOfVendorIdentityOnly) => Unit = null): PagingResultBean[RESULT] = {
        val dbleList = helpSelectPageInternally(cb, tp);
        callbackLoader(dbleList.asInstanceOf[List[DbleVendorIdentityOnly]], loaderCall);
        return dbleList;
    }

    override protected def doReadPage(cb: ConditionBean): PagingResultBean[_ <: Entity] = { facadeSelectPage(downcast(cb))() }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * VendorIdentityOnlyCB cb = new VendorIdentityOnlyCB();
     * cb.query().setFoo...(value);
     * vendorIdentityOnlyBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;DbleVendorIdentityOnly&gt;() {
     *     public void handle(DbleVendorIdentityOnly entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of DbleVendorIdentityOnly. (NotNull)
     * @param entityRowHandler The handler of entity row of DbleVendorIdentityOnly. (NotNull)
     */
    def selectCursor(cbCall: (VendorIdentityOnlyCB) => Unit)(rowCall: (VendorIdentityOnly) => Unit): Unit = {
        facadeSelectCursor(callbackCB(cbCall), new EntityRowHandler[DbleVendorIdentityOnly]() {
            def handle(entity: DbleVendorIdentityOnly): Unit = { rowCall(entity.toImmutable) }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * vendorIdentityOnlyBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(VendorIdentityOnlyCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    def scalarSelect[RESULT](resultType: Class[RESULT]): ScrHpSLSFunction[VendorIdentityOnlyCB, RESULT] = {
        return toScalaSLSFunction[RESULT](facadeScalarSelect(resultType));
    }

    protected def toScalaSLSFunction[RESULT](function: HpSLSFunction[VendorIdentityOnlyCB, RESULT]): ScrHpSLSFunction[VendorIdentityOnlyCB, RESULT] =
    { new ScrHpSLSFunction[VendorIdentityOnlyCB, RESULT](function) }

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
     * Extract the value list of (single) primary key identityOnlyId.
     * @param vendorIdentityOnlyList The list of vendorIdentityOnly. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    def extractIdentityOnlyIdList(vendorIdentityOnlyList: immutable.List[VendorIdentityOnly]): immutable.List[Long] = {
        val plainList = helpExtractListInternally(toDBableEntityList(vendorIdentityOnlyList), "identityOnlyId");
        return toScalaList(plainList).map(_.asInstanceOf[Long]);
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * DbleVendorIdentityOnly vendorIdentityOnly = new DbleVendorIdentityOnly();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * vendorIdentityOnly.setFoo...(value);
     * vendorIdentityOnly.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorIdentityOnly.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorIdentityOnly.set...;</span>
     * vendorIdentityOnlyBhv.<span style="color: #DD4747">insert</span>(vendorIdentityOnly);
     * ... = vendorIdentityOnly.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param entityCall The callback for entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param optionCall The callback for option of insert. (NoArgAllowed: then no option)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    def insert(entityCall: (MbleVendorIdentityOnly) => Unit)(implicit optionCall: (ScrInsertOption[VendorIdentityOnlyCB]) => Unit = null): Unit = {
        assertObjectNotNull("entityCall", entityCall);
        doInsert(callbackMbleEntityToDBable(entityCall), callbackInsertOption(optionCall));
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * DbleVendorIdentityOnly vendorIdentityOnly = new DbleVendorIdentityOnly();
     * vendorIdentityOnly.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * vendorIdentityOnly.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorIdentityOnly.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorIdentityOnly.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * vendorIdentityOnly.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     vendorIdentityOnlyBhv.<span style="color: #DD4747">update</span>(vendorIdentityOnly);
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
    def update(entityCall: (MbleVendorIdentityOnly) => Unit)(implicit optionCall: (ScrUpdateOption[VendorIdentityOnlyCB]) => Unit = null): Unit = {
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
    def insertOrUpdate(entityCall: (MbleVendorIdentityOnly) => Unit)(implicit insertOptionCall: (ScrInsertOption[VendorIdentityOnlyCB]) => Unit = null, updateOptionCall: (ScrUpdateOption[VendorIdentityOnlyCB]) => Unit = null): Unit = {
        doInsertOrUpdate(callbackMbleEntityToDBable(entityCall), callbackInsertOption(insertOptionCall), callbackUpdateOption(updateOptionCall));
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * DbleVendorIdentityOnly vendorIdentityOnly = new DbleVendorIdentityOnly();
     * vendorIdentityOnly.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * vendorIdentityOnly.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     vendorIdentityOnlyBhv.<span style="color: #DD4747">delete</span>(vendorIdentityOnly);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param entityCall The callback for entity of delete. (NotNull, PrimaryKeyNotNull)
     * @param optionCall The callback for option of delete. (NoArgAllowed: then no option)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    def delete(entityCall: (MbleVendorIdentityOnly) => Unit)(implicit optionCall: (ScrDeleteOption[VendorIdentityOnlyCB]) => Unit = null): Unit = {
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
     *     DbleVendorIdentityOnly vendorIdentityOnly = new DbleVendorIdentityOnly();
     *     vendorIdentityOnly.setFooName("foo");
     *     if (...) {
     *         vendorIdentityOnly.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     vendorIdentityOnlyList.add(vendorIdentityOnly);
     * }
     * vendorIdentityOnlyBhv.<span style="color: #DD4747">batchInsert</span>(vendorIdentityOnlyList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param vendorIdentityOnlyList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    def batchInsert(batchCall: (ScrBatchEntityList[MbleVendorIdentityOnly]) => Unit)(implicit optionCall: (ScrInsertOption[VendorIdentityOnlyCB]) => Unit = null): Array[Int] = {
        return doBatchInsert(callbackBatch(batchCall), callbackInsertOption(optionCall));
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     DbleVendorIdentityOnly vendorIdentityOnly = new DbleVendorIdentityOnly();
     *     vendorIdentityOnly.setFooName("foo");
     *     if (...) {
     *         vendorIdentityOnly.setFooPrice(123);
     *     } else {
     *         vendorIdentityOnly.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//vendorIdentityOnly.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     vendorIdentityOnlyList.add(vendorIdentityOnly);
     * }
     * vendorIdentityOnlyBhv.<span style="color: #DD4747">batchUpdate</span>(vendorIdentityOnlyList);
     * </pre>
     * @param vendorIdentityOnlyList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    def batchUpdate(batchCall: (ScrBatchEntityList[MbleVendorIdentityOnly]) => Unit)(implicit optionCall: (ScrUpdateOption[VendorIdentityOnlyCB]) => Unit = null): Array[Int] = {
        return doBatchUpdate(callbackBatch(batchCall), callbackUpdateOption(optionCall));
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param vendorIdentityOnlyList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    def batchDelete(batchCall: (ScrBatchEntityList[MbleVendorIdentityOnly]) => Unit)(implicit optionCall: (ScrDeleteOption[VendorIdentityOnlyCB]) => Unit = null): Array[Int] = {
        return doBatchDelete(callbackBatch(batchCall), callbackDeleteOption(optionCall));
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * vendorIdentityOnlyBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;DbleVendorIdentityOnly, VendorIdentityOnlyCB&gt;() {
     *     public ConditionBean setup(DbleVendorIdentityOnly entity, VendorIdentityOnlyCB intoCB) {
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
    def queryInsert(setupperCall: (MbleVendorIdentityOnly, VendorIdentityOnlyCB) => ConditionBean): Int = {
        return doQueryInsert(callbackQueryInsertSetupper(setupperCall), null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * DbleVendorIdentityOnly vendorIdentityOnly = new DbleVendorIdentityOnly();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendorIdentityOnly.setPK...(value);</span>
     * vendorIdentityOnly.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorIdentityOnly.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorIdentityOnly.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorIdentityOnly.setVersionNo(value);</span>
     * VendorIdentityOnlyCB cb = new VendorIdentityOnlyCB();
     * cb.query().setFoo...(value);
     * vendorIdentityOnlyBhv.<span style="color: #DD4747">queryUpdate</span>(vendorIdentityOnly, cb);
     * </pre>
     * @param entityCall The callback for entity that contains update values. (NotNull)
     * @param cbCall The callback for condition-bean of VendorIdentityOnly. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    def queryUpdate(entityCall: (MbleVendorIdentityOnly) => Unit)(cbCall: (VendorIdentityOnlyCB) => Unit): Int = {
        assertObjectNotNull("entityCall", entityCall); assertObjectNotNull("cbCall", cbCall);
        return doQueryUpdate(callbackMbleEntityToDBable(entityCall), callbackCB(cbCall), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * VendorIdentityOnlyCB cb = new VendorIdentityOnlyCB();
     * cb.query().setFoo...(value);
     * vendorIdentityOnlyBhv.<span style="color: #DD4747">queryDelete</span>(vendorIdentityOnly, cb);
     * </pre>
     * @param cbCall The callback for condition-bean of VendorIdentityOnly. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    def queryDelete(cbCall: (VendorIdentityOnlyCB) => Unit): Int = {
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
    def outsideSql(): ScrOutsideSqlTypedBasicExecutor[VendorIdentityOnlyBhv] = {
        val facadeExecutor: OutsideSqlAllFacadeExecutor[VendorIdentityOnlyBhv] = doOutsideSql();
        return toImmutableOutsideSqlTypedBasicExecutor(facadeExecutor.xbasicExecutor()); // variable to resolve generic type
    }

    protected def toImmutableOutsideSqlTypedBasicExecutor(executor: OutsideSqlBasicExecutor[VendorIdentityOnlyBhv]): ScrOutsideSqlTypedBasicExecutor[VendorIdentityOnlyBhv] =
    { new ScrOutsideSqlTypedBasicExecutor(executor) }

    // ===================================================================================
    //                                                                     Callback Helper
    //                                                                     ===============
    protected def callbackCB(cbCall: (VendorIdentityOnlyCB) => Unit): VendorIdentityOnlyCB = {
        assertObjectNotNull("cbCall", cbCall);
        val cb = newConditionBean(); cbCall(cb); return cb;
    }

    protected def callbackBatch(batchCall: (ScrBatchEntityList[MbleVendorIdentityOnly]) => Unit): List[DbleVendorIdentityOnly] = {
        assertObjectNotNull("batchCall", batchCall);
        val batch = new ScrBatchEntityList[MbleVendorIdentityOnly]();
        val entityList: List[DbleVendorIdentityOnly] = new ArrayList[DbleVendorIdentityOnly]();
        batch.entityCallList.asScala.map { entityCall =>
            val entity = newMbleEntity(); entityCall(entity); entity.toDBable;
        }
        return entityList;
    }

    protected def callbackMbleEntity(entityCall: (MbleVendorIdentityOnly) => Unit): MbleVendorIdentityOnly = {
        assertObjectNotNull("entityCall", entityCall);
        val entity = newMbleEntity(); entityCall(entity); return entity;
    }

    protected def callbackMbleEntityToDBable(entityCall: (MbleVendorIdentityOnly) => Unit): DbleVendorIdentityOnly = {
        return callbackMbleEntity(entityCall).toDBable;
    }

    protected def callbackInsertOption(optionCall: (ScrInsertOption[VendorIdentityOnlyCB]) => Unit): InsertOption[VendorIdentityOnlyCB] = {
        if (optionCall == null) { return null; }
        val option = new ScrInsertOption[VendorIdentityOnlyCB](new InsertOption[VendorIdentityOnlyCB]());
        optionCall(option); return option.toNative;
    }

    protected def callbackUpdateOption(optionCall: (ScrUpdateOption[VendorIdentityOnlyCB]) => Unit): UpdateOption[VendorIdentityOnlyCB] = {
        if (optionCall == null) { return null; }
        val option = new ScrUpdateOption[VendorIdentityOnlyCB](new UpdateOption[VendorIdentityOnlyCB]()); optionCall(option); return option.toNative;
    }

    protected def callbackDeleteOption(optionCall: (ScrDeleteOption[VendorIdentityOnlyCB]) => Unit): DeleteOption[VendorIdentityOnlyCB] = {
        if (optionCall == null) { return null; }
        val option = new ScrDeleteOption[VendorIdentityOnlyCB](new DeleteOption[VendorIdentityOnlyCB]()); optionCall(option); return option.toNative;
    }

    protected def callbackQueryInsertSetupper(setupperCall: (MbleVendorIdentityOnly, VendorIdentityOnlyCB) => ConditionBean): QueryInsertSetupper[DbleVendorIdentityOnly, VendorIdentityOnlyCB] = {
        assertObjectNotNull("setupperCall", setupperCall);
        return new QueryInsertSetupper[DbleVendorIdentityOnly, VendorIdentityOnlyCB]() {
            def setup(entity: DbleVendorIdentityOnly, intoCB: VendorIdentityOnlyCB): ConditionBean = {
                val mble = newMbleEntity();
                val resultCB = setupperCall(mble, intoCB);
                entity.acceptImmutable(mble.toImmutable());
                return resultCB;
            }
        };
    }

    protected def callbackLoader(dbleList: List[DbleVendorIdentityOnly], loaderCall: (LoaderOfVendorIdentityOnly) => Unit = null): Unit = {
        if (loaderCall == null) { return; }
        val loader = new LoaderOfVendorIdentityOnly();
        loader.ready(dbleList.asInstanceOf[List[DbleVendorIdentityOnly]], _behaviorSelector);
        loaderCall(loader);
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    override protected def typeOfSelectedEntity(): Class[DbleVendorIdentityOnly] = { classOf[DbleVendorIdentityOnly] }
    override protected def typeOfHandlingEntity(): Class[DbleVendorIdentityOnly] = { classOf[DbleVendorIdentityOnly] }
    override protected def typeOfHandlingConditionBean(): Class[VendorIdentityOnlyCB] = { classOf[VendorIdentityOnlyCB] }
    protected def newMbleEntity(): MbleVendorIdentityOnly = { new MbleVendorIdentityOnly() }
    protected def newPagingView(rb: PagingResultBean[DbleVendorIdentityOnly]): ScrPagingView[VendorIdentityOnly] =
    { new ScrPagingView(toImmutableEntityList(rb), rb) }

    // ===================================================================================
    //                                                                        Scala Helper
    //                                                                        ============
    protected def toScalaList[ENTITY](javaList: Collection[ENTITY]): immutable.List[ENTITY] = {
        if (javaList == null) { immutable.List() }
        return javaList.toArray.toList.asInstanceOf[immutable.List[ENTITY]];
    }

    def toImmutableEntityList(dbleList: Collection[DbleVendorIdentityOnly]): immutable.List[VendorIdentityOnly] =
    { toScalaList(dbleList).map(new VendorIdentityOnly(_)) }

    def toDBableEntityList(immuList: immutable.List[VendorIdentityOnly]): List[DbleVendorIdentityOnly] =
    { immuList.map(new DbleVendorIdentityOnly().acceptImmutable(_)).asJava }
}
