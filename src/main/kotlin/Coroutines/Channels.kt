package com.dicoding.kotlin.Coroutines

import kotlinx.coroutines.*
import kotlinx.coroutines.channels.Channel

fun main() = runBlocking(CoroutineName("main")) {
    val channel = Channel<Int>()
    launch(CoroutineName("v1coroutine")){
        println("Sending from ${Thread.currentThread().name}")
        for (x in 1..10) channel.send(x * x)
    }

    repeat(10) { println(channel.receive()) }
    println("received in ${Thread.currentThread().name}")
}