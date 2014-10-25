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
 * The abstract condition-query of MEMBER_ADDRESS.
 * @author DBFlute(AutoGenerator)
 */
abstract class AbstractBsMemberAddressCQ(referrerQuery: ConditionQuery, sqlClause: SqlClause, aliasName: String, nestLevel: Integer)
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
        return "MEMBER_ADDRESS";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員住所ID)MEMBER_ADDRESS_ID: {PK, ID, NotNull, INTEGER(10)}
     * @param memberAddressId The value of memberAddressId as equal. (NullAllowed: if null, no condition)
     */
    def setMemberAddressId_Equal(memberAddressId: Int): Unit = {
        doSetMemberAddressId_Equal(memberAddressId);
    }

    protected def doSetMemberAddressId_Equal(memberAddressId: Integer): Unit = {
        regMemberAddressId(CK_EQ, memberAddressId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員住所ID)MEMBER_ADDRESS_ID: {PK, ID, NotNull, INTEGER(10)}
     * @param memberAddressId The value of memberAddressId as notEqual. (NullAllowed: if null, no condition)
     */
    def setMemberAddressId_NotEqual(memberAddressId: Int): Unit = {
        doSetMemberAddressId_NotEqual(memberAddressId);
    }

    protected def doSetMemberAddressId_NotEqual(memberAddressId: Integer): Unit = {
        regMemberAddressId(CK_NES, memberAddressId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員住所ID)MEMBER_ADDRESS_ID: {PK, ID, NotNull, INTEGER(10)}
     * @param memberAddressId The value of memberAddressId as greaterThan. (NullAllowed: if null, no condition)
     */
    def setMemberAddressId_GreaterThan(memberAddressId: Int): Unit = {
        regMemberAddressId(CK_GT, memberAddressId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員住所ID)MEMBER_ADDRESS_ID: {PK, ID, NotNull, INTEGER(10)}
     * @param memberAddressId The value of memberAddressId as lessThan. (NullAllowed: if null, no condition)
     */
    def setMemberAddressId_LessThan(memberAddressId: Int): Unit = {
        regMemberAddressId(CK_LT, memberAddressId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員住所ID)MEMBER_ADDRESS_ID: {PK, ID, NotNull, INTEGER(10)}
     * @param memberAddressId The value of memberAddressId as greaterEqual. (NullAllowed: if null, no condition)
     */
    def setMemberAddressId_GreaterEqual(memberAddressId: Int): Unit = {
        regMemberAddressId(CK_GE, memberAddressId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員住所ID)MEMBER_ADDRESS_ID: {PK, ID, NotNull, INTEGER(10)}
     * @param memberAddressId The value of memberAddressId as lessEqual. (NullAllowed: if null, no condition)
     */
    def setMemberAddressId_LessEqual(memberAddressId: Int): Unit = {
        regMemberAddressId(CK_LE, memberAddressId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (会員住所ID)MEMBER_ADDRESS_ID: {PK, ID, NotNull, INTEGER(10)}
     * @param minNumber The min number of memberAddressId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of memberAddressId. (NullAllowed: if null, no to-condition)
     * @param optionCall The callback for option of range-of. (NotNull)
     */
    def setMemberAddressId_RangeOf(minNumber: Int, maxNumber: Int)(optionCall: (RangeOfOption) => Unit): Unit = {
        regROO(minNumber, maxNumber, getCValueMemberAddressId(), "MEMBER_ADDRESS_ID", callbackROOP(optionCall));
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (会員住所ID)MEMBER_ADDRESS_ID: {PK, ID, NotNull, INTEGER(10)}
     * @param memberAddressIdList The collection of memberAddressId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    def setMemberAddressId_InScope(memberAddressIdList: List[Int]): Unit = {
        doSetMemberAddressId_InScope(toMutableValueCollectionImplicitly(memberAddressIdList));
    }

    protected def doSetMemberAddressId_InScope(memberAddressIdList: Collection[Integer]): Unit = {
        regINS(CK_INS, cTL(memberAddressIdList), getCValueMemberAddressId(), "MEMBER_ADDRESS_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (会員住所ID)MEMBER_ADDRESS_ID: {PK, ID, NotNull, INTEGER(10)}
     * @param memberAddressIdList The collection of memberAddressId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    def setMemberAddressId_NotInScope(memberAddressIdList: List[Int]): Unit = {
        doSetMemberAddressId_NotInScope(if (memberAddressIdList != null) { memberAddressIdList.map(_.asInstanceOf[Integer]).asJava } else { null });
    }

    protected def doSetMemberAddressId_NotInScope(memberAddressIdList: Collection[Integer]): Unit = {
        regINS(CK_NINS, cTL(memberAddressIdList), getCValueMemberAddressId(), "MEMBER_ADDRESS_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * (会員住所ID)MEMBER_ADDRESS_ID: {PK, ID, NotNull, INTEGER(10)}
     */
    def setMemberAddressId_IsNull(): Unit = { regMemberAddressId(CK_ISN, AbstractConditionQuery.DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * (会員住所ID)MEMBER_ADDRESS_ID: {PK, ID, NotNull, INTEGER(10)}
     */
    def setMemberAddressId_IsNotNull(): Unit = { regMemberAddressId(CK_ISNN, AbstractConditionQuery.DOBJ); }

    protected def regMemberAddressId(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValueMemberAddressId(), "MEMBER_ADDRESS_ID"); }
    protected def getCValueMemberAddressId(): ConditionValue;

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ID)MEMBER_ID: {UQ+, IX, NotNull, INTEGER(10), FK to MEMBER}
     * @param memberId The value of memberId as equal. (NullAllowed: if null, no condition)
     */
    def setMemberId_Equal(memberId: Int): Unit = {
        doSetMemberId_Equal(memberId);
    }

    protected def doSetMemberId_Equal(memberId: Integer): Unit = {
        regMemberId(CK_EQ, memberId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ID)MEMBER_ID: {UQ+, IX, NotNull, INTEGER(10), FK to MEMBER}
     * @param memberId The value of memberId as notEqual. (NullAllowed: if null, no condition)
     */
    def setMemberId_NotEqual(memberId: Int): Unit = {
        doSetMemberId_NotEqual(memberId);
    }

    protected def doSetMemberId_NotEqual(memberId: Integer): Unit = {
        regMemberId(CK_NES, memberId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ID)MEMBER_ID: {UQ+, IX, NotNull, INTEGER(10), FK to MEMBER}
     * @param memberId The value of memberId as greaterThan. (NullAllowed: if null, no condition)
     */
    def setMemberId_GreaterThan(memberId: Int): Unit = {
        regMemberId(CK_GT, memberId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ID)MEMBER_ID: {UQ+, IX, NotNull, INTEGER(10), FK to MEMBER}
     * @param memberId The value of memberId as lessThan. (NullAllowed: if null, no condition)
     */
    def setMemberId_LessThan(memberId: Int): Unit = {
        regMemberId(CK_LT, memberId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ID)MEMBER_ID: {UQ+, IX, NotNull, INTEGER(10), FK to MEMBER}
     * @param memberId The value of memberId as greaterEqual. (NullAllowed: if null, no condition)
     */
    def setMemberId_GreaterEqual(memberId: Int): Unit = {
        regMemberId(CK_GE, memberId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ID)MEMBER_ID: {UQ+, IX, NotNull, INTEGER(10), FK to MEMBER}
     * @param memberId The value of memberId as lessEqual. (NullAllowed: if null, no condition)
     */
    def setMemberId_LessEqual(memberId: Int): Unit = {
        regMemberId(CK_LE, memberId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ID)MEMBER_ID: {UQ+, IX, NotNull, INTEGER(10), FK to MEMBER}
     * @param minNumber The min number of memberId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of memberId. (NullAllowed: if null, no to-condition)
     * @param optionCall The callback for option of range-of. (NotNull)
     */
    def setMemberId_RangeOf(minNumber: Int, maxNumber: Int)(optionCall: (RangeOfOption) => Unit): Unit = {
        regROO(minNumber, maxNumber, getCValueMemberId(), "MEMBER_ID", callbackROOP(optionCall));
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (会員ID)MEMBER_ID: {UQ+, IX, NotNull, INTEGER(10), FK to MEMBER}
     * @param memberIdList The collection of memberId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    def setMemberId_InScope(memberIdList: List[Int]): Unit = {
        doSetMemberId_InScope(toMutableValueCollectionImplicitly(memberIdList));
    }

    protected def doSetMemberId_InScope(memberIdList: Collection[Integer]): Unit = {
        regINS(CK_INS, cTL(memberIdList), getCValueMemberId(), "MEMBER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (会員ID)MEMBER_ID: {UQ+, IX, NotNull, INTEGER(10), FK to MEMBER}
     * @param memberIdList The collection of memberId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    def setMemberId_NotInScope(memberIdList: List[Int]): Unit = {
        doSetMemberId_NotInScope(if (memberIdList != null) { memberIdList.map(_.asInstanceOf[Integer]).asJava } else { null });
    }

    protected def doSetMemberId_NotInScope(memberIdList: Collection[Integer]): Unit = {
        regINS(CK_NINS, cTL(memberIdList), getCValueMemberId(), "MEMBER_ID");
    }

    protected def regMemberId(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValueMemberId(), "MEMBER_ID"); }
    protected def getCValueMemberId(): ConditionValue;

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * (有効開始日)VALID_BEGIN_DATE: {+UQ, NotNull, DATE(8)}
     * @param validBeginDate The value of validBeginDate as equal. (NullAllowed: if null, no condition)
     */
    def setValidBeginDate_Equal(validBeginDate: org.joda.time.LocalDate): Unit = {
        regValidBeginDate(CK_EQ,  validBeginDate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (有効開始日)VALID_BEGIN_DATE: {+UQ, NotNull, DATE(8)}
     * @param validBeginDate The value of validBeginDate as greaterThan. (NullAllowed: if null, no condition)
     */
    def setValidBeginDate_GreaterThan(validBeginDate: org.joda.time.LocalDate): Unit = {
        regValidBeginDate(CK_GT,  validBeginDate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (有効開始日)VALID_BEGIN_DATE: {+UQ, NotNull, DATE(8)}
     * @param validBeginDate The value of validBeginDate as lessThan. (NullAllowed: if null, no condition)
     */
    def setValidBeginDate_LessThan(validBeginDate: org.joda.time.LocalDate): Unit = {
        regValidBeginDate(CK_LT,  validBeginDate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (有効開始日)VALID_BEGIN_DATE: {+UQ, NotNull, DATE(8)}
     * @param validBeginDate The value of validBeginDate as greaterEqual. (NullAllowed: if null, no condition)
     */
    def setValidBeginDate_GreaterEqual(validBeginDate: org.joda.time.LocalDate): Unit = {
        regValidBeginDate(CK_GE,  validBeginDate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (有効開始日)VALID_BEGIN_DATE: {+UQ, NotNull, DATE(8)}
     * @param validBeginDate The value of validBeginDate as lessEqual. (NullAllowed: if null, no condition)
     */
    def setValidBeginDate_LessEqual(validBeginDate: org.joda.time.LocalDate): Unit = {
        regValidBeginDate(CK_LE, validBeginDate);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (有効開始日)VALID_BEGIN_DATE: {+UQ, NotNull, DATE(8)}
     * <pre>e.g. setValidBeginDate_FromTo(fromDate, toDate, new <span style="color: #DD4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of validBeginDate. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of validBeginDate. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    def setValidBeginDate_FromTo(fromDatetime: org.joda.time.LocalDate, toDatetime: org.joda.time.LocalDate)(optionCall: (ScrFromToOption) => Unit): Unit = {
        regFTQ(toUtilDate(fromDatetime), toUtilDate(toDatetime), getCValueValidBeginDate(), "VALID_BEGIN_DATE", callbackFTOP(optionCall));
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (有効開始日)VALID_BEGIN_DATE: {+UQ, NotNull, DATE(8)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #DD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of validBeginDate. (NullAllowed: if null, no from-condition)
     * @param toDate The to-date(yyyy/MM/dd) of validBeginDate. (NullAllowed: if null, no to-condition)
     */
    def setValidBeginDate_DateFromTo(fromDate: org.joda.time.LocalDate, toDate: org.joda.time.LocalDate): Unit = {
        setValidBeginDate_FromTo(fromDate, toDate)(_.compareAsDate);
    }

    protected def regValidBeginDate(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValueValidBeginDate(), "VALID_BEGIN_DATE"); }
    protected def getCValueValidBeginDate(): ConditionValue;

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * (有効終了日)VALID_END_DATE: {NotNull, DATE(8)}
     * @param validEndDate The value of validEndDate as equal. (NullAllowed: if null, no condition)
     */
    def setValidEndDate_Equal(validEndDate: org.joda.time.LocalDate): Unit = {
        regValidEndDate(CK_EQ,  validEndDate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (有効終了日)VALID_END_DATE: {NotNull, DATE(8)}
     * @param validEndDate The value of validEndDate as greaterThan. (NullAllowed: if null, no condition)
     */
    def setValidEndDate_GreaterThan(validEndDate: org.joda.time.LocalDate): Unit = {
        regValidEndDate(CK_GT,  validEndDate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (有効終了日)VALID_END_DATE: {NotNull, DATE(8)}
     * @param validEndDate The value of validEndDate as lessThan. (NullAllowed: if null, no condition)
     */
    def setValidEndDate_LessThan(validEndDate: org.joda.time.LocalDate): Unit = {
        regValidEndDate(CK_LT,  validEndDate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (有効終了日)VALID_END_DATE: {NotNull, DATE(8)}
     * @param validEndDate The value of validEndDate as greaterEqual. (NullAllowed: if null, no condition)
     */
    def setValidEndDate_GreaterEqual(validEndDate: org.joda.time.LocalDate): Unit = {
        regValidEndDate(CK_GE,  validEndDate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (有効終了日)VALID_END_DATE: {NotNull, DATE(8)}
     * @param validEndDate The value of validEndDate as lessEqual. (NullAllowed: if null, no condition)
     */
    def setValidEndDate_LessEqual(validEndDate: org.joda.time.LocalDate): Unit = {
        regValidEndDate(CK_LE, validEndDate);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (有効終了日)VALID_END_DATE: {NotNull, DATE(8)}
     * <pre>e.g. setValidEndDate_FromTo(fromDate, toDate, new <span style="color: #DD4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of validEndDate. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of validEndDate. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    def setValidEndDate_FromTo(fromDatetime: org.joda.time.LocalDate, toDatetime: org.joda.time.LocalDate)(optionCall: (ScrFromToOption) => Unit): Unit = {
        regFTQ(toUtilDate(fromDatetime), toUtilDate(toDatetime), getCValueValidEndDate(), "VALID_END_DATE", callbackFTOP(optionCall));
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (有効終了日)VALID_END_DATE: {NotNull, DATE(8)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #DD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of validEndDate. (NullAllowed: if null, no from-condition)
     * @param toDate The to-date(yyyy/MM/dd) of validEndDate. (NullAllowed: if null, no to-condition)
     */
    def setValidEndDate_DateFromTo(fromDate: org.joda.time.LocalDate, toDate: org.joda.time.LocalDate): Unit = {
        setValidEndDate_FromTo(fromDate, toDate)(_.compareAsDate);
    }

    protected def regValidEndDate(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValueValidEndDate(), "VALID_END_DATE"); }
    protected def getCValueValidEndDate(): ConditionValue;

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (住所)ADDRESS: {NotNull, VARCHAR(200)}
     * @param address The value of address as equal. (NullAllowed: if null (or empty), no condition)
     */
    def setAddress_Equal(address: String): Unit = {
        doSetAddress_Equal(fRES(address));
    }

    protected def doSetAddress_Equal(address: String): Unit = {
        regAddress(CK_EQ, address);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (住所)ADDRESS: {NotNull, VARCHAR(200)}
     * @param address The value of address as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    def setAddress_NotEqual(address: String): Unit = {
        doSetAddress_NotEqual(fRES(address));
    }

    protected def doSetAddress_NotEqual(address: String): Unit = {
        regAddress(CK_NES, address);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (住所)ADDRESS: {NotNull, VARCHAR(200)}
     * @param addressList The collection of address as inScope. (NullAllowed: if null (or empty), no condition)
     */
    def setAddress_InScope(addressList: List[String]): Unit = {
        doSetAddress_InScope(toMutableValueCollectionImplicitly(addressList));
    }

    protected def doSetAddress_InScope(addressList: Collection[String]): Unit = {
        regINS(CK_INS, cTL(addressList), getCValueAddress(), "ADDRESS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (住所)ADDRESS: {NotNull, VARCHAR(200)}
     * @param addressList The collection of address as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    def setAddress_NotInScope(addressList: List[String]): Unit = {
        doSetAddress_NotInScope(if (addressList != null) { addressList.map(_.asInstanceOf[String]).asJava } else { null });
    }

    protected def doSetAddress_NotInScope(addressList: Collection[String]): Unit = {
        regINS(CK_NINS, cTL(addressList), getCValueAddress(), "ADDRESS");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (住所)ADDRESS: {NotNull, VARCHAR(200)}
     * @param address The value of address as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    def setAddress_PrefixSearch(address: String): Unit = {
        setAddress_LikeSearch(address)(_.likePrefix);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (住所)ADDRESS: {NotNull, VARCHAR(200)} <br />
     * <pre>e.g. setAddress_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param address The value of address as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param optionCall The callback for option of like-search. (NotNull)
     */
    def setAddress_LikeSearch(address: String)(optionCall: (ScrLikeSearchOption) => Unit): Unit = {
        regLSQ(CK_LS, fRES(address), getCValueAddress(), "ADDRESS", callbackLSOP(optionCall));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (住所)ADDRESS: {NotNull, VARCHAR(200)}
     * @param address The value of address as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param optionCall The callback for option of not-like-search. (NotNull)
     */
    def setAddress_NotLikeSearch(address: String)(optionCall: (ScrLikeSearchOption) => Unit): Unit = {
        regLSQ(CK_NLS, fRES(address), getCValueAddress(), "ADDRESS", callbackLSOP(optionCall));
    }

    protected def regAddress(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValueAddress(), "ADDRESS"); }
    protected def getCValueAddress(): ConditionValue;

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * (地域ID)REGION_ID: {IX, NotNull, INTEGER(10), FK to REGION, classification=Region}
     * @param regionId The value of regionId as equal. (NullAllowed: if null, no condition)
     */
    protected def setRegionId_Equal(regionId: Int): Unit = {
        doSetRegionId_Equal(regionId);
    }

    /**
     * Equal(=). As Region. And NullIgnored, OnlyOnceRegistered. <br />
     * (地域ID)REGION_ID: {IX, NotNull, INTEGER(10), FK to REGION, classification=Region} <br />
     * mainly region of member address
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, no condition)
     */
    def setRegionId_Equal_AsRegion(cdef: CDef.Region): Unit = {
        doSetRegionId_Equal(cTNum(if (cdef != null) { cdef.code } else { null }, classOf[Integer]));
    }

    /**
     * Equal(=). As America (1). And NullIgnored, OnlyOnceRegistered. <br />
     * AMERICA
     */
    def setRegionId_Equal_America(): Unit = {
        setRegionId_Equal_AsRegion(CDef.Region.America);
    }

    /**
     * Equal(=). As Canada (2). And NullIgnored, OnlyOnceRegistered. <br />
     * CANADA
     */
    def setRegionId_Equal_Canada(): Unit = {
        setRegionId_Equal_AsRegion(CDef.Region.Canada);
    }

    /**
     * Equal(=). As China (3). And NullIgnored, OnlyOnceRegistered. <br />
     * CHINA
     */
    def setRegionId_Equal_China(): Unit = {
        setRegionId_Equal_AsRegion(CDef.Region.China);
    }

    /**
     * Equal(=). As Chiba (4). And NullIgnored, OnlyOnceRegistered. <br />
     * CHIBA
     */
    def setRegionId_Equal_Chiba(): Unit = {
        setRegionId_Equal_AsRegion(CDef.Region.Chiba);
    }

    protected def doSetRegionId_Equal(regionId: Integer): Unit = {
        regRegionId(CK_EQ, regionId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (地域ID)REGION_ID: {IX, NotNull, INTEGER(10), FK to REGION, classification=Region}
     * @param regionId The value of regionId as notEqual. (NullAllowed: if null, no condition)
     */
    protected def setRegionId_NotEqual(regionId: Int): Unit = {
        doSetRegionId_NotEqual(regionId);
    }

    /**
     * NotEqual(&lt;&gt;). As Region. And NullIgnored, OnlyOnceRegistered. <br />
     * (地域ID)REGION_ID: {IX, NotNull, INTEGER(10), FK to REGION, classification=Region} <br />
     * mainly region of member address
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, no condition)
     */
    def setRegionId_NotEqual_AsRegion(cdef: CDef.Region): Unit = {
        doSetRegionId_NotEqual(cTNum(if (cdef != null) { cdef.code } else { null }, classOf[Integer]));
    }

    /**
     * NotEqual(&lt;&gt;). As America (1). And NullIgnored, OnlyOnceRegistered. <br />
     * AMERICA
     */
    def setRegionId_NotEqual_America(): Unit = {
        setRegionId_NotEqual_AsRegion(CDef.Region.America);
    }

    /**
     * NotEqual(&lt;&gt;). As Canada (2). And NullIgnored, OnlyOnceRegistered. <br />
     * CANADA
     */
    def setRegionId_NotEqual_Canada(): Unit = {
        setRegionId_NotEqual_AsRegion(CDef.Region.Canada);
    }

    /**
     * NotEqual(&lt;&gt;). As China (3). And NullIgnored, OnlyOnceRegistered. <br />
     * CHINA
     */
    def setRegionId_NotEqual_China(): Unit = {
        setRegionId_NotEqual_AsRegion(CDef.Region.China);
    }

    /**
     * NotEqual(&lt;&gt;). As Chiba (4). And NullIgnored, OnlyOnceRegistered. <br />
     * CHIBA
     */
    def setRegionId_NotEqual_Chiba(): Unit = {
        setRegionId_NotEqual_AsRegion(CDef.Region.Chiba);
    }

    protected def doSetRegionId_NotEqual(regionId: Integer): Unit = {
        regRegionId(CK_NES, regionId);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (地域ID)REGION_ID: {IX, NotNull, INTEGER(10), FK to REGION, classification=Region}
     * @param regionIdList The collection of regionId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    def setRegionId_InScope(regionIdList: List[Int]): Unit = {
        doSetRegionId_InScope(toMutableValueCollectionImplicitly(regionIdList));
    }

    /**
     * InScope {in (1, 2)}. As Region. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (地域ID)REGION_ID: {IX, NotNull, INTEGER(10), FK to REGION, classification=Region} <br />
     * mainly region of member address
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    def setRegionId_InScope_AsRegion(cdefList: List[CDef.Region]): Unit = {
        doSetRegionId_InScope(cTNumL(cdefList.asJava, classOf[Integer]));
    }

    protected def doSetRegionId_InScope(regionIdList: Collection[Integer]): Unit = {
        regINS(CK_INS, cTL(regionIdList), getCValueRegionId(), "REGION_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (地域ID)REGION_ID: {IX, NotNull, INTEGER(10), FK to REGION, classification=Region}
     * @param regionIdList The collection of regionId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    def setRegionId_NotInScope(regionIdList: List[Int]): Unit = {
        doSetRegionId_NotInScope(if (regionIdList != null) { regionIdList.map(_.asInstanceOf[Integer]).asJava } else { null });
    }

    /**
     * NotInScope {not in (1, 2)}. As Region. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (地域ID)REGION_ID: {IX, NotNull, INTEGER(10), FK to REGION, classification=Region} <br />
     * mainly region of member address
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    def setRegionId_NotInScope_AsRegion(cdefList: List[CDef.Region]): Unit = {
        doSetRegionId_NotInScope(cTNumL(cdefList.asJava, classOf[Integer]));
    }

    protected def doSetRegionId_NotInScope(regionIdList: Collection[Integer]): Unit = {
        regINS(CK_NINS, cTL(regionIdList), getCValueRegionId(), "REGION_ID");
    }

    protected def regRegionId(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValueRegionId(), "REGION_ID"); }
    protected def getCValueRegionId(): ConditionValue;

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
     * @param optionCall The callback for option of range-of. (NotNull)
     */
    def setVersionNo_RangeOf(minNumber: Long, maxNumber: Long)(optionCall: (RangeOfOption) => Unit): Unit = {
        regROO(minNumber, maxNumber, getCValueVersionNo(), "VERSION_NO", callbackROOP(optionCall));
    }

    protected def regVersionNo(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValueVersionNo(), "VERSION_NO"); }
    protected def getCValueVersionNo(): ConditionValue;

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;MemberAddressCB&gt;() {
     *     public void query(MemberAddressCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_Equal(): ScrHpSSQFunction[MemberAddressCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_EQ, classOf[MemberAddressCB]));
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;MemberAddressCB&gt;() {
     *     public void query(MemberAddressCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_NotEqual(): ScrHpSSQFunction[MemberAddressCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_NES, classOf[MemberAddressCB]));
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;MemberAddressCB&gt;() {
     *     public void query(MemberAddressCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_GreaterThan(): ScrHpSSQFunction[MemberAddressCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_GT, classOf[MemberAddressCB]));
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;MemberAddressCB&gt;() {
     *     public void query(MemberAddressCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_LessThan(): ScrHpSSQFunction[MemberAddressCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_LT, classOf[MemberAddressCB]));
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;MemberAddressCB&gt;() {
     *     public void query(MemberAddressCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_GreaterEqual(): ScrHpSSQFunction[MemberAddressCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_GE, classOf[MemberAddressCB]));
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MemberAddressCB&gt;() {
     *     public void query(MemberAddressCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_LessEqual(): ScrHpSSQFunction[MemberAddressCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_LE, classOf[MemberAddressCB]));
    }

    protected def toScalaSSQFunction(function: HpSSQFunction[MemberAddressCB]): ScrHpSSQFunction[MemberAddressCB] =
    { new ScrHpSSQFunction(function) }

    override protected def xscalarCondition[CB <: ConditionBean](fn: String, sq: SubQuery[CB], rd: String, op: HpSSQOption[CB]): Unit = {
        assertObjectNotNull("subQuery", sq);
        val cb: MemberAddressCB = xcreateScalarConditionCB(); sq.query(cb.asInstanceOf[CB]);
        val pp: String = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean(xcreateScalarConditionPartitionByCB().asInstanceOf[CB]); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    def keepScalarCondition(sq: MemberAddressCQ): String;

    protected def xcreateScalarConditionCB(): MemberAddressCB = {
        val cb: MemberAddressCB = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected def xcreateScalarConditionPartitionByCB(): MemberAddressCB = {
        val cb: MemberAddressCB = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    def xsmyselfDerive(fn: String, sq: SubQuery[MemberAddressCB], al: String, op: DerivedReferrerOption): Unit = {
        assertObjectNotNull("subQuery", sq);
        val cb: MemberAddressCB = new MemberAddressCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        val pp: String = keepSpecifyMyselfDerived(cb.query());
        val pk: String = "MEMBER_ADDRESS_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    def keepSpecifyMyselfDerived(sq: MemberAddressCQ): String;

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    def myselfDerived(): ScrHpQDRFunction[MemberAddressCB] = {
        return toScalaQDRFunction(xcreateQDRFunctionMyselfDerived(classOf[MemberAddressCB]));
    }
    override protected def xqderiveMyselfDerived[CB <: ConditionBean](fn: String, sq: SubQuery[CB], rd: String, vl: Object, op: DerivedReferrerOption): Unit = {
        assertObjectNotNull("subQuery", sq);
        val cb: MemberAddressCB = new MemberAddressCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb.asInstanceOf[CB]);
        val pk: String = "MEMBER_ADDRESS_ID";
        val sqpp: String = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        val prpp: String = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    def keepQueryMyselfDerived(sq: MemberAddressCQ): String;
    def keepQueryMyselfDerivedParameter(vl: Object): String;

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    def myselfExists(subQuery: (MemberAddressCB) => Unit): Unit = {
        assertObjectNotNull("subQuery", subQuery);
        val cb: MemberAddressCB = new MemberAddressCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery(cb); } finally { unlock(); }
        val pp: String = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    def keepMyselfExists(sq: MemberAddressCQ): String;

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    def myselfInScope(subQuery: (MemberAddressCB) => Unit): Unit = {
        assertObjectNotNull("subQuery", subQuery);
        val cb: MemberAddressCB = new MemberAddressCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery(cb); } finally { unlock(); }
        val pp: String = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    def keepMyselfInScope(sq: MemberAddressCQ): String;

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
    protected def newMyCB(): MemberAddressCB = {
        return new MemberAddressCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected def xabUDT(): String = { return classOf[Date].getName(); }
    protected def xabCQ(): String = { return classOf[MemberAddressCQ].getName(); }
    protected def xabLSO(): String = { return classOf[LikeSearchOption].getName(); }
    protected def xabSSQS(): String = { return classOf[HpSSQSetupper[_]].getName(); }
}
