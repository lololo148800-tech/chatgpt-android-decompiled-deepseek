package p505Uf;

import ao.C11163f0;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p001A.AbstractC0010F;
import p195Hh.C3430e;
import p523V9.AbstractC8160o6;
import p523V9.AbstractC8168p6;
import p606Yn.C10104e;
import p664bc.AbstractC11336c;

/* JADX INFO: renamed from: Uf.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C7646g implements KSerializer {

    /* JADX INFO: renamed from: a */
    public static final C7646g f24162a = new C7646g();

    /* JADX INFO: renamed from: b */
    public static final C3430e f24163b = AbstractC8168p6.m8749b("PrioritySerializer", null);

    /* JADX INFO: renamed from: c */
    public static final C11163f0 f24164c = AbstractC11336c.m12772b("notification_priority", C10104e.f29915g);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        int iMo5477k = decoder.mo5477k();
        if (1 > iMo5477k || iMo5477k >= 6) {
            AbstractC8160o6.m8727b(f24163b, AbstractC0010F.m19c(iMo5477k, "Deserialized priority ", " is out of range (1..5). Using default of 3."), null, 6);
            iMo5477k = 3;
        }
        return Integer.valueOf(iMo5477k);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f24164c;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        int iIntValue = ((Number) obj).intValue();
        AbstractC16544l.m18094g(encoder, "encoder");
        if (1 <= iIntValue && iIntValue < 6) {
            encoder.mo5589x(iIntValue);
        } else {
            AbstractC8160o6.m8727b(f24163b, AbstractC0010F.m19c(iIntValue, "Trying to serialize out-of-range priority ", ". Using default of 3."), null, 6);
            encoder.mo5589x(3);
        }
    }
}
