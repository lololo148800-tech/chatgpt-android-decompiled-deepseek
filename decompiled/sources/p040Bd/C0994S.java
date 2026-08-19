package p040Bd;

import ao.AbstractC11153a0;
import ao.InterfaceC11127C;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import p559Wn.C8981m;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;

/* JADX INFO: renamed from: Bd.S */
/* JADX INFO: loaded from: classes3.dex */
public final class C0994S implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C0994S f2779a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C0994S c0994s = new C0994S();
        f2779a = c0994s;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.api.message.ApiContentReference.Forecast.ForecastResponse", c0994s, 4);
        pluginGeneratedSerialDescriptor.m18453j("location", false);
        pluginGeneratedSerialDescriptor.m18453j("current", false);
        pluginGeneratedSerialDescriptor.m18453j("daily", false);
        pluginGeneratedSerialDescriptor.m18453j("hourly", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = C1085g0.f2938e;
        return new KSerializer[]{C1006U.f2802a, C1024X.f2837a, kSerializerArr[2], kSerializerArr[3]};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C1085g0.f2938e;
        C1018W c1018w = null;
        C1078f0 c1078f0 = null;
        List list = null;
        List list2 = null;
        int i10 = 0;
        boolean z6 = true;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            if (iMo10914s == -1) {
                z6 = false;
            } else if (iMo10914s == 0) {
                c1018w = (C1018W) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 0, C1006U.f2802a, c1018w);
                i10 |= 1;
            } else if (iMo10914s == 1) {
                c1078f0 = (C1078f0) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 1, C1024X.f2837a, c1078f0);
                i10 |= 2;
            } else if (iMo10914s == 2) {
                list = (List) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 2, kSerializerArr[2], list);
                i10 |= 4;
            } else {
                if (iMo10914s != 3) {
                    throw new C8981m(iMo10914s);
                }
                list2 = (List) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 3, kSerializerArr[3], list2);
                i10 |= 8;
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C1085g0(i10, c1018w, c1078f0, list, list2);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C1085g0 value = (C1085g0) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        C1000T c1000t = C1085g0.Companion;
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 0, C1006U.f2802a, value.f2939a);
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 1, C1024X.f2837a, value.f2940b);
        KSerializer[] kSerializerArr = C1085g0.f2938e;
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 2, kSerializerArr[2], value.f2941c);
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 3, kSerializerArr[3], value.f2942d);
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
