package com.dicoding.kotlin.SpesialClassAndCollection

fun main() {
    val list = (1..10000).toList()
    val number = list.filter { it % 5 == 0 }.map { it * 2 }.first()

    //Untuk menerapkan lazy atau vertical evaluation, kita perlu mengubah list menjadi Sequence.
    // Caranya sangat sederhana, yaitu dengan memanggil fungsi asSequence().
    val number2 = list.asSequence().filter { it % 5 == 0 }.map { it * 2 }.first()


    println(number)
    println(number2)
}


/*
Pada contoh kode di atas, kita memiliki data collection sejumlah
1 juta item, kemudian masing-masing data akan disaring berdasarkan
 angka yang merupakan kelipatan 5 lalu dikalikan 2 dan
 akhirnya ditampilkan satu data pertama pada konsol.
 Dengan eager evaluation atau dikenal
 dengan horizontal evaluation, list akan menyelesaikan
 proses filter terhadap 1 juta data baru kemudian melakukan
 mapping data sampai akhirnya ditampilkan pada konsol.
 */