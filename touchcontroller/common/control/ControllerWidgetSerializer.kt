/*
 * SPDX-License-Identifier: LGPL-3.0-or-later
 * Copyright (C) 2026 fifth_light
 */

package top.fifthlight.touchcontroller.common.control

import kotlinx.serialization.KSerializer

class ControllerWidgetSerializer : KSerializer<ControllerWidget> by ControllerWidgetSerializerProvider
