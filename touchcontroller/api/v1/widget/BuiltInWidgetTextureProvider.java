package top.fifthlight.touchcontroller.api.v1.widget;

import org.jetbrains.annotations.ApiStatus;

@ApiStatus.NonExtendable
public interface BuiltInWidgetTextureProvider {
    enum Texture {
        EMOTE,
    }

    WidgetTexture getTexture(Texture id);
}
