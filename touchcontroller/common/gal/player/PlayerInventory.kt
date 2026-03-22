/*
 * SPDX-License-Identifier: LGPL-3.0-or-later
 * Copyright (C) 2026 fifth_light
 */

package top.fifthlight.touchcontroller.common.gal.player

import kotlinx.collections.immutable.PersistentList
import top.fifthlight.combine.item.data.ItemStack

data class PlayerInventory(
    val main: PersistentList<ItemStack>,
    val armor: PersistentList<ItemStack>,
    val offHand: ItemStack?,
)
