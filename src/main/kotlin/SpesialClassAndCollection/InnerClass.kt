package com.dicoding.kotlin.SpesialClassAndCollection

//Untuk membuat inner class, Anda hanya perlu menambahkan keyword inner pada member class. Dengan begitu, ia dapat mengakses properti yang ada di outer class. Berikut ini contohnya.

class House {
    // Properti outer class
    val buildingArea = 100
    inner class Room {
        val totalRooms = 4
        fun measureRoomArea() {
            // Inner class dapat mengakses properti pada outer class
            print(buildingArea/totalRooms)
        }
    }
}

fun main() {
    val house = House()
    val room = house.Room()
    room.measureRoomArea()
}