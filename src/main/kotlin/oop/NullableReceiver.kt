package com.dicoding.kotlin.oop

fun main() {
    val value: Int? = null
    val value1: Int? = null

    println(value.slice)
    println(value1.slice)
}

val Int?.slice: Int
    get() = this?.div(2) ?: 0

/*
    output : 0
             0
*/