package com.example.dbflute.scala.dbflute.allcommon;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.cbean.ConditionBean;
import org.seasar.dbflute.cbean.cipher.GearedCipherManager;
import org.seasar.dbflute.cbean.sqlclause._
import org.seasar.dbflute.dbmeta.DBMetaProvider;

/**
 * The creator of SQL clause.
 * @author DBFlute(AutoGenerator)
 */
class ImplementedSqlClauseCreator extends SqlClauseCreator {

    // ===================================================================================
    //                                                                      Implementation
    //                                                                      ==============
	/**
	 * Create SQL clause. {for condition-bean}
	 * @param cb Condition-bean. (NotNull) 
	 * @return SQL clause. (NotNull)
	 */
    def createSqlClause(cb: ConditionBean): SqlClause = {
        val tableDbName: String = cb.getTableDbName();
		val sqlClause: SqlClause = createSqlClause(tableDbName);
        return sqlClause;
    }

	/**
	 * Create SQL clause.
	 * @param tableDbName The DB name of table. (NotNull) 
	 * @return SQL clause. (NotNull)
	 */
    def createSqlClause(tableDbName: String): SqlClause = {
        val sqlClause: SqlClause = doCreateSqlClause(tableDbName);
        setupSqlClauseOption(sqlClause);
        return sqlClause;
    }

    // ===================================================================================
    //                                                                            Creation
    //                                                                            ========
    protected def doCreateSqlClause(tableDbName: String): SqlClause = {
        // dynamic resolution but no perfect (almost static)
        val sqlClause: AbstractSqlClause = if (isCurrentDBDef(DBDef.MySQL)) {
            createSqlClauseMySql(tableDbName);
        } else if (isCurrentDBDef(DBDef.PostgreSQL)) {
            createSqlClausePostgreSql(tableDbName);
        } else if (isCurrentDBDef(DBDef.Oracle)) {
            createSqlClauseOracle(tableDbName);
        } else if (isCurrentDBDef(DBDef.DB2)) {
            createSqlClauseDb2(tableDbName);
        } else if (isCurrentDBDef(DBDef.SQLServer)) {
            createSqlClauseSqlServer(tableDbName);
        } else if (isCurrentDBDef(DBDef.H2)) {
            createSqlClauseH2(tableDbName);
        } else if (isCurrentDBDef(DBDef.Derby)) {
            createSqlClauseDerby(tableDbName);
        } else if (isCurrentDBDef(DBDef.SQLite)) {
            createSqlClauseSqlite(tableDbName);
        } else if (isCurrentDBDef(DBDef.MSAccess)) {
            createSqlClauseMsAccess(tableDbName);
        } else if (isCurrentDBDef(DBDef.Firebird)) {
            createSqlClauseFirebird(tableDbName);
        } else if (isCurrentDBDef(DBDef.Sybase)) {
            createSqlClauseSybase(tableDbName);
        } else {
            // as the database when generating
            createSqlClauseH2(tableDbName);
        }
        prepareSupporterComponent(sqlClause);
        return sqlClause;
    }

    protected def createSqlClauseMySql(tableDbName: String): SqlClauseMySql = {
        return new SqlClauseMySql(tableDbName);
    }

    protected def createSqlClausePostgreSql(tableDbName: String): SqlClausePostgreSql = {
        return new SqlClausePostgreSql(tableDbName);
    }

    protected def createSqlClauseOracle(tableDbName: String): SqlClauseOracle = {
        return new SqlClauseOracle(tableDbName);
    }

    protected def createSqlClauseDb2(tableDbName: String): SqlClauseDb2 = {
        return new SqlClauseDb2(tableDbName);
    }

    protected def createSqlClauseSqlServer(tableDbName: String): SqlClauseSqlServer = {
        return new SqlClauseSqlServer(tableDbName);
    }

    protected def createSqlClauseH2(tableDbName: String): SqlClauseH2 = {
        return new SqlClauseH2(tableDbName);
    }

    protected def createSqlClauseDerby(tableDbName: String): SqlClauseDerby = {
        return new SqlClauseDerby(tableDbName);
    }

    protected def createSqlClauseSqlite(tableDbName: String): SqlClauseSqlite = {
        return new SqlClauseSqlite(tableDbName);
    }

    protected def createSqlClauseMsAccess(tableDbName: String): SqlClauseMsAccess = {
        return new SqlClauseMsAccess(tableDbName);
    }

    protected def createSqlClauseFirebird(tableDbName: String): SqlClauseFirebird = {
        return new SqlClauseFirebird(tableDbName);
    }

    protected def createSqlClauseSybase(tableDbName: String): SqlClauseSybase = {
        return new SqlClauseSybase(tableDbName);
    }

    protected def createSqlClauseDefault(tableDbName: String): SqlClause = {
        return new SqlClauseDefault(tableDbName);
    }

    protected def prepareSupporterComponent(sqlClause: AbstractSqlClause): Unit = {
        sqlClause.dbmetaProvider(getDBMetaProvider()).cipherManager(getGearedCipherManager());
    }

    // ===================================================================================
    //                                                                           Supporter
    //                                                                           =========
    protected def getDBMetaProvider(): DBMetaProvider = {
        return DBMetaInstanceHandler.getProvider();
    }

    protected def getGearedCipherManager(): GearedCipherManager = {
        return DBFluteConfig.getGearedCipherManager();
    }

    // ===================================================================================
    //                                                                              Option
    //                                                                              ======
    protected def setupSqlClauseOption(sqlClause: SqlClause): Unit = {
        if (isInnerJoinAutoDetect()) {
            sqlClause.enableInnerJoinAutoDetect();
        }
        if (isThatsBadTimingDetect()) {
            sqlClause.enableThatsBadTimingDetect();
        }
        if (isNullOrEmptyQueryAllowed()) {
            sqlClause.ignoreNullOrEmptyQuery();
        } else { // mainly here on Scala
            sqlClause.checkNullOrEmptyQuery();
        }
        if (isEmptyStringQueryAllowed()) {
            sqlClause.enableEmptyStringQuery();
        }
        if (isOverridingQueryAllowed()) {
            sqlClause.enableOverridingQuery();
        } else { // mainly here on Scala
            sqlClause.disableOverridingQuery();
        }
        if (isDisableSelectIndex()) {
            sqlClause.disableSelectIndex();
        }
    }

    // ===================================================================================
    //                                                                       Determination
    //                                                                       =============
    protected def isCurrentDBDef(currentDBDef: DBDef): Boolean = {
	    return DBCurrent.isCurrentDBDef(currentDBDef);
    }

    protected def isInnerJoinAutoDetect(): Boolean = {
	    return DBFluteConfig.isInnerJoinAutoDetect();
    }

    protected def isThatsBadTimingDetect(): Boolean = {
	    return DBFluteConfig.isThatsBadTimingDetect();
    }

    protected def isNullOrEmptyQueryAllowed(): Boolean = {
	    return DBFluteConfig.isNullOrEmptyQueryAllowed();
    }

    protected def isEmptyStringQueryAllowed(): Boolean = {
	    return DBFluteConfig.isEmptyStringQueryAllowed();
    }

    protected def isOverridingQueryAllowed(): Boolean = {
	    return DBFluteConfig.isOverridingQueryAllowed();
    }

    protected def isDisableSelectIndex(): Boolean = {
	    return DBFluteConfig.isDisableSelectIndex();
    }
}
