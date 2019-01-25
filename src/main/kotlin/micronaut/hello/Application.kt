package micronaut.hello

import io.micronaut.runtime.Micronaut

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                .packages("micronaut.hello")
                .mainClass(Application.javaClass)
                .start()
    }
}