import kotlinx.coroutines.*

fun main(args: Array<String>) = runBlocking{

    GlobalScope.launch {
        repeat(1000) {
            println("I an sleeping $it")
            delay(500L)

        }
    }
    delay(1300L)

}
