package com.dicoding.kotlin.SpesialClassAndCollection

fun interface ITerbang1 {
    fun fly()
}

fun flyWithWings(bird: ITerbang1) {
    bird.fly()
}

fun main() {
    flyWithWings {
        println("The Bird flying")
    }
}