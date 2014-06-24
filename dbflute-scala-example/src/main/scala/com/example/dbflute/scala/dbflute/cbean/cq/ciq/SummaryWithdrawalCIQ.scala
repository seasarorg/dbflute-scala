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
 * The condition-query for in-line of SUMMARY_WITHDRAWAL.
 * @author DBFlute(AutoGenerator)
 */
class SummaryWithdrawalCIQ(childQuery: ConditionQuery, sqlClause: SqlClause, aliasName: String, nestLevel: Integer, myCQ: BsSummaryWithdrawalCQ)
        extends AbstractBsSummaryWithdrawalCQ(childQuery, sqlClause, aliasName, nestLevel) {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected var _myCQ: BsSummaryWithdrawalCQ = null;

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
    protected def getCValueMemberId(): ConditionValue = { return _myCQ.getMemberId(); }
    protected def getCValueMemberName(): ConditionValue = { return _myCQ.getMemberName(); }
    protected def getCValueWithdrawalReasonCode(): ConditionValue = { return _myCQ.getWithdrawalReasonCode(); }
    protected def getCValueWithdrawalReasonText(): ConditionValue = { return _myCQ.getWithdrawalReasonText(); }
    protected def getCValueWithdrawalReasonInputText(): ConditionValue = { return _myCQ.getWithdrawalReasonInputText(); }
    protected def getCValueWithdrawalDatetime(): ConditionValue = { return _myCQ.getWithdrawalDatetime(); }
    protected def getCValueMemberStatusCode(): ConditionValue = { return _myCQ.getMemberStatusCode(); }
    protected def getCValueMemberStatusName(): ConditionValue = { return _myCQ.getMemberStatusName(); }
    protected def getCValueMaxPurchasePrice(): ConditionValue = { return _myCQ.getMaxPurchasePrice(); }
    protected def xfindFixedConditionDynamicParameterMap(pp: String): Map[String, Object] = { return null; }
    def keepScalarCondition(sq: SummaryWithdrawalCQ): String =
    { throwIICBOE("ScalarCondition"); return null; }

    protected def throwIICBOE(name: String): Unit =
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected def xinCB(): String = { return classOf[SummaryWithdrawalCB].getName(); }
    protected def xinCQ(): String = { return classOf[SummaryWithdrawalCQ].getName(); }
}
