/*
 * SPDX-License-Identifier: LGPL-3.0-or-later
 * Copyright (C) 2026 fifth_light
 */

package top.fifthlight.touchcontroller.common.config.platform

import kotlinx.coroutines.flow.StateFlow
import top.fifthlight.mergetools.api.ExpectFactory

interface PlatformConfigProvider {
    val platformConfig: StateFlow<PlatformConfig>

    @ExpectFactory
    interface Factory {
        fun of(): PlatformConfigProvider
    }

    companion object : PlatformConfigProvider by PlatformConfigProviderFactory.of()
}
