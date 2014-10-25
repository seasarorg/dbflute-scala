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
 * The referrer loader of (購入支払)PURCHASE_PAYMENT as TABLE. <br />
 * <pre>
 * [primary key]
 *     PURCHASE_PAYMENT_ID
 *
 * [column]
 *     PURCHASE_PAYMENT_ID, PURCHASE_ID, PAYMENT_AMOUNT, PAYMENT_DATETIME, PAYMENT_METHOD_CODE, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PURCHASE_PAYMENT_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     PURCHASE
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     purchase
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
class LoaderOfPurchasePayment {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected var _selectedList: List[DblePurchasePayment] = null;
    protected var _selector: BehaviorSelector = null;
    protected var _myBhv: PurchasePaymentBhv = null; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    def ready(selectedList: List[DblePurchasePayment], selector: BehaviorSelector): LoaderOfPurchasePayment =
    { _selectedList = selectedList; _selector = selector; return this; }

    protected def myBhv: PurchasePaymentBhv =
    { if (_myBhv != null) { _myBhv } else { _myBhv = _selector.select(classOf[PurchasePaymentBhv]); _myBhv } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected var _foreignPurchaseLoader: LoaderOfPurchase = null;
    def pulloutPurchase(): LoaderOfPurchase = {
        if (_foreignPurchaseLoader != null) { return _foreignPurchaseLoader; }
        val pulledList = myBhv.pulloutPurchase(toScalaList(_selectedList).map(new PurchasePayment(_))).map(new DblePurchase().acceptImmutable(_)).asJava;
        _foreignPurchaseLoader = new LoaderOfPurchase().ready(pulledList, _selector);
        return _foreignPurchaseLoader;
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
    def selectedList: List[DblePurchasePayment] = { _selectedList }
    def selector: BehaviorSelector = { _selector }
}
