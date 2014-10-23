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
 * The immutable entity of VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF as TABLE. <br />
 * <pre>
 * [primary-key]
 *     THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_ID
 * 
 * [column]
 *     THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_ID, THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID, THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_DATE, SHORT_DATE
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
 *     VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     vendorTheLongAndWindingTableAndColumn
 * 
 * [referrer property]
 *     
 * 
 * [get template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * val theLongAndWindingTableAndColumnRefId: Long = entity.theLongAndWindingTableAndColumnRefId
 * val theLongAndWindingTableAndColumnId: Long = entity.theLongAndWindingTableAndColumnId
 * val theLongAndWindingTableAndColumnRefDate: org.joda.time.LocalDate = entity.theLongAndWindingTableAndColumnRefDate
 * val shortDate: org.joda.time.LocalDate = entity.shortDate
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
abstract class BsVendorTheLongAndWindingTableAndColumnRef(dble: DbleVendorTheLongAndWindingTableAndColumnRef) extends Serializable {

    // ===================================================================================
    //                                                                           Case Like
    //                                                                           =========
    def copy(
         theLongAndWindingTableAndColumnRefId: Long = theLongAndWindingTableAndColumnRefId
        , theLongAndWindingTableAndColumnId: Long = theLongAndWindingTableAndColumnId
        , theLongAndWindingTableAndColumnRefDate: org.joda.time.LocalDate = theLongAndWindingTableAndColumnRefDate
        , shortDate: org.joda.time.LocalDate = shortDate
    ): VendorTheLongAndWindingTableAndColumnRef = {
        val newDble = new DbleVendorTheLongAndWindingTableAndColumnRef
        newDble.myuniqueDrivenProperties.addAll(dble.myuniqueDrivenProperties) // inherit
        newDble.mymodifiedProperties.addAll(dble.mymodifiedProperties) // inherit
        if (!theLongAndWindingTableAndColumnRefId.equals(this.theLongAndWindingTableAndColumnRefId)) { newDble.setTheLongAndWindingTableAndColumnRefId(theLongAndWindingTableAndColumnRefId) }
        if (!theLongAndWindingTableAndColumnId.equals(this.theLongAndWindingTableAndColumnId)) { newDble.setTheLongAndWindingTableAndColumnId(theLongAndWindingTableAndColumnId) }
        if (!theLongAndWindingTableAndColumnRefDate.equals(this.theLongAndWindingTableAndColumnRefDate)) { newDble.setTheLongAndWindingTableAndColumnRefDate(theLongAndWindingTableAndColumnRefDate) }
        if (!shortDate.equals(this.shortDate)) { newDble.setShortDate(shortDate) }
        new VendorTheLongAndWindingTableAndColumnRef(newDble)
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
    /**
     * [get] VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN by my THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID, named 'vendorTheLongAndWindingTableAndColumn'.
     * @return The entity of foreign property 'vendorTheLongAndWindingTableAndColumn'. (EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    def vendorTheLongAndWindingTableAndColumn: Option[VendorTheLongAndWindingTableAndColumn] = { dble.toImmutableVendorTheLongAndWindingTableAndColumn }

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
            case obj: BsVendorTheLongAndWindingTableAndColumnRef => {
                val other: BsVendorTheLongAndWindingTableAndColumnRef = obj.asInstanceOf[BsVendorTheLongAndWindingTableAndColumnRef];
                {(
                     xSV(theLongAndWindingTableAndColumnRefId, other.theLongAndWindingTableAndColumnRefId)
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
     * [get] THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_ID: {PK, NotNull, BIGINT(19)} <br />
     * @return The value of the column 'THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_ID'. (NotNull but EmptyAllowed if null in database)
     */
    def theLongAndWindingTableAndColumnRefId: Long = { dble.getTheLongAndWindingTableAndColumnRefId }

    /**
     * [get] THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID: {IX, NotNull, BIGINT(19), FK to VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN} <br />
     * @return The value of the column 'THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID'. (NotNull but EmptyAllowed if null in database)
     */
    def theLongAndWindingTableAndColumnId: Long = { dble.getTheLongAndWindingTableAndColumnId }

    /**
     * [get] THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_DATE: {NotNull, DATE(8)} <br />
     * @return The value of the column 'THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_DATE'. (NotNull but EmptyAllowed if null in database)
     */
    def theLongAndWindingTableAndColumnRefDate: org.joda.time.LocalDate = { dble.getTheLongAndWindingTableAndColumnRefDate }

    /**
     * [get] SHORT_DATE: {NotNull, DATE(8)} <br />
     * @return The value of the column 'SHORT_DATE'. (NotNull but EmptyAllowed if null in database)
     */
    def shortDate: org.joda.time.LocalDate = { dble.getShortDate }
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
 * The mutable entity of VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF as TABLE. <br />
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * val theLongAndWindingTableAndColumnRefId: Long = entity.theLongAndWindingTableAndColumnRefId
 * val theLongAndWindingTableAndColumnId: Long = entity.theLongAndWindingTableAndColumnId
 * val theLongAndWindingTableAndColumnRefDate: org.joda.time.LocalDate = entity.theLongAndWindingTableAndColumnRefDate
 * val shortDate: org.joda.time.LocalDate = entity.shortDate
 * entity.theLongAndWindingTableAndColumnRefId = theLongAndWindingTableAndColumnRefId
 * entity.theLongAndWindingTableAndColumnId = theLongAndWindingTableAndColumnId
 * entity.theLongAndWindingTableAndColumnRefDate = theLongAndWindingTableAndColumnRefDate
 * entity.shortDate = shortDate
 * = = = = = = = = = =/
 * @author DBFlute(AutoGenerator)
 */
abstract class BsMbleVendorTheLongAndWindingTableAndColumnRef {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected val dble: DbleVendorTheLongAndWindingTableAndColumnRef = new DbleVendorTheLongAndWindingTableAndColumnRef();

    // ===================================================================================
    //                                                                      DB-able Entity
    //                                                                      ==============
    def toDBable(): DbleVendorTheLongAndWindingTableAndColumnRef = { dble }

    // ===================================================================================
    //                                                                    Immutable Entity
    //                                                                    ================
    def toImmutable(): VendorTheLongAndWindingTableAndColumnRef = { dble.toImmutable() }

    // ===================================================================================
    //                                                                          Unique Key
    //                                                                          ==========
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_ID: {PK, NotNull, BIGINT(19)} <br />
     * @return The value of the column 'THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_ID'. (basically NotNull if selected: for the constraint)
     */
    def theLongAndWindingTableAndColumnRefId: Long = { dble.getTheLongAndWindingTableAndColumnRefId }

    /**
     * [set] THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_ID: {PK, NotNull, BIGINT(19)} <br />
     * @param theLongAndWindingTableAndColumnRefId The value of the column 'THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_ID'. (NullAllowed: null update allowed for no constraint)
     */
    def theLongAndWindingTableAndColumnRefId_=(theLongAndWindingTableAndColumnRefId: Long) = { dble.setTheLongAndWindingTableAndColumnRefId(theLongAndWindingTableAndColumnRefId) }

    /**
     * [get] THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID: {IX, NotNull, BIGINT(19), FK to VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN} <br />
     * @return The value of the column 'THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID'. (basically NotNull if selected: for the constraint)
     */
    def theLongAndWindingTableAndColumnId: Long = { dble.getTheLongAndWindingTableAndColumnId }

    /**
     * [set] THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID: {IX, NotNull, BIGINT(19), FK to VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN} <br />
     * @param theLongAndWindingTableAndColumnId The value of the column 'THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID'. (NullAllowed: null update allowed for no constraint)
     */
    def theLongAndWindingTableAndColumnId_=(theLongAndWindingTableAndColumnId: Long) = { dble.setTheLongAndWindingTableAndColumnId(theLongAndWindingTableAndColumnId) }

    /**
     * [get] THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_DATE: {NotNull, DATE(8)} <br />
     * @return The value of the column 'THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_DATE'. (basically NotNull if selected: for the constraint)
     */
    def theLongAndWindingTableAndColumnRefDate: org.joda.time.LocalDate = { dble.getTheLongAndWindingTableAndColumnRefDate }

    /**
     * [set] THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_DATE: {NotNull, DATE(8)} <br />
     * @param theLongAndWindingTableAndColumnRefDate The value of the column 'THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    def theLongAndWindingTableAndColumnRefDate_=(theLongAndWindingTableAndColumnRefDate: org.joda.time.LocalDate) = { dble.setTheLongAndWindingTableAndColumnRefDate(theLongAndWindingTableAndColumnRefDate) }

    /**
     * [get] SHORT_DATE: {NotNull, DATE(8)} <br />
     * @return The value of the column 'SHORT_DATE'. (basically NotNull if selected: for the constraint)
     */
    def shortDate: org.joda.time.LocalDate = { dble.getShortDate }

    /**
     * [set] SHORT_DATE: {NotNull, DATE(8)} <br />
     * @param shortDate The value of the column 'SHORT_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    def shortDate_=(shortDate: org.joda.time.LocalDate) = { dble.setShortDate(shortDate) }
}
