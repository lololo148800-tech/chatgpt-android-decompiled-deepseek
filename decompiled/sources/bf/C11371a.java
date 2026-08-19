package bf;

import android.gov.nist.javax.sip.header.ParameterNames;
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
import p1155zi.C21928J0;
import p1155zi.C21936L0;
import p1155zi.C22012h1;
import p1155zi.C22020j1;
import p269Kh.C4693t;
import p269Kh.C4699z;
import p324Mn.C5551u;
import p463Sn.C7156i;
import p559Wn.C8981m;
import p594Y9.AbstractC9961r4;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;
import p909nm.C17689w;

/* JADX INFO: renamed from: bf.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C11371a implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C11371a f34378a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C11371a c11371a = new C11371a();
        f34378a = c11371a;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.gizmos.model.Gizmo", c11371a, 30);
        pluginGeneratedSerialDescriptor.m18453j(ParameterNames.f31999ID, false);
        pluginGeneratedSerialDescriptor.m18453j(DiagnosticsEntry.NAME_KEY, false);
        pluginGeneratedSerialDescriptor.m18453j("description", true);
        pluginGeneratedSerialDescriptor.m18453j("author", true);
        pluginGeneratedSerialDescriptor.m18453j("instructions", true);
        pluginGeneratedSerialDescriptor.m18453j("website", true);
        pluginGeneratedSerialDescriptor.m18453j("primarySocial", true);
        pluginGeneratedSerialDescriptor.m18453j("socials", true);
        pluginGeneratedSerialDescriptor.m18453j(ParameterNames.ICON, true);
        pluginGeneratedSerialDescriptor.m18453j("model", true);
        pluginGeneratedSerialDescriptor.m18453j("reportable", true);
        pluginGeneratedSerialDescriptor.m18453j("acceptsFeedback", true);
        pluginGeneratedSerialDescriptor.m18453j("lastInteractedAt", true);
        pluginGeneratedSerialDescriptor.m18453j("usesFunctionCalls", true);
        pluginGeneratedSerialDescriptor.m18453j("noLongerAvailable", true);
        pluginGeneratedSerialDescriptor.m18453j("workspaceDisabled", true);
        pluginGeneratedSerialDescriptor.m18453j("interactionDisabled", true);
        pluginGeneratedSerialDescriptor.m18453j("pinned", true);
        pluginGeneratedSerialDescriptor.m18453j("conversationCount", true);
        pluginGeneratedSerialDescriptor.m18453j("thirdParty", true);
        pluginGeneratedSerialDescriptor.m18453j("unreviewable", true);
        pluginGeneratedSerialDescriptor.m18453j("privacyLabel", true);
        pluginGeneratedSerialDescriptor.m18453j("tools", true);
        pluginGeneratedSerialDescriptor.m18453j("starterPrompts", true);
        pluginGeneratedSerialDescriptor.m18453j("productFeatures", true);
        pluginGeneratedSerialDescriptor.m18453j("shareRecipient", true);
        pluginGeneratedSerialDescriptor.m18453j("gizmoType", true);
        pluginGeneratedSerialDescriptor.m18453j("updatedAt", true);
        pluginGeneratedSerialDescriptor.m18453j("files", true);
        pluginGeneratedSerialDescriptor.m18453j("isSnorlax", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = C11349D.f34313E;
        C11181o0 c11181o0 = C11181o0.f33827a;
        KSerializer kSerializerM10615b = AbstractC9961r4.m10615b(c11181o0);
        KSerializer kSerializerM10615b2 = AbstractC9961r4.m10615b(c11181o0);
        KSerializer kSerializerM10615b3 = AbstractC9961r4.m10615b(c11181o0);
        KSerializer kSerializerM10615b4 = AbstractC9961r4.m10615b(c11181o0);
        KSerializer kSerializerM10615b5 = AbstractC9961r4.m10615b(C11384l.f34399a);
        KSerializer kSerializer = kSerializerArr[7];
        KSerializer kSerializerM10615b6 = AbstractC9961r4.m10615b(C22012h1.f69653a);
        C7156i c7156i = C7156i.f22754a;
        KSerializer kSerializerM10615b7 = AbstractC9961r4.m10615b(c7156i);
        KSerializer kSerializerM10615b8 = AbstractC9961r4.m10615b(c11181o0);
        KSerializer kSerializerM10615b9 = AbstractC9961r4.m10615b(c11181o0);
        KSerializer kSerializer2 = kSerializerArr[22];
        KSerializer kSerializer3 = kSerializerArr[23];
        KSerializer kSerializerM10615b10 = AbstractC9961r4.m10615b(C4693t.f15267a);
        KSerializer kSerializerM10615b11 = AbstractC9961r4.m10615b(kSerializerArr[25]);
        KSerializer kSerializerM10615b12 = AbstractC9961r4.m10615b(c11181o0);
        KSerializer kSerializerM10615b13 = AbstractC9961r4.m10615b(c7156i);
        KSerializer kSerializer4 = kSerializerArr[28];
        C11164g c11164g = C11164g.f33804a;
        return new KSerializer[]{C21928J0.f69475a, c11181o0, kSerializerM10615b, kSerializerM10615b2, kSerializerM10615b3, kSerializerM10615b4, kSerializerM10615b5, kSerializer, C11378f.f34386a, kSerializerM10615b6, c11164g, c11164g, kSerializerM10615b7, c11164g, c11164g, c11164g, c11164g, c11164g, kSerializerM10615b8, c11164g, c11164g, kSerializerM10615b9, kSerializer2, kSerializer3, kSerializerM10615b10, kSerializerM10615b11, kSerializerM10615b12, kSerializerM10615b13, kSerializer4, c11164g};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        C11380h c11380h;
        C11380h c11380h2;
        int i10;
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C11349D.f34313E;
        C5551u c5551u = null;
        String str = null;
        List list = null;
        boolean z6 = true;
        C5551u c5551u2 = null;
        int i11 = 0;
        String str2 = null;
        String str3 = null;
        List list2 = null;
        List list3 = null;
        C4699z c4699z = null;
        EnumC11383k enumC11383k = null;
        String str4 = null;
        String strMo5483q = null;
        boolean zMo5481o = false;
        boolean zMo5481o2 = false;
        String str5 = null;
        boolean zMo5481o3 = false;
        boolean zMo5481o4 = false;
        boolean zMo5481o5 = false;
        boolean zMo5481o6 = false;
        boolean zMo5481o7 = false;
        String str6 = null;
        boolean zMo5481o8 = false;
        boolean zMo5481o9 = false;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        C11386n c11386n = null;
        List list4 = null;
        C11380h c11380h3 = null;
        boolean zMo5481o10 = false;
        while (z6) {
            z6 = z6;
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            switch (iMo10914s) {
                case -1:
                    z6 = false;
                    str2 = str2;
                    str6 = str6;
                    str7 = str7;
                    list3 = list3;
                    str8 = str8;
                    c4699z = c4699z;
                    str9 = str9;
                    enumC11383k = enumC11383k;
                    c11386n = c11386n;
                    c11380h = c11380h3;
                    c5551u = c5551u;
                    str = str;
                    list = list;
                    str = str;
                    KSerializer[] kSerializerArr2 = kSerializerArr;
                    c11380h3 = c11380h;
                    kSerializerArr = kSerializerArr2;
                    break;
                case 0:
                    C21936L0 c21936l0 = (C21936L0) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 0, C21928J0.f69475a, str5 != null ? new C21936L0(str5) : null);
                    i11 |= 1;
                    str5 = c21936l0 != null ? c21936l0.f69488a : null;
                    str2 = str2;
                    z6 = z6;
                    str6 = str6;
                    str7 = str7;
                    list3 = list3;
                    str8 = str8;
                    c4699z = c4699z;
                    str9 = str9;
                    enumC11383k = enumC11383k;
                    c11386n = c11386n;
                    c11380h = c11380h3;
                    c5551u = c5551u;
                    str = str;
                    list = list;
                    str = str;
                    KSerializer[] kSerializerArr3 = kSerializerArr;
                    c11380h3 = c11380h;
                    kSerializerArr = kSerializerArr3;
                    break;
                case 1:
                    i11 |= 2;
                    strMo5483q = interfaceC10428aMo5471c.mo5483q(pluginGeneratedSerialDescriptor, 1);
                    z6 = z6;
                    str7 = str7;
                    list3 = list3;
                    str8 = str8;
                    c4699z = c4699z;
                    str9 = str9;
                    enumC11383k = enumC11383k;
                    c11386n = c11386n;
                    c11380h = c11380h3;
                    c5551u = c5551u;
                    str = str;
                    list = list;
                    str = str;
                    KSerializer[] kSerializerArr4 = kSerializerArr;
                    c11380h3 = c11380h;
                    kSerializerArr = kSerializerArr4;
                    break;
                case 2:
                    i11 |= 4;
                    str6 = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 2, C11181o0.f33827a, str6);
                    z6 = z6;
                    str7 = str7;
                    list3 = list3;
                    str8 = str8;
                    c4699z = c4699z;
                    str9 = str9;
                    enumC11383k = enumC11383k;
                    c11386n = c11386n;
                    c11380h = c11380h3;
                    c5551u = c5551u;
                    str = str;
                    list = list;
                    str = str;
                    KSerializer[] kSerializerArr5 = kSerializerArr;
                    c11380h3 = c11380h;
                    kSerializerArr = kSerializerArr5;
                    break;
                case 3:
                    c5551u = c5551u;
                    list = list;
                    c11380h3 = c11380h3;
                    kSerializerArr = kSerializerArr;
                    str = str;
                    c11386n = c11386n;
                    enumC11383k = enumC11383k;
                    str9 = str9;
                    c4699z = c4699z;
                    str8 = str8;
                    i11 |= 8;
                    str7 = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 3, C11181o0.f33827a, str7);
                    list3 = list3;
                    z6 = z6;
                    str8 = str8;
                    c4699z = c4699z;
                    str9 = str9;
                    enumC11383k = enumC11383k;
                    c11386n = c11386n;
                    c11380h = c11380h3;
                    c5551u = c5551u;
                    str = str;
                    list = list;
                    str = str;
                    KSerializer[] kSerializerArr6 = kSerializerArr;
                    c11380h3 = c11380h;
                    kSerializerArr = kSerializerArr6;
                    break;
                case 4:
                    c5551u = c5551u;
                    list = list;
                    c11380h3 = c11380h3;
                    kSerializerArr = kSerializerArr;
                    str = str;
                    c11386n = c11386n;
                    enumC11383k = enumC11383k;
                    str9 = str9;
                    i11 |= 16;
                    str8 = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 4, C11181o0.f33827a, str8);
                    c4699z = c4699z;
                    z6 = z6;
                    str9 = str9;
                    enumC11383k = enumC11383k;
                    c11386n = c11386n;
                    c11380h = c11380h3;
                    c5551u = c5551u;
                    str = str;
                    list = list;
                    str = str;
                    KSerializer[] kSerializerArr7 = kSerializerArr;
                    c11380h3 = c11380h;
                    kSerializerArr = kSerializerArr7;
                    break;
                case 5:
                    c5551u = c5551u;
                    list = list;
                    c11380h3 = c11380h3;
                    kSerializerArr = kSerializerArr;
                    str = str;
                    c11386n = c11386n;
                    i11 |= 32;
                    str9 = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 5, C11181o0.f33827a, str9);
                    enumC11383k = enumC11383k;
                    z6 = z6;
                    c11386n = c11386n;
                    c11380h = c11380h3;
                    c5551u = c5551u;
                    str = str;
                    list = list;
                    str = str;
                    KSerializer[] kSerializerArr8 = kSerializerArr;
                    c11380h3 = c11380h;
                    kSerializerArr = kSerializerArr8;
                    break;
                case 6:
                    c11380h2 = c11380h3;
                    i11 |= 64;
                    c11386n = (C11386n) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 6, C11384l.f34399a, c11386n);
                    c11380h = c11380h2;
                    z6 = z6;
                    c5551u = c5551u;
                    str = str;
                    list = list;
                    str = str;
                    KSerializer[] kSerializerArr9 = kSerializerArr;
                    c11380h3 = c11380h;
                    kSerializerArr = kSerializerArr9;
                    break;
                case 7:
                    c11380h2 = c11380h3;
                    i11 |= 128;
                    list4 = (List) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 7, kSerializerArr[7], list4);
                    c11380h = c11380h2;
                    z6 = z6;
                    c5551u = c5551u;
                    str = str;
                    list = list;
                    str = str;
                    KSerializer[] kSerializerArr10 = kSerializerArr;
                    c11380h3 = c11380h;
                    kSerializerArr = kSerializerArr10;
                    break;
                case 8:
                    c11380h2 = (C11380h) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 8, C11378f.f34386a, c11380h3);
                    i11 |= 256;
                    c11380h = c11380h2;
                    z6 = z6;
                    c5551u = c5551u;
                    str = str;
                    list = list;
                    str = str;
                    KSerializer[] kSerializerArr11 = kSerializerArr;
                    c11380h3 = c11380h;
                    kSerializerArr = kSerializerArr11;
                    break;
                case 9:
                    String str10 = str;
                    C22020j1 c22020j1 = (C22020j1) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 9, C22012h1.f69653a, str10 != null ? new C22020j1(str10) : null);
                    i11 |= 512;
                    str = c22020j1 != null ? c22020j1.f69665a : null;
                    list = list;
                    C11380h c11380h4 = c11380h3;
                    kSerializerArr = kSerializerArr;
                    c11380h = c11380h4;
                    str = str;
                    KSerializer[] kSerializerArr12 = kSerializerArr;
                    c11380h3 = c11380h;
                    kSerializerArr = kSerializerArr12;
                    break;
                case 10:
                    str = str;
                    zMo5481o = interfaceC10428aMo5471c.mo5481o(pluginGeneratedSerialDescriptor, 10);
                    i11 |= 1024;
                    C11380h c11380h5 = c11380h3;
                    kSerializerArr = kSerializerArr;
                    c11380h = c11380h5;
                    str = str;
                    KSerializer[] kSerializerArr13 = kSerializerArr;
                    c11380h3 = c11380h;
                    kSerializerArr = kSerializerArr13;
                    break;
                case 11:
                    str = str;
                    zMo5481o2 = interfaceC10428aMo5471c.mo5481o(pluginGeneratedSerialDescriptor, 11);
                    i11 |= 2048;
                    C11380h c11380h6 = c11380h3;
                    kSerializerArr = kSerializerArr;
                    c11380h = c11380h6;
                    str = str;
                    KSerializer[] kSerializerArr14 = kSerializerArr;
                    c11380h3 = c11380h;
                    kSerializerArr = kSerializerArr14;
                    break;
                case 12:
                    str = str;
                    c5551u = (C5551u) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 12, C7156i.f22754a, c5551u);
                    i11 |= 4096;
                    C11380h c11380h7 = c11380h3;
                    kSerializerArr = kSerializerArr;
                    c11380h = c11380h7;
                    str = str;
                    KSerializer[] kSerializerArr15 = kSerializerArr;
                    c11380h3 = c11380h;
                    kSerializerArr = kSerializerArr15;
                    break;
                case 13:
                    str = str;
                    zMo5481o3 = interfaceC10428aMo5471c.mo5481o(pluginGeneratedSerialDescriptor, 13);
                    i11 |= 8192;
                    C11380h c11380h8 = c11380h3;
                    kSerializerArr = kSerializerArr;
                    c11380h = c11380h8;
                    str = str;
                    KSerializer[] kSerializerArr16 = kSerializerArr;
                    c11380h3 = c11380h;
                    kSerializerArr = kSerializerArr16;
                    break;
                case 14:
                    str = str;
                    zMo5481o4 = interfaceC10428aMo5471c.mo5481o(pluginGeneratedSerialDescriptor, 14);
                    i11 |= 16384;
                    C11380h c11380h9 = c11380h3;
                    kSerializerArr = kSerializerArr;
                    c11380h = c11380h9;
                    str = str;
                    KSerializer[] kSerializerArr17 = kSerializerArr;
                    c11380h3 = c11380h;
                    kSerializerArr = kSerializerArr17;
                    break;
                case 15:
                    zMo5481o5 = interfaceC10428aMo5471c.mo5481o(pluginGeneratedSerialDescriptor, 15);
                    i10 = 32768;
                    i11 |= i10;
                    C11380h c11380h10 = c11380h3;
                    kSerializerArr = kSerializerArr;
                    c11380h = c11380h10;
                    str = str;
                    KSerializer[] kSerializerArr18 = kSerializerArr;
                    c11380h3 = c11380h;
                    kSerializerArr = kSerializerArr18;
                    break;
                case 16:
                    zMo5481o6 = interfaceC10428aMo5471c.mo5481o(pluginGeneratedSerialDescriptor, 16);
                    i10 = 65536;
                    i11 |= i10;
                    C11380h c11380h11 = c11380h3;
                    kSerializerArr = kSerializerArr;
                    c11380h = c11380h11;
                    str = str;
                    KSerializer[] kSerializerArr19 = kSerializerArr;
                    c11380h3 = c11380h;
                    kSerializerArr = kSerializerArr19;
                    break;
                case 17:
                    zMo5481o7 = interfaceC10428aMo5471c.mo5481o(pluginGeneratedSerialDescriptor, 17);
                    i10 = 131072;
                    i11 |= i10;
                    C11380h c11380h12 = c11380h3;
                    kSerializerArr = kSerializerArr;
                    c11380h = c11380h12;
                    str = str;
                    KSerializer[] kSerializerArr110 = kSerializerArr;
                    c11380h3 = c11380h;
                    kSerializerArr = kSerializerArr110;
                    break;
                case 18:
                    str3 = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 18, C11181o0.f33827a, str3);
                    i10 = 262144;
                    i11 |= i10;
                    C11380h c11380h13 = c11380h3;
                    kSerializerArr = kSerializerArr;
                    c11380h = c11380h13;
                    str = str;
                    KSerializer[] kSerializerArr111 = kSerializerArr;
                    c11380h3 = c11380h;
                    kSerializerArr = kSerializerArr111;
                    break;
                case 19:
                    zMo5481o8 = interfaceC10428aMo5471c.mo5481o(pluginGeneratedSerialDescriptor, 19);
                    i10 = 524288;
                    i11 |= i10;
                    C11380h c11380h14 = c11380h3;
                    kSerializerArr = kSerializerArr;
                    c11380h = c11380h14;
                    str = str;
                    KSerializer[] kSerializerArr112 = kSerializerArr;
                    c11380h3 = c11380h;
                    kSerializerArr = kSerializerArr112;
                    break;
                case 20:
                    zMo5481o9 = interfaceC10428aMo5471c.mo5481o(pluginGeneratedSerialDescriptor, 20);
                    i10 = 1048576;
                    i11 |= i10;
                    C11380h c11380h15 = c11380h3;
                    kSerializerArr = kSerializerArr;
                    c11380h = c11380h15;
                    str = str;
                    KSerializer[] kSerializerArr113 = kSerializerArr;
                    c11380h3 = c11380h;
                    kSerializerArr = kSerializerArr113;
                    break;
                case 21:
                    str2 = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 21, C11181o0.f33827a, str2);
                    i10 = 2097152;
                    i11 |= i10;
                    C11380h c11380h16 = c11380h3;
                    kSerializerArr = kSerializerArr;
                    c11380h = c11380h16;
                    str = str;
                    KSerializer[] kSerializerArr114 = kSerializerArr;
                    c11380h3 = c11380h;
                    kSerializerArr = kSerializerArr114;
                    break;
                case 22:
                    list2 = (List) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 22, kSerializerArr[22], list2);
                    i10 = 4194304;
                    i11 |= i10;
                    C11380h c11380h17 = c11380h3;
                    kSerializerArr = kSerializerArr;
                    c11380h = c11380h17;
                    str = str;
                    KSerializer[] kSerializerArr115 = kSerializerArr;
                    c11380h3 = c11380h;
                    kSerializerArr = kSerializerArr115;
                    break;
                case 23:
                    list3 = (List) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 23, kSerializerArr[23], list3);
                    i10 = 8388608;
                    i11 |= i10;
                    C11380h c11380h18 = c11380h3;
                    kSerializerArr = kSerializerArr;
                    c11380h = c11380h18;
                    str = str;
                    KSerializer[] kSerializerArr116 = kSerializerArr;
                    c11380h3 = c11380h;
                    kSerializerArr = kSerializerArr116;
                    break;
                case 24:
                    c4699z = (C4699z) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 24, C4693t.f15267a, c4699z);
                    i10 = 16777216;
                    i11 |= i10;
                    C11380h c11380h19 = c11380h3;
                    kSerializerArr = kSerializerArr;
                    c11380h = c11380h19;
                    str = str;
                    KSerializer[] kSerializerArr117 = kSerializerArr;
                    c11380h3 = c11380h;
                    kSerializerArr = kSerializerArr117;
                    break;
                case 25:
                    enumC11383k = (EnumC11383k) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 25, kSerializerArr[25], enumC11383k);
                    i10 = 33554432;
                    i11 |= i10;
                    C11380h c11380h110 = c11380h3;
                    kSerializerArr = kSerializerArr;
                    c11380h = c11380h110;
                    str = str;
                    KSerializer[] kSerializerArr118 = kSerializerArr;
                    c11380h3 = c11380h;
                    kSerializerArr = kSerializerArr118;
                    break;
                case 26:
                    str4 = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 26, C11181o0.f33827a, str4);
                    i10 = 67108864;
                    i11 |= i10;
                    C11380h c11380h111 = c11380h3;
                    kSerializerArr = kSerializerArr;
                    c11380h = c11380h111;
                    str = str;
                    KSerializer[] kSerializerArr119 = kSerializerArr;
                    c11380h3 = c11380h;
                    kSerializerArr = kSerializerArr119;
                    break;
                case 27:
                    c5551u2 = (C5551u) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 27, C7156i.f22754a, c5551u2);
                    i10 = 134217728;
                    i11 |= i10;
                    C11380h c11380h112 = c11380h3;
                    kSerializerArr = kSerializerArr;
                    c11380h = c11380h112;
                    str = str;
                    KSerializer[] kSerializerArr1110 = kSerializerArr;
                    c11380h3 = c11380h;
                    kSerializerArr = kSerializerArr1110;
                    break;
                case 28:
                    list = (List) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 28, kSerializerArr[28], list);
                    i10 = 268435456;
                    i11 |= i10;
                    C11380h c11380h113 = c11380h3;
                    kSerializerArr = kSerializerArr;
                    c11380h = c11380h113;
                    str = str;
                    KSerializer[] kSerializerArr1111 = kSerializerArr;
                    c11380h3 = c11380h;
                    kSerializerArr = kSerializerArr1111;
                    break;
                case 29:
                    zMo5481o10 = interfaceC10428aMo5471c.mo5481o(pluginGeneratedSerialDescriptor, 29);
                    i11 |= 536870912;
                    str = str;
                    C11380h c11380h114 = c11380h3;
                    kSerializerArr = kSerializerArr;
                    c11380h = c11380h114;
                    str = str;
                    KSerializer[] kSerializerArr1112 = kSerializerArr;
                    c11380h3 = c11380h;
                    kSerializerArr = kSerializerArr1112;
                    break;
                default:
                    throw new C8981m(iMo10914s);
            }
        }
        C5551u c5551u3 = c5551u;
        List list5 = list;
        EnumC11383k enumC11383k2 = enumC11383k;
        String str11 = str9;
        C4699z c4699z2 = c4699z;
        String str12 = str8;
        List list6 = list3;
        String str13 = str7;
        List list7 = list2;
        String str14 = str6;
        String str15 = str2;
        String str16 = str5;
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C11349D(i11, str16, strMo5483q, str14, str13, str12, str11, c11386n, list4, c11380h3, str, zMo5481o, zMo5481o2, c5551u3, zMo5481o3, zMo5481o4, zMo5481o5, zMo5481o6, zMo5481o7, str3, zMo5481o8, zMo5481o9, str15, list7, list6, c4699z2, enumC11383k2, str4, c5551u2, list5, zMo5481o10);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C11349D value = (C11349D) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        C11373b c11373b = C11349D.Companion;
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 0, C21928J0.f69475a, new C21936L0(value.f34318a));
        interfaceC10429bMo5570c.mo5584r(pluginGeneratedSerialDescriptor, 1, value.f34319b);
        boolean zMo5565F = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str = value.f34320c;
        if (zMo5565F || str != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 2, C11181o0.f33827a, str);
        }
        boolean zMo5565F2 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str2 = value.f34321d;
        if (zMo5565F2 || str2 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 3, C11181o0.f33827a, str2);
        }
        boolean zMo5565F3 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str3 = value.f34322e;
        if (zMo5565F3 || str3 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 4, C11181o0.f33827a, str3);
        }
        boolean zMo5565F4 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str4 = value.f34323f;
        if (zMo5565F4 || str4 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 5, C11181o0.f33827a, str4);
        }
        boolean zMo5565F5 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        C11386n c11386n = value.f34324g;
        if (zMo5565F5 || c11386n != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 6, C11384l.f34399a, c11386n);
        }
        boolean zMo5565F6 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        C17689w c17689w = C17689w.f56480Y;
        KSerializer[] kSerializerArr = C11349D.f34313E;
        List list = value.f34325h;
        if (zMo5565F6 || !AbstractC16544l.m18089b(list, c17689w)) {
            interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 7, kSerializerArr[7], list);
        }
        boolean zMo5565F7 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        C11380h c11380h = value.f34326i;
        if (zMo5565F7 || !AbstractC16544l.m18089b(c11380h, new C11380h((String) null, 3))) {
            interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 8, C11378f.f34386a, c11380h);
        }
        boolean zMo5565F8 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str5 = value.f34327j;
        if (zMo5565F8 || str5 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 9, C22012h1.f69653a, str5 != null ? new C22020j1(str5) : null);
        }
        boolean zMo5565F9 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        boolean z6 = value.f34328k;
        if (zMo5565F9 || z6) {
            interfaceC10429bMo5570c.mo5583q(pluginGeneratedSerialDescriptor, 10, z6);
        }
        boolean zMo5565F10 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        boolean z10 = value.f34329l;
        if (zMo5565F10 || z10) {
            interfaceC10429bMo5570c.mo5583q(pluginGeneratedSerialDescriptor, 11, z10);
        }
        boolean zMo5565F11 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        C5551u c5551u = value.f34330m;
        if (zMo5565F11 || c5551u != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 12, C7156i.f22754a, c5551u);
        }
        boolean zMo5565F12 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        boolean z11 = value.f34331n;
        if (zMo5565F12 || z11) {
            interfaceC10429bMo5570c.mo5583q(pluginGeneratedSerialDescriptor, 13, z11);
        }
        boolean zMo5565F13 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        boolean z12 = value.f34332o;
        if (zMo5565F13 || z12) {
            interfaceC10429bMo5570c.mo5583q(pluginGeneratedSerialDescriptor, 14, z12);
        }
        boolean zMo5565F14 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        boolean z13 = value.f34333p;
        if (zMo5565F14 || z13) {
            interfaceC10429bMo5570c.mo5583q(pluginGeneratedSerialDescriptor, 15, z13);
        }
        boolean zMo5565F15 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        boolean z14 = value.f34334q;
        if (zMo5565F15 || z14) {
            interfaceC10429bMo5570c.mo5583q(pluginGeneratedSerialDescriptor, 16, z14);
        }
        boolean zMo5565F16 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        boolean z15 = value.f34335r;
        if (zMo5565F16 || z15) {
            interfaceC10429bMo5570c.mo5583q(pluginGeneratedSerialDescriptor, 17, z15);
        }
        boolean zMo5565F17 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str6 = value.f34336s;
        if (zMo5565F17 || str6 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 18, C11181o0.f33827a, str6);
        }
        boolean zMo5565F18 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        boolean z16 = value.f34337t;
        if (zMo5565F18 || z16) {
            interfaceC10429bMo5570c.mo5583q(pluginGeneratedSerialDescriptor, 19, z16);
        }
        boolean zMo5565F19 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        boolean z17 = value.f34338u;
        if (zMo5565F19 || z17) {
            interfaceC10429bMo5570c.mo5583q(pluginGeneratedSerialDescriptor, 20, z17);
        }
        boolean zMo5565F20 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str7 = value.f34339v;
        if (zMo5565F20 || str7 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 21, C11181o0.f33827a, str7);
        }
        boolean zMo5565F21 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        List list2 = value.f34340w;
        if (zMo5565F21 || !AbstractC16544l.m18089b(list2, c17689w)) {
            interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 22, kSerializerArr[22], list2);
        }
        boolean zMo5565F22 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        List list3 = value.f34341x;
        if (zMo5565F22 || !AbstractC16544l.m18089b(list3, c17689w)) {
            interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 23, kSerializerArr[23], list3);
        }
        boolean zMo5565F23 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        C4699z c4699z = value.f34342y;
        if (zMo5565F23 || c4699z != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 24, C4693t.f15267a, c4699z);
        }
        boolean zMo5565F24 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        EnumC11383k enumC11383k = value.f34343z;
        if (zMo5565F24 || enumC11383k != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 25, kSerializerArr[25], enumC11383k);
        }
        boolean zMo5565F25 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str8 = value.f34314A;
        if (zMo5565F25 || str8 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 26, C11181o0.f33827a, str8);
        }
        boolean zMo5565F26 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        C5551u c5551u2 = value.f34315B;
        if (zMo5565F26 || c5551u2 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 27, C7156i.f22754a, c5551u2);
        }
        boolean zMo5565F27 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        List list4 = value.f34316C;
        if (zMo5565F27 || !AbstractC16544l.m18089b(list4, c17689w)) {
            interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 28, kSerializerArr[28], list4);
        }
        boolean zMo5565F28 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        boolean z18 = value.f34317D;
        if (zMo5565F28 || z18 != AbstractC16544l.m18089b(str8, "snorlax")) {
            interfaceC10429bMo5570c.mo5583q(pluginGeneratedSerialDescriptor, 29, z18);
        }
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
