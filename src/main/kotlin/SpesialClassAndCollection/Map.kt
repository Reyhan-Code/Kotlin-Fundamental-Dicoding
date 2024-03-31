package com.dicoding.kotlin.SpesialClassAndCollection

fun main(args: Array<String>) {
    val capital = mapOf(
        "Jakarta" to "Indonesia",
        "London" to "England",
        "New Delhi" to "India"
    )

    //Kita dapat menampilkan key apa saja yang ada di dalam Map dengan menggunakan fungsi keys(). Fungsi ini akan mengembalikan nilai berupa Set karena key pada Map haruslah unik.
    val mapKeys = capital.keys

    //Lalu, untuk mengetahui nilai apa saja yang ada di dalam Map, kita bisa menggunakan fungsi values(). Fungsi ini akan mengembalikan collection sebagai tipe datanya.
    val mapValues = capital.values

    //Untuk menambahkan key-value ke dalam map, kita perlu memastikan bahwa map yang digunakan adalah mutable. Mari kita ubah map capital yang sudah kita buat sebelumnya menjadi mutable.
    val mutableCapital = capital.toMutableMap()
    mutableCapital.put("Amsterdam", "Netherlands")
    mutableCapital.put("Berlin", "Germany")

    println(capital["Jakarta"])
    println(capital.getValue("London"))

    println(capital["Japan"]) //null karena tidak ada key do dalam capital

    println(mapKeys)
    println(mapValues)

    println(mutableCapital)

}