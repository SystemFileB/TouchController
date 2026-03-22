/*
 * SPDX-License-Identifier: LGPL-3.0-or-later
 * Copyright (C) 2026 fifth_light
 */

package top.fifthlight.touchcontroller.common.layout.data

class ContextTimer {
    var clientTick: Int = 0
        private set
    var renderTick: Int = 0
        private set

    fun clientTick() {
        clientTick++
    }

    fun renderTick() {
        renderTick++
    }
}
