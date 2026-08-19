package p1155zi;

import ao.AbstractC11153a0;
import ao.C11135I;
import ao.InterfaceC11127C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import p559Wn.C8981m;
import p594Y9.AbstractC9961r4;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;

/* JADX INFO: renamed from: zi.H */
/* JADX INFO: loaded from: classes3.dex */
public final class C21919H implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C21919H f69470a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C21919H c21919h = new C21919H();
        f69470a = c21919h;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.types.AudioAssetPointer", c21919h, 4);
        pluginGeneratedSerialDescriptor.m18453j("assetPointer", false);
        pluginGeneratedSerialDescriptor.m18453j("sizeBytes", false);
        pluginGeneratedSerialDescriptor.m18453j("format", false);
        pluginGeneratedSerialDescriptor.m18453j("metadata", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{C21899C.f69433a, C11135I.f33763a, C21924I0.f69473a, AbstractC9961r4.m10615b(C21935L.f69487a)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        boolean z6 = true;
        int i10 = 0;
        int iMo5478l = 0;
        String str = null;
        EnumC21931K enumC21931K = null;
        C21943N c21943n = null;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            if (iMo10914s == -1) {
                z6 = false;
            } else if (iMo10914s == 0) {
                C21907E c21907e = (C21907E) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 0, C21899C.f69433a, str != null ? new C21907E(str) : null);
                str = c21907e != null ? c21907e.f69451a : null;
                i10 |= 1;
            } else if (iMo10914s == 1) {
                iMo5478l = interfaceC10428aMo5471c.mo5478l(pluginGeneratedSerialDescriptor, 1);
                i10 |= 2;
            } else if (iMo10914s == 2) {
                enumC21931K = (EnumC21931K) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 2, C21924I0.f69473a, enumC21931K);
                i10 |= 4;
            } else {
                if (iMo10914s != 3) {
                    throw new C8981m(iMo10914s);
                }
                c21943n = (C21943N) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 3, C21935L.f69487a, c21943n);
                i10 |= 8;
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C21947O(i10, str, iMo5478l, enumC21931K, c21943n);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C21947O value = (C21947O) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 0, C21899C.f69433a, new C21907E(value.f69501a));
        interfaceC10429bMo5570c.mo5579m(1, value.f69502b, pluginGeneratedSerialDescriptor);
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 2, C21924I0.f69473a, value.f69503c);
        boolean zMo5565F = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        C21943N c21943n = value.f69504d;
        if (zMo5565F || c21943n != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 3, C21935L.f69487a, c21943n);
        }
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
