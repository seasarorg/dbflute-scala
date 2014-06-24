package com.example.dbflute.scala.dbflute.cbean.nss;

import org.seasar.dbflute.cbean.ConditionQuery;
import org.seasar.dbflute.cbean.AbstractConditionQuery._;
import com.example.dbflute.scala.dbflute.cbean.cq.ProductCategoryCQ;

/**
 * The nest select set-upper of PRODUCT_CATEGORY.
 * @author DBFlute(AutoGenerator)
 */
class ProductCategoryNss(query: ProductCategoryCQ) {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected var _query: ProductCategoryCQ = query;
    def hasConditionQuery(): Boolean = { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br />
     * (商品カテゴリ)PRODUCT_CATEGORY by my PARENT_CATEGORY_CODE, named 'productCategorySelf'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    def withProductCategorySelf(): ProductCategoryNss = {
        _query.doNss(new NssCall() { def qf(): ConditionQuery = { return _query.queryProductCategorySelf(); }});
        return new ProductCategoryNss(_query.queryProductCategorySelf());
    }
}
