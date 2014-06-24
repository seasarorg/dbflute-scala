package com.example.dbflute.scala.dbflute.bsbhv;

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
 * The behavior of VENDOR_PRIMARY_KEY_ONLY as TABLE. <br />
 * <pre>
 * [primary key]
 *     PRIMARY_KEY_ONLY_ID
 *
 * [column]
 *     PRIMARY_KEY_ONLY_ID
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
abstract class BsVendorPrimaryKeyOnlyBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    def getTableDbName(): String = { return "VENDOR_PRIMARY_KEY_ONLY"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    def getDBMeta(): DBMeta = { return VendorPrimaryKeyOnlyDbm; }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    def newEntity(): DbleVendorPrimaryKeyOnly = { return new DbleVendorPrimaryKeyOnly(); }

    /** {@inheritDoc} */
    def newConditionBean(): VendorPrimaryKeyOnlyCB = { return new VendorPrimaryKeyOnlyCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * VendorPrimaryKeyOnlyCB cb = new VendorPrimaryKeyOnlyCB();
     * cb.query().setFoo...(value);
     * int count = vendorPrimaryKeyOnlyBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of DbleVendorPrimaryKeyOnly. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    def selectCount(cbCall: (VendorPrimaryKeyOnlyCB) => Unit): Int = {
        return facadeSelectCount(callbackCB(cbCall));
    }

    protected def facadeSelectCount(cb: VendorPrimaryKeyOnlyCB): Int = {
        return doSelectCountUniquely(cb);
    }

    protected def doSelectCountUniquely(cb: VendorPrimaryKeyOnlyCB): Int = { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected def doSelectCountPlainly(cb: VendorPrimaryKeyOnlyCB): Int = { // called by selectPage(cb)
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
     * VendorPrimaryKeyOnlyCB cb = new VendorPrimaryKeyOnlyCB();
     * cb.query().setFoo...(value);
     * OptionalEntity&lt;DbleVendorPrimaryKeyOnly&gt; entity = vendorPrimaryKeyOnlyBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     *
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * entity.<span style="color: #DD4747">required</span>(vendorPrimaryKeyOnly -&gt; {
     *     ...
     * });
     * DbleVendorPrimaryKeyOnly vendorPrimaryKeyOnly = entity.entity.<span style="color: #DD4747">get()</span>;
     *
     * <span style="color: #3F7E5E">// if it might be no data, ifPresent(), isPresent(), ...</span>
     * entity.<span style="color: #DD4747">ifPresent</span>(vendorPrimaryKeyOnly -&gt; {
     *     ...
     * });
     * if (entity.entity.<span style="color: #DD4747">isPresent()</span>) {
     *     DbleVendorPrimaryKeyOnly vendorPrimaryKeyOnly = entity.entity.<span style="color: #DD4747">get()</span>;
     * } else {
     *     ...
     * }
     * </pre>
     * @param cbCall The callback for condition-bean of VendorPrimaryKeyOnly. (NotNull)
     * @param loaderCall The callback for referrer loader of VendorPrimaryKeyOnly. (NoArgAllowed: then no loading)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get() of return value is called and the value is null, which means entity has already been deleted (point is not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    def selectEntity(cbCall: (VendorPrimaryKeyOnlyCB) => Unit)(implicit loaderCall: (LoaderOfVendorPrimaryKeyOnly) => Unit = null): Option[VendorPrimaryKeyOnly] = {
        return facadeSelectEntity(callbackCB(cbCall))(loaderCall).map(_.toImmutable);
    }

    protected def facadeSelectEntity(cb: VendorPrimaryKeyOnlyCB)(loaderCall: (LoaderOfVendorPrimaryKeyOnly) => Unit = null): Option[DbleVendorPrimaryKeyOnly] = {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity())(loaderCall);
    }

    protected def doSelectEntity[ENTITY <: DbleVendorPrimaryKeyOnly](cb: VendorPrimaryKeyOnlyCB, tp: Class[ENTITY])(loaderCall: (LoaderOfVendorPrimaryKeyOnly) => Unit = null): ENTITY = {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        val dble = helpSelectEntityInternally(cb, tp);
        if (dble != null) {
            callbackLoader(DfCollectionUtil.newArrayList(dble.asInstanceOf[DbleVendorPrimaryKeyOnly]), loaderCall);
        }
        return dble;
    }

    protected def doSelectOptionalEntity[ENTITY <: DbleVendorPrimaryKeyOnly](cb: VendorPrimaryKeyOnlyCB, tp: Class[ENTITY])(loaderCall: (LoaderOfVendorPrimaryKeyOnly) => Unit = null): Option[ENTITY] = {
        return Option.apply(doSelectEntity(cb, tp)(loaderCall));
    }

    protected def doReadEntity(cb: ConditionBean): Entity = { facadeSelectEntity(downcast(cb))().orNull }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * VendorPrimaryKeyOnlyCB cb = new VendorPrimaryKeyOnlyCB();
     * cb.query().setFoo...(value);
     * DbleVendorPrimaryKeyOnly vendorPrimaryKeyOnly = vendorPrimaryKeyOnlyBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = vendorPrimaryKeyOnly.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbCall The callback for condition-bean of VendorPrimaryKeyOnly. (NotNull)
     * @param loaderCall The callback for referrer loader of VendorPrimaryKeyOnly. (NoArgAllowed: then no loading)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (point is not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    def selectEntityWithDeletedCheck(cbCall: (VendorPrimaryKeyOnlyCB) => Unit)(implicit loaderCall: (LoaderOfVendorPrimaryKeyOnly) => Unit = null): VendorPrimaryKeyOnly = {
        return facadeSelectEntityWithDeletedCheck(callbackCB(cbCall))(loaderCall).toImmutable;
    }

    protected def facadeSelectEntityWithDeletedCheck(cb: VendorPrimaryKeyOnlyCB)(loaderCall: (LoaderOfVendorPrimaryKeyOnly) => Unit = null): DbleVendorPrimaryKeyOnly = {
        return doSelectEntityWithDeletedCheck(cb, typeOfSelectedEntity())(loaderCall);
    }

    protected def doSelectEntityWithDeletedCheck[ENTITY <: DbleVendorPrimaryKeyOnly](cb: VendorPrimaryKeyOnlyCB, tp: Class[ENTITY])(loaderCall: (LoaderOfVendorPrimaryKeyOnly) => Unit = null): ENTITY = {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        val dble = helpSelectEntityWithDeletedCheckInternally(cb, tp);
        callbackLoader(DfCollectionUtil.newArrayList(dble.asInstanceOf[DbleVendorPrimaryKeyOnly]), loaderCall);
        return dble;
    }

    protected def doReadEntityWithDeletedCheck(cb: ConditionBean): Entity = { facadeSelectEntityWithDeletedCheck(downcast(cb))() }

    /**
     * Select the entity by the primary-key value.
     * @param primaryKeyOnlyId : PK, NotNull, BIGINT(19). (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    def selectByPK(primaryKeyOnlyId: Long): Option[VendorPrimaryKeyOnly] = {
        return facadeSelectByPK(primaryKeyOnlyId).map(_.toImmutable);
    }

    protected def facadeSelectByPK(primaryKeyOnlyId: Long): Option[DbleVendorPrimaryKeyOnly] = {
        return doSelectByPK(primaryKeyOnlyId, typeOfSelectedEntity());
    }

    protected def doSelectByPK[ENTITY <: DbleVendorPrimaryKeyOnly](primaryKeyOnlyId: Long, tp: Class[ENTITY]): Option[ENTITY] = {
        return Option.apply(doSelectEntity(xprepareCBAsPK(primaryKeyOnlyId), tp)());
    }

    protected def xprepareCBAsPK(primaryKeyOnlyId: Long): VendorPrimaryKeyOnlyCB = {
        assertObjectNotNull("primaryKeyOnlyId", primaryKeyOnlyId);
        return newConditionBean().acceptPK(primaryKeyOnlyId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * VendorPrimaryKeyOnlyCB cb = new VendorPrimaryKeyOnlyCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * List&lt;${VendorPrimaryKeyOnly}&gt; vendorPrimaryKeyOnlyList = vendorPrimaryKeyOnlyBhv.<span style="color: #DD4747">selectList</span>(cb);
     * vendorPrimaryKeyOnlyList.foreach(vendorPrimaryKeyOnly =>
     *     ... = vendorPrimaryKeyOnly...;
     * }
     * </pre>
     * @param cbCall The callback for condition-bean of VendorPrimaryKeyOnly. (NotNull)
     * @param loaderCall The callback for referrer loader of VendorPrimaryKeyOnly. (NoArgAllowed: then no loading)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    def selectList(cbCall: (VendorPrimaryKeyOnlyCB) => Unit)(implicit loaderCall: (LoaderOfVendorPrimaryKeyOnly) => Unit = null): scala.collection.immutable.List[VendorPrimaryKeyOnly] = {
        return toImmutableEntityList(facadeSelectList(callbackCB(cbCall))(loaderCall));
    }

    protected def facadeSelectList(cb: VendorPrimaryKeyOnlyCB)(loaderCall: (LoaderOfVendorPrimaryKeyOnly) => Unit = null): ListResultBean[DbleVendorPrimaryKeyOnly] = {
        return doSelectList(cb, typeOfSelectedEntity())(loaderCall);
    }

    protected def doSelectList[ENTITY <: DbleVendorPrimaryKeyOnly](cb: VendorPrimaryKeyOnlyCB, tp: Class[ENTITY])(loaderCall: (LoaderOfVendorPrimaryKeyOnly) => Unit = null): ListResultBean[ENTITY] = {
        val dbleList = helpSelectListInternally(cb, tp);
        callbackLoader(dbleList.asInstanceOf[List[DbleVendorPrimaryKeyOnly]], loaderCall);
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
     * VendorPrimaryKeyOnlyCB cb = new VendorPrimaryKeyOnlyCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;DbleVendorPrimaryKeyOnly&gt; page = vendorPrimaryKeyOnlyBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (DbleVendorPrimaryKeyOnly vendorPrimaryKeyOnly : page) {
     *     ... = vendorPrimaryKeyOnly.get...();
     * }
     * </pre>
     * @param cbCall The callback for condition-bean of VendorPrimaryKeyOnly. (NotNull)
     * @param loaderCall The callback for referrer loader of VendorPrimaryKeyOnly. (NoArgAllowed: then no loading)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    def selectPage(cbCall: (VendorPrimaryKeyOnlyCB) => Unit)(implicit loaderCall: (LoaderOfVendorPrimaryKeyOnly) => Unit = null): ScrPagingView[VendorPrimaryKeyOnly] = {
        return newPagingView(facadeSelectPage(callbackCB(cbCall))(loaderCall));
    }

    protected def facadeSelectPage(cb: VendorPrimaryKeyOnlyCB)(loaderCall: (LoaderOfVendorPrimaryKeyOnly) => Unit = null): PagingResultBean[DbleVendorPrimaryKeyOnly] = {
        return doSelectPage(cb, typeOfSelectedEntity())(loaderCall);
    }

    protected def doSelectPage[ENTITY <: DbleVendorPrimaryKeyOnly](cb: VendorPrimaryKeyOnlyCB, tp: Class[ENTITY])(loaderCall: (LoaderOfVendorPrimaryKeyOnly) => Unit = null): PagingResultBean[ENTITY] = {
        return helpSelectPageInternally(cb, tp);
    }

    protected def doReadPage(cb: ConditionBean): PagingResultBean[_ <: Entity] = { facadeSelectPage(downcast(cb))() }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * VendorPrimaryKeyOnlyCB cb = new VendorPrimaryKeyOnlyCB();
     * cb.query().setFoo...(value);
     * vendorPrimaryKeyOnlyBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;DbleVendorPrimaryKeyOnly&gt;() {
     *     public void handle(DbleVendorPrimaryKeyOnly entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of DbleVendorPrimaryKeyOnly. (NotNull)
     * @param entityRowHandler The handler of entity row of DbleVendorPrimaryKeyOnly. (NotNull)
     */
    def selectCursor(cbCall: (VendorPrimaryKeyOnlyCB) => Unit)(rowCall: (VendorPrimaryKeyOnly) => Unit): Unit = {
        facadeSelectCursor(callbackCB(cbCall), new EntityRowHandler[DbleVendorPrimaryKeyOnly]() {
            def handle(entity: DbleVendorPrimaryKeyOnly): Unit = { rowCall(entity.toImmutable) }
        });
    }

    protected def facadeSelectCursor(cb: VendorPrimaryKeyOnlyCB, handler: EntityRowHandler[DbleVendorPrimaryKeyOnly]): Unit = {
        doSelectCursor(cb, handler, typeOfSelectedEntity());
    }

    protected def doSelectCursor[ENTITY <: DbleVendorPrimaryKeyOnly](cb: VendorPrimaryKeyOnlyCB, handler: EntityRowHandler[ENTITY], tp: Class[ENTITY]): Unit = {
        helpSelectCursorInternally(cb, handler, tp);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * vendorPrimaryKeyOnlyBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(VendorPrimaryKeyOnlyCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    def scalarSelect[RESULT](resultType: Class[RESULT]): ScrHpSLSFunction[VendorPrimaryKeyOnlyCB, RESULT] = {
        return toScalaSLSFunction[RESULT](facadeScalarSelect(resultType));
    }

    protected def toScalaSLSFunction[RESULT](function: HpSLSFunction[VendorPrimaryKeyOnlyCB, RESULT]): ScrHpSLSFunction[VendorPrimaryKeyOnlyCB, RESULT] =
    { new ScrHpSLSFunction[VendorPrimaryKeyOnlyCB, RESULT](function) }

    protected def facadeScalarSelect[RESULT](resultType: Class[RESULT]): HpSLSFunction[VendorPrimaryKeyOnlyCB, RESULT] = {
        return doScalarSelect(resultType, newConditionBean());
    }

    protected def doScalarSelect[RESULT, CB <: VendorPrimaryKeyOnlyCB](tp: Class[RESULT], cb: CB): HpSLSFunction[CB, RESULT] = {
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
    /**
     * Extract the value list of (single) primary key primaryKeyOnlyId.
     * @param vendorPrimaryKeyOnlyList The list of vendorPrimaryKeyOnly. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    def extractPrimaryKeyOnlyIdList(vendorPrimaryKeyOnlyList: scala.collection.immutable.List[VendorPrimaryKeyOnly]): scala.collection.immutable.List[Long] = {
        val plainList = helpExtractListInternally(toDBableEntityList(vendorPrimaryKeyOnlyList), "primaryKeyOnlyId");
        return toScalaList(plainList).map(_.asInstanceOf[Long]);
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * DbleVendorPrimaryKeyOnly vendorPrimaryKeyOnly = new DbleVendorPrimaryKeyOnly();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * vendorPrimaryKeyOnly.setFoo...(value);
     * vendorPrimaryKeyOnly.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorPrimaryKeyOnly.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorPrimaryKeyOnly.set...;</span>
     * vendorPrimaryKeyOnlyBhv.<span style="color: #DD4747">insert</span>(vendorPrimaryKeyOnly);
     * ... = vendorPrimaryKeyOnly.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param entityCall The callback for entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param optionCall The callback for option of insert. (NoArgAllowed: then no option)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    def insert(entityCall: (MbleVendorPrimaryKeyOnly) => Unit)(implicit optionCall: (ScrInsertOption[VendorPrimaryKeyOnlyCB]) => Unit = null): Unit = {
        assertObjectNotNull("entityCall", entityCall);
        doInsert(callbackMbleEntityToDBable(entityCall), callbackInsertOption(optionCall));
    }

    protected def doInsert(et: DbleVendorPrimaryKeyOnly, op: InsertOption[VendorPrimaryKeyOnlyCB]): Unit = {
        assertObjectNotNull("vendorPrimaryKeyOnly", et); prepareInsertOption(op); delegateInsert(et, op);
    }

    protected def prepareInsertOption(op: InsertOption[VendorPrimaryKeyOnlyCB]): Unit = {
        if (op == null) { return; }
        assertInsertOptionStatus(op);
        if (op.hasSpecifiedInsertColumn()) {
            op.resolveInsertColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    @Override
    protected def doCreate(et: Entity, op: InsertOption[_ <: ConditionBean]): Unit = {
        doInsert(downcast(et), downcast(op));
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * DbleVendorPrimaryKeyOnly vendorPrimaryKeyOnly = new DbleVendorPrimaryKeyOnly();
     * vendorPrimaryKeyOnly.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * vendorPrimaryKeyOnly.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorPrimaryKeyOnly.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorPrimaryKeyOnly.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * vendorPrimaryKeyOnly.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     vendorPrimaryKeyOnlyBhv.<span style="color: #DD4747">update</span>(vendorPrimaryKeyOnly);
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
    def update(entityCall: (MbleVendorPrimaryKeyOnly) => Unit)(implicit optionCall: (ScrUpdateOption[VendorPrimaryKeyOnlyCB]) => Unit = null): Unit = {
        assertObjectNotNull("entityCall", entityCall);
        doUpdate(callbackMbleEntityToDBable(entityCall), callbackUpdateOption(optionCall));
    }

    protected def doUpdate(et: DbleVendorPrimaryKeyOnly, op: UpdateOption[VendorPrimaryKeyOnlyCB]): Unit = {
        assertObjectNotNull("vendorPrimaryKeyOnly", et); prepareUpdateOption(op); helpUpdateInternally(et, op);
    }

    protected def prepareUpdateOption(op: UpdateOption[VendorPrimaryKeyOnlyCB]): Unit = {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) { op.resolveSelfSpecification(createCBForVaryingUpdate()); }
        if (op.hasSpecifiedUpdateColumn()) { op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate()); }
    }

    protected def createCBForVaryingUpdate(): VendorPrimaryKeyOnlyCB =
    { val cb: VendorPrimaryKeyOnlyCB = newConditionBean(); cb.xsetupForVaryingUpdate(); return cb; }

    protected def createCBForSpecifiedUpdate(): VendorPrimaryKeyOnlyCB =
    { val cb: VendorPrimaryKeyOnlyCB = newConditionBean(); cb.xsetupForSpecifiedUpdate(); return cb; }

    protected def doModify(et: Entity, op: UpdateOption[_ <: ConditionBean]): Unit = { doUpdate(downcast(et), downcast(op)) }

    protected def doModifyNonstrict(et: Entity, op: UpdateOption[_ <: ConditionBean]): Unit =
    { doModify(et, op) }

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
    def insertOrUpdate(entityCall: (MbleVendorPrimaryKeyOnly) => Unit)(implicit insertOptionCall: (ScrInsertOption[VendorPrimaryKeyOnlyCB]) => Unit = null, updateOptionCall: (ScrUpdateOption[VendorPrimaryKeyOnlyCB]) => Unit = null): Unit = {
        doInsertOrUpdate(callbackMbleEntityToDBable(entityCall), callbackInsertOption(insertOptionCall), callbackUpdateOption(updateOptionCall));
    }

    protected def doInsertOrUpdate(et: DbleVendorPrimaryKeyOnly, iop: InsertOption[VendorPrimaryKeyOnlyCB], uop: UpdateOption[VendorPrimaryKeyOnlyCB]): Unit = {
        assertObjectNotNull("vendorPrimaryKeyOnly", et); helpInsertOrUpdateInternally(et, iop, uop);
    }

    protected def doCreateOrModify(et: Entity, iop: InsertOption[_ <: ConditionBean], uop: UpdateOption[_ <: ConditionBean]): Unit =
    { doInsertOrUpdate(downcast(et), downcast(iop), downcast(uop)) }

    @Override
    protected def doCreateOrModifyNonstrict(et: Entity, iop: InsertOption[_ <: ConditionBean], uop: UpdateOption[_ <: ConditionBean]): Unit = {
        doCreateOrModify(et, iop, uop);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * DbleVendorPrimaryKeyOnly vendorPrimaryKeyOnly = new DbleVendorPrimaryKeyOnly();
     * vendorPrimaryKeyOnly.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * vendorPrimaryKeyOnly.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     vendorPrimaryKeyOnlyBhv.<span style="color: #DD4747">delete</span>(vendorPrimaryKeyOnly);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param entityCall The callback for entity of delete. (NotNull, PrimaryKeyNotNull)
     * @param optionCall The callback for option of delete. (NoArgAllowed: then no option)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    def delete(entityCall: (MbleVendorPrimaryKeyOnly) => Unit)(implicit optionCall: (ScrDeleteOption[VendorPrimaryKeyOnlyCB]) => Unit = null): Unit = {
        doDelete(callbackMbleEntityToDBable(entityCall), callbackDeleteOption(optionCall));
    }

    protected def doDelete(et: DbleVendorPrimaryKeyOnly, op: DeleteOption[VendorPrimaryKeyOnlyCB]): Unit = {
        assertObjectNotNull("vendorPrimaryKeyOnly", et); prepareDeleteOption(op); helpDeleteInternally(et, op);
    }

    protected def prepareDeleteOption(op: DeleteOption[VendorPrimaryKeyOnlyCB]): Unit = { if (op != null) { assertDeleteOptionStatus(op); } }

    protected def doRemove(et: Entity, op: DeleteOption[_ <: ConditionBean]): Unit = { doDelete(downcast(et), downcast(op)) }

    protected def doRemoveNonstrict(et: Entity, op: DeleteOption[_ <: ConditionBean]): Unit =
    { doRemove(et, op) }

    // ===================================================================================
    //                                                                        Batch Update
    //                                                                        ============
    /**
     * Batch-insert the entity list modified-only of same-set columns. (DefaultConstraintsEnabled) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <p><span style="color: #DD4747; font-size: 120%">The columns of least common multiple are registered like this:</span></p>
     * <pre>
     * for (... : ...) {
     *     DbleVendorPrimaryKeyOnly vendorPrimaryKeyOnly = new DbleVendorPrimaryKeyOnly();
     *     vendorPrimaryKeyOnly.setFooName("foo");
     *     if (...) {
     *         vendorPrimaryKeyOnly.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     vendorPrimaryKeyOnlyList.add(vendorPrimaryKeyOnly);
     * }
     * vendorPrimaryKeyOnlyBhv.<span style="color: #DD4747">batchInsert</span>(vendorPrimaryKeyOnlyList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param vendorPrimaryKeyOnlyList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    def batchInsert(batchCall: (ScrBatchEntityList[MbleVendorPrimaryKeyOnly]) => Unit)(implicit optionCall: (ScrInsertOption[VendorPrimaryKeyOnlyCB]) => Unit = null): Array[Int] = {
        return doBatchInsert(callbackBatch(batchCall), callbackInsertOption(optionCall));
    }

    protected def doBatchInsert(ls: List[DbleVendorPrimaryKeyOnly], op: InsertOption[VendorPrimaryKeyOnlyCB]): Array[Int] = {
        assertObjectNotNull("vendorPrimaryKeyOnlyList", ls);
        val rlop: InsertOption[VendorPrimaryKeyOnlyCB] = if (op != null) { op } else { createPlainInsertOption() }
        prepareBatchInsertOption(ls, op); // required
        return delegateBatchInsert(ls, op);
    }

    protected def prepareBatchInsertOption(ls: List[DbleVendorPrimaryKeyOnly], op: InsertOption[VendorPrimaryKeyOnlyCB]): Unit = {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(ls);
        prepareInsertOption(op);
    }

    protected def doLumpCreate(ls: List[Entity], op: InsertOption[_ <: ConditionBean]): Array[Int] = { doBatchInsert(downcast(ls), downcast(op)) }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     DbleVendorPrimaryKeyOnly vendorPrimaryKeyOnly = new DbleVendorPrimaryKeyOnly();
     *     vendorPrimaryKeyOnly.setFooName("foo");
     *     if (...) {
     *         vendorPrimaryKeyOnly.setFooPrice(123);
     *     } else {
     *         vendorPrimaryKeyOnly.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//vendorPrimaryKeyOnly.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     vendorPrimaryKeyOnlyList.add(vendorPrimaryKeyOnly);
     * }
     * vendorPrimaryKeyOnlyBhv.<span style="color: #DD4747">batchUpdate</span>(vendorPrimaryKeyOnlyList);
     * </pre>
     * @param vendorPrimaryKeyOnlyList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    def batchUpdate(batchCall: (ScrBatchEntityList[MbleVendorPrimaryKeyOnly]) => Unit)(implicit optionCall: (ScrUpdateOption[VendorPrimaryKeyOnlyCB]) => Unit = null): Array[Int] = {
        return doBatchUpdate(callbackBatch(batchCall), callbackUpdateOption(optionCall));
    }

    protected def doBatchUpdate(ls: List[DbleVendorPrimaryKeyOnly], op: UpdateOption[VendorPrimaryKeyOnlyCB]): Array[Int] = {
        assertObjectNotNull("vendorPrimaryKeyOnlyList", ls);
        val rlop: UpdateOption[VendorPrimaryKeyOnlyCB] = if (op != null) { op } else { createPlainUpdateOption() }
        prepareBatchUpdateOption(ls, rlop); // required
        return delegateBatchUpdate(ls, rlop);
    }

    protected def prepareBatchUpdateOption(ls: List[DbleVendorPrimaryKeyOnly], op: UpdateOption[VendorPrimaryKeyOnlyCB]): Unit = {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(ls);
        prepareUpdateOption(op);
    }

    protected def doLumpModify(ls: List[Entity], op: UpdateOption[_ <: ConditionBean]): Array[Int] = { doBatchUpdate(downcast(ls), downcast(op)) }

    protected def doLumpModifyNonstrict(ls: List[Entity], op: UpdateOption[_ <: ConditionBean]): Array[Int] =
    { doLumpModify(ls, op) }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param vendorPrimaryKeyOnlyList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    def batchDelete(batchCall: (ScrBatchEntityList[MbleVendorPrimaryKeyOnly]) => Unit)(implicit optionCall: (ScrDeleteOption[VendorPrimaryKeyOnlyCB]) => Unit = null): Array[Int] = {
        return doBatchDelete(callbackBatch(batchCall), callbackDeleteOption(optionCall));
    }

    protected def doBatchDelete(ls: List[DbleVendorPrimaryKeyOnly], op: DeleteOption[VendorPrimaryKeyOnlyCB]): Array[Int] = {
        assertObjectNotNull("vendorPrimaryKeyOnlyList", ls); prepareDeleteOption(op);
        return delegateBatchDelete(ls, op);
    }

    protected def doLumpRemove(ls: List[Entity], op: DeleteOption[_ <: ConditionBean]): Array[Int] = { doBatchDelete(downcast(ls), downcast(op)) }

    protected def doLumpRemoveNonstrict(ls: List[Entity], op: DeleteOption[_ <: ConditionBean]): Array[Int] =
    { return doLumpRemove(ls, op); }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * vendorPrimaryKeyOnlyBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;DbleVendorPrimaryKeyOnly, VendorPrimaryKeyOnlyCB&gt;() {
     *     public ConditionBean setup(vendorPrimaryKeyOnly entity, VendorPrimaryKeyOnlyCB intoCB) {
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
     * @param setupper The setup-per of query-insert. (NotNull)
     * @return The inserted count.
     */
    def queryInsert(setupper: QueryInsertSetupper[DbleVendorPrimaryKeyOnly, VendorPrimaryKeyOnlyCB]): Int = {
        return doQueryInsert(setupper, null);
    }

    protected def doQueryInsert(sp: QueryInsertSetupper[DbleVendorPrimaryKeyOnly, VendorPrimaryKeyOnlyCB], op: InsertOption[VendorPrimaryKeyOnlyCB]): Int = {
        assertObjectNotNull("setupper", sp); prepareInsertOption(op);
        val et: DbleVendorPrimaryKeyOnly = newEntity();
        val cb: VendorPrimaryKeyOnlyCB = createCBForQueryInsert();
        return delegateQueryInsert(et, cb, sp.setup(et, cb), op);
    }

    protected def createCBForQueryInsert(): VendorPrimaryKeyOnlyCB =
    { val cb: VendorPrimaryKeyOnlyCB = newConditionBean(); cb.xsetupForQueryInsert(); return cb; }

    protected def doRangeCreate(setupper: QueryInsertSetupper[_ <: Entity, _ <: ConditionBean], option: InsertOption[_ <: ConditionBean]): Int =
    { doQueryInsert(downcast(setupper), downcast(option)) }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * DbleVendorPrimaryKeyOnly vendorPrimaryKeyOnly = new DbleVendorPrimaryKeyOnly();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendorPrimaryKeyOnly.setPK...(value);</span>
     * vendorPrimaryKeyOnly.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorPrimaryKeyOnly.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorPrimaryKeyOnly.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorPrimaryKeyOnly.setVersionNo(value);</span>
     * VendorPrimaryKeyOnlyCB cb = new VendorPrimaryKeyOnlyCB();
     * cb.query().setFoo...(value);
     * vendorPrimaryKeyOnlyBhv.<span style="color: #DD4747">queryUpdate</span>(vendorPrimaryKeyOnly, cb);
     * </pre>
     * @param entityCall The callback for entity that contains update values. (NotNull)
     * @param cbCall The callback for condition-bean of VendorPrimaryKeyOnly. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    def queryUpdate(entityCall: (MbleVendorPrimaryKeyOnly) => Unit)(cbCall: (VendorPrimaryKeyOnlyCB) => Unit): Int = {
        assertObjectNotNull("entityCall", entityCall); assertObjectNotNull("cbCall", cbCall);
        return doQueryUpdate(callbackMbleEntityToDBable(entityCall), callbackCB(cbCall), null);
    }

    protected def doQueryUpdate(vendorPrimaryKeyOnly: DbleVendorPrimaryKeyOnly, cb: VendorPrimaryKeyOnlyCB, op: UpdateOption[VendorPrimaryKeyOnlyCB]): Int = {
        assertObjectNotNull("vendorPrimaryKeyOnly", vendorPrimaryKeyOnly); assertCBStateValid(cb); prepareUpdateOption(op);
        return if (checkCountBeforeQueryUpdateIfNeeds(cb)) { delegateQueryUpdate(vendorPrimaryKeyOnly, cb, op) } else { 0 };
    }

    protected def doRangeModify(et: Entity, cb: ConditionBean, op: UpdateOption[_ <: ConditionBean]): Int =
    { doQueryUpdate(downcast(et), downcast(cb), downcast(op)) }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * VendorPrimaryKeyOnlyCB cb = new VendorPrimaryKeyOnlyCB();
     * cb.query().setFoo...(value);
     * vendorPrimaryKeyOnlyBhv.<span style="color: #DD4747">queryDelete</span>(vendorPrimaryKeyOnly, cb);
     * </pre>
     * @param cbCall The callback for condition-bean of VendorPrimaryKeyOnly. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    def queryDelete(cbCall: (VendorPrimaryKeyOnlyCB) => Unit): Int = {
        assertObjectNotNull("cbCall", cbCall);
        return doQueryDelete(callbackCB(cbCall), null);
    }

    protected def doQueryDelete(cb: VendorPrimaryKeyOnlyCB, op: DeleteOption[VendorPrimaryKeyOnlyCB]): Int = {
        assertCBStateValid(cb); prepareDeleteOption(op);
        return if (checkCountBeforeQueryUpdateIfNeeds(cb)) { delegateQueryDelete(cb, op) } else { 0 };
    }

    protected def doRangeRemove(cb: ConditionBean, op: DeleteOption[_ <: ConditionBean]): Int = { doQueryDelete(downcast(cb), downcast(op)) }

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
    def outsideSql(): ScrOutsideSqlBasicExecutor[VendorPrimaryKeyOnlyBhv] = {
        return toImmutableOutsideSqlBasicExecutor(doOutsideSql());
    }

    protected def toImmutableOutsideSqlBasicExecutor(executor: OutsideSqlBasicExecutor[VendorPrimaryKeyOnlyBhv]): ScrOutsideSqlBasicExecutor[VendorPrimaryKeyOnlyBhv] =
    { new ScrOutsideSqlBasicExecutor(executor) }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    protected def callbackCB(cbCall: (VendorPrimaryKeyOnlyCB) => Unit): VendorPrimaryKeyOnlyCB = {
        assertObjectNotNull("cbCall", cbCall);
        val cb = newConditionBean(); cbCall(cb); return cb;
    }

    protected def callbackBatch(batchCall: (ScrBatchEntityList[MbleVendorPrimaryKeyOnly]) => Unit): List[DbleVendorPrimaryKeyOnly] = {
        assertObjectNotNull("batchCall", batchCall);
        val batch = new ScrBatchEntityList[MbleVendorPrimaryKeyOnly]();
        val entityList: List[DbleVendorPrimaryKeyOnly] = new ArrayList[DbleVendorPrimaryKeyOnly]();
        batch.entityCallList.asScala.map { entityCall =>
            val entity = newMbleEntity(); entityCall(entity); entity.toDBable;
        }
        return entityList;
    }

    protected def callbackMbleEntity(entityCall: (MbleVendorPrimaryKeyOnly) => Unit): MbleVendorPrimaryKeyOnly = {
        assertObjectNotNull("entityCall", entityCall);
        val entity = newMbleEntity(); entityCall(entity); return entity;
    }

    protected def callbackMbleEntityToDBable(entityCall: (MbleVendorPrimaryKeyOnly) => Unit): DbleVendorPrimaryKeyOnly = {
        return callbackMbleEntity(entityCall).toDBable;
    }

    protected def callbackInsertOption(optionCall: (ScrInsertOption[VendorPrimaryKeyOnlyCB]) => Unit): InsertOption[VendorPrimaryKeyOnlyCB] = {
        if (optionCall == null) { return null; }
        val option = new ScrInsertOption[VendorPrimaryKeyOnlyCB](new InsertOption[VendorPrimaryKeyOnlyCB]());
        optionCall(option); return option.toNative;
    }

    protected def callbackUpdateOption(optionCall: (ScrUpdateOption[VendorPrimaryKeyOnlyCB]) => Unit): UpdateOption[VendorPrimaryKeyOnlyCB] = {
        if (optionCall == null) { return null; }
        val option = new ScrUpdateOption[VendorPrimaryKeyOnlyCB](new UpdateOption[VendorPrimaryKeyOnlyCB]()); optionCall(option); return option.toNative;
    }

    protected def callbackDeleteOption(optionCall: (ScrDeleteOption[VendorPrimaryKeyOnlyCB]) => Unit): DeleteOption[VendorPrimaryKeyOnlyCB] = {
        if (optionCall == null) { return null; }
        val option = new ScrDeleteOption[VendorPrimaryKeyOnlyCB](new DeleteOption[VendorPrimaryKeyOnlyCB]()); optionCall(option); return option.toNative;
    }

    protected def callbackLoader(dbleList: List[DbleVendorPrimaryKeyOnly], loaderCall: (LoaderOfVendorPrimaryKeyOnly) => Unit = null): Unit = {
        if (loaderCall == null) { return; }
        val loader = new LoaderOfVendorPrimaryKeyOnly();
        loader.ready(dbleList.asInstanceOf[List[DbleVendorPrimaryKeyOnly]], _behaviorSelector);
        loaderCall(loader);
    }

    protected def newMbleEntity(): MbleVendorPrimaryKeyOnly = { new MbleVendorPrimaryKeyOnly() }
    protected def newPagingView(rb: PagingResultBean[DbleVendorPrimaryKeyOnly]): ScrPagingView[VendorPrimaryKeyOnly] =
    { new ScrPagingView(toImmutableEntityList(rb), rb) }

    protected def typeOfSelectedEntity(): Class[DbleVendorPrimaryKeyOnly] = { classOf[DbleVendorPrimaryKeyOnly] }
    protected def downcast(et: Entity): DbleVendorPrimaryKeyOnly = { helpEntityDowncastInternally(et, classOf[DbleVendorPrimaryKeyOnly]) }
    protected def downcast(cb: ConditionBean): VendorPrimaryKeyOnlyCB = { helpConditionBeanDowncastInternally(cb, classOf[VendorPrimaryKeyOnlyCB]) }
    protected def downcast(ls: List[_ <: Entity]): List[DbleVendorPrimaryKeyOnly] = { ls.asInstanceOf[List[DbleVendorPrimaryKeyOnly]] }
    protected def downcast(op: InsertOption[_ <: ConditionBean]): InsertOption[VendorPrimaryKeyOnlyCB] = { op.asInstanceOf[InsertOption[VendorPrimaryKeyOnlyCB]] }
    protected def downcast(op: UpdateOption[_ <: ConditionBean]): UpdateOption[VendorPrimaryKeyOnlyCB] = { op.asInstanceOf[UpdateOption[VendorPrimaryKeyOnlyCB]] }
    protected def downcast(op: DeleteOption[_ <: ConditionBean]): DeleteOption[VendorPrimaryKeyOnlyCB] = { op.asInstanceOf[DeleteOption[VendorPrimaryKeyOnlyCB]] }
    protected def downcast(sp: QueryInsertSetupper[_ <: Entity, _ <: ConditionBean]): QueryInsertSetupper[DbleVendorPrimaryKeyOnly, VendorPrimaryKeyOnlyCB] =
    { sp.asInstanceOf[QueryInsertSetupper[DbleVendorPrimaryKeyOnly, VendorPrimaryKeyOnlyCB]] }

    // ===================================================================================
    //                                                                        Scala Helper
    //                                                                        ============
    protected def toScalaList[ENTITY](javaList: Collection[ENTITY]): scala.collection.immutable.List[ENTITY] = {
        if (javaList == null) { scala.collection.immutable.List() }
        return scala.collection.immutable.List.fromArray(javaList.toArray()).asInstanceOf[scala.collection.immutable.List[ENTITY]];
    }

    def toImmutableEntityList(dbleList: Collection[DbleVendorPrimaryKeyOnly]): scala.collection.immutable.List[VendorPrimaryKeyOnly] =
    { toScalaList(dbleList).map(new VendorPrimaryKeyOnly(_)) }

    def toDBableEntityList(immuList: scala.collection.immutable.List[VendorPrimaryKeyOnly]): List[DbleVendorPrimaryKeyOnly] =
    { immuList.map(new DbleVendorPrimaryKeyOnly().acceptImmutable(_)).asJava }
}
