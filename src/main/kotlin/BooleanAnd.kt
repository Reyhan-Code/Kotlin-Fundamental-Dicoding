package com.dicoding.kotlin

fun main() {
    val officeOpen = 7
    val officeClosed = 21
    val now = 20

    val isOpen = if (now >= officeOpen && now <= officeClosed){
        true
    } else {
        false
    }

    print("Office is open : $isOpen")

}

/*
Berbeda dengan operator AND (&&), operator OR (||) akan
mengembalikan nilai true jika hasil evaluasi dari salah
satu expressions yang diberikan bernilai true.
 */