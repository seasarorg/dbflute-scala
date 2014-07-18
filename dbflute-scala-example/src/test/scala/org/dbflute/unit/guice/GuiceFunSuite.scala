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

import java.util.ArrayList
import java.util.List
import java.util.Map
import javax.transaction.TransactionManager
import org.seasar.dbflute.unit.core.binding.BindingAnnotationRule
import org.seasar.dbflute.unit.core.binding.ComponentBinder
import org.seasar.dbflute.unit.core.transaction.TransactionFailureException
import org.seasar.dbflute.unit.core.transaction.TransactionResource
import com.google.inject.Guice
import com.google.inject.Injector
import com.google.inject.Module
import com.google.inject.Inject
import javax.inject.Inject
import org.seasar.dbflute.unit.guice.GuiceTransactionResource
import org.dbflute.unit.core.InjectionFunSuite
import com.google.inject.Inject
import javax.inject.Inject
import java.lang.annotation.Annotation

/**
 * @author jflute
 * @since 1.0.5J (2014/07/02 Wednesday)
 */
abstract class GuiceFunSuite extends InjectionFunSuite {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                          Static Cache
    //                                          ------------
    /** The cached injector for DI container. (NullAllowed: null means beginning or test execution) */
    protected var _xcachedInjector: Injector = null;

    // -----------------------------------------------------
    //                                          Guice Object
    //                                          ------------
    /** The current active injector for DI container. {Guice Object} */
    protected var _xcurrentActiveInjector: Injector = null;

    /** The transaction manager for platform. (NotNull: after injection) */
    protected var _xtransactionManager: TransactionManager = null;

    // ===================================================================================
    //                                                                            Settings
    //                                                                            ========
    // -----------------------------------------------------
    //                                     Prepare Container
    //                                     -----------------
    protected def xprepareTestCaseContainer(): Unit = {
        xdoPrepareTestCaseContainer();
        xsaveCachedInstance();
    }

    protected def xdoPrepareTestCaseContainer(): Unit = {
        if (isUseOneTimeContainer()) {
            xdestroyContainer();
        }
        if (xisInitializedContainer()) {
            if (xcanRecycleContainer()) {
                log("...Recycling guice");
                xrecycleContainerInstance();
                return;
            } else {
                xdestroyContainer();
            }
        }
        val moduleList = prepareModuleList();
        xinitializeContainer(moduleList);
    }

    protected def xcanRecycleContainer(): Boolean = {
        // fixedly true, change unsupported for now
        // (keep same structure as other DI containers)
        return true;
    }

    protected def xrecycleContainerInstance(): Unit = {
        _xcurrentActiveInjector = _xcachedInjector;
    }

    protected def xsaveCachedInstance(): Unit = {
        // no cache for now
    }

    /**
     * Prepare module list for Google Guice. <br />
     * You should add DataSource and TransactionManager to the module. 
     * @return The list of module. (NotNull)
     */
    protected def prepareModuleList(): List[Module] = { // customize point
        return new ArrayList[Module](); // as default
    }

    @Override
    protected def xclearCachedContainer(): Unit = {
        _xcachedInjector = null;
    }

    // ===================================================================================
    //                                                                         Transaction
    //                                                                         ===========
    /**
     * {@inheritDoc}
     */
    override protected def beginNewTransaction(): TransactionResource = { // user method
        if (_xtransactionManager == null) { // no use transaction (just in case)
            return null;
        }
        try {
            _xtransactionManager.begin();
        } catch {
          case e: Exception => {
            throw new TransactionFailureException("Failed to begin the transaction.", e);
          }
        }
        val resource: GuiceTransactionResource = new GuiceTransactionResource();
        resource.setTransactionManager(_xtransactionManager);
        return resource; // for thread-fire's transaction or manual transaction
    }

    // ===================================================================================
    //                                                                   Component Binding
    //                                                                   =================
    override protected def createOuterComponentBinder(bean: Object): ComponentBinder = {
        val binder: ComponentBinder = super.createOuterComponentBinder(bean);
        binder.annotationOnlyBinding();
        return binder;
    }

    protected def xprovideBindingAnnotationRuleMap(): Map[Class[_ <: Annotation], BindingAnnotationRule] = {
        // javax.annotation.Resource is unsupported on Google Guice
        val ruleMap: Map[Class[_ <: Annotation],  BindingAnnotationRule] = new java.util.HashMap();
        ruleMap.put(classOf[com.google.inject.Inject], new BindingAnnotationRule());
        ruleMap.put(classOf[javax.inject.Inject], new BindingAnnotationRule());
        return ruleMap;
    }

    // ===================================================================================
    //                                                                      Guice Handling
    //                                                                      ==============
    // -----------------------------------------------------
    //                                            Initialize
    //                                            ----------
    protected def xisInitializedContainer(): Boolean = {
        return _xcachedInjector != null;
    }

    protected def xinitializeContainer(moduleList: List[Module]): Unit = {
        log("...Initializing guice: " + moduleList);
        _xcurrentActiveInjector = Guice.createInjector(moduleList);
        _xcachedInjector = _xcurrentActiveInjector;
    }

    // -----------------------------------------------------
    //                                               Destroy
    //                                               -------
    @Override
    protected def xdestroyContainer(): Unit = {
        _xcachedInjector = null;
        _xcurrentActiveInjector = null;
    }

    // -----------------------------------------------------
    //                                             Component
    //                                             ---------
    /**
     * {@inheritDoc}
     */
    protected def getComponent[COMPONENT](tp: Class[COMPONENT]): COMPONENT = { // user method
        return _xcurrentActiveInjector.getInstance(tp);
    }

    /**
     * {@inheritDoc}
     */
    protected def getComponent[COMPONENT](name: String): COMPONENT = { // user method
        throw new IllegalStateException("The guice does not support by-name component: " + name);
    }

    /**
     * {@inheritDoc}
     */
    protected def hasComponent(tp: Class[_]): Boolean = { // user method
        try {
            getComponent(tp);
            return true;
        } catch {
          case e: RuntimeException => {
        	  return false;
          }
        }
    }

    /**
     * {@inheritDoc}
     */
    protected def hasComponent(name: String): Boolean = { // user method
        try {
            getComponent(name);
            return true;
        } catch {
          case e: RuntimeException => {
        	  return false;
          }
        }
    }
}
