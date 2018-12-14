import kotlinx.coroutines.*

fun main(args: Array<String>) = runBlocking {
    val job = launch {
        try {
            repeat(1000)
            {
                println("I am sleeping $it")
                delay(500L)

            }

        } finally {
            println("finally")
        }
    }
    delay(1300L)
    println("mai'nL I am tired of waiting!")
    job.cancelAndJoin()
    println("main now I am quit")


}
