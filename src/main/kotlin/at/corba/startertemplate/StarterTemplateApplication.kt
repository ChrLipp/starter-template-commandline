package at.corba.startertemplate

import mu.KotlinLogging
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class StarterTemplateApplication : CommandLineRunner {
    /** The logger */
    private val log = KotlinLogging.logger {}

    override fun run(vararg args: String?) {
        log.info("Hello world")
    }
}

fun main(args: Array<String>) {
    runApplication<StarterTemplateApplication>(*args)
}
