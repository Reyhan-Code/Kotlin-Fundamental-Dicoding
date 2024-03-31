package com.dicoding.kotlin

fun main() {
//    val maxInt = Int.MAX_VALUE
//    val minInt = Int.MIN_VALUE
//
//    println(maxInt)
//    println(minInt)
//


    val stringNumber = "23"
    val intNumber = 3
    val readableNumber = 1_000_000


    println(readableNumber)

    print(intNumber + stringNumber.toInt())
    //output 26
}

/*
Kode di atas menggunakan fungsi toInt() untuk melakukan konversi secara
eksplisit dari tipe data Byte ke tipe data Int. Adapun beberapa fungsi
konversi yang dapat kita gunakan antara lain:

toByte(): Byte

toShort(): Short

toInt(): Int

toLong(): Long

toFloat(): Float

toDouble(): Double

toChar(): Char
 */