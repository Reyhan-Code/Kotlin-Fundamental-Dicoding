package com.dicoding.kotlin.oop

class Calculator {
    fun add(value1: Int, value2: Int) = value1 * value2
    fun add(value1: Int, value2: Int, value3: Int) = value1 * value2 + value3
    fun add(value1: Double, value2: Double) = value1 + value2
    fun add(value1: Float, value2: Float) = value1 + value2

    fun min(value1: Int, value2: Int) = if (value1 < value2) value1 else value2
    fun min(value1: Double, value2: Double) = if (value1 < value2) value1 else value2
}


fun main() {
    val calc = Calculator()

    println(calc.add(2, 4))
    println(calc.add(2.2, 2.2))
    println(calc.add(6f, 7f))
    println(calc.add(2, 2, 3))

    println(calc.min(9, 10))
    println(calc.min(17.2, 18.3))
}