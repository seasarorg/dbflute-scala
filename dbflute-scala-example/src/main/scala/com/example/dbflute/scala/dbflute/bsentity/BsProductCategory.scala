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
 * The immutable entity of (商品カテゴリ)PRODUCT_CATEGORY as TABLE. <br />
 * <pre>
 * [primary-key]
 *     PRODUCT_CATEGORY_CODE
 * 
 * [column]
 *     PRODUCT_CATEGORY_CODE, PRODUCT_CATEGORY_NAME, PARENT_CATEGORY_CODE
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
 *     PRODUCT_CATEGORY
 * 
 * [referrer table]
 *     PRODUCT, PRODUCT_CATEGORY
 * 
 * [foreign property]
 *     productCategorySelf
 * 
 * [referrer property]
 *     productList, productCategorySelfList
 * 
 * [get template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * val productCategoryCode: String = entity.productCategoryCode
 * val productCategoryName: String = entity.productCategoryName
 * val parentCategoryCode: Option[String] = entity.parentCategoryCode
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
abstract class BsProductCategory(dble: DbleProductCategory) extends Serializable {

    // ===================================================================================
    //                                                                           Case Like
    //                                                                           =========
    def copy(
         productCategoryCode: String = productCategoryCode
        , productCategoryName: String = productCategoryName
        , parentCategoryCode: Option[String] = parentCategoryCode
    ): ProductCategory = {
        val newDble = new DbleProductCategory
        newDble.myuniqueDrivenProperties.addAll(dble.myuniqueDrivenProperties) // inherit
        newDble.mymodifiedProperties.addAll(dble.mymodifiedProperties) // inherit
        if (!productCategoryCode.equals(this.productCategoryCode)) { newDble.setProductCategoryCode(productCategoryCode) }
        if (!productCategoryName.equals(this.productCategoryName)) { newDble.setProductCategoryName(productCategoryName) }
        if (!parentCategoryCode.equals(this.parentCategoryCode)) { newDble.setParentCategoryCode(parentCategoryCode.orNull) }
        new ProductCategory(newDble)
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
    /**
     * [get] (商品カテゴリ)PRODUCT_CATEGORY by my PARENT_CATEGORY_CODE, named 'productCategorySelf'.
     * @return The entity of foreign property 'productCategorySelf'. (EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    def productCategorySelf: Option[ProductCategory] = { dble.toImmutableProductCategorySelf }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /**
     * [get] (商品)PRODUCT by PRODUCT_CATEGORY_CODE, named 'productList'.
     * @return The entity list of referrer property 'productList'. (NotNull: even if no loading, returns empty list)
     */
    def productList: List[Product] = { dble.toImmutableProductList }

    /**
     * [get] (商品カテゴリ)PRODUCT_CATEGORY by PARENT_CATEGORY_CODE, named 'productCategorySelfList'.
     * @return The entity list of referrer property 'productCategorySelfList'. (NotNull: even if no loading, returns empty list)
     */
    def productCategorySelfList: List[ProductCategory] = { dble.toImmutableProductCategorySelfList }

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
            case obj: BsProductCategory => {
                val other: BsProductCategory = obj.asInstanceOf[BsProductCategory];
                {(
                     xSV(productCategoryCode, other.productCategoryCode)
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
     * [get] (商品カテゴリコード)PRODUCT_CATEGORY_CODE: {PK, NotNull, CHAR(3)} <br />
     * @return The value of the column 'PRODUCT_CATEGORY_CODE'. (NotNull but EmptyAllowed if null in database)
     */
    def productCategoryCode: String = { dble.getProductCategoryCode }

    /**
     * [get] (商品カテゴリ名称)PRODUCT_CATEGORY_NAME: {NotNull, VARCHAR(50)} <br />
     * @return The value of the column 'PRODUCT_CATEGORY_NAME'. (NotNull but EmptyAllowed if null in database)
     */
    def productCategoryName: String = { dble.getProductCategoryName }

    /**
     * [get] (親カテゴリコード)PARENT_CATEGORY_CODE: {IX, CHAR(3), FK to PRODUCT_CATEGORY} <br />
     * @return The value of the column 'PARENT_CATEGORY_CODE'. (basically NotNull if selected: for the constraint)
     */
    def parentCategoryCode: Option[String] = { Option(dble.getParentCategoryCode) }
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
 * The mutable entity of (商品カテゴリ)PRODUCT_CATEGORY as TABLE. <br />
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * val productCategoryCode: String = entity.productCategoryCode
 * val productCategoryName: String = entity.productCategoryName
 * val parentCategoryCode: Option[String] = entity.parentCategoryCode
 * entity.productCategoryCode = productCategoryCode
 * entity.productCategoryName = productCategoryName
 * entity.parentCategoryCode = parentCategoryCode
 * = = = = = = = = = =/
 * @author DBFlute(AutoGenerator)
 */
abstract class BsMbleProductCategory {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected val dble: DbleProductCategory = new DbleProductCategory();

    // ===================================================================================
    //                                                                      DB-able Entity
    //                                                                      ==============
    def toDBable(): DbleProductCategory = { dble }

    // ===================================================================================
    //                                                                    Immutable Entity
    //                                                                    ================
    def toImmutable(): ProductCategory = { dble.toImmutable() }

    // ===================================================================================
    //                                                                          Unique Key
    //                                                                          ==========
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (商品カテゴリコード)PRODUCT_CATEGORY_CODE: {PK, NotNull, CHAR(3)} <br />
     * @return The value of the column 'PRODUCT_CATEGORY_CODE'. (basically NotNull if selected: for the constraint)
     */
    def productCategoryCode: String = { dble.getProductCategoryCode }

    /**
     * [set] (商品カテゴリコード)PRODUCT_CATEGORY_CODE: {PK, NotNull, CHAR(3)} <br />
     * @param productCategoryCode The value of the column 'PRODUCT_CATEGORY_CODE'. (NullAllowed: null update allowed for no constraint)
     */
    def productCategoryCode_=(productCategoryCode: String) = { dble.setProductCategoryCode(productCategoryCode) }

    /**
     * [get] (商品カテゴリ名称)PRODUCT_CATEGORY_NAME: {NotNull, VARCHAR(50)} <br />
     * @return The value of the column 'PRODUCT_CATEGORY_NAME'. (basically NotNull if selected: for the constraint)
     */
    def productCategoryName: String = { dble.getProductCategoryName }

    /**
     * [set] (商品カテゴリ名称)PRODUCT_CATEGORY_NAME: {NotNull, VARCHAR(50)} <br />
     * @param productCategoryName The value of the column 'PRODUCT_CATEGORY_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    def productCategoryName_=(productCategoryName: String) = { dble.setProductCategoryName(productCategoryName) }

    /**
     * [get] (親カテゴリコード)PARENT_CATEGORY_CODE: {IX, CHAR(3), FK to PRODUCT_CATEGORY} <br />
     * @return The value of the column 'PARENT_CATEGORY_CODE'. (NotNull but EmptyAllowed if null in database)
     */
    def parentCategoryCode: Option[String] = { Option(dble.getParentCategoryCode) }

    /**
     * [set] (親カテゴリコード)PARENT_CATEGORY_CODE: {IX, CHAR(3), FK to PRODUCT_CATEGORY} <br />
     * @param parentCategoryCode The value of the column 'PARENT_CATEGORY_CODE'. (basically NotNull if update: for the constraint)
     */
    def parentCategoryCode_=(parentCategoryCode: Option[String]) = { dble.setParentCategoryCode(parentCategoryCode.orNull) }
}
