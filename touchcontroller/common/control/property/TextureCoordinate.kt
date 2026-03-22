/*
 * SPDX-License-Identifier: LGPL-3.0-or-later
 * Copyright (C) 2026 fifth_light
 */

package top.fifthlight.touchcontroller.common.control.property

import kotlinx.serialization.Serializable
import top.fifthlight.combine.paint.Texture
import top.fifthlight.touchcontroller.assets.TextureSet

@Serializable
data class TextureCoordinate(
    val textureSet: TextureSet.TextureSetKey = TextureSet.TextureSetKey.CLASSIC,
    val textureItem: TextureSet.TextureKey = TextureSet.TextureKey.Up,
) {
    val texture: Texture
        get() = textureItem.get(textureSet.textureSet)
}
