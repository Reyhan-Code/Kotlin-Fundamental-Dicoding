package com.dicoding.kotlin.SpesialClassAndCollection

fun main(args: Array<String>) {
    val text = listOf("A", "B", "CC", "DD", "EEE", "F", "GGGG", "HHHH", "iiiiii")
    val distinct = text.distinctBy {//jumlah string tidak boleh sama
        it.length
    }

    println(distinct)

    /*
    output: [A, CC, EEE, GGGG]
    */
}