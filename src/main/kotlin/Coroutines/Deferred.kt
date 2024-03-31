package com.dicoding.kotlin.Coroutines

import kotlinx.coroutines.*

fun main() = runBlocking {
    val capital = async { getCapital1() }
    val income = async { getIncome1() }
    println("Your profit is ${income.await() - capital.await()}")
}


suspend fun getCapital1(): Int {
    delay(1000L)
    return 50000
}

suspend fun getIncome1(): Int {
    delay(1000L)
    return 75000
}