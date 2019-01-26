package micronaut.hello

import io.micronaut.context.ApplicationContext
import io.micronaut.http.client.HttpClient
import io.micronaut.runtime.server.EmbeddedServer
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.junit.jupiter.api.Assertions.assertEquals

object HelloControllerSpec : Spek({
    describe("HelloController Suite") {
        var embeddedServer: EmbeddedServer = ApplicationContext.run(EmbeddedServer::class.java)
        var client: HttpClient = HttpClient.create(embeddedServer.url)

        it("test /hello responds hello") {
            var rsp: String = client.toBlocking().retrieve("/hello")
            assertEquals(rsp, "hello")
        }

        afterGroup {
            client.close()
            embeddedServer.close()
        }
    }
})
