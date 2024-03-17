package com.kaikeventura.kiafaker

import com.kaikeventura.kiafaker.json.JsonFaker

class PlaceFaker : IFaker<Place>, JsonFaker() {
    override fun load(): Place = read(Place::class.java)
}

class Place(
    private val city: Set<String>
) {
    fun city(): String = city.random()
}
