package com.dicoding.kotlin.oop

class Animal{
    var name: String = "Dicoding Miaw"
        get(){
            println("Fungsi Getter terpanggil")
            return field
        }
        set(value){
            println("Fungsi Setter terpanggil")
            field = value
        }
}

fun main(){
    val dicodingCat = Animal()
    println("Nama: ${dicodingCat.name}" )
    dicodingCat.name = "Goose"
    dicodingCat.name = "Goose Duck"
    println("Nama: ${dicodingCat.name}")
    dicodingCat.name = "Goose Blom"
    println("Nama: ${dicodingCat.name}")
}

/*
    output:
    Fungsi Getter terpanggil
Nama: Dicoding Miaw
Fungsi Setter terpanggil
Fungsi Setter terpanggil
Fungsi Getter terpanggil
Nama: Goose Duck
Fungsi Setter terpanggil
Fungsi Getter terpanggil
Nama: Goose Blo
*/