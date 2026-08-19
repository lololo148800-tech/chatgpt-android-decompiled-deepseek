package ao;

import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p606Yn.C10104e;

/* JADX INFO: renamed from: ao.n0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C11179n0 implements KSerializer {

    /* JADX INFO: renamed from: a */
    public static final C11179n0 f33824a = new C11179n0();

    /* JADX INFO: renamed from: b */
    public static final C11163f0 f33825b = new C11163f0("kotlin.Short", C10104e.f29917i);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        return Short.valueOf(decoder.mo5464B());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f33825b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        short sShortValue = ((Number) obj).shortValue();
        AbstractC16544l.m18094g(encoder, "encoder");
        encoder.mo5574h(sShortValue);
    }
}
