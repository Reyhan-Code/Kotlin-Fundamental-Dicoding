package com.dicoding.kotlin.SpesialClassAndCollection

fun main(args: Array<String>) {
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val multipliedBy5 = numberList.map { it * 5 }

    // multipliedBy5: [5, 10, 15, 20, 25, 30, 35, 40, 45, 50]
    //it pada kode di atas akan merepresentasikan masing-masing item pada numberList.
    println(multipliedBy5)
}


//Fungsi yang akan sering dipakai berikutnya adalah map(). Fungsi ini akan membuat collection baru sesuai perubahan yang akan kita lakukan dari collection sebelumnya. Kita ambil contoh dari numberList yang sudah ada. Lalu kita buat collection baru yang isinya adalah hasil kali 5 (lima) dari masing-masing item sehingga Anda bisa menggunakan kode seperti berikut.


