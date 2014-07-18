/*
 * Copyright 2004-2014 the Seasar Foundation and the Others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package org.dbflute.unit.guice

import javax.sql.DataSource

/**
 * @author jflute
 * @since 1.0.5J (2014/07/02 Wednesday)
 */
abstract class ContainerFunSuite extends GuiceFunSuite {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The data source for database. (NotNull: after injection) */
    protected var _xdataSource: DataSource = null;

    // ===================================================================================
    //                                                                         JDBC Helper
    //                                                                         ===========
    /**
     * {@inheritDoc}
     */
    override protected def getDataSource(): DataSource = { // user method
        return _xdataSource;
    }
}
