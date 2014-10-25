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
 * The referrer loader of (会員住所情報)MEMBER_ADDRESS as TABLE. <br />
 * <pre>
 * [primary key]
 *     MEMBER_ADDRESS_ID
 *
 * [column]
 *     MEMBER_ADDRESS_ID, MEMBER_ID, VALID_BEGIN_DATE, VALID_END_DATE, ADDRESS, REGION_ID, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MEMBER_ADDRESS_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     MEMBER, REGION
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     member, region
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
class LoaderOfMemberAddress {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected var _selectedList: List[DbleMemberAddress] = null;
    protected var _selector: BehaviorSelector = null;
    protected var _myBhv: MemberAddressBhv = null; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    def ready(selectedList: List[DbleMemberAddress], selector: BehaviorSelector): LoaderOfMemberAddress =
    { _selectedList = selectedList; _selector = selector; return this; }

    protected def myBhv: MemberAddressBhv =
    { if (_myBhv != null) { _myBhv } else { _myBhv = _selector.select(classOf[MemberAddressBhv]); _myBhv } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected var _foreignMemberLoader: LoaderOfMember = null;
    def pulloutMember(): LoaderOfMember = {
        if (_foreignMemberLoader != null) { return _foreignMemberLoader; }
        val pulledList = myBhv.pulloutMember(toScalaList(_selectedList).map(new MemberAddress(_))).map(new DbleMember().acceptImmutable(_)).asJava;
        _foreignMemberLoader = new LoaderOfMember().ready(pulledList, _selector);
        return _foreignMemberLoader;
    }

    protected var _foreignRegionLoader: LoaderOfRegion = null;
    def pulloutRegion(): LoaderOfRegion = {
        if (_foreignRegionLoader != null) { return _foreignRegionLoader; }
        val pulledList = myBhv.pulloutRegion(toScalaList(_selectedList).map(new MemberAddress(_))).map(new DbleRegion().acceptImmutable(_)).asJava;
        _foreignRegionLoader = new LoaderOfRegion().ready(pulledList, _selector);
        return _foreignRegionLoader;
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
    def selectedList: List[DbleMemberAddress] = { _selectedList }
    def selector: BehaviorSelector = { _selector }
}
