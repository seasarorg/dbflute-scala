package com.example.dbflute.scala.dbflute.bsbhv.loader;

import scala.collection.immutable;
import scala.collection.JavaConverters._;

import java.util.Collection;
import java.util.List;

import org.seasar.dbflute._;
import org.seasar.dbflute.bhv._;
import com.example.dbflute.scala.dbflute.allcommon._;
import com.example.dbflute.scala.dbflute.exbhv._;
import com.example.dbflute.scala.dbflute.exentity._;
import com.example.dbflute.scala.dbflute.cbean._;

/**
 * The referrer loader of (退会理由)WITHDRAWAL_REASON as TABLE. <br />
 * <pre>
 * [primary key]
 *     WITHDRAWAL_REASON_CODE
 *
 * [column]
 *     WITHDRAWAL_REASON_CODE, WITHDRAWAL_REASON_TEXT, DISPLAY_ORDER
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     MEMBER_WITHDRAWAL
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     memberWithdrawalList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
class LoaderOfWithdrawalReason {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected var _selectedList: List[DbleWithdrawalReason] = null;
    protected var _selector: BehaviorSelector = null;
    protected var _myBhv: WithdrawalReasonBhv = null; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    def ready(selectedList: List[DbleWithdrawalReason], selector: BehaviorSelector): LoaderOfWithdrawalReason =
    { _selectedList = selectedList; _selector = selector; return this; }

    protected def myBhv: WithdrawalReasonBhv =
    { if (_myBhv != null) { _myBhv } else { _myBhv = _selector.select(classOf[WithdrawalReasonBhv]); _myBhv } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected var _referrerMemberWithdrawalList: List[DbleMemberWithdrawal] = null;
    def loadMemberWithdrawalList(cbCall: (MemberWithdrawalCB) => Unit): ScrNestedReferrerLoaderGateway[LoaderOfMemberWithdrawal] = {
        myBhv.loadMemberWithdrawalList(_selectedList, cbCall).withNestedReferrer(new ReferrerListHandler[DbleMemberWithdrawal]() {
            def handle(referrerList: List[DbleMemberWithdrawal]): Unit = { _referrerMemberWithdrawalList = referrerList; }
        });
        return createNested(() => { new LoaderOfMemberWithdrawal().ready(_referrerMemberWithdrawalList, _selector); });
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
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
    def selectedList: List[DbleWithdrawalReason] = { _selectedList }
    def selector: BehaviorSelector = { _selector }
}
