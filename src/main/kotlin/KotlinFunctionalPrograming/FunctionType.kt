package com.dicoding.kotlin.KotlinFunctionalPrograming

typealias Arithmetic = (Int, Int) -> Int

fun main() {
    val sum: Arithmetic = { valueA, valueB -> valueA + valueB }

    val multiply: Arithmetic = { valueA, valueB -> valueA * valueB }

//Kita juga bisa menandai function type sebagai nullable(?.) dengan menempatkannya di dalam tanda kurung dan diakhiri dengan safe call seperti berikut:
    val sumResult = sum?.invoke(0, 0)
    val multiplyResult = multiply(20, 20)

    println(sumResult)
    println(multiplyResult)
}