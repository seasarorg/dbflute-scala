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
 * The entity of (会員フォローイング)MEMBER_FOLLOWING as TABLE. <br />
 * <pre>
 * [primary-key]
 *     MEMBER_FOLLOWING_ID
 * 
 * [column]
 *     MEMBER_FOLLOWING_ID, MY_MEMBER_ID, YOUR_MEMBER_ID, FOLLOW_DATETIME
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     MEMBER_FOLLOWING_ID
 * 
 * [version-no]
 *     
 * 
 * [foreign table]
 *     MEMBER
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     memberByMyMemberId, memberByYourMemberId
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long memberFollowingId = entity.getMemberFollowingId();
 * Integer myMemberId = entity.getMyMemberId();
 * Integer yourMemberId = entity.getYourMemberId();
 * java.sql.Timestamp followDatetime = entity.getFollowDatetime();
 * entity.setMemberFollowingId(memberFollowingId);
 * entity.setMyMemberId(myMemberId);
 * entity.setYourMemberId(yourMemberId);
 * entity.setFollowDatetime(followDatetime);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
abstract class BsDbleMemberFollowing extends Entity with DBableEntity[MemberFollowing] with Serializable with Cloneable with DerivedMappable {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** (会員フォローイングID)MEMBER_FOLLOWING_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected var _memberFollowingId: Long = null;

    /** (わたし)MY_MEMBER_ID: {UQ+, IX+, NotNull, INTEGER(10), FK to MEMBER} */
    protected var _myMemberId: Integer = null;

    /** (あなた)YOUR_MEMBER_ID: {+UQ, IX+, NotNull, INTEGER(10), FK to MEMBER} */
    protected var _yourMemberId: Integer = null;

    /** (その瞬間)FOLLOW_DATETIME: {IX, NotNull, TIMESTAMP(23, 10)} */
    protected var _followDatetime: java.sql.Timestamp = null;

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
    def acceptImmutable(immu: MemberFollowing): DbleMemberFollowing = {
        setMemberFollowingId(immu.memberFollowingId);
        setMyMemberId(immu.myMemberId);
        setYourMemberId(immu.yourMemberId);
        setFollowDatetime(immu.followDatetime);
        setMemberByMyMemberId(immu.memberByMyMemberId.map(new DbleMember().acceptImmutable(_)))
        setMemberByYourMemberId(immu.memberByYourMemberId.map(new DbleMember().acceptImmutable(_)))
        __uniqueDrivenProperties.clear();
        immu.getMyUniqueDrivenProperties().foreach(__uniqueDrivenProperties.addPropertyName(_))
        __modifiedProperties.clear();
        immu.getModifiedProperties().foreach(__modifiedProperties.addPropertyName(_))
        return this.asInstanceOf[DbleMemberFollowing];
    }

    /**
     * {@inheritDoc}
     */
    def toImmutable(): MemberFollowing = {
        return new MemberFollowing(this.asInstanceOf[DbleMemberFollowing]);
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    def getTableDbName(): String = {
        return "MEMBER_FOLLOWING";
    }

    /**
     * {@inheritDoc}
     */
    def getTablePropertyName(): String = { // according to Java Beans rule
        return "memberFollowing";
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
        if (getMemberFollowingId() == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br />
     * You can update the entity by the key when entity update (NOT batch update).
     * @param myMemberId (わたし): UQ+, IX+, NotNull, INTEGER(10), FK to MEMBER. (NotNull)
     * @param yourMemberId (あなた): +UQ, IX+, NotNull, INTEGER(10), FK to MEMBER. (NotNull)
     */
    def uniqueBy(myMemberId: Integer, yourMemberId: Integer): Unit = {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("myMemberId");
        __uniqueDrivenProperties.addPropertyName("yourMemberId");
        setMyMemberId(myMemberId);setYourMemberId(yourMemberId);
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
    /** (会員)MEMBER by my MY_MEMBER_ID, named 'memberByMyMemberId'. */
    protected var _memberByMyMemberId: Option[DbleMember] = null;

    /**
     * [get] (会員)MEMBER by my MY_MEMBER_ID, named 'memberByMyMemberId'.
     * @return The entity of foreign property 'memberByMyMemberId'. (EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    def getMemberByMyMemberId(): Option[DbleMember] = {
        return if (_memberByMyMemberId != null) { _memberByMyMemberId; } else { Option.empty; }
    }

    /**
     * [set] (会員)MEMBER by my MY_MEMBER_ID, named 'memberByMyMemberId'.
     * @param memberByMyMemberId The entity of foreign property 'memberByMyMemberId'. (EmptyAllowed)
     */
    def setMemberByMyMemberId(memberByMyMemberId: Option[DbleMember]): Unit = {
        _memberByMyMemberId = memberByMyMemberId;
    }

    /**
     * [convert] (会員)MEMBER by my MY_MEMBER_ID, named 'memberByMyMemberId'.
     * @return The new-created immutable entity of foreign property 'memberByMyMemberId'. (NotNull)
     */
    def toImmutableMemberByMyMemberId(): Option[Member] = {
        return getMemberByMyMemberId().map(_.toImmutable());
    }

    /** (会員)MEMBER by my YOUR_MEMBER_ID, named 'memberByYourMemberId'. */
    protected var _memberByYourMemberId: Option[DbleMember] = null;

    /**
     * [get] (会員)MEMBER by my YOUR_MEMBER_ID, named 'memberByYourMemberId'.
     * @return The entity of foreign property 'memberByYourMemberId'. (EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    def getMemberByYourMemberId(): Option[DbleMember] = {
        return if (_memberByYourMemberId != null) { _memberByYourMemberId; } else { Option.empty; }
    }

    /**
     * [set] (会員)MEMBER by my YOUR_MEMBER_ID, named 'memberByYourMemberId'.
     * @param memberByYourMemberId The entity of foreign property 'memberByYourMemberId'. (EmptyAllowed)
     */
    def setMemberByYourMemberId(memberByYourMemberId: Option[DbleMember]): Unit = {
        _memberByYourMemberId = memberByYourMemberId;
    }

    /**
     * [convert] (会員)MEMBER by my YOUR_MEMBER_ID, named 'memberByYourMemberId'.
     * @return The new-created immutable entity of foreign property 'memberByYourMemberId'. (NotNull)
     */
    def toImmutableMemberByYourMemberId(): Option[Member] = {
        return getMemberByYourMemberId().map(_.toImmutable());
    }

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
            case obj: BsDbleMemberFollowing => {
                val other: BsDbleMemberFollowing = obj.asInstanceOf[BsDbleMemberFollowing];
                {(
                     xSV(getMemberFollowingId(), other.getMemberFollowingId())
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
        hs = xCH(hs, getMemberFollowingId());
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
        val li: String = "\n  ";
        if (_memberByMyMemberId != null)
        { sb.append(li).append(xbRDS(_memberByMyMemberId, "memberByMyMemberId")); }
        if (_memberByYourMemberId != null)
        { sb.append(li).append(xbRDS(_memberByYourMemberId, "memberByYourMemberId")); }
        return sb.toString();
    }
    protected def xbRDS(et: Entity, name: String): String = {
        return et.buildDisplayString(name, true, true);
    }
    protected def xbRDS[ET <: Entity](et: Option[ET], name: String): String = {
        return et.get.buildDisplayString(name, true, true);
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
        sb.append(dm).append(getMemberFollowingId());
        sb.append(dm).append(getMyMemberId());
        sb.append(dm).append(getYourMemberId());
        sb.append(dm).append(getFollowDatetime());
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected def buildRelationString(): String = {
        val sb: StringBuilder = new StringBuilder();
        val cm: String = ",  ";
        if (_memberByMyMemberId != null) { sb.append(cm).append("memberByMyMemberId"); }
        if (_memberByYourMemberId != null) { sb.append(cm).append("memberByYourMemberId"); }
        if (sb.length() > cm.length()) {
            sb.delete(0, cm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    override def clone(): DbleMemberFollowing = {
        try {
            return super.clone().asInstanceOf[DbleMemberFollowing];
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
     * [get] (会員フォローイングID)MEMBER_FOLLOWING_ID: {PK, ID, NotNull, BIGINT(19)} <br />
     * @return The value of the column 'MEMBER_FOLLOWING_ID'. (basically NotNull if selected: for the constraint)
     */
    def getMemberFollowingId(): Long = {
        return _memberFollowingId;
    }

    /**
     * [set] (会員フォローイングID)MEMBER_FOLLOWING_ID: {PK, ID, NotNull, BIGINT(19)} <br />
     * @param memberFollowingId The value of the column 'MEMBER_FOLLOWING_ID'. (basically NotNull if update: for the constraint)
     */
    def setMemberFollowingId(memberFollowingId: Long): Unit = {
        __modifiedProperties.addPropertyName("memberFollowingId");
        _memberFollowingId = memberFollowingId;
    }

    /**
     * [get] (わたし)MY_MEMBER_ID: {UQ+, IX+, NotNull, INTEGER(10), FK to MEMBER} <br />
     * @return The value of the column 'MY_MEMBER_ID'. (basically NotNull if selected: for the constraint)
     */
    def getMyMemberId(): Integer = {
        return _myMemberId;
    }

    /**
     * [set] (わたし)MY_MEMBER_ID: {UQ+, IX+, NotNull, INTEGER(10), FK to MEMBER} <br />
     * @param myMemberId The value of the column 'MY_MEMBER_ID'. (basically NotNull if update: for the constraint)
     */
    def setMyMemberId(myMemberId: Integer): Unit = {
        __modifiedProperties.addPropertyName("myMemberId");
        _myMemberId = myMemberId;
    }

    /**
     * [get] (あなた)YOUR_MEMBER_ID: {+UQ, IX+, NotNull, INTEGER(10), FK to MEMBER} <br />
     * @return The value of the column 'YOUR_MEMBER_ID'. (basically NotNull if selected: for the constraint)
     */
    def getYourMemberId(): Integer = {
        return _yourMemberId;
    }

    /**
     * [set] (あなた)YOUR_MEMBER_ID: {+UQ, IX+, NotNull, INTEGER(10), FK to MEMBER} <br />
     * @param yourMemberId The value of the column 'YOUR_MEMBER_ID'. (basically NotNull if update: for the constraint)
     */
    def setYourMemberId(yourMemberId: Integer): Unit = {
        __modifiedProperties.addPropertyName("yourMemberId");
        _yourMemberId = yourMemberId;
    }

    /**
     * [get] (その瞬間)FOLLOW_DATETIME: {IX, NotNull, TIMESTAMP(23, 10)} <br />
     * @return The value of the column 'FOLLOW_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    def getFollowDatetime(): java.sql.Timestamp = {
        return _followDatetime;
    }

    /**
     * [set] (その瞬間)FOLLOW_DATETIME: {IX, NotNull, TIMESTAMP(23, 10)} <br />
     * @param followDatetime The value of the column 'FOLLOW_DATETIME'. (basically NotNull if update: for the constraint)
     */
    def setFollowDatetime(followDatetime: java.sql.Timestamp): Unit = {
        __modifiedProperties.addPropertyName("followDatetime");
        _followDatetime = followDatetime;
    }
}
