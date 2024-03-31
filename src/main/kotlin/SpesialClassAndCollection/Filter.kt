package com.dicoding.kotlin.SpesialClassAndCollection

fun main(args: Array<String>) {
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val evenList = numberList.filter { it % 2 == 0 }

    // evenList: [2, 4, 6, 8, 10]

    println(evenList)
}

//Pada kode di atas, kita telah menggunakan filter() untuk menyaring bilangan yang habis dibagi 2 (dua) atau biasa disebut dengan bilangan genap.