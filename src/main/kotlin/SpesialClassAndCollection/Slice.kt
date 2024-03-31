package com.dicoding.kotlin.SpesialClassAndCollection

fun main(args: Array<String>) {
    val total = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val slice = total.slice(2..9)

    println(slice)

    /*
    output: [4, 5, 6, 7]
    */
}