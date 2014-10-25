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
import com.example.dbflute.scala.dbflute.exentity._;

/**
 * The entity of (会員セキュリティ情報)MEMBER_SECURITY as TABLE. <br />
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
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer memberId = entity.getMemberId();
 * String loginPassword = entity.getLoginPassword();
 * String reminderQuestion = entity.getReminderQuestion();
 * String reminderAnswer = entity.getReminderAnswer();
 * Integer reminderUseCount = entity.getReminderUseCount();
 * org.joda.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerUser = entity.getRegisterUser();
 * org.joda.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateUser = entity.getUpdateUser();
 * Long versionNo = entity.getVersionNo();
 * entity.setMemberId(memberId);
 * entity.setLoginPassword(loginPassword);
 * entity.setReminderQuestion(reminderQuestion);
 * entity.setReminderAnswer(reminderAnswer);
 * entity.setReminderUseCount(reminderUseCount);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterUser(registerUser);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateUser(updateUser);
 * entity.setVersionNo(versionNo);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
abstract class BsDbleMemberSecurity extends AbstractEntity with EntityDefinedCommonColumn with DBableEntity[MemberSecurity] with Serializable with Cloneable {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** (会員ID)MEMBER_ID: {PK, NotNull, INTEGER(10), FK to MEMBER} */
    protected var _memberId: Integer = null;

    /** (ログインパスワード)LOGIN_PASSWORD: {NotNull, VARCHAR(50)} */
    protected var _loginPassword: String = null;

    /** (リマインダ質問)REMINDER_QUESTION: {NotNull, VARCHAR(50)} */
    protected var _reminderQuestion: String = null;

    /** (リマインダ回答)REMINDER_ANSWER: {NotNull, VARCHAR(50)} */
    protected var _reminderAnswer: String = null;

    /** (リマインダ利用回数)REMINDER_USE_COUNT: {NotNull, INTEGER(10)} */
    protected var _reminderUseCount: Integer = null;

    /** REGISTER_DATETIME: {NotNull, TIMESTAMP(23, 10)} */
    protected var _registerDatetime: org.joda.time.LocalDateTime = null;

    /** REGISTER_USER: {NotNull, VARCHAR(200)} */
    protected var _registerUser: String = null;

    /** UPDATE_DATETIME: {NotNull, TIMESTAMP(23, 10)} */
    protected var _updateDatetime: org.joda.time.LocalDateTime = null;

    /** UPDATE_USER: {NotNull, VARCHAR(200)} */
    protected var _updateUser: String = null;

    /** VERSION_NO: {NotNull, BIGINT(19)} */
    protected var _versionNo: Long = null;

    // ===================================================================================
    //                                                                           Immutable
    //                                                                           =========
    /**
     * {@inheritDoc}
     */
    def acceptImmutable(immu: MemberSecurity): DbleMemberSecurity = {
        setMemberId(immu.memberId);
        setLoginPassword(immu.loginPassword);
        setReminderQuestion(immu.reminderQuestion);
        setReminderAnswer(immu.reminderAnswer);
        setReminderUseCount(immu.reminderUseCount);
        setRegisterDatetime(immu.registerDatetime);
        setRegisterUser(immu.registerUser);
        setUpdateDatetime(immu.updateDatetime);
        setUpdateUser(immu.updateUser);
        setVersionNo(immu.versionNo);
        setMember(immu.member.map(new DbleMember().acceptImmutable(_)))
        __uniqueDrivenProperties.clear();
        immu.getMyUniqueDrivenProperties().foreach(__uniqueDrivenProperties.addPropertyName(_))
        __modifiedProperties.clear();
        immu.getMyModifiedProperties().foreach(__modifiedProperties.addPropertyName(_))
        return this.asInstanceOf[DbleMemberSecurity];
    }

    /**
     * {@inheritDoc}
     */
    def toImmutable(): MemberSecurity = {
        return new MemberSecurity(this.asInstanceOf[DbleMemberSecurity]);
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    def getTableDbName(): String = {
        return "MEMBER_SECURITY";
    }

    /**
     * {@inheritDoc}
     */
    def getTablePropertyName(): String = {
        return "memberSecurity";
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

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** (会員)MEMBER by my MEMBER_ID, named 'member'. */
    protected var _member: Option[DbleMember] = null;

    /**
     * [get] (会員)MEMBER by my MEMBER_ID, named 'member'.
     * @return The entity of foreign property 'member'. (EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    def getMember(): Option[DbleMember] = {
        return if (_member != null) { _member; } else { Option.empty; }
    }

    /**
     * [set] (会員)MEMBER by my MEMBER_ID, named 'member'.
     * @param member The entity of foreign property 'member'. (EmptyAllowed)
     */
    def setMember(member: Option[DbleMember]): Unit = {
        _member = member;
    }

    /**
     * [convert] (会員)MEMBER by my MEMBER_ID, named 'member'.
     * @return The new-created immutable entity of foreign property 'member'. (NotNull)
     */
    def toImmutableMember(): Option[Member] = {
        return getMember().map(_.toImmutable());
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
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
            case obj: BsDbleMemberSecurity => {
                val other: BsDbleMemberSecurity = obj.asInstanceOf[BsDbleMemberSecurity];
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
        if (_member != null && _member.isEmpty)
        { sb.append(li).append(xbRDS(_member, "member")); }
        return sb.toString();
    }
    protected def xbRDS[ET <: Entity](et: Option[ET], name: String): String = {
        return et.get.buildDisplayString(name, true, true);
    }

    override protected def doBuildColumnString(dm: String): String = {
        val sb: StringBuilder = new StringBuilder();
        sb.append(dm).append(getMemberId());
        sb.append(dm).append(getLoginPassword());
        sb.append(dm).append(getReminderQuestion());
        sb.append(dm).append(getReminderAnswer());
        sb.append(dm).append(getReminderUseCount());
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
        if (_member != null && _member.isEmpty)
        { sb.append(dm).append("member"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    override def clone(): DbleMemberSecurity = {
        return super.clone().asInstanceOf[DbleMemberSecurity];
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (会員ID)MEMBER_ID: {PK, NotNull, INTEGER(10), FK to MEMBER} <br />
     * @return The value of the column 'MEMBER_ID'. (basically NotNull if selected: for the constraint)
     */
    def getMemberId(): Integer = {
        return _memberId;
    }

    /**
     * [set] (会員ID)MEMBER_ID: {PK, NotNull, INTEGER(10), FK to MEMBER} <br />
     * @param memberId The value of the column 'MEMBER_ID'. (basically NotNull if update: for the constraint)
     */
    def setMemberId(memberId: Integer): Unit = {
        __modifiedProperties.addPropertyName("memberId");
        _memberId = memberId;
    }

    /**
     * [get] (ログインパスワード)LOGIN_PASSWORD: {NotNull, VARCHAR(50)} <br />
     * @return The value of the column 'LOGIN_PASSWORD'. (basically NotNull if selected: for the constraint)
     */
    def getLoginPassword(): String = {
        return convertEmptyToNull(_loginPassword);
    }

    /**
     * [set] (ログインパスワード)LOGIN_PASSWORD: {NotNull, VARCHAR(50)} <br />
     * @param loginPassword The value of the column 'LOGIN_PASSWORD'. (basically NotNull if update: for the constraint)
     */
    def setLoginPassword(loginPassword: String): Unit = {
        __modifiedProperties.addPropertyName("loginPassword");
        _loginPassword = loginPassword;
    }

    /**
     * [get] (リマインダ質問)REMINDER_QUESTION: {NotNull, VARCHAR(50)} <br />
     * @return The value of the column 'REMINDER_QUESTION'. (basically NotNull if selected: for the constraint)
     */
    def getReminderQuestion(): String = {
        return convertEmptyToNull(_reminderQuestion);
    }

    /**
     * [set] (リマインダ質問)REMINDER_QUESTION: {NotNull, VARCHAR(50)} <br />
     * @param reminderQuestion The value of the column 'REMINDER_QUESTION'. (basically NotNull if update: for the constraint)
     */
    def setReminderQuestion(reminderQuestion: String): Unit = {
        __modifiedProperties.addPropertyName("reminderQuestion");
        _reminderQuestion = reminderQuestion;
    }

    /**
     * [get] (リマインダ回答)REMINDER_ANSWER: {NotNull, VARCHAR(50)} <br />
     * @return The value of the column 'REMINDER_ANSWER'. (basically NotNull if selected: for the constraint)
     */
    def getReminderAnswer(): String = {
        return convertEmptyToNull(_reminderAnswer);
    }

    /**
     * [set] (リマインダ回答)REMINDER_ANSWER: {NotNull, VARCHAR(50)} <br />
     * @param reminderAnswer The value of the column 'REMINDER_ANSWER'. (basically NotNull if update: for the constraint)
     */
    def setReminderAnswer(reminderAnswer: String): Unit = {
        __modifiedProperties.addPropertyName("reminderAnswer");
        _reminderAnswer = reminderAnswer;
    }

    /**
     * [get] (リマインダ利用回数)REMINDER_USE_COUNT: {NotNull, INTEGER(10)} <br />
     * @return The value of the column 'REMINDER_USE_COUNT'. (basically NotNull if selected: for the constraint)
     */
    def getReminderUseCount(): Integer = {
        return _reminderUseCount;
    }

    /**
     * [set] (リマインダ利用回数)REMINDER_USE_COUNT: {NotNull, INTEGER(10)} <br />
     * @param reminderUseCount The value of the column 'REMINDER_USE_COUNT'. (basically NotNull if update: for the constraint)
     */
    def setReminderUseCount(reminderUseCount: Integer): Unit = {
        __modifiedProperties.addPropertyName("reminderUseCount");
        _reminderUseCount = reminderUseCount;
    }

    /**
     * [get] REGISTER_DATETIME: {NotNull, TIMESTAMP(23, 10)} <br />
     * @return The value of the column 'REGISTER_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    def getRegisterDatetime(): org.joda.time.LocalDateTime = {
        return _registerDatetime;
    }

    /**
     * [set] REGISTER_DATETIME: {NotNull, TIMESTAMP(23, 10)} <br />
     * @param registerDatetime The value of the column 'REGISTER_DATETIME'. (basically NotNull if update: for the constraint)
     */
    def setRegisterDatetime(registerDatetime: org.joda.time.LocalDateTime): Unit = {
        __modifiedProperties.addPropertyName("registerDatetime");
        _registerDatetime = registerDatetime;
    }

    /**
     * [get] REGISTER_USER: {NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'REGISTER_USER'. (basically NotNull if selected: for the constraint)
     */
    def getRegisterUser(): String = {
        return convertEmptyToNull(_registerUser);
    }

    /**
     * [set] REGISTER_USER: {NotNull, VARCHAR(200)} <br />
     * @param registerUser The value of the column 'REGISTER_USER'. (basically NotNull if update: for the constraint)
     */
    def setRegisterUser(registerUser: String): Unit = {
        __modifiedProperties.addPropertyName("registerUser");
        _registerUser = registerUser;
    }

    /**
     * [get] UPDATE_DATETIME: {NotNull, TIMESTAMP(23, 10)} <br />
     * @return The value of the column 'UPDATE_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    def getUpdateDatetime(): org.joda.time.LocalDateTime = {
        return _updateDatetime;
    }

    /**
     * [set] UPDATE_DATETIME: {NotNull, TIMESTAMP(23, 10)} <br />
     * @param updateDatetime The value of the column 'UPDATE_DATETIME'. (basically NotNull if update: for the constraint)
     */
    def setUpdateDatetime(updateDatetime: org.joda.time.LocalDateTime): Unit = {
        __modifiedProperties.addPropertyName("updateDatetime");
        _updateDatetime = updateDatetime;
    }

    /**
     * [get] UPDATE_USER: {NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'UPDATE_USER'. (basically NotNull if selected: for the constraint)
     */
    def getUpdateUser(): String = {
        return convertEmptyToNull(_updateUser);
    }

    /**
     * [set] UPDATE_USER: {NotNull, VARCHAR(200)} <br />
     * @param updateUser The value of the column 'UPDATE_USER'. (basically NotNull if update: for the constraint)
     */
    def setUpdateUser(updateUser: String): Unit = {
        __modifiedProperties.addPropertyName("updateUser");
        _updateUser = updateUser;
    }

    /**
     * [get] VERSION_NO: {NotNull, BIGINT(19)} <br />
     * @return The value of the column 'VERSION_NO'. (basically NotNull if selected: for the constraint)
     */
    def getVersionNo(): Long = {
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {NotNull, BIGINT(19)} <br />
     * @param versionNo The value of the column 'VERSION_NO'. (basically NotNull if update: for the constraint)
     */
    def setVersionNo(versionNo: Long): Unit = {
        __modifiedProperties.addPropertyName("versionNo");
        _versionNo = versionNo;
    }
}
