name := "kafkaAkkaPingPong"

version := "0.1"

scalaVersion := "2.12.4"
resolvers += Resolver.bintrayRepo("cakesolutions", "maven")

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.5.6",
  "com.typesafe.akka" %% "akka-testkit" % "2.5.6" % Test,
  "scalatest_2.12" % "3.2.0-SNAP9" % "test",
  "net.cakesolutions" %% "scala-kafka-client" % "0.11.0.0",
  "net.cakesolutions" %% "scala-kafka-client-akka" % "0.11.0.0",
  "net.cakesolutions" %% "scala-kafka-client-testkit" % "0.11.0.0" % "test",
  "org.slf4j" % "log4j-over-slf4j" % "1.7.25" % "test",
  "com.typesafe.play" % "play-json_2.12" % "2.6.7"
)