package com.dicoding.kotlin.KotlinGenerics

interface Comparable<in T> {
    operator fun compareTo(other: T): Int
}