import com.typesafe.sbt.SbtNativePackager._
import NativePackagerKeys._
import com.typesafe.sbt.packager.archetypes.ServerLoader

name := """play-native-packaging"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  ws
)

maintainer in Linux := "Artem Pyanykh <artem.pyanyh@gmail.com>"

packageSummary in Linux := "Play app with support for native packaging."

packageDescription in Linux := "Minimal play-app ready for packaging and distribution."

serverLoading in Debian := ServerLoader.SystemV
