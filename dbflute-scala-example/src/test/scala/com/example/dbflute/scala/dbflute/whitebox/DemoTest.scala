package com.example.dbflute.scala.dbflute.whitebox
import com.example.dbflute.guice.unit.UnitContainerTestCase

import scala.Function1
import scala.collection.JavaConverters._
import com.example.dbflute.guice.dbflute.cbean.MemberCB
import com.example.dbflute.guice.dbflute.exbhv.MemberBhv
import org.seasar.dbflute.BehaviorSelector
import com.example.dbflute.guice.dbflute.exbhv.MemberBhv
import scala.collection.mutable.Buffer

/**
 * @author jflute
 */
class DemoTest extends UnitContainerTestCase {

  // #why? "illegal cyclic reference involving class"
  //protected var memberBhv: MemberBhv = null;
  protected var selector: BehaviorSelector = null;

  def test_demo() {
    val cb = new MemberCB();
    cb.query().setMemberName_PrefixSearch("S");
    val memberBhv = selector.select(classOf[MemberBhv]);
    val memberList = memberBhv.selectList(cb);
    memberList.asScala.foreach(member => log(member));
  }
}