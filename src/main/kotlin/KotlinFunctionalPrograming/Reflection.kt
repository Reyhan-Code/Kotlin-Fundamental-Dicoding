package com.dicoding.kotlin.KotlinFunctionalPrograming

fun main(){
    val sum: (Int, Int) -> Int = ::count

    println(sum(2))
}

fun count(valueA: Int, valueB
: Int): Int {
    return valueA + valueB
}

//Kode di atas ditulis dengan mekanisme Reflection yang berarti seperangkat fitur bahasa dan library yang memungkinkan kita untuk mengamati struktur kode dari proyek yang sedang kita kerjakan secara langsung.