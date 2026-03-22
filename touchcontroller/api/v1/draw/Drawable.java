/*
 * SPDX-License-Identifier: Apache-2.0
 * Copyright (C) 2026 fifth_light
 */

package top.fifthlight.touchcontroller.api.v1.draw;

public interface Drawable {
    /**
     * Get scaled width for this object.
     *
     * @return scaled pixel width for this object.
     */
    int getWidth();

    /**
     * Get scaled height for this object.
     *
     * @return scaled pixel height for this object.
     */
    int getHeight();

    /**
     * Render on specified context.
     *
     * @param context <code>GuiGraphics</code>(Mojmap) / <code>DrawContext</code>(Yarn) instance
     * @param tint    Tint color in ARGB8 format
     */
    void render(Object context, int tint);
}
