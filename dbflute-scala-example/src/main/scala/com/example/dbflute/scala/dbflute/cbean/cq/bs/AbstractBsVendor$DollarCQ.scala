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
 * The abstract condition-query of VENDOR_$_DOLLAR.
 * @author DBFlute(AutoGenerator)
 */
abstract class AbstractBsVendor$DollarCQ(referrerQuery: ConditionQuery, sqlClause: SqlClause, aliasName: String, nestLevel: Integer)
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
        return "VENDOR_$_DOLLAR";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * VENDOR_$_DOLLAR_ID: {PK, NotNull, INTEGER(10)}
     * @param vendor$DollarId The value of vendor$DollarId as equal. (NullAllowed: if null, no condition)
     */
    def setVendor$DollarId_Equal(vendor$DollarId: Int): Unit = {
        doSetVendor$DollarId_Equal(vendor$DollarId);
    }

    protected def doSetVendor$DollarId_Equal(vendor$DollarId: Integer): Unit = {
        regVendor$DollarId(CK_EQ, vendor$DollarId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * VENDOR_$_DOLLAR_ID: {PK, NotNull, INTEGER(10)}
     * @param vendor$DollarId The value of vendor$DollarId as notEqual. (NullAllowed: if null, no condition)
     */
    def setVendor$DollarId_NotEqual(vendor$DollarId: Int): Unit = {
        doSetVendor$DollarId_NotEqual(vendor$DollarId);
    }

    protected def doSetVendor$DollarId_NotEqual(vendor$DollarId: Integer): Unit = {
        regVendor$DollarId(CK_NES, vendor$DollarId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * VENDOR_$_DOLLAR_ID: {PK, NotNull, INTEGER(10)}
     * @param vendor$DollarId The value of vendor$DollarId as greaterThan. (NullAllowed: if null, no condition)
     */
    def setVendor$DollarId_GreaterThan(vendor$DollarId: Int): Unit = {
        regVendor$DollarId(CK_GT, vendor$DollarId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * VENDOR_$_DOLLAR_ID: {PK, NotNull, INTEGER(10)}
     * @param vendor$DollarId The value of vendor$DollarId as lessThan. (NullAllowed: if null, no condition)
     */
    def setVendor$DollarId_LessThan(vendor$DollarId: Int): Unit = {
        regVendor$DollarId(CK_LT, vendor$DollarId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * VENDOR_$_DOLLAR_ID: {PK, NotNull, INTEGER(10)}
     * @param vendor$DollarId The value of vendor$DollarId as greaterEqual. (NullAllowed: if null, no condition)
     */
    def setVendor$DollarId_GreaterEqual(vendor$DollarId: Int): Unit = {
        regVendor$DollarId(CK_GE, vendor$DollarId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * VENDOR_$_DOLLAR_ID: {PK, NotNull, INTEGER(10)}
     * @param vendor$DollarId The value of vendor$DollarId as lessEqual. (NullAllowed: if null, no condition)
     */
    def setVendor$DollarId_LessEqual(vendor$DollarId: Int): Unit = {
        regVendor$DollarId(CK_LE, vendor$DollarId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * VENDOR_$_DOLLAR_ID: {PK, NotNull, INTEGER(10)}
     * @param minNumber The min number of vendor$DollarId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of vendor$DollarId. (NullAllowed: if null, no to-condition)
     * @param optionCall The callback for option of range-of. (NotNull)
     */
    def setVendor$DollarId_RangeOf(minNumber: Int, maxNumber: Int)(optionCall: (RangeOfOption) => Unit): Unit = {
        regROO(minNumber, maxNumber, getCValueVendor$DollarId(), "VENDOR_$_DOLLAR_ID", callbackROOP(optionCall));
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * VENDOR_$_DOLLAR_ID: {PK, NotNull, INTEGER(10)}
     * @param vendor$DollarIdList The collection of vendor$DollarId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    def setVendor$DollarId_InScope(vendor$DollarIdList: List[Int]): Unit = {
        doSetVendor$DollarId_InScope(toMutableValueCollectionImplicitly(vendor$DollarIdList));
    }

    protected def doSetVendor$DollarId_InScope(vendor$DollarIdList: Collection[Integer]): Unit = {
        regINS(CK_INS, cTL(vendor$DollarIdList), getCValueVendor$DollarId(), "VENDOR_$_DOLLAR_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * VENDOR_$_DOLLAR_ID: {PK, NotNull, INTEGER(10)}
     * @param vendor$DollarIdList The collection of vendor$DollarId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    def setVendor$DollarId_NotInScope(vendor$DollarIdList: List[Int]): Unit = {
        doSetVendor$DollarId_NotInScope(if (vendor$DollarIdList != null) { vendor$DollarIdList.map(_.asInstanceOf[Integer]).asJava } else { null });
    }

    protected def doSetVendor$DollarId_NotInScope(vendor$DollarIdList: Collection[Integer]): Unit = {
        regINS(CK_NINS, cTL(vendor$DollarIdList), getCValueVendor$DollarId(), "VENDOR_$_DOLLAR_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * VENDOR_$_DOLLAR_ID: {PK, NotNull, INTEGER(10)}
     */
    def setVendor$DollarId_IsNull(): Unit = { regVendor$DollarId(CK_ISN, AbstractConditionQuery.DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * VENDOR_$_DOLLAR_ID: {PK, NotNull, INTEGER(10)}
     */
    def setVendor$DollarId_IsNotNull(): Unit = { regVendor$DollarId(CK_ISNN, AbstractConditionQuery.DOBJ); }

    protected def regVendor$DollarId(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValueVendor$DollarId(), "VENDOR_$_DOLLAR_ID"); }
    protected def getCValueVendor$DollarId(): ConditionValue;

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * VENDOR_$_DOLLAR_NAME: {VARCHAR(32)}
     * @param vendor$DollarName The value of vendor$DollarName as equal. (NullAllowed: if null (or empty), no condition)
     */
    def setVendor$DollarName_Equal(vendor$DollarName: String): Unit = {
        doSetVendor$DollarName_Equal(fRES(vendor$DollarName));
    }

    protected def doSetVendor$DollarName_Equal(vendor$DollarName: String): Unit = {
        regVendor$DollarName(CK_EQ, vendor$DollarName);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * VENDOR_$_DOLLAR_NAME: {VARCHAR(32)}
     * @param vendor$DollarName The value of vendor$DollarName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    def setVendor$DollarName_PrefixSearch(vendor$DollarName: String): Unit = {
        setVendor$DollarName_LikeSearch(vendor$DollarName)(_.likePrefix);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * VENDOR_$_DOLLAR_NAME: {VARCHAR(32)} <br />
     * <pre>e.g. setVendor$DollarName_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param vendor$DollarName The value of vendor$DollarName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param optionCall The callback for option of like-search. (NotNull)
     */
    def setVendor$DollarName_LikeSearch(vendor$DollarName: String)(optionCall: (ScrLikeSearchOption) => Unit): Unit = {
        regLSQ(CK_LS, fRES(vendor$DollarName), getCValueVendor$DollarName(), "VENDOR_$_DOLLAR_NAME", callbackLSOP(optionCall));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * VENDOR_$_DOLLAR_NAME: {VARCHAR(32)}
     * @param vendor$DollarName The value of vendor$DollarName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param optionCall The callback for option of not-like-search. (NotNull)
     */
    def setVendor$DollarName_NotLikeSearch(vendor$DollarName: String)(optionCall: (ScrLikeSearchOption) => Unit): Unit = {
        regLSQ(CK_NLS, fRES(vendor$DollarName), getCValueVendor$DollarName(), "VENDOR_$_DOLLAR_NAME", callbackLSOP(optionCall));
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * VENDOR_$_DOLLAR_NAME: {VARCHAR(32)}
     */
    def setVendor$DollarName_IsNull(): Unit = { regVendor$DollarName(CK_ISN, AbstractConditionQuery.DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * VENDOR_$_DOLLAR_NAME: {VARCHAR(32)}
     */
    def setVendor$DollarName_IsNullOrEmpty(): Unit = { regVendor$DollarName(CK_ISNOE, AbstractConditionQuery.DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * VENDOR_$_DOLLAR_NAME: {VARCHAR(32)}
     */
    def setVendor$DollarName_IsNotNull(): Unit = { regVendor$DollarName(CK_ISNN, AbstractConditionQuery.DOBJ); }

    protected def regVendor$DollarName(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValueVendor$DollarName(), "VENDOR_$_DOLLAR_NAME"); }
    protected def getCValueVendor$DollarName(): ConditionValue;

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;Vendor$DollarCB&gt;() {
     *     public void query(Vendor$DollarCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_Equal(): ScrHpSSQFunction[Vendor$DollarCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_EQ, classOf[Vendor$DollarCB]));
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;Vendor$DollarCB&gt;() {
     *     public void query(Vendor$DollarCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_NotEqual(): ScrHpSSQFunction[Vendor$DollarCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_NES, classOf[Vendor$DollarCB]));
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;Vendor$DollarCB&gt;() {
     *     public void query(Vendor$DollarCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_GreaterThan(): ScrHpSSQFunction[Vendor$DollarCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_GT, classOf[Vendor$DollarCB]));
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;Vendor$DollarCB&gt;() {
     *     public void query(Vendor$DollarCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_LessThan(): ScrHpSSQFunction[Vendor$DollarCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_LT, classOf[Vendor$DollarCB]));
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;Vendor$DollarCB&gt;() {
     *     public void query(Vendor$DollarCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_GreaterEqual(): ScrHpSSQFunction[Vendor$DollarCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_GE, classOf[Vendor$DollarCB]));
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;Vendor$DollarCB&gt;() {
     *     public void query(Vendor$DollarCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_LessEqual(): ScrHpSSQFunction[Vendor$DollarCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_LE, classOf[Vendor$DollarCB]));
    }

    protected def toScalaSSQFunction(function: HpSSQFunction[Vendor$DollarCB]): ScrHpSSQFunction[Vendor$DollarCB] =
    { new ScrHpSSQFunction(function) }

    override protected def xscalarCondition[CB <: ConditionBean](fn: String, sq: SubQuery[CB], rd: String, op: HpSSQOption[CB]): Unit = {
        assertObjectNotNull("subQuery", sq);
        val cb: Vendor$DollarCB = xcreateScalarConditionCB(); sq.query(cb.asInstanceOf[CB]);
        val pp: String = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean(xcreateScalarConditionPartitionByCB().asInstanceOf[CB]); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    def keepScalarCondition(sq: Vendor$DollarCQ): String;

    protected def xcreateScalarConditionCB(): Vendor$DollarCB = {
        val cb: Vendor$DollarCB = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected def xcreateScalarConditionPartitionByCB(): Vendor$DollarCB = {
        val cb: Vendor$DollarCB = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    def xsmyselfDerive(fn: String, sq: SubQuery[Vendor$DollarCB], al: String, op: DerivedReferrerOption): Unit = {
        assertObjectNotNull("subQuery", sq);
        val cb: Vendor$DollarCB = new Vendor$DollarCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        val pp: String = keepSpecifyMyselfDerived(cb.query());
        val pk: String = "VENDOR_$_DOLLAR_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    def keepSpecifyMyselfDerived(sq: Vendor$DollarCQ): String;

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    def myselfDerived(): ScrHpQDRFunction[Vendor$DollarCB] = {
        return toScalaQDRFunction(xcreateQDRFunctionMyselfDerived(classOf[Vendor$DollarCB]));
    }
    override protected def xqderiveMyselfDerived[CB <: ConditionBean](fn: String, sq: SubQuery[CB], rd: String, vl: Object, op: DerivedReferrerOption): Unit = {
        assertObjectNotNull("subQuery", sq);
        val cb: Vendor$DollarCB = new Vendor$DollarCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb.asInstanceOf[CB]);
        val pk: String = "VENDOR_$_DOLLAR_ID";
        val sqpp: String = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        val prpp: String = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    def keepQueryMyselfDerived(sq: Vendor$DollarCQ): String;
    def keepQueryMyselfDerivedParameter(vl: Object): String;

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    def myselfExists(subQuery: (Vendor$DollarCB) => Unit): Unit = {
        assertObjectNotNull("subQuery", subQuery);
        val cb: Vendor$DollarCB = new Vendor$DollarCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery(cb); } finally { unlock(); }
        val pp: String = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    def keepMyselfExists(sq: Vendor$DollarCQ): String;

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    def myselfInScope(subQuery: (Vendor$DollarCB) => Unit): Unit = {
        assertObjectNotNull("subQuery", subQuery);
        val cb: Vendor$DollarCB = new Vendor$DollarCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery(cb); } finally { unlock(); }
        val pp: String = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    def keepMyselfInScope(sq: Vendor$DollarCQ): String;

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
    protected def newMyCB(): Vendor$DollarCB = {
        return new Vendor$DollarCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected def xabUDT(): String = { return classOf[Date].getName(); }
    protected def xabCQ(): String = { return classOf[Vendor$DollarCQ].getName(); }
    protected def xabLSO(): String = { return classOf[LikeSearchOption].getName(); }
    protected def xabSSQS(): String = { return classOf[HpSSQSetupper[_]].getName(); }
}
