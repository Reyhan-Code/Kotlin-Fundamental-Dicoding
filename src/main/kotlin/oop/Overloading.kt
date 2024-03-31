package com.dicoding.kotlin.oop

class Animal12(private var name: String) {
    fun eat() {
        println("$name makan!")
    }

    fun eat(typeFood: String) {
        println("$name memakan $typeFood!")
    }

    fun eat(typeFood: String, quantity: Double) {
        println("$name memakan $typeFood sebanyak $quantity grams!")
    }

    fun sleep() {
        println("$name tidur!")
    }
}


fun main() {
    val dicodingCat = Animal12("Reyhan")

    dicodingCat.eat()
    dicodingCat.eat("Ikan Tuna")
    dicodingCat.eat("Ikan Tuna", 450.0)
    dicodingCat.sleep()
}