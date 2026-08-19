package p707dg;

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
import p559Wn.C8981m;
import p594Y9.AbstractC9961r4;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;

/* JADX INFO: renamed from: dg.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C13105a implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C13105a f41620a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C13105a c13105a = new C13105a();
        f41620a = c13105a;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.onboarding.impl.api.model.request.CreateAccountRequest", c13105a, 6);
        pluginGeneratedSerialDescriptor.m18453j("app", true);
        pluginGeneratedSerialDescriptor.m18453j("firstName", false);
        pluginGeneratedSerialDescriptor.m18453j("lastName", false);
        pluginGeneratedSerialDescriptor.m18453j("birthdate", false);
        pluginGeneratedSerialDescriptor.m18453j("phoneVerificationId", false);
        pluginGeneratedSerialDescriptor.m18453j("isMobile", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        C11181o0 c11181o0 = C11181o0.f33827a;
        return new KSerializer[]{c11181o0, c11181o0, c11181o0, c11181o0, AbstractC9961r4.m10615b(c11181o0), C11164g.f33804a};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        String strMo5483q = null;
        String strMo5483q2 = null;
        String strMo5483q3 = null;
        String strMo5483q4 = null;
        String str = null;
        int i10 = 0;
        boolean zMo5481o = false;
        boolean z6 = true;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            switch (iMo10914s) {
                case -1:
                    z6 = false;
                    break;
                case 0:
                    strMo5483q = interfaceC10428aMo5471c.mo5483q(pluginGeneratedSerialDescriptor, 0);
                    i10 |= 1;
                    break;
                case 1:
                    strMo5483q2 = interfaceC10428aMo5471c.mo5483q(pluginGeneratedSerialDescriptor, 1);
                    i10 |= 2;
                    break;
                case 2:
                    strMo5483q3 = interfaceC10428aMo5471c.mo5483q(pluginGeneratedSerialDescriptor, 2);
                    i10 |= 4;
                    break;
                case 3:
                    strMo5483q4 = interfaceC10428aMo5471c.mo5483q(pluginGeneratedSerialDescriptor, 3);
                    i10 |= 8;
                    break;
                case 4:
                    str = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 4, C11181o0.f33827a, str);
                    i10 |= 16;
                    break;
                case 5:
                    zMo5481o = interfaceC10428aMo5471c.mo5481o(pluginGeneratedSerialDescriptor, 5);
                    i10 |= 32;
                    break;
                default:
                    throw new C8981m(iMo10914s);
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C13107c(i10, strMo5483q, strMo5483q2, strMo5483q3, strMo5483q4, str, zMo5481o);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C13107c value = (C13107c) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        boolean zMo5565F = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str = value.f41621a;
        if (zMo5565F || !AbstractC16544l.m18089b(str, "androidchat")) {
            interfaceC10429bMo5570c.mo5584r(pluginGeneratedSerialDescriptor, 0, str);
        }
        interfaceC10429bMo5570c.mo5584r(pluginGeneratedSerialDescriptor, 1, value.f41622b);
        interfaceC10429bMo5570c.mo5584r(pluginGeneratedSerialDescriptor, 2, value.f41623c);
        interfaceC10429bMo5570c.mo5584r(pluginGeneratedSerialDescriptor, 3, value.f41624d);
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 4, C11181o0.f33827a, value.f41625e);
        boolean zMo5565F2 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        boolean z6 = value.f41626f;
        if (zMo5565F2 || !z6) {
            interfaceC10429bMo5570c.mo5583q(pluginGeneratedSerialDescriptor, 5, z6);
        }
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
