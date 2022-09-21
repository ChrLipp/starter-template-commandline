package at.corba.startertemplate

import mu.KotlinLogging
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import picocli.CommandLine
import kotlin.system.exitProcess

@SpringBootApplication
class StarterTemplateApplication : CommandLineRunner {
    /** The logger */
    private val log = KotlinLogging.logger {}

    @Autowired
    private val commandLineParameter: StarterTemplateParameter? = null

    override fun run(vararg args: String?) {
        CommandLine(commandLineParameter).execute(*args)
    }
}

fun main(args: Array<String>) {
    val context = runApplication<StarterTemplateApplication>(*args)
    exitProcess(SpringApplication.exit(context))
}
