package p463Sn;

import ao.C11163f0;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p324Mn.C5524E;
import p324Mn.C5525F;
import p606Yn.C10104e;
import p664bc.AbstractC11336c;

/* JADX INFO: renamed from: Sn.o */
/* JADX INFO: loaded from: classes2.dex */
public final class C7162o implements KSerializer {

    /* JADX INFO: renamed from: a */
    public static final C7162o f22766a = new C7162o();

    /* JADX INFO: renamed from: b */
    public static final C11163f0 f22767b = AbstractC11336c.m12772b("kotlinx.datetime.TimeZone", C10104e.f29918j);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        C5524E c5524e = C5525F.Companion;
        String strMo5479m = decoder.mo5479m();
        c5524e.getClass();
        return C5524E.m5925b(strMo5479m);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f22767b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C5525F value = (C5525F) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        String id2 = value.f17977a.getId();
        AbstractC16544l.m18093f(id2, "getId(...)");
        encoder.mo5566G(id2);
    }
}
