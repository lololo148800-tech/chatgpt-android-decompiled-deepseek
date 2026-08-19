package ao;

import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p606Yn.C10104e;

/* JADX INFO: renamed from: ao.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C11164g implements KSerializer {

    /* JADX INFO: renamed from: a */
    public static final C11164g f33804a = new C11164g();

    /* JADX INFO: renamed from: b */
    public static final C11163f0 f33805b = new C11163f0("kotlin.Boolean", C10104e.f29910b);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        return Boolean.valueOf(decoder.mo5472e());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f33805b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        AbstractC16544l.m18094g(encoder, "encoder");
        encoder.mo5577k(zBooleanValue);
    }
}
