package com.dicoding.kotlin.oop

fun main() {
    val someStringValue = "18.0"
    println(someStringValue.toInt())
}

/*
	output:
    Exception in thread "main" java.lang.NumberFormatException: For input string: "18.0"
*/