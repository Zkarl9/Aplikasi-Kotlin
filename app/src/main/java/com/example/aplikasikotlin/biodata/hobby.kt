package com.example.aplikasikotlin.biodata

fun main(args: Array<String>) {
    biodata("Haikal Azzrial Akbar", "hal hal yang memiliki rasa asin")
    hobby("Game", "Saya suka bermain Mobile Legend kalau belum immortal belum istirahat")
}

fun biodata(nama: String, makananKesukaan: String, kelas: String = "2A") {
    println("""
        ------------------------------------------------------------------
        =                             Hello                              =
        ------------------------------------------------------------------
        Nama saya $nama. Saya sekarang kuliah di Politeknik Negeri Madiun
        kelas $kelas. Makanan Favorit saya adalah $makananKesukaan
    """.trimIndent())
    print("\n")
}

fun hobby(nama: String, deskripsi: String) {
    println("""
        =================================================================
        |                              Hobi                             |
        =================================================================
        Hobi        : $nama
        Deskripsi   : $deskripsi
    """.trimIndent())
}