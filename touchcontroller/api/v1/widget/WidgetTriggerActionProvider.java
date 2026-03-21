package top.fifthlight.touchcontroller.api.v1.widget;

import org.jetbrains.annotations.ApiStatus;
import org.jspecify.annotations.Nullable;
import top.fifthlight.touchcontroller.api.v1.action.GameActionInstance;
import top.fifthlight.touchcontroller.api.v1.action.PlayerActionInstance;

@ApiStatus.NonExtendable
public interface WidgetTriggerActionProvider {
    @Nullable
    WidgetTriggerAction gameAction(GameActionInstance gameAction);

    @Nullable
    WidgetTriggerAction playerAction(PlayerActionInstance playerAction);

    @Nullable
    WidgetTriggerAction click(String keyMapping);

    @Nullable
    WidgetTriggerAction startLock(String keyMapping);

    @Nullable
    WidgetTriggerAction stopLock(String keyMapping);

    @Nullable
    WidgetTriggerAction invertLock(String keyMapping);
}
