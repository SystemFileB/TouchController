/*
 * SPDX-License-Identifier: LGPL-3.0-or-later
 * Copyright (C) 2026 fifth_light
 */

package top.fifthlight.touchcontroller.common.gal.item

import kotlinx.collections.immutable.PersistentList
import top.fifthlight.combine.item.data.Item
import top.fifthlight.mergetools.api.ExpectFactory

interface ItemProvider {
    val allItems: PersistentList<Item>

    @ExpectFactory
    interface Factory {
        fun of(): ItemProvider
    }
}
