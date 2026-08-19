package p040Bd;

import ao.AbstractC11153a0;
import ao.C11181o0;
import ao.InterfaceC11127C;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
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

/* JADX INFO: renamed from: Bd.G2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0926G2 implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C0926G2 f2672a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C0926G2 c0926g2 = new C0926G2();
        f2672a = c0926g2;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.api.message.ApiJitPluginData.FromServer.JitBody.Action", c0926g2, 6);
        pluginGeneratedSerialDescriptor.m18453j("type", false);
        pluginGeneratedSerialDescriptor.m18453j(DiagnosticsEntry.NAME_KEY, false);
        pluginGeneratedSerialDescriptor.m18453j("oauthRedirect", true);
        pluginGeneratedSerialDescriptor.m18453j("allow", true);
        pluginGeneratedSerialDescriptor.m18453j("alwaysAllow", true);
        pluginGeneratedSerialDescriptor.m18453j("deny", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        C11181o0 c11181o0 = C11181o0.f33827a;
        return new KSerializer[]{AbstractC9961r4.m10615b(c11181o0), AbstractC9961r4.m10615b(c11181o0), AbstractC9961r4.m10615b(C0991R2.f2777a), AbstractC9961r4.m10615b(C0932H2.f2680a), AbstractC9961r4.m10615b(C0950K2.f2711a), AbstractC9961r4.m10615b(C0974O2.f2754a)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        int i10 = 0;
        String str = null;
        String str2 = null;
        C1003T2 c1003t2 = null;
        C0944J2 c0944j2 = null;
        C0962M2 c0962m2 = null;
        C0986Q2 c0986q2 = null;
        boolean z6 = true;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            switch (iMo10914s) {
                case -1:
                    z6 = false;
                    break;
                case 0:
                    str = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 0, C11181o0.f33827a, str);
                    i10 |= 1;
                    break;
                case 1:
                    str2 = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 1, C11181o0.f33827a, str2);
                    i10 |= 2;
                    break;
                case 2:
                    c1003t2 = (C1003T2) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 2, C0991R2.f2777a, c1003t2);
                    i10 |= 4;
                    break;
                case 3:
                    c0944j2 = (C0944J2) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 3, C0932H2.f2680a, c0944j2);
                    i10 |= 8;
                    break;
                case 4:
                    c0962m2 = (C0962M2) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 4, C0950K2.f2711a, c0962m2);
                    i10 |= 16;
                    break;
                case 5:
                    c0986q2 = (C0986Q2) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 5, C0974O2.f2754a, c0986q2);
                    i10 |= 32;
                    break;
                default:
                    throw new C8981m(iMo10914s);
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C1009U2(i10, str, str2, c1003t2, c0944j2, c0962m2, c0986q2);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C1009U2 value = (C1009U2) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        C11181o0 c11181o0 = C11181o0.f33827a;
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 0, c11181o0, value.f2804a);
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 1, c11181o0, value.f2805b);
        boolean zMo5565F = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        C1003T2 c1003t2 = value.f2806c;
        if (zMo5565F || c1003t2 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 2, C0991R2.f2777a, c1003t2);
        }
        boolean zMo5565F2 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        C0944J2 c0944j2 = value.f2807d;
        if (zMo5565F2 || c0944j2 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 3, C0932H2.f2680a, c0944j2);
        }
        boolean zMo5565F3 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        C0962M2 c0962m2 = value.f2808e;
        if (zMo5565F3 || c0962m2 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 4, C0950K2.f2711a, c0962m2);
        }
        boolean zMo5565F4 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        C0986Q2 c0986q2 = value.f2809f;
        if (zMo5565F4 || c0986q2 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 5, C0974O2.f2754a, c0986q2);
        }
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
