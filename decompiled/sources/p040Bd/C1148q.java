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

/* JADX INFO: renamed from: Bd.q */
/* JADX INFO: loaded from: classes3.dex */
public final class C1148q implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C1148q f3070a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C1148q c1148q = new C1148q();
        f3070a = c1148q;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.api.message.ApiContentReference.BusinessesMap", c1148q, 6);
        pluginGeneratedSerialDescriptor.m18453j("startIdx", false);
        pluginGeneratedSerialDescriptor.m18453j("endIdx", false);
        pluginGeneratedSerialDescriptor.m18453j("businesses", false);
        pluginGeneratedSerialDescriptor.m18453j("renderFallbacks", true);
        pluginGeneratedSerialDescriptor.m18453j("businessFallbacks", true);
        pluginGeneratedSerialDescriptor.m18453j("type", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = C0893B.f2617g;
        C11135I c11135i = C11135I.f33763a;
        return new KSerializer[]{AbstractC9961r4.m10615b(c11135i), AbstractC9961r4.m10615b(c11135i), kSerializerArr[2], AbstractC9961r4.m10615b(C11164g.f33804a), AbstractC9961r4.m10615b(kSerializerArr[4]), C11181o0.f33827a};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C0893B.f2617g;
        int i10 = 0;
        Integer num = null;
        Integer num2 = null;
        List list = null;
        Boolean bool = null;
        List list2 = null;
        String strMo5483q = null;
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
                    list = (List) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 2, kSerializerArr[2], list);
                    i10 |= 4;
                    break;
                case 3:
                    bool = (Boolean) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 3, C11164g.f33804a, bool);
                    i10 |= 8;
                    break;
                case 4:
                    list2 = (List) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 4, kSerializerArr[4], list2);
                    i10 |= 16;
                    break;
                case 5:
                    strMo5483q = interfaceC10428aMo5471c.mo5483q(pluginGeneratedSerialDescriptor, 5);
                    i10 |= 32;
                    break;
                default:
                    throw new C8981m(iMo10914s);
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C0893B(i10, num, num2, list, bool, list2, strMo5483q);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C0893B value = (C0893B) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        C1190x c1190x = C0893B.Companion;
        C11135I c11135i = C11135I.f33763a;
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 0, c11135i, value.f2618a);
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 1, c11135i, value.f2619b);
        KSerializer[] kSerializerArr = C0893B.f2617g;
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 2, kSerializerArr[2], value.f2620c);
        boolean zMo5565F = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        Boolean bool = value.f2621d;
        if (zMo5565F || bool != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 3, C11164g.f33804a, bool);
        }
        boolean zMo5565F2 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        List list = value.f2622e;
        if (zMo5565F2 || list != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 4, kSerializerArr[4], list);
        }
        boolean zMo5565F3 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str = value.f2623f;
        if (zMo5565F3 || !AbstractC16544l.m18089b(str, "businesses_map")) {
            interfaceC10429bMo5570c.mo5584r(pluginGeneratedSerialDescriptor, 5, str);
        }
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
