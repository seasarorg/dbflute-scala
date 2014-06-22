package com.example.dbflute.scala.dbflute.exentity;

import com.example.dbflute.scala.dbflute.bsentity.BsMember;
import com.example.dbflute.scala.dbflute.bsentity.BsMbleMember;

/**
 * The immutable entity of MEMBER.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
class Member(dble: DbleMember) extends BsMember(dble) {
  
  def highestPurchasePrice: Int = { dble.highestPurchasePrice }
}

/**
 * The mutable entity of MEMBER.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
class MbleMember extends BsMbleMember {
}