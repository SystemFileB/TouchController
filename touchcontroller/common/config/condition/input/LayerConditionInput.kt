/*
 * SPDX-License-Identifier: LGPL-3.0-or-later
 * Copyright (C) 2026 fifth_light
 */

package top.fifthlight.touchcontroller.common.config.condition.input

import top.fifthlight.combine.item.data.Item
import top.fifthlight.touchcontroller.common.gal.entity.EntityType
import top.fifthlight.touchcontroller.common.gal.view.CrosshairTarget
import kotlin.uuid.Uuid

interface LayerConditionInput {
    val builtinCondition: Set<BuiltinLayerCondition>
    val customCondition: Set<Uuid>
    val crosshairTarget: CrosshairTarget?
    val ridingEntity: EntityType?

    fun holdingItem(item: Item): Boolean
}
