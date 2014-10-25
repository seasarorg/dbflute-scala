package com.example.dbflute.scala.dbflute.bsbhv.loader;

import scala.collection.immutable;
import scala.collection.JavaConverters._;

import java.util.Collection;
import java.util.List;

import org.seasar.dbflute._;
import com.example.dbflute.scala.dbflute.allcommon._;
import com.example.dbflute.scala.dbflute.exbhv._;
import com.example.dbflute.scala.dbflute.exentity._;

/**
 * The referrer loader of (会員退会情報)MEMBER_WITHDRAWAL as TABLE. <br />
 * <pre>
 * [primary key]
 *     MEMBER_ID
 *
 * [column]
 *     MEMBER_ID, WITHDRAWAL_REASON_CODE, WITHDRAWAL_REASON_INPUT_TEXT, WITHDRAWAL_DATETIME, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     MEMBER, WITHDRAWAL_REASON
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     member, withdrawalReason
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
class LoaderOfMemberWithdrawal {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected var _selectedList: List[DbleMemberWithdrawal] = null;
    protected var _selector: BehaviorSelector = null;
    protected var _myBhv: MemberWithdrawalBhv = null; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    def ready(selectedList: List[DbleMemberWithdrawal], selector: BehaviorSelector): LoaderOfMemberWithdrawal =
    { _selectedList = selectedList; _selector = selector; return this; }

    protected def myBhv: MemberWithdrawalBhv =
    { if (_myBhv != null) { _myBhv } else { _myBhv = _selector.select(classOf[MemberWithdrawalBhv]); _myBhv } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected var _foreignMemberLoader: LoaderOfMember = null;
    def pulloutMember(): LoaderOfMember = {
        if (_foreignMemberLoader != null) { return _foreignMemberLoader; }
        val pulledList = myBhv.pulloutMember(toScalaList(_selectedList).map(new MemberWithdrawal(_))).map(new DbleMember().acceptImmutable(_)).asJava;
        _foreignMemberLoader = new LoaderOfMember().ready(pulledList, _selector);
        return _foreignMemberLoader;
    }

    protected var _foreignWithdrawalReasonLoader: LoaderOfWithdrawalReason = null;
    def pulloutWithdrawalReason(): LoaderOfWithdrawalReason = {
        if (_foreignWithdrawalReasonLoader != null) { return _foreignWithdrawalReasonLoader; }
        val pulledList = myBhv.pulloutWithdrawalReason(toScalaList(_selectedList).map(new MemberWithdrawal(_))).map(new DbleWithdrawalReason().acceptImmutable(_)).asJava;
        _foreignWithdrawalReasonLoader = new LoaderOfWithdrawalReason().ready(pulledList, _selector);
        return _foreignWithdrawalReasonLoader;
    }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    protected def createNested[LOADER](loaderCall: () => LOADER): ScrNestedReferrerLoaderGateway[LOADER] =
    { return new ScrNestedReferrerLoaderGateway[LOADER](loaderCall); }

    protected def toScalaList[ENTITY](javaList: Collection[ENTITY]): immutable.List[ENTITY] = {
        if (javaList == null) { immutable.List() }
        return javaList.toArray.toList.asInstanceOf[immutable.List[ENTITY]];
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    def selectedList: List[DbleMemberWithdrawal] = { _selectedList }
    def selector: BehaviorSelector = { _selector }
}
