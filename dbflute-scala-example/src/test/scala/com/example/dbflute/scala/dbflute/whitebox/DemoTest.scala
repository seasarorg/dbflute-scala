package com.example.dbflute.scala.dbflute.whitebox

import scala.collection.JavaConverters.asScalaBufferConverter
import org.dbflute.scala.testlib.unit.UnitContainerTestCase
import com.example.dbflute.scala.dbflute.cbean.MemberCB
import com.example.dbflute.scala.dbflute.exbhv.MemberBhv
import javax.sql.DataSource
import com.google.inject.Module
import com.example.dbflute.scala.dbflute.allcommon.DBFluteModule

/**
 * @author jflute
 */
class DemoTest extends UnitContainerTestCase {

  protected var memberBhv: MemberBhv = null;

  def prepareDBFluteModule(dataSource: DataSource): Module = {
    return new DBFluteModule(dataSource);
  }

  def test_demo(): Unit = {
    val cb = new MemberCB();
    cb.query().setMemberName_PrefixSearch("S");
    val memberList = memberBhv.selectList(cb);
    memberList.asScala.foreach(member => log(member));
  }
}