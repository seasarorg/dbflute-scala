package com.example.dbflute.scala.dbflute.bsbhv;

import scala.collection.JavaConverters._;

import java.util.Collection;
import java.util.List;

import org.seasar.dbflute._;
import org.seasar.dbflute.bhv._;
import org.seasar.dbflute.bhv.AbstractBehaviorReadable._;
import org.seasar.dbflute.bhv.AbstractBehaviorWritable._;
import org.seasar.dbflute.cbean._;
import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.exception._;
import org.seasar.dbflute.outsidesql.executor._;
import com.example.dbflute.scala.dbflute.allcommon.CDef;
import com.example.dbflute.scala.dbflute.exbhv._;
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
abstract class BsServiceRankBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    def getTableDbName(): String = { return "SERVICE_RANK"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    def getDBMeta(): DBMeta = { return ServiceRankDbm; }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    def newEntity(): Entity = { return newMyEntity(); }

    /** {@inheritDoc} */
    def newConditionBean(): ConditionBean = { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    def newMyEntity(): DbleServiceRank = { return new DbleServiceRank(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    def newMyConditionBean(): ServiceRankCB = { return new ServiceRankCB(); }

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
    def selectCount(cb: ServiceRankCB): Int = {
        return Integer2int(doSelectCountUniquely(cb));
    }

    protected def doSelectCountUniquely(cb: ServiceRankCB): Integer = { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected def doSelectCountPlainly(cb: ServiceRankCB): Integer = { // called by selectPage(cb)
        assertCBStateValid(cb);
        return delegateSelectCountPlainly(cb);
    }

    override protected def doReadCount(cb: ConditionBean): Int = {
        return selectCount(downcast(cb));
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
     * @param cb The condition-bean of DbleServiceRank. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get() of return value is called and the value is null, which means entity has already been deleted (point is not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    def selectEntity(cb: ServiceRankCB): Option[ServiceRank] = {
        return doSelectOptionalEntity(cb, classOf[DbleServiceRank]).map(f => new ServiceRank(f));
    }

    protected def doSelectEntity[ENTITY <: DbleServiceRank](cb: ServiceRankCB, tp: Class[ENTITY]): ENTITY = {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback[ENTITY, ServiceRankCB]() {
            def callbackSelectList(lcb: ServiceRankCB, ltp: Class[ENTITY]): List[ENTITY] = { return doSelectList(lcb, ltp); } });
    }

    protected def doSelectOptionalEntity[ENTITY <: DbleServiceRank](cb: ServiceRankCB, tp: Class[ENTITY]): Option[ENTITY] = {
        return Option.apply(doSelectEntity(cb, tp));
    }

    @Override
    protected def doReadEntity(cb: ConditionBean): Entity = {
        return doSelectEntity(downcast(cb), classOf[DbleServiceRank]);
    }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * ServiceRankCB cb = new ServiceRankCB();
     * cb.query().setFoo...(value);
     * DbleServiceRank serviceRank = serviceRankBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = serviceRank.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of DbleServiceRank. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (point is not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    def selectEntityWithDeletedCheck(cb: ServiceRankCB): ServiceRank = {
        return new ServiceRank(doSelectEntityWithDeletedCheck(cb, classOf[DbleServiceRank]));
    }

    protected def doSelectEntityWithDeletedCheck[ENTITY <: DbleServiceRank](cb: ServiceRankCB, tp: Class[ENTITY]): ENTITY = {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback[ENTITY, ServiceRankCB]() {
            def callbackSelectList(lcb: ServiceRankCB, ltp: Class[ENTITY]): List[ENTITY] = { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected def doReadEntityWithDeletedCheck(cb: ConditionBean): Entity = {
        return doSelectEntityWithDeletedCheck(downcast(cb), classOf[DbleServiceRank]);
    }

    /**
     * Select the entity by the primary-key value.
     * @param serviceRankCode (サービスランクコード): PK, NotNull, CHAR(3), classification=ServiceRank. (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    def selectByPK(serviceRankCode: CDef.ServiceRank): Option[ServiceRank] = {
        return doSelectByPK(serviceRankCode, classOf[DbleServiceRank]).map(f => new ServiceRank(f));
    }

    protected def doSelectByPK[ENTITY <: DbleServiceRank](serviceRankCode: CDef.ServiceRank, entityType: Class[ENTITY]): Option[ENTITY] = {
        return Option.apply(doSelectEntity(xprepareCBAsPK(serviceRankCode), entityType));
    }

    protected def xprepareCBAsPK(serviceRankCode: CDef.ServiceRank): ServiceRankCB = {
        assertObjectNotNull("serviceRankCode", serviceRankCode);
        val cb: ServiceRankCB = newMyConditionBean();
        cb.query().setServiceRankCode_Equal_AsServiceRank(serviceRankCode);
        return cb;
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
        return doSelectByUniqueOf(displayOrder, classOf[DbleServiceRank]).map(f => new ServiceRank(f));
    }

    protected def doSelectByUniqueOf[ENTITY <: DbleServiceRank](displayOrder: Integer, entityType: Class[ENTITY]): Option[ENTITY] = {
        return Option.apply(doSelectEntity(xprepareCBAsUniqueOf(displayOrder), entityType));
    }

    protected def xprepareCBAsUniqueOf(displayOrder: Integer): ServiceRankCB = {
        assertObjectNotNull("displayOrder", displayOrder);
        val cb: ServiceRankCB = newMyConditionBean(); cb.acceptUniqueOf(displayOrder);
        return cb;
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
     * @param cb The condition-bean of DbleServiceRank. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    def selectList(cb: ServiceRankCB): scala.collection.immutable.List[ServiceRank] = {
        val dbleList = doSelectList(cb, classOf[DbleServiceRank]);
        return toImmutableEntityList(dbleList);
    }

    protected def doSelectList[ENTITY <: DbleServiceRank](cb: ServiceRankCB, tp: Class[ENTITY]): ListResultBean[ENTITY] = {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback[ENTITY, ServiceRankCB]() {
            def callbackSelectList(lcb: ServiceRankCB, ltp: Class[ENTITY]): List[ENTITY] = { return delegateSelectList(lcb, ltp); } });
    }

    @Override
    protected def doReadList(cb: ConditionBean): ListResultBean[_ <: Entity] = {
        return doSelectList(downcast(cb), classOf[DbleServiceRank]); // use do method for ListResultBean
    }

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
     * @param cb The condition-bean of DbleServiceRank. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    def selectPage(cb: ServiceRankCB): PagingResultBean[DbleServiceRank] = {
        return doSelectPage(cb, classOf[DbleServiceRank]);
    }

    protected def doSelectPage[ENTITY <: DbleServiceRank](cb: ServiceRankCB, tp: Class[ENTITY]): PagingResultBean[ENTITY] = {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback[ENTITY, ServiceRankCB]() {
            def callbackSelectCount(cb: ServiceRankCB): Int = { return doSelectCountPlainly(cb); }
            def callbackSelectList(cb: ServiceRankCB, tp: Class[ENTITY]): List[ENTITY] = { return doSelectList(cb, tp); }
        });
    }

    @Override
    protected def doReadPage(cb: ConditionBean): PagingResultBean[_ <: Entity] = {
        return selectPage(downcast(cb));
    }

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
    def selectCursor(cb: ServiceRankCB, entityRowHandler: EntityRowHandler[DbleServiceRank]): Unit = {
        doSelectCursor(cb, entityRowHandler, classOf[DbleServiceRank]);
    }

    protected def doSelectCursor[ENTITY <: DbleServiceRank](cb: ServiceRankCB, handler: EntityRowHandler[ENTITY], tp: Class[ENTITY]): Unit = {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback[ENTITY, ServiceRankCB]() {
            def callbackSelectCursor(cb: ServiceRankCB, handler: EntityRowHandler[ENTITY], tp: Class[ENTITY]): Unit = { delegateSelectCursor(cb, handler, tp); }
            def callbackSelectList(cb: ServiceRankCB, tp: Class[ENTITY]): List[ENTITY] = { return doSelectList(cb, tp); }
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
    def scalarSelect[RESULT](resultType: Class[RESULT]): SLFunction[ServiceRankCB, RESULT] = {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected def doScalarSelect[RESULT, CB <: ServiceRankCB](tp: Class[RESULT], cb: CB): SLFunction[CB, RESULT] = {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction[RESULT, CB](cb, tp);
    }

    protected def createSLFunction[RESULT, CB <: ServiceRankCB](cb: CB, tp: Class[RESULT]): SLFunction[CB, RESULT] = {
        return new SLFunction[CB, RESULT](cb, tp);
    }

    protected def doReadScalar[RESULT](tp: Class[RESULT]): SLFunction[_ <: ConditionBean, RESULT] = {
        return doScalarSelect(tp, newMyConditionBean());
    }

    // ===================================================================================
    //                                                                            Sequence
    //                                                                            ========
    @Override
    protected def doReadNextVal(): Number = {
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
    def loadMemberServiceList(serviceRankList: scala.collection.immutable.List[DbleServiceRank], setupper: ReferrerConditionSetupper[MemberServiceCB]): NestedReferrerLoader[DbleMemberService] = {
        xassLRArg(serviceRankList.asJava, setupper); // #pending easy convert for now
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
    def loadMemberServiceList(serviceRank: DbleServiceRank, setupper: ReferrerConditionSetupper[MemberServiceCB]): NestedReferrerLoader[DbleMemberService] = {
        xassLRArg(serviceRank, setupper);
        return doLoadMemberServiceList(scala.collection.immutable.List.apply(serviceRank), new LoadReferrerOption[MemberServiceCB, DbleMemberService]().xinit(setupper));
    }

    protected def doLoadMemberServiceList(serviceRankList: scala.collection.immutable.List[DbleServiceRank], option: LoadReferrerOption[MemberServiceCB, DbleMemberService]): NestedReferrerLoader[DbleMemberService] = {
        val referrerBhv: MemberServiceBhv = xgetBSFLR().select(classOf[MemberServiceBhv]);
        return helpLoadReferrerInternally(serviceRankList.asJava, option, new InternalLoadReferrerCallback[DbleServiceRank, String, MemberServiceCB, DbleMemberService]() {
            def getPKVal(et: DbleServiceRank): String =
            { return et.getServiceRankCode(); }
            def setRfLs(et: DbleServiceRank, ls: List[DbleMemberService]): Unit =
            { et.setMemberServiceList(ls); }
            def newMyCB(): MemberServiceCB = { return referrerBhv.newMyConditionBean(); }
            def qyFKIn(cb: MemberServiceCB, ls: List[String]): Unit =
            { cb.query().setServiceRankCode_InScope(ls); }
            def qyOdFKAsc(cb: MemberServiceCB): Unit = { cb.query().addOrderBy_ServiceRankCode_Asc(); }
            def spFKCol(cb: MemberServiceCB): Unit = { cb.specify().columnServiceRankCode(); }
            def selRfLs(cb: MemberServiceCB): List[DbleMemberService] = { return referrerBhv.toDBableEntityList(referrerBhv.selectList(cb)); }
            def getFKVal(re: DbleMemberService): String = { return re.getServiceRankCode(); }
            def setlcEt(re: DbleMemberService, le: DbleServiceRank): Unit =
            { re.setServiceRank(Option.apply(le)); }
            def getRfPrNm(): String = { return "memberServiceList"; }
        });
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
    def extractServiceRankCodeList(serviceRankList: List[DbleServiceRank]): List[String] = {
        return helpExtractListInternally(serviceRankList, new InternalExtractCallback[DbleServiceRank, String]() {
            def getCV(et: DbleServiceRank): String = { return et.getServiceRankCode(); }
        });
    }

    /**
     * Extract the value list of (single) unique key displayOrder.
     * @param serviceRankList The list of serviceRank. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    def extractDisplayOrderList(serviceRankList: List[DbleServiceRank]): List[Integer] = {
        return helpExtractListInternally(serviceRankList, new InternalExtractCallback[DbleServiceRank, Integer]() {
            def getCV(et: DbleServiceRank): Integer = { return et.getDisplayOrder(); }
        });
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
     * @param serviceRank The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    def insert(serviceRank: DbleServiceRank): Unit = {
        doInsert(serviceRank, null);
    }

    protected def doInsert(serviceRank: DbleServiceRank, op: InsertOption[ServiceRankCB]): Unit = {
        assertObjectNotNull("serviceRank", serviceRank);
        prepareInsertOption(op);
        delegateInsert(serviceRank, op);
    }

    protected def prepareInsertOption(op: InsertOption[ServiceRankCB]): Unit = {
        if (op == null) { return; }
        assertInsertOptionStatus(op);
        if (op.hasSpecifiedInsertColumn()) {
            op.resolveInsertColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    @Override
    protected def doCreate(et: Entity, op: InsertOption[_ <: ConditionBean]): Unit = {
        if (op == null) { insert(downcast(et)); }
        else { varyingInsert(downcast(et), downcast(op)); }
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
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * serviceRank.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     serviceRankBhv.<span style="color: #DD4747">update</span>(serviceRank);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param serviceRank The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    def update(setting: (MbleServiceRank) => Unit): Unit = {
        val mble = new MbleServiceRank();
        setting(mble);
        doUpdate(mble.toDBableEntity, null);
    }

    protected def doUpdate(serviceRank: DbleServiceRank, op: UpdateOption[ServiceRankCB]): Unit = {
        assertObjectNotNull("serviceRank", serviceRank);
        prepareUpdateOption(op);
        helpUpdateInternally(serviceRank, new InternalUpdateCallback[DbleServiceRank]() {
            def callbackDelegateUpdate(et: DbleServiceRank): Int = { return delegateUpdate(et, op); } });
    }

    protected def prepareUpdateOption(op: UpdateOption[ServiceRankCB]): Unit = {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected def createCBForVaryingUpdate(): ServiceRankCB = {
        val cb: ServiceRankCB = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected def createCBForSpecifiedUpdate(): ServiceRankCB = {
        val cb: ServiceRankCB = newMyConditionBean();
        cb.xsetupForSpecifiedUpdate();
        return cb;
    }

    @Override
    protected def doModify(et: Entity, op: UpdateOption[_ <: ConditionBean]): Unit = {
        if (op == null) { doUpdate(downcast(et), null); }
        else { varyingUpdate(downcast(et), downcast(op)); }
    }

    @Override
    protected def doModifyNonstrict(et: Entity, op: UpdateOption[_ <: ConditionBean]): Unit = {
        doModify(et, op);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param serviceRank The entity of insert or update target. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    def insertOrUpdate(serviceRank: DbleServiceRank): Unit = {
        doInesrtOrUpdate(serviceRank, null, null);
    }

    protected def doInesrtOrUpdate(serviceRank: DbleServiceRank, iop: InsertOption[ServiceRankCB], uop: UpdateOption[ServiceRankCB]): Unit = {
        helpInsertOrUpdateInternally(serviceRank, new InternalInsertOrUpdateCallback[DbleServiceRank, ServiceRankCB]() {
            def callbackInsert(et: DbleServiceRank): Unit = { doInsert(et, iop); }
            def callbackUpdate(et: DbleServiceRank): Unit = { doUpdate(et, uop); }
            def callbackNewMyConditionBean(): ServiceRankCB = { return newMyConditionBean(); }
            def callbackSelectCount(cb: ServiceRankCB): Int = { return selectCount(cb); }
        });
    }

    @Override
    protected def doCreateOrModify(et: Entity, iop: InsertOption[_ <: ConditionBean], uop: UpdateOption[_ <: ConditionBean]): Unit = {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            val niop = if (iop != null) { iop } else { new InsertOption[ServiceRankCB]() };
            val nuop = if (uop != null) { uop } else { new UpdateOption[ServiceRankCB]() };
            varyingInsertOrUpdate(downcast(et), downcast(niop), downcast(nuop));
        }
    }

    @Override
    protected def doCreateOrModifyNonstrict(et: Entity, iop: InsertOption[_ <: ConditionBean], uop: UpdateOption[_ <: ConditionBean]): Unit = {
        doCreateOrModify(et, iop, uop);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * DbleServiceRank serviceRank = new DbleServiceRank();
     * serviceRank.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * serviceRank.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     serviceRankBhv.<span style="color: #DD4747">delete</span>(serviceRank);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param serviceRank The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    def delete(serviceRank: DbleServiceRank): Unit = {
        doDelete(serviceRank, null);
    }

    protected def doDelete(serviceRank: DbleServiceRank, op: DeleteOption[ServiceRankCB]): Unit = {
        assertObjectNotNull("serviceRank", serviceRank);
        prepareDeleteOption(op);
        helpDeleteInternally(serviceRank, new InternalDeleteCallback[DbleServiceRank]() {
            def callbackDelegateDelete(et: DbleServiceRank): Int = { return delegateDelete(et, op); } });
    }

    protected def prepareDeleteOption(op: DeleteOption[ServiceRankCB]): Unit = {
        if (op == null) { return; }
        assertDeleteOptionStatus(op);
    }

    @Override
    protected def doRemove(et: Entity, op: DeleteOption[_ <: ConditionBean]): Unit = {
        if (op == null) { delete(downcast(et)); }
        else { varyingDelete(downcast(et), downcast(op)); }
    }

    @Override
    protected def doRemoveNonstrict(et: Entity, op: DeleteOption[_ <: ConditionBean]): Unit = {
        doRemove(et, op);
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
    def batchInsert(serviceRankList: scala.collection.immutable.List[DbleServiceRank]): Array[Int] = {
        val op: InsertOption[ServiceRankCB] = createInsertUpdateOption();
        return doBatchInsert(serviceRankList.asJava, op);
    }

    protected def doBatchInsert(serviceRankList: List[DbleServiceRank], op: InsertOption[ServiceRankCB]): Array[Int] = {
        assertObjectNotNull("serviceRankList", serviceRankList);
        prepareBatchInsertOption(serviceRankList, op);
        return delegateBatchInsert(serviceRankList, op);
    }

    protected def prepareBatchInsertOption(serviceRankList: List[DbleServiceRank], op: InsertOption[ServiceRankCB]): Unit = {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(serviceRankList);
        prepareInsertOption(op);
    }

    @Override
    protected def doLumpCreate(ls: List[Entity], op: InsertOption[_ <: ConditionBean]): Array[Int] = {
        if (op == null) { return batchInsert(toScalaList(downcast(ls))); }
        else { return varyingBatchInsert(toScalaList(downcast(ls)), downcast(op)); }
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
    def batchUpdate(serviceRankList: scala.collection.immutable.List[DbleServiceRank]): Array[Int] = {
        val op: UpdateOption[ServiceRankCB] = createPlainUpdateOption();
        return doBatchUpdate(serviceRankList.asJava, op);
    }

    protected def doBatchUpdate(serviceRankList: List[DbleServiceRank], op: UpdateOption[ServiceRankCB]): Array[Int] = {
        assertObjectNotNull("serviceRankList", serviceRankList);
        prepareBatchUpdateOption(serviceRankList, op);
        return delegateBatchUpdate(serviceRankList, op);
    }

    protected def prepareBatchUpdateOption(serviceRankList: List[DbleServiceRank], op: UpdateOption[ServiceRankCB]): Unit = {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(serviceRankList);
        prepareUpdateOption(op);
    }

    @Override
    protected def doLumpModify(ls: List[Entity], op: UpdateOption[_ <: ConditionBean]): Array[Int] = {
        if (op == null) { return batchUpdate(toScalaList(downcast(ls))); }
        else { return varyingBatchUpdate(toScalaList(downcast(ls)), downcast(op)); }
    }

    /**
     * Batch-update the entity list specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * serviceRankBhv.<span style="color: #DD4747">batchUpdate</span>(serviceRankList, new SpecifyQuery[ServiceRankCB]() {
     *     public void specify(ServiceRankCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * serviceRankBhv.<span style="color: #DD4747">batchUpdate</span>(serviceRankList, new SpecifyQuery[ServiceRankCB]() {
     *     public void specify(ServiceRankCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param serviceRankList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    def batchUpdate(serviceRankList: scala.collection.immutable.List[DbleServiceRank], updateColumnSpec: SpecifyQuery[ServiceRankCB]): Array[Int] = {
        return doBatchUpdate(serviceRankList.asJava, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected def doLumpModifyNonstrict(ls: List[Entity], op: UpdateOption[_ <: ConditionBean]): Array[Int] = {
        return doLumpModify(ls, op);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param serviceRankList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    def batchDelete(serviceRankList: scala.collection.immutable.List[DbleServiceRank]): Array[Int] = {
        return doBatchDelete(serviceRankList.asJava, null);
    }

    protected def doBatchDelete(serviceRankList: List[DbleServiceRank], op: DeleteOption[ServiceRankCB]): Array[Int] = {
        assertObjectNotNull("serviceRankList", serviceRankList);
        prepareDeleteOption(op);
        return delegateBatchDelete(serviceRankList, op);
    }

    @Override
    protected def doLumpRemove(ls: List[Entity], op: DeleteOption[_ <: ConditionBean]): Array[Int] = {
        if (op == null) { return batchDelete(toScalaList(downcast(ls))); }
        else { return varyingBatchDelete(toScalaList(downcast(ls)), downcast(op)); }
    }

    @Override
    protected def doLumpRemoveNonstrict(ls: List[Entity], op: DeleteOption[_ <: ConditionBean]): Array[Int] = {
        return doLumpRemove(ls, op);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * serviceRankBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;DbleServiceRank, ServiceRankCB&gt;() {
     *     public ConditionBean setup(serviceRank entity, ServiceRankCB intoCB) {
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
     *         <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     *         <span style="color: #3F7E5E">//entity.setVersionNo(value);</span>
     *
     *         return cb;
     *     }
     * });
     * </pre>
     * @param setupper The setup-per of query-insert. (NotNull)
     * @return The inserted count.
     */
    def queryInsert(setupper: QueryInsertSetupper[DbleServiceRank, ServiceRankCB]): Int = {
        return Integer2int(doQueryInsert(setupper, null));
    }

    protected def doQueryInsert(sp: QueryInsertSetupper[DbleServiceRank, ServiceRankCB], op: InsertOption[ServiceRankCB]): Integer = {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        val e: DbleServiceRank = new DbleServiceRank();
        val cb: ServiceRankCB = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
    }

    protected def createCBForQueryInsert(): ServiceRankCB = {
        val cb: ServiceRankCB = newMyConditionBean();
        cb.xsetupForQueryInsert();
        return cb;
    }

    @Override
    protected def doRangeCreate(setupper: QueryInsertSetupper[_ <: Entity, _ <: ConditionBean], option: InsertOption[_ <: ConditionBean]): Int = {
        if (option == null) { return queryInsert(downcast(setupper)); }
        else { return varyingQueryInsert(downcast(setupper), downcast(option)); }
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
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//serviceRank.setVersionNo(value);</span>
     * ServiceRankCB cb = new ServiceRankCB();
     * cb.query().setFoo...(value);
     * serviceRankBhv.<span style="color: #DD4747">queryUpdate</span>(serviceRank, cb);
     * </pre>
     * @param serviceRank The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of DbleServiceRank. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    def queryUpdate(serviceRank: DbleServiceRank, cb: ServiceRankCB): Int = {
        return Integer2int(doQueryUpdate(serviceRank, cb, null));
    }

    protected def doQueryUpdate(serviceRank: DbleServiceRank, cb: ServiceRankCB, op: UpdateOption[ServiceRankCB]): Integer = {
        assertObjectNotNull("serviceRank", serviceRank); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return if (checkCountBeforeQueryUpdateIfNeeds(cb)) { delegateQueryUpdate(serviceRank, cb, op) } else { 0 };
    }

    @Override
    protected def doRangeModify(et: Entity, cb: ConditionBean, op: UpdateOption[_ <: ConditionBean]): Int = {
        if (op == null) { return queryUpdate(downcast(et), cb.asInstanceOf[ServiceRankCB]); }
        else { return varyingQueryUpdate(downcast(et), cb.asInstanceOf[ServiceRankCB], downcast(op)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * ServiceRankCB cb = new ServiceRankCB();
     * cb.query().setFoo...(value);
     * serviceRankBhv.<span style="color: #DD4747">queryDelete</span>(serviceRank, cb);
     * </pre>
     * @param cb The condition-bean of DbleServiceRank. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    def queryDelete(cb: ServiceRankCB): Int = {
        return Integer2int(doQueryDelete(cb, null));
    }

    protected def doQueryDelete(cb: ServiceRankCB, op: DeleteOption[ServiceRankCB]): Integer = {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return if (checkCountBeforeQueryUpdateIfNeeds(cb)) { delegateQueryDelete(cb, op) } else { 0 };
    }

    @Override
    protected def doRangeRemove(cb: ConditionBean, op: DeleteOption[_ <: ConditionBean]): Int = {
        if (op == null) { return queryDelete(cb.asInstanceOf[ServiceRankCB]); }
        else { return varyingQueryDelete(cb.asInstanceOf[ServiceRankCB], downcast(op)); }
    }

    // ===================================================================================
    //                                                                      Varying Update
    //                                                                      ==============
    // -----------------------------------------------------
    //                                         Entity Update
    //                                         -------------
    /**
     * Insert the entity with varying requests. <br />
     * For example, disableCommonColumnAutoSetup(), disablePrimaryKeyIdentity(). <br />
     * Other specifications are same as insert(entity).
     * <pre>
     * DbleServiceRank serviceRank = new DbleServiceRank();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * serviceRank.setFoo...(value);
     * serviceRank.setBar...(value);
     * InsertOption[ServiceRankCB] option = new InsertOption[ServiceRankCB]();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * serviceRankBhv.<span style="color: #DD4747">varyingInsert</span>(serviceRank, option);
     * ... = serviceRank.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param serviceRank The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    def varyingInsert(serviceRank: DbleServiceRank, option: InsertOption[ServiceRankCB]): Unit = {
        assertInsertOptionNotNull(option);
        doInsert(serviceRank, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * DbleServiceRank serviceRank = new DbleServiceRank();
     * serviceRank.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * serviceRank.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * serviceRank.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;ServiceRankCB&gt; option = new UpdateOption&lt;ServiceRankCB&gt;();
     *     option.self(new SpecifyQuery&lt;ServiceRankCB&gt;() {
     *         public void specify(ServiceRankCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     serviceRankBhv.<span style="color: #DD4747">varyingUpdate</span>(serviceRank, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param serviceRank The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    def varyingUpdate(serviceRank: DbleServiceRank, option: UpdateOption[ServiceRankCB]): Unit = {
        assertUpdateOptionNotNull(option);
        doUpdate(serviceRank, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param serviceRank The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    def varyingInsertOrUpdate(serviceRank: DbleServiceRank, insertOption: InsertOption[ServiceRankCB], updateOption: UpdateOption[ServiceRankCB]): Unit = {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(serviceRank, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param serviceRank The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    def varyingDelete(serviceRank: DbleServiceRank, option: DeleteOption[ServiceRankCB]): Unit = {
        assertDeleteOptionNotNull(option);
        doDelete(serviceRank, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param serviceRankList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    def varyingBatchInsert(serviceRankList: scala.collection.immutable.List[DbleServiceRank], option: InsertOption[ServiceRankCB]): Array[Int] = {
        assertInsertOptionNotNull(option);
        return doBatchInsert(serviceRankList.asJava, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param serviceRankList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    def varyingBatchUpdate(serviceRankList: scala.collection.immutable.List[DbleServiceRank], option: UpdateOption[ServiceRankCB]): Array[Int] = {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(serviceRankList.asJava, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param serviceRankList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    def varyingBatchDelete(serviceRankList: scala.collection.immutable.List[DbleServiceRank], option: DeleteOption[ServiceRankCB]): Array[Int] = {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(serviceRankList.asJava, option);
    }

    // -----------------------------------------------------
    //                                          Query Update
    //                                          ------------
    /**
     * Insert the several entities by query with varying requests (modified-only for fixed value). <br />
     * For example, disableCommonColumnAutoSetup(), disablePrimaryKeyIdentity(). <br />
     * Other specifications are same as queryInsert(entity, setupper).
     * @param setupper The setup-per of query-insert. (NotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The inserted count.
     */
    def varyingQueryInsert(setupper: QueryInsertSetupper[DbleServiceRank, ServiceRankCB], option: InsertOption[ServiceRankCB]): Integer = {
        assertInsertOptionNotNull(option);
        return doQueryInsert(setupper, option);
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br />
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * DbleServiceRank serviceRank = new DbleServiceRank();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//serviceRank.setPK...(value);</span>
     * serviceRank.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//serviceRank.setVersionNo(value);</span>
     * ServiceRankCB cb = new ServiceRankCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;ServiceRankCB&gt; option = new UpdateOption&lt;ServiceRankCB&gt;();
     * option.self(new SpecifyQuery&lt;ServiceRankCB&gt;() {
     *     public void specify(ServiceRankCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * serviceRankBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(serviceRank, cb, option);
     * </pre>
     * @param serviceRank The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of DbleServiceRank. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    def varyingQueryUpdate(serviceRank: DbleServiceRank, cb: ServiceRankCB, option: UpdateOption[ServiceRankCB]): Integer = {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(serviceRank, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of DbleServiceRank. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    def varyingQueryDelete(cb: ServiceRankCB, option: DeleteOption[ServiceRankCB]): Integer = {
        assertDeleteOptionNotNull(option);
        return doQueryDelete(cb, option);
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
    def outsideSql(): OutsideSqlBasicExecutor[ServiceRankBhv] = {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected def delegateSelectCountUniquely(cb: ServiceRankCB): Integer = { return invoke(createSelectCountCBCommand(cb, true)); }
    protected def delegateSelectCountPlainly(cb: ServiceRankCB): Integer = { return invoke(createSelectCountCBCommand(cb, false)); }
    protected def delegateSelectCursor[ENTITY <: DbleServiceRank](cb: ServiceRankCB, rh: EntityRowHandler[ENTITY], tp: Class[ENTITY])
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected def delegateSelectList[ENTITY <: DbleServiceRank](cb: ServiceRankCB, tp: Class[ENTITY]): List[ENTITY] =
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected def delegateInsert(et: DbleServiceRank, op: InsertOption[ServiceRankCB]): Integer =
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected def delegateUpdate(et: DbleServiceRank, op: UpdateOption[ServiceRankCB]): Integer =
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return delegateUpdateNonstrict(et, op); }
    protected def delegateUpdateNonstrict(et: DbleServiceRank, op: UpdateOption[ServiceRankCB]): Integer =
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected def delegateDelete(et: DbleServiceRank, op: DeleteOption[ServiceRankCB]): Integer =
    { if (!processBeforeDelete(et, op)) { return 0; }
      return delegateDeleteNonstrict(et, op); }
    protected def delegateDeleteNonstrict(et: DbleServiceRank, op: DeleteOption[ServiceRankCB]): Integer =
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected def delegateBatchInsert(ls: List[DbleServiceRank], op: InsertOption[ServiceRankCB]): Array[Int] =
    { if (ls.isEmpty()) { return new Array[Int](0); }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)).asInstanceOf[Array[Int]]; }
    protected def delegateBatchUpdate(ls: List[DbleServiceRank], op: UpdateOption[ServiceRankCB]): Array[Int] =
    { if (ls.isEmpty()) { return new Array[Int](0); }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected def delegateBatchUpdateNonstrict(ls: List[DbleServiceRank], op: UpdateOption[ServiceRankCB]): Array[Int] =
    { if (ls.isEmpty()) { return new Array[Int](0); }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)).asInstanceOf[Array[Int]]; }
    protected def delegateBatchDelete(ls: List[DbleServiceRank], op: DeleteOption[ServiceRankCB]): Array[Int] =
    { if (ls.isEmpty()) { return new Array[Int](0); }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected def delegateBatchDeleteNonstrict(ls: List[DbleServiceRank], op: DeleteOption[ServiceRankCB]): Array[Int] =
    { if (ls.isEmpty()) { return new Array[Int](0); }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)).asInstanceOf[Array[Int]]; }

    protected def delegateQueryInsert(et: DbleServiceRank, inCB: ServiceRankCB, resCB: ConditionBean, op: InsertOption[ServiceRankCB]): Integer =
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; }
      return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected def delegateQueryUpdate(et: DbleServiceRank, cb: ServiceRankCB, op: UpdateOption[ServiceRankCB]): Integer =
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; }
      return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected def delegateQueryDelete(cb: ServiceRankCB, op: DeleteOption[ServiceRankCB]): Integer =
    { if (!processBeforeQueryDelete(cb, op)) { return 0; }
      return invoke(createQueryDeleteCBCommand(cb, op));  }

    // ===================================================================================
    //                                                                Optimistic Lock Info
    //                                                                ====================
    /**
     * {@inheritDoc}
     */
    @Override
    protected def hasVersionNoValue(et: Entity): Boolean = {
        return false;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected def hasUpdateDateValue(et: Entity): Boolean = {
        return false;
    }

    // ===================================================================================
    //                                                                     Downcast Helper
    //                                                                     ===============
    protected def downcast(et: Entity): DbleServiceRank = {
        return helpEntityDowncastInternally(et, classOf[DbleServiceRank]);
    }

    protected def downcast(cb: ConditionBean): ServiceRankCB = {
        return helpConditionBeanDowncastInternally(cb, classOf[ServiceRankCB]);
    }

    protected def downcast(ls: List[_ <: Entity]): List[DbleServiceRank] = {
        return ls.asInstanceOf[List[DbleServiceRank]];
    }

    protected def downcast(op: InsertOption[_ <: ConditionBean]): InsertOption[ServiceRankCB] = {
        return op.asInstanceOf[InsertOption[ServiceRankCB]];
    }

    protected def downcast(op: UpdateOption[_ <: ConditionBean]): UpdateOption[ServiceRankCB] = {
        return op.asInstanceOf[UpdateOption[ServiceRankCB]];
    }

    protected def downcast(op: DeleteOption[_ <: ConditionBean]): DeleteOption[ServiceRankCB] = {
        return op.asInstanceOf[DeleteOption[ServiceRankCB]];
    }

    protected def downcast(sp: QueryInsertSetupper[_ <: Entity, _ <: ConditionBean]): QueryInsertSetupper[DbleServiceRank, ServiceRankCB] = {
        return sp.asInstanceOf[QueryInsertSetupper[DbleServiceRank, ServiceRankCB]];
    }

    // ===================================================================================
    //                                                                        Scala Helper
    //                                                                        ============
    protected def toScalaList[ENTITY](javaList: Collection[ENTITY]): scala.collection.immutable.List[ENTITY] = {
        if (javaList == null) { scala.collection.immutable.List() }
        return scala.collection.immutable.List.fromArray(javaList.toArray()).asInstanceOf[scala.collection.immutable.List[ENTITY]];
    }

    def toImmutableEntityList(dbleList: Collection[DbleServiceRank]): scala.collection.immutable.List[ServiceRank] = {
        return toScalaList(dbleList).map(new ServiceRank(_))
    }

    def toDBableEntityList(immuList: scala.collection.immutable.List[ServiceRank]): List[DbleServiceRank] = {
        return immuList.map(new DbleServiceRank().acceptImmutableEntity(_)).asJava
    }
}
