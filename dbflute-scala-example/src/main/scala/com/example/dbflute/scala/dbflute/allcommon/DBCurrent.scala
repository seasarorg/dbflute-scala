package com.example.dbflute.scala.dbflute.allcommon;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.seasar.dbflute.DBDef;

/**
 * @author DBFlute(AutoGenerator)
 */
object DBCurrent {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Log instance. */
    private val _log: Log = LogFactory.getLog(getClass());

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected var _currentDBDef: DBDef = null;
    {
        _currentDBDef = DBDef.codeOf("h2");
        if (_currentDBDef == null) {
            _currentDBDef = DBDef.Unknown;
        }
    }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    def initializeCurrentDBDef(currentDBDef: DBDef): Unit = {
	    if (_log.isInfoEnabled()) {
		    _log.info("...Setting currentDBDef: " + currentDBDef);
		}
		if (currentDBDef == null) {
		    val msg: String = "The argument 'currentDBDef' should not be null!";
		    throw new IllegalArgumentException(msg);
		}
        _currentDBDef = currentDBDef;
    }

    def currentDBDef(): DBDef = {
        return _currentDBDef;
    }

    def isCurrentDBDef(currentDBDef: DBDef): Boolean = {
	    return _currentDBDef.equals(currentDBDef);
    }
}
