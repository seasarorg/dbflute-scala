package org.dbflute.scala.testlib.dbflute.cbean.cq;


import org.dbflute.scala.testlib.dbflute.cbean.cq.bs.BsMemberLoginCQ;
import org.seasar.dbflute.cbean.ConditionQuery;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;


/**
 * The condition-query of MEMBER_LOGIN.
 * @author DBFlute(AutoGenerator)
 */
public class MemberLoginCQ extends BsMemberLoginCQ {

    // =====================================================================================
    //                                                                           Constructor
    //                                                                           ===========
    /**
     * Constructor.
     * 
     * @param childQuery Child query as abstract class. (Nullable: If null, this is base instance.)
     * @param sqlClause SQL clause instance. (NotNull)
     * @param aliasName My alias name. (NotNull)
     * @param nestLevel Nest level.
     */
    public MemberLoginCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }
}
