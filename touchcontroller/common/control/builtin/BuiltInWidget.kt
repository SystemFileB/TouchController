package top.fifthlight.touchcontroller.common.control.builtin

import kotlinx.serialization.Serializable
import top.fifthlight.touchcontroller.common.assets.TextureSet
import top.fifthlight.touchcontroller.common.control.ControllerWidget
import top.fifthlight.touchcontroller.common.util.registry.RegistrySerializer
import java.util.concurrent.ConcurrentHashMap
import top.fifthlight.touchcontroller.api.v1.widget.BuiltInWidget as ApiBuiltInWidget

@Serializable(with = BuiltInWidgetSerializer::class)
data class BuiltInWidget(
    private val getter: (TextureSet) -> ControllerWidget,
    val hero: Boolean = false,
    val hidden: ((TextureSet) -> Boolean)? = null,
) : ApiBuiltInWidget {
    private val cache = ConcurrentHashMap<TextureSet, ControllerWidget>()
    operator fun get(textureSet: TextureSet): ControllerWidget {
        return cache.getOrPut(textureSet) {
            getter(textureSet)
        }
    }
}

class BuiltInWidgetSerializer : RegistrySerializer<BuiltInWidget>(
    registry = BuiltinWidgets.registry,
    serialName = "top.fifthlight.touchcontroller.common.control.builtin.BuiltInWidget",
    unknown = { id -> BuiltinWidgets.custom },
)
