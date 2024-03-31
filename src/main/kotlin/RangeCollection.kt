package com.dicoding.kotlin

fun main() {
    val value =  27
    val ranges = 10..50 //range

    when(value){
        in ranges -> println("value is in the range")
        !in ranges -> println("value is outside the range")
    }

    /*
    output : value is in the range
    */
}