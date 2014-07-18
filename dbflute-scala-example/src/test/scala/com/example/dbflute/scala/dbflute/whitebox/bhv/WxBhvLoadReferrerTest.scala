package com.example.dbflute.scala.dbflute.whitebox.bhv

import com.example.dbflute.scala.dbflute.allcommon.DBFluteModule
import com.example.dbflute.scala.dbflute.exbhv.MemberBhv
import com.google.inject.Module
import javax.sql.DataSource
import com.example.dbflute.scala.unit.UnitContainerFunSuite
import com.example.dbflute.scala.dbflute.allcommon.DBFlutist
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

/**
 * @author jflute
 * @since 1.0.5G (2014/05/17 Saturday)
 */
@RunWith(classOf[JUnitRunner])
class WxBhvLoadReferrerTest extends UnitContainerFunSuite {

  test("LoadReferrer_basic") {
    val loadedList = DBFlutist.memberBhv.selectList { cb =>
      cb.setupSelect_MemberStatus
      cb.setupSelect_MemberServiceAsOne.withServiceRank
    } { loader =>
      loader.loadPurchaseList(_.setupSelect_Product)
    }
    loadedList.foreach { member =>
      log(member.memberName)
      member.purchaseList.foreach { purchase =>
        log("  " + purchase.product.map(_.productName))
      }
    }
  }
}