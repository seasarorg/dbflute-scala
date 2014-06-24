package com.example.dbflute.scala.dbflute.bsentity;

import scala.collection.JavaConverters._;

// #avoided same name type in Java and Scala
import java.lang.Long;
import java.lang.Boolean;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.Date;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.DerivedMappable;
import org.seasar.dbflute.Entity.EntityUniqueDrivenProperties;
import org.seasar.dbflute.Entity.EntityModifiedProperties;
import org.seasar.dbflute.Entity.EntityDerivedMap;
import org.seasar.dbflute.Entity.FunCustodial;
import org.seasar.dbflute.helper.beans.DfCoupleProperties;
import org.seasar.dbflute.immutable.DBableEntity;
import com.example.dbflute.scala.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.scala.dbflute.exentity._;

/**
 * The entity of VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF as TABLE. <br />
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
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long theLongAndWindingTableAndColumnRefId = entity.getTheLongAndWindingTableAndColumnRefId();
 * Long theLongAndWindingTableAndColumnId = entity.getTheLongAndWindingTableAndColumnId();
 * java.util.Date theLongAndWindingTableAndColumnRefDate = entity.getTheLongAndWindingTableAndColumnRefDate();
 * java.util.Date shortDate = entity.getShortDate();
 * entity.setTheLongAndWindingTableAndColumnRefId(theLongAndWindingTableAndColumnRefId);
 * entity.setTheLongAndWindingTableAndColumnId(theLongAndWindingTableAndColumnId);
 * entity.setTheLongAndWindingTableAndColumnRefDate(theLongAndWindingTableAndColumnRefDate);
 * entity.setShortDate(shortDate);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
abstract class BsDbleVendorTheLongAndWindingTableAndColumnRef extends Entity with DBableEntity[VendorTheLongAndWindingTableAndColumnRef] with Serializable with Cloneable with DerivedMappable {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_ID: {PK, NotNull, BIGINT(19)} */
    protected var _theLongAndWindingTableAndColumnRefId: Long = null;

    /** THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID: {IX, NotNull, BIGINT(19), FK to VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN} */
    protected var _theLongAndWindingTableAndColumnId: Long = null;

    /** THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_DATE: {NotNull, DATE(8)} */
    protected var _theLongAndWindingTableAndColumnRefDate: java.util.Date = null;

    /** SHORT_DATE: {NotNull, DATE(8)} */
    protected var _shortDate: java.util.Date = null;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The unique-driven properties for this entity. (NotNull) */
    protected val __uniqueDrivenProperties: EntityUniqueDrivenProperties = newUniqueDrivenProperties();

    /** The modified properties for this entity. (NotNull) */
    protected val __modifiedProperties: EntityModifiedProperties = newModifiedProperties();

    /** The map of derived value, key is alias name. (NullAllowed: lazy-loaded) */
    protected var __derivedMap: EntityDerivedMap = null;

    /** Is the entity created by DBFlute select process? */
    protected var __createdBySelect: Boolean = false;

    // ===================================================================================
    //                                                                           Immutable
    //                                                                           =========
    /**
     * {@inheritDoc}
     */
    def acceptImmutable(immu: VendorTheLongAndWindingTableAndColumnRef): DbleVendorTheLongAndWindingTableAndColumnRef = {
        setTheLongAndWindingTableAndColumnRefId(immu.theLongAndWindingTableAndColumnRefId);
        setTheLongAndWindingTableAndColumnId(immu.theLongAndWindingTableAndColumnId);
        setTheLongAndWindingTableAndColumnRefDate(immu.theLongAndWindingTableAndColumnRefDate);
        setShortDate(immu.shortDate);
        setVendorTheLongAndWindingTableAndColumn(immu.vendorTheLongAndWindingTableAndColumn.map(new DbleVendorTheLongAndWindingTableAndColumn().acceptImmutable(_)))
        __uniqueDrivenProperties.clear();
        immu.getMyUniqueDrivenProperties().foreach(__uniqueDrivenProperties.addPropertyName(_))
        __modifiedProperties.clear();
        immu.getModifiedProperties().foreach(__modifiedProperties.addPropertyName(_))
        return this.asInstanceOf[DbleVendorTheLongAndWindingTableAndColumnRef];
    }

    /**
     * {@inheritDoc}
     */
    def toImmutable(): VendorTheLongAndWindingTableAndColumnRef = {
        return new VendorTheLongAndWindingTableAndColumnRef(this.asInstanceOf[DbleVendorTheLongAndWindingTableAndColumnRef]);
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    def getTableDbName(): String = {
        return "VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF";
    }

    /**
     * {@inheritDoc}
     */
    def getTablePropertyName(): String = { // according to Java Beans rule
        return "vendorTheLongAndWindingTableAndColumnRef";
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
        if (getTheLongAndWindingTableAndColumnRefId() == null) { return false; }
        return true;
    }

    /**
     * {@inheritDoc}
     */
    def myuniqueDrivenProperties(): Set[String] = {
        return __uniqueDrivenProperties.getPropertyNames();
    }

    protected def newUniqueDrivenProperties(): EntityUniqueDrivenProperties = {
        return new EntityUniqueDrivenProperties();
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN by my THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID, named 'vendorTheLongAndWindingTableAndColumn'. */
    protected var _vendorTheLongAndWindingTableAndColumn: Option[DbleVendorTheLongAndWindingTableAndColumn] = null;

    /**
     * [get] VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN by my THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID, named 'vendorTheLongAndWindingTableAndColumn'.
     * @return The entity of foreign property 'vendorTheLongAndWindingTableAndColumn'. (EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    def getVendorTheLongAndWindingTableAndColumn(): Option[DbleVendorTheLongAndWindingTableAndColumn] = {
        return if (_vendorTheLongAndWindingTableAndColumn != null) { _vendorTheLongAndWindingTableAndColumn; } else { Option.empty; }
    }

    /**
     * [set] VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN by my THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID, named 'vendorTheLongAndWindingTableAndColumn'.
     * @param vendorTheLongAndWindingTableAndColumn The entity of foreign property 'vendorTheLongAndWindingTableAndColumn'. (EmptyAllowed)
     */
    def setVendorTheLongAndWindingTableAndColumn(vendorTheLongAndWindingTableAndColumn: Option[DbleVendorTheLongAndWindingTableAndColumn]): Unit = {
        _vendorTheLongAndWindingTableAndColumn = vendorTheLongAndWindingTableAndColumn;
    }

    /**
     * [convert] VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN by my THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID, named 'vendorTheLongAndWindingTableAndColumn'.
     * @return The new-created immutable entity of foreign property 'vendorTheLongAndWindingTableAndColumn'. (NotNull)
     */
    def toImmutableVendorTheLongAndWindingTableAndColumn(): Option[VendorTheLongAndWindingTableAndColumn] = {
        return getVendorTheLongAndWindingTableAndColumn().map(_.toImmutable());
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected def newReferrerList[ELEMENT](): List[ELEMENT] = {
        return new ArrayList[ELEMENT]();
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
    def hasModification(): scala.Boolean = {
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
    def createdBySelect(): scala.Boolean = {
        return __createdBySelect;
    }

    // ===================================================================================
    //                                                                    Derived Mappable
    //                                                                    ================
    /**
     * {@inheritDoc}
     */
    def registerDerivedValue(aliasName: String, selectedValue: Object): Unit = {
        if (__derivedMap == null) { __derivedMap = newDerivedMap(); }
        __derivedMap.registerDerivedValue(aliasName, selectedValue);
    }

    /**
     * Find the derived value from derived map.
     * @param <VALUE> The type of the value.
     * @param aliasName The alias name of derived-referrer. (NotNull)
     * @return The derived value found in the map. (NullAllowed: when null selected)
     */
    def derived[VALUE](aliasName: String): VALUE = {
        if (__derivedMap == null) { __derivedMap = newDerivedMap(); }
        return __derivedMap.findDerivedValue(aliasName);
    }

    protected def newDerivedMap(): EntityDerivedMap = {
        return new EntityDerivedMap();
    }

    // ===================================================================================
    //                                                                        Scala Helper
    //                                                                        ============
    protected def toScalaList[ENTITY](javaList: Collection[ENTITY]): scala.collection.immutable.List[ENTITY] = {
        if (javaList == null) { return scala.collection.immutable.List(); }
        return scala.collection.immutable.List.fromArray(javaList.toArray).asInstanceOf[scala.collection.immutable.List[ENTITY]];
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
            case obj: BsDbleVendorTheLongAndWindingTableAndColumnRef => {
                val other: BsDbleVendorTheLongAndWindingTableAndColumnRef = obj.asInstanceOf[BsDbleVendorTheLongAndWindingTableAndColumnRef];
                {(
                     xSV(getTheLongAndWindingTableAndColumnRefId(), other.getTheLongAndWindingTableAndColumnRefId())
                )}
            }
            case _ => false
        }
    }
    protected def xSV(v1: Object, v2: Object): scala.Boolean = {
        return FunCustodial.isSameValue(v1, v2);
    }

    /**
     * Calculate the hash-code from primary-keys or columns.
     * @return The hash-code from primary-key or columns.
     */
    override def hashCode(): Int = {
        var hs: Int = 17;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, getTheLongAndWindingTableAndColumnRefId());
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
        if (_vendorTheLongAndWindingTableAndColumn != null)
        { sb.append(li).append(xbRDS(_vendorTheLongAndWindingTableAndColumn, "vendorTheLongAndWindingTableAndColumn")); }
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
    def buildDisplayString(name: String, column: scala.Boolean, relation: scala.Boolean): String = {
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
        sb.append(dm).append(getTheLongAndWindingTableAndColumnRefId());
        sb.append(dm).append(getTheLongAndWindingTableAndColumnId());
        sb.append(dm).append(xfUD(getTheLongAndWindingTableAndColumnRefDate()));
        sb.append(dm).append(xfUD(getShortDate()));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected def xfUD(date: Date): String = { // formatUtilDate()
        return FunCustodial.toString(date, xgDP());
    }
    protected def xgDP(): String = { // getDatePattern
        return "yyyy-MM-dd";
    }
    protected def buildRelationString(): String = {
        val sb: StringBuilder = new StringBuilder();
        val cm: String = ",  ";
        if (_vendorTheLongAndWindingTableAndColumn != null) { sb.append(cm).append("vendorTheLongAndWindingTableAndColumn"); }
        if (sb.length() > cm.length()) {
            sb.delete(0, cm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    override def clone(): DbleVendorTheLongAndWindingTableAndColumnRef = {
        try {
            return super.clone().asInstanceOf[DbleVendorTheLongAndWindingTableAndColumnRef];
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
     * [get] THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_ID: {PK, NotNull, BIGINT(19)} <br />
     * @return The value of the column 'THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_ID'. (basically NotNull if selected: for the constraint)
     */
    def getTheLongAndWindingTableAndColumnRefId(): Long = {
        return _theLongAndWindingTableAndColumnRefId;
    }

    /**
     * [set] THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_ID: {PK, NotNull, BIGINT(19)} <br />
     * @param theLongAndWindingTableAndColumnRefId The value of the column 'THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_ID'. (basically NotNull if update: for the constraint)
     */
    def setTheLongAndWindingTableAndColumnRefId(theLongAndWindingTableAndColumnRefId: Long): Unit = {
        __modifiedProperties.addPropertyName("theLongAndWindingTableAndColumnRefId");
        _theLongAndWindingTableAndColumnRefId = theLongAndWindingTableAndColumnRefId;
    }

    /**
     * [get] THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID: {IX, NotNull, BIGINT(19), FK to VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN} <br />
     * @return The value of the column 'THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID'. (basically NotNull if selected: for the constraint)
     */
    def getTheLongAndWindingTableAndColumnId(): Long = {
        return _theLongAndWindingTableAndColumnId;
    }

    /**
     * [set] THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID: {IX, NotNull, BIGINT(19), FK to VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN} <br />
     * @param theLongAndWindingTableAndColumnId The value of the column 'THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID'. (basically NotNull if update: for the constraint)
     */
    def setTheLongAndWindingTableAndColumnId(theLongAndWindingTableAndColumnId: Long): Unit = {
        __modifiedProperties.addPropertyName("theLongAndWindingTableAndColumnId");
        _theLongAndWindingTableAndColumnId = theLongAndWindingTableAndColumnId;
    }

    /**
     * [get] THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_DATE: {NotNull, DATE(8)} <br />
     * @return The value of the column 'THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_DATE'. (basically NotNull if selected: for the constraint)
     */
    def getTheLongAndWindingTableAndColumnRefDate(): java.util.Date = {
        return _theLongAndWindingTableAndColumnRefDate;
    }

    /**
     * [set] THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_DATE: {NotNull, DATE(8)} <br />
     * @param theLongAndWindingTableAndColumnRefDate The value of the column 'THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_DATE'. (basically NotNull if update: for the constraint)
     */
    def setTheLongAndWindingTableAndColumnRefDate(theLongAndWindingTableAndColumnRefDate: java.util.Date): Unit = {
        __modifiedProperties.addPropertyName("theLongAndWindingTableAndColumnRefDate");
        _theLongAndWindingTableAndColumnRefDate = theLongAndWindingTableAndColumnRefDate;
    }

    /**
     * [get] SHORT_DATE: {NotNull, DATE(8)} <br />
     * @return The value of the column 'SHORT_DATE'. (basically NotNull if selected: for the constraint)
     */
    def getShortDate(): java.util.Date = {
        return _shortDate;
    }

    /**
     * [set] SHORT_DATE: {NotNull, DATE(8)} <br />
     * @param shortDate The value of the column 'SHORT_DATE'. (basically NotNull if update: for the constraint)
     */
    def setShortDate(shortDate: java.util.Date): Unit = {
        __modifiedProperties.addPropertyName("shortDate");
        _shortDate = shortDate;
    }
}
