package ao;

import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p1113xn.AbstractC21311e;
import p1158zn.C22214a;
import p544W9.AbstractC8712t;
import p606Yn.C10104e;

/* JADX INFO: renamed from: ao.D0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C11130D0 implements KSerializer {

    /* JADX INFO: renamed from: a */
    public static final C11130D0 f33753a = new C11130D0();

    /* JADX INFO: renamed from: b */
    public static final C11163f0 f33754b = new C11163f0("kotlin.uuid.Uuid", C10104e.f29918j);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        String uuidString = decoder.mo5479m();
        AbstractC16544l.m18094g(uuidString, "uuidString");
        if (uuidString.length() != 36) {
            throw new IllegalArgumentException("Expected a 36-char string in the standard uuid format.");
        }
        long jM21652d = AbstractC21311e.m21652d(0, 8, uuidString);
        AbstractC8712t.m9419a(8, uuidString);
        long jM21652d2 = AbstractC21311e.m21652d(9, 13, uuidString);
        AbstractC8712t.m9419a(13, uuidString);
        long jM21652d3 = AbstractC21311e.m21652d(14, 18, uuidString);
        AbstractC8712t.m9419a(18, uuidString);
        long jM21652d4 = AbstractC21311e.m21652d(19, 23, uuidString);
        AbstractC8712t.m9419a(23, uuidString);
        long j10 = (jM21652d << 32) | (jM21652d2 << 16) | jM21652d3;
        long jM21652d5 = AbstractC21311e.m21652d(24, 36, uuidString) | (jM21652d4 << 48);
        return (j10 == 0 && jM21652d5 == 0) ? C22214a.f70399o0 : new C22214a(j10, jM21652d5);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f33754b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C22214a value = (C22214a) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        encoder.mo5566G(value.toString());
    }
}
