package ao;

import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p606Yn.C10104e;

/* JADX INFO: renamed from: ao.j */
/* JADX INFO: loaded from: classes2.dex */
public final class C11170j implements KSerializer {

    /* JADX INFO: renamed from: a */
    public static final C11170j f33815a = new C11170j();

    /* JADX INFO: renamed from: b */
    public static final C11163f0 f33816b = new C11163f0("kotlin.Byte", C10104e.f29911c);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        return Byte.valueOf(decoder.mo5463A());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f33816b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        byte bByteValue = ((Number) obj).byteValue();
        AbstractC16544l.m18094g(encoder, "encoder");
        encoder.mo5576j(bByteValue);
    }
}
