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
 * The immutable entity of VENDOR_$_DOLLAR as TABLE. <br />
 * <pre>
 * [primary-key]
 *     VENDOR_$_DOLLAR_ID
 * 
 * [column]
 *     VENDOR_$_DOLLAR_ID, VENDOR_$_DOLLAR_NAME
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
 * val vendor$DollarId: Int = entity.vendor$DollarId
 * val vendor$DollarName: Option[String] = entity.vendor$DollarName
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
abstract class BsVendor$Dollar(dble: DbleVendor$Dollar) extends Serializable {

    // ===================================================================================
    //                                                                           Case Like
    //                                                                           =========
    def copy(
         vendor$DollarId: Int = vendor$DollarId
        , vendor$DollarName: Option[String] = vendor$DollarName
    ): Vendor$Dollar = {
        val newDble = new DbleVendor$Dollar
        newDble.myuniqueDrivenProperties.addAll(dble.myuniqueDrivenProperties) // inherit
        newDble.mymodifiedProperties.addAll(dble.mymodifiedProperties) // inherit
        if (!vendor$DollarId.equals(this.vendor$DollarId)) { newDble.setVendor$DollarId(vendor$DollarId) }
        if (!vendor$DollarName.equals(this.vendor$DollarName)) { newDble.setVendor$DollarName(vendor$DollarName.orNull) }
        new Vendor$Dollar(newDble)
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
            case obj: BsVendor$Dollar => {
                val other: BsVendor$Dollar = obj.asInstanceOf[BsVendor$Dollar];
                {(
                     xSV(vendor$DollarId, other.vendor$DollarId)
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
     * [get] VENDOR_$_DOLLAR_ID: {PK, NotNull, INTEGER(10)} <br />
     * @return The value of the column 'VENDOR_$_DOLLAR_ID'. (NotNull but EmptyAllowed if null in database)
     */
    def vendor$DollarId: Int = { dble.getVendor$DollarId }

    /**
     * [get] VENDOR_$_DOLLAR_NAME: {VARCHAR(32)} <br />
     * @return The value of the column 'VENDOR_$_DOLLAR_NAME'. (basically NotNull if selected: for the constraint)
     */
    def vendor$DollarName: Option[String] = { Option(dble.getVendor$DollarName) }
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
 * The mutable entity of VENDOR_$_DOLLAR as TABLE. <br />
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * val vendor$DollarId: Int = entity.vendor$DollarId
 * val vendor$DollarName: Option[String] = entity.vendor$DollarName
 * entity.vendor$DollarId = vendor$DollarId
 * entity.vendor$DollarName = vendor$DollarName
 * = = = = = = = = = =/
 * @author DBFlute(AutoGenerator)
 */
abstract class BsMbleVendor$Dollar {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected val dble: DbleVendor$Dollar = new DbleVendor$Dollar();

    // ===================================================================================
    //                                                                      DB-able Entity
    //                                                                      ==============
    def toDBable(): DbleVendor$Dollar = { dble }

    // ===================================================================================
    //                                                                    Immutable Entity
    //                                                                    ================
    def toImmutable(): Vendor$Dollar = { dble.toImmutable() }

    // ===================================================================================
    //                                                                          Unique Key
    //                                                                          ==========
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] VENDOR_$_DOLLAR_ID: {PK, NotNull, INTEGER(10)} <br />
     * @return The value of the column 'VENDOR_$_DOLLAR_ID'. (basically NotNull if selected: for the constraint)
     */
    def vendor$DollarId: Int = { dble.getVendor$DollarId }

    /**
     * [set] VENDOR_$_DOLLAR_ID: {PK, NotNull, INTEGER(10)} <br />
     * @param vendor$DollarId The value of the column 'VENDOR_$_DOLLAR_ID'. (NullAllowed: null update allowed for no constraint)
     */
    def vendor$DollarId_=(vendor$DollarId: Int) = { dble.setVendor$DollarId(vendor$DollarId) }

    /**
     * [get] VENDOR_$_DOLLAR_NAME: {VARCHAR(32)} <br />
     * @return The value of the column 'VENDOR_$_DOLLAR_NAME'. (NotNull but EmptyAllowed if null in database)
     */
    def vendor$DollarName: Option[String] = { Option(dble.getVendor$DollarName) }

    /**
     * [set] VENDOR_$_DOLLAR_NAME: {VARCHAR(32)} <br />
     * @param vendor$DollarName The value of the column 'VENDOR_$_DOLLAR_NAME'. (basically NotNull if update: for the constraint)
     */
    def vendor$DollarName_=(vendor$DollarName: Option[String]) = { dble.setVendor$DollarName(vendor$DollarName.orNull) }
}
