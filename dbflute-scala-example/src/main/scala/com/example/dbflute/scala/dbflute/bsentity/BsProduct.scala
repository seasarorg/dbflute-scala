package com.example.dbflute.scala.dbflute.bsentity;

import scala.collection.immutable._;
import scala.collection.JavaConverters._;

import java.io.Serializable;
import java.util.Collection;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.FunCustodial;
import com.example.dbflute.scala.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.scala.dbflute.allcommon.CDef;
import com.example.dbflute.scala.dbflute.exentity._;

/**
 * The immutable entity of (商品)PRODUCT as TABLE. <br />
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
 * [get template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * val productId: Int = entity.productId
 * val productName: String = entity.productName
 * val productHandleCode: String = entity.productHandleCode
 * val productCategoryCode: String = entity.productCategoryCode
 * val productStatusCode: CDef.ProductStatus = entity.productStatusCode
 * val regularPrice: Int = entity.regularPrice
 * val registerDatetime: org.joda.time.LocalDateTime = entity.registerDatetime
 * val registerUser: String = entity.registerUser
 * val updateDatetime: org.joda.time.LocalDateTime = entity.updateDatetime
 * val updateUser: String = entity.updateUser
 * val versionNo: Long = entity.versionNo
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
abstract class BsProduct(dble: DbleProduct) extends Serializable {

    // ===================================================================================
    //                                                                           Case Like
    //                                                                           =========
    def copy(
         productId: Int = productId
        , productName: String = productName
        , productHandleCode: String = productHandleCode
        , productCategoryCode: String = productCategoryCode
        , productStatusCode: CDef.ProductStatus = productStatusCode
        , regularPrice: Int = regularPrice
        , registerDatetime: org.joda.time.LocalDateTime = registerDatetime
        , registerUser: String = registerUser
        , updateDatetime: org.joda.time.LocalDateTime = updateDatetime
        , updateUser: String = updateUser
        , versionNo: Long = versionNo
    ): Product = {
        val newDble = new DbleProduct
        newDble.myuniqueDrivenProperties.addAll(dble.myuniqueDrivenProperties) // inherit
        newDble.mymodifiedProperties.addAll(dble.mymodifiedProperties) // inherit
        if (!productId.equals(this.productId)) { newDble.setProductId(productId) }
        if (!productName.equals(this.productName)) { newDble.setProductName(productName) }
        if (!productHandleCode.equals(this.productHandleCode)) { newDble.setProductHandleCode(productHandleCode) }
        if (!productCategoryCode.equals(this.productCategoryCode)) { newDble.setProductCategoryCode(productCategoryCode) }
        if (!productStatusCode.equals(this.productStatusCode)) { newDble.setProductStatusCodeAsProductStatus(productStatusCode) }
        if (!regularPrice.equals(this.regularPrice)) { newDble.setRegularPrice(regularPrice) }
        if (!registerDatetime.equals(this.registerDatetime)) { newDble.setRegisterDatetime(registerDatetime) }
        if (!registerUser.equals(this.registerUser)) { newDble.setRegisterUser(registerUser) }
        if (!updateDatetime.equals(this.updateDatetime)) { newDble.setUpdateDatetime(updateDatetime) }
        if (!updateUser.equals(this.updateUser)) { newDble.setUpdateUser(updateUser) }
        if (!versionNo.equals(this.versionNo)) { newDble.setVersionNo(versionNo) }
        new Product(newDble)
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
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of productStatusCode as the classification of ProductStatus. <br />
     * PRODUCT_STATUS_CODE: {IX, NotNull, CHAR(3), FK to PRODUCT_STATUS, classification=ProductStatus} <br />
     * status for product
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    def productStatusCodeAsProductStatus: CDef.ProductStatus = { dble.getProductStatusCodeAsProductStatus }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of productStatusCode ProductionSale? <br />
     * ProductionSale
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isProductStatusCode_ProductionSale: Boolean = { dble.isProductStatusCode_ProductionSale }

    /**
     * Is the value of productStatusCode StopProduction? <br />
     * StopProduction
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isProductStatusCode_StopProduction: Boolean = { dble.isProductStatusCode_StopProduction }

    /**
     * Is the value of productStatusCode StopSale? <br />
     * StopSale
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isProductStatusCode_StopSale: Boolean = { dble.isProductStatusCode_StopSale }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /**
     * [get] (商品カテゴリ)PRODUCT_CATEGORY by my PRODUCT_CATEGORY_CODE, named 'productCategory'.
     * @return The entity of foreign property 'productCategory'. (EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    def productCategory: Option[ProductCategory] = { dble.toImmutableProductCategory }

    /**
     * [get] (商品ステータス)PRODUCT_STATUS by my PRODUCT_STATUS_CODE, named 'productStatus'.
     * @return The entity of foreign property 'productStatus'. (EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    def productStatus: Option[ProductStatus] = { dble.toImmutableProductStatus }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /**
     * [get] (購入)PURCHASE by PRODUCT_ID, named 'purchaseList'.
     * @return The entity list of referrer property 'purchaseList'. (NotNull: even if no loading, returns empty list)
     */
    def purchaseList: List[Purchase] = { dble.toImmutablePurchaseList }

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
            case obj: BsProduct => {
                val other: BsProduct = obj.asInstanceOf[BsProduct];
                {(
                     xSV(productId, other.productId)
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
     * [get] PRODUCT_ID: {PK, ID, NotNull, INTEGER(10)} <br />
     * @return The value of the column 'PRODUCT_ID'. (NotNull but EmptyAllowed if null in database)
     */
    def productId: Int = { dble.getProductId }

    /**
     * [get] (商品名称)PRODUCT_NAME: {IX, NotNull, VARCHAR(50)} <br />
     * @return The value of the column 'PRODUCT_NAME'. (NotNull but EmptyAllowed if null in database)
     */
    def productName: String = { dble.getProductName }

    /**
     * [get] (商品ハンドルコード)PRODUCT_HANDLE_CODE: {UQ, NotNull, VARCHAR(100)} <br />
     * @return The value of the column 'PRODUCT_HANDLE_CODE'. (NotNull but EmptyAllowed if null in database)
     */
    def productHandleCode: String = { dble.getProductHandleCode }

    /**
     * [get] PRODUCT_CATEGORY_CODE: {IX, NotNull, CHAR(3), FK to PRODUCT_CATEGORY} <br />
     * @return The value of the column 'PRODUCT_CATEGORY_CODE'. (NotNull but EmptyAllowed if null in database)
     */
    def productCategoryCode: String = { dble.getProductCategoryCode }

    /**
     * [get] PRODUCT_STATUS_CODE: {IX, NotNull, CHAR(3), FK to PRODUCT_STATUS, classification=ProductStatus} <br />
     * @return The value of the column 'PRODUCT_STATUS_CODE'. (NotNull but EmptyAllowed if null in database)
     */
    def productStatusCode: CDef.ProductStatus = { dble.getProductStatusCodeAsProductStatus }

    /**
     * [get] (定価)REGULAR_PRICE: {NotNull, INTEGER(10)} <br />
     * @return The value of the column 'REGULAR_PRICE'. (NotNull but EmptyAllowed if null in database)
     */
    def regularPrice: Int = { dble.getRegularPrice }

    /**
     * [get] REGISTER_DATETIME: {NotNull, TIMESTAMP(23, 10)} <br />
     * @return The value of the column 'REGISTER_DATETIME'. (NotNull but EmptyAllowed if null in database)
     */
    def registerDatetime: org.joda.time.LocalDateTime = { dble.getRegisterDatetime }

    /**
     * [get] REGISTER_USER: {NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'REGISTER_USER'. (NotNull but EmptyAllowed if null in database)
     */
    def registerUser: String = { dble.getRegisterUser }

    /**
     * [get] UPDATE_DATETIME: {NotNull, TIMESTAMP(23, 10)} <br />
     * @return The value of the column 'UPDATE_DATETIME'. (NotNull but EmptyAllowed if null in database)
     */
    def updateDatetime: org.joda.time.LocalDateTime = { dble.getUpdateDatetime }

    /**
     * [get] UPDATE_USER: {NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'UPDATE_USER'. (NotNull but EmptyAllowed if null in database)
     */
    def updateUser: String = { dble.getUpdateUser }

    /**
     * [get] VERSION_NO: {NotNull, BIGINT(19)} <br />
     * @return The value of the column 'VERSION_NO'. (NotNull but EmptyAllowed if null in database)
     */
    def versionNo: Long = { dble.getVersionNo }
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
 * The mutable entity of (商品)PRODUCT as TABLE. <br />
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * val productId: Int = entity.productId
 * val productName: String = entity.productName
 * val productHandleCode: String = entity.productHandleCode
 * val productCategoryCode: String = entity.productCategoryCode
 * val productStatusCode: CDef.ProductStatus = entity.productStatusCode
 * val regularPrice: Int = entity.regularPrice
 * val registerDatetime: org.joda.time.LocalDateTime = entity.registerDatetime
 * val registerUser: String = entity.registerUser
 * val updateDatetime: org.joda.time.LocalDateTime = entity.updateDatetime
 * val updateUser: String = entity.updateUser
 * val versionNo: Long = entity.versionNo
 * entity.productId = productId
 * entity.productName = productName
 * entity.productHandleCode = productHandleCode
 * entity.productCategoryCode = productCategoryCode
 * entity.productStatusCode = productStatusCode
 * entity.regularPrice = regularPrice
 * entity.registerDatetime = registerDatetime
 * entity.registerUser = registerUser
 * entity.updateDatetime = updateDatetime
 * entity.updateUser = updateUser
 * entity.versionNo = versionNo
 * = = = = = = = = = =/
 * @author DBFlute(AutoGenerator)
 */
abstract class BsMbleProduct {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected val dble: DbleProduct = new DbleProduct();

    // ===================================================================================
    //                                                                      DB-able Entity
    //                                                                      ==============
    def toDBable(): DbleProduct = { dble }

    // ===================================================================================
    //                                                                    Immutable Entity
    //                                                                    ================
    def toImmutable(): Product = { dble.toImmutable() }

    // ===================================================================================
    //                                                                          Unique Key
    //                                                                          ==========
    /**
     * To be unique by the unique column. <br />
     * You can update the entity by the key when entity update (NOT batch update).
     * @param productHandleCode (商品ハンドルコード): UQ, NotNull, VARCHAR(100). (NotNull)
     */
    def uniqueBy(productHandleCode: String): Unit = { dble.setProductHandleCode(productHandleCode); }

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
    def productStatusCodeAsProductStatus: CDef.ProductStatus = { dble.getProductStatusCodeAsProductStatus }

    /**
     * Set the value of productStatusCode as the classification of ProductStatus. <br />
     * PRODUCT_STATUS_CODE: {IX, NotNull, CHAR(3), FK to PRODUCT_STATUS, classification=ProductStatus} <br />
     * status for product
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    def productStatusCodeAsProductStatus_=(cdef: CDef.ProductStatus): Unit = { dble.setProductStatusCodeAsProductStatus(cdef) }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of productStatusCode as ProductionSale (ONS). <br />
     * ProductionSale
     */
    def productStatusCode_ProductionSale: Unit = { dble.setProductStatusCode_ProductionSale }

    /**
     * Set the value of productStatusCode as StopProduction (PST). <br />
     * StopProduction
     */
    def productStatusCode_StopProduction: Unit = { dble.setProductStatusCode_StopProduction }

    /**
     * Set the value of productStatusCode as StopSale (SST). <br />
     * StopSale
     */
    def productStatusCode_StopSale: Unit = { dble.setProductStatusCode_StopSale }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of productStatusCode ProductionSale? <br />
     * ProductionSale
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isProductStatusCode_ProductionSale: Boolean = { dble.isProductStatusCode_ProductionSale }

    /**
     * Is the value of productStatusCode StopProduction? <br />
     * StopProduction
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isProductStatusCode_StopProduction: Boolean = { dble.isProductStatusCode_StopProduction }

    /**
     * Is the value of productStatusCode StopSale? <br />
     * StopSale
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isProductStatusCode_StopSale: Boolean = { dble.isProductStatusCode_StopSale }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PRODUCT_ID: {PK, ID, NotNull, INTEGER(10)} <br />
     * @return The value of the column 'PRODUCT_ID'. (basically NotNull if selected: for the constraint)
     */
    def productId: Int = { dble.getProductId }

    /**
     * [set] PRODUCT_ID: {PK, ID, NotNull, INTEGER(10)} <br />
     * @param productId The value of the column 'PRODUCT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    def productId_=(productId: Int) = { dble.setProductId(productId) }

    /**
     * [get] (商品名称)PRODUCT_NAME: {IX, NotNull, VARCHAR(50)} <br />
     * @return The value of the column 'PRODUCT_NAME'. (basically NotNull if selected: for the constraint)
     */
    def productName: String = { dble.getProductName }

    /**
     * [set] (商品名称)PRODUCT_NAME: {IX, NotNull, VARCHAR(50)} <br />
     * @param productName The value of the column 'PRODUCT_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    def productName_=(productName: String) = { dble.setProductName(productName) }

    /**
     * [get] (商品ハンドルコード)PRODUCT_HANDLE_CODE: {UQ, NotNull, VARCHAR(100)} <br />
     * @return The value of the column 'PRODUCT_HANDLE_CODE'. (basically NotNull if selected: for the constraint)
     */
    def productHandleCode: String = { dble.getProductHandleCode }

    /**
     * [set] (商品ハンドルコード)PRODUCT_HANDLE_CODE: {UQ, NotNull, VARCHAR(100)} <br />
     * @param productHandleCode The value of the column 'PRODUCT_HANDLE_CODE'. (NullAllowed: null update allowed for no constraint)
     */
    def productHandleCode_=(productHandleCode: String) = { dble.setProductHandleCode(productHandleCode) }

    /**
     * [get] PRODUCT_CATEGORY_CODE: {IX, NotNull, CHAR(3), FK to PRODUCT_CATEGORY} <br />
     * @return The value of the column 'PRODUCT_CATEGORY_CODE'. (basically NotNull if selected: for the constraint)
     */
    def productCategoryCode: String = { dble.getProductCategoryCode }

    /**
     * [set] PRODUCT_CATEGORY_CODE: {IX, NotNull, CHAR(3), FK to PRODUCT_CATEGORY} <br />
     * @param productCategoryCode The value of the column 'PRODUCT_CATEGORY_CODE'. (NullAllowed: null update allowed for no constraint)
     */
    def productCategoryCode_=(productCategoryCode: String) = { dble.setProductCategoryCode(productCategoryCode) }

    /**
     * [get] PRODUCT_STATUS_CODE: {IX, NotNull, CHAR(3), FK to PRODUCT_STATUS, classification=ProductStatus} <br />
     * @return The value of the column 'PRODUCT_STATUS_CODE'. (basically NotNull if selected: for the constraint)
     */
    def productStatusCode: CDef.ProductStatus = { dble.getProductStatusCodeAsProductStatus }

    /**
     * [set] PRODUCT_STATUS_CODE: {IX, NotNull, CHAR(3), FK to PRODUCT_STATUS, classification=ProductStatus} <br />
     * @param productStatusCode The value of the column 'PRODUCT_STATUS_CODE'. (NullAllowed: null update allowed for no constraint)
     */
    protected def productStatusCode_=(productStatusCode: CDef.ProductStatus) = { dble.setProductStatusCodeAsProductStatus(productStatusCode) }

    /**
     * [get] (定価)REGULAR_PRICE: {NotNull, INTEGER(10)} <br />
     * @return The value of the column 'REGULAR_PRICE'. (basically NotNull if selected: for the constraint)
     */
    def regularPrice: Int = { dble.getRegularPrice }

    /**
     * [set] (定価)REGULAR_PRICE: {NotNull, INTEGER(10)} <br />
     * @param regularPrice The value of the column 'REGULAR_PRICE'. (NullAllowed: null update allowed for no constraint)
     */
    def regularPrice_=(regularPrice: Int) = { dble.setRegularPrice(regularPrice) }

    /**
     * [get] REGISTER_DATETIME: {NotNull, TIMESTAMP(23, 10)} <br />
     * @return The value of the column 'REGISTER_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    def registerDatetime: org.joda.time.LocalDateTime = { dble.getRegisterDatetime }

    /**
     * [set] REGISTER_DATETIME: {NotNull, TIMESTAMP(23, 10)} <br />
     * @param registerDatetime The value of the column 'REGISTER_DATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    def registerDatetime_=(registerDatetime: org.joda.time.LocalDateTime) = { dble.setRegisterDatetime(registerDatetime) }

    /**
     * [get] REGISTER_USER: {NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'REGISTER_USER'. (basically NotNull if selected: for the constraint)
     */
    def registerUser: String = { dble.getRegisterUser }

    /**
     * [set] REGISTER_USER: {NotNull, VARCHAR(200)} <br />
     * @param registerUser The value of the column 'REGISTER_USER'. (NullAllowed: null update allowed for no constraint)
     */
    def registerUser_=(registerUser: String) = { dble.setRegisterUser(registerUser) }

    /**
     * [get] UPDATE_DATETIME: {NotNull, TIMESTAMP(23, 10)} <br />
     * @return The value of the column 'UPDATE_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    def updateDatetime: org.joda.time.LocalDateTime = { dble.getUpdateDatetime }

    /**
     * [set] UPDATE_DATETIME: {NotNull, TIMESTAMP(23, 10)} <br />
     * @param updateDatetime The value of the column 'UPDATE_DATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    def updateDatetime_=(updateDatetime: org.joda.time.LocalDateTime) = { dble.setUpdateDatetime(updateDatetime) }

    /**
     * [get] UPDATE_USER: {NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'UPDATE_USER'. (basically NotNull if selected: for the constraint)
     */
    def updateUser: String = { dble.getUpdateUser }

    /**
     * [set] UPDATE_USER: {NotNull, VARCHAR(200)} <br />
     * @param updateUser The value of the column 'UPDATE_USER'. (NullAllowed: null update allowed for no constraint)
     */
    def updateUser_=(updateUser: String) = { dble.setUpdateUser(updateUser) }

    /**
     * [get] VERSION_NO: {NotNull, BIGINT(19)} <br />
     * @return The value of the column 'VERSION_NO'. (basically NotNull if selected: for the constraint)
     */
    def versionNo: Long = { dble.getVersionNo }

    /**
     * [set] VERSION_NO: {NotNull, BIGINT(19)} <br />
     * @param versionNo The value of the column 'VERSION_NO'. (NullAllowed: null update allowed for no constraint)
     */
    def versionNo_=(versionNo: Long) = { dble.setVersionNo(versionNo) }
}
