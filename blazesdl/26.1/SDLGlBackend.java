/*
 * SPDX-License-Identifier: LGPL-3.0-or-later
 * Copyright (C) 2026 fifth_light
 */

package top.fifthlight.blazesdl;

import com.mojang.blaze3d.opengl.GlBackend;
import com.mojang.blaze3d.shaders.GpuDebugOptions;
import com.mojang.blaze3d.shaders.ShaderSource;
import com.mojang.blaze3d.systems.BackendCreationException;
import com.mojang.blaze3d.systems.GpuDevice;
import org.jspecify.annotations.NonNull;
import org.lwjgl.sdl.SDLVideo;
import org.spongepowered.asm.mixin.Unique;

public class SDLGlBackend extends GlBackend {
    @Unique
    public static BackendCreationException handleError(String func) {
        var error = org.lwjgl.sdl.SDLError.SDL_GetError();
        if (error != null) {
            return new BackendCreationException("Function " + func + " failed with cause: " + error);
        } else {
            return new BackendCreationException("Function " + func + " failed with no cause");
        }
    }

    @Override
    public void setWindowHints() {
        // 设置 OpenGL 主版本和次版本（所有平台均需要）
        SDLVideo.SDL_GL_SetAttribute(SDLVideo.SDL_GL_CONTEXT_MAJOR_VERSION, VERSION_MAJOR);
        SDLVideo.SDL_GL_SetAttribute(SDLVideo.SDL_GL_CONTEXT_MINOR_VERSION, VERSION_MINOR);
    
        // Wayland 下的 EGL 可能不支持 CORE PROFILE 和 FORWARD_COMPATIBLE 标志
        if (!SDLUtil.IS_WAYLAND) {
            SDLVideo.SDL_GL_SetAttribute(SDLVideo.SDL_GL_CONTEXT_PROFILE_MASK, SDLVideo.SDL_GL_CONTEXT_PROFILE_CORE);
            SDLVideo.SDL_GL_SetAttribute(SDLVideo.SDL_GL_CONTEXT_FLAGS, SDLVideo.SDL_GL_CONTEXT_FORWARD_COMPATIBLE_FLAG);
        }
        // 对于 Wayland，仅设置版本，不设置 profile 和 flags
    }

    @Override
    public @NonNull GpuDevice createDevice(long window, @NonNull ShaderSource defaultShaderSource, @NonNull GpuDebugOptions debugOptions) {
        var context = SDLVideo.SDL_GL_CreateContext(window);
        if (context == 0L) {
            SDLUtil.throwAny(handleError("SDL_GL_CreateContext"));
        }

        if (!SDLVideo.SDL_GL_MakeCurrent(window, context)) {
            throw SDLError.handleError("SDL_GL_MakeCurrent");
        }

        return new GpuDevice(new SDLGlDevice(window, context, defaultShaderSource, debugOptions));
    }
}
