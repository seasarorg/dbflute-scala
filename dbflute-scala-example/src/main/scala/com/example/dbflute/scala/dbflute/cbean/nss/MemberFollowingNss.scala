package com.example.dbflute.scala.dbflute.cbean.nss;

import org.seasar.dbflute.cbean.ConditionQuery;
import org.seasar.dbflute.cbean.AbstractConditionQuery._;
import com.example.dbflute.scala.dbflute.cbean.cq.MemberFollowingCQ;

/**
 * The nest select set-upper of MEMBER_FOLLOWING.
 * @author DBFlute(AutoGenerator)
 */
class MemberFollowingNss(query: MemberFollowingCQ) {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected var _query: MemberFollowingCQ = query;
    def hasConditionQuery(): Boolean = { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br />
     * (会員)MEMBER by my MY_MEMBER_ID, named 'memberByMyMemberId'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    def withMemberByMyMemberId(): MemberNss = {
        _query.doNss(new NssCall() { def qf(): ConditionQuery = { return _query.queryMemberByMyMemberId(); }});
        return new MemberNss(_query.queryMemberByMyMemberId());
    }
    /**
     * With nested relation columns to select clause. <br />
     * (会員)MEMBER by my YOUR_MEMBER_ID, named 'memberByYourMemberId'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    def withMemberByYourMemberId(): MemberNss = {
        _query.doNss(new NssCall() { def qf(): ConditionQuery = { return _query.queryMemberByYourMemberId(); }});
        return new MemberNss(_query.queryMemberByYourMemberId());
    }
}
