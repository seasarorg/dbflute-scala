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
 * The abstract condition-query of WITHDRAWAL_REASON.
 * @author DBFlute(AutoGenerator)
 */
abstract class AbstractBsWithdrawalReasonCQ(referrerQuery: ConditionQuery, sqlClause: SqlClause, aliasName: String, nestLevel: Integer)
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
        return "WITHDRAWAL_REASON";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (退会理由コード)WITHDRAWAL_REASON_CODE: {PK, NotNull, CHAR(3), classification=WithdrawalReason}
     * @param withdrawalReasonCode The value of withdrawalReasonCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    protected def setWithdrawalReasonCode_Equal(withdrawalReasonCode: String): Unit = {
        doSetWithdrawalReasonCode_Equal(fRES(withdrawalReasonCode));
    }

    /**
     * Equal(=). As WithdrawalReason. And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (退会理由コード)WITHDRAWAL_REASON_CODE: {PK, NotNull, CHAR(3), classification=WithdrawalReason} <br />
     * reason for member withdrawal
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, no condition)
     */
    def setWithdrawalReasonCode_Equal_AsWithdrawalReason(cdef: CDef.WithdrawalReason): Unit = {
        doSetWithdrawalReasonCode_Equal(if (cdef != null) { cdef.code } else { null });
    }

    /**
     * Equal(=). As Sit (SIT). And OnlyOnceRegistered. <br />
     * SIT: サイトが使いにくいから
     */
    def setWithdrawalReasonCode_Equal_Sit(): Unit = {
        setWithdrawalReasonCode_Equal_AsWithdrawalReason(CDef.WithdrawalReason.Sit);
    }

    /**
     * Equal(=). As Prd (PRD). And OnlyOnceRegistered. <br />
     * PRD: 商品に魅力がないから
     */
    def setWithdrawalReasonCode_Equal_Prd(): Unit = {
        setWithdrawalReasonCode_Equal_AsWithdrawalReason(CDef.WithdrawalReason.Prd);
    }

    /**
     * Equal(=). As Frt (FRT). And OnlyOnceRegistered. <br />
     * FRT: フリテンだから
     */
    def setWithdrawalReasonCode_Equal_Frt(): Unit = {
        setWithdrawalReasonCode_Equal_AsWithdrawalReason(CDef.WithdrawalReason.Frt);
    }

    /**
     * Equal(=). As Oth (OTH). And OnlyOnceRegistered. <br />
     * OTH: その他理由
     */
    def setWithdrawalReasonCode_Equal_Oth(): Unit = {
        setWithdrawalReasonCode_Equal_AsWithdrawalReason(CDef.WithdrawalReason.Oth);
    }

    protected def doSetWithdrawalReasonCode_Equal(withdrawalReasonCode: String): Unit = {
        regWithdrawalReasonCode(CK_EQ, hSC("WITHDRAWAL_REASON_CODE", withdrawalReasonCode, 3, "E"));
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (退会理由コード)WITHDRAWAL_REASON_CODE: {PK, NotNull, CHAR(3), classification=WithdrawalReason}
     * @param withdrawalReasonCode The value of withdrawalReasonCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    protected def setWithdrawalReasonCode_NotEqual(withdrawalReasonCode: String): Unit = {
        doSetWithdrawalReasonCode_NotEqual(fRES(withdrawalReasonCode));
    }

    /**
     * NotEqual(&lt;&gt;). As WithdrawalReason. And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (退会理由コード)WITHDRAWAL_REASON_CODE: {PK, NotNull, CHAR(3), classification=WithdrawalReason} <br />
     * reason for member withdrawal
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, no condition)
     */
    def setWithdrawalReasonCode_NotEqual_AsWithdrawalReason(cdef: CDef.WithdrawalReason): Unit = {
        doSetWithdrawalReasonCode_NotEqual(if (cdef != null) { cdef.code } else { null });
    }

    /**
     * NotEqual(&lt;&gt;). As Sit (SIT). And OnlyOnceRegistered. <br />
     * SIT: サイトが使いにくいから
     */
    def setWithdrawalReasonCode_NotEqual_Sit(): Unit = {
        setWithdrawalReasonCode_NotEqual_AsWithdrawalReason(CDef.WithdrawalReason.Sit);
    }

    /**
     * NotEqual(&lt;&gt;). As Prd (PRD). And OnlyOnceRegistered. <br />
     * PRD: 商品に魅力がないから
     */
    def setWithdrawalReasonCode_NotEqual_Prd(): Unit = {
        setWithdrawalReasonCode_NotEqual_AsWithdrawalReason(CDef.WithdrawalReason.Prd);
    }

    /**
     * NotEqual(&lt;&gt;). As Frt (FRT). And OnlyOnceRegistered. <br />
     * FRT: フリテンだから
     */
    def setWithdrawalReasonCode_NotEqual_Frt(): Unit = {
        setWithdrawalReasonCode_NotEqual_AsWithdrawalReason(CDef.WithdrawalReason.Frt);
    }

    /**
     * NotEqual(&lt;&gt;). As Oth (OTH). And OnlyOnceRegistered. <br />
     * OTH: その他理由
     */
    def setWithdrawalReasonCode_NotEqual_Oth(): Unit = {
        setWithdrawalReasonCode_NotEqual_AsWithdrawalReason(CDef.WithdrawalReason.Oth);
    }

    protected def doSetWithdrawalReasonCode_NotEqual(withdrawalReasonCode: String): Unit = {
        regWithdrawalReasonCode(CK_NES, hSC("WITHDRAWAL_REASON_CODE", withdrawalReasonCode, 3, "E"));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (退会理由コード)WITHDRAWAL_REASON_CODE: {PK, NotNull, CHAR(3), classification=WithdrawalReason}
     * @param withdrawalReasonCodeList The collection of withdrawalReasonCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    def setWithdrawalReasonCode_InScope(withdrawalReasonCodeList: List[String]): Unit = {
        doSetWithdrawalReasonCode_InScope(toMutableValueCollectionImplicitly(withdrawalReasonCodeList));
    }

    /**
     * InScope {in ('a', 'b')}. As WithdrawalReason. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (退会理由コード)WITHDRAWAL_REASON_CODE: {PK, NotNull, CHAR(3), classification=WithdrawalReason} <br />
     * reason for member withdrawal
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    def setWithdrawalReasonCode_InScope_AsWithdrawalReason(cdefList: List[CDef.WithdrawalReason]): Unit = {
        doSetWithdrawalReasonCode_InScope(cTStrL(cdefList.asJava));
    }

    protected def doSetWithdrawalReasonCode_InScope(withdrawalReasonCodeList: Collection[String]): Unit = {
        regINS(CK_INS, cTL(withdrawalReasonCodeList), getCValueWithdrawalReasonCode(), "WITHDRAWAL_REASON_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (退会理由コード)WITHDRAWAL_REASON_CODE: {PK, NotNull, CHAR(3), classification=WithdrawalReason}
     * @param withdrawalReasonCodeList The collection of withdrawalReasonCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    def setWithdrawalReasonCode_NotInScope(withdrawalReasonCodeList: List[String]): Unit = {
        doSetWithdrawalReasonCode_NotInScope(if (withdrawalReasonCodeList != null) { withdrawalReasonCodeList.map(_.asInstanceOf[String]).asJava } else { null });
    }

    /**
     * NotInScope {not in ('a', 'b')}. As WithdrawalReason. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (退会理由コード)WITHDRAWAL_REASON_CODE: {PK, NotNull, CHAR(3), classification=WithdrawalReason} <br />
     * reason for member withdrawal
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    def setWithdrawalReasonCode_NotInScope_AsWithdrawalReason(cdefList: List[CDef.WithdrawalReason]): Unit = {
        doSetWithdrawalReasonCode_NotInScope(cTStrL(cdefList.asJava));
    }

    protected def doSetWithdrawalReasonCode_NotInScope(withdrawalReasonCodeList: Collection[String]): Unit = {
        regINS(CK_NINS, cTL(withdrawalReasonCodeList), getCValueWithdrawalReasonCode(), "WITHDRAWAL_REASON_CODE");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br />
     * {exists (select WITHDRAWAL_REASON_CODE from MEMBER_WITHDRAWAL where ...)} <br />
     * (会員退会情報)MEMBER_WITHDRAWAL by WITHDRAWAL_REASON_CODE, named 'memberWithdrawalAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">existsMemberWithdrawalList</span>(new SubQuery&lt;MemberWithdrawalCB&gt;() {
     *     public void query(MemberWithdrawalCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of MemberWithdrawalList for 'exists'. (NotNull)
     */
    def existsMemberWithdrawalList(subQuery: (MemberWithdrawalCB) => Unit): Unit = {
        assertObjectNotNull("subQuery", subQuery);
        val cb: MemberWithdrawalCB = new MemberWithdrawalCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery(cb); } finally { unlock(); }
        val pp: String = keepWithdrawalReasonCode_ExistsReferrer_MemberWithdrawalList(cb.query());
        registerExistsReferrer(cb.query(), "WITHDRAWAL_REASON_CODE", "WITHDRAWAL_REASON_CODE", pp, "memberWithdrawalList");
    }
    def keepWithdrawalReasonCode_ExistsReferrer_MemberWithdrawalList(sq: MemberWithdrawalCQ): String;

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br />
     * {not exists (select WITHDRAWAL_REASON_CODE from MEMBER_WITHDRAWAL where ...)} <br />
     * (会員退会情報)MEMBER_WITHDRAWAL by WITHDRAWAL_REASON_CODE, named 'memberWithdrawalAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">notExistsMemberWithdrawalList</span>(new SubQuery&lt;MemberWithdrawalCB&gt;() {
     *     public void query(MemberWithdrawalCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of WithdrawalReasonCode_NotExistsReferrer_MemberWithdrawalList for 'not exists'. (NotNull)
     */
    def notExistsMemberWithdrawalList(subQuery: (MemberWithdrawalCB) => Unit): Unit = {
        assertObjectNotNull("subQuery", subQuery);
        val cb: MemberWithdrawalCB = new MemberWithdrawalCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery(cb); } finally { unlock(); }
        val pp: String = keepWithdrawalReasonCode_NotExistsReferrer_MemberWithdrawalList(cb.query());
        registerNotExistsReferrer(cb.query(), "WITHDRAWAL_REASON_CODE", "WITHDRAWAL_REASON_CODE", pp, "memberWithdrawalList");
    }
    def keepWithdrawalReasonCode_NotExistsReferrer_MemberWithdrawalList(sq: MemberWithdrawalCQ): String;

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select WITHDRAWAL_REASON_CODE from MEMBER_WITHDRAWAL where ...)} <br />
     * (会員退会情報)MEMBER_WITHDRAWAL by WITHDRAWAL_REASON_CODE, named 'memberWithdrawalAsOne'.
     * @param subQuery The sub-query of MemberWithdrawalList for 'in-scope'. (NotNull)
     */
    def inScopeMemberWithdrawalList(subQuery: (MemberWithdrawalCB) => Unit): Unit = {
        assertObjectNotNull("subQuery", subQuery);
        val cb: MemberWithdrawalCB = new MemberWithdrawalCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery(cb); } finally { unlock(); }
        val pp: String = keepWithdrawalReasonCode_InScopeRelation_MemberWithdrawalList(cb.query());
        registerInScopeRelation(cb.query(), "WITHDRAWAL_REASON_CODE", "WITHDRAWAL_REASON_CODE", pp, "memberWithdrawalList");
    }
    def keepWithdrawalReasonCode_InScopeRelation_MemberWithdrawalList(sq: MemberWithdrawalCQ): String;

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select WITHDRAWAL_REASON_CODE from MEMBER_WITHDRAWAL where ...)} <br />
     * (会員退会情報)MEMBER_WITHDRAWAL by WITHDRAWAL_REASON_CODE, named 'memberWithdrawalAsOne'.
     * @param subQuery The sub-query of MemberWithdrawalList for 'not in-scope'. (NotNull)
     */
    def notInScopeMemberWithdrawalList(subQuery: (MemberWithdrawalCB) => Unit): Unit = {
        assertObjectNotNull("subQuery", subQuery);
        val cb: MemberWithdrawalCB = new MemberWithdrawalCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery(cb); } finally { unlock(); }
        val pp: String = keepWithdrawalReasonCode_NotInScopeRelation_MemberWithdrawalList(cb.query());
        registerNotInScopeRelation(cb.query(), "WITHDRAWAL_REASON_CODE", "WITHDRAWAL_REASON_CODE", pp, "memberWithdrawalList");
    }
    def keepWithdrawalReasonCode_NotInScopeRelation_MemberWithdrawalList(sq: MemberWithdrawalCQ): String;

    def xsderiveMemberWithdrawalList(fn: String, sq: SubQuery[MemberWithdrawalCB], al: String, op: DerivedReferrerOption): Unit = {
        assertObjectNotNull("subQuery", sq);
        val cb: MemberWithdrawalCB = new MemberWithdrawalCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        val pp: String = keepWithdrawalReasonCode_SpecifyDerivedReferrer_MemberWithdrawalList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "WITHDRAWAL_REASON_CODE", "WITHDRAWAL_REASON_CODE", pp, "memberWithdrawalList", al, op);
    }
    def keepWithdrawalReasonCode_SpecifyDerivedReferrer_MemberWithdrawalList(sq: MemberWithdrawalCQ): String;

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br />
     * {FOO &lt;= (select max(BAR) from MEMBER_WITHDRAWAL where ...)} <br />
     * (会員退会情報)MEMBER_WITHDRAWAL by WITHDRAWAL_REASON_CODE, named 'memberWithdrawalAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">derivedMemberWithdrawalList()</span>.<span style="color: #DD4747">max</span>(new SubQuery&lt;MemberWithdrawalCB&gt;() {
     *     public void query(MemberWithdrawalCB subCB) {
     *         subCB.specify().<span style="color: #DD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #DD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    def derivedMemberWithdrawalList(): ScrHpQDRFunction[MemberWithdrawalCB] = {
        return toScalaQDRFunction(xcreateQDRFunctionMemberWithdrawalList());
    }
    protected def xcreateQDRFunctionMemberWithdrawalList(): HpQDRFunction[MemberWithdrawalCB] = {
        return new HpQDRFunction[MemberWithdrawalCB](new HpQDRSetupper[MemberWithdrawalCB]() {
            def setup(fn: String, sq: SubQuery[MemberWithdrawalCB], rd: String, vl: Object, op: DerivedReferrerOption): Unit = {
                xqderiveMemberWithdrawalList(fn, sq, rd, vl, op);
            }
        });
    }
    def xqderiveMemberWithdrawalList(fn: String, sq: SubQuery[MemberWithdrawalCB], rd: String, vl: Object, op: DerivedReferrerOption): Unit = {
        assertObjectNotNull("subQuery", sq);
        val cb: MemberWithdrawalCB = new MemberWithdrawalCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        val sqpp: String = keepWithdrawalReasonCode_QueryDerivedReferrer_MemberWithdrawalList(cb.query());
        val prpp: String = keepWithdrawalReasonCode_QueryDerivedReferrer_MemberWithdrawalListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "WITHDRAWAL_REASON_CODE", "WITHDRAWAL_REASON_CODE", sqpp, "memberWithdrawalList", rd, vl, prpp, op);
    }
    def keepWithdrawalReasonCode_QueryDerivedReferrer_MemberWithdrawalList(sq: MemberWithdrawalCQ): String;
    def keepWithdrawalReasonCode_QueryDerivedReferrer_MemberWithdrawalListParameter(vl: Object): String;

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * (退会理由コード)WITHDRAWAL_REASON_CODE: {PK, NotNull, CHAR(3), classification=WithdrawalReason}
     */
    def setWithdrawalReasonCode_IsNull(): Unit = { regWithdrawalReasonCode(CK_ISN, AbstractConditionQuery.DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * (退会理由コード)WITHDRAWAL_REASON_CODE: {PK, NotNull, CHAR(3), classification=WithdrawalReason}
     */
    def setWithdrawalReasonCode_IsNotNull(): Unit = { regWithdrawalReasonCode(CK_ISNN, AbstractConditionQuery.DOBJ); }

    protected def regWithdrawalReasonCode(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValueWithdrawalReasonCode(), "WITHDRAWAL_REASON_CODE"); }
    protected def getCValueWithdrawalReasonCode(): ConditionValue;

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (退会理由テキスト)WITHDRAWAL_REASON_TEXT: {NotNull, CLOB(2147483647)}
     * @param withdrawalReasonText The value of withdrawalReasonText as equal. (NullAllowed: if null (or empty), no condition)
     */
    def setWithdrawalReasonText_Equal(withdrawalReasonText: String): Unit = {
        doSetWithdrawalReasonText_Equal(fRES(withdrawalReasonText));
    }

    protected def doSetWithdrawalReasonText_Equal(withdrawalReasonText: String): Unit = {
        regWithdrawalReasonText(CK_EQ, withdrawalReasonText);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (退会理由テキスト)WITHDRAWAL_REASON_TEXT: {NotNull, CLOB(2147483647)} <br />
     * <pre>e.g. setWithdrawalReasonText_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param withdrawalReasonText The value of withdrawalReasonText as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param optionCall The callback for option of like-search. (NotNull)
     */
    def setWithdrawalReasonText_LikeSearch(withdrawalReasonText: String)(optionCall: (ScrLikeSearchOption) => Unit): Unit = {
        regLSQ(CK_LS, fRES(withdrawalReasonText), getCValueWithdrawalReasonText(), "WITHDRAWAL_REASON_TEXT", callbackLSOP(optionCall));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (退会理由テキスト)WITHDRAWAL_REASON_TEXT: {NotNull, CLOB(2147483647)}
     * @param withdrawalReasonText The value of withdrawalReasonText as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param optionCall The callback for option of not-like-search. (NotNull)
     */
    def setWithdrawalReasonText_NotLikeSearch(withdrawalReasonText: String)(optionCall: (ScrLikeSearchOption) => Unit): Unit = {
        regLSQ(CK_NLS, fRES(withdrawalReasonText), getCValueWithdrawalReasonText(), "WITHDRAWAL_REASON_TEXT", callbackLSOP(optionCall));
    }

    protected def regWithdrawalReasonText(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValueWithdrawalReasonText(), "WITHDRAWAL_REASON_TEXT"); }
    protected def getCValueWithdrawalReasonText(): ConditionValue;

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * DISPLAY_ORDER: {UQ, NotNull, INTEGER(10)}
     * @param displayOrder The value of displayOrder as equal. (NullAllowed: if null, no condition)
     */
    def setDisplayOrder_Equal(displayOrder: Int): Unit = {
        doSetDisplayOrder_Equal(displayOrder);
    }

    protected def doSetDisplayOrder_Equal(displayOrder: Integer): Unit = {
        regDisplayOrder(CK_EQ, displayOrder);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * DISPLAY_ORDER: {UQ, NotNull, INTEGER(10)}
     * @param minNumber The min number of displayOrder. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of displayOrder. (NullAllowed: if null, no to-condition)
     * @param optionCall The callback for option of range-of. (NotNull)
     */
    def setDisplayOrder_RangeOf(minNumber: Int, maxNumber: Int)(optionCall: (RangeOfOption) => Unit): Unit = {
        regROO(minNumber, maxNumber, getCValueDisplayOrder(), "DISPLAY_ORDER", callbackROOP(optionCall));
    }

    protected def regDisplayOrder(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValueDisplayOrder(), "DISPLAY_ORDER"); }
    protected def getCValueDisplayOrder(): ConditionValue;

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;WithdrawalReasonCB&gt;() {
     *     public void query(WithdrawalReasonCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_Equal(): ScrHpSSQFunction[WithdrawalReasonCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_EQ, classOf[WithdrawalReasonCB]));
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WithdrawalReasonCB&gt;() {
     *     public void query(WithdrawalReasonCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_NotEqual(): ScrHpSSQFunction[WithdrawalReasonCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_NES, classOf[WithdrawalReasonCB]));
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WithdrawalReasonCB&gt;() {
     *     public void query(WithdrawalReasonCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_GreaterThan(): ScrHpSSQFunction[WithdrawalReasonCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_GT, classOf[WithdrawalReasonCB]));
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;WithdrawalReasonCB&gt;() {
     *     public void query(WithdrawalReasonCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_LessThan(): ScrHpSSQFunction[WithdrawalReasonCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_LT, classOf[WithdrawalReasonCB]));
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WithdrawalReasonCB&gt;() {
     *     public void query(WithdrawalReasonCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_GreaterEqual(): ScrHpSSQFunction[WithdrawalReasonCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_GE, classOf[WithdrawalReasonCB]));
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WithdrawalReasonCB&gt;() {
     *     public void query(WithdrawalReasonCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_LessEqual(): ScrHpSSQFunction[WithdrawalReasonCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_LE, classOf[WithdrawalReasonCB]));
    }

    protected def toScalaSSQFunction(function: HpSSQFunction[WithdrawalReasonCB]): ScrHpSSQFunction[WithdrawalReasonCB] =
    { new ScrHpSSQFunction(function) }

    override protected def xscalarCondition[CB <: ConditionBean](fn: String, sq: SubQuery[CB], rd: String, op: HpSSQOption[CB]): Unit = {
        assertObjectNotNull("subQuery", sq);
        val cb: WithdrawalReasonCB = xcreateScalarConditionCB(); sq.query(cb.asInstanceOf[CB]);
        val pp: String = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean(xcreateScalarConditionPartitionByCB().asInstanceOf[CB]); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    def keepScalarCondition(sq: WithdrawalReasonCQ): String;

    protected def xcreateScalarConditionCB(): WithdrawalReasonCB = {
        val cb: WithdrawalReasonCB = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected def xcreateScalarConditionPartitionByCB(): WithdrawalReasonCB = {
        val cb: WithdrawalReasonCB = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    def xsmyselfDerive(fn: String, sq: SubQuery[WithdrawalReasonCB], al: String, op: DerivedReferrerOption): Unit = {
        assertObjectNotNull("subQuery", sq);
        val cb: WithdrawalReasonCB = new WithdrawalReasonCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        val pp: String = keepSpecifyMyselfDerived(cb.query());
        val pk: String = "WITHDRAWAL_REASON_CODE";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    def keepSpecifyMyselfDerived(sq: WithdrawalReasonCQ): String;

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    def myselfDerived(): ScrHpQDRFunction[WithdrawalReasonCB] = {
        return toScalaQDRFunction(xcreateQDRFunctionMyselfDerived(classOf[WithdrawalReasonCB]));
    }
    override protected def xqderiveMyselfDerived[CB <: ConditionBean](fn: String, sq: SubQuery[CB], rd: String, vl: Object, op: DerivedReferrerOption): Unit = {
        assertObjectNotNull("subQuery", sq);
        val cb: WithdrawalReasonCB = new WithdrawalReasonCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb.asInstanceOf[CB]);
        val pk: String = "WITHDRAWAL_REASON_CODE";
        val sqpp: String = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        val prpp: String = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    def keepQueryMyselfDerived(sq: WithdrawalReasonCQ): String;
    def keepQueryMyselfDerivedParameter(vl: Object): String;

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    def myselfExists(subQuery: (WithdrawalReasonCB) => Unit): Unit = {
        assertObjectNotNull("subQuery", subQuery);
        val cb: WithdrawalReasonCB = new WithdrawalReasonCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery(cb); } finally { unlock(); }
        val pp: String = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    def keepMyselfExists(sq: WithdrawalReasonCQ): String;

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    def myselfInScope(subQuery: (WithdrawalReasonCB) => Unit): Unit = {
        assertObjectNotNull("subQuery", subQuery);
        val cb: WithdrawalReasonCB = new WithdrawalReasonCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery(cb); } finally { unlock(); }
        val pp: String = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    def keepMyselfInScope(sq: WithdrawalReasonCQ): String;

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
    protected def newMyCB(): WithdrawalReasonCB = {
        return new WithdrawalReasonCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected def xabUDT(): String = { return classOf[Date].getName(); }
    protected def xabCQ(): String = { return classOf[WithdrawalReasonCQ].getName(); }
    protected def xabLSO(): String = { return classOf[LikeSearchOption].getName(); }
    protected def xabSSQS(): String = { return classOf[HpSSQSetupper[_]].getName(); }
}
