package com.github.raininforest.gapcalculatorkmm.uuid

import platform.Foundation.NSUUID

internal actual fun randomUUID(): String = NSUUID().UUIDString()