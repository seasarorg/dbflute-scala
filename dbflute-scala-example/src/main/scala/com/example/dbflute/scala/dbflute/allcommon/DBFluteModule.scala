package com.example.dbflute.scala.dbflute.allcommon;

import javax.sql.DataSource;

import com.google.inject.AbstractModule;
import org.seasar.dbflute.BehaviorSelector;
import org.seasar.dbflute.bhv._;
import org.seasar.dbflute.bhv.core.BehaviorCommandInvoker;
import org.seasar.dbflute.bhv.core.CommonColumnAutoSetupper;
import org.seasar.dbflute.bhv.core.InvokerAssistant;
import com.example.dbflute.scala.dbflute.exbhv._;
import com.example.dbflute.scala.dbflute.cbean._;
import com.example.dbflute.scala.dbflute.exentity._;

/**
 * @author DBFlute(AutoGenerator)
 */
class DBFluteModule(dataSource: DataSource) extends AbstractModule {

    @Override
    protected def configure(): Unit = {
        createDBFluteInitializer(); // initialized by only a creation

        // The components of DBFlute Runtime.
        val behaviorSelector: ImplementedBehaviorSelector = createImplementedBehaviorSelector();
        val behaviorCommandInvoker: BehaviorCommandInvoker = createBehaviorCommandInvoker();
        val invokerAssistant: ImplementedInvokerAssistant = createImplementedInvokerAssistant();
        behaviorCommandInvoker.setInvokerAssistant(invokerAssistant);
        val commonColumnAutoSetupper: ImplementedCommonColumnAutoSetupper = createImplementedCommonColumnAutoSetupper();

        bind(classOf[BehaviorSelector]).toInstance(behaviorSelector);
        bind(classOf[BehaviorCommandInvoker]).toInstance(behaviorCommandInvoker);
        bind(classOf[InvokerAssistant]).toInstance(invokerAssistant);
        bind(classOf[CommonColumnAutoSetupper]).toInstance(commonColumnAutoSetupper);

        // The components of Behavior.
        setupBehavior(behaviorCommandInvoker, behaviorSelector, commonColumnAutoSetupper);
    }

    protected def createDBFluteInitializer(): DBFluteInitializer = {
        return new com.example.dbflute.scala.dbflute.nogen.ExtendedDBFluteInitializer();
    }

    protected def createImplementedBehaviorSelector(): ImplementedBehaviorSelector = {
        return new ImplementedBehaviorSelector();
    }

    protected def createBehaviorCommandInvoker(): BehaviorCommandInvoker = {
        return new BehaviorCommandInvoker();
    }

    protected def createImplementedInvokerAssistant(): ImplementedInvokerAssistant = {
        val invokerAssistant: ImplementedInvokerAssistant = new com.example.dbflute.scala.dbflute.allcommon.ImplementedInvokerAssistant();
        invokerAssistant.setDataSource(dataSource);
        return invokerAssistant;
    }

    protected def createImplementedCommonColumnAutoSetupper(): ImplementedCommonColumnAutoSetupper = {
        return new com.example.dbflute.scala.dbflute.allcommon.ImplementedCommonColumnAutoSetupper();
    }

    protected def setupBehavior(ker: BehaviorCommandInvoker, tor: BehaviorSelector, per: CommonColumnAutoSetupper): Unit = {
        // #avoided unknown compile error 'illegal cyclic reference'
        // if directly create the behaviors so use reflection here
        {
            val bhv = Class.forName("com.example.dbflute.scala.dbflute.exbhv.MemberBhv").newInstance().asInstanceOf[AbstractBehaviorWritable[DbleMember, MemberCB]];
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(classOf[MemberBhv]).toInstance(bhv.asInstanceOf[MemberBhv]);
        }
        {
            val bhv = Class.forName("com.example.dbflute.scala.dbflute.exbhv.MemberAddressBhv").newInstance().asInstanceOf[AbstractBehaviorWritable[DbleMemberAddress, MemberAddressCB]];
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(classOf[MemberAddressBhv]).toInstance(bhv.asInstanceOf[MemberAddressBhv]);
        }
        {
            val bhv = Class.forName("com.example.dbflute.scala.dbflute.exbhv.MemberFollowingBhv").newInstance().asInstanceOf[AbstractBehaviorWritable[DbleMemberFollowing, MemberFollowingCB]];
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(classOf[MemberFollowingBhv]).toInstance(bhv.asInstanceOf[MemberFollowingBhv]);
        }
        {
            val bhv = Class.forName("com.example.dbflute.scala.dbflute.exbhv.MemberLoginBhv").newInstance().asInstanceOf[AbstractBehaviorWritable[DbleMemberLogin, MemberLoginCB]];
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(classOf[MemberLoginBhv]).toInstance(bhv.asInstanceOf[MemberLoginBhv]);
        }
        {
            val bhv = Class.forName("com.example.dbflute.scala.dbflute.exbhv.MemberSecurityBhv").newInstance().asInstanceOf[AbstractBehaviorWritable[DbleMemberSecurity, MemberSecurityCB]];
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(classOf[MemberSecurityBhv]).toInstance(bhv.asInstanceOf[MemberSecurityBhv]);
        }
        {
            val bhv = Class.forName("com.example.dbflute.scala.dbflute.exbhv.MemberServiceBhv").newInstance().asInstanceOf[AbstractBehaviorWritable[DbleMemberService, MemberServiceCB]];
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(classOf[MemberServiceBhv]).toInstance(bhv.asInstanceOf[MemberServiceBhv]);
        }
        {
            val bhv = Class.forName("com.example.dbflute.scala.dbflute.exbhv.MemberStatusBhv").newInstance().asInstanceOf[AbstractBehaviorWritable[DbleMemberStatus, MemberStatusCB]];
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(classOf[MemberStatusBhv]).toInstance(bhv.asInstanceOf[MemberStatusBhv]);
        }
        {
            val bhv = Class.forName("com.example.dbflute.scala.dbflute.exbhv.MemberWithdrawalBhv").newInstance().asInstanceOf[AbstractBehaviorWritable[DbleMemberWithdrawal, MemberWithdrawalCB]];
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(classOf[MemberWithdrawalBhv]).toInstance(bhv.asInstanceOf[MemberWithdrawalBhv]);
        }
        {
            val bhv = Class.forName("com.example.dbflute.scala.dbflute.exbhv.ProductBhv").newInstance().asInstanceOf[AbstractBehaviorWritable[DbleProduct, ProductCB]];
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(classOf[ProductBhv]).toInstance(bhv.asInstanceOf[ProductBhv]);
        }
        {
            val bhv = Class.forName("com.example.dbflute.scala.dbflute.exbhv.ProductCategoryBhv").newInstance().asInstanceOf[AbstractBehaviorWritable[DbleProductCategory, ProductCategoryCB]];
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(classOf[ProductCategoryBhv]).toInstance(bhv.asInstanceOf[ProductCategoryBhv]);
        }
        {
            val bhv = Class.forName("com.example.dbflute.scala.dbflute.exbhv.ProductStatusBhv").newInstance().asInstanceOf[AbstractBehaviorWritable[DbleProductStatus, ProductStatusCB]];
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(classOf[ProductStatusBhv]).toInstance(bhv.asInstanceOf[ProductStatusBhv]);
        }
        {
            val bhv = Class.forName("com.example.dbflute.scala.dbflute.exbhv.PurchaseBhv").newInstance().asInstanceOf[AbstractBehaviorWritable[DblePurchase, PurchaseCB]];
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(classOf[PurchaseBhv]).toInstance(bhv.asInstanceOf[PurchaseBhv]);
        }
        {
            val bhv = Class.forName("com.example.dbflute.scala.dbflute.exbhv.PurchasePaymentBhv").newInstance().asInstanceOf[AbstractBehaviorWritable[DblePurchasePayment, PurchasePaymentCB]];
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(classOf[PurchasePaymentBhv]).toInstance(bhv.asInstanceOf[PurchasePaymentBhv]);
        }
        {
            val bhv = Class.forName("com.example.dbflute.scala.dbflute.exbhv.RegionBhv").newInstance().asInstanceOf[AbstractBehaviorWritable[DbleRegion, RegionCB]];
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(classOf[RegionBhv]).toInstance(bhv.asInstanceOf[RegionBhv]);
        }
        {
            val bhv = Class.forName("com.example.dbflute.scala.dbflute.exbhv.ServiceRankBhv").newInstance().asInstanceOf[AbstractBehaviorWritable[DbleServiceRank, ServiceRankCB]];
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(classOf[ServiceRankBhv]).toInstance(bhv.asInstanceOf[ServiceRankBhv]);
        }
        {
            val bhv = Class.forName("com.example.dbflute.scala.dbflute.exbhv.SummaryProductBhv").newInstance().asInstanceOf[AbstractBehaviorReadable[DbleSummaryProduct, SummaryProductCB]];
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor);
            bind(classOf[SummaryProductBhv]).toInstance(bhv.asInstanceOf[SummaryProductBhv]);
        }
        {
            val bhv = Class.forName("com.example.dbflute.scala.dbflute.exbhv.SummaryWithdrawalBhv").newInstance().asInstanceOf[AbstractBehaviorReadable[DbleSummaryWithdrawal, SummaryWithdrawalCB]];
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor);
            bind(classOf[SummaryWithdrawalBhv]).toInstance(bhv.asInstanceOf[SummaryWithdrawalBhv]);
        }
        {
            val bhv = Class.forName("com.example.dbflute.scala.dbflute.exbhv.Vendor$DollarBhv").newInstance().asInstanceOf[AbstractBehaviorWritable[DbleVendor$Dollar, Vendor$DollarCB]];
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(classOf[Vendor$DollarBhv]).toInstance(bhv.asInstanceOf[Vendor$DollarBhv]);
        }
        {
            val bhv = Class.forName("com.example.dbflute.scala.dbflute.exbhv.VendorCheckBhv").newInstance().asInstanceOf[AbstractBehaviorWritable[DbleVendorCheck, VendorCheckCB]];
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(classOf[VendorCheckBhv]).toInstance(bhv.asInstanceOf[VendorCheckBhv]);
        }
        {
            val bhv = Class.forName("com.example.dbflute.scala.dbflute.exbhv.VendorIdentityOnlyBhv").newInstance().asInstanceOf[AbstractBehaviorWritable[DbleVendorIdentityOnly, VendorIdentityOnlyCB]];
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(classOf[VendorIdentityOnlyBhv]).toInstance(bhv.asInstanceOf[VendorIdentityOnlyBhv]);
        }
        {
            val bhv = Class.forName("com.example.dbflute.scala.dbflute.exbhv.VendorPrimaryKeyOnlyBhv").newInstance().asInstanceOf[AbstractBehaviorWritable[DbleVendorPrimaryKeyOnly, VendorPrimaryKeyOnlyCB]];
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(classOf[VendorPrimaryKeyOnlyBhv]).toInstance(bhv.asInstanceOf[VendorPrimaryKeyOnlyBhv]);
        }
        {
            val bhv = Class.forName("com.example.dbflute.scala.dbflute.exbhv.VendorTheLongAndWindingTableAndColumnBhv").newInstance().asInstanceOf[AbstractBehaviorWritable[DbleVendorTheLongAndWindingTableAndColumn, VendorTheLongAndWindingTableAndColumnCB]];
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(classOf[VendorTheLongAndWindingTableAndColumnBhv]).toInstance(bhv.asInstanceOf[VendorTheLongAndWindingTableAndColumnBhv]);
        }
        {
            val bhv = Class.forName("com.example.dbflute.scala.dbflute.exbhv.VendorTheLongAndWindingTableAndColumnRefBhv").newInstance().asInstanceOf[AbstractBehaviorWritable[DbleVendorTheLongAndWindingTableAndColumnRef, VendorTheLongAndWindingTableAndColumnRefCB]];
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(classOf[VendorTheLongAndWindingTableAndColumnRefBhv]).toInstance(bhv.asInstanceOf[VendorTheLongAndWindingTableAndColumnRefBhv]);
        }
        {
            val bhv = Class.forName("com.example.dbflute.scala.dbflute.exbhv.WithdrawalReasonBhv").newInstance().asInstanceOf[AbstractBehaviorWritable[DbleWithdrawalReason, WithdrawalReasonCB]];
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(classOf[WithdrawalReasonBhv]).toInstance(bhv.asInstanceOf[WithdrawalReasonBhv]);
        }
    }
}
