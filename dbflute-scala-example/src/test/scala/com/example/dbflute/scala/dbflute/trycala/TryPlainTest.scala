package com.example.dbflute.scala.dbflute.trycala

import org.seasar.dbflute.helper.HandyDate
import org.seasar.dbflute.unit.core.PlainTestCase

/**
 * @author jflute
 */
class TryPlainTest extends PlainTestCase {

  def test_asInstanceOf_null() {
    val str: HandyDate = null;
    log(str.asInstanceOf[String]);
  }
}