package com.example.dbflute.scala.dbflute.bsbhv.loader;

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
 *     MEMBER_STATUS, MEMBER_SERVICE(AsOne)
 *
 * [referrer table]
 *     PURCHASE, MEMBER_SERVICE
 *
 * [foreign property]
 *     memberStatus, memberServiceAsOne
 *
 * [referrer property]
 *     purchaseList
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

    protected var _foreignMemberServiceAsOneLoader: LoaderOfMemberService = null;
    def pulloutMemberServiceAsOne(): LoaderOfMemberService = {
        if (_foreignMemberServiceAsOneLoader != null) { return _foreignMemberServiceAsOneLoader; }
        val pulledList = myBhv.pulloutMemberServiceAsOne(toScalaList(_selectedList).map(new Member(_))).map(new DbleMemberService().acceptImmutable(_)).asJava;
        _foreignMemberServiceAsOneLoader = new LoaderOfMemberService().ready(pulledList, _selector);
        return _foreignMemberServiceAsOneLoader;
    }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    protected def createNested[LOADER](loaderCall: () => LOADER): ScrNestedReferrerLoaderGateway[LOADER] =
    { return new ScrNestedReferrerLoaderGateway[LOADER](loaderCall); }

    protected def toScalaList[ENTITY](javaList: Collection[ENTITY]): scala.collection.immutable.List[ENTITY] = {
        if (javaList == null) { scala.collection.immutable.List() }
        return scala.collection.immutable.List.fromArray(javaList.toArray()).asInstanceOf[scala.collection.immutable.List[ENTITY]];
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    def selectedList: List[DbleMember] = { _selectedList }
    def selector: BehaviorSelector = { _selector }
}
