package com.github.raininforest.gapcalculatorkmm.data

internal class IOSInputRepository : InputRepository {
    override var storageManager: StorageManager? = null

    override val inputParameters: List<InputItem>
        get() = storageManager?.readAll()?.map {
            it.toInputItem()
        }.orEmpty()

    override fun setInputParameter(key: String, value: String) {
        storageManager?.write(key, value)
    }
}

private fun <K, V> Map.Entry<K, V>.toInputItem(): InputItem {
    TODO()
}

class IOSInputRepositoryProvider : InputRepositoryProvider {
    override val inputRepository: InputRepository
        get() = IOSInputRepository()
}