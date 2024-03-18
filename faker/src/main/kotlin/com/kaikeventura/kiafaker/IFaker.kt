package com.kaikeventura.kiafaker

internal fun interface IFaker<T> {
    fun load(): T
}
