package com.dicoding.kotlin

fun main() {
    val user = setUser("Reyhan", 19)
    println(user)

    val day = setHari("Kamis", 22)
    println(day)

    val name = setNama("Reyhan afif", 22)
    println(name)

    printUser("Reyhan afif")
}

/*
    output :
    Your name is Alfian, and you 19 years old
    Your name is Alfian
*/

fun setUser(name: String, age: Int) = "Your name is $name, and you $age years old"
fun setHari(hari: String, tgl: Int) = "Sekarang Hari $hari, dan sekarang tanggal $tgl"

fun printUser(name: String) {
    println("Your name is $name")
}

fun setNama(nama: String, umur: Int): String {
    return "Your name is $nama, and you $umur years old"
}