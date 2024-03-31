package com.dicoding.kotlin.SpesialClassAndCollection

fun main(){
    val dataUser = DataUser2("nrohmen", 17)
    val dataUser2 = DataUser2("nrohmen", 17)
    val dataUser3 = DataUser2("dimas", 24)
    val dataUser4 = dataUser.copy()
    val dataUser5 = dataUser.copy(age = 18)

    println(dataUser5)
}

data class DataUser2(val name : String, val age : Int)