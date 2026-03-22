/*
 * SPDX-License-Identifier: LGPL-3.0-or-later
 * Copyright (C) 2026 fifth_light
 */

package top.fifthlight.touchcontroller.common.control

import kotlinx.serialization.KSerializer
import top.fifthlight.mergetools.api.ExpectFactory

interface ControllerWidgetSerializerProvider : KSerializer<ControllerWidget> {
    @ExpectFactory
    interface Factory {
        fun of(): ControllerWidgetSerializerProvider
    }

    companion object : KSerializer<ControllerWidget> by ControllerWidgetSerializerProviderFactory.of()
}
