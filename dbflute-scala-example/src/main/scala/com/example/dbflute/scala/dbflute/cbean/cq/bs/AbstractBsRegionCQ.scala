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
 * The abstract condition-query of REGION.
 * @author DBFlute(AutoGenerator)
 */
abstract class AbstractBsRegionCQ(referrerQuery: ConditionQuery, sqlClause: SqlClause, aliasName: String, nestLevel: Integer)
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
        return "REGION";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * (地域ID)REGION_ID: {PK, NotNull, INTEGER(10), classification=Region}
     * @param regionId The value of regionId as equal. (NullAllowed: if null, no condition)
     */
    protected def setRegionId_Equal(regionId: Int): Unit = {
        doSetRegionId_Equal(regionId);
    }

    /**
     * Equal(=). As Region. And NullIgnored, OnlyOnceRegistered. <br />
     * (地域ID)REGION_ID: {PK, NotNull, INTEGER(10), classification=Region} <br />
     * mainly region of member address
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, no condition)
     */
    def setRegionId_Equal_AsRegion(cdef: CDef.Region): Unit = {
        doSetRegionId_Equal(cTNum(if (cdef != null) { cdef.code } else { null }, classOf[Integer]));
    }

    /**
     * Equal(=). As America (1). And NullIgnored, OnlyOnceRegistered. <br />
     * AMERICA
     */
    def setRegionId_Equal_America(): Unit = {
        setRegionId_Equal_AsRegion(CDef.Region.America);
    }

    /**
     * Equal(=). As Canada (2). And NullIgnored, OnlyOnceRegistered. <br />
     * CANADA
     */
    def setRegionId_Equal_Canada(): Unit = {
        setRegionId_Equal_AsRegion(CDef.Region.Canada);
    }

    /**
     * Equal(=). As China (3). And NullIgnored, OnlyOnceRegistered. <br />
     * CHINA
     */
    def setRegionId_Equal_China(): Unit = {
        setRegionId_Equal_AsRegion(CDef.Region.China);
    }

    /**
     * Equal(=). As Chiba (4). And NullIgnored, OnlyOnceRegistered. <br />
     * CHIBA
     */
    def setRegionId_Equal_Chiba(): Unit = {
        setRegionId_Equal_AsRegion(CDef.Region.Chiba);
    }

    protected def doSetRegionId_Equal(regionId: Integer): Unit = {
        regRegionId(CK_EQ, regionId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (地域ID)REGION_ID: {PK, NotNull, INTEGER(10), classification=Region}
     * @param regionId The value of regionId as notEqual. (NullAllowed: if null, no condition)
     */
    protected def setRegionId_NotEqual(regionId: Int): Unit = {
        doSetRegionId_NotEqual(regionId);
    }

    /**
     * NotEqual(&lt;&gt;). As Region. And NullIgnored, OnlyOnceRegistered. <br />
     * (地域ID)REGION_ID: {PK, NotNull, INTEGER(10), classification=Region} <br />
     * mainly region of member address
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, no condition)
     */
    def setRegionId_NotEqual_AsRegion(cdef: CDef.Region): Unit = {
        doSetRegionId_NotEqual(cTNum(if (cdef != null) { cdef.code } else { null }, classOf[Integer]));
    }

    /**
     * NotEqual(&lt;&gt;). As America (1). And NullIgnored, OnlyOnceRegistered. <br />
     * AMERICA
     */
    def setRegionId_NotEqual_America(): Unit = {
        setRegionId_NotEqual_AsRegion(CDef.Region.America);
    }

    /**
     * NotEqual(&lt;&gt;). As Canada (2). And NullIgnored, OnlyOnceRegistered. <br />
     * CANADA
     */
    def setRegionId_NotEqual_Canada(): Unit = {
        setRegionId_NotEqual_AsRegion(CDef.Region.Canada);
    }

    /**
     * NotEqual(&lt;&gt;). As China (3). And NullIgnored, OnlyOnceRegistered. <br />
     * CHINA
     */
    def setRegionId_NotEqual_China(): Unit = {
        setRegionId_NotEqual_AsRegion(CDef.Region.China);
    }

    /**
     * NotEqual(&lt;&gt;). As Chiba (4). And NullIgnored, OnlyOnceRegistered. <br />
     * CHIBA
     */
    def setRegionId_NotEqual_Chiba(): Unit = {
        setRegionId_NotEqual_AsRegion(CDef.Region.Chiba);
    }

    protected def doSetRegionId_NotEqual(regionId: Integer): Unit = {
        regRegionId(CK_NES, regionId);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (地域ID)REGION_ID: {PK, NotNull, INTEGER(10), classification=Region}
     * @param regionIdList The collection of regionId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    def setRegionId_InScope(regionIdList: List[Int]): Unit = {
        doSetRegionId_InScope(toMutableValueCollectionImplicitly(regionIdList));
    }

    /**
     * InScope {in (1, 2)}. As Region. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (地域ID)REGION_ID: {PK, NotNull, INTEGER(10), classification=Region} <br />
     * mainly region of member address
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    def setRegionId_InScope_AsRegion(cdefList: List[CDef.Region]): Unit = {
        doSetRegionId_InScope(cTNumL(cdefList.asJava, classOf[Integer]));
    }

    protected def doSetRegionId_InScope(regionIdList: Collection[Integer]): Unit = {
        regINS(CK_INS, cTL(regionIdList), getCValueRegionId(), "REGION_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (地域ID)REGION_ID: {PK, NotNull, INTEGER(10), classification=Region}
     * @param regionIdList The collection of regionId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    def setRegionId_NotInScope(regionIdList: List[Int]): Unit = {
        doSetRegionId_NotInScope(if (regionIdList != null) { regionIdList.map(_.asInstanceOf[Integer]).asJava } else { null });
    }

    /**
     * NotInScope {not in (1, 2)}. As Region. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (地域ID)REGION_ID: {PK, NotNull, INTEGER(10), classification=Region} <br />
     * mainly region of member address
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    def setRegionId_NotInScope_AsRegion(cdefList: List[CDef.Region]): Unit = {
        doSetRegionId_NotInScope(cTNumL(cdefList.asJava, classOf[Integer]));
    }

    protected def doSetRegionId_NotInScope(regionIdList: Collection[Integer]): Unit = {
        regINS(CK_NINS, cTL(regionIdList), getCValueRegionId(), "REGION_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br />
     * {exists (select REGION_ID from MEMBER_ADDRESS where ...)} <br />
     * (会員住所情報)MEMBER_ADDRESS by REGION_ID, named 'memberAddressAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">existsMemberAddressList</span>(new SubQuery&lt;MemberAddressCB&gt;() {
     *     public void query(MemberAddressCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of MemberAddressList for 'exists'. (NotNull)
     */
    def existsMemberAddressList(subQuery: (MemberAddressCB) => Unit): Unit = {
        assertObjectNotNull("subQuery", subQuery);
        val cb: MemberAddressCB = new MemberAddressCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery(cb); } finally { unlock(); }
        val pp: String = keepRegionId_ExistsReferrer_MemberAddressList(cb.query());
        registerExistsReferrer(cb.query(), "REGION_ID", "REGION_ID", pp, "memberAddressList");
    }
    def keepRegionId_ExistsReferrer_MemberAddressList(sq: MemberAddressCQ): String;

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br />
     * {not exists (select REGION_ID from MEMBER_ADDRESS where ...)} <br />
     * (会員住所情報)MEMBER_ADDRESS by REGION_ID, named 'memberAddressAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">notExistsMemberAddressList</span>(new SubQuery&lt;MemberAddressCB&gt;() {
     *     public void query(MemberAddressCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of RegionId_NotExistsReferrer_MemberAddressList for 'not exists'. (NotNull)
     */
    def notExistsMemberAddressList(subQuery: (MemberAddressCB) => Unit): Unit = {
        assertObjectNotNull("subQuery", subQuery);
        val cb: MemberAddressCB = new MemberAddressCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery(cb); } finally { unlock(); }
        val pp: String = keepRegionId_NotExistsReferrer_MemberAddressList(cb.query());
        registerNotExistsReferrer(cb.query(), "REGION_ID", "REGION_ID", pp, "memberAddressList");
    }
    def keepRegionId_NotExistsReferrer_MemberAddressList(sq: MemberAddressCQ): String;

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select REGION_ID from MEMBER_ADDRESS where ...)} <br />
     * (会員住所情報)MEMBER_ADDRESS by REGION_ID, named 'memberAddressAsOne'.
     * @param subQuery The sub-query of MemberAddressList for 'in-scope'. (NotNull)
     */
    def inScopeMemberAddressList(subQuery: (MemberAddressCB) => Unit): Unit = {
        assertObjectNotNull("subQuery", subQuery);
        val cb: MemberAddressCB = new MemberAddressCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery(cb); } finally { unlock(); }
        val pp: String = keepRegionId_InScopeRelation_MemberAddressList(cb.query());
        registerInScopeRelation(cb.query(), "REGION_ID", "REGION_ID", pp, "memberAddressList");
    }
    def keepRegionId_InScopeRelation_MemberAddressList(sq: MemberAddressCQ): String;

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select REGION_ID from MEMBER_ADDRESS where ...)} <br />
     * (会員住所情報)MEMBER_ADDRESS by REGION_ID, named 'memberAddressAsOne'.
     * @param subQuery The sub-query of MemberAddressList for 'not in-scope'. (NotNull)
     */
    def notInScopeMemberAddressList(subQuery: (MemberAddressCB) => Unit): Unit = {
        assertObjectNotNull("subQuery", subQuery);
        val cb: MemberAddressCB = new MemberAddressCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery(cb); } finally { unlock(); }
        val pp: String = keepRegionId_NotInScopeRelation_MemberAddressList(cb.query());
        registerNotInScopeRelation(cb.query(), "REGION_ID", "REGION_ID", pp, "memberAddressList");
    }
    def keepRegionId_NotInScopeRelation_MemberAddressList(sq: MemberAddressCQ): String;

    def xsderiveMemberAddressList(fn: String, sq: SubQuery[MemberAddressCB], al: String, op: DerivedReferrerOption): Unit = {
        assertObjectNotNull("subQuery", sq);
        val cb: MemberAddressCB = new MemberAddressCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        val pp: String = keepRegionId_SpecifyDerivedReferrer_MemberAddressList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "REGION_ID", "REGION_ID", pp, "memberAddressList", al, op);
    }
    def keepRegionId_SpecifyDerivedReferrer_MemberAddressList(sq: MemberAddressCQ): String;

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br />
     * {FOO &lt;= (select max(BAR) from MEMBER_ADDRESS where ...)} <br />
     * (会員住所情報)MEMBER_ADDRESS by REGION_ID, named 'memberAddressAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">derivedMemberAddressList()</span>.<span style="color: #DD4747">max</span>(new SubQuery&lt;MemberAddressCB&gt;() {
     *     public void query(MemberAddressCB subCB) {
     *         subCB.specify().<span style="color: #DD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #DD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    def derivedMemberAddressList(): ScrHpQDRFunction[MemberAddressCB] = {
        return toScalaQDRFunction(xcreateQDRFunctionMemberAddressList());
    }
    protected def xcreateQDRFunctionMemberAddressList(): HpQDRFunction[MemberAddressCB] = {
        return new HpQDRFunction[MemberAddressCB](new HpQDRSetupper[MemberAddressCB]() {
            def setup(fn: String, sq: SubQuery[MemberAddressCB], rd: String, vl: Object, op: DerivedReferrerOption): Unit = {
                xqderiveMemberAddressList(fn, sq, rd, vl, op);
            }
        });
    }
    def xqderiveMemberAddressList(fn: String, sq: SubQuery[MemberAddressCB], rd: String, vl: Object, op: DerivedReferrerOption): Unit = {
        assertObjectNotNull("subQuery", sq);
        val cb: MemberAddressCB = new MemberAddressCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        val sqpp: String = keepRegionId_QueryDerivedReferrer_MemberAddressList(cb.query());
        val prpp: String = keepRegionId_QueryDerivedReferrer_MemberAddressListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "REGION_ID", "REGION_ID", sqpp, "memberAddressList", rd, vl, prpp, op);
    }
    def keepRegionId_QueryDerivedReferrer_MemberAddressList(sq: MemberAddressCQ): String;
    def keepRegionId_QueryDerivedReferrer_MemberAddressListParameter(vl: Object): String;

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * (地域ID)REGION_ID: {PK, NotNull, INTEGER(10), classification=Region}
     */
    def setRegionId_IsNull(): Unit = { regRegionId(CK_ISN, AbstractConditionQuery.DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * (地域ID)REGION_ID: {PK, NotNull, INTEGER(10), classification=Region}
     */
    def setRegionId_IsNotNull(): Unit = { regRegionId(CK_ISNN, AbstractConditionQuery.DOBJ); }

    protected def regRegionId(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValueRegionId(), "REGION_ID"); }
    protected def getCValueRegionId(): ConditionValue;

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (地域名称)REGION_NAME: {NotNull, VARCHAR(50)}
     * @param regionName The value of regionName as equal. (NullAllowed: if null (or empty), no condition)
     */
    def setRegionName_Equal(regionName: String): Unit = {
        doSetRegionName_Equal(fRES(regionName));
    }

    protected def doSetRegionName_Equal(regionName: String): Unit = {
        regRegionName(CK_EQ, regionName);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (地域名称)REGION_NAME: {NotNull, VARCHAR(50)}
     * @param regionName The value of regionName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    def setRegionName_PrefixSearch(regionName: String): Unit = {
        setRegionName_LikeSearch(regionName)(_.likePrefix);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (地域名称)REGION_NAME: {NotNull, VARCHAR(50)} <br />
     * <pre>e.g. setRegionName_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param regionName The value of regionName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param optionCall The callback for option of like-search. (NotNull)
     */
    def setRegionName_LikeSearch(regionName: String)(optionCall: (ScrLikeSearchOption) => Unit): Unit = {
        regLSQ(CK_LS, fRES(regionName), getCValueRegionName(), "REGION_NAME", callbackLSOP(optionCall));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (地域名称)REGION_NAME: {NotNull, VARCHAR(50)}
     * @param regionName The value of regionName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param optionCall The callback for option of not-like-search. (NotNull)
     */
    def setRegionName_NotLikeSearch(regionName: String)(optionCall: (ScrLikeSearchOption) => Unit): Unit = {
        regLSQ(CK_NLS, fRES(regionName), getCValueRegionName(), "REGION_NAME", callbackLSOP(optionCall));
    }

    protected def regRegionName(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValueRegionName(), "REGION_NAME"); }
    protected def getCValueRegionName(): ConditionValue;

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;RegionCB&gt;() {
     *     public void query(RegionCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_Equal(): ScrHpSSQFunction[RegionCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_EQ, classOf[RegionCB]));
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;RegionCB&gt;() {
     *     public void query(RegionCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_NotEqual(): ScrHpSSQFunction[RegionCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_NES, classOf[RegionCB]));
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;RegionCB&gt;() {
     *     public void query(RegionCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_GreaterThan(): ScrHpSSQFunction[RegionCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_GT, classOf[RegionCB]));
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;RegionCB&gt;() {
     *     public void query(RegionCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_LessThan(): ScrHpSSQFunction[RegionCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_LT, classOf[RegionCB]));
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;RegionCB&gt;() {
     *     public void query(RegionCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_GreaterEqual(): ScrHpSSQFunction[RegionCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_GE, classOf[RegionCB]));
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;RegionCB&gt;() {
     *     public void query(RegionCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_LessEqual(): ScrHpSSQFunction[RegionCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_LE, classOf[RegionCB]));
    }

    protected def toScalaSSQFunction(function: HpSSQFunction[RegionCB]): ScrHpSSQFunction[RegionCB] =
    { new ScrHpSSQFunction(function) }

    override protected def xscalarCondition[CB <: ConditionBean](fn: String, sq: SubQuery[CB], rd: String, op: HpSSQOption[CB]): Unit = {
        assertObjectNotNull("subQuery", sq);
        val cb: RegionCB = xcreateScalarConditionCB(); sq.query(cb.asInstanceOf[CB]);
        val pp: String = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean(xcreateScalarConditionPartitionByCB().asInstanceOf[CB]); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    def keepScalarCondition(sq: RegionCQ): String;

    protected def xcreateScalarConditionCB(): RegionCB = {
        val cb: RegionCB = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected def xcreateScalarConditionPartitionByCB(): RegionCB = {
        val cb: RegionCB = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    def xsmyselfDerive(fn: String, sq: SubQuery[RegionCB], al: String, op: DerivedReferrerOption): Unit = {
        assertObjectNotNull("subQuery", sq);
        val cb: RegionCB = new RegionCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        val pp: String = keepSpecifyMyselfDerived(cb.query());
        val pk: String = "REGION_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    def keepSpecifyMyselfDerived(sq: RegionCQ): String;

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    def myselfDerived(): ScrHpQDRFunction[RegionCB] = {
        return toScalaQDRFunction(xcreateQDRFunctionMyselfDerived(classOf[RegionCB]));
    }
    override protected def xqderiveMyselfDerived[CB <: ConditionBean](fn: String, sq: SubQuery[CB], rd: String, vl: Object, op: DerivedReferrerOption): Unit = {
        assertObjectNotNull("subQuery", sq);
        val cb: RegionCB = new RegionCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb.asInstanceOf[CB]);
        val pk: String = "REGION_ID";
        val sqpp: String = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        val prpp: String = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    def keepQueryMyselfDerived(sq: RegionCQ): String;
    def keepQueryMyselfDerivedParameter(vl: Object): String;

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    def myselfExists(subQuery: (RegionCB) => Unit): Unit = {
        assertObjectNotNull("subQuery", subQuery);
        val cb: RegionCB = new RegionCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery(cb); } finally { unlock(); }
        val pp: String = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    def keepMyselfExists(sq: RegionCQ): String;

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    def myselfInScope(subQuery: (RegionCB) => Unit): Unit = {
        assertObjectNotNull("subQuery", subQuery);
        val cb: RegionCB = new RegionCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery(cb); } finally { unlock(); }
        val pp: String = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    def keepMyselfInScope(sq: RegionCQ): String;

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
    protected def newMyCB(): RegionCB = {
        return new RegionCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected def xabUDT(): String = { return classOf[Date].getName(); }
    protected def xabCQ(): String = { return classOf[RegionCQ].getName(); }
    protected def xabLSO(): String = { return classOf[LikeSearchOption].getName(); }
    protected def xabSSQS(): String = { return classOf[HpSSQSetupper[_]].getName(); }
}
