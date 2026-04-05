package top.fifthlight.touchcontroller.common.util.registry

import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

abstract class RegistrySerializer<T>(
    private val registry: Registry<T>,
    private val serialName: String,
    private val unknown: (String) -> T,
) : KSerializer<T> {
    override val descriptor: SerialDescriptor = PrimitiveSerialDescriptor(
        serialName = serialName,
        kind = PrimitiveKind.STRING,
    )

    override fun serialize(encoder: Encoder, value: T) = encoder.encodeString(
        registry.getId(value) ?: throw SerializationException("Value $value not registered")
    )

    override fun deserialize(decoder: Decoder): T = decoder.decodeString().let {
        registry[it] ?: unknown(it)
    }
}

