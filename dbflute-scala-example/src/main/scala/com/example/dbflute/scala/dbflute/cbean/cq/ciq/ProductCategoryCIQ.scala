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
 * The condition-query for in-line of PRODUCT_CATEGORY.
 * @author DBFlute(AutoGenerator)
 */
class ProductCategoryCIQ(childQuery: ConditionQuery, sqlClause: SqlClause, aliasName: String, nestLevel: Integer, myCQ: BsProductCategoryCQ)
        extends AbstractBsProductCategoryCQ(childQuery, sqlClause, aliasName, nestLevel) {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected var _myCQ: BsProductCategoryCQ = null;

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
    protected def getCValueProductCategoryCode(): ConditionValue = { return _myCQ.getProductCategoryCode(); }
    def keepProductCategoryCode_ExistsReferrer_ProductList(sq: ProductCQ): String =
    { throwIICBOE("ExistsReferrer"); return null; }
    def keepProductCategoryCode_ExistsReferrer_ProductCategorySelfList(sq: ProductCategoryCQ): String =
    { throwIICBOE("ExistsReferrer"); return null; }
    def keepProductCategoryCode_NotExistsReferrer_ProductList(sq: ProductCQ): String =
    { throwIICBOE("NotExistsReferrer"); return null; }
    def keepProductCategoryCode_NotExistsReferrer_ProductCategorySelfList(sq: ProductCategoryCQ): String =
    { throwIICBOE("NotExistsReferrer"); return null; }
    def keepProductCategoryCode_InScopeRelation_ProductList(sq: ProductCQ): String =
    { return _myCQ.keepProductCategoryCode_InScopeRelation_ProductList(sq); }
    def keepProductCategoryCode_InScopeRelation_ProductCategorySelfList(sq: ProductCategoryCQ): String =
    { return _myCQ.keepProductCategoryCode_InScopeRelation_ProductCategorySelfList(sq); }
    def keepProductCategoryCode_NotInScopeRelation_ProductList(sq: ProductCQ): String =
    { return _myCQ.keepProductCategoryCode_NotInScopeRelation_ProductList(sq); }
    def keepProductCategoryCode_NotInScopeRelation_ProductCategorySelfList(sq: ProductCategoryCQ): String =
    { return _myCQ.keepProductCategoryCode_NotInScopeRelation_ProductCategorySelfList(sq); }
    def keepProductCategoryCode_SpecifyDerivedReferrer_ProductList(sq: ProductCQ): String =
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    def keepProductCategoryCode_SpecifyDerivedReferrer_ProductCategorySelfList(sq: ProductCategoryCQ): String =
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    def keepProductCategoryCode_QueryDerivedReferrer_ProductList(sq: ProductCQ): String =
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    def keepProductCategoryCode_QueryDerivedReferrer_ProductListParameter(vl: Object): String =
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    def keepProductCategoryCode_QueryDerivedReferrer_ProductCategorySelfList(sq: ProductCategoryCQ): String =
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    def keepProductCategoryCode_QueryDerivedReferrer_ProductCategorySelfListParameter(vl: Object): String =
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected def getCValueProductCategoryName(): ConditionValue = { return _myCQ.getProductCategoryName(); }
    protected def getCValueParentCategoryCode(): ConditionValue = { return _myCQ.getParentCategoryCode(); }
    protected def xfindFixedConditionDynamicParameterMap(pp: String): Map[String, Object] = { return null; }
    def keepScalarCondition(sq: ProductCategoryCQ): String =
    { throwIICBOE("ScalarCondition"); return null; }
    def keepSpecifyMyselfDerived(sq: ProductCategoryCQ): String =
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    def keepQueryMyselfDerived(sq: ProductCategoryCQ): String =
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    def keepQueryMyselfDerivedParameter(vl: Object): String =
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    def keepMyselfExists(sq: ProductCategoryCQ): String =
    { throwIICBOE("MyselfExists"); return null;}
    def keepMyselfInScope(sq: ProductCategoryCQ): String =
    { throwIICBOE("MyselfInScope"); return null;}

    protected def throwIICBOE(name: String): Unit =
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected def xinCB(): String = { return classOf[ProductCategoryCB].getName(); }
    protected def xinCQ(): String = { return classOf[ProductCategoryCQ].getName(); }
}
