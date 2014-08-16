package com.example.dbflute.scala.dbflute.bsbhv.pmbean;

import scala.collection.immutable;
import scala.collection.JavaConverters._;

import java.util._;

import org.seasar.dbflute.immutable.outsidesql._;
import org.seasar.dbflute.jdbc._;
import org.seasar.dbflute.jdbc.ParameterUtil.ShortCharHandlingMode;
import org.seasar.dbflute.util.DfCollectionUtil;
import org.seasar.dbflute.util.DfTypeUtil;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import com.example.dbflute.scala.dbflute.allcommon._;
import com.example.dbflute.scala.dbflute.exbhv.pmbean.PurchaseSummaryMemberPmb;
import com.example.dbflute.scala.dbflute.exbhv._;
import com.example.dbflute.scala.dbflute.exentity.customize._;

/**
 * The base class of companion object defined at extended class to create parameter-bean.
 * @author DBFlute(AutoGenerator)
 */
abstract class CponPurchaseSummaryMemberPmb {
    def apply(pmbCall: (PurchaseSummaryMemberPmb) => Unit): PurchaseSummaryMemberPmb =
    { val pmb = newPmb(); pmbCall(pmb); return pmb; }
    protected def newPmb(): PurchaseSummaryMemberPmb = { new PurchaseSummaryMemberPmb() }
}

/**
 * The base class for typed parameter-bean of PurchaseSummaryMember. <br />
 * This is related to "<span style="color: #AD4747">selectPurchaseSummaryMember</span>" on MemberBhv.
 * @author DBFlute(AutoGenerator)
 */
 class BsPurchaseSummaryMemberPmb extends ImmutableCursorHandlingPmb[MemberBhv, PurchaseSummaryMember, DblePurchaseSummaryMember] with FetchBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The parameter of memberStatusCode:cls(MemberStatus). */
    protected var _memberStatusCode: String = null;

    /** The parameter of formalizedDatetime. */
    protected var _formalizedDatetime: org.joda.time.LocalDateTime = null;

    /** The max size of safety result. */
    protected var _safetyMaxResultSize: Int = 0;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========

    // ===================================================================================
    //                                                                Typed Implementation
    //                                                                ====================
    /**
     * {@inheritDoc}
     */
    def getOutsideSqlPath(): String = { "selectPurchaseSummaryMember" }

    /**
     * Get the type of an entity for result. (implementation)
     * @return The type instance of an entity, cursor handling. (NotNull)
     */
    def getEntityType(): Class[DblePurchaseSummaryMember] = { classOf[DblePurchaseSummaryMember] }

    // ===================================================================================
    //                                                                       Safety Result
    //                                                                       =============
    /**
     * {@inheritDoc}
     */
    def checkSafetyResult(safetyMaxResultSize: Int): Unit = { _safetyMaxResultSize = safetyMaxResultSize }

    /**
     * {@inheritDoc}
     */
    def getSafetyMaxResultSize(): Int = { _safetyMaxResultSize }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    protected def filterStringParameter(value: String): String = {
        if (isEmptyStringParameterAllowed()) { return value; }
        return convertEmptyToNull(value);
    }

    protected def isEmptyStringParameterAllowed(): Boolean = {
	    return DBFluteConfig.isEmptyStringParameterAllowed();
    }

    protected def convertEmptyToNull(value: String): String = {
	    return ParameterUtil.convertEmptyToNull(value);
    }

    protected def handleShortChar(propertyName: String, value: String, size: Integer): String = {
        val mode: ShortCharHandlingMode = getShortCharHandlingMode(propertyName,  value,  size);
        return ParameterUtil.handleShortChar(propertyName, value, size, mode);
    }

    protected def getShortCharHandlingMode(propertyName: String, value: String, size: Integer): ShortCharHandlingMode = {
        return ShortCharHandlingMode.EXCEPTION;
    }

    protected def newArrayList[ELEMENT](elements: ELEMENT*): List[ELEMENT] = { // might be called by option handling
        return elements.asJava
    }

    protected def toNumber[NUMBER <: Number](obj: Object, tp: Class[NUMBER]): NUMBER = { // might be called by option handling
        return DfTypeUtil.toNumber(obj, tp).asInstanceOf[NUMBER];
    }

    protected def toBoolean(obj: Object): Boolean = {
        return DfTypeUtil.toBoolean(obj);
    }

    protected def toUtilDate(date: Object): Date = {
        if (date != null && date.isInstanceOf[ReadablePartial]) {
            return new Date(date.asInstanceOf[ReadablePartial].toDateTime(null).getMillis());
        } else if (date != null && date.isInstanceOf[ReadableInstant]) {
            return new Date(date.asInstanceOf[ReadableInstant].getMillis());
        }
        return DfTypeUtil.toDate(date); // if sub class, re-create as pure date
    }

    protected def toLocalDate[DATE](date: Date, localType: Class[DATE]): DATE = {
        if (classOf[LocalDate].isAssignableFrom(localType)) {
            return LocalDate.fromDateFields(date).asInstanceOf[DATE];
        } else if (classOf[LocalDateTime].isAssignableFrom(localType)) {
            return LocalDateTime.fromDateFields(date).asInstanceOf[DATE];
        }
        return null.asInstanceOf[DATE]; // unreachable
    }

    protected def formatUtilDate(date: Date): String = {
        val pattern: String = "yyyy-MM-dd";
        return DfTypeUtil.toString(date, pattern);
    }

    protected def formatByteArray(bytes: Array[Byte]): String = {
        return "byte[" + (if (bytes != null) { String.valueOf(bytes.length) } else { "null" }) + "]";
    }

    protected def toBindingType[PROP](obj: Any): PROP = { // except from-to Date
        return if (obj.isInstanceOf[immutable.List[_]]) {
            obj.asInstanceOf[immutable.List[_]].asJava.asInstanceOf[PROP]
        } else {
            obj.asInstanceOf[PROP]
        }
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    /**
     * @return The display string of all parameters. (NotNull)
     */
    override def toString(): String = {
        val sb: StringBuilder = new StringBuilder();
        sb.append(DfTypeUtil.toClassTitle(this)).append(":");
        sb.append(xbuildColumnString());
        return sb.toString();
    }
    protected def xbuildColumnString(): String = {
        val dm: String = ", ";
        val sb: StringBuilder = new StringBuilder();
        sb.append(dm).append(_memberStatusCode);
        sb.append(dm).append(_formalizedDatetime);
        if (sb.length() > 0) { sb.delete(0, dm.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] memberStatusCode:cls(MemberStatus) <br />
     * @return The value of memberStatusCode. (NotNull, NotEmptyString(when String): if empty string, returns null)
     */
    def getMemberStatusCode(): String = {
        return filterStringParameter(_memberStatusCode);
    }

    /**
     * [set as Formalized] memberStatusCode:cls(MemberStatus) <br />
     * as formal member, allowed to use all service
     */
    def setMemberStatusCode_Formalized(): Unit = {
        _memberStatusCode = CDef.MemberStatus.Formalized.code;
    }

    /**
     * [set as Withdrawal] memberStatusCode:cls(MemberStatus) <br />
     * withdrawal is fixed, not allowed to use service
     */
    def setMemberStatusCode_Withdrawal(): Unit = {
        _memberStatusCode = CDef.MemberStatus.Withdrawal.code;
    }

    /**
     * [set as Provisional] memberStatusCode:cls(MemberStatus) <br />
     * first status after entry, allowed to use only part of service
     */
    def setMemberStatusCode_Provisional(): Unit = {
        _memberStatusCode = CDef.MemberStatus.Provisional.code;
    }

    /**
     * [get] formalizedDatetime <br />
     * @return The value of formalizedDatetime. (NotNull, NotEmptyString(when String): if empty string, returns null)
     */
    def getFormalizedDatetime(): org.joda.time.LocalDateTime = {
        return _formalizedDatetime;
    }

    /**
     * [set] formalizedDatetime <br />
     * @param formalizedDatetime The value of formalizedDatetime. (NullAllowed)
     */
    def setFormalizedDatetime(formalizedDatetime: org.joda.time.LocalDateTime): Unit = {
        _formalizedDatetime = toBindingType(formalizedDatetime);
    }
}
