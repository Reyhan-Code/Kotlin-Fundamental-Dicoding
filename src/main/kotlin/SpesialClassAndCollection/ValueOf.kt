package com.dicoding.kotlin.SpesialClassAndCollection

fun main() {
    val color: Color4 = Color4.valueOf("RED")
    println("Color is $color")
    println("Color value is ${color.value.toString(16)}")
//Khusus pada kasus di atas, kita menambahkan toString(16) untuk menampilkan angka yang berupa HexaDesimal.


    /*
        output :
        Color is RED
        Color value is ff0000
    */

}

enum class Color4(val value: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}