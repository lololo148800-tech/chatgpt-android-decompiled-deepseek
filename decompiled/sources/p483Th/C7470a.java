package p483Th;

import ao.C11163f0;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p324Mn.C5550t;
import p324Mn.C5551u;
import p606Yn.C10104e;
import p664bc.AbstractC11336c;
import p817j$.time.Instant;

/* JADX INFO: renamed from: Th.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C7470a implements KSerializer {

    /* JADX INFO: renamed from: a */
    public static final C7470a f23726a = new C7470a();

    /* JADX INFO: renamed from: b */
    public static final C11163f0 f23727b = AbstractC11336c.m12772b("Instant", C10104e.f29913e);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        C5550t c5550t = C5551u.Companion;
        long jMo5468F = (long) decoder.mo5468F();
        c5550t.getClass();
        return C5550t.m5943b(jMo5468F, 0L);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f23727b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        long epochMilli;
        C5551u value = (C5551u) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        Instant instant = value.f18004Y;
        try {
            epochMilli = instant.toEpochMilli();
        } catch (ArithmeticException unused) {
            epochMilli = instant.isAfter(Instant.EPOCH) ? Long.MAX_VALUE : Long.MIN_VALUE;
        }
        encoder.mo5573g(epochMilli);
    }
}
