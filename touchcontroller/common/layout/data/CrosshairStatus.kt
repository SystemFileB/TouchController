/*
 * SPDX-License-Identifier: LGPL-3.0-or-later
 * Copyright (C) 2026 fifth_light
 */

package top.fifthlight.touchcontroller.common.layout.data

data class CrosshairStatus(
    val position: top.fifthlight.data.Offset,
    val breakPercent: Float,
) {
    val positionX
        get() = position.x

    val positionY
        get() = position.y
}
