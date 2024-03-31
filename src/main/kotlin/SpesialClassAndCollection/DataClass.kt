package com.dicoding.kotlin.SpesialClassAndCollection

class User(val name : String, val age : Int){

    override fun toString(): String {
        return "User(name=$name, age=$age)"
    }
}

data class DataUser(val name : String, val age : Int)

fun main(){
    val user = User("Reyhan", 17)
    val user2 = User("dimas", 24)
    val user3 = User("dimas", 24)



    val dataUser = DataUser("Reyhan", 17)
    val dataUser2 = DataUser("Reyhan", 17)
    val dataUser3 = DataUser("dimas", 24)

    println(user)
    println(dataUser)

//    Konsol akan langsung memberi tahu apakah kedua objek tersebut sama atau tidak ketika Anda menjalankan fungsi main():
    println(dataUser.equals(dataUser2))
    println(dataUser.equals(dataUser3))

//Maka hasilnya akan sama saja, false semua. Hal ini karena dia tidak membandingkan kontennya, melainkan lokasi object (referensi) pada memory.
    println(user.equals(user2))
    println(user.equals(user3))
}