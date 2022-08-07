package coroutines

import kotlinx.coroutines.*

/*
Dispatcher.Default:
dispatcher dasar yang digunakan oleh semua standard builders seperti launch, async, dll
jika tidak ada dispatcher lain yang ditentukan.
 */

fun dispatcherDefault() = runBlocking {
    launch {

    }
}

/*
Dispatcher.IO:
Sebuah dispatcher yang dapat digunakan untuk membongkar pemblokiran operasi I/O
 */

fun dispatcherIO() = runBlocking {
    launch(Dispatchers.IO) {

    }
}

/*
Dispatcher.Unconfined:
Dispatcher ini akan menjalankan coroutines pada thread yang sedang berjalan sampai mencapai titik penangguhan
 */

fun dispatcherUnconfined() = runBlocking<Unit> {
    launch(Dispatchers.Unconfined) {
        println("Starting in ${Thread.currentThread().name}")
        delay(1000)
        println("Resuming in ${Thread.currentThread().name}")
    }.start()
}

/*
Single Thread Context:
Dispatcher ini menjamin bahwa setiap saat coroutine akan dijalankan pada thread yang Anda tentukan.
 */

fun dispatcherSingleThreadContext() = runBlocking<Unit> {
    val dispatcher = newSingleThreadContext("myThread")
    launch(dispatcher) {
        println("Starting in ${Thread.currentThread().name}")
        delay(1000)
        println("Resuming in ${Thread.currentThread().name}")
    }.start()
}

/*
Thread Pool:
Sebuah dispatcher yang memiliki kumpulan thread.
Ia akan memulai dan melanjutkan coroutine di salah satu thread yang tersedia pada kumpulan tersebut.
Runtime akan menentukan thread mana yang tersedia dan juga menentukan bagaimana proses distribusi bebannya.
 */

fun threadPool() = runBlocking<Unit> {
    val dispatcher = newFixedThreadPoolContext(3, "myPool")

    launch(dispatcher) {
        println("Starting in ${Thread.currentThread().name}")
        delay(1000)
        println("Resuming in ${Thread.currentThread().name}")
    }.start()
}




