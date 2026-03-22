/*
 * SPDX-License-Identifier: LGPL-3.0-or-later
 * Copyright (C) 2026 fifth_light
 */

package top.fifthlight.touchcontroller.common.gal.library

import top.fifthlight.mergetools.api.ExpectFactory
import java.io.InputStream
import java.nio.file.Path

interface NativeLibraryPathGetter {
    fun getNativeLibraryPath(path: String): InputStream?

    @ExpectFactory
    interface Factory {
        fun of(): NativeLibraryPathGetter
    }
}
