package p463Sn;

import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import mm.EnumC17307j;
import p138F8.vJO.vRJidSveZHcTw;
import p324Mn.C5541k;
import p559Wn.C8970b;
import p571X9.AbstractC9118D3;
import p571X9.AbstractC9227W;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;

/* JADX INFO: renamed from: Sn.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C7154g implements KSerializer {

    /* JADX INFO: renamed from: a */
    public static final C7154g f22750a = new C7154g();

    /* JADX INFO: renamed from: b */
    public static final Object f22751b = AbstractC9227W.m9799b(EnumC17307j.f55133Y, C7148a.f22734p0);

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, mm.i] */
    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor) f22751b.getValue();
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C5541k value = (C5541k) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        SerialDescriptor descriptor = getDescriptor();
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(descriptor);
        interfaceC10429bMo5570c.mo5579m(0, value.f17992c, f22750a.getDescriptor());
        interfaceC10429bMo5570c.mo5569b(descriptor);
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, vRJidSveZHcTw.KBrlCTEWJ);
        SerialDescriptor descriptor = getDescriptor();
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(descriptor);
        C7154g c7154g = f22750a;
        boolean z6 = false;
        int iMo5478l = 0;
        while (true) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(c7154g.getDescriptor());
            if (iMo10914s == -1) {
                interfaceC10428aMo5471c.mo5470b(descriptor);
                if (z6) {
                    return new C5541k(iMo5478l);
                }
                throw new C8970b("days", getDescriptor().mo10679a());
            }
            if (iMo10914s != 0) {
                AbstractC9118D3.m9647b(iMo10914s);
                throw null;
            }
            iMo5478l = interfaceC10428aMo5471c.mo5478l(c7154g.getDescriptor(), 0);
            z6 = true;
        }
    }
}
