package com.dicoding.kotlin.SpesialClassAndCollection

fun main() {
    val number = listOf(1, 2, 3, 4, 5, 6)
    val drop = number.dropLast(3)

    println(drop)

    /*
      output: [1, 2, 3]
   */
}