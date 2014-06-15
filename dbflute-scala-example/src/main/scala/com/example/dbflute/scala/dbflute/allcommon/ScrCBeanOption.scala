package com.example.dbflute.scala.dbflute.allcommon;

import java.util.Date;

import org.seasar.dbflute.cbean.ManualOrderBean;
import org.seasar.dbflute.cbean.coption._;
import org.seasar.dbflute.cbean.chelper.HpMobConnectedBean

/**
 * The option of like-search as Scala runtime.
 * @author DBFlute(AutoGenerator)
 */
class ScrLikeSearchOption extends LikeSearchOption {
}

/**
 * The option of from-to as Scala runtime.
 * @author DBFlute(AutoGenerator)
 */
class ScrFromToOption extends FromToOption {
}

/**
 * The option of range-of as Scala runtime.
 * @author DBFlute(AutoGenerator)
 */
class ScrRangeOfOption extends RangeOfOption {
}

/**
 * The beao of manual-order as Scala runtime.
 * @author DBFlute(AutoGenerator)
 */
class ScrManualOrderBean extends ManualOrderBean {

    def when_FromTo(fromDate: Date, toDate: Date)(optionCall: (ScrFromToOption) => Unit): HpMobConnectedBean = {
        val option = new ScrFromToOption(); optionCall(option);
        super.when_FromTo(fromDate, toDate, option);
    }
}

/**
 * The beao of column conversion as Scala runtime.
 * @author DBFlute(AutoGenerator)
 */
class ScrColumnConversionOption extends ColumnConversionOption {
}
