package com.example.aplikasikotlin.biodata

fun main() {
    var dirtyLevel = 30
    val waterFilter: (Int) -> Int = { dirty -> dirty / 2 }
    println(waterFilter(dirtyLevel))
}