package com.example.dbflute.scala.dbflute.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean._
import org.seasar.dbflute.cbean.chelper._
import org.seasar.dbflute.cbean.coption._
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;
import com.example.dbflute.scala.dbflute.cbean.cq.ciq._
import com.example.dbflute.scala.dbflute.cbean._
import com.example.dbflute.scala.dbflute.cbean.cq._

/**
 * The base condition-query of VENDOR_CHECK.
 * @author DBFlute(AutoGenerator)
 */
class BsVendorCheckCQ(referrerQuery: ConditionQuery, sqlClause: SqlClause, aliasName: String, nestLevel: Integer) extends AbstractBsVendorCheckCQ(referrerQuery, sqlClause, aliasName, nestLevel) {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected var _inlineQuery: VendorCheckCIQ = null;

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from VENDOR_CHECK) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    def inline(): VendorCheckCIQ = {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected def xcreateCIQ(): VendorCheckCIQ = {
        val ciq: VendorCheckCIQ = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected def xnewCIQ(): VendorCheckCIQ = {
        return new VendorCheckCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join VENDOR_CHECK on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    def on(): VendorCheckCIQ = {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        val inlineQuery: VendorCheckCIQ = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected var _vendorCheckId: ConditionValue = null;
    def getVendorCheckId(): ConditionValue =
    { if (_vendorCheckId == null) { _vendorCheckId = nCV(); }
      return _vendorCheckId; }
    protected def getCValueVendorCheckId(): ConditionValue = { return getVendorCheckId(); }

    /** 
     * Add order-by as ascend. <br />
     * VENDOR_CHECK_ID: {PK, NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    def addOrderBy_VendorCheckId_Asc(): BsVendorCheckCQ = { regOBA("VENDOR_CHECK_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * VENDOR_CHECK_ID: {PK, NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    def addOrderBy_VendorCheckId_Desc(): BsVendorCheckCQ = { regOBD("VENDOR_CHECK_ID"); return this; }

    protected var _typeOfChar: ConditionValue = null;
    def getTypeOfChar(): ConditionValue =
    { if (_typeOfChar == null) { _typeOfChar = nCV(); }
      return _typeOfChar; }
    protected def getCValueTypeOfChar(): ConditionValue = { return getTypeOfChar(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_CHAR: {CHAR(3)}
     * @return this. (NotNull)
     */
    def addOrderBy_TypeOfChar_Asc(): BsVendorCheckCQ = { regOBA("TYPE_OF_CHAR"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_CHAR: {CHAR(3)}
     * @return this. (NotNull)
     */
    def addOrderBy_TypeOfChar_Desc(): BsVendorCheckCQ = { regOBD("TYPE_OF_CHAR"); return this; }

    protected var _typeOfVarchar: ConditionValue = null;
    def getTypeOfVarchar(): ConditionValue =
    { if (_typeOfVarchar == null) { _typeOfVarchar = nCV(); }
      return _typeOfVarchar; }
    protected def getCValueTypeOfVarchar(): ConditionValue = { return getTypeOfVarchar(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_VARCHAR: {VARCHAR(32)}
     * @return this. (NotNull)
     */
    def addOrderBy_TypeOfVarchar_Asc(): BsVendorCheckCQ = { regOBA("TYPE_OF_VARCHAR"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_VARCHAR: {VARCHAR(32)}
     * @return this. (NotNull)
     */
    def addOrderBy_TypeOfVarchar_Desc(): BsVendorCheckCQ = { regOBD("TYPE_OF_VARCHAR"); return this; }

    protected var _typeOfClob: ConditionValue = null;
    def getTypeOfClob(): ConditionValue =
    { if (_typeOfClob == null) { _typeOfClob = nCV(); }
      return _typeOfClob; }
    protected def getCValueTypeOfClob(): ConditionValue = { return getTypeOfClob(); }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_CLOB: {CLOB(2147483647)}
     * @return this. (NotNull)
     */
    def addOrderBy_TypeOfClob_Desc(): BsVendorCheckCQ = { regOBD("TYPE_OF_CLOB"); return this; }

    protected var _typeOfText: ConditionValue = null;
    def getTypeOfText(): ConditionValue =
    { if (_typeOfText == null) { _typeOfText = nCV(); }
      return _typeOfText; }
    protected def getCValueTypeOfText(): ConditionValue = { return getTypeOfText(); }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_TEXT: {CLOB(2147483647)}
     * @return this. (NotNull)
     */
    def addOrderBy_TypeOfText_Desc(): BsVendorCheckCQ = { regOBD("TYPE_OF_TEXT"); return this; }

    protected var _typeOfNumericInteger: ConditionValue = null;
    def getTypeOfNumericInteger(): ConditionValue =
    { if (_typeOfNumericInteger == null) { _typeOfNumericInteger = nCV(); }
      return _typeOfNumericInteger; }
    protected def getCValueTypeOfNumericInteger(): ConditionValue = { return getTypeOfNumericInteger(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_NUMERIC_INTEGER: {DECIMAL(5)}
     * @return this. (NotNull)
     */
    def addOrderBy_TypeOfNumericInteger_Asc(): BsVendorCheckCQ = { regOBA("TYPE_OF_NUMERIC_INTEGER"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_NUMERIC_INTEGER: {DECIMAL(5)}
     * @return this. (NotNull)
     */
    def addOrderBy_TypeOfNumericInteger_Desc(): BsVendorCheckCQ = { regOBD("TYPE_OF_NUMERIC_INTEGER"); return this; }

    protected var _typeOfNumericBigint: ConditionValue = null;
    def getTypeOfNumericBigint(): ConditionValue =
    { if (_typeOfNumericBigint == null) { _typeOfNumericBigint = nCV(); }
      return _typeOfNumericBigint; }
    protected def getCValueTypeOfNumericBigint(): ConditionValue = { return getTypeOfNumericBigint(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_NUMERIC_BIGINT: {DECIMAL(12)}
     * @return this. (NotNull)
     */
    def addOrderBy_TypeOfNumericBigint_Asc(): BsVendorCheckCQ = { regOBA("TYPE_OF_NUMERIC_BIGINT"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_NUMERIC_BIGINT: {DECIMAL(12)}
     * @return this. (NotNull)
     */
    def addOrderBy_TypeOfNumericBigint_Desc(): BsVendorCheckCQ = { regOBD("TYPE_OF_NUMERIC_BIGINT"); return this; }

    protected var _typeOfNumericDecimal: ConditionValue = null;
    def getTypeOfNumericDecimal(): ConditionValue =
    { if (_typeOfNumericDecimal == null) { _typeOfNumericDecimal = nCV(); }
      return _typeOfNumericDecimal; }
    protected def getCValueTypeOfNumericDecimal(): ConditionValue = { return getTypeOfNumericDecimal(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_NUMERIC_DECIMAL: {DECIMAL(5, 3)}
     * @return this. (NotNull)
     */
    def addOrderBy_TypeOfNumericDecimal_Asc(): BsVendorCheckCQ = { regOBA("TYPE_OF_NUMERIC_DECIMAL"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_NUMERIC_DECIMAL: {DECIMAL(5, 3)}
     * @return this. (NotNull)
     */
    def addOrderBy_TypeOfNumericDecimal_Desc(): BsVendorCheckCQ = { regOBD("TYPE_OF_NUMERIC_DECIMAL"); return this; }

    protected var _typeOfNumericIntegerMin: ConditionValue = null;
    def getTypeOfNumericIntegerMin(): ConditionValue =
    { if (_typeOfNumericIntegerMin == null) { _typeOfNumericIntegerMin = nCV(); }
      return _typeOfNumericIntegerMin; }
    protected def getCValueTypeOfNumericIntegerMin(): ConditionValue = { return getTypeOfNumericIntegerMin(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_NUMERIC_INTEGER_MIN: {DECIMAL(1)}
     * @return this. (NotNull)
     */
    def addOrderBy_TypeOfNumericIntegerMin_Asc(): BsVendorCheckCQ = { regOBA("TYPE_OF_NUMERIC_INTEGER_MIN"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_NUMERIC_INTEGER_MIN: {DECIMAL(1)}
     * @return this. (NotNull)
     */
    def addOrderBy_TypeOfNumericIntegerMin_Desc(): BsVendorCheckCQ = { regOBD("TYPE_OF_NUMERIC_INTEGER_MIN"); return this; }

    protected var _typeOfNumericIntegerMax: ConditionValue = null;
    def getTypeOfNumericIntegerMax(): ConditionValue =
    { if (_typeOfNumericIntegerMax == null) { _typeOfNumericIntegerMax = nCV(); }
      return _typeOfNumericIntegerMax; }
    protected def getCValueTypeOfNumericIntegerMax(): ConditionValue = { return getTypeOfNumericIntegerMax(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_NUMERIC_INTEGER_MAX: {DECIMAL(9)}
     * @return this. (NotNull)
     */
    def addOrderBy_TypeOfNumericIntegerMax_Asc(): BsVendorCheckCQ = { regOBA("TYPE_OF_NUMERIC_INTEGER_MAX"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_NUMERIC_INTEGER_MAX: {DECIMAL(9)}
     * @return this. (NotNull)
     */
    def addOrderBy_TypeOfNumericIntegerMax_Desc(): BsVendorCheckCQ = { regOBD("TYPE_OF_NUMERIC_INTEGER_MAX"); return this; }

    protected var _typeOfNumericBigintMin: ConditionValue = null;
    def getTypeOfNumericBigintMin(): ConditionValue =
    { if (_typeOfNumericBigintMin == null) { _typeOfNumericBigintMin = nCV(); }
      return _typeOfNumericBigintMin; }
    protected def getCValueTypeOfNumericBigintMin(): ConditionValue = { return getTypeOfNumericBigintMin(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_NUMERIC_BIGINT_MIN: {DECIMAL(10)}
     * @return this. (NotNull)
     */
    def addOrderBy_TypeOfNumericBigintMin_Asc(): BsVendorCheckCQ = { regOBA("TYPE_OF_NUMERIC_BIGINT_MIN"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_NUMERIC_BIGINT_MIN: {DECIMAL(10)}
     * @return this. (NotNull)
     */
    def addOrderBy_TypeOfNumericBigintMin_Desc(): BsVendorCheckCQ = { regOBD("TYPE_OF_NUMERIC_BIGINT_MIN"); return this; }

    protected var _typeOfNumericBigintMax: ConditionValue = null;
    def getTypeOfNumericBigintMax(): ConditionValue =
    { if (_typeOfNumericBigintMax == null) { _typeOfNumericBigintMax = nCV(); }
      return _typeOfNumericBigintMax; }
    protected def getCValueTypeOfNumericBigintMax(): ConditionValue = { return getTypeOfNumericBigintMax(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_NUMERIC_BIGINT_MAX: {DECIMAL(18)}
     * @return this. (NotNull)
     */
    def addOrderBy_TypeOfNumericBigintMax_Asc(): BsVendorCheckCQ = { regOBA("TYPE_OF_NUMERIC_BIGINT_MAX"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_NUMERIC_BIGINT_MAX: {DECIMAL(18)}
     * @return this. (NotNull)
     */
    def addOrderBy_TypeOfNumericBigintMax_Desc(): BsVendorCheckCQ = { regOBD("TYPE_OF_NUMERIC_BIGINT_MAX"); return this; }

    protected var _typeOfNumericSuperintMin: ConditionValue = null;
    def getTypeOfNumericSuperintMin(): ConditionValue =
    { if (_typeOfNumericSuperintMin == null) { _typeOfNumericSuperintMin = nCV(); }
      return _typeOfNumericSuperintMin; }
    protected def getCValueTypeOfNumericSuperintMin(): ConditionValue = { return getTypeOfNumericSuperintMin(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_NUMERIC_SUPERINT_MIN: {DECIMAL(19)}
     * @return this. (NotNull)
     */
    def addOrderBy_TypeOfNumericSuperintMin_Asc(): BsVendorCheckCQ = { regOBA("TYPE_OF_NUMERIC_SUPERINT_MIN"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_NUMERIC_SUPERINT_MIN: {DECIMAL(19)}
     * @return this. (NotNull)
     */
    def addOrderBy_TypeOfNumericSuperintMin_Desc(): BsVendorCheckCQ = { regOBD("TYPE_OF_NUMERIC_SUPERINT_MIN"); return this; }

    protected var _typeOfNumericSuperintMax: ConditionValue = null;
    def getTypeOfNumericSuperintMax(): ConditionValue =
    { if (_typeOfNumericSuperintMax == null) { _typeOfNumericSuperintMax = nCV(); }
      return _typeOfNumericSuperintMax; }
    protected def getCValueTypeOfNumericSuperintMax(): ConditionValue = { return getTypeOfNumericSuperintMax(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_NUMERIC_SUPERINT_MAX: {DECIMAL(38)}
     * @return this. (NotNull)
     */
    def addOrderBy_TypeOfNumericSuperintMax_Asc(): BsVendorCheckCQ = { regOBA("TYPE_OF_NUMERIC_SUPERINT_MAX"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_NUMERIC_SUPERINT_MAX: {DECIMAL(38)}
     * @return this. (NotNull)
     */
    def addOrderBy_TypeOfNumericSuperintMax_Desc(): BsVendorCheckCQ = { regOBD("TYPE_OF_NUMERIC_SUPERINT_MAX"); return this; }

    protected var _typeOfNumericMaxdecimal: ConditionValue = null;
    def getTypeOfNumericMaxdecimal(): ConditionValue =
    { if (_typeOfNumericMaxdecimal == null) { _typeOfNumericMaxdecimal = nCV(); }
      return _typeOfNumericMaxdecimal; }
    protected def getCValueTypeOfNumericMaxdecimal(): ConditionValue = { return getTypeOfNumericMaxdecimal(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_NUMERIC_MAXDECIMAL: {DECIMAL(38, 38)}
     * @return this. (NotNull)
     */
    def addOrderBy_TypeOfNumericMaxdecimal_Asc(): BsVendorCheckCQ = { regOBA("TYPE_OF_NUMERIC_MAXDECIMAL"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_NUMERIC_MAXDECIMAL: {DECIMAL(38, 38)}
     * @return this. (NotNull)
     */
    def addOrderBy_TypeOfNumericMaxdecimal_Desc(): BsVendorCheckCQ = { regOBD("TYPE_OF_NUMERIC_MAXDECIMAL"); return this; }

    protected var _typeOfInteger: ConditionValue = null;
    def getTypeOfInteger(): ConditionValue =
    { if (_typeOfInteger == null) { _typeOfInteger = nCV(); }
      return _typeOfInteger; }
    protected def getCValueTypeOfInteger(): ConditionValue = { return getTypeOfInteger(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_INTEGER: {INTEGER(10)}
     * @return this. (NotNull)
     */
    def addOrderBy_TypeOfInteger_Asc(): BsVendorCheckCQ = { regOBA("TYPE_OF_INTEGER"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_INTEGER: {INTEGER(10)}
     * @return this. (NotNull)
     */
    def addOrderBy_TypeOfInteger_Desc(): BsVendorCheckCQ = { regOBD("TYPE_OF_INTEGER"); return this; }

    protected var _typeOfBigint: ConditionValue = null;
    def getTypeOfBigint(): ConditionValue =
    { if (_typeOfBigint == null) { _typeOfBigint = nCV(); }
      return _typeOfBigint; }
    protected def getCValueTypeOfBigint(): ConditionValue = { return getTypeOfBigint(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_BIGINT: {BIGINT(19)}
     * @return this. (NotNull)
     */
    def addOrderBy_TypeOfBigint_Asc(): BsVendorCheckCQ = { regOBA("TYPE_OF_BIGINT"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_BIGINT: {BIGINT(19)}
     * @return this. (NotNull)
     */
    def addOrderBy_TypeOfBigint_Desc(): BsVendorCheckCQ = { regOBD("TYPE_OF_BIGINT"); return this; }

    protected var _typeOfDate: ConditionValue = null;
    def getTypeOfDate(): ConditionValue =
    { if (_typeOfDate == null) { _typeOfDate = nCV(); }
      return _typeOfDate; }
    protected def getCValueTypeOfDate(): ConditionValue = { return getTypeOfDate(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_DATE: {DATE(8)}
     * @return this. (NotNull)
     */
    def addOrderBy_TypeOfDate_Asc(): BsVendorCheckCQ = { regOBA("TYPE_OF_DATE"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_DATE: {DATE(8)}
     * @return this. (NotNull)
     */
    def addOrderBy_TypeOfDate_Desc(): BsVendorCheckCQ = { regOBD("TYPE_OF_DATE"); return this; }

    protected var _typeOfTimestamp: ConditionValue = null;
    def getTypeOfTimestamp(): ConditionValue =
    { if (_typeOfTimestamp == null) { _typeOfTimestamp = nCV(); }
      return _typeOfTimestamp; }
    protected def getCValueTypeOfTimestamp(): ConditionValue = { return getTypeOfTimestamp(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_TIMESTAMP: {TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    def addOrderBy_TypeOfTimestamp_Asc(): BsVendorCheckCQ = { regOBA("TYPE_OF_TIMESTAMP"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_TIMESTAMP: {TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    def addOrderBy_TypeOfTimestamp_Desc(): BsVendorCheckCQ = { regOBD("TYPE_OF_TIMESTAMP"); return this; }

    protected var _typeOfTime: ConditionValue = null;
    def getTypeOfTime(): ConditionValue =
    { if (_typeOfTime == null) { _typeOfTime = nCV(); }
      return _typeOfTime; }
    protected def getCValueTypeOfTime(): ConditionValue = { return getTypeOfTime(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_TIME: {TIME(6)}
     * @return this. (NotNull)
     */
    def addOrderBy_TypeOfTime_Asc(): BsVendorCheckCQ = { regOBA("TYPE_OF_TIME"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_TIME: {TIME(6)}
     * @return this. (NotNull)
     */
    def addOrderBy_TypeOfTime_Desc(): BsVendorCheckCQ = { regOBD("TYPE_OF_TIME"); return this; }

    protected var _typeOfBoolean: ConditionValue = null;
    def getTypeOfBoolean(): ConditionValue =
    { if (_typeOfBoolean == null) { _typeOfBoolean = nCV(); }
      return _typeOfBoolean; }
    protected def getCValueTypeOfBoolean(): ConditionValue = { return getTypeOfBoolean(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_BOOLEAN: {BOOLEAN(1)}
     * @return this. (NotNull)
     */
    def addOrderBy_TypeOfBoolean_Asc(): BsVendorCheckCQ = { regOBA("TYPE_OF_BOOLEAN"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_BOOLEAN: {BOOLEAN(1)}
     * @return this. (NotNull)
     */
    def addOrderBy_TypeOfBoolean_Desc(): BsVendorCheckCQ = { regOBD("TYPE_OF_BOOLEAN"); return this; }

    protected var _typeOfBinary: ConditionValue = null;
    def getTypeOfBinary(): ConditionValue =
    { if (_typeOfBinary == null) { _typeOfBinary = nCV(); }
      return _typeOfBinary; }
    protected def getCValueTypeOfBinary(): ConditionValue = { return getTypeOfBinary(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_BINARY: {VARBINARY(2147483647)}
     * @return this. (NotNull)
     */
    def addOrderBy_TypeOfBinary_Asc(): BsVendorCheckCQ = { regOBA("TYPE_OF_BINARY"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_BINARY: {VARBINARY(2147483647)}
     * @return this. (NotNull)
     */
    def addOrderBy_TypeOfBinary_Desc(): BsVendorCheckCQ = { regOBD("TYPE_OF_BINARY"); return this; }

    protected var _typeOfBlob: ConditionValue = null;
    def getTypeOfBlob(): ConditionValue =
    { if (_typeOfBlob == null) { _typeOfBlob = nCV(); }
      return _typeOfBlob; }
    protected def getCValueTypeOfBlob(): ConditionValue = { return getTypeOfBlob(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_BLOB: {BLOB(2147483647)}
     * @return this. (NotNull)
     */
    def addOrderBy_TypeOfBlob_Asc(): BsVendorCheckCQ = { regOBA("TYPE_OF_BLOB"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_BLOB: {BLOB(2147483647)}
     * @return this. (NotNull)
     */
    def addOrderBy_TypeOfBlob_Desc(): BsVendorCheckCQ = { regOBD("TYPE_OF_BLOB"); return this; }

    protected var _typeOfUuid: ConditionValue = null;
    def getTypeOfUuid(): ConditionValue =
    { if (_typeOfUuid == null) { _typeOfUuid = nCV(); }
      return _typeOfUuid; }
    protected def getCValueTypeOfUuid(): ConditionValue = { return getTypeOfUuid(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_UUID: {UUID(2147483647)}
     * @return this. (NotNull)
     */
    def addOrderBy_TypeOfUuid_Asc(): BsVendorCheckCQ = { regOBA("TYPE_OF_UUID"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_UUID: {UUID(2147483647)}
     * @return this. (NotNull)
     */
    def addOrderBy_TypeOfUuid_Desc(): BsVendorCheckCQ = { regOBD("TYPE_OF_UUID"); return this; }

    protected var _typeOfArray: ConditionValue = null;
    def getTypeOfArray(): ConditionValue =
    { if (_typeOfArray == null) { _typeOfArray = nCV(); }
      return _typeOfArray; }
    protected def getCValueTypeOfArray(): ConditionValue = { return getTypeOfArray(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_ARRAY: {ARRAY}
     * @return this. (NotNull)
     */
    def addOrderBy_TypeOfArray_Asc(): BsVendorCheckCQ = { regOBA("TYPE_OF_ARRAY"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_ARRAY: {ARRAY}
     * @return this. (NotNull)
     */
    def addOrderBy_TypeOfArray_Desc(): BsVendorCheckCQ = { regOBD("TYPE_OF_ARRAY"); return this; }

    protected var _typeOfOther: ConditionValue = null;
    def getTypeOfOther(): ConditionValue =
    { if (_typeOfOther == null) { _typeOfOther = nCV(); }
      return _typeOfOther; }
    protected def getCValueTypeOfOther(): ConditionValue = { return getTypeOfOther(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_OTHER: {OTHER(2147483647)}
     * @return this. (NotNull)
     */
    def addOrderBy_TypeOfOther_Asc(): BsVendorCheckCQ = { regOBA("TYPE_OF_OTHER"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_OTHER: {OTHER(2147483647)}
     * @return this. (NotNull)
     */
    def addOrderBy_TypeOfOther_Desc(): BsVendorCheckCQ = { regOBD("TYPE_OF_OTHER"); return this; }

    protected var _jAVABeansProperty: ConditionValue = null;
    def getJAVABeansProperty(): ConditionValue =
    { if (_jAVABeansProperty == null) { _jAVABeansProperty = nCV(); }
      return _jAVABeansProperty; }
    protected def getCValueJAVABeansProperty(): ConditionValue = { return getJAVABeansProperty(); }

    /** 
     * Add order-by as ascend. <br />
     * J_A_V_A_BEANS_PROPERTY: {VARCHAR(10)}
     * @return this. (NotNull)
     */
    def addOrderBy_JAVABeansProperty_Asc(): BsVendorCheckCQ = { regOBA("J_A_V_A_BEANS_PROPERTY"); return this; }

    /**
     * Add order-by as descend. <br />
     * J_A_V_A_BEANS_PROPERTY: {VARCHAR(10)}
     * @return this. (NotNull)
     */
    def addOrderBy_JAVABeansProperty_Desc(): BsVendorCheckCQ = { regOBD("J_A_V_A_BEANS_PROPERTY"); return this; }

    protected var _jPopBeansProperty: ConditionValue = null;
    def getJPopBeansProperty(): ConditionValue =
    { if (_jPopBeansProperty == null) { _jPopBeansProperty = nCV(); }
      return _jPopBeansProperty; }
    protected def getCValueJPopBeansProperty(): ConditionValue = { return getJPopBeansProperty(); }

    /** 
     * Add order-by as ascend. <br />
     * J_POP_BEANS_PROPERTY: {VARCHAR(10)}
     * @return this. (NotNull)
     */
    def addOrderBy_JPopBeansProperty_Asc(): BsVendorCheckCQ = { regOBA("J_POP_BEANS_PROPERTY"); return this; }

    /**
     * Add order-by as descend. <br />
     * J_POP_BEANS_PROPERTY: {VARCHAR(10)}
     * @return this. (NotNull)
     */
    def addOrderBy_JPopBeansProperty_Desc(): BsVendorCheckCQ = { regOBD("J_POP_BEANS_PROPERTY"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #DD4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #DD4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #DD4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    def addSpecifiedDerivedOrderBy_Asc(aliasName: String): BsVendorCheckCQ = { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #DD4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #DD4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #DD4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    def addSpecifiedDerivedOrderBy_Desc(aliasName: String): BsVendorCheckCQ = { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    def reflectRelationOnUnionQuery(bqs: ConditionQuery, uqs: ConditionQuery): Unit = {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    protected def xfindFixedConditionDynamicParameterMap(property: String): Map[String, Object] = {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    def getScalarCondition(): Map[String, VendorCheckCQ] = { xgetSQueMap("scalarCondition") }
    def keepScalarCondition(sq: VendorCheckCQ): String = { xkeepSQue("scalarCondition", sq) }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    def getSpecifyMyselfDerived(): Map[String, VendorCheckCQ] = { xgetSQueMap("specifyMyselfDerived") }
    def keepSpecifyMyselfDerived(sq: VendorCheckCQ): String = { xkeepSQue("specifyMyselfDerived", sq) }

    def getQueryMyselfDerived(): Map[String, VendorCheckCQ] = { xgetSQueMap("queryMyselfDerived") }
    def keepQueryMyselfDerived(sq: VendorCheckCQ): String = { xkeepSQue("queryMyselfDerived", sq) }
    def getQueryMyselfDerivedParameter(): Map[String, Object] = { xgetSQuePmMap("qyeryMyselfDerived") }
    def keepQueryMyselfDerivedParameter(pm: Object): String = { xkeepSQuePm("qyeryMyselfDerived", pm) }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    def getMyselfExists(): Map[String, VendorCheckCQ] = { xgetSQueMap("myselfExists") }
    def keepMyselfExists(sq: VendorCheckCQ): String = { xkeepSQue("myselfExists", sq) }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    def getMyselfInScope(): Map[String, VendorCheckCQ] = { xgetSQueMap("myselfInScope") }
    def keepMyselfInScope(sq: VendorCheckCQ): String = { xkeepSQue("myselfInScope", sq) }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected def xCB(): String = { return classOf[VendorCheckCB].getName(); }
    protected def xCQ(): String = { return classOf[VendorCheckCQ].getName(); }
    protected def xCHp(): String = { return classOf[HpCalculator].getName(); }
    protected def xCOp(): String = { return classOf[ConditionOption].getName(); }
    protected def xMap(): String = { return classOf[Map[_, _]].getName(); }
}
