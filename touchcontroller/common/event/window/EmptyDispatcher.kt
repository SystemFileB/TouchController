/*
 * SPDX-License-Identifier: LGPL-3.0-or-later
 * Copyright (C) 2026 fifth_light
 */

package top.fifthlight.touchcontroller.common.event.window

internal class EmptyDispatcher : MainThreadDispatcher {
    override fun execute(command: Runnable) = command.run()
}
