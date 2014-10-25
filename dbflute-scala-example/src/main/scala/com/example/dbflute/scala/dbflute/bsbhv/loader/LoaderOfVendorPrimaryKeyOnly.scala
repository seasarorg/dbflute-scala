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
 * The referrer loader of VENDOR_PRIMARY_KEY_ONLY as TABLE. <br />
 * <pre>
 * [primary key]
 *     PRIMARY_KEY_ONLY_ID
 *
 * [column]
 *     PRIMARY_KEY_ONLY_ID
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
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
class LoaderOfVendorPrimaryKeyOnly {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected var _selectedList: List[DbleVendorPrimaryKeyOnly] = null;
    protected var _selector: BehaviorSelector = null;
    protected var _myBhv: VendorPrimaryKeyOnlyBhv = null; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    def ready(selectedList: List[DbleVendorPrimaryKeyOnly], selector: BehaviorSelector): LoaderOfVendorPrimaryKeyOnly =
    { _selectedList = selectedList; _selector = selector; return this; }

    protected def myBhv: VendorPrimaryKeyOnlyBhv =
    { if (_myBhv != null) { _myBhv } else { _myBhv = _selector.select(classOf[VendorPrimaryKeyOnlyBhv]); _myBhv } }

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
    def selectedList: List[DbleVendorPrimaryKeyOnly] = { _selectedList }
    def selector: BehaviorSelector = { _selector }
}
