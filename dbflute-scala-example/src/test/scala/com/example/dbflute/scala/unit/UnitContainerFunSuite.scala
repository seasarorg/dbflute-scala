package com.example.dbflute.scala.unit

import java.util.Date
import java.util.List
import java.util.ArrayList

import javax.sql.DataSource
import javax.transaction.UserTransaction
import javax.transaction.TransactionManager

import com.google.inject.Module
import com.google.inject.AbstractModule
import com.atomikos.icatch.jta.UserTransactionImp
import com.atomikos.icatch.jta.UserTransactionManager
import com.atomikos.jdbc.nonxa.AtomikosNonXADataSourceBean
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith

import com.example.dbflute.scala.dbflute.allcommon.DBFluteModule
import com.example.dbflute.scala.dbflute.allcommon.DBFlutist
import com.example.dbflute.scala.EmbeddedH2UrlFactoryBean
import org.dbflute.unit.guice.ContainerFunSuite

/**
 * The fun suite with container.
 * @author jflute
 * @since 1.0.5J (2014/07/02 Wednesday)
 */
abstract class UnitContainerFunSuite extends ContainerFunSuite {

  override protected def setUp() {
    super.setUp();
    DBFlutist.play(_xcurrentActiveInjector);
  }

  override protected def prepareModuleList(): List[Module] = {
    val dataSource = createDataSource();
    val moduleList = new ArrayList[Module]();
    moduleList.add(new DBFluteModule(dataSource));
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
    val factoryBean = new EmbeddedH2UrlFactoryBean();
    factoryBean.urlSuffix = "/exampledb/exampledb";
    factoryBean.referenceClassName = classOf[EmbeddedH2UrlFactoryBean].getName();
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
