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
import com.example.dbflute.scala.dbflute.allcommon.EntityDefinedCommonColumn;
import com.example.dbflute.scala.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.scala.dbflute.exentity._;

/**
 * The entity of (購入支払)PURCHASE_PAYMENT as TABLE. <br />
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
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long purchasePaymentId = entity.getPurchasePaymentId();
 * Long purchaseId = entity.getPurchaseId();
 * java.math.BigDecimal paymentAmount = entity.getPaymentAmount();
 * org.joda.time.LocalDateTime paymentDatetime = entity.getPaymentDatetime();
 * String paymentMethodCode = entity.getPaymentMethodCode();
 * org.joda.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerUser = entity.getRegisterUser();
 * org.joda.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateUser = entity.getUpdateUser();
 * entity.setPurchasePaymentId(purchasePaymentId);
 * entity.setPurchaseId(purchaseId);
 * entity.setPaymentAmount(paymentAmount);
 * entity.setPaymentDatetime(paymentDatetime);
 * entity.setPaymentMethodCode(paymentMethodCode);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterUser(registerUser);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateUser(updateUser);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
abstract class BsDblePurchasePayment extends AbstractEntity with EntityDefinedCommonColumn with DBableEntity[PurchasePayment] with Serializable with Cloneable {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** (購入支払ID)PURCHASE_PAYMENT_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected var _purchasePaymentId: Long = null;

    /** (購入ID)PURCHASE_ID: {IX, NotNull, BIGINT(19), FK to PURCHASE} */
    protected var _purchaseId: Long = null;

    /** (支払金額)PAYMENT_AMOUNT: {NotNull, DECIMAL(10, 2)} */
    protected var _paymentAmount: java.math.BigDecimal = null;

    /** (支払日時)PAYMENT_DATETIME: {IX+, NotNull, TIMESTAMP(23, 10)} */
    protected var _paymentDatetime: org.joda.time.LocalDateTime = null;

    /** (支払方法コード)PAYMENT_METHOD_CODE: {NotNull, CHAR(3)} */
    protected var _paymentMethodCode: String = null;

    /** REGISTER_DATETIME: {NotNull, TIMESTAMP(23, 10)} */
    protected var _registerDatetime: org.joda.time.LocalDateTime = null;

    /** REGISTER_USER: {NotNull, VARCHAR(200)} */
    protected var _registerUser: String = null;

    /** UPDATE_DATETIME: {NotNull, TIMESTAMP(23, 10)} */
    protected var _updateDatetime: org.joda.time.LocalDateTime = null;

    /** UPDATE_USER: {NotNull, VARCHAR(200)} */
    protected var _updateUser: String = null;

    // ===================================================================================
    //                                                                           Immutable
    //                                                                           =========
    /**
     * {@inheritDoc}
     */
    def acceptImmutable(immu: PurchasePayment): DblePurchasePayment = {
        setPurchasePaymentId(immu.purchasePaymentId);
        setPurchaseId(immu.purchaseId);
        setPaymentAmount(immu.paymentAmount.underlying);
        setPaymentDatetime(immu.paymentDatetime);
        setPaymentMethodCode(immu.paymentMethodCode);
        setRegisterDatetime(immu.registerDatetime);
        setRegisterUser(immu.registerUser);
        setUpdateDatetime(immu.updateDatetime);
        setUpdateUser(immu.updateUser);
        setPurchase(immu.purchase.map(new DblePurchase().acceptImmutable(_)))
        __uniqueDrivenProperties.clear();
        immu.getMyUniqueDrivenProperties().foreach(__uniqueDrivenProperties.addPropertyName(_))
        __modifiedProperties.clear();
        immu.getMyModifiedProperties().foreach(__modifiedProperties.addPropertyName(_))
        return this.asInstanceOf[DblePurchasePayment];
    }

    /**
     * {@inheritDoc}
     */
    def toImmutable(): PurchasePayment = {
        return new PurchasePayment(this.asInstanceOf[DblePurchasePayment]);
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    def getTableDbName(): String = {
        return "PURCHASE_PAYMENT";
    }

    /**
     * {@inheritDoc}
     */
    def getTablePropertyName(): String = {
        return "purchasePayment";
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
        if (getPurchasePaymentId() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** (購入)PURCHASE by my PURCHASE_ID, named 'purchase'. */
    protected var _purchase: Option[DblePurchase] = null;

    /**
     * [get] (購入)PURCHASE by my PURCHASE_ID, named 'purchase'.
     * @return The entity of foreign property 'purchase'. (EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    def getPurchase(): Option[DblePurchase] = {
        return if (_purchase != null) { _purchase; } else { Option.empty; }
    }

    /**
     * [set] (購入)PURCHASE by my PURCHASE_ID, named 'purchase'.
     * @param purchase The entity of foreign property 'purchase'. (EmptyAllowed)
     */
    def setPurchase(purchase: Option[DblePurchase]): Unit = {
        _purchase = purchase;
    }

    /**
     * [convert] (購入)PURCHASE by my PURCHASE_ID, named 'purchase'.
     * @return The new-created immutable entity of foreign property 'purchase'. (NotNull)
     */
    def toImmutablePurchase(): Option[Purchase] = {
        return getPurchase().map(_.toImmutable());
    }

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
            case obj: BsDblePurchasePayment => {
                val other: BsDblePurchasePayment = obj.asInstanceOf[BsDblePurchasePayment];
                {(
                     xSV(getPurchasePaymentId(), other.getPurchasePaymentId())
                )}
            }
            case _ => false
        }
    }

    override protected def doHashCode(initial: Int): Int = {
        var hs: Int = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, getPurchasePaymentId());
        return hs;
    }

    override protected def doBuildStringWithRelation(li: String): String = {
        val sb: StringBuilder = new StringBuilder();
        if (_purchase != null && _purchase.isEmpty)
        { sb.append(li).append(xbRDS(_purchase, "purchase")); }
        return sb.toString();
    }
    protected def xbRDS[ET <: Entity](et: Option[ET], name: String): String = {
        return et.get.buildDisplayString(name, true, true);
    }

    override protected def doBuildColumnString(dm: String): String = {
        val sb: StringBuilder = new StringBuilder();
        sb.append(dm).append(getPurchasePaymentId());
        sb.append(dm).append(getPurchaseId());
        sb.append(dm).append(getPaymentAmount());
        sb.append(dm).append(getPaymentDatetime());
        sb.append(dm).append(getPaymentMethodCode());
        sb.append(dm).append(getRegisterDatetime());
        sb.append(dm).append(getRegisterUser());
        sb.append(dm).append(getUpdateDatetime());
        sb.append(dm).append(getUpdateUser());
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    override protected def doBuildRelationString(dm: String): String = {
        val sb: StringBuilder = new StringBuilder();
        if (_purchase != null && _purchase.isEmpty)
        { sb.append(dm).append("purchase"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    override def clone(): DblePurchasePayment = {
        return super.clone().asInstanceOf[DblePurchasePayment];
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (購入支払ID)PURCHASE_PAYMENT_ID: {PK, ID, NotNull, BIGINT(19)} <br />
     * @return The value of the column 'PURCHASE_PAYMENT_ID'. (basically NotNull if selected: for the constraint)
     */
    def getPurchasePaymentId(): Long = {
        return _purchasePaymentId;
    }

    /**
     * [set] (購入支払ID)PURCHASE_PAYMENT_ID: {PK, ID, NotNull, BIGINT(19)} <br />
     * @param purchasePaymentId The value of the column 'PURCHASE_PAYMENT_ID'. (basically NotNull if update: for the constraint)
     */
    def setPurchasePaymentId(purchasePaymentId: Long): Unit = {
        __modifiedProperties.addPropertyName("purchasePaymentId");
        _purchasePaymentId = purchasePaymentId;
    }

    /**
     * [get] (購入ID)PURCHASE_ID: {IX, NotNull, BIGINT(19), FK to PURCHASE} <br />
     * @return The value of the column 'PURCHASE_ID'. (basically NotNull if selected: for the constraint)
     */
    def getPurchaseId(): Long = {
        return _purchaseId;
    }

    /**
     * [set] (購入ID)PURCHASE_ID: {IX, NotNull, BIGINT(19), FK to PURCHASE} <br />
     * @param purchaseId The value of the column 'PURCHASE_ID'. (basically NotNull if update: for the constraint)
     */
    def setPurchaseId(purchaseId: Long): Unit = {
        __modifiedProperties.addPropertyName("purchaseId");
        _purchaseId = purchaseId;
    }

    /**
     * [get] (支払金額)PAYMENT_AMOUNT: {NotNull, DECIMAL(10, 2)} <br />
     * @return The value of the column 'PAYMENT_AMOUNT'. (basically NotNull if selected: for the constraint)
     */
    def getPaymentAmount(): java.math.BigDecimal = {
        return _paymentAmount;
    }

    /**
     * [set] (支払金額)PAYMENT_AMOUNT: {NotNull, DECIMAL(10, 2)} <br />
     * @param paymentAmount The value of the column 'PAYMENT_AMOUNT'. (basically NotNull if update: for the constraint)
     */
    def setPaymentAmount(paymentAmount: java.math.BigDecimal): Unit = {
        __modifiedProperties.addPropertyName("paymentAmount");
        _paymentAmount = paymentAmount;
    }

    /**
     * [get] (支払日時)PAYMENT_DATETIME: {IX+, NotNull, TIMESTAMP(23, 10)} <br />
     * @return The value of the column 'PAYMENT_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    def getPaymentDatetime(): org.joda.time.LocalDateTime = {
        return _paymentDatetime;
    }

    /**
     * [set] (支払日時)PAYMENT_DATETIME: {IX+, NotNull, TIMESTAMP(23, 10)} <br />
     * @param paymentDatetime The value of the column 'PAYMENT_DATETIME'. (basically NotNull if update: for the constraint)
     */
    def setPaymentDatetime(paymentDatetime: org.joda.time.LocalDateTime): Unit = {
        __modifiedProperties.addPropertyName("paymentDatetime");
        _paymentDatetime = paymentDatetime;
    }

    /**
     * [get] (支払方法コード)PAYMENT_METHOD_CODE: {NotNull, CHAR(3)} <br />
     * @return The value of the column 'PAYMENT_METHOD_CODE'. (basically NotNull if selected: for the constraint)
     */
    def getPaymentMethodCode(): String = {
        return convertEmptyToNull(_paymentMethodCode);
    }

    /**
     * [set] (支払方法コード)PAYMENT_METHOD_CODE: {NotNull, CHAR(3)} <br />
     * @param paymentMethodCode The value of the column 'PAYMENT_METHOD_CODE'. (basically NotNull if update: for the constraint)
     */
    def setPaymentMethodCode(paymentMethodCode: String): Unit = {
        __modifiedProperties.addPropertyName("paymentMethodCode");
        _paymentMethodCode = paymentMethodCode;
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
}
