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
 * The condition-query for in-line of PRODUCT.
 * @author DBFlute(AutoGenerator)
 */
class ProductCIQ(childQuery: ConditionQuery, sqlClause: SqlClause, aliasName: String, nestLevel: Integer, myCQ: BsProductCQ)
        extends AbstractBsProductCQ(childQuery, sqlClause, aliasName, nestLevel) {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected var _myCQ: BsProductCQ = null;

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
    protected def getCValueProductId(): ConditionValue = { return _myCQ.getProductId(); }
    def keepProductId_ExistsReferrer_PurchaseList(sq: PurchaseCQ): String =
    { throwIICBOE("ExistsReferrer"); return null; }
    def keepProductId_NotExistsReferrer_PurchaseList(sq: PurchaseCQ): String =
    { throwIICBOE("NotExistsReferrer"); return null; }
    def keepProductId_InScopeRelation_PurchaseList(sq: PurchaseCQ): String =
    { return _myCQ.keepProductId_InScopeRelation_PurchaseList(sq); }
    def keepProductId_NotInScopeRelation_PurchaseList(sq: PurchaseCQ): String =
    { return _myCQ.keepProductId_NotInScopeRelation_PurchaseList(sq); }
    def keepProductId_SpecifyDerivedReferrer_PurchaseList(sq: PurchaseCQ): String =
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    def keepProductId_QueryDerivedReferrer_PurchaseList(sq: PurchaseCQ): String =
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    def keepProductId_QueryDerivedReferrer_PurchaseListParameter(vl: Object): String =
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected def getCValueProductName(): ConditionValue = { return _myCQ.getProductName(); }
    protected def getCValueProductHandleCode(): ConditionValue = { return _myCQ.getProductHandleCode(); }
    protected def getCValueProductCategoryCode(): ConditionValue = { return _myCQ.getProductCategoryCode(); }
    protected def getCValueProductStatusCode(): ConditionValue = { return _myCQ.getProductStatusCode(); }
    protected def getCValueRegularPrice(): ConditionValue = { return _myCQ.getRegularPrice(); }
    protected def getCValueRegisterDatetime(): ConditionValue = { return _myCQ.getRegisterDatetime(); }
    protected def getCValueRegisterUser(): ConditionValue = { return _myCQ.getRegisterUser(); }
    protected def getCValueUpdateDatetime(): ConditionValue = { return _myCQ.getUpdateDatetime(); }
    protected def getCValueUpdateUser(): ConditionValue = { return _myCQ.getUpdateUser(); }
    protected def getCValueVersionNo(): ConditionValue = { return _myCQ.getVersionNo(); }
    protected def xfindFixedConditionDynamicParameterMap(pp: String): Map[String, Object] = { return null; }
    def keepScalarCondition(sq: ProductCQ): String =
    { throwIICBOE("ScalarCondition"); return null; }
    def keepSpecifyMyselfDerived(sq: ProductCQ): String =
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    def keepQueryMyselfDerived(sq: ProductCQ): String =
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    def keepQueryMyselfDerivedParameter(vl: Object): String =
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    def keepMyselfExists(sq: ProductCQ): String =
    { throwIICBOE("MyselfExists"); return null;}
    def keepMyselfInScope(sq: ProductCQ): String =
    { throwIICBOE("MyselfInScope"); return null;}

    protected def throwIICBOE(name: String): Unit =
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected def xinCB(): String = { return classOf[ProductCB].getName(); }
    protected def xinCQ(): String = { return classOf[ProductCQ].getName(); }
}
