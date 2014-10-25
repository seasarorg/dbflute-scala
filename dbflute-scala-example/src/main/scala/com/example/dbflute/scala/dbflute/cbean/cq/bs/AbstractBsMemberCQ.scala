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
 * The abstract condition-query of MEMBER.
 * @author DBFlute(AutoGenerator)
 */
abstract class AbstractBsMemberCQ(referrerQuery: ConditionQuery, sqlClause: SqlClause, aliasName: String, nestLevel: Integer)
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
        return "MEMBER";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ID)MEMBER_ID: {PK, ID, NotNull, INTEGER(10)}
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
     * (会員ID)MEMBER_ID: {PK, ID, NotNull, INTEGER(10)}
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
     * (会員ID)MEMBER_ID: {PK, ID, NotNull, INTEGER(10)}
     * @param memberId The value of memberId as greaterThan. (NullAllowed: if null, no condition)
     */
    def setMemberId_GreaterThan(memberId: Int): Unit = {
        regMemberId(CK_GT, memberId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ID)MEMBER_ID: {PK, ID, NotNull, INTEGER(10)}
     * @param memberId The value of memberId as lessThan. (NullAllowed: if null, no condition)
     */
    def setMemberId_LessThan(memberId: Int): Unit = {
        regMemberId(CK_LT, memberId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ID)MEMBER_ID: {PK, ID, NotNull, INTEGER(10)}
     * @param memberId The value of memberId as greaterEqual. (NullAllowed: if null, no condition)
     */
    def setMemberId_GreaterEqual(memberId: Int): Unit = {
        regMemberId(CK_GE, memberId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ID)MEMBER_ID: {PK, ID, NotNull, INTEGER(10)}
     * @param memberId The value of memberId as lessEqual. (NullAllowed: if null, no condition)
     */
    def setMemberId_LessEqual(memberId: Int): Unit = {
        regMemberId(CK_LE, memberId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ID)MEMBER_ID: {PK, ID, NotNull, INTEGER(10)}
     * @param minNumber The min number of memberId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of memberId. (NullAllowed: if null, no to-condition)
     * @param optionCall The callback for option of range-of. (NotNull)
     */
    def setMemberId_RangeOf(minNumber: Int, maxNumber: Int)(optionCall: (RangeOfOption) => Unit): Unit = {
        regROO(minNumber, maxNumber, getCValueMemberId(), "MEMBER_ID", callbackROOP(optionCall));
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (会員ID)MEMBER_ID: {PK, ID, NotNull, INTEGER(10)}
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
     * (会員ID)MEMBER_ID: {PK, ID, NotNull, INTEGER(10)}
     * @param memberIdList The collection of memberId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    def setMemberId_NotInScope(memberIdList: List[Int]): Unit = {
        doSetMemberId_NotInScope(if (memberIdList != null) { memberIdList.map(_.asInstanceOf[Integer]).asJava } else { null });
    }

    protected def doSetMemberId_NotInScope(memberIdList: Collection[Integer]): Unit = {
        regINS(CK_NINS, cTL(memberIdList), getCValueMemberId(), "MEMBER_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br />
     * {exists (select MEMBER_ID from MEMBER_ADDRESS where ...)} <br />
     * (会員住所情報)MEMBER_ADDRESS by MEMBER_ID, named 'memberAddressAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">existsMemberAddressList</span>(new SubQuery&lt;MemberAddressCB&gt;() {
     *     public void query(MemberAddressCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of MemberAddressList for 'exists'. (NotNull)
     */
    def existsMemberAddressList(subQuery: (MemberAddressCB) => Unit): Unit = {
        assertObjectNotNull("subQuery", subQuery);
        val cb: MemberAddressCB = new MemberAddressCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery(cb); } finally { unlock(); }
        val pp: String = keepMemberId_ExistsReferrer_MemberAddressList(cb.query());
        registerExistsReferrer(cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "memberAddressList");
    }
    def keepMemberId_ExistsReferrer_MemberAddressList(sq: MemberAddressCQ): String;

    /**
     * Set up ExistsReferrer (correlated sub-query). <br />
     * {exists (select MY_MEMBER_ID from MEMBER_FOLLOWING where ...)} <br />
     * (会員フォローイング)MEMBER_FOLLOWING by MY_MEMBER_ID, named 'memberFollowingByMyMemberIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">existsMemberFollowingByMyMemberIdList</span>(new SubQuery&lt;MemberFollowingCB&gt;() {
     *     public void query(MemberFollowingCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of MemberFollowingByMyMemberIdList for 'exists'. (NotNull)
     */
    def existsMemberFollowingByMyMemberIdList(subQuery: (MemberFollowingCB) => Unit): Unit = {
        assertObjectNotNull("subQuery", subQuery);
        val cb: MemberFollowingCB = new MemberFollowingCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery(cb); } finally { unlock(); }
        val pp: String = keepMemberId_ExistsReferrer_MemberFollowingByMyMemberIdList(cb.query());
        registerExistsReferrer(cb.query(), "MEMBER_ID", "MY_MEMBER_ID", pp, "memberFollowingByMyMemberIdList");
    }
    def keepMemberId_ExistsReferrer_MemberFollowingByMyMemberIdList(sq: MemberFollowingCQ): String;

    /**
     * Set up ExistsReferrer (correlated sub-query). <br />
     * {exists (select YOUR_MEMBER_ID from MEMBER_FOLLOWING where ...)} <br />
     * (会員フォローイング)MEMBER_FOLLOWING by YOUR_MEMBER_ID, named 'memberFollowingByYourMemberIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">existsMemberFollowingByYourMemberIdList</span>(new SubQuery&lt;MemberFollowingCB&gt;() {
     *     public void query(MemberFollowingCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of MemberFollowingByYourMemberIdList for 'exists'. (NotNull)
     */
    def existsMemberFollowingByYourMemberIdList(subQuery: (MemberFollowingCB) => Unit): Unit = {
        assertObjectNotNull("subQuery", subQuery);
        val cb: MemberFollowingCB = new MemberFollowingCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery(cb); } finally { unlock(); }
        val pp: String = keepMemberId_ExistsReferrer_MemberFollowingByYourMemberIdList(cb.query());
        registerExistsReferrer(cb.query(), "MEMBER_ID", "YOUR_MEMBER_ID", pp, "memberFollowingByYourMemberIdList");
    }
    def keepMemberId_ExistsReferrer_MemberFollowingByYourMemberIdList(sq: MemberFollowingCQ): String;

    /**
     * Set up ExistsReferrer (correlated sub-query). <br />
     * {exists (select MEMBER_ID from MEMBER_LOGIN where ...)} <br />
     * (会員ログイン)MEMBER_LOGIN by MEMBER_ID, named 'memberLoginAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">existsMemberLoginList</span>(new SubQuery&lt;MemberLoginCB&gt;() {
     *     public void query(MemberLoginCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of MemberLoginList for 'exists'. (NotNull)
     */
    def existsMemberLoginList(subQuery: (MemberLoginCB) => Unit): Unit = {
        assertObjectNotNull("subQuery", subQuery);
        val cb: MemberLoginCB = new MemberLoginCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery(cb); } finally { unlock(); }
        val pp: String = keepMemberId_ExistsReferrer_MemberLoginList(cb.query());
        registerExistsReferrer(cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "memberLoginList");
    }
    def keepMemberId_ExistsReferrer_MemberLoginList(sq: MemberLoginCQ): String;

    /**
     * Set up ExistsReferrer (correlated sub-query). <br />
     * {exists (select MEMBER_ID from PURCHASE where ...)} <br />
     * (購入)PURCHASE by MEMBER_ID, named 'purchaseAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">existsPurchaseList</span>(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of PurchaseList for 'exists'. (NotNull)
     */
    def existsPurchaseList(subQuery: (PurchaseCB) => Unit): Unit = {
        assertObjectNotNull("subQuery", subQuery);
        val cb: PurchaseCB = new PurchaseCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery(cb); } finally { unlock(); }
        val pp: String = keepMemberId_ExistsReferrer_PurchaseList(cb.query());
        registerExistsReferrer(cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "purchaseList");
    }
    def keepMemberId_ExistsReferrer_PurchaseList(sq: PurchaseCQ): String;

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br />
     * {not exists (select MEMBER_ID from MEMBER_ADDRESS where ...)} <br />
     * (会員住所情報)MEMBER_ADDRESS by MEMBER_ID, named 'memberAddressAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">notExistsMemberAddressList</span>(new SubQuery&lt;MemberAddressCB&gt;() {
     *     public void query(MemberAddressCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of MemberId_NotExistsReferrer_MemberAddressList for 'not exists'. (NotNull)
     */
    def notExistsMemberAddressList(subQuery: (MemberAddressCB) => Unit): Unit = {
        assertObjectNotNull("subQuery", subQuery);
        val cb: MemberAddressCB = new MemberAddressCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery(cb); } finally { unlock(); }
        val pp: String = keepMemberId_NotExistsReferrer_MemberAddressList(cb.query());
        registerNotExistsReferrer(cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "memberAddressList");
    }
    def keepMemberId_NotExistsReferrer_MemberAddressList(sq: MemberAddressCQ): String;

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br />
     * {not exists (select MY_MEMBER_ID from MEMBER_FOLLOWING where ...)} <br />
     * (会員フォローイング)MEMBER_FOLLOWING by MY_MEMBER_ID, named 'memberFollowingByMyMemberIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">notExistsMemberFollowingByMyMemberIdList</span>(new SubQuery&lt;MemberFollowingCB&gt;() {
     *     public void query(MemberFollowingCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of MemberId_NotExistsReferrer_MemberFollowingByMyMemberIdList for 'not exists'. (NotNull)
     */
    def notExistsMemberFollowingByMyMemberIdList(subQuery: (MemberFollowingCB) => Unit): Unit = {
        assertObjectNotNull("subQuery", subQuery);
        val cb: MemberFollowingCB = new MemberFollowingCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery(cb); } finally { unlock(); }
        val pp: String = keepMemberId_NotExistsReferrer_MemberFollowingByMyMemberIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "MEMBER_ID", "MY_MEMBER_ID", pp, "memberFollowingByMyMemberIdList");
    }
    def keepMemberId_NotExistsReferrer_MemberFollowingByMyMemberIdList(sq: MemberFollowingCQ): String;

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br />
     * {not exists (select YOUR_MEMBER_ID from MEMBER_FOLLOWING where ...)} <br />
     * (会員フォローイング)MEMBER_FOLLOWING by YOUR_MEMBER_ID, named 'memberFollowingByYourMemberIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">notExistsMemberFollowingByYourMemberIdList</span>(new SubQuery&lt;MemberFollowingCB&gt;() {
     *     public void query(MemberFollowingCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of MemberId_NotExistsReferrer_MemberFollowingByYourMemberIdList for 'not exists'. (NotNull)
     */
    def notExistsMemberFollowingByYourMemberIdList(subQuery: (MemberFollowingCB) => Unit): Unit = {
        assertObjectNotNull("subQuery", subQuery);
        val cb: MemberFollowingCB = new MemberFollowingCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery(cb); } finally { unlock(); }
        val pp: String = keepMemberId_NotExistsReferrer_MemberFollowingByYourMemberIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "MEMBER_ID", "YOUR_MEMBER_ID", pp, "memberFollowingByYourMemberIdList");
    }
    def keepMemberId_NotExistsReferrer_MemberFollowingByYourMemberIdList(sq: MemberFollowingCQ): String;

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br />
     * {not exists (select MEMBER_ID from MEMBER_LOGIN where ...)} <br />
     * (会員ログイン)MEMBER_LOGIN by MEMBER_ID, named 'memberLoginAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">notExistsMemberLoginList</span>(new SubQuery&lt;MemberLoginCB&gt;() {
     *     public void query(MemberLoginCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of MemberId_NotExistsReferrer_MemberLoginList for 'not exists'. (NotNull)
     */
    def notExistsMemberLoginList(subQuery: (MemberLoginCB) => Unit): Unit = {
        assertObjectNotNull("subQuery", subQuery);
        val cb: MemberLoginCB = new MemberLoginCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery(cb); } finally { unlock(); }
        val pp: String = keepMemberId_NotExistsReferrer_MemberLoginList(cb.query());
        registerNotExistsReferrer(cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "memberLoginList");
    }
    def keepMemberId_NotExistsReferrer_MemberLoginList(sq: MemberLoginCQ): String;

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br />
     * {not exists (select MEMBER_ID from PURCHASE where ...)} <br />
     * (購入)PURCHASE by MEMBER_ID, named 'purchaseAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">notExistsPurchaseList</span>(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of MemberId_NotExistsReferrer_PurchaseList for 'not exists'. (NotNull)
     */
    def notExistsPurchaseList(subQuery: (PurchaseCB) => Unit): Unit = {
        assertObjectNotNull("subQuery", subQuery);
        val cb: PurchaseCB = new PurchaseCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery(cb); } finally { unlock(); }
        val pp: String = keepMemberId_NotExistsReferrer_PurchaseList(cb.query());
        registerNotExistsReferrer(cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "purchaseList");
    }
    def keepMemberId_NotExistsReferrer_PurchaseList(sq: PurchaseCQ): String;

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select MEMBER_ID from MEMBER_ADDRESS where ...)} <br />
     * (会員住所情報)MEMBER_ADDRESS by MEMBER_ID, named 'memberAddressAsOne'.
     * @param subQuery The sub-query of MemberAddressList for 'in-scope'. (NotNull)
     */
    def inScopeMemberAddressList(subQuery: (MemberAddressCB) => Unit): Unit = {
        assertObjectNotNull("subQuery", subQuery);
        val cb: MemberAddressCB = new MemberAddressCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery(cb); } finally { unlock(); }
        val pp: String = keepMemberId_InScopeRelation_MemberAddressList(cb.query());
        registerInScopeRelation(cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "memberAddressList");
    }
    def keepMemberId_InScopeRelation_MemberAddressList(sq: MemberAddressCQ): String;

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select MY_MEMBER_ID from MEMBER_FOLLOWING where ...)} <br />
     * (会員フォローイング)MEMBER_FOLLOWING by MY_MEMBER_ID, named 'memberFollowingByMyMemberIdAsOne'.
     * @param subQuery The sub-query of MemberFollowingByMyMemberIdList for 'in-scope'. (NotNull)
     */
    def inScopeMemberFollowingByMyMemberIdList(subQuery: (MemberFollowingCB) => Unit): Unit = {
        assertObjectNotNull("subQuery", subQuery);
        val cb: MemberFollowingCB = new MemberFollowingCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery(cb); } finally { unlock(); }
        val pp: String = keepMemberId_InScopeRelation_MemberFollowingByMyMemberIdList(cb.query());
        registerInScopeRelation(cb.query(), "MEMBER_ID", "MY_MEMBER_ID", pp, "memberFollowingByMyMemberIdList");
    }
    def keepMemberId_InScopeRelation_MemberFollowingByMyMemberIdList(sq: MemberFollowingCQ): String;

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select YOUR_MEMBER_ID from MEMBER_FOLLOWING where ...)} <br />
     * (会員フォローイング)MEMBER_FOLLOWING by YOUR_MEMBER_ID, named 'memberFollowingByYourMemberIdAsOne'.
     * @param subQuery The sub-query of MemberFollowingByYourMemberIdList for 'in-scope'. (NotNull)
     */
    def inScopeMemberFollowingByYourMemberIdList(subQuery: (MemberFollowingCB) => Unit): Unit = {
        assertObjectNotNull("subQuery", subQuery);
        val cb: MemberFollowingCB = new MemberFollowingCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery(cb); } finally { unlock(); }
        val pp: String = keepMemberId_InScopeRelation_MemberFollowingByYourMemberIdList(cb.query());
        registerInScopeRelation(cb.query(), "MEMBER_ID", "YOUR_MEMBER_ID", pp, "memberFollowingByYourMemberIdList");
    }
    def keepMemberId_InScopeRelation_MemberFollowingByYourMemberIdList(sq: MemberFollowingCQ): String;

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select MEMBER_ID from MEMBER_LOGIN where ...)} <br />
     * (会員ログイン)MEMBER_LOGIN by MEMBER_ID, named 'memberLoginAsOne'.
     * @param subQuery The sub-query of MemberLoginList for 'in-scope'. (NotNull)
     */
    def inScopeMemberLoginList(subQuery: (MemberLoginCB) => Unit): Unit = {
        assertObjectNotNull("subQuery", subQuery);
        val cb: MemberLoginCB = new MemberLoginCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery(cb); } finally { unlock(); }
        val pp: String = keepMemberId_InScopeRelation_MemberLoginList(cb.query());
        registerInScopeRelation(cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "memberLoginList");
    }
    def keepMemberId_InScopeRelation_MemberLoginList(sq: MemberLoginCQ): String;

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select MEMBER_ID from PURCHASE where ...)} <br />
     * (購入)PURCHASE by MEMBER_ID, named 'purchaseAsOne'.
     * @param subQuery The sub-query of PurchaseList for 'in-scope'. (NotNull)
     */
    def inScopePurchaseList(subQuery: (PurchaseCB) => Unit): Unit = {
        assertObjectNotNull("subQuery", subQuery);
        val cb: PurchaseCB = new PurchaseCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery(cb); } finally { unlock(); }
        val pp: String = keepMemberId_InScopeRelation_PurchaseList(cb.query());
        registerInScopeRelation(cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "purchaseList");
    }
    def keepMemberId_InScopeRelation_PurchaseList(sq: PurchaseCQ): String;

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select MEMBER_ID from MEMBER_ADDRESS where ...)} <br />
     * (会員住所情報)MEMBER_ADDRESS by MEMBER_ID, named 'memberAddressAsOne'.
     * @param subQuery The sub-query of MemberAddressList for 'not in-scope'. (NotNull)
     */
    def notInScopeMemberAddressList(subQuery: (MemberAddressCB) => Unit): Unit = {
        assertObjectNotNull("subQuery", subQuery);
        val cb: MemberAddressCB = new MemberAddressCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery(cb); } finally { unlock(); }
        val pp: String = keepMemberId_NotInScopeRelation_MemberAddressList(cb.query());
        registerNotInScopeRelation(cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "memberAddressList");
    }
    def keepMemberId_NotInScopeRelation_MemberAddressList(sq: MemberAddressCQ): String;

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select MY_MEMBER_ID from MEMBER_FOLLOWING where ...)} <br />
     * (会員フォローイング)MEMBER_FOLLOWING by MY_MEMBER_ID, named 'memberFollowingByMyMemberIdAsOne'.
     * @param subQuery The sub-query of MemberFollowingByMyMemberIdList for 'not in-scope'. (NotNull)
     */
    def notInScopeMemberFollowingByMyMemberIdList(subQuery: (MemberFollowingCB) => Unit): Unit = {
        assertObjectNotNull("subQuery", subQuery);
        val cb: MemberFollowingCB = new MemberFollowingCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery(cb); } finally { unlock(); }
        val pp: String = keepMemberId_NotInScopeRelation_MemberFollowingByMyMemberIdList(cb.query());
        registerNotInScopeRelation(cb.query(), "MEMBER_ID", "MY_MEMBER_ID", pp, "memberFollowingByMyMemberIdList");
    }
    def keepMemberId_NotInScopeRelation_MemberFollowingByMyMemberIdList(sq: MemberFollowingCQ): String;

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select YOUR_MEMBER_ID from MEMBER_FOLLOWING where ...)} <br />
     * (会員フォローイング)MEMBER_FOLLOWING by YOUR_MEMBER_ID, named 'memberFollowingByYourMemberIdAsOne'.
     * @param subQuery The sub-query of MemberFollowingByYourMemberIdList for 'not in-scope'. (NotNull)
     */
    def notInScopeMemberFollowingByYourMemberIdList(subQuery: (MemberFollowingCB) => Unit): Unit = {
        assertObjectNotNull("subQuery", subQuery);
        val cb: MemberFollowingCB = new MemberFollowingCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery(cb); } finally { unlock(); }
        val pp: String = keepMemberId_NotInScopeRelation_MemberFollowingByYourMemberIdList(cb.query());
        registerNotInScopeRelation(cb.query(), "MEMBER_ID", "YOUR_MEMBER_ID", pp, "memberFollowingByYourMemberIdList");
    }
    def keepMemberId_NotInScopeRelation_MemberFollowingByYourMemberIdList(sq: MemberFollowingCQ): String;

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select MEMBER_ID from MEMBER_LOGIN where ...)} <br />
     * (会員ログイン)MEMBER_LOGIN by MEMBER_ID, named 'memberLoginAsOne'.
     * @param subQuery The sub-query of MemberLoginList for 'not in-scope'. (NotNull)
     */
    def notInScopeMemberLoginList(subQuery: (MemberLoginCB) => Unit): Unit = {
        assertObjectNotNull("subQuery", subQuery);
        val cb: MemberLoginCB = new MemberLoginCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery(cb); } finally { unlock(); }
        val pp: String = keepMemberId_NotInScopeRelation_MemberLoginList(cb.query());
        registerNotInScopeRelation(cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "memberLoginList");
    }
    def keepMemberId_NotInScopeRelation_MemberLoginList(sq: MemberLoginCQ): String;

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select MEMBER_ID from PURCHASE where ...)} <br />
     * (購入)PURCHASE by MEMBER_ID, named 'purchaseAsOne'.
     * @param subQuery The sub-query of PurchaseList for 'not in-scope'. (NotNull)
     */
    def notInScopePurchaseList(subQuery: (PurchaseCB) => Unit): Unit = {
        assertObjectNotNull("subQuery", subQuery);
        val cb: PurchaseCB = new PurchaseCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery(cb); } finally { unlock(); }
        val pp: String = keepMemberId_NotInScopeRelation_PurchaseList(cb.query());
        registerNotInScopeRelation(cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "purchaseList");
    }
    def keepMemberId_NotInScopeRelation_PurchaseList(sq: PurchaseCQ): String;

    def xsderiveMemberAddressList(fn: String, sq: SubQuery[MemberAddressCB], al: String, op: DerivedReferrerOption): Unit = {
        assertObjectNotNull("subQuery", sq);
        val cb: MemberAddressCB = new MemberAddressCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        val pp: String = keepMemberId_SpecifyDerivedReferrer_MemberAddressList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "memberAddressList", al, op);
    }
    def keepMemberId_SpecifyDerivedReferrer_MemberAddressList(sq: MemberAddressCQ): String;

    def xsderiveMemberFollowingByMyMemberIdList(fn: String, sq: SubQuery[MemberFollowingCB], al: String, op: DerivedReferrerOption): Unit = {
        assertObjectNotNull("subQuery", sq);
        val cb: MemberFollowingCB = new MemberFollowingCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        val pp: String = keepMemberId_SpecifyDerivedReferrer_MemberFollowingByMyMemberIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "MEMBER_ID", "MY_MEMBER_ID", pp, "memberFollowingByMyMemberIdList", al, op);
    }
    def keepMemberId_SpecifyDerivedReferrer_MemberFollowingByMyMemberIdList(sq: MemberFollowingCQ): String;

    def xsderiveMemberFollowingByYourMemberIdList(fn: String, sq: SubQuery[MemberFollowingCB], al: String, op: DerivedReferrerOption): Unit = {
        assertObjectNotNull("subQuery", sq);
        val cb: MemberFollowingCB = new MemberFollowingCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        val pp: String = keepMemberId_SpecifyDerivedReferrer_MemberFollowingByYourMemberIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "MEMBER_ID", "YOUR_MEMBER_ID", pp, "memberFollowingByYourMemberIdList", al, op);
    }
    def keepMemberId_SpecifyDerivedReferrer_MemberFollowingByYourMemberIdList(sq: MemberFollowingCQ): String;

    def xsderiveMemberLoginList(fn: String, sq: SubQuery[MemberLoginCB], al: String, op: DerivedReferrerOption): Unit = {
        assertObjectNotNull("subQuery", sq);
        val cb: MemberLoginCB = new MemberLoginCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        val pp: String = keepMemberId_SpecifyDerivedReferrer_MemberLoginList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "memberLoginList", al, op);
    }
    def keepMemberId_SpecifyDerivedReferrer_MemberLoginList(sq: MemberLoginCQ): String;

    def xsderivePurchaseList(fn: String, sq: SubQuery[PurchaseCB], al: String, op: DerivedReferrerOption): Unit = {
        assertObjectNotNull("subQuery", sq);
        val cb: PurchaseCB = new PurchaseCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        val pp: String = keepMemberId_SpecifyDerivedReferrer_PurchaseList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "purchaseList", al, op);
    }
    def keepMemberId_SpecifyDerivedReferrer_PurchaseList(sq: PurchaseCQ): String;

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br />
     * {FOO &lt;= (select max(BAR) from MEMBER_ADDRESS where ...)} <br />
     * (会員住所情報)MEMBER_ADDRESS by MEMBER_ID, named 'memberAddressAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">derivedMemberAddressList()</span>.<span style="color: #DD4747">max</span>(new SubQuery&lt;MemberAddressCB&gt;() {
     *     public void query(MemberAddressCB subCB) {
     *         subCB.specify().<span style="color: #DD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #DD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    def derivedMemberAddressList(): ScrHpQDRFunction[MemberAddressCB] = {
        return toScalaQDRFunction(xcreateQDRFunctionMemberAddressList());
    }
    protected def xcreateQDRFunctionMemberAddressList(): HpQDRFunction[MemberAddressCB] = {
        return new HpQDRFunction[MemberAddressCB](new HpQDRSetupper[MemberAddressCB]() {
            def setup(fn: String, sq: SubQuery[MemberAddressCB], rd: String, vl: Object, op: DerivedReferrerOption): Unit = {
                xqderiveMemberAddressList(fn, sq, rd, vl, op);
            }
        });
    }
    def xqderiveMemberAddressList(fn: String, sq: SubQuery[MemberAddressCB], rd: String, vl: Object, op: DerivedReferrerOption): Unit = {
        assertObjectNotNull("subQuery", sq);
        val cb: MemberAddressCB = new MemberAddressCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        val sqpp: String = keepMemberId_QueryDerivedReferrer_MemberAddressList(cb.query());
        val prpp: String = keepMemberId_QueryDerivedReferrer_MemberAddressListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "MEMBER_ID", "MEMBER_ID", sqpp, "memberAddressList", rd, vl, prpp, op);
    }
    def keepMemberId_QueryDerivedReferrer_MemberAddressList(sq: MemberAddressCQ): String;
    def keepMemberId_QueryDerivedReferrer_MemberAddressListParameter(vl: Object): String;

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br />
     * {FOO &lt;= (select max(BAR) from MEMBER_FOLLOWING where ...)} <br />
     * (会員フォローイング)MEMBER_FOLLOWING by MY_MEMBER_ID, named 'memberFollowingByMyMemberIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">derivedMemberFollowingByMyMemberIdList()</span>.<span style="color: #DD4747">max</span>(new SubQuery&lt;MemberFollowingCB&gt;() {
     *     public void query(MemberFollowingCB subCB) {
     *         subCB.specify().<span style="color: #DD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #DD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    def derivedMemberFollowingByMyMemberIdList(): ScrHpQDRFunction[MemberFollowingCB] = {
        return toScalaQDRFunction(xcreateQDRFunctionMemberFollowingByMyMemberIdList());
    }
    protected def xcreateQDRFunctionMemberFollowingByMyMemberIdList(): HpQDRFunction[MemberFollowingCB] = {
        return new HpQDRFunction[MemberFollowingCB](new HpQDRSetupper[MemberFollowingCB]() {
            def setup(fn: String, sq: SubQuery[MemberFollowingCB], rd: String, vl: Object, op: DerivedReferrerOption): Unit = {
                xqderiveMemberFollowingByMyMemberIdList(fn, sq, rd, vl, op);
            }
        });
    }
    def xqderiveMemberFollowingByMyMemberIdList(fn: String, sq: SubQuery[MemberFollowingCB], rd: String, vl: Object, op: DerivedReferrerOption): Unit = {
        assertObjectNotNull("subQuery", sq);
        val cb: MemberFollowingCB = new MemberFollowingCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        val sqpp: String = keepMemberId_QueryDerivedReferrer_MemberFollowingByMyMemberIdList(cb.query());
        val prpp: String = keepMemberId_QueryDerivedReferrer_MemberFollowingByMyMemberIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "MEMBER_ID", "MY_MEMBER_ID", sqpp, "memberFollowingByMyMemberIdList", rd, vl, prpp, op);
    }
    def keepMemberId_QueryDerivedReferrer_MemberFollowingByMyMemberIdList(sq: MemberFollowingCQ): String;
    def keepMemberId_QueryDerivedReferrer_MemberFollowingByMyMemberIdListParameter(vl: Object): String;

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br />
     * {FOO &lt;= (select max(BAR) from MEMBER_FOLLOWING where ...)} <br />
     * (会員フォローイング)MEMBER_FOLLOWING by YOUR_MEMBER_ID, named 'memberFollowingByYourMemberIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">derivedMemberFollowingByYourMemberIdList()</span>.<span style="color: #DD4747">max</span>(new SubQuery&lt;MemberFollowingCB&gt;() {
     *     public void query(MemberFollowingCB subCB) {
     *         subCB.specify().<span style="color: #DD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #DD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    def derivedMemberFollowingByYourMemberIdList(): ScrHpQDRFunction[MemberFollowingCB] = {
        return toScalaQDRFunction(xcreateQDRFunctionMemberFollowingByYourMemberIdList());
    }
    protected def xcreateQDRFunctionMemberFollowingByYourMemberIdList(): HpQDRFunction[MemberFollowingCB] = {
        return new HpQDRFunction[MemberFollowingCB](new HpQDRSetupper[MemberFollowingCB]() {
            def setup(fn: String, sq: SubQuery[MemberFollowingCB], rd: String, vl: Object, op: DerivedReferrerOption): Unit = {
                xqderiveMemberFollowingByYourMemberIdList(fn, sq, rd, vl, op);
            }
        });
    }
    def xqderiveMemberFollowingByYourMemberIdList(fn: String, sq: SubQuery[MemberFollowingCB], rd: String, vl: Object, op: DerivedReferrerOption): Unit = {
        assertObjectNotNull("subQuery", sq);
        val cb: MemberFollowingCB = new MemberFollowingCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        val sqpp: String = keepMemberId_QueryDerivedReferrer_MemberFollowingByYourMemberIdList(cb.query());
        val prpp: String = keepMemberId_QueryDerivedReferrer_MemberFollowingByYourMemberIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "MEMBER_ID", "YOUR_MEMBER_ID", sqpp, "memberFollowingByYourMemberIdList", rd, vl, prpp, op);
    }
    def keepMemberId_QueryDerivedReferrer_MemberFollowingByYourMemberIdList(sq: MemberFollowingCQ): String;
    def keepMemberId_QueryDerivedReferrer_MemberFollowingByYourMemberIdListParameter(vl: Object): String;

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br />
     * {FOO &lt;= (select max(BAR) from MEMBER_LOGIN where ...)} <br />
     * (会員ログイン)MEMBER_LOGIN by MEMBER_ID, named 'memberLoginAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">derivedMemberLoginList()</span>.<span style="color: #DD4747">max</span>(new SubQuery&lt;MemberLoginCB&gt;() {
     *     public void query(MemberLoginCB subCB) {
     *         subCB.specify().<span style="color: #DD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #DD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    def derivedMemberLoginList(): ScrHpQDRFunction[MemberLoginCB] = {
        return toScalaQDRFunction(xcreateQDRFunctionMemberLoginList());
    }
    protected def xcreateQDRFunctionMemberLoginList(): HpQDRFunction[MemberLoginCB] = {
        return new HpQDRFunction[MemberLoginCB](new HpQDRSetupper[MemberLoginCB]() {
            def setup(fn: String, sq: SubQuery[MemberLoginCB], rd: String, vl: Object, op: DerivedReferrerOption): Unit = {
                xqderiveMemberLoginList(fn, sq, rd, vl, op);
            }
        });
    }
    def xqderiveMemberLoginList(fn: String, sq: SubQuery[MemberLoginCB], rd: String, vl: Object, op: DerivedReferrerOption): Unit = {
        assertObjectNotNull("subQuery", sq);
        val cb: MemberLoginCB = new MemberLoginCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        val sqpp: String = keepMemberId_QueryDerivedReferrer_MemberLoginList(cb.query());
        val prpp: String = keepMemberId_QueryDerivedReferrer_MemberLoginListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "MEMBER_ID", "MEMBER_ID", sqpp, "memberLoginList", rd, vl, prpp, op);
    }
    def keepMemberId_QueryDerivedReferrer_MemberLoginList(sq: MemberLoginCQ): String;
    def keepMemberId_QueryDerivedReferrer_MemberLoginListParameter(vl: Object): String;

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br />
     * {FOO &lt;= (select max(BAR) from PURCHASE where ...)} <br />
     * (購入)PURCHASE by MEMBER_ID, named 'purchaseAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">derivedPurchaseList()</span>.<span style="color: #DD4747">max</span>(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().<span style="color: #DD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #DD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    def derivedPurchaseList(): ScrHpQDRFunction[PurchaseCB] = {
        return toScalaQDRFunction(xcreateQDRFunctionPurchaseList());
    }
    protected def xcreateQDRFunctionPurchaseList(): HpQDRFunction[PurchaseCB] = {
        return new HpQDRFunction[PurchaseCB](new HpQDRSetupper[PurchaseCB]() {
            def setup(fn: String, sq: SubQuery[PurchaseCB], rd: String, vl: Object, op: DerivedReferrerOption): Unit = {
                xqderivePurchaseList(fn, sq, rd, vl, op);
            }
        });
    }
    def xqderivePurchaseList(fn: String, sq: SubQuery[PurchaseCB], rd: String, vl: Object, op: DerivedReferrerOption): Unit = {
        assertObjectNotNull("subQuery", sq);
        val cb: PurchaseCB = new PurchaseCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        val sqpp: String = keepMemberId_QueryDerivedReferrer_PurchaseList(cb.query());
        val prpp: String = keepMemberId_QueryDerivedReferrer_PurchaseListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "MEMBER_ID", "MEMBER_ID", sqpp, "purchaseList", rd, vl, prpp, op);
    }
    def keepMemberId_QueryDerivedReferrer_PurchaseList(sq: PurchaseCQ): String;
    def keepMemberId_QueryDerivedReferrer_PurchaseListParameter(vl: Object): String;

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * (会員ID)MEMBER_ID: {PK, ID, NotNull, INTEGER(10)}
     */
    def setMemberId_IsNull(): Unit = { regMemberId(CK_ISN, AbstractConditionQuery.DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * (会員ID)MEMBER_ID: {PK, ID, NotNull, INTEGER(10)}
     */
    def setMemberId_IsNotNull(): Unit = { regMemberId(CK_ISNN, AbstractConditionQuery.DOBJ); }

    protected def regMemberId(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValueMemberId(), "MEMBER_ID"); }
    protected def getCValueMemberId(): ConditionValue;

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (会員名称)MEMBER_NAME: {IX, NotNull, VARCHAR(200)}
     * @param memberName The value of memberName as equal. (NullAllowed: if null (or empty), no condition)
     */
    def setMemberName_Equal(memberName: String): Unit = {
        doSetMemberName_Equal(fRES(memberName));
    }

    protected def doSetMemberName_Equal(memberName: String): Unit = {
        regMemberName(CK_EQ, memberName);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (会員名称)MEMBER_NAME: {IX, NotNull, VARCHAR(200)}
     * @param memberName The value of memberName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    def setMemberName_PrefixSearch(memberName: String): Unit = {
        setMemberName_LikeSearch(memberName)(_.likePrefix);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (会員名称)MEMBER_NAME: {IX, NotNull, VARCHAR(200)} <br />
     * <pre>e.g. setMemberName_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param memberName The value of memberName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param optionCall The callback for option of like-search. (NotNull)
     */
    def setMemberName_LikeSearch(memberName: String)(optionCall: (ScrLikeSearchOption) => Unit): Unit = {
        regLSQ(CK_LS, fRES(memberName), getCValueMemberName(), "MEMBER_NAME", callbackLSOP(optionCall));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (会員名称)MEMBER_NAME: {IX, NotNull, VARCHAR(200)}
     * @param memberName The value of memberName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param optionCall The callback for option of not-like-search. (NotNull)
     */
    def setMemberName_NotLikeSearch(memberName: String)(optionCall: (ScrLikeSearchOption) => Unit): Unit = {
        regLSQ(CK_NLS, fRES(memberName), getCValueMemberName(), "MEMBER_NAME", callbackLSOP(optionCall));
    }

    protected def regMemberName(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValueMemberName(), "MEMBER_NAME"); }
    protected def getCValueMemberName(): ConditionValue;

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (会員アカウント)MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR(50)}
     * @param memberAccount The value of memberAccount as equal. (NullAllowed: if null (or empty), no condition)
     */
    def setMemberAccount_Equal(memberAccount: String): Unit = {
        doSetMemberAccount_Equal(fRES(memberAccount));
    }

    protected def doSetMemberAccount_Equal(memberAccount: String): Unit = {
        regMemberAccount(CK_EQ, memberAccount);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (会員アカウント)MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR(50)}
     * @param memberAccount The value of memberAccount as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    def setMemberAccount_NotEqual(memberAccount: String): Unit = {
        doSetMemberAccount_NotEqual(fRES(memberAccount));
    }

    protected def doSetMemberAccount_NotEqual(memberAccount: String): Unit = {
        regMemberAccount(CK_NES, memberAccount);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (会員アカウント)MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR(50)}
     * @param memberAccountList The collection of memberAccount as inScope. (NullAllowed: if null (or empty), no condition)
     */
    def setMemberAccount_InScope(memberAccountList: List[String]): Unit = {
        doSetMemberAccount_InScope(toMutableValueCollectionImplicitly(memberAccountList));
    }

    protected def doSetMemberAccount_InScope(memberAccountList: Collection[String]): Unit = {
        regINS(CK_INS, cTL(memberAccountList), getCValueMemberAccount(), "MEMBER_ACCOUNT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (会員アカウント)MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR(50)}
     * @param memberAccountList The collection of memberAccount as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    def setMemberAccount_NotInScope(memberAccountList: List[String]): Unit = {
        doSetMemberAccount_NotInScope(if (memberAccountList != null) { memberAccountList.map(_.asInstanceOf[String]).asJava } else { null });
    }

    protected def doSetMemberAccount_NotInScope(memberAccountList: Collection[String]): Unit = {
        regINS(CK_NINS, cTL(memberAccountList), getCValueMemberAccount(), "MEMBER_ACCOUNT");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (会員アカウント)MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR(50)}
     * @param memberAccount The value of memberAccount as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    def setMemberAccount_PrefixSearch(memberAccount: String): Unit = {
        setMemberAccount_LikeSearch(memberAccount)(_.likePrefix);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (会員アカウント)MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR(50)} <br />
     * <pre>e.g. setMemberAccount_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param memberAccount The value of memberAccount as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param optionCall The callback for option of like-search. (NotNull)
     */
    def setMemberAccount_LikeSearch(memberAccount: String)(optionCall: (ScrLikeSearchOption) => Unit): Unit = {
        regLSQ(CK_LS, fRES(memberAccount), getCValueMemberAccount(), "MEMBER_ACCOUNT", callbackLSOP(optionCall));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (会員アカウント)MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR(50)}
     * @param memberAccount The value of memberAccount as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param optionCall The callback for option of not-like-search. (NotNull)
     */
    def setMemberAccount_NotLikeSearch(memberAccount: String)(optionCall: (ScrLikeSearchOption) => Unit): Unit = {
        regLSQ(CK_NLS, fRES(memberAccount), getCValueMemberAccount(), "MEMBER_ACCOUNT", callbackLSOP(optionCall));
    }

    protected def regMemberAccount(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValueMemberAccount(), "MEMBER_ACCOUNT"); }
    protected def getCValueMemberAccount(): ConditionValue;

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (会員ステータスコード)MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus}
     * @param memberStatusCode The value of memberStatusCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    protected def setMemberStatusCode_Equal(memberStatusCode: String): Unit = {
        doSetMemberStatusCode_Equal(fRES(memberStatusCode));
    }

    /**
     * Equal(=). As MemberStatus. And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (会員ステータスコード)MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus} <br />
     * status of member from entry to withdrawal
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, no condition)
     */
    def setMemberStatusCode_Equal_AsMemberStatus(cdef: CDef.MemberStatus): Unit = {
        doSetMemberStatusCode_Equal(if (cdef != null) { cdef.code } else { null });
    }

    /**
     * Equal(=). As Formalized (FML). And OnlyOnceRegistered. <br />
     * Formalized: as formal member, allowed to use all service
     */
    def setMemberStatusCode_Equal_Formalized(): Unit = {
        setMemberStatusCode_Equal_AsMemberStatus(CDef.MemberStatus.Formalized);
    }

    /**
     * Equal(=). As Withdrawal (WDL). And OnlyOnceRegistered. <br />
     * Withdrawal: withdrawal is fixed, not allowed to use service
     */
    def setMemberStatusCode_Equal_Withdrawal(): Unit = {
        setMemberStatusCode_Equal_AsMemberStatus(CDef.MemberStatus.Withdrawal);
    }

    /**
     * Equal(=). As Provisional (PRV). And OnlyOnceRegistered. <br />
     * Provisional: first status after entry, allowed to use only part of service
     */
    def setMemberStatusCode_Equal_Provisional(): Unit = {
        setMemberStatusCode_Equal_AsMemberStatus(CDef.MemberStatus.Provisional);
    }

    protected def doSetMemberStatusCode_Equal(memberStatusCode: String): Unit = {
        regMemberStatusCode(CK_EQ, hSC("MEMBER_STATUS_CODE", memberStatusCode, 3, "E"));
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (会員ステータスコード)MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus}
     * @param memberStatusCode The value of memberStatusCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    protected def setMemberStatusCode_NotEqual(memberStatusCode: String): Unit = {
        doSetMemberStatusCode_NotEqual(fRES(memberStatusCode));
    }

    /**
     * NotEqual(&lt;&gt;). As MemberStatus. And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (会員ステータスコード)MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus} <br />
     * status of member from entry to withdrawal
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, no condition)
     */
    def setMemberStatusCode_NotEqual_AsMemberStatus(cdef: CDef.MemberStatus): Unit = {
        doSetMemberStatusCode_NotEqual(if (cdef != null) { cdef.code } else { null });
    }

    /**
     * NotEqual(&lt;&gt;). As Formalized (FML). And OnlyOnceRegistered. <br />
     * Formalized: as formal member, allowed to use all service
     */
    def setMemberStatusCode_NotEqual_Formalized(): Unit = {
        setMemberStatusCode_NotEqual_AsMemberStatus(CDef.MemberStatus.Formalized);
    }

    /**
     * NotEqual(&lt;&gt;). As Withdrawal (WDL). And OnlyOnceRegistered. <br />
     * Withdrawal: withdrawal is fixed, not allowed to use service
     */
    def setMemberStatusCode_NotEqual_Withdrawal(): Unit = {
        setMemberStatusCode_NotEqual_AsMemberStatus(CDef.MemberStatus.Withdrawal);
    }

    /**
     * NotEqual(&lt;&gt;). As Provisional (PRV). And OnlyOnceRegistered. <br />
     * Provisional: first status after entry, allowed to use only part of service
     */
    def setMemberStatusCode_NotEqual_Provisional(): Unit = {
        setMemberStatusCode_NotEqual_AsMemberStatus(CDef.MemberStatus.Provisional);
    }

    protected def doSetMemberStatusCode_NotEqual(memberStatusCode: String): Unit = {
        regMemberStatusCode(CK_NES, hSC("MEMBER_STATUS_CODE", memberStatusCode, 3, "E"));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (会員ステータスコード)MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus}
     * @param memberStatusCodeList The collection of memberStatusCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    def setMemberStatusCode_InScope(memberStatusCodeList: List[String]): Unit = {
        doSetMemberStatusCode_InScope(toMutableValueCollectionImplicitly(memberStatusCodeList));
    }

    /**
     * InScope {in ('a', 'b')}. As MemberStatus. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (会員ステータスコード)MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus} <br />
     * status of member from entry to withdrawal
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    def setMemberStatusCode_InScope_AsMemberStatus(cdefList: List[CDef.MemberStatus]): Unit = {
        doSetMemberStatusCode_InScope(cTStrL(cdefList.asJava));
    }

    protected def doSetMemberStatusCode_InScope(memberStatusCodeList: Collection[String]): Unit = {
        regINS(CK_INS, cTL(memberStatusCodeList), getCValueMemberStatusCode(), "MEMBER_STATUS_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (会員ステータスコード)MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus}
     * @param memberStatusCodeList The collection of memberStatusCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    def setMemberStatusCode_NotInScope(memberStatusCodeList: List[String]): Unit = {
        doSetMemberStatusCode_NotInScope(if (memberStatusCodeList != null) { memberStatusCodeList.map(_.asInstanceOf[String]).asJava } else { null });
    }

    /**
     * NotInScope {not in ('a', 'b')}. As MemberStatus. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (会員ステータスコード)MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus} <br />
     * status of member from entry to withdrawal
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    def setMemberStatusCode_NotInScope_AsMemberStatus(cdefList: List[CDef.MemberStatus]): Unit = {
        doSetMemberStatusCode_NotInScope(cTStrL(cdefList.asJava));
    }

    protected def doSetMemberStatusCode_NotInScope(memberStatusCodeList: Collection[String]): Unit = {
        regINS(CK_NINS, cTL(memberStatusCodeList), getCValueMemberStatusCode(), "MEMBER_STATUS_CODE");
    }

    protected def regMemberStatusCode(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValueMemberStatusCode(), "MEMBER_STATUS_CODE"); }
    protected def getCValueMemberStatusCode(): ConditionValue;

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * (正式会員日時)FORMALIZED_DATETIME: {IX, TIMESTAMP(23, 10)}
     * @param formalizedDatetime The value of formalizedDatetime as equal. (NullAllowed: if null, no condition)
     */
    def setFormalizedDatetime_Equal(formalizedDatetime: org.joda.time.LocalDateTime): Unit = {
        regFormalizedDatetime(CK_EQ,  formalizedDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (正式会員日時)FORMALIZED_DATETIME: {IX, TIMESTAMP(23, 10)}
     * @param formalizedDatetime The value of formalizedDatetime as greaterThan. (NullAllowed: if null, no condition)
     */
    def setFormalizedDatetime_GreaterThan(formalizedDatetime: org.joda.time.LocalDateTime): Unit = {
        regFormalizedDatetime(CK_GT,  formalizedDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (正式会員日時)FORMALIZED_DATETIME: {IX, TIMESTAMP(23, 10)}
     * @param formalizedDatetime The value of formalizedDatetime as lessThan. (NullAllowed: if null, no condition)
     */
    def setFormalizedDatetime_LessThan(formalizedDatetime: org.joda.time.LocalDateTime): Unit = {
        regFormalizedDatetime(CK_LT,  formalizedDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (正式会員日時)FORMALIZED_DATETIME: {IX, TIMESTAMP(23, 10)}
     * @param formalizedDatetime The value of formalizedDatetime as greaterEqual. (NullAllowed: if null, no condition)
     */
    def setFormalizedDatetime_GreaterEqual(formalizedDatetime: org.joda.time.LocalDateTime): Unit = {
        regFormalizedDatetime(CK_GE,  formalizedDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (正式会員日時)FORMALIZED_DATETIME: {IX, TIMESTAMP(23, 10)}
     * @param formalizedDatetime The value of formalizedDatetime as lessEqual. (NullAllowed: if null, no condition)
     */
    def setFormalizedDatetime_LessEqual(formalizedDatetime: org.joda.time.LocalDateTime): Unit = {
        regFormalizedDatetime(CK_LE, formalizedDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (正式会員日時)FORMALIZED_DATETIME: {IX, TIMESTAMP(23, 10)}
     * <pre>e.g. setFormalizedDatetime_FromTo(fromDate, toDate, new <span style="color: #DD4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of formalizedDatetime. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of formalizedDatetime. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    def setFormalizedDatetime_FromTo(fromDatetime: org.joda.time.LocalDateTime, toDatetime: org.joda.time.LocalDateTime)(optionCall: (ScrFromToOption) => Unit): Unit = {
        regFTQ(toTimestamp(fromDatetime), toTimestamp(toDatetime), getCValueFormalizedDatetime(), "FORMALIZED_DATETIME", callbackFTOP(optionCall));
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (正式会員日時)FORMALIZED_DATETIME: {IX, TIMESTAMP(23, 10)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #DD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of formalizedDatetime. (NullAllowed: if null, no from-condition)
     * @param toDate The to-date(yyyy/MM/dd) of formalizedDatetime. (NullAllowed: if null, no to-condition)
     */
    def setFormalizedDatetime_DateFromTo(fromDate: org.joda.time.LocalDateTime, toDate: org.joda.time.LocalDateTime): Unit = {
        setFormalizedDatetime_FromTo(fromDate, toDate)(_.compareAsDate);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * (正式会員日時)FORMALIZED_DATETIME: {IX, TIMESTAMP(23, 10)}
     */
    def setFormalizedDatetime_IsNull(): Unit = { regFormalizedDatetime(CK_ISN, AbstractConditionQuery.DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * (正式会員日時)FORMALIZED_DATETIME: {IX, TIMESTAMP(23, 10)}
     */
    def setFormalizedDatetime_IsNotNull(): Unit = { regFormalizedDatetime(CK_ISNN, AbstractConditionQuery.DOBJ); }

    protected def regFormalizedDatetime(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValueFormalizedDatetime(), "FORMALIZED_DATETIME"); }
    protected def getCValueFormalizedDatetime(): ConditionValue;

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * (生年月日)BIRTHDATE: {DATE(8)}
     * @param birthdate The value of birthdate as equal. (NullAllowed: if null, no condition)
     */
    def setBirthdate_Equal(birthdate: org.joda.time.LocalDate): Unit = {
        regBirthdate(CK_EQ,  birthdate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (生年月日)BIRTHDATE: {DATE(8)}
     * @param birthdate The value of birthdate as greaterThan. (NullAllowed: if null, no condition)
     */
    def setBirthdate_GreaterThan(birthdate: org.joda.time.LocalDate): Unit = {
        regBirthdate(CK_GT,  birthdate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (生年月日)BIRTHDATE: {DATE(8)}
     * @param birthdate The value of birthdate as lessThan. (NullAllowed: if null, no condition)
     */
    def setBirthdate_LessThan(birthdate: org.joda.time.LocalDate): Unit = {
        regBirthdate(CK_LT,  birthdate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (生年月日)BIRTHDATE: {DATE(8)}
     * @param birthdate The value of birthdate as greaterEqual. (NullAllowed: if null, no condition)
     */
    def setBirthdate_GreaterEqual(birthdate: org.joda.time.LocalDate): Unit = {
        regBirthdate(CK_GE,  birthdate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (生年月日)BIRTHDATE: {DATE(8)}
     * @param birthdate The value of birthdate as lessEqual. (NullAllowed: if null, no condition)
     */
    def setBirthdate_LessEqual(birthdate: org.joda.time.LocalDate): Unit = {
        regBirthdate(CK_LE, birthdate);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (生年月日)BIRTHDATE: {DATE(8)}
     * <pre>e.g. setBirthdate_FromTo(fromDate, toDate, new <span style="color: #DD4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of birthdate. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of birthdate. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    def setBirthdate_FromTo(fromDatetime: org.joda.time.LocalDate, toDatetime: org.joda.time.LocalDate)(optionCall: (ScrFromToOption) => Unit): Unit = {
        regFTQ(toUtilDate(fromDatetime), toUtilDate(toDatetime), getCValueBirthdate(), "BIRTHDATE", callbackFTOP(optionCall));
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (生年月日)BIRTHDATE: {DATE(8)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #DD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of birthdate. (NullAllowed: if null, no from-condition)
     * @param toDate The to-date(yyyy/MM/dd) of birthdate. (NullAllowed: if null, no to-condition)
     */
    def setBirthdate_DateFromTo(fromDate: org.joda.time.LocalDate, toDate: org.joda.time.LocalDate): Unit = {
        setBirthdate_FromTo(fromDate, toDate)(_.compareAsDate);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * (生年月日)BIRTHDATE: {DATE(8)}
     */
    def setBirthdate_IsNull(): Unit = { regBirthdate(CK_ISN, AbstractConditionQuery.DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * (生年月日)BIRTHDATE: {DATE(8)}
     */
    def setBirthdate_IsNotNull(): Unit = { regBirthdate(CK_ISNN, AbstractConditionQuery.DOBJ); }

    protected def regBirthdate(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValueBirthdate(), "BIRTHDATE"); }
    protected def getCValueBirthdate(): ConditionValue;

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * (登録日時)REGISTER_DATETIME: {NotNull, TIMESTAMP(23, 10)}
     * @param registerDatetime The value of registerDatetime as equal. (NullAllowed: if null, no condition)
     */
    def setRegisterDatetime_Equal(registerDatetime: org.joda.time.LocalDateTime): Unit = {
        regRegisterDatetime(CK_EQ,  registerDatetime);
    }

    protected def regRegisterDatetime(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValueRegisterDatetime(), "REGISTER_DATETIME"); }
    protected def getCValueRegisterDatetime(): ConditionValue;

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (登録ユーザ)REGISTER_USER: {NotNull, VARCHAR(200)}
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
     * (更新日時)UPDATE_DATETIME: {NotNull, TIMESTAMP(23, 10)}
     * @param updateDatetime The value of updateDatetime as equal. (NullAllowed: if null, no condition)
     */
    def setUpdateDatetime_Equal(updateDatetime: org.joda.time.LocalDateTime): Unit = {
        regUpdateDatetime(CK_EQ,  updateDatetime);
    }

    protected def regUpdateDatetime(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValueUpdateDatetime(), "UPDATE_DATETIME"); }
    protected def getCValueUpdateDatetime(): ConditionValue;

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (更新ユーザ)UPDATE_USER: {NotNull, VARCHAR(200)}
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
     * (バージョンNO)VERSION_NO: {NotNull, BIGINT(19)}
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
     * (バージョンNO)VERSION_NO: {NotNull, BIGINT(19)}
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
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;MemberCB&gt;() {
     *     public void query(MemberCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_Equal(): ScrHpSSQFunction[MemberCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_EQ, classOf[MemberCB]));
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;MemberCB&gt;() {
     *     public void query(MemberCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_NotEqual(): ScrHpSSQFunction[MemberCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_NES, classOf[MemberCB]));
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;MemberCB&gt;() {
     *     public void query(MemberCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_GreaterThan(): ScrHpSSQFunction[MemberCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_GT, classOf[MemberCB]));
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;MemberCB&gt;() {
     *     public void query(MemberCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_LessThan(): ScrHpSSQFunction[MemberCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_LT, classOf[MemberCB]));
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;MemberCB&gt;() {
     *     public void query(MemberCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_GreaterEqual(): ScrHpSSQFunction[MemberCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_GE, classOf[MemberCB]));
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MemberCB&gt;() {
     *     public void query(MemberCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_LessEqual(): ScrHpSSQFunction[MemberCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_LE, classOf[MemberCB]));
    }

    protected def toScalaSSQFunction(function: HpSSQFunction[MemberCB]): ScrHpSSQFunction[MemberCB] =
    { new ScrHpSSQFunction(function) }

    override protected def xscalarCondition[CB <: ConditionBean](fn: String, sq: SubQuery[CB], rd: String, op: HpSSQOption[CB]): Unit = {
        assertObjectNotNull("subQuery", sq);
        val cb: MemberCB = xcreateScalarConditionCB(); sq.query(cb.asInstanceOf[CB]);
        val pp: String = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean(xcreateScalarConditionPartitionByCB().asInstanceOf[CB]); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    def keepScalarCondition(sq: MemberCQ): String;

    protected def xcreateScalarConditionCB(): MemberCB = {
        val cb: MemberCB = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected def xcreateScalarConditionPartitionByCB(): MemberCB = {
        val cb: MemberCB = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    def xsmyselfDerive(fn: String, sq: SubQuery[MemberCB], al: String, op: DerivedReferrerOption): Unit = {
        assertObjectNotNull("subQuery", sq);
        val cb: MemberCB = new MemberCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        val pp: String = keepSpecifyMyselfDerived(cb.query());
        val pk: String = "MEMBER_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    def keepSpecifyMyselfDerived(sq: MemberCQ): String;

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    def myselfDerived(): ScrHpQDRFunction[MemberCB] = {
        return toScalaQDRFunction(xcreateQDRFunctionMyselfDerived(classOf[MemberCB]));
    }
    override protected def xqderiveMyselfDerived[CB <: ConditionBean](fn: String, sq: SubQuery[CB], rd: String, vl: Object, op: DerivedReferrerOption): Unit = {
        assertObjectNotNull("subQuery", sq);
        val cb: MemberCB = new MemberCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb.asInstanceOf[CB]);
        val pk: String = "MEMBER_ID";
        val sqpp: String = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        val prpp: String = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    def keepQueryMyselfDerived(sq: MemberCQ): String;
    def keepQueryMyselfDerivedParameter(vl: Object): String;

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    def myselfExists(subQuery: (MemberCB) => Unit): Unit = {
        assertObjectNotNull("subQuery", subQuery);
        val cb: MemberCB = new MemberCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery(cb); } finally { unlock(); }
        val pp: String = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    def keepMyselfExists(sq: MemberCQ): String;

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    def myselfInScope(subQuery: (MemberCB) => Unit): Unit = {
        assertObjectNotNull("subQuery", subQuery);
        val cb: MemberCB = new MemberCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery(cb); } finally { unlock(); }
        val pp: String = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    def keepMyselfInScope(sq: MemberCQ): String;

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
    protected def newMyCB(): MemberCB = {
        return new MemberCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected def xabUDT(): String = { return classOf[Date].getName(); }
    protected def xabCQ(): String = { return classOf[MemberCQ].getName(); }
    protected def xabLSO(): String = { return classOf[LikeSearchOption].getName(); }
    protected def xabSSQS(): String = { return classOf[HpSSQSetupper[_]].getName(); }
}
