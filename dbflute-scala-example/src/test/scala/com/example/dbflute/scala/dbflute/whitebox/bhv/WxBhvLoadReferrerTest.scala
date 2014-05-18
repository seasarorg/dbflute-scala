package com.example.dbflute.scala.dbflute.whitebox.bhv

import org.dbflute.scala.testlib.unit.UnitContainerTestCase
import com.example.dbflute.scala.dbflute.allcommon.DBFluteModule
import com.example.dbflute.scala.dbflute.exbhv.MemberBhv
import com.google.inject.Module
import javax.sql.DataSource

/**
 * @author jflute
 * @since 1.0.5G (2014/05/17 Saturday)
 */
class WxBhvLoadReferrerTest extends UnitContainerTestCase {

  protected var memberBhv: MemberBhv = null;

  def prepareDBFluteModule(dataSource: DataSource): Module = {
    return new DBFluteModule(dataSource);
  }

  def test_LoadReferrer() {
  }
}