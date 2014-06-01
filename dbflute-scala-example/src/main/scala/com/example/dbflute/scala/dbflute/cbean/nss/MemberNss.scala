package com.example.dbflute.scala.dbflute.cbean.nss;

import org.seasar.dbflute.cbean.ConditionQuery;
import org.seasar.dbflute.cbean.AbstractConditionQuery._;
import com.example.dbflute.scala.dbflute.cbean.cq.MemberCQ;

/**
 * The nest select set-upper of MEMBER.
 * @author DBFlute(AutoGenerator)
 */
class MemberNss(query: MemberCQ) {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected var _query: MemberCQ = query;
    def hasConditionQuery(): Boolean = { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br />
     * (会員ステータス)MEMBER_STATUS by my MEMBER_STATUS_CODE, named 'memberStatus'.
     */
    def withMemberStatus(): Unit = {
        _query.doNss(new NssCall() { def qf(): ConditionQuery = { return _query.queryMemberStatus(); }});
    }
    /**
     * With nested relation columns to select clause. <br />
     * (会員サービス)MEMBER_SERVICE by MEMBER_ID, named 'memberServiceAsOne'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    def withMemberServiceAsOne(): MemberServiceNss = {
        _query.doNss(new NssCall() { def qf(): ConditionQuery = { return _query.queryMemberServiceAsOne(); }});
        return new MemberServiceNss(_query.queryMemberServiceAsOne());
    }
}
