package com.github.raininforest.gapcalculatorkmm.data

import com.github.raininforest.gapcalculatorkmm.uuid.randomUUID

data class InputItem(
    val id: String = randomUUID(),
    val label: String,
    val icon: String,
    val initialValue: String
)