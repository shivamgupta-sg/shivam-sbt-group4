name := "sbt-group4"
version := "1.0"
scalaVersion := "2.12.12"

lazy val common = project.in(file("common"))
    .settings(
        libraryDependencies ++= Seq (
            "org.scalactic" %% "scalactic" % "3.3.0-SNAP3",
            "org.scalaz" %% "scalaz-core" % "7.3.2",
            "org.scalatest" %% "scalatest" % "3.3.0-SNAP3" % Test,
            "org.mockito" %% "mockito-scala" % "1.16.13" % Test
        )
    )