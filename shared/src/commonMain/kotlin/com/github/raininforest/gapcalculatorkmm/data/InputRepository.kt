package com.github.raininforest.gapcalculatorkmm.data

interface InputRepository {
    var storageManager: StorageManager?

    val inputParameters: List<InputItem>
    fun setInputParameter(key: String, value: String)
}
