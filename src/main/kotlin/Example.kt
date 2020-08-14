import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.parameters.arguments.argument
import com.github.ajalt.clikt.parameters.arguments.convert

class Example : CliktCommand() {

    // this shows as an error in Intellij but the gradle build is successful
    private val template by argument().convert { it }

    override fun run() {
        TODO("Not yet implemented")
    }
}