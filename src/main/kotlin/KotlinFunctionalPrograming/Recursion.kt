package com.dicoding.kotlin.KotlinFunctionalPrograming

//fun factorial(n: Int): Int {
//    return if (n == 1) {
//        n
//    } else {
//        var result = 1
//        for (i in 1..n) {
//            result *= i
//        }
//        result
//    }
//}

//Berikut contoh ketika kode di atas ditulis dengan mekanisme recursive:

fun main() {
    println("Factorial 9999 is: ${factorial(9999)}")
}


fun factorial(n: Int): Int {
    return if (n == 1) {
        n
    } else {
        n * factorial(n - 1)
    }
}

