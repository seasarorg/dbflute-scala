package com.example.dbflute.scala.dbflute.bsentity.customize;

import scala.collection.immutable._;
import scala.collection.JavaConverters._;

import java.io.Serializable;
import java.util.Collection;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.FunCustodial;
import com.example.dbflute.scala.dbflute.exentity.customize._;

/**
 * The immutable entity of PurchaseSummaryMember. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     MEMBER_ID, MEMBER_NAME, BIRTHDATE, FORMALIZED_DATETIME, PURCHASE_SUMMARY
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
 * val birthdate: Option[org.joda.time.LocalDate] = entity.birthdate
 * val formalizedDatetime: Option[org.joda.time.LocalDateTime] = entity.formalizedDatetime
 * val purchaseSummary: Option[Long] = entity.purchaseSummary
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
abstract class BsPurchaseSummaryMember(dble: DblePurchaseSummaryMember) extends Serializable {

    // ===================================================================================
    //                                                                           Case Like
    //                                                                           =========
    def copy(
         memberId: Option[Int] = memberId
        , memberName: Option[String] = memberName
        , birthdate: Option[org.joda.time.LocalDate] = birthdate
        , formalizedDatetime: Option[org.joda.time.LocalDateTime] = formalizedDatetime
        , purchaseSummary: Option[Long] = purchaseSummary
    ): PurchaseSummaryMember = {
        val newDble = new DblePurchaseSummaryMember
        newDble.myuniqueDrivenProperties.addAll(dble.myuniqueDrivenProperties) // inherit
        newDble.mymodifiedProperties.addAll(dble.mymodifiedProperties) // inherit
        if (!memberId.equals(this.memberId)) { newDble.setMemberId(memberId.map(int2Integer(_)).orNull) }
        if (!memberName.equals(this.memberName)) { newDble.setMemberName(memberName.orNull) }
        if (!birthdate.equals(this.birthdate)) { newDble.setBirthdate(birthdate.orNull) }
        if (!formalizedDatetime.equals(this.formalizedDatetime)) { newDble.setFormalizedDatetime(formalizedDatetime.orNull) }
        if (!purchaseSummary.equals(this.purchaseSummary)) { newDble.setPurchaseSummary(purchaseSummary.map(long2Long(_)).orNull) }
        new PurchaseSummaryMember(newDble)
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
            case obj: BsPurchaseSummaryMember => {
                val other: BsPurchaseSummaryMember = obj.asInstanceOf[BsPurchaseSummaryMember];
                {(
                     xSV(memberId, other.memberId)
                    && xSV(memberName, other.memberName)
                    && xSV(birthdate, other.birthdate)
                    && xSV(formalizedDatetime, other.formalizedDatetime)
                    && xSV(purchaseSummary, other.purchaseSummary)
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
     * [get] (生年月日)BIRTHDATE: {DATE(8), refers to MEMBER.BIRTHDATE} <br />
     * @return The value of the column 'BIRTHDATE'. (basically NotNull if selected: for the constraint)
     */
    def birthdate: Option[org.joda.time.LocalDate] = { Option(dble.getBirthdate) }

    /**
     * [get] (正式会員日時)FORMALIZED_DATETIME: {TIMESTAMP(23, 10), refers to MEMBER.FORMALIZED_DATETIME} <br />
     * @return The value of the column 'FORMALIZED_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    def formalizedDatetime: Option[org.joda.time.LocalDateTime] = { Option(dble.getFormalizedDatetime) }

    /**
     * [get] PURCHASE_SUMMARY: {BIGINT(10)} <br />
     * @return The value of the column 'PURCHASE_SUMMARY'. (basically NotNull if selected: for the constraint)
     */
    def purchaseSummary: Option[Long] = { Option(dble.getPurchaseSummary) }
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
 * The mutable entity of PurchaseSummaryMember. <br />
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * val memberId: Option[Int] = entity.memberId
 * val memberName: Option[String] = entity.memberName
 * val birthdate: Option[org.joda.time.LocalDate] = entity.birthdate
 * val formalizedDatetime: Option[org.joda.time.LocalDateTime] = entity.formalizedDatetime
 * val purchaseSummary: Option[Long] = entity.purchaseSummary
 * entity.memberId = memberId
 * entity.memberName = memberName
 * entity.birthdate = birthdate
 * entity.formalizedDatetime = formalizedDatetime
 * entity.purchaseSummary = purchaseSummary
 * = = = = = = = = = =/
 * @author DBFlute(AutoGenerator)
 */
abstract class BsMblePurchaseSummaryMember {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected val dble: DblePurchaseSummaryMember = new DblePurchaseSummaryMember();

    // ===================================================================================
    //                                                                      DB-able Entity
    //                                                                      ==============
    def toDBable(): DblePurchaseSummaryMember = { dble }

    // ===================================================================================
    //                                                                    Immutable Entity
    //                                                                    ================
    def toImmutable(): PurchaseSummaryMember = { dble.toImmutable() }

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
     * [get] (生年月日)BIRTHDATE: {DATE(8), refers to MEMBER.BIRTHDATE} <br />
     * @return The value of the column 'BIRTHDATE'. (NotNull but EmptyAllowed if null in database)
     */
    def birthdate: Option[org.joda.time.LocalDate] = { Option(dble.getBirthdate) }

    /**
     * [set] (生年月日)BIRTHDATE: {DATE(8), refers to MEMBER.BIRTHDATE} <br />
     * @param birthdate The value of the column 'BIRTHDATE'. (basically NotNull if update: for the constraint)
     */
    def birthdate_=(birthdate: Option[org.joda.time.LocalDate]) = { dble.setBirthdate(birthdate.orNull) }

    /**
     * [get] (正式会員日時)FORMALIZED_DATETIME: {TIMESTAMP(23, 10), refers to MEMBER.FORMALIZED_DATETIME} <br />
     * @return The value of the column 'FORMALIZED_DATETIME'. (NotNull but EmptyAllowed if null in database)
     */
    def formalizedDatetime: Option[org.joda.time.LocalDateTime] = { Option(dble.getFormalizedDatetime) }

    /**
     * [set] (正式会員日時)FORMALIZED_DATETIME: {TIMESTAMP(23, 10), refers to MEMBER.FORMALIZED_DATETIME} <br />
     * @param formalizedDatetime The value of the column 'FORMALIZED_DATETIME'. (basically NotNull if update: for the constraint)
     */
    def formalizedDatetime_=(formalizedDatetime: Option[org.joda.time.LocalDateTime]) = { dble.setFormalizedDatetime(formalizedDatetime.orNull) }

    /**
     * [get] PURCHASE_SUMMARY: {BIGINT(10)} <br />
     * @return The value of the column 'PURCHASE_SUMMARY'. (NotNull but EmptyAllowed if null in database)
     */
    def purchaseSummary: Option[Long] = { Option(dble.getPurchaseSummary) }

    /**
     * [set] PURCHASE_SUMMARY: {BIGINT(10)} <br />
     * @param purchaseSummary The value of the column 'PURCHASE_SUMMARY'. (basically NotNull if update: for the constraint)
     */
    def purchaseSummary_=(purchaseSummary: Option[Long]) = { dble.setPurchaseSummary(purchaseSummary.map(long2Long(_)).orNull) }
}
