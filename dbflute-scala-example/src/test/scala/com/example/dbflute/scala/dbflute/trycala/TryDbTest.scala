package com.example.dbflute.scala.dbflute.trycala

import org.dbflute.scala.testlib.unit.UnitContainerTestCase
import com.example.dbflute.scala.dbflute.exbhv.MemberBhv
import com.example.dbflute.scala.dbflute.cbean.MemberCB
import javax.sql.DataSource
import com.google.inject.Module
import com.example.dbflute.scala.dbflute.allcommon.DBFluteModule

/**
 * @author jflute
 * @since 1.0.5G (2014/05/17 Saturday)
 */
class TryDbTest extends UnitContainerTestCase {

  protected var memberBhv: MemberBhv = null;

  def prepareDBFluteModule(dataSource: DataSource): Module = {
    return new DBFluteModule(dataSource);
  }

  def test_ConditionBean_basic() {
    val memberList = memberBhv.selectList(_.query().setMemberName_PrefixSearch("S"))
    memberList.foreach(member => log(member));
  }
}
