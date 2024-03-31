package com.dicoding.kotlin.oop

open class Animal14(val name: String){
    open fun eat(){
        println("$name sedang makan!")
    }
}


class Kucing1(pName: String) : Animal14(pName) {
    override fun eat(){
        super.eat()
        println("$name sedang memakan ikan !")
    }
}


fun main(){
    val dicodingCat = Kucing1("Miauw")
    dicodingCat.eat()
}