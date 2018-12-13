import kotlinx.coroutines.*

fun main(args: Array<String>) {
    runBlocking {
        val job = GlobalScope.launch {
            delay(1000L)
            println("World!")
        }

        println("hello")
        job.join()
        runBlocking {
            delay(2000L)
        }

    }

}