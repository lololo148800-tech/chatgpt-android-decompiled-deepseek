package p040Bd;

import android.gov.nist.javax.sip.header.ParameterNames;
import ao.AbstractC11153a0;
import ao.C11135I;
import ao.C11164g;
import ao.C11181o0;
import ao.C11192u;
import ao.InterfaceC11127C;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.List;
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

/* JADX INFO: renamed from: Bd.r */
/* JADX INFO: loaded from: classes3.dex */
public final class C1154r implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C1154r f3076a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C1154r c1154r = new C1154r();
        f3076a = c1154r;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.api.message.ApiContentReference.BusinessesMap.Business", c1154r, 20);
        pluginGeneratedSerialDescriptor.m18453j(ParameterNames.f31999ID, false);
        pluginGeneratedSerialDescriptor.m18453j("provider", false);
        pluginGeneratedSerialDescriptor.m18453j("providerUrl", false);
        pluginGeneratedSerialDescriptor.m18453j("latitude", false);
        pluginGeneratedSerialDescriptor.m18453j("longitude", false);
        pluginGeneratedSerialDescriptor.m18453j(DiagnosticsEntry.NAME_KEY, false);
        pluginGeneratedSerialDescriptor.m18453j("address", true);
        pluginGeneratedSerialDescriptor.m18453j("description", true);
        pluginGeneratedSerialDescriptor.m18453j("descriptionCite", true);
        pluginGeneratedSerialDescriptor.m18453j("imageUrl", true);
        pluginGeneratedSerialDescriptor.m18453j("imageUrls", true);
        pluginGeneratedSerialDescriptor.m18453j("rating", true);
        pluginGeneratedSerialDescriptor.m18453j("reviewCount", true);
        pluginGeneratedSerialDescriptor.m18453j("price", true);
        pluginGeneratedSerialDescriptor.m18453j("categories", true);
        pluginGeneratedSerialDescriptor.m18453j("websiteUrl", true);
        pluginGeneratedSerialDescriptor.m18453j("hours", true);
        pluginGeneratedSerialDescriptor.m18453j("isOpen", true);
        pluginGeneratedSerialDescriptor.m18453j("nextOpenHour", true);
        pluginGeneratedSerialDescriptor.m18453j("phone", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = C1166t.f3090u;
        C11181o0 c11181o0 = C11181o0.f33827a;
        C11192u c11192u = C11192u.f33846a;
        KSerializer kSerializerM10615b = AbstractC9961r4.m10615b(c11181o0);
        KSerializer kSerializerM10615b2 = AbstractC9961r4.m10615b(c11181o0);
        KSerializer kSerializerM10615b3 = AbstractC9961r4.m10615b(c11181o0);
        KSerializer kSerializerM10615b4 = AbstractC9961r4.m10615b(c11181o0);
        KSerializer kSerializerM10615b5 = AbstractC9961r4.m10615b(kSerializerArr[10]);
        KSerializer kSerializerM10615b6 = AbstractC9961r4.m10615b(c11192u);
        C11135I c11135i = C11135I.f33763a;
        return new KSerializer[]{c11181o0, c11181o0, c11181o0, c11192u, c11192u, c11181o0, kSerializerM10615b, kSerializerM10615b2, kSerializerM10615b3, kSerializerM10615b4, kSerializerM10615b5, kSerializerM10615b6, AbstractC9961r4.m10615b(c11135i), AbstractC9961r4.m10615b(c11135i), AbstractC9961r4.m10615b(kSerializerArr[14]), AbstractC9961r4.m10615b(c11181o0), AbstractC9961r4.m10615b(kSerializerArr[16]), AbstractC9961r4.m10615b(C11164g.f33804a), AbstractC9961r4.m10615b(C1196y.f3151a), AbstractC9961r4.m10615b(c11181o0)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        int i10;
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C1166t.f3090u;
        C0887A c0887a = null;
        Double d10 = null;
        List list = null;
        String str = null;
        Boolean bool = null;
        List list2 = null;
        String str2 = null;
        Integer num = null;
        List list3 = null;
        Integer num2 = null;
        String strMo5483q = null;
        String strMo5483q2 = null;
        String strMo5483q3 = null;
        String strMo5483q4 = null;
        String str3 = null;
        String str4 = null;
        double dMo5489x = 0.0d;
        double dMo5489x2 = 0.0d;
        int i11 = 0;
        boolean z6 = true;
        String str5 = null;
        String str6 = null;
        while (z6) {
            String str7 = str6;
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            switch (iMo10914s) {
                case -1:
                    kSerializerArr = kSerializerArr;
                    c0887a = c0887a;
                    str5 = str5;
                    str = str;
                    str6 = str7;
                    z6 = false;
                    str = str;
                    kSerializerArr = kSerializerArr;
                    str5 = str5;
                    c0887a = c0887a;
                    break;
                case 0:
                    strMo5483q4 = interfaceC10428aMo5471c.mo5483q(pluginGeneratedSerialDescriptor, 0);
                    i11 |= 1;
                    str6 = str7;
                    str = str;
                    kSerializerArr = kSerializerArr;
                    str5 = str5;
                    c0887a = c0887a;
                    break;
                case 1:
                    strMo5483q3 = interfaceC10428aMo5471c.mo5483q(pluginGeneratedSerialDescriptor, 1);
                    i11 |= 2;
                    str6 = str7;
                    kSerializerArr = kSerializerArr;
                    str5 = str5;
                    c0887a = c0887a;
                    break;
                case 2:
                    strMo5483q = interfaceC10428aMo5471c.mo5483q(pluginGeneratedSerialDescriptor, 2);
                    i11 |= 4;
                    str6 = str7;
                    kSerializerArr = kSerializerArr;
                    str5 = str5;
                    c0887a = c0887a;
                    break;
                case 3:
                    dMo5489x2 = interfaceC10428aMo5471c.mo5489x(pluginGeneratedSerialDescriptor, 3);
                    i11 |= 8;
                    str6 = str7;
                    kSerializerArr = kSerializerArr;
                    str5 = str5;
                    c0887a = c0887a;
                    break;
                case 4:
                    dMo5489x = interfaceC10428aMo5471c.mo5489x(pluginGeneratedSerialDescriptor, 4);
                    i11 |= 16;
                    str6 = str7;
                    kSerializerArr = kSerializerArr;
                    str5 = str5;
                    c0887a = c0887a;
                    break;
                case 5:
                    strMo5483q2 = interfaceC10428aMo5471c.mo5483q(pluginGeneratedSerialDescriptor, 5);
                    i11 |= 32;
                    str6 = str7;
                    kSerializerArr = kSerializerArr;
                    str5 = str5;
                    c0887a = c0887a;
                    break;
                case 6:
                    str3 = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 6, C11181o0.f33827a, str3);
                    i11 |= 64;
                    str6 = str7;
                    str = str;
                    kSerializerArr = kSerializerArr;
                    str5 = str5;
                    c0887a = c0887a;
                    break;
                case 7:
                    str4 = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 7, C11181o0.f33827a, str4);
                    i11 |= 128;
                    str6 = str7;
                    str = str;
                    kSerializerArr = kSerializerArr;
                    str5 = str5;
                    break;
                case 8:
                    str6 = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 8, C11181o0.f33827a, str7);
                    i11 |= 256;
                    str = str;
                    kSerializerArr = kSerializerArr;
                    break;
                case 9:
                    str = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 9, C11181o0.f33827a, str);
                    i11 |= 512;
                    str6 = str7;
                    kSerializerArr = kSerializerArr;
                    break;
                case 10:
                    str = str;
                    list = (List) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 10, kSerializerArr[10], list);
                    i11 |= 1024;
                    str6 = str7;
                    str = str;
                    break;
                case 11:
                    str = str;
                    d10 = (Double) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 11, C11192u.f33846a, d10);
                    i11 |= 2048;
                    str6 = str7;
                    str = str;
                    break;
                case 12:
                    str = str;
                    num2 = (Integer) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 12, C11135I.f33763a, num2);
                    i11 |= 4096;
                    str6 = str7;
                    str = str;
                    break;
                case 13:
                    str = str;
                    num = (Integer) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 13, C11135I.f33763a, num);
                    i11 |= 8192;
                    str6 = str7;
                    str = str;
                    break;
                case 14:
                    str = str;
                    list3 = (List) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 14, kSerializerArr[14], list3);
                    i11 |= 16384;
                    str6 = str7;
                    str = str;
                    break;
                case 15:
                    str2 = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 15, C11181o0.f33827a, str2);
                    i10 = 32768;
                    i11 |= i10;
                    str6 = str7;
                    str = str;
                    break;
                case 16:
                    list2 = (List) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 16, kSerializerArr[16], list2);
                    i10 = 65536;
                    i11 |= i10;
                    str6 = str7;
                    str = str;
                    break;
                case 17:
                    bool = (Boolean) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 17, C11164g.f33804a, bool);
                    i10 = 131072;
                    i11 |= i10;
                    str6 = str7;
                    str = str;
                    break;
                case 18:
                    c0887a = (C0887A) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 18, C1196y.f3151a, c0887a);
                    i10 = 262144;
                    i11 |= i10;
                    str6 = str7;
                    str = str;
                    break;
                case 19:
                    str5 = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 19, C11181o0.f33827a, str5);
                    i10 = 524288;
                    i11 |= i10;
                    str6 = str7;
                    str = str;
                    break;
                default:
                    throw new C8981m(iMo10914s);
            }
        }
        C0887A c0887a2 = c0887a;
        String str8 = str5;
        String str9 = str3;
        String str10 = str4;
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        Boolean bool2 = bool;
        return new C1166t(i11, strMo5483q4, strMo5483q3, strMo5483q, dMo5489x2, dMo5489x, strMo5483q2, str9, str10, str6, str, list, d10, num2, num, list3, str2, list2, bool2, c0887a2, str8);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C1166t value = (C1166t) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        interfaceC10429bMo5570c.mo5584r(pluginGeneratedSerialDescriptor, 0, value.f3091a);
        interfaceC10429bMo5570c.mo5584r(pluginGeneratedSerialDescriptor, 1, value.f3092b);
        interfaceC10429bMo5570c.mo5584r(pluginGeneratedSerialDescriptor, 2, value.f3093c);
        interfaceC10429bMo5570c.mo5561B(pluginGeneratedSerialDescriptor, 3, value.f3094d);
        interfaceC10429bMo5570c.mo5561B(pluginGeneratedSerialDescriptor, 4, value.f3095e);
        interfaceC10429bMo5570c.mo5584r(pluginGeneratedSerialDescriptor, 5, value.f3096f);
        boolean zMo5565F = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str = value.f3097g;
        if (zMo5565F || str != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 6, C11181o0.f33827a, str);
        }
        boolean zMo5565F2 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str2 = value.f3098h;
        if (zMo5565F2 || str2 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 7, C11181o0.f33827a, str2);
        }
        boolean zMo5565F3 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str3 = value.f3099i;
        if (zMo5565F3 || str3 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 8, C11181o0.f33827a, str3);
        }
        boolean zMo5565F4 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str4 = value.f3100j;
        if (zMo5565F4 || str4 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 9, C11181o0.f33827a, str4);
        }
        boolean zMo5565F5 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C1166t.f3090u;
        List list = value.f3101k;
        if (zMo5565F5 || list != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 10, kSerializerArr[10], list);
        }
        boolean zMo5565F6 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        Double d10 = value.f3102l;
        if (zMo5565F6 || d10 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 11, C11192u.f33846a, d10);
        }
        boolean zMo5565F7 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        Integer num = value.f3103m;
        if (zMo5565F7 || num != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 12, C11135I.f33763a, num);
        }
        boolean zMo5565F8 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        Integer num2 = value.f3104n;
        if (zMo5565F8 || num2 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 13, C11135I.f33763a, num2);
        }
        boolean zMo5565F9 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        List list2 = value.f3105o;
        if (zMo5565F9 || list2 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 14, kSerializerArr[14], list2);
        }
        boolean zMo5565F10 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str5 = value.f3106p;
        if (zMo5565F10 || str5 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 15, C11181o0.f33827a, str5);
        }
        boolean zMo5565F11 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        List list3 = value.f3107q;
        if (zMo5565F11 || list3 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 16, kSerializerArr[16], list3);
        }
        boolean zMo5565F12 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        Boolean bool = value.f3108r;
        if (zMo5565F12 || bool != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 17, C11164g.f33804a, bool);
        }
        boolean zMo5565F13 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        C0887A c0887a = value.f3109s;
        if (zMo5565F13 || c0887a != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 18, C1196y.f3151a, c0887a);
        }
        boolean zMo5565F14 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str6 = value.f3110t;
        if (zMo5565F14 || str6 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 19, C11181o0.f33827a, str6);
        }
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
