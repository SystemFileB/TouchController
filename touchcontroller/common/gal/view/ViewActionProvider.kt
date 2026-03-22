/*
 * SPDX-License-Identifier: LGPL-3.0-or-later
 * Copyright (C) 2026 fifth_light
 */

package top.fifthlight.touchcontroller.common.gal.view

import top.fifthlight.mergetools.api.ExpectFactory

interface ViewActionProvider {
    fun getCrosshairTarget(): CrosshairTarget?
    fun getCurrentBreakingProgress(): Float

    @ExpectFactory
    interface Factory {
        fun of(): ViewActionProvider
    }
}
