/*
 * SPDX-License-Identifier: Apache-2.0
 * Copyright (C) 2026 fifth_light
 */

package top.fifthlight.touchcontroller.api.v1;

import org.jspecify.annotations.Nullable;

import java.util.Iterator;
import java.util.ServiceLoader;

@SuppressWarnings("RedundantExplicitVariableType")
class TouchControllerApiHolder {
    static final @Nullable TouchControllerApi INSTANCE;

    static {
        ServiceLoader<TouchControllerApi> loader = ServiceLoader.load(TouchControllerApi.class);
        Iterator<TouchControllerApi> iterator = loader.iterator();
        if (iterator.hasNext()) {
            INSTANCE = iterator.next();
        } else {
            INSTANCE = null;
        }
    }
}
