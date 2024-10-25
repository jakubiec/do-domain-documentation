import Dependencies.*

ThisBuild / scalaVersion     := "3.5.2"
ThisBuild / version          := "0.0.1-SNAPSHOT"
ThisBuild / organization     := "com.github"
ThisBuild / organizationName := "jakubiec"

lazy val copyright = (project in file("copyright"))
  .settings(
    name := "copyright",
    libraryDependencies ++= Seq(
      scalaTest     % Test,
      scalaTestPlus % Test
    )
  )
