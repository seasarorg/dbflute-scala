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
 * The referrer loader of VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN as TABLE. <br />
 * <pre>
 * [primary key]
 *     THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID
 *
 * [column]
 *     THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID, THE_LONG_AND_WINDING_TABLE_AND_COLUMN_NAME, SHORT_NAME, SHORT_SIZE
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
 *     VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     vendorTheLongAndWindingTableAndColumnRefList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
class LoaderOfVendorTheLongAndWindingTableAndColumn {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected var _selectedList: List[DbleVendorTheLongAndWindingTableAndColumn] = null;
    protected var _selector: BehaviorSelector = null;
    protected var _myBhv: VendorTheLongAndWindingTableAndColumnBhv = null; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    def ready(selectedList: List[DbleVendorTheLongAndWindingTableAndColumn], selector: BehaviorSelector): LoaderOfVendorTheLongAndWindingTableAndColumn =
    { _selectedList = selectedList; _selector = selector; return this; }

    protected def myBhv: VendorTheLongAndWindingTableAndColumnBhv =
    { if (_myBhv != null) { _myBhv } else { _myBhv = _selector.select(classOf[VendorTheLongAndWindingTableAndColumnBhv]); _myBhv } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected var _referrerVendorTheLongAndWindingTableAndColumnRefList: List[DbleVendorTheLongAndWindingTableAndColumnRef] = null;
    def loadVendorTheLongAndWindingTableAndColumnRefList(cbCall: (VendorTheLongAndWindingTableAndColumnRefCB) => Unit): ScrNestedReferrerLoaderGateway[LoaderOfVendorTheLongAndWindingTableAndColumnRef] = {
        myBhv.loadVendorTheLongAndWindingTableAndColumnRefList(_selectedList, cbCall).withNestedReferrer(new ReferrerListHandler[DbleVendorTheLongAndWindingTableAndColumnRef]() {
            def handle(referrerList: List[DbleVendorTheLongAndWindingTableAndColumnRef]): Unit = { _referrerVendorTheLongAndWindingTableAndColumnRefList = referrerList; }
        });
        return createNested(() => { new LoaderOfVendorTheLongAndWindingTableAndColumnRef().ready(_referrerVendorTheLongAndWindingTableAndColumnRefList, _selector); });
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
    def selectedList: List[DbleVendorTheLongAndWindingTableAndColumn] = { _selectedList }
    def selector: BehaviorSelector = { _selector }
}
