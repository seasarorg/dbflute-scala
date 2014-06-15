package com.example.dbflute.scala.dbflute.allcommon;

import org.seasar.dbflute.bhv._;
import org.seasar.dbflute.cbean._;
import org.seasar.dbflute.jdbc.StatementConfig;

/**
 * The option of insert as Scala runtime.
 * @param <CB> The type of condition-bean.
 * @author DBFlute(AutoGenerator)
 */
class ScrInsertOption[CB <: ConditionBean](option: InsertOption[CB]) {

    def specify(specCall: (CB) => Unit): Unit = {
        option.specify(new SpecifyQuery[CB]() { def specify(cb: CB): Unit = { specCall(cb) } });
    }
    def exceptCommonColumnForcedSpecified(): ScrInsertOption[CB] = { option.exceptCommonColumnForcedSpecified(); return this; }
    def disableCommonColumnAutoSetup(): ScrInsertOption[CB] = { option.disableCommonColumnAutoSetup(); return this; }
    def disablePrimaryKeyIdentity(): ScrInsertOption[CB] = { option.disablePrimaryKeyIdentity(); return this; }
    def limitBatchInsertLogging(batchLoggingInsertLimit: Int): ScrInsertOption[CB] =
    { option.limitBatchInsertLogging(batchLoggingInsertLimit); return this; }

    def configure(configCall: (StatementConfig) => Unit): Unit =
    { val config = new StatementConfig(); configCall(config); option.configure(config); }

    def toNative(): InsertOption[CB] = { option }

    override def toString(): String = { option.toString() }
}

/**
 * The option of update as Scala runtime.
 * @param <CB> The type of condition-bean.
 * @author DBFlute(AutoGenerator)
 */
class ScrUpdateOption[CB <: ConditionBean](option: UpdateOption[CB]) {

    def self(specCall: (CB) => Unit): ScrHpCalculator = {
        return new ScrHpCalculator(option.self(new SpecifyQuery[CB]() { def specify(cb: CB): Unit = { specCall(cb) } }));
    }
    def specify(specCall: (CB) => Unit): Unit = {
        option.specify(new SpecifyQuery[CB]() { def specify(cb: CB): Unit = { specCall(cb) } });
    }
    def exceptCommonColumnForcedSpecified(): ScrUpdateOption[CB] = { option.exceptCommonColumnForcedSpecified(); return this; }
    def disableCommonColumnAutoSetup(): ScrUpdateOption[CB] = { option.disableCommonColumnAutoSetup(); return this; }
    def allowNonQueryUpdate(): ScrUpdateOption[CB] = { option.allowNonQueryUpdate(); return this; }
    def allowQueryUpdateForcedDirect(): ScrUpdateOption[CB] = { option.allowQueryUpdateForcedDirect(); return this; }
    def limitBatchUpdateLogging(batchLoggingUpdateLimit: Int): ScrUpdateOption[CB] =
    { option.limitBatchUpdateLogging(batchLoggingUpdateLimit); return this; }
    def configure(configCall: (StatementConfig) => Unit): Unit =
    { val config = new StatementConfig(); configCall(config); option.configure(config); }

    def toNative(): UpdateOption[CB] = { option }

    override def toString(): String = { option.toString() }
}

/**
 * The option of delete as Scala runtime.
 * @param <CB> The type of condition-bean.
 * @author DBFlute(AutoGenerator)
 */
class ScrDeleteOption[CB <: ConditionBean](option: DeleteOption[CB]) {

    def allowNonQueryDelete(): ScrDeleteOption[CB] = { option.allowNonQueryDelete(); return this; }
    def allowQueryDeleteForcedDirect(): ScrDeleteOption[CB] = { option.allowQueryDeleteForcedDirect(); return this; }
    def limitBatchDeleteLogging(batchLoggingDeleteLimit: Int): ScrDeleteOption[CB] =
    { option.limitBatchDeleteLogging(batchLoggingDeleteLimit); return this; }
    def configure(configCall: (StatementConfig) => Unit): Unit =
    { val config = new StatementConfig(); configCall(config); option.configure(config); }

    def toNative(): DeleteOption[CB] = { option }

    override def toString(): String = { option.toString() }
}
