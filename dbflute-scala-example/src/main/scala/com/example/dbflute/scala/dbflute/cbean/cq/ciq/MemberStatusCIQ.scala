package com.example.dbflute.scala.dbflute.cbean.cq.ciq;

import java.util.Map;
import org.seasar.dbflute.cbean._
import org.seasar.dbflute.cbean.ckey._
import org.seasar.dbflute.cbean.coption.ConditionOption;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;
import com.example.dbflute.scala.dbflute.cbean._
import com.example.dbflute.scala.dbflute.cbean.cq.bs._
import com.example.dbflute.scala.dbflute.cbean.cq._

/**
 * The condition-query for in-line of MEMBER_STATUS.
 * @author DBFlute(AutoGenerator)
 */
class MemberStatusCIQ(childQuery: ConditionQuery, sqlClause: SqlClause, aliasName: String, nestLevel: Integer, myCQ: BsMemberStatusCQ)
        extends AbstractBsMemberStatusCQ(childQuery, sqlClause, aliasName, nestLevel) {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected var _myCQ: BsMemberStatusCQ = null;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    {
        _myCQ = myCQ;
        _foreignPropertyName = _myCQ.xgetForeignPropertyName(); // accept foreign property name
        _relationPath = _myCQ.xgetRelationPath(); // accept relation path
        _inline = true;
    }

    // ===================================================================================
    //                                                             Override about Register
    //                                                             =======================
    override protected def reflectRelationOnUnionQuery(bq: ConditionQuery, uq: ConditionQuery): Unit =
    { throw new IllegalConditionBeanOperationException("InlineView cannot use Union: " + bq + " : " + uq); }

    override protected def setupConditionValueAndRegisterWhereClause(k: ConditionKey, v: Object, cv: ConditionValue, col: String): Unit =
    { regIQ(k, v, cv, col); }

    override protected def setupConditionValueAndRegisterWhereClause(k: ConditionKey, v: Object, cv: ConditionValue, col: String, op: ConditionOption): Unit =
    { regIQ(k, v, cv, col, op); }

    override protected def registerWhereClause(wc: String): Unit =
    { registerInlineWhereClause(wc); }

    override protected def isInScopeRelationSuppressLocalAliasName(): Boolean = {
        if (_onClause) { throw new IllegalConditionBeanOperationException("InScopeRelation on OnClause is unsupported."); }
        return true;
    }

    // ===================================================================================
    //                                                                Override about Query
    //                                                                ====================
    protected def getCValueMemberStatusCode(): ConditionValue = { return _myCQ.getMemberStatusCode(); }
    def keepMemberStatusCode_ExistsReferrer_MemberList(sq: MemberCQ): String =
    { throwIICBOE("ExistsReferrer"); return null; }
    def keepMemberStatusCode_ExistsReferrer_MemberLoginList(sq: MemberLoginCQ): String =
    { throwIICBOE("ExistsReferrer"); return null; }
    def keepMemberStatusCode_NotExistsReferrer_MemberList(sq: MemberCQ): String =
    { throwIICBOE("NotExistsReferrer"); return null; }
    def keepMemberStatusCode_NotExistsReferrer_MemberLoginList(sq: MemberLoginCQ): String =
    { throwIICBOE("NotExistsReferrer"); return null; }
    def keepMemberStatusCode_InScopeRelation_MemberList(sq: MemberCQ): String =
    { return _myCQ.keepMemberStatusCode_InScopeRelation_MemberList(sq); }
    def keepMemberStatusCode_InScopeRelation_MemberLoginList(sq: MemberLoginCQ): String =
    { return _myCQ.keepMemberStatusCode_InScopeRelation_MemberLoginList(sq); }
    def keepMemberStatusCode_NotInScopeRelation_MemberList(sq: MemberCQ): String =
    { return _myCQ.keepMemberStatusCode_NotInScopeRelation_MemberList(sq); }
    def keepMemberStatusCode_NotInScopeRelation_MemberLoginList(sq: MemberLoginCQ): String =
    { return _myCQ.keepMemberStatusCode_NotInScopeRelation_MemberLoginList(sq); }
    def keepMemberStatusCode_SpecifyDerivedReferrer_MemberList(sq: MemberCQ): String =
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    def keepMemberStatusCode_SpecifyDerivedReferrer_MemberLoginList(sq: MemberLoginCQ): String =
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    def keepMemberStatusCode_QueryDerivedReferrer_MemberList(sq: MemberCQ): String =
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    def keepMemberStatusCode_QueryDerivedReferrer_MemberListParameter(vl: Object): String =
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    def keepMemberStatusCode_QueryDerivedReferrer_MemberLoginList(sq: MemberLoginCQ): String =
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    def keepMemberStatusCode_QueryDerivedReferrer_MemberLoginListParameter(vl: Object): String =
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected def getCValueMemberStatusName(): ConditionValue = { return _myCQ.getMemberStatusName(); }
    protected def getCValueDescription(): ConditionValue = { return _myCQ.getDescription(); }
    protected def getCValueDisplayOrder(): ConditionValue = { return _myCQ.getDisplayOrder(); }
    protected def xfindFixedConditionDynamicParameterMap(pp: String): Map[String, Object] = { return null; }
    def keepScalarCondition(sq: MemberStatusCQ): String =
    { throwIICBOE("ScalarCondition"); return null; }
    def keepSpecifyMyselfDerived(sq: MemberStatusCQ): String =
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    def keepQueryMyselfDerived(sq: MemberStatusCQ): String =
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    def keepQueryMyselfDerivedParameter(vl: Object): String =
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    def keepMyselfExists(sq: MemberStatusCQ): String =
    { throwIICBOE("MyselfExists"); return null;}
    def keepMyselfInScope(sq: MemberStatusCQ): String =
    { throwIICBOE("MyselfInScope"); return null;}

    protected def throwIICBOE(name: String): Unit =
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected def xinCB(): String = { return classOf[MemberStatusCB].getName(); }
    protected def xinCQ(): String = { return classOf[MemberStatusCQ].getName(); }
}
