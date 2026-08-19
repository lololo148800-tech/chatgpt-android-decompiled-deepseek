package p1155zi;

import ao.AbstractC11153a0;
import ao.C11164g;
import ao.InterfaceC11127C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import p324Mn.C5551u;
import p463Sn.C7156i;
import p559Wn.C8981m;
import p582Xk.HXHG.TfazcFv;
import p594Y9.AbstractC9961r4;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;

/* JADX INFO: renamed from: zi.V1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C21969V1 implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C21969V1 f69548a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = C21975X1.f69567f;
        KSerializer kSerializer = kSerializerArr[0];
        KSerializer kSerializer2 = kSerializerArr[1];
        KSerializer kSerializerM10615b = AbstractC9961r4.m10615b(C7156i.f22754a);
        C11164g c11164g = C11164g.f33804a;
        return new KSerializer[]{kSerializer, kSerializer2, kSerializerM10615b, c11164g, c11164g};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C21975X1.f69567f;
        EnumC21981Z1 enumC21981Z1 = null;
        EnumC21989b2 enumC21989b2 = null;
        C5551u c5551u = null;
        int i10 = 0;
        boolean zMo5481o = false;
        boolean zMo5481o2 = false;
        boolean z6 = true;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            if (iMo10914s == -1) {
                z6 = false;
            } else if (iMo10914s == 0) {
                enumC21981Z1 = (EnumC21981Z1) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 0, kSerializerArr[0], enumC21981Z1);
                i10 |= 1;
            } else if (iMo10914s == 1) {
                enumC21989b2 = (EnumC21989b2) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 1, kSerializerArr[1], enumC21989b2);
                i10 |= 2;
            } else if (iMo10914s == 2) {
                c5551u = (C5551u) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 2, C7156i.f22754a, c5551u);
                i10 |= 4;
            } else if (iMo10914s == 3) {
                zMo5481o = interfaceC10428aMo5471c.mo5481o(pluginGeneratedSerialDescriptor, 3);
                i10 |= 8;
            } else {
                if (iMo10914s != 4) {
                    throw new C8981m(iMo10914s);
                }
                zMo5481o2 = interfaceC10428aMo5471c.mo5481o(pluginGeneratedSerialDescriptor, 4);
                i10 |= 16;
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C21975X1(i10, enumC21981Z1, enumC21989b2, c5551u, zMo5481o, zMo5481o2);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C21975X1 value = (C21975X1) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C21975X1.f69567f;
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 0, kSerializerArr[0], value.f69571a);
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 1, kSerializerArr[1], value.f69572b);
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 2, C7156i.f22754a, value.f69573c);
        interfaceC10429bMo5570c.mo5583q(pluginGeneratedSerialDescriptor, 3, value.f69574d);
        interfaceC10429bMo5570c.mo5583q(pluginGeneratedSerialDescriptor, 4, value.f69575e);
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }

    static {
        C21969V1 c21969v1 = new C21969V1();
        f69548a = c21969v1;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.types.Subscription", c21969v1, 5);
        pluginGeneratedSerialDescriptor.m18453j("plan", false);
        pluginGeneratedSerialDescriptor.m18453j(TfazcFv.DUdicoB, false);
        pluginGeneratedSerialDescriptor.m18453j("expirationDate", false);
        pluginGeneratedSerialDescriptor.m18453j("willRenew", false);
        pluginGeneratedSerialDescriptor.m18453j("isActive", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }
}
