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
 * The abstract condition-query of VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN.
 * @author DBFlute(AutoGenerator)
 */
abstract class AbstractBsVendorTheLongAndWindingTableAndColumnCQ(referrerQuery: ConditionQuery, sqlClause: SqlClause, aliasName: String, nestLevel: Integer)
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
        return "VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID: {PK, NotNull, BIGINT(19)}
     * @param theLongAndWindingTableAndColumnId The value of theLongAndWindingTableAndColumnId as equal. (NullAllowed: if null, no condition)
     */
    def setTheLongAndWindingTableAndColumnId_Equal(theLongAndWindingTableAndColumnId: Long): Unit = {
        doSetTheLongAndWindingTableAndColumnId_Equal(theLongAndWindingTableAndColumnId);
    }

    protected def doSetTheLongAndWindingTableAndColumnId_Equal(theLongAndWindingTableAndColumnId: Long): Unit = {
        regTheLongAndWindingTableAndColumnId(CK_EQ, theLongAndWindingTableAndColumnId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID: {PK, NotNull, BIGINT(19)}
     * @param theLongAndWindingTableAndColumnId The value of theLongAndWindingTableAndColumnId as notEqual. (NullAllowed: if null, no condition)
     */
    def setTheLongAndWindingTableAndColumnId_NotEqual(theLongAndWindingTableAndColumnId: Long): Unit = {
        doSetTheLongAndWindingTableAndColumnId_NotEqual(theLongAndWindingTableAndColumnId);
    }

    protected def doSetTheLongAndWindingTableAndColumnId_NotEqual(theLongAndWindingTableAndColumnId: Long): Unit = {
        regTheLongAndWindingTableAndColumnId(CK_NES, theLongAndWindingTableAndColumnId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID: {PK, NotNull, BIGINT(19)}
     * @param theLongAndWindingTableAndColumnId The value of theLongAndWindingTableAndColumnId as greaterThan. (NullAllowed: if null, no condition)
     */
    def setTheLongAndWindingTableAndColumnId_GreaterThan(theLongAndWindingTableAndColumnId: Long): Unit = {
        regTheLongAndWindingTableAndColumnId(CK_GT, theLongAndWindingTableAndColumnId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID: {PK, NotNull, BIGINT(19)}
     * @param theLongAndWindingTableAndColumnId The value of theLongAndWindingTableAndColumnId as lessThan. (NullAllowed: if null, no condition)
     */
    def setTheLongAndWindingTableAndColumnId_LessThan(theLongAndWindingTableAndColumnId: Long): Unit = {
        regTheLongAndWindingTableAndColumnId(CK_LT, theLongAndWindingTableAndColumnId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID: {PK, NotNull, BIGINT(19)}
     * @param theLongAndWindingTableAndColumnId The value of theLongAndWindingTableAndColumnId as greaterEqual. (NullAllowed: if null, no condition)
     */
    def setTheLongAndWindingTableAndColumnId_GreaterEqual(theLongAndWindingTableAndColumnId: Long): Unit = {
        regTheLongAndWindingTableAndColumnId(CK_GE, theLongAndWindingTableAndColumnId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID: {PK, NotNull, BIGINT(19)}
     * @param theLongAndWindingTableAndColumnId The value of theLongAndWindingTableAndColumnId as lessEqual. (NullAllowed: if null, no condition)
     */
    def setTheLongAndWindingTableAndColumnId_LessEqual(theLongAndWindingTableAndColumnId: Long): Unit = {
        regTheLongAndWindingTableAndColumnId(CK_LE, theLongAndWindingTableAndColumnId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID: {PK, NotNull, BIGINT(19)}
     * @param minNumber The min number of theLongAndWindingTableAndColumnId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of theLongAndWindingTableAndColumnId. (NullAllowed: if null, no to-condition)
     * @param optionCall The callback for option of range-of. (NotNull)
     */
    def setTheLongAndWindingTableAndColumnId_RangeOf(minNumber: Long, maxNumber: Long)(optionCall: (RangeOfOption) => Unit): Unit = {
        regROO(minNumber, maxNumber, getCValueTheLongAndWindingTableAndColumnId(), "THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID", callbackROOP(optionCall));
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID: {PK, NotNull, BIGINT(19)}
     * @param theLongAndWindingTableAndColumnIdList The collection of theLongAndWindingTableAndColumnId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    def setTheLongAndWindingTableAndColumnId_InScope(theLongAndWindingTableAndColumnIdList: List[Long]): Unit = {
        doSetTheLongAndWindingTableAndColumnId_InScope(toMutableValueCollectionImplicitly(theLongAndWindingTableAndColumnIdList));
    }

    protected def doSetTheLongAndWindingTableAndColumnId_InScope(theLongAndWindingTableAndColumnIdList: Collection[Long]): Unit = {
        regINS(CK_INS, cTL(theLongAndWindingTableAndColumnIdList), getCValueTheLongAndWindingTableAndColumnId(), "THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID: {PK, NotNull, BIGINT(19)}
     * @param theLongAndWindingTableAndColumnIdList The collection of theLongAndWindingTableAndColumnId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    def setTheLongAndWindingTableAndColumnId_NotInScope(theLongAndWindingTableAndColumnIdList: List[Long]): Unit = {
        doSetTheLongAndWindingTableAndColumnId_NotInScope(if (theLongAndWindingTableAndColumnIdList != null) { theLongAndWindingTableAndColumnIdList.map(_.asInstanceOf[Long]).asJava } else { null });
    }

    protected def doSetTheLongAndWindingTableAndColumnId_NotInScope(theLongAndWindingTableAndColumnIdList: Collection[Long]): Unit = {
        regINS(CK_NINS, cTL(theLongAndWindingTableAndColumnIdList), getCValueTheLongAndWindingTableAndColumnId(), "THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br />
     * {exists (select THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID from VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF where ...)} <br />
     * VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF by THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID, named 'vendorTheLongAndWindingTableAndColumnRefAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">existsVendorTheLongAndWindingTableAndColumnRefList</span>(new SubQuery&lt;VendorTheLongAndWindingTableAndColumnRefCB&gt;() {
     *     public void query(VendorTheLongAndWindingTableAndColumnRefCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of VendorTheLongAndWindingTableAndColumnRefList for 'exists'. (NotNull)
     */
    def existsVendorTheLongAndWindingTableAndColumnRefList(subQuery: (VendorTheLongAndWindingTableAndColumnRefCB) => Unit): Unit = {
        assertObjectNotNull("subQuery", subQuery);
        val cb: VendorTheLongAndWindingTableAndColumnRefCB = new VendorTheLongAndWindingTableAndColumnRefCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery(cb); } finally { unlock(); }
        val pp: String = keepTheLongAndWindingTableAndColumnId_ExistsReferrer_VendorTheLongAndWindingTableAndColumnRefList(cb.query());
        registerExistsReferrer(cb.query(), "THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID", "THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID", pp, "vendorTheLongAndWindingTableAndColumnRefList");
    }
    def keepTheLongAndWindingTableAndColumnId_ExistsReferrer_VendorTheLongAndWindingTableAndColumnRefList(sq: VendorTheLongAndWindingTableAndColumnRefCQ): String;

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br />
     * {not exists (select THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID from VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF where ...)} <br />
     * VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF by THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID, named 'vendorTheLongAndWindingTableAndColumnRefAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">notExistsVendorTheLongAndWindingTableAndColumnRefList</span>(new SubQuery&lt;VendorTheLongAndWindingTableAndColumnRefCB&gt;() {
     *     public void query(VendorTheLongAndWindingTableAndColumnRefCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of TheLongAndWindingTableAndColumnId_NotExistsReferrer_VendorTheLongAndWindingTableAndColumnRefList for 'not exists'. (NotNull)
     */
    def notExistsVendorTheLongAndWindingTableAndColumnRefList(subQuery: (VendorTheLongAndWindingTableAndColumnRefCB) => Unit): Unit = {
        assertObjectNotNull("subQuery", subQuery);
        val cb: VendorTheLongAndWindingTableAndColumnRefCB = new VendorTheLongAndWindingTableAndColumnRefCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery(cb); } finally { unlock(); }
        val pp: String = keepTheLongAndWindingTableAndColumnId_NotExistsReferrer_VendorTheLongAndWindingTableAndColumnRefList(cb.query());
        registerNotExistsReferrer(cb.query(), "THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID", "THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID", pp, "vendorTheLongAndWindingTableAndColumnRefList");
    }
    def keepTheLongAndWindingTableAndColumnId_NotExistsReferrer_VendorTheLongAndWindingTableAndColumnRefList(sq: VendorTheLongAndWindingTableAndColumnRefCQ): String;

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID from VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF where ...)} <br />
     * VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF by THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID, named 'vendorTheLongAndWindingTableAndColumnRefAsOne'.
     * @param subQuery The sub-query of VendorTheLongAndWindingTableAndColumnRefList for 'in-scope'. (NotNull)
     */
    def inScopeVendorTheLongAndWindingTableAndColumnRefList(subQuery: (VendorTheLongAndWindingTableAndColumnRefCB) => Unit): Unit = {
        assertObjectNotNull("subQuery", subQuery);
        val cb: VendorTheLongAndWindingTableAndColumnRefCB = new VendorTheLongAndWindingTableAndColumnRefCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery(cb); } finally { unlock(); }
        val pp: String = keepTheLongAndWindingTableAndColumnId_InScopeRelation_VendorTheLongAndWindingTableAndColumnRefList(cb.query());
        registerInScopeRelation(cb.query(), "THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID", "THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID", pp, "vendorTheLongAndWindingTableAndColumnRefList");
    }
    def keepTheLongAndWindingTableAndColumnId_InScopeRelation_VendorTheLongAndWindingTableAndColumnRefList(sq: VendorTheLongAndWindingTableAndColumnRefCQ): String;

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID from VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF where ...)} <br />
     * VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF by THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID, named 'vendorTheLongAndWindingTableAndColumnRefAsOne'.
     * @param subQuery The sub-query of VendorTheLongAndWindingTableAndColumnRefList for 'not in-scope'. (NotNull)
     */
    def notInScopeVendorTheLongAndWindingTableAndColumnRefList(subQuery: (VendorTheLongAndWindingTableAndColumnRefCB) => Unit): Unit = {
        assertObjectNotNull("subQuery", subQuery);
        val cb: VendorTheLongAndWindingTableAndColumnRefCB = new VendorTheLongAndWindingTableAndColumnRefCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery(cb); } finally { unlock(); }
        val pp: String = keepTheLongAndWindingTableAndColumnId_NotInScopeRelation_VendorTheLongAndWindingTableAndColumnRefList(cb.query());
        registerNotInScopeRelation(cb.query(), "THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID", "THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID", pp, "vendorTheLongAndWindingTableAndColumnRefList");
    }
    def keepTheLongAndWindingTableAndColumnId_NotInScopeRelation_VendorTheLongAndWindingTableAndColumnRefList(sq: VendorTheLongAndWindingTableAndColumnRefCQ): String;

    def xsderiveVendorTheLongAndWindingTableAndColumnRefList(fn: String, sq: SubQuery[VendorTheLongAndWindingTableAndColumnRefCB], al: String, op: DerivedReferrerOption): Unit = {
        assertObjectNotNull("subQuery", sq);
        val cb: VendorTheLongAndWindingTableAndColumnRefCB = new VendorTheLongAndWindingTableAndColumnRefCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        val pp: String = keepTheLongAndWindingTableAndColumnId_SpecifyDerivedReferrer_VendorTheLongAndWindingTableAndColumnRefList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID", "THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID", pp, "vendorTheLongAndWindingTableAndColumnRefList", al, op);
    }
    def keepTheLongAndWindingTableAndColumnId_SpecifyDerivedReferrer_VendorTheLongAndWindingTableAndColumnRefList(sq: VendorTheLongAndWindingTableAndColumnRefCQ): String;

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br />
     * {FOO &lt;= (select max(BAR) from VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF where ...)} <br />
     * VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF by THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID, named 'vendorTheLongAndWindingTableAndColumnRefAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">derivedVendorTheLongAndWindingTableAndColumnRefList()</span>.<span style="color: #DD4747">max</span>(new SubQuery&lt;VendorTheLongAndWindingTableAndColumnRefCB&gt;() {
     *     public void query(VendorTheLongAndWindingTableAndColumnRefCB subCB) {
     *         subCB.specify().<span style="color: #DD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #DD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    def derivedVendorTheLongAndWindingTableAndColumnRefList(): ScrHpQDRFunction[VendorTheLongAndWindingTableAndColumnRefCB] = {
        return toScalaQDRFunction(xcreateQDRFunctionVendorTheLongAndWindingTableAndColumnRefList());
    }
    protected def xcreateQDRFunctionVendorTheLongAndWindingTableAndColumnRefList(): HpQDRFunction[VendorTheLongAndWindingTableAndColumnRefCB] = {
        return new HpQDRFunction[VendorTheLongAndWindingTableAndColumnRefCB](new HpQDRSetupper[VendorTheLongAndWindingTableAndColumnRefCB]() {
            def setup(fn: String, sq: SubQuery[VendorTheLongAndWindingTableAndColumnRefCB], rd: String, vl: Object, op: DerivedReferrerOption): Unit = {
                xqderiveVendorTheLongAndWindingTableAndColumnRefList(fn, sq, rd, vl, op);
            }
        });
    }
    def xqderiveVendorTheLongAndWindingTableAndColumnRefList(fn: String, sq: SubQuery[VendorTheLongAndWindingTableAndColumnRefCB], rd: String, vl: Object, op: DerivedReferrerOption): Unit = {
        assertObjectNotNull("subQuery", sq);
        val cb: VendorTheLongAndWindingTableAndColumnRefCB = new VendorTheLongAndWindingTableAndColumnRefCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        val sqpp: String = keepTheLongAndWindingTableAndColumnId_QueryDerivedReferrer_VendorTheLongAndWindingTableAndColumnRefList(cb.query());
        val prpp: String = keepTheLongAndWindingTableAndColumnId_QueryDerivedReferrer_VendorTheLongAndWindingTableAndColumnRefListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID", "THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID", sqpp, "vendorTheLongAndWindingTableAndColumnRefList", rd, vl, prpp, op);
    }
    def keepTheLongAndWindingTableAndColumnId_QueryDerivedReferrer_VendorTheLongAndWindingTableAndColumnRefList(sq: VendorTheLongAndWindingTableAndColumnRefCQ): String;
    def keepTheLongAndWindingTableAndColumnId_QueryDerivedReferrer_VendorTheLongAndWindingTableAndColumnRefListParameter(vl: Object): String;

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID: {PK, NotNull, BIGINT(19)}
     */
    def setTheLongAndWindingTableAndColumnId_IsNull(): Unit = { regTheLongAndWindingTableAndColumnId(CK_ISN, AbstractConditionQuery.DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID: {PK, NotNull, BIGINT(19)}
     */
    def setTheLongAndWindingTableAndColumnId_IsNotNull(): Unit = { regTheLongAndWindingTableAndColumnId(CK_ISNN, AbstractConditionQuery.DOBJ); }

    protected def regTheLongAndWindingTableAndColumnId(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValueTheLongAndWindingTableAndColumnId(), "THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID"); }
    protected def getCValueTheLongAndWindingTableAndColumnId(): ConditionValue;

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_NAME: {UQ, NotNull, VARCHAR(200)}
     * @param theLongAndWindingTableAndColumnName The value of theLongAndWindingTableAndColumnName as equal. (NullAllowed: if null (or empty), no condition)
     */
    def setTheLongAndWindingTableAndColumnName_Equal(theLongAndWindingTableAndColumnName: String): Unit = {
        doSetTheLongAndWindingTableAndColumnName_Equal(fRES(theLongAndWindingTableAndColumnName));
    }

    protected def doSetTheLongAndWindingTableAndColumnName_Equal(theLongAndWindingTableAndColumnName: String): Unit = {
        regTheLongAndWindingTableAndColumnName(CK_EQ, theLongAndWindingTableAndColumnName);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_NAME: {UQ, NotNull, VARCHAR(200)}
     * @param theLongAndWindingTableAndColumnName The value of theLongAndWindingTableAndColumnName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    def setTheLongAndWindingTableAndColumnName_PrefixSearch(theLongAndWindingTableAndColumnName: String): Unit = {
        setTheLongAndWindingTableAndColumnName_LikeSearch(theLongAndWindingTableAndColumnName)(_.likePrefix);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_NAME: {UQ, NotNull, VARCHAR(200)} <br />
     * <pre>e.g. setTheLongAndWindingTableAndColumnName_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param theLongAndWindingTableAndColumnName The value of theLongAndWindingTableAndColumnName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param optionCall The callback for option of like-search. (NotNull)
     */
    def setTheLongAndWindingTableAndColumnName_LikeSearch(theLongAndWindingTableAndColumnName: String)(optionCall: (ScrLikeSearchOption) => Unit): Unit = {
        regLSQ(CK_LS, fRES(theLongAndWindingTableAndColumnName), getCValueTheLongAndWindingTableAndColumnName(), "THE_LONG_AND_WINDING_TABLE_AND_COLUMN_NAME", callbackLSOP(optionCall));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_NAME: {UQ, NotNull, VARCHAR(200)}
     * @param theLongAndWindingTableAndColumnName The value of theLongAndWindingTableAndColumnName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param optionCall The callback for option of not-like-search. (NotNull)
     */
    def setTheLongAndWindingTableAndColumnName_NotLikeSearch(theLongAndWindingTableAndColumnName: String)(optionCall: (ScrLikeSearchOption) => Unit): Unit = {
        regLSQ(CK_NLS, fRES(theLongAndWindingTableAndColumnName), getCValueTheLongAndWindingTableAndColumnName(), "THE_LONG_AND_WINDING_TABLE_AND_COLUMN_NAME", callbackLSOP(optionCall));
    }

    protected def regTheLongAndWindingTableAndColumnName(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValueTheLongAndWindingTableAndColumnName(), "THE_LONG_AND_WINDING_TABLE_AND_COLUMN_NAME"); }
    protected def getCValueTheLongAndWindingTableAndColumnName(): ConditionValue;

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * SHORT_NAME: {NotNull, VARCHAR(200)}
     * @param shortName The value of shortName as equal. (NullAllowed: if null (or empty), no condition)
     */
    def setShortName_Equal(shortName: String): Unit = {
        doSetShortName_Equal(fRES(shortName));
    }

    protected def doSetShortName_Equal(shortName: String): Unit = {
        regShortName(CK_EQ, shortName);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * SHORT_NAME: {NotNull, VARCHAR(200)}
     * @param shortName The value of shortName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    def setShortName_PrefixSearch(shortName: String): Unit = {
        setShortName_LikeSearch(shortName)(_.likePrefix);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * SHORT_NAME: {NotNull, VARCHAR(200)} <br />
     * <pre>e.g. setShortName_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shortName The value of shortName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param optionCall The callback for option of like-search. (NotNull)
     */
    def setShortName_LikeSearch(shortName: String)(optionCall: (ScrLikeSearchOption) => Unit): Unit = {
        regLSQ(CK_LS, fRES(shortName), getCValueShortName(), "SHORT_NAME", callbackLSOP(optionCall));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * SHORT_NAME: {NotNull, VARCHAR(200)}
     * @param shortName The value of shortName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param optionCall The callback for option of not-like-search. (NotNull)
     */
    def setShortName_NotLikeSearch(shortName: String)(optionCall: (ScrLikeSearchOption) => Unit): Unit = {
        regLSQ(CK_NLS, fRES(shortName), getCValueShortName(), "SHORT_NAME", callbackLSOP(optionCall));
    }

    protected def regShortName(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValueShortName(), "SHORT_NAME"); }
    protected def getCValueShortName(): ConditionValue;

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * SHORT_SIZE: {NotNull, INTEGER(10)}
     * @param shortSize The value of shortSize as equal. (NullAllowed: if null, no condition)
     */
    def setShortSize_Equal(shortSize: Int): Unit = {
        doSetShortSize_Equal(shortSize);
    }

    protected def doSetShortSize_Equal(shortSize: Integer): Unit = {
        regShortSize(CK_EQ, shortSize);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * SHORT_SIZE: {NotNull, INTEGER(10)}
     * @param shortSize The value of shortSize as notEqual. (NullAllowed: if null, no condition)
     */
    def setShortSize_NotEqual(shortSize: Int): Unit = {
        doSetShortSize_NotEqual(shortSize);
    }

    protected def doSetShortSize_NotEqual(shortSize: Integer): Unit = {
        regShortSize(CK_NES, shortSize);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * SHORT_SIZE: {NotNull, INTEGER(10)}
     * @param shortSize The value of shortSize as greaterThan. (NullAllowed: if null, no condition)
     */
    def setShortSize_GreaterThan(shortSize: Int): Unit = {
        regShortSize(CK_GT, shortSize);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * SHORT_SIZE: {NotNull, INTEGER(10)}
     * @param shortSize The value of shortSize as lessThan. (NullAllowed: if null, no condition)
     */
    def setShortSize_LessThan(shortSize: Int): Unit = {
        regShortSize(CK_LT, shortSize);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * SHORT_SIZE: {NotNull, INTEGER(10)}
     * @param shortSize The value of shortSize as greaterEqual. (NullAllowed: if null, no condition)
     */
    def setShortSize_GreaterEqual(shortSize: Int): Unit = {
        regShortSize(CK_GE, shortSize);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * SHORT_SIZE: {NotNull, INTEGER(10)}
     * @param shortSize The value of shortSize as lessEqual. (NullAllowed: if null, no condition)
     */
    def setShortSize_LessEqual(shortSize: Int): Unit = {
        regShortSize(CK_LE, shortSize);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * SHORT_SIZE: {NotNull, INTEGER(10)}
     * @param minNumber The min number of shortSize. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of shortSize. (NullAllowed: if null, no to-condition)
     * @param optionCall The callback for option of range-of. (NotNull)
     */
    def setShortSize_RangeOf(minNumber: Int, maxNumber: Int)(optionCall: (RangeOfOption) => Unit): Unit = {
        regROO(minNumber, maxNumber, getCValueShortSize(), "SHORT_SIZE", callbackROOP(optionCall));
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * SHORT_SIZE: {NotNull, INTEGER(10)}
     * @param shortSizeList The collection of shortSize as inScope. (NullAllowed: if null (or empty), no condition)
     */
    def setShortSize_InScope(shortSizeList: List[Int]): Unit = {
        doSetShortSize_InScope(toMutableValueCollectionImplicitly(shortSizeList));
    }

    protected def doSetShortSize_InScope(shortSizeList: Collection[Integer]): Unit = {
        regINS(CK_INS, cTL(shortSizeList), getCValueShortSize(), "SHORT_SIZE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * SHORT_SIZE: {NotNull, INTEGER(10)}
     * @param shortSizeList The collection of shortSize as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    def setShortSize_NotInScope(shortSizeList: List[Int]): Unit = {
        doSetShortSize_NotInScope(if (shortSizeList != null) { shortSizeList.map(_.asInstanceOf[Integer]).asJava } else { null });
    }

    protected def doSetShortSize_NotInScope(shortSizeList: Collection[Integer]): Unit = {
        regINS(CK_NINS, cTL(shortSizeList), getCValueShortSize(), "SHORT_SIZE");
    }

    protected def regShortSize(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValueShortSize(), "SHORT_SIZE"); }
    protected def getCValueShortSize(): ConditionValue;

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;VendorTheLongAndWindingTableAndColumnCB&gt;() {
     *     public void query(VendorTheLongAndWindingTableAndColumnCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_Equal(): ScrHpSSQFunction[VendorTheLongAndWindingTableAndColumnCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_EQ, classOf[VendorTheLongAndWindingTableAndColumnCB]));
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;VendorTheLongAndWindingTableAndColumnCB&gt;() {
     *     public void query(VendorTheLongAndWindingTableAndColumnCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_NotEqual(): ScrHpSSQFunction[VendorTheLongAndWindingTableAndColumnCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_NES, classOf[VendorTheLongAndWindingTableAndColumnCB]));
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;VendorTheLongAndWindingTableAndColumnCB&gt;() {
     *     public void query(VendorTheLongAndWindingTableAndColumnCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_GreaterThan(): ScrHpSSQFunction[VendorTheLongAndWindingTableAndColumnCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_GT, classOf[VendorTheLongAndWindingTableAndColumnCB]));
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;VendorTheLongAndWindingTableAndColumnCB&gt;() {
     *     public void query(VendorTheLongAndWindingTableAndColumnCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_LessThan(): ScrHpSSQFunction[VendorTheLongAndWindingTableAndColumnCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_LT, classOf[VendorTheLongAndWindingTableAndColumnCB]));
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;VendorTheLongAndWindingTableAndColumnCB&gt;() {
     *     public void query(VendorTheLongAndWindingTableAndColumnCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_GreaterEqual(): ScrHpSSQFunction[VendorTheLongAndWindingTableAndColumnCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_GE, classOf[VendorTheLongAndWindingTableAndColumnCB]));
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;VendorTheLongAndWindingTableAndColumnCB&gt;() {
     *     public void query(VendorTheLongAndWindingTableAndColumnCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_LessEqual(): ScrHpSSQFunction[VendorTheLongAndWindingTableAndColumnCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_LE, classOf[VendorTheLongAndWindingTableAndColumnCB]));
    }

    protected def toScalaSSQFunction(function: HpSSQFunction[VendorTheLongAndWindingTableAndColumnCB]): ScrHpSSQFunction[VendorTheLongAndWindingTableAndColumnCB] =
    { new ScrHpSSQFunction(function) }

    override protected def xscalarCondition[CB <: ConditionBean](fn: String, sq: SubQuery[CB], rd: String, op: HpSSQOption[CB]): Unit = {
        assertObjectNotNull("subQuery", sq);
        val cb: VendorTheLongAndWindingTableAndColumnCB = xcreateScalarConditionCB(); sq.query(cb.asInstanceOf[CB]);
        val pp: String = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean(xcreateScalarConditionPartitionByCB().asInstanceOf[CB]); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    def keepScalarCondition(sq: VendorTheLongAndWindingTableAndColumnCQ): String;

    protected def xcreateScalarConditionCB(): VendorTheLongAndWindingTableAndColumnCB = {
        val cb: VendorTheLongAndWindingTableAndColumnCB = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected def xcreateScalarConditionPartitionByCB(): VendorTheLongAndWindingTableAndColumnCB = {
        val cb: VendorTheLongAndWindingTableAndColumnCB = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    def xsmyselfDerive(fn: String, sq: SubQuery[VendorTheLongAndWindingTableAndColumnCB], al: String, op: DerivedReferrerOption): Unit = {
        assertObjectNotNull("subQuery", sq);
        val cb: VendorTheLongAndWindingTableAndColumnCB = new VendorTheLongAndWindingTableAndColumnCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        val pp: String = keepSpecifyMyselfDerived(cb.query());
        val pk: String = "THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    def keepSpecifyMyselfDerived(sq: VendorTheLongAndWindingTableAndColumnCQ): String;

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    def myselfDerived(): ScrHpQDRFunction[VendorTheLongAndWindingTableAndColumnCB] = {
        return toScalaQDRFunction(xcreateQDRFunctionMyselfDerived(classOf[VendorTheLongAndWindingTableAndColumnCB]));
    }
    override protected def xqderiveMyselfDerived[CB <: ConditionBean](fn: String, sq: SubQuery[CB], rd: String, vl: Object, op: DerivedReferrerOption): Unit = {
        assertObjectNotNull("subQuery", sq);
        val cb: VendorTheLongAndWindingTableAndColumnCB = new VendorTheLongAndWindingTableAndColumnCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb.asInstanceOf[CB]);
        val pk: String = "THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID";
        val sqpp: String = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        val prpp: String = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    def keepQueryMyselfDerived(sq: VendorTheLongAndWindingTableAndColumnCQ): String;
    def keepQueryMyselfDerivedParameter(vl: Object): String;

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    def myselfExists(subQuery: (VendorTheLongAndWindingTableAndColumnCB) => Unit): Unit = {
        assertObjectNotNull("subQuery", subQuery);
        val cb: VendorTheLongAndWindingTableAndColumnCB = new VendorTheLongAndWindingTableAndColumnCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery(cb); } finally { unlock(); }
        val pp: String = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    def keepMyselfExists(sq: VendorTheLongAndWindingTableAndColumnCQ): String;

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    def myselfInScope(subQuery: (VendorTheLongAndWindingTableAndColumnCB) => Unit): Unit = {
        assertObjectNotNull("subQuery", subQuery);
        val cb: VendorTheLongAndWindingTableAndColumnCB = new VendorTheLongAndWindingTableAndColumnCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery(cb); } finally { unlock(); }
        val pp: String = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    def keepMyselfInScope(sq: VendorTheLongAndWindingTableAndColumnCQ): String;

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
    protected def newMyCB(): VendorTheLongAndWindingTableAndColumnCB = {
        return new VendorTheLongAndWindingTableAndColumnCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected def xabUDT(): String = { return classOf[Date].getName(); }
    protected def xabCQ(): String = { return classOf[VendorTheLongAndWindingTableAndColumnCQ].getName(); }
    protected def xabLSO(): String = { return classOf[LikeSearchOption].getName(); }
    protected def xabSSQS(): String = { return classOf[HpSSQSetupper[_]].getName(); }
}
