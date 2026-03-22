/*
 * SPDX-License-Identifier: Apache-2.0
 * Copyright (C) 2026 fifth_light
 */

package top.fifthlight.touchcontroller.api.v1.text;

import org.jetbrains.annotations.ApiStatus;

@ApiStatus.NonExtendable
public interface TextFactory {
    Text literal(String text);
    Text translatable(String id);
    Text format(String id, Object... args);
}
