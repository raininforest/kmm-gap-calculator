package com.github.raininforest.gapcalculatorkmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform