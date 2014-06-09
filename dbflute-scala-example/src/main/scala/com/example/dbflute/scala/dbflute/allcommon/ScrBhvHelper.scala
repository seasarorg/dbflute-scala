package com.example.dbflute.scala.dbflute.allcommon;

/**
 * @param <LOADER> The type of loader for referrer.
 * @author jflute
 */
class ScrNestedReferrerLoader[LOADER](loaderProvider: () => LOADER) {
    def withNestedList(loaderCall: (LOADER) => Unit): Unit = {
        loaderCall(loaderProvider())
    }
}
