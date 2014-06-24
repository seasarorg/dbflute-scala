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

    def memberAddressBhv(): MemberAddressBhv = {
        return select(classOf[MemberAddressBhv]);
    }

    def memberFollowingBhv(): MemberFollowingBhv = {
        return select(classOf[MemberFollowingBhv]);
    }

    def memberLoginBhv(): MemberLoginBhv = {
        return select(classOf[MemberLoginBhv]);
    }

    def memberSecurityBhv(): MemberSecurityBhv = {
        return select(classOf[MemberSecurityBhv]);
    }

    def memberServiceBhv(): MemberServiceBhv = {
        return select(classOf[MemberServiceBhv]);
    }

    def memberStatusBhv(): MemberStatusBhv = {
        return select(classOf[MemberStatusBhv]);
    }

    def memberWithdrawalBhv(): MemberWithdrawalBhv = {
        return select(classOf[MemberWithdrawalBhv]);
    }

    def productBhv(): ProductBhv = {
        return select(classOf[ProductBhv]);
    }

    def productCategoryBhv(): ProductCategoryBhv = {
        return select(classOf[ProductCategoryBhv]);
    }

    def productStatusBhv(): ProductStatusBhv = {
        return select(classOf[ProductStatusBhv]);
    }

    def purchaseBhv(): PurchaseBhv = {
        return select(classOf[PurchaseBhv]);
    }

    def purchasePaymentBhv(): PurchasePaymentBhv = {
        return select(classOf[PurchasePaymentBhv]);
    }

    def regionBhv(): RegionBhv = {
        return select(classOf[RegionBhv]);
    }

    def serviceRankBhv(): ServiceRankBhv = {
        return select(classOf[ServiceRankBhv]);
    }

    def summaryProductBhv(): SummaryProductBhv = {
        return select(classOf[SummaryProductBhv]);
    }

    def summaryWithdrawalBhv(): SummaryWithdrawalBhv = {
        return select(classOf[SummaryWithdrawalBhv]);
    }

    def vendor$DollarBhv(): Vendor$DollarBhv = {
        return select(classOf[Vendor$DollarBhv]);
    }

    def vendorCheckBhv(): VendorCheckBhv = {
        return select(classOf[VendorCheckBhv]);
    }

    def vendorIdentityOnlyBhv(): VendorIdentityOnlyBhv = {
        return select(classOf[VendorIdentityOnlyBhv]);
    }

    def vendorPrimaryKeyOnlyBhv(): VendorPrimaryKeyOnlyBhv = {
        return select(classOf[VendorPrimaryKeyOnlyBhv]);
    }

    def vendorTheLongAndWindingTableAndColumnBhv(): VendorTheLongAndWindingTableAndColumnBhv = {
        return select(classOf[VendorTheLongAndWindingTableAndColumnBhv]);
    }

    def vendorTheLongAndWindingTableAndColumnRefBhv(): VendorTheLongAndWindingTableAndColumnRefBhv = {
        return select(classOf[VendorTheLongAndWindingTableAndColumnRefBhv]);
    }

    def withdrawalReasonBhv(): WithdrawalReasonBhv = {
        return select(classOf[WithdrawalReasonBhv]);
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
