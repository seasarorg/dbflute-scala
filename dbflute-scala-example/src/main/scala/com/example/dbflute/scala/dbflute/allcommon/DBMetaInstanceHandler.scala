package com.example.dbflute.scala.dbflute.allcommon;

import scala.collection.JavaConverters._

import java.util.Collections;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.DBMetaProvider;
import org.seasar.dbflute.exception.DBMetaNotFoundException;
import org.seasar.dbflute.helper.StringKeyMap;
import org.seasar.dbflute.util.DfAssertUtil;

/**
 * The handler of the instance of DB meta.
 * @author DBFlute(AutoGenerator)
 */
object DBMetaInstanceHandler extends DBMetaProvider {

    // ===================================================================================
    //                                                                        Resource Map
    //                                                                        ============
    /** The map of DB meta instance by key 'table DB-name'. (NotNull) */
    protected var _tableDbNameInstanceMap: Map[String, DBMeta] = new HashMap();
    {
        val tmpMap: Map[String, DBMeta] = new HashMap();
        tmpMap.put("MEMBER", com.example.dbflute.scala.dbflute.bsentity.dbmeta.MemberDbm);
        tmpMap.put("MEMBER_ADDRESS", com.example.dbflute.scala.dbflute.bsentity.dbmeta.MemberAddressDbm);
        tmpMap.put("MEMBER_FOLLOWING", com.example.dbflute.scala.dbflute.bsentity.dbmeta.MemberFollowingDbm);
        tmpMap.put("MEMBER_LOGIN", com.example.dbflute.scala.dbflute.bsentity.dbmeta.MemberLoginDbm);
        tmpMap.put("MEMBER_SECURITY", com.example.dbflute.scala.dbflute.bsentity.dbmeta.MemberSecurityDbm);
        tmpMap.put("MEMBER_SERVICE", com.example.dbflute.scala.dbflute.bsentity.dbmeta.MemberServiceDbm);
        tmpMap.put("MEMBER_STATUS", com.example.dbflute.scala.dbflute.bsentity.dbmeta.MemberStatusDbm);
        tmpMap.put("MEMBER_WITHDRAWAL", com.example.dbflute.scala.dbflute.bsentity.dbmeta.MemberWithdrawalDbm);
        tmpMap.put("PRODUCT", com.example.dbflute.scala.dbflute.bsentity.dbmeta.ProductDbm);
        tmpMap.put("PRODUCT_CATEGORY", com.example.dbflute.scala.dbflute.bsentity.dbmeta.ProductCategoryDbm);
        tmpMap.put("PRODUCT_STATUS", com.example.dbflute.scala.dbflute.bsentity.dbmeta.ProductStatusDbm);
        tmpMap.put("PURCHASE", com.example.dbflute.scala.dbflute.bsentity.dbmeta.PurchaseDbm);
        tmpMap.put("PURCHASE_PAYMENT", com.example.dbflute.scala.dbflute.bsentity.dbmeta.PurchasePaymentDbm);
        tmpMap.put("REGION", com.example.dbflute.scala.dbflute.bsentity.dbmeta.RegionDbm);
        tmpMap.put("SERVICE_RANK", com.example.dbflute.scala.dbflute.bsentity.dbmeta.ServiceRankDbm);
        tmpMap.put("SUMMARY_PRODUCT", com.example.dbflute.scala.dbflute.bsentity.dbmeta.SummaryProductDbm);
        tmpMap.put("SUMMARY_WITHDRAWAL", com.example.dbflute.scala.dbflute.bsentity.dbmeta.SummaryWithdrawalDbm);
        tmpMap.put("VENDOR_$_DOLLAR", com.example.dbflute.scala.dbflute.bsentity.dbmeta.Vendor$DollarDbm);
        tmpMap.put("VENDOR_CHECK", com.example.dbflute.scala.dbflute.bsentity.dbmeta.VendorCheckDbm);
        tmpMap.put("VENDOR_IDENTITY_ONLY", com.example.dbflute.scala.dbflute.bsentity.dbmeta.VendorIdentityOnlyDbm);
        tmpMap.put("VENDOR_PRIMARY_KEY_ONLY", com.example.dbflute.scala.dbflute.bsentity.dbmeta.VendorPrimaryKeyOnlyDbm);
        tmpMap.put("VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN", com.example.dbflute.scala.dbflute.bsentity.dbmeta.VendorTheLongAndWindingTableAndColumnDbm);
        tmpMap.put("VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF", com.example.dbflute.scala.dbflute.bsentity.dbmeta.VendorTheLongAndWindingTableAndColumnRefDbm);
        tmpMap.put("WITHDRAWAL_REASON", com.example.dbflute.scala.dbflute.bsentity.dbmeta.WithdrawalReasonDbm);
        _tableDbNameInstanceMap = Collections.unmodifiableMap(tmpMap);
    }

    /** The map of DB meta instance by key 'entity type'. (NotNull, LazyLoaded) */
    protected val _entityTypeInstanceMap: Map[Class[_], DBMeta] = new HashMap();

    /** The flexible map of table DB name for conversion in finding process. (NotNull) */
    protected val _tableDbNameFlexibleMap: Map[String, String] = StringKeyMap.createAsFlexible();
    {
        val tableDbNameSet: Set[String] = _tableDbNameInstanceMap.keySet();
        tableDbNameSet.asScala.foreach(tableDbName => _tableDbNameFlexibleMap.put(tableDbName, tableDbName))
    }

    /**
     * Get the unmodifiable map of DB meta.
     * @return The unmodifiable map that contains all instances of DB meta. (NotNull, NotEmpty)
     */
    def getUnmodifiableDBMetaMap(): Map[String, DBMeta] = {
        initializeDBMetaMap();
        _tableDbNameInstanceMap.synchronized {
            return Collections.unmodifiableMap(_tableDbNameInstanceMap);
        }
    }

    /**
     * Initialize the map of DB meta.
     */
    protected def initializeDBMetaMap(): Unit = {
        if (isInitialized()) {
            return;
        }
        _tableDbNameInstanceMap.synchronized {
            _tableDbNameInstanceMap.keySet().asScala.foreach(tableDbName => findDBMeta(tableDbName)); // initialize
            if (!isInitialized()) {
                val msg: String = "Failed to initialize tableDbNameInstanceMap: " + _tableDbNameInstanceMap;
                throw new IllegalStateException(msg);
            }
        }
    }

    protected def isInitialized(): Boolean = {
        return _tableDbNameInstanceMap.size() == _tableDbNameInstanceMap.size();
    }

    // ===================================================================================
    //                                                                  Provider Singleton
    //                                                                  ==================
    protected val _provider: DBMetaProvider = this;

    def getProvider(): DBMetaProvider = {
        return _provider;
    }

    def provideDBMeta(tableFlexibleName: String): DBMeta = {
        return byTableFlexibleName(tableFlexibleName);
    }

    def provideDBMeta(entityType: Class[_]): DBMeta = {
        return byEntityType(entityType);
    }

    def provideDBMetaChecked(tableFlexibleName: String): DBMeta = {
        return findDBMeta(tableFlexibleName);
    }

    def provideDBMetaChecked(entityType: Class[_]): DBMeta = {
        return findDBMeta(entityType);
    }

    // ===================================================================================
    //                                                                         Find DBMeta
    //                                                                         ===========
    /**
     * Find DB meta by table flexible name. (accept quoted name and schema prefix)
     * @param tableFlexibleName The flexible name of table. (NotNull)
     * @return The instance of DB meta. (NotNull)
     * @exception org.seasar.dbflute.exception.DBMetaNotFoundException When the DB meta is not found.
     */
    def findDBMeta(tableFlexibleName: String): DBMeta = {
        val dbmeta: DBMeta = byTableFlexibleName(tableFlexibleName);
        if (dbmeta == null) {
            val msg: String = "The DB meta was not found by the table flexible name: key=" + tableFlexibleName;
            throw new DBMetaNotFoundException(msg);
        }
        return dbmeta;
    }

    /**
     * Find DB meta by entity type.
     * @param entityType The entity type of table, which should implement the {@link Entity} interface. (NotNull)
     * @return The instance of DB meta. (NotNull)
     * @exception org.seasar.dbflute.exception.DBMetaNotFoundException When the DB meta is not found.
     */
    def findDBMeta(entityType: Class[_]): DBMeta = {
        val dbmeta: DBMeta = byEntityType(entityType);
        if (dbmeta == null) {
            val msg: String = "The DB meta was not found by the entity type: key=" + entityType;
            throw new DBMetaNotFoundException(msg);
        }
        return dbmeta;
    }

    // ===================================================================================
    //                                                                       by Table Name
    //                                                                       =============
    /**
     * @param tableFlexibleName The flexible name of table. (NotNull)
     * @return The instance of DB meta. (NullAllowed: If the DB meta is not found, it returns null)
     */
    protected def byTableFlexibleName(tableFlexibleName: String): DBMeta = {
        assertStringNotNullAndNotTrimmedEmpty("tableFlexibleName", tableFlexibleName);
        var tableDbName: String = _tableDbNameFlexibleMap.get(tableFlexibleName);
        if (tableDbName == null) {
            tableDbName = retryByNormalizedName(tableFlexibleName);
        }
        return if (tableDbName != null) { byTableDbName(tableDbName) } else { null };
    }

    protected def retryByNormalizedName(tableFlexibleName: String): String = {
        var tableDbName: String = null;
        val pureName: String = normalizeTableFlexibleName(tableFlexibleName);
        val schema: String = extractSchemaIfExists(tableFlexibleName);
        if (schema != null) { // first, find by qualified name
            tableDbName = _tableDbNameFlexibleMap.get(schema + "." + pureName);
        }
        if (tableDbName == null) { // next, find by pure name
            tableDbName = _tableDbNameFlexibleMap.get(pureName);
        }
        return tableDbName;
    }

    protected def normalizeTableFlexibleName(tableFlexibleName: String): String = {
        return removeQuoteIfExists(removeSchemaIfExists(tableFlexibleName));
    }

    protected def removeQuoteIfExists(name: String): String = {
        if (name.startsWith("\"") && name.endsWith("\"")) {
            return strip(name);
        } else if (name.startsWith("[") && name.endsWith("]")) {
            return strip(name);
        }
        return name;
    }

    protected def removeSchemaIfExists(name: String): String = {
        val dotLastIndex: Integer = name.lastIndexOf(".");
        return if (dotLastIndex >= 0) { name.substring(dotLastIndex + ".".length()) } else { name }; 
    }

    protected def extractSchemaIfExists(name: String): String = {
        val dotLastIndex: Integer = name.lastIndexOf(".");
        return if (dotLastIndex >= 0) { name.substring(0, dotLastIndex) } else { null }; 
    }

    protected def strip(name: String): String = {
        return name.substring(1, name.length() - 1);
    }

    /**
     * @param tableDbName The DB name of table. (NotNull)
     * @return The instance of DB meta. (NullAllowed: If the DB meta is not found, it returns null)
     */
    protected def byTableDbName(tableDbName: String): DBMeta = {
        assertStringNotNullAndNotTrimmedEmpty("tableDbName", tableDbName);
        return getCachedDBMeta(tableDbName);
    }

    // ===================================================================================
    //                                                                      by Entity Type
    //                                                                      ==============
    /**
     * @param entityType The entity type of table, which should implement the entity interface. (NotNull)
     * @return The instance of DB meta. (NullAllowed: If the DB meta is not found, it returns null)
     */
    protected def byEntityType(entityType: Class[_]): DBMeta = {
        assertObjectNotNull("entityType", entityType);
        return getCachedDBMeta(entityType);
    }

    // ===================================================================================
    //                                                                       Cached DBMeta
    //                                                                       =============
    protected def getCachedDBMeta(tableDbName: String): DBMeta = {
        // #avoided no lazy-load for now (don't know how to get instance from singleton object)
        return _tableDbNameInstanceMap.get(tableDbName);
    }

    protected def getCachedDBMeta(entityType: Class[_]): DBMeta = { // lazy-load same as by-name
        var dbmeta: DBMeta = _entityTypeInstanceMap.get(entityType);
        if (dbmeta != null) {
            return dbmeta;
        }
        _entityTypeInstanceMap.synchronized {
            dbmeta = _entityTypeInstanceMap.get(entityType);
            if (dbmeta != null) {
                // an other thread might have initialized
                // or reading might failed by same-time writing
                return dbmeta;
            }
            if (classOf[Entity].isAssignableFrom(entityType)) { // required
                val entity: Entity = newEntity(entityType);
                dbmeta = getCachedDBMeta(entity.getTableDbName());
            }
            if (dbmeta == null) {
                return null;
            }
            _entityTypeInstanceMap.put(entityType, dbmeta);
            return _entityTypeInstanceMap.get(entityType);
        }
    }

    protected def newEntity(entityType: Class[_]): Entity = {
        try {
            return entityType.newInstance().asInstanceOf[Entity];
        } catch {
            case e: Exception => {
                val msg: String = "Failed to new the instance: " + entityType;
                throw new IllegalStateException(msg, e);
            }
        }
    }

    // ===================================================================================
    //                                                                      General Helper
    //                                                                      ==============
    // -----------------------------------------------------
    //                                         Assert Object
    //                                         -------------
    protected def assertObjectNotNull(variableName: String, value: Object): Unit = {
        DfAssertUtil.assertObjectNotNull(variableName, value);
    }

    // -----------------------------------------------------
    //                                         Assert String
    //                                         -------------
    protected def assertStringNotNullAndNotTrimmedEmpty(variableName: String, value: String): Unit = {
        DfAssertUtil.assertStringNotNullAndNotTrimmedEmpty(variableName, value);
    }
}
