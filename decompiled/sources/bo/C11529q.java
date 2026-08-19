package bo;

import ao.C11163f0;
import ao.C11201y0;
import co.AbstractC11828r;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.AbstractC16643b;
import mm.C17321x;
import p1113xn.AbstractC21328v;
import p1113xn.AbstractC21329w;
import p523V9.AbstractC7997T5;
import p523V9.AbstractC8017W3;
import p606Yn.C10104e;
import p664bc.AbstractC11336c;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: bo.q */
/* JADX INFO: loaded from: classes2.dex */
public final class C11529q implements KSerializer {

    /* JADX INFO: renamed from: a */
    public static final C11529q f34893a = new C11529q();

    /* JADX INFO: renamed from: b */
    public static final C11163f0 f34894b = AbstractC11336c.m12772b("kotlinx.serialization.json.JsonLiteral", C10104e.f29918j);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        AbstractC16643b abstractC16643bMo12907j = AbstractC8017W3.m8339c(decoder).mo12907j();
        if (abstractC16643bMo12907j instanceof C11528p) {
            return (C11528p) abstractC16643bMo12907j;
        }
        StringBuilder sb2 = new StringBuilder("Unexpected JSON element, expected JsonLiteral, had ");
        throw AbstractC11828r.m13097c(-1, abstractC16643bMo12907j.toString(), AbstractC17792x.m19535r(AbstractC16526C.f51263a, abstractC16643bMo12907j.getClass(), sb2));
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f34894b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        Boolean bool;
        C11528p value = (C11528p) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        AbstractC8017W3.m8338b(encoder);
        boolean z6 = value.f34890Y;
        String str = value.f34892o0;
        if (z6) {
            encoder.mo5566G(str);
            return;
        }
        SerialDescriptor serialDescriptor = value.f34891Z;
        if (serialDescriptor != null) {
            encoder.mo5590y(serialDescriptor).mo5566G(str);
            return;
        }
        Long lM21738y = AbstractC21329w.m21738y(str);
        if (lM21738y != null) {
            encoder.mo5562C(lM21738y.longValue());
            return;
        }
        C17321x c17321xM8304d = AbstractC7997T5.m8304d(str);
        if (c17321xM8304d != null) {
            encoder.mo5590y(C11201y0.f33868b).mo5562C(c17321xM8304d.f55153Y);
            return;
        }
        Double dM21719f = AbstractC21328v.m21719f(str);
        if (dM21719f != null) {
            encoder.mo5573g(dM21719f.doubleValue());
            return;
        }
        if (str.equals("true")) {
            bool = Boolean.TRUE;
        } else {
            bool = str.equals("false") ? Boolean.FALSE : null;
        }
        if (bool != null) {
            encoder.mo5577k(bool.booleanValue());
        } else {
            encoder.mo5566G(str);
        }
    }
}
