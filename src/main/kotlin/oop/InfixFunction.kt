package com.dicoding.kotlin.oop

infix fun Int.sum(value: Int): Int {
    return this + value
}

fun main(){
    val result = 5 sum 3 // Menggunakan Infix Function
    println(result)
}