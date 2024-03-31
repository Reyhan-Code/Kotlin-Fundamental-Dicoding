package com.dicoding.kotlin.SpesialClassAndCollection

fun main() {
    val total = listOf(1, 2, 3, 4, 5, 6)
    val take = total.takeLast(1)

    println(take)

    /*
      output: [4, 5, 6]
   */
}