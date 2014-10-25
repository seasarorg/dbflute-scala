package com.example.dbflute.scala.dbflute.bsentity;

import scala.collection.immutable;
import scala.collection.JavaConverters._;

// #avoided same name type in Java and Scala
import java.lang.Long;
import java.lang.Boolean;

import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.AbstractEntity;
import org.seasar.dbflute.FunCustodial;
import org.seasar.dbflute.helper.beans.DfCoupleProperties;
import org.seasar.dbflute.immutable.DBableEntity;
import com.example.dbflute.scala.dbflute.allcommon.EntityDefinedCommonColumn;
import com.example.dbflute.scala.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.scala.dbflute.allcommon.CDef;
import com.example.dbflute.scala.dbflute.exentity._;

/**
 * The entity of (会員)MEMBER as TABLE. <br />
 * <pre>
 * [primary-key]
 *     MEMBER_ID
 * 
 * [column]
 *     MEMBER_ID, MEMBER_NAME, MEMBER_ACCOUNT, MEMBER_STATUS_CODE, FORMALIZED_DATETIME, BIRTHDATE, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     MEMBER_ID
 * 
 * [version-no]
 *     VERSION_NO
 * 
 * [foreign table]
 *     MEMBER_STATUS, MEMBER_SECURITY(AsOne), MEMBER_SERVICE(AsOne), MEMBER_WITHDRAWAL(AsOne)
 * 
 * [referrer table]
 *     MEMBER_ADDRESS, MEMBER_FOLLOWING, MEMBER_LOGIN, PURCHASE, MEMBER_SECURITY, MEMBER_SERVICE, MEMBER_WITHDRAWAL
 * 
 * [foreign property]
 *     memberStatus, memberSecurityAsOne, memberServiceAsOne, memberWithdrawalAsOne
 * 
 * [referrer property]
 *     memberAddressList, memberFollowingByMyMemberIdList, memberFollowingByYourMemberIdList, memberLoginList, purchaseList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer memberId = entity.getMemberId();
 * String memberName = entity.getMemberName();
 * String memberAccount = entity.getMemberAccount();
 * String memberStatusCode = entity.getMemberStatusCode();
 * org.joda.time.LocalDateTime formalizedDatetime = entity.getFormalizedDatetime();
 * org.joda.time.LocalDate birthdate = entity.getBirthdate();
 * org.joda.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerUser = entity.getRegisterUser();
 * org.joda.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateUser = entity.getUpdateUser();
 * Long versionNo = entity.getVersionNo();
 * entity.setMemberId(memberId);
 * entity.setMemberName(memberName);
 * entity.setMemberAccount(memberAccount);
 * entity.setMemberStatusCode(memberStatusCode);
 * entity.setFormalizedDatetime(formalizedDatetime);
 * entity.setBirthdate(birthdate);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterUser(registerUser);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateUser(updateUser);
 * entity.setVersionNo(versionNo);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
abstract class BsDbleMember extends AbstractEntity with EntityDefinedCommonColumn with DBableEntity[Member] with Serializable with Cloneable {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** (会員ID)MEMBER_ID: {PK, ID, NotNull, INTEGER(10)} */
    protected var _memberId: Integer = null;

    /** (会員名称)MEMBER_NAME: {IX, NotNull, VARCHAR(200)} */
    protected var _memberName: String = null;

    /** (会員アカウント)MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR(50)} */
    protected var _memberAccount: String = null;

    /** (会員ステータスコード)MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus} */
    protected var _memberStatusCode: String = null;

    /** (正式会員日時)FORMALIZED_DATETIME: {IX, TIMESTAMP(23, 10)} */
    protected var _formalizedDatetime: org.joda.time.LocalDateTime = null;

    /** (生年月日)BIRTHDATE: {DATE(8)} */
    protected var _birthdate: org.joda.time.LocalDate = null;

    /** (登録日時)REGISTER_DATETIME: {NotNull, TIMESTAMP(23, 10)} */
    protected var _registerDatetime: org.joda.time.LocalDateTime = null;

    /** (登録ユーザ)REGISTER_USER: {NotNull, VARCHAR(200)} */
    protected var _registerUser: String = null;

    /** (更新日時)UPDATE_DATETIME: {NotNull, TIMESTAMP(23, 10)} */
    protected var _updateDatetime: org.joda.time.LocalDateTime = null;

    /** (更新ユーザ)UPDATE_USER: {NotNull, VARCHAR(200)} */
    protected var _updateUser: String = null;

    /** (バージョンNO)VERSION_NO: {NotNull, BIGINT(19)} */
    protected var _versionNo: Long = null;

    // ===================================================================================
    //                                                                           Immutable
    //                                                                           =========
    /**
     * {@inheritDoc}
     */
    def acceptImmutable(immu: Member): DbleMember = {
        setMemberId(immu.memberId);
        setMemberName(immu.memberName);
        setMemberAccount(immu.memberAccount);
        setMemberStatusCodeAsMemberStatus(immu.memberStatusCode);
        setFormalizedDatetime(immu.formalizedDatetime.orNull);
        setBirthdate(immu.birthdate.orNull);
        setRegisterDatetime(immu.registerDatetime);
        setRegisterUser(immu.registerUser);
        setUpdateDatetime(immu.updateDatetime);
        setUpdateUser(immu.updateUser);
        setVersionNo(immu.versionNo);
        setMemberStatus(immu.memberStatus.map(new DbleMemberStatus().acceptImmutable(_)))
        setMemberSecurityAsOne(immu.memberSecurityAsOne.map(new DbleMemberSecurity().acceptImmutable(_)))
        setMemberServiceAsOne(immu.memberServiceAsOne.map(new DbleMemberService().acceptImmutable(_)))
        setMemberWithdrawalAsOne(immu.memberWithdrawalAsOne.map(new DbleMemberWithdrawal().acceptImmutable(_)))
        setMemberAddressList(immu.memberAddressList.map(new DbleMemberAddress().acceptImmutable(_)).asJava)
        setMemberFollowingByMyMemberIdList(immu.memberFollowingByMyMemberIdList.map(new DbleMemberFollowing().acceptImmutable(_)).asJava)
        setMemberFollowingByYourMemberIdList(immu.memberFollowingByYourMemberIdList.map(new DbleMemberFollowing().acceptImmutable(_)).asJava)
        setMemberLoginList(immu.memberLoginList.map(new DbleMemberLogin().acceptImmutable(_)).asJava)
        setPurchaseList(immu.purchaseList.map(new DblePurchase().acceptImmutable(_)).asJava)
        __uniqueDrivenProperties.clear();
        immu.getMyUniqueDrivenProperties().foreach(__uniqueDrivenProperties.addPropertyName(_))
        __modifiedProperties.clear();
        immu.getMyModifiedProperties().foreach(__modifiedProperties.addPropertyName(_))
        return this.asInstanceOf[DbleMember];
    }

    /**
     * {@inheritDoc}
     */
    def toImmutable(): Member = {
        return new Member(this.asInstanceOf[DbleMember]);
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    def getTableDbName(): String = {
        return "MEMBER";
    }

    /**
     * {@inheritDoc}
     */
    def getTablePropertyName(): String = {
        return "member";
    }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /**
     * {@inheritDoc}
     */
    def getDBMeta(): DBMeta = {
        return DBMetaInstanceHandler.findDBMeta(getTableDbName());
    }

    // ===================================================================================
    //                                                                         Primary Key
    //                                                                         ===========
    /**
     * {@inheritDoc}
     */
    def hasPrimaryKeyValue(): scala.Boolean = {
        if (getMemberId() == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br />
     * You can update the entity by the key when entity update (NOT batch update).
     * @param memberAccount (会員アカウント): UQ, NotNull, VARCHAR(50). (NotNull)
     */
    def uniqueBy(memberAccount: String): Unit = {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("memberAccount");
        setMemberAccount(memberAccount);
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of memberStatusCode as the classification of MemberStatus. <br />
     * (会員ステータスコード)MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus} <br />
     * status of member from entry to withdrawal
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    def getMemberStatusCodeAsMemberStatus(): CDef.MemberStatus = {
        return CDef.MemberStatus.codeOf(getMemberStatusCode());
    }

    /**
     * Set the value of memberStatusCode as the classification of MemberStatus. <br />
     * (会員ステータスコード)MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus} <br />
     * status of member from entry to withdrawal
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    def setMemberStatusCodeAsMemberStatus(cdef: CDef.MemberStatus): Unit = {
        setMemberStatusCode(if (cdef != null) { cdef.code } else { null });
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of memberStatusCode as Formalized (FML). <br />
     * Formalized: as formal member, allowed to use all service
     */
    def setMemberStatusCode_Formalized(): Unit = {
        setMemberStatusCodeAsMemberStatus(CDef.MemberStatus.Formalized);
    }

    /**
     * Set the value of memberStatusCode as Withdrawal (WDL). <br />
     * Withdrawal: withdrawal is fixed, not allowed to use service
     */
    def setMemberStatusCode_Withdrawal(): Unit = {
        setMemberStatusCodeAsMemberStatus(CDef.MemberStatus.Withdrawal);
    }

    /**
     * Set the value of memberStatusCode as Provisional (PRV). <br />
     * Provisional: first status after entry, allowed to use only part of service
     */
    def setMemberStatusCode_Provisional(): Unit = {
        setMemberStatusCodeAsMemberStatus(CDef.MemberStatus.Provisional);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of memberStatusCode Formalized? <br />
     * Formalized: as formal member, allowed to use all service
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isMemberStatusCode_Formalized(): Boolean = {
        val cdef: CDef.MemberStatus = getMemberStatusCodeAsMemberStatus();
        return if (cdef != null) { cdef.equals(CDef.MemberStatus.Formalized) } else { false };
    }

    /**
     * Is the value of memberStatusCode Withdrawal? <br />
     * Withdrawal: withdrawal is fixed, not allowed to use service
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isMemberStatusCode_Withdrawal(): Boolean = {
        val cdef: CDef.MemberStatus = getMemberStatusCodeAsMemberStatus();
        return if (cdef != null) { cdef.equals(CDef.MemberStatus.Withdrawal) } else { false };
    }

    /**
     * Is the value of memberStatusCode Provisional? <br />
     * Provisional: first status after entry, allowed to use only part of service
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isMemberStatusCode_Provisional(): Boolean = {
        val cdef: CDef.MemberStatus = getMemberStatusCodeAsMemberStatus();
        return if (cdef != null) { cdef.equals(CDef.MemberStatus.Provisional) } else { false };
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** (会員ステータス)MEMBER_STATUS by my MEMBER_STATUS_CODE, named 'memberStatus'. */
    protected var _memberStatus: Option[DbleMemberStatus] = null;

    /**
     * [get] (会員ステータス)MEMBER_STATUS by my MEMBER_STATUS_CODE, named 'memberStatus'.
     * @return The entity of foreign property 'memberStatus'. (EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    def getMemberStatus(): Option[DbleMemberStatus] = {
        return if (_memberStatus != null) { _memberStatus; } else { Option.empty; }
    }

    /**
     * [set] (会員ステータス)MEMBER_STATUS by my MEMBER_STATUS_CODE, named 'memberStatus'.
     * @param memberStatus The entity of foreign property 'memberStatus'. (EmptyAllowed)
     */
    def setMemberStatus(memberStatus: Option[DbleMemberStatus]): Unit = {
        _memberStatus = memberStatus;
    }

    /**
     * [convert] (会員ステータス)MEMBER_STATUS by my MEMBER_STATUS_CODE, named 'memberStatus'.
     * @return The new-created immutable entity of foreign property 'memberStatus'. (NotNull)
     */
    def toImmutableMemberStatus(): Option[MemberStatus] = {
        return getMemberStatus().map(_.toImmutable());
    }

    /** (会員セキュリティ情報)MEMBER_SECURITY by MEMBER_ID, named 'memberSecurityAsOne'. */
    protected var _memberSecurityAsOne: Option[DbleMemberSecurity] = null;

    /**
     * [get] (会員セキュリティ情報)MEMBER_SECURITY by MEMBER_ID, named 'memberSecurityAsOne'.
     * @return the entity of foreign property(referrer-as-one) 'memberSecurityAsOne'. (EmptyAllowed: when e.g. no data, no setupSelect)
     */
    def getMemberSecurityAsOne(): Option[DbleMemberSecurity] = {
        return if (_memberSecurityAsOne != null) { _memberSecurityAsOne; } else { Option.empty; }
    }

    /**
     * [set] (会員セキュリティ情報)MEMBER_SECURITY by MEMBER_ID, named 'memberSecurityAsOne'.
     * @param memberSecurityAsOne The entity of foreign property(referrer-as-one) 'memberSecurityAsOne'. (EmptyAllowed)
     */
    def setMemberSecurityAsOne(memberSecurityAsOne: Option[DbleMemberSecurity]): Unit = {
        _memberSecurityAsOne = memberSecurityAsOne;
    }

    /**
     * [convert] (会員セキュリティ情報)MEMBER_SECURITY by MEMBER_ID, named 'memberSecurityAsOne'.
     * @return The new-created immutable entity of foreign property(referrer-as-one) 'memberSecurityAsOne'. (NotNull)
     */
    def toImmutableMemberSecurityAsOne(): Option[MemberSecurity] = {
        return getMemberSecurityAsOne().map(_.toImmutable());
    }

    /** (会員サービス)MEMBER_SERVICE by MEMBER_ID, named 'memberServiceAsOne'. */
    protected var _memberServiceAsOne: Option[DbleMemberService] = null;

    /**
     * [get] (会員サービス)MEMBER_SERVICE by MEMBER_ID, named 'memberServiceAsOne'.
     * @return the entity of foreign property(referrer-as-one) 'memberServiceAsOne'. (EmptyAllowed: when e.g. no data, no setupSelect)
     */
    def getMemberServiceAsOne(): Option[DbleMemberService] = {
        return if (_memberServiceAsOne != null) { _memberServiceAsOne; } else { Option.empty; }
    }

    /**
     * [set] (会員サービス)MEMBER_SERVICE by MEMBER_ID, named 'memberServiceAsOne'.
     * @param memberServiceAsOne The entity of foreign property(referrer-as-one) 'memberServiceAsOne'. (EmptyAllowed)
     */
    def setMemberServiceAsOne(memberServiceAsOne: Option[DbleMemberService]): Unit = {
        _memberServiceAsOne = memberServiceAsOne;
    }

    /**
     * [convert] (会員サービス)MEMBER_SERVICE by MEMBER_ID, named 'memberServiceAsOne'.
     * @return The new-created immutable entity of foreign property(referrer-as-one) 'memberServiceAsOne'. (NotNull)
     */
    def toImmutableMemberServiceAsOne(): Option[MemberService] = {
        return getMemberServiceAsOne().map(_.toImmutable());
    }

    /** (会員退会情報)MEMBER_WITHDRAWAL by MEMBER_ID, named 'memberWithdrawalAsOne'. */
    protected var _memberWithdrawalAsOne: Option[DbleMemberWithdrawal] = null;

    /**
     * [get] (会員退会情報)MEMBER_WITHDRAWAL by MEMBER_ID, named 'memberWithdrawalAsOne'.
     * @return the entity of foreign property(referrer-as-one) 'memberWithdrawalAsOne'. (EmptyAllowed: when e.g. no data, no setupSelect)
     */
    def getMemberWithdrawalAsOne(): Option[DbleMemberWithdrawal] = {
        return if (_memberWithdrawalAsOne != null) { _memberWithdrawalAsOne; } else { Option.empty; }
    }

    /**
     * [set] (会員退会情報)MEMBER_WITHDRAWAL by MEMBER_ID, named 'memberWithdrawalAsOne'.
     * @param memberWithdrawalAsOne The entity of foreign property(referrer-as-one) 'memberWithdrawalAsOne'. (EmptyAllowed)
     */
    def setMemberWithdrawalAsOne(memberWithdrawalAsOne: Option[DbleMemberWithdrawal]): Unit = {
        _memberWithdrawalAsOne = memberWithdrawalAsOne;
    }

    /**
     * [convert] (会員退会情報)MEMBER_WITHDRAWAL by MEMBER_ID, named 'memberWithdrawalAsOne'.
     * @return The new-created immutable entity of foreign property(referrer-as-one) 'memberWithdrawalAsOne'. (NotNull)
     */
    def toImmutableMemberWithdrawalAsOne(): Option[MemberWithdrawal] = {
        return getMemberWithdrawalAsOne().map(_.toImmutable());
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** (会員住所情報)MEMBER_ADDRESS by MEMBER_ID, named 'memberAddressList'. */
    protected var _memberAddressList: List[DbleMemberAddress] = null;

    /**
     * [get] (会員住所情報)MEMBER_ADDRESS by MEMBER_ID, named 'memberAddressList'.
     * @return The entity list of referrer property 'memberAddressList'. (NotNull: even if no loading, returns empty list)
     */
    def getMemberAddressList(): List[DbleMemberAddress] = {
        if (_memberAddressList == null) { _memberAddressList = newReferrerScalaList(); }
        return _memberAddressList;
    }

    /**
     * [set] (会員住所情報)MEMBER_ADDRESS by MEMBER_ID, named 'memberAddressList'.
     * @param memberAddressList The entity list of referrer property 'memberAddressList'. (NullAllowed)
     */
    def setMemberAddressList(memberAddressList: List[DbleMemberAddress]): Unit = {
        _memberAddressList = memberAddressList;
    }

    /**
     * [convert] (会員住所情報)MEMBER_ADDRESS by MEMBER_ID, named 'memberAddressList'.
     * @return The new-created immutable list of immutable entity of the referrer property 'memberAddressList'. (NotNull)
     */
    def toImmutableMemberAddressList(): immutable.List[MemberAddress] = {
        return toScalaList(_memberAddressList).map(_.toImmutable());
    }

    /** (会員フォローイング)MEMBER_FOLLOWING by MY_MEMBER_ID, named 'memberFollowingByMyMemberIdList'. */
    protected var _memberFollowingByMyMemberIdList: List[DbleMemberFollowing] = null;

    /**
     * [get] (会員フォローイング)MEMBER_FOLLOWING by MY_MEMBER_ID, named 'memberFollowingByMyMemberIdList'.
     * @return The entity list of referrer property 'memberFollowingByMyMemberIdList'. (NotNull: even if no loading, returns empty list)
     */
    def getMemberFollowingByMyMemberIdList(): List[DbleMemberFollowing] = {
        if (_memberFollowingByMyMemberIdList == null) { _memberFollowingByMyMemberIdList = newReferrerScalaList(); }
        return _memberFollowingByMyMemberIdList;
    }

    /**
     * [set] (会員フォローイング)MEMBER_FOLLOWING by MY_MEMBER_ID, named 'memberFollowingByMyMemberIdList'.
     * @param memberFollowingByMyMemberIdList The entity list of referrer property 'memberFollowingByMyMemberIdList'. (NullAllowed)
     */
    def setMemberFollowingByMyMemberIdList(memberFollowingByMyMemberIdList: List[DbleMemberFollowing]): Unit = {
        _memberFollowingByMyMemberIdList = memberFollowingByMyMemberIdList;
    }

    /**
     * [convert] (会員フォローイング)MEMBER_FOLLOWING by MY_MEMBER_ID, named 'memberFollowingByMyMemberIdList'.
     * @return The new-created immutable list of immutable entity of the referrer property 'memberFollowingByMyMemberIdList'. (NotNull)
     */
    def toImmutableMemberFollowingByMyMemberIdList(): immutable.List[MemberFollowing] = {
        return toScalaList(_memberFollowingByMyMemberIdList).map(_.toImmutable());
    }

    /** (会員フォローイング)MEMBER_FOLLOWING by YOUR_MEMBER_ID, named 'memberFollowingByYourMemberIdList'. */
    protected var _memberFollowingByYourMemberIdList: List[DbleMemberFollowing] = null;

    /**
     * [get] (会員フォローイング)MEMBER_FOLLOWING by YOUR_MEMBER_ID, named 'memberFollowingByYourMemberIdList'.
     * @return The entity list of referrer property 'memberFollowingByYourMemberIdList'. (NotNull: even if no loading, returns empty list)
     */
    def getMemberFollowingByYourMemberIdList(): List[DbleMemberFollowing] = {
        if (_memberFollowingByYourMemberIdList == null) { _memberFollowingByYourMemberIdList = newReferrerScalaList(); }
        return _memberFollowingByYourMemberIdList;
    }

    /**
     * [set] (会員フォローイング)MEMBER_FOLLOWING by YOUR_MEMBER_ID, named 'memberFollowingByYourMemberIdList'.
     * @param memberFollowingByYourMemberIdList The entity list of referrer property 'memberFollowingByYourMemberIdList'. (NullAllowed)
     */
    def setMemberFollowingByYourMemberIdList(memberFollowingByYourMemberIdList: List[DbleMemberFollowing]): Unit = {
        _memberFollowingByYourMemberIdList = memberFollowingByYourMemberIdList;
    }

    /**
     * [convert] (会員フォローイング)MEMBER_FOLLOWING by YOUR_MEMBER_ID, named 'memberFollowingByYourMemberIdList'.
     * @return The new-created immutable list of immutable entity of the referrer property 'memberFollowingByYourMemberIdList'. (NotNull)
     */
    def toImmutableMemberFollowingByYourMemberIdList(): immutable.List[MemberFollowing] = {
        return toScalaList(_memberFollowingByYourMemberIdList).map(_.toImmutable());
    }

    /** (会員ログイン)MEMBER_LOGIN by MEMBER_ID, named 'memberLoginList'. */
    protected var _memberLoginList: List[DbleMemberLogin] = null;

    /**
     * [get] (会員ログイン)MEMBER_LOGIN by MEMBER_ID, named 'memberLoginList'.
     * @return The entity list of referrer property 'memberLoginList'. (NotNull: even if no loading, returns empty list)
     */
    def getMemberLoginList(): List[DbleMemberLogin] = {
        if (_memberLoginList == null) { _memberLoginList = newReferrerScalaList(); }
        return _memberLoginList;
    }

    /**
     * [set] (会員ログイン)MEMBER_LOGIN by MEMBER_ID, named 'memberLoginList'.
     * @param memberLoginList The entity list of referrer property 'memberLoginList'. (NullAllowed)
     */
    def setMemberLoginList(memberLoginList: List[DbleMemberLogin]): Unit = {
        _memberLoginList = memberLoginList;
    }

    /**
     * [convert] (会員ログイン)MEMBER_LOGIN by MEMBER_ID, named 'memberLoginList'.
     * @return The new-created immutable list of immutable entity of the referrer property 'memberLoginList'. (NotNull)
     */
    def toImmutableMemberLoginList(): immutable.List[MemberLogin] = {
        return toScalaList(_memberLoginList).map(_.toImmutable());
    }

    /** (購入)PURCHASE by MEMBER_ID, named 'purchaseList'. */
    protected var _purchaseList: List[DblePurchase] = null;

    /**
     * [get] (購入)PURCHASE by MEMBER_ID, named 'purchaseList'.
     * @return The entity list of referrer property 'purchaseList'. (NotNull: even if no loading, returns empty list)
     */
    def getPurchaseList(): List[DblePurchase] = {
        if (_purchaseList == null) { _purchaseList = newReferrerScalaList(); }
        return _purchaseList;
    }

    /**
     * [set] (購入)PURCHASE by MEMBER_ID, named 'purchaseList'.
     * @param purchaseList The entity list of referrer property 'purchaseList'. (NullAllowed)
     */
    def setPurchaseList(purchaseList: List[DblePurchase]): Unit = {
        _purchaseList = purchaseList;
    }

    /**
     * [convert] (購入)PURCHASE by MEMBER_ID, named 'purchaseList'.
     * @return The new-created immutable list of immutable entity of the referrer property 'purchaseList'. (NotNull)
     */
    def toImmutablePurchaseList(): immutable.List[Purchase] = {
        return toScalaList(_purchaseList).map(_.toImmutable());
    }

    protected def newReferrerScalaList[ELEMENT](): List[ELEMENT] = {
        return new ArrayList[ELEMENT]();
    }

    // ===================================================================================
    //                                                                        Scala Helper
    //                                                                        ============
    protected def toScalaList[ENTITY](javaList: Collection[ENTITY]): immutable.List[ENTITY] = {
        if (javaList == null) { return immutable.List(); }
        return javaList.toArray.toList.asInstanceOf[immutable.List[ENTITY]];
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    /**
     * Determine the object is equal with this. <br />
     * If primary-keys or columns of the other are same as this one, returns true.
     * @param obj The object as other entity. (NullAllowed: if null, returns false fixedly)
     * @return Comparing result.
     */
    override protected def doEquals(obj: Any) = {
        obj match {
            case obj: BsDbleMember => {
                val other: BsDbleMember = obj.asInstanceOf[BsDbleMember];
                {(
                     xSV(getMemberId(), other.getMemberId())
                )}
            }
            case _ => false
        }
    }

    override protected def doHashCode(initial: Int): Int = {
        var hs: Int = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, getMemberId());
        return hs;
    }

    override protected def doBuildStringWithRelation(li: String): String = {
        val sb: StringBuilder = new StringBuilder();
        if (_memberStatus != null && _memberStatus.isEmpty)
        { sb.append(li).append(xbRDS(_memberStatus, "memberStatus")); }
        if (_memberSecurityAsOne != null && _memberSecurityAsOne.isEmpty)
        { sb.append(li).append(xbRDS(_memberSecurityAsOne, "memberSecurityAsOne")); }
        if (_memberServiceAsOne != null && _memberServiceAsOne.isEmpty)
        { sb.append(li).append(xbRDS(_memberServiceAsOne, "memberServiceAsOne")); }
        if (_memberWithdrawalAsOne != null && _memberWithdrawalAsOne.isEmpty)
        { sb.append(li).append(xbRDS(_memberWithdrawalAsOne, "memberWithdrawalAsOne")); }
        toScalaList(_memberAddressList).foreach(et => { if (et != null) { sb.append(li).append(xbRDS(et, "memberAddressList")) } });
        toScalaList(_memberFollowingByMyMemberIdList).foreach(et => { if (et != null) { sb.append(li).append(xbRDS(et, "memberFollowingByMyMemberIdList")) } });
        toScalaList(_memberFollowingByYourMemberIdList).foreach(et => { if (et != null) { sb.append(li).append(xbRDS(et, "memberFollowingByYourMemberIdList")) } });
        toScalaList(_memberLoginList).foreach(et => { if (et != null) { sb.append(li).append(xbRDS(et, "memberLoginList")) } });
        toScalaList(_purchaseList).foreach(et => { if (et != null) { sb.append(li).append(xbRDS(et, "purchaseList")) } });
        return sb.toString();
    }
    protected def xbRDS[ET <: Entity](et: Option[ET], name: String): String = {
        return et.get.buildDisplayString(name, true, true);
    }

    override protected def doBuildColumnString(dm: String): String = {
        val sb: StringBuilder = new StringBuilder();
        sb.append(dm).append(getMemberId());
        sb.append(dm).append(getMemberName());
        sb.append(dm).append(getMemberAccount());
        sb.append(dm).append(getMemberStatusCode());
        sb.append(dm).append(getFormalizedDatetime());
        sb.append(dm).append(getBirthdate());
        sb.append(dm).append(getRegisterDatetime());
        sb.append(dm).append(getRegisterUser());
        sb.append(dm).append(getUpdateDatetime());
        sb.append(dm).append(getUpdateUser());
        sb.append(dm).append(getVersionNo());
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    override protected def doBuildRelationString(dm: String): String = {
        val sb: StringBuilder = new StringBuilder();
        if (_memberStatus != null && _memberStatus.isEmpty)
        { sb.append(dm).append("memberStatus"); }
        if (_memberSecurityAsOne != null && _memberSecurityAsOne.isEmpty)
        { sb.append(dm).append("memberSecurityAsOne"); }
        if (_memberServiceAsOne != null && _memberServiceAsOne.isEmpty)
        { sb.append(dm).append("memberServiceAsOne"); }
        if (_memberWithdrawalAsOne != null && _memberWithdrawalAsOne.isEmpty)
        { sb.append(dm).append("memberWithdrawalAsOne"); }
        if (_memberAddressList != null && !_memberAddressList.isEmpty)
        { sb.append(dm).append("memberAddressList"); }
        if (_memberFollowingByMyMemberIdList != null && !_memberFollowingByMyMemberIdList.isEmpty)
        { sb.append(dm).append("memberFollowingByMyMemberIdList"); }
        if (_memberFollowingByYourMemberIdList != null && !_memberFollowingByYourMemberIdList.isEmpty)
        { sb.append(dm).append("memberFollowingByYourMemberIdList"); }
        if (_memberLoginList != null && !_memberLoginList.isEmpty)
        { sb.append(dm).append("memberLoginList"); }
        if (_purchaseList != null && !_purchaseList.isEmpty)
        { sb.append(dm).append("purchaseList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    override def clone(): DbleMember = {
        return super.clone().asInstanceOf[DbleMember];
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (会員ID)MEMBER_ID: {PK, ID, NotNull, INTEGER(10)} <br />
     * @return The value of the column 'MEMBER_ID'. (basically NotNull if selected: for the constraint)
     */
    def getMemberId(): Integer = {
        return _memberId;
    }

    /**
     * [set] (会員ID)MEMBER_ID: {PK, ID, NotNull, INTEGER(10)} <br />
     * @param memberId The value of the column 'MEMBER_ID'. (basically NotNull if update: for the constraint)
     */
    def setMemberId(memberId: Integer): Unit = {
        __modifiedProperties.addPropertyName("memberId");
        _memberId = memberId;
    }

    /**
     * [get] (会員名称)MEMBER_NAME: {IX, NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'MEMBER_NAME'. (basically NotNull if selected: for the constraint)
     */
    def getMemberName(): String = {
        return convertEmptyToNull(_memberName);
    }

    /**
     * [set] (会員名称)MEMBER_NAME: {IX, NotNull, VARCHAR(200)} <br />
     * @param memberName The value of the column 'MEMBER_NAME'. (basically NotNull if update: for the constraint)
     */
    def setMemberName(memberName: String): Unit = {
        __modifiedProperties.addPropertyName("memberName");
        _memberName = memberName;
    }

    /**
     * [get] (会員アカウント)MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR(50)} <br />
     * @return The value of the column 'MEMBER_ACCOUNT'. (basically NotNull if selected: for the constraint)
     */
    def getMemberAccount(): String = {
        return convertEmptyToNull(_memberAccount);
    }

    /**
     * [set] (会員アカウント)MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR(50)} <br />
     * @param memberAccount The value of the column 'MEMBER_ACCOUNT'. (basically NotNull if update: for the constraint)
     */
    def setMemberAccount(memberAccount: String): Unit = {
        __modifiedProperties.addPropertyName("memberAccount");
        _memberAccount = memberAccount;
    }

    /**
     * [get] (会員ステータスコード)MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus} <br />
     * @return The value of the column 'MEMBER_STATUS_CODE'. (basically NotNull if selected: for the constraint)
     */
    def getMemberStatusCode(): String = {
        return convertEmptyToNull(_memberStatusCode);
    }

    /**
     * [set] (会員ステータスコード)MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus} <br />
     * @param memberStatusCode The value of the column 'MEMBER_STATUS_CODE'. (basically NotNull if update: for the constraint)
     */
    protected def setMemberStatusCode(memberStatusCode: String): Unit = {
        checkClassificationCode("MEMBER_STATUS_CODE", CDef.DefMeta.MemberStatus, memberStatusCode);
        __modifiedProperties.addPropertyName("memberStatusCode");
        _memberStatusCode = memberStatusCode;
    }

    /**
     * [get] (正式会員日時)FORMALIZED_DATETIME: {IX, TIMESTAMP(23, 10)} <br />
     * @return The value of the column 'FORMALIZED_DATETIME'. (NullAllowed even if selected: for no constraint)
     */
    def getFormalizedDatetime(): org.joda.time.LocalDateTime = {
        return _formalizedDatetime;
    }

    /**
     * [set] (正式会員日時)FORMALIZED_DATETIME: {IX, TIMESTAMP(23, 10)} <br />
     * @param formalizedDatetime The value of the column 'FORMALIZED_DATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    def setFormalizedDatetime(formalizedDatetime: org.joda.time.LocalDateTime): Unit = {
        __modifiedProperties.addPropertyName("formalizedDatetime");
        _formalizedDatetime = formalizedDatetime;
    }

    /**
     * [get] (生年月日)BIRTHDATE: {DATE(8)} <br />
     * @return The value of the column 'BIRTHDATE'. (NullAllowed even if selected: for no constraint)
     */
    def getBirthdate(): org.joda.time.LocalDate = {
        return _birthdate;
    }

    /**
     * [set] (生年月日)BIRTHDATE: {DATE(8)} <br />
     * @param birthdate The value of the column 'BIRTHDATE'. (NullAllowed: null update allowed for no constraint)
     */
    def setBirthdate(birthdate: org.joda.time.LocalDate): Unit = {
        __modifiedProperties.addPropertyName("birthdate");
        _birthdate = birthdate;
    }

    /**
     * [get] (登録日時)REGISTER_DATETIME: {NotNull, TIMESTAMP(23, 10)} <br />
     * @return The value of the column 'REGISTER_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    def getRegisterDatetime(): org.joda.time.LocalDateTime = {
        return _registerDatetime;
    }

    /**
     * [set] (登録日時)REGISTER_DATETIME: {NotNull, TIMESTAMP(23, 10)} <br />
     * @param registerDatetime The value of the column 'REGISTER_DATETIME'. (basically NotNull if update: for the constraint)
     */
    def setRegisterDatetime(registerDatetime: org.joda.time.LocalDateTime): Unit = {
        __modifiedProperties.addPropertyName("registerDatetime");
        _registerDatetime = registerDatetime;
    }

    /**
     * [get] (登録ユーザ)REGISTER_USER: {NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'REGISTER_USER'. (basically NotNull if selected: for the constraint)
     */
    def getRegisterUser(): String = {
        return convertEmptyToNull(_registerUser);
    }

    /**
     * [set] (登録ユーザ)REGISTER_USER: {NotNull, VARCHAR(200)} <br />
     * @param registerUser The value of the column 'REGISTER_USER'. (basically NotNull if update: for the constraint)
     */
    def setRegisterUser(registerUser: String): Unit = {
        __modifiedProperties.addPropertyName("registerUser");
        _registerUser = registerUser;
    }

    /**
     * [get] (更新日時)UPDATE_DATETIME: {NotNull, TIMESTAMP(23, 10)} <br />
     * @return The value of the column 'UPDATE_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    def getUpdateDatetime(): org.joda.time.LocalDateTime = {
        return _updateDatetime;
    }

    /**
     * [set] (更新日時)UPDATE_DATETIME: {NotNull, TIMESTAMP(23, 10)} <br />
     * @param updateDatetime The value of the column 'UPDATE_DATETIME'. (basically NotNull if update: for the constraint)
     */
    def setUpdateDatetime(updateDatetime: org.joda.time.LocalDateTime): Unit = {
        __modifiedProperties.addPropertyName("updateDatetime");
        _updateDatetime = updateDatetime;
    }

    /**
     * [get] (更新ユーザ)UPDATE_USER: {NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'UPDATE_USER'. (basically NotNull if selected: for the constraint)
     */
    def getUpdateUser(): String = {
        return convertEmptyToNull(_updateUser);
    }

    /**
     * [set] (更新ユーザ)UPDATE_USER: {NotNull, VARCHAR(200)} <br />
     * @param updateUser The value of the column 'UPDATE_USER'. (basically NotNull if update: for the constraint)
     */
    def setUpdateUser(updateUser: String): Unit = {
        __modifiedProperties.addPropertyName("updateUser");
        _updateUser = updateUser;
    }

    /**
     * [get] (バージョンNO)VERSION_NO: {NotNull, BIGINT(19)} <br />
     * @return The value of the column 'VERSION_NO'. (basically NotNull if selected: for the constraint)
     */
    def getVersionNo(): Long = {
        return _versionNo;
    }

    /**
     * [set] (バージョンNO)VERSION_NO: {NotNull, BIGINT(19)} <br />
     * @param versionNo The value of the column 'VERSION_NO'. (basically NotNull if update: for the constraint)
     */
    def setVersionNo(versionNo: Long): Unit = {
        __modifiedProperties.addPropertyName("versionNo");
        _versionNo = versionNo;
    }

    /**
     * For framework so basically DON'T use this method.
     * @param memberStatusCode The value of the column 'MEMBER_STATUS_CODE'. (basically NotNull if update: for the constraint)
     */
    def mynativeMappingMemberStatusCode(memberStatusCode: String): Unit = {
        setMemberStatusCode(memberStatusCode);
    }
}
