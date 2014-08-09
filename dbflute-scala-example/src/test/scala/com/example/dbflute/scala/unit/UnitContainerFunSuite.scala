package com.example.dbflute.scala.unit

import java.util.ArrayList
import java.util.List

import org.dbflute.unit.guice.ContainerFunSuite
import org.joda.time.LocalDate
import org.joda.time.LocalDateTime

import com.atomikos.icatch.jta.UserTransactionImp
import com.atomikos.icatch.jta.UserTransactionManager
import com.atomikos.jdbc.nonxa.AtomikosNonXADataSourceBean
import com.example.dbflute.scala.EmbeddedH2UrlFactoryBean
import com.example.dbflute.scala.dbflute.allcommon.DBFluteModule
import com.example.dbflute.scala.dbflute.allcommon.DBFlutist
import com.google.inject.AbstractModule
import com.google.inject.Module

import javax.sql.DataSource
import javax.transaction.TransactionManager
import javax.transaction.UserTransaction

/**
 * The fun suite with container.
 * @author jflute
 * @since 1.0.5J (2014/07/02 Wednesday)
 */
abstract class UnitContainerFunSuite extends ContainerFunSuite {

  // ===================================================================================
  //                                                                            Settings
  //                                                                            ========
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

  // ===================================================================================
  //                                                                          DataSource
  //                                                                          ==========
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

  // ===================================================================================
  //                                                                       Assist Helper
  //                                                                       =============
  protected def toLocalDate(exp: String): LocalDate = {
    return LocalDate.fromDateFields(toDate(exp));
  }

  protected def toLocalDateTime(exp: String): LocalDateTime = {
    return LocalDateTime.fromDateFields(toTimestamp(exp));
  }

  protected def currentLocalDate(): LocalDate = {
    return LocalDate.now();
  }

  protected def currentLocalDateTime(): LocalDateTime = {
    return LocalDateTime.now();
  }
}
