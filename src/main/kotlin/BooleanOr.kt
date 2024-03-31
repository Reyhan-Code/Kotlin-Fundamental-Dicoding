package com.dicoding.kotlin

fun main() {
    val officeOpen = 7
    val officeClosed = 19
    val now = 20

    val isClose = now < officeOpen || now > officeClosed

    print("Office is closed : $isClose")

}