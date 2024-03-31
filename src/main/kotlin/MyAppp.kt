package com.dicoding.kotlin

var nama = "Reyhan"
var nilai = 96
var vocal = 'A'

fun main(){
    println("nama saya $nama")

    if (nilai >= 100){
        println("A")
    }else if (nilai >= 89){
        println("AB")
    }else if (nilai >= 78){
        println("B")
    }else{
        println("C")
    }

    println("Vocal " + vocal++)
    println("Vocal " + vocal++)
    println("Vocal " + vocal++)
    println("Vocal " + vocal--)
    println("Vocal " + vocal--)
    println("Vocal " + vocal--)
    println("Vocal " + vocal--)
}