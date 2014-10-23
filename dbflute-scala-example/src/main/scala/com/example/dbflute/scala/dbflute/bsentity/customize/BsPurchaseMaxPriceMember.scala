package com.example.dbflute.scala.dbflute.bsentity.customize;

import scala.collection.immutable._;
import scala.collection.JavaConverters._;

import java.io.Serializable;
import java.util.Collection;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.FunCustodial;
import com.example.dbflute.scala.dbflute.exentity.customize._;

/**
 * The immutable entity of PurchaseMaxPriceMember. <br />
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
 * [get template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * val memberId: Option[Int] = entity.memberId
 * val memberName: Option[String] = entity.memberName
 * val purchaseMaxPrice: Option[Int] = entity.purchaseMaxPrice
 * val memberStatusName: Option[String] = entity.memberStatusName
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
abstract class BsPurchaseMaxPriceMember(dble: DblePurchaseMaxPriceMember) extends Serializable {

    // ===================================================================================
    //                                                                           Case Like
    //                                                                           =========
    def copy(
         memberId: Option[Int] = memberId
        , memberName: Option[String] = memberName
        , purchaseMaxPrice: Option[Int] = purchaseMaxPrice
        , memberStatusName: Option[String] = memberStatusName
    ): PurchaseMaxPriceMember = {
        val newDble = new DblePurchaseMaxPriceMember
        newDble.myuniqueDrivenProperties.addAll(dble.myuniqueDrivenProperties) // inherit
        newDble.mymodifiedProperties.addAll(dble.mymodifiedProperties) // inherit
        if (!memberId.equals(this.memberId)) { newDble.setMemberId(memberId.map(int2Integer(_)).orNull) }
        if (!memberName.equals(this.memberName)) { newDble.setMemberName(memberName.orNull) }
        if (!purchaseMaxPrice.equals(this.purchaseMaxPrice)) { newDble.setPurchaseMaxPrice(purchaseMaxPrice.map(int2Integer(_)).orNull) }
        if (!memberStatusName.equals(this.memberStatusName)) { newDble.setMemberStatusName(memberStatusName.orNull) }
        new PurchaseMaxPriceMember(newDble)
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
            case obj: BsPurchaseMaxPriceMember => {
                val other: BsPurchaseMaxPriceMember = obj.asInstanceOf[BsPurchaseMaxPriceMember];
                {(
                     xSV(memberId, other.memberId)
                    && xSV(memberName, other.memberName)
                    && xSV(purchaseMaxPrice, other.purchaseMaxPrice)
                    && xSV(memberStatusName, other.memberStatusName)
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
     * [get] (会員ID)MEMBER_ID: {INTEGER(10), refers to MEMBER.MEMBER_ID} <br />
     * @return The value of the column 'MEMBER_ID'. (basically NotNull if selected: for the constraint)
     */
    def memberId: Option[Int] = { Option(dble.getMemberId) }

    /**
     * [get] (会員名称)MEMBER_NAME: {VARCHAR(200), refers to MEMBER.MEMBER_NAME} <br />
     * @return The value of the column 'MEMBER_NAME'. (basically NotNull if selected: for the constraint)
     */
    def memberName: Option[String] = { Option(dble.getMemberName) }

    /**
     * [get] PURCHASE_MAX_PRICE: {INTEGER(10)} <br />
     * @return The value of the column 'PURCHASE_MAX_PRICE'. (basically NotNull if selected: for the constraint)
     */
    def purchaseMaxPrice: Option[Int] = { Option(dble.getPurchaseMaxPrice) }

    /**
     * [get] (会員ステータス名称)MEMBER_STATUS_NAME: {VARCHAR(50), refers to MEMBER_STATUS.MEMBER_STATUS_NAME} <br />
     * @return The value of the column 'MEMBER_STATUS_NAME'. (basically NotNull if selected: for the constraint)
     */
    def memberStatusName: Option[String] = { Option(dble.getMemberStatusName) }
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
 * The mutable entity of PurchaseMaxPriceMember. <br />
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * val memberId: Option[Int] = entity.memberId
 * val memberName: Option[String] = entity.memberName
 * val purchaseMaxPrice: Option[Int] = entity.purchaseMaxPrice
 * val memberStatusName: Option[String] = entity.memberStatusName
 * entity.memberId = memberId
 * entity.memberName = memberName
 * entity.purchaseMaxPrice = purchaseMaxPrice
 * entity.memberStatusName = memberStatusName
 * = = = = = = = = = =/
 * @author DBFlute(AutoGenerator)
 */
abstract class BsMblePurchaseMaxPriceMember {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected val dble: DblePurchaseMaxPriceMember = new DblePurchaseMaxPriceMember();

    // ===================================================================================
    //                                                                      DB-able Entity
    //                                                                      ==============
    def toDBable(): DblePurchaseMaxPriceMember = { dble }

    // ===================================================================================
    //                                                                    Immutable Entity
    //                                                                    ================
    def toImmutable(): PurchaseMaxPriceMember = { dble.toImmutable() }

    // ===================================================================================
    //                                                                          Unique Key
    //                                                                          ==========
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (会員ID)MEMBER_ID: {INTEGER(10), refers to MEMBER.MEMBER_ID} <br />
     * @return The value of the column 'MEMBER_ID'. (NotNull but EmptyAllowed if null in database)
     */
    def memberId: Option[Int] = { Option(dble.getMemberId) }

    /**
     * [set] (会員ID)MEMBER_ID: {INTEGER(10), refers to MEMBER.MEMBER_ID} <br />
     * @param memberId The value of the column 'MEMBER_ID'. (basically NotNull if update: for the constraint)
     */
    def memberId_=(memberId: Option[Int]) = { dble.setMemberId(memberId.map(int2Integer(_)).orNull) }

    /**
     * [get] (会員名称)MEMBER_NAME: {VARCHAR(200), refers to MEMBER.MEMBER_NAME} <br />
     * @return The value of the column 'MEMBER_NAME'. (NotNull but EmptyAllowed if null in database)
     */
    def memberName: Option[String] = { Option(dble.getMemberName) }

    /**
     * [set] (会員名称)MEMBER_NAME: {VARCHAR(200), refers to MEMBER.MEMBER_NAME} <br />
     * @param memberName The value of the column 'MEMBER_NAME'. (basically NotNull if update: for the constraint)
     */
    def memberName_=(memberName: Option[String]) = { dble.setMemberName(memberName.orNull) }

    /**
     * [get] PURCHASE_MAX_PRICE: {INTEGER(10)} <br />
     * @return The value of the column 'PURCHASE_MAX_PRICE'. (NotNull but EmptyAllowed if null in database)
     */
    def purchaseMaxPrice: Option[Int] = { Option(dble.getPurchaseMaxPrice) }

    /**
     * [set] PURCHASE_MAX_PRICE: {INTEGER(10)} <br />
     * @param purchaseMaxPrice The value of the column 'PURCHASE_MAX_PRICE'. (basically NotNull if update: for the constraint)
     */
    def purchaseMaxPrice_=(purchaseMaxPrice: Option[Int]) = { dble.setPurchaseMaxPrice(purchaseMaxPrice.map(int2Integer(_)).orNull) }

    /**
     * [get] (会員ステータス名称)MEMBER_STATUS_NAME: {VARCHAR(50), refers to MEMBER_STATUS.MEMBER_STATUS_NAME} <br />
     * @return The value of the column 'MEMBER_STATUS_NAME'. (NotNull but EmptyAllowed if null in database)
     */
    def memberStatusName: Option[String] = { Option(dble.getMemberStatusName) }

    /**
     * [set] (会員ステータス名称)MEMBER_STATUS_NAME: {VARCHAR(50), refers to MEMBER_STATUS.MEMBER_STATUS_NAME} <br />
     * @param memberStatusName The value of the column 'MEMBER_STATUS_NAME'. (basically NotNull if update: for the constraint)
     */
    def memberStatusName_=(memberStatusName: Option[String]) = { dble.setMemberStatusName(memberStatusName.orNull) }
}
