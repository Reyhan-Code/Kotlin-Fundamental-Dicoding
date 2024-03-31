package com.dicoding.kotlin.KotlinFunctionalPrograming

//fun main() {
//    val builder = StringBuilder()
//    builder.append("Hello ")
//    builder.append("Kotlin!")
//
//    println(builder.toString())
//}
//
///*
//   output : Hello Kotlin
//*/

fun main() {
    val message = StringBuilder().apply {
        append("Hello ")
        append("Kotlin!")
    }

    println(message.toString())
}

/*
   output : Hello Kotlin
*/