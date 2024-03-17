package com.kaikeventura.kiafaker

class Faker {
    fun human(): Human = HumanFaker().load()
    fun place(): Place = PlaceFaker().load()
}

fun main() {
    val faker = Faker()
    val human = faker.human()
    val place = faker.place()

    println("Oi, eu sou ${human.firstname()} ${human.lastname()} e moro em ${place.city()}")
}
