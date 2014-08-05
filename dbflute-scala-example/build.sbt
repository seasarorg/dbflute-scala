name := "dbflute-scala-example"

version := "1.0.0-SNAPSHOT"

resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"

resolvers += "The Seasar Foundation Maven2 Repository" at "http://maven.seasar.org/maven2"

// /= = = = = = = = = = = = = = = = = = = = = = = = = =
// atomikos is unmanaged, located in 'lib' directory
// because cannot execute by latest version
// but old version doesn't exist in maven repository
// = = = = = = = = = =/
libraryDependencies ++= Seq(
  "org.seasar.dbflute" % "dbflute-runtime" % "1.0.5K-RC1",
  "com.h2database" % "h2" % "1.4.178" % "runtime",
  "com.google.inject" % "guice" % "3.0",
  "org.apache.geronimo.specs" % "geronimo-jta_1.1_spec" % "1.0" % "runtime",
  "log4j" % "log4j" % "1.2.14" % "runtime",
  "org.seasar.dbflute" % "utflute-guice" % "0.4.6" % "test",
  "junit" % "junit" % "4.8.2" % "test",
  "org.scalatest" %% "scalatest" % "2.2.0" % "test"
)

EclipseKeys.createSrc := EclipseCreateSrc.Default + EclipseCreateSrc.Resource

EclipseKeys.withSource := true
