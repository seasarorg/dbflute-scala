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
 * The behavior of VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF as TABLE. <br />
 * <pre>
 * [primary key]
 *     THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_ID
 *
 * [column]
 *     THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_ID, THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID, THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_DATE, SHORT_DATE
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
 *     VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     vendorTheLongAndWindingTableAndColumn
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
abstract class BsVendorTheLongAndWindingTableAndColumnRefBhv extends AbstractBehaviorWritable[DbleVendorTheLongAndWindingTableAndColumnRef, VendorTheLongAndWindingTableAndColumnRefCB] {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    def getDBMeta(): DBMeta = { return VendorTheLongAndWindingTableAndColumnRefDbm; }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    def newConditionBean(): VendorTheLongAndWindingTableAndColumnRefCB = { return new VendorTheLongAndWindingTableAndColumnRefCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * VendorTheLongAndWindingTableAndColumnRefCB cb = new VendorTheLongAndWindingTableAndColumnRefCB();
     * cb.query().setFoo...(value);
     * int count = vendorTheLongAndWindingTableAndColumnRefBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of DbleVendorTheLongAndWindingTableAndColumnRef. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    def selectCount(cbCall: (VendorTheLongAndWindingTableAndColumnRefCB) => Unit): Int = {
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
     * VendorTheLongAndWindingTableAndColumnRefCB cb = new VendorTheLongAndWindingTableAndColumnRefCB();
     * cb.query().setFoo...(value);
     * OptionalEntity&lt;DbleVendorTheLongAndWindingTableAndColumnRef&gt; entity = vendorTheLongAndWindingTableAndColumnRefBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     *
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * entity.<span style="color: #DD4747">required</span>(vendorTheLongAndWindingTableAndColumnRef -&gt; {
     *     ...
     * });
     * DbleVendorTheLongAndWindingTableAndColumnRef vendorTheLongAndWindingTableAndColumnRef = entity.entity.<span style="color: #DD4747">get()</span>;
     *
     * <span style="color: #3F7E5E">// if it might be no data, ifPresent(), isPresent(), ...</span>
     * entity.<span style="color: #DD4747">ifPresent</span>(vendorTheLongAndWindingTableAndColumnRef -&gt; {
     *     ...
     * });
     * if (entity.entity.<span style="color: #DD4747">isPresent()</span>) {
     *     DbleVendorTheLongAndWindingTableAndColumnRef vendorTheLongAndWindingTableAndColumnRef = entity.entity.<span style="color: #DD4747">get()</span>;
     * } else {
     *     ...
     * }
     * </pre>
     * @param cbCall The callback for condition-bean of VendorTheLongAndWindingTableAndColumnRef. (NotNull)
     * @param loaderCall The callback for referrer loader of VendorTheLongAndWindingTableAndColumnRef. (NoArgAllowed: then no loading)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get() of return value is called and the value is null, which means entity has already been deleted (point is not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    def selectEntity(cbCall: (VendorTheLongAndWindingTableAndColumnRefCB) => Unit)(implicit loaderCall: (LoaderOfVendorTheLongAndWindingTableAndColumnRef) => Unit = null): Option[VendorTheLongAndWindingTableAndColumnRef] = {
        return facadeSelectEntity(callbackCB(cbCall))(loaderCall).map(_.toImmutable);
    }

    protected def facadeSelectEntity(cb: VendorTheLongAndWindingTableAndColumnRefCB)(loaderCall: (LoaderOfVendorTheLongAndWindingTableAndColumnRef) => Unit = null): Option[DbleVendorTheLongAndWindingTableAndColumnRef] = {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity())(loaderCall);
    }

    protected def doSelectEntity[ENTITY <: DbleVendorTheLongAndWindingTableAndColumnRef](cb: VendorTheLongAndWindingTableAndColumnRefCB, tp: Class[_ <: ENTITY])(loaderCall: (LoaderOfVendorTheLongAndWindingTableAndColumnRef) => Unit = null): ENTITY = {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        val dble = helpSelectEntityInternally(cb, tp);
        if (dble != null) {
            callbackLoader(DfCollectionUtil.newArrayList(dble.asInstanceOf[DbleVendorTheLongAndWindingTableAndColumnRef]), loaderCall);
        }
        return dble;
    }

    protected def doSelectOptionalEntity[ENTITY <: DbleVendorTheLongAndWindingTableAndColumnRef](cb: VendorTheLongAndWindingTableAndColumnRefCB, tp: Class[_ <: ENTITY])(loaderCall: (LoaderOfVendorTheLongAndWindingTableAndColumnRef) => Unit = null): Option[ENTITY] = {
        return Option.apply(doSelectEntity(cb, tp)(loaderCall));
    }

    override protected def doReadEntity(cb: ConditionBean): Entity = { facadeSelectEntity(downcast(cb))().orNull }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * VendorTheLongAndWindingTableAndColumnRefCB cb = new VendorTheLongAndWindingTableAndColumnRefCB();
     * cb.query().setFoo...(value);
     * DbleVendorTheLongAndWindingTableAndColumnRef vendorTheLongAndWindingTableAndColumnRef = vendorTheLongAndWindingTableAndColumnRefBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = vendorTheLongAndWindingTableAndColumnRef.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbCall The callback for condition-bean of VendorTheLongAndWindingTableAndColumnRef. (NotNull)
     * @param loaderCall The callback for referrer loader of VendorTheLongAndWindingTableAndColumnRef. (NoArgAllowed: then no loading)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (point is not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    def selectEntityWithDeletedCheck(cbCall: (VendorTheLongAndWindingTableAndColumnRefCB) => Unit)(implicit loaderCall: (LoaderOfVendorTheLongAndWindingTableAndColumnRef) => Unit = null): VendorTheLongAndWindingTableAndColumnRef = {
        return facadeSelectEntityWithDeletedCheck(callbackCB(cbCall))(loaderCall).toImmutable;
    }

    protected def facadeSelectEntityWithDeletedCheck(cb: VendorTheLongAndWindingTableAndColumnRefCB)(loaderCall: (LoaderOfVendorTheLongAndWindingTableAndColumnRef) => Unit = null): DbleVendorTheLongAndWindingTableAndColumnRef = {
        return doSelectEntityWithDeletedCheck(cb, typeOfSelectedEntity())(loaderCall);
    }

    protected def doSelectEntityWithDeletedCheck[ENTITY <: DbleVendorTheLongAndWindingTableAndColumnRef](cb: VendorTheLongAndWindingTableAndColumnRefCB, tp: Class[ENTITY])(loaderCall: (LoaderOfVendorTheLongAndWindingTableAndColumnRef) => Unit = null): ENTITY = {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        val dble = helpSelectEntityWithDeletedCheckInternally(cb, tp);
        callbackLoader(DfCollectionUtil.newArrayList(dble.asInstanceOf[DbleVendorTheLongAndWindingTableAndColumnRef]), loaderCall);
        return dble;
    }

    override protected def doReadEntityWithDeletedCheck(cb: ConditionBean): Entity = { facadeSelectEntityWithDeletedCheck(downcast(cb))() }

    /**
     * Select the entity by the primary-key value.
     * @param theLongAndWindingTableAndColumnRefId : PK, NotNull, BIGINT(19). (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    def selectByPK(theLongAndWindingTableAndColumnRefId: Long): Option[VendorTheLongAndWindingTableAndColumnRef] = {
        return facadeSelectByPK(theLongAndWindingTableAndColumnRefId).map(_.toImmutable);
    }

    protected def facadeSelectByPK(theLongAndWindingTableAndColumnRefId: Long): Option[DbleVendorTheLongAndWindingTableAndColumnRef] = {
        return doSelectByPK(theLongAndWindingTableAndColumnRefId, typeOfSelectedEntity());
    }

    protected def doSelectByPK[ENTITY <: DbleVendorTheLongAndWindingTableAndColumnRef](theLongAndWindingTableAndColumnRefId: Long, tp: Class[_ <: ENTITY]): Option[ENTITY] = {
        return Option.apply(doSelectEntity(xprepareCBAsPK(theLongAndWindingTableAndColumnRefId), tp)());
    }

    protected def xprepareCBAsPK(theLongAndWindingTableAndColumnRefId: Long): VendorTheLongAndWindingTableAndColumnRefCB = {
        assertObjectNotNull("theLongAndWindingTableAndColumnRefId", theLongAndWindingTableAndColumnRefId);
        return newConditionBean().acceptPK(theLongAndWindingTableAndColumnRefId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * VendorTheLongAndWindingTableAndColumnRefCB cb = new VendorTheLongAndWindingTableAndColumnRefCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * List&lt;${VendorTheLongAndWindingTableAndColumnRef}&gt; vendorTheLongAndWindingTableAndColumnRefList = vendorTheLongAndWindingTableAndColumnRefBhv.<span style="color: #DD4747">selectList</span>(cb);
     * vendorTheLongAndWindingTableAndColumnRefList.foreach(vendorTheLongAndWindingTableAndColumnRef =>
     *     ... = vendorTheLongAndWindingTableAndColumnRef...;
     * }
     * </pre>
     * @param cbCall The callback for condition-bean of VendorTheLongAndWindingTableAndColumnRef. (NotNull)
     * @param loaderCall The callback for referrer loader of VendorTheLongAndWindingTableAndColumnRef. (NoArgAllowed: then no loading)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    def selectList(cbCall: (VendorTheLongAndWindingTableAndColumnRefCB) => Unit)(implicit loaderCall: (LoaderOfVendorTheLongAndWindingTableAndColumnRef) => Unit = null): immutable.List[VendorTheLongAndWindingTableAndColumnRef] = {
        return toImmutableEntityList(facadeSelectList(callbackCB(cbCall))(loaderCall));
    }

    protected def facadeSelectList(cb: VendorTheLongAndWindingTableAndColumnRefCB)(loaderCall: (LoaderOfVendorTheLongAndWindingTableAndColumnRef) => Unit = null): ListResultBean[DbleVendorTheLongAndWindingTableAndColumnRef] = {
        return doSelectList(cb, typeOfSelectedEntity())(loaderCall);
    }

    protected def doSelectList[RESULT <: DbleVendorTheLongAndWindingTableAndColumnRef](cb: VendorTheLongAndWindingTableAndColumnRefCB, tp: Class[RESULT])(loaderCall: (LoaderOfVendorTheLongAndWindingTableAndColumnRef) => Unit = null): ListResultBean[RESULT] = {
        val dbleList = helpSelectListInternally(cb, tp);
        callbackLoader(dbleList.asInstanceOf[List[DbleVendorTheLongAndWindingTableAndColumnRef]], loaderCall);
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
     * VendorTheLongAndWindingTableAndColumnRefCB cb = new VendorTheLongAndWindingTableAndColumnRefCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;DbleVendorTheLongAndWindingTableAndColumnRef&gt; page = vendorTheLongAndWindingTableAndColumnRefBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (DbleVendorTheLongAndWindingTableAndColumnRef vendorTheLongAndWindingTableAndColumnRef : page) {
     *     ... = vendorTheLongAndWindingTableAndColumnRef.get...();
     * }
     * </pre>
     * @param cbCall The callback for condition-bean of VendorTheLongAndWindingTableAndColumnRef. (NotNull)
     * @param loaderCall The callback for referrer loader of VendorTheLongAndWindingTableAndColumnRef. (NoArgAllowed: then no loading)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    def selectPage(cbCall: (VendorTheLongAndWindingTableAndColumnRefCB) => Unit)(implicit loaderCall: (LoaderOfVendorTheLongAndWindingTableAndColumnRef) => Unit = null): ScrPagingView[VendorTheLongAndWindingTableAndColumnRef] = {
        return newPagingView(facadeSelectPage(callbackCB(cbCall))(loaderCall));
    }

    protected def facadeSelectPage(cb: VendorTheLongAndWindingTableAndColumnRefCB)(loaderCall: (LoaderOfVendorTheLongAndWindingTableAndColumnRef) => Unit = null): PagingResultBean[DbleVendorTheLongAndWindingTableAndColumnRef] = {
        return doSelectPage(cb, typeOfSelectedEntity())(loaderCall);
    }

    protected def doSelectPage[RESULT <: DbleVendorTheLongAndWindingTableAndColumnRef](cb: VendorTheLongAndWindingTableAndColumnRefCB, tp: Class[RESULT])(loaderCall: (LoaderOfVendorTheLongAndWindingTableAndColumnRef) => Unit = null): PagingResultBean[RESULT] = {
        val dbleList = helpSelectPageInternally(cb, tp);
        callbackLoader(dbleList.asInstanceOf[List[DbleVendorTheLongAndWindingTableAndColumnRef]], loaderCall);
        return dbleList;
    }

    override protected def doReadPage(cb: ConditionBean): PagingResultBean[_ <: Entity] = { facadeSelectPage(downcast(cb))() }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * VendorTheLongAndWindingTableAndColumnRefCB cb = new VendorTheLongAndWindingTableAndColumnRefCB();
     * cb.query().setFoo...(value);
     * vendorTheLongAndWindingTableAndColumnRefBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;DbleVendorTheLongAndWindingTableAndColumnRef&gt;() {
     *     public void handle(DbleVendorTheLongAndWindingTableAndColumnRef entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of DbleVendorTheLongAndWindingTableAndColumnRef. (NotNull)
     * @param entityRowHandler The handler of entity row of DbleVendorTheLongAndWindingTableAndColumnRef. (NotNull)
     */
    def selectCursor(cbCall: (VendorTheLongAndWindingTableAndColumnRefCB) => Unit)(rowCall: (VendorTheLongAndWindingTableAndColumnRef) => Unit): Unit = {
        facadeSelectCursor(callbackCB(cbCall), new EntityRowHandler[DbleVendorTheLongAndWindingTableAndColumnRef]() {
            def handle(entity: DbleVendorTheLongAndWindingTableAndColumnRef): Unit = { rowCall(entity.toImmutable) }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * vendorTheLongAndWindingTableAndColumnRefBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(VendorTheLongAndWindingTableAndColumnRefCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    def scalarSelect[RESULT](resultType: Class[RESULT]): ScrHpSLSFunction[VendorTheLongAndWindingTableAndColumnRefCB, RESULT] = {
        return toScalaSLSFunction[RESULT](facadeScalarSelect(resultType));
    }

    protected def toScalaSLSFunction[RESULT](function: HpSLSFunction[VendorTheLongAndWindingTableAndColumnRefCB, RESULT]): ScrHpSLSFunction[VendorTheLongAndWindingTableAndColumnRefCB, RESULT] =
    { new ScrHpSLSFunction[VendorTheLongAndWindingTableAndColumnRefCB, RESULT](function) }

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
    /**
     * Pull out the list of foreign table 'DbleVendorTheLongAndWindingTableAndColumn'.
     * @param vendorTheLongAndWindingTableAndColumnRefList The list of vendorTheLongAndWindingTableAndColumnRef. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    def pulloutVendorTheLongAndWindingTableAndColumn(vendorTheLongAndWindingTableAndColumnRefList: immutable.List[VendorTheLongAndWindingTableAndColumnRef]): immutable.List[VendorTheLongAndWindingTableAndColumn] = {
        val dbleList = helpPulloutInternally(toDBableEntityList(vendorTheLongAndWindingTableAndColumnRefList), "vendorTheLongAndWindingTableAndColumn");
        return toScalaList(dbleList).map(new VendorTheLongAndWindingTableAndColumn(_));
    }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key theLongAndWindingTableAndColumnRefId.
     * @param vendorTheLongAndWindingTableAndColumnRefList The list of vendorTheLongAndWindingTableAndColumnRef. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    def extractTheLongAndWindingTableAndColumnRefIdList(vendorTheLongAndWindingTableAndColumnRefList: immutable.List[VendorTheLongAndWindingTableAndColumnRef]): immutable.List[Long] = {
        val plainList = helpExtractListInternally(toDBableEntityList(vendorTheLongAndWindingTableAndColumnRefList), "theLongAndWindingTableAndColumnRefId");
        return toScalaList(plainList).map(_.asInstanceOf[Long]);
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * DbleVendorTheLongAndWindingTableAndColumnRef vendorTheLongAndWindingTableAndColumnRef = new DbleVendorTheLongAndWindingTableAndColumnRef();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * vendorTheLongAndWindingTableAndColumnRef.setFoo...(value);
     * vendorTheLongAndWindingTableAndColumnRef.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorTheLongAndWindingTableAndColumnRef.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorTheLongAndWindingTableAndColumnRef.set...;</span>
     * vendorTheLongAndWindingTableAndColumnRefBhv.<span style="color: #DD4747">insert</span>(vendorTheLongAndWindingTableAndColumnRef);
     * ... = vendorTheLongAndWindingTableAndColumnRef.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param entityCall The callback for entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param optionCall The callback for option of insert. (NoArgAllowed: then no option)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    def insert(entityCall: (MbleVendorTheLongAndWindingTableAndColumnRef) => Unit)(implicit optionCall: (ScrInsertOption[VendorTheLongAndWindingTableAndColumnRefCB]) => Unit = null): Unit = {
        assertObjectNotNull("entityCall", entityCall);
        doInsert(callbackMbleEntityToDBable(entityCall), callbackInsertOption(optionCall));
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * DbleVendorTheLongAndWindingTableAndColumnRef vendorTheLongAndWindingTableAndColumnRef = new DbleVendorTheLongAndWindingTableAndColumnRef();
     * vendorTheLongAndWindingTableAndColumnRef.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * vendorTheLongAndWindingTableAndColumnRef.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorTheLongAndWindingTableAndColumnRef.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorTheLongAndWindingTableAndColumnRef.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * vendorTheLongAndWindingTableAndColumnRef.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     vendorTheLongAndWindingTableAndColumnRefBhv.<span style="color: #DD4747">update</span>(vendorTheLongAndWindingTableAndColumnRef);
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
    def update(entityCall: (MbleVendorTheLongAndWindingTableAndColumnRef) => Unit)(implicit optionCall: (ScrUpdateOption[VendorTheLongAndWindingTableAndColumnRefCB]) => Unit = null): Unit = {
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
    def insertOrUpdate(entityCall: (MbleVendorTheLongAndWindingTableAndColumnRef) => Unit)(implicit insertOptionCall: (ScrInsertOption[VendorTheLongAndWindingTableAndColumnRefCB]) => Unit = null, updateOptionCall: (ScrUpdateOption[VendorTheLongAndWindingTableAndColumnRefCB]) => Unit = null): Unit = {
        doInsertOrUpdate(callbackMbleEntityToDBable(entityCall), callbackInsertOption(insertOptionCall), callbackUpdateOption(updateOptionCall));
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * DbleVendorTheLongAndWindingTableAndColumnRef vendorTheLongAndWindingTableAndColumnRef = new DbleVendorTheLongAndWindingTableAndColumnRef();
     * vendorTheLongAndWindingTableAndColumnRef.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * vendorTheLongAndWindingTableAndColumnRef.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     vendorTheLongAndWindingTableAndColumnRefBhv.<span style="color: #DD4747">delete</span>(vendorTheLongAndWindingTableAndColumnRef);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param entityCall The callback for entity of delete. (NotNull, PrimaryKeyNotNull)
     * @param optionCall The callback for option of delete. (NoArgAllowed: then no option)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    def delete(entityCall: (MbleVendorTheLongAndWindingTableAndColumnRef) => Unit)(implicit optionCall: (ScrDeleteOption[VendorTheLongAndWindingTableAndColumnRefCB]) => Unit = null): Unit = {
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
     *     DbleVendorTheLongAndWindingTableAndColumnRef vendorTheLongAndWindingTableAndColumnRef = new DbleVendorTheLongAndWindingTableAndColumnRef();
     *     vendorTheLongAndWindingTableAndColumnRef.setFooName("foo");
     *     if (...) {
     *         vendorTheLongAndWindingTableAndColumnRef.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     vendorTheLongAndWindingTableAndColumnRefList.add(vendorTheLongAndWindingTableAndColumnRef);
     * }
     * vendorTheLongAndWindingTableAndColumnRefBhv.<span style="color: #DD4747">batchInsert</span>(vendorTheLongAndWindingTableAndColumnRefList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param vendorTheLongAndWindingTableAndColumnRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    def batchInsert(batchCall: (ScrBatchEntityList[MbleVendorTheLongAndWindingTableAndColumnRef]) => Unit)(implicit optionCall: (ScrInsertOption[VendorTheLongAndWindingTableAndColumnRefCB]) => Unit = null): Array[Int] = {
        return doBatchInsert(callbackBatch(batchCall), callbackInsertOption(optionCall));
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     DbleVendorTheLongAndWindingTableAndColumnRef vendorTheLongAndWindingTableAndColumnRef = new DbleVendorTheLongAndWindingTableAndColumnRef();
     *     vendorTheLongAndWindingTableAndColumnRef.setFooName("foo");
     *     if (...) {
     *         vendorTheLongAndWindingTableAndColumnRef.setFooPrice(123);
     *     } else {
     *         vendorTheLongAndWindingTableAndColumnRef.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//vendorTheLongAndWindingTableAndColumnRef.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     vendorTheLongAndWindingTableAndColumnRefList.add(vendorTheLongAndWindingTableAndColumnRef);
     * }
     * vendorTheLongAndWindingTableAndColumnRefBhv.<span style="color: #DD4747">batchUpdate</span>(vendorTheLongAndWindingTableAndColumnRefList);
     * </pre>
     * @param vendorTheLongAndWindingTableAndColumnRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    def batchUpdate(batchCall: (ScrBatchEntityList[MbleVendorTheLongAndWindingTableAndColumnRef]) => Unit)(implicit optionCall: (ScrUpdateOption[VendorTheLongAndWindingTableAndColumnRefCB]) => Unit = null): Array[Int] = {
        return doBatchUpdate(callbackBatch(batchCall), callbackUpdateOption(optionCall));
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param vendorTheLongAndWindingTableAndColumnRefList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    def batchDelete(batchCall: (ScrBatchEntityList[MbleVendorTheLongAndWindingTableAndColumnRef]) => Unit)(implicit optionCall: (ScrDeleteOption[VendorTheLongAndWindingTableAndColumnRefCB]) => Unit = null): Array[Int] = {
        return doBatchDelete(callbackBatch(batchCall), callbackDeleteOption(optionCall));
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * vendorTheLongAndWindingTableAndColumnRefBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;DbleVendorTheLongAndWindingTableAndColumnRef, VendorTheLongAndWindingTableAndColumnRefCB&gt;() {
     *     public ConditionBean setup(DbleVendorTheLongAndWindingTableAndColumnRef entity, VendorTheLongAndWindingTableAndColumnRefCB intoCB) {
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
    def queryInsert(setupperCall: (MbleVendorTheLongAndWindingTableAndColumnRef, VendorTheLongAndWindingTableAndColumnRefCB) => ConditionBean): Int = {
        return doQueryInsert(callbackQueryInsertSetupper(setupperCall), null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * DbleVendorTheLongAndWindingTableAndColumnRef vendorTheLongAndWindingTableAndColumnRef = new DbleVendorTheLongAndWindingTableAndColumnRef();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendorTheLongAndWindingTableAndColumnRef.setPK...(value);</span>
     * vendorTheLongAndWindingTableAndColumnRef.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorTheLongAndWindingTableAndColumnRef.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorTheLongAndWindingTableAndColumnRef.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorTheLongAndWindingTableAndColumnRef.setVersionNo(value);</span>
     * VendorTheLongAndWindingTableAndColumnRefCB cb = new VendorTheLongAndWindingTableAndColumnRefCB();
     * cb.query().setFoo...(value);
     * vendorTheLongAndWindingTableAndColumnRefBhv.<span style="color: #DD4747">queryUpdate</span>(vendorTheLongAndWindingTableAndColumnRef, cb);
     * </pre>
     * @param entityCall The callback for entity that contains update values. (NotNull)
     * @param cbCall The callback for condition-bean of VendorTheLongAndWindingTableAndColumnRef. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    def queryUpdate(entityCall: (MbleVendorTheLongAndWindingTableAndColumnRef) => Unit)(cbCall: (VendorTheLongAndWindingTableAndColumnRefCB) => Unit): Int = {
        assertObjectNotNull("entityCall", entityCall); assertObjectNotNull("cbCall", cbCall);
        return doQueryUpdate(callbackMbleEntityToDBable(entityCall), callbackCB(cbCall), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * VendorTheLongAndWindingTableAndColumnRefCB cb = new VendorTheLongAndWindingTableAndColumnRefCB();
     * cb.query().setFoo...(value);
     * vendorTheLongAndWindingTableAndColumnRefBhv.<span style="color: #DD4747">queryDelete</span>(vendorTheLongAndWindingTableAndColumnRef, cb);
     * </pre>
     * @param cbCall The callback for condition-bean of VendorTheLongAndWindingTableAndColumnRef. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    def queryDelete(cbCall: (VendorTheLongAndWindingTableAndColumnRefCB) => Unit): Int = {
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
    def outsideSql(): ScrOutsideSqlTypedBasicExecutor[VendorTheLongAndWindingTableAndColumnRefBhv] = {
        val facadeExecutor: OutsideSqlAllFacadeExecutor[VendorTheLongAndWindingTableAndColumnRefBhv] = doOutsideSql();
        return toImmutableOutsideSqlTypedBasicExecutor(facadeExecutor.xbasicExecutor()); // variable to resolve generic type
    }

    protected def toImmutableOutsideSqlTypedBasicExecutor(executor: OutsideSqlBasicExecutor[VendorTheLongAndWindingTableAndColumnRefBhv]): ScrOutsideSqlTypedBasicExecutor[VendorTheLongAndWindingTableAndColumnRefBhv] =
    { new ScrOutsideSqlTypedBasicExecutor(executor) }

    // ===================================================================================
    //                                                                     Callback Helper
    //                                                                     ===============
    protected def callbackCB(cbCall: (VendorTheLongAndWindingTableAndColumnRefCB) => Unit): VendorTheLongAndWindingTableAndColumnRefCB = {
        assertObjectNotNull("cbCall", cbCall);
        val cb = newConditionBean(); cbCall(cb); return cb;
    }

    protected def callbackBatch(batchCall: (ScrBatchEntityList[MbleVendorTheLongAndWindingTableAndColumnRef]) => Unit): List[DbleVendorTheLongAndWindingTableAndColumnRef] = {
        assertObjectNotNull("batchCall", batchCall);
        val batch = new ScrBatchEntityList[MbleVendorTheLongAndWindingTableAndColumnRef]();
        val entityList: List[DbleVendorTheLongAndWindingTableAndColumnRef] = new ArrayList[DbleVendorTheLongAndWindingTableAndColumnRef]();
        batch.entityCallList.asScala.map { entityCall =>
            val entity = newMbleEntity(); entityCall(entity); entity.toDBable;
        }
        return entityList;
    }

    protected def callbackMbleEntity(entityCall: (MbleVendorTheLongAndWindingTableAndColumnRef) => Unit): MbleVendorTheLongAndWindingTableAndColumnRef = {
        assertObjectNotNull("entityCall", entityCall);
        val entity = newMbleEntity(); entityCall(entity); return entity;
    }

    protected def callbackMbleEntityToDBable(entityCall: (MbleVendorTheLongAndWindingTableAndColumnRef) => Unit): DbleVendorTheLongAndWindingTableAndColumnRef = {
        return callbackMbleEntity(entityCall).toDBable;
    }

    protected def callbackInsertOption(optionCall: (ScrInsertOption[VendorTheLongAndWindingTableAndColumnRefCB]) => Unit): InsertOption[VendorTheLongAndWindingTableAndColumnRefCB] = {
        if (optionCall == null) { return null; }
        val option = new ScrInsertOption[VendorTheLongAndWindingTableAndColumnRefCB](new InsertOption[VendorTheLongAndWindingTableAndColumnRefCB]());
        optionCall(option); return option.toNative;
    }

    protected def callbackUpdateOption(optionCall: (ScrUpdateOption[VendorTheLongAndWindingTableAndColumnRefCB]) => Unit): UpdateOption[VendorTheLongAndWindingTableAndColumnRefCB] = {
        if (optionCall == null) { return null; }
        val option = new ScrUpdateOption[VendorTheLongAndWindingTableAndColumnRefCB](new UpdateOption[VendorTheLongAndWindingTableAndColumnRefCB]()); optionCall(option); return option.toNative;
    }

    protected def callbackDeleteOption(optionCall: (ScrDeleteOption[VendorTheLongAndWindingTableAndColumnRefCB]) => Unit): DeleteOption[VendorTheLongAndWindingTableAndColumnRefCB] = {
        if (optionCall == null) { return null; }
        val option = new ScrDeleteOption[VendorTheLongAndWindingTableAndColumnRefCB](new DeleteOption[VendorTheLongAndWindingTableAndColumnRefCB]()); optionCall(option); return option.toNative;
    }

    protected def callbackQueryInsertSetupper(setupperCall: (MbleVendorTheLongAndWindingTableAndColumnRef, VendorTheLongAndWindingTableAndColumnRefCB) => ConditionBean): QueryInsertSetupper[DbleVendorTheLongAndWindingTableAndColumnRef, VendorTheLongAndWindingTableAndColumnRefCB] = {
        assertObjectNotNull("setupperCall", setupperCall);
        return new QueryInsertSetupper[DbleVendorTheLongAndWindingTableAndColumnRef, VendorTheLongAndWindingTableAndColumnRefCB]() {
            def setup(entity: DbleVendorTheLongAndWindingTableAndColumnRef, intoCB: VendorTheLongAndWindingTableAndColumnRefCB): ConditionBean = {
                val mble = newMbleEntity();
                val resultCB = setupperCall(mble, intoCB);
                entity.acceptImmutable(mble.toImmutable());
                return resultCB;
            }
        };
    }

    protected def callbackLoader(dbleList: List[DbleVendorTheLongAndWindingTableAndColumnRef], loaderCall: (LoaderOfVendorTheLongAndWindingTableAndColumnRef) => Unit = null): Unit = {
        if (loaderCall == null) { return; }
        val loader = new LoaderOfVendorTheLongAndWindingTableAndColumnRef();
        loader.ready(dbleList.asInstanceOf[List[DbleVendorTheLongAndWindingTableAndColumnRef]], _behaviorSelector);
        loaderCall(loader);
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    override protected def typeOfSelectedEntity(): Class[DbleVendorTheLongAndWindingTableAndColumnRef] = { classOf[DbleVendorTheLongAndWindingTableAndColumnRef] }
    override protected def typeOfHandlingEntity(): Class[DbleVendorTheLongAndWindingTableAndColumnRef] = { classOf[DbleVendorTheLongAndWindingTableAndColumnRef] }
    override protected def typeOfHandlingConditionBean(): Class[VendorTheLongAndWindingTableAndColumnRefCB] = { classOf[VendorTheLongAndWindingTableAndColumnRefCB] }
    protected def newMbleEntity(): MbleVendorTheLongAndWindingTableAndColumnRef = { new MbleVendorTheLongAndWindingTableAndColumnRef() }
    protected def newPagingView(rb: PagingResultBean[DbleVendorTheLongAndWindingTableAndColumnRef]): ScrPagingView[VendorTheLongAndWindingTableAndColumnRef] =
    { new ScrPagingView(toImmutableEntityList(rb), rb) }

    // ===================================================================================
    //                                                                        Scala Helper
    //                                                                        ============
    protected def toScalaList[ENTITY](javaList: Collection[ENTITY]): immutable.List[ENTITY] = {
        if (javaList == null) { immutable.List() }
        return javaList.toArray.toList.asInstanceOf[immutable.List[ENTITY]];
    }

    def toImmutableEntityList(dbleList: Collection[DbleVendorTheLongAndWindingTableAndColumnRef]): immutable.List[VendorTheLongAndWindingTableAndColumnRef] =
    { toScalaList(dbleList).map(new VendorTheLongAndWindingTableAndColumnRef(_)) }

    def toDBableEntityList(immuList: immutable.List[VendorTheLongAndWindingTableAndColumnRef]): List[DbleVendorTheLongAndWindingTableAndColumnRef] =
    { immuList.map(new DbleVendorTheLongAndWindingTableAndColumnRef().acceptImmutable(_)).asJava }
}
