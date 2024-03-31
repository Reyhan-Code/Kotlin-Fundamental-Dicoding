package com.dicoding.kotlin.SpesialClassAndCollection

//Satu hal yang menarik ketika membuat Class di dalam Kotlin adalah Nested Class. Artinya, Anda bisa membuat Class baru di dalam sebuah Class. Berikut ini contohnya.
class House2 {
    // Properti atau anggota outer class
    val buildingArea = 100
    val totalRooms = 5

    inner class Room {
        // Properti atau anggota inner class
        val totalRooms = 4
        fun measureRoomArea() {
            // Inner class dapat mengakses properti atau anggota outer class
            print(buildingArea/this@House2.totalRooms)
        }
    }
}

fun main() {
    val house = House2()
    val room = house.Room()
    room.measureRoomArea()
}