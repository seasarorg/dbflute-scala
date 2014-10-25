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
 * The entity of (サービスランク)SERVICE_RANK as TABLE. <br />
 * <pre>
 * [primary-key]
 *     SERVICE_RANK_CODE
 * 
 * [column]
 *     SERVICE_RANK_CODE, SERVICE_RANK_NAME, SERVICE_POINT_INCIDENCE, NEW_ACCEPTABLE_FLG, DESCRIPTION, DISPLAY_ORDER
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
 *     MEMBER_SERVICE
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     memberServiceList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * String serviceRankCode = entity.getServiceRankCode();
 * String serviceRankName = entity.getServiceRankName();
 * java.math.BigDecimal servicePointIncidence = entity.getServicePointIncidence();
 * Integer newAcceptableFlg = entity.getNewAcceptableFlg();
 * String description = entity.getDescription();
 * Integer displayOrder = entity.getDisplayOrder();
 * entity.setServiceRankCode(serviceRankCode);
 * entity.setServiceRankName(serviceRankName);
 * entity.setServicePointIncidence(servicePointIncidence);
 * entity.setNewAcceptableFlg(newAcceptableFlg);
 * entity.setDescription(description);
 * entity.setDisplayOrder(displayOrder);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
abstract class BsDbleServiceRank extends AbstractEntity with DBableEntity[ServiceRank] with Serializable with Cloneable {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** (サービスランクコード)SERVICE_RANK_CODE: {PK, NotNull, CHAR(3), classification=ServiceRank} */
    protected var _serviceRankCode: String = null;

    /** (サービスランク名称)SERVICE_RANK_NAME: {NotNull, VARCHAR(50)} */
    protected var _serviceRankName: String = null;

    /** (サービスポイント発生率)SERVICE_POINT_INCIDENCE: {NotNull, DECIMAL(5, 3)} */
    protected var _servicePointIncidence: java.math.BigDecimal = null;

    /** (新規受け入れ可能フラグ)NEW_ACCEPTABLE_FLG: {NotNull, INTEGER(10), classification=Flg} */
    protected var _newAcceptableFlg: Integer = null;

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
    def acceptImmutable(immu: ServiceRank): DbleServiceRank = {
        setServiceRankCodeAsServiceRank(immu.serviceRankCode);
        setServiceRankName(immu.serviceRankName);
        setServicePointIncidence(immu.servicePointIncidence.underlying);
        setNewAcceptableFlgAsFlg(immu.newAcceptableFlg);
        setDescription(immu.description);
        setDisplayOrder(immu.displayOrder);
        setMemberServiceList(immu.memberServiceList.map(new DbleMemberService().acceptImmutable(_)).asJava)
        __uniqueDrivenProperties.clear();
        immu.getMyUniqueDrivenProperties().foreach(__uniqueDrivenProperties.addPropertyName(_))
        __modifiedProperties.clear();
        immu.getMyModifiedProperties().foreach(__modifiedProperties.addPropertyName(_))
        return this.asInstanceOf[DbleServiceRank];
    }

    /**
     * {@inheritDoc}
     */
    def toImmutable(): ServiceRank = {
        return new ServiceRank(this.asInstanceOf[DbleServiceRank]);
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    def getTableDbName(): String = {
        return "SERVICE_RANK";
    }

    /**
     * {@inheritDoc}
     */
    def getTablePropertyName(): String = {
        return "serviceRank";
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
        if (getServiceRankCode() == null) { return false; }
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
     * Get the value of serviceRankCode as the classification of ServiceRank. <br />
     * (サービスランクコード)SERVICE_RANK_CODE: {PK, NotNull, CHAR(3), classification=ServiceRank} <br />
     * rank of service member gets
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    def getServiceRankCodeAsServiceRank(): CDef.ServiceRank = {
        return CDef.ServiceRank.codeOf(getServiceRankCode());
    }

    /**
     * Set the value of serviceRankCode as the classification of ServiceRank. <br />
     * (サービスランクコード)SERVICE_RANK_CODE: {PK, NotNull, CHAR(3), classification=ServiceRank} <br />
     * rank of service member gets
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    def setServiceRankCodeAsServiceRank(cdef: CDef.ServiceRank): Unit = {
        setServiceRankCode(if (cdef != null) { cdef.code } else { null });
    }

    /**
     * Get the value of newAcceptableFlg as the classification of Flg. <br />
     * (新規受け入れ可能フラグ)NEW_ACCEPTABLE_FLG: {NotNull, INTEGER(10), classification=Flg} <br />
     * general boolean classification for every flg-column
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    def getNewAcceptableFlgAsFlg(): CDef.Flg = {
        return CDef.Flg.codeOf(getNewAcceptableFlg());
    }

    /**
     * Set the value of newAcceptableFlg as the classification of Flg. <br />
     * (新規受け入れ可能フラグ)NEW_ACCEPTABLE_FLG: {NotNull, INTEGER(10), classification=Flg} <br />
     * general boolean classification for every flg-column
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    def setNewAcceptableFlgAsFlg(cdef: CDef.Flg): Unit = {
        setNewAcceptableFlg(if (cdef != null) { toNumber(cdef.code, classOf[Integer]) } else { null });
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of serviceRankCode as Platinum (PLT). <br />
     * PLATINUM: platinum rank
     */
    def setServiceRankCode_Platinum(): Unit = {
        setServiceRankCodeAsServiceRank(CDef.ServiceRank.Platinum);
    }

    /**
     * Set the value of serviceRankCode as Gold (GLD). <br />
     * GOLD: gold rank
     */
    def setServiceRankCode_Gold(): Unit = {
        setServiceRankCodeAsServiceRank(CDef.ServiceRank.Gold);
    }

    /**
     * Set the value of serviceRankCode as Silver (SIL). <br />
     * SILVER: silver rank
     */
    def setServiceRankCode_Silver(): Unit = {
        setServiceRankCodeAsServiceRank(CDef.ServiceRank.Silver);
    }

    /**
     * Set the value of serviceRankCode as Bronze (BRZ). <br />
     * BRONZE: bronze rank
     */
    def setServiceRankCode_Bronze(): Unit = {
        setServiceRankCodeAsServiceRank(CDef.ServiceRank.Bronze);
    }

    /**
     * Set the value of serviceRankCode as Plastic (PLS). <br />
     * PLASTIC: plastic rank
     */
    def setServiceRankCode_Plastic(): Unit = {
        setServiceRankCodeAsServiceRank(CDef.ServiceRank.Plastic);
    }

    /**
     * Set the value of newAcceptableFlg as True (1). <br />
     * Yes: means valid
     */
    def setNewAcceptableFlg_True(): Unit = {
        setNewAcceptableFlgAsFlg(CDef.Flg.True);
    }

    /**
     * Set the value of newAcceptableFlg as False (0). <br />
     * No: means invalid
     */
    def setNewAcceptableFlg_False(): Unit = {
        setNewAcceptableFlgAsFlg(CDef.Flg.False);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of serviceRankCode Platinum? <br />
     * PLATINUM: platinum rank
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isServiceRankCode_Platinum(): Boolean = {
        val cdef: CDef.ServiceRank = getServiceRankCodeAsServiceRank();
        return if (cdef != null) { cdef.equals(CDef.ServiceRank.Platinum) } else { false };
    }

    /**
     * Is the value of serviceRankCode Gold? <br />
     * GOLD: gold rank
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isServiceRankCode_Gold(): Boolean = {
        val cdef: CDef.ServiceRank = getServiceRankCodeAsServiceRank();
        return if (cdef != null) { cdef.equals(CDef.ServiceRank.Gold) } else { false };
    }

    /**
     * Is the value of serviceRankCode Silver? <br />
     * SILVER: silver rank
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isServiceRankCode_Silver(): Boolean = {
        val cdef: CDef.ServiceRank = getServiceRankCodeAsServiceRank();
        return if (cdef != null) { cdef.equals(CDef.ServiceRank.Silver) } else { false };
    }

    /**
     * Is the value of serviceRankCode Bronze? <br />
     * BRONZE: bronze rank
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isServiceRankCode_Bronze(): Boolean = {
        val cdef: CDef.ServiceRank = getServiceRankCodeAsServiceRank();
        return if (cdef != null) { cdef.equals(CDef.ServiceRank.Bronze) } else { false };
    }

    /**
     * Is the value of serviceRankCode Plastic? <br />
     * PLASTIC: plastic rank
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isServiceRankCode_Plastic(): Boolean = {
        val cdef: CDef.ServiceRank = getServiceRankCodeAsServiceRank();
        return if (cdef != null) { cdef.equals(CDef.ServiceRank.Plastic) } else { false };
    }

    /**
     * Is the value of newAcceptableFlg True? <br />
     * Yes: means valid
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isNewAcceptableFlg_True(): Boolean = {
        val cdef: CDef.Flg = getNewAcceptableFlgAsFlg();
        return if (cdef != null) { cdef.equals(CDef.Flg.True) } else { false };
    }

    /**
     * Is the value of newAcceptableFlg False? <br />
     * No: means invalid
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isNewAcceptableFlg_False(): Boolean = {
        val cdef: CDef.Flg = getNewAcceptableFlgAsFlg();
        return if (cdef != null) { cdef.equals(CDef.Flg.False) } else { false };
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    /**
     * Get the value of the column 'newAcceptableFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    def getNewAcceptableFlgName(): String = {
        val cdef: CDef.Flg = getNewAcceptableFlgAsFlg();
        return if (cdef != null) { cdef.name } else { null };
    }

    /**
     * Get the value of the column 'newAcceptableFlg' as classification alias.
     * @return The string of classification alias. (NullAllowed: when the column value is null)
     */
    def getNewAcceptableFlgAlias(): String = {
        val cdef: CDef.Flg = getNewAcceptableFlgAsFlg();
        return if (cdef != null) { cdef.alias } else { null };
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** (会員サービス)MEMBER_SERVICE by SERVICE_RANK_CODE, named 'memberServiceList'. */
    protected var _memberServiceList: List[DbleMemberService] = null;

    /**
     * [get] (会員サービス)MEMBER_SERVICE by SERVICE_RANK_CODE, named 'memberServiceList'.
     * @return The entity list of referrer property 'memberServiceList'. (NotNull: even if no loading, returns empty list)
     */
    def getMemberServiceList(): List[DbleMemberService] = {
        if (_memberServiceList == null) { _memberServiceList = newReferrerScalaList(); }
        return _memberServiceList;
    }

    /**
     * [set] (会員サービス)MEMBER_SERVICE by SERVICE_RANK_CODE, named 'memberServiceList'.
     * @param memberServiceList The entity list of referrer property 'memberServiceList'. (NullAllowed)
     */
    def setMemberServiceList(memberServiceList: List[DbleMemberService]): Unit = {
        _memberServiceList = memberServiceList;
    }

    /**
     * [convert] (会員サービス)MEMBER_SERVICE by SERVICE_RANK_CODE, named 'memberServiceList'.
     * @return The new-created immutable list of immutable entity of the referrer property 'memberServiceList'. (NotNull)
     */
    def toImmutableMemberServiceList(): immutable.List[MemberService] = {
        return toScalaList(_memberServiceList).map(_.toImmutable());
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
            case obj: BsDbleServiceRank => {
                val other: BsDbleServiceRank = obj.asInstanceOf[BsDbleServiceRank];
                {(
                     xSV(getServiceRankCode(), other.getServiceRankCode())
                )}
            }
            case _ => false
        }
    }

    override protected def doHashCode(initial: Int): Int = {
        var hs: Int = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, getServiceRankCode());
        return hs;
    }

    override protected def doBuildStringWithRelation(li: String): String = {
        val sb: StringBuilder = new StringBuilder();
        toScalaList(_memberServiceList).foreach(et => { if (et != null) { sb.append(li).append(xbRDS(et, "memberServiceList")) } });
        return sb.toString();
    }

    override protected def doBuildColumnString(dm: String): String = {
        val sb: StringBuilder = new StringBuilder();
        sb.append(dm).append(getServiceRankCode());
        sb.append(dm).append(getServiceRankName());
        sb.append(dm).append(getServicePointIncidence());
        sb.append(dm).append(getNewAcceptableFlg());
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
        if (_memberServiceList != null && !_memberServiceList.isEmpty)
        { sb.append(dm).append("memberServiceList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    override def clone(): DbleServiceRank = {
        return super.clone().asInstanceOf[DbleServiceRank];
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (サービスランクコード)SERVICE_RANK_CODE: {PK, NotNull, CHAR(3), classification=ServiceRank} <br />
     * @return The value of the column 'SERVICE_RANK_CODE'. (basically NotNull if selected: for the constraint)
     */
    def getServiceRankCode(): String = {
        return convertEmptyToNull(_serviceRankCode);
    }

    /**
     * [set] (サービスランクコード)SERVICE_RANK_CODE: {PK, NotNull, CHAR(3), classification=ServiceRank} <br />
     * @param serviceRankCode The value of the column 'SERVICE_RANK_CODE'. (basically NotNull if update: for the constraint)
     */
    protected def setServiceRankCode(serviceRankCode: String): Unit = {
        checkClassificationCode("SERVICE_RANK_CODE", CDef.DefMeta.ServiceRank, serviceRankCode);
        __modifiedProperties.addPropertyName("serviceRankCode");
        _serviceRankCode = serviceRankCode;
    }

    /**
     * [get] (サービスランク名称)SERVICE_RANK_NAME: {NotNull, VARCHAR(50)} <br />
     * @return The value of the column 'SERVICE_RANK_NAME'. (basically NotNull if selected: for the constraint)
     */
    def getServiceRankName(): String = {
        return convertEmptyToNull(_serviceRankName);
    }

    /**
     * [set] (サービスランク名称)SERVICE_RANK_NAME: {NotNull, VARCHAR(50)} <br />
     * @param serviceRankName The value of the column 'SERVICE_RANK_NAME'. (basically NotNull if update: for the constraint)
     */
    def setServiceRankName(serviceRankName: String): Unit = {
        __modifiedProperties.addPropertyName("serviceRankName");
        _serviceRankName = serviceRankName;
    }

    /**
     * [get] (サービスポイント発生率)SERVICE_POINT_INCIDENCE: {NotNull, DECIMAL(5, 3)} <br />
     * @return The value of the column 'SERVICE_POINT_INCIDENCE'. (basically NotNull if selected: for the constraint)
     */
    def getServicePointIncidence(): java.math.BigDecimal = {
        return _servicePointIncidence;
    }

    /**
     * [set] (サービスポイント発生率)SERVICE_POINT_INCIDENCE: {NotNull, DECIMAL(5, 3)} <br />
     * @param servicePointIncidence The value of the column 'SERVICE_POINT_INCIDENCE'. (basically NotNull if update: for the constraint)
     */
    def setServicePointIncidence(servicePointIncidence: java.math.BigDecimal): Unit = {
        __modifiedProperties.addPropertyName("servicePointIncidence");
        _servicePointIncidence = servicePointIncidence;
    }

    /**
     * [get] (新規受け入れ可能フラグ)NEW_ACCEPTABLE_FLG: {NotNull, INTEGER(10), classification=Flg} <br />
     * @return The value of the column 'NEW_ACCEPTABLE_FLG'. (basically NotNull if selected: for the constraint)
     */
    def getNewAcceptableFlg(): Integer = {
        return _newAcceptableFlg;
    }

    /**
     * [set] (新規受け入れ可能フラグ)NEW_ACCEPTABLE_FLG: {NotNull, INTEGER(10), classification=Flg} <br />
     * @param newAcceptableFlg The value of the column 'NEW_ACCEPTABLE_FLG'. (basically NotNull if update: for the constraint)
     */
    protected def setNewAcceptableFlg(newAcceptableFlg: Integer): Unit = {
        checkClassificationCode("NEW_ACCEPTABLE_FLG", CDef.DefMeta.Flg, newAcceptableFlg);
        __modifiedProperties.addPropertyName("newAcceptableFlg");
        _newAcceptableFlg = newAcceptableFlg;
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
     * @param serviceRankCode The value of the column 'SERVICE_RANK_CODE'. (basically NotNull if update: for the constraint)
     */
    def mynativeMappingServiceRankCode(serviceRankCode: String): Unit = {
        setServiceRankCode(serviceRankCode);
    }

    /**
     * For framework so basically DON'T use this method.
     * @param newAcceptableFlg The value of the column 'NEW_ACCEPTABLE_FLG'. (basically NotNull if update: for the constraint)
     */
    def mynativeMappingNewAcceptableFlg(newAcceptableFlg: Integer): Unit = {
        setNewAcceptableFlg(newAcceptableFlg);
    }
}
