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
 * The referrer loader of (会員フォローイング)MEMBER_FOLLOWING as TABLE. <br />
 * <pre>
 * [primary key]
 *     MEMBER_FOLLOWING_ID
 *
 * [column]
 *     MEMBER_FOLLOWING_ID, MY_MEMBER_ID, YOUR_MEMBER_ID, FOLLOW_DATETIME
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MEMBER_FOLLOWING_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     MEMBER
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     memberByMyMemberId, memberByYourMemberId
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
class LoaderOfMemberFollowing {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected var _selectedList: List[DbleMemberFollowing] = null;
    protected var _selector: BehaviorSelector = null;
    protected var _myBhv: MemberFollowingBhv = null; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    def ready(selectedList: List[DbleMemberFollowing], selector: BehaviorSelector): LoaderOfMemberFollowing =
    { _selectedList = selectedList; _selector = selector; return this; }

    protected def myBhv: MemberFollowingBhv =
    { if (_myBhv != null) { _myBhv } else { _myBhv = _selector.select(classOf[MemberFollowingBhv]); _myBhv } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected var _foreignMemberByMyMemberIdLoader: LoaderOfMember = null;
    def pulloutMemberByMyMemberId(): LoaderOfMember = {
        if (_foreignMemberByMyMemberIdLoader != null) { return _foreignMemberByMyMemberIdLoader; }
        val pulledList = myBhv.pulloutMemberByMyMemberId(toScalaList(_selectedList).map(new MemberFollowing(_))).map(new DbleMember().acceptImmutable(_)).asJava;
        _foreignMemberByMyMemberIdLoader = new LoaderOfMember().ready(pulledList, _selector);
        return _foreignMemberByMyMemberIdLoader;
    }

    protected var _foreignMemberByYourMemberIdLoader: LoaderOfMember = null;
    def pulloutMemberByYourMemberId(): LoaderOfMember = {
        if (_foreignMemberByYourMemberIdLoader != null) { return _foreignMemberByYourMemberIdLoader; }
        val pulledList = myBhv.pulloutMemberByYourMemberId(toScalaList(_selectedList).map(new MemberFollowing(_))).map(new DbleMember().acceptImmutable(_)).asJava;
        _foreignMemberByYourMemberIdLoader = new LoaderOfMember().ready(pulledList, _selector);
        return _foreignMemberByYourMemberIdLoader;
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
    def selectedList: List[DbleMemberFollowing] = { _selectedList }
    def selector: BehaviorSelector = { _selector }
}
