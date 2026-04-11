/*
 * SPDX-License-Identifier: LGPL-3.0-or-later
 * Copyright (C) 2026 fifth_light
 */

package top.fifthlight.touchcontroller.common.gal.itemlist

import top.fifthlight.mergetools.api.ExpectFactory
import top.fifthlight.touchcontroller.common.config.item.ItemList

interface DefaultItemListProvider {
    val usableItems: ItemList
    val showCrosshairItems: ItemList
    val usingAimingItems: ItemList

    @ExpectFactory
    interface Factory {
        fun of(): DefaultItemListProvider
    }

    companion object : DefaultItemListProvider by DefaultItemListProviderFactory.of()
}
