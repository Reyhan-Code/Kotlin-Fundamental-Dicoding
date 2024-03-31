package com.dicoding.kotlin.KotlinFunctionalPrograming

//fun main() {
//    val numbers = 1.rangeTo(10)
//    val evenNumbers = numbers.filter(::isEvenNumber)
//
//    println(evenNumbers)
//}
//
///*
//   output = [2, 4, 6, 8, 10]
//*/
//
//fun isEvenNumber(number: Int) = number % 2 == 0

fun main() {
    val numbers = 1.rangeTo(10)
    val evenNumbers = numbers.filter(Int::isEvenNumber)

    println(evenNumbers)
}

fun Int.isEvenNumber() = this % 2 == 0

/*
   output = [2, 4, 6, 8, 10]
*/