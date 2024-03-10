package com.example.aplikasikotlin.model
class Circle(val radius: Double) {
    constructor(name:String) : this(1.0)
    constructor(diameter:Int) : this(diameter / 2.0) {
        println("in diameter constructor")
    }
    init {
        println("Area: ${Math.PI * radius * radius}")
    }
}

fun main() {
    // menggunakan constructor radius
    val circle1 = Circle(radius = 6.0)

    // menggunakan constructor name
    val circle2 = Circle(name = "Lingkaran 2")

    // menggunakan constructor diameter
    var circle3 = Circle(diameter = 8)
}