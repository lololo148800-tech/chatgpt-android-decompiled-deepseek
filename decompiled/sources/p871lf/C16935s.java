package p871lf;

import ao.AbstractC11153a0;
import ao.C11164g;
import ao.InterfaceC11127C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import p559Wn.C8981m;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;

/* JADX INFO: renamed from: lf.s */
/* JADX INFO: loaded from: classes3.dex */
public final class C16935s implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C16935s f54383a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C16935s c16935s = new C16935s();
        f54383a = c16935s;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.jawbone.models.JawboneSetStatusRequest", c16935s, 2);
        pluginGeneratedSerialDescriptor.m18453j("jawboneId", false);
        pluginGeneratedSerialDescriptor.m18453j("isEnabled", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{C16932p.f54381a, C11164g.f33804a};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        boolean z6 = true;
        String str = null;
        int i10 = 0;
        boolean zMo5481o = false;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            if (iMo10914s == -1) {
                z6 = false;
            } else if (iMo10914s == 0) {
                C16934r c16934r = (C16934r) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 0, C16932p.f54381a, str != null ? new C16934r(str) : null);
                str = c16934r != null ? c16934r.f54382a : null;
                i10 |= 1;
            } else {
                if (iMo10914s != 1) {
                    throw new C8981m(iMo10914s);
                }
                zMo5481o = interfaceC10428aMo5471c.mo5481o(pluginGeneratedSerialDescriptor, 1);
                i10 |= 2;
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C16937u(str, i10, zMo5481o);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C16937u value = (C16937u) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 0, C16932p.f54381a, new C16934r(value.f54384a));
        interfaceC10429bMo5570c.mo5583q(pluginGeneratedSerialDescriptor, 1, value.f54385b);
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
