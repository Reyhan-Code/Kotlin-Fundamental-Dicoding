package com.dicoding.kotlin.SpesialClassAndCollection



val anyList = mutableListOf('a', "Kotlin", 3, true, 'd')

fun main(){
    anyList.removeAt(0) // menghapus item pada indeks ke-0
    println(anyList)
}

