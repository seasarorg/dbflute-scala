package com.example.dbflute.scala.dbflute.allcommon;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Timestamp;
import javax.sql.DataSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.QLog;
import org.seasar.dbflute.XLog;
import org.seasar.dbflute.bhv.core.supplement.SequenceCacheKeyGenerator;
import org.seasar.dbflute.cbean.cipher.GearedCipherManager;
import org.seasar.dbflute.cbean.sqlclause.SqlClauseCreator;
import org.seasar.dbflute.dbmeta.name.SqlNameFilter;
import org.seasar.dbflute.exception.IllegalDBFluteConfigAccessException;
import org.seasar.dbflute.jdbc.DataSourceHandler;
import org.seasar.dbflute.jdbc.NotClosingConnectionWrapper;
import org.seasar.dbflute.jdbc.PhysicalConnectionDigger;
import org.seasar.dbflute.jdbc.SQLExceptionDigger;
import org.seasar.dbflute.jdbc.StatementConfig;
import org.seasar.dbflute.jdbc.ValueType;
import org.seasar.dbflute.outsidesql.factory.OutsideSqlExecutorFactory;
import org.seasar.dbflute.s2dao.valuetype.TnValueTypes;
import org.seasar.dbflute.s2dao.valuetype.plugin.OracleAgent;
import org.seasar.dbflute.s2dao.valuetype.plugin.OracleDateType;
import org.seasar.dbflute.s2dao.valuetype.plugin.OracleArrayType;
import org.seasar.dbflute.s2dao.valuetype.plugin.OracleStructType;
import org.seasar.dbflute.twowaysql.DisplaySqlBuilder;
import org.seasar.dbflute.util.DfReflectionUtil;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Types;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.seasar.dbflute.s2dao.valuetype.TnAbstractValueType;
import org.seasar.dbflute.util.DfTypeUtil;

/**
 * @author DBFlute(AutoGenerator)
 */
object DBFluteConfig {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Log instance. */
    private val _log: Log = LogFactory.getLog(getClass());

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                         Configuration
    //                                         -------------
    // condition-bean or parameter-bean
    protected var _pagingCountLater: Boolean = true;
    protected var _pagingCountLeastJoin: Boolean = true;
    protected var _innerJoinAutoDetect: Boolean = true;
    protected var _thatsBadTimingDetect: Boolean = true;
    protected var _nullOrEmptyQueryAllowed: Boolean = false;
    protected var _emptyStringQueryAllowed: Boolean = false;
    protected var _emptyStringParameterAllowed: Boolean = false;
    protected var _overridingQueryAllowed: Boolean = false;
    protected var _disableSelectIndex: Boolean = false;
    protected var _queryUpdateCountPreCheck: Boolean = false;

    // logging
    protected var _queryLogLevelInfo: Boolean = false;
    protected var _executeStatusLogLevelInfo: Boolean = false;
    protected var _logDateFormat: String = null;
    protected var _logTimestampFormat: String = null;

    // environment
    protected var _defaultStatementConfig: StatementConfig = null;
    protected var _cursorSelectFetchSize: Integer = 17;
    protected var _dataSourceHandler: DataSourceHandler = null;
    protected var _physicalConnectionDigger: PhysicalConnectionDigger = null;
    protected var _sqlExceptionDigger: SQLExceptionDigger = null;
    protected var _outsideSqlPackage: String = null;
    protected var _useSqlLogRegistry: Boolean = false;

    // extension
    protected var _sequenceCacheKeyGenerator: SequenceCacheKeyGenerator = null;
    protected var _sqlClauseCreator: SqlClauseCreator = null;
    protected var _tableSqlNameFilter: SqlNameFilter = null;
    protected var _outsideSqlExecutorFactory: OutsideSqlExecutorFactory = null;
    protected var _gearedCipherManager: GearedCipherManager = null;

    // internal
    protected var _internalDebug: Boolean = false;

    // -----------------------------------------------------
    //                                   Database Dependency
    //                                   -------------------

    // -----------------------------------------------------
    //                                                  Lock
    //                                                  ----
    protected var _locked: Boolean = true; // at first locked

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    // adjusts default settings
    _physicalConnectionDigger = new ImplementedPhysicalConnectionDigger();
    _sqlExceptionDigger = new ImplementedSQLExceptionDigger();

    if (isCurrentDBDef(DBDef.Oracle)) {
        // date formatting has two points:
        //   o the DATE type of Oracle has seconds  
        //   o it uses a date literal of Oracle
        _logDateFormat = "timestamp $df:{yyyy-MM-dd HH:mm:ss}";
        _logTimestampFormat = "timestamp $df:{" + DisplaySqlBuilder.DEFAULT_TIMESTAMP_FORMAT + "}";
    }

    // uses JodaTime
    TnValueTypes.registerBasicValueType(currentDBDef(), classOf[LocalDate], new JodaLocalDateType());
    TnValueTypes.registerBasicValueType(currentDBDef(), classOf[LocalDateTime], new JodaLocalDateTimeType());
    TnValueTypes.registerBasicValueType(currentDBDef(), classOf[LocalTime], new JodaLocalTimeType());

    // ===================================================================================
    //                                                                       Paging Select
    //                                                                       =============
    def isPagingCountLater(): Boolean = {
        return _pagingCountLater;
    }

    def setPagingCountLater(pagingCountLater: Boolean): Unit = {
        assertNotLocked();
        if (_log.isInfoEnabled()) {
            _log.info("...Setting pagingCountLater: " + pagingCountLater);
        }
        _pagingCountLater = pagingCountLater;
    }

    def isPagingCountLeastJoin(): Boolean = {
        return _pagingCountLeastJoin;
    }

    def setPagingCountLeastJoin(pagingCountLeastJoin: Boolean): Unit = {
        assertNotLocked();
        if (_log.isInfoEnabled()) {
            _log.info("...Setting pagingCountLeastJoin: " + pagingCountLeastJoin);
        }
        _pagingCountLeastJoin = pagingCountLeastJoin;
    }

    // ===================================================================================
    //                                                                          Inner Join
    //                                                                          ==========
    def isInnerJoinAutoDetect(): Boolean = {
        return _innerJoinAutoDetect;
    }

    def setInnerJoinAutoDetect(innerJoinAutoDetect: Boolean): Unit = {
        assertNotLocked();
        if (_log.isInfoEnabled()) {
            _log.info("...Setting innerJoinAutoDetect: " + innerJoinAutoDetect);
        }
        _innerJoinAutoDetect = innerJoinAutoDetect;
    }

    // ===================================================================================
    //                                                                   That's Bad Timing
    //                                                                   =================
    def isThatsBadTimingDetect(): Boolean = {
        return _thatsBadTimingDetect;
    }

    def setThatsBadTimingDetect(thatsBadTimingDetect: Boolean): Unit = {
        assertNotLocked();
        if (_log.isInfoEnabled()) {
            _log.info("...Setting thatsBadTimingDetect: " + thatsBadTimingDetect);
        }
        _thatsBadTimingDetect = thatsBadTimingDetect;
    }

    // ===================================================================================
    //                                                                       Invalid Query
    //                                                                       =============
    def isNullOrEmptyQueryAllowed(): Boolean = {
        return _nullOrEmptyQueryAllowed;
    }

    /**
     * Set whether null-or-empty query is allowed or not. <br />
     * This configuration is only for ConditionBean.
     * @param nullOrEmptyQueryAllowed The determination, true or false.
     */
    def setNullOrEmptyQueryAllowed(nullOrEmptyQueryAllowed: Boolean): Unit = {
        assertNotLocked();
        if (_log.isInfoEnabled()) {
            _log.info("...Setting nullOrEmptyQueryAllowed: " + nullOrEmptyQueryAllowed);
        }
        _nullOrEmptyQueryAllowed = nullOrEmptyQueryAllowed;
    }

    def isEmptyStringQueryAllowed(): Boolean = {
        return _emptyStringQueryAllowed;
    }

    /**
     * Set whether an empty string for query is allowed or not. <br />
     * This configuration is only for ConditionBean.
     * @param emptyStringQueryAllowed The determination, true or false.
     */
    def setEmptyStringQueryAllowed(emptyStringQueryAllowed: Boolean): Unit = {
        assertNotLocked();
        if (_log.isInfoEnabled()) {
            _log.info("...Setting emptyStringQueryAllowed: " + emptyStringQueryAllowed);
        }
        _emptyStringQueryAllowed = emptyStringQueryAllowed;
    }

    def isEmptyStringParameterAllowed(): Boolean = {
        return _emptyStringParameterAllowed;
    }

    /**
     * Set whether an empty string for parameter is allowed or not. <br />
     * This configuration is only for ParameterBean.
     * @param emptyStringParameterAllowed The determination, true or false.
     */
    def setEmptyStringParameterAllowed(emptyStringParameterAllowed: Boolean): Unit = {
        assertNotLocked();
        if (_log.isInfoEnabled()) {
            _log.info("...Setting emptyStringParameterAllowed: " + emptyStringParameterAllowed);
        }
        _emptyStringParameterAllowed = emptyStringParameterAllowed;
    }

    def isOverridingQueryAllowed(): Boolean = {
        return _overridingQueryAllowed;
    }

    /**
     * Set whether overriding query is allowed or not. <br />
     * This configuration is only for ConditionBean.
     * @param overridingQueryAllowed The determination, true or false.
     */
    def setOverridingQueryAllowed(overridingQueryAllowed: Boolean): Unit = {
        assertNotLocked();
        if (_log.isInfoEnabled()) {
            _log.info("...Setting overridingQueryAllowed: " + overridingQueryAllowed);
        }
        _overridingQueryAllowed = overridingQueryAllowed;
    }

    // ===================================================================================
    //                                                                        Select Index
    //                                                                        ============
    def isDisableSelectIndex(): Boolean = {
        return _disableSelectIndex;
    }

    def setDisableSelectIndex(disableSelectIndex: Boolean): Unit = {
        assertNotLocked();
        if (_log.isInfoEnabled()) {
            _log.info("...Setting disableSelectIndex: " + disableSelectIndex);
        }
        _disableSelectIndex = disableSelectIndex;
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    def isQueryUpdateCountPreCheck(): Boolean = {
        return _queryUpdateCountPreCheck;
    }

    def setQueryUpdateCountPreCheck(queryUpdateCountPreCheck: Boolean): Unit = {
        assertNotLocked();
        if (_log.isInfoEnabled()) {
            _log.info("...Setting queryUpdateCountPreCheck: " + queryUpdateCountPreCheck);
        }
        _queryUpdateCountPreCheck = queryUpdateCountPreCheck;
    }

    // ===================================================================================
    //                                                                Query Log Level Info
    //                                                                ====================
    def setQueryLogLevelInfo(queryLogLevelInfo: Boolean): Unit = {
        assertNotLocked();
        if (_log.isInfoEnabled()) {
            _log.info("...Setting queryLogLevelInfo: " + queryLogLevelInfo);
        }
        QLog.unlock();
        QLog.setQueryLogLevelInfo(queryLogLevelInfo);
        QLog.lock();
    }

    // ===================================================================================
    //                                                       Execute Status Log Level Info
    //                                                       =============================
    def setExecuteStatusLogLevelInfo(executeStatusLogLevelInfo: Boolean): Unit = {
        assertNotLocked();
        if (_log.isInfoEnabled()) {
            _log.info("...Setting executeStatusLogLevelInfo: " + executeStatusLogLevelInfo);
        }
        XLog.unlock();
        XLog.setExecuteStatusLogLevelInfo(executeStatusLogLevelInfo);
        XLog.lock();
    }

    // ===================================================================================
    //                                                                          Log Format
    //                                                                          ==========
    def getLogDateFormat(): String = {
        return _logDateFormat;
    }

    def setLogDateFormat(logDateFormat: String): Unit = {
        assertNotLocked();
        if (_log.isInfoEnabled()) {
            _log.info("...Setting logDateFormat: " + logDateFormat);
        }
        _logDateFormat = logDateFormat;
    }

    def getLogTimestampFormat(): String = {
        return _logTimestampFormat;
    }

    def setLogTimestampFormat(logTimestampFormat: String): Unit = {
        assertNotLocked();
        if (_log.isInfoEnabled()) {
            _log.info("...Setting logTimestampFormat: " + logTimestampFormat);
        }
        _logTimestampFormat = logTimestampFormat;
    }

    // ===================================================================================
    //                                                             Default StatementConfig
    //                                                             =======================
    def getDefaultStatementConfig(): StatementConfig = {
        return _defaultStatementConfig;
    }

    def setDefaultStatementConfig(defaultStatementConfig: StatementConfig): Unit = {
        assertNotLocked();
        if (_log.isInfoEnabled()) {
            _log.info("...Setting defaultStatementConfig: " + defaultStatementConfig);
        }
        _defaultStatementConfig = defaultStatementConfig;
    }

    // ===================================================================================
    //                                                              CursorSelect FetchSize
    //                                                              ======================
    def getCursorSelectFetchSize(): Integer = {
        return _cursorSelectFetchSize;
    }

    def setCursorSelectFetchSize(cursorSelectFetchSize: Integer): Unit = {
        assertNotLocked();
        if (_log.isInfoEnabled()) {
            _log.info("...Setting cursorSelectFetchSize: " + cursorSelectFetchSize);
        }
        _cursorSelectFetchSize = cursorSelectFetchSize;
    }

    // [DBFlute-0.9.0]
    // ===================================================================================
    //                                                                  DataSource Handler
    //                                                                  ==================
    /**
     * @return The handler of data source. (NullAllowed)
     */
    def getDataSourceHandler(): DataSourceHandler = {
        return _dataSourceHandler;
    }

    /**
     * @param dataSourceHandler The handler of data source. (NullAllowed)
     */
    def setDataSourceHandler(dataSourceHandler: DataSourceHandler): Unit = {
        assertNotLocked();
        if (_log.isInfoEnabled()) {
            _log.info("...Setting dataSourceHandler: " + dataSourceHandler);
        }
        _dataSourceHandler = dataSourceHandler;
    }

    // [DBFlute-0.9.7.6]
    // ===================================================================================
    //                                                           PhysicalConnection Digger
    //                                                           =========================
    /**
     * @return The digger of physical connection. (NotNull: has a default instance)
     */
    def getPhysicalConnectionDigger(): PhysicalConnectionDigger = {
        return _physicalConnectionDigger;
    }

    /**
     * @param physicalConnectionDigger The digger of physical connection. (NotNull)
     */
    def setPhysicalConnectionDigger(physicalConnectionDigger: PhysicalConnectionDigger): Unit = {
        assertNotLocked();
        if (_log.isInfoEnabled()) {
            _log.info("...Setting physicalConnectionDigger: " + physicalConnectionDigger);
        }
        if (physicalConnectionDigger == null) {
            throw new IllegalArgumentException("The argument 'physicalConnectionDigger' should not be null.");
        }
        _physicalConnectionDigger = physicalConnectionDigger;
    }

    // [DBFlute-0.9.7.8]
    // ===================================================================================
    //                                                                 SQLException Digger
    //                                                                 ===================
    /**
     * @return The digger of SQLException. (NotNull: has a default instance)
     */
    def getSQLExceptionDigger(): SQLExceptionDigger = {
        return _sqlExceptionDigger;
    }

    /**
     * @param sqlExceptionDigger The digger of SQLException. (NotNull)
     */
    def setSQLExceptionDigger(sqlExceptionDigger: SQLExceptionDigger): Unit = {
        assertNotLocked();
        if (_log.isInfoEnabled()) {
            _log.info("...Setting sqlExceptionDigger: " + sqlExceptionDigger);
        }
        if (sqlExceptionDigger == null) {
            throw new IllegalArgumentException("The argument 'sqlExceptionDigger' should not be null.");
        }
        _sqlExceptionDigger = sqlExceptionDigger;
    }

    // ===================================================================================
    //                                                                  OutsideSql Package
    //                                                                  ==================
    /**
     * @return The package of outside SQL. (NullAllowed)
     */
    def getOutsideSqlPackage(): String = {
        return _outsideSqlPackage;
    }

    /**
     * @param outsideSqlPackage The package of outside SQL. (NullAllowed)
     */
    def setOutsideSqlPackage(outsideSqlPackage: String): Unit = {
        assertNotLocked();
        if (_log.isInfoEnabled()) {
            _log.info("...Setting outsideSqlPackage: " + outsideSqlPackage);
        }
        _outsideSqlPackage = outsideSqlPackage;
    }

    // [DBFlute-0.8.2]
    // ===================================================================================
    //                                                                    SQL Log Registry
    //                                                                    ================
    def isUseSqlLogRegistry(): Boolean = {
        return _useSqlLogRegistry;
    }

    def setUseSqlLogRegistry(useSqlLogRegistry: Boolean): Unit = {
        assertNotLocked();
        if (_log.isInfoEnabled()) {
            _log.info("...Setting useSqlLogRegistry: " + useSqlLogRegistry);
        }
        _useSqlLogRegistry = useSqlLogRegistry;
    }

    // [DBFlute-0.9.6.4]
    // ===================================================================================
    //                                                                      Sequence Cache
    //                                                                      ==============
    /**
     * @return The key generator of sequence cache. (NullAllowed)
     */
    def getSequenceCacheKeyGenerator(): SequenceCacheKeyGenerator = {
        return _sequenceCacheKeyGenerator;
    }

    /**
     * @param sequenceCacheKeyGenerator The key generator of sequence cache. (NullAllowed)
     */
    def setSequenceCacheKeyGenerator(sequenceCacheKeyGenerator: SequenceCacheKeyGenerator): Unit = {
        assertNotLocked();
        if (_log.isInfoEnabled()) {
            _log.info("...Setting sequenceCacheKeyGenerator: " + sequenceCacheKeyGenerator);
        }
        _sequenceCacheKeyGenerator = sequenceCacheKeyGenerator;
    }

    // [DBFlute-0.9.6.9]
    // ===================================================================================
    //                                                                   SqlClause Creator
    //                                                                   =================
    /**
     * @return The creator of SQL clause. (NullAllowed)
     */
    def getSqlClauseCreator(): SqlClauseCreator = {
        return _sqlClauseCreator;
    }

    /**
     * @param sqlClauseCreator The creator of SQL clause. (NullAllowed)
     */
    def setSqlClauseCreator(sqlClauseCreator: SqlClauseCreator): Unit = {
        assertNotLocked();
        if (_log.isInfoEnabled()) {
            _log.info("...Setting sqlClauseCreator: " + sqlClauseCreator);
        }
        _sqlClauseCreator = sqlClauseCreator;
    }

    // [DBFlute-0.9.7.6]
    // ===================================================================================
    //                                                                 TableSqlName Filter
    //                                                                 ===================
    /**
     * @return The SQL name filter for table. (NullAllowed)
     */
    def getTableSqlNameFilter(): SqlNameFilter = {
        return _tableSqlNameFilter;
    }

    /**
     * Set the SQL name filter for table. <br />
     * This setting should be called before container's initialization.
     * (its exact meaning is: before class loading of DBMeta for table)
     * @param tableSqlNameFilter The SQL name filter for table. (NullAllowed)
     */
    def setTableSqlNameFilter(tableSqlNameFilter: SqlNameFilter): Unit = {
        assertNotLocked();
        if (_log.isInfoEnabled()) {
            _log.info("...Setting tableSqlNameFilter: " + tableSqlNameFilter);
        }
        _tableSqlNameFilter = tableSqlNameFilter;
    }

    // [DBFlute-0.9.7.0]
    // ===================================================================================
    //                                                                 OutsideSql Executor
    //                                                                 ===================
    def getOutsideSqlExecutorFactory(): OutsideSqlExecutorFactory = {
        return _outsideSqlExecutorFactory;
    }

    def setOutsideSqlExecutorFactory(outsideSqlExecutorFactory: OutsideSqlExecutorFactory): Unit = {
        assertNotLocked();
        if (_log.isInfoEnabled()) {
            _log.info("...Setting outsideSqlExecutorFactory: " + outsideSqlExecutorFactory);
        }
        _outsideSqlExecutorFactory = outsideSqlExecutorFactory;
    }

    // [DBFlute-0.9.7.0]
    // ===================================================================================
    //                                                               Geared Cipher Manager
    //                                                               =====================
    def getGearedCipherManager(): GearedCipherManager = {
        return _gearedCipherManager;
    }

    def setGearedCipherManager(gearedCipherManager: GearedCipherManager): Unit = {
        assertNotLocked();
        if (_log.isInfoEnabled()) {
            _log.info("...Setting gearedCipherManager: " + gearedCipherManager);
        }
        _gearedCipherManager = gearedCipherManager;
    }

    // ===================================================================================
    //                                                                 Database Dependency
    //                                                                 ===================

    // ===================================================================================
    //                                                                      Internal Debug
    //                                                                      ==============
    def isInternalDebug(): Boolean = {
        return _internalDebug;
    }

    def setInternalDebug(internalDebug: Boolean): Unit = {
        assertNotLocked();
        if (_log.isInfoEnabled()) {
            _log.info("...Setting internalDebug: " + internalDebug);
        }
        _internalDebug = internalDebug;
    }

    // ===================================================================================
    //                                                                          Value Type
    //                                                                          ==========
    /**
     * Register the basic value type. <br />
     * This setting is shared per DBMS in the same class loader. 
     * @param keyType The type as key. (NotNull)
     * @param valueType The basic value type. (NotNull)
     */
    def registerBasicValueType(keyType: Class[_], valueType: ValueType): Unit = {
        assertNotLocked();
        if (_log.isInfoEnabled()) {
            _log.info("...Registering basic valueType: " + keyType + " = " + valueType);
        }
        TnValueTypes.registerBasicValueType(currentDBDef(), keyType, valueType);
    }

    def removeBasicValueType(keyType: Class[_]): Unit = {
        assertNotLocked();
        if (_log.isInfoEnabled()) {
            _log.info("...Removing basic valueType: " + keyType);
        }
        TnValueTypes.removeBasicValueType(currentDBDef(), keyType);
    }

    /**
     * Register the plug-in value type. <br />
     * This setting is shared per DBMS in the same class loader.
     * @param keyName The name as key. (NotNull)
     * @param valueType The plug-in value type. (NotNull)
     */
    def registerPluginValueType(keyName: String, valueType: ValueType): Unit = {
        assertNotLocked();
        if (_log.isInfoEnabled()) {
            _log.info("...Registering plug-in valueType: " + keyName + " = " + valueType);
        }
        TnValueTypes.registerPluginValueType(currentDBDef(), keyName, valueType);
    }

    def removePluginValueType(keyName: String): Unit = {
        assertNotLocked();
        if (_log.isInfoEnabled()) {
            _log.info("...Removing plug-in valueType: keyName=" + keyName);
        }
        TnValueTypes.removePluginValueType(currentDBDef(), keyName);
    }

    // ===================================================================================
    //                                                                  Configuration Lock
    //                                                                  ==================
    def isLocked(): Boolean = {
        return _locked;
    }

    def lock(): Unit = {
        if (_locked) {
            return;
        }
        if (_log.isInfoEnabled()) {
            _log.info("...Locking the configuration of DBFlute");
        }
        _locked = true;
    }

    def unlock(): Unit = {
        if (!_locked) {
            return;
        }
        if (_log.isInfoEnabled()) {
            _log.info("...Unlocking the configuration of DBFlute");
        }
        _locked = false;
    }

    protected def assertNotLocked(): Unit = {
        if (!isLocked()) {
            return;
        }
        val msg = "The configuration of DBFlute is locked.";
        throw new IllegalDBFluteConfigAccessException(msg);
    }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    protected def currentDBDef(): DBDef = {
        return DBCurrent.currentDBDef();
    }

    protected def isCurrentDBDef(currentDBDef: DBDef): Boolean = {
        return DBCurrent.isCurrentDBDef(currentDBDef);
    }

    // ===================================================================================
    //                                                                   Implemented Class
    //                                                                   =================
    // -----------------------------------------------------
    //                                                Spring
    //                                                ------
    class SpringTransactionalDataSourceHandler extends DataSourceHandler {

        def getConnection(ds: DataSource): Connection = {
            val conn: Connection = getConnectionFromUtils(ds);
            if (isConnectionTransactional(conn, ds)) {
                return new NotClosingConnectionWrapper(conn);
            } else {
                return conn;
            }
        }

        def getConnectionFromUtils(ds: DataSource): Connection = {
            throw new IllegalStateException("This method is only for Spring Framework.");
        }

        def isConnectionTransactional(conn: Connection, ds: DataSource): Boolean = {
            throw new IllegalStateException("This method is only for Spring Framework.");
        }
    }

    // -----------------------------------------------------
    //                                                Oracle
    //                                                ------
    class ImplementedOracleAgent extends OracleAgent {

        def toOracleDate(timestamp: Timestamp): Object = {
            throw new UnsupportedOperationException("This method is only for Oracle.");
        }

        def toOracleArray(conn: Connection, arrayTypeName: String, arrayValue: Object): Object = {
            throw new UnsupportedOperationException("This method is only for Oracle.");
        }

        def toStandardArray(oracleArray: Object): Object = {
            throw new UnsupportedOperationException("This method is only for Oracle.");
        }

        def isOracleArray(obj: Object): Boolean = {
            throw new UnsupportedOperationException("This method is only for Oracle.");
        }

        def toOracleStruct(conn: Connection, structTypeName: String, attrs: Array[Object]): Object = {
            throw new UnsupportedOperationException("This method is only for Oracle.");
        }

        def toStandardStructAttributes(oracleStruct: Object): Array[Object] = {
            throw new UnsupportedOperationException("This method is only for Oracle.");
        }

        def isOracleStruct(obj: Object): Boolean = {
            throw new UnsupportedOperationException("This method is only for Oracle.");
        }

        def getPhysicalConnectionDigger(): PhysicalConnectionDigger = {
            return DBFluteConfig.getPhysicalConnectionDigger();
        }
    }

    class ImplementedOracleDateType extends OracleDateType {

        @Override
        protected def createOracleAgent(): OracleAgent = {
            return new ImplementedOracleAgent();
        }
    }

    class ImplementedOracleArrayType(arrayTypeName: String, elementType: Class[_]) extends OracleArrayType(arrayTypeName, elementType) {

        @Override
        protected def createOracleAgent(): OracleAgent = {
            return new ImplementedOracleAgent();
        }
    }

    class ImplementedOracleStructType(structTypeName: String, entityType: Class[_]) extends OracleStructType(structTypeName, entityType) {

        @Override
        protected def createOracleAgent(): OracleAgent = {
            return new ImplementedOracleAgent();
        }
    }

    // -----------------------------------------------------
    //                                   Physical Connection
    //                                   -------------------
    class ImplementedPhysicalConnectionDigger extends PhysicalConnectionDigger {

        def digUp(conn: Connection): Connection = {
            var digged: Connection = unwrap(conn);
            digged = resolveS2DBCP(digged);
            digged = resolveCommonsDBCP(digged);
            return digged;
        }

        protected def unwrap(conn: Connection): Connection = {
            if (conn.isInstanceOf[NotClosingConnectionWrapper]) {
                return conn.asInstanceOf[NotClosingConnectionWrapper].getActualConnection();
            }
            return conn;
        }

        protected def resolveS2DBCP(conn: Connection): Connection = {
            return conn;
        }

        protected def resolveCommonsDBCP(conn: Connection): Connection = {
            var resolved: Connection = conn;
            if ("org.apache.commons.dbcp.PoolingDataSource$PoolGuardConnectionWrapper".equals(resolved.getClass().getName())) {
                resolved = getFieldConnection(resolved, "delegate");
            }
            if ("org.apache.commons.dbcp.PoolableConnection".equals(resolved.getClass().getName())) {
                resolved = getFieldConnection(resolved, "_conn");
            }
            return resolved;
        }

        protected def getFieldConnection(conn: Connection, fieldName: String): Connection = {
            val field: Field = DfReflectionUtil.getWholeField(conn.getClass(), fieldName);
            return DfReflectionUtil.getValueForcedly(field, conn).asInstanceOf[Connection];
        }
    }

    // -----------------------------------------------------
    //                                          SQLException
    //                                          ------------
    class ImplementedSQLExceptionDigger extends SQLExceptionDigger {

        def digUp(cause: Throwable): SQLException = {
            var found: SQLException = resolveS2DBCP(cause);
            if (found != null) {
                return found;
            }
            found = resolveDefault(cause);
            if (found != null) {
                return found;
            }
            return null;
        }

        protected def resolveS2DBCP(cause: Throwable): SQLException = {
            return null;
        }

        protected def resolveDefault(cause: Throwable):SQLException = {
            val nestedCause: Throwable = cause.getCause();
            if (nestedCause.isInstanceOf[SQLException]) {
                return nestedCause.asInstanceOf[SQLException];
            }
            return null;
        }
    }

    // ===================================================================================
    //                                                                      JodaTime Class
    //                                                                      ==============
    class JodaLocalDateType extends TnAbstractValueType(Types.DATE) {

        def getValue(rs: ResultSet, index: Int): Object = {
            return toLocalDate(rs.getDate(index));
        }

        def getValue(rs: ResultSet, columnName: String): Object = {
            return toLocalDate(rs.getDate(columnName));
        }

        def getValue(cs: CallableStatement, index: Int): Object = {
            return toLocalDate(cs.getDate(index));
        }

        def getValue(cs: CallableStatement, parameterName: String): Object = {
            return toLocalDate(cs.getDate(parameterName));
        }

        def bindValue(conn: Connection, ps: PreparedStatement, index: Int, value: Object): Unit = {
            if (value == null) {
                setNull(ps, index);
            } else {
                ps.setDate(index, toSqlDate(value));
            }
        }

        def bindValue(conn: Connection, cs: CallableStatement, parameterName: String, value: Object): Unit = {
            if (value == null) {
                setNull(cs, parameterName);
            } else {
                cs.setDate(parameterName, toSqlDate(value));
            }
        }

        protected def toLocalDate(date: java.sql.Date): LocalDate = {
            return if (date != null) { LocalDate.fromDateFields(date) } else { null };
        }

        protected def toSqlDate(date: Object): java.sql.Date = {
            if (date != null && date.isInstanceOf[ReadablePartial]) {
                return new java.sql.Date(date.asInstanceOf[ReadablePartial].toDateTime(null).withTimeAtStartOfDay().getMillis());
            } else if (date != null && date.isInstanceOf[ReadableInstant]) {
                return new java.sql.Date(date.asInstanceOf[ReadableInstant].getMillis());
            }
            return DfTypeUtil.toSqlDate(date);
        }
    }

    class JodaLocalDateTimeType extends TnAbstractValueType(Types.TIMESTAMP) {

        def getValue(rs: ResultSet, index: Int): Object = {
            return toLocalDateTime(rs.getTimestamp(index));
        }

        def getValue(rs: ResultSet, columnName: String ): Object = {
            return toLocalDateTime(rs.getTimestamp(columnName));
        }

        def getValue(cs: CallableStatement, index: Int): Object = {
            return toLocalDateTime(cs.getTimestamp(index));
        }

        def getValue(cs: CallableStatement, parameterName: String): Object = {
            return toLocalDateTime(cs.getTimestamp(parameterName));
        }

        def bindValue(conn: Connection, ps: PreparedStatement, index: Int, value: Object): Unit = {
            if (value == null) {
                setNull(ps, index);
            } else {
                ps.setTimestamp(index, toTimestamp(value));
            }
        }

        def bindValue(conn: Connection, cs: CallableStatement, parameterName: String, value: Object): Unit = {
            if (value == null) {
                setNull(cs, parameterName);
            } else {
                cs.setTimestamp(parameterName, toTimestamp(value));
            }
        }

        protected def toLocalDateTime(timestamp: java.sql.Timestamp): LocalDateTime = {
            return if (timestamp != null) { LocalDateTime.fromDateFields(timestamp) } else { null };
        }

        protected def toTimestamp(date: Object): java.sql.Timestamp = {
            if (date != null && date.isInstanceOf[ReadablePartial]) {
                return new java.sql.Timestamp(date.asInstanceOf[ReadablePartial].toDateTime(null).getMillis());
            } else if (date != null && date.isInstanceOf[ReadableInstant]) {
                return new java.sql.Timestamp(date.asInstanceOf[ReadableInstant].getMillis());
            }
            return DfTypeUtil.toTimestamp(date);
        }
    }

    class JodaLocalTimeType extends TnAbstractValueType(Types.TIME) {

        def getValue(rs: ResultSet, index: Int): Object = {
            return toLocalTime(rs.getTime(index));
        }

        def getValue(rs: ResultSet, columnName: String ): Object = {
            return toLocalTime(rs.getTime(columnName));
        }

        def getValue(cs: CallableStatement, index: Int): Object = {
            return toLocalTime(cs.getTime(index));
        }

        def getValue(cs: CallableStatement, parameterName: String): Object = {
            return toLocalTime(cs.getTime(parameterName));
        }

        def bindValue(conn: Connection, ps: PreparedStatement, index: Int, value: Object): Unit = {
            if (value == null) {
                setNull(ps, index);
            } else {
                ps.setTime(index, toTime(value));
            }
        }

        def bindValue(conn: Connection, cs: CallableStatement, parameterName: String, value: Object): Unit = {
            if (value == null) {
                setNull(cs, parameterName);
            } else {
                cs.setTime(parameterName, toTime(value));
            }
        }

        protected def toLocalTime(time: java.sql.Time): LocalTime = {
            return if (time != null) { LocalTime.fromDateFields(time) } else { null };
        }

        protected def toTime(date: Object): java.sql.Time = {
            if (date != null && date.isInstanceOf[ReadablePartial]) {
                return new java.sql.Time(date.asInstanceOf[ReadablePartial].toDateTime(null).getMillis());
            } else if (date != null && date.isInstanceOf[ReadableInstant]) {
                return new java.sql.Time(date.asInstanceOf[ReadableInstant].getMillis());
            }
            return DfTypeUtil.toTime(date);
        }
    }
}
