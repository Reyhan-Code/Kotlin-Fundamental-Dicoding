package com.dicoding.kotlin.SpesialClassAndCollection

fun main(args: Array<String>) {
    val total = listOf(1, 2, 2, 3, 4, 2, 2, 3, 2,  5)
    val distinct = total.distinct()

    println(distinct)

    /*
    output: [1, 2, 3, 4, 5]
    */
//untuk menyaring item yang sama tersebut kita akan melakukan iterasi dan membandingkan setiap itemnya.
}