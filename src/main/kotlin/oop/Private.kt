package com.dicoding.kotlin.oop

class Animal9(private var name: String,
              private val weight: Double,
              private val age: Int,
              private val isMammal: Boolean = true) {

    fun getName() : String {
        return name
    }

    fun setName(newName: String) {
        name = newName
    }

}

fun main() {
    val dicodingCat = Animal9("Dicoding Miaw", 2.5, 2)
    println(dicodingCat.getName())
    dicodingCat.setName("Gooose")
    println(dicodingCat.getName())
}

/*
    output:
        Dicoding Miaw
        Gooose
*/