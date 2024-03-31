package com.dicoding.kotlin.SpesialClassAndCollection

fun main() {
    val color : Color = Color.BLUE
    val color2 : Color2 = Color2.GREEN




    println(color)
    println(color2)


    val color3: Array<Color2> = Color2.values()
    color3.forEach { color ->
        print("$color ")
    }
}


enum class Color{
    RED, GREEN, BLUE
}

enum class Color2(val value: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}