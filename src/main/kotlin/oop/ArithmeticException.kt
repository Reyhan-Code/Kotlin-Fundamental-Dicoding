package com.dicoding.kotlin.oop

fun main() {
    val someValue = 6
    println(someValue / 0)
}

/*
	output:
    Exception in thread "main" java.lang.ArithmeticException: / by zero
*/