package com.dicoding.kotlin.KotlinFunctionalPrograming

//fun main() {
//    val message: String? = null
//    message?.let {
//        val length = it.length * 2
//        val text = "text length $length"
//        println(text)
//    }
//}
//
//fun main() {
//    val message: String? = "halo" //bisa juga null
//    val length = message?.length ?: 0 * 2
//    val text = "text length $length"
//    println(text)
//}

fun main() {
    val message: String? = null
    message?.let {
        val length = it.length * 2
        val text = "text length $length"
        println(text)
    } ?: run {
        val text = "message is null"
        println(text)
    }
}