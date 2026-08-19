package ao;

import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.InlineClassDescriptor;
import mm.C17317t;

/* JADX INFO: renamed from: ao.s0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C11189s0 implements KSerializer {

    /* JADX INFO: renamed from: a */
    public static final C11189s0 f33841a = new C11189s0();

    /* JADX INFO: renamed from: b */
    public static final InlineClassDescriptor f33842b = AbstractC11153a0.m12378a("kotlin.UByte", C11170j.f33815a);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        return new C17317t(decoder.mo5487v(f33842b).mo5463A());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f33842b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        byte b = ((C17317t) obj).f55149Y;
        AbstractC16544l.m18094g(encoder, "encoder");
        encoder.mo5590y(f33842b).mo5576j(b);
    }
}
