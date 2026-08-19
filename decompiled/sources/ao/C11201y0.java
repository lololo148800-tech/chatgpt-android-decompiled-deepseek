package ao;

import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.InlineClassDescriptor;
import mm.C17321x;

/* JADX INFO: renamed from: ao.y0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C11201y0 implements KSerializer {

    /* JADX INFO: renamed from: a */
    public static final C11201y0 f33867a = new C11201y0();

    /* JADX INFO: renamed from: b */
    public static final InlineClassDescriptor f33868b = AbstractC11153a0.m12378a("kotlin.ULong", C11141O.f33773a);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        return new C17321x(decoder.mo5487v(f33868b).mo5480n());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f33868b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        long j10 = ((C17321x) obj).f55153Y;
        AbstractC16544l.m18094g(encoder, "encoder");
        encoder.mo5590y(f33868b).mo5562C(j10);
    }
}
