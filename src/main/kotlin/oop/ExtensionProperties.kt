package com.dicoding.kotlin.oop

fun main() {
    println(10.slice)
}

/*
   output : 5
*/

val Int.slice: Int
    get() = this / 2