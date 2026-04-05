/*
 * SPDX-License-Identifier: Apache-2.0
 * Copyright (C) 2026 fifth_light
 */

package top.fifthlight.touchcontroller.api.v1;

import org.jetbrains.annotations.ApiStatus;
import org.jspecify.annotations.Nullable;
import top.fifthlight.touchcontroller.api.v1.action.GameAction;
import top.fifthlight.touchcontroller.api.v1.action.GameActionInstance;
import top.fifthlight.touchcontroller.api.v1.action.PlayerAction;
import top.fifthlight.touchcontroller.api.v1.action.PlayerActionInstance;
import top.fifthlight.touchcontroller.api.v1.text.Text;
import top.fifthlight.touchcontroller.api.v1.text.TextFactory;
import top.fifthlight.touchcontroller.api.v1.widget.*;

import java.util.function.Consumer;

@ApiStatus.NonExtendable
public interface TouchControllerApi {
    @Nullable
    static TouchControllerApi getInstance() {
        return TouchControllerApiHolder.INSTANCE;
    }

    TextFactory getTextFactory();

    GameActionInstance registerGameAction(String id, Text name, GameAction action);

    PlayerActionInstance registerPlayerAction(String id, Text name, PlayerAction action);

    BuiltInWidgetTextureProvider getBuiltInWidgetTextureProvider();

    WidgetTexture registerWidgetTexture(Consumer<WidgetTextureBuilder> textureBuilder);

    WidgetTriggerActionProvider getWidgetTriggerActionProvider();

    BuiltInWidget registerBuiltInWidget(Consumer<BuiltInWidgetBuilder> widgetBuilder);

    void registerTopBarWidget(BuiltInWidget widget, boolean defaultAdded);
}
