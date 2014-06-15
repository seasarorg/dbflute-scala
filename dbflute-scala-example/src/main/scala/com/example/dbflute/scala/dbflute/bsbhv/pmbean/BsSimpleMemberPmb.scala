package com.example.dbflute.scala.dbflute.bsbhv.pmbean;

import java.util._;

import org.seasar.dbflute.outsidesql.typed._;
import org.seasar.dbflute.jdbc._;
import org.seasar.dbflute.jdbc.ParameterUtil.ShortCharHandlingMode;
import org.seasar.dbflute.cbean.coption.LikeSearchOption;
import org.seasar.dbflute.util.DfCollectionUtil;
import org.seasar.dbflute.exception._;
import org.seasar.dbflute.util.DfTypeUtil;
import com.example.dbflute.scala.dbflute.allcommon._;
import com.example.dbflute.scala.dbflute.exbhv._;
import com.example.dbflute.scala.dbflute.exentity.customize._;

/**
 * The base class for typed parameter-bean of SimpleMember. <br />
 * This is related to "<span style="color: #AD4747">selectSimpleMember</span>" on MemberBhv.
 * @author DBFlute(AutoGenerator)
 */
 class BsSimpleMemberPmb extends ListHandlingPmb[MemberBhv, DbleSimpleMember] with EntityHandlingPmb[MemberBhv, DbleSimpleMember] with FetchBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The parameter of memberId. */
    protected var _memberId: Integer = null;

    /** The parameter of memberName:likePrefix. */
    protected var _memberName: String = null;

    /** The option of like-search for memberName. */
    protected var _memberNameInternalLikeSearchOption: LikeSearchOption = null;

    /** The parameter of birthdate. */
    protected var _birthdate: Date = null;

    /** The max size of safety result. */
    protected var _safetyMaxResultSize: Int = 0;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor for the typed parameter-bean of SimpleMember. <br />
     * This is related to "<span style="color: #AD4747">selectSimpleMember</span>" on MemberBhv.
     */
    {
    }

    // ===================================================================================
    //                                                                Typed Implementation
    //                                                                ====================
    /**
     * {@inheritDoc}
     */
    def getOutsideSqlPath(): String = {
        return "selectSimpleMember";
    }

    /**
     * Get the type of an entity for result. (implementation)
     * @return The type instance of an entity, customize entity. (NotNull)
     */
    def getEntityType(): Class[DbleSimpleMember] = {
        return classOf[DbleSimpleMember];
    }

    // ===================================================================================
    //                                                                       Safety Result
    //                                                                       =============
    /**
     * {@inheritDoc}
     */
    def checkSafetyResult(safetyMaxResultSize: Int): Unit = {
        _safetyMaxResultSize = safetyMaxResultSize;
    }

    /**
     * {@inheritDoc}
     */
    def getSafetyMaxResultSize(): Int = {
        return _safetyMaxResultSize;
    }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    protected def filterStringParameter(value: String): String = {
        if (isEmptyStringParameterAllowed()) {
            return value;
        }
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

    protected def toBoolean(obj: Object): Boolean = {
        return DfTypeUtil.toBoolean(obj);
    }

    protected def toUtilDate(date: Date): Date = {
        return DfTypeUtil.toDate(date); // if sub class, re-create as pure date
    }

    protected def formatUtilDate(date: Date): String = {
        val pattern: String = "yyyy-MM-dd";
        return DfTypeUtil.toString(date, pattern);
    }

    protected def formatByteArray(bytes: Array[Byte]): String = {
        return "byte[" + (if (bytes != null) { String.valueOf(bytes.length) } else { "null" }) + "]";
    }

    protected def assertLikeSearchOptionValid(name: String, option: LikeSearchOption): Unit = {
        if (option == null) {
            val msg: String = "The like-search option is required!";
            throw new RequiredOptionNotFoundException(msg);
        }
        if (option.isSplit()) {
            var msg: String = "The split of like-search is NOT available on parameter-bean.";
            msg = msg + " Don't use splitByXxx(): " + option;
            throw new IllegalOutsideSqlOperationException(msg);
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
    private def xbuildColumnString(): String = {
        val dm: String = ", ";
        val sb: StringBuilder = new StringBuilder();
        sb.append(dm).append(_memberId);
        sb.append(dm).append(_memberName);
        sb.append(dm).append(formatUtilDate(_birthdate));
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
        _memberId = memberId;
    }

    /**
     * [get] memberName:likePrefix <br />
     * @return The value of memberName. (Nullable, NotEmptyString(when String): if empty string, returns null)
     */
    def getMemberName(): String = {
        return filterStringParameter(_memberName);
    }

    /**
     * [set as prefixSearch] memberName:likePrefix <br />
     * @param memberName The value of memberName. (NullAllowed)
     */
    def setMemberName_PrefixSearch(memberName: String): Unit = {
        _memberName = memberName;
        _memberNameInternalLikeSearchOption = new LikeSearchOption().likePrefix();
    }

    /**
     * Get the internal option of likeSearch for memberName. {Internal Method: Don't invoke this}
     * @return The internal option of likeSearch for memberName. (NullAllowed)
     */
    def getMemberNameInternalLikeSearchOption(): LikeSearchOption = {
        return _memberNameInternalLikeSearchOption;
    }

    /**
     * [get] birthdate <br />
     * @return The value of birthdate. (Nullable, NotEmptyString(when String): if empty string, returns null)
     */
    def getBirthdate(): Date = {
        return toUtilDate(_birthdate);
    }

    /**
     * [set] birthdate <br />
     * @param birthdate The value of birthdate. (NullAllowed)
     */
    def setBirthdate(birthdate: Date): Unit = {
        _birthdate = birthdate;
    }

}
