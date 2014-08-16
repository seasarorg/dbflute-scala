package com.example.dbflute.scala.dbflute.bsbhv.pmbean;

import scala.collection.immutable;
import scala.collection.JavaConverters._;

import java.util._;

import org.seasar.dbflute.immutable.outsidesql._;
import org.seasar.dbflute.jdbc._;
import org.seasar.dbflute.jdbc.ParameterUtil.ShortCharHandlingMode;
import org.seasar.dbflute.cbean.coption.LikeSearchOption;
import org.seasar.dbflute.cbean.coption.FromToOption;
import org.seasar.dbflute.util.DfCollectionUtil;
import org.seasar.dbflute.exception._;
import org.seasar.dbflute.util.DfTypeUtil;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import com.example.dbflute.scala.dbflute.allcommon._;
import com.example.dbflute.scala.dbflute.exbhv.pmbean.OptionMemberPmb;
import com.example.dbflute.scala.dbflute.exbhv._;
import com.example.dbflute.scala.dbflute.exentity.customize._;

/**
 * The base class of companion object defined at extended class to create parameter-bean.
 * @author DBFlute(AutoGenerator)
 */
abstract class CponOptionMemberPmb {
    def apply(pmbCall: (OptionMemberPmb) => Unit): OptionMemberPmb =
    { val pmb = newPmb(); pmbCall(pmb); return pmb; }
    protected def newPmb(): OptionMemberPmb = { new OptionMemberPmb() }
}

/**
 * The base class for typed parameter-bean of OptionMember. <br />
 * This is related to "<span style="color: #AD4747">selectOptionMember</span>" on MemberBhv.
 * @author DBFlute(AutoGenerator)
 */
 class BsOptionMemberPmb extends ImmutableListHandlingPmb[MemberBhv, OptionMember, DbleOptionMember] with ImmutableEntityHandlingPmb[MemberBhv, OptionMember, DbleOptionMember] with FetchBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The parameter of memberId. */
    protected var _memberId: Integer = null;

    /** The parameter of memberName:likePrefix. */
    protected var _memberName: String = null;

    /** The option of like-search for memberName. */
    protected var _memberNameInternalLikeSearchOption: LikeSearchOption = null;

    /** The parameter of memberAccount:like. */
    protected var _memberAccount: String = null;

    /** The option of like-search for memberAccount. */
    protected var _memberAccountInternalLikeSearchOption: LikeSearchOption = null;

    /** The parameter of fromFormalizedDate:fromDate. */
    protected var _fromFormalizedDate: org.joda.time.LocalDate = null;

    /** The parameter of toFormalizedDate:toDate. */
    protected var _toFormalizedDate: org.joda.time.LocalDate = null;

    /** The parameter of fromFormalizedOptionDate:fromDate(option). */
    protected var _fromFormalizedOptionDate: org.joda.time.LocalDateTime = null;

    /** The parameter of toFormalizedOptionDate:toDate(option). */
    protected var _toFormalizedOptionDate: org.joda.time.LocalDateTime = null;

    /** The parameter of memberStatusCode:cls(MemberStatus). */
    protected var _memberStatusCode: String = null;

    /** The parameter of displayOrder:ref(MemberStatus) :: refers to (表示順)DISPLAY_ORDER: {UQ, NotNull, INTEGER(10)}. */
    protected var _displayOrder: Integer = null;

    /** The parameter of birthdate:fromDate|ref(Member) :: refers to (生年月日)BIRTHDATE: {DATE(8)}. */
    protected var _birthdate: org.joda.time.LocalDate = null;

    /** The parameter of status:cls(MemberStatus)|ref(Member.MEMBER_STATUS_CODE) :: refers to (会員ステータスコード)MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus}. */
    protected var _status: String = null;

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
    def getOutsideSqlPath(): String = { "selectOptionMember" }

    /**
     * Get the type of an entity for result. (implementation)
     * @return The type instance of an entity, customize entity. (NotNull)
     */
    def getEntityType(): Class[DbleOptionMember] = { classOf[DbleOptionMember] }

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

    protected def assertLikeSearchOptionValid(name: String, option: LikeSearchOption): Unit = {
        if (option == null) { // relic
            val msg: String = "The like-search option is required!";
            throw new RequiredOptionNotFoundException(msg);
        }
        if (option.isSplit()) {
            var msg: String = "The split of like-search is NOT available on parameter-bean.";
            msg = msg + " Don't use splitByXxx(): " + option;
            throw new IllegalOutsideSqlOperationException(msg);
        }
    }

    protected def callbackLSOP(optionCall: (ScrLikeSearchOption) => Unit): LikeSearchOption =
    { val op = createLikeSearchOption(); optionCall(op); return op; }
    protected def createLikeSearchOption(): ScrLikeSearchOption = { new ScrLikeSearchOption() }

    protected def assertFromToOptionValid(name: String, option: FromToOption): Unit = {
        if (option == null) { // relic
            val msg: String = "The from-to option is required!";
            throw new RequiredOptionNotFoundException(msg);
        }
    }

    protected def callbackFTOP(optionCall: (ScrFromToOption) => Unit): FromToOption =
    { val op = createFromToOption(); optionCall(op); return op; }
    protected def createFromToOption(): ScrFromToOption = { new ScrFromToOption() }

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
        sb.append(dm).append(_memberAccount);
        sb.append(dm).append(_fromFormalizedDate);
        sb.append(dm).append(_toFormalizedDate);
        sb.append(dm).append(_fromFormalizedOptionDate);
        sb.append(dm).append(_toFormalizedOptionDate);
        sb.append(dm).append(_memberStatusCode);
        sb.append(dm).append(_displayOrder);
        sb.append(dm).append(_birthdate);
        sb.append(dm).append(_status);
        if (sb.length() > 0) { sb.delete(0, dm.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] memberId <br />
     * @return The value of memberId. (NotNull, NotEmptyString(when String): if empty string, returns null)
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
     * [get] memberName:likePrefix <br />
     * @return The value of memberName. (NotNull, NotEmptyString(when String): if empty string, returns null)
     */
    def getMemberName(): String = {
        return filterStringParameter(_memberName);
    }

    /**
     * [set as prefixSearch] memberName:likePrefix <br />
     * @param memberName The value of memberName. (NullAllowed)
     */
    def setMemberName_PrefixSearch(memberName: String): Unit = {
        _memberName = toBindingType(memberName);
        _memberNameInternalLikeSearchOption = createLikeSearchOption().likePrefix();
    }

    /**
     * Get the internal option of likeSearch for memberName. {Internal Method: Don't invoke this}
     * @return The internal option of likeSearch for memberName. (NullAllowed)
     */
    def getMemberNameInternalLikeSearchOption(): LikeSearchOption = {
        return _memberNameInternalLikeSearchOption;
    }

    /**
     * [get] memberAccount:like <br />
     * @return The value of memberAccount. (NotNull, NotEmptyString(when String): if empty string, returns null)
     */
    def getMemberAccount(): String = {
        return filterStringParameter(_memberAccount);
    }

    /**
     * [set as likeSearch] memberAccount:like <br />
     * @param memberAccount The value of memberAccount. (NullAllowed)
     * @param optionCall The callback for option of likeSearch for memberAccount which is NOT split mode. (NotNull)
     */
    def setMemberAccount(memberAccount: String)(optionCall: (ScrLikeSearchOption) => Unit): Unit = {
        val option = callbackLSOP(optionCall);
        assertLikeSearchOptionValid("option for memberAccount", option);
        _memberAccount = toBindingType(memberAccount);
        _memberAccountInternalLikeSearchOption = option;
    }

    /**
     * Get the internal option of likeSearch for memberAccount. {Internal Method: Don't invoke this}
     * @return The internal option of likeSearch for memberAccount. (NullAllowed)
     */
    def getMemberAccountInternalLikeSearchOption(): LikeSearchOption = {
        return _memberAccountInternalLikeSearchOption;
    }

    /**
     * [get] fromFormalizedDate:fromDate <br />
     * @return The value of fromFormalizedDate. (NotNull, NotEmptyString(when String): if empty string, returns null)
     */
    def getFromFormalizedDate(): org.joda.time.LocalDate = {
        return _fromFormalizedDate;
    }

    /**
     * [set as fromDate] fromFormalizedDate:fromDate <br />
     * @param fromFormalizedDate The value of fromFormalizedDate. (NullAllowed)
     */
    def setFromFormalizedDate_FromDate(fromFormalizedDate: org.joda.time.LocalDate): Unit = {
        _fromFormalizedDate = toLocalDate(createFromToOption().compareAsDate().filterFromDate(toUtilDate(fromFormalizedDate)), classOf[org.joda.time.LocalDate]);
    }

    /**
     * [get] toFormalizedDate:toDate <br />
     * @return The value of toFormalizedDate. (NotNull, NotEmptyString(when String): if empty string, returns null)
     */
    def getToFormalizedDate(): org.joda.time.LocalDate = {
        return _toFormalizedDate;
    }

    /**
     * [set as toDate] toFormalizedDate:toDate <br />
     * @param toFormalizedDate The value of toFormalizedDate. (NullAllowed)
     */
    def setToFormalizedDate_ToDate(toFormalizedDate: org.joda.time.LocalDate): Unit = {
        _toFormalizedDate = toLocalDate(createFromToOption().compareAsDate().filterToDate(toUtilDate(toFormalizedDate)), classOf[org.joda.time.LocalDate]);
    }

    /**
     * [get] fromFormalizedOptionDate:fromDate(option) <br />
     * @return The value of fromFormalizedOptionDate. (NotNull, NotEmptyString(when String): if empty string, returns null)
     */
    def getFromFormalizedOptionDate(): org.joda.time.LocalDateTime = {
        return _fromFormalizedOptionDate;
    }

    /**
     * [set as fromScope] fromFormalizedOptionDate:fromDate(option) <br />
     * @param fromFormalizedOptionDate The value of fromFormalizedOptionDate. (NullAllowed)
     * @param optionCall The callback for option of from-to scope for fromFormalizedOptionDate. (NotNull)
     */
    def setFromFormalizedOptionDate_FromDate(fromFormalizedOptionDate: org.joda.time.LocalDateTime)(optionCall: (ScrFromToOption) => Unit): Unit = {
        val option = callbackFTOP(optionCall);
        assertFromToOptionValid("option for fromFormalizedOptionDate", option);
        _fromFormalizedOptionDate = toLocalDate(option.filterFromDate(toUtilDate(fromFormalizedOptionDate)), classOf[org.joda.time.LocalDateTime]);
    }

    /**
     * [get] toFormalizedOptionDate:toDate(option) <br />
     * @return The value of toFormalizedOptionDate. (NotNull, NotEmptyString(when String): if empty string, returns null)
     */
    def getToFormalizedOptionDate(): org.joda.time.LocalDateTime = {
        return _toFormalizedOptionDate;
    }

    /**
     * [set as toScope] toFormalizedOptionDate:toDate(option) <br />
     * @param toFormalizedOptionDate The value of toFormalizedOptionDate. (NullAllowed)
     * @param optionCall The callback for option of from-to scope for toFormalizedOptionDate. (NotNull)
     */
    def setToFormalizedOptionDate_ToDate(toFormalizedOptionDate: org.joda.time.LocalDateTime)(optionCall: (ScrFromToOption) => Unit): Unit = {
        val option = callbackFTOP(optionCall);
        assertFromToOptionValid("option for toFormalizedOptionDate", option);
        _toFormalizedOptionDate = toLocalDate(option.filterToDate(toUtilDate(toFormalizedOptionDate)), classOf[org.joda.time.LocalDateTime]);
    }

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
     * [get] displayOrder:ref(MemberStatus) :: refers to (表示順)DISPLAY_ORDER: {UQ, NotNull, INTEGER(10)} <br />
     * @return The value of displayOrder. (NotNull, NotEmptyString(when String): if empty string, returns null)
     */
    def getDisplayOrder(): Integer = {
        return _displayOrder;
    }

    /**
     * [set] displayOrder:ref(MemberStatus) :: refers to (表示順)DISPLAY_ORDER: {UQ, NotNull, INTEGER(10)} <br />
     * @param displayOrder The value of displayOrder. (NullAllowed)
     */
    def setDisplayOrder(displayOrder: Integer): Unit = {
        _displayOrder = toBindingType(displayOrder);
    }

    /**
     * [get] birthdate:fromDate|ref(Member) :: refers to (生年月日)BIRTHDATE: {DATE(8)} <br />
     * @return The value of birthdate. (NotNull, NotEmptyString(when String): if empty string, returns null)
     */
    def getBirthdate(): org.joda.time.LocalDate = {
        return _birthdate;
    }

    /**
     * [set as fromDate] birthdate:fromDate|ref(Member) :: refers to (生年月日)BIRTHDATE: {DATE(8)} <br />
     * @param birthdate The value of birthdate. (NullAllowed)
     */
    def setBirthdate_FromDate(birthdate: org.joda.time.LocalDate): Unit = {
        _birthdate = toLocalDate(createFromToOption().compareAsDate().filterFromDate(toUtilDate(birthdate)), classOf[org.joda.time.LocalDate]);
    }

    /**
     * [get] status:cls(MemberStatus)|ref(Member.MEMBER_STATUS_CODE) :: refers to (会員ステータスコード)MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus} <br />
     * @return The value of status. (NotNull, NotEmptyString(when String): if empty string, returns null)
     */
    def getStatus(): String = {
        var filtered: String = filterStringParameter(_status);
        filtered = handleShortChar("status", filtered, 3);
        return filtered;
    }

    /**
     * [set as Formalized] status:cls(MemberStatus)|ref(Member.MEMBER_STATUS_CODE) :: refers to (会員ステータスコード)MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus} <br />
     * as formal member, allowed to use all service
     */
    def setStatus_Formalized(): Unit = {
        _status = CDef.MemberStatus.Formalized.code;
    }

    /**
     * [set as Withdrawal] status:cls(MemberStatus)|ref(Member.MEMBER_STATUS_CODE) :: refers to (会員ステータスコード)MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus} <br />
     * withdrawal is fixed, not allowed to use service
     */
    def setStatus_Withdrawal(): Unit = {
        _status = CDef.MemberStatus.Withdrawal.code;
    }

    /**
     * [set as Provisional] status:cls(MemberStatus)|ref(Member.MEMBER_STATUS_CODE) :: refers to (会員ステータスコード)MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus} <br />
     * first status after entry, allowed to use only part of service
     */
    def setStatus_Provisional(): Unit = {
        _status = CDef.MemberStatus.Provisional.code;
    }
}
