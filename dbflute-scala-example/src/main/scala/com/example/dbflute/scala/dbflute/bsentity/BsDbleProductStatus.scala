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
import com.example.dbflute.scala.dbflute.allcommon.CDef;
import com.example.dbflute.scala.dbflute.exentity._;

/**
 * The entity of (商品ステータス)PRODUCT_STATUS as TABLE. <br />
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
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * String productStatusCode = entity.getProductStatusCode();
 * String productStatusName = entity.getProductStatusName();
 * Integer displayOrder = entity.getDisplayOrder();
 * entity.setProductStatusCode(productStatusCode);
 * entity.setProductStatusName(productStatusName);
 * entity.setDisplayOrder(displayOrder);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
abstract class BsDbleProductStatus extends AbstractEntity with DBableEntity[ProductStatus] with Serializable with Cloneable {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** (商品ステータスコード)PRODUCT_STATUS_CODE: {PK, NotNull, CHAR(3), classification=ProductStatus} */
    protected var _productStatusCode: String = null;

    /** (商品ステータス名称)PRODUCT_STATUS_NAME: {NotNull, VARCHAR(50)} */
    protected var _productStatusName: String = null;

    /** (表示順)DISPLAY_ORDER: {UQ, NotNull, INTEGER(10)} */
    protected var _displayOrder: Integer = null;

    // ===================================================================================
    //                                                                           Immutable
    //                                                                           =========
    /**
     * {@inheritDoc}
     */
    def acceptImmutable(immu: ProductStatus): DbleProductStatus = {
        setProductStatusCodeAsProductStatus(immu.productStatusCode);
        setProductStatusName(immu.productStatusName);
        setDisplayOrder(immu.displayOrder);
        setProductList(immu.productList.map(new DbleProduct().acceptImmutable(_)).asJava)
        __uniqueDrivenProperties.clear();
        immu.getMyUniqueDrivenProperties().foreach(__uniqueDrivenProperties.addPropertyName(_))
        __modifiedProperties.clear();
        immu.getMyModifiedProperties().foreach(__modifiedProperties.addPropertyName(_))
        return this.asInstanceOf[DbleProductStatus];
    }

    /**
     * {@inheritDoc}
     */
    def toImmutable(): ProductStatus = {
        return new ProductStatus(this.asInstanceOf[DbleProductStatus]);
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    def getTableDbName(): String = {
        return "PRODUCT_STATUS";
    }

    /**
     * {@inheritDoc}
     */
    def getTablePropertyName(): String = {
        return "productStatus";
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
        if (getProductStatusCode() == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br />
     * You can update the entity by the key when entity update (NOT batch update).
     * @param displayOrder (表示順): UQ, NotNull, INTEGER(10). (NotNull)
     */
    def uniqueBy(displayOrder: Integer): Unit = {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("displayOrder");
        setDisplayOrder(displayOrder);
    }

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
    def getProductStatusCodeAsProductStatus(): CDef.ProductStatus = {
        return CDef.ProductStatus.codeOf(getProductStatusCode());
    }

    /**
     * Set the value of productStatusCode as the classification of ProductStatus. <br />
     * (商品ステータスコード)PRODUCT_STATUS_CODE: {PK, NotNull, CHAR(3), classification=ProductStatus} <br />
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
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** (商品)PRODUCT by PRODUCT_STATUS_CODE, named 'productList'. */
    protected var _productList: List[DbleProduct] = null;

    /**
     * [get] (商品)PRODUCT by PRODUCT_STATUS_CODE, named 'productList'.
     * @return The entity list of referrer property 'productList'. (NotNull: even if no loading, returns empty list)
     */
    def getProductList(): List[DbleProduct] = {
        if (_productList == null) { _productList = newReferrerScalaList(); }
        return _productList;
    }

    /**
     * [set] (商品)PRODUCT by PRODUCT_STATUS_CODE, named 'productList'.
     * @param productList The entity list of referrer property 'productList'. (NullAllowed)
     */
    def setProductList(productList: List[DbleProduct]): Unit = {
        _productList = productList;
    }

    /**
     * [convert] (商品)PRODUCT by PRODUCT_STATUS_CODE, named 'productList'.
     * @return The new-created immutable list of immutable entity of the referrer property 'productList'. (NotNull)
     */
    def toImmutableProductList(): immutable.List[Product] = {
        return toScalaList(_productList).map(_.toImmutable());
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
            case obj: BsDbleProductStatus => {
                val other: BsDbleProductStatus = obj.asInstanceOf[BsDbleProductStatus];
                {(
                     xSV(getProductStatusCode(), other.getProductStatusCode())
                )}
            }
            case _ => false
        }
    }

    override protected def doHashCode(initial: Int): Int = {
        var hs: Int = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, getProductStatusCode());
        return hs;
    }

    override protected def doBuildStringWithRelation(li: String): String = {
        val sb: StringBuilder = new StringBuilder();
        toScalaList(_productList).foreach(et => { if (et != null) { sb.append(li).append(xbRDS(et, "productList")) } });
        return sb.toString();
    }

    override protected def doBuildColumnString(dm: String): String = {
        val sb: StringBuilder = new StringBuilder();
        sb.append(dm).append(getProductStatusCode());
        sb.append(dm).append(getProductStatusName());
        sb.append(dm).append(getDisplayOrder());
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    override protected def doBuildRelationString(dm: String): String = {
        val sb: StringBuilder = new StringBuilder();
        if (_productList != null && !_productList.isEmpty)
        { sb.append(dm).append("productList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    override def clone(): DbleProductStatus = {
        return super.clone().asInstanceOf[DbleProductStatus];
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (商品ステータスコード)PRODUCT_STATUS_CODE: {PK, NotNull, CHAR(3), classification=ProductStatus} <br />
     * @return The value of the column 'PRODUCT_STATUS_CODE'. (basically NotNull if selected: for the constraint)
     */
    def getProductStatusCode(): String = {
        return convertEmptyToNull(_productStatusCode);
    }

    /**
     * [set] (商品ステータスコード)PRODUCT_STATUS_CODE: {PK, NotNull, CHAR(3), classification=ProductStatus} <br />
     * @param productStatusCode The value of the column 'PRODUCT_STATUS_CODE'. (basically NotNull if update: for the constraint)
     */
    protected def setProductStatusCode(productStatusCode: String): Unit = {
        checkClassificationCode("PRODUCT_STATUS_CODE", CDef.DefMeta.ProductStatus, productStatusCode);
        __modifiedProperties.addPropertyName("productStatusCode");
        _productStatusCode = productStatusCode;
    }

    /**
     * [get] (商品ステータス名称)PRODUCT_STATUS_NAME: {NotNull, VARCHAR(50)} <br />
     * @return The value of the column 'PRODUCT_STATUS_NAME'. (basically NotNull if selected: for the constraint)
     */
    def getProductStatusName(): String = {
        return convertEmptyToNull(_productStatusName);
    }

    /**
     * [set] (商品ステータス名称)PRODUCT_STATUS_NAME: {NotNull, VARCHAR(50)} <br />
     * @param productStatusName The value of the column 'PRODUCT_STATUS_NAME'. (basically NotNull if update: for the constraint)
     */
    def setProductStatusName(productStatusName: String): Unit = {
        __modifiedProperties.addPropertyName("productStatusName");
        _productStatusName = productStatusName;
    }

    /**
     * [get] (表示順)DISPLAY_ORDER: {UQ, NotNull, INTEGER(10)} <br />
     * @return The value of the column 'DISPLAY_ORDER'. (basically NotNull if selected: for the constraint)
     */
    def getDisplayOrder(): Integer = {
        return _displayOrder;
    }

    /**
     * [set] (表示順)DISPLAY_ORDER: {UQ, NotNull, INTEGER(10)} <br />
     * @param displayOrder The value of the column 'DISPLAY_ORDER'. (basically NotNull if update: for the constraint)
     */
    def setDisplayOrder(displayOrder: Integer): Unit = {
        __modifiedProperties.addPropertyName("displayOrder");
        _displayOrder = displayOrder;
    }

    /**
     * For framework so basically DON'T use this method.
     * @param productStatusCode The value of the column 'PRODUCT_STATUS_CODE'. (basically NotNull if update: for the constraint)
     */
    def mynativeMappingProductStatusCode(productStatusCode: String): Unit = {
        setProductStatusCode(productStatusCode);
    }
}
