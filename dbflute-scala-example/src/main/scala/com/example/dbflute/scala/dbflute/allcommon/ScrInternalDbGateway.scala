package com.example.dbflute.scala.dbflute.allcommon;

import org.seasar.dbflute.s2dao.extension.TnBeanMetaDataFactoryExtension;
import org.seasar.dbflute.s2dao.extension.TnRelationOptionalFactory;
import org.seasar.dbflute.s2dao.metadata.TnRelationPropertyType;

/**
 * @author jflute
 */
class ScrBeanMetaDataFactoryExtension extends TnBeanMetaDataFactoryExtension {

    override protected def createRelationOptionalFactory(): TnRelationOptionalFactory = {
        return new ScrRelationOptionalFactory();
    }
}

/**
 * @author jflute
 */
class ScrRelationOptionalFactory extends TnRelationOptionalFactory {

    override protected def createOptionalNullEntity(row: Object, rpt: TnRelationPropertyType): Object = {
        return Option.empty;
    }

    override protected def createOptionalPresentEntity(relationRow: Object): Object = {
        return Option.apply(relationRow);
    }

    override def getOptionalEntityType(): Class[_] = {
        return classOf[Option[_]];
    }
}
