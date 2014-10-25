package org.dbflute.unit.core

import java.io.File
import java.sql.SQLException
import java.sql.Timestamp
import java.util.Collection
import java.util.Date
import scala.math.BigDecimal.javaBigDecimal2bigDecimal
import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory
import org.scalatest.BeforeAndAfter
import org.scalatest.FunSuite
import org.seasar.dbflute.AccessContext
import org.seasar.dbflute.unit.core.cannonball.CannonballDirector
import org.seasar.dbflute.unit.core.cannonball.CannonballOption
import org.seasar.dbflute.unit.core.cannonball.CannonballRun
import org.seasar.dbflute.unit.core.cannonball.CannonballStaff
import org.seasar.dbflute.unit.core.filesystem.FileLineHandler
import org.seasar.dbflute.unit.core.filesystem.FilesystemPlayer
import org.seasar.dbflute.unit.core.markhere.MarkHereManager
import org.seasar.dbflute.unit.core.policestory.PoliceStory
import org.seasar.dbflute.unit.core.policestory.javaclass.PoliceStoryJavaClassHandler
import org.seasar.dbflute.unit.core.policestory.jspfile.PoliceStoryJspFileHandler
import org.seasar.dbflute.unit.core.policestory.miscfile.PoliceStoryMiscFileHandler
import org.seasar.dbflute.unit.core.policestory.pjresource.PoliceStoryProjectResourceHandler
import org.seasar.dbflute.unit.core.policestory.webresource.PoliceStoryWebResourceHandler
import org.seasar.dbflute.unit.core.transaction.TransactionPerformFailureException
import org.seasar.dbflute.unit.core.transaction.TransactionPerformer
import org.seasar.dbflute.unit.core.transaction.TransactionResource
import org.seasar.dbflute.util.DfResourceUtil
import org.seasar.dbflute.util.DfTypeUtil
import org.seasar.dbflute.util.Srl
import javax.sql.DataSource

/**
 * @author jflute
 * @since 1.0.5J (2014/07/02 Wednesday)
 */
abstract class PlainFunSuite extends FunSuite with BeforeAndAfter {

  // ===================================================================================
  //                                                                          Definition
  //                                                                          ==========
  /** Log instance for sub class. (NotNull) */
  protected val _xlogger: Log = LogFactory.getLog(getClass());

  // ===================================================================================
  //                                                                           Attribute
  //                                                                           =========
  /** The manager of mark here. (NullAllowed: lazy-loaded) */
  protected var _xmarkHereManager: MarkHereManager = null;

  /** The reserved title for logging test case beginning. (NullAllowed: before preparation or already showed) */
  protected var _xreservedTitle: String = null;

  // ===================================================================================
  //                                                                            Settings
  //                                                                            ========
  before {
    setUp();
  }
  
  after {
    tearDown();
  }

  protected def setUp(): Unit = {
    xreserveShowTitle();
    xprepareAccessContext();
  }

  protected def xreserveShowTitle(): Unit = {
    // lazy-logging (no logging test case, no title)
    _xreservedTitle = "<<< " + xgetCaseDisp() + " >>>";
  }

  protected def tearDown(): Unit = {
    xclearAccessContext();
    xclearMark();
  }

  protected def xprepareAccessContext(): Unit = {
    val context = new AccessContext();
    context.setAccessTimestamp(currentTimestamp());
    context.setAccessDate(currentDate());
    context.setAccessUser(Thread.currentThread().getName());
    context.setAccessProcess(getClass().getSimpleName());
    AccessContext.setAccessContextOnThread(context);
  }

  /**
   * Get the access context for common column auto setup of DBFlute.
   * @return The instance of access context on the thread. (basically NotNull)
   */
  protected def getAccessContext(): AccessContext = { // user method
    return AccessContext.getAccessContextOnThread();
  }

  protected def xclearAccessContext(): Unit = {
    AccessContext.clearAccessContextOnThread();
  }

  protected def xclearMark(): Unit = {
    if (xhasMarkHereManager()) {
      xgetMarkHereManager().checkNonAssertedMark();
      xgetMarkHereManager().clearMarkMap();
      xdestroyMarkHereManager();
    }
  }

  // ===================================================================================
  //                                                                       Assert Helper
  //                                                                       =============
  protected def assertEquals(expected: Object, actual: Object): Unit = {
    assertResult(expected)(actual);
  }

  protected def assertNotNull(obj: Object): Unit = {
    assert(obj != null);
  }

  protected def assertNull(obj: Object): Unit = {
    assert(obj == null);
  }

  /**
   * Assert that the list has any element (not empty). <br />
   * You can use this to guarantee assertion in loop like this:
   * <pre>
   * List&lt;Member&gt; memberList = memberBhv.selectList(cb);
   * <span style="color: #FD4747">assertHasAnyElement(memberList);</span>
   * for (Member member : memberList) {
   *     assertTrue(member.getMemberName().startsWith("S"));
   * }
   * </pre>
   * @param notEmptyList The list expected not empty. (NotNull)
   */
  protected def assertHasAnyElement(notEmptyList: Collection[_]): Unit = {
    if (notEmptyList.isEmpty()) {
      fail("the list should have any element (not empty) but empty.");
    }
  }

  protected def assertHasOnlyOneElement(lonelyList: Collection[_]): Unit = {
    if (lonelyList.size() != 1) {
      fail("the list should have the only one element but: " + lonelyList);
    }
  }

  protected def assertHasPluralElement(crowdedList: Collection[_]): Unit = {
    if (crowdedList.size() < 2) {
      fail("the list should have plural elements but: " + crowdedList);
    }
  }

  protected def assertHasZeroElement(emptyList: Collection[_]): Unit = {
    if (!emptyList.isEmpty()) {
      fail("the list should have zero element (empty) but: " + emptyList);
    }
  }

  // -----------------------------------------------------
  //                                             Mark Here
  //                                             ---------
  /**
   * Mark here to assert that it goes through the road.
   * <pre>
   * final String mark = "cursor";
   * MemberCB cb = new MemberCB();
   * memberBhv.selectCursor(cb, entity -&gt; {
   *     <span style="color: #FD4747">markHere</span>(mark);
   * });
   * assertMarked(mark); <span style="color: #3F7E5E">// the callback called</span>
   * </pre>
   * @param mark The your original mark expression as string. (NotNull)
   */
  protected def markHere(mark: String): Unit = {
    assertNotNull(mark);
    xgetMarkHereManager().mark(mark);
  }

  /**
   * Assert the mark is marked. (found in existing marks)
   * <pre>
   * final String mark = "cursor";
   * MemberCB cb = new MemberCB();
   * memberBhv.selectCursor(cb, entity -&gt; {
   *     markHere(mark);
   * });
   * <span style="color: #FD4747">assertMarked</span>(mark); <span style="color: #3F7E5E">// the callback called</span>
   * </pre>
   * @param mark The your original mark expression as string. (NotNull)
   */
  protected def assertMarked(mark: String): Unit = {
    assertNotNull(mark);
    xgetMarkHereManager().assertMarked(mark);
  }

  /**
   * Is the mark marked? (found the mark in existing marks?)
   * @param mark The your original mark expression as string. (NotNull)
   * @return The determination, true or false.
   */
  protected def isMarked(mark: String): Boolean = {
    assertNotNull(mark);
    return xgetMarkHereManager().isMarked(mark);
  }

  protected def xgetMarkHereManager(): MarkHereManager = {
    if (_xmarkHereManager == null) {
      _xmarkHereManager = new MarkHereManager();
    }
    return _xmarkHereManager;
  }

  protected def xhasMarkHereManager(): Boolean = {
    return _xmarkHereManager != null;
  }

  protected def xdestroyMarkHereManager(): Unit = {
    _xmarkHereManager = null;
  }

  // ===================================================================================
  //                                                                      Logging Helper
  //                                                                      ==============
  /**
   * Log the messages. <br />
   * If you set an exception object to the last element, it shows stack traces.
   * <pre>
   * Member member = ...;
   * <span style="color: #FD4747">log</span>(member.getMemberName(), member.getBirthdate());
   * <span style="color: #3F7E5E">// -&gt; Stojkovic, 1965/03/03</span>
   *
   * Exception e = ...;
   * <span style="color: #FD4747">log</span>(member.getMemberName(), member.getBirthdate(), e);
   * <span style="color: #3F7E5E">// -&gt; Stojkovic, 1965/03/03</span>
   * <span style="color: #3F7E5E">//  (and stack traces)</span>
   * </pre>
   * @param msgs The array of messages. (NotNull)
   */
  protected def log(msgs: Object*): Unit = {
    if (msgs == null) {
      throw new IllegalArgumentException("The argument 'msgs' should not be null.");
    }
    var cause: Throwable = null;
    val arrayLength = msgs.length;
    if (arrayLength > 0) {
      val lastElement: Object = msgs(arrayLength - 1);
      if (lastElement.isInstanceOf[Throwable]) {
        cause = lastElement.asInstanceOf[Throwable];
      }
    }
    val sb: StringBuilder = new StringBuilder();
    var index = 0;
    for (msg: Object <- msgs if !(index == arrayLength - 1 && cause != null)) {
      if (sb.length() > 0) {
        sb.append(", ");
      }
      val appended: String = if (msg.isInstanceOf[Timestamp]) {
        toString(msg, "yyyy/MM/dd HH:mm:ss.SSS");
      } else if (msg.isInstanceOf[Date]) {
        toString(msg, "yyyy/MM/dd");
      } else {
        if (msg != null) { msg.toString() } else { null };
      }
      sb.append(appended);
      index = index + 1;
    }
    val msg: String = sb.toString();
    if (_xreservedTitle != null) {
      _xlogger.debug("");
      _xlogger.debug(_xreservedTitle);
      _xreservedTitle = null;
    }
    if (cause != null) {
      _xlogger.debug(msg, cause);
    } else {
      _xlogger.debug(msg);
    }
    // see comment for logger definition for the detail
    //_xlogger.log(PlainTestCase.class.getName(), Level.DEBUG, msg, cause);
  }

  // ===================================================================================
  //                                                                       String Helper
  //                                                                       =============
  protected def replace(str: String, fromStr: String, toStr: String): String = {
    return Srl.replace(str, fromStr, toStr);
  }

  protected def splitList(str: String, delimiter: String): List[String] = {
    return toScalaList(Srl.splitList(str, delimiter));
  }

  protected def splitListTrimmed(str: String, delimiter: String): List[String] = {
    return toScalaList(Srl.splitListTrimmed(str, delimiter));
  }

  protected def toString(obj: Object): String = {
    return DfTypeUtil.toString(obj);
  }

  protected def toString(obj: Object, pattern: String): String = {
    return DfTypeUtil.toString(obj, pattern);
  }

  // ===================================================================================
  //                                                                       Number Helper
  //                                                                       =============
  protected def toInteger(obj: Object): Integer = {
    return DfTypeUtil.toInteger(obj);
  }

  protected def toLong(obj: Object): Long = {
    return DfTypeUtil.toLong(obj);
  }

  protected def toBigDecimal(obj: Object): BigDecimal = {
    return DfTypeUtil.toBigDecimal(obj);
  }

  // ===================================================================================
  //                                                                         Date Helper
  //                                                                         ===========
  protected def currentDate(): Date = {
    return new Date(System.currentTimeMillis());
  }

  protected def currentTimestamp(): Timestamp = {
    return new Timestamp(System.currentTimeMillis());
  }

  protected def toDate(obj: Object): Date = {
    return DfTypeUtil.toDate(obj);
  }

  protected def toTimestamp(obj: Object): Timestamp = {
    return DfTypeUtil.toTimestamp(obj);
  }

  //  protected def prepareDBFluteModule(dataSource: DataSource): Module = {
  //    return new DBFluteModule(dataSource);
  //  }

  // ===================================================================================
  //                                                                         Transaction
  //                                                                         ===========
  // reserved interfaces
  /**
   * Begin new transaction (even if the transaction has already been begun). <br />
   * You can manually commit or roll-back at your favorite timing by returned transaction resource. <br />
   * On the other hand, you might have mistake of transaction handling. <br />
   * So, also you can use {@link #performNewTransaction(TransactionPerformer)}. (easier)
   * @return The resource of transaction, you can commit or roll-back it. (basically NotNull: if null, transaction unsupported)
   */
  protected def beginNewTransaction(): TransactionResource = {
    // should be overridden by DI container's test case
    return null;
  }

  /**
   * Commit the specified transaction.
   * @param resource The resource of transaction provided by beginNewTransaction(). (NotNull)
   */
  protected def commitTransaction(resource: TransactionResource): Unit = {
  }

  /**
   * Roll-back the specified transaction.
   * @param resource The resource of transaction provided by beginNewTransaction(). (NotNull)
   */
  protected def rollbackTransaction(resource: TransactionResource): Unit = {
  }

  /**
   * Perform the process in new transaction (even if the transaction has already been begun). <br />
   * You can select commit or roll-back by returned value of the callback method.
   * <pre>
   * performNewTransaction(new TransactionPerformer() {
   *     public boolean perform() { <span style="color: #3F7E5E">// transaction scope</span>
   *         ...
   *         return false; <span style="color: #3F7E5E">// true: commit, false: roll-back</span>
   *     }
   * });
   * </pre>
   * @param performer The callback for the transaction process. (NotNull)
   * @throws TransactionPerformFailureException When the performance fails.
   */
  protected def performNewTransaction(performer: TransactionPerformer): Unit = {
    assertNotNull(performer);
    val resource: TransactionResource = beginNewTransaction();
    var cause: Exception = null;
    var commit = false;
    try {
      commit = performer.perform();
    } catch {
      case e: RuntimeException => {
        cause = e;
      }
      case e: SQLException =>
        {
          cause = e;
        }
        throw e;
    } finally {
      if (commit && cause == null) {
        try {
          commitTransaction(resource);
        } catch {
          case e: RuntimeException => {
            cause = e;
          }
        }
      } else {
        try {
          rollbackTransaction(resource);
        } catch {
          case e: RuntimeException => {
            if (cause != null) {
              log(e.getMessage());
            } else {
              cause = e;
            }
          }
        }
      }
    }
    if (cause != null) {
      val msg: String = "Failed to perform the process in transaction: " + performer;
      throw new TransactionPerformFailureException(msg, cause);
    }
  }

  protected def xassertTransactionResourceNotNull(resource: TransactionResource): Unit = {
    if (resource == null) {
      val msg: String = "The argument 'resource' should not be null.";
      throw new IllegalArgumentException(msg);
    }
  }

  /**
   * Get the data source for database.
   * @return The instance from DI container. (basically NotNull: if null, data source unsupported)
   */
  protected def getDataSource(): DataSource = {
    // should be overridden by DI container's test case
    return null;
  }

  // ===================================================================================
  //                                                                         Cannon-ball
  //                                                                         ===========
  /**
   * Execute the cannon-ball run. (Do you know cannon-ball run?) <br />
   * Default thread count is 10, and repeat count is 1.
   * <pre>
   * <span style="color: #FD4747">cannonball</span>(new CannonballRun() {
   *     public void drive(CannonballCar car) {
   *         ... <span style="color: #3F7E5E">// 10 threads is running at the same time</span>
   *     }
   * }, new CannonballOption().expect...);
   * @param run The callback for the run. (NotNull)
   * @param option The option for the run. (NotNull)
   */
  protected def cannonball(run: CannonballRun, option: CannonballOption): Unit = {
    assertNotNull(run);
    assertNotNull(option);
    createCannonballDirector().readyGo(run, option);
  }

  /**
   * Create the instance of cannon-ball director.
   * @return The new-created instance of the director. (NotNull)
   */
  protected def createCannonballDirector(): CannonballDirector = { // customize point
    return new CannonballDirector(xcreateCannonballStaff());
  }

  /**
   * Create the instance of cannon-ball staff.
   * @return The new-created instance of the staff. (NotNull)
   */
  protected def xcreateCannonballStaff(): CannonballStaff = {
    return new CannonballStaff() {
      def help_beginTransaction(): TransactionResource = {
        return beginNewTransaction();
      }

      def help_prepareAccessContext(): Unit = {
        xprepareAccessContext();
      }

      def help_clearAccessContext(): Unit = {
        xclearAccessContext();
      }

      def help_assertEquals(expected: Object, actual: Object): Unit = {
        assertEquals(expected, actual);
      }

      def help_fail(msg: String): Unit = {
        fail(msg);
      }

      def help_log(msgs: Object*): Unit = {
        log(msgs);
      }

      def help_ln(): String = {
        return ln();
      }
    };
  }

  // ===================================================================================
  //                                                                        Police Story
  //                                                                        ============
  /**
   * Tell me about your police story of Java class chase. (default: '.java' files under src/main/java)
   * <pre>
   * policeStoryOfJavaClassChase(new PoliceStoryJavaClassHandler() {
   *     public void handle(File srcFile, Class<?> clazz) {
   *         <span style="color: #3F7E5E">// handle the class as you like it</span>
   *         <span style="color: #3F7E5E">// e.g. clazz.getMethods(), readLine(srcFile, ...)</span>
   *     }
   * });
   * </pre>
   * @param handler The handler of Java class. (NotNull)
   */
  def policeStoryOfJavaClassChase(handler: PoliceStoryJavaClassHandler): Unit = {
    assertNotNull(handler);
    createPoliceStory().chaseJavaClass(handler);
  }

  /**
   * Tell me about your police story of JSP file chase. (default: '.jsp' files under src/main/webapp)
   * <pre>
   * policeStoryOfJspFileChase(new PoliceStoryJspFileHandler() {
   *     public void handle(File jspFile) {
   *         <span style="color: #3F7E5E">// handle the class as you like it</span>
   *         <span style="color: #3F7E5E">// e.g. readLine(jspFile, ...)</span>
   *     }
   * });
   * </pre>
   * @param handler The handler of JSP file. (NotNull)
   */
  def policeStoryOfJspFileChase(handler: PoliceStoryJspFileHandler): Unit = {
    assertNotNull(handler);
    createPoliceStory().chaseJspFile(handler);
  }

  /**
   * Tell me about your police story of miscellaneous resource chase.
   * <pre>
   * policeStoryOfMiscFileChase(new PoliceStoryMiscFileHandler() {
   *     public void handle(File miscFile) {
   *         <span style="color: #3F7E5E">// handle the class as you like it</span>
   *         <span style="color: #3F7E5E">// e.g. readLine(miscFile, ...)</span>
   *     }
   * }, miscDir); <span style="color: #3F7E5E">// you can specify base directory of file</span>
   * </pre>
   * @param handler The handler of miscellaneous resource. (NotNull)
   * @param baseDir The base directory for the miscellaneous file. (NotNull)
   */
  def policeStoryOfMiscFileChase(handler: PoliceStoryMiscFileHandler, baseDir: File): Unit = {
    assertNotNull(handler);
    assertNotNull(baseDir);
    createPoliceStory().chaseMiscFile(handler, baseDir);
  }

  /**
   * Tell me about your police story of project resource chase. (default: under target/test-classes/../../)
   * <pre>
   * policeStoryOfProjectResourceChase(new PoliceStoryProjectResourceHandler() {
   *     public void handle(File resourceFile) {
   *         <span style="color: #3F7E5E">// handle the class as you like it</span>
   *         <span style="color: #3F7E5E">// e.g. readLine(resourceFile, ...)</span>
   *     }
   * });
   * </pre>
   * @param handler The handler of project resource. (NotNull)
   */
  def policeStoryOfProjectResourceChase(handler: PoliceStoryProjectResourceHandler): Unit = {
    assertNotNull(handler);
    createPoliceStory().chaseProjectResource(handler);
  }

  /**
   * Tell me about your police story of web resource chase. (default: under src/main/webapp)
   * <pre>
   * policeStoryOfWebResourceChase(new PoliceStoryWebResourceHandler() {
   *     public void handle(File resourceFile) {
   *         <span style="color: #3F7E5E">// handle the class as you like it</span>
   *         <span style="color: #3F7E5E">// e.g. readLine(resourceFile, ...)</span>
   *     }
   * });
   * </pre>
   * @param handler The handler of web resource. (NotNull)
   */
  def policeStoryOfWebResourceChase(handler: PoliceStoryWebResourceHandler): Unit = {
    assertNotNull(handler);
    createPoliceStory().chaseWebResource(handler);
  }

  /**
   * Create the instance of police story for many story.
   * @return The new-created instance of the police story. (NotNull)
   */
  protected def createPoliceStory(): PoliceStory = { // customize point
    return new PoliceStory(this, getProjectDir());
  }

  // ===================================================================================
  //                                                                          Filesystem
  //                                                                          ==========
  /**
   * Read the line of the text file.
   * @param textFile The file object of text. (NotNull)
   * @param encoding The encoding of the file. (NotNull)
   * @param handler The handler of line string for the text file. (NotNull)
   * @throws IllegalStateException When it fails to read the text file.
   */
  protected def readLine(textFile: File, encoding: String, handler: FileLineHandler): Unit = {
    assertNotNull(textFile);
    assertNotNull(encoding);
    assertNotNull(handler);
    val reader: FilesystemPlayer = createFilesystemPlayer();
    reader.readLine(textFile, encoding, handler);
  }

  /**
   * Create the filesystem player for e.g. reading line.
   * @return The new-created instance of the player. (NotNull)
   */
  protected def createFilesystemPlayer(): FilesystemPlayer = { // customize point
    return new FilesystemPlayer();
  }

  /**
   * Get the directory object of the (application or Eclipse) project. (default: target/test-classes/../../)
   * @return The file object of the directory. (NotNull)
   */
  protected def getProjectDir(): File = { // customize point
    return getTestCaseBuildDir().getParentFile().getParentFile(); // target/test-classes/../../
  }

  /**
   * Get the directory object of the build for the test case. (default: target/test-classes)
   * @return The file object of the directory. (NotNull)
   */
  protected def getTestCaseBuildDir(): File = {
    return DfResourceUtil.getBuildDir(getClass()); // target/test-classes
  }

  // ===================================================================================
  //                                                                       System Helper
  //                                                                       =============
  /**
   * Get the line separator. (LF fixedly)
   * @return The string of the line separator. (NotNull)
   */
  protected def ln(): String = {
    return "\n";
  }

  protected def xgetCaseDisp(): String = {
    return getClass().getSimpleName();
  }

  // ===================================================================================
  //                                                                        Scala Helper
  //                                                                        ============
  protected def toScalaList[ENTITY](javaList: Collection[ENTITY]): scala.collection.immutable.List[ENTITY] = {
    if (javaList == null) { scala.collection.immutable.List() }
    return javaList.toArray.toList.asInstanceOf[scala.collection.immutable.List[ENTITY]];
  }

  // wall
  // wall
  // wall
  // wall
  // wall
  // wall
  // wall
  // wall
  // wall
  // wall
  // wall
}