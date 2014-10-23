package com.example.dbflute.scala.dbflute.bsentity.customize;

import scala.collection.immutable._;
import scala.collection.JavaConverters._;

import java.io.Serializable;
import java.util.Collection;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.FunCustodial;
import com.example.dbflute.scala.dbflute.allcommon.CDef;
import com.example.dbflute.scala.dbflute.exentity.customize._;

/**
 * The immutable entity of OptionMember. <br />
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
 * [get template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * val memberId: Option[Int] = entity.memberId
 * val memberName: Option[String] = entity.memberName
 * val birthdate: Option[org.joda.time.LocalDate] = entity.birthdate
 * val formalizedDatetime: Option[org.joda.time.LocalDateTime] = entity.formalizedDatetime
 * val memberStatusCode: Option[CDef.MemberStatus] = entity.memberStatusCode
 * val statusDisplayOrder: Option[Int] = entity.statusDisplayOrder
 * val memberStatusName: Option[String] = entity.memberStatusName
 * val dummyFlg: Option[CDef.Flg] = entity.dummyFlg
 * val dummyNoflg: Option[Int] = entity.dummyNoflg
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
abstract class BsOptionMember(dble: DbleOptionMember) extends Serializable {

    // ===================================================================================
    //                                                                           Case Like
    //                                                                           =========
    def copy(
         memberId: Option[Int] = memberId
        , memberName: Option[String] = memberName
        , birthdate: Option[org.joda.time.LocalDate] = birthdate
        , formalizedDatetime: Option[org.joda.time.LocalDateTime] = formalizedDatetime
        , memberStatusCode: Option[CDef.MemberStatus] = memberStatusCode
        , statusDisplayOrder: Option[Int] = statusDisplayOrder
        , memberStatusName: Option[String] = memberStatusName
        , dummyFlg: Option[CDef.Flg] = dummyFlg
        , dummyNoflg: Option[Int] = dummyNoflg
    ): OptionMember = {
        val newDble = new DbleOptionMember
        newDble.myuniqueDrivenProperties.addAll(dble.myuniqueDrivenProperties) // inherit
        newDble.mymodifiedProperties.addAll(dble.mymodifiedProperties) // inherit
        if (!memberId.equals(this.memberId)) { newDble.setMemberId(memberId.map(int2Integer(_)).orNull) }
        if (!memberName.equals(this.memberName)) { newDble.setMemberName(memberName.orNull) }
        if (!birthdate.equals(this.birthdate)) { newDble.setBirthdate(birthdate.orNull) }
        if (!formalizedDatetime.equals(this.formalizedDatetime)) { newDble.setFormalizedDatetime(formalizedDatetime.orNull) }
        if (!memberStatusCode.equals(this.memberStatusCode)) { newDble.setMemberStatusCodeAsMemberStatus(memberStatusCode.orNull) }
        if (!statusDisplayOrder.equals(this.statusDisplayOrder)) { newDble.setStatusDisplayOrder(statusDisplayOrder.map(int2Integer(_)).orNull) }
        if (!memberStatusName.equals(this.memberStatusName)) { newDble.setMemberStatusName(memberStatusName.orNull) }
        if (!dummyFlg.equals(this.dummyFlg)) { newDble.setDummyFlgAsFlg(dummyFlg.orNull) }
        if (!dummyNoflg.equals(this.dummyNoflg)) { newDble.setDummyNoflg(dummyNoflg.map(int2Integer(_)).orNull) }
        new OptionMember(newDble)
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
     * Get the value of memberStatusCode as the classification of MemberStatus. <br />
     * (会員ステータスコード)MEMBER_STATUS_CODE: {CHAR(3), refers to MEMBER.MEMBER_STATUS_CODE, classification=MemberStatus} <br />
     * status of member from entry to withdrawal
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    def memberStatusCodeAsMemberStatus: CDef.MemberStatus = { dble.getMemberStatusCodeAsMemberStatus }

    /**
     * Get the value of dummyFlg as the classification of Flg. <br />
     * DUMMY_FLG: {INTEGER(10), classification=Flg} <br />
     * general boolean classification for every flg-column
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    def dummyFlgAsFlg: CDef.Flg = { dble.getDummyFlgAsFlg }

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

    /**
     * Is the value of dummyFlg True? <br />
     * Yes: means valid
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isDummyFlg_True: Boolean = { dble.isDummyFlg_True }

    /**
     * Is the value of dummyFlg False? <br />
     * No: means invalid
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isDummyFlg_False: Boolean = { dble.isDummyFlg_False }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    /**
     * Get the value of the column 'dummyFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    def dummyFlgName: String = { dble.getDummyFlgName }

    /**
     * Get the value of the column 'dummyFlg' as classification alias.
     * @return The string of classification alias. (NullAllowed: when the column value is null)
     */
    def dummyFlgAlias: String = { dble.getDummyFlgAlias }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
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
            case obj: BsOptionMember => {
                val other: BsOptionMember = obj.asInstanceOf[BsOptionMember];
                {(
                     xSV(memberId, other.memberId)
                    && xSV(memberName, other.memberName)
                    && xSV(birthdate, other.birthdate)
                    && xSV(formalizedDatetime, other.formalizedDatetime)
                    && xSV(memberStatusCode, other.memberStatusCode)
                    && xSV(statusDisplayOrder, other.statusDisplayOrder)
                    && xSV(memberStatusName, other.memberStatusName)
                    && xSV(dummyFlg, other.dummyFlg)
                    && xSV(dummyNoflg, other.dummyNoflg)
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
     * [get] (会員ID)MEMBER_ID: {INTEGER(10), refers to MEMBER.MEMBER_ID} <br />
     * @return The value of the column 'MEMBER_ID'. (basically NotNull if selected: for the constraint)
     */
    def memberId: Option[Int] = { Option(dble.getMemberId) }

    /**
     * [get] (会員名称)MEMBER_NAME: {VARCHAR(200), refers to MEMBER.MEMBER_NAME} <br />
     * @return The value of the column 'MEMBER_NAME'. (basically NotNull if selected: for the constraint)
     */
    def memberName: Option[String] = { Option(dble.getMemberName) }

    /**
     * [get] (生年月日)BIRTHDATE: {DATE(8), refers to MEMBER.BIRTHDATE} <br />
     * @return The value of the column 'BIRTHDATE'. (basically NotNull if selected: for the constraint)
     */
    def birthdate: Option[org.joda.time.LocalDate] = { Option(dble.getBirthdate) }

    /**
     * [get] (正式会員日時)FORMALIZED_DATETIME: {TIMESTAMP(23, 10), refers to MEMBER.FORMALIZED_DATETIME} <br />
     * @return The value of the column 'FORMALIZED_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    def formalizedDatetime: Option[org.joda.time.LocalDateTime] = { Option(dble.getFormalizedDatetime) }

    /**
     * [get] (会員ステータスコード)MEMBER_STATUS_CODE: {CHAR(3), refers to MEMBER.MEMBER_STATUS_CODE, classification=MemberStatus} <br />
     * @return The value of the column 'MEMBER_STATUS_CODE'. (basically NotNull if selected: for the constraint)
     */
    def memberStatusCode: Option[CDef.MemberStatus] = { Option(dble.getMemberStatusCodeAsMemberStatus) }

    /**
     * [get] (表示順)STATUS_DISPLAY_ORDER: {INTEGER(10), refers to MEMBER_STATUS.DISPLAY_ORDER} <br />
     * @return The value of the column 'STATUS_DISPLAY_ORDER'. (basically NotNull if selected: for the constraint)
     */
    def statusDisplayOrder: Option[Int] = { Option(dble.getStatusDisplayOrder) }

    /**
     * [get] (会員ステータス名称)MEMBER_STATUS_NAME: {VARCHAR(50), refers to MEMBER_STATUS.MEMBER_STATUS_NAME} <br />
     * @return The value of the column 'MEMBER_STATUS_NAME'. (basically NotNull if selected: for the constraint)
     */
    def memberStatusName: Option[String] = { Option(dble.getMemberStatusName) }

    /**
     * [get] DUMMY_FLG: {INTEGER(10), classification=Flg} <br />
     * @return The value of the column 'DUMMY_FLG'. (basically NotNull if selected: for the constraint)
     */
    def dummyFlg: Option[CDef.Flg] = { Option(dble.getDummyFlgAsFlg) }

    /**
     * [get] DUMMY_NOFLG: {INTEGER(10)} <br />
     * @return The value of the column 'DUMMY_NOFLG'. (basically NotNull if selected: for the constraint)
     */
    def dummyNoflg: Option[Int] = { Option(dble.getDummyNoflg) }
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
 * The mutable entity of OptionMember. <br />
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * val memberId: Option[Int] = entity.memberId
 * val memberName: Option[String] = entity.memberName
 * val birthdate: Option[org.joda.time.LocalDate] = entity.birthdate
 * val formalizedDatetime: Option[org.joda.time.LocalDateTime] = entity.formalizedDatetime
 * val memberStatusCode: Option[CDef.MemberStatus] = entity.memberStatusCode
 * val statusDisplayOrder: Option[Int] = entity.statusDisplayOrder
 * val memberStatusName: Option[String] = entity.memberStatusName
 * val dummyFlg: Option[CDef.Flg] = entity.dummyFlg
 * val dummyNoflg: Option[Int] = entity.dummyNoflg
 * entity.memberId = memberId
 * entity.memberName = memberName
 * entity.birthdate = birthdate
 * entity.formalizedDatetime = formalizedDatetime
 * entity.memberStatusCode = memberStatusCode
 * entity.statusDisplayOrder = statusDisplayOrder
 * entity.memberStatusName = memberStatusName
 * entity.dummyFlg = dummyFlg
 * entity.dummyNoflg = dummyNoflg
 * = = = = = = = = = =/
 * @author DBFlute(AutoGenerator)
 */
abstract class BsMbleOptionMember {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected val dble: DbleOptionMember = new DbleOptionMember();

    // ===================================================================================
    //                                                                      DB-able Entity
    //                                                                      ==============
    def toDBable(): DbleOptionMember = { dble }

    // ===================================================================================
    //                                                                    Immutable Entity
    //                                                                    ================
    def toImmutable(): OptionMember = { dble.toImmutable() }

    // ===================================================================================
    //                                                                          Unique Key
    //                                                                          ==========
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
    def memberStatusCodeAsMemberStatus: CDef.MemberStatus = { dble.getMemberStatusCodeAsMemberStatus }

    /**
     * Set the value of memberStatusCode as the classification of MemberStatus. <br />
     * (会員ステータスコード)MEMBER_STATUS_CODE: {CHAR(3), refers to MEMBER.MEMBER_STATUS_CODE, classification=MemberStatus} <br />
     * status of member from entry to withdrawal
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    def memberStatusCodeAsMemberStatus_=(cdef: CDef.MemberStatus): Unit = { dble.setMemberStatusCodeAsMemberStatus(cdef) }

    /**
     * Get the value of dummyFlg as the classification of Flg. <br />
     * DUMMY_FLG: {INTEGER(10), classification=Flg} <br />
     * general boolean classification for every flg-column
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    def dummyFlgAsFlg: CDef.Flg = { dble.getDummyFlgAsFlg }

    /**
     * Set the value of dummyFlg as the classification of Flg. <br />
     * DUMMY_FLG: {INTEGER(10), classification=Flg} <br />
     * general boolean classification for every flg-column
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    def dummyFlgAsFlg_=(cdef: CDef.Flg): Unit = { dble.setDummyFlgAsFlg(cdef) }

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

    /**
     * Set the value of dummyFlg as True (1). <br />
     * Yes: means valid
     */
    def dummyFlg_True: Unit = { dble.setDummyFlg_True }

    /**
     * Set the value of dummyFlg as False (0). <br />
     * No: means invalid
     */
    def dummyFlg_False: Unit = { dble.setDummyFlg_False }

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

    /**
     * Is the value of dummyFlg True? <br />
     * Yes: means valid
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isDummyFlg_True: Boolean = { dble.isDummyFlg_True }

    /**
     * Is the value of dummyFlg False? <br />
     * No: means invalid
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isDummyFlg_False: Boolean = { dble.isDummyFlg_False }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (会員ID)MEMBER_ID: {INTEGER(10), refers to MEMBER.MEMBER_ID} <br />
     * @return The value of the column 'MEMBER_ID'. (NotNull but EmptyAllowed if null in database)
     */
    def memberId: Option[Int] = { Option(dble.getMemberId) }

    /**
     * [set] (会員ID)MEMBER_ID: {INTEGER(10), refers to MEMBER.MEMBER_ID} <br />
     * @param memberId The value of the column 'MEMBER_ID'. (basically NotNull if update: for the constraint)
     */
    def memberId_=(memberId: Option[Int]) = { dble.setMemberId(memberId.map(int2Integer(_)).orNull) }

    /**
     * [get] (会員名称)MEMBER_NAME: {VARCHAR(200), refers to MEMBER.MEMBER_NAME} <br />
     * @return The value of the column 'MEMBER_NAME'. (NotNull but EmptyAllowed if null in database)
     */
    def memberName: Option[String] = { Option(dble.getMemberName) }

    /**
     * [set] (会員名称)MEMBER_NAME: {VARCHAR(200), refers to MEMBER.MEMBER_NAME} <br />
     * @param memberName The value of the column 'MEMBER_NAME'. (basically NotNull if update: for the constraint)
     */
    def memberName_=(memberName: Option[String]) = { dble.setMemberName(memberName.orNull) }

    /**
     * [get] (生年月日)BIRTHDATE: {DATE(8), refers to MEMBER.BIRTHDATE} <br />
     * @return The value of the column 'BIRTHDATE'. (NotNull but EmptyAllowed if null in database)
     */
    def birthdate: Option[org.joda.time.LocalDate] = { Option(dble.getBirthdate) }

    /**
     * [set] (生年月日)BIRTHDATE: {DATE(8), refers to MEMBER.BIRTHDATE} <br />
     * @param birthdate The value of the column 'BIRTHDATE'. (basically NotNull if update: for the constraint)
     */
    def birthdate_=(birthdate: Option[org.joda.time.LocalDate]) = { dble.setBirthdate(birthdate.orNull) }

    /**
     * [get] (正式会員日時)FORMALIZED_DATETIME: {TIMESTAMP(23, 10), refers to MEMBER.FORMALIZED_DATETIME} <br />
     * @return The value of the column 'FORMALIZED_DATETIME'. (NotNull but EmptyAllowed if null in database)
     */
    def formalizedDatetime: Option[org.joda.time.LocalDateTime] = { Option(dble.getFormalizedDatetime) }

    /**
     * [set] (正式会員日時)FORMALIZED_DATETIME: {TIMESTAMP(23, 10), refers to MEMBER.FORMALIZED_DATETIME} <br />
     * @param formalizedDatetime The value of the column 'FORMALIZED_DATETIME'. (basically NotNull if update: for the constraint)
     */
    def formalizedDatetime_=(formalizedDatetime: Option[org.joda.time.LocalDateTime]) = { dble.setFormalizedDatetime(formalizedDatetime.orNull) }

    /**
     * [get] (会員ステータスコード)MEMBER_STATUS_CODE: {CHAR(3), refers to MEMBER.MEMBER_STATUS_CODE, classification=MemberStatus} <br />
     * @return The value of the column 'MEMBER_STATUS_CODE'. (NotNull but EmptyAllowed if null in database)
     */
    def memberStatusCode: Option[CDef.MemberStatus] = { Option(dble.getMemberStatusCodeAsMemberStatus) }

    /**
     * [set] (会員ステータスコード)MEMBER_STATUS_CODE: {CHAR(3), refers to MEMBER.MEMBER_STATUS_CODE, classification=MemberStatus} <br />
     * @param memberStatusCode The value of the column 'MEMBER_STATUS_CODE'. (basically NotNull if update: for the constraint)
     */
    protected def memberStatusCode_=(memberStatusCode: Option[CDef.MemberStatus]) = { dble.setMemberStatusCodeAsMemberStatus(memberStatusCode.orNull) }

    /**
     * [get] (表示順)STATUS_DISPLAY_ORDER: {INTEGER(10), refers to MEMBER_STATUS.DISPLAY_ORDER} <br />
     * @return The value of the column 'STATUS_DISPLAY_ORDER'. (NotNull but EmptyAllowed if null in database)
     */
    def statusDisplayOrder: Option[Int] = { Option(dble.getStatusDisplayOrder) }

    /**
     * [set] (表示順)STATUS_DISPLAY_ORDER: {INTEGER(10), refers to MEMBER_STATUS.DISPLAY_ORDER} <br />
     * @param statusDisplayOrder The value of the column 'STATUS_DISPLAY_ORDER'. (basically NotNull if update: for the constraint)
     */
    def statusDisplayOrder_=(statusDisplayOrder: Option[Int]) = { dble.setStatusDisplayOrder(statusDisplayOrder.map(int2Integer(_)).orNull) }

    /**
     * [get] (会員ステータス名称)MEMBER_STATUS_NAME: {VARCHAR(50), refers to MEMBER_STATUS.MEMBER_STATUS_NAME} <br />
     * @return The value of the column 'MEMBER_STATUS_NAME'. (NotNull but EmptyAllowed if null in database)
     */
    def memberStatusName: Option[String] = { Option(dble.getMemberStatusName) }

    /**
     * [set] (会員ステータス名称)MEMBER_STATUS_NAME: {VARCHAR(50), refers to MEMBER_STATUS.MEMBER_STATUS_NAME} <br />
     * @param memberStatusName The value of the column 'MEMBER_STATUS_NAME'. (basically NotNull if update: for the constraint)
     */
    def memberStatusName_=(memberStatusName: Option[String]) = { dble.setMemberStatusName(memberStatusName.orNull) }

    /**
     * [get] DUMMY_FLG: {INTEGER(10), classification=Flg} <br />
     * @return The value of the column 'DUMMY_FLG'. (NotNull but EmptyAllowed if null in database)
     */
    def dummyFlg: Option[CDef.Flg] = { Option(dble.getDummyFlgAsFlg) }

    /**
     * [set] DUMMY_FLG: {INTEGER(10), classification=Flg} <br />
     * @param dummyFlg The value of the column 'DUMMY_FLG'. (basically NotNull if update: for the constraint)
     */
    protected def dummyFlg_=(dummyFlg: Option[CDef.Flg]) = { dble.setDummyFlgAsFlg(dummyFlg.orNull) }

    /**
     * [get] DUMMY_NOFLG: {INTEGER(10)} <br />
     * @return The value of the column 'DUMMY_NOFLG'. (NotNull but EmptyAllowed if null in database)
     */
    def dummyNoflg: Option[Int] = { Option(dble.getDummyNoflg) }

    /**
     * [set] DUMMY_NOFLG: {INTEGER(10)} <br />
     * @param dummyNoflg The value of the column 'DUMMY_NOFLG'. (basically NotNull if update: for the constraint)
     */
    def dummyNoflg_=(dummyNoflg: Option[Int]) = { dble.setDummyNoflg(dummyNoflg.map(int2Integer(_)).orNull) }
}
