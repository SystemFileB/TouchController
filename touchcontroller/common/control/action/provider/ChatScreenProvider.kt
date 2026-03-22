/*
 * SPDX-License-Identifier: LGPL-3.0-or-later
 * Copyright (C) 2026 fifth_light
 */

package top.fifthlight.touchcontroller.common.control.action.provider

import top.fifthlight.mergetools.api.ExpectFactory

interface ChatScreenProvider {
    fun openChatScreen()

    @ExpectFactory
    interface Factory {
        fun of(): ChatScreenProvider
    }

    companion object : ChatScreenProvider by ChatScreenProviderFactory.of()
}
