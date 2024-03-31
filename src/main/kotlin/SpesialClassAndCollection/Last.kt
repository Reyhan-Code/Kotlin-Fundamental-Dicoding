package com.dicoding.kotlin.SpesialClassAndCollection


fun main(args: Array<String>) {
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val moreThan10 = numberList.last { it < 4 }
    print(moreThan10)


}