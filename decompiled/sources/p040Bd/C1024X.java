package p040Bd;

import ao.AbstractC11153a0;
import ao.C11141O;
import ao.C11164g;
import ao.C11192u;
import ao.InterfaceC11127C;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import p559Wn.C8981m;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;

/* JADX INFO: renamed from: Bd.X */
/* JADX INFO: loaded from: classes3.dex */
public final class C1024X implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C1024X f2837a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C1024X c1024x = new C1024X();
        f2837a = c1024x;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.api.message.ApiContentReference.Forecast.ForecastResponse.Weather", c1024x, 5);
        pluginGeneratedSerialDescriptor.m18453j("description", false);
        pluginGeneratedSerialDescriptor.m18453j("temperature", false);
        pluginGeneratedSerialDescriptor.m18453j(DiagnosticsEntry.TIMESTAMP_KEY, false);
        pluginGeneratedSerialDescriptor.m18453j("utcOffsetSec", false);
        pluginGeneratedSerialDescriptor.m18453j("night", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{C1036Z.f2863a, C1057c0.f2891a, C11141O.f33773a, C11192u.f33846a, C11164g.f33804a};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        C1050b0 c1050b0 = null;
        C1071e0 c1071e0 = null;
        int i10 = 0;
        boolean zMo5481o = false;
        long jMo5476i = 0;
        double dMo5489x = 0.0d;
        boolean z6 = true;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            if (iMo10914s == -1) {
                z6 = false;
            } else if (iMo10914s == 0) {
                c1050b0 = (C1050b0) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 0, C1036Z.f2863a, c1050b0);
                i10 |= 1;
            } else if (iMo10914s == 1) {
                c1071e0 = (C1071e0) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 1, C1057c0.f2891a, c1071e0);
                i10 |= 2;
            } else if (iMo10914s == 2) {
                jMo5476i = interfaceC10428aMo5471c.mo5476i(pluginGeneratedSerialDescriptor, 2);
                i10 |= 4;
            } else if (iMo10914s == 3) {
                dMo5489x = interfaceC10428aMo5471c.mo5489x(pluginGeneratedSerialDescriptor, 3);
                i10 |= 8;
            } else {
                if (iMo10914s != 4) {
                    throw new C8981m(iMo10914s);
                }
                zMo5481o = interfaceC10428aMo5471c.mo5481o(pluginGeneratedSerialDescriptor, 4);
                i10 |= 16;
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C1078f0(i10, c1050b0, c1071e0, jMo5476i, dMo5489x, zMo5481o);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C1078f0 value = (C1078f0) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 0, C1036Z.f2863a, value.f2931a);
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 1, C1057c0.f2891a, value.f2932b);
        interfaceC10429bMo5570c.mo5564E(pluginGeneratedSerialDescriptor, 2, value.f2933c);
        interfaceC10429bMo5570c.mo5561B(pluginGeneratedSerialDescriptor, 3, value.f2934d);
        interfaceC10429bMo5570c.mo5583q(pluginGeneratedSerialDescriptor, 4, value.f2935e);
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
