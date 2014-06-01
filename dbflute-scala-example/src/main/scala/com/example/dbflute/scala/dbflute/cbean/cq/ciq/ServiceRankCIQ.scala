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
 * The condition-query for in-line of SERVICE_RANK.
 * @author DBFlute(AutoGenerator)
 */
class ServiceRankCIQ(childQuery: ConditionQuery, sqlClause: SqlClause, aliasName: String, nestLevel: Integer, myCQ: BsServiceRankCQ)
        extends AbstractBsServiceRankCQ(childQuery, sqlClause, aliasName, nestLevel) {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected var _myCQ: BsServiceRankCQ = null;

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
    protected def getCValueServiceRankCode(): ConditionValue = { return _myCQ.getServiceRankCode(); }
    def keepServiceRankCode_ExistsReferrer_MemberServiceList(sq: MemberServiceCQ): String =
    { throwIICBOE("ExistsReferrer"); return null; }
    def keepServiceRankCode_NotExistsReferrer_MemberServiceList(sq: MemberServiceCQ): String =
    { throwIICBOE("NotExistsReferrer"); return null; }
    def keepServiceRankCode_InScopeRelation_MemberServiceList(sq: MemberServiceCQ): String =
    { return _myCQ.keepServiceRankCode_InScopeRelation_MemberServiceList(sq); }
    def keepServiceRankCode_NotInScopeRelation_MemberServiceList(sq: MemberServiceCQ): String =
    { return _myCQ.keepServiceRankCode_NotInScopeRelation_MemberServiceList(sq); }
    def keepServiceRankCode_SpecifyDerivedReferrer_MemberServiceList(sq: MemberServiceCQ): String =
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    def keepServiceRankCode_QueryDerivedReferrer_MemberServiceList(sq: MemberServiceCQ): String =
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    def keepServiceRankCode_QueryDerivedReferrer_MemberServiceListParameter(vl: Object): String =
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected def getCValueServiceRankName(): ConditionValue = { return _myCQ.getServiceRankName(); }
    protected def getCValueServicePointIncidence(): ConditionValue = { return _myCQ.getServicePointIncidence(); }
    protected def getCValueNewAcceptableFlg(): ConditionValue = { return _myCQ.getNewAcceptableFlg(); }
    protected def getCValueDescription(): ConditionValue = { return _myCQ.getDescription(); }
    protected def getCValueDisplayOrder(): ConditionValue = { return _myCQ.getDisplayOrder(); }
    protected def xfindFixedConditionDynamicParameterMap(pp: String): Map[String, Object] = { return null; }
    def keepScalarCondition(sq: ServiceRankCQ): String =
    { throwIICBOE("ScalarCondition"); return null; }
    def keepSpecifyMyselfDerived(sq: ServiceRankCQ): String =
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    def keepQueryMyselfDerived(sq: ServiceRankCQ): String =
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    def keepQueryMyselfDerivedParameter(vl: Object): String =
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    def keepMyselfExists(sq: ServiceRankCQ): String =
    { throwIICBOE("MyselfExists"); return null;}
    def keepMyselfInScope(sq: ServiceRankCQ): String =
    { throwIICBOE("MyselfInScope"); return null;}

    protected def throwIICBOE(name: String): Unit =
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected def xinCB(): String = { return classOf[ServiceRankCB].getName(); }
    protected def xinCQ(): String = { return classOf[ServiceRankCQ].getName(); }
}
