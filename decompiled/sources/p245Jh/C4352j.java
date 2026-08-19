package p245Jh;

import ao.AbstractC11153a0;
import ao.C11181o0;
import ao.InterfaceC11127C;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import p1155zi.C22012h1;
import p1155zi.C22020j1;
import p559Wn.C8981m;
import p594Y9.AbstractC9961r4;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;

/* JADX INFO: renamed from: Jh.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C4352j implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C4352j f14154a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C4352j c4352j = new C4352j();
        f14154a = c4352j;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.models.api.ModelsResponseCategory", c4352j, 13);
        pluginGeneratedSerialDescriptor.m18453j("category", false);
        pluginGeneratedSerialDescriptor.m18453j("humanCategoryName", false);
        pluginGeneratedSerialDescriptor.m18453j("humanCategoryShortName", false);
        pluginGeneratedSerialDescriptor.m18453j("subscriptionLevel", false);
        pluginGeneratedSerialDescriptor.m18453j("defaultModel", false);
        pluginGeneratedSerialDescriptor.m18453j("browsingModel", true);
        pluginGeneratedSerialDescriptor.m18453j("codeInterpreterModel", true);
        pluginGeneratedSerialDescriptor.m18453j("pluginsModel", true);
        pluginGeneratedSerialDescriptor.m18453j("multimodalModel", true);
        pluginGeneratedSerialDescriptor.m18453j("dalleModel", true);
        pluginGeneratedSerialDescriptor.m18453j("tagline", true);
        pluginGeneratedSerialDescriptor.m18453j("iconFilledSrc", true);
        pluginGeneratedSerialDescriptor.m18453j("supportedFeatures", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = C4354l.f14155n;
        C11181o0 c11181o0 = C11181o0.f33827a;
        C22012h1 c22012h1 = C22012h1.f69653a;
        return new KSerializer[]{c11181o0, c11181o0, c11181o0, c11181o0, c22012h1, AbstractC9961r4.m10615b(c22012h1), AbstractC9961r4.m10615b(c22012h1), AbstractC9961r4.m10615b(c22012h1), AbstractC9961r4.m10615b(c22012h1), AbstractC9961r4.m10615b(c22012h1), AbstractC9961r4.m10615b(c11181o0), AbstractC9961r4.m10615b(c11181o0), AbstractC9961r4.m10615b(kSerializerArr[12])};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C4354l.f14155n;
        String str = null;
        String str2 = null;
        String str3 = null;
        boolean z6 = true;
        String str4 = null;
        int i10 = 0;
        String strMo5483q = null;
        String strMo5483q2 = null;
        List list = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String strMo5483q3 = null;
        String strMo5483q4 = null;
        while (z6) {
            boolean z10 = z6;
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            switch (iMo10914s) {
                case -1:
                    strMo5483q2 = strMo5483q2;
                    z6 = false;
                    strMo5483q2 = strMo5483q2;
                    break;
                case 0:
                    strMo5483q = interfaceC10428aMo5471c.mo5483q(pluginGeneratedSerialDescriptor, 0);
                    i10 |= 1;
                    z6 = z10;
                    strMo5483q2 = strMo5483q2;
                    break;
                case 1:
                    strMo5483q2 = interfaceC10428aMo5471c.mo5483q(pluginGeneratedSerialDescriptor, 1);
                    i10 |= 2;
                    z6 = z10;
                    break;
                case 2:
                    strMo5483q4 = interfaceC10428aMo5471c.mo5483q(pluginGeneratedSerialDescriptor, 2);
                    i10 |= 4;
                    z6 = z10;
                    break;
                case 3:
                    strMo5483q3 = interfaceC10428aMo5471c.mo5483q(pluginGeneratedSerialDescriptor, 3);
                    i10 |= 8;
                    z6 = z10;
                    break;
                case 4:
                    C22020j1 c22020j1 = (C22020j1) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 4, C22012h1.f69653a, str6 != null ? new C22020j1(str6) : null);
                    str6 = c22020j1 != null ? c22020j1.f69665a : null;
                    i10 |= 16;
                    z6 = z10;
                    strMo5483q2 = strMo5483q2;
                    break;
                case 5:
                    C22020j1 c22020j2 = (C22020j1) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 5, C22012h1.f69653a, str7 != null ? new C22020j1(str7) : null);
                    str7 = c22020j2 != null ? c22020j2.f69665a : null;
                    i10 |= 32;
                    z6 = z10;
                    strMo5483q2 = strMo5483q2;
                    break;
                case 6:
                    C22020j1 c22020j3 = (C22020j1) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 6, C22012h1.f69653a, str8 != null ? new C22020j1(str8) : null);
                    str8 = c22020j3 != null ? c22020j3.f69665a : null;
                    i10 |= 64;
                    z6 = z10;
                    strMo5483q2 = strMo5483q2;
                    break;
                case 7:
                    C22020j1 c22020j4 = (C22020j1) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 7, C22012h1.f69653a, str4 != null ? new C22020j1(str4) : null);
                    str4 = c22020j4 != null ? c22020j4.f69665a : null;
                    i10 |= 128;
                    z6 = z10;
                    strMo5483q2 = strMo5483q2;
                    break;
                case 8:
                    C22020j1 c22020j5 = (C22020j1) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 8, C22012h1.f69653a, str3 != null ? new C22020j1(str3) : null);
                    str3 = c22020j5 != null ? c22020j5.f69665a : null;
                    i10 |= 256;
                    z6 = z10;
                    strMo5483q2 = strMo5483q2;
                    break;
                case 9:
                    C22020j1 c22020j6 = (C22020j1) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 9, C22012h1.f69653a, str2 != null ? new C22020j1(str2) : null);
                    str2 = c22020j6 != null ? c22020j6.f69665a : null;
                    i10 |= 512;
                    z6 = z10;
                    strMo5483q2 = strMo5483q2;
                    break;
                case 10:
                    str = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 10, C11181o0.f33827a, str);
                    i10 |= 1024;
                    z6 = z10;
                    strMo5483q2 = strMo5483q2;
                    break;
                case 11:
                    str5 = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 11, C11181o0.f33827a, str5);
                    i10 |= 2048;
                    z6 = z10;
                    strMo5483q2 = strMo5483q2;
                    break;
                case 12:
                    list = (List) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 12, kSerializerArr[12], list);
                    i10 |= 4096;
                    z6 = z10;
                    strMo5483q2 = strMo5483q2;
                    break;
                default:
                    throw new C8981m(iMo10914s);
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C4354l(i10, strMo5483q, strMo5483q2, strMo5483q4, strMo5483q3, str6, str7, str8, str4, str3, str2, str, str5, list);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C4354l value = (C4354l) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        interfaceC10429bMo5570c.mo5584r(pluginGeneratedSerialDescriptor, 0, value.f14156a);
        interfaceC10429bMo5570c.mo5584r(pluginGeneratedSerialDescriptor, 1, value.f14157b);
        interfaceC10429bMo5570c.mo5584r(pluginGeneratedSerialDescriptor, 2, value.f14158c);
        interfaceC10429bMo5570c.mo5584r(pluginGeneratedSerialDescriptor, 3, value.f14159d);
        C22012h1 c22012h1 = C22012h1.f69653a;
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 4, c22012h1, new C22020j1(value.f14160e));
        boolean zMo5565F = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str = value.f14161f;
        if (zMo5565F || str != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 5, c22012h1, str != null ? new C22020j1(str) : null);
        }
        boolean zMo5565F2 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str2 = value.f14162g;
        if (zMo5565F2 || str2 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 6, c22012h1, str2 != null ? new C22020j1(str2) : null);
        }
        boolean zMo5565F3 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str3 = value.f14163h;
        if (zMo5565F3 || str3 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 7, c22012h1, str3 != null ? new C22020j1(str3) : null);
        }
        boolean zMo5565F4 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str4 = value.f14164i;
        if (zMo5565F4 || str4 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 8, c22012h1, str4 != null ? new C22020j1(str4) : null);
        }
        boolean zMo5565F5 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str5 = value.f14165j;
        if (zMo5565F5 || str5 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 9, c22012h1, str5 != null ? new C22020j1(str5) : null);
        }
        boolean zMo5565F6 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str6 = value.f14166k;
        if (zMo5565F6 || str6 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 10, C11181o0.f33827a, str6);
        }
        boolean zMo5565F7 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str7 = value.f14167l;
        if (zMo5565F7 || str7 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 11, C11181o0.f33827a, str7);
        }
        boolean zMo5565F8 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        List list = value.f14168m;
        if (zMo5565F8 || list != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 12, C4354l.f14155n[12], list);
        }
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
