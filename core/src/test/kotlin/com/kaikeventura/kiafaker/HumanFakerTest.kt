package com.kaikeventura.kiafaker

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertNotNull
import kotlin.test.assertNotSame

class HumanFakerTest {

    private lateinit var faker: Faker

    @BeforeEach
    fun setup() {
        faker = Faker()
    }

    @Test
    fun `it should create a firstname`() {
        val firstname = faker.human().firstname()
        assertNotNull(firstname)
        assertNotSame("", firstname)
    }

    @Test
    fun `it should create a lastname`() {
        val lastname = faker.human().lastname()
        assertNotNull(lastname)
        assertNotSame("", lastname)
    }
}
