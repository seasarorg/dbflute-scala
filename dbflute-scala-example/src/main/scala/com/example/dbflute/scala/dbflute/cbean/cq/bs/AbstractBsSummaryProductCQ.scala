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
 * The abstract condition-query of SUMMARY_PRODUCT.
 * @author DBFlute(AutoGenerator)
 */
abstract class AbstractBsSummaryProductCQ(referrerQuery: ConditionQuery, sqlClause: SqlClause, aliasName: String, nestLevel: Integer)
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
        return "SUMMARY_PRODUCT";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * PRODUCT_ID: {INTEGER(10)}
     * @param productId The value of productId as equal. (NullAllowed: if null, no condition)
     */
    def setProductId_Equal(productId: Int): Unit = {
        doSetProductId_Equal(productId);
    }

    protected def doSetProductId_Equal(productId: Integer): Unit = {
        regProductId(CK_EQ, productId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * PRODUCT_ID: {INTEGER(10)}
     * @param productId The value of productId as notEqual. (NullAllowed: if null, no condition)
     */
    def setProductId_NotEqual(productId: Int): Unit = {
        doSetProductId_NotEqual(productId);
    }

    protected def doSetProductId_NotEqual(productId: Integer): Unit = {
        regProductId(CK_NES, productId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * PRODUCT_ID: {INTEGER(10)}
     * @param productId The value of productId as greaterThan. (NullAllowed: if null, no condition)
     */
    def setProductId_GreaterThan(productId: Int): Unit = {
        regProductId(CK_GT, productId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * PRODUCT_ID: {INTEGER(10)}
     * @param productId The value of productId as lessThan. (NullAllowed: if null, no condition)
     */
    def setProductId_LessThan(productId: Int): Unit = {
        regProductId(CK_LT, productId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * PRODUCT_ID: {INTEGER(10)}
     * @param productId The value of productId as greaterEqual. (NullAllowed: if null, no condition)
     */
    def setProductId_GreaterEqual(productId: Int): Unit = {
        regProductId(CK_GE, productId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * PRODUCT_ID: {INTEGER(10)}
     * @param productId The value of productId as lessEqual. (NullAllowed: if null, no condition)
     */
    def setProductId_LessEqual(productId: Int): Unit = {
        regProductId(CK_LE, productId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * PRODUCT_ID: {INTEGER(10)}
     * @param minNumber The min number of productId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of productId. (NullAllowed: if null, no to-condition)
     * @param optionCall The callback for option of range-of. (NotNull)
     */
    def setProductId_RangeOf(minNumber: Int, maxNumber: Int)(optionCall: (RangeOfOption) => Unit): Unit = {
        regROO(minNumber, maxNumber, getCValueProductId(), "PRODUCT_ID", callbackROOP(optionCall));
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * PRODUCT_ID: {INTEGER(10)}
     * @param productIdList The collection of productId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    def setProductId_InScope(productIdList: List[Int]): Unit = {
        doSetProductId_InScope(toMutableValueCollectionImplicitly(productIdList));
    }

    protected def doSetProductId_InScope(productIdList: Collection[Integer]): Unit = {
        regINS(CK_INS, cTL(productIdList), getCValueProductId(), "PRODUCT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * PRODUCT_ID: {INTEGER(10)}
     * @param productIdList The collection of productId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    def setProductId_NotInScope(productIdList: List[Int]): Unit = {
        doSetProductId_NotInScope(if (productIdList != null) { productIdList.map(_.asInstanceOf[Integer]).asJava } else { null });
    }

    protected def doSetProductId_NotInScope(productIdList: Collection[Integer]): Unit = {
        regINS(CK_NINS, cTL(productIdList), getCValueProductId(), "PRODUCT_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * PRODUCT_ID: {INTEGER(10)}
     */
    def setProductId_IsNull(): Unit = { regProductId(CK_ISN, AbstractConditionQuery.DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * PRODUCT_ID: {INTEGER(10)}
     */
    def setProductId_IsNotNull(): Unit = { regProductId(CK_ISNN, AbstractConditionQuery.DOBJ); }

    protected def regProductId(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValueProductId(), "PRODUCT_ID"); }
    protected def getCValueProductId(): ConditionValue;

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * PRODUCT_NAME: {VARCHAR(50)}
     * @param productName The value of productName as equal. (NullAllowed: if null (or empty), no condition)
     */
    def setProductName_Equal(productName: String): Unit = {
        doSetProductName_Equal(fRES(productName));
    }

    protected def doSetProductName_Equal(productName: String): Unit = {
        regProductName(CK_EQ, productName);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PRODUCT_NAME: {VARCHAR(50)}
     * @param productName The value of productName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    def setProductName_PrefixSearch(productName: String): Unit = {
        setProductName_LikeSearch(productName)(_.likePrefix);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PRODUCT_NAME: {VARCHAR(50)} <br />
     * <pre>e.g. setProductName_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param productName The value of productName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param optionCall The callback for option of like-search. (NotNull)
     */
    def setProductName_LikeSearch(productName: String)(optionCall: (ScrLikeSearchOption) => Unit): Unit = {
        regLSQ(CK_LS, fRES(productName), getCValueProductName(), "PRODUCT_NAME", callbackLSOP(optionCall));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PRODUCT_NAME: {VARCHAR(50)}
     * @param productName The value of productName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param optionCall The callback for option of not-like-search. (NotNull)
     */
    def setProductName_NotLikeSearch(productName: String)(optionCall: (ScrLikeSearchOption) => Unit): Unit = {
        regLSQ(CK_NLS, fRES(productName), getCValueProductName(), "PRODUCT_NAME", callbackLSOP(optionCall));
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * PRODUCT_NAME: {VARCHAR(50)}
     */
    def setProductName_IsNull(): Unit = { regProductName(CK_ISN, AbstractConditionQuery.DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * PRODUCT_NAME: {VARCHAR(50)}
     */
    def setProductName_IsNullOrEmpty(): Unit = { regProductName(CK_ISNOE, AbstractConditionQuery.DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * PRODUCT_NAME: {VARCHAR(50)}
     */
    def setProductName_IsNotNull(): Unit = { regProductName(CK_ISNN, AbstractConditionQuery.DOBJ); }

    protected def regProductName(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValueProductName(), "PRODUCT_NAME"); }
    protected def getCValueProductName(): ConditionValue;

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * PRODUCT_HANDLE_CODE: {VARCHAR(100)}
     * @param productHandleCode The value of productHandleCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    def setProductHandleCode_Equal(productHandleCode: String): Unit = {
        doSetProductHandleCode_Equal(fRES(productHandleCode));
    }

    protected def doSetProductHandleCode_Equal(productHandleCode: String): Unit = {
        regProductHandleCode(CK_EQ, productHandleCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * PRODUCT_HANDLE_CODE: {VARCHAR(100)}
     * @param productHandleCode The value of productHandleCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    def setProductHandleCode_NotEqual(productHandleCode: String): Unit = {
        doSetProductHandleCode_NotEqual(fRES(productHandleCode));
    }

    protected def doSetProductHandleCode_NotEqual(productHandleCode: String): Unit = {
        regProductHandleCode(CK_NES, productHandleCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * PRODUCT_HANDLE_CODE: {VARCHAR(100)}
     * @param productHandleCodeList The collection of productHandleCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    def setProductHandleCode_InScope(productHandleCodeList: List[String]): Unit = {
        doSetProductHandleCode_InScope(toMutableValueCollectionImplicitly(productHandleCodeList));
    }

    protected def doSetProductHandleCode_InScope(productHandleCodeList: Collection[String]): Unit = {
        regINS(CK_INS, cTL(productHandleCodeList), getCValueProductHandleCode(), "PRODUCT_HANDLE_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * PRODUCT_HANDLE_CODE: {VARCHAR(100)}
     * @param productHandleCodeList The collection of productHandleCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    def setProductHandleCode_NotInScope(productHandleCodeList: List[String]): Unit = {
        doSetProductHandleCode_NotInScope(if (productHandleCodeList != null) { productHandleCodeList.map(_.asInstanceOf[String]).asJava } else { null });
    }

    protected def doSetProductHandleCode_NotInScope(productHandleCodeList: Collection[String]): Unit = {
        regINS(CK_NINS, cTL(productHandleCodeList), getCValueProductHandleCode(), "PRODUCT_HANDLE_CODE");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PRODUCT_HANDLE_CODE: {VARCHAR(100)}
     * @param productHandleCode The value of productHandleCode as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    def setProductHandleCode_PrefixSearch(productHandleCode: String): Unit = {
        setProductHandleCode_LikeSearch(productHandleCode)(_.likePrefix);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PRODUCT_HANDLE_CODE: {VARCHAR(100)} <br />
     * <pre>e.g. setProductHandleCode_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param productHandleCode The value of productHandleCode as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param optionCall The callback for option of like-search. (NotNull)
     */
    def setProductHandleCode_LikeSearch(productHandleCode: String)(optionCall: (ScrLikeSearchOption) => Unit): Unit = {
        regLSQ(CK_LS, fRES(productHandleCode), getCValueProductHandleCode(), "PRODUCT_HANDLE_CODE", callbackLSOP(optionCall));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PRODUCT_HANDLE_CODE: {VARCHAR(100)}
     * @param productHandleCode The value of productHandleCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param optionCall The callback for option of not-like-search. (NotNull)
     */
    def setProductHandleCode_NotLikeSearch(productHandleCode: String)(optionCall: (ScrLikeSearchOption) => Unit): Unit = {
        regLSQ(CK_NLS, fRES(productHandleCode), getCValueProductHandleCode(), "PRODUCT_HANDLE_CODE", callbackLSOP(optionCall));
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * PRODUCT_HANDLE_CODE: {VARCHAR(100)}
     */
    def setProductHandleCode_IsNull(): Unit = { regProductHandleCode(CK_ISN, AbstractConditionQuery.DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * PRODUCT_HANDLE_CODE: {VARCHAR(100)}
     */
    def setProductHandleCode_IsNullOrEmpty(): Unit = { regProductHandleCode(CK_ISNOE, AbstractConditionQuery.DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * PRODUCT_HANDLE_CODE: {VARCHAR(100)}
     */
    def setProductHandleCode_IsNotNull(): Unit = { regProductHandleCode(CK_ISNN, AbstractConditionQuery.DOBJ); }

    protected def regProductHandleCode(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValueProductHandleCode(), "PRODUCT_HANDLE_CODE"); }
    protected def getCValueProductHandleCode(): ConditionValue;

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * PRODUCT_STATUS_CODE: {CHAR(3)}
     * @param productStatusCode The value of productStatusCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    def setProductStatusCode_Equal(productStatusCode: String): Unit = {
        doSetProductStatusCode_Equal(fRES(productStatusCode));
    }

    protected def doSetProductStatusCode_Equal(productStatusCode: String): Unit = {
        regProductStatusCode(CK_EQ, hSC("PRODUCT_STATUS_CODE", productStatusCode, 3, "E"));
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * PRODUCT_STATUS_CODE: {CHAR(3)}
     * @param productStatusCode The value of productStatusCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    def setProductStatusCode_NotEqual(productStatusCode: String): Unit = {
        doSetProductStatusCode_NotEqual(fRES(productStatusCode));
    }

    protected def doSetProductStatusCode_NotEqual(productStatusCode: String): Unit = {
        regProductStatusCode(CK_NES, hSC("PRODUCT_STATUS_CODE", productStatusCode, 3, "E"));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * PRODUCT_STATUS_CODE: {CHAR(3)}
     * @param productStatusCodeList The collection of productStatusCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    def setProductStatusCode_InScope(productStatusCodeList: List[String]): Unit = {
        doSetProductStatusCode_InScope(toMutableValueCollectionImplicitly(productStatusCodeList));
    }

    protected def doSetProductStatusCode_InScope(productStatusCodeList: Collection[String]): Unit = {
        regINS(CK_INS, cTL(productStatusCodeList), getCValueProductStatusCode(), "PRODUCT_STATUS_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * PRODUCT_STATUS_CODE: {CHAR(3)}
     * @param productStatusCodeList The collection of productStatusCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    def setProductStatusCode_NotInScope(productStatusCodeList: List[String]): Unit = {
        doSetProductStatusCode_NotInScope(if (productStatusCodeList != null) { productStatusCodeList.map(_.asInstanceOf[String]).asJava } else { null });
    }

    protected def doSetProductStatusCode_NotInScope(productStatusCodeList: Collection[String]): Unit = {
        regINS(CK_NINS, cTL(productStatusCodeList), getCValueProductStatusCode(), "PRODUCT_STATUS_CODE");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PRODUCT_STATUS_CODE: {CHAR(3)}
     * @param productStatusCode The value of productStatusCode as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    def setProductStatusCode_PrefixSearch(productStatusCode: String): Unit = {
        setProductStatusCode_LikeSearch(productStatusCode)(_.likePrefix);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PRODUCT_STATUS_CODE: {CHAR(3)} <br />
     * <pre>e.g. setProductStatusCode_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param productStatusCode The value of productStatusCode as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param optionCall The callback for option of like-search. (NotNull)
     */
    def setProductStatusCode_LikeSearch(productStatusCode: String)(optionCall: (ScrLikeSearchOption) => Unit): Unit = {
        regLSQ(CK_LS, fRES(productStatusCode), getCValueProductStatusCode(), "PRODUCT_STATUS_CODE", callbackLSOP(optionCall));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PRODUCT_STATUS_CODE: {CHAR(3)}
     * @param productStatusCode The value of productStatusCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param optionCall The callback for option of not-like-search. (NotNull)
     */
    def setProductStatusCode_NotLikeSearch(productStatusCode: String)(optionCall: (ScrLikeSearchOption) => Unit): Unit = {
        regLSQ(CK_NLS, fRES(productStatusCode), getCValueProductStatusCode(), "PRODUCT_STATUS_CODE", callbackLSOP(optionCall));
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * PRODUCT_STATUS_CODE: {CHAR(3)}
     */
    def setProductStatusCode_IsNull(): Unit = { regProductStatusCode(CK_ISN, AbstractConditionQuery.DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * PRODUCT_STATUS_CODE: {CHAR(3)}
     */
    def setProductStatusCode_IsNullOrEmpty(): Unit = { regProductStatusCode(CK_ISNOE, AbstractConditionQuery.DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * PRODUCT_STATUS_CODE: {CHAR(3)}
     */
    def setProductStatusCode_IsNotNull(): Unit = { regProductStatusCode(CK_ISNN, AbstractConditionQuery.DOBJ); }

    protected def regProductStatusCode(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValueProductStatusCode(), "PRODUCT_STATUS_CODE"); }
    protected def getCValueProductStatusCode(): ConditionValue;

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * LATEST_PURCHASE_DATETIME: {TIMESTAMP(23, 10)}
     * @param latestPurchaseDatetime The value of latestPurchaseDatetime as equal. (NullAllowed: if null, no condition)
     */
    def setLatestPurchaseDatetime_Equal(latestPurchaseDatetime: org.joda.time.LocalDateTime): Unit = {
        regLatestPurchaseDatetime(CK_EQ,  latestPurchaseDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * LATEST_PURCHASE_DATETIME: {TIMESTAMP(23, 10)}
     * @param latestPurchaseDatetime The value of latestPurchaseDatetime as greaterThan. (NullAllowed: if null, no condition)
     */
    def setLatestPurchaseDatetime_GreaterThan(latestPurchaseDatetime: org.joda.time.LocalDateTime): Unit = {
        regLatestPurchaseDatetime(CK_GT,  latestPurchaseDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * LATEST_PURCHASE_DATETIME: {TIMESTAMP(23, 10)}
     * @param latestPurchaseDatetime The value of latestPurchaseDatetime as lessThan. (NullAllowed: if null, no condition)
     */
    def setLatestPurchaseDatetime_LessThan(latestPurchaseDatetime: org.joda.time.LocalDateTime): Unit = {
        regLatestPurchaseDatetime(CK_LT,  latestPurchaseDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * LATEST_PURCHASE_DATETIME: {TIMESTAMP(23, 10)}
     * @param latestPurchaseDatetime The value of latestPurchaseDatetime as greaterEqual. (NullAllowed: if null, no condition)
     */
    def setLatestPurchaseDatetime_GreaterEqual(latestPurchaseDatetime: org.joda.time.LocalDateTime): Unit = {
        regLatestPurchaseDatetime(CK_GE,  latestPurchaseDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * LATEST_PURCHASE_DATETIME: {TIMESTAMP(23, 10)}
     * @param latestPurchaseDatetime The value of latestPurchaseDatetime as lessEqual. (NullAllowed: if null, no condition)
     */
    def setLatestPurchaseDatetime_LessEqual(latestPurchaseDatetime: org.joda.time.LocalDateTime): Unit = {
        regLatestPurchaseDatetime(CK_LE, latestPurchaseDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * LATEST_PURCHASE_DATETIME: {TIMESTAMP(23, 10)}
     * <pre>e.g. setLatestPurchaseDatetime_FromTo(fromDate, toDate, new <span style="color: #DD4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of latestPurchaseDatetime. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of latestPurchaseDatetime. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    def setLatestPurchaseDatetime_FromTo(fromDatetime: org.joda.time.LocalDateTime, toDatetime: org.joda.time.LocalDateTime)(optionCall: (ScrFromToOption) => Unit): Unit = {
        regFTQ(toTimestamp(fromDatetime), toTimestamp(toDatetime), getCValueLatestPurchaseDatetime(), "LATEST_PURCHASE_DATETIME", callbackFTOP(optionCall));
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * LATEST_PURCHASE_DATETIME: {TIMESTAMP(23, 10)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #DD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of latestPurchaseDatetime. (NullAllowed: if null, no from-condition)
     * @param toDate The to-date(yyyy/MM/dd) of latestPurchaseDatetime. (NullAllowed: if null, no to-condition)
     */
    def setLatestPurchaseDatetime_DateFromTo(fromDate: org.joda.time.LocalDateTime, toDate: org.joda.time.LocalDateTime): Unit = {
        setLatestPurchaseDatetime_FromTo(fromDate, toDate)(_.compareAsDate);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * LATEST_PURCHASE_DATETIME: {TIMESTAMP(23, 10)}
     */
    def setLatestPurchaseDatetime_IsNull(): Unit = { regLatestPurchaseDatetime(CK_ISN, AbstractConditionQuery.DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * LATEST_PURCHASE_DATETIME: {TIMESTAMP(23, 10)}
     */
    def setLatestPurchaseDatetime_IsNotNull(): Unit = { regLatestPurchaseDatetime(CK_ISNN, AbstractConditionQuery.DOBJ); }

    protected def regLatestPurchaseDatetime(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValueLatestPurchaseDatetime(), "LATEST_PURCHASE_DATETIME"); }
    protected def getCValueLatestPurchaseDatetime(): ConditionValue;

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;SummaryProductCB&gt;() {
     *     public void query(SummaryProductCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_Equal(): ScrHpSSQFunction[SummaryProductCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_EQ, classOf[SummaryProductCB]));
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;SummaryProductCB&gt;() {
     *     public void query(SummaryProductCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_NotEqual(): ScrHpSSQFunction[SummaryProductCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_NES, classOf[SummaryProductCB]));
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;SummaryProductCB&gt;() {
     *     public void query(SummaryProductCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_GreaterThan(): ScrHpSSQFunction[SummaryProductCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_GT, classOf[SummaryProductCB]));
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;SummaryProductCB&gt;() {
     *     public void query(SummaryProductCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_LessThan(): ScrHpSSQFunction[SummaryProductCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_LT, classOf[SummaryProductCB]));
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;SummaryProductCB&gt;() {
     *     public void query(SummaryProductCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_GreaterEqual(): ScrHpSSQFunction[SummaryProductCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_GE, classOf[SummaryProductCB]));
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;SummaryProductCB&gt;() {
     *     public void query(SummaryProductCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_LessEqual(): ScrHpSSQFunction[SummaryProductCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_LE, classOf[SummaryProductCB]));
    }

    protected def toScalaSSQFunction(function: HpSSQFunction[SummaryProductCB]): ScrHpSSQFunction[SummaryProductCB] =
    { new ScrHpSSQFunction(function) }

    override protected def xscalarCondition[CB <: ConditionBean](fn: String, sq: SubQuery[CB], rd: String, op: HpSSQOption[CB]): Unit = {
        assertObjectNotNull("subQuery", sq);
        val cb: SummaryProductCB = xcreateScalarConditionCB(); sq.query(cb.asInstanceOf[CB]);
        val pp: String = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean(xcreateScalarConditionPartitionByCB().asInstanceOf[CB]); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    def keepScalarCondition(sq: SummaryProductCQ): String;

    protected def xcreateScalarConditionCB(): SummaryProductCB = {
        val cb: SummaryProductCB = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected def xcreateScalarConditionPartitionByCB(): SummaryProductCB = {
        val cb: SummaryProductCB = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

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
    protected def newMyCB(): SummaryProductCB = {
        return new SummaryProductCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected def xabUDT(): String = { return classOf[Date].getName(); }
    protected def xabCQ(): String = { return classOf[SummaryProductCQ].getName(); }
    protected def xabLSO(): String = { return classOf[LikeSearchOption].getName(); }
    protected def xabSSQS(): String = { return classOf[HpSSQSetupper[_]].getName(); }
}
