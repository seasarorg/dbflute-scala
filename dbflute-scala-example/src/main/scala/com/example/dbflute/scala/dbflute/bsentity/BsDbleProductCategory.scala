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
 * The entity of (商品カテゴリ)PRODUCT_CATEGORY as TABLE. <br />
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
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * String productCategoryCode = entity.getProductCategoryCode();
 * String productCategoryName = entity.getProductCategoryName();
 * String parentCategoryCode = entity.getParentCategoryCode();
 * entity.setProductCategoryCode(productCategoryCode);
 * entity.setProductCategoryName(productCategoryName);
 * entity.setParentCategoryCode(parentCategoryCode);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
abstract class BsDbleProductCategory extends AbstractEntity with DBableEntity[ProductCategory] with Serializable with Cloneable {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** (商品カテゴリコード)PRODUCT_CATEGORY_CODE: {PK, NotNull, CHAR(3)} */
    protected var _productCategoryCode: String = null;

    /** (商品カテゴリ名称)PRODUCT_CATEGORY_NAME: {NotNull, VARCHAR(50)} */
    protected var _productCategoryName: String = null;

    /** (親カテゴリコード)PARENT_CATEGORY_CODE: {IX, CHAR(3), FK to PRODUCT_CATEGORY} */
    protected var _parentCategoryCode: String = null;

    // ===================================================================================
    //                                                                           Immutable
    //                                                                           =========
    /**
     * {@inheritDoc}
     */
    def acceptImmutable(immu: ProductCategory): DbleProductCategory = {
        setProductCategoryCode(immu.productCategoryCode);
        setProductCategoryName(immu.productCategoryName);
        setParentCategoryCode(immu.parentCategoryCode.orNull);
        setProductCategorySelf(immu.productCategorySelf.map(new DbleProductCategory().acceptImmutable(_)))
        setProductList(immu.productList.map(new DbleProduct().acceptImmutable(_)).asJava)
        setProductCategorySelfList(immu.productCategorySelfList.map(new DbleProductCategory().acceptImmutable(_)).asJava)
        __uniqueDrivenProperties.clear();
        immu.getMyUniqueDrivenProperties().foreach(__uniqueDrivenProperties.addPropertyName(_))
        __modifiedProperties.clear();
        immu.getMyModifiedProperties().foreach(__modifiedProperties.addPropertyName(_))
        return this.asInstanceOf[DbleProductCategory];
    }

    /**
     * {@inheritDoc}
     */
    def toImmutable(): ProductCategory = {
        return new ProductCategory(this.asInstanceOf[DbleProductCategory]);
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    def getTableDbName(): String = {
        return "PRODUCT_CATEGORY";
    }

    /**
     * {@inheritDoc}
     */
    def getTablePropertyName(): String = {
        return "productCategory";
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
        if (getProductCategoryCode() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** (商品カテゴリ)PRODUCT_CATEGORY by my PARENT_CATEGORY_CODE, named 'productCategorySelf'. */
    protected var _productCategorySelf: Option[DbleProductCategory] = null;

    /**
     * [get] (商品カテゴリ)PRODUCT_CATEGORY by my PARENT_CATEGORY_CODE, named 'productCategorySelf'.
     * @return The entity of foreign property 'productCategorySelf'. (EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    def getProductCategorySelf(): Option[DbleProductCategory] = {
        return if (_productCategorySelf != null) { _productCategorySelf; } else { Option.empty; }
    }

    /**
     * [set] (商品カテゴリ)PRODUCT_CATEGORY by my PARENT_CATEGORY_CODE, named 'productCategorySelf'.
     * @param productCategorySelf The entity of foreign property 'productCategorySelf'. (EmptyAllowed)
     */
    def setProductCategorySelf(productCategorySelf: Option[DbleProductCategory]): Unit = {
        _productCategorySelf = productCategorySelf;
    }

    /**
     * [convert] (商品カテゴリ)PRODUCT_CATEGORY by my PARENT_CATEGORY_CODE, named 'productCategorySelf'.
     * @return The new-created immutable entity of foreign property 'productCategorySelf'. (NotNull)
     */
    def toImmutableProductCategorySelf(): Option[ProductCategory] = {
        return getProductCategorySelf().map(_.toImmutable());
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** (商品)PRODUCT by PRODUCT_CATEGORY_CODE, named 'productList'. */
    protected var _productList: List[DbleProduct] = null;

    /**
     * [get] (商品)PRODUCT by PRODUCT_CATEGORY_CODE, named 'productList'.
     * @return The entity list of referrer property 'productList'. (NotNull: even if no loading, returns empty list)
     */
    def getProductList(): List[DbleProduct] = {
        if (_productList == null) { _productList = newReferrerScalaList(); }
        return _productList;
    }

    /**
     * [set] (商品)PRODUCT by PRODUCT_CATEGORY_CODE, named 'productList'.
     * @param productList The entity list of referrer property 'productList'. (NullAllowed)
     */
    def setProductList(productList: List[DbleProduct]): Unit = {
        _productList = productList;
    }

    /**
     * [convert] (商品)PRODUCT by PRODUCT_CATEGORY_CODE, named 'productList'.
     * @return The new-created immutable list of immutable entity of the referrer property 'productList'. (NotNull)
     */
    def toImmutableProductList(): immutable.List[Product] = {
        return toScalaList(_productList).map(_.toImmutable());
    }

    /** (商品カテゴリ)PRODUCT_CATEGORY by PARENT_CATEGORY_CODE, named 'productCategorySelfList'. */
    protected var _productCategorySelfList: List[DbleProductCategory] = null;

    /**
     * [get] (商品カテゴリ)PRODUCT_CATEGORY by PARENT_CATEGORY_CODE, named 'productCategorySelfList'.
     * @return The entity list of referrer property 'productCategorySelfList'. (NotNull: even if no loading, returns empty list)
     */
    def getProductCategorySelfList(): List[DbleProductCategory] = {
        if (_productCategorySelfList == null) { _productCategorySelfList = newReferrerScalaList(); }
        return _productCategorySelfList;
    }

    /**
     * [set] (商品カテゴリ)PRODUCT_CATEGORY by PARENT_CATEGORY_CODE, named 'productCategorySelfList'.
     * @param productCategorySelfList The entity list of referrer property 'productCategorySelfList'. (NullAllowed)
     */
    def setProductCategorySelfList(productCategorySelfList: List[DbleProductCategory]): Unit = {
        _productCategorySelfList = productCategorySelfList;
    }

    /**
     * [convert] (商品カテゴリ)PRODUCT_CATEGORY by PARENT_CATEGORY_CODE, named 'productCategorySelfList'.
     * @return The new-created immutable list of immutable entity of the referrer property 'productCategorySelfList'. (NotNull)
     */
    def toImmutableProductCategorySelfList(): immutable.List[ProductCategory] = {
        return toScalaList(_productCategorySelfList).map(_.toImmutable());
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
            case obj: BsDbleProductCategory => {
                val other: BsDbleProductCategory = obj.asInstanceOf[BsDbleProductCategory];
                {(
                     xSV(getProductCategoryCode(), other.getProductCategoryCode())
                )}
            }
            case _ => false
        }
    }

    override protected def doHashCode(initial: Int): Int = {
        var hs: Int = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, getProductCategoryCode());
        return hs;
    }

    override protected def doBuildStringWithRelation(li: String): String = {
        val sb: StringBuilder = new StringBuilder();
        if (_productCategorySelf != null && _productCategorySelf.isEmpty)
        { sb.append(li).append(xbRDS(_productCategorySelf, "productCategorySelf")); }
        toScalaList(_productList).foreach(et => { if (et != null) { sb.append(li).append(xbRDS(et, "productList")) } });
        toScalaList(_productCategorySelfList).foreach(et => { if (et != null) { sb.append(li).append(xbRDS(et, "productCategorySelfList")) } });
        return sb.toString();
    }
    protected def xbRDS[ET <: Entity](et: Option[ET], name: String): String = {
        return et.get.buildDisplayString(name, true, true);
    }

    override protected def doBuildColumnString(dm: String): String = {
        val sb: StringBuilder = new StringBuilder();
        sb.append(dm).append(getProductCategoryCode());
        sb.append(dm).append(getProductCategoryName());
        sb.append(dm).append(getParentCategoryCode());
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    override protected def doBuildRelationString(dm: String): String = {
        val sb: StringBuilder = new StringBuilder();
        if (_productCategorySelf != null && _productCategorySelf.isEmpty)
        { sb.append(dm).append("productCategorySelf"); }
        if (_productList != null && !_productList.isEmpty)
        { sb.append(dm).append("productList"); }
        if (_productCategorySelfList != null && !_productCategorySelfList.isEmpty)
        { sb.append(dm).append("productCategorySelfList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    override def clone(): DbleProductCategory = {
        return super.clone().asInstanceOf[DbleProductCategory];
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (商品カテゴリコード)PRODUCT_CATEGORY_CODE: {PK, NotNull, CHAR(3)} <br />
     * @return The value of the column 'PRODUCT_CATEGORY_CODE'. (basically NotNull if selected: for the constraint)
     */
    def getProductCategoryCode(): String = {
        return convertEmptyToNull(_productCategoryCode);
    }

    /**
     * [set] (商品カテゴリコード)PRODUCT_CATEGORY_CODE: {PK, NotNull, CHAR(3)} <br />
     * @param productCategoryCode The value of the column 'PRODUCT_CATEGORY_CODE'. (basically NotNull if update: for the constraint)
     */
    def setProductCategoryCode(productCategoryCode: String): Unit = {
        __modifiedProperties.addPropertyName("productCategoryCode");
        _productCategoryCode = productCategoryCode;
    }

    /**
     * [get] (商品カテゴリ名称)PRODUCT_CATEGORY_NAME: {NotNull, VARCHAR(50)} <br />
     * @return The value of the column 'PRODUCT_CATEGORY_NAME'. (basically NotNull if selected: for the constraint)
     */
    def getProductCategoryName(): String = {
        return convertEmptyToNull(_productCategoryName);
    }

    /**
     * [set] (商品カテゴリ名称)PRODUCT_CATEGORY_NAME: {NotNull, VARCHAR(50)} <br />
     * @param productCategoryName The value of the column 'PRODUCT_CATEGORY_NAME'. (basically NotNull if update: for the constraint)
     */
    def setProductCategoryName(productCategoryName: String): Unit = {
        __modifiedProperties.addPropertyName("productCategoryName");
        _productCategoryName = productCategoryName;
    }

    /**
     * [get] (親カテゴリコード)PARENT_CATEGORY_CODE: {IX, CHAR(3), FK to PRODUCT_CATEGORY} <br />
     * @return The value of the column 'PARENT_CATEGORY_CODE'. (NullAllowed even if selected: for no constraint)
     */
    def getParentCategoryCode(): String = {
        return convertEmptyToNull(_parentCategoryCode);
    }

    /**
     * [set] (親カテゴリコード)PARENT_CATEGORY_CODE: {IX, CHAR(3), FK to PRODUCT_CATEGORY} <br />
     * @param parentCategoryCode The value of the column 'PARENT_CATEGORY_CODE'. (NullAllowed: null update allowed for no constraint)
     */
    def setParentCategoryCode(parentCategoryCode: String): Unit = {
        __modifiedProperties.addPropertyName("parentCategoryCode");
        _parentCategoryCode = parentCategoryCode;
    }
}
