package com.kaikeventura.kiafaker

class Faker {
    fun human(): Human = HumanFaker().load()
    fun place(): Place = PlaceFaker().load()
}
