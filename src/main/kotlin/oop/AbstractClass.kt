package com.dicoding.kotlin.oop

abstract class Animal16(var name: String, var weight: Double, var age: Int, var isCarnivore: Boolean){

    fun eat(){
        println("$name sedang makan !")
    }

    fun sleep(){
        println("$name sedang tidur !")
    }
}


fun main(){
//    val animalK = Animal16("dicoding animal", 2.6, 1, true)
}

//output Cannot create an instance of an abstract class