package p148Fi;

import ao.AbstractC11153a0;
import ao.C11135I;
import ao.C11181o0;
import ao.InterfaceC11127C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import p1155zi.EnumC22033m2;
import p559Wn.C8981m;
import p594Y9.AbstractC9961r4;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;

/* JADX INFO: renamed from: Fi.j1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2832j1 implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C2832j1 f8568a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C2832j1 c2832j1 = new C2832j1();
        f8568a = c2832j1;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.voice.api.VoiceStatusRequest", c2832j1, 6);
        pluginGeneratedSerialDescriptor.m18453j("conversationId", true);
        pluginGeneratedSerialDescriptor.m18453j("gizmoId", false);
        pluginGeneratedSerialDescriptor.m18453j("nonce", false);
        pluginGeneratedSerialDescriptor.m18453j("requestedVoiceMode", false);
        pluginGeneratedSerialDescriptor.m18453j("timezoneOffsetMin", false);
        pluginGeneratedSerialDescriptor.m18453j("voice", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = C2838l1.f8577g;
        C11181o0 c11181o0 = C11181o0.f33827a;
        return new KSerializer[]{AbstractC9961r4.m10615b(c11181o0), AbstractC9961r4.m10615b(c11181o0), c11181o0, AbstractC9961r4.m10615b(kSerializerArr[3]), C11135I.f33763a, AbstractC9961r4.m10615b(c11181o0)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C2838l1.f8577g;
        String str = null;
        String str2 = null;
        String strMo5483q = null;
        EnumC22033m2 enumC22033m2 = null;
        String str3 = null;
        int i10 = 0;
        int iMo5478l = 0;
        boolean z6 = true;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            switch (iMo10914s) {
                case -1:
                    z6 = false;
                    break;
                case 0:
                    str = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 0, C11181o0.f33827a, str);
                    i10 |= 1;
                    break;
                case 1:
                    str2 = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 1, C11181o0.f33827a, str2);
                    i10 |= 2;
                    break;
                case 2:
                    strMo5483q = interfaceC10428aMo5471c.mo5483q(pluginGeneratedSerialDescriptor, 2);
                    i10 |= 4;
                    break;
                case 3:
                    enumC22033m2 = (EnumC22033m2) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 3, kSerializerArr[3], enumC22033m2);
                    i10 |= 8;
                    break;
                case 4:
                    iMo5478l = interfaceC10428aMo5471c.mo5478l(pluginGeneratedSerialDescriptor, 4);
                    i10 |= 16;
                    break;
                case 5:
                    str3 = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 5, C11181o0.f33827a, str3);
                    i10 |= 32;
                    break;
                default:
                    throw new C8981m(iMo10914s);
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C2838l1(i10, str, str2, strMo5483q, enumC22033m2, iMo5478l, str3);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C2838l1 value = (C2838l1) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        C2835k1 c2835k1 = C2838l1.Companion;
        boolean zMo5565F = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str = value.f8578a;
        if (zMo5565F || str != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 0, C11181o0.f33827a, str);
        }
        C11181o0 c11181o0 = C11181o0.f33827a;
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 1, c11181o0, value.f8579b);
        interfaceC10429bMo5570c.mo5584r(pluginGeneratedSerialDescriptor, 2, value.f8580c);
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 3, C2838l1.f8577g[3], value.f8581d);
        interfaceC10429bMo5570c.mo5579m(4, value.f8582e, pluginGeneratedSerialDescriptor);
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 5, c11181o0, value.f8583f);
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
