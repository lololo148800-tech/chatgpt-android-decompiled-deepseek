package p040Bd;

import ao.AbstractC11153a0;
import ao.C11135I;
import ao.C11181o0;
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

/* JADX INFO: renamed from: Bd.P */
/* JADX INFO: loaded from: classes3.dex */
public final class C0977P implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C0977P f2757a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C0977P c0977p = new C0977P();
        f2757a = c0977p;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.api.message.ApiContentReference.Forecast", c0977p, 5);
        pluginGeneratedSerialDescriptor.m18453j("startIdx", false);
        pluginGeneratedSerialDescriptor.m18453j("endIdx", false);
        pluginGeneratedSerialDescriptor.m18453j("forecast", false);
        pluginGeneratedSerialDescriptor.m18453j("dateRange", true);
        pluginGeneratedSerialDescriptor.m18453j("type", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        C11135I c11135i = C11135I.f33763a;
        return new KSerializer[]{AbstractC9961r4.m10615b(c11135i), AbstractC9961r4.m10615b(c11135i), AbstractC9961r4.m10615b(C0994S.f2779a), AbstractC9961r4.m10615b(C1135n4.f3051a), C11181o0.f33827a};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        int i10 = 0;
        Integer num = null;
        Integer num2 = null;
        C1085g0 c1085g0 = null;
        C1147p4 c1147p4 = null;
        String strMo5483q = null;
        boolean z6 = true;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            if (iMo10914s == -1) {
                z6 = false;
            } else if (iMo10914s == 0) {
                num = (Integer) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 0, C11135I.f33763a, num);
                i10 |= 1;
            } else if (iMo10914s == 1) {
                num2 = (Integer) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 1, C11135I.f33763a, num2);
                i10 |= 2;
            } else if (iMo10914s == 2) {
                c1085g0 = (C1085g0) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 2, C0994S.f2779a, c1085g0);
                i10 |= 4;
            } else if (iMo10914s == 3) {
                c1147p4 = (C1147p4) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 3, C1135n4.f3051a, c1147p4);
                i10 |= 8;
            } else {
                if (iMo10914s != 4) {
                    throw new C8981m(iMo10914s);
                }
                strMo5483q = interfaceC10428aMo5471c.mo5483q(pluginGeneratedSerialDescriptor, 4);
                i10 |= 16;
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C1092h0(i10, num, num2, c1085g0, c1147p4, strMo5483q);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C1092h0 value = (C1092h0) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        C11135I c11135i = C11135I.f33763a;
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 0, c11135i, value.f2987a);
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 1, c11135i, value.f2988b);
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 2, C0994S.f2779a, value.f2989c);
        boolean zMo5565F = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        C1147p4 c1147p4 = value.f2990d;
        if (zMo5565F || c1147p4 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 3, C1135n4.f3051a, c1147p4);
        }
        boolean zMo5565F2 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str = value.f2991e;
        if (zMo5565F2 || !AbstractC16544l.m18089b(str, "forecast")) {
            interfaceC10429bMo5570c.mo5584r(pluginGeneratedSerialDescriptor, 4, str);
        }
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
