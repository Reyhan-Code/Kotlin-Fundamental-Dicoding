package com.dicoding.kotlin.KotlinFunctionalPrograming

//Lambda receiver (this)

val buildString = StringBuilder().apply {
    append("Hello ")
    append("Kotlin ")
}

fun  main(){
    println(buildString)
}