package eg;

import ao.AbstractC11153a0;
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

/* JADX INFO: renamed from: eg.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C13390m implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C13390m f42437a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C13390m c13390m = new C13390m();
        f42437a = c13390m;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.onboarding.impl.api.model.response.OpenAIApiError", c13390m, 2);
        pluginGeneratedSerialDescriptor.m18453j("error", false);
        pluginGeneratedSerialDescriptor.m18453j("displayMessage", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{C13393p.f42441a, C11181o0.f33827a};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        C13395r c13395r = null;
        boolean z6 = true;
        String strMo5483q = null;
        int i10 = 0;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            if (iMo10914s == -1) {
                z6 = false;
            } else if (iMo10914s == 0) {
                c13395r = (C13395r) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 0, C13393p.f42441a, c13395r);
                i10 |= 1;
            } else {
                if (iMo10914s != 1) {
                    throw new C8981m(iMo10914s);
                }
                strMo5483q = interfaceC10428aMo5471c.mo5483q(pluginGeneratedSerialDescriptor, 1);
                i10 |= 2;
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C13396s(i10, c13395r, strMo5483q);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C13396s value = (C13396s) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        C13392o c13392o = C13396s.Companion;
        C13393p c13393p = C13393p.f42441a;
        C13395r c13395r = value.f42447Y;
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 0, c13393p, c13395r);
        boolean zMo5565F = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str = value.f42448Z;
        if (zMo5565F || !AbstractC16544l.m18089b(str, c13395r.f42442a)) {
            interfaceC10429bMo5570c.mo5584r(pluginGeneratedSerialDescriptor, 1, str);
        }
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
