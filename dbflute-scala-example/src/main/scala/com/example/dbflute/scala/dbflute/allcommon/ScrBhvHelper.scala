package com.example.dbflute.scala.dbflute.allcommon;

import java.util.List;
import java.util.ArrayList;

/**
 * The gateway of loader handling for nested referrer as Scala runtime.
 * @param <LOADER> The type of loader for referrer.
 * @author DBFlute(AutoGenerator)
 */
class ScrNestedReferrerLoaderGateway[LOADER](loaderProvider: () => LOADER) {

    /**
     * Load with nested referrer by loader.
     * @param loaderCall The callback for loader handling. (NotNull)
     */
    def withNestedReferrer(loaderCall: (LOADER) => Unit): Unit = {
        loaderCall(loaderProvider())
    }
}

/**
 * The list of batch entity.
 * @param <ENTITY> The type of entity to be batch updated.
 * @author DBFlute(AutoGenerator)
 */
class ScrBatchEntityList[ENTITY] {

    val _entityCallList: List[(ENTITY) => Unit] = new ArrayList[(ENTITY) => Unit];

    def add(entityCall: (ENTITY) => Unit): Unit = {
        _entityCallList.add(entityCall)
    }

    def entityCallList: List[(ENTITY) => Unit] = { _entityCallList }
}
