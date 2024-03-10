package com.example.aplikasikotlin.model
class Book(judul: String, pengarang: String, harga: Int, kategori: String, penerbit: String = "PT Sabak Grip Nusantara") {
    var judul: String = judul
    var pengarang: String = pengarang
    var penerbit: String = penerbit
    var harga: Int = harga
    var kategori: String = kategori

    fun cetakBuku() {
        println("==========================")
        println("     Informasi Buku       ")
        println("==========================")
        println("Judul buku: $judul")
        println("Ditulis oleh: $pengarang")
        println("Penerbit: $penerbit")
        println("Harga: $harga")
    }

    fun gantiJudul(newJudul: String) {
        println("Judul buku lama: ${this.judul}")
        println("Judul buku baru: $newJudul")
        println("---------------------------\n")
    }

    fun updateHarga(newHarga: Int) {
        println("Harga buku sekarang berubah menjadi $newHarga")
        println("Harga lama: ${this.harga}")
        println("---------------------------\n")
    }
}

fun main() {
    val buku1 = Book("Hello", "Tere Liye",55000, "Novel")
    buku1.cetakBuku()
    buku1.gantiJudul("Si Anak Badai")
    buku1.updateHarga(40000)
    buku1.cetakBuku()
}