package com.example.dbflute.scala.dbflute.cbean.cq.bs;

import scala.collection.immutable;
import scala.collection.JavaConverters._;

import java.util.Collection;
import java.util.Date;

import org.seasar.dbflute.cbean._;
import org.seasar.dbflute.cbean.AbstractConditionQuery._;
import org.seasar.dbflute.cbean.chelper._;
import org.seasar.dbflute.cbean.ckey._;
import org.seasar.dbflute.cbean.coption._;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.dbmeta.DBMetaProvider;
import org.seasar.dbflute.util.DfTypeUtil;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import com.example.dbflute.scala.dbflute.allcommon._;
import com.example.dbflute.scala.dbflute.cbean._;
import com.example.dbflute.scala.dbflute.cbean.cq._;

/**
 * The abstract condition-query of VENDOR_CHECK.
 * @author DBFlute(AutoGenerator)
 */
abstract class AbstractBsVendorCheckCQ(referrerQuery: ConditionQuery, sqlClause: SqlClause, aliasName: String, nestLevel: Integer)
        extends AbstractConditionQuery(referrerQuery, sqlClause, aliasName, nestLevel) {

    // ===================================================================================
    //                                                                     DBMeta Provider
    //                                                                     ===============
    @Override
    protected def xgetDBMetaProvider(): DBMetaProvider = {
        return DBMetaInstanceHandler.getProvider();
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    def getTableDbName(): String = {
        return "VENDOR_CHECK";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * VENDOR_CHECK_ID: {PK, NotNull, DECIMAL(16)}
     * @param vendorCheckId The value of vendorCheckId as equal. (NullAllowed: if null, no condition)
     */
    def setVendorCheckId_Equal(vendorCheckId: Long): Unit = {
        doSetVendorCheckId_Equal(vendorCheckId);
    }

    protected def doSetVendorCheckId_Equal(vendorCheckId: Long): Unit = {
        regVendorCheckId(CK_EQ, vendorCheckId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * VENDOR_CHECK_ID: {PK, NotNull, DECIMAL(16)}
     * @param vendorCheckId The value of vendorCheckId as notEqual. (NullAllowed: if null, no condition)
     */
    def setVendorCheckId_NotEqual(vendorCheckId: Long): Unit = {
        doSetVendorCheckId_NotEqual(vendorCheckId);
    }

    protected def doSetVendorCheckId_NotEqual(vendorCheckId: Long): Unit = {
        regVendorCheckId(CK_NES, vendorCheckId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * VENDOR_CHECK_ID: {PK, NotNull, DECIMAL(16)}
     * @param vendorCheckId The value of vendorCheckId as greaterThan. (NullAllowed: if null, no condition)
     */
    def setVendorCheckId_GreaterThan(vendorCheckId: Long): Unit = {
        regVendorCheckId(CK_GT, vendorCheckId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * VENDOR_CHECK_ID: {PK, NotNull, DECIMAL(16)}
     * @param vendorCheckId The value of vendorCheckId as lessThan. (NullAllowed: if null, no condition)
     */
    def setVendorCheckId_LessThan(vendorCheckId: Long): Unit = {
        regVendorCheckId(CK_LT, vendorCheckId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * VENDOR_CHECK_ID: {PK, NotNull, DECIMAL(16)}
     * @param vendorCheckId The value of vendorCheckId as greaterEqual. (NullAllowed: if null, no condition)
     */
    def setVendorCheckId_GreaterEqual(vendorCheckId: Long): Unit = {
        regVendorCheckId(CK_GE, vendorCheckId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * VENDOR_CHECK_ID: {PK, NotNull, DECIMAL(16)}
     * @param vendorCheckId The value of vendorCheckId as lessEqual. (NullAllowed: if null, no condition)
     */
    def setVendorCheckId_LessEqual(vendorCheckId: Long): Unit = {
        regVendorCheckId(CK_LE, vendorCheckId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * VENDOR_CHECK_ID: {PK, NotNull, DECIMAL(16)}
     * @param minNumber The min number of vendorCheckId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of vendorCheckId. (NullAllowed: if null, no to-condition)
     * @param optionCall The callback for option of range-of. (NotNull)
     */
    def setVendorCheckId_RangeOf(minNumber: Long, maxNumber: Long)(optionCall: (RangeOfOption) => Unit): Unit = {
        regROO(minNumber, maxNumber, getCValueVendorCheckId(), "VENDOR_CHECK_ID", callbackROOP(optionCall));
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * VENDOR_CHECK_ID: {PK, NotNull, DECIMAL(16)}
     * @param vendorCheckIdList The collection of vendorCheckId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    def setVendorCheckId_InScope(vendorCheckIdList: List[Long]): Unit = {
        doSetVendorCheckId_InScope(toMutableValueCollectionImplicitly(vendorCheckIdList));
    }

    protected def doSetVendorCheckId_InScope(vendorCheckIdList: Collection[Long]): Unit = {
        regINS(CK_INS, cTL(vendorCheckIdList), getCValueVendorCheckId(), "VENDOR_CHECK_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * VENDOR_CHECK_ID: {PK, NotNull, DECIMAL(16)}
     * @param vendorCheckIdList The collection of vendorCheckId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    def setVendorCheckId_NotInScope(vendorCheckIdList: List[Long]): Unit = {
        doSetVendorCheckId_NotInScope(if (vendorCheckIdList != null) { vendorCheckIdList.map(_.asInstanceOf[Long]).asJava } else { null });
    }

    protected def doSetVendorCheckId_NotInScope(vendorCheckIdList: Collection[Long]): Unit = {
        regINS(CK_NINS, cTL(vendorCheckIdList), getCValueVendorCheckId(), "VENDOR_CHECK_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * VENDOR_CHECK_ID: {PK, NotNull, DECIMAL(16)}
     */
    def setVendorCheckId_IsNull(): Unit = { regVendorCheckId(CK_ISN, AbstractConditionQuery.DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * VENDOR_CHECK_ID: {PK, NotNull, DECIMAL(16)}
     */
    def setVendorCheckId_IsNotNull(): Unit = { regVendorCheckId(CK_ISNN, AbstractConditionQuery.DOBJ); }

    protected def regVendorCheckId(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValueVendorCheckId(), "VENDOR_CHECK_ID"); }
    protected def getCValueVendorCheckId(): ConditionValue;

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_CHAR: {CHAR(3)}
     * @param typeOfChar The value of typeOfChar as equal. (NullAllowed: if null (or empty), no condition)
     */
    def setTypeOfChar_Equal(typeOfChar: String): Unit = {
        doSetTypeOfChar_Equal(fRES(typeOfChar));
    }

    protected def doSetTypeOfChar_Equal(typeOfChar: String): Unit = {
        regTypeOfChar(CK_EQ, hSC("TYPE_OF_CHAR", typeOfChar, 3, "E"));
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_CHAR: {CHAR(3)}
     * @param typeOfChar The value of typeOfChar as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    def setTypeOfChar_NotEqual(typeOfChar: String): Unit = {
        doSetTypeOfChar_NotEqual(fRES(typeOfChar));
    }

    protected def doSetTypeOfChar_NotEqual(typeOfChar: String): Unit = {
        regTypeOfChar(CK_NES, hSC("TYPE_OF_CHAR", typeOfChar, 3, "E"));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_CHAR: {CHAR(3)}
     * @param typeOfCharList The collection of typeOfChar as inScope. (NullAllowed: if null (or empty), no condition)
     */
    def setTypeOfChar_InScope(typeOfCharList: List[String]): Unit = {
        doSetTypeOfChar_InScope(toMutableValueCollectionImplicitly(typeOfCharList));
    }

    protected def doSetTypeOfChar_InScope(typeOfCharList: Collection[String]): Unit = {
        regINS(CK_INS, cTL(typeOfCharList), getCValueTypeOfChar(), "TYPE_OF_CHAR");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_CHAR: {CHAR(3)}
     * @param typeOfCharList The collection of typeOfChar as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    def setTypeOfChar_NotInScope(typeOfCharList: List[String]): Unit = {
        doSetTypeOfChar_NotInScope(if (typeOfCharList != null) { typeOfCharList.map(_.asInstanceOf[String]).asJava } else { null });
    }

    protected def doSetTypeOfChar_NotInScope(typeOfCharList: Collection[String]): Unit = {
        regINS(CK_NINS, cTL(typeOfCharList), getCValueTypeOfChar(), "TYPE_OF_CHAR");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TYPE_OF_CHAR: {CHAR(3)}
     * @param typeOfChar The value of typeOfChar as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    def setTypeOfChar_PrefixSearch(typeOfChar: String): Unit = {
        setTypeOfChar_LikeSearch(typeOfChar)(_.likePrefix);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TYPE_OF_CHAR: {CHAR(3)} <br />
     * <pre>e.g. setTypeOfChar_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param typeOfChar The value of typeOfChar as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param optionCall The callback for option of like-search. (NotNull)
     */
    def setTypeOfChar_LikeSearch(typeOfChar: String)(optionCall: (ScrLikeSearchOption) => Unit): Unit = {
        regLSQ(CK_LS, fRES(typeOfChar), getCValueTypeOfChar(), "TYPE_OF_CHAR", callbackLSOP(optionCall));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TYPE_OF_CHAR: {CHAR(3)}
     * @param typeOfChar The value of typeOfChar as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param optionCall The callback for option of not-like-search. (NotNull)
     */
    def setTypeOfChar_NotLikeSearch(typeOfChar: String)(optionCall: (ScrLikeSearchOption) => Unit): Unit = {
        regLSQ(CK_NLS, fRES(typeOfChar), getCValueTypeOfChar(), "TYPE_OF_CHAR", callbackLSOP(optionCall));
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_CHAR: {CHAR(3)}
     */
    def setTypeOfChar_IsNull(): Unit = { regTypeOfChar(CK_ISN, AbstractConditionQuery.DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * TYPE_OF_CHAR: {CHAR(3)}
     */
    def setTypeOfChar_IsNullOrEmpty(): Unit = { regTypeOfChar(CK_ISNOE, AbstractConditionQuery.DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_CHAR: {CHAR(3)}
     */
    def setTypeOfChar_IsNotNull(): Unit = { regTypeOfChar(CK_ISNN, AbstractConditionQuery.DOBJ); }

    protected def regTypeOfChar(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValueTypeOfChar(), "TYPE_OF_CHAR"); }
    protected def getCValueTypeOfChar(): ConditionValue;

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_VARCHAR: {VARCHAR(32)}
     * @param typeOfVarchar The value of typeOfVarchar as equal. (NullAllowed: if null (or empty), no condition)
     */
    def setTypeOfVarchar_Equal(typeOfVarchar: String): Unit = {
        doSetTypeOfVarchar_Equal(fRES(typeOfVarchar));
    }

    protected def doSetTypeOfVarchar_Equal(typeOfVarchar: String): Unit = {
        regTypeOfVarchar(CK_EQ, typeOfVarchar);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_VARCHAR: {VARCHAR(32)}
     * @param typeOfVarchar The value of typeOfVarchar as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    def setTypeOfVarchar_NotEqual(typeOfVarchar: String): Unit = {
        doSetTypeOfVarchar_NotEqual(fRES(typeOfVarchar));
    }

    protected def doSetTypeOfVarchar_NotEqual(typeOfVarchar: String): Unit = {
        regTypeOfVarchar(CK_NES, typeOfVarchar);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_VARCHAR: {VARCHAR(32)}
     * @param typeOfVarcharList The collection of typeOfVarchar as inScope. (NullAllowed: if null (or empty), no condition)
     */
    def setTypeOfVarchar_InScope(typeOfVarcharList: List[String]): Unit = {
        doSetTypeOfVarchar_InScope(toMutableValueCollectionImplicitly(typeOfVarcharList));
    }

    protected def doSetTypeOfVarchar_InScope(typeOfVarcharList: Collection[String]): Unit = {
        regINS(CK_INS, cTL(typeOfVarcharList), getCValueTypeOfVarchar(), "TYPE_OF_VARCHAR");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_VARCHAR: {VARCHAR(32)}
     * @param typeOfVarcharList The collection of typeOfVarchar as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    def setTypeOfVarchar_NotInScope(typeOfVarcharList: List[String]): Unit = {
        doSetTypeOfVarchar_NotInScope(if (typeOfVarcharList != null) { typeOfVarcharList.map(_.asInstanceOf[String]).asJava } else { null });
    }

    protected def doSetTypeOfVarchar_NotInScope(typeOfVarcharList: Collection[String]): Unit = {
        regINS(CK_NINS, cTL(typeOfVarcharList), getCValueTypeOfVarchar(), "TYPE_OF_VARCHAR");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TYPE_OF_VARCHAR: {VARCHAR(32)}
     * @param typeOfVarchar The value of typeOfVarchar as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    def setTypeOfVarchar_PrefixSearch(typeOfVarchar: String): Unit = {
        setTypeOfVarchar_LikeSearch(typeOfVarchar)(_.likePrefix);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TYPE_OF_VARCHAR: {VARCHAR(32)} <br />
     * <pre>e.g. setTypeOfVarchar_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param typeOfVarchar The value of typeOfVarchar as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param optionCall The callback for option of like-search. (NotNull)
     */
    def setTypeOfVarchar_LikeSearch(typeOfVarchar: String)(optionCall: (ScrLikeSearchOption) => Unit): Unit = {
        regLSQ(CK_LS, fRES(typeOfVarchar), getCValueTypeOfVarchar(), "TYPE_OF_VARCHAR", callbackLSOP(optionCall));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TYPE_OF_VARCHAR: {VARCHAR(32)}
     * @param typeOfVarchar The value of typeOfVarchar as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param optionCall The callback for option of not-like-search. (NotNull)
     */
    def setTypeOfVarchar_NotLikeSearch(typeOfVarchar: String)(optionCall: (ScrLikeSearchOption) => Unit): Unit = {
        regLSQ(CK_NLS, fRES(typeOfVarchar), getCValueTypeOfVarchar(), "TYPE_OF_VARCHAR", callbackLSOP(optionCall));
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_VARCHAR: {VARCHAR(32)}
     */
    def setTypeOfVarchar_IsNull(): Unit = { regTypeOfVarchar(CK_ISN, AbstractConditionQuery.DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * TYPE_OF_VARCHAR: {VARCHAR(32)}
     */
    def setTypeOfVarchar_IsNullOrEmpty(): Unit = { regTypeOfVarchar(CK_ISNOE, AbstractConditionQuery.DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_VARCHAR: {VARCHAR(32)}
     */
    def setTypeOfVarchar_IsNotNull(): Unit = { regTypeOfVarchar(CK_ISNN, AbstractConditionQuery.DOBJ); }

    protected def regTypeOfVarchar(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValueTypeOfVarchar(), "TYPE_OF_VARCHAR"); }
    protected def getCValueTypeOfVarchar(): ConditionValue;

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_CLOB: {CLOB(2147483647)}
     * @param typeOfClob The value of typeOfClob as equal. (NullAllowed: if null (or empty), no condition)
     */
    def setTypeOfClob_Equal(typeOfClob: String): Unit = {
        doSetTypeOfClob_Equal(fRES(typeOfClob));
    }

    protected def doSetTypeOfClob_Equal(typeOfClob: String): Unit = {
        regTypeOfClob(CK_EQ, typeOfClob);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TYPE_OF_CLOB: {CLOB(2147483647)} <br />
     * <pre>e.g. setTypeOfClob_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param typeOfClob The value of typeOfClob as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param optionCall The callback for option of like-search. (NotNull)
     */
    def setTypeOfClob_LikeSearch(typeOfClob: String)(optionCall: (ScrLikeSearchOption) => Unit): Unit = {
        regLSQ(CK_LS, fRES(typeOfClob), getCValueTypeOfClob(), "TYPE_OF_CLOB", callbackLSOP(optionCall));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TYPE_OF_CLOB: {CLOB(2147483647)}
     * @param typeOfClob The value of typeOfClob as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param optionCall The callback for option of not-like-search. (NotNull)
     */
    def setTypeOfClob_NotLikeSearch(typeOfClob: String)(optionCall: (ScrLikeSearchOption) => Unit): Unit = {
        regLSQ(CK_NLS, fRES(typeOfClob), getCValueTypeOfClob(), "TYPE_OF_CLOB", callbackLSOP(optionCall));
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_CLOB: {CLOB(2147483647)}
     */
    def setTypeOfClob_IsNull(): Unit = { regTypeOfClob(CK_ISN, AbstractConditionQuery.DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * TYPE_OF_CLOB: {CLOB(2147483647)}
     */
    def setTypeOfClob_IsNullOrEmpty(): Unit = { regTypeOfClob(CK_ISNOE, AbstractConditionQuery.DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_CLOB: {CLOB(2147483647)}
     */
    def setTypeOfClob_IsNotNull(): Unit = { regTypeOfClob(CK_ISNN, AbstractConditionQuery.DOBJ); }

    protected def regTypeOfClob(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValueTypeOfClob(), "TYPE_OF_CLOB"); }
    protected def getCValueTypeOfClob(): ConditionValue;

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_TEXT: {CLOB(2147483647)}
     * @param typeOfText The value of typeOfText as equal. (NullAllowed: if null (or empty), no condition)
     */
    def setTypeOfText_Equal(typeOfText: String): Unit = {
        doSetTypeOfText_Equal(fRES(typeOfText));
    }

    protected def doSetTypeOfText_Equal(typeOfText: String): Unit = {
        regTypeOfText(CK_EQ, typeOfText);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TYPE_OF_TEXT: {CLOB(2147483647)} <br />
     * <pre>e.g. setTypeOfText_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param typeOfText The value of typeOfText as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param optionCall The callback for option of like-search. (NotNull)
     */
    def setTypeOfText_LikeSearch(typeOfText: String)(optionCall: (ScrLikeSearchOption) => Unit): Unit = {
        regLSQ(CK_LS, fRES(typeOfText), getCValueTypeOfText(), "TYPE_OF_TEXT", callbackLSOP(optionCall));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TYPE_OF_TEXT: {CLOB(2147483647)}
     * @param typeOfText The value of typeOfText as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param optionCall The callback for option of not-like-search. (NotNull)
     */
    def setTypeOfText_NotLikeSearch(typeOfText: String)(optionCall: (ScrLikeSearchOption) => Unit): Unit = {
        regLSQ(CK_NLS, fRES(typeOfText), getCValueTypeOfText(), "TYPE_OF_TEXT", callbackLSOP(optionCall));
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_TEXT: {CLOB(2147483647)}
     */
    def setTypeOfText_IsNull(): Unit = { regTypeOfText(CK_ISN, AbstractConditionQuery.DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * TYPE_OF_TEXT: {CLOB(2147483647)}
     */
    def setTypeOfText_IsNullOrEmpty(): Unit = { regTypeOfText(CK_ISNOE, AbstractConditionQuery.DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_TEXT: {CLOB(2147483647)}
     */
    def setTypeOfText_IsNotNull(): Unit = { regTypeOfText(CK_ISNN, AbstractConditionQuery.DOBJ); }

    protected def regTypeOfText(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValueTypeOfText(), "TYPE_OF_TEXT"); }
    protected def getCValueTypeOfText(): ConditionValue;

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_INTEGER: {DECIMAL(5)}
     * @param typeOfNumericInteger The value of typeOfNumericInteger as equal. (NullAllowed: if null, no condition)
     */
    def setTypeOfNumericInteger_Equal(typeOfNumericInteger: Int): Unit = {
        doSetTypeOfNumericInteger_Equal(typeOfNumericInteger);
    }

    protected def doSetTypeOfNumericInteger_Equal(typeOfNumericInteger: Integer): Unit = {
        regTypeOfNumericInteger(CK_EQ, typeOfNumericInteger);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_INTEGER: {DECIMAL(5)}
     * @param typeOfNumericInteger The value of typeOfNumericInteger as notEqual. (NullAllowed: if null, no condition)
     */
    def setTypeOfNumericInteger_NotEqual(typeOfNumericInteger: Int): Unit = {
        doSetTypeOfNumericInteger_NotEqual(typeOfNumericInteger);
    }

    protected def doSetTypeOfNumericInteger_NotEqual(typeOfNumericInteger: Integer): Unit = {
        regTypeOfNumericInteger(CK_NES, typeOfNumericInteger);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_INTEGER: {DECIMAL(5)}
     * @param typeOfNumericInteger The value of typeOfNumericInteger as greaterThan. (NullAllowed: if null, no condition)
     */
    def setTypeOfNumericInteger_GreaterThan(typeOfNumericInteger: Int): Unit = {
        regTypeOfNumericInteger(CK_GT, typeOfNumericInteger);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_INTEGER: {DECIMAL(5)}
     * @param typeOfNumericInteger The value of typeOfNumericInteger as lessThan. (NullAllowed: if null, no condition)
     */
    def setTypeOfNumericInteger_LessThan(typeOfNumericInteger: Int): Unit = {
        regTypeOfNumericInteger(CK_LT, typeOfNumericInteger);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_INTEGER: {DECIMAL(5)}
     * @param typeOfNumericInteger The value of typeOfNumericInteger as greaterEqual. (NullAllowed: if null, no condition)
     */
    def setTypeOfNumericInteger_GreaterEqual(typeOfNumericInteger: Int): Unit = {
        regTypeOfNumericInteger(CK_GE, typeOfNumericInteger);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_INTEGER: {DECIMAL(5)}
     * @param typeOfNumericInteger The value of typeOfNumericInteger as lessEqual. (NullAllowed: if null, no condition)
     */
    def setTypeOfNumericInteger_LessEqual(typeOfNumericInteger: Int): Unit = {
        regTypeOfNumericInteger(CK_LE, typeOfNumericInteger);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_INTEGER: {DECIMAL(5)}
     * @param minNumber The min number of typeOfNumericInteger. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of typeOfNumericInteger. (NullAllowed: if null, no to-condition)
     * @param optionCall The callback for option of range-of. (NotNull)
     */
    def setTypeOfNumericInteger_RangeOf(minNumber: Int, maxNumber: Int)(optionCall: (RangeOfOption) => Unit): Unit = {
        regROO(minNumber, maxNumber, getCValueTypeOfNumericInteger(), "TYPE_OF_NUMERIC_INTEGER", callbackROOP(optionCall));
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_NUMERIC_INTEGER: {DECIMAL(5)}
     * @param typeOfNumericIntegerList The collection of typeOfNumericInteger as inScope. (NullAllowed: if null (or empty), no condition)
     */
    def setTypeOfNumericInteger_InScope(typeOfNumericIntegerList: List[Int]): Unit = {
        doSetTypeOfNumericInteger_InScope(toMutableValueCollectionImplicitly(typeOfNumericIntegerList));
    }

    protected def doSetTypeOfNumericInteger_InScope(typeOfNumericIntegerList: Collection[Integer]): Unit = {
        regINS(CK_INS, cTL(typeOfNumericIntegerList), getCValueTypeOfNumericInteger(), "TYPE_OF_NUMERIC_INTEGER");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_NUMERIC_INTEGER: {DECIMAL(5)}
     * @param typeOfNumericIntegerList The collection of typeOfNumericInteger as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    def setTypeOfNumericInteger_NotInScope(typeOfNumericIntegerList: List[Int]): Unit = {
        doSetTypeOfNumericInteger_NotInScope(if (typeOfNumericIntegerList != null) { typeOfNumericIntegerList.map(_.asInstanceOf[Integer]).asJava } else { null });
    }

    protected def doSetTypeOfNumericInteger_NotInScope(typeOfNumericIntegerList: Collection[Integer]): Unit = {
        regINS(CK_NINS, cTL(typeOfNumericIntegerList), getCValueTypeOfNumericInteger(), "TYPE_OF_NUMERIC_INTEGER");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_INTEGER: {DECIMAL(5)}
     */
    def setTypeOfNumericInteger_IsNull(): Unit = { regTypeOfNumericInteger(CK_ISN, AbstractConditionQuery.DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_INTEGER: {DECIMAL(5)}
     */
    def setTypeOfNumericInteger_IsNotNull(): Unit = { regTypeOfNumericInteger(CK_ISNN, AbstractConditionQuery.DOBJ); }

    protected def regTypeOfNumericInteger(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValueTypeOfNumericInteger(), "TYPE_OF_NUMERIC_INTEGER"); }
    protected def getCValueTypeOfNumericInteger(): ConditionValue;

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_BIGINT: {DECIMAL(12)}
     * @param typeOfNumericBigint The value of typeOfNumericBigint as equal. (NullAllowed: if null, no condition)
     */
    def setTypeOfNumericBigint_Equal(typeOfNumericBigint: Long): Unit = {
        doSetTypeOfNumericBigint_Equal(typeOfNumericBigint);
    }

    protected def doSetTypeOfNumericBigint_Equal(typeOfNumericBigint: Long): Unit = {
        regTypeOfNumericBigint(CK_EQ, typeOfNumericBigint);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_BIGINT: {DECIMAL(12)}
     * @param typeOfNumericBigint The value of typeOfNumericBigint as notEqual. (NullAllowed: if null, no condition)
     */
    def setTypeOfNumericBigint_NotEqual(typeOfNumericBigint: Long): Unit = {
        doSetTypeOfNumericBigint_NotEqual(typeOfNumericBigint);
    }

    protected def doSetTypeOfNumericBigint_NotEqual(typeOfNumericBigint: Long): Unit = {
        regTypeOfNumericBigint(CK_NES, typeOfNumericBigint);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_BIGINT: {DECIMAL(12)}
     * @param typeOfNumericBigint The value of typeOfNumericBigint as greaterThan. (NullAllowed: if null, no condition)
     */
    def setTypeOfNumericBigint_GreaterThan(typeOfNumericBigint: Long): Unit = {
        regTypeOfNumericBigint(CK_GT, typeOfNumericBigint);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_BIGINT: {DECIMAL(12)}
     * @param typeOfNumericBigint The value of typeOfNumericBigint as lessThan. (NullAllowed: if null, no condition)
     */
    def setTypeOfNumericBigint_LessThan(typeOfNumericBigint: Long): Unit = {
        regTypeOfNumericBigint(CK_LT, typeOfNumericBigint);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_BIGINT: {DECIMAL(12)}
     * @param typeOfNumericBigint The value of typeOfNumericBigint as greaterEqual. (NullAllowed: if null, no condition)
     */
    def setTypeOfNumericBigint_GreaterEqual(typeOfNumericBigint: Long): Unit = {
        regTypeOfNumericBigint(CK_GE, typeOfNumericBigint);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_BIGINT: {DECIMAL(12)}
     * @param typeOfNumericBigint The value of typeOfNumericBigint as lessEqual. (NullAllowed: if null, no condition)
     */
    def setTypeOfNumericBigint_LessEqual(typeOfNumericBigint: Long): Unit = {
        regTypeOfNumericBigint(CK_LE, typeOfNumericBigint);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_BIGINT: {DECIMAL(12)}
     * @param minNumber The min number of typeOfNumericBigint. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of typeOfNumericBigint. (NullAllowed: if null, no to-condition)
     * @param optionCall The callback for option of range-of. (NotNull)
     */
    def setTypeOfNumericBigint_RangeOf(minNumber: Long, maxNumber: Long)(optionCall: (RangeOfOption) => Unit): Unit = {
        regROO(minNumber, maxNumber, getCValueTypeOfNumericBigint(), "TYPE_OF_NUMERIC_BIGINT", callbackROOP(optionCall));
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_NUMERIC_BIGINT: {DECIMAL(12)}
     * @param typeOfNumericBigintList The collection of typeOfNumericBigint as inScope. (NullAllowed: if null (or empty), no condition)
     */
    def setTypeOfNumericBigint_InScope(typeOfNumericBigintList: List[Long]): Unit = {
        doSetTypeOfNumericBigint_InScope(toMutableValueCollectionImplicitly(typeOfNumericBigintList));
    }

    protected def doSetTypeOfNumericBigint_InScope(typeOfNumericBigintList: Collection[Long]): Unit = {
        regINS(CK_INS, cTL(typeOfNumericBigintList), getCValueTypeOfNumericBigint(), "TYPE_OF_NUMERIC_BIGINT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_NUMERIC_BIGINT: {DECIMAL(12)}
     * @param typeOfNumericBigintList The collection of typeOfNumericBigint as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    def setTypeOfNumericBigint_NotInScope(typeOfNumericBigintList: List[Long]): Unit = {
        doSetTypeOfNumericBigint_NotInScope(if (typeOfNumericBigintList != null) { typeOfNumericBigintList.map(_.asInstanceOf[Long]).asJava } else { null });
    }

    protected def doSetTypeOfNumericBigint_NotInScope(typeOfNumericBigintList: Collection[Long]): Unit = {
        regINS(CK_NINS, cTL(typeOfNumericBigintList), getCValueTypeOfNumericBigint(), "TYPE_OF_NUMERIC_BIGINT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_BIGINT: {DECIMAL(12)}
     */
    def setTypeOfNumericBigint_IsNull(): Unit = { regTypeOfNumericBigint(CK_ISN, AbstractConditionQuery.DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_BIGINT: {DECIMAL(12)}
     */
    def setTypeOfNumericBigint_IsNotNull(): Unit = { regTypeOfNumericBigint(CK_ISNN, AbstractConditionQuery.DOBJ); }

    protected def regTypeOfNumericBigint(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValueTypeOfNumericBigint(), "TYPE_OF_NUMERIC_BIGINT"); }
    protected def getCValueTypeOfNumericBigint(): ConditionValue;

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_DECIMAL: {DECIMAL(5, 3)}
     * @param typeOfNumericDecimal The value of typeOfNumericDecimal as equal. (NullAllowed: if null, no condition)
     */
    def setTypeOfNumericDecimal_Equal(typeOfNumericDecimal: scala.math.BigDecimal): Unit = {
        doSetTypeOfNumericDecimal_Equal(typeOfNumericDecimal.underlying);
    }

    protected def doSetTypeOfNumericDecimal_Equal(typeOfNumericDecimal: java.math.BigDecimal): Unit = {
        regTypeOfNumericDecimal(CK_EQ, typeOfNumericDecimal);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_DECIMAL: {DECIMAL(5, 3)}
     * @param typeOfNumericDecimal The value of typeOfNumericDecimal as notEqual. (NullAllowed: if null, no condition)
     */
    def setTypeOfNumericDecimal_NotEqual(typeOfNumericDecimal: scala.math.BigDecimal): Unit = {
        doSetTypeOfNumericDecimal_NotEqual(typeOfNumericDecimal.underlying);
    }

    protected def doSetTypeOfNumericDecimal_NotEqual(typeOfNumericDecimal: java.math.BigDecimal): Unit = {
        regTypeOfNumericDecimal(CK_NES, typeOfNumericDecimal);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_DECIMAL: {DECIMAL(5, 3)}
     * @param typeOfNumericDecimal The value of typeOfNumericDecimal as greaterThan. (NullAllowed: if null, no condition)
     */
    def setTypeOfNumericDecimal_GreaterThan(typeOfNumericDecimal: scala.math.BigDecimal): Unit = {
        regTypeOfNumericDecimal(CK_GT, typeOfNumericDecimal.underlying);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_DECIMAL: {DECIMAL(5, 3)}
     * @param typeOfNumericDecimal The value of typeOfNumericDecimal as lessThan. (NullAllowed: if null, no condition)
     */
    def setTypeOfNumericDecimal_LessThan(typeOfNumericDecimal: scala.math.BigDecimal): Unit = {
        regTypeOfNumericDecimal(CK_LT, typeOfNumericDecimal.underlying);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_DECIMAL: {DECIMAL(5, 3)}
     * @param typeOfNumericDecimal The value of typeOfNumericDecimal as greaterEqual. (NullAllowed: if null, no condition)
     */
    def setTypeOfNumericDecimal_GreaterEqual(typeOfNumericDecimal: scala.math.BigDecimal): Unit = {
        regTypeOfNumericDecimal(CK_GE, typeOfNumericDecimal.underlying);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_DECIMAL: {DECIMAL(5, 3)}
     * @param typeOfNumericDecimal The value of typeOfNumericDecimal as lessEqual. (NullAllowed: if null, no condition)
     */
    def setTypeOfNumericDecimal_LessEqual(typeOfNumericDecimal: scala.math.BigDecimal): Unit = {
        regTypeOfNumericDecimal(CK_LE, typeOfNumericDecimal.underlying);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_DECIMAL: {DECIMAL(5, 3)}
     * @param minNumber The min number of typeOfNumericDecimal. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of typeOfNumericDecimal. (NullAllowed: if null, no to-condition)
     * @param optionCall The callback for option of range-of. (NotNull)
     */
    def setTypeOfNumericDecimal_RangeOf(minNumber: scala.math.BigDecimal, maxNumber: scala.math.BigDecimal)(optionCall: (RangeOfOption) => Unit): Unit = {
        regROO(minNumber, maxNumber, getCValueTypeOfNumericDecimal(), "TYPE_OF_NUMERIC_DECIMAL", callbackROOP(optionCall));
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_NUMERIC_DECIMAL: {DECIMAL(5, 3)}
     * @param typeOfNumericDecimalList The collection of typeOfNumericDecimal as inScope. (NullAllowed: if null (or empty), no condition)
     */
    def setTypeOfNumericDecimal_InScope(typeOfNumericDecimalList: List[scala.math.BigDecimal]): Unit = {
        doSetTypeOfNumericDecimal_InScope(toMutableValueCollectionImplicitly(typeOfNumericDecimalList));
    }

    protected def doSetTypeOfNumericDecimal_InScope(typeOfNumericDecimalList: Collection[java.math.BigDecimal]): Unit = {
        regINS(CK_INS, cTL(typeOfNumericDecimalList), getCValueTypeOfNumericDecimal(), "TYPE_OF_NUMERIC_DECIMAL");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_NUMERIC_DECIMAL: {DECIMAL(5, 3)}
     * @param typeOfNumericDecimalList The collection of typeOfNumericDecimal as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    def setTypeOfNumericDecimal_NotInScope(typeOfNumericDecimalList: List[scala.math.BigDecimal]): Unit = {
        doSetTypeOfNumericDecimal_NotInScope(if (typeOfNumericDecimalList != null) { typeOfNumericDecimalList.map(_.asInstanceOf[java.math.BigDecimal]).asJava } else { null });
    }

    protected def doSetTypeOfNumericDecimal_NotInScope(typeOfNumericDecimalList: Collection[java.math.BigDecimal]): Unit = {
        regINS(CK_NINS, cTL(typeOfNumericDecimalList), getCValueTypeOfNumericDecimal(), "TYPE_OF_NUMERIC_DECIMAL");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_DECIMAL: {DECIMAL(5, 3)}
     */
    def setTypeOfNumericDecimal_IsNull(): Unit = { regTypeOfNumericDecimal(CK_ISN, AbstractConditionQuery.DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_DECIMAL: {DECIMAL(5, 3)}
     */
    def setTypeOfNumericDecimal_IsNotNull(): Unit = { regTypeOfNumericDecimal(CK_ISNN, AbstractConditionQuery.DOBJ); }

    protected def regTypeOfNumericDecimal(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValueTypeOfNumericDecimal(), "TYPE_OF_NUMERIC_DECIMAL"); }
    protected def getCValueTypeOfNumericDecimal(): ConditionValue;

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_INTEGER_MIN: {DECIMAL(1)}
     * @param typeOfNumericIntegerMin The value of typeOfNumericIntegerMin as equal. (NullAllowed: if null, no condition)
     */
    def setTypeOfNumericIntegerMin_Equal(typeOfNumericIntegerMin: Int): Unit = {
        doSetTypeOfNumericIntegerMin_Equal(typeOfNumericIntegerMin);
    }

    protected def doSetTypeOfNumericIntegerMin_Equal(typeOfNumericIntegerMin: Integer): Unit = {
        regTypeOfNumericIntegerMin(CK_EQ, typeOfNumericIntegerMin);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_INTEGER_MIN: {DECIMAL(1)}
     * @param typeOfNumericIntegerMin The value of typeOfNumericIntegerMin as notEqual. (NullAllowed: if null, no condition)
     */
    def setTypeOfNumericIntegerMin_NotEqual(typeOfNumericIntegerMin: Int): Unit = {
        doSetTypeOfNumericIntegerMin_NotEqual(typeOfNumericIntegerMin);
    }

    protected def doSetTypeOfNumericIntegerMin_NotEqual(typeOfNumericIntegerMin: Integer): Unit = {
        regTypeOfNumericIntegerMin(CK_NES, typeOfNumericIntegerMin);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_INTEGER_MIN: {DECIMAL(1)}
     * @param typeOfNumericIntegerMin The value of typeOfNumericIntegerMin as greaterThan. (NullAllowed: if null, no condition)
     */
    def setTypeOfNumericIntegerMin_GreaterThan(typeOfNumericIntegerMin: Int): Unit = {
        regTypeOfNumericIntegerMin(CK_GT, typeOfNumericIntegerMin);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_INTEGER_MIN: {DECIMAL(1)}
     * @param typeOfNumericIntegerMin The value of typeOfNumericIntegerMin as lessThan. (NullAllowed: if null, no condition)
     */
    def setTypeOfNumericIntegerMin_LessThan(typeOfNumericIntegerMin: Int): Unit = {
        regTypeOfNumericIntegerMin(CK_LT, typeOfNumericIntegerMin);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_INTEGER_MIN: {DECIMAL(1)}
     * @param typeOfNumericIntegerMin The value of typeOfNumericIntegerMin as greaterEqual. (NullAllowed: if null, no condition)
     */
    def setTypeOfNumericIntegerMin_GreaterEqual(typeOfNumericIntegerMin: Int): Unit = {
        regTypeOfNumericIntegerMin(CK_GE, typeOfNumericIntegerMin);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_INTEGER_MIN: {DECIMAL(1)}
     * @param typeOfNumericIntegerMin The value of typeOfNumericIntegerMin as lessEqual. (NullAllowed: if null, no condition)
     */
    def setTypeOfNumericIntegerMin_LessEqual(typeOfNumericIntegerMin: Int): Unit = {
        regTypeOfNumericIntegerMin(CK_LE, typeOfNumericIntegerMin);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_INTEGER_MIN: {DECIMAL(1)}
     * @param minNumber The min number of typeOfNumericIntegerMin. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of typeOfNumericIntegerMin. (NullAllowed: if null, no to-condition)
     * @param optionCall The callback for option of range-of. (NotNull)
     */
    def setTypeOfNumericIntegerMin_RangeOf(minNumber: Int, maxNumber: Int)(optionCall: (RangeOfOption) => Unit): Unit = {
        regROO(minNumber, maxNumber, getCValueTypeOfNumericIntegerMin(), "TYPE_OF_NUMERIC_INTEGER_MIN", callbackROOP(optionCall));
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_NUMERIC_INTEGER_MIN: {DECIMAL(1)}
     * @param typeOfNumericIntegerMinList The collection of typeOfNumericIntegerMin as inScope. (NullAllowed: if null (or empty), no condition)
     */
    def setTypeOfNumericIntegerMin_InScope(typeOfNumericIntegerMinList: List[Int]): Unit = {
        doSetTypeOfNumericIntegerMin_InScope(toMutableValueCollectionImplicitly(typeOfNumericIntegerMinList));
    }

    protected def doSetTypeOfNumericIntegerMin_InScope(typeOfNumericIntegerMinList: Collection[Integer]): Unit = {
        regINS(CK_INS, cTL(typeOfNumericIntegerMinList), getCValueTypeOfNumericIntegerMin(), "TYPE_OF_NUMERIC_INTEGER_MIN");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_NUMERIC_INTEGER_MIN: {DECIMAL(1)}
     * @param typeOfNumericIntegerMinList The collection of typeOfNumericIntegerMin as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    def setTypeOfNumericIntegerMin_NotInScope(typeOfNumericIntegerMinList: List[Int]): Unit = {
        doSetTypeOfNumericIntegerMin_NotInScope(if (typeOfNumericIntegerMinList != null) { typeOfNumericIntegerMinList.map(_.asInstanceOf[Integer]).asJava } else { null });
    }

    protected def doSetTypeOfNumericIntegerMin_NotInScope(typeOfNumericIntegerMinList: Collection[Integer]): Unit = {
        regINS(CK_NINS, cTL(typeOfNumericIntegerMinList), getCValueTypeOfNumericIntegerMin(), "TYPE_OF_NUMERIC_INTEGER_MIN");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_INTEGER_MIN: {DECIMAL(1)}
     */
    def setTypeOfNumericIntegerMin_IsNull(): Unit = { regTypeOfNumericIntegerMin(CK_ISN, AbstractConditionQuery.DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_INTEGER_MIN: {DECIMAL(1)}
     */
    def setTypeOfNumericIntegerMin_IsNotNull(): Unit = { regTypeOfNumericIntegerMin(CK_ISNN, AbstractConditionQuery.DOBJ); }

    protected def regTypeOfNumericIntegerMin(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValueTypeOfNumericIntegerMin(), "TYPE_OF_NUMERIC_INTEGER_MIN"); }
    protected def getCValueTypeOfNumericIntegerMin(): ConditionValue;

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_INTEGER_MAX: {DECIMAL(9)}
     * @param typeOfNumericIntegerMax The value of typeOfNumericIntegerMax as equal. (NullAllowed: if null, no condition)
     */
    def setTypeOfNumericIntegerMax_Equal(typeOfNumericIntegerMax: Int): Unit = {
        doSetTypeOfNumericIntegerMax_Equal(typeOfNumericIntegerMax);
    }

    protected def doSetTypeOfNumericIntegerMax_Equal(typeOfNumericIntegerMax: Integer): Unit = {
        regTypeOfNumericIntegerMax(CK_EQ, typeOfNumericIntegerMax);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_INTEGER_MAX: {DECIMAL(9)}
     * @param typeOfNumericIntegerMax The value of typeOfNumericIntegerMax as notEqual. (NullAllowed: if null, no condition)
     */
    def setTypeOfNumericIntegerMax_NotEqual(typeOfNumericIntegerMax: Int): Unit = {
        doSetTypeOfNumericIntegerMax_NotEqual(typeOfNumericIntegerMax);
    }

    protected def doSetTypeOfNumericIntegerMax_NotEqual(typeOfNumericIntegerMax: Integer): Unit = {
        regTypeOfNumericIntegerMax(CK_NES, typeOfNumericIntegerMax);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_INTEGER_MAX: {DECIMAL(9)}
     * @param typeOfNumericIntegerMax The value of typeOfNumericIntegerMax as greaterThan. (NullAllowed: if null, no condition)
     */
    def setTypeOfNumericIntegerMax_GreaterThan(typeOfNumericIntegerMax: Int): Unit = {
        regTypeOfNumericIntegerMax(CK_GT, typeOfNumericIntegerMax);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_INTEGER_MAX: {DECIMAL(9)}
     * @param typeOfNumericIntegerMax The value of typeOfNumericIntegerMax as lessThan. (NullAllowed: if null, no condition)
     */
    def setTypeOfNumericIntegerMax_LessThan(typeOfNumericIntegerMax: Int): Unit = {
        regTypeOfNumericIntegerMax(CK_LT, typeOfNumericIntegerMax);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_INTEGER_MAX: {DECIMAL(9)}
     * @param typeOfNumericIntegerMax The value of typeOfNumericIntegerMax as greaterEqual. (NullAllowed: if null, no condition)
     */
    def setTypeOfNumericIntegerMax_GreaterEqual(typeOfNumericIntegerMax: Int): Unit = {
        regTypeOfNumericIntegerMax(CK_GE, typeOfNumericIntegerMax);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_INTEGER_MAX: {DECIMAL(9)}
     * @param typeOfNumericIntegerMax The value of typeOfNumericIntegerMax as lessEqual. (NullAllowed: if null, no condition)
     */
    def setTypeOfNumericIntegerMax_LessEqual(typeOfNumericIntegerMax: Int): Unit = {
        regTypeOfNumericIntegerMax(CK_LE, typeOfNumericIntegerMax);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_INTEGER_MAX: {DECIMAL(9)}
     * @param minNumber The min number of typeOfNumericIntegerMax. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of typeOfNumericIntegerMax. (NullAllowed: if null, no to-condition)
     * @param optionCall The callback for option of range-of. (NotNull)
     */
    def setTypeOfNumericIntegerMax_RangeOf(minNumber: Int, maxNumber: Int)(optionCall: (RangeOfOption) => Unit): Unit = {
        regROO(minNumber, maxNumber, getCValueTypeOfNumericIntegerMax(), "TYPE_OF_NUMERIC_INTEGER_MAX", callbackROOP(optionCall));
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_NUMERIC_INTEGER_MAX: {DECIMAL(9)}
     * @param typeOfNumericIntegerMaxList The collection of typeOfNumericIntegerMax as inScope. (NullAllowed: if null (or empty), no condition)
     */
    def setTypeOfNumericIntegerMax_InScope(typeOfNumericIntegerMaxList: List[Int]): Unit = {
        doSetTypeOfNumericIntegerMax_InScope(toMutableValueCollectionImplicitly(typeOfNumericIntegerMaxList));
    }

    protected def doSetTypeOfNumericIntegerMax_InScope(typeOfNumericIntegerMaxList: Collection[Integer]): Unit = {
        regINS(CK_INS, cTL(typeOfNumericIntegerMaxList), getCValueTypeOfNumericIntegerMax(), "TYPE_OF_NUMERIC_INTEGER_MAX");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_NUMERIC_INTEGER_MAX: {DECIMAL(9)}
     * @param typeOfNumericIntegerMaxList The collection of typeOfNumericIntegerMax as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    def setTypeOfNumericIntegerMax_NotInScope(typeOfNumericIntegerMaxList: List[Int]): Unit = {
        doSetTypeOfNumericIntegerMax_NotInScope(if (typeOfNumericIntegerMaxList != null) { typeOfNumericIntegerMaxList.map(_.asInstanceOf[Integer]).asJava } else { null });
    }

    protected def doSetTypeOfNumericIntegerMax_NotInScope(typeOfNumericIntegerMaxList: Collection[Integer]): Unit = {
        regINS(CK_NINS, cTL(typeOfNumericIntegerMaxList), getCValueTypeOfNumericIntegerMax(), "TYPE_OF_NUMERIC_INTEGER_MAX");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_INTEGER_MAX: {DECIMAL(9)}
     */
    def setTypeOfNumericIntegerMax_IsNull(): Unit = { regTypeOfNumericIntegerMax(CK_ISN, AbstractConditionQuery.DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_INTEGER_MAX: {DECIMAL(9)}
     */
    def setTypeOfNumericIntegerMax_IsNotNull(): Unit = { regTypeOfNumericIntegerMax(CK_ISNN, AbstractConditionQuery.DOBJ); }

    protected def regTypeOfNumericIntegerMax(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValueTypeOfNumericIntegerMax(), "TYPE_OF_NUMERIC_INTEGER_MAX"); }
    protected def getCValueTypeOfNumericIntegerMax(): ConditionValue;

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_BIGINT_MIN: {DECIMAL(10)}
     * @param typeOfNumericBigintMin The value of typeOfNumericBigintMin as equal. (NullAllowed: if null, no condition)
     */
    def setTypeOfNumericBigintMin_Equal(typeOfNumericBigintMin: Long): Unit = {
        doSetTypeOfNumericBigintMin_Equal(typeOfNumericBigintMin);
    }

    protected def doSetTypeOfNumericBigintMin_Equal(typeOfNumericBigintMin: Long): Unit = {
        regTypeOfNumericBigintMin(CK_EQ, typeOfNumericBigintMin);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_BIGINT_MIN: {DECIMAL(10)}
     * @param typeOfNumericBigintMin The value of typeOfNumericBigintMin as notEqual. (NullAllowed: if null, no condition)
     */
    def setTypeOfNumericBigintMin_NotEqual(typeOfNumericBigintMin: Long): Unit = {
        doSetTypeOfNumericBigintMin_NotEqual(typeOfNumericBigintMin);
    }

    protected def doSetTypeOfNumericBigintMin_NotEqual(typeOfNumericBigintMin: Long): Unit = {
        regTypeOfNumericBigintMin(CK_NES, typeOfNumericBigintMin);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_BIGINT_MIN: {DECIMAL(10)}
     * @param typeOfNumericBigintMin The value of typeOfNumericBigintMin as greaterThan. (NullAllowed: if null, no condition)
     */
    def setTypeOfNumericBigintMin_GreaterThan(typeOfNumericBigintMin: Long): Unit = {
        regTypeOfNumericBigintMin(CK_GT, typeOfNumericBigintMin);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_BIGINT_MIN: {DECIMAL(10)}
     * @param typeOfNumericBigintMin The value of typeOfNumericBigintMin as lessThan. (NullAllowed: if null, no condition)
     */
    def setTypeOfNumericBigintMin_LessThan(typeOfNumericBigintMin: Long): Unit = {
        regTypeOfNumericBigintMin(CK_LT, typeOfNumericBigintMin);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_BIGINT_MIN: {DECIMAL(10)}
     * @param typeOfNumericBigintMin The value of typeOfNumericBigintMin as greaterEqual. (NullAllowed: if null, no condition)
     */
    def setTypeOfNumericBigintMin_GreaterEqual(typeOfNumericBigintMin: Long): Unit = {
        regTypeOfNumericBigintMin(CK_GE, typeOfNumericBigintMin);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_BIGINT_MIN: {DECIMAL(10)}
     * @param typeOfNumericBigintMin The value of typeOfNumericBigintMin as lessEqual. (NullAllowed: if null, no condition)
     */
    def setTypeOfNumericBigintMin_LessEqual(typeOfNumericBigintMin: Long): Unit = {
        regTypeOfNumericBigintMin(CK_LE, typeOfNumericBigintMin);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_BIGINT_MIN: {DECIMAL(10)}
     * @param minNumber The min number of typeOfNumericBigintMin. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of typeOfNumericBigintMin. (NullAllowed: if null, no to-condition)
     * @param optionCall The callback for option of range-of. (NotNull)
     */
    def setTypeOfNumericBigintMin_RangeOf(minNumber: Long, maxNumber: Long)(optionCall: (RangeOfOption) => Unit): Unit = {
        regROO(minNumber, maxNumber, getCValueTypeOfNumericBigintMin(), "TYPE_OF_NUMERIC_BIGINT_MIN", callbackROOP(optionCall));
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_NUMERIC_BIGINT_MIN: {DECIMAL(10)}
     * @param typeOfNumericBigintMinList The collection of typeOfNumericBigintMin as inScope. (NullAllowed: if null (or empty), no condition)
     */
    def setTypeOfNumericBigintMin_InScope(typeOfNumericBigintMinList: List[Long]): Unit = {
        doSetTypeOfNumericBigintMin_InScope(toMutableValueCollectionImplicitly(typeOfNumericBigintMinList));
    }

    protected def doSetTypeOfNumericBigintMin_InScope(typeOfNumericBigintMinList: Collection[Long]): Unit = {
        regINS(CK_INS, cTL(typeOfNumericBigintMinList), getCValueTypeOfNumericBigintMin(), "TYPE_OF_NUMERIC_BIGINT_MIN");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_NUMERIC_BIGINT_MIN: {DECIMAL(10)}
     * @param typeOfNumericBigintMinList The collection of typeOfNumericBigintMin as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    def setTypeOfNumericBigintMin_NotInScope(typeOfNumericBigintMinList: List[Long]): Unit = {
        doSetTypeOfNumericBigintMin_NotInScope(if (typeOfNumericBigintMinList != null) { typeOfNumericBigintMinList.map(_.asInstanceOf[Long]).asJava } else { null });
    }

    protected def doSetTypeOfNumericBigintMin_NotInScope(typeOfNumericBigintMinList: Collection[Long]): Unit = {
        regINS(CK_NINS, cTL(typeOfNumericBigintMinList), getCValueTypeOfNumericBigintMin(), "TYPE_OF_NUMERIC_BIGINT_MIN");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_BIGINT_MIN: {DECIMAL(10)}
     */
    def setTypeOfNumericBigintMin_IsNull(): Unit = { regTypeOfNumericBigintMin(CK_ISN, AbstractConditionQuery.DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_BIGINT_MIN: {DECIMAL(10)}
     */
    def setTypeOfNumericBigintMin_IsNotNull(): Unit = { regTypeOfNumericBigintMin(CK_ISNN, AbstractConditionQuery.DOBJ); }

    protected def regTypeOfNumericBigintMin(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValueTypeOfNumericBigintMin(), "TYPE_OF_NUMERIC_BIGINT_MIN"); }
    protected def getCValueTypeOfNumericBigintMin(): ConditionValue;

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_BIGINT_MAX: {DECIMAL(18)}
     * @param typeOfNumericBigintMax The value of typeOfNumericBigintMax as equal. (NullAllowed: if null, no condition)
     */
    def setTypeOfNumericBigintMax_Equal(typeOfNumericBigintMax: Long): Unit = {
        doSetTypeOfNumericBigintMax_Equal(typeOfNumericBigintMax);
    }

    protected def doSetTypeOfNumericBigintMax_Equal(typeOfNumericBigintMax: Long): Unit = {
        regTypeOfNumericBigintMax(CK_EQ, typeOfNumericBigintMax);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_BIGINT_MAX: {DECIMAL(18)}
     * @param typeOfNumericBigintMax The value of typeOfNumericBigintMax as notEqual. (NullAllowed: if null, no condition)
     */
    def setTypeOfNumericBigintMax_NotEqual(typeOfNumericBigintMax: Long): Unit = {
        doSetTypeOfNumericBigintMax_NotEqual(typeOfNumericBigintMax);
    }

    protected def doSetTypeOfNumericBigintMax_NotEqual(typeOfNumericBigintMax: Long): Unit = {
        regTypeOfNumericBigintMax(CK_NES, typeOfNumericBigintMax);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_BIGINT_MAX: {DECIMAL(18)}
     * @param typeOfNumericBigintMax The value of typeOfNumericBigintMax as greaterThan. (NullAllowed: if null, no condition)
     */
    def setTypeOfNumericBigintMax_GreaterThan(typeOfNumericBigintMax: Long): Unit = {
        regTypeOfNumericBigintMax(CK_GT, typeOfNumericBigintMax);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_BIGINT_MAX: {DECIMAL(18)}
     * @param typeOfNumericBigintMax The value of typeOfNumericBigintMax as lessThan. (NullAllowed: if null, no condition)
     */
    def setTypeOfNumericBigintMax_LessThan(typeOfNumericBigintMax: Long): Unit = {
        regTypeOfNumericBigintMax(CK_LT, typeOfNumericBigintMax);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_BIGINT_MAX: {DECIMAL(18)}
     * @param typeOfNumericBigintMax The value of typeOfNumericBigintMax as greaterEqual. (NullAllowed: if null, no condition)
     */
    def setTypeOfNumericBigintMax_GreaterEqual(typeOfNumericBigintMax: Long): Unit = {
        regTypeOfNumericBigintMax(CK_GE, typeOfNumericBigintMax);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_BIGINT_MAX: {DECIMAL(18)}
     * @param typeOfNumericBigintMax The value of typeOfNumericBigintMax as lessEqual. (NullAllowed: if null, no condition)
     */
    def setTypeOfNumericBigintMax_LessEqual(typeOfNumericBigintMax: Long): Unit = {
        regTypeOfNumericBigintMax(CK_LE, typeOfNumericBigintMax);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_BIGINT_MAX: {DECIMAL(18)}
     * @param minNumber The min number of typeOfNumericBigintMax. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of typeOfNumericBigintMax. (NullAllowed: if null, no to-condition)
     * @param optionCall The callback for option of range-of. (NotNull)
     */
    def setTypeOfNumericBigintMax_RangeOf(minNumber: Long, maxNumber: Long)(optionCall: (RangeOfOption) => Unit): Unit = {
        regROO(minNumber, maxNumber, getCValueTypeOfNumericBigintMax(), "TYPE_OF_NUMERIC_BIGINT_MAX", callbackROOP(optionCall));
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_NUMERIC_BIGINT_MAX: {DECIMAL(18)}
     * @param typeOfNumericBigintMaxList The collection of typeOfNumericBigintMax as inScope. (NullAllowed: if null (or empty), no condition)
     */
    def setTypeOfNumericBigintMax_InScope(typeOfNumericBigintMaxList: List[Long]): Unit = {
        doSetTypeOfNumericBigintMax_InScope(toMutableValueCollectionImplicitly(typeOfNumericBigintMaxList));
    }

    protected def doSetTypeOfNumericBigintMax_InScope(typeOfNumericBigintMaxList: Collection[Long]): Unit = {
        regINS(CK_INS, cTL(typeOfNumericBigintMaxList), getCValueTypeOfNumericBigintMax(), "TYPE_OF_NUMERIC_BIGINT_MAX");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_NUMERIC_BIGINT_MAX: {DECIMAL(18)}
     * @param typeOfNumericBigintMaxList The collection of typeOfNumericBigintMax as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    def setTypeOfNumericBigintMax_NotInScope(typeOfNumericBigintMaxList: List[Long]): Unit = {
        doSetTypeOfNumericBigintMax_NotInScope(if (typeOfNumericBigintMaxList != null) { typeOfNumericBigintMaxList.map(_.asInstanceOf[Long]).asJava } else { null });
    }

    protected def doSetTypeOfNumericBigintMax_NotInScope(typeOfNumericBigintMaxList: Collection[Long]): Unit = {
        regINS(CK_NINS, cTL(typeOfNumericBigintMaxList), getCValueTypeOfNumericBigintMax(), "TYPE_OF_NUMERIC_BIGINT_MAX");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_BIGINT_MAX: {DECIMAL(18)}
     */
    def setTypeOfNumericBigintMax_IsNull(): Unit = { regTypeOfNumericBigintMax(CK_ISN, AbstractConditionQuery.DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_BIGINT_MAX: {DECIMAL(18)}
     */
    def setTypeOfNumericBigintMax_IsNotNull(): Unit = { regTypeOfNumericBigintMax(CK_ISNN, AbstractConditionQuery.DOBJ); }

    protected def regTypeOfNumericBigintMax(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValueTypeOfNumericBigintMax(), "TYPE_OF_NUMERIC_BIGINT_MAX"); }
    protected def getCValueTypeOfNumericBigintMax(): ConditionValue;

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_SUPERINT_MIN: {DECIMAL(19)}
     * @param typeOfNumericSuperintMin The value of typeOfNumericSuperintMin as equal. (NullAllowed: if null, no condition)
     */
    def setTypeOfNumericSuperintMin_Equal(typeOfNumericSuperintMin: scala.math.BigDecimal): Unit = {
        doSetTypeOfNumericSuperintMin_Equal(typeOfNumericSuperintMin.underlying);
    }

    protected def doSetTypeOfNumericSuperintMin_Equal(typeOfNumericSuperintMin: java.math.BigDecimal): Unit = {
        regTypeOfNumericSuperintMin(CK_EQ, typeOfNumericSuperintMin);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_SUPERINT_MIN: {DECIMAL(19)}
     * @param typeOfNumericSuperintMin The value of typeOfNumericSuperintMin as notEqual. (NullAllowed: if null, no condition)
     */
    def setTypeOfNumericSuperintMin_NotEqual(typeOfNumericSuperintMin: scala.math.BigDecimal): Unit = {
        doSetTypeOfNumericSuperintMin_NotEqual(typeOfNumericSuperintMin.underlying);
    }

    protected def doSetTypeOfNumericSuperintMin_NotEqual(typeOfNumericSuperintMin: java.math.BigDecimal): Unit = {
        regTypeOfNumericSuperintMin(CK_NES, typeOfNumericSuperintMin);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_SUPERINT_MIN: {DECIMAL(19)}
     * @param typeOfNumericSuperintMin The value of typeOfNumericSuperintMin as greaterThan. (NullAllowed: if null, no condition)
     */
    def setTypeOfNumericSuperintMin_GreaterThan(typeOfNumericSuperintMin: scala.math.BigDecimal): Unit = {
        regTypeOfNumericSuperintMin(CK_GT, typeOfNumericSuperintMin.underlying);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_SUPERINT_MIN: {DECIMAL(19)}
     * @param typeOfNumericSuperintMin The value of typeOfNumericSuperintMin as lessThan. (NullAllowed: if null, no condition)
     */
    def setTypeOfNumericSuperintMin_LessThan(typeOfNumericSuperintMin: scala.math.BigDecimal): Unit = {
        regTypeOfNumericSuperintMin(CK_LT, typeOfNumericSuperintMin.underlying);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_SUPERINT_MIN: {DECIMAL(19)}
     * @param typeOfNumericSuperintMin The value of typeOfNumericSuperintMin as greaterEqual. (NullAllowed: if null, no condition)
     */
    def setTypeOfNumericSuperintMin_GreaterEqual(typeOfNumericSuperintMin: scala.math.BigDecimal): Unit = {
        regTypeOfNumericSuperintMin(CK_GE, typeOfNumericSuperintMin.underlying);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_SUPERINT_MIN: {DECIMAL(19)}
     * @param typeOfNumericSuperintMin The value of typeOfNumericSuperintMin as lessEqual. (NullAllowed: if null, no condition)
     */
    def setTypeOfNumericSuperintMin_LessEqual(typeOfNumericSuperintMin: scala.math.BigDecimal): Unit = {
        regTypeOfNumericSuperintMin(CK_LE, typeOfNumericSuperintMin.underlying);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_SUPERINT_MIN: {DECIMAL(19)}
     * @param minNumber The min number of typeOfNumericSuperintMin. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of typeOfNumericSuperintMin. (NullAllowed: if null, no to-condition)
     * @param optionCall The callback for option of range-of. (NotNull)
     */
    def setTypeOfNumericSuperintMin_RangeOf(minNumber: scala.math.BigDecimal, maxNumber: scala.math.BigDecimal)(optionCall: (RangeOfOption) => Unit): Unit = {
        regROO(minNumber, maxNumber, getCValueTypeOfNumericSuperintMin(), "TYPE_OF_NUMERIC_SUPERINT_MIN", callbackROOP(optionCall));
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_NUMERIC_SUPERINT_MIN: {DECIMAL(19)}
     * @param typeOfNumericSuperintMinList The collection of typeOfNumericSuperintMin as inScope. (NullAllowed: if null (or empty), no condition)
     */
    def setTypeOfNumericSuperintMin_InScope(typeOfNumericSuperintMinList: List[scala.math.BigDecimal]): Unit = {
        doSetTypeOfNumericSuperintMin_InScope(toMutableValueCollectionImplicitly(typeOfNumericSuperintMinList));
    }

    protected def doSetTypeOfNumericSuperintMin_InScope(typeOfNumericSuperintMinList: Collection[java.math.BigDecimal]): Unit = {
        regINS(CK_INS, cTL(typeOfNumericSuperintMinList), getCValueTypeOfNumericSuperintMin(), "TYPE_OF_NUMERIC_SUPERINT_MIN");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_NUMERIC_SUPERINT_MIN: {DECIMAL(19)}
     * @param typeOfNumericSuperintMinList The collection of typeOfNumericSuperintMin as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    def setTypeOfNumericSuperintMin_NotInScope(typeOfNumericSuperintMinList: List[scala.math.BigDecimal]): Unit = {
        doSetTypeOfNumericSuperintMin_NotInScope(if (typeOfNumericSuperintMinList != null) { typeOfNumericSuperintMinList.map(_.asInstanceOf[java.math.BigDecimal]).asJava } else { null });
    }

    protected def doSetTypeOfNumericSuperintMin_NotInScope(typeOfNumericSuperintMinList: Collection[java.math.BigDecimal]): Unit = {
        regINS(CK_NINS, cTL(typeOfNumericSuperintMinList), getCValueTypeOfNumericSuperintMin(), "TYPE_OF_NUMERIC_SUPERINT_MIN");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_SUPERINT_MIN: {DECIMAL(19)}
     */
    def setTypeOfNumericSuperintMin_IsNull(): Unit = { regTypeOfNumericSuperintMin(CK_ISN, AbstractConditionQuery.DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_SUPERINT_MIN: {DECIMAL(19)}
     */
    def setTypeOfNumericSuperintMin_IsNotNull(): Unit = { regTypeOfNumericSuperintMin(CK_ISNN, AbstractConditionQuery.DOBJ); }

    protected def regTypeOfNumericSuperintMin(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValueTypeOfNumericSuperintMin(), "TYPE_OF_NUMERIC_SUPERINT_MIN"); }
    protected def getCValueTypeOfNumericSuperintMin(): ConditionValue;

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_SUPERINT_MAX: {DECIMAL(38)}
     * @param typeOfNumericSuperintMax The value of typeOfNumericSuperintMax as equal. (NullAllowed: if null, no condition)
     */
    def setTypeOfNumericSuperintMax_Equal(typeOfNumericSuperintMax: scala.math.BigDecimal): Unit = {
        doSetTypeOfNumericSuperintMax_Equal(typeOfNumericSuperintMax.underlying);
    }

    protected def doSetTypeOfNumericSuperintMax_Equal(typeOfNumericSuperintMax: java.math.BigDecimal): Unit = {
        regTypeOfNumericSuperintMax(CK_EQ, typeOfNumericSuperintMax);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_SUPERINT_MAX: {DECIMAL(38)}
     * @param typeOfNumericSuperintMax The value of typeOfNumericSuperintMax as notEqual. (NullAllowed: if null, no condition)
     */
    def setTypeOfNumericSuperintMax_NotEqual(typeOfNumericSuperintMax: scala.math.BigDecimal): Unit = {
        doSetTypeOfNumericSuperintMax_NotEqual(typeOfNumericSuperintMax.underlying);
    }

    protected def doSetTypeOfNumericSuperintMax_NotEqual(typeOfNumericSuperintMax: java.math.BigDecimal): Unit = {
        regTypeOfNumericSuperintMax(CK_NES, typeOfNumericSuperintMax);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_SUPERINT_MAX: {DECIMAL(38)}
     * @param typeOfNumericSuperintMax The value of typeOfNumericSuperintMax as greaterThan. (NullAllowed: if null, no condition)
     */
    def setTypeOfNumericSuperintMax_GreaterThan(typeOfNumericSuperintMax: scala.math.BigDecimal): Unit = {
        regTypeOfNumericSuperintMax(CK_GT, typeOfNumericSuperintMax.underlying);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_SUPERINT_MAX: {DECIMAL(38)}
     * @param typeOfNumericSuperintMax The value of typeOfNumericSuperintMax as lessThan. (NullAllowed: if null, no condition)
     */
    def setTypeOfNumericSuperintMax_LessThan(typeOfNumericSuperintMax: scala.math.BigDecimal): Unit = {
        regTypeOfNumericSuperintMax(CK_LT, typeOfNumericSuperintMax.underlying);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_SUPERINT_MAX: {DECIMAL(38)}
     * @param typeOfNumericSuperintMax The value of typeOfNumericSuperintMax as greaterEqual. (NullAllowed: if null, no condition)
     */
    def setTypeOfNumericSuperintMax_GreaterEqual(typeOfNumericSuperintMax: scala.math.BigDecimal): Unit = {
        regTypeOfNumericSuperintMax(CK_GE, typeOfNumericSuperintMax.underlying);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_SUPERINT_MAX: {DECIMAL(38)}
     * @param typeOfNumericSuperintMax The value of typeOfNumericSuperintMax as lessEqual. (NullAllowed: if null, no condition)
     */
    def setTypeOfNumericSuperintMax_LessEqual(typeOfNumericSuperintMax: scala.math.BigDecimal): Unit = {
        regTypeOfNumericSuperintMax(CK_LE, typeOfNumericSuperintMax.underlying);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_SUPERINT_MAX: {DECIMAL(38)}
     * @param minNumber The min number of typeOfNumericSuperintMax. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of typeOfNumericSuperintMax. (NullAllowed: if null, no to-condition)
     * @param optionCall The callback for option of range-of. (NotNull)
     */
    def setTypeOfNumericSuperintMax_RangeOf(minNumber: scala.math.BigDecimal, maxNumber: scala.math.BigDecimal)(optionCall: (RangeOfOption) => Unit): Unit = {
        regROO(minNumber, maxNumber, getCValueTypeOfNumericSuperintMax(), "TYPE_OF_NUMERIC_SUPERINT_MAX", callbackROOP(optionCall));
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_NUMERIC_SUPERINT_MAX: {DECIMAL(38)}
     * @param typeOfNumericSuperintMaxList The collection of typeOfNumericSuperintMax as inScope. (NullAllowed: if null (or empty), no condition)
     */
    def setTypeOfNumericSuperintMax_InScope(typeOfNumericSuperintMaxList: List[scala.math.BigDecimal]): Unit = {
        doSetTypeOfNumericSuperintMax_InScope(toMutableValueCollectionImplicitly(typeOfNumericSuperintMaxList));
    }

    protected def doSetTypeOfNumericSuperintMax_InScope(typeOfNumericSuperintMaxList: Collection[java.math.BigDecimal]): Unit = {
        regINS(CK_INS, cTL(typeOfNumericSuperintMaxList), getCValueTypeOfNumericSuperintMax(), "TYPE_OF_NUMERIC_SUPERINT_MAX");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_NUMERIC_SUPERINT_MAX: {DECIMAL(38)}
     * @param typeOfNumericSuperintMaxList The collection of typeOfNumericSuperintMax as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    def setTypeOfNumericSuperintMax_NotInScope(typeOfNumericSuperintMaxList: List[scala.math.BigDecimal]): Unit = {
        doSetTypeOfNumericSuperintMax_NotInScope(if (typeOfNumericSuperintMaxList != null) { typeOfNumericSuperintMaxList.map(_.asInstanceOf[java.math.BigDecimal]).asJava } else { null });
    }

    protected def doSetTypeOfNumericSuperintMax_NotInScope(typeOfNumericSuperintMaxList: Collection[java.math.BigDecimal]): Unit = {
        regINS(CK_NINS, cTL(typeOfNumericSuperintMaxList), getCValueTypeOfNumericSuperintMax(), "TYPE_OF_NUMERIC_SUPERINT_MAX");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_SUPERINT_MAX: {DECIMAL(38)}
     */
    def setTypeOfNumericSuperintMax_IsNull(): Unit = { regTypeOfNumericSuperintMax(CK_ISN, AbstractConditionQuery.DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_SUPERINT_MAX: {DECIMAL(38)}
     */
    def setTypeOfNumericSuperintMax_IsNotNull(): Unit = { regTypeOfNumericSuperintMax(CK_ISNN, AbstractConditionQuery.DOBJ); }

    protected def regTypeOfNumericSuperintMax(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValueTypeOfNumericSuperintMax(), "TYPE_OF_NUMERIC_SUPERINT_MAX"); }
    protected def getCValueTypeOfNumericSuperintMax(): ConditionValue;

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_MAXDECIMAL: {DECIMAL(38, 38)}
     * @param typeOfNumericMaxdecimal The value of typeOfNumericMaxdecimal as equal. (NullAllowed: if null, no condition)
     */
    def setTypeOfNumericMaxdecimal_Equal(typeOfNumericMaxdecimal: scala.math.BigDecimal): Unit = {
        doSetTypeOfNumericMaxdecimal_Equal(typeOfNumericMaxdecimal.underlying);
    }

    protected def doSetTypeOfNumericMaxdecimal_Equal(typeOfNumericMaxdecimal: java.math.BigDecimal): Unit = {
        regTypeOfNumericMaxdecimal(CK_EQ, typeOfNumericMaxdecimal);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_MAXDECIMAL: {DECIMAL(38, 38)}
     * @param typeOfNumericMaxdecimal The value of typeOfNumericMaxdecimal as notEqual. (NullAllowed: if null, no condition)
     */
    def setTypeOfNumericMaxdecimal_NotEqual(typeOfNumericMaxdecimal: scala.math.BigDecimal): Unit = {
        doSetTypeOfNumericMaxdecimal_NotEqual(typeOfNumericMaxdecimal.underlying);
    }

    protected def doSetTypeOfNumericMaxdecimal_NotEqual(typeOfNumericMaxdecimal: java.math.BigDecimal): Unit = {
        regTypeOfNumericMaxdecimal(CK_NES, typeOfNumericMaxdecimal);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_MAXDECIMAL: {DECIMAL(38, 38)}
     * @param typeOfNumericMaxdecimal The value of typeOfNumericMaxdecimal as greaterThan. (NullAllowed: if null, no condition)
     */
    def setTypeOfNumericMaxdecimal_GreaterThan(typeOfNumericMaxdecimal: scala.math.BigDecimal): Unit = {
        regTypeOfNumericMaxdecimal(CK_GT, typeOfNumericMaxdecimal.underlying);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_MAXDECIMAL: {DECIMAL(38, 38)}
     * @param typeOfNumericMaxdecimal The value of typeOfNumericMaxdecimal as lessThan. (NullAllowed: if null, no condition)
     */
    def setTypeOfNumericMaxdecimal_LessThan(typeOfNumericMaxdecimal: scala.math.BigDecimal): Unit = {
        regTypeOfNumericMaxdecimal(CK_LT, typeOfNumericMaxdecimal.underlying);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_MAXDECIMAL: {DECIMAL(38, 38)}
     * @param typeOfNumericMaxdecimal The value of typeOfNumericMaxdecimal as greaterEqual. (NullAllowed: if null, no condition)
     */
    def setTypeOfNumericMaxdecimal_GreaterEqual(typeOfNumericMaxdecimal: scala.math.BigDecimal): Unit = {
        regTypeOfNumericMaxdecimal(CK_GE, typeOfNumericMaxdecimal.underlying);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_MAXDECIMAL: {DECIMAL(38, 38)}
     * @param typeOfNumericMaxdecimal The value of typeOfNumericMaxdecimal as lessEqual. (NullAllowed: if null, no condition)
     */
    def setTypeOfNumericMaxdecimal_LessEqual(typeOfNumericMaxdecimal: scala.math.BigDecimal): Unit = {
        regTypeOfNumericMaxdecimal(CK_LE, typeOfNumericMaxdecimal.underlying);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_MAXDECIMAL: {DECIMAL(38, 38)}
     * @param minNumber The min number of typeOfNumericMaxdecimal. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of typeOfNumericMaxdecimal. (NullAllowed: if null, no to-condition)
     * @param optionCall The callback for option of range-of. (NotNull)
     */
    def setTypeOfNumericMaxdecimal_RangeOf(minNumber: scala.math.BigDecimal, maxNumber: scala.math.BigDecimal)(optionCall: (RangeOfOption) => Unit): Unit = {
        regROO(minNumber, maxNumber, getCValueTypeOfNumericMaxdecimal(), "TYPE_OF_NUMERIC_MAXDECIMAL", callbackROOP(optionCall));
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_NUMERIC_MAXDECIMAL: {DECIMAL(38, 38)}
     * @param typeOfNumericMaxdecimalList The collection of typeOfNumericMaxdecimal as inScope. (NullAllowed: if null (or empty), no condition)
     */
    def setTypeOfNumericMaxdecimal_InScope(typeOfNumericMaxdecimalList: List[scala.math.BigDecimal]): Unit = {
        doSetTypeOfNumericMaxdecimal_InScope(toMutableValueCollectionImplicitly(typeOfNumericMaxdecimalList));
    }

    protected def doSetTypeOfNumericMaxdecimal_InScope(typeOfNumericMaxdecimalList: Collection[java.math.BigDecimal]): Unit = {
        regINS(CK_INS, cTL(typeOfNumericMaxdecimalList), getCValueTypeOfNumericMaxdecimal(), "TYPE_OF_NUMERIC_MAXDECIMAL");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_NUMERIC_MAXDECIMAL: {DECIMAL(38, 38)}
     * @param typeOfNumericMaxdecimalList The collection of typeOfNumericMaxdecimal as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    def setTypeOfNumericMaxdecimal_NotInScope(typeOfNumericMaxdecimalList: List[scala.math.BigDecimal]): Unit = {
        doSetTypeOfNumericMaxdecimal_NotInScope(if (typeOfNumericMaxdecimalList != null) { typeOfNumericMaxdecimalList.map(_.asInstanceOf[java.math.BigDecimal]).asJava } else { null });
    }

    protected def doSetTypeOfNumericMaxdecimal_NotInScope(typeOfNumericMaxdecimalList: Collection[java.math.BigDecimal]): Unit = {
        regINS(CK_NINS, cTL(typeOfNumericMaxdecimalList), getCValueTypeOfNumericMaxdecimal(), "TYPE_OF_NUMERIC_MAXDECIMAL");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_MAXDECIMAL: {DECIMAL(38, 38)}
     */
    def setTypeOfNumericMaxdecimal_IsNull(): Unit = { regTypeOfNumericMaxdecimal(CK_ISN, AbstractConditionQuery.DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_NUMERIC_MAXDECIMAL: {DECIMAL(38, 38)}
     */
    def setTypeOfNumericMaxdecimal_IsNotNull(): Unit = { regTypeOfNumericMaxdecimal(CK_ISNN, AbstractConditionQuery.DOBJ); }

    protected def regTypeOfNumericMaxdecimal(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValueTypeOfNumericMaxdecimal(), "TYPE_OF_NUMERIC_MAXDECIMAL"); }
    protected def getCValueTypeOfNumericMaxdecimal(): ConditionValue;

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_INTEGER: {INTEGER(10)}
     * @param typeOfInteger The value of typeOfInteger as equal. (NullAllowed: if null, no condition)
     */
    def setTypeOfInteger_Equal(typeOfInteger: Int): Unit = {
        doSetTypeOfInteger_Equal(typeOfInteger);
    }

    protected def doSetTypeOfInteger_Equal(typeOfInteger: Integer): Unit = {
        regTypeOfInteger(CK_EQ, typeOfInteger);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_INTEGER: {INTEGER(10)}
     * @param typeOfInteger The value of typeOfInteger as notEqual. (NullAllowed: if null, no condition)
     */
    def setTypeOfInteger_NotEqual(typeOfInteger: Int): Unit = {
        doSetTypeOfInteger_NotEqual(typeOfInteger);
    }

    protected def doSetTypeOfInteger_NotEqual(typeOfInteger: Integer): Unit = {
        regTypeOfInteger(CK_NES, typeOfInteger);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_INTEGER: {INTEGER(10)}
     * @param typeOfInteger The value of typeOfInteger as greaterThan. (NullAllowed: if null, no condition)
     */
    def setTypeOfInteger_GreaterThan(typeOfInteger: Int): Unit = {
        regTypeOfInteger(CK_GT, typeOfInteger);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_INTEGER: {INTEGER(10)}
     * @param typeOfInteger The value of typeOfInteger as lessThan. (NullAllowed: if null, no condition)
     */
    def setTypeOfInteger_LessThan(typeOfInteger: Int): Unit = {
        regTypeOfInteger(CK_LT, typeOfInteger);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_INTEGER: {INTEGER(10)}
     * @param typeOfInteger The value of typeOfInteger as greaterEqual. (NullAllowed: if null, no condition)
     */
    def setTypeOfInteger_GreaterEqual(typeOfInteger: Int): Unit = {
        regTypeOfInteger(CK_GE, typeOfInteger);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_INTEGER: {INTEGER(10)}
     * @param typeOfInteger The value of typeOfInteger as lessEqual. (NullAllowed: if null, no condition)
     */
    def setTypeOfInteger_LessEqual(typeOfInteger: Int): Unit = {
        regTypeOfInteger(CK_LE, typeOfInteger);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_INTEGER: {INTEGER(10)}
     * @param minNumber The min number of typeOfInteger. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of typeOfInteger. (NullAllowed: if null, no to-condition)
     * @param optionCall The callback for option of range-of. (NotNull)
     */
    def setTypeOfInteger_RangeOf(minNumber: Int, maxNumber: Int)(optionCall: (RangeOfOption) => Unit): Unit = {
        regROO(minNumber, maxNumber, getCValueTypeOfInteger(), "TYPE_OF_INTEGER", callbackROOP(optionCall));
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_INTEGER: {INTEGER(10)}
     * @param typeOfIntegerList The collection of typeOfInteger as inScope. (NullAllowed: if null (or empty), no condition)
     */
    def setTypeOfInteger_InScope(typeOfIntegerList: List[Int]): Unit = {
        doSetTypeOfInteger_InScope(toMutableValueCollectionImplicitly(typeOfIntegerList));
    }

    protected def doSetTypeOfInteger_InScope(typeOfIntegerList: Collection[Integer]): Unit = {
        regINS(CK_INS, cTL(typeOfIntegerList), getCValueTypeOfInteger(), "TYPE_OF_INTEGER");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_INTEGER: {INTEGER(10)}
     * @param typeOfIntegerList The collection of typeOfInteger as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    def setTypeOfInteger_NotInScope(typeOfIntegerList: List[Int]): Unit = {
        doSetTypeOfInteger_NotInScope(if (typeOfIntegerList != null) { typeOfIntegerList.map(_.asInstanceOf[Integer]).asJava } else { null });
    }

    protected def doSetTypeOfInteger_NotInScope(typeOfIntegerList: Collection[Integer]): Unit = {
        regINS(CK_NINS, cTL(typeOfIntegerList), getCValueTypeOfInteger(), "TYPE_OF_INTEGER");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_INTEGER: {INTEGER(10)}
     */
    def setTypeOfInteger_IsNull(): Unit = { regTypeOfInteger(CK_ISN, AbstractConditionQuery.DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_INTEGER: {INTEGER(10)}
     */
    def setTypeOfInteger_IsNotNull(): Unit = { regTypeOfInteger(CK_ISNN, AbstractConditionQuery.DOBJ); }

    protected def regTypeOfInteger(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValueTypeOfInteger(), "TYPE_OF_INTEGER"); }
    protected def getCValueTypeOfInteger(): ConditionValue;

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_BIGINT: {BIGINT(19)}
     * @param typeOfBigint The value of typeOfBigint as equal. (NullAllowed: if null, no condition)
     */
    def setTypeOfBigint_Equal(typeOfBigint: Long): Unit = {
        doSetTypeOfBigint_Equal(typeOfBigint);
    }

    protected def doSetTypeOfBigint_Equal(typeOfBigint: Long): Unit = {
        regTypeOfBigint(CK_EQ, typeOfBigint);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_BIGINT: {BIGINT(19)}
     * @param typeOfBigint The value of typeOfBigint as notEqual. (NullAllowed: if null, no condition)
     */
    def setTypeOfBigint_NotEqual(typeOfBigint: Long): Unit = {
        doSetTypeOfBigint_NotEqual(typeOfBigint);
    }

    protected def doSetTypeOfBigint_NotEqual(typeOfBigint: Long): Unit = {
        regTypeOfBigint(CK_NES, typeOfBigint);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_BIGINT: {BIGINT(19)}
     * @param typeOfBigint The value of typeOfBigint as greaterThan. (NullAllowed: if null, no condition)
     */
    def setTypeOfBigint_GreaterThan(typeOfBigint: Long): Unit = {
        regTypeOfBigint(CK_GT, typeOfBigint);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_BIGINT: {BIGINT(19)}
     * @param typeOfBigint The value of typeOfBigint as lessThan. (NullAllowed: if null, no condition)
     */
    def setTypeOfBigint_LessThan(typeOfBigint: Long): Unit = {
        regTypeOfBigint(CK_LT, typeOfBigint);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_BIGINT: {BIGINT(19)}
     * @param typeOfBigint The value of typeOfBigint as greaterEqual. (NullAllowed: if null, no condition)
     */
    def setTypeOfBigint_GreaterEqual(typeOfBigint: Long): Unit = {
        regTypeOfBigint(CK_GE, typeOfBigint);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_BIGINT: {BIGINT(19)}
     * @param typeOfBigint The value of typeOfBigint as lessEqual. (NullAllowed: if null, no condition)
     */
    def setTypeOfBigint_LessEqual(typeOfBigint: Long): Unit = {
        regTypeOfBigint(CK_LE, typeOfBigint);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_BIGINT: {BIGINT(19)}
     * @param minNumber The min number of typeOfBigint. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of typeOfBigint. (NullAllowed: if null, no to-condition)
     * @param optionCall The callback for option of range-of. (NotNull)
     */
    def setTypeOfBigint_RangeOf(minNumber: Long, maxNumber: Long)(optionCall: (RangeOfOption) => Unit): Unit = {
        regROO(minNumber, maxNumber, getCValueTypeOfBigint(), "TYPE_OF_BIGINT", callbackROOP(optionCall));
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_BIGINT: {BIGINT(19)}
     * @param typeOfBigintList The collection of typeOfBigint as inScope. (NullAllowed: if null (or empty), no condition)
     */
    def setTypeOfBigint_InScope(typeOfBigintList: List[Long]): Unit = {
        doSetTypeOfBigint_InScope(toMutableValueCollectionImplicitly(typeOfBigintList));
    }

    protected def doSetTypeOfBigint_InScope(typeOfBigintList: Collection[Long]): Unit = {
        regINS(CK_INS, cTL(typeOfBigintList), getCValueTypeOfBigint(), "TYPE_OF_BIGINT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_BIGINT: {BIGINT(19)}
     * @param typeOfBigintList The collection of typeOfBigint as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    def setTypeOfBigint_NotInScope(typeOfBigintList: List[Long]): Unit = {
        doSetTypeOfBigint_NotInScope(if (typeOfBigintList != null) { typeOfBigintList.map(_.asInstanceOf[Long]).asJava } else { null });
    }

    protected def doSetTypeOfBigint_NotInScope(typeOfBigintList: Collection[Long]): Unit = {
        regINS(CK_NINS, cTL(typeOfBigintList), getCValueTypeOfBigint(), "TYPE_OF_BIGINT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_BIGINT: {BIGINT(19)}
     */
    def setTypeOfBigint_IsNull(): Unit = { regTypeOfBigint(CK_ISN, AbstractConditionQuery.DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_BIGINT: {BIGINT(19)}
     */
    def setTypeOfBigint_IsNotNull(): Unit = { regTypeOfBigint(CK_ISNN, AbstractConditionQuery.DOBJ); }

    protected def regTypeOfBigint(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValueTypeOfBigint(), "TYPE_OF_BIGINT"); }
    protected def getCValueTypeOfBigint(): ConditionValue;

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_DATE: {DATE(8)}
     * @param typeOfDate The value of typeOfDate as equal. (NullAllowed: if null, no condition)
     */
    def setTypeOfDate_Equal(typeOfDate: org.joda.time.LocalDate): Unit = {
        regTypeOfDate(CK_EQ,  typeOfDate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_DATE: {DATE(8)}
     * @param typeOfDate The value of typeOfDate as greaterThan. (NullAllowed: if null, no condition)
     */
    def setTypeOfDate_GreaterThan(typeOfDate: org.joda.time.LocalDate): Unit = {
        regTypeOfDate(CK_GT,  typeOfDate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_DATE: {DATE(8)}
     * @param typeOfDate The value of typeOfDate as lessThan. (NullAllowed: if null, no condition)
     */
    def setTypeOfDate_LessThan(typeOfDate: org.joda.time.LocalDate): Unit = {
        regTypeOfDate(CK_LT,  typeOfDate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_DATE: {DATE(8)}
     * @param typeOfDate The value of typeOfDate as greaterEqual. (NullAllowed: if null, no condition)
     */
    def setTypeOfDate_GreaterEqual(typeOfDate: org.joda.time.LocalDate): Unit = {
        regTypeOfDate(CK_GE,  typeOfDate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_DATE: {DATE(8)}
     * @param typeOfDate The value of typeOfDate as lessEqual. (NullAllowed: if null, no condition)
     */
    def setTypeOfDate_LessEqual(typeOfDate: org.joda.time.LocalDate): Unit = {
        regTypeOfDate(CK_LE, typeOfDate);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_DATE: {DATE(8)}
     * <pre>e.g. setTypeOfDate_FromTo(fromDate, toDate, new <span style="color: #DD4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of typeOfDate. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of typeOfDate. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    def setTypeOfDate_FromTo(fromDatetime: org.joda.time.LocalDate, toDatetime: org.joda.time.LocalDate)(optionCall: (ScrFromToOption) => Unit): Unit = {
        regFTQ(toUtilDate(fromDatetime), toUtilDate(toDatetime), getCValueTypeOfDate(), "TYPE_OF_DATE", callbackFTOP(optionCall));
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_DATE: {DATE(8)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #DD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of typeOfDate. (NullAllowed: if null, no from-condition)
     * @param toDate The to-date(yyyy/MM/dd) of typeOfDate. (NullAllowed: if null, no to-condition)
     */
    def setTypeOfDate_DateFromTo(fromDate: org.joda.time.LocalDate, toDate: org.joda.time.LocalDate): Unit = {
        setTypeOfDate_FromTo(fromDate, toDate)(_.compareAsDate);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_DATE: {DATE(8)}
     */
    def setTypeOfDate_IsNull(): Unit = { regTypeOfDate(CK_ISN, AbstractConditionQuery.DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_DATE: {DATE(8)}
     */
    def setTypeOfDate_IsNotNull(): Unit = { regTypeOfDate(CK_ISNN, AbstractConditionQuery.DOBJ); }

    protected def regTypeOfDate(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValueTypeOfDate(), "TYPE_OF_DATE"); }
    protected def getCValueTypeOfDate(): ConditionValue;

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_TIMESTAMP: {TIMESTAMP(23, 10)}
     * @param typeOfTimestamp The value of typeOfTimestamp as equal. (NullAllowed: if null, no condition)
     */
    def setTypeOfTimestamp_Equal(typeOfTimestamp: org.joda.time.LocalDateTime): Unit = {
        regTypeOfTimestamp(CK_EQ,  typeOfTimestamp);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_TIMESTAMP: {TIMESTAMP(23, 10)}
     * @param typeOfTimestamp The value of typeOfTimestamp as greaterThan. (NullAllowed: if null, no condition)
     */
    def setTypeOfTimestamp_GreaterThan(typeOfTimestamp: org.joda.time.LocalDateTime): Unit = {
        regTypeOfTimestamp(CK_GT,  typeOfTimestamp);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_TIMESTAMP: {TIMESTAMP(23, 10)}
     * @param typeOfTimestamp The value of typeOfTimestamp as lessThan. (NullAllowed: if null, no condition)
     */
    def setTypeOfTimestamp_LessThan(typeOfTimestamp: org.joda.time.LocalDateTime): Unit = {
        regTypeOfTimestamp(CK_LT,  typeOfTimestamp);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_TIMESTAMP: {TIMESTAMP(23, 10)}
     * @param typeOfTimestamp The value of typeOfTimestamp as greaterEqual. (NullAllowed: if null, no condition)
     */
    def setTypeOfTimestamp_GreaterEqual(typeOfTimestamp: org.joda.time.LocalDateTime): Unit = {
        regTypeOfTimestamp(CK_GE,  typeOfTimestamp);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_TIMESTAMP: {TIMESTAMP(23, 10)}
     * @param typeOfTimestamp The value of typeOfTimestamp as lessEqual. (NullAllowed: if null, no condition)
     */
    def setTypeOfTimestamp_LessEqual(typeOfTimestamp: org.joda.time.LocalDateTime): Unit = {
        regTypeOfTimestamp(CK_LE, typeOfTimestamp);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_TIMESTAMP: {TIMESTAMP(23, 10)}
     * <pre>e.g. setTypeOfTimestamp_FromTo(fromDate, toDate, new <span style="color: #DD4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of typeOfTimestamp. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of typeOfTimestamp. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    def setTypeOfTimestamp_FromTo(fromDatetime: org.joda.time.LocalDateTime, toDatetime: org.joda.time.LocalDateTime)(optionCall: (ScrFromToOption) => Unit): Unit = {
        regFTQ(toTimestamp(fromDatetime), toTimestamp(toDatetime), getCValueTypeOfTimestamp(), "TYPE_OF_TIMESTAMP", callbackFTOP(optionCall));
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_TIMESTAMP: {TIMESTAMP(23, 10)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #DD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of typeOfTimestamp. (NullAllowed: if null, no from-condition)
     * @param toDate The to-date(yyyy/MM/dd) of typeOfTimestamp. (NullAllowed: if null, no to-condition)
     */
    def setTypeOfTimestamp_DateFromTo(fromDate: org.joda.time.LocalDateTime, toDate: org.joda.time.LocalDateTime): Unit = {
        setTypeOfTimestamp_FromTo(fromDate, toDate)(_.compareAsDate);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_TIMESTAMP: {TIMESTAMP(23, 10)}
     */
    def setTypeOfTimestamp_IsNull(): Unit = { regTypeOfTimestamp(CK_ISN, AbstractConditionQuery.DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_TIMESTAMP: {TIMESTAMP(23, 10)}
     */
    def setTypeOfTimestamp_IsNotNull(): Unit = { regTypeOfTimestamp(CK_ISNN, AbstractConditionQuery.DOBJ); }

    protected def regTypeOfTimestamp(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValueTypeOfTimestamp(), "TYPE_OF_TIMESTAMP"); }
    protected def getCValueTypeOfTimestamp(): ConditionValue;

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_TIME: {TIME(6)}
     * @param typeOfTime The value of typeOfTime as equal. (NullAllowed: if null, no condition)
     */
    def setTypeOfTime_Equal(typeOfTime: org.joda.time.LocalTime): Unit = {
        regTypeOfTime(CK_EQ,  typeOfTime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_TIME: {TIME(6)}
     * @param typeOfTime The value of typeOfTime as greaterThan. (NullAllowed: if null, no condition)
     */
    def setTypeOfTime_GreaterThan(typeOfTime: org.joda.time.LocalTime): Unit = {
        regTypeOfTime(CK_GT,  typeOfTime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_TIME: {TIME(6)}
     * @param typeOfTime The value of typeOfTime as lessThan. (NullAllowed: if null, no condition)
     */
    def setTypeOfTime_LessThan(typeOfTime: org.joda.time.LocalTime): Unit = {
        regTypeOfTime(CK_LT,  typeOfTime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_TIME: {TIME(6)}
     * @param typeOfTime The value of typeOfTime as greaterEqual. (NullAllowed: if null, no condition)
     */
    def setTypeOfTime_GreaterEqual(typeOfTime: org.joda.time.LocalTime): Unit = {
        regTypeOfTime(CK_GE,  typeOfTime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_TIME: {TIME(6)}
     * @param typeOfTime The value of typeOfTime as lessEqual. (NullAllowed: if null, no condition)
     */
    def setTypeOfTime_LessEqual(typeOfTime: org.joda.time.LocalTime): Unit = {
        regTypeOfTime(CK_LE, typeOfTime);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_TIME: {TIME(6)}
     */
    def setTypeOfTime_IsNull(): Unit = { regTypeOfTime(CK_ISN, AbstractConditionQuery.DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_TIME: {TIME(6)}
     */
    def setTypeOfTime_IsNotNull(): Unit = { regTypeOfTime(CK_ISNN, AbstractConditionQuery.DOBJ); }

    protected def regTypeOfTime(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValueTypeOfTime(), "TYPE_OF_TIME"); }
    protected def getCValueTypeOfTime(): ConditionValue;

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_BOOLEAN: {BOOLEAN(1)}
     * @param typeOfBoolean The value of typeOfBoolean as equal. (NullAllowed: if null, no condition)
     */
    def setTypeOfBoolean_Equal(typeOfBoolean: Boolean): Unit = {
        regTypeOfBoolean(CK_EQ, typeOfBoolean);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_BOOLEAN: {BOOLEAN(1)}
     */
    def setTypeOfBoolean_IsNull(): Unit = { regTypeOfBoolean(CK_ISN, AbstractConditionQuery.DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_BOOLEAN: {BOOLEAN(1)}
     */
    def setTypeOfBoolean_IsNotNull(): Unit = { regTypeOfBoolean(CK_ISNN, AbstractConditionQuery.DOBJ); }

    protected def regTypeOfBoolean(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValueTypeOfBoolean(), "TYPE_OF_BOOLEAN"); }
    protected def getCValueTypeOfBoolean(): ConditionValue;


    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_BINARY: {VARBINARY(2147483647)}
     */
    def setTypeOfBinary_IsNull(): Unit = { regTypeOfBinary(CK_ISN, AbstractConditionQuery.DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_BINARY: {VARBINARY(2147483647)}
     */
    def setTypeOfBinary_IsNotNull(): Unit = { regTypeOfBinary(CK_ISNN, AbstractConditionQuery.DOBJ); }

    protected def regTypeOfBinary(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValueTypeOfBinary(), "TYPE_OF_BINARY"); }
    protected def getCValueTypeOfBinary(): ConditionValue;


    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_BLOB: {BLOB(2147483647)}
     */
    def setTypeOfBlob_IsNull(): Unit = { regTypeOfBlob(CK_ISN, AbstractConditionQuery.DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_BLOB: {BLOB(2147483647)}
     */
    def setTypeOfBlob_IsNotNull(): Unit = { regTypeOfBlob(CK_ISNN, AbstractConditionQuery.DOBJ); }

    protected def regTypeOfBlob(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValueTypeOfBlob(), "TYPE_OF_BLOB"); }
    protected def getCValueTypeOfBlob(): ConditionValue;


    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_UUID: {UUID(2147483647)}
     */
    def setTypeOfUuid_IsNull(): Unit = { regTypeOfUuid(CK_ISN, AbstractConditionQuery.DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_UUID: {UUID(2147483647)}
     */
    def setTypeOfUuid_IsNotNull(): Unit = { regTypeOfUuid(CK_ISNN, AbstractConditionQuery.DOBJ); }

    protected def regTypeOfUuid(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValueTypeOfUuid(), "TYPE_OF_UUID"); }
    protected def getCValueTypeOfUuid(): ConditionValue;

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_ARRAY: {ARRAY}
     * @param typeOfArray The value of typeOfArray as equal. (NullAllowed: if null (or empty), no condition)
     */
    def setTypeOfArray_Equal(typeOfArray: String): Unit = {
        doSetTypeOfArray_Equal(fRES(typeOfArray));
    }

    protected def doSetTypeOfArray_Equal(typeOfArray: String): Unit = {
        regTypeOfArray(CK_EQ, typeOfArray);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_ARRAY: {ARRAY}
     * @param typeOfArray The value of typeOfArray as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    def setTypeOfArray_NotEqual(typeOfArray: String): Unit = {
        doSetTypeOfArray_NotEqual(fRES(typeOfArray));
    }

    protected def doSetTypeOfArray_NotEqual(typeOfArray: String): Unit = {
        regTypeOfArray(CK_NES, typeOfArray);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_ARRAY: {ARRAY}
     * @param typeOfArrayList The collection of typeOfArray as inScope. (NullAllowed: if null (or empty), no condition)
     */
    def setTypeOfArray_InScope(typeOfArrayList: List[String]): Unit = {
        doSetTypeOfArray_InScope(toMutableValueCollectionImplicitly(typeOfArrayList));
    }

    protected def doSetTypeOfArray_InScope(typeOfArrayList: Collection[String]): Unit = {
        regINS(CK_INS, cTL(typeOfArrayList), getCValueTypeOfArray(), "TYPE_OF_ARRAY");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_ARRAY: {ARRAY}
     * @param typeOfArrayList The collection of typeOfArray as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    def setTypeOfArray_NotInScope(typeOfArrayList: List[String]): Unit = {
        doSetTypeOfArray_NotInScope(if (typeOfArrayList != null) { typeOfArrayList.map(_.asInstanceOf[String]).asJava } else { null });
    }

    protected def doSetTypeOfArray_NotInScope(typeOfArrayList: Collection[String]): Unit = {
        regINS(CK_NINS, cTL(typeOfArrayList), getCValueTypeOfArray(), "TYPE_OF_ARRAY");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TYPE_OF_ARRAY: {ARRAY}
     * @param typeOfArray The value of typeOfArray as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    def setTypeOfArray_PrefixSearch(typeOfArray: String): Unit = {
        setTypeOfArray_LikeSearch(typeOfArray)(_.likePrefix);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TYPE_OF_ARRAY: {ARRAY} <br />
     * <pre>e.g. setTypeOfArray_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param typeOfArray The value of typeOfArray as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param optionCall The callback for option of like-search. (NotNull)
     */
    def setTypeOfArray_LikeSearch(typeOfArray: String)(optionCall: (ScrLikeSearchOption) => Unit): Unit = {
        regLSQ(CK_LS, fRES(typeOfArray), getCValueTypeOfArray(), "TYPE_OF_ARRAY", callbackLSOP(optionCall));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TYPE_OF_ARRAY: {ARRAY}
     * @param typeOfArray The value of typeOfArray as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param optionCall The callback for option of not-like-search. (NotNull)
     */
    def setTypeOfArray_NotLikeSearch(typeOfArray: String)(optionCall: (ScrLikeSearchOption) => Unit): Unit = {
        regLSQ(CK_NLS, fRES(typeOfArray), getCValueTypeOfArray(), "TYPE_OF_ARRAY", callbackLSOP(optionCall));
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_ARRAY: {ARRAY}
     */
    def setTypeOfArray_IsNull(): Unit = { regTypeOfArray(CK_ISN, AbstractConditionQuery.DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * TYPE_OF_ARRAY: {ARRAY}
     */
    def setTypeOfArray_IsNullOrEmpty(): Unit = { regTypeOfArray(CK_ISNOE, AbstractConditionQuery.DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_ARRAY: {ARRAY}
     */
    def setTypeOfArray_IsNotNull(): Unit = { regTypeOfArray(CK_ISNN, AbstractConditionQuery.DOBJ); }

    protected def regTypeOfArray(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValueTypeOfArray(), "TYPE_OF_ARRAY"); }
    protected def getCValueTypeOfArray(): ConditionValue;

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_OTHER: {OTHER(2147483647)}
     * @param typeOfOther The value of typeOfOther as equal. (NullAllowed: if null (or empty), no condition)
     */
    def setTypeOfOther_Equal(typeOfOther: String): Unit = {
        doSetTypeOfOther_Equal(fRES(typeOfOther));
    }

    protected def doSetTypeOfOther_Equal(typeOfOther: String): Unit = {
        regTypeOfOther(CK_EQ, typeOfOther);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_OTHER: {OTHER(2147483647)}
     * @param typeOfOther The value of typeOfOther as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    def setTypeOfOther_NotEqual(typeOfOther: String): Unit = {
        doSetTypeOfOther_NotEqual(fRES(typeOfOther));
    }

    protected def doSetTypeOfOther_NotEqual(typeOfOther: String): Unit = {
        regTypeOfOther(CK_NES, typeOfOther);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_OTHER: {OTHER(2147483647)}
     * @param typeOfOtherList The collection of typeOfOther as inScope. (NullAllowed: if null (or empty), no condition)
     */
    def setTypeOfOther_InScope(typeOfOtherList: List[String]): Unit = {
        doSetTypeOfOther_InScope(toMutableValueCollectionImplicitly(typeOfOtherList));
    }

    protected def doSetTypeOfOther_InScope(typeOfOtherList: Collection[String]): Unit = {
        regINS(CK_INS, cTL(typeOfOtherList), getCValueTypeOfOther(), "TYPE_OF_OTHER");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_OTHER: {OTHER(2147483647)}
     * @param typeOfOtherList The collection of typeOfOther as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    def setTypeOfOther_NotInScope(typeOfOtherList: List[String]): Unit = {
        doSetTypeOfOther_NotInScope(if (typeOfOtherList != null) { typeOfOtherList.map(_.asInstanceOf[String]).asJava } else { null });
    }

    protected def doSetTypeOfOther_NotInScope(typeOfOtherList: Collection[String]): Unit = {
        regINS(CK_NINS, cTL(typeOfOtherList), getCValueTypeOfOther(), "TYPE_OF_OTHER");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TYPE_OF_OTHER: {OTHER(2147483647)}
     * @param typeOfOther The value of typeOfOther as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    def setTypeOfOther_PrefixSearch(typeOfOther: String): Unit = {
        setTypeOfOther_LikeSearch(typeOfOther)(_.likePrefix);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TYPE_OF_OTHER: {OTHER(2147483647)} <br />
     * <pre>e.g. setTypeOfOther_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param typeOfOther The value of typeOfOther as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param optionCall The callback for option of like-search. (NotNull)
     */
    def setTypeOfOther_LikeSearch(typeOfOther: String)(optionCall: (ScrLikeSearchOption) => Unit): Unit = {
        regLSQ(CK_LS, fRES(typeOfOther), getCValueTypeOfOther(), "TYPE_OF_OTHER", callbackLSOP(optionCall));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TYPE_OF_OTHER: {OTHER(2147483647)}
     * @param typeOfOther The value of typeOfOther as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param optionCall The callback for option of not-like-search. (NotNull)
     */
    def setTypeOfOther_NotLikeSearch(typeOfOther: String)(optionCall: (ScrLikeSearchOption) => Unit): Unit = {
        regLSQ(CK_NLS, fRES(typeOfOther), getCValueTypeOfOther(), "TYPE_OF_OTHER", callbackLSOP(optionCall));
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_OTHER: {OTHER(2147483647)}
     */
    def setTypeOfOther_IsNull(): Unit = { regTypeOfOther(CK_ISN, AbstractConditionQuery.DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * TYPE_OF_OTHER: {OTHER(2147483647)}
     */
    def setTypeOfOther_IsNullOrEmpty(): Unit = { regTypeOfOther(CK_ISNOE, AbstractConditionQuery.DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_OTHER: {OTHER(2147483647)}
     */
    def setTypeOfOther_IsNotNull(): Unit = { regTypeOfOther(CK_ISNN, AbstractConditionQuery.DOBJ); }

    protected def regTypeOfOther(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValueTypeOfOther(), "TYPE_OF_OTHER"); }
    protected def getCValueTypeOfOther(): ConditionValue;

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * J_A_V_A_BEANS_PROPERTY: {VARCHAR(10)}
     * @param jAVABeansProperty The value of jAVABeansProperty as equal. (NullAllowed: if null (or empty), no condition)
     */
    def setJAVABeansProperty_Equal(jAVABeansProperty: String): Unit = {
        doSetJAVABeansProperty_Equal(fRES(jAVABeansProperty));
    }

    protected def doSetJAVABeansProperty_Equal(jAVABeansProperty: String): Unit = {
        regJAVABeansProperty(CK_EQ, jAVABeansProperty);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * J_A_V_A_BEANS_PROPERTY: {VARCHAR(10)}
     * @param jAVABeansProperty The value of jAVABeansProperty as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    def setJAVABeansProperty_NotEqual(jAVABeansProperty: String): Unit = {
        doSetJAVABeansProperty_NotEqual(fRES(jAVABeansProperty));
    }

    protected def doSetJAVABeansProperty_NotEqual(jAVABeansProperty: String): Unit = {
        regJAVABeansProperty(CK_NES, jAVABeansProperty);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * J_A_V_A_BEANS_PROPERTY: {VARCHAR(10)}
     * @param jAVABeansPropertyList The collection of jAVABeansProperty as inScope. (NullAllowed: if null (or empty), no condition)
     */
    def setJAVABeansProperty_InScope(jAVABeansPropertyList: List[String]): Unit = {
        doSetJAVABeansProperty_InScope(toMutableValueCollectionImplicitly(jAVABeansPropertyList));
    }

    protected def doSetJAVABeansProperty_InScope(jAVABeansPropertyList: Collection[String]): Unit = {
        regINS(CK_INS, cTL(jAVABeansPropertyList), getCValueJAVABeansProperty(), "J_A_V_A_BEANS_PROPERTY");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * J_A_V_A_BEANS_PROPERTY: {VARCHAR(10)}
     * @param jAVABeansPropertyList The collection of jAVABeansProperty as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    def setJAVABeansProperty_NotInScope(jAVABeansPropertyList: List[String]): Unit = {
        doSetJAVABeansProperty_NotInScope(if (jAVABeansPropertyList != null) { jAVABeansPropertyList.map(_.asInstanceOf[String]).asJava } else { null });
    }

    protected def doSetJAVABeansProperty_NotInScope(jAVABeansPropertyList: Collection[String]): Unit = {
        regINS(CK_NINS, cTL(jAVABeansPropertyList), getCValueJAVABeansProperty(), "J_A_V_A_BEANS_PROPERTY");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * J_A_V_A_BEANS_PROPERTY: {VARCHAR(10)}
     * @param jAVABeansProperty The value of jAVABeansProperty as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    def setJAVABeansProperty_PrefixSearch(jAVABeansProperty: String): Unit = {
        setJAVABeansProperty_LikeSearch(jAVABeansProperty)(_.likePrefix);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * J_A_V_A_BEANS_PROPERTY: {VARCHAR(10)} <br />
     * <pre>e.g. setJAVABeansProperty_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param jAVABeansProperty The value of jAVABeansProperty as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param optionCall The callback for option of like-search. (NotNull)
     */
    def setJAVABeansProperty_LikeSearch(jAVABeansProperty: String)(optionCall: (ScrLikeSearchOption) => Unit): Unit = {
        regLSQ(CK_LS, fRES(jAVABeansProperty), getCValueJAVABeansProperty(), "J_A_V_A_BEANS_PROPERTY", callbackLSOP(optionCall));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * J_A_V_A_BEANS_PROPERTY: {VARCHAR(10)}
     * @param jAVABeansProperty The value of jAVABeansProperty as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param optionCall The callback for option of not-like-search. (NotNull)
     */
    def setJAVABeansProperty_NotLikeSearch(jAVABeansProperty: String)(optionCall: (ScrLikeSearchOption) => Unit): Unit = {
        regLSQ(CK_NLS, fRES(jAVABeansProperty), getCValueJAVABeansProperty(), "J_A_V_A_BEANS_PROPERTY", callbackLSOP(optionCall));
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * J_A_V_A_BEANS_PROPERTY: {VARCHAR(10)}
     */
    def setJAVABeansProperty_IsNull(): Unit = { regJAVABeansProperty(CK_ISN, AbstractConditionQuery.DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * J_A_V_A_BEANS_PROPERTY: {VARCHAR(10)}
     */
    def setJAVABeansProperty_IsNullOrEmpty(): Unit = { regJAVABeansProperty(CK_ISNOE, AbstractConditionQuery.DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * J_A_V_A_BEANS_PROPERTY: {VARCHAR(10)}
     */
    def setJAVABeansProperty_IsNotNull(): Unit = { regJAVABeansProperty(CK_ISNN, AbstractConditionQuery.DOBJ); }

    protected def regJAVABeansProperty(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValueJAVABeansProperty(), "J_A_V_A_BEANS_PROPERTY"); }
    protected def getCValueJAVABeansProperty(): ConditionValue;

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * J_POP_BEANS_PROPERTY: {VARCHAR(10)}
     * @param jPopBeansProperty The value of jPopBeansProperty as equal. (NullAllowed: if null (or empty), no condition)
     */
    def setJPopBeansProperty_Equal(jPopBeansProperty: String): Unit = {
        doSetJPopBeansProperty_Equal(fRES(jPopBeansProperty));
    }

    protected def doSetJPopBeansProperty_Equal(jPopBeansProperty: String): Unit = {
        regJPopBeansProperty(CK_EQ, jPopBeansProperty);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * J_POP_BEANS_PROPERTY: {VARCHAR(10)}
     * @param jPopBeansProperty The value of jPopBeansProperty as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    def setJPopBeansProperty_NotEqual(jPopBeansProperty: String): Unit = {
        doSetJPopBeansProperty_NotEqual(fRES(jPopBeansProperty));
    }

    protected def doSetJPopBeansProperty_NotEqual(jPopBeansProperty: String): Unit = {
        regJPopBeansProperty(CK_NES, jPopBeansProperty);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * J_POP_BEANS_PROPERTY: {VARCHAR(10)}
     * @param jPopBeansPropertyList The collection of jPopBeansProperty as inScope. (NullAllowed: if null (or empty), no condition)
     */
    def setJPopBeansProperty_InScope(jPopBeansPropertyList: List[String]): Unit = {
        doSetJPopBeansProperty_InScope(toMutableValueCollectionImplicitly(jPopBeansPropertyList));
    }

    protected def doSetJPopBeansProperty_InScope(jPopBeansPropertyList: Collection[String]): Unit = {
        regINS(CK_INS, cTL(jPopBeansPropertyList), getCValueJPopBeansProperty(), "J_POP_BEANS_PROPERTY");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * J_POP_BEANS_PROPERTY: {VARCHAR(10)}
     * @param jPopBeansPropertyList The collection of jPopBeansProperty as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    def setJPopBeansProperty_NotInScope(jPopBeansPropertyList: List[String]): Unit = {
        doSetJPopBeansProperty_NotInScope(if (jPopBeansPropertyList != null) { jPopBeansPropertyList.map(_.asInstanceOf[String]).asJava } else { null });
    }

    protected def doSetJPopBeansProperty_NotInScope(jPopBeansPropertyList: Collection[String]): Unit = {
        regINS(CK_NINS, cTL(jPopBeansPropertyList), getCValueJPopBeansProperty(), "J_POP_BEANS_PROPERTY");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * J_POP_BEANS_PROPERTY: {VARCHAR(10)}
     * @param jPopBeansProperty The value of jPopBeansProperty as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    def setJPopBeansProperty_PrefixSearch(jPopBeansProperty: String): Unit = {
        setJPopBeansProperty_LikeSearch(jPopBeansProperty)(_.likePrefix);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * J_POP_BEANS_PROPERTY: {VARCHAR(10)} <br />
     * <pre>e.g. setJPopBeansProperty_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param jPopBeansProperty The value of jPopBeansProperty as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param optionCall The callback for option of like-search. (NotNull)
     */
    def setJPopBeansProperty_LikeSearch(jPopBeansProperty: String)(optionCall: (ScrLikeSearchOption) => Unit): Unit = {
        regLSQ(CK_LS, fRES(jPopBeansProperty), getCValueJPopBeansProperty(), "J_POP_BEANS_PROPERTY", callbackLSOP(optionCall));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * J_POP_BEANS_PROPERTY: {VARCHAR(10)}
     * @param jPopBeansProperty The value of jPopBeansProperty as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param optionCall The callback for option of not-like-search. (NotNull)
     */
    def setJPopBeansProperty_NotLikeSearch(jPopBeansProperty: String)(optionCall: (ScrLikeSearchOption) => Unit): Unit = {
        regLSQ(CK_NLS, fRES(jPopBeansProperty), getCValueJPopBeansProperty(), "J_POP_BEANS_PROPERTY", callbackLSOP(optionCall));
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * J_POP_BEANS_PROPERTY: {VARCHAR(10)}
     */
    def setJPopBeansProperty_IsNull(): Unit = { regJPopBeansProperty(CK_ISN, AbstractConditionQuery.DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * J_POP_BEANS_PROPERTY: {VARCHAR(10)}
     */
    def setJPopBeansProperty_IsNullOrEmpty(): Unit = { regJPopBeansProperty(CK_ISNOE, AbstractConditionQuery.DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * J_POP_BEANS_PROPERTY: {VARCHAR(10)}
     */
    def setJPopBeansProperty_IsNotNull(): Unit = { regJPopBeansProperty(CK_ISNN, AbstractConditionQuery.DOBJ); }

    protected def regJPopBeansProperty(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValueJPopBeansProperty(), "J_POP_BEANS_PROPERTY"); }
    protected def getCValueJPopBeansProperty(): ConditionValue;

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;VendorCheckCB&gt;() {
     *     public void query(VendorCheckCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_Equal(): ScrHpSSQFunction[VendorCheckCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_EQ, classOf[VendorCheckCB]));
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;VendorCheckCB&gt;() {
     *     public void query(VendorCheckCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_NotEqual(): ScrHpSSQFunction[VendorCheckCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_NES, classOf[VendorCheckCB]));
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;VendorCheckCB&gt;() {
     *     public void query(VendorCheckCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_GreaterThan(): ScrHpSSQFunction[VendorCheckCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_GT, classOf[VendorCheckCB]));
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;VendorCheckCB&gt;() {
     *     public void query(VendorCheckCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_LessThan(): ScrHpSSQFunction[VendorCheckCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_LT, classOf[VendorCheckCB]));
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;VendorCheckCB&gt;() {
     *     public void query(VendorCheckCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_GreaterEqual(): ScrHpSSQFunction[VendorCheckCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_GE, classOf[VendorCheckCB]));
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;VendorCheckCB&gt;() {
     *     public void query(VendorCheckCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_LessEqual(): ScrHpSSQFunction[VendorCheckCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_LE, classOf[VendorCheckCB]));
    }

    protected def toScalaSSQFunction(function: HpSSQFunction[VendorCheckCB]): ScrHpSSQFunction[VendorCheckCB] =
    { new ScrHpSSQFunction(function) }

    override protected def xscalarCondition[CB <: ConditionBean](fn: String, sq: SubQuery[CB], rd: String, op: HpSSQOption[CB]): Unit = {
        assertObjectNotNull("subQuery", sq);
        val cb: VendorCheckCB = xcreateScalarConditionCB(); sq.query(cb.asInstanceOf[CB]);
        val pp: String = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean(xcreateScalarConditionPartitionByCB().asInstanceOf[CB]); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    def keepScalarCondition(sq: VendorCheckCQ): String;

    protected def xcreateScalarConditionCB(): VendorCheckCB = {
        val cb: VendorCheckCB = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected def xcreateScalarConditionPartitionByCB(): VendorCheckCB = {
        val cb: VendorCheckCB = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    def xsmyselfDerive(fn: String, sq: SubQuery[VendorCheckCB], al: String, op: DerivedReferrerOption): Unit = {
        assertObjectNotNull("subQuery", sq);
        val cb: VendorCheckCB = new VendorCheckCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        val pp: String = keepSpecifyMyselfDerived(cb.query());
        val pk: String = "VENDOR_CHECK_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    def keepSpecifyMyselfDerived(sq: VendorCheckCQ): String;

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    def myselfDerived(): ScrHpQDRFunction[VendorCheckCB] = {
        return toScalaQDRFunction(xcreateQDRFunctionMyselfDerived(classOf[VendorCheckCB]));
    }
    override protected def xqderiveMyselfDerived[CB <: ConditionBean](fn: String, sq: SubQuery[CB], rd: String, vl: Object, op: DerivedReferrerOption): Unit = {
        assertObjectNotNull("subQuery", sq);
        val cb: VendorCheckCB = new VendorCheckCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb.asInstanceOf[CB]);
        val pk: String = "VENDOR_CHECK_ID";
        val sqpp: String = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        val prpp: String = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    def keepQueryMyselfDerived(sq: VendorCheckCQ): String;
    def keepQueryMyselfDerivedParameter(vl: Object): String;

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    def myselfExists(subQuery: (VendorCheckCB) => Unit): Unit = {
        assertObjectNotNull("subQuery", subQuery);
        val cb: VendorCheckCB = new VendorCheckCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery(cb); } finally { unlock(); }
        val pp: String = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    def keepMyselfExists(sq: VendorCheckCQ): String;

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    def myselfInScope(subQuery: (VendorCheckCB) => Unit): Unit = {
        assertObjectNotNull("subQuery", subQuery);
        val cb: VendorCheckCB = new VendorCheckCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery(cb); } finally { unlock(); }
        val pp: String = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    def keepMyselfInScope(sq: VendorCheckCQ): String;

    // ===================================================================================
    //                                                                            Order By
    //                                                                            ========
    /**
     * Order along manual ordering information.
     * <pre>
     * MemberCB cb = new MemberCB();
     * ManualOrderBean mob = new ManualOrderBean();
     * mob.<span style="color: #DD4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #DD4747">withManualOrder(mob)</span>;
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * MemberCB cb = new MemberCB();
     * ManualOrderBean mob = new ManualOrderBean();
     * mob.<span style="color: #DD4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     * mob.<span style="color: #DD4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     * mob.<span style="color: #DD4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #DD4747">withManualOrder(mob)</span>;
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * <p>This function with Union is unsupported!</p>
     * <p>The order values are bound (treated as bind parameter).</p>
     * @param mob The bean of manual order containing order values. (NotNull)
     */
    def withManualOrder(mobCall: (ScrManualOrderBean) => Unit): Unit = { // is user public!
        assertObjectNotNull("withManualOrder(mobCall)", mobCall);
        xdoWithManualOrder(callbackMOB(mobCall));
    }

    protected def toUtilDate(date: Object): Date = {
        if (date != null && date.isInstanceOf[ReadablePartial]) {
            return new Date(date.asInstanceOf[ReadablePartial].toDateTime(null).getMillis());
        } else if (date != null && date.isInstanceOf[ReadableInstant]) {
            return new Date(date.asInstanceOf[ReadableInstant].getMillis());
        }
        return DfTypeUtil.toDate(date);
    }

    protected def toTimestamp(date: Object): java.sql.Timestamp = {
        if (date != null && date.isInstanceOf[ReadablePartial]) {
            return new java.sql.Timestamp(date.asInstanceOf[ReadablePartial].toDateTime(null).getMillis());
        } else if (date != null && date.isInstanceOf[ReadableInstant]) {
            return new java.sql.Timestamp(date.asInstanceOf[ReadableInstant].getMillis());
        }
        return DfTypeUtil.toTimestamp(date);
    }

    override protected def filterFromToRegisteredDate(date: Date, columnDbName: String): Object = {
        if (date.isInstanceOf[java.sql.Timestamp]) {
            return LocalDateTime.fromDateFields(date);
        } else { // basically pure Date
            return LocalDate.fromDateFields(date);
        }
    }

    // ===================================================================================
    //                                                                       Create Option
    //                                                                       =============
    protected def callbackLSOP(optionCall: (ScrLikeSearchOption) => Unit): LikeSearchOption =
    { val op = createLikeSearchOption(); optionCall(op); return op; }
    protected def createLikeSearchOption(): ScrLikeSearchOption = { new ScrLikeSearchOption() }

    protected def callbackFTOP(optionCall: (ScrFromToOption) => Unit): FromToOption =
    { val op = createFromToOption(); optionCall(op); return op; }
    protected def createFromToOption(): ScrFromToOption = { new ScrFromToOption() }

    protected def callbackROOP(optionCall: (ScrRangeOfOption) => Unit): RangeOfOption =
    { val op = createRangeOfOption(); optionCall(op); return op; }
    protected def createRangeOfOption(): ScrRangeOfOption = { new ScrRangeOfOption() }

    protected def callbackMOB(mobCall: (ScrManualOrderBean) => Unit): ManualOrderBean =
    { val mob = createManualOrderBean(); mobCall(mob); return mob; }
    protected def createManualOrderBean(): ScrManualOrderBean = { new ScrManualOrderBean() }

    // ===================================================================================
    //                                                                        Invoke Query
    //                                                                        ============
    override protected def xfilterInvokeQueryParameterType(colName: String, ckey: String, parameterType: Class[_]): Class[_] =
    { if (classOf[Collection[_]].isAssignableFrom(parameterType)) { classOf[List[_]] } else { parameterType } }

    override protected def xfilterInvokeQueryParameterValue(colName: String, ckey: String, parameterValue: Object): Object =
    { if (parameterValue.isInstanceOf[Collection[_]]) { toScalaList(parameterValue.asInstanceOf[Collection[_]]) } else { parameterValue } }

    // ===================================================================================
    //                                                                        Scala Helper
    //                                                                        ============
    protected def toScalaList[ENTITY](javaList: Collection[ENTITY]): immutable.List[ENTITY] = {
        if (javaList == null) { immutable.List() }
        return javaList.toArray.toList.asInstanceOf[immutable.List[ENTITY]];
    }

    protected def toMutableValueCollectionImplicitly[SCALA, JAVA](ls: immutable.List[SCALA]): Collection[JAVA] =
    { if (ls != null) { ls.map(_.asInstanceOf[JAVA]).asJava } else { null } }

    protected def toScalaQDRFunction[CB <: ConditionBean](function: HpQDRFunction[CB]): ScrHpQDRFunction[CB] =
    { new ScrHpQDRFunction[CB](function) }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected def newMyCB(): VendorCheckCB = {
        return new VendorCheckCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected def xabUDT(): String = { return classOf[Date].getName(); }
    protected def xabCQ(): String = { return classOf[VendorCheckCQ].getName(); }
    protected def xabLSO(): String = { return classOf[LikeSearchOption].getName(); }
    protected def xabSSQS(): String = { return classOf[HpSSQSetupper[_]].getName(); }
}
