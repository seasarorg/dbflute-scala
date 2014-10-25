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
 * The abstract condition-query of MEMBER_FOLLOWING.
 * @author DBFlute(AutoGenerator)
 */
abstract class AbstractBsMemberFollowingCQ(referrerQuery: ConditionQuery, sqlClause: SqlClause, aliasName: String, nestLevel: Integer)
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
        return "MEMBER_FOLLOWING";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員フォローイングID)MEMBER_FOLLOWING_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param memberFollowingId The value of memberFollowingId as equal. (NullAllowed: if null, no condition)
     */
    def setMemberFollowingId_Equal(memberFollowingId: Long): Unit = {
        doSetMemberFollowingId_Equal(memberFollowingId);
    }

    protected def doSetMemberFollowingId_Equal(memberFollowingId: Long): Unit = {
        regMemberFollowingId(CK_EQ, memberFollowingId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員フォローイングID)MEMBER_FOLLOWING_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param memberFollowingId The value of memberFollowingId as notEqual. (NullAllowed: if null, no condition)
     */
    def setMemberFollowingId_NotEqual(memberFollowingId: Long): Unit = {
        doSetMemberFollowingId_NotEqual(memberFollowingId);
    }

    protected def doSetMemberFollowingId_NotEqual(memberFollowingId: Long): Unit = {
        regMemberFollowingId(CK_NES, memberFollowingId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員フォローイングID)MEMBER_FOLLOWING_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param memberFollowingId The value of memberFollowingId as greaterThan. (NullAllowed: if null, no condition)
     */
    def setMemberFollowingId_GreaterThan(memberFollowingId: Long): Unit = {
        regMemberFollowingId(CK_GT, memberFollowingId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員フォローイングID)MEMBER_FOLLOWING_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param memberFollowingId The value of memberFollowingId as lessThan. (NullAllowed: if null, no condition)
     */
    def setMemberFollowingId_LessThan(memberFollowingId: Long): Unit = {
        regMemberFollowingId(CK_LT, memberFollowingId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員フォローイングID)MEMBER_FOLLOWING_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param memberFollowingId The value of memberFollowingId as greaterEqual. (NullAllowed: if null, no condition)
     */
    def setMemberFollowingId_GreaterEqual(memberFollowingId: Long): Unit = {
        regMemberFollowingId(CK_GE, memberFollowingId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員フォローイングID)MEMBER_FOLLOWING_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param memberFollowingId The value of memberFollowingId as lessEqual. (NullAllowed: if null, no condition)
     */
    def setMemberFollowingId_LessEqual(memberFollowingId: Long): Unit = {
        regMemberFollowingId(CK_LE, memberFollowingId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (会員フォローイングID)MEMBER_FOLLOWING_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of memberFollowingId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of memberFollowingId. (NullAllowed: if null, no to-condition)
     * @param optionCall The callback for option of range-of. (NotNull)
     */
    def setMemberFollowingId_RangeOf(minNumber: Long, maxNumber: Long)(optionCall: (RangeOfOption) => Unit): Unit = {
        regROO(minNumber, maxNumber, getCValueMemberFollowingId(), "MEMBER_FOLLOWING_ID", callbackROOP(optionCall));
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (会員フォローイングID)MEMBER_FOLLOWING_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param memberFollowingIdList The collection of memberFollowingId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    def setMemberFollowingId_InScope(memberFollowingIdList: List[Long]): Unit = {
        doSetMemberFollowingId_InScope(toMutableValueCollectionImplicitly(memberFollowingIdList));
    }

    protected def doSetMemberFollowingId_InScope(memberFollowingIdList: Collection[Long]): Unit = {
        regINS(CK_INS, cTL(memberFollowingIdList), getCValueMemberFollowingId(), "MEMBER_FOLLOWING_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (会員フォローイングID)MEMBER_FOLLOWING_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param memberFollowingIdList The collection of memberFollowingId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    def setMemberFollowingId_NotInScope(memberFollowingIdList: List[Long]): Unit = {
        doSetMemberFollowingId_NotInScope(if (memberFollowingIdList != null) { memberFollowingIdList.map(_.asInstanceOf[Long]).asJava } else { null });
    }

    protected def doSetMemberFollowingId_NotInScope(memberFollowingIdList: Collection[Long]): Unit = {
        regINS(CK_NINS, cTL(memberFollowingIdList), getCValueMemberFollowingId(), "MEMBER_FOLLOWING_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * (会員フォローイングID)MEMBER_FOLLOWING_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    def setMemberFollowingId_IsNull(): Unit = { regMemberFollowingId(CK_ISN, AbstractConditionQuery.DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * (会員フォローイングID)MEMBER_FOLLOWING_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    def setMemberFollowingId_IsNotNull(): Unit = { regMemberFollowingId(CK_ISNN, AbstractConditionQuery.DOBJ); }

    protected def regMemberFollowingId(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValueMemberFollowingId(), "MEMBER_FOLLOWING_ID"); }
    protected def getCValueMemberFollowingId(): ConditionValue;

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * (わたし)MY_MEMBER_ID: {UQ+, IX+, NotNull, INTEGER(10), FK to MEMBER}
     * @param myMemberId The value of myMemberId as equal. (NullAllowed: if null, no condition)
     */
    def setMyMemberId_Equal(myMemberId: Int): Unit = {
        doSetMyMemberId_Equal(myMemberId);
    }

    protected def doSetMyMemberId_Equal(myMemberId: Integer): Unit = {
        regMyMemberId(CK_EQ, myMemberId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (わたし)MY_MEMBER_ID: {UQ+, IX+, NotNull, INTEGER(10), FK to MEMBER}
     * @param myMemberId The value of myMemberId as notEqual. (NullAllowed: if null, no condition)
     */
    def setMyMemberId_NotEqual(myMemberId: Int): Unit = {
        doSetMyMemberId_NotEqual(myMemberId);
    }

    protected def doSetMyMemberId_NotEqual(myMemberId: Integer): Unit = {
        regMyMemberId(CK_NES, myMemberId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (わたし)MY_MEMBER_ID: {UQ+, IX+, NotNull, INTEGER(10), FK to MEMBER}
     * @param myMemberId The value of myMemberId as greaterThan. (NullAllowed: if null, no condition)
     */
    def setMyMemberId_GreaterThan(myMemberId: Int): Unit = {
        regMyMemberId(CK_GT, myMemberId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (わたし)MY_MEMBER_ID: {UQ+, IX+, NotNull, INTEGER(10), FK to MEMBER}
     * @param myMemberId The value of myMemberId as lessThan. (NullAllowed: if null, no condition)
     */
    def setMyMemberId_LessThan(myMemberId: Int): Unit = {
        regMyMemberId(CK_LT, myMemberId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (わたし)MY_MEMBER_ID: {UQ+, IX+, NotNull, INTEGER(10), FK to MEMBER}
     * @param myMemberId The value of myMemberId as greaterEqual. (NullAllowed: if null, no condition)
     */
    def setMyMemberId_GreaterEqual(myMemberId: Int): Unit = {
        regMyMemberId(CK_GE, myMemberId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (わたし)MY_MEMBER_ID: {UQ+, IX+, NotNull, INTEGER(10), FK to MEMBER}
     * @param myMemberId The value of myMemberId as lessEqual. (NullAllowed: if null, no condition)
     */
    def setMyMemberId_LessEqual(myMemberId: Int): Unit = {
        regMyMemberId(CK_LE, myMemberId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (わたし)MY_MEMBER_ID: {UQ+, IX+, NotNull, INTEGER(10), FK to MEMBER}
     * @param minNumber The min number of myMemberId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of myMemberId. (NullAllowed: if null, no to-condition)
     * @param optionCall The callback for option of range-of. (NotNull)
     */
    def setMyMemberId_RangeOf(minNumber: Int, maxNumber: Int)(optionCall: (RangeOfOption) => Unit): Unit = {
        regROO(minNumber, maxNumber, getCValueMyMemberId(), "MY_MEMBER_ID", callbackROOP(optionCall));
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (わたし)MY_MEMBER_ID: {UQ+, IX+, NotNull, INTEGER(10), FK to MEMBER}
     * @param myMemberIdList The collection of myMemberId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    def setMyMemberId_InScope(myMemberIdList: List[Int]): Unit = {
        doSetMyMemberId_InScope(toMutableValueCollectionImplicitly(myMemberIdList));
    }

    protected def doSetMyMemberId_InScope(myMemberIdList: Collection[Integer]): Unit = {
        regINS(CK_INS, cTL(myMemberIdList), getCValueMyMemberId(), "MY_MEMBER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (わたし)MY_MEMBER_ID: {UQ+, IX+, NotNull, INTEGER(10), FK to MEMBER}
     * @param myMemberIdList The collection of myMemberId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    def setMyMemberId_NotInScope(myMemberIdList: List[Int]): Unit = {
        doSetMyMemberId_NotInScope(if (myMemberIdList != null) { myMemberIdList.map(_.asInstanceOf[Integer]).asJava } else { null });
    }

    protected def doSetMyMemberId_NotInScope(myMemberIdList: Collection[Integer]): Unit = {
        regINS(CK_NINS, cTL(myMemberIdList), getCValueMyMemberId(), "MY_MEMBER_ID");
    }

    protected def regMyMemberId(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValueMyMemberId(), "MY_MEMBER_ID"); }
    protected def getCValueMyMemberId(): ConditionValue;

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * (あなた)YOUR_MEMBER_ID: {+UQ, IX+, NotNull, INTEGER(10), FK to MEMBER}
     * @param yourMemberId The value of yourMemberId as equal. (NullAllowed: if null, no condition)
     */
    def setYourMemberId_Equal(yourMemberId: Int): Unit = {
        doSetYourMemberId_Equal(yourMemberId);
    }

    protected def doSetYourMemberId_Equal(yourMemberId: Integer): Unit = {
        regYourMemberId(CK_EQ, yourMemberId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (あなた)YOUR_MEMBER_ID: {+UQ, IX+, NotNull, INTEGER(10), FK to MEMBER}
     * @param yourMemberId The value of yourMemberId as notEqual. (NullAllowed: if null, no condition)
     */
    def setYourMemberId_NotEqual(yourMemberId: Int): Unit = {
        doSetYourMemberId_NotEqual(yourMemberId);
    }

    protected def doSetYourMemberId_NotEqual(yourMemberId: Integer): Unit = {
        regYourMemberId(CK_NES, yourMemberId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (あなた)YOUR_MEMBER_ID: {+UQ, IX+, NotNull, INTEGER(10), FK to MEMBER}
     * @param yourMemberId The value of yourMemberId as greaterThan. (NullAllowed: if null, no condition)
     */
    def setYourMemberId_GreaterThan(yourMemberId: Int): Unit = {
        regYourMemberId(CK_GT, yourMemberId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (あなた)YOUR_MEMBER_ID: {+UQ, IX+, NotNull, INTEGER(10), FK to MEMBER}
     * @param yourMemberId The value of yourMemberId as lessThan. (NullAllowed: if null, no condition)
     */
    def setYourMemberId_LessThan(yourMemberId: Int): Unit = {
        regYourMemberId(CK_LT, yourMemberId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (あなた)YOUR_MEMBER_ID: {+UQ, IX+, NotNull, INTEGER(10), FK to MEMBER}
     * @param yourMemberId The value of yourMemberId as greaterEqual. (NullAllowed: if null, no condition)
     */
    def setYourMemberId_GreaterEqual(yourMemberId: Int): Unit = {
        regYourMemberId(CK_GE, yourMemberId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (あなた)YOUR_MEMBER_ID: {+UQ, IX+, NotNull, INTEGER(10), FK to MEMBER}
     * @param yourMemberId The value of yourMemberId as lessEqual. (NullAllowed: if null, no condition)
     */
    def setYourMemberId_LessEqual(yourMemberId: Int): Unit = {
        regYourMemberId(CK_LE, yourMemberId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (あなた)YOUR_MEMBER_ID: {+UQ, IX+, NotNull, INTEGER(10), FK to MEMBER}
     * @param minNumber The min number of yourMemberId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of yourMemberId. (NullAllowed: if null, no to-condition)
     * @param optionCall The callback for option of range-of. (NotNull)
     */
    def setYourMemberId_RangeOf(minNumber: Int, maxNumber: Int)(optionCall: (RangeOfOption) => Unit): Unit = {
        regROO(minNumber, maxNumber, getCValueYourMemberId(), "YOUR_MEMBER_ID", callbackROOP(optionCall));
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (あなた)YOUR_MEMBER_ID: {+UQ, IX+, NotNull, INTEGER(10), FK to MEMBER}
     * @param yourMemberIdList The collection of yourMemberId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    def setYourMemberId_InScope(yourMemberIdList: List[Int]): Unit = {
        doSetYourMemberId_InScope(toMutableValueCollectionImplicitly(yourMemberIdList));
    }

    protected def doSetYourMemberId_InScope(yourMemberIdList: Collection[Integer]): Unit = {
        regINS(CK_INS, cTL(yourMemberIdList), getCValueYourMemberId(), "YOUR_MEMBER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (あなた)YOUR_MEMBER_ID: {+UQ, IX+, NotNull, INTEGER(10), FK to MEMBER}
     * @param yourMemberIdList The collection of yourMemberId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    def setYourMemberId_NotInScope(yourMemberIdList: List[Int]): Unit = {
        doSetYourMemberId_NotInScope(if (yourMemberIdList != null) { yourMemberIdList.map(_.asInstanceOf[Integer]).asJava } else { null });
    }

    protected def doSetYourMemberId_NotInScope(yourMemberIdList: Collection[Integer]): Unit = {
        regINS(CK_NINS, cTL(yourMemberIdList), getCValueYourMemberId(), "YOUR_MEMBER_ID");
    }

    protected def regYourMemberId(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValueYourMemberId(), "YOUR_MEMBER_ID"); }
    protected def getCValueYourMemberId(): ConditionValue;

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * (その瞬間)FOLLOW_DATETIME: {IX, NotNull, TIMESTAMP(23, 10)}
     * @param followDatetime The value of followDatetime as equal. (NullAllowed: if null, no condition)
     */
    def setFollowDatetime_Equal(followDatetime: org.joda.time.LocalDateTime): Unit = {
        regFollowDatetime(CK_EQ,  followDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (その瞬間)FOLLOW_DATETIME: {IX, NotNull, TIMESTAMP(23, 10)}
     * @param followDatetime The value of followDatetime as greaterThan. (NullAllowed: if null, no condition)
     */
    def setFollowDatetime_GreaterThan(followDatetime: org.joda.time.LocalDateTime): Unit = {
        regFollowDatetime(CK_GT,  followDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (その瞬間)FOLLOW_DATETIME: {IX, NotNull, TIMESTAMP(23, 10)}
     * @param followDatetime The value of followDatetime as lessThan. (NullAllowed: if null, no condition)
     */
    def setFollowDatetime_LessThan(followDatetime: org.joda.time.LocalDateTime): Unit = {
        regFollowDatetime(CK_LT,  followDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (その瞬間)FOLLOW_DATETIME: {IX, NotNull, TIMESTAMP(23, 10)}
     * @param followDatetime The value of followDatetime as greaterEqual. (NullAllowed: if null, no condition)
     */
    def setFollowDatetime_GreaterEqual(followDatetime: org.joda.time.LocalDateTime): Unit = {
        regFollowDatetime(CK_GE,  followDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (その瞬間)FOLLOW_DATETIME: {IX, NotNull, TIMESTAMP(23, 10)}
     * @param followDatetime The value of followDatetime as lessEqual. (NullAllowed: if null, no condition)
     */
    def setFollowDatetime_LessEqual(followDatetime: org.joda.time.LocalDateTime): Unit = {
        regFollowDatetime(CK_LE, followDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (その瞬間)FOLLOW_DATETIME: {IX, NotNull, TIMESTAMP(23, 10)}
     * <pre>e.g. setFollowDatetime_FromTo(fromDate, toDate, new <span style="color: #DD4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of followDatetime. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of followDatetime. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    def setFollowDatetime_FromTo(fromDatetime: org.joda.time.LocalDateTime, toDatetime: org.joda.time.LocalDateTime)(optionCall: (ScrFromToOption) => Unit): Unit = {
        regFTQ(toTimestamp(fromDatetime), toTimestamp(toDatetime), getCValueFollowDatetime(), "FOLLOW_DATETIME", callbackFTOP(optionCall));
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (その瞬間)FOLLOW_DATETIME: {IX, NotNull, TIMESTAMP(23, 10)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #DD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of followDatetime. (NullAllowed: if null, no from-condition)
     * @param toDate The to-date(yyyy/MM/dd) of followDatetime. (NullAllowed: if null, no to-condition)
     */
    def setFollowDatetime_DateFromTo(fromDate: org.joda.time.LocalDateTime, toDate: org.joda.time.LocalDateTime): Unit = {
        setFollowDatetime_FromTo(fromDate, toDate)(_.compareAsDate);
    }

    protected def regFollowDatetime(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValueFollowDatetime(), "FOLLOW_DATETIME"); }
    protected def getCValueFollowDatetime(): ConditionValue;

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;MemberFollowingCB&gt;() {
     *     public void query(MemberFollowingCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_Equal(): ScrHpSSQFunction[MemberFollowingCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_EQ, classOf[MemberFollowingCB]));
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;MemberFollowingCB&gt;() {
     *     public void query(MemberFollowingCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_NotEqual(): ScrHpSSQFunction[MemberFollowingCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_NES, classOf[MemberFollowingCB]));
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;MemberFollowingCB&gt;() {
     *     public void query(MemberFollowingCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_GreaterThan(): ScrHpSSQFunction[MemberFollowingCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_GT, classOf[MemberFollowingCB]));
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;MemberFollowingCB&gt;() {
     *     public void query(MemberFollowingCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_LessThan(): ScrHpSSQFunction[MemberFollowingCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_LT, classOf[MemberFollowingCB]));
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;MemberFollowingCB&gt;() {
     *     public void query(MemberFollowingCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_GreaterEqual(): ScrHpSSQFunction[MemberFollowingCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_GE, classOf[MemberFollowingCB]));
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MemberFollowingCB&gt;() {
     *     public void query(MemberFollowingCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_LessEqual(): ScrHpSSQFunction[MemberFollowingCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_LE, classOf[MemberFollowingCB]));
    }

    protected def toScalaSSQFunction(function: HpSSQFunction[MemberFollowingCB]): ScrHpSSQFunction[MemberFollowingCB] =
    { new ScrHpSSQFunction(function) }

    override protected def xscalarCondition[CB <: ConditionBean](fn: String, sq: SubQuery[CB], rd: String, op: HpSSQOption[CB]): Unit = {
        assertObjectNotNull("subQuery", sq);
        val cb: MemberFollowingCB = xcreateScalarConditionCB(); sq.query(cb.asInstanceOf[CB]);
        val pp: String = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean(xcreateScalarConditionPartitionByCB().asInstanceOf[CB]); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    def keepScalarCondition(sq: MemberFollowingCQ): String;

    protected def xcreateScalarConditionCB(): MemberFollowingCB = {
        val cb: MemberFollowingCB = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected def xcreateScalarConditionPartitionByCB(): MemberFollowingCB = {
        val cb: MemberFollowingCB = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    def xsmyselfDerive(fn: String, sq: SubQuery[MemberFollowingCB], al: String, op: DerivedReferrerOption): Unit = {
        assertObjectNotNull("subQuery", sq);
        val cb: MemberFollowingCB = new MemberFollowingCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        val pp: String = keepSpecifyMyselfDerived(cb.query());
        val pk: String = "MEMBER_FOLLOWING_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    def keepSpecifyMyselfDerived(sq: MemberFollowingCQ): String;

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    def myselfDerived(): ScrHpQDRFunction[MemberFollowingCB] = {
        return toScalaQDRFunction(xcreateQDRFunctionMyselfDerived(classOf[MemberFollowingCB]));
    }
    override protected def xqderiveMyselfDerived[CB <: ConditionBean](fn: String, sq: SubQuery[CB], rd: String, vl: Object, op: DerivedReferrerOption): Unit = {
        assertObjectNotNull("subQuery", sq);
        val cb: MemberFollowingCB = new MemberFollowingCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb.asInstanceOf[CB]);
        val pk: String = "MEMBER_FOLLOWING_ID";
        val sqpp: String = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        val prpp: String = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    def keepQueryMyselfDerived(sq: MemberFollowingCQ): String;
    def keepQueryMyselfDerivedParameter(vl: Object): String;

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    def myselfExists(subQuery: (MemberFollowingCB) => Unit): Unit = {
        assertObjectNotNull("subQuery", subQuery);
        val cb: MemberFollowingCB = new MemberFollowingCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery(cb); } finally { unlock(); }
        val pp: String = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    def keepMyselfExists(sq: MemberFollowingCQ): String;

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    def myselfInScope(subQuery: (MemberFollowingCB) => Unit): Unit = {
        assertObjectNotNull("subQuery", subQuery);
        val cb: MemberFollowingCB = new MemberFollowingCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery(cb); } finally { unlock(); }
        val pp: String = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    def keepMyselfInScope(sq: MemberFollowingCQ): String;

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
    protected def newMyCB(): MemberFollowingCB = {
        return new MemberFollowingCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected def xabUDT(): String = { return classOf[Date].getName(); }
    protected def xabCQ(): String = { return classOf[MemberFollowingCQ].getName(); }
    protected def xabLSO(): String = { return classOf[LikeSearchOption].getName(); }
    protected def xabSSQS(): String = { return classOf[HpSSQSetupper[_]].getName(); }
}
