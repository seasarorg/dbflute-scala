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
 * The immutable entity of (会員フォローイング)MEMBER_FOLLOWING as TABLE. <br />
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
 * [get template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * val memberFollowingId: Long = entity.memberFollowingId
 * val myMemberId: Int = entity.myMemberId
 * val yourMemberId: Int = entity.yourMemberId
 * val followDatetime: org.joda.time.LocalDateTime = entity.followDatetime
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
abstract class BsMemberFollowing(dble: DbleMemberFollowing) extends Serializable {

    // ===================================================================================
    //                                                                           Case Like
    //                                                                           =========
    def copy(
         memberFollowingId: Long = memberFollowingId
        , myMemberId: Int = myMemberId
        , yourMemberId: Int = yourMemberId
        , followDatetime: org.joda.time.LocalDateTime = followDatetime
    ): MemberFollowing = {
        val newDble = new DbleMemberFollowing
        newDble.myuniqueDrivenProperties.addAll(dble.myuniqueDrivenProperties) // inherit
        newDble.mymodifiedProperties.addAll(dble.mymodifiedProperties) // inherit
        if (!memberFollowingId.equals(this.memberFollowingId)) { newDble.setMemberFollowingId(memberFollowingId) }
        if (!myMemberId.equals(this.myMemberId)) { newDble.setMyMemberId(myMemberId) }
        if (!yourMemberId.equals(this.yourMemberId)) { newDble.setYourMemberId(yourMemberId) }
        if (!followDatetime.equals(this.followDatetime)) { newDble.setFollowDatetime(followDatetime) }
        new MemberFollowing(newDble)
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
    /**
     * [get] (会員)MEMBER by my MY_MEMBER_ID, named 'memberByMyMemberId'.
     * @return The entity of foreign property 'memberByMyMemberId'. (EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    def memberByMyMemberId: Option[Member] = { dble.toImmutableMemberByMyMemberId }

    /**
     * [get] (会員)MEMBER by my YOUR_MEMBER_ID, named 'memberByYourMemberId'.
     * @return The entity of foreign property 'memberByYourMemberId'. (EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    def memberByYourMemberId: Option[Member] = { dble.toImmutableMemberByYourMemberId }

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
            case obj: BsMemberFollowing => {
                val other: BsMemberFollowing = obj.asInstanceOf[BsMemberFollowing];
                {(
                     xSV(memberFollowingId, other.memberFollowingId)
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
     * [get] (会員フォローイングID)MEMBER_FOLLOWING_ID: {PK, ID, NotNull, BIGINT(19)} <br />
     * @return The value of the column 'MEMBER_FOLLOWING_ID'. (NotNull but EmptyAllowed if null in database)
     */
    def memberFollowingId: Long = { dble.getMemberFollowingId }

    /**
     * [get] (わたし)MY_MEMBER_ID: {UQ+, IX+, NotNull, INTEGER(10), FK to MEMBER} <br />
     * @return The value of the column 'MY_MEMBER_ID'. (NotNull but EmptyAllowed if null in database)
     */
    def myMemberId: Int = { dble.getMyMemberId }

    /**
     * [get] (あなた)YOUR_MEMBER_ID: {+UQ, IX+, NotNull, INTEGER(10), FK to MEMBER} <br />
     * @return The value of the column 'YOUR_MEMBER_ID'. (NotNull but EmptyAllowed if null in database)
     */
    def yourMemberId: Int = { dble.getYourMemberId }

    /**
     * [get] (その瞬間)FOLLOW_DATETIME: {IX, NotNull, TIMESTAMP(23, 10)} <br />
     * @return The value of the column 'FOLLOW_DATETIME'. (NotNull but EmptyAllowed if null in database)
     */
    def followDatetime: org.joda.time.LocalDateTime = { dble.getFollowDatetime }
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
 * The mutable entity of (会員フォローイング)MEMBER_FOLLOWING as TABLE. <br />
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * val memberFollowingId: Long = entity.memberFollowingId
 * val myMemberId: Int = entity.myMemberId
 * val yourMemberId: Int = entity.yourMemberId
 * val followDatetime: org.joda.time.LocalDateTime = entity.followDatetime
 * entity.memberFollowingId = memberFollowingId
 * entity.myMemberId = myMemberId
 * entity.yourMemberId = yourMemberId
 * entity.followDatetime = followDatetime
 * = = = = = = = = = =/
 * @author DBFlute(AutoGenerator)
 */
abstract class BsMbleMemberFollowing {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected val dble: DbleMemberFollowing = new DbleMemberFollowing();

    // ===================================================================================
    //                                                                      DB-able Entity
    //                                                                      ==============
    def toDBable(): DbleMemberFollowing = { dble }

    // ===================================================================================
    //                                                                    Immutable Entity
    //                                                                    ================
    def toImmutable(): MemberFollowing = { dble.toImmutable() }

    // ===================================================================================
    //                                                                          Unique Key
    //                                                                          ==========
    /**
     * To be unique by the unique column. <br />
     * You can update the entity by the key when entity update (NOT batch update).
     * @param myMemberId (わたし): UQ+, IX+, NotNull, INTEGER(10), FK to MEMBER. (NotNull)
     * @param yourMemberId (あなた): +UQ, IX+, NotNull, INTEGER(10), FK to MEMBER. (NotNull)
     */
    def uniqueBy(myMemberId: Integer, yourMemberId: Integer): Unit = { dble.setMyMemberId(myMemberId);dble.setYourMemberId(yourMemberId); }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (会員フォローイングID)MEMBER_FOLLOWING_ID: {PK, ID, NotNull, BIGINT(19)} <br />
     * @return The value of the column 'MEMBER_FOLLOWING_ID'. (basically NotNull if selected: for the constraint)
     */
    def memberFollowingId: Long = { dble.getMemberFollowingId }

    /**
     * [set] (会員フォローイングID)MEMBER_FOLLOWING_ID: {PK, ID, NotNull, BIGINT(19)} <br />
     * @param memberFollowingId The value of the column 'MEMBER_FOLLOWING_ID'. (NullAllowed: null update allowed for no constraint)
     */
    def memberFollowingId_=(memberFollowingId: Long) = { dble.setMemberFollowingId(memberFollowingId) }

    /**
     * [get] (わたし)MY_MEMBER_ID: {UQ+, IX+, NotNull, INTEGER(10), FK to MEMBER} <br />
     * @return The value of the column 'MY_MEMBER_ID'. (basically NotNull if selected: for the constraint)
     */
    def myMemberId: Int = { dble.getMyMemberId }

    /**
     * [set] (わたし)MY_MEMBER_ID: {UQ+, IX+, NotNull, INTEGER(10), FK to MEMBER} <br />
     * @param myMemberId The value of the column 'MY_MEMBER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    def myMemberId_=(myMemberId: Int) = { dble.setMyMemberId(myMemberId) }

    /**
     * [get] (あなた)YOUR_MEMBER_ID: {+UQ, IX+, NotNull, INTEGER(10), FK to MEMBER} <br />
     * @return The value of the column 'YOUR_MEMBER_ID'. (basically NotNull if selected: for the constraint)
     */
    def yourMemberId: Int = { dble.getYourMemberId }

    /**
     * [set] (あなた)YOUR_MEMBER_ID: {+UQ, IX+, NotNull, INTEGER(10), FK to MEMBER} <br />
     * @param yourMemberId The value of the column 'YOUR_MEMBER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    def yourMemberId_=(yourMemberId: Int) = { dble.setYourMemberId(yourMemberId) }

    /**
     * [get] (その瞬間)FOLLOW_DATETIME: {IX, NotNull, TIMESTAMP(23, 10)} <br />
     * @return The value of the column 'FOLLOW_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    def followDatetime: org.joda.time.LocalDateTime = { dble.getFollowDatetime }

    /**
     * [set] (その瞬間)FOLLOW_DATETIME: {IX, NotNull, TIMESTAMP(23, 10)} <br />
     * @param followDatetime The value of the column 'FOLLOW_DATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    def followDatetime_=(followDatetime: org.joda.time.LocalDateTime) = { dble.setFollowDatetime(followDatetime) }
}
