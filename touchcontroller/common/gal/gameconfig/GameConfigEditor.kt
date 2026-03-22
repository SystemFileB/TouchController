/*
 * SPDX-License-Identifier: LGPL-3.0-or-later
 * Copyright (C) 2026 fifth_light
 */

package top.fifthlight.touchcontroller.common.gal.gameconfig

import top.fifthlight.mergetools.api.ExpectFactory

interface GameConfigEditor {
    interface Editor {
        var autoJump: Boolean
    }

    fun interface Callback {
        fun invoke(editor: Editor)
    }

    fun submit(callback: Callback)

    @ExpectFactory
    interface Factory {
        fun of(): GameConfigEditor
    }
}
