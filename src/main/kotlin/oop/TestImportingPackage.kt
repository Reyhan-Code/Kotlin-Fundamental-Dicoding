package com.dicoding.kotlin.oop


import com.dicoding.kotlin.oop.ImportingPackage.*

/*
Dengan memanggil fungsi areaOfCircle(), kita menggunakan seluruh
fungsi dan variabel yang berada pada package com.dicoding.oop
sehingga import package cukup dilakukan dengan tanda bintang (*).
 */

fun main() {
    sayHello()
    println(factorial(4.0))
    println(pow(3.0, 2.0))
    println(PI)
    println(areaOfCircle(13.0))
}

/*
output:
    Hello From package com.dicoding.oop.utils
    24.0
    9.0
    3.1415926535
    81.681408991

*/