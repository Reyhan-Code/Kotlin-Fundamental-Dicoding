package com.dicoding.kotlin

fun main() {
    for (i in 10 until 12) {
        print("$i ")
    }

    println(loopExpression())
}


//Selain itu, kita juga dapat menuliskan For loop menggunakan range expression seperti berikut.
fun loopExpression() {
    val ranges = 1.rangeTo(10) step 3 //lompat 3 step midal ([1],2,3,[4],5,6,[7],8,9,[10])
    for (i in ranges ){
        println("LoopExpression value is $i!")
    }
}