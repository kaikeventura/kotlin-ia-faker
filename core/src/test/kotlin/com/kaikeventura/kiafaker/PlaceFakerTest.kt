package com.kaikeventura.kiafaker

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertNotNull
import kotlin.test.assertNotSame

class PlaceFakerTest {

    private lateinit var faker: Faker

    @BeforeEach
    fun setup() {
        faker = Faker()
    }

    @Test
    fun `it should create a city`() {
        val city = faker.place().city()
        assertNotNull(city)
        assertNotSame("", city)
    }
}
