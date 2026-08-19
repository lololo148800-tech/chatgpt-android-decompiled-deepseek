package ao;

import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p606Yn.C10104e;

/* JADX INFO: renamed from: ao.I */
/* JADX INFO: loaded from: classes2.dex */
public final class C11135I implements KSerializer {

    /* JADX INFO: renamed from: a */
    public static final C11135I f33763a = new C11135I();

    /* JADX INFO: renamed from: b */
    public static final C11163f0 f33764b = new C11163f0("kotlin.Int", C10104e.f29915g);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        return Integer.valueOf(decoder.mo5477k());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f33764b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        int iIntValue = ((Number) obj).intValue();
        AbstractC16544l.m18094g(encoder, "encoder");
        encoder.mo5589x(iIntValue);
    }
}
