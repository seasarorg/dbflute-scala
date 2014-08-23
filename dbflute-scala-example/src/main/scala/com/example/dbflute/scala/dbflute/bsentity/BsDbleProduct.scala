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
import com.example.dbflute.scala.dbflute.allcommon.EntityDefinedCommonColumn;
import com.example.dbflute.scala.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.scala.dbflute.allcommon.CDef;
import com.example.dbflute.scala.dbflute.exentity._;

/**
 * The entity of (商品)PRODUCT as TABLE. <br />
 * <pre>
 * [primary-key]
 *     PRODUCT_ID
 * 
 * [column]
 *     PRODUCT_ID, PRODUCT_NAME, PRODUCT_HANDLE_CODE, PRODUCT_CATEGORY_CODE, PRODUCT_STATUS_CODE, REGULAR_PRICE, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     PRODUCT_ID
 * 
 * [version-no]
 *     VERSION_NO
 * 
 * [foreign table]
 *     PRODUCT_CATEGORY, PRODUCT_STATUS
 * 
 * [referrer table]
 *     PURCHASE
 * 
 * [foreign property]
 *     productCategory, productStatus
 * 
 * [referrer property]
 *     purchaseList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer productId = entity.getProductId();
 * String productName = entity.getProductName();
 * String productHandleCode = entity.getProductHandleCode();
 * String productCategoryCode = entity.getProductCategoryCode();
 * String productStatusCode = entity.getProductStatusCode();
 * Integer regularPrice = entity.getRegularPrice();
 * org.joda.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerUser = entity.getRegisterUser();
 * org.joda.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateUser = entity.getUpdateUser();
 * Long versionNo = entity.getVersionNo();
 * entity.setProductId(productId);
 * entity.setProductName(productName);
 * entity.setProductHandleCode(productHandleCode);
 * entity.setProductCategoryCode(productCategoryCode);
 * entity.setProductStatusCode(productStatusCode);
 * entity.setRegularPrice(regularPrice);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterUser(registerUser);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateUser(updateUser);
 * entity.setVersionNo(versionNo);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
abstract class BsDbleProduct extends EntityDefinedCommonColumn with DBableEntity[Product] with Serializable with Cloneable with DerivedMappable {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** PRODUCT_ID: {PK, ID, NotNull, INTEGER(10)} */
    protected var _productId: Integer = null;

    /** (商品名称)PRODUCT_NAME: {IX, NotNull, VARCHAR(50)} */
    protected var _productName: String = null;

    /** (商品ハンドルコード)PRODUCT_HANDLE_CODE: {UQ, NotNull, VARCHAR(100)} */
    protected var _productHandleCode: String = null;

    /** PRODUCT_CATEGORY_CODE: {IX, NotNull, CHAR(3), FK to PRODUCT_CATEGORY} */
    protected var _productCategoryCode: String = null;

    /** PRODUCT_STATUS_CODE: {IX, NotNull, CHAR(3), FK to PRODUCT_STATUS, classification=ProductStatus} */
    protected var _productStatusCode: String = null;

    /** (定価)REGULAR_PRICE: {NotNull, INTEGER(10)} */
    protected var _regularPrice: Integer = null;

    /** REGISTER_DATETIME: {NotNull, TIMESTAMP(23, 10)} */
    protected var _registerDatetime: org.joda.time.LocalDateTime = null;

    /** REGISTER_USER: {NotNull, VARCHAR(200)} */
    protected var _registerUser: String = null;

    /** UPDATE_DATETIME: {NotNull, TIMESTAMP(23, 10)} */
    protected var _updateDatetime: org.joda.time.LocalDateTime = null;

    /** UPDATE_USER: {NotNull, VARCHAR(200)} */
    protected var _updateUser: String = null;

    /** VERSION_NO: {NotNull, BIGINT(19)} */
    protected var _versionNo: Long = null;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The unique-driven properties for this entity. (NotNull) */
    protected val __uniqueDrivenProperties: EntityUniqueDrivenProperties = newUniqueDrivenProperties();

    /** The modified properties for this entity. (NotNull) */
    protected val __modifiedProperties: EntityModifiedProperties = newModifiedProperties();

    /** The map of derived value, key is alias name. (NullAllowed: lazy-loaded) */
    protected var __derivedMap: EntityDerivedMap = null;

    /** Is common column auto set up effective? */
    protected var __canCommonColumnAutoSetup: Boolean = true;

    /** Is the entity created by DBFlute select process? */
    protected var __createdBySelect: Boolean = false;

    // ===================================================================================
    //                                                                           Immutable
    //                                                                           =========
    /**
     * {@inheritDoc}
     */
    def acceptImmutable(immu: Product): DbleProduct = {
        setProductId(immu.productId);
        setProductName(immu.productName);
        setProductHandleCode(immu.productHandleCode);
        setProductCategoryCode(immu.productCategoryCode);
        setProductStatusCodeAsProductStatus(immu.productStatusCode);
        setRegularPrice(immu.regularPrice);
        setRegisterDatetime(immu.registerDatetime);
        setRegisterUser(immu.registerUser);
        setUpdateDatetime(immu.updateDatetime);
        setUpdateUser(immu.updateUser);
        setVersionNo(immu.versionNo);
        setProductCategory(immu.productCategory.map(new DbleProductCategory().acceptImmutable(_)))
        setProductStatus(immu.productStatus.map(new DbleProductStatus().acceptImmutable(_)))
        setPurchaseList(immu.purchaseList.map(new DblePurchase().acceptImmutable(_)).asJava)
        __uniqueDrivenProperties.clear();
        immu.getMyUniqueDrivenProperties().foreach(__uniqueDrivenProperties.addPropertyName(_))
        __modifiedProperties.clear();
        immu.getModifiedProperties().foreach(__modifiedProperties.addPropertyName(_))
        return this.asInstanceOf[DbleProduct];
    }

    /**
     * {@inheritDoc}
     */
    def toImmutable(): Product = {
        return new Product(this.asInstanceOf[DbleProduct]);
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    def getTableDbName(): String = {
        return "PRODUCT";
    }

    /**
     * {@inheritDoc}
     */
    def getTablePropertyName(): String = { // according to Java Beans rule
        return "product";
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
        if (getProductId() == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br />
     * You can update the entity by the key when entity update (NOT batch update).
     * @param productHandleCode (商品ハンドルコード): UQ, NotNull, VARCHAR(100). (NotNull)
     */
    def uniqueBy(productHandleCode: String): Unit = {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("productHandleCode");
        setProductHandleCode(productHandleCode);
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
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of productStatusCode as the classification of ProductStatus. <br />
     * PRODUCT_STATUS_CODE: {IX, NotNull, CHAR(3), FK to PRODUCT_STATUS, classification=ProductStatus} <br />
     * status for product
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    def getProductStatusCodeAsProductStatus(): CDef.ProductStatus = {
        return CDef.ProductStatus.codeOf(getProductStatusCode());
    }

    /**
     * Set the value of productStatusCode as the classification of ProductStatus. <br />
     * PRODUCT_STATUS_CODE: {IX, NotNull, CHAR(3), FK to PRODUCT_STATUS, classification=ProductStatus} <br />
     * status for product
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    def setProductStatusCodeAsProductStatus(cdef: CDef.ProductStatus): Unit = {
        setProductStatusCode(if (cdef != null) { cdef.code } else { null });
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of productStatusCode as ProductionSale (ONS). <br />
     * ProductionSale
     */
    def setProductStatusCode_ProductionSale(): Unit = {
        setProductStatusCodeAsProductStatus(CDef.ProductStatus.ProductionSale);
    }

    /**
     * Set the value of productStatusCode as StopProduction (PST). <br />
     * StopProduction
     */
    def setProductStatusCode_StopProduction(): Unit = {
        setProductStatusCodeAsProductStatus(CDef.ProductStatus.StopProduction);
    }

    /**
     * Set the value of productStatusCode as StopSale (SST). <br />
     * StopSale
     */
    def setProductStatusCode_StopSale(): Unit = {
        setProductStatusCodeAsProductStatus(CDef.ProductStatus.StopSale);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of productStatusCode ProductionSale? <br />
     * ProductionSale
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isProductStatusCode_ProductionSale(): Boolean = {
        val cdef: CDef.ProductStatus = getProductStatusCodeAsProductStatus();
        return if (cdef != null) { cdef.equals(CDef.ProductStatus.ProductionSale) } else { false };
    }

    /**
     * Is the value of productStatusCode StopProduction? <br />
     * StopProduction
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isProductStatusCode_StopProduction(): Boolean = {
        val cdef: CDef.ProductStatus = getProductStatusCodeAsProductStatus();
        return if (cdef != null) { cdef.equals(CDef.ProductStatus.StopProduction) } else { false };
    }

    /**
     * Is the value of productStatusCode StopSale? <br />
     * StopSale
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isProductStatusCode_StopSale(): Boolean = {
        val cdef: CDef.ProductStatus = getProductStatusCodeAsProductStatus();
        return if (cdef != null) { cdef.equals(CDef.ProductStatus.StopSale) } else { false };
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** (商品カテゴリ)PRODUCT_CATEGORY by my PRODUCT_CATEGORY_CODE, named 'productCategory'. */
    protected var _productCategory: Option[DbleProductCategory] = null;

    /**
     * [get] (商品カテゴリ)PRODUCT_CATEGORY by my PRODUCT_CATEGORY_CODE, named 'productCategory'.
     * @return The entity of foreign property 'productCategory'. (EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    def getProductCategory(): Option[DbleProductCategory] = {
        return if (_productCategory != null) { _productCategory; } else { Option.empty; }
    }

    /**
     * [set] (商品カテゴリ)PRODUCT_CATEGORY by my PRODUCT_CATEGORY_CODE, named 'productCategory'.
     * @param productCategory The entity of foreign property 'productCategory'. (EmptyAllowed)
     */
    def setProductCategory(productCategory: Option[DbleProductCategory]): Unit = {
        _productCategory = productCategory;
    }

    /**
     * [convert] (商品カテゴリ)PRODUCT_CATEGORY by my PRODUCT_CATEGORY_CODE, named 'productCategory'.
     * @return The new-created immutable entity of foreign property 'productCategory'. (NotNull)
     */
    def toImmutableProductCategory(): Option[ProductCategory] = {
        return getProductCategory().map(_.toImmutable());
    }

    /** (商品ステータス)PRODUCT_STATUS by my PRODUCT_STATUS_CODE, named 'productStatus'. */
    protected var _productStatus: Option[DbleProductStatus] = null;

    /**
     * [get] (商品ステータス)PRODUCT_STATUS by my PRODUCT_STATUS_CODE, named 'productStatus'.
     * @return The entity of foreign property 'productStatus'. (EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    def getProductStatus(): Option[DbleProductStatus] = {
        return if (_productStatus != null) { _productStatus; } else { Option.empty; }
    }

    /**
     * [set] (商品ステータス)PRODUCT_STATUS by my PRODUCT_STATUS_CODE, named 'productStatus'.
     * @param productStatus The entity of foreign property 'productStatus'. (EmptyAllowed)
     */
    def setProductStatus(productStatus: Option[DbleProductStatus]): Unit = {
        _productStatus = productStatus;
    }

    /**
     * [convert] (商品ステータス)PRODUCT_STATUS by my PRODUCT_STATUS_CODE, named 'productStatus'.
     * @return The new-created immutable entity of foreign property 'productStatus'. (NotNull)
     */
    def toImmutableProductStatus(): Option[ProductStatus] = {
        return getProductStatus().map(_.toImmutable());
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** (購入)PURCHASE by PRODUCT_ID, named 'purchaseList'. */
    protected var _purchaseList: List[DblePurchase] = null;

    /**
     * [get] (購入)PURCHASE by PRODUCT_ID, named 'purchaseList'.
     * @return The entity list of referrer property 'purchaseList'. (NotNull: even if no loading, returns empty list)
     */
    def getPurchaseList(): List[DblePurchase] = {
        if (_purchaseList == null) { _purchaseList = newReferrerList(); }
        return _purchaseList;
    }

    /**
     * [set] (購入)PURCHASE by PRODUCT_ID, named 'purchaseList'.
     * @param purchaseList The entity list of referrer property 'purchaseList'. (NullAllowed)
     */
    def setPurchaseList(purchaseList: List[DblePurchase]): Unit = {
        _purchaseList = purchaseList;
    }

    /**
     * [convert] (購入)PURCHASE by PRODUCT_ID, named 'purchaseList'.
     * @return The new-created immutable list of immutable entity of the referrer property 'purchaseList'. (NotNull)
     */
    def toImmutablePurchaseList(): immutable.List[Purchase] = {
        return toScalaList(_purchaseList).map(_.toImmutable());
    }

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
    //                                                                       Common Column
    //                                                                       =============
    /**
     * {@inheritDoc}
     */
    def enableCommonColumnAutoSetup(): Unit = {
        __canCommonColumnAutoSetup = true;
    }

    /**
     * {@inheritDoc}
     */
    def disableCommonColumnAutoSetup(): Unit = {
        __canCommonColumnAutoSetup = false;
    }

    /**
     * {@inheritDoc}
     */
    def canCommonColumnAutoSetup(): scala.Boolean = {
        return __canCommonColumnAutoSetup;
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
            case obj: BsDbleProduct => {
                val other: BsDbleProduct = obj.asInstanceOf[BsDbleProduct];
                {(
                     xSV(getProductId(), other.getProductId())
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
        if (_productCategory != null)
        { sb.append(li).append(xbRDS(_productCategory, "productCategory")); }
        if (_productStatus != null)
        { sb.append(li).append(xbRDS(_productStatus, "productStatus")); }
        toScalaList(_purchaseList).foreach(et => { if (et != null) { sb.append(li).append(xbRDS(et, "purchaseList")) } });
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
        sb.append(dm).append(getProductId());
        sb.append(dm).append(getProductName());
        sb.append(dm).append(getProductHandleCode());
        sb.append(dm).append(getProductCategoryCode());
        sb.append(dm).append(getProductStatusCode());
        sb.append(dm).append(getRegularPrice());
        sb.append(dm).append(getRegisterDatetime());
        sb.append(dm).append(getRegisterUser());
        sb.append(dm).append(getUpdateDatetime());
        sb.append(dm).append(getUpdateUser());
        sb.append(dm).append(getVersionNo());
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected def buildRelationString(): String = {
        val sb: StringBuilder = new StringBuilder();
        val cm: String = ",  ";
        if (_productCategory != null) { sb.append(cm).append("productCategory"); }
        if (_productStatus != null) { sb.append(cm).append("productStatus"); }
        if (_purchaseList != null && !_purchaseList.isEmpty)
        { sb.append(cm).append("purchaseList"); }
        if (sb.length() > cm.length()) {
            sb.delete(0, cm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    override def clone(): DbleProduct = {
        try {
            return super.clone().asInstanceOf[DbleProduct];
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
     * [get] PRODUCT_ID: {PK, ID, NotNull, INTEGER(10)} <br />
     * @return The value of the column 'PRODUCT_ID'. (basically NotNull if selected: for the constraint)
     */
    def getProductId(): Integer = {
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {PK, ID, NotNull, INTEGER(10)} <br />
     * @param productId The value of the column 'PRODUCT_ID'. (basically NotNull if update: for the constraint)
     */
    def setProductId(productId: Integer): Unit = {
        __modifiedProperties.addPropertyName("productId");
        _productId = productId;
    }

    /**
     * [get] (商品名称)PRODUCT_NAME: {IX, NotNull, VARCHAR(50)} <br />
     * @return The value of the column 'PRODUCT_NAME'. (basically NotNull if selected: for the constraint)
     */
    def getProductName(): String = {
        return convertEmptyToNull(_productName);
    }

    /**
     * [set] (商品名称)PRODUCT_NAME: {IX, NotNull, VARCHAR(50)} <br />
     * @param productName The value of the column 'PRODUCT_NAME'. (basically NotNull if update: for the constraint)
     */
    def setProductName(productName: String): Unit = {
        __modifiedProperties.addPropertyName("productName");
        _productName = productName;
    }

    /**
     * [get] (商品ハンドルコード)PRODUCT_HANDLE_CODE: {UQ, NotNull, VARCHAR(100)} <br />
     * @return The value of the column 'PRODUCT_HANDLE_CODE'. (basically NotNull if selected: for the constraint)
     */
    def getProductHandleCode(): String = {
        return convertEmptyToNull(_productHandleCode);
    }

    /**
     * [set] (商品ハンドルコード)PRODUCT_HANDLE_CODE: {UQ, NotNull, VARCHAR(100)} <br />
     * @param productHandleCode The value of the column 'PRODUCT_HANDLE_CODE'. (basically NotNull if update: for the constraint)
     */
    def setProductHandleCode(productHandleCode: String): Unit = {
        __modifiedProperties.addPropertyName("productHandleCode");
        _productHandleCode = productHandleCode;
    }

    /**
     * [get] PRODUCT_CATEGORY_CODE: {IX, NotNull, CHAR(3), FK to PRODUCT_CATEGORY} <br />
     * @return The value of the column 'PRODUCT_CATEGORY_CODE'. (basically NotNull if selected: for the constraint)
     */
    def getProductCategoryCode(): String = {
        return convertEmptyToNull(_productCategoryCode);
    }

    /**
     * [set] PRODUCT_CATEGORY_CODE: {IX, NotNull, CHAR(3), FK to PRODUCT_CATEGORY} <br />
     * @param productCategoryCode The value of the column 'PRODUCT_CATEGORY_CODE'. (basically NotNull if update: for the constraint)
     */
    def setProductCategoryCode(productCategoryCode: String): Unit = {
        __modifiedProperties.addPropertyName("productCategoryCode");
        _productCategoryCode = productCategoryCode;
    }

    /**
     * [get] PRODUCT_STATUS_CODE: {IX, NotNull, CHAR(3), FK to PRODUCT_STATUS, classification=ProductStatus} <br />
     * @return The value of the column 'PRODUCT_STATUS_CODE'. (basically NotNull if selected: for the constraint)
     */
    def getProductStatusCode(): String = {
        return convertEmptyToNull(_productStatusCode);
    }

    /**
     * [set] PRODUCT_STATUS_CODE: {IX, NotNull, CHAR(3), FK to PRODUCT_STATUS, classification=ProductStatus} <br />
     * @param productStatusCode The value of the column 'PRODUCT_STATUS_CODE'. (basically NotNull if update: for the constraint)
     */
    protected def setProductStatusCode(productStatusCode: String): Unit = {
        checkClassificationCode("PRODUCT_STATUS_CODE", CDef.DefMeta.ProductStatus, productStatusCode);
        __modifiedProperties.addPropertyName("productStatusCode");
        _productStatusCode = productStatusCode;
    }

    /**
     * [get] (定価)REGULAR_PRICE: {NotNull, INTEGER(10)} <br />
     * @return The value of the column 'REGULAR_PRICE'. (basically NotNull if selected: for the constraint)
     */
    def getRegularPrice(): Integer = {
        return _regularPrice;
    }

    /**
     * [set] (定価)REGULAR_PRICE: {NotNull, INTEGER(10)} <br />
     * @param regularPrice The value of the column 'REGULAR_PRICE'. (basically NotNull if update: for the constraint)
     */
    def setRegularPrice(regularPrice: Integer): Unit = {
        __modifiedProperties.addPropertyName("regularPrice");
        _regularPrice = regularPrice;
    }

    /**
     * [get] REGISTER_DATETIME: {NotNull, TIMESTAMP(23, 10)} <br />
     * @return The value of the column 'REGISTER_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    def getRegisterDatetime(): org.joda.time.LocalDateTime = {
        return _registerDatetime;
    }

    /**
     * [set] REGISTER_DATETIME: {NotNull, TIMESTAMP(23, 10)} <br />
     * @param registerDatetime The value of the column 'REGISTER_DATETIME'. (basically NotNull if update: for the constraint)
     */
    def setRegisterDatetime(registerDatetime: org.joda.time.LocalDateTime): Unit = {
        __modifiedProperties.addPropertyName("registerDatetime");
        _registerDatetime = registerDatetime;
    }

    /**
     * [get] REGISTER_USER: {NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'REGISTER_USER'. (basically NotNull if selected: for the constraint)
     */
    def getRegisterUser(): String = {
        return convertEmptyToNull(_registerUser);
    }

    /**
     * [set] REGISTER_USER: {NotNull, VARCHAR(200)} <br />
     * @param registerUser The value of the column 'REGISTER_USER'. (basically NotNull if update: for the constraint)
     */
    def setRegisterUser(registerUser: String): Unit = {
        __modifiedProperties.addPropertyName("registerUser");
        _registerUser = registerUser;
    }

    /**
     * [get] UPDATE_DATETIME: {NotNull, TIMESTAMP(23, 10)} <br />
     * @return The value of the column 'UPDATE_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    def getUpdateDatetime(): org.joda.time.LocalDateTime = {
        return _updateDatetime;
    }

    /**
     * [set] UPDATE_DATETIME: {NotNull, TIMESTAMP(23, 10)} <br />
     * @param updateDatetime The value of the column 'UPDATE_DATETIME'. (basically NotNull if update: for the constraint)
     */
    def setUpdateDatetime(updateDatetime: org.joda.time.LocalDateTime): Unit = {
        __modifiedProperties.addPropertyName("updateDatetime");
        _updateDatetime = updateDatetime;
    }

    /**
     * [get] UPDATE_USER: {NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'UPDATE_USER'. (basically NotNull if selected: for the constraint)
     */
    def getUpdateUser(): String = {
        return convertEmptyToNull(_updateUser);
    }

    /**
     * [set] UPDATE_USER: {NotNull, VARCHAR(200)} <br />
     * @param updateUser The value of the column 'UPDATE_USER'. (basically NotNull if update: for the constraint)
     */
    def setUpdateUser(updateUser: String): Unit = {
        __modifiedProperties.addPropertyName("updateUser");
        _updateUser = updateUser;
    }

    /**
     * [get] VERSION_NO: {NotNull, BIGINT(19)} <br />
     * @return The value of the column 'VERSION_NO'. (basically NotNull if selected: for the constraint)
     */
    def getVersionNo(): Long = {
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {NotNull, BIGINT(19)} <br />
     * @param versionNo The value of the column 'VERSION_NO'. (basically NotNull if update: for the constraint)
     */
    def setVersionNo(versionNo: Long): Unit = {
        __modifiedProperties.addPropertyName("versionNo");
        _versionNo = versionNo;
    }

    /**
     * For framework so basically DON'T use this method.
     * @param productStatusCode The value of the column 'PRODUCT_STATUS_CODE'. (basically NotNull if update: for the constraint)
     */
    def mynativeMappingProductStatusCode(productStatusCode: String): Unit = {
        setProductStatusCode(productStatusCode);
    }

    protected def convertEmptyToNull(value: String): String = {
        return FunCustodial.convertEmptyToNull(value);
    }

    protected def checkClassificationCode(columnDbName: String, meta: CDef.DefMeta, value: Object): Unit = {
        FunCustodial.checkClassificationCode(this, columnDbName, meta, value);
    }
}
