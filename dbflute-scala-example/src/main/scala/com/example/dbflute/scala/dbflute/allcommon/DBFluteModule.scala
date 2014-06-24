package com.example.dbflute.scala.dbflute.allcommon;

import javax.sql.DataSource;

import com.google.inject.AbstractModule;
import org.seasar.dbflute.BehaviorSelector;
import org.seasar.dbflute.bhv._;
import org.seasar.dbflute.bhv.core.BehaviorCommandInvoker;
import org.seasar.dbflute.bhv.core.CommonColumnAutoSetupper;
import org.seasar.dbflute.bhv.core.InvokerAssistant;
import com.example.dbflute.scala.dbflute.exbhv._;

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
            val bhv: AbstractBehaviorWritable = Class.forName("com.example.dbflute.scala.dbflute.exbhv.MemberBhv").newInstance().asInstanceOf[AbstractBehaviorWritable];
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(classOf[MemberBhv]).toInstance(bhv.asInstanceOf[MemberBhv]);
        }
        {
            val bhv: AbstractBehaviorWritable = Class.forName("com.example.dbflute.scala.dbflute.exbhv.MemberAddressBhv").newInstance().asInstanceOf[AbstractBehaviorWritable];
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(classOf[MemberAddressBhv]).toInstance(bhv.asInstanceOf[MemberAddressBhv]);
        }
        {
            val bhv: AbstractBehaviorWritable = Class.forName("com.example.dbflute.scala.dbflute.exbhv.MemberFollowingBhv").newInstance().asInstanceOf[AbstractBehaviorWritable];
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(classOf[MemberFollowingBhv]).toInstance(bhv.asInstanceOf[MemberFollowingBhv]);
        }
        {
            val bhv: AbstractBehaviorWritable = Class.forName("com.example.dbflute.scala.dbflute.exbhv.MemberLoginBhv").newInstance().asInstanceOf[AbstractBehaviorWritable];
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(classOf[MemberLoginBhv]).toInstance(bhv.asInstanceOf[MemberLoginBhv]);
        }
        {
            val bhv: AbstractBehaviorWritable = Class.forName("com.example.dbflute.scala.dbflute.exbhv.MemberSecurityBhv").newInstance().asInstanceOf[AbstractBehaviorWritable];
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(classOf[MemberSecurityBhv]).toInstance(bhv.asInstanceOf[MemberSecurityBhv]);
        }
        {
            val bhv: AbstractBehaviorWritable = Class.forName("com.example.dbflute.scala.dbflute.exbhv.MemberServiceBhv").newInstance().asInstanceOf[AbstractBehaviorWritable];
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(classOf[MemberServiceBhv]).toInstance(bhv.asInstanceOf[MemberServiceBhv]);
        }
        {
            val bhv: AbstractBehaviorWritable = Class.forName("com.example.dbflute.scala.dbflute.exbhv.MemberStatusBhv").newInstance().asInstanceOf[AbstractBehaviorWritable];
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(classOf[MemberStatusBhv]).toInstance(bhv.asInstanceOf[MemberStatusBhv]);
        }
        {
            val bhv: AbstractBehaviorWritable = Class.forName("com.example.dbflute.scala.dbflute.exbhv.MemberWithdrawalBhv").newInstance().asInstanceOf[AbstractBehaviorWritable];
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(classOf[MemberWithdrawalBhv]).toInstance(bhv.asInstanceOf[MemberWithdrawalBhv]);
        }
        {
            val bhv: AbstractBehaviorWritable = Class.forName("com.example.dbflute.scala.dbflute.exbhv.ProductBhv").newInstance().asInstanceOf[AbstractBehaviorWritable];
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(classOf[ProductBhv]).toInstance(bhv.asInstanceOf[ProductBhv]);
        }
        {
            val bhv: AbstractBehaviorWritable = Class.forName("com.example.dbflute.scala.dbflute.exbhv.ProductCategoryBhv").newInstance().asInstanceOf[AbstractBehaviorWritable];
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(classOf[ProductCategoryBhv]).toInstance(bhv.asInstanceOf[ProductCategoryBhv]);
        }
        {
            val bhv: AbstractBehaviorWritable = Class.forName("com.example.dbflute.scala.dbflute.exbhv.ProductStatusBhv").newInstance().asInstanceOf[AbstractBehaviorWritable];
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(classOf[ProductStatusBhv]).toInstance(bhv.asInstanceOf[ProductStatusBhv]);
        }
        {
            val bhv: AbstractBehaviorWritable = Class.forName("com.example.dbflute.scala.dbflute.exbhv.PurchaseBhv").newInstance().asInstanceOf[AbstractBehaviorWritable];
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(classOf[PurchaseBhv]).toInstance(bhv.asInstanceOf[PurchaseBhv]);
        }
        {
            val bhv: AbstractBehaviorWritable = Class.forName("com.example.dbflute.scala.dbflute.exbhv.PurchasePaymentBhv").newInstance().asInstanceOf[AbstractBehaviorWritable];
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(classOf[PurchasePaymentBhv]).toInstance(bhv.asInstanceOf[PurchasePaymentBhv]);
        }
        {
            val bhv: AbstractBehaviorWritable = Class.forName("com.example.dbflute.scala.dbflute.exbhv.RegionBhv").newInstance().asInstanceOf[AbstractBehaviorWritable];
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(classOf[RegionBhv]).toInstance(bhv.asInstanceOf[RegionBhv]);
        }
        {
            val bhv: AbstractBehaviorWritable = Class.forName("com.example.dbflute.scala.dbflute.exbhv.ServiceRankBhv").newInstance().asInstanceOf[AbstractBehaviorWritable];
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(classOf[ServiceRankBhv]).toInstance(bhv.asInstanceOf[ServiceRankBhv]);
        }
        {
            val bhv: AbstractBehaviorReadable = Class.forName("com.example.dbflute.scala.dbflute.exbhv.SummaryProductBhv").newInstance().asInstanceOf[AbstractBehaviorReadable];
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor);
            bind(classOf[SummaryProductBhv]).toInstance(bhv.asInstanceOf[SummaryProductBhv]);
        }
        {
            val bhv: AbstractBehaviorReadable = Class.forName("com.example.dbflute.scala.dbflute.exbhv.SummaryWithdrawalBhv").newInstance().asInstanceOf[AbstractBehaviorReadable];
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor);
            bind(classOf[SummaryWithdrawalBhv]).toInstance(bhv.asInstanceOf[SummaryWithdrawalBhv]);
        }
        {
            val bhv: AbstractBehaviorWritable = Class.forName("com.example.dbflute.scala.dbflute.exbhv.Vendor$DollarBhv").newInstance().asInstanceOf[AbstractBehaviorWritable];
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(classOf[Vendor$DollarBhv]).toInstance(bhv.asInstanceOf[Vendor$DollarBhv]);
        }
        {
            val bhv: AbstractBehaviorWritable = Class.forName("com.example.dbflute.scala.dbflute.exbhv.VendorCheckBhv").newInstance().asInstanceOf[AbstractBehaviorWritable];
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(classOf[VendorCheckBhv]).toInstance(bhv.asInstanceOf[VendorCheckBhv]);
        }
        {
            val bhv: AbstractBehaviorWritable = Class.forName("com.example.dbflute.scala.dbflute.exbhv.VendorIdentityOnlyBhv").newInstance().asInstanceOf[AbstractBehaviorWritable];
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(classOf[VendorIdentityOnlyBhv]).toInstance(bhv.asInstanceOf[VendorIdentityOnlyBhv]);
        }
        {
            val bhv: AbstractBehaviorWritable = Class.forName("com.example.dbflute.scala.dbflute.exbhv.VendorPrimaryKeyOnlyBhv").newInstance().asInstanceOf[AbstractBehaviorWritable];
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(classOf[VendorPrimaryKeyOnlyBhv]).toInstance(bhv.asInstanceOf[VendorPrimaryKeyOnlyBhv]);
        }
        {
            val bhv: AbstractBehaviorWritable = Class.forName("com.example.dbflute.scala.dbflute.exbhv.VendorTheLongAndWindingTableAndColumnBhv").newInstance().asInstanceOf[AbstractBehaviorWritable];
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(classOf[VendorTheLongAndWindingTableAndColumnBhv]).toInstance(bhv.asInstanceOf[VendorTheLongAndWindingTableAndColumnBhv]);
        }
        {
            val bhv: AbstractBehaviorWritable = Class.forName("com.example.dbflute.scala.dbflute.exbhv.VendorTheLongAndWindingTableAndColumnRefBhv").newInstance().asInstanceOf[AbstractBehaviorWritable];
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(classOf[VendorTheLongAndWindingTableAndColumnRefBhv]).toInstance(bhv.asInstanceOf[VendorTheLongAndWindingTableAndColumnRefBhv]);
        }
        {
            val bhv: AbstractBehaviorWritable = Class.forName("com.example.dbflute.scala.dbflute.exbhv.WithdrawalReasonBhv").newInstance().asInstanceOf[AbstractBehaviorWritable];
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(classOf[WithdrawalReasonBhv]).toInstance(bhv.asInstanceOf[WithdrawalReasonBhv]);
        }
    }
}
