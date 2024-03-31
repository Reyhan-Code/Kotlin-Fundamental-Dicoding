package com.dicoding.kotlin.oop

open class Animal11(val name: String, protected val weight: Double)

class Cat(pName: String, pWeight: Double) : Animal11(pName, pWeight)


fun main() {
    val cat = Cat("Dicoding Miaw", 2.0)
    println("Nama Kucing: ${cat.name}")
//    println("Berat Kucing: ${cat.weight}") // error: expecting a top level declaration
}