package com.example.dbflute.scala.trycala

import org.seasar.dbflute.helper.HandyDate

object TryScala {

  def main(args: Array[String]) {
	  val date = new HandyDate("2014/05/01");
	  System.out.println("Hello World: " + date.toDisp("yyyy/MM/dd"));
  }
}