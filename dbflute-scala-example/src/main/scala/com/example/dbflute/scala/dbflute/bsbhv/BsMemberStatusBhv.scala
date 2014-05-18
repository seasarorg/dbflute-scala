package com.example.dbflute.scala.dbflute.bsbhv;

import scala.collection.JavaConverters._;

import java.util.List;

import org.seasar.dbflute._;
import org.seasar.dbflute.bhv._;
import org.seasar.dbflute.bhv.AbstractBehaviorReadable._;
import org.seasar.dbflute.bhv.AbstractBehaviorWritable._;
import org.seasar.dbflute.cbean._;
import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.exception._;
import org.seasar.dbflute.optional._;
import org.seasar.dbflute.outsidesql.executor._;
import com.example.dbflute.scala.dbflute.exbhv._;
import com.example.dbflute.scala.dbflute.exentity._;
import com.example.dbflute.scala.dbflute.bsentity.dbmeta._;
import com.example.dbflute.scala.dbflute.cbean._;

/**
 * The behavior of (会員ステータス)MEMBER_STATUS as TABLE. <br />
 * <pre>
 * [primary key]
 *     MEMBER_STATUS_CODE
 *
 * [column]
 *     MEMBER_STATUS_CODE, MEMBER_STATUS_NAME, DESCRIPTION, DISPLAY_ORDER
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
 *     MEMBER
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     memberList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
abstract class BsMemberStatusBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    def getTableDbName(): String = { return "MEMBER_STATUS"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    def getDBMeta(): DBMeta = { return MemberStatusDbm; }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    def newEntity(): Entity = { return newMyEntity(); }

    /** {@inheritDoc} */
    def newConditionBean(): ConditionBean = { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    def newMyEntity(): MemberStatus = { return new MemberStatus(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    def newMyConditionBean(): MemberStatusCB = { return new MemberStatusCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * MemberStatusCB cb = new MemberStatusCB();
     * cb.query().setFoo...(value);
     * int count = memberStatusBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of MemberStatus. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    def selectCount(cb: MemberStatusCB): Integer = {
        return doSelectCountUniquely(cb);
    }

    protected def doSelectCountUniquely(cb: MemberStatusCB): Integer = { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected def doSelectCountPlainly(cb: MemberStatusCB): Integer = { // called by selectPage(cb)
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
     * MemberStatusCB cb = new MemberStatusCB();
     * cb.query().setFoo...(value);
     * OptionalEntity&lt;MemberStatus&gt; entity = memberStatusBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     *
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * entity.<span style="color: #DD4747">required</span>(memberStatus -&gt; {
     *     ...
     * });
     * MemberStatus memberStatus = entity.entity.<span style="color: #DD4747">get()</span>;
     *
     * <span style="color: #3F7E5E">// if it might be no data, ifPresent(), isPresent(), ...</span>
     * entity.<span style="color: #DD4747">ifPresent</span>(memberStatus -&gt; {
     *     ...
     * });
     * if (entity.entity.<span style="color: #DD4747">isPresent()</span>) {
     *     MemberStatus memberStatus = entity.entity.<span style="color: #DD4747">get()</span>;
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of MemberStatus. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get() of return value is called and the value is null, which means entity has already been deleted (point is not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    def selectEntity(cb: MemberStatusCB): OptionalEntity[MemberStatus] = {
        return doSelectOptionalEntity(cb, classOf[MemberStatus]);
    }

    protected def doSelectEntity[ENTITY <: MemberStatus](cb: MemberStatusCB, tp: Class[ENTITY]): ENTITY = {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback[ENTITY, MemberStatusCB]() {
            def callbackSelectList(lcb: MemberStatusCB, ltp: Class[ENTITY]): List[ENTITY] = { return doSelectList(lcb, ltp); } });
    }

    protected def doSelectOptionalEntity[ENTITY <: MemberStatus](cb: MemberStatusCB, tp: Class[ENTITY]): OptionalEntity[ENTITY] = {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    @Override
    protected def doReadEntity(cb: ConditionBean): Entity = {
        return selectEntity(downcast(cb)).orElseNull();
    }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * MemberStatusCB cb = new MemberStatusCB();
     * cb.query().setFoo...(value);
     * MemberStatus memberStatus = memberStatusBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = memberStatus.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of MemberStatus. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (point is not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    def selectEntityWithDeletedCheck(cb: MemberStatusCB): MemberStatus = {
        return doSelectEntityWithDeletedCheck(cb, classOf[MemberStatus]);
    }

    protected def doSelectEntityWithDeletedCheck[ENTITY <: MemberStatus](cb: MemberStatusCB, tp: Class[ENTITY]): ENTITY = {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback[ENTITY, MemberStatusCB]() {
            def callbackSelectList(lcb: MemberStatusCB, ltp: Class[ENTITY]): List[ENTITY] = { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected def doReadEntityWithDeletedCheck(cb: ConditionBean): Entity = {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param memberStatusCode The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    def selectByPKValue(memberStatusCode: String): MemberStatus = {
        return doSelectByPKValue(memberStatusCode, classOf[MemberStatus]);
    }

    protected def doSelectByPKValue[ENTITY <: MemberStatus](memberStatusCode: String, entityType: Class[ENTITY]): ENTITY = {
        return doSelectEntity(buildPKCB(memberStatusCode), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param memberStatusCode The one of primary key. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    def selectByPKValueWithDeletedCheck(memberStatusCode: String): MemberStatus = {
        return doSelectByPKValueWithDeletedCheck(memberStatusCode, classOf[MemberStatus]);
    }

    protected def doSelectByPKValueWithDeletedCheck[ENTITY <: MemberStatus](memberStatusCode: String, entityType: Class[ENTITY]): ENTITY = {
        return doSelectEntityWithDeletedCheck(buildPKCB(memberStatusCode), entityType);
    }

    private def buildPKCB(memberStatusCode: String): MemberStatusCB = {
        assertObjectNotNull("memberStatusCode", memberStatusCode);
        val cb: MemberStatusCB = newMyConditionBean();
        cb.query().setMemberStatusCode_Equal(memberStatusCode);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * MemberStatusCB cb = new MemberStatusCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;MemberStatus&gt; memberStatusList = memberStatusBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (MemberStatus memberStatus : memberStatusList) {
     *     ... = memberStatus.get...();
     * }
     * </pre>
     * @param cb The condition-bean of MemberStatus. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    def selectList(cb: MemberStatusCB): scala.collection.immutable.List[MemberStatus] = {
        val javaList = doSelectList(cb, classOf[MemberStatus]);
        return toScalaList(javaList);
    }

    protected def doSelectList[ENTITY <: MemberStatus](cb: MemberStatusCB, tp: Class[ENTITY]): ListResultBean[ENTITY] = {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback[ENTITY, MemberStatusCB]() {
            def callbackSelectList(lcb: MemberStatusCB, ltp: Class[ENTITY]): List[ENTITY] = { return delegateSelectList(lcb, ltp); } });
    }

    @Override
    protected def doReadList(cb: ConditionBean): ListResultBean[_ <: Entity] = {
        return doSelectList(downcast(cb), classOf[MemberStatus]); // use do method for ListResultBean
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * MemberStatusCB cb = new MemberStatusCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;MemberStatus&gt; page = memberStatusBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (MemberStatus memberStatus : page) {
     *     ... = memberStatus.get...();
     * }
     * </pre>
     * @param cb The condition-bean of MemberStatus. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    def selectPage(cb: MemberStatusCB): PagingResultBean[MemberStatus] = {
        return doSelectPage(cb, classOf[MemberStatus]);
    }

    protected def doSelectPage[ENTITY <: MemberStatus](cb: MemberStatusCB, tp: Class[ENTITY]): PagingResultBean[ENTITY] = {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback[ENTITY, MemberStatusCB]() {
            def callbackSelectCount(cb: MemberStatusCB): Int = { return doSelectCountPlainly(cb); }
            def callbackSelectList(cb: MemberStatusCB, tp: Class[ENTITY]): List[ENTITY] = { return doSelectList(cb, tp); }
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
     * MemberStatusCB cb = new MemberStatusCB();
     * cb.query().setFoo...(value);
     * memberStatusBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;MemberStatus&gt;() {
     *     public void handle(MemberStatus entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of MemberStatus. (NotNull)
     * @param entityRowHandler The handler of entity row of MemberStatus. (NotNull)
     */
    def selectCursor(cb: MemberStatusCB, entityRowHandler: EntityRowHandler[MemberStatus]): Unit = {
        doSelectCursor(cb, entityRowHandler, classOf[MemberStatus]);
    }

    protected def doSelectCursor[ENTITY <: MemberStatus](cb: MemberStatusCB, handler: EntityRowHandler[ENTITY], tp: Class[ENTITY]): Unit = {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback[ENTITY, MemberStatusCB]() {
            def callbackSelectCursor(cb: MemberStatusCB, handler: EntityRowHandler[ENTITY], tp: Class[ENTITY]): Unit = { delegateSelectCursor(cb, handler, tp); }
            def callbackSelectList(cb: MemberStatusCB, tp: Class[ENTITY]): List[ENTITY] = { return doSelectList(cb, tp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * memberStatusBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(MemberStatusCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    def scalarSelect[RESULT](resultType: Class[RESULT]): SLFunction[MemberStatusCB, RESULT] = {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected def doScalarSelect[RESULT, CB <: MemberStatusCB](tp: Class[RESULT], cb: CB): SLFunction[CB, RESULT] = {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction[RESULT, CB](cb, tp);
    }

    protected def createSLFunction[RESULT, CB <: MemberStatusCB](cb: CB, tp: Class[RESULT]): SLFunction[CB, RESULT] = {
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
     * Load referrer of memberList by the set-upper of referrer. <br />
     * (会員)MEMBER by MEMBER_STATUS_CODE, named 'memberList'.
     * <pre>
     * memberStatusBhv.<span style="color: #DD4747">loadMemberList</span>(memberStatusList, new ReferrerConditionSetupper&lt;MemberCB&gt;() {
     *     public void setup(MemberCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * for (MemberStatus memberStatus : memberStatusList) {
     *     ... = memberStatus.<span style="color: #DD4747">getMemberList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMemberStatusCode_InScope(pkList);
     * cb.query().addOrderBy_MemberStatusCode_Asc();
     * </pre>
     * @param memberStatusList The entity list of memberStatus. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    def loadMemberList(memberStatusList: scala.collection.immutable.List[MemberStatus], setupper: ReferrerConditionSetupper[MemberCB]): NestedReferrerLoader[Member] = {
        xassLRArg(memberStatusList.asJava, setupper); // #pending easy convert for now
        return doLoadMemberList(memberStatusList, new LoadReferrerOption[MemberCB, Member]().xinit(setupper));
    }

    /**
     * Load referrer of memberList by the set-upper of referrer. <br />
     * (会員)MEMBER by MEMBER_STATUS_CODE, named 'memberList'.
     * <pre>
     * memberStatusBhv.<span style="color: #DD4747">loadMemberList</span>(memberStatusList, new ReferrerConditionSetupper&lt;MemberCB&gt;() {
     *     public void setup(MemberCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = memberStatus.<span style="color: #DD4747">getMemberList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMemberStatusCode_InScope(pkList);
     * cb.query().addOrderBy_MemberStatusCode_Asc();
     * </pre>
     * @param memberStatus The entity of memberStatus. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    def loadMemberList(memberStatus: MemberStatus, setupper: ReferrerConditionSetupper[MemberCB]): NestedReferrerLoader[Member] = {
        xassLRArg(memberStatus, setupper);
        return doLoadMemberList(scala.collection.immutable.List.apply(memberStatus), new LoadReferrerOption[MemberCB, Member]().xinit(setupper));
    }

    protected def doLoadMemberList(memberStatusList: scala.collection.immutable.List[MemberStatus], option: LoadReferrerOption[MemberCB, Member]): NestedReferrerLoader[Member] = {
        val referrerBhv: MemberBhv = xgetBSFLR().select(classOf[MemberBhv]);
        return helpLoadReferrerInternally(memberStatusList.asJava, option, new InternalLoadReferrerCallback[MemberStatus, String, MemberCB, Member]() {
            def getPKVal(et: MemberStatus): String =
            { return et.getMemberStatusCode(); }
            def setRfLs(et: MemberStatus, ls: List[Member]): Unit =
            { et.setMemberList(toScalaList(ls)); }
            def newMyCB(): MemberCB = { return referrerBhv.newMyConditionBean(); }
            def qyFKIn(cb: MemberCB, ls: List[String]): Unit =
            { cb.query().setMemberStatusCode_InScope(ls); }
            def qyOdFKAsc(cb: MemberCB): Unit = { cb.query().addOrderBy_MemberStatusCode_Asc(); }
            def spFKCol(cb: MemberCB): Unit = { cb.specify().columnMemberStatusCode(); }
            def selRfLs(cb: MemberCB): List[Member] = { return referrerBhv.selectList(cb).asJava; }
            def getFKVal(re: Member): String = { return re.getMemberStatusCode(); }
            def setlcEt(re: Member, le: MemberStatus): Unit =
            { re.setMemberStatus(le); }
            def getRfPrNm(): String = { return "memberList"; }
        });
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key memberStatusCode.
     * @param memberStatusList The list of memberStatus. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    def extractMemberStatusCodeList(memberStatusList: List[MemberStatus]): List[String] = {
        return helpExtractListInternally(memberStatusList, new InternalExtractCallback[MemberStatus, String]() {
            def getCV(et: MemberStatus): String = { return et.getMemberStatusCode(); }
        });
    }

    /**
     * Extract the value list of (single) unique key displayOrder.
     * @param memberStatusList The list of memberStatus. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    def extractDisplayOrderList(memberStatusList: List[MemberStatus]): List[Integer] = {
        return helpExtractListInternally(memberStatusList, new InternalExtractCallback[MemberStatus, Integer]() {
            def getCV(et: MemberStatus): Integer = { return et.getDisplayOrder(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * MemberStatus memberStatus = new MemberStatus();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * memberStatus.setFoo...(value);
     * memberStatus.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//memberStatus.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//memberStatus.set...;</span>
     * memberStatusBhv.<span style="color: #DD4747">insert</span>(memberStatus);
     * ... = memberStatus.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param memberStatus The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    def insert(memberStatus: MemberStatus): Unit = {
        doInsert(memberStatus, null);
    }

    protected def doInsert(memberStatus: MemberStatus, op: InsertOption[MemberStatusCB]): Unit = {
        assertObjectNotNull("memberStatus", memberStatus);
        prepareInsertOption(op);
        delegateInsert(memberStatus, op);
    }

    protected def prepareInsertOption(op: InsertOption[MemberStatusCB]): Unit = {
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
     * MemberStatus memberStatus = new MemberStatus();
     * memberStatus.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * memberStatus.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//memberStatus.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//memberStatus.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * memberStatus.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     memberStatusBhv.<span style="color: #DD4747">update</span>(memberStatus);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param memberStatus The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    def update(memberStatus: MemberStatus): Unit = {
        doUpdate(memberStatus, null);
    }

    protected def doUpdate(memberStatus: MemberStatus, op: UpdateOption[MemberStatusCB]): Unit = {
        assertObjectNotNull("memberStatus", memberStatus);
        prepareUpdateOption(op);
        helpUpdateInternally(memberStatus, new InternalUpdateCallback[MemberStatus]() {
            def callbackDelegateUpdate(et: MemberStatus): Int = { return delegateUpdate(et, op); } });
    }

    protected def prepareUpdateOption(op: UpdateOption[MemberStatusCB]): Unit = {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected def createCBForVaryingUpdate(): MemberStatusCB = {
        val cb: MemberStatusCB = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected def createCBForSpecifiedUpdate(): MemberStatusCB = {
        val cb: MemberStatusCB = newMyConditionBean();
        cb.xsetupForSpecifiedUpdate();
        return cb;
    }

    @Override
    protected def doModify(et: Entity, op: UpdateOption[_ <: ConditionBean]): Unit = {
        if (op == null) { update(downcast(et)); }
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
     * @param memberStatus The entity of insert or update target. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    def insertOrUpdate(memberStatus: MemberStatus): Unit = {
        doInesrtOrUpdate(memberStatus, null, null);
    }

    protected def doInesrtOrUpdate(memberStatus: MemberStatus, iop: InsertOption[MemberStatusCB], uop: UpdateOption[MemberStatusCB]): Unit = {
        helpInsertOrUpdateInternally(memberStatus, new InternalInsertOrUpdateCallback[MemberStatus, MemberStatusCB]() {
            def callbackInsert(et: MemberStatus): Unit = { doInsert(et, iop); }
            def callbackUpdate(et: MemberStatus): Unit = { doUpdate(et, uop); }
            def callbackNewMyConditionBean(): MemberStatusCB = { return newMyConditionBean(); }
            def callbackSelectCount(cb: MemberStatusCB): Int = { return selectCount(cb); }
        });
    }

    @Override
    protected def doCreateOrModify(et: Entity, iop: InsertOption[_ <: ConditionBean], uop: UpdateOption[_ <: ConditionBean]): Unit = {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            val niop = if (iop != null) { iop } else { new InsertOption[MemberStatusCB]() };
            val nuop = if (uop != null) { uop } else { new UpdateOption[MemberStatusCB]() };
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
     * MemberStatus memberStatus = new MemberStatus();
     * memberStatus.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * memberStatus.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     memberStatusBhv.<span style="color: #DD4747">delete</span>(memberStatus);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param memberStatus The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    def delete(memberStatus: MemberStatus): Unit = {
        doDelete(memberStatus, null);
    }

    protected def doDelete(memberStatus: MemberStatus, op: DeleteOption[MemberStatusCB]): Unit = {
        assertObjectNotNull("memberStatus", memberStatus);
        prepareDeleteOption(op);
        helpDeleteInternally(memberStatus, new InternalDeleteCallback[MemberStatus]() {
            def callbackDelegateDelete(et: MemberStatus): Int = { return delegateDelete(et, op); } });
    }

    protected def prepareDeleteOption(op: DeleteOption[MemberStatusCB]): Unit = {
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
     *     MemberStatus memberStatus = new MemberStatus();
     *     memberStatus.setFooName("foo");
     *     if (...) {
     *         memberStatus.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     memberStatusList.add(memberStatus);
     * }
     * memberStatusBhv.<span style="color: #DD4747">batchInsert</span>(memberStatusList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param memberStatusList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    def batchInsert(memberStatusList: scala.collection.immutable.List[MemberStatus]): Array[Int] = {
        val op: InsertOption[MemberStatusCB] = createInsertUpdateOption();
        return doBatchInsert(memberStatusList.asJava, op);
    }

    protected def doBatchInsert(memberStatusList: List[MemberStatus], op: InsertOption[MemberStatusCB]): Array[Int] = {
        assertObjectNotNull("memberStatusList", memberStatusList);
        prepareBatchInsertOption(memberStatusList, op);
        return delegateBatchInsert(memberStatusList, op);
    }

    protected def prepareBatchInsertOption(memberStatusList: List[MemberStatus], op: InsertOption[MemberStatusCB]): Unit = {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(memberStatusList);
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
     *     MemberStatus memberStatus = new MemberStatus();
     *     memberStatus.setFooName("foo");
     *     if (...) {
     *         memberStatus.setFooPrice(123);
     *     } else {
     *         memberStatus.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//memberStatus.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     memberStatusList.add(memberStatus);
     * }
     * memberStatusBhv.<span style="color: #DD4747">batchUpdate</span>(memberStatusList);
     * </pre>
     * @param memberStatusList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    def batchUpdate(memberStatusList: scala.collection.immutable.List[MemberStatus]): Array[Int] = {
        val op: UpdateOption[MemberStatusCB] = createPlainUpdateOption();
        return doBatchUpdate(memberStatusList.asJava, op);
    }

    protected def doBatchUpdate(memberStatusList: List[MemberStatus], op: UpdateOption[MemberStatusCB]): Array[Int] = {
        assertObjectNotNull("memberStatusList", memberStatusList);
        prepareBatchUpdateOption(memberStatusList, op);
        return delegateBatchUpdate(memberStatusList, op);
    }

    protected def prepareBatchUpdateOption(memberStatusList: List[MemberStatus], op: UpdateOption[MemberStatusCB]): Unit = {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(memberStatusList);
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
     * memberStatusBhv.<span style="color: #DD4747">batchUpdate</span>(memberStatusList, new SpecifyQuery[MemberStatusCB]() {
     *     public void specify(MemberStatusCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * memberStatusBhv.<span style="color: #DD4747">batchUpdate</span>(memberStatusList, new SpecifyQuery[MemberStatusCB]() {
     *     public void specify(MemberStatusCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param memberStatusList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    def batchUpdate(memberStatusList: scala.collection.immutable.List[MemberStatus], updateColumnSpec: SpecifyQuery[MemberStatusCB]): Array[Int] = {
        return doBatchUpdate(memberStatusList.asJava, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected def doLumpModifyNonstrict(ls: List[Entity], op: UpdateOption[_ <: ConditionBean]): Array[Int] = {
        return doLumpModify(ls, op);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param memberStatusList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    def batchDelete(memberStatusList: scala.collection.immutable.List[MemberStatus]): Array[Int] = {
        return doBatchDelete(memberStatusList.asJava, null);
    }

    protected def doBatchDelete(memberStatusList: List[MemberStatus], op: DeleteOption[MemberStatusCB]): Array[Int] = {
        assertObjectNotNull("memberStatusList", memberStatusList);
        prepareDeleteOption(op);
        return delegateBatchDelete(memberStatusList, op);
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
     * memberStatusBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;MemberStatus, MemberStatusCB&gt;() {
     *     public ConditionBean setup(memberStatus entity, MemberStatusCB intoCB) {
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
    def queryInsert(setupper: QueryInsertSetupper[MemberStatus, MemberStatusCB]): Integer = {
        return doQueryInsert(setupper, null);
    }

    protected def doQueryInsert(sp: QueryInsertSetupper[MemberStatus, MemberStatusCB], op: InsertOption[MemberStatusCB]): Integer = {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        val e: MemberStatus = new MemberStatus();
        val cb: MemberStatusCB = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
    }

    protected def createCBForQueryInsert(): MemberStatusCB = {
        val cb: MemberStatusCB = newMyConditionBean();
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
     * MemberStatus memberStatus = new MemberStatus();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//memberStatus.setPK...(value);</span>
     * memberStatus.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//memberStatus.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//memberStatus.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//memberStatus.setVersionNo(value);</span>
     * MemberStatusCB cb = new MemberStatusCB();
     * cb.query().setFoo...(value);
     * memberStatusBhv.<span style="color: #DD4747">queryUpdate</span>(memberStatus, cb);
     * </pre>
     * @param memberStatus The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of MemberStatus. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    def queryUpdate(memberStatus: MemberStatus, cb: MemberStatusCB): Integer = {
        return doQueryUpdate(memberStatus, cb, null);
    }

    protected def doQueryUpdate(memberStatus: MemberStatus, cb: MemberStatusCB, op: UpdateOption[MemberStatusCB]): Integer = {
        assertObjectNotNull("memberStatus", memberStatus); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return if (checkCountBeforeQueryUpdateIfNeeds(cb)) { delegateQueryUpdate(memberStatus, cb, op) } else { 0 };
    }

    @Override
    protected def doRangeModify(et: Entity, cb: ConditionBean, op: UpdateOption[_ <: ConditionBean]): Int = {
        if (op == null) { return queryUpdate(downcast(et), cb.asInstanceOf[MemberStatusCB]); }
        else { return varyingQueryUpdate(downcast(et), cb.asInstanceOf[MemberStatusCB], downcast(op)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * MemberStatusCB cb = new MemberStatusCB();
     * cb.query().setFoo...(value);
     * memberStatusBhv.<span style="color: #DD4747">queryDelete</span>(memberStatus, cb);
     * </pre>
     * @param cb The condition-bean of MemberStatus. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    def queryDelete(cb: MemberStatusCB): Integer = {
        return doQueryDelete(cb, null);
    }

    protected def doQueryDelete(cb: MemberStatusCB, op: DeleteOption[MemberStatusCB]): Integer = {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return if (checkCountBeforeQueryUpdateIfNeeds(cb)) { delegateQueryDelete(cb, op) } else { 0 };
    }

    @Override
    protected def doRangeRemove(cb: ConditionBean, op: DeleteOption[_ <: ConditionBean]): Int = {
        if (op == null) { return queryDelete(cb.asInstanceOf[MemberStatusCB]); }
        else { return varyingQueryDelete(cb.asInstanceOf[MemberStatusCB], downcast(op)); }
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
     * MemberStatus memberStatus = new MemberStatus();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * memberStatus.setFoo...(value);
     * memberStatus.setBar...(value);
     * InsertOption[MemberStatusCB] option = new InsertOption[MemberStatusCB]();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * memberStatusBhv.<span style="color: #DD4747">varyingInsert</span>(memberStatus, option);
     * ... = memberStatus.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param memberStatus The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    def varyingInsert(memberStatus: MemberStatus, option: InsertOption[MemberStatusCB]): Unit = {
        assertInsertOptionNotNull(option);
        doInsert(memberStatus, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * MemberStatus memberStatus = new MemberStatus();
     * memberStatus.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * memberStatus.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * memberStatus.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;MemberStatusCB&gt; option = new UpdateOption&lt;MemberStatusCB&gt;();
     *     option.self(new SpecifyQuery&lt;MemberStatusCB&gt;() {
     *         public void specify(MemberStatusCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     memberStatusBhv.<span style="color: #DD4747">varyingUpdate</span>(memberStatus, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param memberStatus The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    def varyingUpdate(memberStatus: MemberStatus, option: UpdateOption[MemberStatusCB]): Unit = {
        assertUpdateOptionNotNull(option);
        doUpdate(memberStatus, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param memberStatus The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    def varyingInsertOrUpdate(memberStatus: MemberStatus, insertOption: InsertOption[MemberStatusCB], updateOption: UpdateOption[MemberStatusCB]): Unit = {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(memberStatus, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param memberStatus The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    def varyingDelete(memberStatus: MemberStatus, option: DeleteOption[MemberStatusCB]): Unit = {
        assertDeleteOptionNotNull(option);
        doDelete(memberStatus, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param memberStatusList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    def varyingBatchInsert(memberStatusList: scala.collection.immutable.List[MemberStatus], option: InsertOption[MemberStatusCB]): Array[Int] = {
        assertInsertOptionNotNull(option);
        return doBatchInsert(memberStatusList.asJava, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param memberStatusList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    def varyingBatchUpdate(memberStatusList: scala.collection.immutable.List[MemberStatus], option: UpdateOption[MemberStatusCB]): Array[Int] = {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(memberStatusList.asJava, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param memberStatusList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    def varyingBatchDelete(memberStatusList: scala.collection.immutable.List[MemberStatus], option: DeleteOption[MemberStatusCB]): Array[Int] = {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(memberStatusList.asJava, option);
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
    def varyingQueryInsert(setupper: QueryInsertSetupper[MemberStatus, MemberStatusCB], option: InsertOption[MemberStatusCB]): Integer = {
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
     * MemberStatus memberStatus = new MemberStatus();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//memberStatus.setPK...(value);</span>
     * memberStatus.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//memberStatus.setVersionNo(value);</span>
     * MemberStatusCB cb = new MemberStatusCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;MemberStatusCB&gt; option = new UpdateOption&lt;MemberStatusCB&gt;();
     * option.self(new SpecifyQuery&lt;MemberStatusCB&gt;() {
     *     public void specify(MemberStatusCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * memberStatusBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(memberStatus, cb, option);
     * </pre>
     * @param memberStatus The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of MemberStatus. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    def varyingQueryUpdate(memberStatus: MemberStatus, cb: MemberStatusCB, option: UpdateOption[MemberStatusCB]): Integer = {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(memberStatus, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of MemberStatus. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    def varyingQueryDelete(cb: MemberStatusCB, option: DeleteOption[MemberStatusCB]): Integer = {
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
    def outsideSql(): OutsideSqlBasicExecutor[MemberStatusBhv] = {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected def delegateSelectCountUniquely(cb: MemberStatusCB): Integer = { return invoke(createSelectCountCBCommand(cb, true)); }
    protected def delegateSelectCountPlainly(cb: MemberStatusCB): Integer = { return invoke(createSelectCountCBCommand(cb, false)); }
    protected def delegateSelectCursor[ENTITY <: MemberStatus](cb: MemberStatusCB, rh: EntityRowHandler[ENTITY], tp: Class[ENTITY])
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected def delegateSelectList[ENTITY <: MemberStatus](cb: MemberStatusCB, tp: Class[ENTITY]): List[ENTITY] =
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected def delegateInsert(et: MemberStatus, op: InsertOption[MemberStatusCB]): Integer =
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected def delegateUpdate(et: MemberStatus, op: UpdateOption[MemberStatusCB]): Integer =
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return delegateUpdateNonstrict(et, op); }
    protected def delegateUpdateNonstrict(et: MemberStatus, op: UpdateOption[MemberStatusCB]): Integer =
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected def delegateDelete(et: MemberStatus, op: DeleteOption[MemberStatusCB]): Integer =
    { if (!processBeforeDelete(et, op)) { return 0; }
      return delegateDeleteNonstrict(et, op); }
    protected def delegateDeleteNonstrict(et: MemberStatus, op: DeleteOption[MemberStatusCB]): Integer =
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected def delegateBatchInsert(ls: List[MemberStatus], op: InsertOption[MemberStatusCB]): Array[Int] =
    { if (ls.isEmpty()) { return new Array[Int](0); }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)).asInstanceOf[Array[Int]]; }
    protected def delegateBatchUpdate(ls: List[MemberStatus], op: UpdateOption[MemberStatusCB]): Array[Int] =
    { if (ls.isEmpty()) { return new Array[Int](0); }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected def delegateBatchUpdateNonstrict(ls: List[MemberStatus], op: UpdateOption[MemberStatusCB]): Array[Int] =
    { if (ls.isEmpty()) { return new Array[Int](0); }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)).asInstanceOf[Array[Int]]; }
    protected def delegateBatchDelete(ls: List[MemberStatus], op: DeleteOption[MemberStatusCB]): Array[Int] =
    { if (ls.isEmpty()) { return new Array[Int](0); }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected def delegateBatchDeleteNonstrict(ls: List[MemberStatus], op: DeleteOption[MemberStatusCB]): Array[Int] =
    { if (ls.isEmpty()) { return new Array[Int](0); }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)).asInstanceOf[Array[Int]]; }

    protected def delegateQueryInsert(et: MemberStatus, inCB: MemberStatusCB, resCB: ConditionBean, op: InsertOption[MemberStatusCB]): Integer =
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; }
      return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected def delegateQueryUpdate(et: MemberStatus, cb: MemberStatusCB, op: UpdateOption[MemberStatusCB]): Integer =
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; }
      return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected def delegateQueryDelete(cb: MemberStatusCB, op: DeleteOption[MemberStatusCB]): Integer =
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
    protected def downcast(et: Entity): MemberStatus = {
        return helpEntityDowncastInternally(et, classOf[MemberStatus]);
    }

    protected def downcast(cb: ConditionBean): MemberStatusCB = {
        return helpConditionBeanDowncastInternally(cb, classOf[MemberStatusCB]);
    }

    protected def downcast(ls: List[_ <: Entity]): List[MemberStatus] = {
        return ls.asInstanceOf[List[MemberStatus]];
    }

    protected def downcast(op: InsertOption[_ <: ConditionBean]): InsertOption[MemberStatusCB] = {
        return op.asInstanceOf[InsertOption[MemberStatusCB]];
    }

    protected def downcast(op: UpdateOption[_ <: ConditionBean]): UpdateOption[MemberStatusCB] = {
        return op.asInstanceOf[UpdateOption[MemberStatusCB]];
    }

    protected def downcast(op: DeleteOption[_ <: ConditionBean]): DeleteOption[MemberStatusCB] = {
        return op.asInstanceOf[DeleteOption[MemberStatusCB]];
    }

    protected def downcast(sp: QueryInsertSetupper[_ <: Entity, _ <: ConditionBean]): QueryInsertSetupper[MemberStatus, MemberStatusCB] = {
        return sp.asInstanceOf[QueryInsertSetupper[MemberStatus, MemberStatusCB]];
    }

    // ===================================================================================
    //                                                                        Scala Helper
    //                                                                        ============
    protected def toScalaList[ENTITY](javaList: List[ENTITY]): scala.collection.immutable.List[ENTITY] = {
         // #pending easy convert for now
        return scala.collection.immutable.List.fromArray(javaList.toArray()).asInstanceOf[scala.collection.immutable.List[ENTITY]];
    }
}
