package org.dbflute.scala.testlib.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.PropertyGateway;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.dbmeta.name.*;
import org.dbflute.scala.testlib.dbflute.allcommon.*;
import org.dbflute.scala.testlib.dbflute.exentity.*;

/**
 * The DB meta of VENDOR_$_DOLLAR. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class Vendor$DollarDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final Vendor$DollarDbm _instance = new Vendor$DollarDbm();
    private Vendor$DollarDbm() {}
    public static Vendor$DollarDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgVendor$DollarId(), "vendor$DollarId");
        setupEpg(_epgMap, new EpgVendor$DollarName(), "vendor$DollarName");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgVendor$DollarId implements PropertyGateway {
        public Object read(Entity et) { return ((Vendor$Dollar)et).getVendor$DollarId(); }
        public void write(Entity et, Object vl) { ((Vendor$Dollar)et).setVendor$DollarId(cti(vl)); }
    }
    public static class EpgVendor$DollarName implements PropertyGateway {
        public Object read(Entity et) { return ((Vendor$Dollar)et).getVendor$DollarName(); }
        public void write(Entity et, Object vl) { ((Vendor$Dollar)et).setVendor$DollarName((String)vl); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "VENDOR_$_DOLLAR";
    protected final String _tablePropertyName = "vendor$Dollar";
    protected final TableSqlName _tableSqlName = new TableSqlName("EXAMPLEDB.PUBLIC.VENDOR_$_DOLLAR", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnVendor$DollarId = cci("VENDOR_$_DOLLAR_ID", "VENDOR_$_DOLLAR_ID", null, null, true, "vendor$DollarId", Integer.class, true, false, "INTEGER", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnVendor$DollarName = cci("VENDOR_$_DOLLAR_NAME", "VENDOR_$_DOLLAR_NAME", null, null, false, "vendor$DollarName", String.class, false, false, "VARCHAR", 32, 0, null, false, null, null, null, null, null);

    public ColumnInfo columnVendor$DollarId() { return _columnVendor$DollarId; }
    public ColumnInfo columnVendor$DollarName() { return _columnVendor$DollarName; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnVendor$DollarId());
        ls.add(columnVendor$DollarName());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnVendor$DollarId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.dbflute.scala.testlib.dbflute.exentity.Vendor$Dollar"; }
    public String getConditionBeanTypeName() { return "org.dbflute.scala.testlib.dbflute.cbean.Vendor$DollarCB"; }
    public String getBehaviorTypeName() { return "org.dbflute.scala.testlib.dbflute.exbhv.Vendor$DollarBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<Vendor$Dollar> getEntityType() { return Vendor$Dollar.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public Vendor$Dollar newMyEntity() { return new Vendor$Dollar(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((Vendor$Dollar)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((Vendor$Dollar)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
