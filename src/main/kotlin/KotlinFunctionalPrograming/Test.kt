package com.dicoding.kotlin.KotlinFunctionalPrograming



/**
 *  TODO 1
 *  Sesuaikan fungsi di bawah ini dengan kode untuk mengecek apakah parameter number
 *  merupakan angka genap
 */
fun isEvenNumber(number: Int) : Boolean {
    if (number % 2 == 0) {
        println(" $number adalah angka genap")
        return true
    } else {
        println("$number adalah angka ganjil ")
        return false
    }
}


/**
 *  TODO 2
 *  Sesuaikan fungsi di bawah ini dengan kode untuk mengecek apakah parameter number
 *  lebih dari 5
 */
fun moreThanFive(number: Int) : Boolean{
    if (number > 5){
        println("angka $number Lebih besar dari 5")
        return true
    }else{
        println("angka $number Lebih kecil dari 5")
        return false
    }
}

/**
 *  TODO 3
 *  Sesuaikan fungsi di bawah ini agar dapat menghasilkan nilai akhir dengan
 *  rumus:
 *
 *      param * ( param + 10 )
 */
fun result(number: Int) : Int{
    val angka = number * (number + 10)
    return angka
}

fun main() {
    val listNumber = 1.rangeTo(100)
    for (number in listNumber) {
        if (isEvenNumber(number)) continue

        if (moreThanFive(number)) break

        val result = result(number)
        println("range result is $result")
    }
}