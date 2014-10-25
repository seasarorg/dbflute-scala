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
 * org.joda.time.LocalDate theLongAndWindingTableAndColumnRefDate = entity.getTheLongAndWindingTableAndColumnRefDate();
 * org.joda.time.LocalDate shortDate = entity.getShortDate();
 * entity.setTheLongAndWindingTableAndColumnRefId(theLongAndWindingTableAndColumnRefId);
 * entity.setTheLongAndWindingTableAndColumnId(theLongAndWindingTableAndColumnId);
 * entity.setTheLongAndWindingTableAndColumnRefDate(theLongAndWindingTableAndColumnRefDate);
 * entity.setShortDate(shortDate);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
abstract class BsDbleVendorTheLongAndWindingTableAndColumnRef extends AbstractEntity with DBableEntity[VendorTheLongAndWindingTableAndColumnRef] with Serializable with Cloneable {

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
    protected var _theLongAndWindingTableAndColumnRefDate: org.joda.time.LocalDate = null;

    /** SHORT_DATE: {NotNull, DATE(8)} */
    protected var _shortDate: org.joda.time.LocalDate = null;

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
        immu.getMyModifiedProperties().foreach(__modifiedProperties.addPropertyName(_))
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
    def getTablePropertyName(): String = {
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
            case obj: BsDbleVendorTheLongAndWindingTableAndColumnRef => {
                val other: BsDbleVendorTheLongAndWindingTableAndColumnRef = obj.asInstanceOf[BsDbleVendorTheLongAndWindingTableAndColumnRef];
                {(
                     xSV(getTheLongAndWindingTableAndColumnRefId(), other.getTheLongAndWindingTableAndColumnRefId())
                )}
            }
            case _ => false
        }
    }

    override protected def doHashCode(initial: Int): Int = {
        var hs: Int = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, getTheLongAndWindingTableAndColumnRefId());
        return hs;
    }

    override protected def doBuildStringWithRelation(li: String): String = {
        val sb: StringBuilder = new StringBuilder();
        if (_vendorTheLongAndWindingTableAndColumn != null && _vendorTheLongAndWindingTableAndColumn.isEmpty)
        { sb.append(li).append(xbRDS(_vendorTheLongAndWindingTableAndColumn, "vendorTheLongAndWindingTableAndColumn")); }
        return sb.toString();
    }
    protected def xbRDS[ET <: Entity](et: Option[ET], name: String): String = {
        return et.get.buildDisplayString(name, true, true);
    }

    override protected def doBuildColumnString(dm: String): String = {
        val sb: StringBuilder = new StringBuilder();
        sb.append(dm).append(getTheLongAndWindingTableAndColumnRefId());
        sb.append(dm).append(getTheLongAndWindingTableAndColumnId());
        sb.append(dm).append(getTheLongAndWindingTableAndColumnRefDate());
        sb.append(dm).append(getShortDate());
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    override protected def doBuildRelationString(dm: String): String = {
        val sb: StringBuilder = new StringBuilder();
        if (_vendorTheLongAndWindingTableAndColumn != null && _vendorTheLongAndWindingTableAndColumn.isEmpty)
        { sb.append(dm).append("vendorTheLongAndWindingTableAndColumn"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    override def clone(): DbleVendorTheLongAndWindingTableAndColumnRef = {
        return super.clone().asInstanceOf[DbleVendorTheLongAndWindingTableAndColumnRef];
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
    def getTheLongAndWindingTableAndColumnRefDate(): org.joda.time.LocalDate = {
        return _theLongAndWindingTableAndColumnRefDate;
    }

    /**
     * [set] THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_DATE: {NotNull, DATE(8)} <br />
     * @param theLongAndWindingTableAndColumnRefDate The value of the column 'THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_DATE'. (basically NotNull if update: for the constraint)
     */
    def setTheLongAndWindingTableAndColumnRefDate(theLongAndWindingTableAndColumnRefDate: org.joda.time.LocalDate): Unit = {
        __modifiedProperties.addPropertyName("theLongAndWindingTableAndColumnRefDate");
        _theLongAndWindingTableAndColumnRefDate = theLongAndWindingTableAndColumnRefDate;
    }

    /**
     * [get] SHORT_DATE: {NotNull, DATE(8)} <br />
     * @return The value of the column 'SHORT_DATE'. (basically NotNull if selected: for the constraint)
     */
    def getShortDate(): org.joda.time.LocalDate = {
        return _shortDate;
    }

    /**
     * [set] SHORT_DATE: {NotNull, DATE(8)} <br />
     * @param shortDate The value of the column 'SHORT_DATE'. (basically NotNull if update: for the constraint)
     */
    def setShortDate(shortDate: org.joda.time.LocalDate): Unit = {
        __modifiedProperties.addPropertyName("shortDate");
        _shortDate = shortDate;
    }
}
