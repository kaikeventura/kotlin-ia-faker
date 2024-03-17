package com.kaikeventura.kiafaker.reader

import com.google.gson.Gson

class JsonReader {

    private val gson = Gson()

    fun <T> read(clazz: Class<T>): T {
        val json = getJsonText(clazz.simpleName)
        return gson.fromJson(json, clazz)
    }

    private fun getJsonText(clazzName: String): String =
        this::class.java.classLoader.getResource("pt-br/${clazzName.lowercase()}.json")?.readText()!!
}
