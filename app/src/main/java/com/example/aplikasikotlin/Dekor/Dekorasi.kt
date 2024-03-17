package com.example.aplikasikotlin.Dekor

// Codelab 3 (step 8): Membuat data class dan destructuring variable
data class Decoration(val rocks: String) {
}

data class Decoration2(val rocks: String, val wood: String, val diver: String){
}

// Codelab 3 (step 9): Membuat enum class
enum class Color(val rgb: Int) {
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF);
}


fun makeDecorations() {
    val decoration1 = Decoration("granite")
    println(decoration1)

    val decoration2 = Decoration("slate")
    println(decoration2)

    val decoration3 = Decoration("slate")
    println(decoration3)

    println (decoration1.equals(decoration2))
    println (decoration3.equals(decoration2))

    // Destructuring Variable Kotlin
    println("----------------------") // Garis batas
    val d5 = Decoration2("crystal", "wood", "diver")
    println(d5)

    // Assign all properties to variables.
    val (rock, wood, diver) = d5
    println(rock)
    println(wood)
    println(diver)

    // Pemanggilan properti enum
    println("----------------------") // Garis batas
    println("color 1 : ${Color.RED.name} (HEX : ${Color.RED.rgb})")
    println("color 2 : ${Color.GREEN.name} (HEX : ${Color.GREEN.rgb})")
    println("color 3 : ${Color.BLUE.name} (HEX : ${Color.BLUE.rgb})")
}

fun main() {
    makeDecorations()
}