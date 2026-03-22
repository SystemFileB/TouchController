/*
 * SPDX-License-Identifier: LGPL-3.0-or-later
 * Copyright (C) 2026 fifth_light
 */

package top.fifthlight.touchcontroller.common.gal.view

import top.fifthlight.touchcontroller.common.gal.entity.EntityType

sealed interface CrosshairTarget {
    data object Block : CrosshairTarget
    data object Miss : CrosshairTarget
    data class Entity(
        val entityType: EntityType,
    ) : CrosshairTarget
}
