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
 * The entity of VENDOR_PRIMARY_KEY_ONLY as TABLE. <br />
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
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long primaryKeyOnlyId = entity.getPrimaryKeyOnlyId();
 * entity.setPrimaryKeyOnlyId(primaryKeyOnlyId);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
abstract class BsDbleVendorPrimaryKeyOnly extends AbstractEntity with DBableEntity[VendorPrimaryKeyOnly] with Serializable with Cloneable {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** PRIMARY_KEY_ONLY_ID: {PK, NotNull, BIGINT(19)} */
    protected var _primaryKeyOnlyId: Long = null;

    // ===================================================================================
    //                                                                           Immutable
    //                                                                           =========
    /**
     * {@inheritDoc}
     */
    def acceptImmutable(immu: VendorPrimaryKeyOnly): DbleVendorPrimaryKeyOnly = {
        setPrimaryKeyOnlyId(immu.primaryKeyOnlyId);
        __uniqueDrivenProperties.clear();
        immu.getMyUniqueDrivenProperties().foreach(__uniqueDrivenProperties.addPropertyName(_))
        __modifiedProperties.clear();
        immu.getMyModifiedProperties().foreach(__modifiedProperties.addPropertyName(_))
        return this.asInstanceOf[DbleVendorPrimaryKeyOnly];
    }

    /**
     * {@inheritDoc}
     */
    def toImmutable(): VendorPrimaryKeyOnly = {
        return new VendorPrimaryKeyOnly(this.asInstanceOf[DbleVendorPrimaryKeyOnly]);
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    def getTableDbName(): String = {
        return "VENDOR_PRIMARY_KEY_ONLY";
    }

    /**
     * {@inheritDoc}
     */
    def getTablePropertyName(): String = {
        return "vendorPrimaryKeyOnly";
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
        if (getPrimaryKeyOnlyId() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
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
            case obj: BsDbleVendorPrimaryKeyOnly => {
                val other: BsDbleVendorPrimaryKeyOnly = obj.asInstanceOf[BsDbleVendorPrimaryKeyOnly];
                {(
                     xSV(getPrimaryKeyOnlyId(), other.getPrimaryKeyOnlyId())
                )}
            }
            case _ => false
        }
    }

    override protected def doHashCode(initial: Int): Int = {
        var hs: Int = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, getPrimaryKeyOnlyId());
        return hs;
    }

    override protected def doBuildStringWithRelation(li: String): String = {
        return "";
    }

    override protected def doBuildColumnString(dm: String): String = {
        val sb: StringBuilder = new StringBuilder();
        sb.append(dm).append(getPrimaryKeyOnlyId());
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    override protected def doBuildRelationString(dm: String): String = {
        return "";
    }

    override def clone(): DbleVendorPrimaryKeyOnly = {
        return super.clone().asInstanceOf[DbleVendorPrimaryKeyOnly];
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PRIMARY_KEY_ONLY_ID: {PK, NotNull, BIGINT(19)} <br />
     * @return The value of the column 'PRIMARY_KEY_ONLY_ID'. (basically NotNull if selected: for the constraint)
     */
    def getPrimaryKeyOnlyId(): Long = {
        return _primaryKeyOnlyId;
    }

    /**
     * [set] PRIMARY_KEY_ONLY_ID: {PK, NotNull, BIGINT(19)} <br />
     * @param primaryKeyOnlyId The value of the column 'PRIMARY_KEY_ONLY_ID'. (basically NotNull if update: for the constraint)
     */
    def setPrimaryKeyOnlyId(primaryKeyOnlyId: Long): Unit = {
        __modifiedProperties.addPropertyName("primaryKeyOnlyId");
        _primaryKeyOnlyId = primaryKeyOnlyId;
    }
}
