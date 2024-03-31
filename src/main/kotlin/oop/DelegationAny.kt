package com.dicoding.kotlin.oop

import kotlin.reflect.KProperty

class DelegateGenericClass {
    private var value: Any = "Default"

    operator fun getValue(classRef: Any, property: KProperty<*>): Any {
        println("Fungsi ini sama seperti getter untuk properti ${property.name} pada class $classRef")
        return value
    }

    operator fun setValue(classRef: Any, property: KProperty<*>, newValue: Any) {
        println("Nilai ${property.name} dari: $value akan berubah menjadi $newValue")
        value = newValue
    }
}

class Animal4{
    var name: Any by DelegateGenericClass()
    var weight: Any by DelegateGenericClass()
    var age: Any by DelegateGenericClass()
}

fun main(){
    val animal = Animal4()
    animal.name = "Dicoding Kucing"
    animal.weight = 6.2
    animal.age = 1

    println("Nama: ${animal.name}")
    println("Berat: ${animal.weight}")
    println("Umur: ${animal.age} Tahun")
}