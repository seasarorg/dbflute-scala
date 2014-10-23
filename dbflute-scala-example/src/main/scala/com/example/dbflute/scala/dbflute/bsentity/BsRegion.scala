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
 * The immutable entity of (地域)REGION as TABLE. <br />
 * <pre>
 * [primary-key]
 *     REGION_ID
 * 
 * [column]
 *     REGION_ID, REGION_NAME
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
 *     MEMBER_ADDRESS
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     memberAddressList
 * 
 * [get template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * val regionId: CDef.Region = entity.regionId
 * val regionName: String = entity.regionName
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
abstract class BsRegion(dble: DbleRegion) extends Serializable {

    // ===================================================================================
    //                                                                           Case Like
    //                                                                           =========
    def copy(
         regionId: CDef.Region = regionId
        , regionName: String = regionName
    ): Region = {
        val newDble = new DbleRegion
        newDble.myuniqueDrivenProperties.addAll(dble.myuniqueDrivenProperties) // inherit
        newDble.mymodifiedProperties.addAll(dble.mymodifiedProperties) // inherit
        if (!regionId.equals(this.regionId)) { newDble.setRegionIdAsRegion(regionId) }
        if (!regionName.equals(this.regionName)) { newDble.setRegionName(regionName) }
        new Region(newDble)
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
     * (地域ID)REGION_ID: {PK, NotNull, INTEGER(10), classification=Region} <br />
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
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /**
     * [get] (会員住所情報)MEMBER_ADDRESS by REGION_ID, named 'memberAddressList'.
     * @return The entity list of referrer property 'memberAddressList'. (NotNull: even if no loading, returns empty list)
     */
    def memberAddressList: List[MemberAddress] = { dble.toImmutableMemberAddressList }

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
            case obj: BsRegion => {
                val other: BsRegion = obj.asInstanceOf[BsRegion];
                {(
                     xSV(regionId, other.regionId)
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
     * [get] (地域ID)REGION_ID: {PK, NotNull, INTEGER(10), classification=Region} <br />
     * @return The value of the column 'REGION_ID'. (NotNull but EmptyAllowed if null in database)
     */
    def regionId: CDef.Region = { dble.getRegionIdAsRegion }

    /**
     * [get] (地域名称)REGION_NAME: {NotNull, VARCHAR(50)} <br />
     * @return The value of the column 'REGION_NAME'. (NotNull but EmptyAllowed if null in database)
     */
    def regionName: String = { dble.getRegionName }
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
 * The mutable entity of (地域)REGION as TABLE. <br />
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * val regionId: CDef.Region = entity.regionId
 * val regionName: String = entity.regionName
 * entity.regionId = regionId
 * entity.regionName = regionName
 * = = = = = = = = = =/
 * @author DBFlute(AutoGenerator)
 */
abstract class BsMbleRegion {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected val dble: DbleRegion = new DbleRegion();

    // ===================================================================================
    //                                                                      DB-able Entity
    //                                                                      ==============
    def toDBable(): DbleRegion = { dble }

    // ===================================================================================
    //                                                                    Immutable Entity
    //                                                                    ================
    def toImmutable(): Region = { dble.toImmutable() }

    // ===================================================================================
    //                                                                          Unique Key
    //                                                                          ==========
    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of regionId as the classification of Region. <br />
     * (地域ID)REGION_ID: {PK, NotNull, INTEGER(10), classification=Region} <br />
     * mainly region of member address
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    def regionIdAsRegion: CDef.Region = { dble.getRegionIdAsRegion }

    /**
     * Set the value of regionId as the classification of Region. <br />
     * (地域ID)REGION_ID: {PK, NotNull, INTEGER(10), classification=Region} <br />
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
     * [get] (地域ID)REGION_ID: {PK, NotNull, INTEGER(10), classification=Region} <br />
     * @return The value of the column 'REGION_ID'. (basically NotNull if selected: for the constraint)
     */
    def regionId: CDef.Region = { dble.getRegionIdAsRegion }

    /**
     * [set] (地域ID)REGION_ID: {PK, NotNull, INTEGER(10), classification=Region} <br />
     * @param regionId The value of the column 'REGION_ID'. (NullAllowed: null update allowed for no constraint)
     */
    protected def regionId_=(regionId: CDef.Region) = { dble.setRegionIdAsRegion(regionId) }

    /**
     * [get] (地域名称)REGION_NAME: {NotNull, VARCHAR(50)} <br />
     * @return The value of the column 'REGION_NAME'. (basically NotNull if selected: for the constraint)
     */
    def regionName: String = { dble.getRegionName }

    /**
     * [set] (地域名称)REGION_NAME: {NotNull, VARCHAR(50)} <br />
     * @param regionName The value of the column 'REGION_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    def regionName_=(regionName: String) = { dble.setRegionName(regionName) }
}
