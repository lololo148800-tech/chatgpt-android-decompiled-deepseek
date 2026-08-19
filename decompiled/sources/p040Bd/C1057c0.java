package p040Bd;

import ao.AbstractC11153a0;
import ao.C11192u;
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

/* JADX INFO: renamed from: Bd.c0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1057c0 implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C1057c0 f2891a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C1057c0 c1057c0 = new C1057c0();
        f2891a = c1057c0;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.api.message.ApiContentReference.Forecast.ForecastResponse.Weather.Temperature", c1057c0, 3);
        pluginGeneratedSerialDescriptor.m18453j("current", true);
        pluginGeneratedSerialDescriptor.m18453j("min", true);
        pluginGeneratedSerialDescriptor.m18453j("max", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        C11192u c11192u = C11192u.f33846a;
        return new KSerializer[]{AbstractC9961r4.m10615b(c11192u), AbstractC9961r4.m10615b(c11192u), AbstractC9961r4.m10615b(c11192u)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        Double d10 = null;
        boolean z6 = true;
        Double d11 = null;
        Double d12 = null;
        int i10 = 0;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            if (iMo10914s == -1) {
                z6 = false;
            } else if (iMo10914s == 0) {
                d10 = (Double) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 0, C11192u.f33846a, d10);
                i10 |= 1;
            } else if (iMo10914s == 1) {
                d11 = (Double) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 1, C11192u.f33846a, d11);
                i10 |= 2;
            } else {
                if (iMo10914s != 2) {
                    throw new C8981m(iMo10914s);
                }
                d12 = (Double) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 2, C11192u.f33846a, d12);
                i10 |= 4;
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C1071e0(i10, d10, d11, d12);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C1071e0 value = (C1071e0) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        boolean zMo5565F = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        Double d10 = value.f2918a;
        if (zMo5565F || d10 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 0, C11192u.f33846a, d10);
        }
        boolean zMo5565F2 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        Double d11 = value.f2919b;
        if (zMo5565F2 || d11 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 1, C11192u.f33846a, d11);
        }
        boolean zMo5565F3 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        Double d12 = value.f2920c;
        if (zMo5565F3 || d12 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 2, C11192u.f33846a, d12);
        }
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
