package com.example.dbflute.scala.dbflute.bsentity.customize;

import scala.collection.immutable._;
import scala.collection.JavaConverters._;

import java.io.Serializable;
import java.util.Collection;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.FunCustodial;
import com.example.dbflute.scala.dbflute.exentity.customize._;
import com.example.dbflute.scala.dbflute.exentity._;

/**
 * The immutable entity of UnpaidSummaryMember. <br />
 * <pre>
 * [primary-key]
 *     UNPAID_MAN_ID
 * 
 * [column]
 *     UNPAID_MAN_ID, UNPAID_MAN_NAME, UNPAID_PRICE_SUMMARY, STATUS_NAME
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
 * val unpaidManId: Option[Int] = entity.unpaidManId
 * val unpaidManName: Option[String] = entity.unpaidManName
 * val unpaidPriceSummary: Option[Long] = entity.unpaidPriceSummary
 * val statusName: Option[String] = entity.statusName
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
abstract class BsUnpaidSummaryMember(dble: DbleUnpaidSummaryMember) extends Serializable {

    // ===================================================================================
    //                                                                           Case Like
    //                                                                           =========
    def copy(
         unpaidManId: Option[Int] = unpaidManId
        , unpaidManName: Option[String] = unpaidManName
        , unpaidPriceSummary: Option[Long] = unpaidPriceSummary
        , statusName: Option[String] = statusName
    ): UnpaidSummaryMember = {
        val newDble = new DbleUnpaidSummaryMember
        newDble.myuniqueDrivenProperties.addAll(dble.myuniqueDrivenProperties) // inherit
        newDble.mymodifiedProperties.addAll(dble.mymodifiedProperties) // inherit
        if (!unpaidManId.equals(this.unpaidManId)) { newDble.setUnpaidManId(unpaidManId.map(int2Integer(_)).orNull) }
        if (!unpaidManName.equals(this.unpaidManName)) { newDble.setUnpaidManName(unpaidManName.orNull) }
        if (!unpaidPriceSummary.equals(this.unpaidPriceSummary)) { newDble.setUnpaidPriceSummary(unpaidPriceSummary.map(long2Long(_)).orNull) }
        if (!statusName.equals(this.statusName)) { newDble.setStatusName(statusName.orNull) }
        new UnpaidSummaryMember(newDble)
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
            case obj: BsUnpaidSummaryMember => {
                val other: BsUnpaidSummaryMember = obj.asInstanceOf[BsUnpaidSummaryMember];
                {(
                     xSV(unpaidManId, other.unpaidManId)
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
     * [get] (会員ID)UNPAID_MAN_ID: {PK, INTEGER(10), refers to MEMBER.MEMBER_ID} <br />
     * @return The value of the column 'UNPAID_MAN_ID'. (basically NotNull if selected: for the constraint)
     */
    def unpaidManId: Option[Int] = { Option(dble.getUnpaidManId) }

    /**
     * [get] (会員名称)UNPAID_MAN_NAME: {VARCHAR(200), refers to MEMBER.MEMBER_NAME} <br />
     * @return The value of the column 'UNPAID_MAN_NAME'. (basically NotNull if selected: for the constraint)
     */
    def unpaidManName: Option[String] = { Option(dble.getUnpaidManName) }

    /**
     * [get] UNPAID_PRICE_SUMMARY: {BIGINT(10)} <br />
     * @return The value of the column 'UNPAID_PRICE_SUMMARY'. (basically NotNull if selected: for the constraint)
     */
    def unpaidPriceSummary: Option[Long] = { Option(dble.getUnpaidPriceSummary) }

    /**
     * [get] (会員ステータス名称)STATUS_NAME: {VARCHAR(50), refers to MEMBER_STATUS.MEMBER_STATUS_NAME} <br />
     * @return The value of the column 'STATUS_NAME'. (basically NotNull if selected: for the constraint)
     */
    def statusName: Option[String] = { Option(dble.getStatusName) }
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
 * The mutable entity of UnpaidSummaryMember. <br />
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * val unpaidManId: Option[Int] = entity.unpaidManId
 * val unpaidManName: Option[String] = entity.unpaidManName
 * val unpaidPriceSummary: Option[Long] = entity.unpaidPriceSummary
 * val statusName: Option[String] = entity.statusName
 * entity.unpaidManId = unpaidManId
 * entity.unpaidManName = unpaidManName
 * entity.unpaidPriceSummary = unpaidPriceSummary
 * entity.statusName = statusName
 * = = = = = = = = = =/
 * @author DBFlute(AutoGenerator)
 */
abstract class BsMbleUnpaidSummaryMember {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected val dble: DbleUnpaidSummaryMember = new DbleUnpaidSummaryMember();

    // ===================================================================================
    //                                                                      DB-able Entity
    //                                                                      ==============
    def toDBable(): DbleUnpaidSummaryMember = { dble }

    // ===================================================================================
    //                                                                    Immutable Entity
    //                                                                    ================
    def toImmutable(): UnpaidSummaryMember = { dble.toImmutable() }

    // ===================================================================================
    //                                                                          Unique Key
    //                                                                          ==========
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (会員ID)UNPAID_MAN_ID: {PK, INTEGER(10), refers to MEMBER.MEMBER_ID} <br />
     * @return The value of the column 'UNPAID_MAN_ID'. (NotNull but EmptyAllowed if null in database)
     */
    def unpaidManId: Option[Int] = { Option(dble.getUnpaidManId) }

    /**
     * [set] (会員ID)UNPAID_MAN_ID: {PK, INTEGER(10), refers to MEMBER.MEMBER_ID} <br />
     * @param unpaidManId The value of the column 'UNPAID_MAN_ID'. (basically NotNull if update: for the constraint)
     */
    def unpaidManId_=(unpaidManId: Option[Int]) = { dble.setUnpaidManId(unpaidManId.map(int2Integer(_)).orNull) }

    /**
     * [get] (会員名称)UNPAID_MAN_NAME: {VARCHAR(200), refers to MEMBER.MEMBER_NAME} <br />
     * @return The value of the column 'UNPAID_MAN_NAME'. (NotNull but EmptyAllowed if null in database)
     */
    def unpaidManName: Option[String] = { Option(dble.getUnpaidManName) }

    /**
     * [set] (会員名称)UNPAID_MAN_NAME: {VARCHAR(200), refers to MEMBER.MEMBER_NAME} <br />
     * @param unpaidManName The value of the column 'UNPAID_MAN_NAME'. (basically NotNull if update: for the constraint)
     */
    def unpaidManName_=(unpaidManName: Option[String]) = { dble.setUnpaidManName(unpaidManName.orNull) }

    /**
     * [get] UNPAID_PRICE_SUMMARY: {BIGINT(10)} <br />
     * @return The value of the column 'UNPAID_PRICE_SUMMARY'. (NotNull but EmptyAllowed if null in database)
     */
    def unpaidPriceSummary: Option[Long] = { Option(dble.getUnpaidPriceSummary) }

    /**
     * [set] UNPAID_PRICE_SUMMARY: {BIGINT(10)} <br />
     * @param unpaidPriceSummary The value of the column 'UNPAID_PRICE_SUMMARY'. (basically NotNull if update: for the constraint)
     */
    def unpaidPriceSummary_=(unpaidPriceSummary: Option[Long]) = { dble.setUnpaidPriceSummary(unpaidPriceSummary.map(long2Long(_)).orNull) }

    /**
     * [get] (会員ステータス名称)STATUS_NAME: {VARCHAR(50), refers to MEMBER_STATUS.MEMBER_STATUS_NAME} <br />
     * @return The value of the column 'STATUS_NAME'. (NotNull but EmptyAllowed if null in database)
     */
    def statusName: Option[String] = { Option(dble.getStatusName) }

    /**
     * [set] (会員ステータス名称)STATUS_NAME: {VARCHAR(50), refers to MEMBER_STATUS.MEMBER_STATUS_NAME} <br />
     * @param statusName The value of the column 'STATUS_NAME'. (basically NotNull if update: for the constraint)
     */
    def statusName_=(statusName: Option[String]) = { dble.setStatusName(statusName.orNull) }
}
