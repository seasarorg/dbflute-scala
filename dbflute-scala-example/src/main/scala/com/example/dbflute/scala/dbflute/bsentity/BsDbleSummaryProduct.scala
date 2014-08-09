package com.example.dbflute.scala.dbflute.bsentity;

import scala.collection.immutable;
import scala.collection.JavaConverters._;

// #avoided same name type in Java and Scala
import java.lang.Long;
import java.lang.Boolean;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

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
 * The entity of SUMMARY_PRODUCT as VIEW. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     PRODUCT_ID, PRODUCT_NAME, PRODUCT_HANDLE_CODE, PRODUCT_STATUS_CODE, LATEST_PURCHASE_DATETIME
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
 * Integer productId = entity.getProductId();
 * String productName = entity.getProductName();
 * String productHandleCode = entity.getProductHandleCode();
 * String productStatusCode = entity.getProductStatusCode();
 * org.joda.time.LocalDateTime latestPurchaseDatetime = entity.getLatestPurchaseDatetime();
 * entity.setProductId(productId);
 * entity.setProductName(productName);
 * entity.setProductHandleCode(productHandleCode);
 * entity.setProductStatusCode(productStatusCode);
 * entity.setLatestPurchaseDatetime(latestPurchaseDatetime);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
abstract class BsDbleSummaryProduct extends Entity with DBableEntity[SummaryProduct] with Serializable with Cloneable with DerivedMappable {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** PRODUCT_ID: {INTEGER(10)} */
    protected var _productId: Integer = null;

    /** PRODUCT_NAME: {VARCHAR(50)} */
    protected var _productName: String = null;

    /** PRODUCT_HANDLE_CODE: {VARCHAR(100)} */
    protected var _productHandleCode: String = null;

    /** PRODUCT_STATUS_CODE: {CHAR(3)} */
    protected var _productStatusCode: String = null;

    /** LATEST_PURCHASE_DATETIME: {TIMESTAMP(23, 10)} */
    protected var _latestPurchaseDatetime: org.joda.time.LocalDateTime = null;

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
    def acceptImmutable(immu: SummaryProduct): DbleSummaryProduct = {
        setProductId(immu.productId.map(int2Integer(_)).orNull);
        setProductName(immu.productName.orNull);
        setProductHandleCode(immu.productHandleCode.orNull);
        setProductStatusCode(immu.productStatusCode.orNull);
        setLatestPurchaseDatetime(immu.latestPurchaseDatetime.orNull);
        __uniqueDrivenProperties.clear();
        immu.getMyUniqueDrivenProperties().foreach(__uniqueDrivenProperties.addPropertyName(_))
        __modifiedProperties.clear();
        immu.getModifiedProperties().foreach(__modifiedProperties.addPropertyName(_))
        return this.asInstanceOf[DbleSummaryProduct];
    }

    /**
     * {@inheritDoc}
     */
    def toImmutable(): SummaryProduct = {
        return new SummaryProduct(this.asInstanceOf[DbleSummaryProduct]);
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    def getTableDbName(): String = {
        return "SUMMARY_PRODUCT";
    }

    /**
     * {@inheritDoc}
     */
    def getTablePropertyName(): String = { // according to Java Beans rule
        return "summaryProduct";
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
        return false;
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
    protected def toScalaList[ENTITY](javaList: Collection[ENTITY]): immutable.List[ENTITY] = {
        if (javaList == null) { return immutable.List(); }
        return immutable.List.fromArray(javaList.toArray).asInstanceOf[immutable.List[ENTITY]];
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
            case obj: BsDbleSummaryProduct => {
                val other: BsDbleSummaryProduct = obj.asInstanceOf[BsDbleSummaryProduct];
                {(
                     xSV(getProductId(), other.getProductId())
                    && xSV(getProductName(), other.getProductName())
                    && xSV(getProductHandleCode(), other.getProductHandleCode())
                    && xSV(getProductStatusCode(), other.getProductStatusCode())
                    && xSV(getLatestPurchaseDatetime(), other.getLatestPurchaseDatetime())
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
        hs = xCH(hs, getProductId());
        hs = xCH(hs, getProductName());
        hs = xCH(hs, getProductHandleCode());
        hs = xCH(hs, getProductStatusCode());
        hs = xCH(hs, getLatestPurchaseDatetime());
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
        return sb.toString();
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
        sb.append(dm).append(getProductId());
        sb.append(dm).append(getProductName());
        sb.append(dm).append(getProductHandleCode());
        sb.append(dm).append(getProductStatusCode());
        sb.append(dm).append(getLatestPurchaseDatetime());
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected def buildRelationString(): String = {
        return "";
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    override def clone(): DbleSummaryProduct = {
        try {
            return super.clone().asInstanceOf[DbleSummaryProduct];
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
     * [get] PRODUCT_ID: {INTEGER(10)} <br />
     * @return The value of the column 'PRODUCT_ID'. (NullAllowed even if selected: for no constraint)
     */
    def getProductId(): Integer = {
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {INTEGER(10)} <br />
     * @param productId The value of the column 'PRODUCT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    def setProductId(productId: Integer): Unit = {
        __modifiedProperties.addPropertyName("productId");
        _productId = productId;
    }

    /**
     * [get] PRODUCT_NAME: {VARCHAR(50)} <br />
     * @return The value of the column 'PRODUCT_NAME'. (NullAllowed even if selected: for no constraint)
     */
    def getProductName(): String = {
        return convertEmptyToNull(_productName);
    }

    /**
     * [set] PRODUCT_NAME: {VARCHAR(50)} <br />
     * @param productName The value of the column 'PRODUCT_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    def setProductName(productName: String): Unit = {
        __modifiedProperties.addPropertyName("productName");
        _productName = productName;
    }

    /**
     * [get] PRODUCT_HANDLE_CODE: {VARCHAR(100)} <br />
     * @return The value of the column 'PRODUCT_HANDLE_CODE'. (NullAllowed even if selected: for no constraint)
     */
    def getProductHandleCode(): String = {
        return convertEmptyToNull(_productHandleCode);
    }

    /**
     * [set] PRODUCT_HANDLE_CODE: {VARCHAR(100)} <br />
     * @param productHandleCode The value of the column 'PRODUCT_HANDLE_CODE'. (NullAllowed: null update allowed for no constraint)
     */
    def setProductHandleCode(productHandleCode: String): Unit = {
        __modifiedProperties.addPropertyName("productHandleCode");
        _productHandleCode = productHandleCode;
    }

    /**
     * [get] PRODUCT_STATUS_CODE: {CHAR(3)} <br />
     * @return The value of the column 'PRODUCT_STATUS_CODE'. (NullAllowed even if selected: for no constraint)
     */
    def getProductStatusCode(): String = {
        return convertEmptyToNull(_productStatusCode);
    }

    /**
     * [set] PRODUCT_STATUS_CODE: {CHAR(3)} <br />
     * @param productStatusCode The value of the column 'PRODUCT_STATUS_CODE'. (NullAllowed: null update allowed for no constraint)
     */
    def setProductStatusCode(productStatusCode: String): Unit = {
        __modifiedProperties.addPropertyName("productStatusCode");
        _productStatusCode = productStatusCode;
    }

    /**
     * [get] LATEST_PURCHASE_DATETIME: {TIMESTAMP(23, 10)} <br />
     * @return The value of the column 'LATEST_PURCHASE_DATETIME'. (NullAllowed even if selected: for no constraint)
     */
    def getLatestPurchaseDatetime(): org.joda.time.LocalDateTime = {
        return _latestPurchaseDatetime;
    }

    /**
     * [set] LATEST_PURCHASE_DATETIME: {TIMESTAMP(23, 10)} <br />
     * @param latestPurchaseDatetime The value of the column 'LATEST_PURCHASE_DATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    def setLatestPurchaseDatetime(latestPurchaseDatetime: org.joda.time.LocalDateTime): Unit = {
        __modifiedProperties.addPropertyName("latestPurchaseDatetime");
        _latestPurchaseDatetime = latestPurchaseDatetime;
    }

    protected def convertEmptyToNull(value: String): String = {
        return FunCustodial.convertEmptyToNull(value);
    }
}
