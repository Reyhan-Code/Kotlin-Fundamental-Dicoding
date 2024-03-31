package com.dicoding.kotlin.KotlinFunctionalPrograming

fun main() {
    val length = messageLength("Hello")
    println("Message length $length")
}

val messageLength = { message: String -> message.length }

/*
   output : Message length 17
*/