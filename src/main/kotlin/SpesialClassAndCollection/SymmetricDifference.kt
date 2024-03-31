package com.dicoding.kotlin.SpesialClassAndCollection

fun main() {
    val numbers = setOf("one", "two", "four")
    val numbers2 = setOf("three", "four")

    // merge differences
    println((numbers - numbers2) union (numbers2 - numbers))
}