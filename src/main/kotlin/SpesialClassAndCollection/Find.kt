package com.dicoding.kotlin.SpesialClassAndCollection

fun main(args: Array<String>) {
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val firstOddNumber = numberList.find { it % 2 == 1 }
    val firstOrNullNumber = numberList.firstOrNull { it % 2 == 3 }

    // firstOddNumber: 1
    // firstOrNullNumber: null

    println("firstOddNumber: $firstOddNumber")
    println("firstOrNullNumber: $firstOrNullNumber")
}