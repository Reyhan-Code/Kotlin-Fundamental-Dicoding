package com.dicoding.kotlin.KotlinFunctionalPrograming

fun main() {
    printResult1(10){ value ->
        value + value
    }
    printResult1(20){ value ->
        value + value
    }
}

//fun printResult1(value: Int, sum: (Int) -> Int) {
//    val result = sum(value)
//    println(result)
//}

inline fun printResult1(value: Int, sum: (Int) -> Int) {
    val result = sum(value)
    println(result)
}