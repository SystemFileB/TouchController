/*
 * SPDX-License-Identifier: LGPL-3.0-or-later
 * Copyright (C) 2026 fifth_light
 */

package top.fifthlight.touchcontroller.common.gal.config

import top.fifthlight.mergetools.api.ExpectFactory
import java.nio.file.Path

interface ConfigDirectoryProvider {
    val configDirectory: Path

    @ExpectFactory
    interface Factory {
        fun of(): ConfigDirectoryProvider
    }
}
