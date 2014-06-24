package com.example.dbflute.scala.dbflute.cbean.nss;

import org.seasar.dbflute.cbean.ConditionQuery;
import org.seasar.dbflute.cbean.AbstractConditionQuery._;
import com.example.dbflute.scala.dbflute.cbean.cq.VendorTheLongAndWindingTableAndColumnRefCQ;

/**
 * The nest select set-upper of VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF.
 * @author DBFlute(AutoGenerator)
 */
class VendorTheLongAndWindingTableAndColumnRefNss(query: VendorTheLongAndWindingTableAndColumnRefCQ) {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected var _query: VendorTheLongAndWindingTableAndColumnRefCQ = query;
    def hasConditionQuery(): Boolean = { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br />
     * VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN by my THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID, named 'vendorTheLongAndWindingTableAndColumn'.
     */
    def withVendorTheLongAndWindingTableAndColumn(): Unit = {
        _query.doNss(new NssCall() { def qf(): ConditionQuery = { return _query.queryVendorTheLongAndWindingTableAndColumn(); }});
    }
}
