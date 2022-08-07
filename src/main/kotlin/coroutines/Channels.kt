package coroutines

import kotlinx.coroutines.*
import kotlinx.coroutines.channels.Channel

/*
Channels: nilai deferred yang menyediakan cara mudah untuk mentransfer nilai tunggal antara coroutine
 */

fun main() = runBlocking(CoroutineName("main")) {
    val channel = Channel<Int>()
    launch(CoroutineName("v1coroutine")){
        println("Sending from ${Thread.currentThread().name}")
        for (x in 1..5) channel.send(x * x)
    }

    repeat(5) { println(channel.receive()) }
    println("received in ${Thread.currentThread().name}")
}