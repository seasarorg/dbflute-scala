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
 * The referrer loader of (地域)REGION as TABLE. <br />
 * <pre>
 * [primary key]
 *     REGION_ID
 *
 * [column]
 *     REGION_ID, REGION_NAME
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
 *     MEMBER_ADDRESS
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     memberAddressList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
class LoaderOfRegion {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected var _selectedList: List[DbleRegion] = null;
    protected var _selector: BehaviorSelector = null;
    protected var _myBhv: RegionBhv = null; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    def ready(selectedList: List[DbleRegion], selector: BehaviorSelector): LoaderOfRegion =
    { _selectedList = selectedList; _selector = selector; return this; }

    protected def myBhv: RegionBhv =
    { if (_myBhv != null) { _myBhv } else { _myBhv = _selector.select(classOf[RegionBhv]); _myBhv } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected var _referrerMemberAddressList: List[DbleMemberAddress] = null;
    def loadMemberAddressList(cbCall: (MemberAddressCB) => Unit): ScrNestedReferrerLoaderGateway[LoaderOfMemberAddress] = {
        myBhv.loadMemberAddressList(_selectedList, cbCall).withNestedReferrer(new ReferrerListHandler[DbleMemberAddress]() {
            def handle(referrerList: List[DbleMemberAddress]): Unit = { _referrerMemberAddressList = referrerList; }
        });
        return createNested(() => { new LoaderOfMemberAddress().ready(_referrerMemberAddressList, _selector); });
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
    def selectedList: List[DbleRegion] = { _selectedList }
    def selector: BehaviorSelector = { _selector }
}
