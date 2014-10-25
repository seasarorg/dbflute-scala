package com.example.dbflute.scala.dbflute.cbean.cq.bs;

import scala.collection.immutable;
import scala.collection.JavaConverters._;

import java.util.Collection;
import java.util.Date;

import org.seasar.dbflute.cbean._;
import org.seasar.dbflute.cbean.AbstractConditionQuery._;
import org.seasar.dbflute.cbean.chelper._;
import org.seasar.dbflute.cbean.ckey._;
import org.seasar.dbflute.cbean.coption._;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.dbmeta.DBMetaProvider;
import org.seasar.dbflute.util.DfTypeUtil;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import com.example.dbflute.scala.dbflute.allcommon._;
import com.example.dbflute.scala.dbflute.cbean._;
import com.example.dbflute.scala.dbflute.cbean.cq._;

/**
 * The abstract condition-query of MEMBER_SERVICE.
 * @author DBFlute(AutoGenerator)
 */
abstract class AbstractBsMemberServiceCQ(referrerQuery: ConditionQuery, sqlClause: SqlClause, aliasName: String, nestLevel: Integer)
        extends AbstractConditionQuery(referrerQuery, sqlClause, aliasName, nestLevel) {

    // ===================================================================================
    //                                                                     DBMeta Provider
    //                                                                     ===============
    @Override
    protected def xgetDBMetaProvider(): DBMetaProvider = {
        return DBMetaInstanceHandler.getProvider();
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    def getTableDbName(): String = {
        return "MEMBER_SERVICE";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員サービスID)MEMBER_SERVICE_ID: {PK, ID, NotNull, INTEGER(10)}
     * @param memberServiceId The value of memberServiceId as equal. (NullAllowed: if null, no condition)
     */
    def setMemberServiceId_Equal(memberServiceId: Int): Unit = {
        doSetMemberServiceId_Equal(memberServiceId);
    }

    protected def doSetMemberServiceId_Equal(memberServiceId: Integer): Unit = {
        regMemberServiceId(CK_EQ, memberServiceId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員サービスID)MEMBER_SERVICE_ID: {PK, ID, NotNull, INTEGER(10)}
     * @param memberServiceId The value of memberServiceId as notEqual. (NullAllowed: if null, no condition)
     */
    def setMemberServiceId_NotEqual(memberServiceId: Int): Unit = {
        doSetMemberServiceId_NotEqual(memberServiceId);
    }

    protected def doSetMemberServiceId_NotEqual(memberServiceId: Integer): Unit = {
        regMemberServiceId(CK_NES, memberServiceId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員サービスID)MEMBER_SERVICE_ID: {PK, ID, NotNull, INTEGER(10)}
     * @param memberServiceId The value of memberServiceId as greaterThan. (NullAllowed: if null, no condition)
     */
    def setMemberServiceId_GreaterThan(memberServiceId: Int): Unit = {
        regMemberServiceId(CK_GT, memberServiceId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員サービスID)MEMBER_SERVICE_ID: {PK, ID, NotNull, INTEGER(10)}
     * @param memberServiceId The value of memberServiceId as lessThan. (NullAllowed: if null, no condition)
     */
    def setMemberServiceId_LessThan(memberServiceId: Int): Unit = {
        regMemberServiceId(CK_LT, memberServiceId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員サービスID)MEMBER_SERVICE_ID: {PK, ID, NotNull, INTEGER(10)}
     * @param memberServiceId The value of memberServiceId as greaterEqual. (NullAllowed: if null, no condition)
     */
    def setMemberServiceId_GreaterEqual(memberServiceId: Int): Unit = {
        regMemberServiceId(CK_GE, memberServiceId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員サービスID)MEMBER_SERVICE_ID: {PK, ID, NotNull, INTEGER(10)}
     * @param memberServiceId The value of memberServiceId as lessEqual. (NullAllowed: if null, no condition)
     */
    def setMemberServiceId_LessEqual(memberServiceId: Int): Unit = {
        regMemberServiceId(CK_LE, memberServiceId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (会員サービスID)MEMBER_SERVICE_ID: {PK, ID, NotNull, INTEGER(10)}
     * @param minNumber The min number of memberServiceId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of memberServiceId. (NullAllowed: if null, no to-condition)
     * @param optionCall The callback for option of range-of. (NotNull)
     */
    def setMemberServiceId_RangeOf(minNumber: Int, maxNumber: Int)(optionCall: (RangeOfOption) => Unit): Unit = {
        regROO(minNumber, maxNumber, getCValueMemberServiceId(), "MEMBER_SERVICE_ID", callbackROOP(optionCall));
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (会員サービスID)MEMBER_SERVICE_ID: {PK, ID, NotNull, INTEGER(10)}
     * @param memberServiceIdList The collection of memberServiceId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    def setMemberServiceId_InScope(memberServiceIdList: List[Int]): Unit = {
        doSetMemberServiceId_InScope(toMutableValueCollectionImplicitly(memberServiceIdList));
    }

    protected def doSetMemberServiceId_InScope(memberServiceIdList: Collection[Integer]): Unit = {
        regINS(CK_INS, cTL(memberServiceIdList), getCValueMemberServiceId(), "MEMBER_SERVICE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (会員サービスID)MEMBER_SERVICE_ID: {PK, ID, NotNull, INTEGER(10)}
     * @param memberServiceIdList The collection of memberServiceId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    def setMemberServiceId_NotInScope(memberServiceIdList: List[Int]): Unit = {
        doSetMemberServiceId_NotInScope(if (memberServiceIdList != null) { memberServiceIdList.map(_.asInstanceOf[Integer]).asJava } else { null });
    }

    protected def doSetMemberServiceId_NotInScope(memberServiceIdList: Collection[Integer]): Unit = {
        regINS(CK_NINS, cTL(memberServiceIdList), getCValueMemberServiceId(), "MEMBER_SERVICE_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * (会員サービスID)MEMBER_SERVICE_ID: {PK, ID, NotNull, INTEGER(10)}
     */
    def setMemberServiceId_IsNull(): Unit = { regMemberServiceId(CK_ISN, AbstractConditionQuery.DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * (会員サービスID)MEMBER_SERVICE_ID: {PK, ID, NotNull, INTEGER(10)}
     */
    def setMemberServiceId_IsNotNull(): Unit = { regMemberServiceId(CK_ISNN, AbstractConditionQuery.DOBJ); }

    protected def regMemberServiceId(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValueMemberServiceId(), "MEMBER_SERVICE_ID"); }
    protected def getCValueMemberServiceId(): ConditionValue;

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ID)MEMBER_ID: {UQ, IX, NotNull, INTEGER(10), FK to MEMBER}
     * @param memberId The value of memberId as equal. (NullAllowed: if null, no condition)
     */
    def setMemberId_Equal(memberId: Int): Unit = {
        doSetMemberId_Equal(memberId);
    }

    protected def doSetMemberId_Equal(memberId: Integer): Unit = {
        regMemberId(CK_EQ, memberId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ID)MEMBER_ID: {UQ, IX, NotNull, INTEGER(10), FK to MEMBER}
     * @param memberId The value of memberId as notEqual. (NullAllowed: if null, no condition)
     */
    def setMemberId_NotEqual(memberId: Int): Unit = {
        doSetMemberId_NotEqual(memberId);
    }

    protected def doSetMemberId_NotEqual(memberId: Integer): Unit = {
        regMemberId(CK_NES, memberId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ID)MEMBER_ID: {UQ, IX, NotNull, INTEGER(10), FK to MEMBER}
     * @param memberId The value of memberId as greaterThan. (NullAllowed: if null, no condition)
     */
    def setMemberId_GreaterThan(memberId: Int): Unit = {
        regMemberId(CK_GT, memberId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ID)MEMBER_ID: {UQ, IX, NotNull, INTEGER(10), FK to MEMBER}
     * @param memberId The value of memberId as lessThan. (NullAllowed: if null, no condition)
     */
    def setMemberId_LessThan(memberId: Int): Unit = {
        regMemberId(CK_LT, memberId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ID)MEMBER_ID: {UQ, IX, NotNull, INTEGER(10), FK to MEMBER}
     * @param memberId The value of memberId as greaterEqual. (NullAllowed: if null, no condition)
     */
    def setMemberId_GreaterEqual(memberId: Int): Unit = {
        regMemberId(CK_GE, memberId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ID)MEMBER_ID: {UQ, IX, NotNull, INTEGER(10), FK to MEMBER}
     * @param memberId The value of memberId as lessEqual. (NullAllowed: if null, no condition)
     */
    def setMemberId_LessEqual(memberId: Int): Unit = {
        regMemberId(CK_LE, memberId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ID)MEMBER_ID: {UQ, IX, NotNull, INTEGER(10), FK to MEMBER}
     * @param minNumber The min number of memberId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of memberId. (NullAllowed: if null, no to-condition)
     * @param optionCall The callback for option of range-of. (NotNull)
     */
    def setMemberId_RangeOf(minNumber: Int, maxNumber: Int)(optionCall: (RangeOfOption) => Unit): Unit = {
        regROO(minNumber, maxNumber, getCValueMemberId(), "MEMBER_ID", callbackROOP(optionCall));
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (会員ID)MEMBER_ID: {UQ, IX, NotNull, INTEGER(10), FK to MEMBER}
     * @param memberIdList The collection of memberId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    def setMemberId_InScope(memberIdList: List[Int]): Unit = {
        doSetMemberId_InScope(toMutableValueCollectionImplicitly(memberIdList));
    }

    protected def doSetMemberId_InScope(memberIdList: Collection[Integer]): Unit = {
        regINS(CK_INS, cTL(memberIdList), getCValueMemberId(), "MEMBER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (会員ID)MEMBER_ID: {UQ, IX, NotNull, INTEGER(10), FK to MEMBER}
     * @param memberIdList The collection of memberId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    def setMemberId_NotInScope(memberIdList: List[Int]): Unit = {
        doSetMemberId_NotInScope(if (memberIdList != null) { memberIdList.map(_.asInstanceOf[Integer]).asJava } else { null });
    }

    protected def doSetMemberId_NotInScope(memberIdList: Collection[Integer]): Unit = {
        regINS(CK_NINS, cTL(memberIdList), getCValueMemberId(), "MEMBER_ID");
    }

    protected def regMemberId(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValueMemberId(), "MEMBER_ID"); }
    protected def getCValueMemberId(): ConditionValue;

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * (サービスポイント数)SERVICE_POINT_COUNT: {IX, NotNull, INTEGER(10)}
     * @param servicePointCount The value of servicePointCount as equal. (NullAllowed: if null, no condition)
     */
    def setServicePointCount_Equal(servicePointCount: Int): Unit = {
        doSetServicePointCount_Equal(servicePointCount);
    }

    protected def doSetServicePointCount_Equal(servicePointCount: Integer): Unit = {
        regServicePointCount(CK_EQ, servicePointCount);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (サービスポイント数)SERVICE_POINT_COUNT: {IX, NotNull, INTEGER(10)}
     * @param servicePointCount The value of servicePointCount as notEqual. (NullAllowed: if null, no condition)
     */
    def setServicePointCount_NotEqual(servicePointCount: Int): Unit = {
        doSetServicePointCount_NotEqual(servicePointCount);
    }

    protected def doSetServicePointCount_NotEqual(servicePointCount: Integer): Unit = {
        regServicePointCount(CK_NES, servicePointCount);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (サービスポイント数)SERVICE_POINT_COUNT: {IX, NotNull, INTEGER(10)}
     * @param servicePointCount The value of servicePointCount as greaterThan. (NullAllowed: if null, no condition)
     */
    def setServicePointCount_GreaterThan(servicePointCount: Int): Unit = {
        regServicePointCount(CK_GT, servicePointCount);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (サービスポイント数)SERVICE_POINT_COUNT: {IX, NotNull, INTEGER(10)}
     * @param servicePointCount The value of servicePointCount as lessThan. (NullAllowed: if null, no condition)
     */
    def setServicePointCount_LessThan(servicePointCount: Int): Unit = {
        regServicePointCount(CK_LT, servicePointCount);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (サービスポイント数)SERVICE_POINT_COUNT: {IX, NotNull, INTEGER(10)}
     * @param servicePointCount The value of servicePointCount as greaterEqual. (NullAllowed: if null, no condition)
     */
    def setServicePointCount_GreaterEqual(servicePointCount: Int): Unit = {
        regServicePointCount(CK_GE, servicePointCount);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (サービスポイント数)SERVICE_POINT_COUNT: {IX, NotNull, INTEGER(10)}
     * @param servicePointCount The value of servicePointCount as lessEqual. (NullAllowed: if null, no condition)
     */
    def setServicePointCount_LessEqual(servicePointCount: Int): Unit = {
        regServicePointCount(CK_LE, servicePointCount);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (サービスポイント数)SERVICE_POINT_COUNT: {IX, NotNull, INTEGER(10)}
     * @param minNumber The min number of servicePointCount. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of servicePointCount. (NullAllowed: if null, no to-condition)
     * @param optionCall The callback for option of range-of. (NotNull)
     */
    def setServicePointCount_RangeOf(minNumber: Int, maxNumber: Int)(optionCall: (RangeOfOption) => Unit): Unit = {
        regROO(minNumber, maxNumber, getCValueServicePointCount(), "SERVICE_POINT_COUNT", callbackROOP(optionCall));
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (サービスポイント数)SERVICE_POINT_COUNT: {IX, NotNull, INTEGER(10)}
     * @param servicePointCountList The collection of servicePointCount as inScope. (NullAllowed: if null (or empty), no condition)
     */
    def setServicePointCount_InScope(servicePointCountList: List[Int]): Unit = {
        doSetServicePointCount_InScope(toMutableValueCollectionImplicitly(servicePointCountList));
    }

    protected def doSetServicePointCount_InScope(servicePointCountList: Collection[Integer]): Unit = {
        regINS(CK_INS, cTL(servicePointCountList), getCValueServicePointCount(), "SERVICE_POINT_COUNT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (サービスポイント数)SERVICE_POINT_COUNT: {IX, NotNull, INTEGER(10)}
     * @param servicePointCountList The collection of servicePointCount as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    def setServicePointCount_NotInScope(servicePointCountList: List[Int]): Unit = {
        doSetServicePointCount_NotInScope(if (servicePointCountList != null) { servicePointCountList.map(_.asInstanceOf[Integer]).asJava } else { null });
    }

    protected def doSetServicePointCount_NotInScope(servicePointCountList: Collection[Integer]): Unit = {
        regINS(CK_NINS, cTL(servicePointCountList), getCValueServicePointCount(), "SERVICE_POINT_COUNT");
    }

    protected def regServicePointCount(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValueServicePointCount(), "SERVICE_POINT_COUNT"); }
    protected def getCValueServicePointCount(): ConditionValue;

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (サービスランクコード)SERVICE_RANK_CODE: {IX, NotNull, CHAR(3), FK to SERVICE_RANK, classification=ServiceRank}
     * @param serviceRankCode The value of serviceRankCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    protected def setServiceRankCode_Equal(serviceRankCode: String): Unit = {
        doSetServiceRankCode_Equal(fRES(serviceRankCode));
    }

    /**
     * Equal(=). As ServiceRank. And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (サービスランクコード)SERVICE_RANK_CODE: {IX, NotNull, CHAR(3), FK to SERVICE_RANK, classification=ServiceRank} <br />
     * rank of service member gets
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, no condition)
     */
    def setServiceRankCode_Equal_AsServiceRank(cdef: CDef.ServiceRank): Unit = {
        doSetServiceRankCode_Equal(if (cdef != null) { cdef.code } else { null });
    }

    /**
     * Equal(=). As Platinum (PLT). And OnlyOnceRegistered. <br />
     * PLATINUM: platinum rank
     */
    def setServiceRankCode_Equal_Platinum(): Unit = {
        setServiceRankCode_Equal_AsServiceRank(CDef.ServiceRank.Platinum);
    }

    /**
     * Equal(=). As Gold (GLD). And OnlyOnceRegistered. <br />
     * GOLD: gold rank
     */
    def setServiceRankCode_Equal_Gold(): Unit = {
        setServiceRankCode_Equal_AsServiceRank(CDef.ServiceRank.Gold);
    }

    /**
     * Equal(=). As Silver (SIL). And OnlyOnceRegistered. <br />
     * SILVER: silver rank
     */
    def setServiceRankCode_Equal_Silver(): Unit = {
        setServiceRankCode_Equal_AsServiceRank(CDef.ServiceRank.Silver);
    }

    /**
     * Equal(=). As Bronze (BRZ). And OnlyOnceRegistered. <br />
     * BRONZE: bronze rank
     */
    def setServiceRankCode_Equal_Bronze(): Unit = {
        setServiceRankCode_Equal_AsServiceRank(CDef.ServiceRank.Bronze);
    }

    /**
     * Equal(=). As Plastic (PLS). And OnlyOnceRegistered. <br />
     * PLASTIC: plastic rank
     */
    def setServiceRankCode_Equal_Plastic(): Unit = {
        setServiceRankCode_Equal_AsServiceRank(CDef.ServiceRank.Plastic);
    }

    protected def doSetServiceRankCode_Equal(serviceRankCode: String): Unit = {
        regServiceRankCode(CK_EQ, hSC("SERVICE_RANK_CODE", serviceRankCode, 3, "E"));
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (サービスランクコード)SERVICE_RANK_CODE: {IX, NotNull, CHAR(3), FK to SERVICE_RANK, classification=ServiceRank}
     * @param serviceRankCode The value of serviceRankCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    protected def setServiceRankCode_NotEqual(serviceRankCode: String): Unit = {
        doSetServiceRankCode_NotEqual(fRES(serviceRankCode));
    }

    /**
     * NotEqual(&lt;&gt;). As ServiceRank. And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (サービスランクコード)SERVICE_RANK_CODE: {IX, NotNull, CHAR(3), FK to SERVICE_RANK, classification=ServiceRank} <br />
     * rank of service member gets
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, no condition)
     */
    def setServiceRankCode_NotEqual_AsServiceRank(cdef: CDef.ServiceRank): Unit = {
        doSetServiceRankCode_NotEqual(if (cdef != null) { cdef.code } else { null });
    }

    /**
     * NotEqual(&lt;&gt;). As Platinum (PLT). And OnlyOnceRegistered. <br />
     * PLATINUM: platinum rank
     */
    def setServiceRankCode_NotEqual_Platinum(): Unit = {
        setServiceRankCode_NotEqual_AsServiceRank(CDef.ServiceRank.Platinum);
    }

    /**
     * NotEqual(&lt;&gt;). As Gold (GLD). And OnlyOnceRegistered. <br />
     * GOLD: gold rank
     */
    def setServiceRankCode_NotEqual_Gold(): Unit = {
        setServiceRankCode_NotEqual_AsServiceRank(CDef.ServiceRank.Gold);
    }

    /**
     * NotEqual(&lt;&gt;). As Silver (SIL). And OnlyOnceRegistered. <br />
     * SILVER: silver rank
     */
    def setServiceRankCode_NotEqual_Silver(): Unit = {
        setServiceRankCode_NotEqual_AsServiceRank(CDef.ServiceRank.Silver);
    }

    /**
     * NotEqual(&lt;&gt;). As Bronze (BRZ). And OnlyOnceRegistered. <br />
     * BRONZE: bronze rank
     */
    def setServiceRankCode_NotEqual_Bronze(): Unit = {
        setServiceRankCode_NotEqual_AsServiceRank(CDef.ServiceRank.Bronze);
    }

    /**
     * NotEqual(&lt;&gt;). As Plastic (PLS). And OnlyOnceRegistered. <br />
     * PLASTIC: plastic rank
     */
    def setServiceRankCode_NotEqual_Plastic(): Unit = {
        setServiceRankCode_NotEqual_AsServiceRank(CDef.ServiceRank.Plastic);
    }

    protected def doSetServiceRankCode_NotEqual(serviceRankCode: String): Unit = {
        regServiceRankCode(CK_NES, hSC("SERVICE_RANK_CODE", serviceRankCode, 3, "E"));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (サービスランクコード)SERVICE_RANK_CODE: {IX, NotNull, CHAR(3), FK to SERVICE_RANK, classification=ServiceRank}
     * @param serviceRankCodeList The collection of serviceRankCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    def setServiceRankCode_InScope(serviceRankCodeList: List[String]): Unit = {
        doSetServiceRankCode_InScope(toMutableValueCollectionImplicitly(serviceRankCodeList));
    }

    /**
     * InScope {in ('a', 'b')}. As ServiceRank. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (サービスランクコード)SERVICE_RANK_CODE: {IX, NotNull, CHAR(3), FK to SERVICE_RANK, classification=ServiceRank} <br />
     * rank of service member gets
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    def setServiceRankCode_InScope_AsServiceRank(cdefList: List[CDef.ServiceRank]): Unit = {
        doSetServiceRankCode_InScope(cTStrL(cdefList.asJava));
    }

    protected def doSetServiceRankCode_InScope(serviceRankCodeList: Collection[String]): Unit = {
        regINS(CK_INS, cTL(serviceRankCodeList), getCValueServiceRankCode(), "SERVICE_RANK_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (サービスランクコード)SERVICE_RANK_CODE: {IX, NotNull, CHAR(3), FK to SERVICE_RANK, classification=ServiceRank}
     * @param serviceRankCodeList The collection of serviceRankCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    def setServiceRankCode_NotInScope(serviceRankCodeList: List[String]): Unit = {
        doSetServiceRankCode_NotInScope(if (serviceRankCodeList != null) { serviceRankCodeList.map(_.asInstanceOf[String]).asJava } else { null });
    }

    /**
     * NotInScope {not in ('a', 'b')}. As ServiceRank. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (サービスランクコード)SERVICE_RANK_CODE: {IX, NotNull, CHAR(3), FK to SERVICE_RANK, classification=ServiceRank} <br />
     * rank of service member gets
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    def setServiceRankCode_NotInScope_AsServiceRank(cdefList: List[CDef.ServiceRank]): Unit = {
        doSetServiceRankCode_NotInScope(cTStrL(cdefList.asJava));
    }

    protected def doSetServiceRankCode_NotInScope(serviceRankCodeList: Collection[String]): Unit = {
        regINS(CK_NINS, cTL(serviceRankCodeList), getCValueServiceRankCode(), "SERVICE_RANK_CODE");
    }

    protected def regServiceRankCode(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValueServiceRankCode(), "SERVICE_RANK_CODE"); }
    protected def getCValueServiceRankCode(): ConditionValue;

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * REGISTER_DATETIME: {NotNull, TIMESTAMP(23, 10)}
     * @param registerDatetime The value of registerDatetime as equal. (NullAllowed: if null, no condition)
     */
    def setRegisterDatetime_Equal(registerDatetime: org.joda.time.LocalDateTime): Unit = {
        regRegisterDatetime(CK_EQ,  registerDatetime);
    }

    protected def regRegisterDatetime(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValueRegisterDatetime(), "REGISTER_DATETIME"); }
    protected def getCValueRegisterDatetime(): ConditionValue;

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * REGISTER_USER: {NotNull, VARCHAR(200)}
     * @param registerUser The value of registerUser as equal. (NullAllowed: if null (or empty), no condition)
     */
    def setRegisterUser_Equal(registerUser: String): Unit = {
        doSetRegisterUser_Equal(fRES(registerUser));
    }

    protected def doSetRegisterUser_Equal(registerUser: String): Unit = {
        regRegisterUser(CK_EQ, registerUser);
    }

    protected def regRegisterUser(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValueRegisterUser(), "REGISTER_USER"); }
    protected def getCValueRegisterUser(): ConditionValue;

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * UPDATE_DATETIME: {NotNull, TIMESTAMP(23, 10)}
     * @param updateDatetime The value of updateDatetime as equal. (NullAllowed: if null, no condition)
     */
    def setUpdateDatetime_Equal(updateDatetime: org.joda.time.LocalDateTime): Unit = {
        regUpdateDatetime(CK_EQ,  updateDatetime);
    }

    protected def regUpdateDatetime(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValueUpdateDatetime(), "UPDATE_DATETIME"); }
    protected def getCValueUpdateDatetime(): ConditionValue;

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * UPDATE_USER: {NotNull, VARCHAR(200)}
     * @param updateUser The value of updateUser as equal. (NullAllowed: if null (or empty), no condition)
     */
    def setUpdateUser_Equal(updateUser: String): Unit = {
        doSetUpdateUser_Equal(fRES(updateUser));
    }

    protected def doSetUpdateUser_Equal(updateUser: String): Unit = {
        regUpdateUser(CK_EQ, updateUser);
    }

    protected def regUpdateUser(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValueUpdateUser(), "UPDATE_USER"); }
    protected def getCValueUpdateUser(): ConditionValue;

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * VERSION_NO: {NotNull, BIGINT(19)}
     * @param versionNo The value of versionNo as equal. (NullAllowed: if null, no condition)
     */
    def setVersionNo_Equal(versionNo: Long): Unit = {
        doSetVersionNo_Equal(versionNo);
    }

    protected def doSetVersionNo_Equal(versionNo: Long): Unit = {
        regVersionNo(CK_EQ, versionNo);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * VERSION_NO: {NotNull, BIGINT(19)}
     * @param minNumber The min number of versionNo. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of versionNo. (NullAllowed: if null, no to-condition)
     * @param optionCall The callback for option of range-of. (NotNull)
     */
    def setVersionNo_RangeOf(minNumber: Long, maxNumber: Long)(optionCall: (RangeOfOption) => Unit): Unit = {
        regROO(minNumber, maxNumber, getCValueVersionNo(), "VERSION_NO", callbackROOP(optionCall));
    }

    protected def regVersionNo(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValueVersionNo(), "VERSION_NO"); }
    protected def getCValueVersionNo(): ConditionValue;

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;MemberServiceCB&gt;() {
     *     public void query(MemberServiceCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_Equal(): ScrHpSSQFunction[MemberServiceCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_EQ, classOf[MemberServiceCB]));
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;MemberServiceCB&gt;() {
     *     public void query(MemberServiceCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_NotEqual(): ScrHpSSQFunction[MemberServiceCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_NES, classOf[MemberServiceCB]));
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;MemberServiceCB&gt;() {
     *     public void query(MemberServiceCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_GreaterThan(): ScrHpSSQFunction[MemberServiceCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_GT, classOf[MemberServiceCB]));
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;MemberServiceCB&gt;() {
     *     public void query(MemberServiceCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_LessThan(): ScrHpSSQFunction[MemberServiceCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_LT, classOf[MemberServiceCB]));
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;MemberServiceCB&gt;() {
     *     public void query(MemberServiceCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_GreaterEqual(): ScrHpSSQFunction[MemberServiceCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_GE, classOf[MemberServiceCB]));
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MemberServiceCB&gt;() {
     *     public void query(MemberServiceCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_LessEqual(): ScrHpSSQFunction[MemberServiceCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_LE, classOf[MemberServiceCB]));
    }

    protected def toScalaSSQFunction(function: HpSSQFunction[MemberServiceCB]): ScrHpSSQFunction[MemberServiceCB] =
    { new ScrHpSSQFunction(function) }

    override protected def xscalarCondition[CB <: ConditionBean](fn: String, sq: SubQuery[CB], rd: String, op: HpSSQOption[CB]): Unit = {
        assertObjectNotNull("subQuery", sq);
        val cb: MemberServiceCB = xcreateScalarConditionCB(); sq.query(cb.asInstanceOf[CB]);
        val pp: String = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean(xcreateScalarConditionPartitionByCB().asInstanceOf[CB]); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    def keepScalarCondition(sq: MemberServiceCQ): String;

    protected def xcreateScalarConditionCB(): MemberServiceCB = {
        val cb: MemberServiceCB = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected def xcreateScalarConditionPartitionByCB(): MemberServiceCB = {
        val cb: MemberServiceCB = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    def xsmyselfDerive(fn: String, sq: SubQuery[MemberServiceCB], al: String, op: DerivedReferrerOption): Unit = {
        assertObjectNotNull("subQuery", sq);
        val cb: MemberServiceCB = new MemberServiceCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        val pp: String = keepSpecifyMyselfDerived(cb.query());
        val pk: String = "MEMBER_SERVICE_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    def keepSpecifyMyselfDerived(sq: MemberServiceCQ): String;

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    def myselfDerived(): ScrHpQDRFunction[MemberServiceCB] = {
        return toScalaQDRFunction(xcreateQDRFunctionMyselfDerived(classOf[MemberServiceCB]));
    }
    override protected def xqderiveMyselfDerived[CB <: ConditionBean](fn: String, sq: SubQuery[CB], rd: String, vl: Object, op: DerivedReferrerOption): Unit = {
        assertObjectNotNull("subQuery", sq);
        val cb: MemberServiceCB = new MemberServiceCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb.asInstanceOf[CB]);
        val pk: String = "MEMBER_SERVICE_ID";
        val sqpp: String = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        val prpp: String = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    def keepQueryMyselfDerived(sq: MemberServiceCQ): String;
    def keepQueryMyselfDerivedParameter(vl: Object): String;

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    def myselfExists(subQuery: (MemberServiceCB) => Unit): Unit = {
        assertObjectNotNull("subQuery", subQuery);
        val cb: MemberServiceCB = new MemberServiceCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery(cb); } finally { unlock(); }
        val pp: String = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    def keepMyselfExists(sq: MemberServiceCQ): String;

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    def myselfInScope(subQuery: (MemberServiceCB) => Unit): Unit = {
        assertObjectNotNull("subQuery", subQuery);
        val cb: MemberServiceCB = new MemberServiceCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery(cb); } finally { unlock(); }
        val pp: String = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    def keepMyselfInScope(sq: MemberServiceCQ): String;

    // ===================================================================================
    //                                                                            Order By
    //                                                                            ========
    /**
     * Order along manual ordering information.
     * <pre>
     * MemberCB cb = new MemberCB();
     * ManualOrderBean mob = new ManualOrderBean();
     * mob.<span style="color: #DD4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #DD4747">withManualOrder(mob)</span>;
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * MemberCB cb = new MemberCB();
     * ManualOrderBean mob = new ManualOrderBean();
     * mob.<span style="color: #DD4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     * mob.<span style="color: #DD4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     * mob.<span style="color: #DD4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #DD4747">withManualOrder(mob)</span>;
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * <p>This function with Union is unsupported!</p>
     * <p>The order values are bound (treated as bind parameter).</p>
     * @param mob The bean of manual order containing order values. (NotNull)
     */
    def withManualOrder(mobCall: (ScrManualOrderBean) => Unit): Unit = { // is user public!
        assertObjectNotNull("withManualOrder(mobCall)", mobCall);
        xdoWithManualOrder(callbackMOB(mobCall));
    }

    protected def toUtilDate(date: Object): Date = {
        if (date != null && date.isInstanceOf[ReadablePartial]) {
            return new Date(date.asInstanceOf[ReadablePartial].toDateTime(null).getMillis());
        } else if (date != null && date.isInstanceOf[ReadableInstant]) {
            return new Date(date.asInstanceOf[ReadableInstant].getMillis());
        }
        return DfTypeUtil.toDate(date);
    }

    protected def toTimestamp(date: Object): java.sql.Timestamp = {
        if (date != null && date.isInstanceOf[ReadablePartial]) {
            return new java.sql.Timestamp(date.asInstanceOf[ReadablePartial].toDateTime(null).getMillis());
        } else if (date != null && date.isInstanceOf[ReadableInstant]) {
            return new java.sql.Timestamp(date.asInstanceOf[ReadableInstant].getMillis());
        }
        return DfTypeUtil.toTimestamp(date);
    }

    override protected def filterFromToRegisteredDate(date: Date, columnDbName: String): Object = {
        if (date.isInstanceOf[java.sql.Timestamp]) {
            return LocalDateTime.fromDateFields(date);
        } else { // basically pure Date
            return LocalDate.fromDateFields(date);
        }
    }

    // ===================================================================================
    //                                                                       Create Option
    //                                                                       =============
    protected def callbackLSOP(optionCall: (ScrLikeSearchOption) => Unit): LikeSearchOption =
    { val op = createLikeSearchOption(); optionCall(op); return op; }
    protected def createLikeSearchOption(): ScrLikeSearchOption = { new ScrLikeSearchOption() }

    protected def callbackFTOP(optionCall: (ScrFromToOption) => Unit): FromToOption =
    { val op = createFromToOption(); optionCall(op); return op; }
    protected def createFromToOption(): ScrFromToOption = { new ScrFromToOption() }

    protected def callbackROOP(optionCall: (ScrRangeOfOption) => Unit): RangeOfOption =
    { val op = createRangeOfOption(); optionCall(op); return op; }
    protected def createRangeOfOption(): ScrRangeOfOption = { new ScrRangeOfOption() }

    protected def callbackMOB(mobCall: (ScrManualOrderBean) => Unit): ManualOrderBean =
    { val mob = createManualOrderBean(); mobCall(mob); return mob; }
    protected def createManualOrderBean(): ScrManualOrderBean = { new ScrManualOrderBean() }

    // ===================================================================================
    //                                                                        Invoke Query
    //                                                                        ============
    override protected def xfilterInvokeQueryParameterType(colName: String, ckey: String, parameterType: Class[_]): Class[_] =
    { if (classOf[Collection[_]].isAssignableFrom(parameterType)) { classOf[List[_]] } else { parameterType } }

    override protected def xfilterInvokeQueryParameterValue(colName: String, ckey: String, parameterValue: Object): Object =
    { if (parameterValue.isInstanceOf[Collection[_]]) { toScalaList(parameterValue.asInstanceOf[Collection[_]]) } else { parameterValue } }

    // ===================================================================================
    //                                                                        Scala Helper
    //                                                                        ============
    protected def toScalaList[ENTITY](javaList: Collection[ENTITY]): immutable.List[ENTITY] = {
        if (javaList == null) { immutable.List() }
        return javaList.toArray.toList.asInstanceOf[immutable.List[ENTITY]];
    }

    protected def toMutableValueCollectionImplicitly[SCALA, JAVA](ls: immutable.List[SCALA]): Collection[JAVA] =
    { if (ls != null) { ls.map(_.asInstanceOf[JAVA]).asJava } else { null } }

    protected def toScalaQDRFunction[CB <: ConditionBean](function: HpQDRFunction[CB]): ScrHpQDRFunction[CB] =
    { new ScrHpQDRFunction[CB](function) }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected def newMyCB(): MemberServiceCB = {
        return new MemberServiceCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected def xabUDT(): String = { return classOf[Date].getName(); }
    protected def xabCQ(): String = { return classOf[MemberServiceCQ].getName(); }
    protected def xabLSO(): String = { return classOf[LikeSearchOption].getName(); }
    protected def xabSSQS(): String = { return classOf[HpSSQSetupper[_]].getName(); }
}
