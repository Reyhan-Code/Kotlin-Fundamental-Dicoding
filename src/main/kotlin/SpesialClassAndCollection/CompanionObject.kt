package com.dicoding.kotlin.SpesialClassAndCollection

//Berbeda dengan class, Anda tidak dapat membuat inner object
// secara langsung di dalam class. Untuk mengatasinya,
// Anda perlu menambahkan Companion Object seperti berikut.

class Library {
    companion object{
        fun borrowBookById(id: Int) {
            println("Book with $id has been borrowed")
        }
    }
}

//fun main() {
//    Library.Companion.borrowBookById(21)
//    Library.borrowBookById(23)
//
//}


class MyLibrary {
    // Const 'val' are only allowed on top level, in named objects, or in companion objects
    // const val LIBRARY_NAME = "Dicoding Library"

    fun totalBook() {
        print("Total book in $LIBRARY_NAME is unlimited")
    }

    companion object{
        const val LIBRARY_NAME = "Dicoding Library"
    }
}

fun main() {
    val name = MyLibrary.LIBRARY_NAME
}