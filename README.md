# Colossus Extensions

[![Build Status](https://travis-ci.org/fehmicansaglam/colossus-extensions.svg?branch=master)](https://travis-ci.org/fehmicansaglam/colossus-extensions)

Check out the examples subproject for sample use cases.

## Provided Extensions

### Protocols

* MongoDB

## Using Colossus Extensions in your project

The general format is that release a.b.c.d is compatible with Colossus a.b.c.
Current version matrix is below:

| colossus-extensions              | colossus                     |
|----------------------------------|------------------------------|
| 0.6.0.0-SNAPSHOT                 | 0.6.0-M1                     |

Note: Only available for scala 2.11.

If you use SBT, you just have to edit build.sbt and add the following:

```scala
resolvers += "Sonatype Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"

libraryDependencies ++= Seq(
  "net.fehmicansaglam" %% "colossus-extensions" % "0.6.0.0-SNAPSHOT"
)
```

## Contributions
Contributions are always welcome. Good ways to contribute include:

* Raising bugs and feature requests
* Fixing bugs
* Improving the performance
* Adding to the documentation
