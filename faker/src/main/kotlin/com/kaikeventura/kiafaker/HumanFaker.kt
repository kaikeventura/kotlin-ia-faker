package com.kaikeventura.kiafaker

import com.kaikeventura.kiafaker.json.JsonFaker

class HumanFaker : IFaker<Human>, JsonFaker() {
    override fun load(): Human = read(Human::class.java)
}

class Human(
    private val firstname: Set<String>,
    private val lastname: Set<String>
) {
    fun firstname(): String = firstname.random()
    fun lastname(): String = lastname.random()
}
