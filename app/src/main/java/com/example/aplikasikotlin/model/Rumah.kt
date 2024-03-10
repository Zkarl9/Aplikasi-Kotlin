package com.example.aplikasikotlin.model

class House {
    var color: String = "white"
    val numberOfWindows: Int = 2
    val isForSale: Boolean = false

    fun updateColor(newColor: String) {
        this.color = newColor
    }
}

fun main() {
    val myHouse = House()
    println("Rumah saya berjendela ${myHouse.numberOfWindows}")
    println("Rumah saya apakah dijual: ${myHouse.isForSale}")
    println("Rumah saya berwarna ${myHouse.color}")

    // Mengubah nilai color House
    myHouse.updateColor("Blue")
    println("Rumah saya sekarang berwarna ${myHouse.color}")
}