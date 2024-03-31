package com.dicoding.kotlin.KotlinFunctionalPrograming

//fun factorial(n: Int, result: Int = 1): Int {
//    val newResult = n * result
//    return if (n == 1) {
//        newResult
//    } else {
//        factorial(n - 1, newResult)
//    }
//}

fun main(){
    println(factorial(3))
}

tailrec fun factorial(n: Int, result: Int = 1): Int {
    val newResult = n * result
    return if (n == 1) {
        newResult
    } else {
        factorial(n - 1, newResult)
    }
}

//Pada kode di atas, modifier tailrec ditempatkan sebelum kata kunci fun. Ketika sebuah fungsi ditandai dengan modifier tailrec, maka fungsi tersebut hanya boleh dipanggil untuk dijalankan terakhir dan tidak boleh digunakan dari dalam blok try-catch-finally.