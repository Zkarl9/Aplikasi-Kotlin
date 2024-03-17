package com.example.aplikasikotlin

import com.example.aplikasikotlin.model.Aquarium
import com.example.aplikasikotlin.model.Plecostomus
import com.example.aplikasikotlin.model.Shark
import com.example.aplikasikotlin.model.TowerTank

fun buildAquarium() {
    val myAquarium = Aquarium(width = 25, length = 25, height = 40)
    myAquarium.printSize()
    val myTower = TowerTank(diameter = 25, height = 40)
    myTower.printSize()
}

fun makeFish() {
    val shark = Shark()
    val pleco = Plecostomus()

    println("Shark: ${shark.color}")
    shark.eat()
    println("Plecostomus: ${pleco.color}")
    pleco.eat()

}


// ------ Arsip Codelab 3 latihan sebelumnya ------
//fun buildAquarium() {
//    val myAquarium = Aquarium()
//    myAquarium.printSize()
//    myAquarium.height = 60
//    myAquarium.printSize()
//
//    val aquarium1 = Aquarium()
//    aquarium1.printSize()
//
//    // default height and length
//    val aquarium2 = Aquarium(width = 25)
//    aquarium2.printSize()
//
//    // default width
//    val aquarium3 = Aquarium(height = 35, length = 110)
//    aquarium3.printSize()
//
//    // everything custom
//    val aquarium4 = Aquarium(width = 25, height = 35, length = 110)
//    aquarium4.printSize()
//
//    val aquarium6 = Aquarium(numberOfFish = 29)
//    aquarium6.printSize()
//    aquarium6.volume = 70
//    aquarium6.printSize()
//
//}

fun main() {
    // Codelab 3: Latihan 5
    // buildAquarium()

    // Codelab 3 : Latihan 6
    makeFish()
}

