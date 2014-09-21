package com.example.dbflute.scala.dbflute.allcommon;

import scala.collection.JavaConverters._

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.seasar.dbflute.BehaviorSelector;
import org.seasar.dbflute.bhv.BehaviorReadable;
import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.exception.IllegalBehaviorStateException;
import org.seasar.dbflute.util.DfTraceViewUtil;
import org.seasar.dbflute.util.DfTypeUtil;
import org.seasar.dbflute.util.Srl;

import com.google.inject.Inject;
import com.google.inject.Injector;

/**
 * The implementation of behavior selector.
 * @author DBFlute(AutoGenerator)
 */
class ImplementedBehaviorSelector extends BehaviorSelector {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Log instance. */
    private val _log: Log = LogFactory.getLog(classOf[ImplementedBehaviorSelector]);

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The concurrent cache of behavior. */
    protected var _behaviorCache: Map[Class[_ <: BehaviorReadable], BehaviorReadable] = new ConcurrentHashMap();

    /** The container of Guice. */
    protected var _container: Injector = null;

    // ===================================================================================
    //                                                                          Initialize
    //                                                                          ==========
    /**
     * Initialize condition-bean meta data.
     */
    def initializeConditionBeanMetaData(): Unit = {
        val dbmetaMap: Map[String, DBMeta] = DBMetaInstanceHandler.getUnmodifiableDBMetaMap();
        val dbmetas: Collection[DBMeta] = dbmetaMap.values();
        var before: Long = 0;
        if (_log.isInfoEnabled()) {
            before = System.currentTimeMillis();
            _log.info("...Initializing condition-bean meta data");
        }
        var count: Int = 0;
        dbmetas.asScala.foreach(dbmeta => {
            try {
                val bhv: BehaviorReadable = byName(dbmeta.getTableDbName());
                bhv.warmUpCommand();
                count = count + 1;
            } catch { // means the behavior is suppressed
                case ignored: IllegalBehaviorStateException => {
                    if (_log.isDebugEnabled()) {
                        _log.debug("No behavior for " + dbmeta.getTableDbName());
                    }
                }
            }
        });
        if (_log.isInfoEnabled()) {
            val after: Long = System.currentTimeMillis();
            _log.info("CB initialized: " + count + " [" + DfTraceViewUtil.convertToPerformanceView(after - before) + "]");
        }
    }

    // ===================================================================================
    //                                                                            Selector
    //                                                                            ========
    /**
     * Select behavior instance by the type.
     * @param <BEHAVIOR> The type of behavior.
     * @param behaviorType Behavior type. (NotNull)
     * @return The selected instance of the behavior. (NotNull)
     */
    def select[BEHAVIOR <: BehaviorReadable](behaviorType: Class[BEHAVIOR]): BEHAVIOR = {
        var bhv: BEHAVIOR = _behaviorCache.get(behaviorType).asInstanceOf[BEHAVIOR];
        if (bhv != null) {
            return bhv;
        }
        _behaviorCache.synchronized {
            bhv = _behaviorCache.get(behaviorType).asInstanceOf[BEHAVIOR];
            if (bhv != null) {
                // a previous thread might have initialized
                // or reading might failed by same-time writing
                return bhv;
            }
            bhv = getComponent(behaviorType).asInstanceOf[BEHAVIOR];
            _behaviorCache.put(behaviorType, bhv);
            return bhv;
        }
    }

    /**
     * Select behavior (as readable type) by name.
     * @param tableFlexibleName The flexible-name of table. (NotNull)
     * @return The instance of found behavior. (NotNull)
     * @throws org.seasar.dbflute.exception.DBMetaNotFoundException When the table is not found.
     * @throws org.seasar.dbflute.exception.IllegalBehaviorStateException When the behavior class is suppressed.
     */
    def byName(tableFlexibleName: String): BehaviorReadable = {
        assertStringNotNullAndNotTrimmedEmpty("tableFlexibleName", tableFlexibleName);
        val dbmeta: DBMeta = DBMetaInstanceHandler.findDBMeta(tableFlexibleName);
        return select(getBehaviorType(dbmeta));
    }

    /**
     * Get behavior-type by DB meta.
     * @param dbmeta The instance of DB meta for the behavior. (NotNull)
     * @return The type of behavior (as readable type). (NotNull)
     * @throws org.seasar.dbflute.exception.IllegalBehaviorStateException When the behavior class is suppressed.
     */
    protected def getBehaviorType(dbmeta: DBMeta): Class[BehaviorReadable] = {
        val behaviorTypeName: String = dbmeta.getBehaviorTypeName();
        if (behaviorTypeName == null) {
            val msg: String = "The dbmeta.getBehaviorTypeName() should not return null: dbmeta=" + dbmeta;
            throw new IllegalStateException(msg);
        }
        val behaviorType: Class[BehaviorReadable] = try {
            Class.forName(behaviorTypeName).asInstanceOf[Class[BehaviorReadable]];
        } catch {
            case e: ClassNotFoundException => {
                throw new IllegalBehaviorStateException("The class does not exist: " + behaviorTypeName, e);
            }
        }
        return behaviorType;
    }

    // ===================================================================================
    //                                                                           Component
    //                                                                           =========
    protected def getComponent[COMPONENT](componentType: Class[COMPONENT]): COMPONENT = { // only for behavior
        assertObjectNotNull("componentType", componentType);
        assertObjectNotNull("_container", _container);
		return _container.getInstance(componentType);
    }

    // ===================================================================================
    //                                                                      General Helper
    //                                                                      ==============
    protected def replace(str: String, fromStr: String, toStr: String): String = {
        return Srl.replace(str, fromStr, toStr);
    }

    protected def initUncap(str: String): String = {
        return str.substring(0, 1).toLowerCase() + str.substring(1);
    }

    protected def toClassTitle(obj: Object): String = {
        return DfTypeUtil.toClassTitle(obj);
    }

    // ===================================================================================
    //                                                                              Assert
    //                                                                              ======
    // -----------------------------------------------------
    //                                         Assert Object
    //                                         -------------
    /**
     * Assert that the object is not null.
     * @param variableName Variable name. (NotNull)
     * @param value Value. (NotNull)
     * @exception IllegalArgumentException
     */
    protected def assertObjectNotNull(variableName: String, value: Object): Unit = {
        if (variableName == null) {
            val msg: String = "The value should not be null: variableName=null value=" + value;
            throw new IllegalArgumentException(msg);
        }
        if (value == null) {
            val msg: String = "The value should not be null: variableName=" + variableName;
            throw new IllegalArgumentException(msg);
        }
    }

    // -----------------------------------------------------
    //                                         Assert String
    //                                         -------------
    /**
     * Assert that the entity is not null and not trimmed empty.
     * @param variableName Variable name. (NotNull)
     * @param value Value. (NotNull)
     */
    protected def assertStringNotNullAndNotTrimmedEmpty(variableName: String, value: String): Unit = {
        assertObjectNotNull("variableName", variableName);
        assertObjectNotNull("value", value);
        if (value.trim().length() == 0) {
            val msg: String = "The value should not be empty: variableName=" + variableName + " value=" + value;
            throw new IllegalArgumentException(msg);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    @Inject
    def setContainer(container: Injector): Unit = {
        this._container = container;
    }
}
