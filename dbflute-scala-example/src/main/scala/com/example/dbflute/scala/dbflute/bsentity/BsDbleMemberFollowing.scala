package com.example.dbflute.scala.dbflute.bsentity;

import scala.collection.immutable;
import scala.collection.JavaConverters._;

// #avoided same name type in Java and Scala
import java.lang.Long;
import java.lang.Boolean;

import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.AbstractEntity;
import org.seasar.dbflute.FunCustodial;
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
 * org.joda.time.LocalDateTime followDatetime = entity.getFollowDatetime();
 * entity.setMemberFollowingId(memberFollowingId);
 * entity.setMyMemberId(myMemberId);
 * entity.setYourMemberId(yourMemberId);
 * entity.setFollowDatetime(followDatetime);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
abstract class BsDbleMemberFollowing extends AbstractEntity with DBableEntity[MemberFollowing] with Serializable with Cloneable {

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
    protected var _followDatetime: org.joda.time.LocalDateTime = null;

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
        immu.getMyModifiedProperties().foreach(__modifiedProperties.addPropertyName(_))
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
    def getTablePropertyName(): String = {
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
    protected def newReferrerScalaList[ELEMENT](): List[ELEMENT] = {
        return new ArrayList[ELEMENT]();
    }

    // ===================================================================================
    //                                                                        Scala Helper
    //                                                                        ============
    protected def toScalaList[ENTITY](javaList: Collection[ENTITY]): immutable.List[ENTITY] = {
        if (javaList == null) { return immutable.List(); }
        return javaList.toArray.toList.asInstanceOf[immutable.List[ENTITY]];
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
    override protected def doEquals(obj: Any) = {
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

    override protected def doHashCode(initial: Int): Int = {
        var hs: Int = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, getMemberFollowingId());
        return hs;
    }

    override protected def doBuildStringWithRelation(li: String): String = {
        val sb: StringBuilder = new StringBuilder();
        if (_memberByMyMemberId != null && _memberByMyMemberId.isEmpty)
        { sb.append(li).append(xbRDS(_memberByMyMemberId, "memberByMyMemberId")); }
        if (_memberByYourMemberId != null && _memberByYourMemberId.isEmpty)
        { sb.append(li).append(xbRDS(_memberByYourMemberId, "memberByYourMemberId")); }
        return sb.toString();
    }
    protected def xbRDS[ET <: Entity](et: Option[ET], name: String): String = {
        return et.get.buildDisplayString(name, true, true);
    }

    override protected def doBuildColumnString(dm: String): String = {
        val sb: StringBuilder = new StringBuilder();
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

    override protected def doBuildRelationString(dm: String): String = {
        val sb: StringBuilder = new StringBuilder();
        if (_memberByMyMemberId != null && _memberByMyMemberId.isEmpty)
        { sb.append(dm).append("memberByMyMemberId"); }
        if (_memberByYourMemberId != null && _memberByYourMemberId.isEmpty)
        { sb.append(dm).append("memberByYourMemberId"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    override def clone(): DbleMemberFollowing = {
        return super.clone().asInstanceOf[DbleMemberFollowing];
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
    def getFollowDatetime(): org.joda.time.LocalDateTime = {
        return _followDatetime;
    }

    /**
     * [set] (その瞬間)FOLLOW_DATETIME: {IX, NotNull, TIMESTAMP(23, 10)} <br />
     * @param followDatetime The value of the column 'FOLLOW_DATETIME'. (basically NotNull if update: for the constraint)
     */
    def setFollowDatetime(followDatetime: org.joda.time.LocalDateTime): Unit = {
        __modifiedProperties.addPropertyName("followDatetime");
        _followDatetime = followDatetime;
    }
}
