package com.example.dbflute.scala.dbflute.bsentity;

import scala.collection.immutable._;
import scala.collection.JavaConverters._;

import java.io.Serializable;
import java.util.Collection;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.FunCustodial;
import com.example.dbflute.scala.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.scala.dbflute.allcommon.CDef;
import com.example.dbflute.scala.dbflute.exentity._;

/**
 * The immutable entity of (会員ログイン)MEMBER_LOGIN as TABLE. <br />
 * <pre>
 * [primary-key]
 *     MEMBER_LOGIN_ID
 * 
 * [column]
 *     MEMBER_LOGIN_ID, MEMBER_ID, LOGIN_DATETIME, MOBILE_LOGIN_FLG, LOGIN_MEMBER_STATUS_CODE
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     MEMBER_LOGIN_ID
 * 
 * [version-no]
 *     
 * 
 * [foreign table]
 *     MEMBER_STATUS, MEMBER
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     memberStatus, member
 * 
 * [referrer property]
 *     
 * 
 * [get template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * val memberLoginId: Long = entity.memberLoginId
 * val memberId: Int = entity.memberId
 * val loginDatetime: org.joda.time.LocalDateTime = entity.loginDatetime
 * val mobileLoginFlg: CDef.Flg = entity.mobileLoginFlg
 * val loginMemberStatusCode: CDef.MemberStatus = entity.loginMemberStatusCode
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
abstract class BsMemberLogin(dble: DbleMemberLogin) extends Serializable {

    // ===================================================================================
    //                                                                           Case Like
    //                                                                           =========
    def copy(
         memberLoginId: Long = memberLoginId
        , memberId: Int = memberId
        , loginDatetime: org.joda.time.LocalDateTime = loginDatetime
        , mobileLoginFlg: CDef.Flg = mobileLoginFlg
        , loginMemberStatusCode: CDef.MemberStatus = loginMemberStatusCode
    ): MemberLogin = {
        val newDble = new DbleMemberLogin
        newDble.myuniqueDrivenProperties.addAll(dble.myuniqueDrivenProperties) // inherit
        newDble.mymodifiedProperties.addAll(dble.mymodifiedProperties) // inherit
        if (!memberLoginId.equals(this.memberLoginId)) { newDble.setMemberLoginId(memberLoginId) }
        if (!memberId.equals(this.memberId)) { newDble.setMemberId(memberId) }
        if (!loginDatetime.equals(this.loginDatetime)) { newDble.setLoginDatetime(loginDatetime) }
        if (!mobileLoginFlg.equals(this.mobileLoginFlg)) { newDble.setMobileLoginFlgAsFlg(mobileLoginFlg) }
        if (!loginMemberStatusCode.equals(this.loginMemberStatusCode)) { newDble.setLoginMemberStatusCodeAsMemberStatus(loginMemberStatusCode) }
        new MemberLogin(newDble)
    }

    // ===================================================================================
    //                                                                         Entity Meta
    //                                                                         ===========
    def getTableDbName(): String = { dble.getTableDbName }
    def getDBMeta(): DBMeta = { dble.getDBMeta }
    def getMyUniqueDrivenProperties(): Set[String] = { toScalaStringSet(dble.myuniqueDrivenProperties) }
    def getMyModifiedProperties(): Set[String] = { toScalaStringSet(dble.mymodifiedProperties) }

    protected def toScalaStringSet(javaList: java.util.Collection[String]): Set[String] =
    { Set(javaList.toArray).asInstanceOf[Set[String]] }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of mobileLoginFlg as the classification of Flg. <br />
     * (モバイルログインフラグ)MOBILE_LOGIN_FLG: {NotNull, INTEGER(10), classification=Flg} <br />
     * general boolean classification for every flg-column
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    def mobileLoginFlgAsFlg: CDef.Flg = { dble.getMobileLoginFlgAsFlg }

    /**
     * Get the value of loginMemberStatusCode as the classification of MemberStatus. <br />
     * (ログイン時会員ステータスコード)LOGIN_MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus} <br />
     * status of member from entry to withdrawal
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    def loginMemberStatusCodeAsMemberStatus: CDef.MemberStatus = { dble.getLoginMemberStatusCodeAsMemberStatus }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of mobileLoginFlg True? <br />
     * Yes: means valid
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isMobileLoginFlg_True: Boolean = { dble.isMobileLoginFlg_True }

    /**
     * Is the value of mobileLoginFlg False? <br />
     * No: means invalid
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isMobileLoginFlg_False: Boolean = { dble.isMobileLoginFlg_False }

    /**
     * Is the value of loginMemberStatusCode Formalized? <br />
     * Formalized: as formal member, allowed to use all service
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isLoginMemberStatusCode_Formalized: Boolean = { dble.isLoginMemberStatusCode_Formalized }

    /**
     * Is the value of loginMemberStatusCode Withdrawal? <br />
     * Withdrawal: withdrawal is fixed, not allowed to use service
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isLoginMemberStatusCode_Withdrawal: Boolean = { dble.isLoginMemberStatusCode_Withdrawal }

    /**
     * Is the value of loginMemberStatusCode Provisional? <br />
     * Provisional: first status after entry, allowed to use only part of service
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isLoginMemberStatusCode_Provisional: Boolean = { dble.isLoginMemberStatusCode_Provisional }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    /**
     * Get the value of the column 'mobileLoginFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    def mobileLoginFlgName: String = { dble.getMobileLoginFlgName }

    /**
     * Get the value of the column 'mobileLoginFlg' as classification alias.
     * @return The string of classification alias. (NullAllowed: when the column value is null)
     */
    def mobileLoginFlgAlias: String = { dble.getMobileLoginFlgAlias }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /**
     * [get] (会員ステータス)MEMBER_STATUS by my LOGIN_MEMBER_STATUS_CODE, named 'memberStatus'.
     * @return The entity of foreign property 'memberStatus'. (EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    def memberStatus: Option[MemberStatus] = { dble.toImmutableMemberStatus }

    /**
     * [get] (会員)MEMBER by my MEMBER_ID, named 'member'.
     * @return The entity of foreign property 'member'. (EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    def member: Option[Member] = { dble.toImmutableMember }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    // ===================================================================================
    //                                                                    Derived Mappable
    //                                                                    ================
    /**
     * Find the derived value from derived map.
     * @param <VALUE> The type of the value.
     * @param aliasName The alias name of derived-referrer. (NotNull)
     * @return The derived value found in the map. (NullAllowed: when null selected)
     */
    def derived[VALUE](aliasName: String): VALUE = { dble.derived[VALUE](aliasName) }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    /**
     * Determine the object is equal with this. <br />
     * If primary-keys or columns of the other are same as this one, returns true.
     * @param obj The object as other entity. (NullAllowed: if null, returns false fixedly)
     * @return Comparing result.
     */
    override def equals(obj: Any) = {
        obj match {
            case obj: BsMemberLogin => {
                val other: BsMemberLogin = obj.asInstanceOf[BsMemberLogin];
                {(
                     xSV(memberLoginId, other.memberLoginId)
                )}
            }
            case _ => false
        }
    }
    protected def xSV(v1: Int, v2: Int): Boolean = { return v1 == v2; }
    protected def xSV(v1: Long, v2: Long): Boolean = { return v1 == v2; }
    protected def xSV(v1: Object, v2: Object): Boolean = { return FunCustodial.isSameValue(v1, v2) }

    /**
     * Calculate the hash-code from primary-keys or columns.
     * @return The hash-code from primary-key or columns.
     */
    override def hashCode(): Int = { return dble.hashCode; }
    def instanceHash(): Int = { return dble.instanceHash; }

    /**
     * Convert to display string of entity's data. (no relation data)
     * @return The display string of all columns and relation existences. (NotNull)
     */
    override def toString(): String = { dble.buildDisplayString(FunCustodial.toClassTitle(this), true, true) }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (会員ログインID)MEMBER_LOGIN_ID: {PK, ID, NotNull, BIGINT(19)} <br />
     * @return The value of the column 'MEMBER_LOGIN_ID'. (NotNull but EmptyAllowed if null in database)
     */
    def memberLoginId: Long = { dble.getMemberLoginId }

    /**
     * [get] (会員ID)MEMBER_ID: {UQ+, IX, NotNull, INTEGER(10), FK to MEMBER} <br />
     * @return The value of the column 'MEMBER_ID'. (NotNull but EmptyAllowed if null in database)
     */
    def memberId: Int = { dble.getMemberId }

    /**
     * [get] (ログイン日時)LOGIN_DATETIME: {+UQ, IX, NotNull, TIMESTAMP(23, 10)} <br />
     * @return The value of the column 'LOGIN_DATETIME'. (NotNull but EmptyAllowed if null in database)
     */
    def loginDatetime: org.joda.time.LocalDateTime = { dble.getLoginDatetime }

    /**
     * [get] (モバイルログインフラグ)MOBILE_LOGIN_FLG: {NotNull, INTEGER(10), classification=Flg} <br />
     * @return The value of the column 'MOBILE_LOGIN_FLG'. (NotNull but EmptyAllowed if null in database)
     */
    def mobileLoginFlg: CDef.Flg = { dble.getMobileLoginFlgAsFlg }

    /**
     * [get] (ログイン時会員ステータスコード)LOGIN_MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus} <br />
     * @return The value of the column 'LOGIN_MEMBER_STATUS_CODE'. (NotNull but EmptyAllowed if null in database)
     */
    def loginMemberStatusCode: CDef.MemberStatus = { dble.getLoginMemberStatusCodeAsMemberStatus }
}

/* _/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/ */
/* _/_/_/_/_/_/_/_/_/_/_/                                                                      _/_/_/_/_/_/_/_/_/_/_/ */
/* _/_/_/_/_/_/_/_/_/_/_/                  Immutable                                           _/_/_/_/_/_/_/_/_/_/_/ */
/* _/_/_/_/_/_/_/_/_/_/_/                                                                      _/_/_/_/_/_/_/_/_/_/_/ */
/* _/_/_/_/_/_/_/_/_/_/_/                                        Mutable                       _/_/_/_/_/_/_/_/_/_/_/ */
/* _/_/_/_/_/_/_/_/_/_/_/                                                                      _/_/_/_/_/_/_/_/_/_/_/ */
/* _/_/_/_/_/_/_/_/_/_/_/                              Border                                  _/_/_/_/_/_/_/_/_/_/_/ */
/* _/_/_/_/_/_/_/_/_/_/_/                                                                      _/_/_/_/_/_/_/_/_/_/_/ */
/* _/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/ */

/**
 * The mutable entity of (会員ログイン)MEMBER_LOGIN as TABLE. <br />
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * val memberLoginId: Long = entity.memberLoginId
 * val memberId: Int = entity.memberId
 * val loginDatetime: org.joda.time.LocalDateTime = entity.loginDatetime
 * val mobileLoginFlg: CDef.Flg = entity.mobileLoginFlg
 * val loginMemberStatusCode: CDef.MemberStatus = entity.loginMemberStatusCode
 * entity.memberLoginId = memberLoginId
 * entity.memberId = memberId
 * entity.loginDatetime = loginDatetime
 * entity.mobileLoginFlg = mobileLoginFlg
 * entity.loginMemberStatusCode = loginMemberStatusCode
 * = = = = = = = = = =/
 * @author DBFlute(AutoGenerator)
 */
abstract class BsMbleMemberLogin {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected val dble: DbleMemberLogin = new DbleMemberLogin();

    // ===================================================================================
    //                                                                      DB-able Entity
    //                                                                      ==============
    def toDBable(): DbleMemberLogin = { dble }

    // ===================================================================================
    //                                                                    Immutable Entity
    //                                                                    ================
    def toImmutable(): MemberLogin = { dble.toImmutable() }

    // ===================================================================================
    //                                                                          Unique Key
    //                                                                          ==========
    /**
     * To be unique by the unique column. <br />
     * You can update the entity by the key when entity update (NOT batch update).
     * @param memberId (会員ID): UQ+, IX, NotNull, INTEGER(10), FK to MEMBER. (NotNull)
     * @param loginDatetime (ログイン日時): +UQ, IX, NotNull, TIMESTAMP(23, 10). (NotNull)
     */
    def uniqueBy(memberId: Integer, loginDatetime: org.joda.time.LocalDateTime): Unit = { dble.setMemberId(memberId);dble.setLoginDatetime(loginDatetime); }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of mobileLoginFlg as the classification of Flg. <br />
     * (モバイルログインフラグ)MOBILE_LOGIN_FLG: {NotNull, INTEGER(10), classification=Flg} <br />
     * general boolean classification for every flg-column
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    def mobileLoginFlgAsFlg: CDef.Flg = { dble.getMobileLoginFlgAsFlg }

    /**
     * Set the value of mobileLoginFlg as the classification of Flg. <br />
     * (モバイルログインフラグ)MOBILE_LOGIN_FLG: {NotNull, INTEGER(10), classification=Flg} <br />
     * general boolean classification for every flg-column
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    def mobileLoginFlgAsFlg_=(cdef: CDef.Flg): Unit = { dble.setMobileLoginFlgAsFlg(cdef) }

    /**
     * Get the value of loginMemberStatusCode as the classification of MemberStatus. <br />
     * (ログイン時会員ステータスコード)LOGIN_MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus} <br />
     * status of member from entry to withdrawal
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    def loginMemberStatusCodeAsMemberStatus: CDef.MemberStatus = { dble.getLoginMemberStatusCodeAsMemberStatus }

    /**
     * Set the value of loginMemberStatusCode as the classification of MemberStatus. <br />
     * (ログイン時会員ステータスコード)LOGIN_MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus} <br />
     * status of member from entry to withdrawal
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    def loginMemberStatusCodeAsMemberStatus_=(cdef: CDef.MemberStatus): Unit = { dble.setLoginMemberStatusCodeAsMemberStatus(cdef) }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of mobileLoginFlg as True (1). <br />
     * Yes: means valid
     */
    def mobileLoginFlg_True: Unit = { dble.setMobileLoginFlg_True }

    /**
     * Set the value of mobileLoginFlg as False (0). <br />
     * No: means invalid
     */
    def mobileLoginFlg_False: Unit = { dble.setMobileLoginFlg_False }

    /**
     * Set the value of loginMemberStatusCode as Formalized (FML). <br />
     * Formalized: as formal member, allowed to use all service
     */
    def loginMemberStatusCode_Formalized: Unit = { dble.setLoginMemberStatusCode_Formalized }

    /**
     * Set the value of loginMemberStatusCode as Withdrawal (WDL). <br />
     * Withdrawal: withdrawal is fixed, not allowed to use service
     */
    def loginMemberStatusCode_Withdrawal: Unit = { dble.setLoginMemberStatusCode_Withdrawal }

    /**
     * Set the value of loginMemberStatusCode as Provisional (PRV). <br />
     * Provisional: first status after entry, allowed to use only part of service
     */
    def loginMemberStatusCode_Provisional: Unit = { dble.setLoginMemberStatusCode_Provisional }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of mobileLoginFlg True? <br />
     * Yes: means valid
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isMobileLoginFlg_True: Boolean = { dble.isMobileLoginFlg_True }

    /**
     * Is the value of mobileLoginFlg False? <br />
     * No: means invalid
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isMobileLoginFlg_False: Boolean = { dble.isMobileLoginFlg_False }

    /**
     * Is the value of loginMemberStatusCode Formalized? <br />
     * Formalized: as formal member, allowed to use all service
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isLoginMemberStatusCode_Formalized: Boolean = { dble.isLoginMemberStatusCode_Formalized }

    /**
     * Is the value of loginMemberStatusCode Withdrawal? <br />
     * Withdrawal: withdrawal is fixed, not allowed to use service
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isLoginMemberStatusCode_Withdrawal: Boolean = { dble.isLoginMemberStatusCode_Withdrawal }

    /**
     * Is the value of loginMemberStatusCode Provisional? <br />
     * Provisional: first status after entry, allowed to use only part of service
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isLoginMemberStatusCode_Provisional: Boolean = { dble.isLoginMemberStatusCode_Provisional }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (会員ログインID)MEMBER_LOGIN_ID: {PK, ID, NotNull, BIGINT(19)} <br />
     * @return The value of the column 'MEMBER_LOGIN_ID'. (basically NotNull if selected: for the constraint)
     */
    def memberLoginId: Long = { dble.getMemberLoginId }

    /**
     * [set] (会員ログインID)MEMBER_LOGIN_ID: {PK, ID, NotNull, BIGINT(19)} <br />
     * @param memberLoginId The value of the column 'MEMBER_LOGIN_ID'. (NullAllowed: null update allowed for no constraint)
     */
    def memberLoginId_=(memberLoginId: Long) = { dble.setMemberLoginId(memberLoginId) }

    /**
     * [get] (会員ID)MEMBER_ID: {UQ+, IX, NotNull, INTEGER(10), FK to MEMBER} <br />
     * @return The value of the column 'MEMBER_ID'. (basically NotNull if selected: for the constraint)
     */
    def memberId: Int = { dble.getMemberId }

    /**
     * [set] (会員ID)MEMBER_ID: {UQ+, IX, NotNull, INTEGER(10), FK to MEMBER} <br />
     * @param memberId The value of the column 'MEMBER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    def memberId_=(memberId: Int) = { dble.setMemberId(memberId) }

    /**
     * [get] (ログイン日時)LOGIN_DATETIME: {+UQ, IX, NotNull, TIMESTAMP(23, 10)} <br />
     * @return The value of the column 'LOGIN_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    def loginDatetime: org.joda.time.LocalDateTime = { dble.getLoginDatetime }

    /**
     * [set] (ログイン日時)LOGIN_DATETIME: {+UQ, IX, NotNull, TIMESTAMP(23, 10)} <br />
     * @param loginDatetime The value of the column 'LOGIN_DATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    def loginDatetime_=(loginDatetime: org.joda.time.LocalDateTime) = { dble.setLoginDatetime(loginDatetime) }

    /**
     * [get] (モバイルログインフラグ)MOBILE_LOGIN_FLG: {NotNull, INTEGER(10), classification=Flg} <br />
     * @return The value of the column 'MOBILE_LOGIN_FLG'. (basically NotNull if selected: for the constraint)
     */
    def mobileLoginFlg: CDef.Flg = { dble.getMobileLoginFlgAsFlg }

    /**
     * [set] (モバイルログインフラグ)MOBILE_LOGIN_FLG: {NotNull, INTEGER(10), classification=Flg} <br />
     * @param mobileLoginFlg The value of the column 'MOBILE_LOGIN_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    protected def mobileLoginFlg_=(mobileLoginFlg: CDef.Flg) = { dble.setMobileLoginFlgAsFlg(mobileLoginFlg) }

    /**
     * [get] (ログイン時会員ステータスコード)LOGIN_MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus} <br />
     * @return The value of the column 'LOGIN_MEMBER_STATUS_CODE'. (basically NotNull if selected: for the constraint)
     */
    def loginMemberStatusCode: CDef.MemberStatus = { dble.getLoginMemberStatusCodeAsMemberStatus }

    /**
     * [set] (ログイン時会員ステータスコード)LOGIN_MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus} <br />
     * @param loginMemberStatusCode The value of the column 'LOGIN_MEMBER_STATUS_CODE'. (NullAllowed: null update allowed for no constraint)
     */
    protected def loginMemberStatusCode_=(loginMemberStatusCode: CDef.MemberStatus) = { dble.setLoginMemberStatusCodeAsMemberStatus(loginMemberStatusCode) }
}
