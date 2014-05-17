package org.dbflute.scala.testlib.unit;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;
import javax.transaction.SystemException;
import javax.transaction.TransactionManager;
import javax.transaction.UserTransaction;

import org.dbflute.scala.testlib.EmbeddedH2UrlFactoryBean;
import org.seasar.dbflute.unit.guice.ContainerTestCase;

import com.atomikos.icatch.jta.UserTransactionImp;
import com.atomikos.icatch.jta.UserTransactionManager;
import com.atomikos.jdbc.nonxa.AtomikosNonXADataSourceBean;
import com.google.inject.AbstractModule;
import com.google.inject.Module;

/**
 * The test case with container.
 * @author jflute
 * @since 0.9.2 (2009/02/18 Wednesday)
 */
public abstract class UnitContainerTestCase extends ContainerTestCase {

    @Override
    protected List<Module> prepareModuleList() {
        final DataSource dataSource = createDataSource();
        final List<Module> moduleList = new ArrayList<Module>();
        moduleList.add(prepareDBFluteModule(dataSource));
        final TransactionModule transactionModule = createTransactionModule(dataSource);
        if (transactionModule != null) {
            moduleList.add(transactionModule);
        }
        return moduleList;
    }

    protected abstract Module prepareDBFluteModule(DataSource dataSource);

    protected DataSource createDataSource() {
        final AtomikosNonXADataSourceBean bean = new AtomikosNonXADataSourceBean();
        bean.setUniqueResourceName("NONXADBMS");
        bean.setDriverClassName("org.h2.jdbcx.JdbcDataSource");
        final EmbeddedH2UrlFactoryBean factoryBean = new EmbeddedH2UrlFactoryBean();
        factoryBean.setUrlSuffix("/exampledb/exampledb");
        factoryBean.setReferenceClassName("com.example.dbflute.scala.BuildDirReference");
        final String url;
        try {
            url = factoryBean.getObject().toString();
        } catch (Exception e) {
            String msg = "The factoryBean was invalid: " + factoryBean;
            throw new IllegalStateException(msg, e);
        }
        bean.setUrl(url.toString());
        bean.setUser("sa");
        bean.setPassword("");
        bean.setPoolSize(20);
        bean.setBorrowConnectionTimeout(60);
        return bean;
    }

    protected TransactionModule createTransactionModule(DataSource dataSource) {
        return new TransactionModule(dataSource);
    }

    protected static class TransactionModule extends AbstractModule {

        protected final DataSource _dataSource;

        public TransactionModule(DataSource dataSource) {
            if (dataSource == null) {
                String msg = "The argument 'dataSource' should not be null!";
                throw new IllegalArgumentException(msg);
            }
            _dataSource = dataSource;
        }

        @Override
        protected void configure() {
            try {
                final UserTransactionImp userTransactionImp = new UserTransactionImp();
                userTransactionImp.setTransactionTimeout(300);
                UserTransactionManager userTransactionManager = new UserTransactionManager();
                userTransactionManager.setForceShutdown(true);
                userTransactionManager.init();
                bind(UserTransaction.class).toInstance(userTransactionImp);
                bind(TransactionManager.class).toInstance(userTransactionManager);
                bind(DataSource.class).toInstance(_dataSource);
            } catch (SystemException e) {
                throw new IllegalStateException(e);
            }
        }
    }
}
