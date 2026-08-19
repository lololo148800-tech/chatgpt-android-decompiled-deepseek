package p041Be;

import android.gov.nist.javax.sip.header.ParameterNames;
import ao.AbstractC11153a0;
import ao.C11135I;
import ao.C11181o0;
import ao.InterfaceC11127C;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
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
import p1155zi.C22003f0;
import p1155zi.C22011h0;
import p324Mn.C5551u;
import p463Sn.C7156i;
import p559Wn.C8981m;
import p594Y9.AbstractC9961r4;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;

/* JADX INFO: renamed from: Be.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C1239k implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C1239k f3264a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C1239k c1239k = new C1239k();
        f3264a = c1239k;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.tangled.impl.api.conversation.ConversationListResponseItem", c1239k, 10);
        pluginGeneratedSerialDescriptor.m18453j(ParameterNames.f31999ID, false);
        pluginGeneratedSerialDescriptor.m18453j(UiComponentConfig.Title.type, false);
        pluginGeneratedSerialDescriptor.m18453j("currentNode", false);
        pluginGeneratedSerialDescriptor.m18453j("conversationTemplateId", true);
        pluginGeneratedSerialDescriptor.m18453j("createTime", false);
        pluginGeneratedSerialDescriptor.m18453j("updateTime", false);
        pluginGeneratedSerialDescriptor.m18453j("mapping", false);
        pluginGeneratedSerialDescriptor.m18453j("asyncStatus", true);
        pluginGeneratedSerialDescriptor.m18453j("snippet", true);
        pluginGeneratedSerialDescriptor.m18453j("gizmoType", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = C1241m.f3265k;
        C11181o0 c11181o0 = C11181o0.f33827a;
        KSerializer kSerializerM10615b = AbstractC9961r4.m10615b(C21977Y0.f69577a);
        KSerializer kSerializerM10615b2 = AbstractC9961r4.m10615b(C21928J0.f69475a);
        KSerializer kSerializerM10615b3 = AbstractC9961r4.m10615b(kSerializerArr[6]);
        KSerializer kSerializerM10615b4 = AbstractC9961r4.m10615b(C11135I.f33763a);
        KSerializer kSerializerM10615b5 = AbstractC9961r4.m10615b(c11181o0);
        KSerializer kSerializerM10615b6 = AbstractC9961r4.m10615b(c11181o0);
        C7156i c7156i = C7156i.f22754a;
        return new KSerializer[]{C22003f0.f69641a, c11181o0, kSerializerM10615b, kSerializerM10615b2, c7156i, c7156i, kSerializerM10615b3, kSerializerM10615b4, kSerializerM10615b5, kSerializerM10615b6};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C1241m.f3265k;
        String str = null;
        String str2 = null;
        boolean z6 = true;
        Integer num = null;
        int i10 = 0;
        String str3 = null;
        String strMo5483q = null;
        String str4 = null;
        String str5 = null;
        C5551u c5551u = null;
        C5551u c5551u2 = null;
        Map map = null;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            switch (iMo10914s) {
                case -1:
                    z6 = false;
                    continue;
                case 0:
                    C22011h0 c22011h0 = (C22011h0) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 0, C22003f0.f69641a, str3 != null ? new C22011h0(str3) : null);
                    i10 |= 1;
                    str3 = c22011h0 != null ? c22011h0.f69652a : null;
                    break;
                case 1:
                    strMo5483q = interfaceC10428aMo5471c.mo5483q(pluginGeneratedSerialDescriptor, 1);
                    i10 |= 2;
                    continue;
                case 2:
                    C21984a1 c21984a1 = (C21984a1) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 2, C21977Y0.f69577a, str4 != null ? new C21984a1(str4) : null);
                    str4 = c21984a1 != null ? c21984a1.f69607Y : null;
                    i10 |= 4;
                    break;
                case 3:
                    C21936L0 c21936l0 = (C21936L0) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 3, C21928J0.f69475a, str5 != null ? new C21936L0(str5) : null);
                    str5 = c21936l0 != null ? c21936l0.f69488a : null;
                    i10 |= 8;
                    break;
                case 4:
                    c5551u = (C5551u) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 4, C7156i.f22754a, c5551u);
                    i10 |= 16;
                    break;
                case 5:
                    c5551u2 = (C5551u) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 5, C7156i.f22754a, c5551u2);
                    i10 |= 32;
                    break;
                case 6:
                    map = (Map) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 6, kSerializerArr[6], map);
                    i10 |= 64;
                    break;
                case 7:
                    num = (Integer) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 7, C11135I.f33763a, num);
                    i10 |= 128;
                    break;
                case 8:
                    str2 = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 8, C11181o0.f33827a, str2);
                    i10 |= 256;
                    break;
                case 9:
                    str = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 9, C11181o0.f33827a, str);
                    i10 |= 512;
                    break;
                default:
                    throw new C8981m(iMo10914s);
            }
            z6 = z6;
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C1241m(i10, str3, strMo5483q, str4, str5, c5551u, c5551u2, map, num, str2, str);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C1241m value = (C1241m) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        C1240l c1240l = C1241m.Companion;
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 0, C22003f0.f69641a, new C22011h0(value.f3266a));
        interfaceC10429bMo5570c.mo5584r(pluginGeneratedSerialDescriptor, 1, value.f3267b);
        C21977Y0 c21977y0 = C21977Y0.f69577a;
        String str = value.f3268c;
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 2, c21977y0, str != null ? new C21984a1(str) : null);
        boolean zMo5565F = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str2 = value.f3269d;
        if (zMo5565F || str2 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 3, C21928J0.f69475a, str2 != null ? new C21936L0(str2) : null);
        }
        C7156i c7156i = C7156i.f22754a;
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 4, c7156i, value.f3270e);
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 5, c7156i, value.f3271f);
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 6, C1241m.f3265k[6], value.f3272g);
        boolean zMo5565F2 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        Integer num = value.f3273h;
        if (zMo5565F2 || num != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 7, C11135I.f33763a, num);
        }
        boolean zMo5565F3 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str3 = value.f3274i;
        if (zMo5565F3 || str3 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 8, C11181o0.f33827a, str3);
        }
        boolean zMo5565F4 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str4 = value.f3275j;
        if (zMo5565F4 || str4 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 9, C11181o0.f33827a, str4);
        }
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
