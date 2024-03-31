package com.dicoding.kotlin.oop

//Kita juga dapat memeriksa apakah variabel tersebut sudah diinisialisasi dengan menggunakan fungsi isInitialized seperti ini.

lateinit var name: String
fun main() {
    name = "Dicoding Miaw"
    if (::name.isInitialized)
        print(name.length)
    else
        print("Not Initialized")
}

/*
Catatan:
Hal yang perlu diperhatikan adalah lateinit harus disandingkan dengan keyword var (tidak bisa menggunakan val).
 Hal ini berbeda dengan Lazy property yang nanti akan dibahas

 */