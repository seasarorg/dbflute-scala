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
 * The immutable entity of VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN as TABLE. <br />
 * <pre>
 * [primary-key]
 *     THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID
 * 
 * [column]
 *     THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID, THE_LONG_AND_WINDING_TABLE_AND_COLUMN_NAME, SHORT_NAME, SHORT_SIZE
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
 *     VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     vendorTheLongAndWindingTableAndColumnRefList
 * 
 * [get template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * val theLongAndWindingTableAndColumnId: Long = entity.theLongAndWindingTableAndColumnId
 * val theLongAndWindingTableAndColumnName: String = entity.theLongAndWindingTableAndColumnName
 * val shortName: String = entity.shortName
 * val shortSize: Int = entity.shortSize
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
abstract class BsVendorTheLongAndWindingTableAndColumn(dble: DbleVendorTheLongAndWindingTableAndColumn) extends Serializable {

    // ===================================================================================
    //                                                                           Case Like
    //                                                                           =========
    def copy(
         theLongAndWindingTableAndColumnId: Long = theLongAndWindingTableAndColumnId
        , theLongAndWindingTableAndColumnName: String = theLongAndWindingTableAndColumnName
        , shortName: String = shortName
        , shortSize: Int = shortSize
    ): VendorTheLongAndWindingTableAndColumn = {
        val newDble = new DbleVendorTheLongAndWindingTableAndColumn
        newDble.myuniqueDrivenProperties.addAll(dble.myuniqueDrivenProperties) // inherit
        newDble.mymodifiedProperties.addAll(dble.mymodifiedProperties) // inherit
        if (!theLongAndWindingTableAndColumnId.equals(this.theLongAndWindingTableAndColumnId)) { newDble.setTheLongAndWindingTableAndColumnId(theLongAndWindingTableAndColumnId) }
        if (!theLongAndWindingTableAndColumnName.equals(this.theLongAndWindingTableAndColumnName)) { newDble.setTheLongAndWindingTableAndColumnName(theLongAndWindingTableAndColumnName) }
        if (!shortName.equals(this.shortName)) { newDble.setShortName(shortName) }
        if (!shortSize.equals(this.shortSize)) { newDble.setShortSize(shortSize) }
        new VendorTheLongAndWindingTableAndColumn(newDble)
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
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /**
     * [get] VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF by THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID, named 'vendorTheLongAndWindingTableAndColumnRefList'.
     * @return The entity list of referrer property 'vendorTheLongAndWindingTableAndColumnRefList'. (NotNull: even if no loading, returns empty list)
     */
    def vendorTheLongAndWindingTableAndColumnRefList: List[VendorTheLongAndWindingTableAndColumnRef] = { dble.toImmutableVendorTheLongAndWindingTableAndColumnRefList }

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
            case obj: BsVendorTheLongAndWindingTableAndColumn => {
                val other: BsVendorTheLongAndWindingTableAndColumn = obj.asInstanceOf[BsVendorTheLongAndWindingTableAndColumn];
                {(
                     xSV(theLongAndWindingTableAndColumnId, other.theLongAndWindingTableAndColumnId)
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
     * [get] THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID: {PK, NotNull, BIGINT(19)} <br />
     * @return The value of the column 'THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID'. (NotNull but EmptyAllowed if null in database)
     */
    def theLongAndWindingTableAndColumnId: Long = { dble.getTheLongAndWindingTableAndColumnId }

    /**
     * [get] THE_LONG_AND_WINDING_TABLE_AND_COLUMN_NAME: {UQ, NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'THE_LONG_AND_WINDING_TABLE_AND_COLUMN_NAME'. (NotNull but EmptyAllowed if null in database)
     */
    def theLongAndWindingTableAndColumnName: String = { dble.getTheLongAndWindingTableAndColumnName }

    /**
     * [get] SHORT_NAME: {NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'SHORT_NAME'. (NotNull but EmptyAllowed if null in database)
     */
    def shortName: String = { dble.getShortName }

    /**
     * [get] SHORT_SIZE: {NotNull, INTEGER(10)} <br />
     * @return The value of the column 'SHORT_SIZE'. (NotNull but EmptyAllowed if null in database)
     */
    def shortSize: Int = { dble.getShortSize }
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
 * The mutable entity of VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN as TABLE. <br />
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * val theLongAndWindingTableAndColumnId: Long = entity.theLongAndWindingTableAndColumnId
 * val theLongAndWindingTableAndColumnName: String = entity.theLongAndWindingTableAndColumnName
 * val shortName: String = entity.shortName
 * val shortSize: Int = entity.shortSize
 * entity.theLongAndWindingTableAndColumnId = theLongAndWindingTableAndColumnId
 * entity.theLongAndWindingTableAndColumnName = theLongAndWindingTableAndColumnName
 * entity.shortName = shortName
 * entity.shortSize = shortSize
 * = = = = = = = = = =/
 * @author DBFlute(AutoGenerator)
 */
abstract class BsMbleVendorTheLongAndWindingTableAndColumn {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected val dble: DbleVendorTheLongAndWindingTableAndColumn = new DbleVendorTheLongAndWindingTableAndColumn();

    // ===================================================================================
    //                                                                      DB-able Entity
    //                                                                      ==============
    def toDBable(): DbleVendorTheLongAndWindingTableAndColumn = { dble }

    // ===================================================================================
    //                                                                    Immutable Entity
    //                                                                    ================
    def toImmutable(): VendorTheLongAndWindingTableAndColumn = { dble.toImmutable() }

    // ===================================================================================
    //                                                                          Unique Key
    //                                                                          ==========
    /**
     * To be unique by the unique column. <br />
     * You can update the entity by the key when entity update (NOT batch update).
     * @param theLongAndWindingTableAndColumnName : UQ, NotNull, VARCHAR(200). (NotNull)
     */
    def uniqueBy(theLongAndWindingTableAndColumnName: String): Unit = { dble.setTheLongAndWindingTableAndColumnName(theLongAndWindingTableAndColumnName); }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID: {PK, NotNull, BIGINT(19)} <br />
     * @return The value of the column 'THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID'. (basically NotNull if selected: for the constraint)
     */
    def theLongAndWindingTableAndColumnId: Long = { dble.getTheLongAndWindingTableAndColumnId }

    /**
     * [set] THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID: {PK, NotNull, BIGINT(19)} <br />
     * @param theLongAndWindingTableAndColumnId The value of the column 'THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID'. (NullAllowed: null update allowed for no constraint)
     */
    def theLongAndWindingTableAndColumnId_=(theLongAndWindingTableAndColumnId: Long) = { dble.setTheLongAndWindingTableAndColumnId(theLongAndWindingTableAndColumnId) }

    /**
     * [get] THE_LONG_AND_WINDING_TABLE_AND_COLUMN_NAME: {UQ, NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'THE_LONG_AND_WINDING_TABLE_AND_COLUMN_NAME'. (basically NotNull if selected: for the constraint)
     */
    def theLongAndWindingTableAndColumnName: String = { dble.getTheLongAndWindingTableAndColumnName }

    /**
     * [set] THE_LONG_AND_WINDING_TABLE_AND_COLUMN_NAME: {UQ, NotNull, VARCHAR(200)} <br />
     * @param theLongAndWindingTableAndColumnName The value of the column 'THE_LONG_AND_WINDING_TABLE_AND_COLUMN_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    def theLongAndWindingTableAndColumnName_=(theLongAndWindingTableAndColumnName: String) = { dble.setTheLongAndWindingTableAndColumnName(theLongAndWindingTableAndColumnName) }

    /**
     * [get] SHORT_NAME: {NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'SHORT_NAME'. (basically NotNull if selected: for the constraint)
     */
    def shortName: String = { dble.getShortName }

    /**
     * [set] SHORT_NAME: {NotNull, VARCHAR(200)} <br />
     * @param shortName The value of the column 'SHORT_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    def shortName_=(shortName: String) = { dble.setShortName(shortName) }

    /**
     * [get] SHORT_SIZE: {NotNull, INTEGER(10)} <br />
     * @return The value of the column 'SHORT_SIZE'. (basically NotNull if selected: for the constraint)
     */
    def shortSize: Int = { dble.getShortSize }

    /**
     * [set] SHORT_SIZE: {NotNull, INTEGER(10)} <br />
     * @param shortSize The value of the column 'SHORT_SIZE'. (NullAllowed: null update allowed for no constraint)
     */
    def shortSize_=(shortSize: Int) = { dble.setShortSize(shortSize) }
}
