package com.dicoding.kotlin.SpesialClassAndCollection

//Kemudian ada juga fungsi union dan intersect untuk mengetahui gabungan dan irisan dari 2 (dua) buah Set. Berikut contohnya.

fun main(args: Array<String>) {
    val setA = setOf(1, 2, 4, 2, 1, 5)
    val setB = setOf(1, 2, 4, 5)

    val setC = setOf(1, 5, 7)
    val union = setA.union(setC)
    val intersect = setA.intersect(setC)

    val mutableSet = mutableSetOf(1, 2, 4, 2, 1, 5)
    //mutableSet[2] = 6 // tidak bisa mengubah mutableSet
    mutableSet.add(6) // menambah item di akhir set
    mutableSet.remove(4) //menghapus item yang memiliki nilai 6

    println(mutableSet)
    println(union)
    println(intersect)

    // union: [1, 2, 4, 5, 7]
    // intersect: [1, 5]
}