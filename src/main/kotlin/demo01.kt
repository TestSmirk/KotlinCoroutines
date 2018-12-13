import kotlinx.coroutines.*

fun main(args: Array<String>) = runBlocking {
    val startTime = System.currentTimeMillis()
    val job = launch(Dispatchers.Default) {
        var nextPrintTime = startTime
        var i = 0
        while (i < 5) {
            //print a message twice a second
            if (System.currentTimeMillis() >= nextPrintTime) {
                println("I`m sleeping $${i++}")
                nextPrintTime += 500L
            }
        }
    }
    delay(1300L)
    println("main: I`m tired of waiting~")
    job.cancelAndJoin()
    println("main:Now I can quit")

}
