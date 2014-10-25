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
 * The referrer loader of VENDOR_IDENTITY_ONLY as TABLE. <br />
 * <pre>
 * [primary key]
 *     IDENTITY_ONLY_ID
 *
 * [column]
 *     IDENTITY_ONLY_ID
 *
 * [sequence]
 *     
 *
 * [identity]
 *     IDENTITY_ONLY_ID
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
class LoaderOfVendorIdentityOnly {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected var _selectedList: List[DbleVendorIdentityOnly] = null;
    protected var _selector: BehaviorSelector = null;
    protected var _myBhv: VendorIdentityOnlyBhv = null; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    def ready(selectedList: List[DbleVendorIdentityOnly], selector: BehaviorSelector): LoaderOfVendorIdentityOnly =
    { _selectedList = selectedList; _selector = selector; return this; }

    protected def myBhv: VendorIdentityOnlyBhv =
    { if (_myBhv != null) { _myBhv } else { _myBhv = _selector.select(classOf[VendorIdentityOnlyBhv]); _myBhv } }

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
    def selectedList: List[DbleVendorIdentityOnly] = { _selectedList }
    def selector: BehaviorSelector = { _selector }
}
