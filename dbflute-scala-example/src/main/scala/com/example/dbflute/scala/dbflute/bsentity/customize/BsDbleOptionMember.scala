package com.example.dbflute.scala.dbflute.bsentity.customize;

import scala.collection.immutable;
import scala.collection.JavaConverters._;

// #avoided same name type in Java and Scala
import java.lang.Long;
import java.lang.Boolean;

import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.AbstractEntity;
import org.seasar.dbflute.FunCustodial;
import org.seasar.dbflute.helper.beans.DfCoupleProperties;
import org.seasar.dbflute.immutable.DBableEntity;
import com.example.dbflute.scala.dbflute.allcommon.CDef;
import com.example.dbflute.scala.dbflute.exentity.customize._;

/**
 * The entity of OptionMember. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     MEMBER_ID, MEMBER_NAME, BIRTHDATE, FORMALIZED_DATETIME, MEMBER_STATUS_CODE, STATUS_DISPLAY_ORDER, MEMBER_STATUS_NAME, DUMMY_FLG, DUMMY_NOFLG
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     
 * 
 * [version-no]
 *     
 * 
 * [foreign table]
 *     
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer memberId = entity.getMemberId();
 * String memberName = entity.getMemberName();
 * org.joda.time.LocalDate birthdate = entity.getBirthdate();
 * org.joda.time.LocalDateTime formalizedDatetime = entity.getFormalizedDatetime();
 * String memberStatusCode = entity.getMemberStatusCode();
 * Integer statusDisplayOrder = entity.getStatusDisplayOrder();
 * String memberStatusName = entity.getMemberStatusName();
 * Integer dummyFlg = entity.getDummyFlg();
 * Integer dummyNoflg = entity.getDummyNoflg();
 * entity.setMemberId(memberId);
 * entity.setMemberName(memberName);
 * entity.setBirthdate(birthdate);
 * entity.setFormalizedDatetime(formalizedDatetime);
 * entity.setMemberStatusCode(memberStatusCode);
 * entity.setStatusDisplayOrder(statusDisplayOrder);
 * entity.setMemberStatusName(memberStatusName);
 * entity.setDummyFlg(dummyFlg);
 * entity.setDummyNoflg(dummyNoflg);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
abstract class BsDbleOptionMember extends AbstractEntity with DBableEntity[OptionMember] with Serializable with Cloneable {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** (会員ID)MEMBER_ID: {INTEGER(10), refers to MEMBER.MEMBER_ID} */
    protected var _memberId: Integer = null;

    /** (会員名称)MEMBER_NAME: {VARCHAR(200), refers to MEMBER.MEMBER_NAME} */
    protected var _memberName: String = null;

    /** (生年月日)BIRTHDATE: {DATE(8), refers to MEMBER.BIRTHDATE} */
    protected var _birthdate: org.joda.time.LocalDate = null;

    /** (正式会員日時)FORMALIZED_DATETIME: {TIMESTAMP(23, 10), refers to MEMBER.FORMALIZED_DATETIME} */
    protected var _formalizedDatetime: org.joda.time.LocalDateTime = null;

    /** (会員ステータスコード)MEMBER_STATUS_CODE: {CHAR(3), refers to MEMBER.MEMBER_STATUS_CODE, classification=MemberStatus} */
    protected var _memberStatusCode: String = null;

    /** (表示順)STATUS_DISPLAY_ORDER: {INTEGER(10), refers to MEMBER_STATUS.DISPLAY_ORDER} */
    protected var _statusDisplayOrder: Integer = null;

    /** (会員ステータス名称)MEMBER_STATUS_NAME: {VARCHAR(50), refers to MEMBER_STATUS.MEMBER_STATUS_NAME} */
    protected var _memberStatusName: String = null;

    /** DUMMY_FLG: {INTEGER(10), classification=Flg} */
    protected var _dummyFlg: Integer = null;

    /** DUMMY_NOFLG: {INTEGER(10)} */
    protected var _dummyNoflg: Integer = null;

    // ===================================================================================
    //                                                                           Immutable
    //                                                                           =========
    /**
     * {@inheritDoc}
     */
    def acceptImmutable(immu: OptionMember): DbleOptionMember = {
        setMemberId(immu.memberId.map(int2Integer(_)).orNull);
        setMemberName(immu.memberName.orNull);
        setBirthdate(immu.birthdate.orNull);
        setFormalizedDatetime(immu.formalizedDatetime.orNull);
        setMemberStatusCodeAsMemberStatus(immu.memberStatusCode.orNull);
        setStatusDisplayOrder(immu.statusDisplayOrder.map(int2Integer(_)).orNull);
        setMemberStatusName(immu.memberStatusName.orNull);
        setDummyFlgAsFlg(immu.dummyFlg.orNull);
        setDummyNoflg(immu.dummyNoflg.map(int2Integer(_)).orNull);
        __uniqueDrivenProperties.clear();
        immu.getMyUniqueDrivenProperties().foreach(__uniqueDrivenProperties.addPropertyName(_))
        __modifiedProperties.clear();
        immu.getMyModifiedProperties().foreach(__modifiedProperties.addPropertyName(_))
        return this.asInstanceOf[DbleOptionMember];
    }

    /**
     * {@inheritDoc}
     */
    def toImmutable(): OptionMember = {
        return new OptionMember(this.asInstanceOf[DbleOptionMember]);
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    def getTableDbName(): String = {
        return "OptionMember";
    }

    /**
     * {@inheritDoc}
     */
    def getTablePropertyName(): String = {
        return "optionMember";
    }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /**
     * {@inheritDoc}
     */
    def getDBMeta(): DBMeta = {
        return com.example.dbflute.scala.dbflute.bsentity.customize.dbmeta.OptionMemberDbm;
    }

    // ===================================================================================
    //                                                                         Primary Key
    //                                                                         ===========
    /**
     * {@inheritDoc}
     */
    def hasPrimaryKeyValue(): scala.Boolean = {
        return false;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of memberStatusCode as the classification of MemberStatus. <br />
     * (会員ステータスコード)MEMBER_STATUS_CODE: {CHAR(3), refers to MEMBER.MEMBER_STATUS_CODE, classification=MemberStatus} <br />
     * status of member from entry to withdrawal
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    def getMemberStatusCodeAsMemberStatus(): CDef.MemberStatus = {
        return CDef.MemberStatus.codeOf(getMemberStatusCode());
    }

    /**
     * Set the value of memberStatusCode as the classification of MemberStatus. <br />
     * (会員ステータスコード)MEMBER_STATUS_CODE: {CHAR(3), refers to MEMBER.MEMBER_STATUS_CODE, classification=MemberStatus} <br />
     * status of member from entry to withdrawal
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    def setMemberStatusCodeAsMemberStatus(cdef: CDef.MemberStatus): Unit = {
        setMemberStatusCode(if (cdef != null) { cdef.code } else { null });
    }

    /**
     * Get the value of dummyFlg as the classification of Flg. <br />
     * DUMMY_FLG: {INTEGER(10), classification=Flg} <br />
     * general boolean classification for every flg-column
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    def getDummyFlgAsFlg(): CDef.Flg = {
        return CDef.Flg.codeOf(getDummyFlg());
    }

    /**
     * Set the value of dummyFlg as the classification of Flg. <br />
     * DUMMY_FLG: {INTEGER(10), classification=Flg} <br />
     * general boolean classification for every flg-column
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    def setDummyFlgAsFlg(cdef: CDef.Flg): Unit = {
        setDummyFlg(if (cdef != null) { toNumber(cdef.code, classOf[Integer]) } else { null });
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

    /**
     * Set the value of dummyFlg as True (1). <br />
     * Yes: means valid
     */
    def setDummyFlg_True(): Unit = {
        setDummyFlgAsFlg(CDef.Flg.True);
    }

    /**
     * Set the value of dummyFlg as False (0). <br />
     * No: means invalid
     */
    def setDummyFlg_False(): Unit = {
        setDummyFlgAsFlg(CDef.Flg.False);
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

    /**
     * Is the value of dummyFlg True? <br />
     * Yes: means valid
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isDummyFlg_True(): Boolean = {
        val cdef: CDef.Flg = getDummyFlgAsFlg();
        return if (cdef != null) { cdef.equals(CDef.Flg.True) } else { false };
    }

    /**
     * Is the value of dummyFlg False? <br />
     * No: means invalid
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isDummyFlg_False(): Boolean = {
        val cdef: CDef.Flg = getDummyFlgAsFlg();
        return if (cdef != null) { cdef.equals(CDef.Flg.False) } else { false };
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    /**
     * Get the value of the column 'dummyFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    def getDummyFlgName(): String = {
        val cdef: CDef.Flg = getDummyFlgAsFlg();
        return if (cdef != null) { cdef.name } else { null };
    }

    /**
     * Get the value of the column 'dummyFlg' as classification alias.
     * @return The string of classification alias. (NullAllowed: when the column value is null)
     */
    def getDummyFlgAlias(): String = {
        val cdef: CDef.Flg = getDummyFlgAsFlg();
        return if (cdef != null) { cdef.alias } else { null };
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
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
            case obj: BsDbleOptionMember => {
                val other: BsDbleOptionMember = obj.asInstanceOf[BsDbleOptionMember];
                {(
                     xSV(getMemberId(), other.getMemberId())
                    && xSV(getMemberName(), other.getMemberName())
                    && xSV(getBirthdate(), other.getBirthdate())
                    && xSV(getFormalizedDatetime(), other.getFormalizedDatetime())
                    && xSV(getMemberStatusCode(), other.getMemberStatusCode())
                    && xSV(getStatusDisplayOrder(), other.getStatusDisplayOrder())
                    && xSV(getMemberStatusName(), other.getMemberStatusName())
                    && xSV(getDummyFlg(), other.getDummyFlg())
                    && xSV(getDummyNoflg(), other.getDummyNoflg())
                )}
            }
            case _ => false
        }
    }

    override protected def doHashCode(initial: Int): Int = {
        var hs: Int = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, getMemberId());
        hs = xCH(hs, getMemberName());
        hs = xCH(hs, getBirthdate());
        hs = xCH(hs, getFormalizedDatetime());
        hs = xCH(hs, getMemberStatusCode());
        hs = xCH(hs, getStatusDisplayOrder());
        hs = xCH(hs, getMemberStatusName());
        hs = xCH(hs, getDummyFlg());
        hs = xCH(hs, getDummyNoflg());
        return hs;
    }

    override protected def doBuildStringWithRelation(li: String): String = {
        return "";
    }

    override protected def doBuildColumnString(dm: String): String = {
        val sb: StringBuilder = new StringBuilder();
        sb.append(dm).append(getMemberId());
        sb.append(dm).append(getMemberName());
        sb.append(dm).append(getBirthdate());
        sb.append(dm).append(getFormalizedDatetime());
        sb.append(dm).append(getMemberStatusCode());
        sb.append(dm).append(getStatusDisplayOrder());
        sb.append(dm).append(getMemberStatusName());
        sb.append(dm).append(getDummyFlg());
        sb.append(dm).append(getDummyNoflg());
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    override protected def doBuildRelationString(dm: String): String = {
        return "";
    }

    override def clone(): DbleOptionMember = {
        return super.clone().asInstanceOf[DbleOptionMember];
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (会員ID)MEMBER_ID: {INTEGER(10), refers to MEMBER.MEMBER_ID} <br />
     * @return The value of the column 'MEMBER_ID'. (NullAllowed even if selected: for no constraint)
     */
    def getMemberId(): Integer = {
        return _memberId;
    }

    /**
     * [set] (会員ID)MEMBER_ID: {INTEGER(10), refers to MEMBER.MEMBER_ID} <br />
     * @param memberId The value of the column 'MEMBER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    def setMemberId(memberId: Integer): Unit = {
        __modifiedProperties.addPropertyName("memberId");
        _memberId = memberId;
    }

    /**
     * [get] (会員名称)MEMBER_NAME: {VARCHAR(200), refers to MEMBER.MEMBER_NAME} <br />
     * @return The value of the column 'MEMBER_NAME'. (NullAllowed even if selected: for no constraint)
     */
    def getMemberName(): String = {
        return convertEmptyToNull(_memberName);
    }

    /**
     * [set] (会員名称)MEMBER_NAME: {VARCHAR(200), refers to MEMBER.MEMBER_NAME} <br />
     * @param memberName The value of the column 'MEMBER_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    def setMemberName(memberName: String): Unit = {
        __modifiedProperties.addPropertyName("memberName");
        _memberName = memberName;
    }

    /**
     * [get] (生年月日)BIRTHDATE: {DATE(8), refers to MEMBER.BIRTHDATE} <br />
     * @return The value of the column 'BIRTHDATE'. (NullAllowed even if selected: for no constraint)
     */
    def getBirthdate(): org.joda.time.LocalDate = {
        return _birthdate;
    }

    /**
     * [set] (生年月日)BIRTHDATE: {DATE(8), refers to MEMBER.BIRTHDATE} <br />
     * @param birthdate The value of the column 'BIRTHDATE'. (NullAllowed: null update allowed for no constraint)
     */
    def setBirthdate(birthdate: org.joda.time.LocalDate): Unit = {
        __modifiedProperties.addPropertyName("birthdate");
        _birthdate = birthdate;
    }

    /**
     * [get] (正式会員日時)FORMALIZED_DATETIME: {TIMESTAMP(23, 10), refers to MEMBER.FORMALIZED_DATETIME} <br />
     * @return The value of the column 'FORMALIZED_DATETIME'. (NullAllowed even if selected: for no constraint)
     */
    def getFormalizedDatetime(): org.joda.time.LocalDateTime = {
        return _formalizedDatetime;
    }

    /**
     * [set] (正式会員日時)FORMALIZED_DATETIME: {TIMESTAMP(23, 10), refers to MEMBER.FORMALIZED_DATETIME} <br />
     * @param formalizedDatetime The value of the column 'FORMALIZED_DATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    def setFormalizedDatetime(formalizedDatetime: org.joda.time.LocalDateTime): Unit = {
        __modifiedProperties.addPropertyName("formalizedDatetime");
        _formalizedDatetime = formalizedDatetime;
    }

    /**
     * [get] (会員ステータスコード)MEMBER_STATUS_CODE: {CHAR(3), refers to MEMBER.MEMBER_STATUS_CODE, classification=MemberStatus} <br />
     * @return The value of the column 'MEMBER_STATUS_CODE'. (NullAllowed even if selected: for no constraint)
     */
    def getMemberStatusCode(): String = {
        return convertEmptyToNull(_memberStatusCode);
    }

    /**
     * [set] (会員ステータスコード)MEMBER_STATUS_CODE: {CHAR(3), refers to MEMBER.MEMBER_STATUS_CODE, classification=MemberStatus} <br />
     * @param memberStatusCode The value of the column 'MEMBER_STATUS_CODE'. (NullAllowed: null update allowed for no constraint)
     */
    protected def setMemberStatusCode(memberStatusCode: String): Unit = {
        checkClassificationCode("MEMBER_STATUS_CODE", CDef.DefMeta.MemberStatus, memberStatusCode);
        __modifiedProperties.addPropertyName("memberStatusCode");
        _memberStatusCode = memberStatusCode;
    }

    /**
     * [get] (表示順)STATUS_DISPLAY_ORDER: {INTEGER(10), refers to MEMBER_STATUS.DISPLAY_ORDER} <br />
     * @return The value of the column 'STATUS_DISPLAY_ORDER'. (NullAllowed even if selected: for no constraint)
     */
    def getStatusDisplayOrder(): Integer = {
        return _statusDisplayOrder;
    }

    /**
     * [set] (表示順)STATUS_DISPLAY_ORDER: {INTEGER(10), refers to MEMBER_STATUS.DISPLAY_ORDER} <br />
     * @param statusDisplayOrder The value of the column 'STATUS_DISPLAY_ORDER'. (NullAllowed: null update allowed for no constraint)
     */
    def setStatusDisplayOrder(statusDisplayOrder: Integer): Unit = {
        __modifiedProperties.addPropertyName("statusDisplayOrder");
        _statusDisplayOrder = statusDisplayOrder;
    }

    /**
     * [get] (会員ステータス名称)MEMBER_STATUS_NAME: {VARCHAR(50), refers to MEMBER_STATUS.MEMBER_STATUS_NAME} <br />
     * @return The value of the column 'MEMBER_STATUS_NAME'. (NullAllowed even if selected: for no constraint)
     */
    def getMemberStatusName(): String = {
        return convertEmptyToNull(_memberStatusName);
    }

    /**
     * [set] (会員ステータス名称)MEMBER_STATUS_NAME: {VARCHAR(50), refers to MEMBER_STATUS.MEMBER_STATUS_NAME} <br />
     * @param memberStatusName The value of the column 'MEMBER_STATUS_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    def setMemberStatusName(memberStatusName: String): Unit = {
        __modifiedProperties.addPropertyName("memberStatusName");
        _memberStatusName = memberStatusName;
    }

    /**
     * [get] DUMMY_FLG: {INTEGER(10), classification=Flg} <br />
     * @return The value of the column 'DUMMY_FLG'. (NullAllowed even if selected: for no constraint)
     */
    def getDummyFlg(): Integer = {
        return _dummyFlg;
    }

    /**
     * [set] DUMMY_FLG: {INTEGER(10), classification=Flg} <br />
     * @param dummyFlg The value of the column 'DUMMY_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    protected def setDummyFlg(dummyFlg: Integer): Unit = {
        checkClassificationCode("DUMMY_FLG", CDef.DefMeta.Flg, dummyFlg);
        __modifiedProperties.addPropertyName("dummyFlg");
        _dummyFlg = dummyFlg;
    }

    /**
     * [get] DUMMY_NOFLG: {INTEGER(10)} <br />
     * @return The value of the column 'DUMMY_NOFLG'. (NullAllowed even if selected: for no constraint)
     */
    def getDummyNoflg(): Integer = {
        return _dummyNoflg;
    }

    /**
     * [set] DUMMY_NOFLG: {INTEGER(10)} <br />
     * @param dummyNoflg The value of the column 'DUMMY_NOFLG'. (NullAllowed: null update allowed for no constraint)
     */
    def setDummyNoflg(dummyNoflg: Integer): Unit = {
        __modifiedProperties.addPropertyName("dummyNoflg");
        _dummyNoflg = dummyNoflg;
    }

    /**
     * For framework so basically DON'T use this method.
     * @param memberStatusCode The value of the column 'MEMBER_STATUS_CODE'. (NullAllowed: null update allowed for no constraint)
     */
    def mynativeMappingMemberStatusCode(memberStatusCode: String): Unit = {
        setMemberStatusCode(memberStatusCode);
    }

    /**
     * For framework so basically DON'T use this method.
     * @param dummyFlg The value of the column 'DUMMY_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    def mynativeMappingDummyFlg(dummyFlg: Integer): Unit = {
        setDummyFlg(dummyFlg);
    }
}
