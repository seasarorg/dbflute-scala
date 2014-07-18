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
package org.dbflute.unit.core

import scala.collection.JavaConverters._
import java.util.ArrayList
import java.util.List
import java.util.Map
import org.seasar.dbflute.unit.core.binding.BindingAnnotationRule
import org.seasar.dbflute.unit.core.binding.BindingRuleProvider
import org.seasar.dbflute.unit.core.binding.BoundResult
import org.seasar.dbflute.unit.core.binding.ComponentBinder
import org.seasar.dbflute.unit.core.binding.ComponentProvider
import org.seasar.dbflute.unit.core.transaction.TransactionFailureException
import org.seasar.dbflute.unit.core.transaction.TransactionResource
import java.lang.annotation.Annotation

/**
 * @author jflute
 * @since 1.0.5J (2014/07/02 Wednesday)
 */
abstract class InjectionFunSuite extends PlainFunSuite {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                    Transaction Object
    //                                    ------------------
    /** The object that has transaction resources for test case. */
    protected var _xtestCaseTransactionResource: TransactionResource = null;

    // -----------------------------------------------------
    //                                     Component Binding
    //                                     -----------------
    /** The binder of component for the test case. (NotNull) */
    protected val _xtestCaseComponentBinder: ComponentBinder = createTestCaseComponentBinder();

    /** The result of bound component for the test case. (NullAllowed: before binding, after destroy) */
    protected var _xtestCaseBoundResult: BoundResult = null;

    /** The list of mock instance injected to component. (NullAllowed: when no mock) */
    protected var _xmockInstanceList: List[Object] = null; // lazy-loaded

    /** The list of non-binding type NOT injected to component. (NullAllowed: when no mock) */
    protected var _xnonBindingTypeList: List[Class[_]] = null; // lazy-loaded

    // ===================================================================================
    //                                                                            Settings
    //                                                                            ========
    override protected def setUp(): Unit = {
        super.setUp();
        xsetupBeforeContainer();
        xprepareTestCaseContainer();
        xprepareTestCaseComponent();
        xbeginTestCaseTransaction();
    }

    protected def xsetupBeforeContainer(): Unit = {
    }

    protected def xprepareTestCaseContainer();

    /**
     * Does it use one-time container? (re-initialize container per one test case?)
     * @return The determination, true or false.
     */
    protected def isUseOneTimeContainer(): Boolean = { // customize point
        return false;
    }

    protected def xprepareTestCaseComponent(): Unit = {
        _xtestCaseBoundResult = _xtestCaseComponentBinder.bindComponent(this);
    }

    protected def xbeginTestCaseTransaction(): Unit = {
        if (isSuppressTestCaseTransaction()) {
            return;
        }
        _xtestCaseTransactionResource = beginNewTransaction();
    }

    /**
     * Does it suppress transaction for the test case? (non-transaction as default?)
     * @return The determination, true or false.
     */
    protected def isSuppressTestCaseTransaction(): Boolean = { // customize point
        return false; // default is to use the transaction
    }

    override def tearDown(): Unit = {
        xrollbackTestCaseTransaction();
        xdestroyTestCaseComponent();
        xdestroyTestCaseContainer();
        _xmockInstanceList = null;
        _xnonBindingTypeList = null;
        super.tearDown();
    }

    protected def xrollbackTestCaseTransaction(): Unit = {
        if (isSuppressTestCaseTransaction()) {
            return;
        }
        if (_xtestCaseTransactionResource == null) { // just in case
            return;
        }
        if (isCommitTestCaseTransaction()) {
            commitTransaction(_xtestCaseTransactionResource);
        } else {
            rollbackTransaction(_xtestCaseTransactionResource);
        }
        _xtestCaseTransactionResource = null;
    }

    /**
     * Does it commit transaction for the test case? (commit updated data?)
     * @return The determination, true or false.
     */
    protected def isCommitTestCaseTransaction(): Boolean = { // customize point
        return false; // default is to roll-back always
    }

    /**
     * {@inheritDoc}
     */
    override protected def commitTransaction(resource: TransactionResource): Unit = { // user method
        xassertTransactionResourceNotNull(resource);
        try {
            resource.commit();
        } catch {
          case e: Exception => {
            val msg: String = "Failed to commit the transaction: " + resource;
            throw new TransactionFailureException(msg, e);
        }
        }
    }

    /**
     * {@inheritDoc}
     */
    override protected def rollbackTransaction(resource: TransactionResource): Unit = { // user method
        xassertTransactionResourceNotNull(resource);
        try {
            resource.rollback();
        } catch {
          case e: Exception => {
            val msg: String = "Failed to roll-back the transaction: " + resource;
            throw new TransactionFailureException(msg, e);
          }
        }
    }

    protected def xdestroyTestCaseComponent(): Unit = {
        _xtestCaseComponentBinder.releaseBoundComponent(this, _xtestCaseBoundResult);
        _xtestCaseBoundResult = null;
    }

    protected def xdestroyTestCaseContainer(): Unit = {
        if (isUseOneTimeContainer() || isDestroyContainerAtTearDown()) {
            xdestroyContainer();
            xclearCachedContainer();
        }
    }

    /**
     * Does it destroy container instance at tear-down? (next test uses new-created container?)
     * @return The determination, true or false.
     */
    protected def isDestroyContainerAtTearDown(): Boolean = { // customize point
        return false; // default is to cache the instance
    }

    protected def xclearCachedContainer();

    // ===================================================================================
    //                                                                   Component Binding
    //                                                                   =================
    // -----------------------------------------------------
    //                                                Binder
    //                                                ------
    protected def xcreateBasicComponentBinder(): ComponentBinder = { // customize point
        return new ComponentBinder(xcreateComponentProvider(), createBindingRuleProvider());
    }

    protected def xcreateComponentProvider(): ComponentProvider = {
        return new ComponentProvider() {

            def provideComponent[COMPONENT](tp: Class[COMPONENT]): COMPONENT = {
                return getComponent(tp);
            }

            def provideComponent[COMPONENT](name: String): COMPONENT = {
                return getComponent(name).asInstanceOf[COMPONENT];
            }

            def existsComponent(tp: Class[_]): Boolean = {
                return hasComponent(tp);
            }

            def existsComponent(name: String): Boolean = {
                return hasComponent(name);
            }
        };
    }

    protected def createTestCaseComponentBinder(): ComponentBinder = { // customize point
        val binder: ComponentBinder = xcreateBasicComponentBinder();
        binder.stopBindingAtSuper(classOf[InjectionFunSuite]);
        binder.looseBinding();
        return binder;
    }

    /**
     * Register the mock instance for injection.
     * <pre>
     * FooAction action = new FooAction();
     * <span style="color: #FD4747">registerMockInstance</span>(new FooBhv());
     * inject(action); <span style="color: #3F7E5E">// the new-created behavior is injected</span>
     * </pre>
     * @param mock The mock instance injected to component. (NotNull)
     */
    def registerMockInstance(mock: Object): Unit = { // user method
        assertNotNull(mock);
        if (_xmockInstanceList == null) {
            _xmockInstanceList = new ArrayList[Object]();
        }
        _xmockInstanceList.add(mock);
    }

    /**
     * Suppress the binding of the type for injection.
     * <pre>
     * FooAction action = new FooAction();
     * <span style="color: #FD4747">suppressBindingOf</span>(FooBhv.class);
     * inject(action); <span style="color: #3F7E5E">// not injected about the behavior type</span>
     * </pre>
     * @param nonBindingType The non-binding type NOT injected to component. (NotNull)
     */
    def suppressBindingOf(nonBindingType: Class[_]): Unit = { // user method
        assertNotNull(nonBindingType);
        if (_xnonBindingTypeList == null) {
            _xnonBindingTypeList = new ArrayList[Class[_]]();
        }
        _xnonBindingTypeList.add(nonBindingType);
    }

    protected def createBindingRuleProvider(): BindingRuleProvider = {
        return new BindingRuleProvider() {
            def provideBindingAnnotationRuleMap(): Map[Class[_ <: Annotation], BindingAnnotationRule] = {
                return xprovideBindingAnnotationRuleMap();
            }

            def filterByBindingNamingRule(propertyName: String, propertyType: Class[_]): String = {
                return xfilterByBindingNamingRule(propertyName, propertyType);
            }
        };
    }

    protected def xprovideBindingAnnotationRuleMap(): Map[Class[_ <: Annotation], BindingAnnotationRule];
    
    protected def xfilterByBindingNamingRule(propertyName: String, propertyType: Class[_]): String = {
        return null; // as default: means no filter
    }

    // -----------------------------------------------------
    //                                                Inject
    //                                                ------
    /**
     * Inject dependencies for the bean.
     * <pre>
     * FooAction action = new FooAction();
     * <span style="color: #FD4747">inject</span>(action);
     * 
     * action.submit();
     * ...
     * </pre>
     * @param bean The instance of bean. (NotNull)
     * @return The information of bound result. (NotNull)
     */
    protected def inject(bean: Object): BoundResult = { // user method
        val binder: ComponentBinder = createOuterComponentBinder(bean);
        return xdoInject(bean, binder);
    }

    protected def createOuterComponentBinder(bean: Object): ComponentBinder = { // customize point
        val binder: ComponentBinder = xcreateBasicComponentBinder();
        xadjustOuterComponentBinder(bean, binder);
        return binder;
    }

    protected def xadjustOuterComponentBinder(bean: Object, binder: ComponentBinder): Unit = {
        // adjust mock components
        val mockInstanceList: java.util.List[Object] = new java.util.ArrayList();
        if (_xmockInstanceList != null) {
            mockInstanceList.addAll(_xmockInstanceList);
        }
        prepareMockInstance(mockInstanceList);
        for (mockInstance: Object <- mockInstanceList.asScala) {
            if (mockInstance != bean) { // check instance so uses '==' to suppress infinity loop just in case
            	binder.addMockInstance(mockInstance);
            }
        }

        // adjust no binding components
        val nonBindingTypeList: java.util.List[Class[_]] = new java.util.ArrayList();
        if (_xnonBindingTypeList != null) {
            nonBindingTypeList.addAll(_xnonBindingTypeList);
        }
        prepareNoBindingType(nonBindingTypeList);
        nonBindingTypeList.asScala.foreach(binder.addNonBindingType(_));
    }

    /**
     * @param mockInstanceList The list of mock instance. (NotNull)
     * @deprecated You can use registerMockInstance().
     */
    protected def prepareMockInstance(mockInstanceList: List[Object]): Unit = { // option by overriding
    }

    /**
     * @param nonBindingTypeList The list of non-binding type. (NotNull)
     * @deprecated You can suppressBindingOf().
     */
    protected def prepareNoBindingType(nonBindingTypeList: List[Class[_]]): Unit = { // option by overriding
    }

    protected def xdoInject(bean: Object, binder: ComponentBinder): BoundResult = {
        return binder.bindComponent(bean);
    }

    // ===================================================================================
    //                                                                  Container Handling
    //                                                                  ==================
    protected def xdestroyContainer();

    /**
     * Get component from DI container for the type.
     * @param type The type of component to find. (NotNull)
     * @return The instance of the component. (NotNull: if not found, throws exception)
     */
    protected def getComponent[COMPONENT](tp: Class[COMPONENT]): COMPONENT; // user method

    /**
     * Get component from DI container for the name.
     * @param name The name of component to find. (NotNull)
     * @return The instance of the component. (NotNull: if not found, throws exception)
     */
    protected def getComponent[COMPONENT](name: String): COMPONENT; // user method

    /**
     * Does it have the component on the DI container for the type.
     * @param type The type of component to find. (NotNull)
     * @return The determination, true or false.
     */
    protected def hasComponent(tp: Class[_]): Boolean; // user method

    /**
     * Does it have the component on the DI container for the name.
     * @param name The name of component to find. (NotNull)
     * @return The determination, true or false.
     */
    protected def hasComponent(name: String): Boolean; // user method
}
