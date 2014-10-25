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
 * The behavior of (サービスランク)SERVICE_RANK as TABLE. <br />
 * <pre>
 * [primary key]
 *     SERVICE_RANK_CODE
 *
 * [column]
 *     SERVICE_RANK_CODE, SERVICE_RANK_NAME, SERVICE_POINT_INCIDENCE, NEW_ACCEPTABLE_FLG, DESCRIPTION, DISPLAY_ORDER
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
 *     MEMBER_SERVICE
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     memberServiceList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
abstract class BsServiceRankBhv extends AbstractBehaviorWritable[DbleServiceRank, ServiceRankCB] {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    def getDBMeta(): DBMeta = { return ServiceRankDbm; }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    def newConditionBean(): ServiceRankCB = { return new ServiceRankCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * ServiceRankCB cb = new ServiceRankCB();
     * cb.query().setFoo...(value);
     * int count = serviceRankBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of DbleServiceRank. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    def selectCount(cbCall: (ServiceRankCB) => Unit): Int = {
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
     * ServiceRankCB cb = new ServiceRankCB();
     * cb.query().setFoo...(value);
     * OptionalEntity&lt;DbleServiceRank&gt; entity = serviceRankBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     *
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * entity.<span style="color: #DD4747">required</span>(serviceRank -&gt; {
     *     ...
     * });
     * DbleServiceRank serviceRank = entity.entity.<span style="color: #DD4747">get()</span>;
     *
     * <span style="color: #3F7E5E">// if it might be no data, ifPresent(), isPresent(), ...</span>
     * entity.<span style="color: #DD4747">ifPresent</span>(serviceRank -&gt; {
     *     ...
     * });
     * if (entity.entity.<span style="color: #DD4747">isPresent()</span>) {
     *     DbleServiceRank serviceRank = entity.entity.<span style="color: #DD4747">get()</span>;
     * } else {
     *     ...
     * }
     * </pre>
     * @param cbCall The callback for condition-bean of ServiceRank. (NotNull)
     * @param loaderCall The callback for referrer loader of ServiceRank. (NoArgAllowed: then no loading)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get() of return value is called and the value is null, which means entity has already been deleted (point is not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    def selectEntity(cbCall: (ServiceRankCB) => Unit)(implicit loaderCall: (LoaderOfServiceRank) => Unit = null): Option[ServiceRank] = {
        return facadeSelectEntity(callbackCB(cbCall))(loaderCall).map(_.toImmutable);
    }

    protected def facadeSelectEntity(cb: ServiceRankCB)(loaderCall: (LoaderOfServiceRank) => Unit = null): Option[DbleServiceRank] = {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity())(loaderCall);
    }

    protected def doSelectEntity[ENTITY <: DbleServiceRank](cb: ServiceRankCB, tp: Class[_ <: ENTITY])(loaderCall: (LoaderOfServiceRank) => Unit = null): ENTITY = {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        val dble = helpSelectEntityInternally(cb, tp);
        if (dble != null) {
            callbackLoader(DfCollectionUtil.newArrayList(dble.asInstanceOf[DbleServiceRank]), loaderCall);
        }
        return dble;
    }

    protected def doSelectOptionalEntity[ENTITY <: DbleServiceRank](cb: ServiceRankCB, tp: Class[_ <: ENTITY])(loaderCall: (LoaderOfServiceRank) => Unit = null): Option[ENTITY] = {
        return Option.apply(doSelectEntity(cb, tp)(loaderCall));
    }

    override protected def doReadEntity(cb: ConditionBean): Entity = { facadeSelectEntity(downcast(cb))().orNull }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * ServiceRankCB cb = new ServiceRankCB();
     * cb.query().setFoo...(value);
     * DbleServiceRank serviceRank = serviceRankBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = serviceRank.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbCall The callback for condition-bean of ServiceRank. (NotNull)
     * @param loaderCall The callback for referrer loader of ServiceRank. (NoArgAllowed: then no loading)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (point is not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    def selectEntityWithDeletedCheck(cbCall: (ServiceRankCB) => Unit)(implicit loaderCall: (LoaderOfServiceRank) => Unit = null): ServiceRank = {
        return facadeSelectEntityWithDeletedCheck(callbackCB(cbCall))(loaderCall).toImmutable;
    }

    protected def facadeSelectEntityWithDeletedCheck(cb: ServiceRankCB)(loaderCall: (LoaderOfServiceRank) => Unit = null): DbleServiceRank = {
        return doSelectEntityWithDeletedCheck(cb, typeOfSelectedEntity())(loaderCall);
    }

    protected def doSelectEntityWithDeletedCheck[ENTITY <: DbleServiceRank](cb: ServiceRankCB, tp: Class[ENTITY])(loaderCall: (LoaderOfServiceRank) => Unit = null): ENTITY = {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        val dble = helpSelectEntityWithDeletedCheckInternally(cb, tp);
        callbackLoader(DfCollectionUtil.newArrayList(dble.asInstanceOf[DbleServiceRank]), loaderCall);
        return dble;
    }

    override protected def doReadEntityWithDeletedCheck(cb: ConditionBean): Entity = { facadeSelectEntityWithDeletedCheck(downcast(cb))() }

    /**
     * Select the entity by the primary-key value.
     * @param serviceRankCode (サービスランクコード): PK, NotNull, CHAR(3), classification=ServiceRank. (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    def selectByPK(serviceRankCode: CDef.ServiceRank): Option[ServiceRank] = {
        return facadeSelectByPK(serviceRankCode).map(_.toImmutable);
    }

    protected def facadeSelectByPK(serviceRankCode: CDef.ServiceRank): Option[DbleServiceRank] = {
        return doSelectByPK(serviceRankCode, typeOfSelectedEntity());
    }

    protected def doSelectByPK[ENTITY <: DbleServiceRank](serviceRankCode: CDef.ServiceRank, tp: Class[_ <: ENTITY]): Option[ENTITY] = {
        return Option.apply(doSelectEntity(xprepareCBAsPK(serviceRankCode), tp)());
    }

    protected def xprepareCBAsPK(serviceRankCode: CDef.ServiceRank): ServiceRankCB = {
        assertObjectNotNull("serviceRankCode", serviceRankCode);
        return newConditionBean().acceptPK(serviceRankCode);
    }

    /**
     * Select the entity by the unique-key value.
     * @param displayOrder (表示順): UQ, NotNull, INTEGER(10). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    def selectByUniqueOf(displayOrder: Integer): Option[ServiceRank] = {
        return facadeSelectByUniqueOf(displayOrder).map(_.toImmutable);
    }

    protected def facadeSelectByUniqueOf(displayOrder: Integer): Option[DbleServiceRank] = {
        return doSelectByUniqueOf(displayOrder, typeOfSelectedEntity());
    }

    protected def doSelectByUniqueOf[ENTITY <: DbleServiceRank](displayOrder: Integer, tp: Class[_ <: ENTITY]): Option[ENTITY] = {
        return Option.apply(doSelectEntity(xprepareCBAsUniqueOf(displayOrder), tp)());
    }

    protected def xprepareCBAsUniqueOf(displayOrder: Integer): ServiceRankCB = {
        assertObjectNotNull("displayOrder", displayOrder);
        return newConditionBean().acceptUniqueOf(displayOrder);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * ServiceRankCB cb = new ServiceRankCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * List&lt;${ServiceRank}&gt; serviceRankList = serviceRankBhv.<span style="color: #DD4747">selectList</span>(cb);
     * serviceRankList.foreach(serviceRank =>
     *     ... = serviceRank...;
     * }
     * </pre>
     * @param cbCall The callback for condition-bean of ServiceRank. (NotNull)
     * @param loaderCall The callback for referrer loader of ServiceRank. (NoArgAllowed: then no loading)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    def selectList(cbCall: (ServiceRankCB) => Unit)(implicit loaderCall: (LoaderOfServiceRank) => Unit = null): immutable.List[ServiceRank] = {
        return toImmutableEntityList(facadeSelectList(callbackCB(cbCall))(loaderCall));
    }

    protected def facadeSelectList(cb: ServiceRankCB)(loaderCall: (LoaderOfServiceRank) => Unit = null): ListResultBean[DbleServiceRank] = {
        return doSelectList(cb, typeOfSelectedEntity())(loaderCall);
    }

    protected def doSelectList[RESULT <: DbleServiceRank](cb: ServiceRankCB, tp: Class[RESULT])(loaderCall: (LoaderOfServiceRank) => Unit = null): ListResultBean[RESULT] = {
        val dbleList = helpSelectListInternally(cb, tp);
        callbackLoader(dbleList.asInstanceOf[List[DbleServiceRank]], loaderCall);
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
     * ServiceRankCB cb = new ServiceRankCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;DbleServiceRank&gt; page = serviceRankBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (DbleServiceRank serviceRank : page) {
     *     ... = serviceRank.get...();
     * }
     * </pre>
     * @param cbCall The callback for condition-bean of ServiceRank. (NotNull)
     * @param loaderCall The callback for referrer loader of ServiceRank. (NoArgAllowed: then no loading)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    def selectPage(cbCall: (ServiceRankCB) => Unit)(implicit loaderCall: (LoaderOfServiceRank) => Unit = null): ScrPagingView[ServiceRank] = {
        return newPagingView(facadeSelectPage(callbackCB(cbCall))(loaderCall));
    }

    protected def facadeSelectPage(cb: ServiceRankCB)(loaderCall: (LoaderOfServiceRank) => Unit = null): PagingResultBean[DbleServiceRank] = {
        return doSelectPage(cb, typeOfSelectedEntity())(loaderCall);
    }

    protected def doSelectPage[RESULT <: DbleServiceRank](cb: ServiceRankCB, tp: Class[RESULT])(loaderCall: (LoaderOfServiceRank) => Unit = null): PagingResultBean[RESULT] = {
        val dbleList = helpSelectPageInternally(cb, tp);
        callbackLoader(dbleList.asInstanceOf[List[DbleServiceRank]], loaderCall);
        return dbleList;
    }

    override protected def doReadPage(cb: ConditionBean): PagingResultBean[_ <: Entity] = { facadeSelectPage(downcast(cb))() }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * ServiceRankCB cb = new ServiceRankCB();
     * cb.query().setFoo...(value);
     * serviceRankBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;DbleServiceRank&gt;() {
     *     public void handle(DbleServiceRank entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of DbleServiceRank. (NotNull)
     * @param entityRowHandler The handler of entity row of DbleServiceRank. (NotNull)
     */
    def selectCursor(cbCall: (ServiceRankCB) => Unit)(rowCall: (ServiceRank) => Unit): Unit = {
        facadeSelectCursor(callbackCB(cbCall), new EntityRowHandler[DbleServiceRank]() {
            def handle(entity: DbleServiceRank): Unit = { rowCall(entity.toImmutable) }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * serviceRankBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(ServiceRankCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    def scalarSelect[RESULT](resultType: Class[RESULT]): ScrHpSLSFunction[ServiceRankCB, RESULT] = {
        return toScalaSLSFunction[RESULT](facadeScalarSelect(resultType));
    }

    protected def toScalaSLSFunction[RESULT](function: HpSLSFunction[ServiceRankCB, RESULT]): ScrHpSLSFunction[ServiceRankCB, RESULT] =
    { new ScrHpSLSFunction[ServiceRankCB, RESULT](function) }

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
     * Load referrer of memberServiceList by the set-upper of referrer. <br />
     * (会員サービス)MEMBER_SERVICE by SERVICE_RANK_CODE, named 'memberServiceList'.
     * <pre>
     * serviceRankBhv.<span style="color: #DD4747">loadMemberServiceList</span>(serviceRankList, new ReferrerConditionSetupper&lt;MemberServiceCB&gt;() {
     *     public void setup(MemberServiceCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * for (DbleServiceRank serviceRank : serviceRankList) {
     *     ... = serviceRank.<span style="color: #DD4747">getMemberServiceList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setServiceRankCode_InScope(pkList);
     * cb.query().addOrderBy_ServiceRankCode_Asc();
     * </pre>
     * @param serviceRankList The entity list of serviceRank. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    def loadMemberServiceList(serviceRankList: List[DbleServiceRank], setupCall: (MemberServiceCB) => Unit): NestedReferrerListGateway[DbleMemberService] = {
        assertObjectNotNull("serviceRankList", serviceRankList); assertObjectNotNull("setupCall", setupCall);
        val setupper = new ReferrerConditionSetupper[MemberServiceCB]() { def setup(referrerCB: MemberServiceCB): Unit = { setupCall(referrerCB); } }
        return doLoadMemberServiceList(serviceRankList, new LoadReferrerOption[MemberServiceCB, DbleMemberService]().xinit(setupper));
    }

    /**
     * Load referrer of memberServiceList by the set-upper of referrer. <br />
     * (会員サービス)MEMBER_SERVICE by SERVICE_RANK_CODE, named 'memberServiceList'.
     * <pre>
     * serviceRankBhv.<span style="color: #DD4747">loadMemberServiceList</span>(serviceRankList, new ReferrerConditionSetupper&lt;MemberServiceCB&gt;() {
     *     public void setup(MemberServiceCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = serviceRank.<span style="color: #DD4747">getMemberServiceList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setServiceRankCode_InScope(pkList);
     * cb.query().addOrderBy_ServiceRankCode_Asc();
     * </pre>
     * @param serviceRank The entity of serviceRank. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    def loadMemberServiceList(serviceRank: DbleServiceRank, setupCall: (MemberServiceCB) => Unit): NestedReferrerListGateway[DbleMemberService] = {
        assertObjectNotNull("serviceRank", serviceRank); assertObjectNotNull("setupCall", setupCall);
        val setupper = new ReferrerConditionSetupper[MemberServiceCB]() { def setup(referrerCB: MemberServiceCB): Unit = { setupCall(referrerCB); } }
        return doLoadMemberServiceList(xnewLRLs(serviceRank), new LoadReferrerOption[MemberServiceCB, DbleMemberService]().xinit(setupper));
    }

    protected def doLoadMemberServiceList(serviceRankList: List[DbleServiceRank], option: LoadReferrerOption[MemberServiceCB, DbleMemberService]): NestedReferrerListGateway[DbleMemberService] = {
        return helpLoadReferrerInternally(serviceRankList, option, "memberServiceList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key serviceRankCode.
     * @param serviceRankList The list of serviceRank. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    def extractServiceRankCodeList(serviceRankList: immutable.List[ServiceRank]): immutable.List[String] = {
        val plainList = helpExtractListInternally(toDBableEntityList(serviceRankList), "serviceRankCode");
        return toScalaList(plainList).map(_.asInstanceOf[String]);
    }

    /**
     * Extract the value list of (single) unique key displayOrder.
     * @param serviceRankList The list of serviceRank. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    def extractDisplayOrderList(serviceRankList: immutable.List[ServiceRank]): immutable.List[Int] = {
        val plainList = helpExtractListInternally(toDBableEntityList(serviceRankList), "displayOrder");
        return toScalaList(plainList).map(_.asInstanceOf[Int]);
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * DbleServiceRank serviceRank = new DbleServiceRank();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * serviceRank.setFoo...(value);
     * serviceRank.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//serviceRank.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//serviceRank.set...;</span>
     * serviceRankBhv.<span style="color: #DD4747">insert</span>(serviceRank);
     * ... = serviceRank.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param entityCall The callback for entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param optionCall The callback for option of insert. (NoArgAllowed: then no option)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    def insert(entityCall: (MbleServiceRank) => Unit)(implicit optionCall: (ScrInsertOption[ServiceRankCB]) => Unit = null): Unit = {
        assertObjectNotNull("entityCall", entityCall);
        doInsert(callbackMbleEntityToDBable(entityCall), callbackInsertOption(optionCall));
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * DbleServiceRank serviceRank = new DbleServiceRank();
     * serviceRank.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * serviceRank.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//serviceRank.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//serviceRank.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * serviceRank.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     serviceRankBhv.<span style="color: #DD4747">update</span>(serviceRank);
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
    def update(entityCall: (MbleServiceRank) => Unit)(implicit optionCall: (ScrUpdateOption[ServiceRankCB]) => Unit = null): Unit = {
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
    def insertOrUpdate(entityCall: (MbleServiceRank) => Unit)(implicit insertOptionCall: (ScrInsertOption[ServiceRankCB]) => Unit = null, updateOptionCall: (ScrUpdateOption[ServiceRankCB]) => Unit = null): Unit = {
        doInsertOrUpdate(callbackMbleEntityToDBable(entityCall), callbackInsertOption(insertOptionCall), callbackUpdateOption(updateOptionCall));
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * DbleServiceRank serviceRank = new DbleServiceRank();
     * serviceRank.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * serviceRank.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     serviceRankBhv.<span style="color: #DD4747">delete</span>(serviceRank);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param entityCall The callback for entity of delete. (NotNull, PrimaryKeyNotNull)
     * @param optionCall The callback for option of delete. (NoArgAllowed: then no option)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    def delete(entityCall: (MbleServiceRank) => Unit)(implicit optionCall: (ScrDeleteOption[ServiceRankCB]) => Unit = null): Unit = {
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
     *     DbleServiceRank serviceRank = new DbleServiceRank();
     *     serviceRank.setFooName("foo");
     *     if (...) {
     *         serviceRank.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     serviceRankList.add(serviceRank);
     * }
     * serviceRankBhv.<span style="color: #DD4747">batchInsert</span>(serviceRankList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param serviceRankList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    def batchInsert(batchCall: (ScrBatchEntityList[MbleServiceRank]) => Unit)(implicit optionCall: (ScrInsertOption[ServiceRankCB]) => Unit = null): Array[Int] = {
        return doBatchInsert(callbackBatch(batchCall), callbackInsertOption(optionCall));
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     DbleServiceRank serviceRank = new DbleServiceRank();
     *     serviceRank.setFooName("foo");
     *     if (...) {
     *         serviceRank.setFooPrice(123);
     *     } else {
     *         serviceRank.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//serviceRank.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     serviceRankList.add(serviceRank);
     * }
     * serviceRankBhv.<span style="color: #DD4747">batchUpdate</span>(serviceRankList);
     * </pre>
     * @param serviceRankList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    def batchUpdate(batchCall: (ScrBatchEntityList[MbleServiceRank]) => Unit)(implicit optionCall: (ScrUpdateOption[ServiceRankCB]) => Unit = null): Array[Int] = {
        return doBatchUpdate(callbackBatch(batchCall), callbackUpdateOption(optionCall));
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param serviceRankList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    def batchDelete(batchCall: (ScrBatchEntityList[MbleServiceRank]) => Unit)(implicit optionCall: (ScrDeleteOption[ServiceRankCB]) => Unit = null): Array[Int] = {
        return doBatchDelete(callbackBatch(batchCall), callbackDeleteOption(optionCall));
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * serviceRankBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;DbleServiceRank, ServiceRankCB&gt;() {
     *     public ConditionBean setup(DbleServiceRank entity, ServiceRankCB intoCB) {
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
    def queryInsert(setupperCall: (MbleServiceRank, ServiceRankCB) => ConditionBean): Int = {
        return doQueryInsert(callbackQueryInsertSetupper(setupperCall), null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * DbleServiceRank serviceRank = new DbleServiceRank();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//serviceRank.setPK...(value);</span>
     * serviceRank.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//serviceRank.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//serviceRank.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//serviceRank.setVersionNo(value);</span>
     * ServiceRankCB cb = new ServiceRankCB();
     * cb.query().setFoo...(value);
     * serviceRankBhv.<span style="color: #DD4747">queryUpdate</span>(serviceRank, cb);
     * </pre>
     * @param entityCall The callback for entity that contains update values. (NotNull)
     * @param cbCall The callback for condition-bean of ServiceRank. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    def queryUpdate(entityCall: (MbleServiceRank) => Unit)(cbCall: (ServiceRankCB) => Unit): Int = {
        assertObjectNotNull("entityCall", entityCall); assertObjectNotNull("cbCall", cbCall);
        return doQueryUpdate(callbackMbleEntityToDBable(entityCall), callbackCB(cbCall), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * ServiceRankCB cb = new ServiceRankCB();
     * cb.query().setFoo...(value);
     * serviceRankBhv.<span style="color: #DD4747">queryDelete</span>(serviceRank, cb);
     * </pre>
     * @param cbCall The callback for condition-bean of ServiceRank. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    def queryDelete(cbCall: (ServiceRankCB) => Unit): Int = {
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
    def outsideSql(): ScrOutsideSqlTypedBasicExecutor[ServiceRankBhv] = {
        val facadeExecutor: OutsideSqlAllFacadeExecutor[ServiceRankBhv] = doOutsideSql();
        return toImmutableOutsideSqlTypedBasicExecutor(facadeExecutor.xbasicExecutor()); // variable to resolve generic type
    }

    protected def toImmutableOutsideSqlTypedBasicExecutor(executor: OutsideSqlBasicExecutor[ServiceRankBhv]): ScrOutsideSqlTypedBasicExecutor[ServiceRankBhv] =
    { new ScrOutsideSqlTypedBasicExecutor(executor) }

    // ===================================================================================
    //                                                                     Callback Helper
    //                                                                     ===============
    protected def callbackCB(cbCall: (ServiceRankCB) => Unit): ServiceRankCB = {
        assertObjectNotNull("cbCall", cbCall);
        val cb = newConditionBean(); cbCall(cb); return cb;
    }

    protected def callbackBatch(batchCall: (ScrBatchEntityList[MbleServiceRank]) => Unit): List[DbleServiceRank] = {
        assertObjectNotNull("batchCall", batchCall);
        val batch = new ScrBatchEntityList[MbleServiceRank]();
        val entityList: List[DbleServiceRank] = new ArrayList[DbleServiceRank]();
        batch.entityCallList.asScala.map { entityCall =>
            val entity = newMbleEntity(); entityCall(entity); entity.toDBable;
        }
        return entityList;
    }

    protected def callbackMbleEntity(entityCall: (MbleServiceRank) => Unit): MbleServiceRank = {
        assertObjectNotNull("entityCall", entityCall);
        val entity = newMbleEntity(); entityCall(entity); return entity;
    }

    protected def callbackMbleEntityToDBable(entityCall: (MbleServiceRank) => Unit): DbleServiceRank = {
        return callbackMbleEntity(entityCall).toDBable;
    }

    protected def callbackInsertOption(optionCall: (ScrInsertOption[ServiceRankCB]) => Unit): InsertOption[ServiceRankCB] = {
        if (optionCall == null) { return null; }
        val option = new ScrInsertOption[ServiceRankCB](new InsertOption[ServiceRankCB]());
        optionCall(option); return option.toNative;
    }

    protected def callbackUpdateOption(optionCall: (ScrUpdateOption[ServiceRankCB]) => Unit): UpdateOption[ServiceRankCB] = {
        if (optionCall == null) { return null; }
        val option = new ScrUpdateOption[ServiceRankCB](new UpdateOption[ServiceRankCB]()); optionCall(option); return option.toNative;
    }

    protected def callbackDeleteOption(optionCall: (ScrDeleteOption[ServiceRankCB]) => Unit): DeleteOption[ServiceRankCB] = {
        if (optionCall == null) { return null; }
        val option = new ScrDeleteOption[ServiceRankCB](new DeleteOption[ServiceRankCB]()); optionCall(option); return option.toNative;
    }

    protected def callbackQueryInsertSetupper(setupperCall: (MbleServiceRank, ServiceRankCB) => ConditionBean): QueryInsertSetupper[DbleServiceRank, ServiceRankCB] = {
        assertObjectNotNull("setupperCall", setupperCall);
        return new QueryInsertSetupper[DbleServiceRank, ServiceRankCB]() {
            def setup(entity: DbleServiceRank, intoCB: ServiceRankCB): ConditionBean = {
                val mble = newMbleEntity();
                val resultCB = setupperCall(mble, intoCB);
                entity.acceptImmutable(mble.toImmutable());
                return resultCB;
            }
        };
    }

    protected def callbackLoader(dbleList: List[DbleServiceRank], loaderCall: (LoaderOfServiceRank) => Unit = null): Unit = {
        if (loaderCall == null) { return; }
        val loader = new LoaderOfServiceRank();
        loader.ready(dbleList.asInstanceOf[List[DbleServiceRank]], _behaviorSelector);
        loaderCall(loader);
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    override protected def typeOfSelectedEntity(): Class[DbleServiceRank] = { classOf[DbleServiceRank] }
    override protected def typeOfHandlingEntity(): Class[DbleServiceRank] = { classOf[DbleServiceRank] }
    override protected def typeOfHandlingConditionBean(): Class[ServiceRankCB] = { classOf[ServiceRankCB] }
    protected def newMbleEntity(): MbleServiceRank = { new MbleServiceRank() }
    protected def newPagingView(rb: PagingResultBean[DbleServiceRank]): ScrPagingView[ServiceRank] =
    { new ScrPagingView(toImmutableEntityList(rb), rb) }

    // ===================================================================================
    //                                                                        Scala Helper
    //                                                                        ============
    protected def toScalaList[ENTITY](javaList: Collection[ENTITY]): immutable.List[ENTITY] = {
        if (javaList == null) { immutable.List() }
        return javaList.toArray.toList.asInstanceOf[immutable.List[ENTITY]];
    }

    def toImmutableEntityList(dbleList: Collection[DbleServiceRank]): immutable.List[ServiceRank] =
    { toScalaList(dbleList).map(new ServiceRank(_)) }

    def toDBableEntityList(immuList: immutable.List[ServiceRank]): List[DbleServiceRank] =
    { immuList.map(new DbleServiceRank().acceptImmutable(_)).asJava }
}
