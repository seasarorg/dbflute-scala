package com.example.dbflute.scala.dbflute.bsentity;

import scala.collection.JavaConverters._

import java.lang.Long;
import java.io.Serializable;
import java.util.Set;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.Entity.EntityUniqueDrivenProperties;
import org.seasar.dbflute.Entity.EntityModifiedProperties;
import org.seasar.dbflute.Entity.FunCustodial;
import org.seasar.dbflute.helper.beans.DfCoupleProperties;
import com.example.dbflute.scala.dbflute.allcommon.EntityDefinedCommonColumn;
import com.example.dbflute.scala.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.scala.dbflute.allcommon.CDef;
import com.example.dbflute.scala.dbflute.exentity._;

/**
 * The entity of (会員サービス)MEMBER_SERVICE as TABLE. <br />
 * <pre>
 * [primary-key]
 *     MEMBER_SERVICE_ID
 * 
 * [column]
 *     MEMBER_SERVICE_ID, MEMBER_ID, SERVICE_POINT_COUNT, SERVICE_RANK_CODE, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     MEMBER_SERVICE_ID
 * 
 * [version-no]
 *     VERSION_NO
 * 
 * [foreign table]
 *     MEMBER, SERVICE_RANK
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     member, serviceRank
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer memberServiceId = entity.getMemberServiceId();
 * Integer memberId = entity.getMemberId();
 * Integer servicePointCount = entity.getServicePointCount();
 * String serviceRankCode = entity.getServiceRankCode();
 * java.sql.Timestamp registerDatetime = entity.getRegisterDatetime();
 * String registerUser = entity.getRegisterUser();
 * java.sql.Timestamp updateDatetime = entity.getUpdateDatetime();
 * String updateUser = entity.getUpdateUser();
 * Long versionNo = entity.getVersionNo();
 * entity.setMemberServiceId(memberServiceId);
 * entity.setMemberId(memberId);
 * entity.setServicePointCount(servicePointCount);
 * entity.setServiceRankCode(serviceRankCode);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterUser(registerUser);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateUser(updateUser);
 * entity.setVersionNo(versionNo);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
abstract class BsMbleMemberService extends EntityDefinedCommonColumn with Serializable with Cloneable with DfCoupleProperties {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** (会員サービスID)MEMBER_SERVICE_ID: {PK, ID, NotNull, INTEGER(10)} */
    protected var _memberServiceId: Integer = null;

    /** (会員ID)MEMBER_ID: {UQ, IX, NotNull, INTEGER(10), FK to MEMBER} */
    protected var _memberId: Integer = null;

    /** (サービスポイント数)SERVICE_POINT_COUNT: {IX, NotNull, INTEGER(10)} */
    protected var _servicePointCount: Integer = null;

    /** (サービスランクコード)SERVICE_RANK_CODE: {IX, NotNull, CHAR(3), FK to SERVICE_RANK, classification=ServiceRank} */
    protected var _serviceRankCode: String = null;

    /** REGISTER_DATETIME: {NotNull, TIMESTAMP(23, 10)} */
    protected var _registerDatetime: java.sql.Timestamp = null;

    /** REGISTER_USER: {NotNull, VARCHAR(200)} */
    protected var _registerUser: String = null;

    /** UPDATE_DATETIME: {NotNull, TIMESTAMP(23, 10)} */
    protected var _updateDatetime: java.sql.Timestamp = null;

    /** UPDATE_USER: {NotNull, VARCHAR(200)} */
    protected var _updateUser: String = null;

    /** VERSION_NO: {NotNull, BIGINT(19)} */
    protected var _versionNo: Long = null;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The unique-driven properties for this entity. (NotNull) */
    protected val __uniqueDrivenProperties: EntityUniqueDrivenProperties = newUniqueDrivenProperties();

    /** The modified properties for this entity. (NotNull) */
    protected val __modifiedProperties: EntityModifiedProperties = newModifiedProperties();

    /** Is common column auto set up effective? */
    protected var __canCommonColumnAutoSetup: Boolean = true;

    /** Is the entity created by DBFlute select process? */
    protected var __createdBySelect: Boolean = false;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    def getTableDbName(): String = {
        return "MEMBER_SERVICE";
    }

    /**
     * {@inheritDoc}
     */
    def getTablePropertyName(): String = { // according to Java Beans rule
        return "memberService";
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
    def hasPrimaryKeyValue(): Boolean = {
        if (memberServiceId() == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br />
     * You can update the entity by the key when entity update (NOT batch update).
     * @param memberId (会員ID): UQ, IX, NotNull, INTEGER(10), FK to MEMBER. (NotNull)
     */
    def uniqueBy(memberId: Integer): Unit = {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("memberId");
        this.memberId(memberId);
    }

    /**
     * {@inheritDoc}
     */
    def myuniqueDrivenProperties(): Set[String] = {
        return __uniqueDrivenProperties.getPropertyNames();
    }

    def newUniqueDrivenProperties(): EntityUniqueDrivenProperties = {
        return new EntityUniqueDrivenProperties();
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of serviceRankCode as the classification of ServiceRank. <br />
     * (サービスランクコード)SERVICE_RANK_CODE: {IX, NotNull, CHAR(3), FK to SERVICE_RANK, classification=ServiceRank} <br />
     * rank of service member gets
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    def serviceRankCodeAsServiceRank(): CDef.ServiceRank = {
        return CDef.ServiceRank.codeOf(serviceRankCode());
    }

    /**
     * Set the value of serviceRankCode as the classification of ServiceRank. <br />
     * (サービスランクコード)SERVICE_RANK_CODE: {IX, NotNull, CHAR(3), FK to SERVICE_RANK, classification=ServiceRank} <br />
     * rank of service member gets
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    def serviceRankCodeAsServiceRank(cdef: CDef.ServiceRank): Unit = {
        serviceRankCode(if (cdef != null) { cdef.code } else { null });
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of serviceRankCode as Platinum (PLT). <br />
     * PLATINUM: platinum rank
     */
    def serviceRankCode_Platinum(): Unit = {
        serviceRankCodeAsServiceRank(CDef.ServiceRank.Platinum);
    }

    /**
     * Set the value of serviceRankCode as Gold (GLD). <br />
     * GOLD: gold rank
     */
    def serviceRankCode_Gold(): Unit = {
        serviceRankCodeAsServiceRank(CDef.ServiceRank.Gold);
    }

    /**
     * Set the value of serviceRankCode as Silver (SIL). <br />
     * SILVER: silver rank
     */
    def serviceRankCode_Silver(): Unit = {
        serviceRankCodeAsServiceRank(CDef.ServiceRank.Silver);
    }

    /**
     * Set the value of serviceRankCode as Bronze (BRZ). <br />
     * BRONZE: bronze rank
     */
    def serviceRankCode_Bronze(): Unit = {
        serviceRankCodeAsServiceRank(CDef.ServiceRank.Bronze);
    }

    /**
     * Set the value of serviceRankCode as Plastic (PLS). <br />
     * PLASTIC: plastic rank
     */
    def serviceRankCode_Plastic(): Unit = {
        serviceRankCodeAsServiceRank(CDef.ServiceRank.Plastic);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of serviceRankCode Platinum? <br />
     * PLATINUM: platinum rank
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isServiceRankCode_Platinum(): Boolean = {
        val cdef: CDef.ServiceRank = serviceRankCodeAsServiceRank();
        return if (cdef != null) { cdef.equals(CDef.ServiceRank.Platinum) } else { false };
    }

    /**
     * Is the value of serviceRankCode Gold? <br />
     * GOLD: gold rank
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isServiceRankCode_Gold(): Boolean = {
        val cdef: CDef.ServiceRank = serviceRankCodeAsServiceRank();
        return if (cdef != null) { cdef.equals(CDef.ServiceRank.Gold) } else { false };
    }

    /**
     * Is the value of serviceRankCode Silver? <br />
     * SILVER: silver rank
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isServiceRankCode_Silver(): Boolean = {
        val cdef: CDef.ServiceRank = serviceRankCodeAsServiceRank();
        return if (cdef != null) { cdef.equals(CDef.ServiceRank.Silver) } else { false };
    }

    /**
     * Is the value of serviceRankCode Bronze? <br />
     * BRONZE: bronze rank
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isServiceRankCode_Bronze(): Boolean = {
        val cdef: CDef.ServiceRank = serviceRankCodeAsServiceRank();
        return if (cdef != null) { cdef.equals(CDef.ServiceRank.Bronze) } else { false };
    }

    /**
     * Is the value of serviceRankCode Plastic? <br />
     * PLASTIC: plastic rank
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isServiceRankCode_Plastic(): Boolean = {
        val cdef: CDef.ServiceRank = serviceRankCodeAsServiceRank();
        return if (cdef != null) { cdef.equals(CDef.ServiceRank.Plastic) } else { false };
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** (会員)MEMBER by my MEMBER_ID, named 'member'. */
    protected var _member: Option[MbleMember] = null;

    /**
     * (会員)MEMBER by my MEMBER_ID, named 'member'.
     * @return The entity of foreign property 'member'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    def member(): Option[MbleMember] = {
        return if (_member != null) { _member; } else { Option.empty; }
    }

    /**
     * (会員)MEMBER by my MEMBER_ID, named 'member'.
     * @param member The entity of foreign property 'member'. (NullAllowed)
     */
    def member(member: Option[MbleMember]): Unit = {
        _member = member;
    }

    /** (サービスランク)SERVICE_RANK by my SERVICE_RANK_CODE, named 'serviceRank'. */
    protected var _serviceRank: Option[MbleServiceRank] = null;

    /**
     * (サービスランク)SERVICE_RANK by my SERVICE_RANK_CODE, named 'serviceRank'.
     * @return The entity of foreign property 'serviceRank'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    def serviceRank(): Option[MbleServiceRank] = {
        return if (_serviceRank != null) { _serviceRank; } else { Option.empty; }
    }

    /**
     * (サービスランク)SERVICE_RANK by my SERVICE_RANK_CODE, named 'serviceRank'.
     * @param serviceRank The entity of foreign property 'serviceRank'. (NullAllowed)
     */
    def serviceRank(serviceRank: Option[MbleServiceRank]): Unit = {
        _serviceRank = serviceRank;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected def newReferrerList[ELEMENT](): scala.collection.immutable.List[ELEMENT] = {
        return scala.collection.immutable.List(); // #pending actually fixed empty list
    }

    // ===================================================================================
    //                                                                 Modified Properties
    //                                                                 ===================
    /**
     * {@inheritDoc}
     */
    def modifiedProperties(): Set[String] = {
        return __modifiedProperties.getPropertyNames();
    }

    /**
     * {@inheritDoc}
     */
    def clearModifiedInfo(): Unit = {
        __modifiedProperties.clear();
    }

    /**
     * {@inheritDoc}
     */
    def hasModification(): Boolean = {
        return !__modifiedProperties.isEmpty();
    }

    protected def newModifiedProperties(): EntityModifiedProperties = {
        return new EntityModifiedProperties();
    }

    // ===================================================================================
    //                                                                     Birthplace Mark
    //                                                                     ===============
    /**
     * {@inheritDoc}
     */
    def markAsSelect(): Unit = {
        __createdBySelect = true;
    }

    /**
     * {@inheritDoc}
     */
    def createdBySelect(): Boolean = {
        return __createdBySelect;
    }

    // ===================================================================================
    //                                                                       Common Column
    //                                                                       =============
    /**
     * {@inheritDoc}
     */
    def enableCommonColumnAutoSetup(): Unit = {
        __canCommonColumnAutoSetup = true;
    }

    /**
     * {@inheritDoc}
     */
    def disableCommonColumnAutoSetup(): Unit = {
        __canCommonColumnAutoSetup = false;
    }

    /**
     * {@inheritDoc}
     */
    def canCommonColumnAutoSetup(): Boolean = {
        return __canCommonColumnAutoSetup;
    }

    // ===================================================================================
    //                                                                    Immutable Entity
    //                                                                    ================
    def toImmutable(): MemberService = {
        return new MemberService(this.asInstanceOf[MbleMemberService]);
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
    override def equals(obj: Any) = {
        obj match {
            case obj: BsMbleMemberService => {
                val other: BsMbleMemberService = obj.asInstanceOf[BsMbleMemberService];
                {
                     xSV(memberServiceId(), other.memberServiceId())
                }
            }
            case _ => false
        }
    }
    protected def xSV(v1: Object, v2: Object): Boolean = {
        return FunCustodial.isSameValue(v1, v2);
    }

    /**
     * Calculate the hash-code from primary-keys or columns.
     * @return The hash-code from primary-key or columns.
     */
    override def hashCode(): Int = {
        var hs: Int = 17;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, memberServiceId());
        return hs;
    }
    protected def xCH(hs: Int, value: Object): Int = {
        return FunCustodial.calculateHashcode(hs, value);
    }

    /**
     * {@inheritDoc}
     */
    def instanceHash(): Int = {
        return super.hashCode();
    }

    /**
     * Convert to display string of entity's data. (no relation data)
     * @return The display string of all columns and relation existences. (NotNull)
     */
    override def toString(): String = {
        return buildDisplayString(FunCustodial.toClassTitle(this), true, true);
    }

    /**
     * {@inheritDoc}
     */
    def toStringWithRelation(): String = {
        val sb: StringBuilder = new StringBuilder();
        sb.append(toString());
        val li: String = "\n  ";
        if (_member != null)
        { sb.append(li).append(xbRDS(_member, "member")); }
        if (_serviceRank != null)
        { sb.append(li).append(xbRDS(_serviceRank, "serviceRank")); }
        return sb.toString();
    }
    protected def xbRDS(et: Entity, name: String): String = {
        return et.buildDisplayString(name, true, true);
    }
    protected def xbRDS[ET <: Entity](et: Option[ET], name: String): String = {
        return et.get.buildDisplayString(name, true, true);
    }

    /**
     * {@inheritDoc}
     */
    def buildDisplayString(name: String, column: Boolean, relation: Boolean): String = {
        val sb: StringBuilder = new StringBuilder();
        if (name != null) { sb.append(name).append(if (column || relation) { ":" } else { "" }); }
        if (column) { sb.append(buildColumnString()); }
        if (relation) { sb.append(buildRelationString()); }
        sb.append("@").append(Integer.toHexString(hashCode()));
        return sb.toString();
    }
    protected def buildColumnString(): String = {
        val sb: StringBuilder = new StringBuilder();
        val dm: String = ", ";
        sb.append(dm).append(memberServiceId());
        sb.append(dm).append(memberId());
        sb.append(dm).append(servicePointCount());
        sb.append(dm).append(serviceRankCode());
        sb.append(dm).append(registerDatetime());
        sb.append(dm).append(registerUser());
        sb.append(dm).append(updateDatetime());
        sb.append(dm).append(updateUser());
        sb.append(dm).append(versionNo());
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected def buildRelationString(): String = {
        val sb: StringBuilder = new StringBuilder();
        val cm: String = ",  ";
        if (_member != null) { sb.append(cm).append("member"); }
        if (_serviceRank != null) { sb.append(cm).append("serviceRank"); }
        if (sb.length() > cm.length()) {
            sb.delete(0, cm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    override def clone(): MbleMemberService = {
        try {
            return super.clone().asInstanceOf[MbleMemberService];
        } catch {
            case e: CloneNotSupportedException => {
                throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
            }
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (会員サービスID)MEMBER_SERVICE_ID: {PK, ID, NotNull, INTEGER(10)} <br />
     * @return The value of the column 'MEMBER_SERVICE_ID'. (basically NotNull if selected: for the constraint)
     */
    def memberServiceId(): Integer = {
        return _memberServiceId;
    }

    /**
     * [set] (会員サービスID)MEMBER_SERVICE_ID: {PK, ID, NotNull, INTEGER(10)} <br />
     * @param memberServiceId The value of the column 'MEMBER_SERVICE_ID'. (basically NotNull if update: for the constraint)
     */
    def memberServiceId(memberServiceId: Integer): Unit = {
        __modifiedProperties.addPropertyName("memberServiceId");
        this._memberServiceId = memberServiceId;
    }

    /**
     * [get] (会員ID)MEMBER_ID: {UQ, IX, NotNull, INTEGER(10), FK to MEMBER} <br />
     * @return The value of the column 'MEMBER_ID'. (basically NotNull if selected: for the constraint)
     */
    def memberId(): Integer = {
        return _memberId;
    }

    /**
     * [set] (会員ID)MEMBER_ID: {UQ, IX, NotNull, INTEGER(10), FK to MEMBER} <br />
     * @param memberId The value of the column 'MEMBER_ID'. (basically NotNull if update: for the constraint)
     */
    def memberId(memberId: Integer): Unit = {
        __modifiedProperties.addPropertyName("memberId");
        this._memberId = memberId;
    }

    /**
     * [get] (サービスポイント数)SERVICE_POINT_COUNT: {IX, NotNull, INTEGER(10)} <br />
     * @return The value of the column 'SERVICE_POINT_COUNT'. (basically NotNull if selected: for the constraint)
     */
    def servicePointCount(): Integer = {
        return _servicePointCount;
    }

    /**
     * [set] (サービスポイント数)SERVICE_POINT_COUNT: {IX, NotNull, INTEGER(10)} <br />
     * @param servicePointCount The value of the column 'SERVICE_POINT_COUNT'. (basically NotNull if update: for the constraint)
     */
    def servicePointCount(servicePointCount: Integer): Unit = {
        __modifiedProperties.addPropertyName("servicePointCount");
        this._servicePointCount = servicePointCount;
    }

    /**
     * [get] (サービスランクコード)SERVICE_RANK_CODE: {IX, NotNull, CHAR(3), FK to SERVICE_RANK, classification=ServiceRank} <br />
     * @return The value of the column 'SERVICE_RANK_CODE'. (basically NotNull if selected: for the constraint)
     */
    def serviceRankCode(): String = {
        return convertEmptyToNull(_serviceRankCode);
    }

    /**
     * [set] (サービスランクコード)SERVICE_RANK_CODE: {IX, NotNull, CHAR(3), FK to SERVICE_RANK, classification=ServiceRank} <br />
     * @param serviceRankCode The value of the column 'SERVICE_RANK_CODE'. (basically NotNull if update: for the constraint)
     */
    def serviceRankCode(serviceRankCode: String): Unit = {
        __modifiedProperties.addPropertyName("serviceRankCode");
        this._serviceRankCode = serviceRankCode;
    }

    /**
     * [get] REGISTER_DATETIME: {NotNull, TIMESTAMP(23, 10)} <br />
     * @return The value of the column 'REGISTER_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    def registerDatetime(): java.sql.Timestamp = {
        return _registerDatetime;
    }

    /**
     * [set] REGISTER_DATETIME: {NotNull, TIMESTAMP(23, 10)} <br />
     * @param registerDatetime The value of the column 'REGISTER_DATETIME'. (basically NotNull if update: for the constraint)
     */
    def registerDatetime(registerDatetime: java.sql.Timestamp): Unit = {
        __modifiedProperties.addPropertyName("registerDatetime");
        this._registerDatetime = registerDatetime;
    }

    /**
     * [get] REGISTER_USER: {NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'REGISTER_USER'. (basically NotNull if selected: for the constraint)
     */
    def registerUser(): String = {
        return convertEmptyToNull(_registerUser);
    }

    /**
     * [set] REGISTER_USER: {NotNull, VARCHAR(200)} <br />
     * @param registerUser The value of the column 'REGISTER_USER'. (basically NotNull if update: for the constraint)
     */
    def registerUser(registerUser: String): Unit = {
        __modifiedProperties.addPropertyName("registerUser");
        this._registerUser = registerUser;
    }

    /**
     * [get] UPDATE_DATETIME: {NotNull, TIMESTAMP(23, 10)} <br />
     * @return The value of the column 'UPDATE_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    def updateDatetime(): java.sql.Timestamp = {
        return _updateDatetime;
    }

    /**
     * [set] UPDATE_DATETIME: {NotNull, TIMESTAMP(23, 10)} <br />
     * @param updateDatetime The value of the column 'UPDATE_DATETIME'. (basically NotNull if update: for the constraint)
     */
    def updateDatetime(updateDatetime: java.sql.Timestamp): Unit = {
        __modifiedProperties.addPropertyName("updateDatetime");
        this._updateDatetime = updateDatetime;
    }

    /**
     * [get] UPDATE_USER: {NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'UPDATE_USER'. (basically NotNull if selected: for the constraint)
     */
    def updateUser(): String = {
        return convertEmptyToNull(_updateUser);
    }

    /**
     * [set] UPDATE_USER: {NotNull, VARCHAR(200)} <br />
     * @param updateUser The value of the column 'UPDATE_USER'. (basically NotNull if update: for the constraint)
     */
    def updateUser(updateUser: String): Unit = {
        __modifiedProperties.addPropertyName("updateUser");
        this._updateUser = updateUser;
    }

    /**
     * [get] VERSION_NO: {NotNull, BIGINT(19)} <br />
     * @return The value of the column 'VERSION_NO'. (basically NotNull if selected: for the constraint)
     */
    def versionNo(): Long = {
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {NotNull, BIGINT(19)} <br />
     * @param versionNo The value of the column 'VERSION_NO'. (basically NotNull if update: for the constraint)
     */
    def versionNo(versionNo: Long): Unit = {
        __modifiedProperties.addPropertyName("versionNo");
        this._versionNo = versionNo;
    }

    protected def convertEmptyToNull(value: String): String = {
        return FunCustodial.convertEmptyToNull(value);
    }
}
