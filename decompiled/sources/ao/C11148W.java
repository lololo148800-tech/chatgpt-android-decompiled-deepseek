package ao;

import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p559Wn.C8976h;

/* JADX INFO: renamed from: ao.W */
/* JADX INFO: loaded from: classes2.dex */
public final class C11148W implements KSerializer {

    /* JADX INFO: renamed from: a */
    public static final C11148W f33784a = new C11148W();

    /* JADX INFO: renamed from: b */
    public static final C11147V f33785b = C11147V.f33783a;

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        throw new C8976h("'kotlin.Nothing' does not have instances");
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f33785b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        Void value = (Void) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        throw new C8976h("'kotlin.Nothing' cannot be serialized");
    }
}
