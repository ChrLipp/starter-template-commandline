# Kotlin Quick Start
An empty Kotlin project using Gradle.

## Steps to use the template
You can use this template as a starting point for your own project:

- Create repository on Github with this [link](https://github.com/ChrLipp/starter-template/generate).
  Follow the instructions there.
- Refactor class `StarterTemplateApplication` (name and namespace)
- Refactor class `StarterTemplateApplicationTests` (name and namespace)
- Set logfile name `logging.file.name` in `application.properties`
- Set log level for your namespace `logging.level.*` in `application.properties`
- Change `readme.md`
- Run the application with `./gradlew run`
- When using IntelliJ IDEA, edit "Run configuration" and 
  add environment variable `spring.output.ansi.enabled=ALWAYS`

## Gradle usage

- Building `./gradlew build`
- Running `./gradlew run`
- Testing `./gradlew test`
- Dependency updates `./gradlew dependencyUpdates`, change version numbers in `gradle.properties`
