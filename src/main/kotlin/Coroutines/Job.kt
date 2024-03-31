package com.dicoding.kotlin.Coroutines

import kotlinx.coroutines.*

fun main() = runBlocking {
    val job = launch(start = CoroutineStart.LAZY) {
        delay(1000L)
        println("Start new job!")
    }

//    job.start()
    job.join()
    println("Other task")
}