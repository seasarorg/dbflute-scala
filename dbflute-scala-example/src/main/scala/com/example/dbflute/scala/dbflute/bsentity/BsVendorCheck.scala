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
 * The immutable entity of VENDOR_CHECK as TABLE. <br />
 * <pre>
 * [primary-key]
 *     VENDOR_CHECK_ID
 * 
 * [column]
 *     VENDOR_CHECK_ID, TYPE_OF_CHAR, TYPE_OF_VARCHAR, TYPE_OF_CLOB, TYPE_OF_TEXT, TYPE_OF_NUMERIC_INTEGER, TYPE_OF_NUMERIC_BIGINT, TYPE_OF_NUMERIC_DECIMAL, TYPE_OF_NUMERIC_INTEGER_MIN, TYPE_OF_NUMERIC_INTEGER_MAX, TYPE_OF_NUMERIC_BIGINT_MIN, TYPE_OF_NUMERIC_BIGINT_MAX, TYPE_OF_NUMERIC_SUPERINT_MIN, TYPE_OF_NUMERIC_SUPERINT_MAX, TYPE_OF_NUMERIC_MAXDECIMAL, TYPE_OF_INTEGER, TYPE_OF_BIGINT, TYPE_OF_DATE, TYPE_OF_TIMESTAMP, TYPE_OF_TIME, TYPE_OF_BOOLEAN, TYPE_OF_BINARY, TYPE_OF_BLOB, TYPE_OF_UUID, TYPE_OF_ARRAY, TYPE_OF_OTHER, J_A_V_A_BEANS_PROPERTY, J_POP_BEANS_PROPERTY
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
 * val vendorCheckId: Long = entity.vendorCheckId
 * val typeOfChar: Option[String] = entity.typeOfChar
 * val typeOfVarchar: Option[String] = entity.typeOfVarchar
 * val typeOfClob: Option[String] = entity.typeOfClob
 * val typeOfText: Option[String] = entity.typeOfText
 * val typeOfNumericInteger: Option[Int] = entity.typeOfNumericInteger
 * val typeOfNumericBigint: Option[Long] = entity.typeOfNumericBigint
 * val typeOfNumericDecimal: Option[scala.math.BigDecimal] = entity.typeOfNumericDecimal
 * val typeOfNumericIntegerMin: Option[Int] = entity.typeOfNumericIntegerMin
 * val typeOfNumericIntegerMax: Option[Int] = entity.typeOfNumericIntegerMax
 * val typeOfNumericBigintMin: Option[Long] = entity.typeOfNumericBigintMin
 * val typeOfNumericBigintMax: Option[Long] = entity.typeOfNumericBigintMax
 * val typeOfNumericSuperintMin: Option[scala.math.BigDecimal] = entity.typeOfNumericSuperintMin
 * val typeOfNumericSuperintMax: Option[scala.math.BigDecimal] = entity.typeOfNumericSuperintMax
 * val typeOfNumericMaxdecimal: Option[scala.math.BigDecimal] = entity.typeOfNumericMaxdecimal
 * val typeOfInteger: Option[Int] = entity.typeOfInteger
 * val typeOfBigint: Option[Long] = entity.typeOfBigint
 * val typeOfDate: Option[org.joda.time.LocalDate] = entity.typeOfDate
 * val typeOfTimestamp: Option[org.joda.time.LocalDateTime] = entity.typeOfTimestamp
 * val typeOfTime: Option[org.joda.time.LocalTime] = entity.typeOfTime
 * val typeOfBoolean: Option[Boolean] = entity.typeOfBoolean
 * val typeOfBinary: Option[Array[Byte]] = entity.typeOfBinary
 * val typeOfBlob: Option[Array[Byte]] = entity.typeOfBlob
 * val typeOfUuid: Option[Array[Byte]] = entity.typeOfUuid
 * val typeOfArray: Option[String] = entity.typeOfArray
 * val typeOfOther: Option[String] = entity.typeOfOther
 * val jAVABeansProperty: Option[String] = entity.jAVABeansProperty
 * val jPopBeansProperty: Option[String] = entity.jPopBeansProperty
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
abstract class BsVendorCheck(dble: DbleVendorCheck) extends Serializable {

    // ===================================================================================
    //                                                                           Case Like
    //                                                                           =========
    def copy(
         vendorCheckId: Long = vendorCheckId
        , typeOfChar: Option[String] = typeOfChar
        , typeOfVarchar: Option[String] = typeOfVarchar
        , typeOfClob: Option[String] = typeOfClob
        , typeOfText: Option[String] = typeOfText
        , typeOfNumericInteger: Option[Int] = typeOfNumericInteger
        , typeOfNumericBigint: Option[Long] = typeOfNumericBigint
        , typeOfNumericDecimal: Option[scala.math.BigDecimal] = typeOfNumericDecimal
        , typeOfNumericIntegerMin: Option[Int] = typeOfNumericIntegerMin
        , typeOfNumericIntegerMax: Option[Int] = typeOfNumericIntegerMax
        , typeOfNumericBigintMin: Option[Long] = typeOfNumericBigintMin
        , typeOfNumericBigintMax: Option[Long] = typeOfNumericBigintMax
        , typeOfNumericSuperintMin: Option[scala.math.BigDecimal] = typeOfNumericSuperintMin
        , typeOfNumericSuperintMax: Option[scala.math.BigDecimal] = typeOfNumericSuperintMax
        , typeOfNumericMaxdecimal: Option[scala.math.BigDecimal] = typeOfNumericMaxdecimal
        , typeOfInteger: Option[Int] = typeOfInteger
        , typeOfBigint: Option[Long] = typeOfBigint
        , typeOfDate: Option[org.joda.time.LocalDate] = typeOfDate
        , typeOfTimestamp: Option[org.joda.time.LocalDateTime] = typeOfTimestamp
        , typeOfTime: Option[org.joda.time.LocalTime] = typeOfTime
        , typeOfBoolean: Option[Boolean] = typeOfBoolean
        , typeOfBinary: Option[Array[Byte]] = typeOfBinary
        , typeOfBlob: Option[Array[Byte]] = typeOfBlob
        , typeOfUuid: Option[Array[Byte]] = typeOfUuid
        , typeOfArray: Option[String] = typeOfArray
        , typeOfOther: Option[String] = typeOfOther
        , jAVABeansProperty: Option[String] = jAVABeansProperty
        , jPopBeansProperty: Option[String] = jPopBeansProperty
    ): VendorCheck = {
        val newDble = new DbleVendorCheck
        newDble.myuniqueDrivenProperties.addAll(dble.myuniqueDrivenProperties) // inherit
        newDble.mymodifiedProperties.addAll(dble.mymodifiedProperties) // inherit
        if (!vendorCheckId.equals(this.vendorCheckId)) { newDble.setVendorCheckId(vendorCheckId) }
        if (!typeOfChar.equals(this.typeOfChar)) { newDble.setTypeOfChar(typeOfChar.orNull) }
        if (!typeOfVarchar.equals(this.typeOfVarchar)) { newDble.setTypeOfVarchar(typeOfVarchar.orNull) }
        if (!typeOfClob.equals(this.typeOfClob)) { newDble.setTypeOfClob(typeOfClob.orNull) }
        if (!typeOfText.equals(this.typeOfText)) { newDble.setTypeOfText(typeOfText.orNull) }
        if (!typeOfNumericInteger.equals(this.typeOfNumericInteger)) { newDble.setTypeOfNumericInteger(typeOfNumericInteger.map(int2Integer(_)).orNull) }
        if (!typeOfNumericBigint.equals(this.typeOfNumericBigint)) { newDble.setTypeOfNumericBigint(typeOfNumericBigint.map(long2Long(_)).orNull) }
        if (!typeOfNumericDecimal.equals(this.typeOfNumericDecimal)) { newDble.setTypeOfNumericDecimal(typeOfNumericDecimal.orNull.underlying) }
        if (!typeOfNumericIntegerMin.equals(this.typeOfNumericIntegerMin)) { newDble.setTypeOfNumericIntegerMin(typeOfNumericIntegerMin.map(int2Integer(_)).orNull) }
        if (!typeOfNumericIntegerMax.equals(this.typeOfNumericIntegerMax)) { newDble.setTypeOfNumericIntegerMax(typeOfNumericIntegerMax.map(int2Integer(_)).orNull) }
        if (!typeOfNumericBigintMin.equals(this.typeOfNumericBigintMin)) { newDble.setTypeOfNumericBigintMin(typeOfNumericBigintMin.map(long2Long(_)).orNull) }
        if (!typeOfNumericBigintMax.equals(this.typeOfNumericBigintMax)) { newDble.setTypeOfNumericBigintMax(typeOfNumericBigintMax.map(long2Long(_)).orNull) }
        if (!typeOfNumericSuperintMin.equals(this.typeOfNumericSuperintMin)) { newDble.setTypeOfNumericSuperintMin(typeOfNumericSuperintMin.orNull.underlying) }
        if (!typeOfNumericSuperintMax.equals(this.typeOfNumericSuperintMax)) { newDble.setTypeOfNumericSuperintMax(typeOfNumericSuperintMax.orNull.underlying) }
        if (!typeOfNumericMaxdecimal.equals(this.typeOfNumericMaxdecimal)) { newDble.setTypeOfNumericMaxdecimal(typeOfNumericMaxdecimal.orNull.underlying) }
        if (!typeOfInteger.equals(this.typeOfInteger)) { newDble.setTypeOfInteger(typeOfInteger.map(int2Integer(_)).orNull) }
        if (!typeOfBigint.equals(this.typeOfBigint)) { newDble.setTypeOfBigint(typeOfBigint.map(long2Long(_)).orNull) }
        if (!typeOfDate.equals(this.typeOfDate)) { newDble.setTypeOfDate(typeOfDate.orNull) }
        if (!typeOfTimestamp.equals(this.typeOfTimestamp)) { newDble.setTypeOfTimestamp(typeOfTimestamp.orNull) }
        if (!typeOfTime.equals(this.typeOfTime)) { newDble.setTypeOfTime(typeOfTime.orNull) }
        if (!typeOfBoolean.equals(this.typeOfBoolean)) { newDble.setTypeOfBoolean(typeOfBoolean.map(boolean2Boolean(_)).orNull) }
        if (!typeOfBinary.equals(this.typeOfBinary)) { newDble.setTypeOfBinary(typeOfBinary.orNull) }
        if (!typeOfBlob.equals(this.typeOfBlob)) { newDble.setTypeOfBlob(typeOfBlob.orNull) }
        if (!typeOfUuid.equals(this.typeOfUuid)) { newDble.setTypeOfUuid(typeOfUuid.orNull) }
        if (!typeOfArray.equals(this.typeOfArray)) { newDble.setTypeOfArray(typeOfArray.orNull) }
        if (!typeOfOther.equals(this.typeOfOther)) { newDble.setTypeOfOther(typeOfOther.orNull) }
        if (!jAVABeansProperty.equals(this.jAVABeansProperty)) { newDble.setJAVABeansProperty(jAVABeansProperty.orNull) }
        if (!jPopBeansProperty.equals(this.jPopBeansProperty)) { newDble.setJPopBeansProperty(jPopBeansProperty.orNull) }
        new VendorCheck(newDble)
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
            case obj: BsVendorCheck => {
                val other: BsVendorCheck = obj.asInstanceOf[BsVendorCheck];
                {(
                     xSV(vendorCheckId, other.vendorCheckId)
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
     * [get] VENDOR_CHECK_ID: {PK, NotNull, DECIMAL(16)} <br />
     * @return The value of the column 'VENDOR_CHECK_ID'. (NotNull but EmptyAllowed if null in database)
     */
    def vendorCheckId: Long = { dble.getVendorCheckId }

    /**
     * [get] TYPE_OF_CHAR: {CHAR(3)} <br />
     * @return The value of the column 'TYPE_OF_CHAR'. (basically NotNull if selected: for the constraint)
     */
    def typeOfChar: Option[String] = { Option(dble.getTypeOfChar) }

    /**
     * [get] TYPE_OF_VARCHAR: {VARCHAR(32)} <br />
     * @return The value of the column 'TYPE_OF_VARCHAR'. (basically NotNull if selected: for the constraint)
     */
    def typeOfVarchar: Option[String] = { Option(dble.getTypeOfVarchar) }

    /**
     * [get] TYPE_OF_CLOB: {CLOB(2147483647)} <br />
     * @return The value of the column 'TYPE_OF_CLOB'. (basically NotNull if selected: for the constraint)
     */
    def typeOfClob: Option[String] = { Option(dble.getTypeOfClob) }

    /**
     * [get] TYPE_OF_TEXT: {CLOB(2147483647)} <br />
     * @return The value of the column 'TYPE_OF_TEXT'. (basically NotNull if selected: for the constraint)
     */
    def typeOfText: Option[String] = { Option(dble.getTypeOfText) }

    /**
     * [get] TYPE_OF_NUMERIC_INTEGER: {DECIMAL(5)} <br />
     * @return The value of the column 'TYPE_OF_NUMERIC_INTEGER'. (basically NotNull if selected: for the constraint)
     */
    def typeOfNumericInteger: Option[Int] = { Option(dble.getTypeOfNumericInteger) }

    /**
     * [get] TYPE_OF_NUMERIC_BIGINT: {DECIMAL(12)} <br />
     * @return The value of the column 'TYPE_OF_NUMERIC_BIGINT'. (basically NotNull if selected: for the constraint)
     */
    def typeOfNumericBigint: Option[Long] = { Option(dble.getTypeOfNumericBigint) }

    /**
     * [get] TYPE_OF_NUMERIC_DECIMAL: {DECIMAL(5, 3)} <br />
     * @return The value of the column 'TYPE_OF_NUMERIC_DECIMAL'. (basically NotNull if selected: for the constraint)
     */
    def typeOfNumericDecimal: Option[scala.math.BigDecimal] = { Option(dble.getTypeOfNumericDecimal) }

    /**
     * [get] TYPE_OF_NUMERIC_INTEGER_MIN: {DECIMAL(1)} <br />
     * @return The value of the column 'TYPE_OF_NUMERIC_INTEGER_MIN'. (basically NotNull if selected: for the constraint)
     */
    def typeOfNumericIntegerMin: Option[Int] = { Option(dble.getTypeOfNumericIntegerMin) }

    /**
     * [get] TYPE_OF_NUMERIC_INTEGER_MAX: {DECIMAL(9)} <br />
     * @return The value of the column 'TYPE_OF_NUMERIC_INTEGER_MAX'. (basically NotNull if selected: for the constraint)
     */
    def typeOfNumericIntegerMax: Option[Int] = { Option(dble.getTypeOfNumericIntegerMax) }

    /**
     * [get] TYPE_OF_NUMERIC_BIGINT_MIN: {DECIMAL(10)} <br />
     * @return The value of the column 'TYPE_OF_NUMERIC_BIGINT_MIN'. (basically NotNull if selected: for the constraint)
     */
    def typeOfNumericBigintMin: Option[Long] = { Option(dble.getTypeOfNumericBigintMin) }

    /**
     * [get] TYPE_OF_NUMERIC_BIGINT_MAX: {DECIMAL(18)} <br />
     * @return The value of the column 'TYPE_OF_NUMERIC_BIGINT_MAX'. (basically NotNull if selected: for the constraint)
     */
    def typeOfNumericBigintMax: Option[Long] = { Option(dble.getTypeOfNumericBigintMax) }

    /**
     * [get] TYPE_OF_NUMERIC_SUPERINT_MIN: {DECIMAL(19)} <br />
     * @return The value of the column 'TYPE_OF_NUMERIC_SUPERINT_MIN'. (basically NotNull if selected: for the constraint)
     */
    def typeOfNumericSuperintMin: Option[scala.math.BigDecimal] = { Option(dble.getTypeOfNumericSuperintMin) }

    /**
     * [get] TYPE_OF_NUMERIC_SUPERINT_MAX: {DECIMAL(38)} <br />
     * @return The value of the column 'TYPE_OF_NUMERIC_SUPERINT_MAX'. (basically NotNull if selected: for the constraint)
     */
    def typeOfNumericSuperintMax: Option[scala.math.BigDecimal] = { Option(dble.getTypeOfNumericSuperintMax) }

    /**
     * [get] TYPE_OF_NUMERIC_MAXDECIMAL: {DECIMAL(38, 38)} <br />
     * @return The value of the column 'TYPE_OF_NUMERIC_MAXDECIMAL'. (basically NotNull if selected: for the constraint)
     */
    def typeOfNumericMaxdecimal: Option[scala.math.BigDecimal] = { Option(dble.getTypeOfNumericMaxdecimal) }

    /**
     * [get] TYPE_OF_INTEGER: {INTEGER(10)} <br />
     * @return The value of the column 'TYPE_OF_INTEGER'. (basically NotNull if selected: for the constraint)
     */
    def typeOfInteger: Option[Int] = { Option(dble.getTypeOfInteger) }

    /**
     * [get] TYPE_OF_BIGINT: {BIGINT(19)} <br />
     * @return The value of the column 'TYPE_OF_BIGINT'. (basically NotNull if selected: for the constraint)
     */
    def typeOfBigint: Option[Long] = { Option(dble.getTypeOfBigint) }

    /**
     * [get] TYPE_OF_DATE: {DATE(8)} <br />
     * @return The value of the column 'TYPE_OF_DATE'. (basically NotNull if selected: for the constraint)
     */
    def typeOfDate: Option[org.joda.time.LocalDate] = { Option(dble.getTypeOfDate) }

    /**
     * [get] TYPE_OF_TIMESTAMP: {TIMESTAMP(23, 10)} <br />
     * @return The value of the column 'TYPE_OF_TIMESTAMP'. (basically NotNull if selected: for the constraint)
     */
    def typeOfTimestamp: Option[org.joda.time.LocalDateTime] = { Option(dble.getTypeOfTimestamp) }

    /**
     * [get] TYPE_OF_TIME: {TIME(6)} <br />
     * @return The value of the column 'TYPE_OF_TIME'. (basically NotNull if selected: for the constraint)
     */
    def typeOfTime: Option[org.joda.time.LocalTime] = { Option(dble.getTypeOfTime) }

    /**
     * [get] TYPE_OF_BOOLEAN: {BOOLEAN(1)} <br />
     * @return The value of the column 'TYPE_OF_BOOLEAN'. (basically NotNull if selected: for the constraint)
     */
    def typeOfBoolean: Option[Boolean] = { Option(dble.getTypeOfBoolean) }

    /**
     * [get] TYPE_OF_BINARY: {VARBINARY(2147483647)} <br />
     * @return The value of the column 'TYPE_OF_BINARY'. (basically NotNull if selected: for the constraint)
     */
    def typeOfBinary: Option[Array[Byte]] = { Option(dble.getTypeOfBinary) }

    /**
     * [get] TYPE_OF_BLOB: {BLOB(2147483647)} <br />
     * @return The value of the column 'TYPE_OF_BLOB'. (basically NotNull if selected: for the constraint)
     */
    def typeOfBlob: Option[Array[Byte]] = { Option(dble.getTypeOfBlob) }

    /**
     * [get] TYPE_OF_UUID: {UUID(2147483647)} <br />
     * @return The value of the column 'TYPE_OF_UUID'. (basically NotNull if selected: for the constraint)
     */
    def typeOfUuid: Option[Array[Byte]] = { Option(dble.getTypeOfUuid) }

    /**
     * [get] TYPE_OF_ARRAY: {ARRAY} <br />
     * @return The value of the column 'TYPE_OF_ARRAY'. (basically NotNull if selected: for the constraint)
     */
    def typeOfArray: Option[String] = { Option(dble.getTypeOfArray) }

    /**
     * [get] TYPE_OF_OTHER: {OTHER(2147483647)} <br />
     * @return The value of the column 'TYPE_OF_OTHER'. (basically NotNull if selected: for the constraint)
     */
    def typeOfOther: Option[String] = { Option(dble.getTypeOfOther) }

    /**
     * [get] J_A_V_A_BEANS_PROPERTY: {VARCHAR(10)} <br />
     * @return The value of the column 'J_A_V_A_BEANS_PROPERTY'. (basically NotNull if selected: for the constraint)
     */
    def jAVABeansProperty: Option[String] = { Option(dble.getJAVABeansProperty) }

    /**
     * [get] J_POP_BEANS_PROPERTY: {VARCHAR(10)} <br />
     * @return The value of the column 'J_POP_BEANS_PROPERTY'. (basically NotNull if selected: for the constraint)
     */
    def jPopBeansProperty: Option[String] = { Option(dble.getJPopBeansProperty) }
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
 * The mutable entity of VENDOR_CHECK as TABLE. <br />
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * val vendorCheckId: Long = entity.vendorCheckId
 * val typeOfChar: Option[String] = entity.typeOfChar
 * val typeOfVarchar: Option[String] = entity.typeOfVarchar
 * val typeOfClob: Option[String] = entity.typeOfClob
 * val typeOfText: Option[String] = entity.typeOfText
 * val typeOfNumericInteger: Option[Int] = entity.typeOfNumericInteger
 * val typeOfNumericBigint: Option[Long] = entity.typeOfNumericBigint
 * val typeOfNumericDecimal: Option[scala.math.BigDecimal] = entity.typeOfNumericDecimal
 * val typeOfNumericIntegerMin: Option[Int] = entity.typeOfNumericIntegerMin
 * val typeOfNumericIntegerMax: Option[Int] = entity.typeOfNumericIntegerMax
 * val typeOfNumericBigintMin: Option[Long] = entity.typeOfNumericBigintMin
 * val typeOfNumericBigintMax: Option[Long] = entity.typeOfNumericBigintMax
 * val typeOfNumericSuperintMin: Option[scala.math.BigDecimal] = entity.typeOfNumericSuperintMin
 * val typeOfNumericSuperintMax: Option[scala.math.BigDecimal] = entity.typeOfNumericSuperintMax
 * val typeOfNumericMaxdecimal: Option[scala.math.BigDecimal] = entity.typeOfNumericMaxdecimal
 * val typeOfInteger: Option[Int] = entity.typeOfInteger
 * val typeOfBigint: Option[Long] = entity.typeOfBigint
 * val typeOfDate: Option[org.joda.time.LocalDate] = entity.typeOfDate
 * val typeOfTimestamp: Option[org.joda.time.LocalDateTime] = entity.typeOfTimestamp
 * val typeOfTime: Option[org.joda.time.LocalTime] = entity.typeOfTime
 * val typeOfBoolean: Option[Boolean] = entity.typeOfBoolean
 * val typeOfBinary: Option[Array[Byte]] = entity.typeOfBinary
 * val typeOfBlob: Option[Array[Byte]] = entity.typeOfBlob
 * val typeOfUuid: Option[Array[Byte]] = entity.typeOfUuid
 * val typeOfArray: Option[String] = entity.typeOfArray
 * val typeOfOther: Option[String] = entity.typeOfOther
 * val jAVABeansProperty: Option[String] = entity.jAVABeansProperty
 * val jPopBeansProperty: Option[String] = entity.jPopBeansProperty
 * entity.vendorCheckId = vendorCheckId
 * entity.typeOfChar = typeOfChar
 * entity.typeOfVarchar = typeOfVarchar
 * entity.typeOfClob = typeOfClob
 * entity.typeOfText = typeOfText
 * entity.typeOfNumericInteger = typeOfNumericInteger
 * entity.typeOfNumericBigint = typeOfNumericBigint
 * entity.typeOfNumericDecimal = typeOfNumericDecimal
 * entity.typeOfNumericIntegerMin = typeOfNumericIntegerMin
 * entity.typeOfNumericIntegerMax = typeOfNumericIntegerMax
 * entity.typeOfNumericBigintMin = typeOfNumericBigintMin
 * entity.typeOfNumericBigintMax = typeOfNumericBigintMax
 * entity.typeOfNumericSuperintMin = typeOfNumericSuperintMin
 * entity.typeOfNumericSuperintMax = typeOfNumericSuperintMax
 * entity.typeOfNumericMaxdecimal = typeOfNumericMaxdecimal
 * entity.typeOfInteger = typeOfInteger
 * entity.typeOfBigint = typeOfBigint
 * entity.typeOfDate = typeOfDate
 * entity.typeOfTimestamp = typeOfTimestamp
 * entity.typeOfTime = typeOfTime
 * entity.typeOfBoolean = typeOfBoolean
 * entity.typeOfBinary = typeOfBinary
 * entity.typeOfBlob = typeOfBlob
 * entity.typeOfUuid = typeOfUuid
 * entity.typeOfArray = typeOfArray
 * entity.typeOfOther = typeOfOther
 * entity.jAVABeansProperty = jAVABeansProperty
 * entity.jPopBeansProperty = jPopBeansProperty
 * = = = = = = = = = =/
 * @author DBFlute(AutoGenerator)
 */
abstract class BsMbleVendorCheck {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected val dble: DbleVendorCheck = new DbleVendorCheck();

    // ===================================================================================
    //                                                                      DB-able Entity
    //                                                                      ==============
    def toDBable(): DbleVendorCheck = { dble }

    // ===================================================================================
    //                                                                    Immutable Entity
    //                                                                    ================
    def toImmutable(): VendorCheck = { dble.toImmutable() }

    // ===================================================================================
    //                                                                          Unique Key
    //                                                                          ==========
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] VENDOR_CHECK_ID: {PK, NotNull, DECIMAL(16)} <br />
     * @return The value of the column 'VENDOR_CHECK_ID'. (basically NotNull if selected: for the constraint)
     */
    def vendorCheckId: Long = { dble.getVendorCheckId }

    /**
     * [set] VENDOR_CHECK_ID: {PK, NotNull, DECIMAL(16)} <br />
     * @param vendorCheckId The value of the column 'VENDOR_CHECK_ID'. (NullAllowed: null update allowed for no constraint)
     */
    def vendorCheckId_=(vendorCheckId: Long) = { dble.setVendorCheckId(vendorCheckId) }

    /**
     * [get] TYPE_OF_CHAR: {CHAR(3)} <br />
     * @return The value of the column 'TYPE_OF_CHAR'. (NotNull but EmptyAllowed if null in database)
     */
    def typeOfChar: Option[String] = { Option(dble.getTypeOfChar) }

    /**
     * [set] TYPE_OF_CHAR: {CHAR(3)} <br />
     * @param typeOfChar The value of the column 'TYPE_OF_CHAR'. (basically NotNull if update: for the constraint)
     */
    def typeOfChar_=(typeOfChar: Option[String]) = { dble.setTypeOfChar(typeOfChar.orNull) }

    /**
     * [get] TYPE_OF_VARCHAR: {VARCHAR(32)} <br />
     * @return The value of the column 'TYPE_OF_VARCHAR'. (NotNull but EmptyAllowed if null in database)
     */
    def typeOfVarchar: Option[String] = { Option(dble.getTypeOfVarchar) }

    /**
     * [set] TYPE_OF_VARCHAR: {VARCHAR(32)} <br />
     * @param typeOfVarchar The value of the column 'TYPE_OF_VARCHAR'. (basically NotNull if update: for the constraint)
     */
    def typeOfVarchar_=(typeOfVarchar: Option[String]) = { dble.setTypeOfVarchar(typeOfVarchar.orNull) }

    /**
     * [get] TYPE_OF_CLOB: {CLOB(2147483647)} <br />
     * @return The value of the column 'TYPE_OF_CLOB'. (NotNull but EmptyAllowed if null in database)
     */
    def typeOfClob: Option[String] = { Option(dble.getTypeOfClob) }

    /**
     * [set] TYPE_OF_CLOB: {CLOB(2147483647)} <br />
     * @param typeOfClob The value of the column 'TYPE_OF_CLOB'. (basically NotNull if update: for the constraint)
     */
    def typeOfClob_=(typeOfClob: Option[String]) = { dble.setTypeOfClob(typeOfClob.orNull) }

    /**
     * [get] TYPE_OF_TEXT: {CLOB(2147483647)} <br />
     * @return The value of the column 'TYPE_OF_TEXT'. (NotNull but EmptyAllowed if null in database)
     */
    def typeOfText: Option[String] = { Option(dble.getTypeOfText) }

    /**
     * [set] TYPE_OF_TEXT: {CLOB(2147483647)} <br />
     * @param typeOfText The value of the column 'TYPE_OF_TEXT'. (basically NotNull if update: for the constraint)
     */
    def typeOfText_=(typeOfText: Option[String]) = { dble.setTypeOfText(typeOfText.orNull) }

    /**
     * [get] TYPE_OF_NUMERIC_INTEGER: {DECIMAL(5)} <br />
     * @return The value of the column 'TYPE_OF_NUMERIC_INTEGER'. (NotNull but EmptyAllowed if null in database)
     */
    def typeOfNumericInteger: Option[Int] = { Option(dble.getTypeOfNumericInteger) }

    /**
     * [set] TYPE_OF_NUMERIC_INTEGER: {DECIMAL(5)} <br />
     * @param typeOfNumericInteger The value of the column 'TYPE_OF_NUMERIC_INTEGER'. (basically NotNull if update: for the constraint)
     */
    def typeOfNumericInteger_=(typeOfNumericInteger: Option[Int]) = { dble.setTypeOfNumericInteger(typeOfNumericInteger.map(int2Integer(_)).orNull) }

    /**
     * [get] TYPE_OF_NUMERIC_BIGINT: {DECIMAL(12)} <br />
     * @return The value of the column 'TYPE_OF_NUMERIC_BIGINT'. (NotNull but EmptyAllowed if null in database)
     */
    def typeOfNumericBigint: Option[Long] = { Option(dble.getTypeOfNumericBigint) }

    /**
     * [set] TYPE_OF_NUMERIC_BIGINT: {DECIMAL(12)} <br />
     * @param typeOfNumericBigint The value of the column 'TYPE_OF_NUMERIC_BIGINT'. (basically NotNull if update: for the constraint)
     */
    def typeOfNumericBigint_=(typeOfNumericBigint: Option[Long]) = { dble.setTypeOfNumericBigint(typeOfNumericBigint.map(long2Long(_)).orNull) }

    /**
     * [get] TYPE_OF_NUMERIC_DECIMAL: {DECIMAL(5, 3)} <br />
     * @return The value of the column 'TYPE_OF_NUMERIC_DECIMAL'. (NotNull but EmptyAllowed if null in database)
     */
    def typeOfNumericDecimal: Option[scala.math.BigDecimal] = { Option(dble.getTypeOfNumericDecimal) }

    /**
     * [set] TYPE_OF_NUMERIC_DECIMAL: {DECIMAL(5, 3)} <br />
     * @param typeOfNumericDecimal The value of the column 'TYPE_OF_NUMERIC_DECIMAL'. (basically NotNull if update: for the constraint)
     */
    def typeOfNumericDecimal_=(typeOfNumericDecimal: Option[scala.math.BigDecimal]) = { dble.setTypeOfNumericDecimal(typeOfNumericDecimal.orNull.underlying) }

    /**
     * [get] TYPE_OF_NUMERIC_INTEGER_MIN: {DECIMAL(1)} <br />
     * @return The value of the column 'TYPE_OF_NUMERIC_INTEGER_MIN'. (NotNull but EmptyAllowed if null in database)
     */
    def typeOfNumericIntegerMin: Option[Int] = { Option(dble.getTypeOfNumericIntegerMin) }

    /**
     * [set] TYPE_OF_NUMERIC_INTEGER_MIN: {DECIMAL(1)} <br />
     * @param typeOfNumericIntegerMin The value of the column 'TYPE_OF_NUMERIC_INTEGER_MIN'. (basically NotNull if update: for the constraint)
     */
    def typeOfNumericIntegerMin_=(typeOfNumericIntegerMin: Option[Int]) = { dble.setTypeOfNumericIntegerMin(typeOfNumericIntegerMin.map(int2Integer(_)).orNull) }

    /**
     * [get] TYPE_OF_NUMERIC_INTEGER_MAX: {DECIMAL(9)} <br />
     * @return The value of the column 'TYPE_OF_NUMERIC_INTEGER_MAX'. (NotNull but EmptyAllowed if null in database)
     */
    def typeOfNumericIntegerMax: Option[Int] = { Option(dble.getTypeOfNumericIntegerMax) }

    /**
     * [set] TYPE_OF_NUMERIC_INTEGER_MAX: {DECIMAL(9)} <br />
     * @param typeOfNumericIntegerMax The value of the column 'TYPE_OF_NUMERIC_INTEGER_MAX'. (basically NotNull if update: for the constraint)
     */
    def typeOfNumericIntegerMax_=(typeOfNumericIntegerMax: Option[Int]) = { dble.setTypeOfNumericIntegerMax(typeOfNumericIntegerMax.map(int2Integer(_)).orNull) }

    /**
     * [get] TYPE_OF_NUMERIC_BIGINT_MIN: {DECIMAL(10)} <br />
     * @return The value of the column 'TYPE_OF_NUMERIC_BIGINT_MIN'. (NotNull but EmptyAllowed if null in database)
     */
    def typeOfNumericBigintMin: Option[Long] = { Option(dble.getTypeOfNumericBigintMin) }

    /**
     * [set] TYPE_OF_NUMERIC_BIGINT_MIN: {DECIMAL(10)} <br />
     * @param typeOfNumericBigintMin The value of the column 'TYPE_OF_NUMERIC_BIGINT_MIN'. (basically NotNull if update: for the constraint)
     */
    def typeOfNumericBigintMin_=(typeOfNumericBigintMin: Option[Long]) = { dble.setTypeOfNumericBigintMin(typeOfNumericBigintMin.map(long2Long(_)).orNull) }

    /**
     * [get] TYPE_OF_NUMERIC_BIGINT_MAX: {DECIMAL(18)} <br />
     * @return The value of the column 'TYPE_OF_NUMERIC_BIGINT_MAX'. (NotNull but EmptyAllowed if null in database)
     */
    def typeOfNumericBigintMax: Option[Long] = { Option(dble.getTypeOfNumericBigintMax) }

    /**
     * [set] TYPE_OF_NUMERIC_BIGINT_MAX: {DECIMAL(18)} <br />
     * @param typeOfNumericBigintMax The value of the column 'TYPE_OF_NUMERIC_BIGINT_MAX'. (basically NotNull if update: for the constraint)
     */
    def typeOfNumericBigintMax_=(typeOfNumericBigintMax: Option[Long]) = { dble.setTypeOfNumericBigintMax(typeOfNumericBigintMax.map(long2Long(_)).orNull) }

    /**
     * [get] TYPE_OF_NUMERIC_SUPERINT_MIN: {DECIMAL(19)} <br />
     * @return The value of the column 'TYPE_OF_NUMERIC_SUPERINT_MIN'. (NotNull but EmptyAllowed if null in database)
     */
    def typeOfNumericSuperintMin: Option[scala.math.BigDecimal] = { Option(dble.getTypeOfNumericSuperintMin) }

    /**
     * [set] TYPE_OF_NUMERIC_SUPERINT_MIN: {DECIMAL(19)} <br />
     * @param typeOfNumericSuperintMin The value of the column 'TYPE_OF_NUMERIC_SUPERINT_MIN'. (basically NotNull if update: for the constraint)
     */
    def typeOfNumericSuperintMin_=(typeOfNumericSuperintMin: Option[scala.math.BigDecimal]) = { dble.setTypeOfNumericSuperintMin(typeOfNumericSuperintMin.orNull.underlying) }

    /**
     * [get] TYPE_OF_NUMERIC_SUPERINT_MAX: {DECIMAL(38)} <br />
     * @return The value of the column 'TYPE_OF_NUMERIC_SUPERINT_MAX'. (NotNull but EmptyAllowed if null in database)
     */
    def typeOfNumericSuperintMax: Option[scala.math.BigDecimal] = { Option(dble.getTypeOfNumericSuperintMax) }

    /**
     * [set] TYPE_OF_NUMERIC_SUPERINT_MAX: {DECIMAL(38)} <br />
     * @param typeOfNumericSuperintMax The value of the column 'TYPE_OF_NUMERIC_SUPERINT_MAX'. (basically NotNull if update: for the constraint)
     */
    def typeOfNumericSuperintMax_=(typeOfNumericSuperintMax: Option[scala.math.BigDecimal]) = { dble.setTypeOfNumericSuperintMax(typeOfNumericSuperintMax.orNull.underlying) }

    /**
     * [get] TYPE_OF_NUMERIC_MAXDECIMAL: {DECIMAL(38, 38)} <br />
     * @return The value of the column 'TYPE_OF_NUMERIC_MAXDECIMAL'. (NotNull but EmptyAllowed if null in database)
     */
    def typeOfNumericMaxdecimal: Option[scala.math.BigDecimal] = { Option(dble.getTypeOfNumericMaxdecimal) }

    /**
     * [set] TYPE_OF_NUMERIC_MAXDECIMAL: {DECIMAL(38, 38)} <br />
     * @param typeOfNumericMaxdecimal The value of the column 'TYPE_OF_NUMERIC_MAXDECIMAL'. (basically NotNull if update: for the constraint)
     */
    def typeOfNumericMaxdecimal_=(typeOfNumericMaxdecimal: Option[scala.math.BigDecimal]) = { dble.setTypeOfNumericMaxdecimal(typeOfNumericMaxdecimal.orNull.underlying) }

    /**
     * [get] TYPE_OF_INTEGER: {INTEGER(10)} <br />
     * @return The value of the column 'TYPE_OF_INTEGER'. (NotNull but EmptyAllowed if null in database)
     */
    def typeOfInteger: Option[Int] = { Option(dble.getTypeOfInteger) }

    /**
     * [set] TYPE_OF_INTEGER: {INTEGER(10)} <br />
     * @param typeOfInteger The value of the column 'TYPE_OF_INTEGER'. (basically NotNull if update: for the constraint)
     */
    def typeOfInteger_=(typeOfInteger: Option[Int]) = { dble.setTypeOfInteger(typeOfInteger.map(int2Integer(_)).orNull) }

    /**
     * [get] TYPE_OF_BIGINT: {BIGINT(19)} <br />
     * @return The value of the column 'TYPE_OF_BIGINT'. (NotNull but EmptyAllowed if null in database)
     */
    def typeOfBigint: Option[Long] = { Option(dble.getTypeOfBigint) }

    /**
     * [set] TYPE_OF_BIGINT: {BIGINT(19)} <br />
     * @param typeOfBigint The value of the column 'TYPE_OF_BIGINT'. (basically NotNull if update: for the constraint)
     */
    def typeOfBigint_=(typeOfBigint: Option[Long]) = { dble.setTypeOfBigint(typeOfBigint.map(long2Long(_)).orNull) }

    /**
     * [get] TYPE_OF_DATE: {DATE(8)} <br />
     * @return The value of the column 'TYPE_OF_DATE'. (NotNull but EmptyAllowed if null in database)
     */
    def typeOfDate: Option[org.joda.time.LocalDate] = { Option(dble.getTypeOfDate) }

    /**
     * [set] TYPE_OF_DATE: {DATE(8)} <br />
     * @param typeOfDate The value of the column 'TYPE_OF_DATE'. (basically NotNull if update: for the constraint)
     */
    def typeOfDate_=(typeOfDate: Option[org.joda.time.LocalDate]) = { dble.setTypeOfDate(typeOfDate.orNull) }

    /**
     * [get] TYPE_OF_TIMESTAMP: {TIMESTAMP(23, 10)} <br />
     * @return The value of the column 'TYPE_OF_TIMESTAMP'. (NotNull but EmptyAllowed if null in database)
     */
    def typeOfTimestamp: Option[org.joda.time.LocalDateTime] = { Option(dble.getTypeOfTimestamp) }

    /**
     * [set] TYPE_OF_TIMESTAMP: {TIMESTAMP(23, 10)} <br />
     * @param typeOfTimestamp The value of the column 'TYPE_OF_TIMESTAMP'. (basically NotNull if update: for the constraint)
     */
    def typeOfTimestamp_=(typeOfTimestamp: Option[org.joda.time.LocalDateTime]) = { dble.setTypeOfTimestamp(typeOfTimestamp.orNull) }

    /**
     * [get] TYPE_OF_TIME: {TIME(6)} <br />
     * @return The value of the column 'TYPE_OF_TIME'. (NotNull but EmptyAllowed if null in database)
     */
    def typeOfTime: Option[org.joda.time.LocalTime] = { Option(dble.getTypeOfTime) }

    /**
     * [set] TYPE_OF_TIME: {TIME(6)} <br />
     * @param typeOfTime The value of the column 'TYPE_OF_TIME'. (basically NotNull if update: for the constraint)
     */
    def typeOfTime_=(typeOfTime: Option[org.joda.time.LocalTime]) = { dble.setTypeOfTime(typeOfTime.orNull) }

    /**
     * [get] TYPE_OF_BOOLEAN: {BOOLEAN(1)} <br />
     * @return The value of the column 'TYPE_OF_BOOLEAN'. (NotNull but EmptyAllowed if null in database)
     */
    def typeOfBoolean: Option[Boolean] = { Option(dble.getTypeOfBoolean) }

    /**
     * [set] TYPE_OF_BOOLEAN: {BOOLEAN(1)} <br />
     * @param typeOfBoolean The value of the column 'TYPE_OF_BOOLEAN'. (basically NotNull if update: for the constraint)
     */
    def typeOfBoolean_=(typeOfBoolean: Option[Boolean]) = { dble.setTypeOfBoolean(typeOfBoolean.map(boolean2Boolean(_)).orNull) }

    /**
     * [get] TYPE_OF_BINARY: {VARBINARY(2147483647)} <br />
     * @return The value of the column 'TYPE_OF_BINARY'. (NotNull but EmptyAllowed if null in database)
     */
    def typeOfBinary: Option[Array[Byte]] = { Option(dble.getTypeOfBinary) }

    /**
     * [set] TYPE_OF_BINARY: {VARBINARY(2147483647)} <br />
     * @param typeOfBinary The value of the column 'TYPE_OF_BINARY'. (basically NotNull if update: for the constraint)
     */
    def typeOfBinary_=(typeOfBinary: Option[Array[Byte]]) = { dble.setTypeOfBinary(typeOfBinary.orNull) }

    /**
     * [get] TYPE_OF_BLOB: {BLOB(2147483647)} <br />
     * @return The value of the column 'TYPE_OF_BLOB'. (NotNull but EmptyAllowed if null in database)
     */
    def typeOfBlob: Option[Array[Byte]] = { Option(dble.getTypeOfBlob) }

    /**
     * [set] TYPE_OF_BLOB: {BLOB(2147483647)} <br />
     * @param typeOfBlob The value of the column 'TYPE_OF_BLOB'. (basically NotNull if update: for the constraint)
     */
    def typeOfBlob_=(typeOfBlob: Option[Array[Byte]]) = { dble.setTypeOfBlob(typeOfBlob.orNull) }

    /**
     * [get] TYPE_OF_UUID: {UUID(2147483647)} <br />
     * @return The value of the column 'TYPE_OF_UUID'. (NotNull but EmptyAllowed if null in database)
     */
    def typeOfUuid: Option[Array[Byte]] = { Option(dble.getTypeOfUuid) }

    /**
     * [set] TYPE_OF_UUID: {UUID(2147483647)} <br />
     * @param typeOfUuid The value of the column 'TYPE_OF_UUID'. (basically NotNull if update: for the constraint)
     */
    def typeOfUuid_=(typeOfUuid: Option[Array[Byte]]) = { dble.setTypeOfUuid(typeOfUuid.orNull) }

    /**
     * [get] TYPE_OF_ARRAY: {ARRAY} <br />
     * @return The value of the column 'TYPE_OF_ARRAY'. (NotNull but EmptyAllowed if null in database)
     */
    def typeOfArray: Option[String] = { Option(dble.getTypeOfArray) }

    /**
     * [set] TYPE_OF_ARRAY: {ARRAY} <br />
     * @param typeOfArray The value of the column 'TYPE_OF_ARRAY'. (basically NotNull if update: for the constraint)
     */
    def typeOfArray_=(typeOfArray: Option[String]) = { dble.setTypeOfArray(typeOfArray.orNull) }

    /**
     * [get] TYPE_OF_OTHER: {OTHER(2147483647)} <br />
     * @return The value of the column 'TYPE_OF_OTHER'. (NotNull but EmptyAllowed if null in database)
     */
    def typeOfOther: Option[String] = { Option(dble.getTypeOfOther) }

    /**
     * [set] TYPE_OF_OTHER: {OTHER(2147483647)} <br />
     * @param typeOfOther The value of the column 'TYPE_OF_OTHER'. (basically NotNull if update: for the constraint)
     */
    def typeOfOther_=(typeOfOther: Option[String]) = { dble.setTypeOfOther(typeOfOther.orNull) }

    /**
     * [get] J_A_V_A_BEANS_PROPERTY: {VARCHAR(10)} <br />
     * @return The value of the column 'J_A_V_A_BEANS_PROPERTY'. (NotNull but EmptyAllowed if null in database)
     */
    def jAVABeansProperty: Option[String] = { Option(dble.getJAVABeansProperty) }

    /**
     * [set] J_A_V_A_BEANS_PROPERTY: {VARCHAR(10)} <br />
     * @param jAVABeansProperty The value of the column 'J_A_V_A_BEANS_PROPERTY'. (basically NotNull if update: for the constraint)
     */
    def jAVABeansProperty_=(jAVABeansProperty: Option[String]) = { dble.setJAVABeansProperty(jAVABeansProperty.orNull) }

    /**
     * [get] J_POP_BEANS_PROPERTY: {VARCHAR(10)} <br />
     * @return The value of the column 'J_POP_BEANS_PROPERTY'. (NotNull but EmptyAllowed if null in database)
     */
    def jPopBeansProperty: Option[String] = { Option(dble.getJPopBeansProperty) }

    /**
     * [set] J_POP_BEANS_PROPERTY: {VARCHAR(10)} <br />
     * @param jPopBeansProperty The value of the column 'J_POP_BEANS_PROPERTY'. (basically NotNull if update: for the constraint)
     */
    def jPopBeansProperty_=(jPopBeansProperty: Option[String]) = { dble.setJPopBeansProperty(jPopBeansProperty.orNull) }
}
