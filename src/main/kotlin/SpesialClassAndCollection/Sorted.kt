package com.dicoding.kotlin.SpesialClassAndCollection

fun main(args: Array<String>) {
    val kotlinChar = listOf('C', 'B', 'E', 'A', 'F', 'D')
    val ascendingSort = kotlinChar.sorted()
    println(ascendingSort)

    // ascendingSort: [i, k, l, n, o, t]
//    sorted() digunakan untuk mengurutkan item yang ada di dalam collection. Secara default fungsi sorted() ini akan mengurutkan data secara ascending. Perhatikan kode di bawah ini.


//Namun, untuk sorting secara descending, kita dapat menggunakan fungsi sortedDescending().
    val descendingSort = kotlinChar.sortedDescending()
    println(descendingSort)

    // descendingSort: [t, o, n, l, k, i]


}