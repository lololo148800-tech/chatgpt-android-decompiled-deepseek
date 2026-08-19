package p1155zi;

import ao.C11163f0;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p606Yn.C10104e;
import p664bc.AbstractC11336c;

/* JADX INFO: renamed from: zi.I0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C21924I0 implements KSerializer {

    /* JADX INFO: renamed from: a */
    public static final C21924I0 f69473a = new C21924I0();

    /* JADX INFO: renamed from: b */
    public static final C11163f0 f69474b = AbstractC11336c.m12772b("Format", C10104e.f29918j);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        Object next;
        AbstractC16544l.m18094g(decoder, "decoder");
        String strMo5479m = decoder.mo5479m();
        Iterator it = EnumC21931K.f69483p0.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((EnumC21931K) next).f69484Y.equals(strMo5479m));
        EnumC21931K enumC21931K = (EnumC21931K) next;
        return enumC21931K == null ? EnumC21931K.Unknown : enumC21931K;
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f69474b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        EnumC21931K value = (EnumC21931K) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        encoder.mo5566G(value.f69484Y);
    }
}
