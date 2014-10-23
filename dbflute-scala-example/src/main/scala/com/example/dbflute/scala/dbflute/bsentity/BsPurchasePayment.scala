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
 * The immutable entity of (購入支払)PURCHASE_PAYMENT as TABLE. <br />
 * <pre>
 * [primary-key]
 *     PURCHASE_PAYMENT_ID
 * 
 * [column]
 *     PURCHASE_PAYMENT_ID, PURCHASE_ID, PAYMENT_AMOUNT, PAYMENT_DATETIME, PAYMENT_METHOD_CODE, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     PURCHASE_PAYMENT_ID
 * 
 * [version-no]
 *     
 * 
 * [foreign table]
 *     PURCHASE
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     purchase
 * 
 * [referrer property]
 *     
 * 
 * [get template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * val purchasePaymentId: Long = entity.purchasePaymentId
 * val purchaseId: Long = entity.purchaseId
 * val paymentAmount: scala.math.BigDecimal = entity.paymentAmount
 * val paymentDatetime: org.joda.time.LocalDateTime = entity.paymentDatetime
 * val paymentMethodCode: String = entity.paymentMethodCode
 * val registerDatetime: org.joda.time.LocalDateTime = entity.registerDatetime
 * val registerUser: String = entity.registerUser
 * val updateDatetime: org.joda.time.LocalDateTime = entity.updateDatetime
 * val updateUser: String = entity.updateUser
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
abstract class BsPurchasePayment(dble: DblePurchasePayment) extends Serializable {

    // ===================================================================================
    //                                                                           Case Like
    //                                                                           =========
    def copy(
         purchasePaymentId: Long = purchasePaymentId
        , purchaseId: Long = purchaseId
        , paymentAmount: scala.math.BigDecimal = paymentAmount
        , paymentDatetime: org.joda.time.LocalDateTime = paymentDatetime
        , paymentMethodCode: String = paymentMethodCode
        , registerDatetime: org.joda.time.LocalDateTime = registerDatetime
        , registerUser: String = registerUser
        , updateDatetime: org.joda.time.LocalDateTime = updateDatetime
        , updateUser: String = updateUser
    ): PurchasePayment = {
        val newDble = new DblePurchasePayment
        newDble.myuniqueDrivenProperties.addAll(dble.myuniqueDrivenProperties) // inherit
        newDble.mymodifiedProperties.addAll(dble.mymodifiedProperties) // inherit
        if (!purchasePaymentId.equals(this.purchasePaymentId)) { newDble.setPurchasePaymentId(purchasePaymentId) }
        if (!purchaseId.equals(this.purchaseId)) { newDble.setPurchaseId(purchaseId) }
        if (!paymentAmount.equals(this.paymentAmount)) { newDble.setPaymentAmount(paymentAmount.underlying) }
        if (!paymentDatetime.equals(this.paymentDatetime)) { newDble.setPaymentDatetime(paymentDatetime) }
        if (!paymentMethodCode.equals(this.paymentMethodCode)) { newDble.setPaymentMethodCode(paymentMethodCode) }
        if (!registerDatetime.equals(this.registerDatetime)) { newDble.setRegisterDatetime(registerDatetime) }
        if (!registerUser.equals(this.registerUser)) { newDble.setRegisterUser(registerUser) }
        if (!updateDatetime.equals(this.updateDatetime)) { newDble.setUpdateDatetime(updateDatetime) }
        if (!updateUser.equals(this.updateUser)) { newDble.setUpdateUser(updateUser) }
        new PurchasePayment(newDble)
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
     * [get] (購入)PURCHASE by my PURCHASE_ID, named 'purchase'.
     * @return The entity of foreign property 'purchase'. (EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    def purchase: Option[Purchase] = { dble.toImmutablePurchase }

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
            case obj: BsPurchasePayment => {
                val other: BsPurchasePayment = obj.asInstanceOf[BsPurchasePayment];
                {(
                     xSV(purchasePaymentId, other.purchasePaymentId)
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
     * [get] (購入支払ID)PURCHASE_PAYMENT_ID: {PK, ID, NotNull, BIGINT(19)} <br />
     * @return The value of the column 'PURCHASE_PAYMENT_ID'. (NotNull but EmptyAllowed if null in database)
     */
    def purchasePaymentId: Long = { dble.getPurchasePaymentId }

    /**
     * [get] (購入ID)PURCHASE_ID: {IX, NotNull, BIGINT(19), FK to PURCHASE} <br />
     * @return The value of the column 'PURCHASE_ID'. (NotNull but EmptyAllowed if null in database)
     */
    def purchaseId: Long = { dble.getPurchaseId }

    /**
     * [get] (支払金額)PAYMENT_AMOUNT: {NotNull, DECIMAL(10, 2)} <br />
     * @return The value of the column 'PAYMENT_AMOUNT'. (NotNull but EmptyAllowed if null in database)
     */
    def paymentAmount: scala.math.BigDecimal = { dble.getPaymentAmount }

    /**
     * [get] (支払日時)PAYMENT_DATETIME: {IX+, NotNull, TIMESTAMP(23, 10)} <br />
     * @return The value of the column 'PAYMENT_DATETIME'. (NotNull but EmptyAllowed if null in database)
     */
    def paymentDatetime: org.joda.time.LocalDateTime = { dble.getPaymentDatetime }

    /**
     * [get] (支払方法コード)PAYMENT_METHOD_CODE: {NotNull, CHAR(3)} <br />
     * @return The value of the column 'PAYMENT_METHOD_CODE'. (NotNull but EmptyAllowed if null in database)
     */
    def paymentMethodCode: String = { dble.getPaymentMethodCode }

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
 * The mutable entity of (購入支払)PURCHASE_PAYMENT as TABLE. <br />
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * val purchasePaymentId: Long = entity.purchasePaymentId
 * val purchaseId: Long = entity.purchaseId
 * val paymentAmount: scala.math.BigDecimal = entity.paymentAmount
 * val paymentDatetime: org.joda.time.LocalDateTime = entity.paymentDatetime
 * val paymentMethodCode: String = entity.paymentMethodCode
 * val registerDatetime: org.joda.time.LocalDateTime = entity.registerDatetime
 * val registerUser: String = entity.registerUser
 * val updateDatetime: org.joda.time.LocalDateTime = entity.updateDatetime
 * val updateUser: String = entity.updateUser
 * entity.purchasePaymentId = purchasePaymentId
 * entity.purchaseId = purchaseId
 * entity.paymentAmount = paymentAmount
 * entity.paymentDatetime = paymentDatetime
 * entity.paymentMethodCode = paymentMethodCode
 * entity.registerDatetime = registerDatetime
 * entity.registerUser = registerUser
 * entity.updateDatetime = updateDatetime
 * entity.updateUser = updateUser
 * = = = = = = = = = =/
 * @author DBFlute(AutoGenerator)
 */
abstract class BsMblePurchasePayment {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected val dble: DblePurchasePayment = new DblePurchasePayment();

    // ===================================================================================
    //                                                                      DB-able Entity
    //                                                                      ==============
    def toDBable(): DblePurchasePayment = { dble }

    // ===================================================================================
    //                                                                    Immutable Entity
    //                                                                    ================
    def toImmutable(): PurchasePayment = { dble.toImmutable() }

    // ===================================================================================
    //                                                                          Unique Key
    //                                                                          ==========
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (購入支払ID)PURCHASE_PAYMENT_ID: {PK, ID, NotNull, BIGINT(19)} <br />
     * @return The value of the column 'PURCHASE_PAYMENT_ID'. (basically NotNull if selected: for the constraint)
     */
    def purchasePaymentId: Long = { dble.getPurchasePaymentId }

    /**
     * [set] (購入支払ID)PURCHASE_PAYMENT_ID: {PK, ID, NotNull, BIGINT(19)} <br />
     * @param purchasePaymentId The value of the column 'PURCHASE_PAYMENT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    def purchasePaymentId_=(purchasePaymentId: Long) = { dble.setPurchasePaymentId(purchasePaymentId) }

    /**
     * [get] (購入ID)PURCHASE_ID: {IX, NotNull, BIGINT(19), FK to PURCHASE} <br />
     * @return The value of the column 'PURCHASE_ID'. (basically NotNull if selected: for the constraint)
     */
    def purchaseId: Long = { dble.getPurchaseId }

    /**
     * [set] (購入ID)PURCHASE_ID: {IX, NotNull, BIGINT(19), FK to PURCHASE} <br />
     * @param purchaseId The value of the column 'PURCHASE_ID'. (NullAllowed: null update allowed for no constraint)
     */
    def purchaseId_=(purchaseId: Long) = { dble.setPurchaseId(purchaseId) }

    /**
     * [get] (支払金額)PAYMENT_AMOUNT: {NotNull, DECIMAL(10, 2)} <br />
     * @return The value of the column 'PAYMENT_AMOUNT'. (basically NotNull if selected: for the constraint)
     */
    def paymentAmount: scala.math.BigDecimal = { dble.getPaymentAmount }

    /**
     * [set] (支払金額)PAYMENT_AMOUNT: {NotNull, DECIMAL(10, 2)} <br />
     * @param paymentAmount The value of the column 'PAYMENT_AMOUNT'. (NullAllowed: null update allowed for no constraint)
     */
    def paymentAmount_=(paymentAmount: scala.math.BigDecimal) = { dble.setPaymentAmount(paymentAmount.underlying) }

    /**
     * [get] (支払日時)PAYMENT_DATETIME: {IX+, NotNull, TIMESTAMP(23, 10)} <br />
     * @return The value of the column 'PAYMENT_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    def paymentDatetime: org.joda.time.LocalDateTime = { dble.getPaymentDatetime }

    /**
     * [set] (支払日時)PAYMENT_DATETIME: {IX+, NotNull, TIMESTAMP(23, 10)} <br />
     * @param paymentDatetime The value of the column 'PAYMENT_DATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    def paymentDatetime_=(paymentDatetime: org.joda.time.LocalDateTime) = { dble.setPaymentDatetime(paymentDatetime) }

    /**
     * [get] (支払方法コード)PAYMENT_METHOD_CODE: {NotNull, CHAR(3)} <br />
     * @return The value of the column 'PAYMENT_METHOD_CODE'. (basically NotNull if selected: for the constraint)
     */
    def paymentMethodCode: String = { dble.getPaymentMethodCode }

    /**
     * [set] (支払方法コード)PAYMENT_METHOD_CODE: {NotNull, CHAR(3)} <br />
     * @param paymentMethodCode The value of the column 'PAYMENT_METHOD_CODE'. (NullAllowed: null update allowed for no constraint)
     */
    def paymentMethodCode_=(paymentMethodCode: String) = { dble.setPaymentMethodCode(paymentMethodCode) }

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
}
