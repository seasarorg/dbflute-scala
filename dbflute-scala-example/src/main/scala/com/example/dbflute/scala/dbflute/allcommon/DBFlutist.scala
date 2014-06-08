package com.example.dbflute.scala.dbflute.allcommon;

import org.seasar.dbflute.BehaviorSelector;
import org.seasar.dbflute.bhv.BehaviorReadable;
import com.google.inject.Injector;
import com.example.dbflute.scala.dbflute.exbhv._;

/**
 * @author DBFlute(AutoGenerator)
 */
object DBFlutist {

    protected var injector: Injector = null;
    protected var selector: BehaviorSelector = null;

    def play(injector: Injector): Unit = {
        this.injector = injector;
    }

    def memberBhv(): MemberBhv = {
        return select(classOf[MemberBhv]);
    }

    def memberServiceBhv(): MemberServiceBhv = {
        return select(classOf[MemberServiceBhv]);
    }

    def memberStatusBhv(): MemberStatusBhv = {
        return select(classOf[MemberStatusBhv]);
    }

    def productBhv(): ProductBhv = {
        return select(classOf[ProductBhv]);
    }

    def purchaseBhv(): PurchaseBhv = {
        return select(classOf[PurchaseBhv]);
    }

    def serviceRankBhv(): ServiceRankBhv = {
        return select(classOf[ServiceRankBhv]);
    }

    protected def select[BEHAVIOR <: BehaviorReadable](behaviorType: Class[BEHAVIOR]): BEHAVIOR = {
        if (selector == null) {
            this.synchronized {
                if (selector == null) {
                    selector = injector.getInstance(classOf[BehaviorSelector]);
                }
            }
        }
        return selector.select(behaviorType)
    }
}
