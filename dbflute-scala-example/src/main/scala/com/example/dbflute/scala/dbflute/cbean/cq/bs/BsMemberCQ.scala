package com.example.dbflute.scala.dbflute.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean._
import org.seasar.dbflute.cbean.chelper._
import org.seasar.dbflute.cbean.coption._
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;
import com.example.dbflute.scala.dbflute.cbean.cq.ciq._
import com.example.dbflute.scala.dbflute.cbean._
import com.example.dbflute.scala.dbflute.cbean.cq._

/**
 * The base condition-query of MEMBER.
 * @author DBFlute(AutoGenerator)
 */
class BsMemberCQ(referrerQuery: ConditionQuery, sqlClause: SqlClause, aliasName: String, nestLevel: Integer) extends AbstractBsMemberCQ(referrerQuery, sqlClause, aliasName, nestLevel) {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected var _inlineQuery: MemberCIQ = null;

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from MEMBER) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    def inline(): MemberCIQ = {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected def xcreateCIQ(): MemberCIQ = {
        val ciq: MemberCIQ = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected def xnewCIQ(): MemberCIQ = {
        return new MemberCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join MEMBER on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    def on(): MemberCIQ = {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        val inlineQuery: MemberCIQ = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected var _memberId: ConditionValue = null;
    def getMemberId(): ConditionValue =
    { if (_memberId == null) { _memberId = nCV(); }
      return _memberId; }
    protected def getCValueMemberId(): ConditionValue = { return getMemberId(); }

    def getMemberId_ExistsReferrer_MemberAddressList(): Map[String, MemberAddressCQ] = { xgetSQueMap("memberId_ExistsReferrer_MemberAddressList") }
    def keepMemberId_ExistsReferrer_MemberAddressList(sq: MemberAddressCQ): String = { xkeepSQue("memberId_ExistsReferrer_MemberAddressList", sq) }

    def getMemberId_ExistsReferrer_MemberFollowingByMyMemberIdList(): Map[String, MemberFollowingCQ] = { xgetSQueMap("memberId_ExistsReferrer_MemberFollowingByMyMemberIdList") }
    def keepMemberId_ExistsReferrer_MemberFollowingByMyMemberIdList(sq: MemberFollowingCQ): String = { xkeepSQue("memberId_ExistsReferrer_MemberFollowingByMyMemberIdList", sq) }

    def getMemberId_ExistsReferrer_MemberFollowingByYourMemberIdList(): Map[String, MemberFollowingCQ] = { xgetSQueMap("memberId_ExistsReferrer_MemberFollowingByYourMemberIdList") }
    def keepMemberId_ExistsReferrer_MemberFollowingByYourMemberIdList(sq: MemberFollowingCQ): String = { xkeepSQue("memberId_ExistsReferrer_MemberFollowingByYourMemberIdList", sq) }

    def getMemberId_ExistsReferrer_MemberLoginList(): Map[String, MemberLoginCQ] = { xgetSQueMap("memberId_ExistsReferrer_MemberLoginList") }
    def keepMemberId_ExistsReferrer_MemberLoginList(sq: MemberLoginCQ): String = { xkeepSQue("memberId_ExistsReferrer_MemberLoginList", sq) }

    def getMemberId_ExistsReferrer_PurchaseList(): Map[String, PurchaseCQ] = { xgetSQueMap("memberId_ExistsReferrer_PurchaseList") }
    def keepMemberId_ExistsReferrer_PurchaseList(sq: PurchaseCQ): String = { xkeepSQue("memberId_ExistsReferrer_PurchaseList", sq) }

    def getMemberId_NotExistsReferrer_MemberAddressList(): Map[String, MemberAddressCQ] = { xgetSQueMap("memberId_NotExistsReferrer_MemberAddressList") }
    def keepMemberId_NotExistsReferrer_MemberAddressList(sq: MemberAddressCQ): String = { xkeepSQue("memberId_NotExistsReferrer_MemberAddressList", sq) }

    def getMemberId_NotExistsReferrer_MemberFollowingByMyMemberIdList(): Map[String, MemberFollowingCQ] = { xgetSQueMap("memberId_NotExistsReferrer_MemberFollowingByMyMemberIdList") }
    def keepMemberId_NotExistsReferrer_MemberFollowingByMyMemberIdList(sq: MemberFollowingCQ): String = { xkeepSQue("memberId_NotExistsReferrer_MemberFollowingByMyMemberIdList", sq) }

    def getMemberId_NotExistsReferrer_MemberFollowingByYourMemberIdList(): Map[String, MemberFollowingCQ] = { xgetSQueMap("memberId_NotExistsReferrer_MemberFollowingByYourMemberIdList") }
    def keepMemberId_NotExistsReferrer_MemberFollowingByYourMemberIdList(sq: MemberFollowingCQ): String = { xkeepSQue("memberId_NotExistsReferrer_MemberFollowingByYourMemberIdList", sq) }

    def getMemberId_NotExistsReferrer_MemberLoginList(): Map[String, MemberLoginCQ] = { xgetSQueMap("memberId_NotExistsReferrer_MemberLoginList") }
    def keepMemberId_NotExistsReferrer_MemberLoginList(sq: MemberLoginCQ): String = { xkeepSQue("memberId_NotExistsReferrer_MemberLoginList", sq) }

    def getMemberId_NotExistsReferrer_PurchaseList(): Map[String, PurchaseCQ] = { xgetSQueMap("memberId_NotExistsReferrer_PurchaseList") }
    def keepMemberId_NotExistsReferrer_PurchaseList(sq: PurchaseCQ): String = { xkeepSQue("memberId_NotExistsReferrer_PurchaseList", sq) }

    def getMemberId_SpecifyDerivedReferrer_MemberAddressList(): Map[String, MemberAddressCQ] = { xgetSQueMap("memberId_SpecifyDerivedReferrer_MemberAddressList") }
    def keepMemberId_SpecifyDerivedReferrer_MemberAddressList(sq: MemberAddressCQ): String = { xkeepSQue("memberId_SpecifyDerivedReferrer_MemberAddressList", sq) }

    def getMemberId_SpecifyDerivedReferrer_MemberFollowingByMyMemberIdList(): Map[String, MemberFollowingCQ] = { xgetSQueMap("memberId_SpecifyDerivedReferrer_MemberFollowingByMyMemberIdList") }
    def keepMemberId_SpecifyDerivedReferrer_MemberFollowingByMyMemberIdList(sq: MemberFollowingCQ): String = { xkeepSQue("memberId_SpecifyDerivedReferrer_MemberFollowingByMyMemberIdList", sq) }

    def getMemberId_SpecifyDerivedReferrer_MemberFollowingByYourMemberIdList(): Map[String, MemberFollowingCQ] = { xgetSQueMap("memberId_SpecifyDerivedReferrer_MemberFollowingByYourMemberIdList") }
    def keepMemberId_SpecifyDerivedReferrer_MemberFollowingByYourMemberIdList(sq: MemberFollowingCQ): String = { xkeepSQue("memberId_SpecifyDerivedReferrer_MemberFollowingByYourMemberIdList", sq) }

    def getMemberId_SpecifyDerivedReferrer_MemberLoginList(): Map[String, MemberLoginCQ] = { xgetSQueMap("memberId_SpecifyDerivedReferrer_MemberLoginList") }
    def keepMemberId_SpecifyDerivedReferrer_MemberLoginList(sq: MemberLoginCQ): String = { xkeepSQue("memberId_SpecifyDerivedReferrer_MemberLoginList", sq) }

    def getMemberId_SpecifyDerivedReferrer_PurchaseList(): Map[String, PurchaseCQ] = { xgetSQueMap("memberId_SpecifyDerivedReferrer_PurchaseList") }
    def keepMemberId_SpecifyDerivedReferrer_PurchaseList(sq: PurchaseCQ): String = { xkeepSQue("memberId_SpecifyDerivedReferrer_PurchaseList", sq) }

    def getMemberId_InScopeRelation_MemberAddressList(): Map[String, MemberAddressCQ] = { xgetSQueMap("memberId_InScopeRelation_MemberAddressList") }
    def keepMemberId_InScopeRelation_MemberAddressList(sq: MemberAddressCQ): String = { xkeepSQue("memberId_InScopeRelation_MemberAddressList", sq) }

    def getMemberId_InScopeRelation_MemberFollowingByMyMemberIdList(): Map[String, MemberFollowingCQ] = { xgetSQueMap("memberId_InScopeRelation_MemberFollowingByMyMemberIdList") }
    def keepMemberId_InScopeRelation_MemberFollowingByMyMemberIdList(sq: MemberFollowingCQ): String = { xkeepSQue("memberId_InScopeRelation_MemberFollowingByMyMemberIdList", sq) }

    def getMemberId_InScopeRelation_MemberFollowingByYourMemberIdList(): Map[String, MemberFollowingCQ] = { xgetSQueMap("memberId_InScopeRelation_MemberFollowingByYourMemberIdList") }
    def keepMemberId_InScopeRelation_MemberFollowingByYourMemberIdList(sq: MemberFollowingCQ): String = { xkeepSQue("memberId_InScopeRelation_MemberFollowingByYourMemberIdList", sq) }

    def getMemberId_InScopeRelation_MemberLoginList(): Map[String, MemberLoginCQ] = { xgetSQueMap("memberId_InScopeRelation_MemberLoginList") }
    def keepMemberId_InScopeRelation_MemberLoginList(sq: MemberLoginCQ): String = { xkeepSQue("memberId_InScopeRelation_MemberLoginList", sq) }

    def getMemberId_InScopeRelation_PurchaseList(): Map[String, PurchaseCQ] = { xgetSQueMap("memberId_InScopeRelation_PurchaseList") }
    def keepMemberId_InScopeRelation_PurchaseList(sq: PurchaseCQ): String = { xkeepSQue("memberId_InScopeRelation_PurchaseList", sq) }

    def getMemberId_NotInScopeRelation_MemberAddressList(): Map[String, MemberAddressCQ] = { xgetSQueMap("memberId_NotInScopeRelation_MemberAddressList") }
    def keepMemberId_NotInScopeRelation_MemberAddressList(sq: MemberAddressCQ): String = { xkeepSQue("memberId_NotInScopeRelation_MemberAddressList", sq) }

    def getMemberId_NotInScopeRelation_MemberFollowingByMyMemberIdList(): Map[String, MemberFollowingCQ] = { xgetSQueMap("memberId_NotInScopeRelation_MemberFollowingByMyMemberIdList") }
    def keepMemberId_NotInScopeRelation_MemberFollowingByMyMemberIdList(sq: MemberFollowingCQ): String = { xkeepSQue("memberId_NotInScopeRelation_MemberFollowingByMyMemberIdList", sq) }

    def getMemberId_NotInScopeRelation_MemberFollowingByYourMemberIdList(): Map[String, MemberFollowingCQ] = { xgetSQueMap("memberId_NotInScopeRelation_MemberFollowingByYourMemberIdList") }
    def keepMemberId_NotInScopeRelation_MemberFollowingByYourMemberIdList(sq: MemberFollowingCQ): String = { xkeepSQue("memberId_NotInScopeRelation_MemberFollowingByYourMemberIdList", sq) }

    def getMemberId_NotInScopeRelation_MemberLoginList(): Map[String, MemberLoginCQ] = { xgetSQueMap("memberId_NotInScopeRelation_MemberLoginList") }
    def keepMemberId_NotInScopeRelation_MemberLoginList(sq: MemberLoginCQ): String = { xkeepSQue("memberId_NotInScopeRelation_MemberLoginList", sq) }

    def getMemberId_NotInScopeRelation_PurchaseList(): Map[String, PurchaseCQ] = { xgetSQueMap("memberId_NotInScopeRelation_PurchaseList") }
    def keepMemberId_NotInScopeRelation_PurchaseList(sq: PurchaseCQ): String = { xkeepSQue("memberId_NotInScopeRelation_PurchaseList", sq) }

    def getMemberId_QueryDerivedReferrer_MemberAddressList(): Map[String, MemberAddressCQ] = { xgetSQueMap("memberId_QueryDerivedReferrer_MemberAddressList") }
    def keepMemberId_QueryDerivedReferrer_MemberAddressList(sq: MemberAddressCQ): String = { xkeepSQue("memberId_QueryDerivedReferrer_MemberAddressList", sq) }
    def getMemberId_QueryDerivedReferrer_MemberAddressListParameter(): Map[String, Object] = { xgetSQuePmMap("memberId_QueryDerivedReferrer_MemberAddressList") }
    def keepMemberId_QueryDerivedReferrer_MemberAddressListParameter(pm: Object): String = { xkeepSQuePm("memberId_QueryDerivedReferrer_MemberAddressList", pm) }

    def getMemberId_QueryDerivedReferrer_MemberFollowingByMyMemberIdList(): Map[String, MemberFollowingCQ] = { xgetSQueMap("memberId_QueryDerivedReferrer_MemberFollowingByMyMemberIdList") }
    def keepMemberId_QueryDerivedReferrer_MemberFollowingByMyMemberIdList(sq: MemberFollowingCQ): String = { xkeepSQue("memberId_QueryDerivedReferrer_MemberFollowingByMyMemberIdList", sq) }
    def getMemberId_QueryDerivedReferrer_MemberFollowingByMyMemberIdListParameter(): Map[String, Object] = { xgetSQuePmMap("memberId_QueryDerivedReferrer_MemberFollowingByMyMemberIdList") }
    def keepMemberId_QueryDerivedReferrer_MemberFollowingByMyMemberIdListParameter(pm: Object): String = { xkeepSQuePm("memberId_QueryDerivedReferrer_MemberFollowingByMyMemberIdList", pm) }

    def getMemberId_QueryDerivedReferrer_MemberFollowingByYourMemberIdList(): Map[String, MemberFollowingCQ] = { xgetSQueMap("memberId_QueryDerivedReferrer_MemberFollowingByYourMemberIdList") }
    def keepMemberId_QueryDerivedReferrer_MemberFollowingByYourMemberIdList(sq: MemberFollowingCQ): String = { xkeepSQue("memberId_QueryDerivedReferrer_MemberFollowingByYourMemberIdList", sq) }
    def getMemberId_QueryDerivedReferrer_MemberFollowingByYourMemberIdListParameter(): Map[String, Object] = { xgetSQuePmMap("memberId_QueryDerivedReferrer_MemberFollowingByYourMemberIdList") }
    def keepMemberId_QueryDerivedReferrer_MemberFollowingByYourMemberIdListParameter(pm: Object): String = { xkeepSQuePm("memberId_QueryDerivedReferrer_MemberFollowingByYourMemberIdList", pm) }

    def getMemberId_QueryDerivedReferrer_MemberLoginList(): Map[String, MemberLoginCQ] = { xgetSQueMap("memberId_QueryDerivedReferrer_MemberLoginList") }
    def keepMemberId_QueryDerivedReferrer_MemberLoginList(sq: MemberLoginCQ): String = { xkeepSQue("memberId_QueryDerivedReferrer_MemberLoginList", sq) }
    def getMemberId_QueryDerivedReferrer_MemberLoginListParameter(): Map[String, Object] = { xgetSQuePmMap("memberId_QueryDerivedReferrer_MemberLoginList") }
    def keepMemberId_QueryDerivedReferrer_MemberLoginListParameter(pm: Object): String = { xkeepSQuePm("memberId_QueryDerivedReferrer_MemberLoginList", pm) }

    def getMemberId_QueryDerivedReferrer_PurchaseList(): Map[String, PurchaseCQ] = { xgetSQueMap("memberId_QueryDerivedReferrer_PurchaseList") }
    def keepMemberId_QueryDerivedReferrer_PurchaseList(sq: PurchaseCQ): String = { xkeepSQue("memberId_QueryDerivedReferrer_PurchaseList", sq) }
    def getMemberId_QueryDerivedReferrer_PurchaseListParameter(): Map[String, Object] = { xgetSQuePmMap("memberId_QueryDerivedReferrer_PurchaseList") }
    def keepMemberId_QueryDerivedReferrer_PurchaseListParameter(pm: Object): String = { xkeepSQuePm("memberId_QueryDerivedReferrer_PurchaseList", pm) }

    /** 
     * Add order-by as ascend. <br />
     * (会員ID)MEMBER_ID: {PK, ID, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    def addOrderBy_MemberId_Asc(): BsMemberCQ = { regOBA("MEMBER_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * (会員ID)MEMBER_ID: {PK, ID, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    def addOrderBy_MemberId_Desc(): BsMemberCQ = { regOBD("MEMBER_ID"); return this; }

    protected var _memberName: ConditionValue = null;
    def getMemberName(): ConditionValue =
    { if (_memberName == null) { _memberName = nCV(); }
      return _memberName; }
    protected def getCValueMemberName(): ConditionValue = { return getMemberName(); }

    /** 
     * Add order-by as ascend. <br />
     * (会員名称)MEMBER_NAME: {IX, NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    def addOrderBy_MemberName_Asc(): BsMemberCQ = { regOBA("MEMBER_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * (会員名称)MEMBER_NAME: {IX, NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    def addOrderBy_MemberName_Desc(): BsMemberCQ = { regOBD("MEMBER_NAME"); return this; }

    protected var _memberAccount: ConditionValue = null;
    def getMemberAccount(): ConditionValue =
    { if (_memberAccount == null) { _memberAccount = nCV(); }
      return _memberAccount; }
    protected def getCValueMemberAccount(): ConditionValue = { return getMemberAccount(); }

    /** 
     * Add order-by as ascend. <br />
     * (会員アカウント)MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    def addOrderBy_MemberAccount_Asc(): BsMemberCQ = { regOBA("MEMBER_ACCOUNT"); return this; }

    /**
     * Add order-by as descend. <br />
     * (会員アカウント)MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    def addOrderBy_MemberAccount_Desc(): BsMemberCQ = { regOBD("MEMBER_ACCOUNT"); return this; }

    protected var _memberStatusCode: ConditionValue = null;
    def getMemberStatusCode(): ConditionValue =
    { if (_memberStatusCode == null) { _memberStatusCode = nCV(); }
      return _memberStatusCode; }
    protected def getCValueMemberStatusCode(): ConditionValue = { return getMemberStatusCode(); }

    /** 
     * Add order-by as ascend. <br />
     * (会員ステータスコード)MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus}
     * @return this. (NotNull)
     */
    def addOrderBy_MemberStatusCode_Asc(): BsMemberCQ = { regOBA("MEMBER_STATUS_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * (会員ステータスコード)MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus}
     * @return this. (NotNull)
     */
    def addOrderBy_MemberStatusCode_Desc(): BsMemberCQ = { regOBD("MEMBER_STATUS_CODE"); return this; }

    protected var _formalizedDatetime: ConditionValue = null;
    def getFormalizedDatetime(): ConditionValue =
    { if (_formalizedDatetime == null) { _formalizedDatetime = nCV(); }
      return _formalizedDatetime; }
    protected def getCValueFormalizedDatetime(): ConditionValue = { return getFormalizedDatetime(); }

    /** 
     * Add order-by as ascend. <br />
     * (正式会員日時)FORMALIZED_DATETIME: {IX, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    def addOrderBy_FormalizedDatetime_Asc(): BsMemberCQ = { regOBA("FORMALIZED_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br />
     * (正式会員日時)FORMALIZED_DATETIME: {IX, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    def addOrderBy_FormalizedDatetime_Desc(): BsMemberCQ = { regOBD("FORMALIZED_DATETIME"); return this; }

    protected var _birthdate: ConditionValue = null;
    def getBirthdate(): ConditionValue =
    { if (_birthdate == null) { _birthdate = nCV(); }
      return _birthdate; }
    protected def getCValueBirthdate(): ConditionValue = { return getBirthdate(); }

    /** 
     * Add order-by as ascend. <br />
     * (生年月日)BIRTHDATE: {DATE(8)}
     * @return this. (NotNull)
     */
    def addOrderBy_Birthdate_Asc(): BsMemberCQ = { regOBA("BIRTHDATE"); return this; }

    /**
     * Add order-by as descend. <br />
     * (生年月日)BIRTHDATE: {DATE(8)}
     * @return this. (NotNull)
     */
    def addOrderBy_Birthdate_Desc(): BsMemberCQ = { regOBD("BIRTHDATE"); return this; }

    protected var _registerDatetime: ConditionValue = null;
    def getRegisterDatetime(): ConditionValue =
    { if (_registerDatetime == null) { _registerDatetime = nCV(); }
      return _registerDatetime; }
    protected def getCValueRegisterDatetime(): ConditionValue = { return getRegisterDatetime(); }

    /** 
     * Add order-by as ascend. <br />
     * (登録日時)REGISTER_DATETIME: {NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    def addOrderBy_RegisterDatetime_Asc(): BsMemberCQ = { regOBA("REGISTER_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br />
     * (登録日時)REGISTER_DATETIME: {NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    def addOrderBy_RegisterDatetime_Desc(): BsMemberCQ = { regOBD("REGISTER_DATETIME"); return this; }

    protected var _registerUser: ConditionValue = null;
    def getRegisterUser(): ConditionValue =
    { if (_registerUser == null) { _registerUser = nCV(); }
      return _registerUser; }
    protected def getCValueRegisterUser(): ConditionValue = { return getRegisterUser(); }

    /** 
     * Add order-by as ascend. <br />
     * (登録ユーザ)REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    def addOrderBy_RegisterUser_Asc(): BsMemberCQ = { regOBA("REGISTER_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * (登録ユーザ)REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    def addOrderBy_RegisterUser_Desc(): BsMemberCQ = { regOBD("REGISTER_USER"); return this; }

    protected var _updateDatetime: ConditionValue = null;
    def getUpdateDatetime(): ConditionValue =
    { if (_updateDatetime == null) { _updateDatetime = nCV(); }
      return _updateDatetime; }
    protected def getCValueUpdateDatetime(): ConditionValue = { return getUpdateDatetime(); }

    /** 
     * Add order-by as ascend. <br />
     * (更新日時)UPDATE_DATETIME: {NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    def addOrderBy_UpdateDatetime_Asc(): BsMemberCQ = { regOBA("UPDATE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br />
     * (更新日時)UPDATE_DATETIME: {NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    def addOrderBy_UpdateDatetime_Desc(): BsMemberCQ = { regOBD("UPDATE_DATETIME"); return this; }

    protected var _updateUser: ConditionValue = null;
    def getUpdateUser(): ConditionValue =
    { if (_updateUser == null) { _updateUser = nCV(); }
      return _updateUser; }
    protected def getCValueUpdateUser(): ConditionValue = { return getUpdateUser(); }

    /** 
     * Add order-by as ascend. <br />
     * (更新ユーザ)UPDATE_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    def addOrderBy_UpdateUser_Asc(): BsMemberCQ = { regOBA("UPDATE_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * (更新ユーザ)UPDATE_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    def addOrderBy_UpdateUser_Desc(): BsMemberCQ = { regOBD("UPDATE_USER"); return this; }

    protected var _versionNo: ConditionValue = null;
    def getVersionNo(): ConditionValue =
    { if (_versionNo == null) { _versionNo = nCV(); }
      return _versionNo; }
    protected def getCValueVersionNo(): ConditionValue = { return getVersionNo(); }

    /** 
     * Add order-by as ascend. <br />
     * (バージョンNO)VERSION_NO: {NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    def addOrderBy_VersionNo_Asc(): BsMemberCQ = { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br />
     * (バージョンNO)VERSION_NO: {NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    def addOrderBy_VersionNo_Desc(): BsMemberCQ = { regOBD("VERSION_NO"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #DD4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #DD4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #DD4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    def addSpecifiedDerivedOrderBy_Asc(aliasName: String): BsMemberCQ = { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #DD4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #DD4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #DD4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    def addSpecifiedDerivedOrderBy_Desc(aliasName: String): BsMemberCQ = { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    def reflectRelationOnUnionQuery(bqs: ConditionQuery, uqs: ConditionQuery): Unit = {
        val bq: MemberCQ = bqs.asInstanceOf[MemberCQ];
        val uq: MemberCQ = uqs.asInstanceOf[MemberCQ];
        if (bq.hasConditionQueryMemberStatus()) {
            uq.queryMemberStatus().reflectRelationOnUnionQuery(bq.queryMemberStatus(), uq.queryMemberStatus());
        }
        if (bq.hasConditionQueryMemberSecurityAsOne())
        { uq.queryMemberSecurityAsOne().reflectRelationOnUnionQuery(bq.queryMemberSecurityAsOne(), uq.queryMemberSecurityAsOne()); }
        if (bq.hasConditionQueryMemberServiceAsOne())
        { uq.queryMemberServiceAsOne().reflectRelationOnUnionQuery(bq.queryMemberServiceAsOne(), uq.queryMemberServiceAsOne()); }
        if (bq.hasConditionQueryMemberWithdrawalAsOne())
        { uq.queryMemberWithdrawalAsOne().reflectRelationOnUnionQuery(bq.queryMemberWithdrawalAsOne(), uq.queryMemberWithdrawalAsOne()); }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * (会員ステータス)MEMBER_STATUS by my MEMBER_STATUS_CODE, named 'memberStatus'.
     * @return The instance of condition-query. (NotNull)
     */
    def queryMemberStatus(): MemberStatusCQ = {
        return getConditionQueryMemberStatus();
    }
    def getConditionQueryMemberStatus(): MemberStatusCQ = {
        val prop = "memberStatus";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMemberStatus()); xsetupOuterJoinMemberStatus(); }
        return xgetQueRlMap(prop);
    }
    protected def xcreateQueryMemberStatus(): MemberStatusCQ = {
        val nrp = xresolveNRP("MEMBER",  "memberStatus"); val jan = xresolveJAN(nrp,  xgetNNLvl());
        return xinitRelCQ(new MemberStatusCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "memberStatus", nrp);
    }
    protected def xsetupOuterJoinMemberStatus(): Unit = { xregOutJo("memberStatus") }
    def hasConditionQueryMemberStatus(): Boolean = { xhasQueRlMap("memberStatus") }

    /**
     * Get the condition-query for relation table. <br />
     * (会員セキュリティ情報)MEMBER_SECURITY by MEMBER_ID, named 'memberSecurityAsOne'.
     * @return The instance of condition-query. (NotNull)
     */
    def queryMemberSecurityAsOne(): MemberSecurityCQ = { getConditionQueryMemberSecurityAsOne() }
    def getConditionQueryMemberSecurityAsOne(): MemberSecurityCQ = {
        val prop = "memberSecurityAsOne";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMemberSecurityAsOne()); xsetupOuterJoinMemberSecurityAsOne(); }
        return xgetQueRlMap(prop);
    }
    protected def xcreateQueryMemberSecurityAsOne(): MemberSecurityCQ = {
        val nrp = xresolveNRP("MEMBER",  "memberSecurityAsOne"); val jan = xresolveJAN(nrp,  xgetNNLvl());
        return xinitRelCQ(new MemberSecurityCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "memberSecurityAsOne", nrp);
    }
    protected def xsetupOuterJoinMemberSecurityAsOne(): Unit = { xregOutJo("memberSecurityAsOne") }
    def hasConditionQueryMemberSecurityAsOne(): Boolean = { xhasQueRlMap("memberSecurityAsOne") }

    /**
     * Get the condition-query for relation table. <br />
     * (会員サービス)MEMBER_SERVICE by MEMBER_ID, named 'memberServiceAsOne'.
     * @return The instance of condition-query. (NotNull)
     */
    def queryMemberServiceAsOne(): MemberServiceCQ = { getConditionQueryMemberServiceAsOne() }
    def getConditionQueryMemberServiceAsOne(): MemberServiceCQ = {
        val prop = "memberServiceAsOne";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMemberServiceAsOne()); xsetupOuterJoinMemberServiceAsOne(); }
        return xgetQueRlMap(prop);
    }
    protected def xcreateQueryMemberServiceAsOne(): MemberServiceCQ = {
        val nrp = xresolveNRP("MEMBER",  "memberServiceAsOne"); val jan = xresolveJAN(nrp,  xgetNNLvl());
        return xinitRelCQ(new MemberServiceCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "memberServiceAsOne", nrp);
    }
    protected def xsetupOuterJoinMemberServiceAsOne(): Unit = { xregOutJo("memberServiceAsOne") }
    def hasConditionQueryMemberServiceAsOne(): Boolean = { xhasQueRlMap("memberServiceAsOne") }

    /**
     * Get the condition-query for relation table. <br />
     * (会員退会情報)MEMBER_WITHDRAWAL by MEMBER_ID, named 'memberWithdrawalAsOne'.
     * @return The instance of condition-query. (NotNull)
     */
    def queryMemberWithdrawalAsOne(): MemberWithdrawalCQ = { getConditionQueryMemberWithdrawalAsOne() }
    def getConditionQueryMemberWithdrawalAsOne(): MemberWithdrawalCQ = {
        val prop = "memberWithdrawalAsOne";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMemberWithdrawalAsOne()); xsetupOuterJoinMemberWithdrawalAsOne(); }
        return xgetQueRlMap(prop);
    }
    protected def xcreateQueryMemberWithdrawalAsOne(): MemberWithdrawalCQ = {
        val nrp = xresolveNRP("MEMBER",  "memberWithdrawalAsOne"); val jan = xresolveJAN(nrp,  xgetNNLvl());
        return xinitRelCQ(new MemberWithdrawalCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "memberWithdrawalAsOne", nrp);
    }
    protected def xsetupOuterJoinMemberWithdrawalAsOne(): Unit = { xregOutJo("memberWithdrawalAsOne") }
    def hasConditionQueryMemberWithdrawalAsOne(): Boolean = { xhasQueRlMap("memberWithdrawalAsOne") }

    protected def xfindFixedConditionDynamicParameterMap(property: String): Map[String, Object] = {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    def getScalarCondition(): Map[String, MemberCQ] = { xgetSQueMap("scalarCondition") }
    def keepScalarCondition(sq: MemberCQ): String = { xkeepSQue("scalarCondition", sq) }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    def getSpecifyMyselfDerived(): Map[String, MemberCQ] = { xgetSQueMap("specifyMyselfDerived") }
    def keepSpecifyMyselfDerived(sq: MemberCQ): String = { xkeepSQue("specifyMyselfDerived", sq) }

    def getQueryMyselfDerived(): Map[String, MemberCQ] = { xgetSQueMap("queryMyselfDerived") }
    def keepQueryMyselfDerived(sq: MemberCQ): String = { xkeepSQue("queryMyselfDerived", sq) }
    def getQueryMyselfDerivedParameter(): Map[String, Object] = { xgetSQuePmMap("qyeryMyselfDerived") }
    def keepQueryMyselfDerivedParameter(pm: Object): String = { xkeepSQuePm("qyeryMyselfDerived", pm) }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    def getMyselfExists(): Map[String, MemberCQ] = { xgetSQueMap("myselfExists") }
    def keepMyselfExists(sq: MemberCQ): String = { xkeepSQue("myselfExists", sq) }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    def getMyselfInScope(): Map[String, MemberCQ] = { xgetSQueMap("myselfInScope") }
    def keepMyselfInScope(sq: MemberCQ): String = { xkeepSQue("myselfInScope", sq) }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected def xCB(): String = { return classOf[MemberCB].getName(); }
    protected def xCQ(): String = { return classOf[MemberCQ].getName(); }
    protected def xCHp(): String = { return classOf[HpCalculator].getName(); }
    protected def xCOp(): String = { return classOf[ConditionOption].getName(); }
    protected def xMap(): String = { return classOf[Map[_, _]].getName(); }
}
