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
 * The immutable entity of (サービスランク)SERVICE_RANK as TABLE. <br />
 * <pre>
 * [primary-key]
 *     SERVICE_RANK_CODE
 * 
 * [column]
 *     SERVICE_RANK_CODE, SERVICE_RANK_NAME, SERVICE_POINT_INCIDENCE, NEW_ACCEPTABLE_FLG, DESCRIPTION, DISPLAY_ORDER
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
 *     MEMBER_SERVICE
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     memberServiceList
 * 
 * [get template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * val serviceRankCode: CDef.ServiceRank = entity.serviceRankCode
 * val serviceRankName: String = entity.serviceRankName
 * val servicePointIncidence: scala.math.BigDecimal = entity.servicePointIncidence
 * val newAcceptableFlg: CDef.Flg = entity.newAcceptableFlg
 * val description: String = entity.description
 * val displayOrder: Int = entity.displayOrder
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
abstract class BsServiceRank(dble: DbleServiceRank) extends Serializable {

    // ===================================================================================
    //                                                                           Case Like
    //                                                                           =========
    def copy(
         serviceRankCode: CDef.ServiceRank = serviceRankCode
        , serviceRankName: String = serviceRankName
        , servicePointIncidence: scala.math.BigDecimal = servicePointIncidence
        , newAcceptableFlg: CDef.Flg = newAcceptableFlg
        , description: String = description
        , displayOrder: Int = displayOrder
    ): ServiceRank = {
        val newDble = new DbleServiceRank
        newDble.myuniqueDrivenProperties.addAll(dble.myuniqueDrivenProperties) // inherit
        newDble.mymodifiedProperties.addAll(dble.mymodifiedProperties) // inherit
        if (!serviceRankCode.equals(this.serviceRankCode)) { newDble.setServiceRankCodeAsServiceRank(serviceRankCode) }
        if (!serviceRankName.equals(this.serviceRankName)) { newDble.setServiceRankName(serviceRankName) }
        if (!servicePointIncidence.equals(this.servicePointIncidence)) { newDble.setServicePointIncidence(servicePointIncidence.underlying) }
        if (!newAcceptableFlg.equals(this.newAcceptableFlg)) { newDble.setNewAcceptableFlgAsFlg(newAcceptableFlg) }
        if (!description.equals(this.description)) { newDble.setDescription(description) }
        if (!displayOrder.equals(this.displayOrder)) { newDble.setDisplayOrder(displayOrder) }
        new ServiceRank(newDble)
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
     * Get the value of serviceRankCode as the classification of ServiceRank. <br />
     * (サービスランクコード)SERVICE_RANK_CODE: {PK, NotNull, CHAR(3), classification=ServiceRank} <br />
     * rank of service member gets
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    def serviceRankCodeAsServiceRank: CDef.ServiceRank = { dble.getServiceRankCodeAsServiceRank }

    /**
     * Get the value of newAcceptableFlg as the classification of Flg. <br />
     * (新規受け入れ可能フラグ)NEW_ACCEPTABLE_FLG: {NotNull, INTEGER(10), classification=Flg} <br />
     * general boolean classification for every flg-column
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    def newAcceptableFlgAsFlg: CDef.Flg = { dble.getNewAcceptableFlgAsFlg }

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

    /**
     * Is the value of newAcceptableFlg True? <br />
     * Yes: means valid
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isNewAcceptableFlg_True: Boolean = { dble.isNewAcceptableFlg_True }

    /**
     * Is the value of newAcceptableFlg False? <br />
     * No: means invalid
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isNewAcceptableFlg_False: Boolean = { dble.isNewAcceptableFlg_False }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    /**
     * Get the value of the column 'newAcceptableFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    def newAcceptableFlgName: String = { dble.getNewAcceptableFlgName }

    /**
     * Get the value of the column 'newAcceptableFlg' as classification alias.
     * @return The string of classification alias. (NullAllowed: when the column value is null)
     */
    def newAcceptableFlgAlias: String = { dble.getNewAcceptableFlgAlias }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /**
     * [get] (会員サービス)MEMBER_SERVICE by SERVICE_RANK_CODE, named 'memberServiceList'.
     * @return The entity list of referrer property 'memberServiceList'. (NotNull: even if no loading, returns empty list)
     */
    def memberServiceList: List[MemberService] = { dble.toImmutableMemberServiceList }

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
            case obj: BsServiceRank => {
                val other: BsServiceRank = obj.asInstanceOf[BsServiceRank];
                {(
                     xSV(serviceRankCode, other.serviceRankCode)
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
     * [get] (サービスランクコード)SERVICE_RANK_CODE: {PK, NotNull, CHAR(3), classification=ServiceRank} <br />
     * @return The value of the column 'SERVICE_RANK_CODE'. (NotNull but EmptyAllowed if null in database)
     */
    def serviceRankCode: CDef.ServiceRank = { dble.getServiceRankCodeAsServiceRank }

    /**
     * [get] (サービスランク名称)SERVICE_RANK_NAME: {NotNull, VARCHAR(50)} <br />
     * @return The value of the column 'SERVICE_RANK_NAME'. (NotNull but EmptyAllowed if null in database)
     */
    def serviceRankName: String = { dble.getServiceRankName }

    /**
     * [get] (サービスポイント発生率)SERVICE_POINT_INCIDENCE: {NotNull, DECIMAL(5, 3)} <br />
     * @return The value of the column 'SERVICE_POINT_INCIDENCE'. (NotNull but EmptyAllowed if null in database)
     */
    def servicePointIncidence: scala.math.BigDecimal = { dble.getServicePointIncidence }

    /**
     * [get] (新規受け入れ可能フラグ)NEW_ACCEPTABLE_FLG: {NotNull, INTEGER(10), classification=Flg} <br />
     * @return The value of the column 'NEW_ACCEPTABLE_FLG'. (NotNull but EmptyAllowed if null in database)
     */
    def newAcceptableFlg: CDef.Flg = { dble.getNewAcceptableFlgAsFlg }

    /**
     * [get] (説明)DESCRIPTION: {NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'DESCRIPTION'. (NotNull but EmptyAllowed if null in database)
     */
    def description: String = { dble.getDescription }

    /**
     * [get] (表示順)DISPLAY_ORDER: {UQ, NotNull, INTEGER(10)} <br />
     * @return The value of the column 'DISPLAY_ORDER'. (NotNull but EmptyAllowed if null in database)
     */
    def displayOrder: Int = { dble.getDisplayOrder }
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
 * The mutable entity of (サービスランク)SERVICE_RANK as TABLE. <br />
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * val serviceRankCode: CDef.ServiceRank = entity.serviceRankCode
 * val serviceRankName: String = entity.serviceRankName
 * val servicePointIncidence: scala.math.BigDecimal = entity.servicePointIncidence
 * val newAcceptableFlg: CDef.Flg = entity.newAcceptableFlg
 * val description: String = entity.description
 * val displayOrder: Int = entity.displayOrder
 * entity.serviceRankCode = serviceRankCode
 * entity.serviceRankName = serviceRankName
 * entity.servicePointIncidence = servicePointIncidence
 * entity.newAcceptableFlg = newAcceptableFlg
 * entity.description = description
 * entity.displayOrder = displayOrder
 * = = = = = = = = = =/
 * @author DBFlute(AutoGenerator)
 */
abstract class BsMbleServiceRank {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected val dble: DbleServiceRank = new DbleServiceRank();

    // ===================================================================================
    //                                                                      DB-able Entity
    //                                                                      ==============
    def toDBable(): DbleServiceRank = { dble }

    // ===================================================================================
    //                                                                    Immutable Entity
    //                                                                    ================
    def toImmutable(): ServiceRank = { dble.toImmutable() }

    // ===================================================================================
    //                                                                          Unique Key
    //                                                                          ==========
    /**
     * To be unique by the unique column. <br />
     * You can update the entity by the key when entity update (NOT batch update).
     * @param displayOrder (表示順): UQ, NotNull, INTEGER(10). (NotNull)
     */
    def uniqueBy(displayOrder: Integer): Unit = { dble.setDisplayOrder(displayOrder); }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of serviceRankCode as the classification of ServiceRank. <br />
     * (サービスランクコード)SERVICE_RANK_CODE: {PK, NotNull, CHAR(3), classification=ServiceRank} <br />
     * rank of service member gets
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    def serviceRankCodeAsServiceRank: CDef.ServiceRank = { dble.getServiceRankCodeAsServiceRank }

    /**
     * Set the value of serviceRankCode as the classification of ServiceRank. <br />
     * (サービスランクコード)SERVICE_RANK_CODE: {PK, NotNull, CHAR(3), classification=ServiceRank} <br />
     * rank of service member gets
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    def serviceRankCodeAsServiceRank_=(cdef: CDef.ServiceRank): Unit = { dble.setServiceRankCodeAsServiceRank(cdef) }

    /**
     * Get the value of newAcceptableFlg as the classification of Flg. <br />
     * (新規受け入れ可能フラグ)NEW_ACCEPTABLE_FLG: {NotNull, INTEGER(10), classification=Flg} <br />
     * general boolean classification for every flg-column
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    def newAcceptableFlgAsFlg: CDef.Flg = { dble.getNewAcceptableFlgAsFlg }

    /**
     * Set the value of newAcceptableFlg as the classification of Flg. <br />
     * (新規受け入れ可能フラグ)NEW_ACCEPTABLE_FLG: {NotNull, INTEGER(10), classification=Flg} <br />
     * general boolean classification for every flg-column
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    def newAcceptableFlgAsFlg_=(cdef: CDef.Flg): Unit = { dble.setNewAcceptableFlgAsFlg(cdef) }

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

    /**
     * Set the value of newAcceptableFlg as True (1). <br />
     * Yes: means valid
     */
    def newAcceptableFlg_True: Unit = { dble.setNewAcceptableFlg_True }

    /**
     * Set the value of newAcceptableFlg as False (0). <br />
     * No: means invalid
     */
    def newAcceptableFlg_False: Unit = { dble.setNewAcceptableFlg_False }

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

    /**
     * Is the value of newAcceptableFlg True? <br />
     * Yes: means valid
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isNewAcceptableFlg_True: Boolean = { dble.isNewAcceptableFlg_True }

    /**
     * Is the value of newAcceptableFlg False? <br />
     * No: means invalid
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isNewAcceptableFlg_False: Boolean = { dble.isNewAcceptableFlg_False }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (サービスランクコード)SERVICE_RANK_CODE: {PK, NotNull, CHAR(3), classification=ServiceRank} <br />
     * @return The value of the column 'SERVICE_RANK_CODE'. (basically NotNull if selected: for the constraint)
     */
    def serviceRankCode: CDef.ServiceRank = { dble.getServiceRankCodeAsServiceRank }

    /**
     * [set] (サービスランクコード)SERVICE_RANK_CODE: {PK, NotNull, CHAR(3), classification=ServiceRank} <br />
     * @param serviceRankCode The value of the column 'SERVICE_RANK_CODE'. (NullAllowed: null update allowed for no constraint)
     */
    protected def serviceRankCode_=(serviceRankCode: CDef.ServiceRank) = { dble.setServiceRankCodeAsServiceRank(serviceRankCode) }

    /**
     * [get] (サービスランク名称)SERVICE_RANK_NAME: {NotNull, VARCHAR(50)} <br />
     * @return The value of the column 'SERVICE_RANK_NAME'. (basically NotNull if selected: for the constraint)
     */
    def serviceRankName: String = { dble.getServiceRankName }

    /**
     * [set] (サービスランク名称)SERVICE_RANK_NAME: {NotNull, VARCHAR(50)} <br />
     * @param serviceRankName The value of the column 'SERVICE_RANK_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    def serviceRankName_=(serviceRankName: String) = { dble.setServiceRankName(serviceRankName) }

    /**
     * [get] (サービスポイント発生率)SERVICE_POINT_INCIDENCE: {NotNull, DECIMAL(5, 3)} <br />
     * @return The value of the column 'SERVICE_POINT_INCIDENCE'. (basically NotNull if selected: for the constraint)
     */
    def servicePointIncidence: scala.math.BigDecimal = { dble.getServicePointIncidence }

    /**
     * [set] (サービスポイント発生率)SERVICE_POINT_INCIDENCE: {NotNull, DECIMAL(5, 3)} <br />
     * @param servicePointIncidence The value of the column 'SERVICE_POINT_INCIDENCE'. (NullAllowed: null update allowed for no constraint)
     */
    def servicePointIncidence_=(servicePointIncidence: scala.math.BigDecimal) = { dble.setServicePointIncidence(servicePointIncidence.underlying) }

    /**
     * [get] (新規受け入れ可能フラグ)NEW_ACCEPTABLE_FLG: {NotNull, INTEGER(10), classification=Flg} <br />
     * @return The value of the column 'NEW_ACCEPTABLE_FLG'. (basically NotNull if selected: for the constraint)
     */
    def newAcceptableFlg: CDef.Flg = { dble.getNewAcceptableFlgAsFlg }

    /**
     * [set] (新規受け入れ可能フラグ)NEW_ACCEPTABLE_FLG: {NotNull, INTEGER(10), classification=Flg} <br />
     * @param newAcceptableFlg The value of the column 'NEW_ACCEPTABLE_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    protected def newAcceptableFlg_=(newAcceptableFlg: CDef.Flg) = { dble.setNewAcceptableFlgAsFlg(newAcceptableFlg) }

    /**
     * [get] (説明)DESCRIPTION: {NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'DESCRIPTION'. (basically NotNull if selected: for the constraint)
     */
    def description: String = { dble.getDescription }

    /**
     * [set] (説明)DESCRIPTION: {NotNull, VARCHAR(200)} <br />
     * @param description The value of the column 'DESCRIPTION'. (NullAllowed: null update allowed for no constraint)
     */
    def description_=(description: String) = { dble.setDescription(description) }

    /**
     * [get] (表示順)DISPLAY_ORDER: {UQ, NotNull, INTEGER(10)} <br />
     * @return The value of the column 'DISPLAY_ORDER'. (basically NotNull if selected: for the constraint)
     */
    def displayOrder: Int = { dble.getDisplayOrder }

    /**
     * [set] (表示順)DISPLAY_ORDER: {UQ, NotNull, INTEGER(10)} <br />
     * @param displayOrder The value of the column 'DISPLAY_ORDER'. (NullAllowed: null update allowed for no constraint)
     */
    def displayOrder_=(displayOrder: Int) = { dble.setDisplayOrder(displayOrder) }
}
