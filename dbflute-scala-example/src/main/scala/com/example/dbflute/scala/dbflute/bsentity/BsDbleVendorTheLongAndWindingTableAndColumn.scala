package com.example.dbflute.scala.dbflute.bsentity;

import scala.collection.immutable;
import scala.collection.JavaConverters._;

// #avoided same name type in Java and Scala
import java.lang.Long;
import java.lang.Boolean;

import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.AbstractEntity;
import org.seasar.dbflute.FunCustodial;
import org.seasar.dbflute.helper.beans.DfCoupleProperties;
import org.seasar.dbflute.immutable.DBableEntity;
import com.example.dbflute.scala.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.scala.dbflute.exentity._;

/**
 * The entity of VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN as TABLE. <br />
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
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long theLongAndWindingTableAndColumnId = entity.getTheLongAndWindingTableAndColumnId();
 * String theLongAndWindingTableAndColumnName = entity.getTheLongAndWindingTableAndColumnName();
 * String shortName = entity.getShortName();
 * Integer shortSize = entity.getShortSize();
 * entity.setTheLongAndWindingTableAndColumnId(theLongAndWindingTableAndColumnId);
 * entity.setTheLongAndWindingTableAndColumnName(theLongAndWindingTableAndColumnName);
 * entity.setShortName(shortName);
 * entity.setShortSize(shortSize);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
abstract class BsDbleVendorTheLongAndWindingTableAndColumn extends AbstractEntity with DBableEntity[VendorTheLongAndWindingTableAndColumn] with Serializable with Cloneable {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID: {PK, NotNull, BIGINT(19)} */
    protected var _theLongAndWindingTableAndColumnId: Long = null;

    /** THE_LONG_AND_WINDING_TABLE_AND_COLUMN_NAME: {UQ, NotNull, VARCHAR(200)} */
    protected var _theLongAndWindingTableAndColumnName: String = null;

    /** SHORT_NAME: {NotNull, VARCHAR(200)} */
    protected var _shortName: String = null;

    /** SHORT_SIZE: {NotNull, INTEGER(10)} */
    protected var _shortSize: Integer = null;

    // ===================================================================================
    //                                                                           Immutable
    //                                                                           =========
    /**
     * {@inheritDoc}
     */
    def acceptImmutable(immu: VendorTheLongAndWindingTableAndColumn): DbleVendorTheLongAndWindingTableAndColumn = {
        setTheLongAndWindingTableAndColumnId(immu.theLongAndWindingTableAndColumnId);
        setTheLongAndWindingTableAndColumnName(immu.theLongAndWindingTableAndColumnName);
        setShortName(immu.shortName);
        setShortSize(immu.shortSize);
        setVendorTheLongAndWindingTableAndColumnRefList(immu.vendorTheLongAndWindingTableAndColumnRefList.map(new DbleVendorTheLongAndWindingTableAndColumnRef().acceptImmutable(_)).asJava)
        __uniqueDrivenProperties.clear();
        immu.getMyUniqueDrivenProperties().foreach(__uniqueDrivenProperties.addPropertyName(_))
        __modifiedProperties.clear();
        immu.getMyModifiedProperties().foreach(__modifiedProperties.addPropertyName(_))
        return this.asInstanceOf[DbleVendorTheLongAndWindingTableAndColumn];
    }

    /**
     * {@inheritDoc}
     */
    def toImmutable(): VendorTheLongAndWindingTableAndColumn = {
        return new VendorTheLongAndWindingTableAndColumn(this.asInstanceOf[DbleVendorTheLongAndWindingTableAndColumn]);
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    def getTableDbName(): String = {
        return "VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN";
    }

    /**
     * {@inheritDoc}
     */
    def getTablePropertyName(): String = {
        return "vendorTheLongAndWindingTableAndColumn";
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
        if (getTheLongAndWindingTableAndColumnId() == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br />
     * You can update the entity by the key when entity update (NOT batch update).
     * @param theLongAndWindingTableAndColumnName : UQ, NotNull, VARCHAR(200). (NotNull)
     */
    def uniqueBy(theLongAndWindingTableAndColumnName: String): Unit = {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("theLongAndWindingTableAndColumnName");
        setTheLongAndWindingTableAndColumnName(theLongAndWindingTableAndColumnName);
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF by THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID, named 'vendorTheLongAndWindingTableAndColumnRefList'. */
    protected var _vendorTheLongAndWindingTableAndColumnRefList: List[DbleVendorTheLongAndWindingTableAndColumnRef] = null;

    /**
     * [get] VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF by THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID, named 'vendorTheLongAndWindingTableAndColumnRefList'.
     * @return The entity list of referrer property 'vendorTheLongAndWindingTableAndColumnRefList'. (NotNull: even if no loading, returns empty list)
     */
    def getVendorTheLongAndWindingTableAndColumnRefList(): List[DbleVendorTheLongAndWindingTableAndColumnRef] = {
        if (_vendorTheLongAndWindingTableAndColumnRefList == null) { _vendorTheLongAndWindingTableAndColumnRefList = newReferrerScalaList(); }
        return _vendorTheLongAndWindingTableAndColumnRefList;
    }

    /**
     * [set] VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF by THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID, named 'vendorTheLongAndWindingTableAndColumnRefList'.
     * @param vendorTheLongAndWindingTableAndColumnRefList The entity list of referrer property 'vendorTheLongAndWindingTableAndColumnRefList'. (NullAllowed)
     */
    def setVendorTheLongAndWindingTableAndColumnRefList(vendorTheLongAndWindingTableAndColumnRefList: List[DbleVendorTheLongAndWindingTableAndColumnRef]): Unit = {
        _vendorTheLongAndWindingTableAndColumnRefList = vendorTheLongAndWindingTableAndColumnRefList;
    }

    /**
     * [convert] VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF by THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID, named 'vendorTheLongAndWindingTableAndColumnRefList'.
     * @return The new-created immutable list of immutable entity of the referrer property 'vendorTheLongAndWindingTableAndColumnRefList'. (NotNull)
     */
    def toImmutableVendorTheLongAndWindingTableAndColumnRefList(): immutable.List[VendorTheLongAndWindingTableAndColumnRef] = {
        return toScalaList(_vendorTheLongAndWindingTableAndColumnRefList).map(_.toImmutable());
    }

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
            case obj: BsDbleVendorTheLongAndWindingTableAndColumn => {
                val other: BsDbleVendorTheLongAndWindingTableAndColumn = obj.asInstanceOf[BsDbleVendorTheLongAndWindingTableAndColumn];
                {(
                     xSV(getTheLongAndWindingTableAndColumnId(), other.getTheLongAndWindingTableAndColumnId())
                )}
            }
            case _ => false
        }
    }

    override protected def doHashCode(initial: Int): Int = {
        var hs: Int = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, getTheLongAndWindingTableAndColumnId());
        return hs;
    }

    override protected def doBuildStringWithRelation(li: String): String = {
        val sb: StringBuilder = new StringBuilder();
        toScalaList(_vendorTheLongAndWindingTableAndColumnRefList).foreach(et => { if (et != null) { sb.append(li).append(xbRDS(et, "vendorTheLongAndWindingTableAndColumnRefList")) } });
        return sb.toString();
    }

    override protected def doBuildColumnString(dm: String): String = {
        val sb: StringBuilder = new StringBuilder();
        sb.append(dm).append(getTheLongAndWindingTableAndColumnId());
        sb.append(dm).append(getTheLongAndWindingTableAndColumnName());
        sb.append(dm).append(getShortName());
        sb.append(dm).append(getShortSize());
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    override protected def doBuildRelationString(dm: String): String = {
        val sb: StringBuilder = new StringBuilder();
        if (_vendorTheLongAndWindingTableAndColumnRefList != null && !_vendorTheLongAndWindingTableAndColumnRefList.isEmpty)
        { sb.append(dm).append("vendorTheLongAndWindingTableAndColumnRefList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    override def clone(): DbleVendorTheLongAndWindingTableAndColumn = {
        return super.clone().asInstanceOf[DbleVendorTheLongAndWindingTableAndColumn];
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID: {PK, NotNull, BIGINT(19)} <br />
     * @return The value of the column 'THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID'. (basically NotNull if selected: for the constraint)
     */
    def getTheLongAndWindingTableAndColumnId(): Long = {
        return _theLongAndWindingTableAndColumnId;
    }

    /**
     * [set] THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID: {PK, NotNull, BIGINT(19)} <br />
     * @param theLongAndWindingTableAndColumnId The value of the column 'THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID'. (basically NotNull if update: for the constraint)
     */
    def setTheLongAndWindingTableAndColumnId(theLongAndWindingTableAndColumnId: Long): Unit = {
        __modifiedProperties.addPropertyName("theLongAndWindingTableAndColumnId");
        _theLongAndWindingTableAndColumnId = theLongAndWindingTableAndColumnId;
    }

    /**
     * [get] THE_LONG_AND_WINDING_TABLE_AND_COLUMN_NAME: {UQ, NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'THE_LONG_AND_WINDING_TABLE_AND_COLUMN_NAME'. (basically NotNull if selected: for the constraint)
     */
    def getTheLongAndWindingTableAndColumnName(): String = {
        return convertEmptyToNull(_theLongAndWindingTableAndColumnName);
    }

    /**
     * [set] THE_LONG_AND_WINDING_TABLE_AND_COLUMN_NAME: {UQ, NotNull, VARCHAR(200)} <br />
     * @param theLongAndWindingTableAndColumnName The value of the column 'THE_LONG_AND_WINDING_TABLE_AND_COLUMN_NAME'. (basically NotNull if update: for the constraint)
     */
    def setTheLongAndWindingTableAndColumnName(theLongAndWindingTableAndColumnName: String): Unit = {
        __modifiedProperties.addPropertyName("theLongAndWindingTableAndColumnName");
        _theLongAndWindingTableAndColumnName = theLongAndWindingTableAndColumnName;
    }

    /**
     * [get] SHORT_NAME: {NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'SHORT_NAME'. (basically NotNull if selected: for the constraint)
     */
    def getShortName(): String = {
        return convertEmptyToNull(_shortName);
    }

    /**
     * [set] SHORT_NAME: {NotNull, VARCHAR(200)} <br />
     * @param shortName The value of the column 'SHORT_NAME'. (basically NotNull if update: for the constraint)
     */
    def setShortName(shortName: String): Unit = {
        __modifiedProperties.addPropertyName("shortName");
        _shortName = shortName;
    }

    /**
     * [get] SHORT_SIZE: {NotNull, INTEGER(10)} <br />
     * @return The value of the column 'SHORT_SIZE'. (basically NotNull if selected: for the constraint)
     */
    def getShortSize(): Integer = {
        return _shortSize;
    }

    /**
     * [set] SHORT_SIZE: {NotNull, INTEGER(10)} <br />
     * @param shortSize The value of the column 'SHORT_SIZE'. (basically NotNull if update: for the constraint)
     */
    def setShortSize(shortSize: Integer): Unit = {
        __modifiedProperties.addPropertyName("shortSize");
        _shortSize = shortSize;
    }
}
