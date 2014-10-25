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
 * The abstract condition-query of PRODUCT_CATEGORY.
 * @author DBFlute(AutoGenerator)
 */
abstract class AbstractBsProductCategoryCQ(referrerQuery: ConditionQuery, sqlClause: SqlClause, aliasName: String, nestLevel: Integer)
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
        return "PRODUCT_CATEGORY";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (商品カテゴリコード)PRODUCT_CATEGORY_CODE: {PK, NotNull, CHAR(3)}
     * @param productCategoryCode The value of productCategoryCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    def setProductCategoryCode_Equal(productCategoryCode: String): Unit = {
        doSetProductCategoryCode_Equal(fRES(productCategoryCode));
    }

    protected def doSetProductCategoryCode_Equal(productCategoryCode: String): Unit = {
        regProductCategoryCode(CK_EQ, hSC("PRODUCT_CATEGORY_CODE", productCategoryCode, 3, "E"));
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (商品カテゴリコード)PRODUCT_CATEGORY_CODE: {PK, NotNull, CHAR(3)}
     * @param productCategoryCode The value of productCategoryCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    def setProductCategoryCode_NotEqual(productCategoryCode: String): Unit = {
        doSetProductCategoryCode_NotEqual(fRES(productCategoryCode));
    }

    protected def doSetProductCategoryCode_NotEqual(productCategoryCode: String): Unit = {
        regProductCategoryCode(CK_NES, hSC("PRODUCT_CATEGORY_CODE", productCategoryCode, 3, "E"));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (商品カテゴリコード)PRODUCT_CATEGORY_CODE: {PK, NotNull, CHAR(3)}
     * @param productCategoryCodeList The collection of productCategoryCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    def setProductCategoryCode_InScope(productCategoryCodeList: List[String]): Unit = {
        doSetProductCategoryCode_InScope(toMutableValueCollectionImplicitly(productCategoryCodeList));
    }

    protected def doSetProductCategoryCode_InScope(productCategoryCodeList: Collection[String]): Unit = {
        regINS(CK_INS, cTL(productCategoryCodeList), getCValueProductCategoryCode(), "PRODUCT_CATEGORY_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (商品カテゴリコード)PRODUCT_CATEGORY_CODE: {PK, NotNull, CHAR(3)}
     * @param productCategoryCodeList The collection of productCategoryCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    def setProductCategoryCode_NotInScope(productCategoryCodeList: List[String]): Unit = {
        doSetProductCategoryCode_NotInScope(if (productCategoryCodeList != null) { productCategoryCodeList.map(_.asInstanceOf[String]).asJava } else { null });
    }

    protected def doSetProductCategoryCode_NotInScope(productCategoryCodeList: Collection[String]): Unit = {
        regINS(CK_NINS, cTL(productCategoryCodeList), getCValueProductCategoryCode(), "PRODUCT_CATEGORY_CODE");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (商品カテゴリコード)PRODUCT_CATEGORY_CODE: {PK, NotNull, CHAR(3)}
     * @param productCategoryCode The value of productCategoryCode as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    def setProductCategoryCode_PrefixSearch(productCategoryCode: String): Unit = {
        setProductCategoryCode_LikeSearch(productCategoryCode)(_.likePrefix);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (商品カテゴリコード)PRODUCT_CATEGORY_CODE: {PK, NotNull, CHAR(3)} <br />
     * <pre>e.g. setProductCategoryCode_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param productCategoryCode The value of productCategoryCode as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param optionCall The callback for option of like-search. (NotNull)
     */
    def setProductCategoryCode_LikeSearch(productCategoryCode: String)(optionCall: (ScrLikeSearchOption) => Unit): Unit = {
        regLSQ(CK_LS, fRES(productCategoryCode), getCValueProductCategoryCode(), "PRODUCT_CATEGORY_CODE", callbackLSOP(optionCall));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (商品カテゴリコード)PRODUCT_CATEGORY_CODE: {PK, NotNull, CHAR(3)}
     * @param productCategoryCode The value of productCategoryCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param optionCall The callback for option of not-like-search. (NotNull)
     */
    def setProductCategoryCode_NotLikeSearch(productCategoryCode: String)(optionCall: (ScrLikeSearchOption) => Unit): Unit = {
        regLSQ(CK_NLS, fRES(productCategoryCode), getCValueProductCategoryCode(), "PRODUCT_CATEGORY_CODE", callbackLSOP(optionCall));
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br />
     * {exists (select PRODUCT_CATEGORY_CODE from PRODUCT where ...)} <br />
     * (商品)PRODUCT by PRODUCT_CATEGORY_CODE, named 'productAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">existsProductList</span>(new SubQuery&lt;ProductCB&gt;() {
     *     public void query(ProductCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of ProductList for 'exists'. (NotNull)
     */
    def existsProductList(subQuery: (ProductCB) => Unit): Unit = {
        assertObjectNotNull("subQuery", subQuery);
        val cb: ProductCB = new ProductCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery(cb); } finally { unlock(); }
        val pp: String = keepProductCategoryCode_ExistsReferrer_ProductList(cb.query());
        registerExistsReferrer(cb.query(), "PRODUCT_CATEGORY_CODE", "PRODUCT_CATEGORY_CODE", pp, "productList");
    }
    def keepProductCategoryCode_ExistsReferrer_ProductList(sq: ProductCQ): String;

    /**
     * Set up ExistsReferrer (correlated sub-query). <br />
     * {exists (select PARENT_CATEGORY_CODE from PRODUCT_CATEGORY where ...)} <br />
     * (商品カテゴリ)PRODUCT_CATEGORY by PARENT_CATEGORY_CODE, named 'productCategorySelfAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">existsProductCategorySelfList</span>(new SubQuery&lt;ProductCategoryCB&gt;() {
     *     public void query(ProductCategoryCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of ProductCategorySelfList for 'exists'. (NotNull)
     */
    def existsProductCategorySelfList(subQuery: (ProductCategoryCB) => Unit): Unit = {
        assertObjectNotNull("subQuery", subQuery);
        val cb: ProductCategoryCB = new ProductCategoryCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery(cb); } finally { unlock(); }
        val pp: String = keepProductCategoryCode_ExistsReferrer_ProductCategorySelfList(cb.query());
        registerExistsReferrer(cb.query(), "PRODUCT_CATEGORY_CODE", "PARENT_CATEGORY_CODE", pp, "productCategorySelfList");
    }
    def keepProductCategoryCode_ExistsReferrer_ProductCategorySelfList(sq: ProductCategoryCQ): String;

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br />
     * {not exists (select PRODUCT_CATEGORY_CODE from PRODUCT where ...)} <br />
     * (商品)PRODUCT by PRODUCT_CATEGORY_CODE, named 'productAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">notExistsProductList</span>(new SubQuery&lt;ProductCB&gt;() {
     *     public void query(ProductCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of ProductCategoryCode_NotExistsReferrer_ProductList for 'not exists'. (NotNull)
     */
    def notExistsProductList(subQuery: (ProductCB) => Unit): Unit = {
        assertObjectNotNull("subQuery", subQuery);
        val cb: ProductCB = new ProductCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery(cb); } finally { unlock(); }
        val pp: String = keepProductCategoryCode_NotExistsReferrer_ProductList(cb.query());
        registerNotExistsReferrer(cb.query(), "PRODUCT_CATEGORY_CODE", "PRODUCT_CATEGORY_CODE", pp, "productList");
    }
    def keepProductCategoryCode_NotExistsReferrer_ProductList(sq: ProductCQ): String;

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br />
     * {not exists (select PARENT_CATEGORY_CODE from PRODUCT_CATEGORY where ...)} <br />
     * (商品カテゴリ)PRODUCT_CATEGORY by PARENT_CATEGORY_CODE, named 'productCategorySelfAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">notExistsProductCategorySelfList</span>(new SubQuery&lt;ProductCategoryCB&gt;() {
     *     public void query(ProductCategoryCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of ProductCategoryCode_NotExistsReferrer_ProductCategorySelfList for 'not exists'. (NotNull)
     */
    def notExistsProductCategorySelfList(subQuery: (ProductCategoryCB) => Unit): Unit = {
        assertObjectNotNull("subQuery", subQuery);
        val cb: ProductCategoryCB = new ProductCategoryCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery(cb); } finally { unlock(); }
        val pp: String = keepProductCategoryCode_NotExistsReferrer_ProductCategorySelfList(cb.query());
        registerNotExistsReferrer(cb.query(), "PRODUCT_CATEGORY_CODE", "PARENT_CATEGORY_CODE", pp, "productCategorySelfList");
    }
    def keepProductCategoryCode_NotExistsReferrer_ProductCategorySelfList(sq: ProductCategoryCQ): String;

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select PRODUCT_CATEGORY_CODE from PRODUCT where ...)} <br />
     * (商品)PRODUCT by PRODUCT_CATEGORY_CODE, named 'productAsOne'.
     * @param subQuery The sub-query of ProductList for 'in-scope'. (NotNull)
     */
    def inScopeProductList(subQuery: (ProductCB) => Unit): Unit = {
        assertObjectNotNull("subQuery", subQuery);
        val cb: ProductCB = new ProductCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery(cb); } finally { unlock(); }
        val pp: String = keepProductCategoryCode_InScopeRelation_ProductList(cb.query());
        registerInScopeRelation(cb.query(), "PRODUCT_CATEGORY_CODE", "PRODUCT_CATEGORY_CODE", pp, "productList");
    }
    def keepProductCategoryCode_InScopeRelation_ProductList(sq: ProductCQ): String;

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select PARENT_CATEGORY_CODE from PRODUCT_CATEGORY where ...)} <br />
     * (商品カテゴリ)PRODUCT_CATEGORY by PARENT_CATEGORY_CODE, named 'productCategorySelfAsOne'.
     * @param subQuery The sub-query of ProductCategorySelfList for 'in-scope'. (NotNull)
     */
    def inScopeProductCategorySelfList(subQuery: (ProductCategoryCB) => Unit): Unit = {
        assertObjectNotNull("subQuery", subQuery);
        val cb: ProductCategoryCB = new ProductCategoryCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery(cb); } finally { unlock(); }
        val pp: String = keepProductCategoryCode_InScopeRelation_ProductCategorySelfList(cb.query());
        registerInScopeRelation(cb.query(), "PRODUCT_CATEGORY_CODE", "PARENT_CATEGORY_CODE", pp, "productCategorySelfList");
    }
    def keepProductCategoryCode_InScopeRelation_ProductCategorySelfList(sq: ProductCategoryCQ): String;

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select PRODUCT_CATEGORY_CODE from PRODUCT where ...)} <br />
     * (商品)PRODUCT by PRODUCT_CATEGORY_CODE, named 'productAsOne'.
     * @param subQuery The sub-query of ProductList for 'not in-scope'. (NotNull)
     */
    def notInScopeProductList(subQuery: (ProductCB) => Unit): Unit = {
        assertObjectNotNull("subQuery", subQuery);
        val cb: ProductCB = new ProductCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery(cb); } finally { unlock(); }
        val pp: String = keepProductCategoryCode_NotInScopeRelation_ProductList(cb.query());
        registerNotInScopeRelation(cb.query(), "PRODUCT_CATEGORY_CODE", "PRODUCT_CATEGORY_CODE", pp, "productList");
    }
    def keepProductCategoryCode_NotInScopeRelation_ProductList(sq: ProductCQ): String;

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select PARENT_CATEGORY_CODE from PRODUCT_CATEGORY where ...)} <br />
     * (商品カテゴリ)PRODUCT_CATEGORY by PARENT_CATEGORY_CODE, named 'productCategorySelfAsOne'.
     * @param subQuery The sub-query of ProductCategorySelfList for 'not in-scope'. (NotNull)
     */
    def notInScopeProductCategorySelfList(subQuery: (ProductCategoryCB) => Unit): Unit = {
        assertObjectNotNull("subQuery", subQuery);
        val cb: ProductCategoryCB = new ProductCategoryCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery(cb); } finally { unlock(); }
        val pp: String = keepProductCategoryCode_NotInScopeRelation_ProductCategorySelfList(cb.query());
        registerNotInScopeRelation(cb.query(), "PRODUCT_CATEGORY_CODE", "PARENT_CATEGORY_CODE", pp, "productCategorySelfList");
    }
    def keepProductCategoryCode_NotInScopeRelation_ProductCategorySelfList(sq: ProductCategoryCQ): String;

    def xsderiveProductList(fn: String, sq: SubQuery[ProductCB], al: String, op: DerivedReferrerOption): Unit = {
        assertObjectNotNull("subQuery", sq);
        val cb: ProductCB = new ProductCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        val pp: String = keepProductCategoryCode_SpecifyDerivedReferrer_ProductList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PRODUCT_CATEGORY_CODE", "PRODUCT_CATEGORY_CODE", pp, "productList", al, op);
    }
    def keepProductCategoryCode_SpecifyDerivedReferrer_ProductList(sq: ProductCQ): String;

    def xsderiveProductCategorySelfList(fn: String, sq: SubQuery[ProductCategoryCB], al: String, op: DerivedReferrerOption): Unit = {
        assertObjectNotNull("subQuery", sq);
        val cb: ProductCategoryCB = new ProductCategoryCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        val pp: String = keepProductCategoryCode_SpecifyDerivedReferrer_ProductCategorySelfList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PRODUCT_CATEGORY_CODE", "PARENT_CATEGORY_CODE", pp, "productCategorySelfList", al, op);
    }
    def keepProductCategoryCode_SpecifyDerivedReferrer_ProductCategorySelfList(sq: ProductCategoryCQ): String;

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br />
     * {FOO &lt;= (select max(BAR) from PRODUCT where ...)} <br />
     * (商品)PRODUCT by PRODUCT_CATEGORY_CODE, named 'productAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">derivedProductList()</span>.<span style="color: #DD4747">max</span>(new SubQuery&lt;ProductCB&gt;() {
     *     public void query(ProductCB subCB) {
     *         subCB.specify().<span style="color: #DD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #DD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    def derivedProductList(): ScrHpQDRFunction[ProductCB] = {
        return toScalaQDRFunction(xcreateQDRFunctionProductList());
    }
    protected def xcreateQDRFunctionProductList(): HpQDRFunction[ProductCB] = {
        return new HpQDRFunction[ProductCB](new HpQDRSetupper[ProductCB]() {
            def setup(fn: String, sq: SubQuery[ProductCB], rd: String, vl: Object, op: DerivedReferrerOption): Unit = {
                xqderiveProductList(fn, sq, rd, vl, op);
            }
        });
    }
    def xqderiveProductList(fn: String, sq: SubQuery[ProductCB], rd: String, vl: Object, op: DerivedReferrerOption): Unit = {
        assertObjectNotNull("subQuery", sq);
        val cb: ProductCB = new ProductCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        val sqpp: String = keepProductCategoryCode_QueryDerivedReferrer_ProductList(cb.query());
        val prpp: String = keepProductCategoryCode_QueryDerivedReferrer_ProductListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PRODUCT_CATEGORY_CODE", "PRODUCT_CATEGORY_CODE", sqpp, "productList", rd, vl, prpp, op);
    }
    def keepProductCategoryCode_QueryDerivedReferrer_ProductList(sq: ProductCQ): String;
    def keepProductCategoryCode_QueryDerivedReferrer_ProductListParameter(vl: Object): String;

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br />
     * {FOO &lt;= (select max(BAR) from PRODUCT_CATEGORY where ...)} <br />
     * (商品カテゴリ)PRODUCT_CATEGORY by PARENT_CATEGORY_CODE, named 'productCategorySelfAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">derivedProductCategorySelfList()</span>.<span style="color: #DD4747">max</span>(new SubQuery&lt;ProductCategoryCB&gt;() {
     *     public void query(ProductCategoryCB subCB) {
     *         subCB.specify().<span style="color: #DD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #DD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    def derivedProductCategorySelfList(): ScrHpQDRFunction[ProductCategoryCB] = {
        return toScalaQDRFunction(xcreateQDRFunctionProductCategorySelfList());
    }
    protected def xcreateQDRFunctionProductCategorySelfList(): HpQDRFunction[ProductCategoryCB] = {
        return new HpQDRFunction[ProductCategoryCB](new HpQDRSetupper[ProductCategoryCB]() {
            def setup(fn: String, sq: SubQuery[ProductCategoryCB], rd: String, vl: Object, op: DerivedReferrerOption): Unit = {
                xqderiveProductCategorySelfList(fn, sq, rd, vl, op);
            }
        });
    }
    def xqderiveProductCategorySelfList(fn: String, sq: SubQuery[ProductCategoryCB], rd: String, vl: Object, op: DerivedReferrerOption): Unit = {
        assertObjectNotNull("subQuery", sq);
        val cb: ProductCategoryCB = new ProductCategoryCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        val sqpp: String = keepProductCategoryCode_QueryDerivedReferrer_ProductCategorySelfList(cb.query());
        val prpp: String = keepProductCategoryCode_QueryDerivedReferrer_ProductCategorySelfListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PRODUCT_CATEGORY_CODE", "PARENT_CATEGORY_CODE", sqpp, "productCategorySelfList", rd, vl, prpp, op);
    }
    def keepProductCategoryCode_QueryDerivedReferrer_ProductCategorySelfList(sq: ProductCategoryCQ): String;
    def keepProductCategoryCode_QueryDerivedReferrer_ProductCategorySelfListParameter(vl: Object): String;

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * (商品カテゴリコード)PRODUCT_CATEGORY_CODE: {PK, NotNull, CHAR(3)}
     */
    def setProductCategoryCode_IsNull(): Unit = { regProductCategoryCode(CK_ISN, AbstractConditionQuery.DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * (商品カテゴリコード)PRODUCT_CATEGORY_CODE: {PK, NotNull, CHAR(3)}
     */
    def setProductCategoryCode_IsNotNull(): Unit = { regProductCategoryCode(CK_ISNN, AbstractConditionQuery.DOBJ); }

    protected def regProductCategoryCode(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValueProductCategoryCode(), "PRODUCT_CATEGORY_CODE"); }
    protected def getCValueProductCategoryCode(): ConditionValue;

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (商品カテゴリ名称)PRODUCT_CATEGORY_NAME: {NotNull, VARCHAR(50)}
     * @param productCategoryName The value of productCategoryName as equal. (NullAllowed: if null (or empty), no condition)
     */
    def setProductCategoryName_Equal(productCategoryName: String): Unit = {
        doSetProductCategoryName_Equal(fRES(productCategoryName));
    }

    protected def doSetProductCategoryName_Equal(productCategoryName: String): Unit = {
        regProductCategoryName(CK_EQ, productCategoryName);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (商品カテゴリ名称)PRODUCT_CATEGORY_NAME: {NotNull, VARCHAR(50)}
     * @param productCategoryName The value of productCategoryName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    def setProductCategoryName_PrefixSearch(productCategoryName: String): Unit = {
        setProductCategoryName_LikeSearch(productCategoryName)(_.likePrefix);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (商品カテゴリ名称)PRODUCT_CATEGORY_NAME: {NotNull, VARCHAR(50)} <br />
     * <pre>e.g. setProductCategoryName_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param productCategoryName The value of productCategoryName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param optionCall The callback for option of like-search. (NotNull)
     */
    def setProductCategoryName_LikeSearch(productCategoryName: String)(optionCall: (ScrLikeSearchOption) => Unit): Unit = {
        regLSQ(CK_LS, fRES(productCategoryName), getCValueProductCategoryName(), "PRODUCT_CATEGORY_NAME", callbackLSOP(optionCall));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (商品カテゴリ名称)PRODUCT_CATEGORY_NAME: {NotNull, VARCHAR(50)}
     * @param productCategoryName The value of productCategoryName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param optionCall The callback for option of not-like-search. (NotNull)
     */
    def setProductCategoryName_NotLikeSearch(productCategoryName: String)(optionCall: (ScrLikeSearchOption) => Unit): Unit = {
        regLSQ(CK_NLS, fRES(productCategoryName), getCValueProductCategoryName(), "PRODUCT_CATEGORY_NAME", callbackLSOP(optionCall));
    }

    protected def regProductCategoryName(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValueProductCategoryName(), "PRODUCT_CATEGORY_NAME"); }
    protected def getCValueProductCategoryName(): ConditionValue;

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (親カテゴリコード)PARENT_CATEGORY_CODE: {IX, CHAR(3), FK to PRODUCT_CATEGORY}
     * @param parentCategoryCode The value of parentCategoryCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    def setParentCategoryCode_Equal(parentCategoryCode: String): Unit = {
        doSetParentCategoryCode_Equal(fRES(parentCategoryCode));
    }

    protected def doSetParentCategoryCode_Equal(parentCategoryCode: String): Unit = {
        regParentCategoryCode(CK_EQ, hSC("PARENT_CATEGORY_CODE", parentCategoryCode, 3, "E"));
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (親カテゴリコード)PARENT_CATEGORY_CODE: {IX, CHAR(3), FK to PRODUCT_CATEGORY}
     * @param parentCategoryCode The value of parentCategoryCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    def setParentCategoryCode_NotEqual(parentCategoryCode: String): Unit = {
        doSetParentCategoryCode_NotEqual(fRES(parentCategoryCode));
    }

    protected def doSetParentCategoryCode_NotEqual(parentCategoryCode: String): Unit = {
        regParentCategoryCode(CK_NES, hSC("PARENT_CATEGORY_CODE", parentCategoryCode, 3, "E"));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (親カテゴリコード)PARENT_CATEGORY_CODE: {IX, CHAR(3), FK to PRODUCT_CATEGORY}
     * @param parentCategoryCodeList The collection of parentCategoryCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    def setParentCategoryCode_InScope(parentCategoryCodeList: List[String]): Unit = {
        doSetParentCategoryCode_InScope(toMutableValueCollectionImplicitly(parentCategoryCodeList));
    }

    protected def doSetParentCategoryCode_InScope(parentCategoryCodeList: Collection[String]): Unit = {
        regINS(CK_INS, cTL(parentCategoryCodeList), getCValueParentCategoryCode(), "PARENT_CATEGORY_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (親カテゴリコード)PARENT_CATEGORY_CODE: {IX, CHAR(3), FK to PRODUCT_CATEGORY}
     * @param parentCategoryCodeList The collection of parentCategoryCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    def setParentCategoryCode_NotInScope(parentCategoryCodeList: List[String]): Unit = {
        doSetParentCategoryCode_NotInScope(if (parentCategoryCodeList != null) { parentCategoryCodeList.map(_.asInstanceOf[String]).asJava } else { null });
    }

    protected def doSetParentCategoryCode_NotInScope(parentCategoryCodeList: Collection[String]): Unit = {
        regINS(CK_NINS, cTL(parentCategoryCodeList), getCValueParentCategoryCode(), "PARENT_CATEGORY_CODE");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (親カテゴリコード)PARENT_CATEGORY_CODE: {IX, CHAR(3), FK to PRODUCT_CATEGORY}
     * @param parentCategoryCode The value of parentCategoryCode as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    def setParentCategoryCode_PrefixSearch(parentCategoryCode: String): Unit = {
        setParentCategoryCode_LikeSearch(parentCategoryCode)(_.likePrefix);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (親カテゴリコード)PARENT_CATEGORY_CODE: {IX, CHAR(3), FK to PRODUCT_CATEGORY} <br />
     * <pre>e.g. setParentCategoryCode_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param parentCategoryCode The value of parentCategoryCode as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param optionCall The callback for option of like-search. (NotNull)
     */
    def setParentCategoryCode_LikeSearch(parentCategoryCode: String)(optionCall: (ScrLikeSearchOption) => Unit): Unit = {
        regLSQ(CK_LS, fRES(parentCategoryCode), getCValueParentCategoryCode(), "PARENT_CATEGORY_CODE", callbackLSOP(optionCall));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * (親カテゴリコード)PARENT_CATEGORY_CODE: {IX, CHAR(3), FK to PRODUCT_CATEGORY}
     * @param parentCategoryCode The value of parentCategoryCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param optionCall The callback for option of not-like-search. (NotNull)
     */
    def setParentCategoryCode_NotLikeSearch(parentCategoryCode: String)(optionCall: (ScrLikeSearchOption) => Unit): Unit = {
        regLSQ(CK_NLS, fRES(parentCategoryCode), getCValueParentCategoryCode(), "PARENT_CATEGORY_CODE", callbackLSOP(optionCall));
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * (親カテゴリコード)PARENT_CATEGORY_CODE: {IX, CHAR(3), FK to PRODUCT_CATEGORY}
     */
    def setParentCategoryCode_IsNull(): Unit = { regParentCategoryCode(CK_ISN, AbstractConditionQuery.DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * (親カテゴリコード)PARENT_CATEGORY_CODE: {IX, CHAR(3), FK to PRODUCT_CATEGORY}
     */
    def setParentCategoryCode_IsNullOrEmpty(): Unit = { regParentCategoryCode(CK_ISNOE, AbstractConditionQuery.DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * (親カテゴリコード)PARENT_CATEGORY_CODE: {IX, CHAR(3), FK to PRODUCT_CATEGORY}
     */
    def setParentCategoryCode_IsNotNull(): Unit = { regParentCategoryCode(CK_ISNN, AbstractConditionQuery.DOBJ); }

    protected def regParentCategoryCode(ky: ConditionKey, vl: Any): Unit = { regQ(ky, vl, getCValueParentCategoryCode(), "PARENT_CATEGORY_CODE"); }
    protected def getCValueParentCategoryCode(): ConditionValue;

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;ProductCategoryCB&gt;() {
     *     public void query(ProductCategoryCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_Equal(): ScrHpSSQFunction[ProductCategoryCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_EQ, classOf[ProductCategoryCB]));
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;ProductCategoryCB&gt;() {
     *     public void query(ProductCategoryCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_NotEqual(): ScrHpSSQFunction[ProductCategoryCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_NES, classOf[ProductCategoryCB]));
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;ProductCategoryCB&gt;() {
     *     public void query(ProductCategoryCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_GreaterThan(): ScrHpSSQFunction[ProductCategoryCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_GT, classOf[ProductCategoryCB]));
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;ProductCategoryCB&gt;() {
     *     public void query(ProductCategoryCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_LessThan(): ScrHpSSQFunction[ProductCategoryCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_LT, classOf[ProductCategoryCB]));
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;ProductCategoryCB&gt;() {
     *     public void query(ProductCategoryCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_GreaterEqual(): ScrHpSSQFunction[ProductCategoryCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_GE, classOf[ProductCategoryCB]));
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;ProductCategoryCB&gt;() {
     *     public void query(ProductCategoryCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    def scalar_LessEqual(): ScrHpSSQFunction[ProductCategoryCB] = {
        return toScalaSSQFunction(xcreateSSQFunction(CK_LE, classOf[ProductCategoryCB]));
    }

    protected def toScalaSSQFunction(function: HpSSQFunction[ProductCategoryCB]): ScrHpSSQFunction[ProductCategoryCB] =
    { new ScrHpSSQFunction(function) }

    override protected def xscalarCondition[CB <: ConditionBean](fn: String, sq: SubQuery[CB], rd: String, op: HpSSQOption[CB]): Unit = {
        assertObjectNotNull("subQuery", sq);
        val cb: ProductCategoryCB = xcreateScalarConditionCB(); sq.query(cb.asInstanceOf[CB]);
        val pp: String = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean(xcreateScalarConditionPartitionByCB().asInstanceOf[CB]); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    def keepScalarCondition(sq: ProductCategoryCQ): String;

    protected def xcreateScalarConditionCB(): ProductCategoryCB = {
        val cb: ProductCategoryCB = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected def xcreateScalarConditionPartitionByCB(): ProductCategoryCB = {
        val cb: ProductCategoryCB = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    def xsmyselfDerive(fn: String, sq: SubQuery[ProductCategoryCB], al: String, op: DerivedReferrerOption): Unit = {
        assertObjectNotNull("subQuery", sq);
        val cb: ProductCategoryCB = new ProductCategoryCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        val pp: String = keepSpecifyMyselfDerived(cb.query());
        val pk: String = "PRODUCT_CATEGORY_CODE";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    def keepSpecifyMyselfDerived(sq: ProductCategoryCQ): String;

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    def myselfDerived(): ScrHpQDRFunction[ProductCategoryCB] = {
        return toScalaQDRFunction(xcreateQDRFunctionMyselfDerived(classOf[ProductCategoryCB]));
    }
    override protected def xqderiveMyselfDerived[CB <: ConditionBean](fn: String, sq: SubQuery[CB], rd: String, vl: Object, op: DerivedReferrerOption): Unit = {
        assertObjectNotNull("subQuery", sq);
        val cb: ProductCategoryCB = new ProductCategoryCB(); cb.xsetupForDerivedReferrer(this); sq.query(cb.asInstanceOf[CB]);
        val pk: String = "PRODUCT_CATEGORY_CODE";
        val sqpp: String = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        val prpp: String = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    def keepQueryMyselfDerived(sq: ProductCategoryCQ): String;
    def keepQueryMyselfDerivedParameter(vl: Object): String;

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    def myselfExists(subQuery: (ProductCategoryCB) => Unit): Unit = {
        assertObjectNotNull("subQuery", subQuery);
        val cb: ProductCategoryCB = new ProductCategoryCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery(cb); } finally { unlock(); }
        val pp: String = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    def keepMyselfExists(sq: ProductCategoryCQ): String;

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    def myselfInScope(subQuery: (ProductCategoryCB) => Unit): Unit = {
        assertObjectNotNull("subQuery", subQuery);
        val cb: ProductCategoryCB = new ProductCategoryCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery(cb); } finally { unlock(); }
        val pp: String = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    def keepMyselfInScope(sq: ProductCategoryCQ): String;

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
    protected def newMyCB(): ProductCategoryCB = {
        return new ProductCategoryCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected def xabUDT(): String = { return classOf[Date].getName(); }
    protected def xabCQ(): String = { return classOf[ProductCategoryCQ].getName(); }
    protected def xabLSO(): String = { return classOf[LikeSearchOption].getName(); }
    protected def xabSSQS(): String = { return classOf[HpSSQSetupper[_]].getName(); }
}
