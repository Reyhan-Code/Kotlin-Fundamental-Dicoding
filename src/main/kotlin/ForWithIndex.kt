package com.dicoding.kotlin

fun main() {
    val ranges = 1.rangeTo(10) step 3 //lompat 3 step midal ([1],2,3,[4],5,6,[7],8,9,[10])
    for ((index, value) in ranges.withIndex()) {
        println("value $value with index $index")
    }
}
/*
   output :
       value 1 with index 0
       value 4 with index 1
       value 7 with index 2
       value 10 with index 3
*/