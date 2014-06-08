package com.example.dbflute.scala.dbflute.bsentity;

import scala.collection.immutable._;
import scala.collection.JavaConverters._;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.Entity.FunCustodial;
import com.example.dbflute.scala.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.scala.dbflute.allcommon.CDef;
import com.example.dbflute.scala.dbflute.exentity._;

/**
 * The immutable entity of (会員)MEMBER as TABLE. <br />
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
 *     MEMBER_STATUS, MEMBER_SERVICE(AsOne)
 * 
 * [referrer table]
 *     PURCHASE, MEMBER_SERVICE
 * 
 * [foreign property]
 *     memberStatus, memberServiceAsOne
 * 
 * [referrer property]
 *     purchaseList
 * 
 * [get template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * val memberId: Int = entity.memberId
 * val memberName: String = entity.memberName
 * val memberAccount: String = entity.memberAccount
 * val memberStatusCode: CDef.MemberStatus = entity.memberStatusCode
 * val formalizedDatetime: Option[java.sql.Timestamp] = entity.formalizedDatetime
 * val birthdate: Option[java.util.Date] = entity.birthdate
 * val registerDatetime: java.sql.Timestamp = entity.registerDatetime
 * val registerUser: String = entity.registerUser
 * val updateDatetime: java.sql.Timestamp = entity.updateDatetime
 * val updateUser: String = entity.updateUser
 * val versionNo: Long = entity.versionNo
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
abstract class BsMember(dble: DbleMember) extends Serializable {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** (会員ID)MEMBER_ID: {PK, ID, NotNull, INTEGER(10)} */
    protected val _memberId: Int = dble.getMemberId;

    /** (会員名称)MEMBER_NAME: {IX, NotNull, VARCHAR(200)} */
    protected val _memberName: String = dble.getMemberName;

    /** (会員アカウント)MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR(50)} */
    protected val _memberAccount: String = dble.getMemberAccount;

    /** (会員ステータスコード)MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus} */
    protected val _memberStatusCode: CDef.MemberStatus = dble.getMemberStatusCodeAsMemberStatus;

    /** (正式会員日時)FORMALIZED_DATETIME: {IX, TIMESTAMP(23, 10)} */
    protected val _formalizedDatetime: Option[java.sql.Timestamp] = Option(dble.getFormalizedDatetime);

    /** (生年月日)BIRTHDATE: {DATE(8)} */
    protected val _birthdate: Option[java.util.Date] = Option(dble.getBirthdate);

    /** (登録日時)REGISTER_DATETIME: {NotNull, TIMESTAMP(23, 10)} */
    protected val _registerDatetime: java.sql.Timestamp = dble.getRegisterDatetime;

    /** (登録ユーザ)REGISTER_USER: {NotNull, VARCHAR(200)} */
    protected val _registerUser: String = dble.getRegisterUser;

    /** (更新日時)UPDATE_DATETIME: {NotNull, TIMESTAMP(23, 10)} */
    protected val _updateDatetime: java.sql.Timestamp = dble.getUpdateDatetime;

    /** (更新ユーザ)UPDATE_USER: {NotNull, VARCHAR(200)} */
    protected val _updateUser: String = dble.getUpdateUser;

    /** (バージョンNO)VERSION_NO: {NotNull, BIGINT(19)} */
    protected val _versionNo: Long = dble.getVersionNo;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The unique-driven properties for this entity. (NotNull) */
    protected val __uniqueDrivenProperties: Set[String] = toScalaStringSet(dble.myuniqueDrivenProperties());

    /** The modified properties for this entity. (NotNull) */
    protected val __modifiedProperties: Set[String] = toScalaStringSet(dble.modifiedProperties());

    protected def toScalaStringSet(javaList: java.util.Collection[String]): Set[String] =
    { Set(javaList.toArray).asInstanceOf[Set[String]] }

    // ===================================================================================
    //                                                                           Case Like
    //                                                                           =========
    def copy(
         memberId: Int = _memberId
        , memberName: String = _memberName
        , memberAccount: String = _memberAccount
        , memberStatusCode: CDef.MemberStatus = _memberStatusCode
        , formalizedDatetime: Option[java.sql.Timestamp] = _formalizedDatetime
        , birthdate: Option[java.util.Date] = _birthdate
        , registerDatetime: java.sql.Timestamp = _registerDatetime
        , registerUser: String = _registerUser
        , updateDatetime: java.sql.Timestamp = _updateDatetime
        , updateUser: String = _updateUser
        , versionNo: Long = _versionNo
    ): Member = {
        val newDble = new DbleMember();
        newDble.myuniqueDrivenProperties.addAll(__uniqueDrivenProperties.asJava); // inherit
        newDble.modifiedProperties.addAll(__modifiedProperties.asJava); // inherit
        if (!memberId.equals(_memberId)) { newDble.setMemberId(_memberId); }
        if (!memberName.equals(_memberName)) { newDble.setMemberName(_memberName); }
        if (!memberAccount.equals(_memberAccount)) { newDble.setMemberAccount(_memberAccount); }
        if (!memberStatusCode.equals(_memberStatusCode)) { newDble.setMemberStatusCodeAsMemberStatus(_memberStatusCode); }
        if (!formalizedDatetime.equals(_formalizedDatetime)) { newDble.setFormalizedDatetime(_formalizedDatetime.orNull); }
        if (!birthdate.equals(_birthdate)) { newDble.setBirthdate(_birthdate.orNull); }
        if (!registerDatetime.equals(_registerDatetime)) { newDble.setRegisterDatetime(_registerDatetime); }
        if (!registerUser.equals(_registerUser)) { newDble.setRegisterUser(_registerUser); }
        if (!updateDatetime.equals(_updateDatetime)) { newDble.setUpdateDatetime(_updateDatetime); }
        if (!updateUser.equals(_updateUser)) { newDble.setUpdateUser(_updateUser); }
        if (!versionNo.equals(_versionNo)) { newDble.setVersionNo(_versionNo); }
        return new Member(newDble);
    }

    // ===================================================================================
    //                                                                         Entity Meta
    //                                                                         ===========
    def getTableDbName(): String = { dble.getTableDbName }
    def getDBMeta(): DBMeta = { dble.getDBMeta }
    def getMyUniqueDrivenProperties(): Set[String] = { __uniqueDrivenProperties }
    def getModifiedProperties(): Set[String] = { __modifiedProperties }

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
    def memberStatusCodeAsMemberStatus: CDef.MemberStatus = { dble.getMemberStatusCodeAsMemberStatus }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of memberStatusCode Formalized? <br />
     * Formalized: as formal member, allowed to use all service
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isMemberStatusCode_Formalized: Boolean = { dble.isMemberStatusCode_Formalized }

    /**
     * Is the value of memberStatusCode Withdrawal? <br />
     * Withdrawal: withdrawal is fixed, not allowed to use service
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isMemberStatusCode_Withdrawal: Boolean = { dble.isMemberStatusCode_Withdrawal }

    /**
     * Is the value of memberStatusCode Provisional? <br />
     * Provisional: first status after entry, allowed to use only part of service
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isMemberStatusCode_Provisional: Boolean = { dble.isMemberStatusCode_Provisional }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** (会員ステータス)MEMBER_STATUS by my MEMBER_STATUS_CODE, named 'memberStatus'. */
    protected val _memberStatus: Option[MemberStatus] = dble.toImmutableMemberStatus

    /**
     * [get] (会員ステータス)MEMBER_STATUS by my MEMBER_STATUS_CODE, named 'memberStatus'.
     * @return The entity of foreign property 'memberStatus'. (EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    def memberStatus: Option[MemberStatus] = { _memberStatus }

    /** (会員サービス)MEMBER_SERVICE by MEMBER_ID, named 'memberServiceAsOne'. */
    protected val _memberServiceAsOne: Option[MemberService] = dble.toImmutableMemberServiceAsOne

    /**
     * [get] (会員サービス)MEMBER_SERVICE by MEMBER_ID, named 'memberServiceAsOne'.
     * @return the entity of foreign property(referrer-as-one) 'memberServiceAsOne'. (EmptyAllowed: when e.g. no data, no setupSelect)
     */
    def memberServiceAsOne: Option[MemberService] = { return _memberServiceAsOne; }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** (購入)PURCHASE by MEMBER_ID, named 'purchaseList'. */
    protected var _purchaseList: List[Purchase] = dble.toImmutablePurchaseList

    /**
     * [get] (購入)PURCHASE by MEMBER_ID, named 'purchaseList'.
     * @return The entity list of referrer property 'purchaseList'. (NotNull: even if no loading, returns empty list)
     */
    def purchaseList: List[Purchase] = { return _purchaseList; }

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
            case obj: BsMember => {
                val other: BsMember = obj.asInstanceOf[BsMember];
                {
                     xSV(memberId, other.memberId)
                }
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
    override def toString(): String = { return dble.buildDisplayString(FunCustodial.toClassTitle(this), true, true); }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (会員ID)MEMBER_ID: {PK, ID, NotNull, INTEGER(10)} <br />
     * @return The value of the column 'MEMBER_ID'. (NotNull but EmptyAllowed if null in database)
     */
    def memberId: Int = { return _memberId; }

    /**
     * [get] (会員名称)MEMBER_NAME: {IX, NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'MEMBER_NAME'. (NotNull but EmptyAllowed if null in database)
     */
    def memberName: String = { return _memberName; }

    /**
     * [get] (会員アカウント)MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR(50)} <br />
     * @return The value of the column 'MEMBER_ACCOUNT'. (NotNull but EmptyAllowed if null in database)
     */
    def memberAccount: String = { return _memberAccount; }

    /**
     * [get] (会員ステータスコード)MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus} <br />
     * @return The value of the column 'MEMBER_STATUS_CODE'. (NotNull but EmptyAllowed if null in database)
     */
    def memberStatusCode: CDef.MemberStatus = { return _memberStatusCode; }

    /**
     * [get] (正式会員日時)FORMALIZED_DATETIME: {IX, TIMESTAMP(23, 10)} <br />
     * @return The value of the column 'FORMALIZED_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    def formalizedDatetime: Option[java.sql.Timestamp] = { return _formalizedDatetime; }

    /**
     * [get] (生年月日)BIRTHDATE: {DATE(8)} <br />
     * @return The value of the column 'BIRTHDATE'. (basically NotNull if selected: for the constraint)
     */
    def birthdate: Option[java.util.Date] = { return _birthdate; }

    /**
     * [get] (登録日時)REGISTER_DATETIME: {NotNull, TIMESTAMP(23, 10)} <br />
     * @return The value of the column 'REGISTER_DATETIME'. (NotNull but EmptyAllowed if null in database)
     */
    def registerDatetime: java.sql.Timestamp = { return _registerDatetime; }

    /**
     * [get] (登録ユーザ)REGISTER_USER: {NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'REGISTER_USER'. (NotNull but EmptyAllowed if null in database)
     */
    def registerUser: String = { return _registerUser; }

    /**
     * [get] (更新日時)UPDATE_DATETIME: {NotNull, TIMESTAMP(23, 10)} <br />
     * @return The value of the column 'UPDATE_DATETIME'. (NotNull but EmptyAllowed if null in database)
     */
    def updateDatetime: java.sql.Timestamp = { return _updateDatetime; }

    /**
     * [get] (更新ユーザ)UPDATE_USER: {NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'UPDATE_USER'. (NotNull but EmptyAllowed if null in database)
     */
    def updateUser: String = { return _updateUser; }

    /**
     * [get] (バージョンNO)VERSION_NO: {NotNull, BIGINT(19)} <br />
     * @return The value of the column 'VERSION_NO'. (NotNull but EmptyAllowed if null in database)
     */
    def versionNo: Long = { return _versionNo; }
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
 * The mutable entity of (会員)MEMBER as TABLE. <br />
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * val memberId: Int = entity.memberId
 * val memberName: String = entity.memberName
 * val memberAccount: String = entity.memberAccount
 * val memberStatusCode: CDef.MemberStatus = entity.memberStatusCode
 * val formalizedDatetime: Option[java.sql.Timestamp] = entity.formalizedDatetime
 * val birthdate: Option[java.util.Date] = entity.birthdate
 * val registerDatetime: java.sql.Timestamp = entity.registerDatetime
 * val registerUser: String = entity.registerUser
 * val updateDatetime: java.sql.Timestamp = entity.updateDatetime
 * val updateUser: String = entity.updateUser
 * val versionNo: Long = entity.versionNo
 * entity.memberId = memberId
 * entity.memberName = memberName
 * entity.memberAccount = memberAccount
 * entity.memberStatusCode = memberStatusCode
 * entity.formalizedDatetime = formalizedDatetime
 * entity.birthdate = birthdate
 * entity.registerDatetime = registerDatetime
 * entity.registerUser = registerUser
 * entity.updateDatetime = updateDatetime
 * entity.updateUser = updateUser
 * entity.versionNo = versionNo
 * = = = = = = = = = =/
 * @author DBFlute(AutoGenerator)
 */
abstract class BsMbleMember {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    val dble: DbleMember = new DbleMember();

    // ===================================================================================
    //                                                                      DB-able Entity
    //                                                                      ==============
    def toDBableEntity(): DbleMember = { dble }

    // ===================================================================================
    //                                                                          Unique Key
    //                                                                          ==========
    /**
     * To be unique by the unique column. <br />
     * You can update the entity by the key when entity update (NOT batch update).
     * @param memberAccount (会員アカウント): UQ, NotNull, VARCHAR(50). (NotNull)
     */
    def uniqueBy(memberAccount: String): Unit = { dble.setMemberAccount(memberAccount); }

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
    def memberStatusCodeAsMemberStatus: CDef.MemberStatus = { dble.getMemberStatusCodeAsMemberStatus }

    /**
     * Set the value of memberStatusCode as the classification of MemberStatus. <br />
     * (会員ステータスコード)MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus} <br />
     * status of member from entry to withdrawal
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    def memberStatusCodeAsMemberStatus_=(cdef: CDef.MemberStatus): Unit = { dble.setMemberStatusCodeAsMemberStatus(cdef) }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of memberStatusCode as Formalized (FML). <br />
     * Formalized: as formal member, allowed to use all service
     */
    def memberStatusCode_Formalized: Unit = { dble.setMemberStatusCode_Formalized }

    /**
     * Set the value of memberStatusCode as Withdrawal (WDL). <br />
     * Withdrawal: withdrawal is fixed, not allowed to use service
     */
    def memberStatusCode_Withdrawal: Unit = { dble.setMemberStatusCode_Withdrawal }

    /**
     * Set the value of memberStatusCode as Provisional (PRV). <br />
     * Provisional: first status after entry, allowed to use only part of service
     */
    def memberStatusCode_Provisional: Unit = { dble.setMemberStatusCode_Provisional }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of memberStatusCode Formalized? <br />
     * Formalized: as formal member, allowed to use all service
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isMemberStatusCode_Formalized: Boolean = { dble.isMemberStatusCode_Formalized }

    /**
     * Is the value of memberStatusCode Withdrawal? <br />
     * Withdrawal: withdrawal is fixed, not allowed to use service
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isMemberStatusCode_Withdrawal: Boolean = { dble.isMemberStatusCode_Withdrawal }

    /**
     * Is the value of memberStatusCode Provisional? <br />
     * Provisional: first status after entry, allowed to use only part of service
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isMemberStatusCode_Provisional: Boolean = { dble.isMemberStatusCode_Provisional }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (会員ID)MEMBER_ID: {PK, ID, NotNull, INTEGER(10)} <br />
     * @return The value of the column 'MEMBER_ID'. (basically NotNull if selected: for the constraint)
     */
    def memberId: Int = { dble.getMemberId }

    /**
     * [set] (会員ID)MEMBER_ID: {PK, ID, NotNull, INTEGER(10)} <br />
     * @param memberId The value of the column 'MEMBER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    def memberId_=(memberId: Int) = { dble.setMemberId(memberId) }

    /**
     * [get] (会員名称)MEMBER_NAME: {IX, NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'MEMBER_NAME'. (basically NotNull if selected: for the constraint)
     */
    def memberName: String = { dble.getMemberName }

    /**
     * [set] (会員名称)MEMBER_NAME: {IX, NotNull, VARCHAR(200)} <br />
     * @param memberName The value of the column 'MEMBER_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    def memberName_=(memberName: String) = { dble.setMemberName(memberName) }

    /**
     * [get] (会員アカウント)MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR(50)} <br />
     * @return The value of the column 'MEMBER_ACCOUNT'. (basically NotNull if selected: for the constraint)
     */
    def memberAccount: String = { dble.getMemberAccount }

    /**
     * [set] (会員アカウント)MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR(50)} <br />
     * @param memberAccount The value of the column 'MEMBER_ACCOUNT'. (NullAllowed: null update allowed for no constraint)
     */
    def memberAccount_=(memberAccount: String) = { dble.setMemberAccount(memberAccount) }

    /**
     * [get] (会員ステータスコード)MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus} <br />
     * @return The value of the column 'MEMBER_STATUS_CODE'. (basically NotNull if selected: for the constraint)
     */
    def memberStatusCode: CDef.MemberStatus = { dble.getMemberStatusCodeAsMemberStatus }

    /**
     * [set] (会員ステータスコード)MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus} <br />
     * @param memberStatusCode The value of the column 'MEMBER_STATUS_CODE'. (NullAllowed: null update allowed for no constraint)
     */
    protected def memberStatusCode_=(memberStatusCode: CDef.MemberStatus) = { dble.setMemberStatusCodeAsMemberStatus(memberStatusCode) }

    /**
     * [get] (正式会員日時)FORMALIZED_DATETIME: {IX, TIMESTAMP(23, 10)} <br />
     * @return The value of the column 'FORMALIZED_DATETIME'. (NotNull but EmptyAllowed if null in database)
     */
    def formalizedDatetime: Option[java.sql.Timestamp] = { Option(dble.getFormalizedDatetime) }

    /**
     * [set] (正式会員日時)FORMALIZED_DATETIME: {IX, TIMESTAMP(23, 10)} <br />
     * @param formalizedDatetime The value of the column 'FORMALIZED_DATETIME'. (basically NotNull if update: for the constraint)
     */
    def formalizedDatetime_=(formalizedDatetime: Option[java.sql.Timestamp]) = { dble.setFormalizedDatetime(formalizedDatetime.orNull) }

    /**
     * [get] (生年月日)BIRTHDATE: {DATE(8)} <br />
     * @return The value of the column 'BIRTHDATE'. (NotNull but EmptyAllowed if null in database)
     */
    def birthdate: Option[java.util.Date] = { Option(dble.getBirthdate) }

    /**
     * [set] (生年月日)BIRTHDATE: {DATE(8)} <br />
     * @param birthdate The value of the column 'BIRTHDATE'. (basically NotNull if update: for the constraint)
     */
    def birthdate_=(birthdate: Option[java.util.Date]) = { dble.setBirthdate(birthdate.orNull) }

    /**
     * [get] (登録日時)REGISTER_DATETIME: {NotNull, TIMESTAMP(23, 10)} <br />
     * @return The value of the column 'REGISTER_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    def registerDatetime: java.sql.Timestamp = { dble.getRegisterDatetime }

    /**
     * [set] (登録日時)REGISTER_DATETIME: {NotNull, TIMESTAMP(23, 10)} <br />
     * @param registerDatetime The value of the column 'REGISTER_DATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    def registerDatetime_=(registerDatetime: java.sql.Timestamp) = { dble.setRegisterDatetime(registerDatetime) }

    /**
     * [get] (登録ユーザ)REGISTER_USER: {NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'REGISTER_USER'. (basically NotNull if selected: for the constraint)
     */
    def registerUser: String = { dble.getRegisterUser }

    /**
     * [set] (登録ユーザ)REGISTER_USER: {NotNull, VARCHAR(200)} <br />
     * @param registerUser The value of the column 'REGISTER_USER'. (NullAllowed: null update allowed for no constraint)
     */
    def registerUser_=(registerUser: String) = { dble.setRegisterUser(registerUser) }

    /**
     * [get] (更新日時)UPDATE_DATETIME: {NotNull, TIMESTAMP(23, 10)} <br />
     * @return The value of the column 'UPDATE_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    def updateDatetime: java.sql.Timestamp = { dble.getUpdateDatetime }

    /**
     * [set] (更新日時)UPDATE_DATETIME: {NotNull, TIMESTAMP(23, 10)} <br />
     * @param updateDatetime The value of the column 'UPDATE_DATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    def updateDatetime_=(updateDatetime: java.sql.Timestamp) = { dble.setUpdateDatetime(updateDatetime) }

    /**
     * [get] (更新ユーザ)UPDATE_USER: {NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'UPDATE_USER'. (basically NotNull if selected: for the constraint)
     */
    def updateUser: String = { dble.getUpdateUser }

    /**
     * [set] (更新ユーザ)UPDATE_USER: {NotNull, VARCHAR(200)} <br />
     * @param updateUser The value of the column 'UPDATE_USER'. (NullAllowed: null update allowed for no constraint)
     */
    def updateUser_=(updateUser: String) = { dble.setUpdateUser(updateUser) }

    /**
     * [get] (バージョンNO)VERSION_NO: {NotNull, BIGINT(19)} <br />
     * @return The value of the column 'VERSION_NO'. (basically NotNull if selected: for the constraint)
     */
    def versionNo: Long = { dble.getVersionNo }

    /**
     * [set] (バージョンNO)VERSION_NO: {NotNull, BIGINT(19)} <br />
     * @param versionNo The value of the column 'VERSION_NO'. (NullAllowed: null update allowed for no constraint)
     */
    def versionNo_=(versionNo: Long) = { dble.setVersionNo(versionNo) }
}
