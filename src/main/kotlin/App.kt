package com.dicoding.kotlin

class App {
    val greeting: String get() {
            return "Hello world."
        }
}
//hallo world

/* coba komen multi */
//fun main() {
//    println(App().greeting)
//}

fun main() {
    val name = "Reyhan Afif Fahri"

    println("Hello my name is  $name ")
    println(App().greeting)
}



/*
   output:
       Hello my name is Reyhan
       Always true
*/