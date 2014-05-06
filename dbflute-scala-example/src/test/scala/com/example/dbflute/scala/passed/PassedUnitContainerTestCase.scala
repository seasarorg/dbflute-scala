package com.example.dbflute.scala.passed

import java.util.ArrayList
import java.util.List
import javax.sql.DataSource
import javax.transaction.TransactionManager
import javax.transaction.UserTransaction
import org.seasar.dbflute.unit.guice.ContainerTestCase
import com.atomikos.icatch.jta.UserTransactionImp
import com.atomikos.icatch.jta.UserTransactionManager
import com.atomikos.jdbc.nonxa.AtomikosNonXADataSourceBean
import com.google.inject.AbstractModule
import com.google.inject.Module;
import javax.transaction.TransactionManager
import javax.transaction.UserTransaction

/**
 * The test case with container.
 * @author jflute
 */
class PassedUnitContainerTestCase extends ContainerTestCase {
  // #why? using super class implemented by Scala, cannot execute JUnit

  override def prepareModuleList(): List[Module] = {
    val dataSource = createDataSource();
    val moduleList = new ArrayList[Module]();
    // not migration yet
    //moduleList.add(new DBFluteModule(dataSource));
    val transactionModule = createTransactionModule(dataSource);
    if (transactionModule != null) {
      moduleList.add(transactionModule);
    }
    return moduleList;
  }

  def createDataSource(): DataSource = {
    val bean = new AtomikosNonXADataSourceBean();
    bean.setUniqueResourceName("NONXADBMS");
    bean.setDriverClassName("org.h2.jdbcx.JdbcDataSource");
    val factoryBean = new PassedEmbeddedH2UrlFactoryBean();
    factoryBean.urlSuffix = "/exampledb/exampledb";
    factoryBean.referenceClassName = classOf[PassedEmbeddedH2UrlFactoryBean].getName();
    val url = try {
      factoryBean.getObject().toString();
    } catch {
      case e: Exception => {
        val msg = "The factoryBean was invalid: " + factoryBean;
        throw new IllegalStateException(msg, e);
      }
    }
    bean.setUrl(url.toString());
    bean.setUser("sa");
    bean.setPassword("");
    bean.setPoolSize(20);
    bean.setBorrowConnectionTimeout(60);
    return bean;
  }

  protected def createTransactionModule(dataSource: DataSource): TransactionModule = {
    return new TransactionModule(dataSource);
  }

  protected class TransactionModule(dataSource: DataSource) extends AbstractModule {

    @Override
    protected def configure(): Unit = {
      try {
        val userTransactionImp = new UserTransactionImp();
        userTransactionImp.setTransactionTimeout(300);
        val userTransactionManager = new UserTransactionManager();
        userTransactionManager.setForceShutdown(true);
        userTransactionManager.init();
        bind(classOf[UserTransaction]).toInstance(userTransactionImp);
        bind(classOf[TransactionManager]).toInstance(userTransactionManager);
        bind(classOf[DataSource]).toInstance(dataSource);
      } catch {
        case e: Exception => {
          throw new IllegalStateException(e);
        }
      }
    }
  }
}
