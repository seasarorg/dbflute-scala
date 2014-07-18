package com.example.dbflute.scala.dbflute.whitebox.cbean

import com.example.dbflute.scala.dbflute.allcommon.DBFluteModule
import com.example.dbflute.scala.dbflute.allcommon.DBFlutist
import com.example.dbflute.scala.dbflute.exbhv.MemberBhv
import com.google.inject.Module
import javax.sql.DataSource
import com.example.dbflute.scala.unit.UnitContainerFunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

/**
 * @author jflute
 * @since 1.0.5G (2014/05/17 Saturday)
 */
@RunWith(classOf[JUnitRunner])
class WxCBSetupSelectTest extends UnitContainerFunSuite {

  protected var memberBhv: MemberBhv = null;

  test("setupSelect_none") {
    val memberList = memberBhv.selectList { cb =>
      cb.query().setMemberName_PrefixSearch("S")
      cb.query.addOrderBy_Birthdate_Desc.withNullsLast
    }
    memberList.foreach(member => {
      if (member.memberName.startsWith("S")) {
        log("aaa");
      } else {
        log("bbb");
      }
      assert(member.memberName.startsWith("S"));
      assert(member.memberStatus.isEmpty);
      assert(member.memberServiceAsOne.isEmpty);
      assert(member.purchaseList.isEmpty);
    });
  }

  test("setupSelect_ManyToOne") {
    val memberList = memberBhv.selectList { cb =>
      cb.setupSelect_MemberStatus();
      cb.query().setMemberName_PrefixSearch("S");
    }
    memberList.foreach(member => {
      val status = member.memberStatus
      assert(status != null);
      log(member.memberName, status.get.memberStatusName)
      assert(member.memberServiceAsOne.isEmpty);
      assert(member.purchaseList.isEmpty);
    });
  }

  test("setupSelect_OneToOne") {
    val memberList = memberBhv.selectList { cb =>
      cb.setupSelect_MemberServiceAsOne;
      cb.query().setMemberName_PrefixSearch("S");
    }
    memberList.foreach(member => {
      val service = member.memberServiceAsOne
      assert(service != null);
      log(member.memberName, service.get.servicePointCount.toString)
      assert(member.memberStatus.isEmpty);
      assert(member.purchaseList.isEmpty);
    });
  }

  test("setupSelect_OneToOne_with_Nested") {
    val memberList = memberBhv.selectList { cb =>
      cb.setupSelect_MemberStatus
      cb.setupSelect_MemberServiceAsOne.withServiceRank;
      cb.query().setMemberName_PrefixSearch("S");
    }
    memberList.foreach(member => {
      val service = member.memberServiceAsOne
      assert(service != null);
      val rank = service.get.serviceRank
      assert(rank != null);
      log(member.memberName, service.get.servicePointCount.toString, rank.get.serviceRankName)
      assert(member.memberStatus.isDefined);
      assert(member.purchaseList.isEmpty);
    });

    // trying
    memberList.foreach { member =>
      log(member.memberName, member.memberStatus.get.memberStatusName, member.memberServiceAsOne.get.servicePointCount.toString)
      for (ms <- member.memberStatus; msa <- member.memberServiceAsOne) {
        ms.description
        msa.isServiceRankCode_Plastic
      }
      member.memberStatus.flatMap(ms => member.memberServiceAsOne.map { msa => })
      assert(member.memberName.startsWith("S"));
    };
  }
}