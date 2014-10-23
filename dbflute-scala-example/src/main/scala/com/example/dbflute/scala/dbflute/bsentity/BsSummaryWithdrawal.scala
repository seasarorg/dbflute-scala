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
 * The immutable entity of SUMMARY_WITHDRAWAL as VIEW. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     MEMBER_ID, MEMBER_NAME, WITHDRAWAL_REASON_CODE, WITHDRAWAL_REASON_TEXT, WITHDRAWAL_REASON_INPUT_TEXT, WITHDRAWAL_DATETIME, MEMBER_STATUS_CODE, MEMBER_STATUS_NAME, MAX_PURCHASE_PRICE
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
 * val withdrawalReasonCode: Option[String] = entity.withdrawalReasonCode
 * val withdrawalReasonText: Option[String] = entity.withdrawalReasonText
 * val withdrawalReasonInputText: Option[String] = entity.withdrawalReasonInputText
 * val withdrawalDatetime: Option[org.joda.time.LocalDateTime] = entity.withdrawalDatetime
 * val memberStatusCode: Option[String] = entity.memberStatusCode
 * val memberStatusName: Option[String] = entity.memberStatusName
 * val maxPurchasePrice: Option[Int] = entity.maxPurchasePrice
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
abstract class BsSummaryWithdrawal(dble: DbleSummaryWithdrawal) extends Serializable {

    // ===================================================================================
    //                                                                           Case Like
    //                                                                           =========
    def copy(
         memberId: Option[Int] = memberId
        , memberName: Option[String] = memberName
        , withdrawalReasonCode: Option[String] = withdrawalReasonCode
        , withdrawalReasonText: Option[String] = withdrawalReasonText
        , withdrawalReasonInputText: Option[String] = withdrawalReasonInputText
        , withdrawalDatetime: Option[org.joda.time.LocalDateTime] = withdrawalDatetime
        , memberStatusCode: Option[String] = memberStatusCode
        , memberStatusName: Option[String] = memberStatusName
        , maxPurchasePrice: Option[Int] = maxPurchasePrice
    ): SummaryWithdrawal = {
        val newDble = new DbleSummaryWithdrawal
        newDble.myuniqueDrivenProperties.addAll(dble.myuniqueDrivenProperties) // inherit
        newDble.mymodifiedProperties.addAll(dble.mymodifiedProperties) // inherit
        if (!memberId.equals(this.memberId)) { newDble.setMemberId(memberId.map(int2Integer(_)).orNull) }
        if (!memberName.equals(this.memberName)) { newDble.setMemberName(memberName.orNull) }
        if (!withdrawalReasonCode.equals(this.withdrawalReasonCode)) { newDble.setWithdrawalReasonCode(withdrawalReasonCode.orNull) }
        if (!withdrawalReasonText.equals(this.withdrawalReasonText)) { newDble.setWithdrawalReasonText(withdrawalReasonText.orNull) }
        if (!withdrawalReasonInputText.equals(this.withdrawalReasonInputText)) { newDble.setWithdrawalReasonInputText(withdrawalReasonInputText.orNull) }
        if (!withdrawalDatetime.equals(this.withdrawalDatetime)) { newDble.setWithdrawalDatetime(withdrawalDatetime.orNull) }
        if (!memberStatusCode.equals(this.memberStatusCode)) { newDble.setMemberStatusCode(memberStatusCode.orNull) }
        if (!memberStatusName.equals(this.memberStatusName)) { newDble.setMemberStatusName(memberStatusName.orNull) }
        if (!maxPurchasePrice.equals(this.maxPurchasePrice)) { newDble.setMaxPurchasePrice(maxPurchasePrice.map(int2Integer(_)).orNull) }
        new SummaryWithdrawal(newDble)
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
            case obj: BsSummaryWithdrawal => {
                val other: BsSummaryWithdrawal = obj.asInstanceOf[BsSummaryWithdrawal];
                {(
                     xSV(memberId, other.memberId)
                    && xSV(memberName, other.memberName)
                    && xSV(withdrawalReasonCode, other.withdrawalReasonCode)
                    && xSV(withdrawalReasonText, other.withdrawalReasonText)
                    && xSV(withdrawalReasonInputText, other.withdrawalReasonInputText)
                    && xSV(withdrawalDatetime, other.withdrawalDatetime)
                    && xSV(memberStatusCode, other.memberStatusCode)
                    && xSV(memberStatusName, other.memberStatusName)
                    && xSV(maxPurchasePrice, other.maxPurchasePrice)
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
     * [get] MEMBER_ID: {INTEGER(10)} <br />
     * @return The value of the column 'MEMBER_ID'. (basically NotNull if selected: for the constraint)
     */
    def memberId: Option[Int] = { Option(dble.getMemberId) }

    /**
     * [get] MEMBER_NAME: {VARCHAR(200)} <br />
     * @return The value of the column 'MEMBER_NAME'. (basically NotNull if selected: for the constraint)
     */
    def memberName: Option[String] = { Option(dble.getMemberName) }

    /**
     * [get] WITHDRAWAL_REASON_CODE: {CHAR(3)} <br />
     * @return The value of the column 'WITHDRAWAL_REASON_CODE'. (basically NotNull if selected: for the constraint)
     */
    def withdrawalReasonCode: Option[String] = { Option(dble.getWithdrawalReasonCode) }

    /**
     * [get] WITHDRAWAL_REASON_TEXT: {CLOB(2147483647)} <br />
     * @return The value of the column 'WITHDRAWAL_REASON_TEXT'. (basically NotNull if selected: for the constraint)
     */
    def withdrawalReasonText: Option[String] = { Option(dble.getWithdrawalReasonText) }

    /**
     * [get] WITHDRAWAL_REASON_INPUT_TEXT: {CLOB(2147483647)} <br />
     * @return The value of the column 'WITHDRAWAL_REASON_INPUT_TEXT'. (basically NotNull if selected: for the constraint)
     */
    def withdrawalReasonInputText: Option[String] = { Option(dble.getWithdrawalReasonInputText) }

    /**
     * [get] WITHDRAWAL_DATETIME: {TIMESTAMP(23, 10)} <br />
     * @return The value of the column 'WITHDRAWAL_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    def withdrawalDatetime: Option[org.joda.time.LocalDateTime] = { Option(dble.getWithdrawalDatetime) }

    /**
     * [get] MEMBER_STATUS_CODE: {CHAR(3)} <br />
     * @return The value of the column 'MEMBER_STATUS_CODE'. (basically NotNull if selected: for the constraint)
     */
    def memberStatusCode: Option[String] = { Option(dble.getMemberStatusCode) }

    /**
     * [get] MEMBER_STATUS_NAME: {VARCHAR(50)} <br />
     * @return The value of the column 'MEMBER_STATUS_NAME'. (basically NotNull if selected: for the constraint)
     */
    def memberStatusName: Option[String] = { Option(dble.getMemberStatusName) }

    /**
     * [get] MAX_PURCHASE_PRICE: {INTEGER(10)} <br />
     * @return The value of the column 'MAX_PURCHASE_PRICE'. (basically NotNull if selected: for the constraint)
     */
    def maxPurchasePrice: Option[Int] = { Option(dble.getMaxPurchasePrice) }
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
 * The mutable entity of SUMMARY_WITHDRAWAL as VIEW. <br />
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * val memberId: Option[Int] = entity.memberId
 * val memberName: Option[String] = entity.memberName
 * val withdrawalReasonCode: Option[String] = entity.withdrawalReasonCode
 * val withdrawalReasonText: Option[String] = entity.withdrawalReasonText
 * val withdrawalReasonInputText: Option[String] = entity.withdrawalReasonInputText
 * val withdrawalDatetime: Option[org.joda.time.LocalDateTime] = entity.withdrawalDatetime
 * val memberStatusCode: Option[String] = entity.memberStatusCode
 * val memberStatusName: Option[String] = entity.memberStatusName
 * val maxPurchasePrice: Option[Int] = entity.maxPurchasePrice
 * entity.memberId = memberId
 * entity.memberName = memberName
 * entity.withdrawalReasonCode = withdrawalReasonCode
 * entity.withdrawalReasonText = withdrawalReasonText
 * entity.withdrawalReasonInputText = withdrawalReasonInputText
 * entity.withdrawalDatetime = withdrawalDatetime
 * entity.memberStatusCode = memberStatusCode
 * entity.memberStatusName = memberStatusName
 * entity.maxPurchasePrice = maxPurchasePrice
 * = = = = = = = = = =/
 * @author DBFlute(AutoGenerator)
 */
abstract class BsMbleSummaryWithdrawal {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected val dble: DbleSummaryWithdrawal = new DbleSummaryWithdrawal();

    // ===================================================================================
    //                                                                      DB-able Entity
    //                                                                      ==============
    def toDBable(): DbleSummaryWithdrawal = { dble }

    // ===================================================================================
    //                                                                    Immutable Entity
    //                                                                    ================
    def toImmutable(): SummaryWithdrawal = { dble.toImmutable() }

    // ===================================================================================
    //                                                                          Unique Key
    //                                                                          ==========
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MEMBER_ID: {INTEGER(10)} <br />
     * @return The value of the column 'MEMBER_ID'. (NotNull but EmptyAllowed if null in database)
     */
    def memberId: Option[Int] = { Option(dble.getMemberId) }

    /**
     * [set] MEMBER_ID: {INTEGER(10)} <br />
     * @param memberId The value of the column 'MEMBER_ID'. (basically NotNull if update: for the constraint)
     */
    def memberId_=(memberId: Option[Int]) = { dble.setMemberId(memberId.map(int2Integer(_)).orNull) }

    /**
     * [get] MEMBER_NAME: {VARCHAR(200)} <br />
     * @return The value of the column 'MEMBER_NAME'. (NotNull but EmptyAllowed if null in database)
     */
    def memberName: Option[String] = { Option(dble.getMemberName) }

    /**
     * [set] MEMBER_NAME: {VARCHAR(200)} <br />
     * @param memberName The value of the column 'MEMBER_NAME'. (basically NotNull if update: for the constraint)
     */
    def memberName_=(memberName: Option[String]) = { dble.setMemberName(memberName.orNull) }

    /**
     * [get] WITHDRAWAL_REASON_CODE: {CHAR(3)} <br />
     * @return The value of the column 'WITHDRAWAL_REASON_CODE'. (NotNull but EmptyAllowed if null in database)
     */
    def withdrawalReasonCode: Option[String] = { Option(dble.getWithdrawalReasonCode) }

    /**
     * [set] WITHDRAWAL_REASON_CODE: {CHAR(3)} <br />
     * @param withdrawalReasonCode The value of the column 'WITHDRAWAL_REASON_CODE'. (basically NotNull if update: for the constraint)
     */
    def withdrawalReasonCode_=(withdrawalReasonCode: Option[String]) = { dble.setWithdrawalReasonCode(withdrawalReasonCode.orNull) }

    /**
     * [get] WITHDRAWAL_REASON_TEXT: {CLOB(2147483647)} <br />
     * @return The value of the column 'WITHDRAWAL_REASON_TEXT'. (NotNull but EmptyAllowed if null in database)
     */
    def withdrawalReasonText: Option[String] = { Option(dble.getWithdrawalReasonText) }

    /**
     * [set] WITHDRAWAL_REASON_TEXT: {CLOB(2147483647)} <br />
     * @param withdrawalReasonText The value of the column 'WITHDRAWAL_REASON_TEXT'. (basically NotNull if update: for the constraint)
     */
    def withdrawalReasonText_=(withdrawalReasonText: Option[String]) = { dble.setWithdrawalReasonText(withdrawalReasonText.orNull) }

    /**
     * [get] WITHDRAWAL_REASON_INPUT_TEXT: {CLOB(2147483647)} <br />
     * @return The value of the column 'WITHDRAWAL_REASON_INPUT_TEXT'. (NotNull but EmptyAllowed if null in database)
     */
    def withdrawalReasonInputText: Option[String] = { Option(dble.getWithdrawalReasonInputText) }

    /**
     * [set] WITHDRAWAL_REASON_INPUT_TEXT: {CLOB(2147483647)} <br />
     * @param withdrawalReasonInputText The value of the column 'WITHDRAWAL_REASON_INPUT_TEXT'. (basically NotNull if update: for the constraint)
     */
    def withdrawalReasonInputText_=(withdrawalReasonInputText: Option[String]) = { dble.setWithdrawalReasonInputText(withdrawalReasonInputText.orNull) }

    /**
     * [get] WITHDRAWAL_DATETIME: {TIMESTAMP(23, 10)} <br />
     * @return The value of the column 'WITHDRAWAL_DATETIME'. (NotNull but EmptyAllowed if null in database)
     */
    def withdrawalDatetime: Option[org.joda.time.LocalDateTime] = { Option(dble.getWithdrawalDatetime) }

    /**
     * [set] WITHDRAWAL_DATETIME: {TIMESTAMP(23, 10)} <br />
     * @param withdrawalDatetime The value of the column 'WITHDRAWAL_DATETIME'. (basically NotNull if update: for the constraint)
     */
    def withdrawalDatetime_=(withdrawalDatetime: Option[org.joda.time.LocalDateTime]) = { dble.setWithdrawalDatetime(withdrawalDatetime.orNull) }

    /**
     * [get] MEMBER_STATUS_CODE: {CHAR(3)} <br />
     * @return The value of the column 'MEMBER_STATUS_CODE'. (NotNull but EmptyAllowed if null in database)
     */
    def memberStatusCode: Option[String] = { Option(dble.getMemberStatusCode) }

    /**
     * [set] MEMBER_STATUS_CODE: {CHAR(3)} <br />
     * @param memberStatusCode The value of the column 'MEMBER_STATUS_CODE'. (basically NotNull if update: for the constraint)
     */
    def memberStatusCode_=(memberStatusCode: Option[String]) = { dble.setMemberStatusCode(memberStatusCode.orNull) }

    /**
     * [get] MEMBER_STATUS_NAME: {VARCHAR(50)} <br />
     * @return The value of the column 'MEMBER_STATUS_NAME'. (NotNull but EmptyAllowed if null in database)
     */
    def memberStatusName: Option[String] = { Option(dble.getMemberStatusName) }

    /**
     * [set] MEMBER_STATUS_NAME: {VARCHAR(50)} <br />
     * @param memberStatusName The value of the column 'MEMBER_STATUS_NAME'. (basically NotNull if update: for the constraint)
     */
    def memberStatusName_=(memberStatusName: Option[String]) = { dble.setMemberStatusName(memberStatusName.orNull) }

    /**
     * [get] MAX_PURCHASE_PRICE: {INTEGER(10)} <br />
     * @return The value of the column 'MAX_PURCHASE_PRICE'. (NotNull but EmptyAllowed if null in database)
     */
    def maxPurchasePrice: Option[Int] = { Option(dble.getMaxPurchasePrice) }

    /**
     * [set] MAX_PURCHASE_PRICE: {INTEGER(10)} <br />
     * @param maxPurchasePrice The value of the column 'MAX_PURCHASE_PRICE'. (basically NotNull if update: for the constraint)
     */
    def maxPurchasePrice_=(maxPurchasePrice: Option[Int]) = { dble.setMaxPurchasePrice(maxPurchasePrice.map(int2Integer(_)).orNull) }
}
