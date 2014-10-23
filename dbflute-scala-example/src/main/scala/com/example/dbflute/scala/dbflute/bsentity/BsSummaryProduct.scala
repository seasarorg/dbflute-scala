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
 * The immutable entity of SUMMARY_PRODUCT as VIEW. <br />
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
 * [get template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * val productId: Option[Int] = entity.productId
 * val productName: Option[String] = entity.productName
 * val productHandleCode: Option[String] = entity.productHandleCode
 * val productStatusCode: Option[String] = entity.productStatusCode
 * val latestPurchaseDatetime: Option[org.joda.time.LocalDateTime] = entity.latestPurchaseDatetime
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
abstract class BsSummaryProduct(dble: DbleSummaryProduct) extends Serializable {

    // ===================================================================================
    //                                                                           Case Like
    //                                                                           =========
    def copy(
         productId: Option[Int] = productId
        , productName: Option[String] = productName
        , productHandleCode: Option[String] = productHandleCode
        , productStatusCode: Option[String] = productStatusCode
        , latestPurchaseDatetime: Option[org.joda.time.LocalDateTime] = latestPurchaseDatetime
    ): SummaryProduct = {
        val newDble = new DbleSummaryProduct
        newDble.myuniqueDrivenProperties.addAll(dble.myuniqueDrivenProperties) // inherit
        newDble.mymodifiedProperties.addAll(dble.mymodifiedProperties) // inherit
        if (!productId.equals(this.productId)) { newDble.setProductId(productId.map(int2Integer(_)).orNull) }
        if (!productName.equals(this.productName)) { newDble.setProductName(productName.orNull) }
        if (!productHandleCode.equals(this.productHandleCode)) { newDble.setProductHandleCode(productHandleCode.orNull) }
        if (!productStatusCode.equals(this.productStatusCode)) { newDble.setProductStatusCode(productStatusCode.orNull) }
        if (!latestPurchaseDatetime.equals(this.latestPurchaseDatetime)) { newDble.setLatestPurchaseDatetime(latestPurchaseDatetime.orNull) }
        new SummaryProduct(newDble)
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
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
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
            case obj: BsSummaryProduct => {
                val other: BsSummaryProduct = obj.asInstanceOf[BsSummaryProduct];
                {(
                     xSV(productId, other.productId)
                    && xSV(productName, other.productName)
                    && xSV(productHandleCode, other.productHandleCode)
                    && xSV(productStatusCode, other.productStatusCode)
                    && xSV(latestPurchaseDatetime, other.latestPurchaseDatetime)
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
     * [get] PRODUCT_ID: {INTEGER(10)} <br />
     * @return The value of the column 'PRODUCT_ID'. (basically NotNull if selected: for the constraint)
     */
    def productId: Option[Int] = { Option(dble.getProductId) }

    /**
     * [get] PRODUCT_NAME: {VARCHAR(50)} <br />
     * @return The value of the column 'PRODUCT_NAME'. (basically NotNull if selected: for the constraint)
     */
    def productName: Option[String] = { Option(dble.getProductName) }

    /**
     * [get] PRODUCT_HANDLE_CODE: {VARCHAR(100)} <br />
     * @return The value of the column 'PRODUCT_HANDLE_CODE'. (basically NotNull if selected: for the constraint)
     */
    def productHandleCode: Option[String] = { Option(dble.getProductHandleCode) }

    /**
     * [get] PRODUCT_STATUS_CODE: {CHAR(3)} <br />
     * @return The value of the column 'PRODUCT_STATUS_CODE'. (basically NotNull if selected: for the constraint)
     */
    def productStatusCode: Option[String] = { Option(dble.getProductStatusCode) }

    /**
     * [get] LATEST_PURCHASE_DATETIME: {TIMESTAMP(23, 10)} <br />
     * @return The value of the column 'LATEST_PURCHASE_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    def latestPurchaseDatetime: Option[org.joda.time.LocalDateTime] = { Option(dble.getLatestPurchaseDatetime) }
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
 * The mutable entity of SUMMARY_PRODUCT as VIEW. <br />
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * val productId: Option[Int] = entity.productId
 * val productName: Option[String] = entity.productName
 * val productHandleCode: Option[String] = entity.productHandleCode
 * val productStatusCode: Option[String] = entity.productStatusCode
 * val latestPurchaseDatetime: Option[org.joda.time.LocalDateTime] = entity.latestPurchaseDatetime
 * entity.productId = productId
 * entity.productName = productName
 * entity.productHandleCode = productHandleCode
 * entity.productStatusCode = productStatusCode
 * entity.latestPurchaseDatetime = latestPurchaseDatetime
 * = = = = = = = = = =/
 * @author DBFlute(AutoGenerator)
 */
abstract class BsMbleSummaryProduct {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected val dble: DbleSummaryProduct = new DbleSummaryProduct();

    // ===================================================================================
    //                                                                      DB-able Entity
    //                                                                      ==============
    def toDBable(): DbleSummaryProduct = { dble }

    // ===================================================================================
    //                                                                    Immutable Entity
    //                                                                    ================
    def toImmutable(): SummaryProduct = { dble.toImmutable() }

    // ===================================================================================
    //                                                                          Unique Key
    //                                                                          ==========
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PRODUCT_ID: {INTEGER(10)} <br />
     * @return The value of the column 'PRODUCT_ID'. (NotNull but EmptyAllowed if null in database)
     */
    def productId: Option[Int] = { Option(dble.getProductId) }

    /**
     * [set] PRODUCT_ID: {INTEGER(10)} <br />
     * @param productId The value of the column 'PRODUCT_ID'. (basically NotNull if update: for the constraint)
     */
    def productId_=(productId: Option[Int]) = { dble.setProductId(productId.map(int2Integer(_)).orNull) }

    /**
     * [get] PRODUCT_NAME: {VARCHAR(50)} <br />
     * @return The value of the column 'PRODUCT_NAME'. (NotNull but EmptyAllowed if null in database)
     */
    def productName: Option[String] = { Option(dble.getProductName) }

    /**
     * [set] PRODUCT_NAME: {VARCHAR(50)} <br />
     * @param productName The value of the column 'PRODUCT_NAME'. (basically NotNull if update: for the constraint)
     */
    def productName_=(productName: Option[String]) = { dble.setProductName(productName.orNull) }

    /**
     * [get] PRODUCT_HANDLE_CODE: {VARCHAR(100)} <br />
     * @return The value of the column 'PRODUCT_HANDLE_CODE'. (NotNull but EmptyAllowed if null in database)
     */
    def productHandleCode: Option[String] = { Option(dble.getProductHandleCode) }

    /**
     * [set] PRODUCT_HANDLE_CODE: {VARCHAR(100)} <br />
     * @param productHandleCode The value of the column 'PRODUCT_HANDLE_CODE'. (basically NotNull if update: for the constraint)
     */
    def productHandleCode_=(productHandleCode: Option[String]) = { dble.setProductHandleCode(productHandleCode.orNull) }

    /**
     * [get] PRODUCT_STATUS_CODE: {CHAR(3)} <br />
     * @return The value of the column 'PRODUCT_STATUS_CODE'. (NotNull but EmptyAllowed if null in database)
     */
    def productStatusCode: Option[String] = { Option(dble.getProductStatusCode) }

    /**
     * [set] PRODUCT_STATUS_CODE: {CHAR(3)} <br />
     * @param productStatusCode The value of the column 'PRODUCT_STATUS_CODE'. (basically NotNull if update: for the constraint)
     */
    def productStatusCode_=(productStatusCode: Option[String]) = { dble.setProductStatusCode(productStatusCode.orNull) }

    /**
     * [get] LATEST_PURCHASE_DATETIME: {TIMESTAMP(23, 10)} <br />
     * @return The value of the column 'LATEST_PURCHASE_DATETIME'. (NotNull but EmptyAllowed if null in database)
     */
    def latestPurchaseDatetime: Option[org.joda.time.LocalDateTime] = { Option(dble.getLatestPurchaseDatetime) }

    /**
     * [set] LATEST_PURCHASE_DATETIME: {TIMESTAMP(23, 10)} <br />
     * @param latestPurchaseDatetime The value of the column 'LATEST_PURCHASE_DATETIME'. (basically NotNull if update: for the constraint)
     */
    def latestPurchaseDatetime_=(latestPurchaseDatetime: Option[org.joda.time.LocalDateTime]) = { dble.setLatestPurchaseDatetime(latestPurchaseDatetime.orNull) }
}
