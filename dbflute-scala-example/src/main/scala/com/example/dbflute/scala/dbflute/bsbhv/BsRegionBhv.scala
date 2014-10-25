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
 * The behavior of (地域)REGION as TABLE. <br />
 * <pre>
 * [primary key]
 *     REGION_ID
 *
 * [column]
 *     REGION_ID, REGION_NAME
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
 *     MEMBER_ADDRESS
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     memberAddressList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
abstract class BsRegionBhv extends AbstractBehaviorWritable[DbleRegion, RegionCB] {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    def getDBMeta(): DBMeta = { return RegionDbm; }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    def newConditionBean(): RegionCB = { return new RegionCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * RegionCB cb = new RegionCB();
     * cb.query().setFoo...(value);
     * int count = regionBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of DbleRegion. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    def selectCount(cbCall: (RegionCB) => Unit): Int = {
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
     * RegionCB cb = new RegionCB();
     * cb.query().setFoo...(value);
     * OptionalEntity&lt;DbleRegion&gt; entity = regionBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     *
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * entity.<span style="color: #DD4747">required</span>(region -&gt; {
     *     ...
     * });
     * DbleRegion region = entity.entity.<span style="color: #DD4747">get()</span>;
     *
     * <span style="color: #3F7E5E">// if it might be no data, ifPresent(), isPresent(), ...</span>
     * entity.<span style="color: #DD4747">ifPresent</span>(region -&gt; {
     *     ...
     * });
     * if (entity.entity.<span style="color: #DD4747">isPresent()</span>) {
     *     DbleRegion region = entity.entity.<span style="color: #DD4747">get()</span>;
     * } else {
     *     ...
     * }
     * </pre>
     * @param cbCall The callback for condition-bean of Region. (NotNull)
     * @param loaderCall The callback for referrer loader of Region. (NoArgAllowed: then no loading)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get() of return value is called and the value is null, which means entity has already been deleted (point is not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    def selectEntity(cbCall: (RegionCB) => Unit)(implicit loaderCall: (LoaderOfRegion) => Unit = null): Option[Region] = {
        return facadeSelectEntity(callbackCB(cbCall))(loaderCall).map(_.toImmutable);
    }

    protected def facadeSelectEntity(cb: RegionCB)(loaderCall: (LoaderOfRegion) => Unit = null): Option[DbleRegion] = {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity())(loaderCall);
    }

    protected def doSelectEntity[ENTITY <: DbleRegion](cb: RegionCB, tp: Class[_ <: ENTITY])(loaderCall: (LoaderOfRegion) => Unit = null): ENTITY = {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        val dble = helpSelectEntityInternally(cb, tp);
        if (dble != null) {
            callbackLoader(DfCollectionUtil.newArrayList(dble.asInstanceOf[DbleRegion]), loaderCall);
        }
        return dble;
    }

    protected def doSelectOptionalEntity[ENTITY <: DbleRegion](cb: RegionCB, tp: Class[_ <: ENTITY])(loaderCall: (LoaderOfRegion) => Unit = null): Option[ENTITY] = {
        return Option.apply(doSelectEntity(cb, tp)(loaderCall));
    }

    override protected def doReadEntity(cb: ConditionBean): Entity = { facadeSelectEntity(downcast(cb))().orNull }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * RegionCB cb = new RegionCB();
     * cb.query().setFoo...(value);
     * DbleRegion region = regionBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = region.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbCall The callback for condition-bean of Region. (NotNull)
     * @param loaderCall The callback for referrer loader of Region. (NoArgAllowed: then no loading)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (point is not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    def selectEntityWithDeletedCheck(cbCall: (RegionCB) => Unit)(implicit loaderCall: (LoaderOfRegion) => Unit = null): Region = {
        return facadeSelectEntityWithDeletedCheck(callbackCB(cbCall))(loaderCall).toImmutable;
    }

    protected def facadeSelectEntityWithDeletedCheck(cb: RegionCB)(loaderCall: (LoaderOfRegion) => Unit = null): DbleRegion = {
        return doSelectEntityWithDeletedCheck(cb, typeOfSelectedEntity())(loaderCall);
    }

    protected def doSelectEntityWithDeletedCheck[ENTITY <: DbleRegion](cb: RegionCB, tp: Class[ENTITY])(loaderCall: (LoaderOfRegion) => Unit = null): ENTITY = {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        val dble = helpSelectEntityWithDeletedCheckInternally(cb, tp);
        callbackLoader(DfCollectionUtil.newArrayList(dble.asInstanceOf[DbleRegion]), loaderCall);
        return dble;
    }

    override protected def doReadEntityWithDeletedCheck(cb: ConditionBean): Entity = { facadeSelectEntityWithDeletedCheck(downcast(cb))() }

    /**
     * Select the entity by the primary-key value.
     * @param regionId (地域ID): PK, NotNull, INTEGER(10), classification=Region. (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    def selectByPK(regionId: CDef.Region): Option[Region] = {
        return facadeSelectByPK(regionId).map(_.toImmutable);
    }

    protected def facadeSelectByPK(regionId: CDef.Region): Option[DbleRegion] = {
        return doSelectByPK(regionId, typeOfSelectedEntity());
    }

    protected def doSelectByPK[ENTITY <: DbleRegion](regionId: CDef.Region, tp: Class[_ <: ENTITY]): Option[ENTITY] = {
        return Option.apply(doSelectEntity(xprepareCBAsPK(regionId), tp)());
    }

    protected def xprepareCBAsPK(regionId: CDef.Region): RegionCB = {
        assertObjectNotNull("regionId", regionId);
        return newConditionBean().acceptPK(regionId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * RegionCB cb = new RegionCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * List&lt;${Region}&gt; regionList = regionBhv.<span style="color: #DD4747">selectList</span>(cb);
     * regionList.foreach(region =>
     *     ... = region...;
     * }
     * </pre>
     * @param cbCall The callback for condition-bean of Region. (NotNull)
     * @param loaderCall The callback for referrer loader of Region. (NoArgAllowed: then no loading)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    def selectList(cbCall: (RegionCB) => Unit)(implicit loaderCall: (LoaderOfRegion) => Unit = null): immutable.List[Region] = {
        return toImmutableEntityList(facadeSelectList(callbackCB(cbCall))(loaderCall));
    }

    protected def facadeSelectList(cb: RegionCB)(loaderCall: (LoaderOfRegion) => Unit = null): ListResultBean[DbleRegion] = {
        return doSelectList(cb, typeOfSelectedEntity())(loaderCall);
    }

    protected def doSelectList[RESULT <: DbleRegion](cb: RegionCB, tp: Class[RESULT])(loaderCall: (LoaderOfRegion) => Unit = null): ListResultBean[RESULT] = {
        val dbleList = helpSelectListInternally(cb, tp);
        callbackLoader(dbleList.asInstanceOf[List[DbleRegion]], loaderCall);
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
     * RegionCB cb = new RegionCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;DbleRegion&gt; page = regionBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (DbleRegion region : page) {
     *     ... = region.get...();
     * }
     * </pre>
     * @param cbCall The callback for condition-bean of Region. (NotNull)
     * @param loaderCall The callback for referrer loader of Region. (NoArgAllowed: then no loading)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    def selectPage(cbCall: (RegionCB) => Unit)(implicit loaderCall: (LoaderOfRegion) => Unit = null): ScrPagingView[Region] = {
        return newPagingView(facadeSelectPage(callbackCB(cbCall))(loaderCall));
    }

    protected def facadeSelectPage(cb: RegionCB)(loaderCall: (LoaderOfRegion) => Unit = null): PagingResultBean[DbleRegion] = {
        return doSelectPage(cb, typeOfSelectedEntity())(loaderCall);
    }

    protected def doSelectPage[RESULT <: DbleRegion](cb: RegionCB, tp: Class[RESULT])(loaderCall: (LoaderOfRegion) => Unit = null): PagingResultBean[RESULT] = {
        val dbleList = helpSelectPageInternally(cb, tp);
        callbackLoader(dbleList.asInstanceOf[List[DbleRegion]], loaderCall);
        return dbleList;
    }

    override protected def doReadPage(cb: ConditionBean): PagingResultBean[_ <: Entity] = { facadeSelectPage(downcast(cb))() }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * RegionCB cb = new RegionCB();
     * cb.query().setFoo...(value);
     * regionBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;DbleRegion&gt;() {
     *     public void handle(DbleRegion entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of DbleRegion. (NotNull)
     * @param entityRowHandler The handler of entity row of DbleRegion. (NotNull)
     */
    def selectCursor(cbCall: (RegionCB) => Unit)(rowCall: (Region) => Unit): Unit = {
        facadeSelectCursor(callbackCB(cbCall), new EntityRowHandler[DbleRegion]() {
            def handle(entity: DbleRegion): Unit = { rowCall(entity.toImmutable) }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * regionBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(RegionCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    def scalarSelect[RESULT](resultType: Class[RESULT]): ScrHpSLSFunction[RegionCB, RESULT] = {
        return toScalaSLSFunction[RESULT](facadeScalarSelect(resultType));
    }

    protected def toScalaSLSFunction[RESULT](function: HpSLSFunction[RegionCB, RESULT]): ScrHpSLSFunction[RegionCB, RESULT] =
    { new ScrHpSLSFunction[RegionCB, RESULT](function) }

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
     * Load referrer of memberAddressList by the set-upper of referrer. <br />
     * (会員住所情報)MEMBER_ADDRESS by REGION_ID, named 'memberAddressList'.
     * <pre>
     * regionBhv.<span style="color: #DD4747">loadMemberAddressList</span>(regionList, new ReferrerConditionSetupper&lt;MemberAddressCB&gt;() {
     *     public void setup(MemberAddressCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * for (DbleRegion region : regionList) {
     *     ... = region.<span style="color: #DD4747">getMemberAddressList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setRegionId_InScope(pkList);
     * cb.query().addOrderBy_RegionId_Asc();
     * </pre>
     * @param regionList The entity list of region. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    def loadMemberAddressList(regionList: List[DbleRegion], setupCall: (MemberAddressCB) => Unit): NestedReferrerListGateway[DbleMemberAddress] = {
        assertObjectNotNull("regionList", regionList); assertObjectNotNull("setupCall", setupCall);
        val setupper = new ReferrerConditionSetupper[MemberAddressCB]() { def setup(referrerCB: MemberAddressCB): Unit = { setupCall(referrerCB); } }
        return doLoadMemberAddressList(regionList, new LoadReferrerOption[MemberAddressCB, DbleMemberAddress]().xinit(setupper));
    }

    /**
     * Load referrer of memberAddressList by the set-upper of referrer. <br />
     * (会員住所情報)MEMBER_ADDRESS by REGION_ID, named 'memberAddressList'.
     * <pre>
     * regionBhv.<span style="color: #DD4747">loadMemberAddressList</span>(regionList, new ReferrerConditionSetupper&lt;MemberAddressCB&gt;() {
     *     public void setup(MemberAddressCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = region.<span style="color: #DD4747">getMemberAddressList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setRegionId_InScope(pkList);
     * cb.query().addOrderBy_RegionId_Asc();
     * </pre>
     * @param region The entity of region. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    def loadMemberAddressList(region: DbleRegion, setupCall: (MemberAddressCB) => Unit): NestedReferrerListGateway[DbleMemberAddress] = {
        assertObjectNotNull("region", region); assertObjectNotNull("setupCall", setupCall);
        val setupper = new ReferrerConditionSetupper[MemberAddressCB]() { def setup(referrerCB: MemberAddressCB): Unit = { setupCall(referrerCB); } }
        return doLoadMemberAddressList(xnewLRLs(region), new LoadReferrerOption[MemberAddressCB, DbleMemberAddress]().xinit(setupper));
    }

    protected def doLoadMemberAddressList(regionList: List[DbleRegion], option: LoadReferrerOption[MemberAddressCB, DbleMemberAddress]): NestedReferrerListGateway[DbleMemberAddress] = {
        return helpLoadReferrerInternally(regionList, option, "memberAddressList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key regionId.
     * @param regionList The list of region. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    def extractRegionIdList(regionList: immutable.List[Region]): immutable.List[Int] = {
        val plainList = helpExtractListInternally(toDBableEntityList(regionList), "regionId");
        return toScalaList(plainList).map(_.asInstanceOf[Int]);
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * DbleRegion region = new DbleRegion();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * region.setFoo...(value);
     * region.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//region.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//region.set...;</span>
     * regionBhv.<span style="color: #DD4747">insert</span>(region);
     * ... = region.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param entityCall The callback for entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param optionCall The callback for option of insert. (NoArgAllowed: then no option)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    def insert(entityCall: (MbleRegion) => Unit)(implicit optionCall: (ScrInsertOption[RegionCB]) => Unit = null): Unit = {
        assertObjectNotNull("entityCall", entityCall);
        doInsert(callbackMbleEntityToDBable(entityCall), callbackInsertOption(optionCall));
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * DbleRegion region = new DbleRegion();
     * region.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * region.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//region.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//region.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * region.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     regionBhv.<span style="color: #DD4747">update</span>(region);
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
    def update(entityCall: (MbleRegion) => Unit)(implicit optionCall: (ScrUpdateOption[RegionCB]) => Unit = null): Unit = {
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
    def insertOrUpdate(entityCall: (MbleRegion) => Unit)(implicit insertOptionCall: (ScrInsertOption[RegionCB]) => Unit = null, updateOptionCall: (ScrUpdateOption[RegionCB]) => Unit = null): Unit = {
        doInsertOrUpdate(callbackMbleEntityToDBable(entityCall), callbackInsertOption(insertOptionCall), callbackUpdateOption(updateOptionCall));
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * DbleRegion region = new DbleRegion();
     * region.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * region.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     regionBhv.<span style="color: #DD4747">delete</span>(region);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param entityCall The callback for entity of delete. (NotNull, PrimaryKeyNotNull)
     * @param optionCall The callback for option of delete. (NoArgAllowed: then no option)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    def delete(entityCall: (MbleRegion) => Unit)(implicit optionCall: (ScrDeleteOption[RegionCB]) => Unit = null): Unit = {
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
     *     DbleRegion region = new DbleRegion();
     *     region.setFooName("foo");
     *     if (...) {
     *         region.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     regionList.add(region);
     * }
     * regionBhv.<span style="color: #DD4747">batchInsert</span>(regionList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param regionList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    def batchInsert(batchCall: (ScrBatchEntityList[MbleRegion]) => Unit)(implicit optionCall: (ScrInsertOption[RegionCB]) => Unit = null): Array[Int] = {
        return doBatchInsert(callbackBatch(batchCall), callbackInsertOption(optionCall));
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     DbleRegion region = new DbleRegion();
     *     region.setFooName("foo");
     *     if (...) {
     *         region.setFooPrice(123);
     *     } else {
     *         region.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//region.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     regionList.add(region);
     * }
     * regionBhv.<span style="color: #DD4747">batchUpdate</span>(regionList);
     * </pre>
     * @param regionList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    def batchUpdate(batchCall: (ScrBatchEntityList[MbleRegion]) => Unit)(implicit optionCall: (ScrUpdateOption[RegionCB]) => Unit = null): Array[Int] = {
        return doBatchUpdate(callbackBatch(batchCall), callbackUpdateOption(optionCall));
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param regionList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    def batchDelete(batchCall: (ScrBatchEntityList[MbleRegion]) => Unit)(implicit optionCall: (ScrDeleteOption[RegionCB]) => Unit = null): Array[Int] = {
        return doBatchDelete(callbackBatch(batchCall), callbackDeleteOption(optionCall));
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * regionBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;DbleRegion, RegionCB&gt;() {
     *     public ConditionBean setup(DbleRegion entity, RegionCB intoCB) {
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
    def queryInsert(setupperCall: (MbleRegion, RegionCB) => ConditionBean): Int = {
        return doQueryInsert(callbackQueryInsertSetupper(setupperCall), null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * DbleRegion region = new DbleRegion();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//region.setPK...(value);</span>
     * region.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//region.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//region.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//region.setVersionNo(value);</span>
     * RegionCB cb = new RegionCB();
     * cb.query().setFoo...(value);
     * regionBhv.<span style="color: #DD4747">queryUpdate</span>(region, cb);
     * </pre>
     * @param entityCall The callback for entity that contains update values. (NotNull)
     * @param cbCall The callback for condition-bean of Region. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    def queryUpdate(entityCall: (MbleRegion) => Unit)(cbCall: (RegionCB) => Unit): Int = {
        assertObjectNotNull("entityCall", entityCall); assertObjectNotNull("cbCall", cbCall);
        return doQueryUpdate(callbackMbleEntityToDBable(entityCall), callbackCB(cbCall), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * RegionCB cb = new RegionCB();
     * cb.query().setFoo...(value);
     * regionBhv.<span style="color: #DD4747">queryDelete</span>(region, cb);
     * </pre>
     * @param cbCall The callback for condition-bean of Region. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    def queryDelete(cbCall: (RegionCB) => Unit): Int = {
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
    def outsideSql(): ScrOutsideSqlTypedBasicExecutor[RegionBhv] = {
        val facadeExecutor: OutsideSqlAllFacadeExecutor[RegionBhv] = doOutsideSql();
        return toImmutableOutsideSqlTypedBasicExecutor(facadeExecutor.xbasicExecutor()); // variable to resolve generic type
    }

    protected def toImmutableOutsideSqlTypedBasicExecutor(executor: OutsideSqlBasicExecutor[RegionBhv]): ScrOutsideSqlTypedBasicExecutor[RegionBhv] =
    { new ScrOutsideSqlTypedBasicExecutor(executor) }

    // ===================================================================================
    //                                                                     Callback Helper
    //                                                                     ===============
    protected def callbackCB(cbCall: (RegionCB) => Unit): RegionCB = {
        assertObjectNotNull("cbCall", cbCall);
        val cb = newConditionBean(); cbCall(cb); return cb;
    }

    protected def callbackBatch(batchCall: (ScrBatchEntityList[MbleRegion]) => Unit): List[DbleRegion] = {
        assertObjectNotNull("batchCall", batchCall);
        val batch = new ScrBatchEntityList[MbleRegion]();
        val entityList: List[DbleRegion] = new ArrayList[DbleRegion]();
        batch.entityCallList.asScala.map { entityCall =>
            val entity = newMbleEntity(); entityCall(entity); entity.toDBable;
        }
        return entityList;
    }

    protected def callbackMbleEntity(entityCall: (MbleRegion) => Unit): MbleRegion = {
        assertObjectNotNull("entityCall", entityCall);
        val entity = newMbleEntity(); entityCall(entity); return entity;
    }

    protected def callbackMbleEntityToDBable(entityCall: (MbleRegion) => Unit): DbleRegion = {
        return callbackMbleEntity(entityCall).toDBable;
    }

    protected def callbackInsertOption(optionCall: (ScrInsertOption[RegionCB]) => Unit): InsertOption[RegionCB] = {
        if (optionCall == null) { return null; }
        val option = new ScrInsertOption[RegionCB](new InsertOption[RegionCB]());
        optionCall(option); return option.toNative;
    }

    protected def callbackUpdateOption(optionCall: (ScrUpdateOption[RegionCB]) => Unit): UpdateOption[RegionCB] = {
        if (optionCall == null) { return null; }
        val option = new ScrUpdateOption[RegionCB](new UpdateOption[RegionCB]()); optionCall(option); return option.toNative;
    }

    protected def callbackDeleteOption(optionCall: (ScrDeleteOption[RegionCB]) => Unit): DeleteOption[RegionCB] = {
        if (optionCall == null) { return null; }
        val option = new ScrDeleteOption[RegionCB](new DeleteOption[RegionCB]()); optionCall(option); return option.toNative;
    }

    protected def callbackQueryInsertSetupper(setupperCall: (MbleRegion, RegionCB) => ConditionBean): QueryInsertSetupper[DbleRegion, RegionCB] = {
        assertObjectNotNull("setupperCall", setupperCall);
        return new QueryInsertSetupper[DbleRegion, RegionCB]() {
            def setup(entity: DbleRegion, intoCB: RegionCB): ConditionBean = {
                val mble = newMbleEntity();
                val resultCB = setupperCall(mble, intoCB);
                entity.acceptImmutable(mble.toImmutable());
                return resultCB;
            }
        };
    }

    protected def callbackLoader(dbleList: List[DbleRegion], loaderCall: (LoaderOfRegion) => Unit = null): Unit = {
        if (loaderCall == null) { return; }
        val loader = new LoaderOfRegion();
        loader.ready(dbleList.asInstanceOf[List[DbleRegion]], _behaviorSelector);
        loaderCall(loader);
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    override protected def typeOfSelectedEntity(): Class[DbleRegion] = { classOf[DbleRegion] }
    override protected def typeOfHandlingEntity(): Class[DbleRegion] = { classOf[DbleRegion] }
    override protected def typeOfHandlingConditionBean(): Class[RegionCB] = { classOf[RegionCB] }
    protected def newMbleEntity(): MbleRegion = { new MbleRegion() }
    protected def newPagingView(rb: PagingResultBean[DbleRegion]): ScrPagingView[Region] =
    { new ScrPagingView(toImmutableEntityList(rb), rb) }

    // ===================================================================================
    //                                                                        Scala Helper
    //                                                                        ============
    protected def toScalaList[ENTITY](javaList: Collection[ENTITY]): immutable.List[ENTITY] = {
        if (javaList == null) { immutable.List() }
        return javaList.toArray.toList.asInstanceOf[immutable.List[ENTITY]];
    }

    def toImmutableEntityList(dbleList: Collection[DbleRegion]): immutable.List[Region] =
    { toScalaList(dbleList).map(new Region(_)) }

    def toDBableEntityList(immuList: immutable.List[Region]): List[DbleRegion] =
    { immuList.map(new DbleRegion().acceptImmutable(_)).asJava }
}
