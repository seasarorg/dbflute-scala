package com.example.dbflute.scala.dbflute.bsentity;

import scala.collection.immutable._;
import scala.collection.JavaConverters._;

import java.io.Serializable;
import java.util.Collection;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.FunCustodial;
import com.example.dbflute.scala.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.scala.dbflute.allcommon.CDef;
import com.example.dbflute.scala.dbflute.exentity._;

/**
 * The immutable entity of (退会理由)WITHDRAWAL_REASON as TABLE. <br />
 * <pre>
 * [primary-key]
 *     WITHDRAWAL_REASON_CODE
 * 
 * [column]
 *     WITHDRAWAL_REASON_CODE, WITHDRAWAL_REASON_TEXT, DISPLAY_ORDER
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
 *     MEMBER_WITHDRAWAL
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     memberWithdrawalList
 * 
 * [get template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * val withdrawalReasonCode: CDef.WithdrawalReason = entity.withdrawalReasonCode
 * val withdrawalReasonText: String = entity.withdrawalReasonText
 * val displayOrder: Int = entity.displayOrder
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
abstract class BsWithdrawalReason(dble: DbleWithdrawalReason) extends Serializable {

    // ===================================================================================
    //                                                                           Case Like
    //                                                                           =========
    def copy(
         withdrawalReasonCode: CDef.WithdrawalReason = withdrawalReasonCode
        , withdrawalReasonText: String = withdrawalReasonText
        , displayOrder: Int = displayOrder
    ): WithdrawalReason = {
        val newDble = new DbleWithdrawalReason
        newDble.myuniqueDrivenProperties.addAll(dble.myuniqueDrivenProperties) // inherit
        newDble.mymodifiedProperties.addAll(dble.mymodifiedProperties) // inherit
        if (!withdrawalReasonCode.equals(this.withdrawalReasonCode)) { newDble.setWithdrawalReasonCodeAsWithdrawalReason(withdrawalReasonCode) }
        if (!withdrawalReasonText.equals(this.withdrawalReasonText)) { newDble.setWithdrawalReasonText(withdrawalReasonText) }
        if (!displayOrder.equals(this.displayOrder)) { newDble.setDisplayOrder(displayOrder) }
        new WithdrawalReason(newDble)
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
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of withdrawalReasonCode as the classification of WithdrawalReason. <br />
     * (退会理由コード)WITHDRAWAL_REASON_CODE: {PK, NotNull, CHAR(3), classification=WithdrawalReason} <br />
     * reason for member withdrawal
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    def withdrawalReasonCodeAsWithdrawalReason: CDef.WithdrawalReason = { dble.getWithdrawalReasonCodeAsWithdrawalReason }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of withdrawalReasonCode Sit? <br />
     * SIT: サイトが使いにくいから
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isWithdrawalReasonCode_Sit: Boolean = { dble.isWithdrawalReasonCode_Sit }

    /**
     * Is the value of withdrawalReasonCode Prd? <br />
     * PRD: 商品に魅力がないから
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isWithdrawalReasonCode_Prd: Boolean = { dble.isWithdrawalReasonCode_Prd }

    /**
     * Is the value of withdrawalReasonCode Frt? <br />
     * FRT: フリテンだから
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isWithdrawalReasonCode_Frt: Boolean = { dble.isWithdrawalReasonCode_Frt }

    /**
     * Is the value of withdrawalReasonCode Oth? <br />
     * OTH: その他理由
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isWithdrawalReasonCode_Oth: Boolean = { dble.isWithdrawalReasonCode_Oth }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /**
     * [get] (会員退会情報)MEMBER_WITHDRAWAL by WITHDRAWAL_REASON_CODE, named 'memberWithdrawalList'.
     * @return The entity list of referrer property 'memberWithdrawalList'. (NotNull: even if no loading, returns empty list)
     */
    def memberWithdrawalList: List[MemberWithdrawal] = { dble.toImmutableMemberWithdrawalList }

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
            case obj: BsWithdrawalReason => {
                val other: BsWithdrawalReason = obj.asInstanceOf[BsWithdrawalReason];
                {(
                     xSV(withdrawalReasonCode, other.withdrawalReasonCode)
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
     * [get] (退会理由コード)WITHDRAWAL_REASON_CODE: {PK, NotNull, CHAR(3), classification=WithdrawalReason} <br />
     * @return The value of the column 'WITHDRAWAL_REASON_CODE'. (NotNull but EmptyAllowed if null in database)
     */
    def withdrawalReasonCode: CDef.WithdrawalReason = { dble.getWithdrawalReasonCodeAsWithdrawalReason }

    /**
     * [get] (退会理由テキスト)WITHDRAWAL_REASON_TEXT: {NotNull, CLOB(2147483647)} <br />
     * @return The value of the column 'WITHDRAWAL_REASON_TEXT'. (NotNull but EmptyAllowed if null in database)
     */
    def withdrawalReasonText: String = { dble.getWithdrawalReasonText }

    /**
     * [get] DISPLAY_ORDER: {UQ, NotNull, INTEGER(10)} <br />
     * @return The value of the column 'DISPLAY_ORDER'. (NotNull but EmptyAllowed if null in database)
     */
    def displayOrder: Int = { dble.getDisplayOrder }
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
 * The mutable entity of (退会理由)WITHDRAWAL_REASON as TABLE. <br />
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * val withdrawalReasonCode: CDef.WithdrawalReason = entity.withdrawalReasonCode
 * val withdrawalReasonText: String = entity.withdrawalReasonText
 * val displayOrder: Int = entity.displayOrder
 * entity.withdrawalReasonCode = withdrawalReasonCode
 * entity.withdrawalReasonText = withdrawalReasonText
 * entity.displayOrder = displayOrder
 * = = = = = = = = = =/
 * @author DBFlute(AutoGenerator)
 */
abstract class BsMbleWithdrawalReason {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected val dble: DbleWithdrawalReason = new DbleWithdrawalReason();

    // ===================================================================================
    //                                                                      DB-able Entity
    //                                                                      ==============
    def toDBable(): DbleWithdrawalReason = { dble }

    // ===================================================================================
    //                                                                    Immutable Entity
    //                                                                    ================
    def toImmutable(): WithdrawalReason = { dble.toImmutable() }

    // ===================================================================================
    //                                                                          Unique Key
    //                                                                          ==========
    /**
     * To be unique by the unique column. <br />
     * You can update the entity by the key when entity update (NOT batch update).
     * @param displayOrder : UQ, NotNull, INTEGER(10). (NotNull)
     */
    def uniqueBy(displayOrder: Integer): Unit = { dble.setDisplayOrder(displayOrder); }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of withdrawalReasonCode as the classification of WithdrawalReason. <br />
     * (退会理由コード)WITHDRAWAL_REASON_CODE: {PK, NotNull, CHAR(3), classification=WithdrawalReason} <br />
     * reason for member withdrawal
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    def withdrawalReasonCodeAsWithdrawalReason: CDef.WithdrawalReason = { dble.getWithdrawalReasonCodeAsWithdrawalReason }

    /**
     * Set the value of withdrawalReasonCode as the classification of WithdrawalReason. <br />
     * (退会理由コード)WITHDRAWAL_REASON_CODE: {PK, NotNull, CHAR(3), classification=WithdrawalReason} <br />
     * reason for member withdrawal
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    def withdrawalReasonCodeAsWithdrawalReason_=(cdef: CDef.WithdrawalReason): Unit = { dble.setWithdrawalReasonCodeAsWithdrawalReason(cdef) }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of withdrawalReasonCode as Sit (SIT). <br />
     * SIT: サイトが使いにくいから
     */
    def withdrawalReasonCode_Sit: Unit = { dble.setWithdrawalReasonCode_Sit }

    /**
     * Set the value of withdrawalReasonCode as Prd (PRD). <br />
     * PRD: 商品に魅力がないから
     */
    def withdrawalReasonCode_Prd: Unit = { dble.setWithdrawalReasonCode_Prd }

    /**
     * Set the value of withdrawalReasonCode as Frt (FRT). <br />
     * FRT: フリテンだから
     */
    def withdrawalReasonCode_Frt: Unit = { dble.setWithdrawalReasonCode_Frt }

    /**
     * Set the value of withdrawalReasonCode as Oth (OTH). <br />
     * OTH: その他理由
     */
    def withdrawalReasonCode_Oth: Unit = { dble.setWithdrawalReasonCode_Oth }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of withdrawalReasonCode Sit? <br />
     * SIT: サイトが使いにくいから
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isWithdrawalReasonCode_Sit: Boolean = { dble.isWithdrawalReasonCode_Sit }

    /**
     * Is the value of withdrawalReasonCode Prd? <br />
     * PRD: 商品に魅力がないから
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isWithdrawalReasonCode_Prd: Boolean = { dble.isWithdrawalReasonCode_Prd }

    /**
     * Is the value of withdrawalReasonCode Frt? <br />
     * FRT: フリテンだから
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isWithdrawalReasonCode_Frt: Boolean = { dble.isWithdrawalReasonCode_Frt }

    /**
     * Is the value of withdrawalReasonCode Oth? <br />
     * OTH: その他理由
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    def isWithdrawalReasonCode_Oth: Boolean = { dble.isWithdrawalReasonCode_Oth }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (退会理由コード)WITHDRAWAL_REASON_CODE: {PK, NotNull, CHAR(3), classification=WithdrawalReason} <br />
     * @return The value of the column 'WITHDRAWAL_REASON_CODE'. (basically NotNull if selected: for the constraint)
     */
    def withdrawalReasonCode: CDef.WithdrawalReason = { dble.getWithdrawalReasonCodeAsWithdrawalReason }

    /**
     * [set] (退会理由コード)WITHDRAWAL_REASON_CODE: {PK, NotNull, CHAR(3), classification=WithdrawalReason} <br />
     * @param withdrawalReasonCode The value of the column 'WITHDRAWAL_REASON_CODE'. (NullAllowed: null update allowed for no constraint)
     */
    protected def withdrawalReasonCode_=(withdrawalReasonCode: CDef.WithdrawalReason) = { dble.setWithdrawalReasonCodeAsWithdrawalReason(withdrawalReasonCode) }

    /**
     * [get] (退会理由テキスト)WITHDRAWAL_REASON_TEXT: {NotNull, CLOB(2147483647)} <br />
     * @return The value of the column 'WITHDRAWAL_REASON_TEXT'. (basically NotNull if selected: for the constraint)
     */
    def withdrawalReasonText: String = { dble.getWithdrawalReasonText }

    /**
     * [set] (退会理由テキスト)WITHDRAWAL_REASON_TEXT: {NotNull, CLOB(2147483647)} <br />
     * @param withdrawalReasonText The value of the column 'WITHDRAWAL_REASON_TEXT'. (NullAllowed: null update allowed for no constraint)
     */
    def withdrawalReasonText_=(withdrawalReasonText: String) = { dble.setWithdrawalReasonText(withdrawalReasonText) }

    /**
     * [get] DISPLAY_ORDER: {UQ, NotNull, INTEGER(10)} <br />
     * @return The value of the column 'DISPLAY_ORDER'. (basically NotNull if selected: for the constraint)
     */
    def displayOrder: Int = { dble.getDisplayOrder }

    /**
     * [set] DISPLAY_ORDER: {UQ, NotNull, INTEGER(10)} <br />
     * @param displayOrder The value of the column 'DISPLAY_ORDER'. (NullAllowed: null update allowed for no constraint)
     */
    def displayOrder_=(displayOrder: Int) = { dble.setDisplayOrder(displayOrder) }
}
