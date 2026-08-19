package p463Sn;

import ao.C11163f0;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p324Mn.AbstractC5535e;
import p324Mn.C5533c;
import p324Mn.C5534d;
import p559Wn.C8976h;
import p606Yn.C10104e;
import p664bc.AbstractC11336c;

/* JADX INFO: renamed from: Sn.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C7150c implements KSerializer {

    /* JADX INFO: renamed from: a */
    public static final C7150c f22740a = new C7150c();

    /* JADX INFO: renamed from: b */
    public static final C11163f0 f22741b = AbstractC11336c.m12772b("kotlinx.datetime.DatePeriod", C10104e.f29918j);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        C5534d c5534d = AbstractC5535e.Companion;
        String strMo5479m = decoder.mo5479m();
        c5534d.getClass();
        AbstractC5535e abstractC5535eM5937a = C5534d.m5937a(strMo5479m);
        if (abstractC5535eM5937a instanceof C5533c) {
            return (C5533c) abstractC5535eM5937a;
        }
        throw new C8976h(abstractC5535eM5937a + " is not a date-based period");
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f22741b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C5533c value = (C5533c) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        encoder.mo5566G(value.toString());
    }
}
