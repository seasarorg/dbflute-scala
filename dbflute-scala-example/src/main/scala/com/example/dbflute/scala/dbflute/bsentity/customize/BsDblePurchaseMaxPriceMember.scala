package com.example.dbflute.scala.dbflute.bsentity.customize;

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
import com.example.dbflute.scala.dbflute.exentity.customize._;

/**
 * The entity of PurchaseMaxPriceMember. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     MEMBER_ID, MEMBER_NAME, PURCHASE_MAX_PRICE, MEMBER_STATUS_NAME
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
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer memberId = entity.getMemberId();
 * String memberName = entity.getMemberName();
 * Integer purchaseMaxPrice = entity.getPurchaseMaxPrice();
 * String memberStatusName = entity.getMemberStatusName();
 * entity.setMemberId(memberId);
 * entity.setMemberName(memberName);
 * entity.setPurchaseMaxPrice(purchaseMaxPrice);
 * entity.setMemberStatusName(memberStatusName);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
abstract class BsDblePurchaseMaxPriceMember extends AbstractEntity with DBableEntity[PurchaseMaxPriceMember] with Serializable with Cloneable {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** (会員ID)MEMBER_ID: {INTEGER(10), refers to MEMBER.MEMBER_ID} */
    protected var _memberId: Integer = null;

    /** (会員名称)MEMBER_NAME: {VARCHAR(200), refers to MEMBER.MEMBER_NAME} */
    protected var _memberName: String = null;

    /** PURCHASE_MAX_PRICE: {INTEGER(10)} */
    protected var _purchaseMaxPrice: Integer = null;

    /** (会員ステータス名称)MEMBER_STATUS_NAME: {VARCHAR(50), refers to MEMBER_STATUS.MEMBER_STATUS_NAME} */
    protected var _memberStatusName: String = null;

    // ===================================================================================
    //                                                                           Immutable
    //                                                                           =========
    /**
     * {@inheritDoc}
     */
    def acceptImmutable(immu: PurchaseMaxPriceMember): DblePurchaseMaxPriceMember = {
        setMemberId(immu.memberId.map(int2Integer(_)).orNull);
        setMemberName(immu.memberName.orNull);
        setPurchaseMaxPrice(immu.purchaseMaxPrice.map(int2Integer(_)).orNull);
        setMemberStatusName(immu.memberStatusName.orNull);
        __uniqueDrivenProperties.clear();
        immu.getMyUniqueDrivenProperties().foreach(__uniqueDrivenProperties.addPropertyName(_))
        __modifiedProperties.clear();
        immu.getMyModifiedProperties().foreach(__modifiedProperties.addPropertyName(_))
        return this.asInstanceOf[DblePurchaseMaxPriceMember];
    }

    /**
     * {@inheritDoc}
     */
    def toImmutable(): PurchaseMaxPriceMember = {
        return new PurchaseMaxPriceMember(this.asInstanceOf[DblePurchaseMaxPriceMember]);
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    def getTableDbName(): String = {
        return "PurchaseMaxPriceMember";
    }

    /**
     * {@inheritDoc}
     */
    def getTablePropertyName(): String = {
        return "purchaseMaxPriceMember";
    }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /**
     * {@inheritDoc}
     */
    def getDBMeta(): DBMeta = {
        return com.example.dbflute.scala.dbflute.bsentity.customize.dbmeta.PurchaseMaxPriceMemberDbm;
    }

    // ===================================================================================
    //                                                                         Primary Key
    //                                                                         ===========
    /**
     * {@inheritDoc}
     */
    def hasPrimaryKeyValue(): scala.Boolean = {
        return false;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
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
            case obj: BsDblePurchaseMaxPriceMember => {
                val other: BsDblePurchaseMaxPriceMember = obj.asInstanceOf[BsDblePurchaseMaxPriceMember];
                {(
                     xSV(getMemberId(), other.getMemberId())
                    && xSV(getMemberName(), other.getMemberName())
                    && xSV(getPurchaseMaxPrice(), other.getPurchaseMaxPrice())
                    && xSV(getMemberStatusName(), other.getMemberStatusName())
                )}
            }
            case _ => false
        }
    }

    override protected def doHashCode(initial: Int): Int = {
        var hs: Int = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, getMemberId());
        hs = xCH(hs, getMemberName());
        hs = xCH(hs, getPurchaseMaxPrice());
        hs = xCH(hs, getMemberStatusName());
        return hs;
    }

    override protected def doBuildStringWithRelation(li: String): String = {
        return "";
    }

    override protected def doBuildColumnString(dm: String): String = {
        val sb: StringBuilder = new StringBuilder();
        sb.append(dm).append(getMemberId());
        sb.append(dm).append(getMemberName());
        sb.append(dm).append(getPurchaseMaxPrice());
        sb.append(dm).append(getMemberStatusName());
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    override protected def doBuildRelationString(dm: String): String = {
        return "";
    }

    override def clone(): DblePurchaseMaxPriceMember = {
        return super.clone().asInstanceOf[DblePurchaseMaxPriceMember];
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (会員ID)MEMBER_ID: {INTEGER(10), refers to MEMBER.MEMBER_ID} <br />
     * @return The value of the column 'MEMBER_ID'. (NullAllowed even if selected: for no constraint)
     */
    def getMemberId(): Integer = {
        return _memberId;
    }

    /**
     * [set] (会員ID)MEMBER_ID: {INTEGER(10), refers to MEMBER.MEMBER_ID} <br />
     * @param memberId The value of the column 'MEMBER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    def setMemberId(memberId: Integer): Unit = {
        __modifiedProperties.addPropertyName("memberId");
        _memberId = memberId;
    }

    /**
     * [get] (会員名称)MEMBER_NAME: {VARCHAR(200), refers to MEMBER.MEMBER_NAME} <br />
     * @return The value of the column 'MEMBER_NAME'. (NullAllowed even if selected: for no constraint)
     */
    def getMemberName(): String = {
        return convertEmptyToNull(_memberName);
    }

    /**
     * [set] (会員名称)MEMBER_NAME: {VARCHAR(200), refers to MEMBER.MEMBER_NAME} <br />
     * @param memberName The value of the column 'MEMBER_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    def setMemberName(memberName: String): Unit = {
        __modifiedProperties.addPropertyName("memberName");
        _memberName = memberName;
    }

    /**
     * [get] PURCHASE_MAX_PRICE: {INTEGER(10)} <br />
     * @return The value of the column 'PURCHASE_MAX_PRICE'. (NullAllowed even if selected: for no constraint)
     */
    def getPurchaseMaxPrice(): Integer = {
        return _purchaseMaxPrice;
    }

    /**
     * [set] PURCHASE_MAX_PRICE: {INTEGER(10)} <br />
     * @param purchaseMaxPrice The value of the column 'PURCHASE_MAX_PRICE'. (NullAllowed: null update allowed for no constraint)
     */
    def setPurchaseMaxPrice(purchaseMaxPrice: Integer): Unit = {
        __modifiedProperties.addPropertyName("purchaseMaxPrice");
        _purchaseMaxPrice = purchaseMaxPrice;
    }

    /**
     * [get] (会員ステータス名称)MEMBER_STATUS_NAME: {VARCHAR(50), refers to MEMBER_STATUS.MEMBER_STATUS_NAME} <br />
     * @return The value of the column 'MEMBER_STATUS_NAME'. (NullAllowed even if selected: for no constraint)
     */
    def getMemberStatusName(): String = {
        return convertEmptyToNull(_memberStatusName);
    }

    /**
     * [set] (会員ステータス名称)MEMBER_STATUS_NAME: {VARCHAR(50), refers to MEMBER_STATUS.MEMBER_STATUS_NAME} <br />
     * @param memberStatusName The value of the column 'MEMBER_STATUS_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    def setMemberStatusName(memberStatusName: String): Unit = {
        __modifiedProperties.addPropertyName("memberStatusName");
        _memberStatusName = memberStatusName;
    }
}
