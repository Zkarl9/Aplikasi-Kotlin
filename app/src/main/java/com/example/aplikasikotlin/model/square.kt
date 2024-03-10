package com.example.aplikasikotlin.model

class Square(val side: Int) {
    init {
        println(side * 2)
    }
}

fun main() {
    val s = Square(5)
}