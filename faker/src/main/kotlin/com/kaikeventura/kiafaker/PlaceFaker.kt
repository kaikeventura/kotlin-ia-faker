package com.kaikeventura.kiafaker

import com.kaikeventura.kiafaker.json.JsonFaker

class PlaceFaker : Faker<Place>, JsonFaker() {
    override fun load(): Place = read(Place::class.java)
}

data class Place(
    val city: Set<String>
)
