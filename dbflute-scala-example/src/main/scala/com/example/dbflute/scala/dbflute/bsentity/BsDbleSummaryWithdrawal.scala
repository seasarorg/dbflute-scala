package com.example.dbflute.scala.dbflute.bsentity;

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
import com.example.dbflute.scala.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.scala.dbflute.exentity._;

/**
 * The entity of SUMMARY_WITHDRAWAL as VIEW. <br />
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
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer memberId = entity.getMemberId();
 * String memberName = entity.getMemberName();
 * String withdrawalReasonCode = entity.getWithdrawalReasonCode();
 * String withdrawalReasonText = entity.getWithdrawalReasonText();
 * String withdrawalReasonInputText = entity.getWithdrawalReasonInputText();
 * org.joda.time.LocalDateTime withdrawalDatetime = entity.getWithdrawalDatetime();
 * String memberStatusCode = entity.getMemberStatusCode();
 * String memberStatusName = entity.getMemberStatusName();
 * Integer maxPurchasePrice = entity.getMaxPurchasePrice();
 * entity.setMemberId(memberId);
 * entity.setMemberName(memberName);
 * entity.setWithdrawalReasonCode(withdrawalReasonCode);
 * entity.setWithdrawalReasonText(withdrawalReasonText);
 * entity.setWithdrawalReasonInputText(withdrawalReasonInputText);
 * entity.setWithdrawalDatetime(withdrawalDatetime);
 * entity.setMemberStatusCode(memberStatusCode);
 * entity.setMemberStatusName(memberStatusName);
 * entity.setMaxPurchasePrice(maxPurchasePrice);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
abstract class BsDbleSummaryWithdrawal extends AbstractEntity with DBableEntity[SummaryWithdrawal] with Serializable with Cloneable {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** MEMBER_ID: {INTEGER(10)} */
    protected var _memberId: Integer = null;

    /** MEMBER_NAME: {VARCHAR(200)} */
    protected var _memberName: String = null;

    /** WITHDRAWAL_REASON_CODE: {CHAR(3)} */
    protected var _withdrawalReasonCode: String = null;

    /** WITHDRAWAL_REASON_TEXT: {CLOB(2147483647)} */
    protected var _withdrawalReasonText: String = null;

    /** WITHDRAWAL_REASON_INPUT_TEXT: {CLOB(2147483647)} */
    protected var _withdrawalReasonInputText: String = null;

    /** WITHDRAWAL_DATETIME: {TIMESTAMP(23, 10)} */
    protected var _withdrawalDatetime: org.joda.time.LocalDateTime = null;

    /** MEMBER_STATUS_CODE: {CHAR(3)} */
    protected var _memberStatusCode: String = null;

    /** MEMBER_STATUS_NAME: {VARCHAR(50)} */
    protected var _memberStatusName: String = null;

    /** MAX_PURCHASE_PRICE: {INTEGER(10)} */
    protected var _maxPurchasePrice: Integer = null;

    // ===================================================================================
    //                                                                           Immutable
    //                                                                           =========
    /**
     * {@inheritDoc}
     */
    def acceptImmutable(immu: SummaryWithdrawal): DbleSummaryWithdrawal = {
        setMemberId(immu.memberId.map(int2Integer(_)).orNull);
        setMemberName(immu.memberName.orNull);
        setWithdrawalReasonCode(immu.withdrawalReasonCode.orNull);
        setWithdrawalReasonText(immu.withdrawalReasonText.orNull);
        setWithdrawalReasonInputText(immu.withdrawalReasonInputText.orNull);
        setWithdrawalDatetime(immu.withdrawalDatetime.orNull);
        setMemberStatusCode(immu.memberStatusCode.orNull);
        setMemberStatusName(immu.memberStatusName.orNull);
        setMaxPurchasePrice(immu.maxPurchasePrice.map(int2Integer(_)).orNull);
        __uniqueDrivenProperties.clear();
        immu.getMyUniqueDrivenProperties().foreach(__uniqueDrivenProperties.addPropertyName(_))
        __modifiedProperties.clear();
        immu.getMyModifiedProperties().foreach(__modifiedProperties.addPropertyName(_))
        return this.asInstanceOf[DbleSummaryWithdrawal];
    }

    /**
     * {@inheritDoc}
     */
    def toImmutable(): SummaryWithdrawal = {
        return new SummaryWithdrawal(this.asInstanceOf[DbleSummaryWithdrawal]);
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    def getTableDbName(): String = {
        return "SUMMARY_WITHDRAWAL";
    }

    /**
     * {@inheritDoc}
     */
    def getTablePropertyName(): String = {
        return "summaryWithdrawal";
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
            case obj: BsDbleSummaryWithdrawal => {
                val other: BsDbleSummaryWithdrawal = obj.asInstanceOf[BsDbleSummaryWithdrawal];
                {(
                     xSV(getMemberId(), other.getMemberId())
                    && xSV(getMemberName(), other.getMemberName())
                    && xSV(getWithdrawalReasonCode(), other.getWithdrawalReasonCode())
                    && xSV(getWithdrawalReasonText(), other.getWithdrawalReasonText())
                    && xSV(getWithdrawalReasonInputText(), other.getWithdrawalReasonInputText())
                    && xSV(getWithdrawalDatetime(), other.getWithdrawalDatetime())
                    && xSV(getMemberStatusCode(), other.getMemberStatusCode())
                    && xSV(getMemberStatusName(), other.getMemberStatusName())
                    && xSV(getMaxPurchasePrice(), other.getMaxPurchasePrice())
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
        hs = xCH(hs, getWithdrawalReasonCode());
        hs = xCH(hs, getWithdrawalReasonText());
        hs = xCH(hs, getWithdrawalReasonInputText());
        hs = xCH(hs, getWithdrawalDatetime());
        hs = xCH(hs, getMemberStatusCode());
        hs = xCH(hs, getMemberStatusName());
        hs = xCH(hs, getMaxPurchasePrice());
        return hs;
    }

    override protected def doBuildStringWithRelation(li: String): String = {
        return "";
    }

    override protected def doBuildColumnString(dm: String): String = {
        val sb: StringBuilder = new StringBuilder();
        sb.append(dm).append(getMemberId());
        sb.append(dm).append(getMemberName());
        sb.append(dm).append(getWithdrawalReasonCode());
        sb.append(dm).append(getWithdrawalReasonText());
        sb.append(dm).append(getWithdrawalReasonInputText());
        sb.append(dm).append(getWithdrawalDatetime());
        sb.append(dm).append(getMemberStatusCode());
        sb.append(dm).append(getMemberStatusName());
        sb.append(dm).append(getMaxPurchasePrice());
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    override protected def doBuildRelationString(dm: String): String = {
        return "";
    }

    override def clone(): DbleSummaryWithdrawal = {
        return super.clone().asInstanceOf[DbleSummaryWithdrawal];
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MEMBER_ID: {INTEGER(10)} <br />
     * @return The value of the column 'MEMBER_ID'. (NullAllowed even if selected: for no constraint)
     */
    def getMemberId(): Integer = {
        return _memberId;
    }

    /**
     * [set] MEMBER_ID: {INTEGER(10)} <br />
     * @param memberId The value of the column 'MEMBER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    def setMemberId(memberId: Integer): Unit = {
        __modifiedProperties.addPropertyName("memberId");
        _memberId = memberId;
    }

    /**
     * [get] MEMBER_NAME: {VARCHAR(200)} <br />
     * @return The value of the column 'MEMBER_NAME'. (NullAllowed even if selected: for no constraint)
     */
    def getMemberName(): String = {
        return convertEmptyToNull(_memberName);
    }

    /**
     * [set] MEMBER_NAME: {VARCHAR(200)} <br />
     * @param memberName The value of the column 'MEMBER_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    def setMemberName(memberName: String): Unit = {
        __modifiedProperties.addPropertyName("memberName");
        _memberName = memberName;
    }

    /**
     * [get] WITHDRAWAL_REASON_CODE: {CHAR(3)} <br />
     * @return The value of the column 'WITHDRAWAL_REASON_CODE'. (NullAllowed even if selected: for no constraint)
     */
    def getWithdrawalReasonCode(): String = {
        return convertEmptyToNull(_withdrawalReasonCode);
    }

    /**
     * [set] WITHDRAWAL_REASON_CODE: {CHAR(3)} <br />
     * @param withdrawalReasonCode The value of the column 'WITHDRAWAL_REASON_CODE'. (NullAllowed: null update allowed for no constraint)
     */
    def setWithdrawalReasonCode(withdrawalReasonCode: String): Unit = {
        __modifiedProperties.addPropertyName("withdrawalReasonCode");
        _withdrawalReasonCode = withdrawalReasonCode;
    }

    /**
     * [get] WITHDRAWAL_REASON_TEXT: {CLOB(2147483647)} <br />
     * @return The value of the column 'WITHDRAWAL_REASON_TEXT'. (NullAllowed even if selected: for no constraint)
     */
    def getWithdrawalReasonText(): String = {
        return convertEmptyToNull(_withdrawalReasonText);
    }

    /**
     * [set] WITHDRAWAL_REASON_TEXT: {CLOB(2147483647)} <br />
     * @param withdrawalReasonText The value of the column 'WITHDRAWAL_REASON_TEXT'. (NullAllowed: null update allowed for no constraint)
     */
    def setWithdrawalReasonText(withdrawalReasonText: String): Unit = {
        __modifiedProperties.addPropertyName("withdrawalReasonText");
        _withdrawalReasonText = withdrawalReasonText;
    }

    /**
     * [get] WITHDRAWAL_REASON_INPUT_TEXT: {CLOB(2147483647)} <br />
     * @return The value of the column 'WITHDRAWAL_REASON_INPUT_TEXT'. (NullAllowed even if selected: for no constraint)
     */
    def getWithdrawalReasonInputText(): String = {
        return convertEmptyToNull(_withdrawalReasonInputText);
    }

    /**
     * [set] WITHDRAWAL_REASON_INPUT_TEXT: {CLOB(2147483647)} <br />
     * @param withdrawalReasonInputText The value of the column 'WITHDRAWAL_REASON_INPUT_TEXT'. (NullAllowed: null update allowed for no constraint)
     */
    def setWithdrawalReasonInputText(withdrawalReasonInputText: String): Unit = {
        __modifiedProperties.addPropertyName("withdrawalReasonInputText");
        _withdrawalReasonInputText = withdrawalReasonInputText;
    }

    /**
     * [get] WITHDRAWAL_DATETIME: {TIMESTAMP(23, 10)} <br />
     * @return The value of the column 'WITHDRAWAL_DATETIME'. (NullAllowed even if selected: for no constraint)
     */
    def getWithdrawalDatetime(): org.joda.time.LocalDateTime = {
        return _withdrawalDatetime;
    }

    /**
     * [set] WITHDRAWAL_DATETIME: {TIMESTAMP(23, 10)} <br />
     * @param withdrawalDatetime The value of the column 'WITHDRAWAL_DATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    def setWithdrawalDatetime(withdrawalDatetime: org.joda.time.LocalDateTime): Unit = {
        __modifiedProperties.addPropertyName("withdrawalDatetime");
        _withdrawalDatetime = withdrawalDatetime;
    }

    /**
     * [get] MEMBER_STATUS_CODE: {CHAR(3)} <br />
     * @return The value of the column 'MEMBER_STATUS_CODE'. (NullAllowed even if selected: for no constraint)
     */
    def getMemberStatusCode(): String = {
        return convertEmptyToNull(_memberStatusCode);
    }

    /**
     * [set] MEMBER_STATUS_CODE: {CHAR(3)} <br />
     * @param memberStatusCode The value of the column 'MEMBER_STATUS_CODE'. (NullAllowed: null update allowed for no constraint)
     */
    def setMemberStatusCode(memberStatusCode: String): Unit = {
        __modifiedProperties.addPropertyName("memberStatusCode");
        _memberStatusCode = memberStatusCode;
    }

    /**
     * [get] MEMBER_STATUS_NAME: {VARCHAR(50)} <br />
     * @return The value of the column 'MEMBER_STATUS_NAME'. (NullAllowed even if selected: for no constraint)
     */
    def getMemberStatusName(): String = {
        return convertEmptyToNull(_memberStatusName);
    }

    /**
     * [set] MEMBER_STATUS_NAME: {VARCHAR(50)} <br />
     * @param memberStatusName The value of the column 'MEMBER_STATUS_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    def setMemberStatusName(memberStatusName: String): Unit = {
        __modifiedProperties.addPropertyName("memberStatusName");
        _memberStatusName = memberStatusName;
    }

    /**
     * [get] MAX_PURCHASE_PRICE: {INTEGER(10)} <br />
     * @return The value of the column 'MAX_PURCHASE_PRICE'. (NullAllowed even if selected: for no constraint)
     */
    def getMaxPurchasePrice(): Integer = {
        return _maxPurchasePrice;
    }

    /**
     * [set] MAX_PURCHASE_PRICE: {INTEGER(10)} <br />
     * @param maxPurchasePrice The value of the column 'MAX_PURCHASE_PRICE'. (NullAllowed: null update allowed for no constraint)
     */
    def setMaxPurchasePrice(maxPurchasePrice: Integer): Unit = {
        __modifiedProperties.addPropertyName("maxPurchasePrice");
        _maxPurchasePrice = maxPurchasePrice;
    }
}
