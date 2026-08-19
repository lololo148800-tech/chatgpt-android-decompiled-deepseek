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

/* JADX INFO: renamed from: Bd.n1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1132n1 implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C1132n1 f3050a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C1132n1 c1132n1 = new C1132n1();
        f3050a = c1132n1;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.api.message.ApiContentReference.Stock.StockDetails", c1132n1, 3);
        pluginGeneratedSerialDescriptor.m18453j("asset", false);
        pluginGeneratedSerialDescriptor.m18453j("price", false);
        pluginGeneratedSerialDescriptor.m18453j("histories", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{AbstractC9961r4.m10615b(C1044a1.f2869a), AbstractC9961r4.m10615b(C1093h1.f2992a), AbstractC9961r4.m10615b(C1072e1.f2921a)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        C1058c1 c1058c1 = null;
        boolean z6 = true;
        C1107j1 c1107j1 = null;
        C1086g1 c1086g1 = null;
        int i10 = 0;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            if (iMo10914s == -1) {
                z6 = false;
            } else if (iMo10914s == 0) {
                c1058c1 = (C1058c1) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 0, C1044a1.f2869a, c1058c1);
                i10 |= 1;
            } else if (iMo10914s == 1) {
                c1107j1 = (C1107j1) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 1, C1093h1.f2992a, c1107j1);
                i10 |= 2;
            } else {
                if (iMo10914s != 2) {
                    throw new C8981m(iMo10914s);
                }
                c1086g1 = (C1086g1) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 2, C1072e1.f2921a, c1086g1);
                i10 |= 4;
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C1144p1(i10, c1058c1, c1107j1, c1086g1);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C1144p1 value = (C1144p1) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 0, C1044a1.f2869a, value.f3061a);
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 1, C1093h1.f2992a, value.f3062b);
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 2, C1072e1.f2921a, value.f3063c);
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
