package com.example.dbflute.scala.dbflute.bsbhv.pmbean;

import scala.collection.immutable;
import scala.collection.JavaConverters._;

import java.util._;

import org.seasar.dbflute.cbean.SimplePagingBean;
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
import com.example.dbflute.scala.dbflute.exbhv.pmbean.UnpaidSummaryMemberPmb;
import com.example.dbflute.scala.dbflute.exbhv._;
import com.example.dbflute.scala.dbflute.exentity.customize._;

/**
 * The base class of companion object defined at extended class to create parameter-bean.
 * @author DBFlute(AutoGenerator)
 */
abstract class CponUnpaidSummaryMemberPmb {
    def apply(pmbCall: (UnpaidSummaryMemberPmb) => Unit): UnpaidSummaryMemberPmb =
    { val pmb = newPmb(); pmbCall(pmb); return pmb; }
    protected def newPmb(): UnpaidSummaryMemberPmb = { new UnpaidSummaryMemberPmb() }
}

/**
 * The base class for typed parameter-bean of UnpaidSummaryMember. <br />
 * This is related to "<span style="color: #AD4747">selectUnpaidSummaryMember</span>" on MemberBhv.
 * @author DBFlute(AutoGenerator)
 */
 class BsUnpaidSummaryMemberPmb extends SimplePagingBean with ImmutableEntityHandlingPmb[MemberBhv, UnpaidSummaryMember, DbleUnpaidSummaryMember] with ImmutableAutoPagingHandlingPmb[MemberBhv, UnpaidSummaryMember, DbleUnpaidSummaryMember] with FetchBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The parameter of memberId. */
    protected var _memberId: Integer = null;

    /** The parameter of memberName. */
    protected var _memberName: String = null;

    /** The parameter of memberStatusCode:cls(MemberStatus). */
    protected var _memberStatusCode: String = null;

    /** The parameter of unpaidMemberOnly. */
    protected var _unpaidMemberOnly: Boolean = false;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    {
        if (DBFluteConfig.isPagingCountLater()) {
            enablePagingCountLater();
        }
    }

    // ===================================================================================
    //                                                                Typed Implementation
    //                                                                ====================
    /**
     * {@inheritDoc}
     */
    def getOutsideSqlPath(): String = { "selectUnpaidSummaryMember" }

    /**
     * Get the type of an entity for result. (implementation)
     * @return The type instance of an entity, customize entity. (NotNull)
     */
    def getEntityType(): Class[DbleUnpaidSummaryMember] = { classOf[DbleUnpaidSummaryMember] }

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
        sb.append(dm).append(_memberId);
        sb.append(dm).append(_memberName);
        sb.append(dm).append(_memberStatusCode);
        sb.append(dm).append(_unpaidMemberOnly);
        if (sb.length() > 0) { sb.delete(0, dm.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] memberId <br />
     * @return The value of memberId. (Nullable, NotEmptyString(when String): if empty string, returns null)
     */
    def getMemberId(): Integer = {
        return _memberId;
    }

    /**
     * [set] memberId <br />
     * @param memberId The value of memberId. (NullAllowed)
     */
    def setMemberId(memberId: Integer): Unit = {
        _memberId = toBindingType(memberId);
    }

    /**
     * [get] memberName <br />
     * @return The value of memberName. (Nullable, NotEmptyString(when String): if empty string, returns null)
     */
    def getMemberName(): String = {
        return filterStringParameter(_memberName);
    }

    /**
     * [set] memberName <br />
     * @param memberName The value of memberName. (NullAllowed)
     */
    def setMemberName(memberName: String): Unit = {
        _memberName = toBindingType(memberName);
    }

    /**
     * [get] memberStatusCode:cls(MemberStatus) <br />
     * @return The value of memberStatusCode. (Nullable, NotEmptyString(when String): if empty string, returns null)
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
     * [get] unpaidMemberOnly <br />
     * @return The value of unpaidMemberOnly. (Nullable, NotEmptyString(when String): if empty string, returns null)
     */
    def getUnpaidMemberOnly(): Boolean = {
        return _unpaidMemberOnly;
    }

    /**
     * [set] unpaidMemberOnly <br />
     * @param unpaidMemberOnly The value of unpaidMemberOnly. (NullAllowed)
     */
    def setUnpaidMemberOnly(unpaidMemberOnly: Boolean): Unit = {
        _unpaidMemberOnly = toBindingType(unpaidMemberOnly);
    }
}
