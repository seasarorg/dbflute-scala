package com.example.dbflute.scala.dbflute.cbean.nss;

import org.seasar.dbflute.cbean.ConditionQuery;
import org.seasar.dbflute.cbean.AbstractConditionQuery._;
import com.example.dbflute.scala.dbflute.cbean.cq.PurchasePaymentCQ;

/**
 * The nest select set-upper of PURCHASE_PAYMENT.
 * @author DBFlute(AutoGenerator)
 */
class PurchasePaymentNss(query: PurchasePaymentCQ) {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected var _query: PurchasePaymentCQ = query;
    def hasConditionQuery(): Boolean = { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br />
     * (購入)PURCHASE by my PURCHASE_ID, named 'purchase'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    def withPurchase(): PurchaseNss = {
        _query.doNss(new NssCall() { def qf(): ConditionQuery = { return _query.queryPurchase(); }});
        return new PurchaseNss(_query.queryPurchase());
    }
}
