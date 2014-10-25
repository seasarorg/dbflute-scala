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
 * The referrer loader of (商品カテゴリ)PRODUCT_CATEGORY as TABLE. <br />
 * <pre>
 * [primary key]
 *     PRODUCT_CATEGORY_CODE
 *
 * [column]
 *     PRODUCT_CATEGORY_CODE, PRODUCT_CATEGORY_NAME, PARENT_CATEGORY_CODE
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
 *     PRODUCT_CATEGORY
 *
 * [referrer table]
 *     PRODUCT, PRODUCT_CATEGORY
 *
 * [foreign property]
 *     productCategorySelf
 *
 * [referrer property]
 *     productList, productCategorySelfList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
class LoaderOfProductCategory {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected var _selectedList: List[DbleProductCategory] = null;
    protected var _selector: BehaviorSelector = null;
    protected var _myBhv: ProductCategoryBhv = null; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    def ready(selectedList: List[DbleProductCategory], selector: BehaviorSelector): LoaderOfProductCategory =
    { _selectedList = selectedList; _selector = selector; return this; }

    protected def myBhv: ProductCategoryBhv =
    { if (_myBhv != null) { _myBhv } else { _myBhv = _selector.select(classOf[ProductCategoryBhv]); _myBhv } }

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

    protected var _referrerProductCategorySelfList: List[DbleProductCategory] = null;
    def loadProductCategorySelfList(cbCall: (ProductCategoryCB) => Unit): ScrNestedReferrerLoaderGateway[LoaderOfProductCategory] = {
        myBhv.loadProductCategorySelfList(_selectedList, cbCall).withNestedReferrer(new ReferrerListHandler[DbleProductCategory]() {
            def handle(referrerList: List[DbleProductCategory]): Unit = { _referrerProductCategorySelfList = referrerList; }
        });
        return createNested(() => { new LoaderOfProductCategory().ready(_referrerProductCategorySelfList, _selector); });
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected var _foreignProductCategorySelfLoader: LoaderOfProductCategory = null;
    def pulloutProductCategorySelf(): LoaderOfProductCategory = {
        if (_foreignProductCategorySelfLoader != null) { return _foreignProductCategorySelfLoader; }
        val pulledList = myBhv.pulloutProductCategorySelf(toScalaList(_selectedList).map(new ProductCategory(_))).map(new DbleProductCategory().acceptImmutable(_)).asJava;
        _foreignProductCategorySelfLoader = new LoaderOfProductCategory().ready(pulledList, _selector);
        return _foreignProductCategorySelfLoader;
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
    def selectedList: List[DbleProductCategory] = { _selectedList }
    def selector: BehaviorSelector = { _selector }
}
