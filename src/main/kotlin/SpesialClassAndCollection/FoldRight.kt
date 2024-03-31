package com.dicoding.kotlin.SpesialClassAndCollection

fun main() {
    val numbers = listOf(1, 2, 3)
    val fold = numbers.foldRight(10) { item, current ->
        println("current $current")
        println("item $item")
        println()
        item + current
    }

    println("Fold result: $fold")

    /*
      output:
         current 10
         item 3

         current 13
         item 2

         current 15
         item 1

         Fold result: 16
   */
}