package com.example.dbflute.scala.dbflute.bsbhv.cursor;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.seasar.dbflute.jdbc.ValueType;
import org.seasar.dbflute.s2dao.valuetype.TnValueTypes;

/**
 * The cursor of PurchaseSummaryMember. <br />
 * @author DBFlute(AutoGenerator)
 */
class BsPurchaseSummaryMemberCursor {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    // -----------------------------------------------------
    //                                        Column DB Name
    //                                        --------------
    /** DB name of MEMBER_ID. */
    val DB_NAME_MEMBER_ID: String = "MEMBER_ID";

    /** DB name of MEMBER_NAME. */
    val DB_NAME_MEMBER_NAME: String = "MEMBER_NAME";

    /** DB name of BIRTHDATE. */
    val DB_NAME_BIRTHDATE: String = "BIRTHDATE";

    /** DB name of FORMALIZED_DATETIME. */
    val DB_NAME_FORMALIZED_DATETIME: String = "FORMALIZED_DATETIME";

    /** DB name of PURCHASE_SUMMARY. */
    val DB_NAME_PURCHASE_SUMMARY: String = "PURCHASE_SUMMARY";

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** Wrapped result set. */
    protected var _rs: ResultSet = null;

    protected var _vtMemberId: ValueType = vt(classOf[Integer]);
    protected var _vtMemberName: ValueType = vt(classOf[String]);
    protected var _vtBirthdate: ValueType = vt(classOf[org.joda.time.LocalDate]);
    protected var _vtFormalizedDatetime: ValueType = vt(classOf[org.joda.time.LocalDateTime]);
    protected var _vtPurchaseSummary: ValueType = vt(classOf[Long]);

    protected def vt(tp: Class[_]): ValueType = {
        return TnValueTypes.getValueType(tp);
    }

    protected def vt(tp: Class[_], name: String): ValueType = {
        val valueType: ValueType = TnValueTypes.getPluginValueType(name);
        return if (valueType != null) { valueType } else { vt(tp) };
    }

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========

    // ===================================================================================
    //                                                                             Prepare
    //                                                                             =======
    /**
     * Accept the result set.
     * @param rs The cursor (result set) for the query, which has first pointer. (NotNull)
     */
    def accept(rs: ResultSet): Unit = {
        this._rs = rs;
    }

    // ===================================================================================
    //                                                                              Direct
    //                                                                              ======
    /**
     * Get the wrapped cursor (result set).
     * @return The instance of result set. (NotNull)
     */
    def cursor(): ResultSet = {
        return _rs;
    }

    // ===================================================================================
    //                                                                            Delegate
    //                                                                            ========
    /**
     * Move to next result.
     * @return Is exist next result.
     * @throws SQLException
     */
    def next(): Boolean = {
        return _rs.next();
    }

    // ===================================================================================
    //                                                                  Type Safe Accessor
    //                                                                  ==================
    /**
     * [get] (会員ID)MEMBER_ID: {INTEGER(10), refers to MEMBER.MEMBER_ID} <br />
     * @return The value of memberId. (NullAllowed)
     * @throws java.sql.SQLException
     */
    def memberId: Int = {
        return _vtMemberId.getValue(_rs, DB_NAME_MEMBER_ID).asInstanceOf[Int];
    }

    /**
     * [get] (会員名称)MEMBER_NAME: {VARCHAR(200), refers to MEMBER.MEMBER_NAME} <br />
     * @return The value of memberName. (NullAllowed)
     * @throws java.sql.SQLException
     */
    def memberName: String = {
        return _vtMemberName.getValue(_rs, DB_NAME_MEMBER_NAME).asInstanceOf[String];
    }

    /**
     * [get] (生年月日)BIRTHDATE: {DATE(8), refers to MEMBER.BIRTHDATE} <br />
     * @return The value of birthdate. (NullAllowed)
     * @throws java.sql.SQLException
     */
    def birthdate: org.joda.time.LocalDate = {
        return _vtBirthdate.getValue(_rs, DB_NAME_BIRTHDATE).asInstanceOf[org.joda.time.LocalDate];
    }

    /**
     * [get] (正式会員日時)FORMALIZED_DATETIME: {TIMESTAMP(23, 10), refers to MEMBER.FORMALIZED_DATETIME} <br />
     * @return The value of formalizedDatetime. (NullAllowed)
     * @throws java.sql.SQLException
     */
    def formalizedDatetime: org.joda.time.LocalDateTime = {
        return _vtFormalizedDatetime.getValue(_rs, DB_NAME_FORMALIZED_DATETIME).asInstanceOf[org.joda.time.LocalDateTime];
    }

    /**
     * [get] PURCHASE_SUMMARY: {BIGINT(10)} <br />
     * @return The value of purchaseSummary. (NullAllowed)
     * @throws java.sql.SQLException
     */
    def purchaseSummary: Long = {
        return _vtPurchaseSummary.getValue(_rs, DB_NAME_PURCHASE_SUMMARY).asInstanceOf[Long];
    }

}
