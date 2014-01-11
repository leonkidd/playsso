name := "playsso"

version := "0.1.0"

libraryDependencies ++= Seq(
  javaJdbc,
  javaJpa,
  cache
)     

play.Project.playJavaSettings
