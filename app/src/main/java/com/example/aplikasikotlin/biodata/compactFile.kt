package com.example.aplikasikotlin.biodata

import java.util.*    // required import

fun main() {
    speed()  // menggunakan argumen speed default
    speed("lambat")  // argument speed dengan value "slow"
    speed(speed="seperti siput")  // argument speed dengan nama argument dan value
    feedTheFish()  // panggil fungsi feedTheFish
}

// Compact function
fun isTooHot(temperature: Int) = temperature > 30
fun isDirty(dirty: Int) = dirty > 30
fun isSunday(day: String) = day == "Sunday"

// Normal function
fun speed(speed:String = "cepat") {
    println("Berjalan $speed")
}

fun shouldChangeWater (day: String, temperature: Int = 22, dirty: Int = 20): Boolean {
    return when {
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) ->  true
        else -> true
    }
}

fun randomDay() : String {
    val week = arrayOf ("Senin", "Selasa", "Rabu", "Kamis",
        "Jumat", "Sabtu", "Minggu")
    return week[Random().nextInt(week.size)]
}

fun fishFood (day : String) : String {
    var makan = ""
    when (day) {
        "Senin" -> makan = "Sereal"
        "Selasa" -> makan = "pelet"
        "Rabu" -> makan = "Cacing"
        "Kamis" -> makan = "granul"
        "Jumat" -> makan = "Nyamuk"
        "Sabtu" -> makan = "Selada"
        "Minggu" -> makan = "plankton"
    }
    return makan
}

fun feedTheFish() {
    val hari = randomDay()
    val makan = fishFood(hari)
    println ("Hari $hari dan ikan makan $makan")
    println("Change The Water: ${shouldChangeWater(hari)}")
}