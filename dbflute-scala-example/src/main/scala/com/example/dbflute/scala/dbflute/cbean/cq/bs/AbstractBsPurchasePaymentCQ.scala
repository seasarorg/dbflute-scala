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
 * The abstract condition-query of PURCHASE_PAYMENT.
 * @author DBFlute(AutoGenerator)
 */
abstract class AbstractBsPurchasePaymentCQ(referrerQuery: ConditionQuery, sqlClause: SqlClause, aliasName: String, nestLevel: Integer)
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
        return "PURCHASE_PAYMENT";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * (購入支払ID)PURCHASE_PAYMENT_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param purchasePaymentId The value of purchasePaymentId as equal. (NullAllowed: if null, no condition)
     */
    def setPurchasePaymentId_Equal(purchasePaymentId: Long): Unit = {
        doSetPurchasePaymentId_Equal(purchasePaymentId);
    }

    protected def doSetPurchasePaymentId_Equal(purchasePaymentId: Long): Unit = {
        regPurchasePaymentId(CK_EQ, purchasePaymentId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (購入支払ID)PURCHASE_PAYMENT_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param purchasePaymentId The value of purchasePaymentId as notEqual. (NullAllowed: if null, no condition)
     */
    def setPurchasePaymentId_NotEqual(purchasePaymentId: Long): Unit = {
        doSetPurchasePaymentId_NotEqual(purchasePaymentId);
    }

    protected def doSetPurchasePaymentId_NotEqual(purchasePaymentId: Long): Unit = {
        regPurchasePaymentId(CK_NES, purchasePaymentId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (購入支払ID)PURCHASE_PAYMENT_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param purchasePaymentId The value of purchasePaymentId as greaterThan. (NullAllowed: if null, no condition)
     */
    def setPurchasePaymentId_GreaterThan(purchasePaymentId: Long): Unit = {
        regPurchasePaymentId(CK_GT, purchasePaymentId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (購入支払ID)PURCHASE_PAYMENT_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param purchasePaymentId The value of purchasePaymentId as lessThan. (NullAllowed: if null, no condition)
     */
    def setPurchasePaymentId_LessThan(purchasePaymentId: Long): Unit = {
        regPurchasePaymentId(CK_LT, purchasePaymentId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (購入支払ID)PURCHASE_PAYMENT_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param purchasePaymentId The value of purchasePaymentId as greaterEqual. (NullAllowed: if null, no condition)
     */
    def setPurchasePaymentId_GreaterEqual(purchasePaymentId: Long): Unit = {
        regPurchasePaymentId(CK_GE, purchasePaymentId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (購入支払ID)PURCHASE_PAYMENT_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param purchasePaymentId The value of purchasePaymentId as lessEqual. (NullAllowed: if null, no condition)
     */
    def setPurchasePaymentId_LessEqual(purchasePaymentId: Long): Unit = {
        regPurchasePaymentId(CK_LE, purchasePaymentId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (購入支払ID)PURCHASE_PAYMENT_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of purchasePaymentId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of purchasePaymentId. (NullAllowed: if null, no to-condition)
     * @param optionCall The callback for option of range-of. (NotNull)
     */
    def setPurchasePaymentId_RangeOf(minNumber: Long, maxNumber: Long)(optionCall: (RangeOfOption) => Unit): Unit = {
        regROO(minNumber, maxNumber, getCValuePurchasePaymentId(), "PURCHASE_PAYMENT_ID", callbackROOP(optionCall));
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (購入支払ID)PURCHASE_PAYMENT_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param purchasePaymentIdList The collection of purchasePaymentId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    def setPurchasePaymentId_InScope(purchasePaymentIdList: List[Long]): Unit = {
        doSetPurchasePaymentId_InScope(toMutableValueCollectionImplicitly(purchasePaymentIdList));
    }

    protected def doSetPurchasePaymentId_InScope(purchasePaymentIdList: Collection[Long]): Unit = {
        regINS(CK_INS, cTL(purchasePaymentIdList), getCValuePurchasePaymentId(), "PURCHASE_PAYMENT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (購入支払ID)PURCHASE_PAYMENT_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param purchasePaymentIdList The collection of purchasePaymentId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    def setPurchasePaymentId_NotInScope(purchasePaymentIdList: List[Long]): Unit = {
        doSetPurchasePaymentId_NotInScope(if (purchasePaymentIdList != null) { purchasePaymentIdList.map(_.asInstanceOf[Long]).asJava } else { null });
    }

    protected def doSetPurchasePaymentId_NotInScope(purchasePaymentIdList: Collection[Long]): Unit = {
        regINS(CK_NINS, cTL(purchasePaymentIdList), getCValuePurchasePaymentId(), "PURCHASE_PAYMENT_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * (購入支払ID)PURCHASE_PAYMENT_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    def setPurchasePaymentId_IsNull(): Unit = { regPurchasePaymentId(CK_ISN, AbstractConditionQuery.DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * (購入支払ID)PURCHASE_PAYMENT_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    def setPurchasePaymentId_IsNotNull(): Unit = { regPurchasePaymentId(CK_ISNN, AbstractConditionQuery.DOBJ); }

    protected def regPurchasePaymentId(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValuePurchasePaymentId(), "PURCHASE_PAYMENT_ID"); }
    protected def getCValuePurchasePaymentId(): ConditionValue;

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * (購入ID)PURCHASE_ID: {IX, NotNull, BIGINT(19), FK to PURCHASE}
     * @param purchaseId The value of purchaseId as equal. (NullAllowed: if null, no condition)
     */
    def setPurchaseId_Equal(purchaseId: Long): Unit = {
        doSetPurchaseId_Equal(purchaseId);
    }

    protected def doSetPurchaseId_Equal(purchaseId: Long): Unit = {
        regPurchaseId(CK_EQ, purchaseId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (購入ID)PURCHASE_ID: {IX, NotNull, BIGINT(19), FK to PURCHASE}
     * @param purchaseId The value of purchaseId as notEqual. (NullAllowed: if null, no condition)
     */
    def setPurchaseId_NotEqual(purchaseId: Long): Unit = {
        doSetPurchaseId_NotEqual(purchaseId);
    }

    protected def doSetPurchaseId_NotEqual(purchaseId: Long): Unit = {
        regPurchaseId(CK_NES, purchaseId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (購入ID)PURCHASE_ID: {IX, NotNull, BIGINT(19), FK to PURCHASE}
     * @param purchaseId The value of purchaseId as greaterThan. (NullAllowed: if null, no condition)
     */
    def setPurchaseId_GreaterThan(purchaseId: Long): Unit = {
        regPurchaseId(CK_GT, purchaseId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (購入ID)PURCHASE_ID: {IX, NotNull, BIGINT(19), FK to PURCHASE}
     * @param purchaseId The value of purchaseId as lessThan. (NullAllowed: if null, no condition)
     */
    def setPurchaseId_LessThan(purchaseId: Long): Unit = {
        regPurchaseId(CK_LT, purchaseId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (購入ID)PURCHASE_ID: {IX, NotNull, BIGINT(19), FK to PURCHASE}
     * @param purchaseId The value of purchaseId as greaterEqual. (NullAllowed: if null, no condition)
     */
    def setPurchaseId_GreaterEqual(purchaseId: Long): Unit = {
        regPurchaseId(CK_GE, purchaseId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (購入ID)PURCHASE_ID: {IX, NotNull, BIGINT(19), FK to PURCHASE}
     * @param purchaseId The value of purchaseId as lessEqual. (NullAllowed: if null, no condition)
     */
    def setPurchaseId_LessEqual(purchaseId: Long): Unit = {
        regPurchaseId(CK_LE, purchaseId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (購入ID)PURCHASE_ID: {IX, NotNull, BIGINT(19), FK to PURCHASE}
     * @param minNumber The min number of purchaseId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of purchaseId. (NullAllowed: if null, no to-condition)
     * @param optionCall The callback for option of range-of. (NotNull)
     */
    def setPurchaseId_RangeOf(minNumber: Long, maxNumber: Long)(optionCall: (RangeOfOption) => Unit): Unit = {
        regROO(minNumber, maxNumber, getCValuePurchaseId(), "PURCHASE_ID", callbackROOP(optionCall));
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (購入ID)PURCHASE_ID: {IX, NotNull, BIGINT(19), FK to PURCHASE}
     * @param purchaseIdList The collection of purchaseId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    def setPurchaseId_InScope(purchaseIdList: List[Long]): Unit = {
        doSetPurchaseId_InScope(toMutableValueCollectionImplicitly(purchaseIdList));
    }

    protected def doSetPurchaseId_InScope(purchaseIdList: Collection[Long]): Unit = {
        regINS(CK_INS, cTL(purchaseIdList), getCValuePurchaseId(), "PURCHASE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (購入ID)PURCHASE_ID: {IX, NotNull, BIGINT(19), FK to PURCHASE}
     * @param purchaseIdList The collection of purchaseId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    def setPurchaseId_NotInScope(purchaseIdList: List[Long]): Unit = {
        doSetPurchaseId_NotInScope(if (purchaseIdList != null) { purchaseIdList.map(_.asInstanceOf[Long]).asJava } else { null });
    }

    protected def doSetPurchaseId_NotInScope(purchaseIdList: Collection[Long]): Unit = {
        regINS(CK_NINS, cTL(purchaseIdList), getCValuePurchaseId(), "PURCHASE_ID");
    }

    protected def regPurchaseId(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValuePurchaseId(), "PURCHASE_ID"); }
    protected def getCValuePurchaseId(): ConditionValue;

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * (支払金額)PAYMENT_AMOUNT: {NotNull, DECIMAL(10, 2)}
     * @param paymentAmount The value of paymentAmount as equal. (NullAllowed: if null, no condition)
     */
    def setPaymentAmount_Equal(paymentAmount: scala.math.BigDecimal): Unit = {
        doSetPaymentAmount_Equal(paymentAmount.underlying);
    }

    protected def doSetPaymentAmount_Equal(paymentAmount: java.math.BigDecimal): Unit = {
        regPaymentAmount(CK_EQ, paymentAmount);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (支払金額)PAYMENT_AMOUNT: {NotNull, DECIMAL(10, 2)}
     * @param paymentAmount The value of paymentAmount as notEqual. (NullAllowed: if null, no condition)
     */
    def setPaymentAmount_NotEqual(paymentAmount: scala.math.BigDecimal): Unit = {
        doSetPaymentAmount_NotEqual(paymentAmount.underlying);
    }

    protected def doSetPaymentAmount_NotEqual(paymentAmount: java.math.BigDecimal): Unit = {
        regPaymentAmount(CK_NES, paymentAmount);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (支払金額)PAYMENT_AMOUNT: {NotNull, DECIMAL(10, 2)}
     * @param paymentAmount The value of paymentAmount as greaterThan. (NullAllowed: if null, no condition)
     */
    def setPaymentAmount_GreaterThan(paymentAmount: scala.math.BigDecimal): Unit = {
        regPaymentAmount(CK_GT, paymentAmount.underlying);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (支払金額)PAYMENT_AMOUNT: {NotNull, DECIMAL(10, 2)}
     * @param paymentAmount The value of paymentAmount as lessThan. (NullAllowed: if null, no condition)
     */
    def setPaymentAmount_LessThan(paymentAmount: scala.math.BigDecimal): Unit = {
        regPaymentAmount(CK_LT, paymentAmount.underlying);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (支払金額)PAYMENT_AMOUNT: {NotNull, DECIMAL(10, 2)}
     * @param paymentAmount The value of paymentAmount as greaterEqual. (NullAllowed: if null, no condition)
     */
    def setPaymentAmount_GreaterEqual(paymentAmount: scala.math.BigDecimal): Unit = {
        regPaymentAmount(CK_GE, paymentAmount.underlying);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (支払金額)PAYMENT_AMOUNT: {NotNull, DECIMAL(10, 2)}
     * @param paymentAmount The value of paymentAmount as lessEqual. (NullAllowed: if null, no condition)
     */
    def setPaymentAmount_LessEqual(paymentAmount: scala.math.BigDecimal): Unit = {
        regPaymentAmount(CK_LE, paymentAmount.underlying);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (支払金額)PAYMENT_AMOUNT: {NotNull, DECIMAL(10, 2)}
     * @param minNumber The min number of paymentAmount. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of paymentAmount. (NullAllowed: if null, no to-condition)
     * @param optionCall The callback for option of range-of. (NotNull)
     */
    def setPaymentAmount_RangeOf(minNumber: scala.math.BigDecimal, maxNumber: scala.math.BigDecimal)(optionCall: (RangeOfOption) => Unit): Unit = {
        regROO(minNumber, maxNumber, getCValuePaymentAmount(), "PAYMENT_AMOUNT", callbackROOP(optionCall));
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (支払金額)PAYMENT_AMOUNT: {NotNull, DECIMAL(10, 2)}
     * @param paymentAmountList The collection of paymentAmount as inScope. (NullAllowed: if null (or empty), no condition)
     */
    def setPaymentAmount_InScope(paymentAmountList: List[scala.math.BigDecimal]): Unit = {
        doSetPaymentAmount_InScope(toMutableValueCollectionImplicitly(paymentAmountList));
    }

    protected def doSetPaymentAmount_InScope(paymentAmountList: Collection[java.math.BigDecimal]): Unit = {
        regINS(CK_INS, cTL(paymentAmountList), getCValuePaymentAmount(), "PAYMENT_AMOUNT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (支払金額)PAYMENT_AMOUNT: {NotNull, DECIMAL(10, 2)}
     * @param paymentAmountList The collection of paymentAmount as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    def setPaymentAmount_NotInScope(paymentAmountList: List[scala.math.BigDecimal]): Unit = {
        doSetPaymentAmount_NotInScope(if (paymentAmountList != null) { paymentAmountList.map(_.asInstanceOf[java.math.BigDecimal]).asJava } else { null });
    }

    protected def doSetPaymentAmount_NotInScope(paymentAmountList: Collection[java.math.BigDecimal]): Unit = {
        regINS(CK_NINS, cTL(paymentAmountList), getCValuePaymentAmount(), "PAYMENT_AMOUNT");
    }

    protected def regPaymentAmount(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValuePaymentAmount(), "PAYMENT_AMOUNT"); }
    protected def getCValuePaymentAmount(): ConditionValue;

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * (支払日時)PAYMENT_DATETIME: {IX+, NotNull, TIMESTAMP(23, 10)}
     * @param paymentDatetime The value of paymentDatetime as equal. (NullAllowed: if null, no condition)
     */
    def setPaymentDatetime_Equal(paymentDatetime: org.joda.time.LocalDateTime): Unit = {
        regPaymentDatetime(CK_EQ,  paymentDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (支払日時)PAYMENT_DATETIME: {IX+, NotNull, TIMESTAMP(23, 10)}
     * @param paymentDatetime The value of paymentDatetime as greaterThan. (NullAllowed: if null, no condition)
     */
    def setPaymentDatetime_GreaterThan(paymentDatetime: org.joda.time.LocalDateTime): Unit = {
        regPaymentDatetime(CK_GT,  paymentDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (支払日時)PAYMENT_DATETIME: {IX+, NotNull, TIMESTAMP(23, 10)}
     * @param paymentDatetime The value of paymentDatetime as lessThan. (NullAllowed: if null, no condition)
     */
    def setPaymentDatetime_LessThan(paymentDatetime: org.joda.time.LocalDateTime): Unit = {
        regPaymentDatetime(CK_LT,  paymentDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (支払日時)PAYMENT_DATETIME: {IX+, NotNull, TIMESTAMP(23, 10)}
     * @param paymentDatetime The value of paymentDatetime as greaterEqual. (NullAllowed: if null, no condition)
     */
    def setPaymentDatetime_GreaterEqual(paymentDatetime: org.joda.time.LocalDateTime): Unit = {
        regPaymentDatetime(CK_GE,  paymentDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (支払日時)PAYMENT_DATETIME: {IX+, NotNull, TIMESTAMP(23, 10)}
     * @param paymentDatetime The value of paymentDatetime as lessEqual. (NullAllowed: if null, no condition)
     */
    def setPaymentDatetime_LessEqual(paymentDatetime: org.joda.time.LocalDateTime): Unit = {
        regPaymentDatetime(CK_LE, paymentDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (支払日時)PAYMENT_DATETIME: {IX+, NotNull, TIMESTAMP(23, 10)}
     * <pre>e.g. setPaymentDatetime_FromTo(fromDate, toDate, new <span style="color: #DD4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of paymentDatetime. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of paymentDatetime. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    def setPaymentDatetime_FromTo(fromDatetime: org.joda.time.LocalDateTime, toDatetime: org.joda.time.LocalDateTime)(optionCall: (ScrFromToOption) => Unit): Unit = {
        regFTQ(toTimestamp(fromDatetime), toTimestamp(toDatetime), getCValuePaymentDatetime(), "PAYMENT_DATETIME", callbackFTOP(optionCall));
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (支払日時)PAYMENT_DATETIME: {IX+, NotNull, TIMESTAMP(23, 10)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #DD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of paymentDatetime. (NullAllowed: if null, no from-condition)
     * @param toDate The to-date(yyyy/MM/dd) of paymentDatetime. (NullAllowed: if null, no to-condition)
     */
    def setPaymentDatetime_DateFromTo(fromDate: org.joda.time.LocalDateTime, toDate: org.joda.time.LocalDateTime): Unit = {
        setPaymentDatetime_FromTo(fromDate, toDate)(_.compareAsDate);
    }

    protected def regPaymentDatetime(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValuePaymentDatetime(), "PAYMENT_DATETIME"); }
    protected def getCValuePaymentDatetime(): ConditionValue;

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (支払方法コード)PAYMENT_METHOD_CODE: {NotNull, CHAR(3)}
     * @param paymentMethodCode The value of paymentMethodCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    def setPaymentMethodCode_Equal(paymentMethodCode: String): Unit = {
        doSetPaymentMethodCode_Equal(fRES(paymentMethodCode));
    }

    protected def doSetPaymentMethodCode_Equal(paymentMethodCode: String): Unit = {
        regPaymentMethodCode(CK_EQ, hSC("PAYMENT_METHOD_CODE", paymentMethodCode, 3, "E"));
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (支払方法コード)PAYMENT_METHOD_CODE: {NotNull, CHAR(3)}
     * @param paymentMethodCode The value of paymentMethodCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    def setPaymentMethodCode_NotEqual(paymentMethodCode: String): Unit = {
        doSetPaymentMethodCode_NotEqual(fRES(paymentMethodCode));
    }

    protected def doSetPaymentMethodCode_NotEqual(paymentMethodCode: String): Unit = {
        regPaymentMethodCode(CK_NES, hSC("PAYMENT_METHOD_CODE", paymentMethodCode, 3, "E"));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (支払方法コード)PAYMENT_METHOD_CODE: {NotNull, CHAR(3)}
     * @param paymentMethodCodeList The collection of paymentMethodCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    def setPaymentMethodCode_InScope(paymentMethodCodeList: List[String]): Unit = {
        doSetPaymentMethodCode_InScope(toMutableValueCollectionImplicitly(paymentMethodCodeList));
    }

    protected def doSetPaymentMethodCode_InScope(paymentMethodCodeList: Collection[String]): Unit = {
        regINS(CK_INS, cTL(paymentMethodCodeList), getCValuePaymentMethodCode(), "PAYMENT_METHOD_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (支払方法コード)PAYMENT_METHOD_CODE: {NotNull, CHAR(3)}
     * @param paymentMethodCodeList The collection of paymentMethodCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    def setPaymentMethodCode_NotInScope(paymentMethodCodeList: List[String]): Unit = {
        doSetPaymentMethodCode_NotInScope(if (paymentMethodCodeList != null) { paymentMethodCodeList.map(_.asInstanceOf[String]).asJava } else { null });
    }

    protected def doSetPaymentMethodCode_NotInScope(paymentMethodCodeList: Collection[String]): Unit = {
        regINS(CK_NINS, cTL(paymentMethodCodeList), getCValuePaymentMethodCode(), "PAYMENT_METHOD_CODE");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (支払方法コード)PAYMENT_METHOD_CODE: {NotNull, CHAR(3)}
     * @param paymentMethodCode The value of paymentMethodCode as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    def setPaymentMethodCode_PrefixSearch(paymentMethodCode: String): Unit = {
        setPaymentMethodCode_LikeSearch(paymentMethodCode)(_.likePrefix);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (支払方法コード)PAYMENT_METHOD_CODE: {NotNull, CHAR(3)} <br />
     * <pre>e.g. setPaymentMethodCode_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param paymentMethodCode The value of paymentMethodCode as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param optionCall The callback for option of like-search. (NotNull)
     */
    def setPaymentMethodCode_LikeSearch(paymentMethodCode: String)(optionCall: (ScrLikeSearchOption) => Unit): Unit = {
        regLSQ(CK_LS, fRES(paymentMethodCode), getCValuePaymentMethodCode(), "PAYMENT_METHOD_CODE", callbackLSOP(optionCall));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (支払方法コード)PAYMENT_METHOD_CODE: {NotNull, CHAR(3)}
     * @param paymentMethodCode The value of paymentMethodCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param optionCall The callback for option of not-like-search. (NotNull)
     */
    def setPaymentMethodCode_NotLikeSearch(paymentMethodCode: String)(optionCall: (ScrLikeSearchOption) => Unit): Unit = {
        regLSQ(CK_NLS, fRES(paymentMethodCode), getCValuePaymentMethodCode(), "PAYMENT_METHOD_CODE", callbackLSOP(optionCall));
    }

    protected def regPaymentMethodCode(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValuePaymentMethodCode(), "PAYMENT_METHOD_CODE"); }
    protected def getCValuePaymentMethodCode(): ConditionValue;

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * REGISTER_DATETIME: {NotNull, TIMESTAMP(23, 10)}
     * @param registerDatetime The value of registerDatetime as equal. (NullAllowed: if null, no condition)
     */
    def setRegisterDatetime_Equal(registerDatetime: org.joda.time.LocalDateTime): Unit = {
        regRegisterDatetime(CK_EQ,  registerDatetime);
    }

    protected def regRegisterDatetime(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValueRegisterDatetime(), "REGISTER_DATETIME"); }
    protected def getCValueRegisterDatetime(): ConditionValue;

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * REGISTER_USER: {NotNull, VARCHAR(200)}
     * @param registerUser The value of registerUser as equal. (NullAllowed: if null (or empty), no condition)
     */
    def setRegisterUser_Equal(registerUser: String): Unit = {
        doSetRegisterUser_Equal(fRES(registerUser));
    }

    protected def doSetRegisterUser_Equal(registerUser: String): Unit = {
        regRegisterUser(CK_EQ, registerUser);
    }

    protected def regRegisterUser(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValueRegisterUser(), "REGISTER_USER"); }
    protected def getCValueRegisterUser(): ConditionValue;

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * UPDATE_DATETIME: {NotNull, TIMESTAMP(23, 10)}
     * @param updateDatetime The value of updateDatetime as equal. (NullAllowed: if null, no condition)
     */
    def setUpdateDatetime_Equal(updateDatetime: org.joda.time.LocalDateTime): Unit = {
        regUpdateDatetime(CK_EQ,  updateDatetime);
    }

    protected def regUpdateDatetime(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValueUpdateDatetime(), "UPDATE_DATETIME"); }
    protected def getCValueUpdateDatetime(): ConditionValue;

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * UPDATE_USER: {NotNull, VARCHAR(200)}
     * @param updateUser The value of updateUser as equal. (NullAllowed: if null (or empty), no condition)
     */
    def setUpdateUser_Equal(updateUser: String): Unit = {
        doSetUpdateUser_Equal(fRES(updateUser));
    }

    protected def doSetUpdateUser_Equal(updateUser: String): Unit = {
        regUpdateUser(CK_EQ, updateUser);
    }

    protected def regUpdateUser(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValueUpdateUser(), "UPDATE_USER"); }
    protected def getCValueUpdateUser(): ConditionValue;

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;PurchasePaymentCB&gt;() {
     *     public void query(PurchasePaymentCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_Equal(): ScrHpSSQFunction[PurchasePaymentCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_EQ, classOf[PurchasePaymentCB]));
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;PurchasePaymentCB&gt;() {
     *     public void query(PurchasePaymentCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_NotEqual(): ScrHpSSQFunction[PurchasePaymentCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_NES, classOf[PurchasePaymentCB]));
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;PurchasePaymentCB&gt;() {
     *     public void query(PurchasePaymentCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_GreaterThan(): ScrHpSSQFunction[PurchasePaymentCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_GT, classOf[PurchasePaymentCB]));
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;PurchasePaymentCB&gt;() {
     *     public void query(PurchasePaymentCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_LessThan(): ScrHpSSQFunction[PurchasePaymentCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_LT, classOf[PurchasePaymentCB]));
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;PurchasePaymentCB&gt;() {
     *     public void query(PurchasePaymentCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_GreaterEqual(): ScrHpSSQFunction[PurchasePaymentCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_GE, classOf[PurchasePaymentCB]));
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;PurchasePaymentCB&gt;() {
     *     public void query(PurchasePaymentCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_LessEqual(): ScrHpSSQFunction[PurchasePaymentCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_LE, classOf[PurchasePaymentCB]));
    }

    protected def toScalaSSQFunction(function: HpSSQFunction[PurchasePaymentCB]): ScrHpSSQFunction[PurchasePaymentCB] =
    { new ScrHpSSQFunction(function) }

    override protected def xscalarCondition[CB <: ConditionBean](fn: String, sq: SubQuery[CB], rd: String, op: HpSSQOption[CB]): Unit = {
        assertObjectNotNull("subQuery", sq);
        val cb: PurchasePaymentCB = xcreateScalarConditionCB(); sq.query(cb.asInstanceOf[CB]);
        val pp: String = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean(xcreateScalarConditionPartitionByCB().asInstanceOf[CB]); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    def keepScalarCondition(sq: PurchasePaymentCQ): String;

    protected def xcreateScalarConditionCB(): PurchasePaymentCB = {
        val cb: PurchasePaymentCB = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected def xcreateScalarConditionPartitionByCB(): PurchasePaymentCB = {
        val cb: PurchasePaymentCB = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    def xsmyselfDerive(fn: String, sq: SubQuery[PurchasePaymentCB], al: String, op: DerivedReferrerOption): Unit = {
        assertObjectNotNull("subQuery", sq);
        val cb: PurchasePaymentCB = new PurchasePaymentCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        val pp: String = keepSpecifyMyselfDerived(cb.query());
        val pk: String = "PURCHASE_PAYMENT_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    def keepSpecifyMyselfDerived(sq: PurchasePaymentCQ): String;

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    def myselfDerived(): ScrHpQDRFunction[PurchasePaymentCB] = {
        return toScalaQDRFunction(xcreateQDRFunctionMyselfDerived(classOf[PurchasePaymentCB]));
    }
    override protected def xqderiveMyselfDerived[CB <: ConditionBean](fn: String, sq: SubQuery[CB], rd: String, vl: Object, op: DerivedReferrerOption): Unit = {
        assertObjectNotNull("subQuery", sq);
        val cb: PurchasePaymentCB = new PurchasePaymentCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb.asInstanceOf[CB]);
        val pk: String = "PURCHASE_PAYMENT_ID";
        val sqpp: String = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        val prpp: String = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    def keepQueryMyselfDerived(sq: PurchasePaymentCQ): String;
    def keepQueryMyselfDerivedParameter(vl: Object): String;

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    def myselfExists(subQuery: (PurchasePaymentCB) => Unit): Unit = {
        assertObjectNotNull("subQuery", subQuery);
        val cb: PurchasePaymentCB = new PurchasePaymentCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery(cb); } finally { unlock(); }
        val pp: String = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    def keepMyselfExists(sq: PurchasePaymentCQ): String;

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    def myselfInScope(subQuery: (PurchasePaymentCB) => Unit): Unit = {
        assertObjectNotNull("subQuery", subQuery);
        val cb: PurchasePaymentCB = new PurchasePaymentCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery(cb); } finally { unlock(); }
        val pp: String = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    def keepMyselfInScope(sq: PurchasePaymentCQ): String;

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
    protected def newMyCB(): PurchasePaymentCB = {
        return new PurchasePaymentCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected def xabUDT(): String = { return classOf[Date].getName(); }
    protected def xabCQ(): String = { return classOf[PurchasePaymentCQ].getName(); }
    protected def xabLSO(): String = { return classOf[LikeSearchOption].getName(); }
    protected def xabSSQS(): String = { return classOf[HpSSQSetupper[_]].getName(); }
}
