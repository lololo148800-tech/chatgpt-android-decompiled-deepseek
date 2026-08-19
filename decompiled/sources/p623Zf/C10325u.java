package p623Zf;

import ao.AbstractC11153a0;
import ao.C11164g;
import ao.C11181o0;
import ao.InterfaceC11127C;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import p102Dm.AbstractC2119a;
import p324Mn.C5554x;
import p463Sn.C7157j;
import p559Wn.C8981m;
import p594Y9.AbstractC9961r4;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;
import p872lg.EnumC16949i;
import p909nm.C17689w;

/* JADX INFO: renamed from: Zf.u */
/* JADX INFO: loaded from: classes3.dex */
public final class C10325u implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C10325u f30642a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C10325u c10325u = new C10325u();
        f30642a = c10325u;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.onboarding.OnboardingConfig", c10325u, 11);
        pluginGeneratedSerialDescriptor.m18453j("firstName", true);
        pluginGeneratedSerialDescriptor.m18453j("lastName", true);
        pluginGeneratedSerialDescriptor.m18453j("collectEmailNatively", true);
        pluginGeneratedSerialDescriptor.m18453j("email", true);
        pluginGeneratedSerialDescriptor.m18453j("emailVerified", true);
        pluginGeneratedSerialDescriptor.m18453j("phoneVerificationRequired", true);
        pluginGeneratedSerialDescriptor.m18453j("defaultCountry", true);
        pluginGeneratedSerialDescriptor.m18453j("maxBirthDate", true);
        pluginGeneratedSerialDescriptor.m18453j("countries", true);
        pluginGeneratedSerialDescriptor.m18453j("inquiryId", true);
        pluginGeneratedSerialDescriptor.m18453j("inquiryStatus", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = C10327w.f30643l;
        C11181o0 c11181o0 = C11181o0.f33827a;
        KSerializer kSerializerM10615b = AbstractC9961r4.m10615b(c11181o0);
        KSerializer kSerializerM10615b2 = AbstractC9961r4.m10615b(c11181o0);
        KSerializer kSerializerM10615b3 = AbstractC9961r4.m10615b(c11181o0);
        KSerializer kSerializer = kSerializerArr[8];
        KSerializer kSerializerM10615b4 = AbstractC9961r4.m10615b(c11181o0);
        KSerializer kSerializer2 = kSerializerArr[10];
        C11164g c11164g = C11164g.f33804a;
        return new KSerializer[]{kSerializerM10615b, kSerializerM10615b2, c11164g, kSerializerM10615b3, c11164g, c11164g, c11181o0, C7157j.f22756a, kSerializer, kSerializerM10615b4, kSerializer2};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C10327w.f30643l;
        List list = null;
        EnumC16949i enumC16949i = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String strMo5483q = null;
        C5554x c5554x = null;
        int i10 = 0;
        boolean zMo5481o = false;
        boolean zMo5481o2 = false;
        boolean zMo5481o3 = false;
        boolean z6 = true;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            switch (iMo10914s) {
                case -1:
                    z6 = false;
                    break;
                case 0:
                    str2 = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 0, C11181o0.f33827a, str2);
                    i10 |= 1;
                    break;
                case 1:
                    str3 = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 1, C11181o0.f33827a, str3);
                    i10 |= 2;
                    break;
                case 2:
                    zMo5481o = interfaceC10428aMo5471c.mo5481o(pluginGeneratedSerialDescriptor, 2);
                    i10 |= 4;
                    continue;
                case 3:
                    str4 = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 3, C11181o0.f33827a, str4);
                    i10 |= 8;
                    break;
                case 4:
                    zMo5481o2 = interfaceC10428aMo5471c.mo5481o(pluginGeneratedSerialDescriptor, 4);
                    i10 |= 16;
                    continue;
                case 5:
                    zMo5481o3 = interfaceC10428aMo5471c.mo5481o(pluginGeneratedSerialDescriptor, 5);
                    i10 |= 32;
                    continue;
                case 6:
                    strMo5483q = interfaceC10428aMo5471c.mo5483q(pluginGeneratedSerialDescriptor, 6);
                    i10 |= 64;
                    continue;
                case 7:
                    c5554x = (C5554x) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 7, C7157j.f22756a, c5554x);
                    i10 |= 128;
                    break;
                case 8:
                    list = (List) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 8, kSerializerArr[8], list);
                    i10 |= 256;
                    break;
                case 9:
                    str = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 9, C11181o0.f33827a, str);
                    i10 |= 512;
                    break;
                case 10:
                    enumC16949i = (EnumC16949i) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 10, kSerializerArr[10], enumC16949i);
                    i10 |= 1024;
                    break;
                default:
                    throw new C8981m(iMo10914s);
            }
            strMo5483q = strMo5483q;
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C10327w(i10, str2, str3, zMo5481o, str4, zMo5481o2, zMo5481o3, strMo5483q, c5554x, list, str, enumC16949i);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0090  */
    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C10327w value = (C10327w) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        C10326v c10326v = C10327w.Companion;
        boolean zMo5565F = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str = value.f30645a;
        if (zMo5565F || str != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 0, C11181o0.f33827a, str);
        }
        boolean zMo5565F2 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str2 = value.f30646b;
        if (zMo5565F2 || str2 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 1, C11181o0.f33827a, str2);
        }
        boolean zMo5565F3 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        boolean z6 = value.f30647c;
        if (zMo5565F3 || z6) {
            interfaceC10429bMo5570c.mo5583q(pluginGeneratedSerialDescriptor, 2, z6);
        }
        boolean zMo5565F4 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str3 = value.f30648d;
        if (zMo5565F4 || str3 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 3, C11181o0.f33827a, str3);
        }
        boolean zMo5565F5 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        boolean z10 = value.f30649e;
        if (zMo5565F5 || z10) {
            interfaceC10429bMo5570c.mo5583q(pluginGeneratedSerialDescriptor, 4, z10);
        }
        boolean zMo5565F6 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        boolean z11 = value.f30650f;
        if (zMo5565F6 || z11) {
            interfaceC10429bMo5570c.mo5583q(pluginGeneratedSerialDescriptor, 5, z11);
        }
        boolean zMo5565F7 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str4 = value.f30651g;
        if (zMo5565F7) {
            interfaceC10429bMo5570c.mo5584r(pluginGeneratedSerialDescriptor, 6, str4);
        } else {
            String country = Locale.getDefault().getCountry();
            AbstractC16544l.m18093f(country, "getCountry(...)");
            if (!AbstractC16544l.m18089b(str4, country)) {
                interfaceC10429bMo5570c.mo5584r(pluginGeneratedSerialDescriptor, 6, str4);
            }
        }
        boolean zMo5565F8 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        C5554x c5554x = value.f30652h;
        if (zMo5565F8 || !AbstractC16544l.m18089b(c5554x, AbstractC2119a.m3193g())) {
            interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 7, C7157j.f22756a, c5554x);
        }
        boolean zMo5565F9 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C10327w.f30643l;
        List list = value.f30653i;
        if (zMo5565F9 || !AbstractC16544l.m18089b(list, C17689w.f56480Y)) {
            interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 8, kSerializerArr[8], list);
        }
        boolean zMo5565F10 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str5 = value.f30654j;
        if (zMo5565F10 || str5 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 9, C11181o0.f33827a, str5);
        }
        boolean zMo5565F11 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        EnumC16949i enumC16949i = value.f30655k;
        if (zMo5565F11 || enumC16949i != EnumC16949i.f54401o0) {
            interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 10, kSerializerArr[10], enumC16949i);
        }
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
