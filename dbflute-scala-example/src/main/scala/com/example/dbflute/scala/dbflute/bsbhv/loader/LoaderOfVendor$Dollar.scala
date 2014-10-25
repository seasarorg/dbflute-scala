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
 * The referrer loader of VENDOR_$_DOLLAR as TABLE. <br />
 * <pre>
 * [primary key]
 *     VENDOR_$_DOLLAR_ID
 *
 * [column]
 *     VENDOR_$_DOLLAR_ID, VENDOR_$_DOLLAR_NAME
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
class LoaderOfVendor$Dollar {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected var _selectedList: List[DbleVendor$Dollar] = null;
    protected var _selector: BehaviorSelector = null;
    protected var _myBhv: Vendor$DollarBhv = null; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    def ready(selectedList: List[DbleVendor$Dollar], selector: BehaviorSelector): LoaderOfVendor$Dollar =
    { _selectedList = selectedList; _selector = selector; return this; }

    protected def myBhv: Vendor$DollarBhv =
    { if (_myBhv != null) { _myBhv } else { _myBhv = _selector.select(classOf[Vendor$DollarBhv]); _myBhv } }

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
    def selectedList: List[DbleVendor$Dollar] = { _selectedList }
    def selector: BehaviorSelector = { _selector }
}
