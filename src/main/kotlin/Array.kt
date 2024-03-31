package com.dicoding.kotlin

fun main() {
    val intArray = intArrayOf(1, 3, 5, 7)  // [1, 3, 5, 7]
    intArray[2] = 11                       // [1, 3, 11, 7]

    print(intArray[1])

    /*
        Output: 11
    */
}

/*
Kotlin juga memungkinkan kita untuk membuat Array dengan tipe data
primitif dengan memanfaatkan beberapa fungsi spesifik berikut:

intArrayOf() : IntArray

booleanArrayOf() : BooleanArray

charArrayOf() : CharArray

longArrayOf() : LongArray

shortArrayOf() : ShortArray

byteArrayOf() : ByteArray

Jika kita ingin membuat Array yang hanya bisa dimasukkan
nilai dengan tipe data Int, gunakan intArrayOf(), misalnya:
 */