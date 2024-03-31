package com.dicoding.kotlin.oop

open class Animal13(val name: String, val weight: Double, val age: Int, val isCarnivore: Boolean){

    open fun eat(){
        println("$name sedang makan!")
    }

    open fun sleep(){
        println("$name sedang tidur!")
    }
}


class Kucing(pName: String,
             pWeight: Double,
             pAge: Int,
             pIsCarnivore: Boolean,
             val furColor: String,
             val numberOfFeet: Int) : Animal13(pName, pWeight, pAge, pIsCarnivore) {

    fun playWithHuman() {
        println("$name bermain bersama Manusia !")
    }

    override fun eat(){
        println("$name sedang memakan ikan!")
    }

    override fun sleep() {
        println("$name sedang tidur di bantal!")
    }
}


fun main(){
    val dicodingCat = Kucing("Kucing", 3.2, 2, true, "Brown", 4)

    dicodingCat.playWithHuman()
    dicodingCat.eat()
    dicodingCat.sleep()
}