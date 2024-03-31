package com.dicoding.kotlin.KotlinFunctionalPrograming

val message :(String) -> String = { name: String ->
    "Hello $name"
}

fun main(){
    val pesan = message("Reyhan")
    println(pesan)
}