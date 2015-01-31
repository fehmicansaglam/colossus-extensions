name := "colossus-extensions"

organization := "net.fehmicansaglam"

version := "0.1-SNAPSHOT"

scalaVersion := "2.11.5"

libraryDependencies ++= Seq(
  "com.tumblr" %% "colossus" % "0.6.0-M1",
  "org.scalatest" %% "scalatest" % "2.2.1" % "test"
)
