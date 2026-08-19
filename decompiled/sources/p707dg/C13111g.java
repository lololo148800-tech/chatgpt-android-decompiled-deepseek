package p707dg;

import ao.AbstractC11153a0;
import ao.C11135I;
import ao.C11164g;
import ao.C11181o0;
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

/* JADX INFO: renamed from: dg.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C13111g implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C13111g f41631a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C13111g c13111g = new C13111g();
        f41631a = c13111g;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.onboarding.impl.api.model.request.PhoneSendVerifyRequest", c13111g, 5);
        pluginGeneratedSerialDescriptor.m18453j("phoneNumber", false);
        pluginGeneratedSerialDescriptor.m18453j("channel", true);
        pluginGeneratedSerialDescriptor.m18453j("countryIso", false);
        pluginGeneratedSerialDescriptor.m18453j("version", true);
        pluginGeneratedSerialDescriptor.m18453j("isMobile", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        C11181o0 c11181o0 = C11181o0.f33827a;
        return new KSerializer[]{c11181o0, c11181o0, c11181o0, C11135I.f33763a, C11164g.f33804a};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        int i10 = 0;
        int iMo5478l = 0;
        boolean zMo5481o = false;
        String strMo5483q = null;
        String strMo5483q2 = null;
        String strMo5483q3 = null;
        boolean z6 = true;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            if (iMo10914s == -1) {
                z6 = false;
            } else if (iMo10914s == 0) {
                strMo5483q = interfaceC10428aMo5471c.mo5483q(pluginGeneratedSerialDescriptor, 0);
                i10 |= 1;
            } else if (iMo10914s == 1) {
                strMo5483q2 = interfaceC10428aMo5471c.mo5483q(pluginGeneratedSerialDescriptor, 1);
                i10 |= 2;
            } else if (iMo10914s == 2) {
                strMo5483q3 = interfaceC10428aMo5471c.mo5483q(pluginGeneratedSerialDescriptor, 2);
                i10 |= 4;
            } else if (iMo10914s == 3) {
                iMo5478l = interfaceC10428aMo5471c.mo5478l(pluginGeneratedSerialDescriptor, 3);
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
        return new C13113i(i10, iMo5478l, strMo5483q, strMo5483q2, strMo5483q3, zMo5481o);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C13113i value = (C13113i) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        interfaceC10429bMo5570c.mo5584r(pluginGeneratedSerialDescriptor, 0, value.f41632a);
        boolean zMo5565F = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str = value.f41633b;
        if (zMo5565F || !AbstractC16544l.m18089b(str, "sms")) {
            interfaceC10429bMo5570c.mo5584r(pluginGeneratedSerialDescriptor, 1, str);
        }
        interfaceC10429bMo5570c.mo5584r(pluginGeneratedSerialDescriptor, 2, value.f41634c);
        boolean zMo5565F2 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        int i10 = value.f41635d;
        if (zMo5565F2 || i10 != 1) {
            interfaceC10429bMo5570c.mo5579m(3, i10, pluginGeneratedSerialDescriptor);
        }
        boolean zMo5565F3 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        boolean z6 = value.f41636e;
        if (zMo5565F3 || !z6) {
            interfaceC10429bMo5570c.mo5583q(pluginGeneratedSerialDescriptor, 4, z6);
        }
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
