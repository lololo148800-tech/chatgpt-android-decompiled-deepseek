package p483Th;

import ao.C11163f0;
import com.openai.feature.serverstatus.impl.sunset.p684ZP.VjclRfeKsMflo;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p324Mn.C5550t;
import p324Mn.C5551u;
import p606Yn.C10104e;
import p664bc.AbstractC11336c;

/* JADX INFO: renamed from: Th.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C7471b implements KSerializer {

    /* JADX INFO: renamed from: a */
    public static final C7471b f23728a = new C7471b();

    /* JADX INFO: renamed from: b */
    public static final C11163f0 f23729b = AbstractC11336c.m12772b("StringInstant", C10104e.f29918j);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        return C5550t.m5944c(C5551u.Companion, decoder.mo5479m());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f23729b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C5551u value = (C5551u) obj;
        AbstractC16544l.m18094g(encoder, VjclRfeKsMflo.WuIxvpxu);
        AbstractC16544l.m18094g(value, "value");
        encoder.mo5566G(value.toString());
    }
}
