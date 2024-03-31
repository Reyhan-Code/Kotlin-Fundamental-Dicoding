package com.dicoding.kotlin.SpesialClassAndCollection

//OPSI KE-1
//fun main(){
//    val dataUser = DataUser3("Reyhan ", 22)
//
//    val name = dataUser.component1()
//    val age = dataUser.component2()
//
//    println("My name is $name, I am $age years old")
//}

//OPSI KE-2
//fun main(){
//    val dataUser = DataUser("Reyhan", 22)
//    val (name, age) = dataUser
//
//    println("My name is $name, I am $age years old")
//}
//
//
//data class DataUser3(val name : String, val age : Int)


//OPSI KE3
data class DataUser3(val name : String, val age : Int){
    fun intro(){
        println("My name is $name, I am $age years old")
    }
}

fun main(){
    val dataUser = DataUser3("Reyhan", 22)
    dataUser.intro()
}