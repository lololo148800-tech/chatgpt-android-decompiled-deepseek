package ao;

import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p606Yn.C10104e;

/* JADX INFO: renamed from: ao.p */
/* JADX INFO: loaded from: classes2.dex */
public final class C11182p implements KSerializer {

    /* JADX INFO: renamed from: a */
    public static final C11182p f33829a = new C11182p();

    /* JADX INFO: renamed from: b */
    public static final C11163f0 f33830b = new C11163f0("kotlin.Char", C10104e.f29912d);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        return Character.valueOf(decoder.mo5473f());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f33830b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        char cCharValue = ((Character) obj).charValue();
        AbstractC16544l.m18094g(encoder, "encoder");
        encoder.mo5582p(cCharValue);
    }
}
