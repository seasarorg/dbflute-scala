package com.example.dbflute.scala.dbflute.whitebox.cbean

import org.dbflute.scala.testlib.unit.UnitContainerTestCase
import com.example.dbflute.scala.dbflute.cbean.MemberCB
import com.example.dbflute.scala.dbflute.exbhv.MemberBhv
import javax.sql.DataSource
import com.google.inject.Module
import com.example.dbflute.scala.dbflute.allcommon.DBFluteModule

/**
 * @author jflute
 * @since 1.0.5G (2014/05/17 Saturday)
 */
class WxCBSetupSelectTest extends UnitContainerTestCase {

  protected var memberBhv: MemberBhv = null;

  def prepareDBFluteModule(dataSource: DataSource): Module = {
    return new DBFluteModule(dataSource);
  }

  def test_setupSelect_none() {
    val cb = new MemberCB();
    cb.query().setMemberName_PrefixSearch("S");
    val memberList = memberBhv.selectList(cb);
    memberList.foreach(member => {
      log(member)
      assertTrueAll(member.getMemberName.startsWith("S"));
      assertTrueAll(member.getMemberStatus() == null);
      assertTrueAll(member.getMemberServiceAsOne() == null);
      assertTrueAll(member.getPurchaseList().isEmpty);
    });
  }

  def test_setupSelect_ManyToOne() {
    val cb = new MemberCB();
    cb.setupSelect_MemberStatus();
    cb.query().setMemberName_PrefixSearch("S");
    val memberList = memberBhv.selectList(cb);
    memberList.foreach(member => {
      val status = member.getMemberStatus()
      assertTrueAll(status != null);
      log(member.getMemberName, status.get.getMemberStatusName)
      assertTrueAll(member.getMemberServiceAsOne() == null);
      assertTrueAll(member.getPurchaseList().isEmpty);
    });
  }

  def test_setupSelect_OneToOne() {
    val cb = new MemberCB();
    cb.setupSelect_MemberServiceAsOne;
    cb.query().setMemberName_PrefixSearch("S");
    val memberList = memberBhv.selectList(cb);
    memberList.foreach(member => {
      val service = member.getMemberServiceAsOne()
      assertTrueAll(service != null);
      log(member.getMemberName, service.get.getServicePointCount)
      assertTrueAll(member.getMemberStatus() == null);
      assertTrueAll(member.getPurchaseList().isEmpty);
    });
  }

  def test_setupSelect_OneToOne_with_Nested() {
    val cb = new MemberCB();
    cb.setupSelect_MemberServiceAsOne.withServiceRank;
    cb.query().setMemberName_PrefixSearch("S");
    val memberList = memberBhv.selectList(cb);
    memberList.foreach(member => {
      val service = member.getMemberServiceAsOne()
      assertTrueAll(service != null);
      val rank = service.get.getServiceRank
      assertTrueAll(rank != null);
      log(member.getMemberName, service.get.getServicePointCount, rank.get.getServiceRankName)
      assertTrueAll(member.getMemberStatus() == null);
      assertTrueAll(member.getPurchaseList().isEmpty);
    });
  }
}