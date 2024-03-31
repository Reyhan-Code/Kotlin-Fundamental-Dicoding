package com.dicoding.kotlin

fun main() {
    val officeOpen = 7
    val now = 10
    val isOpen = now > officeOpen

    if (!isOpen) {
        print("Office is closed")
    } else {
        print("Office is open")
    }

}

/*
Berbeda dengan operator AND (&&) dan operator OR(||), operator NOT(!)
digunakan untuk melakukan negasi pada hasil evaluasi expression yang
diberikan. Contoh, Jika hasil expressions setelah dievaluasi bernilai true,
 operator NOT akan mengembalikan nilai false.
 */