package com.example.dbflute.scala.dbflute.cbean.cq.bs;

import scala.collection.immutable;
import scala.collection.JavaConverters._;

import java.util.Collection;
import java.util.Date;

import org.seasar.dbflute.cbean._;
import org.seasar.dbflute.cbean.AbstractConditionQuery._;
import org.seasar.dbflute.cbean.chelper._;
import org.seasar.dbflute.cbean.ckey._;
import org.seasar.dbflute.cbean.coption._;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.dbmeta.DBMetaProvider;
import org.seasar.dbflute.util.DfTypeUtil;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import com.example.dbflute.scala.dbflute.allcommon._;
import com.example.dbflute.scala.dbflute.cbean._;
import com.example.dbflute.scala.dbflute.cbean.cq._;

/**
 * The abstract condition-query of VENDOR_PRIMARY_KEY_ONLY.
 * @author DBFlute(AutoGenerator)
 */
abstract class AbstractBsVendorPrimaryKeyOnlyCQ(referrerQuery: ConditionQuery, sqlClause: SqlClause, aliasName: String, nestLevel: Integer)
        extends AbstractConditionQuery(referrerQuery, sqlClause, aliasName, nestLevel) {

    // ===================================================================================
    //                                                                     DBMeta Provider
    //                                                                     ===============
    @Override
    protected def xgetDBMetaProvider(): DBMetaProvider = {
        return DBMetaInstanceHandler.getProvider();
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    def getTableDbName(): String = {
        return "VENDOR_PRIMARY_KEY_ONLY";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * PRIMARY_KEY_ONLY_ID: {PK, NotNull, BIGINT(19)}
     * @param primaryKeyOnlyId The value of primaryKeyOnlyId as equal. (NullAllowed: if null, no condition)
     */
    def setPrimaryKeyOnlyId_Equal(primaryKeyOnlyId: Long): Unit = {
        doSetPrimaryKeyOnlyId_Equal(primaryKeyOnlyId);
    }

    protected def doSetPrimaryKeyOnlyId_Equal(primaryKeyOnlyId: Long): Unit = {
        regPrimaryKeyOnlyId(CK_EQ, primaryKeyOnlyId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * PRIMARY_KEY_ONLY_ID: {PK, NotNull, BIGINT(19)}
     * @param primaryKeyOnlyId The value of primaryKeyOnlyId as notEqual. (NullAllowed: if null, no condition)
     */
    def setPrimaryKeyOnlyId_NotEqual(primaryKeyOnlyId: Long): Unit = {
        doSetPrimaryKeyOnlyId_NotEqual(primaryKeyOnlyId);
    }

    protected def doSetPrimaryKeyOnlyId_NotEqual(primaryKeyOnlyId: Long): Unit = {
        regPrimaryKeyOnlyId(CK_NES, primaryKeyOnlyId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * PRIMARY_KEY_ONLY_ID: {PK, NotNull, BIGINT(19)}
     * @param primaryKeyOnlyId The value of primaryKeyOnlyId as greaterThan. (NullAllowed: if null, no condition)
     */
    def setPrimaryKeyOnlyId_GreaterThan(primaryKeyOnlyId: Long): Unit = {
        regPrimaryKeyOnlyId(CK_GT, primaryKeyOnlyId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * PRIMARY_KEY_ONLY_ID: {PK, NotNull, BIGINT(19)}
     * @param primaryKeyOnlyId The value of primaryKeyOnlyId as lessThan. (NullAllowed: if null, no condition)
     */
    def setPrimaryKeyOnlyId_LessThan(primaryKeyOnlyId: Long): Unit = {
        regPrimaryKeyOnlyId(CK_LT, primaryKeyOnlyId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * PRIMARY_KEY_ONLY_ID: {PK, NotNull, BIGINT(19)}
     * @param primaryKeyOnlyId The value of primaryKeyOnlyId as greaterEqual. (NullAllowed: if null, no condition)
     */
    def setPrimaryKeyOnlyId_GreaterEqual(primaryKeyOnlyId: Long): Unit = {
        regPrimaryKeyOnlyId(CK_GE, primaryKeyOnlyId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * PRIMARY_KEY_ONLY_ID: {PK, NotNull, BIGINT(19)}
     * @param primaryKeyOnlyId The value of primaryKeyOnlyId as lessEqual. (NullAllowed: if null, no condition)
     */
    def setPrimaryKeyOnlyId_LessEqual(primaryKeyOnlyId: Long): Unit = {
        regPrimaryKeyOnlyId(CK_LE, primaryKeyOnlyId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * PRIMARY_KEY_ONLY_ID: {PK, NotNull, BIGINT(19)}
     * @param minNumber The min number of primaryKeyOnlyId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of primaryKeyOnlyId. (NullAllowed: if null, no to-condition)
     * @param optionCall The callback for option of range-of. (NotNull)
     */
    def setPrimaryKeyOnlyId_RangeOf(minNumber: Long, maxNumber: Long)(optionCall: (RangeOfOption) => Unit): Unit = {
        regROO(minNumber, maxNumber, getCValuePrimaryKeyOnlyId(), "PRIMARY_KEY_ONLY_ID", callbackROOP(optionCall));
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * PRIMARY_KEY_ONLY_ID: {PK, NotNull, BIGINT(19)}
     * @param primaryKeyOnlyIdList The collection of primaryKeyOnlyId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    def setPrimaryKeyOnlyId_InScope(primaryKeyOnlyIdList: List[Long]): Unit = {
        doSetPrimaryKeyOnlyId_InScope(toMutableValueCollectionImplicitly(primaryKeyOnlyIdList));
    }

    protected def doSetPrimaryKeyOnlyId_InScope(primaryKeyOnlyIdList: Collection[Long]): Unit = {
        regINS(CK_INS, cTL(primaryKeyOnlyIdList), getCValuePrimaryKeyOnlyId(), "PRIMARY_KEY_ONLY_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * PRIMARY_KEY_ONLY_ID: {PK, NotNull, BIGINT(19)}
     * @param primaryKeyOnlyIdList The collection of primaryKeyOnlyId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    def setPrimaryKeyOnlyId_NotInScope(primaryKeyOnlyIdList: List[Long]): Unit = {
        doSetPrimaryKeyOnlyId_NotInScope(if (primaryKeyOnlyIdList != null) { primaryKeyOnlyIdList.map(_.asInstanceOf[Long]).asJava } else { null });
    }

    protected def doSetPrimaryKeyOnlyId_NotInScope(primaryKeyOnlyIdList: Collection[Long]): Unit = {
        regINS(CK_NINS, cTL(primaryKeyOnlyIdList), getCValuePrimaryKeyOnlyId(), "PRIMARY_KEY_ONLY_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * PRIMARY_KEY_ONLY_ID: {PK, NotNull, BIGINT(19)}
     */
    def setPrimaryKeyOnlyId_IsNull(): Unit = { regPrimaryKeyOnlyId(CK_ISN, AbstractConditionQuery.DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * PRIMARY_KEY_ONLY_ID: {PK, NotNull, BIGINT(19)}
     */
    def setPrimaryKeyOnlyId_IsNotNull(): Unit = { regPrimaryKeyOnlyId(CK_ISNN, AbstractConditionQuery.DOBJ); }

    protected def regPrimaryKeyOnlyId(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValuePrimaryKeyOnlyId(), "PRIMARY_KEY_ONLY_ID"); }
    protected def getCValuePrimaryKeyOnlyId(): ConditionValue;

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;VendorPrimaryKeyOnlyCB&gt;() {
     *     public void query(VendorPrimaryKeyOnlyCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_Equal(): ScrHpSSQFunction[VendorPrimaryKeyOnlyCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_EQ, classOf[VendorPrimaryKeyOnlyCB]));
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;VendorPrimaryKeyOnlyCB&gt;() {
     *     public void query(VendorPrimaryKeyOnlyCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_NotEqual(): ScrHpSSQFunction[VendorPrimaryKeyOnlyCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_NES, classOf[VendorPrimaryKeyOnlyCB]));
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;VendorPrimaryKeyOnlyCB&gt;() {
     *     public void query(VendorPrimaryKeyOnlyCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_GreaterThan(): ScrHpSSQFunction[VendorPrimaryKeyOnlyCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_GT, classOf[VendorPrimaryKeyOnlyCB]));
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;VendorPrimaryKeyOnlyCB&gt;() {
     *     public void query(VendorPrimaryKeyOnlyCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_LessThan(): ScrHpSSQFunction[VendorPrimaryKeyOnlyCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_LT, classOf[VendorPrimaryKeyOnlyCB]));
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;VendorPrimaryKeyOnlyCB&gt;() {
     *     public void query(VendorPrimaryKeyOnlyCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_GreaterEqual(): ScrHpSSQFunction[VendorPrimaryKeyOnlyCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_GE, classOf[VendorPrimaryKeyOnlyCB]));
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;VendorPrimaryKeyOnlyCB&gt;() {
     *     public void query(VendorPrimaryKeyOnlyCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_LessEqual(): ScrHpSSQFunction[VendorPrimaryKeyOnlyCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_LE, classOf[VendorPrimaryKeyOnlyCB]));
    }

    protected def toScalaSSQFunction(function: HpSSQFunction[VendorPrimaryKeyOnlyCB]): ScrHpSSQFunction[VendorPrimaryKeyOnlyCB] =
    { new ScrHpSSQFunction(function) }

    override protected def xscalarCondition[CB <: ConditionBean](fn: String, sq: SubQuery[CB], rd: String, op: HpSSQOption[CB]): Unit = {
        assertObjectNotNull("subQuery", sq);
        val cb: VendorPrimaryKeyOnlyCB = xcreateScalarConditionCB(); sq.query(cb.asInstanceOf[CB]);
        val pp: String = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean(xcreateScalarConditionPartitionByCB().asInstanceOf[CB]); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    def keepScalarCondition(sq: VendorPrimaryKeyOnlyCQ): String;

    protected def xcreateScalarConditionCB(): VendorPrimaryKeyOnlyCB = {
        val cb: VendorPrimaryKeyOnlyCB = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected def xcreateScalarConditionPartitionByCB(): VendorPrimaryKeyOnlyCB = {
        val cb: VendorPrimaryKeyOnlyCB = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    def xsmyselfDerive(fn: String, sq: SubQuery[VendorPrimaryKeyOnlyCB], al: String, op: DerivedReferrerOption): Unit = {
        assertObjectNotNull("subQuery", sq);
        val cb: VendorPrimaryKeyOnlyCB = new VendorPrimaryKeyOnlyCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        val pp: String = keepSpecifyMyselfDerived(cb.query());
        val pk: String = "PRIMARY_KEY_ONLY_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    def keepSpecifyMyselfDerived(sq: VendorPrimaryKeyOnlyCQ): String;

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    def myselfDerived(): ScrHpQDRFunction[VendorPrimaryKeyOnlyCB] = {
        return toScalaQDRFunction(xcreateQDRFunctionMyselfDerived(classOf[VendorPrimaryKeyOnlyCB]));
    }
    override protected def xqderiveMyselfDerived[CB <: ConditionBean](fn: String, sq: SubQuery[CB], rd: String, vl: Object, op: DerivedReferrerOption): Unit = {
        assertObjectNotNull("subQuery", sq);
        val cb: VendorPrimaryKeyOnlyCB = new VendorPrimaryKeyOnlyCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb.asInstanceOf[CB]);
        val pk: String = "PRIMARY_KEY_ONLY_ID";
        val sqpp: String = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        val prpp: String = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    def keepQueryMyselfDerived(sq: VendorPrimaryKeyOnlyCQ): String;
    def keepQueryMyselfDerivedParameter(vl: Object): String;

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    def myselfExists(subQuery: (VendorPrimaryKeyOnlyCB) => Unit): Unit = {
        assertObjectNotNull("subQuery", subQuery);
        val cb: VendorPrimaryKeyOnlyCB = new VendorPrimaryKeyOnlyCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery(cb); } finally { unlock(); }
        val pp: String = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    def keepMyselfExists(sq: VendorPrimaryKeyOnlyCQ): String;

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    def myselfInScope(subQuery: (VendorPrimaryKeyOnlyCB) => Unit): Unit = {
        assertObjectNotNull("subQuery", subQuery);
        val cb: VendorPrimaryKeyOnlyCB = new VendorPrimaryKeyOnlyCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery(cb); } finally { unlock(); }
        val pp: String = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    def keepMyselfInScope(sq: VendorPrimaryKeyOnlyCQ): String;

    // ===================================================================================
    //                                                                            Order By
    //                                                                            ========
    /**
     * Order along manual ordering information.
     * <pre>
     * MemberCB cb = new MemberCB();
     * ManualOrderBean mob = new ManualOrderBean();
     * mob.<span style="color: #DD4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #DD4747">withManualOrder(mob)</span>;
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * MemberCB cb = new MemberCB();
     * ManualOrderBean mob = new ManualOrderBean();
     * mob.<span style="color: #DD4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     * mob.<span style="color: #DD4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     * mob.<span style="color: #DD4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #DD4747">withManualOrder(mob)</span>;
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * <p>This function with Union is unsupported!</p>
     * <p>The order values are bound (treated as bind parameter).</p>
     * @param mob The bean of manual order containing order values. (NotNull)
     */
    def withManualOrder(mobCall: (ScrManualOrderBean) => Unit): Unit = { // is user public!
        assertObjectNotNull("withManualOrder(mobCall)", mobCall);
        xdoWithManualOrder(callbackMOB(mobCall));
    }

    protected def toUtilDate(date: Object): Date = {
        if (date != null && date.isInstanceOf[ReadablePartial]) {
            return new Date(date.asInstanceOf[ReadablePartial].toDateTime(null).getMillis());
        } else if (date != null && date.isInstanceOf[ReadableInstant]) {
            return new Date(date.asInstanceOf[ReadableInstant].getMillis());
        }
        return DfTypeUtil.toDate(date);
    }

    protected def toTimestamp(date: Object): java.sql.Timestamp = {
        if (date != null && date.isInstanceOf[ReadablePartial]) {
            return new java.sql.Timestamp(date.asInstanceOf[ReadablePartial].toDateTime(null).getMillis());
        } else if (date != null && date.isInstanceOf[ReadableInstant]) {
            return new java.sql.Timestamp(date.asInstanceOf[ReadableInstant].getMillis());
        }
        return DfTypeUtil.toTimestamp(date);
    }

    override protected def filterFromToRegisteredDate(date: Date, columnDbName: String): Object = {
        if (date.isInstanceOf[java.sql.Timestamp]) {
            return LocalDateTime.fromDateFields(date);
        } else { // basically pure Date
            return LocalDate.fromDateFields(date);
        }
    }

    // ===================================================================================
    //                                                                       Create Option
    //                                                                       =============
    protected def callbackLSOP(optionCall: (ScrLikeSearchOption) => Unit): LikeSearchOption =
    { val op = createLikeSearchOption(); optionCall(op); return op; }
    protected def createLikeSearchOption(): ScrLikeSearchOption = { new ScrLikeSearchOption() }

    protected def callbackFTOP(optionCall: (ScrFromToOption) => Unit): FromToOption =
    { val op = createFromToOption(); optionCall(op); return op; }
    protected def createFromToOption(): ScrFromToOption = { new ScrFromToOption() }

    protected def callbackROOP(optionCall: (ScrRangeOfOption) => Unit): RangeOfOption =
    { val op = createRangeOfOption(); optionCall(op); return op; }
    protected def createRangeOfOption(): ScrRangeOfOption = { new ScrRangeOfOption() }

    protected def callbackMOB(mobCall: (ScrManualOrderBean) => Unit): ManualOrderBean =
    { val mob = createManualOrderBean(); mobCall(mob); return mob; }
    protected def createManualOrderBean(): ScrManualOrderBean = { new ScrManualOrderBean() }

    // ===================================================================================
    //                                                                        Invoke Query
    //                                                                        ============
    override protected def xfilterInvokeQueryParameterType(colName: String, ckey: String, parameterType: Class[_]): Class[_] =
    { if (classOf[Collection[_]].isAssignableFrom(parameterType)) { classOf[List[_]] } else { parameterType } }

    override protected def xfilterInvokeQueryParameterValue(colName: String, ckey: String, parameterValue: Object): Object =
    { if (parameterValue.isInstanceOf[Collection[_]]) { toScalaList(parameterValue.asInstanceOf[Collection[_]]) } else { parameterValue } }

    // ===================================================================================
    //                                                                        Scala Helper
    //                                                                        ============
    protected def toScalaList[ENTITY](javaList: Collection[ENTITY]): immutable.List[ENTITY] = {
        if (javaList == null) { immutable.List() }
        return javaList.toArray.toList.asInstanceOf[immutable.List[ENTITY]];
    }

    protected def toMutableValueCollectionImplicitly[SCALA, JAVA](ls: immutable.List[SCALA]): Collection[JAVA] =
    { if (ls != null) { ls.map(_.asInstanceOf[JAVA]).asJava } else { null } }

    protected def toScalaQDRFunction[CB <: ConditionBean](function: HpQDRFunction[CB]): ScrHpQDRFunction[CB] =
    { new ScrHpQDRFunction[CB](function) }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected def newMyCB(): VendorPrimaryKeyOnlyCB = {
        return new VendorPrimaryKeyOnlyCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected def xabUDT(): String = { return classOf[Date].getName(); }
    protected def xabCQ(): String = { return classOf[VendorPrimaryKeyOnlyCQ].getName(); }
    protected def xabLSO(): String = { return classOf[LikeSearchOption].getName(); }
    protected def xabSSQS(): String = { return classOf[HpSSQSetupper[_]].getName(); }
}
