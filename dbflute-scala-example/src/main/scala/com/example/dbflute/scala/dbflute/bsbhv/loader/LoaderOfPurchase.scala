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
 * The referrer loader of (購入)PURCHASE as TABLE. <br />
 * <pre>
 * [primary key]
 *     PURCHASE_ID
 *
 * [column]
 *     PURCHASE_ID, MEMBER_ID, PRODUCT_ID, PURCHASE_DATETIME, PURCHASE_COUNT, PURCHASE_PRICE, PAYMENT_COMPLETE_FLG, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PURCHASE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     MEMBER, PRODUCT
 *
 * [referrer table]
 *     PURCHASE_PAYMENT
 *
 * [foreign property]
 *     member, product
 *
 * [referrer property]
 *     purchasePaymentList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
class LoaderOfPurchase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected var _selectedList: List[DblePurchase] = null;
    protected var _selector: BehaviorSelector = null;
    protected var _myBhv: PurchaseBhv = null; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    def ready(selectedList: List[DblePurchase], selector: BehaviorSelector): LoaderOfPurchase =
    { _selectedList = selectedList; _selector = selector; return this; }

    protected def myBhv: PurchaseBhv =
    { if (_myBhv != null) { _myBhv } else { _myBhv = _selector.select(classOf[PurchaseBhv]); _myBhv } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected var _referrerPurchasePaymentList: List[DblePurchasePayment] = null;
    def loadPurchasePaymentList(cbCall: (PurchasePaymentCB) => Unit): ScrNestedReferrerLoaderGateway[LoaderOfPurchasePayment] = {
        myBhv.loadPurchasePaymentList(_selectedList, cbCall).withNestedReferrer(new ReferrerListHandler[DblePurchasePayment]() {
            def handle(referrerList: List[DblePurchasePayment]): Unit = { _referrerPurchasePaymentList = referrerList; }
        });
        return createNested(() => { new LoaderOfPurchasePayment().ready(_referrerPurchasePaymentList, _selector); });
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected var _foreignMemberLoader: LoaderOfMember = null;
    def pulloutMember(): LoaderOfMember = {
        if (_foreignMemberLoader != null) { return _foreignMemberLoader; }
        val pulledList = myBhv.pulloutMember(toScalaList(_selectedList).map(new Purchase(_))).map(new DbleMember().acceptImmutable(_)).asJava;
        _foreignMemberLoader = new LoaderOfMember().ready(pulledList, _selector);
        return _foreignMemberLoader;
    }

    protected var _foreignProductLoader: LoaderOfProduct = null;
    def pulloutProduct(): LoaderOfProduct = {
        if (_foreignProductLoader != null) { return _foreignProductLoader; }
        val pulledList = myBhv.pulloutProduct(toScalaList(_selectedList).map(new Purchase(_))).map(new DbleProduct().acceptImmutable(_)).asJava;
        _foreignProductLoader = new LoaderOfProduct().ready(pulledList, _selector);
        return _foreignProductLoader;
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
    def selectedList: List[DblePurchase] = { _selectedList }
    def selector: BehaviorSelector = { _selector }
}
