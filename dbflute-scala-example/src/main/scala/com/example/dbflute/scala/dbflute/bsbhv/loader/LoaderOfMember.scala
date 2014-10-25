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
 * The referrer loader of (会員)MEMBER as TABLE. <br />
 * <pre>
 * [primary key]
 *     MEMBER_ID
 *
 * [column]
 *     MEMBER_ID, MEMBER_NAME, MEMBER_ACCOUNT, MEMBER_STATUS_CODE, FORMALIZED_DATETIME, BIRTHDATE, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MEMBER_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     MEMBER_STATUS, MEMBER_SECURITY(AsOne), MEMBER_SERVICE(AsOne), MEMBER_WITHDRAWAL(AsOne)
 *
 * [referrer table]
 *     MEMBER_ADDRESS, MEMBER_FOLLOWING, MEMBER_LOGIN, PURCHASE, MEMBER_SECURITY, MEMBER_SERVICE, MEMBER_WITHDRAWAL
 *
 * [foreign property]
 *     memberStatus, memberSecurityAsOne, memberServiceAsOne, memberWithdrawalAsOne
 *
 * [referrer property]
 *     memberAddressList, memberFollowingByMyMemberIdList, memberFollowingByYourMemberIdList, memberLoginList, purchaseList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
class LoaderOfMember {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected var _selectedList: List[DbleMember] = null;
    protected var _selector: BehaviorSelector = null;
    protected var _myBhv: MemberBhv = null; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    def ready(selectedList: List[DbleMember], selector: BehaviorSelector): LoaderOfMember =
    { _selectedList = selectedList; _selector = selector; return this; }

    protected def myBhv: MemberBhv =
    { if (_myBhv != null) { _myBhv } else { _myBhv = _selector.select(classOf[MemberBhv]); _myBhv } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected var _referrerMemberAddressList: List[DbleMemberAddress] = null;
    def loadMemberAddressList(cbCall: (MemberAddressCB) => Unit): ScrNestedReferrerLoaderGateway[LoaderOfMemberAddress] = {
        myBhv.loadMemberAddressList(_selectedList, cbCall).withNestedReferrer(new ReferrerListHandler[DbleMemberAddress]() {
            def handle(referrerList: List[DbleMemberAddress]): Unit = { _referrerMemberAddressList = referrerList; }
        });
        return createNested(() => { new LoaderOfMemberAddress().ready(_referrerMemberAddressList, _selector); });
    }

    protected var _referrerMemberFollowingByMyMemberIdList: List[DbleMemberFollowing] = null;
    def loadMemberFollowingByMyMemberIdList(cbCall: (MemberFollowingCB) => Unit): ScrNestedReferrerLoaderGateway[LoaderOfMemberFollowing] = {
        myBhv.loadMemberFollowingByMyMemberIdList(_selectedList, cbCall).withNestedReferrer(new ReferrerListHandler[DbleMemberFollowing]() {
            def handle(referrerList: List[DbleMemberFollowing]): Unit = { _referrerMemberFollowingByMyMemberIdList = referrerList; }
        });
        return createNested(() => { new LoaderOfMemberFollowing().ready(_referrerMemberFollowingByMyMemberIdList, _selector); });
    }

    protected var _referrerMemberFollowingByYourMemberIdList: List[DbleMemberFollowing] = null;
    def loadMemberFollowingByYourMemberIdList(cbCall: (MemberFollowingCB) => Unit): ScrNestedReferrerLoaderGateway[LoaderOfMemberFollowing] = {
        myBhv.loadMemberFollowingByYourMemberIdList(_selectedList, cbCall).withNestedReferrer(new ReferrerListHandler[DbleMemberFollowing]() {
            def handle(referrerList: List[DbleMemberFollowing]): Unit = { _referrerMemberFollowingByYourMemberIdList = referrerList; }
        });
        return createNested(() => { new LoaderOfMemberFollowing().ready(_referrerMemberFollowingByYourMemberIdList, _selector); });
    }

    protected var _referrerMemberLoginList: List[DbleMemberLogin] = null;
    def loadMemberLoginList(cbCall: (MemberLoginCB) => Unit): ScrNestedReferrerLoaderGateway[LoaderOfMemberLogin] = {
        myBhv.loadMemberLoginList(_selectedList, cbCall).withNestedReferrer(new ReferrerListHandler[DbleMemberLogin]() {
            def handle(referrerList: List[DbleMemberLogin]): Unit = { _referrerMemberLoginList = referrerList; }
        });
        return createNested(() => { new LoaderOfMemberLogin().ready(_referrerMemberLoginList, _selector); });
    }

    protected var _referrerPurchaseList: List[DblePurchase] = null;
    def loadPurchaseList(cbCall: (PurchaseCB) => Unit): ScrNestedReferrerLoaderGateway[LoaderOfPurchase] = {
        myBhv.loadPurchaseList(_selectedList, cbCall).withNestedReferrer(new ReferrerListHandler[DblePurchase]() {
            def handle(referrerList: List[DblePurchase]): Unit = { _referrerPurchaseList = referrerList; }
        });
        return createNested(() => { new LoaderOfPurchase().ready(_referrerPurchaseList, _selector); });
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected var _foreignMemberStatusLoader: LoaderOfMemberStatus = null;
    def pulloutMemberStatus(): LoaderOfMemberStatus = {
        if (_foreignMemberStatusLoader != null) { return _foreignMemberStatusLoader; }
        val pulledList = myBhv.pulloutMemberStatus(toScalaList(_selectedList).map(new Member(_))).map(new DbleMemberStatus().acceptImmutable(_)).asJava;
        _foreignMemberStatusLoader = new LoaderOfMemberStatus().ready(pulledList, _selector);
        return _foreignMemberStatusLoader;
    }

    protected var _foreignMemberSecurityAsOneLoader: LoaderOfMemberSecurity = null;
    def pulloutMemberSecurityAsOne(): LoaderOfMemberSecurity = {
        if (_foreignMemberSecurityAsOneLoader != null) { return _foreignMemberSecurityAsOneLoader; }
        val pulledList = myBhv.pulloutMemberSecurityAsOne(toScalaList(_selectedList).map(new Member(_))).map(new DbleMemberSecurity().acceptImmutable(_)).asJava;
        _foreignMemberSecurityAsOneLoader = new LoaderOfMemberSecurity().ready(pulledList, _selector);
        return _foreignMemberSecurityAsOneLoader;
    }

    protected var _foreignMemberServiceAsOneLoader: LoaderOfMemberService = null;
    def pulloutMemberServiceAsOne(): LoaderOfMemberService = {
        if (_foreignMemberServiceAsOneLoader != null) { return _foreignMemberServiceAsOneLoader; }
        val pulledList = myBhv.pulloutMemberServiceAsOne(toScalaList(_selectedList).map(new Member(_))).map(new DbleMemberService().acceptImmutable(_)).asJava;
        _foreignMemberServiceAsOneLoader = new LoaderOfMemberService().ready(pulledList, _selector);
        return _foreignMemberServiceAsOneLoader;
    }

    protected var _foreignMemberWithdrawalAsOneLoader: LoaderOfMemberWithdrawal = null;
    def pulloutMemberWithdrawalAsOne(): LoaderOfMemberWithdrawal = {
        if (_foreignMemberWithdrawalAsOneLoader != null) { return _foreignMemberWithdrawalAsOneLoader; }
        val pulledList = myBhv.pulloutMemberWithdrawalAsOne(toScalaList(_selectedList).map(new Member(_))).map(new DbleMemberWithdrawal().acceptImmutable(_)).asJava;
        _foreignMemberWithdrawalAsOneLoader = new LoaderOfMemberWithdrawal().ready(pulledList, _selector);
        return _foreignMemberWithdrawalAsOneLoader;
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
    def selectedList: List[DbleMember] = { _selectedList }
    def selector: BehaviorSelector = { _selector }
}
