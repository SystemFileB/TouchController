/*
 * SPDX-License-Identifier: LGPL-3.0-or-later
 * Copyright (C) 2026 fifth_light
 */

package top.fifthlight.touchcontroller.common.about

import top.fifthlight.mergetools.api.ExpectFactory

interface AboutInfoProvider {
    val aboutInfo: AboutInfo

    @ExpectFactory
    interface Factory {
        fun of(): AboutInfoProvider
    }

    companion object : AboutInfoProvider by AboutInfoProviderFactory.of()
}
