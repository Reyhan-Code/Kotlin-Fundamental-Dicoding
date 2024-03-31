package com.dicoding.kotlin.SpesialClassAndCollection

//Fungsi count() dapat kita gunakan untuk menghitung jumlah item yang ada di dalam collection. Kembali gunakan contoh numberList, kita akan menampilkan jumlah item yang ada di dalamnya.

fun main(args: Array<String>) {
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    //Cukup sederhana, bukan? Di dalam fungsi count() kita juga bisa menambahkan sebuah parameter yang berisi sebuah kondisi. Sebagai contoh kali ini kita akan menampilkan jumlah item pada numberList yang merupakan kelipatan dari 3.
    val numberList2 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(numberList2.count { it % 3 == 0 })
    //Pada kode di atas konsol akan menampilkan 3 sebagai jumlah item yang merupakan kelipatan 3, yaitu: 3, 6, dan 9.

    println(numberList.count())


    // Output: 10
}