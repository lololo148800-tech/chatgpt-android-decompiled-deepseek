package p269Kh;

import ao.AbstractC11153a0;
import ao.C11164g;
import ao.C11181o0;
import ao.InterfaceC11127C;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
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
import p909nm.C17689w;

/* JADX INFO: renamed from: Kh.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C4681h implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C4681h f15232a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C4681h c4681h = new C4681h();
        f15232a = c4681h;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.models.model.Models.Category", c4681h, 14);
        pluginGeneratedSerialDescriptor.m18453j(DiagnosticsEntry.NAME_KEY, false);
        pluginGeneratedSerialDescriptor.m18453j("humanCategoryName", false);
        pluginGeneratedSerialDescriptor.m18453j("humanCategoryShortName", false);
        pluginGeneratedSerialDescriptor.m18453j("tagline", true);
        pluginGeneratedSerialDescriptor.m18453j("subscriptionLevel", false);
        pluginGeneratedSerialDescriptor.m18453j("defaultModel", false);
        pluginGeneratedSerialDescriptor.m18453j("browsingModel", true);
        pluginGeneratedSerialDescriptor.m18453j("codeInterpreterModel", true);
        pluginGeneratedSerialDescriptor.m18453j("pluginsModel", true);
        pluginGeneratedSerialDescriptor.m18453j("multimodalModel", true);
        pluginGeneratedSerialDescriptor.m18453j("dalleModel", true);
        pluginGeneratedSerialDescriptor.m18453j("iconFilledSrc", true);
        pluginGeneratedSerialDescriptor.m18453j("isInternalGroup", true);
        pluginGeneratedSerialDescriptor.m18453j("supportsFeatures", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = C4684k.f15235o;
        C11181o0 c11181o0 = C11181o0.f33827a;
        KSerializer kSerializerM10615b = AbstractC9961r4.m10615b(c11181o0);
        KSerializer kSerializer = kSerializerArr[4];
        C22012h1 c22012h1 = C22012h1.f69653a;
        return new KSerializer[]{c11181o0, c11181o0, c11181o0, kSerializerM10615b, kSerializer, c22012h1, AbstractC9961r4.m10615b(c22012h1), AbstractC9961r4.m10615b(c22012h1), AbstractC9961r4.m10615b(c22012h1), AbstractC9961r4.m10615b(c22012h1), AbstractC9961r4.m10615b(c22012h1), AbstractC9961r4.m10615b(c11181o0), C11164g.f33804a, kSerializerArr[13]};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C4684k.f15235o;
        String str = null;
        String str2 = null;
        String str3 = null;
        boolean z6 = true;
        String str4 = null;
        int i10 = 0;
        String strMo5483q = null;
        List list = null;
        String str5 = null;
        String str6 = null;
        EnumC4672A enumC4672A = null;
        String str7 = null;
        String str8 = null;
        String strMo5483q2 = null;
        String strMo5483q3 = null;
        boolean zMo5481o = false;
        while (z6) {
            boolean z10 = z6;
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            switch (iMo10914s) {
                case -1:
                    strMo5483q = strMo5483q;
                    z6 = false;
                    strMo5483q = strMo5483q;
                    break;
                case 0:
                    i10 |= 1;
                    strMo5483q = interfaceC10428aMo5471c.mo5483q(pluginGeneratedSerialDescriptor, 0);
                    z6 = z10;
                    break;
                case 1:
                    strMo5483q3 = interfaceC10428aMo5471c.mo5483q(pluginGeneratedSerialDescriptor, 1);
                    i10 |= 2;
                    z6 = z10;
                    break;
                case 2:
                    strMo5483q2 = interfaceC10428aMo5471c.mo5483q(pluginGeneratedSerialDescriptor, 2);
                    i10 |= 4;
                    z6 = z10;
                    break;
                case 3:
                    str6 = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 3, C11181o0.f33827a, str6);
                    i10 |= 8;
                    z6 = z10;
                    strMo5483q = strMo5483q;
                    break;
                case 4:
                    enumC4672A = (EnumC4672A) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 4, kSerializerArr[4], enumC4672A);
                    i10 |= 16;
                    z6 = z10;
                    strMo5483q = strMo5483q;
                    break;
                case 5:
                    C22020j1 c22020j1 = (C22020j1) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 5, C22012h1.f69653a, str7 != null ? new C22020j1(str7) : null);
                    str7 = c22020j1 != null ? c22020j1.f69665a : null;
                    i10 |= 32;
                    z6 = z10;
                    strMo5483q = strMo5483q;
                    break;
                case 6:
                    C22020j1 c22020j2 = (C22020j1) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 6, C22012h1.f69653a, str8 != null ? new C22020j1(str8) : null);
                    str8 = c22020j2 != null ? c22020j2.f69665a : null;
                    i10 |= 64;
                    z6 = z10;
                    strMo5483q = strMo5483q;
                    break;
                case 7:
                    C22020j1 c22020j3 = (C22020j1) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 7, C22012h1.f69653a, str4 != null ? new C22020j1(str4) : null);
                    str4 = c22020j3 != null ? c22020j3.f69665a : null;
                    i10 |= 128;
                    z6 = z10;
                    strMo5483q = strMo5483q;
                    break;
                case 8:
                    C22020j1 c22020j4 = (C22020j1) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 8, C22012h1.f69653a, str3 != null ? new C22020j1(str3) : null);
                    str3 = c22020j4 != null ? c22020j4.f69665a : null;
                    i10 |= 256;
                    z6 = z10;
                    strMo5483q = strMo5483q;
                    break;
                case 9:
                    C22020j1 c22020j5 = (C22020j1) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 9, C22012h1.f69653a, str2 != null ? new C22020j1(str2) : null);
                    str2 = c22020j5 != null ? c22020j5.f69665a : null;
                    i10 |= 512;
                    z6 = z10;
                    strMo5483q = strMo5483q;
                    break;
                case 10:
                    C22020j1 c22020j6 = (C22020j1) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 10, C22012h1.f69653a, str != null ? new C22020j1(str) : null);
                    str = c22020j6 != null ? c22020j6.f69665a : null;
                    i10 |= 1024;
                    z6 = z10;
                    strMo5483q = strMo5483q;
                    break;
                case 11:
                    str5 = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 11, C11181o0.f33827a, str5);
                    i10 |= 2048;
                    z6 = z10;
                    strMo5483q = strMo5483q;
                    break;
                case 12:
                    zMo5481o = interfaceC10428aMo5471c.mo5481o(pluginGeneratedSerialDescriptor, 12);
                    i10 |= 4096;
                    z6 = z10;
                    break;
                case 13:
                    list = (List) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 13, kSerializerArr[13], list);
                    i10 |= 8192;
                    z6 = z10;
                    strMo5483q = strMo5483q;
                    break;
                default:
                    throw new C8981m(iMo10914s);
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C4684k(i10, strMo5483q, strMo5483q3, strMo5483q2, str6, enumC4672A, str7, str8, str4, str3, str2, str, str5, zMo5481o, list);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C4684k value = (C4684k) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        interfaceC10429bMo5570c.mo5584r(pluginGeneratedSerialDescriptor, 0, value.f15236a);
        interfaceC10429bMo5570c.mo5584r(pluginGeneratedSerialDescriptor, 1, value.f15237b);
        interfaceC10429bMo5570c.mo5584r(pluginGeneratedSerialDescriptor, 2, value.f15238c);
        boolean zMo5565F = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str = value.f15239d;
        if (zMo5565F || str != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 3, C11181o0.f33827a, str);
        }
        KSerializer[] kSerializerArr = C4684k.f15235o;
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 4, kSerializerArr[4], value.f15240e);
        C22012h1 c22012h1 = C22012h1.f69653a;
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 5, c22012h1, new C22020j1(value.f15241f));
        boolean zMo5565F2 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str2 = value.f15242g;
        if (zMo5565F2 || str2 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 6, c22012h1, str2 != null ? new C22020j1(str2) : null);
        }
        boolean zMo5565F3 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str3 = value.f15243h;
        if (zMo5565F3 || str3 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 7, c22012h1, str3 != null ? new C22020j1(str3) : null);
        }
        boolean zMo5565F4 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str4 = value.f15244i;
        if (zMo5565F4 || str4 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 8, c22012h1, str4 != null ? new C22020j1(str4) : null);
        }
        boolean zMo5565F5 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str5 = value.f15245j;
        if (zMo5565F5 || str5 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 9, c22012h1, str5 != null ? new C22020j1(str5) : null);
        }
        boolean zMo5565F6 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str6 = value.f15246k;
        if (zMo5565F6 || str6 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 10, c22012h1, str6 != null ? new C22020j1(str6) : null);
        }
        boolean zMo5565F7 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str7 = value.f15247l;
        if (zMo5565F7 || str7 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 11, C11181o0.f33827a, str7);
        }
        boolean zMo5565F8 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        boolean z6 = value.f15248m;
        if (zMo5565F8 || z6) {
            interfaceC10429bMo5570c.mo5583q(pluginGeneratedSerialDescriptor, 12, z6);
        }
        boolean zMo5565F9 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        List list = value.f15249n;
        if (zMo5565F9 || !AbstractC16544l.m18089b(list, C17689w.f56480Y)) {
            interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 13, kSerializerArr[13], list);
        }
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
