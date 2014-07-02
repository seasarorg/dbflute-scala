package com.example.dbflute.scala.dbflute.whitebox

import java.util.Date
import com.example.dbflute.scala.dbflute.allcommon.DBFluteModule
import com.example.dbflute.scala.dbflute.allcommon.DBFlutist
import com.example.dbflute.scala.dbflute.exbhv.MemberBhv
import com.example.dbflute.scala.dbflute.exbhv.PurchaseBhv
import com.example.dbflute.scala.dbflute.exbhv.pmbean.SimpleMemberPmb
import com.google.inject.Module
import javax.sql.DataSource
import org.seasar.dbflute.util.DfTypeUtil
import java.sql.Timestamp
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

/**
 * @author jflute
 * @since 1.0.5J (2014/07/02 Wednesday)
 */
@RunWith(classOf[JUnitRunner])
class ScalaTest extends UnitContainerFunSuite {

  protected var memberBhv: MemberBhv = null;
  protected var purchaseBhv: PurchaseBhv = null;

  test("on parade") {
    //
    // <<< selectEntity() >>>
    //
    val member = DBFlutist.memberBhv.selectEntity { cb =>
      cb.setupSelect_MemberStatus
      cb.query.setMemberId_Equal(1)
    }
    member.foreach { mb =>
      log(mb.memberName, mb.memberStatusCodeAsMemberStatus.alias)
      if (mb.isMemberStatusCode_Formalized) {
        val copied = mb.copy(birthdate = Option(currentDate))
        log("*Formalized : immutable=" + mb.birthdate + ", copied=" + copied.birthdate)
      }
    }

    //
    // <<< selectList() >>>
    //
    val memberList = memberBhv.selectList { cb =>
      cb.setupSelect_MemberStatus
      cb.setupSelect_MemberServiceAsOne.withServiceRank
      cb.query.setMemberName_PrefixSearch("S")
      cb.query.setMemberStatusCode_Equal_Formalized
      cb.query.existsPurchaseList { subCB =>
        subCB.query.setPurchasePrice_GreaterEqual(200)
        subCB.query.setPaymentCompleteFlg_Equal_True
      }
      cb.query.addOrderBy_Birthdate_Desc.withNullsLast
      cb.query.addOrderBy_MemberId_Asc.withManualOrder(_.plus(1))
    }
    memberList.foreach { member =>
      log(member.memberName, member.memberStatus.get.memberStatusName)
      assert(member.memberName.startsWith("S"));
    }

    //
    // <<< selectPage() >>>
    //
    val memberView = DBFlutist.memberBhv.selectPage { cb =>
      cb.paging(3, 2)
      cb.query.addOrderBy_Birthdate_Desc
    }
    log(memberView.allRecordCount + ", " + memberView.allPageCount + ", " + memberView.selectedList)

    //
    // <<< selectCursor() >>>
    //
    DBFlutist.memberBhv.selectCursor { cb =>
      cb.query.addOrderBy_Birthdate_Desc
    } { e =>
      log(e.memberAccount, e.birthdate)
    }

    //
    // <<< scalarSelect() >>>
    //
    val maxBirthdate = DBFlutist.memberBhv.scalarSelect(classOf[Date]).max { cb =>
      cb.specify.columnBirthdate
      cb.query.existsPurchaseList { subCB =>
        subCB.query.setPaymentCompleteFlg_Equal_True
      }
    }
    maxBirthdate.foreach(log(_))

    //
    // <<< LoadReferrer >>>
    //
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

    //
    // <<< insert() >>>
    //
    memberBhv.insert { mb =>
      mb.memberName = "Xavi";
      mb.memberAccount = "Passer"
      mb.memberStatusCode_Provisional
      mb.birthdate = Option(currentDate());
    }

    //
    // <<< update() >>>
    //
    memberBhv.update { mb =>
      mb.memberId = 1
      mb.memberAccount = "foo"
      mb.birthdate = Option(currentDate());
      mb.versionNo = 0
    }
    memberBhv.updateNonstrict { mb =>
      mb.memberId = 1
      mb.memberAccount = "foo"
      mb.birthdate = Option(currentDate());
    }
    memberBhv.updateNonstrict(_.memberId = 7)(_.self(_.specify.columnBirthdate).convert(_.addDay(3)))
    purchaseBhv.updateNonstrict(_.purchaseId = 3)(_.self(_.specify.columnPurchaseCount).plus(1))

    //
    // <<< outsideSql() >>>
    //
    val pmb = new SimpleMemberPmb
    pmb.setMemberName_PrefixSearch("S")
    val outsideList = memberBhv.outsideSql.selectList(pmb);
    outsideList.foreach(f => log(f.memberName, f.birthdate))

    //
    // <<< CB: on parade >>>
    //
    val keyOfFooDate = "fooDate"
    val onparadeList = DBFlutist.memberBhv.selectList { cb =>
      cb.setupSelect_MemberStatus
      cb.setupSelect_MemberServiceAsOne.withServiceRank
      cb.specify.derivedPurchaseList.max { cb =>
        cb.specify.columnPurchaseDatetime
      }(keyOfFooDate)
      cb.specify.derivedPurchaseList.max { cb =>
        cb.specify.columnPurchasePrice
      }("highestPurchasePrice")
      cb.orScopeQuery { orCB =>
        orCB.query.setMemberName_PrefixSearch("S")
        orCB.query.setMemberName_LikeSearch("vi")(_.likeContain)
        orCB.query.setMemberStatusCode_Equal_Formalized
      }
      cb.query.existsPurchaseList { purchaseCB =>
        purchaseCB.query.setPurchasePrice_GreaterEqual(200)
        purchaseCB.query.setPaymentCompleteFlg_Equal_True
      }
      cb.columnQuery(_.specify.columnFormalizedDatetime)
        .greaterThan(_.specify.columnBirthdate).convert(_.addYear(20));

      cb.query.derivedPurchaseList.max { purchaseCB =>
        purchaseCB.specify.columnPurchaseDatetime
        purchaseCB.query.setPaymentCompleteFlg_Equal_False
      }(_.addDay(3)).fromTo(toTimestamp("2000/01/01"), toTimestamp("2014/01/01"))(_.compareAsDate())

      cb.query.notExistsPurchaseList { purchaseCB =>
        purchaseCB.query.setPurchasePrice_GreaterEqual(200)
        purchaseCB.query.setPaymentCompleteFlg_Equal_True
        purchaseCB.columnQuery(_.specify.columnPurchasePrice)
          .lessThan(_.specify.derivedPurchasePaymentList.sum(_.specify.columnPaymentAmount)());
      }

      cb.query.addOrderBy_Birthdate_Desc.withNullsLast
      cb.query.addOrderBy_MemberId_Asc.withManualOrder(_.plus(1))
    }
    onparadeList.foreach { member =>
      val fooDate = member.derived[Date](keyOfFooDate);
      val price = member.highestPurchasePrice
      log(member.memberName, member.memberStatus.get.memberStatusName, fooDate, price.toString)
      assert(member.memberName.startsWith("S"));
    };

    //
    // <<< small try >>>
    //
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