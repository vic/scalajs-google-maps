lazy val root = project
  .in(file("."))
  .enablePlugins(ScalaJSPlugin)

lazy val demo = (project in file("demo"))
  .settings(demoSettings: _*)
  .enablePlugins(ScalaJSPlugin)
  .dependsOn(root)

val scalaV = "2.12.10"
val scalajsDomV = "1.0.0"

lazy val demoSettings = Seq(
  name := s"gmap-demo",
  scalaVersion := scalaV,
  libraryDependencies ++= Seq("org.scala-js" %%% "scalajs-dom" % scalajsDomV)
)

name := "Type-safe and Scala-friendly library over Google Maps"

normalizedName := "scalajs-google-maps"

version := "0.0.4"

organization := "io.surfkit"

scalaVersion := scalaV

crossScalaVersions := Seq("2.10.4", "2.11.5", scalaV)

libraryDependencies ++= Seq("org.scala-js" %%% "scalajs-dom" % scalajsDomV)

homepage := Some(url("http://www.surfkit.io/"))

licenses += ("MIT License", url(
  "http://www.opensource.org/licenses/mit-license.php"
))

scmInfo := Some(
  ScmInfo(
    url("https://github.com/coreyauger/scalajs-google-maps"),
    "scm:git:git@github.com/coreyauger/scalajs-google-maps.git",
    Some("scm:git:git@github.com:coreyauger/scalajs-google-maps.git")
  )
)

pomExtra := (
  <developers>
    <developer>
      <id>coreyauger</id>
      <name>Corey Auger</name>
      <url>https://github.com/coreyauger/</url>
    </developer>
  </developers>
)

pomIncludeRepository := { _ =>
  false
}
