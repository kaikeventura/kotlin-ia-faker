package com.kaikeventura.kiafaker.json

import com.kaikeventura.kiafaker.json.reader.JsonReader

abstract class JsonFaker {
    internal fun <T> read(clazz: Class<T>): T = JsonReader().read(clazz)
}
