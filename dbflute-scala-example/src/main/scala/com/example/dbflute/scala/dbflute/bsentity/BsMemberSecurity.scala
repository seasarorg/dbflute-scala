package com.example.dbflute.scala.dbflute.bsentity;

import scala.collection.immutable._;
import scala.collection.JavaConverters._;

import java.io.Serializable;
import java.util.Collection;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.FunCustodial;
import com.example.dbflute.scala.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.scala.dbflute.exentity._;

/**
 * The immutable entity of (会員セキュリティ情報)MEMBER_SECURITY as TABLE. <br />
 * <pre>
 * [primary-key]
 *     MEMBER_ID
 * 
 * [column]
 *     MEMBER_ID, LOGIN_PASSWORD, REMINDER_QUESTION, REMINDER_ANSWER, REMINDER_USE_COUNT, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
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
 *     MEMBER
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     member
 * 
 * [referrer property]
 *     
 * 
 * [get template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * val memberId: Int = entity.memberId
 * val loginPassword: String = entity.loginPassword
 * val reminderQuestion: String = entity.reminderQuestion
 * val reminderAnswer: String = entity.reminderAnswer
 * val reminderUseCount: Int = entity.reminderUseCount
 * val registerDatetime: org.joda.time.LocalDateTime = entity.registerDatetime
 * val registerUser: String = entity.registerUser
 * val updateDatetime: org.joda.time.LocalDateTime = entity.updateDatetime
 * val updateUser: String = entity.updateUser
 * val versionNo: Long = entity.versionNo
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
abstract class BsMemberSecurity(dble: DbleMemberSecurity) extends Serializable {

    // ===================================================================================
    //                                                                           Case Like
    //                                                                           =========
    def copy(
         memberId: Int = memberId
        , loginPassword: String = loginPassword
        , reminderQuestion: String = reminderQuestion
        , reminderAnswer: String = reminderAnswer
        , reminderUseCount: Int = reminderUseCount
        , registerDatetime: org.joda.time.LocalDateTime = registerDatetime
        , registerUser: String = registerUser
        , updateDatetime: org.joda.time.LocalDateTime = updateDatetime
        , updateUser: String = updateUser
        , versionNo: Long = versionNo
    ): MemberSecurity = {
        val newDble = new DbleMemberSecurity
        newDble.myuniqueDrivenProperties.addAll(dble.myuniqueDrivenProperties) // inherit
        newDble.mymodifiedProperties.addAll(dble.mymodifiedProperties) // inherit
        if (!memberId.equals(this.memberId)) { newDble.setMemberId(memberId) }
        if (!loginPassword.equals(this.loginPassword)) { newDble.setLoginPassword(loginPassword) }
        if (!reminderQuestion.equals(this.reminderQuestion)) { newDble.setReminderQuestion(reminderQuestion) }
        if (!reminderAnswer.equals(this.reminderAnswer)) { newDble.setReminderAnswer(reminderAnswer) }
        if (!reminderUseCount.equals(this.reminderUseCount)) { newDble.setReminderUseCount(reminderUseCount) }
        if (!registerDatetime.equals(this.registerDatetime)) { newDble.setRegisterDatetime(registerDatetime) }
        if (!registerUser.equals(this.registerUser)) { newDble.setRegisterUser(registerUser) }
        if (!updateDatetime.equals(this.updateDatetime)) { newDble.setUpdateDatetime(updateDatetime) }
        if (!updateUser.equals(this.updateUser)) { newDble.setUpdateUser(updateUser) }
        if (!versionNo.equals(this.versionNo)) { newDble.setVersionNo(versionNo) }
        new MemberSecurity(newDble)
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
    //                                                        Classification Determination
    //                                                        ============================
    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
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
            case obj: BsMemberSecurity => {
                val other: BsMemberSecurity = obj.asInstanceOf[BsMemberSecurity];
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
     * [get] (会員ID)MEMBER_ID: {PK, NotNull, INTEGER(10), FK to MEMBER} <br />
     * @return The value of the column 'MEMBER_ID'. (NotNull but EmptyAllowed if null in database)
     */
    def memberId: Int = { dble.getMemberId }

    /**
     * [get] (ログインパスワード)LOGIN_PASSWORD: {NotNull, VARCHAR(50)} <br />
     * @return The value of the column 'LOGIN_PASSWORD'. (NotNull but EmptyAllowed if null in database)
     */
    def loginPassword: String = { dble.getLoginPassword }

    /**
     * [get] (リマインダ質問)REMINDER_QUESTION: {NotNull, VARCHAR(50)} <br />
     * @return The value of the column 'REMINDER_QUESTION'. (NotNull but EmptyAllowed if null in database)
     */
    def reminderQuestion: String = { dble.getReminderQuestion }

    /**
     * [get] (リマインダ回答)REMINDER_ANSWER: {NotNull, VARCHAR(50)} <br />
     * @return The value of the column 'REMINDER_ANSWER'. (NotNull but EmptyAllowed if null in database)
     */
    def reminderAnswer: String = { dble.getReminderAnswer }

    /**
     * [get] (リマインダ利用回数)REMINDER_USE_COUNT: {NotNull, INTEGER(10)} <br />
     * @return The value of the column 'REMINDER_USE_COUNT'. (NotNull but EmptyAllowed if null in database)
     */
    def reminderUseCount: Int = { dble.getReminderUseCount }

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
 * The mutable entity of (会員セキュリティ情報)MEMBER_SECURITY as TABLE. <br />
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * val memberId: Int = entity.memberId
 * val loginPassword: String = entity.loginPassword
 * val reminderQuestion: String = entity.reminderQuestion
 * val reminderAnswer: String = entity.reminderAnswer
 * val reminderUseCount: Int = entity.reminderUseCount
 * val registerDatetime: org.joda.time.LocalDateTime = entity.registerDatetime
 * val registerUser: String = entity.registerUser
 * val updateDatetime: org.joda.time.LocalDateTime = entity.updateDatetime
 * val updateUser: String = entity.updateUser
 * val versionNo: Long = entity.versionNo
 * entity.memberId = memberId
 * entity.loginPassword = loginPassword
 * entity.reminderQuestion = reminderQuestion
 * entity.reminderAnswer = reminderAnswer
 * entity.reminderUseCount = reminderUseCount
 * entity.registerDatetime = registerDatetime
 * entity.registerUser = registerUser
 * entity.updateDatetime = updateDatetime
 * entity.updateUser = updateUser
 * entity.versionNo = versionNo
 * = = = = = = = = = =/
 * @author DBFlute(AutoGenerator)
 */
abstract class BsMbleMemberSecurity {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected val dble: DbleMemberSecurity = new DbleMemberSecurity();

    // ===================================================================================
    //                                                                      DB-able Entity
    //                                                                      ==============
    def toDBable(): DbleMemberSecurity = { dble }

    // ===================================================================================
    //                                                                    Immutable Entity
    //                                                                    ================
    def toImmutable(): MemberSecurity = { dble.toImmutable() }

    // ===================================================================================
    //                                                                          Unique Key
    //                                                                          ==========
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (会員ID)MEMBER_ID: {PK, NotNull, INTEGER(10), FK to MEMBER} <br />
     * @return The value of the column 'MEMBER_ID'. (basically NotNull if selected: for the constraint)
     */
    def memberId: Int = { dble.getMemberId }

    /**
     * [set] (会員ID)MEMBER_ID: {PK, NotNull, INTEGER(10), FK to MEMBER} <br />
     * @param memberId The value of the column 'MEMBER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    def memberId_=(memberId: Int) = { dble.setMemberId(memberId) }

    /**
     * [get] (ログインパスワード)LOGIN_PASSWORD: {NotNull, VARCHAR(50)} <br />
     * @return The value of the column 'LOGIN_PASSWORD'. (basically NotNull if selected: for the constraint)
     */
    def loginPassword: String = { dble.getLoginPassword }

    /**
     * [set] (ログインパスワード)LOGIN_PASSWORD: {NotNull, VARCHAR(50)} <br />
     * @param loginPassword The value of the column 'LOGIN_PASSWORD'. (NullAllowed: null update allowed for no constraint)
     */
    def loginPassword_=(loginPassword: String) = { dble.setLoginPassword(loginPassword) }

    /**
     * [get] (リマインダ質問)REMINDER_QUESTION: {NotNull, VARCHAR(50)} <br />
     * @return The value of the column 'REMINDER_QUESTION'. (basically NotNull if selected: for the constraint)
     */
    def reminderQuestion: String = { dble.getReminderQuestion }

    /**
     * [set] (リマインダ質問)REMINDER_QUESTION: {NotNull, VARCHAR(50)} <br />
     * @param reminderQuestion The value of the column 'REMINDER_QUESTION'. (NullAllowed: null update allowed for no constraint)
     */
    def reminderQuestion_=(reminderQuestion: String) = { dble.setReminderQuestion(reminderQuestion) }

    /**
     * [get] (リマインダ回答)REMINDER_ANSWER: {NotNull, VARCHAR(50)} <br />
     * @return The value of the column 'REMINDER_ANSWER'. (basically NotNull if selected: for the constraint)
     */
    def reminderAnswer: String = { dble.getReminderAnswer }

    /**
     * [set] (リマインダ回答)REMINDER_ANSWER: {NotNull, VARCHAR(50)} <br />
     * @param reminderAnswer The value of the column 'REMINDER_ANSWER'. (NullAllowed: null update allowed for no constraint)
     */
    def reminderAnswer_=(reminderAnswer: String) = { dble.setReminderAnswer(reminderAnswer) }

    /**
     * [get] (リマインダ利用回数)REMINDER_USE_COUNT: {NotNull, INTEGER(10)} <br />
     * @return The value of the column 'REMINDER_USE_COUNT'. (basically NotNull if selected: for the constraint)
     */
    def reminderUseCount: Int = { dble.getReminderUseCount }

    /**
     * [set] (リマインダ利用回数)REMINDER_USE_COUNT: {NotNull, INTEGER(10)} <br />
     * @param reminderUseCount The value of the column 'REMINDER_USE_COUNT'. (NullAllowed: null update allowed for no constraint)
     */
    def reminderUseCount_=(reminderUseCount: Int) = { dble.setReminderUseCount(reminderUseCount) }

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
