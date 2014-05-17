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
        // unknown compile error 'illegal cyclic reference' if directly create the behaviors
        // so use reflection here
        {
            val bhv: AbstractBehaviorWritable = Class.forName("com.example.dbflute.scala.dbflute.exbhv.MemberBhv").newInstance().asInstanceOf[AbstractBehaviorWritable];
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(classOf[MemberBhv]).toInstance(bhv.asInstanceOf[MemberBhv]);
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
            val bhv: AbstractBehaviorWritable = Class.forName("com.example.dbflute.scala.dbflute.exbhv.ProductBhv").newInstance().asInstanceOf[AbstractBehaviorWritable];
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(classOf[ProductBhv]).toInstance(bhv.asInstanceOf[ProductBhv]);
        }
        {
            val bhv: AbstractBehaviorWritable = Class.forName("com.example.dbflute.scala.dbflute.exbhv.PurchaseBhv").newInstance().asInstanceOf[AbstractBehaviorWritable];
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(classOf[PurchaseBhv]).toInstance(bhv.asInstanceOf[PurchaseBhv]);
        }
    }
}
