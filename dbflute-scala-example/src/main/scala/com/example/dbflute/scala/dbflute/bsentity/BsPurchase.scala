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
 * The immutable entity of (購入)PURCHASE as TABLE. <br />
 * <pre>
 * [primary-key]
 *     PURCHASE_ID
 * 
 * [column]
 *     PURCHASE_ID, MEMBER_ID, PRODUCT_ID, PURCHASE_DATETIME, PURCHASE_COUNT, PURCHASE_PRICE, PAYMENT_COMPLETE_FLG, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     PURCHASE_ID
 * 
 * [version-no]
 *     VERSION_NO
 * 
 * [foreign table]
 *     MEMBER, PRODUCT
 * 
 * [referrer table]
 *     PURCHASE_PAYMENT
 * 
 * [foreign property]
 *     member, product
 * 
 * [referrer property]
 *     purchasePaymentList
 * 
 * [get template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * val purchaseId: Long = entity.purchaseId
 * val memberId: Int = entity.memberId
 * val productId: Int = entity.productId
 * val purchaseDatetime: org.joda.time.LocalDateTime = entity.purchaseDatetime
 * val purchaseCount: Int = entity.purchaseCount
 * val purchasePrice: Int = entity.purchasePrice
 * val paymentCompleteFlg: CDef.Flg = entity.paymentCompleteFlg
 * val registerDatetime: org.joda.time.LocalDateTime = entity.registerDatetime
 * val registerUser: String = entity.registerUser
 * val updateDatetime: org.joda.time.LocalDateTime = entity.updateDatetime
 * val updateUser: String = entity.updateUser
 * val versionNo: Long = entity.versionNo
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
abstract class BsPurchase(dble: DblePurchase) extends Serializable {

    // ===================================================================================
    //                                                                           Case Like
    //                                                                           =========
    def copy(
         purchaseId: Long = purchaseId
        , memberId: Int = memberId
        , productId: Int = productId
        , purchaseDatetime: org.joda.time.LocalDateTime = purchaseDatetime
        , purchaseCount: Int = purchaseCount
        , purchasePrice: Int = purchasePrice
        , paymentCompleteFlg: CDef.Flg = paymentCompleteFlg
        , registerDatetime: org.joda.time.LocalDateTime = registerDatetime
        , registerUser: String = registerUser
        , updateDatetime: org.joda.time.LocalDateTime = updateDatetime
        , updateUser: String = updateUser
        , versionNo: Long = versionNo
    ): Purchase = {
        val newDble = new DblePurchase
        newDble.myuniqueDrivenProperties.addAll(dble.myuniqueDrivenProperties) // inherit
        newDble.mymodifiedProperties.addAll(dble.mymodifiedProperties) // inherit
        if (!purchaseId.equals(this.purchaseId)) { newDble.setPurchaseId(purchaseId) }
        if (!memberId.equals(this.memberId)) { newDble.setMemberId(memberId) }
        if (!productId.equals(this.productId)) { newDble.setProductId(productId) }
        if (!purchaseDatetime.equals(this.purchaseDatetime)) { newDble.setPurchaseDatetime(purchaseDatetime) }
        if (!purchaseCount.equals(this.purchaseCount)) { newDble.setPurchaseCount(purchaseCount) }
        if (!purchasePrice.equals(this.purchasePrice)) { newDble.setPurchasePrice(purchasePrice) }
        if (!paymentCompleteFlg.equals(this.paymentCompleteFlg)) { newDble.setPaymentCompleteFlgAsFlg(paymentCompleteFlg) }
        if (!registerDatetime.equals(this.registerDatetime)) { newDble.setRegisterDatetime(registerDatetime) }
        if (!registerUser.equals(this.registerUser)) { newDble.setRegisterUser(registerUser) }
        if (!updateDatetime.equals(this.updateDatetime)) { newDble.setUpdateDatetime(updateDatetime) }
        if (!updateUser.equals(this.updateUser)) { newDble.setUpdateUser(updateUser) }
        if (!versionNo.equals(this.versionNo)) { newDble.setVersionNo(versionNo) }
        new Purchase(newDble)
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
     * Get the value of paymentCompleteFlg as the classification of Flg. <br />
     * (支払完了フラグ)PAYMENT_COMPLETE_FLG: {NotNull, INTEGER(10), classification=Flg} <br />
     * general boolean classification for every flg-column
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    def paymentCompleteFlgAsFlg: CDef.Flg = { dble.getPaymentCompleteFlgAsFlg }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of paymentCompleteFlg True? <br />
     * Yes: means valid
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isPaymentCompleteFlg_True: Boolean = { dble.isPaymentCompleteFlg_True }

    /**
     * Is the value of paymentCompleteFlg False? <br />
     * No: means invalid
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isPaymentCompleteFlg_False: Boolean = { dble.isPaymentCompleteFlg_False }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    /**
     * Get the value of the column 'paymentCompleteFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    def paymentCompleteFlgName: String = { dble.getPaymentCompleteFlgName }

    /**
     * Get the value of the column 'paymentCompleteFlg' as classification alias.
     * @return The string of classification alias. (NullAllowed: when the column value is null)
     */
    def paymentCompleteFlgAlias: String = { dble.getPaymentCompleteFlgAlias }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /**
     * [get] (会員)MEMBER by my MEMBER_ID, named 'member'.
     * @return The entity of foreign property 'member'. (EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    def member: Option[Member] = { dble.toImmutableMember }

    /**
     * [get] (商品)PRODUCT by my PRODUCT_ID, named 'product'.
     * @return The entity of foreign property 'product'. (EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    def product: Option[Product] = { dble.toImmutableProduct }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /**
     * [get] (購入支払)PURCHASE_PAYMENT by PURCHASE_ID, named 'purchasePaymentList'.
     * @return The entity list of referrer property 'purchasePaymentList'. (NotNull: even if no loading, returns empty list)
     */
    def purchasePaymentList: List[PurchasePayment] = { dble.toImmutablePurchasePaymentList }

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
            case obj: BsPurchase => {
                val other: BsPurchase = obj.asInstanceOf[BsPurchase];
                {(
                     xSV(purchaseId, other.purchaseId)
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
     * [get] PURCHASE_ID: {PK, ID, NotNull, BIGINT(19)} <br />
     * @return The value of the column 'PURCHASE_ID'. (NotNull but EmptyAllowed if null in database)
     */
    def purchaseId: Long = { dble.getPurchaseId }

    /**
     * [get] (会員ID)MEMBER_ID: {UQ+, IX+, NotNull, INTEGER(10), FK to MEMBER} <br />
     * @return The value of the column 'MEMBER_ID'. (NotNull but EmptyAllowed if null in database)
     */
    def memberId: Int = { dble.getMemberId }

    /**
     * [get] (商品ID)PRODUCT_ID: {+UQ, IX+, NotNull, INTEGER(10), FK to PRODUCT} <br />
     * @return The value of the column 'PRODUCT_ID'. (NotNull but EmptyAllowed if null in database)
     */
    def productId: Int = { dble.getProductId }

    /**
     * [get] (購入日時)PURCHASE_DATETIME: {+UQ, IX+, NotNull, TIMESTAMP(23, 10)} <br />
     * @return The value of the column 'PURCHASE_DATETIME'. (NotNull but EmptyAllowed if null in database)
     */
    def purchaseDatetime: org.joda.time.LocalDateTime = { dble.getPurchaseDatetime }

    /**
     * [get] (購入数量)PURCHASE_COUNT: {NotNull, INTEGER(10)} <br />
     * @return The value of the column 'PURCHASE_COUNT'. (NotNull but EmptyAllowed if null in database)
     */
    def purchaseCount: Int = { dble.getPurchaseCount }

    /**
     * [get] (購入価格)PURCHASE_PRICE: {IX, NotNull, INTEGER(10)} <br />
     * @return The value of the column 'PURCHASE_PRICE'. (NotNull but EmptyAllowed if null in database)
     */
    def purchasePrice: Int = { dble.getPurchasePrice }

    /**
     * [get] (支払完了フラグ)PAYMENT_COMPLETE_FLG: {NotNull, INTEGER(10), classification=Flg} <br />
     * @return The value of the column 'PAYMENT_COMPLETE_FLG'. (NotNull but EmptyAllowed if null in database)
     */
    def paymentCompleteFlg: CDef.Flg = { dble.getPaymentCompleteFlgAsFlg }

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
 * The mutable entity of (購入)PURCHASE as TABLE. <br />
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * val purchaseId: Long = entity.purchaseId
 * val memberId: Int = entity.memberId
 * val productId: Int = entity.productId
 * val purchaseDatetime: org.joda.time.LocalDateTime = entity.purchaseDatetime
 * val purchaseCount: Int = entity.purchaseCount
 * val purchasePrice: Int = entity.purchasePrice
 * val paymentCompleteFlg: CDef.Flg = entity.paymentCompleteFlg
 * val registerDatetime: org.joda.time.LocalDateTime = entity.registerDatetime
 * val registerUser: String = entity.registerUser
 * val updateDatetime: org.joda.time.LocalDateTime = entity.updateDatetime
 * val updateUser: String = entity.updateUser
 * val versionNo: Long = entity.versionNo
 * entity.purchaseId = purchaseId
 * entity.memberId = memberId
 * entity.productId = productId
 * entity.purchaseDatetime = purchaseDatetime
 * entity.purchaseCount = purchaseCount
 * entity.purchasePrice = purchasePrice
 * entity.paymentCompleteFlg = paymentCompleteFlg
 * entity.registerDatetime = registerDatetime
 * entity.registerUser = registerUser
 * entity.updateDatetime = updateDatetime
 * entity.updateUser = updateUser
 * entity.versionNo = versionNo
 * = = = = = = = = = =/
 * @author DBFlute(AutoGenerator)
 */
abstract class BsMblePurchase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected val dble: DblePurchase = new DblePurchase();

    // ===================================================================================
    //                                                                      DB-able Entity
    //                                                                      ==============
    def toDBable(): DblePurchase = { dble }

    // ===================================================================================
    //                                                                    Immutable Entity
    //                                                                    ================
    def toImmutable(): Purchase = { dble.toImmutable() }

    // ===================================================================================
    //                                                                          Unique Key
    //                                                                          ==========
    /**
     * To be unique by the unique column. <br />
     * You can update the entity by the key when entity update (NOT batch update).
     * @param memberId (会員ID): UQ+, IX+, NotNull, INTEGER(10), FK to MEMBER. (NotNull)
     * @param productId (商品ID): +UQ, IX+, NotNull, INTEGER(10), FK to PRODUCT. (NotNull)
     * @param purchaseDatetime (購入日時): +UQ, IX+, NotNull, TIMESTAMP(23, 10). (NotNull)
     */
    def uniqueBy(memberId: Integer, productId: Integer, purchaseDatetime: org.joda.time.LocalDateTime): Unit = { dble.setMemberId(memberId);dble.setProductId(productId);dble.setPurchaseDatetime(purchaseDatetime); }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of paymentCompleteFlg as the classification of Flg. <br />
     * (支払完了フラグ)PAYMENT_COMPLETE_FLG: {NotNull, INTEGER(10), classification=Flg} <br />
     * general boolean classification for every flg-column
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    def paymentCompleteFlgAsFlg: CDef.Flg = { dble.getPaymentCompleteFlgAsFlg }

    /**
     * Set the value of paymentCompleteFlg as the classification of Flg. <br />
     * (支払完了フラグ)PAYMENT_COMPLETE_FLG: {NotNull, INTEGER(10), classification=Flg} <br />
     * general boolean classification for every flg-column
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    def paymentCompleteFlgAsFlg_=(cdef: CDef.Flg): Unit = { dble.setPaymentCompleteFlgAsFlg(cdef) }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of paymentCompleteFlg as True (1). <br />
     * Yes: means valid
     */
    def paymentCompleteFlg_True: Unit = { dble.setPaymentCompleteFlg_True }

    /**
     * Set the value of paymentCompleteFlg as False (0). <br />
     * No: means invalid
     */
    def paymentCompleteFlg_False: Unit = { dble.setPaymentCompleteFlg_False }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of paymentCompleteFlg True? <br />
     * Yes: means valid
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isPaymentCompleteFlg_True: Boolean = { dble.isPaymentCompleteFlg_True }

    /**
     * Is the value of paymentCompleteFlg False? <br />
     * No: means invalid
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isPaymentCompleteFlg_False: Boolean = { dble.isPaymentCompleteFlg_False }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PURCHASE_ID: {PK, ID, NotNull, BIGINT(19)} <br />
     * @return The value of the column 'PURCHASE_ID'. (basically NotNull if selected: for the constraint)
     */
    def purchaseId: Long = { dble.getPurchaseId }

    /**
     * [set] PURCHASE_ID: {PK, ID, NotNull, BIGINT(19)} <br />
     * @param purchaseId The value of the column 'PURCHASE_ID'. (NullAllowed: null update allowed for no constraint)
     */
    def purchaseId_=(purchaseId: Long) = { dble.setPurchaseId(purchaseId) }

    /**
     * [get] (会員ID)MEMBER_ID: {UQ+, IX+, NotNull, INTEGER(10), FK to MEMBER} <br />
     * @return The value of the column 'MEMBER_ID'. (basically NotNull if selected: for the constraint)
     */
    def memberId: Int = { dble.getMemberId }

    /**
     * [set] (会員ID)MEMBER_ID: {UQ+, IX+, NotNull, INTEGER(10), FK to MEMBER} <br />
     * @param memberId The value of the column 'MEMBER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    def memberId_=(memberId: Int) = { dble.setMemberId(memberId) }

    /**
     * [get] (商品ID)PRODUCT_ID: {+UQ, IX+, NotNull, INTEGER(10), FK to PRODUCT} <br />
     * @return The value of the column 'PRODUCT_ID'. (basically NotNull if selected: for the constraint)
     */
    def productId: Int = { dble.getProductId }

    /**
     * [set] (商品ID)PRODUCT_ID: {+UQ, IX+, NotNull, INTEGER(10), FK to PRODUCT} <br />
     * @param productId The value of the column 'PRODUCT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    def productId_=(productId: Int) = { dble.setProductId(productId) }

    /**
     * [get] (購入日時)PURCHASE_DATETIME: {+UQ, IX+, NotNull, TIMESTAMP(23, 10)} <br />
     * @return The value of the column 'PURCHASE_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    def purchaseDatetime: org.joda.time.LocalDateTime = { dble.getPurchaseDatetime }

    /**
     * [set] (購入日時)PURCHASE_DATETIME: {+UQ, IX+, NotNull, TIMESTAMP(23, 10)} <br />
     * @param purchaseDatetime The value of the column 'PURCHASE_DATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    def purchaseDatetime_=(purchaseDatetime: org.joda.time.LocalDateTime) = { dble.setPurchaseDatetime(purchaseDatetime) }

    /**
     * [get] (購入数量)PURCHASE_COUNT: {NotNull, INTEGER(10)} <br />
     * @return The value of the column 'PURCHASE_COUNT'. (basically NotNull if selected: for the constraint)
     */
    def purchaseCount: Int = { dble.getPurchaseCount }

    /**
     * [set] (購入数量)PURCHASE_COUNT: {NotNull, INTEGER(10)} <br />
     * @param purchaseCount The value of the column 'PURCHASE_COUNT'. (NullAllowed: null update allowed for no constraint)
     */
    def purchaseCount_=(purchaseCount: Int) = { dble.setPurchaseCount(purchaseCount) }

    /**
     * [get] (購入価格)PURCHASE_PRICE: {IX, NotNull, INTEGER(10)} <br />
     * @return The value of the column 'PURCHASE_PRICE'. (basically NotNull if selected: for the constraint)
     */
    def purchasePrice: Int = { dble.getPurchasePrice }

    /**
     * [set] (購入価格)PURCHASE_PRICE: {IX, NotNull, INTEGER(10)} <br />
     * @param purchasePrice The value of the column 'PURCHASE_PRICE'. (NullAllowed: null update allowed for no constraint)
     */
    def purchasePrice_=(purchasePrice: Int) = { dble.setPurchasePrice(purchasePrice) }

    /**
     * [get] (支払完了フラグ)PAYMENT_COMPLETE_FLG: {NotNull, INTEGER(10), classification=Flg} <br />
     * @return The value of the column 'PAYMENT_COMPLETE_FLG'. (basically NotNull if selected: for the constraint)
     */
    def paymentCompleteFlg: CDef.Flg = { dble.getPaymentCompleteFlgAsFlg }

    /**
     * [set] (支払完了フラグ)PAYMENT_COMPLETE_FLG: {NotNull, INTEGER(10), classification=Flg} <br />
     * @param paymentCompleteFlg The value of the column 'PAYMENT_COMPLETE_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    protected def paymentCompleteFlg_=(paymentCompleteFlg: CDef.Flg) = { dble.setPaymentCompleteFlgAsFlg(paymentCompleteFlg) }

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
