/*
 * SPDX-License-Identifier: LGPL-3.0-or-later
 * Copyright (C) 2026 fifth_light
 */

package top.fifthlight.touchcontroller.common.serialization

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json

@OptIn(ExperimentalSerializationApi::class)
val jsonFormat = Json {
    encodeDefaults = false
    ignoreUnknownKeys = true
    allowTrailingComma = true
    prettyPrint = true
    prettyPrintIndent = "  "
    isLenient = true
}
