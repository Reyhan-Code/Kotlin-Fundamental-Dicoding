package com.dicoding.kotlin.SpesialClassAndCollection

fun main(args: Array<String>) {
    val index = listOf(2, 3, 5, 8, 7, 1, )
    val total = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val slice = total.slice(index)

    println(slice)

    /*
    output: [3, 4, 6, 9]
    */
}