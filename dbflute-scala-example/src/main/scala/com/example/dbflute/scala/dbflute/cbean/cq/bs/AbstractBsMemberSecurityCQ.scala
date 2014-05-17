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
     def setMemberId_Equal(memberId: Integer): Unit = {
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
     def setMemberId_NotEqual(memberId: Integer): Unit = {
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
    def setMemberId_GreaterThan(memberId: Integer): Unit = {
        regMemberId(CK_GT, memberId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ID)MEMBER_ID: {PK, NotNull, INTEGER(10), FK to MEMBER}
     * @param memberId The value of memberId as lessThan. (NullAllowed: if null, no condition)
     */
    def setMemberId_LessThan(memberId: Integer): Unit = {
        regMemberId(CK_LT, memberId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ID)MEMBER_ID: {PK, NotNull, INTEGER(10), FK to MEMBER}
     * @param memberId The value of memberId as greaterEqual. (NullAllowed: if null, no condition)
     */
    def setMemberId_GreaterEqual(memberId: Integer): Unit = {
        regMemberId(CK_GE, memberId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ID)MEMBER_ID: {PK, NotNull, INTEGER(10), FK to MEMBER}
     * @param memberId The value of memberId as lessEqual. (NullAllowed: if null, no condition)
     */
    def setMemberId_LessEqual(memberId: Integer): Unit = {
        regMemberId(CK_LE, memberId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ID)MEMBER_ID: {PK, NotNull, INTEGER(10), FK to MEMBER}
     * @param minNumber The min number of memberId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of memberId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    def setMemberId_RangeOf(minNumber: Integer, maxNumber: Integer, rangeOfOption: RangeOfOption): Unit = {
        regROO(minNumber, maxNumber, getCValueMemberId(), "MEMBER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (会員ID)MEMBER_ID: {PK, NotNull, INTEGER(10), FK to MEMBER}
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
     * (会員ID)MEMBER_ID: {PK, NotNull, INTEGER(10), FK to MEMBER}
     * @param memberIdList The collection of memberId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    def setMemberId_NotInScope(memberIdList: Collection[Integer]): Unit = {
        doSetMemberId_NotInScope(memberIdList);
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

    protected def regMemberId(ky: ConditionKey, vl: Object): Unit = { regQ(ky, vl, getCValueMemberId(), "MEMBER_ID"); }
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
    def setLoginPassword_InScope(loginPasswordList: Collection[String]): Unit = {
        doSetLoginPassword_InScope(loginPasswordList);
    }

    def doSetLoginPassword_InScope(loginPasswordList: Collection[String]): Unit = {
        regINS(CK_INS, cTL(loginPasswordList), getCValueLoginPassword(), "LOGIN_PASSWORD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (ログインパスワード)LOGIN_PASSWORD: {NotNull, VARCHAR(50)}
     * @param loginPasswordList The collection of loginPassword as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    def setLoginPassword_NotInScope(loginPasswordList: Collection[String]): Unit = {
        doSetLoginPassword_NotInScope(loginPasswordList);
    }

    def doSetLoginPassword_NotInScope(loginPasswordList: Collection[String]): Unit = {
        regINS(CK_NINS, cTL(loginPasswordList), getCValueLoginPassword(), "LOGIN_PASSWORD");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (ログインパスワード)LOGIN_PASSWORD: {NotNull, VARCHAR(50)}
     * @param loginPassword The value of loginPassword as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    def setLoginPassword_PrefixSearch(loginPassword: String): Unit = {
        setLoginPassword_LikeSearch(loginPassword, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (ログインパスワード)LOGIN_PASSWORD: {NotNull, VARCHAR(50)} <br />
     * <pre>e.g. setLoginPassword_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param loginPassword The value of loginPassword as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    def setLoginPassword_LikeSearch(loginPassword: String, likeSearchOption: LikeSearchOption): Unit = {
        regLSQ(CK_LS, fRES(loginPassword), getCValueLoginPassword(), "LOGIN_PASSWORD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (ログインパスワード)LOGIN_PASSWORD: {NotNull, VARCHAR(50)}
     * @param loginPassword The value of loginPassword as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    def setLoginPassword_NotLikeSearch(loginPassword: String, likeSearchOption: LikeSearchOption): Unit = {
        regLSQ(CK_NLS, fRES(loginPassword), getCValueLoginPassword(), "LOGIN_PASSWORD", likeSearchOption);
    }

    protected def regLoginPassword(ky: ConditionKey, vl: Object): Unit = { regQ(ky, vl, getCValueLoginPassword(), "LOGIN_PASSWORD"); }
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
    def setReminderQuestion_InScope(reminderQuestionList: Collection[String]): Unit = {
        doSetReminderQuestion_InScope(reminderQuestionList);
    }

    def doSetReminderQuestion_InScope(reminderQuestionList: Collection[String]): Unit = {
        regINS(CK_INS, cTL(reminderQuestionList), getCValueReminderQuestion(), "REMINDER_QUESTION");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (リマインダ質問)REMINDER_QUESTION: {NotNull, VARCHAR(50)}
     * @param reminderQuestionList The collection of reminderQuestion as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    def setReminderQuestion_NotInScope(reminderQuestionList: Collection[String]): Unit = {
        doSetReminderQuestion_NotInScope(reminderQuestionList);
    }

    def doSetReminderQuestion_NotInScope(reminderQuestionList: Collection[String]): Unit = {
        regINS(CK_NINS, cTL(reminderQuestionList), getCValueReminderQuestion(), "REMINDER_QUESTION");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (リマインダ質問)REMINDER_QUESTION: {NotNull, VARCHAR(50)}
     * @param reminderQuestion The value of reminderQuestion as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    def setReminderQuestion_PrefixSearch(reminderQuestion: String): Unit = {
        setReminderQuestion_LikeSearch(reminderQuestion, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (リマインダ質問)REMINDER_QUESTION: {NotNull, VARCHAR(50)} <br />
     * <pre>e.g. setReminderQuestion_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param reminderQuestion The value of reminderQuestion as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    def setReminderQuestion_LikeSearch(reminderQuestion: String, likeSearchOption: LikeSearchOption): Unit = {
        regLSQ(CK_LS, fRES(reminderQuestion), getCValueReminderQuestion(), "REMINDER_QUESTION", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (リマインダ質問)REMINDER_QUESTION: {NotNull, VARCHAR(50)}
     * @param reminderQuestion The value of reminderQuestion as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    def setReminderQuestion_NotLikeSearch(reminderQuestion: String, likeSearchOption: LikeSearchOption): Unit = {
        regLSQ(CK_NLS, fRES(reminderQuestion), getCValueReminderQuestion(), "REMINDER_QUESTION", likeSearchOption);
    }

    protected def regReminderQuestion(ky: ConditionKey, vl: Object): Unit = { regQ(ky, vl, getCValueReminderQuestion(), "REMINDER_QUESTION"); }
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
    def setReminderAnswer_InScope(reminderAnswerList: Collection[String]): Unit = {
        doSetReminderAnswer_InScope(reminderAnswerList);
    }

    def doSetReminderAnswer_InScope(reminderAnswerList: Collection[String]): Unit = {
        regINS(CK_INS, cTL(reminderAnswerList), getCValueReminderAnswer(), "REMINDER_ANSWER");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (リマインダ回答)REMINDER_ANSWER: {NotNull, VARCHAR(50)}
     * @param reminderAnswerList The collection of reminderAnswer as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    def setReminderAnswer_NotInScope(reminderAnswerList: Collection[String]): Unit = {
        doSetReminderAnswer_NotInScope(reminderAnswerList);
    }

    def doSetReminderAnswer_NotInScope(reminderAnswerList: Collection[String]): Unit = {
        regINS(CK_NINS, cTL(reminderAnswerList), getCValueReminderAnswer(), "REMINDER_ANSWER");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (リマインダ回答)REMINDER_ANSWER: {NotNull, VARCHAR(50)}
     * @param reminderAnswer The value of reminderAnswer as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    def setReminderAnswer_PrefixSearch(reminderAnswer: String): Unit = {
        setReminderAnswer_LikeSearch(reminderAnswer, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (リマインダ回答)REMINDER_ANSWER: {NotNull, VARCHAR(50)} <br />
     * <pre>e.g. setReminderAnswer_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param reminderAnswer The value of reminderAnswer as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    def setReminderAnswer_LikeSearch(reminderAnswer: String, likeSearchOption: LikeSearchOption): Unit = {
        regLSQ(CK_LS, fRES(reminderAnswer), getCValueReminderAnswer(), "REMINDER_ANSWER", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (リマインダ回答)REMINDER_ANSWER: {NotNull, VARCHAR(50)}
     * @param reminderAnswer The value of reminderAnswer as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    def setReminderAnswer_NotLikeSearch(reminderAnswer: String, likeSearchOption: LikeSearchOption): Unit = {
        regLSQ(CK_NLS, fRES(reminderAnswer), getCValueReminderAnswer(), "REMINDER_ANSWER", likeSearchOption);
    }

    protected def regReminderAnswer(ky: ConditionKey, vl: Object): Unit = { regQ(ky, vl, getCValueReminderAnswer(), "REMINDER_ANSWER"); }
    protected def getCValueReminderAnswer(): ConditionValue;
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * (リマインダ利用回数)REMINDER_USE_COUNT: {NotNull, INTEGER(10)}
     * @param reminderUseCount The value of reminderUseCount as equal. (NullAllowed: if null, no condition)
     */
     def setReminderUseCount_Equal(reminderUseCount: Integer): Unit = {
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
     def setReminderUseCount_NotEqual(reminderUseCount: Integer): Unit = {
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
    def setReminderUseCount_GreaterThan(reminderUseCount: Integer): Unit = {
        regReminderUseCount(CK_GT, reminderUseCount);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (リマインダ利用回数)REMINDER_USE_COUNT: {NotNull, INTEGER(10)}
     * @param reminderUseCount The value of reminderUseCount as lessThan. (NullAllowed: if null, no condition)
     */
    def setReminderUseCount_LessThan(reminderUseCount: Integer): Unit = {
        regReminderUseCount(CK_LT, reminderUseCount);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (リマインダ利用回数)REMINDER_USE_COUNT: {NotNull, INTEGER(10)}
     * @param reminderUseCount The value of reminderUseCount as greaterEqual. (NullAllowed: if null, no condition)
     */
    def setReminderUseCount_GreaterEqual(reminderUseCount: Integer): Unit = {
        regReminderUseCount(CK_GE, reminderUseCount);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (リマインダ利用回数)REMINDER_USE_COUNT: {NotNull, INTEGER(10)}
     * @param reminderUseCount The value of reminderUseCount as lessEqual. (NullAllowed: if null, no condition)
     */
    def setReminderUseCount_LessEqual(reminderUseCount: Integer): Unit = {
        regReminderUseCount(CK_LE, reminderUseCount);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (リマインダ利用回数)REMINDER_USE_COUNT: {NotNull, INTEGER(10)}
     * @param minNumber The min number of reminderUseCount. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of reminderUseCount. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    def setReminderUseCount_RangeOf(minNumber: Integer, maxNumber: Integer, rangeOfOption: RangeOfOption): Unit = {
        regROO(minNumber, maxNumber, getCValueReminderUseCount(), "REMINDER_USE_COUNT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (リマインダ利用回数)REMINDER_USE_COUNT: {NotNull, INTEGER(10)}
     * @param reminderUseCountList The collection of reminderUseCount as inScope. (NullAllowed: if null (or empty), no condition)
     */
    def setReminderUseCount_InScope(reminderUseCountList: Collection[Integer]): Unit = {
        doSetReminderUseCount_InScope(reminderUseCountList);
    }

    protected def doSetReminderUseCount_InScope(reminderUseCountList: Collection[Integer]): Unit = {
        regINS(CK_INS, cTL(reminderUseCountList), getCValueReminderUseCount(), "REMINDER_USE_COUNT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (リマインダ利用回数)REMINDER_USE_COUNT: {NotNull, INTEGER(10)}
     * @param reminderUseCountList The collection of reminderUseCount as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    def setReminderUseCount_NotInScope(reminderUseCountList: Collection[Integer]): Unit = {
        doSetReminderUseCount_NotInScope(reminderUseCountList);
    }

    protected def doSetReminderUseCount_NotInScope(reminderUseCountList: Collection[Integer]): Unit = {
        regINS(CK_NINS, cTL(reminderUseCountList), getCValueReminderUseCount(), "REMINDER_USE_COUNT");
    }

    protected def regReminderUseCount(ky: ConditionKey, vl: Object): Unit = { regQ(ky, vl, getCValueReminderUseCount(), "REMINDER_USE_COUNT"); }
    protected def getCValueReminderUseCount(): ConditionValue;

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
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;MemberSecurityCB&gt;() {
     *     public void query(MemberSecurityCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_Equal(): HpSSQFunction[MemberSecurityCB] = {
        return xcreateSSQFunction(CK_EQ.getOperand(), classOf[MemberSecurityCB]);
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
    def scalar_NotEqual(): HpSSQFunction[MemberSecurityCB] = {
        return xcreateSSQFunction(CK_NES.getOperand(), classOf[MemberSecurityCB]);
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
    def scalar_GreaterThan(): HpSSQFunction[MemberSecurityCB] = {
        return xcreateSSQFunction(CK_GT.getOperand(), classOf[MemberSecurityCB]);
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
    def scalar_LessThan(): HpSSQFunction[MemberSecurityCB] = {
        return xcreateSSQFunction(CK_LT.getOperand(), classOf[MemberSecurityCB]);
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
    def scalar_GreaterEqual(): HpSSQFunction[MemberSecurityCB] = {
        return xcreateSSQFunction(CK_GE.getOperand(), classOf[MemberSecurityCB]);
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
    def scalar_LessEqual(): HpSSQFunction[MemberSecurityCB] = {
        return xcreateSSQFunction(CK_LE.getOperand(), classOf[MemberSecurityCB]);
    }

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
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    def myselfDerived(): HpQDRFunction[MemberSecurityCB] = {
        return xcreateQDRFunctionMyselfDerived(classOf[MemberSecurityCB]);
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
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    def myselfExists(subQuery: SubQuery[MemberSecurityCB]): Unit = {
        assertObjectNotNull("subQuery", subQuery);
        val cb: MemberSecurityCB = new MemberSecurityCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        val pp: String = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    def keepMyselfExists(sq: MemberSecurityCQ): String;

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    def myselfInScope(subQuery: SubQuery[MemberSecurityCB]): Unit = {
        assertObjectNotNull("subQuery", subQuery);
        val cb: MemberSecurityCB = new MemberSecurityCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        val pp: String = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    def keepMyselfInScope(sq: MemberSecurityCQ): String;

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected def newMyCB(): MemberSecurityCB = {
        return new MemberSecurityCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected def xabCQ(): String = { return classOf[MemberSecurityCQ].getName(); }
    protected def xabLSO(): String = { return classOf[LikeSearchOption].getName(); }
    protected def xabSSQS(): String = { return classOf[HpSSQSetupper[_]].getName(); }
}
