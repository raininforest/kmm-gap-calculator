package com.github.raininforest.gapcalculatorkmm.data

interface InputRepository {
    val inputParameters: List<InputItem>
    fun setInputParameter(key: String, value: String)
}

private class InputRepositoryImpl(private val storageManager: StorageManager) : InputRepository {
    override val inputParameters: List<InputItem>
        get() = listOf(InputItem(label = "Гэп", icon = "", initialValue = "2"))
            //storageManager.readAll().map { it.toInputItem() }

    override fun setInputParameter(key: String, value: String) = storageManager.write(key, value) ?: Unit

    private fun Map.Entry<String, String>.toInputItem(): InputItem =
        when (this.key) {
            //TODO
            else -> InputItem(label = "", icon = "", initialValue = "")
        }
}

object InputRepositoryProvider {
    fun getInputRepository(storageManager: StorageManager): InputRepository =
        InputRepositoryImpl(storageManager)
}
