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
 * The referrer loader of (会員ステータス)MEMBER_STATUS as TABLE. <br />
 * <pre>
 * [primary key]
 *     MEMBER_STATUS_CODE
 *
 * [column]
 *     MEMBER_STATUS_CODE, MEMBER_STATUS_NAME, DESCRIPTION, DISPLAY_ORDER
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
 *     MEMBER, MEMBER_LOGIN
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     memberList, memberLoginList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
class LoaderOfMemberStatus {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected var _selectedList: List[DbleMemberStatus] = null;
    protected var _selector: BehaviorSelector = null;
    protected var _myBhv: MemberStatusBhv = null; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    def ready(selectedList: List[DbleMemberStatus], selector: BehaviorSelector): LoaderOfMemberStatus =
    { _selectedList = selectedList; _selector = selector; return this; }

    protected def myBhv: MemberStatusBhv =
    { if (_myBhv != null) { _myBhv } else { _myBhv = _selector.select(classOf[MemberStatusBhv]); _myBhv } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected var _referrerMemberList: List[DbleMember] = null;
    def loadMemberList(cbCall: (MemberCB) => Unit): ScrNestedReferrerLoaderGateway[LoaderOfMember] = {
        myBhv.loadMemberList(_selectedList, cbCall).withNestedReferrer(new ReferrerListHandler[DbleMember]() {
            def handle(referrerList: List[DbleMember]): Unit = { _referrerMemberList = referrerList; }
        });
        return createNested(() => { new LoaderOfMember().ready(_referrerMemberList, _selector); });
    }

    protected var _referrerMemberLoginList: List[DbleMemberLogin] = null;
    def loadMemberLoginList(cbCall: (MemberLoginCB) => Unit): ScrNestedReferrerLoaderGateway[LoaderOfMemberLogin] = {
        myBhv.loadMemberLoginList(_selectedList, cbCall).withNestedReferrer(new ReferrerListHandler[DbleMemberLogin]() {
            def handle(referrerList: List[DbleMemberLogin]): Unit = { _referrerMemberLoginList = referrerList; }
        });
        return createNested(() => { new LoaderOfMemberLogin().ready(_referrerMemberLoginList, _selector); });
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
    def selectedList: List[DbleMemberStatus] = { _selectedList }
    def selector: BehaviorSelector = { _selector }
}
