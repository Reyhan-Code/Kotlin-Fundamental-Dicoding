package com.dicoding.kotlin.oop

fun main() {
    val dicodingCat = Animal6("Dicoding Miaw", 0.0, -1, true)
    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}")
}

/*
output:
    Nama: Dicoding Miaw, Berat: 4.2, Umur: 2, mamalia: true
*/

class Animal6(name: String, weight: Double, age: Int, isMammal: Boolean) {
    val name: String
    val weight: Double
    val age: Int
    val isMammal: Boolean

    init {
        this.weight = if(weight < 0) 0.1 else weight
        this.age = if(age < 0) 0  else age
        this.name = name
        this.isMammal = isMammal
    }
}
