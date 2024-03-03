package com.example.aplikasikotlin.biodata

fun main() {
    val waterFilter: (Int) -> Int = { dirty -> dirty / 3 }
    println(updateDirty(45, waterFilter)) //  lambda waterfilter digunakan sebagai argument
    println(updateDirty(30, ::increaseDirty)) // tanda :: melempar fungsi lain sebagai argument

    var dirtyLevel = 25
    dirtyLevel = updateDirty(dirtyLevel) { dirtyLevel -> dirtyLevel + 27} // last parameter call syntax
    println(dirtyLevel)

}

// High Order Function
// Argument1 : dirty dengan tipe data Int
// Argument2 : fungsi lambda operation dengan tipe data Int dan mengeluarkan output Int
fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
    return operation(dirty)
}

// Compact function
fun increaseDirty( start: Int)=start+5