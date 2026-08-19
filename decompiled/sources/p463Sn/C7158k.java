package p463Sn;

import ao.C11163f0;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p324Mn.C5521B;
import p324Mn.C5556z;
import p606Yn.C10104e;
import p664bc.AbstractC11336c;

/* JADX INFO: renamed from: Sn.k */
/* JADX INFO: loaded from: classes2.dex */
public final class C7158k implements KSerializer {

    /* JADX INFO: renamed from: a */
    public static final C7158k f22758a = new C7158k();

    /* JADX INFO: renamed from: b */
    public static final C11163f0 f22759b = AbstractC11336c.m12772b("kotlinx.datetime.LocalDateTime", C10104e.f29918j);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        return C5556z.m5949a(C5521B.Companion, decoder.mo5479m());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f22759b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C5521B value = (C5521B) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        encoder.mo5566G(value.toString());
    }
}
