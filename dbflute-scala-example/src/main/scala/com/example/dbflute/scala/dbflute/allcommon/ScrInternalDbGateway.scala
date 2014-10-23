package com.example.dbflute.scala.dbflute.allcommon;

import org.seasar.dbflute.optional.RelationOptionalFactory;
import org.seasar.dbflute.optional.OptionalThingExceptionThrower;

/**
 * @author DBFlute(AutoGenerator)
 */
class ScrRelationOptionalFactory extends RelationOptionalFactory {

    override protected def createOptionalNullEntity(thrower: OptionalThingExceptionThrower): Object = {
        return Option.empty;
    }

    override protected def createOptionalPresentEntity(relationRow: Object): Object = {
        return Option.apply(relationRow);
    }

    override def getOptionalEntityType(): Class[_] = {
        return classOf[Option[_]];
    }

    override def orElseNull(optional: Object): Object = {
        return optional.asInstanceOf[Option[Object]].orNull;
    }
}
