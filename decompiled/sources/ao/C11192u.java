package ao;

import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p606Yn.C10104e;

/* JADX INFO: renamed from: ao.u */
/* JADX INFO: loaded from: classes2.dex */
public final class C11192u implements KSerializer {

    /* JADX INFO: renamed from: a */
    public static final C11192u f33846a = new C11192u();

    /* JADX INFO: renamed from: b */
    public static final C11163f0 f33847b = new C11163f0("kotlin.Double", C10104e.f29913e);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        return Double.valueOf(decoder.mo5468F());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f33847b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        double dDoubleValue = ((Number) obj).doubleValue();
        AbstractC16544l.m18094g(encoder, "encoder");
        encoder.mo5573g(dDoubleValue);
    }
}
