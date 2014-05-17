package com.example.dbflute.scala.dbflute.allcommon;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.cbean.ConditionBeanContext;
import org.seasar.dbflute.jdbc.DataSourceHandler;
import org.seasar.dbflute.resource.DBFluteSystem;
import org.seasar.dbflute.s2dao.extension.TnSqlLogRegistry;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @author DBFlute(AutoGenerator)
 */
class DBFluteInitializer {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Log instance. */
    private val _log: Log = LogFactory.getLog(classOf[DBFluteInitializer]);

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    {
        announce();
        prologue();
        standBy();
    }

    // ===================================================================================
    //                                                                             Curtain
    //                                                                             =======
    /**
     * DBFlute will begin in just a few second.
     */
    protected def announce(): Unit = {
        _log.info("...Initializing DBFlute components");
    }

    /**
     * This is the story for ... <br />
     * You can override this to set your DBFluteConfig settings
     * with calling super.prologue() in it.
     */
    protected def prologue(): Unit = {
    }

    /**
     * Enjoy your DBFlute life.
     */
    protected def standBy(): Unit = {
        if (!DBFluteConfig.isLocked()) {
            DBFluteConfig.lock();
        }
    }

    // ===================================================================================
    //                                                                            Contents
    //                                                                            ========
    protected def handleSqlLogRegistry(): Unit = { // for S2Container
        if (DBFluteConfig.isUseSqlLogRegistry()) {
            val sb = new StringBuilder();
            sb.append("{SqlLog Information}").append(ln());
            sb.append("  [SqlLogRegistry]").append(ln());
            if (TnSqlLogRegistry.setupSqlLogRegistry()) {
                sb.append("    ...Setting up sqlLogRegistry(org.seasar.extension.jdbc)").append(ln());
                sb.append("    because the property 'useSqlLogRegistry' of the config of DBFlute is true");
            } else {
                sb.append("    The sqlLogRegistry(org.seasar.extension.jdbc) is not supported at the version");
            }
           _log.info(sb);
        } else {
            val sqlLogRegistry: Object = TnSqlLogRegistry.findContainerSqlLogRegistry();
            if (sqlLogRegistry != null) {
                TnSqlLogRegistry.closeRegistration();
            }
        }
    }

    protected def loadCoolClasses(): Unit = { // for S2Container 
        ConditionBeanContext.loadCoolClasses(); // against the ClassLoader Headache!
    }

    /**
     * Set up the handler of data source to the configuration of DBFlute. <br />
     * If it uses commons-DBCP, it needs to arrange some for transaction.
     * <ul>
     *     <li>A. To use DataSourceUtils which is Spring Framework class.</li>
     *     <li>B. To use TransactionConnection that is original class and doesn't close really.</li>
     * </ul>
     * If you use a transaction library which has a data source which supports transaction,
     * It doesn't need these arrangement. (For example, the framework 'Atomikos') <br />
     * This method should be executed when application is initialized.
     * @param dataSourceFqcn The FQCN of data source. (NotNull)
     */
    protected def setupDataSourceHandler(dataSourceFqcn: String): Unit = { // for Spring
        val dataSourceHandler: DataSourceHandler = DBFluteConfig.getDataSourceHandler();
        if (dataSourceHandler != null) {
            return;
        }
        if (dataSourceFqcn.startsWith("org.apache.commons.dbcp.")) {
            DBFluteConfig.unlock();
            DBFluteConfig.setDataSourceHandler(new DBFluteConfig.SpringTransactionalDataSourceHandler());
        }
    }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    protected def isCurrentDBDef(currentDBDef: DBDef): Boolean = {
        return DBCurrent.isCurrentDBDef(currentDBDef);
    }

    // ===================================================================================
    //                                                                      General Helper
    //                                                                      ==============
    protected def ln(): String = {
        return DBFluteSystem.getBasicLn();
    }
}
