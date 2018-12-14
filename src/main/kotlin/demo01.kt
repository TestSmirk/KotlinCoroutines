import kotlinx.coroutines.*

fun main(args: Array<String>) = runBlocking {
    val result = withTimeoutOrNull(1300L) {
        repeat(1000) {
            println("I am sleeping $it")
            delay(500L)
        }
        "Done"
    }
    println("Result is $result")
}
