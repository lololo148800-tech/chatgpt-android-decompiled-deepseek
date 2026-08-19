package ao;

import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: renamed from: ao.X */
/* JADX INFO: loaded from: classes2.dex */
public final class C11149X implements KSerializer {

    /* JADX INFO: renamed from: a */
    public final KSerializer f33786a;

    /* JADX INFO: renamed from: b */
    public final C11169i0 f33787b;

    public C11149X(KSerializer serializer) {
        AbstractC16544l.m18094g(serializer, "serializer");
        this.f33786a = serializer;
        this.f33787b = new C11169i0(serializer.getDescriptor());
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        if (decoder.mo5484r()) {
            return decoder.mo5482p(this.f33786a);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C11149X.class == obj.getClass() && AbstractC16544l.m18089b(this.f33786a, ((C11149X) obj).f33786a);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return this.f33787b;
    }

    public final int hashCode() {
        return this.f33786a.hashCode();
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        AbstractC16544l.m18094g(encoder, "encoder");
        if (obj != null) {
            encoder.mo5560A(this.f33786a, obj);
        } else {
            encoder.mo5572f();
        }
    }
}
