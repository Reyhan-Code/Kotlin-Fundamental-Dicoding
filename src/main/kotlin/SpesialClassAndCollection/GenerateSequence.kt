package com.dicoding.kotlin.SpesialClassAndCollection

fun main() {
    val sequenceNumber = generateSequence(1) { it + 1 }
    sequenceNumber.take(10).forEach { print("$it ") }
}
// Output: 1 2 3 4 5