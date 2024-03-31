package com.dicoding.kotlin.oop

//Selain menggunakan keyword lateinit, kita juga bisa menggunakan lazy property untuk membuat property yang bukan null dan menunda inisialisasi. Berikut ini contoh kodenya.

val name1: String by lazy {
    "Dicoding Miaw"
}
fun main() {
    print(name1.length)
}

/*
Catatan:
Dalam menggunakan lazy property, Anda harus menggunakan keyword val.
Hal ini karena nilainya hanya dapat diinisialisasi satu kali.
 */