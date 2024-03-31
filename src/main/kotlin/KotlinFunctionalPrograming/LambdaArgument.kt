package com.dicoding.kotlin.KotlinFunctionalPrograming

//Lambda argument (it)
//elanjutnya, fungsi yang menggunakan lambda argument untuk mengakses konteks dari sebuah objek adalah fungsi let dan also. Berbeda dengan lambda receiver, nilai dari argumen tersebut dapat kita gunakan untuk diproduksi atau diinisialisasikan untuk variabel lain. Contohnya seperti berikut.

//val text = "Hello"
//text.let {
//    val message = "$it Kotlin"
//    println(message)
//}

//Secara default, nama dari argumen tersebut adalah it, tetapi kita dapat mengubahnya seperti berikut.

fun  main(){
    val text = "Hello"
    text.let { value ->
        val message = "$value Kotlin"
        println(message)
    }
}