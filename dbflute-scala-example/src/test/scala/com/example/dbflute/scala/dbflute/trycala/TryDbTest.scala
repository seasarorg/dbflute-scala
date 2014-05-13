package com.example.dbflute.scala.dbflute.trycala

import scala.collection.JavaConverters.asScalaBufferConverter
import org.seasar.dbflute.BehaviorSelector
import org.dbflute.scala.testlib.dbflute.exbhv.MemberBhv
import org.dbflute.scala.testlib.dbflute.cbean.MemberCB
import org.dbflute.scala.testlib.unit.UnitContainerTestCase

/**
 * @author jflute
 */
class TryDbTest extends UnitContainerTestCase {

  // #why? "illegal cyclic reference involving class"
  //protected var memberBhv: MemberBhv = null;
  protected var selector: BehaviorSelector = null;

  def test_ConditionBean_basic() {
    val cb = new MemberCB();
    cb.query().setMemberName_PrefixSearch("S");
    val memberBhv = selector.select(classOf[MemberBhv]);
    val memberList = memberBhv.selectList(cb);
    memberList.asScala.foreach(member => log(member));
  }
}