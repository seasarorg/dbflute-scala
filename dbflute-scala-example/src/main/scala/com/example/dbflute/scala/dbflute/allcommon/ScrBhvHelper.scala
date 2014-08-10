package com.example.dbflute.scala.dbflute.allcommon;

import scala.collection.immutable;

import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.dbflute.cbean.PagingBean;
import org.seasar.dbflute.cbean.PagingResultBean;
import org.seasar.dbflute.immutable.DBableEntity;
import org.seasar.dbflute.immutable.outsidesql._;
import org.seasar.dbflute.outsidesql._;
import org.seasar.dbflute.outsidesql.executor._;
import org.seasar.dbflute.outsidesql.typed._;
import org.seasar.dbflute.jdbc.CursorHandler;
import org.seasar.dbflute.jdbc.StatementConfig;

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

/**
 * The paging view that has selected result.
 * @param <ENTITY> The type of immutable entity to be selected.
 * @author DBFlute(AutoGenerator)
 */
class ScrPagingView[ENTITY](val selectedList: immutable.List[ENTITY], bean: PagingResultBean[_]) {

    def allRecordCount: Int = { bean.getAllRecordCount() }
    def allPageCount: Int = { bean.getAllPageCount() }
    def currentPageNumber: Int = { bean.getCurrentPageNumber() }
    def previousPageNumber: Int = { bean.getPrePageNumber() }
    def nextPageNumber: Int = { bean.getNextPageNumber() }
    def beginPageNumber: Int = { bean.getCurrentStartRecordNumber() }
    def endPageNumber: Int = { bean.getCurrentEndRecordNumber() }
    def existsPreviousPage: Boolean = { bean.isExistPrePage() }
    def existsNextPage: Boolean = { bean.isExistNextPage() }

    override def toString(): String = { bean.toString() }
}
