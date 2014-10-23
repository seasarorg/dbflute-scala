package com.example.dbflute.scala.dbflute.allcommon;

import org.seasar.dbflute.Entity;

/**
 * The interface of entity defined common columns.
 * @author DBFlute(AutoGenerator)
 */
trait EntityDefinedCommonColumn extends Entity {

    /**
     * Get the value of registerDatetime.
     * @return The instance of the property type. (NullAllowed)
     */
    def getRegisterDatetime(): org.joda.time.LocalDateTime;

    /**
     * Set the value of registerDatetime.
     * @param registerDatetime The instance of the property type. (NullAllowed)
     */
    def setRegisterDatetime(registerDatetime: org.joda.time.LocalDateTime): Unit;

    /**
     * Get the value of registerUser.
     * @return The instance of the property type. (NullAllowed)
     */
    def getRegisterUser(): String;

    /**
     * Set the value of registerUser.
     * @param registerUser The instance of the property type. (NullAllowed)
     */
    def setRegisterUser(registerUser: String): Unit;

    /**
     * Get the value of updateDatetime.
     * @return The instance of the property type. (NullAllowed)
     */
    def getUpdateDatetime(): org.joda.time.LocalDateTime;

    /**
     * Set the value of updateDatetime.
     * @param updateDatetime The instance of the property type. (NullAllowed)
     */
    def setUpdateDatetime(updateDatetime: org.joda.time.LocalDateTime): Unit;

    /**
     * Get the value of updateUser.
     * @return The instance of the property type. (NullAllowed)
     */
    def getUpdateUser(): String;

    /**
     * Set the value of updateUser.
     * @param updateUser The instance of the property type. (NullAllowed)
     */
    def setUpdateUser(updateUser: String): Unit;
}
