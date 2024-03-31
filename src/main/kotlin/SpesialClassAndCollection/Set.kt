package com.dicoding.kotlin.SpesialClassAndCollection

fun main(args: Array<String>) {
    val integerSet = setOf(1, 2, 4, 2, 1, 5)

    val setA = setOf(1, 2, 4, 2, 1, 5)
    val setB = setOf(1, 2, 4, 5)

    //PENGECEKAN apakah sebuah nilai ada di dalam Set dengan menggunakan kata kunci in.
    val setC = setOf(1, 2, 4, 2, 1, 5)

    println(9 in setC)
    println(setA == setB) //boolean
    println(integerSet)

    // Output: [1, 2, 4, 5]
}
/*
Secara otomatis fungsi setOf akan membuang angka yang sama
sehingga hasilnya adalah [1, 2, 4, 5]. Selain itu,
urutan pada Set bukanlah sesuatu yang penting sehingga
apabila kita bandingkan dua buah Set yang memiliki nilai
yang sama dan urutan yang berbeda akan tetap dianggap sama.
 */

