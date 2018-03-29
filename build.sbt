val Http4sVersion = "0.18.4"
val Specs2Version = "4.0.3"
val LogbackVersion = "1.2.3"

lazy val root = (project in file("."))
  .enablePlugins(SbtTwirl)
  .settings(
    organization := "com.example",
    name := "http4s-twirl-example",
    version := "0.0.1-SNAPSHOT",
    scalaVersion := "2.12.5",
    libraryDependencies ++= Seq(
      "org.http4s"      %% "http4s-blaze-server" % Http4sVersion,
      "org.http4s"      %% "http4s-circe"        % Http4sVersion,
      "org.http4s"      %% "http4s-dsl"          % Http4sVersion,
      "org.http4s"      %% "http4s-twirl"        % Http4sVersion,
      "org.specs2"     %% "specs2-core"          % Specs2Version % "test",
      "ch.qos.logback"  %  "logback-classic"     % LogbackVersion
    )
  )
