package com.dicoding.kotlin.KotlinFunctionalPrograming

fun main() {
    val text = "Reyhan"
    val result = text.also {
        println("value length -> ${it.length}")
    }

    println("text -> $result")
}

/*
   output :
           value length -> 12
           text -> Hello Kotlin
*/