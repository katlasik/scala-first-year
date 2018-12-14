val circeVersion = "0.10.0"

resolvers += Resolver.sonatypeRepo("releases")
addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.0" cross CrossVersion.full)

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.12.7",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "scraper",
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.0.5",
      "com.typesafe" % "config" % "1.3.2",
      "org.jsoup" % "jsoup" % "1.11.3",
      "ch.qos.logback" % "logback-classic" % "1.2.3",
      "com.typesafe.scala-logging" %% "scala-logging" % "3.9.0",
      "javax.mail" % "mail" % "1.4.7",
      "io.circe" %% "circe-core" % circeVersion,
      "io.circe" %% "circe-generic"  % circeVersion,
      "io.circe" %% "circe-parser" % circeVersion,
      "com.fasterxml.jackson.core" % "jackson-databind" % "2.9.7",
      "com.typesafe.slick" %% "slick" % "3.2.3",
      "org.slf4j" % "slf4j-nop" % "1.6.4",
      "com.typesafe.slick" %% "slick-hikaricp" % "3.2.3",
      "org.scala-lang.modules" %% "scala-async" % "0.9.7",
      "org.projectlombok" % "lombok" % "1.18.4" % "provided",
      "com.softwaremill.macwire" %% "macros" % "2.3.1" % "provided",
      "com.softwaremill.macwire" %% "util" % "2.3.1",
      "com.softwaremill.macwire" %% "proxy" % "2.3.1",
    )
  )
