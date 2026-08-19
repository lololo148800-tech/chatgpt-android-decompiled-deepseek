package ao;

import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.InlineClassDescriptor;
import mm.C17294A;

/* JADX INFO: renamed from: ao.B0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C11126B0 implements KSerializer {

    /* JADX INFO: renamed from: a */
    public static final C11126B0 f33746a = new C11126B0();

    /* JADX INFO: renamed from: b */
    public static final InlineClassDescriptor f33747b = AbstractC11153a0.m12378a("kotlin.UShort", C11179n0.f33824a);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        return new C17294A(decoder.mo5487v(f33747b).mo5464B());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f33747b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        short s10 = ((C17294A) obj).f55117Y;
        AbstractC16544l.m18094g(encoder, "encoder");
        encoder.mo5590y(f33747b).mo5574h(s10);
    }
}
