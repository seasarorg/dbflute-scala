package com.example.dbflute.scala.dbflute.allcommon;

import javax.sql.DataSource;

import com.google.inject.AbstractModule;
import org.seasar.dbflute.BehaviorSelector;
import org.seasar.dbflute.bhv.core.BehaviorCommandInvoker;
import org.seasar.dbflute.bhv.core.CommonColumnAutoSetupper;
import org.seasar.dbflute.bhv.core.InvokerAssistant;
import com.example.dbflute.scala.dbflute.exbhv.*;

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
        return new com.example.dbflute.guice.dbflute.nogen.ExtendedDBFluteInitializer();
    }

    protected def createImplementedBehaviorSelector(): ImplementedBehaviorSelector = {
        return new ImplementedBehaviorSelector();
    }

    protected def createBehaviorCommandInvoker(): BehaviorCommandInvoker = {
        return new BehaviorCommandInvoker();
    }

    protected def createImplementedInvokerAssistant(): ImplementedInvokerAssistant = {
        val invokerAssistant:ImplementedInvokerAssistant = new com.example.dbflute.scala.dbflute.allcommon.ImplementedInvokerAssistant();
        invokerAssistant.setDataSource(dataSource);
        return invokerAssistant;
    }

    protected def createImplementedCommonColumnAutoSetupper(): ImplementedCommonColumnAutoSetupper = {
        return new com.example.dbflute.scala.dbflute.allcommon.ImplementedCommonColumnAutoSetupper();
    }

    protected def setupBehavior(ker: BehaviorCommandInvoker, tor: BehaviorSelector, per: CommonColumnAutoSetupper): Unit = {
        {
            val bhv: MemberBhv = new MemberBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(classOf[MemberBhv]).toInstance(bhv);
        }
        {
            val bhv: MemberAddressBhv = new MemberAddressBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(classOf[MemberAddressBhv]).toInstance(bhv);
        }
        {
            val bhv: MemberFollowingBhv = new MemberFollowingBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(classOf[MemberFollowingBhv]).toInstance(bhv);
        }
        {
            val bhv: MemberLoginBhv = new MemberLoginBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(classOf[MemberLoginBhv]).toInstance(bhv);
        }
        {
            val bhv: MemberSecurityBhv = new MemberSecurityBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(classOf[MemberSecurityBhv]).toInstance(bhv);
        }
        {
            val bhv: MemberServiceBhv = new MemberServiceBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(classOf[MemberServiceBhv]).toInstance(bhv);
        }
        {
            val bhv: MemberStatusBhv = new MemberStatusBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(classOf[MemberStatusBhv]).toInstance(bhv);
        }
        {
            val bhv: MemberWithdrawalBhv = new MemberWithdrawalBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(classOf[MemberWithdrawalBhv]).toInstance(bhv);
        }
        {
            val bhv: ProductBhv = new ProductBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(classOf[ProductBhv]).toInstance(bhv);
        }
        {
            val bhv: ProductCategoryBhv = new ProductCategoryBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(classOf[ProductCategoryBhv]).toInstance(bhv);
        }
        {
            val bhv: PurchaseBhv = new PurchaseBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(classOf[PurchaseBhv]).toInstance(bhv);
        }
        {
            val bhv: SummaryProductBhv = new SummaryProductBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(classOf[SummaryProductBhv]).toInstance(bhv);
        }
        {
            val bhv: SummaryWithdrawalBhv = new SummaryWithdrawalBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor);
            bind(classOf[SummaryWithdrawalBhv]).toInstance(bhv);
        }
        {
            val bhv: Vendor$DollarBhv = new Vendor$DollarBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(classOf[Vendor$DollarBhv]).toInstance(bhv);
        }
        {
            val bhv: VendorCheckBhv = new VendorCheckBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(classOf[VendorCheckBhv]).toInstance(bhv);
        }
        {
            val bhv: VendorIdentityOnlyBhv = new VendorIdentityOnlyBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(classOf[VendorIdentityOnlyBhv]).toInstance(bhv);
        }
        {
            val bhv: VendorPrimaryKeyOnlyBhv = new VendorPrimaryKeyOnlyBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(classOf[VendorPrimaryKeyOnlyBhv]).toInstance(bhv);
        }
        {
            val bhv: VendorTheLongAndWindingTableAndColumnBhv = new VendorTheLongAndWindingTableAndColumnBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(classOf[VendorTheLongAndWindingTableAndColumnBhv]).toInstance(bhv);
        }
        {
            val bhv: VendorTheLongAndWindingTableAndColumnRefBhv = new VendorTheLongAndWindingTableAndColumnRefBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(classOf[VendorTheLongAndWindingTableAndColumnRefBhv]).toInstance(bhv);
        }
    }
}
