package com.example.dbflute.scala.dbflute.allcommon;

import javax.sql.DataSource;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.bhv.core.InvokerAssistant;
import org.seasar.dbflute.bhv.core.supplement.SequenceCacheHandler;
import org.seasar.dbflute.bhv.core.supplement.SequenceCacheKeyGenerator;
import org.seasar.dbflute.cbean.cipher.GearedCipherManager;
import org.seasar.dbflute.cbean.sqlclause.SqlClauseCreator;
import org.seasar.dbflute.dbmeta.DBMetaProvider;
import org.seasar.dbflute.exception.factory.SQLExceptionHandlerFactory;
import org.seasar.dbflute.exception.factory.DefaultSQLExceptionHandlerFactory;
import org.seasar.dbflute.exception.thrower.BehaviorExceptionThrower;
import org.seasar.dbflute.jdbc.DataSourceHandler;
import org.seasar.dbflute.jdbc.HandlingDataSourceWrapper;
import org.seasar.dbflute.jdbc.SQLExceptionDigger;
import org.seasar.dbflute.jdbc.StatementConfig;
import org.seasar.dbflute.jdbc.StatementFactory;
import org.seasar.dbflute.optional.RelationOptionalFactory;
import org.seasar.dbflute.outsidesql.factory.DefaultOutsideSqlExecutorFactory;
import org.seasar.dbflute.outsidesql.factory.OutsideSqlExecutorFactory;
import org.seasar.dbflute.resource.ResourceParameter;
import org.seasar.dbflute.s2dao.extension.TnBeanMetaDataFactoryExtension;
import org.seasar.dbflute.s2dao.jdbc.TnStatementFactoryImpl;
import org.seasar.dbflute.s2dao.metadata.TnBeanMetaDataFactory;
import org.seasar.dbflute.twowaysql.factory.DefaultSqlAnalyzerFactory;
import org.seasar.dbflute.twowaysql.factory.SqlAnalyzerFactory;

/**
 * @author DBFlute(AutoGenerator)
 */
class ImplementedInvokerAssistant extends InvokerAssistant {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected val DEFAULT_CLIENT_INVOKE_NAMES: Array[String]
        = Array[String]("Page", "Action", "Controller", "ControllerImpl", "Task", "Test");

    protected val DEFAULT_BYPASS_INVOKE_NAMES: Array[String]
        = Array[String]("Service", "ServiceImpl", "Facade", "FacadeImpl", "Logic", "LogicImpl");

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                          DI Component
    //                                          ------------
    protected var _dataSource: DataSource = null;
    protected var _introduction: DBFluteInitializer = null;

    // -----------------------------------------------------
    //                                        Lazy Component
    //                                        --------------
    @volatile
    protected var _dbmetaProvider: DBMetaProvider = null;
    @volatile
    protected var _sqlClauseCreator: SqlClauseCreator = null;
    @volatile
    protected var _statementFactory: StatementFactory = null;
    @volatile
    protected var _beanMetaDataFactory: TnBeanMetaDataFactory = null;
    @volatile
    protected var _sqlAnalyzerFactory: SqlAnalyzerFactory = null;
    @volatile
    protected var _outsideSqlExecutorFactory: OutsideSqlExecutorFactory = null;
    @volatile
    protected var _sqlExceptionHandlerFactory: SQLExceptionHandlerFactory = null;
    @volatile
    protected var _sequenceCacheHandler: SequenceCacheHandler = null;
    @volatile
    protected var _relationOptionalFactory: RelationOptionalFactory = null;

    // -----------------------------------------------------
    //                                       Disposable Flag
    //                                       ---------------
    @volatile
    protected var _disposable: Boolean = false;

    // ===================================================================================
    //                                                                 Assistant Main Work
    //                                                                 ===================
    // -----------------------------------------------------
    //                                         Current DBDef
    //                                         -------------
    def assistCurrentDBDef(): DBDef = {
        return DBCurrent.currentDBDef();
    }

    // -----------------------------------------------------
    //                                           Data Source
    //                                           -----------
    def assistDataSource(): DataSource = { // DI component
        // this instance will be cached in SQL executions
        // so the handler should be set before initialization of DBFlute
        // (and it means you cannot switch data source after initialization)
        val handler: DataSourceHandler = DBFluteConfig.getDataSourceHandler();
        return if (handler != null) { new HandlingDataSourceWrapper(_dataSource, handler) } else { _dataSource };
    }

    // -----------------------------------------------------
    //                                       DBMeta Provider
    //                                       ---------------
    def assistDBMetaProvider(): DBMetaProvider = { // lazy component
        if (_dbmetaProvider != null) {
            return _dbmetaProvider;
        }
        this.synchronized {
            if (_dbmetaProvider != null) {
                return _dbmetaProvider;
            }
            _dbmetaProvider = createDBMetaProvider();
        }
        return _dbmetaProvider;
    }

    protected def createDBMetaProvider(): DBMetaProvider = {
        return DBMetaInstanceHandler.getProvider();
    }

    // -----------------------------------------------------
    //                                    SQL Clause Creator
    //                                    ------------------
    def assistSqlClauseCreator(): SqlClauseCreator = { // lazy component
        if (_sqlClauseCreator != null) {
            return _sqlClauseCreator;
        }
        this.synchronized {
            if (_sqlClauseCreator != null) {
                return _sqlClauseCreator;
            }
            _sqlClauseCreator = createSqlClauseCreator();
        }
        return _sqlClauseCreator;
    }

    protected def createSqlClauseCreator(): SqlClauseCreator = {
        val creator: SqlClauseCreator = DBFluteConfig.getSqlClauseCreator();
        if (creator != null) {
            return creator;
        }
        return newImplementedSqlClauseCreator(); // as default
    }

    protected def newImplementedSqlClauseCreator(): ImplementedSqlClauseCreator = {
        return new ImplementedSqlClauseCreator();
    }

    // -----------------------------------------------------
    //                                     Statement Factory
    //                                     -----------------
    def assistStatementFactory(): StatementFactory = { // lazy component
        if (_statementFactory != null) {
            return _statementFactory;
        }
        this.synchronized {
            if (_statementFactory != null) {
                return _statementFactory;
            }
            _statementFactory = createStatementFactory();
        }
        return _statementFactory;
    }

    protected def createStatementFactory(): StatementFactory = {
        val factory: TnStatementFactoryImpl = newStatementFactoryImpl();
        factory.setDefaultStatementConfig(assistDefaultStatementConfig());
        factory.setInternalDebug(DBFluteConfig.isInternalDebug());
        factory.setCursorSelectFetchSize(DBFluteConfig.getCursorSelectFetchSize());
        return factory;
    }

    protected def newStatementFactoryImpl(): TnStatementFactoryImpl = {
        return new TnStatementFactoryImpl();
    }

    // -----------------------------------------------------
    //                                Bean Meta Data Factory
    //                                ----------------------
    def assistBeanMetaDataFactory(): TnBeanMetaDataFactory = { // lazy component
        if (_beanMetaDataFactory != null) {
            return _beanMetaDataFactory;
        }
        this.synchronized {
            if (_beanMetaDataFactory != null) {
                return _beanMetaDataFactory;
            }
            _beanMetaDataFactory = createBeanMetaDataFactory();
        }
        return _beanMetaDataFactory;
    }

    protected def createBeanMetaDataFactory(): TnBeanMetaDataFactory = {
        val relationOptionalFactory: RelationOptionalFactory = assistRelationOptionalFactory();
        val factory: TnBeanMetaDataFactoryExtension = newBeanMetaDataFactoryExtension(relationOptionalFactory);
        factory.setDataSource(_dataSource);
        factory.setInternalDebug(DBFluteConfig.isInternalDebug());
        return factory;
    }

    protected def newBeanMetaDataFactoryExtension(relationOptionalFactory: RelationOptionalFactory): TnBeanMetaDataFactoryExtension = {
        return new TnBeanMetaDataFactoryExtension(relationOptionalFactory);
    }

    // -----------------------------------------------------
    //                             Relation Optional Factory
    //                             -------------------------
    /**
     * {@inheritDoc}
     */
    def assistRelationOptionalFactory(): RelationOptionalFactory = {
        if (_relationOptionalFactory != null) {
            return _relationOptionalFactory;
        }
        this.synchronized {
            if (_relationOptionalFactory != null) {
                return _relationOptionalFactory;
            }
            _relationOptionalFactory = createRelationOptionalFactory();
        }
        return _relationOptionalFactory;
    }

    protected def createRelationOptionalFactory(): RelationOptionalFactory = {
        return newRelationOptionalFactory();
    }

    protected def newRelationOptionalFactory(): RelationOptionalFactory = {
        return new ScrRelationOptionalFactory();
    }

    // -----------------------------------------------------
    //                                  SQL Analyzer Factory
    //                                  --------------------
    /**
     * {@inheritDoc}
     */
    def assistSqlAnalyzerFactory(): SqlAnalyzerFactory = { // lazy component
        if (_sqlAnalyzerFactory != null) {
            return _sqlAnalyzerFactory;
        }
        this.synchronized {
            if (_sqlAnalyzerFactory != null) {
                return _sqlAnalyzerFactory;
            }
            _sqlAnalyzerFactory = createSqlAnalyzerFactory();
        }
        return _sqlAnalyzerFactory;
    }

    protected def createSqlAnalyzerFactory(): SqlAnalyzerFactory = {
        return newDefaultSqlAnalyzerFactory();
    }

    protected def newDefaultSqlAnalyzerFactory(): DefaultSqlAnalyzerFactory = {
        return new DefaultSqlAnalyzerFactory();
    }

    // -----------------------------------------------------
    //                           OutsideSql Executor Factory
    //                           ---------------------------
    /**
     * {@inheritDoc}
     */
    def assistOutsideSqlExecutorFactory(): OutsideSqlExecutorFactory = {
        if (_outsideSqlExecutorFactory != null) {
            return _outsideSqlExecutorFactory;
        }
        this.synchronized {
            if (_outsideSqlExecutorFactory != null) {
                return _outsideSqlExecutorFactory;
            }
            _outsideSqlExecutorFactory = createOutsideSqlExecutorFactory();
        }
        return _outsideSqlExecutorFactory;
    }

    protected def createOutsideSqlExecutorFactory(): OutsideSqlExecutorFactory = {
        val factory: OutsideSqlExecutorFactory = DBFluteConfig.getOutsideSqlExecutorFactory();
        if (factory != null) {
            return factory;
        }
        return newDefaultOutsideSqlExecutorFactory(); // as default
    }

    protected def newDefaultOutsideSqlExecutorFactory(): DefaultOutsideSqlExecutorFactory = {
        return new DefaultOutsideSqlExecutorFactory();
    }

    // -----------------------------------------------------
    //                                   SQLException Digger
    //                                   -------------------
    /**
     * {@inheritDoc}
     */
    def assistSQLExceptionDigger(): SQLExceptionDigger = {
        return createSQLExceptionDigger();
    }

    protected def createSQLExceptionDigger(): SQLExceptionDigger = {
        return DBFluteConfig.getSQLExceptionDigger();
    }

    // -----------------------------------------------------
    //                          SQLException Handler Factory
    //                          ----------------------------
    /**
     * {@inheritDoc}
     */
    def assistSQLExceptionHandlerFactory(): SQLExceptionHandlerFactory = { // lazy component
        if (_sqlExceptionHandlerFactory != null) {
            return _sqlExceptionHandlerFactory;
        }
        this.synchronized {
            if (_sqlExceptionHandlerFactory != null) {
                return _sqlExceptionHandlerFactory;
            }
            _sqlExceptionHandlerFactory = createSQLExceptionHandlerFactory();
        }
        return _sqlExceptionHandlerFactory;
    }

    protected def createSQLExceptionHandlerFactory(): SQLExceptionHandlerFactory = {
        return newDefaultSQLExceptionHandlerFactory();
    }

    protected def newDefaultSQLExceptionHandlerFactory(): DefaultSQLExceptionHandlerFactory = {
        return new DefaultSQLExceptionHandlerFactory();
    }

    // -----------------------------------------------------
    //                                Sequence Cache Handler
    //                                ----------------------
    /**
     * {@inheritDoc}
     */
    def assistSequenceCacheHandler(): SequenceCacheHandler = { // lazy component
        if (_sequenceCacheHandler != null) {
            return _sequenceCacheHandler;
        }
        this.synchronized {
            if (_sequenceCacheHandler != null) {
                return _sequenceCacheHandler;
            }
            _sequenceCacheHandler = createSequenceCacheHandler();
        }
        return _sequenceCacheHandler;
    }

    protected def createSequenceCacheHandler(): SequenceCacheHandler = {
        val handler: SequenceCacheHandler = newSequenceCacheHandler();
        val generator: SequenceCacheKeyGenerator = DBFluteConfig.getSequenceCacheKeyGenerator();
        if (generator != null) {
            handler.setSequenceCacheKeyGenerator(generator);
        }
        handler.setInternalDebug(DBFluteConfig.isInternalDebug());
        return handler;
    }

    protected def newSequenceCacheHandler(): SequenceCacheHandler = {
        return new SequenceCacheHandler();
    }

    // -----------------------------------------------------
    //                                     SQL File Encoding
    //                                     -----------------
    def assistSqlFileEncoding(): String = {
        return "UTF-8";
    }

    // -----------------------------------------------------
    //                               Statement Configuration
    //                               -----------------------
    def assistDefaultStatementConfig(): StatementConfig = {
        return DBFluteConfig.getDefaultStatementConfig();
    }

    // -----------------------------------------------------
    //                            Behavior Exception Thrower
    //                            --------------------------
    def assistBehaviorExceptionThrower(): BehaviorExceptionThrower = {
        return new BehaviorExceptionThrower();
    }

    // -----------------------------------------------------
    //                                 Geared Cipher Manager
    //                                 ---------------------
    def assistGearedCipherManager(): GearedCipherManager = {
        return DBFluteConfig.getGearedCipherManager();
    }

    // -----------------------------------------------------
    //                                    Resource Parameter
    //                                    ------------------
    def assistResourceParameter(): ResourceParameter = {
        val parameter: ResourceParameter = newResourceParameter();
        parameter.setOutsideSqlPackage(DBFluteConfig.getOutsideSqlPackage());
        parameter.setLogDateFormat(DBFluteConfig.getLogDateFormat());
        parameter.setLogTimestampFormat(DBFluteConfig.getLogTimestampFormat());
        parameter.setInternalDebug(DBFluteConfig.isInternalDebug());
        return parameter;
    }

    protected def newResourceParameter(): ResourceParameter = {
        return new ResourceParameter();
    }

    // -----------------------------------------------------
    //                                          Invoke Names
    //                                          ------------
    def assistClientInvokeNames(): Array[String] = {
        return DEFAULT_CLIENT_INVOKE_NAMES;
    }

    def assistByPassInvokeNames(): Array[String] = {
        return DEFAULT_BYPASS_INVOKE_NAMES;
    }

    // ===================================================================================
    //                                                                             Dispose
    //                                                                             =======
    def toBeDisposable(callerProcess: InvokerAssistant.DisposableProcess): Unit = { // for HotDeploy
        // do nothing: unsupported at this DI container
    }

    def isDisposable(): Boolean = {
        return _disposable;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    def setDataSource(dataSource: DataSource): Unit = {
        _dataSource = dataSource;
    }

    // to check the initializer is an instance of DBFluteInitializer
    // when the initializer is extended by DBFlute property
    // so this variable is actually unused in this class
    // (needs to be injected only when the DI container
    // is set by its DI setting file)
    def setIntroduction(introduction: DBFluteInitializer): Unit = {
        _introduction = introduction;
    }
}
