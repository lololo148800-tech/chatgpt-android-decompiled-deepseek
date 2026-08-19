package p1126yd;

import ao.AbstractC11153a0;
import ao.C11135I;
import ao.C11181o0;
import ao.InterfaceC11127C;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import p1155zi.C21928J0;
import p1155zi.C21936L0;
import p1155zi.C21977Y0;
import p1155zi.C21984a1;
import p324Mn.C5551u;
import p483Th.C7470a;
import p559Wn.C8981m;
import p594Y9.AbstractC9961r4;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;
import p909nm.C17689w;

/* JADX INFO: renamed from: yd.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C21484m implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C21484m f68084a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C21484m c21484m = new C21484m();
        f68084a = c21484m;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.api.conversation.ConversationResponse", c21484m, 13);
        pluginGeneratedSerialDescriptor.m18453j(UiComponentConfig.Title.type, false);
        pluginGeneratedSerialDescriptor.m18453j("currentNode", false);
        pluginGeneratedSerialDescriptor.m18453j("createTime", false);
        pluginGeneratedSerialDescriptor.m18453j("updateTime", false);
        pluginGeneratedSerialDescriptor.m18453j("defaultModelSlug", true);
        pluginGeneratedSerialDescriptor.m18453j("voice", true);
        pluginGeneratedSerialDescriptor.m18453j("mapping", false);
        pluginGeneratedSerialDescriptor.m18453j("safeUrls", true);
        pluginGeneratedSerialDescriptor.m18453j("moderationResults", true);
        pluginGeneratedSerialDescriptor.m18453j("pluginIds", true);
        pluginGeneratedSerialDescriptor.m18453j("conversationTemplateId", true);
        pluginGeneratedSerialDescriptor.m18453j("asyncStatus", true);
        pluginGeneratedSerialDescriptor.m18453j("gizmoType", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = C21488o.f68086n;
        C11181o0 c11181o0 = C11181o0.f33827a;
        KSerializer kSerializerM10615b = AbstractC9961r4.m10615b(c11181o0);
        KSerializer kSerializerM10615b2 = AbstractC9961r4.m10615b(c11181o0);
        KSerializer kSerializerM10615b3 = AbstractC9961r4.m10615b(c11181o0);
        KSerializer kSerializer = kSerializerArr[6];
        KSerializer kSerializerM10615b4 = AbstractC9961r4.m10615b(kSerializerArr[7]);
        KSerializer kSerializer2 = kSerializerArr[8];
        KSerializer kSerializerM10615b5 = AbstractC9961r4.m10615b(kSerializerArr[9]);
        KSerializer kSerializerM10615b6 = AbstractC9961r4.m10615b(C21928J0.f69475a);
        KSerializer kSerializerM10615b7 = AbstractC9961r4.m10615b(C11135I.f33763a);
        KSerializer kSerializerM10615b8 = AbstractC9961r4.m10615b(c11181o0);
        C7470a c7470a = C7470a.f23726a;
        return new KSerializer[]{kSerializerM10615b, C21977Y0.f69577a, c7470a, c7470a, kSerializerM10615b2, kSerializerM10615b3, kSerializer, kSerializerM10615b4, kSerializer2, kSerializerM10615b5, kSerializerM10615b6, kSerializerM10615b7, kSerializerM10615b8};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        int i10;
        C21984a1 c21984a1;
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C21488o.f68086n;
        String str = null;
        List list = null;
        List list2 = null;
        boolean z6 = true;
        List list3 = null;
        int i11 = 0;
        Integer num = null;
        String str2 = null;
        C5551u c5551u = null;
        C5551u c5551u2 = null;
        String str3 = null;
        String str4 = null;
        Map map = null;
        String str5 = null;
        String str6 = null;
        while (z6) {
            boolean z10 = z6;
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            switch (iMo10914s) {
                case -1:
                    kSerializerArr = kSerializerArr;
                    str2 = str2;
                    z6 = false;
                    num = num;
                    str2 = str2;
                    kSerializerArr = kSerializerArr;
                    break;
                case 0:
                    str2 = str2;
                    str5 = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 0, C11181o0.f33827a, str5);
                    i11 |= 1;
                    c5551u = c5551u;
                    num = num;
                    z6 = z10;
                    str2 = str2;
                    kSerializerArr = kSerializerArr;
                    break;
                case 1:
                    C5551u c5551u3 = c5551u;
                    C21977Y0 c21977y0 = C21977Y0.f69577a;
                    if (str6 != null) {
                        c21984a1 = new C21984a1(str6);
                        i10 = 1;
                    } else {
                        i10 = 1;
                        c21984a1 = null;
                    }
                    C21984a1 c21984a2 = (C21984a1) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, i10, c21977y0, c21984a1);
                    str6 = c21984a2 != null ? c21984a2.f69607Y : null;
                    i11 |= 2;
                    c5551u = c5551u3;
                    z6 = z10;
                    str2 = str2;
                    kSerializerArr = kSerializerArr;
                    break;
                case 2:
                    kSerializerArr = kSerializerArr;
                    c5551u = (C5551u) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 2, C7470a.f23726a, c5551u);
                    i11 |= 4;
                    z6 = z10;
                    kSerializerArr = kSerializerArr;
                    break;
                case 3:
                    c5551u2 = (C5551u) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 3, C7470a.f23726a, c5551u2);
                    i11 |= 8;
                    z6 = z10;
                    c5551u = c5551u;
                    break;
                case 4:
                    str3 = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 4, C11181o0.f33827a, str3);
                    i11 |= 16;
                    z6 = z10;
                    c5551u = c5551u;
                    break;
                case 5:
                    str4 = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 5, C11181o0.f33827a, str4);
                    i11 |= 32;
                    z6 = z10;
                    c5551u = c5551u;
                    break;
                case 6:
                    map = (Map) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 6, kSerializerArr[6], map);
                    i11 |= 64;
                    z6 = z10;
                    c5551u = c5551u;
                    break;
                case 7:
                    list3 = (List) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 7, kSerializerArr[7], list3);
                    i11 |= 128;
                    z6 = z10;
                    c5551u = c5551u;
                    break;
                case 8:
                    list2 = (List) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 8, kSerializerArr[8], list2);
                    i11 |= 256;
                    z6 = z10;
                    c5551u = c5551u;
                    break;
                case 9:
                    list = (List) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 9, kSerializerArr[9], list);
                    i11 |= 512;
                    z6 = z10;
                    c5551u = c5551u;
                    break;
                case 10:
                    C21936L0 c21936l0 = (C21936L0) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 10, C21928J0.f69475a, str != null ? new C21936L0(str) : null);
                    str = c21936l0 != null ? c21936l0.f69488a : null;
                    i11 |= 1024;
                    z6 = z10;
                    c5551u = c5551u;
                    break;
                case 11:
                    num = (Integer) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 11, C11135I.f33763a, num);
                    i11 |= 2048;
                    z6 = z10;
                    c5551u = c5551u;
                    break;
                case 12:
                    str2 = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 12, C11181o0.f33827a, str2);
                    i11 |= 4096;
                    z6 = z10;
                    c5551u = c5551u;
                    break;
                default:
                    throw new C8981m(iMo10914s);
            }
        }
        Integer num2 = num;
        String str7 = str2;
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C21488o(i11, str5, str6, c5551u, c5551u2, str3, str4, map, list3, list2, list, str, num2, str7);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C21488o value = (C21488o) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        C21486n c21486n = C21488o.Companion;
        C11181o0 c11181o0 = C11181o0.f33827a;
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 0, c11181o0, value.f68087a);
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 1, C21977Y0.f69577a, new C21984a1(value.f68088b));
        C7470a c7470a = C7470a.f23726a;
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 2, c7470a, value.f68089c);
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 3, c7470a, value.f68090d);
        boolean zMo5565F = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str = value.f68091e;
        if (zMo5565F || str != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 4, c11181o0, str);
        }
        boolean zMo5565F2 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str2 = value.f68092f;
        if (zMo5565F2 || str2 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 5, c11181o0, str2);
        }
        KSerializer[] kSerializerArr = C21488o.f68086n;
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 6, kSerializerArr[6], value.f68093g);
        boolean zMo5565F3 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        C17689w c17689w = C17689w.f56480Y;
        List list = value.f68094h;
        if (zMo5565F3 || !AbstractC16544l.m18089b(list, c17689w)) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 7, kSerializerArr[7], list);
        }
        boolean zMo5565F4 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        List list2 = value.f68095i;
        if (zMo5565F4 || !AbstractC16544l.m18089b(list2, c17689w)) {
            interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 8, kSerializerArr[8], list2);
        }
        boolean zMo5565F5 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        List list3 = value.f68096j;
        if (zMo5565F5 || list3 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 9, kSerializerArr[9], list3);
        }
        boolean zMo5565F6 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str3 = value.f68097k;
        if (zMo5565F6 || str3 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 10, C21928J0.f69475a, str3 != null ? new C21936L0(str3) : null);
        }
        boolean zMo5565F7 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        Integer num = value.f68098l;
        if (zMo5565F7 || num != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 11, C11135I.f33763a, num);
        }
        boolean zMo5565F8 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str4 = value.f68099m;
        if (zMo5565F8 || str4 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 12, c11181o0, str4);
        }
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
