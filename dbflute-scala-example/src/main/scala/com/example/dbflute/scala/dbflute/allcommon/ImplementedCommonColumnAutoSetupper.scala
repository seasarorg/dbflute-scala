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
        val registerDatetime: org.joda.time.LocalDateTime = org.joda.time.LocalDateTime.fromDateFields(org.seasar.dbflute.AccessContext.getAccessTimestampOnThread());
        entity.setRegisterDatetime(registerDatetime);
        val registerUser: String = org.seasar.dbflute.AccessContext.getAccessUserOnThread();
        entity.setRegisterUser(registerUser);
        val updateDatetime: org.joda.time.LocalDateTime = entity.getRegisterDatetime();
        entity.setUpdateDatetime(updateDatetime);
        val updateUser: String = entity.getRegisterUser();
        entity.setUpdateUser(updateUser);
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
        val updateDatetime: org.joda.time.LocalDateTime = org.joda.time.LocalDateTime.fromDateFields(org.seasar.dbflute.AccessContext.getAccessTimestampOnThread());
        entity.setUpdateDatetime(updateDatetime);
        val updateUser: String = org.seasar.dbflute.AccessContext.getAccessUserOnThread();
        entity.setUpdateUser(updateUser);
    }

    // =====================================================================================
    //                                                                         Assist Helper
    //                                                                         =============
    protected def askIfEntitySetup(targetEntity: Entity): EntityDefinedCommonColumn = {
        if (!hasCommonColumn(targetEntity)) {
            return null;
        }
        return downcastEntity(targetEntity);
    }

    protected def hasCommonColumn(targetEntity: Entity): Boolean = {
        return targetEntity.isInstanceOf[EntityDefinedCommonColumn];
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
