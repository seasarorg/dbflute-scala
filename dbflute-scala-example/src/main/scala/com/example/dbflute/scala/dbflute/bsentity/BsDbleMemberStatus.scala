package com.example.dbflute.scala.dbflute.bsentity;

import scala.collection.immutable;
import scala.collection.JavaConverters._;

// #avoided same name type in Java and Scala
import java.lang.Long;
import java.lang.Boolean;

import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.AbstractEntity;
import org.seasar.dbflute.FunCustodial;
import org.seasar.dbflute.helper.beans.DfCoupleProperties;
import org.seasar.dbflute.immutable.DBableEntity;
import com.example.dbflute.scala.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.scala.dbflute.allcommon.CDef;
import com.example.dbflute.scala.dbflute.exentity._;

/**
 * The entity of (会員ステータス)MEMBER_STATUS as TABLE. <br />
 * <pre>
 * [primary-key]
 *     MEMBER_STATUS_CODE
 * 
 * [column]
 *     MEMBER_STATUS_CODE, MEMBER_STATUS_NAME, DESCRIPTION, DISPLAY_ORDER
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
 *     MEMBER, MEMBER_LOGIN
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     memberList, memberLoginList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * String memberStatusCode = entity.getMemberStatusCode();
 * String memberStatusName = entity.getMemberStatusName();
 * String description = entity.getDescription();
 * Integer displayOrder = entity.getDisplayOrder();
 * entity.setMemberStatusCode(memberStatusCode);
 * entity.setMemberStatusName(memberStatusName);
 * entity.setDescription(description);
 * entity.setDisplayOrder(displayOrder);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
abstract class BsDbleMemberStatus extends AbstractEntity with DBableEntity[MemberStatus] with Serializable with Cloneable {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** (会員ステータスコード)MEMBER_STATUS_CODE: {PK, NotNull, CHAR(3), classification=MemberStatus} */
    protected var _memberStatusCode: String = null;

    /** (会員ステータス名称)MEMBER_STATUS_NAME: {NotNull, VARCHAR(50)} */
    protected var _memberStatusName: String = null;

    /** (説明)DESCRIPTION: {NotNull, VARCHAR(200)} */
    protected var _description: String = null;

    /** (表示順)DISPLAY_ORDER: {UQ, NotNull, INTEGER(10)} */
    protected var _displayOrder: Integer = null;

    // ===================================================================================
    //                                                                           Immutable
    //                                                                           =========
    /**
     * {@inheritDoc}
     */
    def acceptImmutable(immu: MemberStatus): DbleMemberStatus = {
        setMemberStatusCodeAsMemberStatus(immu.memberStatusCode);
        setMemberStatusName(immu.memberStatusName);
        setDescription(immu.description);
        setDisplayOrder(immu.displayOrder);
        setMemberList(immu.memberList.map(new DbleMember().acceptImmutable(_)).asJava)
        setMemberLoginList(immu.memberLoginList.map(new DbleMemberLogin().acceptImmutable(_)).asJava)
        __uniqueDrivenProperties.clear();
        immu.getMyUniqueDrivenProperties().foreach(__uniqueDrivenProperties.addPropertyName(_))
        __modifiedProperties.clear();
        immu.getMyModifiedProperties().foreach(__modifiedProperties.addPropertyName(_))
        return this.asInstanceOf[DbleMemberStatus];
    }

    /**
     * {@inheritDoc}
     */
    def toImmutable(): MemberStatus = {
        return new MemberStatus(this.asInstanceOf[DbleMemberStatus]);
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    def getTableDbName(): String = {
        return "MEMBER_STATUS";
    }

    /**
     * {@inheritDoc}
     */
    def getTablePropertyName(): String = {
        return "memberStatus";
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
        if (getMemberStatusCode() == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br />
     * You can update the entity by the key when entity update (NOT batch update).
     * @param displayOrder (表示順): UQ, NotNull, INTEGER(10). (NotNull)
     */
    def uniqueBy(displayOrder: Integer): Unit = {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("displayOrder");
        setDisplayOrder(displayOrder);
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of memberStatusCode as the classification of MemberStatus. <br />
     * (会員ステータスコード)MEMBER_STATUS_CODE: {PK, NotNull, CHAR(3), classification=MemberStatus} <br />
     * status of member from entry to withdrawal
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    def getMemberStatusCodeAsMemberStatus(): CDef.MemberStatus = {
        return CDef.MemberStatus.codeOf(getMemberStatusCode());
    }

    /**
     * Set the value of memberStatusCode as the classification of MemberStatus. <br />
     * (会員ステータスコード)MEMBER_STATUS_CODE: {PK, NotNull, CHAR(3), classification=MemberStatus} <br />
     * status of member from entry to withdrawal
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    def setMemberStatusCodeAsMemberStatus(cdef: CDef.MemberStatus): Unit = {
        setMemberStatusCode(if (cdef != null) { cdef.code } else { null });
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of memberStatusCode as Formalized (FML). <br />
     * Formalized: as formal member, allowed to use all service
     */
    def setMemberStatusCode_Formalized(): Unit = {
        setMemberStatusCodeAsMemberStatus(CDef.MemberStatus.Formalized);
    }

    /**
     * Set the value of memberStatusCode as Withdrawal (WDL). <br />
     * Withdrawal: withdrawal is fixed, not allowed to use service
     */
    def setMemberStatusCode_Withdrawal(): Unit = {
        setMemberStatusCodeAsMemberStatus(CDef.MemberStatus.Withdrawal);
    }

    /**
     * Set the value of memberStatusCode as Provisional (PRV). <br />
     * Provisional: first status after entry, allowed to use only part of service
     */
    def setMemberStatusCode_Provisional(): Unit = {
        setMemberStatusCodeAsMemberStatus(CDef.MemberStatus.Provisional);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of memberStatusCode Formalized? <br />
     * Formalized: as formal member, allowed to use all service
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isMemberStatusCode_Formalized(): Boolean = {
        val cdef: CDef.MemberStatus = getMemberStatusCodeAsMemberStatus();
        return if (cdef != null) { cdef.equals(CDef.MemberStatus.Formalized) } else { false };
    }

    /**
     * Is the value of memberStatusCode Withdrawal? <br />
     * Withdrawal: withdrawal is fixed, not allowed to use service
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isMemberStatusCode_Withdrawal(): Boolean = {
        val cdef: CDef.MemberStatus = getMemberStatusCodeAsMemberStatus();
        return if (cdef != null) { cdef.equals(CDef.MemberStatus.Withdrawal) } else { false };
    }

    /**
     * Is the value of memberStatusCode Provisional? <br />
     * Provisional: first status after entry, allowed to use only part of service
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isMemberStatusCode_Provisional(): Boolean = {
        val cdef: CDef.MemberStatus = getMemberStatusCodeAsMemberStatus();
        return if (cdef != null) { cdef.equals(CDef.MemberStatus.Provisional) } else { false };
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** (会員)MEMBER by MEMBER_STATUS_CODE, named 'memberList'. */
    protected var _memberList: List[DbleMember] = null;

    /**
     * [get] (会員)MEMBER by MEMBER_STATUS_CODE, named 'memberList'.
     * @return The entity list of referrer property 'memberList'. (NotNull: even if no loading, returns empty list)
     */
    def getMemberList(): List[DbleMember] = {
        if (_memberList == null) { _memberList = newReferrerScalaList(); }
        return _memberList;
    }

    /**
     * [set] (会員)MEMBER by MEMBER_STATUS_CODE, named 'memberList'.
     * @param memberList The entity list of referrer property 'memberList'. (NullAllowed)
     */
    def setMemberList(memberList: List[DbleMember]): Unit = {
        _memberList = memberList;
    }

    /**
     * [convert] (会員)MEMBER by MEMBER_STATUS_CODE, named 'memberList'.
     * @return The new-created immutable list of immutable entity of the referrer property 'memberList'. (NotNull)
     */
    def toImmutableMemberList(): immutable.List[Member] = {
        return toScalaList(_memberList).map(_.toImmutable());
    }

    /** (会員ログイン)MEMBER_LOGIN by LOGIN_MEMBER_STATUS_CODE, named 'memberLoginList'. */
    protected var _memberLoginList: List[DbleMemberLogin] = null;

    /**
     * [get] (会員ログイン)MEMBER_LOGIN by LOGIN_MEMBER_STATUS_CODE, named 'memberLoginList'.
     * @return The entity list of referrer property 'memberLoginList'. (NotNull: even if no loading, returns empty list)
     */
    def getMemberLoginList(): List[DbleMemberLogin] = {
        if (_memberLoginList == null) { _memberLoginList = newReferrerScalaList(); }
        return _memberLoginList;
    }

    /**
     * [set] (会員ログイン)MEMBER_LOGIN by LOGIN_MEMBER_STATUS_CODE, named 'memberLoginList'.
     * @param memberLoginList The entity list of referrer property 'memberLoginList'. (NullAllowed)
     */
    def setMemberLoginList(memberLoginList: List[DbleMemberLogin]): Unit = {
        _memberLoginList = memberLoginList;
    }

    /**
     * [convert] (会員ログイン)MEMBER_LOGIN by LOGIN_MEMBER_STATUS_CODE, named 'memberLoginList'.
     * @return The new-created immutable list of immutable entity of the referrer property 'memberLoginList'. (NotNull)
     */
    def toImmutableMemberLoginList(): immutable.List[MemberLogin] = {
        return toScalaList(_memberLoginList).map(_.toImmutable());
    }

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
            case obj: BsDbleMemberStatus => {
                val other: BsDbleMemberStatus = obj.asInstanceOf[BsDbleMemberStatus];
                {(
                     xSV(getMemberStatusCode(), other.getMemberStatusCode())
                )}
            }
            case _ => false
        }
    }

    override protected def doHashCode(initial: Int): Int = {
        var hs: Int = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, getMemberStatusCode());
        return hs;
    }

    override protected def doBuildStringWithRelation(li: String): String = {
        val sb: StringBuilder = new StringBuilder();
        toScalaList(_memberList).foreach(et => { if (et != null) { sb.append(li).append(xbRDS(et, "memberList")) } });
        toScalaList(_memberLoginList).foreach(et => { if (et != null) { sb.append(li).append(xbRDS(et, "memberLoginList")) } });
        return sb.toString();
    }

    override protected def doBuildColumnString(dm: String): String = {
        val sb: StringBuilder = new StringBuilder();
        sb.append(dm).append(getMemberStatusCode());
        sb.append(dm).append(getMemberStatusName());
        sb.append(dm).append(getDescription());
        sb.append(dm).append(getDisplayOrder());
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    override protected def doBuildRelationString(dm: String): String = {
        val sb: StringBuilder = new StringBuilder();
        if (_memberList != null && !_memberList.isEmpty)
        { sb.append(dm).append("memberList"); }
        if (_memberLoginList != null && !_memberLoginList.isEmpty)
        { sb.append(dm).append("memberLoginList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    override def clone(): DbleMemberStatus = {
        return super.clone().asInstanceOf[DbleMemberStatus];
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (会員ステータスコード)MEMBER_STATUS_CODE: {PK, NotNull, CHAR(3), classification=MemberStatus} <br />
     * @return The value of the column 'MEMBER_STATUS_CODE'. (basically NotNull if selected: for the constraint)
     */
    def getMemberStatusCode(): String = {
        return convertEmptyToNull(_memberStatusCode);
    }

    /**
     * [set] (会員ステータスコード)MEMBER_STATUS_CODE: {PK, NotNull, CHAR(3), classification=MemberStatus} <br />
     * @param memberStatusCode The value of the column 'MEMBER_STATUS_CODE'. (basically NotNull if update: for the constraint)
     */
    protected def setMemberStatusCode(memberStatusCode: String): Unit = {
        checkClassificationCode("MEMBER_STATUS_CODE", CDef.DefMeta.MemberStatus, memberStatusCode);
        __modifiedProperties.addPropertyName("memberStatusCode");
        _memberStatusCode = memberStatusCode;
    }

    /**
     * [get] (会員ステータス名称)MEMBER_STATUS_NAME: {NotNull, VARCHAR(50)} <br />
     * @return The value of the column 'MEMBER_STATUS_NAME'. (basically NotNull if selected: for the constraint)
     */
    def getMemberStatusName(): String = {
        return convertEmptyToNull(_memberStatusName);
    }

    /**
     * [set] (会員ステータス名称)MEMBER_STATUS_NAME: {NotNull, VARCHAR(50)} <br />
     * @param memberStatusName The value of the column 'MEMBER_STATUS_NAME'. (basically NotNull if update: for the constraint)
     */
    def setMemberStatusName(memberStatusName: String): Unit = {
        __modifiedProperties.addPropertyName("memberStatusName");
        _memberStatusName = memberStatusName;
    }

    /**
     * [get] (説明)DESCRIPTION: {NotNull, VARCHAR(200)} <br />
     * @return The value of the column 'DESCRIPTION'. (basically NotNull if selected: for the constraint)
     */
    def getDescription(): String = {
        return convertEmptyToNull(_description);
    }

    /**
     * [set] (説明)DESCRIPTION: {NotNull, VARCHAR(200)} <br />
     * @param description The value of the column 'DESCRIPTION'. (basically NotNull if update: for the constraint)
     */
    def setDescription(description: String): Unit = {
        __modifiedProperties.addPropertyName("description");
        _description = description;
    }

    /**
     * [get] (表示順)DISPLAY_ORDER: {UQ, NotNull, INTEGER(10)} <br />
     * @return The value of the column 'DISPLAY_ORDER'. (basically NotNull if selected: for the constraint)
     */
    def getDisplayOrder(): Integer = {
        return _displayOrder;
    }

    /**
     * [set] (表示順)DISPLAY_ORDER: {UQ, NotNull, INTEGER(10)} <br />
     * @param displayOrder The value of the column 'DISPLAY_ORDER'. (basically NotNull if update: for the constraint)
     */
    def setDisplayOrder(displayOrder: Integer): Unit = {
        __modifiedProperties.addPropertyName("displayOrder");
        _displayOrder = displayOrder;
    }

    /**
     * For framework so basically DON'T use this method.
     * @param memberStatusCode The value of the column 'MEMBER_STATUS_CODE'. (basically NotNull if update: for the constraint)
     */
    def mynativeMappingMemberStatusCode(memberStatusCode: String): Unit = {
        setMemberStatusCode(memberStatusCode);
    }
}
