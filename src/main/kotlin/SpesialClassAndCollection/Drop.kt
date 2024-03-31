package com.dicoding.kotlin.SpesialClassAndCollection

/*
Selanjutnya adalah fungsi drop(),
fungsi yang bisa kita manfaatkan untuk memangkas
item yang berada di dalam sebuah objek collection berdasarkan
jumlah yang kita tentukan. Sebagai contoh, saat kita mempunyai
sebuah collection seperti berikut:
 */

fun main() {
    val number = listOf(1, 2, 3, 4, 5, 6)
    val drop = number.drop(2)

    println(drop)
    /*
      output: [4, 5, 6]
   */
}