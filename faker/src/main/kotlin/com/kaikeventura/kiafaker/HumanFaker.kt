package com.kaikeventura.kiafaker

import com.kaikeventura.kiafaker.json.JsonFaker

class HumanFaker : Faker<Human>, JsonFaker() {
    override fun load(): Human = read(Human::class.java)
}

data class Human(
    val firstname: Set<String>,
    val lastname: Set<String>
)
