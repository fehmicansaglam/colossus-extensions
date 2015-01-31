name := "root"

lazy val commonSettings = Seq(
  organization := "net.fehmicansaglam",
  version := "0.6.0.0-SNAPSHOT",
  scalaVersion := "2.11.5",
  scalacOptions := Seq(
    "-deprecation",
    "-encoding", "UTF-8", // yes, this is 2 args
    "-feature",
    "-language:existentials",
    "-language:higherKinds",
    "-language:implicitConversions",
    "-unchecked",
    "-Xfatal-warnings",
    "-Xlint",
    "-Yno-adapted-args",
    "-Ywarn-dead-code", // N.B. doesn't work well with the ??? hole
    "-Ywarn-numeric-widen",
    "-Ywarn-value-discard",
    "-Xfuture",
    "-Ywarn-unused-import" // 2.11 only
  )
)

lazy val root = project.in(file("."))
  .aggregate(extensions, examples)
  .settings(commonSettings: _*)
  .settings(publishArtifact := false)

lazy val extensions = project.in(file("extensions"))
  .settings(commonSettings: _*)

lazy val examples = project.in(file("examples"))
  .dependsOn(extensions)
  .settings(commonSettings: _*)
  .settings(publishArtifact := false)
