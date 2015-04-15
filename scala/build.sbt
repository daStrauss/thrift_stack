organization := "com.oheasytiger"

scalaVersion := "2.11.6"

resolvers ++= Seq(
	"twttr" at "http://maven.twttr.com/")

com.twitter.scrooge.ScroogeSBT.newSettings

libraryDependencies ++= Seq(
	"org.apache.thrift" % "libthrift" % "0.9.2",
	"com.twitter" %% "finagle-http" % "6.24.0",
	"com.twitter" %% "scrooge-core" % "3.17.0",
	"com.twitter" %% "finagle-thrift" % "6.24.0"
)