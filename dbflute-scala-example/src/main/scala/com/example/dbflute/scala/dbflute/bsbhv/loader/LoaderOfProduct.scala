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
 * The referrer loader of (商品)PRODUCT as TABLE. <br />
 * <pre>
 * [primary key]
 *     PRODUCT_ID
 *
 * [column]
 *     PRODUCT_ID, PRODUCT_NAME, PRODUCT_HANDLE_CODE, PRODUCT_CATEGORY_CODE, PRODUCT_STATUS_CODE, REGULAR_PRICE, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PRODUCT_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     PRODUCT_CATEGORY, PRODUCT_STATUS
 *
 * [referrer table]
 *     PURCHASE
 *
 * [foreign property]
 *     productCategory, productStatus
 *
 * [referrer property]
 *     purchaseList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
class LoaderOfProduct {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected var _selectedList: List[DbleProduct] = null;
    protected var _selector: BehaviorSelector = null;
    protected var _myBhv: ProductBhv = null; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    def ready(selectedList: List[DbleProduct], selector: BehaviorSelector): LoaderOfProduct =
    { _selectedList = selectedList; _selector = selector; return this; }

    protected def myBhv: ProductBhv =
    { if (_myBhv != null) { _myBhv } else { _myBhv = _selector.select(classOf[ProductBhv]); _myBhv } }

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
    protected var _foreignProductCategoryLoader: LoaderOfProductCategory = null;
    def pulloutProductCategory(): LoaderOfProductCategory = {
        if (_foreignProductCategoryLoader != null) { return _foreignProductCategoryLoader; }
        val pulledList = myBhv.pulloutProductCategory(toScalaList(_selectedList).map(new Product(_))).map(new DbleProductCategory().acceptImmutable(_)).asJava;
        _foreignProductCategoryLoader = new LoaderOfProductCategory().ready(pulledList, _selector);
        return _foreignProductCategoryLoader;
    }

    protected var _foreignProductStatusLoader: LoaderOfProductStatus = null;
    def pulloutProductStatus(): LoaderOfProductStatus = {
        if (_foreignProductStatusLoader != null) { return _foreignProductStatusLoader; }
        val pulledList = myBhv.pulloutProductStatus(toScalaList(_selectedList).map(new Product(_))).map(new DbleProductStatus().acceptImmutable(_)).asJava;
        _foreignProductStatusLoader = new LoaderOfProductStatus().ready(pulledList, _selector);
        return _foreignProductStatusLoader;
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
    def selectedList: List[DbleProduct] = { _selectedList }
    def selector: BehaviorSelector = { _selector }
}
