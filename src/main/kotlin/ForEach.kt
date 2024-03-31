package com.dicoding.kotlin

fun main() {
    val ranges = 1.rangeTo(10) step 3 //lompat 3 step midal ([1],2,3,[4],5,6,[7],8,9,[10])
    ranges.forEach { value ->
        println("value is $value!")
    }
}
