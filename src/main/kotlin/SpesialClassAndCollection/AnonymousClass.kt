package com.dicoding.kotlin.SpesialClassAndCollection

//interface IFly {
//    fun fly()
//}
//
//fun flyWithWings(bird: IFly) {
//    bird.fly()
//}
//
//class Bird : IFly {
//    override fun fly() {
//        println("The Bird flying")
//    }
//}
//
//fun main() {
//    flyWithWings(Bird())
//}

//Nah, sekarang kita coba ubah kode tersebut dengan menggunakan anonymous class.

interface ITerbang {
    fun fly()
}

fun flyWithWings(bird: ITerbang) {
    bird.fly()
}

fun main() {
    flyWithWings(object : ITerbang {
        override fun fly() {
            println("The Bird flying")
        }
    })
}