package com.example.dbflute.scala.dbflute.bsentity;

import scala.collection.immutable;
import scala.collection.JavaConverters._;

// #avoided same name type in Java and Scala
import java.lang.Long;
import java.lang.Boolean;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.DerivedMappable;
import org.seasar.dbflute.Entity.EntityUniqueDrivenProperties;
import org.seasar.dbflute.Entity.EntityModifiedProperties;
import org.seasar.dbflute.Entity.EntityDerivedMap;
import org.seasar.dbflute.Entity.FunCustodial;
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
abstract class BsDbleSummaryWithdrawal extends Entity with DBableEntity[SummaryWithdrawal] with Serializable with Cloneable with DerivedMappable {

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

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The unique-driven properties for this entity. (NotNull) */
    protected val __uniqueDrivenProperties: EntityUniqueDrivenProperties = newUniqueDrivenProperties();

    /** The modified properties for this entity. (NotNull) */
    protected val __modifiedProperties: EntityModifiedProperties = newModifiedProperties();

    /** The map of derived value, key is alias name. (NullAllowed: lazy-loaded) */
    protected var __derivedMap: EntityDerivedMap = null;

    /** Is the entity created by DBFlute select process? */
    protected var __createdBySelect: Boolean = false;

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
        immu.getModifiedProperties().foreach(__modifiedProperties.addPropertyName(_))
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
    def getTablePropertyName(): String = { // according to Java Beans rule
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

    /**
     * {@inheritDoc}
     */
    def myuniqueDrivenProperties(): Set[String] = {
        return __uniqueDrivenProperties.getPropertyNames();
    }

    protected def newUniqueDrivenProperties(): EntityUniqueDrivenProperties = {
        return new EntityUniqueDrivenProperties();
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected def newReferrerList[ELEMENT](): List[ELEMENT] = {
        return new ArrayList[ELEMENT]();
    }

    // ===================================================================================
    //                                                                 Modified Properties
    //                                                                 ===================
    /**
     * {@inheritDoc}
     */
    def modifiedProperties(): Set[String] = {
        return __modifiedProperties.getPropertyNames();
    }

    /**
     * {@inheritDoc}
     */
    def clearModifiedInfo(): Unit = {
        __modifiedProperties.clear();
    }

    /**
     * {@inheritDoc}
     */
    def hasModification(): scala.Boolean = {
        return !__modifiedProperties.isEmpty();
    }

    protected def newModifiedProperties(): EntityModifiedProperties = {
        return new EntityModifiedProperties();
    }

    // ===================================================================================
    //                                                                     Birthplace Mark
    //                                                                     ===============
    /**
     * {@inheritDoc}
     */
    def markAsSelect(): Unit = {
        __createdBySelect = true;
    }

    /**
     * {@inheritDoc}
     */
    def createdBySelect(): scala.Boolean = {
        return __createdBySelect;
    }

    // ===================================================================================
    //                                                                    Derived Mappable
    //                                                                    ================
    /**
     * {@inheritDoc}
     */
    def registerDerivedValue(aliasName: String, selectedValue: Object): Unit = {
        if (__derivedMap == null) { __derivedMap = newDerivedMap(); }
        __derivedMap.registerDerivedValue(aliasName, selectedValue);
    }

    /**
     * Find the derived value from derived map.
     * @param <VALUE> The type of the value.
     * @param aliasName The alias name of derived-referrer. (NotNull)
     * @return The derived value found in the map. (NullAllowed: when null selected)
     */
    def derived[VALUE](aliasName: String): VALUE = {
        if (__derivedMap == null) { __derivedMap = newDerivedMap(); }
        return __derivedMap.findDerivedValue(aliasName);
    }

    protected def newDerivedMap(): EntityDerivedMap = {
        return new EntityDerivedMap();
    }

    // ===================================================================================
    //                                                                        Scala Helper
    //                                                                        ============
    protected def toScalaList[ENTITY](javaList: Collection[ENTITY]): immutable.List[ENTITY] = {
        if (javaList == null) { return immutable.List(); }
        return immutable.List.fromArray(javaList.toArray).asInstanceOf[immutable.List[ENTITY]];
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
    override def equals(obj: Any) = {
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
    protected def xSV(v1: Object, v2: Object): scala.Boolean = {
        return FunCustodial.isSameValue(v1, v2);
    }

    /**
     * Calculate the hash-code from primary-keys or columns.
     * @return The hash-code from primary-key or columns.
     */
    override def hashCode(): Int = {
        var hs: Int = 17;
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
    protected def xCH(hs: Int, value: Object): Int = {
        return FunCustodial.calculateHashcode(hs, value);
    }

    /**
     * {@inheritDoc}
     */
    def instanceHash(): Int = {
        return super.hashCode();
    }

    /**
     * Convert to display string of entity's data. (no relation data)
     * @return The display string of all columns and relation existences. (NotNull)
     */
    override def toString(): String = {
        return buildDisplayString(FunCustodial.toClassTitle(this), true, true);
    }

    /**
     * {@inheritDoc}
     */
    def toStringWithRelation(): String = {
        val sb: StringBuilder = new StringBuilder();
        sb.append(toString());
        return sb.toString();
    }

    /**
     * {@inheritDoc}
     */
    def buildDisplayString(name: String, column: scala.Boolean, relation: scala.Boolean): String = {
        val sb: StringBuilder = new StringBuilder();
        if (name != null) { sb.append(name).append(if (column || relation) { ":" } else { "" }); }
        if (column) { sb.append(buildColumnString()); }
        if (relation) { sb.append(buildRelationString()); }
        sb.append("@").append(Integer.toHexString(hashCode()));
        return sb.toString();
    }
    protected def buildColumnString(): String = {
        val sb: StringBuilder = new StringBuilder();
        val dm: String = ", ";
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
    protected def buildRelationString(): String = {
        return "";
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    override def clone(): DbleSummaryWithdrawal = {
        try {
            return super.clone().asInstanceOf[DbleSummaryWithdrawal];
        } catch {
            case e: CloneNotSupportedException => {
                throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
            }
        }
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

    protected def convertEmptyToNull(value: String): String = {
        return FunCustodial.convertEmptyToNull(value);
    }
}
