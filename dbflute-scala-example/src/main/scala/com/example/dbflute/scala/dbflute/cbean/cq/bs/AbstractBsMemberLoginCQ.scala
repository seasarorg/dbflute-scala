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
 * The abstract condition-query of MEMBER_LOGIN.
 * @author DBFlute(AutoGenerator)
 */
abstract class AbstractBsMemberLoginCQ(referrerQuery: ConditionQuery, sqlClause: SqlClause, aliasName: String, nestLevel: Integer)
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
        return "MEMBER_LOGIN";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ログインID)MEMBER_LOGIN_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param memberLoginId The value of memberLoginId as equal. (NullAllowed: if null, no condition)
     */
    def setMemberLoginId_Equal(memberLoginId: Long): Unit = {
        doSetMemberLoginId_Equal(memberLoginId);
    }

    protected def doSetMemberLoginId_Equal(memberLoginId: Long): Unit = {
        regMemberLoginId(CK_EQ, memberLoginId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ログインID)MEMBER_LOGIN_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param memberLoginId The value of memberLoginId as notEqual. (NullAllowed: if null, no condition)
     */
    def setMemberLoginId_NotEqual(memberLoginId: Long): Unit = {
        doSetMemberLoginId_NotEqual(memberLoginId);
    }

    protected def doSetMemberLoginId_NotEqual(memberLoginId: Long): Unit = {
        regMemberLoginId(CK_NES, memberLoginId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ログインID)MEMBER_LOGIN_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param memberLoginId The value of memberLoginId as greaterThan. (NullAllowed: if null, no condition)
     */
    def setMemberLoginId_GreaterThan(memberLoginId: Long): Unit = {
        regMemberLoginId(CK_GT, memberLoginId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ログインID)MEMBER_LOGIN_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param memberLoginId The value of memberLoginId as lessThan. (NullAllowed: if null, no condition)
     */
    def setMemberLoginId_LessThan(memberLoginId: Long): Unit = {
        regMemberLoginId(CK_LT, memberLoginId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ログインID)MEMBER_LOGIN_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param memberLoginId The value of memberLoginId as greaterEqual. (NullAllowed: if null, no condition)
     */
    def setMemberLoginId_GreaterEqual(memberLoginId: Long): Unit = {
        regMemberLoginId(CK_GE, memberLoginId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ログインID)MEMBER_LOGIN_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param memberLoginId The value of memberLoginId as lessEqual. (NullAllowed: if null, no condition)
     */
    def setMemberLoginId_LessEqual(memberLoginId: Long): Unit = {
        regMemberLoginId(CK_LE, memberLoginId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ログインID)MEMBER_LOGIN_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of memberLoginId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of memberLoginId. (NullAllowed: if null, no to-condition)
     * @param optionCall The callback for option of range-of. (NotNull)
     */
    def setMemberLoginId_RangeOf(minNumber: Long, maxNumber: Long)(optionCall: (RangeOfOption) => Unit): Unit = {
        regROO(minNumber, maxNumber, getCValueMemberLoginId(), "MEMBER_LOGIN_ID", callbackROOP(optionCall));
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (会員ログインID)MEMBER_LOGIN_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param memberLoginIdList The collection of memberLoginId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    def setMemberLoginId_InScope(memberLoginIdList: List[Long]): Unit = {
        doSetMemberLoginId_InScope(toMutableValueCollectionImplicitly(memberLoginIdList));
    }

    protected def doSetMemberLoginId_InScope(memberLoginIdList: Collection[Long]): Unit = {
        regINS(CK_INS, cTL(memberLoginIdList), getCValueMemberLoginId(), "MEMBER_LOGIN_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (会員ログインID)MEMBER_LOGIN_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param memberLoginIdList The collection of memberLoginId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    def setMemberLoginId_NotInScope(memberLoginIdList: List[Long]): Unit = {
        doSetMemberLoginId_NotInScope(if (memberLoginIdList != null) { memberLoginIdList.map(_.asInstanceOf[Long]).asJava } else { null });
    }

    protected def doSetMemberLoginId_NotInScope(memberLoginIdList: Collection[Long]): Unit = {
        regINS(CK_NINS, cTL(memberLoginIdList), getCValueMemberLoginId(), "MEMBER_LOGIN_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * (会員ログインID)MEMBER_LOGIN_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    def setMemberLoginId_IsNull(): Unit = { regMemberLoginId(CK_ISN, AbstractConditionQuery.DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * (会員ログインID)MEMBER_LOGIN_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    def setMemberLoginId_IsNotNull(): Unit = { regMemberLoginId(CK_ISNN, AbstractConditionQuery.DOBJ); }

    protected def regMemberLoginId(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValueMemberLoginId(), "MEMBER_LOGIN_ID"); }
    protected def getCValueMemberLoginId(): ConditionValue;

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
     * (ログイン日時)LOGIN_DATETIME: {+UQ, IX, NotNull, TIMESTAMP(23, 10)}
     * @param loginDatetime The value of loginDatetime as equal. (NullAllowed: if null, no condition)
     */
    def setLoginDatetime_Equal(loginDatetime: org.joda.time.LocalDateTime): Unit = {
        regLoginDatetime(CK_EQ,  loginDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (ログイン日時)LOGIN_DATETIME: {+UQ, IX, NotNull, TIMESTAMP(23, 10)}
     * @param loginDatetime The value of loginDatetime as greaterThan. (NullAllowed: if null, no condition)
     */
    def setLoginDatetime_GreaterThan(loginDatetime: org.joda.time.LocalDateTime): Unit = {
        regLoginDatetime(CK_GT,  loginDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (ログイン日時)LOGIN_DATETIME: {+UQ, IX, NotNull, TIMESTAMP(23, 10)}
     * @param loginDatetime The value of loginDatetime as lessThan. (NullAllowed: if null, no condition)
     */
    def setLoginDatetime_LessThan(loginDatetime: org.joda.time.LocalDateTime): Unit = {
        regLoginDatetime(CK_LT,  loginDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (ログイン日時)LOGIN_DATETIME: {+UQ, IX, NotNull, TIMESTAMP(23, 10)}
     * @param loginDatetime The value of loginDatetime as greaterEqual. (NullAllowed: if null, no condition)
     */
    def setLoginDatetime_GreaterEqual(loginDatetime: org.joda.time.LocalDateTime): Unit = {
        regLoginDatetime(CK_GE,  loginDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (ログイン日時)LOGIN_DATETIME: {+UQ, IX, NotNull, TIMESTAMP(23, 10)}
     * @param loginDatetime The value of loginDatetime as lessEqual. (NullAllowed: if null, no condition)
     */
    def setLoginDatetime_LessEqual(loginDatetime: org.joda.time.LocalDateTime): Unit = {
        regLoginDatetime(CK_LE, loginDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (ログイン日時)LOGIN_DATETIME: {+UQ, IX, NotNull, TIMESTAMP(23, 10)}
     * <pre>e.g. setLoginDatetime_FromTo(fromDate, toDate, new <span style="color: #DD4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of loginDatetime. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of loginDatetime. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    def setLoginDatetime_FromTo(fromDatetime: org.joda.time.LocalDateTime, toDatetime: org.joda.time.LocalDateTime)(optionCall: (ScrFromToOption) => Unit): Unit = {
        regFTQ(toTimestamp(fromDatetime), toTimestamp(toDatetime), getCValueLoginDatetime(), "LOGIN_DATETIME", callbackFTOP(optionCall));
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (ログイン日時)LOGIN_DATETIME: {+UQ, IX, NotNull, TIMESTAMP(23, 10)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #DD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of loginDatetime. (NullAllowed: if null, no from-condition)
     * @param toDate The to-date(yyyy/MM/dd) of loginDatetime. (NullAllowed: if null, no to-condition)
     */
    def setLoginDatetime_DateFromTo(fromDate: org.joda.time.LocalDateTime, toDate: org.joda.time.LocalDateTime): Unit = {
        setLoginDatetime_FromTo(fromDate, toDate)(_.compareAsDate);
    }

    protected def regLoginDatetime(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValueLoginDatetime(), "LOGIN_DATETIME"); }
    protected def getCValueLoginDatetime(): ConditionValue;

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * (モバイルログインフラグ)MOBILE_LOGIN_FLG: {NotNull, INTEGER(10), classification=Flg}
     * @param mobileLoginFlg The value of mobileLoginFlg as equal. (NullAllowed: if null, no condition)
     */
    protected def setMobileLoginFlg_Equal(mobileLoginFlg: Int): Unit = {
        doSetMobileLoginFlg_Equal(mobileLoginFlg);
    }

    /**
     * Equal(=). As Flg. And NullIgnored, OnlyOnceRegistered. <br />
     * (モバイルログインフラグ)MOBILE_LOGIN_FLG: {NotNull, INTEGER(10), classification=Flg} <br />
     * general boolean classification for every flg-column
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, no condition)
     */
    def setMobileLoginFlg_Equal_AsFlg(cdef: CDef.Flg): Unit = {
        doSetMobileLoginFlg_Equal(cTNum(if (cdef != null) { cdef.code } else { null }, classOf[Integer]));
    }

    /**
     * Equal(=). As True (1). And NullIgnored, OnlyOnceRegistered. <br />
     * Yes: means valid
     */
    def setMobileLoginFlg_Equal_True(): Unit = {
        setMobileLoginFlg_Equal_AsFlg(CDef.Flg.True);
    }

    /**
     * Equal(=). As False (0). And NullIgnored, OnlyOnceRegistered. <br />
     * No: means invalid
     */
    def setMobileLoginFlg_Equal_False(): Unit = {
        setMobileLoginFlg_Equal_AsFlg(CDef.Flg.False);
    }

    protected def doSetMobileLoginFlg_Equal(mobileLoginFlg: Integer): Unit = {
        regMobileLoginFlg(CK_EQ, mobileLoginFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (モバイルログインフラグ)MOBILE_LOGIN_FLG: {NotNull, INTEGER(10), classification=Flg}
     * @param mobileLoginFlg The value of mobileLoginFlg as notEqual. (NullAllowed: if null, no condition)
     */
    protected def setMobileLoginFlg_NotEqual(mobileLoginFlg: Int): Unit = {
        doSetMobileLoginFlg_NotEqual(mobileLoginFlg);
    }

    /**
     * NotEqual(&lt;&gt;). As Flg. And NullIgnored, OnlyOnceRegistered. <br />
     * (モバイルログインフラグ)MOBILE_LOGIN_FLG: {NotNull, INTEGER(10), classification=Flg} <br />
     * general boolean classification for every flg-column
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, no condition)
     */
    def setMobileLoginFlg_NotEqual_AsFlg(cdef: CDef.Flg): Unit = {
        doSetMobileLoginFlg_NotEqual(cTNum(if (cdef != null) { cdef.code } else { null }, classOf[Integer]));
    }

    /**
     * NotEqual(&lt;&gt;). As True (1). And NullIgnored, OnlyOnceRegistered. <br />
     * Yes: means valid
     */
    def setMobileLoginFlg_NotEqual_True(): Unit = {
        setMobileLoginFlg_NotEqual_AsFlg(CDef.Flg.True);
    }

    /**
     * NotEqual(&lt;&gt;). As False (0). And NullIgnored, OnlyOnceRegistered. <br />
     * No: means invalid
     */
    def setMobileLoginFlg_NotEqual_False(): Unit = {
        setMobileLoginFlg_NotEqual_AsFlg(CDef.Flg.False);
    }

    protected def doSetMobileLoginFlg_NotEqual(mobileLoginFlg: Integer): Unit = {
        regMobileLoginFlg(CK_NES, mobileLoginFlg);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (モバイルログインフラグ)MOBILE_LOGIN_FLG: {NotNull, INTEGER(10), classification=Flg}
     * @param mobileLoginFlgList The collection of mobileLoginFlg as inScope. (NullAllowed: if null (or empty), no condition)
     */
    def setMobileLoginFlg_InScope(mobileLoginFlgList: List[Int]): Unit = {
        doSetMobileLoginFlg_InScope(toMutableValueCollectionImplicitly(mobileLoginFlgList));
    }

    /**
     * InScope {in (1, 2)}. As Flg. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (モバイルログインフラグ)MOBILE_LOGIN_FLG: {NotNull, INTEGER(10), classification=Flg} <br />
     * general boolean classification for every flg-column
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    def setMobileLoginFlg_InScope_AsFlg(cdefList: List[CDef.Flg]): Unit = {
        doSetMobileLoginFlg_InScope(cTNumL(cdefList.asJava, classOf[Integer]));
    }

    protected def doSetMobileLoginFlg_InScope(mobileLoginFlgList: Collection[Integer]): Unit = {
        regINS(CK_INS, cTL(mobileLoginFlgList), getCValueMobileLoginFlg(), "MOBILE_LOGIN_FLG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (モバイルログインフラグ)MOBILE_LOGIN_FLG: {NotNull, INTEGER(10), classification=Flg}
     * @param mobileLoginFlgList The collection of mobileLoginFlg as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    def setMobileLoginFlg_NotInScope(mobileLoginFlgList: List[Int]): Unit = {
        doSetMobileLoginFlg_NotInScope(if (mobileLoginFlgList != null) { mobileLoginFlgList.map(_.asInstanceOf[Integer]).asJava } else { null });
    }

    /**
     * NotInScope {not in (1, 2)}. As Flg. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (モバイルログインフラグ)MOBILE_LOGIN_FLG: {NotNull, INTEGER(10), classification=Flg} <br />
     * general boolean classification for every flg-column
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    def setMobileLoginFlg_NotInScope_AsFlg(cdefList: List[CDef.Flg]): Unit = {
        doSetMobileLoginFlg_NotInScope(cTNumL(cdefList.asJava, classOf[Integer]));
    }

    protected def doSetMobileLoginFlg_NotInScope(mobileLoginFlgList: Collection[Integer]): Unit = {
        regINS(CK_NINS, cTL(mobileLoginFlgList), getCValueMobileLoginFlg(), "MOBILE_LOGIN_FLG");
    }

    protected def regMobileLoginFlg(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValueMobileLoginFlg(), "MOBILE_LOGIN_FLG"); }
    protected def getCValueMobileLoginFlg(): ConditionValue;

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (ログイン時会員ステータスコード)LOGIN_MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus}
     * @param loginMemberStatusCode The value of loginMemberStatusCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    protected def setLoginMemberStatusCode_Equal(loginMemberStatusCode: String): Unit = {
        doSetLoginMemberStatusCode_Equal(fRES(loginMemberStatusCode));
    }

    /**
     * Equal(=). As MemberStatus. And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (ログイン時会員ステータスコード)LOGIN_MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus} <br />
     * status of member from entry to withdrawal
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, no condition)
     */
    def setLoginMemberStatusCode_Equal_AsMemberStatus(cdef: CDef.MemberStatus): Unit = {
        doSetLoginMemberStatusCode_Equal(if (cdef != null) { cdef.code } else { null });
    }

    /**
     * Equal(=). As Formalized (FML). And OnlyOnceRegistered. <br />
     * Formalized: as formal member, allowed to use all service
     */
    def setLoginMemberStatusCode_Equal_Formalized(): Unit = {
        setLoginMemberStatusCode_Equal_AsMemberStatus(CDef.MemberStatus.Formalized);
    }

    /**
     * Equal(=). As Withdrawal (WDL). And OnlyOnceRegistered. <br />
     * Withdrawal: withdrawal is fixed, not allowed to use service
     */
    def setLoginMemberStatusCode_Equal_Withdrawal(): Unit = {
        setLoginMemberStatusCode_Equal_AsMemberStatus(CDef.MemberStatus.Withdrawal);
    }

    /**
     * Equal(=). As Provisional (PRV). And OnlyOnceRegistered. <br />
     * Provisional: first status after entry, allowed to use only part of service
     */
    def setLoginMemberStatusCode_Equal_Provisional(): Unit = {
        setLoginMemberStatusCode_Equal_AsMemberStatus(CDef.MemberStatus.Provisional);
    }

    protected def doSetLoginMemberStatusCode_Equal(loginMemberStatusCode: String): Unit = {
        regLoginMemberStatusCode(CK_EQ, hSC("LOGIN_MEMBER_STATUS_CODE", loginMemberStatusCode, 3, "E"));
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (ログイン時会員ステータスコード)LOGIN_MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus}
     * @param loginMemberStatusCode The value of loginMemberStatusCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    protected def setLoginMemberStatusCode_NotEqual(loginMemberStatusCode: String): Unit = {
        doSetLoginMemberStatusCode_NotEqual(fRES(loginMemberStatusCode));
    }

    /**
     * NotEqual(&lt;&gt;). As MemberStatus. And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (ログイン時会員ステータスコード)LOGIN_MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus} <br />
     * status of member from entry to withdrawal
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, no condition)
     */
    def setLoginMemberStatusCode_NotEqual_AsMemberStatus(cdef: CDef.MemberStatus): Unit = {
        doSetLoginMemberStatusCode_NotEqual(if (cdef != null) { cdef.code } else { null });
    }

    /**
     * NotEqual(&lt;&gt;). As Formalized (FML). And OnlyOnceRegistered. <br />
     * Formalized: as formal member, allowed to use all service
     */
    def setLoginMemberStatusCode_NotEqual_Formalized(): Unit = {
        setLoginMemberStatusCode_NotEqual_AsMemberStatus(CDef.MemberStatus.Formalized);
    }

    /**
     * NotEqual(&lt;&gt;). As Withdrawal (WDL). And OnlyOnceRegistered. <br />
     * Withdrawal: withdrawal is fixed, not allowed to use service
     */
    def setLoginMemberStatusCode_NotEqual_Withdrawal(): Unit = {
        setLoginMemberStatusCode_NotEqual_AsMemberStatus(CDef.MemberStatus.Withdrawal);
    }

    /**
     * NotEqual(&lt;&gt;). As Provisional (PRV). And OnlyOnceRegistered. <br />
     * Provisional: first status after entry, allowed to use only part of service
     */
    def setLoginMemberStatusCode_NotEqual_Provisional(): Unit = {
        setLoginMemberStatusCode_NotEqual_AsMemberStatus(CDef.MemberStatus.Provisional);
    }

    protected def doSetLoginMemberStatusCode_NotEqual(loginMemberStatusCode: String): Unit = {
        regLoginMemberStatusCode(CK_NES, hSC("LOGIN_MEMBER_STATUS_CODE", loginMemberStatusCode, 3, "E"));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (ログイン時会員ステータスコード)LOGIN_MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus}
     * @param loginMemberStatusCodeList The collection of loginMemberStatusCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    def setLoginMemberStatusCode_InScope(loginMemberStatusCodeList: List[String]): Unit = {
        doSetLoginMemberStatusCode_InScope(toMutableValueCollectionImplicitly(loginMemberStatusCodeList));
    }

    /**
     * InScope {in ('a', 'b')}. As MemberStatus. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (ログイン時会員ステータスコード)LOGIN_MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus} <br />
     * status of member from entry to withdrawal
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    def setLoginMemberStatusCode_InScope_AsMemberStatus(cdefList: List[CDef.MemberStatus]): Unit = {
        doSetLoginMemberStatusCode_InScope(cTStrL(cdefList.asJava));
    }

    protected def doSetLoginMemberStatusCode_InScope(loginMemberStatusCodeList: Collection[String]): Unit = {
        regINS(CK_INS, cTL(loginMemberStatusCodeList), getCValueLoginMemberStatusCode(), "LOGIN_MEMBER_STATUS_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (ログイン時会員ステータスコード)LOGIN_MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus}
     * @param loginMemberStatusCodeList The collection of loginMemberStatusCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    def setLoginMemberStatusCode_NotInScope(loginMemberStatusCodeList: List[String]): Unit = {
        doSetLoginMemberStatusCode_NotInScope(if (loginMemberStatusCodeList != null) { loginMemberStatusCodeList.map(_.asInstanceOf[String]).asJava } else { null });
    }

    /**
     * NotInScope {not in ('a', 'b')}. As MemberStatus. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (ログイン時会員ステータスコード)LOGIN_MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus} <br />
     * status of member from entry to withdrawal
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    def setLoginMemberStatusCode_NotInScope_AsMemberStatus(cdefList: List[CDef.MemberStatus]): Unit = {
        doSetLoginMemberStatusCode_NotInScope(cTStrL(cdefList.asJava));
    }

    protected def doSetLoginMemberStatusCode_NotInScope(loginMemberStatusCodeList: Collection[String]): Unit = {
        regINS(CK_NINS, cTL(loginMemberStatusCodeList), getCValueLoginMemberStatusCode(), "LOGIN_MEMBER_STATUS_CODE");
    }

    protected def regLoginMemberStatusCode(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValueLoginMemberStatusCode(), "LOGIN_MEMBER_STATUS_CODE"); }
    protected def getCValueLoginMemberStatusCode(): ConditionValue;

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;MemberLoginCB&gt;() {
     *     public void query(MemberLoginCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_Equal(): ScrHpSSQFunction[MemberLoginCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_EQ, classOf[MemberLoginCB]));
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;MemberLoginCB&gt;() {
     *     public void query(MemberLoginCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_NotEqual(): ScrHpSSQFunction[MemberLoginCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_NES, classOf[MemberLoginCB]));
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;MemberLoginCB&gt;() {
     *     public void query(MemberLoginCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_GreaterThan(): ScrHpSSQFunction[MemberLoginCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_GT, classOf[MemberLoginCB]));
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;MemberLoginCB&gt;() {
     *     public void query(MemberLoginCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_LessThan(): ScrHpSSQFunction[MemberLoginCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_LT, classOf[MemberLoginCB]));
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;MemberLoginCB&gt;() {
     *     public void query(MemberLoginCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_GreaterEqual(): ScrHpSSQFunction[MemberLoginCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_GE, classOf[MemberLoginCB]));
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MemberLoginCB&gt;() {
     *     public void query(MemberLoginCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_LessEqual(): ScrHpSSQFunction[MemberLoginCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_LE, classOf[MemberLoginCB]));
    }

    protected def toScalaSSQFunction(function: HpSSQFunction[MemberLoginCB]): ScrHpSSQFunction[MemberLoginCB] =
    { new ScrHpSSQFunction(function) }

    override protected def xscalarCondition[CB <: ConditionBean](fn: String, sq: SubQuery[CB], rd: String, op: HpSSQOption[CB]): Unit = {
        assertObjectNotNull("subQuery", sq);
        val cb: MemberLoginCB = xcreateScalarConditionCB(); sq.query(cb.asInstanceOf[CB]);
        val pp: String = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean(xcreateScalarConditionPartitionByCB().asInstanceOf[CB]); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    def keepScalarCondition(sq: MemberLoginCQ): String;

    protected def xcreateScalarConditionCB(): MemberLoginCB = {
        val cb: MemberLoginCB = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected def xcreateScalarConditionPartitionByCB(): MemberLoginCB = {
        val cb: MemberLoginCB = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    def xsmyselfDerive(fn: String, sq: SubQuery[MemberLoginCB], al: String, op: DerivedReferrerOption): Unit = {
        assertObjectNotNull("subQuery", sq);
        val cb: MemberLoginCB = new MemberLoginCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        val pp: String = keepSpecifyMyselfDerived(cb.query());
        val pk: String = "MEMBER_LOGIN_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    def keepSpecifyMyselfDerived(sq: MemberLoginCQ): String;

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    def myselfDerived(): ScrHpQDRFunction[MemberLoginCB] = {
        return toScalaQDRFunction(xcreateQDRFunctionMyselfDerived(classOf[MemberLoginCB]));
    }
    override protected def xqderiveMyselfDerived[CB <: ConditionBean](fn: String, sq: SubQuery[CB], rd: String, vl: Object, op: DerivedReferrerOption): Unit = {
        assertObjectNotNull("subQuery", sq);
        val cb: MemberLoginCB = new MemberLoginCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb.asInstanceOf[CB]);
        val pk: String = "MEMBER_LOGIN_ID";
        val sqpp: String = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        val prpp: String = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    def keepQueryMyselfDerived(sq: MemberLoginCQ): String;
    def keepQueryMyselfDerivedParameter(vl: Object): String;

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    def myselfExists(subQuery: (MemberLoginCB) => Unit): Unit = {
        assertObjectNotNull("subQuery", subQuery);
        val cb: MemberLoginCB = new MemberLoginCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery(cb); } finally { unlock(); }
        val pp: String = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    def keepMyselfExists(sq: MemberLoginCQ): String;

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    def myselfInScope(subQuery: (MemberLoginCB) => Unit): Unit = {
        assertObjectNotNull("subQuery", subQuery);
        val cb: MemberLoginCB = new MemberLoginCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery(cb); } finally { unlock(); }
        val pp: String = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    def keepMyselfInScope(sq: MemberLoginCQ): String;

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
    protected def newMyCB(): MemberLoginCB = {
        return new MemberLoginCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected def xabUDT(): String = { return classOf[Date].getName(); }
    protected def xabCQ(): String = { return classOf[MemberLoginCQ].getName(); }
    protected def xabLSO(): String = { return classOf[LikeSearchOption].getName(); }
    protected def xabSSQS(): String = { return classOf[HpSSQSetupper[_]].getName(); }
}
