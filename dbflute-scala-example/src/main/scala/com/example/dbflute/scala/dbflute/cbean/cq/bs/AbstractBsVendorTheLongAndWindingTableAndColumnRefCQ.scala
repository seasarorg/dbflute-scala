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
 * The abstract condition-query of VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF.
 * @author DBFlute(AutoGenerator)
 */
abstract class AbstractBsVendorTheLongAndWindingTableAndColumnRefCQ(referrerQuery: ConditionQuery, sqlClause: SqlClause, aliasName: String, nestLevel: Integer)
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
        return "VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_ID: {PK, NotNull, BIGINT(19)}
     * @param theLongAndWindingTableAndColumnRefId The value of theLongAndWindingTableAndColumnRefId as equal. (NullAllowed: if null, no condition)
     */
    def setTheLongAndWindingTableAndColumnRefId_Equal(theLongAndWindingTableAndColumnRefId: Long): Unit = {
        doSetTheLongAndWindingTableAndColumnRefId_Equal(theLongAndWindingTableAndColumnRefId);
    }

    protected def doSetTheLongAndWindingTableAndColumnRefId_Equal(theLongAndWindingTableAndColumnRefId: Long): Unit = {
        regTheLongAndWindingTableAndColumnRefId(CK_EQ, theLongAndWindingTableAndColumnRefId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_ID: {PK, NotNull, BIGINT(19)}
     * @param theLongAndWindingTableAndColumnRefId The value of theLongAndWindingTableAndColumnRefId as notEqual. (NullAllowed: if null, no condition)
     */
    def setTheLongAndWindingTableAndColumnRefId_NotEqual(theLongAndWindingTableAndColumnRefId: Long): Unit = {
        doSetTheLongAndWindingTableAndColumnRefId_NotEqual(theLongAndWindingTableAndColumnRefId);
    }

    protected def doSetTheLongAndWindingTableAndColumnRefId_NotEqual(theLongAndWindingTableAndColumnRefId: Long): Unit = {
        regTheLongAndWindingTableAndColumnRefId(CK_NES, theLongAndWindingTableAndColumnRefId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_ID: {PK, NotNull, BIGINT(19)}
     * @param theLongAndWindingTableAndColumnRefId The value of theLongAndWindingTableAndColumnRefId as greaterThan. (NullAllowed: if null, no condition)
     */
    def setTheLongAndWindingTableAndColumnRefId_GreaterThan(theLongAndWindingTableAndColumnRefId: Long): Unit = {
        regTheLongAndWindingTableAndColumnRefId(CK_GT, theLongAndWindingTableAndColumnRefId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_ID: {PK, NotNull, BIGINT(19)}
     * @param theLongAndWindingTableAndColumnRefId The value of theLongAndWindingTableAndColumnRefId as lessThan. (NullAllowed: if null, no condition)
     */
    def setTheLongAndWindingTableAndColumnRefId_LessThan(theLongAndWindingTableAndColumnRefId: Long): Unit = {
        regTheLongAndWindingTableAndColumnRefId(CK_LT, theLongAndWindingTableAndColumnRefId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_ID: {PK, NotNull, BIGINT(19)}
     * @param theLongAndWindingTableAndColumnRefId The value of theLongAndWindingTableAndColumnRefId as greaterEqual. (NullAllowed: if null, no condition)
     */
    def setTheLongAndWindingTableAndColumnRefId_GreaterEqual(theLongAndWindingTableAndColumnRefId: Long): Unit = {
        regTheLongAndWindingTableAndColumnRefId(CK_GE, theLongAndWindingTableAndColumnRefId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_ID: {PK, NotNull, BIGINT(19)}
     * @param theLongAndWindingTableAndColumnRefId The value of theLongAndWindingTableAndColumnRefId as lessEqual. (NullAllowed: if null, no condition)
     */
    def setTheLongAndWindingTableAndColumnRefId_LessEqual(theLongAndWindingTableAndColumnRefId: Long): Unit = {
        regTheLongAndWindingTableAndColumnRefId(CK_LE, theLongAndWindingTableAndColumnRefId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_ID: {PK, NotNull, BIGINT(19)}
     * @param minNumber The min number of theLongAndWindingTableAndColumnRefId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of theLongAndWindingTableAndColumnRefId. (NullAllowed: if null, no to-condition)
     * @param optionCall The callback for option of range-of. (NotNull)
     */
    def setTheLongAndWindingTableAndColumnRefId_RangeOf(minNumber: Long, maxNumber: Long)(optionCall: (RangeOfOption) => Unit): Unit = {
        regROO(minNumber, maxNumber, getCValueTheLongAndWindingTableAndColumnRefId(), "THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_ID", callbackROOP(optionCall));
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_ID: {PK, NotNull, BIGINT(19)}
     * @param theLongAndWindingTableAndColumnRefIdList The collection of theLongAndWindingTableAndColumnRefId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    def setTheLongAndWindingTableAndColumnRefId_InScope(theLongAndWindingTableAndColumnRefIdList: List[Long]): Unit = {
        doSetTheLongAndWindingTableAndColumnRefId_InScope(toMutableValueCollectionImplicitly(theLongAndWindingTableAndColumnRefIdList));
    }

    protected def doSetTheLongAndWindingTableAndColumnRefId_InScope(theLongAndWindingTableAndColumnRefIdList: Collection[Long]): Unit = {
        regINS(CK_INS, cTL(theLongAndWindingTableAndColumnRefIdList), getCValueTheLongAndWindingTableAndColumnRefId(), "THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_ID: {PK, NotNull, BIGINT(19)}
     * @param theLongAndWindingTableAndColumnRefIdList The collection of theLongAndWindingTableAndColumnRefId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    def setTheLongAndWindingTableAndColumnRefId_NotInScope(theLongAndWindingTableAndColumnRefIdList: List[Long]): Unit = {
        doSetTheLongAndWindingTableAndColumnRefId_NotInScope(if (theLongAndWindingTableAndColumnRefIdList != null) { theLongAndWindingTableAndColumnRefIdList.map(_.asInstanceOf[Long]).asJava } else { null });
    }

    protected def doSetTheLongAndWindingTableAndColumnRefId_NotInScope(theLongAndWindingTableAndColumnRefIdList: Collection[Long]): Unit = {
        regINS(CK_NINS, cTL(theLongAndWindingTableAndColumnRefIdList), getCValueTheLongAndWindingTableAndColumnRefId(), "THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_ID: {PK, NotNull, BIGINT(19)}
     */
    def setTheLongAndWindingTableAndColumnRefId_IsNull(): Unit = { regTheLongAndWindingTableAndColumnRefId(CK_ISN, AbstractConditionQuery.DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_ID: {PK, NotNull, BIGINT(19)}
     */
    def setTheLongAndWindingTableAndColumnRefId_IsNotNull(): Unit = { regTheLongAndWindingTableAndColumnRefId(CK_ISNN, AbstractConditionQuery.DOBJ); }

    protected def regTheLongAndWindingTableAndColumnRefId(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValueTheLongAndWindingTableAndColumnRefId(), "THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_ID"); }
    protected def getCValueTheLongAndWindingTableAndColumnRefId(): ConditionValue;

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID: {IX, NotNull, BIGINT(19), FK to VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN}
     * @param theLongAndWindingTableAndColumnId The value of theLongAndWindingTableAndColumnId as equal. (NullAllowed: if null, no condition)
     */
    def setTheLongAndWindingTableAndColumnId_Equal(theLongAndWindingTableAndColumnId: Long): Unit = {
        doSetTheLongAndWindingTableAndColumnId_Equal(theLongAndWindingTableAndColumnId);
    }

    protected def doSetTheLongAndWindingTableAndColumnId_Equal(theLongAndWindingTableAndColumnId: Long): Unit = {
        regTheLongAndWindingTableAndColumnId(CK_EQ, theLongAndWindingTableAndColumnId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID: {IX, NotNull, BIGINT(19), FK to VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN}
     * @param theLongAndWindingTableAndColumnId The value of theLongAndWindingTableAndColumnId as notEqual. (NullAllowed: if null, no condition)
     */
    def setTheLongAndWindingTableAndColumnId_NotEqual(theLongAndWindingTableAndColumnId: Long): Unit = {
        doSetTheLongAndWindingTableAndColumnId_NotEqual(theLongAndWindingTableAndColumnId);
    }

    protected def doSetTheLongAndWindingTableAndColumnId_NotEqual(theLongAndWindingTableAndColumnId: Long): Unit = {
        regTheLongAndWindingTableAndColumnId(CK_NES, theLongAndWindingTableAndColumnId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID: {IX, NotNull, BIGINT(19), FK to VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN}
     * @param theLongAndWindingTableAndColumnId The value of theLongAndWindingTableAndColumnId as greaterThan. (NullAllowed: if null, no condition)
     */
    def setTheLongAndWindingTableAndColumnId_GreaterThan(theLongAndWindingTableAndColumnId: Long): Unit = {
        regTheLongAndWindingTableAndColumnId(CK_GT, theLongAndWindingTableAndColumnId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID: {IX, NotNull, BIGINT(19), FK to VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN}
     * @param theLongAndWindingTableAndColumnId The value of theLongAndWindingTableAndColumnId as lessThan. (NullAllowed: if null, no condition)
     */
    def setTheLongAndWindingTableAndColumnId_LessThan(theLongAndWindingTableAndColumnId: Long): Unit = {
        regTheLongAndWindingTableAndColumnId(CK_LT, theLongAndWindingTableAndColumnId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID: {IX, NotNull, BIGINT(19), FK to VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN}
     * @param theLongAndWindingTableAndColumnId The value of theLongAndWindingTableAndColumnId as greaterEqual. (NullAllowed: if null, no condition)
     */
    def setTheLongAndWindingTableAndColumnId_GreaterEqual(theLongAndWindingTableAndColumnId: Long): Unit = {
        regTheLongAndWindingTableAndColumnId(CK_GE, theLongAndWindingTableAndColumnId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID: {IX, NotNull, BIGINT(19), FK to VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN}
     * @param theLongAndWindingTableAndColumnId The value of theLongAndWindingTableAndColumnId as lessEqual. (NullAllowed: if null, no condition)
     */
    def setTheLongAndWindingTableAndColumnId_LessEqual(theLongAndWindingTableAndColumnId: Long): Unit = {
        regTheLongAndWindingTableAndColumnId(CK_LE, theLongAndWindingTableAndColumnId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID: {IX, NotNull, BIGINT(19), FK to VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN}
     * @param minNumber The min number of theLongAndWindingTableAndColumnId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of theLongAndWindingTableAndColumnId. (NullAllowed: if null, no to-condition)
     * @param optionCall The callback for option of range-of. (NotNull)
     */
    def setTheLongAndWindingTableAndColumnId_RangeOf(minNumber: Long, maxNumber: Long)(optionCall: (RangeOfOption) => Unit): Unit = {
        regROO(minNumber, maxNumber, getCValueTheLongAndWindingTableAndColumnId(), "THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID", callbackROOP(optionCall));
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID: {IX, NotNull, BIGINT(19), FK to VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN}
     * @param theLongAndWindingTableAndColumnIdList The collection of theLongAndWindingTableAndColumnId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    def setTheLongAndWindingTableAndColumnId_InScope(theLongAndWindingTableAndColumnIdList: List[Long]): Unit = {
        doSetTheLongAndWindingTableAndColumnId_InScope(toMutableValueCollectionImplicitly(theLongAndWindingTableAndColumnIdList));
    }

    protected def doSetTheLongAndWindingTableAndColumnId_InScope(theLongAndWindingTableAndColumnIdList: Collection[Long]): Unit = {
        regINS(CK_INS, cTL(theLongAndWindingTableAndColumnIdList), getCValueTheLongAndWindingTableAndColumnId(), "THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID: {IX, NotNull, BIGINT(19), FK to VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN}
     * @param theLongAndWindingTableAndColumnIdList The collection of theLongAndWindingTableAndColumnId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    def setTheLongAndWindingTableAndColumnId_NotInScope(theLongAndWindingTableAndColumnIdList: List[Long]): Unit = {
        doSetTheLongAndWindingTableAndColumnId_NotInScope(if (theLongAndWindingTableAndColumnIdList != null) { theLongAndWindingTableAndColumnIdList.map(_.asInstanceOf[Long]).asJava } else { null });
    }

    protected def doSetTheLongAndWindingTableAndColumnId_NotInScope(theLongAndWindingTableAndColumnIdList: Collection[Long]): Unit = {
        regINS(CK_NINS, cTL(theLongAndWindingTableAndColumnIdList), getCValueTheLongAndWindingTableAndColumnId(), "THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID");
    }

    protected def regTheLongAndWindingTableAndColumnId(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValueTheLongAndWindingTableAndColumnId(), "THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID"); }
    protected def getCValueTheLongAndWindingTableAndColumnId(): ConditionValue;

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_DATE: {NotNull, DATE(8)}
     * @param theLongAndWindingTableAndColumnRefDate The value of theLongAndWindingTableAndColumnRefDate as equal. (NullAllowed: if null, no condition)
     */
    def setTheLongAndWindingTableAndColumnRefDate_Equal(theLongAndWindingTableAndColumnRefDate: org.joda.time.LocalDate): Unit = {
        regTheLongAndWindingTableAndColumnRefDate(CK_EQ,  theLongAndWindingTableAndColumnRefDate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_DATE: {NotNull, DATE(8)}
     * @param theLongAndWindingTableAndColumnRefDate The value of theLongAndWindingTableAndColumnRefDate as greaterThan. (NullAllowed: if null, no condition)
     */
    def setTheLongAndWindingTableAndColumnRefDate_GreaterThan(theLongAndWindingTableAndColumnRefDate: org.joda.time.LocalDate): Unit = {
        regTheLongAndWindingTableAndColumnRefDate(CK_GT,  theLongAndWindingTableAndColumnRefDate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_DATE: {NotNull, DATE(8)}
     * @param theLongAndWindingTableAndColumnRefDate The value of theLongAndWindingTableAndColumnRefDate as lessThan. (NullAllowed: if null, no condition)
     */
    def setTheLongAndWindingTableAndColumnRefDate_LessThan(theLongAndWindingTableAndColumnRefDate: org.joda.time.LocalDate): Unit = {
        regTheLongAndWindingTableAndColumnRefDate(CK_LT,  theLongAndWindingTableAndColumnRefDate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_DATE: {NotNull, DATE(8)}
     * @param theLongAndWindingTableAndColumnRefDate The value of theLongAndWindingTableAndColumnRefDate as greaterEqual. (NullAllowed: if null, no condition)
     */
    def setTheLongAndWindingTableAndColumnRefDate_GreaterEqual(theLongAndWindingTableAndColumnRefDate: org.joda.time.LocalDate): Unit = {
        regTheLongAndWindingTableAndColumnRefDate(CK_GE,  theLongAndWindingTableAndColumnRefDate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_DATE: {NotNull, DATE(8)}
     * @param theLongAndWindingTableAndColumnRefDate The value of theLongAndWindingTableAndColumnRefDate as lessEqual. (NullAllowed: if null, no condition)
     */
    def setTheLongAndWindingTableAndColumnRefDate_LessEqual(theLongAndWindingTableAndColumnRefDate: org.joda.time.LocalDate): Unit = {
        regTheLongAndWindingTableAndColumnRefDate(CK_LE, theLongAndWindingTableAndColumnRefDate);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_DATE: {NotNull, DATE(8)}
     * <pre>e.g. setTheLongAndWindingTableAndColumnRefDate_FromTo(fromDate, toDate, new <span style="color: #DD4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of theLongAndWindingTableAndColumnRefDate. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of theLongAndWindingTableAndColumnRefDate. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    def setTheLongAndWindingTableAndColumnRefDate_FromTo(fromDatetime: org.joda.time.LocalDate, toDatetime: org.joda.time.LocalDate)(optionCall: (ScrFromToOption) => Unit): Unit = {
        regFTQ(toUtilDate(fromDatetime), toUtilDate(toDatetime), getCValueTheLongAndWindingTableAndColumnRefDate(), "THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_DATE", callbackFTOP(optionCall));
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_DATE: {NotNull, DATE(8)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #DD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of theLongAndWindingTableAndColumnRefDate. (NullAllowed: if null, no from-condition)
     * @param toDate The to-date(yyyy/MM/dd) of theLongAndWindingTableAndColumnRefDate. (NullAllowed: if null, no to-condition)
     */
    def setTheLongAndWindingTableAndColumnRefDate_DateFromTo(fromDate: org.joda.time.LocalDate, toDate: org.joda.time.LocalDate): Unit = {
        setTheLongAndWindingTableAndColumnRefDate_FromTo(fromDate, toDate)(_.compareAsDate);
    }

    protected def regTheLongAndWindingTableAndColumnRefDate(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValueTheLongAndWindingTableAndColumnRefDate(), "THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_DATE"); }
    protected def getCValueTheLongAndWindingTableAndColumnRefDate(): ConditionValue;

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * SHORT_DATE: {NotNull, DATE(8)}
     * @param shortDate The value of shortDate as equal. (NullAllowed: if null, no condition)
     */
    def setShortDate_Equal(shortDate: org.joda.time.LocalDate): Unit = {
        regShortDate(CK_EQ,  shortDate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * SHORT_DATE: {NotNull, DATE(8)}
     * @param shortDate The value of shortDate as greaterThan. (NullAllowed: if null, no condition)
     */
    def setShortDate_GreaterThan(shortDate: org.joda.time.LocalDate): Unit = {
        regShortDate(CK_GT,  shortDate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * SHORT_DATE: {NotNull, DATE(8)}
     * @param shortDate The value of shortDate as lessThan. (NullAllowed: if null, no condition)
     */
    def setShortDate_LessThan(shortDate: org.joda.time.LocalDate): Unit = {
        regShortDate(CK_LT,  shortDate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * SHORT_DATE: {NotNull, DATE(8)}
     * @param shortDate The value of shortDate as greaterEqual. (NullAllowed: if null, no condition)
     */
    def setShortDate_GreaterEqual(shortDate: org.joda.time.LocalDate): Unit = {
        regShortDate(CK_GE,  shortDate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * SHORT_DATE: {NotNull, DATE(8)}
     * @param shortDate The value of shortDate as lessEqual. (NullAllowed: if null, no condition)
     */
    def setShortDate_LessEqual(shortDate: org.joda.time.LocalDate): Unit = {
        regShortDate(CK_LE, shortDate);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * SHORT_DATE: {NotNull, DATE(8)}
     * <pre>e.g. setShortDate_FromTo(fromDate, toDate, new <span style="color: #DD4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of shortDate. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of shortDate. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    def setShortDate_FromTo(fromDatetime: org.joda.time.LocalDate, toDatetime: org.joda.time.LocalDate)(optionCall: (ScrFromToOption) => Unit): Unit = {
        regFTQ(toUtilDate(fromDatetime), toUtilDate(toDatetime), getCValueShortDate(), "SHORT_DATE", callbackFTOP(optionCall));
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * SHORT_DATE: {NotNull, DATE(8)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #DD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of shortDate. (NullAllowed: if null, no from-condition)
     * @param toDate The to-date(yyyy/MM/dd) of shortDate. (NullAllowed: if null, no to-condition)
     */
    def setShortDate_DateFromTo(fromDate: org.joda.time.LocalDate, toDate: org.joda.time.LocalDate): Unit = {
        setShortDate_FromTo(fromDate, toDate)(_.compareAsDate);
    }

    protected def regShortDate(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValueShortDate(), "SHORT_DATE"); }
    protected def getCValueShortDate(): ConditionValue;

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;VendorTheLongAndWindingTableAndColumnRefCB&gt;() {
     *     public void query(VendorTheLongAndWindingTableAndColumnRefCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_Equal(): ScrHpSSQFunction[VendorTheLongAndWindingTableAndColumnRefCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_EQ, classOf[VendorTheLongAndWindingTableAndColumnRefCB]));
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;VendorTheLongAndWindingTableAndColumnRefCB&gt;() {
     *     public void query(VendorTheLongAndWindingTableAndColumnRefCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_NotEqual(): ScrHpSSQFunction[VendorTheLongAndWindingTableAndColumnRefCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_NES, classOf[VendorTheLongAndWindingTableAndColumnRefCB]));
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;VendorTheLongAndWindingTableAndColumnRefCB&gt;() {
     *     public void query(VendorTheLongAndWindingTableAndColumnRefCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_GreaterThan(): ScrHpSSQFunction[VendorTheLongAndWindingTableAndColumnRefCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_GT, classOf[VendorTheLongAndWindingTableAndColumnRefCB]));
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;VendorTheLongAndWindingTableAndColumnRefCB&gt;() {
     *     public void query(VendorTheLongAndWindingTableAndColumnRefCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_LessThan(): ScrHpSSQFunction[VendorTheLongAndWindingTableAndColumnRefCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_LT, classOf[VendorTheLongAndWindingTableAndColumnRefCB]));
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;VendorTheLongAndWindingTableAndColumnRefCB&gt;() {
     *     public void query(VendorTheLongAndWindingTableAndColumnRefCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_GreaterEqual(): ScrHpSSQFunction[VendorTheLongAndWindingTableAndColumnRefCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_GE, classOf[VendorTheLongAndWindingTableAndColumnRefCB]));
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;VendorTheLongAndWindingTableAndColumnRefCB&gt;() {
     *     public void query(VendorTheLongAndWindingTableAndColumnRefCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_LessEqual(): ScrHpSSQFunction[VendorTheLongAndWindingTableAndColumnRefCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_LE, classOf[VendorTheLongAndWindingTableAndColumnRefCB]));
    }

    protected def toScalaSSQFunction(function: HpSSQFunction[VendorTheLongAndWindingTableAndColumnRefCB]): ScrHpSSQFunction[VendorTheLongAndWindingTableAndColumnRefCB] =
    { new ScrHpSSQFunction(function) }

    override protected def xscalarCondition[CB <: ConditionBean](fn: String, sq: SubQuery[CB], rd: String, op: HpSSQOption[CB]): Unit = {
        assertObjectNotNull("subQuery", sq);
        val cb: VendorTheLongAndWindingTableAndColumnRefCB = xcreateScalarConditionCB(); sq.query(cb.asInstanceOf[CB]);
        val pp: String = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean(xcreateScalarConditionPartitionByCB().asInstanceOf[CB]); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    def keepScalarCondition(sq: VendorTheLongAndWindingTableAndColumnRefCQ): String;

    protected def xcreateScalarConditionCB(): VendorTheLongAndWindingTableAndColumnRefCB = {
        val cb: VendorTheLongAndWindingTableAndColumnRefCB = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected def xcreateScalarConditionPartitionByCB(): VendorTheLongAndWindingTableAndColumnRefCB = {
        val cb: VendorTheLongAndWindingTableAndColumnRefCB = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    def xsmyselfDerive(fn: String, sq: SubQuery[VendorTheLongAndWindingTableAndColumnRefCB], al: String, op: DerivedReferrerOption): Unit = {
        assertObjectNotNull("subQuery", sq);
        val cb: VendorTheLongAndWindingTableAndColumnRefCB = new VendorTheLongAndWindingTableAndColumnRefCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        val pp: String = keepSpecifyMyselfDerived(cb.query());
        val pk: String = "THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    def keepSpecifyMyselfDerived(sq: VendorTheLongAndWindingTableAndColumnRefCQ): String;

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    def myselfDerived(): ScrHpQDRFunction[VendorTheLongAndWindingTableAndColumnRefCB] = {
        return toScalaQDRFunction(xcreateQDRFunctionMyselfDerived(classOf[VendorTheLongAndWindingTableAndColumnRefCB]));
    }
    override protected def xqderiveMyselfDerived[CB <: ConditionBean](fn: String, sq: SubQuery[CB], rd: String, vl: Object, op: DerivedReferrerOption): Unit = {
        assertObjectNotNull("subQuery", sq);
        val cb: VendorTheLongAndWindingTableAndColumnRefCB = new VendorTheLongAndWindingTableAndColumnRefCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb.asInstanceOf[CB]);
        val pk: String = "THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_ID";
        val sqpp: String = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        val prpp: String = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    def keepQueryMyselfDerived(sq: VendorTheLongAndWindingTableAndColumnRefCQ): String;
    def keepQueryMyselfDerivedParameter(vl: Object): String;

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    def myselfExists(subQuery: (VendorTheLongAndWindingTableAndColumnRefCB) => Unit): Unit = {
        assertObjectNotNull("subQuery", subQuery);
        val cb: VendorTheLongAndWindingTableAndColumnRefCB = new VendorTheLongAndWindingTableAndColumnRefCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery(cb); } finally { unlock(); }
        val pp: String = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    def keepMyselfExists(sq: VendorTheLongAndWindingTableAndColumnRefCQ): String;

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    def myselfInScope(subQuery: (VendorTheLongAndWindingTableAndColumnRefCB) => Unit): Unit = {
        assertObjectNotNull("subQuery", subQuery);
        val cb: VendorTheLongAndWindingTableAndColumnRefCB = new VendorTheLongAndWindingTableAndColumnRefCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery(cb); } finally { unlock(); }
        val pp: String = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    def keepMyselfInScope(sq: VendorTheLongAndWindingTableAndColumnRefCQ): String;

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
    protected def newMyCB(): VendorTheLongAndWindingTableAndColumnRefCB = {
        return new VendorTheLongAndWindingTableAndColumnRefCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected def xabUDT(): String = { return classOf[Date].getName(); }
    protected def xabCQ(): String = { return classOf[VendorTheLongAndWindingTableAndColumnRefCQ].getName(); }
    protected def xabLSO(): String = { return classOf[LikeSearchOption].getName(); }
    protected def xabSSQS(): String = { return classOf[HpSSQSetupper[_]].getName(); }
}
