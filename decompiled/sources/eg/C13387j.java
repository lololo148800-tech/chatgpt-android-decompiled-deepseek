package eg;

import ao.AbstractC11153a0;
import ao.C11164g;
import ao.C11181o0;
import ao.InterfaceC11127C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import p324Mn.C5551u;
import p463Sn.C7156i;
import p559Wn.C8981m;
import p594Y9.AbstractC9961r4;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;

/* JADX INFO: renamed from: eg.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C13387j implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C13387j f42433a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C13387j c13387j = new C13387j();
        f42433a = c13387j;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.onboarding.impl.api.model.response.OnboardLoginResponse", c13387j, 3);
        pluginGeneratedSerialDescriptor.m18453j("phoneException", true);
        pluginGeneratedSerialDescriptor.m18453j("ipCountry", true);
        pluginGeneratedSerialDescriptor.m18453j("maxBirthDateUtc", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{AbstractC9961r4.m10615b(C11164g.f33804a), AbstractC9961r4.m10615b(C11181o0.f33827a), AbstractC9961r4.m10615b(C7156i.f22754a)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        Boolean bool = null;
        boolean z6 = true;
        String str = null;
        C5551u c5551u = null;
        int i10 = 0;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            if (iMo10914s == -1) {
                z6 = false;
            } else if (iMo10914s == 0) {
                bool = (Boolean) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 0, C11164g.f33804a, bool);
                i10 |= 1;
            } else if (iMo10914s == 1) {
                str = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 1, C11181o0.f33827a, str);
                i10 |= 2;
            } else {
                if (iMo10914s != 2) {
                    throw new C8981m(iMo10914s);
                }
                c5551u = (C5551u) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 2, C7156i.f22754a, c5551u);
                i10 |= 4;
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C13389l(i10, bool, str, c5551u);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C13389l value = (C13389l) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        boolean zMo5565F = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        Boolean bool = value.f42434a;
        if (zMo5565F || bool != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 0, C11164g.f33804a, bool);
        }
        boolean zMo5565F2 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str = value.f42435b;
        if (zMo5565F2 || str != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 1, C11181o0.f33827a, str);
        }
        boolean zMo5565F3 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        C5551u c5551u = value.f42436c;
        if (zMo5565F3 || c5551u != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 2, C7156i.f22754a, c5551u);
        }
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
