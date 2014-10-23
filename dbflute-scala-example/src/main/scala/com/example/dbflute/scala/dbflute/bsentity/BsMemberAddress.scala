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
 * The immutable entity of (会員住所情報)MEMBER_ADDRESS as TABLE. <br />
 * <pre>
 * [primary-key]
 *     MEMBER_ADDRESS_ID
 * 
 * [column]
 *     MEMBER_ADDRESS_ID, MEMBER_ID, VALID_BEGIN_DATE, VALID_END_DATE, ADDRESS, REGION_ID, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     MEMBER_ADDRESS_ID
 * 
 * [version-no]
 *     VERSION_NO
 * 
 * [foreign table]
 *     MEMBER, REGION
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     member, region
 * 
 * [referrer property]
 *     
 * 
 * [get template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * val memberAddressId: Int = entity.memberAddressId
 * val memberId: Int = entity.memberId
 * val validBeginDate: org.joda.time.LocalDate = entity.validBeginDate
 * val validEndDate: org.joda.time.LocalDate = entity.validEndDate
 * val address: String = entity.address
 * val regionId: CDef.Region = entity.regionId
 * val registerDatetime: org.joda.time.LocalDateTime = entity.registerDatetime
 * val registerUser: String = entity.registerUser
 * val updateDatetime: org.joda.time.LocalDateTime = entity.updateDatetime
 * val updateUser: String = entity.updateUser
 * val versionNo: Long = entity.versionNo
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
abstract class BsMemberAddress(dble: DbleMemberAddress) extends Serializable {

    // ===================================================================================
    //                                                                           Case Like
    //                                                                           =========
    def copy(
         memberAddressId: Int = memberAddressId
        , memberId: Int = memberId
        , validBeginDate: org.joda.time.LocalDate = validBeginDate
        , validEndDate: org.joda.time.LocalDate = validEndDate
        , address: String = address
        , regionId: CDef.Region = regionId
        , registerDatetime: org.joda.time.LocalDateTime = registerDatetime
        , registerUser: String = registerUser
        , updateDatetime: org.joda.time.LocalDateTime = updateDatetime
        , updateUser: String = updateUser
        , versionNo: Long = versionNo
    ): MemberAddress = {
        val newDble = new DbleMemberAddress
        newDble.myuniqueDrivenProperties.addAll(dble.myuniqueDrivenProperties) // inherit
        newDble.mymodifiedProperties.addAll(dble.mymodifiedProperties) // inherit
        if (!memberAddressId.equals(this.memberAddressId)) { newDble.setMemberAddressId(memberAddressId) }
        if (!memberId.equals(this.memberId)) { newDble.setMemberId(memberId) }
        if (!validBeginDate.equals(this.validBeginDate)) { newDble.setValidBeginDate(validBeginDate) }
        if (!validEndDate.equals(this.validEndDate)) { newDble.setValidEndDate(validEndDate) }
        if (!address.equals(this.address)) { newDble.setAddress(address) }
        if (!regionId.equals(this.regionId)) { newDble.setRegionIdAsRegion(regionId) }
        if (!registerDatetime.equals(this.registerDatetime)) { newDble.setRegisterDatetime(registerDatetime) }
        if (!registerUser.equals(this.registerUser)) { newDble.setRegisterUser(registerUser) }
        if (!updateDatetime.equals(this.updateDatetime)) { newDble.setUpdateDatetime(updateDatetime) }
        if (!updateUser.equals(this.updateUser)) { newDble.setUpdateUser(updateUser) }
        if (!versionNo.equals(this.versionNo)) { newDble.setVersionNo(versionNo) }
        new MemberAddress(newDble)
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
     * Get the value of regionId as the classification of Region. <br />
     * (地域ID)REGION_ID: {IX, NotNull, INTEGER(10), FK to REGION, classification=Region} <br />
     * mainly region of member address
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    def regionIdAsRegion: CDef.Region = { dble.getRegionIdAsRegion }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of regionId America? <br />
     * AMERICA
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isRegionId_America: Boolean = { dble.isRegionId_America }

    /**
     * Is the value of regionId Canada? <br />
     * CANADA
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isRegionId_Canada: Boolean = { dble.isRegionId_Canada }

    /**
     * Is the value of regionId China? <br />
     * CHINA
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isRegionId_China: Boolean = { dble.isRegionId_China }

    /**
     * Is the value of regionId Chiba? <br />
     * CHIBA
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isRegionId_Chiba: Boolean = { dble.isRegionId_Chiba }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /**
     * [get] (会員)MEMBER by my MEMBER_ID, named 'member'.
     * @return The entity of foreign property 'member'. (EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    def member: Option[Member] = { dble.toImmutableMember }

    /**
     * [get] (地域)REGION by my REGION_ID, named 'region'.
     * @return The entity of foreign property 'region'. (EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    def region: Option[Region] = { dble.toImmutableRegion }

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
            case obj: BsMemberAddress => {
                val other: BsMemberAddress = obj.asInstanceOf[BsMemberAddress];
                {(
                     xSV(memberAddressId, other.memberAddressId)
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
     * [get] (会員住所ID)MEMBER_ADDRESS_ID: {PK, ID, NotNull, INTEGER(10)} <br />
     * @return The value of the column 'MEMBER_ADDRESS_ID'. (NotNull but EmptyAllowed if null in database)
     */
    def memberAddressId: Int = { dble.getMemberAddressId }

    /**
     * [get] (会員ID)MEMBER_ID: {UQ+, IX, NotNull, INTEGER(10), FK to MEMBER} <br />
     * @return The value of the column 'MEMBER_ID'. (NotNull but EmptyAllowed if null in database)
     */
    def memberId: Int = { dble.getMemberId }

    /**
     * [get] (有効開始日)VALID_BEGIN_DATE: {+UQ, NotNull, DATE(8)} <br />
     * @return The value of the column 'VALID_BEGIN_DATE'. (NotNull but EmptyAllowed if null in database)
     */
    def validBeginDate: org.joda.time.LocalDate = { dble.getValidBeginDate }

    /**
     * [get] (有効終了日)VALID_END_DATE: {NotNull, DATE(8)} <br />
     * @return The value of the column 'VALID_END_DATE'. (NotNull but EmptyAllowed if null in database)
     */
    def validEndDate: org.joda.time.LocalDate = { dble.getValidEndDate }

    /**
     * [get] (住所)ADDRESS: {NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'ADDRESS'. (NotNull but EmptyAllowed if null in database)
     */
    def address: String = { dble.getAddress }

    /**
     * [get] (地域ID)REGION_ID: {IX, NotNull, INTEGER(10), FK to REGION, classification=Region} <br />
     * @return The value of the column 'REGION_ID'. (NotNull but EmptyAllowed if null in database)
     */
    def regionId: CDef.Region = { dble.getRegionIdAsRegion }

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
 * The mutable entity of (会員住所情報)MEMBER_ADDRESS as TABLE. <br />
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * val memberAddressId: Int = entity.memberAddressId
 * val memberId: Int = entity.memberId
 * val validBeginDate: org.joda.time.LocalDate = entity.validBeginDate
 * val validEndDate: org.joda.time.LocalDate = entity.validEndDate
 * val address: String = entity.address
 * val regionId: CDef.Region = entity.regionId
 * val registerDatetime: org.joda.time.LocalDateTime = entity.registerDatetime
 * val registerUser: String = entity.registerUser
 * val updateDatetime: org.joda.time.LocalDateTime = entity.updateDatetime
 * val updateUser: String = entity.updateUser
 * val versionNo: Long = entity.versionNo
 * entity.memberAddressId = memberAddressId
 * entity.memberId = memberId
 * entity.validBeginDate = validBeginDate
 * entity.validEndDate = validEndDate
 * entity.address = address
 * entity.regionId = regionId
 * entity.registerDatetime = registerDatetime
 * entity.registerUser = registerUser
 * entity.updateDatetime = updateDatetime
 * entity.updateUser = updateUser
 * entity.versionNo = versionNo
 * = = = = = = = = = =/
 * @author DBFlute(AutoGenerator)
 */
abstract class BsMbleMemberAddress {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected val dble: DbleMemberAddress = new DbleMemberAddress();

    // ===================================================================================
    //                                                                      DB-able Entity
    //                                                                      ==============
    def toDBable(): DbleMemberAddress = { dble }

    // ===================================================================================
    //                                                                    Immutable Entity
    //                                                                    ================
    def toImmutable(): MemberAddress = { dble.toImmutable() }

    // ===================================================================================
    //                                                                          Unique Key
    //                                                                          ==========
    /**
     * To be unique by the unique column. <br />
     * You can update the entity by the key when entity update (NOT batch update).
     * @param memberId (会員ID): UQ+, IX, NotNull, INTEGER(10), FK to MEMBER. (NotNull)
     * @param validBeginDate (有効開始日): +UQ, NotNull, DATE(8). (NotNull)
     */
    def uniqueBy(memberId: Integer, validBeginDate: org.joda.time.LocalDate): Unit = { dble.setMemberId(memberId);dble.setValidBeginDate(validBeginDate); }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of regionId as the classification of Region. <br />
     * (地域ID)REGION_ID: {IX, NotNull, INTEGER(10), FK to REGION, classification=Region} <br />
     * mainly region of member address
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    def regionIdAsRegion: CDef.Region = { dble.getRegionIdAsRegion }

    /**
     * Set the value of regionId as the classification of Region. <br />
     * (地域ID)REGION_ID: {IX, NotNull, INTEGER(10), FK to REGION, classification=Region} <br />
     * mainly region of member address
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    def regionIdAsRegion_=(cdef: CDef.Region): Unit = { dble.setRegionIdAsRegion(cdef) }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of regionId as America (1). <br />
     * AMERICA
     */
    def regionId_America: Unit = { dble.setRegionId_America }

    /**
     * Set the value of regionId as Canada (2). <br />
     * CANADA
     */
    def regionId_Canada: Unit = { dble.setRegionId_Canada }

    /**
     * Set the value of regionId as China (3). <br />
     * CHINA
     */
    def regionId_China: Unit = { dble.setRegionId_China }

    /**
     * Set the value of regionId as Chiba (4). <br />
     * CHIBA
     */
    def regionId_Chiba: Unit = { dble.setRegionId_Chiba }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of regionId America? <br />
     * AMERICA
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isRegionId_America: Boolean = { dble.isRegionId_America }

    /**
     * Is the value of regionId Canada? <br />
     * CANADA
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isRegionId_Canada: Boolean = { dble.isRegionId_Canada }

    /**
     * Is the value of regionId China? <br />
     * CHINA
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isRegionId_China: Boolean = { dble.isRegionId_China }

    /**
     * Is the value of regionId Chiba? <br />
     * CHIBA
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isRegionId_Chiba: Boolean = { dble.isRegionId_Chiba }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (会員住所ID)MEMBER_ADDRESS_ID: {PK, ID, NotNull, INTEGER(10)} <br />
     * @return The value of the column 'MEMBER_ADDRESS_ID'. (basically NotNull if selected: for the constraint)
     */
    def memberAddressId: Int = { dble.getMemberAddressId }

    /**
     * [set] (会員住所ID)MEMBER_ADDRESS_ID: {PK, ID, NotNull, INTEGER(10)} <br />
     * @param memberAddressId The value of the column 'MEMBER_ADDRESS_ID'. (NullAllowed: null update allowed for no constraint)
     */
    def memberAddressId_=(memberAddressId: Int) = { dble.setMemberAddressId(memberAddressId) }

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
     * [get] (有効開始日)VALID_BEGIN_DATE: {+UQ, NotNull, DATE(8)} <br />
     * @return The value of the column 'VALID_BEGIN_DATE'. (basically NotNull if selected: for the constraint)
     */
    def validBeginDate: org.joda.time.LocalDate = { dble.getValidBeginDate }

    /**
     * [set] (有効開始日)VALID_BEGIN_DATE: {+UQ, NotNull, DATE(8)} <br />
     * @param validBeginDate The value of the column 'VALID_BEGIN_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    def validBeginDate_=(validBeginDate: org.joda.time.LocalDate) = { dble.setValidBeginDate(validBeginDate) }

    /**
     * [get] (有効終了日)VALID_END_DATE: {NotNull, DATE(8)} <br />
     * @return The value of the column 'VALID_END_DATE'. (basically NotNull if selected: for the constraint)
     */
    def validEndDate: org.joda.time.LocalDate = { dble.getValidEndDate }

    /**
     * [set] (有効終了日)VALID_END_DATE: {NotNull, DATE(8)} <br />
     * @param validEndDate The value of the column 'VALID_END_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    def validEndDate_=(validEndDate: org.joda.time.LocalDate) = { dble.setValidEndDate(validEndDate) }

    /**
     * [get] (住所)ADDRESS: {NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'ADDRESS'. (basically NotNull if selected: for the constraint)
     */
    def address: String = { dble.getAddress }

    /**
     * [set] (住所)ADDRESS: {NotNull, VARCHAR(200)} <br />
     * @param address The value of the column 'ADDRESS'. (NullAllowed: null update allowed for no constraint)
     */
    def address_=(address: String) = { dble.setAddress(address) }

    /**
     * [get] (地域ID)REGION_ID: {IX, NotNull, INTEGER(10), FK to REGION, classification=Region} <br />
     * @return The value of the column 'REGION_ID'. (basically NotNull if selected: for the constraint)
     */
    def regionId: CDef.Region = { dble.getRegionIdAsRegion }

    /**
     * [set] (地域ID)REGION_ID: {IX, NotNull, INTEGER(10), FK to REGION, classification=Region} <br />
     * @param regionId The value of the column 'REGION_ID'. (NullAllowed: null update allowed for no constraint)
     */
    protected def regionId_=(regionId: CDef.Region) = { dble.setRegionIdAsRegion(regionId) }

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
