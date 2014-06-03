package com.example.dbflute.scala.dbflute.allcommon;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.bhv.core.CommonColumnAutoSetupper;

/**
 * The basic implementation of the auto set-upper of common column.
 * @author DBFlute(AutoGenerator)
 */
class ImplementedCommonColumnAutoSetupper extends CommonColumnAutoSetupper {

    // =====================================================================================
    //                                                                            Definition
    //                                                                            ==========
    /** Log instance. */
    private val _log: Log = LogFactory.getLog(classOf[ImplementedCommonColumnAutoSetupper]);

    // =====================================================================================
    //                                                                             Attribute
    //                                                                             =========
    // =====================================================================================
    //                                                                                Set up
    //                                                                                ======
    /**
     * {@inheritDoc}
     */
    def handleCommonColumnOfInsertIfNeeds(targetEntity: Entity): Unit = {
        val entity: EntityDefinedCommonColumn = askIfEntitySetup(targetEntity);
        if (entity == null) {
            return;
        }
        if (isInternalDebugEnabled()) {
            logSettingUp(entity, "INSERT");
        }
        doHandleCommonColumnOfInsertIfNeeds(entity);
    }

    protected def doHandleCommonColumnOfInsertIfNeeds(entity: EntityDefinedCommonColumn): Unit = {

        val registerDatetime: java.sql.Timestamp = org.seasar.dbflute.AccessContext.getAccessTimestampOnThread();
        entity.registerDatetime(registerDatetime);

        val registerUser: String = org.seasar.dbflute.AccessContext.getAccessUserOnThread();
        entity.registerUser(registerUser);

        val updateDatetime: java.sql.Timestamp = entity.registerDatetime();
        entity.updateDatetime(updateDatetime);

        val updateUser: String = entity.registerUser();
        entity.updateUser(updateUser);
    }

    /**
     * {@inheritDoc}
     */
    def handleCommonColumnOfUpdateIfNeeds(targetEntity: Entity): Unit = {
        val entity: EntityDefinedCommonColumn = askIfEntitySetup(targetEntity);
        if (entity == null) {
            return;
        }
        if (isInternalDebugEnabled()) {
            logSettingUp(entity, "UPDATE");
        }
        doHandleCommonColumnOfUpdateIfNeeds(entity);
    }

    protected def doHandleCommonColumnOfUpdateIfNeeds(entity: EntityDefinedCommonColumn): Unit = {

        val updateDatetime: java.sql.Timestamp = org.seasar.dbflute.AccessContext.getAccessTimestampOnThread();
        entity.updateDatetime(updateDatetime);

        val updateUser: String = org.seasar.dbflute.AccessContext.getAccessUserOnThread();
        entity.updateUser(updateUser);
    }

    // =====================================================================================
    //                                                                         Assist Helper
    //                                                                         =============
    protected def askIfEntitySetup(targetEntity: Entity): EntityDefinedCommonColumn = {
        if (!hasCommonColumn(targetEntity)) {
            return null;
        }
        val entity: EntityDefinedCommonColumn = downcastEntity(targetEntity);
        if (!canCommonColumnAutoSetup(entity)) {
            return null;
        }
        return entity;
    }

    protected def hasCommonColumn(targetEntity: Entity): Boolean = {
        return targetEntity.isInstanceOf[EntityDefinedCommonColumn];
    }

    protected def canCommonColumnAutoSetup(entity: EntityDefinedCommonColumn): Boolean = {
        return entity.canCommonColumnAutoSetup();
    }

    protected def downcastEntity(targetEntity: Entity): EntityDefinedCommonColumn = {
        return targetEntity.asInstanceOf[EntityDefinedCommonColumn];
    }

    // =====================================================================================
    //                                                                               Logging
    //                                                                               =======
    protected def isInternalDebugEnabled(): Boolean = {
        return DBFluteConfig.isInternalDebug() && _log.isDebugEnabled();
    }

    protected def logSettingUp(entity: EntityDefinedCommonColumn, keyword: String): Unit = {
        _log.debug("...Setting up column columns of " + entity.getTableDbName() + " before " + keyword);
    }
}
