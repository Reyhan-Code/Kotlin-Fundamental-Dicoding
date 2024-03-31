package com.dicoding.kotlin

//fun main() {
//    val openOffice = 7
//    val now = 8
//    if (now > openOffice) {
//        print("Office already open")
//    } else {
//        print("Office close")
//    }
//}


//expression
fun main() {

    //CONTOH KE-1=============================
    val openOffice = 7
    val now = 8


    val office = if (now > openOffice) "Office already open" else "Office close"
    println(office)
    //========================================

    //CONTOH KE-2
    val value1 = 10
    val value2 = 10

    println(sum(value1, value2))
//    ===========================================
//CONTOH LE-3
    println(panjang())


//    CONTOH BUATAN SENDIRI
    println(day())

}

//CONTOH BUATAN SENDIRI
fun day(){
    val hari = "minggu"
    val hariSekarang = "Jum'at"

    val hariMinggu = if(hariSekarang == hari) "Sekarang hari minggu" else "Sekarang bukan hari minggu"
    println(hariMinggu)
}

//CONTOH KE-2
fun sum(value1: Int, value2: Int) = value1 + value2

//CONTOH KE-3
fun panjang() {
    val anyType: Any = 100L
    when (anyType) {
        is Long -> println("the value has a Long type")
        is Int -> println("the value has a Int type")
        is Double -> println("the value has a Double type")
        else -> println("undefined")
    }
}