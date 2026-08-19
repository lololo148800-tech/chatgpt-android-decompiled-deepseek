package p463Sn;

import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import mm.EnumC17307j;
import p324Mn.C5545o;
import p559Wn.C8970b;
import p571X9.AbstractC9118D3;
import p571X9.AbstractC9227W;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;

/* JADX INFO: renamed from: Sn.n */
/* JADX INFO: loaded from: classes2.dex */
public final class C7161n implements KSerializer {

    /* JADX INFO: renamed from: a */
    public static final C7161n f22764a = new C7161n();

    /* JADX INFO: renamed from: b */
    public static final Object f22765b = AbstractC9227W.m9799b(EnumC17307j.f55133Y, C7148a.f22736r0);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        SerialDescriptor descriptor = getDescriptor();
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(descriptor);
        C7161n c7161n = f22764a;
        long jMo5476i = 0;
        boolean z6 = false;
        while (true) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(c7161n.getDescriptor());
            if (iMo10914s == -1) {
                interfaceC10428aMo5471c.mo5470b(descriptor);
                if (z6) {
                    return new C5545o(jMo5476i);
                }
                throw new C8970b("nanoseconds", getDescriptor().mo10679a());
            }
            if (iMo10914s != 0) {
                AbstractC9118D3.m9647b(iMo10914s);
                throw null;
            }
            jMo5476i = interfaceC10428aMo5471c.mo5476i(c7161n.getDescriptor(), 0);
            z6 = true;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, mm.i] */
    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor) f22765b.getValue();
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C5545o value = (C5545o) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        SerialDescriptor descriptor = getDescriptor();
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(descriptor);
        interfaceC10429bMo5570c.mo5564E(f22764a.getDescriptor(), 0, value.f17994c);
        interfaceC10429bMo5570c.mo5569b(descriptor);
    }
}
