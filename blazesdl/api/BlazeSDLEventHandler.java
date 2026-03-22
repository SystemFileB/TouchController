/*
 * SPDX-License-Identifier: Apache-2.0
 * Copyright (C) 2026 fifth_light
 */

package top.fifthlight.blazesdl.api;

import org.jspecify.annotations.NonNull;
import org.lwjgl.sdl.SDL_Event;

public interface BlazeSDLEventHandler {
    int getPriority();

    boolean handleEvent(@NonNull SDL_Event event);
}
