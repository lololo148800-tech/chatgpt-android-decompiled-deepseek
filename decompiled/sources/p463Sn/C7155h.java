package p463Sn;

import ao.C11163f0;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p324Mn.C5524E;
import p324Mn.C5525F;
import p324Mn.C5549s;
import p559Wn.C8976h;
import p606Yn.C10104e;
import p664bc.AbstractC11336c;

/* JADX INFO: renamed from: Sn.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C7155h implements KSerializer {

    /* JADX INFO: renamed from: a */
    public static final C7155h f22752a = new C7155h();

    /* JADX INFO: renamed from: b */
    public static final C11163f0 f22753b = AbstractC11336c.m12772b("kotlinx.datetime.FixedOffsetTimeZone", C10104e.f29918j);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) throws Exception {
        AbstractC16544l.m18094g(decoder, "decoder");
        C5524E c5524e = C5525F.Companion;
        String strMo5479m = decoder.mo5479m();
        c5524e.getClass();
        C5525F c5525fM5925b = C5524E.m5925b(strMo5479m);
        if (c5525fM5925b instanceof C5549s) {
            return (C5549s) c5525fM5925b;
        }
        throw new C8976h("Timezone identifier '" + c5525fM5925b + "' does not correspond to a fixed-offset timezone");
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f22753b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C5549s value = (C5549s) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        String id2 = value.f17977a.getId();
        AbstractC16544l.m18093f(id2, "getId(...)");
        encoder.mo5566G(id2);
    }
}
