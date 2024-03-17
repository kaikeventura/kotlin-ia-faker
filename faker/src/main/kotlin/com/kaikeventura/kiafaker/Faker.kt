package com.kaikeventura.kiafaker

fun interface Faker<T> {
    fun load(): T
}
