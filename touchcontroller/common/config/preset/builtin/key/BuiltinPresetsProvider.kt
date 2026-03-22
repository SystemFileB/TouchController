/*
 * SPDX-License-Identifier: LGPL-3.0-or-later
 * Copyright (C) 2026 fifth_light
 */

package top.fifthlight.touchcontroller.common.config.preset.builtin.key

import top.fifthlight.mergetools.api.ExpectFactory
import top.fifthlight.touchcontroller.common.config.preset.LayoutPreset

interface BuiltinPresetsProvider {
    fun generate(key: BuiltinPresetKey): LayoutPreset

    @ExpectFactory
    interface Factory {
        fun of(): BuiltinPresetsProvider
    }

    companion object : BuiltinPresetsProvider by BuiltinPresetsProviderFactory.of()
}
