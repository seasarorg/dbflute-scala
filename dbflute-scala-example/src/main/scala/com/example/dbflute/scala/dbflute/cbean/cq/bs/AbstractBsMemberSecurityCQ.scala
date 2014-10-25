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
 * The abstract condition-query of MEMBER_SECURITY.
 * @author DBFlute(AutoGenerator)
 */
abstract class AbstractBsMemberSecurityCQ(referrerQuery: ConditionQuery, sqlClause: SqlClause, aliasName: String, nestLevel: Integer)
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
        return "MEMBER_SECURITY";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ID)MEMBER_ID: {PK, NotNull, INTEGER(10), FK to MEMBER}
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
     * (会員ID)MEMBER_ID: {PK, NotNull, INTEGER(10), FK to MEMBER}
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
     * (会員ID)MEMBER_ID: {PK, NotNull, INTEGER(10), FK to MEMBER}
     * @param memberId The value of memberId as greaterThan. (NullAllowed: if null, no condition)
     */
    def setMemberId_GreaterThan(memberId: Int): Unit = {
        regMemberId(CK_GT, memberId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ID)MEMBER_ID: {PK, NotNull, INTEGER(10), FK to MEMBER}
     * @param memberId The value of memberId as lessThan. (NullAllowed: if null, no condition)
     */
    def setMemberId_LessThan(memberId: Int): Unit = {
        regMemberId(CK_LT, memberId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ID)MEMBER_ID: {PK, NotNull, INTEGER(10), FK to MEMBER}
     * @param memberId The value of memberId as greaterEqual. (NullAllowed: if null, no condition)
     */
    def setMemberId_GreaterEqual(memberId: Int): Unit = {
        regMemberId(CK_GE, memberId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ID)MEMBER_ID: {PK, NotNull, INTEGER(10), FK to MEMBER}
     * @param memberId The value of memberId as lessEqual. (NullAllowed: if null, no condition)
     */
    def setMemberId_LessEqual(memberId: Int): Unit = {
        regMemberId(CK_LE, memberId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ID)MEMBER_ID: {PK, NotNull, INTEGER(10), FK to MEMBER}
     * @param minNumber The min number of memberId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of memberId. (NullAllowed: if null, no to-condition)
     * @param optionCall The callback for option of range-of. (NotNull)
     */
    def setMemberId_RangeOf(minNumber: Int, maxNumber: Int)(optionCall: (RangeOfOption) => Unit): Unit = {
        regROO(minNumber, maxNumber, getCValueMemberId(), "MEMBER_ID", callbackROOP(optionCall));
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (会員ID)MEMBER_ID: {PK, NotNull, INTEGER(10), FK to MEMBER}
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
     * (会員ID)MEMBER_ID: {PK, NotNull, INTEGER(10), FK to MEMBER}
     * @param memberIdList The collection of memberId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    def setMemberId_NotInScope(memberIdList: List[Int]): Unit = {
        doSetMemberId_NotInScope(if (memberIdList != null) { memberIdList.map(_.asInstanceOf[Integer]).asJava } else { null });
    }

    protected def doSetMemberId_NotInScope(memberIdList: Collection[Integer]): Unit = {
        regINS(CK_NINS, cTL(memberIdList), getCValueMemberId(), "MEMBER_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * (会員ID)MEMBER_ID: {PK, NotNull, INTEGER(10), FK to MEMBER}
     */
    def setMemberId_IsNull(): Unit = { regMemberId(CK_ISN, AbstractConditionQuery.DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * (会員ID)MEMBER_ID: {PK, NotNull, INTEGER(10), FK to MEMBER}
     */
    def setMemberId_IsNotNull(): Unit = { regMemberId(CK_ISNN, AbstractConditionQuery.DOBJ); }

    protected def regMemberId(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValueMemberId(), "MEMBER_ID"); }
    protected def getCValueMemberId(): ConditionValue;

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (ログインパスワード)LOGIN_PASSWORD: {NotNull, VARCHAR(50)}
     * @param loginPassword The value of loginPassword as equal. (NullAllowed: if null (or empty), no condition)
     */
    def setLoginPassword_Equal(loginPassword: String): Unit = {
        doSetLoginPassword_Equal(fRES(loginPassword));
    }

    protected def doSetLoginPassword_Equal(loginPassword: String): Unit = {
        regLoginPassword(CK_EQ, loginPassword);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (ログインパスワード)LOGIN_PASSWORD: {NotNull, VARCHAR(50)}
     * @param loginPassword The value of loginPassword as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    def setLoginPassword_NotEqual(loginPassword: String): Unit = {
        doSetLoginPassword_NotEqual(fRES(loginPassword));
    }

    protected def doSetLoginPassword_NotEqual(loginPassword: String): Unit = {
        regLoginPassword(CK_NES, loginPassword);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (ログインパスワード)LOGIN_PASSWORD: {NotNull, VARCHAR(50)}
     * @param loginPasswordList The collection of loginPassword as inScope. (NullAllowed: if null (or empty), no condition)
     */
    def setLoginPassword_InScope(loginPasswordList: List[String]): Unit = {
        doSetLoginPassword_InScope(toMutableValueCollectionImplicitly(loginPasswordList));
    }

    protected def doSetLoginPassword_InScope(loginPasswordList: Collection[String]): Unit = {
        regINS(CK_INS, cTL(loginPasswordList), getCValueLoginPassword(), "LOGIN_PASSWORD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (ログインパスワード)LOGIN_PASSWORD: {NotNull, VARCHAR(50)}
     * @param loginPasswordList The collection of loginPassword as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    def setLoginPassword_NotInScope(loginPasswordList: List[String]): Unit = {
        doSetLoginPassword_NotInScope(if (loginPasswordList != null) { loginPasswordList.map(_.asInstanceOf[String]).asJava } else { null });
    }

    protected def doSetLoginPassword_NotInScope(loginPasswordList: Collection[String]): Unit = {
        regINS(CK_NINS, cTL(loginPasswordList), getCValueLoginPassword(), "LOGIN_PASSWORD");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (ログインパスワード)LOGIN_PASSWORD: {NotNull, VARCHAR(50)}
     * @param loginPassword The value of loginPassword as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    def setLoginPassword_PrefixSearch(loginPassword: String): Unit = {
        setLoginPassword_LikeSearch(loginPassword)(_.likePrefix);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (ログインパスワード)LOGIN_PASSWORD: {NotNull, VARCHAR(50)} <br />
     * <pre>e.g. setLoginPassword_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param loginPassword The value of loginPassword as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param optionCall The callback for option of like-search. (NotNull)
     */
    def setLoginPassword_LikeSearch(loginPassword: String)(optionCall: (ScrLikeSearchOption) => Unit): Unit = {
        regLSQ(CK_LS, fRES(loginPassword), getCValueLoginPassword(), "LOGIN_PASSWORD", callbackLSOP(optionCall));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (ログインパスワード)LOGIN_PASSWORD: {NotNull, VARCHAR(50)}
     * @param loginPassword The value of loginPassword as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param optionCall The callback for option of not-like-search. (NotNull)
     */
    def setLoginPassword_NotLikeSearch(loginPassword: String)(optionCall: (ScrLikeSearchOption) => Unit): Unit = {
        regLSQ(CK_NLS, fRES(loginPassword), getCValueLoginPassword(), "LOGIN_PASSWORD", callbackLSOP(optionCall));
    }

    protected def regLoginPassword(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValueLoginPassword(), "LOGIN_PASSWORD"); }
    protected def getCValueLoginPassword(): ConditionValue;

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (リマインダ質問)REMINDER_QUESTION: {NotNull, VARCHAR(50)}
     * @param reminderQuestion The value of reminderQuestion as equal. (NullAllowed: if null (or empty), no condition)
     */
    def setReminderQuestion_Equal(reminderQuestion: String): Unit = {
        doSetReminderQuestion_Equal(fRES(reminderQuestion));
    }

    protected def doSetReminderQuestion_Equal(reminderQuestion: String): Unit = {
        regReminderQuestion(CK_EQ, reminderQuestion);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (リマインダ質問)REMINDER_QUESTION: {NotNull, VARCHAR(50)}
     * @param reminderQuestion The value of reminderQuestion as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    def setReminderQuestion_NotEqual(reminderQuestion: String): Unit = {
        doSetReminderQuestion_NotEqual(fRES(reminderQuestion));
    }

    protected def doSetReminderQuestion_NotEqual(reminderQuestion: String): Unit = {
        regReminderQuestion(CK_NES, reminderQuestion);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (リマインダ質問)REMINDER_QUESTION: {NotNull, VARCHAR(50)}
     * @param reminderQuestionList The collection of reminderQuestion as inScope. (NullAllowed: if null (or empty), no condition)
     */
    def setReminderQuestion_InScope(reminderQuestionList: List[String]): Unit = {
        doSetReminderQuestion_InScope(toMutableValueCollectionImplicitly(reminderQuestionList));
    }

    protected def doSetReminderQuestion_InScope(reminderQuestionList: Collection[String]): Unit = {
        regINS(CK_INS, cTL(reminderQuestionList), getCValueReminderQuestion(), "REMINDER_QUESTION");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (リマインダ質問)REMINDER_QUESTION: {NotNull, VARCHAR(50)}
     * @param reminderQuestionList The collection of reminderQuestion as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    def setReminderQuestion_NotInScope(reminderQuestionList: List[String]): Unit = {
        doSetReminderQuestion_NotInScope(if (reminderQuestionList != null) { reminderQuestionList.map(_.asInstanceOf[String]).asJava } else { null });
    }

    protected def doSetReminderQuestion_NotInScope(reminderQuestionList: Collection[String]): Unit = {
        regINS(CK_NINS, cTL(reminderQuestionList), getCValueReminderQuestion(), "REMINDER_QUESTION");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (リマインダ質問)REMINDER_QUESTION: {NotNull, VARCHAR(50)}
     * @param reminderQuestion The value of reminderQuestion as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    def setReminderQuestion_PrefixSearch(reminderQuestion: String): Unit = {
        setReminderQuestion_LikeSearch(reminderQuestion)(_.likePrefix);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (リマインダ質問)REMINDER_QUESTION: {NotNull, VARCHAR(50)} <br />
     * <pre>e.g. setReminderQuestion_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param reminderQuestion The value of reminderQuestion as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param optionCall The callback for option of like-search. (NotNull)
     */
    def setReminderQuestion_LikeSearch(reminderQuestion: String)(optionCall: (ScrLikeSearchOption) => Unit): Unit = {
        regLSQ(CK_LS, fRES(reminderQuestion), getCValueReminderQuestion(), "REMINDER_QUESTION", callbackLSOP(optionCall));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (リマインダ質問)REMINDER_QUESTION: {NotNull, VARCHAR(50)}
     * @param reminderQuestion The value of reminderQuestion as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param optionCall The callback for option of not-like-search. (NotNull)
     */
    def setReminderQuestion_NotLikeSearch(reminderQuestion: String)(optionCall: (ScrLikeSearchOption) => Unit): Unit = {
        regLSQ(CK_NLS, fRES(reminderQuestion), getCValueReminderQuestion(), "REMINDER_QUESTION", callbackLSOP(optionCall));
    }

    protected def regReminderQuestion(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValueReminderQuestion(), "REMINDER_QUESTION"); }
    protected def getCValueReminderQuestion(): ConditionValue;

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (リマインダ回答)REMINDER_ANSWER: {NotNull, VARCHAR(50)}
     * @param reminderAnswer The value of reminderAnswer as equal. (NullAllowed: if null (or empty), no condition)
     */
    def setReminderAnswer_Equal(reminderAnswer: String): Unit = {
        doSetReminderAnswer_Equal(fRES(reminderAnswer));
    }

    protected def doSetReminderAnswer_Equal(reminderAnswer: String): Unit = {
        regReminderAnswer(CK_EQ, reminderAnswer);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (リマインダ回答)REMINDER_ANSWER: {NotNull, VARCHAR(50)}
     * @param reminderAnswer The value of reminderAnswer as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    def setReminderAnswer_NotEqual(reminderAnswer: String): Unit = {
        doSetReminderAnswer_NotEqual(fRES(reminderAnswer));
    }

    protected def doSetReminderAnswer_NotEqual(reminderAnswer: String): Unit = {
        regReminderAnswer(CK_NES, reminderAnswer);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (リマインダ回答)REMINDER_ANSWER: {NotNull, VARCHAR(50)}
     * @param reminderAnswerList The collection of reminderAnswer as inScope. (NullAllowed: if null (or empty), no condition)
     */
    def setReminderAnswer_InScope(reminderAnswerList: List[String]): Unit = {
        doSetReminderAnswer_InScope(toMutableValueCollectionImplicitly(reminderAnswerList));
    }

    protected def doSetReminderAnswer_InScope(reminderAnswerList: Collection[String]): Unit = {
        regINS(CK_INS, cTL(reminderAnswerList), getCValueReminderAnswer(), "REMINDER_ANSWER");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (リマインダ回答)REMINDER_ANSWER: {NotNull, VARCHAR(50)}
     * @param reminderAnswerList The collection of reminderAnswer as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    def setReminderAnswer_NotInScope(reminderAnswerList: List[String]): Unit = {
        doSetReminderAnswer_NotInScope(if (reminderAnswerList != null) { reminderAnswerList.map(_.asInstanceOf[String]).asJava } else { null });
    }

    protected def doSetReminderAnswer_NotInScope(reminderAnswerList: Collection[String]): Unit = {
        regINS(CK_NINS, cTL(reminderAnswerList), getCValueReminderAnswer(), "REMINDER_ANSWER");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (リマインダ回答)REMINDER_ANSWER: {NotNull, VARCHAR(50)}
     * @param reminderAnswer The value of reminderAnswer as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    def setReminderAnswer_PrefixSearch(reminderAnswer: String): Unit = {
        setReminderAnswer_LikeSearch(reminderAnswer)(_.likePrefix);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (リマインダ回答)REMINDER_ANSWER: {NotNull, VARCHAR(50)} <br />
     * <pre>e.g. setReminderAnswer_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param reminderAnswer The value of reminderAnswer as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param optionCall The callback for option of like-search. (NotNull)
     */
    def setReminderAnswer_LikeSearch(reminderAnswer: String)(optionCall: (ScrLikeSearchOption) => Unit): Unit = {
        regLSQ(CK_LS, fRES(reminderAnswer), getCValueReminderAnswer(), "REMINDER_ANSWER", callbackLSOP(optionCall));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (リマインダ回答)REMINDER_ANSWER: {NotNull, VARCHAR(50)}
     * @param reminderAnswer The value of reminderAnswer as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param optionCall The callback for option of not-like-search. (NotNull)
     */
    def setReminderAnswer_NotLikeSearch(reminderAnswer: String)(optionCall: (ScrLikeSearchOption) => Unit): Unit = {
        regLSQ(CK_NLS, fRES(reminderAnswer), getCValueReminderAnswer(), "REMINDER_ANSWER", callbackLSOP(optionCall));
    }

    protected def regReminderAnswer(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValueReminderAnswer(), "REMINDER_ANSWER"); }
    protected def getCValueReminderAnswer(): ConditionValue;

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * (リマインダ利用回数)REMINDER_USE_COUNT: {NotNull, INTEGER(10)}
     * @param reminderUseCount The value of reminderUseCount as equal. (NullAllowed: if null, no condition)
     */
    def setReminderUseCount_Equal(reminderUseCount: Int): Unit = {
        doSetReminderUseCount_Equal(reminderUseCount);
    }

    protected def doSetReminderUseCount_Equal(reminderUseCount: Integer): Unit = {
        regReminderUseCount(CK_EQ, reminderUseCount);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (リマインダ利用回数)REMINDER_USE_COUNT: {NotNull, INTEGER(10)}
     * @param reminderUseCount The value of reminderUseCount as notEqual. (NullAllowed: if null, no condition)
     */
    def setReminderUseCount_NotEqual(reminderUseCount: Int): Unit = {
        doSetReminderUseCount_NotEqual(reminderUseCount);
    }

    protected def doSetReminderUseCount_NotEqual(reminderUseCount: Integer): Unit = {
        regReminderUseCount(CK_NES, reminderUseCount);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (リマインダ利用回数)REMINDER_USE_COUNT: {NotNull, INTEGER(10)}
     * @param reminderUseCount The value of reminderUseCount as greaterThan. (NullAllowed: if null, no condition)
     */
    def setReminderUseCount_GreaterThan(reminderUseCount: Int): Unit = {
        regReminderUseCount(CK_GT, reminderUseCount);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (リマインダ利用回数)REMINDER_USE_COUNT: {NotNull, INTEGER(10)}
     * @param reminderUseCount The value of reminderUseCount as lessThan. (NullAllowed: if null, no condition)
     */
    def setReminderUseCount_LessThan(reminderUseCount: Int): Unit = {
        regReminderUseCount(CK_LT, reminderUseCount);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (リマインダ利用回数)REMINDER_USE_COUNT: {NotNull, INTEGER(10)}
     * @param reminderUseCount The value of reminderUseCount as greaterEqual. (NullAllowed: if null, no condition)
     */
    def setReminderUseCount_GreaterEqual(reminderUseCount: Int): Unit = {
        regReminderUseCount(CK_GE, reminderUseCount);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (リマインダ利用回数)REMINDER_USE_COUNT: {NotNull, INTEGER(10)}
     * @param reminderUseCount The value of reminderUseCount as lessEqual. (NullAllowed: if null, no condition)
     */
    def setReminderUseCount_LessEqual(reminderUseCount: Int): Unit = {
        regReminderUseCount(CK_LE, reminderUseCount);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (リマインダ利用回数)REMINDER_USE_COUNT: {NotNull, INTEGER(10)}
     * @param minNumber The min number of reminderUseCount. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of reminderUseCount. (NullAllowed: if null, no to-condition)
     * @param optionCall The callback for option of range-of. (NotNull)
     */
    def setReminderUseCount_RangeOf(minNumber: Int, maxNumber: Int)(optionCall: (RangeOfOption) => Unit): Unit = {
        regROO(minNumber, maxNumber, getCValueReminderUseCount(), "REMINDER_USE_COUNT", callbackROOP(optionCall));
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (リマインダ利用回数)REMINDER_USE_COUNT: {NotNull, INTEGER(10)}
     * @param reminderUseCountList The collection of reminderUseCount as inScope. (NullAllowed: if null (or empty), no condition)
     */
    def setReminderUseCount_InScope(reminderUseCountList: List[Int]): Unit = {
        doSetReminderUseCount_InScope(toMutableValueCollectionImplicitly(reminderUseCountList));
    }

    protected def doSetReminderUseCount_InScope(reminderUseCountList: Collection[Integer]): Unit = {
        regINS(CK_INS, cTL(reminderUseCountList), getCValueReminderUseCount(), "REMINDER_USE_COUNT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (リマインダ利用回数)REMINDER_USE_COUNT: {NotNull, INTEGER(10)}
     * @param reminderUseCountList The collection of reminderUseCount as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    def setReminderUseCount_NotInScope(reminderUseCountList: List[Int]): Unit = {
        doSetReminderUseCount_NotInScope(if (reminderUseCountList != null) { reminderUseCountList.map(_.asInstanceOf[Integer]).asJava } else { null });
    }

    protected def doSetReminderUseCount_NotInScope(reminderUseCountList: Collection[Integer]): Unit = {
        regINS(CK_NINS, cTL(reminderUseCountList), getCValueReminderUseCount(), "REMINDER_USE_COUNT");
    }

    protected def regReminderUseCount(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValueReminderUseCount(), "REMINDER_USE_COUNT"); }
    protected def getCValueReminderUseCount(): ConditionValue;

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
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;MemberSecurityCB&gt;() {
     *     public void query(MemberSecurityCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_Equal(): ScrHpSSQFunction[MemberSecurityCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_EQ, classOf[MemberSecurityCB]));
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;MemberSecurityCB&gt;() {
     *     public void query(MemberSecurityCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_NotEqual(): ScrHpSSQFunction[MemberSecurityCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_NES, classOf[MemberSecurityCB]));
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;MemberSecurityCB&gt;() {
     *     public void query(MemberSecurityCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_GreaterThan(): ScrHpSSQFunction[MemberSecurityCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_GT, classOf[MemberSecurityCB]));
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;MemberSecurityCB&gt;() {
     *     public void query(MemberSecurityCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_LessThan(): ScrHpSSQFunction[MemberSecurityCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_LT, classOf[MemberSecurityCB]));
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;MemberSecurityCB&gt;() {
     *     public void query(MemberSecurityCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_GreaterEqual(): ScrHpSSQFunction[MemberSecurityCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_GE, classOf[MemberSecurityCB]));
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MemberSecurityCB&gt;() {
     *     public void query(MemberSecurityCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_LessEqual(): ScrHpSSQFunction[MemberSecurityCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_LE, classOf[MemberSecurityCB]));
    }

    protected def toScalaSSQFunction(function: HpSSQFunction[MemberSecurityCB]): ScrHpSSQFunction[MemberSecurityCB] =
    { new ScrHpSSQFunction(function) }

    override protected def xscalarCondition[CB <: ConditionBean](fn: String, sq: SubQuery[CB], rd: String, op: HpSSQOption[CB]): Unit = {
        assertObjectNotNull("subQuery", sq);
        val cb: MemberSecurityCB = xcreateScalarConditionCB(); sq.query(cb.asInstanceOf[CB]);
        val pp: String = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean(xcreateScalarConditionPartitionByCB().asInstanceOf[CB]); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    def keepScalarCondition(sq: MemberSecurityCQ): String;

    protected def xcreateScalarConditionCB(): MemberSecurityCB = {
        val cb: MemberSecurityCB = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected def xcreateScalarConditionPartitionByCB(): MemberSecurityCB = {
        val cb: MemberSecurityCB = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    def xsmyselfDerive(fn: String, sq: SubQuery[MemberSecurityCB], al: String, op: DerivedReferrerOption): Unit = {
        assertObjectNotNull("subQuery", sq);
        val cb: MemberSecurityCB = new MemberSecurityCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        val pp: String = keepSpecifyMyselfDerived(cb.query());
        val pk: String = "MEMBER_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    def keepSpecifyMyselfDerived(sq: MemberSecurityCQ): String;

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    def myselfDerived(): ScrHpQDRFunction[MemberSecurityCB] = {
        return toScalaQDRFunction(xcreateQDRFunctionMyselfDerived(classOf[MemberSecurityCB]));
    }
    override protected def xqderiveMyselfDerived[CB <: ConditionBean](fn: String, sq: SubQuery[CB], rd: String, vl: Object, op: DerivedReferrerOption): Unit = {
        assertObjectNotNull("subQuery", sq);
        val cb: MemberSecurityCB = new MemberSecurityCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb.asInstanceOf[CB]);
        val pk: String = "MEMBER_ID";
        val sqpp: String = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        val prpp: String = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    def keepQueryMyselfDerived(sq: MemberSecurityCQ): String;
    def keepQueryMyselfDerivedParameter(vl: Object): String;

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    def myselfExists(subQuery: (MemberSecurityCB) => Unit): Unit = {
        assertObjectNotNull("subQuery", subQuery);
        val cb: MemberSecurityCB = new MemberSecurityCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery(cb); } finally { unlock(); }
        val pp: String = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    def keepMyselfExists(sq: MemberSecurityCQ): String;

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    def myselfInScope(subQuery: (MemberSecurityCB) => Unit): Unit = {
        assertObjectNotNull("subQuery", subQuery);
        val cb: MemberSecurityCB = new MemberSecurityCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery(cb); } finally { unlock(); }
        val pp: String = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    def keepMyselfInScope(sq: MemberSecurityCQ): String;

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
    protected def newMyCB(): MemberSecurityCB = {
        return new MemberSecurityCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected def xabUDT(): String = { return classOf[Date].getName(); }
    protected def xabCQ(): String = { return classOf[MemberSecurityCQ].getName(); }
    protected def xabLSO(): String = { return classOf[LikeSearchOption].getName(); }
    protected def xabSSQS(): String = { return classOf[HpSSQSetupper[_]].getName(); }
}
