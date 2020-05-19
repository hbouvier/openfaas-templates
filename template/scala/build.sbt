name := "sbt-faas-sacala-project"
organization in ThisBuild := "com.ruggedcode"
scalaVersion in ThisBuild := "2.13.1"

// PROJECTS
///////////////////////////////////////////////////////////////////////////////

lazy val global = project
  .in(file("."))
  .settings(settings)
  .aggregate(
    function
  )

lazy val function = project
  .settings(
    name := "function",
    description := "A REST API",
    settings,
    // mainClass in Compile := Some("com.ruggedcode.graphqlGraphqlApplication"),
    libraryDependencies ++= commonDependencies ++ Seq(
      dependencies.springbootstarterweb,
      dependencies.springbootconfigprocessor,
      dependencies.springbootgraphqlstarter,
      dependencies.springbootgraphiqlstarter,
    )
  )
  .dependsOn(
  )

// DEPENDENCIES
///////////////////////////////////////////////////////////////////////////////
lazy val dependencies =
  new {
    val springbootstarterwebV      = "2.2.1.RELEASE"
    val springbootconfigprocessorV = "2.2.1.RELEASE"
    val springbootgraphqlstarterV  = "6.0.1"
    val springbootgraphiqlstarterV = "6.0.1"

    val springbootstarterweb      = "org.springframework.boot" % "spring-boot-starter-web"             % springbootstarterwebV
    val springbootconfigprocessor = "org.springframework.boot" % "spring-boot-configuration-processor" % springbootconfigprocessorV
    val springbootgraphqlstarter  = "com.graphql-java-kickstart" % "graphql-spring-boot-starter"  % springbootgraphqlstarterV
    val springbootgraphiqlstarter = "com.graphql-java-kickstart" % "graphiql-spring-boot-starter" % springbootgraphiqlstarterV
  }

lazy val commonDependencies = Seq(
  // dependencies.scalatest  % "test",
  // dependencies.scalacheck % "test"
)

// SETTINGS
///////////////////////////////////////////////////////////////////////////////

lazy val settings =
commonSettings
// ++ wartremoverSettings
// ++ scalafmtSettings

lazy val compilerOptions = Seq(
  "-unchecked",
  "-feature",
  "-language:existentials",
  "-language:higherKinds",
  "-language:implicitConversions",
  "-language:postfixOps",
  "-deprecation",
  "-encoding",
  "utf8"
)

lazy val commonSettings = Seq(
  scalacOptions ++= compilerOptions
)

// lazy val wartremoverSettings = Seq(
//   wartremoverWarnings in (Compile, compile) ++= Warts.allBut(Wart.Throw, Wart.Null, Wart.PublicInference, Wart.Var)
// )

// lazy val scalafmtSettings =
//   Seq(
//     scalafmtOnCompile := true,
//     scalafmtTestOnCompile := true,
//     scalafmtVersion := "1.2.0"
//   )
