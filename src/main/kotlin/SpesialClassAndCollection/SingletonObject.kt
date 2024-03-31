package com.dicoding.kotlin.SpesialClassAndCollection

//Dalam dunia Kotlin, sebuah Class dapat diinisialisasi berkali-kali
// di tempat dan waktu yang berbeda-beda. Lalu, bagaimana jika
// kita menginginkan tanpa adanya duplikasi Class dalam
// penggunaanya? Di sinilah kita perlu memahami konsep Singleton.
// Singleton merupakan pattern yang berguna untuk memastikan
// uatu object hanya memiliki satu instance dengan satu
// titik akses global.
//
//Uniknya, pembuatan Singleton dalam bahasa Kotlin sangatlah simpel dan mudah karena cukup menggunakan keyword object seperti berikut ini.


object CentralLibrary {
    fun borrowBookById(id: Int) {
        print("Book with $id has been borrowed")
    }
}

fun main() {
    CentralLibrary.borrowBookById(21)
}