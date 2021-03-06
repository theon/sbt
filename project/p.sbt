libraryDependencies ++= Seq(
	"net.databinder" %% "dispatch-http" % "0.8.9",
	"org.jsoup" % "jsoup" % "1.7.1"
)

addSbtPlugin("com.typesafe.sbt" % "sbt-site" % "0.7.0-M1")

resolvers += "jgit-repo" at "http://download.eclipse.org/jgit/maven"

addSbtPlugin("com.typesafe.sbt" % "sbt-ghpages" % "0.5.0")