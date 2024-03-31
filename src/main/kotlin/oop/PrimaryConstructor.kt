package com.dicoding.kotlin.oop

fun main(){
    val dicodingCat = Animal5("Dicoding Miaw", 4.2, 2, true)
    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}" )
}

/*
output:
    Nama: Dicoding Miaw, Berat: 4.2, Umur: 2, mamalia: true
*/

class Animal5(val name: String, val weight: Double, val age: Int, val isMammal: Boolean)