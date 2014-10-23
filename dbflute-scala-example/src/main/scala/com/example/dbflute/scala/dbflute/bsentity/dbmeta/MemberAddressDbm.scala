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
 * The DB meta of MEMBER_ADDRESS. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
object MemberAddressDbm extends AbstractDBMeta {

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
        setupEpg(_epgMap, new EpgMemberAddressId(), "memberAddressId");
        setupEpg(_epgMap, new EpgMemberId(), "memberId");
        setupEpg(_epgMap, new EpgValidBeginDate(), "validBeginDate");
        setupEpg(_epgMap, new EpgValidEndDate(), "validEndDate");
        setupEpg(_epgMap, new EpgAddress(), "address");
        setupEpg(_epgMap, new EpgRegionId(), "regionId");
        setupEpg(_epgMap, new EpgRegisterDatetime(), "registerDatetime");
        setupEpg(_epgMap, new EpgRegisterUser(), "registerUser");
        setupEpg(_epgMap, new EpgUpdateDatetime(), "updateDatetime");
        setupEpg(_epgMap, new EpgUpdateUser(), "updateUser");
        setupEpg(_epgMap, new EpgVersionNo(), "versionNo");
    }
    class EpgMemberAddressId extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleMemberAddress].getMemberAddressId(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleMemberAddress].setMemberAddressId(dgcti(vl)); }
    }
    class EpgMemberId extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleMemberAddress].getMemberId(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleMemberAddress].setMemberId(dgcti(vl)); }
    }
    class EpgValidBeginDate extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleMemberAddress].getValidBeginDate(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleMemberAddress].setValidBeginDate(vl.asInstanceOf[org.joda.time.LocalDate]); }
    }
    class EpgValidEndDate extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleMemberAddress].getValidEndDate(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleMemberAddress].setValidEndDate(vl.asInstanceOf[org.joda.time.LocalDate]); }
    }
    class EpgAddress extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleMemberAddress].getAddress(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleMemberAddress].setAddress(vl.asInstanceOf[String]); }
    }
    class EpgRegionId extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleMemberAddress].getRegionId(); }
        def write(et: Entity, vl: Object): Unit = {
            val col: ColumnInfo = columnRegionId();
            dgccls(col, vl);
            val cls = dggcls(col, vl).asInstanceOf[CDef.Region];
            if (cls != null) {
                et.asInstanceOf[DbleMemberAddress].setRegionIdAsRegion(cls);
            } else {
                et.asInstanceOf[DbleMemberAddress].mynativeMappingRegionId(dgctn(vl, classOf[Integer]));
            }
        }
    }
    class EpgRegisterDatetime extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleMemberAddress].getRegisterDatetime(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleMemberAddress].setRegisterDatetime(vl.asInstanceOf[org.joda.time.LocalDateTime]); }
    }
    class EpgRegisterUser extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleMemberAddress].getRegisterUser(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleMemberAddress].setRegisterUser(vl.asInstanceOf[String]); }
    }
    class EpgUpdateDatetime extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleMemberAddress].getUpdateDatetime(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleMemberAddress].setUpdateDatetime(vl.asInstanceOf[org.joda.time.LocalDateTime]); }
    }
    class EpgUpdateUser extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleMemberAddress].getUpdateUser(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleMemberAddress].setUpdateUser(vl.asInstanceOf[String]); }
    }
    class EpgVersionNo extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleMemberAddress].getVersionNo(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleMemberAddress].setVersionNo(dgctl(vl)); }
    }
    // #avoided delegating to protected static (illegal access error if directly call)
    def dgcti(vl: Object): Integer = { cti(vl); }
    def dgctl(vl: Object): Long = { ctl(vl); }
    def dgctb(vl: Object): BigDecimal = { ctb(vl); }
    def dgctn[NUMBER <: Number](vl: Object, tp: Class[NUMBER]): NUMBER = { ctn(vl, tp); }
    def dggcls(col: ColumnInfo, cd: Object): Classification = { gcls(col, cd); }
    def dgccls(col: ColumnInfo, cd: Object): Unit = { ccls(col, cd); }
    override def findPropertyGateway(prop: String): PropertyGateway = { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected val _efpgMap: Map[String, PropertyGateway] = newHashMap();
    {
        setupEfpg(_efpgMap, new EfpgMember(), "member");
        setupEfpg(_efpgMap, new EfpgRegion(), "region");
    }
    class EfpgMember extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleMemberAddress].getMember(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleMemberAddress].setMember(vl.asInstanceOf[Option[DbleMember]]); }
    }
    class EfpgRegion extends PropertyGateway {
        def read(et: Entity): Object = { return et.asInstanceOf[DbleMemberAddress].getRegion(); }
        def write(et: Entity, vl: Object): Unit = { et.asInstanceOf[DbleMemberAddress].setRegion(vl.asInstanceOf[Option[DbleRegion]]); }
    }
    override def findForeignPropertyGateway(prop: String): PropertyGateway = { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected val _tableDbName: String = "MEMBER_ADDRESS";
    protected val _tablePropertyName: String = "memberAddress";
    protected val _tableSqlName: TableSqlName = new TableSqlName("MEMBER_ADDRESS", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getTableSqlNameFilter()); }
    def getTableDbName(): String = { return _tableDbName; }
    def getTablePropertyName(): String = { return _tablePropertyName; }
    def getTableSqlName(): TableSqlName = { return _tableSqlName; }
    protected val _tableAlias: String = "会員住所情報";
    override def getTableAlias(): String = { return _tableAlias; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected val _columnMemberAddressId: ColumnInfo = cci("MEMBER_ADDRESS_ID", "MEMBER_ADDRESS_ID", null, "会員住所ID", classOf[Integer], "memberAddressId", null, true, true, true, "INTEGER", 10, 0, "NEXT VALUE FOR PUBLIC.SYSTEM_SEQUENCE_2291F287_D6EC_4F85_86D0_8D71FE7A76F1", false, null, null, null, null, null);
    protected val _columnMemberId: ColumnInfo = cci("MEMBER_ID", "MEMBER_ID", null, "会員ID", classOf[Integer], "memberId", null, false, false, true, "INTEGER", 10, 0, null, false, null, null, "member", null, null);
    protected val _columnValidBeginDate: ColumnInfo = cci("VALID_BEGIN_DATE", "VALID_BEGIN_DATE", null, "有効開始日", classOf[org.joda.time.LocalDate], "validBeginDate", null, false, false, true, "DATE", 8, 0, null, false, null, null, null, null, null);
    protected val _columnValidEndDate: ColumnInfo = cci("VALID_END_DATE", "VALID_END_DATE", null, "有効終了日", classOf[org.joda.time.LocalDate], "validEndDate", null, false, false, true, "DATE", 8, 0, null, false, null, null, null, null, null);
    protected val _columnAddress: ColumnInfo = cci("ADDRESS", "ADDRESS", null, "住所", classOf[String], "address", null, false, false, true, "VARCHAR", 200, 0, null, false, null, null, null, null, null);
    protected val _columnRegionId: ColumnInfo = cci("REGION_ID", "REGION_ID", null, "地域ID", classOf[Integer], "regionId", null, false, false, true, "INTEGER", 10, 0, null, false, null, null, "region", null, CDef.DefMeta.Region);
    protected val _columnRegisterDatetime: ColumnInfo = cci("REGISTER_DATETIME", "REGISTER_DATETIME", null, null, classOf[org.joda.time.LocalDateTime], "registerDatetime", null, false, false, true, "TIMESTAMP", 23, 10, null, true, null, null, null, null, null);
    protected val _columnRegisterUser: ColumnInfo = cci("REGISTER_USER", "REGISTER_USER", null, null, classOf[String], "registerUser", null, false, false, true, "VARCHAR", 200, 0, null, true, null, null, null, null, null);
    protected val _columnUpdateDatetime: ColumnInfo = cci("UPDATE_DATETIME", "UPDATE_DATETIME", null, null, classOf[org.joda.time.LocalDateTime], "updateDatetime", null, false, false, true, "TIMESTAMP", 23, 10, null, true, null, null, null, null, null);
    protected val _columnUpdateUser: ColumnInfo = cci("UPDATE_USER", "UPDATE_USER", null, null, classOf[String], "updateUser", null, false, false, true, "VARCHAR", 200, 0, null, true, null, null, null, null, null);
    protected val _columnVersionNo: ColumnInfo = cci("VERSION_NO", "VERSION_NO", null, null, classOf[Long], "versionNo", null, false, false, true, "BIGINT", 19, 0, null, false, OptimisticLockType.VERSION_NO, null, null, null, null);

    def columnMemberAddressId(): ColumnInfo = { return _columnMemberAddressId; }
    def columnMemberId(): ColumnInfo = { return _columnMemberId; }
    def columnValidBeginDate(): ColumnInfo = { return _columnValidBeginDate; }
    def columnValidEndDate(): ColumnInfo = { return _columnValidEndDate; }
    def columnAddress(): ColumnInfo = { return _columnAddress; }
    def columnRegionId(): ColumnInfo = { return _columnRegionId; }
    def columnRegisterDatetime(): ColumnInfo = { return _columnRegisterDatetime; }
    def columnRegisterUser(): ColumnInfo = { return _columnRegisterUser; }
    def columnUpdateDatetime(): ColumnInfo = { return _columnUpdateDatetime; }
    def columnUpdateUser(): ColumnInfo = { return _columnUpdateUser; }
    def columnVersionNo(): ColumnInfo = { return _columnVersionNo; }

    protected def ccil(): List[ColumnInfo] = {
        val ls: List[ColumnInfo] = newArrayList();
        ls.add(columnMemberAddressId());
        ls.add(columnMemberId());
        ls.add(columnValidBeginDate());
        ls.add(columnValidEndDate());
        ls.add(columnAddress());
        ls.add(columnRegionId());
        ls.add(columnRegisterDatetime());
        ls.add(columnRegisterUser());
        ls.add(columnUpdateDatetime());
        ls.add(columnUpdateUser());
        ls.add(columnVersionNo());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected def cpui(): UniqueInfo = { return hpcpui(columnMemberAddressId()); }
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
    def foreignMember(): ForeignInfo = {
        val mp: Map[ColumnInfo, ColumnInfo] = newLinkedHashMap(columnMemberId(), MemberDbm.columnMemberId());
        return cfi("FK_MEMBER_ADDRESS_MEMBER", "member", this, MemberDbm, mp, 0, classOf[Option[_]], false, false, false, false, null, null, false, "memberAddressList");
    }
    def foreignRegion(): ForeignInfo = {
        val mp: Map[ColumnInfo, ColumnInfo] = newLinkedHashMap(columnRegionId(), RegionDbm.columnRegionId());
        return cfi("FK_MEMBER_ADDRESS_REGION", "region", this, RegionDbm, mp, 1, classOf[Option[_]], false, false, false, false, null, null, false, "memberAddressList");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    override def hasIdentity(): scala.Boolean = { return true; }
    override def hasVersionNo(): scala.Boolean = { return true; }
    override def getVersionNoColumnInfo(): ColumnInfo = { return _columnVersionNo; }
    override def hasCommonColumn(): scala.Boolean = { return true; }
    override def getCommonColumnInfoList(): List[ColumnInfo] =
    { return newArrayList(columnRegisterDatetime(), columnRegisterUser(), columnUpdateDatetime(), columnUpdateUser()); }
    override def getCommonColumnInfoBeforeInsertList(): List[ColumnInfo] =
    { return newArrayList(columnRegisterDatetime(), columnRegisterUser(), columnUpdateDatetime(), columnUpdateUser()); }
    override def getCommonColumnInfoBeforeUpdateList(): List[ColumnInfo] =
    { return newArrayList(columnUpdateDatetime(), columnUpdateUser()); }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    def getEntityTypeName(): String = { return "com.example.dbflute.scala.dbflute.exentity.DbleMemberAddress"; }
    def getConditionBeanTypeName(): String = { return "com.example.dbflute.scala.dbflute.cbean.MemberAddressCB"; }
    def getBehaviorTypeName(): String = { return "com.example.dbflute.scala.dbflute.exbhv.MemberAddressBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    def getEntityType(): Class[DbleMemberAddress] = { return classOf[DbleMemberAddress]; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    def newEntity(): DbleMemberAddress = { return new DbleMemberAddress(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    def acceptPrimaryKeyMap(et: Entity, mp: Map[String, _]): Unit =
    { doAcceptPrimaryKeyMap(et.asInstanceOf[DbleMemberAddress], mp); }
    def acceptAllColumnMap(et: Entity, mp: Map[String, _]): Unit =
    { doAcceptAllColumnMap(et.asInstanceOf[DbleMemberAddress], mp); }
    def extractPrimaryKeyMap(et: Entity): Map[String, Object] = { return doExtractPrimaryKeyMap(et); }
    def extractAllColumnMap(et: Entity): Map[String, Object] = { return doExtractAllColumnMap(et); }
}
