package com.kaikeventura.kiafaker.json.reader

import com.google.gson.Gson
import java.util.Locale

class JsonReader {

    private val gson = Gson()
    private val locale = Locale.getDefault()

    fun <T> read(clazz: Class<T>): T {
        val json = getJsonText(clazz.simpleName)
        return gson.fromJson(json, clazz)
    }

    private fun getJsonText(clazzName: String): String =
        this::class.java.classLoader.getResource("$locale/${clazzName.lowercase()}.json")?.readText()!!
}
