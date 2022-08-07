package coroutines

import kotlinx.coroutines.*

//menggunakan launch():
fun usingLaunch() = runBlocking {
    val job = launch {

    }
}

//menggunakan Job():
fun usingJob() = runBlocking {
    val job = Job()
}


//sebuah job tanpa langsung menjalankannya
fun usingJobWithoutStart() = runBlocking {
    val job = launch(start = CoroutineStart.LAZY) {

    }
}

//Menjalankan job dengan start
//start() akan memulai job tanpa harus menunggu job tersebut selesai
fun startJobWithStart() = runBlocking {
    val job = launch(start = CoroutineStart.LAZY) {
        delay(1000L)
        println("Start new job!")
    }

    job.start()
    println("Other task")
}

//Menjalankan job dengan join()
//join() akan menunda eksekusi sampai job selesai.
fun startJobWithJoin() = runBlocking {
    val job = launch(start = CoroutineStart.LAZY) {
        delay(1000L)
        println("Start new job!")
    }

    job.join()
    println("Other task")
}

//cancel job
fun cancelJob() = runBlocking {
    val job = launch {
        delay(5000)
        println("Start new job!")
    }

    delay(2000)
    job.cancel()
    println("Cancelling job...")
    if (job.isCancelled){
        println("Job is cancelled")
    }
}

//cancel job with reason
@InternalCoroutinesApi
fun cancelJobWithReason() = runBlocking {
    val job = launch {
        delay(5000)
        println("Start new job!")
    }

    delay(2000)
    job.cancel(cause = CancellationException("time is Up!"))
    println("Cancelling job...")
    if (job.isCancelled){
        println("Job is cancelled because ${job.getCancellationException().message}")
    }
}

