# Kotlin Quick Start
A template for a command line application with the following features

- written in [Kotlin](https://kotlinlang.org/)
- powered by [Spring Boot](https://spring.io/projects/spring-boot)
- build with [Gradle](https://gradle.org/)
- Command line handling with [Picocli](https://picocli.info/), the annotations are processed at compile time

## Steps to use the template
You can use this template as a starting point for your own project:

- Create repository on Github with this [link](https://github.com/ChrLipp/starter-template/generate).
  Pull the repository.
- Choose `rootProject.name` in `settings.gradle`
- Choose group in `gradle.properties`
- Refactor class `StarterTemplateApplication` (name and namespace)
- Refactor class `StarterTemplateConfiguration` (name and namespace)
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
