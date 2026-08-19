package p623Zf;

import ao.AbstractC11153a0;
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

/* JADX INFO: renamed from: Zf.x */
/* JADX INFO: loaded from: classes3.dex */
public final class C10328x implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C10328x f30656a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C10328x c10328x = new C10328x();
        f30656a = c10328x;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.onboarding.OnboardingState", c10328x, 5);
        pluginGeneratedSerialDescriptor.m18453j("email", true);
        pluginGeneratedSerialDescriptor.m18453j("accountInfo", true);
        pluginGeneratedSerialDescriptor.m18453j("phoneVerificationId", true);
        pluginGeneratedSerialDescriptor.m18453j("againstTermsOfServiceSignUpTimestamp", true);
        pluginGeneratedSerialDescriptor.m18453j("config", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{AbstractC9961r4.m10615b(C11181o0.f33827a), AbstractC9961r4.m10615b(C10305a.f30598a), AbstractC9961r4.m10615b(C10299A.f30586a), AbstractC9961r4.m10615b(C7156i.f22754a), AbstractC9961r4.m10615b(C10325u.f30642a)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        boolean z6 = true;
        int i10 = 0;
        String str = null;
        C10307c c10307c = null;
        String str2 = null;
        C5551u c5551u = null;
        C10327w c10327w = null;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            if (iMo10914s == -1) {
                z6 = false;
            } else if (iMo10914s == 0) {
                str = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 0, C11181o0.f33827a, str);
                i10 |= 1;
            } else if (iMo10914s == 1) {
                c10307c = (C10307c) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 1, C10305a.f30598a, c10307c);
                i10 |= 2;
            } else if (iMo10914s == 2) {
                C10301C c10301c = (C10301C) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 2, C10299A.f30586a, str2 != null ? new C10301C(str2) : null);
                str2 = c10301c != null ? c10301c.f30587a : null;
                i10 |= 4;
            } else if (iMo10914s == 3) {
                c5551u = (C5551u) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 3, C7156i.f22754a, c5551u);
                i10 |= 8;
            } else {
                if (iMo10914s != 4) {
                    throw new C8981m(iMo10914s);
                }
                c10327w = (C10327w) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 4, C10325u.f30642a, c10327w);
                i10 |= 16;
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C10330z(i10, str, c10307c, str2, c5551u, c10327w);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C10330z value = (C10330z) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        boolean zMo5565F = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str = value.f30657a;
        if (zMo5565F || str != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 0, C11181o0.f33827a, str);
        }
        boolean zMo5565F2 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        C10307c c10307c = value.f30658b;
        if (zMo5565F2 || c10307c != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 1, C10305a.f30598a, c10307c);
        }
        boolean zMo5565F3 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str2 = value.f30659c;
        if (zMo5565F3 || str2 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 2, C10299A.f30586a, str2 != null ? new C10301C(str2) : null);
        }
        boolean zMo5565F4 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        C5551u c5551u = value.f30660d;
        if (zMo5565F4 || c5551u != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 3, C7156i.f22754a, c5551u);
        }
        boolean zMo5565F5 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        C10327w c10327w = value.f30661e;
        if (zMo5565F5 || c10327w != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 4, C10325u.f30642a, c10327w);
        }
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
