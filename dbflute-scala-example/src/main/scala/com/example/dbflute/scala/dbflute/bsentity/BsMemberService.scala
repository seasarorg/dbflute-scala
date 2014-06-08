package com.example.dbflute.scala.dbflute.bsentity;

import scala.collection.immutable._;
import scala.collection.JavaConverters._;

import java.io.Serializable;
import java.util.Collection;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.Entity.FunCustodial;
import com.example.dbflute.scala.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.scala.dbflute.allcommon.CDef;
import com.example.dbflute.scala.dbflute.exentity._;

/**
 * The immutable entity of (会員サービス)MEMBER_SERVICE as TABLE. <br />
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
 * [get template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * val memberServiceId: Int = entity.memberServiceId
 * val memberId: Int = entity.memberId
 * val servicePointCount: Int = entity.servicePointCount
 * val serviceRankCode: CDef.ServiceRank = entity.serviceRankCode
 * val registerDatetime: java.sql.Timestamp = entity.registerDatetime
 * val registerUser: String = entity.registerUser
 * val updateDatetime: java.sql.Timestamp = entity.updateDatetime
 * val updateUser: String = entity.updateUser
 * val versionNo: Long = entity.versionNo
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
abstract class BsMemberService(dble: DbleMemberService) extends Serializable {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** (会員サービスID)MEMBER_SERVICE_ID: {PK, ID, NotNull, INTEGER(10)} */
    protected val _memberServiceId: Int = dble.getMemberServiceId;

    /** (会員ID)MEMBER_ID: {UQ, IX, NotNull, INTEGER(10), FK to MEMBER} */
    protected val _memberId: Int = dble.getMemberId;

    /** (サービスポイント数)SERVICE_POINT_COUNT: {IX, NotNull, INTEGER(10)} */
    protected val _servicePointCount: Int = dble.getServicePointCount;

    /** (サービスランクコード)SERVICE_RANK_CODE: {IX, NotNull, CHAR(3), FK to SERVICE_RANK, classification=ServiceRank} */
    protected val _serviceRankCode: CDef.ServiceRank = dble.getServiceRankCodeAsServiceRank;

    /** REGISTER_DATETIME: {NotNull, TIMESTAMP(23, 10)} */
    protected val _registerDatetime: java.sql.Timestamp = dble.getRegisterDatetime;

    /** REGISTER_USER: {NotNull, VARCHAR(200)} */
    protected val _registerUser: String = dble.getRegisterUser;

    /** UPDATE_DATETIME: {NotNull, TIMESTAMP(23, 10)} */
    protected val _updateDatetime: java.sql.Timestamp = dble.getUpdateDatetime;

    /** UPDATE_USER: {NotNull, VARCHAR(200)} */
    protected val _updateUser: String = dble.getUpdateUser;

    /** VERSION_NO: {NotNull, BIGINT(19)} */
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
         memberServiceId: Int = _memberServiceId
        , memberId: Int = _memberId
        , servicePointCount: Int = _servicePointCount
        , serviceRankCode: CDef.ServiceRank = _serviceRankCode
        , registerDatetime: java.sql.Timestamp = _registerDatetime
        , registerUser: String = _registerUser
        , updateDatetime: java.sql.Timestamp = _updateDatetime
        , updateUser: String = _updateUser
        , versionNo: Long = _versionNo
    ): MemberService = {
        val newDble = new DbleMemberService();
        newDble.myuniqueDrivenProperties.addAll(__uniqueDrivenProperties.asJava); // inherit
        newDble.modifiedProperties.addAll(__modifiedProperties.asJava); // inherit
        if (!memberServiceId.equals(_memberServiceId)) { newDble.setMemberServiceId(_memberServiceId); }
        if (!memberId.equals(_memberId)) { newDble.setMemberId(_memberId); }
        if (!servicePointCount.equals(_servicePointCount)) { newDble.setServicePointCount(_servicePointCount); }
        if (!serviceRankCode.equals(_serviceRankCode)) { newDble.setServiceRankCodeAsServiceRank(_serviceRankCode); }
        if (!registerDatetime.equals(_registerDatetime)) { newDble.setRegisterDatetime(_registerDatetime); }
        if (!registerUser.equals(_registerUser)) { newDble.setRegisterUser(_registerUser); }
        if (!updateDatetime.equals(_updateDatetime)) { newDble.setUpdateDatetime(_updateDatetime); }
        if (!updateUser.equals(_updateUser)) { newDble.setUpdateUser(_updateUser); }
        if (!versionNo.equals(_versionNo)) { newDble.setVersionNo(_versionNo); }
        return new MemberService(newDble);
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
     * Get the value of serviceRankCode as the classification of ServiceRank. <br />
     * (サービスランクコード)SERVICE_RANK_CODE: {IX, NotNull, CHAR(3), FK to SERVICE_RANK, classification=ServiceRank} <br />
     * rank of service member gets
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    def serviceRankCodeAsServiceRank: CDef.ServiceRank = { dble.getServiceRankCodeAsServiceRank }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of serviceRankCode Platinum? <br />
     * PLATINUM: platinum rank
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isServiceRankCode_Platinum: Boolean = { dble.isServiceRankCode_Platinum }

    /**
     * Is the value of serviceRankCode Gold? <br />
     * GOLD: gold rank
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isServiceRankCode_Gold: Boolean = { dble.isServiceRankCode_Gold }

    /**
     * Is the value of serviceRankCode Silver? <br />
     * SILVER: silver rank
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isServiceRankCode_Silver: Boolean = { dble.isServiceRankCode_Silver }

    /**
     * Is the value of serviceRankCode Bronze? <br />
     * BRONZE: bronze rank
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isServiceRankCode_Bronze: Boolean = { dble.isServiceRankCode_Bronze }

    /**
     * Is the value of serviceRankCode Plastic? <br />
     * PLASTIC: plastic rank
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isServiceRankCode_Plastic: Boolean = { dble.isServiceRankCode_Plastic }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** (会員)MEMBER by my MEMBER_ID, named 'member'. */
    protected val _member: Option[Member] = dble.toImmutableMember

    /**
     * [get] (会員)MEMBER by my MEMBER_ID, named 'member'.
     * @return The entity of foreign property 'member'. (EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    def member: Option[Member] = { _member }

    /** (サービスランク)SERVICE_RANK by my SERVICE_RANK_CODE, named 'serviceRank'. */
    protected val _serviceRank: Option[ServiceRank] = dble.toImmutableServiceRank

    /**
     * [get] (サービスランク)SERVICE_RANK by my SERVICE_RANK_CODE, named 'serviceRank'.
     * @return The entity of foreign property 'serviceRank'. (EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    def serviceRank: Option[ServiceRank] = { _serviceRank }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
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
            case obj: BsMemberService => {
                val other: BsMemberService = obj.asInstanceOf[BsMemberService];
                {
                     xSV(memberServiceId, other.memberServiceId)
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
     * [get] (会員サービスID)MEMBER_SERVICE_ID: {PK, ID, NotNull, INTEGER(10)} <br />
     * @return The value of the column 'MEMBER_SERVICE_ID'. (NotNull but EmptyAllowed if null in database)
     */
    def memberServiceId: Int = { return _memberServiceId; }

    /**
     * [get] (会員ID)MEMBER_ID: {UQ, IX, NotNull, INTEGER(10), FK to MEMBER} <br />
     * @return The value of the column 'MEMBER_ID'. (NotNull but EmptyAllowed if null in database)
     */
    def memberId: Int = { return _memberId; }

    /**
     * [get] (サービスポイント数)SERVICE_POINT_COUNT: {IX, NotNull, INTEGER(10)} <br />
     * @return The value of the column 'SERVICE_POINT_COUNT'. (NotNull but EmptyAllowed if null in database)
     */
    def servicePointCount: Int = { return _servicePointCount; }

    /**
     * [get] (サービスランクコード)SERVICE_RANK_CODE: {IX, NotNull, CHAR(3), FK to SERVICE_RANK, classification=ServiceRank} <br />
     * @return The value of the column 'SERVICE_RANK_CODE'. (NotNull but EmptyAllowed if null in database)
     */
    def serviceRankCode: CDef.ServiceRank = { return _serviceRankCode; }

    /**
     * [get] REGISTER_DATETIME: {NotNull, TIMESTAMP(23, 10)} <br />
     * @return The value of the column 'REGISTER_DATETIME'. (NotNull but EmptyAllowed if null in database)
     */
    def registerDatetime: java.sql.Timestamp = { return _registerDatetime; }

    /**
     * [get] REGISTER_USER: {NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'REGISTER_USER'. (NotNull but EmptyAllowed if null in database)
     */
    def registerUser: String = { return _registerUser; }

    /**
     * [get] UPDATE_DATETIME: {NotNull, TIMESTAMP(23, 10)} <br />
     * @return The value of the column 'UPDATE_DATETIME'. (NotNull but EmptyAllowed if null in database)
     */
    def updateDatetime: java.sql.Timestamp = { return _updateDatetime; }

    /**
     * [get] UPDATE_USER: {NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'UPDATE_USER'. (NotNull but EmptyAllowed if null in database)
     */
    def updateUser: String = { return _updateUser; }

    /**
     * [get] VERSION_NO: {NotNull, BIGINT(19)} <br />
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
 * The mutable entity of (会員サービス)MEMBER_SERVICE as TABLE. <br />
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * val memberServiceId: Int = entity.memberServiceId
 * val memberId: Int = entity.memberId
 * val servicePointCount: Int = entity.servicePointCount
 * val serviceRankCode: CDef.ServiceRank = entity.serviceRankCode
 * val registerDatetime: java.sql.Timestamp = entity.registerDatetime
 * val registerUser: String = entity.registerUser
 * val updateDatetime: java.sql.Timestamp = entity.updateDatetime
 * val updateUser: String = entity.updateUser
 * val versionNo: Long = entity.versionNo
 * entity.memberServiceId = memberServiceId
 * entity.memberId = memberId
 * entity.servicePointCount = servicePointCount
 * entity.serviceRankCode = serviceRankCode
 * entity.registerDatetime = registerDatetime
 * entity.registerUser = registerUser
 * entity.updateDatetime = updateDatetime
 * entity.updateUser = updateUser
 * entity.versionNo = versionNo
 * = = = = = = = = = =/
 * @author DBFlute(AutoGenerator)
 */
abstract class BsMbleMemberService {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    val dble: DbleMemberService = new DbleMemberService();

    // ===================================================================================
    //                                                                      DB-able Entity
    //                                                                      ==============
    def toDBableEntity(): DbleMemberService = { dble }

    // ===================================================================================
    //                                                                          Unique Key
    //                                                                          ==========
    /**
     * To be unique by the unique column. <br />
     * You can update the entity by the key when entity update (NOT batch update).
     * @param memberId (会員ID): UQ, IX, NotNull, INTEGER(10), FK to MEMBER. (NotNull)
     */
    def uniqueBy(memberId: Integer): Unit = { dble.setMemberId(memberId); }

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
    def serviceRankCodeAsServiceRank: CDef.ServiceRank = { dble.getServiceRankCodeAsServiceRank }

    /**
     * Set the value of serviceRankCode as the classification of ServiceRank. <br />
     * (サービスランクコード)SERVICE_RANK_CODE: {IX, NotNull, CHAR(3), FK to SERVICE_RANK, classification=ServiceRank} <br />
     * rank of service member gets
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    def serviceRankCodeAsServiceRank_=(cdef: CDef.ServiceRank): Unit = { dble.setServiceRankCodeAsServiceRank(cdef) }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of serviceRankCode as Platinum (PLT). <br />
     * PLATINUM: platinum rank
     */
    def serviceRankCode_Platinum: Unit = { dble.setServiceRankCode_Platinum }

    /**
     * Set the value of serviceRankCode as Gold (GLD). <br />
     * GOLD: gold rank
     */
    def serviceRankCode_Gold: Unit = { dble.setServiceRankCode_Gold }

    /**
     * Set the value of serviceRankCode as Silver (SIL). <br />
     * SILVER: silver rank
     */
    def serviceRankCode_Silver: Unit = { dble.setServiceRankCode_Silver }

    /**
     * Set the value of serviceRankCode as Bronze (BRZ). <br />
     * BRONZE: bronze rank
     */
    def serviceRankCode_Bronze: Unit = { dble.setServiceRankCode_Bronze }

    /**
     * Set the value of serviceRankCode as Plastic (PLS). <br />
     * PLASTIC: plastic rank
     */
    def serviceRankCode_Plastic: Unit = { dble.setServiceRankCode_Plastic }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of serviceRankCode Platinum? <br />
     * PLATINUM: platinum rank
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isServiceRankCode_Platinum: Boolean = { dble.isServiceRankCode_Platinum }

    /**
     * Is the value of serviceRankCode Gold? <br />
     * GOLD: gold rank
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isServiceRankCode_Gold: Boolean = { dble.isServiceRankCode_Gold }

    /**
     * Is the value of serviceRankCode Silver? <br />
     * SILVER: silver rank
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isServiceRankCode_Silver: Boolean = { dble.isServiceRankCode_Silver }

    /**
     * Is the value of serviceRankCode Bronze? <br />
     * BRONZE: bronze rank
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isServiceRankCode_Bronze: Boolean = { dble.isServiceRankCode_Bronze }

    /**
     * Is the value of serviceRankCode Plastic? <br />
     * PLASTIC: plastic rank
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isServiceRankCode_Plastic: Boolean = { dble.isServiceRankCode_Plastic }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (会員サービスID)MEMBER_SERVICE_ID: {PK, ID, NotNull, INTEGER(10)} <br />
     * @return The value of the column 'MEMBER_SERVICE_ID'. (basically NotNull if selected: for the constraint)
     */
    def memberServiceId: Int = { dble.getMemberServiceId }

    /**
     * [set] (会員サービスID)MEMBER_SERVICE_ID: {PK, ID, NotNull, INTEGER(10)} <br />
     * @param memberServiceId The value of the column 'MEMBER_SERVICE_ID'. (NullAllowed: null update allowed for no constraint)
     */
    def memberServiceId_=(memberServiceId: Int) = { dble.setMemberServiceId(memberServiceId) }

    /**
     * [get] (会員ID)MEMBER_ID: {UQ, IX, NotNull, INTEGER(10), FK to MEMBER} <br />
     * @return The value of the column 'MEMBER_ID'. (basically NotNull if selected: for the constraint)
     */
    def memberId: Int = { dble.getMemberId }

    /**
     * [set] (会員ID)MEMBER_ID: {UQ, IX, NotNull, INTEGER(10), FK to MEMBER} <br />
     * @param memberId The value of the column 'MEMBER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    def memberId_=(memberId: Int) = { dble.setMemberId(memberId) }

    /**
     * [get] (サービスポイント数)SERVICE_POINT_COUNT: {IX, NotNull, INTEGER(10)} <br />
     * @return The value of the column 'SERVICE_POINT_COUNT'. (basically NotNull if selected: for the constraint)
     */
    def servicePointCount: Int = { dble.getServicePointCount }

    /**
     * [set] (サービスポイント数)SERVICE_POINT_COUNT: {IX, NotNull, INTEGER(10)} <br />
     * @param servicePointCount The value of the column 'SERVICE_POINT_COUNT'. (NullAllowed: null update allowed for no constraint)
     */
    def servicePointCount_=(servicePointCount: Int) = { dble.setServicePointCount(servicePointCount) }

    /**
     * [get] (サービスランクコード)SERVICE_RANK_CODE: {IX, NotNull, CHAR(3), FK to SERVICE_RANK, classification=ServiceRank} <br />
     * @return The value of the column 'SERVICE_RANK_CODE'. (basically NotNull if selected: for the constraint)
     */
    def serviceRankCode: CDef.ServiceRank = { dble.getServiceRankCodeAsServiceRank }

    /**
     * [set] (サービスランクコード)SERVICE_RANK_CODE: {IX, NotNull, CHAR(3), FK to SERVICE_RANK, classification=ServiceRank} <br />
     * @param serviceRankCode The value of the column 'SERVICE_RANK_CODE'. (NullAllowed: null update allowed for no constraint)
     */
    protected def serviceRankCode_=(serviceRankCode: CDef.ServiceRank) = { dble.setServiceRankCodeAsServiceRank(serviceRankCode) }

    /**
     * [get] REGISTER_DATETIME: {NotNull, TIMESTAMP(23, 10)} <br />
     * @return The value of the column 'REGISTER_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    def registerDatetime: java.sql.Timestamp = { dble.getRegisterDatetime }

    /**
     * [set] REGISTER_DATETIME: {NotNull, TIMESTAMP(23, 10)} <br />
     * @param registerDatetime The value of the column 'REGISTER_DATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    def registerDatetime_=(registerDatetime: java.sql.Timestamp) = { dble.setRegisterDatetime(registerDatetime) }

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
    def updateDatetime: java.sql.Timestamp = { dble.getUpdateDatetime }

    /**
     * [set] UPDATE_DATETIME: {NotNull, TIMESTAMP(23, 10)} <br />
     * @param updateDatetime The value of the column 'UPDATE_DATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    def updateDatetime_=(updateDatetime: java.sql.Timestamp) = { dble.setUpdateDatetime(updateDatetime) }

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
