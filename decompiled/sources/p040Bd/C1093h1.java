package p040Bd;

import ao.AbstractC11153a0;
import ao.C11125B;
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

/* JADX INFO: renamed from: Bd.h1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1093h1 implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C1093h1 f2992a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C1093h1 c1093h1 = new C1093h1();
        f2992a = c1093h1;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.api.message.ApiContentReference.Stock.PriceResponse", c1093h1, 6);
        pluginGeneratedSerialDescriptor.m18453j("price", false);
        pluginGeneratedSerialDescriptor.m18453j("changePercent", true);
        pluginGeneratedSerialDescriptor.m18453j("change", true);
        pluginGeneratedSerialDescriptor.m18453j("intradayHigh", true);
        pluginGeneratedSerialDescriptor.m18453j("intradayLow", true);
        pluginGeneratedSerialDescriptor.m18453j("latestTradeTimestamp", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        C11125B c11125b = C11125B.f33744a;
        return new KSerializer[]{c11125b, AbstractC9961r4.m10615b(c11125b), AbstractC9961r4.m10615b(c11125b), AbstractC9961r4.m10615b(c11125b), AbstractC9961r4.m10615b(c11125b), AbstractC9961r4.m10615b(C11135I.f33763a)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        int i10 = 0;
        Float f10 = null;
        Float f11 = null;
        Float f12 = null;
        Float f13 = null;
        Integer num = null;
        float fMo5467E = 0.0f;
        boolean z6 = true;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            switch (iMo10914s) {
                case -1:
                    z6 = false;
                    break;
                case 0:
                    fMo5467E = interfaceC10428aMo5471c.mo5467E(pluginGeneratedSerialDescriptor, 0);
                    i10 |= 1;
                    break;
                case 1:
                    f10 = (Float) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 1, C11125B.f33744a, f10);
                    i10 |= 2;
                    break;
                case 2:
                    f11 = (Float) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 2, C11125B.f33744a, f11);
                    i10 |= 4;
                    break;
                case 3:
                    f12 = (Float) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 3, C11125B.f33744a, f12);
                    i10 |= 8;
                    break;
                case 4:
                    f13 = (Float) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 4, C11125B.f33744a, f13);
                    i10 |= 16;
                    break;
                case 5:
                    num = (Integer) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 5, C11135I.f33763a, num);
                    i10 |= 32;
                    break;
                default:
                    throw new C8981m(iMo10914s);
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C1107j1(i10, fMo5467E, f10, f11, f12, f13, num);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C1107j1 value = (C1107j1) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        interfaceC10429bMo5570c.mo5578l(pluginGeneratedSerialDescriptor, 0, value.f3008a);
        boolean zMo5565F = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        Float f10 = value.f3009b;
        if (zMo5565F || f10 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 1, C11125B.f33744a, f10);
        }
        boolean zMo5565F2 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        Float f11 = value.f3010c;
        if (zMo5565F2 || f11 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 2, C11125B.f33744a, f11);
        }
        boolean zMo5565F3 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        Float f12 = value.f3011d;
        if (zMo5565F3 || f12 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 3, C11125B.f33744a, f12);
        }
        boolean zMo5565F4 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        Float f13 = value.f3012e;
        if (zMo5565F4 || f13 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 4, C11125B.f33744a, f13);
        }
        boolean zMo5565F5 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        Integer num = value.f3013f;
        if (zMo5565F5 || num != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 5, C11135I.f33763a, num);
        }
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
