import kotlinx.coroutines.*

fun main(args: Array<String>) {
    runBlocking {
        launch {
            doWorld()
        }
        println("Hello, ")
    }

}

suspend fun doWorld() {
    delay(1000L)
    println("world!")

}
