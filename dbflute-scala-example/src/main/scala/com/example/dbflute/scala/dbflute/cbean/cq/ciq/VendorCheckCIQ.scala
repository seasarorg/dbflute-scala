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
 * The condition-query for in-line of VENDOR_CHECK.
 * @author DBFlute(AutoGenerator)
 */
class VendorCheckCIQ(childQuery: ConditionQuery, sqlClause: SqlClause, aliasName: String, nestLevel: Integer, myCQ: BsVendorCheckCQ)
        extends AbstractBsVendorCheckCQ(childQuery, sqlClause, aliasName, nestLevel) {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected var _myCQ: BsVendorCheckCQ = null;

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
    protected def getCValueVendorCheckId(): ConditionValue = { return _myCQ.getVendorCheckId(); }
    protected def getCValueTypeOfChar(): ConditionValue = { return _myCQ.getTypeOfChar(); }
    protected def getCValueTypeOfVarchar(): ConditionValue = { return _myCQ.getTypeOfVarchar(); }
    protected def getCValueTypeOfClob(): ConditionValue = { return _myCQ.getTypeOfClob(); }
    protected def getCValueTypeOfText(): ConditionValue = { return _myCQ.getTypeOfText(); }
    protected def getCValueTypeOfNumericInteger(): ConditionValue = { return _myCQ.getTypeOfNumericInteger(); }
    protected def getCValueTypeOfNumericBigint(): ConditionValue = { return _myCQ.getTypeOfNumericBigint(); }
    protected def getCValueTypeOfNumericDecimal(): ConditionValue = { return _myCQ.getTypeOfNumericDecimal(); }
    protected def getCValueTypeOfNumericIntegerMin(): ConditionValue = { return _myCQ.getTypeOfNumericIntegerMin(); }
    protected def getCValueTypeOfNumericIntegerMax(): ConditionValue = { return _myCQ.getTypeOfNumericIntegerMax(); }
    protected def getCValueTypeOfNumericBigintMin(): ConditionValue = { return _myCQ.getTypeOfNumericBigintMin(); }
    protected def getCValueTypeOfNumericBigintMax(): ConditionValue = { return _myCQ.getTypeOfNumericBigintMax(); }
    protected def getCValueTypeOfNumericSuperintMin(): ConditionValue = { return _myCQ.getTypeOfNumericSuperintMin(); }
    protected def getCValueTypeOfNumericSuperintMax(): ConditionValue = { return _myCQ.getTypeOfNumericSuperintMax(); }
    protected def getCValueTypeOfNumericMaxdecimal(): ConditionValue = { return _myCQ.getTypeOfNumericMaxdecimal(); }
    protected def getCValueTypeOfInteger(): ConditionValue = { return _myCQ.getTypeOfInteger(); }
    protected def getCValueTypeOfBigint(): ConditionValue = { return _myCQ.getTypeOfBigint(); }
    protected def getCValueTypeOfDate(): ConditionValue = { return _myCQ.getTypeOfDate(); }
    protected def getCValueTypeOfTimestamp(): ConditionValue = { return _myCQ.getTypeOfTimestamp(); }
    protected def getCValueTypeOfTime(): ConditionValue = { return _myCQ.getTypeOfTime(); }
    protected def getCValueTypeOfBoolean(): ConditionValue = { return _myCQ.getTypeOfBoolean(); }
    protected def getCValueTypeOfBinary(): ConditionValue = { return _myCQ.getTypeOfBinary(); }
    protected def getCValueTypeOfBlob(): ConditionValue = { return _myCQ.getTypeOfBlob(); }
    protected def getCValueTypeOfUuid(): ConditionValue = { return _myCQ.getTypeOfUuid(); }
    protected def getCValueTypeOfArray(): ConditionValue = { return _myCQ.getTypeOfArray(); }
    protected def getCValueTypeOfOther(): ConditionValue = { return _myCQ.getTypeOfOther(); }
    protected def getCValueJAVABeansProperty(): ConditionValue = { return _myCQ.getJAVABeansProperty(); }
    protected def getCValueJPopBeansProperty(): ConditionValue = { return _myCQ.getJPopBeansProperty(); }
    protected def xfindFixedConditionDynamicParameterMap(pp: String): Map[String, Object] = { return null; }
    def keepScalarCondition(sq: VendorCheckCQ): String =
    { throwIICBOE("ScalarCondition"); return null; }
    def keepSpecifyMyselfDerived(sq: VendorCheckCQ): String =
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    def keepQueryMyselfDerived(sq: VendorCheckCQ): String =
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    def keepQueryMyselfDerivedParameter(vl: Object): String =
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    def keepMyselfExists(sq: VendorCheckCQ): String =
    { throwIICBOE("MyselfExists"); return null;}
    def keepMyselfInScope(sq: VendorCheckCQ): String =
    { throwIICBOE("MyselfInScope"); return null;}

    protected def throwIICBOE(name: String): Unit =
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected def xinCB(): String = { return classOf[VendorCheckCB].getName(); }
    protected def xinCQ(): String = { return classOf[VendorCheckCQ].getName(); }
}
