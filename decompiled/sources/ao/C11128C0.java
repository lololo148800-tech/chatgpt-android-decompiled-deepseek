package ao;

import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import mm.C17296C;
import p559Wn.C8969a;
import p658b5.p659zh.MMVKXkcLpuHFDi;

/* JADX INFO: renamed from: ao.C0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C11128C0 implements KSerializer {

    /* JADX INFO: renamed from: b */
    public static final C11128C0 f33748b = new C11128C0();

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C8969a f33749a = new C8969a("kotlin.Unit", C17296C.f55119a);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        this.f33749a.deserialize(decoder);
        return C17296C.f55119a;
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return this.f33749a.getDescriptor();
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C17296C value = (C17296C) obj;
        AbstractC16544l.m18094g(encoder, MMVKXkcLpuHFDi.cstbEokKXzPtFX);
        AbstractC16544l.m18094g(value, "value");
        this.f33749a.serialize(encoder, value);
    }
}
