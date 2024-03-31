package com.dicoding.kotlin.oop

fun main() {
    println(10.plusThree())
}

fun Int.plusThree(): Int {
    return this + 3
}

/*
   output : 13
*/