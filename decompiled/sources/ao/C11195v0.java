package ao;

import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.InlineClassDescriptor;
import mm.C17319v;

/* JADX INFO: renamed from: ao.v0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C11195v0 implements KSerializer {

    /* JADX INFO: renamed from: a */
    public static final C11195v0 f33851a = new C11195v0();

    /* JADX INFO: renamed from: b */
    public static final InlineClassDescriptor f33852b = AbstractC11153a0.m12378a("kotlin.UInt", C11135I.f33763a);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        return new C17319v(decoder.mo5487v(f33852b).mo5477k());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f33852b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        int i10 = ((C17319v) obj).f55151Y;
        AbstractC16544l.m18094g(encoder, "encoder");
        encoder.mo5590y(f33852b).mo5589x(i10);
    }
}
