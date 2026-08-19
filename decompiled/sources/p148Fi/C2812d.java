package p148Fi;

import ao.C11163f0;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p025An.C0644w;
import p387Pl.EnumC6481b;
import p606Yn.C10104e;
import p664bc.AbstractC11336c;

/* JADX INFO: renamed from: Fi.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C2812d implements KSerializer {

    /* JADX INFO: renamed from: a */
    public static final C2812d f8540a = new C2812d();

    /* JADX INFO: renamed from: b */
    public static final C11163f0 f8541b = AbstractC11336c.m12772b("CameraPosition", C10104e.f29918j);

    /* JADX INFO: renamed from: a */
    public static String m3713a(EnumC6481b enumC6481b) {
        AbstractC16544l.m18094g(enumC6481b, "<this>");
        int iOrdinal = enumC6481b.ordinal();
        if (iOrdinal == 0) {
            return "front";
        }
        if (iOrdinal == 1) {
            return "back";
        }
        throw new C0644w();
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        String strMo5479m = decoder.mo5479m();
        if (AbstractC16544l.m18089b(strMo5479m, "front")) {
            return EnumC6481b.f21034Y;
        }
        if (AbstractC16544l.m18089b(strMo5479m, "back")) {
            return EnumC6481b.f21035Z;
        }
        throw new IllegalStateException("Unknown camera position");
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f8541b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        EnumC6481b value = (EnumC6481b) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        encoder.mo5566G(m3713a(value));
    }
}
