package p463Sn;

import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import mm.EnumC17307j;
import p324Mn.C5543m;
import p559Wn.C8970b;
import p571X9.AbstractC9118D3;
import p571X9.AbstractC9227W;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;

/* JADX INFO: renamed from: Sn.m */
/* JADX INFO: loaded from: classes2.dex */
public final class C7160m implements KSerializer {

    /* JADX INFO: renamed from: a */
    public static final C7160m f22762a = new C7160m();

    /* JADX INFO: renamed from: b */
    public static final Object f22763b = AbstractC9227W.m9799b(EnumC17307j.f55133Y, C7148a.f22735q0);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        SerialDescriptor descriptor = getDescriptor();
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(descriptor);
        C7160m c7160m = f22762a;
        boolean z6 = false;
        int iMo5478l = 0;
        while (true) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(c7160m.getDescriptor());
            if (iMo10914s == -1) {
                interfaceC10428aMo5471c.mo5470b(descriptor);
                if (z6) {
                    return new C5543m(iMo5478l);
                }
                throw new C8970b("months", getDescriptor().mo10679a());
            }
            if (iMo10914s != 0) {
                AbstractC9118D3.m9647b(iMo10914s);
                throw null;
            }
            iMo5478l = interfaceC10428aMo5471c.mo5478l(c7160m.getDescriptor(), 0);
            z6 = true;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, mm.i] */
    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor) f22763b.getValue();
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C5543m value = (C5543m) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        SerialDescriptor descriptor = getDescriptor();
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(descriptor);
        interfaceC10429bMo5570c.mo5579m(0, value.f17993c, f22762a.getDescriptor());
        interfaceC10429bMo5570c.mo5569b(descriptor);
    }
}
