package ao;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import mm.C17315r;
import p008A6.C0386f;
import p559Wn.C8976h;
import p606Yn.C10106g;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;
import p664bc.AbstractC11336c;
import p861l1.xapn.suYVq;

/* JADX INFO: renamed from: ao.p0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C11183p0 implements KSerializer {

    /* JADX INFO: renamed from: a */
    public final KSerializer f33831a;

    /* JADX INFO: renamed from: b */
    public final KSerializer f33832b;

    /* JADX INFO: renamed from: c */
    public final KSerializer f33833c;

    /* JADX INFO: renamed from: d */
    public final C10106g f33834d;

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        C10106g c10106g = this.f33834d;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(c10106g);
        Object obj = AbstractC11153a0.f33791c;
        Object objMo5490y = obj;
        Object objMo5490y2 = objMo5490y;
        Object objMo5490y3 = objMo5490y2;
        while (true) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(c10106g);
            if (iMo10914s == -1) {
                interfaceC10428aMo5471c.mo5470b(c10106g);
                if (objMo5490y == obj) {
                    throw new C8976h("Element 'first' is missing");
                }
                if (objMo5490y2 == obj) {
                    throw new C8976h("Element 'second' is missing");
                }
                if (objMo5490y3 != obj) {
                    return new C17315r(objMo5490y, objMo5490y2, objMo5490y3);
                }
                throw new C8976h("Element 'third' is missing");
            }
            if (iMo10914s == 0) {
                objMo5490y = interfaceC10428aMo5471c.mo5490y(c10106g, 0, this.f33831a, null);
            } else if (iMo10914s == 1) {
                objMo5490y2 = interfaceC10428aMo5471c.mo5490y(c10106g, 1, this.f33832b, null);
            } else {
                if (iMo10914s != 2) {
                    throw new C8976h(AbstractC10763a.m11048f(iMo10914s, "Unexpected index "));
                }
                objMo5490y3 = interfaceC10428aMo5471c.mo5490y(c10106g, 2, this.f33833c, null);
            }
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return this.f33834d;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C17315r value = (C17315r) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        C10106g c10106g = this.f33834d;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(c10106g);
        interfaceC10429bMo5570c.mo5575i(c10106g, 0, this.f33831a, value.f55146Y);
        interfaceC10429bMo5570c.mo5575i(c10106g, 1, this.f33832b, value.f55147Z);
        interfaceC10429bMo5570c.mo5575i(c10106g, 2, this.f33833c, value.f55148o0);
        interfaceC10429bMo5570c.mo5569b(c10106g);
    }

    public C11183p0(KSerializer kSerializer, KSerializer kSerializer2, KSerializer kSerializer3) {
        this.f33831a = kSerializer;
        this.f33832b = kSerializer2;
        this.f33833c = kSerializer3;
        C0386f c0386f = new C0386f(this, 22);
        this.f33834d = AbstractC11336c.m12773c(suYVq.ElvbI, new SerialDescriptor[0], c0386f);
    }
}
