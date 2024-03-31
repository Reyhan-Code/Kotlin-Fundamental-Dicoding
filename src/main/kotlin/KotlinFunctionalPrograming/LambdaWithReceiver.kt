package com.dicoding.kotlin.KotlinFunctionalPrograming

fun main() {
    val message = buildString {
        append("Hello ")
        append("from ")
        append("laamongan ")
    }

    println(message)
}

/*
   output : Hello from lambda
*/

//Pada kode di atas, StringBuilder dijadikan sebagai receiver untuk tipe deklarasi parameter action. Dengan begitu kita dapat memanggil parameter action tersebut dari variabel yang bertipekan StringBuilder. Untuk memanggil fungsi di atas bisa seperti berikut:
fun buildString(action: StringBuilder.() -> Unit): String {
    val stringBuilder = StringBuilder()
    stringBuilder.action()
    return stringBuilder.toString()
}

//fun buildString(): String {
//    val stringBuilder = StringBuilder()
//    stringBuilder.append("Hello ")
//    stringBuilder.append("from ")
//    stringBuilder.append("lambda")
//    return stringBuilder.toString()
//}