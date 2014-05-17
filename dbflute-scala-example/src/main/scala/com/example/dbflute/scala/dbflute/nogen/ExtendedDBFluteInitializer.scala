package com.example.dbflute.scala.dbflute.nogen;

import org.seasar.dbflute.DBDef
import org.seasar.dbflute.bhv.core.BehaviorCommandInvoker
import org.seasar.dbflute.jdbc.StatementConfig
import org.seasar.dbflute.outsidesql.OutsideSqlOption
import org.seasar.dbflute.outsidesql.executor.OutsideSqlBasicExecutor
import org.seasar.dbflute.outsidesql.factory.DefaultOutsideSqlExecutorFactory
import com.example.dbflute.scala.dbflute.allcommon.DBFluteConfig
import com.example.dbflute.scala.dbflute.allcommon.DBFluteInitializer
import org.seasar.dbflute.cbean.cipher.GearedCipherManager
import org.seasar.dbflute.dbmeta.info.ColumnInfo
import org.seasar.dbflute.cbean.cipher.CipherFunctionFilter
import com.example.dbflute.scala.dbflute.bsentity.dbmeta.PurchaseDbm

/**
 * @author jflute
 */
class ExtendedDBFluteInitializer extends DBFluteInitializer {

  override protected def prologue(): Unit = { // the example for fixed DBFluteConfig settings
    super.prologue(); // you need to call this

    DBFluteConfig.unlock();

    prepareOutsideSqlExecutorFactory();
    prepareGearedCipher();

    DBFluteConfig.lock();
  }

  protected def prepareOutsideSqlExecutorFactory(): Unit = {
    DBFluteConfig.setOutsideSqlExecutorFactory(new DefaultOutsideSqlExecutorFactory() {
      override protected def createBasic[BEHAVIOR](
        behaviorCommandInvoker: BehaviorCommandInvoker, tableDbName: String, currentDBDef: DBDef,
        defaultStatementConfig: StatementConfig, outsideSqlOption: OutsideSqlOption): OutsideSqlBasicExecutor[BEHAVIOR] = {
        val executor: OutsideSqlBasicExecutor[BEHAVIOR] = super.createBasic(behaviorCommandInvoker,
          tableDbName, currentDBDef, defaultStatementConfig, outsideSqlOption);
        return executor.formatSql();
      }
    });
  }

  protected def prepareGearedCipher(): Unit = {
    val manager: GearedCipherManager = new GearedCipherManager();
    val purchasePrice: ColumnInfo = PurchaseDbm.columnPurchasePrice();
    manager.addFunctionFilter(purchasePrice, new CipherFunctionFilter() {
      def encrypt(valueExp: String): String = {
        return "(" + valueExp + " + 13)";
      }
      def decrypt(valueExp: String): String = {
        return "(" + valueExp + " - 13)";
      }
    });
    DBFluteConfig.setGearedCipherManager(manager);
  }
}
