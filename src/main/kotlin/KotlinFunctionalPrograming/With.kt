package com.dicoding.kotlin.KotlinFunctionalPrograming

fun main() {
    val message = "Hello Reyhan"
    val result = with(message) {
        "First character is ${this[0]}" +
                " and last character is ${this[this.length - 1]}"
    }

    println(result)
}