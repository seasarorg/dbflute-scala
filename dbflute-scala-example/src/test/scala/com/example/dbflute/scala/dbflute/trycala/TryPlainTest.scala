package com.example.dbflute.scala.dbflute.trycala

import org.seasar.dbflute.helper.HandyDate
import org.seasar.dbflute.unit.core.PlainTestCase
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import com.example.dbflute.scala.utflute.PlainFunSuite

/**
 * @author jflute
 */
@RunWith(classOf[JUnitRunner])
class TryPlainTest extends PlainFunSuite {

  test("asInstanceOf_null") {
    val str: HandyDate = null;
    log(str.asInstanceOf[String]);

    val a = new Array[Integer](0);
  }
}