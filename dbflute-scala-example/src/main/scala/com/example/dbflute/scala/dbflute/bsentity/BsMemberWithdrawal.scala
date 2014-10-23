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
 * The immutable entity of (会員退会情報)MEMBER_WITHDRAWAL as TABLE. <br />
 * <pre>
 * [primary-key]
 *     MEMBER_ID
 * 
 * [column]
 *     MEMBER_ID, WITHDRAWAL_REASON_CODE, WITHDRAWAL_REASON_INPUT_TEXT, WITHDRAWAL_DATETIME, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     
 * 
 * [version-no]
 *     VERSION_NO
 * 
 * [foreign table]
 *     MEMBER, WITHDRAWAL_REASON
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     member, withdrawalReason
 * 
 * [referrer property]
 *     
 * 
 * [get template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * val memberId: Int = entity.memberId
 * val withdrawalReasonCode: Option[CDef.WithdrawalReason] = entity.withdrawalReasonCode
 * val withdrawalReasonInputText: Option[String] = entity.withdrawalReasonInputText
 * val withdrawalDatetime: org.joda.time.LocalDateTime = entity.withdrawalDatetime
 * val registerDatetime: org.joda.time.LocalDateTime = entity.registerDatetime
 * val registerUser: String = entity.registerUser
 * val updateDatetime: org.joda.time.LocalDateTime = entity.updateDatetime
 * val updateUser: String = entity.updateUser
 * val versionNo: Long = entity.versionNo
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
abstract class BsMemberWithdrawal(dble: DbleMemberWithdrawal) extends Serializable {

    // ===================================================================================
    //                                                                           Case Like
    //                                                                           =========
    def copy(
         memberId: Int = memberId
        , withdrawalReasonCode: Option[CDef.WithdrawalReason] = withdrawalReasonCode
        , withdrawalReasonInputText: Option[String] = withdrawalReasonInputText
        , withdrawalDatetime: org.joda.time.LocalDateTime = withdrawalDatetime
        , registerDatetime: org.joda.time.LocalDateTime = registerDatetime
        , registerUser: String = registerUser
        , updateDatetime: org.joda.time.LocalDateTime = updateDatetime
        , updateUser: String = updateUser
        , versionNo: Long = versionNo
    ): MemberWithdrawal = {
        val newDble = new DbleMemberWithdrawal
        newDble.myuniqueDrivenProperties.addAll(dble.myuniqueDrivenProperties) // inherit
        newDble.mymodifiedProperties.addAll(dble.mymodifiedProperties) // inherit
        if (!memberId.equals(this.memberId)) { newDble.setMemberId(memberId) }
        if (!withdrawalReasonCode.equals(this.withdrawalReasonCode)) { newDble.setWithdrawalReasonCodeAsWithdrawalReason(withdrawalReasonCode.orNull) }
        if (!withdrawalReasonInputText.equals(this.withdrawalReasonInputText)) { newDble.setWithdrawalReasonInputText(withdrawalReasonInputText.orNull) }
        if (!withdrawalDatetime.equals(this.withdrawalDatetime)) { newDble.setWithdrawalDatetime(withdrawalDatetime) }
        if (!registerDatetime.equals(this.registerDatetime)) { newDble.setRegisterDatetime(registerDatetime) }
        if (!registerUser.equals(this.registerUser)) { newDble.setRegisterUser(registerUser) }
        if (!updateDatetime.equals(this.updateDatetime)) { newDble.setUpdateDatetime(updateDatetime) }
        if (!updateUser.equals(this.updateUser)) { newDble.setUpdateUser(updateUser) }
        if (!versionNo.equals(this.versionNo)) { newDble.setVersionNo(versionNo) }
        new MemberWithdrawal(newDble)
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
     * Get the value of withdrawalReasonCode as the classification of WithdrawalReason. <br />
     * (退会理由コード)WITHDRAWAL_REASON_CODE: {IX, CHAR(3), FK to WITHDRAWAL_REASON, classification=WithdrawalReason} <br />
     * reason for member withdrawal
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    def withdrawalReasonCodeAsWithdrawalReason: CDef.WithdrawalReason = { dble.getWithdrawalReasonCodeAsWithdrawalReason }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of withdrawalReasonCode Sit? <br />
     * SIT: サイトが使いにくいから
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isWithdrawalReasonCode_Sit: Boolean = { dble.isWithdrawalReasonCode_Sit }

    /**
     * Is the value of withdrawalReasonCode Prd? <br />
     * PRD: 商品に魅力がないから
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isWithdrawalReasonCode_Prd: Boolean = { dble.isWithdrawalReasonCode_Prd }

    /**
     * Is the value of withdrawalReasonCode Frt? <br />
     * FRT: フリテンだから
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isWithdrawalReasonCode_Frt: Boolean = { dble.isWithdrawalReasonCode_Frt }

    /**
     * Is the value of withdrawalReasonCode Oth? <br />
     * OTH: その他理由
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isWithdrawalReasonCode_Oth: Boolean = { dble.isWithdrawalReasonCode_Oth }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /**
     * [get] (会員)MEMBER by my MEMBER_ID, named 'member'.
     * @return The entity of foreign property 'member'. (EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    def member: Option[Member] = { dble.toImmutableMember }

    /**
     * [get] (退会理由)WITHDRAWAL_REASON by my WITHDRAWAL_REASON_CODE, named 'withdrawalReason'.
     * @return The entity of foreign property 'withdrawalReason'. (EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    def withdrawalReason: Option[WithdrawalReason] = { dble.toImmutableWithdrawalReason }

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
            case obj: BsMemberWithdrawal => {
                val other: BsMemberWithdrawal = obj.asInstanceOf[BsMemberWithdrawal];
                {(
                     xSV(memberId, other.memberId)
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
     * [get] MEMBER_ID: {PK, NotNull, INTEGER(10), FK to MEMBER} <br />
     * @return The value of the column 'MEMBER_ID'. (NotNull but EmptyAllowed if null in database)
     */
    def memberId: Int = { dble.getMemberId }

    /**
     * [get] (退会理由コード)WITHDRAWAL_REASON_CODE: {IX, CHAR(3), FK to WITHDRAWAL_REASON, classification=WithdrawalReason} <br />
     * @return The value of the column 'WITHDRAWAL_REASON_CODE'. (basically NotNull if selected: for the constraint)
     */
    def withdrawalReasonCode: Option[CDef.WithdrawalReason] = { Option(dble.getWithdrawalReasonCodeAsWithdrawalReason) }

    /**
     * [get] (退会理由入力テキスト)WITHDRAWAL_REASON_INPUT_TEXT: {CLOB(2147483647)} <br />
     * @return The value of the column 'WITHDRAWAL_REASON_INPUT_TEXT'. (basically NotNull if selected: for the constraint)
     */
    def withdrawalReasonInputText: Option[String] = { Option(dble.getWithdrawalReasonInputText) }

    /**
     * [get] (退会日時)WITHDRAWAL_DATETIME: {NotNull, TIMESTAMP(23, 10)} <br />
     * @return The value of the column 'WITHDRAWAL_DATETIME'. (NotNull but EmptyAllowed if null in database)
     */
    def withdrawalDatetime: org.joda.time.LocalDateTime = { dble.getWithdrawalDatetime }

    /**
     * [get] REGISTER_DATETIME: {NotNull, TIMESTAMP(23, 10)} <br />
     * @return The value of the column 'REGISTER_DATETIME'. (NotNull but EmptyAllowed if null in database)
     */
    def registerDatetime: org.joda.time.LocalDateTime = { dble.getRegisterDatetime }

    /**
     * [get] REGISTER_USER: {NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'REGISTER_USER'. (NotNull but EmptyAllowed if null in database)
     */
    def registerUser: String = { dble.getRegisterUser }

    /**
     * [get] UPDATE_DATETIME: {NotNull, TIMESTAMP(23, 10)} <br />
     * @return The value of the column 'UPDATE_DATETIME'. (NotNull but EmptyAllowed if null in database)
     */
    def updateDatetime: org.joda.time.LocalDateTime = { dble.getUpdateDatetime }

    /**
     * [get] UPDATE_USER: {NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'UPDATE_USER'. (NotNull but EmptyAllowed if null in database)
     */
    def updateUser: String = { dble.getUpdateUser }

    /**
     * [get] VERSION_NO: {NotNull, BIGINT(19)} <br />
     * @return The value of the column 'VERSION_NO'. (NotNull but EmptyAllowed if null in database)
     */
    def versionNo: Long = { dble.getVersionNo }
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
 * The mutable entity of (会員退会情報)MEMBER_WITHDRAWAL as TABLE. <br />
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * val memberId: Int = entity.memberId
 * val withdrawalReasonCode: Option[CDef.WithdrawalReason] = entity.withdrawalReasonCode
 * val withdrawalReasonInputText: Option[String] = entity.withdrawalReasonInputText
 * val withdrawalDatetime: org.joda.time.LocalDateTime = entity.withdrawalDatetime
 * val registerDatetime: org.joda.time.LocalDateTime = entity.registerDatetime
 * val registerUser: String = entity.registerUser
 * val updateDatetime: org.joda.time.LocalDateTime = entity.updateDatetime
 * val updateUser: String = entity.updateUser
 * val versionNo: Long = entity.versionNo
 * entity.memberId = memberId
 * entity.withdrawalReasonCode = withdrawalReasonCode
 * entity.withdrawalReasonInputText = withdrawalReasonInputText
 * entity.withdrawalDatetime = withdrawalDatetime
 * entity.registerDatetime = registerDatetime
 * entity.registerUser = registerUser
 * entity.updateDatetime = updateDatetime
 * entity.updateUser = updateUser
 * entity.versionNo = versionNo
 * = = = = = = = = = =/
 * @author DBFlute(AutoGenerator)
 */
abstract class BsMbleMemberWithdrawal {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected val dble: DbleMemberWithdrawal = new DbleMemberWithdrawal();

    // ===================================================================================
    //                                                                      DB-able Entity
    //                                                                      ==============
    def toDBable(): DbleMemberWithdrawal = { dble }

    // ===================================================================================
    //                                                                    Immutable Entity
    //                                                                    ================
    def toImmutable(): MemberWithdrawal = { dble.toImmutable() }

    // ===================================================================================
    //                                                                          Unique Key
    //                                                                          ==========
    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of withdrawalReasonCode as the classification of WithdrawalReason. <br />
     * (退会理由コード)WITHDRAWAL_REASON_CODE: {IX, CHAR(3), FK to WITHDRAWAL_REASON, classification=WithdrawalReason} <br />
     * reason for member withdrawal
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    def withdrawalReasonCodeAsWithdrawalReason: CDef.WithdrawalReason = { dble.getWithdrawalReasonCodeAsWithdrawalReason }

    /**
     * Set the value of withdrawalReasonCode as the classification of WithdrawalReason. <br />
     * (退会理由コード)WITHDRAWAL_REASON_CODE: {IX, CHAR(3), FK to WITHDRAWAL_REASON, classification=WithdrawalReason} <br />
     * reason for member withdrawal
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    def withdrawalReasonCodeAsWithdrawalReason_=(cdef: CDef.WithdrawalReason): Unit = { dble.setWithdrawalReasonCodeAsWithdrawalReason(cdef) }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of withdrawalReasonCode as Sit (SIT). <br />
     * SIT: サイトが使いにくいから
     */
    def withdrawalReasonCode_Sit: Unit = { dble.setWithdrawalReasonCode_Sit }

    /**
     * Set the value of withdrawalReasonCode as Prd (PRD). <br />
     * PRD: 商品に魅力がないから
     */
    def withdrawalReasonCode_Prd: Unit = { dble.setWithdrawalReasonCode_Prd }

    /**
     * Set the value of withdrawalReasonCode as Frt (FRT). <br />
     * FRT: フリテンだから
     */
    def withdrawalReasonCode_Frt: Unit = { dble.setWithdrawalReasonCode_Frt }

    /**
     * Set the value of withdrawalReasonCode as Oth (OTH). <br />
     * OTH: その他理由
     */
    def withdrawalReasonCode_Oth: Unit = { dble.setWithdrawalReasonCode_Oth }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of withdrawalReasonCode Sit? <br />
     * SIT: サイトが使いにくいから
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isWithdrawalReasonCode_Sit: Boolean = { dble.isWithdrawalReasonCode_Sit }

    /**
     * Is the value of withdrawalReasonCode Prd? <br />
     * PRD: 商品に魅力がないから
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isWithdrawalReasonCode_Prd: Boolean = { dble.isWithdrawalReasonCode_Prd }

    /**
     * Is the value of withdrawalReasonCode Frt? <br />
     * FRT: フリテンだから
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isWithdrawalReasonCode_Frt: Boolean = { dble.isWithdrawalReasonCode_Frt }

    /**
     * Is the value of withdrawalReasonCode Oth? <br />
     * OTH: その他理由
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isWithdrawalReasonCode_Oth: Boolean = { dble.isWithdrawalReasonCode_Oth }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MEMBER_ID: {PK, NotNull, INTEGER(10), FK to MEMBER} <br />
     * @return The value of the column 'MEMBER_ID'. (basically NotNull if selected: for the constraint)
     */
    def memberId: Int = { dble.getMemberId }

    /**
     * [set] MEMBER_ID: {PK, NotNull, INTEGER(10), FK to MEMBER} <br />
     * @param memberId The value of the column 'MEMBER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    def memberId_=(memberId: Int) = { dble.setMemberId(memberId) }

    /**
     * [get] (退会理由コード)WITHDRAWAL_REASON_CODE: {IX, CHAR(3), FK to WITHDRAWAL_REASON, classification=WithdrawalReason} <br />
     * @return The value of the column 'WITHDRAWAL_REASON_CODE'. (NotNull but EmptyAllowed if null in database)
     */
    def withdrawalReasonCode: Option[CDef.WithdrawalReason] = { Option(dble.getWithdrawalReasonCodeAsWithdrawalReason) }

    /**
     * [set] (退会理由コード)WITHDRAWAL_REASON_CODE: {IX, CHAR(3), FK to WITHDRAWAL_REASON, classification=WithdrawalReason} <br />
     * @param withdrawalReasonCode The value of the column 'WITHDRAWAL_REASON_CODE'. (basically NotNull if update: for the constraint)
     */
    protected def withdrawalReasonCode_=(withdrawalReasonCode: Option[CDef.WithdrawalReason]) = { dble.setWithdrawalReasonCodeAsWithdrawalReason(withdrawalReasonCode.orNull) }

    /**
     * [get] (退会理由入力テキスト)WITHDRAWAL_REASON_INPUT_TEXT: {CLOB(2147483647)} <br />
     * @return The value of the column 'WITHDRAWAL_REASON_INPUT_TEXT'. (NotNull but EmptyAllowed if null in database)
     */
    def withdrawalReasonInputText: Option[String] = { Option(dble.getWithdrawalReasonInputText) }

    /**
     * [set] (退会理由入力テキスト)WITHDRAWAL_REASON_INPUT_TEXT: {CLOB(2147483647)} <br />
     * @param withdrawalReasonInputText The value of the column 'WITHDRAWAL_REASON_INPUT_TEXT'. (basically NotNull if update: for the constraint)
     */
    def withdrawalReasonInputText_=(withdrawalReasonInputText: Option[String]) = { dble.setWithdrawalReasonInputText(withdrawalReasonInputText.orNull) }

    /**
     * [get] (退会日時)WITHDRAWAL_DATETIME: {NotNull, TIMESTAMP(23, 10)} <br />
     * @return The value of the column 'WITHDRAWAL_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    def withdrawalDatetime: org.joda.time.LocalDateTime = { dble.getWithdrawalDatetime }

    /**
     * [set] (退会日時)WITHDRAWAL_DATETIME: {NotNull, TIMESTAMP(23, 10)} <br />
     * @param withdrawalDatetime The value of the column 'WITHDRAWAL_DATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    def withdrawalDatetime_=(withdrawalDatetime: org.joda.time.LocalDateTime) = { dble.setWithdrawalDatetime(withdrawalDatetime) }

    /**
     * [get] REGISTER_DATETIME: {NotNull, TIMESTAMP(23, 10)} <br />
     * @return The value of the column 'REGISTER_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    def registerDatetime: org.joda.time.LocalDateTime = { dble.getRegisterDatetime }

    /**
     * [set] REGISTER_DATETIME: {NotNull, TIMESTAMP(23, 10)} <br />
     * @param registerDatetime The value of the column 'REGISTER_DATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    def registerDatetime_=(registerDatetime: org.joda.time.LocalDateTime) = { dble.setRegisterDatetime(registerDatetime) }

    /**
     * [get] REGISTER_USER: {NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'REGISTER_USER'. (basically NotNull if selected: for the constraint)
     */
    def registerUser: String = { dble.getRegisterUser }

    /**
     * [set] REGISTER_USER: {NotNull, VARCHAR(200)} <br />
     * @param registerUser The value of the column 'REGISTER_USER'. (NullAllowed: null update allowed for no constraint)
     */
    def registerUser_=(registerUser: String) = { dble.setRegisterUser(registerUser) }

    /**
     * [get] UPDATE_DATETIME: {NotNull, TIMESTAMP(23, 10)} <br />
     * @return The value of the column 'UPDATE_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    def updateDatetime: org.joda.time.LocalDateTime = { dble.getUpdateDatetime }

    /**
     * [set] UPDATE_DATETIME: {NotNull, TIMESTAMP(23, 10)} <br />
     * @param updateDatetime The value of the column 'UPDATE_DATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    def updateDatetime_=(updateDatetime: org.joda.time.LocalDateTime) = { dble.setUpdateDatetime(updateDatetime) }

    /**
     * [get] UPDATE_USER: {NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'UPDATE_USER'. (basically NotNull if selected: for the constraint)
     */
    def updateUser: String = { dble.getUpdateUser }

    /**
     * [set] UPDATE_USER: {NotNull, VARCHAR(200)} <br />
     * @param updateUser The value of the column 'UPDATE_USER'. (NullAllowed: null update allowed for no constraint)
     */
    def updateUser_=(updateUser: String) = { dble.setUpdateUser(updateUser) }

    /**
     * [get] VERSION_NO: {NotNull, BIGINT(19)} <br />
     * @return The value of the column 'VERSION_NO'. (basically NotNull if selected: for the constraint)
     */
    def versionNo: Long = { dble.getVersionNo }

    /**
     * [set] VERSION_NO: {NotNull, BIGINT(19)} <br />
     * @param versionNo The value of the column 'VERSION_NO'. (NullAllowed: null update allowed for no constraint)
     */
    def versionNo_=(versionNo: Long) = { dble.setVersionNo(versionNo) }
}
