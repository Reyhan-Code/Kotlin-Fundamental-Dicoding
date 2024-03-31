package com.dicoding.kotlin.SpesialClassAndCollection


data class Item(val key: String, val value: Any)

fun main(args: Array<String>) {
    val items = listOf(
        Item("1", "Kotlin"),
        Item("2", "is"),
        Item("3", "Awesome"),
        Item("3", "as"),
        Item("3", "Programming"),
        Item("4", "Language")
    )

    val distinctItems = items.distinctBy { it.key }
    distinctItems.forEach {
        println("${it.key} with value ${it.value}")
    }

    /*
    output:
        1 with value Kotlin
        2 with value is
        3 with value Awesome
    */
}