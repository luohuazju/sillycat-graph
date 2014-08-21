import sbt._

object Dependencies {
  val neo4j_version = "2.1.3"

  val neo4j   = "org.neo4j"   % "neo4j"   % neo4j_version
  val log4j   = "log4j"       % "log4j"   % "1.2.17"

  val baseDeps = Seq (
    neo4j,
    log4j
  )
}
