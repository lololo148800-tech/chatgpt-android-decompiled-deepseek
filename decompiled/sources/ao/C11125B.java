package ao;

import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p606Yn.C10104e;

/* JADX INFO: renamed from: ao.B */
/* JADX INFO: loaded from: classes2.dex */
public final class C11125B implements KSerializer {

    /* JADX INFO: renamed from: a */
    public static final C11125B f33744a = new C11125B();

    /* JADX INFO: renamed from: b */
    public static final C11163f0 f33745b = new C11163f0("kotlin.Float", C10104e.f29914f);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        return Float.valueOf(decoder.mo5465C());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f33745b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        float fFloatValue = ((Number) obj).floatValue();
        AbstractC16544l.m18094g(encoder, "encoder");
        encoder.mo5580n(fFloatValue);
    }
}
