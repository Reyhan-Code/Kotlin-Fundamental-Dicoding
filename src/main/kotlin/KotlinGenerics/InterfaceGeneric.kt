package com.dicoding.kotlin.KotlinGenerics

fun main() {
    val longArrayList = ArrayList<Long>()
    val firstLong = longArrayList.get(1)

    println(firstLong)
}

class ArrayList<T> : List<T> {
    override fun get(index: Int): T {
        return this[index]
    }
}

interface List<P> {
    operator fun get(index: Int): P
}