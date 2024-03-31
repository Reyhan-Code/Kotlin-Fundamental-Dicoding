package com.dicoding.kotlin.KotlinFunctionalPrograming

//fun setWord(message: String) {
//    fun printMessage(text: String) {
//        println(text)
//    }
//
//    printMessage(message)
//}

fun setWord(message: String) {
    fun printMessage() {
        println(message)
    }

    printMessage()
}



//fun sum(valueA: Int, valueB: Int, valueC: Int): Int {
//    if (valueA == 0) {
//        throw IllegalArgumentException("valueA must be better than 0")
//    }
//
//    if (valueB == 0) {
//        throw IllegalArgumentException("valueB must be better than 0")
//    }
//
//    if (valueC == 0) {
//        throw IllegalArgumentException("valueC must be better than 0")
//    }
//
//    return valueA + valueB + valueC
//}


//Di sinilah kita bisa memanfaatkan inner function untuk membuat kode yang ditulis berulang tersebut menjadi fungsi tersendiri.

fun sum(valueA: Int, valueB: Int, valueC: Int): Int {
    fun Int.validateNumber(){
        if (this == 0) {
            throw IllegalArgumentException("value must be better than 0")
        }
    }

    valueA.validateNumber()
    valueB.validateNumber()
    valueC.validateNumber()

    return valueA + valueB + valueC
}

fun main(){
   println(sum(10,10,2))
    setWord("Hallo reyhan")
}