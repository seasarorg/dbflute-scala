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
 * The referrer loader of (サービスランク)SERVICE_RANK as TABLE. <br />
 * <pre>
 * [primary key]
 *     SERVICE_RANK_CODE
 *
 * [column]
 *     SERVICE_RANK_CODE, SERVICE_RANK_NAME, SERVICE_POINT_INCIDENCE, NEW_ACCEPTABLE_FLG, DESCRIPTION, DISPLAY_ORDER
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
 *     MEMBER_SERVICE
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     memberServiceList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
class LoaderOfServiceRank {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected var _selectedList: List[DbleServiceRank] = null;
    protected var _selector: BehaviorSelector = null;
    protected var _myBhv: ServiceRankBhv = null; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    def ready(selectedList: List[DbleServiceRank], selector: BehaviorSelector): LoaderOfServiceRank =
    { _selectedList = selectedList; _selector = selector; return this; }

    protected def myBhv: ServiceRankBhv =
    { if (_myBhv != null) { _myBhv } else { _myBhv = _selector.select(classOf[ServiceRankBhv]); _myBhv } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected var _referrerMemberServiceList: List[DbleMemberService] = null;
    def loadMemberServiceList(cbCall: (MemberServiceCB) => Unit): ScrNestedReferrerLoaderGateway[LoaderOfMemberService] = {
        myBhv.loadMemberServiceList(_selectedList, cbCall).withNestedReferrer(new ReferrerListHandler[DbleMemberService]() {
            def handle(referrerList: List[DbleMemberService]): Unit = { _referrerMemberServiceList = referrerList; }
        });
        return createNested(() => { new LoaderOfMemberService().ready(_referrerMemberServiceList, _selector); });
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
    def selectedList: List[DbleServiceRank] = { _selectedList }
    def selector: BehaviorSelector = { _selector }
}
