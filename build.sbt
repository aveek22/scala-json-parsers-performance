name := """json-perf"""

version := "1.0"

scalaVersion := "2.13.16"

val json4sVersion = "4.1.0-M8"
val circeVersion = "0.14.0"

resolvers ++=
  Resolver.bintrayRepo("commercetools", "maven") ::
  Resolver.bintrayRepo("rallyhealth", "maven")   ::
  Nil

libraryDependencies ++=
  "io.circe"                              %% "circe-generic"         % circeVersion  ::
  "io.circe"                              %% "circe-parser"          % circeVersion  ::
  "com.fasterxml.jackson.module"          %% "jackson-module-scala"  % "2.18.2"      ::
  "org.json4s"                            %% "json4s-native"         % json4sVersion ::
  "org.json4s"                            %% "json4s-jackson"        % json4sVersion ::
  "com.commercetools"                     %% "sphere-json"           % "0.15.4"      ::
  "com.typesafe.play"                     %% "play-json"             % "2.9.4"       ::
  "io.spray"                              %% "spray-json"            % "1.3.6"       ::
  "io.argonaut"                           %% "argonaut"              % "6.3.10"       ::
  "com.github.plokhotnyuk.jsoniter-scala" %% "jsoniter-scala-macros" % "2.33.0"       ::
  "com.lihaoyi"                           %% "upickle"               % "4.1.0"      ::
  "com.phylage"                           %% "refuel-json"           % "2.1.0"       ::
  "io.bullet"                             %% "borer-derivation"      % "1.7.2"       ::
  "com.rallyhealth"                       %% "weepickle-v1"          % "1.9.1"       ::
  Nil

libraryDependencies ++=
  "org.scalatest"                         %% "scalatest"             % "3.2.19"       ::
  Nil map (_ % Test)

parallelExecution in Test := false

enablePlugins(JmhPlugin)
