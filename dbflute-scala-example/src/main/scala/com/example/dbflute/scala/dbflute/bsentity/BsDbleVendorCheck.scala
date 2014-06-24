package com.example.dbflute.scala.dbflute.bsentity;

import scala.collection.JavaConverters._;

// #avoided same name type in Java and Scala
import java.lang.Long;
import java.lang.Boolean;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.Date;

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
 * The entity of VENDOR_CHECK as TABLE. <br />
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
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long vendorCheckId = entity.getVendorCheckId();
 * String typeOfChar = entity.getTypeOfChar();
 * String typeOfVarchar = entity.getTypeOfVarchar();
 * String typeOfClob = entity.getTypeOfClob();
 * String typeOfText = entity.getTypeOfText();
 * Integer typeOfNumericInteger = entity.getTypeOfNumericInteger();
 * Long typeOfNumericBigint = entity.getTypeOfNumericBigint();
 * java.math.BigDecimal typeOfNumericDecimal = entity.getTypeOfNumericDecimal();
 * Integer typeOfNumericIntegerMin = entity.getTypeOfNumericIntegerMin();
 * Integer typeOfNumericIntegerMax = entity.getTypeOfNumericIntegerMax();
 * Long typeOfNumericBigintMin = entity.getTypeOfNumericBigintMin();
 * Long typeOfNumericBigintMax = entity.getTypeOfNumericBigintMax();
 * java.math.BigDecimal typeOfNumericSuperintMin = entity.getTypeOfNumericSuperintMin();
 * java.math.BigDecimal typeOfNumericSuperintMax = entity.getTypeOfNumericSuperintMax();
 * java.math.BigDecimal typeOfNumericMaxdecimal = entity.getTypeOfNumericMaxdecimal();
 * Integer typeOfInteger = entity.getTypeOfInteger();
 * Long typeOfBigint = entity.getTypeOfBigint();
 * java.util.Date typeOfDate = entity.getTypeOfDate();
 * java.sql.Timestamp typeOfTimestamp = entity.getTypeOfTimestamp();
 * java.sql.Time typeOfTime = entity.getTypeOfTime();
 * Boolean typeOfBoolean = entity.getTypeOfBoolean();
 * Array[Byte] typeOfBinary = entity.getTypeOfBinary();
 * Array[Byte] typeOfBlob = entity.getTypeOfBlob();
 * Array[Byte] typeOfUuid = entity.getTypeOfUuid();
 * String typeOfArray = entity.getTypeOfArray();
 * String typeOfOther = entity.getTypeOfOther();
 * String jAVABeansProperty = entity.getJAVABeansProperty();
 * String jPopBeansProperty = entity.getJPopBeansProperty();
 * entity.setVendorCheckId(vendorCheckId);
 * entity.setTypeOfChar(typeOfChar);
 * entity.setTypeOfVarchar(typeOfVarchar);
 * entity.setTypeOfClob(typeOfClob);
 * entity.setTypeOfText(typeOfText);
 * entity.setTypeOfNumericInteger(typeOfNumericInteger);
 * entity.setTypeOfNumericBigint(typeOfNumericBigint);
 * entity.setTypeOfNumericDecimal(typeOfNumericDecimal);
 * entity.setTypeOfNumericIntegerMin(typeOfNumericIntegerMin);
 * entity.setTypeOfNumericIntegerMax(typeOfNumericIntegerMax);
 * entity.setTypeOfNumericBigintMin(typeOfNumericBigintMin);
 * entity.setTypeOfNumericBigintMax(typeOfNumericBigintMax);
 * entity.setTypeOfNumericSuperintMin(typeOfNumericSuperintMin);
 * entity.setTypeOfNumericSuperintMax(typeOfNumericSuperintMax);
 * entity.setTypeOfNumericMaxdecimal(typeOfNumericMaxdecimal);
 * entity.setTypeOfInteger(typeOfInteger);
 * entity.setTypeOfBigint(typeOfBigint);
 * entity.setTypeOfDate(typeOfDate);
 * entity.setTypeOfTimestamp(typeOfTimestamp);
 * entity.setTypeOfTime(typeOfTime);
 * entity.setTypeOfBoolean(typeOfBoolean);
 * entity.setTypeOfBinary(typeOfBinary);
 * entity.setTypeOfBlob(typeOfBlob);
 * entity.setTypeOfUuid(typeOfUuid);
 * entity.setTypeOfArray(typeOfArray);
 * entity.setTypeOfOther(typeOfOther);
 * entity.setJAVABeansProperty(jAVABeansProperty);
 * entity.setJPopBeansProperty(jPopBeansProperty);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
abstract class BsDbleVendorCheck extends Entity with DBableEntity[VendorCheck] with Serializable with Cloneable with DerivedMappable {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** VENDOR_CHECK_ID: {PK, NotNull, DECIMAL(16)} */
    protected var _vendorCheckId: Long = null;

    /** TYPE_OF_CHAR: {CHAR(3)} */
    protected var _typeOfChar: String = null;

    /** TYPE_OF_VARCHAR: {VARCHAR(32)} */
    protected var _typeOfVarchar: String = null;

    /** TYPE_OF_CLOB: {CLOB(2147483647)} */
    protected var _typeOfClob: String = null;

    /** TYPE_OF_TEXT: {CLOB(2147483647)} */
    protected var _typeOfText: String = null;

    /** TYPE_OF_NUMERIC_INTEGER: {DECIMAL(5)} */
    protected var _typeOfNumericInteger: Integer = null;

    /** TYPE_OF_NUMERIC_BIGINT: {DECIMAL(12)} */
    protected var _typeOfNumericBigint: Long = null;

    /** TYPE_OF_NUMERIC_DECIMAL: {DECIMAL(5, 3)} */
    protected var _typeOfNumericDecimal: java.math.BigDecimal = null;

    /** TYPE_OF_NUMERIC_INTEGER_MIN: {DECIMAL(1)} */
    protected var _typeOfNumericIntegerMin: Integer = null;

    /** TYPE_OF_NUMERIC_INTEGER_MAX: {DECIMAL(9)} */
    protected var _typeOfNumericIntegerMax: Integer = null;

    /** TYPE_OF_NUMERIC_BIGINT_MIN: {DECIMAL(10)} */
    protected var _typeOfNumericBigintMin: Long = null;

    /** TYPE_OF_NUMERIC_BIGINT_MAX: {DECIMAL(18)} */
    protected var _typeOfNumericBigintMax: Long = null;

    /** TYPE_OF_NUMERIC_SUPERINT_MIN: {DECIMAL(19)} */
    protected var _typeOfNumericSuperintMin: java.math.BigDecimal = null;

    /** TYPE_OF_NUMERIC_SUPERINT_MAX: {DECIMAL(38)} */
    protected var _typeOfNumericSuperintMax: java.math.BigDecimal = null;

    /** TYPE_OF_NUMERIC_MAXDECIMAL: {DECIMAL(38, 38)} */
    protected var _typeOfNumericMaxdecimal: java.math.BigDecimal = null;

    /** TYPE_OF_INTEGER: {INTEGER(10)} */
    protected var _typeOfInteger: Integer = null;

    /** TYPE_OF_BIGINT: {BIGINT(19)} */
    protected var _typeOfBigint: Long = null;

    /** TYPE_OF_DATE: {DATE(8)} */
    protected var _typeOfDate: java.util.Date = null;

    /** TYPE_OF_TIMESTAMP: {TIMESTAMP(23, 10)} */
    protected var _typeOfTimestamp: java.sql.Timestamp = null;

    /** TYPE_OF_TIME: {TIME(6)} */
    protected var _typeOfTime: java.sql.Time = null;

    /** TYPE_OF_BOOLEAN: {BOOLEAN(1)} */
    protected var _typeOfBoolean: Boolean = false;

    /** TYPE_OF_BINARY: {VARBINARY(2147483647)} */
    protected var _typeOfBinary: Array[Byte] = null;

    /** TYPE_OF_BLOB: {BLOB(2147483647)} */
    protected var _typeOfBlob: Array[Byte] = null;

    /** TYPE_OF_UUID: {UUID(2147483647)} */
    protected var _typeOfUuid: Array[Byte] = null;

    /** TYPE_OF_ARRAY: {ARRAY} */
    protected var _typeOfArray: String = null;

    /** TYPE_OF_OTHER: {OTHER(2147483647)} */
    protected var _typeOfOther: String = null;

    /** J_A_V_A_BEANS_PROPERTY: {VARCHAR(10)} */
    protected var _jAVABeansProperty: String = null;

    /** J_POP_BEANS_PROPERTY: {VARCHAR(10)} */
    protected var _jPopBeansProperty: String = null;

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
    def acceptImmutable(immu: VendorCheck): DbleVendorCheck = {
        setVendorCheckId(immu.vendorCheckId);
        setTypeOfChar(immu.typeOfChar.orNull);
        setTypeOfVarchar(immu.typeOfVarchar.orNull);
        setTypeOfClob(immu.typeOfClob.orNull);
        setTypeOfText(immu.typeOfText.orNull);
        setTypeOfNumericInteger(immu.typeOfNumericInteger.map(int2Integer(_)).orNull);
        setTypeOfNumericBigint(immu.typeOfNumericBigint.map(long2Long(_)).orNull);
        setTypeOfNumericDecimal(immu.typeOfNumericDecimal.orNull.asInstanceOf[java.math.BigDecimal]);
        setTypeOfNumericIntegerMin(immu.typeOfNumericIntegerMin.map(int2Integer(_)).orNull);
        setTypeOfNumericIntegerMax(immu.typeOfNumericIntegerMax.map(int2Integer(_)).orNull);
        setTypeOfNumericBigintMin(immu.typeOfNumericBigintMin.map(long2Long(_)).orNull);
        setTypeOfNumericBigintMax(immu.typeOfNumericBigintMax.map(long2Long(_)).orNull);
        setTypeOfNumericSuperintMin(immu.typeOfNumericSuperintMin.orNull.asInstanceOf[java.math.BigDecimal]);
        setTypeOfNumericSuperintMax(immu.typeOfNumericSuperintMax.orNull.asInstanceOf[java.math.BigDecimal]);
        setTypeOfNumericMaxdecimal(immu.typeOfNumericMaxdecimal.orNull.asInstanceOf[java.math.BigDecimal]);
        setTypeOfInteger(immu.typeOfInteger.map(int2Integer(_)).orNull);
        setTypeOfBigint(immu.typeOfBigint.map(long2Long(_)).orNull);
        setTypeOfDate(immu.typeOfDate.orNull);
        setTypeOfTimestamp(immu.typeOfTimestamp.orNull);
        setTypeOfTime(immu.typeOfTime.orNull);
        setTypeOfBoolean(immu.typeOfBoolean.map(boolean2Boolean(_)).orNull);
        setTypeOfBinary(immu.typeOfBinary.orNull);
        setTypeOfBlob(immu.typeOfBlob.orNull);
        setTypeOfUuid(immu.typeOfUuid.orNull);
        setTypeOfArray(immu.typeOfArray.orNull);
        setTypeOfOther(immu.typeOfOther.orNull);
        setJAVABeansProperty(immu.jAVABeansProperty.orNull);
        setJPopBeansProperty(immu.jPopBeansProperty.orNull);
        __uniqueDrivenProperties.clear();
        immu.getMyUniqueDrivenProperties().foreach(__uniqueDrivenProperties.addPropertyName(_))
        __modifiedProperties.clear();
        immu.getModifiedProperties().foreach(__modifiedProperties.addPropertyName(_))
        return this.asInstanceOf[DbleVendorCheck];
    }

    /**
     * {@inheritDoc}
     */
    def toImmutable(): VendorCheck = {
        return new VendorCheck(this.asInstanceOf[DbleVendorCheck]);
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    def getTableDbName(): String = {
        return "VENDOR_CHECK";
    }

    /**
     * {@inheritDoc}
     */
    def getTablePropertyName(): String = { // according to Java Beans rule
        return "vendorCheck";
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
        if (getVendorCheckId() == null) { return false; }
        return true;
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
    protected def toScalaList[ENTITY](javaList: Collection[ENTITY]): scala.collection.immutable.List[ENTITY] = {
        if (javaList == null) { return scala.collection.immutable.List(); }
        return scala.collection.immutable.List.fromArray(javaList.toArray).asInstanceOf[scala.collection.immutable.List[ENTITY]];
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
            case obj: BsDbleVendorCheck => {
                val other: BsDbleVendorCheck = obj.asInstanceOf[BsDbleVendorCheck];
                {(
                     xSV(getVendorCheckId(), other.getVendorCheckId())
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
        hs = xCH(hs, getVendorCheckId());
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
        sb.append(dm).append(getVendorCheckId());
        sb.append(dm).append(getTypeOfChar());
        sb.append(dm).append(getTypeOfVarchar());
        sb.append(dm).append(getTypeOfClob());
        sb.append(dm).append(getTypeOfText());
        sb.append(dm).append(getTypeOfNumericInteger());
        sb.append(dm).append(getTypeOfNumericBigint());
        sb.append(dm).append(getTypeOfNumericDecimal());
        sb.append(dm).append(getTypeOfNumericIntegerMin());
        sb.append(dm).append(getTypeOfNumericIntegerMax());
        sb.append(dm).append(getTypeOfNumericBigintMin());
        sb.append(dm).append(getTypeOfNumericBigintMax());
        sb.append(dm).append(getTypeOfNumericSuperintMin());
        sb.append(dm).append(getTypeOfNumericSuperintMax());
        sb.append(dm).append(getTypeOfNumericMaxdecimal());
        sb.append(dm).append(getTypeOfInteger());
        sb.append(dm).append(getTypeOfBigint());
        sb.append(dm).append(xfUD(getTypeOfDate()));
        sb.append(dm).append(getTypeOfTimestamp());
        sb.append(dm).append(getTypeOfTime());
        sb.append(dm).append(getTypeOfBoolean());
        sb.append(dm).append(getTypeOfBinary());
        sb.append(dm).append(getTypeOfBlob());
        sb.append(dm).append(getTypeOfUuid());
        sb.append(dm).append(getTypeOfArray());
        sb.append(dm).append(getTypeOfOther());
        sb.append(dm).append(getJAVABeansProperty());
        sb.append(dm).append(getJPopBeansProperty());
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected def xfUD(date: Date): String = { // formatUtilDate()
        return FunCustodial.toString(date, xgDP());
    }
    protected def xgDP(): String = { // getDatePattern
        return "yyyy-MM-dd";
    }
    protected def buildRelationString(): String = {
        return "";
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    override def clone(): DbleVendorCheck = {
        try {
            return super.clone().asInstanceOf[DbleVendorCheck];
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
     * [get] VENDOR_CHECK_ID: {PK, NotNull, DECIMAL(16)} <br />
     * @return The value of the column 'VENDOR_CHECK_ID'. (basically NotNull if selected: for the constraint)
     */
    def getVendorCheckId(): Long = {
        return _vendorCheckId;
    }

    /**
     * [set] VENDOR_CHECK_ID: {PK, NotNull, DECIMAL(16)} <br />
     * @param vendorCheckId The value of the column 'VENDOR_CHECK_ID'. (basically NotNull if update: for the constraint)
     */
    def setVendorCheckId(vendorCheckId: Long): Unit = {
        __modifiedProperties.addPropertyName("vendorCheckId");
        _vendorCheckId = vendorCheckId;
    }

    /**
     * [get] TYPE_OF_CHAR: {CHAR(3)} <br />
     * @return The value of the column 'TYPE_OF_CHAR'. (NullAllowed even if selected: for no constraint)
     */
    def getTypeOfChar(): String = {
        return convertEmptyToNull(_typeOfChar);
    }

    /**
     * [set] TYPE_OF_CHAR: {CHAR(3)} <br />
     * @param typeOfChar The value of the column 'TYPE_OF_CHAR'. (NullAllowed: null update allowed for no constraint)
     */
    def setTypeOfChar(typeOfChar: String): Unit = {
        __modifiedProperties.addPropertyName("typeOfChar");
        _typeOfChar = typeOfChar;
    }

    /**
     * [get] TYPE_OF_VARCHAR: {VARCHAR(32)} <br />
     * @return The value of the column 'TYPE_OF_VARCHAR'. (NullAllowed even if selected: for no constraint)
     */
    def getTypeOfVarchar(): String = {
        return convertEmptyToNull(_typeOfVarchar);
    }

    /**
     * [set] TYPE_OF_VARCHAR: {VARCHAR(32)} <br />
     * @param typeOfVarchar The value of the column 'TYPE_OF_VARCHAR'. (NullAllowed: null update allowed for no constraint)
     */
    def setTypeOfVarchar(typeOfVarchar: String): Unit = {
        __modifiedProperties.addPropertyName("typeOfVarchar");
        _typeOfVarchar = typeOfVarchar;
    }

    /**
     * [get] TYPE_OF_CLOB: {CLOB(2147483647)} <br />
     * @return The value of the column 'TYPE_OF_CLOB'. (NullAllowed even if selected: for no constraint)
     */
    def getTypeOfClob(): String = {
        return convertEmptyToNull(_typeOfClob);
    }

    /**
     * [set] TYPE_OF_CLOB: {CLOB(2147483647)} <br />
     * @param typeOfClob The value of the column 'TYPE_OF_CLOB'. (NullAllowed: null update allowed for no constraint)
     */
    def setTypeOfClob(typeOfClob: String): Unit = {
        __modifiedProperties.addPropertyName("typeOfClob");
        _typeOfClob = typeOfClob;
    }

    /**
     * [get] TYPE_OF_TEXT: {CLOB(2147483647)} <br />
     * @return The value of the column 'TYPE_OF_TEXT'. (NullAllowed even if selected: for no constraint)
     */
    def getTypeOfText(): String = {
        return convertEmptyToNull(_typeOfText);
    }

    /**
     * [set] TYPE_OF_TEXT: {CLOB(2147483647)} <br />
     * @param typeOfText The value of the column 'TYPE_OF_TEXT'. (NullAllowed: null update allowed for no constraint)
     */
    def setTypeOfText(typeOfText: String): Unit = {
        __modifiedProperties.addPropertyName("typeOfText");
        _typeOfText = typeOfText;
    }

    /**
     * [get] TYPE_OF_NUMERIC_INTEGER: {DECIMAL(5)} <br />
     * @return The value of the column 'TYPE_OF_NUMERIC_INTEGER'. (NullAllowed even if selected: for no constraint)
     */
    def getTypeOfNumericInteger(): Integer = {
        return _typeOfNumericInteger;
    }

    /**
     * [set] TYPE_OF_NUMERIC_INTEGER: {DECIMAL(5)} <br />
     * @param typeOfNumericInteger The value of the column 'TYPE_OF_NUMERIC_INTEGER'. (NullAllowed: null update allowed for no constraint)
     */
    def setTypeOfNumericInteger(typeOfNumericInteger: Integer): Unit = {
        __modifiedProperties.addPropertyName("typeOfNumericInteger");
        _typeOfNumericInteger = typeOfNumericInteger;
    }

    /**
     * [get] TYPE_OF_NUMERIC_BIGINT: {DECIMAL(12)} <br />
     * @return The value of the column 'TYPE_OF_NUMERIC_BIGINT'. (NullAllowed even if selected: for no constraint)
     */
    def getTypeOfNumericBigint(): Long = {
        return _typeOfNumericBigint;
    }

    /**
     * [set] TYPE_OF_NUMERIC_BIGINT: {DECIMAL(12)} <br />
     * @param typeOfNumericBigint The value of the column 'TYPE_OF_NUMERIC_BIGINT'. (NullAllowed: null update allowed for no constraint)
     */
    def setTypeOfNumericBigint(typeOfNumericBigint: Long): Unit = {
        __modifiedProperties.addPropertyName("typeOfNumericBigint");
        _typeOfNumericBigint = typeOfNumericBigint;
    }

    /**
     * [get] TYPE_OF_NUMERIC_DECIMAL: {DECIMAL(5, 3)} <br />
     * @return The value of the column 'TYPE_OF_NUMERIC_DECIMAL'. (NullAllowed even if selected: for no constraint)
     */
    def getTypeOfNumericDecimal(): java.math.BigDecimal = {
        return _typeOfNumericDecimal;
    }

    /**
     * [set] TYPE_OF_NUMERIC_DECIMAL: {DECIMAL(5, 3)} <br />
     * @param typeOfNumericDecimal The value of the column 'TYPE_OF_NUMERIC_DECIMAL'. (NullAllowed: null update allowed for no constraint)
     */
    def setTypeOfNumericDecimal(typeOfNumericDecimal: java.math.BigDecimal): Unit = {
        __modifiedProperties.addPropertyName("typeOfNumericDecimal");
        _typeOfNumericDecimal = typeOfNumericDecimal;
    }

    /**
     * [get] TYPE_OF_NUMERIC_INTEGER_MIN: {DECIMAL(1)} <br />
     * @return The value of the column 'TYPE_OF_NUMERIC_INTEGER_MIN'. (NullAllowed even if selected: for no constraint)
     */
    def getTypeOfNumericIntegerMin(): Integer = {
        return _typeOfNumericIntegerMin;
    }

    /**
     * [set] TYPE_OF_NUMERIC_INTEGER_MIN: {DECIMAL(1)} <br />
     * @param typeOfNumericIntegerMin The value of the column 'TYPE_OF_NUMERIC_INTEGER_MIN'. (NullAllowed: null update allowed for no constraint)
     */
    def setTypeOfNumericIntegerMin(typeOfNumericIntegerMin: Integer): Unit = {
        __modifiedProperties.addPropertyName("typeOfNumericIntegerMin");
        _typeOfNumericIntegerMin = typeOfNumericIntegerMin;
    }

    /**
     * [get] TYPE_OF_NUMERIC_INTEGER_MAX: {DECIMAL(9)} <br />
     * @return The value of the column 'TYPE_OF_NUMERIC_INTEGER_MAX'. (NullAllowed even if selected: for no constraint)
     */
    def getTypeOfNumericIntegerMax(): Integer = {
        return _typeOfNumericIntegerMax;
    }

    /**
     * [set] TYPE_OF_NUMERIC_INTEGER_MAX: {DECIMAL(9)} <br />
     * @param typeOfNumericIntegerMax The value of the column 'TYPE_OF_NUMERIC_INTEGER_MAX'. (NullAllowed: null update allowed for no constraint)
     */
    def setTypeOfNumericIntegerMax(typeOfNumericIntegerMax: Integer): Unit = {
        __modifiedProperties.addPropertyName("typeOfNumericIntegerMax");
        _typeOfNumericIntegerMax = typeOfNumericIntegerMax;
    }

    /**
     * [get] TYPE_OF_NUMERIC_BIGINT_MIN: {DECIMAL(10)} <br />
     * @return The value of the column 'TYPE_OF_NUMERIC_BIGINT_MIN'. (NullAllowed even if selected: for no constraint)
     */
    def getTypeOfNumericBigintMin(): Long = {
        return _typeOfNumericBigintMin;
    }

    /**
     * [set] TYPE_OF_NUMERIC_BIGINT_MIN: {DECIMAL(10)} <br />
     * @param typeOfNumericBigintMin The value of the column 'TYPE_OF_NUMERIC_BIGINT_MIN'. (NullAllowed: null update allowed for no constraint)
     */
    def setTypeOfNumericBigintMin(typeOfNumericBigintMin: Long): Unit = {
        __modifiedProperties.addPropertyName("typeOfNumericBigintMin");
        _typeOfNumericBigintMin = typeOfNumericBigintMin;
    }

    /**
     * [get] TYPE_OF_NUMERIC_BIGINT_MAX: {DECIMAL(18)} <br />
     * @return The value of the column 'TYPE_OF_NUMERIC_BIGINT_MAX'. (NullAllowed even if selected: for no constraint)
     */
    def getTypeOfNumericBigintMax(): Long = {
        return _typeOfNumericBigintMax;
    }

    /**
     * [set] TYPE_OF_NUMERIC_BIGINT_MAX: {DECIMAL(18)} <br />
     * @param typeOfNumericBigintMax The value of the column 'TYPE_OF_NUMERIC_BIGINT_MAX'. (NullAllowed: null update allowed for no constraint)
     */
    def setTypeOfNumericBigintMax(typeOfNumericBigintMax: Long): Unit = {
        __modifiedProperties.addPropertyName("typeOfNumericBigintMax");
        _typeOfNumericBigintMax = typeOfNumericBigintMax;
    }

    /**
     * [get] TYPE_OF_NUMERIC_SUPERINT_MIN: {DECIMAL(19)} <br />
     * @return The value of the column 'TYPE_OF_NUMERIC_SUPERINT_MIN'. (NullAllowed even if selected: for no constraint)
     */
    def getTypeOfNumericSuperintMin(): java.math.BigDecimal = {
        return _typeOfNumericSuperintMin;
    }

    /**
     * [set] TYPE_OF_NUMERIC_SUPERINT_MIN: {DECIMAL(19)} <br />
     * @param typeOfNumericSuperintMin The value of the column 'TYPE_OF_NUMERIC_SUPERINT_MIN'. (NullAllowed: null update allowed for no constraint)
     */
    def setTypeOfNumericSuperintMin(typeOfNumericSuperintMin: java.math.BigDecimal): Unit = {
        __modifiedProperties.addPropertyName("typeOfNumericSuperintMin");
        _typeOfNumericSuperintMin = typeOfNumericSuperintMin;
    }

    /**
     * [get] TYPE_OF_NUMERIC_SUPERINT_MAX: {DECIMAL(38)} <br />
     * @return The value of the column 'TYPE_OF_NUMERIC_SUPERINT_MAX'. (NullAllowed even if selected: for no constraint)
     */
    def getTypeOfNumericSuperintMax(): java.math.BigDecimal = {
        return _typeOfNumericSuperintMax;
    }

    /**
     * [set] TYPE_OF_NUMERIC_SUPERINT_MAX: {DECIMAL(38)} <br />
     * @param typeOfNumericSuperintMax The value of the column 'TYPE_OF_NUMERIC_SUPERINT_MAX'. (NullAllowed: null update allowed for no constraint)
     */
    def setTypeOfNumericSuperintMax(typeOfNumericSuperintMax: java.math.BigDecimal): Unit = {
        __modifiedProperties.addPropertyName("typeOfNumericSuperintMax");
        _typeOfNumericSuperintMax = typeOfNumericSuperintMax;
    }

    /**
     * [get] TYPE_OF_NUMERIC_MAXDECIMAL: {DECIMAL(38, 38)} <br />
     * @return The value of the column 'TYPE_OF_NUMERIC_MAXDECIMAL'. (NullAllowed even if selected: for no constraint)
     */
    def getTypeOfNumericMaxdecimal(): java.math.BigDecimal = {
        return _typeOfNumericMaxdecimal;
    }

    /**
     * [set] TYPE_OF_NUMERIC_MAXDECIMAL: {DECIMAL(38, 38)} <br />
     * @param typeOfNumericMaxdecimal The value of the column 'TYPE_OF_NUMERIC_MAXDECIMAL'. (NullAllowed: null update allowed for no constraint)
     */
    def setTypeOfNumericMaxdecimal(typeOfNumericMaxdecimal: java.math.BigDecimal): Unit = {
        __modifiedProperties.addPropertyName("typeOfNumericMaxdecimal");
        _typeOfNumericMaxdecimal = typeOfNumericMaxdecimal;
    }

    /**
     * [get] TYPE_OF_INTEGER: {INTEGER(10)} <br />
     * @return The value of the column 'TYPE_OF_INTEGER'. (NullAllowed even if selected: for no constraint)
     */
    def getTypeOfInteger(): Integer = {
        return _typeOfInteger;
    }

    /**
     * [set] TYPE_OF_INTEGER: {INTEGER(10)} <br />
     * @param typeOfInteger The value of the column 'TYPE_OF_INTEGER'. (NullAllowed: null update allowed for no constraint)
     */
    def setTypeOfInteger(typeOfInteger: Integer): Unit = {
        __modifiedProperties.addPropertyName("typeOfInteger");
        _typeOfInteger = typeOfInteger;
    }

    /**
     * [get] TYPE_OF_BIGINT: {BIGINT(19)} <br />
     * @return The value of the column 'TYPE_OF_BIGINT'. (NullAllowed even if selected: for no constraint)
     */
    def getTypeOfBigint(): Long = {
        return _typeOfBigint;
    }

    /**
     * [set] TYPE_OF_BIGINT: {BIGINT(19)} <br />
     * @param typeOfBigint The value of the column 'TYPE_OF_BIGINT'. (NullAllowed: null update allowed for no constraint)
     */
    def setTypeOfBigint(typeOfBigint: Long): Unit = {
        __modifiedProperties.addPropertyName("typeOfBigint");
        _typeOfBigint = typeOfBigint;
    }

    /**
     * [get] TYPE_OF_DATE: {DATE(8)} <br />
     * @return The value of the column 'TYPE_OF_DATE'. (NullAllowed even if selected: for no constraint)
     */
    def getTypeOfDate(): java.util.Date = {
        return _typeOfDate;
    }

    /**
     * [set] TYPE_OF_DATE: {DATE(8)} <br />
     * @param typeOfDate The value of the column 'TYPE_OF_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    def setTypeOfDate(typeOfDate: java.util.Date): Unit = {
        __modifiedProperties.addPropertyName("typeOfDate");
        _typeOfDate = typeOfDate;
    }

    /**
     * [get] TYPE_OF_TIMESTAMP: {TIMESTAMP(23, 10)} <br />
     * @return The value of the column 'TYPE_OF_TIMESTAMP'. (NullAllowed even if selected: for no constraint)
     */
    def getTypeOfTimestamp(): java.sql.Timestamp = {
        return _typeOfTimestamp;
    }

    /**
     * [set] TYPE_OF_TIMESTAMP: {TIMESTAMP(23, 10)} <br />
     * @param typeOfTimestamp The value of the column 'TYPE_OF_TIMESTAMP'. (NullAllowed: null update allowed for no constraint)
     */
    def setTypeOfTimestamp(typeOfTimestamp: java.sql.Timestamp): Unit = {
        __modifiedProperties.addPropertyName("typeOfTimestamp");
        _typeOfTimestamp = typeOfTimestamp;
    }

    /**
     * [get] TYPE_OF_TIME: {TIME(6)} <br />
     * @return The value of the column 'TYPE_OF_TIME'. (NullAllowed even if selected: for no constraint)
     */
    def getTypeOfTime(): java.sql.Time = {
        return _typeOfTime;
    }

    /**
     * [set] TYPE_OF_TIME: {TIME(6)} <br />
     * @param typeOfTime The value of the column 'TYPE_OF_TIME'. (NullAllowed: null update allowed for no constraint)
     */
    def setTypeOfTime(typeOfTime: java.sql.Time): Unit = {
        __modifiedProperties.addPropertyName("typeOfTime");
        _typeOfTime = typeOfTime;
    }

    /**
     * [get] TYPE_OF_BOOLEAN: {BOOLEAN(1)} <br />
     * @return The value of the column 'TYPE_OF_BOOLEAN'. (NullAllowed even if selected: for no constraint)
     */
    def getTypeOfBoolean(): Boolean = {
        return _typeOfBoolean;
    }

    /**
     * [set] TYPE_OF_BOOLEAN: {BOOLEAN(1)} <br />
     * @param typeOfBoolean The value of the column 'TYPE_OF_BOOLEAN'. (NullAllowed: null update allowed for no constraint)
     */
    def setTypeOfBoolean(typeOfBoolean: Boolean): Unit = {
        __modifiedProperties.addPropertyName("typeOfBoolean");
        _typeOfBoolean = typeOfBoolean;
    }

    /**
     * [get] TYPE_OF_BINARY: {VARBINARY(2147483647)} <br />
     * @return The value of the column 'TYPE_OF_BINARY'. (NullAllowed even if selected: for no constraint)
     */
    def getTypeOfBinary(): Array[Byte] = {
        return _typeOfBinary;
    }

    /**
     * [set] TYPE_OF_BINARY: {VARBINARY(2147483647)} <br />
     * @param typeOfBinary The value of the column 'TYPE_OF_BINARY'. (NullAllowed: null update allowed for no constraint)
     */
    def setTypeOfBinary(typeOfBinary: Array[Byte]): Unit = {
        __modifiedProperties.addPropertyName("typeOfBinary");
        _typeOfBinary = typeOfBinary;
    }

    /**
     * [get] TYPE_OF_BLOB: {BLOB(2147483647)} <br />
     * @return The value of the column 'TYPE_OF_BLOB'. (NullAllowed even if selected: for no constraint)
     */
    def getTypeOfBlob(): Array[Byte] = {
        return _typeOfBlob;
    }

    /**
     * [set] TYPE_OF_BLOB: {BLOB(2147483647)} <br />
     * @param typeOfBlob The value of the column 'TYPE_OF_BLOB'. (NullAllowed: null update allowed for no constraint)
     */
    def setTypeOfBlob(typeOfBlob: Array[Byte]): Unit = {
        __modifiedProperties.addPropertyName("typeOfBlob");
        _typeOfBlob = typeOfBlob;
    }

    /**
     * [get] TYPE_OF_UUID: {UUID(2147483647)} <br />
     * @return The value of the column 'TYPE_OF_UUID'. (NullAllowed even if selected: for no constraint)
     */
    def getTypeOfUuid(): Array[Byte] = {
        return _typeOfUuid;
    }

    /**
     * [set] TYPE_OF_UUID: {UUID(2147483647)} <br />
     * @param typeOfUuid The value of the column 'TYPE_OF_UUID'. (NullAllowed: null update allowed for no constraint)
     */
    def setTypeOfUuid(typeOfUuid: Array[Byte]): Unit = {
        __modifiedProperties.addPropertyName("typeOfUuid");
        _typeOfUuid = typeOfUuid;
    }

    /**
     * [get] TYPE_OF_ARRAY: {ARRAY} <br />
     * @return The value of the column 'TYPE_OF_ARRAY'. (NullAllowed even if selected: for no constraint)
     */
    def getTypeOfArray(): String = {
        return convertEmptyToNull(_typeOfArray);
    }

    /**
     * [set] TYPE_OF_ARRAY: {ARRAY} <br />
     * @param typeOfArray The value of the column 'TYPE_OF_ARRAY'. (NullAllowed: null update allowed for no constraint)
     */
    def setTypeOfArray(typeOfArray: String): Unit = {
        __modifiedProperties.addPropertyName("typeOfArray");
        _typeOfArray = typeOfArray;
    }

    /**
     * [get] TYPE_OF_OTHER: {OTHER(2147483647)} <br />
     * @return The value of the column 'TYPE_OF_OTHER'. (NullAllowed even if selected: for no constraint)
     */
    def getTypeOfOther(): String = {
        return convertEmptyToNull(_typeOfOther);
    }

    /**
     * [set] TYPE_OF_OTHER: {OTHER(2147483647)} <br />
     * @param typeOfOther The value of the column 'TYPE_OF_OTHER'. (NullAllowed: null update allowed for no constraint)
     */
    def setTypeOfOther(typeOfOther: String): Unit = {
        __modifiedProperties.addPropertyName("typeOfOther");
        _typeOfOther = typeOfOther;
    }

    /**
     * [get] J_A_V_A_BEANS_PROPERTY: {VARCHAR(10)} <br />
     * @return The value of the column 'J_A_V_A_BEANS_PROPERTY'. (NullAllowed even if selected: for no constraint)
     */
    def getJAVABeansProperty(): String = {
        return convertEmptyToNull(_jAVABeansProperty);
    }

    /**
     * [set] J_A_V_A_BEANS_PROPERTY: {VARCHAR(10)} <br />
     * @param jAVABeansProperty The value of the column 'J_A_V_A_BEANS_PROPERTY'. (NullAllowed: null update allowed for no constraint)
     */
    def setJAVABeansProperty(jAVABeansProperty: String): Unit = {
        __modifiedProperties.addPropertyName("JAVABeansProperty");
        _jAVABeansProperty = jAVABeansProperty;
    }

    /**
     * [get] J_POP_BEANS_PROPERTY: {VARCHAR(10)} <br />
     * @return The value of the column 'J_POP_BEANS_PROPERTY'. (NullAllowed even if selected: for no constraint)
     */
    def getJPopBeansProperty(): String = {
        return convertEmptyToNull(_jPopBeansProperty);
    }

    /**
     * [set] J_POP_BEANS_PROPERTY: {VARCHAR(10)} <br />
     * @param jPopBeansProperty The value of the column 'J_POP_BEANS_PROPERTY'. (NullAllowed: null update allowed for no constraint)
     */
    def setJPopBeansProperty(jPopBeansProperty: String): Unit = {
        __modifiedProperties.addPropertyName("JPopBeansProperty");
        _jPopBeansProperty = jPopBeansProperty;
    }

    protected def convertEmptyToNull(value: String): String = {
        return FunCustodial.convertEmptyToNull(value);
    }
}
