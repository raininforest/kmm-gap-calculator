package com.github.raininforest.gapcalculatorkmm.data

internal class AndroidInputRepository : InputRepository {
    override var storageManager: StorageManager? = null

    override val inputParameters: List<InputItem>
        get() = TODO("Not yet implemented")

    override fun setInputParameter(key: String, value: String) {
        TODO("Not yet implemented")
    }
}

class AndroidInputRepositoryProvider : InputRepositoryProvider {
    override val inputRepository: InputRepository
        get() = AndroidInputRepository()
}