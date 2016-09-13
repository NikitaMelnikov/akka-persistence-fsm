name := "akka-persistence-fsm"

version := "1.0"

scalaVersion := "2.11.8"

mainClass := Some("com.example.Main")

val `akka-version` = "2.4.10"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % `akka-version`,
  "com.typesafe.akka" %% "akka-persistence" % `akka-version`,
  "com.typesafe.akka" %% "akka-persistence-query-experimental" % `akka-version`,
  "com.typesafe.akka" %% "akka-stream" % `akka-version`,
  "com.typesafe.akka" %% "akka-persistence-query-experimental" % `akka-version`,
  "com.typesafe.akka" %% "akka-http-experimental" % `akka-version`,
  "com.typesafe.akka" %% "akka-slf4j" % `akka-version` % Test,
  "com.typesafe.akka" %% "akka-persistence-tck" % `akka-version` % Test,
  "com.typesafe.akka" %% "akka-stream-testkit" % `akka-version` % Test,
  "com.typesafe.akka" %% "akka-testkit" % `akka-version` % Test,
  "org.scalatest" %% "scalatest" % "3.0.0" % Test
)

libraryDependencies ++= Seq(
  "org.iq80.leveldb" % "leveldb" % "0.7",
  "org.fusesource.leveldbjni" % "leveldbjni-all" % "1.8"
)

resolvers += Resolver.jcenterRepo // Adds Bintray to resolvers for akka-persistence-redis and rediscala
libraryDependencies ++= Seq("com.hootsuite" %% "akka-persistence-redis" % "0.4.0")