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
 * The condition-query for in-line of WITHDRAWAL_REASON.
 * @author DBFlute(AutoGenerator)
 */
class WithdrawalReasonCIQ(childQuery: ConditionQuery, sqlClause: SqlClause, aliasName: String, nestLevel: Integer, myCQ: BsWithdrawalReasonCQ)
        extends AbstractBsWithdrawalReasonCQ(childQuery, sqlClause, aliasName, nestLevel) {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected var _myCQ: BsWithdrawalReasonCQ = null;

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
    protected def getCValueWithdrawalReasonCode(): ConditionValue = { return _myCQ.getWithdrawalReasonCode(); }
    def keepWithdrawalReasonCode_ExistsReferrer_MemberWithdrawalList(sq: MemberWithdrawalCQ): String =
    { throwIICBOE("ExistsReferrer"); return null; }
    def keepWithdrawalReasonCode_NotExistsReferrer_MemberWithdrawalList(sq: MemberWithdrawalCQ): String =
    { throwIICBOE("NotExistsReferrer"); return null; }
    def keepWithdrawalReasonCode_InScopeRelation_MemberWithdrawalList(sq: MemberWithdrawalCQ): String =
    { return _myCQ.keepWithdrawalReasonCode_InScopeRelation_MemberWithdrawalList(sq); }
    def keepWithdrawalReasonCode_NotInScopeRelation_MemberWithdrawalList(sq: MemberWithdrawalCQ): String =
    { return _myCQ.keepWithdrawalReasonCode_NotInScopeRelation_MemberWithdrawalList(sq); }
    def keepWithdrawalReasonCode_SpecifyDerivedReferrer_MemberWithdrawalList(sq: MemberWithdrawalCQ): String =
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    def keepWithdrawalReasonCode_QueryDerivedReferrer_MemberWithdrawalList(sq: MemberWithdrawalCQ): String =
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    def keepWithdrawalReasonCode_QueryDerivedReferrer_MemberWithdrawalListParameter(vl: Object): String =
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected def getCValueWithdrawalReasonText(): ConditionValue = { return _myCQ.getWithdrawalReasonText(); }
    protected def getCValueDisplayOrder(): ConditionValue = { return _myCQ.getDisplayOrder(); }
    protected def xfindFixedConditionDynamicParameterMap(pp: String): Map[String, Object] = { return null; }
    def keepScalarCondition(sq: WithdrawalReasonCQ): String =
    { throwIICBOE("ScalarCondition"); return null; }
    def keepSpecifyMyselfDerived(sq: WithdrawalReasonCQ): String =
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    def keepQueryMyselfDerived(sq: WithdrawalReasonCQ): String =
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    def keepQueryMyselfDerivedParameter(vl: Object): String =
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    def keepMyselfExists(sq: WithdrawalReasonCQ): String =
    { throwIICBOE("MyselfExists"); return null;}
    def keepMyselfInScope(sq: WithdrawalReasonCQ): String =
    { throwIICBOE("MyselfInScope"); return null;}

    protected def throwIICBOE(name: String): Unit =
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected def xinCB(): String = { return classOf[WithdrawalReasonCB].getName(); }
    protected def xinCQ(): String = { return classOf[WithdrawalReasonCQ].getName(); }
}
