package com.example.dbflute.scala.dbflute.whitebox.cbean

import org.dbflute.scala.testlib.unit.UnitContainerTestCase
import com.example.dbflute.scala.dbflute.cbean.MemberCB
import com.example.dbflute.scala.dbflute.exbhv.MemberBhv
import javax.sql.DataSource
import com.google.inject.Module
import com.example.dbflute.scala.dbflute.allcommon.DBFluteModule
import junit.framework.AssertionFailedError

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
    cb.query.addOrderBy_Birthdate_Desc.withNullsLast
    val memberList = memberBhv.selectList(cb);
    memberList.foreach(member => {
      if (member.memberName.startsWith("S")) {
        log("aaa");
      } else {
    	  log("bbb");
      }
      assertTrueAll(member.memberName.startsWith("S"));
      assertTrueAll(member.memberStatus().isEmpty);
      assertTrueAll(member.memberServiceAsOne().isEmpty);
      assertTrueAll(member.purchaseList().isEmpty);
    });
  }

  def test_setupSelect_ManyToOne() {
    val cb = new MemberCB();
    cb.setupSelect_MemberStatus();
    cb.query().setMemberName_PrefixSearch("S");
    val memberList = memberBhv.selectList(cb);
    memberList.foreach(member => {
      val status = member.memberStatus()
      assertTrueAll(status != null);
      log(member.memberName, status.get.memberStatusName)
      assertTrueAll(member.memberServiceAsOne().isEmpty);
      assertTrueAll(member.purchaseList().isEmpty);
    });
  }

  def test_setupSelect_OneToOne() {
    val cb = new MemberCB();
    cb.setupSelect_MemberServiceAsOne;
    cb.query().setMemberName_PrefixSearch("S");
    val memberList = memberBhv.selectList(cb);
    memberList.foreach(member => {
      val service = member.memberServiceAsOne()
      assertTrueAll(service != null);
      log(member.memberName, service.get.servicePointCount)
      assertTrueAll(member.memberStatus().isEmpty);
      assertTrueAll(member.purchaseList().isEmpty);
    });
  }

  def test_setupSelect_OneToOne_with_Nested() {
    val cb = new MemberCB();
    cb.setupSelect_MemberServiceAsOne.withServiceRank;
    cb.query().setMemberName_PrefixSearch("S");
    val memberList = memberBhv.selectList(cb);
    memberList.foreach(member => {
      val service = member.memberServiceAsOne()
      assertTrueAll(service != null);
      val rank = service.get.serviceRank
      assertTrueAll(rank != null);
      log(member.memberName, service.get.servicePointCount, rank.get.serviceRankName)
      assertTrueAll(member.memberStatus().isEmpty);
      assertTrueAll(member.purchaseList().isEmpty);
    });
  }
}