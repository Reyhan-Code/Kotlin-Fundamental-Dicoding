package com.dicoding.kotlin.KotlinGenerics

//open class Binatang
//class Kucing : Binatang
//
//class Kandang<out T : Binatang>(private val hewan: T) {
//    fun dapatkanHewan(): T {
//        return hewan
//    }
//}
//
//val kandangKucing: Kandang<Kucing> = Kandang(Kucing())
//val kandangBinatang: Kandang<Binatang> = kandangKucing // Covariant, dapat di-substitute
//

//
//open class Binatang
//class Kucing : Binatang
//
//class PenjagaKandang<in T : Binatang> {
//    fun urusKandang(hewan: T) {
//        // Melakukan sesuatu dengan kandang yang berisi hewan
//    }
//}
//
//val penjagaBinatang: PenjagaKandang<Binatang> = PenjagaKandang<Binatang>()
//val penjagaKucing: PenjagaKandang<Kucing> = penjagaBinatang // Contravariant, dapat di-substitute