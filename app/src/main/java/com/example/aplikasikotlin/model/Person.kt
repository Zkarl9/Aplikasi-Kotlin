package com.example.aplikasikotlin.model

class Person(var firstName: String, var lastName:String) {
    var fullName:String = ""
        get() {
            return "$firstName $lastName"
        }
        set(value) {
            val components = value.split(" ")
            firstName = components[0]
            lastName = components[1]
            field = value
        }

}

fun main() {
    val person = Person("John", "Doe")
    println(person.firstName)
    println(person.fullName)

    // merubah nilai fullname
    person.fullName = "Jane Smith"
    println(person.fullName)
}