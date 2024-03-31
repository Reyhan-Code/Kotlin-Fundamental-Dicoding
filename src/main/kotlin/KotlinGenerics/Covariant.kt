package com.dicoding.kotlin.KotlinGenerics

interface List2<out E> : Collection<E> {
    operator fun get(index: Int): E
}