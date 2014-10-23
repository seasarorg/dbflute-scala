package com.example.dbflute.scala.dbflute.bsentity.dbmeta;

// #avoided same name type in Java and Scala
import java.lang.Long;
import java.lang.Boolean;
import java.math.BigDecimal;

import java.util.List;
import java.util.Map;
import java.util.HashMap

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.AbstractDBMeta._;
import org.seasar.dbflute.dbmeta.DBMeta.OptimisticLockType
import org.seasar.dbflute.dbmeta.property.PropertyGateway;
import org.seasar.dbflute.dbmeta.info._;
import org.seasar.dbflute.dbmeta.name._;
import org.seasar.dbflute.jdbc.Classification;
import com.example.dbflute.scala.dbflute.allcommon._;
import com.example.dbflute.scala.dbflute.exentity._;

/**
 * The DB meta of REGION. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
object RegionDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    def getCurrentDBDef(): DBDef = { return DBCurrent.currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected val _epgMap: Map[String, PropertyGateway] = newHashMap();
    {
        setupEpg(_epgMap, new EpgRegionId(), "regionId");
        setupEpg(_epgMap, new EpgRegionName(), "regionName");
    }
    class EpgRegionId extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleRegion].getRegionId(); }
        def write(et: Entity, vl: Object): Unit = {
            val col: ColumnInfo = columnRegionId();
            dgccls(col, vl);
            val cls = dggcls(col, vl).asInstanceOf[CDef.Region];
            if (cls != null) {
                et.asInstanceOf[DbleRegion].setRegionIdAsRegion(cls);
            } else {
                et.asInstanceOf[DbleRegion].mynativeMappingRegionId(dgctn(vl, classOf[Integer]));
            }
        }
    }
    class EpgRegionName extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleRegion].getRegionName(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleRegion].setRegionName(vl.asInstanceOf[String]); }
    }
    // #avoided delegating to protected static (illegal access error if directly call)
    def dgcti(vl: Object): Integer = { cti(vl); }
    def dgctl(vl: Object): Long = { ctl(vl); }
    def dgctb(vl: Object): BigDecimal = { ctb(vl); }
    def dgctn[NUMBER <: Number](vl: Object, tp: Class[NUMBER]): NUMBER = { ctn(vl, tp); }
    def dggcls(col: ColumnInfo, cd: Object): Classification = { gcls(col, cd); }
    def dgccls(col: ColumnInfo, cd: Object): Unit = { ccls(col, cd); }
    override def findPropertyGateway(prop: String): PropertyGateway = { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected val _tableDbName: String = "REGION";
    protected val _tablePropertyName: String = "region";
    protected val _tableSqlName: TableSqlName = new TableSqlName("REGION", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getTableSqlNameFilter()); }
    def getTableDbName(): String = { return _tableDbName; }
    def getTablePropertyName(): String = { return _tablePropertyName; }
    def getTableSqlName(): TableSqlName = { return _tableSqlName; }
    protected val _tableAlias: String = "地域";
    override def getTableAlias(): String = { return _tableAlias; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected val _columnRegionId: ColumnInfo = cci("REGION_ID", "REGION_ID", null, "地域ID", classOf[Integer], "regionId", null, true, false, true, "INTEGER", 10, 0, null, false, null, null, null, "memberAddressList", CDef.DefMeta.Region);
    protected val _columnRegionName: ColumnInfo = cci("REGION_NAME", "REGION_NAME", null, "地域名称", classOf[String], "regionName", null, false, false, true, "VARCHAR", 50, 0, null, false, null, null, null, null, null);

    def columnRegionId(): ColumnInfo = { return _columnRegionId; }
    def columnRegionName(): ColumnInfo = { return _columnRegionName; }

    protected def ccil(): List[ColumnInfo] = {
        val ls: List[ColumnInfo] = newArrayList();
        ls.add(columnRegionId());
        ls.add(columnRegionName());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected def cpui(): UniqueInfo = { return hpcpui(columnRegionId()); }
    def hasPrimaryKey(): scala.Boolean = { return true; }
    def hasCompoundPrimaryKey(): scala.Boolean = { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    def referrerMemberAddressList(): ReferrerInfo = {
        val mp: Map[ColumnInfo, ColumnInfo] = newLinkedHashMap(columnRegionId(), MemberAddressDbm.columnRegionId());
        return cri("FK_MEMBER_ADDRESS_REGION", "memberAddressList", this, MemberAddressDbm, mp, false, "region");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    def getEntityTypeName(): String = { return "com.example.dbflute.scala.dbflute.exentity.DbleRegion"; }
    def getConditionBeanTypeName(): String = { return "com.example.dbflute.scala.dbflute.cbean.RegionCB"; }
    def getBehaviorTypeName(): String = { return "com.example.dbflute.scala.dbflute.exbhv.RegionBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    def getEntityType(): Class[DbleRegion] = { return classOf[DbleRegion]; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    def newEntity(): DbleRegion = { return new DbleRegion(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    def acceptPrimaryKeyMap(et: Entity, mp: Map[String, _]): Unit =
    { doAcceptPrimaryKeyMap(et.asInstanceOf[DbleRegion], mp); }
    def acceptAllColumnMap(et: Entity, mp: Map[String, _]): Unit =
    { doAcceptAllColumnMap(et.asInstanceOf[DbleRegion], mp); }
    def extractPrimaryKeyMap(et: Entity): Map[String, Object] = { return doExtractPrimaryKeyMap(et); }
    def extractAllColumnMap(et: Entity): Map[String, Object] = { return doExtractAllColumnMap(et); }
}
