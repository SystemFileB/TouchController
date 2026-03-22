/*
 * SPDX-License-Identifier: LGPL-3.0-or-later
 * Copyright (C) 2026 fifth_light
 */

package top.fifthlight.touchcontroller.common.platform.ios

object Transport {
    @JvmStatic
    private external fun init()
    @JvmStatic
    external fun new(path: String): Long
    @JvmStatic
    external fun receive(handle: Long, buffer: ByteArray): Int
    @JvmStatic
    external fun send(handle: Long, buffer: ByteArray, off: Int, len: Int)
    @JvmStatic
    external fun destroy(handle: Long)

    init {
        // TODO: deal with NeoForge
        init()
    }
}
