package com.example.dbflute.scala

import java.io.File
import java.io.IOException
import org.seasar.dbflute.util.DfReflectionUtil
import org.seasar.dbflute.util.DfResourceUtil;

/**
 * The bean for resolving a path to a database of H2 Database. <br />
 * This is NOT an important class as example. So you don't need to read this.
 * @author jflute
 */
class EmbeddedH2UrlFactoryBean {

  // ===================================================================================
  //                                                                           Attribute
  //                                                                           =========
  var urlSuffix: String = null;
  var referenceClassName: String = null;

  // ===================================================================================
  //                                                                                Main
  //                                                                                ====
  def getObject(): Object = {
    return getUrl();
  }

  def getObjectType(): Class[_] = {
    return classOf[String];
  }

  def isSingleton(): Boolean = {
    return true;
  }

  private def getUrl(): String = {
    try {
      val f = getBuildDir();
      val canonicalPath = f.getCanonicalPath();
      val url = "jdbc:h2:file:" + canonicalPath.replace('\\', '/') + urlSuffix;
      return url;
    } catch {
      case e: IOException => throw new RuntimeException(e);
    }
  }

  private def getBuildDir(): File = {
    val clazz = DfReflectionUtil.forName(referenceClassName);
    return DfResourceUtil.getBuildDir(clazz);
  }
}
