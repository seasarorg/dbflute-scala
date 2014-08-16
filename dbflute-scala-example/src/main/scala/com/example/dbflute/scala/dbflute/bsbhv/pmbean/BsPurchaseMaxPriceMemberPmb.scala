package com.example.dbflute.scala.dbflute.bsbhv.pmbean;

import scala.collection.immutable;
import scala.collection.JavaConverters._;

import java.util._;

import org.seasar.dbflute.cbean.SimplePagingBean;
import org.seasar.dbflute.immutable.outsidesql._;
import org.seasar.dbflute.jdbc._;
import org.seasar.dbflute.jdbc.ParameterUtil.ShortCharHandlingMode;
import org.seasar.dbflute.cbean.coption.LikeSearchOption;
import org.seasar.dbflute.util.DfCollectionUtil;
import org.seasar.dbflute.exception._;
import org.seasar.dbflute.util.DfTypeUtil;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import com.example.dbflute.scala.dbflute.allcommon._;
import com.example.dbflute.scala.dbflute.exbhv.pmbean.PurchaseMaxPriceMemberPmb;
import com.example.dbflute.scala.dbflute.exbhv._;
import com.example.dbflute.scala.dbflute.exentity.customize._;

/**
 * The base class of companion object defined at extended class to create parameter-bean.
 * @author DBFlute(AutoGenerator)
 */
abstract class CponPurchaseMaxPriceMemberPmb {
    def apply(pmbCall: (PurchaseMaxPriceMemberPmb) => Unit): PurchaseMaxPriceMemberPmb =
    { val pmb = newPmb(); pmbCall(pmb); return pmb; }
    protected def newPmb(): PurchaseMaxPriceMemberPmb = { new PurchaseMaxPriceMemberPmb() }
}

/**
 * The base class for typed parameter-bean of PurchaseMaxPriceMember. <br />
 * This is related to "<span style="color: #AD4747">selectPurchaseMaxPriceMember</span>" on MemberBhv.
 * @author DBFlute(AutoGenerator)
 */
 class BsPurchaseMaxPriceMemberPmb extends SimplePagingBean with ImmutableEntityHandlingPmb[MemberBhv, PurchaseMaxPriceMember, DblePurchaseMaxPriceMember] with ImmutableManualPagingHandlingPmb[MemberBhv, PurchaseMaxPriceMember, DblePurchaseMaxPriceMember] with FetchBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The parameter of memberId. */
    protected var _memberId: Integer = null;

    /** The parameter of memberNameList:likePrefix. */
    protected var _memberNameList: List[String] = null;

    /** The option of like-search for memberNameList. */
    protected var _memberNameListInternalLikeSearchOption: LikeSearchOption = null;

    /** The parameter of memberStatusCodeList:cls(MemberStatus). */
    protected var _memberStatusCodeList: List[com.example.dbflute.scala.dbflute.allcommon.CDef.MemberStatus] = null;

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
    def getOutsideSqlPath(): String = { "selectPurchaseMaxPriceMember" }

    /**
     * Get the type of an entity for result. (implementation)
     * @return The type instance of an entity, customize entity. (NotNull)
     */
    def getEntityType(): Class[DblePurchaseMaxPriceMember] = { classOf[DblePurchaseMaxPriceMember] }

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
        sb.append(dm).append(_memberNameList);
        sb.append(dm).append(_memberStatusCodeList);
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
     * [get] memberNameList:likePrefix <br />
     * @return The value of memberNameList. (NotNull, NotEmptyString(when String): if empty string, returns null)
     */
    def getMemberNameList(): List[String] = {
        return _memberNameList;
    }

    /**
     * [set as prefixSearch] memberNameList:likePrefix <br />
     * @param memberNameList The value of memberNameList. (NullAllowed)
     */
    def setMemberNameList_PrefixSearch(memberNameList: List[String]): Unit = {
        _memberNameList = toBindingType(memberNameList);
        _memberNameListInternalLikeSearchOption = createLikeSearchOption().likePrefix();
    }

    /**
     * Get the internal option of likeSearch for memberNameList. {Internal Method: Don't invoke this}
     * @return The internal option of likeSearch for memberNameList. (NullAllowed)
     */
    def getMemberNameListInternalLikeSearchOption(): LikeSearchOption = {
        return _memberNameListInternalLikeSearchOption;
    }

    /**
     * [get] memberStatusCodeList:cls(MemberStatus) <br />
     * @return The value of memberStatusCodeList. (NotNull, NotEmptyString(when String): if empty string, returns null)
     */
    def getMemberStatusCodeList(): List[com.example.dbflute.scala.dbflute.allcommon.CDef.MemberStatus] = {
        return _memberStatusCodeList;
    }

    /**
     * [set] memberStatusCodeList:cls(MemberStatus) <br />
     * @param memberStatusCodeList The value of memberStatusCodeList. (NullAllowed)
     */
    def setMemberStatusCodeList(memberStatusCodeList: List[com.example.dbflute.scala.dbflute.allcommon.CDef.MemberStatus]): Unit = {
        _memberStatusCodeList = toBindingType(memberStatusCodeList);
    }
}
