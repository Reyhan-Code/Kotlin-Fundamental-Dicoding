package com.dicoding.kotlin

fun main(args: Array<String>){
    var string: String? = "Dicoding"
    if(string != null) { // smart cast
        print(string.length) // It works now!
    }
}

//Dengan cara tradisional menggunakan if/else seperti di atas,
// kompiler akan mengizinkan kita untuk mengelola nilai dari sebuah
// variabel yang kita tandai sebagai nullable. Ia akan otomatis mengubah
// tipe data String? menjadi String. Inilah yang disebut
// dengan fitur Smart Cast pada Kotlin.