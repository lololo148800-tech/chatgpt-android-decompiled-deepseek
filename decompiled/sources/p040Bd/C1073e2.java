package p040Bd;

import ao.AbstractC11153a0;
import ao.C11164g;
import ao.C11181o0;
import ao.InterfaceC11127C;
import bo.C11518f;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.json.C16642a;
import p1155zi.C21928J0;
import p1155zi.C21936L0;
import p1155zi.C21960S1;
import p1155zi.C21966U1;
import p1155zi.C21977Y0;
import p1155zi.C21984a1;
import p559Wn.C8981m;
import p594Y9.AbstractC9961r4;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;
import p909nm.C17689w;

/* JADX INFO: renamed from: Bd.e2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1073e2 implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C1073e2 f2922a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C1073e2 c1073e2 = new C1073e2();
        f2922a = c1073e2;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.api.message.ApiConversationMessageMetadata", c1073e2, 36);
        pluginGeneratedSerialDescriptor.m18453j("parentId", true);
        pluginGeneratedSerialDescriptor.m18453j("finishDetails", true);
        pluginGeneratedSerialDescriptor.m18453j("modelSlug", true);
        pluginGeneratedSerialDescriptor.m18453j("defaultModelSlug", true);
        pluginGeneratedSerialDescriptor.m18453j("isUserSystemMessage", true);
        pluginGeneratedSerialDescriptor.m18453j("isVisuallyHiddenFromConversation", true);
        pluginGeneratedSerialDescriptor.m18453j("excludeAfterNextUserMessage", true);
        pluginGeneratedSerialDescriptor.m18453j("userContextMessageData", true);
        pluginGeneratedSerialDescriptor.m18453j("citations", true);
        pluginGeneratedSerialDescriptor.m18453j("contentReferences", true);
        pluginGeneratedSerialDescriptor.m18453j("searchResultGroups", true);
        pluginGeneratedSerialDescriptor.m18453j("imageResults", true);
        pluginGeneratedSerialDescriptor.m18453j("command", true);
        pluginGeneratedSerialDescriptor.m18453j("args", true);
        pluginGeneratedSerialDescriptor.m18453j("status", true);
        pluginGeneratedSerialDescriptor.m18453j("_cite_metadata", true);
        pluginGeneratedSerialDescriptor.m18453j("sharedConversationId", true);
        pluginGeneratedSerialDescriptor.m18453j("attachments", true);
        pluginGeneratedSerialDescriptor.m18453j("dalle", true);
        pluginGeneratedSerialDescriptor.m18453j("aggregateResult", true);
        pluginGeneratedSerialDescriptor.m18453j("jitPluginData", true);
        pluginGeneratedSerialDescriptor.m18453j("invokedPlugin", true);
        pluginGeneratedSerialDescriptor.m18453j("gizmoId", true);
        pluginGeneratedSerialDescriptor.m18453j("adaVisualizations", true);
        pluginGeneratedSerialDescriptor.m18453j("targetedReplyLabel", true);
        pluginGeneratedSerialDescriptor.m18453j("modelAdjustments", true);
        pluginGeneratedSerialDescriptor.m18453j("modelSwitcherDeny", true);
        pluginGeneratedSerialDescriptor.m18453j("realTimeAudioHasVideo", true);
        pluginGeneratedSerialDescriptor.m18453j("initialText", true);
        pluginGeneratedSerialDescriptor.m18453j("finishedText", true);
        pluginGeneratedSerialDescriptor.m18453j("summarizationHeadline", true);
        pluginGeneratedSerialDescriptor.m18453j("messageLocale", true);
        pluginGeneratedSerialDescriptor.m18453j("disableToolIds", true);
        pluginGeneratedSerialDescriptor.m18453j("permissions", true);
        pluginGeneratedSerialDescriptor.m18453j("canvas", true);
        pluginGeneratedSerialDescriptor.m18453j("dictation", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = C1087g2.f2945K;
        KSerializer kSerializerM10615b = AbstractC9961r4.m10615b(C21977Y0.f69577a);
        KSerializer kSerializerM10615b2 = AbstractC9961r4.m10615b(C1176u3.f3127a);
        C11181o0 c11181o0 = C11181o0.f33827a;
        KSerializer kSerializerM10615b3 = AbstractC9961r4.m10615b(c11181o0);
        KSerializer kSerializerM10615b4 = AbstractC9961r4.m10615b(c11181o0);
        C11164g c11164g = C11164g.f33804a;
        return new KSerializer[]{kSerializerM10615b, kSerializerM10615b2, kSerializerM10615b3, kSerializerM10615b4, AbstractC9961r4.m10615b(c11164g), AbstractC9961r4.m10615b(c11164g), AbstractC9961r4.m10615b(c11164g), AbstractC9961r4.m10615b(C1127m2.f3042a), AbstractC9961r4.m10615b(kSerializerArr[8]), kSerializerArr[9], kSerializerArr[10], kSerializerArr[11], AbstractC9961r4.m10615b(c11181o0), AbstractC9961r4.m10615b(C11518f.f34849a), AbstractC9961r4.m10615b(c11181o0), AbstractC9961r4.m10615b(C0891A3.f2615a), AbstractC9961r4.m10615b(C21960S1.f69525a), AbstractC9961r4.m10615b(kSerializerArr[17]), AbstractC9961r4.m10615b(C1165s4.f3089a), AbstractC9961r4.m10615b(C1039Z2.f2866a), AbstractC9961r4.m10615b(C1199y2.f3157a), AbstractC9961r4.m10615b(C1181v2.f3130a), AbstractC9961r4.m10615b(C21928J0.f69475a), AbstractC9961r4.m10615b(kSerializerArr[23]), AbstractC9961r4.m10615b(c11181o0), AbstractC9961r4.m10615b(kSerializerArr[25]), AbstractC9961r4.m10615b(kSerializerArr[26]), c11164g, AbstractC9961r4.m10615b(c11181o0), AbstractC9961r4.m10615b(c11181o0), AbstractC9961r4.m10615b(c11181o0), AbstractC9961r4.m10615b(c11181o0), AbstractC9961r4.m10615b(kSerializerArr[32]), AbstractC9961r4.m10615b(kSerializerArr[33]), AbstractC9961r4.m10615b(C1194x3.f3150a), c11164g};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        int i10;
        C21984a1 c21984a1;
        String str;
        List list;
        List list2;
        C1053b3 c1053b3;
        String str2;
        int i11;
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C1087g2.f2945K;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        boolean z6 = true;
        List list3 = null;
        int i12 = 0;
        int i13 = 0;
        String str6 = null;
        List list4 = null;
        List list5 = null;
        C1206z3 c1206z3 = null;
        String str7 = null;
        List list6 = null;
        String str8 = null;
        C1188w3 c1188w3 = null;
        String str9 = null;
        String str10 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        C1139o2 c1139o2 = null;
        List list7 = null;
        List list8 = null;
        List list9 = null;
        List list10 = null;
        String str11 = null;
        C16642a c16642a = null;
        String str12 = null;
        C0903C3 c0903c3 = null;
        String str13 = null;
        List list11 = null;
        C0892A4 c0892a4 = null;
        boolean zMo5481o = false;
        C1053b3 c1053b4 = null;
        C1033Y2 c1033y2 = null;
        C1193x2 c1193x2 = null;
        String str14 = null;
        List list12 = null;
        boolean zMo5481o2 = false;
        while (z6) {
            boolean z10 = z6;
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            switch (iMo10914s) {
                case -1:
                    list8 = list8;
                    z10 = false;
                    c1188w3 = c1188w3;
                    str6 = str6;
                    list4 = list4;
                    list6 = list6;
                    str3 = str3;
                    str13 = str13;
                    c1193x2 = c1193x2;
                    str14 = str14;
                    c1139o2 = c1139o2;
                    str11 = str11;
                    c16642a = c16642a;
                    str4 = str4;
                    bool = bool;
                    str10 = str10;
                    c1033y2 = c1033y2;
                    str5 = str5;
                    c1206z3 = c1206z3;
                    list10 = list10;
                    c1053b4 = c1053b4;
                    c0892a4 = c0892a4;
                    list9 = list9;
                    str9 = str9;
                    list5 = list5;
                    list12 = list12;
                    str12 = str12;
                    bool3 = bool3;
                    list3 = list3;
                    list11 = list11;
                    c1188w3 = c1188w3;
                    kSerializerArr = kSerializerArr;
                    z6 = z10;
                    list8 = list8;
                    break;
                case 0:
                    Boolean bool4 = bool2;
                    List list13 = list8;
                    List list14 = list7;
                    String str15 = str7;
                    C1188w3 c1188w4 = c1188w3;
                    C21977Y0 c21977y0 = C21977Y0.f69577a;
                    if (str8 != null) {
                        c21984a1 = new C21984a1(str8);
                        i10 = 0;
                    } else {
                        i10 = 0;
                        c21984a1 = null;
                    }
                    C21984a1 c21984a2 = (C21984a1) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, i10, c21977y0, c21984a1);
                    i12 |= 1;
                    list7 = list14;
                    list8 = list13;
                    str8 = c21984a2 != null ? c21984a2.f69607Y : null;
                    c1188w3 = c1188w4;
                    bool2 = bool4;
                    str7 = str15;
                    str6 = str6;
                    list4 = list4;
                    list6 = list6;
                    str3 = str3;
                    str13 = str13;
                    c1193x2 = c1193x2;
                    str14 = str14;
                    c1139o2 = c1139o2;
                    str11 = str11;
                    c16642a = c16642a;
                    str4 = str4;
                    bool = bool;
                    str10 = str10;
                    c1033y2 = c1033y2;
                    str5 = str5;
                    c1206z3 = c1206z3;
                    list10 = list10;
                    c1053b4 = c1053b4;
                    c0892a4 = c0892a4;
                    list9 = list9;
                    str9 = str9;
                    list5 = list5;
                    list12 = list12;
                    str12 = str12;
                    bool3 = bool3;
                    list3 = list3;
                    list11 = list11;
                    c1188w3 = c1188w3;
                    kSerializerArr = kSerializerArr;
                    z6 = z10;
                    list8 = list8;
                    break;
                case 1:
                    str = str11;
                    List list15 = list11;
                    List list16 = list3;
                    String str16 = str5;
                    Boolean bool5 = bool;
                    C16642a c16642a2 = c16642a;
                    String str17 = str14;
                    List list17 = list4;
                    List list18 = list10;
                    C1033Y2 c1033y3 = c1033y2;
                    i12 |= 2;
                    list8 = list8;
                    c1188w3 = (C1188w3) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 1, C1176u3.f3127a, c1188w3);
                    str7 = str7;
                    list4 = list17;
                    list5 = list5;
                    list6 = list6;
                    str3 = str3;
                    str13 = str13;
                    str14 = str17;
                    list12 = list12;
                    c1139o2 = c1139o2;
                    c16642a = c16642a2;
                    str12 = str12;
                    str4 = str4;
                    bool = bool5;
                    bool3 = bool3;
                    c1033y2 = c1033y3;
                    list3 = list16;
                    str5 = str16;
                    list11 = list15;
                    list10 = list18;
                    c1053b4 = c1053b4;
                    c0892a4 = c0892a4;
                    list9 = list9;
                    str6 = str6;
                    c1193x2 = c1193x2;
                    str11 = str;
                    str10 = str10;
                    c1206z3 = c1206z3;
                    c1188w3 = c1188w3;
                    kSerializerArr = kSerializerArr;
                    z6 = z10;
                    list8 = list8;
                    break;
                case 2:
                    List list19 = list11;
                    List list20 = list3;
                    Boolean bool6 = bool3;
                    String str18 = str5;
                    Boolean bool7 = bool;
                    C16642a c16642a3 = c16642a;
                    String str19 = str14;
                    List list21 = list4;
                    List list22 = list10;
                    C1033Y2 c1033y4 = c1033y2;
                    str = str11;
                    i12 |= 4;
                    list8 = list8;
                    str9 = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 2, C11181o0.f33827a, str9);
                    c1188w3 = c1188w3;
                    str7 = str7;
                    list5 = list5;
                    list6 = list6;
                    str3 = str3;
                    str13 = str13;
                    list12 = list12;
                    c1139o2 = c1139o2;
                    str12 = str12;
                    str4 = str4;
                    bool3 = bool6;
                    c1033y2 = c1033y4;
                    list3 = list20;
                    list11 = list19;
                    list10 = list22;
                    list4 = list21;
                    str14 = str19;
                    c16642a = c16642a3;
                    bool = bool7;
                    str5 = str18;
                    c1053b4 = c1053b4;
                    c0892a4 = c0892a4;
                    list9 = list9;
                    str6 = str6;
                    c1193x2 = c1193x2;
                    str11 = str;
                    str10 = str10;
                    c1206z3 = c1206z3;
                    c1188w3 = c1188w3;
                    kSerializerArr = kSerializerArr;
                    z6 = z10;
                    list8 = list8;
                    break;
                case 3:
                    String str20 = str3;
                    C1206z3 c1206z4 = c1206z3;
                    List list23 = list8;
                    C16642a c16642a4 = c16642a;
                    list11 = list11;
                    String str21 = str14;
                    kSerializerArr = kSerializerArr;
                    list3 = list3;
                    List list24 = list4;
                    bool3 = bool3;
                    List list25 = list10;
                    str12 = str12;
                    C1033Y2 c1033y5 = c1033y2;
                    list12 = list12;
                    list5 = list5;
                    String str22 = str11;
                    C1193x2 c1193x3 = c1193x2;
                    String str23 = str6;
                    List list26 = list9;
                    i12 |= 8;
                    list8 = list23;
                    str10 = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 3, C11181o0.f33827a, str10);
                    c1188w3 = c1188w3;
                    str7 = str7;
                    c1206z3 = c1206z4;
                    list6 = list6;
                    str3 = str20;
                    str13 = str13;
                    c1139o2 = c1139o2;
                    str4 = str4;
                    c1033y2 = c1033y5;
                    list10 = list25;
                    list4 = list24;
                    str14 = str21;
                    c16642a = c16642a4;
                    bool = bool;
                    str5 = str5;
                    c1053b4 = c1053b4;
                    c0892a4 = c0892a4;
                    list9 = list26;
                    str6 = str23;
                    c1193x2 = c1193x3;
                    str11 = str22;
                    list5 = list5;
                    list12 = list12;
                    str12 = str12;
                    bool3 = bool3;
                    list3 = list3;
                    list11 = list11;
                    c1188w3 = c1188w3;
                    kSerializerArr = kSerializerArr;
                    z6 = z10;
                    list8 = list8;
                    break;
                case 4:
                    String str24 = str3;
                    C1206z3 c1206z5 = c1206z3;
                    List list27 = list8;
                    C16642a c16642a5 = c16642a;
                    String str25 = str14;
                    kSerializerArr = kSerializerArr;
                    List list28 = list4;
                    List list29 = list10;
                    C1033Y2 c1033y6 = c1033y2;
                    String str26 = str4;
                    C1053b3 c1053b5 = c1053b4;
                    String str27 = str5;
                    List list30 = list11;
                    list3 = list3;
                    bool3 = bool3;
                    str12 = str12;
                    List list31 = list12;
                    List list32 = list5;
                    String str28 = str11;
                    list11 = list30;
                    i12 |= 16;
                    list8 = list27;
                    bool = (Boolean) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 4, C11164g.f33804a, bool);
                    c1188w3 = c1188w3;
                    str7 = str7;
                    str5 = str27;
                    list6 = list6;
                    str3 = str24;
                    str13 = str13;
                    c1053b4 = c1053b5;
                    c1139o2 = c1139o2;
                    c0892a4 = c0892a4;
                    str4 = str26;
                    list9 = list9;
                    c1033y2 = c1033y6;
                    str6 = str6;
                    list10 = list29;
                    c1193x2 = c1193x2;
                    list4 = list28;
                    str11 = str28;
                    str14 = str25;
                    list5 = list32;
                    c16642a = c16642a5;
                    list12 = list31;
                    c1206z3 = c1206z5;
                    str12 = str12;
                    bool3 = bool3;
                    list3 = list3;
                    list11 = list11;
                    c1188w3 = c1188w3;
                    kSerializerArr = kSerializerArr;
                    z6 = z10;
                    list8 = list8;
                    break;
                case 5:
                    String str29 = str3;
                    C1206z3 c1206z6 = c1206z3;
                    List list33 = list6;
                    List list34 = list8;
                    C16642a c16642a6 = c16642a;
                    String str30 = str12;
                    String str31 = str14;
                    List list35 = list12;
                    kSerializerArr = kSerializerArr;
                    List list36 = list4;
                    List list37 = list5;
                    List list38 = list10;
                    String str32 = str11;
                    C1033Y2 c1033y7 = c1033y2;
                    C1193x2 c1193x4 = c1193x2;
                    String str33 = str6;
                    List list39 = list9;
                    C0892A4 c0892a5 = c0892a4;
                    C1053b3 c1053b6 = c1053b4;
                    i12 |= 32;
                    list8 = list34;
                    bool2 = (Boolean) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 5, C11164g.f33804a, bool2);
                    c1188w3 = c1188w3;
                    str7 = str7;
                    list6 = list33;
                    str3 = str29;
                    str13 = str13;
                    c1139o2 = c1139o2;
                    str4 = str4;
                    c1033y2 = c1033y7;
                    list10 = list38;
                    list4 = list36;
                    str14 = str31;
                    c16642a = c16642a6;
                    c1206z3 = c1206z6;
                    list11 = list11;
                    str5 = str5;
                    c1053b4 = c1053b6;
                    c0892a4 = c0892a5;
                    list9 = list39;
                    str6 = str33;
                    c1193x2 = c1193x4;
                    str11 = str32;
                    list5 = list37;
                    list12 = list35;
                    str12 = str30;
                    bool3 = bool3;
                    list3 = list3;
                    c1188w3 = c1188w3;
                    kSerializerArr = kSerializerArr;
                    z6 = z10;
                    list8 = list8;
                    break;
                case 6:
                    String str34 = str3;
                    C1206z3 c1206z7 = c1206z3;
                    list6 = list6;
                    List list40 = list8;
                    C16642a c16642a7 = c16642a;
                    str12 = str12;
                    String str35 = str14;
                    list = list12;
                    kSerializerArr = kSerializerArr;
                    List list41 = list4;
                    List list42 = list5;
                    String str36 = str11;
                    C1193x2 c1193x5 = c1193x2;
                    String str37 = str6;
                    List list43 = list9;
                    C0892A4 c0892a6 = c0892a4;
                    C1053b3 c1053b7 = c1053b4;
                    String str38 = str5;
                    i12 |= 64;
                    list8 = list40;
                    bool3 = (Boolean) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 6, C11164g.f33804a, bool3);
                    c1188w3 = c1188w3;
                    str7 = str7;
                    list3 = list3;
                    str3 = str34;
                    list11 = list11;
                    str13 = str13;
                    str5 = str38;
                    c1139o2 = c1139o2;
                    c1053b4 = c1053b7;
                    str4 = str4;
                    c0892a4 = c0892a6;
                    c1033y2 = c1033y2;
                    list9 = list43;
                    list10 = list10;
                    str6 = str37;
                    list4 = list41;
                    c1193x2 = c1193x5;
                    str14 = str35;
                    str11 = str36;
                    c16642a = c16642a7;
                    list5 = list42;
                    c1206z3 = c1206z7;
                    list12 = list;
                    str12 = str12;
                    list6 = list6;
                    c1188w3 = c1188w3;
                    kSerializerArr = kSerializerArr;
                    z6 = z10;
                    list8 = list8;
                    break;
                case 7:
                    String str39 = str3;
                    C1206z3 c1206z8 = c1206z3;
                    list6 = list6;
                    List list44 = list8;
                    C16642a c16642a8 = c16642a;
                    str12 = str12;
                    String str40 = str14;
                    list = list12;
                    kSerializerArr = kSerializerArr;
                    List list45 = list4;
                    List list46 = list5;
                    List list47 = list10;
                    C1033Y2 c1033y8 = c1033y2;
                    String str41 = str4;
                    C0892A4 c0892a7 = c0892a4;
                    C1053b3 c1053b8 = c1053b4;
                    String str42 = str5;
                    i12 |= 128;
                    list8 = list44;
                    c1139o2 = (C1139o2) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 7, C1127m2.f3042a, c1139o2);
                    c1188w3 = c1188w3;
                    str7 = str7;
                    str4 = str41;
                    str3 = str39;
                    str13 = str13;
                    c1033y2 = c1033y8;
                    list3 = list3;
                    list11 = list11;
                    list10 = list47;
                    str5 = str42;
                    list4 = list45;
                    str14 = str40;
                    c1053b4 = c1053b8;
                    c16642a = c16642a8;
                    c0892a4 = c0892a7;
                    c1206z3 = c1206z8;
                    list9 = list9;
                    str6 = str6;
                    c1193x2 = c1193x2;
                    str11 = str11;
                    list5 = list46;
                    list12 = list;
                    str12 = str12;
                    list6 = list6;
                    c1188w3 = c1188w3;
                    kSerializerArr = kSerializerArr;
                    z6 = z10;
                    list8 = list8;
                    break;
                case 8:
                    list2 = list8;
                    c1053b3 = c1053b4;
                    i12 |= 256;
                    list7 = (List) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 8, kSerializerArr[8], list7);
                    list8 = list2;
                    str7 = str7;
                    str6 = str6;
                    str3 = str3;
                    str13 = str13;
                    c1193x2 = c1193x2;
                    list3 = list3;
                    list11 = list11;
                    str11 = str11;
                    str5 = str5;
                    list5 = list5;
                    list12 = list12;
                    c1053b4 = c1053b3;
                    c0892a4 = c0892a4;
                    str12 = str12;
                    str4 = str4;
                    list6 = list6;
                    c1033y2 = c1033y2;
                    list10 = list10;
                    list4 = list4;
                    str14 = str14;
                    c16642a = c16642a;
                    c1206z3 = c1206z3;
                    c1188w3 = c1188w3;
                    kSerializerArr = kSerializerArr;
                    z6 = z10;
                    list8 = list8;
                    break;
                case 9:
                    c1053b3 = c1053b4;
                    list2 = (List) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 9, kSerializerArr[9], list8);
                    i12 |= 512;
                    list8 = list2;
                    str7 = str7;
                    str6 = str6;
                    str3 = str3;
                    str13 = str13;
                    c1193x2 = c1193x2;
                    list3 = list3;
                    list11 = list11;
                    str11 = str11;
                    str5 = str5;
                    list5 = list5;
                    list12 = list12;
                    c1053b4 = c1053b3;
                    c0892a4 = c0892a4;
                    str12 = str12;
                    str4 = str4;
                    list6 = list6;
                    c1033y2 = c1033y2;
                    list10 = list10;
                    list4 = list4;
                    str14 = str14;
                    c16642a = c16642a;
                    c1206z3 = c1206z3;
                    c1188w3 = c1188w3;
                    kSerializerArr = kSerializerArr;
                    z6 = z10;
                    list8 = list8;
                    break;
                case 10:
                    String str43 = str3;
                    C1206z3 c1206z9 = c1206z3;
                    list6 = list6;
                    String str44 = str12;
                    C1053b3 c1053b9 = c1053b4;
                    List list48 = list12;
                    String str45 = str5;
                    List list49 = list5;
                    String str46 = str11;
                    List list50 = list11;
                    i12 |= 1024;
                    list9 = (List) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 10, kSerializerArr[10], list9);
                    list8 = list8;
                    str7 = str7;
                    str4 = str4;
                    str6 = str6;
                    kSerializerArr = kSerializerArr;
                    str13 = str13;
                    c1188w3 = c1188w3;
                    c1033y2 = c1033y2;
                    c1193x2 = c1193x2;
                    list3 = list3;
                    list11 = list50;
                    list10 = list10;
                    str11 = str46;
                    str5 = str45;
                    list4 = list4;
                    list5 = list49;
                    c1053b4 = c1053b9;
                    str14 = str14;
                    list12 = list48;
                    str3 = str43;
                    c16642a = c16642a;
                    str12 = str44;
                    c1206z3 = c1206z9;
                    list6 = list6;
                    c1188w3 = c1188w3;
                    kSerializerArr = kSerializerArr;
                    z6 = z10;
                    list8 = list8;
                    break;
                case 11:
                    C1206z3 c1206z10 = c1206z3;
                    C16642a c16642a9 = c16642a;
                    C1053b3 c1053b10 = c1053b4;
                    String str47 = str14;
                    list = list12;
                    String str48 = str5;
                    List list51 = list4;
                    List list52 = list11;
                    i12 |= 2048;
                    list10 = (List) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 11, kSerializerArr[11], list10);
                    str7 = str7;
                    str4 = str4;
                    list4 = list51;
                    str13 = str13;
                    c1033y2 = c1033y2;
                    str14 = str47;
                    list3 = list3;
                    str6 = str6;
                    list11 = list52;
                    c16642a = c16642a9;
                    c1193x2 = c1193x2;
                    str5 = str48;
                    c1206z3 = c1206z10;
                    c1053b4 = c1053b10;
                    str11 = str11;
                    list5 = list5;
                    str3 = str3;
                    list12 = list;
                    str12 = str12;
                    list6 = list6;
                    c1188w3 = c1188w3;
                    kSerializerArr = kSerializerArr;
                    z6 = z10;
                    list8 = list8;
                    break;
                case 12:
                    String str49 = str3;
                    c1206z3 = c1206z3;
                    List list53 = list6;
                    c16642a = c16642a;
                    String str50 = str12;
                    C1053b3 c1053b11 = c1053b4;
                    List list54 = list12;
                    String str51 = str5;
                    List list55 = list5;
                    String str52 = str14;
                    List list56 = list4;
                    i12 |= 4096;
                    str11 = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 12, C11181o0.f33827a, str11);
                    list8 = list8;
                    str7 = str7;
                    str4 = str4;
                    list5 = list55;
                    kSerializerArr = kSerializerArr;
                    str13 = str13;
                    c1033y2 = c1033y2;
                    list12 = list54;
                    list3 = list3;
                    str6 = str6;
                    list11 = list11;
                    c1193x2 = c1193x2;
                    str12 = str50;
                    str5 = str51;
                    list4 = list56;
                    list6 = list53;
                    c1053b4 = c1053b11;
                    str14 = str52;
                    str3 = str49;
                    c16642a = c16642a;
                    c1206z3 = c1206z3;
                    c1188w3 = c1188w3;
                    kSerializerArr = kSerializerArr;
                    z6 = z10;
                    list8 = list8;
                    break;
                case 13:
                    C1053b3 c1053b12 = c1053b4;
                    String str53 = str5;
                    String str54 = str14;
                    List list57 = list4;
                    list = list12;
                    i12 |= 8192;
                    c16642a = (C16642a) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 13, C11518f.f34849a, c16642a);
                    str7 = str7;
                    str4 = str4;
                    c1206z3 = c1206z3;
                    str13 = str13;
                    c1033y2 = c1033y2;
                    list3 = list3;
                    str6 = str6;
                    list11 = list11;
                    c1193x2 = c1193x2;
                    str5 = str53;
                    list4 = list57;
                    c1053b4 = c1053b12;
                    str14 = str54;
                    list5 = list5;
                    str3 = str3;
                    list12 = list;
                    str12 = str12;
                    list6 = list6;
                    c1188w3 = c1188w3;
                    kSerializerArr = kSerializerArr;
                    z6 = z10;
                    list8 = list8;
                    break;
                case 14:
                    str2 = str7;
                    i12 |= 16384;
                    str12 = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 14, C11181o0.f33827a, str12);
                    list8 = list8;
                    str7 = str2;
                    str4 = str4;
                    list6 = list6;
                    kSerializerArr = kSerializerArr;
                    str13 = str13;
                    c1033y2 = c1033y2;
                    c1188w3 = c1188w3;
                    list3 = list3;
                    str6 = str6;
                    list11 = list11;
                    c1193x2 = c1193x2;
                    str5 = str5;
                    list4 = list4;
                    c1053b4 = c1053b4;
                    str14 = str14;
                    list5 = list5;
                    str3 = str3;
                    list12 = list12;
                    c1206z3 = c1206z3;
                    c1188w3 = c1188w3;
                    kSerializerArr = kSerializerArr;
                    z6 = z10;
                    list8 = list8;
                    break;
                case 15:
                    str2 = str7;
                    i12 |= 32768;
                    c0903c3 = (C0903C3) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 15, C0891A3.f2615a, c0903c3);
                    list8 = list8;
                    str7 = str2;
                    str4 = str4;
                    list6 = list6;
                    kSerializerArr = kSerializerArr;
                    str13 = str13;
                    c1033y2 = c1033y2;
                    c1188w3 = c1188w3;
                    list3 = list3;
                    str6 = str6;
                    list11 = list11;
                    c1193x2 = c1193x2;
                    str5 = str5;
                    list4 = list4;
                    c1053b4 = c1053b4;
                    str14 = str14;
                    list5 = list5;
                    str3 = str3;
                    list12 = list12;
                    c1206z3 = c1206z3;
                    c1188w3 = c1188w3;
                    kSerializerArr = kSerializerArr;
                    z6 = z10;
                    list8 = list8;
                    break;
                case 16:
                    String str55 = str3;
                    c1206z3 = c1206z3;
                    List list58 = list6;
                    C1053b3 c1053b13 = c1053b4;
                    list12 = list12;
                    String str56 = str5;
                    list5 = list5;
                    String str57 = str7;
                    List list59 = list11;
                    str14 = str14;
                    List list60 = list4;
                    C1193x2 c1193x6 = c1193x2;
                    String str58 = str6;
                    C1033Y2 c1033y9 = c1033y2;
                    String str59 = str4;
                    C0892A4 c0892a8 = c0892a4;
                    C21966U1 c21966u1 = (C21966U1) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 16, C21960S1.f69525a, str13 != null ? new C21966U1(str13) : null);
                    i12 |= 65536;
                    c0892a4 = c0892a8;
                    str13 = c21966u1 != null ? c21966u1.f69541a : null;
                    str7 = str57;
                    list8 = list8;
                    list3 = list3;
                    str4 = str59;
                    list6 = list58;
                    kSerializerArr = kSerializerArr;
                    list11 = list59;
                    c1033y2 = c1033y9;
                    c1188w3 = c1188w3;
                    str5 = str56;
                    str6 = str58;
                    c1053b4 = c1053b13;
                    c1193x2 = c1193x6;
                    list4 = list60;
                    str3 = str55;
                    str14 = str14;
                    list5 = list5;
                    list12 = list12;
                    c1206z3 = c1206z3;
                    c1188w3 = c1188w3;
                    kSerializerArr = kSerializerArr;
                    z6 = z10;
                    list8 = list8;
                    break;
                case 17:
                    i12 |= 131072;
                    list11 = (List) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 17, kSerializerArr[17], list11);
                    str7 = str7;
                    str5 = str5;
                    str4 = str4;
                    list6 = list6;
                    c1053b4 = c1053b4;
                    c1033y2 = c1033y2;
                    str6 = str6;
                    str3 = str3;
                    list4 = list4;
                    str14 = str14;
                    list5 = list5;
                    list12 = list12;
                    c1206z3 = c1206z3;
                    c1188w3 = c1188w3;
                    kSerializerArr = kSerializerArr;
                    z6 = z10;
                    list8 = list8;
                    break;
                case 18:
                    i12 |= 262144;
                    c0892a4 = (C0892A4) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 18, C1165s4.f3089a, c0892a4);
                    str7 = str7;
                    str4 = str4;
                    list6 = list6;
                    str3 = str3;
                    c1033y2 = c1033y2;
                    str6 = str6;
                    list4 = list4;
                    str14 = str14;
                    list5 = list5;
                    list12 = list12;
                    c1206z3 = c1206z3;
                    c1188w3 = c1188w3;
                    kSerializerArr = kSerializerArr;
                    z6 = z10;
                    list8 = list8;
                    break;
                case 19:
                    i12 |= 524288;
                    c1053b4 = (C1053b3) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 19, C1039Z2.f2866a, c1053b4);
                    str7 = str7;
                    str6 = str6;
                    list6 = list6;
                    str3 = str3;
                    kSerializerArr = kSerializerArr;
                    c1188w3 = c1188w3;
                    list4 = list4;
                    str14 = str14;
                    list5 = list5;
                    list12 = list12;
                    c1206z3 = c1206z3;
                    c1188w3 = c1188w3;
                    kSerializerArr = kSerializerArr;
                    z6 = z10;
                    list8 = list8;
                    break;
                case 20:
                    i12 |= 1048576;
                    c1033y2 = (C1033Y2) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 20, C1199y2.f3157a, c1033y2);
                    str7 = str7;
                    str6 = str6;
                    list6 = list6;
                    kSerializerArr = kSerializerArr;
                    c1188w3 = c1188w3;
                    list4 = list4;
                    str14 = str14;
                    list5 = list5;
                    list12 = list12;
                    c1206z3 = c1206z3;
                    c1188w3 = c1188w3;
                    kSerializerArr = kSerializerArr;
                    z6 = z10;
                    list8 = list8;
                    break;
                case 21:
                    c1206z3 = c1206z3;
                    list12 = list12;
                    list5 = list5;
                    i12 |= 2097152;
                    c1193x2 = (C1193x2) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 21, C1181v2.f3130a, c1193x2);
                    str7 = str7;
                    list8 = list8;
                    list4 = list4;
                    list6 = list6;
                    kSerializerArr = kSerializerArr;
                    str14 = str14;
                    c1188w3 = c1188w3;
                    list5 = list5;
                    list12 = list12;
                    c1206z3 = c1206z3;
                    c1188w3 = c1188w3;
                    kSerializerArr = kSerializerArr;
                    z6 = z10;
                    list8 = list8;
                    break;
                case 22:
                    c1206z3 = c1206z3;
                    List list61 = list6;
                    List list62 = list12;
                    String str60 = str7;
                    C21936L0 c21936l0 = (C21936L0) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 22, C21928J0.f69475a, str14 != null ? new C21936L0(str14) : null);
                    i12 |= 4194304;
                    str14 = c21936l0 != null ? c21936l0.f69488a : null;
                    str7 = str60;
                    list8 = list8;
                    list5 = list5;
                    list6 = list61;
                    kSerializerArr = kSerializerArr;
                    list12 = list62;
                    c1188w3 = c1188w3;
                    c1206z3 = c1206z3;
                    c1188w3 = c1188w3;
                    kSerializerArr = kSerializerArr;
                    z6 = z10;
                    list8 = list8;
                    break;
                case 23:
                    i12 |= 8388608;
                    list12 = (List) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 23, kSerializerArr[23], list12);
                    str7 = str7;
                    c1206z3 = c1206z3;
                    list6 = list6;
                    kSerializerArr = kSerializerArr;
                    c1188w3 = c1188w3;
                    c1188w3 = c1188w3;
                    kSerializerArr = kSerializerArr;
                    z6 = z10;
                    list8 = list8;
                    break;
                case 24:
                    str7 = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 24, C11181o0.f33827a, str7);
                    i12 |= 16777216;
                    list6 = list6;
                    kSerializerArr = kSerializerArr;
                    c1188w3 = c1188w3;
                    c1188w3 = c1188w3;
                    kSerializerArr = kSerializerArr;
                    z6 = z10;
                    list8 = list8;
                    break;
                case 25:
                    list6 = (List) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 25, kSerializerArr[25], list6);
                    i11 = 33554432;
                    i12 |= i11;
                    list8 = list8;
                    str7 = str7;
                    kSerializerArr = kSerializerArr;
                    c1188w3 = c1188w3;
                    c1188w3 = c1188w3;
                    kSerializerArr = kSerializerArr;
                    z6 = z10;
                    list8 = list8;
                    break;
                case 26:
                    list3 = (List) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 26, kSerializerArr[26], list3);
                    i11 = 67108864;
                    i12 |= i11;
                    list8 = list8;
                    str7 = str7;
                    kSerializerArr = kSerializerArr;
                    c1188w3 = c1188w3;
                    c1188w3 = c1188w3;
                    kSerializerArr = kSerializerArr;
                    z6 = z10;
                    list8 = list8;
                    break;
                case 27:
                    zMo5481o = interfaceC10428aMo5471c.mo5481o(pluginGeneratedSerialDescriptor, 27);
                    i12 |= 134217728;
                    list8 = list8;
                    kSerializerArr = kSerializerArr;
                    c1188w3 = c1188w3;
                    c1188w3 = c1188w3;
                    kSerializerArr = kSerializerArr;
                    z6 = z10;
                    list8 = list8;
                    break;
                case 28:
                    str5 = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 28, C11181o0.f33827a, str5);
                    i11 = 268435456;
                    i12 |= i11;
                    list8 = list8;
                    str7 = str7;
                    kSerializerArr = kSerializerArr;
                    c1188w3 = c1188w3;
                    c1188w3 = c1188w3;
                    kSerializerArr = kSerializerArr;
                    z6 = z10;
                    list8 = list8;
                    break;
                case 29:
                    str4 = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 29, C11181o0.f33827a, str4);
                    i11 = 536870912;
                    i12 |= i11;
                    list8 = list8;
                    str7 = str7;
                    kSerializerArr = kSerializerArr;
                    c1188w3 = c1188w3;
                    c1188w3 = c1188w3;
                    kSerializerArr = kSerializerArr;
                    z6 = z10;
                    list8 = list8;
                    break;
                case 30:
                    str3 = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 30, C11181o0.f33827a, str3);
                    i11 = 1073741824;
                    i12 |= i11;
                    list8 = list8;
                    str7 = str7;
                    kSerializerArr = kSerializerArr;
                    c1188w3 = c1188w3;
                    c1188w3 = c1188w3;
                    kSerializerArr = kSerializerArr;
                    z6 = z10;
                    list8 = list8;
                    break;
                case 31:
                    str6 = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 31, C11181o0.f33827a, str6);
                    i11 = Integer.MIN_VALUE;
                    i12 |= i11;
                    list8 = list8;
                    str7 = str7;
                    kSerializerArr = kSerializerArr;
                    c1188w3 = c1188w3;
                    c1188w3 = c1188w3;
                    kSerializerArr = kSerializerArr;
                    z6 = z10;
                    list8 = list8;
                    break;
                case 32:
                    str7 = str7;
                    list4 = (List) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 32, kSerializerArr[32], list4);
                    i13 |= 1;
                    list8 = list8;
                    str7 = str7;
                    kSerializerArr = kSerializerArr;
                    c1188w3 = c1188w3;
                    c1188w3 = c1188w3;
                    kSerializerArr = kSerializerArr;
                    z6 = z10;
                    list8 = list8;
                    break;
                case 33:
                    str7 = str7;
                    list5 = (List) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 33, kSerializerArr[33], list5);
                    i13 |= 2;
                    list8 = list8;
                    str7 = str7;
                    kSerializerArr = kSerializerArr;
                    c1188w3 = c1188w3;
                    c1188w3 = c1188w3;
                    kSerializerArr = kSerializerArr;
                    z6 = z10;
                    list8 = list8;
                    break;
                case 34:
                    str7 = str7;
                    c1206z3 = (C1206z3) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 34, C1194x3.f3150a, c1206z3);
                    i13 |= 4;
                    list8 = list8;
                    str7 = str7;
                    kSerializerArr = kSerializerArr;
                    c1188w3 = c1188w3;
                    c1188w3 = c1188w3;
                    kSerializerArr = kSerializerArr;
                    z6 = z10;
                    list8 = list8;
                    break;
                case 35:
                    zMo5481o2 = interfaceC10428aMo5471c.mo5481o(pluginGeneratedSerialDescriptor, 35);
                    i13 |= 8;
                    list8 = list8;
                    kSerializerArr = kSerializerArr;
                    c1188w3 = c1188w3;
                    c1188w3 = c1188w3;
                    kSerializerArr = kSerializerArr;
                    z6 = z10;
                    list8 = list8;
                    break;
                default:
                    throw new C8981m(iMo10914s);
            }
        }
        String str61 = str3;
        C1206z3 c1206z11 = c1206z3;
        List list63 = list6;
        List list64 = list10;
        String str62 = str11;
        List list65 = list11;
        C1033Y2 c1033y10 = c1033y2;
        C1193x2 c1193x7 = c1193x2;
        String str63 = str4;
        List list66 = list3;
        String str64 = str6;
        String str65 = str8;
        Boolean bool8 = bool3;
        C1139o2 c1139o3 = c1139o2;
        List list67 = list12;
        List list68 = list5;
        String str66 = str9;
        List list69 = list9;
        C0892A4 c0892a9 = c0892a4;
        C1053b3 c1053b14 = c1053b4;
        String str67 = str5;
        Boolean bool9 = bool;
        C16642a c16642a10 = c16642a;
        String str68 = str14;
        List list70 = list4;
        C1188w3 c1188w5 = c1188w3;
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C1087g2(i12, i13, str65, c1188w5, str66, str10, bool9, bool2, bool8, c1139o3, list7, list8, list69, list64, str62, c16642a10, str12, c0903c3, str13, list65, c0892a9, c1053b14, c1033y10, c1193x7, str68, list67, str7, list63, list66, zMo5481o, str67, str63, str61, str64, list70, list68, c1206z11, zMo5481o2);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C1087g2 value = (C1087g2) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        C1080f2 c1080f2 = C1087g2.Companion;
        boolean zMo5565F = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str = value.f2956a;
        if (zMo5565F || str != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 0, C21977Y0.f69577a, str != null ? new C21984a1(str) : null);
        }
        boolean zMo5565F2 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        C1188w3 c1188w3 = value.f2957b;
        if (zMo5565F2 || c1188w3 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 1, C1176u3.f3127a, c1188w3);
        }
        boolean zMo5565F3 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str2 = value.f2958c;
        if (zMo5565F3 || str2 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 2, C11181o0.f33827a, str2);
        }
        boolean zMo5565F4 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str3 = value.f2959d;
        if (zMo5565F4 || str3 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 3, C11181o0.f33827a, str3);
        }
        boolean zMo5565F5 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        Boolean bool = value.f2960e;
        if (zMo5565F5 || bool != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 4, C11164g.f33804a, bool);
        }
        boolean zMo5565F6 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        Boolean bool2 = value.f2961f;
        if (zMo5565F6 || bool2 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 5, C11164g.f33804a, bool2);
        }
        boolean zMo5565F7 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        Boolean bool3 = value.f2962g;
        if (zMo5565F7 || bool3 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 6, C11164g.f33804a, bool3);
        }
        boolean zMo5565F8 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        C1139o2 c1139o2 = value.f2963h;
        if (zMo5565F8 || c1139o2 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 7, C1127m2.f3042a, c1139o2);
        }
        boolean zMo5565F9 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        C17689w c17689w = C17689w.f56480Y;
        KSerializer[] kSerializerArr = C1087g2.f2945K;
        List list = value.f2964i;
        if (zMo5565F9 || !AbstractC16544l.m18089b(list, c17689w)) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 8, kSerializerArr[8], list);
        }
        boolean zMo5565F10 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        List list2 = value.f2965j;
        if (zMo5565F10 || !AbstractC16544l.m18089b(list2, c17689w)) {
            interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 9, kSerializerArr[9], list2);
        }
        boolean zMo5565F11 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        List list3 = value.f2966k;
        if (zMo5565F11 || !AbstractC16544l.m18089b(list3, c17689w)) {
            interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 10, kSerializerArr[10], list3);
        }
        boolean zMo5565F12 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        List list4 = value.f2967l;
        if (zMo5565F12 || !AbstractC16544l.m18089b(list4, c17689w)) {
            interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 11, kSerializerArr[11], list4);
        }
        boolean zMo5565F13 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str4 = value.f2968m;
        if (zMo5565F13 || str4 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 12, C11181o0.f33827a, str4);
        }
        boolean zMo5565F14 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        C16642a c16642a = value.f2969n;
        if (zMo5565F14 || c16642a != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 13, C11518f.f34849a, c16642a);
        }
        boolean zMo5565F15 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str5 = value.f2970o;
        if (zMo5565F15 || str5 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 14, C11181o0.f33827a, str5);
        }
        boolean zMo5565F16 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        C0903C3 c0903c3 = value.f2971p;
        if (zMo5565F16 || c0903c3 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 15, C0891A3.f2615a, c0903c3);
        }
        boolean zMo5565F17 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str6 = value.f2972q;
        if (zMo5565F17 || str6 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 16, C21960S1.f69525a, str6 != null ? new C21966U1(str6) : null);
        }
        boolean zMo5565F18 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        List list5 = value.f2973r;
        if (zMo5565F18 || list5 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 17, kSerializerArr[17], list5);
        }
        boolean zMo5565F19 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        C0892A4 c0892a4 = value.f2974s;
        if (zMo5565F19 || c0892a4 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 18, C1165s4.f3089a, c0892a4);
        }
        boolean zMo5565F20 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        C1053b3 c1053b3 = value.f2975t;
        if (zMo5565F20 || c1053b3 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 19, C1039Z2.f2866a, c1053b3);
        }
        boolean zMo5565F21 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        C1033Y2 c1033y2 = value.f2976u;
        if (zMo5565F21 || c1033y2 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 20, C1199y2.f3157a, c1033y2);
        }
        boolean zMo5565F22 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        C1193x2 c1193x2 = value.f2977v;
        if (zMo5565F22 || c1193x2 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 21, C1181v2.f3130a, c1193x2);
        }
        boolean zMo5565F23 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str7 = value.f2978w;
        if (zMo5565F23 || str7 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 22, C21928J0.f69475a, str7 != null ? new C21936L0(str7) : null);
        }
        boolean zMo5565F24 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        List list6 = value.f2979x;
        if (zMo5565F24 || list6 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 23, kSerializerArr[23], list6);
        }
        boolean zMo5565F25 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str8 = value.f2980y;
        if (zMo5565F25 || str8 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 24, C11181o0.f33827a, str8);
        }
        boolean zMo5565F26 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        List list7 = value.f2981z;
        if (zMo5565F26 || list7 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 25, kSerializerArr[25], list7);
        }
        boolean zMo5565F27 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        List list8 = value.f2946A;
        if (zMo5565F27 || list8 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 26, kSerializerArr[26], list8);
        }
        boolean zMo5565F28 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        boolean z6 = value.f2947B;
        if (zMo5565F28 || z6) {
            interfaceC10429bMo5570c.mo5583q(pluginGeneratedSerialDescriptor, 27, z6);
        }
        boolean zMo5565F29 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str9 = value.f2948C;
        if (zMo5565F29 || str9 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 28, C11181o0.f33827a, str9);
        }
        boolean zMo5565F30 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str10 = value.f2949D;
        if (zMo5565F30 || str10 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 29, C11181o0.f33827a, str10);
        }
        boolean zMo5565F31 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str11 = value.f2950E;
        if (zMo5565F31 || str11 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 30, C11181o0.f33827a, str11);
        }
        boolean zMo5565F32 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str12 = value.f2951F;
        if (zMo5565F32 || str12 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 31, C11181o0.f33827a, str12);
        }
        boolean zMo5565F33 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        List list9 = value.f2952G;
        if (zMo5565F33 || list9 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 32, kSerializerArr[32], list9);
        }
        boolean zMo5565F34 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        List list10 = value.f2953H;
        if (zMo5565F34 || list10 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 33, kSerializerArr[33], list10);
        }
        boolean zMo5565F35 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        C1206z3 c1206z3 = value.f2954I;
        if (zMo5565F35 || c1206z3 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 34, C1194x3.f3150a, c1206z3);
        }
        boolean zMo5565F36 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        boolean z10 = value.f2955J;
        if (zMo5565F36 || z10) {
            interfaceC10429bMo5570c.mo5583q(pluginGeneratedSerialDescriptor, 35, z10);
        }
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
