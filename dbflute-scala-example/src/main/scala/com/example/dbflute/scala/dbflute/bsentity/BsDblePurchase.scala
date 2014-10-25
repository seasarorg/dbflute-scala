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
import com.example.dbflute.scala.dbflute.allcommon.CDef;
import com.example.dbflute.scala.dbflute.exentity._;

/**
 * The entity of (購入)PURCHASE as TABLE. <br />
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
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long purchaseId = entity.getPurchaseId();
 * Integer memberId = entity.getMemberId();
 * Integer productId = entity.getProductId();
 * org.joda.time.LocalDateTime purchaseDatetime = entity.getPurchaseDatetime();
 * Integer purchaseCount = entity.getPurchaseCount();
 * Integer purchasePrice = entity.getPurchasePrice();
 * Integer paymentCompleteFlg = entity.getPaymentCompleteFlg();
 * org.joda.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerUser = entity.getRegisterUser();
 * org.joda.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateUser = entity.getUpdateUser();
 * Long versionNo = entity.getVersionNo();
 * entity.setPurchaseId(purchaseId);
 * entity.setMemberId(memberId);
 * entity.setProductId(productId);
 * entity.setPurchaseDatetime(purchaseDatetime);
 * entity.setPurchaseCount(purchaseCount);
 * entity.setPurchasePrice(purchasePrice);
 * entity.setPaymentCompleteFlg(paymentCompleteFlg);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterUser(registerUser);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateUser(updateUser);
 * entity.setVersionNo(versionNo);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
abstract class BsDblePurchase extends AbstractEntity with EntityDefinedCommonColumn with DBableEntity[Purchase] with Serializable with Cloneable {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** PURCHASE_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected var _purchaseId: Long = null;

    /** (会員ID)MEMBER_ID: {UQ+, IX+, NotNull, INTEGER(10), FK to MEMBER} */
    protected var _memberId: Integer = null;

    /** (商品ID)PRODUCT_ID: {+UQ, IX+, NotNull, INTEGER(10), FK to PRODUCT} */
    protected var _productId: Integer = null;

    /** (購入日時)PURCHASE_DATETIME: {+UQ, IX+, NotNull, TIMESTAMP(23, 10)} */
    protected var _purchaseDatetime: org.joda.time.LocalDateTime = null;

    /** (購入数量)PURCHASE_COUNT: {NotNull, INTEGER(10)} */
    protected var _purchaseCount: Integer = null;

    /** (購入価格)PURCHASE_PRICE: {IX, NotNull, INTEGER(10)} */
    protected var _purchasePrice: Integer = null;

    /** (支払完了フラグ)PAYMENT_COMPLETE_FLG: {NotNull, INTEGER(10), classification=Flg} */
    protected var _paymentCompleteFlg: Integer = null;

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

    // ===================================================================================
    //                                                                           Immutable
    //                                                                           =========
    /**
     * {@inheritDoc}
     */
    def acceptImmutable(immu: Purchase): DblePurchase = {
        setPurchaseId(immu.purchaseId);
        setMemberId(immu.memberId);
        setProductId(immu.productId);
        setPurchaseDatetime(immu.purchaseDatetime);
        setPurchaseCount(immu.purchaseCount);
        setPurchasePrice(immu.purchasePrice);
        setPaymentCompleteFlgAsFlg(immu.paymentCompleteFlg);
        setRegisterDatetime(immu.registerDatetime);
        setRegisterUser(immu.registerUser);
        setUpdateDatetime(immu.updateDatetime);
        setUpdateUser(immu.updateUser);
        setVersionNo(immu.versionNo);
        setMember(immu.member.map(new DbleMember().acceptImmutable(_)))
        setProduct(immu.product.map(new DbleProduct().acceptImmutable(_)))
        setPurchasePaymentList(immu.purchasePaymentList.map(new DblePurchasePayment().acceptImmutable(_)).asJava)
        __uniqueDrivenProperties.clear();
        immu.getMyUniqueDrivenProperties().foreach(__uniqueDrivenProperties.addPropertyName(_))
        __modifiedProperties.clear();
        immu.getMyModifiedProperties().foreach(__modifiedProperties.addPropertyName(_))
        return this.asInstanceOf[DblePurchase];
    }

    /**
     * {@inheritDoc}
     */
    def toImmutable(): Purchase = {
        return new Purchase(this.asInstanceOf[DblePurchase]);
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    def getTableDbName(): String = {
        return "PURCHASE";
    }

    /**
     * {@inheritDoc}
     */
    def getTablePropertyName(): String = {
        return "purchase";
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
        if (getPurchaseId() == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br />
     * You can update the entity by the key when entity update (NOT batch update).
     * @param memberId (会員ID): UQ+, IX+, NotNull, INTEGER(10), FK to MEMBER. (NotNull)
     * @param productId (商品ID): +UQ, IX+, NotNull, INTEGER(10), FK to PRODUCT. (NotNull)
     * @param purchaseDatetime (購入日時): +UQ, IX+, NotNull, TIMESTAMP(23, 10). (NotNull)
     */
    def uniqueBy(memberId: Integer, productId: Integer, purchaseDatetime: org.joda.time.LocalDateTime): Unit = {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("memberId");
        __uniqueDrivenProperties.addPropertyName("productId");
        __uniqueDrivenProperties.addPropertyName("purchaseDatetime");
        setMemberId(memberId);setProductId(productId);setPurchaseDatetime(purchaseDatetime);
    }

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
    def getPaymentCompleteFlgAsFlg(): CDef.Flg = {
        return CDef.Flg.codeOf(getPaymentCompleteFlg());
    }

    /**
     * Set the value of paymentCompleteFlg as the classification of Flg. <br />
     * (支払完了フラグ)PAYMENT_COMPLETE_FLG: {NotNull, INTEGER(10), classification=Flg} <br />
     * general boolean classification for every flg-column
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    def setPaymentCompleteFlgAsFlg(cdef: CDef.Flg): Unit = {
        setPaymentCompleteFlg(if (cdef != null) { toNumber(cdef.code, classOf[Integer]) } else { null });
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of paymentCompleteFlg as True (1). <br />
     * Yes: means valid
     */
    def setPaymentCompleteFlg_True(): Unit = {
        setPaymentCompleteFlgAsFlg(CDef.Flg.True);
    }

    /**
     * Set the value of paymentCompleteFlg as False (0). <br />
     * No: means invalid
     */
    def setPaymentCompleteFlg_False(): Unit = {
        setPaymentCompleteFlgAsFlg(CDef.Flg.False);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of paymentCompleteFlg True? <br />
     * Yes: means valid
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isPaymentCompleteFlg_True(): Boolean = {
        val cdef: CDef.Flg = getPaymentCompleteFlgAsFlg();
        return if (cdef != null) { cdef.equals(CDef.Flg.True) } else { false };
    }

    /**
     * Is the value of paymentCompleteFlg False? <br />
     * No: means invalid
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isPaymentCompleteFlg_False(): Boolean = {
        val cdef: CDef.Flg = getPaymentCompleteFlgAsFlg();
        return if (cdef != null) { cdef.equals(CDef.Flg.False) } else { false };
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    /**
     * Get the value of the column 'paymentCompleteFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    def getPaymentCompleteFlgName(): String = {
        val cdef: CDef.Flg = getPaymentCompleteFlgAsFlg();
        return if (cdef != null) { cdef.name } else { null };
    }

    /**
     * Get the value of the column 'paymentCompleteFlg' as classification alias.
     * @return The string of classification alias. (NullAllowed: when the column value is null)
     */
    def getPaymentCompleteFlgAlias(): String = {
        val cdef: CDef.Flg = getPaymentCompleteFlgAsFlg();
        return if (cdef != null) { cdef.alias } else { null };
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** (会員)MEMBER by my MEMBER_ID, named 'member'. */
    protected var _member: Option[DbleMember] = null;

    /**
     * [get] (会員)MEMBER by my MEMBER_ID, named 'member'.
     * @return The entity of foreign property 'member'. (EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    def getMember(): Option[DbleMember] = {
        return if (_member != null) { _member; } else { Option.empty; }
    }

    /**
     * [set] (会員)MEMBER by my MEMBER_ID, named 'member'.
     * @param member The entity of foreign property 'member'. (EmptyAllowed)
     */
    def setMember(member: Option[DbleMember]): Unit = {
        _member = member;
    }

    /**
     * [convert] (会員)MEMBER by my MEMBER_ID, named 'member'.
     * @return The new-created immutable entity of foreign property 'member'. (NotNull)
     */
    def toImmutableMember(): Option[Member] = {
        return getMember().map(_.toImmutable());
    }

    /** (商品)PRODUCT by my PRODUCT_ID, named 'product'. */
    protected var _product: Option[DbleProduct] = null;

    /**
     * [get] (商品)PRODUCT by my PRODUCT_ID, named 'product'.
     * @return The entity of foreign property 'product'. (EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    def getProduct(): Option[DbleProduct] = {
        return if (_product != null) { _product; } else { Option.empty; }
    }

    /**
     * [set] (商品)PRODUCT by my PRODUCT_ID, named 'product'.
     * @param product The entity of foreign property 'product'. (EmptyAllowed)
     */
    def setProduct(product: Option[DbleProduct]): Unit = {
        _product = product;
    }

    /**
     * [convert] (商品)PRODUCT by my PRODUCT_ID, named 'product'.
     * @return The new-created immutable entity of foreign property 'product'. (NotNull)
     */
    def toImmutableProduct(): Option[Product] = {
        return getProduct().map(_.toImmutable());
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** (購入支払)PURCHASE_PAYMENT by PURCHASE_ID, named 'purchasePaymentList'. */
    protected var _purchasePaymentList: List[DblePurchasePayment] = null;

    /**
     * [get] (購入支払)PURCHASE_PAYMENT by PURCHASE_ID, named 'purchasePaymentList'.
     * @return The entity list of referrer property 'purchasePaymentList'. (NotNull: even if no loading, returns empty list)
     */
    def getPurchasePaymentList(): List[DblePurchasePayment] = {
        if (_purchasePaymentList == null) { _purchasePaymentList = newReferrerScalaList(); }
        return _purchasePaymentList;
    }

    /**
     * [set] (購入支払)PURCHASE_PAYMENT by PURCHASE_ID, named 'purchasePaymentList'.
     * @param purchasePaymentList The entity list of referrer property 'purchasePaymentList'. (NullAllowed)
     */
    def setPurchasePaymentList(purchasePaymentList: List[DblePurchasePayment]): Unit = {
        _purchasePaymentList = purchasePaymentList;
    }

    /**
     * [convert] (購入支払)PURCHASE_PAYMENT by PURCHASE_ID, named 'purchasePaymentList'.
     * @return The new-created immutable list of immutable entity of the referrer property 'purchasePaymentList'. (NotNull)
     */
    def toImmutablePurchasePaymentList(): immutable.List[PurchasePayment] = {
        return toScalaList(_purchasePaymentList).map(_.toImmutable());
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
            case obj: BsDblePurchase => {
                val other: BsDblePurchase = obj.asInstanceOf[BsDblePurchase];
                {(
                     xSV(getPurchaseId(), other.getPurchaseId())
                )}
            }
            case _ => false
        }
    }

    override protected def doHashCode(initial: Int): Int = {
        var hs: Int = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, getPurchaseId());
        return hs;
    }

    override protected def doBuildStringWithRelation(li: String): String = {
        val sb: StringBuilder = new StringBuilder();
        if (_member != null && _member.isEmpty)
        { sb.append(li).append(xbRDS(_member, "member")); }
        if (_product != null && _product.isEmpty)
        { sb.append(li).append(xbRDS(_product, "product")); }
        toScalaList(_purchasePaymentList).foreach(et => { if (et != null) { sb.append(li).append(xbRDS(et, "purchasePaymentList")) } });
        return sb.toString();
    }
    protected def xbRDS[ET <: Entity](et: Option[ET], name: String): String = {
        return et.get.buildDisplayString(name, true, true);
    }

    override protected def doBuildColumnString(dm: String): String = {
        val sb: StringBuilder = new StringBuilder();
        sb.append(dm).append(getPurchaseId());
        sb.append(dm).append(getMemberId());
        sb.append(dm).append(getProductId());
        sb.append(dm).append(getPurchaseDatetime());
        sb.append(dm).append(getPurchaseCount());
        sb.append(dm).append(getPurchasePrice());
        sb.append(dm).append(getPaymentCompleteFlg());
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

    override protected def doBuildRelationString(dm: String): String = {
        val sb: StringBuilder = new StringBuilder();
        if (_member != null && _member.isEmpty)
        { sb.append(dm).append("member"); }
        if (_product != null && _product.isEmpty)
        { sb.append(dm).append("product"); }
        if (_purchasePaymentList != null && !_purchasePaymentList.isEmpty)
        { sb.append(dm).append("purchasePaymentList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    override def clone(): DblePurchase = {
        return super.clone().asInstanceOf[DblePurchase];
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PURCHASE_ID: {PK, ID, NotNull, BIGINT(19)} <br />
     * @return The value of the column 'PURCHASE_ID'. (basically NotNull if selected: for the constraint)
     */
    def getPurchaseId(): Long = {
        return _purchaseId;
    }

    /**
     * [set] PURCHASE_ID: {PK, ID, NotNull, BIGINT(19)} <br />
     * @param purchaseId The value of the column 'PURCHASE_ID'. (basically NotNull if update: for the constraint)
     */
    def setPurchaseId(purchaseId: Long): Unit = {
        __modifiedProperties.addPropertyName("purchaseId");
        _purchaseId = purchaseId;
    }

    /**
     * [get] (会員ID)MEMBER_ID: {UQ+, IX+, NotNull, INTEGER(10), FK to MEMBER} <br />
     * @return The value of the column 'MEMBER_ID'. (basically NotNull if selected: for the constraint)
     */
    def getMemberId(): Integer = {
        return _memberId;
    }

    /**
     * [set] (会員ID)MEMBER_ID: {UQ+, IX+, NotNull, INTEGER(10), FK to MEMBER} <br />
     * @param memberId The value of the column 'MEMBER_ID'. (basically NotNull if update: for the constraint)
     */
    def setMemberId(memberId: Integer): Unit = {
        __modifiedProperties.addPropertyName("memberId");
        _memberId = memberId;
    }

    /**
     * [get] (商品ID)PRODUCT_ID: {+UQ, IX+, NotNull, INTEGER(10), FK to PRODUCT} <br />
     * @return The value of the column 'PRODUCT_ID'. (basically NotNull if selected: for the constraint)
     */
    def getProductId(): Integer = {
        return _productId;
    }

    /**
     * [set] (商品ID)PRODUCT_ID: {+UQ, IX+, NotNull, INTEGER(10), FK to PRODUCT} <br />
     * @param productId The value of the column 'PRODUCT_ID'. (basically NotNull if update: for the constraint)
     */
    def setProductId(productId: Integer): Unit = {
        __modifiedProperties.addPropertyName("productId");
        _productId = productId;
    }

    /**
     * [get] (購入日時)PURCHASE_DATETIME: {+UQ, IX+, NotNull, TIMESTAMP(23, 10)} <br />
     * @return The value of the column 'PURCHASE_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    def getPurchaseDatetime(): org.joda.time.LocalDateTime = {
        return _purchaseDatetime;
    }

    /**
     * [set] (購入日時)PURCHASE_DATETIME: {+UQ, IX+, NotNull, TIMESTAMP(23, 10)} <br />
     * @param purchaseDatetime The value of the column 'PURCHASE_DATETIME'. (basically NotNull if update: for the constraint)
     */
    def setPurchaseDatetime(purchaseDatetime: org.joda.time.LocalDateTime): Unit = {
        __modifiedProperties.addPropertyName("purchaseDatetime");
        _purchaseDatetime = purchaseDatetime;
    }

    /**
     * [get] (購入数量)PURCHASE_COUNT: {NotNull, INTEGER(10)} <br />
     * @return The value of the column 'PURCHASE_COUNT'. (basically NotNull if selected: for the constraint)
     */
    def getPurchaseCount(): Integer = {
        return _purchaseCount;
    }

    /**
     * [set] (購入数量)PURCHASE_COUNT: {NotNull, INTEGER(10)} <br />
     * @param purchaseCount The value of the column 'PURCHASE_COUNT'. (basically NotNull if update: for the constraint)
     */
    def setPurchaseCount(purchaseCount: Integer): Unit = {
        __modifiedProperties.addPropertyName("purchaseCount");
        _purchaseCount = purchaseCount;
    }

    /**
     * [get] (購入価格)PURCHASE_PRICE: {IX, NotNull, INTEGER(10)} <br />
     * @return The value of the column 'PURCHASE_PRICE'. (basically NotNull if selected: for the constraint)
     */
    def getPurchasePrice(): Integer = {
        return _purchasePrice;
    }

    /**
     * [set] (購入価格)PURCHASE_PRICE: {IX, NotNull, INTEGER(10)} <br />
     * @param purchasePrice The value of the column 'PURCHASE_PRICE'. (basically NotNull if update: for the constraint)
     */
    def setPurchasePrice(purchasePrice: Integer): Unit = {
        __modifiedProperties.addPropertyName("purchasePrice");
        _purchasePrice = purchasePrice;
    }

    /**
     * [get] (支払完了フラグ)PAYMENT_COMPLETE_FLG: {NotNull, INTEGER(10), classification=Flg} <br />
     * @return The value of the column 'PAYMENT_COMPLETE_FLG'. (basically NotNull if selected: for the constraint)
     */
    def getPaymentCompleteFlg(): Integer = {
        return _paymentCompleteFlg;
    }

    /**
     * [set] (支払完了フラグ)PAYMENT_COMPLETE_FLG: {NotNull, INTEGER(10), classification=Flg} <br />
     * @param paymentCompleteFlg The value of the column 'PAYMENT_COMPLETE_FLG'. (basically NotNull if update: for the constraint)
     */
    protected def setPaymentCompleteFlg(paymentCompleteFlg: Integer): Unit = {
        checkClassificationCode("PAYMENT_COMPLETE_FLG", CDef.DefMeta.Flg, paymentCompleteFlg);
        __modifiedProperties.addPropertyName("paymentCompleteFlg");
        _paymentCompleteFlg = paymentCompleteFlg;
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
     * @param paymentCompleteFlg The value of the column 'PAYMENT_COMPLETE_FLG'. (basically NotNull if update: for the constraint)
     */
    def mynativeMappingPaymentCompleteFlg(paymentCompleteFlg: Integer): Unit = {
        setPaymentCompleteFlg(paymentCompleteFlg);
    }
}
