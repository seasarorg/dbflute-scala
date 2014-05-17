package com.example.dbflute.scala.trycala

import org.seasar.dbflute.helper.HandyDate
import org.seasar.dbflute.bhv.AbstractBehaviorWritable
import com.example.dbflute.scala.dbflute.allcommon.CDef

object TryScala {

  def main(args: Array[String]) {
    val date = new HandyDate("2014/05/01");
    System.out.println("Hello World: " + date.toDisp("yyyy/MM/dd"));
  }
}
