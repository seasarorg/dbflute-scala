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
 * The entity of (会員住所情報)MEMBER_ADDRESS as TABLE. <br />
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
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer memberAddressId = entity.getMemberAddressId();
 * Integer memberId = entity.getMemberId();
 * org.joda.time.LocalDate validBeginDate = entity.getValidBeginDate();
 * org.joda.time.LocalDate validEndDate = entity.getValidEndDate();
 * String address = entity.getAddress();
 * Integer regionId = entity.getRegionId();
 * org.joda.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerUser = entity.getRegisterUser();
 * org.joda.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateUser = entity.getUpdateUser();
 * Long versionNo = entity.getVersionNo();
 * entity.setMemberAddressId(memberAddressId);
 * entity.setMemberId(memberId);
 * entity.setValidBeginDate(validBeginDate);
 * entity.setValidEndDate(validEndDate);
 * entity.setAddress(address);
 * entity.setRegionId(regionId);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterUser(registerUser);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateUser(updateUser);
 * entity.setVersionNo(versionNo);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
abstract class BsDbleMemberAddress extends AbstractEntity with EntityDefinedCommonColumn with DBableEntity[MemberAddress] with Serializable with Cloneable {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** (会員住所ID)MEMBER_ADDRESS_ID: {PK, ID, NotNull, INTEGER(10)} */
    protected var _memberAddressId: Integer = null;

    /** (会員ID)MEMBER_ID: {UQ+, IX, NotNull, INTEGER(10), FK to MEMBER} */
    protected var _memberId: Integer = null;

    /** (有効開始日)VALID_BEGIN_DATE: {+UQ, NotNull, DATE(8)} */
    protected var _validBeginDate: org.joda.time.LocalDate = null;

    /** (有効終了日)VALID_END_DATE: {NotNull, DATE(8)} */
    protected var _validEndDate: org.joda.time.LocalDate = null;

    /** (住所)ADDRESS: {NotNull, VARCHAR(200)} */
    protected var _address: String = null;

    /** (地域ID)REGION_ID: {IX, NotNull, INTEGER(10), FK to REGION, classification=Region} */
    protected var _regionId: Integer = null;

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
    def acceptImmutable(immu: MemberAddress): DbleMemberAddress = {
        setMemberAddressId(immu.memberAddressId);
        setMemberId(immu.memberId);
        setValidBeginDate(immu.validBeginDate);
        setValidEndDate(immu.validEndDate);
        setAddress(immu.address);
        setRegionIdAsRegion(immu.regionId);
        setRegisterDatetime(immu.registerDatetime);
        setRegisterUser(immu.registerUser);
        setUpdateDatetime(immu.updateDatetime);
        setUpdateUser(immu.updateUser);
        setVersionNo(immu.versionNo);
        setMember(immu.member.map(new DbleMember().acceptImmutable(_)))
        setRegion(immu.region.map(new DbleRegion().acceptImmutable(_)))
        __uniqueDrivenProperties.clear();
        immu.getMyUniqueDrivenProperties().foreach(__uniqueDrivenProperties.addPropertyName(_))
        __modifiedProperties.clear();
        immu.getMyModifiedProperties().foreach(__modifiedProperties.addPropertyName(_))
        return this.asInstanceOf[DbleMemberAddress];
    }

    /**
     * {@inheritDoc}
     */
    def toImmutable(): MemberAddress = {
        return new MemberAddress(this.asInstanceOf[DbleMemberAddress]);
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    def getTableDbName(): String = {
        return "MEMBER_ADDRESS";
    }

    /**
     * {@inheritDoc}
     */
    def getTablePropertyName(): String = {
        return "memberAddress";
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
        if (getMemberAddressId() == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br />
     * You can update the entity by the key when entity update (NOT batch update).
     * @param memberId (会員ID): UQ+, IX, NotNull, INTEGER(10), FK to MEMBER. (NotNull)
     * @param validBeginDate (有効開始日): +UQ, NotNull, DATE(8). (NotNull)
     */
    def uniqueBy(memberId: Integer, validBeginDate: org.joda.time.LocalDate): Unit = {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("memberId");
        __uniqueDrivenProperties.addPropertyName("validBeginDate");
        setMemberId(memberId);setValidBeginDate(validBeginDate);
    }

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
    def getRegionIdAsRegion(): CDef.Region = {
        return CDef.Region.codeOf(getRegionId());
    }

    /**
     * Set the value of regionId as the classification of Region. <br />
     * (地域ID)REGION_ID: {IX, NotNull, INTEGER(10), FK to REGION, classification=Region} <br />
     * mainly region of member address
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    def setRegionIdAsRegion(cdef: CDef.Region): Unit = {
        setRegionId(if (cdef != null) { toNumber(cdef.code, classOf[Integer]) } else { null });
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of regionId as America (1). <br />
     * AMERICA
     */
    def setRegionId_America(): Unit = {
        setRegionIdAsRegion(CDef.Region.America);
    }

    /**
     * Set the value of regionId as Canada (2). <br />
     * CANADA
     */
    def setRegionId_Canada(): Unit = {
        setRegionIdAsRegion(CDef.Region.Canada);
    }

    /**
     * Set the value of regionId as China (3). <br />
     * CHINA
     */
    def setRegionId_China(): Unit = {
        setRegionIdAsRegion(CDef.Region.China);
    }

    /**
     * Set the value of regionId as Chiba (4). <br />
     * CHIBA
     */
    def setRegionId_Chiba(): Unit = {
        setRegionIdAsRegion(CDef.Region.Chiba);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of regionId America? <br />
     * AMERICA
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isRegionId_America(): Boolean = {
        val cdef: CDef.Region = getRegionIdAsRegion();
        return if (cdef != null) { cdef.equals(CDef.Region.America) } else { false };
    }

    /**
     * Is the value of regionId Canada? <br />
     * CANADA
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isRegionId_Canada(): Boolean = {
        val cdef: CDef.Region = getRegionIdAsRegion();
        return if (cdef != null) { cdef.equals(CDef.Region.Canada) } else { false };
    }

    /**
     * Is the value of regionId China? <br />
     * CHINA
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isRegionId_China(): Boolean = {
        val cdef: CDef.Region = getRegionIdAsRegion();
        return if (cdef != null) { cdef.equals(CDef.Region.China) } else { false };
    }

    /**
     * Is the value of regionId Chiba? <br />
     * CHIBA
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isRegionId_Chiba(): Boolean = {
        val cdef: CDef.Region = getRegionIdAsRegion();
        return if (cdef != null) { cdef.equals(CDef.Region.Chiba) } else { false };
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

    /** (地域)REGION by my REGION_ID, named 'region'. */
    protected var _region: Option[DbleRegion] = null;

    /**
     * [get] (地域)REGION by my REGION_ID, named 'region'.
     * @return The entity of foreign property 'region'. (EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    def getRegion(): Option[DbleRegion] = {
        return if (_region != null) { _region; } else { Option.empty; }
    }

    /**
     * [set] (地域)REGION by my REGION_ID, named 'region'.
     * @param region The entity of foreign property 'region'. (EmptyAllowed)
     */
    def setRegion(region: Option[DbleRegion]): Unit = {
        _region = region;
    }

    /**
     * [convert] (地域)REGION by my REGION_ID, named 'region'.
     * @return The new-created immutable entity of foreign property 'region'. (NotNull)
     */
    def toImmutableRegion(): Option[Region] = {
        return getRegion().map(_.toImmutable());
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
            case obj: BsDbleMemberAddress => {
                val other: BsDbleMemberAddress = obj.asInstanceOf[BsDbleMemberAddress];
                {(
                     xSV(getMemberAddressId(), other.getMemberAddressId())
                )}
            }
            case _ => false
        }
    }

    override protected def doHashCode(initial: Int): Int = {
        var hs: Int = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, getMemberAddressId());
        return hs;
    }

    override protected def doBuildStringWithRelation(li: String): String = {
        val sb: StringBuilder = new StringBuilder();
        if (_member != null && _member.isEmpty)
        { sb.append(li).append(xbRDS(_member, "member")); }
        if (_region != null && _region.isEmpty)
        { sb.append(li).append(xbRDS(_region, "region")); }
        return sb.toString();
    }
    protected def xbRDS[ET <: Entity](et: Option[ET], name: String): String = {
        return et.get.buildDisplayString(name, true, true);
    }

    override protected def doBuildColumnString(dm: String): String = {
        val sb: StringBuilder = new StringBuilder();
        sb.append(dm).append(getMemberAddressId());
        sb.append(dm).append(getMemberId());
        sb.append(dm).append(getValidBeginDate());
        sb.append(dm).append(getValidEndDate());
        sb.append(dm).append(getAddress());
        sb.append(dm).append(getRegionId());
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
        if (_region != null && _region.isEmpty)
        { sb.append(dm).append("region"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    override def clone(): DbleMemberAddress = {
        return super.clone().asInstanceOf[DbleMemberAddress];
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (会員住所ID)MEMBER_ADDRESS_ID: {PK, ID, NotNull, INTEGER(10)} <br />
     * @return The value of the column 'MEMBER_ADDRESS_ID'. (basically NotNull if selected: for the constraint)
     */
    def getMemberAddressId(): Integer = {
        return _memberAddressId;
    }

    /**
     * [set] (会員住所ID)MEMBER_ADDRESS_ID: {PK, ID, NotNull, INTEGER(10)} <br />
     * @param memberAddressId The value of the column 'MEMBER_ADDRESS_ID'. (basically NotNull if update: for the constraint)
     */
    def setMemberAddressId(memberAddressId: Integer): Unit = {
        __modifiedProperties.addPropertyName("memberAddressId");
        _memberAddressId = memberAddressId;
    }

    /**
     * [get] (会員ID)MEMBER_ID: {UQ+, IX, NotNull, INTEGER(10), FK to MEMBER} <br />
     * @return The value of the column 'MEMBER_ID'. (basically NotNull if selected: for the constraint)
     */
    def getMemberId(): Integer = {
        return _memberId;
    }

    /**
     * [set] (会員ID)MEMBER_ID: {UQ+, IX, NotNull, INTEGER(10), FK to MEMBER} <br />
     * @param memberId The value of the column 'MEMBER_ID'. (basically NotNull if update: for the constraint)
     */
    def setMemberId(memberId: Integer): Unit = {
        __modifiedProperties.addPropertyName("memberId");
        _memberId = memberId;
    }

    /**
     * [get] (有効開始日)VALID_BEGIN_DATE: {+UQ, NotNull, DATE(8)} <br />
     * @return The value of the column 'VALID_BEGIN_DATE'. (basically NotNull if selected: for the constraint)
     */
    def getValidBeginDate(): org.joda.time.LocalDate = {
        return _validBeginDate;
    }

    /**
     * [set] (有効開始日)VALID_BEGIN_DATE: {+UQ, NotNull, DATE(8)} <br />
     * @param validBeginDate The value of the column 'VALID_BEGIN_DATE'. (basically NotNull if update: for the constraint)
     */
    def setValidBeginDate(validBeginDate: org.joda.time.LocalDate): Unit = {
        __modifiedProperties.addPropertyName("validBeginDate");
        _validBeginDate = validBeginDate;
    }

    /**
     * [get] (有効終了日)VALID_END_DATE: {NotNull, DATE(8)} <br />
     * @return The value of the column 'VALID_END_DATE'. (basically NotNull if selected: for the constraint)
     */
    def getValidEndDate(): org.joda.time.LocalDate = {
        return _validEndDate;
    }

    /**
     * [set] (有効終了日)VALID_END_DATE: {NotNull, DATE(8)} <br />
     * @param validEndDate The value of the column 'VALID_END_DATE'. (basically NotNull if update: for the constraint)
     */
    def setValidEndDate(validEndDate: org.joda.time.LocalDate): Unit = {
        __modifiedProperties.addPropertyName("validEndDate");
        _validEndDate = validEndDate;
    }

    /**
     * [get] (住所)ADDRESS: {NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'ADDRESS'. (basically NotNull if selected: for the constraint)
     */
    def getAddress(): String = {
        return convertEmptyToNull(_address);
    }

    /**
     * [set] (住所)ADDRESS: {NotNull, VARCHAR(200)} <br />
     * @param address The value of the column 'ADDRESS'. (basically NotNull if update: for the constraint)
     */
    def setAddress(address: String): Unit = {
        __modifiedProperties.addPropertyName("address");
        _address = address;
    }

    /**
     * [get] (地域ID)REGION_ID: {IX, NotNull, INTEGER(10), FK to REGION, classification=Region} <br />
     * @return The value of the column 'REGION_ID'. (basically NotNull if selected: for the constraint)
     */
    def getRegionId(): Integer = {
        return _regionId;
    }

    /**
     * [set] (地域ID)REGION_ID: {IX, NotNull, INTEGER(10), FK to REGION, classification=Region} <br />
     * @param regionId The value of the column 'REGION_ID'. (basically NotNull if update: for the constraint)
     */
    protected def setRegionId(regionId: Integer): Unit = {
        checkClassificationCode("REGION_ID", CDef.DefMeta.Region, regionId);
        __modifiedProperties.addPropertyName("regionId");
        _regionId = regionId;
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

    /**
     * For framework so basically DON'T use this method.
     * @param regionId The value of the column 'REGION_ID'. (basically NotNull if update: for the constraint)
     */
    def mynativeMappingRegionId(regionId: Integer): Unit = {
        setRegionId(regionId);
    }
}
