package com.example.aplikasikotlin.biodata

fun main() {
    val decorations = listOf("batu", "bingksi foto", "tanaman plastik", "aquarium", "pot bunga")

    // eager, creates a new list
    val eager = decorations.filter { it[0] == 'p' }
    println("eager: $eager")

    // lazy, will wait until asked to evaluate
    val filtered = decorations.asSequence().filter { it[0] == 'p' }
    println("filtered: $filtered")

    // force evaluation of the lazy list
    val newList = filtered.toList()
    println("daftar baru: $newList")

    // Garis pembatas
    println("======================================================")
    println()

    // Fungsi lazymap menggunakan fungsi map
    val lazyMap = decorations.asSequence().map {
        println("akses: $it")
        it
    }

    println("lazy: $lazyMap")
    println("-----")
    println("Pertama: ${lazyMap.first()}")
    println("-----")
    println("Semua: ${lazyMap.toList()}")

    // Garis pembatas
    println("======================================================")
    println()

    // sama seperti fungsi lazyMap sebelumnya, tetapi menambahkan fungsi filter
    val lazyMap2 = decorations.asSequence().filter { it[0] == 'p' }.map {
        println("akses: $it")
        it
    }
    println("-----")
    println("filtered: ${lazyMap2.toList()}")

    // Garis pembatas
    println("======================================================")
    println()

    // Fungsi flatten
    val mysports = listOf("Sepak Bola", "Voli", "Lari")
    val myplayers = listOf("Cristiano Ronaldo", "Maxim Mikhaylov", "Usain Bolt")
    val mycities = listOf("Lisbon", "Yaroslavich", "Jamaica")
    val mylist = listOf(mysports, myplayers, mycities)  // list of lists
    println("-----")
    println("Flat: ${mylist.flatten()}")
}