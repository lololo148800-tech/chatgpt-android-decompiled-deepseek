package p403Qd;

import android.gov.nist.javax.sip.header.ParameterNames;
import ao.AbstractC11153a0;
import ao.C11164g;
import ao.C11181o0;
import ao.InterfaceC11127C;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import p1113xn.AbstractC21322p;
import p1155zi.C21928J0;
import p1155zi.C21936L0;
import p1155zi.C21960S1;
import p1155zi.C21966U1;
import p1155zi.C21977Y0;
import p1155zi.C21984a1;
import p1155zi.C22003f0;
import p1155zi.C22011h0;
import p1155zi.C22012h1;
import p1155zi.C22020j1;
import p324Mn.C5551u;
import p463Sn.C7156i;
import p559Wn.C8981m;
import p575Xd.C9434C;
import p575Xd.C9436E;
import p594Y9.AbstractC9961r4;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;
import p909nm.C17690x;

/* JADX INFO: renamed from: Qd.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C6626d implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C6626d f21361a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C6626d c6626d = new C6626d();
        f21361a = c6626d;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.domain.conversation.Conversation", c6626d, 16);
        pluginGeneratedSerialDescriptor.m18453j(ParameterNames.f31999ID, false);
        pluginGeneratedSerialDescriptor.m18453j("remoteId", true);
        pluginGeneratedSerialDescriptor.m18453j("creationDate", false);
        pluginGeneratedSerialDescriptor.m18453j("modificationDate", false);
        pluginGeneratedSerialDescriptor.m18453j("currentLeafNodeId", true);
        pluginGeneratedSerialDescriptor.m18453j(UiComponentConfig.Title.type, true);
        pluginGeneratedSerialDescriptor.m18453j("moderationResults", true);
        pluginGeneratedSerialDescriptor.m18453j("safeUrlMap", true);
        pluginGeneratedSerialDescriptor.m18453j("sharedConversationId", true);
        pluginGeneratedSerialDescriptor.m18453j("defaultModelSlug", true);
        pluginGeneratedSerialDescriptor.m18453j("gizmoId", true);
        pluginGeneratedSerialDescriptor.m18453j("gizmoType", true);
        pluginGeneratedSerialDescriptor.m18453j("suggestions", true);
        pluginGeneratedSerialDescriptor.m18453j("voice", true);
        pluginGeneratedSerialDescriptor.m18453j("asyncStatus", true);
        pluginGeneratedSerialDescriptor.m18453j("hasTitle", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = C6636i.f21378w;
        C22003f0 c22003f0 = C22003f0.f69641a;
        KSerializer kSerializerM10615b = AbstractC9961r4.m10615b(c22003f0);
        C7156i c7156i = C7156i.f22754a;
        KSerializer kSerializerM10615b2 = AbstractC9961r4.m10615b(c7156i);
        KSerializer kSerializerM10615b3 = AbstractC9961r4.m10615b(C21977Y0.f69577a);
        C11181o0 c11181o0 = C11181o0.f33827a;
        return new KSerializer[]{c22003f0, kSerializerM10615b, kSerializerM10615b2, c7156i, kSerializerM10615b3, AbstractC9961r4.m10615b(c11181o0), kSerializerArr[6], C9434C.f28418a, AbstractC9961r4.m10615b(C21960S1.f69525a), AbstractC9961r4.m10615b(C22012h1.f69653a), AbstractC9961r4.m10615b(C21928J0.f69475a), AbstractC9961r4.m10615b(c11181o0), AbstractC9961r4.m10615b(kSerializerArr[12]), AbstractC9961r4.m10615b(c11181o0), AbstractC9961r4.m10615b(kSerializerArr[14]), C11164g.f33804a};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        int i10;
        C22011h0 c22011h0;
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C6636i.f21378w;
        String str = null;
        String str2 = null;
        String str3 = null;
        boolean z6 = true;
        C9436E c9436e = null;
        int i11 = 0;
        String str4 = null;
        List list = null;
        String str5 = null;
        EnumC6624c enumC6624c = null;
        String str6 = null;
        String str7 = null;
        Map map = null;
        String str8 = null;
        String str9 = null;
        C5551u c5551u = null;
        C5551u c5551u2 = null;
        boolean zMo5481o = false;
        while (z6) {
            z6 = z6;
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            switch (iMo10914s) {
                case -1:
                    z6 = false;
                    str4 = str4;
                    kSerializerArr = kSerializerArr;
                    str9 = str9;
                    c5551u = c5551u;
                    str5 = str5;
                    c5551u2 = c5551u2;
                    enumC6624c = enumC6624c;
                    break;
                case 0:
                    String str10 = str6;
                    C22011h0 c22011h1 = (C22011h0) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 0, C22003f0.f69641a, str8 != null ? new C22011h0(str8) : null);
                    str8 = c22011h1 != null ? c22011h1.f69652a : null;
                    i11 |= 1;
                    str6 = str10;
                    str4 = str4;
                    z6 = z6;
                    kSerializerArr = kSerializerArr;
                    str9 = str9;
                    c5551u = c5551u;
                    str5 = str5;
                    c5551u2 = c5551u2;
                    enumC6624c = enumC6624c;
                    break;
                case 1:
                    KSerializer[] kSerializerArr2 = kSerializerArr;
                    enumC6624c = enumC6624c;
                    String str11 = str6;
                    c5551u2 = c5551u2;
                    str5 = str5;
                    c5551u = c5551u;
                    C22003f0 c22003f0 = C22003f0.f69641a;
                    if (str9 != null) {
                        c22011h0 = new C22011h0(str9);
                        i10 = 1;
                    } else {
                        i10 = 1;
                        c22011h0 = null;
                    }
                    C22011h0 c22011h2 = (C22011h0) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, i10, c22003f0, c22011h0);
                    str9 = c22011h2 != null ? c22011h2.f69652a : null;
                    i11 |= 2;
                    str6 = str11;
                    z6 = z6;
                    kSerializerArr = kSerializerArr2;
                    c5551u = c5551u;
                    str5 = str5;
                    c5551u2 = c5551u2;
                    enumC6624c = enumC6624c;
                    break;
                case 2:
                    enumC6624c = enumC6624c;
                    c5551u2 = c5551u2;
                    c5551u = (C5551u) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 2, C7156i.f22754a, c5551u);
                    i11 |= 4;
                    str6 = str6;
                    str5 = str5;
                    z6 = z6;
                    kSerializerArr = kSerializerArr;
                    c5551u2 = c5551u2;
                    enumC6624c = enumC6624c;
                    break;
                case 3:
                    kSerializerArr = kSerializerArr;
                    c5551u2 = (C5551u) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 3, C7156i.f22754a, c5551u2);
                    i11 |= 8;
                    str6 = str6;
                    enumC6624c = enumC6624c;
                    kSerializerArr = kSerializerArr;
                    break;
                case 4:
                    String str12 = str6;
                    C21984a1 c21984a1 = (C21984a1) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 4, C21977Y0.f69577a, str12 != null ? new C21984a1(str12) : null);
                    str6 = c21984a1 != null ? c21984a1.f69607Y : null;
                    i11 |= 16;
                    kSerializerArr = kSerializerArr;
                    break;
                case 5:
                    str7 = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 5, C11181o0.f33827a, str7);
                    i11 |= 32;
                    z6 = z6;
                    str6 = str6;
                    break;
                case 6:
                    map = (Map) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 6, kSerializerArr[6], map);
                    i11 |= 64;
                    z6 = z6;
                    str6 = str6;
                    break;
                case 7:
                    c9436e = (C9436E) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 7, C9434C.f28418a, c9436e);
                    i11 |= 128;
                    z6 = z6;
                    str6 = str6;
                    break;
                case 8:
                    C21966U1 c21966u1 = (C21966U1) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 8, C21960S1.f69525a, str3 != null ? new C21966U1(str3) : null);
                    str3 = c21966u1 != null ? c21966u1.f69541a : null;
                    i11 |= 256;
                    z6 = z6;
                    str6 = str6;
                    break;
                case 9:
                    C22020j1 c22020j1 = (C22020j1) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 9, C22012h1.f69653a, str2 != null ? new C22020j1(str2) : null);
                    str2 = c22020j1 != null ? c22020j1.f69665a : null;
                    i11 |= 512;
                    z6 = z6;
                    str6 = str6;
                    break;
                case 10:
                    C21936L0 c21936l0 = (C21936L0) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 10, C21928J0.f69475a, str != null ? new C21936L0(str) : null);
                    str = c21936l0 != null ? c21936l0.f69488a : null;
                    i11 |= 1024;
                    z6 = z6;
                    str6 = str6;
                    break;
                case 11:
                    str4 = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 11, C11181o0.f33827a, str4);
                    i11 |= 2048;
                    z6 = z6;
                    str6 = str6;
                    break;
                case 12:
                    list = (List) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 12, kSerializerArr[12], list);
                    i11 |= 4096;
                    z6 = z6;
                    str6 = str6;
                    break;
                case 13:
                    str5 = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 13, C11181o0.f33827a, str5);
                    i11 |= 8192;
                    z6 = z6;
                    str6 = str6;
                    break;
                case 14:
                    enumC6624c = (EnumC6624c) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 14, kSerializerArr[14], enumC6624c);
                    i11 |= 16384;
                    z6 = z6;
                    str6 = str6;
                    break;
                case 15:
                    zMo5481o = interfaceC10428aMo5471c.mo5481o(pluginGeneratedSerialDescriptor, 15);
                    i11 |= 32768;
                    z6 = z6;
                    break;
                default:
                    throw new C8981m(iMo10914s);
            }
        }
        EnumC6624c enumC6624c2 = enumC6624c;
        C5551u c5551u3 = c5551u2;
        String str13 = str5;
        C5551u c5551u4 = c5551u;
        List list2 = list;
        String str14 = str9;
        String str15 = str4;
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C6636i(i11, str8, str14, c5551u4, c5551u3, str6, str7, map, c9436e, str3, str2, str, str15, list2, str13, enumC6624c2, zMo5481o);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code duplicated, block: B:93:0x015a  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C6636i value = (C6636i) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(serialDescriptor);
        C6628e c6628e = C6636i.Companion;
        KSerializer kSerializer = C22003f0.f69641a;
        boolean z6 = false;
        interfaceC10429bMo5570c.mo5575i(serialDescriptor, 0, kSerializer, new C22011h0(value.f21379a));
        boolean zMo5565F = interfaceC10429bMo5570c.mo5565F(serialDescriptor);
        Object[] objArr = 0;
        String str = value.f21380b;
        if (zMo5565F || str != null) {
            interfaceC10429bMo5570c.mo5585s(serialDescriptor, 1, kSerializer, str != null ? new C22011h0(str) : null);
        }
        KSerializer kSerializer2 = C7156i.f22754a;
        interfaceC10429bMo5570c.mo5585s(serialDescriptor, 2, kSerializer2, value.f21381c);
        int i10 = 3;
        interfaceC10429bMo5570c.mo5575i(serialDescriptor, 3, kSerializer2, value.f21382d);
        boolean zMo5565F2 = interfaceC10429bMo5570c.mo5565F(serialDescriptor);
        String str2 = value.f21383e;
        if (zMo5565F2 || str2 != null) {
            interfaceC10429bMo5570c.mo5585s(serialDescriptor, 4, C21977Y0.f69577a, str2 != null ? new C21984a1(str2) : null);
        }
        boolean zMo5565F3 = interfaceC10429bMo5570c.mo5565F(serialDescriptor);
        String str3 = value.f21384f;
        if (zMo5565F3 || str3 != null) {
            interfaceC10429bMo5570c.mo5585s(serialDescriptor, 5, C11181o0.f33827a, str3);
        }
        boolean zMo5565F4 = interfaceC10429bMo5570c.mo5565F(serialDescriptor);
        KSerializer[] kSerializerArr = C6636i.f21378w;
        Object obj2 = value.f21385g;
        if (zMo5565F4 || !AbstractC16544l.m18089b(obj2, C17690x.f56481Y)) {
            interfaceC10429bMo5570c.mo5575i(serialDescriptor, 6, kSerializerArr[6], obj2);
        }
        boolean zMo5565F5 = interfaceC10429bMo5570c.mo5565F(serialDescriptor);
        Object obj3 = value.f21386h;
        if (zMo5565F5 || !AbstractC16544l.m18089b(obj3, new C9436E(i10, (Set) (objArr == true ? 1 : 0)))) {
            interfaceC10429bMo5570c.mo5575i(serialDescriptor, 7, C9434C.f28418a, obj3);
        }
        boolean zMo5565F6 = interfaceC10429bMo5570c.mo5565F(serialDescriptor);
        String str4 = value.f21387i;
        if (zMo5565F6 || str4 != null) {
            interfaceC10429bMo5570c.mo5585s(serialDescriptor, 8, C21960S1.f69525a, str4 != null ? new C21966U1(str4) : null);
        }
        boolean zMo5565F7 = interfaceC10429bMo5570c.mo5565F(serialDescriptor);
        String str5 = value.f21388j;
        if (zMo5565F7 || str5 != null) {
            interfaceC10429bMo5570c.mo5585s(serialDescriptor, 9, C22012h1.f69653a, str5 != null ? new C22020j1(str5) : null);
        }
        boolean zMo5565F8 = interfaceC10429bMo5570c.mo5565F(serialDescriptor);
        String str6 = value.f21389k;
        if (zMo5565F8 || str6 != null) {
            interfaceC10429bMo5570c.mo5585s(serialDescriptor, 10, C21928J0.f69475a, str6 != null ? new C21936L0(str6) : null);
        }
        boolean zMo5565F9 = interfaceC10429bMo5570c.mo5565F(serialDescriptor);
        Object obj4 = value.f21390l;
        if (zMo5565F9 || obj4 != null) {
            interfaceC10429bMo5570c.mo5585s(serialDescriptor, 11, C11181o0.f33827a, obj4);
        }
        boolean zMo5565F10 = interfaceC10429bMo5570c.mo5565F(serialDescriptor);
        Object obj5 = value.f21391m;
        if (zMo5565F10 || obj5 != null) {
            interfaceC10429bMo5570c.mo5585s(serialDescriptor, 12, kSerializerArr[12], obj5);
        }
        boolean zMo5565F11 = interfaceC10429bMo5570c.mo5565F(serialDescriptor);
        Object obj6 = value.f21392n;
        if (zMo5565F11 || obj6 != null) {
            interfaceC10429bMo5570c.mo5585s(serialDescriptor, 13, C11181o0.f33827a, obj6);
        }
        boolean zMo5565F12 = interfaceC10429bMo5570c.mo5565F(serialDescriptor);
        Object obj7 = value.f21393o;
        if (zMo5565F12 || obj7 != null) {
            interfaceC10429bMo5570c.mo5585s(serialDescriptor, 14, kSerializerArr[14], obj7);
        }
        boolean zMo5565F13 = interfaceC10429bMo5570c.mo5565F(serialDescriptor);
        boolean z10 = value.f21400v;
        if (zMo5565F13) {
            interfaceC10429bMo5570c.mo5583q(serialDescriptor, 15, z10);
        } else {
            if (str3 != null && !AbstractC21322p.m21681O(str3) && !str3.equals("New chat")) {
                z6 = true;
            }
            if (z10 != z6) {
                interfaceC10429bMo5570c.mo5583q(serialDescriptor, 15, z10);
            }
        }
        interfaceC10429bMo5570c.mo5569b(serialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
