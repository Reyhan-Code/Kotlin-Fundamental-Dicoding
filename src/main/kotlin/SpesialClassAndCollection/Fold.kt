package com.dicoding.kotlin.SpesialClassAndCollection

fun main() {
    val numbers = listOf(1, 2, 3)
    val fold = numbers.fold(10) { current, item ->
        println("current $current")
        println("item $item")
        println()
        current + item //arimatika
    }

    println("Fold result: $fold")

    /*
      output:
         current 10 + 1


         current 11 + item 2


         current 13 + item 3

         Fold result: 16
   */
}