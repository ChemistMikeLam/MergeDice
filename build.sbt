ThisBuild / scalaVersion := "3.1.2" 

lazy val root = (project in file(".")) 
  .settings( 
    name := "MergeDice", 
    libraryDependencies ++= Seq( 
      "org.typelevel" %% "cats-core" % "2.7.0", 
      "org.typelevel" %% "cats-effect" % "3.3.11", 
    ) 
  ) 

