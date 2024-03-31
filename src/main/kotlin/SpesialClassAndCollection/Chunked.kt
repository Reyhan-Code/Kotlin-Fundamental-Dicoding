package com.dicoding.kotlin.SpesialClassAndCollection

fun main(args: Array<String>) {
    val word = "QWERTY"
    val chunked = word.chunked(2) //membagi sebuah kata

    val chunkedTransform = word.chunked(3) {
        it.toString().toLowerCase()
    }


    println(chunked)
    println(chunkedTransform)
    /*
    output:[QWE, RTY]
    */
}