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
 * The referrer loader of (会員ログイン)MEMBER_LOGIN as TABLE. <br />
 * <pre>
 * [primary key]
 *     MEMBER_LOGIN_ID
 *
 * [column]
 *     MEMBER_LOGIN_ID, MEMBER_ID, LOGIN_DATETIME, MOBILE_LOGIN_FLG, LOGIN_MEMBER_STATUS_CODE
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MEMBER_LOGIN_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     MEMBER_STATUS, MEMBER
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     memberStatus, member
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
class LoaderOfMemberLogin {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected var _selectedList: List[DbleMemberLogin] = null;
    protected var _selector: BehaviorSelector = null;
    protected var _myBhv: MemberLoginBhv = null; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    def ready(selectedList: List[DbleMemberLogin], selector: BehaviorSelector): LoaderOfMemberLogin =
    { _selectedList = selectedList; _selector = selector; return this; }

    protected def myBhv: MemberLoginBhv =
    { if (_myBhv != null) { _myBhv } else { _myBhv = _selector.select(classOf[MemberLoginBhv]); _myBhv } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected var _foreignMemberStatusLoader: LoaderOfMemberStatus = null;
    def pulloutMemberStatus(): LoaderOfMemberStatus = {
        if (_foreignMemberStatusLoader != null) { return _foreignMemberStatusLoader; }
        val pulledList = myBhv.pulloutMemberStatus(toScalaList(_selectedList).map(new MemberLogin(_))).map(new DbleMemberStatus().acceptImmutable(_)).asJava;
        _foreignMemberStatusLoader = new LoaderOfMemberStatus().ready(pulledList, _selector);
        return _foreignMemberStatusLoader;
    }

    protected var _foreignMemberLoader: LoaderOfMember = null;
    def pulloutMember(): LoaderOfMember = {
        if (_foreignMemberLoader != null) { return _foreignMemberLoader; }
        val pulledList = myBhv.pulloutMember(toScalaList(_selectedList).map(new MemberLogin(_))).map(new DbleMember().acceptImmutable(_)).asJava;
        _foreignMemberLoader = new LoaderOfMember().ready(pulledList, _selector);
        return _foreignMemberLoader;
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
    def selectedList: List[DbleMemberLogin] = { _selectedList }
    def selector: BehaviorSelector = { _selector }
}
