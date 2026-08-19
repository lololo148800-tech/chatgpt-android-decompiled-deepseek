package p1126yd;

import ao.AbstractC11153a0;
import ao.C11164g;
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

/* JADX INFO: renamed from: yd.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C21456a implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C21456a f68046a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C21456a c21456a = new C21456a();
        f68046a = c21456a;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.api.conversation.ApiSharedConversationResponse", c21456a, 11);
        pluginGeneratedSerialDescriptor.m18453j("authorName", false);
        pluginGeneratedSerialDescriptor.m18453j("hasUserEditableContext", false);
        pluginGeneratedSerialDescriptor.m18453j(UiComponentConfig.Title.type, false);
        pluginGeneratedSerialDescriptor.m18453j("currentNode", false);
        pluginGeneratedSerialDescriptor.m18453j("createTime", false);
        pluginGeneratedSerialDescriptor.m18453j("updateTime", false);
        pluginGeneratedSerialDescriptor.m18453j("mapping", false);
        pluginGeneratedSerialDescriptor.m18453j("moderationResults", true);
        pluginGeneratedSerialDescriptor.m18453j("pluginIds", true);
        pluginGeneratedSerialDescriptor.m18453j("conversationTemplateId", true);
        pluginGeneratedSerialDescriptor.m18453j("gizmoType", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = C21462c.f68050l;
        C11181o0 c11181o0 = C11181o0.f33827a;
        KSerializer kSerializerM10615b = AbstractC9961r4.m10615b(c11181o0);
        KSerializer kSerializerM10615b2 = AbstractC9961r4.m10615b(C11164g.f33804a);
        KSerializer kSerializerM10615b3 = AbstractC9961r4.m10615b(c11181o0);
        KSerializer kSerializer = kSerializerArr[6];
        KSerializer kSerializer2 = kSerializerArr[7];
        KSerializer kSerializerM10615b4 = AbstractC9961r4.m10615b(kSerializerArr[8]);
        KSerializer kSerializerM10615b5 = AbstractC9961r4.m10615b(C21928J0.f69475a);
        KSerializer kSerializerM10615b6 = AbstractC9961r4.m10615b(c11181o0);
        C7470a c7470a = C7470a.f23726a;
        return new KSerializer[]{kSerializerM10615b, kSerializerM10615b2, kSerializerM10615b3, C21977Y0.f69577a, c7470a, c7470a, kSerializer, kSerializer2, kSerializerM10615b4, kSerializerM10615b5, kSerializerM10615b6};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C21462c.f68050l;
        String str = null;
        String str2 = null;
        List list = null;
        boolean z6 = true;
        List list2 = null;
        int i10 = 0;
        String str3 = null;
        Boolean bool = null;
        String str4 = null;
        String str5 = null;
        C5551u c5551u = null;
        C5551u c5551u2 = null;
        Map map = null;
        while (z6) {
            boolean z10 = z6;
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            switch (iMo10914s) {
                case -1:
                    z6 = false;
                    str3 = str3;
                    kSerializerArr = kSerializerArr;
                    continue;
                case 0:
                    i10 |= 1;
                    str3 = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 0, C11181o0.f33827a, str3);
                    kSerializerArr = kSerializerArr;
                    z6 = z10;
                    continue;
                case 1:
                    bool = (Boolean) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 1, C11164g.f33804a, bool);
                    i10 |= 2;
                    break;
                case 2:
                    str4 = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 2, C11181o0.f33827a, str4);
                    i10 |= 4;
                    break;
                case 3:
                    C21984a1 c21984a1 = (C21984a1) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 3, C21977Y0.f69577a, str5 != null ? new C21984a1(str5) : null);
                    str5 = c21984a1 != null ? c21984a1.f69607Y : null;
                    i10 |= 8;
                    break;
                case 4:
                    c5551u = (C5551u) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 4, C7470a.f23726a, c5551u);
                    i10 |= 16;
                    break;
                case 5:
                    c5551u2 = (C5551u) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 5, C7470a.f23726a, c5551u2);
                    i10 |= 32;
                    break;
                case 6:
                    map = (Map) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 6, kSerializerArr[6], map);
                    i10 |= 64;
                    break;
                case 7:
                    list2 = (List) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 7, kSerializerArr[7], list2);
                    i10 |= 128;
                    break;
                case 8:
                    list = (List) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 8, kSerializerArr[8], list);
                    i10 |= 256;
                    break;
                case 9:
                    C21936L0 c21936l0 = (C21936L0) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 9, C21928J0.f69475a, str2 != null ? new C21936L0(str2) : null);
                    str2 = c21936l0 != null ? c21936l0.f69488a : null;
                    i10 |= 512;
                    break;
                case 10:
                    str = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 10, C11181o0.f33827a, str);
                    i10 |= 1024;
                    break;
                default:
                    throw new C8981m(iMo10914s);
            }
            z6 = z10;
            str3 = str3;
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C21462c(i10, str3, bool, str4, str5, c5551u, c5551u2, map, list2, list, str2, str);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C21462c value = (C21462c) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        C21459b c21459b = C21462c.Companion;
        C11181o0 c11181o0 = C11181o0.f33827a;
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 0, c11181o0, value.f68051a);
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 1, C11164g.f33804a, value.f68052b);
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 2, c11181o0, value.f68053c);
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 3, C21977Y0.f69577a, new C21984a1(value.f68054d));
        C7470a c7470a = C7470a.f23726a;
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 4, c7470a, value.f68055e);
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 5, c7470a, value.f68056f);
        KSerializer[] kSerializerArr = C21462c.f68050l;
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 6, kSerializerArr[6], value.f68057g);
        boolean zMo5565F = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        List list = value.f68058h;
        if (zMo5565F || !AbstractC16544l.m18089b(list, C17689w.f56480Y)) {
            interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 7, kSerializerArr[7], list);
        }
        boolean zMo5565F2 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        List list2 = value.f68059i;
        if (zMo5565F2 || list2 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 8, kSerializerArr[8], list2);
        }
        boolean zMo5565F3 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str = value.f68060j;
        if (zMo5565F3 || str != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 9, C21928J0.f69475a, str != null ? new C21936L0(str) : null);
        }
        boolean zMo5565F4 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str2 = value.f68061k;
        if (zMo5565F4 || str2 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 10, c11181o0, str2);
        }
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
