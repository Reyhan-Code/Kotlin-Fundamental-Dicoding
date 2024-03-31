package com.dicoding.kotlin

fun main() {

    val rangeInt = 1..10 step 2
    rangeInt.forEach {
        print("$it ")
    }
    println(rangeInt.step)

    println(turun())
    println(cekNilai())
}


fun turun() {
    val tenToOne = 10.downTo(1)
    if (7 in tenToOne) { //jika angka 7 di variabel tenToOne
        println("Value 7 available")//maka cetak perintah berikut
    }
}

fun cekNilai() {
    val tenToOne = 10.downTo(1)
    if (11 !in tenToOne) {//cek apakah angka 11 ada di dalam range?
        println("No value 11 in Range ")
    }
}
/*
   output: No value 11 in Range
*/