package com.dicoding.kotlin.SpesialClassAndCollection

fun main(args: Array<String>) {
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val notEvenList = numberList.filterNot { it % 2 == 0 }

    // notEvenList: [1, 3, 5, 7, 9]

    println(notEvenList)
}
//Selain itu kita juga dapat mem-filter list berdasar hasil yang tak sesuai dengan kondisi yang diberikan. Caranya adalah dengan menggunakan fungsi filterNot().