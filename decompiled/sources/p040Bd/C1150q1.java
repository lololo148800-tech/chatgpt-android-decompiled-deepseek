package p040Bd;

import ao.AbstractC11153a0;
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

/* JADX INFO: renamed from: Bd.q1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1150q1 implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C1150q1 f3075a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C1150q1 c1150q1 = new C1150q1();
        f3075a = c1150q1;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.api.message.ApiContentReference.Stock.TradingPeriod", c1150q1, 3);
        pluginGeneratedSerialDescriptor.m18453j("regular", true);
        pluginGeneratedSerialDescriptor.m18453j("preMarket", true);
        pluginGeneratedSerialDescriptor.m18453j("afterHours", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        C1135n4 c1135n4 = C1135n4.f3051a;
        return new KSerializer[]{AbstractC9961r4.m10615b(c1135n4), AbstractC9961r4.m10615b(c1135n4), AbstractC9961r4.m10615b(c1135n4)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        C1147p4 c1147p4 = null;
        boolean z6 = true;
        C1147p4 c1147p5 = null;
        C1147p4 c1147p6 = null;
        int i10 = 0;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            if (iMo10914s == -1) {
                z6 = false;
            } else if (iMo10914s == 0) {
                c1147p4 = (C1147p4) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 0, C1135n4.f3051a, c1147p4);
                i10 |= 1;
            } else if (iMo10914s == 1) {
                c1147p5 = (C1147p4) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 1, C1135n4.f3051a, c1147p5);
                i10 |= 2;
            } else {
                if (iMo10914s != 2) {
                    throw new C8981m(iMo10914s);
                }
                c1147p6 = (C1147p4) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 2, C1135n4.f3051a, c1147p6);
                i10 |= 4;
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C1162s1(i10, c1147p4, c1147p5, c1147p6);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C1162s1 value = (C1162s1) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        boolean zMo5565F = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        C1147p4 c1147p4 = value.f3085a;
        if (zMo5565F || c1147p4 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 0, C1135n4.f3051a, c1147p4);
        }
        boolean zMo5565F2 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        C1147p4 c1147p5 = value.f3086b;
        if (zMo5565F2 || c1147p5 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 1, C1135n4.f3051a, c1147p5);
        }
        boolean zMo5565F3 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        C1147p4 c1147p6 = value.f3087c;
        if (zMo5565F3 || c1147p6 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 2, C1135n4.f3051a, c1147p6);
        }
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
