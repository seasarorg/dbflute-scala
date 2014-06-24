package com.example.dbflute.scala.dbflute.cbean.nss;

import org.seasar.dbflute.cbean.ConditionQuery;
import org.seasar.dbflute.cbean.AbstractConditionQuery._;
import com.example.dbflute.scala.dbflute.cbean.cq.MemberLoginCQ;

/**
 * The nest select set-upper of MEMBER_LOGIN.
 * @author DBFlute(AutoGenerator)
 */
class MemberLoginNss(query: MemberLoginCQ) {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected var _query: MemberLoginCQ = query;
    def hasConditionQuery(): Boolean = { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br />
     * (会員ステータス)MEMBER_STATUS by my LOGIN_MEMBER_STATUS_CODE, named 'memberStatus'.
     */
    def withMemberStatus(): Unit = {
        _query.doNss(new NssCall() { def qf(): ConditionQuery = { return _query.queryMemberStatus(); }});
    }
    /**
     * With nested relation columns to select clause. <br />
     * (会員)MEMBER by my MEMBER_ID, named 'member'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    def withMember(): MemberNss = {
        _query.doNss(new NssCall() { def qf(): ConditionQuery = { return _query.queryMember(); }});
        return new MemberNss(_query.queryMember());
    }
}
