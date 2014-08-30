package com.example.dbflute.scala.dbflute.whitebox

import java.sql.Timestamp
import java.util.Date
import scala.collection.immutable.List
import org.joda.time.LocalDate
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import com.example.dbflute.scala.dbflute.allcommon.DBFlutist
import com.example.dbflute.scala.dbflute.exbhv.MemberBhv
import com.example.dbflute.scala.dbflute.exbhv.PurchaseBhv
import com.example.dbflute.scala.dbflute.exbhv.cursor.PurchaseSummaryMemberCursorHandler
import com.example.dbflute.scala.dbflute.exbhv.pmbean.OptionMemberPmb
import com.example.dbflute.scala.dbflute.exbhv.pmbean.PurchaseMaxPriceMemberPmb
import com.example.dbflute.scala.dbflute.exbhv.pmbean.PurchaseSummaryMemberPmb
import com.example.dbflute.scala.dbflute.exbhv.pmbean.SimpleMemberPmb
import com.example.dbflute.scala.dbflute.exbhv.pmbean.UnpaidSummaryMemberPmb
import com.example.dbflute.scala.dbflute.exentity.customize.DbleSimpleMember
import com.example.dbflute.scala.dbflute.exentity.customize.DbleSimpleMember
import com.example.dbflute.scala.dbflute.exentity.customize.SimpleMember
import com.example.dbflute.scala.unit.UnitContainerFunSuite
import com.github.nscala_time.time.Imports._
import java.util.Arrays

/**
 * @author jflute
 * @since 1.0.5J (2014/07/02 Wednesday)
 */
@RunWith(classOf[JUnitRunner])
class OnParadeTest extends UnitContainerFunSuite {

  protected var memberBhv: MemberBhv = null;
  protected var purchaseBhv: PurchaseBhv = null;

  test("on_parade") {
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
        val copied = mb.copy(birthdate = Option(currentLocalDate))
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
      mb.birthdate = Option(currentLocalDate());
    }

    //
    // <<< update() >>>
    //
    memberBhv.update { mb =>
      mb.memberId = 1
      mb.memberAccount = "foo"
      mb.birthdate = Option(currentLocalDate());
      mb.versionNo = 0
    }
    memberBhv.updateNonstrict { mb =>
      mb.memberId = 1
      mb.memberAccount = "foo"
      mb.birthdate = Option(currentLocalDate());
    }
    memberBhv.updateNonstrict(_.memberId = 7)(_.self(_.specify.columnBirthdate).convert(_.addDay(3)))
    purchaseBhv.updateNonstrict(_.purchaseId = 3)(_.self(_.specify.columnPurchaseCount).plus(1))

    //
    // <<< outsideSql() >>>
    //
    val outsideSimpleList = memberBhv.outsideSql.selectList(SimpleMemberPmb { pmb =>
      pmb.setMemberName_PrefixSearch("S")
    });
    outsideSimpleList.foreach(f => log(f.memberName, f.birthdate))

    val outsideSimpleEntity = memberBhv.outsideSql.selectEntity(SimpleMemberPmb { pmb =>
      pmb.setMemberId(3)
    });
    outsideSimpleEntity.foreach(f => log(f.memberName, f.birthdate))

    val outsidePage = memberBhv.outsideSql.selectPage(PurchaseMaxPriceMemberPmb { pmb =>
      pmb.paging(3, 2)
      pmb.setMemberNameList_PrefixSearch(Arrays.asList("S", "M"))
    });
    outsidePage.selectedList.foreach(f => log(f.memberName, f.purchaseMaxPrice))

    val outsidePageByCursorSkip = memberBhv.outsideSql.pagingByCursorSkip.selectPage(UnpaidSummaryMemberPmb { pmb =>
      pmb.paging(3, 2)
      pmb.setUnpaidMemberOnly(true)
      pmb.setUnpaidSmallPaymentAmount(BigDecimal(123.56))
    });
    outsidePageByCursorSkip.selectedList.foreach(f => log(f.unpaidManName, f.statusName))
    
    memberBhv.outsideSql.selectCursor { PurchaseSummaryMemberPmb { pmb =>
      pmb.setMemberStatusCode_Formalized
    }} { PurchaseSummaryMemberCursorHandler { cursor =>
      while (cursor.next) {
    	log(cursor.memberName, cursor.birthdate)
      }
    }}

    val outsideOptionList = memberBhv.outsideSql.selectList(OptionMemberPmb { pmb =>
      pmb.setMemberName_PrefixSearch("S")
      pmb.setFromFormalizedOptionDate_FromDate(currentLocalDateTime)(_.compareAsDate())
      pmb.setMemberStatusCode_Formalized
      pmb.setToFormalizedDate_ToDate(currentLocalDate)
    });
    outsideOptionList.foreach(f => log(f.memberName, f.birthdate))
    
    //
    // <<< CB: on parade >>>
    //
    val keyOfFooDate = "$fooDate"
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
        purchaseCB.query.setPurchasePrice_LessEqual(1)
        purchaseCB.query.setPaymentCompleteFlg_Equal_True
        purchaseCB.columnQuery(_.specify.columnPurchasePrice)
          .lessThan(_.specify.derivedPurchasePaymentList.sum(_.specify.columnPaymentAmount)());
        purchaseCB.query.notExistsPurchasePaymentList { paymentCB =>
          paymentCB.query.setPaymentAmount_LessThan(0.3);
        }
      }

      cb.query.addOrderBy_Birthdate_Desc.withNullsLast
      cb.query.addOrderBy_MemberId_Asc.withManualOrder(_.plus(1))
    }
    onparadeList.foreach { member =>
      val fooDate = member.derived[LocalDateTime](keyOfFooDate);
      val price = member.highestPurchasePrice
      log(member.memberName, member.memberStatus.get.memberStatusName, fooDate, price.toString)
      assert(member.memberName.startsWith("S"));
    };

    //
    // <<< small try >>>
    //
    log(BigDecimal(0.3).underlying)
    log(BigDecimal(new java.math.BigDecimal("0.3")))
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