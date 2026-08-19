package p1108xi;

import androidx.fragment.app.OwC.wNrQXvwLiB;
import ao.C11123A;
import ao.C11163f0;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p606Yn.C10104e;
import p664bc.AbstractC11336c;
import p774h1.AbstractC14334L;
import p774h1.C14365u;
import p797i1.C14902d;

/* JADX INFO: renamed from: xi.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C21271h implements KSerializer {

    /* JADX INFO: renamed from: a */
    public static final C21271h f67647a = new C21271h();

    /* JADX INFO: renamed from: b */
    public static final C11163f0 f67648b = AbstractC11336c.m12772b(wNrQXvwLiB.qOPCC, C10104e.f29918j);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        if (!decoder.mo5484r()) {
            return null;
        }
        float[] fArr = (float[]) decoder.mo5482p(C11123A.f33742c);
        float f10 = fArr[0] / 255.0f;
        float f11 = fArr[1] / 255.0f;
        float f12 = fArr[2] / 255.0f;
        Float fValueOf = 3 < fArr.length ? Float.valueOf(fArr[3]) : null;
        return new C14365u(AbstractC14334L.m15624b(f10, f11, f12, fValueOf != null ? fValueOf.floatValue() : 1.0f, C14902d.f46407c));
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f67648b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C14365u c14365u = (C14365u) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        if (c14365u == null) {
            encoder.mo5572f();
        } else {
            long j10 = c14365u.f45062a;
            encoder.mo5560A(C11123A.f33742c, new float[]{C14365u.m15780h(j10) * 255.0f, C14365u.m15779g(j10) * 255.0f, C14365u.m15777e(j10) * 255.0f, C14365u.m15776d(j10) * 255.0f});
        }
    }
}
