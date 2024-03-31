package com.dicoding.kotlin.KotlinFunctionalPrograming

fun main() {
    printResult(10 ,sum)

    printMessage("Reyhan") { name: String ->
        "Hello $name"
    }
}

fun printResult(value: Int, sum: (Int) -> Int) {
    val result = sum(value)
    println(result)
}

var sum: (Int) -> Int = { value -> value * value }

/*
   output : 20
*/

fun printMessage(name: String, message: (String) -> String) {
    print(message(name))
}