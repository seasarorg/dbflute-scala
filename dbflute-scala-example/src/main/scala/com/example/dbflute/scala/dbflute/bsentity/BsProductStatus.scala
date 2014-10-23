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
 * The immutable entity of (商品ステータス)PRODUCT_STATUS as TABLE. <br />
 * <pre>
 * [primary-key]
 *     PRODUCT_STATUS_CODE
 * 
 * [column]
 *     PRODUCT_STATUS_CODE, PRODUCT_STATUS_NAME, DISPLAY_ORDER
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
 *     PRODUCT
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     productList
 * 
 * [get template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * val productStatusCode: CDef.ProductStatus = entity.productStatusCode
 * val productStatusName: String = entity.productStatusName
 * val displayOrder: Int = entity.displayOrder
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
abstract class BsProductStatus(dble: DbleProductStatus) extends Serializable {

    // ===================================================================================
    //                                                                           Case Like
    //                                                                           =========
    def copy(
         productStatusCode: CDef.ProductStatus = productStatusCode
        , productStatusName: String = productStatusName
        , displayOrder: Int = displayOrder
    ): ProductStatus = {
        val newDble = new DbleProductStatus
        newDble.myuniqueDrivenProperties.addAll(dble.myuniqueDrivenProperties) // inherit
        newDble.mymodifiedProperties.addAll(dble.mymodifiedProperties) // inherit
        if (!productStatusCode.equals(this.productStatusCode)) { newDble.setProductStatusCodeAsProductStatus(productStatusCode) }
        if (!productStatusName.equals(this.productStatusName)) { newDble.setProductStatusName(productStatusName) }
        if (!displayOrder.equals(this.displayOrder)) { newDble.setDisplayOrder(displayOrder) }
        new ProductStatus(newDble)
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
     * (商品ステータスコード)PRODUCT_STATUS_CODE: {PK, NotNull, CHAR(3), classification=ProductStatus} <br />
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
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /**
     * [get] (商品)PRODUCT by PRODUCT_STATUS_CODE, named 'productList'.
     * @return The entity list of referrer property 'productList'. (NotNull: even if no loading, returns empty list)
     */
    def productList: List[Product] = { dble.toImmutableProductList }

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
            case obj: BsProductStatus => {
                val other: BsProductStatus = obj.asInstanceOf[BsProductStatus];
                {(
                     xSV(productStatusCode, other.productStatusCode)
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
     * [get] (商品ステータスコード)PRODUCT_STATUS_CODE: {PK, NotNull, CHAR(3), classification=ProductStatus} <br />
     * @return The value of the column 'PRODUCT_STATUS_CODE'. (NotNull but EmptyAllowed if null in database)
     */
    def productStatusCode: CDef.ProductStatus = { dble.getProductStatusCodeAsProductStatus }

    /**
     * [get] (商品ステータス名称)PRODUCT_STATUS_NAME: {NotNull, VARCHAR(50)} <br />
     * @return The value of the column 'PRODUCT_STATUS_NAME'. (NotNull but EmptyAllowed if null in database)
     */
    def productStatusName: String = { dble.getProductStatusName }

    /**
     * [get] (表示順)DISPLAY_ORDER: {UQ, NotNull, INTEGER(10)} <br />
     * @return The value of the column 'DISPLAY_ORDER'. (NotNull but EmptyAllowed if null in database)
     */
    def displayOrder: Int = { dble.getDisplayOrder }
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
 * The mutable entity of (商品ステータス)PRODUCT_STATUS as TABLE. <br />
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * val productStatusCode: CDef.ProductStatus = entity.productStatusCode
 * val productStatusName: String = entity.productStatusName
 * val displayOrder: Int = entity.displayOrder
 * entity.productStatusCode = productStatusCode
 * entity.productStatusName = productStatusName
 * entity.displayOrder = displayOrder
 * = = = = = = = = = =/
 * @author DBFlute(AutoGenerator)
 */
abstract class BsMbleProductStatus {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected val dble: DbleProductStatus = new DbleProductStatus();

    // ===================================================================================
    //                                                                      DB-able Entity
    //                                                                      ==============
    def toDBable(): DbleProductStatus = { dble }

    // ===================================================================================
    //                                                                    Immutable Entity
    //                                                                    ================
    def toImmutable(): ProductStatus = { dble.toImmutable() }

    // ===================================================================================
    //                                                                          Unique Key
    //                                                                          ==========
    /**
     * To be unique by the unique column. <br />
     * You can update the entity by the key when entity update (NOT batch update).
     * @param displayOrder (表示順): UQ, NotNull, INTEGER(10). (NotNull)
     */
    def uniqueBy(displayOrder: Integer): Unit = { dble.setDisplayOrder(displayOrder); }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of productStatusCode as the classification of ProductStatus. <br />
     * (商品ステータスコード)PRODUCT_STATUS_CODE: {PK, NotNull, CHAR(3), classification=ProductStatus} <br />
     * status for product
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    def productStatusCodeAsProductStatus: CDef.ProductStatus = { dble.getProductStatusCodeAsProductStatus }

    /**
     * Set the value of productStatusCode as the classification of ProductStatus. <br />
     * (商品ステータスコード)PRODUCT_STATUS_CODE: {PK, NotNull, CHAR(3), classification=ProductStatus} <br />
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
     * [get] (商品ステータスコード)PRODUCT_STATUS_CODE: {PK, NotNull, CHAR(3), classification=ProductStatus} <br />
     * @return The value of the column 'PRODUCT_STATUS_CODE'. (basically NotNull if selected: for the constraint)
     */
    def productStatusCode: CDef.ProductStatus = { dble.getProductStatusCodeAsProductStatus }

    /**
     * [set] (商品ステータスコード)PRODUCT_STATUS_CODE: {PK, NotNull, CHAR(3), classification=ProductStatus} <br />
     * @param productStatusCode The value of the column 'PRODUCT_STATUS_CODE'. (NullAllowed: null update allowed for no constraint)
     */
    protected def productStatusCode_=(productStatusCode: CDef.ProductStatus) = { dble.setProductStatusCodeAsProductStatus(productStatusCode) }

    /**
     * [get] (商品ステータス名称)PRODUCT_STATUS_NAME: {NotNull, VARCHAR(50)} <br />
     * @return The value of the column 'PRODUCT_STATUS_NAME'. (basically NotNull if selected: for the constraint)
     */
    def productStatusName: String = { dble.getProductStatusName }

    /**
     * [set] (商品ステータス名称)PRODUCT_STATUS_NAME: {NotNull, VARCHAR(50)} <br />
     * @param productStatusName The value of the column 'PRODUCT_STATUS_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    def productStatusName_=(productStatusName: String) = { dble.setProductStatusName(productStatusName) }

    /**
     * [get] (表示順)DISPLAY_ORDER: {UQ, NotNull, INTEGER(10)} <br />
     * @return The value of the column 'DISPLAY_ORDER'. (basically NotNull if selected: for the constraint)
     */
    def displayOrder: Int = { dble.getDisplayOrder }

    /**
     * [set] (表示順)DISPLAY_ORDER: {UQ, NotNull, INTEGER(10)} <br />
     * @param displayOrder The value of the column 'DISPLAY_ORDER'. (NullAllowed: null update allowed for no constraint)
     */
    def displayOrder_=(displayOrder: Int) = { dble.setDisplayOrder(displayOrder) }
}
