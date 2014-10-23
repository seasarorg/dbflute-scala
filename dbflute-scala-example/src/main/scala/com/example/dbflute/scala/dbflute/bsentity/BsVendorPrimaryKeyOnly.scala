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
 * The immutable entity of VENDOR_PRIMARY_KEY_ONLY as TABLE. <br />
 * <pre>
 * [primary-key]
 *     PRIMARY_KEY_ONLY_ID
 * 
 * [column]
 *     PRIMARY_KEY_ONLY_ID
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
 * val primaryKeyOnlyId: Long = entity.primaryKeyOnlyId
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
abstract class BsVendorPrimaryKeyOnly(dble: DbleVendorPrimaryKeyOnly) extends Serializable {

    // ===================================================================================
    //                                                                           Case Like
    //                                                                           =========
    def copy(
         primaryKeyOnlyId: Long = primaryKeyOnlyId
    ): VendorPrimaryKeyOnly = {
        val newDble = new DbleVendorPrimaryKeyOnly
        newDble.myuniqueDrivenProperties.addAll(dble.myuniqueDrivenProperties) // inherit
        newDble.mymodifiedProperties.addAll(dble.mymodifiedProperties) // inherit
        if (!primaryKeyOnlyId.equals(this.primaryKeyOnlyId)) { newDble.setPrimaryKeyOnlyId(primaryKeyOnlyId) }
        new VendorPrimaryKeyOnly(newDble)
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
            case obj: BsVendorPrimaryKeyOnly => {
                val other: BsVendorPrimaryKeyOnly = obj.asInstanceOf[BsVendorPrimaryKeyOnly];
                {(
                     xSV(primaryKeyOnlyId, other.primaryKeyOnlyId)
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
     * [get] PRIMARY_KEY_ONLY_ID: {PK, NotNull, BIGINT(19)} <br />
     * @return The value of the column 'PRIMARY_KEY_ONLY_ID'. (NotNull but EmptyAllowed if null in database)
     */
    def primaryKeyOnlyId: Long = { dble.getPrimaryKeyOnlyId }
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
 * The mutable entity of VENDOR_PRIMARY_KEY_ONLY as TABLE. <br />
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * val primaryKeyOnlyId: Long = entity.primaryKeyOnlyId
 * entity.primaryKeyOnlyId = primaryKeyOnlyId
 * = = = = = = = = = =/
 * @author DBFlute(AutoGenerator)
 */
abstract class BsMbleVendorPrimaryKeyOnly {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected val dble: DbleVendorPrimaryKeyOnly = new DbleVendorPrimaryKeyOnly();

    // ===================================================================================
    //                                                                      DB-able Entity
    //                                                                      ==============
    def toDBable(): DbleVendorPrimaryKeyOnly = { dble }

    // ===================================================================================
    //                                                                    Immutable Entity
    //                                                                    ================
    def toImmutable(): VendorPrimaryKeyOnly = { dble.toImmutable() }

    // ===================================================================================
    //                                                                          Unique Key
    //                                                                          ==========
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PRIMARY_KEY_ONLY_ID: {PK, NotNull, BIGINT(19)} <br />
     * @return The value of the column 'PRIMARY_KEY_ONLY_ID'. (basically NotNull if selected: for the constraint)
     */
    def primaryKeyOnlyId: Long = { dble.getPrimaryKeyOnlyId }

    /**
     * [set] PRIMARY_KEY_ONLY_ID: {PK, NotNull, BIGINT(19)} <br />
     * @param primaryKeyOnlyId The value of the column 'PRIMARY_KEY_ONLY_ID'. (NullAllowed: null update allowed for no constraint)
     */
    def primaryKeyOnlyId_=(primaryKeyOnlyId: Long) = { dble.setPrimaryKeyOnlyId(primaryKeyOnlyId) }
}
