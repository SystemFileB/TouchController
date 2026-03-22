/*
 * SPDX-License-Identifier: LGPL-3.0-or-later
 * Copyright (C) 2026 fifth_light
 */

package top.fifthlight.touchcontroller.common.config

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import top.fifthlight.touchcontroller.common.config.preset.builtin.key.BuiltinPresetKey

@Serializable
sealed class PresetConfig {
    @Serializable
    @SerialName("builtin")
    data class BuiltIn(
        val key: BuiltinPresetKey = BuiltinPresetKey(),
    ) : PresetConfig()

    @Serializable
    @SerialName("custom")
    data class Custom(
        val uuid: kotlin.uuid.Uuid? = null,
    ) : PresetConfig()
}
