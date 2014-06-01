package com.example.dbflute.scala.dbflute.cbean.nss;

import org.seasar.dbflute.cbean.ConditionQuery;
import org.seasar.dbflute.cbean.AbstractConditionQuery._;
import com.example.dbflute.scala.dbflute.cbean.cq.MemberServiceCQ;

/**
 * The nest select set-upper of MEMBER_SERVICE.
 * @author DBFlute(AutoGenerator)
 */
class MemberServiceNss(query: MemberServiceCQ) {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected var _query: MemberServiceCQ = query;
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
     * (サービスランク)SERVICE_RANK by my SERVICE_RANK_CODE, named 'serviceRank'.
     */
    def withServiceRank(): Unit = {
        _query.doNss(new NssCall() { def qf(): ConditionQuery = { return _query.queryServiceRank(); }});
    }
}
