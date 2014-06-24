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
 * The condition-query for in-line of PRODUCT_STATUS.
 * @author DBFlute(AutoGenerator)
 */
class ProductStatusCIQ(childQuery: ConditionQuery, sqlClause: SqlClause, aliasName: String, nestLevel: Integer, myCQ: BsProductStatusCQ)
        extends AbstractBsProductStatusCQ(childQuery, sqlClause, aliasName, nestLevel) {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected var _myCQ: BsProductStatusCQ = null;

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
    protected def getCValueProductStatusCode(): ConditionValue = { return _myCQ.getProductStatusCode(); }
    def keepProductStatusCode_ExistsReferrer_ProductList(sq: ProductCQ): String =
    { throwIICBOE("ExistsReferrer"); return null; }
    def keepProductStatusCode_NotExistsReferrer_ProductList(sq: ProductCQ): String =
    { throwIICBOE("NotExistsReferrer"); return null; }
    def keepProductStatusCode_InScopeRelation_ProductList(sq: ProductCQ): String =
    { return _myCQ.keepProductStatusCode_InScopeRelation_ProductList(sq); }
    def keepProductStatusCode_NotInScopeRelation_ProductList(sq: ProductCQ): String =
    { return _myCQ.keepProductStatusCode_NotInScopeRelation_ProductList(sq); }
    def keepProductStatusCode_SpecifyDerivedReferrer_ProductList(sq: ProductCQ): String =
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    def keepProductStatusCode_QueryDerivedReferrer_ProductList(sq: ProductCQ): String =
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    def keepProductStatusCode_QueryDerivedReferrer_ProductListParameter(vl: Object): String =
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected def getCValueProductStatusName(): ConditionValue = { return _myCQ.getProductStatusName(); }
    protected def getCValueDisplayOrder(): ConditionValue = { return _myCQ.getDisplayOrder(); }
    protected def xfindFixedConditionDynamicParameterMap(pp: String): Map[String, Object] = { return null; }
    def keepScalarCondition(sq: ProductStatusCQ): String =
    { throwIICBOE("ScalarCondition"); return null; }
    def keepSpecifyMyselfDerived(sq: ProductStatusCQ): String =
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    def keepQueryMyselfDerived(sq: ProductStatusCQ): String =
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    def keepQueryMyselfDerivedParameter(vl: Object): String =
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    def keepMyselfExists(sq: ProductStatusCQ): String =
    { throwIICBOE("MyselfExists"); return null;}
    def keepMyselfInScope(sq: ProductStatusCQ): String =
    { throwIICBOE("MyselfInScope"); return null;}

    protected def throwIICBOE(name: String): Unit =
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected def xinCB(): String = { return classOf[ProductStatusCB].getName(); }
    protected def xinCQ(): String = { return classOf[ProductStatusCQ].getName(); }
}
