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
 * The condition-query for in-line of PURCHASE_PAYMENT.
 * @author DBFlute(AutoGenerator)
 */
class PurchasePaymentCIQ(childQuery: ConditionQuery, sqlClause: SqlClause, aliasName: String, nestLevel: Integer, myCQ: BsPurchasePaymentCQ)
        extends AbstractBsPurchasePaymentCQ(childQuery, sqlClause, aliasName, nestLevel) {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected var _myCQ: BsPurchasePaymentCQ = null;

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
    protected def getCValuePurchasePaymentId(): ConditionValue = { return _myCQ.getPurchasePaymentId(); }
    protected def getCValuePurchaseId(): ConditionValue = { return _myCQ.getPurchaseId(); }
    protected def getCValuePaymentAmount(): ConditionValue = { return _myCQ.getPaymentAmount(); }
    protected def getCValuePaymentDatetime(): ConditionValue = { return _myCQ.getPaymentDatetime(); }
    protected def getCValuePaymentMethodCode(): ConditionValue = { return _myCQ.getPaymentMethodCode(); }
    protected def getCValueRegisterDatetime(): ConditionValue = { return _myCQ.getRegisterDatetime(); }
    protected def getCValueRegisterUser(): ConditionValue = { return _myCQ.getRegisterUser(); }
    protected def getCValueUpdateDatetime(): ConditionValue = { return _myCQ.getUpdateDatetime(); }
    protected def getCValueUpdateUser(): ConditionValue = { return _myCQ.getUpdateUser(); }
    protected def xfindFixedConditionDynamicParameterMap(pp: String): Map[String, Object] = { return null; }
    def keepScalarCondition(sq: PurchasePaymentCQ): String =
    { throwIICBOE("ScalarCondition"); return null; }
    def keepSpecifyMyselfDerived(sq: PurchasePaymentCQ): String =
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    def keepQueryMyselfDerived(sq: PurchasePaymentCQ): String =
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    def keepQueryMyselfDerivedParameter(vl: Object): String =
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    def keepMyselfExists(sq: PurchasePaymentCQ): String =
    { throwIICBOE("MyselfExists"); return null;}
    def keepMyselfInScope(sq: PurchasePaymentCQ): String =
    { throwIICBOE("MyselfInScope"); return null;}

    protected def throwIICBOE(name: String): Unit =
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected def xinCB(): String = { return classOf[PurchasePaymentCB].getName(); }
    protected def xinCQ(): String = { return classOf[PurchasePaymentCQ].getName(); }
}
