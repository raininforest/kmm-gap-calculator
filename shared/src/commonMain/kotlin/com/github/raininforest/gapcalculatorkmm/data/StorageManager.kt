package com.github.raininforest.gapcalculatorkmm.data

interface StorageManager {
    fun write(key: String, value: String)
    fun readAll(): Map<String, String>
}