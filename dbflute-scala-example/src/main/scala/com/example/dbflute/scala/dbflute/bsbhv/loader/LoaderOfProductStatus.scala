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
 * The referrer loader of (商品ステータス)PRODUCT_STATUS as TABLE. <br />
 * <pre>
 * [primary key]
 *     PRODUCT_STATUS_CODE
 *
 * [column]
 *     PRODUCT_STATUS_CODE, PRODUCT_STATUS_NAME, DISPLAY_ORDER
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
 *     PRODUCT
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     productList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
class LoaderOfProductStatus {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected var _selectedList: List[DbleProductStatus] = null;
    protected var _selector: BehaviorSelector = null;
    protected var _myBhv: ProductStatusBhv = null; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    def ready(selectedList: List[DbleProductStatus], selector: BehaviorSelector): LoaderOfProductStatus =
    { _selectedList = selectedList; _selector = selector; return this; }

    protected def myBhv: ProductStatusBhv =
    { if (_myBhv != null) { _myBhv } else { _myBhv = _selector.select(classOf[ProductStatusBhv]); _myBhv } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected var _referrerProductList: List[DbleProduct] = null;
    def loadProductList(cbCall: (ProductCB) => Unit): ScrNestedReferrerLoaderGateway[LoaderOfProduct] = {
        myBhv.loadProductList(_selectedList, cbCall).withNestedReferrer(new ReferrerListHandler[DbleProduct]() {
            def handle(referrerList: List[DbleProduct]): Unit = { _referrerProductList = referrerList; }
        });
        return createNested(() => { new LoaderOfProduct().ready(_referrerProductList, _selector); });
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
    def selectedList: List[DbleProductStatus] = { _selectedList }
    def selector: BehaviorSelector = { _selector }
}
