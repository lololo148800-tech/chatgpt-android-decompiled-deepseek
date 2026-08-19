package p040Bd;

import ao.AbstractC11153a0;
import ao.C11135I;
import ao.C11164g;
import ao.C11181o0;
import ao.InterfaceC11127C;
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
import p909nm.C17689w;

/* JADX INFO: renamed from: Bd.A1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0889A1 implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C0889A1 f2613a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C0889A1 c0889a1 = new C0889A1();
        f2613a = c0889a1;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.api.message.ApiContentReference.Tldr", c0889a1, 7);
        pluginGeneratedSerialDescriptor.m18453j("startIdx", false);
        pluginGeneratedSerialDescriptor.m18453j("endIdx", false);
        pluginGeneratedSerialDescriptor.m18453j("displayTitle", false);
        pluginGeneratedSerialDescriptor.m18453j("url", true);
        pluginGeneratedSerialDescriptor.m18453j("breadcrumbs", true);
        pluginGeneratedSerialDescriptor.m18453j("usedAsNavigation", true);
        pluginGeneratedSerialDescriptor.m18453j("type", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = C0901C1.f2627h;
        C11135I c11135i = C11135I.f33763a;
        KSerializer kSerializerM10615b = AbstractC9961r4.m10615b(c11135i);
        KSerializer kSerializerM10615b2 = AbstractC9961r4.m10615b(c11135i);
        C11181o0 c11181o0 = C11181o0.f33827a;
        return new KSerializer[]{kSerializerM10615b, kSerializerM10615b2, c11181o0, AbstractC9961r4.m10615b(c11181o0), kSerializerArr[4], AbstractC9961r4.m10615b(C11164g.f33804a), c11181o0};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C0901C1.f2627h;
        int i10 = 0;
        Integer num = null;
        Integer num2 = null;
        String strMo5483q = null;
        String str = null;
        List list = null;
        Boolean bool = null;
        String strMo5483q2 = null;
        boolean z6 = true;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            switch (iMo10914s) {
                case -1:
                    z6 = false;
                    break;
                case 0:
                    num = (Integer) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 0, C11135I.f33763a, num);
                    i10 |= 1;
                    break;
                case 1:
                    num2 = (Integer) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 1, C11135I.f33763a, num2);
                    i10 |= 2;
                    break;
                case 2:
                    strMo5483q = interfaceC10428aMo5471c.mo5483q(pluginGeneratedSerialDescriptor, 2);
                    i10 |= 4;
                    break;
                case 3:
                    str = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 3, C11181o0.f33827a, str);
                    i10 |= 8;
                    break;
                case 4:
                    list = (List) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 4, kSerializerArr[4], list);
                    i10 |= 16;
                    break;
                case 5:
                    bool = (Boolean) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 5, C11164g.f33804a, bool);
                    i10 |= 32;
                    break;
                case 6:
                    strMo5483q2 = interfaceC10428aMo5471c.mo5483q(pluginGeneratedSerialDescriptor, 6);
                    i10 |= 64;
                    break;
                default:
                    throw new C8981m(iMo10914s);
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C0901C1(i10, num, num2, strMo5483q, str, list, bool, strMo5483q2);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C0901C1 value = (C0901C1) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        C0895B1 c0895b1 = C0901C1.Companion;
        C11135I c11135i = C11135I.f33763a;
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 0, c11135i, value.f2628a);
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 1, c11135i, value.f2629b);
        interfaceC10429bMo5570c.mo5584r(pluginGeneratedSerialDescriptor, 2, value.f2630c);
        boolean zMo5565F = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str = value.f2631d;
        if (zMo5565F || str != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 3, C11181o0.f33827a, str);
        }
        boolean zMo5565F2 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        List list = value.f2632e;
        if (zMo5565F2 || !AbstractC16544l.m18089b(list, C17689w.f56480Y)) {
            interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 4, C0901C1.f2627h[4], list);
        }
        boolean zMo5565F3 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        Boolean bool = value.f2633f;
        if (zMo5565F3 || bool != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 5, C11164g.f33804a, bool);
        }
        boolean zMo5565F4 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str2 = value.f2634g;
        if (zMo5565F4 || !AbstractC16544l.m18089b(str2, "tldr")) {
            interfaceC10429bMo5570c.mo5584r(pluginGeneratedSerialDescriptor, 6, str2);
        }
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
