package com.dicoding.kotlin.KotlinFunctionalPrograming

var message2 = "Kotlin"

fun main() {
    println(::message2.name)
    println(::message2.get())

    ::message2.set("Kotlin Academy")

    println(::message2.get())
}