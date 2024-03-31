package com.dicoding.kotlin.SpesialClassAndCollection

fun main() {
    val color: Color6 = Color6.RED

    when(color){
        Color6.RED -> print("Color is Red")
        Color6.BLUE -> print("Color is Blue")
        Color6.GREEN -> print("Color is Green")
    }

    /*
        output : Color is Red
    */
}

enum class Color6(val value: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}