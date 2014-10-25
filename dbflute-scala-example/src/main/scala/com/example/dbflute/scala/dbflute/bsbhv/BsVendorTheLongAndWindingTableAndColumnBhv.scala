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
 * The behavior of VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN as TABLE. <br />
 * <pre>
 * [primary key]
 *     THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID
 *
 * [column]
 *     THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID, THE_LONG_AND_WINDING_TABLE_AND_COLUMN_NAME, SHORT_NAME, SHORT_SIZE
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
 *     VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     vendorTheLongAndWindingTableAndColumnRefList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
abstract class BsVendorTheLongAndWindingTableAndColumnBhv extends AbstractBehaviorWritable[DbleVendorTheLongAndWindingTableAndColumn, VendorTheLongAndWindingTableAndColumnCB] {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    def getDBMeta(): DBMeta = { return VendorTheLongAndWindingTableAndColumnDbm; }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    def newConditionBean(): VendorTheLongAndWindingTableAndColumnCB = { return new VendorTheLongAndWindingTableAndColumnCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * VendorTheLongAndWindingTableAndColumnCB cb = new VendorTheLongAndWindingTableAndColumnCB();
     * cb.query().setFoo...(value);
     * int count = vendorTheLongAndWindingTableAndColumnBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of DbleVendorTheLongAndWindingTableAndColumn. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    def selectCount(cbCall: (VendorTheLongAndWindingTableAndColumnCB) => Unit): Int = {
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
     * VendorTheLongAndWindingTableAndColumnCB cb = new VendorTheLongAndWindingTableAndColumnCB();
     * cb.query().setFoo...(value);
     * OptionalEntity&lt;DbleVendorTheLongAndWindingTableAndColumn&gt; entity = vendorTheLongAndWindingTableAndColumnBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     *
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * entity.<span style="color: #DD4747">required</span>(vendorTheLongAndWindingTableAndColumn -&gt; {
     *     ...
     * });
     * DbleVendorTheLongAndWindingTableAndColumn vendorTheLongAndWindingTableAndColumn = entity.entity.<span style="color: #DD4747">get()</span>;
     *
     * <span style="color: #3F7E5E">// if it might be no data, ifPresent(), isPresent(), ...</span>
     * entity.<span style="color: #DD4747">ifPresent</span>(vendorTheLongAndWindingTableAndColumn -&gt; {
     *     ...
     * });
     * if (entity.entity.<span style="color: #DD4747">isPresent()</span>) {
     *     DbleVendorTheLongAndWindingTableAndColumn vendorTheLongAndWindingTableAndColumn = entity.entity.<span style="color: #DD4747">get()</span>;
     * } else {
     *     ...
     * }
     * </pre>
     * @param cbCall The callback for condition-bean of VendorTheLongAndWindingTableAndColumn. (NotNull)
     * @param loaderCall The callback for referrer loader of VendorTheLongAndWindingTableAndColumn. (NoArgAllowed: then no loading)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get() of return value is called and the value is null, which means entity has already been deleted (point is not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    def selectEntity(cbCall: (VendorTheLongAndWindingTableAndColumnCB) => Unit)(implicit loaderCall: (LoaderOfVendorTheLongAndWindingTableAndColumn) => Unit = null): Option[VendorTheLongAndWindingTableAndColumn] = {
        return facadeSelectEntity(callbackCB(cbCall))(loaderCall).map(_.toImmutable);
    }

    protected def facadeSelectEntity(cb: VendorTheLongAndWindingTableAndColumnCB)(loaderCall: (LoaderOfVendorTheLongAndWindingTableAndColumn) => Unit = null): Option[DbleVendorTheLongAndWindingTableAndColumn] = {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity())(loaderCall);
    }

    protected def doSelectEntity[ENTITY <: DbleVendorTheLongAndWindingTableAndColumn](cb: VendorTheLongAndWindingTableAndColumnCB, tp: Class[_ <: ENTITY])(loaderCall: (LoaderOfVendorTheLongAndWindingTableAndColumn) => Unit = null): ENTITY = {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        val dble = helpSelectEntityInternally(cb, tp);
        if (dble != null) {
            callbackLoader(DfCollectionUtil.newArrayList(dble.asInstanceOf[DbleVendorTheLongAndWindingTableAndColumn]), loaderCall);
        }
        return dble;
    }

    protected def doSelectOptionalEntity[ENTITY <: DbleVendorTheLongAndWindingTableAndColumn](cb: VendorTheLongAndWindingTableAndColumnCB, tp: Class[_ <: ENTITY])(loaderCall: (LoaderOfVendorTheLongAndWindingTableAndColumn) => Unit = null): Option[ENTITY] = {
        return Option.apply(doSelectEntity(cb, tp)(loaderCall));
    }

    override protected def doReadEntity(cb: ConditionBean): Entity = { facadeSelectEntity(downcast(cb))().orNull }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * VendorTheLongAndWindingTableAndColumnCB cb = new VendorTheLongAndWindingTableAndColumnCB();
     * cb.query().setFoo...(value);
     * DbleVendorTheLongAndWindingTableAndColumn vendorTheLongAndWindingTableAndColumn = vendorTheLongAndWindingTableAndColumnBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = vendorTheLongAndWindingTableAndColumn.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbCall The callback for condition-bean of VendorTheLongAndWindingTableAndColumn. (NotNull)
     * @param loaderCall The callback for referrer loader of VendorTheLongAndWindingTableAndColumn. (NoArgAllowed: then no loading)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (point is not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    def selectEntityWithDeletedCheck(cbCall: (VendorTheLongAndWindingTableAndColumnCB) => Unit)(implicit loaderCall: (LoaderOfVendorTheLongAndWindingTableAndColumn) => Unit = null): VendorTheLongAndWindingTableAndColumn = {
        return facadeSelectEntityWithDeletedCheck(callbackCB(cbCall))(loaderCall).toImmutable;
    }

    protected def facadeSelectEntityWithDeletedCheck(cb: VendorTheLongAndWindingTableAndColumnCB)(loaderCall: (LoaderOfVendorTheLongAndWindingTableAndColumn) => Unit = null): DbleVendorTheLongAndWindingTableAndColumn = {
        return doSelectEntityWithDeletedCheck(cb, typeOfSelectedEntity())(loaderCall);
    }

    protected def doSelectEntityWithDeletedCheck[ENTITY <: DbleVendorTheLongAndWindingTableAndColumn](cb: VendorTheLongAndWindingTableAndColumnCB, tp: Class[ENTITY])(loaderCall: (LoaderOfVendorTheLongAndWindingTableAndColumn) => Unit = null): ENTITY = {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        val dble = helpSelectEntityWithDeletedCheckInternally(cb, tp);
        callbackLoader(DfCollectionUtil.newArrayList(dble.asInstanceOf[DbleVendorTheLongAndWindingTableAndColumn]), loaderCall);
        return dble;
    }

    override protected def doReadEntityWithDeletedCheck(cb: ConditionBean): Entity = { facadeSelectEntityWithDeletedCheck(downcast(cb))() }

    /**
     * Select the entity by the primary-key value.
     * @param theLongAndWindingTableAndColumnId : PK, NotNull, BIGINT(19). (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    def selectByPK(theLongAndWindingTableAndColumnId: Long): Option[VendorTheLongAndWindingTableAndColumn] = {
        return facadeSelectByPK(theLongAndWindingTableAndColumnId).map(_.toImmutable);
    }

    protected def facadeSelectByPK(theLongAndWindingTableAndColumnId: Long): Option[DbleVendorTheLongAndWindingTableAndColumn] = {
        return doSelectByPK(theLongAndWindingTableAndColumnId, typeOfSelectedEntity());
    }

    protected def doSelectByPK[ENTITY <: DbleVendorTheLongAndWindingTableAndColumn](theLongAndWindingTableAndColumnId: Long, tp: Class[_ <: ENTITY]): Option[ENTITY] = {
        return Option.apply(doSelectEntity(xprepareCBAsPK(theLongAndWindingTableAndColumnId), tp)());
    }

    protected def xprepareCBAsPK(theLongAndWindingTableAndColumnId: Long): VendorTheLongAndWindingTableAndColumnCB = {
        assertObjectNotNull("theLongAndWindingTableAndColumnId", theLongAndWindingTableAndColumnId);
        return newConditionBean().acceptPK(theLongAndWindingTableAndColumnId);
    }

    /**
     * Select the entity by the unique-key value.
     * @param theLongAndWindingTableAndColumnName : UQ, NotNull, VARCHAR(200). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    def selectByUniqueOf(theLongAndWindingTableAndColumnName: String): Option[VendorTheLongAndWindingTableAndColumn] = {
        return facadeSelectByUniqueOf(theLongAndWindingTableAndColumnName).map(_.toImmutable);
    }

    protected def facadeSelectByUniqueOf(theLongAndWindingTableAndColumnName: String): Option[DbleVendorTheLongAndWindingTableAndColumn] = {
        return doSelectByUniqueOf(theLongAndWindingTableAndColumnName, typeOfSelectedEntity());
    }

    protected def doSelectByUniqueOf[ENTITY <: DbleVendorTheLongAndWindingTableAndColumn](theLongAndWindingTableAndColumnName: String, tp: Class[_ <: ENTITY]): Option[ENTITY] = {
        return Option.apply(doSelectEntity(xprepareCBAsUniqueOf(theLongAndWindingTableAndColumnName), tp)());
    }

    protected def xprepareCBAsUniqueOf(theLongAndWindingTableAndColumnName: String): VendorTheLongAndWindingTableAndColumnCB = {
        assertObjectNotNull("theLongAndWindingTableAndColumnName", theLongAndWindingTableAndColumnName);
        return newConditionBean().acceptUniqueOf(theLongAndWindingTableAndColumnName);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * VendorTheLongAndWindingTableAndColumnCB cb = new VendorTheLongAndWindingTableAndColumnCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * List&lt;${VendorTheLongAndWindingTableAndColumn}&gt; vendorTheLongAndWindingTableAndColumnList = vendorTheLongAndWindingTableAndColumnBhv.<span style="color: #DD4747">selectList</span>(cb);
     * vendorTheLongAndWindingTableAndColumnList.foreach(vendorTheLongAndWindingTableAndColumn =>
     *     ... = vendorTheLongAndWindingTableAndColumn...;
     * }
     * </pre>
     * @param cbCall The callback for condition-bean of VendorTheLongAndWindingTableAndColumn. (NotNull)
     * @param loaderCall The callback for referrer loader of VendorTheLongAndWindingTableAndColumn. (NoArgAllowed: then no loading)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    def selectList(cbCall: (VendorTheLongAndWindingTableAndColumnCB) => Unit)(implicit loaderCall: (LoaderOfVendorTheLongAndWindingTableAndColumn) => Unit = null): immutable.List[VendorTheLongAndWindingTableAndColumn] = {
        return toImmutableEntityList(facadeSelectList(callbackCB(cbCall))(loaderCall));
    }

    protected def facadeSelectList(cb: VendorTheLongAndWindingTableAndColumnCB)(loaderCall: (LoaderOfVendorTheLongAndWindingTableAndColumn) => Unit = null): ListResultBean[DbleVendorTheLongAndWindingTableAndColumn] = {
        return doSelectList(cb, typeOfSelectedEntity())(loaderCall);
    }

    protected def doSelectList[RESULT <: DbleVendorTheLongAndWindingTableAndColumn](cb: VendorTheLongAndWindingTableAndColumnCB, tp: Class[RESULT])(loaderCall: (LoaderOfVendorTheLongAndWindingTableAndColumn) => Unit = null): ListResultBean[RESULT] = {
        val dbleList = helpSelectListInternally(cb, tp);
        callbackLoader(dbleList.asInstanceOf[List[DbleVendorTheLongAndWindingTableAndColumn]], loaderCall);
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
     * VendorTheLongAndWindingTableAndColumnCB cb = new VendorTheLongAndWindingTableAndColumnCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;DbleVendorTheLongAndWindingTableAndColumn&gt; page = vendorTheLongAndWindingTableAndColumnBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (DbleVendorTheLongAndWindingTableAndColumn vendorTheLongAndWindingTableAndColumn : page) {
     *     ... = vendorTheLongAndWindingTableAndColumn.get...();
     * }
     * </pre>
     * @param cbCall The callback for condition-bean of VendorTheLongAndWindingTableAndColumn. (NotNull)
     * @param loaderCall The callback for referrer loader of VendorTheLongAndWindingTableAndColumn. (NoArgAllowed: then no loading)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    def selectPage(cbCall: (VendorTheLongAndWindingTableAndColumnCB) => Unit)(implicit loaderCall: (LoaderOfVendorTheLongAndWindingTableAndColumn) => Unit = null): ScrPagingView[VendorTheLongAndWindingTableAndColumn] = {
        return newPagingView(facadeSelectPage(callbackCB(cbCall))(loaderCall));
    }

    protected def facadeSelectPage(cb: VendorTheLongAndWindingTableAndColumnCB)(loaderCall: (LoaderOfVendorTheLongAndWindingTableAndColumn) => Unit = null): PagingResultBean[DbleVendorTheLongAndWindingTableAndColumn] = {
        return doSelectPage(cb, typeOfSelectedEntity())(loaderCall);
    }

    protected def doSelectPage[RESULT <: DbleVendorTheLongAndWindingTableAndColumn](cb: VendorTheLongAndWindingTableAndColumnCB, tp: Class[RESULT])(loaderCall: (LoaderOfVendorTheLongAndWindingTableAndColumn) => Unit = null): PagingResultBean[RESULT] = {
        val dbleList = helpSelectPageInternally(cb, tp);
        callbackLoader(dbleList.asInstanceOf[List[DbleVendorTheLongAndWindingTableAndColumn]], loaderCall);
        return dbleList;
    }

    override protected def doReadPage(cb: ConditionBean): PagingResultBean[_ <: Entity] = { facadeSelectPage(downcast(cb))() }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * VendorTheLongAndWindingTableAndColumnCB cb = new VendorTheLongAndWindingTableAndColumnCB();
     * cb.query().setFoo...(value);
     * vendorTheLongAndWindingTableAndColumnBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;DbleVendorTheLongAndWindingTableAndColumn&gt;() {
     *     public void handle(DbleVendorTheLongAndWindingTableAndColumn entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of DbleVendorTheLongAndWindingTableAndColumn. (NotNull)
     * @param entityRowHandler The handler of entity row of DbleVendorTheLongAndWindingTableAndColumn. (NotNull)
     */
    def selectCursor(cbCall: (VendorTheLongAndWindingTableAndColumnCB) => Unit)(rowCall: (VendorTheLongAndWindingTableAndColumn) => Unit): Unit = {
        facadeSelectCursor(callbackCB(cbCall), new EntityRowHandler[DbleVendorTheLongAndWindingTableAndColumn]() {
            def handle(entity: DbleVendorTheLongAndWindingTableAndColumn): Unit = { rowCall(entity.toImmutable) }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * vendorTheLongAndWindingTableAndColumnBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(VendorTheLongAndWindingTableAndColumnCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    def scalarSelect[RESULT](resultType: Class[RESULT]): ScrHpSLSFunction[VendorTheLongAndWindingTableAndColumnCB, RESULT] = {
        return toScalaSLSFunction[RESULT](facadeScalarSelect(resultType));
    }

    protected def toScalaSLSFunction[RESULT](function: HpSLSFunction[VendorTheLongAndWindingTableAndColumnCB, RESULT]): ScrHpSLSFunction[VendorTheLongAndWindingTableAndColumnCB, RESULT] =
    { new ScrHpSLSFunction[VendorTheLongAndWindingTableAndColumnCB, RESULT](function) }

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
     * Load referrer of vendorTheLongAndWindingTableAndColumnRefList by the set-upper of referrer. <br />
     * VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF by THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID, named 'vendorTheLongAndWindingTableAndColumnRefList'.
     * <pre>
     * vendorTheLongAndWindingTableAndColumnBhv.<span style="color: #DD4747">loadVendorTheLongAndWindingTableAndColumnRefList</span>(vendorTheLongAndWindingTableAndColumnList, new ReferrerConditionSetupper&lt;VendorTheLongAndWindingTableAndColumnRefCB&gt;() {
     *     public void setup(VendorTheLongAndWindingTableAndColumnRefCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * for (DbleVendorTheLongAndWindingTableAndColumn vendorTheLongAndWindingTableAndColumn : vendorTheLongAndWindingTableAndColumnList) {
     *     ... = vendorTheLongAndWindingTableAndColumn.<span style="color: #DD4747">getVendorTheLongAndWindingTableAndColumnRefList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setTheLongAndWindingTableAndColumnId_InScope(pkList);
     * cb.query().addOrderBy_TheLongAndWindingTableAndColumnId_Asc();
     * </pre>
     * @param vendorTheLongAndWindingTableAndColumnList The entity list of vendorTheLongAndWindingTableAndColumn. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    def loadVendorTheLongAndWindingTableAndColumnRefList(vendorTheLongAndWindingTableAndColumnList: List[DbleVendorTheLongAndWindingTableAndColumn], setupCall: (VendorTheLongAndWindingTableAndColumnRefCB) => Unit): NestedReferrerListGateway[DbleVendorTheLongAndWindingTableAndColumnRef] = {
        assertObjectNotNull("vendorTheLongAndWindingTableAndColumnList", vendorTheLongAndWindingTableAndColumnList); assertObjectNotNull("setupCall", setupCall);
        val setupper = new ReferrerConditionSetupper[VendorTheLongAndWindingTableAndColumnRefCB]() { def setup(referrerCB: VendorTheLongAndWindingTableAndColumnRefCB): Unit = { setupCall(referrerCB); } }
        return doLoadVendorTheLongAndWindingTableAndColumnRefList(vendorTheLongAndWindingTableAndColumnList, new LoadReferrerOption[VendorTheLongAndWindingTableAndColumnRefCB, DbleVendorTheLongAndWindingTableAndColumnRef]().xinit(setupper));
    }

    /**
     * Load referrer of vendorTheLongAndWindingTableAndColumnRefList by the set-upper of referrer. <br />
     * VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF by THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID, named 'vendorTheLongAndWindingTableAndColumnRefList'.
     * <pre>
     * vendorTheLongAndWindingTableAndColumnBhv.<span style="color: #DD4747">loadVendorTheLongAndWindingTableAndColumnRefList</span>(vendorTheLongAndWindingTableAndColumnList, new ReferrerConditionSetupper&lt;VendorTheLongAndWindingTableAndColumnRefCB&gt;() {
     *     public void setup(VendorTheLongAndWindingTableAndColumnRefCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = vendorTheLongAndWindingTableAndColumn.<span style="color: #DD4747">getVendorTheLongAndWindingTableAndColumnRefList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setTheLongAndWindingTableAndColumnId_InScope(pkList);
     * cb.query().addOrderBy_TheLongAndWindingTableAndColumnId_Asc();
     * </pre>
     * @param vendorTheLongAndWindingTableAndColumn The entity of vendorTheLongAndWindingTableAndColumn. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    def loadVendorTheLongAndWindingTableAndColumnRefList(vendorTheLongAndWindingTableAndColumn: DbleVendorTheLongAndWindingTableAndColumn, setupCall: (VendorTheLongAndWindingTableAndColumnRefCB) => Unit): NestedReferrerListGateway[DbleVendorTheLongAndWindingTableAndColumnRef] = {
        assertObjectNotNull("vendorTheLongAndWindingTableAndColumn", vendorTheLongAndWindingTableAndColumn); assertObjectNotNull("setupCall", setupCall);
        val setupper = new ReferrerConditionSetupper[VendorTheLongAndWindingTableAndColumnRefCB]() { def setup(referrerCB: VendorTheLongAndWindingTableAndColumnRefCB): Unit = { setupCall(referrerCB); } }
        return doLoadVendorTheLongAndWindingTableAndColumnRefList(xnewLRLs(vendorTheLongAndWindingTableAndColumn), new LoadReferrerOption[VendorTheLongAndWindingTableAndColumnRefCB, DbleVendorTheLongAndWindingTableAndColumnRef]().xinit(setupper));
    }

    protected def doLoadVendorTheLongAndWindingTableAndColumnRefList(vendorTheLongAndWindingTableAndColumnList: List[DbleVendorTheLongAndWindingTableAndColumn], option: LoadReferrerOption[VendorTheLongAndWindingTableAndColumnRefCB, DbleVendorTheLongAndWindingTableAndColumnRef]): NestedReferrerListGateway[DbleVendorTheLongAndWindingTableAndColumnRef] = {
        return helpLoadReferrerInternally(vendorTheLongAndWindingTableAndColumnList, option, "vendorTheLongAndWindingTableAndColumnRefList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key theLongAndWindingTableAndColumnId.
     * @param vendorTheLongAndWindingTableAndColumnList The list of vendorTheLongAndWindingTableAndColumn. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    def extractTheLongAndWindingTableAndColumnIdList(vendorTheLongAndWindingTableAndColumnList: immutable.List[VendorTheLongAndWindingTableAndColumn]): immutable.List[Long] = {
        val plainList = helpExtractListInternally(toDBableEntityList(vendorTheLongAndWindingTableAndColumnList), "theLongAndWindingTableAndColumnId");
        return toScalaList(plainList).map(_.asInstanceOf[Long]);
    }

    /**
     * Extract the value list of (single) unique key theLongAndWindingTableAndColumnName.
     * @param vendorTheLongAndWindingTableAndColumnList The list of vendorTheLongAndWindingTableAndColumn. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    def extractTheLongAndWindingTableAndColumnNameList(vendorTheLongAndWindingTableAndColumnList: immutable.List[VendorTheLongAndWindingTableAndColumn]): immutable.List[String] = {
        val plainList = helpExtractListInternally(toDBableEntityList(vendorTheLongAndWindingTableAndColumnList), "theLongAndWindingTableAndColumnName");
        return toScalaList(plainList).map(_.asInstanceOf[String]);
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * DbleVendorTheLongAndWindingTableAndColumn vendorTheLongAndWindingTableAndColumn = new DbleVendorTheLongAndWindingTableAndColumn();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * vendorTheLongAndWindingTableAndColumn.setFoo...(value);
     * vendorTheLongAndWindingTableAndColumn.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorTheLongAndWindingTableAndColumn.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorTheLongAndWindingTableAndColumn.set...;</span>
     * vendorTheLongAndWindingTableAndColumnBhv.<span style="color: #DD4747">insert</span>(vendorTheLongAndWindingTableAndColumn);
     * ... = vendorTheLongAndWindingTableAndColumn.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param entityCall The callback for entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param optionCall The callback for option of insert. (NoArgAllowed: then no option)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    def insert(entityCall: (MbleVendorTheLongAndWindingTableAndColumn) => Unit)(implicit optionCall: (ScrInsertOption[VendorTheLongAndWindingTableAndColumnCB]) => Unit = null): Unit = {
        assertObjectNotNull("entityCall", entityCall);
        doInsert(callbackMbleEntityToDBable(entityCall), callbackInsertOption(optionCall));
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * DbleVendorTheLongAndWindingTableAndColumn vendorTheLongAndWindingTableAndColumn = new DbleVendorTheLongAndWindingTableAndColumn();
     * vendorTheLongAndWindingTableAndColumn.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * vendorTheLongAndWindingTableAndColumn.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorTheLongAndWindingTableAndColumn.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorTheLongAndWindingTableAndColumn.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * vendorTheLongAndWindingTableAndColumn.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     vendorTheLongAndWindingTableAndColumnBhv.<span style="color: #DD4747">update</span>(vendorTheLongAndWindingTableAndColumn);
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
    def update(entityCall: (MbleVendorTheLongAndWindingTableAndColumn) => Unit)(implicit optionCall: (ScrUpdateOption[VendorTheLongAndWindingTableAndColumnCB]) => Unit = null): Unit = {
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
    def insertOrUpdate(entityCall: (MbleVendorTheLongAndWindingTableAndColumn) => Unit)(implicit insertOptionCall: (ScrInsertOption[VendorTheLongAndWindingTableAndColumnCB]) => Unit = null, updateOptionCall: (ScrUpdateOption[VendorTheLongAndWindingTableAndColumnCB]) => Unit = null): Unit = {
        doInsertOrUpdate(callbackMbleEntityToDBable(entityCall), callbackInsertOption(insertOptionCall), callbackUpdateOption(updateOptionCall));
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * DbleVendorTheLongAndWindingTableAndColumn vendorTheLongAndWindingTableAndColumn = new DbleVendorTheLongAndWindingTableAndColumn();
     * vendorTheLongAndWindingTableAndColumn.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * vendorTheLongAndWindingTableAndColumn.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     vendorTheLongAndWindingTableAndColumnBhv.<span style="color: #DD4747">delete</span>(vendorTheLongAndWindingTableAndColumn);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param entityCall The callback for entity of delete. (NotNull, PrimaryKeyNotNull)
     * @param optionCall The callback for option of delete. (NoArgAllowed: then no option)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    def delete(entityCall: (MbleVendorTheLongAndWindingTableAndColumn) => Unit)(implicit optionCall: (ScrDeleteOption[VendorTheLongAndWindingTableAndColumnCB]) => Unit = null): Unit = {
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
     *     DbleVendorTheLongAndWindingTableAndColumn vendorTheLongAndWindingTableAndColumn = new DbleVendorTheLongAndWindingTableAndColumn();
     *     vendorTheLongAndWindingTableAndColumn.setFooName("foo");
     *     if (...) {
     *         vendorTheLongAndWindingTableAndColumn.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     vendorTheLongAndWindingTableAndColumnList.add(vendorTheLongAndWindingTableAndColumn);
     * }
     * vendorTheLongAndWindingTableAndColumnBhv.<span style="color: #DD4747">batchInsert</span>(vendorTheLongAndWindingTableAndColumnList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param vendorTheLongAndWindingTableAndColumnList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    def batchInsert(batchCall: (ScrBatchEntityList[MbleVendorTheLongAndWindingTableAndColumn]) => Unit)(implicit optionCall: (ScrInsertOption[VendorTheLongAndWindingTableAndColumnCB]) => Unit = null): Array[Int] = {
        return doBatchInsert(callbackBatch(batchCall), callbackInsertOption(optionCall));
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     DbleVendorTheLongAndWindingTableAndColumn vendorTheLongAndWindingTableAndColumn = new DbleVendorTheLongAndWindingTableAndColumn();
     *     vendorTheLongAndWindingTableAndColumn.setFooName("foo");
     *     if (...) {
     *         vendorTheLongAndWindingTableAndColumn.setFooPrice(123);
     *     } else {
     *         vendorTheLongAndWindingTableAndColumn.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//vendorTheLongAndWindingTableAndColumn.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     vendorTheLongAndWindingTableAndColumnList.add(vendorTheLongAndWindingTableAndColumn);
     * }
     * vendorTheLongAndWindingTableAndColumnBhv.<span style="color: #DD4747">batchUpdate</span>(vendorTheLongAndWindingTableAndColumnList);
     * </pre>
     * @param vendorTheLongAndWindingTableAndColumnList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    def batchUpdate(batchCall: (ScrBatchEntityList[MbleVendorTheLongAndWindingTableAndColumn]) => Unit)(implicit optionCall: (ScrUpdateOption[VendorTheLongAndWindingTableAndColumnCB]) => Unit = null): Array[Int] = {
        return doBatchUpdate(callbackBatch(batchCall), callbackUpdateOption(optionCall));
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param vendorTheLongAndWindingTableAndColumnList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    def batchDelete(batchCall: (ScrBatchEntityList[MbleVendorTheLongAndWindingTableAndColumn]) => Unit)(implicit optionCall: (ScrDeleteOption[VendorTheLongAndWindingTableAndColumnCB]) => Unit = null): Array[Int] = {
        return doBatchDelete(callbackBatch(batchCall), callbackDeleteOption(optionCall));
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * vendorTheLongAndWindingTableAndColumnBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;DbleVendorTheLongAndWindingTableAndColumn, VendorTheLongAndWindingTableAndColumnCB&gt;() {
     *     public ConditionBean setup(DbleVendorTheLongAndWindingTableAndColumn entity, VendorTheLongAndWindingTableAndColumnCB intoCB) {
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
    def queryInsert(setupperCall: (MbleVendorTheLongAndWindingTableAndColumn, VendorTheLongAndWindingTableAndColumnCB) => ConditionBean): Int = {
        return doQueryInsert(callbackQueryInsertSetupper(setupperCall), null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * DbleVendorTheLongAndWindingTableAndColumn vendorTheLongAndWindingTableAndColumn = new DbleVendorTheLongAndWindingTableAndColumn();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//vendorTheLongAndWindingTableAndColumn.setPK...(value);</span>
     * vendorTheLongAndWindingTableAndColumn.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//vendorTheLongAndWindingTableAndColumn.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//vendorTheLongAndWindingTableAndColumn.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//vendorTheLongAndWindingTableAndColumn.setVersionNo(value);</span>
     * VendorTheLongAndWindingTableAndColumnCB cb = new VendorTheLongAndWindingTableAndColumnCB();
     * cb.query().setFoo...(value);
     * vendorTheLongAndWindingTableAndColumnBhv.<span style="color: #DD4747">queryUpdate</span>(vendorTheLongAndWindingTableAndColumn, cb);
     * </pre>
     * @param entityCall The callback for entity that contains update values. (NotNull)
     * @param cbCall The callback for condition-bean of VendorTheLongAndWindingTableAndColumn. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    def queryUpdate(entityCall: (MbleVendorTheLongAndWindingTableAndColumn) => Unit)(cbCall: (VendorTheLongAndWindingTableAndColumnCB) => Unit): Int = {
        assertObjectNotNull("entityCall", entityCall); assertObjectNotNull("cbCall", cbCall);
        return doQueryUpdate(callbackMbleEntityToDBable(entityCall), callbackCB(cbCall), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * VendorTheLongAndWindingTableAndColumnCB cb = new VendorTheLongAndWindingTableAndColumnCB();
     * cb.query().setFoo...(value);
     * vendorTheLongAndWindingTableAndColumnBhv.<span style="color: #DD4747">queryDelete</span>(vendorTheLongAndWindingTableAndColumn, cb);
     * </pre>
     * @param cbCall The callback for condition-bean of VendorTheLongAndWindingTableAndColumn. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    def queryDelete(cbCall: (VendorTheLongAndWindingTableAndColumnCB) => Unit): Int = {
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
    def outsideSql(): ScrOutsideSqlTypedBasicExecutor[VendorTheLongAndWindingTableAndColumnBhv] = {
        val facadeExecutor: OutsideSqlAllFacadeExecutor[VendorTheLongAndWindingTableAndColumnBhv] = doOutsideSql();
        return toImmutableOutsideSqlTypedBasicExecutor(facadeExecutor.xbasicExecutor()); // variable to resolve generic type
    }

    protected def toImmutableOutsideSqlTypedBasicExecutor(executor: OutsideSqlBasicExecutor[VendorTheLongAndWindingTableAndColumnBhv]): ScrOutsideSqlTypedBasicExecutor[VendorTheLongAndWindingTableAndColumnBhv] =
    { new ScrOutsideSqlTypedBasicExecutor(executor) }

    // ===================================================================================
    //                                                                     Callback Helper
    //                                                                     ===============
    protected def callbackCB(cbCall: (VendorTheLongAndWindingTableAndColumnCB) => Unit): VendorTheLongAndWindingTableAndColumnCB = {
        assertObjectNotNull("cbCall", cbCall);
        val cb = newConditionBean(); cbCall(cb); return cb;
    }

    protected def callbackBatch(batchCall: (ScrBatchEntityList[MbleVendorTheLongAndWindingTableAndColumn]) => Unit): List[DbleVendorTheLongAndWindingTableAndColumn] = {
        assertObjectNotNull("batchCall", batchCall);
        val batch = new ScrBatchEntityList[MbleVendorTheLongAndWindingTableAndColumn]();
        val entityList: List[DbleVendorTheLongAndWindingTableAndColumn] = new ArrayList[DbleVendorTheLongAndWindingTableAndColumn]();
        batch.entityCallList.asScala.map { entityCall =>
            val entity = newMbleEntity(); entityCall(entity); entity.toDBable;
        }
        return entityList;
    }

    protected def callbackMbleEntity(entityCall: (MbleVendorTheLongAndWindingTableAndColumn) => Unit): MbleVendorTheLongAndWindingTableAndColumn = {
        assertObjectNotNull("entityCall", entityCall);
        val entity = newMbleEntity(); entityCall(entity); return entity;
    }

    protected def callbackMbleEntityToDBable(entityCall: (MbleVendorTheLongAndWindingTableAndColumn) => Unit): DbleVendorTheLongAndWindingTableAndColumn = {
        return callbackMbleEntity(entityCall).toDBable;
    }

    protected def callbackInsertOption(optionCall: (ScrInsertOption[VendorTheLongAndWindingTableAndColumnCB]) => Unit): InsertOption[VendorTheLongAndWindingTableAndColumnCB] = {
        if (optionCall == null) { return null; }
        val option = new ScrInsertOption[VendorTheLongAndWindingTableAndColumnCB](new InsertOption[VendorTheLongAndWindingTableAndColumnCB]());
        optionCall(option); return option.toNative;
    }

    protected def callbackUpdateOption(optionCall: (ScrUpdateOption[VendorTheLongAndWindingTableAndColumnCB]) => Unit): UpdateOption[VendorTheLongAndWindingTableAndColumnCB] = {
        if (optionCall == null) { return null; }
        val option = new ScrUpdateOption[VendorTheLongAndWindingTableAndColumnCB](new UpdateOption[VendorTheLongAndWindingTableAndColumnCB]()); optionCall(option); return option.toNative;
    }

    protected def callbackDeleteOption(optionCall: (ScrDeleteOption[VendorTheLongAndWindingTableAndColumnCB]) => Unit): DeleteOption[VendorTheLongAndWindingTableAndColumnCB] = {
        if (optionCall == null) { return null; }
        val option = new ScrDeleteOption[VendorTheLongAndWindingTableAndColumnCB](new DeleteOption[VendorTheLongAndWindingTableAndColumnCB]()); optionCall(option); return option.toNative;
    }

    protected def callbackQueryInsertSetupper(setupperCall: (MbleVendorTheLongAndWindingTableAndColumn, VendorTheLongAndWindingTableAndColumnCB) => ConditionBean): QueryInsertSetupper[DbleVendorTheLongAndWindingTableAndColumn, VendorTheLongAndWindingTableAndColumnCB] = {
        assertObjectNotNull("setupperCall", setupperCall);
        return new QueryInsertSetupper[DbleVendorTheLongAndWindingTableAndColumn, VendorTheLongAndWindingTableAndColumnCB]() {
            def setup(entity: DbleVendorTheLongAndWindingTableAndColumn, intoCB: VendorTheLongAndWindingTableAndColumnCB): ConditionBean = {
                val mble = newMbleEntity();
                val resultCB = setupperCall(mble, intoCB);
                entity.acceptImmutable(mble.toImmutable());
                return resultCB;
            }
        };
    }

    protected def callbackLoader(dbleList: List[DbleVendorTheLongAndWindingTableAndColumn], loaderCall: (LoaderOfVendorTheLongAndWindingTableAndColumn) => Unit = null): Unit = {
        if (loaderCall == null) { return; }
        val loader = new LoaderOfVendorTheLongAndWindingTableAndColumn();
        loader.ready(dbleList.asInstanceOf[List[DbleVendorTheLongAndWindingTableAndColumn]], _behaviorSelector);
        loaderCall(loader);
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    override protected def typeOfSelectedEntity(): Class[DbleVendorTheLongAndWindingTableAndColumn] = { classOf[DbleVendorTheLongAndWindingTableAndColumn] }
    override protected def typeOfHandlingEntity(): Class[DbleVendorTheLongAndWindingTableAndColumn] = { classOf[DbleVendorTheLongAndWindingTableAndColumn] }
    override protected def typeOfHandlingConditionBean(): Class[VendorTheLongAndWindingTableAndColumnCB] = { classOf[VendorTheLongAndWindingTableAndColumnCB] }
    protected def newMbleEntity(): MbleVendorTheLongAndWindingTableAndColumn = { new MbleVendorTheLongAndWindingTableAndColumn() }
    protected def newPagingView(rb: PagingResultBean[DbleVendorTheLongAndWindingTableAndColumn]): ScrPagingView[VendorTheLongAndWindingTableAndColumn] =
    { new ScrPagingView(toImmutableEntityList(rb), rb) }

    // ===================================================================================
    //                                                                        Scala Helper
    //                                                                        ============
    protected def toScalaList[ENTITY](javaList: Collection[ENTITY]): immutable.List[ENTITY] = {
        if (javaList == null) { immutable.List() }
        return javaList.toArray.toList.asInstanceOf[immutable.List[ENTITY]];
    }

    def toImmutableEntityList(dbleList: Collection[DbleVendorTheLongAndWindingTableAndColumn]): immutable.List[VendorTheLongAndWindingTableAndColumn] =
    { toScalaList(dbleList).map(new VendorTheLongAndWindingTableAndColumn(_)) }

    def toDBableEntityList(immuList: immutable.List[VendorTheLongAndWindingTableAndColumn]): List[DbleVendorTheLongAndWindingTableAndColumn] =
    { immuList.map(new DbleVendorTheLongAndWindingTableAndColumn().acceptImmutable(_)).asJava }
}
