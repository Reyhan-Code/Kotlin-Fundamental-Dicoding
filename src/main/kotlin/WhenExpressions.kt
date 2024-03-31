package com.dicoding.kotlin

fun main() {
    val value = 7

    when (value) {
        6 -> println("value is 6")
        7 -> println("value is 7")
        8 -> println("value is 8")
        else -> println("value cannot be reached")
    }

    println(contoh2())

    println(contoh3())
}


/*
Sama halnya seperti if expression, when expression
dapat mengembalikan nilai dan dapat disimpan di dalam sebuah
variabel seperti berikut:
 */
/*
val value = 7
    val stringOfValue = when (value) {
        6 -> "value is 6"
        7 -> "value is 7"
        8 -> "value is 8"
        else -> "value cannot be reached"
    }

    println(stringOfValue)

    /*
        output : value is 7
    */
 */

fun contoh2() {
    val value = 7
    val stringOfValue = when (value) {
        6 -> {
            println("Six")
            "value is 6"
        }
        7 -> {
            println("Seven")
            "value is 7"
        }
        8 -> {
            println("Eight")
            "value is 8"
        }
        else -> {
            println("undefined")
            "value cannot be reached"
        }
    }

    println(stringOfValue)

    /*
        output :
            Seven
            value is 7
    */
}

fun contoh3() {
    val anyType : Any = 100L
    when(anyType){
        is Long -> println("the value has a Long type")
        is String -> println("the value has a String type")
        else -> println("undefined")
    }

    /*
        output : the value has a Long type
    */
}