package com.dicoding.kotlin.SpesialClassAndCollection

fun main() {
    val colors: Array<Color5> = enumValues()
    colors.forEach {color ->
        println(color)
    }

    val color: Color = enumValueOf("RED")
    println("Color is $color")


    val color1: Color5 = Color5.GREEN

    print("Position GREEN di index ke ${color1.ordinal}")
    /*
        output :
            RED
            GREEN
            BLUE
            Color is RED
    */
}

enum class Color5(val value: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}