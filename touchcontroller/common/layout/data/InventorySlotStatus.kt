/*
 * SPDX-License-Identifier: LGPL-3.0-or-later
 * Copyright (C) 2026 fifth_light
 */

package top.fifthlight.touchcontroller.common.layout.data

data class InventorySlotStatus(
    var progress: Float = 0f,
    var drop: Boolean = false,
    var select: Boolean = false,
)
