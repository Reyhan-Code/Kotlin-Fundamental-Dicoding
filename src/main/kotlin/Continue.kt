package com.dicoding.kotlin

/*
Proses perulangan pada kode di atas akan menghasilkan nilai null.
Jika kita mengelola nilai tersebut, ada potensi NullPointerException di sana.
 Lalu bagaimana kita melewatkan atau menghentikan proses perulangan jika
 nilai yang dihasilkan bernilai null? Nah, di sini kita bisa menggunakan
 Break dan Continue.
 */

//fun main() {
//    val listOfInt = listOf(1, 2, 3, null, 5, null, 7)
//    for (i in listOfInt) {
//        print(i)
//    }
//}
///*
//   output: 123null5null7
//*/


/*
Berikut adalah contoh proses iterasi pada kode di atas.
Kita akan coba melewatkannya jika nilai yang dihasilkan adalah null.
 */

fun main() {
    val listOfInt = listOf(1, 2, 3, null, 5, null, 7)

    for (i in listOfInt) {
        if (i == null) continue //Pada kode di atas kita menggunakan kata kunci continue.
        // Jika hasil evaluasi expression yang diberikan bernilai true,
        // maka proses iterasi akan dilewatkan dan lanjut ke proses iterasi berikutnya.
        print(i)
    }
}
/*
   output: 12357
*/