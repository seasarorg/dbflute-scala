package com.example.dbflute.scala.dbflute.cbean.cq.bs;

import java.lang.Long;
import java.util._;

import org.seasar.dbflute.cbean._;
import org.seasar.dbflute.cbean.AbstractConditionQuery._;
import org.seasar.dbflute.cbean.chelper._;
import org.seasar.dbflute.cbean.ckey._;
import org.seasar.dbflute.cbean.coption._;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.dbmeta.DBMetaProvider;
import com.example.dbflute.scala.dbflute.allcommon._;
import com.example.dbflute.scala.dbflute.cbean._;
import com.example.dbflute.scala.dbflute.cbean.cq._;

/**
 * The abstract condition-query of PURCHASE.
 * @author DBFlute(AutoGenerator)
 */
abstract class AbstractBsPurchaseCQ(referrerQuery: ConditionQuery, sqlClause: SqlClause, aliasName: String, nestLevel: Integer)
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
        return "PURCHASE";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * PURCHASE_ID: {PK, ID, NotNull, BIGINT(19)}
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
     * PURCHASE_ID: {PK, ID, NotNull, BIGINT(19)}
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
     * PURCHASE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param purchaseId The value of purchaseId as greaterThan. (NullAllowed: if null, no condition)
     */
    def setPurchaseId_GreaterThan(purchaseId: Long): Unit = {
        regPurchaseId(CK_GT, purchaseId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * PURCHASE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param purchaseId The value of purchaseId as lessThan. (NullAllowed: if null, no condition)
     */
    def setPurchaseId_LessThan(purchaseId: Long): Unit = {
        regPurchaseId(CK_LT, purchaseId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * PURCHASE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param purchaseId The value of purchaseId as greaterEqual. (NullAllowed: if null, no condition)
     */
    def setPurchaseId_GreaterEqual(purchaseId: Long): Unit = {
        regPurchaseId(CK_GE, purchaseId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * PURCHASE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param purchaseId The value of purchaseId as lessEqual. (NullAllowed: if null, no condition)
     */
    def setPurchaseId_LessEqual(purchaseId: Long): Unit = {
        regPurchaseId(CK_LE, purchaseId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * PURCHASE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of purchaseId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of purchaseId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    def setPurchaseId_RangeOf(minNumber: Long, maxNumber: Long, rangeOfOption: RangeOfOption): Unit = {
        regROO(minNumber, maxNumber, getCValuePurchaseId(), "PURCHASE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * PURCHASE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param purchaseIdList The collection of purchaseId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    def setPurchaseId_InScope(purchaseIdList: Collection[Long]): Unit = {
        doSetPurchaseId_InScope(purchaseIdList);
    }

    protected def doSetPurchaseId_InScope(purchaseIdList: Collection[Long]): Unit = {
        regINS(CK_INS, cTL(purchaseIdList), getCValuePurchaseId(), "PURCHASE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * PURCHASE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param purchaseIdList The collection of purchaseId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    def setPurchaseId_NotInScope(purchaseIdList: Collection[Long]): Unit = {
        doSetPurchaseId_NotInScope(purchaseIdList);
    }

    protected def doSetPurchaseId_NotInScope(purchaseIdList: Collection[Long]): Unit = {
        regINS(CK_NINS, cTL(purchaseIdList), getCValuePurchaseId(), "PURCHASE_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * PURCHASE_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    def setPurchaseId_IsNull(): Unit = { regPurchaseId(CK_ISN, AbstractConditionQuery.DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * PURCHASE_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    def setPurchaseId_IsNotNull(): Unit = { regPurchaseId(CK_ISNN, AbstractConditionQuery.DOBJ); }

    protected def regPurchaseId(ky: ConditionKey, vl: Object): Unit = { regQ(ky, vl, getCValuePurchaseId(), "PURCHASE_ID"); }
    protected def getCValuePurchaseId(): ConditionValue;
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ID)MEMBER_ID: {UQ+, IX+, NotNull, INTEGER(10), FK to MEMBER}
     * @param memberId The value of memberId as equal. (NullAllowed: if null, no condition)
     */
     def setMemberId_Equal(memberId: Integer): Unit = {
        doSetMemberId_Equal(memberId);
    }

    protected def doSetMemberId_Equal(memberId: Integer): Unit = {
        regMemberId(CK_EQ, memberId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ID)MEMBER_ID: {UQ+, IX+, NotNull, INTEGER(10), FK to MEMBER}
     * @param memberId The value of memberId as notEqual. (NullAllowed: if null, no condition)
     */
     def setMemberId_NotEqual(memberId: Integer): Unit = {
        doSetMemberId_NotEqual(memberId);
    }

    protected def doSetMemberId_NotEqual(memberId: Integer): Unit = {
        regMemberId(CK_NES, memberId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ID)MEMBER_ID: {UQ+, IX+, NotNull, INTEGER(10), FK to MEMBER}
     * @param memberId The value of memberId as greaterThan. (NullAllowed: if null, no condition)
     */
    def setMemberId_GreaterThan(memberId: Integer): Unit = {
        regMemberId(CK_GT, memberId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ID)MEMBER_ID: {UQ+, IX+, NotNull, INTEGER(10), FK to MEMBER}
     * @param memberId The value of memberId as lessThan. (NullAllowed: if null, no condition)
     */
    def setMemberId_LessThan(memberId: Integer): Unit = {
        regMemberId(CK_LT, memberId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ID)MEMBER_ID: {UQ+, IX+, NotNull, INTEGER(10), FK to MEMBER}
     * @param memberId The value of memberId as greaterEqual. (NullAllowed: if null, no condition)
     */
    def setMemberId_GreaterEqual(memberId: Integer): Unit = {
        regMemberId(CK_GE, memberId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ID)MEMBER_ID: {UQ+, IX+, NotNull, INTEGER(10), FK to MEMBER}
     * @param memberId The value of memberId as lessEqual. (NullAllowed: if null, no condition)
     */
    def setMemberId_LessEqual(memberId: Integer): Unit = {
        regMemberId(CK_LE, memberId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ID)MEMBER_ID: {UQ+, IX+, NotNull, INTEGER(10), FK to MEMBER}
     * @param minNumber The min number of memberId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of memberId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    def setMemberId_RangeOf(minNumber: Integer, maxNumber: Integer, rangeOfOption: RangeOfOption): Unit = {
        regROO(minNumber, maxNumber, getCValueMemberId(), "MEMBER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (会員ID)MEMBER_ID: {UQ+, IX+, NotNull, INTEGER(10), FK to MEMBER}
     * @param memberIdList The collection of memberId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    def setMemberId_InScope(memberIdList: Collection[Integer]): Unit = {
        doSetMemberId_InScope(memberIdList);
    }

    protected def doSetMemberId_InScope(memberIdList: Collection[Integer]): Unit = {
        regINS(CK_INS, cTL(memberIdList), getCValueMemberId(), "MEMBER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (会員ID)MEMBER_ID: {UQ+, IX+, NotNull, INTEGER(10), FK to MEMBER}
     * @param memberIdList The collection of memberId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    def setMemberId_NotInScope(memberIdList: Collection[Integer]): Unit = {
        doSetMemberId_NotInScope(memberIdList);
    }

    protected def doSetMemberId_NotInScope(memberIdList: Collection[Integer]): Unit = {
        regINS(CK_NINS, cTL(memberIdList), getCValueMemberId(), "MEMBER_ID");
    }

    protected def regMemberId(ky: ConditionKey, vl: Object): Unit = { regQ(ky, vl, getCValueMemberId(), "MEMBER_ID"); }
    protected def getCValueMemberId(): ConditionValue;
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * (商品ID)PRODUCT_ID: {+UQ, IX+, NotNull, INTEGER(10), FK to PRODUCT}
     * @param productId The value of productId as equal. (NullAllowed: if null, no condition)
     */
     def setProductId_Equal(productId: Integer): Unit = {
        doSetProductId_Equal(productId);
    }

    protected def doSetProductId_Equal(productId: Integer): Unit = {
        regProductId(CK_EQ, productId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (商品ID)PRODUCT_ID: {+UQ, IX+, NotNull, INTEGER(10), FK to PRODUCT}
     * @param productId The value of productId as notEqual. (NullAllowed: if null, no condition)
     */
     def setProductId_NotEqual(productId: Integer): Unit = {
        doSetProductId_NotEqual(productId);
    }

    protected def doSetProductId_NotEqual(productId: Integer): Unit = {
        regProductId(CK_NES, productId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (商品ID)PRODUCT_ID: {+UQ, IX+, NotNull, INTEGER(10), FK to PRODUCT}
     * @param productId The value of productId as greaterThan. (NullAllowed: if null, no condition)
     */
    def setProductId_GreaterThan(productId: Integer): Unit = {
        regProductId(CK_GT, productId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (商品ID)PRODUCT_ID: {+UQ, IX+, NotNull, INTEGER(10), FK to PRODUCT}
     * @param productId The value of productId as lessThan. (NullAllowed: if null, no condition)
     */
    def setProductId_LessThan(productId: Integer): Unit = {
        regProductId(CK_LT, productId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (商品ID)PRODUCT_ID: {+UQ, IX+, NotNull, INTEGER(10), FK to PRODUCT}
     * @param productId The value of productId as greaterEqual. (NullAllowed: if null, no condition)
     */
    def setProductId_GreaterEqual(productId: Integer): Unit = {
        regProductId(CK_GE, productId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (商品ID)PRODUCT_ID: {+UQ, IX+, NotNull, INTEGER(10), FK to PRODUCT}
     * @param productId The value of productId as lessEqual. (NullAllowed: if null, no condition)
     */
    def setProductId_LessEqual(productId: Integer): Unit = {
        regProductId(CK_LE, productId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (商品ID)PRODUCT_ID: {+UQ, IX+, NotNull, INTEGER(10), FK to PRODUCT}
     * @param minNumber The min number of productId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of productId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    def setProductId_RangeOf(minNumber: Integer, maxNumber: Integer, rangeOfOption: RangeOfOption): Unit = {
        regROO(minNumber, maxNumber, getCValueProductId(), "PRODUCT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (商品ID)PRODUCT_ID: {+UQ, IX+, NotNull, INTEGER(10), FK to PRODUCT}
     * @param productIdList The collection of productId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    def setProductId_InScope(productIdList: Collection[Integer]): Unit = {
        doSetProductId_InScope(productIdList);
    }

    protected def doSetProductId_InScope(productIdList: Collection[Integer]): Unit = {
        regINS(CK_INS, cTL(productIdList), getCValueProductId(), "PRODUCT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (商品ID)PRODUCT_ID: {+UQ, IX+, NotNull, INTEGER(10), FK to PRODUCT}
     * @param productIdList The collection of productId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    def setProductId_NotInScope(productIdList: Collection[Integer]): Unit = {
        doSetProductId_NotInScope(productIdList);
    }

    protected def doSetProductId_NotInScope(productIdList: Collection[Integer]): Unit = {
        regINS(CK_NINS, cTL(productIdList), getCValueProductId(), "PRODUCT_ID");
    }

    protected def regProductId(ky: ConditionKey, vl: Object): Unit = { regQ(ky, vl, getCValueProductId(), "PRODUCT_ID"); }
    protected def getCValueProductId(): ConditionValue;

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * (購入日時)PURCHASE_DATETIME: {+UQ, IX+, NotNull, TIMESTAMP(23, 10)}
     * @param purchaseDatetime The value of purchaseDatetime as equal. (NullAllowed: if null, no condition)
     */
    def setPurchaseDatetime_Equal(purchaseDatetime: java.sql.Timestamp): Unit = {
        regPurchaseDatetime(CK_EQ,  purchaseDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (購入日時)PURCHASE_DATETIME: {+UQ, IX+, NotNull, TIMESTAMP(23, 10)}
     * @param purchaseDatetime The value of purchaseDatetime as greaterThan. (NullAllowed: if null, no condition)
     */
    def setPurchaseDatetime_GreaterThan(purchaseDatetime: java.sql.Timestamp): Unit = {
        regPurchaseDatetime(CK_GT,  purchaseDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (購入日時)PURCHASE_DATETIME: {+UQ, IX+, NotNull, TIMESTAMP(23, 10)}
     * @param purchaseDatetime The value of purchaseDatetime as lessThan. (NullAllowed: if null, no condition)
     */
    def setPurchaseDatetime_LessThan(purchaseDatetime: java.sql.Timestamp): Unit = {
        regPurchaseDatetime(CK_LT,  purchaseDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (購入日時)PURCHASE_DATETIME: {+UQ, IX+, NotNull, TIMESTAMP(23, 10)}
     * @param purchaseDatetime The value of purchaseDatetime as greaterEqual. (NullAllowed: if null, no condition)
     */
    def setPurchaseDatetime_GreaterEqual(purchaseDatetime: java.sql.Timestamp): Unit = {
        regPurchaseDatetime(CK_GE,  purchaseDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (購入日時)PURCHASE_DATETIME: {+UQ, IX+, NotNull, TIMESTAMP(23, 10)}
     * @param purchaseDatetime The value of purchaseDatetime as lessEqual. (NullAllowed: if null, no condition)
     */
    def setPurchaseDatetime_LessEqual(purchaseDatetime: java.sql.Timestamp): Unit = {
        regPurchaseDatetime(CK_LE, purchaseDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (購入日時)PURCHASE_DATETIME: {+UQ, IX+, NotNull, TIMESTAMP(23, 10)}
     * <pre>e.g. setPurchaseDatetime_FromTo(fromDate, toDate, new <span style="color: #DD4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of purchaseDatetime. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of purchaseDatetime. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    def setPurchaseDatetime_FromTo(fromDatetime: Date, toDatetime: Date, fromToOption: FromToOption): Unit = {
        regFTQ(if (fromDatetime != null) { new java.sql.Timestamp(fromDatetime.getTime()) } else { null }, if (toDatetime != null) { new java.sql.Timestamp(toDatetime.getTime()) } else { null }, getCValuePurchaseDatetime(), "PURCHASE_DATETIME", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (購入日時)PURCHASE_DATETIME: {+UQ, IX+, NotNull, TIMESTAMP(23, 10)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #DD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of purchaseDatetime. (NullAllowed: if null, no from-condition)
     * @param toDate The to-date(yyyy/MM/dd) of purchaseDatetime. (NullAllowed: if null, no to-condition)
     */
    def setPurchaseDatetime_DateFromTo(fromDate: Date, toDate: Date): Unit = {
        setPurchaseDatetime_FromTo(fromDate, toDate, new FromToOption().compareAsDate());
    }

    protected def regPurchaseDatetime(ky: ConditionKey, vl: Object): Unit = { regQ(ky, vl, getCValuePurchaseDatetime(), "PURCHASE_DATETIME"); }
    protected def getCValuePurchaseDatetime(): ConditionValue;
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * (購入数量)PURCHASE_COUNT: {NotNull, INTEGER(10)}
     * @param purchaseCount The value of purchaseCount as equal. (NullAllowed: if null, no condition)
     */
     def setPurchaseCount_Equal(purchaseCount: Integer): Unit = {
        doSetPurchaseCount_Equal(purchaseCount);
    }

    protected def doSetPurchaseCount_Equal(purchaseCount: Integer): Unit = {
        regPurchaseCount(CK_EQ, purchaseCount);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (購入数量)PURCHASE_COUNT: {NotNull, INTEGER(10)}
     * @param purchaseCount The value of purchaseCount as notEqual. (NullAllowed: if null, no condition)
     */
     def setPurchaseCount_NotEqual(purchaseCount: Integer): Unit = {
        doSetPurchaseCount_NotEqual(purchaseCount);
    }

    protected def doSetPurchaseCount_NotEqual(purchaseCount: Integer): Unit = {
        regPurchaseCount(CK_NES, purchaseCount);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (購入数量)PURCHASE_COUNT: {NotNull, INTEGER(10)}
     * @param purchaseCount The value of purchaseCount as greaterThan. (NullAllowed: if null, no condition)
     */
    def setPurchaseCount_GreaterThan(purchaseCount: Integer): Unit = {
        regPurchaseCount(CK_GT, purchaseCount);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (購入数量)PURCHASE_COUNT: {NotNull, INTEGER(10)}
     * @param purchaseCount The value of purchaseCount as lessThan. (NullAllowed: if null, no condition)
     */
    def setPurchaseCount_LessThan(purchaseCount: Integer): Unit = {
        regPurchaseCount(CK_LT, purchaseCount);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (購入数量)PURCHASE_COUNT: {NotNull, INTEGER(10)}
     * @param purchaseCount The value of purchaseCount as greaterEqual. (NullAllowed: if null, no condition)
     */
    def setPurchaseCount_GreaterEqual(purchaseCount: Integer): Unit = {
        regPurchaseCount(CK_GE, purchaseCount);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (購入数量)PURCHASE_COUNT: {NotNull, INTEGER(10)}
     * @param purchaseCount The value of purchaseCount as lessEqual. (NullAllowed: if null, no condition)
     */
    def setPurchaseCount_LessEqual(purchaseCount: Integer): Unit = {
        regPurchaseCount(CK_LE, purchaseCount);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (購入数量)PURCHASE_COUNT: {NotNull, INTEGER(10)}
     * @param minNumber The min number of purchaseCount. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of purchaseCount. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    def setPurchaseCount_RangeOf(minNumber: Integer, maxNumber: Integer, rangeOfOption: RangeOfOption): Unit = {
        regROO(minNumber, maxNumber, getCValuePurchaseCount(), "PURCHASE_COUNT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (購入数量)PURCHASE_COUNT: {NotNull, INTEGER(10)}
     * @param purchaseCountList The collection of purchaseCount as inScope. (NullAllowed: if null (or empty), no condition)
     */
    def setPurchaseCount_InScope(purchaseCountList: Collection[Integer]): Unit = {
        doSetPurchaseCount_InScope(purchaseCountList);
    }

    protected def doSetPurchaseCount_InScope(purchaseCountList: Collection[Integer]): Unit = {
        regINS(CK_INS, cTL(purchaseCountList), getCValuePurchaseCount(), "PURCHASE_COUNT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (購入数量)PURCHASE_COUNT: {NotNull, INTEGER(10)}
     * @param purchaseCountList The collection of purchaseCount as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    def setPurchaseCount_NotInScope(purchaseCountList: Collection[Integer]): Unit = {
        doSetPurchaseCount_NotInScope(purchaseCountList);
    }

    protected def doSetPurchaseCount_NotInScope(purchaseCountList: Collection[Integer]): Unit = {
        regINS(CK_NINS, cTL(purchaseCountList), getCValuePurchaseCount(), "PURCHASE_COUNT");
    }

    protected def regPurchaseCount(ky: ConditionKey, vl: Object): Unit = { regQ(ky, vl, getCValuePurchaseCount(), "PURCHASE_COUNT"); }
    protected def getCValuePurchaseCount(): ConditionValue;
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * (購入価格)PURCHASE_PRICE: {IX, NotNull, INTEGER(10)}
     * @param purchasePrice The value of purchasePrice as equal. (NullAllowed: if null, no condition)
     */
     def setPurchasePrice_Equal(purchasePrice: Integer): Unit = {
        doSetPurchasePrice_Equal(purchasePrice);
    }

    protected def doSetPurchasePrice_Equal(purchasePrice: Integer): Unit = {
        regPurchasePrice(CK_EQ, purchasePrice);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (購入価格)PURCHASE_PRICE: {IX, NotNull, INTEGER(10)}
     * @param purchasePrice The value of purchasePrice as notEqual. (NullAllowed: if null, no condition)
     */
     def setPurchasePrice_NotEqual(purchasePrice: Integer): Unit = {
        doSetPurchasePrice_NotEqual(purchasePrice);
    }

    protected def doSetPurchasePrice_NotEqual(purchasePrice: Integer): Unit = {
        regPurchasePrice(CK_NES, purchasePrice);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (購入価格)PURCHASE_PRICE: {IX, NotNull, INTEGER(10)}
     * @param purchasePrice The value of purchasePrice as greaterThan. (NullAllowed: if null, no condition)
     */
    def setPurchasePrice_GreaterThan(purchasePrice: Integer): Unit = {
        regPurchasePrice(CK_GT, purchasePrice);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (購入価格)PURCHASE_PRICE: {IX, NotNull, INTEGER(10)}
     * @param purchasePrice The value of purchasePrice as lessThan. (NullAllowed: if null, no condition)
     */
    def setPurchasePrice_LessThan(purchasePrice: Integer): Unit = {
        regPurchasePrice(CK_LT, purchasePrice);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (購入価格)PURCHASE_PRICE: {IX, NotNull, INTEGER(10)}
     * @param purchasePrice The value of purchasePrice as greaterEqual. (NullAllowed: if null, no condition)
     */
    def setPurchasePrice_GreaterEqual(purchasePrice: Integer): Unit = {
        regPurchasePrice(CK_GE, purchasePrice);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (購入価格)PURCHASE_PRICE: {IX, NotNull, INTEGER(10)}
     * @param purchasePrice The value of purchasePrice as lessEqual. (NullAllowed: if null, no condition)
     */
    def setPurchasePrice_LessEqual(purchasePrice: Integer): Unit = {
        regPurchasePrice(CK_LE, purchasePrice);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (購入価格)PURCHASE_PRICE: {IX, NotNull, INTEGER(10)}
     * @param minNumber The min number of purchasePrice. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of purchasePrice. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    def setPurchasePrice_RangeOf(minNumber: Integer, maxNumber: Integer, rangeOfOption: RangeOfOption): Unit = {
        regROO(minNumber, maxNumber, getCValuePurchasePrice(), "PURCHASE_PRICE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (購入価格)PURCHASE_PRICE: {IX, NotNull, INTEGER(10)}
     * @param purchasePriceList The collection of purchasePrice as inScope. (NullAllowed: if null (or empty), no condition)
     */
    def setPurchasePrice_InScope(purchasePriceList: Collection[Integer]): Unit = {
        doSetPurchasePrice_InScope(purchasePriceList);
    }

    protected def doSetPurchasePrice_InScope(purchasePriceList: Collection[Integer]): Unit = {
        regINS(CK_INS, cTL(purchasePriceList), getCValuePurchasePrice(), "PURCHASE_PRICE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (購入価格)PURCHASE_PRICE: {IX, NotNull, INTEGER(10)}
     * @param purchasePriceList The collection of purchasePrice as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    def setPurchasePrice_NotInScope(purchasePriceList: Collection[Integer]): Unit = {
        doSetPurchasePrice_NotInScope(purchasePriceList);
    }

    protected def doSetPurchasePrice_NotInScope(purchasePriceList: Collection[Integer]): Unit = {
        regINS(CK_NINS, cTL(purchasePriceList), getCValuePurchasePrice(), "PURCHASE_PRICE");
    }

    protected def regPurchasePrice(ky: ConditionKey, vl: Object): Unit = { regQ(ky, vl, getCValuePurchasePrice(), "PURCHASE_PRICE"); }
    protected def getCValuePurchasePrice(): ConditionValue;
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * (支払完了フラグ)PAYMENT_COMPLETE_FLG: {NotNull, INTEGER(10), classification=Flg}
     * @param paymentCompleteFlg The value of paymentCompleteFlg as equal. (NullAllowed: if null, no condition)
     */
     def setPaymentCompleteFlg_Equal(paymentCompleteFlg: Integer): Unit = {
        doSetPaymentCompleteFlg_Equal(paymentCompleteFlg);
    }

    /**
     * Equal(=). As Flg. And NullIgnored, OnlyOnceRegistered. <br />
     * (支払完了フラグ)PAYMENT_COMPLETE_FLG: {NotNull, INTEGER(10), classification=Flg} <br />
     * general boolean classification for every flg-column
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, no condition)
     */
    def setPaymentCompleteFlg_Equal_AsFlg(cdef: CDef.Flg): Unit = {
        doSetPaymentCompleteFlg_Equal(cTNum(if (cdef != null) { cdef.code } else { null }, classOf[Integer]));
    }

    /**
     * Equal(=). As True (1). And NullIgnored, OnlyOnceRegistered. <br />
     * Yes: means valid
     */
    def setPaymentCompleteFlg_Equal_True(): Unit = {
        setPaymentCompleteFlg_Equal_AsFlg(CDef.Flg.True);
    }

    /**
     * Equal(=). As False (0). And NullIgnored, OnlyOnceRegistered. <br />
     * No: means invalid
     */
    def setPaymentCompleteFlg_Equal_False(): Unit = {
        setPaymentCompleteFlg_Equal_AsFlg(CDef.Flg.False);
    }

    protected def doSetPaymentCompleteFlg_Equal(paymentCompleteFlg: Integer): Unit = {
        regPaymentCompleteFlg(CK_EQ, paymentCompleteFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (支払完了フラグ)PAYMENT_COMPLETE_FLG: {NotNull, INTEGER(10), classification=Flg}
     * @param paymentCompleteFlg The value of paymentCompleteFlg as notEqual. (NullAllowed: if null, no condition)
     */
     def setPaymentCompleteFlg_NotEqual(paymentCompleteFlg: Integer): Unit = {
        doSetPaymentCompleteFlg_NotEqual(paymentCompleteFlg);
    }

    /**
     * NotEqual(&lt;&gt;). As Flg. And NullIgnored, OnlyOnceRegistered. <br />
     * (支払完了フラグ)PAYMENT_COMPLETE_FLG: {NotNull, INTEGER(10), classification=Flg} <br />
     * general boolean classification for every flg-column
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, no condition)
     */
    def setPaymentCompleteFlg_NotEqual_AsFlg(cdef: CDef.Flg): Unit = {
        doSetPaymentCompleteFlg_NotEqual(cTNum(if (cdef != null) { cdef.code } else { null }, classOf[Integer]));
    }

    /**
     * NotEqual(&lt;&gt;). As True (1). And NullIgnored, OnlyOnceRegistered. <br />
     * Yes: means valid
     */
    def setPaymentCompleteFlg_NotEqual_True(): Unit = {
        setPaymentCompleteFlg_NotEqual_AsFlg(CDef.Flg.True);
    }

    /**
     * NotEqual(&lt;&gt;). As False (0). And NullIgnored, OnlyOnceRegistered. <br />
     * No: means invalid
     */
    def setPaymentCompleteFlg_NotEqual_False(): Unit = {
        setPaymentCompleteFlg_NotEqual_AsFlg(CDef.Flg.False);
    }

    protected def doSetPaymentCompleteFlg_NotEqual(paymentCompleteFlg: Integer): Unit = {
        regPaymentCompleteFlg(CK_NES, paymentCompleteFlg);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (支払完了フラグ)PAYMENT_COMPLETE_FLG: {NotNull, INTEGER(10), classification=Flg}
     * @param paymentCompleteFlgList The collection of paymentCompleteFlg as inScope. (NullAllowed: if null (or empty), no condition)
     */
    def setPaymentCompleteFlg_InScope(paymentCompleteFlgList: Collection[Integer]): Unit = {
        doSetPaymentCompleteFlg_InScope(paymentCompleteFlgList);
    }

    /**
     * InScope {in (1, 2)}. As Flg. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (支払完了フラグ)PAYMENT_COMPLETE_FLG: {NotNull, INTEGER(10), classification=Flg} <br />
     * general boolean classification for every flg-column
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    def setPaymentCompleteFlg_InScope_AsFlg(cdefList: Collection[CDef.Flg]): Unit = {
        doSetPaymentCompleteFlg_InScope(cTNumL(cdefList, classOf[Integer]));
    }

    protected def doSetPaymentCompleteFlg_InScope(paymentCompleteFlgList: Collection[Integer]): Unit = {
        regINS(CK_INS, cTL(paymentCompleteFlgList), getCValuePaymentCompleteFlg(), "PAYMENT_COMPLETE_FLG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (支払完了フラグ)PAYMENT_COMPLETE_FLG: {NotNull, INTEGER(10), classification=Flg}
     * @param paymentCompleteFlgList The collection of paymentCompleteFlg as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    def setPaymentCompleteFlg_NotInScope(paymentCompleteFlgList: Collection[Integer]): Unit = {
        doSetPaymentCompleteFlg_NotInScope(paymentCompleteFlgList);
    }

    /**
     * NotInScope {not in (1, 2)}. As Flg. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (支払完了フラグ)PAYMENT_COMPLETE_FLG: {NotNull, INTEGER(10), classification=Flg} <br />
     * general boolean classification for every flg-column
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    def setPaymentCompleteFlg_NotInScope_AsFlg(cdefList: Collection[CDef.Flg]): Unit = {
        doSetPaymentCompleteFlg_NotInScope(cTNumL(cdefList, classOf[Integer]));
    }

    protected def doSetPaymentCompleteFlg_NotInScope(paymentCompleteFlgList: Collection[Integer]): Unit = {
        regINS(CK_NINS, cTL(paymentCompleteFlgList), getCValuePaymentCompleteFlg(), "PAYMENT_COMPLETE_FLG");
    }

    protected def regPaymentCompleteFlg(ky: ConditionKey, vl: Object): Unit = { regQ(ky, vl, getCValuePaymentCompleteFlg(), "PAYMENT_COMPLETE_FLG"); }
    protected def getCValuePaymentCompleteFlg(): ConditionValue;

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * REGISTER_DATETIME: {NotNull, TIMESTAMP(23, 10)}
     * @param registerDatetime The value of registerDatetime as equal. (NullAllowed: if null, no condition)
     */
    def setRegisterDatetime_Equal(registerDatetime: java.sql.Timestamp): Unit = {
        regRegisterDatetime(CK_EQ,  registerDatetime);
    }

    protected def regRegisterDatetime(ky: ConditionKey, vl: Object): Unit = { regQ(ky, vl, getCValueRegisterDatetime(), "REGISTER_DATETIME"); }
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

    protected def regRegisterUser(ky: ConditionKey, vl: Object): Unit = { regQ(ky, vl, getCValueRegisterUser(), "REGISTER_USER"); }
    protected def getCValueRegisterUser(): ConditionValue;

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * UPDATE_DATETIME: {NotNull, TIMESTAMP(23, 10)}
     * @param updateDatetime The value of updateDatetime as equal. (NullAllowed: if null, no condition)
     */
    def setUpdateDatetime_Equal(updateDatetime: java.sql.Timestamp): Unit = {
        regUpdateDatetime(CK_EQ,  updateDatetime);
    }

    protected def regUpdateDatetime(ky: ConditionKey, vl: Object): Unit = { regQ(ky, vl, getCValueUpdateDatetime(), "UPDATE_DATETIME"); }
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

    protected def regUpdateUser(ky: ConditionKey, vl: Object): Unit = { regQ(ky, vl, getCValueUpdateUser(), "UPDATE_USER"); }
    protected def getCValueUpdateUser(): ConditionValue;
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * VERSION_NO: {NotNull, BIGINT(19)}
     * @param versionNo The value of versionNo as equal. (NullAllowed: if null, no condition)
     */
     def setVersionNo_Equal(versionNo: Long): Unit = {
        doSetVersionNo_Equal(versionNo);
    }

    protected def doSetVersionNo_Equal(versionNo: Long): Unit = {
        regVersionNo(CK_EQ, versionNo);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * VERSION_NO: {NotNull, BIGINT(19)}
     * @param minNumber The min number of versionNo. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of versionNo. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    def setVersionNo_RangeOf(minNumber: Long, maxNumber: Long, rangeOfOption: RangeOfOption): Unit = {
        regROO(minNumber, maxNumber, getCValueVersionNo(), "VERSION_NO", rangeOfOption);
    }

    protected def regVersionNo(ky: ConditionKey, vl: Object): Unit = { regQ(ky, vl, getCValueVersionNo(), "VERSION_NO"); }
    protected def getCValueVersionNo(): ConditionValue;

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_Equal(): HpSSQFunction[PurchaseCB] = {
        return xcreateSSQFunction(CK_EQ.getOperand(), classOf[PurchaseCB]);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_NotEqual(): HpSSQFunction[PurchaseCB] = {
        return xcreateSSQFunction(CK_NES.getOperand(), classOf[PurchaseCB]);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_GreaterThan(): HpSSQFunction[PurchaseCB] = {
        return xcreateSSQFunction(CK_GT.getOperand(), classOf[PurchaseCB]);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_LessThan(): HpSSQFunction[PurchaseCB] = {
        return xcreateSSQFunction(CK_LT.getOperand(), classOf[PurchaseCB]);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_GreaterEqual(): HpSSQFunction[PurchaseCB] = {
        return xcreateSSQFunction(CK_GE.getOperand(), classOf[PurchaseCB]);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_LessEqual(): HpSSQFunction[PurchaseCB] = {
        return xcreateSSQFunction(CK_LE.getOperand(), classOf[PurchaseCB]);
    }

    override protected def xscalarCondition[CB <: ConditionBean](fn: String, sq: SubQuery[CB], rd: String, op: HpSSQOption[CB]): Unit = {
        assertObjectNotNull("subQuery", sq);
        val cb: PurchaseCB = xcreateScalarConditionCB(); sq.query(cb.asInstanceOf[CB]);
        val pp: String = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean(xcreateScalarConditionPartitionByCB().asInstanceOf[CB]); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    def keepScalarCondition(sq: PurchaseCQ): String;

    protected def xcreateScalarConditionCB(): PurchaseCB = {
        val cb: PurchaseCB = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected def xcreateScalarConditionPartitionByCB(): PurchaseCB = {
        val cb: PurchaseCB = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    def xsmyselfDerive(fn: String, sq: SubQuery[PurchaseCB], al: String, op: DerivedReferrerOption): Unit = {
        assertObjectNotNull("subQuery", sq);
        val cb: PurchaseCB = new PurchaseCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        val pp: String = keepSpecifyMyselfDerived(cb.query());
        val pk: String = "PURCHASE_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    def keepSpecifyMyselfDerived(sq: PurchaseCQ): String;

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    def myselfDerived(): HpQDRFunction[PurchaseCB] = {
        return xcreateQDRFunctionMyselfDerived(classOf[PurchaseCB]);
    }
    override protected def xqderiveMyselfDerived[CB <: ConditionBean](fn: String, sq: SubQuery[CB], rd: String, vl: Object, op: DerivedReferrerOption): Unit = {
        assertObjectNotNull("subQuery", sq);
        val cb: PurchaseCB = new PurchaseCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb.asInstanceOf[CB]);
        val pk: String = "PURCHASE_ID";
        val sqpp: String = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        val prpp: String = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    def keepQueryMyselfDerived(sq: PurchaseCQ): String;
    def keepQueryMyselfDerivedParameter(vl: Object): String;

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    def myselfExists(subQuery: (PurchaseCB) => Unit): Unit = {
        assertObjectNotNull("subQuery", subQuery);
        val cb: PurchaseCB = new PurchaseCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery(cb); } finally { unlock(); }
        val pp: String = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    def keepMyselfExists(sq: PurchaseCQ): String;

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    def myselfInScope(subQuery: (PurchaseCB) => Unit): Unit = {
        assertObjectNotNull("subQuery", subQuery);
        val cb: PurchaseCB = new PurchaseCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery(cb); } finally { unlock(); }
        val pp: String = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    def keepMyselfInScope(sq: PurchaseCQ): String;

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected def newMyCB(): PurchaseCB = {
        return new PurchaseCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected def xabCQ(): String = { return classOf[PurchaseCQ].getName(); }
    protected def xabLSO(): String = { return classOf[LikeSearchOption].getName(); }
    protected def xabSSQS(): String = { return classOf[HpSSQSetupper[_]].getName(); }
}
