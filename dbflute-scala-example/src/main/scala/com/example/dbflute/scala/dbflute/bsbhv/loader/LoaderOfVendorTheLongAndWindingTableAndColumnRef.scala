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
 * The referrer loader of VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF as TABLE. <br />
 * <pre>
 * [primary key]
 *     THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_ID
 *
 * [column]
 *     THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_ID, THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID, THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_DATE, SHORT_DATE
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
 *     VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     vendorTheLongAndWindingTableAndColumn
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
class LoaderOfVendorTheLongAndWindingTableAndColumnRef {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected var _selectedList: List[DbleVendorTheLongAndWindingTableAndColumnRef] = null;
    protected var _selector: BehaviorSelector = null;
    protected var _myBhv: VendorTheLongAndWindingTableAndColumnRefBhv = null; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    def ready(selectedList: List[DbleVendorTheLongAndWindingTableAndColumnRef], selector: BehaviorSelector): LoaderOfVendorTheLongAndWindingTableAndColumnRef =
    { _selectedList = selectedList; _selector = selector; return this; }

    protected def myBhv: VendorTheLongAndWindingTableAndColumnRefBhv =
    { if (_myBhv != null) { _myBhv } else { _myBhv = _selector.select(classOf[VendorTheLongAndWindingTableAndColumnRefBhv]); _myBhv } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected var _foreignVendorTheLongAndWindingTableAndColumnLoader: LoaderOfVendorTheLongAndWindingTableAndColumn = null;
    def pulloutVendorTheLongAndWindingTableAndColumn(): LoaderOfVendorTheLongAndWindingTableAndColumn = {
        if (_foreignVendorTheLongAndWindingTableAndColumnLoader != null) { return _foreignVendorTheLongAndWindingTableAndColumnLoader; }
        val pulledList = myBhv.pulloutVendorTheLongAndWindingTableAndColumn(toScalaList(_selectedList).map(new VendorTheLongAndWindingTableAndColumnRef(_))).map(new DbleVendorTheLongAndWindingTableAndColumn().acceptImmutable(_)).asJava;
        _foreignVendorTheLongAndWindingTableAndColumnLoader = new LoaderOfVendorTheLongAndWindingTableAndColumn().ready(pulledList, _selector);
        return _foreignVendorTheLongAndWindingTableAndColumnLoader;
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
    def selectedList: List[DbleVendorTheLongAndWindingTableAndColumnRef] = { _selectedList }
    def selector: BehaviorSelector = { _selector }
}
