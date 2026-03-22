/*
 * SPDX-License-Identifier: Apache-2.0
 * Copyright (C) 2026 fifth_light
 */

package top.fifthlight.touchcontroller.api.v1.widget;

import org.jetbrains.annotations.ApiStatus;
import top.fifthlight.touchcontroller.api.v1.draw.Drawable;

@ApiStatus.NonExtendable
public interface WidgetTextureBuilder {
    WidgetTextureBuilder id(String id);

    WidgetTextureBuilder classic(Drawable drawable);

    WidgetTextureBuilder classicExtension(Drawable drawable);

    WidgetTextureBuilder newStyle(Drawable drawable);

    WidgetTextureBuilder newRegression(Drawable drawable);
}
