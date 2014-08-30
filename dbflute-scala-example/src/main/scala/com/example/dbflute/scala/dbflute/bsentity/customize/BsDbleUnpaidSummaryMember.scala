package com.example.dbflute.scala.dbflute.bsentity.customize;

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
import com.example.dbflute.scala.dbflute.exentity.customize._;
import com.example.dbflute.scala.dbflute.exentity._;

/**
 * The entity of UnpaidSummaryMember. <br />
 * <pre>
 * [primary-key]
 *     UNPAID_MAN_ID
 * 
 * [column]
 *     UNPAID_MAN_ID, UNPAID_MAN_NAME, UNPAID_PRICE_SUMMARY, STATUS_NAME
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
 * Integer unpaidManId = entity.getUnpaidManId();
 * String unpaidManName = entity.getUnpaidManName();
 * Long unpaidPriceSummary = entity.getUnpaidPriceSummary();
 * String statusName = entity.getStatusName();
 * entity.setUnpaidManId(unpaidManId);
 * entity.setUnpaidManName(unpaidManName);
 * entity.setUnpaidPriceSummary(unpaidPriceSummary);
 * entity.setStatusName(statusName);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
abstract class BsDbleUnpaidSummaryMember extends Entity with DBableEntity[UnpaidSummaryMember] with Serializable with Cloneable with DerivedMappable {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** (会員ID)UNPAID_MAN_ID: {PK, INTEGER(10), refers to MEMBER.MEMBER_ID} */
    protected var _unpaidManId: Integer = null;

    /** (会員名称)UNPAID_MAN_NAME: {VARCHAR(200), refers to MEMBER.MEMBER_NAME} */
    protected var _unpaidManName: String = null;

    /** UNPAID_PRICE_SUMMARY: {BIGINT(10)} */
    protected var _unpaidPriceSummary: Long = null;

    /** (会員ステータス名称)STATUS_NAME: {VARCHAR(50), refers to MEMBER_STATUS.MEMBER_STATUS_NAME} */
    protected var _statusName: String = null;

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
    def acceptImmutable(immu: UnpaidSummaryMember): DbleUnpaidSummaryMember = {
        setUnpaidManId(immu.unpaidManId.map(int2Integer(_)).orNull);
        setUnpaidManName(immu.unpaidManName.orNull);
        setUnpaidPriceSummary(immu.unpaidPriceSummary.map(long2Long(_)).orNull);
        setStatusName(immu.statusName.orNull);
        __uniqueDrivenProperties.clear();
        immu.getMyUniqueDrivenProperties().foreach(__uniqueDrivenProperties.addPropertyName(_))
        __modifiedProperties.clear();
        immu.getModifiedProperties().foreach(__modifiedProperties.addPropertyName(_))
        return this.asInstanceOf[DbleUnpaidSummaryMember];
    }

    /**
     * {@inheritDoc}
     */
    def toImmutable(): UnpaidSummaryMember = {
        return new UnpaidSummaryMember(this.asInstanceOf[DbleUnpaidSummaryMember]);
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    def getTableDbName(): String = {
        return "UnpaidSummaryMember";
    }

    /**
     * {@inheritDoc}
     */
    def getTablePropertyName(): String = { // according to Java Beans rule
        return "unpaidSummaryMember";
    }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /**
     * {@inheritDoc}
     */
    def getDBMeta(): DBMeta = {
        return com.example.dbflute.scala.dbflute.bsentity.customize.dbmeta.UnpaidSummaryMemberDbm;
    }

    // ===================================================================================
    //                                                                         Primary Key
    //                                                                         ===========
    /**
     * {@inheritDoc}
     */
    def hasPrimaryKeyValue(): scala.Boolean = {
        if (getUnpaidManId() == null) { return false; }
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
    protected var __innerDomain: DbleMember = null;

    protected def innerDomain(): DbleMember = {
        if (__innerDomain == null) {
            __innerDomain = new DbleMember();
        }
        return __innerDomain;
    }

    /**
     * Prepare the inner instance of domain entity (basically for LoadReferrer).
     * <pre>
     * List&lt;UnpaidSummaryMember&gt; memberList = memberBhv.outsideSql()...;
     * List&lt;Member&gt; domainList = new ArrayList&lt;Member&gt;();
     * for (UnpaidSummaryMember member : memberList) {
     *     domainList.add(member.<span style="color: #DD4747">prepareDomain()</span>);
     * }
     * memberBhv.<span style="color: #DD4747">loadPurchaseList</span>(domainList, new ConditionBeanSetupper...);
     * for (UnpaidSummaryMember member : memberList) {
     *     Purchase purchase = member.<span style="color: #DD4747">getPurchaseList()</span>; <span style="color: #3F7E5E">// you can get it</span>
     *     ...
     * }
     * </pre>
     * @return The domain entity for this customize entity. (NotNull)
     */
    def prepareDomain(): DbleMember = {
        innerDomain().setMemberId(getUnpaidManId());
        return innerDomain();
    }

    /**
     * (会員住所情報)MEMBER_ADDRESS by MEMBER_ID, named 'memberAddressList'.
     * @return The entity list of referrer property 'memberAddressList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    def getMemberAddressList(): List[DbleMemberAddress] = {
        return innerDomain().getMemberAddressList();
    }

    /**
     * (会員フォローイング)MEMBER_FOLLOWING by MY_MEMBER_ID, named 'memberFollowingByMyMemberIdList'.
     * @return The entity list of referrer property 'memberFollowingByMyMemberIdList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    def getMemberFollowingByMyMemberIdList(): List[DbleMemberFollowing] = {
        return innerDomain().getMemberFollowingByMyMemberIdList();
    }

    /**
     * (会員フォローイング)MEMBER_FOLLOWING by YOUR_MEMBER_ID, named 'memberFollowingByYourMemberIdList'.
     * @return The entity list of referrer property 'memberFollowingByYourMemberIdList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    def getMemberFollowingByYourMemberIdList(): List[DbleMemberFollowing] = {
        return innerDomain().getMemberFollowingByYourMemberIdList();
    }

    /**
     * (会員ログイン)MEMBER_LOGIN by MEMBER_ID, named 'memberLoginList'.
     * @return The entity list of referrer property 'memberLoginList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    def getMemberLoginList(): List[DbleMemberLogin] = {
        return innerDomain().getMemberLoginList();
    }

    /**
     * (購入)PURCHASE by MEMBER_ID, named 'purchaseList'.
     * @return The entity list of referrer property 'purchaseList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    def getPurchaseList(): List[DblePurchase] = {
        return innerDomain().getPurchaseList();
    }

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
     * <pre>
     * mapping type:
     *  count()      : Integer
     *  max(), min() : (same as property type of the column)
     *  sum(), avg() : BigDecimal
     *
     * e.g. use count()
     *  Integer loginCount = member.derived("$LOGIN_COUNT");
     * </pre>
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
            case obj: BsDbleUnpaidSummaryMember => {
                val other: BsDbleUnpaidSummaryMember = obj.asInstanceOf[BsDbleUnpaidSummaryMember];
                {(
                     xSV(getUnpaidManId(), other.getUnpaidManId())
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
        hs = xCH(hs, getUnpaidManId());
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
        sb.append(dm).append(getUnpaidManId());
        sb.append(dm).append(getUnpaidManName());
        sb.append(dm).append(getUnpaidPriceSummary());
        sb.append(dm).append(getStatusName());
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
    override def clone(): DbleUnpaidSummaryMember = {
        try {
            return super.clone().asInstanceOf[DbleUnpaidSummaryMember];
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
     * [get] (会員ID)UNPAID_MAN_ID: {PK, INTEGER(10), refers to MEMBER.MEMBER_ID} <br />
     * @return The value of the column 'UNPAID_MAN_ID'. (NullAllowed even if selected: for no constraint)
     */
    def getUnpaidManId(): Integer = {
        return _unpaidManId;
    }

    /**
     * [set] (会員ID)UNPAID_MAN_ID: {PK, INTEGER(10), refers to MEMBER.MEMBER_ID} <br />
     * @param unpaidManId The value of the column 'UNPAID_MAN_ID'. (NullAllowed: null update allowed for no constraint)
     */
    def setUnpaidManId(unpaidManId: Integer): Unit = {
        __modifiedProperties.addPropertyName("unpaidManId");
        _unpaidManId = unpaidManId;
    }

    /**
     * [get] (会員名称)UNPAID_MAN_NAME: {VARCHAR(200), refers to MEMBER.MEMBER_NAME} <br />
     * @return The value of the column 'UNPAID_MAN_NAME'. (NullAllowed even if selected: for no constraint)
     */
    def getUnpaidManName(): String = {
        return convertEmptyToNull(_unpaidManName);
    }

    /**
     * [set] (会員名称)UNPAID_MAN_NAME: {VARCHAR(200), refers to MEMBER.MEMBER_NAME} <br />
     * @param unpaidManName The value of the column 'UNPAID_MAN_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    def setUnpaidManName(unpaidManName: String): Unit = {
        __modifiedProperties.addPropertyName("unpaidManName");
        _unpaidManName = unpaidManName;
    }

    /**
     * [get] UNPAID_PRICE_SUMMARY: {BIGINT(10)} <br />
     * @return The value of the column 'UNPAID_PRICE_SUMMARY'. (NullAllowed even if selected: for no constraint)
     */
    def getUnpaidPriceSummary(): Long = {
        return _unpaidPriceSummary;
    }

    /**
     * [set] UNPAID_PRICE_SUMMARY: {BIGINT(10)} <br />
     * @param unpaidPriceSummary The value of the column 'UNPAID_PRICE_SUMMARY'. (NullAllowed: null update allowed for no constraint)
     */
    def setUnpaidPriceSummary(unpaidPriceSummary: Long): Unit = {
        __modifiedProperties.addPropertyName("unpaidPriceSummary");
        _unpaidPriceSummary = unpaidPriceSummary;
    }

    /**
     * [get] (会員ステータス名称)STATUS_NAME: {VARCHAR(50), refers to MEMBER_STATUS.MEMBER_STATUS_NAME} <br />
     * @return The value of the column 'STATUS_NAME'. (NullAllowed even if selected: for no constraint)
     */
    def getStatusName(): String = {
        return convertEmptyToNull(_statusName);
    }

    /**
     * [set] (会員ステータス名称)STATUS_NAME: {VARCHAR(50), refers to MEMBER_STATUS.MEMBER_STATUS_NAME} <br />
     * @param statusName The value of the column 'STATUS_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    def setStatusName(statusName: String): Unit = {
        __modifiedProperties.addPropertyName("statusName");
        _statusName = statusName;
    }

    protected def convertEmptyToNull(value: String): String = {
        return FunCustodial.convertEmptyToNull(value);
    }
}
