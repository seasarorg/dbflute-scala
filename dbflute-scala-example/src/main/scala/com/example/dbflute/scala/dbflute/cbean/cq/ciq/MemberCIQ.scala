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
 * The condition-query for in-line of MEMBER.
 * @author DBFlute(AutoGenerator)
 */
class MemberCIQ(childQuery: ConditionQuery, sqlClause: SqlClause, aliasName: String, nestLevel: Integer, myCQ: BsMemberCQ)
        extends AbstractBsMemberCQ(childQuery, sqlClause, aliasName, nestLevel) {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected var _myCQ: BsMemberCQ = null;

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
    @Override
    protected def reflectRelationOnUnionQuery(bq: ConditionQuery, uq: ConditionQuery): Unit = {
        val msg: String = "InlineView must not need UNION method: " + bq + " : " + uq;
        throw new IllegalConditionBeanOperationException(msg);
    }

    @Override
    protected def setupConditionValueAndRegisterWhereClause(k: ConditionKey, v: Object, cv: ConditionValue, col: String): Unit = {
        regIQ(k, v, cv, col);
    }

    @Override
    protected def setupConditionValueAndRegisterWhereClause(k: ConditionKey, v: Object, cv: ConditionValue, col: String, op: ConditionOption): Unit = {
        regIQ(k, v, cv, col, op);
    }

    @Override
    protected def registerWhereClause(wc: String): Unit = {
        registerInlineWhereClause(wc);
    }

    @Override
    protected def isInScopeRelationSuppressLocalAliasName(): Boolean = {
        if (_onClause) {
            throw new IllegalConditionBeanOperationException("InScopeRelation on OnClause is unsupported.");
        }
        return true;
    }

    // ===================================================================================
    //                                                                Override about Query
    //                                                                ====================
    protected def getCValueMemberId(): ConditionValue = { return _myCQ.getMemberId(); }
    protected def getCValueMemberName(): ConditionValue = { return _myCQ.getMemberName(); }
    protected def getCValueMemberAccount(): ConditionValue = { return _myCQ.getMemberAccount(); }
    protected def getCValueMemberStatusCode(): ConditionValue = { return _myCQ.getMemberStatusCode(); }
    protected def getCValueFormalizedDatetime(): ConditionValue = { return _myCQ.getFormalizedDatetime(); }
    protected def getCValueBirthdate(): ConditionValue = { return _myCQ.getBirthdate(); }
    protected def getCValueRegisterDatetime(): ConditionValue = { return _myCQ.getRegisterDatetime(); }
    protected def getCValueRegisterUser(): ConditionValue = { return _myCQ.getRegisterUser(); }
    protected def getCValueUpdateDatetime(): ConditionValue = { return _myCQ.getUpdateDatetime(); }
    protected def getCValueUpdateUser(): ConditionValue = { return _myCQ.getUpdateUser(); }
    protected def getCValueVersionNo(): ConditionValue = { return _myCQ.getVersionNo(); }
    protected def xfindFixedConditionDynamicParameterMap(pp: String): Map[String, Object] = { return null; }
    def keepScalarCondition(sq: MemberCQ): String =
    { throwIICBOE("ScalarCondition"); return null; }
    def keepSpecifyMyselfDerived(sq: MemberCQ): String =
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    def keepQueryMyselfDerived(sq: MemberCQ): String =
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    def keepQueryMyselfDerivedParameter(vl: Object): String =
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    def keepMyselfExists(sq: MemberCQ): String =
    { throwIICBOE("MyselfExists"); return null;}
    def keepMyselfInScope(sq: MemberCQ): String =
    { throwIICBOE("MyselfInScope"); return null;}

    protected def throwIICBOE(name: String): Unit = { // throwInlineIllegalConditionBeanOperationException()
        throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported.");
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected def xinCB(): String = { return classOf[MemberCB].getName(); }
    protected def xinCQ(): String = { return classOf[MemberCQ].getName(); }
}
