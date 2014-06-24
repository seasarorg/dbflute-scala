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
    def keepMemberId_ExistsReferrer_MemberAddressList(sq: MemberAddressCQ): String =
    { throwIICBOE("ExistsReferrer"); return null; }
    def keepMemberId_ExistsReferrer_MemberFollowingByMyMemberIdList(sq: MemberFollowingCQ): String =
    { throwIICBOE("ExistsReferrer"); return null; }
    def keepMemberId_ExistsReferrer_MemberFollowingByYourMemberIdList(sq: MemberFollowingCQ): String =
    { throwIICBOE("ExistsReferrer"); return null; }
    def keepMemberId_ExistsReferrer_MemberLoginList(sq: MemberLoginCQ): String =
    { throwIICBOE("ExistsReferrer"); return null; }
    def keepMemberId_ExistsReferrer_PurchaseList(sq: PurchaseCQ): String =
    { throwIICBOE("ExistsReferrer"); return null; }
    def keepMemberId_NotExistsReferrer_MemberAddressList(sq: MemberAddressCQ): String =
    { throwIICBOE("NotExistsReferrer"); return null; }
    def keepMemberId_NotExistsReferrer_MemberFollowingByMyMemberIdList(sq: MemberFollowingCQ): String =
    { throwIICBOE("NotExistsReferrer"); return null; }
    def keepMemberId_NotExistsReferrer_MemberFollowingByYourMemberIdList(sq: MemberFollowingCQ): String =
    { throwIICBOE("NotExistsReferrer"); return null; }
    def keepMemberId_NotExistsReferrer_MemberLoginList(sq: MemberLoginCQ): String =
    { throwIICBOE("NotExistsReferrer"); return null; }
    def keepMemberId_NotExistsReferrer_PurchaseList(sq: PurchaseCQ): String =
    { throwIICBOE("NotExistsReferrer"); return null; }
    def keepMemberId_InScopeRelation_MemberAddressList(sq: MemberAddressCQ): String =
    { return _myCQ.keepMemberId_InScopeRelation_MemberAddressList(sq); }
    def keepMemberId_InScopeRelation_MemberFollowingByMyMemberIdList(sq: MemberFollowingCQ): String =
    { return _myCQ.keepMemberId_InScopeRelation_MemberFollowingByMyMemberIdList(sq); }
    def keepMemberId_InScopeRelation_MemberFollowingByYourMemberIdList(sq: MemberFollowingCQ): String =
    { return _myCQ.keepMemberId_InScopeRelation_MemberFollowingByYourMemberIdList(sq); }
    def keepMemberId_InScopeRelation_MemberLoginList(sq: MemberLoginCQ): String =
    { return _myCQ.keepMemberId_InScopeRelation_MemberLoginList(sq); }
    def keepMemberId_InScopeRelation_PurchaseList(sq: PurchaseCQ): String =
    { return _myCQ.keepMemberId_InScopeRelation_PurchaseList(sq); }
    def keepMemberId_NotInScopeRelation_MemberAddressList(sq: MemberAddressCQ): String =
    { return _myCQ.keepMemberId_NotInScopeRelation_MemberAddressList(sq); }
    def keepMemberId_NotInScopeRelation_MemberFollowingByMyMemberIdList(sq: MemberFollowingCQ): String =
    { return _myCQ.keepMemberId_NotInScopeRelation_MemberFollowingByMyMemberIdList(sq); }
    def keepMemberId_NotInScopeRelation_MemberFollowingByYourMemberIdList(sq: MemberFollowingCQ): String =
    { return _myCQ.keepMemberId_NotInScopeRelation_MemberFollowingByYourMemberIdList(sq); }
    def keepMemberId_NotInScopeRelation_MemberLoginList(sq: MemberLoginCQ): String =
    { return _myCQ.keepMemberId_NotInScopeRelation_MemberLoginList(sq); }
    def keepMemberId_NotInScopeRelation_PurchaseList(sq: PurchaseCQ): String =
    { return _myCQ.keepMemberId_NotInScopeRelation_PurchaseList(sq); }
    def keepMemberId_SpecifyDerivedReferrer_MemberAddressList(sq: MemberAddressCQ): String =
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    def keepMemberId_SpecifyDerivedReferrer_MemberFollowingByMyMemberIdList(sq: MemberFollowingCQ): String =
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    def keepMemberId_SpecifyDerivedReferrer_MemberFollowingByYourMemberIdList(sq: MemberFollowingCQ): String =
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    def keepMemberId_SpecifyDerivedReferrer_MemberLoginList(sq: MemberLoginCQ): String =
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    def keepMemberId_SpecifyDerivedReferrer_PurchaseList(sq: PurchaseCQ): String =
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    def keepMemberId_QueryDerivedReferrer_MemberAddressList(sq: MemberAddressCQ): String =
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    def keepMemberId_QueryDerivedReferrer_MemberAddressListParameter(vl: Object): String =
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    def keepMemberId_QueryDerivedReferrer_MemberFollowingByMyMemberIdList(sq: MemberFollowingCQ): String =
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    def keepMemberId_QueryDerivedReferrer_MemberFollowingByMyMemberIdListParameter(vl: Object): String =
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    def keepMemberId_QueryDerivedReferrer_MemberFollowingByYourMemberIdList(sq: MemberFollowingCQ): String =
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    def keepMemberId_QueryDerivedReferrer_MemberFollowingByYourMemberIdListParameter(vl: Object): String =
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    def keepMemberId_QueryDerivedReferrer_MemberLoginList(sq: MemberLoginCQ): String =
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    def keepMemberId_QueryDerivedReferrer_MemberLoginListParameter(vl: Object): String =
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    def keepMemberId_QueryDerivedReferrer_PurchaseList(sq: PurchaseCQ): String =
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    def keepMemberId_QueryDerivedReferrer_PurchaseListParameter(vl: Object): String =
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
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

    protected def throwIICBOE(name: String): Unit =
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected def xinCB(): String = { return classOf[MemberCB].getName(); }
    protected def xinCQ(): String = { return classOf[MemberCQ].getName(); }
}
