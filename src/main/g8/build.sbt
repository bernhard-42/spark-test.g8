name := "$name$"

val sparkVersion = "$spark_version$"
val hadoopVersion = "$hadoop_version$"
scalaVersion := "$scala_version$"

version := "$version$"

libraryDependencies ++= Seq(
    "log4j" % "log4j" % "1.2.14",

    "org.apache.hadoop" % "hadoop-common" % hadoopVersion,
    "org.apache.hadoop" % "hadoop-mapreduce" % hadoopVersion % "provided",
    "org.apache.hadoop" % "hadoop-client" % hadoopVersion % "provided",

    "org.apache.spark" %% "spark-parent" % sparkVersion % "provided",
    "org.apache.spark" %% "spark-core"   % sparkVersion,
    "org.apache.spark" %% "spark-sql"    % sparkVersion,

    "org.scalatest"    %% "scalatest"  % "3.0.1" % "test"
)

scalacOptions ++= Seq(
  "-unchecked",
  "-deprecation",
  "-feature"
)
