package com.example.dbflute.scala.dbflute.cbean.nss;

import org.seasar.dbflute.cbean.ConditionQuery;
import org.seasar.dbflute.cbean.AbstractConditionQuery._;
import com.example.dbflute.scala.dbflute.cbean.cq.MemberAddressCQ;

/**
 * The nest select set-upper of MEMBER_ADDRESS.
 * @author DBFlute(AutoGenerator)
 */
class MemberAddressNss(query: MemberAddressCQ) {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected var _query: MemberAddressCQ = query;
    def hasConditionQuery(): Boolean = { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br />
     * (会員)MEMBER by my MEMBER_ID, named 'member'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    def withMember(): MemberNss = {
        _query.doNss(new NssCall() { def qf(): ConditionQuery = { return _query.queryMember(); }});
        return new MemberNss(_query.queryMember());
    }
    /**
     * With nested relation columns to select clause. <br />
     * (地域)REGION by my REGION_ID, named 'region'.
     */
    def withRegion(): Unit = {
        _query.doNss(new NssCall() { def qf(): ConditionQuery = { return _query.queryRegion(); }});
    }
}
